package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.utilities_macros.$unprovided$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transfers_through extends SubLTranslatedFile {
    public static final SubLFile me = new transfers_through();

    public static final String myName = "com.cyc.cycjava.cycl.transfers_through";

    public static final String myFingerPrint = "6527f4e1f1ed85fdaf5f35761a299cc817cf2218d179f3e32ba12825e435be7b";

    // Internal Constants
    public static final SubLString $str0$___transitiveViaArg__s__s_1__not_ = makeString("(#$transitiveViaArg ~s ~s 1) not declared");

    public static final SubLString $str1$___transitiveViaArg__s__s_2__not_ = makeString("(#$transitiveViaArg ~s ~s 2) not declared");

    public static final SubLString $str2$___transitiveViaArgInverse__s__s_ = makeString("(#$transitiveViaArgInverse ~s ~s 1) not declared");

    public static final SubLString $str3$___transitiveViaArgInverse__s__s_ = makeString("(#$transitiveViaArgInverse ~s ~s 2) not declared");

    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));

    public static final SubLList $list5 = list(ONE_INTEGER);

    public static final SubLList $list6 = list(TWO_INTEGER);

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    private static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLString $str9$invalid_gtm_method___s = makeString("invalid gtm method: ~s");

    public static final SubLString $str10$method__s_maps_into_illegal_gt_fu = makeString("method ~s maps into illegal gt function ~s)");

    public static final SubLString $str11$illegal_transfers_through_method_ = makeString("illegal transfers-through method: ~s");



    public static final SubLSymbol $sym13$_OPTIONAL = makeSymbol("&OPTIONAL");

    public static final SubLString $str14$_s_was_not_a_valid_transitivity_m = makeString("~s was not a valid transitivity-module parameter");









    public static final SubLString $str19$invalid_gt_mode___a = makeString("invalid gt mode: ~a");





    public static final SubLString $str22$_s_marked_constants___s = makeString("~s marked constants: ~s");













    public static final SubLSymbol GT_GATHER_LINK_NODE = makeSymbol("GT-GATHER-LINK-NODE");



    public static final SubLSymbol GT_MAP_LINKS = makeSymbol("GT-MAP-LINKS");

    public static final SubLSymbol GT_TEST_LINK_NODE = makeSymbol("GT-TEST-LINK-NODE");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLSymbol GT_GATHER_LINK_NODE_AND_MT = makeSymbol("GT-GATHER-LINK-NODE-AND-MT");

    public static final SubLList $list36 = cons(makeSymbol("NODE"), makeSymbol("MT"));



    static final boolean assertionsDisabledSynth = true;

    public static SubLObject ttm(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != transfers_throughP(predicate, conduit_predicate, UNPROVIDED)) {
                final SubLObject _prev_bind_0_$1 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                } finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$2, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$1, thread);
                }
            } else {
                gt_utilities.gt_error(THREE_INTEGER, $str0$___transitiveViaArg__s__s_1__not_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ittm(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if ((NIL != gt_vars.gt_within_transitive_via_argP()) || (NIL != inverse_transfers_throughP(predicate, conduit_predicate, UNPROVIDED))) {
                final SubLObject _prev_bind_0_$3 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                } finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$4, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$3, thread);
                }
            } else {
                gt_utilities.gt_error(THREE_INTEGER, $str1$___transitiveViaArg__s__s_2__not_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ttim(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != transfers_through_inverseP(predicate, conduit_predicate, UNPROVIDED)) {
                final SubLObject _prev_bind_0_$5 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                } finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$6, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$5, thread);
                }
            } else {
                gt_utilities.gt_error(THREE_INTEGER, $str2$___transitiveViaArgInverse__s__s_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject ittim(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL != inverse_transfers_through_inverseP(predicate, conduit_predicate, UNPROVIDED)) {
                final SubLObject _prev_bind_0_$7 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind(TWO_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind(ONE_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                } finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$8, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$7, thread);
                }
            } else {
                gt_utilities.gt_error(THREE_INTEGER, $str3$___transitiveViaArgInverse__s__s_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject transfers_throughP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArg, predicate, conduit_predicate, $list5), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inverse_transfers_throughP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArg, predicate, conduit_predicate, $list6), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject transfers_through_inverseP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArgInverse, predicate, conduit_predicate, $list5), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inverse_transfers_through_inverseP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArgInverse, predicate, conduit_predicate, $list6), mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tt_methodP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generic_ttm(final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = $unprovided$.getGlobalValue();
        }
        if (arg2 == UNPROVIDED) {
            arg2 = $unprovided$.getGlobalValue();
        }
        if (arg3 == UNPROVIDED) {
            arg3 = $unprovided$.getGlobalValue();
        }
        if (arg4 == UNPROVIDED) {
            arg4 = $unprovided$.getGlobalValue();
        }
        if (arg5 == UNPROVIDED) {
            arg5 = $unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject tti_function = tt_method_function(method);
        if (tti_function.isFunctionSpec()) {
            if (NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                result = transitivity.apply_gti_function(tti_function, arg1, arg2, arg3, arg4, arg5);
            } else {
                final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind(NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                    result = transitivity.apply_gti_function(tti_function, arg1, arg2, arg3, arg4, arg5);
                } finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                }
            }
        } else {
            gt_utilities.gt_error(THREE_INTEGER, $str9$invalid_gtm_method___s, tti_function, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject tt_method_function(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = second(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        if (function.isFunctionSpec()) {
            return function;
        }
        if (NIL != function) {
            gt_utilities.gt_error(THREE_INTEGER, $str10$method__s_maps_into_illegal_gt_fu, method, function, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            gt_utilities.gt_error(THREE_INTEGER, $str11$illegal_transfers_through_method_, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject tt_method_arg_list(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return third(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject tt_mt_arg(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return position(MT, remove($sym13$_OPTIONAL, third(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject setup_transfers_through_module(final SubLObject module, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$tt_parameters$.getDynamicValue(thread);
        SubLObject indicator = NIL;
        indicator = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            remprop(module, indicator);
            cdolist_list_var = cdolist_list_var.rest();
            indicator = cdolist_list_var.first();
        } 
        SubLObject parameters = NIL;
        SubLObject parameter = NIL;
        SubLObject value = NIL;
        parameters = plist;
        parameter = parameters.first();
        value = second(parameters);
        while (NIL != parameters) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(parameter, gt_vars.$tt_parameters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                Errors.error($str14$_s_was_not_a_valid_transitivity_m, parameter);
            }
            put(module, parameter, value);
            parameters = cddr(parameters);
            parameter = parameters.first();
            value = second(parameters);
        } 
        return module;
    }

    public static SubLObject tt_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttm(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itt_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittm(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tti_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttim(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itti_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittim(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ttm_all_targets(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accessed = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(fort, $TT_INDEX, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($DIRECTED))) {
                    Errors.error($str19$invalid_gt_mode___a, $DIRECTED);
                }
                final SubLObject _prev_bind_0_$9 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($DIRECTED, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + $TRUE;
                    final SubLObject _prev_bind_0_$10 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            accessed = gt_search.tts_all_accessed(fort);
                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                if (NIL != searched) {
                                    gt_utilities.gt_error(THREE_INTEGER, $str22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } finally {
                            if (NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$10, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$9, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return accessed;
    }

    public static SubLObject tt_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttm(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itt_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittm(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tti_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttim(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itti_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittim(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ttm_all_sources(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_sources = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(v_term, $TT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($INVERSE))) {
                    Errors.error($str19$invalid_gt_mode___a, $INVERSE);
                }
                final SubLObject _prev_bind_0_$11 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($INVERSE, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + $TRUE;
                    final SubLObject _prev_bind_0_$12 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        assert NIL != fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) : "Types.fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) " + gt_vars.$tt_gather_arg$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$13 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                            assert NIL != fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) : "Types.fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) " + gt_vars.$tt_index_arg$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$14 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_gather_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    v_sources = gt_search.gt_compose_pred_all_accessed(v_term, gt_vars.$tt_pred$.getDynamicValue(thread));
                                    if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                        final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                        if (NIL != searched) {
                                            gt_utilities.gt_error(THREE_INTEGER, $str22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    if (NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            } finally {
                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_$14, thread);
                            }
                        } finally {
                            gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_$13, thread);
                        }
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$11, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_sources;
    }

    public static SubLObject tt_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttm(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itt_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittm(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tti_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttim(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject itti_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittim(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ttm_booleanP(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject booleanP = NIL;
        SubLObject source = NIL;
        SubLObject target = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
            if (pcase_var.eql(ONE_INTEGER)) {
                source = term_1;
                target = term_2;
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    source = term_2;
                    target = term_1;
                }

            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(source, $TT_INDEX, THREE_INTEGER);
                }
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($DIRECTED))) {
                    Errors.error($str19$invalid_gt_mode___a, $DIRECTED);
                }
                final SubLObject _prev_bind_0_$15 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($DIRECTED, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + $TRUE;
                    final SubLObject _prev_bind_0_$16 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            booleanP = tts_accessesP(source, target, UNPROVIDED);
                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                if (NIL != searched) {
                                    gt_utilities.gt_error(THREE_INTEGER, $str22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } finally {
                            if (NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$16, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$15, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return booleanP;
    }

    public static SubLObject ttm_accesses_in_what_mts(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        SubLObject source = NIL;
        SubLObject target = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
            if (pcase_var.eql(ONE_INTEGER)) {
                source = term_1;
                target = term_2;
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    source = term_2;
                    target = term_1;
                }

            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($GT_ERROR);
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(source, $TT_INDEX, THREE_INTEGER);
                }
                if (((NIL == $suspend_type_checkingP$.getDynamicValue(thread)) && (NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                }
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_utilities.gt_modeP($DIRECTED))) {
                    Errors.error($str19$invalid_gt_mode___a, $DIRECTED);
                }
                final SubLObject _prev_bind_0_$17 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind($DIRECTED, thread);
                    assert NIL != enumeration_types.truth_p($TRUE) : "enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + $TRUE;
                    final SubLObject _prev_bind_0_$18 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            mts = tts_accesses_in_what_mts(source, target);
                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                if (NIL != searched) {
                                    gt_utilities.gt_error(THREE_INTEGER, $str22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            }
                        } finally {
                            if (NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
                    } finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$18, thread);
                    }
                } finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$17, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }

    public static SubLObject tts_accessesP(final SubLObject constant, final SubLObject target, SubLObject compare_fn) {
        if (compare_fn == UNPROVIDED) {
            compare_fn = symbol_function(EQ);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (NIL != kb_accessors.reflexive_predicateP(gt_vars.$tt_pred$.getDynamicValue(thread))) ? funcall(compare_fn, constant, target) : NIL;
        if (NIL == result) {
            final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
            try {
                gt_vars.$gt_result$.bind(NIL, thread);
                SubLObject direct = NIL;
                try {
                    final SubLObject _prev_bind_0_$19 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = gt_vars.$gt_truth$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
                        gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
                        gt_vars.$gt_result$.bind(NIL, thread);
                        assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "Types.function_spec_p(transfers_through.$sym29$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(transfers_through.$sym29$GT_GATHER_LINK_NODE) " + GT_GATHER_LINK_NODE;
                        final SubLObject _prev_bind_0_$20 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                            gt_search.gt_map_links(constant, UNPROVIDED);
                            direct = gt_vars.$gt_result$.getDynamicValue(thread);
                        } finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_5, thread);
                        gt_vars.$gt_truth$.rebind(_prev_bind_4, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_0_$19, thread);
                    }
                    gt_vars.$gt_result$.setDynamicValue(subl_promotions.memberP(target, direct, compare_fn, UNPROVIDED), thread);
                    if (NIL == gt_vars.$gt_result$.getDynamicValue(thread)) {
                        final SubLObject _prev_bind_0_$21 = gt_vars.$gt_target$.currentBinding(thread);
                        try {
                            gt_vars.$gt_target$.bind(target, thread);
                            assert NIL != function_spec_p(compare_fn) : "Types.function_spec_p(compare_fn) " + "CommonSymbols.NIL != Types.function_spec_p(compare_fn) " + compare_fn;
                            final SubLObject _prev_bind_0_$22 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                                if (((NIL != (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL)) && (!assertionsDisabledSynth)) && (NIL == function_spec_p(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL))) {
                                    throw new AssertionError(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL);
                                }
                                final SubLObject _prev_bind_0_$23 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_step_fn$.bind(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL, thread);
                                    assert NIL != function_spec_p(GT_TEST_LINK_NODE) : "Types.function_spec_p(transfers_through.$sym32$GT_TEST_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(transfers_through.$sym32$GT_TEST_LINK_NODE) " + GT_TEST_LINK_NODE;
                                    final SubLObject _prev_bind_0_$24 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind(GT_TEST_LINK_NODE, thread);
                                        if (NIL == gt_vars.$gt_result$.getDynamicValue(thread)) {
                                            SubLObject csome_list_var = direct;
                                            SubLObject node = NIL;
                                            node = csome_list_var.first();
                                            while ((NIL == gt_vars.$gt_result$.getDynamicValue(thread)) && (NIL != csome_list_var)) {
                                                if (NIL != gt_utilities.gt_term_p(node)) {
                                                    gt_search.gt_map_links(node, UNPROVIDED);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node = csome_list_var.first();
                                            } 
                                        }
                                    } finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$24, thread);
                                    }
                                } finally {
                                    gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$23, thread);
                                }
                            } finally {
                                gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$22, thread);
                            }
                        } finally {
                            gt_vars.$gt_target$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            } finally {
                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject tts_accesses_in_what_mts(final SubLObject constant, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject direct = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_index_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
        final SubLObject _prev_bind_4 = gt_vars.$gt_truth$.currentBinding(thread);
        final SubLObject _prev_bind_5 = gt_vars.$gt_result$.currentBinding(thread);
        final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_7 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
            gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
            gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
            gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
            gt_vars.$gt_result$.bind(NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            assert NIL != function_spec_p(symbol_function(GT_GATHER_LINK_NODE_AND_MT)) : "Types.function_spec_p(Symbols.symbol_function(transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT)) " + "CommonSymbols.NIL != Types.function_spec_p(Symbols.symbol_function(transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT)) " + symbol_function(GT_GATHER_LINK_NODE_AND_MT);
            final SubLObject _prev_bind_0_$26 = gt_vars.$gt_base_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_base_fn$.bind(symbol_function(GT_GATHER_LINK_NODE_AND_MT), thread);
                gt_search.gt_map_links(constant, UNPROVIDED);
                direct = gt_vars.$gt_result$.getDynamicValue(thread);
            } finally {
                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$26, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_7, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_6, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_5, thread);
            gt_vars.$gt_truth$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_index_arg$.rebind(_prev_bind_0, thread);
        }
        SubLObject path_mts = NIL;
        SubLObject cdolist_list_var = direct;
        SubLObject nodeXmt = NIL;
        nodeXmt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = nodeXmt;
            SubLObject node = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list36);
            node = current.first();
            current = mt = current.rest();
            if (NIL != gt_utilities.gt_term_p(node)) {
                SubLObject subpath_mts = NIL;
                final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_9 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    subpath_mts = gt_methods.gtm_in_what_mts(node, target, $HIERARCHICALLY_DIRECT);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_9, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_8, thread);
                }
                SubLObject cdolist_list_var_$27 = subpath_mts;
                SubLObject subpath_mt = NIL;
                subpath_mt = cdolist_list_var_$27.first();
                while (NIL != cdolist_list_var_$27) {
                    SubLObject cdolist_list_var_$28;
                    final SubLObject completed_path_mts = cdolist_list_var_$28 = (subpath_mt.eql(mt)) ? list(mt) : genl_mts.max_floor_mts(genl_mts.min_mts(list(mt, subpath_mt), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                    SubLObject path_mt = NIL;
                    path_mt = cdolist_list_var_$28.first();
                    while (NIL != cdolist_list_var_$28) {
                        final SubLObject item_var = path_mt;
                        if (NIL == member(item_var, path_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                            path_mts = cons(item_var, path_mts);
                        }
                        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                        path_mt = cdolist_list_var_$28.first();
                    } 
                    cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                    subpath_mt = cdolist_list_var_$27.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            nodeXmt = cdolist_list_var.first();
        } 
        result = path_mts;
        return result;
    }

    public static SubLObject declare_transfers_through_file() {
        declareFunction(me, "ttm", "TTM", 3, 5, false);
        declareFunction(me, "ittm", "ITTM", 3, 5, false);
        declareFunction(me, "ttim", "TTIM", 3, 5, false);
        declareFunction(me, "ittim", "ITTIM", 3, 5, false);
        declareFunction(me, "transfers_throughP", "TRANSFERS-THROUGH?", 2, 1, false);
        declareFunction(me, "inverse_transfers_throughP", "INVERSE-TRANSFERS-THROUGH?", 2, 1, false);
        declareFunction(me, "transfers_through_inverseP", "TRANSFERS-THROUGH-INVERSE?", 2, 1, false);
        declareFunction(me, "inverse_transfers_through_inverseP", "INVERSE-TRANSFERS-THROUGH-INVERSE?", 2, 1, false);
        declareFunction(me, "tt_methodP", "TT-METHOD?", 1, 0, false);
        declareFunction(me, "generic_ttm", "GENERIC-TTM", 1, 5, false);
        declareFunction(me, "tt_method_function", "TT-METHOD-FUNCTION", 1, 0, false);
        declareFunction(me, "tt_method_arg_list", "TT-METHOD-ARG-LIST", 1, 0, false);
        declareFunction(me, "tt_mt_arg", "TT-MT-ARG", 1, 0, false);
        declareFunction(me, "setup_transfers_through_module", "SETUP-TRANSFERS-THROUGH-MODULE", 2, 0, false);
        declareFunction(me, "tt_all_targets", "TT-ALL-TARGETS", 3, 1, false);
        declareFunction(me, "itt_all_targets", "ITT-ALL-TARGETS", 3, 1, false);
        declareFunction(me, "tti_all_targets", "TTI-ALL-TARGETS", 3, 1, false);
        declareFunction(me, "itti_all_targets", "ITTI-ALL-TARGETS", 3, 1, false);
        declareFunction(me, "ttm_all_targets", "TTM-ALL-TARGETS", 1, 1, false);
        declareFunction(me, "tt_all_sources", "TT-ALL-SOURCES", 3, 1, false);
        declareFunction(me, "itt_all_sources", "ITT-ALL-SOURCES", 3, 1, false);
        declareFunction(me, "tti_all_sources", "TTI-ALL-SOURCES", 3, 1, false);
        declareFunction(me, "itti_all_sources", "ITTI-ALL-SOURCES", 3, 1, false);
        declareFunction(me, "ttm_all_sources", "TTM-ALL-SOURCES", 1, 1, false);
        declareFunction(me, "tt_booleanP", "TT-BOOLEAN?", 4, 1, false);
        declareFunction(me, "itt_booleanP", "ITT-BOOLEAN?", 4, 1, false);
        declareFunction(me, "tti_booleanP", "TTI-BOOLEAN?", 4, 1, false);
        declareFunction(me, "itti_booleanP", "ITTI-BOOLEAN?", 4, 1, false);
        declareFunction(me, "ttm_booleanP", "TTM-BOOLEAN?", 2, 1, false);
        declareFunction(me, "ttm_accesses_in_what_mts", "TTM-ACCESSES-IN-WHAT-MTS", 2, 1, false);
        declareFunction(me, "tts_accessesP", "TTS-ACCESSES?", 2, 1, false);
        declareFunction(me, "tts_accesses_in_what_mts", "TTS-ACCESSES-IN-WHAT-MTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_transfers_through_file() {
        return NIL;
    }

    public static SubLObject setup_transfers_through_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_transfers_through_file();
    }

    @Override
    public void initializeVariables() {
        init_transfers_through_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_transfers_through_file();
    }

    
}

/**
 * Total time: 502 ms synthetic
 */
