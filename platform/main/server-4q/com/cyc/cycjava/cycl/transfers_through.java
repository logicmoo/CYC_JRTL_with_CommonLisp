/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.$unprovided$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.put;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.remprop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class transfers_through extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new transfers_through();

 public static final String myName = "com.cyc.cycjava.cycl.transfers_through";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$___transitiveViaArg__s__s_1__not_ = makeString("(#$transitiveViaArg ~s ~s 1) not declared");

    static private final SubLString $str1$___transitiveViaArg__s__s_2__not_ = makeString("(#$transitiveViaArg ~s ~s 2) not declared");

    static private final SubLString $str2$___transitiveViaArgInverse__s__s_ = makeString("(#$transitiveViaArgInverse ~s ~s 1) not declared");

    static private final SubLString $str3$___transitiveViaArgInverse__s__s_ = makeString("(#$transitiveViaArgInverse ~s ~s 2) not declared");



    static private final SubLList $list5 = list(ONE_INTEGER);

    static private final SubLList $list6 = list(TWO_INTEGER);



    private static final SubLInteger $int$128 = makeInteger(128);

    static private final SubLString $str9$invalid_gtm_method___s = makeString("invalid gtm method: ~s");

    static private final SubLString $str10$method__s_maps_into_illegal_gt_fu = makeString("method ~s maps into illegal gt function ~s)");

    static private final SubLString $str11$illegal_transfers_through_method_ = makeString("illegal transfers-through method: ~s");

    static private final SubLSymbol $sym13$_OPTIONAL = makeSymbol("&OPTIONAL");

    static private final SubLString $str14$_s_was_not_a_valid_transitivity_m = makeString("~s was not a valid transitivity-module parameter");

    static private final SubLString $str19$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLString $str22$_s_marked_constants___s = makeString("~s marked constants: ~s");

    private static final SubLSymbol GT_GATHER_LINK_NODE = makeSymbol("GT-GATHER-LINK-NODE");

    private static final SubLSymbol GT_MAP_LINKS = makeSymbol("GT-MAP-LINKS");

    private static final SubLSymbol GT_TEST_LINK_NODE = makeSymbol("GT-TEST-LINK-NODE");



    private static final SubLSymbol GT_GATHER_LINK_NODE_AND_MT = makeSymbol("GT-GATHER-LINK-NODE-AND-MT");

    static private final SubLList $list36 = cons(makeSymbol("NODE"), makeSymbol("MT"));

    static final boolean assertionsDisabledSynth = true;

    // Definitions
    /**
     * performs transfers-through METHOD using PREDICATE transfering through
     * binary CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using PREDICATE transfering through\r\nbinary CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using PREDICATE transfering through\nbinary CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
    public static final SubLObject ttm_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL != com.cyc.cycjava.cycl.transfers_through.transfers_throughP(predicate, conduit_predicate, UNPROVIDED)) {
                            {
                                SubLObject _prev_bind_0_1 = gt_vars.$tt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = gt_vars.$tt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_2 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_4 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_5 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_6 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                                try {
                                    gt_vars.$tt_pred$.bind(predicate, thread);
                                    gt_vars.$tt_index_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$tt_gather_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                                    gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                                    result = com.cyc.cycjava.cycl.transfers_through.generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                                } finally {
                                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_6, thread);
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_5, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_4, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_2, thread);
                                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_2, thread);
                                    gt_vars.$tt_pred$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        } else {
                            gt_utilities.gt_error(THREE_INTEGER, $str_alt0$___transitiveViaArg__s__s_1__not_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    // Definitions
    /**
     * performs transfers-through METHOD using PREDICATE transfering through
     * binary CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using PREDICATE transfering through\r\nbinary CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using PREDICATE transfering through\nbinary CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
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

    /**
     * performs transfers-through METHOD using inverse of PREDICATE transfering through
     * binary CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using inverse of PREDICATE transfering through\r\nbinary CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using inverse of PREDICATE transfering through\nbinary CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
    public static final SubLObject ittm_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if ((NIL != gt_vars.gt_within_transitive_via_argP()) || (NIL != com.cyc.cycjava.cycl.transfers_through.inverse_transfers_throughP(predicate, conduit_predicate, UNPROVIDED))) {
                            {
                                SubLObject _prev_bind_0_3 = gt_vars.$tt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_1_4 = gt_vars.$tt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_2 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_4 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_5 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_6 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                                try {
                                    gt_vars.$tt_pred$.bind(predicate, thread);
                                    gt_vars.$tt_index_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$tt_gather_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                                    gt_vars.$gt_index_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$gt_gather_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                                    result = com.cyc.cycjava.cycl.transfers_through.generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                                } finally {
                                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_6, thread);
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_5, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_4, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_2, thread);
                                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_4, thread);
                                    gt_vars.$tt_pred$.rebind(_prev_bind_0_3, thread);
                                }
                            }
                        } else {
                            gt_utilities.gt_error(THREE_INTEGER, $str_alt1$___transitiveViaArg__s__s_2__not_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * performs transfers-through METHOD using inverse of PREDICATE transfering through
     * binary CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using inverse of PREDICATE transfering through\r\nbinary CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using inverse of PREDICATE transfering through\nbinary CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
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

    /**
     * performs transfers-through METHOD using PREDICATE transfering through inverse of
     * binary CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using PREDICATE transfering through inverse of\r\nbinary CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using PREDICATE transfering through inverse of\nbinary CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
    public static final SubLObject ttim_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL != com.cyc.cycjava.cycl.transfers_through.transfers_through_inverseP(predicate, conduit_predicate, UNPROVIDED)) {
                            {
                                SubLObject _prev_bind_0_5 = gt_vars.$tt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_1_6 = gt_vars.$tt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_2 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_4 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_5 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_6 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                                try {
                                    gt_vars.$tt_pred$.bind(predicate, thread);
                                    gt_vars.$tt_index_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$tt_gather_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                                    gt_vars.$gt_index_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$gt_gather_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                                    result = com.cyc.cycjava.cycl.transfers_through.generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                                } finally {
                                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_6, thread);
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_5, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_4, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_2, thread);
                                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_6, thread);
                                    gt_vars.$tt_pred$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        } else {
                            gt_utilities.gt_error(THREE_INTEGER, $str_alt2$___transitiveViaArgInverse__s__s_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * performs transfers-through METHOD using PREDICATE transfering through inverse of
     * binary CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using PREDICATE transfering through inverse of\r\nbinary CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using PREDICATE transfering through inverse of\nbinary CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
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

    /**
     * performs transfers-through METHOD using inverse of PREDICATE transfering through
     * inverse of CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using inverse of PREDICATE transfering through\r\ninverse of CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using inverse of PREDICATE transfering through\ninverse of CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
    public static final SubLObject ittim_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = transitivity.gt_mt_arg_value(method, arg1, arg2, arg3, arg4, arg5);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        if (NIL != com.cyc.cycjava.cycl.transfers_through.inverse_transfers_through_inverseP(predicate, conduit_predicate, UNPROVIDED)) {
                            {
                                SubLObject _prev_bind_0_7 = gt_vars.$tt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_1_8 = gt_vars.$tt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_2 = gt_vars.$tt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_3 = gt_vars.$gt_pred$.currentBinding(thread);
                                SubLObject _prev_bind_4 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                SubLObject _prev_bind_5 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                SubLObject _prev_bind_6 = gt_vars.$tt_transitive_conduitP$.currentBinding(thread);
                                try {
                                    gt_vars.$tt_pred$.bind(predicate, thread);
                                    gt_vars.$tt_index_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$tt_gather_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$gt_pred$.bind(conduit_predicate, thread);
                                    gt_vars.$gt_index_arg$.bind(TWO_INTEGER, thread);
                                    gt_vars.$gt_gather_arg$.bind(ONE_INTEGER, thread);
                                    gt_vars.$tt_transitive_conduitP$.bind(kb_accessors.transitive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)), thread);
                                    result = com.cyc.cycjava.cycl.transfers_through.generic_ttm(method, arg1, arg2, arg3, arg4, arg5);
                                } finally {
                                    gt_vars.$tt_transitive_conduitP$.rebind(_prev_bind_6, thread);
                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_5, thread);
                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_4, thread);
                                    gt_vars.$gt_pred$.rebind(_prev_bind_3, thread);
                                    gt_vars.$tt_gather_arg$.rebind(_prev_bind_2, thread);
                                    gt_vars.$tt_index_arg$.rebind(_prev_bind_1_8, thread);
                                    gt_vars.$tt_pred$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        } else {
                            gt_utilities.gt_error(THREE_INTEGER, $str_alt3$___transitiveViaArgInverse__s__s_, predicate, conduit_predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * performs transfers-through METHOD using inverse of PREDICATE transfering through
     * inverse of CONDUIT-PREDICATE for designated args
     * (see *tt-methods* for legal transfers-through methods)
     */
    @LispMethod(comment = "performs transfers-through METHOD using inverse of PREDICATE transfering through\r\ninverse of CONDUIT-PREDICATE for designated args\r\n(see *tt-methods* for legal transfers-through methods)\nperforms transfers-through METHOD using inverse of PREDICATE transfering through\ninverse of CONDUIT-PREDICATE for designated args\n(see *tt-methods* for legal transfers-through methods)")
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

    /**
     * does PREDICATE thransferThrough CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does PREDICATE thransferThrough CONDUIT-PREDICATE?")
    public static final SubLObject transfers_throughP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArg, predicate, conduit_predicate, $list_alt5), mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * does PREDICATE thransferThrough CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does PREDICATE thransferThrough CONDUIT-PREDICATE?")
    public static SubLObject transfers_throughP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArg, predicate, conduit_predicate, $list5), mt, UNPROVIDED, UNPROVIDED);
    }/**
     * does PREDICATE thransferThrough CONDUIT-PREDICATE?
     */


    /**
     * does the inverse of PREDICATE thransferThrough CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does the inverse of PREDICATE thransferThrough CONDUIT-PREDICATE?")
    public static final SubLObject inverse_transfers_throughP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArg, predicate, conduit_predicate, $list_alt6), mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * does the inverse of PREDICATE thransferThrough CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does the inverse of PREDICATE thransferThrough CONDUIT-PREDICATE?")
    public static SubLObject inverse_transfers_throughP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArg, predicate, conduit_predicate, $list6), mt, UNPROVIDED, UNPROVIDED);
    }/**
     * does the inverse of PREDICATE thransferThrough CONDUIT-PREDICATE?
     */


    /**
     * does PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?")
    public static final SubLObject transfers_through_inverseP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArgInverse, predicate, conduit_predicate, $list_alt5), mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * does PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?")
    public static SubLObject transfers_through_inverseP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArgInverse, predicate, conduit_predicate, $list5), mt, UNPROVIDED, UNPROVIDED);
    }/**
     * does PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?
     */


    /**
     * does the inverse of PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does the inverse of PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?")
    public static final SubLObject inverse_transfers_through_inverseP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArgInverse, predicate, conduit_predicate, $list_alt6), mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     * does the inverse of PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?
     */
    @LispMethod(comment = "does the inverse of PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?")
    public static SubLObject inverse_transfers_through_inverseP(final SubLObject predicate, final SubLObject conduit_predicate, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.tuple_holds_in_relevant_mts(listS($$transitiveViaArgInverse, predicate, conduit_predicate, $list6), mt, UNPROVIDED, UNPROVIDED);
    }/**
     * does the inverse of PREDICATE thransferThrough the inverse of CONDUIT-PREDICATE?
     */


    public static final SubLObject tt_methodP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(v_object, gt_vars.$tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject tt_methodP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, gt_vars.$tt_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject generic_ttm_alt(SubLObject method, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject tti_function = com.cyc.cycjava.cycl.transfers_through.tt_method_function(method);
                if (tti_function.isFunctionSpec()) {
                    if (NIL != gt_vars.$gt_marking_table$.getDynamicValue(thread)) {
                        result = transitivity.apply_gti_function(tti_function, arg1, arg2, arg3, arg4, arg5);
                    } else {
                        {
                            SubLObject _prev_bind_0 = gt_vars.$gt_target_marking_table$.currentBinding(thread);
                            SubLObject _prev_bind_1 = gt_vars.$gt_marking_table$.currentBinding(thread);
                            try {
                                gt_vars.$gt_target_marking_table$.bind(gt_vars.$gt_marking_table$.getDynamicValue(thread), thread);
                                gt_vars.$gt_marking_table$.bind(NIL, thread);
                                gt_vars.$gt_marking_table$.setDynamicValue(make_hash_table($int$128, UNPROVIDED, UNPROVIDED), thread);
                                result = transitivity.apply_gti_function(tti_function, arg1, arg2, arg3, arg4, arg5);
                            } finally {
                                gt_vars.$gt_marking_table$.rebind(_prev_bind_1, thread);
                                gt_vars.$gt_target_marking_table$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    gt_utilities.gt_error(THREE_INTEGER, $str_alt9$invalid_gtm_method___s, tti_function, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return result;
            }
        }
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

    public static final SubLObject tt_method_function_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject function = second(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                if (function.isFunctionSpec()) {
                    return function;
                } else {
                    if (NIL != function) {
                        gt_utilities.gt_error(THREE_INTEGER, $str_alt10$method__s_maps_into_illegal_gt_fu, method, function, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        gt_utilities.gt_error(THREE_INTEGER, $str_alt11$illegal_transfers_through_method_, method, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject tt_method_arg_list_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return third(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
    }

    public static SubLObject tt_method_arg_list(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return third(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject tt_mt_arg_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return position(MT, remove($sym13$_OPTIONAL, third(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject tt_mt_arg(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return position(MT, remove($sym13$_OPTIONAL, third(assoc(method, gt_vars.$tt_dispatch_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject setup_transfers_through_module_alt(SubLObject module, SubLObject plist) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = gt_vars.$tt_parameters$.getDynamicValue(thread);
                SubLObject indicator = NIL;
                for (indicator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indicator = cdolist_list_var.first()) {
                    remprop(module, indicator);
                }
            }
            {
                SubLObject parameters = NIL;
                SubLObject parameter = NIL;
                SubLObject value = NIL;
                for (parameters = plist, parameter = parameters.first(), value = second(parameters); NIL != parameters; parameters = cddr(parameters) , parameter = parameters.first() , value = second(parameters)) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == subl_promotions.memberP(parameter, gt_vars.$tt_parameters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            Errors.error($str_alt14$_s_was_not_a_valid_transitivity_m, parameter);
                        }
                    }
                    put(module, parameter, value);
                }
                return module;
            }
        }
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

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg1 PREDICATE; the gathered targets are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg1 PREDICATE; the gathered targets are arg2s of PREDICATE)")
    public static final SubLObject tt_all_targets_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ttm(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg1 PREDICATE; the gathered targets are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg1 PREDICATE; the gathered targets are arg2s of PREDICATE)")
    public static SubLObject tt_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttm(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)")
    public static final SubLObject itt_all_targets_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ittm(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)")
    public static SubLObject itt_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittm(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg1 of PREDICATE; the gathered targets are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg1 of PREDICATE; the gathered targets are arg2s of PREDICATE)")
    public static final SubLObject tti_all_targets_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ttim(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg1 of PREDICATE; the gathered targets are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg1 of PREDICATE; the gathered targets are arg2s of PREDICATE)")
    public static SubLObject tti_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttim(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)")
    public static final SubLObject itti_all_targets_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ittim(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg2 of PREDICATE; the gatherd targets are arg1s of PREDICATE)")
    public static SubLObject itti_all_targets(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittim(predicate, conduit_predicate, $ALL_TARGETS, fort, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed from FORT via *tt-pred* transfering through *gt-pred*
     */
    @LispMethod(comment = "@return set; all terms accessed from FORT via *tt-pred* transfering through *gt-pred*")
    public static final SubLObject ttm_all_targets_alt(SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessed = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(fort, $TT_INDEX, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($DIRECTED)) {
                                        Errors.error($str_alt19$invalid_gt_mode___a, $DIRECTED);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_9 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($DIRECTED, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_10 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                {
                                                    SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                    SubLObject needs_to_releaseP = NIL;
                                                    try {
                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                        accessed = gt_search.tts_all_accessed(fort);
                                                        if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                                            {
                                                                SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                                                if (NIL != searched) {
                                                                    gt_utilities.gt_error(THREE_INTEGER, $str_alt22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        if (NIL != needs_to_releaseP) {
                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_10, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_9, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return accessed;
            }
        }
    }

    /**
     *
     *
     * @return set; all terms accessed from FORT via *tt-pred* transfering through *gt-pred*
     */
    @LispMethod(comment = "@return set; all terms accessed from FORT via *tt-pred* transfering through *gt-pred*")
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
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) ") + $TRUE;
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

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg2 PREDICATE; the gathered sources are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg2 PREDICATE; the gathered sources are arg1s of PREDICATE)")
    public static final SubLObject tt_all_sources_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ttm(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg2 PREDICATE; the gathered sources are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg2 PREDICATE; the gathered sources are arg1s of PREDICATE)")
    public static SubLObject tt_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttm(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)")
    public static final SubLObject itt_all_sources_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ittm(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE
    (i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE\r\n(i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)")
    public static SubLObject itt_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittm(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg2 of PREDICATE; the gathered sources are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg2 of PREDICATE; the gathered sources are arg1s of PREDICATE)")
    public static final SubLObject tti_all_sources_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ttim(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg2 of PREDICATE; the gathered sources are arg1s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg2 of PREDICATE; the gathered sources are arg1s of PREDICATE)")
    public static SubLObject tti_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttim(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)")
    public static final SubLObject itti_all_sources_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ittim(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse
    (i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse\r\n(i.e., TERM is taken to be an arg1 of PREDICATE; the gatherd sources are arg2s of PREDICATE)")
    public static SubLObject itti_all_sources(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittim(predicate, conduit_predicate, $ALL_SOURCES, v_term, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via *tt-pred* transfering through *gt-pred*
    (i.e., TERM is some designated arg of *gt-pred*)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via *tt-pred* transfering through *gt-pred*\r\n(i.e., TERM is some designated arg of *gt-pred*)")
    public static final SubLObject ttm_all_sources_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sources = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject catch_var = NIL;
                            try {
                                if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                    gt_utilities.gt_check_type_internal(v_term, $TT_GATHER, THREE_INTEGER);
                                }
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == gt_utilities.gt_modeP($INVERSE)) {
                                        Errors.error($str_alt19$invalid_gt_mode___a, $INVERSE);
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0_11 = gt_vars.$gt_mode$.currentBinding(thread);
                                    try {
                                        gt_vars.$gt_mode$.bind($INVERSE, thread);
                                        SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                        {
                                            SubLObject _prev_bind_0_12 = gt_vars.$gt_truth$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_truth$.bind($TRUE, thread);
                                                SubLTrampolineFile.checkType(gt_vars.$tt_gather_arg$.getDynamicValue(thread), FIXNUMP);
                                                {
                                                    SubLObject _prev_bind_0_13 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_compose_index_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                                                        SubLTrampolineFile.checkType(gt_vars.$tt_index_arg$.getDynamicValue(thread), FIXNUMP);
                                                        {
                                                            SubLObject _prev_bind_0_14 = gt_vars.$gt_compose_gather_arg$.currentBinding(thread);
                                                            try {
                                                                gt_vars.$gt_compose_gather_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                                                                {
                                                                    SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                    SubLObject needs_to_releaseP = NIL;
                                                                    try {
                                                                        needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                                        sources = gt_search.gt_compose_pred_all_accessed(v_term, gt_vars.$tt_pred$.getDynamicValue(thread));
                                                                        if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                                                            {
                                                                                SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                                                                if (NIL != searched) {
                                                                                    gt_utilities.gt_error(THREE_INTEGER, $str_alt22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        if (NIL != needs_to_releaseP) {
                                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                gt_vars.$gt_compose_gather_arg$.rebind(_prev_bind_0_14, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        gt_vars.$gt_compose_index_arg$.rebind(_prev_bind_0_13, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_truth$.rebind(_prev_bind_0_12, thread);
                                            }
                                        }
                                    } finally {
                                        gt_vars.$gt_mode$.rebind(_prev_bind_0_11, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return sources;
            }
        }
    }

    /**
     *
     *
     * @return set; all terms accessed backwards from indexed-term TERM via *tt-pred* transfering through *gt-pred*
    (i.e., TERM is some designated arg of *gt-pred*)
     */
    @LispMethod(comment = "@return set; all terms accessed backwards from indexed-term TERM via *tt-pred* transfering through *gt-pred*\r\n(i.e., TERM is some designated arg of *gt-pred*)")
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
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) ") + $TRUE;
                    final SubLObject _prev_bind_0_$12 = gt_vars.$gt_truth$.currentBinding(thread);
                    try {
                        gt_vars.$gt_truth$.bind($TRUE, thread);
                        assert NIL != fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) : "! fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) " + ("Types.fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.fixnump(gt_vars.$tt_gather_arg$.getDynamicValue(thread)) ") + gt_vars.$tt_gather_arg$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$13 = gt_vars.$gt_compose_index_arg$.currentBinding(thread);
                        try {
                            gt_vars.$gt_compose_index_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                            assert NIL != fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) : "! fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) " + ("Types.fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.fixnump(gt_vars.$tt_index_arg$.getDynamicValue(thread)) ") + gt_vars.$tt_index_arg$.getDynamicValue(thread);
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

    /**
     *
     *
     * @return boolean; t iff indexied-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE transfering through CONDUIT-PREDICATE;
    TERM-1 is taken to be an arg2 of CONDUIT-PREDICATE and, by infernce, an arg1 of PREDICATE;
    TERM-2 is taken to be an arg2 PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexied-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE transfering through CONDUIT-PREDICATE;\r\nTERM-1 is taken to be an arg2 of CONDUIT-PREDICATE and, by infernce, an arg1 of PREDICATE;\r\nTERM-2 is taken to be an arg2 PREDICATE")
    public static final SubLObject tt_booleanP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ttm(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexied-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE transfering through CONDUIT-PREDICATE;
    TERM-1 is taken to be an arg2 of CONDUIT-PREDICATE and, by infernce, an arg1 of PREDICATE;
    TERM-2 is taken to be an arg2 PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexied-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE transfering through CONDUIT-PREDICATE;\r\nTERM-1 is taken to be an arg2 of CONDUIT-PREDICATE and, by infernce, an arg1 of PREDICATE;\r\nTERM-2 is taken to be an arg2 PREDICATE")
    public static SubLObject tt_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttm(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE inverse transfering through CONDUIT-PREDICATE;
    TERM-1 is taken to be an arg1 PREDICATE;
    TERM-2 is taken to be an arg2 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE inverse transfering through CONDUIT-PREDICATE;\r\nTERM-1 is taken to be an arg1 PREDICATE;\r\nTERM-2 is taken to be an arg2 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE")
    public static final SubLObject itt_booleanP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ittm(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE inverse transfering through CONDUIT-PREDICATE;
    TERM-1 is taken to be an arg1 PREDICATE;
    TERM-2 is taken to be an arg2 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE inverse transfering through CONDUIT-PREDICATE;\r\nTERM-1 is taken to be an arg1 PREDICATE;\r\nTERM-2 is taken to be an arg2 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE")
    public static SubLObject itt_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittm(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE transfering through CONDUIT-PREDICATE inverse;
    TERM-1 is taken to be an arg1 CONDUIT-PREDICATE and, by inference, an arg1 of PREDICATE;
    TERM-2 is taken to be an arg2 of PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE transfering through CONDUIT-PREDICATE inverse;\r\nTERM-1 is taken to be an arg1 CONDUIT-PREDICATE and, by inference, an arg1 of PREDICATE;\r\nTERM-2 is taken to be an arg2 of PREDICATE")
    public static final SubLObject tti_booleanP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ttim(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE transfering through CONDUIT-PREDICATE inverse;
    TERM-1 is taken to be an arg1 CONDUIT-PREDICATE and, by inference, an arg1 of PREDICATE;
    TERM-2 is taken to be an arg2 of PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE transfering through CONDUIT-PREDICATE inverse;\r\nTERM-1 is taken to be an arg1 CONDUIT-PREDICATE and, by inference, an arg1 of PREDICATE;\r\nTERM-2 is taken to be an arg2 of PREDICATE")
    public static SubLObject tti_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ttim(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse
    TERM-1 is taken to be an arg1 PREDICATE;
    TERM-2 is taken to be an arg1 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE inverse transfering through CONDUIT-PREDICATE inverse\r\nTERM-1 is taken to be an arg1 PREDICATE;\r\nTERM-2 is taken to be an arg1 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE")
    public static final SubLObject itti_booleanP_alt(SubLObject predicate, SubLObject conduit_predicate, SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return com.cyc.cycjava.cycl.transfers_through.ittim(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1
    via PREDICATE inverse transfering through CONDUIT-PREDICATE inverse
    TERM-1 is taken to be an arg1 PREDICATE;
    TERM-2 is taken to be an arg1 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 is accessible from indexed-term TERM-1\r\nvia PREDICATE inverse transfering through CONDUIT-PREDICATE inverse\r\nTERM-1 is taken to be an arg1 PREDICATE;\r\nTERM-2 is taken to be an arg1 of CONDUIT-PREDICATE and, by inference, an arg2 of PREDICATE")
    public static SubLObject itti_booleanP(final SubLObject predicate, final SubLObject conduit_predicate, final SubLObject term_1, final SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return ittim(predicate, conduit_predicate, $BOOLEAN_, term_1, term_2, mt, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1
    via an externally designated transfers-through inference?
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1\r\nvia an externally designated transfers-through inference?")
    public static final SubLObject ttm_booleanP_alt(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject booleanP = NIL;
                SubLObject source = NIL;
                SubLObject target = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
                            if (pcase_var.eql(ONE_INTEGER)) {
                                source = term_1;
                                target = term_2;
                            } else {
                                if (pcase_var.eql(TWO_INTEGER)) {
                                    source = term_2;
                                    target = term_1;
                                }
                            }
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                        gt_utilities.gt_check_type_internal(source, $TT_INDEX, THREE_INTEGER);
                                    }
                                    if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                        gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($DIRECTED)) {
                                            Errors.error($str_alt19$invalid_gt_mode___a, $DIRECTED);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_15 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($DIRECTED, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_16 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    {
                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                        SubLObject needs_to_releaseP = NIL;
                                                        try {
                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                            booleanP = com.cyc.cycjava.cycl.transfers_through.tts_accessesP(source, target, UNPROVIDED);
                                                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                                                {
                                                                    SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                                                    if (NIL != searched) {
                                                                        gt_utilities.gt_error(THREE_INTEGER, $str_alt22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            if (NIL != needs_to_releaseP) {
                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_16, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_15, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return booleanP;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1
    via an externally designated transfers-through inference?
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1\r\nvia an externally designated transfers-through inference?")
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
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) ") + $TRUE;
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

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1
    via an externally designated transfers-through inference?
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1\r\nvia an externally designated transfers-through inference?")
    public static final SubLObject ttm_accesses_in_what_mts_alt(SubLObject term_1, SubLObject term_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject mts = NIL;
                SubLObject source = NIL;
                SubLObject target = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        {
                            SubLObject pcase_var = gt_vars.$gt_index_arg$.getDynamicValue(thread);
                            if (pcase_var.eql(ONE_INTEGER)) {
                                source = term_1;
                                target = term_2;
                            } else {
                                if (pcase_var.eql(TWO_INTEGER)) {
                                    source = term_2;
                                    target = term_1;
                                }
                            }
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                        gt_utilities.gt_check_type_internal(source, $TT_INDEX, THREE_INTEGER);
                                    }
                                    if (!(((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != gt_vars.$suspend_gt_type_checkingP$.getDynamicValue(thread))) || (NIL != Errors.$ignore_mustsP$.getDynamicValue(thread)))) {
                                        gt_utilities.gt_check_type_internal(target, $GT_GATHER, THREE_INTEGER);
                                    }
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == gt_utilities.gt_modeP($DIRECTED)) {
                                            Errors.error($str_alt19$invalid_gt_mode___a, $DIRECTED);
                                        }
                                    }
                                    {
                                        SubLObject _prev_bind_0_17 = gt_vars.$gt_mode$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_mode$.bind($DIRECTED, thread);
                                            SubLTrampolineFile.checkType($TRUE, TRUTH_P);
                                            {
                                                SubLObject _prev_bind_0_18 = gt_vars.$gt_truth$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_truth$.bind($TRUE, thread);
                                                    {
                                                        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                        SubLObject needs_to_releaseP = NIL;
                                                        try {
                                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                                            mts = com.cyc.cycjava.cycl.transfers_through.tts_accesses_in_what_mts(source, target);
                                                            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
                                                                {
                                                                    SubLObject searched = sbhl_marking_utilities.sbhl_marked_nodes(UNPROVIDED);
                                                                    if (NIL != searched) {
                                                                        gt_utilities.gt_error(THREE_INTEGER, $str_alt22$_s_marked_constants___s, length(searched), searched, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            if (NIL != needs_to_releaseP) {
                                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    gt_vars.$gt_truth$.rebind(_prev_bind_0_18, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_mode$.rebind(_prev_bind_0_17, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $GT_ERROR);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return mts;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1
    via an externally designated transfers-through inference?
     */
    @LispMethod(comment = "@return boolean; t iff indexed-term TERM-2 can be accessed from indexed-term TERM-1\r\nvia an externally designated transfers-through inference?")
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
                    assert NIL != enumeration_types.truth_p($TRUE) : "! enumeration_types.truth_p( _KW.$TRUE) " + ("enumeration_types.truth_p(transfers_through.$kw20$TRUE) " + "CommonSymbols.NIL != enumeration_types.truth_p(transfers_through.$kw20$TRUE) ") + $TRUE;
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

    public static final SubLObject tts_accessesP_alt(SubLObject constant, SubLObject target, SubLObject compare_fn) {
        if (compare_fn == UNPROVIDED) {
            compare_fn = symbol_function(EQ);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = (NIL != kb_accessors.reflexive_predicateP(gt_vars.$tt_pred$.getDynamicValue(thread))) ? ((SubLObject) (funcall(compare_fn, constant, target))) : NIL;
                if (NIL == result) {
                    {
                        SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                        try {
                            gt_vars.$gt_result$.bind(NIL, thread);
                            {
                                SubLObject direct = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_19 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = gt_vars.$gt_pred$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = gt_vars.$gt_truth$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = gt_vars.$gt_result$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                                            gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                                            gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
                                            gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
                                            gt_vars.$gt_result$.bind(NIL, thread);
                                            SubLTrampolineFile.checkType(GT_GATHER_LINK_NODE, FUNCTION_SPEC_P);
                                            {
                                                SubLObject _prev_bind_0_20 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_base_fn$.bind(GT_GATHER_LINK_NODE, thread);
                                                    gt_search.gt_map_links(constant, UNPROVIDED);
                                                    direct = gt_vars.$gt_result$.getDynamicValue(thread);
                                                } finally {
                                                    gt_vars.$gt_base_fn$.rebind(_prev_bind_0_20, thread);
                                                }
                                            }
                                        } finally {
                                            gt_vars.$gt_result$.rebind(_prev_bind_4, thread);
                                            gt_vars.$gt_truth$.rebind(_prev_bind_3, thread);
                                            gt_vars.$gt_pred$.rebind(_prev_bind_2, thread);
                                            gt_vars.$gt_gather_arg$.rebind(_prev_bind_1, thread);
                                            gt_vars.$gt_index_arg$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    gt_vars.$gt_result$.setDynamicValue(subl_promotions.memberP(target, direct, compare_fn, UNPROVIDED), thread);
                                    if (NIL == gt_vars.$gt_result$.getDynamicValue(thread)) {
                                        {
                                            SubLObject _prev_bind_0_21 = gt_vars.$gt_target$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_target$.bind(target, thread);
                                                SubLTrampolineFile.checkType(compare_fn, FUNCTION_SPEC_P);
                                                {
                                                    SubLObject _prev_bind_0_22 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                                                        if (NIL != (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? ((SubLObject) (GT_MAP_LINKS)) : NIL)) {
                                                            SubLTrampolineFile.checkType(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? ((SubLObject) (GT_MAP_LINKS)) : NIL, FUNCTION_SPEC_P);
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_23 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                                            try {
                                                                gt_vars.$gt_step_fn$.bind(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? ((SubLObject) (GT_MAP_LINKS)) : NIL, thread);
                                                                SubLTrampolineFile.checkType(GT_TEST_LINK_NODE, FUNCTION_SPEC_P);
                                                                {
                                                                    SubLObject _prev_bind_0_24 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                                    try {
                                                                        gt_vars.$gt_base_fn$.bind(GT_TEST_LINK_NODE, thread);
                                                                        if (NIL == gt_vars.$gt_result$.getDynamicValue(thread)) {
                                                                            {
                                                                                SubLObject csome_list_var = direct;
                                                                                SubLObject node = NIL;
                                                                                for (node = csome_list_var.first(); !((NIL != gt_vars.$gt_result$.getDynamicValue(thread)) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , node = csome_list_var.first()) {
                                                                                    if (NIL != gt_utilities.gt_term_p(node)) {
                                                                                        gt_search.gt_map_links(node, UNPROVIDED);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_24, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_23, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        gt_vars.$gt_compare_fn$.rebind(_prev_bind_0_22, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_target$.rebind(_prev_bind_0_21, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            clrhash(gt_vars.$gt_marking_table$.getDynamicValue(thread));
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                        }
                                    }
                                }
                                result = gt_vars.$gt_result$.getDynamicValue(thread);
                            }
                        } finally {
                            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
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
                        assert NIL != function_spec_p(GT_GATHER_LINK_NODE) : "! function_spec_p(transfers_through.GT_GATHER_LINK_NODE) " + ("Types.function_spec_p(transfers_through.$sym29$GT_GATHER_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(transfers_through.$sym29$GT_GATHER_LINK_NODE) ") + GT_GATHER_LINK_NODE;
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
                            assert NIL != function_spec_p(compare_fn) : "! function_spec_p(compare_fn) " + ("Types.function_spec_p(compare_fn) " + "CommonSymbols.NIL != Types.function_spec_p(compare_fn) ") + compare_fn;
                            final SubLObject _prev_bind_0_$22 = gt_vars.$gt_compare_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_compare_fn$.bind(compare_fn, thread);
                                if (((NIL != (NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL)) && (!assertionsDisabledSynth)) && (NIL == function_spec_p(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL))) {
                                    throw new AssertionError(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL);
                                }
                                final SubLObject _prev_bind_0_$23 = gt_vars.$gt_step_fn$.currentBinding(thread);
                                try {
                                    gt_vars.$gt_step_fn$.bind(NIL != gt_vars.$tt_transitive_conduitP$.getDynamicValue(thread) ? GT_MAP_LINKS : NIL, thread);
                                    assert NIL != function_spec_p(GT_TEST_LINK_NODE) : "! function_spec_p(transfers_through.GT_TEST_LINK_NODE) " + ("Types.function_spec_p(transfers_through.$sym32$GT_TEST_LINK_NODE) " + "CommonSymbols.NIL != Types.function_spec_p(transfers_through.$sym32$GT_TEST_LINK_NODE) ") + GT_TEST_LINK_NODE;
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

    public static final SubLObject tts_accesses_in_what_mts_alt(SubLObject constant, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject direct = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    SubLObject _prev_bind_1 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    SubLObject _prev_bind_2 = gt_vars.$gt_pred$.currentBinding(thread);
                    SubLObject _prev_bind_3 = gt_vars.$gt_truth$.currentBinding(thread);
                    SubLObject _prev_bind_4 = gt_vars.$gt_result$.currentBinding(thread);
                    SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_6 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        gt_vars.$gt_index_arg$.bind(gt_vars.$tt_index_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_gather_arg$.bind(gt_vars.$tt_gather_arg$.getDynamicValue(thread), thread);
                        gt_vars.$gt_pred$.bind(gt_vars.$tt_pred$.getDynamicValue(thread), thread);
                        gt_vars.$gt_truth$.bind(gt_vars.$tt_truth$.getDynamicValue(thread), thread);
                        gt_vars.$gt_result$.bind(NIL, thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        SubLTrampolineFile.checkType(symbol_function(GT_GATHER_LINK_NODE_AND_MT), FUNCTION_SPEC_P);
                        {
                            SubLObject _prev_bind_0_26 = gt_vars.$gt_base_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_base_fn$.bind(symbol_function(GT_GATHER_LINK_NODE_AND_MT), thread);
                                gt_search.gt_map_links(constant, UNPROVIDED);
                                direct = gt_vars.$gt_result$.getDynamicValue(thread);
                            } finally {
                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_26, thread);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_6, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                        gt_vars.$gt_result$.rebind(_prev_bind_4, thread);
                        gt_vars.$gt_truth$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_1, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject path_mts = NIL;
                    SubLObject cdolist_list_var = direct;
                    SubLObject nodeXmt = NIL;
                    for (nodeXmt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nodeXmt = cdolist_list_var.first()) {
                        {
                            SubLObject datum = nodeXmt;
                            SubLObject current = datum;
                            SubLObject node = NIL;
                            SubLObject mt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt36);
                            node = current.first();
                            current = current.rest();
                            mt = current;
                            if (NIL != gt_utilities.gt_term_p(node)) {
                                {
                                    SubLObject subpath_mts = NIL;
                                    {
                                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            subpath_mts = gt_methods.gtm_in_what_mts(node, target, $HIERARCHICALLY_DIRECT);
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                    {
                                        SubLObject cdolist_list_var_27 = subpath_mts;
                                        SubLObject subpath_mt = NIL;
                                        for (subpath_mt = cdolist_list_var_27.first(); NIL != cdolist_list_var_27; cdolist_list_var_27 = cdolist_list_var_27.rest() , subpath_mt = cdolist_list_var_27.first()) {
                                            {
                                                SubLObject completed_path_mts = (subpath_mt == mt) ? ((SubLObject) (list(mt))) : genl_mts.max_floor_mts(genl_mts.min_mts(list(mt, subpath_mt), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                SubLObject cdolist_list_var_28 = completed_path_mts;
                                                SubLObject path_mt = NIL;
                                                for (path_mt = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , path_mt = cdolist_list_var_28.first()) {
                                                    {
                                                        SubLObject item_var = path_mt;
                                                        if (NIL == member(item_var, path_mts, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            path_mts = cons(item_var, path_mts);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    result = path_mts;
                }
                return result;
            }
        }
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
            assert NIL != function_spec_p(symbol_function(GT_GATHER_LINK_NODE_AND_MT)) : "! function_spec_p(Symbols.symbol_function(transfers_through.GT_GATHER_LINK_NODE_AND_MT)) " + ("Types.function_spec_p(Symbols.symbol_function(transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT)) " + "CommonSymbols.NIL != Types.function_spec_p(Symbols.symbol_function(transfers_through.$sym35$GT_GATHER_LINK_NODE_AND_MT)) ") + symbol_function(GT_GATHER_LINK_NODE_AND_MT);
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
        declareFunction("ttm", "TTM", 3, 5, false);
        declareFunction("ittm", "ITTM", 3, 5, false);
        declareFunction("ttim", "TTIM", 3, 5, false);
        declareFunction("ittim", "ITTIM", 3, 5, false);
        declareFunction("transfers_throughP", "TRANSFERS-THROUGH?", 2, 1, false);
        declareFunction("inverse_transfers_throughP", "INVERSE-TRANSFERS-THROUGH?", 2, 1, false);
        declareFunction("transfers_through_inverseP", "TRANSFERS-THROUGH-INVERSE?", 2, 1, false);
        declareFunction("inverse_transfers_through_inverseP", "INVERSE-TRANSFERS-THROUGH-INVERSE?", 2, 1, false);
        declareFunction("tt_methodP", "TT-METHOD?", 1, 0, false);
        declareFunction("generic_ttm", "GENERIC-TTM", 1, 5, false);
        declareFunction("tt_method_function", "TT-METHOD-FUNCTION", 1, 0, false);
        declareFunction("tt_method_arg_list", "TT-METHOD-ARG-LIST", 1, 0, false);
        declareFunction("tt_mt_arg", "TT-MT-ARG", 1, 0, false);
        declareFunction("setup_transfers_through_module", "SETUP-TRANSFERS-THROUGH-MODULE", 2, 0, false);
        declareFunction("tt_all_targets", "TT-ALL-TARGETS", 3, 1, false);
        declareFunction("itt_all_targets", "ITT-ALL-TARGETS", 3, 1, false);
        declareFunction("tti_all_targets", "TTI-ALL-TARGETS", 3, 1, false);
        declareFunction("itti_all_targets", "ITTI-ALL-TARGETS", 3, 1, false);
        declareFunction("ttm_all_targets", "TTM-ALL-TARGETS", 1, 1, false);
        declareFunction("tt_all_sources", "TT-ALL-SOURCES", 3, 1, false);
        declareFunction("itt_all_sources", "ITT-ALL-SOURCES", 3, 1, false);
        declareFunction("tti_all_sources", "TTI-ALL-SOURCES", 3, 1, false);
        declareFunction("itti_all_sources", "ITTI-ALL-SOURCES", 3, 1, false);
        declareFunction("ttm_all_sources", "TTM-ALL-SOURCES", 1, 1, false);
        declareFunction("tt_booleanP", "TT-BOOLEAN?", 4, 1, false);
        declareFunction("itt_booleanP", "ITT-BOOLEAN?", 4, 1, false);
        declareFunction("tti_booleanP", "TTI-BOOLEAN?", 4, 1, false);
        declareFunction("itti_booleanP", "ITTI-BOOLEAN?", 4, 1, false);
        declareFunction("ttm_booleanP", "TTM-BOOLEAN?", 2, 1, false);
        declareFunction("ttm_accesses_in_what_mts", "TTM-ACCESSES-IN-WHAT-MTS", 2, 1, false);
        declareFunction("tts_accessesP", "TTS-ACCESSES?", 2, 1, false);
        declareFunction("tts_accesses_in_what_mts", "TTS-ACCESSES-IN-WHAT-MTS", 2, 0, false);
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

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$___transitiveViaArg__s__s_1__not_ = makeString("(#$transitiveViaArg ~s ~s 1) not declared");

    static private final SubLString $str_alt1$___transitiveViaArg__s__s_2__not_ = makeString("(#$transitiveViaArg ~s ~s 2) not declared");

    static private final SubLString $str_alt2$___transitiveViaArgInverse__s__s_ = makeString("(#$transitiveViaArgInverse ~s ~s 1) not declared");

    static private final SubLString $str_alt3$___transitiveViaArgInverse__s__s_ = makeString("(#$transitiveViaArgInverse ~s ~s 2) not declared");

    static private final SubLList $list_alt5 = list(ONE_INTEGER);

    static private final SubLList $list_alt6 = list(TWO_INTEGER);

    static private final SubLString $str_alt9$invalid_gtm_method___s = makeString("invalid gtm method: ~s");

    static private final SubLString $str_alt10$method__s_maps_into_illegal_gt_fu = makeString("method ~s maps into illegal gt function ~s)");

    static private final SubLString $str_alt11$illegal_transfers_through_method_ = makeString("illegal transfers-through method: ~s");

    static private final SubLString $str_alt14$_s_was_not_a_valid_transitivity_m = makeString("~s was not a valid transitivity-module parameter");

    static private final SubLString $str_alt19$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLString $str_alt22$_s_marked_constants___s = makeString("~s marked constants: ~s");

    static private final SubLList $list_alt36 = cons(makeSymbol("NODE"), makeSymbol("MT"));
}

/**
 * Total time: 502 ms synthetic
 */
