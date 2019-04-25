package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transfers_through extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.transfers_through";
    public static final String myFingerPrint = "6527f4e1f1ed85fdaf5f35761a299cc817cf2218d179f3e32ba12825e435be7b";
    private static final SubLString $str0$___transitiveViaArg__s__s_1__not_;
    private static final SubLString $str1$___transitiveViaArg__s__s_2__not_;
    private static final SubLString $str2$___transitiveViaArgInverse__s__s_;
    private static final SubLString $str3$___transitiveViaArgInverse__s__s_;
    private static final SubLObject $const4$transitiveViaArg;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLObject $const7$transitiveViaArgInverse;
    private static final SubLInteger $int8$128;
    private static final SubLString $str9$invalid_gtm_method___s;
    private static final SubLString $str10$method__s_maps_into_illegal_gt_fu;
    private static final SubLString $str11$illegal_transfers_through_method_;
    private static final SubLSymbol $sym12$MT;
    private static final SubLSymbol $sym13$_OPTIONAL;
    private static final SubLString $str14$_s_was_not_a_valid_transitivity_m;
    private static final SubLSymbol $kw15$ALL_TARGETS;
    private static final SubLSymbol $kw16$GT_ERROR;
    private static final SubLSymbol $kw17$TT_INDEX;
    private static final SubLSymbol $kw18$DIRECTED;
    private static final SubLString $str19$invalid_gt_mode___a;
    private static final SubLSymbol $kw20$TRUE;
    private static final SubLSymbol $sym21$TRUTH_P;
    private static final SubLString $str22$_s_marked_constants___s;
    private static final SubLSymbol $kw23$ALL_SOURCES;
    private static final SubLSymbol $kw24$TT_GATHER;
    private static final SubLSymbol $kw25$INVERSE;
    private static final SubLSymbol $sym26$FIXNUMP;
    private static final SubLSymbol $kw27$BOOLEAN_;
    private static final SubLSymbol $kw28$GT_GATHER;
    private static final SubLSymbol $sym29$GT_GATHER_LINK_NODE;
    private static final SubLSymbol $sym30$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym31$GT_MAP_LINKS;
    private static final SubLSymbol $sym32$GT_TEST_LINK_NODE;
    private static final SubLSymbol $sym33$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const34$EverythingPSC;
    private static final SubLSymbol $sym35$GT_GATHER_LINK_NODE_AND_MT;
    private static final SubLList $list36;
    private static final SubLSymbol $kw37$HIERARCHICALLY_DIRECT;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 735L)
    public static SubLObject ttm(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transfers_through.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transfers_through.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transfers_through.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transfers_through.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transfers_through.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (transfers_through.NIL != transfers_throughP(predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED)) {
                final SubLObject _prev_bind_0_$1 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                }
                finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$2, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$1, thread);
                }
            }
            else {
                gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str0$___transitiveViaArg__s__s_1__not_, predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 1811L)
    public static SubLObject ittm(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transfers_through.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transfers_through.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transfers_through.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transfers_through.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transfers_through.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (transfers_through.NIL != gt_vars.gt_within_transitive_via_argP() || transfers_through.NIL != inverse_transfers_throughP(predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED)) {
                final SubLObject _prev_bind_0_$3 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                }
                finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$4, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$3, thread);
                }
            }
            else {
                gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str1$___transitiveViaArg__s__s_2__not_, predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 2831L)
    public static SubLObject ttim(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transfers_through.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transfers_through.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transfers_through.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transfers_through.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transfers_through.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (transfers_through.NIL != transfers_through_inverseP(predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED)) {
                final SubLObject _prev_bind_0_$5 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                }
                finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$6, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$5, thread);
                }
            }
            else {
                gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str2$___transitiveViaArgInverse__s__s_, predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 3814L)
    public static SubLObject ittim(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transfers_through.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transfers_through.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transfers_through.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transfers_through.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transfers_through.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (transfers_through.NIL != inverse_transfers_through_inverseP(predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED)) {
                final SubLObject _prev_bind_0_$7 = gt_vars.$tt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_1_$8 = gt_vars.$tt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_4 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_5 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_6 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                final SubLObject _prev_bind_7 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                try {
                    gt_vars.$tt_pred$.bind(predicate, thread);
                    gt_vars.$tt_index_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$tt_gather_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                    gt_vars.$gt_index_arg$.bind((SubLObject)transfers_through.TWO_INTEGER, thread);
                    gt_vars.$gt_gather_arg$.bind((SubLObject)transfers_through.ONE_INTEGER, thread);
                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                    result = generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                }
                finally {
                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_7, thread);
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_6, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_5, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_4, thread);
                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_$8, thread);
                    gt_vars.$tt_pred$.rebind(_prev_bind_0_$7, thread);
                }
            }
            else {
                gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str3$___transitiveViaArgInverse__s__s_, predicate, conduit_predicate, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 4820L)
    public static SubLObject transfers_throughP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts((SubLObject)ConsesLow.listS(transfers_through.$const4$transitiveViaArg, predicate, conduit_predicate, (SubLObject)transfers_through.$list5), mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 5544L)
    public static SubLObject inverse_transfers_throughP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts((SubLObject)ConsesLow.listS(transfers_through.$const4$transitiveViaArg, predicate, conduit_predicate, (SubLObject)transfers_through.$list6), mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 6065L)
    public static SubLObject transfers_through_inverseP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts((SubLObject)ConsesLow.listS(transfers_through.$const7$transitiveViaArgInverse, predicate, conduit_predicate, (SubLObject)transfers_through.$list5), mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 6579L)
    public static SubLObject inverse_transfers_through_inverseP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts((SubLObject)ConsesLow.listS(transfers_through.$const7$transitiveViaArgInverse, predicate, conduit_predicate, (SubLObject)transfers_through.$list6), mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 7042L)
    public static SubLObject tt_methodP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$tt_methods$.getDynamicValue(thread), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 7297L)
    public static SubLObject generic_ttm(final SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == transfers_through.UNPROVIDED) {
            arg1 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg2 == transfers_through.UNPROVIDED) {
            arg2 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg3 == transfers_through.UNPROVIDED) {
            arg3 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg4 == transfers_through.UNPROVIDED) {
            arg4 = utilities_macros.$unprovided$.getGlobalValue();
        }
        if (arg5 == transfers_through.UNPROVIDED) {
            arg5 = utilities_macros.$unprovided$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transfers_through.NIL;
        final SubLObject tti_function = tt_method_function(method);
        if (tti_function.isFunctionSpec()) {
            if (transfers_through.NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                result = transitivity.apply_gti_function(tti_function, arg1, arg2, arg3, arg4, arg5);
            }
            else {
                final SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_marking_table$.currentBinding(thread);
                try {
                    gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                    gt_vars.$gt_marking_table$.bind((SubLObject)transfers_through.NIL, thread);
                    gt_vars.$gt_marking_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)transfers_through.$int8$128, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED), thread);
                    result = transitivity.apply_gti_function(tti_function, arg1, arg2, arg3, arg4, arg5);
                }
                finally {
                    gt_vars.$gt_marking_table$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                }
            }
        }
        else {
            gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str9$invalid_gtm_method___s, tti_function, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 7961L)
    public static SubLObject tt_method_function(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = conses_high.second(conses_high.assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED));
        if (function.isFunctionSpec()) {
            return function;
        }
        if (transfers_through.NIL != function) {
            gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str10$method__s_maps_into_illegal_gt_fu, method, function, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
        }
        else {
            gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str11$illegal_transfers_through_method_, method, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
        }
        return (SubLObject)transfers_through.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 8286L)
    public static SubLObject tt_method_arg_list(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.third(conses_high.assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 8383L)
    public static SubLObject tt_mt_arg(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sequences.position((SubLObject)transfers_through.$sym12$MT, Sequences.remove((SubLObject)transfers_through.$sym13$_OPTIONAL, conses_high.third(conses_high.assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED)), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 8506L)
    public static SubLObject setup_transfers_through_module(final SubLObject module, final SubLObject plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = gt_vars.$tt_parameters$.getDynamicValue(thread);
        SubLObject indicator = (SubLObject)transfers_through.NIL;
        indicator = cdolist_list_var.first();
        while (transfers_through.NIL != cdolist_list_var) {
            Symbols.remprop(module, indicator);
            cdolist_list_var = cdolist_list_var.rest();
            indicator = cdolist_list_var.first();
        }
        SubLObject parameters = (SubLObject)transfers_through.NIL;
        SubLObject parameter = (SubLObject)transfers_through.NIL;
        SubLObject value = (SubLObject)transfers_through.NIL;
        parameters = plist;
        parameter = parameters.first();
        value = conses_high.second(parameters);
        while (transfers_through.NIL != parameters) {
            if (transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transfers_through.NIL == subl_promotions.memberP(parameter, gt_vars.$tt_parameters$.getDynamicValue(thread), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED)) {
                Errors.error((SubLObject)transfers_through.$str14$_s_was_not_a_valid_transitivity_m, parameter);
            }
            Symbols.put(module, parameter, value);
            parameters = conses_high.cddr(parameters);
            parameter = parameters.first();
            value = conses_high.second(parameters);
        }
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 8973L)
    public static SubLObject tt_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ttm(predicate, conduit_predicate, (SubLObject)transfers_through.$kw15$ALL_TARGETS, fort, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 9634L)
    public static SubLObject itt_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ittm(predicate, conduit_predicate, (SubLObject)transfers_through.$kw15$ALL_TARGETS, fort, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 10168L)
    public static SubLObject tti_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ttim(predicate, conduit_predicate, (SubLObject)transfers_through.$kw15$ALL_TARGETS, fort, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 10697L)
    public static SubLObject itti_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ittim(predicate, conduit_predicate, (SubLObject)transfers_through.$kw15$ALL_TARGETS, fort, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 11296L)
    public static SubLObject ttm_all_targets(final SubLObject fort, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accessed = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject catch_var = (SubLObject)transfers_through.NIL;
            try {
                thread.throwStack.push(transfers_through.$kw16$GT_ERROR);
                if (transfers_through.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(fort, (SubLObject)transfers_through.$kw17$TT_INDEX, (SubLObject)transfers_through.THREE_INTEGER);
                }
                if (transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transfers_through.NIL == gt_utilities.gt_modeP((SubLObject)transfers_through.$kw18$DIRECTED)) {
                    Errors.error((SubLObject)transfers_through.$str19$invalid_gt_mode___a, (SubLObject)transfers_through.$kw18$DIRECTED);
                }
                final SubLObject _prev_bind_0_$9 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)transfers_through.$kw18$DIRECTED, thread);
                    assert transfers_through.NIL != enumeration_types.truth_p((SubLObject)transfers_through.$kw20$TRUE) : transfers_through.$kw20$TRUE;
                    final SubLObject _prev_bind_0_$10 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)transfers_through.$kw20$TRUE, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = (SubLObject)transfers_through.NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            accessed = gt_search.tts_all_accessed(fort);
                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE((SubLObject)transfers_through.FIVE_INTEGER)) {
                                final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes((SubLObject)transfers_through.UNPROVIDED);
                                if (transfers_through.NIL != searched) {
                                    gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str22$_s_marked_constants___s, Sequences.length(searched), searched, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            if (transfers_through.NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
                    }
                    finally {
                        gt_vars.$gt_truth$.rebind(_prev_bind_0_$10, thread);
                    }
                }
                finally {
                    gt_vars.$gt_mode$.rebind(_prev_bind_0_$9, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)transfers_through.$kw16$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return accessed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 11846L)
    public static SubLObject tt_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ttm(predicate, conduit_predicate, (SubLObject)transfers_through.$kw23$ALL_SOURCES, v_term, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 12394L)
    public static SubLObject itt_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ittm(predicate, conduit_predicate, (SubLObject)transfers_through.$kw23$ALL_SOURCES, v_term, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 12950L)
    public static SubLObject tti_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ttim(predicate, conduit_predicate, (SubLObject)transfers_through.$kw23$ALL_SOURCES, v_term, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 13502L)
    public static SubLObject itti_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ittim(predicate, conduit_predicate, (SubLObject)transfers_through.$kw23$ALL_SOURCES, v_term, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 14126L)
    public static SubLObject ttm_all_sources(final SubLObject v_term, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_sources = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject catch_var = (SubLObject)transfers_through.NIL;
            try {
                thread.throwStack.push(transfers_through.$kw16$GT_ERROR);
                if (transfers_through.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(v_term, (SubLObject)transfers_through.$kw24$TT_GATHER, (SubLObject)transfers_through.THREE_INTEGER);
                }
                if (transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transfers_through.NIL == gt_utilities.gt_modeP((SubLObject)transfers_through.$kw25$INVERSE)) {
                    Errors.error((SubLObject)transfers_through.$str19$invalid_gt_mode___a, (SubLObject)transfers_through.$kw25$INVERSE);
                }
                final SubLObject _prev_bind_0_$11 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)transfers_through.$kw25$INVERSE, thread);
                    assert transfers_through.NIL != enumeration_types.truth_p((SubLObject)transfers_through.$kw20$TRUE) : transfers_through.$kw20$TRUE;
                    final SubLObject _prev_bind_0_$12 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)transfers_through.$kw20$TRUE, thread);
                        assert transfers_through.NIL != Types.fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) : gt_vars.$tt_gather_arg$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$13 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                            assert transfers_through.NIL != Types.fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) : gt_vars.$tt_index_arg$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$14 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compose_gather_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                                final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                SubLObject needs_to_releaseP = (SubLObject)transfers_through.NIL;
                                try {
                                    needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                    v_sources = gt_search.gt_compose_pred_all_accessed(v_term, gt_vars.$tt_pred$.getDynamicValue(thread));
                                    if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE((SubLObject)transfers_through.FIVE_INTEGER)) {
                                        final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes((SubLObject)transfers_through.UNPROVIDED);
                                        if (transfers_through.NIL != searched) {
                                            gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str22$_s_marked_constants___s, Sequences.length(searched), searched, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
                                        }
                                    }
                                }
                                finally {
                                    if (transfers_through.NIL != needs_to_releaseP) {
                                        ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                    }
                                }
                            }
                            finally {
                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                        finally {
                            gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_$13, thread);
                        }
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
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)transfers_through.$kw16$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_sources;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 14850L)
    public static SubLObject tt_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ttm(predicate, conduit_predicate, (SubLObject)transfers_through.$kw27$BOOLEAN_, term_1, term_2, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 15340L)
    public static SubLObject itt_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ittm(predicate, conduit_predicate, (SubLObject)transfers_through.$kw27$BOOLEAN_, term_1, term_2, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 15964L)
    public static SubLObject tti_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ttim(predicate, conduit_predicate, (SubLObject)transfers_through.$kw27$BOOLEAN_, term_1, term_2, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 16744L)
    public static SubLObject itti_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        return ittim(predicate, conduit_predicate, (SubLObject)transfers_through.$kw27$BOOLEAN_, term_1, term_2, mt, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 17380L)
    public static SubLObject ttm_booleanP(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject booleanP = (SubLObject)transfers_through.NIL;
        SubLObject source = (SubLObject)transfers_through.NIL;
        SubLObject target = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)transfers_through.ONE_INTEGER)) {
                source = term_1;
                target = term_2;
            }
            else if (pcase_var.eql((SubLObject)transfers_through.TWO_INTEGER)) {
                source = term_2;
                target = term_1;
            }
            SubLObject catch_var = (SubLObject)transfers_through.NIL;
            try {
                thread.throwStack.push(transfers_through.$kw16$GT_ERROR);
                if (transfers_through.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(source, (SubLObject)transfers_through.$kw17$TT_INDEX, (SubLObject)transfers_through.THREE_INTEGER);
                }
                if (transfers_through.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(target, (SubLObject)transfers_through.$kw28$GT_GATHER, (SubLObject)transfers_through.THREE_INTEGER);
                }
                if (transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transfers_through.NIL == gt_utilities.gt_modeP((SubLObject)transfers_through.$kw18$DIRECTED)) {
                    Errors.error((SubLObject)transfers_through.$str19$invalid_gt_mode___a, (SubLObject)transfers_through.$kw18$DIRECTED);
                }
                final SubLObject _prev_bind_0_$15 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)transfers_through.$kw18$DIRECTED, thread);
                    assert transfers_through.NIL != enumeration_types.truth_p((SubLObject)transfers_through.$kw20$TRUE) : transfers_through.$kw20$TRUE;
                    final SubLObject _prev_bind_0_$16 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)transfers_through.$kw20$TRUE, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = (SubLObject)transfers_through.NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            booleanP = tts_accessesP(source, target, (SubLObject)transfers_through.UNPROVIDED);
                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE((SubLObject)transfers_through.FIVE_INTEGER)) {
                                final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes((SubLObject)transfers_through.UNPROVIDED);
                                if (transfers_through.NIL != searched) {
                                    gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str22$_s_marked_constants___s, Sequences.length(searched), searched, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            if (transfers_through.NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
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
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)transfers_through.$kw16$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return booleanP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 18239L)
    public static SubLObject ttm_accesses_in_what_mts(final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == transfers_through.UNPROVIDED) {
            mt = (SubLObject)transfers_through.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = (SubLObject)transfers_through.NIL;
        SubLObject source = (SubLObject)transfers_through.NIL;
        SubLObject target = (SubLObject)transfers_through.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)transfers_through.ONE_INTEGER)) {
                source = term_1;
                target = term_2;
            }
            else if (pcase_var.eql((SubLObject)transfers_through.TWO_INTEGER)) {
                source = term_2;
                target = term_1;
            }
            SubLObject catch_var = (SubLObject)transfers_through.NIL;
            try {
                thread.throwStack.push(transfers_through.$kw16$GT_ERROR);
                if (transfers_through.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(source, (SubLObject)transfers_through.$kw17$TT_INDEX, (SubLObject)transfers_through.THREE_INTEGER);
                }
                if (transfers_through.NIL == Types.$suspend_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread) && transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    gt_utilities.gt_check_type_internal(target, (SubLObject)transfers_through.$kw28$GT_GATHER, (SubLObject)transfers_through.THREE_INTEGER);
                }
                if (transfers_through.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && transfers_through.NIL == gt_utilities.gt_modeP((SubLObject)transfers_through.$kw18$DIRECTED)) {
                    Errors.error((SubLObject)transfers_through.$str19$invalid_gt_mode___a, (SubLObject)transfers_through.$kw18$DIRECTED);
                }
                final SubLObject _prev_bind_0_$17 = gt_vars.$gt_mode$.currentBinding(thread);
                try {
                    gt_vars.$gt_mode$.bind((SubLObject)transfers_through.$kw18$DIRECTED, thread);
                    assert transfers_through.NIL != enumeration_types.truth_p((SubLObject)transfers_through.$kw20$TRUE) : transfers_through.$kw20$TRUE;
                    final SubLObject _prev_bind_0_$18 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind((SubLObject)transfers_through.$kw20$TRUE, thread);
                        final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                        SubLObject needs_to_releaseP = (SubLObject)transfers_through.NIL;
                        try {
                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                            mts = tts_accesses_in_what_mts(source, target);
                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE((SubLObject)transfers_through.FIVE_INTEGER)) {
                                final SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes((SubLObject)transfers_through.UNPROVIDED);
                                if (transfers_through.NIL != searched) {
                                    gt_utilities.gt_error((SubLObject)transfers_through.THREE_INTEGER, (SubLObject)transfers_through.$str22$_s_marked_constants___s, Sequences.length(searched), searched, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED);
                                }
                            }
                        }
                        finally {
                            if (transfers_through.NIL != needs_to_releaseP) {
                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                            }
                        }
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
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)transfers_through.$kw16$GT_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return mts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 19244L)
    public static SubLObject tts_accessesP(final SubLObject constant, final SubLObject target, SubLObject compare_fn) {
        if (compare_fn == transfers_through.UNPROVIDED) {
            compare_fn = Symbols.symbol_function((SubLObject)transfers_through.EQ);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)((transfers_through.NIL != kb_accessors.reflexive_predicateP(gt_vars.$tt_pred$.getDynamicValue(thread))) ? Functions.funcall(compare_fn, constant, target) : transfers_through.NIL);
        if (transfers_through.NIL == result) {
            final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
            try {
                gt_vars.$gt_result$.bind((SubLObject)transfers_through.NIL, thread);
                SubLObject direct = (SubLObject)transfers_through.NIL;
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
                        gt_vars.$gt_result$.bind((SubLObject)transfers_through.NIL, thread);
                        assert transfers_through.NIL != Types.function_spec_p((SubLObject)transfers_through.$sym29$GT_GATHER_LINK_NODE) : transfers_through.$sym29$GT_GATHER_LINK_NODE;
                        final SubLObject _prev_bind_0_$20 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind((SubLObject)transfers_through.$sym29$GT_GATHER_LINK_NODE, thread);
                            gt_search.gt_map_links(constant, (SubLObject)transfers_through.UNPROVIDED);
                            direct = gt_vars.$gt_result$.getDynamicValue(thread);
                        }
                        finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$20, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_5, thread);
                        gt_vars.$gt_truth$.rebind(_prev_bind_4, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_0_$19, thread);
                    }
                    gt_vars.$gt_result$.setDynamicValue(subl_promotions.memberP(target, direct, compare_fn, (SubLObject)transfers_through.UNPROVIDED), thread);
                    if (transfers_through.NIL == gt_vars.$gt_result$.getDynamicValue(thread)) {
                        final SubLObject _prev_bind_0_$21 = gt_vars.$gt_target$.currentBinding(thread);
                        try {
                            gt_vars.$gt_target$.bind(target, thread);
                            assert transfers_through.NIL != Types.function_spec_p(compare_fn) : compare_fn;
                            final SubLObject _prev_bind_0_$22 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                                if (transfers_through.NIL != ((transfers_through.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? transfers_through.$sym31$GT_MAP_LINKS : transfers_through.NIL) && !transfers_through.assertionsDisabledSynth && transfers_through.NIL == Types.function_spec_p((SubLObject)((transfers_through.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? transfers_through.$sym31$GT_MAP_LINKS : transfers_through.NIL))) {
                                    throw new AssertionError((transfers_through.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? transfers_through.$sym31$GT_MAP_LINKS : transfers_through.NIL);
                                }
                                final SubLObject _prev_bind_0_$23 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_step_fn$.bind((SubLObject)((transfers_through.NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread)) ? transfers_through.$sym31$GT_MAP_LINKS : transfers_through.NIL), thread);
                                    assert transfers_through.NIL != Types.function_spec_p((SubLObject)transfers_through.$sym32$GT_TEST_LINK_NODE) : transfers_through.$sym32$GT_TEST_LINK_NODE;
                                    final SubLObject _prev_bind_0_$24 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_base_fn$.bind((SubLObject)transfers_through.$sym32$GT_TEST_LINK_NODE, thread);
                                        if (transfers_through.NIL == gt_vars.$gt_result$.getDynamicValue(thread)) {
                                            SubLObject csome_list_var = direct;
                                            SubLObject node = (SubLObject)transfers_through.NIL;
                                            node = csome_list_var.first();
                                            while (transfers_through.NIL == gt_vars.$gt_result$.getDynamicValue(thread) && transfers_through.NIL != csome_list_var) {
                                                if (transfers_through.NIL != gt_utilities.gt_term_p(node)) {
                                                    gt_search.gt_map_links(node, (SubLObject)transfers_through.UNPROVIDED);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node = csome_list_var.first();
                                            }
                                        }
                                    }
                                    finally {
                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$24, thread);
                                    }
                                }
                                finally {
                                    gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$23, thread);
                                }
                            }
                            finally {
                                gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                        finally {
                            gt_vars.$gt_target$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)transfers_through.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
                result = gt_vars.$gt_result$.getDynamicValue(thread);
            }
            finally {
                gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/transfers-through.lisp", position = 20265L)
    public static SubLObject tts_accesses_in_what_mts(final SubLObject constant, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)transfers_through.NIL;
        SubLObject direct = (SubLObject)transfers_through.NIL;
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
            gt_vars.$gt_result$.bind((SubLObject)transfers_through.NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)transfers_through.$sym33$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(transfers_through.$const34$EverythingPSC, thread);
            assert transfers_through.NIL != Types.function_spec_p(Symbols.symbol_function((SubLObject)transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT)) : Symbols.symbol_function((SubLObject)transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT);
            final SubLObject _prev_bind_0_$26 = gt_vars.$gt_base_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_base_fn$.bind(Symbols.symbol_function((SubLObject)transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT), thread);
                gt_search.gt_map_links(constant, (SubLObject)transfers_through.UNPROVIDED);
                direct = gt_vars.$gt_result$.getDynamicValue(thread);
            }
            finally {
                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$26, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_7, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_6, thread);
            gt_vars.$gt_result$.rebind(_prev_bind_5, thread);
            gt_vars.$gt_truth$.rebind(_prev_bind_4, thread);
            gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
            gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
            gt_vars.$gt_index_arg$.rebind(_prev_bind_0, thread);
        }
        SubLObject path_mts = (SubLObject)transfers_through.NIL;
        SubLObject cdolist_list_var = direct;
        SubLObject nodeXmt = (SubLObject)transfers_through.NIL;
        nodeXmt = cdolist_list_var.first();
        while (transfers_through.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = nodeXmt;
            SubLObject node = (SubLObject)transfers_through.NIL;
            SubLObject mt = (SubLObject)transfers_through.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)transfers_through.$list36);
            node = current.first();
            current = (mt = current.rest());
            if (transfers_through.NIL != gt_utilities.gt_term_p(node)) {
                SubLObject subpath_mts = (SubLObject)transfers_through.NIL;
                final SubLObject _prev_bind_8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_9 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)transfers_through.$sym33$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(transfers_through.$const34$EverythingPSC, thread);
                    subpath_mts = gt_methods.gtm_in_what_mts(node, target, (SubLObject)transfers_through.$kw37$HIERARCHICALLY_DIRECT);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_9, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_8, thread);
                }
                SubLObject cdolist_list_var_$27 = subpath_mts;
                SubLObject subpath_mt = (SubLObject)transfers_through.NIL;
                subpath_mt = cdolist_list_var_$27.first();
                while (transfers_through.NIL != cdolist_list_var_$27) {
                    SubLObject cdolist_list_var_$28;
                    final SubLObject completed_path_mts = cdolist_list_var_$28 = (SubLObject)(subpath_mt.eql(mt) ? ConsesLow.list(mt) : genl_mts.max_floor_mts(genl_mts.min_mts((SubLObject)ConsesLow.list(mt, subpath_mt), (SubLObject)transfers_through.UNPROVIDED), (SubLObject)transfers_through.UNPROVIDED, (SubLObject)transfers_through.UNPROVIDED));
                    SubLObject path_mt = (SubLObject)transfers_through.NIL;
                    path_mt = cdolist_list_var_$28.first();
                    while (transfers_through.NIL != cdolist_list_var_$28) {
                        final SubLObject item_var = path_mt;
                        if (transfers_through.NIL == conses_high.member(item_var, path_mts, Symbols.symbol_function((SubLObject)transfers_through.EQL), Symbols.symbol_function((SubLObject)transfers_through.IDENTITY))) {
                            path_mts = (SubLObject)ConsesLow.cons(item_var, path_mts);
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
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ttm", "TTM", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ittm", "ITTM", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ttim", "TTIM", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ittim", "ITTIM", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "transfers_throughP", "TRANSFERS-THROUGH?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "inverse_transfers_throughP", "INVERSE-TRANSFERS-THROUGH?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "transfers_through_inverseP", "TRANSFERS-THROUGH-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "inverse_transfers_through_inverseP", "INVERSE-TRANSFERS-THROUGH-INVERSE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_methodP", "TT-METHOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "generic_ttm", "GENERIC-TTM", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_method_function", "TT-METHOD-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_method_arg_list", "TT-METHOD-ARG-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_mt_arg", "TT-MT-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "setup_transfers_through_module", "SETUP-TRANSFERS-THROUGH-MODULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_all_targets", "TT-ALL-TARGETS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "itt_all_targets", "ITT-ALL-TARGETS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tti_all_targets", "TTI-ALL-TARGETS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "itti_all_targets", "ITTI-ALL-TARGETS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ttm_all_targets", "TTM-ALL-TARGETS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_all_sources", "TT-ALL-SOURCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "itt_all_sources", "ITT-ALL-SOURCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tti_all_sources", "TTI-ALL-SOURCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "itti_all_sources", "ITTI-ALL-SOURCES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ttm_all_sources", "TTM-ALL-SOURCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tt_booleanP", "TT-BOOLEAN?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "itt_booleanP", "ITT-BOOLEAN?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tti_booleanP", "TTI-BOOLEAN?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "itti_booleanP", "ITTI-BOOLEAN?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ttm_booleanP", "TTM-BOOLEAN?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "ttm_accesses_in_what_mts", "TTM-ACCESSES-IN-WHAT-MTS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tts_accessesP", "TTS-ACCESSES?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.transfers_through", "tts_accesses_in_what_mts", "TTS-ACCESSES-IN-WHAT-MTS", 2, 0, false);
        return (SubLObject)transfers_through.NIL;
    }
    
    public static SubLObject init_transfers_through_file() {
        return (SubLObject)transfers_through.NIL;
    }
    
    public static SubLObject setup_transfers_through_file() {
        return (SubLObject)transfers_through.NIL;
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
    
    static {
        me = (SubLFile)new transfers_through();
        $str0$___transitiveViaArg__s__s_1__not_ = SubLObjectFactory.makeString("(#$transitiveViaArg ~s ~s 1) not declared");
        $str1$___transitiveViaArg__s__s_2__not_ = SubLObjectFactory.makeString("(#$transitiveViaArg ~s ~s 2) not declared");
        $str2$___transitiveViaArgInverse__s__s_ = SubLObjectFactory.makeString("(#$transitiveViaArgInverse ~s ~s 1) not declared");
        $str3$___transitiveViaArgInverse__s__s_ = SubLObjectFactory.makeString("(#$transitiveViaArgInverse ~s ~s 2) not declared");
        $const4$transitiveViaArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg"));
        $list5 = ConsesLow.list((SubLObject)transfers_through.ONE_INTEGER);
        $list6 = ConsesLow.list((SubLObject)transfers_through.TWO_INTEGER);
        $const7$transitiveViaArgInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse"));
        $int8$128 = SubLObjectFactory.makeInteger(128);
        $str9$invalid_gtm_method___s = SubLObjectFactory.makeString("invalid gtm method: ~s");
        $str10$method__s_maps_into_illegal_gt_fu = SubLObjectFactory.makeString("method ~s maps into illegal gt function ~s)");
        $str11$illegal_transfers_through_method_ = SubLObjectFactory.makeString("illegal transfers-through method: ~s");
        $sym12$MT = SubLObjectFactory.makeSymbol("MT");
        $sym13$_OPTIONAL = SubLObjectFactory.makeSymbol("&OPTIONAL");
        $str14$_s_was_not_a_valid_transitivity_m = SubLObjectFactory.makeString("~s was not a valid transitivity-module parameter");
        $kw15$ALL_TARGETS = SubLObjectFactory.makeKeyword("ALL-TARGETS");
        $kw16$GT_ERROR = SubLObjectFactory.makeKeyword("GT-ERROR");
        $kw17$TT_INDEX = SubLObjectFactory.makeKeyword("TT-INDEX");
        $kw18$DIRECTED = SubLObjectFactory.makeKeyword("DIRECTED");
        $str19$invalid_gt_mode___a = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $kw20$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym21$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $str22$_s_marked_constants___s = SubLObjectFactory.makeString("~s marked constants: ~s");
        $kw23$ALL_SOURCES = SubLObjectFactory.makeKeyword("ALL-SOURCES");
        $kw24$TT_GATHER = SubLObjectFactory.makeKeyword("TT-GATHER");
        $kw25$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $sym26$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $kw27$BOOLEAN_ = SubLObjectFactory.makeKeyword("BOOLEAN?");
        $kw28$GT_GATHER = SubLObjectFactory.makeKeyword("GT-GATHER");
        $sym29$GT_GATHER_LINK_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODE");
        $sym30$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym31$GT_MAP_LINKS = SubLObjectFactory.makeSymbol("GT-MAP-LINKS");
        $sym32$GT_TEST_LINK_NODE = SubLObjectFactory.makeSymbol("GT-TEST-LINK-NODE");
        $sym33$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const34$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym35$GT_GATHER_LINK_NODE_AND_MT = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODE-AND-MT");
        $list36 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $kw37$HIERARCHICALLY_DIRECT = SubLObjectFactory.makeKeyword("HIERARCHICALLY-DIRECT");
    }
}

/*

	Total time: 502 ms
	 synthetic 
*/