package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_methods extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gt_methods";
    public static final String myFingerPrint = "b753115119880742b6b17becdd2cc8fb58ca512b4fa1c02baf5a31c2d4a4c982";
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLSymbol $sym1$GT_TERM_P;
    private static final SubLSymbol $kw2$SUPERIORS;
    private static final SubLSymbol $sym3$GT_SUPERIORS;
    private static final SubLList $list4;
    private static final SubLString $str5$Returns_direct_superiors_of_FORT_;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$GT_ERROR;
    private static final SubLSymbol $kw9$GT_INDEX;
    private static final SubLSymbol $kw10$SUPERIOR;
    private static final SubLString $str11$invalid_gt_mode___a;
    private static final SubLSymbol $kw12$TRUE;
    private static final SubLSymbol $sym13$TRUTH_P;
    private static final SubLSymbol $kw14$MIN_SUPERIORS;
    private static final SubLSymbol $sym15$GT_MIN_SUPERIORS;
    private static final SubLString $str16$Returns_minimal_superiors_of_FORT;
    private static final SubLSymbol $kw17$INFERIORS;
    private static final SubLSymbol $sym18$GT_INFERIORS;
    private static final SubLString $str19$Returns_direct_inferiors_of_FORT_;
    private static final SubLSymbol $kw20$GT_GATHER;
    private static final SubLSymbol $kw21$INFERIOR;
    private static final SubLSymbol $kw22$MAX_INFERIORS;
    private static final SubLSymbol $sym23$GT_MAX_INFERIORS;
    private static final SubLString $str24$Returns_maximal_inferiors_of_FORT;
    private static final SubLSymbol $kw25$CO_SUPERIORS;
    private static final SubLSymbol $sym26$GT_CO_SUPERIORS;
    private static final SubLString $str27$Returns_sibling_direct_superiors_;
    private static final SubLSymbol $kw28$CO_INFERIORS;
    private static final SubLSymbol $sym29$GT_CO_INFERIORS;
    private static final SubLString $str30$Returns_sibling_direct_inferiors_;
    private static final SubLSymbol $kw31$REDUNDANT_SUPERIORS;
    private static final SubLSymbol $sym32$GT_REDUNDANT_SUPERIORS;
    private static final SubLString $str33$Returns_direct_superiors_of_FORT_;
    private static final SubLSymbol $kw34$REDUNDANT_INFERIORS;
    private static final SubLSymbol $sym35$GT_REDUNDANT_INFERIORS;
    private static final SubLString $str36$Returns_direct_inferiors_of_FORT_;
    private static final SubLSymbol $kw37$ALL_SUPERIORS;
    private static final SubLSymbol $sym38$GT_ALL_SUPERIORS;
    private static final SubLString $str39$Returns_all_superiors_of_FORT_via;
    private static final SubLSymbol $kw40$ALL_INFERIORS;
    private static final SubLSymbol $sym41$GT_ALL_INFERIORS;
    private static final SubLString $str42$Returns_all_inferiors_of_FORT_via;
    private static final SubLSymbol $kw43$UNION_ALL_INFERIORS;
    private static final SubLSymbol $kw44$ALL_ACCESSIBLE;
    private static final SubLSymbol $sym45$GT_ALL_ACCESSIBLE;
    private static final SubLString $str46$Returns_all_superiors_and_all_inf;
    private static final SubLSymbol $kw47$GT_EITHER;
    private static final SubLSymbol $kw48$ACCESSIBLE;
    private static final SubLSymbol $kw49$ROOTS;
    private static final SubLSymbol $sym50$GT_ROOTS;
    private static final SubLString $str51$Returns_maximal_superiors__i_e___;
    private static final SubLSymbol $kw52$LEAVES;
    private static final SubLSymbol $sym53$GT_LEAVES;
    private static final SubLString $str54$Returns_minimal_inferiors__i_e___;
    private static final SubLSymbol $sym55$CONS;
    private static final SubLSymbol $sym56$FUNCTION_SPEC_P;
    private static final SubLSymbol $kw57$COMPOSE_FN_SUPERIORS;
    private static final SubLSymbol $sym58$GT_COMPOSE_FN_ALL_SUPERIORS;
    private static final SubLList $list59;
    private static final SubLString $str60$Apply_fn_to_each_superior_of_FORT;
    private static final SubLList $list61;
    private static final SubLSymbol $kw62$COMPOSE_FN_INFERIORS;
    private static final SubLSymbol $sym63$GT_COMPOSE_FN_ALL_INFERIORS;
    private static final SubLList $list64;
    private static final SubLString $str65$Apply_fn_to_each_inferior_of_FORT;
    private static final SubLSymbol $sym66$PREDICATE_IN_ANY_MT_;
    private static final SubLSymbol $kw67$COMPOSE_PRED_SUPERIORS;
    private static final SubLSymbol $sym68$GT_COMPOSE_PRED_ALL_SUPERIORS;
    private static final SubLList $list69;
    private static final SubLString $str70$Returns_all_nodes_accessible_by_C;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$FIXNUMP;
    private static final SubLSymbol $kw73$COMPOSE_PRED_INFERIORS;
    private static final SubLSymbol $sym74$GT_COMPOSE_PRED_ALL_INFERIORS;
    private static final SubLString $str75$Returns_all_nodes_accessible_by_C;
    private static final SubLSymbol $kw76$ALL_DEPENDENT_INFERIORS;
    private static final SubLSymbol $sym77$GT_ALL_DEPENDENT_INFERIORS;
    private static final SubLString $str78$Returns_all_inferiors_i_of_FORT_s;
    private static final SubLSymbol $kw79$BOOLEAN_;
    private static final SubLSymbol $kw80$SUPERIOR_;
    private static final SubLSymbol $kw81$WHY_SUPERIOR_;
    private static final SubLSymbol $sym82$GT_WHY_SUPERIOR_;
    private static final SubLList $list83;
    private static final SubLString $str84$Returns_justification_of_why_SUPE;
    private static final SubLList $list85;
    private static final SubLList $list86;
    private static final SubLSymbol $kw87$REFLEXIVE;
    private static final SubLSymbol $kw88$GENLPREDS;
    private static final SubLObject $const89$genlInverse;
    private static final SubLObject $const90$genlPreds;
    private static final SubLSymbol $kw91$INFERIOR_;
    private static final SubLSymbol $kw92$HAS_SUPERIOR_;
    private static final SubLSymbol $sym93$GT_HAS_SUPERIOR_;
    private static final SubLList $list94;
    private static final SubLString $str95$Returns_whetherfort_INFERIOR_is_h;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$GT_HAS_INFERIOR_;
    private static final SubLString $str99$Returns_whether_fort_SUPERIOR_is_;
    private static final SubLSymbol $kw100$GATHER_INFERIOR;
    private static final SubLSymbol $kw101$GATHER_SUPERIOR;
    private static final SubLSymbol $kw102$CYCLES_;
    private static final SubLSymbol $sym103$GT_CYCLES_;
    private static final SubLString $str104$Returns_whether_FORT_is_accessibl;
    private static final SubLSymbol $kw105$COMPLETES_CYCLE_;
    private static final SubLSymbol $sym106$GT_COMPLETES_CYCLE_;
    private static final SubLList $list107;
    private static final SubLString $str108$Returns_whether_a_transitive_path;
    private static final SubLList $list109;
    private static final SubLSymbol $kw110$WHY_COMPLETES_CYCLE_;
    private static final SubLSymbol $sym111$GT_WHY_COMPLETES_CYCLE_;
    private static final SubLString $str112$Returns_justification_that_a_tran;
    private static final SubLSymbol $sym113$LISTP;
    private static final SubLSymbol $kw114$MIN_NODES;
    private static final SubLSymbol $sym115$GT_MIN_NODES;
    private static final SubLList $list116;
    private static final SubLString $str117$Returns_returns_the_most_subordin;
    private static final SubLList $list118;
    private static final SubLSymbol $sym119$GT_SEARCHED_;
    private static final SubLSymbol $kw120$MAX_NODES;
    private static final SubLSymbol $sym121$GT_MAX_NODES;
    private static final SubLList $list122;
    private static final SubLString $str123$Returns_returns_the_least_subordi;
    private static final SubLSymbol $kw124$UP;
    private static final SubLSymbol $kw125$DOWN;
    private static final SubLSymbol $sym126$GETHASH;
    private static final SubLSymbol $sym127$MEMBER_;
    private static final SubLSymbol $kw128$MIN_CEILINGS;
    private static final SubLSymbol $sym129$GT_MIN_CEILINGS;
    private static final SubLList $list130;
    private static final SubLString $str131$Returns_the_most_subordinate_comm;
    private static final SubLInteger $int132$128;
    private static final SubLSymbol $kw133$MAX_FLOORS;
    private static final SubLSymbol $sym134$GT_MAX_FLOORS;
    private static final SubLString $str135$Returns_the_least_subordinate_ele;
    private static final SubLSymbol $kw136$MIN_SUPERIORS_EXCLUDING;
    private static final SubLSymbol $sym137$GT_MIN_SUPERIORS_EXCLUDING;
    private static final SubLString $str138$Returns_least_general_superiors_o;
    private static final SubLSymbol $kw139$MAX_INFERIORS_EXCLUDING;
    private static final SubLSymbol $sym140$GT_MAX_INFERIORS_EXCLUDING;
    private static final SubLString $str141$Returns_most_general_inferiors_of;
    private static final SubLSymbol $kw142$ALL_SUPERIOR_EDGES;
    private static final SubLSymbol $kw143$ALL_INFERIOR_EDGES;
    private static final SubLSymbol $kw144$ALL_PATHS;
    private static final SubLSymbol $kw145$SUPERIOR_IN_WHAT_MTS;
    private static final SubLSymbol $kw146$HIERARCHICALLY_DIRECT;
    private static final SubLString $str147$illegal_value_for_method_of_which;
    private static final SubLSymbol $sym148$RELEVANT_MT_IS_ANY_MT;
    private static final SubLObject $const149$InferencePSC;
    private static final SubLSymbol $kw150$INFERIORS_WITH_MTS;
    private static final SubLSymbol $sym151$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const152$EverythingPSC;
    private static final SubLObject $const153$genls;
    private static final SubLString $str154$before_gathering_instances;
    private static final SubLSymbol $sym155$ADD_RESULT_TO_GT_RESULT;
    private static final SubLObject $const156$isa;
    private static final SubLString $str157$after_instances__before_maximin;
    private static final SubLString $str158$after_maximin;
    private static final SubLObject $const159$genlMt;
    private static final SubLSymbol $kw160$ANY_SUPERIOR_PATH;
    private static final SubLSymbol $sym161$GT_ANY_SUPERIOR_PATH;
    private static final SubLString $str162$Returns_list_of_nodes_connecting_;
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 390L)
    public static SubLObject gt_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw2$SUPERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 824L)
    public static SubLObject gtm_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$1 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$2 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        superiors = gt_search.gt_link_values(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$1, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 1158L)
    public static SubLObject gt_min_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw14$MIN_SUPERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 1677L)
    public static SubLObject gtm_min_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return gtm_min_nodes(gtm_superiors(fort, mt), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 1824L)
    public static SubLObject gt_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw17$INFERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 2141L)
    public static SubLObject gtm_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$3 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$4 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        inferiors = gt_search.gt_link_values(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$3, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inferiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 2476L)
    public static SubLObject gt_max_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw22$MAX_INFERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 2995L)
    public static SubLObject gtm_max_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return gtm_max_nodes(gtm_inferiors(fort, mt), mt, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 3142L)
    public static SubLObject gt_co_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw25$CO_SUPERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 3611L)
    public static SubLObject gtm_co_superiors(final SubLObject fort, SubLObject mt, SubLObject tv) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (tv == gt_methods.UNPROVIDED) {
            tv = (SubLObject)gt_methods.$kw12$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject co_superiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$5 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p(tv) : tv;
                    final SubLObject _prev_bind_0_$6 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind(tv, thread);
                        co_superiors = Sequences.remove(fort, gtm_min_nodes(gt_search.gt_siblings(fort), (SubLObject)gt_methods.UNPROVIDED), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$5, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return co_superiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 4038L)
    public static SubLObject gt_co_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw28$CO_INFERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 4508L)
    public static SubLObject gtm_co_inferiors(final SubLObject fort, SubLObject mt, SubLObject tv) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (tv == gt_methods.UNPROVIDED) {
            tv = (SubLObject)gt_methods.$kw12$TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject co_inferiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$7 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p(tv) : tv;
                    final SubLObject _prev_bind_0_$8 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind(tv, thread);
                        co_inferiors = Sequences.remove(fort, gtm_max_nodes(gt_search.gt_siblings(fort), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$8, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$7, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return co_inferiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 4935L)
    public static SubLObject gt_redundant_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw31$REDUNDANT_SUPERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 5330L)
    public static SubLObject gtm_redundant_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject redundants = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$9 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    final SubLObject superiors = gt_search.gt_link_values(fort);
                    redundants = conses_high.set_difference(superiors, gtm_min_nodes(superiors, (SubLObject)gt_methods.UNPROVIDED), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$9, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return redundants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 5768L)
    public static SubLObject gt_redundant_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw34$REDUNDANT_INFERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 6156L)
    public static SubLObject gtm_redundant_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject redundants = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$10 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    final SubLObject inferiors = gt_search.gt_link_values(fort);
                    redundants = conses_high.set_difference(inferiors, gtm_max_nodes(inferiors, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$10, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return redundants;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 6597L)
    public static SubLObject gt_all_superiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw37$ALL_SUPERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 6923L)
    public static SubLObject gtm_all_superiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$11 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$12 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        superiors = gt_search.gt_all_accessed(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$11, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 7279L)
    public static SubLObject gt_all_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw40$ALL_INFERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 7605L)
    public static SubLObject gtm_all_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$13 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$14 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        inferiors = gt_search.gt_all_accessed(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$14, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$13, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inferiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 7943L)
    public static SubLObject gt_union_all_inferiors(final SubLObject predicate, final SubLObject v_forts, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw43$UNION_ALL_INFERIORS, v_forts, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 8147L)
    public static SubLObject gtm_union_all_inferiors(final SubLObject v_forts, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
            }
            final SubLObject _prev_bind_0_$15 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                final SubLObject _prev_bind_0_$16 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                    SubLObject cdolist_list_var = v_forts;
                    SubLObject fort = (SubLObject)gt_methods.NIL;
                    fort = cdolist_list_var.first();
                    while (gt_methods.NIL != cdolist_list_var) {
                        gt_search.gt_mark_all_accessed_as_searched(fort);
                        cdolist_list_var = cdolist_list_var.rest();
                        fort = cdolist_list_var.first();
                    }
                }
                finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$15, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        inferiors = hash_table_utilities.hash_table_keys(gt_vars.$gt_marking_table$.getDynamicValue(thread));
        return inferiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 8483L)
    public static SubLObject gt_all_accessible(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw44$ALL_ACCESSIBLE, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 8964L)
    public static SubLObject gtm_all_accessible(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accessed = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw47$GT_EITHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw48$ACCESSIBLE)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw48$ACCESSIBLE);
                }
                final SubLObject _prev_bind_0_$17 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw48$ACCESSIBLE, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$18 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        accessed = list_utilities.remove_duplicate_forts(gt_search.gt_all_accessed(fort));
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$18, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$17, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return accessed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 9340L)
    public static SubLObject gt_roots(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw49$ROOTS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 9709L)
    public static SubLObject gtm_roots(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$19 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$20 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        superiors = gt_search.gt_extremal_accessed(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$20, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$19, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 10087L)
    public static SubLObject gt_leaves(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw52$LEAVES, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 10418L)
    public static SubLObject gtm_leaves(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inferiors = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$21 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$22 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        inferiors = gt_search.gt_extremal_accessed(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$22, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$21, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return inferiors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 10799L)
    public static SubLObject gt_compose_fn_all_superiors(final SubLObject predicate, final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == gt_methods.UNPROVIDED) {
            combine_fn = Symbols.symbol_function((SubLObject)gt_methods.$sym55$CONS);
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        enforceType(fn, gt_methods.$sym56$FUNCTION_SPEC_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw57$COMPOSE_FN_SUPERIORS, fort, fn, combine_fn, mt, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 11327L)
    public static SubLObject gtm_compose_fn_all_superiors(final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == gt_methods.UNPROVIDED) {
            combine_fn = Symbols.symbol_function((SubLObject)gt_methods.$sym55$CONS);
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$23 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$24 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_compose_fn_all_accessed(fort, fn, combine_fn);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$24, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$23, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 11811L)
    public static SubLObject gt_compose_fn_all_inferiors(final SubLObject predicate, final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == gt_methods.UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        enforceType(fn, gt_methods.$sym56$FUNCTION_SPEC_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw62$COMPOSE_FN_INFERIORS, fort, fn, combine_fn, mt, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 12316L)
    public static SubLObject gtm_compose_fn_all_inferiors(final SubLObject fort, final SubLObject fn, SubLObject combine_fn, SubLObject mt) {
        if (combine_fn == gt_methods.UNPROVIDED) {
            combine_fn = gt_vars.$gt_combine_fn$.getDynamicValue();
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$25 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$26 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_compose_fn_all_accessed(fort, fn, combine_fn);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$26, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$25, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 12811L)
    public static SubLObject gt_compose_pred_all_superiors(final SubLObject predicate, final SubLObject fort, final SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == gt_methods.UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == gt_methods.UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        enforceType(compose_pred, gt_methods.$sym66$PREDICATE_IN_ANY_MT_);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw67$COMPOSE_PRED_SUPERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 13488L)
    public static SubLObject gtm_compose_pred_all_superiors(final SubLObject fort, final SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == gt_methods.UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == gt_methods.UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$27 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$28 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        assert gt_methods.NIL != Types.fixnump(compose_index_arg) : compose_index_arg;
                        final SubLObject _prev_bind_0_$29 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(compose_index_arg, thread);
                            assert gt_methods.NIL != Types.fixnump(compose_gather_arg) : compose_gather_arg;
                            final SubLObject _prev_bind_0_$30 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_gather_arg$.bind(compose_gather_arg, thread);
                                result = gt_search.gt_compose_pred_all_accessed(fort, pred);
                            }
                            finally {
                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_$30, thread);
                            }
                        }
                        finally {
                            gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$28, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$27, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 14092L)
    public static SubLObject gt_compose_pred_all_inferiors(final SubLObject predicate, final SubLObject fort, final SubLObject compose_pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == gt_methods.UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == gt_methods.UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        enforceType(compose_pred, gt_methods.$sym66$PREDICATE_IN_ANY_MT_);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw73$COMPOSE_PRED_INFERIORS, fort, compose_pred, compose_index_arg, compose_gather_arg, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 14768L)
    public static SubLObject gtm_compose_pred_all_inferiors(final SubLObject fort, final SubLObject pred, SubLObject compose_index_arg, SubLObject compose_gather_arg, SubLObject mt) {
        if (compose_index_arg == gt_methods.UNPROVIDED) {
            compose_index_arg = gt_vars.$gt_compose_index_arg$.getDynamicValue();
        }
        if (compose_gather_arg == gt_methods.UNPROVIDED) {
            compose_gather_arg = gt_vars.$gt_compose_gather_arg$.getDynamicValue();
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$31 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$32 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        assert gt_methods.NIL != Types.fixnump(compose_index_arg) : compose_index_arg;
                        final SubLObject _prev_bind_0_$33 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(compose_index_arg, thread);
                            assert gt_methods.NIL != Types.fixnump(compose_gather_arg) : compose_gather_arg;
                            final SubLObject _prev_bind_0_$34 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_gather_arg$.bind(compose_gather_arg, thread);
                                result = gt_search.gt_compose_pred_all_accessed(fort, pred);
                            }
                            finally {
                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                        finally {
                            gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$32, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$31, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 15386L)
    public static SubLObject gt_all_dependent_inferiors(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw76$ALL_DEPENDENT_INFERIORS, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 15830L)
    public static SubLObject gtm_all_dependent_inferiors(final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$35 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$36 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_all_dependent_accessed(fort);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$36, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$35, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 16256L)
    public static SubLObject gt_booleanP(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw79$BOOLEAN_, arg1, arg2, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 16503L)
    public static SubLObject gtm_booleanP(final SubLObject arg1, final SubLObject arg2, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        SubLObject source = (SubLObject)gt_methods.NIL;
        SubLObject target = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)gt_methods.ONE_INTEGER)) {
                source = arg1;
                target = arg2;
            }
            else if (pcase_var.eql((SubLObject)gt_methods.TWO_INTEGER)) {
                source = arg2;
                target = arg1;
            }
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(target, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(source, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (arg1.eql(arg2) && gt_methods.NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                    result = (SubLObject)gt_methods.T;
                }
                else {
                    if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                        Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$37 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                        assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                        final SubLObject _prev_bind_0_$38 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                            result = gt_search.gt_accessesP(source, target, (SubLObject)gt_methods.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$38, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 17049L)
    public static SubLObject gt_superiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw80$SUPERIOR_, superior, inferior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 17442L)
    public static SubLObject gtm_superiorP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject superiorP = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(spec, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(genl, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (genl.eql(spec) && gt_methods.NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                    superiorP = (SubLObject)gt_methods.T;
                }
                else {
                    if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                        Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$39 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                        assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                        final SubLObject _prev_bind_0_$40 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                            superiorP = gt_search.gt_accessesP(spec, genl, (SubLObject)gt_methods.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return superiorP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 17950L)
    public static SubLObject gt_why_superiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(superior, gt_methods.$sym1$GT_TERM_P);
        enforceType(inferior, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw81$WHY_SUPERIOR_, superior, inferior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 18506L)
    public static SubLObject gt_support_predicate(final SubLObject support) {
        return cycl_utilities.formula_operator(gt_support_sentence(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 18612L)
    public static SubLObject gt_support_sentence(final SubLObject support) {
        if (gt_methods.NIL != assertion_handles.assertion_p(support)) {
            return assertions_high.assertion_formula(support);
        }
        if (gt_methods.NIL != arguments.hl_support_p(support)) {
            return arguments.support_sentence(support);
        }
        return (SubLObject)gt_methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 18813L)
    public static SubLObject gtm_why_superiorP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(spec, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(genl, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (genl.eql(spec) && gt_methods.NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                    just = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)gt_methods.$kw87$REFLEXIVE, el_utilities.make_binary_formula(gt_vars.$gt_pred$.getDynamicValue(thread), spec, genl), mt, (SubLObject)gt_methods.UNPROVIDED));
                }
                else if (gt_methods.NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                    final SubLObject gt_supports = gt_search.gt_why_accessesP(spec, genl);
                    SubLObject list_var = (SubLObject)gt_methods.NIL;
                    SubLObject gt_support = (SubLObject)gt_methods.NIL;
                    SubLObject n = (SubLObject)gt_methods.NIL;
                    list_var = gt_supports;
                    gt_support = list_var.first();
                    for (n = (SubLObject)gt_methods.ZERO_INTEGER; gt_methods.NIL != list_var; list_var = list_var.rest(), gt_support = list_var.first(), n = Numbers.add((SubLObject)gt_methods.ONE_INTEGER, n)) {
                        just = (SubLObject)ConsesLow.cons(gt_support, just);
                        final SubLObject sentence = gt_support_sentence(gt_support);
                        final SubLObject pred = cycl_utilities.formula_operator(sentence);
                        if (!gt_vars.$gt_pred$.getDynamicValue(thread).eql(pred)) {
                            final SubLObject arg2 = cycl_utilities.formula_arg2(sentence, (SubLObject)gt_methods.UNPROVIDED);
                            if (n.isZero()) {
                                if (arg2.eql(genl)) {
                                    final SubLObject item_var = arguments.make_hl_support((SubLObject)gt_methods.$kw88$GENLPREDS, el_utilities.make_binary_formula(gt_methods.$const89$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, (SubLObject)gt_methods.UNPROVIDED);
                                    if (gt_methods.NIL == conses_high.member(item_var, just, Symbols.symbol_function((SubLObject)gt_methods.EQUAL), Symbols.symbol_function((SubLObject)gt_methods.IDENTITY))) {
                                        just = (SubLObject)ConsesLow.cons(item_var, just);
                                    }
                                }
                                else {
                                    final SubLObject item_var = arguments.make_hl_support((SubLObject)gt_methods.$kw88$GENLPREDS, el_utilities.make_binary_formula(gt_methods.$const90$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, (SubLObject)gt_methods.UNPROVIDED);
                                    if (gt_methods.NIL == conses_high.member(item_var, just, Symbols.symbol_function((SubLObject)gt_methods.EQUAL), Symbols.symbol_function((SubLObject)gt_methods.IDENTITY))) {
                                        just = (SubLObject)ConsesLow.cons(item_var, just);
                                    }
                                }
                            }
                            else {
                                final SubLObject prev_sentence = gt_support_sentence(ConsesLow.nth(Numbers.subtract(n, (SubLObject)gt_methods.ONE_INTEGER), gt_supports));
                                final SubLObject prev_arg2 = cycl_utilities.formula_arg2(prev_sentence, (SubLObject)gt_methods.UNPROVIDED);
                                if (arg2.eql(prev_arg2)) {
                                    final SubLObject item_var2 = arguments.make_hl_support((SubLObject)gt_methods.$kw88$GENLPREDS, el_utilities.make_binary_formula(gt_methods.$const89$genlInverse, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, (SubLObject)gt_methods.UNPROVIDED);
                                    if (gt_methods.NIL == conses_high.member(item_var2, just, Symbols.symbol_function((SubLObject)gt_methods.EQUAL), Symbols.symbol_function((SubLObject)gt_methods.IDENTITY))) {
                                        just = (SubLObject)ConsesLow.cons(item_var2, just);
                                    }
                                }
                                else {
                                    final SubLObject item_var2 = arguments.make_hl_support((SubLObject)gt_methods.$kw88$GENLPREDS, el_utilities.make_binary_formula(gt_methods.$const90$genlPreds, pred, gt_vars.$gt_pred$.getDynamicValue(thread)), mt, (SubLObject)gt_methods.UNPROVIDED);
                                    if (gt_methods.NIL == conses_high.member(item_var2, just, Symbols.symbol_function((SubLObject)gt_methods.EQUAL), Symbols.symbol_function((SubLObject)gt_methods.IDENTITY))) {
                                        just = (SubLObject)ConsesLow.cons(item_var2, just);
                                    }
                                }
                            }
                        }
                    }
                    just = Sequences.nreverse(just);
                }
                else {
                    just = gt_search.gt_why_accessesP(spec, genl);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 20428L)
    public static SubLObject gt_inferiorP(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw91$INFERIOR_, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 20811L)
    public static SubLObject gtm_inferiorP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return gtm_superiorP(genl, spec, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 20971L)
    public static SubLObject gt_has_superiorP(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(inferior, gt_methods.$sym1$GT_TERM_P);
        enforceType(superior, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw92$HAS_SUPERIOR_, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 21497L)
    public static SubLObject gtm_has_superiorP(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return gtm_superiorP(genl, spec, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 21677L)
    public static SubLObject gt_has_inferiorP(final SubLObject predicate, final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(superior, gt_methods.$sym1$GT_TERM_P);
        enforceType(inferior, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw92$HAS_SUPERIOR_, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 22206L)
    public static SubLObject gtm_has_inferiorP(final SubLObject genl, final SubLObject spec, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return gtm_superiorP(genl, spec, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 22386L)
    public static SubLObject gt_gather_inferior(final SubLObject predicate, final SubLObject genl, final SubLObject gather_fn, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw100$GATHER_INFERIOR, genl, gather_fn, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 22672L)
    public static SubLObject gtm_gather_inferior(final SubLObject genl, final SubLObject gather_fn, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL != Functions.funcall(gather_fn, genl)) {
                    result = (SubLObject)gt_methods.T;
                }
                else {
                    if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                        Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                    }
                    final SubLObject _prev_bind_0_$41 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                        assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                        final SubLObject _prev_bind_0_$42 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                            result = gt_search.gt_gather(genl, gather_fn);
                        }
                        finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$41, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 23011L)
    public static SubLObject gt_gather_superior(final SubLObject predicate, final SubLObject spec, final SubLObject gather_fn, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw101$GATHER_SUPERIOR, spec, gather_fn, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 23295L)
    public static SubLObject gtm_gather_superior(final SubLObject spec, final SubLObject gather_fn, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL != Functions.funcall(gather_fn, spec)) {
                    result = (SubLObject)gt_methods.T;
                }
                else {
                    if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                        Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$43 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                        assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                        final SubLObject _prev_bind_0_$44 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                            result = gt_search.gt_gather(spec, gather_fn);
                        }
                        finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 23632L)
    public static SubLObject gt_cyclesP(final SubLObject predicate, final SubLObject fort, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw102$CYCLES_, fort, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 24051L)
    public static SubLObject gtm_cyclesP(final SubLObject v_term, SubLObject mt, SubLObject validateP) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (validateP == gt_methods.UNPROVIDED) {
            validateP = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cyclesP = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                final SubLObject _prev_bind_0_$45 = gt_vars.$gt_test_level$.currentBinding(thread);
                try {
                    gt_vars.$gt_test_level$.bind((SubLObject)((gt_methods.NIL != validateP) ? gt_vars.$gt_test_level$.getDynamicValue(thread) : gt_methods.ZERO_INTEGER), thread);
                    if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        gt_utilities.gt_check_type_internal(v_term, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                    }
                    if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        gt_utilities.gt_check_type_internal(v_term, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                    }
                }
                finally {
                    gt_vars.$gt_test_level$.rebind(_prev_bind_0_$45, thread);
                }
                try {
                    cyclesP = gt_search.gt_accessesP(v_term, v_term, (SubLObject)gt_methods.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)gt_methods.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cyclesP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 24591L)
    public static SubLObject gt_completes_cycleP(final SubLObject predicate, final SubLObject fort1, final SubLObject fort2, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort1, gt_methods.$sym1$GT_TERM_P);
        enforceType(fort2, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw105$COMPLETES_CYCLE_, fort1, fort2, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 25222L)
    public static SubLObject gtm_completes_cycleP(final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject validateP) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (validateP == gt_methods.UNPROVIDED) {
            validateP = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cyclesP = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject start = (SubLObject)gt_methods.NIL;
            SubLObject target = (SubLObject)gt_methods.NIL;
            if (gt_vars.$gt_index_arg$.getDynamicValue(thread).numE((SubLObject)gt_methods.ONE_INTEGER)) {
                start = arg2;
                target = arg1;
            }
            else {
                start = arg1;
                target = arg2;
            }
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                final SubLObject _prev_bind_0_$47 = gt_vars.$gt_test_level$.currentBinding(thread);
                try {
                    gt_vars.$gt_test_level$.bind((SubLObject)((gt_methods.NIL != validateP) ? gt_vars.$gt_test_level$.getDynamicValue(thread) : gt_methods.ZERO_INTEGER), thread);
                    if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        gt_utilities.gt_check_type_internal(start, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                    }
                    if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        gt_utilities.gt_check_type_internal(target, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                    }
                }
                finally {
                    gt_vars.$gt_test_level$.rebind(_prev_bind_0_$47, thread);
                }
                cyclesP = gt_search.gt_accessesP(start, target, (SubLObject)gt_methods.UNPROVIDED);
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return cyclesP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 25829L)
    public static SubLObject gt_why_completes_cycleP(final SubLObject predicate, final SubLObject fort1, final SubLObject fort2, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(fort1, gt_methods.$sym1$GT_TERM_P);
        enforceType(fort2, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw110$WHY_COMPLETES_CYCLE_, fort1, fort2, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 26196L)
    public static SubLObject gtm_why_completes_cycleP(final SubLObject arg1, final SubLObject arg2, SubLObject mt, SubLObject validateP) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (validateP == gt_methods.UNPROVIDED) {
            validateP = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject start = (SubLObject)gt_methods.NIL;
            SubLObject target = (SubLObject)gt_methods.NIL;
            if (gt_vars.$gt_index_arg$.getDynamicValue(thread).numE((SubLObject)gt_methods.ONE_INTEGER)) {
                start = arg2;
                target = arg1;
            }
            else {
                start = arg1;
                target = arg2;
            }
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                final SubLObject _prev_bind_0_$48 = gt_vars.$gt_test_level$.currentBinding(thread);
                try {
                    gt_vars.$gt_test_level$.bind((SubLObject)((gt_methods.NIL != validateP) ? gt_vars.$gt_test_level$.getDynamicValue(thread) : gt_methods.ZERO_INTEGER), thread);
                    if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        gt_utilities.gt_check_type_internal(start, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                    }
                    if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        gt_utilities.gt_check_type_internal(target, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                    }
                }
                finally {
                    gt_vars.$gt_test_level$.rebind(_prev_bind_0_$48, thread);
                }
                assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                final SubLObject _prev_bind_0_$49 = gt_vars.$gt_truth$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                    just = gt_search.gt_why_accessesP(start, target);
                    if (gt_methods.NIL != gt_vars.$gt_use_spec_predsP$.getDynamicValue(thread)) {
                        SubLObject result = (SubLObject)gt_methods.NIL;
                        SubLObject cdolist_list_var = just;
                        SubLObject support = (SubLObject)gt_methods.NIL;
                        support = cdolist_list_var.first();
                        while (gt_methods.NIL != cdolist_list_var) {
                            result = (SubLObject)ConsesLow.cons(support, result);
                            final SubLObject pred = gt_support_predicate(support);
                            if (!gt_vars.$gt_pred$.getDynamicValue(thread).eql(pred)) {
                                SubLObject cdolist_list_var_$50 = genl_predicates.why_genl_predicateP(pred, gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
                                SubLObject gp_support = (SubLObject)gt_methods.NIL;
                                gp_support = cdolist_list_var_$50.first();
                                while (gt_methods.NIL != cdolist_list_var_$50) {
                                    final SubLObject gaf = gp_support.first();
                                    SubLObject relevant_gp_assertion = (SubLObject)gt_methods.NIL;
                                    if (gt_methods.NIL == relevant_gp_assertion) {
                                        SubLObject csome_list_var = kb_indexing.find_all_assertions(clause_utilities.make_gaf_cnf(gaf));
                                        SubLObject gp_assertion = (SubLObject)gt_methods.NIL;
                                        gp_assertion = csome_list_var.first();
                                        while (gt_methods.NIL == relevant_gp_assertion && gt_methods.NIL != csome_list_var) {
                                            if (gt_methods.NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(gp_assertion))) {
                                                relevant_gp_assertion = gp_assertion;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            gp_assertion = csome_list_var.first();
                                        }
                                    }
                                    if (gt_methods.NIL != relevant_gp_assertion) {
                                        final SubLObject item_var = relevant_gp_assertion;
                                        if (gt_methods.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)gt_methods.EQL), Symbols.symbol_function((SubLObject)gt_methods.IDENTITY))) {
                                            result = (SubLObject)ConsesLow.cons(item_var, result);
                                        }
                                    }
                                    cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                    gp_support = cdolist_list_var_$50.first();
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            support = cdolist_list_var.first();
                        }
                        just = Sequences.nreverse(result);
                    }
                }
                finally {
                    gt_vars.$gt_truth$.rebind(_prev_bind_0_$49, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return just;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 27478L)
    public static SubLObject gt_min_nodes(final SubLObject predicate, final SubLObject v_forts, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(v_forts, gt_methods.$sym113$LISTP);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw114$MIN_NODES, v_forts, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 27854L)
    public static SubLObject gtm_min_nodes(final SubLObject nodes, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_methods.NIL != list_utilities.singletonP(nodes)) {
            return nodes;
        }
        final SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = unique_nodes;
            SubLObject node = (SubLObject)gt_methods.NIL;
            node = cdolist_list_var.first();
            while (gt_methods.NIL != cdolist_list_var) {
                if (gt_methods.NIL == gt_search.gt_searchedP(node)) {
                    gt_search.gt_mark_proper_all_superiors_as_searched(node);
                    if (gt_methods.NIL != gt_search.gt_searchedP(node)) {
                        gt_search.gt_mark_all_inferiors_as_unsearched(node);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            }
            result = Sequences.remove_if((SubLObject)gt_methods.$sym119$GT_SEARCHED_, unique_nodes, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 28490L)
    public static SubLObject gt_max_nodes(final SubLObject predicate, final SubLObject v_forts, SubLObject mt, SubLObject direction) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (direction == gt_methods.UNPROVIDED) {
            direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(v_forts, gt_methods.$sym113$LISTP);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw120$MAX_NODES, v_forts, mt, direction, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 28927L)
    public static SubLObject gtm_max_nodes(final SubLObject nodes, SubLObject mt, SubLObject direction) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        if (direction == gt_methods.UNPROVIDED) {
            direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
        }
        final SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
        if (gt_methods.NIL != list_utilities.singletonP(unique_nodes)) {
            return unique_nodes;
        }
        final SubLObject pcase_var = direction;
        if (pcase_var.eql((SubLObject)gt_methods.$kw124$UP)) {
            return gt_max_nodes_up(unique_nodes, mt);
        }
        if (pcase_var.eql((SubLObject)gt_methods.$kw125$DOWN)) {
            return gt_max_nodes_down(unique_nodes, mt);
        }
        return (SubLObject)gt_methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 29394L)
    public static SubLObject gt_max_nodes_down(final SubLObject nodes, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = nodes;
            SubLObject node = (SubLObject)gt_methods.NIL;
            node = cdolist_list_var.first();
            while (gt_methods.NIL != cdolist_list_var) {
                if (gt_methods.NIL == gt_search.gt_searchedP(node)) {
                    gt_search.gt_mark_proper_all_inferiors_as_searched(node);
                    if (gt_methods.NIL != gt_search.gt_searchedP(node)) {
                        gt_search.gt_mark_all_superiors_as_unsearched(node);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                node = cdolist_list_var.first();
            }
            result = Sequences.remove_if(Symbols.symbol_function((SubLObject)gt_methods.$sym119$GT_SEARCHED_), nodes, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 29918L)
    public static SubLObject gt_max_nodes_up_with_hash(final SubLObject nodes, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
            }
            final SubLObject _prev_bind_0_$51 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                final SubLObject nodeshash = Hashtables.make_hash_table(Sequences.length(nodes), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
                SubLObject cdolist_list_var = nodes;
                SubLObject node = (SubLObject)gt_methods.NIL;
                node = cdolist_list_var.first();
                while (gt_methods.NIL != cdolist_list_var) {
                    Hashtables.sethash(node, nodeshash, (SubLObject)gt_methods.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
                cdolist_list_var = nodes;
                node = (SubLObject)gt_methods.NIL;
                node = cdolist_list_var.first();
                while (gt_methods.NIL != cdolist_list_var) {
                    Hashtables.sethash(node, nodeshash, (SubLObject)gt_methods.NIL);
                    if (gt_methods.NIL == gt_search.gt_accessesP(node, nodeshash, Symbols.symbol_function((SubLObject)gt_methods.$sym126$GETHASH))) {
                        result = (SubLObject)ConsesLow.cons(node, result);
                    }
                    Hashtables.sethash(node, nodeshash, (SubLObject)gt_methods.T);
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
            }
            finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$51, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 30490L)
    public static SubLObject gt_max_nodes_up(final SubLObject nodes, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
            }
            final SubLObject _prev_bind_0_$52 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                SubLObject cdolist_list_var = nodes;
                SubLObject node = (SubLObject)gt_methods.NIL;
                node = cdolist_list_var.first();
                while (gt_methods.NIL != cdolist_list_var) {
                    if (gt_methods.NIL == gt_search.gt_accessesP(node, Sequences.remove(node, nodes, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), Symbols.symbol_function((SubLObject)gt_methods.$sym127$MEMBER_))) {
                        result = (SubLObject)ConsesLow.cons(node, result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    node = cdolist_list_var.first();
                }
            }
            finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$52, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 30855L)
    public static SubLObject gt_min_ceilings(final SubLObject predicate, final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(v_forts, gt_methods.$sym113$LISTP);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw128$MIN_CEILINGS, v_forts, candidates, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 31274L)
    public static SubLObject gtm_min_ceilings(final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ceilings = gt_ceilings(v_forts, candidates, mt);
        SubLObject min_nodes = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind((SubLObject)gt_methods.NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_methods.$int132$128, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), thread);
            min_nodes = gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), ceilings, mt);
        }
        finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return min_nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 31647L)
    public static SubLObject gt_ceilings(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_nodes = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind((SubLObject)gt_methods.NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_methods.$int132$128, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), thread);
            max_nodes = gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), nodes, mt, (SubLObject)gt_methods.UNPROVIDED);
        }
        finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        if (gt_methods.NIL == list_utilities.singletonP(max_nodes)) {
            return gt_ceilings_int(max_nodes, candidates, mt);
        }
        if (gt_methods.NIL == candidates || gt_methods.NIL != subl_promotions.memberP(max_nodes.first(), candidates, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED)) {
            return max_nodes;
        }
        return (SubLObject)gt_methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 32065L)
    public static SubLObject gt_ceilings_int(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ceilings = (SubLObject)gt_methods.NIL;
        if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
            Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
            ceilings = gt_search.gt_common_horizon(nodes, candidates, mt);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return ceilings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 32264L)
    public static SubLObject gt_max_floors(final SubLObject predicate, final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(v_forts, gt_methods.$sym113$LISTP);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw133$MAX_FLOORS, v_forts, candidates, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 32677L)
    public static SubLObject gtm_max_floors(final SubLObject v_forts, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject floors = gt_floors(v_forts, candidates, mt);
        SubLObject max_nodes = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
        try {
            gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
            gt_vars.$gt_marking_table$.bind((SubLObject)gt_methods.NIL, thread);
            gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_methods.$int132$128, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), thread);
            max_nodes = gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), floors, mt, (SubLObject)gt_methods.UNPROVIDED);
        }
        finally {
            gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
        }
        return max_nodes;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 33067L)
    public static SubLObject gt_floors(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_methods.NIL != nodes) {
            SubLObject min_nodes = (SubLObject)gt_methods.NIL;
            final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
            final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
            try {
                gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                gt_vars.$gt_marking_table$.bind((SubLObject)gt_methods.NIL, thread);
                gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)gt_methods.$int132$128, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED), thread);
                min_nodes = gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), nodes, mt);
            }
            finally {
                gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
            }
            if (gt_methods.NIL == list_utilities.singletonP(min_nodes)) {
                return gt_floors_int(min_nodes, candidates, mt);
            }
            if (gt_methods.NIL == candidates || gt_methods.NIL != subl_promotions.memberP(min_nodes.first(), candidates, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED)) {
                return min_nodes;
            }
        }
        return (SubLObject)gt_methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 33498L)
    public static SubLObject gt_floors_int(final SubLObject nodes, SubLObject candidates, SubLObject mt) {
        if (candidates == gt_methods.UNPROVIDED) {
            candidates = (SubLObject)gt_methods.NIL;
        }
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject floors = (SubLObject)gt_methods.NIL;
        if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
            Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
        }
        final SubLObject _prev_bind_0 = gt_vars.$gt_mode$.currentBinding(thread);
        try {
            gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
            floors = gt_search.gt_common_horizon(nodes, candidates, mt);
        }
        finally {
            gt_vars.$gt_mode$.rebind(_prev_bind_0, thread);
        }
        return floors;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 33690L)
    public static SubLObject gt_min_superiors_excluding(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(inferior, gt_methods.$sym1$GT_TERM_P);
        enforceType(superior, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw136$MIN_SUPERIORS_EXCLUDING, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 34190L)
    public static SubLObject gtm_min_superiors_excluding(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject immediate_superiors = (SubLObject)gt_methods.NIL;
        SubLObject excluded_forts_superiors = (SubLObject)gt_methods.NIL;
        SubLObject mins = (SubLObject)gt_methods.NIL;
        immediate_superiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_methods.$kw2$SUPERIORS, inferior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        excluded_forts_superiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_methods.$kw2$SUPERIORS, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        mins = gt_min_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), list_utilities.remove_duplicate_forts(ConsesLow.nconc(excluded_forts_superiors, Sequences.delete(superior, immediate_superiors, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED))), (SubLObject)gt_methods.UNPROVIDED);
        return mins;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 34764L)
    public static SubLObject gt_max_inferiors_excluding(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(inferior, gt_methods.$sym1$GT_TERM_P);
        enforceType(superior, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw139$MAX_INFERIORS_EXCLUDING, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 35278L)
    public static SubLObject gtm_max_inferiors_excluding(final SubLObject superior, final SubLObject inferior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject immediate_inferiors = (SubLObject)gt_methods.NIL;
        SubLObject excluded_forts_inferiors = (SubLObject)gt_methods.NIL;
        SubLObject maxs = (SubLObject)gt_methods.NIL;
        immediate_inferiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_methods.$kw17$INFERIORS, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        excluded_forts_inferiors = transitivity.gtm(gt_vars.$gt_pred$.getDynamicValue(thread), (SubLObject)gt_methods.$kw17$INFERIORS, inferior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        maxs = gt_max_nodes(gt_vars.$gt_pred$.getDynamicValue(thread), list_utilities.remove_duplicate_forts(ConsesLow.nconc(excluded_forts_inferiors, Sequences.delete(inferior, immediate_inferiors, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED))), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        return maxs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 35863L)
    public static SubLObject gt_all_superior_edges(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw142$ALL_SUPERIOR_EDGES, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 36181L)
    public static SubLObject gt_all_inferior_edges(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw143$ALL_INFERIOR_EDGES, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 36321L)
    public static SubLObject gtm_all_superior_edges(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_goal_node$.bind(superior, thread);
            gt_vars.$gt_path_list_of_nodes$.bind((SubLObject)ConsesLow.list(inferior), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$53 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$54 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$54 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$55 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_all_edges_to_goal(inferior);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$55, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$54, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$54, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$53, thread);
            }
        }
        finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 36665L)
    public static SubLObject gtm_all_inferior_edges(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        try {
            gt_vars.$gt_goal_node$.bind(inferior, thread);
            gt_vars.$gt_path_list_of_nodes$.bind((SubLObject)ConsesLow.list(superior), thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$57 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
                }
                final SubLObject _prev_bind_0_$58 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$59 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_all_edges_to_goal(superior);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$59, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$58, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$58, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$57, thread);
            }
        }
        finally {
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 37009L)
    public static SubLObject gt_all_paths(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw144$ALL_PATHS, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 37132L)
    public static SubLObject gtm_all_paths(final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_assertions$.currentBinding(thread);
        try {
            gt_vars.$gt_goal_node$.bind(superior, thread);
            gt_vars.$gt_path_list_of_assertions$.bind((SubLObject)gt_methods.NIL, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$61 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                }
                final SubLObject _prev_bind_0_$62 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$63 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_access_all_while_storing_paths(inferior);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$63, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$62, thread);
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$62, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$61, thread);
            }
        }
        finally {
            gt_vars.$gt_path_list_of_assertions$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_goal_node$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 37467L)
    public static SubLObject gt_superior_in_what_mts(final SubLObject predicate, final SubLObject inferior, final SubLObject superior) {
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw145$SUPERIOR_IN_WHAT_MTS, inferior, superior, (SubLObject)gt_methods.$kw146$HIERARCHICALLY_DIRECT, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 38033L)
    public static SubLObject gtm_in_what_mts(final SubLObject start, final SubLObject finish, final SubLObject key_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = (SubLObject)(gt_methods.ONE_INTEGER.eql(gt_vars.$gt_index_arg$.getDynamicValue(thread)) ? gt_methods.$kw10$SUPERIOR : gt_methods.$kw21$INFERIOR);
        SubLObject v_answer = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_what_mts_goal_node$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_path_list_of_nodes$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_path_list_of_mts$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_what_mts_result$.currentBinding(thread);
        try {
            gt_vars.$gt_what_mts_goal_node$.bind(finish, thread);
            gt_vars.$gt_path_list_of_nodes$.bind((SubLObject)gt_methods.NIL, thread);
            gt_vars.$gt_path_list_of_mts$.bind((SubLObject)gt_methods.NIL, thread);
            gt_vars.$gt_what_mts_result$.bind((SubLObject)gt_methods.NIL, thread);
            gt_vars.$gt_path_list_of_nodes$.setDynamicValue((SubLObject)ConsesLow.cons(start, gt_vars.$gt_path_list_of_nodes$.getDynamicValue(thread)), thread);
            gt_which_mts(start, finish, key_method, mode);
            v_answer = genl_mts.max_mts(gt_vars.$gt_what_mts_result$.getDynamicValue(thread), (SubLObject)gt_methods.UNPROVIDED);
        }
        finally {
            gt_vars.$gt_what_mts_result$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_path_list_of_mts$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_path_list_of_nodes$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_what_mts_goal_node$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39065L)
    public static SubLObject gt_which_mts(final SubLObject arg1, final SubLObject arg2, final SubLObject key_method, final SubLObject mode) {
        if (key_method.eql((SubLObject)gt_methods.$kw146$HIERARCHICALLY_DIRECT)) {
            return gt_hierarchically_direct_in_what_mts(arg1, mode);
        }
        return gt_utilities.gt_error((SubLObject)gt_methods.THREE_INTEGER, (SubLObject)gt_methods.$str147$illegal_value_for_method_of_which, key_method, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39361L)
    public static SubLObject gt_hierarchically_direct_in_what_mts(final SubLObject start, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)gt_methods.$sym148$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(gt_methods.$const149$InferencePSC, thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(start, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP(mode)) {
                    Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, mode);
                }
                final SubLObject _prev_bind_0_$65 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind(mode, thread);
                    assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                    final SubLObject _prev_bind_0_$66 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                        result = gt_search.gt_access_all_while_unifying_mts(start);
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$66, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$65, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39684L)
    public static SubLObject associate_node_with_last_spec_total(final SubLObject node) {
        return (SubLObject)gt_methods.ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 39882L)
    public static SubLObject find_spec_cardinality(final SubLObject node) {
        if (gt_methods.NIL != cardinality_estimates.spec_cardinality(node)) {
            return cardinality_estimates.spec_cardinality(node);
        }
        return associate_node_with_last_spec_total(node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40046L)
    public static SubLObject gt_all_inferiors_with_their_max_mts(final SubLObject pred, final SubLObject superior) {
        return transitivity.gtm(pred, (SubLObject)gt_methods.$kw150$INFERIORS_WITH_MTS, superior, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40156L)
    public static SubLObject gtm_all_inferiors_with_mts(final SubLObject root) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject marking_table = Hashtables.make_hash_table(find_spec_cardinality(root), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        SubLObject inferiors_with_mts = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)gt_methods.$sym151$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(gt_methods.$const152$EverythingPSC, thread);
            if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw21$INFERIOR)) {
                Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw21$INFERIOR);
            }
            final SubLObject _prev_bind_0_$67 = gt_vars.$gt_mode$.currentBinding(thread);
            try {
                gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw21$INFERIOR, thread);
                assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                final SubLObject _prev_bind_0_$68 = gt_vars.$gt_truth$.currentBinding(thread);
                final SubLObject _prev_bind_1_$69 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                    gt_vars.$gt_marking_table$.bind(marking_table, thread);
                    inferiors_with_mts = gt_search.gt_all_accessed_with_mts(root);
                }
                finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_1_$69, thread);
                    gt_vars.$gt_truth$.rebind(_prev_bind_0_$68, thread);
                }
            }
            finally {
                gt_vars.$gt_mode$.rebind(_prev_bind_0_$67, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return inferiors_with_mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40527L)
    public static SubLObject find_instance_cardinality(final SubLObject node) {
        if (gt_methods.NIL != cardinality_estimates.instance_cardinality(node)) {
            return cardinality_estimates.instance_cardinality(node);
        }
        return (SubLObject)gt_methods.$int132$128;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 40780L)
    public static SubLObject gt_all_fort_instances_with_their_max_mts(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject real_result = (SubLObject)gt_methods.NIL;
        final SubLObject cols = gt_all_inferiors_with_their_max_mts(gt_methods.$const153$genls, node);
        final SubLObject num_cols = Sequences.length(cols);
        final SubLObject col_mt_hash = Hashtables.make_hash_table(num_cols, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        final SubLObject inst_mt_hash = Hashtables.make_hash_table(find_instance_cardinality(node), (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_methods.NIL, thread);
            SubLObject result = (SubLObject)gt_methods.NIL;
            Errors.sublisp_break((SubLObject)gt_methods.$str154$before_gathering_instances, gt_methods.EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject cdolist_list_var = cols;
            SubLObject col = (SubLObject)gt_methods.NIL;
            col = cdolist_list_var.first();
            while (gt_methods.NIL != cdolist_list_var) {
                Hashtables.sethash(col.first(), col_mt_hash, col.rest());
                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)gt_methods.$sym151$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(gt_methods.$const152$EverythingPSC, thread);
                    gt_search.gt_map_arg_index(Symbols.symbol_function((SubLObject)gt_methods.$sym155$ADD_RESULT_TO_GT_RESULT), col.first(), (SubLObject)gt_methods.TWO_INTEGER, gt_methods.$const156$isa, (SubLObject)gt_methods.$kw12$TRUE);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$70, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            Errors.sublisp_break((SubLObject)gt_methods.$str157$after_instances__before_maximin, gt_methods.EMPTY_SUBL_OBJECT_ARRAY);
            cdolist_list_var = gt_vars.$gt_result$.getDynamicValue(thread);
            SubLObject assrt = (SubLObject)gt_methods.NIL;
            assrt = cdolist_list_var.first();
            while (gt_methods.NIL != cdolist_list_var) {
                final SubLObject inst = assertions_high.gaf_arg1(assrt);
                SubLObject inst_mts = Hashtables.gethash(inst, inst_mt_hash, (SubLObject)gt_methods.UNPROVIDED);
                final SubLObject coll = assertions_high.gaf_arg2(assrt);
                final SubLObject col_mts = Hashtables.gethash(coll, col_mt_hash, (SubLObject)gt_methods.UNPROVIDED);
                final SubLObject valid_mts = gt_search.gt_maximin_mts_among_lists(col_mts, assertions_high.assertion_mt(assrt));
                if (gt_methods.NIL != valid_mts) {
                    inst_mts = list_utilities.remove_duplicate_forts(ConsesLow.append(valid_mts, inst_mts));
                    Hashtables.sethash(inst, inst_mt_hash, inst_mts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assrt = cdolist_list_var.first();
            }
            Errors.sublisp_break((SubLObject)gt_methods.$str158$after_maximin, gt_methods.EMPTY_SUBL_OBJECT_ARRAY);
            SubLObject inst2 = (SubLObject)gt_methods.NIL;
            SubLObject mts = (SubLObject)gt_methods.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(inst_mt_hash);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    inst2 = Hashtables.getEntryKey(cdohash_entry);
                    mts = Hashtables.getEntryValue(cdohash_entry);
                    result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(inst2, gt_max_nodes(gt_methods.$const159$genlMt, mts, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED)), result);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            real_result = result;
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return real_result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 42007L)
    public static SubLObject add_result_to_gt_result(final SubLObject elt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        gt_vars.$gt_result$.setDynamicValue((SubLObject)ConsesLow.cons(elt, gt_vars.$gt_result$.getDynamicValue(thread)), thread);
        return (SubLObject)gt_methods.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 42154L)
    public static SubLObject gt_isa_in_what_mts(final SubLObject inferior, final SubLObject superior) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_methods.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_methods.NIL, thread);
            SubLObject isa_assertion_list = (SubLObject)gt_methods.NIL;
            SubLObject isa_mt = (SubLObject)gt_methods.NIL;
            SubLObject immediate_isa = (SubLObject)gt_methods.NIL;
            SubLObject minimized = (SubLObject)gt_methods.NIL;
            SubLObject path_most_genl_mts = (SubLObject)gt_methods.NIL;
            final SubLObject _prev_bind_0_$71 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)gt_methods.$sym151$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(gt_methods.$const152$EverythingPSC, thread);
                gt_search.gt_map_arg_index(Symbols.symbol_function((SubLObject)gt_methods.$sym155$ADD_RESULT_TO_GT_RESULT), inferior, (SubLObject)gt_methods.ONE_INTEGER, gt_methods.$const156$isa, (SubLObject)gt_methods.$kw12$TRUE);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$71, thread);
            }
            SubLObject cdolist_list_var;
            isa_assertion_list = (cdolist_list_var = gt_vars.$gt_result$.getDynamicValue(thread));
            SubLObject assertion = (SubLObject)gt_methods.NIL;
            assertion = cdolist_list_var.first();
            while (gt_methods.NIL != cdolist_list_var) {
                isa_mt = assertions_high.assertion_mt(assertion);
                immediate_isa = assertions_high.gaf_arg2(assertion);
                path_most_genl_mts = gt_superior_in_what_mts(gt_methods.$const153$genls, immediate_isa, superior);
                if (gt_methods.NIL != path_most_genl_mts) {
                    SubLObject cdolist_list_var_$72 = path_most_genl_mts;
                    SubLObject valid_mt_for_path = (SubLObject)gt_methods.NIL;
                    valid_mt_for_path = cdolist_list_var_$72.first();
                    while (gt_methods.NIL != cdolist_list_var_$72) {
                        minimized = gt_min_nodes(gt_methods.$const159$genlMt, (SubLObject)ConsesLow.list(isa_mt, valid_mt_for_path), (SubLObject)gt_methods.UNPROVIDED);
                        if (gt_methods.NIL != list_utilities.singletonP(minimized)) {
                            result = (SubLObject)ConsesLow.cons(minimized.first(), result);
                        }
                        cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                        valid_mt_for_path = cdolist_list_var_$72.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        result = gt_max_nodes(gt_methods.$const159$genlMt, result, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 43058L)
    public static SubLObject gt_any_superior_path(final SubLObject predicate, final SubLObject inferior, final SubLObject superior, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        enforceType(predicate, gt_methods.$sym0$FORT_P);
        enforceType(inferior, gt_methods.$sym1$GT_TERM_P);
        enforceType(superior, gt_methods.$sym1$GT_TERM_P);
        return transitivity.gtm(predicate, (SubLObject)gt_methods.$kw160$ANY_SUPERIOR_PATH, inferior, superior, mt, (SubLObject)gt_methods.UNPROVIDED, (SubLObject)gt_methods.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-methods.lisp", position = 43558L)
    public static SubLObject gtm_any_superior_path(final SubLObject spec, final SubLObject genl, SubLObject mt) {
        if (mt == gt_methods.UNPROVIDED) {
            mt = (SubLObject)gt_methods.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject path = (SubLObject)gt_methods.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject catch_var = (SubLObject)gt_methods.NIL;
            try {
                thread.throwStack.push(gt_methods.$kw8$GT_ERROR);
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(spec, (SubLObject)gt_methods.$kw9$GT_INDEX, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (gt_methods.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(genl, (SubLObject)gt_methods.$kw20$GT_GATHER, (SubLObject)gt_methods.THREE_INTEGER);
                }
                if (genl.eql(spec)) {
                    if (gt_methods.NIL != kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread))) {
                        path = (SubLObject)ConsesLow.list(spec);
                    }
                }
                else {
                    if (gt_methods.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_methods.NIL == gt_utilities.gt_modeP((SubLObject)gt_methods.$kw10$SUPERIOR)) {
                        Errors.error((SubLObject)gt_methods.$str11$invalid_gt_mode___a, (SubLObject)gt_methods.$kw10$SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$73 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_methods.$kw10$SUPERIOR, thread);
                        assert gt_methods.NIL != enumeration_types.truth_p((SubLObject)gt_methods.$kw12$TRUE) : gt_methods.$kw12$TRUE;
                        final SubLObject _prev_bind_0_$74 = gt_vars.$gt_truth$.currentBinding(thread);
                        try {
                            gt_vars.$gt_truth$.bind((SubLObject)gt_methods.$kw12$TRUE, thread);
                            path = gt_search.gt_any_access_path(spec, genl);
                        }
                        finally {
                            gt_vars.$gt_truth$.rebind(_prev_bind_0_$74, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$73, thread);
                    }
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)gt_methods.$kw8$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return path;
    }
    
    public static SubLObject declare_gt_methods_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_superiors", "GT-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_superiors", "GTM-SUPERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_min_superiors", "GT-MIN-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_min_superiors", "GTM-MIN-SUPERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_inferiors", "GT-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_inferiors", "GTM-INFERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_inferiors", "GT-MAX-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_max_inferiors", "GTM-MAX-INFERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_co_superiors", "GT-CO-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_co_superiors", "GTM-CO-SUPERIORS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_co_inferiors", "GT-CO-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_co_inferiors", "GTM-CO-INFERIORS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_redundant_superiors", "GT-REDUNDANT-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_redundant_superiors", "GTM-REDUNDANT-SUPERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_redundant_inferiors", "GT-REDUNDANT-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_redundant_inferiors", "GTM-REDUNDANT-INFERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_superiors", "GT-ALL-SUPERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_superiors", "GTM-ALL-SUPERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_inferiors", "GT-ALL-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_inferiors", "GTM-ALL-INFERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_union_all_inferiors", "GT-UNION-ALL-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_union_all_inferiors", "GTM-UNION-ALL-INFERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_accessible", "GT-ALL-ACCESSIBLE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_accessible", "GTM-ALL-ACCESSIBLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_roots", "GT-ROOTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_roots", "GTM-ROOTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_leaves", "GT-LEAVES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_leaves", "GTM-LEAVES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_compose_fn_all_superiors", "GT-COMPOSE-FN-ALL-SUPERIORS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_compose_fn_all_superiors", "GTM-COMPOSE-FN-ALL-SUPERIORS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_compose_fn_all_inferiors", "GT-COMPOSE-FN-ALL-INFERIORS", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_compose_fn_all_inferiors", "GTM-COMPOSE-FN-ALL-INFERIORS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_compose_pred_all_superiors", "GT-COMPOSE-PRED-ALL-SUPERIORS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_compose_pred_all_superiors", "GTM-COMPOSE-PRED-ALL-SUPERIORS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_compose_pred_all_inferiors", "GT-COMPOSE-PRED-ALL-INFERIORS", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_compose_pred_all_inferiors", "GTM-COMPOSE-PRED-ALL-INFERIORS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_dependent_inferiors", "GT-ALL-DEPENDENT-INFERIORS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_dependent_inferiors", "GTM-ALL-DEPENDENT-INFERIORS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_booleanP", "GT-BOOLEAN?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_booleanP", "GTM-BOOLEAN?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_superiorP", "GT-SUPERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_superiorP", "GTM-SUPERIOR?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_why_superiorP", "GT-WHY-SUPERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_support_predicate", "GT-SUPPORT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_support_sentence", "GT-SUPPORT-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_why_superiorP", "GTM-WHY-SUPERIOR?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_inferiorP", "GT-INFERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_inferiorP", "GTM-INFERIOR?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_has_superiorP", "GT-HAS-SUPERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_has_superiorP", "GTM-HAS-SUPERIOR?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_has_inferiorP", "GT-HAS-INFERIOR?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_has_inferiorP", "GTM-HAS-INFERIOR?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_gather_inferior", "GT-GATHER-INFERIOR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_gather_inferior", "GTM-GATHER-INFERIOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_gather_superior", "GT-GATHER-SUPERIOR", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_gather_superior", "GTM-GATHER-SUPERIOR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_cyclesP", "GT-CYCLES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_cyclesP", "GTM-CYCLES?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_completes_cycleP", "GT-COMPLETES-CYCLE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_completes_cycleP", "GTM-COMPLETES-CYCLE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_why_completes_cycleP", "GT-WHY-COMPLETES-CYCLE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_why_completes_cycleP", "GTM-WHY-COMPLETES-CYCLE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_min_nodes", "GT-MIN-NODES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_min_nodes", "GTM-MIN-NODES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_nodes", "GT-MAX-NODES", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_max_nodes", "GTM-MAX-NODES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_nodes_down", "GT-MAX-NODES-DOWN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_nodes_up_with_hash", "GT-MAX-NODES-UP-WITH-HASH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_nodes_up", "GT-MAX-NODES-UP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_min_ceilings", "GT-MIN-CEILINGS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_min_ceilings", "GTM-MIN-CEILINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_ceilings", "GT-CEILINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_ceilings_int", "GT-CEILINGS-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_floors", "GT-MAX-FLOORS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_max_floors", "GTM-MAX-FLOORS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_floors", "GT-FLOORS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_floors_int", "GT-FLOORS-INT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_min_superiors_excluding", "GT-MIN-SUPERIORS-EXCLUDING", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_min_superiors_excluding", "GTM-MIN-SUPERIORS-EXCLUDING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_max_inferiors_excluding", "GT-MAX-INFERIORS-EXCLUDING", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_max_inferiors_excluding", "GTM-MAX-INFERIORS-EXCLUDING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_superior_edges", "GT-ALL-SUPERIOR-EDGES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_inferior_edges", "GT-ALL-INFERIOR-EDGES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_superior_edges", "GTM-ALL-SUPERIOR-EDGES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_inferior_edges", "GTM-ALL-INFERIOR-EDGES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_paths", "GT-ALL-PATHS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_paths", "GTM-ALL-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_superior_in_what_mts", "GT-SUPERIOR-IN-WHAT-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_in_what_mts", "GTM-IN-WHAT-MTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_which_mts", "GT-WHICH-MTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_hierarchically_direct_in_what_mts", "GT-HIERARCHICALLY-DIRECT-IN-WHAT-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "associate_node_with_last_spec_total", "ASSOCIATE-NODE-WITH-LAST-SPEC-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "find_spec_cardinality", "FIND-SPEC-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_inferiors_with_their_max_mts", "GT-ALL-INFERIORS-WITH-THEIR-MAX-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_all_inferiors_with_mts", "GTM-ALL-INFERIORS-WITH-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "find_instance_cardinality", "FIND-INSTANCE-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_all_fort_instances_with_their_max_mts", "GT-ALL-FORT-INSTANCES-WITH-THEIR-MAX-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "add_result_to_gt_result", "ADD-RESULT-TO-GT-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_isa_in_what_mts", "GT-ISA-IN-WHAT-MTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gt_any_superior_path", "GT-ANY-SUPERIOR-PATH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_methods", "gtm_any_superior_path", "GTM-ANY-SUPERIOR-PATH", 2, 1, false);
        return (SubLObject)gt_methods.NIL;
    }
    
    public static SubLObject init_gt_methods_file() {
        return (SubLObject)gt_methods.NIL;
    }
    
    public static SubLObject setup_gt_methods_file() {
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym3$GT_SUPERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str5$Returns_direct_superiors_of_FORT_, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym15$GT_MIN_SUPERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str16$Returns_minimal_superiors_of_FORT, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym18$GT_INFERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str19$Returns_direct_inferiors_of_FORT_, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym23$GT_MAX_INFERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str24$Returns_maximal_inferiors_of_FORT, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym26$GT_CO_SUPERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str27$Returns_sibling_direct_superiors_, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym29$GT_CO_INFERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str30$Returns_sibling_direct_inferiors_, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym32$GT_REDUNDANT_SUPERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str33$Returns_direct_superiors_of_FORT_, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym35$GT_REDUNDANT_INFERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str36$Returns_direct_inferiors_of_FORT_, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym38$GT_ALL_SUPERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str39$Returns_all_superiors_of_FORT_via, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym41$GT_ALL_INFERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str42$Returns_all_inferiors_of_FORT_via, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym45$GT_ALL_ACCESSIBLE, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str46$Returns_all_superiors_and_all_inf, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym50$GT_ROOTS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str51$Returns_maximal_superiors__i_e___, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym53$GT_LEAVES, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str54$Returns_minimal_inferiors__i_e___, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym58$GT_COMPOSE_FN_ALL_SUPERIORS, (SubLObject)gt_methods.$list59, (SubLObject)gt_methods.$str60$Apply_fn_to_each_superior_of_FORT, (SubLObject)gt_methods.$list61, (SubLObject)gt_methods.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym63$GT_COMPOSE_FN_ALL_INFERIORS, (SubLObject)gt_methods.$list64, (SubLObject)gt_methods.$str65$Apply_fn_to_each_inferior_of_FORT, (SubLObject)gt_methods.$list61, (SubLObject)gt_methods.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym68$GT_COMPOSE_PRED_ALL_SUPERIORS, (SubLObject)gt_methods.$list69, (SubLObject)gt_methods.$str70$Returns_all_nodes_accessible_by_C, (SubLObject)gt_methods.$list71, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym74$GT_COMPOSE_PRED_ALL_INFERIORS, (SubLObject)gt_methods.$list69, (SubLObject)gt_methods.$str75$Returns_all_nodes_accessible_by_C, (SubLObject)gt_methods.$list71, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym77$GT_ALL_DEPENDENT_INFERIORS, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str78$Returns_all_inferiors_i_of_FORT_s, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym82$GT_WHY_SUPERIOR_, (SubLObject)gt_methods.$list83, (SubLObject)gt_methods.$str84$Returns_justification_of_why_SUPE, (SubLObject)gt_methods.$list85, (SubLObject)gt_methods.$list86);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym93$GT_HAS_SUPERIOR_, (SubLObject)gt_methods.$list94, (SubLObject)gt_methods.$str95$Returns_whetherfort_INFERIOR_is_h, (SubLObject)gt_methods.$list96, (SubLObject)gt_methods.$list97);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym98$GT_HAS_INFERIOR_, (SubLObject)gt_methods.$list83, (SubLObject)gt_methods.$str99$Returns_whether_fort_SUPERIOR_is_, (SubLObject)gt_methods.$list85, (SubLObject)gt_methods.$list97);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym103$GT_CYCLES_, (SubLObject)gt_methods.$list4, (SubLObject)gt_methods.$str104$Returns_whether_FORT_is_accessibl, (SubLObject)gt_methods.$list6, (SubLObject)gt_methods.$list97);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym106$GT_COMPLETES_CYCLE_, (SubLObject)gt_methods.$list107, (SubLObject)gt_methods.$str108$Returns_whether_a_transitive_path, (SubLObject)gt_methods.$list109, (SubLObject)gt_methods.$list97);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym111$GT_WHY_COMPLETES_CYCLE_, (SubLObject)gt_methods.$list107, (SubLObject)gt_methods.$str112$Returns_justification_that_a_tran, (SubLObject)gt_methods.$list109, (SubLObject)gt_methods.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym115$GT_MIN_NODES, (SubLObject)gt_methods.$list116, (SubLObject)gt_methods.$str117$Returns_returns_the_most_subordin, (SubLObject)gt_methods.$list118, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym121$GT_MAX_NODES, (SubLObject)gt_methods.$list122, (SubLObject)gt_methods.$str123$Returns_returns_the_least_subordi, (SubLObject)gt_methods.$list118, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym129$GT_MIN_CEILINGS, (SubLObject)gt_methods.$list130, (SubLObject)gt_methods.$str131$Returns_the_most_subordinate_comm, (SubLObject)gt_methods.$list118, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym134$GT_MAX_FLOORS, (SubLObject)gt_methods.$list130, (SubLObject)gt_methods.$str135$Returns_the_least_subordinate_ele, (SubLObject)gt_methods.$list118, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym137$GT_MIN_SUPERIORS_EXCLUDING, (SubLObject)gt_methods.$list94, (SubLObject)gt_methods.$str138$Returns_least_general_superiors_o, (SubLObject)gt_methods.$list96, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym140$GT_MAX_INFERIORS_EXCLUDING, (SubLObject)gt_methods.$list94, (SubLObject)gt_methods.$str141$Returns_most_general_inferiors_of, (SubLObject)gt_methods.$list96, (SubLObject)gt_methods.$list7);
        utilities_macros.register_cyc_api_function((SubLObject)gt_methods.$sym161$GT_ANY_SUPERIOR_PATH, (SubLObject)gt_methods.$list94, (SubLObject)gt_methods.$str162$Returns_list_of_nodes_connecting_, (SubLObject)gt_methods.$list96, (SubLObject)gt_methods.$list7);
        return (SubLObject)gt_methods.NIL;
    }
    
    public void declareFunctions() {
        declare_gt_methods_file();
    }
    
    public void initializeVariables() {
        init_gt_methods_file();
    }
    
    public void runTopLevelForms() {
        setup_gt_methods_file();
    }
    
    static {
        me = (SubLFile)new gt_methods();
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym1$GT_TERM_P = SubLObjectFactory.makeSymbol("GT-TERM-P");
        $kw2$SUPERIORS = SubLObjectFactory.makeKeyword("SUPERIORS");
        $sym3$GT_SUPERIORS = SubLObjectFactory.makeSymbol("GT-SUPERIORS");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str5$Returns_direct_superiors_of_FORT_ = SubLObjectFactory.makeString("Returns direct superiors of FORT via transitive PREDICATE");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")));
        $kw8$GT_ERROR = SubLObjectFactory.makeKeyword("GT-ERROR");
        $kw9$GT_INDEX = SubLObjectFactory.makeKeyword("GT-INDEX");
        $kw10$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $str11$invalid_gt_mode___a = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $kw12$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym13$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $kw14$MIN_SUPERIORS = SubLObjectFactory.makeKeyword("MIN-SUPERIORS");
        $sym15$GT_MIN_SUPERIORS = SubLObjectFactory.makeSymbol("GT-MIN-SUPERIORS");
        $str16$Returns_minimal_superiors_of_FORT = SubLObjectFactory.makeString("Returns minimal superiors of FORT via transitive PREDICATE");
        $kw17$INFERIORS = SubLObjectFactory.makeKeyword("INFERIORS");
        $sym18$GT_INFERIORS = SubLObjectFactory.makeSymbol("GT-INFERIORS");
        $str19$Returns_direct_inferiors_of_FORT_ = SubLObjectFactory.makeString("Returns direct inferiors of FORT via transitive PREDICATE");
        $kw20$GT_GATHER = SubLObjectFactory.makeKeyword("GT-GATHER");
        $kw21$INFERIOR = SubLObjectFactory.makeKeyword("INFERIOR");
        $kw22$MAX_INFERIORS = SubLObjectFactory.makeKeyword("MAX-INFERIORS");
        $sym23$GT_MAX_INFERIORS = SubLObjectFactory.makeSymbol("GT-MAX-INFERIORS");
        $str24$Returns_maximal_inferiors_of_FORT = SubLObjectFactory.makeString("Returns maximal inferiors of FORT via transitive PREDICATE");
        $kw25$CO_SUPERIORS = SubLObjectFactory.makeKeyword("CO-SUPERIORS");
        $sym26$GT_CO_SUPERIORS = SubLObjectFactory.makeSymbol("GT-CO-SUPERIORS");
        $str27$Returns_sibling_direct_superiors_ = SubLObjectFactory.makeString("Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself");
        $kw28$CO_INFERIORS = SubLObjectFactory.makeKeyword("CO-INFERIORS");
        $sym29$GT_CO_INFERIORS = SubLObjectFactory.makeSymbol("GT-CO-INFERIORS");
        $str30$Returns_sibling_direct_inferiors_ = SubLObjectFactory.makeString("Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself");
        $kw31$REDUNDANT_SUPERIORS = SubLObjectFactory.makeKeyword("REDUNDANT-SUPERIORS");
        $sym32$GT_REDUNDANT_SUPERIORS = SubLObjectFactory.makeSymbol("GT-REDUNDANT-SUPERIORS");
        $str33$Returns_direct_superiors_of_FORT_ = SubLObjectFactory.makeString("Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors");
        $kw34$REDUNDANT_INFERIORS = SubLObjectFactory.makeKeyword("REDUNDANT-INFERIORS");
        $sym35$GT_REDUNDANT_INFERIORS = SubLObjectFactory.makeSymbol("GT-REDUNDANT-INFERIORS");
        $str36$Returns_direct_inferiors_of_FORT_ = SubLObjectFactory.makeString("Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors");
        $kw37$ALL_SUPERIORS = SubLObjectFactory.makeKeyword("ALL-SUPERIORS");
        $sym38$GT_ALL_SUPERIORS = SubLObjectFactory.makeSymbol("GT-ALL-SUPERIORS");
        $str39$Returns_all_superiors_of_FORT_via = SubLObjectFactory.makeString("Returns all superiors of FORT via PREDICATE");
        $kw40$ALL_INFERIORS = SubLObjectFactory.makeKeyword("ALL-INFERIORS");
        $sym41$GT_ALL_INFERIORS = SubLObjectFactory.makeSymbol("GT-ALL-INFERIORS");
        $str42$Returns_all_inferiors_of_FORT_via = SubLObjectFactory.makeString("Returns all inferiors of FORT via PREDICATE");
        $kw43$UNION_ALL_INFERIORS = SubLObjectFactory.makeKeyword("UNION-ALL-INFERIORS");
        $kw44$ALL_ACCESSIBLE = SubLObjectFactory.makeKeyword("ALL-ACCESSIBLE");
        $sym45$GT_ALL_ACCESSIBLE = SubLObjectFactory.makeSymbol("GT-ALL-ACCESSIBLE");
        $str46$Returns_all_superiors_and_all_inf = SubLObjectFactory.makeString("Returns all superiors and all inferiors of FORT via PREDICATE");
        $kw47$GT_EITHER = SubLObjectFactory.makeKeyword("GT-EITHER");
        $kw48$ACCESSIBLE = SubLObjectFactory.makeKeyword("ACCESSIBLE");
        $kw49$ROOTS = SubLObjectFactory.makeKeyword("ROOTS");
        $sym50$GT_ROOTS = SubLObjectFactory.makeSymbol("GT-ROOTS");
        $str51$Returns_maximal_superiors__i_e___ = SubLObjectFactory.makeString("Returns maximal superiors (i.e., roots) of FORT via PREDICATE");
        $kw52$LEAVES = SubLObjectFactory.makeKeyword("LEAVES");
        $sym53$GT_LEAVES = SubLObjectFactory.makeSymbol("GT-LEAVES");
        $str54$Returns_minimal_inferiors__i_e___ = SubLObjectFactory.makeString("Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE");
        $sym55$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym56$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $kw57$COMPOSE_FN_SUPERIORS = SubLObjectFactory.makeKeyword("COMPOSE-FN-SUPERIORS");
        $sym58$GT_COMPOSE_FN_ALL_SUPERIORS = SubLObjectFactory.makeSymbol("GT-COMPOSE-FN-ALL-SUPERIORS");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMBINE-FN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CONS"))), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str60$Apply_fn_to_each_superior_of_FORT = SubLObjectFactory.makeString("Apply fn to each superior of FORT;\n   fn takes a fort as its only arg, and must not effect the search status of each\n  fort it visits");
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P")));
        $kw62$COMPOSE_FN_INFERIORS = SubLObjectFactory.makeKeyword("COMPOSE-FN-INFERIORS");
        $sym63$GT_COMPOSE_FN_ALL_INFERIORS = SubLObjectFactory.makeSymbol("GT-COMPOSE-FN-ALL-INFERIORS");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMBINE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-COMBINE-FN*")), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str65$Apply_fn_to_each_inferior_of_FORT = SubLObjectFactory.makeString("Apply fn to each inferior of FORT; \n   fn takes a fort as its only arg, and \n   it must not effect the search status of each fort it visits");
        $sym66$PREDICATE_IN_ANY_MT_ = SubLObjectFactory.makeSymbol("PREDICATE-IN-ANY-MT?");
        $kw67$COMPOSE_PRED_SUPERIORS = SubLObjectFactory.makeKeyword("COMPOSE-PRED-SUPERIORS");
        $sym68$GT_COMPOSE_PRED_ALL_SUPERIORS = SubLObjectFactory.makeSymbol("GT-COMPOSE-PRED-ALL-SUPERIORS");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("COMPOSE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSE-INDEX-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-COMPOSE-INDEX-ARG*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSE-GATHER-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-COMPOSE-GATHER-ARG*")), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str70$Returns_all_nodes_accessible_by_C = SubLObjectFactory.makeString("Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along \n  transitive PREDICATE");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPOSE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE-IN-ANY-MT?")));
        $sym72$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $kw73$COMPOSE_PRED_INFERIORS = SubLObjectFactory.makeKeyword("COMPOSE-PRED-INFERIORS");
        $sym74$GT_COMPOSE_PRED_ALL_INFERIORS = SubLObjectFactory.makeSymbol("GT-COMPOSE-PRED-ALL-INFERIORS");
        $str75$Returns_all_nodes_accessible_by_C = SubLObjectFactory.makeString("Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along \n  transitive PREDICATE");
        $kw76$ALL_DEPENDENT_INFERIORS = SubLObjectFactory.makeKeyword("ALL-DEPENDENT-INFERIORS");
        $sym77$GT_ALL_DEPENDENT_INFERIORS = SubLObjectFactory.makeSymbol("GT-ALL-DEPENDENT-INFERIORS");
        $str78$Returns_all_inferiors_i_of_FORT_s = SubLObjectFactory.makeString("Returns all inferiors i of FORT s.t. every path connecting i to \n   any superior of FORT must pass through FORT");
        $kw79$BOOLEAN_ = SubLObjectFactory.makeKeyword("BOOLEAN?");
        $kw80$SUPERIOR_ = SubLObjectFactory.makeKeyword("SUPERIOR?");
        $kw81$WHY_SUPERIOR_ = SubLObjectFactory.makeKeyword("WHY-SUPERIOR?");
        $sym82$GT_WHY_SUPERIOR_ = SubLObjectFactory.makeSymbol("GT-WHY-SUPERIOR?");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str84$Returns_justification_of_why_SUPE = SubLObjectFactory.makeString("Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than) \n  INFERIOR");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")));
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-P")));
        $kw87$REFLEXIVE = SubLObjectFactory.makeKeyword("REFLEXIVE");
        $kw88$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const89$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const90$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw91$INFERIOR_ = SubLObjectFactory.makeKeyword("INFERIOR?");
        $kw92$HAS_SUPERIOR_ = SubLObjectFactory.makeKeyword("HAS-SUPERIOR?");
        $sym93$GT_HAS_SUPERIOR_ = SubLObjectFactory.makeSymbol("GT-HAS-SUPERIOR?");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str95$Returns_whetherfort_INFERIOR_is_h = SubLObjectFactory.makeString("Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE) \n  to fort SUPERIOR?");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPERIOR"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")));
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym98$GT_HAS_INFERIOR_ = SubLObjectFactory.makeSymbol("GT-HAS-INFERIOR?");
        $str99$Returns_whether_fort_SUPERIOR_is_ = SubLObjectFactory.makeString("Returns whether fort SUPERIOR is hierarchically higher \n   (wrt transitive PREDICATE) to fort INFERIOR?");
        $kw100$GATHER_INFERIOR = SubLObjectFactory.makeKeyword("GATHER-INFERIOR");
        $kw101$GATHER_SUPERIOR = SubLObjectFactory.makeKeyword("GATHER-SUPERIOR");
        $kw102$CYCLES_ = SubLObjectFactory.makeKeyword("CYCLES?");
        $sym103$GT_CYCLES_ = SubLObjectFactory.makeSymbol("GT-CYCLES?");
        $str104$Returns_whether_FORT_is_accessibl = SubLObjectFactory.makeString("Returns whether FORT is accessible from itself by one or more PREDICATE gafs?");
        $kw105$COMPLETES_CYCLE_ = SubLObjectFactory.makeKeyword("COMPLETES-CYCLE?");
        $sym106$GT_COMPLETES_CYCLE_ = SubLObjectFactory.makeSymbol("GT-COMPLETES-CYCLE?");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT1"), (SubLObject)SubLObjectFactory.makeSymbol("FORT2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str108$Returns_whether_a_transitive_path = SubLObjectFactory.makeString("Returns whether a transitive path connect FORT2 to FORT1, \n   or whether a transitive inverse path connect FORT1 to FORT2?");
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT1"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT2"), (SubLObject)SubLObjectFactory.makeSymbol("GT-TERM-P")));
        $kw110$WHY_COMPLETES_CYCLE_ = SubLObjectFactory.makeKeyword("WHY-COMPLETES-CYCLE?");
        $sym111$GT_WHY_COMPLETES_CYCLE_ = SubLObjectFactory.makeSymbol("GT-WHY-COMPLETES-CYCLE?");
        $str112$Returns_justification_that_a_tran = SubLObjectFactory.makeString("Returns justification that a transitive path connects FORT2 to FORT1, \n   or that a transitive inverse path connects FORT1 to FORT2?");
        $sym113$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $kw114$MIN_NODES = SubLObjectFactory.makeKeyword("MIN-NODES");
        $sym115$GT_MIN_NODES = SubLObjectFactory.makeSymbol("GT-MIN-NODES");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str117$Returns_returns_the_most_subordin = SubLObjectFactory.makeString("Returns returns the most-subordinate elements of FORTS\n   (one member only of a cycle will be a min-node candidate)");
        $list118 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym119$GT_SEARCHED_ = SubLObjectFactory.makeSymbol("GT-SEARCHED?");
        $kw120$MAX_NODES = SubLObjectFactory.makeKeyword("MAX-NODES");
        $sym121$GT_MAX_NODES = SubLObjectFactory.makeSymbol("GT-MAX-NODES");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-MAX-NODES-DIRECTION*")));
        $str123$Returns_returns_the_least_subordi = SubLObjectFactory.makeString("Returns returns the least-subordinate elements of FORTS\n   (<direction> should be :up unless all nodes are low in the hierarchy)");
        $kw124$UP = SubLObjectFactory.makeKeyword("UP");
        $kw125$DOWN = SubLObjectFactory.makeKeyword("DOWN");
        $sym126$GETHASH = SubLObjectFactory.makeSymbol("GETHASH");
        $sym127$MEMBER_ = SubLObjectFactory.makeSymbol("MEMBER?");
        $kw128$MIN_CEILINGS = SubLObjectFactory.makeKeyword("MIN-CEILINGS");
        $sym129$GT_MIN_CEILINGS = SubLObjectFactory.makeSymbol("GT-MIN-CEILINGS");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("FORTS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str131$Returns_the_most_subordinate_comm = SubLObjectFactory.makeString("Returns the most-subordinate common superiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");
        $int132$128 = SubLObjectFactory.makeInteger(128);
        $kw133$MAX_FLOORS = SubLObjectFactory.makeKeyword("MAX-FLOORS");
        $sym134$GT_MAX_FLOORS = SubLObjectFactory.makeSymbol("GT-MAX-FLOORS");
        $str135$Returns_the_least_subordinate_ele = SubLObjectFactory.makeString("Returns the least-subordinate elements or common inferiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");
        $kw136$MIN_SUPERIORS_EXCLUDING = SubLObjectFactory.makeKeyword("MIN-SUPERIORS-EXCLUDING");
        $sym137$GT_MIN_SUPERIORS_EXCLUDING = SubLObjectFactory.makeSymbol("GT-MIN-SUPERIORS-EXCLUDING");
        $str138$Returns_least_general_superiors_o = SubLObjectFactory.makeString("Returns least-general superiors of INFERIOR ignoring SUPERIOR\n   (useful for splicing-out SUPERIOR from hierarchy)");
        $kw139$MAX_INFERIORS_EXCLUDING = SubLObjectFactory.makeKeyword("MAX-INFERIORS-EXCLUDING");
        $sym140$GT_MAX_INFERIORS_EXCLUDING = SubLObjectFactory.makeSymbol("GT-MAX-INFERIORS-EXCLUDING");
        $str141$Returns_most_general_inferiors_of = SubLObjectFactory.makeString("Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n   (useful for splicing-out INFERIOR from hierarchy)");
        $kw142$ALL_SUPERIOR_EDGES = SubLObjectFactory.makeKeyword("ALL-SUPERIOR-EDGES");
        $kw143$ALL_INFERIOR_EDGES = SubLObjectFactory.makeKeyword("ALL-INFERIOR-EDGES");
        $kw144$ALL_PATHS = SubLObjectFactory.makeKeyword("ALL-PATHS");
        $kw145$SUPERIOR_IN_WHAT_MTS = SubLObjectFactory.makeKeyword("SUPERIOR-IN-WHAT-MTS");
        $kw146$HIERARCHICALLY_DIRECT = SubLObjectFactory.makeKeyword("HIERARCHICALLY-DIRECT");
        $str147$illegal_value_for_method_of_which = SubLObjectFactory.makeString("illegal value for method of which-mts: ~s");
        $sym148$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $const149$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw150$INFERIORS_WITH_MTS = SubLObjectFactory.makeKeyword("INFERIORS-WITH-MTS");
        $sym151$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const152$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const153$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str154$before_gathering_instances = SubLObjectFactory.makeString("before gathering instances");
        $sym155$ADD_RESULT_TO_GT_RESULT = SubLObjectFactory.makeSymbol("ADD-RESULT-TO-GT-RESULT");
        $const156$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $str157$after_instances__before_maximin = SubLObjectFactory.makeString("after instances, before maximin");
        $str158$after_maximin = SubLObjectFactory.makeString("after maximin");
        $const159$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $kw160$ANY_SUPERIOR_PATH = SubLObjectFactory.makeKeyword("ANY-SUPERIOR-PATH");
        $sym161$GT_ANY_SUPERIOR_PATH = SubLObjectFactory.makeSymbol("GT-ANY-SUPERIOR-PATH");
        $str162$Returns_list_of_nodes_connecting_ = SubLObjectFactory.makeString("Returns list of nodes connecting INFERIOR with SUPERIOR");
    }
}

/*

	Total time: 1122 ms
	
*/