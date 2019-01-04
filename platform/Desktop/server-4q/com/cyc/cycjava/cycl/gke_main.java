package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gke_main extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gke_main";
    public static final String myFingerPrint = "2ec39b83b811911189c1481d304fe675d62a14ea245c7ef56fb9b8310d88b583";
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12170L)
    private static SubLSymbol $gke_isas_filtered_term_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12457L)
    private static SubLSymbol $gke_overly_general_non_predicate_types$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12936L)
    private static SubLSymbol $gke_filtered_termP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 13311L)
    private static SubLSymbol $gke_overly_general_predicate_types$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 13638L)
    private static SubLSymbol $gke_predicate_filteredP_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 16188L)
    public static SubLSymbol $use_rbp_wff_in_gkeP$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 45090L)
    private static SubLSymbol $gke_memoization_state_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 47570L)
    private static SubLSymbol $generate_gke_gloss_wrt_mt_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50876L)
    private static SubLSymbol $candidate_replacements_for_sentence_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53310L)
    private static SubLSymbol $gke_get_elements_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55614L)
    private static SubLSymbol $omit_suggestion_stumpsP$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLSymbol $dtp_replacement_tree$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 66309L)
    private static SubLSymbol $use_tva_for_suggestionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 67353L)
    public static SubLSymbol $default_patience_wait_time$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 67545L)
    public static SubLSymbol $gke_query_threads$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 74768L)
    private static SubLSymbol $daemon_should_run_inference_statuses$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 75319L)
    private static SubLSymbol $gke_run_inference_with_adjusted_dynamic_propertiesP$;
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 77538L)
    private static SubLSymbol $inference_done_statuses$;
    private static final SubLSymbol $sym0$GET_GKE_ARG_OPTIONS;
    private static final SubLString $str1$Got_unknown_arg_type_for___A__;
    private static final SubLSymbol $kw2$PARENTS;
    private static final SubLString $str3$Natural_language_processing_has_d;
    private static final SubLSymbol $kw4$CHILDREN;
    private static final SubLSymbol $kw5$SIBLINGS;
    private static final SubLSymbol $sym6$GET_GKE_EXPANDED_ITEMS;
    private static final SubLSymbol $kw7$ANY;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$GET_GKE_QUANTIFIER_RANGES;
    private static final SubLString $str11$Get_the_quantifier_ranges;
    private static final SubLSymbol $sym12$STRING_LESSP;
    private static final SubLSymbol $sym13$NULL;
    private static final SubLSymbol $sym14$NART_SUBSTITUTE;
    private static final SubLInteger $int15$200;
    private static final SubLSymbol $kw16$NEW;
    private static final SubLSymbol $sym17$GKE_LIST_ITEM_COMPARATOR;
    private static final SubLInteger $int18$175;
    private static final SubLSymbol $sym19$GKE_FILTERED_TERM_;
    private static final SubLSymbol $sym20$RKF_MAX_SPECS;
    private static final SubLSymbol $sym21$RKF_INSTANTIATIONS;
    private static final SubLObject $const22$Collection;
    private static final SubLSymbol $sym23$GKE_ISAS_FILTERED_TERM;
    private static final SubLSymbol $sym24$ALL_GENLS;
    private static final SubLSymbol $sym25$RKF_ALL_GENLS;
    private static final SubLSymbol $sym26$_GKE_ISAS_FILTERED_TERM_CACHING_STATE_;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$_GKE_FILTERED_TERM__CACHING_STATE_;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$GKE_PREDICATE_FILTERED_;
    private static final SubLSymbol $kw31$TRUE;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$_GKE_PREDICATE_FILTERED__CACHING_STATE_;
    private static final SubLSymbol $sym34$LISTP;
    private static final SubLSymbol $sym35$TREE_POSITION_P;
    private static final SubLSymbol $sym36$CYCL_FORMULA_;
    private static final SubLSymbol $sym37$HLMT_P;
    private static final SubLString $str38$OPERATOR_TERMS_PASS_CONSTRAINTS_r;
    private static final SubLString $str39$OPERATOR_TERMS_PASS_CONSTRAINTS_r;
    private static final SubLSymbol $sym40$GET_GKE_NAUT_ARG_POSITION;
    private static final SubLSymbol $sym41$GET_GKE_IS_KNOWN;
    private static final SubLSymbol $kw42$HTML;
    private static final SubLObject $const43$GenericIntelligenceAnalysis_CAE_A;
    private static final SubLSymbol $kw44$TEXT;
    private static final SubLObject $const45$GenericMedicalResearchTask_Allotm;
    private static final SubLSymbol $kw46$UNKNOWN;
    private static final SubLSymbol $kw47$DEFAULT;
    private static final SubLSymbol $kw48$DECLARATIVE;
    private static final SubLSymbol $kw49$NONE;
    private static final SubLString $str50$Show_all_values_of_;
    private static final SubLString $str51$_such_that__;
    private static final SubLString $str52$Is_it_true_that__;
    private static final SubLObject $const53$TheCoordinationSet;
    private static final SubLSymbol $sym54$PPH_ANCHOR_TAGS_FOR_TERM;
    private static final SubLObject $const55$thereExists;
    private static final SubLList $list56;
    private static final SubLSymbol $kw57$NOR;
    private static final SubLSymbol $kw58$IGNORE;
    private static final SubLObject $const59$and;
    private static final SubLSymbol $kw60$AND;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLObject $const63$or;
    private static final SubLSymbol $kw64$NOT;
    private static final SubLSymbol $kw65$OR;
    private static final SubLString $str66$All_of_the_following_are_true;
    private static final SubLString $str67$At_least_one_of_the_following_is_;
    private static final SubLString $str68$None_of_the_following_is_true;
    private static final SubLSymbol $sym69$GKE_ADD_CLONED_LITERAL;
    private static final SubLList $list70;
    private static final SubLString $str71$_S_must_be_one_of__S;
    private static final SubLSymbol $kw72$ERROR;
    private static final SubLSymbol $sym73$GKE_REMOVE_LITERAL;
    private static final SubLString $str74$GKEReformulationRuleHoldingMt;
    private static final SubLSymbol $sym75$EL_SENTENCE_P;
    private static final SubLSymbol $kw76$LOOSEN;
    private static final SubLSymbol $kw77$STRENGTHEN;
    private static final SubLString $str78$useReformulationRuleForGuidedKnow;
    private static final SubLSymbol $kw79$META_PREDICATES;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$POSSIBLE_SENTENCE_SUBSTITUTIONS;
    private static final SubLObject $const83$EnglishMt;
    private static final SubLObject $const84$nonPlural_Generic;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$STRINGP;
    private static final SubLObject $const87$Thing;
    private static final SubLSymbol $sym88$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym89$SUBSTITUTE_TERM_INTO_SENTENCE;
    private static final SubLSymbol $sym90$NART_P;
    private static final SubLSymbol $sym91$NART_EL_FORMULA;
    private static final SubLString $str92$_S_does_not_have_arg_position__S;
    private static final SubLSymbol $sym93$EL_FORMULA_P;
    private static final SubLObject $const94$isa;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$EL_VAR_;
    private static final SubLSymbol $sym97$EL_VAR_NAME;
    private static final SubLObject $const98$Individual;
    private static final SubLObject $const99$TheSet;
    private static final SubLSymbol $kw100$EL_VARIABLE;
    private static final SubLObject $const101$equals;
    private static final SubLSymbol $sym102$GKE_MEMOIZATION_STATE;
    private static final SubLString $str103$GKE_Memoization_State;
    private static final SubLSymbol $sym104$_GKE_MEMOIZATION_STATE_CACHING_STATE_;
    private static final SubLSymbol $sym105$CLEAR_GKE_MEMOIZATION_STATE;
    private static final SubLSymbol $sym106$GKE_GLOSS_FOR_LITERAL;
    private static final SubLSymbol $sym107$ATOMIC_SENTENCE_;
    private static final SubLSymbol $sym108$RELEVANT_MT_IS_EQ;
    private static final SubLObject $const109$gkeGlossWrtDomainMt;
    private static final SubLSymbol $kw110$GAF;
    private static final SubLSymbol $sym111$GENERATE_GKE_GLOSS_WRT_MT_CACHED;
    private static final SubLSymbol $sym112$_GENERATE_GKE_GLOSS_WRT_MT_CACHED_CACHING_STATE_;
    private static final SubLInteger $int113$256;
    private static final SubLSymbol $sym114$CANDIDATE_REPLACEMENT_RENDERERS_FOR_SENTENCE;
    private static final SubLList $list115;
    private static final SubLSymbol $kw116$NOT_FOUND;
    private static final SubLSymbol $sym117$CANDIDATE_REPLACEMENTS_FOR_VARIABLES;
    private static final SubLSymbol $sym118$CANDIDATE_REPLACEMENTS_FOR_ARG;
    private static final SubLSymbol $sym119$CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED;
    private static final SubLList $list120;
    private static final SubLList $list121;
    private static final SubLList $list122;
    private static final SubLObject $const123$suggestionsForPredRelativeToIsaIn;
    private static final SubLList $list124;
    private static final SubLObject $const125$suggestionsForPredRelativeToGenls;
    private static final SubLSymbol $sym126$_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED_CACHING_STATE_;
    private static final SubLInteger $int127$2048;
    private static final SubLSymbol $sym128$CLEAR_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED;
    private static final SubLSymbol $sym129$INTERSECTION;
    private static final SubLSymbol $sym130$UNION;
    private static final SubLSymbol $sym131$GKE_GET_ELEMENTS;
    private static final SubLSymbol $sym132$HL_PROTOTYPICAL_INSTANCE_;
    private static final SubLSymbol $sym133$_X;
    private static final SubLObject $const134$elementOf;
    private static final SubLSymbol $sym135$_GKE_GET_ELEMENTS_CACHING_STATE_;
    private static final SubLSymbol $sym136$CLEAR_GKE_GET_ELEMENTS;
    private static final SubLSymbol $sym137$NEW_REPLACEMENT_TREE;
    private static final SubLList $list138;
    private static final SubLString $str139$__Conflating__S_to__S_____;
    private static final SubLSymbol $sym140$_OMIT_SUGGESTION_STUMPS__;
    private static final SubLSymbol $sym141$REPLACEMENT_TREE;
    private static final SubLSymbol $sym142$REPLACEMENT_TREE_P;
    private static final SubLList $list143;
    private static final SubLList $list144;
    private static final SubLList $list145;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$PRINT_REPLACEMENT_TREE;
    private static final SubLSymbol $sym148$REPLACEMENT_TREE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list149;
    private static final SubLSymbol $sym150$R_TREE_ROOT;
    private static final SubLSymbol $sym151$_CSETF_R_TREE_ROOT;
    private static final SubLSymbol $sym152$R_TREE_CHILDREN;
    private static final SubLSymbol $sym153$_CSETF_R_TREE_CHILDREN;
    private static final SubLSymbol $kw154$ROOT;
    private static final SubLString $str155$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw156$BEGIN;
    private static final SubLSymbol $sym157$MAKE_REPLACEMENT_TREE;
    private static final SubLSymbol $kw158$SLOT;
    private static final SubLSymbol $kw159$END;
    private static final SubLSymbol $sym160$VISIT_DEFSTRUCT_OBJECT_REPLACEMENT_TREE_METHOD;
    private static final SubLString $str161$_REPLACEMENT_TREE__S_;
    private static final SubLSymbol $sym162$NON_DOTTED_LIST_P;
    private static final SubLString $str163$Unable_to_place__D_renderers;
    private static final SubLString $str164$Hit_max_depth_of__D__Pruning__D_r;
    private static final SubLString $str165$__Placing__S_under_superiors___S_;
    private static final SubLSymbol $sym166$SECOND;
    private static final SubLString $str167$__Found__S_on_level__D___;
    private static final SubLString $str168$__Not_in_subtree__so_adding__S_un;
    private static final SubLString $str169$___Tree_level__D_is_now__S___;
    private static final SubLString $str170$Found_it_;
    private static final SubLString $str171$__Postponing__S_because__S_is_not;
    private static final SubLSymbol $sym172$_COL;
    private static final SubLObject $const173$suggestionGenlClassOrderedBy;
    private static final SubLList $list174;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLList $list177;
    private static final SubLSymbol $kw178$PROBLEM_STORE;
    private static final SubLSymbol $kw179$INFERENCE_MODE;
    private static final SubLSymbol $kw180$MINIMAL;
    private static final SubLSymbol $kw181$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw182$HL;
    private static final SubLList $list183;
    private static final SubLObject $const184$genls;
    private static final SubLList $list185;
    private static final SubLSymbol $sym186$_SET;
    private static final SubLString $str187$__Filtered_renderers___S__;
    private static final SubLSymbol $sym188$_USE_TVA_FOR_SUGGESTIONS__;
    private static final SubLSymbol $kw189$X;
    private static final SubLSymbol $kw190$ALLOWED_MODULES;
    private static final SubLList $list191;
    private static final SubLList $list192;
    private static final SubLList $list193;
    private static final SubLString $str194$_;
    private static final SubLString $str195$_;
    private static final SubLSymbol $sym196$POSSIBLY_MT_P;
    private static final SubLSymbol $sym197$QUERY_PROPERTIES_P;
    private static final SubLSymbol $kw198$CONDITIONAL_SENTENCE_;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$GKE_START_CONTINUABLE_QUERY;
    private static final SubLList $list201;
    private static final SubLString $str202$Setup_a_query__and_immediately_re;
    private static final SubLList $list203;
    private static final SubLSymbol $sym204$INTEGERP;
    private static final SubLSymbol $kw205$QUEUE;
    private static final SubLSymbol $kw206$DAEMON;
    private static final SubLString $str207$Error_with_query___A__;
    private static final SubLSymbol $sym208$GKE_CONTINUE_QUERY;
    private static final SubLList $list209;
    private static final SubLString $str210$Continue_an_existing_query__ident;
    private static final SubLList $list211;
    private static final SubLString $str212$gke_query_thread__A__A;
    private static final SubLSymbol $sym213$GKE_RUN_INFERENCE;
    private static final SubLString $str214$results_daemon__A__A;
    private static final SubLSymbol $sym215$RESULTS_DAEMON;
    private static final SubLSymbol $kw216$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym217$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw218$BINDINGS;
    private static final SubLSymbol $kw219$SOURCE_ICONS;
    private static final SubLList $list220;
    private static final SubLSymbol $kw221$MAX_TIME;
    private static final SubLSymbol $kw222$MAX_TRANSFORMATION_DEPTH;
    private static final SubLSymbol $sym223$SPECIAL_VARIABLE_STATE_P;
    private static final SubLSymbol $sym224$GKE_GET_ONE_INFERENCE_RESULT;
    private static final SubLList $list225;
    private static final SubLString $str226$Get_one_inference_result;
    private static final SubLList $list227;
    private static final SubLSymbol $sym228$ID_OF_VALID_PROBLEM_STORE_P;
    private static final SubLSymbol $kw229$SKIP;
    private static final SubLSymbol $sym230$GKE_GET_INFERENCE_RESULTS;
    private static final SubLString $str231$get_all_the_inference_results_so_;
    private static final SubLList $list232;
    private static final SubLList $list233;
    private static final SubLSymbol $sym234$GKE_INFERENCE_COMPLETE_;
    private static final SubLString $str235$ret_t_iff_inference_is_suspended_;
    private static final SubLSymbol $sym236$GKE_GET_INFERENCE_STATUS;
    private static final SubLString $str237$get_the_status_of_the_inference;
    private static final SubLSymbol $sym238$GKE_GET_INFERENCE_SUSPEND_STATUS;
    private static final SubLString $str239$get_the_suspend_status_of_the_inf;
    private static final SubLSymbol $sym240$NULL_OR_INTEGERP;
    private static final SubLSymbol $sym241$GKE_STOP_CONTINUABLE_QUERY;
    private static final SubLList $list242;
    private static final SubLString $str243$Find_and_stop_the_inference_;
    private static final SubLList $list244;
    private static final SubLSymbol $sym245$GKE_RELEASE_INFERENCE_RESOURCES;
    private static final SubLString $str246$Destroy_problem_store_and_inferen;
    private static final SubLSymbol $sym247$GKE_TEST_QUERIES;
    private static final SubLSymbol $sym248$_SENT;
    private static final SubLSymbol $sym249$_QUERY;
    private static final SubLList $list250;
    private static final SubLObject $const251$TestVocabularyMt;
    private static final SubLString $str252$GKE_Query_Sentence_Literal_Manipu;
    private static final SubLString $str253$GKE_Main_Test_Suite;
    private static final SubLList $list254;
    private static final SubLSymbol $sym255$TEST_CANDIDATE_REPLACEMENTS;
    private static final SubLSymbol $kw256$TEST;
    private static final SubLSymbol $sym257$CANDIDATE_REPLACEMENTS_EQUAL_;
    private static final SubLSymbol $kw258$OWNER;
    private static final SubLSymbol $kw259$CLASSES;
    private static final SubLList $list260;
    private static final SubLSymbol $kw261$KB;
    private static final SubLSymbol $kw262$FULL;
    private static final SubLSymbol $kw263$WORKING_;
    private static final SubLList $list264;
    private static final SubLSymbol $sym265$FORT_P;
    private static final SubLSymbol $sym266$_EXIT;
    private static final SubLSymbol $sym267$SORT_RESULT;
    private static final SubLSymbol $sym268$REMOVE_JAVALIST_DETAIL;
    private static final SubLList $list269;
    private static final SubLSymbol $sym270$SORT_GROVE;
    private static final SubLSymbol $sym271$TERM___WITH_CONSTANT_BY_NAME;
    private static final SubLSymbol $sym272$CAR;
    private static final SubLSymbol $sym273$SORT_TREE;
    private static final SubLList $list274;
    private static final SubLList $list275;
    private static final SubLList $list276;
    private static final SubLSymbol $sym277$TEST_CANDIDATE_REPLACEMENT_RENDERERS_FOR_VARS;
    private static final SubLList $list278;
    private static final SubLSymbol $sym279$TEST_CANDIDATE_REPLACEMENT_RENDERERS_STUMPS;
    private static final SubLList $list280;
    private static final SubLSymbol $sym281$TEST_CANDIDATE_REPLACEMENT_RENDERERS;
    private static final SubLObject $list282;
    private static final SubLSymbol $sym283$NARTIFY_AND_SUBSTITUTE_TERM_INTO_SENTENCE;
    private static final SubLList $list284;
    private static final SubLObject $list285;
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 788L)
    public static SubLObject get_gke_arg_options(final SubLObject aterm, final SubLObject arg_num, final SubLObject options_type, final SubLObject cycl_formula, SubLObject generation_mt, SubLObject domain_mt, final SubLObject depth, SubLObject orig_term) {
        if (orig_term == gke_main.UNPROVIDED) {
            orig_term = (SubLObject)gke_main.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        generation_mt = hlmt_czer.canonicalize_hlmt(generation_mt);
        domain_mt = hlmt_czer.canonicalize_hlmt(domain_mt);
        final SubLObject arg = narts_high.nart_substitute(aterm);
        SubLObject options = (SubLObject)gke_main.NIL;
        SubLObject nl_values = (SubLObject)gke_main.NIL;
        SubLObject validity_list = (SubLObject)gke_main.NIL;
        SubLObject substitutions = (SubLObject)gke_main.NIL;
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)gke_main.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)gke_main.T, thread);
            if (gke_main.NIL != fort_types_interface.isa_relationP(arg, (SubLObject)gke_main.UNPROVIDED)) {
                options = get_arg_option_isa_relation(arg, arg_num, cycl_formula, domain_mt, depth, options_type);
            }
            else if (gke_main.NIL != fort_types_interface.isa_collectionP(arg, (SubLObject)gke_main.UNPROVIDED)) {
                options = get_arg_option_collection(arg, arg_num, cycl_formula, domain_mt, depth, orig_term, options_type);
            }
            else if (gke_main.NIL != kb_accessors.individualP(arg)) {
                options = get_arg_option_individual(arg, arg_num, cycl_formula, domain_mt, depth, options_type);
            }
            else {
                PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str1$Got_unknown_arg_type_for___A__, arg);
            }
            final SubLObject datum_evaluated_var = get_gke_combine_with_is_valid_substitution(options, arg_num, cycl_formula, domain_mt);
            substitutions = datum_evaluated_var.first();
            validity_list = conses_high.cadr(datum_evaluated_var);
            final SubLObject validity_dictionary = dictionary_utilities.add_values_from_lists_to_dictionary(substitutions, validity_list, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = pph_vars.$pph_language_mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
            try {
                pph_vars.$pph_language_mt$.bind((gke_main.NIL != generation_mt) ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                pph_vars.$pph_domain_mt$.bind((gke_main.NIL != domain_mt) ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
                if (options_type == gke_main.$kw2$PARENTS) {
                    nl_values = gke_process_results((SubLObject)gke_main.NIL, substitutions, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                }
                else {
                    nl_values = gke_process_results((SubLObject)gke_main.T, substitutions, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                }
            }
            finally {
                pph_vars.$pph_domain_mt$.rebind(_prev_bind_1_$2, thread);
                pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$1, thread);
            }
            if (gke_main.NIL == list_utilities.same_length_p(nl_values, validity_list)) {
                Errors.warn((SubLObject)gke_main.$str3$Natural_language_processing_has_d, Sequences.length(nl_values), Sequences.length(validity_list));
            }
            validity_list = (SubLObject)gke_main.NIL;
            SubLObject cdolist_list_var = nl_values;
            SubLObject nl_value = (SubLObject)gke_main.NIL;
            nl_value = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                validity_list = (SubLObject)ConsesLow.cons(dictionary.dictionary_lookup(validity_dictionary, conses_high.second(nl_value), (SubLObject)gke_main.UNPROVIDED), validity_list);
                cdolist_list_var = cdolist_list_var.rest();
                nl_value = cdolist_list_var.first();
            }
            validity_list = Sequences.nreverse(validity_list);
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(nl_values, validity_list);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 2856L)
    public static SubLObject get_arg_option_isa_relation(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, final SubLObject options_type) {
        if (options_type == gke_main.$kw4$CHILDREN) {
            return get_gke_spec_preds(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == gke_main.$kw5$SIBLINGS) {
            return get_gke_instance_siblings(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == gke_main.$kw2$PARENTS) {
            return get_gke_genl_preds(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 3302L)
    public static SubLObject get_arg_option_collection(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, final SubLObject orig_term, final SubLObject options_type) {
        if (options_type == gke_main.$kw4$CHILDREN) {
            return get_gke_specs(arg, arg_num, cycl_formula, domain_mt, depth, orig_term);
        }
        if (options_type == gke_main.$kw5$SIBLINGS) {
            return get_gke_collection_siblings(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == gke_main.$kw2$PARENTS) {
            return get_gke_genls(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 3758L)
    public static SubLObject get_arg_option_individual(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, final SubLObject options_type) {
        if (options_type == gke_main.$kw4$CHILDREN) {
            return (SubLObject)gke_main.NIL;
        }
        if (options_type == gke_main.$kw5$SIBLINGS) {
            return get_gke_instance_siblings(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        if (options_type == gke_main.$kw2$PARENTS) {
            return get_gke_isas(arg, arg_num, cycl_formula, domain_mt, depth);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 4142L)
    public static SubLObject get_gke_expanded_items(final SubLObject string, final SubLObject domain_mt, final SubLObject max_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = list_utilities.first_n(max_count, cb_frames.terms_for_browsing(string, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED));
            result = pph_main.generate_disambiguation_phrases(result, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 4425L)
    public static SubLObject get_gke_combine_with_is_valid_substitution(final SubLObject list_of_substitutes, final SubLObject term_position, final SubLObject original_expression, SubLObject domain_mt) {
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = (SubLObject)gke_main.NIL;
        }
        final SubLObject valid_substitutions = terms_pass_constraints(list_of_substitutes, term_position, original_expression, hlmt_czer.canonicalize_hlmt(domain_mt));
        return (SubLObject)ConsesLow.list(list_of_substitutes, valid_substitutions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 5002L)
    public static SubLObject get_gke_cycl_formulas_for_nl_phrase(final SubLObject nl_phrase, final SubLObject parsing_mt, final SubLObject domain_mt, final SubLObject timeout) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parsing_timed_outP = (SubLObject)gke_main.NIL;
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
        final SubLObject _prev_bind_16 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
        final SubLObject _prev_bind_17 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            control_vars.$within_assert$.bind((SubLObject)gke_main.NIL, thread);
            wff_utilities.$check_arg_typesP$.bind((SubLObject)gke_main.NIL, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)gke_main.NIL, thread);
            wff_utilities.$check_wff_semanticsP$.bind((SubLObject)gke_main.NIL, thread);
            wff_utilities.$check_wff_coherenceP$.bind((SubLObject)gke_main.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)gke_main.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)gke_main.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)gke_main.NIL, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)gke_main.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)gke_main.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)gke_main.T, thread);
            parsing_macros.$parsing_timeout_time_check_count$.bind((SubLObject)gke_main.ZERO_INTEGER, thread);
            parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(timeout), thread);
            parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
            parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
            if (gke_main.NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0_$3 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = abnormal.$abnormality_checking_enabled$.currentBinding(thread);
                final SubLObject _prev_bind_2_$5 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
                try {
                    parsing_vars.$npp_use_nl_tagsP$.bind((SubLObject)gke_main.NIL, thread);
                    abnormal.$abnormality_checking_enabled$.bind((SubLObject)gke_main.NIL, thread);
                    lexicon_vars.$exclude_vulgaritiesP$.bind((SubLObject)gke_main.T, thread);
                    final SubLObject v_related_concepts = result = pph_main.generate_disambiguation_phrases(psp_main.ps_get_cycls_for_phrase(nl_phrase, (SubLObject)gke_main.$kw7$ANY, (SubLObject)gke_main.$kw7$ANY, (SubLObject)gke_main.NIL, psp_lexicon.get_default_psp_lexicon(hlmt_czer.canonicalize_hlmt(parsing_mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                }
                finally {
                    lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_2_$5, thread);
                    abnormal.$abnormality_checking_enabled$.rebind(_prev_bind_1_$4, thread);
                    parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0_$3, thread);
                }
            }
            parsing_timed_outP = parsing_macros.parsing_timeout_time_reachedP();
        }
        finally {
            parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_17, thread);
            parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_16, thread);
            parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_15, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_14, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_13, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_11, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_10, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_9, thread);
            wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_8, thread);
            wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_7, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_6, thread);
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_5, thread);
            control_vars.$within_assert$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 5815L)
    public static SubLObject get_gke_quantifiers() {
        return gke_process_results((SubLObject)gke_main.NIL, (SubLObject)gke_main.$list8, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 6068L)
    public static SubLObject get_gke_quantifier_ranges() {
        return gke_process_results((SubLObject)gke_main.NIL, (SubLObject)gke_main.$list9, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 6468L)
    public static SubLObject gke_list_item_comparator(final SubLObject item_a, final SubLObject item_b) {
        return Functions.funcall(Symbols.symbol_function((SubLObject)gke_main.$sym12$STRING_LESSP), item_a.first().first(), item_b.first().first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 6606L)
    public static SubLObject gke_process_results(final SubLObject should_sort, final SubLObject args, SubLObject generation_mt, SubLObject domain_mt) {
        if (generation_mt == gke_main.UNPROVIDED) {
            generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind((gke_main.NIL != generation_mt) ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_domain_mt$.bind((gke_main.NIL != domain_mt) ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
            final SubLObject _prev_bind_0_$6 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
            try {
                pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
                thread.resetMultipleValues();
                final SubLObject _prev_bind_0_$7 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                try {
                    pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                    final SubLObject reuseP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$8 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                            final SubLObject new_or_reused = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$9 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                            try {
                                pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                final SubLObject _prev_bind_0_$10 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        result = Sequences.delete_if(Symbols.symbol_function((SubLObject)gke_main.$sym13$NULL), list_utilities.nmapcar((SubLObject)gke_main.$sym14$NART_SUBSTITUTE, cardinality_estimates.sort_by_generality_estimate(Sequences.remove_duplicates(list_utilities.first_n((SubLObject)gke_main.$int15$200, args), Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED)), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            finally {
                                pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$9, thread);
                            }
                            if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            if (gke_main.NIL == reuseP) {
                                pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                            }
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$7, thread);
                }
            }
            finally {
                pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$6, thread);
            }
            result = api_widgets.convert_term_list_to_renderings_for_java(result, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        if (gke_main.NIL != should_sort) {
            return Sort.sort(result, Symbols.symbol_function((SubLObject)gke_main.$sym17$GKE_LIST_ITEM_COMPARATOR), (SubLObject)gke_main.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 7459L)
    public static SubLObject get_gke_specs(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth, SubLObject orig_term) {
        if (orig_term == gke_main.UNPROVIDED) {
            orig_term = (SubLObject)gke_main.NIL;
        }
        SubLObject result = (SubLObject)gke_main.NIL;
        if (gke_main.NIL != orig_term && gke_main.NIL != kb_accessors.individualP(orig_term)) {
            result = rkf_ontology_utilities.rkf_instantiations(arg, domain_mt);
            if (gke_main.NIL != list_utilities.lengthG(result, (SubLObject)gke_main.$int18$175, (SubLObject)gke_main.UNPROVIDED)) {
                result = list_utilities.first_n((SubLObject)gke_main.$int18$175, isa.asserted_instance(arg, domain_mt));
            }
        }
        result = ConsesLow.append(result, rkf_ontology_utilities.rkf_max_specs(arg, domain_mt));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 7954L)
    public static SubLObject get_gke_genls(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        return rkf_ontology_utilities.rkf_all_genls(arg, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 8138L)
    public static SubLObject get_gke_spec_preds(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        SubLObject result = (SubLObject)gke_main.NIL;
        SubLObject cdolist_list_var = genl_predicates.max_spec_predicates(arg, domain_mt, (SubLObject)gke_main.UNPROVIDED);
        SubLObject spec_pred = (SubLObject)gke_main.NIL;
        spec_pred = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            if (gke_main.NIL == gke_predicate_filteredP(spec_pred, domain_mt)) {
                result = (SubLObject)ConsesLow.cons(spec_pred, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec_pred = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 8479L)
    public static SubLObject get_gke_genl_preds(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        SubLObject result = (SubLObject)gke_main.NIL;
        SubLObject cdolist_list_var = genl_predicates.genl_predicate_roots(arg, domain_mt, (SubLObject)gke_main.UNPROVIDED);
        SubLObject genl_pred = (SubLObject)gke_main.NIL;
        genl_pred = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            if (gke_main.NIL == gke_predicate_filteredP(genl_pred, domain_mt)) {
                result = (SubLObject)ConsesLow.cons(genl_pred, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl_pred = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 8821L)
    public static SubLObject get_gke_collection_siblings(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Sequences.remove_if((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, list_utilities.flatten(Mapping.mapcar(Symbols.symbol_function((SubLObject)gke_main.$sym20$RKF_MAX_SPECS), Sequences.remove_if((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, cardinality_estimates.sort_by_generality_estimate(rkf_ontology_utilities.rkf_min_genls(arg, domain_mt), (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED))), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            result = conses_high.union(result, Sequences.remove_if((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, list_utilities.flatten(Mapping.mapcar(Symbols.symbol_function((SubLObject)gke_main.$sym20$RKF_MAX_SPECS), Sequences.remove_if((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, cardinality_estimates.sort_by_generality_estimate(rkf_ontology_utilities.rkf_min_isa(arg, domain_mt), (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED))), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            result = conses_high.union(result, get_gke_instance_siblings(arg, arg_num, cycl_formula, domain_mt, depth), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.remove_duplicates(result, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 9990L)
    public static SubLObject get_gke_instance_siblings(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Sequences.remove_if((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, list_utilities.flatten(Mapping.mapcar(Symbols.symbol_function((SubLObject)gke_main.$sym21$RKF_INSTANTIATIONS), Sequences.remove_if((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, cardinality_estimates.sort_by_generality_estimate(rkf_ontology_utilities.rkf_min_isa(arg, domain_mt), (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED))), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 10480L)
    public static SubLObject get_gke_siblings(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Sequences.reverse(list_utilities.flatten(Mapping.mapcar(Symbols.symbol_function((SubLObject)gke_main.$sym20$RKF_MAX_SPECS), rkf_ontology_utilities.rkf_min_genls(arg, (SubLObject)gke_main.UNPROVIDED))));
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gke_process_results((SubLObject)gke_main.T, result, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 10791L)
    public static SubLObject add_self_to_quantify_over_isas(final SubLObject arg, final SubLObject domain_mt, final SubLObject alist) {
        if (gke_main.NIL != isa.isaP(arg, gke_main.$const22$Collection, domain_mt, (SubLObject)gke_main.UNPROVIDED)) {
            return (SubLObject)ConsesLow.cons(arg, alist);
        }
        return alist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 10986L)
    public static SubLObject get_gke_quantify_over_isas(final SubLObject arg, final SubLObject generation_mt, SubLObject domain_mt, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        domain_mt = hlmt_czer.canonicalize_hlmt(domain_mt);
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind((gke_main.NIL != generation_mt) ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
            pph_vars.$pph_domain_mt$.bind((gke_main.NIL != domain_mt) ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
            result = gke_process_results((SubLObject)gke_main.NIL, add_self_to_quantify_over_isas(arg, domain_mt, Sequences.remove_if((SubLObject)gke_main.$sym23$GKE_ISAS_FILTERED_TERM, list_utilities.flatten(Mapping.mapcar((SubLObject)gke_main.$sym24$ALL_GENLS, Sequences.remove_if((SubLObject)gke_main.$sym23$GKE_ISAS_FILTERED_TERM, isa.all_isa(arg, domain_mt, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED))), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 11780L)
    public static SubLObject get_gke_isas(final SubLObject arg, final SubLObject arg_num, final SubLObject cycl_formula, final SubLObject domain_mt, final SubLObject depth) {
        return Sequences.remove_if((SubLObject)gke_main.$sym23$GKE_ISAS_FILTERED_TERM, list_utilities.flatten(Mapping.mapcar((SubLObject)gke_main.$sym25$RKF_ALL_GENLS, Sequences.remove_if((SubLObject)gke_main.$sym23$GKE_ISAS_FILTERED_TERM, rkf_ontology_utilities.rkf_all_isa(arg, domain_mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED))), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12170L)
    public static SubLObject clear_gke_isas_filtered_term() {
        final SubLObject cs = gke_main.$gke_isas_filtered_term_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12170L)
    public static SubLObject remove_gke_isas_filtered_term(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$gke_isas_filtered_term_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, domain_mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12170L)
    public static SubLObject gke_isas_filtered_term_internal(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject overly_general_collections = (SubLObject)gke_main.NIL;
        return (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == v_term || gke_main.NIL != subl_promotions.memberP(v_term, overly_general_collections, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED) || gke_main.NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12170L)
    public static SubLObject gke_isas_filtered_term(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = gke_main.$gke_isas_filtered_term_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym23$GKE_ISAS_FILTERED_TERM, (SubLObject)gke_main.$sym26$_GKE_ISAS_FILTERED_TERM_CACHING_STATE_, (SubLObject)gke_main.NIL, (SubLObject)gke_main.EQUAL, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)gke_main.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)gke_main.NIL;
            collision = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (gke_main.NIL != cached_args && gke_main.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gke_isas_filtered_term_internal(v_term, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12936L)
    public static SubLObject clear_gke_filtered_termP() {
        final SubLObject cs = gke_main.$gke_filtered_termP_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12936L)
    public static SubLObject remove_gke_filtered_termP(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$gke_filtered_termP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, domain_mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12936L)
    public static SubLObject gke_filtered_termP_internal(final SubLObject v_term, final SubLObject domain_mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_term == gke_main.NIL || gke_main.NIL != subl_promotions.memberP(cycl_utilities.hl_to_el(v_term), gke_main.$gke_overly_general_non_predicate_types$.getGlobalValue(), Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED) || (gke_main.NIL != fort_types_interface.predicate_p(v_term) && gke_main.NIL != gke_predicate_filteredP(v_term, domain_mt)) || gke_main.NIL != rkf_relevance_utilities.rkf_irrelevant_term(v_term, domain_mt) || gke_main.NIL != rkf_relevance_utilities.rkf_irrelevant_precision_suggestion(v_term, domain_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 12936L)
    public static SubLObject gke_filtered_termP(final SubLObject v_term, SubLObject domain_mt) {
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = gke_main.$gke_filtered_termP_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_, (SubLObject)gke_main.$sym28$_GKE_FILTERED_TERM__CACHING_STATE_, (SubLObject)gke_main.NIL, (SubLObject)gke_main.EQUAL, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)gke_main.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)gke_main.NIL;
            collision = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (gke_main.NIL != cached_args && gke_main.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gke_filtered_termP_internal(v_term, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 13638L)
    public static SubLObject clear_gke_predicate_filteredP() {
        final SubLObject cs = gke_main.$gke_predicate_filteredP_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 13638L)
    public static SubLObject remove_gke_predicate_filteredP(final SubLObject predicate, final SubLObject domain_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$gke_predicate_filteredP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(predicate, domain_mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 13638L)
    public static SubLObject gke_predicate_filteredP_internal(final SubLObject predicate, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject goodP = (SubLObject)gke_main.NIL;
        if (gke_main.NIL == subl_promotions.memberP(predicate, gke_main.$gke_overly_general_predicate_types$.getGlobalValue(), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (gke_main.NIL == goodP) {
                    SubLObject csome_list_var;
                    SubLObject pred;
                    for (csome_list_var = (SubLObject)gke_main.$list32, pred = (SubLObject)gke_main.NIL, pred = csome_list_var.first(); gke_main.NIL == goodP && gke_main.NIL != csome_list_var; goodP = kb_mapping_utilities.some_pred_value(predicate, pred, (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.$kw31$TRUE), csome_list_var = csome_list_var.rest(), pred = csome_list_var.first()) {}
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == goodP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 13638L)
    public static SubLObject gke_predicate_filteredP(final SubLObject predicate, final SubLObject domain_mt) {
        SubLObject caching_state = gke_main.$gke_predicate_filteredP_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym30$GKE_PREDICATE_FILTERED_, (SubLObject)gke_main.$sym33$_GKE_PREDICATE_FILTERED__CACHING_STATE_, (SubLObject)gke_main.NIL, (SubLObject)gke_main.EQUAL, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)gke_main.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)gke_main.NIL;
            collision = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (gke_main.NIL != cached_args && gke_main.NIL == cached_args.rest() && domain_mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gke_predicate_filteredP_internal(predicate, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(predicate, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 14060L)
    public static SubLObject terms_pass_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        assert gke_main.NIL != Types.listp(replacement_terms) : replacement_terms;
        assert gke_main.NIL != list_utilities.tree_position_p(term_position) : term_position;
        assert gke_main.NIL != collection_defns.cycl_formulaP(formula) : formula;
        final SubLObject mt = hlmt_czer.canonicalize_hlmt(domain_mt);
        assert gke_main.NIL != hlmt.hlmt_p(mt) : mt;
        if (list_utilities.last_one(term_position).isZero()) {
            return operator_terms_pass_constraints(replacement_terms, term_position, formula, mt);
        }
        return argument_terms_pass_constraints(replacement_terms, term_position, formula, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 14717L)
    public static SubLObject operator_terms_pass_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gke_main.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !list_utilities.last_one(term_position).isZero()) {
            Errors.error((SubLObject)gke_main.$str38$OPERATOR_TERMS_PASS_CONSTRAINTS_r, term_position);
        }
        SubLObject new_formula = el_utilities.copy_expression(formula);
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = control_vars.$within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_8 = wff_vars.$validate_constantsP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = wff_utilities.$check_var_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = wff_utilities.$check_arityP$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)gke_main.NIL, thread);
            czer_vars.$simplify_literalP$.bind((SubLObject)gke_main.NIL, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind((SubLObject)gke_main.T, thread);
            control_vars.$within_assert$.bind((SubLObject)gke_main.NIL, thread);
            wff_vars.$validate_constantsP$.bind((SubLObject)gke_main.NIL, thread);
            wff_vars.$permit_keyword_variablesP$.bind((SubLObject)gke_main.NIL, thread);
            wff_utilities.$check_var_typesP$.bind((SubLObject)gke_main.NIL, thread);
            wff_utilities.$check_arityP$.bind((SubLObject)gke_main.NIL, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject _prev_bind_0_$13 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$16 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)gke_main.SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)gke_main.T, thread);
                        SubLObject cdolist_list_var = replacement_terms;
                        SubLObject v_term = (SubLObject)gke_main.NIL;
                        v_term = cdolist_list_var.first();
                        while (gke_main.NIL != cdolist_list_var) {
                            new_formula = cycl_utilities.formula_arg_position_nsubst(v_term, term_position, new_formula);
                            result = (SubLObject)ConsesLow.cons((SubLObject)gke_main.T, result);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_term = cdolist_list_var.first();
                        }
                    }
                    finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$16, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$15, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$14, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$13, thread);
            }
        }
        finally {
            wff_utilities.$check_arityP$.rebind(_prev_bind_11, thread);
            wff_utilities.$check_var_typesP$.rebind(_prev_bind_10, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_9, thread);
            wff_vars.$validate_constantsP$.rebind(_prev_bind_8, thread);
            control_vars.$within_assert$.rebind(_prev_bind_7, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_6, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_5, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 16345L)
    public static SubLObject argument_terms_pass_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gke_main.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && list_utilities.last_one(term_position).isZero()) {
            Errors.error((SubLObject)gke_main.$str39$OPERATOR_TERMS_PASS_CONSTRAINTS_r, term_position);
        }
        if (gke_main.NIL != gke_main.$use_rbp_wff_in_gkeP$.getDynamicValue(thread)) {
            SubLObject result = (SubLObject)gke_main.NIL;
            final SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
            try {
                parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
                result = rbp_wff.rbp_wff_check_formula_arg_position_replacements(formula, term_position, replacement_terms);
            }
            finally {
                parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return argument_terms_pass_isa_genls_constraints(replacement_terms, term_position, formula, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 17061L)
    public static SubLObject argument_terms_pass_isa_genls_constraints(final SubLObject replacement_terms, final SubLObject term_position, final SubLObject formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result_vector = Vectors.make_vector(Sequences.length(replacement_terms), (SubLObject)gke_main.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$19 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_2_$20 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)gke_main.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)gke_main.T, thread);
                thread.resetMultipleValues();
                final SubLObject isa_constraints = at_utilities.term_position_requires_types_in_relation(term_position, formula, (SubLObject)gke_main.UNPROVIDED);
                final SubLObject genl_constraints = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject list_var = (SubLObject)gke_main.NIL;
                SubLObject v_term = (SubLObject)gke_main.NIL;
                SubLObject n = (SubLObject)gke_main.NIL;
                list_var = replacement_terms;
                v_term = list_var.first();
                for (n = (SubLObject)gke_main.ZERO_INTEGER; gke_main.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), n = Numbers.add((SubLObject)gke_main.ONE_INTEGER, n)) {
                    SubLObject problemP = (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == cycl_grammar.cycl_denotational_term_p(v_term));
                    if (gke_main.NIL == problemP) {
                        SubLObject csome_list_var = genl_constraints;
                        SubLObject required_genl = (SubLObject)gke_main.NIL;
                        required_genl = csome_list_var.first();
                        while (gke_main.NIL == problemP && gke_main.NIL != csome_list_var) {
                            if (gke_main.NIL == genls.genlsP(v_term, required_genl, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
                                problemP = (SubLObject)gke_main.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            required_genl = csome_list_var.first();
                        }
                    }
                    if (gke_main.NIL == problemP) {
                        SubLObject csome_list_var = isa_constraints;
                        SubLObject required_isa = (SubLObject)gke_main.NIL;
                        required_isa = csome_list_var.first();
                        while (gke_main.NIL == problemP && gke_main.NIL != csome_list_var) {
                            if (gke_main.NIL == isa.isaP(v_term, required_isa, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
                                problemP = (SubLObject)gke_main.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            required_isa = csome_list_var.first();
                        }
                    }
                    Vectors.set_aref(result_vector, n, (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == problemP));
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2_$20, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$19, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$18, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return vector_utilities.vector_elements(result_vector, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 17904L)
    public static SubLObject get_gke_naut_arg_position(SubLObject arg_pos, final SubLObject cycl_formula, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ret_arg_pos = arg_pos;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(domain_mt));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (gke_main.NIL != el_utilities.possibly_naut_p(cycl_utilities.formula_arg_position(cycl_formula, arg_pos, (SubLObject)gke_main.UNPROVIDED))) {
                ret_arg_pos = arg_pos;
            }
            else {
                SubLObject possible_naut = (SubLObject)gke_main.NIL;
                SubLObject end;
                SubLObject i;
                for (end = Numbers.subtract(Sequences.length(arg_pos), (SubLObject)gke_main.ONE_INTEGER), i = (SubLObject)gke_main.NIL, i = (SubLObject)gke_main.ZERO_INTEGER; !i.numGE(end); i = Numbers.add(i, (SubLObject)gke_main.ONE_INTEGER)) {
                    arg_pos = list_utilities.remove_last(arg_pos);
                    possible_naut = cycl_utilities.formula_arg_position(cycl_formula, arg_pos, (SubLObject)gke_main.UNPROVIDED);
                    if (gke_main.NIL != cycl_grammar.cycl_nat_p(possible_naut)) {
                        ret_arg_pos = arg_pos;
                        i = end;
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ret_arg_pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 19079L)
    public static SubLObject get_gke_is_known(final SubLObject cycl_formula, final SubLObject domain_mt) {
        return rkf_query_utilities.rkf_known(cycl_formula, domain_mt, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 19183L)
    public static SubLObject simulate_gke_query_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terseP, SubLObject task) {
        if (mode == gke_main.UNPROVIDED) {
            mode = (SubLObject)gke_main.$kw42$HTML;
        }
        if (terseP == gke_main.UNPROVIDED) {
            terseP = (SubLObject)gke_main.T;
        }
        if (task == gke_main.UNPROVIDED) {
            task = gke_main.$const43$GenericIntelligenceAnalysis_CAE_A;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject paraphrase_mt = query_library_utils.cae_default_paraphrase_mt(task);
        final SubLObject nl_domain_mt = query_library_utils.cae_default_nl_domain_mt(task);
        thread.resetMultipleValues();
        final SubLObject javalist = (gke_main.NIL != terseP) ? simulate_gke_query_paraphrase_terse(query_sentence, paraphrase_mt, nl_domain_mt) : simulate_gke_query_paraphrase_verbose(query_sentence, paraphrase_mt, nl_domain_mt);
        final SubLObject supports = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)gke_main.$kw42$HTML)) {
            return Values.values(pph_utilities.pph_javalist_html_string(javalist, (SubLObject)gke_main.UNPROVIDED), supports);
        }
        if (pcase_var.eql((SubLObject)gke_main.$kw44$TEXT)) {
            return Values.values(pph_utilities.pph_javalist_string(javalist), supports);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 20044L)
    public static SubLObject simulate_ccf_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terse) {
        if (mode == gke_main.UNPROVIDED) {
            mode = (SubLObject)gke_main.$kw42$HTML;
        }
        if (terse == gke_main.UNPROVIDED) {
            terse = (SubLObject)gke_main.T;
        }
        return html_utilities.html_markup(simulate_gke_query_paraphrase(query_sentence, mode, terse, gke_main.$const45$GenericMedicalResearchTask_Allotm));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 20255L)
    public static SubLObject simulate_ccf3_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terse) {
        if (mode == gke_main.UNPROVIDED) {
            mode = (SubLObject)gke_main.$kw42$HTML;
        }
        if (terse == gke_main.UNPROVIDED) {
            terse = (SubLObject)gke_main.T;
        }
        return html_utilities.html_markup(simulate_gke3_query_paraphrase(query_sentence, mode, terse, gke_main.$const45$GenericMedicalResearchTask_Allotm));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 20470L)
    public static SubLObject simulate_gke_query_paraphrase_terse(final SubLObject query_sentence, final SubLObject paraphrase_mt, final SubLObject nl_domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = (SubLObject)gke_main.NIL;
        SubLObject supports = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$paraphrase_precision$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_maximize_linksP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_addressee$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind((SubLObject)gke_main.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject the_javalist = pph_main.generate_phrase_for_java(query_sentence, (SubLObject)gke_main.$kw47$DEFAULT, (SubLObject)gke_main.$kw48$DECLARATIVE, paraphrase_mt, nl_domain_mt, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject ignore_me = thread.secondMultipleValue();
            final SubLObject the_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            javalist = the_javalist;
            supports = the_justification;
        }
        finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(javalist, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 21435L)
    public static SubLObject simulate_gke_query_paraphrase_verbose(final SubLObject query_sentence, final SubLObject paraphrase_mt, final SubLObject nl_domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = (SubLObject)gke_main.NIL;
        SubLObject supports = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$paraphrase_precision$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_maximize_linksP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_addressee$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind((SubLObject)gke_main.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject the_javalist = pph_main.generate_phrase_for_java(query_sentence, (SubLObject)gke_main.$kw47$DEFAULT, (SubLObject)gke_main.$kw48$DECLARATIVE, paraphrase_mt, nl_domain_mt, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject ignore_me = thread.secondMultipleValue();
            final SubLObject the_justification = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            javalist = the_javalist;
            supports = the_justification;
        }
        finally {
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(javalist, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 22413L)
    public static SubLObject simulate_gke3_query_paraphrase(final SubLObject query_sentence, SubLObject mode, SubLObject terseP, SubLObject task) {
        if (mode == gke_main.UNPROVIDED) {
            mode = (SubLObject)gke_main.$kw42$HTML;
        }
        if (terseP == gke_main.UNPROVIDED) {
            terseP = (SubLObject)gke_main.T;
        }
        if (task == gke_main.UNPROVIDED) {
            task = gke_main.$const43$GenericIntelligenceAnalysis_CAE_A;
        }
        final SubLObject params_$21;
        final SubLObject params = params_$21 = nl_generation_api.new_pph_parameters((SubLObject)gke_main.UNPROVIDED);
        pph_parameter_declarations.set_pph_lexical_context_internal(params_$21, query_library_utils.cae_default_paraphrase_mt(task));
        final SubLObject params_$22 = params;
        pph_parameter_declarations.set_pph_semantic_mt_internal(params_$22, query_library_utils.cae_default_nl_domain_mt(task));
        final SubLObject params_$23 = params;
        pph_parameter_declarations.set_prefer_terse_paraphraseP_internal(params_$23, terseP);
        return simulate_gke3_paraphrase_guts(query_sentence, params);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 23084L)
    public static SubLObject simulate_gke3_paraphrase_guts(final SubLObject query_sentence, final SubLObject params) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject output_string = (SubLObject)gke_main.NIL;
        pph_parameter_declarations.set_maximize_linksP_internal(params, (SubLObject)gke_main.NIL);
        pph_parameter_declarations.set_use_smart_variable_replacementP_internal(params, (SubLObject)gke_main.T);
        pph_parameter_declarations.set_demerit_cutoff_internal(params, number_utilities.positive_infinity());
        pph_parameter_declarations.set_use_title_capitalizationP_internal(params, (SubLObject)gke_main.NIL);
        pph_parameter_declarations.set_use_indexical_datesP_internal(params, (SubLObject)gke_main.NIL);
        pph_parameter_declarations.set_quantify_variablesP_internal(params, (SubLObject)gke_main.NIL);
        pph_parameter_declarations.set_pph_sentential_force_internal(params, (SubLObject)gke_main.$kw49$NONE);
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_speaker$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_addressee$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            SubLObject stream = (SubLObject)gke_main.NIL;
            try {
                stream = streams_high.make_private_string_output_stream();
                if (gke_main.NIL != collection_defns.cycl_open_formulaP(query_sentence)) {
                    PrintLow.format(stream, (SubLObject)gke_main.$str50$Show_all_values_of_);
                    gke3_paraphrase_open_vars(stream, query_sentence, params);
                    PrintLow.format(stream, (SubLObject)gke_main.$str51$_such_that__);
                }
                else {
                    PrintLow.format(stream, (SubLObject)gke_main.$str52$Is_it_true_that__);
                }
                gke3_paraphrase_guts_int(stream, query_sentence, params, (SubLObject)gke_main.TWO_INTEGER);
                output_string = streams_high.get_output_stream_string(stream);
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    streams_high.close(stream, (SubLObject)gke_main.UNPROVIDED);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        }
        finally {
            pph_vars.$pph_speaker$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        return output_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 24052L)
    public static SubLObject gke3_paraphrase_open_vars(final SubLObject stream, final SubLObject query_sentence, final SubLObject params) {
        final SubLObject open_vars = el_utilities.sentence_free_variables(query_sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        final SubLObject var_term = (SubLObject)ConsesLow.cons(gke_main.$const53$TheCoordinationSet, open_vars);
        final SubLObject pph_map = nl_generation_api.cycl_term_to_nl_internal(var_term, params).first();
        final SubLObject string = nl_generation_api.pph_output_map_to_html_internal(pph_map, (SubLObject)gke_main.$sym54$PPH_ANCHOR_TAGS_FOR_TERM, (SubLObject)gke_main.T, (SubLObject)gke_main.ZERO_INTEGER, (SubLObject)gke_main.T, (SubLObject)gke_main.NIL);
        return print_high.princ(string, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 24391L)
    public static SubLObject gke3_paraphrase_guts_int(final SubLObject stream, SubLObject sentence, final SubLObject params, SubLObject depth) {
        if (depth == gke_main.UNPROVIDED) {
            depth = (SubLObject)gke_main.ZERO_INTEGER;
        }
        if (cycl_utilities.formula_arg0(sentence).eql(gke_main.$const55$thereExists)) {
            gke3_paraphrase_guts_int(stream, cycl_utilities.formula_arg2(sentence, (SubLObject)gke_main.UNPROVIDED), params, depth);
        }
        else {
            if (gke_main.NIL != starts_with_gke3_connectiveP(sentence)) {
                final SubLObject connective = starts_with_gke3_connectiveP(sentence);
                if (gke_main.NIL == list_utilities.lengthE(sentence, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.UNPROVIDED) || gke_main.NIL != conses_high.member(connective, (SubLObject)gke_main.$list56, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
                    string_utilities.indent(stream, depth);
                    print_high.princ(gke3_string_for_conjunction(connective), stream);
                    streams_high.terpri(stream);
                    depth = Numbers.add(depth, (SubLObject)gke_main.TWO_INTEGER);
                    if (connective == gke_main.$kw57$NOR) {
                        sentence = cycl_utilities.formula_arg1(sentence, (SubLObject)gke_main.UNPROVIDED);
                    }
                }
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)gke_main.$kw58$IGNORE);
                SubLObject conjunct = (SubLObject)gke_main.NIL;
                conjunct = cdolist_list_var.first();
                while (gke_main.NIL != cdolist_list_var) {
                    gke3_paraphrase_guts_int(stream, conjunct, params, depth);
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                }
                return (SubLObject)gke_main.NIL;
            }
            if (gke_main.NIL != collection_defns.cycl_atomic_sentenceP(sentence)) {
                final SubLObject pph_map = nl_generation_api.cycl_term_to_nl_internal(sentence, params).first();
                final SubLObject string = nl_generation_api.pph_output_map_to_html_internal(pph_map, (SubLObject)gke_main.$sym54$PPH_ANCHOR_TAGS_FOR_TERM, (SubLObject)gke_main.T, (SubLObject)gke_main.ZERO_INTEGER, (SubLObject)gke_main.T, (SubLObject)gke_main.NIL);
                string_utilities.indent(stream, depth);
                print_high.princ(string, stream);
                streams_high.terpri(stream);
            }
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 25388L)
    public static SubLObject starts_with_gke3_connectiveP(final SubLObject sentence) {
        if (cycl_utilities.formula_arg0(sentence).eql(gke_main.$const59$and)) {
            return (SubLObject)gke_main.$kw60$AND;
        }
        if (gke_main.NIL != conses_high.member(cycl_utilities.formula_arg0(sentence), (SubLObject)gke_main.$list61, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED) && cycl_utilities.formula_arg_position(sentence, (SubLObject)gke_main.$list62, (SubLObject)gke_main.UNPROVIDED).eql(gke_main.$const63$or)) {
            return (SubLObject)gke_main.$kw57$NOR;
        }
        if (gke_main.NIL != conses_high.member(cycl_utilities.formula_arg0(sentence), (SubLObject)gke_main.$list61, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
            return (SubLObject)gke_main.$kw64$NOT;
        }
        if (cycl_utilities.formula_arg0(sentence).eql(gke_main.$const63$or)) {
            return (SubLObject)gke_main.$kw65$OR;
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 25786L)
    public static SubLObject gke3_string_for_conjunction(final SubLObject conj) {
        if (conj.eql((SubLObject)gke_main.$kw60$AND)) {
            return (SubLObject)gke_main.$str66$All_of_the_following_are_true;
        }
        if (conj.eql((SubLObject)gke_main.$kw65$OR)) {
            return (SubLObject)gke_main.$str67$At_least_one_of_the_following_is_;
        }
        if (conj.eql((SubLObject)gke_main.$kw57$NOR)) {
            return (SubLObject)gke_main.$str68$None_of_the_following_is_true;
        }
        if (conj.eql((SubLObject)gke_main.$kw64$NOT)) {
            return (SubLObject)gke_main.$str68$None_of_the_following_is_true;
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 26063L)
    public static SubLObject simulate_gke_term_paraphrase(final SubLObject v_term, SubLObject mode, SubLObject terseP) {
        if (mode == gke_main.UNPROVIDED) {
            mode = (SubLObject)gke_main.$kw42$HTML;
        }
        if (terseP == gke_main.UNPROVIDED) {
            terseP = (SubLObject)gke_main.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = (SubLObject)gke_main.NIL;
        SubLObject supports = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_terse_modeP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_vars.$pph_terse_modeP$.bind(terseP, thread);
            pph_vars.$paraphrase_precision$.bind((SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == terseP), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_maximize_linksP$.bind((SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == terseP), thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_speaker$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_addressee$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$32 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$33 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$34 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$35 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    thread.resetMultipleValues();
                                    final SubLObject the_javalist = pph_main.generate_phrase_for_java(v_term, (SubLObject)gke_main.$kw47$DEFAULT, (SubLObject)gke_main.$kw49$NONE, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                                    final SubLObject ignore_me = thread.secondMultipleValue();
                                    final SubLObject the_justification = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    javalist = the_javalist;
                                    supports = the_justification;
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$34, thread);
                        }
                        if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$33, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (gke_main.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$32, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_terse_modeP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject pcase_var = mode;
        if (pcase_var.eql((SubLObject)gke_main.$kw42$HTML)) {
            return Values.values(pph_utilities.pph_javalist_html_string(javalist, (SubLObject)gke_main.UNPROVIDED), supports);
        }
        if (pcase_var.eql((SubLObject)gke_main.$kw44$TEXT)) {
            return Values.values(pph_utilities.pph_javalist_string(javalist), supports);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 27357L)
    public static SubLObject gke_add_cloned_literal(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject domain_mt, SubLObject connective) {
        if (connective == gke_main.UNPROVIDED) {
            connective = (SubLObject)gke_main.$kw60$AND;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject valid_connectives = (SubLObject)gke_main.$list70;
        if (gke_main.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gke_main.NIL == conses_high.member(connective, valid_connectives, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
            Errors.error((SubLObject)gke_main.$str71$_S_must_be_one_of__S, connective, valid_connectives);
        }
        SubLObject ans = el_utilities.copy_expression(query_sentence);
        thread.resetMultipleValues();
        final SubLObject target_literal = gke_find_literal_to_clone(query_sentence, arg_position);
        final SubLObject target_literal_arg_position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (gke_main.$kw72$ERROR != target_literal) {
            final SubLObject new_literal = loosen_gke_literal(target_literal, (SubLObject)gke_main.UNPROVIDED);
            ans = gke_add_literal(query_sentence, target_literal_arg_position, new_literal, connective);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 28216L)
    public static SubLObject gke_strengthen_query_sentence(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = el_utilities.copy_expression(query_sentence);
        thread.resetMultipleValues();
        final SubLObject target_literal = gke_find_literal_to_strengthen(query_sentence, arg_position);
        final SubLObject target_literal_arg_position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (gke_main.$kw72$ERROR != target_literal) {
            final SubLObject new_literal = strengthen_gke_literal(target_literal, (SubLObject)gke_main.UNPROVIDED);
            ans = gke_formula_arg_position_subst(new_literal, target_literal_arg_position, query_sentence);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 28805L)
    public static SubLObject gke_remove_literal(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = el_utilities.copy_expression(query_sentence);
        thread.resetMultipleValues();
        final SubLObject target_literal = gke_find_literal_to_remove(query_sentence, arg_position);
        final SubLObject target_literal_arg_position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (gke_main.$kw72$ERROR != target_literal && gke_main.NIL != target_literal_arg_position) {
            final SubLObject enclosing_arg_position = conses_high.butlast(target_literal_arg_position, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject enclosing_formula = gke_formula_arg_position(query_sentence, enclosing_arg_position, (SubLObject)gke_main.UNPROVIDED);
            if ((gke_main.NIL != el_utilities.el_disjunction_p(enclosing_formula) || gke_main.NIL != el_utilities.el_conjunction_p(enclosing_formula)) && gke_main.NIL != el_utilities.formula_arityG(enclosing_formula, (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.UNPROVIDED)) {
                SubLObject juncts = (SubLObject)gke_main.NIL;
                final SubLObject target_arg_num = list_utilities.last_one(target_literal_arg_position);
                SubLObject current_arg_num = (SubLObject)gke_main.ZERO_INTEGER;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(enclosing_formula, (SubLObject)gke_main.$kw58$IGNORE);
                SubLObject arg = (SubLObject)gke_main.NIL;
                arg = cdolist_list_var.first();
                while (gke_main.NIL != cdolist_list_var) {
                    current_arg_num = Numbers.add(current_arg_num, (SubLObject)gke_main.ONE_INTEGER);
                    if (!current_arg_num.eql(target_arg_num)) {
                        juncts = (SubLObject)ConsesLow.cons(arg, juncts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                }
                ans = ((gke_main.NIL != list_utilities.lengthG(juncts, (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.UNPROVIDED)) ? el_utilities.make_el_formula(cycl_utilities.formula_arg0(enclosing_formula), Sequences.nreverse(juncts), (SubLObject)gke_main.UNPROVIDED) : juncts.first());
                if (gke_main.NIL != enclosing_arg_position) {
                    ans = el_utilities.replace_formula_arg_position(enclosing_arg_position, ans, query_sentence);
                }
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 30211L)
    public static SubLObject gke_find_literal_to_clone(final SubLObject query_sentence, final SubLObject arg_position) {
        return gke_find_literal_for_arg_position(query_sentence, arg_position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 30358L)
    public static SubLObject gke_find_literal_to_remove(final SubLObject query_sentence, final SubLObject arg_position) {
        return gke_find_literal_for_arg_position(query_sentence, arg_position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 30505L)
    public static SubLObject gke_find_literal_to_strengthen(final SubLObject query_sentence, final SubLObject arg_position) {
        return gke_find_literal_for_arg_position(query_sentence, arg_position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 30656L)
    public static SubLObject gke_find_literal_for_arg_position(final SubLObject query_sentence, final SubLObject arg_position) {
        SubLObject target_literal_arg_position;
        SubLObject target_literal;
        for (target_literal_arg_position = conses_high.butlast(arg_position, (SubLObject)gke_main.UNPROVIDED), target_literal = cycl_utilities.formula_arg_position(query_sentence, target_literal_arg_position, (SubLObject)gke_main.UNPROVIDED); gke_main.NIL == el_utilities.atomic_sentenceP(target_literal) && gke_main.NIL == list_utilities.lengthL(target_literal_arg_position, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.UNPROVIDED); target_literal_arg_position = conses_high.butlast(target_literal_arg_position, (SubLObject)gke_main.UNPROVIDED), target_literal = cycl_utilities.formula_arg_position(query_sentence, target_literal_arg_position, (SubLObject)gke_main.UNPROVIDED)) {}
        if (gke_main.NIL == el_utilities.atomic_sentenceP(target_literal)) {
            target_literal = (SubLObject)gke_main.$kw72$ERROR;
            target_literal_arg_position = (SubLObject)gke_main.$kw72$ERROR;
        }
        return Values.values(target_literal, target_literal_arg_position);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 31507L)
    public static SubLObject gke_add_literal(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject new_literal, final SubLObject connective) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject siblings = gke_get_siblings(query_sentence, arg_position, connective);
        final SubLObject replace_enclosing_formulaP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_sub_formula = (connective == gke_main.$kw60$AND) ? simplifier.conjoin((SubLObject)ConsesLow.cons(new_literal, siblings), (SubLObject)gke_main.UNPROVIDED) : simplifier.disjoin((SubLObject)ConsesLow.cons(new_literal, siblings), (SubLObject)gke_main.UNPROVIDED);
        final SubLObject target_arg_position = (gke_main.NIL != replace_enclosing_formulaP) ? conses_high.butlast(arg_position, (SubLObject)gke_main.UNPROVIDED) : arg_position;
        final SubLObject new_query_sentence = gke_formula_arg_position_subst(new_sub_formula, target_arg_position, query_sentence);
        return new_query_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 32202L)
    public static SubLObject gke_get_siblings(final SubLObject query_sentence, final SubLObject arg_position, final SubLObject connective) {
        if (gke_main.NIL == arg_position) {
            return Values.values((SubLObject)ConsesLow.list(query_sentence), (SubLObject)gke_main.NIL);
        }
        final SubLObject enclosing_formula = gke_formula_arg_position(query_sentence, conses_high.butlast(arg_position, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.UNPROVIDED);
        if (connective == gke_main.$kw60$AND && gke_main.NIL != el_utilities.el_conjunction_p(enclosing_formula)) {
            return Values.values(cycl_utilities.formula_args(enclosing_formula, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.T);
        }
        if (connective == gke_main.$kw65$OR && gke_main.NIL != el_utilities.el_disjunction_p(enclosing_formula)) {
            return Values.values(cycl_utilities.formula_args(enclosing_formula, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.T);
        }
        return Values.values((SubLObject)ConsesLow.list(gke_formula_arg_position(query_sentence, arg_position, (SubLObject)gke_main.UNPROVIDED)), (SubLObject)gke_main.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 33044L)
    public static SubLObject gke_formula_arg_position(final SubLObject formula, final SubLObject arg_position, SubLObject v_default) {
        if (v_default == gke_main.UNPROVIDED) {
            v_default = (SubLObject)gke_main.NIL;
        }
        if (gke_main.NIL != cycl_utilities.arg_position_p(arg_position)) {
            return cycl_utilities.formula_arg_position(formula, arg_position, v_default);
        }
        if (gke_main.NIL == arg_position) {
            return Values.values(formula, (SubLObject)gke_main.T);
        }
        return Values.values(v_default, (SubLObject)gke_main.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 33409L)
    public static SubLObject gke_formula_arg_position_subst(final SubLObject new_term, final SubLObject arg_position, final SubLObject formula) {
        if (gke_main.NIL != cycl_utilities.arg_position_p(arg_position)) {
            return cycl_utilities.formula_arg_position_subst(new_term, arg_position, formula);
        }
        if (gke_main.NIL == arg_position) {
            return new_term;
        }
        return formula;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 33755L)
    public static SubLObject loosen_gke_literal(final SubLObject literal, SubLObject mt) {
        if (mt == gke_main.UNPROVIDED) {
            mt = constants_high.find_constant((SubLObject)gke_main.$str74$GKEReformulationRuleHoldingMt);
        }
        assert gke_main.NIL != el_grammar.el_sentence_p(literal) : literal;
        assert gke_main.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject settings = reformulator_settings_for_gke((SubLObject)gke_main.$kw76$LOOSEN);
        SubLObject v_answer = literal;
        if (gke_main.NIL != settings) {
            v_answer = reformulator_hub.reformulate_cycl(literal, mt, settings);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 34157L)
    public static SubLObject strengthen_gke_literal(final SubLObject literal, SubLObject mt) {
        if (mt == gke_main.UNPROVIDED) {
            mt = constants_high.find_constant((SubLObject)gke_main.$str74$GKEReformulationRuleHoldingMt);
        }
        assert gke_main.NIL != el_grammar.el_sentence_p(literal) : literal;
        if (gke_main.NIL == mt) {
            return literal;
        }
        assert gke_main.NIL != hlmt.hlmt_p(mt) : mt;
        final SubLObject settings = reformulator_settings_for_gke((SubLObject)gke_main.$kw77$STRENGTHEN);
        SubLObject v_answer = literal;
        if (gke_main.NIL != settings) {
            v_answer = reformulator_hub.reformulate_cycl(literal, mt, settings);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 34600L)
    public static SubLObject reformulator_settings_for_gke(final SubLObject mode) {
        if (mode.eql((SubLObject)gke_main.$kw76$LOOSEN)) {
            final SubLObject meta_predicate = constants_high.find_constant((SubLObject)gke_main.$str78$useReformulationRuleForGuidedKnow);
            SubLObject settings = (SubLObject)gke_main.NIL;
            if (gke_main.NIL != constant_handles.valid_constantP(meta_predicate, (SubLObject)gke_main.UNPROVIDED)) {
                final SubLObject meta_predicates = (SubLObject)ConsesLow.list(meta_predicate);
                settings = (SubLObject)ConsesLow.list((SubLObject)gke_main.$kw79$META_PREDICATES, meta_predicates);
            }
            return settings;
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 35081L)
    public static SubLObject sentence_substitution_wffP(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject wffP = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_assume_conjuncts_independentP$.currentBinding(thread);
        try {
            at_vars.$at_assume_conjuncts_independentP$.bind((SubLObject)gke_main.NIL, thread);
            wffP = wff.el_wffP(sentence, mt, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            at_vars.$at_assume_conjuncts_independentP$.rebind(_prev_bind_0, thread);
        }
        return wffP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 35266L)
    public static SubLObject free_variable(final SubLObject variable, final SubLObject sentence) {
        if (gke_main.NIL != formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)ConsesLow.listS(gke_main.$const55$thereExists, variable, (SubLObject)gke_main.$list80))) {
            return conses_high.third(sentence);
        }
        if (gke_main.NIL != formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)gke_main.$list81)) {
            return (SubLObject)ConsesLow.list(gke_main.$const55$thereExists, conses_high.second(sentence), free_variable(variable, conses_high.third(sentence)));
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 35619L)
    public static SubLObject existentially_boundP(final SubLObject variable, final SubLObject sentence) {
        if (gke_main.NIL != formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)ConsesLow.listS(gke_main.$const55$thereExists, variable, (SubLObject)gke_main.$list80))) {
            return (SubLObject)gke_main.T;
        }
        if (gke_main.NIL != formula_pattern_match.formula_matches_pattern(sentence, (SubLObject)gke_main.$list81)) {
            return existentially_boundP(variable, conses_high.third(sentence));
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 35929L)
    public static SubLObject possible_sentence_substitutions(final SubLObject string, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject allow_coercionP, SubLObject generation_mt, SubLObject parsing_mt, SubLObject possibly_strip_extraneous_punctuationP, SubLObject force, SubLObject nl_preds, SubLObject string_match_options, SubLObject instance_limit) {
        if (allow_coercionP == gke_main.UNPROVIDED) {
            allow_coercionP = (SubLObject)gke_main.T;
        }
        if (generation_mt == gke_main.UNPROVIDED) {
            generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (parsing_mt == gke_main.UNPROVIDED) {
            parsing_mt = gke_main.$const83$EnglishMt;
        }
        if (possibly_strip_extraneous_punctuationP == gke_main.UNPROVIDED) {
            possibly_strip_extraneous_punctuationP = (SubLObject)gke_main.T;
        }
        if (force == gke_main.UNPROVIDED) {
            force = (SubLObject)gke_main.$kw49$NONE;
        }
        if (nl_preds == gke_main.UNPROVIDED) {
            nl_preds = (SubLObject)ConsesLow.list(gke_main.$const84$nonPlural_Generic);
        }
        if (string_match_options == gke_main.UNPROVIDED) {
            string_match_options = (SubLObject)gke_main.$list85;
        }
        if (instance_limit == gke_main.UNPROVIDED) {
            instance_limit = (SubLObject)gke_main.TEN_INTEGER;
        }
        assert gke_main.NIL != Types.stringp(string) : string;
        SubLObject ans = (SubLObject)gke_main.NIL;
        SubLObject isa_constraint = formula_arg_pos_isa_constraint(sentence, arg_pos, domain_mt);
        SubLObject non_wffP = (SubLObject)gke_main.NIL;
        SubLObject candidates = api_widgets.get_constrained_cycl_for_string_int(string, isa_constraint, domain_mt, generation_mt, parsing_mt, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, possibly_strip_extraneous_punctuationP, force, nl_preds, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, string_match_options, instance_limit);
        SubLObject allow_non_wffP = (SubLObject)gke_main.NIL;
        ans = substitute_terms_into_sentence(candidates, sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
        if (gke_main.NIL != allow_coercionP && gke_main.NIL != list_utilities.empty_list_p(ans)) {
            isa_constraint = gke_main.$const87$Thing;
            SubLObject cdolist_list_var;
            candidates = (cdolist_list_var = Sequences.delete_duplicates(ConsesLow.append(candidates, api_widgets.get_constrained_cycl_for_string_int(string, isa_constraint, domain_mt, generation_mt, parsing_mt, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, possibly_strip_extraneous_punctuationP, force, nl_preds, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, string_match_options, instance_limit)), Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED));
            SubLObject candidate = (SubLObject)gke_main.NIL;
            candidate = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                final SubLObject v_term = conses_high.last(candidate, (SubLObject)gke_main.UNPROVIDED).first();
                SubLObject new_sentence = coerce_term_into_sentence(v_term, sentence, arg_pos, replace_all, domain_mt, (SubLObject)gke_main.UNPROVIDED);
                if (gke_main.NIL != new_sentence) {
                    if (gke_main.NIL != el_utilities.el_formula_p(new_sentence)) {
                        new_sentence = el_utilities.optimize_el_formula_variable_names(new_sentence, generation_mt, domain_mt, (SubLObject)gke_main.UNPROVIDED);
                    }
                    ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(candidate, new_sentence), ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate = cdolist_list_var.first();
            }
        }
        if (gke_main.NIL != list_utilities.empty_list_p(ans)) {
            allow_non_wffP = (SubLObject)gke_main.T;
            ans = substitute_terms_into_sentence(candidates, sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
            if (gke_main.NIL != list_utilities.non_empty_list_p(ans)) {
                non_wffP = (SubLObject)gke_main.T;
            }
        }
        return (SubLObject)ConsesLow.list(Sequences.nreverse(ans), non_wffP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 38123L)
    public static SubLObject formula_arg_pos_isa_constraint(final SubLObject sentence, final SubLObject arg_pos, final SubLObject mt) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(sentence, (SubLObject)gke_main.UNPROVIDED);
        final SubLObject constraints = at_var_types.formula_variable_isa_constraints(var, el_utilities.replace_formula_arg_position(arg_pos, var, sentence), mt, (SubLObject)gke_main.UNPROVIDED);
        return (gke_main.NIL != constraints) ? list_utilities.extremal(constraints, (SubLObject)gke_main.$sym88$GENERALITY_ESTIMATE_, (SubLObject)gke_main.UNPROVIDED) : gke_main.$const87$Thing;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 38548L)
    public static SubLObject substitute_term_into_sentence(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject try_coercionP, SubLObject allow_non_wffP, SubLObject optimize_var_namesP) {
        if (try_coercionP == gke_main.UNPROVIDED) {
            try_coercionP = (SubLObject)gke_main.T;
        }
        if (allow_non_wffP == gke_main.UNPROVIDED) {
            allow_non_wffP = (SubLObject)gke_main.NIL;
        }
        if (optimize_var_namesP == gke_main.UNPROVIDED) {
            optimize_var_namesP = (SubLObject)gke_main.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_sentence = cycl_utilities.expression_transform(sentence, (SubLObject)gke_main.$sym90$NART_P, (SubLObject)gke_main.$sym91$NART_EL_FORMULA, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        if (gke_main.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gke_main.NIL == el_utilities.formula_has_arg_position_p(el_sentence, arg_pos)) {
            Errors.error((SubLObject)gke_main.$str92$_S_does_not_have_arg_position__S, sentence, arg_pos);
        }
        SubLObject ans = substitute_term_into_sentence_int(v_term, el_sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
        if (gke_main.NIL != try_coercionP && gke_main.NIL == ans) {
            ans = coerce_term_into_sentence(v_term, el_sentence, arg_pos, replace_all, domain_mt, (SubLObject)gke_main.UNPROVIDED);
        }
        if (gke_main.NIL != optimize_var_namesP && gke_main.NIL != el_utilities.el_formula_p(ans)) {
            ans = el_utilities.optimize_el_formula_variable_names(ans, pph_vars.$pph_language_mt$.getDynamicValue(thread), domain_mt, sentence);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 39377L)
    public static SubLObject substitute_terms_into_sentence(final SubLObject renderings, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, final SubLObject allow_non_wffP) {
        SubLObject ans = (SubLObject)gke_main.NIL;
        SubLObject cdolist_list_var = renderings;
        SubLObject rendering = (SubLObject)gke_main.NIL;
        rendering = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            final SubLObject v_term = conses_high.second(rendering);
            final SubLObject new_sentence = substitute_term_into_sentence_int(v_term, sentence, arg_pos, replace_all, domain_mt, allow_non_wffP);
            if (gke_main.NIL != new_sentence) {
                ans = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rendering, new_sentence), ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            rendering = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 39788L)
    public static SubLObject substitute_term_into_sentence_int(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, final SubLObject allow_non_wffP) {
        final SubLObject replaced_term = cycl_utilities.formula_arg_position(sentence, arg_pos, (SubLObject)gke_main.UNPROVIDED);
        SubLObject new_sentence = (gke_main.NIL != replace_all) ? cycl_utilities.expression_subst(v_term, replaced_term, sentence, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED) : el_utilities.replace_formula_arg_position(arg_pos, v_term, sentence);
        SubLObject cdolist_list_var = cycl_utilities.expression_gather(new_sentence, Symbols.symbol_function((SubLObject)gke_main.$sym93$EL_FORMULA_P), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        SubLObject expression = (SubLObject)gke_main.NIL;
        expression = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            if (gke_main.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)ConsesLow.listS(gke_main.$const55$thereExists, v_term, (SubLObject)gke_main.$list80))) {
                new_sentence = cycl_utilities.expression_nsubst(el_utilities.quantified_sub_sentence(expression), expression, new_sentence, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        if (gke_main.NIL != cycl_variables.cyc_varP(replaced_term) && gke_main.NIL != existentially_boundP(replaced_term, new_sentence) && gke_main.NIL == list_utilities.tree_find(replaced_term, free_variable(replaced_term, new_sentence), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
            new_sentence = free_variable(replaced_term, new_sentence);
        }
        if (gke_main.NIL != allow_non_wffP || gke_main.NIL != sentence_substitution_wffP(new_sentence, domain_mt)) {
            return new_sentence;
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 40957L)
    public static SubLObject coerce_term_into_sentence(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject optimize_el_formula_variable_namesP) {
        if (optimize_el_formula_variable_namesP == gke_main.UNPROVIDED) {
            optimize_el_formula_variable_namesP = (SubLObject)gke_main.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gke_main.NIL != isa.isaP(v_term, gke_main.$const22$Collection, domain_mt, (SubLObject)gke_main.UNPROVIDED)) {
            final SubLObject new_variable = czer_utilities.unique_el_var_wrt_expression(sentence, (SubLObject)gke_main.UNPROVIDED);
            SubLObject new_sentence = free_variable(cycl_utilities.formula_arg_position(sentence, arg_pos, (SubLObject)gke_main.UNPROVIDED), sentence);
            if (gke_main.NIL != replace_all) {
                new_sentence = conses_high.sublis((SubLObject)ConsesLow.list(reader.bq_cons(cycl_utilities.formula_arg_position(sentence, arg_pos, (SubLObject)gke_main.UNPROVIDED), new_variable)), new_sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            }
            else {
                new_sentence = free_variable(cycl_utilities.formula_arg_position(sentence, arg_pos, (SubLObject)gke_main.UNPROVIDED), el_utilities.replace_formula_arg_position(arg_pos, new_variable, sentence));
            }
            final SubLObject new_literal = (SubLObject)ConsesLow.list(gke_main.$const94$isa, new_variable, v_term);
            thread.resetMultipleValues();
            final SubLObject uniq_new_literal = value_tables.varmap_uniquify_source_vars(new_literal, new_sentence);
            final SubLObject var_map = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (gke_main.NIL != replace_all) {
                new_sentence = query_library_api.combine_formulas_at_position((SubLObject)gke_main.$list95, new_sentence, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL);
                new_sentence = query_library_api.combine_formulas_at_position(new_sentence, uniq_new_literal, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL);
            }
            else {
                new_sentence = query_library_api.combine_formulas_at_position(new_sentence, uniq_new_literal, conses_high.butlast(arg_pos, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL);
            }
            final SubLObject new_variable_alias = list_utilities.alist_lookup(var_map, new_variable, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            new_sentence = cycl_utilities.formula_subst(new_variable, new_variable_alias, new_sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            if (gke_main.NIL != sentence_substitution_wffP(new_sentence, domain_mt)) {
                final SubLObject best_var_name = (gke_main.NIL != optimize_el_formula_variable_namesP) ? el_utilities.optimize_el_formula_variable_name(new_variable, new_sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED) : cycl_variables.el_var_name(new_variable);
                final SubLObject other_vars = cycl_utilities.expression_gather(new_sentence, Symbols.symbol_function((SubLObject)gke_main.$sym96$EL_VAR_), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                final SubLObject other_var_names = Mapping.mapcar(Symbols.symbol_function((SubLObject)gke_main.$sym97$EL_VAR_NAME), other_vars);
                final SubLObject unique_var_name = czer_utilities.unique_var_name_wrt(best_var_name, other_var_names);
                final SubLObject new_variable2 = el_utilities.correct_variable(cycl_variables.make_el_var(unique_var_name));
                final SubLObject new_sentence2 = conses_high.nsublis((SubLObject)ConsesLow.list(reader.bq_cons(new_variable, new_variable2)), new_sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                return new_sentence2;
            }
            return (SubLObject)gke_main.NIL;
        }
        else {
            if (gke_main.NIL == isa.isaP(v_term, gke_main.$const98$Individual, domain_mt, (SubLObject)gke_main.UNPROVIDED)) {
                return (SubLObject)gke_main.NIL;
            }
            final SubLObject new_term = kb_utilities.set_to_collection((SubLObject)ConsesLow.list(gke_main.$const99$TheSet, v_term), domain_mt);
            SubLObject new_sentence = substitute_term_into_sentence_int(new_term, sentence, arg_pos, replace_all, domain_mt, (SubLObject)gke_main.NIL);
            if (gke_main.NIL == new_sentence) {
                return (SubLObject)gke_main.NIL;
            }
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(new_sentence, Symbols.symbol_function((SubLObject)gke_main.$sym34$LISTP), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            SubLObject expression = (SubLObject)gke_main.NIL;
            expression = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                if (gke_main.NIL != formula_pattern_match.formula_matches_pattern(expression, (SubLObject)ConsesLow.list(gke_main.$const94$isa, (SubLObject)gke_main.$kw100$EL_VARIABLE, new_term))) {
                    final SubLObject obsolete_variable = conses_high.second(expression);
                    SubLObject cdolist_list_var_$38;
                    final SubLObject arg_positions = cdolist_list_var_$38 = cycl_utilities.arg_positions_dfs(expression, new_sentence, Symbols.symbol_function((SubLObject)gke_main.EQUAL));
                    SubLObject arg_pos_$39 = (SubLObject)gke_main.NIL;
                    arg_pos_$39 = cdolist_list_var_$38.first();
                    while (gke_main.NIL != cdolist_list_var_$38) {
                        if (gke_main.NIL != arg_pos_$39) {
                            final SubLObject group_arg_pos = conses_high.butlast(arg_pos_$39, (SubLObject)gke_main.UNPROVIDED);
                            SubLObject group = cycl_utilities.formula_arg_position(new_sentence, group_arg_pos, (SubLObject)gke_main.UNPROVIDED);
                            if (group.first().eql(gke_main.$const59$and) && gke_main.NIL != list_utilities.lengthG(group, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.UNPROVIDED)) {
                                group = Sequences.remove(expression, group, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                                group = cycl_utilities.formula_subst(v_term, obsolete_variable, group, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED);
                                if (gke_main.NIL != list_utilities.lengthE(group, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.UNPROVIDED)) {
                                    group = conses_high.second(group);
                                }
                                if (gke_main.NIL != group_arg_pos) {
                                    new_sentence = cycl_utilities.formula_arg_position_subst(group, group_arg_pos, new_sentence);
                                }
                                else {
                                    new_sentence = group;
                                }
                            }
                            else {
                                final SubLObject new_literal2 = (SubLObject)ConsesLow.list(gke_main.$const101$equals, conses_high.second(expression), v_term);
                                new_sentence = cycl_utilities.formula_arg_position_subst(new_literal2, arg_pos_$39, new_sentence);
                            }
                        }
                        else {
                            new_sentence = (SubLObject)ConsesLow.list(gke_main.$const101$equals, conses_high.second(new_sentence), v_term);
                        }
                        cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                        arg_pos_$39 = cdolist_list_var_$38.first();
                    }
                    if (gke_main.NIL != existentially_boundP(obsolete_variable, new_sentence) && gke_main.NIL == list_utilities.tree_find(obsolete_variable, free_variable(obsolete_variable, new_sentence), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED)) {
                        new_sentence = free_variable(obsolete_variable, new_sentence);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                expression = cdolist_list_var.first();
            }
            if (gke_main.NIL == sentence_substitution_wffP(new_sentence, domain_mt)) {
                return (SubLObject)gke_main.NIL;
            }
            return new_sentence;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 45090L)
    public static SubLObject clear_gke_memoization_state() {
        final SubLObject cs = gke_main.$gke_memoization_state_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 45090L)
    public static SubLObject remove_gke_memoization_state() {
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$gke_memoization_state_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(gke_main.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 45090L)
    public static SubLObject gke_memoization_state_internal() {
        final SubLObject name = (SubLObject)gke_main.$str103$GKE_Memoization_State;
        return memoization_state.new_memoization_state(name, ReadWriteLocks.new_rw_lock(name), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 45090L)
    public static SubLObject gke_memoization_state() {
        SubLObject caching_state = gke_main.$gke_memoization_state_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym102$GKE_MEMOIZATION_STATE, (SubLObject)gke_main.$sym104$_GKE_MEMOIZATION_STATE_CACHING_STATE_, (SubLObject)gke_main.NIL, (SubLObject)gke_main.EQL, (SubLObject)gke_main.ZERO_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)gke_main.$sym105$CLEAR_GKE_MEMOIZATION_STATE);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)gke_main.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gke_memoization_state_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)gke_main.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 46745L)
    public static SubLObject gke_gloss_for_literal(final SubLObject literal, SubLObject domain_mt, SubLObject language_mt) {
        if (domain_mt == gke_main.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (language_mt == gke_main.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        assert gke_main.NIL != el_utilities.atomic_sentenceP(literal) : literal;
        final SubLObject from_kb = get_gke_gloss_from_kb(literal, domain_mt, language_mt);
        return (gke_main.NIL != from_kb) ? from_kb : generate_gke_gloss_wrt_mt_cached(literal, domain_mt, language_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 47155L)
    public static SubLObject get_gke_gloss_from_kb(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gloss = (SubLObject)gke_main.NIL;
        final SubLObject hl_literal = narts_high.nart_substitute(literal);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)gke_main.$sym108$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(language_mt, thread);
            final SubLObject pred_var = gke_main.$const109$gkeGlossWrtDomainMt;
            if (gke_main.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(domain_mt, (SubLObject)gke_main.TWO_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(domain_mt, (SubLObject)gke_main.TWO_INTEGER, pred_var);
                SubLObject done_var = (SubLObject)gke_main.NIL;
                final SubLObject token_var = (SubLObject)gke_main.NIL;
                while (gke_main.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (gke_main.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)gke_main.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)gke_main.$kw110$GAF, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL);
                            SubLObject done_var_$40 = (SubLObject)gke_main.NIL;
                            final SubLObject token_var_$41 = (SubLObject)gke_main.NIL;
                            while (gke_main.NIL == done_var_$40) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$41);
                                final SubLObject valid_$42 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$41.eql(gaf));
                                if (gke_main.NIL != valid_$42 && cycl_utilities.formula_arg1(assertions_high.gaf_arg1(gaf), (SubLObject)gke_main.UNPROVIDED).equal(hl_literal)) {
                                    gloss = assertions_high.gaf_arg3(gaf);
                                }
                                done_var_$40 = (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == valid_$42);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (gke_main.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((gke_main.NIL != gloss) ? pph_utilities.cycl_structured_paraphrase_to_pph_javalist(gloss) : gke_main.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 47570L)
    public static SubLObject clear_generate_gke_gloss_wrt_mt_cached() {
        final SubLObject cs = gke_main.$generate_gke_gloss_wrt_mt_cached_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 47570L)
    public static SubLObject remove_generate_gke_gloss_wrt_mt_cached(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$generate_gke_gloss_wrt_mt_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(literal, domain_mt, language_mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 47570L)
    public static SubLObject generate_gke_gloss_wrt_mt_cached_internal(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject javalist = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = constant_completion_high.$require_case_insensitive_name_uniqueness$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_terse_mt_scopeP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_maximize_linksP$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_link_arg0P$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_consolidate_output_list_for_natP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_13 = pph_vars.$pph_use_title_capitalizationP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = pph_vars.$pph_use_indexical_datesP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = pph_vars.$pph_addressee$.currentBinding(thread);
        final SubLObject _prev_bind_16 = pph_vars.$pph_speaker$.currentBinding(thread);
        final SubLObject _prev_bind_17 = pph_vars.$pph_quantify_varsP$.currentBinding(thread);
        final SubLObject _prev_bind_18 = pph_vars.$pph_blanks_for_varsP$.currentBinding(thread);
        try {
            constant_completion_high.$require_case_insensitive_name_uniqueness$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$paraphrase_mode$.bind((SubLObject)gke_main.$kw42$HTML, thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$paraphrase_precision$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_terse_mt_scopeP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_maximize_linksP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_link_arg0P$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.bind((SubLObject)gke_main.T, thread);
            pph_vars.$pph_demerit_cutoff$.bind(number_utilities.positive_infinity(), thread);
            pph_vars.$pph_use_title_capitalizationP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_use_indexical_datesP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_addressee$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_speaker$.bind((SubLObject)gke_main.$kw46$UNKNOWN, thread);
            pph_vars.$pph_quantify_varsP$.bind((SubLObject)gke_main.NIL, thread);
            pph_vars.$pph_blanks_for_varsP$.bind((SubLObject)gke_main.NIL, thread);
            javalist = pph_main.generate_phrase_for_java(narts_high.nart_substitute(literal), (SubLObject)gke_main.$kw47$DEFAULT, (SubLObject)gke_main.$kw48$DECLARATIVE, language_mt, domain_mt, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            pph_vars.$pph_blanks_for_varsP$.rebind(_prev_bind_18, thread);
            pph_vars.$pph_quantify_varsP$.rebind(_prev_bind_17, thread);
            pph_vars.$pph_speaker$.rebind(_prev_bind_16, thread);
            pph_vars.$pph_addressee$.rebind(_prev_bind_15, thread);
            pph_vars.$pph_use_indexical_datesP$.rebind(_prev_bind_14, thread);
            pph_vars.$pph_use_title_capitalizationP$.rebind(_prev_bind_13, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_12, thread);
            pph_vars.$pph_use_smart_variable_replacementP$.rebind(_prev_bind_11, thread);
            pph_vars.$pph_consolidate_output_list_for_natP$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_link_arg0P$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_maximize_linksP$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_terse_mt_scopeP$.rebind(_prev_bind_7, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_6, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_replace_bulleted_list_tagsP$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_2, thread);
            constant_completion_high.$require_case_insensitive_name_uniqueness$.rebind(_prev_bind_0, thread);
        }
        return javalist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 47570L)
    public static SubLObject generate_gke_gloss_wrt_mt_cached(final SubLObject literal, final SubLObject domain_mt, final SubLObject language_mt) {
        SubLObject caching_state = gke_main.$generate_gke_gloss_wrt_mt_cached_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym111$GENERATE_GKE_GLOSS_WRT_MT_CACHED, (SubLObject)gke_main.$sym112$_GENERATE_GKE_GLOSS_WRT_MT_CACHED_CACHING_STATE_, (SubLObject)gke_main.$int113$256, (SubLObject)gke_main.EQUAL, (SubLObject)gke_main.THREE_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(literal, domain_mt, language_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)gke_main.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)gke_main.NIL;
            collision = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (literal.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (domain_mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (gke_main.NIL != cached_args && gke_main.NIL == cached_args.rest() && language_mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_gke_gloss_wrt_mt_cached_internal(literal, domain_mt, language_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(literal, domain_mt, language_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 48538L)
    public static SubLObject candidate_replacement_renderers_for_sentence(final SubLObject sentence, final SubLObject mt, SubLObject generation_mt) {
        if (generation_mt == gke_main.UNPROVIDED) {
            generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject replacements = candidate_replacements_for_sentence(sentence, mt);
        SubLObject renderers = (SubLObject)gke_main.NIL;
        SubLObject problem_store = (SubLObject)gke_main.NIL;
        try {
            problem_store = inference_datastructures_problem_store.new_problem_store((SubLObject)gke_main.NIL);
            final SubLObject local_state = gke_memoization_state();
            final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    final SubLObject _prev_bind_0_$44 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$45 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$46 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$47 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state_$48 = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$48 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state_$48, thread);
                                            final SubLObject original_memoization_process_$50 = memoization_state.memoization_state_original_process(local_state_$48);
                                            try {
                                                SubLObject cdolist_list_var = replacements;
                                                SubLObject cons = (SubLObject)gke_main.NIL;
                                                cons = cdolist_list_var.first();
                                                while (gke_main.NIL != cdolist_list_var) {
                                                    SubLObject current;
                                                    final SubLObject datum = current = cons;
                                                    SubLObject key = (SubLObject)gke_main.NIL;
                                                    SubLObject terms = (SubLObject)gke_main.NIL;
                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gke_main.$list115);
                                                    key = current.first();
                                                    current = (terms = current.rest());
                                                    SubLObject focal_term = cycl_utilities.formula_arg_position(sentence, key, (SubLObject)gke_main.$kw116$NOT_FOUND);
                                                    final SubLObject renderer_list = api_widgets.get_term_list_as_renderings(terms, mt, (SubLObject)gke_main.$kw49$NONE, generation_mt, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                                                    if (gke_main.NIL != cycl_variables.cyc_varP(focal_term)) {
                                                        focal_term = terms.first();
                                                    }
                                                    if (focal_term != gke_main.$kw116$NOT_FOUND) {
                                                        SubLObject cdolist_list_var_$51 = replacement_renderer_groves(focal_term, mt, renderer_list, problem_store);
                                                        SubLObject grove = (SubLObject)gke_main.NIL;
                                                        grove = cdolist_list_var_$51.first();
                                                        while (gke_main.NIL != cdolist_list_var_$51) {
                                                            renderers = list_utilities.alist_push(renderers, key, grove, (SubLObject)gke_main.UNPROVIDED);
                                                            cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                            grove = cdolist_list_var_$51.first();
                                                        }
                                                    }
                                                    renderers = list_utilities.alist_push(renderers, key, renderer_list, (SubLObject)gke_main.UNPROVIDED);
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    cons = cdolist_list_var.first();
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$49 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state_$48, original_memoization_process_$50);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$48, thread);
                                        }
                                    }
                                    finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$47, thread);
                                    }
                                    if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                }
                                finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$46, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$50 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (gke_main.NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                                }
                            }
                        }
                        finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                    finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$44, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(problem_store);
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return renderers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 49664L)
    public static SubLObject candidate_replacements_for_variables(final SubLObject sentence, final SubLObject mt) {
        SubLObject ans = (SubLObject)gke_main.NIL;
        final SubLObject v_variables = el_utilities.sentence_free_variables(sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        final SubLObject replacements = candidate_replacements_for_sentence(sentence, mt);
        SubLObject cdolist_list_var = v_variables;
        SubLObject variable = (SubLObject)gke_main.NIL;
        variable = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            final SubLObject arg_positions = cycl_utilities.arg_positions_dfs(variable, sentence, (SubLObject)gke_main.UNPROVIDED);
            SubLObject variable_replacements = (SubLObject)gke_main.NIL;
            SubLObject cdolist_list_var_$55 = arg_positions;
            SubLObject arg_pos = (SubLObject)gke_main.NIL;
            arg_pos = cdolist_list_var_$55.first();
            while (gke_main.NIL != cdolist_list_var_$55) {
                final SubLObject new_variable_replacements = list_utilities.alist_lookup(replacements, arg_pos, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED);
                if (gke_main.NIL != new_variable_replacements) {
                    if (gke_main.NIL == variable_replacements) {
                        variable_replacements = new_variable_replacements;
                    }
                    else {
                        variable_replacements = conses_high.intersection(variable_replacements, new_variable_replacements, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                    }
                }
                cdolist_list_var_$55 = cdolist_list_var_$55.rest();
                arg_pos = cdolist_list_var_$55.first();
            }
            if (gke_main.NIL != variable_replacements) {
                ans = list_utilities.alist_enter(ans, variable, variable_replacements, Symbols.symbol_function((SubLObject)gke_main.EQUAL));
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50485L)
    public static SubLObject candidate_replacements_for_arg(final SubLObject sentence, final SubLObject arg_position, final SubLObject mt) {
        return list_utilities.alist_lookup(candidate_replacements_for_sentence(sentence, mt), arg_position, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50729L)
    public static SubLObject candidate_replacements_for_sentence(final SubLObject sentence, final SubLObject mt) {
        return conses_high.copy_list(candidate_replacements_for_sentence_cached(sentence, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50876L)
    public static SubLObject clear_candidate_replacements_for_sentence_cached() {
        final SubLObject cs = gke_main.$candidate_replacements_for_sentence_cached_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50876L)
    public static SubLObject remove_candidate_replacements_for_sentence_cached(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$candidate_replacements_for_sentence_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sentence, mt), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50876L)
    public static SubLObject candidate_replacements_for_sentence_cached_internal(final SubLObject sentence, final SubLObject mt) {
        SubLObject ans = (SubLObject)gke_main.NIL;
        final SubLObject v_properties = (SubLObject)gke_main.$list120;
        if (gke_main.NIL != el_utilities.el_formula_p(sentence)) {
            SubLObject pos = (SubLObject)gke_main.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)gke_main.$kw58$IGNORE);
            SubLObject item = (SubLObject)gke_main.NIL;
            item = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                pos = Numbers.add(pos, (SubLObject)gke_main.ONE_INTEGER);
                SubLObject cdolist_list_var_$56;
                final SubLObject replacement_alist = cdolist_list_var_$56 = candidate_replacements_for_sentence(item, mt);
                SubLObject cons = (SubLObject)gke_main.NIL;
                cons = cdolist_list_var_$56.first();
                while (gke_main.NIL != cdolist_list_var_$56) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject key = (SubLObject)gke_main.NIL;
                    SubLObject replacements = (SubLObject)gke_main.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gke_main.$list121);
                    key = current.first();
                    current = current.rest();
                    SubLObject cdolist_list_var_$57;
                    replacements = (cdolist_list_var_$57 = current);
                    SubLObject replacement = (SubLObject)gke_main.NIL;
                    replacement = cdolist_list_var_$57.first();
                    while (gke_main.NIL != cdolist_list_var_$57) {
                        ans = list_utilities.alist_pushnew(ans, (SubLObject)ConsesLow.cons(pos, key), replacement, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED);
                        cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                        replacement = cdolist_list_var_$57.first();
                    }
                    cdolist_list_var_$56 = cdolist_list_var_$56.rest();
                    cons = cdolist_list_var_$56.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            final SubLObject pred = cycl_utilities.formula_arg0(sentence);
            final SubLObject vars = (SubLObject)gke_main.$list122;
            SubLObject query = (SubLObject)ConsesLow.listS(gke_main.$const123$suggestionsForPredRelativeToIsaIn, pred, vars);
            SubLObject cdolist_list_var2 = ask_utilities.query_template(vars, query, mt, v_properties);
            SubLObject result = (SubLObject)gke_main.NIL;
            result = cdolist_list_var2.first();
            while (gke_main.NIL != cdolist_list_var2) {
                SubLObject current2;
                final SubLObject datum2 = current2 = result;
                SubLObject replacement_coll = (SubLObject)gke_main.NIL;
                SubLObject replacement_pos = (SubLObject)gke_main.NIL;
                SubLObject constraint_coll = (SubLObject)gke_main.NIL;
                SubLObject constraint_pos = (SubLObject)gke_main.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                replacement_coll = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                replacement_pos = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                constraint_coll = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                constraint_pos = current2.first();
                current2 = current2.rest();
                if (gke_main.NIL == current2) {
                    final SubLObject constrained_arg = cycl_utilities.formula_arg_position(sentence, (SubLObject)ConsesLow.list(constraint_pos), (SubLObject)gke_main.UNPROVIDED);
                    if (gke_main.NIL == cycl_variables.cyc_varP(constrained_arg) && gke_main.NIL != isa.isaP(constrained_arg, constraint_coll, mt, (SubLObject)gke_main.UNPROVIDED)) {
                        ans = add_candidate_replacements(ans, replacement_pos, replacement_coll, mt, v_properties);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)gke_main.$list124);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                result = cdolist_list_var2.first();
            }
            query = (SubLObject)ConsesLow.listS(gke_main.$const125$suggestionsForPredRelativeToGenls, pred, vars);
            cdolist_list_var2 = ask_utilities.query_template(vars, query, mt, v_properties);
            result = (SubLObject)gke_main.NIL;
            result = cdolist_list_var2.first();
            while (gke_main.NIL != cdolist_list_var2) {
                SubLObject current2;
                final SubLObject datum2 = current2 = result;
                SubLObject replacement_coll = (SubLObject)gke_main.NIL;
                SubLObject replacement_pos = (SubLObject)gke_main.NIL;
                SubLObject constraint_coll = (SubLObject)gke_main.NIL;
                SubLObject constraint_pos = (SubLObject)gke_main.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                replacement_coll = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                replacement_pos = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                constraint_coll = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)gke_main.$list124);
                constraint_pos = current2.first();
                current2 = current2.rest();
                if (gke_main.NIL == current2) {
                    final SubLObject constrained_arg = cycl_utilities.formula_arg_position(sentence, (SubLObject)ConsesLow.list(constraint_pos), (SubLObject)gke_main.UNPROVIDED);
                    if (gke_main.NIL == cycl_variables.cyc_varP(constrained_arg) && gke_main.NIL != genls.genlsP(constrained_arg, constraint_coll, mt, (SubLObject)gke_main.UNPROVIDED)) {
                        ans = add_candidate_replacements(ans, replacement_pos, replacement_coll, mt, v_properties);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)gke_main.$list124);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                result = cdolist_list_var2.first();
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 50876L)
    public static SubLObject candidate_replacements_for_sentence_cached(final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = gke_main.$candidate_replacements_for_sentence_cached_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym119$CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED, (SubLObject)gke_main.$sym126$_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED_CACHING_STATE_, (SubLObject)gke_main.$int127$2048, (SubLObject)gke_main.EQUAL, (SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)gke_main.$sym128$CLEAR_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)gke_main.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)gke_main.NIL;
            collision = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (gke_main.NIL != cached_args && gke_main.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(candidate_replacements_for_sentence_cached_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 52606L)
    public static SubLObject add_candidate_replacements(SubLObject ans, final SubLObject rep_pos, final SubLObject rep_coll, final SubLObject mt, final SubLObject v_properties) {
        final SubLObject key = (SubLObject)ConsesLow.list(rep_pos);
        final SubLObject old_values = list_utilities.alist_lookup(ans, key, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED);
        final SubLObject new_values = gke_get_elements(rep_coll, mt, v_properties);
        final SubLObject join_function = candidate_replacement_join_function(cae_query_search.current_cae_task());
        if (gke_main.NIL != list_utilities.non_empty_list_p(old_values)) {
            ans = list_utilities.alist_enter(ans, key, Functions.funcall(join_function, old_values, new_values, Symbols.symbol_function((SubLObject)gke_main.EQUAL)), Symbols.symbol_function((SubLObject)gke_main.EQUAL));
        }
        else if (gke_main.NIL != list_utilities.non_empty_list_p(new_values)) {
            ans = list_utilities.alist_enter(ans, key, new_values, Symbols.symbol_function((SubLObject)gke_main.EQUAL));
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53157L)
    public static SubLObject candidate_replacement_join_function(final SubLObject task) {
        return (gke_main.NIL != query_library_utils.query_library_should_suggestions_be_intersected(task)) ? Symbols.symbol_function((SubLObject)gke_main.$sym129$INTERSECTION) : Symbols.symbol_function((SubLObject)gke_main.$sym130$UNION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53310L)
    public static SubLObject clear_gke_get_elements() {
        final SubLObject cs = gke_main.$gke_get_elements_caching_state$.getGlobalValue();
        if (gke_main.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53310L)
    public static SubLObject remove_gke_get_elements(final SubLObject set_or_collection, final SubLObject mt, final SubLObject v_properties) {
        return memoization_state.caching_state_remove_function_results_with_args(gke_main.$gke_get_elements_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(set_or_collection, mt, v_properties), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53310L)
    public static SubLObject gke_get_elements_internal(final SubLObject set_or_collection, final SubLObject mt, final SubLObject v_properties) {
        return Sequences.delete_if((SubLObject)gke_main.$sym132$HL_PROTOTYPICAL_INSTANCE_, ask_utilities.query_variable((SubLObject)gke_main.$sym133$_X, (SubLObject)ConsesLow.list(gke_main.$const134$elementOf, (SubLObject)gke_main.$sym133$_X, set_or_collection), mt, v_properties), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53310L)
    public static SubLObject gke_get_elements(final SubLObject set_or_collection, final SubLObject mt, final SubLObject v_properties) {
        SubLObject caching_state = gke_main.$gke_get_elements_caching_state$.getGlobalValue();
        if (gke_main.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)gke_main.$sym131$GKE_GET_ELEMENTS, (SubLObject)gke_main.$sym135$_GKE_GET_ELEMENTS_CACHING_STATE_, (SubLObject)gke_main.$int113$256, (SubLObject)gke_main.EQUAL, (SubLObject)gke_main.THREE_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)gke_main.$sym136$CLEAR_GKE_GET_ELEMENTS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(set_or_collection, mt, v_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)gke_main.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)gke_main.NIL;
            collision = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (set_or_collection.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (gke_main.NIL != cached_args && gke_main.NIL == cached_args.rest() && v_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(gke_get_elements_internal(set_or_collection, mt, v_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(set_or_collection, mt, v_properties));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 53587L)
    public static SubLObject replacement_renderer_groves(final SubLObject focal_term, final SubLObject mt, final SubLObject renderer_list, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tables = (SubLObject)gke_main.NIL;
        final SubLObject renderer_nodes = Mapping.mapcar((SubLObject)gke_main.$sym137$NEW_REPLACEMENT_TREE, renderer_list);
        final SubLObject conflation_table = replacement_renderer_tree_conflation_preds(focal_term, mt, problem_store);
        final SubLObject track_conflationP = list_utilities.non_empty_list_p(conflation_table);
        final SubLObject table_table = (SubLObject)((gke_main.NIL != track_conflationP) ? dictionary.new_dictionary(Symbols.symbol_function((SubLObject)gke_main.EQL), (SubLObject)gke_main.UNPROVIDED) : gke_main.NIL);
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)gke_main.SIX_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)gke_main.T, thread);
            SubLObject cdolist_list_var = replacement_renderer_tree_specifications(focal_term, mt, problem_store);
            SubLObject cons = (SubLObject)gke_main.NIL;
            cons = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject bin_pred = (SubLObject)gke_main.NIL;
                SubLObject argnum = (SubLObject)gke_main.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gke_main.$list138);
                bin_pred = current.first();
                current = (argnum = current.rest());
                final SubLObject table_to_conflate_to = (SubLObject)((gke_main.NIL != track_conflationP) ? find_table_to_conflate_to(bin_pred, conflation_table, table_table) : gke_main.NIL);
                final SubLObject renderer_to_superiors = renderer_to_superiors_table(renderer_nodes, mt, bin_pred, argnum, problem_store, table_to_conflate_to);
                if (gke_main.NIL != track_conflationP && gke_main.NIL == dictionary.dictionary_p(table_to_conflate_to)) {
                    dictionary.dictionary_enter(table_table, bin_pred, renderer_to_superiors);
                }
                final SubLObject item_var = renderer_to_superiors;
                if (gke_main.NIL == conses_high.member(item_var, tables, Symbols.symbol_function((SubLObject)gke_main.EQL), Symbols.symbol_function((SubLObject)gke_main.IDENTITY))) {
                    tables = (SubLObject)ConsesLow.cons(item_var, tables);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        SubLObject groves = (SubLObject)gke_main.NIL;
        SubLObject cdolist_list_var2 = tables;
        SubLObject renderer_to_superiors2 = (SubLObject)gke_main.NIL;
        renderer_to_superiors2 = cdolist_list_var2.first();
        while (gke_main.NIL != cdolist_list_var2) {
            final SubLObject var;
            final SubLObject listy_grove = var = replacement_renderer_grove(renderer_nodes, renderer_to_superiors2);
            if (gke_main.NIL != var) {
                groves = (SubLObject)ConsesLow.cons(var, groves);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            renderer_to_superiors2 = cdolist_list_var2.first();
        }
        return groves;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55000L)
    public static SubLObject find_table_to_conflate_to(final SubLObject bin_pred, final SubLObject conflation_table, final SubLObject table_table) {
        SubLObject table = (SubLObject)gke_main.NIL;
        if (gke_main.NIL == table) {
            SubLObject csome_list_var = conflation_table;
            SubLObject conflation_set = (SubLObject)gke_main.NIL;
            conflation_set = csome_list_var.first();
            while (gke_main.NIL == table && gke_main.NIL != csome_list_var) {
                final SubLObject preds = el_utilities.el_set_items(conflation_set);
                if (gke_main.NIL != conses_high.member(bin_pred, preds, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED) && gke_main.NIL == table) {
                    SubLObject csome_list_var_$58 = preds;
                    SubLObject other_pred = (SubLObject)gke_main.NIL;
                    other_pred = csome_list_var_$58.first();
                    while (gke_main.NIL == table && gke_main.NIL != csome_list_var_$58) {
                        if (!other_pred.eql(bin_pred)) {
                            table = dictionary.dictionary_lookup_without_values(table_table, other_pred, (SubLObject)gke_main.NIL);
                            if (gke_main.NIL != table) {
                                PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str139$__Conflating__S_to__S_____, bin_pred, other_pred);
                            }
                        }
                        csome_list_var_$58 = csome_list_var_$58.rest();
                        other_pred = csome_list_var_$58.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                conflation_set = csome_list_var.first();
            }
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject replacement_tree_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_replacement_tree(v_object, stream, (SubLObject)gke_main.ZERO_INTEGER);
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject replacement_tree_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $replacement_tree_native.class) ? gke_main.T : gke_main.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject r_tree_root(final SubLObject v_object) {
        assert gke_main.NIL != replacement_tree_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject r_tree_children(final SubLObject v_object) {
        assert gke_main.NIL != replacement_tree_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject _csetf_r_tree_root(final SubLObject v_object, final SubLObject value) {
        assert gke_main.NIL != replacement_tree_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject _csetf_r_tree_children(final SubLObject v_object, final SubLObject value) {
        assert gke_main.NIL != replacement_tree_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject make_replacement_tree(SubLObject arglist) {
        if (arglist == gke_main.UNPROVIDED) {
            arglist = (SubLObject)gke_main.NIL;
        }
        final SubLObject v_new = (SubLObject)new $replacement_tree_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)gke_main.NIL, next = arglist; gke_main.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)gke_main.$kw154$ROOT)) {
                _csetf_r_tree_root(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)gke_main.$kw4$CHILDREN)) {
                _csetf_r_tree_children(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)gke_main.$str155$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject visit_defstruct_replacement_tree(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_main.$kw156$BEGIN, (SubLObject)gke_main.$sym157$MAKE_REPLACEMENT_TREE, (SubLObject)gke_main.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_main.$kw158$SLOT, (SubLObject)gke_main.$kw154$ROOT, r_tree_root(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_main.$kw158$SLOT, (SubLObject)gke_main.$kw4$CHILDREN, r_tree_children(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)gke_main.$kw159$END, (SubLObject)gke_main.$sym157$MAKE_REPLACEMENT_TREE, (SubLObject)gke_main.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 55999L)
    public static SubLObject visit_defstruct_object_replacement_tree_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_replacement_tree(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 56131L)
    public static SubLObject print_replacement_tree(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)gke_main.$str161$_REPLACEMENT_TREE__S_, conses_high.second(replacement_tree_root(v_object)));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 56316L)
    public static SubLObject new_replacement_tree(final SubLObject root, SubLObject children) {
        if (children == gke_main.UNPROVIDED) {
            children = (SubLObject)gke_main.NIL;
        }
        assert gke_main.NIL != Types.listp(root) : root;
        final SubLObject list_var = children;
        assert gke_main.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)gke_main.NIL;
        elem = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            assert gke_main.NIL != replacement_tree_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject tree = make_replacement_tree((SubLObject)gke_main.UNPROVIDED);
        _csetf_r_tree_root(tree, root);
        _csetf_r_tree_children(tree, children);
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 56614L)
    public static SubLObject replacement_tree_root(final SubLObject tree) {
        assert gke_main.NIL != replacement_tree_p(tree) : tree;
        return r_tree_root(tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 56739L)
    public static SubLObject replacement_tree_children(final SubLObject tree) {
        assert gke_main.NIL != replacement_tree_p(tree) : tree;
        return r_tree_children(tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 56860L)
    public static SubLObject replacement_tree_add_child(final SubLObject superior, final SubLObject renderer) {
        assert gke_main.NIL != replacement_tree_p(superior) : superior;
        assert gke_main.NIL != replacement_tree_p(renderer) : renderer;
        _csetf_r_tree_children(superior, (SubLObject)ConsesLow.cons(renderer, r_tree_children(superior)));
        return superior;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 57086L)
    public static SubLObject replacement_renderer_grove(final SubLObject renderer_list, final SubLObject renderer_to_superiors) {
        assert gke_main.NIL != list_utilities.non_dotted_list_p(renderer_list) : renderer_list;
        SubLObject cdolist_list_var = renderer_list;
        SubLObject elem = (SubLObject)gke_main.NIL;
        elem = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            assert gke_main.NIL != replacement_tree_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        return replacement_renderer_grove_recursive(renderer_list, renderer_to_superiors, (SubLObject)gke_main.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 57309L)
    public static SubLObject replacement_renderer_grove_recursive(final SubLObject renderer_nodes, final SubLObject renderer_to_superiors, final SubLObject recursedP) {
        assert gke_main.NIL != list_utilities.non_dotted_list_p(renderer_nodes) : renderer_nodes;
        SubLObject cdolist_list_var = renderer_nodes;
        SubLObject elem = (SubLObject)gke_main.NIL;
        elem = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            assert gke_main.NIL != replacement_tree_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject remaining = conses_high.copy_list(renderer_nodes);
        SubLObject still_remaining = (SubLObject)gke_main.NIL;
        SubLObject tree = (SubLObject)gke_main.NIL;
        SubLObject no_progressP = (SubLObject)gke_main.NIL;
        SubLObject depth = (SubLObject)gke_main.ZERO_INTEGER;
        final SubLObject max_depth = (SubLObject)gke_main.NIL;
        SubLObject listy_grove = (SubLObject)gke_main.NIL;
        while ((gke_main.NIL == max_depth || !depth.numGE(max_depth)) && gke_main.NIL == list_utilities.empty_list_p(remaining) && gke_main.NIL == no_progressP) {
            still_remaining = (SubLObject)gke_main.NIL;
            no_progressP = (SubLObject)gke_main.T;
            final SubLObject new_tree_level = set.new_set(Symbols.symbol_function((SubLObject)gke_main.EQL), (SubLObject)gke_main.UNPROVIDED);
            SubLObject cdolist_list_var2 = Sequences.nreverse(remaining);
            SubLObject renderer_node = (SubLObject)gke_main.NIL;
            renderer_node = cdolist_list_var2.first();
            while (gke_main.NIL != cdolist_list_var2) {
                if (gke_main.NIL != postpone_adding_replacementP(renderer_node, tree, renderer_to_superiors)) {
                    still_remaining = (SubLObject)ConsesLow.cons(renderer_node, still_remaining);
                }
                else {
                    add_one_renderer(renderer_node, renderer_to_superiors, new_tree_level, tree);
                    no_progressP = (SubLObject)gke_main.NIL;
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                renderer_node = cdolist_list_var2.first();
            }
            tree = list_utilities.add_to_end(new_tree_level, tree);
            remaining = still_remaining;
            depth = Numbers.add(depth, (SubLObject)gke_main.ONE_INTEGER);
        }
        final SubLObject cycleP = (SubLObject)SubLObjectFactory.makeBoolean((gke_main.NIL == max_depth || depth.numL(max_depth)) && gke_main.NIL != list_utilities.non_empty_list_p(remaining));
        if (gke_main.NIL != cycleP && gke_main.NIL == recursedP) {
            break_replacement_renderer_cycles(remaining, renderer_to_superiors);
            listy_grove = replacement_renderer_grove_recursive(renderer_nodes, renderer_to_superiors, (SubLObject)gke_main.T);
        }
        else if (gke_main.NIL != cycleP) {
            Errors.sublisp_break((SubLObject)gke_main.$str163$Unable_to_place__D_renderers, new SubLObject[] { Sequences.length(remaining) });
        }
        else if (depth.numG((SubLObject)gke_main.ONE_INTEGER)) {
            if (gke_main.NIL != list_utilities.non_empty_list_p(remaining)) {
                Errors.warn((SubLObject)gke_main.$str164$Hit_max_depth_of__D__Pruning__D_r, max_depth, Sequences.length(remaining));
            }
            listy_grove = (SubLObject)gke_main.NIL;
            final SubLObject set_var = tree.first();
            final SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject root_node;
            SubLObject listy_tree;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)gke_main.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); gke_main.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                root_node = set_contents.do_set_contents_next(basis_object, state);
                if (gke_main.NIL != set_contents.do_set_contents_element_validP(state, root_node)) {
                    listy_tree = listy_replacement_tree(root_node, tree);
                    if (gke_main.NIL == gke_main.$omit_suggestion_stumpsP$.getGlobalValue() || gke_main.NIL == list_utilities.lengthLE(listy_tree, (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.UNPROVIDED)) {
                        listy_grove = (SubLObject)ConsesLow.cons(listy_tree, listy_grove);
                    }
                }
            }
        }
        return listy_grove;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 59368L)
    public static SubLObject add_one_renderer(final SubLObject renderer_node, final SubLObject renderer_to_superiors, final SubLObject new_tree_level, final SubLObject tree) {
        assert gke_main.NIL != replacement_tree_p(renderer_node) : renderer_node;
        final SubLObject list_var = dictionary.dictionary_keys(renderer_to_superiors);
        assert gke_main.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)gke_main.NIL;
        elem = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            assert gke_main.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject renderer = replacement_tree_root(renderer_node);
        final SubLObject this_term = conses_high.second(renderer);
        final SubLObject traceP = (SubLObject)gke_main.NIL;
        final SubLObject superiors = dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, (SubLObject)gke_main.NIL);
        final SubLObject list_var2 = set.set_element_list(superiors);
        assert gke_main.NIL != list_utilities.non_dotted_list_p(list_var2) : list_var2;
        SubLObject cdolist_list_var2 = list_var2;
        SubLObject elem2 = (SubLObject)gke_main.NIL;
        elem2 = cdolist_list_var2.first();
        while (gke_main.NIL != cdolist_list_var2) {
            assert gke_main.NIL != replacement_tree_p(elem2) : elem2;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem2 = cdolist_list_var2.first();
        }
        if (gke_main.NIL != traceP) {
            PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str165$__Placing__S_under_superiors___S_, this_term, Mapping.mapcar((SubLObject)gke_main.$sym166$SECOND, set.set_element_list(superiors)));
        }
        set.set_add(renderer_node, new_tree_level);
        SubLObject doneP = (SubLObject)gke_main.NIL;
        final SubLObject remaining_superiors = set.copy_set(superiors);
        if (gke_main.NIL == doneP) {
            SubLObject end_var;
            SubLObject i;
            SubLObject tree_level;
            SubLObject set_contents_var;
            SubLObject basis_object;
            SubLObject state;
            SubLObject superior;
            SubLObject foundP;
            for (end_var = (SubLObject)gke_main.MINUS_ONE_INTEGER, i = (SubLObject)gke_main.NIL, i = number_utilities.f_1_(Sequences.length(tree)); gke_main.NIL == doneP && !i.numLE(end_var); doneP = set.set_emptyP(remaining_superiors), i = Numbers.add(i, (SubLObject)gke_main.MINUS_ONE_INTEGER)) {
                tree_level = ConsesLow.nth(i, tree);
                set_contents_var = set.do_set_internal(superiors);
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)gke_main.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); gke_main.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    superior = set_contents.do_set_contents_next(basis_object, state);
                    if (gke_main.NIL != set_contents.do_set_contents_element_validP(state, superior) && gke_main.NIL != set.set_memberP(superior, remaining_superiors)) {
                        foundP = (SubLObject)gke_main.NIL;
                        if (gke_main.NIL != set.set_memberP(superior, tree_level)) {
                            foundP = (SubLObject)gke_main.T;
                            if (gke_main.NIL != traceP) {
                                PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str167$__Found__S_on_level__D___, conses_high.second(superior), i);
                            }
                            if (gke_main.NIL == renderer_tree_contains_rendererP(superior, renderer_node, i, tree, traceP)) {
                                if (gke_main.NIL != traceP) {
                                    PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str168$__Not_in_subtree__so_adding__S_un, new SubLObject[] { this_term, conses_high.second(superior), i });
                                }
                                replacement_tree_add_child(superior, renderer_node);
                                if (gke_main.NIL != traceP) {
                                    PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str169$___Tree_level__D_is_now__S___, i, tree_level);
                                }
                            }
                        }
                        if (gke_main.NIL != foundP) {
                            set.set_remove(superior, remaining_superiors);
                        }
                    }
                }
            }
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 61191L)
    public static SubLObject renderer_tree_contains_rendererP(final SubLObject root, final SubLObject renderer, final SubLObject i, final SubLObject tree, SubLObject traceP) {
        if (traceP == gke_main.UNPROVIDED) {
            traceP = (SubLObject)gke_main.NIL;
        }
        assert gke_main.NIL != replacement_tree_p(root) : root;
        assert gke_main.NIL != replacement_tree_p(renderer) : renderer;
        SubLObject foundP = (SubLObject)gke_main.NIL;
        final SubLObject immediate_subnodes = replacement_tree_children(root);
        if (gke_main.NIL == foundP) {
            SubLObject csome_list_var = immediate_subnodes;
            SubLObject subnode = (SubLObject)gke_main.NIL;
            subnode = csome_list_var.first();
            while (gke_main.NIL == foundP && gke_main.NIL != csome_list_var) {
                if (replacement_tree_root(renderer).equal(replacement_tree_root(subnode))) {
                    foundP = (SubLObject)gke_main.T;
                    if (gke_main.NIL != traceP) {
                        print_high.print((SubLObject)gke_main.$str170$Found_it_, (SubLObject)gke_main.UNPROVIDED);
                    }
                }
                else if (gke_main.NIL != list_utilities.lengthG(tree, number_utilities.f_1X(i), (SubLObject)gke_main.UNPROVIDED)) {
                    foundP = renderer_tree_contains_rendererP(subnode, renderer, number_utilities.f_1X(i), tree, traceP);
                }
                csome_list_var = csome_list_var.rest();
                subnode = csome_list_var.first();
            }
        }
        return foundP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 61777L)
    public static SubLObject break_replacement_renderer_cycles(final SubLObject remaining, final SubLObject renderer_to_superiors) {
        assert gke_main.NIL != list_utilities.non_dotted_list_p(remaining) : remaining;
        SubLObject cdolist_list_var = remaining;
        SubLObject elem = (SubLObject)gke_main.NIL;
        elem = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            assert gke_main.NIL != replacement_tree_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject still_remaining = conses_high.copy_list(remaining);
        cdolist_list_var = remaining;
        SubLObject renderer_node = (SubLObject)gke_main.NIL;
        renderer_node = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            final SubLObject renderer = replacement_tree_root(renderer_node);
            final SubLObject superiors = dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject old_size = set.set_size(superiors);
            set_utilities.set_remove_all(still_remaining, superiors);
            final SubLObject new_size = set.set_size(dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, (SubLObject)gke_main.UNPROVIDED));
            if (old_size.numG(new_size)) {}
            still_remaining = Sequences.delete(renderer, still_remaining, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            renderer_node = cdolist_list_var.first();
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 62525L)
    public static SubLObject listy_replacement_tree(final SubLObject root_node, final SubLObject tree) {
        SubLObject subnodes = (SubLObject)gke_main.NIL;
        if (gke_main.NIL != list_utilities.non_empty_list_p(tree)) {
            SubLObject cdolist_list_var = replacement_tree_children(root_node);
            SubLObject subnode = (SubLObject)gke_main.NIL;
            subnode = cdolist_list_var.first();
            while (gke_main.NIL != cdolist_list_var) {
                subnodes = (SubLObject)ConsesLow.cons(listy_replacement_tree(subnode, tree.rest()), subnodes);
                cdolist_list_var = cdolist_list_var.rest();
                subnode = cdolist_list_var.first();
            }
        }
        return (SubLObject)ConsesLow.cons(replacement_tree_root(root_node), Sequences.nreverse(subnodes));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 62847L)
    public static SubLObject postpone_adding_replacementP(final SubLObject renderer_node, final SubLObject tree, final SubLObject renderer_to_superiors) {
        assert gke_main.NIL != replacement_tree_p(renderer_node) : renderer_node;
        SubLObject postponeP = (SubLObject)gke_main.NIL;
        final SubLObject renderer = replacement_tree_root(renderer_node);
        final SubLObject this_term = conses_high.second(renderer);
        final SubLObject traceP = (SubLObject)gke_main.NIL;
        final SubLObject superiors = dictionary.dictionary_lookup_without_values(renderer_to_superiors, renderer, (SubLObject)gke_main.NIL);
        final SubLObject set_contents_var = set.do_set_internal(superiors);
        SubLObject basis_object;
        SubLObject state;
        SubLObject superior;
        SubLObject foundP;
        SubLObject csome_list_var;
        SubLObject tree_level;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)gke_main.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); gke_main.NIL == postponeP && gke_main.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            superior = set_contents.do_set_contents_next(basis_object, state);
            if (gke_main.NIL != set_contents.do_set_contents_element_validP(state, superior)) {
                foundP = (SubLObject)gke_main.NIL;
                if (gke_main.NIL == foundP) {
                    for (csome_list_var = tree, tree_level = (SubLObject)gke_main.NIL, tree_level = csome_list_var.first(); gke_main.NIL == foundP && gke_main.NIL != csome_list_var; foundP = set.set_memberP(superior, tree_level), csome_list_var = csome_list_var.rest(), tree_level = csome_list_var.first()) {}
                }
                if (gke_main.NIL == foundP) {
                    if (gke_main.NIL != traceP) {
                        PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str171$__Postponing__S_because__S_is_not, this_term, superior);
                    }
                    postponeP = (SubLObject)gke_main.T;
                }
            }
        }
        return postponeP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 63678L)
    public static SubLObject replacement_renderer_tree_specifications(final SubLObject focal_term, final SubLObject mt, final SubLObject problem_store) {
        final SubLObject query_sentence = el_utilities.make_existential((SubLObject)gke_main.$sym172$_COL, simplifier.disjoin((SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS(gke_main.$const173$suggestionGenlClassOrderedBy, focal_term, (SubLObject)gke_main.$list174), simplifier.conjoin((SubLObject)ConsesLow.list((SubLObject)gke_main.$list175, (SubLObject)ConsesLow.listS(gke_main.$const94$isa, focal_term, (SubLObject)gke_main.$list176)), (SubLObject)gke_main.UNPROVIDED)), (SubLObject)gke_main.UNPROVIDED));
        final SubLObject template = (SubLObject)gke_main.$list177;
        return ask_utilities.query_template(template, query_sentence, mt, (SubLObject)ConsesLow.list((SubLObject)gke_main.$kw178$PROBLEM_STORE, problem_store, (SubLObject)gke_main.$kw179$INFERENCE_MODE, (SubLObject)gke_main.$kw180$MINIMAL, (SubLObject)gke_main.$kw181$ANSWER_LANGUAGE, (SubLObject)gke_main.$kw182$HL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 64208L)
    public static SubLObject replacement_renderer_tree_conflation_preds(final SubLObject focal_term, final SubLObject mt, final SubLObject problem_store) {
        final SubLObject query_sentence = el_utilities.make_existential((SubLObject)gke_main.$sym172$_COL, simplifier.disjoin((SubLObject)ConsesLow.list(simplifier.conjoin((SubLObject)ConsesLow.list((SubLObject)gke_main.$list183, (SubLObject)ConsesLow.listS(gke_main.$const184$genls, focal_term, (SubLObject)gke_main.$list176)), (SubLObject)gke_main.UNPROVIDED), simplifier.conjoin((SubLObject)ConsesLow.list((SubLObject)gke_main.$list185, (SubLObject)ConsesLow.listS(gke_main.$const94$isa, focal_term, (SubLObject)gke_main.$list176)), (SubLObject)gke_main.UNPROVIDED)), (SubLObject)gke_main.UNPROVIDED));
        return ask_utilities.query_variable((SubLObject)gke_main.$sym186$_SET, query_sentence, mt, (SubLObject)ConsesLow.list((SubLObject)gke_main.$kw178$PROBLEM_STORE, problem_store, (SubLObject)gke_main.$kw179$INFERENCE_MODE, (SubLObject)gke_main.$kw180$MINIMAL, (SubLObject)gke_main.$kw181$ANSWER_LANGUAGE, (SubLObject)gke_main.$kw182$HL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 64849L)
    public static SubLObject renderer_to_superiors_table(final SubLObject renderer_nodes, final SubLObject mt, final SubLObject bin_pred, final SubLObject argnum, final SubLObject problem_store, SubLObject table) {
        if (table == gke_main.UNPROVIDED) {
            table = (SubLObject)gke_main.NIL;
        }
        if (gke_main.NIL == table) {
            table = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)gke_main.EQL), Sequences.length(renderer_nodes));
        }
        final SubLObject renderer_nodes_from_terms = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)gke_main.EQL), Sequences.length(renderer_nodes));
        SubLObject cdolist_list_var = renderer_nodes;
        SubLObject renderer_node = (SubLObject)gke_main.NIL;
        renderer_node = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(renderer_nodes_from_terms, conses_high.second(replacement_tree_root(renderer_node)), renderer_node);
            cdolist_list_var = cdolist_list_var.rest();
            renderer_node = cdolist_list_var.first();
        }
        cdolist_list_var = renderer_nodes;
        renderer_node = (SubLObject)gke_main.NIL;
        renderer_node = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            final SubLObject renderer = replacement_tree_root(renderer_node);
            final SubLObject this_term = conses_high.second(renderer);
            final SubLObject traceP = (SubLObject)gke_main.NIL;
            final SubLObject superiors = superiors_for_renderer_term(this_term, mt, bin_pred, argnum, problem_store);
            SubLObject filtered_renderers = dictionary.dictionary_lookup_without_values(table, renderer, (SubLObject)gke_main.UNPROVIDED);
            if (gke_main.NIL != traceP) {
                PrintLow.format((SubLObject)gke_main.T, (SubLObject)gke_main.$str187$__Filtered_renderers___S__, filtered_renderers);
            }
            if (gke_main.NIL == set.set_p(filtered_renderers)) {
                filtered_renderers = set.new_set(Symbols.symbol_function((SubLObject)gke_main.EQL), (SubLObject)gke_main.UNPROVIDED);
                dictionary.dictionary_enter(table, renderer, filtered_renderers);
            }
            SubLObject cdolist_list_var_$59 = superiors;
            SubLObject superior = (SubLObject)gke_main.NIL;
            superior = cdolist_list_var_$59.first();
            while (gke_main.NIL != cdolist_list_var_$59) {
                final SubLObject renderer_node_$60 = dictionary.dictionary_lookup_without_values(renderer_nodes_from_terms, superior, (SubLObject)gke_main.UNPROVIDED);
                if (gke_main.NIL != renderer_node_$60) {
                    set.set_add(renderer_node_$60, filtered_renderers);
                }
                cdolist_list_var_$59 = cdolist_list_var_$59.rest();
                superior = cdolist_list_var_$59.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            renderer_node = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 66461L)
    public static SubLObject superiors_for_renderer_term(final SubLObject this_term, final SubLObject mt, final SubLObject bin_pred, final SubLObject argnum, final SubLObject problem_store) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = (SubLObject)gke_main.NIL;
        if (gke_main.NIL != kb_indexing_datastructures.indexed_term_p(this_term) && bin_pred.eql(gke_main.$const184$genls)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt_relevance_macros.determine_inference_mt_relevance_el_spec(mt));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (argnum.eql((SubLObject)gke_main.ONE_INTEGER)) {
                    superiors = genls.all_specs(this_term, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                }
                else if (argnum.eql((SubLObject)gke_main.TWO_INTEGER)) {
                    superiors = genls.all_genls(this_term, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject this_argnum = Numbers.subtract((SubLObject)gke_main.THREE_INTEGER, argnum);
            final SubLObject variable = (SubLObject)gke_main.$kw189$X;
            final SubLObject query_sentence = el_utilities.replace_formula_arg(this_argnum, this_term, el_utilities.make_binary_formula(bin_pred, variable, variable));
            SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)gke_main.$kw178$PROBLEM_STORE, problem_store, (SubLObject)gke_main.$kw181$ANSWER_LANGUAGE, (SubLObject)gke_main.$kw182$HL, (SubLObject)gke_main.$kw179$INFERENCE_MODE, (SubLObject)gke_main.$kw180$MINIMAL);
            if (gke_main.NIL == gke_main.$use_tva_for_suggestionsP$.getGlobalValue()) {
                v_properties = conses_high.putf(v_properties, (SubLObject)gke_main.$kw190$ALLOWED_MODULES, (SubLObject)gke_main.$list191);
            }
            superiors = ask_utilities.query_variable(variable, query_sentence, mt, v_properties);
        }
        return Sequences.delete(this_term, superiors, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 67679L)
    public static SubLObject gke_subst_nl_for_inference_answer(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject binding_list = inference_kernel.inference_answer_el_bindings(inference_answer);
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$61 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$62 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$63 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$64 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$65 = pph_vars.$pph_inference_answer$.currentBinding(thread);
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
                                        pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)gke_main.T, thread);
                                        pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)gke_main.UNPROVIDED), thread);
                                        pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)gke_main.T, thread);
                                        pph_vars.$pph_repositioned_proofs$.bind((SubLObject)gke_main.NIL, thread);
                                        pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
                                        pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
                                        pph_vars.$pph_proof_depth$.bind((SubLObject)gke_main.ZERO_INTEGER, thread);
                                        pph_vars.$pph_displayed_supports$.bind((SubLObject)gke_main.NIL, thread);
                                        thread.resetMultipleValues();
                                        final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                                        final SubLObject html_target = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$66 = pph_vars.$constant_link_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$67 = pph_vars.$html_generation_target$.currentBinding(thread);
                                        try {
                                            pph_vars.$constant_link_function$.bind((gke_main.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                                            pph_vars.$html_generation_target$.bind((gke_main.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                                            SubLObject cdolist_list_var = binding_list;
                                            SubLObject binding = (SubLObject)gke_main.NIL;
                                            binding = cdolist_list_var.first();
                                            while (gke_main.NIL != cdolist_list_var) {
                                                result = (SubLObject)ConsesLow.cons(gke_subst_nl_for_binding(binding), result);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                binding = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            pph_vars.$html_generation_target$.rebind(_prev_bind_1_$67, thread);
                                            pph_vars.$constant_link_function$.rebind(_prev_bind_0_$66, thread);
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
                                        pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$65, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$67 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$64, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$63, thread);
                        }
                        if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$62, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (gke_main.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$61, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 68263L)
    public static SubLObject gke_subst_nl_for_binding(final SubLObject binding) {
        SubLObject variable = (SubLObject)gke_main.NIL;
        SubLObject value = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(binding, binding, (SubLObject)gke_main.$list192);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        final SubLObject java_phrase = (SubLObject)ConsesLow.list(pph_main.generate_phrase_for_java(value, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED), value);
        final SubLObject variable_string = variable_to_nl_string(variable);
        return (SubLObject)ConsesLow.cons(variable_string, java_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 68540L)
    public static SubLObject el_binding_list_to_gke_binding_list(SubLObject el_binding_list, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gke_main.NIL != list_utilities.empty_list_p(el_binding_list)) {
            el_binding_list = (SubLObject)gke_main.$list193;
        }
        SubLObject result = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$70 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$71 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$72 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$73 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject _prev_bind_0_$74 = pph_vars.$pph_inference_answer$.currentBinding(thread);
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
                                        pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)gke_main.T, thread);
                                        pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)gke_main.UNPROVIDED), thread);
                                        pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)gke_main.T, thread);
                                        pph_vars.$pph_repositioned_proofs$.bind((SubLObject)gke_main.NIL, thread);
                                        pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
                                        pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
                                        pph_vars.$pph_proof_depth$.bind((SubLObject)gke_main.ZERO_INTEGER, thread);
                                        pph_vars.$pph_displayed_supports$.bind((SubLObject)gke_main.NIL, thread);
                                        thread.resetMultipleValues();
                                        final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                                        final SubLObject html_target = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        final SubLObject _prev_bind_0_$75 = pph_vars.$constant_link_function$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$76 = pph_vars.$html_generation_target$.currentBinding(thread);
                                        try {
                                            pph_vars.$constant_link_function$.bind((gke_main.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                                            pph_vars.$html_generation_target$.bind((gke_main.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                                            SubLObject cdolist_list_var = el_binding_list;
                                            SubLObject el_binding = (SubLObject)gke_main.NIL;
                                            el_binding = cdolist_list_var.first();
                                            while (gke_main.NIL != cdolist_list_var) {
                                                result = (SubLObject)ConsesLow.cons(el_binding_to_gke_binding(el_binding), result);
                                                cdolist_list_var = cdolist_list_var.rest();
                                                el_binding = cdolist_list_var.first();
                                            }
                                        }
                                        finally {
                                            pph_vars.$html_generation_target$.rebind(_prev_bind_1_$76, thread);
                                            pph_vars.$constant_link_function$.rebind(_prev_bind_0_$75, thread);
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
                                        pph_vars.$pph_inference_answer$.rebind(_prev_bind_0_$74, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$73, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$72, thread);
                        }
                        if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$71, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (gke_main.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$77, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$70, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 69011L)
    public static SubLObject el_binding_to_gke_binding(final SubLObject el_binding) {
        SubLObject variable = (SubLObject)gke_main.NIL;
        SubLObject value = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(el_binding, el_binding, (SubLObject)gke_main.$list192);
        variable = el_binding.first();
        final SubLObject current = value = el_binding.rest();
        final SubLObject variable_string = variable_to_nl_string(variable);
        final SubLObject pph_result = pph_main.generate_phrase_for_java(value, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        final SubLObject java_phrase = (SubLObject)((gke_main.NIL != pph_utilities.pph_javalist_p(pph_result)) ? pph_utilities.possibly_optimize_pph_javalist_for_alphabetization(pph_result) : gke_main.NIL);
        final SubLObject offer_fact_sheetP = fact_sheets.term_ok_for_fact_sheet_p(value, (SubLObject)gke_main.UNPROVIDED);
        return (SubLObject)ConsesLow.list(variable_string, java_phrase, value, offer_fact_sheetP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 69546L)
    public static SubLObject variable_to_nl_string(final SubLObject variable) {
        SubLObject variable_string = string_utilities.substring(Strings.string_downcase(string_utilities.to_string(variable), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED), (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.UNPROVIDED);
        variable_string = string_utilities.string_substitute((SubLObject)gke_main.$str194$_, (SubLObject)gke_main.$str195$_, variable_string, (SubLObject)gke_main.UNPROVIDED);
        return pph_utilities.add_title_capitalization(variable_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 69804L)
    public static SubLObject gke_start_continuable_query(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == gke_main.UNPROVIDED) {
            v_properties = (SubLObject)gke_main.NIL;
        }
        enforceType(sentence, gke_main.$sym93$EL_FORMULA_P);
        enforceType(mt, gke_main.$sym196$POSSIBLY_MT_P);
        enforceType(v_properties, gke_main.$sym197$QUERY_PROPERTIES_P);
        final SubLObject optimized_sentence = el_utilities.optimize_el_formula_variable_names(sentence, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(optimized_sentence);
        final SubLObject static_properties = list_utilities.nmerge_plist(inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_properties), (SubLObject)ConsesLow.list((SubLObject)gke_main.$kw198$CONDITIONAL_SENTENCE_, conditionalP));
        final SubLObject inference = inference_kernel.new_continuable_inference(optimized_sentence, mt, static_properties);
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(inference_datastructures_inference.inference_problem_store(inference));
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject special_state = special_variable_state.new_special_variable_state((SubLObject)gke_main.$list199);
        return gke_continue_query(problem_store_id, inference_id, v_properties, special_state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 70822L)
    public static SubLObject gke_warn(final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return print_high.princ(message, StreamsLow.$standard_output$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 70966L)
    public static SubLObject gke_continue_query(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject v_properties, SubLObject special_state) {
        if (special_state == gke_main.UNPROVIDED) {
            special_state = (SubLObject)gke_main.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        enforceType(v_properties, gke_main.$sym34$LISTP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_properties);
        if (gke_main.NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
            final SubLObject old_process_wrapper = Hashtables.gethash(string_utilities.to_string((SubLObject)ConsesLow.list(problem_store_id, inference_id)), gke_main.$gke_query_threads$.getDynamicValue(thread), (SubLObject)gke_main.UNPROVIDED);
            final SubLObject gke_process = new_gke_process(problem_store_id, inference_id, dynamic_properties, special_state);
            final SubLObject oldest_process_wrapper = (gke_main.NIL != old_process_wrapper) ? old_process_wrapper : gke_process;
            final SubLObject old_queue = process_utilities.process_wrapper_get_property(oldest_process_wrapper, (SubLObject)gke_main.$kw205$QUEUE, (SubLObject)gke_main.UNPROVIDED);
            final SubLObject results_queue = (gke_main.NIL != old_queue) ? old_queue : queues.create_queue((SubLObject)gke_main.UNPROVIDED);
            final SubLObject daemon = new_results_daemon(problem_store_id, inference_id, results_queue);
            process_utilities.process_wrapper_set_property(gke_process, (SubLObject)gke_main.$kw205$QUEUE, results_queue);
            process_utilities.process_wrapper_set_property(gke_process, (SubLObject)gke_main.$kw206$DAEMON, daemon);
            Hashtables.sethash(string_utilities.to_string((SubLObject)ConsesLow.list(problem_store_id, inference_id)), gke_main.$gke_query_threads$.getDynamicValue(thread), gke_process);
            return (SubLObject)ConsesLow.list(problem_store_id, inference_id);
        }
        return (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)gke_main.NIL, (SubLObject)gke_main.$str207$Error_with_query___A__, inference_datastructures_inference.inference_status(inference)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 72555L)
    public static SubLObject new_gke_process(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject dynamic_properties, SubLObject special_state) {
        if (special_state == gke_main.UNPROVIDED) {
            special_state = (SubLObject)gke_main.NIL;
        }
        final SubLObject gke_process = process_utilities.new_process_wrapper(PrintLow.format((SubLObject)gke_main.NIL, (SubLObject)gke_main.$str212$gke_query_thread__A__A, problem_store_id, inference_id), (SubLObject)gke_main.$sym213$GKE_RUN_INFERENCE, (SubLObject)ConsesLow.list(problem_store_id, inference_id, dynamic_properties, special_state));
        return gke_process;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 72920L)
    public static SubLObject new_results_daemon(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject queue) {
        final SubLObject daemon = process_utilities.new_process_wrapper(PrintLow.format((SubLObject)gke_main.NIL, (SubLObject)gke_main.$str214$results_daemon__A__A, problem_store_id, inference_id), (SubLObject)gke_main.$sym215$RESULTS_DAEMON, (SubLObject)ConsesLow.list(problem_store_id, inference_id, queue));
        return daemon;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 73192L)
    public static SubLObject results_daemon(final SubLObject process_wrapper, final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, inference_id);
        SubLObject current_answer = (SubLObject)gke_main.ZERO_INTEGER;
        SubLObject ignore_errors_tag = (SubLObject)gke_main.NIL;
        try {
            thread.throwStack.push(gke_main.$kw216$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)gke_main.$sym217$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject _prev_bind_0_$79 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
                    try {
                        pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$80 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                        try {
                            pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                            final SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                final SubLObject _prev_bind_0_$81 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                try {
                                    pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                    final SubLObject new_or_reused = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    final SubLObject _prev_bind_0_$82 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                        final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                        final SubLObject _prev_bind_0_$83 = memoization_state.$memoization_state$.currentBinding(thread);
                                        try {
                                            memoization_state.$memoization_state$.bind(local_state, thread);
                                            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                            try {
                                                if (gke_main.NIL == daemon_should_run(inference, current_answer)) {
                                                    Threads.sleep((SubLObject)gke_main.ONE_INTEGER);
                                                }
                                                while (gke_main.NIL != daemon_should_run(inference, current_answer)) {
                                                    for (SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, current_answer); gke_main.NIL != inference_answer; inference_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, current_answer)) {
                                                        current_answer = Numbers.add(current_answer, (SubLObject)gke_main.ONE_INTEGER);
                                                        final SubLObject _prev_bind_0_$84 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                                        try {
                                                            pph_vars.$pph_domain_mt$.bind(inference_datastructures_inference.inference_mt(inference), thread);
                                                            final SubLObject el_bindings = inference_kernel.inference_answer_el_bindings(inference_answer);
                                                            final SubLObject gke_bindings = el_binding_list_to_gke_binding_list(el_bindings, inference_answer);
                                                            final SubLObject source_icon_data = sources.source_icon_paths_for_inference_answer(inference_answer);
                                                            final SubLObject plist_to_enqueue = (SubLObject)ConsesLow.list((SubLObject)gke_main.$kw218$BINDINGS, gke_bindings, (SubLObject)gke_main.$kw219$SOURCE_ICONS, source_icon_data);
                                                            queues.enqueue(plist_to_enqueue, queue);
                                                        }
                                                        finally {
                                                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$84, thread);
                                                        }
                                                    }
                                                    Threads.sleep((SubLObject)gke_main.ONE_INTEGER);
                                                }
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$85 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                                    final SubLObject _values = Values.getValuesAsVector();
                                                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                                    Values.restoreValuesFromVector(_values);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
                                                }
                                            }
                                        }
                                        finally {
                                            memoization_state.$memoization_state$.rebind(_prev_bind_0_$83, thread);
                                        }
                                    }
                                    finally {
                                        pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$82, thread);
                                    }
                                    if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                                        memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                    }
                                }
                                finally {
                                    pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$81, thread);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$86 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (gke_main.NIL == reuseP) {
                                        pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                }
                            }
                        }
                        finally {
                            pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$80, thread);
                        }
                    }
                    finally {
                        pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$79, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)gke_main.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)gke_main.$kw216$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 74863L)
    public static SubLObject daemon_should_run(final SubLObject inference, final SubLObject current_answer) {
        final SubLObject status = inference_datastructures_inference.inference_status(inference);
        final SubLObject current_count = id_index.id_index_count(inference_datastructures_inference.inference_answer_id_index(inference));
        return (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL != subl_promotions.memberP(status, gke_main.$daemon_should_run_inference_statuses$.getGlobalValue(), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED) || current_count.numG(current_answer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 75454L)
    public static SubLObject gke_run_inference(final SubLObject process_wrapper, final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject dynamic_properties, SubLObject special_state) {
        if (special_state == gke_main.UNPROVIDED) {
            special_state = (SubLObject)gke_main.NIL;
        }
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, inference_id);
        final SubLObject adjusted_dynamic_properties = (gke_main.NIL != gke_main.$gke_run_inference_with_adjusted_dynamic_propertiesP$.getGlobalValue()) ? list_utilities.nmerge_plist((SubLObject)ConsesLow.list((SubLObject)gke_main.$kw221$MAX_TIME, (SubLObject)gke_main.NIL, (SubLObject)gke_main.$kw222$MAX_TRANSFORMATION_DEPTH, (SubLObject)gke_main.THREE_INTEGER), dynamic_properties) : dynamic_properties;
        if (gke_main.NIL != inference_datastructures_inference.continuable_inference_p(inference)) {
            if (gke_main.NIL != special_state) {
                final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(special_state);
                final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
                try {
                    Dynamic.bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(special_state));
                    enforceType(special_state, gke_main.$sym223$SPECIAL_VARIABLE_STATE_P);
                    inference_kernel.continue_inference(inference, adjusted_dynamic_properties);
                }
                finally {
                    Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
                }
            }
            else {
                inference_kernel.continue_inference(inference, adjusted_dynamic_properties);
            }
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 76315L)
    public static SubLObject gke_get_one_inference_result(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        final SubLObject process_wrapper = Hashtables.gethash(string_utilities.to_string((SubLObject)ConsesLow.list(problem_store_id, inference_id)), gke_main.$gke_query_threads$.getDynamicValue(thread), (SubLObject)gke_main.UNPROVIDED);
        if (gke_main.NIL != process_wrapper) {
            final SubLObject queue = process_utilities.process_wrapper_get_property(process_wrapper, (SubLObject)gke_main.$kw205$QUEUE, (SubLObject)gke_main.UNPROVIDED);
            if (gke_main.NIL != queue) {
                return queues.dequeue(queue);
            }
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 76761L)
    public static SubLObject gke_get_inference_results(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(problem_store_id, gke_main.$sym228$ID_OF_VALID_PROBLEM_STORE_P);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(problem_store, inference_id);
        SubLObject ans = (SubLObject)gke_main.NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind((SubLObject)gke_main.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$87 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$88 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$89 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$90 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
                                    if (gke_main.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)gke_main.$kw229$SKIP)) {
                                        final SubLObject idx_$91 = idx;
                                        if (gke_main.NIL == id_index.id_index_dense_objects_empty_p(idx_$91, (SubLObject)gke_main.$kw229$SKIP)) {
                                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$91);
                                            final SubLObject backwardP_var = (SubLObject)gke_main.NIL;
                                            SubLObject length;
                                            SubLObject v_iteration;
                                            SubLObject id;
                                            SubLObject inference_answer;
                                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)gke_main.NIL, v_iteration = (SubLObject)gke_main.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)gke_main.ONE_INTEGER)) {
                                                id = ((gke_main.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)gke_main.ONE_INTEGER) : v_iteration);
                                                inference_answer = Vectors.aref(vector_var, id);
                                                if (gke_main.NIL == id_index.id_index_tombstone_p(inference_answer) || gke_main.NIL == id_index.id_index_skip_tombstones_p((SubLObject)gke_main.$kw229$SKIP)) {
                                                    if (gke_main.NIL != id_index.id_index_tombstone_p(inference_answer)) {
                                                        inference_answer = (SubLObject)gke_main.$kw229$SKIP;
                                                    }
                                                    ans = (SubLObject)ConsesLow.cons(gke_subst_nl_for_inference_answer(inference_answer), ans);
                                                }
                                            }
                                        }
                                        final SubLObject idx_$92 = idx;
                                        if (gke_main.NIL == id_index.id_index_sparse_objects_empty_p(idx_$92)) {
                                            final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$92);
                                            SubLObject id2 = (SubLObject)gke_main.NIL;
                                            SubLObject inference_answer2 = (SubLObject)gke_main.NIL;
                                            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                            try {
                                                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                    id2 = Hashtables.getEntryKey(cdohash_entry);
                                                    inference_answer2 = Hashtables.getEntryValue(cdohash_entry);
                                                    ans = (SubLObject)ConsesLow.cons(gke_subst_nl_for_inference_answer(inference_answer2), ans);
                                                }
                                            }
                                            finally {
                                                Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                            }
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$91 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$91, thread);
                                    }
                                }
                            }
                            finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$90, thread);
                            }
                        }
                        finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$89, thread);
                        }
                        if (new_or_reused == gke_main.$kw16$NEW && gke_main.NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    }
                    finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$88, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gke_main.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (gke_main.NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$92, thread);
                    }
                }
            }
            finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$87, thread);
            }
        }
        finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 77632L)
    public static SubLObject gke_inference_completeP(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        if (gke_main.NIL == inference_datastructures_inference.inference_p(inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id))) {
            return (SubLObject)gke_main.T;
        }
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject status = inference_datastructures_inference.inference_status(inference);
        final SubLObject key = string_utilities.to_string((SubLObject)ConsesLow.list(problem_store_id, inference_id));
        final SubLObject gke_process = Hashtables.gethash(key, gke_main.$gke_query_threads$.getDynamicValue(thread), (SubLObject)gke_main.UNPROVIDED);
        final SubLObject queue = process_utilities.process_wrapper_get_property(gke_process, (SubLObject)gke_main.$kw205$QUEUE, (SubLObject)gke_main.UNPROVIDED);
        final SubLObject daemon = process_utilities.process_wrapper_get_property(gke_process, (SubLObject)gke_main.$kw206$DAEMON, (SubLObject)gke_main.UNPROVIDED);
        return (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL != subl_promotions.memberP(status, gke_main.$inference_done_statuses$.getGlobalValue(), (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED) && gke_main.NIL != queues.queue_empty_p(queue) && gke_main.NIL != process_utilities.process_wrapper_process_completedP(daemon));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 78486L)
    public static SubLObject gke_get_inference_status(final SubLObject problem_store_id, final SubLObject inference_id) {
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        return inference_datastructures_inference.inference_status(inference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 78791L)
    public static SubLObject gke_get_inference_suspend_status(final SubLObject problem_store_id, final SubLObject inference_id) {
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject suspend_status = inference_datastructures_inference.inference_suspend_status(inference);
        return suspend_status;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 79157L)
    public static SubLObject gke_stop_continuable_query(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject patience) {
        if (patience == gke_main.UNPROVIDED) {
            patience = (SubLObject)gke_main.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        enforceType(patience, gke_main.$sym240$NULL_OR_INTEGERP);
        final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
        final SubLObject time_out = (gke_main.NIL != patience) ? patience : gke_main.$default_patience_wait_time$.getDynamicValue(thread);
        if (gke_main.NIL != inference_datastructures_inference.running_inference_p(inference)) {
            inference_strategist.inference_interrupt(inference, time_out);
        }
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 79648L)
    public static SubLObject gke_release_inference_resources(final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(problem_store_id, gke_main.$sym204$INTEGERP);
        enforceType(inference_id, gke_main.$sym204$INTEGERP);
        final SubLObject problem_store = inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id);
        final SubLObject key = string_utilities.to_string((SubLObject)ConsesLow.list(problem_store_id, inference_id));
        inference_datastructures_problem_store.destroy_problem_store(problem_store);
        Hashtables.remhash(key, gke_main.$gke_query_threads$.getDynamicValue(thread));
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 80068L)
    public static SubLObject null_or_integerp(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == v_object || v_object.isInteger());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 80163L)
    public static SubLObject clear_cached_gke_functions() {
        clear_gke_predicate_filteredP();
        clear_gke_filtered_termP();
        clear_gke_isas_filtered_term();
        clear_gke_get_elements();
        clear_gke_memoization_state();
        clear_candidate_replacements_for_sentence_cached();
        return (SubLObject)gke_main.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 80437L)
    public static SubLObject gke_test_queries(final SubLObject query_col) {
        return Mapping.mapcar((SubLObject)gke_main.$sym166$SECOND, ask_utilities.query_variable((SubLObject)gke_main.$sym248$_SENT, (SubLObject)ConsesLow.list(gke_main.$const55$thereExists, (SubLObject)gke_main.$sym249$_QUERY, (SubLObject)ConsesLow.listS(gke_main.$const59$and, (SubLObject)ConsesLow.list(gke_main.$const94$isa, (SubLObject)gke_main.$sym249$_QUERY, query_col), (SubLObject)gke_main.$list250)), gke_main.$const251$TestVocabularyMt, (SubLObject)gke_main.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject candidate_replacements_equalP(final SubLObject expected, final SubLObject actual) {
        SubLObject badP = (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == list_utilities.same_length_p(expected, actual));
        if (gke_main.NIL == badP) {
            SubLObject expected_one = (SubLObject)gke_main.NIL;
            SubLObject expected_one_$95 = (SubLObject)gke_main.NIL;
            SubLObject actual_one = (SubLObject)gke_main.NIL;
            SubLObject actual_one_$96 = (SubLObject)gke_main.NIL;
            expected_one = expected;
            expected_one_$95 = expected_one.first();
            actual_one = actual;
            actual_one_$96 = actual_one.first();
            while (gke_main.NIL == badP && (gke_main.NIL != actual_one || gke_main.NIL != expected_one)) {
                if (!expected_one_$95.first().equal(actual_one_$96.first()) || gke_main.NIL == list_utilities.sets_equal_equalP(expected_one_$95.rest(), actual_one_$96.rest())) {
                    badP = (SubLObject)gke_main.T;
                }
                expected_one = expected_one.rest();
                expected_one_$95 = expected_one.first();
                actual_one = actual_one.rest();
                actual_one_$96 = actual_one.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(gke_main.NIL == badP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject test_candidate_replacements(final SubLObject sentence, final SubLObject mt) {
        return cycl_utilities.expression_transform(candidate_replacements_for_sentence(sentence, mt), (SubLObject)gke_main.$sym90$NART_P, (SubLObject)gke_main.$sym91$NART_EL_FORMULA, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject test_candidate_replacement_renderers(final SubLObject sentence, final SubLObject mt, SubLObject task) {
        if (task == gke_main.UNPROVIDED) {
            task = cae_query_search.current_cae_task();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert gke_main.NIL != forts.fort_p(task) : task;
        final SubLObject _prev_bind_0 = cae_query_search.$current_cae_task$.currentBinding(thread);
        try {
            cae_query_search.$current_cae_task$.bind(task, thread);
            return cycl_utilities.expression_transform(Mapping.mapcar((SubLObject)gke_main.$sym267$SORT_RESULT, Mapping.mapcar((SubLObject)gke_main.$sym268$REMOVE_JAVALIST_DETAIL, candidate_replacement_renderers_for_sentence(sentence, mt, (SubLObject)gke_main.UNPROVIDED))), (SubLObject)gke_main.$sym90$NART_P, (SubLObject)gke_main.$sym91$NART_EL_FORMULA, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        }
        finally {
            cae_query_search.$current_cae_task$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject remove_javalist_detail(final SubLObject result) {
        return delete_javalist_detail(conses_high.copy_tree(result));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject sort_result(final SubLObject result) {
        SubLObject arg_position = (SubLObject)gke_main.NIL;
        SubLObject groves = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(result, result, (SubLObject)gke_main.$list269);
        arg_position = result.first();
        final SubLObject current = groves = result.rest();
        ConsesLow.rplacd(result, sort_groves(groves));
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject sort_groves(final SubLObject groves) {
        return Sort.sort(Mapping.mapcar((SubLObject)gke_main.$sym270$SORT_GROVE, groves), (SubLObject)gke_main.$sym271$TERM___WITH_CONSTANT_BY_NAME, (SubLObject)gke_main.$sym272$CAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject sort_grove(final SubLObject grove) {
        return Sort.sort(Mapping.mapcar((SubLObject)gke_main.$sym273$SORT_TREE, grove), (SubLObject)gke_main.$sym271$TERM___WITH_CONSTANT_BY_NAME, (SubLObject)gke_main.$sym272$CAR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject sort_tree(final SubLObject tree) {
        SubLObject root = (SubLObject)gke_main.NIL;
        SubLObject subtrees = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tree, tree, (SubLObject)gke_main.$list274);
        root = tree.first();
        final SubLObject current = subtrees = tree.rest();
        return (SubLObject)ConsesLow.cons(root, Sort.sort(Mapping.mapcar((SubLObject)gke_main.$sym273$SORT_TREE, subtrees), (SubLObject)gke_main.$sym271$TERM___WITH_CONSTANT_BY_NAME, (SubLObject)gke_main.$sym272$CAR));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject delete_javalist_detail(final SubLObject result) {
        SubLObject arg_position = (SubLObject)gke_main.NIL;
        SubLObject flat_list = (SubLObject)gke_main.NIL;
        SubLObject groves = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(result, result, (SubLObject)gke_main.$list275);
        arg_position = result.first();
        SubLObject current = result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, result, (SubLObject)gke_main.$list275);
        flat_list = current.first();
        current = current.rest();
        SubLObject cdolist_list_var;
        groves = (cdolist_list_var = current);
        SubLObject grove = (SubLObject)gke_main.NIL;
        grove = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$97 = grove;
            SubLObject tree = (SubLObject)gke_main.NIL;
            tree = cdolist_list_var_$97.first();
            while (gke_main.NIL != cdolist_list_var_$97) {
                delete_javalist_detail_from_tree(tree);
                cdolist_list_var_$97 = cdolist_list_var_$97.rest();
                tree = cdolist_list_var_$97.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            grove = cdolist_list_var.first();
        }
        ConsesLow.rplacd(result, groves);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject delete_javalist_detail_from_tree(final SubLObject tree) {
        SubLObject root = (SubLObject)gke_main.NIL;
        SubLObject subtrees = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tree, tree, (SubLObject)gke_main.$list274);
        root = tree.first();
        final SubLObject current = subtrees = tree.rest();
        SubLObject current_$99;
        final SubLObject datum_$98 = current_$99 = root;
        SubLObject javalist = (SubLObject)gke_main.NIL;
        SubLObject v_term = (SubLObject)gke_main.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$99, datum_$98, (SubLObject)gke_main.$list276);
        javalist = current_$99.first();
        current_$99 = current_$99.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current_$99, datum_$98, (SubLObject)gke_main.$list276);
        v_term = current_$99.first();
        current_$99 = current_$99.rest();
        if (gke_main.NIL == current_$99) {
            ConsesLow.rplaca(tree, v_term);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum_$98, (SubLObject)gke_main.$list276);
        }
        SubLObject cdolist_list_var = subtrees;
        SubLObject subtree = (SubLObject)gke_main.NIL;
        subtree = cdolist_list_var.first();
        while (gke_main.NIL != cdolist_list_var) {
            delete_javalist_detail_from_tree(subtree);
            cdolist_list_var = cdolist_list_var.rest();
            subtree = cdolist_list_var.first();
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject test_candidate_replacement_renderers_for_vars(final SubLObject sentence1, final SubLObject sentence2, final SubLObject mt) {
        final SubLObject result1 = candidate_replacement_renderers_for_sentence(sentence1, narts_high.nart_substitute(mt), (SubLObject)gke_main.UNPROVIDED);
        final SubLObject result2 = candidate_replacement_renderers_for_sentence(sentence2, narts_high.nart_substitute(mt), (SubLObject)gke_main.UNPROVIDED);
        return Equality.equal(result1, result2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject test_candidate_replacement_renderers_stumps(final SubLObject sentence, final SubLObject mt) {
        final SubLObject old_value = gke_main.$omit_suggestion_stumpsP$.getGlobalValue();
        SubLObject no_stumps = (SubLObject)gke_main.NIL;
        SubLObject stumps = (SubLObject)gke_main.NIL;
        gke_main.$omit_suggestion_stumpsP$.setGlobalValue((SubLObject)gke_main.T);
        no_stumps = test_candidate_replacement_renderers(sentence, mt, (SubLObject)gke_main.UNPROVIDED);
        gke_main.$omit_suggestion_stumpsP$.setGlobalValue((SubLObject)gke_main.NIL);
        stumps = test_candidate_replacement_renderers(sentence, mt, (SubLObject)gke_main.UNPROVIDED);
        gke_main.$omit_suggestion_stumpsP$.setGlobalValue(old_value);
        return cycl_utilities.expression_transform((SubLObject)ConsesLow.list(stumps, no_stumps), (SubLObject)gke_main.$sym90$NART_P, (SubLObject)gke_main.$sym91$NART_EL_FORMULA, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gke-main.lisp", position = 81098L)
    public static SubLObject nartify_and_substitute_term_into_sentence(final SubLObject v_term, final SubLObject sentence, final SubLObject arg_pos, final SubLObject replace_all, final SubLObject domain_mt, SubLObject try_coercionP, SubLObject allow_non_wffP, SubLObject optimize_var_namesP) {
        if (try_coercionP == gke_main.UNPROVIDED) {
            try_coercionP = (SubLObject)gke_main.T;
        }
        if (allow_non_wffP == gke_main.UNPROVIDED) {
            allow_non_wffP = (SubLObject)gke_main.NIL;
        }
        if (optimize_var_namesP == gke_main.UNPROVIDED) {
            optimize_var_namesP = (SubLObject)gke_main.T;
        }
        return substitute_term_into_sentence(v_term, narts_high.nart_substitute(sentence), arg_pos, replace_all, domain_mt, try_coercionP, allow_non_wffP, optimize_var_namesP);
    }
    
    public static SubLObject declare_gke_main_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_arg_options", "GET-GKE-ARG-OPTIONS", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_arg_option_isa_relation", "GET-ARG-OPTION-ISA-RELATION", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_arg_option_collection", "GET-ARG-OPTION-COLLECTION", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_arg_option_individual", "GET-ARG-OPTION-INDIVIDUAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_expanded_items", "GET-GKE-EXPANDED-ITEMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_combine_with_is_valid_substitution", "GET-GKE-COMBINE-WITH-IS-VALID-SUBSTITUTION", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_cycl_formulas_for_nl_phrase", "GET-GKE-CYCL-FORMULAS-FOR-NL-PHRASE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_quantifiers", "GET-GKE-QUANTIFIERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_quantifier_ranges", "GET-GKE-QUANTIFIER-RANGES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_list_item_comparator", "GKE-LIST-ITEM-COMPARATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_process_results", "GKE-PROCESS-RESULTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_specs", "GET-GKE-SPECS", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_genls", "GET-GKE-GENLS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_spec_preds", "GET-GKE-SPEC-PREDS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_genl_preds", "GET-GKE-GENL-PREDS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_collection_siblings", "GET-GKE-COLLECTION-SIBLINGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_instance_siblings", "GET-GKE-INSTANCE-SIBLINGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_siblings", "GET-GKE-SIBLINGS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "add_self_to_quantify_over_isas", "ADD-SELF-TO-QUANTIFY-OVER-ISAS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_quantify_over_isas", "GET-GKE-QUANTIFY-OVER-ISAS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_isas", "GET-GKE-ISAS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_gke_isas_filtered_term", "CLEAR-GKE-ISAS-FILTERED-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_gke_isas_filtered_term", "REMOVE-GKE-ISAS-FILTERED-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_isas_filtered_term_internal", "GKE-ISAS-FILTERED-TERM-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_isas_filtered_term", "GKE-ISAS-FILTERED-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_gke_filtered_termP", "CLEAR-GKE-FILTERED-TERM?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_gke_filtered_termP", "REMOVE-GKE-FILTERED-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_filtered_termP_internal", "GKE-FILTERED-TERM?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_filtered_termP", "GKE-FILTERED-TERM?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_gke_predicate_filteredP", "CLEAR-GKE-PREDICATE-FILTERED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_gke_predicate_filteredP", "REMOVE-GKE-PREDICATE-FILTERED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_predicate_filteredP_internal", "GKE-PREDICATE-FILTERED?-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_predicate_filteredP", "GKE-PREDICATE-FILTERED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "terms_pass_constraints", "TERMS-PASS-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "operator_terms_pass_constraints", "OPERATOR-TERMS-PASS-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "argument_terms_pass_constraints", "ARGUMENT-TERMS-PASS-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "argument_terms_pass_isa_genls_constraints", "ARGUMENT-TERMS-PASS-ISA-GENLS-CONSTRAINTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_naut_arg_position", "GET-GKE-NAUT-ARG-POSITION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_is_known", "GET-GKE-IS-KNOWN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_gke_query_paraphrase", "SIMULATE-GKE-QUERY-PARAPHRASE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_ccf_paraphrase", "SIMULATE-CCF-PARAPHRASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_ccf3_paraphrase", "SIMULATE-CCF3-PARAPHRASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_gke_query_paraphrase_terse", "SIMULATE-GKE-QUERY-PARAPHRASE-TERSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_gke_query_paraphrase_verbose", "SIMULATE-GKE-QUERY-PARAPHRASE-VERBOSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_gke3_query_paraphrase", "SIMULATE-GKE3-QUERY-PARAPHRASE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_gke3_paraphrase_guts", "SIMULATE-GKE3-PARAPHRASE-GUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke3_paraphrase_open_vars", "GKE3-PARAPHRASE-OPEN-VARS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke3_paraphrase_guts_int", "GKE3-PARAPHRASE-GUTS-INT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "starts_with_gke3_connectiveP", "STARTS-WITH-GKE3-CONNECTIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke3_string_for_conjunction", "GKE3-STRING-FOR-CONJUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "simulate_gke_term_paraphrase", "SIMULATE-GKE-TERM-PARAPHRASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_add_cloned_literal", "GKE-ADD-CLONED-LITERAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_strengthen_query_sentence", "GKE-STRENGTHEN-QUERY-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_remove_literal", "GKE-REMOVE-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_find_literal_to_clone", "GKE-FIND-LITERAL-TO-CLONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_find_literal_to_remove", "GKE-FIND-LITERAL-TO-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_find_literal_to_strengthen", "GKE-FIND-LITERAL-TO-STRENGTHEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_find_literal_for_arg_position", "GKE-FIND-LITERAL-FOR-ARG-POSITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_add_literal", "GKE-ADD-LITERAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_siblings", "GKE-GET-SIBLINGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_formula_arg_position", "GKE-FORMULA-ARG-POSITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_formula_arg_position_subst", "GKE-FORMULA-ARG-POSITION-SUBST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "loosen_gke_literal", "LOOSEN-GKE-LITERAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "strengthen_gke_literal", "STRENGTHEN-GKE-LITERAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "reformulator_settings_for_gke", "REFORMULATOR-SETTINGS-FOR-GKE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "sentence_substitution_wffP", "SENTENCE-SUBSTITUTION-WFF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "free_variable", "FREE-VARIABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "existentially_boundP", "EXISTENTIALLY-BOUND?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "possible_sentence_substitutions", "POSSIBLE-SENTENCE-SUBSTITUTIONS", 5, 8, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "formula_arg_pos_isa_constraint", "FORMULA-ARG-POS-ISA-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "substitute_term_into_sentence", "SUBSTITUTE-TERM-INTO-SENTENCE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "substitute_terms_into_sentence", "SUBSTITUTE-TERMS-INTO-SENTENCE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "substitute_term_into_sentence_int", "SUBSTITUTE-TERM-INTO-SENTENCE-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "coerce_term_into_sentence", "COERCE-TERM-INTO-SENTENCE", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_gke_memoization_state", "CLEAR-GKE-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_gke_memoization_state", "REMOVE-GKE-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_memoization_state_internal", "GKE-MEMOIZATION-STATE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_memoization_state", "GKE-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_gloss_for_literal", "GKE-GLOSS-FOR-LITERAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "get_gke_gloss_from_kb", "GET-GKE-GLOSS-FROM-KB", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_generate_gke_gloss_wrt_mt_cached", "CLEAR-GENERATE-GKE-GLOSS-WRT-MT-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_generate_gke_gloss_wrt_mt_cached", "REMOVE-GENERATE-GKE-GLOSS-WRT-MT-CACHED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "generate_gke_gloss_wrt_mt_cached_internal", "GENERATE-GKE-GLOSS-WRT-MT-CACHED-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "generate_gke_gloss_wrt_mt_cached", "GENERATE-GKE-GLOSS-WRT-MT-CACHED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacement_renderers_for_sentence", "CANDIDATE-REPLACEMENT-RENDERERS-FOR-SENTENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacements_for_variables", "CANDIDATE-REPLACEMENTS-FOR-VARIABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacements_for_arg", "CANDIDATE-REPLACEMENTS-FOR-ARG", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacements_for_sentence", "CANDIDATE-REPLACEMENTS-FOR-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_candidate_replacements_for_sentence_cached", "CLEAR-CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_candidate_replacements_for_sentence_cached", "REMOVE-CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacements_for_sentence_cached_internal", "CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacements_for_sentence_cached", "CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "add_candidate_replacements", "ADD-CANDIDATE-REPLACEMENTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacement_join_function", "CANDIDATE-REPLACEMENT-JOIN-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_gke_get_elements", "CLEAR-GKE-GET-ELEMENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_gke_get_elements", "REMOVE-GKE-GET-ELEMENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_elements_internal", "GKE-GET-ELEMENTS-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_elements", "GKE-GET-ELEMENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_renderer_groves", "REPLACEMENT-RENDERER-GROVES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "find_table_to_conflate_to", "FIND-TABLE-TO-CONFLATE-TO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_tree_print_function_trampoline", "REPLACEMENT-TREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_tree_p", "REPLACEMENT-TREE-P", 1, 0, false);
        new $replacement_tree_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "r_tree_root", "R-TREE-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "r_tree_children", "R-TREE-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "_csetf_r_tree_root", "_CSETF-R-TREE-ROOT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "_csetf_r_tree_children", "_CSETF-R-TREE-CHILDREN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "make_replacement_tree", "MAKE-REPLACEMENT-TREE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "visit_defstruct_replacement_tree", "VISIT-DEFSTRUCT-REPLACEMENT-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "visit_defstruct_object_replacement_tree_method", "VISIT-DEFSTRUCT-OBJECT-REPLACEMENT-TREE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "print_replacement_tree", "PRINT-REPLACEMENT-TREE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "new_replacement_tree", "NEW-REPLACEMENT-TREE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_tree_root", "REPLACEMENT-TREE-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_tree_children", "REPLACEMENT-TREE-CHILDREN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_tree_add_child", "REPLACEMENT-TREE-ADD-CHILD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_renderer_grove", "REPLACEMENT-RENDERER-GROVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_renderer_grove_recursive", "REPLACEMENT-RENDERER-GROVE-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "add_one_renderer", "ADD-ONE-RENDERER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "renderer_tree_contains_rendererP", "RENDERER-TREE-CONTAINS-RENDERER?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "break_replacement_renderer_cycles", "BREAK-REPLACEMENT-RENDERER-CYCLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "listy_replacement_tree", "LISTY-REPLACEMENT-TREE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "postpone_adding_replacementP", "POSTPONE-ADDING-REPLACEMENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_renderer_tree_specifications", "REPLACEMENT-RENDERER-TREE-SPECIFICATIONS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "replacement_renderer_tree_conflation_preds", "REPLACEMENT-RENDERER-TREE-CONFLATION-PREDS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "renderer_to_superiors_table", "RENDERER-TO-SUPERIORS-TABLE", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "superiors_for_renderer_term", "SUPERIORS-FOR-RENDERER-TERM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_subst_nl_for_inference_answer", "GKE-SUBST-NL-FOR-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_subst_nl_for_binding", "GKE-SUBST-NL-FOR-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "el_binding_list_to_gke_binding_list", "EL-BINDING-LIST-TO-GKE-BINDING-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "el_binding_to_gke_binding", "EL-BINDING-TO-GKE-BINDING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "variable_to_nl_string", "VARIABLE-TO-NL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_start_continuable_query", "GKE-START-CONTINUABLE-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_warn", "GKE-WARN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_continue_query", "GKE-CONTINUE-QUERY", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "new_gke_process", "NEW-GKE-PROCESS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "new_results_daemon", "NEW-RESULTS-DAEMON", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "results_daemon", "RESULTS-DAEMON", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "daemon_should_run", "DAEMON-SHOULD-RUN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_run_inference", "GKE-RUN-INFERENCE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_one_inference_result", "GKE-GET-ONE-INFERENCE-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_inference_results", "GKE-GET-INFERENCE-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_inference_completeP", "GKE-INFERENCE-COMPLETE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_inference_status", "GKE-GET-INFERENCE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_get_inference_suspend_status", "GKE-GET-INFERENCE-SUSPEND-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_stop_continuable_query", "GKE-STOP-CONTINUABLE-QUERY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_release_inference_resources", "GKE-RELEASE-INFERENCE-RESOURCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "null_or_integerp", "NULL-OR-INTEGERP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "clear_cached_gke_functions", "CLEAR-CACHED-GKE-FUNCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "gke_test_queries", "GKE-TEST-QUERIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "candidate_replacements_equalP", "CANDIDATE-REPLACEMENTS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "test_candidate_replacements", "TEST-CANDIDATE-REPLACEMENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "test_candidate_replacement_renderers", "TEST-CANDIDATE-REPLACEMENT-RENDERERS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "remove_javalist_detail", "REMOVE-JAVALIST-DETAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "sort_result", "SORT-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "sort_groves", "SORT-GROVES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "sort_grove", "SORT-GROVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "sort_tree", "SORT-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "delete_javalist_detail", "DELETE-JAVALIST-DETAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "delete_javalist_detail_from_tree", "DELETE-JAVALIST-DETAIL-FROM-TREE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "test_candidate_replacement_renderers_for_vars", "TEST-CANDIDATE-REPLACEMENT-RENDERERS-FOR-VARS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "test_candidate_replacement_renderers_stumps", "TEST-CANDIDATE-REPLACEMENT-RENDERERS-STUMPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gke_main", "nartify_and_substitute_term_into_sentence", "NARTIFY-AND-SUBSTITUTE-TERM-INTO-SENTENCE", 5, 3, false);
        return (SubLObject)gke_main.NIL;
    }
    
    public static SubLObject init_gke_main_file() {
        gke_main.$gke_isas_filtered_term_caching_state$ = SubLFiles.deflexical("*GKE-ISAS-FILTERED-TERM-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$gke_overly_general_non_predicate_types$ = SubLFiles.deflexical("*GKE-OVERLY-GENERAL-NON-PREDICATE-TYPES*", (SubLObject)gke_main.$list27);
        gke_main.$gke_filtered_termP_caching_state$ = SubLFiles.deflexical("*GKE-FILTERED-TERM?-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$gke_overly_general_predicate_types$ = SubLFiles.deflexical("*GKE-OVERLY-GENERAL-PREDICATE-TYPES*", (SubLObject)gke_main.$list29);
        gke_main.$gke_predicate_filteredP_caching_state$ = SubLFiles.deflexical("*GKE-PREDICATE-FILTERED?-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$use_rbp_wff_in_gkeP$ = SubLFiles.defparameter("*USE-RBP-WFF-IN-GKE?*", (SubLObject)gke_main.T);
        gke_main.$gke_memoization_state_caching_state$ = SubLFiles.deflexical("*GKE-MEMOIZATION-STATE-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$generate_gke_gloss_wrt_mt_cached_caching_state$ = SubLFiles.deflexical("*GENERATE-GKE-GLOSS-WRT-MT-CACHED-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$candidate_replacements_for_sentence_cached_caching_state$ = SubLFiles.deflexical("*CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$gke_get_elements_caching_state$ = SubLFiles.deflexical("*GKE-GET-ELEMENTS-CACHING-STATE*", (SubLObject)gke_main.NIL);
        gke_main.$omit_suggestion_stumpsP$ = SubLFiles.deflexical("*OMIT-SUGGESTION-STUMPS?*", (SubLObject)((gke_main.NIL != Symbols.boundp((SubLObject)gke_main.$sym140$_OMIT_SUGGESTION_STUMPS__)) ? gke_main.$omit_suggestion_stumpsP$.getGlobalValue() : gke_main.NIL));
        gke_main.$dtp_replacement_tree$ = SubLFiles.defconstant("*DTP-REPLACEMENT-TREE*", (SubLObject)gke_main.$sym141$REPLACEMENT_TREE);
        gke_main.$use_tva_for_suggestionsP$ = SubLFiles.deflexical("*USE-TVA-FOR-SUGGESTIONS?*", (SubLObject)((gke_main.NIL != Symbols.boundp((SubLObject)gke_main.$sym188$_USE_TVA_FOR_SUGGESTIONS__)) ? gke_main.$use_tva_for_suggestionsP$.getGlobalValue() : gke_main.NIL));
        gke_main.$default_patience_wait_time$ = SubLFiles.defparameter("*DEFAULT-PATIENCE-WAIT-TIME*", (SubLObject)gke_main.TWO_INTEGER);
        gke_main.$gke_query_threads$ = SubLFiles.defparameter("*GKE-QUERY-THREADS*", Hashtables.make_hash_table((SubLObject)gke_main.FIVE_INTEGER, Symbols.symbol_function((SubLObject)gke_main.EQUAL), (SubLObject)gke_main.UNPROVIDED));
        gke_main.$daemon_should_run_inference_statuses$ = SubLFiles.deflexical("*DAEMON-SHOULD-RUN-INFERENCE-STATUSES*", (SubLObject)gke_main.$list220);
        gke_main.$gke_run_inference_with_adjusted_dynamic_propertiesP$ = SubLFiles.deflexical("*GKE-RUN-INFERENCE-WITH-ADJUSTED-DYNAMIC-PROPERTIES?*", (SubLObject)gke_main.NIL);
        gke_main.$inference_done_statuses$ = SubLFiles.deflexical("*INFERENCE-DONE-STATUSES*", (SubLObject)gke_main.$list233);
        return (SubLObject)gke_main.NIL;
    }
    
    public static SubLObject setup_gke_main_file() {
        access_macros.register_external_symbol((SubLObject)gke_main.$sym0$GET_GKE_ARG_OPTIONS);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym6$GET_GKE_EXPANDED_ITEMS);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym10$GET_GKE_QUANTIFIER_RANGES, (SubLObject)gke_main.NIL, (SubLObject)gke_main.$str11$Get_the_quantifier_ranges, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym23$GKE_ISAS_FILTERED_TERM);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym19$GKE_FILTERED_TERM_);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym30$GKE_PREDICATE_FILTERED_);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym40$GET_GKE_NAUT_ARG_POSITION);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym41$GET_GKE_IS_KNOWN);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym69$GKE_ADD_CLONED_LITERAL);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym73$GKE_REMOVE_LITERAL);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym82$POSSIBLE_SENTENCE_SUBSTITUTIONS);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym89$SUBSTITUTE_TERM_INTO_SENTENCE);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym102$GKE_MEMOIZATION_STATE);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym106$GKE_GLOSS_FOR_LITERAL);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym111$GENERATE_GKE_GLOSS_WRT_MT_CACHED);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym114$CANDIDATE_REPLACEMENT_RENDERERS_FOR_SENTENCE);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym117$CANDIDATE_REPLACEMENTS_FOR_VARIABLES);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym118$CANDIDATE_REPLACEMENTS_FOR_ARG);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym119$CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)gke_main.$sym131$GKE_GET_ELEMENTS);
        subl_macro_promotions.declare_defglobal((SubLObject)gke_main.$sym140$_OMIT_SUGGESTION_STUMPS__);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), gke_main.$dtp_replacement_tree$.getGlobalValue(), Symbols.symbol_function((SubLObject)gke_main.$sym148$REPLACEMENT_TREE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)gke_main.$list149);
        Structures.def_csetf((SubLObject)gke_main.$sym150$R_TREE_ROOT, (SubLObject)gke_main.$sym151$_CSETF_R_TREE_ROOT);
        Structures.def_csetf((SubLObject)gke_main.$sym152$R_TREE_CHILDREN, (SubLObject)gke_main.$sym153$_CSETF_R_TREE_CHILDREN);
        Equality.identity((SubLObject)gke_main.$sym141$REPLACEMENT_TREE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), gke_main.$dtp_replacement_tree$.getGlobalValue(), Symbols.symbol_function((SubLObject)gke_main.$sym160$VISIT_DEFSTRUCT_OBJECT_REPLACEMENT_TREE_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)gke_main.$sym147$PRINT_REPLACEMENT_TREE);
        subl_macro_promotions.declare_defglobal((SubLObject)gke_main.$sym188$_USE_TVA_FOR_SUGGESTIONS__);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym200$GKE_START_CONTINUABLE_QUERY, (SubLObject)gke_main.$list201, (SubLObject)gke_main.$str202$Setup_a_query__and_immediately_re, (SubLObject)gke_main.$list203, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym208$GKE_CONTINUE_QUERY, (SubLObject)gke_main.$list209, (SubLObject)gke_main.$str210$Continue_an_existing_query__ident, (SubLObject)gke_main.$list211, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym224$GKE_GET_ONE_INFERENCE_RESULT, (SubLObject)gke_main.$list225, (SubLObject)gke_main.$str226$Get_one_inference_result, (SubLObject)gke_main.$list227, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym230$GKE_GET_INFERENCE_RESULTS, (SubLObject)gke_main.$list225, (SubLObject)gke_main.$str231$get_all_the_inference_results_so_, (SubLObject)gke_main.$list232, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym234$GKE_INFERENCE_COMPLETE_, (SubLObject)gke_main.$list225, (SubLObject)gke_main.$str235$ret_t_iff_inference_is_suspended_, (SubLObject)gke_main.$list227, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym236$GKE_GET_INFERENCE_STATUS, (SubLObject)gke_main.$list225, (SubLObject)gke_main.$str237$get_the_status_of_the_inference, (SubLObject)gke_main.$list227, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym238$GKE_GET_INFERENCE_SUSPEND_STATUS, (SubLObject)gke_main.$list225, (SubLObject)gke_main.$str239$get_the_suspend_status_of_the_inf, (SubLObject)gke_main.$list227, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym241$GKE_STOP_CONTINUABLE_QUERY, (SubLObject)gke_main.$list242, (SubLObject)gke_main.$str243$Find_and_stop_the_inference_, (SubLObject)gke_main.$list244, (SubLObject)gke_main.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gke_main.$sym245$GKE_RELEASE_INFERENCE_RESOURCES, (SubLObject)gke_main.$list225, (SubLObject)gke_main.$str246$Destroy_problem_store_and_inferen, (SubLObject)gke_main.$list227, (SubLObject)gke_main.NIL);
        access_macros.register_external_symbol((SubLObject)gke_main.$sym247$GKE_TEST_QUERIES);
        sunit_external.define_test_category((SubLObject)gke_main.$str252$GKE_Query_Sentence_Literal_Manipu, (SubLObject)gke_main.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)gke_main.$str253$GKE_Main_Test_Suite, (SubLObject)gke_main.$list254, (SubLObject)gke_main.UNPROVIDED, (SubLObject)gke_main.UNPROVIDED);
        generic_testing.define_test_case_table_int((SubLObject)gke_main.$sym255$TEST_CANDIDATE_REPLACEMENTS, (SubLObject)ConsesLow.list(new SubLObject[] { gke_main.$kw256$TEST, gke_main.$sym257$CANDIDATE_REPLACEMENTS_EQUAL_, gke_main.$kw258$OWNER, gke_main.NIL, gke_main.$kw259$CLASSES, gke_main.$list260, gke_main.$kw261$KB, gke_main.$kw262$FULL, gke_main.$kw263$WORKING_, gke_main.T }), (SubLObject)gke_main.$list264);
        generic_testing.define_test_case_table_int((SubLObject)gke_main.$sym277$TEST_CANDIDATE_REPLACEMENT_RENDERERS_FOR_VARS, (SubLObject)ConsesLow.list(new SubLObject[] { gke_main.$kw256$TEST, gke_main.EQUAL, gke_main.$kw258$OWNER, gke_main.NIL, gke_main.$kw259$CLASSES, gke_main.$list260, gke_main.$kw261$KB, gke_main.$kw262$FULL, gke_main.$kw263$WORKING_, gke_main.T }), (SubLObject)gke_main.$list278);
        generic_testing.define_test_case_table_int((SubLObject)gke_main.$sym279$TEST_CANDIDATE_REPLACEMENT_RENDERERS_STUMPS, (SubLObject)ConsesLow.list(new SubLObject[] { gke_main.$kw256$TEST, gke_main.EQUAL, gke_main.$kw258$OWNER, gke_main.NIL, gke_main.$kw259$CLASSES, gke_main.$list260, gke_main.$kw261$KB, gke_main.$kw262$FULL, gke_main.$kw263$WORKING_, gke_main.T }), (SubLObject)gke_main.$list280);
        generic_testing.define_test_case_table_int((SubLObject)gke_main.$sym281$TEST_CANDIDATE_REPLACEMENT_RENDERERS, (SubLObject)ConsesLow.list(new SubLObject[] { gke_main.$kw256$TEST, gke_main.EQUAL, gke_main.$kw258$OWNER, gke_main.NIL, gke_main.$kw259$CLASSES, gke_main.$list260, gke_main.$kw261$KB, gke_main.$kw262$FULL, gke_main.$kw263$WORKING_, gke_main.T }), gke_main.$list282);
        generic_testing.define_test_case_table_int((SubLObject)gke_main.$sym283$NARTIFY_AND_SUBSTITUTE_TERM_INTO_SENTENCE, (SubLObject)ConsesLow.list(new SubLObject[] { gke_main.$kw256$TEST, gke_main.EQUAL, gke_main.$kw258$OWNER, gke_main.NIL, gke_main.$kw259$CLASSES, gke_main.$list260, gke_main.$kw261$KB, gke_main.$kw262$FULL, gke_main.$kw263$WORKING_, gke_main.T }), (SubLObject)gke_main.$list284);
        generic_testing.define_test_case_table_int((SubLObject)gke_main.$sym89$SUBSTITUTE_TERM_INTO_SENTENCE, (SubLObject)ConsesLow.list(new SubLObject[] { gke_main.$kw256$TEST, gke_main.EQUAL, gke_main.$kw258$OWNER, gke_main.NIL, gke_main.$kw259$CLASSES, gke_main.$list260, gke_main.$kw261$KB, gke_main.$kw262$FULL, gke_main.$kw263$WORKING_, gke_main.T }), gke_main.$list285);
        return (SubLObject)gke_main.NIL;
    }
    
    private static SubLObject _constant_282_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dataForValveOfEventRecordsStenosisSeverity")), (SubLObject)SubLObjectFactory.makeSymbol("?CARDIAC-VALVE-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICALLY-RELATED-EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchCAEGuidanceMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFMedicalResearch-Allotment"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gke_main.THREE_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_critical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_present"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_trivial"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_unknown"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Moderate-SevereToSevereCardiacValveStenosis")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("None-CardiacValveStenosis"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MildPhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MildToModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))) })))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("valveProsthesisTypeExplanted")), (SubLObject)SubLObjectFactory.makeSymbol("?HEART-VALVE-REPLACEMENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000")), (SubLObject)SubLObjectFactory.makeSymbol("?VALVE-PROSTHESIS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchCAEGuidanceMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFMedicalResearch-Allotment"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAndMitralValveProsthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842007-D"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelHALL")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValveProsthesis")), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValveMechanicalProsthesis")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticSilasticBallValveProsthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1260")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1200"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2310"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2320"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3160"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842006-D"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842006-F"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842050-B"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756-IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONXAE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXAC"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Aortic-Biological")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1000")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700PM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2800"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9000IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BSP100"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelTF-IDE"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticApex")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel503DA")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticCompositeGraft")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelXAGV")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticHighProfile")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAHP-105")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticSingleComponent")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel320")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticStabilizedGlutaraldehydeProcess")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel250")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-CConvex-Concave")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVC")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-FreestyleAorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel995")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-MagnaAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000TFX"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-MosaicUltraAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel305")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-PremarketAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700PM")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-PrimaPlusStentlessAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2500P")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-ReducedAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelR500")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel150"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel242"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel300"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel350"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606366"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelA-101"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelABP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGN-751"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAJ-501"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-201"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-301"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-CUS"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10SP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVG-404"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVGJ-514"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BiocorAortic"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_C7700"))), ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Pericardial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValveProsthesis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1000")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700PM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2800"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9000IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX"))) }) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-3FAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1000")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticConduit")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606366")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticDisc")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelABP")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticRegent")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756-IDE")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticValvedConduit")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-CConvex-Concave")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVC")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-NotLowPorosity")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVM")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel150"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel350"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-201"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-301"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-CUS"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVG-404"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVGJ-514"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Bicor")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10SP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BiocorAortic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BiocorMitral")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Bileaflet")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3160"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9120"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelHALL")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Allograft")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CryolifeAorticAllograft")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CryolifePulmonaryAllograft")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LifenetAorticAllograft")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LifenetPulmonaryAllograft")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnknownManufacturer-Allograft"))))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Aortic-Biological")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1000")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700PM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2800"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9000IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BSP100"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelTF-IDE"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-BovineOrPorcine")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Bovine")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_7000")))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Porcine")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticStabilizedGlutaraldehydeProcess")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel250")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-PrimaPlusStentlessAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2500P")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel109411-1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel150"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel200"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel242"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel300"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel305"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel310"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel320"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342A-V"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342R"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel350"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606306"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606366"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625-ESR-LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel995"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISU"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_995"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelXAGV"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB100-M"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_B100-A"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_B100-M"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BSP100"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelTF-IDE")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Pericardial")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900P"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900PTFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel7000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISLM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_12A"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_9000TFX"))), ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Pericardial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValveProsthesis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1000")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700PM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2800"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9000IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX"))) }) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Heterograft")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Equine")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9000IDE")))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Biological-Porcine")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-AorticStabilizedGlutaraldehydeProcess")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel250")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-PrimaPlusStentlessAortic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2500P")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel109411-1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel150"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel200"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel242"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel300"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel305"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel310"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel320"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342A-V"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342R"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel350"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606306"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606366"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625-ESR-LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel995"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISU"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_995"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelXAGV"))) })), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10SP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_4300"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnknownManufacturer-BiologicValve")))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-CompositeGraft")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelXAGV")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-ExpandedCuff")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAEC-102"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMEC-102")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-LowProfile")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISLM")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Mechanical")), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValveMechanicalProsthesis")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticSilasticBallValveProsthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1260")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1200"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2310"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2320"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3160"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842006-D"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842006-F"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842050-B"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756-IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONXAE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXAC"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Disk")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606366"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9120"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelABP")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel503DA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842007-D"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6120"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6320"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel65"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel70"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel750"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel825"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelA-101"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGN-751"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAHP-105"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAHPJ-505"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAJ-501"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-201"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-301"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-CUS"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVG-404"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVGJ-514"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelF700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelHALL"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelM-101"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBRP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMECJ-502"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMHP-105"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMJ-501"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_106"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_503DA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_AEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_Bjork-Shiley-CC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_C7700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONCMC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONXA"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONXMC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelR500"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelS500"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnknownManufacturer-MechanicalValve")))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-On-X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONXAE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXA"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXAC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXM")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-OptiformMitralValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelF700")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Perimont")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Stented")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6650")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-SubAnular")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBP")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-SupraAnular")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2650"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10SP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBRP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelS500")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-TwoComponent")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel200"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel300")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-Universal")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISU")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_Photofix"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValveProsthesis")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-ClothCoveredMitral")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6320")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-MitralUpsideDown")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2900")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-SilasticMitral")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6120")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-VascorMitralValveProstheis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342R")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel109411-1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel200"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel305"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel310"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342A-V"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606306"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel65"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625-ESR-LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900P"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900PTFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel70"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel7000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel750"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel825"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9120"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAHPJ-505"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB100-M"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelF700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISLM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISU"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelM-101"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBRP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMECJ-502"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMHP-105"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMJ-501"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_7000"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_BiocorMitral"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_Bjork-Shiley-CC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelS500"))) }), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFCardiacValveExistingOrExplantProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFCardiacValveImplantProsthesis")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFCardiacValveExistingOrExplantProsthesis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFCardiacValveImplantProsthesis")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaxterHealthcareCorp"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2500P")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Beall")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeallSurgitool")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bjork-shiley"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelABP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGVM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMBRP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_Bjork-Shiley-CC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelXAGV")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Braunwald-cutter")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Carbomedic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel700"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAP"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelF700"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelR500"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelS500")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Caster-hall")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cooley-bloodwell-cutter")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cooley-cutter")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cross-jones"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel65"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel70")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cutter-TheOrganization")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DebakeySurgitool")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EdwardsDuromedic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3160"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9120")))), ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EdwardsLifesciences"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel109411-1"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2700PM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2800"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel3000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606306"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel606366"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625-ESR-LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6625LP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6650"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900P"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6900PTFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel7000TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel9000IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_3300TFX"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_7000"))) }), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FasciaLata")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Gott-daggett")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hancock"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel150"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel242"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel250"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342A-V"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel342R")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Harken")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Homograft")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Inescu-shiley"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISA"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISLM"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelISU")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kay-shiley")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Kay-suzuki")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lillihei-kaster")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Magovern-cromie")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalCarbonResearchInstitute"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_ONXAE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXA"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXAC"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelONXM")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedtronicInc"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel305"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel310"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel995"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelHALL"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelNumber_C7700")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Omni-science")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryAutograft")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Smeloff-cutter"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel750"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel825"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel900")))), ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StJudeMedical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842006-D"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842006-F"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842007-D"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel52842050-B"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelA-101"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGFN-756-IDE"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAGN-751"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAHP-105"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAHPJ-505"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAJ-501"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-201"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-301"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelAVG-CUS"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB100-M"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelB10SP"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVG-404"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelCAVGJ-514"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelM-101"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMEC-102"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMECJ-502"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMHP-105"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelMJ-501"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModelTF-IDE"))) }), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Starr-edwards"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1200"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1260"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2310"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel2320"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel6320")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tascon"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel200"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel300"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel320"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel350")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Therapeutic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis-3FAorticBioprosthesis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesisModel1000"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveProsthesis")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFMadeBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Wada-cutter")))) }))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasDiagnosis")), (SubLObject)SubLObjectFactory.makeSymbol("?DIAG"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchCAEGuidanceMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFMedicalResearch-Allotment"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalAorticConduit")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArch-AbnormalConduit"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAorta-AbnormalConduit"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAorta-AbnormalConduit")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAorta-AbnormalConduit"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-TricuspidValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Abscess")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Abscess-AorticRoot")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysmal"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArch-NormalConduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaAscendingRupture"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDescendingRupture"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticArchAbnormalities"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticArchRupture"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Arteriosclerosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-Aorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingThoracicAorta")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtheromaOrAtherosclerosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-Aorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingThoracicAorta")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticArchAtresia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-PulmonaryValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtresiaWithIntactSeptum-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-TricuspidValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialTachycardia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EctopicHeartbeat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureAtrialComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureEctopicBeats"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WanderingPacemaker")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectPrimum"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectSecundum"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtriallyPacedHeartRhythm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BallooningOrProlapsedCardiacValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BallooningOrProlapsedCardiacValve-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BallooningOrProlapsedCardiacValve-TricuspidValve")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-TricuspidValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-Aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AorticRoot"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-ThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-TricuspidValve"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Arthritis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumatoidArthritis")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicArrhythmia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease-Mild"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease-Moderate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease-Severe"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-Clinical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-Pharmacologic"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiabetesMellitus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneticCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneticDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LoeysDietzSyndrome"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MarfansSyndrome"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hypertension")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hypertension-Systemic")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lupus")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Coarctation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticCoarctation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaCoarctation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArchCoarctation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaCoarctation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaCoarctation")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalCondition")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalHeartDisease")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbsentPulmonaryArtery"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-diverticulum-MembranousSeptum-SpontaneousClosureOfIVSD"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmSinusValsalva"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnomalousPulmonaryVenousReturn-Partial"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnomalousPulmonaryVenousReturn-Total"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnomalyOfSystemicDrainage-PersistentLeftSVC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-rightVentricleCommunication"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortopulmonaryWindow"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AspleniaSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atrial-ventricularCanalDefectComplete"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalAnyeurysm-Congenital"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectPrimum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectSecundum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistula")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToLeftAtrium"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToLeftVentricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToPulmonaryArtery"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToRightAtrium"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToUndeterminedLocation")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrioventricularMalformations"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonVentricleTypeAOrTypeC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalCoronaryArteryAnomalyOtherOrMultipleCongenitalAnomalies"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalDoubleOrificeLeftSinus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalDoubleOrificeRightSinus"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryAnomaly")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryAnomalyFistulaEctopicOrigin"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-CircumflexFromLeftAndRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-CircumflexFromRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingAndCircumflexWithCommonOstium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingFromRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftCircumflexArteryAbsent"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftCoronaryArteryFromRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftFromPulmonaryArtery"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftMainTrunkAbsent"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-RightFromLeft"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Criss-crossHeart"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dextroversion"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleChamberedRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleOutletLeftVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleOutletRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EbsteinAnomaly"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndocardialFibroelastosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicObstructiveCardiomyopathy-Congenital"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypoplasticLeftHeartSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypoplasticRightHeartSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedDextrocardia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedLevocardiaNoSitusInversus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MalpositionOfGreatVessels"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MalpositionOfTheHeart"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mapca"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultipleVentricularSeptalDefect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatentDuctusArteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatentForamenOvale"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PolyspleniaSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryStenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryAtrial-ventricularFistulaPulmonaryArtery-PulmonaryVein"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalDefect-CommonAtrium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleDextrocardiaWithSitusInversus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusVenosusAtrialSeptalDefect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StorageDiseaseOfTheHeart"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SystemicVenousObstruction"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TetralogyOfFallot"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TetralogyOfFallotWithAbsentPulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TranspositionGreatVessels-Dextro-transpositionOrLevo-transposition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TranspositionGreatVesselsCorrected"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruncusArteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularRing"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularInversion"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Atrial-ventricularCanalType"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Membranous"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Muscular")))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-CoronaryArteriovenous"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-CoronaryArteriovenousToRightVentricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneticCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeneticDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LoeysDietzSyndrome"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MarfansSyndrome")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalLeftCoronaryArteryFromRight"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConnectiveTissueDisorder")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Arthritis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumatoidArthritis")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeurgersDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EhlersDanlosSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GiantCellAortitis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KawasakiDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Lupus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PolymyalgiaRheumatica"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RaynaudsDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SjogrensSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VasculiticSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WegenersGranulomatosis"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAneurysm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryDisease-Ischemic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherCoronaryArteryAbnormality")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrisis-Aorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DigestiveDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DigestiveHepaticFailure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HiatalHernia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RefluxDisease")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-PhysiologicalCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AscendingAortaRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-DescendingThoracicAorta"))))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorta")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-rightVentricleCommunication"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaAneurysmOrDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteAorticDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicAortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaUnspecifiedAneurysm"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaFistula")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingAorta-Bronchial")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Bronchial")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingAorta-Esophageal")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Esophageal")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-ThoracicAorta-Bronchial"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-ThoracicAorta-Esophageal")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticCoarctation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaCoarctation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArchCoarctation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaCoarctation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaCoarctation"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aortitis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaAortitis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArchAortitis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaAortitis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaAortitis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaAortitis"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-Aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-Aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrisis-Aorta"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAbdominalAorta")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaAortitis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaCoarctation"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AbdominalAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AbdominalAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis-AbdominalAorta"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorta-NonAneurysmal"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorta-Normal"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorticArch")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArch-AbnormalConduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArchAortitis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaArchCoarctation"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticArchAneurysmOrDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AortaArch"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticArchAtresia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trombosis-AortaArch"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Abscess-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AorticRoot")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AorticRoot")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAscendingAorta")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAorta-AbnormalConduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAorta-NormalConduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaAneurysmOrDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AscendingAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaAortitis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-AscendingAortaRoot"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAscendingAorta-Other"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeakInEndograftStent-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-AscendingAorta"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheDescendingAorta")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-DescendingThoracicAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-DescendingThoracicAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAorta-AbnormalConduit")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAorta-AbnormalConduit")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAorta-NormalConduit")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAorta-NormalConduit")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaAortitis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaAortitis")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaCoarctation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaCoarctation")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaThrombosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaThrombosis")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-DescendingThoracicAorta")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheDescendingThoracicAorta")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atherosclerosis-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CysticMedialNecrosis-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAorta-AbnormalConduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAorta-NormalConduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaAortitis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaCoarctation"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaThrombosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dilatation-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Bronchial"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Esophageal"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-ThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-DescendingThoracicAorta"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingAorta-Bronchial")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Bronchial")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingAorta-Esophageal")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Esophageal")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-DescendingThoracicAorta")))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheThoracicAbdominalAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-ThoracicAbdominalAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-ThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-ThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-ThoracicAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheThoracicAorta-NonAneurysmal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-ThoracicAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-ThoracicAorta-Bronchial"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-ThoracicAorta-Esophageal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-ThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-Aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis-Aorta"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndocrineDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiabetesMellitus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HashimotosThyroiditis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hyperthyroidism"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hypothyroidism")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Enlarged-HeartChamberCondition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-thickening")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-Aorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-CardiacValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-TricuspidValve")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-ThoracicAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaFistula")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingAorta-Bronchial")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Bronchial")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingAorta-Esophageal")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-DescendingThoracicAorta-Esophageal")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-ThoracicAorta-Bronchial"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-ThoracicAorta-Esophageal")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistula")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToLeftAtrium"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToLeftVentricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToPulmonaryArtery"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToRightAtrium"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToUndeterminedLocation")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-CoronaryArteriovenous"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaCondition-CoronaryArteriovenousToRightVentricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryAtrial-ventricularFistulaPulmonaryArtery-PulmonaryVein")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Giant-HeartChamberCondition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartChamberCondition_small"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartCondition")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiredHeartDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiredValvularHeartDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiredNonRheumaticValvularHeartDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-Generic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-Morbidity")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-CardiacValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-TricuspidValve")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-MitralValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticHeartDisease"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacArrest"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalHeartDisease")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbsentPulmonaryArtery"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-diverticulum-MembranousSeptum-SpontaneousClosureOfIVSD"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmSinusValsalva"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnomalousPulmonaryVenousReturn-Partial"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnomalousPulmonaryVenousReturn-Total"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnomalyOfSystemicDrainage-PersistentLeftSVC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-rightVentricleCommunication"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortopulmonaryWindow"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AspleniaSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atrial-ventricularCanalDefectComplete"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalAnyeurysm-Congenital"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectPrimum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectSecundum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistula")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToLeftAtrium"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToLeftVentricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToPulmonaryArtery"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToRightAtrium"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialVentricularFistulaToUndeterminedLocation")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrioventricularMalformations"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonVentricleTypeAOrTypeC"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalCoronaryArteryAnomalyOtherOrMultipleCongenitalAnomalies"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalDoubleOrificeLeftSinus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalDoubleOrificeRightSinus"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryAnomaly")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryAnomalyFistulaEctopicOrigin"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-CircumflexFromLeftAndRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-CircumflexFromRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingAndCircumflexWithCommonOstium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftAnteriorDescendingFromRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftCircumflexArteryAbsent"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftCoronaryArteryFromRight"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftFromPulmonaryArtery"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-LeftMainTrunkAbsent"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAnomaly-RightFromLeft"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Criss-crossHeart"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dextroversion"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleChamberedRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleOutletLeftVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleOutletRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DoubleRightVentricle"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EbsteinAnomaly"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndocardialFibroelastosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicObstructiveCardiomyopathy-Congenital"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypoplasticLeftHeartSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypoplasticRightHeartSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedDextrocardia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedLevocardiaNoSitusInversus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MalpositionOfGreatVessels"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MalpositionOfTheHeart"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Mapca"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultipleVentricularSeptalDefect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatentDuctusArteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatentForamenOvale"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PolyspleniaSyndrome"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryStenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryAtrial-ventricularFistulaPulmonaryArtery-PulmonaryVein"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalDefect-CommonAtrium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleDextrocardiaWithSitusInversus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusVenosusAtrialSeptalDefect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StorageDiseaseOfTheHeart"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SystemicVenousObstruction"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TetralogyOfFallot"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TetralogyOfFallotWithAbsentPulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TranspositionGreatVessels-Dextro-transpositionOrLevo-transposition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TranspositionGreatVesselsCorrected"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TruncusArteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularRing"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularInversion"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Atrial-ventricularCanalType"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Membranous"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefect-Muscular")))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryAbnormality")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAneurysm"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryDilation"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryEmbolus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryThrombosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-CoronaryArtery")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-CoronaryArtery")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-CoronaryArtery-Intraoperative")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-CoronaryArtery")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MultipleCoronaryArteryAbnormalities"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyocardialBridging"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherCoronaryArteryAbnormality"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartDisease-NonValvular")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacArrhythmia")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("3rdDegreeAVBlock"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteArrhythmia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArrhythmiaOrHeartBlockOrPacemakerInsertion"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialTachycardia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EctopicHeartbeat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureAtrialComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureEctopicBeats"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WanderingPacemaker")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacArrhythmia-Junctional")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_junctional_accelerated_junctional_rhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_junctional_junctional_escape_rhythm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacFibrillation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacSinusRhythm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bradycardia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AVBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithJunctionalEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithVentricularEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-FirstDegree"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-SecondDegree")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-SecondDegree-Type1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-SecondDegree-Type2")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdDegreeAvBlock")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompleteHeartBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithJunctionalEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithVentricularEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_complete_heart_block"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_complete_heart_block_with_junctional_escape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_complete_heart_block_with_ventricular_escape")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_heart_block_complete_heart_block"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParoxysmalTachycardia-Sinus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SickSinusSyndrome"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusRhythm-Normal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusTachycardia")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicArrhythmia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FibrillationFlutterTachycardiaOrHeartBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tachycardia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParoxysmalTachycardia-Sinus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusTachycardia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupraventricularTachycardia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialTachycardia")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardia"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-NotComplete"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Paced-HeartRhythm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atrial-ventricular-PacedHeartRhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialPacedRhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtriallyPacedHeartRhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularlyPacedHeartRhythm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PermanentCardiacArrhythmia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureVentricularContraction"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureVentricularComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardiaOrFibrillation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardia"))))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardiomyopathy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicCardiomyopathy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicCardiomyopathy-Obstructiveness-NOS"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicObstructiveCardiomyopathy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicObstructiveCardiomyopathy-Congenital")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Non-obstructiveHypertrophicCardiomyopathy")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IschemicCardiomyopathy"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RestrictiveCardiomyopathyAmyloid")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericarditis")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartDisease-Other")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacEnlargement"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacEnlargement-Questionable"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiogenicShock"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardiomyopathy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicCardiomyopathy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicCardiomyopathy-Obstructiveness-NOS"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicObstructiveCardiomyopathy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertrophicObstructiveCardiomyopathy-Congenital")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Non-obstructiveHypertrophicCardiomyopathy")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IschemicCardiomyopathy"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RestrictiveCardiomyopathyAmyloid")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongestiveHeartFailure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DrugInducedToxicity"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartCondition-TumorOrMass"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartDisease-Other-NonTumorNonMyocarditis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartDisease-Other-OtherNonCardiacEnlargement"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartDisease-OtherOther"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HypertensiveHeartDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IatrogenicInjury"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleAneurysm"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myocarditis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialEffusion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericarditis")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryMyocardialDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadiationInducedToxicity"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticHeartDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleAneurysm"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalHypertrophyNonHOCM"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ToxicallyInducediatrogenic"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TraumaticHeartDisease"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalAneurysm"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartFailure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongestiveHeartFailure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRelatedProblem")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiredValvularHeartDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcquiredNonRheumaticValvularHeartDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-Generic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-Morbidity")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-CardiacValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-TricuspidValve")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-MitralValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticHeartDisease")))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheAorticValve")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValveAbnormality-NotSpecified"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-AorticValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-AorticValve"))) }), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheMitralValve")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BallooningOrProlapsedCardiacValve-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValveAbnormality-NotSpecified"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyxomatousDegeneration-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PapillaryMuscleDysfunction-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-MitralValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-MitralValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-MitralValve"))) }), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfThePulmonaryValve")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-PulmonaryValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtresiaWithIntactSeptum-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValveAbnormality-NotSpecified"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-PulmonaryValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-PulmonaryValve"))) }), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseOfTheTricuspidValve")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbnormalNumberOfCusps-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularCalcification-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atresia-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BallooningOrProlapsedCardiacValve-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Calcification-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endocarditis-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fibrosis-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyxomatousDegeneration-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PapillaryMuscleDysfunction-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-TricuspidValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValveAbnormality-NotSpecified"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveDysfunction")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-TricuspidValve"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RheumaticValveDisease-TricuspidValve"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IschemicHeartDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryDisease-Ischemic"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("In-stentStenosis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PostInfarctVentricularSeptalDefect"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricularInfarction")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricularDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleAneurysm")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricularDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleAneurysm")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleAneurysm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleAneurysm")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureVentricularComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardiaOrFibrillation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardia")))))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_atrial")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialTachycardia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EctopicHeartbeat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureAtrialComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureEctopicBeats"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WanderingPacemaker")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_atrial_other"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_atrial_supraventricular_tachycardia")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_cardiac")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacArrhythmia")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("3rdDegreeAVBlock"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteArrhythmia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArrhythmiaOrHeartBlockOrPacemakerInsertion"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialTachycardia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EctopicHeartbeat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureAtrialComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureEctopicBeats"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WanderingPacemaker")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacArrhythmia-Junctional")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_junctional_accelerated_junctional_rhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_junctional_junctional_escape_rhythm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacFibrillation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacSinusRhythm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bradycardia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AVBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithJunctionalEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithVentricularEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-FirstDegree"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-SecondDegree")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-SecondDegree-Type1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-SecondDegree-Type2")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdDegreeAvBlock")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompleteHeartBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithJunctionalEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-CompleteWithVentricularEscape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_complete_heart_block"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_complete_heart_block_with_junctional_escape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_complete_heart_block_with_ventricular_escape")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_heart_block_complete_heart_block"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParoxysmalTachycardia-Sinus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SickSinusSyndrome"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusRhythm-Normal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusTachycardia")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicArrhythmia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FibrillationFlutterTachycardiaOrHeartBlock")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationOrFlutterRequiringTreatment"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFlutter-Paroxysmal")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tachycardia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ParoxysmalTachycardia-Sinus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SinusTachycardia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupraventricularTachycardia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialTachycardia")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardia"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartBlock-NotComplete"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Paced-HeartRhythm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Atrial-ventricular-PacedHeartRhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialPacedRhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtriallyPacedHeartRhythm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularlyPacedHeartRhythm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PermanentCardiacArrhythmia"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureVentricularContraction"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureVentricularComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardiaOrFibrillation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardia"))))) })), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_other_pulseless_electrical_activity"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_accelerated_idioventricular"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartRhythm_ventricular_ventricular_escape"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularArrhythmia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrematureVentricularComplex"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardiaOrFibrillation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularFibrillation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularTachycardia")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherHeartRhythmType")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Asystole"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IdioventricularHeartRhythm"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HematologicDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anemia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HemolyticAnemia"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hernia")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HiatalHernia")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectedEndocardialPacingLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectedEpicardialPacingLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Infection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfectionOrMycotic-DescendingThoracicAorta")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InflammationCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myocarditis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericarditis")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntramuralHematoma-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeakInEndograftStent-AorticArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeakInEndograftStent-DescendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LifeThreateningCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cancer"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiabetesMellitus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hepatitis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImmediatelyLifeThreateningCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacArrest"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stroke-PhysiologicalCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrokeDueToBleed"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrokeDueToEmbolus")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyxomatousDegeneration")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyxomatousDegeneration-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyxomatousDegeneration-TricuspidValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NeurologicalAilmentCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NeurologicalDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CerebrovascularNeurologicAttack")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stroke-PhysiologicalCondition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrokeDueToBleed"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StrokeDueToEmbolus")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TIAOrRIND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReversibleIschemicNeurologicDeficit"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransientIschemicAttack"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DementiaOrAlzheimersDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherCentralNervousSystemDisease"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Normal-Condition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalAorticValve-Condition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalEndograftStent-AorticArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalEndograftStent-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalEndograftStent-DescendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalMitralValve-Condition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalPulmonaryValve-Condition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NormalTricuspidValve-Condition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherDiagnosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteRheumaticFever"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollagenDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConnectiveTissueDisease-Non-marfan"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dyslipidemia"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Immunosupressed-Condition"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MarfansSyndrome"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Obesity")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MorbidObesity"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PapillaryMuscleDysfunction")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PapillaryMuscleDysfunction-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PapillaryMuscleDysfunction-TricuspidValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDysfunction-TricuspidValve")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticPseudoaneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pseudoaneurysm-ThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-Circulatory")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-CardiacValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-MitralValve")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValveRegurgitationFromPapillaryMuscleDysfunction")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Regurgitation-TricuspidValve"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RenalDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RenalFailure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RenalFailureRequiringDialysis"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RespiratoryAilment")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LungDisease")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease-Mild"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease-Moderate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicLungDisease-Severe"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-Clinical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-Pharmacologic"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryEmbolism"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertension"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertension-Clinical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertension-Primary"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertension-Secondary"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertensionWithNoPaSystolicPressureReading"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertensionWithPaSystolicPressureGt35"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryHypertensionWithRVSystolicPressureGt35"))) })), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkinAilment")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Scleroderma")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-Condition")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-AorticValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-MitralValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-PulmonaryValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Stenosis-TricuspidValve")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan20")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan20LessThanOrEqualTo75"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan75")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan79"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryStenosis")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuspectedDissectingAneurysm-AbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuspectedDissectingAneurysm-AortaArch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuspectedDissectingAneurysm-AorticRoot"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuspectedDissectingAneurysm-AscendingAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuspectedDissectingAneurysm-ThoracicAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryThrombosis"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaThrombosis")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingThoracicAortaThrombosis")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis-Aorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombosis-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trombosis-AortaArch")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Trauma-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TumorCondition"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UlcerDisease")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticUlcer")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PenetratingUlcer-DescendingThoracicAorta")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularDisorder")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm_Or_Dissection")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AbdominalAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AbdominalAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AortaArch")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AorticRoot")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AscendingAorta")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-DescendingThoracicAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-DescendingThoracicAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-ThoracicAbdominalAorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysm-ThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-ThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaUnspecifiedAneurysm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalAnyeurysm-Congenital")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryAneurysm"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-ThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DissectingAneurysm-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SaccularAneurysm-DescendingThoracicAorta"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleAneurysm"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleAneurysm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalAneurysm"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaAneurysmOrDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteAorticDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicAortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAneurysm")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaUnspecifiedAneurysm"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteAorticDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-CoronaryArtery")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-CoronaryArtery-Intraoperative")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteAorticDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AbdominalAorta-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicAortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AortaArch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AorticRoot-Intraoperative"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-AscendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteIntraoperativeDissection-DescendingThoracicAorta")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dissection-DescendingThoracicAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AcuteDissection-DescendingThoracicAorta")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicAortaDissection")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AbdominalAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AortaArch"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AorticRoot"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-AscendingAorta"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-DescendingThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChronicDissection-CoronaryArtery")))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArterioscleroticObliterans"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan20")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan20LessThanOrEqualTo75"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan75")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarotidArteryStenosisGreaterThan79"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Embolus-Systemic")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryEmbolus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryEmbolism")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PeripheralVascularDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryStenosis")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiseaseAfflictingPartFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Liver"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HepaticFailure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DigestiveHepaticFailure")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hepatitis")))) })))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-VascularProcedure"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchCAEGuidanceMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCFMedicalResearch-Allotment"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Allograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnulusEnlarging-ValvularProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnteriorToAnteriorCardiacValveChordaeTransfer"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnterolateralCommissuroplasty"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnteroseptalCommisuroplasty"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaProcedureOrIABPProcedure-ExceptionSpecification")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AortaProcedure-ExceptionSpecification"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Intra-aorticBalloonPumpRemovalOrInsertion-ExceptionSpecification")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAneurysmRepair-STS"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Lung-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-LymphNode-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Myocardium-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Pericardium-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Pleura-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChestWallBiopsyOfBoneMarrow-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularBiopsy-VascularProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BleedingControl-Chest-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvacuationOfHematoma-ChestCavity-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialWindow-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacOrThoracicAortaProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacProcedure-Expanded"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-STS")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacOrThoracicAortaProcedure-NonExpanded")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacProcedure-CCF")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssistDeviceProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_assist_device_revision"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialEndarterectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialExcisionOfTumor-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialExcisionProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MazeProcedure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryVeinIsolationProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadioFrequencyAblationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BipolarRadiofrequencyAblation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnipolarRadiofrequencyAblation"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialPlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialRepairProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptectomy-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialThrombectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialWallDebridement-SurgicalProcedure"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacSeptumProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-AtrialOrVentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-PostInfarctIvsd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalMyectomy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_debridement"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_repair_of_atrial_septum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_repair_of_post_infarct_ventricular_septal_defect"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalHeartProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AVCanalCompleteCorrectionIncludesASDPatchRepair-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-aorticConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAllograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArterialSwitch-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaToDescendingAortaGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaToPulmonaryArteryShuntWaterson-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortoplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalSeptalDefectRepairSurgery")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectRepairProcedure-Congenital")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectSutureClosure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_atrial_septal_defect_patch_closure")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefectRepairProcedure-Congenital")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VsdPatchClosure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VsdSutureClosure-SurgicalProcedure"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CorrectionAnomalousVenousReturn-TotalOrPartial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CreationOfAorto-pulmonaryWindow-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CreationPericardialMonocuspValve-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DamusKayStanselProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaToPulmonaryArteryShuntPotts-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DivisionOfAorticArchOrRemoval-VascularRing-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnlargementIasd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExcisionCardiacDiverticulum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftSubclavianToDescendingAortaGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationAnomalousSystemicVeinsSuperiorVenaCava-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationOfCoronaryArteryOrFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationSystemicFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeeShuntMelbourne-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NorwoodProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObliterationOfAortoPulmonaryArteryCommunication"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchOrAngioplastyOfAortaForCoarctationOrInterrupt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticAorto-pulmonaryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticGraft-AortaToPulmonaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArterioplastyOrReconstruction-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryAllograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryBanding-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadicalAtrialSeptectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RastelliProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Re-implantationOfCoronaryArteryToAorta-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReconstructionOfCoronaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairCleftMitralValveLeaflet-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAnd1ReanastomosisForCoarctationOrInterruption-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionDiscreteSubvalvularMuscle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionLeftVentricularMuscle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionOfLeftAtrialMembraneCortriatrium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionRightVentricleMuscle-Infundibulectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfBlalock-taussigShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfPottsShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfWatersonShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentriclePlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricularOutflowPatch-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubaorticStenosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuperiorVenaCavaToPulmonaryArterGlenn-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Supra-aorticStenosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalBandingOfPulmonaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_Da_Silva_valve_repair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_Danielson_technique"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_aorta-aortic_conduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_atrial_re-direction_of_venous_flow_senning_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_complete_correction_of_atrioventricular_canal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_aorto-pulmonary_window"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_pulmonary_pericardial_monocusp_valve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_enlargement_intra-atrial_septal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_intra-atrial_baffle_mustard_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_left_subclavian_or_aortic_arch_to_descending_aorta_graft"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_ligation_systemic_vessel_fistula"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_obliteration_or_ligation_of_patent_ductus_arteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_patch_or_angioplasty_for_coarctation_or_interruption_of_aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_patent_foramen_ovale_closure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_prosthetic_aorto-pulmonary_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_re-implantation_of_native_coronary_artery_to_aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_and_single_reanastomosis_for_aortic_coarctation_or_interruption"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_atrial_membrane_-_radical_atrial_septectomy"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_of_supra-aortic_stenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_revision_of_blalock-taussig_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_subclavian_to_pulmonary_artery_shunt_blalock-taussig"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_ascending_aorta_to_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_descending_aorta_to_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_subclavian-pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_superior_vena_cava_-_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalShunting-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downAscendingAorta-pulmonaryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downDescendingAorta-pulmonaryArteryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downPulmonaryArteryBanding-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downSubclavian-pulmonaryArteryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downSuperiorVenaPulmonaryArteryShuntWaterson-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnifocalizationOfMapcas-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnroofingOfCoronaryOstium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptation-SurgicalProcedure"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithBilateralITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithMultipleGrafts"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabgWithSingleITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleGraftCAGB")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartTransplantProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartVentricleProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysmectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Myocardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardiomyoplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation-VentricularTissue-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-VentricularWall-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaRepairWithPatch-LeftVentricle-rightAtrium-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyocorSplint-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfAcornDevice-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_batista_procedure_on_right_ventricle")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkeletalMuscleCellDiacrinTransplant-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_debridement_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_debridement_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_excision_of_tumor"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_ventricular_wall"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_resection_of_subendocardium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_stem_cell_injection"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransmyocardialRevascularization-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tri-svr-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularPlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ventriculotomy-SurgicalProcedure"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherCardiacProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularReconstruction-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacExplorationOnly-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacPartialAutotransplantation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiopulmonaryBypass-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvacuationOfHematoma-PericardiumMediastinumDueToBleed-tamponade-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NotCardiopulmonaryBypass-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatch-Non-congenital-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-CoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FibrousTrigone-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfHeartWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrDebridement-CoronaryOstium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Revision-PulmonaryArteryAnastomosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_cardiac-thoracic_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_other"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThrombectomyFromPacingLeads-wires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnspecifiedCardiac-thoracicProcedure-SurgicalProcedure"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularCoronaryArteryProcedure-Surgical"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeckPoudrage-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Pericardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-PericardialCyst-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialWindow-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiocentesis-drainageOfPericardialEffusion-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrDebridement-Pericardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_pericardiocentesis"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DrainageOfPacemakerWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Explant-BiventricularPacerCrtIcd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Explant-Icd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantICDWithSingleChamberOrDualChamberPacing-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfEndocardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfEpicardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfImplantableCardioverterDefibrillatorPatch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Implant-BiventricularPacerCrtIcd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Implant-Icd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOrExplant-Icd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOrExplant-PermanentPacemaker-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MappingAndAblationOfAccessoryPathways-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PacemakerInsertion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Placement-PpmicdEndocardialLead-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementEpicardialLeadsNotIncludingLeftVentricular-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfRightAtrialEpicardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfRightVentricularEpicardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfEpicardialPacingWires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfICDLeads-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfTemporaryEpicardialPacingWires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfPpmicdLeads-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_endocardial_pacemaker_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_epicardial_pacemaker_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_generator"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_left_ventricular_epicardial_pacing_lead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_permanent_pacemaker"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_temporary_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_epicardial_pacing_leads_not_including_left_ventricular"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_left_ventricular_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_permanent_endocardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_right_atrial_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_right_ventricular_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_revision_of_permanent_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_thrombectomy_from_pacing_leads"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_Vineberg-Sewell_implant"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_pulmonary"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_vena_cava"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-CSQR"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-Surgical")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbortedCardiacProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssistDeviceProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_assist_device_revision"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialEndarterectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialExcisionOfTumor-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialExcisionProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MazeProcedure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryVeinIsolationProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadioFrequencyAblationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BipolarRadiofrequencyAblation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnipolarRadiofrequencyAblation"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialPlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialRepairProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptectomy-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialThrombectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialWallDebridement-SurgicalProcedure"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacSeptumProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-AtrialOrVentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-PostInfarctIvsd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalMyectomy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_debridement"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_repair_of_atrial_septum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_repair_of_post_infarct_ventricular_septal_defect"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalHeartProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AVCanalCompleteCorrectionIncludesASDPatchRepair-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-aorticConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAllograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArterialSwitch-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaToDescendingAortaGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaToPulmonaryArteryShuntWaterson-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortoplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalSeptalDefectRepairSurgery")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectRepairProcedure-Congenital")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectSutureClosure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_atrial_septal_defect_patch_closure")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefectRepairProcedure-Congenital")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VsdPatchClosure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VsdSutureClosure-SurgicalProcedure"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CorrectionAnomalousVenousReturn-TotalOrPartial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CreationOfAorto-pulmonaryWindow-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CreationPericardialMonocuspValve-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DamusKayStanselProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaToPulmonaryArteryShuntPotts-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DivisionOfAorticArchOrRemoval-VascularRing-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnlargementIasd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExcisionCardiacDiverticulum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftSubclavianToDescendingAortaGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationAnomalousSystemicVeinsSuperiorVenaCava-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationOfCoronaryArteryOrFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationSystemicFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeeShuntMelbourne-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NorwoodProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObliterationOfAortoPulmonaryArteryCommunication"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchOrAngioplastyOfAortaForCoarctationOrInterrupt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticAorto-pulmonaryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticGraft-AortaToPulmonaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArterioplastyOrReconstruction-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryAllograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryBanding-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadicalAtrialSeptectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RastelliProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Re-implantationOfCoronaryArteryToAorta-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReconstructionOfCoronaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairCleftMitralValveLeaflet-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAnd1ReanastomosisForCoarctationOrInterruption-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionDiscreteSubvalvularMuscle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionLeftVentricularMuscle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionOfLeftAtrialMembraneCortriatrium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionRightVentricleMuscle-Infundibulectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfBlalock-taussigShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfPottsShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfWatersonShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentriclePlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricularOutflowPatch-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubaorticStenosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuperiorVenaCavaToPulmonaryArterGlenn-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Supra-aorticStenosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalBandingOfPulmonaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_Da_Silva_valve_repair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_Danielson_technique"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_aorta-aortic_conduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_atrial_re-direction_of_venous_flow_senning_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_complete_correction_of_atrioventricular_canal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_aorto-pulmonary_window"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_pulmonary_pericardial_monocusp_valve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_enlargement_intra-atrial_septal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_intra-atrial_baffle_mustard_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_left_subclavian_or_aortic_arch_to_descending_aorta_graft"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_ligation_systemic_vessel_fistula"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_obliteration_or_ligation_of_patent_ductus_arteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_patch_or_angioplasty_for_coarctation_or_interruption_of_aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_patent_foramen_ovale_closure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_prosthetic_aorto-pulmonary_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_re-implantation_of_native_coronary_artery_to_aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_and_single_reanastomosis_for_aortic_coarctation_or_interruption"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_atrial_membrane_-_radical_atrial_septectomy"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_of_supra-aortic_stenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_revision_of_blalock-taussig_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_subclavian_to_pulmonary_artery_shunt_blalock-taussig"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_ascending_aorta_to_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_descending_aorta_to_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_subclavian-pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_superior_vena_cava_-_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalShunting-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downAscendingAorta-pulmonaryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downDescendingAorta-pulmonaryArteryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downPulmonaryArteryBanding-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downSubclavian-pulmonaryArteryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downSuperiorVenaPulmonaryArteryShuntWaterson-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnifocalizationOfMapcas-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnroofingOfCoronaryOstium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptation-SurgicalProcedure"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation-VentricularTissue-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartTransplantProcedure-Surgical"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anuloplasty")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnuloplastyWithRing")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompleteAnnuloplastyWithRing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anuloplasty-WithoutRing-Complete"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anuloplasty-WithoutRing-Incomplete")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Antero-posteriorCommissuroplasty"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-AccordingToKay-bicuspidization"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Anteroposterior"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-CongenitalBiscupsid"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Left-anterior"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Posteroseptal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Right-anterior")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairReplacementOrExploration")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-AorticValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-MitralValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-PulmonaryValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-TricuspidValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plication-ValvularProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialPlication-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plication-BicuspidLeaflet"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentriclePlication-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reconstruction-CardiacValveRepair")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularReconstruction-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RootReconstruction")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reorientation-CardiacValveRepair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_aortic_valve_aborted_repair_attempt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_mitral_valve_aborted_repair_attempt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_pulmonary_valve_aborted_repair_attempt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_tricuspid_valve_aborted_repair_attempt"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_tricuspid_valvectomy"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartVentricleProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysmectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Myocardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardiomyoplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation-VentricularTissue-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-VentricularWall-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaRepairWithPatch-LeftVentricle-rightAtrium-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyocorSplint-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfAcornDevice-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_batista_procedure_on_right_ventricle")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkeletalMuscleCellDiacrinTransplant-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_debridement_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_debridement_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_excision_of_tumor"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_ventricular_wall"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_resection_of_subendocardium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_stem_cell_injection"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransmyocardialRevascularization-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tri-svr-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularPlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ventriculotomy-SurgicalProcedure"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherCardiacProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularReconstruction-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacExplorationOnly-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacPartialAutotransplantation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiopulmonaryBypass-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvacuationOfHematoma-PericardiumMediastinumDueToBleed-tamponade-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NotCardiopulmonaryBypass-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatch-Non-congenital-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-CoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FibrousTrigone-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfHeartWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrDebridement-CoronaryOstium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Revision-PulmonaryArteryAnastomosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_cardiac-thoracic_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_other"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThrombectomyFromPacingLeads-wires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnspecifiedCardiac-thoracicProcedure-SurgicalProcedure"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeckPoudrage-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Pericardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-PericardialCyst-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialWindow-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiocentesis-drainageOfPericardialEffusion-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrDebridement-Pericardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_pericardiocentesis"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TBLOperativeValveProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Valvuloplasty-MedicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValvuloplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Anterolateral"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Anteroseptal"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Left-anterior"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Left-noncoronary"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Posteromedial"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Posteroseptal"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Right-anterior"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-Right-noncoronary"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissurotomy-right-left"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CusaValvuloplasty"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValvuloplasty-SurgicalProcedure")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RoboticSurgery"))))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_alfieir_leaflet_stitch_anterior-posterior"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_augmentation_with_pericardium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_cone_repair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_cut_of_leaflet_bridge"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_repair_with_homograft"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_replacement"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_separation_of_fused_structures"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_shorten"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_sling_repair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CleftRepair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConduitRelated-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-aorticConduit-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BentallHemashieldValvedConduit-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReplacementWithConduit-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Decalcification-ValvularProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DevegaProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EdgeToEdgeRepair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fenestration"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedCABGExclusion-NonExpandedGraph")), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonConcomitantExclusion-NonExpandedGraph")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysmectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAneurysmRepair-STSNonExpandedGraph"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MazeProcedure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryVeinIsolationProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadioFrequencyAblationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BipolarRadiofrequencyAblation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnipolarRadiofrequencyAblation"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalHeartProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AVCanalCompleteCorrectionIncludesASDPatchRepair-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aorta-aorticConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticAllograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArterialSwitch-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaToDescendingAortaGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortaToPulmonaryArteryShuntWaterson-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AscendingAortoplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalSeptalDefectRepairSurgery")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectRepairProcedure-Congenital")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialSeptalDefectSutureClosure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_atrial_septal_defect_patch_closure")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptalDefectRepairProcedure-Congenital")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VsdPatchClosure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VsdSutureClosure-SurgicalProcedure"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CorrectionAnomalousVenousReturn-TotalOrPartial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CreationOfAorto-pulmonaryWindow-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CreationPericardialMonocuspValve-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DamusKayStanselProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DescendingAortaToPulmonaryArteryShuntPotts-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DivisionOfAorticArchOrRemoval-VascularRing-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnlargementIasd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExcisionCardiacDiverticulum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InnominateArteryToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftSubclavianToDescendingAortaGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleToAortaConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationAnomalousSystemicVeinsSuperiorVenaCava-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationOfCoronaryArteryOrFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LigationSystemicFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MeeShuntMelbourne-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NorwoodProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObliterationOfAortoPulmonaryArteryCommunication"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchOrAngioplastyOfAortaForCoarctationOrInterrupt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticAorto-pulmonaryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticGraft-AortaToPulmonaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArterioplastyOrReconstruction-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryAllograft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryArteryBanding-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadicalAtrialSeptectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RastelliProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Re-implantationOfCoronaryArteryToAorta-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReconstructionOfCoronaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairCleftMitralValveLeaflet-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAnd1ReanastomosisForCoarctationOrInterruption-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionDiscreteSubvalvularMuscle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionLeftVentricularMuscle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionOfLeftAtrialMembraneCortriatrium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionRightVentricleMuscle-Infundibulectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfBlalock-taussigShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfPottsShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfWatersonShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightAtriumToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentriclePlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleToPulmonaryArteryConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricularOutflowPatch-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubaorticStenosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuperiorVenaCavaToPulmonaryArterGlenn-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Supra-aorticStenosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalBandingOfPulmonaryArtery-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_Da_Silva_valve_repair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_Danielson_technique"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_aorta-aortic_conduit"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_atrial_re-direction_of_venous_flow_senning_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_closed_atrial_septectomy_blalock-hanlon"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_complete_correction_of_atrioventricular_canal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_aorto-pulmonary_window"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_creation_of_pulmonary_pericardial_monocusp_valve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_enlargement_intra-atrial_septal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_intra-atrial_baffle_mustard_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_left_subclavian_or_aortic_arch_to_descending_aorta_graft"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_ligation_systemic_vessel_fistula"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_obliteration_or_ligation_of_patent_ductus_arteriosus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_patch_or_angioplasty_for_coarctation_or_interruption_of_aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_patent_foramen_ovale_closure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_prosthetic_aorto-pulmonary_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_re-implantation_of_native_coronary_artery_to_aorta"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_and_single_reanastomosis_for_aortic_coarctation_or_interruption"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_atrial_membrane_-_radical_atrial_septectomy"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_resection_of_supra-aortic_stenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_revision_of_blalock-taussig_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_subclavian_to_pulmonary_artery_shunt_blalock-taussig"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_ascending_aorta_to_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_descending_aorta_to_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_subclavian-pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_take_down_superior_vena_cava_-_pulmonary_artery_shunt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalShunting-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downAscendingAorta-pulmonaryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downDescendingAorta-pulmonaryArteryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downPulmonaryArteryBanding-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downSubclavian-pulmonaryArteryShunt-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Take-downSuperiorVenaPulmonaryArteryShuntWaterson-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValvuloplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnifocalizationOfMapcas-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnroofingOfCoronaryOstium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularSeptation-SurgicalProcedure"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartTransplantProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherNonCardiacProcedure-STSNonExpandedGraph")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherNonCardiacOther-STSNonExpandedGraph")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KidneyTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LiverTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherNoncardiothoracicProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-KommerellsDiverticulum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_noncardiothoracic_other"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_noncardiothoracic_repair_of_leg_wound")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PancreasTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_abdominal_drainage_of_ascites")))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherNonCardiacOtherThoracic-STSNonExpandedGraph")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Decortication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiaphragmProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-DiaphragmaticHernia-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_diaphragm_excision_of_diaphragm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LungTransplantProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MediastinumNeckThymectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pleurodesis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Lung-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-LungBulla-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatchToLungs-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryEmbolectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Lung-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_pulmonary_valvectomy")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_chest_open"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_excision_of_tumor-mass_in_thoracic_cavity"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_pulmonary"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_vena_cava"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfHeartWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_septum_repair_of_post_infarct_ventricular_septal_defect"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransmyocardialRevascularization-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tri-svr-SurgicalProcedure"))) }), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedCABGProcedure-NonExpandedGraph"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeafletPatching"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Left-RightCommissuroplasty"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MycorAnuloplastySystemPlacement"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myectomy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeptalMyectomy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_congenital_heart_procedure_septal_myectomy"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Non-coronary-LeftCommissuroplasty"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NoncardiacProcedure-NonExpanded"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartialResection"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatch")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatch-Non-congenital-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfArtificialChordae"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfSubannularSuturesInTheLvot"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PosteromedialCommissuroplasty"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrimaryProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProcedurePerformedDuringReop"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveRingRemoval"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedoProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reimplantation"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Remodeling-5"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfPreviousAlfieriStitch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionOfStenosis"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveRepairProcedure_resection_of_retained_leaflet"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompleteResection"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-CardiacValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-KommerellsDiverticulum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Lung-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionAneurysmSinusOfValsalva-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionOfPannus"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resuspension"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResuturingPre-existingRing"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Right-Non-coronaryCommissuroplasty"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Shaving-ValvularProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SlidingRepair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalCardiacAssistDeviceInsertion")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalCardiacAssistDeviceRemoval")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure-Abdominal")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nephrectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-Ventral-incisionalHernia-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfSpleen-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Splenectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_abdominal_drainage_of_ascites")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedureNonCongenital")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AirwayProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_airway_resection_of_bronchus"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tracheostomy-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aortoplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BentallHemashieldValvedConduit-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-Surgical")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArterioscleroticPlaqueRemoval-Procedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endarterectomy-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialEndarterectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndarterectomyLaser-SurgicalProcedure"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endarterectomy-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonCarotidArtery")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AssistDeviceProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_assist_device_revision"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_extracorporeal_membrane_oxygenation_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_intra-aortic_balloon_pump_removal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_insertion"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_assist_device_ventricular_assist_device_removal")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialExcisionProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialFibrillationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MazeProcedure-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryVeinIsolationProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RadioFrequencyAblationProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BipolarRadiofrequencyAblation"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnipolarRadiofrequencyAblation"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialWallDebridement-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BalloonDilatation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BypassGraftWithSaphenousVein-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithBilateralITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithMultipleGrafts"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabgWithSingleITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleGraftCAGB"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BypassGraftWithHemashield-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabrolFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChestWallProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChestWallBiopsyOfBoneMarrow-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-RewireOfSternum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairLungOrChestWall-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SternalFractureRepair-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_chest_wall_pectus_repair"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_chest_wall_repair_of_lung-chest_wall")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalIntervention-MedicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryProcedureNonCongenital-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithBilateralITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithMultipleGrafts"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabgWithSingleITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleGraftCAGB")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularCoronaryArteryProcedure-Surgical"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryProcedureNonCongenital-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryLaserProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation-VentricularTissue-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-AtrialOrVentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-VascularProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDebridement")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiaphragmProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-DiaphragmaticHernia-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_diaphragm_excision_of_diaphragm")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularProcedure-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debranching_with_endovascular_stent_graft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentGraftPlacementAfterLeak-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedureName_endovascular_stent_graft_antegrade"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedureName_endovascular_stent_graft_retrograde")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EsophagogastricProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GiUnspecified-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_esophagogastric_control_bleeding")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-Aneurysm-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-SurgicalProcedure"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anuloplasty")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnuloplastyWithRing")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CompleteAnnuloplastyWithRing")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anuloplasty-WithoutRing-Complete"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Anuloplasty-WithoutRing-Incomplete")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Antero-posteriorCommissuroplasty"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-AccordingToKay-bicuspidization"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Anteroposterior"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-CongenitalBiscupsid"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Left-anterior"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Posteroseptal"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Commissuroplasty-Right-anterior")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairReplacementOrExploration")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-AorticValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-MitralValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-PulmonaryValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Exploration-TricuspidValve-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plication-ValvularProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialPlication-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plication-BicuspidLeaflet"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentriclePlication-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reconstruction-CardiacValveRepair")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularReconstruction-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RootReconstruction")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Reorientation-CardiacValveRepair"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_aortic_valve_aborted_repair_attempt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_mitral_valve_aborted_repair_attempt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_pulmonary_valve_aborted_repair_attempt"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_tricuspid_valve_aborted_repair_attempt"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveProcedure-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_tricuspid_valvectomy"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepairOrReplacement")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve")))))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartVentricleProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aneurysmectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Myocardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardiomyoplasty-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cryoablation-VentricularTissue-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-VentricularWall-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftVentricleProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BatistaProcedure-LeftVentricle-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DorProcedure-LeftVentricle-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FistulaRepairWithPatch-LeftVentricle-rightAtrium-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MyocorSplint-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVentricularRemodelingProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfAcornDevice-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RightVentricleProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_batista_procedure_on_right_ventricle")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SkeletalMuscleCellDiacrinTransplant-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_debridement_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_debridement_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_excision_of_tumor"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_ventricular_wall"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_resection_of_subendocardium"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_stem_cell_injection"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransmyocardialRevascularization-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tri-svr-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularPlication-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ventriculotomy-SurgicalProcedure"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageExclusionUsingStaples-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageLigation-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LeftAtrialAppendageSizeReduction-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_atrium_left_atrial_appendage_exclusion_using_clip"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MediastinumOrNeckProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-LymphNode-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvacuationOfHematoma-ChestCavity-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvacuationOfHematoma-Subclavicular-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MediastinumNeckThymectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchPlacement-Mediastinum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_mediastinum-neck_evacuation_of_hematoma_in_subclavicular")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Myectomy-VentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nephrectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Omentopexy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherNoncardiothoracicProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-KommerellsDiverticulum-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_noncardiothoracic_other"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_noncardiothoracic_repair_of_leg_wound")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherSurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ControlBleeding-SurgicalProcedure"))), (SubLObject)ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherCardiacProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnnularReconstruction-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacExplorationOnly-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacPartialAutotransplantation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiopulmonaryBypass-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvacuationOfHematoma-PericardiumMediastinumDueToBleed-tamponade-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NotCardiopulmonaryBypass-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatch-Non-congenital-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-CoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FibrousTrigone-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfHeartWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrDebridement-CoronaryOstium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Subendocardial-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Revision-PulmonaryArteryAnastomosis-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_cardiac-thoracic_procedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_other"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThrombectomyFromPacingLeads-wires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnspecifiedCardiac-thoracicProcedure-SurgicalProcedure"))) })), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_pulmonary"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_vena_cava")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Oversewing"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchGraft-SaphenousVein-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchGraft-SurgicalProcedure"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeckPoudrage-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Pericardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-PericardialCyst-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialWindow-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiectomy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pericardiocentesis-drainageOfPericardialEffusion-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrDebridement-Pericardium-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_evacuation_of_hematoma_in_pericardium_or_mediastinum"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_pericardium_pericardiocentesis"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PleuraProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Pleura-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Decortication-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherPleuraProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Pleurodesis-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Biopsy-Lung-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-LungBulla-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PericardialPatchToLungs-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryEmbolectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-Lung-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_cardiac_valve_pulmonary_valvectomy")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialRepairProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HerniaRepairProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-DiaphragmaticHernia-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-Ventral-incisionalHernia-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicHerniaRepair-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonHerniaRepairThoracic-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrioventricularGroove-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-CoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FibrousTrigone-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-FreeWallVentricularRupture-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-PostInfarctIvsd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-SubvalvularApparatus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularSeptum-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairLungOrChestWall-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfHeartWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfPerivalvularLeak"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfSpleen-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOfSubvalvularArea-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairWithRe-implantationOfAorticValve-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularRepairProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAorta")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aortoplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairAfterPercutaneousValveReplacement-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairByButton-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairByPatchGraft-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairByStitch-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VentricularRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-VentricularOutflowTract-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_repair_of_left_ventricular_outflow_tract"))))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Replacement-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BentallHemashieldValvedConduit-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OrganTransplantProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KidneyTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LiverTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LungTransplantProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PancreasTransplantProcedure-Surgical")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReplacementWithConduit-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReplacementSurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReplacingFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValve"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IsolatedIndividualTypeOfTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MitralValve")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PulmonaryValve")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartValveReplacement-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TricuspidValve"))))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Resection-CardiacValve"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResectionOfPannus"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Shunt-bypassGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure-Noncardiac"))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DrainageOfPacemakerWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Explant-BiventricularPacerCrtIcd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Explant-Icd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantICDWithSingleChamberOrDualChamberPacing-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfEndocardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfEpicardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfImplantableCardioverterDefibrillatorPatch"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Implant-BiventricularPacerCrtIcd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Implant-Icd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOrExplant-Icd-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOrExplant-PermanentPacemaker-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MappingAndAblationOfAccessoryPathways-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PacemakerInsertion-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentBiventricularPacemaker-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImplantOfPermanentPacemakerSingleChamberOrDualChamber-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Placement-PpmicdEndocardialLead-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementEpicardialLeadsNotIncludingLeftVentricular-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfRightAtrialEpicardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlacementOfRightVentricularEpicardialPacemakerLead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfEpicardialPacingWires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfICDLeads-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfTemporaryEpicardialPacingWires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RevisionOfPpmicdLeads-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_endocardial_pacemaker_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_epicardial_pacemaker_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_generator"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_implantable_cardioverter_defibrillator_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_left_ventricular_epicardial_pacing_lead"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_permanent_pacemaker"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_explant_of_temporary_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_epicardial_pacing_leads_not_including_left_ventricular"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_left_ventricular_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_permanent_endocardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_right_atrial_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_implant_of_right_ventricular_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_revision_of_permanent_epicardial_pacing_leads"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_eps_thrombectomy_from_pacing_leads"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalWoundTreatment-SurgicalProcedure")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ChestClosure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DebridementOfOperativeWoundNotSternal-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HematomaRemovalFromGraftHarvestSite-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfSternalWires-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SternalRe-wire-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SternalResection-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_surgical_wound_treatment_debridement_or_rewire_of_sternum")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SternalDebridement-SurgicalProcedure")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_surgical_wound_treatment_sternal_fixation"))) }), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonHerniaRepairThoracic-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherThoracicProcedure-Surgical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RemovalOfForeignBodyMaterials-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairThoracicWound-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_chest_closure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_chest_open"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_control_bleeding"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_excision_of_tumor-mass_in_thoracic_cavity"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_not_transplant"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicHerniaRepair-SurgicalProcedure"))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThrombectomyOrTumorExcision-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TumorExcision")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialExcisionOfTumor-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Excision-ValvularTumor"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_other_cardiac_excision_of_tumor-mass_in_pulmonary_artery")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_thoracic_excision_of_tumor-mass_in_thoracic_cavity"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_excision_of_tumor")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairingFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BloodVessel"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAorta")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAorta")))))) }), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuturingProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SuturingProcedure-FigureOf8")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestCollectionForMV"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thrombectomy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialThrombectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricle"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_ventricular_outflow_tract")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_ventricle_thrombectomy_of_left_ventricular_outflow_tract"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Transfer"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransferPosteriorToAnterior"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransferPosteriorToPosterior"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedure-OtherOrAorta")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aortoplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BentallHemashieldValvedConduit-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-Surgical")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_pulmonary"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_vena_cava")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-STS")))), ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedure-Surgical")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AorticProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAortaProcedure-Surgical"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aortoplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BentallHemashieldValvedConduit-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ElephantTrunkAortaReplacementStage1-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAortaProcedure-Surgical")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArterioscleroticPlaqueRemoval-Procedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endarterectomy-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AtrialEndarterectomy-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndarterectomyLaser-SurgicalProcedure"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Endarterectomy-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonCarotidArtery")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BalloonDilatation-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BypassGraftWithSaphenousVein-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithBilateralITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithMultipleGrafts"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabgWithSingleITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleGraftCAGB"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BypassGraftWithHemashield-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabrolFistula-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CongenitalIntervention-MedicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryProcedureNonCongenital-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithBilateralITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CABGWithMultipleGrafts"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CabgWithSingleITAGraft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SingleGraftCAGB")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularCoronaryArteryProcedure-Surgical"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionDifferenceFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryProcedureNonCongenital-Surgical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryArteryBypassGraft-SurgicalProcedure"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoronaryLaserProcedure-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debridement-VascularProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProstheticValveDebridement")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularProcedure-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debranching_with_endovascular_stent_graft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentGraftPlacementAfterLeak-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedureName_endovascular_stent_graft_antegrade"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedureName_endovascular_stent_graft_retrograde")))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GraftInsertion")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentGraft-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Debranching_with_endovascular_stent_graft"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndovascularStentGraftPlacementAfterLeak-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedureName_endovascular_stent_graft_antegrade"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularProcedureName_endovascular_stent_graft_retrograde"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Omentopexy-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OtherVascularProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_pulmonary"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SurgicalProcedure_vascular_vena_cava")))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Oversewing"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchGraft-SaphenousVein-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PatchGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReplacementWithConduit-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RoofingOfCoronarySinus-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Shunt-bypassGraft-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThrombectomyOrTumorExcision-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unroofing-SurgicalProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularBiopsy-VascularProcedure"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VascularRepairProcedure-Surgical")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Repair-AtrialSeptalAneurysm-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairOrResection-VentricularSeptalAneurysm-SurgicalProcedure"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbdominalAorta")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AneurysmRepair-SurgicalProcedure")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThoracicAorta"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Aortoplasty-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairAfterPercutaneousValveReplacement-VascularProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairByButton-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairByPatchGraft-SurgicalProcedure"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RepairByStitch-SurgicalProcedure")))) }) }))))));
    }
    
    private static SubLObject _constant_285_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?PERSON")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Android")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?AGENT")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)gke_main.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Android")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?AGENT")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?ROBOT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ROBOT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Android"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)gke_main.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list((SubLObject)gke_main.ONE_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)gke_main.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)gke_main.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list((SubLObject)gke_main.ONE_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)gke_main.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dateOfEvent")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?DATE")), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)gke_main.NIL), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO")))), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cat"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?Y")))), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?Y"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OsamaBinLaden"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?Z"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"))))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("beneficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maleficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("beneficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?BENEFICIARY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?BENEFICIARY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maleficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("beneficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maleficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?WHO"))), (SubLObject)ConsesLow.list((SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.TWO_INTEGER), (SubLObject)gke_main.T, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.T, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("beneficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?MALEFICIARY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("maleficiary")), (SubLObject)SubLObjectFactory.makeSymbol("?EVENT"), (SubLObject)SubLObjectFactory.makeSymbol("?MALEFICIARY"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?MALEFICIARY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))))) });
    }
    
    public void declareFunctions() {
        declare_gke_main_file();
    }
    
    public void initializeVariables() {
        init_gke_main_file();
    }
    
    public void runTopLevelForms() {
        setup_gke_main_file();
    }
    
    static {
        me = (SubLFile)new gke_main();
        gke_main.$gke_isas_filtered_term_caching_state$ = null;
        gke_main.$gke_overly_general_non_predicate_types$ = null;
        gke_main.$gke_filtered_termP_caching_state$ = null;
        gke_main.$gke_overly_general_predicate_types$ = null;
        gke_main.$gke_predicate_filteredP_caching_state$ = null;
        gke_main.$use_rbp_wff_in_gkeP$ = null;
        gke_main.$gke_memoization_state_caching_state$ = null;
        gke_main.$generate_gke_gloss_wrt_mt_cached_caching_state$ = null;
        gke_main.$candidate_replacements_for_sentence_cached_caching_state$ = null;
        gke_main.$gke_get_elements_caching_state$ = null;
        gke_main.$omit_suggestion_stumpsP$ = null;
        gke_main.$dtp_replacement_tree$ = null;
        gke_main.$use_tva_for_suggestionsP$ = null;
        gke_main.$default_patience_wait_time$ = null;
        gke_main.$gke_query_threads$ = null;
        gke_main.$daemon_should_run_inference_statuses$ = null;
        gke_main.$gke_run_inference_with_adjusted_dynamic_propertiesP$ = null;
        gke_main.$inference_done_statuses$ = null;
        $sym0$GET_GKE_ARG_OPTIONS = SubLObjectFactory.makeSymbol("GET-GKE-ARG-OPTIONS");
        $str1$Got_unknown_arg_type_for___A__ = SubLObjectFactory.makeString("Got unknown arg type for: ~A~%");
        $kw2$PARENTS = SubLObjectFactory.makeKeyword("PARENTS");
        $str3$Natural_language_processing_has_d = SubLObjectFactory.makeString("Natural language processing has deleted an entry.~%Wrong sizes ~A and ~A");
        $kw4$CHILDREN = SubLObjectFactory.makeKeyword("CHILDREN");
        $kw5$SIBLINGS = SubLObjectFactory.makeKeyword("SIBLINGS");
        $sym6$GET_GKE_EXPANDED_ITEMS = SubLObjectFactory.makeSymbol("GET-GKE-EXPANDED-ITEMS");
        $kw7$ANY = SubLObjectFactory.makeKeyword("ANY");
        $list8 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forAll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistExactly")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtMost")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistRange")));
        $list9 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AFew-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Few-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Many-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Most-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Tens-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dozens-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Hundreds-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thousands-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Millions-Quant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Billions-Quant")) });
        $sym10$GET_GKE_QUANTIFIER_RANGES = SubLObjectFactory.makeSymbol("GET-GKE-QUANTIFIER-RANGES");
        $str11$Get_the_quantifier_ranges = SubLObjectFactory.makeString("Get the quantifier ranges");
        $sym12$STRING_LESSP = SubLObjectFactory.makeSymbol("STRING-LESSP");
        $sym13$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym14$NART_SUBSTITUTE = SubLObjectFactory.makeSymbol("NART-SUBSTITUTE");
        $int15$200 = SubLObjectFactory.makeInteger(200);
        $kw16$NEW = SubLObjectFactory.makeKeyword("NEW");
        $sym17$GKE_LIST_ITEM_COMPARATOR = SubLObjectFactory.makeSymbol("GKE-LIST-ITEM-COMPARATOR");
        $int18$175 = SubLObjectFactory.makeInteger(175);
        $sym19$GKE_FILTERED_TERM_ = SubLObjectFactory.makeSymbol("GKE-FILTERED-TERM?");
        $sym20$RKF_MAX_SPECS = SubLObjectFactory.makeSymbol("RKF-MAX-SPECS");
        $sym21$RKF_INSTANTIATIONS = SubLObjectFactory.makeSymbol("RKF-INSTANTIATIONS");
        $const22$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $sym23$GKE_ISAS_FILTERED_TERM = SubLObjectFactory.makeSymbol("GKE-ISAS-FILTERED-TERM");
        $sym24$ALL_GENLS = SubLObjectFactory.makeSymbol("ALL-GENLS");
        $sym25$RKF_ALL_GENLS = SubLObjectFactory.makeSymbol("RKF-ALL-GENLS");
        $sym26$_GKE_ISAS_FILTERED_TERM_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GKE-ISAS-FILTERED-TERM-CACHING-STATE*");
        $list27 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConventionalClassificationType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SiblingDisjointSetOrCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SetOrCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DisjointSetOrCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondOrderCollection")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyTangible"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ObjectType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Group")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Entity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PublicConstant-DefinitionalGAFsOK")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistingStuffType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StuffType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PublicConstant-CommentOK")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReformulatorIrrelevantFORT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistingObjectType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")) });
        $sym28$_GKE_FILTERED_TERM__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GKE-FILTERED-TERM?-CACHING-STATE*");
        $list29 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SetOrCollectionPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EvaluatablePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RuleMacroPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("OpenCycDefinitionalPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VocabularyDefiningPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultMonotonicPredicate")) });
        $sym30$GKE_PREDICATE_FILTERED_ = SubLObjectFactory.makeSymbol("GKE-PREDICATE-FILTERED?");
        $kw31$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1NotIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1NotGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Format")));
        $sym33$_GKE_PREDICATE_FILTERED__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GKE-PREDICATE-FILTERED?-CACHING-STATE*");
        $sym34$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym35$TREE_POSITION_P = SubLObjectFactory.makeSymbol("TREE-POSITION-P");
        $sym36$CYCL_FORMULA_ = SubLObjectFactory.makeSymbol("CYCL-FORMULA?");
        $sym37$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $str38$OPERATOR_TERMS_PASS_CONSTRAINTS_r = SubLObjectFactory.makeString("OPERATOR-TERMS-PASS-CONSTRAINTS requires an operator arg position. Got ~S");
        $str39$OPERATOR_TERMS_PASS_CONSTRAINTS_r = SubLObjectFactory.makeString("OPERATOR-TERMS-PASS-CONSTRAINTS requires an argument arg position. Got ~S");
        $sym40$GET_GKE_NAUT_ARG_POSITION = SubLObjectFactory.makeSymbol("GET-GKE-NAUT-ARG-POSITION");
        $sym41$GET_GKE_IS_KNOWN = SubLObjectFactory.makeSymbol("GET-GKE-IS-KNOWN");
        $kw42$HTML = SubLObjectFactory.makeKeyword("HTML");
        $const43$GenericIntelligenceAnalysis_CAE_A = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericIntelligenceAnalysis-CAE-Allotment"));
        $kw44$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $const45$GenericMedicalResearchTask_Allotm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericMedicalResearchTask-Allotment"));
        $kw46$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $kw47$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw48$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $kw49$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str50$Show_all_values_of_ = SubLObjectFactory.makeString("Show all values of ");
        $str51$_such_that__ = SubLObjectFactory.makeString(" such that~%");
        $str52$Is_it_true_that__ = SubLObjectFactory.makeString("Is it true that~%");
        $const53$TheCoordinationSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"));
        $sym54$PPH_ANCHOR_TAGS_FOR_TERM = SubLObjectFactory.makeSymbol("PPH-ANCHOR-TAGS-FOR-TERM");
        $const55$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOR"), (SubLObject)SubLObjectFactory.makeKeyword("NOT"));
        $kw57$NOR = SubLObjectFactory.makeKeyword("NOR");
        $kw58$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const59$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $kw60$AND = SubLObjectFactory.makeKeyword("AND");
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")));
        $list62 = ConsesLow.list((SubLObject)gke_main.ONE_INTEGER, (SubLObject)gke_main.ZERO_INTEGER);
        $const63$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $kw64$NOT = SubLObjectFactory.makeKeyword("NOT");
        $kw65$OR = SubLObjectFactory.makeKeyword("OR");
        $str66$All_of_the_following_are_true = SubLObjectFactory.makeString("All of the following are true");
        $str67$At_least_one_of_the_following_is_ = SubLObjectFactory.makeString("At least one of the following is true");
        $str68$None_of_the_following_is_true = SubLObjectFactory.makeString("None of the following is true");
        $sym69$GKE_ADD_CLONED_LITERAL = SubLObjectFactory.makeSymbol("GKE-ADD-CLONED-LITERAL");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("OR"));
        $str71$_S_must_be_one_of__S = SubLObjectFactory.makeString("~S must be one of ~S");
        $kw72$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $sym73$GKE_REMOVE_LITERAL = SubLObjectFactory.makeSymbol("GKE-REMOVE-LITERAL");
        $str74$GKEReformulationRuleHoldingMt = SubLObjectFactory.makeString("GKEReformulationRuleHoldingMt");
        $sym75$EL_SENTENCE_P = SubLObjectFactory.makeSymbol("EL-SENTENCE-P");
        $kw76$LOOSEN = SubLObjectFactory.makeKeyword("LOOSEN");
        $kw77$STRENGTHEN = SubLObjectFactory.makeKeyword("STRENGTHEN");
        $str78$useReformulationRuleForGuidedKnow = SubLObjectFactory.makeString("useReformulationRuleForGuidedKnowledgeEntry");
        $kw79$META_PREDICATES = SubLObjectFactory.makeKeyword("META-PREDICATES");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list81 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $sym82$POSSIBLE_SENTENCE_SUBSTITUTIONS = SubLObjectFactory.makeSymbol("POSSIBLE-SENTENCE-SUBSTITUTIONS");
        $const83$EnglishMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt"));
        $const84$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CASE-INSENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("REGULAR-EXPRESSIONS"), (SubLObject)SubLObjectFactory.makeKeyword("FALSE"));
        $sym86$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $const87$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym88$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym89$SUBSTITUTE_TERM_INTO_SENTENCE = SubLObjectFactory.makeSymbol("SUBSTITUTE-TERM-INTO-SENTENCE");
        $sym90$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym91$NART_EL_FORMULA = SubLObjectFactory.makeSymbol("NART-EL-FORMULA");
        $str92$_S_does_not_have_arg_position__S = SubLObjectFactory.makeString("~S does not have arg-position ~S");
        $sym93$EL_FORMULA_P = SubLObjectFactory.makeSymbol("EL-FORMULA-P");
        $const94$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list95 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")));
        $sym96$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym97$EL_VAR_NAME = SubLObjectFactory.makeSymbol("EL-VAR-NAME");
        $const98$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const99$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $kw100$EL_VARIABLE = SubLObjectFactory.makeKeyword("EL-VARIABLE");
        $const101$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $sym102$GKE_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("GKE-MEMOIZATION-STATE");
        $str103$GKE_Memoization_State = SubLObjectFactory.makeString("GKE Memoization State");
        $sym104$_GKE_MEMOIZATION_STATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GKE-MEMOIZATION-STATE-CACHING-STATE*");
        $sym105$CLEAR_GKE_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("CLEAR-GKE-MEMOIZATION-STATE");
        $sym106$GKE_GLOSS_FOR_LITERAL = SubLObjectFactory.makeSymbol("GKE-GLOSS-FOR-LITERAL");
        $sym107$ATOMIC_SENTENCE_ = SubLObjectFactory.makeSymbol("ATOMIC-SENTENCE?");
        $sym108$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $const109$gkeGlossWrtDomainMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gkeGlossWrtDomainMt"));
        $kw110$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym111$GENERATE_GKE_GLOSS_WRT_MT_CACHED = SubLObjectFactory.makeSymbol("GENERATE-GKE-GLOSS-WRT-MT-CACHED");
        $sym112$_GENERATE_GKE_GLOSS_WRT_MT_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GENERATE-GKE-GLOSS-WRT-MT-CACHED-CACHING-STATE*");
        $int113$256 = SubLObjectFactory.makeInteger(256);
        $sym114$CANDIDATE_REPLACEMENT_RENDERERS_FOR_SENTENCE = SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENT-RENDERERS-FOR-SENTENCE");
        $list115 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TERMS"));
        $kw116$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $sym117$CANDIDATE_REPLACEMENTS_FOR_VARIABLES = SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENTS-FOR-VARIABLES");
        $sym118$CANDIDATE_REPLACEMENTS_FOR_ARG = SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENTS-FOR-ARG");
        $sym119$CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED = SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED");
        $list120 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERENCE-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"), (SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"));
        $list121 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENTS"));
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?REP-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?REP-POS"), (SubLObject)SubLObjectFactory.makeSymbol("?CON-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("?CON-POS"));
        $const123$suggestionsForPredRelativeToIsaIn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suggestionsForPredRelativeToIsaInArg"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-POS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-COLL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT-POS"));
        $const125$suggestionsForPredRelativeToGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suggestionsForPredRelativeToGenlsInArg"));
        $sym126$_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED-CACHING-STATE*");
        $int127$2048 = SubLObjectFactory.makeInteger(2048);
        $sym128$CLEAR_CANDIDATE_REPLACEMENTS_FOR_SENTENCE_CACHED = SubLObjectFactory.makeSymbol("CLEAR-CANDIDATE-REPLACEMENTS-FOR-SENTENCE-CACHED");
        $sym129$INTERSECTION = SubLObjectFactory.makeSymbol("INTERSECTION");
        $sym130$UNION = SubLObjectFactory.makeSymbol("UNION");
        $sym131$GKE_GET_ELEMENTS = SubLObjectFactory.makeSymbol("GKE-GET-ELEMENTS");
        $sym132$HL_PROTOTYPICAL_INSTANCE_ = SubLObjectFactory.makeSymbol("HL-PROTOTYPICAL-INSTANCE?");
        $sym133$_X = SubLObjectFactory.makeSymbol("?X");
        $const134$elementOf = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("elementOf"));
        $sym135$_GKE_GET_ELEMENTS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GKE-GET-ELEMENTS-CACHING-STATE*");
        $sym136$CLEAR_GKE_GET_ELEMENTS = SubLObjectFactory.makeSymbol("CLEAR-GKE-GET-ELEMENTS");
        $sym137$NEW_REPLACEMENT_TREE = SubLObjectFactory.makeSymbol("NEW-REPLACEMENT-TREE");
        $list138 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("BIN-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $str139$__Conflating__S_to__S_____ = SubLObjectFactory.makeString("~&Conflating ~S to ~S...~%");
        $sym140$_OMIT_SUGGESTION_STUMPS__ = SubLObjectFactory.makeSymbol("*OMIT-SUGGESTION-STUMPS?*");
        $sym141$REPLACEMENT_TREE = SubLObjectFactory.makeSymbol("REPLACEMENT-TREE");
        $sym142$REPLACEMENT_TREE_P = SubLObjectFactory.makeSymbol("REPLACEMENT-TREE-P");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("CHILDREN"));
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOT"), (SubLObject)SubLObjectFactory.makeKeyword("CHILDREN"));
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("R-TREE-ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("R-TREE-CHILDREN"));
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-R-TREE-ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-R-TREE-CHILDREN"));
        $sym147$PRINT_REPLACEMENT_TREE = SubLObjectFactory.makeSymbol("PRINT-REPLACEMENT-TREE");
        $sym148$REPLACEMENT_TREE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REPLACEMENT-TREE-PRINT-FUNCTION-TRAMPOLINE");
        $list149 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REPLACEMENT-TREE-P"));
        $sym150$R_TREE_ROOT = SubLObjectFactory.makeSymbol("R-TREE-ROOT");
        $sym151$_CSETF_R_TREE_ROOT = SubLObjectFactory.makeSymbol("_CSETF-R-TREE-ROOT");
        $sym152$R_TREE_CHILDREN = SubLObjectFactory.makeSymbol("R-TREE-CHILDREN");
        $sym153$_CSETF_R_TREE_CHILDREN = SubLObjectFactory.makeSymbol("_CSETF-R-TREE-CHILDREN");
        $kw154$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $str155$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw156$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym157$MAKE_REPLACEMENT_TREE = SubLObjectFactory.makeSymbol("MAKE-REPLACEMENT-TREE");
        $kw158$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw159$END = SubLObjectFactory.makeKeyword("END");
        $sym160$VISIT_DEFSTRUCT_OBJECT_REPLACEMENT_TREE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REPLACEMENT-TREE-METHOD");
        $str161$_REPLACEMENT_TREE__S_ = SubLObjectFactory.makeString("<REPLACEMENT-TREE ~S>");
        $sym162$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $str163$Unable_to_place__D_renderers = SubLObjectFactory.makeString("Unable to place ~D renderers");
        $str164$Hit_max_depth_of__D__Pruning__D_r = SubLObjectFactory.makeString("Hit max depth of ~D. Pruning ~D remaining renderers.");
        $str165$__Placing__S_under_superiors___S_ = SubLObjectFactory.makeString("~&Placing ~S under superiors: ~S~%");
        $sym166$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str167$__Found__S_on_level__D___ = SubLObjectFactory.makeString("~&Found ~S on level ~D.~%");
        $str168$__Not_in_subtree__so_adding__S_un = SubLObjectFactory.makeString("~&Not in subtree, so adding ~S under ~S on level ~D.~%");
        $str169$___Tree_level__D_is_now__S___ = SubLObjectFactory.makeString("~& Tree level ~D is now ~S.~%");
        $str170$Found_it_ = SubLObjectFactory.makeString("Found it.");
        $str171$__Postponing__S_because__S_is_not = SubLObjectFactory.makeString("~&Postponing ~S because ~S is not yet in the tree.~%");
        $sym172$_COL = SubLObjectFactory.makeSymbol("?COL");
        $const173$suggestionGenlClassOrderedBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suggestionGenlClassOrderedBy"));
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $list175 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suggestionIsaClassOrderedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), (SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?COL"));
        $list177 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?PRED"), (SubLObject)SubLObjectFactory.makeSymbol("?N"));
        $kw178$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $kw179$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw180$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw181$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw182$HL = SubLObjectFactory.makeKeyword("HL");
        $list183 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conflateMembersOfSetWhenGeneratingHierarchicalOrderingsForSpecs")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), (SubLObject)SubLObjectFactory.makeSymbol("?SET"));
        $const184$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list185 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conflateMembersOfSetWhenGeneratingHierarchicalOrderingsForInstances")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), (SubLObject)SubLObjectFactory.makeSymbol("?SET"));
        $sym186$_SET = SubLObjectFactory.makeSymbol("?SET");
        $str187$__Filtered_renderers___S__ = SubLObjectFactory.makeString("~&Filtered renderers: ~S~%");
        $sym188$_USE_TVA_FOR_SUGGESTIONS__ = SubLObjectFactory.makeSymbol("*USE-TVA-FOR-SUGGESTIONS?*");
        $kw189$X = SubLObjectFactory.makeKeyword("X");
        $kw190$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOT"), (SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TVA-UNIFY"));
        $list192 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list193 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("?TRUTH"), (SubLObject)SubLObjectFactory.makeString("Yes")));
        $str194$_ = SubLObjectFactory.makeString(" ");
        $str195$_ = SubLObjectFactory.makeString("-");
        $sym196$POSSIBLY_MT_P = SubLObjectFactory.makeSymbol("POSSIBLY-MT-P");
        $sym197$QUERY_PROPERTIES_P = SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P");
        $kw198$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*"));
        $sym200$GKE_START_CONTINUABLE_QUERY = SubLObjectFactory.makeSymbol("GKE-START-CONTINUABLE-QUERY");
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $str202$Setup_a_query__and_immediately_re = SubLObjectFactory.makeString("Setup a query, and immediately return the query identifiers.  A separate java\n   thread will start up the query and check up on it for new results.");
        $list203 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-MT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES-P")));
        $sym204$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $kw205$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw206$DAEMON = SubLObjectFactory.makeKeyword("DAEMON");
        $str207$Error_with_query___A__ = SubLObjectFactory.makeString("Error with query: ~A~%");
        $sym208$GKE_CONTINUE_QUERY = SubLObjectFactory.makeSymbol("GKE-CONTINUE-QUERY");
        $list209 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIAL-STATE"));
        $str210$Continue_an_existing_query__ident = SubLObjectFactory.makeString("Continue an existing query (identified by PROBLEM-STORE-ID and INFERENCE-ID), \n   using PROPERTIES and immediately return the query identifiers.  A separate thread\n   will be started to keep track of the results and provide them to any other tools \n   (e.g. the Query Library) that need them.");
        $list211 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $str212$gke_query_thread__A__A = SubLObjectFactory.makeString("gke query thread ~A ~A");
        $sym213$GKE_RUN_INFERENCE = SubLObjectFactory.makeSymbol("GKE-RUN-INFERENCE");
        $str214$results_daemon__A__A = SubLObjectFactory.makeString("results daemon ~A ~A");
        $sym215$RESULTS_DAEMON = SubLObjectFactory.makeSymbol("RESULTS-DAEMON");
        $kw216$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym217$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw218$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $kw219$SOURCE_ICONS = SubLObjectFactory.makeKeyword("SOURCE-ICONS");
        $list220 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RUNNING"), (SubLObject)SubLObjectFactory.makeKeyword("NEW"), (SubLObject)SubLObjectFactory.makeKeyword("PREPARED"), (SubLObject)SubLObjectFactory.makeKeyword("READY"));
        $kw221$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw222$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $sym223$SPECIAL_VARIABLE_STATE_P = SubLObjectFactory.makeSymbol("SPECIAL-VARIABLE-STATE-P");
        $sym224$GKE_GET_ONE_INFERENCE_RESULT = SubLObjectFactory.makeSymbol("GKE-GET-ONE-INFERENCE-RESULT");
        $list225 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"));
        $str226$Get_one_inference_result = SubLObjectFactory.makeString("Get one inference result");
        $list227 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $sym228$ID_OF_VALID_PROBLEM_STORE_P = SubLObjectFactory.makeSymbol("ID-OF-VALID-PROBLEM-STORE-P");
        $kw229$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $sym230$GKE_GET_INFERENCE_RESULTS = SubLObjectFactory.makeSymbol("GKE-GET-INFERENCE-RESULTS");
        $str231$get_all_the_inference_results_so_ = SubLObjectFactory.makeString("get all the inference results so far.\n@return LISTP of LISTP of triples of the form\n  - string-paraphrase of EL variable\n  - javalist-paraphrase of the variable's value\n  - CycL term to which the variable is bound\none list of triples for each set of bindings for the specified inference.");
        $list232 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("ID-OF-VALID-PROBLEM-STORE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUSPENDED"), (SubLObject)SubLObjectFactory.makeKeyword("DEAD"), (SubLObject)SubLObjectFactory.makeKeyword("TAUTOLOGY"), (SubLObject)SubLObjectFactory.makeKeyword("CONTRADICTION"));
        $sym234$GKE_INFERENCE_COMPLETE_ = SubLObjectFactory.makeSymbol("GKE-INFERENCE-COMPLETE?");
        $str235$ret_t_iff_inference_is_suspended_ = SubLObjectFactory.makeString("ret t iff inference is suspended || dead || tautology || contradiction\n&& queue is empty && daemon is :completed");
        $sym236$GKE_GET_INFERENCE_STATUS = SubLObjectFactory.makeSymbol("GKE-GET-INFERENCE-STATUS");
        $str237$get_the_status_of_the_inference = SubLObjectFactory.makeString("get the status of the inference");
        $sym238$GKE_GET_INFERENCE_SUSPEND_STATUS = SubLObjectFactory.makeSymbol("GKE-GET-INFERENCE-SUSPEND-STATUS");
        $str239$get_the_suspend_status_of_the_inf = SubLObjectFactory.makeString("get the suspend-status of the inference");
        $sym240$NULL_OR_INTEGERP = SubLObjectFactory.makeSymbol("NULL-OR-INTEGERP");
        $sym241$GKE_STOP_CONTINUABLE_QUERY = SubLObjectFactory.makeSymbol("GKE-STOP-CONTINUABLE-QUERY");
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PATIENCE"));
        $str243$Find_and_stop_the_inference_ = SubLObjectFactory.makeString("Find and stop the inference.");
        $list244 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-ID"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATIENCE"), (SubLObject)SubLObjectFactory.makeSymbol("NULL-OR-INTEGERP")));
        $sym245$GKE_RELEASE_INFERENCE_RESOURCES = SubLObjectFactory.makeSymbol("GKE-RELEASE-INFERENCE-RESOURCES");
        $str246$Destroy_problem_store_and_inferen = SubLObjectFactory.makeString("Destroy problem store and inference");
        $sym247$GKE_TEST_QUERIES = SubLObjectFactory.makeSymbol("GKE-TEST-QUERIES");
        $sym248$_SENT = SubLObjectFactory.makeSymbol("?SENT");
        $sym249$_QUERY = SubLObjectFactory.makeSymbol("?QUERY");
        $list250 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentenceParameterValueInSpecification")), (SubLObject)SubLObjectFactory.makeSymbol("?SENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestQueryFn")), (SubLObject)SubLObjectFactory.makeSymbol("?QUERY"))));
        $const251$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $str252$GKE_Query_Sentence_Literal_Manipu = SubLObjectFactory.makeString("GKE Query Sentence Literal Manipulation");
        $str253$GKE_Main_Test_Suite = SubLObjectFactory.makeString("GKE Main Test Suite");
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("GKE Query Sentence Literal Manipulation"));
        $sym255$TEST_CANDIDATE_REPLACEMENTS = SubLObjectFactory.makeSymbol("TEST-CANDIDATE-REPLACEMENTS");
        $kw256$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym257$CANDIDATE_REPLACEMENTS_EQUAL_ = SubLObjectFactory.makeSymbol("CANDIDATE-REPLACEMENTS-EQUAL?");
        $kw258$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw259$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list260 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GKE-TEST-CASE-TABLES"));
        $kw261$KB = SubLObjectFactory.makeKeyword("KB");
        $kw262$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw263$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list264 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dataForValveOfEventRecordsStenosisSeverity")), (SubLObject)SubLObjectFactory.makeSymbol("?CARDIAC-VALVE-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICALLY-RELATED-EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-CAE-QueryMt"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)gke_main.THREE_INTEGER), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_unknown")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_critical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_trivial")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_present")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("None-CardiacValveStenosis")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MildPhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MildToModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Moderate-SevereToSevereCardiacValveStenosis")) }))));
        $sym265$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym266$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym267$SORT_RESULT = SubLObjectFactory.makeSymbol("SORT-RESULT");
        $sym268$REMOVE_JAVALIST_DETAIL = SubLObjectFactory.makeSymbol("REMOVE-JAVALIST-DETAIL");
        $list269 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("GROVES"));
        $sym270$SORT_GROVE = SubLObjectFactory.makeSymbol("SORT-GROVE");
        $sym271$TERM___WITH_CONSTANT_BY_NAME = SubLObjectFactory.makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");
        $sym272$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym273$SORT_TREE = SubLObjectFactory.makeSymbol("SORT-TREE");
        $list274 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ROOT"), (SubLObject)SubLObjectFactory.makeSymbol("SUBTREES"));
        $list275 = ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("ARG-POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("FLAT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("GROVES"));
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JAVALIST"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $sym277$TEST_CANDIDATE_REPLACEMENT_RENDERERS_FOR_VARS = SubLObjectFactory.makeSymbol("TEST-CANDIDATE-REPLACEMENT-RENDERERS-FOR-VARS");
        $list278 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("medicalTestRelevantToPhysiologicalConditionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiastolicBloodPressureTest")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RenalDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("medicalTestRelevantToPhysiologicalConditionType")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RenalDisease"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DocumentReaderFollowupsForTaskMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GenericMedicalResearchTask-Allotment")))), (SubLObject)gke_main.T));
        $sym279$TEST_CANDIDATE_REPLACEMENT_RENDERERS_STUMPS = SubLObjectFactory.makeSymbol("TEST-CANDIDATE-REPLACEMENT-RENDERERS-STUMPS");
        $list280 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dataForValveOfEventRecordsStenosisSeverity")), (SubLObject)SubLObjectFactory.makeSymbol("?CARDIAC-VALVE-DATA"), (SubLObject)SubLObjectFactory.makeSymbol("?MEDICALLY-RELATED-EVENT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalResearchCAEGuidanceMt"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gke_main.THREE_INTEGER), (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_critical"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_present"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_trivial"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis_unknown"))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Moderate-SevereToSevereCardiacValveStenosis")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))))), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("None-CardiacValveStenosis"))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MildPhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MildToModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))) }))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gke_main.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Moderate-SevereToSevereCardiacValveStenosis")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis"))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToModerate-SevereToSevereCardiacValveStenosis")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModeratePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ModerateToSeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SeverePhysiologicalConditionOfTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CardiacValveStenosis")))))))))));
        $sym281$TEST_CANDIDATE_REPLACEMENT_RENDERERS = SubLObjectFactory.makeSymbol("TEST-CANDIDATE-REPLACEMENT-RENDERERS");
        $list282 = _constant_282_initializer();
        $sym283$NARTIFY_AND_SUBSTITUTE_TERM_INTO_SENTENCE = SubLObjectFactory.makeSymbol("NARTIFY-AND-SUBSTITUTE-TERM-INTO-SENTENCE");
        $list284 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Italy")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?ACT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GovernmentFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("France")))), (SubLObject)ConsesLow.list((SubLObject)gke_main.TWO_INTEGER, (SubLObject)gke_main.ONE_INTEGER), (SubLObject)gke_main.NIL, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt")), (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL, (SubLObject)gke_main.NIL), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?ACT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GovernmentFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Italy"))))));
        $list285 = _constant_285_initializer();
    }
    
    public static final class $replacement_tree_native extends SubLStructNative
    {
        public SubLObject $root;
        public SubLObject $children;
        private static final SubLStructDeclNative structDecl;
        
        public $replacement_tree_native() {
            this.$root = (SubLObject)CommonSymbols.NIL;
            this.$children = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$replacement_tree_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$root;
        }
        
        public SubLObject getField3() {
            return this.$children;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$root = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$children = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$replacement_tree_native.class, gke_main.$sym141$REPLACEMENT_TREE, gke_main.$sym142$REPLACEMENT_TREE_P, gke_main.$list143, gke_main.$list144, new String[] { "$root", "$children" }, gke_main.$list145, gke_main.$list146, gke_main.$sym147$PRINT_REPLACEMENT_TREE);
        }
    }
    
    public static final class $replacement_tree_p$UnaryFunction extends UnaryFunction
    {
        public $replacement_tree_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REPLACEMENT-TREE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return gke_main.replacement_tree_p(arg1);
        }
    }
}

/*

	Total time: 6984 ms
	
*/