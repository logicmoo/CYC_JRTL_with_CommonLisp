package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gt_vars";
    public static final String myFingerPrint = "0c532b9731ef46bee9d9391f28a27653672de74600354b652fac5a797a0ac394";
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 526L)
    public static SubLSymbol $gt_dispatch_table$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 4824L)
    public static SubLSymbol $gt_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 4920L)
    public static SubLSymbol $gt_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5063L)
    public static SubLSymbol $transitivity_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5170L)
    public static SubLSymbol $gt_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5246L)
    public static SubLSymbol $gt_index$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5322L)
    public static SubLSymbol $gt_gather$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5422L)
    public static SubLSymbol $gt_index_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5501L)
    public static SubLSymbol $gt_gather_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5582L)
    public static SubLSymbol $gt_accessors$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5651L)
    public static SubLSymbol $gt_link_type$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5723L)
    public static SubLSymbol $gt_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5806L)
    public static SubLSymbol $gt_modes$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 5933L)
    public static SubLSymbol $gt_truth$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6018L)
    public static SubLSymbol $gt_query$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6099L)
    public static SubLSymbol $gt_doneP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6161L)
    public static SubLSymbol $gt_searchedP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6244L)
    public static SubLSymbol $gt_target$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6302L)
    public static SubLSymbol $gt_result$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6371L)
    public static SubLSymbol $gt_searcher$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6455L)
    public static SubLSymbol $gt_base_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6537L)
    public static SubLSymbol $gt_step_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6634L)
    public static SubLSymbol $gt_compose_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6728L)
    public static SubLSymbol $gt_gather_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6820L)
    public static SubLSymbol $gt_combine_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 6931L)
    public static SubLSymbol $gt_compare_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7034L)
    public static SubLSymbol $gt_equality_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7152L)
    public static SubLSymbol $gt_compose_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7245L)
    public static SubLSymbol $gt_compose_index_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7350L)
    public static SubLSymbol $gt_compose_gather_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7457L)
    public static SubLSymbol $gt_max_nodes_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7556L)
    public static SubLSymbol $gt_use_spec_predsP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7629L)
    public static SubLSymbol $gt_handle_non_transitive_predicateP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7743L)
    public static SubLSymbol $gt_link_support$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8683L)
    public static SubLSymbol $gt_what_mts_result$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8793L)
    public static SubLSymbol $gt_what_mts_goal_node$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8868L)
    public static SubLSymbol $gt_path_list_of_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8939L)
    public static SubLSymbol $gt_path_list_of_nodes$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9037L)
    public static SubLSymbol $gt_path_length$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9096L)
    public static SubLSymbol $gt_list_of_path_lengths$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9170L)
    public static SubLSymbol $gt_marking_table$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9327L)
    public static SubLSymbol $gt_target_marking_table$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9409L)
    public static SubLSymbol $gt_depth_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9540L)
    public static SubLSymbol $gt_depth_cutoffP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9622L)
    public static SubLSymbol $gt_prev_depth_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9724L)
    public static SubLSymbol $gt_time_cutoffP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9830L)
    public static SubLSymbol $gt_time_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9904L)
    public static SubLSymbol $gt_initial_time$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 9965L)
    public static SubLSymbol $gt_answers_cutoffP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10090L)
    public static SubLSymbol $gt_answers_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10178L)
    public static SubLSymbol $gt_answers_so_far$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10255L)
    public static SubLSymbol $gt_goal_node$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10323L)
    public static SubLSymbol $gt_edge_list$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10398L)
    public static SubLSymbol $gt_edge_list_returnP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10466L)
    public static SubLSymbol $gt_path_list_of_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10560L)
    public static SubLSymbol $gt_cyclical_edges$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10741L)
    public static SubLSymbol $gt_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 10900L)
    public static SubLSymbol $gt_test_level$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11008L)
    public static SubLSymbol $suspend_gt_type_checkingP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11093L)
    public static SubLSymbol $gt_warnings$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11239L)
    public static SubLSymbol $gt_use_sksiP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 13658L)
    public static SubLSymbol $tt_dispatch_table$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15102L)
    public static SubLSymbol $tt_methods$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15198L)
    public static SubLSymbol $transfers_through_modules$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15314L)
    public static SubLSymbol $tt_parameters$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15500L)
    public static SubLSymbol $tt_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15576L)
    public static SubLSymbol $tt_index$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15652L)
    public static SubLSymbol $tt_gather$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15752L)
    public static SubLSymbol $tt_index_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15831L)
    public static SubLSymbol $tt_gather_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15912L)
    public static SubLSymbol $tt_truth$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 15997L)
    public static SubLSymbol $tt_step_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 16087L)
    public static SubLSymbol $tt_transitive_conduitP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 22655L)
    public static SubLSymbol $gt_transitive_via_arg_activeP$;
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 22783L)
    public static SubLSymbol $gt_within_transitive_via_argP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$_GT_DISPATCH_TABLE_;
    private static final SubLSymbol $sym2$CAR;
    private static final SubLSymbol $sym3$_GT_METHODS_;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$_GT_PARAMETERS_;
    private static final SubLSymbol $sym6$_TRANSITIVITY_MODULES_;
    private static final SubLSymbol $sym7$_GT_PRED_;
    private static final SubLSymbol $sym8$_GT_INDEX_;
    private static final SubLSymbol $sym9$_GT_GATHER_;
    private static final SubLSymbol $sym10$_GT_INDEX_ARG_;
    private static final SubLSymbol $sym11$_GT_GATHER_ARG_;
    private static final SubLSymbol $sym12$_GT_ACCESSORS_;
    private static final SubLSymbol $kw13$ASSERTION;
    private static final SubLSymbol $sym14$_GT_LINK_TYPE_;
    private static final SubLSymbol $kw15$SUPERIOR;
    private static final SubLSymbol $sym16$_GT_MODE_;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_GT_MODES_;
    private static final SubLSymbol $kw19$TRUE;
    private static final SubLSymbol $sym20$_GT_TRUTH_;
    private static final SubLSymbol $sym21$_GT_QUERY_;
    private static final SubLSymbol $sym22$_GT_DONE__;
    private static final SubLSymbol $sym23$_GT_SEARCHED__;
    private static final SubLSymbol $sym24$_GT_TARGET_;
    private static final SubLSymbol $sym25$_GT_RESULT_;
    private static final SubLSymbol $sym26$_GT_SEARCHER_;
    private static final SubLSymbol $sym27$_GT_BASE_FN_;
    private static final SubLSymbol $sym28$_GT_STEP_FN_;
    private static final SubLSymbol $sym29$_GT_COMPOSE_FN_;
    private static final SubLSymbol $sym30$_GT_GATHER_FN_;
    private static final SubLSymbol $sym31$NCONC;
    private static final SubLSymbol $sym32$_GT_COMBINE_FN_;
    private static final SubLSymbol $sym33$_GT_COMPARE_FN_;
    private static final SubLSymbol $sym34$_GT_EQUALITY_FN_;
    private static final SubLSymbol $sym35$_GT_COMPOSE_PRED_;
    private static final SubLSymbol $sym36$_GT_COMPOSE_INDEX_ARG_;
    private static final SubLSymbol $sym37$_GT_COMPOSE_GATHER_ARG_;
    private static final SubLSymbol $kw38$DOWN;
    private static final SubLSymbol $sym39$_GT_MAX_NODES_DIRECTION_;
    private static final SubLSymbol $sym40$_GT_USE_SPEC_PREDS__;
    private static final SubLSymbol $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__;
    private static final SubLString $str42$Current_link_support__a_is_not_a_;
    private static final SubLString $str43$Current_link_support__a_is_not_a_;
    private static final SubLSymbol $sym44$_GT_WHAT_MTS_RESULT_;
    private static final SubLSymbol $sym45$_GT_WHAT_MTS_GOAL_NODE_;
    private static final SubLSymbol $sym46$_GT_PATH_LIST_OF_MTS_;
    private static final SubLSymbol $sym47$_GT_PATH_LIST_OF_NODES_;
    private static final SubLSymbol $sym48$_GT_PATH_LENGTH_;
    private static final SubLSymbol $sym49$_GT_LIST_OF_PATH_LENGTHS_;
    private static final SubLSymbol $sym50$_GT_MARKING_TABLE_;
    private static final SubLSymbol $sym51$_GT_TARGET_MARKING_TABLE_;
    private static final SubLSymbol $sym52$_GT_DEPTH_CUTOFF_;
    private static final SubLSymbol $sym53$_GT_DEPTH_CUTOFF__;
    private static final SubLSymbol $sym54$_GT_PREV_DEPTH_CUTOFF_;
    private static final SubLSymbol $sym55$_GT_TIME_CUTOFF__;
    private static final SubLSymbol $sym56$_GT_TIME_CUTOFF_;
    private static final SubLSymbol $sym57$_GT_INITIAL_TIME_;
    private static final SubLSymbol $sym58$_GT_ANSWERS_CUTOFF__;
    private static final SubLSymbol $sym59$_GT_ANSWERS_CUTOFF_;
    private static final SubLSymbol $sym60$_GT_ANSWERS_SO_FAR_;
    private static final SubLSymbol $sym61$_GT_GOAL_NODE_;
    private static final SubLSymbol $sym62$_GT_EDGE_LIST_;
    private static final SubLSymbol $sym63$_GT_EDGE_LIST_RETURN__;
    private static final SubLSymbol $sym64$_GT_PATH_LIST_OF_ASSERTIONS_;
    private static final SubLSymbol $sym65$_GT_CYCLICAL_EDGES_;
    private static final SubLSymbol $sym66$_GT_TRACE_LEVEL_;
    private static final SubLSymbol $sym67$_GT_TEST_LEVEL_;
    private static final SubLSymbol $sym68$_SUSPEND_GT_TYPE_CHECKING__;
    private static final SubLSymbol $sym69$_GT_WARNINGS_;
    private static final SubLSymbol $sym70$_GT_USE_SKSI__;
    private static final SubLList $list71;
    private static final SubLSymbol $kw72$ACCESSORS;
    private static final SubLSymbol $kw73$PREDICATE;
    private static final SubLSymbol $kw74$INDEX_ARG;
    private static final SubLSymbol $kw75$GATHER_ARG;
    private static final SubLSymbol $kw76$MT;
    private static final SubLSymbol $sym77$DEFINE;
    private static final SubLSymbol $sym78$CLET;
    private static final SubLList $list79;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$CSETQ;
    private static final SubLSymbol $sym83$RESULT;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$QUOTE;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$PROGN;
    private static final SubLSymbol $sym88$SETUP_TRANSITIVITY_MODULE;
    private static final SubLSymbol $sym89$CPUSHNEW;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLSymbol $sym92$_TT_DISPATCH_TABLE_;
    private static final SubLSymbol $sym93$_TT_METHODS_;
    private static final SubLSymbol $sym94$_TRANSFERS_THROUGH_MODULES_;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$_TT_PARAMETERS_;
    private static final SubLSymbol $sym97$_TT_PRED_;
    private static final SubLSymbol $sym98$_TT_INDEX_;
    private static final SubLSymbol $sym99$_TT_GATHER_;
    private static final SubLSymbol $sym100$_TT_INDEX_ARG_;
    private static final SubLSymbol $sym101$_TT_GATHER_ARG_;
    private static final SubLSymbol $sym102$_TT_TRUTH_;
    private static final SubLSymbol $sym103$_TT_STEP_FN_;
    private static final SubLSymbol $sym104$_TT_TRANSITIVE_CONDUIT__;
    private static final SubLSymbol $kw105$CONDUIT_PRED;
    private static final SubLSymbol $sym106$TRANSITIVE_PREDICATE_;
    private static final SubLSymbol $sym107$GENERIC_TTM;
    private static final SubLSymbol $sym108$SETUP_TRANSFERS_THROUGH_MODULE;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__;
    private static final SubLSymbol $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__;
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7873L)
    public static SubLObject gt_link_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gt_vars.$gt_link_support$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 7938L)
    public static SubLObject gt_link_mt() {
        final SubLObject link_support = gt_link_support();
        if (gt_vars.NIL != assertion_handles.assertion_p(link_support)) {
            return assertions_high.assertion_mt(link_support);
        }
        if (gt_vars.NIL != arguments.hl_support_p(link_support)) {
            return arguments.support_mt(link_support);
        }
        return gt_utilities.gt_error((SubLObject)gt_vars.ONE_INTEGER, (SubLObject)gt_vars.$str42$Current_link_support__a_is_not_a_, link_support, (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 8297L)
    public static SubLObject gt_link_pred() {
        final SubLObject link_support = gt_link_support();
        if (gt_vars.NIL != assertions_high.gaf_assertionP(link_support)) {
            return assertions_high.gaf_arg0(link_support);
        }
        if (gt_vars.NIL != arguments.hl_support_p(link_support)) {
            return cycl_utilities.formula_arg0(arguments.support_formula(link_support));
        }
        return gt_utilities.gt_error((SubLObject)gt_vars.ONE_INTEGER, (SubLObject)gt_vars.$str43$Current_link_support__a_is_not_a_, link_support, (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11239L)
    public static SubLObject gt_use_sksiP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(gt_vars.NIL != gt_vars.$gt_use_sksiP$.getDynamicValue(thread) && gt_vars.NIL != sksi_query_utilities.some_sksi_removal_module_registeredP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 11593L)
    public static SubLObject transitivity_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)gt_vars.NIL;
        SubLObject plist = (SubLObject)gt_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        plist = current.first();
        current = current.rest();
        if (gt_vars.NIL == current) {
            SubLObject method_forms = (SubLObject)gt_vars.NIL;
            if (plist.isCons()) {
                SubLObject accessors = conses_high.getf(plist, (SubLObject)gt_vars.$kw72$ACCESSORS, (SubLObject)gt_vars.UNPROVIDED);
                SubLObject predicate = conses_high.getf(plist, (SubLObject)gt_vars.$kw73$PREDICATE, (SubLObject)gt_vars.UNPROVIDED);
                SubLObject index_arg = conses_high.getf(plist, (SubLObject)gt_vars.$kw74$INDEX_ARG, (SubLObject)gt_vars.UNPROVIDED);
                SubLObject gather_arg = conses_high.getf(plist, (SubLObject)gt_vars.$kw75$GATHER_ARG, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject gtmt = conses_high.getf(plist, (SubLObject)gt_vars.$kw76$MT, (SubLObject)gt_vars.UNPROVIDED);
                SubLObject mode = (SubLObject)gt_vars.$kw72$ACCESSORS;
                if (gt_vars.NIL == index_arg) {
                    index_arg = (SubLObject)gt_vars.ONE_INTEGER;
                }
                if (gt_vars.NIL == gather_arg) {
                    gather_arg = (SubLObject)gt_vars.TWO_INTEGER;
                }
                if (!accessors.isCons()) {
                    accessors = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(predicate, index_arg, gather_arg));
                }
                if (accessors.isCons() && gt_vars.NIL == accessors.rest()) {
                    mode = (SubLObject)gt_vars.$kw73$PREDICATE;
                    predicate = accessors.first().first();
                    index_arg = conses_high.second(accessors.first());
                    gather_arg = conses_high.third(accessors.first());
                }
                SubLObject parameters = (SubLObject)gt_vars.NIL;
                SubLObject parameter = (SubLObject)gt_vars.NIL;
                parameters = plist;
                parameter = parameters.first();
                while (gt_vars.NIL != parameters) {
                    if (gt_vars.NIL != subl_promotions.memberP(parameter, gt_vars.$gt_methods$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)) {
                        final SubLObject function = Packages.intern(string_utilities.str(conses_high.second(parameters)), (SubLObject)gt_vars.UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(gtmt, conses_high.third(conses_high.assoc(parameter, gt_vars.$gt_dispatch_table$.getGlobalValue(), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject gt_function = conses_high.second(conses_high.assoc(parameter, gt_vars.$gt_dispatch_table$.getGlobalValue(), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED));
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql((SubLObject)gt_vars.$kw73$PREDICATE)) {
                            method_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym77$DEFINE, function, arg_list, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym78$CLET, (SubLObject)gt_vars.$list79, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym78$CLET, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym7$_GT_PRED_, predicate), (SubLObject)gt_vars.$list80, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym10$_GT_INDEX_ARG_, index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym11$_GT_GATHER_ARG_, gather_arg), (SubLObject)gt_vars.$list81), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym82$CSETQ, (SubLObject)gt_vars.$sym83$RESULT, reader.bq_cons(gt_function, ConsesLow.append(args, (SubLObject)gt_vars.NIL)))), (SubLObject)gt_vars.$list84)), method_forms);
                        }
                        else if (pcase_var.eql((SubLObject)gt_vars.$kw72$ACCESSORS)) {
                            method_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym77$DEFINE, function, arg_list, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym78$CLET, (SubLObject)gt_vars.$list79, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym78$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym12$_GT_ACCESSORS_, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym85$QUOTE, accessors)), (SubLObject)gt_vars.$list86), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym82$CSETQ, (SubLObject)gt_vars.$sym83$RESULT, reader.bq_cons(gt_function, ConsesLow.append(args, (SubLObject)gt_vars.NIL)))), (SubLObject)gt_vars.$list84)), method_forms);
                        }
                    }
                    parameters = conses_high.cddr(parameters);
                    parameter = parameters.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym87$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym88$SETUP_TRANSITIVITY_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym85$QUOTE, plist)), (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym89$CPUSHNEW, module, (SubLObject)gt_vars.$list90), ConsesLow.append(method_forms, (SubLObject)gt_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_vars.$list71);
        return (SubLObject)gt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 16178L)
    public static SubLObject tt_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)gt_vars.NIL;
        SubLObject plist = (SubLObject)gt_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        plist = current.first();
        current = current.rest();
        if (gt_vars.NIL == current) {
            SubLObject method_forms = (SubLObject)gt_vars.NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw73$PREDICATE, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject gt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw105$CONDUIT_PRED, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject ttmt = conses_high.getf(plist, (SubLObject)gt_vars.$kw76$MT, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject mode = (SubLObject)gt_vars.$kw73$PREDICATE;
                final SubLObject tt_index_arg = (SubLObject)gt_vars.TWO_INTEGER;
                final SubLObject tt_gather_arg = (SubLObject)gt_vars.ONE_INTEGER;
                final SubLObject gt_index_arg = (SubLObject)gt_vars.ONE_INTEGER;
                final SubLObject gt_gather_arg = (SubLObject)gt_vars.TWO_INTEGER;
                SubLObject parameters = (SubLObject)gt_vars.NIL;
                SubLObject parameter = (SubLObject)gt_vars.NIL;
                parameters = plist;
                parameter = parameters.first();
                while (gt_vars.NIL != parameters) {
                    if (gt_vars.NIL != subl_promotions.memberP(parameter, gt_vars.$tt_methods$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)) {
                        final SubLObject function = Packages.intern(string_utilities.str(conses_high.second(parameters)), (SubLObject)gt_vars.UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, conses_high.third(conses_high.assoc(parameter, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql((SubLObject)gt_vars.$kw73$PREDICATE)) {
                            method_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym77$DEFINE, function, arg_list, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym78$CLET, (SubLObject)gt_vars.$list79, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym78$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym97$_TT_PRED_, tt_pred), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym7$_GT_PRED_, gt_pred), (SubLObject)gt_vars.$list80, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym100$_TT_INDEX_ARG_, tt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym101$_TT_GATHER_ARG_, tt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym10$_GT_INDEX_ARG_, gt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym11$_GT_GATHER_ARG_, gt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym104$_TT_TRANSITIVE_CONDUIT__, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym106$TRANSITIVE_PREDICATE_, gt_pred))), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym82$CSETQ, (SubLObject)gt_vars.$sym83$RESULT, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym107$GENERIC_TTM, method, ConsesLow.append(args, (SubLObject)gt_vars.NIL)))), (SubLObject)gt_vars.$list84)), method_forms);
                        }
                    }
                    parameters = conses_high.cddr(parameters);
                    parameter = parameters.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym87$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym85$QUOTE, plist)), (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym89$CPUSHNEW, module, (SubLObject)gt_vars.$list109), ConsesLow.append(method_forms, (SubLObject)gt_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_vars.$list71);
        return (SubLObject)gt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 17867L)
    public static SubLObject itt_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)gt_vars.NIL;
        SubLObject plist = (SubLObject)gt_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        plist = current.first();
        current = current.rest();
        if (gt_vars.NIL == current) {
            SubLObject method_forms = (SubLObject)gt_vars.NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw73$PREDICATE, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject gt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw105$CONDUIT_PRED, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject ttmt = conses_high.getf(plist, (SubLObject)gt_vars.$kw76$MT, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject mode = (SubLObject)gt_vars.$kw73$PREDICATE;
                final SubLObject tt_index_arg = (SubLObject)gt_vars.ONE_INTEGER;
                final SubLObject tt_gather_arg = (SubLObject)gt_vars.TWO_INTEGER;
                final SubLObject gt_index_arg = (SubLObject)gt_vars.ONE_INTEGER;
                final SubLObject gt_gather_arg = (SubLObject)gt_vars.TWO_INTEGER;
                SubLObject parameters = (SubLObject)gt_vars.NIL;
                SubLObject parameter = (SubLObject)gt_vars.NIL;
                parameters = plist;
                parameter = parameters.first();
                while (gt_vars.NIL != parameters) {
                    if (gt_vars.NIL != subl_promotions.memberP(parameter, gt_vars.$tt_methods$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)) {
                        final SubLObject function = Packages.intern(string_utilities.str(conses_high.second(parameters)), (SubLObject)gt_vars.UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, conses_high.third(conses_high.assoc(parameter, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql((SubLObject)gt_vars.$kw73$PREDICATE)) {
                            method_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym77$DEFINE, function, arg_list, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym78$CLET, (SubLObject)gt_vars.$list79, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym78$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym97$_TT_PRED_, tt_pred), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym7$_GT_PRED_, gt_pred), (SubLObject)gt_vars.$list80, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym100$_TT_INDEX_ARG_, tt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym101$_TT_GATHER_ARG_, tt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym10$_GT_INDEX_ARG_, gt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym11$_GT_GATHER_ARG_, gt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym104$_TT_TRANSITIVE_CONDUIT__, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym106$TRANSITIVE_PREDICATE_, gt_pred))), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym82$CSETQ, (SubLObject)gt_vars.$sym83$RESULT, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym107$GENERIC_TTM, method, ConsesLow.append(args, (SubLObject)gt_vars.NIL)))), (SubLObject)gt_vars.$list84)), method_forms);
                        }
                    }
                    parameters = conses_high.cddr(parameters);
                    parameter = parameters.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym87$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym85$QUOTE, plist)), (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym89$CPUSHNEW, module, (SubLObject)gt_vars.$list109), ConsesLow.append(method_forms, (SubLObject)gt_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_vars.$list71);
        return (SubLObject)gt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 19386L)
    public static SubLObject tti_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)gt_vars.NIL;
        SubLObject plist = (SubLObject)gt_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        plist = current.first();
        current = current.rest();
        if (gt_vars.NIL == current) {
            SubLObject method_forms = (SubLObject)gt_vars.NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw73$PREDICATE, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject gt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw105$CONDUIT_PRED, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject ttmt = conses_high.getf(plist, (SubLObject)gt_vars.$kw76$MT, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject mode = (SubLObject)gt_vars.$kw73$PREDICATE;
                final SubLObject tt_index_arg = (SubLObject)gt_vars.TWO_INTEGER;
                final SubLObject tt_gather_arg = (SubLObject)gt_vars.ONE_INTEGER;
                final SubLObject gt_index_arg = (SubLObject)gt_vars.TWO_INTEGER;
                final SubLObject gt_gather_arg = (SubLObject)gt_vars.ONE_INTEGER;
                SubLObject parameters = (SubLObject)gt_vars.NIL;
                SubLObject parameter = (SubLObject)gt_vars.NIL;
                parameters = plist;
                parameter = parameters.first();
                while (gt_vars.NIL != parameters) {
                    if (gt_vars.NIL != subl_promotions.memberP(parameter, gt_vars.$tt_methods$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)) {
                        final SubLObject function = Packages.intern(string_utilities.str(conses_high.second(parameters)), (SubLObject)gt_vars.UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, conses_high.third(conses_high.assoc(parameter, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql((SubLObject)gt_vars.$kw73$PREDICATE)) {
                            method_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym77$DEFINE, function, arg_list, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym78$CLET, (SubLObject)gt_vars.$list79, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym78$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym97$_TT_PRED_, tt_pred), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym7$_GT_PRED_, gt_pred), (SubLObject)gt_vars.$list80, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym100$_TT_INDEX_ARG_, tt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym101$_TT_GATHER_ARG_, tt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym10$_GT_INDEX_ARG_, gt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym11$_GT_GATHER_ARG_, gt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym104$_TT_TRANSITIVE_CONDUIT__, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym106$TRANSITIVE_PREDICATE_, gt_pred))), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym82$CSETQ, (SubLObject)gt_vars.$sym83$RESULT, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym107$GENERIC_TTM, method, ConsesLow.append(args, (SubLObject)gt_vars.NIL)))), (SubLObject)gt_vars.$list84)), method_forms);
                        }
                    }
                    parameters = conses_high.cddr(parameters);
                    parameter = parameters.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym87$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym85$QUOTE, plist)), (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym89$CPUSHNEW, module, (SubLObject)gt_vars.$list109), ConsesLow.append(method_forms, (SubLObject)gt_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_vars.$list71);
        return (SubLObject)gt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 21020L)
    public static SubLObject itti_module(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)gt_vars.NIL;
        SubLObject plist = (SubLObject)gt_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        module = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_vars.$list71);
        plist = current.first();
        current = current.rest();
        if (gt_vars.NIL == current) {
            SubLObject method_forms = (SubLObject)gt_vars.NIL;
            if (plist.isCons()) {
                final SubLObject tt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw73$PREDICATE, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject gt_pred = conses_high.getf(plist, (SubLObject)gt_vars.$kw105$CONDUIT_PRED, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject ttmt = conses_high.getf(plist, (SubLObject)gt_vars.$kw76$MT, (SubLObject)gt_vars.UNPROVIDED);
                final SubLObject mode = (SubLObject)gt_vars.$kw73$PREDICATE;
                final SubLObject tt_index_arg = (SubLObject)gt_vars.ONE_INTEGER;
                final SubLObject tt_gather_arg = (SubLObject)gt_vars.TWO_INTEGER;
                final SubLObject gt_index_arg = (SubLObject)gt_vars.TWO_INTEGER;
                final SubLObject gt_gather_arg = (SubLObject)gt_vars.ONE_INTEGER;
                SubLObject parameters = (SubLObject)gt_vars.NIL;
                SubLObject parameter = (SubLObject)gt_vars.NIL;
                parameters = plist;
                parameter = parameters.first();
                while (gt_vars.NIL != parameters) {
                    if (gt_vars.NIL != subl_promotions.memberP(parameter, gt_vars.$tt_methods$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)) {
                        final SubLObject function = Packages.intern(string_utilities.str(conses_high.second(parameters)), (SubLObject)gt_vars.UNPROVIDED);
                        final SubLObject arg_list = transitivity.add_mt_default(ttmt, conses_high.third(conses_high.assoc(parameter, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)gt_vars.UNPROVIDED, (SubLObject)gt_vars.UNPROVIDED)));
                        final SubLObject args = list_utilities.args_from_arg_list(arg_list);
                        final SubLObject method = parameter;
                        final SubLObject pcase_var = mode;
                        if (pcase_var.eql((SubLObject)gt_vars.$kw73$PREDICATE)) {
                            method_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym77$DEFINE, function, arg_list, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym78$CLET, (SubLObject)gt_vars.$list79, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym78$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym97$_TT_PRED_, tt_pred), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym7$_GT_PRED_, gt_pred), (SubLObject)gt_vars.$list80, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym100$_TT_INDEX_ARG_, tt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym101$_TT_GATHER_ARG_, tt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym10$_GT_INDEX_ARG_, gt_index_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym11$_GT_GATHER_ARG_, gt_gather_arg), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym104$_TT_TRANSITIVE_CONDUIT__, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym106$TRANSITIVE_PREDICATE_, gt_pred))), (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym82$CSETQ, (SubLObject)gt_vars.$sym83$RESULT, (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym107$GENERIC_TTM, method, ConsesLow.append(args, (SubLObject)gt_vars.NIL)))), (SubLObject)gt_vars.$list84)), method_forms);
                        }
                    }
                    parameters = conses_high.cddr(parameters);
                    parameter = parameters.first();
                }
            }
            return (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym87$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym108$SETUP_TRANSFERS_THROUGH_MODULE, module, (SubLObject)ConsesLow.list((SubLObject)gt_vars.$sym85$QUOTE, plist)), (SubLObject)ConsesLow.listS((SubLObject)gt_vars.$sym89$CPUSHNEW, module, (SubLObject)gt_vars.$list109), ConsesLow.append(method_forms, (SubLObject)gt_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_vars.$list71);
        return (SubLObject)gt_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-vars.lisp", position = 22892L)
    public static SubLObject gt_within_transitive_via_argP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gt_vars.$gt_within_transitive_via_argP$.getDynamicValue(thread);
    }
    
    public static SubLObject declare_gt_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_vars", "gt_link_support", "GT-LINK-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_vars", "gt_link_mt", "GT-LINK-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_vars", "gt_link_pred", "GT-LINK-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_vars", "gt_use_sksiP", "GT-USE-SKSI?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_vars", "transitivity_module", "TRANSITIVITY-MODULE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_vars", "tt_module", "TT-MODULE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_vars", "itt_module", "ITT-MODULE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_vars", "tti_module", "TTI-MODULE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_vars", "itti_module", "ITTI-MODULE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_vars", "gt_within_transitive_via_argP", "GT-WITHIN-TRANSITIVE-VIA-ARG?", 0, 0, false);
        return (SubLObject)gt_vars.NIL;
    }
    
    public static SubLObject init_gt_vars_file() {
        gt_vars.$gt_dispatch_table$ = SubLFiles.deflexical("*GT-DISPATCH-TABLE*", (SubLObject)gt_vars.$list0);
        gt_vars.$gt_methods$ = SubLFiles.defparameter("*GT-METHODS*", Mapping.mapcar(Symbols.symbol_function((SubLObject)gt_vars.$sym2$CAR), gt_vars.$gt_dispatch_table$.getGlobalValue()));
        gt_vars.$gt_parameters$ = SubLFiles.defparameter("*GT-PARAMETERS*", ConsesLow.append((SubLObject)gt_vars.$list4, gt_vars.$gt_methods$.getDynamicValue()));
        gt_vars.$transitivity_modules$ = SubLFiles.defparameter("*TRANSITIVITY-MODULES*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_pred$ = SubLFiles.defparameter("*GT-PRED*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_index$ = SubLFiles.defparameter("*GT-INDEX*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_gather$ = SubLFiles.defparameter("*GT-GATHER*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_index_arg$ = SubLFiles.defparameter("*GT-INDEX-ARG*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$gt_gather_arg$ = SubLFiles.defparameter("*GT-GATHER-ARG*", (SubLObject)gt_vars.TWO_INTEGER);
        gt_vars.$gt_accessors$ = SubLFiles.defparameter("*GT-ACCESSORS*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_link_type$ = SubLFiles.defparameter("*GT-LINK-TYPE*", (SubLObject)gt_vars.$kw13$ASSERTION);
        gt_vars.$gt_mode$ = SubLFiles.defparameter("*GT-MODE*", (SubLObject)gt_vars.$kw15$SUPERIOR);
        gt_vars.$gt_modes$ = SubLFiles.defparameter("*GT-MODES*", (SubLObject)gt_vars.$list17);
        gt_vars.$gt_truth$ = SubLFiles.defparameter("*GT-TRUTH*", (SubLObject)gt_vars.$kw19$TRUE);
        gt_vars.$gt_query$ = SubLFiles.defparameter("*GT-QUERY*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_doneP$ = SubLFiles.defparameter("*GT-DONE?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_searchedP$ = SubLFiles.defparameter("*GT-SEARCHED?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_target$ = SubLFiles.defparameter("*GT-TARGET*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_result$ = SubLFiles.defparameter("*GT-RESULT*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_searcher$ = SubLFiles.defparameter("*GT-SEARCHER*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_base_fn$ = SubLFiles.defparameter("*GT-BASE-FN*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_step_fn$ = SubLFiles.defparameter("*GT-STEP-FN*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_compose_fn$ = SubLFiles.defparameter("*GT-COMPOSE-FN*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_gather_fn$ = SubLFiles.defparameter("*GT-GATHER-FN*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_combine_fn$ = SubLFiles.defparameter("*GT-COMBINE-FN*", Symbols.symbol_function((SubLObject)gt_vars.$sym31$NCONC));
        gt_vars.$gt_compare_fn$ = SubLFiles.defparameter("*GT-COMPARE-FN*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_equality_fn$ = SubLFiles.defparameter("*GT-EQUALITY-FN*", Symbols.symbol_function((SubLObject)gt_vars.EQUAL));
        gt_vars.$gt_compose_pred$ = SubLFiles.defparameter("*GT-COMPOSE-PRED*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_compose_index_arg$ = SubLFiles.defparameter("*GT-COMPOSE-INDEX-ARG*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$gt_compose_gather_arg$ = SubLFiles.defparameter("*GT-COMPOSE-GATHER-ARG*", (SubLObject)gt_vars.TWO_INTEGER);
        gt_vars.$gt_max_nodes_direction$ = SubLFiles.defparameter("*GT-MAX-NODES-DIRECTION*", (SubLObject)gt_vars.$kw38$DOWN);
        gt_vars.$gt_use_spec_predsP$ = SubLFiles.defparameter("*GT-USE-SPEC-PREDS?*", (SubLObject)gt_vars.T);
        gt_vars.$gt_handle_non_transitive_predicateP$ = SubLFiles.defparameter("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_link_support$ = SubLFiles.defparameter("*GT-LINK-SUPPORT*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_what_mts_result$ = SubLFiles.defparameter("*GT-WHAT-MTS-RESULT*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_what_mts_goal_node$ = SubLFiles.defparameter("*GT-WHAT-MTS-GOAL-NODE*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_path_list_of_mts$ = SubLFiles.defparameter("*GT-PATH-LIST-OF-MTS*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_path_list_of_nodes$ = SubLFiles.defparameter("*GT-PATH-LIST-OF-NODES*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_path_length$ = SubLFiles.defparameter("*GT-PATH-LENGTH*", (SubLObject)gt_vars.ZERO_INTEGER);
        gt_vars.$gt_list_of_path_lengths$ = SubLFiles.defparameter("*GT-LIST-OF-PATH-LENGTHS*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_marking_table$ = SubLFiles.defparameter("*GT-MARKING-TABLE*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_target_marking_table$ = SubLFiles.defparameter("*GT-TARGET-MARKING-TABLE*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_depth_cutoff$ = SubLFiles.defparameter("*GT-DEPTH-CUTOFF*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$gt_depth_cutoffP$ = SubLFiles.defparameter("*GT-DEPTH-CUTOFF?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_prev_depth_cutoff$ = SubLFiles.defparameter("*GT-PREV-DEPTH-CUTOFF*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$gt_time_cutoffP$ = SubLFiles.defparameter("*GT-TIME-CUTOFF?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_time_cutoff$ = SubLFiles.defparameter("*GT-TIME-CUTOFF*", (SubLObject)gt_vars.TEN_INTEGER);
        gt_vars.$gt_initial_time$ = SubLFiles.defparameter("*GT-INITIAL-TIME*", (SubLObject)gt_vars.ZERO_INTEGER);
        gt_vars.$gt_answers_cutoffP$ = SubLFiles.defparameter("*GT-ANSWERS-CUTOFF?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_answers_cutoff$ = SubLFiles.defparameter("*GT-ANSWERS-CUTOFF*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$gt_answers_so_far$ = SubLFiles.defparameter("*GT-ANSWERS-SO-FAR*", (SubLObject)gt_vars.ZERO_INTEGER);
        gt_vars.$gt_goal_node$ = SubLFiles.defparameter("*GT-GOAL-NODE*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_edge_list$ = SubLFiles.defparameter("*GT-EDGE-LIST*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_edge_list_returnP$ = SubLFiles.defparameter("*GT-EDGE-LIST-RETURN?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_path_list_of_assertions$ = SubLFiles.defparameter("*GT-PATH-LIST-OF-ASSERTIONS*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_cyclical_edges$ = SubLFiles.defparameter("*GT-CYCLICAL-EDGES*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_trace_level$ = SubLFiles.defparameter("*GT-TRACE-LEVEL*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$gt_test_level$ = SubLFiles.defparameter("*GT-TEST-LEVEL*", (SubLObject)gt_vars.THREE_INTEGER);
        gt_vars.$suspend_gt_type_checkingP$ = SubLFiles.defparameter("*SUSPEND-GT-TYPE-CHECKING?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_warnings$ = SubLFiles.defparameter("*GT-WARNINGS*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_use_sksiP$ = SubLFiles.defparameter("*GT-USE-SKSI?*", (SubLObject)gt_vars.T);
        gt_vars.$tt_dispatch_table$ = SubLFiles.defparameter("*TT-DISPATCH-TABLE*", (SubLObject)gt_vars.$list91);
        gt_vars.$tt_methods$ = SubLFiles.defparameter("*TT-METHODS*", Mapping.mapcar(Symbols.symbol_function((SubLObject)gt_vars.$sym2$CAR), gt_vars.$tt_dispatch_table$.getDynamicValue()));
        gt_vars.$transfers_through_modules$ = SubLFiles.defparameter("*TRANSFERS-THROUGH-MODULES*", (SubLObject)gt_vars.NIL);
        gt_vars.$tt_parameters$ = SubLFiles.defparameter("*TT-PARAMETERS*", ConsesLow.append((SubLObject)gt_vars.$list95, gt_vars.$tt_methods$.getDynamicValue()));
        gt_vars.$tt_pred$ = SubLFiles.defparameter("*TT-PRED*", (SubLObject)gt_vars.NIL);
        gt_vars.$tt_index$ = SubLFiles.defparameter("*TT-INDEX*", (SubLObject)gt_vars.NIL);
        gt_vars.$tt_gather$ = SubLFiles.defparameter("*TT-GATHER*", (SubLObject)gt_vars.NIL);
        gt_vars.$tt_index_arg$ = SubLFiles.defparameter("*TT-INDEX-ARG*", (SubLObject)gt_vars.ONE_INTEGER);
        gt_vars.$tt_gather_arg$ = SubLFiles.defparameter("*TT-GATHER-ARG*", (SubLObject)gt_vars.TWO_INTEGER);
        gt_vars.$tt_truth$ = SubLFiles.defparameter("*TT-TRUTH*", (SubLObject)gt_vars.$kw19$TRUE);
        gt_vars.$tt_step_fn$ = SubLFiles.defparameter("*TT-STEP-FN*", (SubLObject)gt_vars.NIL);
        gt_vars.$tt_transitive_conduitP$ = SubLFiles.defparameter("*TT-TRANSITIVE-CONDUIT?*", (SubLObject)gt_vars.NIL);
        gt_vars.$gt_transitive_via_arg_activeP$ = SubLFiles.defparameter("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*", (SubLObject)gt_vars.T);
        gt_vars.$gt_within_transitive_via_argP$ = SubLFiles.defparameter("*GT-WITHIN-TRANSITIVE-VIA-ARG?*", (SubLObject)gt_vars.NIL);
        return (SubLObject)gt_vars.NIL;
    }
    
    public static SubLObject setup_gt_vars_file() {
        SubLObject item_var = (SubLObject)gt_vars.$sym1$_GT_DISPATCH_TABLE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym3$_GT_METHODS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym5$_GT_PARAMETERS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym6$_TRANSITIVITY_MODULES_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym7$_GT_PRED_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym8$_GT_INDEX_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym9$_GT_GATHER_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym10$_GT_INDEX_ARG_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym11$_GT_GATHER_ARG_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym12$_GT_ACCESSORS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym14$_GT_LINK_TYPE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym16$_GT_MODE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym18$_GT_MODES_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym20$_GT_TRUTH_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym21$_GT_QUERY_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym22$_GT_DONE__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym23$_GT_SEARCHED__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym24$_GT_TARGET_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym25$_GT_RESULT_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym26$_GT_SEARCHER_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym27$_GT_BASE_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym28$_GT_STEP_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym29$_GT_COMPOSE_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym30$_GT_GATHER_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym32$_GT_COMBINE_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym33$_GT_COMPARE_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym34$_GT_EQUALITY_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym35$_GT_COMPOSE_PRED_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym36$_GT_COMPOSE_INDEX_ARG_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym37$_GT_COMPOSE_GATHER_ARG_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym39$_GT_MAX_NODES_DIRECTION_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym40$_GT_USE_SPEC_PREDS__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym44$_GT_WHAT_MTS_RESULT_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym45$_GT_WHAT_MTS_GOAL_NODE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym46$_GT_PATH_LIST_OF_MTS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym47$_GT_PATH_LIST_OF_NODES_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym48$_GT_PATH_LENGTH_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym49$_GT_LIST_OF_PATH_LENGTHS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym50$_GT_MARKING_TABLE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym51$_GT_TARGET_MARKING_TABLE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym52$_GT_DEPTH_CUTOFF_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym53$_GT_DEPTH_CUTOFF__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym54$_GT_PREV_DEPTH_CUTOFF_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym55$_GT_TIME_CUTOFF__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym56$_GT_TIME_CUTOFF_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym57$_GT_INITIAL_TIME_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym58$_GT_ANSWERS_CUTOFF__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym59$_GT_ANSWERS_CUTOFF_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym60$_GT_ANSWERS_SO_FAR_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym61$_GT_GOAL_NODE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym62$_GT_EDGE_LIST_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym63$_GT_EDGE_LIST_RETURN__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym64$_GT_PATH_LIST_OF_ASSERTIONS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym65$_GT_CYCLICAL_EDGES_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym66$_GT_TRACE_LEVEL_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym67$_GT_TEST_LEVEL_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym68$_SUSPEND_GT_TYPE_CHECKING__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym69$_GT_WARNINGS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym70$_GT_USE_SKSI__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym92$_TT_DISPATCH_TABLE_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym93$_TT_METHODS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym94$_TRANSFERS_THROUGH_MODULES_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym96$_TT_PARAMETERS_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym97$_TT_PRED_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym98$_TT_INDEX_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym99$_TT_GATHER_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym100$_TT_INDEX_ARG_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym101$_TT_GATHER_ARG_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym102$_TT_TRUTH_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym103$_TT_STEP_FN_;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym104$_TT_TRANSITIVE_CONDUIT__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)gt_vars.$sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__;
        if (gt_vars.NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)gt_vars.EQL), Symbols.symbol_function((SubLObject)gt_vars.IDENTITY))) {
            utilities_macros.$gt_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
        }
        return (SubLObject)gt_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_gt_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_gt_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_gt_vars_file();
    }
    
    static {
        me = (SubLFile)new gt_vars();
        gt_vars.$gt_dispatch_table$ = null;
        gt_vars.$gt_methods$ = null;
        gt_vars.$gt_parameters$ = null;
        gt_vars.$transitivity_modules$ = null;
        gt_vars.$gt_pred$ = null;
        gt_vars.$gt_index$ = null;
        gt_vars.$gt_gather$ = null;
        gt_vars.$gt_index_arg$ = null;
        gt_vars.$gt_gather_arg$ = null;
        gt_vars.$gt_accessors$ = null;
        gt_vars.$gt_link_type$ = null;
        gt_vars.$gt_mode$ = null;
        gt_vars.$gt_modes$ = null;
        gt_vars.$gt_truth$ = null;
        gt_vars.$gt_query$ = null;
        gt_vars.$gt_doneP$ = null;
        gt_vars.$gt_searchedP$ = null;
        gt_vars.$gt_target$ = null;
        gt_vars.$gt_result$ = null;
        gt_vars.$gt_searcher$ = null;
        gt_vars.$gt_base_fn$ = null;
        gt_vars.$gt_step_fn$ = null;
        gt_vars.$gt_compose_fn$ = null;
        gt_vars.$gt_gather_fn$ = null;
        gt_vars.$gt_combine_fn$ = null;
        gt_vars.$gt_compare_fn$ = null;
        gt_vars.$gt_equality_fn$ = null;
        gt_vars.$gt_compose_pred$ = null;
        gt_vars.$gt_compose_index_arg$ = null;
        gt_vars.$gt_compose_gather_arg$ = null;
        gt_vars.$gt_max_nodes_direction$ = null;
        gt_vars.$gt_use_spec_predsP$ = null;
        gt_vars.$gt_handle_non_transitive_predicateP$ = null;
        gt_vars.$gt_link_support$ = null;
        gt_vars.$gt_what_mts_result$ = null;
        gt_vars.$gt_what_mts_goal_node$ = null;
        gt_vars.$gt_path_list_of_mts$ = null;
        gt_vars.$gt_path_list_of_nodes$ = null;
        gt_vars.$gt_path_length$ = null;
        gt_vars.$gt_list_of_path_lengths$ = null;
        gt_vars.$gt_marking_table$ = null;
        gt_vars.$gt_target_marking_table$ = null;
        gt_vars.$gt_depth_cutoff$ = null;
        gt_vars.$gt_depth_cutoffP$ = null;
        gt_vars.$gt_prev_depth_cutoff$ = null;
        gt_vars.$gt_time_cutoffP$ = null;
        gt_vars.$gt_time_cutoff$ = null;
        gt_vars.$gt_initial_time$ = null;
        gt_vars.$gt_answers_cutoffP$ = null;
        gt_vars.$gt_answers_cutoff$ = null;
        gt_vars.$gt_answers_so_far$ = null;
        gt_vars.$gt_goal_node$ = null;
        gt_vars.$gt_edge_list$ = null;
        gt_vars.$gt_edge_list_returnP$ = null;
        gt_vars.$gt_path_list_of_assertions$ = null;
        gt_vars.$gt_cyclical_edges$ = null;
        gt_vars.$gt_trace_level$ = null;
        gt_vars.$gt_test_level$ = null;
        gt_vars.$suspend_gt_type_checkingP$ = null;
        gt_vars.$gt_warnings$ = null;
        gt_vars.$gt_use_sksiP$ = null;
        gt_vars.$tt_dispatch_table$ = null;
        gt_vars.$tt_methods$ = null;
        gt_vars.$transfers_through_modules$ = null;
        gt_vars.$tt_parameters$ = null;
        gt_vars.$tt_pred$ = null;
        gt_vars.$tt_index$ = null;
        gt_vars.$tt_gather$ = null;
        gt_vars.$tt_index_arg$ = null;
        gt_vars.$tt_gather_arg$ = null;
        gt_vars.$tt_truth$ = null;
        gt_vars.$tt_step_fn$ = null;
        gt_vars.$tt_transitive_conduitP$ = null;
        gt_vars.$gt_transitive_via_arg_activeP$ = null;
        gt_vars.$gt_within_transitive_via_argP$ = null;
        $list0 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MIN-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MAX-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CO-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-CO-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CO-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-CO-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REDUNDANT-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-REDUNDANT-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REDUNDANT-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-REDUNDANT-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-ACCESSIBLE"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-ACCESSIBLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNION-ALL-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-UNION-ALL-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-FN-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-COMPOSE-FN-ALL-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMBINE-FN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NCONC"))), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-FN-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-COMPOSE-FN-ALL-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMBINE-FN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NCONC"))), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-DEPENDENT-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-DEPENDENT-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-PRED-SUPERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-COMPOSE-PRED-ALL-SUPERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)gt_vars.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER"), (SubLObject)gt_vars.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPOSE-PRED-INFERIORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-COMPOSE-PRED-ALL-INFERIORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)gt_vars.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GATHER"), (SubLObject)gt_vars.TWO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ROOTS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ROOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEAVES"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-LEAVES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-BOOLEAN?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-SUPERIOR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-INFERIOR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HAS-SUPERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-HAS-SUPERIOR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HAS-INFERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-HAS-INFERIOR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GATHER-SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-GATHER-SUPERIOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GATHER-INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-GATHER-INFERIOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL"), (SubLObject)SubLObjectFactory.makeSymbol("GATHER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCLES?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-CYCLES?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMPLETES-CYCLE?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-COMPLETES-CYCLE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MIN-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-NODES"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MAX-NODES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-CEILINGS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MIN-CEILINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-FLOORS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MAX-FLOORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MIN-SUPERIORS-EXCLUDING"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MIN-SUPERIORS-EXCLUDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-INFERIORS-EXCLUDING"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-MAX-INFERIORS-EXCLUDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY-SUPERIOR-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ANY-SUPERIOR-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHY-SUPERIOR?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-WHY-SUPERIOR?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WHY-COMPLETES-CYCLE?"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-WHY-COMPLETES-CYCLE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SUPERIOR-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-SUPERIOR-EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-INFERIOR-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-INFERIOR-EDGES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-PATHS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-PATHS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIORS-WITH-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ALL-INFERIORS-WITH-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-IN-WHAT-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-METHOD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INFERIOR-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-IN-WHAT-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-METHOD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("GTM-ACCESSIBLE-IN-WHAT-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("KEY-METHOD"))) });
        $sym1$_GT_DISPATCH_TABLE_ = SubLObjectFactory.makeSymbol("*GT-DISPATCH-TABLE*");
        $sym2$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym3$_GT_METHODS_ = SubLObjectFactory.makeSymbol("*GT-METHODS*");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GATHER-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSORS"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $sym5$_GT_PARAMETERS_ = SubLObjectFactory.makeSymbol("*GT-PARAMETERS*");
        $sym6$_TRANSITIVITY_MODULES_ = SubLObjectFactory.makeSymbol("*TRANSITIVITY-MODULES*");
        $sym7$_GT_PRED_ = SubLObjectFactory.makeSymbol("*GT-PRED*");
        $sym8$_GT_INDEX_ = SubLObjectFactory.makeSymbol("*GT-INDEX*");
        $sym9$_GT_GATHER_ = SubLObjectFactory.makeSymbol("*GT-GATHER*");
        $sym10$_GT_INDEX_ARG_ = SubLObjectFactory.makeSymbol("*GT-INDEX-ARG*");
        $sym11$_GT_GATHER_ARG_ = SubLObjectFactory.makeSymbol("*GT-GATHER-ARG*");
        $sym12$_GT_ACCESSORS_ = SubLObjectFactory.makeSymbol("*GT-ACCESSORS*");
        $kw13$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $sym14$_GT_LINK_TYPE_ = SubLObjectFactory.makeSymbol("*GT-LINK-TYPE*");
        $kw15$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $sym16$_GT_MODE_ = SubLObjectFactory.makeSymbol("*GT-MODE*");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPERIOR"), (SubLObject)SubLObjectFactory.makeKeyword("INFERIOR"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSIBLE"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTED"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $sym18$_GT_MODES_ = SubLObjectFactory.makeSymbol("*GT-MODES*");
        $kw19$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym20$_GT_TRUTH_ = SubLObjectFactory.makeSymbol("*GT-TRUTH*");
        $sym21$_GT_QUERY_ = SubLObjectFactory.makeSymbol("*GT-QUERY*");
        $sym22$_GT_DONE__ = SubLObjectFactory.makeSymbol("*GT-DONE?*");
        $sym23$_GT_SEARCHED__ = SubLObjectFactory.makeSymbol("*GT-SEARCHED?*");
        $sym24$_GT_TARGET_ = SubLObjectFactory.makeSymbol("*GT-TARGET*");
        $sym25$_GT_RESULT_ = SubLObjectFactory.makeSymbol("*GT-RESULT*");
        $sym26$_GT_SEARCHER_ = SubLObjectFactory.makeSymbol("*GT-SEARCHER*");
        $sym27$_GT_BASE_FN_ = SubLObjectFactory.makeSymbol("*GT-BASE-FN*");
        $sym28$_GT_STEP_FN_ = SubLObjectFactory.makeSymbol("*GT-STEP-FN*");
        $sym29$_GT_COMPOSE_FN_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-FN*");
        $sym30$_GT_GATHER_FN_ = SubLObjectFactory.makeSymbol("*GT-GATHER-FN*");
        $sym31$NCONC = SubLObjectFactory.makeSymbol("NCONC");
        $sym32$_GT_COMBINE_FN_ = SubLObjectFactory.makeSymbol("*GT-COMBINE-FN*");
        $sym33$_GT_COMPARE_FN_ = SubLObjectFactory.makeSymbol("*GT-COMPARE-FN*");
        $sym34$_GT_EQUALITY_FN_ = SubLObjectFactory.makeSymbol("*GT-EQUALITY-FN*");
        $sym35$_GT_COMPOSE_PRED_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-PRED*");
        $sym36$_GT_COMPOSE_INDEX_ARG_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-INDEX-ARG*");
        $sym37$_GT_COMPOSE_GATHER_ARG_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-GATHER-ARG*");
        $kw38$DOWN = SubLObjectFactory.makeKeyword("DOWN");
        $sym39$_GT_MAX_NODES_DIRECTION_ = SubLObjectFactory.makeSymbol("*GT-MAX-NODES-DIRECTION*");
        $sym40$_GT_USE_SPEC_PREDS__ = SubLObjectFactory.makeSymbol("*GT-USE-SPEC-PREDS?*");
        $sym41$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__ = SubLObjectFactory.makeSymbol("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*");
        $str42$Current_link_support__a_is_not_a_ = SubLObjectFactory.makeString("Current link support ~a is not a valid support for determining link mt.");
        $str43$Current_link_support__a_is_not_a_ = SubLObjectFactory.makeString("Current link support ~a is not a valid support for determining link predicate.");
        $sym44$_GT_WHAT_MTS_RESULT_ = SubLObjectFactory.makeSymbol("*GT-WHAT-MTS-RESULT*");
        $sym45$_GT_WHAT_MTS_GOAL_NODE_ = SubLObjectFactory.makeSymbol("*GT-WHAT-MTS-GOAL-NODE*");
        $sym46$_GT_PATH_LIST_OF_MTS_ = SubLObjectFactory.makeSymbol("*GT-PATH-LIST-OF-MTS*");
        $sym47$_GT_PATH_LIST_OF_NODES_ = SubLObjectFactory.makeSymbol("*GT-PATH-LIST-OF-NODES*");
        $sym48$_GT_PATH_LENGTH_ = SubLObjectFactory.makeSymbol("*GT-PATH-LENGTH*");
        $sym49$_GT_LIST_OF_PATH_LENGTHS_ = SubLObjectFactory.makeSymbol("*GT-LIST-OF-PATH-LENGTHS*");
        $sym50$_GT_MARKING_TABLE_ = SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*");
        $sym51$_GT_TARGET_MARKING_TABLE_ = SubLObjectFactory.makeSymbol("*GT-TARGET-MARKING-TABLE*");
        $sym52$_GT_DEPTH_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF*");
        $sym53$_GT_DEPTH_CUTOFF__ = SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF?*");
        $sym54$_GT_PREV_DEPTH_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-PREV-DEPTH-CUTOFF*");
        $sym55$_GT_TIME_CUTOFF__ = SubLObjectFactory.makeSymbol("*GT-TIME-CUTOFF?*");
        $sym56$_GT_TIME_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-TIME-CUTOFF*");
        $sym57$_GT_INITIAL_TIME_ = SubLObjectFactory.makeSymbol("*GT-INITIAL-TIME*");
        $sym58$_GT_ANSWERS_CUTOFF__ = SubLObjectFactory.makeSymbol("*GT-ANSWERS-CUTOFF?*");
        $sym59$_GT_ANSWERS_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-ANSWERS-CUTOFF*");
        $sym60$_GT_ANSWERS_SO_FAR_ = SubLObjectFactory.makeSymbol("*GT-ANSWERS-SO-FAR*");
        $sym61$_GT_GOAL_NODE_ = SubLObjectFactory.makeSymbol("*GT-GOAL-NODE*");
        $sym62$_GT_EDGE_LIST_ = SubLObjectFactory.makeSymbol("*GT-EDGE-LIST*");
        $sym63$_GT_EDGE_LIST_RETURN__ = SubLObjectFactory.makeSymbol("*GT-EDGE-LIST-RETURN?*");
        $sym64$_GT_PATH_LIST_OF_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*GT-PATH-LIST-OF-ASSERTIONS*");
        $sym65$_GT_CYCLICAL_EDGES_ = SubLObjectFactory.makeSymbol("*GT-CYCLICAL-EDGES*");
        $sym66$_GT_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*GT-TRACE-LEVEL*");
        $sym67$_GT_TEST_LEVEL_ = SubLObjectFactory.makeSymbol("*GT-TEST-LEVEL*");
        $sym68$_SUSPEND_GT_TYPE_CHECKING__ = SubLObjectFactory.makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*");
        $sym69$_GT_WARNINGS_ = SubLObjectFactory.makeSymbol("*GT-WARNINGS*");
        $sym70$_GT_USE_SKSI__ = SubLObjectFactory.makeSymbol("*GT-USE-SKSI?*");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $kw72$ACCESSORS = SubLObjectFactory.makeKeyword("ACCESSORS");
        $kw73$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw74$INDEX_ARG = SubLObjectFactory.makeKeyword("INDEX-ARG");
        $kw75$GATHER_ARG = SubLObjectFactory.makeKeyword("GATHER-ARG");
        $kw76$MT = SubLObjectFactory.makeKeyword("MT");
        $sym77$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym78$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-LINK-TYPE*"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(128))));
        $sym82$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym83$RESULT = SubLObjectFactory.makeSymbol("RESULT");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")));
        $sym85$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-LINK-TYPE*"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESSORS")));
        $sym87$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym88$SETUP_TRANSITIVITY_MODULE = SubLObjectFactory.makeSymbol("SETUP-TRANSITIVITY-MODULE");
        $sym89$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TRANSITIVITY-MODULES*"));
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-TARGETS"), (SubLObject)SubLObjectFactory.makeSymbol("TTM-ALL-TARGETS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL-SOURCES"), (SubLObject)SubLObjectFactory.makeSymbol("TTM-ALL-SOURCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN?"), (SubLObject)SubLObjectFactory.makeSymbol("TTM-BOOLEAN?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCESSES-IN-WHAT-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("TTM-ACCESSES-IN-WHAT-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"))));
        $sym92$_TT_DISPATCH_TABLE_ = SubLObjectFactory.makeSymbol("*TT-DISPATCH-TABLE*");
        $sym93$_TT_METHODS_ = SubLObjectFactory.makeSymbol("*TT-METHODS*");
        $sym94$_TRANSFERS_THROUGH_MODULES_ = SubLObjectFactory.makeSymbol("*TRANSFERS-THROUGH-MODULES*");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("CONDUIT-PRED"), (SubLObject)SubLObjectFactory.makeKeyword("TT-INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("TT-GATHER-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GT-INDEX-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("GT-GATHER-ARG"), (SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $sym96$_TT_PARAMETERS_ = SubLObjectFactory.makeSymbol("*TT-PARAMETERS*");
        $sym97$_TT_PRED_ = SubLObjectFactory.makeSymbol("*TT-PRED*");
        $sym98$_TT_INDEX_ = SubLObjectFactory.makeSymbol("*TT-INDEX*");
        $sym99$_TT_GATHER_ = SubLObjectFactory.makeSymbol("*TT-GATHER*");
        $sym100$_TT_INDEX_ARG_ = SubLObjectFactory.makeSymbol("*TT-INDEX-ARG*");
        $sym101$_TT_GATHER_ARG_ = SubLObjectFactory.makeSymbol("*TT-GATHER-ARG*");
        $sym102$_TT_TRUTH_ = SubLObjectFactory.makeSymbol("*TT-TRUTH*");
        $sym103$_TT_STEP_FN_ = SubLObjectFactory.makeSymbol("*TT-STEP-FN*");
        $sym104$_TT_TRANSITIVE_CONDUIT__ = SubLObjectFactory.makeSymbol("*TT-TRANSITIVE-CONDUIT?*");
        $kw105$CONDUIT_PRED = SubLObjectFactory.makeKeyword("CONDUIT-PRED");
        $sym106$TRANSITIVE_PREDICATE_ = SubLObjectFactory.makeSymbol("TRANSITIVE-PREDICATE?");
        $sym107$GENERIC_TTM = SubLObjectFactory.makeSymbol("GENERIC-TTM");
        $sym108$SETUP_TRANSFERS_THROUGH_MODULE = SubLObjectFactory.makeSymbol("SETUP-TRANSFERS-THROUGH-MODULE");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TRANSFERS-THROUGH-MODULES*"));
        $sym110$_GT_TRANSITIVE_VIA_ARG_ACTIVE__ = SubLObjectFactory.makeSymbol("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*");
        $sym111$_GT_WITHIN_TRANSITIVE_VIA_ARG__ = SubLObjectFactory.makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*");
    }
}

/*

	Total time: 700 ms
	
*/