package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_search_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_vars";
    public static final String myFingerPrint = "3e3d0bd796b68857a668baedc2788bfeda196d4045fc64973ce1a17ab28f8a74";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5372L)
    public static SubLSymbol $sbhl_search_types$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5528L)
    public static SubLSymbol $sbhl_search_type$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 7274L)
    public static SubLSymbol $sbhl_justification_search_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8267L)
    public static SubLSymbol $sbhl_search_behavior$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8653L)
    public static SubLSymbol $sbhl_justification_behavior$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 10154L)
    public static SubLSymbol $sbhl_justification_defaulted_old$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 10926L)
    public static SubLSymbol $sbhl_justification_assembled_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11655L)
    public static SubLSymbol $sbhl_unmarking_search_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12253L)
    public static SubLSymbol $sbhl_search_module$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12619L)
    public static SubLSymbol $sbhl_search_module_type$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12870L)
    public static SubLSymbol $sbhl_add_node_to_result_test$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13258L)
    public static SubLSymbol $sbhl_add_unmarked_node_to_result_test$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 14920L)
    public static SubLSymbol $genl_inverse_mode_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18054L)
    public static SubLSymbol $sbhl_forward_search_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18529L)
    public static SubLSymbol $sbhl_backward_search_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18991L)
    public static SubLSymbol $sbhl_search_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20194L)
    public static SubLSymbol $sbhl_index_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20273L)
    public static SubLSymbol $sbhl_search_index_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21017L)
    public static SubLSymbol $sbhl_map_function$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21444L)
    public static SubLSymbol $sbhl_unwind_function$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21894L)
    public static SubLSymbol $sbhl_apply_unwind_function_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22900L)
    public static SubLSymbol $sbhl_search_parent_marking$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23803L)
    public static SubLSymbol $sbhl_nodes_previous_marking$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24251L)
    public static SubLSymbol $sbhl_finishedP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24945L)
    public static SubLSymbol $sbhl_stop_search_pathP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25708L)
    public static SubLSymbol $sbhl_target_node$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26147L)
    public static SubLSymbol $sbhl_goal_node$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26706L)
    public static SubLSymbol $sbhl_goal_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27289L)
    public static SubLSymbol $sbhl_isaP_goal$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27718L)
    public static SubLSymbol $sbhl_result$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28081L)
    public static SubLSymbol $sbhl_justification_result$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28511L)
    public static SubLSymbol $sbhl_consider_node_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28963L)
    public static SubLSymbol $sbhl_compose_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29367L)
    public static SubLSymbol $sbhl_combine_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29773L)
    public static SubLSymbol $sbhl_map_test_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30177L)
    public static SubLSymbol $sbhl_accessed_gather_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30506L)
    public static SubLSymbol $sbhl_dependents_cut_node$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30995L)
    public static SubLSymbol $sbhl_access_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31324L)
    public static SubLSymbol $sbhl_referent$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31648L)
    public static SubLSymbol $sbhl_current_leaf_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31992L)
    public static SubLSymbol $sbhl_sample_leaf_queues$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 33383L)
    public static SubLSymbol $sbhl_extremal_test_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 33867L)
    public static SubLSymbol $sbhl_check_for_goal_marking_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34451L)
    public static SubLSymbol $sbhl_precomputed_goal_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34804L)
    public static SubLSymbol $infer_nat_sbhlP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34984L)
    public static SubLSymbol $sbhl_mapping_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35059L)
    public static SubLSymbol $maximize_sbhl_resultP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35121L)
    public static SubLSymbol $minimize_sbhl_resultP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35181L)
    public static SubLSymbol $sbhl_search_truth$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36187L)
    private static SubLSymbol $sbhl_search_truth_values$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36624L)
    private static SubLSymbol $sbhl_true_tv$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36731L)
    private static SubLSymbol $sbhl_false_tv$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37106L)
    public static SubLSymbol $sbhl_tv$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37345L)
    public static SubLSymbol $relevant_sbhl_tv_function$;
    private static final SubLSymbol $sym0$POSSIBLY_WITH_NEW_SBHL_SPACES;
    private static final SubLSymbol $sym1$WITH_NEW_SBHL_FINISHED;
    private static final SubLSymbol $sym2$WITH_NEW_SBHL_STOP_SEARCH_PATH;
    private static final SubLSymbol $sym3$RESET_SBHL_SEARCH_PARENT_MARKING;
    private static final SubLSymbol $sym4$WITH_NEW_SBHL_PREVIOUS_MARKING;
    private static final SubLSymbol $sym5$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE;
    private static final SubLSymbol $sym6$WITH_SBHL_READER_LOCK;
    private static final SubLSymbol $sym7$WITH_SBHL_TRUE_SEARCH;
    private static final SubLSymbol $sym8$WITH_SBHL_FORWARD_SEARCH_DIRECTION;
    private static final SubLSymbol $sym9$WITH_SBHL_FORWARD_LINK_DIRECTION;
    private static final SubLSymbol $sym10$WITH_SBHL_BACKWARD_SEARCH_DIRECTION;
    private static final SubLSymbol $sym11$WITH_SBHL_BACKWARD_LINK_DIRECTION;
    private static final SubLSymbol $sym12$WITH_SBHL_FALSE_SEARCH;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE;
    private static final SubLSymbol $sym15$POSSIBLY_WITH_SBHL_TRUE_TV;
    private static final SubLSymbol $sym16$WITH_SBHL_FORWARD_TRUE_CONDITIONS;
    private static final SubLSymbol $sym17$INITIALIZE_SBHL_SEARCH;
    private static final SubLSymbol $sym18$WITH_SBHL_BACKWARD_TRUE_CONDITIONS;
    private static final SubLSymbol $sym19$POSSIBLY_WITH_SBHL_FALSE_TV;
    private static final SubLSymbol $sym20$WITH_SBHL_FORWARD_FALSE_CONDITIONS;
    private static final SubLSymbol $sym21$WITH_SBHL_BACKWARD_FALSE_CONDITIONS;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$CLET;
    private static final SubLSymbol $sym25$_SBHL_SEARCH_TYPE_;
    private static final SubLSymbol $sym26$WITH_SBHL_SEARCH_TYPE;
    private static final SubLSymbol $kw27$CLOSURE;
    private static final SubLSymbol $kw28$BOOLEAN;
    private static final SubLSymbol $kw29$WHAT_MTS;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$_SBHL_SEARCH_BEHAVIOR_;
    private static final SubLSymbol $kw34$OLD;
    private static final SubLSymbol $sym35$_SBHL_JUSTIFICATION_BEHAVIOR_;
    private static final SubLSymbol $sym36$PIF;
    private static final SubLSymbol $sym37$BEHAVIOR;
    private static final SubLSymbol $sym38$PROGN;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLString $str46$get_sbhl_search_module___sbhl_sea;
    private static final SubLObject $const47$genlInverse;
    private static final SubLObject $const48$genlPreds;
    private static final SubLObject $const49$negationInverse;
    private static final SubLObject $const50$negationPreds;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$_SBHL_SEARCH_MODULE_;
    private static final SubLSymbol $sym53$_SBHL_SEARCH_MODULE_TYPE_;
    private static final SubLSymbol $sym54$GET_SBHL_MODULE_TYPE;
    private static final SubLSymbol $sym55$_SBHL_ADD_NODE_TO_RESULT_TEST_;
    private static final SubLSymbol $sym56$GET_SBHL_ADD_NODE_TO_RESULT_TEST;
    private static final SubLSymbol $sym57$WITH_SBHL_MODULE;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$_GENL_INVERSE_MODE_P_;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$PRED;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$CDOLIST;
    private static final SubLSymbol $sym70$_SBHL_ADD_UNMARKED_NODE_TO_RESULT_TEST_;
    private static final SubLSymbol $sym71$GET_SBHL_MODULE;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$FORWARD;
    private static final SubLSymbol $kw74$BACKWARD;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$_SBHL_SEARCH_DIRECTION_;
    private static final SubLSymbol $sym77$WITH_SBHL_SEARCH_DIRECTION;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$_SBHL_MAP_FUNCTION_;
    private static final SubLSymbol $sym83$_SBHL_UNWIND_FUNCTION_;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $kw90$GOAL;
    private static final SubLSymbol $kw91$CUTOFF;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$_SBHL_TARGET_NODE_;
    private static final SubLSymbol $sym95$_SBHL_GOAL_NODE_;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$_SBHL_ISA__GOAL_;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$CUNWIND_PROTECT;
    private static final SubLSymbol $sym101$CSETQ;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$_SBHL_CONSIDER_NODE_FN_;
    private static final SubLSymbol $sym105$_SBHL_COMPOSE_FN_;
    private static final SubLSymbol $sym106$NCONC;
    private static final SubLSymbol $sym107$_SBHL_COMBINE_FN_;
    private static final SubLSymbol $sym108$_SBHL_MAP_TEST_FN_;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$_SBHL_DEPENDENTS_CUT_NODE_;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$_SBHL_ACCESS_ARG_;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$_SBHL_REFERENT_;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$QUEUE;
    private static final SubLSymbol $sym117$ENQUEUE;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$_SBHL_SAMPLE_LEAF_QUEUES_;
    private static final SubLSymbol $sym120$LIST;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$QUEUE;
    private static final SubLSymbol $sym123$WHILE;
    private static final SubLSymbol $sym124$CAND;
    private static final SubLSymbol $sym125$CNOT;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$FIRST;
    private static final SubLSymbol $sym128$QUEUE_ELEMENTS;
    private static final SubLSymbol $sym129$WITH_NEW_SBHL_LEAF_QUEUE;
    private static final SubLSymbol $sym130$RPLACD;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$DEQUEUE;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$_SBHL_EXTREMAL_TEST_FN_;
    private static final SubLList $list137;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$_SBHL_PRECOMPUTED_GOAL_SPACE_;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLObject $const143$True_JustificationTruth;
    private static final SubLObject $const144$False_JustificationTruth;
    private static final SubLObject $const145$MonotonicallyTrue;
    private static final SubLObject $const146$DefaultTrue;
    private static final SubLObject $const147$ArbitraryTruth_JustifactionTruth;
    private static final SubLObject $const148$ArbitraryTruth_JustificationTruth;
    private static final SubLObject $const149$MonotonicallyFalse;
    private static final SubLObject $const150$DefaultFalse;
    private static final SubLObject $const151$JustifactionTruth;
    private static final SubLObject $const152$Unknown_JustificationTruth;
    private static final SubLSymbol $kw153$ERROR;
    private static final SubLString $str154$_A_is_not_a__A;
    private static final SubLSymbol $sym155$SBHL_SEARCH_TRUTH_VALUE_P;
    private static final SubLSymbol $kw156$CERROR;
    private static final SubLString $str157$continue_anyway;
    private static final SubLSymbol $kw158$WARN;
    private static final SubLString $str159$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str160$Expected_true_or_false_sbhl_truth;
    private static final SubLSymbol $kw161$TRUE;
    private static final SubLSymbol $kw162$FALSE;
    private static final SubLString $str163$unknown_truth_value_for_translati;
    private static final SubLSymbol $kw164$TRUE_MON;
    private static final SubLSymbol $kw165$TRUE_DEF;
    private static final SubLSymbol $kw166$FALSE_MON;
    private static final SubLSymbol $kw167$FALSE_DEF;
    private static final SubLString $str168$Cannot_translate__s_truth_to_an_s;
    private static final SubLSymbol $sym169$_RELEVANT_SBHL_TV_FUNCTION_;
    private static final SubLList $list170;
    private static final SubLSymbol $sym171$_SBHL_TV_;
    private static final SubLSymbol $sym172$WITH_SBHL_TV_FUNCTION;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLSymbol $sym175$WITH_SBHL_TV;
    private static final SubLList $list176;
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$TV_VAR;
    private static final SubLSymbol $sym179$FIF;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLSymbol $sym182$PWHEN;
    private static final SubLSymbol $sym183$SBHL_CHECK_TYPE;
    private static final SubLList $list184;
    private static final SubLSymbol $sym185$TV_VAR;
    private static final SubLList $list186;
    private static final SubLList $list187;
    private static final SubLSymbol $sym188$TV_VAR;
    private static final SubLList $list189;
    private static final SubLList $list190;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 957L)
    public static SubLObject initialize_sbhl_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym0$POSSIBLY_WITH_NEW_SBHL_SPACES, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym1$WITH_NEW_SBHL_FINISHED, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym2$WITH_NEW_SBHL_STOP_SEARCH_PATH, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym3$RESET_SBHL_SEARCH_PARENT_MARKING, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym4$WITH_NEW_SBHL_PREVIOUS_MARKING, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym5$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, reader.bq_cons((SubLObject)sbhl_search_vars.$sym6$WITH_SBHL_READER_LOCK, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 1584L)
    public static SubLObject initialize_sbhl_search_wXo_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym1$WITH_NEW_SBHL_FINISHED, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym2$WITH_NEW_SBHL_STOP_SEARCH_PATH, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym3$RESET_SBHL_SEARCH_PARENT_MARKING, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym4$WITH_NEW_SBHL_PREVIOUS_MARKING, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym5$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, reader.bq_cons((SubLObject)sbhl_search_vars.$sym6$WITH_SBHL_READER_LOCK, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 1883L)
    public static SubLObject with_sbhl_forward_true_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym7$WITH_SBHL_TRUE_SEARCH, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym8$WITH_SBHL_FORWARD_SEARCH_DIRECTION, reader.bq_cons((SubLObject)sbhl_search_vars.$sym9$WITH_SBHL_FORWARD_LINK_DIRECTION, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 2165L)
    public static SubLObject with_sbhl_backward_true_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym7$WITH_SBHL_TRUE_SEARCH, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym10$WITH_SBHL_BACKWARD_SEARCH_DIRECTION, reader.bq_cons((SubLObject)sbhl_search_vars.$sym11$WITH_SBHL_BACKWARD_LINK_DIRECTION, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 2447L)
    public static SubLObject with_sbhl_forward_false_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym12$WITH_SBHL_FALSE_SEARCH, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym8$WITH_SBHL_FORWARD_SEARCH_DIRECTION, reader.bq_cons((SubLObject)sbhl_search_vars.$sym9$WITH_SBHL_FORWARD_LINK_DIRECTION, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 2728L)
    public static SubLObject with_sbhl_backward_false_conditions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym12$WITH_SBHL_FALSE_SEARCH, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym10$WITH_SBHL_BACKWARD_SEARCH_DIRECTION, reader.bq_cons((SubLObject)sbhl_search_vars.$sym11$WITH_SBHL_BACKWARD_LINK_DIRECTION, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 3012L)
    public static SubLObject with_sbhl_forward_true_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)sbhl_search_vars.NIL;
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym15$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym16$WITH_SBHL_FORWARD_TRUE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 3359L)
    public static SubLObject with_sbhl_backward_true_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)sbhl_search_vars.NIL;
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym15$POSSIBLY_WITH_SBHL_TRUE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym18$WITH_SBHL_BACKWARD_TRUE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 3712L)
    public static SubLObject with_sbhl_forward_false_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)sbhl_search_vars.NIL;
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym19$POSSIBLY_WITH_SBHL_FALSE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym20$WITH_SBHL_FORWARD_FALSE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 4064L)
    public static SubLObject with_sbhl_backward_false_search(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)sbhl_search_vars.NIL;
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list13);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE, mt, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym19$POSSIBLY_WITH_SBHL_FALSE_TV, tv, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym21$WITH_SBHL_BACKWARD_FALSE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 4416L)
    public static SubLObject with_sbhl_forward_true_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym16$WITH_SBHL_FORWARD_TRUE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 4653L)
    public static SubLObject with_sbhl_backward_true_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym18$WITH_SBHL_BACKWARD_TRUE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 4892L)
    public static SubLObject with_sbhl_forward_false_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym20$WITH_SBHL_FORWARD_FALSE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5131L)
    public static SubLObject with_sbhl_backward_false_subsearch(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym21$WITH_SBHL_BACKWARD_FALSE_CONDITIONS, reader.bq_cons((SubLObject)sbhl_search_vars.$sym17$INITIALIZE_SBHL_SEARCH, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5667L)
    public static SubLObject sbhl_search_type_p(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(type, sbhl_search_vars.$sbhl_search_types$.getDynamicValue(thread), (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5836L)
    public static SubLObject get_sbhl_search_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_search_type$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5945L)
    public static SubLObject with_sbhl_search_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list23);
        type = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym25$_SBHL_SEARCH_TYPE_, type)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6097L)
    public static SubLObject with_sbhl_closure_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym26$WITH_SBHL_SEARCH_TYPE, (SubLObject)sbhl_search_vars.$kw27$CLOSURE, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6247L)
    public static SubLObject with_sbhl_boolean_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym26$WITH_SBHL_SEARCH_TYPE, (SubLObject)sbhl_search_vars.$kw28$BOOLEAN, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6397L)
    public static SubLObject with_sbhl_what_mts_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym26$WITH_SBHL_SEARCH_TYPE, (SubLObject)sbhl_search_vars.$kw29$WHAT_MTS, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6550L)
    public static SubLObject sbhl_closure_search_p() {
        return Equality.eq(get_sbhl_search_type(), (SubLObject)sbhl_search_vars.$kw27$CLOSURE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6719L)
    public static SubLObject sbhl_boolean_search_p() {
        return Equality.eq(get_sbhl_search_type(), (SubLObject)sbhl_search_vars.$kw28$BOOLEAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6886L)
    public static SubLObject sbhl_what_mts_search_p() {
        return Equality.eq(get_sbhl_search_type(), (SubLObject)sbhl_search_vars.$kw29$WHAT_MTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 7056L)
    public static SubLObject sbhl_goal_search_p() {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_search_vars.NIL != sbhl_boolean_search_p() || sbhl_search_vars.NIL != sbhl_justification_search_p());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 7419L)
    public static SubLObject sbhl_justification_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_justification_search_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 7599L)
    public static SubLObject with_sbhl_justification_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list30, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8034L)
    public static SubLObject without_sbhl_justification_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list31, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8378L)
    public static SubLObject get_sbhl_search_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8521L)
    public static SubLObject with_sbhl_search_behavior(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject behavior = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list32);
        behavior = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym33$_SBHL_SEARCH_BEHAVIOR_, behavior)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8851L)
    public static SubLObject get_sbhl_just_behavior() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_justification_behavior$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8992L)
    public static SubLObject with_sbhl_justification_behavior(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject behavior = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list32);
        behavior = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym35$_SBHL_JUSTIFICATION_BEHAVIOR_, behavior)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 9178L)
    public static SubLObject possibly_with_sbhl_justification_behavior(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject behavior = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list32);
        behavior = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (sbhl_search_vars.NIL != behavior) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym36$PIF, (SubLObject)sbhl_search_vars.$sym37$BEHAVIOR, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym35$_SBHL_JUSTIFICATION_BEHAVIOR_, behavior)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)), reader.bq_cons((SubLObject)sbhl_search_vars.$sym38$PROGN, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
        }
        return reader.bq_cons((SubLObject)sbhl_search_vars.$sym38$PROGN, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 9489L)
    public static SubLObject with_sbhl_assertion_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list39, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 9695L)
    public static SubLObject with_sbhl_verbose_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list40, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 9931L)
    public static SubLObject with_sbhl_old_justifications(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list41, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 10357L)
    public static SubLObject with_sbhl_justification_default(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list42, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 10575L)
    public static SubLObject sbhl_justification_behavior_defaults_old() {
        sbhl_search_vars.$sbhl_justification_defaulted_old$.setDynamicValue((SubLObject)sbhl_search_vars.T);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 10758L)
    public static SubLObject sbhl_justification_defaulted_old_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_justification_defaulted_old$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11078L)
    public static SubLObject sbhl_justification_assembled() {
        sbhl_search_vars.$sbhl_justification_assembled_p$.setDynamicValue((SubLObject)sbhl_search_vars.T);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11292L)
    public static SubLObject with_sbhl_justification_unassembled(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list43, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11490L)
    public static SubLObject sbhl_justification_assembled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_justification_assembled_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11777L)
    public static SubLObject sbhl_unmarking_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_unmarking_search_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11922L)
    public static SubLObject with_sbhl_unmarking_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list44, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12084L)
    public static SubLObject without_sbhl_unmarking_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list45, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12364L)
    public static SubLObject get_sbhl_search_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_search_vars.NIL == sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)sbhl_search_vars.$str46$get_sbhl_search_module___sbhl_sea);
        }
        return sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12723L)
    public static SubLObject get_sbhl_search_module_type() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_search_module_type$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13002L)
    public static SubLObject get_sbhl_search_add_node_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_add_node_to_result_test$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13408L)
    public static SubLObject get_sbhl_search_add_unmarked_node_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13674L)
    public static SubLObject get_sbhl_search_gather_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread)).eql(sbhl_search_vars.$const47$genlInverse)) {
            return sbhl_module_vars.get_sbhl_module(sbhl_search_vars.$const48$genlPreds);
        }
        return sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13953L)
    public static SubLObject get_sbhl_disjoins_search_gather_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread)).eql(sbhl_search_vars.$const49$negationInverse)) {
            return sbhl_module_vars.get_sbhl_module(sbhl_search_vars.$const50$negationPreds);
        }
        return sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 14255L)
    public static SubLObject with_sbhl_search_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list51);
        module = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym52$_SBHL_SEARCH_MODULE_, module), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym53$_SBHL_SEARCH_MODULE_TYPE_, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym54$GET_SBHL_MODULE_TYPE, module)), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym55$_SBHL_ADD_NODE_TO_RESULT_TEST_, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym56$GET_SBHL_ADD_NODE_TO_RESULT_TEST, module))), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym5$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym57$WITH_SBHL_MODULE, module, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15081L)
    public static SubLObject genl_inverse_mode_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15218L)
    public static SubLObject not_genl_inverse_mode_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_search_vars.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15378L)
    public static SubLObject with_new_sbhl_predicate_mode_scope(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list58, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15583L)
    public static SubLObject with_sbhl_predicate_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list59);
        mode = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym60$_GENL_INVERSE_MODE_P_, mode)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15775L)
    public static SubLObject with_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list61, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15936L)
    public static SubLObject sbhl_update_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list62, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 16256L)
    public static SubLObject possibly_flip_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list63, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 16607L)
    public static SubLObject possibly_premark_with_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list64, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 16927L)
    public static SubLObject flip_genl_inverse_mode(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list65, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 17066L)
    public static SubLObject sbhl_module_flips_inverse_mode_p(SubLObject sbhl_module) {
        if (sbhl_module == sbhl_search_vars.UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_vars.UNPROVIDED);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.get_sbhl_link_pred(sbhl_module).eql(sbhl_search_vars.$const47$genlInverse) || sbhl_module_utilities.get_sbhl_link_pred(sbhl_module).eql(sbhl_search_vars.$const49$negationInverse));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 17292L)
    public static SubLObject flip_genl_inverse_modeP(SubLObject sbhl_module, SubLObject sbhl_search_module) {
        if (sbhl_module == sbhl_search_vars.UNPROVIDED) {
            sbhl_module = sbhl_module_vars.get_sbhl_module((SubLObject)sbhl_search_vars.UNPROVIDED);
        }
        if (sbhl_search_module == sbhl_search_vars.UNPROVIDED) {
            sbhl_search_module = get_sbhl_search_module();
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_search_vars.NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_module) && sbhl_search_vars.NIL != sbhl_module_flips_inverse_mode_p(sbhl_module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 17556L)
    public static SubLObject with_initialized_unmarking_sbhl_marking_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject start_marking = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list66);
        start_marking = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject pred = (SubLObject)sbhl_search_vars.$sym67$PRED;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym36$PIF, (SubLObject)sbhl_search_vars.$list68, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym69$CDOLIST, (SubLObject)ConsesLow.list(pred, start_marking), (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym70$_SBHL_ADD_UNMARKED_NODE_TO_RESULT_TEST_, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym56$GET_SBHL_ADD_NODE_TO_RESULT_TEST, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym71$GET_SBHL_MODULE, pred))), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym60$_GENL_INVERSE_MODE_P_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.EQL, pred, (SubLObject)sbhl_search_vars.$list72))), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL))), reader.bq_cons((SubLObject)sbhl_search_vars.$sym38$PROGN, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18181L)
    public static SubLObject sbhl_forward_search_direction_p(final SubLObject direction) {
        return Equality.eq(direction, sbhl_search_vars.$sbhl_forward_search_direction$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18381L)
    public static SubLObject get_sbhl_forward_search_direction() {
        return sbhl_search_vars.$sbhl_forward_search_direction$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18637L)
    public static SubLObject sbhl_backward_search_direction_p(final SubLObject direction) {
        return Equality.eq(direction, sbhl_search_vars.$sbhl_backward_search_direction$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18840L)
    public static SubLObject get_sbhl_backward_search_direction() {
        return sbhl_search_vars.$sbhl_backward_search_direction$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19079L)
    public static SubLObject get_sbhl_search_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_search_direction$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19229L)
    public static SubLObject with_sbhl_search_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject direction = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list75);
        direction = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym76$_SBHL_SEARCH_DIRECTION_, direction)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19406L)
    public static SubLObject with_sbhl_forward_search_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym77$WITH_SBHL_SEARCH_DIRECTION, (SubLObject)sbhl_search_vars.$list78, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19606L)
    public static SubLObject with_sbhl_backward_search_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym77$WITH_SBHL_SEARCH_DIRECTION, (SubLObject)sbhl_search_vars.$list79, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19809L)
    public static SubLObject sbhl_forward_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_forward_search_direction_p(sbhl_search_vars.$sbhl_search_direction$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20000L)
    public static SubLObject sbhl_backward_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_backward_search_direction_p(sbhl_search_vars.$sbhl_search_direction$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20362L)
    public static SubLObject get_sbhl_search_index_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_search_index_arg$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20503L)
    public static SubLObject get_sbhl_search_gather_arg() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.subtract((SubLObject)sbhl_search_vars.THREE_INTEGER, sbhl_search_vars.$sbhl_search_index_arg$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20719L)
    public static SubLObject bind_sbhl_search_index_arg(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list80, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21136L)
    public static SubLObject get_sbhl_map_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_map_function$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21248L)
    public static SubLObject with_sbhl_map_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list81);
        function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym82$_SBHL_MAP_FUNCTION_, function)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21565L)
    public static SubLObject get_sbhl_unwind_function() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_unwind_function$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21686L)
    public static SubLObject with_sbhl_unwind_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list81);
        function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym83$_SBHL_UNWIND_FUNCTION_, function)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22044L)
    public static SubLObject sbhl_apply_unwind_function_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_apply_unwind_function_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22216L)
    public static SubLObject sbhl_toggle_unwind_function_on() {
        sbhl_search_vars.$sbhl_apply_unwind_function_p$.setDynamicValue((SubLObject)sbhl_search_vars.T);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22375L)
    public static SubLObject sbhl_toggle_unwind_function_off() {
        sbhl_search_vars.$sbhl_apply_unwind_function_p$.setDynamicValue((SubLObject)sbhl_search_vars.NIL);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22539L)
    public static SubLObject with_sbhl_unwind_function_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list84, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22717L)
    public static SubLObject with_sbhl_unwind_function_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list85, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23014L)
    public static SubLObject get_sbhl_search_parent_marking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_search_parent_marking$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23182L)
    public static SubLObject set_sbhl_search_parent_marking(final SubLObject marking) {
        sbhl_search_vars.$sbhl_search_parent_marking$.setDynamicValue(marking);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23361L)
    public static SubLObject reset_sbhl_search_parent_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list86, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23556L)
    public static SubLObject dynamically_rebind_sbhl_search_parent_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list87, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23911L)
    public static SubLObject with_new_sbhl_previous_marking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list88, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24095L)
    public static SubLObject get_sbhl_nodes_previous_marking() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_nodes_previous_marking$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24368L)
    public static SubLObject with_new_sbhl_finished(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list89, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24521L)
    public static SubLObject sbhl_finished_with_goal() {
        sbhl_search_vars.$sbhl_finishedP$.setDynamicValue((SubLObject)sbhl_search_vars.$kw90$GOAL);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24740L)
    public static SubLObject sbhl_finished_with_cutoff() {
        sbhl_search_vars.$sbhl_finishedP$.setDynamicValue((SubLObject)sbhl_search_vars.$kw91$CUTOFF);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25062L)
    public static SubLObject sbhl_stop_search_path_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_stop_search_pathP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25215L)
    public static SubLObject sbhl_stop_search_path() {
        sbhl_search_vars.$sbhl_stop_search_pathP$.setDynamicValue((SubLObject)sbhl_search_vars.T);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25371L)
    public static SubLObject sbhl_continue_search_path() {
        sbhl_search_vars.$sbhl_stop_search_pathP$.setDynamicValue((SubLObject)sbhl_search_vars.NIL);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25535L)
    public static SubLObject with_new_sbhl_stop_search_path(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list92, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25810L)
    public static SubLObject sbhl_target_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eql(node, sbhl_search_vars.$sbhl_target_node$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25970L)
    public static SubLObject with_sbhl_target_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list93);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym94$_SBHL_TARGET_NODE_, node)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26244L)
    public static SubLObject sbhl_goal_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eql(node, sbhl_search_vars.$sbhl_goal_node$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26398L)
    public static SubLObject with_sbhl_goal_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list93);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym95$_SBHL_GOAL_NODE_, node)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26569L)
    public static SubLObject get_sbhl_goal_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_goal_node$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26818L)
    public static SubLObject sbhl_node_isa_goal_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(node, sbhl_search_vars.$sbhl_goal_node$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sbhl_search_vars.EQL), (SubLObject)sbhl_search_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26991L)
    public static SubLObject get_sbhl_goal_nodes() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_goal_nodes$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27113L)
    public static SubLObject with_sbhl_goal_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject nodes = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list96);
        nodes = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym95$_SBHL_GOAL_NODE_, nodes)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27389L)
    public static SubLObject with_sbhl_isaP_goal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list93);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym97$_SBHL_ISA__GOAL_, node)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27560L)
    public static SubLObject get_sbhl_isaP_goal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_isaP_goal$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27798L)
    public static SubLObject with_sbhl_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list98);
        result_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list99, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym100$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sbhl_search_vars.$sym38$PROGN, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym101$CSETQ, result_var, (SubLObject)sbhl_search_vars.$list99)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28195L)
    public static SubLObject with_sbhl_just_result(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject result_var = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list98);
        result_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list102, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym100$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sbhl_search_vars.$sym38$PROGN, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym101$CSETQ, result_var, (SubLObject)sbhl_search_vars.$list102)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28650L)
    public static SubLObject get_sbhl_consider_node_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_consider_node_fn$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28799L)
    public static SubLObject with_sbhl_consider_node_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list103);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym104$_SBHL_CONSIDER_NODE_FN_, fn)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29091L)
    public static SubLObject get_sbhl_compose_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_compose_fn$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29222L)
    public static SubLObject with_sbhl_compose_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list103);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym105$_SBHL_COMPOSE_FN_, fn)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29497L)
    public static SubLObject get_sbhl_combine_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_combine_fn$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29628L)
    public static SubLObject with_sbhl_combine_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list103);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym107$_SBHL_COMBINE_FN_, fn)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29895L)
    public static SubLObject get_sbhl_map_test_fn() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_map_test_fn$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30029L)
    public static SubLObject with_sbhl_map_test_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list103);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym108$_SBHL_MAP_TEST_FN_, fn)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30323L)
    public static SubLObject reset_sbhl_accessed_gather_nodes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list109, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30627L)
    public static SubLObject with_sbhl_dependents_cut_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list93);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym110$_SBHL_DEPENDENTS_CUT_NODE_, node)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30812L)
    public static SubLObject sbhl_dependents_cut_node_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Equality.eql(node, sbhl_search_vars.$sbhl_dependents_cut_node$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31176L)
    public static SubLObject with_sbhl_access_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arg = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list111);
        arg = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym112$_SBHL_ACCESS_ARG_, arg)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31506L)
    public static SubLObject with_sbhl_referent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ref = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list113);
        ref = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym114$_SBHL_REFERENT_, ref)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31810L)
    public static SubLObject with_new_sbhl_leaf_queue(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list115, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 32099L)
    public static SubLObject with_sbhl_sample_leaf_queues(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject node = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list93);
        node = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject queue = (SubLObject)sbhl_search_vars.$sym116$QUEUE;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(queue, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym117$ENQUEUE, node, (SubLObject)sbhl_search_vars.$list118)), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym119$_SBHL_SAMPLE_LEAF_QUEUES_, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym120$LIST, queue))), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 32400L)
    public static SubLObject sbhl_leaf_sample_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(sbhl_search_vars.$sbhl_sample_leaf_queues$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 32623L)
    public static SubLObject do_sbhl_sample_leaf_queues(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list121);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = (SubLObject)sbhl_search_vars.NIL;
        SubLObject found_var = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list121);
        node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list121);
        found_var = current.first();
        current = current.rest();
        if (sbhl_search_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject queue = (SubLObject)sbhl_search_vars.$sym122$QUEUE;
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym123$WHILE, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym124$CAND, (SubLObject)sbhl_search_vars.$sym119$_SBHL_SAMPLE_LEAF_QUEUES_, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym125$CNOT, found_var)), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(queue, (SubLObject)sbhl_search_vars.$list126), (SubLObject)ConsesLow.list(node_var, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym127$FIRST, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym128$QUEUE_ELEMENTS, queue)))), reader.bq_cons((SubLObject)sbhl_search_vars.$sym129$WITH_NEW_SBHL_LEAF_QUEUE, ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym36$PIF, found_var, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym38$PROGN, (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym130$RPLACD, (SubLObject)sbhl_search_vars.$list131, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym120$LIST, queue, (SubLObject)sbhl_search_vars.$list132)), (SubLObject)sbhl_search_vars.$list133), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym134$DEQUEUE, queue)))))), (SubLObject)sbhl_search_vars.$list135);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_search_vars.$list121);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 33511L)
    public static SubLObject sbhl_extremal_test_fn_p(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Functions.funcall(sbhl_search_vars.$sbhl_extremal_test_fn$.getDynamicValue(thread), node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 33673L)
    public static SubLObject with_sbhl_extremal_test_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list81);
        function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym136$_SBHL_EXTREMAL_TEST_FN_, function)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34073L)
    public static SubLObject sbhl_check_for_goal_marking_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_check_for_goal_marking_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34235L)
    public static SubLObject with_sbhl_search_termination_on_previous_successes(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list137, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34587L)
    public static SubLObject with_sbhl_precomputed_goal_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject goal_space = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list138);
        goal_space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym139$_SBHL_PRECOMPUTED_GOAL_SPACE_, goal_space)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35357L)
    public static SubLObject with_sbhl_true_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list140, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35550L)
    public static SubLObject with_sbhl_false_search(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)sbhl_search_vars.$list141, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35746L)
    public static SubLObject sbhl_true_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_true_tv_p(sbhl_search_vars.$sbhl_search_truth$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35965L)
    public static SubLObject sbhl_false_search_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_false_tv_p(sbhl_search_vars.$sbhl_search_truth$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36441L)
    public static SubLObject sbhl_search_truth_value_p(final SubLObject truth) {
        return subl_promotions.memberP(truth, sbhl_search_vars.$sbhl_search_truth_values$.getGlobalValue(), (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36841L)
    public static SubLObject get_sbhl_true_tv() {
        return sbhl_search_vars.$sbhl_true_tv$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36972L)
    public static SubLObject get_sbhl_false_tv() {
        return sbhl_search_vars.$sbhl_false_tv$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37208L)
    public static SubLObject get_sbhl_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37457L)
    public static SubLObject relevant_sbhl_tv_is_everything(final SubLObject tv) {
        return (SubLObject)sbhl_search_vars.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37632L)
    public static SubLObject sbhl_tv_generalizes_to_general_tvP(final SubLObject tv, final SubLObject general_tv) {
        if (tv.eql(general_tv)) {
            return (SubLObject)sbhl_search_vars.T;
        }
        if (tv.eql(sbhl_search_vars.$const145$MonotonicallyTrue)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(general_tv.eql(sbhl_search_vars.$const146$DefaultTrue) || general_tv.eql(sbhl_search_vars.$const143$True_JustificationTruth) || general_tv.eql(sbhl_search_vars.$const147$ArbitraryTruth_JustifactionTruth));
        }
        if (tv.eql(sbhl_search_vars.$const146$DefaultTrue)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(general_tv.eql(sbhl_search_vars.$const143$True_JustificationTruth) || general_tv.eql(sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth));
        }
        if (tv.eql(sbhl_search_vars.$const143$True_JustificationTruth)) {
            return Equality.eql(general_tv, sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth);
        }
        if (tv.eql(sbhl_search_vars.$const149$MonotonicallyFalse)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(general_tv.eql(sbhl_search_vars.$const150$DefaultFalse) || general_tv.eql(sbhl_search_vars.$const144$False_JustificationTruth) || general_tv.eql(sbhl_search_vars.$const151$JustifactionTruth));
        }
        if (tv.eql(sbhl_search_vars.$const150$DefaultFalse)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(general_tv.eql(sbhl_search_vars.$const144$False_JustificationTruth) || general_tv.eql(sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth));
        }
        if (tv.eql(sbhl_search_vars.$const144$False_JustificationTruth)) {
            return Equality.eql(general_tv, sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth);
        }
        if (tv.eql(sbhl_search_vars.$const152$Unknown_JustificationTruth)) {
            return Equality.eql(general_tv, sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth);
        }
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 38736L)
    public static SubLObject relevant_sbhl_tv_is_general_tv(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_tv_generalizes_to_general_tvP(tv, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 38923L)
    public static SubLObject relevant_sbhl_tvP(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (sbhl_search_vars.NIL != sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)) ? Functions.funcall(sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), tv) : relevant_sbhl_tv_is_general_tv(tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 39253L)
    public static SubLObject sbhl_true_tv_p(final SubLObject tv) {
        return sbhl_tv_generalizes_to_general_tvP(tv, sbhl_search_vars.$const143$True_JustificationTruth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 39492L)
    public static SubLObject sbhl_false_tv_p(final SubLObject tv) {
        return sbhl_tv_generalizes_to_general_tvP(tv, sbhl_search_vars.$const144$False_JustificationTruth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 39734L)
    public static SubLObject sbhl_opposite_or_nil_tv(final SubLObject tv) {
        if (tv.eql(sbhl_search_vars.$const145$MonotonicallyTrue)) {
            return sbhl_search_vars.$const149$MonotonicallyFalse;
        }
        if (tv.eql(sbhl_search_vars.$const146$DefaultTrue)) {
            return sbhl_search_vars.$const150$DefaultFalse;
        }
        if (tv.eql(sbhl_search_vars.$const149$MonotonicallyFalse)) {
            return sbhl_search_vars.$const145$MonotonicallyTrue;
        }
        if (tv.eql(sbhl_search_vars.$const150$DefaultFalse)) {
            return sbhl_search_vars.$const146$DefaultTrue;
        }
        if (tv.eql(sbhl_search_vars.$const143$True_JustificationTruth)) {
            return sbhl_search_vars.$const144$False_JustificationTruth;
        }
        if (tv.eql(sbhl_search_vars.$const144$False_JustificationTruth)) {
            return sbhl_search_vars.$const143$True_JustificationTruth;
        }
        if (tv.eql(sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth)) {
            return sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth;
        }
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 40348L)
    public static SubLObject sbhl_opposite_tv(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject opposite_tv = sbhl_opposite_or_nil_tv(tv);
        if (sbhl_search_vars.NIL == opposite_tv && sbhl_search_vars.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_search_vars.NIL == sbhl_search_truth_value_p(tv)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_search_vars.$kw153$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_vars.$kw156$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str157$continue_anyway, (SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_search_vars.$kw158$WARN)) {
                Errors.warn((SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_search_vars.$str159$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_search_vars.$str157$continue_anyway, (SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P);
            }
        }
        return opposite_tv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 40658L)
    public static SubLObject sbhl_true_tv(final SubLObject tv) {
        if (sbhl_search_vars.NIL != sbhl_true_tv_p(tv)) {
            return tv;
        }
        if (sbhl_search_vars.NIL != sbhl_false_tv_p(tv)) {
            return sbhl_opposite_tv(tv);
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str160$Expected_true_or_false_sbhl_truth, tv, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 40979L)
    public static SubLObject sbhl_false_tv(final SubLObject tv) {
        if (sbhl_search_vars.NIL != sbhl_false_tv_p(tv)) {
            return tv;
        }
        if (sbhl_search_vars.NIL != sbhl_true_tv_p(tv)) {
            return sbhl_opposite_tv(tv);
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str160$Expected_true_or_false_sbhl_truth, tv, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41302L)
    public static SubLObject sbhl_search_true_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_true_tv(sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41480L)
    public static SubLObject sbhl_search_false_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_false_tv(sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41663L)
    public static SubLObject sbhl_translate_to_old_tv(final SubLObject tv) {
        if (sbhl_search_vars.NIL != sbhl_true_tv_p(tv)) {
            return (SubLObject)sbhl_search_vars.$kw161$TRUE;
        }
        if (sbhl_search_vars.NIL != sbhl_false_tv_p(tv)) {
            return (SubLObject)sbhl_search_vars.$kw162$FALSE;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str163$unknown_truth_value_for_translati, tv, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41970L)
    public static SubLObject sbhl_possibly_translate_tv(final SubLObject tv) {
        if (tv != sbhl_search_vars.$kw161$TRUE && tv != sbhl_search_vars.$kw162$FALSE) {
            return sbhl_translate_to_old_tv(tv);
        }
        return tv;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 42122L)
    public static SubLObject sbhl_truth_to_support_truth(final SubLObject tv) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (tv.eql(sbhl_search_vars.$const145$MonotonicallyTrue)) {
            return (SubLObject)sbhl_search_vars.$kw164$TRUE_MON;
        }
        if (tv.eql(sbhl_search_vars.$const146$DefaultTrue)) {
            return (SubLObject)sbhl_search_vars.$kw165$TRUE_DEF;
        }
        if (tv.eql(sbhl_search_vars.$const149$MonotonicallyFalse)) {
            return (SubLObject)sbhl_search_vars.$kw166$FALSE_MON;
        }
        if (tv.eql(sbhl_search_vars.$const150$DefaultFalse)) {
            return (SubLObject)sbhl_search_vars.$kw167$FALSE_DEF;
        }
        if (tv.eql(sbhl_search_vars.$const143$True_JustificationTruth)) {
            return (SubLObject)sbhl_search_vars.$kw165$TRUE_DEF;
        }
        if (tv.eql(sbhl_search_vars.$const144$False_JustificationTruth)) {
            return (SubLObject)sbhl_search_vars.$kw167$FALSE_DEF;
        }
        if (tv.eql(sbhl_search_vars.$const148$ArbitraryTruth_JustificationTruth)) {
            return (SubLObject)sbhl_search_vars.$kw165$TRUE_DEF;
        }
        if (sbhl_search_vars.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_search_vars.NIL == sbhl_search_truth_value_p(tv)) {
            final SubLObject pcase_var_$1 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var_$1.eql((SubLObject)sbhl_search_vars.$kw153$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
            }
            else if (pcase_var_$1.eql((SubLObject)sbhl_search_vars.$kw156$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_search_vars.ONE_INTEGER, (SubLObject)sbhl_search_vars.$str157$continue_anyway, (SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED, (SubLObject)sbhl_search_vars.UNPROVIDED);
            }
            else if (pcase_var_$1.eql((SubLObject)sbhl_search_vars.$kw158$WARN)) {
                Errors.warn((SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_search_vars.$str159$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_search_vars.$str157$continue_anyway, (SubLObject)sbhl_search_vars.$str154$_A_is_not_a__A, tv, (SubLObject)sbhl_search_vars.$sym155$SBHL_SEARCH_TRUTH_VALUE_P);
            }
        }
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 42585L)
    public static SubLObject support_truth_to_sbhl_truth(final SubLObject tv) {
        if (tv.eql((SubLObject)sbhl_search_vars.$kw164$TRUE_MON)) {
            return sbhl_search_vars.$const145$MonotonicallyTrue;
        }
        if (tv.eql((SubLObject)sbhl_search_vars.$kw165$TRUE_DEF)) {
            return sbhl_search_vars.$const146$DefaultTrue;
        }
        if (tv.eql((SubLObject)sbhl_search_vars.$kw166$FALSE_MON)) {
            return sbhl_search_vars.$const149$MonotonicallyFalse;
        }
        if (tv.eql((SubLObject)sbhl_search_vars.$kw167$FALSE_DEF)) {
            return sbhl_search_vars.$const150$DefaultFalse;
        }
        return Errors.error((SubLObject)sbhl_search_vars.$str168$Cannot_translate__s_truth_to_an_s, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 42893L)
    public static SubLObject with_sbhl_tv_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list81);
        function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym169$_RELEVANT_SBHL_TV_FUNCTION_, function)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 43133L)
    public static SubLObject with_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym171$_SBHL_TV_, sbhl_tv)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 43291L)
    public static SubLObject with_all_sbhl_tvs(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym172$WITH_SBHL_TV_FUNCTION, (SubLObject)sbhl_search_vars.$list173, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 43463L)
    public static SubLObject with_general_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym172$WITH_SBHL_TV_FUNCTION, (SubLObject)sbhl_search_vars.$list174, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym175$WITH_SBHL_TV, sbhl_tv, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 43691L)
    public static SubLObject with_just_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list170);
        sbhl_tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym172$WITH_SBHL_TV_FUNCTION, (SubLObject)sbhl_search_vars.$list176, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym175$WITH_SBHL_TV, sbhl_tv, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 43910L)
    public static SubLObject possibly_with_sbhl_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list177);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject tv_var = (SubLObject)sbhl_search_vars.$sym178$TV_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tv_var, tv), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym171$_SBHL_TV_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym179$FIF, tv_var, tv_var, (SubLObject)sbhl_search_vars.$list180)), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym169$_RELEVANT_SBHL_TV_FUNCTION_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym179$FIF, tv_var, (SubLObject)sbhl_search_vars.$list181))), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym182$PWHEN, tv_var, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym183$SBHL_CHECK_TYPE, tv_var, (SubLObject)sbhl_search_vars.$list184)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 44404L)
    public static SubLObject possibly_with_sbhl_true_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list177);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject tv_var = (SubLObject)sbhl_search_vars.$sym185$TV_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tv_var, tv), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym171$_SBHL_TV_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym179$FIF, tv_var, tv_var, (SubLObject)sbhl_search_vars.$list186)), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym169$_RELEVANT_SBHL_TV_FUNCTION_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym179$FIF, tv_var, (SubLObject)sbhl_search_vars.$list181))), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym182$PWHEN, tv_var, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym183$SBHL_CHECK_TYPE, tv_var, (SubLObject)sbhl_search_vars.$list187)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 44917L)
    public static SubLObject possibly_with_sbhl_false_tv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tv = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list177);
        tv = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject tv_var = (SubLObject)sbhl_search_vars.$sym188$TV_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym24$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tv_var, tv), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym171$_SBHL_TV_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym179$FIF, tv_var, tv_var, (SubLObject)sbhl_search_vars.$list189)), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym169$_RELEVANT_SBHL_TV_FUNCTION_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym179$FIF, tv_var, (SubLObject)sbhl_search_vars.$list181))), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.$sym182$PWHEN, tv_var, (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym183$SBHL_CHECK_TYPE, tv_var, (SubLObject)sbhl_search_vars.$list190)), ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 45434L)
    public static SubLObject possibly_with_sbhl_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)sbhl_search_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_search_vars.$list191);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_search_vars.$sym192$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, mt, ConsesLow.append(body, (SubLObject)sbhl_search_vars.NIL));
    }
    
    public static SubLObject declare_sbhl_search_vars_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "initialize_sbhl_search", "INITIALIZE-SBHL-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "initialize_sbhl_search_wXo_spaces", "INITIALIZE-SBHL-SEARCH-W/O-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_true_conditions", "WITH-SBHL-FORWARD-TRUE-CONDITIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_true_conditions", "WITH-SBHL-BACKWARD-TRUE-CONDITIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_false_conditions", "WITH-SBHL-FORWARD-FALSE-CONDITIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_false_conditions", "WITH-SBHL-BACKWARD-FALSE-CONDITIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_true_search", "WITH-SBHL-FORWARD-TRUE-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_true_search", "WITH-SBHL-BACKWARD-TRUE-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_false_search", "WITH-SBHL-FORWARD-FALSE-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_false_search", "WITH-SBHL-BACKWARD-FALSE-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_true_subsearch", "WITH-SBHL-FORWARD-TRUE-SUBSEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_true_subsearch", "WITH-SBHL-BACKWARD-TRUE-SUBSEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_false_subsearch", "WITH-SBHL-FORWARD-FALSE-SUBSEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_false_subsearch", "WITH-SBHL-BACKWARD-FALSE-SUBSEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_search_type_p", "SBHL-SEARCH-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_type", "GET-SBHL-SEARCH-TYPE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_search_type", "WITH-SBHL-SEARCH-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_closure_search", "WITH-SBHL-CLOSURE-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_boolean_search", "WITH-SBHL-BOOLEAN-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_what_mts_search", "WITH-SBHL-WHAT-MTS-SEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_closure_search_p", "SBHL-CLOSURE-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_boolean_search_p", "SBHL-BOOLEAN-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_what_mts_search_p", "SBHL-WHAT-MTS-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_goal_search_p", "SBHL-GOAL-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_justification_search_p", "SBHL-JUSTIFICATION-SEARCH-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_justification_search", "WITH-SBHL-JUSTIFICATION-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "without_sbhl_justification_search", "WITHOUT-SBHL-JUSTIFICATION-SEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_behavior", "GET-SBHL-SEARCH-BEHAVIOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_search_behavior", "WITH-SBHL-SEARCH-BEHAVIOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_just_behavior", "GET-SBHL-JUST-BEHAVIOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_justification_behavior", "WITH-SBHL-JUSTIFICATION-BEHAVIOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_with_sbhl_justification_behavior", "POSSIBLY-WITH-SBHL-JUSTIFICATION-BEHAVIOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_assertion_justifications", "WITH-SBHL-ASSERTION-JUSTIFICATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_verbose_justifications", "WITH-SBHL-VERBOSE-JUSTIFICATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_old_justifications", "WITH-SBHL-OLD-JUSTIFICATIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_justification_default", "WITH-SBHL-JUSTIFICATION-DEFAULT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_justification_behavior_defaults_old", "SBHL-JUSTIFICATION-BEHAVIOR-DEFAULTS-OLD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_justification_defaulted_old_p", "SBHL-JUSTIFICATION-DEFAULTED-OLD-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_justification_assembled", "SBHL-JUSTIFICATION-ASSEMBLED", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_justification_unassembled", "WITH-SBHL-JUSTIFICATION-UNASSEMBLED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_justification_assembled_p", "SBHL-JUSTIFICATION-ASSEMBLED-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_unmarking_search_p", "SBHL-UNMARKING-SEARCH-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_unmarking_search", "WITH-SBHL-UNMARKING-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "without_sbhl_unmarking_search", "WITHOUT-SBHL-UNMARKING-SEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_module", "GET-SBHL-SEARCH-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_module_type", "GET-SBHL-SEARCH-MODULE-TYPE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_add_node_test", "GET-SBHL-SEARCH-ADD-NODE-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_add_unmarked_node_test", "GET-SBHL-SEARCH-ADD-UNMARKED-NODE-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_gather_module", "GET-SBHL-SEARCH-GATHER-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_disjoins_search_gather_module", "GET-SBHL-DISJOINS-SEARCH-GATHER-MODULE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_search_module", "WITH-SBHL-SEARCH-MODULE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "genl_inverse_mode_p", "GENL-INVERSE-MODE-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "not_genl_inverse_mode_p", "NOT-GENL-INVERSE-MODE-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_new_sbhl_predicate_mode_scope", "WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_predicate_mode", "WITH-SBHL-PREDICATE-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_genl_inverse_mode", "WITH-GENL-INVERSE-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_update_genl_inverse_mode", "SBHL-UPDATE-GENL-INVERSE-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_flip_genl_inverse_mode", "POSSIBLY-FLIP-GENL-INVERSE-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_premark_with_genl_inverse_mode", "POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "flip_genl_inverse_mode", "FLIP-GENL-INVERSE-MODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_module_flips_inverse_mode_p", "SBHL-MODULE-FLIPS-INVERSE-MODE-P", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "flip_genl_inverse_modeP", "FLIP-GENL-INVERSE-MODE?", 0, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_initialized_unmarking_sbhl_marking_module", "WITH-INITIALIZED-UNMARKING-SBHL-MARKING-MODULE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_forward_search_direction_p", "SBHL-FORWARD-SEARCH-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_forward_search_direction", "GET-SBHL-FORWARD-SEARCH-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_backward_search_direction_p", "SBHL-BACKWARD-SEARCH-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_backward_search_direction", "GET-SBHL-BACKWARD-SEARCH-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_direction", "GET-SBHL-SEARCH-DIRECTION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_search_direction", "WITH-SBHL-SEARCH-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_forward_search_direction", "WITH-SBHL-FORWARD-SEARCH-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_backward_search_direction", "WITH-SBHL-BACKWARD-SEARCH-DIRECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_forward_search_p", "SBHL-FORWARD-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_backward_search_p", "SBHL-BACKWARD-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_index_arg", "GET-SBHL-SEARCH-INDEX-ARG", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_gather_arg", "GET-SBHL-SEARCH-GATHER-ARG", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "bind_sbhl_search_index_arg", "BIND-SBHL-SEARCH-INDEX-ARG");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_map_function", "GET-SBHL-MAP-FUNCTION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_map_function", "WITH-SBHL-MAP-FUNCTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_unwind_function", "GET-SBHL-UNWIND-FUNCTION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_unwind_function", "WITH-SBHL-UNWIND-FUNCTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_apply_unwind_function_p", "SBHL-APPLY-UNWIND-FUNCTION-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_toggle_unwind_function_on", "SBHL-TOGGLE-UNWIND-FUNCTION-ON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_toggle_unwind_function_off", "SBHL-TOGGLE-UNWIND-FUNCTION-OFF", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_unwind_function_on", "WITH-SBHL-UNWIND-FUNCTION-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_unwind_function_off", "WITH-SBHL-UNWIND-FUNCTION-OFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_search_parent_marking", "GET-SBHL-SEARCH-PARENT-MARKING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "set_sbhl_search_parent_marking", "SET-SBHL-SEARCH-PARENT-MARKING", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "reset_sbhl_search_parent_marking", "RESET-SBHL-SEARCH-PARENT-MARKING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "dynamically_rebind_sbhl_search_parent_marking", "DYNAMICALLY-REBIND-SBHL-SEARCH-PARENT-MARKING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_new_sbhl_previous_marking", "WITH-NEW-SBHL-PREVIOUS-MARKING");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_nodes_previous_marking", "GET-SBHL-NODES-PREVIOUS-MARKING", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_new_sbhl_finished", "WITH-NEW-SBHL-FINISHED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_finished_with_goal", "SBHL-FINISHED-WITH-GOAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_finished_with_cutoff", "SBHL-FINISHED-WITH-CUTOFF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_stop_search_path_p", "SBHL-STOP-SEARCH-PATH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_stop_search_path", "SBHL-STOP-SEARCH-PATH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_continue_search_path", "SBHL-CONTINUE-SEARCH-PATH", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_new_sbhl_stop_search_path", "WITH-NEW-SBHL-STOP-SEARCH-PATH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_target_node_p", "SBHL-TARGET-NODE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_target_node", "WITH-SBHL-TARGET-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_goal_node_p", "SBHL-GOAL-NODE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_goal_node", "WITH-SBHL-GOAL-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_goal_node", "GET-SBHL-GOAL-NODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_node_isa_goal_node_p", "SBHL-NODE-ISA-GOAL-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_goal_nodes", "GET-SBHL-GOAL-NODES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_goal_nodes", "WITH-SBHL-GOAL-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_isaP_goal", "WITH-SBHL-ISA?-GOAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_isaP_goal", "GET-SBHL-ISA?-GOAL", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_result", "WITH-SBHL-RESULT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_just_result", "WITH-SBHL-JUST-RESULT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_consider_node_fn", "GET-SBHL-CONSIDER-NODE-FN", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_consider_node_fn", "WITH-SBHL-CONSIDER-NODE-FN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_compose_fn", "GET-SBHL-COMPOSE-FN", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_compose_fn", "WITH-SBHL-COMPOSE-FN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_combine_fn", "GET-SBHL-COMBINE-FN", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_combine_fn", "WITH-SBHL-COMBINE-FN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_map_test_fn", "GET-SBHL-MAP-TEST-FN", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_map_test_fn", "WITH-SBHL-MAP-TEST-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "reset_sbhl_accessed_gather_nodes", "RESET-SBHL-ACCESSED-GATHER-NODES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_dependents_cut_node", "WITH-SBHL-DEPENDENTS-CUT-NODE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_dependents_cut_node_p", "SBHL-DEPENDENTS-CUT-NODE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_access_arg", "WITH-SBHL-ACCESS-ARG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_referent", "WITH-SBHL-REFERENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_new_sbhl_leaf_queue", "WITH-NEW-SBHL-LEAF-QUEUE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_sample_leaf_queues", "WITH-SBHL-SAMPLE-LEAF-QUEUES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_leaf_sample_search_p", "SBHL-LEAF-SAMPLE-SEARCH-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "do_sbhl_sample_leaf_queues", "DO-SBHL-SAMPLE-LEAF-QUEUES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_extremal_test_fn_p", "SBHL-EXTREMAL-TEST-FN-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_extremal_test_fn", "WITH-SBHL-EXTREMAL-TEST-FN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_check_for_goal_marking_p", "SBHL-CHECK-FOR-GOAL-MARKING-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_search_termination_on_previous_successes", "WITH-SBHL-SEARCH-TERMINATION-ON-PREVIOUS-SUCCESSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_precomputed_goal_space", "WITH-SBHL-PRECOMPUTED-GOAL-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_true_search", "WITH-SBHL-TRUE-SEARCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_false_search", "WITH-SBHL-FALSE-SEARCH");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_true_search_p", "SBHL-TRUE-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_false_search_p", "SBHL-FALSE-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_search_truth_value_p", "SBHL-SEARCH-TRUTH-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_true_tv", "GET-SBHL-TRUE-TV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_false_tv", "GET-SBHL-FALSE-TV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "get_sbhl_tv", "GET-SBHL-TV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "relevant_sbhl_tv_is_everything", "RELEVANT-SBHL-TV-IS-EVERYTHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_tv_generalizes_to_general_tvP", "SBHL-TV-GENERALIZES-TO-GENERAL-TV?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "relevant_sbhl_tv_is_general_tv", "RELEVANT-SBHL-TV-IS-GENERAL-TV", 1, 0, false);
        new $relevant_sbhl_tv_is_general_tv$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "relevant_sbhl_tvP", "RELEVANT-SBHL-TV?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_true_tv_p", "SBHL-TRUE-TV-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_false_tv_p", "SBHL-FALSE-TV-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_opposite_or_nil_tv", "SBHL-OPPOSITE-OR-NIL-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_opposite_tv", "SBHL-OPPOSITE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_true_tv", "SBHL-TRUE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_false_tv", "SBHL-FALSE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_search_true_tv", "SBHL-SEARCH-TRUE-TV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_search_false_tv", "SBHL-SEARCH-FALSE-TV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_translate_to_old_tv", "SBHL-TRANSLATE-TO-OLD-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_possibly_translate_tv", "SBHL-POSSIBLY-TRANSLATE-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "sbhl_truth_to_support_truth", "SBHL-TRUTH-TO-SUPPORT-TRUTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "support_truth_to_sbhl_truth", "SUPPORT-TRUTH-TO-SBHL-TRUTH", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_tv_function", "WITH-SBHL-TV-FUNCTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_sbhl_tv", "WITH-SBHL-TV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_all_sbhl_tvs", "WITH-ALL-SBHL-TVS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_general_sbhl_tv", "WITH-GENERAL-SBHL-TV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "with_just_sbhl_tv", "WITH-JUST-SBHL-TV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_with_sbhl_tv", "POSSIBLY-WITH-SBHL-TV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_with_sbhl_true_tv", "POSSIBLY-WITH-SBHL-TRUE-TV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_with_sbhl_false_tv", "POSSIBLY-WITH-SBHL-FALSE-TV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_search_vars", "possibly_with_sbhl_mt_relevance", "POSSIBLY-WITH-SBHL-MT-RELEVANCE");
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    public static SubLObject init_sbhl_search_vars_file() {
        sbhl_search_vars.$sbhl_search_types$ = SubLFiles.defparameter("*SBHL-SEARCH-TYPES*", (SubLObject)sbhl_search_vars.$list22);
        sbhl_search_vars.$sbhl_search_type$ = SubLFiles.defparameter("*SBHL-SEARCH-TYPE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_justification_search_p$ = SubLFiles.defparameter("*SBHL-JUSTIFICATION-SEARCH-P*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_search_behavior$ = SubLFiles.defparameter("*SBHL-SEARCH-BEHAVIOR*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_justification_behavior$ = SubLFiles.defparameter("*SBHL-JUSTIFICATION-BEHAVIOR*", (SubLObject)sbhl_search_vars.$kw34$OLD);
        sbhl_search_vars.$sbhl_justification_defaulted_old$ = SubLFiles.defparameter("*SBHL-JUSTIFICATION-DEFAULTED-OLD*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_justification_assembled_p$ = SubLFiles.defparameter("*SBHL-JUSTIFICATION-ASSEMBLED-P*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_unmarking_search_p$ = SubLFiles.defparameter("*SBHL-UNMARKING-SEARCH-P*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_search_module$ = SubLFiles.defparameter("*SBHL-SEARCH-MODULE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_search_module_type$ = SubLFiles.defparameter("*SBHL-SEARCH-MODULE-TYPE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_add_node_to_result_test$ = SubLFiles.defparameter("*SBHL-ADD-NODE-TO-RESULT-TEST*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$ = SubLFiles.defparameter("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$genl_inverse_mode_p$ = SubLFiles.defparameter("*GENL-INVERSE-MODE-P*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_forward_search_direction$ = SubLFiles.deflexical("*SBHL-FORWARD-SEARCH-DIRECTION*", (SubLObject)sbhl_search_vars.$kw73$FORWARD);
        sbhl_search_vars.$sbhl_backward_search_direction$ = SubLFiles.deflexical("*SBHL-BACKWARD-SEARCH-DIRECTION*", (SubLObject)sbhl_search_vars.$kw74$BACKWARD);
        sbhl_search_vars.$sbhl_search_direction$ = SubLFiles.defparameter("*SBHL-SEARCH-DIRECTION*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_index_arg$ = SubLFiles.defparameter("*SBHL-INDEX-ARG*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_search_index_arg$ = SubLFiles.defparameter("*SBHL-SEARCH-INDEX-ARG*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_map_function$ = SubLFiles.defparameter("*SBHL-MAP-FUNCTION*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_unwind_function$ = SubLFiles.defparameter("*SBHL-UNWIND-FUNCTION*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_apply_unwind_function_p$ = SubLFiles.defparameter("*SBHL-APPLY-UNWIND-FUNCTION-P*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_search_parent_marking$ = SubLFiles.defparameter("*SBHL-SEARCH-PARENT-MARKING*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_nodes_previous_marking$ = SubLFiles.defparameter("*SBHL-NODES-PREVIOUS-MARKING*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_finishedP$ = SubLFiles.defparameter("*SBHL-FINISHED?*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_stop_search_pathP$ = SubLFiles.defparameter("*SBHL-STOP-SEARCH-PATH?*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_target_node$ = SubLFiles.defparameter("*SBHL-TARGET-NODE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_goal_node$ = SubLFiles.defparameter("*SBHL-GOAL-NODE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_goal_nodes$ = SubLFiles.defparameter("*SBHL-GOAL-NODES*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_isaP_goal$ = SubLFiles.defparameter("*SBHL-ISA?-GOAL*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_result$ = SubLFiles.defparameter("*SBHL-RESULT*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_justification_result$ = SubLFiles.defparameter("*SBHL-JUSTIFICATION-RESULT*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_consider_node_fn$ = SubLFiles.defparameter("*SBHL-CONSIDER-NODE-FN*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_compose_fn$ = SubLFiles.defparameter("*SBHL-COMPOSE-FN*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_combine_fn$ = SubLFiles.defparameter("*SBHL-COMBINE-FN*", (SubLObject)sbhl_search_vars.$sym106$NCONC);
        sbhl_search_vars.$sbhl_map_test_fn$ = SubLFiles.defparameter("*SBHL-MAP-TEST-FN*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_accessed_gather_nodes$ = SubLFiles.defparameter("*SBHL-ACCESSED-GATHER-NODES*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_dependents_cut_node$ = SubLFiles.defparameter("*SBHL-DEPENDENTS-CUT-NODE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_access_arg$ = SubLFiles.defparameter("*SBHL-ACCESS-ARG*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_referent$ = SubLFiles.defparameter("*SBHL-REFERENT*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_current_leaf_queue$ = SubLFiles.defparameter("*SBHL-CURRENT-LEAF-QUEUE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_sample_leaf_queues$ = SubLFiles.defparameter("*SBHL-SAMPLE-LEAF-QUEUES*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_extremal_test_fn$ = SubLFiles.defparameter("*SBHL-EXTREMAL-TEST-FN*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_check_for_goal_marking_p$ = SubLFiles.defparameter("*SBHL-CHECK-FOR-GOAL-MARKING-P*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_precomputed_goal_space$ = SubLFiles.defparameter("*SBHL-PRECOMPUTED-GOAL-SPACE*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$infer_nat_sbhlP$ = SubLFiles.defparameter("*INFER-NAT-SBHL?*", (SubLObject)sbhl_search_vars.T);
        sbhl_search_vars.$sbhl_mapping_pred$ = SubLFiles.defparameter("*SBHL-MAPPING-PRED*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$maximize_sbhl_resultP$ = SubLFiles.defparameter("*MAXIMIZE-SBHL-RESULT?*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$minimize_sbhl_resultP$ = SubLFiles.defparameter("*MINIMIZE-SBHL-RESULT?*", (SubLObject)sbhl_search_vars.T);
        sbhl_search_vars.$sbhl_search_truth$ = SubLFiles.defparameter("*SBHL-SEARCH-TRUTH*", (SubLObject)sbhl_search_vars.NIL);
        sbhl_search_vars.$sbhl_search_truth_values$ = SubLFiles.deflexical("*SBHL-SEARCH-TRUTH-VALUES*", (SubLObject)sbhl_search_vars.$list142);
        sbhl_search_vars.$sbhl_true_tv$ = SubLFiles.deflexical("*SBHL-TRUE-TV*", sbhl_search_vars.$const143$True_JustificationTruth);
        sbhl_search_vars.$sbhl_false_tv$ = SubLFiles.deflexical("*SBHL-FALSE-TV*", sbhl_search_vars.$const144$False_JustificationTruth);
        sbhl_search_vars.$sbhl_tv$ = SubLFiles.defparameter("*SBHL-TV*", sbhl_search_vars.$const143$True_JustificationTruth);
        sbhl_search_vars.$relevant_sbhl_tv_function$ = SubLFiles.defparameter("*RELEVANT-SBHL-TV-FUNCTION*", (SubLObject)sbhl_search_vars.NIL);
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    public static SubLObject setup_sbhl_search_vars_file() {
        return (SubLObject)sbhl_search_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_search_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_search_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_search_vars_file();
    }
    
    static {
        me = (SubLFile)new sbhl_search_vars();
        sbhl_search_vars.$sbhl_search_types$ = null;
        sbhl_search_vars.$sbhl_search_type$ = null;
        sbhl_search_vars.$sbhl_justification_search_p$ = null;
        sbhl_search_vars.$sbhl_search_behavior$ = null;
        sbhl_search_vars.$sbhl_justification_behavior$ = null;
        sbhl_search_vars.$sbhl_justification_defaulted_old$ = null;
        sbhl_search_vars.$sbhl_justification_assembled_p$ = null;
        sbhl_search_vars.$sbhl_unmarking_search_p$ = null;
        sbhl_search_vars.$sbhl_search_module$ = null;
        sbhl_search_vars.$sbhl_search_module_type$ = null;
        sbhl_search_vars.$sbhl_add_node_to_result_test$ = null;
        sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$ = null;
        sbhl_search_vars.$genl_inverse_mode_p$ = null;
        sbhl_search_vars.$sbhl_forward_search_direction$ = null;
        sbhl_search_vars.$sbhl_backward_search_direction$ = null;
        sbhl_search_vars.$sbhl_search_direction$ = null;
        sbhl_search_vars.$sbhl_index_arg$ = null;
        sbhl_search_vars.$sbhl_search_index_arg$ = null;
        sbhl_search_vars.$sbhl_map_function$ = null;
        sbhl_search_vars.$sbhl_unwind_function$ = null;
        sbhl_search_vars.$sbhl_apply_unwind_function_p$ = null;
        sbhl_search_vars.$sbhl_search_parent_marking$ = null;
        sbhl_search_vars.$sbhl_nodes_previous_marking$ = null;
        sbhl_search_vars.$sbhl_finishedP$ = null;
        sbhl_search_vars.$sbhl_stop_search_pathP$ = null;
        sbhl_search_vars.$sbhl_target_node$ = null;
        sbhl_search_vars.$sbhl_goal_node$ = null;
        sbhl_search_vars.$sbhl_goal_nodes$ = null;
        sbhl_search_vars.$sbhl_isaP_goal$ = null;
        sbhl_search_vars.$sbhl_result$ = null;
        sbhl_search_vars.$sbhl_justification_result$ = null;
        sbhl_search_vars.$sbhl_consider_node_fn$ = null;
        sbhl_search_vars.$sbhl_compose_fn$ = null;
        sbhl_search_vars.$sbhl_combine_fn$ = null;
        sbhl_search_vars.$sbhl_map_test_fn$ = null;
        sbhl_search_vars.$sbhl_accessed_gather_nodes$ = null;
        sbhl_search_vars.$sbhl_dependents_cut_node$ = null;
        sbhl_search_vars.$sbhl_access_arg$ = null;
        sbhl_search_vars.$sbhl_referent$ = null;
        sbhl_search_vars.$sbhl_current_leaf_queue$ = null;
        sbhl_search_vars.$sbhl_sample_leaf_queues$ = null;
        sbhl_search_vars.$sbhl_extremal_test_fn$ = null;
        sbhl_search_vars.$sbhl_check_for_goal_marking_p$ = null;
        sbhl_search_vars.$sbhl_precomputed_goal_space$ = null;
        sbhl_search_vars.$infer_nat_sbhlP$ = null;
        sbhl_search_vars.$sbhl_mapping_pred$ = null;
        sbhl_search_vars.$maximize_sbhl_resultP$ = null;
        sbhl_search_vars.$minimize_sbhl_resultP$ = null;
        sbhl_search_vars.$sbhl_search_truth$ = null;
        sbhl_search_vars.$sbhl_search_truth_values$ = null;
        sbhl_search_vars.$sbhl_true_tv$ = null;
        sbhl_search_vars.$sbhl_false_tv$ = null;
        sbhl_search_vars.$sbhl_tv$ = null;
        sbhl_search_vars.$relevant_sbhl_tv_function$ = null;
        $sym0$POSSIBLY_WITH_NEW_SBHL_SPACES = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");
        $sym1$WITH_NEW_SBHL_FINISHED = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-FINISHED");
        $sym2$WITH_NEW_SBHL_STOP_SEARCH_PATH = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-STOP-SEARCH-PATH");
        $sym3$RESET_SBHL_SEARCH_PARENT_MARKING = SubLObjectFactory.makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");
        $sym4$WITH_NEW_SBHL_PREVIOUS_MARKING = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-PREVIOUS-MARKING");
        $sym5$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
        $sym6$WITH_SBHL_READER_LOCK = SubLObjectFactory.makeSymbol("WITH-SBHL-READER-LOCK");
        $sym7$WITH_SBHL_TRUE_SEARCH = SubLObjectFactory.makeSymbol("WITH-SBHL-TRUE-SEARCH");
        $sym8$WITH_SBHL_FORWARD_SEARCH_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");
        $sym9$WITH_SBHL_FORWARD_LINK_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");
        $sym10$WITH_SBHL_BACKWARD_SEARCH_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-BACKWARD-SEARCH-DIRECTION");
        $sym11$WITH_SBHL_BACKWARD_LINK_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-BACKWARD-LINK-DIRECTION");
        $sym12$WITH_SBHL_FALSE_SEARCH = SubLObjectFactory.makeSymbol("WITH-SBHL-FALSE-SEARCH");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");
        $sym15$POSSIBLY_WITH_SBHL_TRUE_TV = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");
        $sym16$WITH_SBHL_FORWARD_TRUE_CONDITIONS = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-TRUE-CONDITIONS");
        $sym17$INITIALIZE_SBHL_SEARCH = SubLObjectFactory.makeSymbol("INITIALIZE-SBHL-SEARCH");
        $sym18$WITH_SBHL_BACKWARD_TRUE_CONDITIONS = SubLObjectFactory.makeSymbol("WITH-SBHL-BACKWARD-TRUE-CONDITIONS");
        $sym19$POSSIBLY_WITH_SBHL_FALSE_TV = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-SBHL-FALSE-TV");
        $sym20$WITH_SBHL_FORWARD_FALSE_CONDITIONS = SubLObjectFactory.makeSymbol("WITH-SBHL-FORWARD-FALSE-CONDITIONS");
        $sym21$WITH_SBHL_BACKWARD_FALSE_CONDITIONS = SubLObjectFactory.makeSymbol("WITH-SBHL-BACKWARD-FALSE-CONDITIONS");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSURE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("WHAT-MTS"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym25$_SBHL_SEARCH_TYPE_ = SubLObjectFactory.makeSymbol("*SBHL-SEARCH-TYPE*");
        $sym26$WITH_SBHL_SEARCH_TYPE = SubLObjectFactory.makeSymbol("WITH-SBHL-SEARCH-TYPE");
        $kw27$CLOSURE = SubLObjectFactory.makeKeyword("CLOSURE");
        $kw28$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $kw29$WHAT_MTS = SubLObjectFactory.makeKeyword("WHAT-MTS");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), (SubLObject)sbhl_search_vars.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), (SubLObject)sbhl_search_vars.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-UNWIND-FUNCTION*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-TIME-SEARCH-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT")))));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), (SubLObject)sbhl_search_vars.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), (SubLObject)sbhl_search_vars.NIL));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BEHAVIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym33$_SBHL_SEARCH_BEHAVIOR_ = SubLObjectFactory.makeSymbol("*SBHL-SEARCH-BEHAVIOR*");
        $kw34$OLD = SubLObjectFactory.makeKeyword("OLD");
        $sym35$_SBHL_JUSTIFICATION_BEHAVIOR_ = SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*");
        $sym36$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym37$BEHAVIOR = SubLObjectFactory.makeSymbol("BEHAVIOR");
        $sym38$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION")));
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSE")));
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), (SubLObject)SubLObjectFactory.makeKeyword("OLD")));
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*"), (SubLObject)sbhl_search_vars.NIL));
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*"), (SubLObject)sbhl_search_vars.NIL));
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), (SubLObject)sbhl_search_vars.T));
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), (SubLObject)sbhl_search_vars.NIL));
        $str46$get_sbhl_search_module___sbhl_sea = SubLObjectFactory.makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");
        $const47$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const48$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $const49$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $const50$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym52$_SBHL_SEARCH_MODULE_ = SubLObjectFactory.makeSymbol("*SBHL-SEARCH-MODULE*");
        $sym53$_SBHL_SEARCH_MODULE_TYPE_ = SubLObjectFactory.makeSymbol("*SBHL-SEARCH-MODULE-TYPE*");
        $sym54$GET_SBHL_MODULE_TYPE = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-TYPE");
        $sym55$_SBHL_ADD_NODE_TO_RESULT_TEST_ = SubLObjectFactory.makeSymbol("*SBHL-ADD-NODE-TO-RESULT-TEST*");
        $sym56$GET_SBHL_ADD_NODE_TO_RESULT_TEST = SubLObjectFactory.makeSymbol("GET-SBHL-ADD-NODE-TO-RESULT-TEST");
        $sym57$WITH_SBHL_MODULE = SubLObjectFactory.makeSymbol("WITH-SBHL-MODULE");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"), (SubLObject)sbhl_search_vars.NIL));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym60$_GENL_INVERSE_MODE_P_ = SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"), (SubLObject)sbhl_search_vars.T));
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-MODULE-FLIPS-INVERSE-MODE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*")), (SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"))));
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FLIP-GENL-INVERSE-MODE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*")), (SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"))));
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-LINK-PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-MODULE"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"))), (SubLObject)sbhl_search_vars.T, (SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"))));
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*GENL-INVERSE-MODE-P*"))));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START-MARKING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym67$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-MODULE")));
        $sym69$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym70$_SBHL_ADD_UNMARKED_NODE_TO_RESULT_TEST_ = SubLObjectFactory.makeSymbol("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*");
        $sym71$GET_SBHL_MODULE = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE");
        $list72 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $kw73$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $kw74$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$_SBHL_SEARCH_DIRECTION_ = SubLObjectFactory.makeSymbol("*SBHL-SEARCH-DIRECTION*");
        $sym77$WITH_SBHL_SEARCH_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-SEARCH-DIRECTION");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-INDEX-ARG*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)sbhl_search_vars.EQ, (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-DIRECTION*"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-INDEX-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-GATHER-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE"))))));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym82$_SBHL_MAP_FUNCTION_ = SubLObjectFactory.makeSymbol("*SBHL-MAP-FUNCTION*");
        $sym83$_SBHL_UNWIND_FUNCTION_ = SubLObjectFactory.makeSymbol("*SBHL-UNWIND-FUNCTION*");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), (SubLObject)sbhl_search_vars.T));
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), (SubLObject)sbhl_search_vars.NIL));
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), (SubLObject)sbhl_search_vars.NIL));
        $list87 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-PARENT-MARKING*")));
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*"), (SubLObject)sbhl_search_vars.NIL));
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-FINISHED?*"), (SubLObject)sbhl_search_vars.NIL));
        $kw90$GOAL = SubLObjectFactory.makeKeyword("GOAL");
        $kw91$CUTOFF = SubLObjectFactory.makeKeyword("CUTOFF");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-STOP-SEARCH-PATH?*"), (SubLObject)sbhl_search_vars.NIL));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym94$_SBHL_TARGET_NODE_ = SubLObjectFactory.makeSymbol("*SBHL-TARGET-NODE*");
        $sym95$_SBHL_GOAL_NODE_ = SubLObjectFactory.makeSymbol("*SBHL-GOAL-NODE*");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym97$_SBHL_ISA__GOAL_ = SubLObjectFactory.makeSymbol("*SBHL-ISA?-GOAL*");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-RESULT*"));
        $sym100$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym101$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-JUSTIFICATION-RESULT*"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym104$_SBHL_CONSIDER_NODE_FN_ = SubLObjectFactory.makeSymbol("*SBHL-CONSIDER-NODE-FN*");
        $sym105$_SBHL_COMPOSE_FN_ = SubLObjectFactory.makeSymbol("*SBHL-COMPOSE-FN*");
        $sym106$NCONC = SubLObjectFactory.makeSymbol("NCONC");
        $sym107$_SBHL_COMBINE_FN_ = SubLObjectFactory.makeSymbol("*SBHL-COMBINE-FN*");
        $sym108$_SBHL_MAP_TEST_FN_ = SubLObjectFactory.makeSymbol("*SBHL-MAP-TEST-FN*");
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-ACCESSED-GATHER-NODES*"), (SubLObject)sbhl_search_vars.NIL));
        $sym110$_SBHL_DEPENDENTS_CUT_NODE_ = SubLObjectFactory.makeSymbol("*SBHL-DEPENDENTS-CUT-NODE*");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym112$_SBHL_ACCESS_ARG_ = SubLObjectFactory.makeSymbol("*SBHL-ACCESS-ARG*");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym114$_SBHL_REFERENT_ = SubLObjectFactory.makeSymbol("*SBHL-REFERENT*");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE"))));
        $sym116$QUEUE = SubLObjectFactory.makeUninternedSymbol("QUEUE");
        $sym117$ENQUEUE = SubLObjectFactory.makeSymbol("ENQUEUE");
        $list118 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-QUEUE")));
        $sym119$_SBHL_SAMPLE_LEAF_QUEUES_ = SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*");
        $sym120$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list121 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym122$QUEUE = SubLObjectFactory.makeUninternedSymbol("QUEUE");
        $sym123$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym124$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym125$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $list126 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*")));
        $sym127$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym128$QUEUE_ELEMENTS = SubLObjectFactory.makeSymbol("QUEUE-ELEMENTS");
        $sym129$WITH_NEW_SBHL_LEAF_QUEUE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-LEAF-QUEUE");
        $sym130$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $list131 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LAST"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"));
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"));
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));
        $sym134$DEQUEUE = SubLObjectFactory.makeSymbol("DEQUEUE");
        $list135 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-IF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE-EMPTY-P")), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));
        $sym136$_SBHL_EXTREMAL_TEST_FN_ = SubLObjectFactory.makeSymbol("*SBHL-EXTREMAL-TEST-FN*");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*"), (SubLObject)sbhl_search_vars.T));
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GOAL-SPACE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym139$_SBHL_PRECOMPUTED_GOAL_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-PRECOMPUTED-GOAL-SPACE*");
        $list140 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-TRUTH*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"))));
        $list141 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SEARCH-TRUTH*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"))));
        $list142 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultTrue")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultFalse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArbitraryTruth-JustificationTruth")));
        $const143$True_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True-JustificationTruth"));
        $const144$False_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False-JustificationTruth"));
        $const145$MonotonicallyTrue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue"));
        $const146$DefaultTrue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultTrue"));
        $const147$ArbitraryTruth_JustifactionTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArbitraryTruth-JustifactionTruth"));
        $const148$ArbitraryTruth_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArbitraryTruth-JustificationTruth"));
        $const149$MonotonicallyFalse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse"));
        $const150$DefaultFalse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultFalse"));
        $const151$JustifactionTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("JustifactionTruth"));
        $const152$Unknown_JustificationTruth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unknown-JustificationTruth"));
        $kw153$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str154$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym155$SBHL_SEARCH_TRUTH_VALUE_P = SubLObjectFactory.makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");
        $kw156$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str157$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw158$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str159$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str160$Expected_true_or_false_sbhl_truth = SubLObjectFactory.makeString("Expected true or false sbhl truth value. tv: ~a~%");
        $kw161$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw162$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str163$unknown_truth_value_for_translati = SubLObjectFactory.makeString("unknown truth value for translation: ~a");
        $kw164$TRUE_MON = SubLObjectFactory.makeKeyword("TRUE-MON");
        $kw165$TRUE_DEF = SubLObjectFactory.makeKeyword("TRUE-DEF");
        $kw166$FALSE_MON = SubLObjectFactory.makeKeyword("FALSE-MON");
        $kw167$FALSE_DEF = SubLObjectFactory.makeKeyword("FALSE-DEF");
        $str168$Cannot_translate__s_truth_to_an_s = SubLObjectFactory.makeString("Cannot translate ~s truth to an sbhl-tv");
        $sym169$_RELEVANT_SBHL_TV_FUNCTION_ = SubLObjectFactory.makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*");
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-TV"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym171$_SBHL_TV_ = SubLObjectFactory.makeSymbol("*SBHL-TV*");
        $sym172$WITH_SBHL_TV_FUNCTION = SubLObjectFactory.makeSymbol("WITH-SBHL-TV-FUNCTION");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-EVERYTHING"));
        $list174 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV"));
        $sym175$WITH_SBHL_TV = SubLObjectFactory.makeSymbol("WITH-SBHL-TV");
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-EQ"));
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TV"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym178$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $sym179$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TV*"));
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV")), (SubLObject)SubLObjectFactory.makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*"));
        $sym182$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym183$SBHL_CHECK_TYPE = SubLObjectFactory.makeSymbol("SBHL-CHECK-TYPE");
        $list184 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P"));
        $sym185$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $list186 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-TRUE-TV")));
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P"));
        $sym188$TV_VAR = SubLObjectFactory.makeUninternedSymbol("TV-VAR");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-FALSE-TV")));
        $list190 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-FALSE-TV-P"));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym192$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
    }
    
    public static final class $relevant_sbhl_tv_is_general_tv$UnaryFunction extends UnaryFunction
    {
        public $relevant_sbhl_tv_is_general_tv$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RELEVANT-SBHL-TV-IS-GENERAL-TV"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_search_vars.relevant_sbhl_tv_is_general_tv(arg1);
        }
    }
}

/*

	Total time: 464 ms
	
*/