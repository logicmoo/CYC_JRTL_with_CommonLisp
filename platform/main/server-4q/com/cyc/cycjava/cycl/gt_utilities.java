/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GT-UTILITIES
 * source file: /cyc/top/cycl/gt-utilities.lisp
 * created:     2019/07/03 17:37:35
 */
public final class gt_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new gt_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.gt_utilities";


    static private final SubLSymbol $sym1$GT_INDEX_ARG_OK_ = makeSymbol("GT-INDEX-ARG-OK?");

    static private final SubLSymbol $sym3$GT_GATHER_ARG_OK_ = makeSymbol("GT-GATHER-ARG-OK?");

    static private final SubLSymbol $sym5$GT_EITHER_ARG_OK_ = makeSymbol("GT-EITHER-ARG-OK?");

    static private final SubLSymbol $sym7$TT_INDEX_ARG_OK_ = makeSymbol("TT-INDEX-ARG-OK?");

    static private final SubLSymbol $sym9$TT_GATHER_ARG_OK_ = makeSymbol("TT-GATHER-ARG-OK?");

    static private final SubLList $list12 = list(makeSymbol("*GT-PRED*"), makeSymbol("*GT-INDEX-ARG*"), makeSymbol("*GT-GATHER-ARG*"));

    private static final SubLInteger $int$128 = makeInteger(128);

    static private final SubLSymbol $sym16$GT_SEARCHED_ = makeSymbol("GT-SEARCHED?");

    static private final SubLString $str20$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLSymbol $sym21$GT_EACH_LINK_NODE_ = makeSymbol("GT-EACH-LINK-NODE?");

    static private final SubLString $str22$illegal_value_of__gt_mode_ = makeString("illegal value of *gt-mode*");

    static private final SubLString $$$skip_gt_query = makeString("skip gt query");

    static private final SubLString $str24$_gt_type_violaton___a = makeString("(gt type violaton) ~a");

    private static final SubLSymbol GT_MAP_LINKS = makeSymbol("GT-MAP-LINKS");

    private static final SubLSymbol GT_MAP_LINKS_REBINDING_CANDIDATE_MTS = makeSymbol("GT-MAP-LINKS-REBINDING-CANDIDATE-MTS");

    private static final SubLSymbol GT_GATHER_LINK_NODE = makeSymbol("GT-GATHER-LINK-NODE");

    private static final SubLSymbol GT_TEST_LINK_NODE = makeSymbol("GT-TEST-LINK-NODE");

    private static final SubLSymbol GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY = makeSymbol("GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY");

    private static final SubLSymbol GT_GATHER_ACCESS_JUST = makeSymbol("GT-GATHER-ACCESS-JUST");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    // Definitions
    /**
     *
     *
     * @return booleanp; Whether OBJ is a valid term in GT searches.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJ is a valid term in GT searches.")
    public static final SubLObject gt_term_p_alt(SubLObject obj) {
        if (NIL != cycl_utilities.reified_term_p(obj)) {
            return T;
        }
        if (NIL != sksi_tva_utilities.sksi_transitivity_possibleP()) {
            return sksi_infrastructure_utilities.sksi_external_term_p(obj);
        }
        return NIL;
    }

    // Definitions
    /**
     *
     *
     * @return booleanp; Whether OBJ is a valid term in GT searches.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJ is a valid term in GT searches.")
    public static SubLObject gt_term_p(final SubLObject obj) {
        if (NIL != cycl_utilities.reified_term_p(obj)) {
            return T;
        }
        if (NIL != sksi_tva_utilities.sksi_transitivity_possibleP()) {
            return sksi_infrastructure_utilities.sksi_external_term_p(obj);
        }
        return NIL;
    }

    public static final SubLObject gt_modeP_alt(SubLObject mode) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return subl_promotions.memberP(mode, gt_vars.$gt_modes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject gt_modeP(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(mode, gt_vars.$gt_modes$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gt_type_fn_alt(SubLObject type) {
        {
            SubLObject pcase_var = type;
            if (pcase_var.eql($GT_INDEX)) {
                return $sym1$GT_INDEX_ARG_OK_;
            } else {
                if (pcase_var.eql($GT_GATHER)) {
                    return $sym3$GT_GATHER_ARG_OK_;
                } else {
                    if (pcase_var.eql($GT_EITHER)) {
                        return $sym5$GT_EITHER_ARG_OK_;
                    } else {
                        if (pcase_var.eql($TT_INDEX)) {
                            return $sym7$TT_INDEX_ARG_OK_;
                        } else {
                            if (pcase_var.eql($TT_GATHER)) {
                                return $sym9$TT_GATHER_ARG_OK_;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject gt_type_fn(final SubLObject type) {
        if (type.eql($GT_INDEX)) {
            return $sym1$GT_INDEX_ARG_OK_;
        }
        if (type.eql($GT_GATHER)) {
            return $sym3$GT_GATHER_ARG_OK_;
        }
        if (type.eql($GT_EITHER)) {
            return $sym5$GT_EITHER_ARG_OK_;
        }
        if (type.eql($TT_INDEX)) {
            return $sym7$TT_INDEX_ARG_OK_;
        }
        if (type.eql($TT_GATHER)) {
            return $sym9$TT_GATHER_ARG_OK_;
        }
        return NIL;
    }

    public static final SubLObject gt_reflexiveP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    return kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread));
                } else {
                    if (pcase_var.eql($ACCESSORS)) {
                        {
                            SubLObject not_reflexiveP = NIL;
                            if (NIL == not_reflexiveP) {
                                {
                                    SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                                    SubLObject accessor = NIL;
                                    for (accessor = csome_list_var.first(); !((NIL != not_reflexiveP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , accessor = csome_list_var.first()) {
                                        {
                                            SubLObject datum = accessor;
                                            SubLObject current = datum;
                                            {
                                                SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_pred$.bind(NIL, thread);
                                                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                                                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        not_reflexiveP = makeBoolean(NIL == kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)));
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt12);
                                                    }
                                                } finally {
                                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                                                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return makeBoolean(NIL == not_reflexiveP);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_reflexiveP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql($ASSERTION)) {
            return kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread));
        }
        if (pcase_var.eql($ACCESSORS)) {
            SubLObject not_reflexiveP = NIL;
            if (NIL == not_reflexiveP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = NIL;
                accessor = csome_list_var.first();
                while ((NIL == not_reflexiveP) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind(NIL, thread);
                        gt_vars.$gt_index_arg$.bind(NIL, thread);
                        gt_vars.$gt_gather_arg$.bind(NIL, thread);
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (NIL == current) {
                            not_reflexiveP = makeBoolean(NIL == kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)));
                        } else {
                            cdestructuring_bind_error(datum, $list12);
                        }
                    } finally {
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    accessor = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == not_reflexiveP);
        }
        return NIL;
    }

    public static final SubLObject gt_index_arg_okP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    return arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    if (pcase_var.eql($ACCESSORS)) {
                        {
                            SubLObject okP = NIL;
                            if (NIL == okP) {
                                {
                                    SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                                    SubLObject accessor = NIL;
                                    for (accessor = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , accessor = csome_list_var.first()) {
                                        {
                                            SubLObject datum = accessor;
                                            SubLObject current = datum;
                                            {
                                                SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_pred$.bind(NIL, thread);
                                                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                                                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        okP = arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED);
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt12);
                                                    }
                                                } finally {
                                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                                                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return okP;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_index_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql($ASSERTION)) {
            return arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED);
        }
        if (pcase_var.eql($ACCESSORS)) {
            SubLObject okP = NIL;
            if (NIL == okP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = NIL;
                accessor = csome_list_var.first();
                while ((NIL == okP) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind(NIL, thread);
                        gt_vars.$gt_index_arg$.bind(NIL, thread);
                        gt_vars.$gt_gather_arg$.bind(NIL, thread);
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (NIL == current) {
                            okP = arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list12);
                        }
                    } finally {
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    accessor = csome_list_var.first();
                } 
            }
            return okP;
        }
        return NIL;
    }

    public static final SubLObject gt_gather_arg_okP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    return arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    if (pcase_var.eql($ACCESSORS)) {
                        {
                            SubLObject okP = NIL;
                            if (NIL == okP) {
                                {
                                    SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                                    SubLObject accessor = NIL;
                                    for (accessor = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , accessor = csome_list_var.first()) {
                                        {
                                            SubLObject datum = accessor;
                                            SubLObject current = datum;
                                            {
                                                SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_pred$.bind(NIL, thread);
                                                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                                                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        okP = arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED);
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt12);
                                                    }
                                                } finally {
                                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                                                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return okP;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_gather_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql($ASSERTION)) {
            return arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED);
        }
        if (pcase_var.eql($ACCESSORS)) {
            SubLObject okP = NIL;
            if (NIL == okP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = NIL;
                accessor = csome_list_var.first();
                while ((NIL == okP) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind(NIL, thread);
                        gt_vars.$gt_index_arg$.bind(NIL, thread);
                        gt_vars.$gt_gather_arg$.bind(NIL, thread);
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (NIL == current) {
                            okP = arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED);
                        } else {
                            cdestructuring_bind_error(datum, $list12);
                        }
                    } finally {
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    accessor = csome_list_var.first();
                } 
            }
            return okP;
        }
        return NIL;
    }

    public static final SubLObject tt_index_arg_okP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return arg_type.relation_arg_okP(gt_vars.$tt_pred$.getDynamicValue(thread), v_object, gt_vars.$tt_index_arg$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject tt_index_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arg_type.relation_arg_okP(gt_vars.$tt_pred$.getDynamicValue(thread), v_object, gt_vars.$tt_index_arg$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject tt_gather_arg_okP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return arg_type.relation_arg_okP(gt_vars.$tt_pred$.getDynamicValue(thread), v_object, gt_vars.$tt_gather_arg$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    public static SubLObject tt_gather_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arg_type.relation_arg_okP(gt_vars.$tt_pred$.getDynamicValue(thread), v_object, gt_vars.$tt_gather_arg$.getDynamicValue(thread), UNPROVIDED);
    }

    public static final SubLObject gt_either_arg_okP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    return makeBoolean((NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED)) || (NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED)));
                } else {
                    if (pcase_var.eql($ACCESSORS)) {
                        {
                            SubLObject okP = NIL;
                            if (NIL == okP) {
                                {
                                    SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                                    SubLObject accessor = NIL;
                                    for (accessor = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , accessor = csome_list_var.first()) {
                                        {
                                            SubLObject datum = accessor;
                                            SubLObject current = datum;
                                            {
                                                SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_pred$.bind(NIL, thread);
                                                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                                                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        okP = makeBoolean((NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED)) || (NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED)));
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt12);
                                                    }
                                                } finally {
                                                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                                                    gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                                                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return okP;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_either_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql($ASSERTION)) {
            return makeBoolean((NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED)) || (NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED)));
        }
        if (pcase_var.eql($ACCESSORS)) {
            SubLObject okP = NIL;
            if (NIL == okP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = NIL;
                accessor = csome_list_var.first();
                while ((NIL == okP) && (NIL != csome_list_var)) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind(NIL, thread);
                        gt_vars.$gt_index_arg$.bind(NIL, thread);
                        gt_vars.$gt_gather_arg$.bind(NIL, thread);
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (NIL == current) {
                            okP = makeBoolean((NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED)) || (NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED)));
                        } else {
                            cdestructuring_bind_error(datum, $list12);
                        }
                    } finally {
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    accessor = csome_list_var.first();
                } 
            }
            return okP;
        }
        return NIL;
    }

    public static final SubLObject gt_type_violation_alt(SubLObject type, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
                if (pcase_var.eql($ASSERTION)) {
                    return com.cyc.cycjava.cycl.gt_utilities.gt_assertion_type_violation(type, node);
                } else {
                    if (pcase_var.eql($ACCESSORS)) {
                        {
                            SubLObject violations = NIL;
                            SubLObject cdolist_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                            SubLObject accessor = NIL;
                            for (accessor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessor = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = accessor;
                                    SubLObject current = datum;
                                    {
                                        SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = gt_vars.$gt_index_arg$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                                        try {
                                            gt_vars.$gt_pred$.bind(NIL, thread);
                                            gt_vars.$gt_index_arg$.bind(NIL, thread);
                                            gt_vars.$gt_gather_arg$.bind(NIL, thread);
                                            destructuring_bind_must_consp(current, datum, $list_alt12);
                                            gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt12);
                                            gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list_alt12);
                                            gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                                            current = current.rest();
                                            if (NIL == current) {
                                                if ((type == $GT_INDEX) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED))) {
                                                    violations = cons(com.cyc.cycjava.cycl.gt_utilities.gt_assertion_type_violation(type, node), violations);
                                                } else {
                                                    if ((type == $GT_GATHER) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED))) {
                                                        violations = cons(com.cyc.cycjava.cycl.gt_utilities.gt_assertion_type_violation(type, node), violations);
                                                    } else {
                                                        if (((type == $GT_EITHER) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED))) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED))) {
                                                            violations = cons(com.cyc.cycjava.cycl.gt_utilities.gt_assertion_type_violation(type, node), violations);
                                                        }
                                                    }
                                                }
                                            } else {
                                                cdestructuring_bind_error(datum, $list_alt12);
                                            }
                                        } finally {
                                            gt_vars.$gt_gather_arg$.rebind(_prev_bind_2, thread);
                                            gt_vars.$gt_index_arg$.rebind(_prev_bind_1, thread);
                                            gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            }
                            return apply(symbol_function(CCONCATENATE), nreverse(violations));
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_type_violation(final SubLObject type, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql($ASSERTION)) {
            return gt_assertion_type_violation(type, node);
        }
        if (pcase_var.eql($ACCESSORS)) {
            SubLObject violations = NIL;
            SubLObject cdolist_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
            SubLObject accessor = NIL;
            accessor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = accessor;
                final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                try {
                    gt_vars.$gt_pred$.bind(NIL, thread);
                    gt_vars.$gt_index_arg$.bind(NIL, thread);
                    gt_vars.$gt_gather_arg$.bind(NIL, thread);
                    destructuring_bind_must_consp(current, datum, $list12);
                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list12);
                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list12);
                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    if (NIL == current) {
                        if ((type == $GT_INDEX) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED))) {
                            violations = cons(gt_assertion_type_violation(type, node), violations);
                        } else
                            if ((type == $GT_GATHER) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED))) {
                                violations = cons(gt_assertion_type_violation(type, node), violations);
                            } else
                                if (((type == $GT_EITHER) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_index_arg$.getDynamicValue(thread), UNPROVIDED))) && (NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_gather_arg$.getDynamicValue(thread), UNPROVIDED))) {
                                    violations = cons(gt_assertion_type_violation(type, node), violations);
                                }


                    } else {
                        cdestructuring_bind_error(datum, $list12);
                    }
                } finally {
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                accessor = cdolist_list_var.first();
            } 
            return apply(symbol_function(CCONCATENATE), nreverse(violations));
        }
        return NIL;
    }

    public static final SubLObject gt_assertion_type_violation_alt(SubLObject type, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = type;
                if (pcase_var.eql($GT_INDEX)) {
                    return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
                } else {
                    if (pcase_var.eql($GT_GATHER)) {
                        return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
                    } else {
                        if (pcase_var.eql($GT_EITHER)) {
                            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
                        } else {
                            if (pcase_var.eql($TT_INDEX)) {
                                return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
                            } else {
                                if (pcase_var.eql($TT_GATHER)) {
                                    return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
                                } else {
                                    if (pcase_var.eql($TT_EITHER)) {
                                        return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_assertion_type_violation(final SubLObject type, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (type.eql($GT_INDEX)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
        }
        if (type.eql($GT_GATHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
        }
        if (type.eql($GT_EITHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
        }
        if (type.eql($TT_INDEX)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
        }
        if (type.eql($TT_GATHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
        }
        if (type.eql($TT_EITHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject make_gt_search_space_alt(SubLObject size) {
        if (size == UNPROVIDED) {
            size = $int$128;
        }
        return make_hash_table(size, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_gt_search_space(SubLObject size) {
        if (size == UNPROVIDED) {
            size = $int$128;
        }
        return make_hash_table(size, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject gt_not_all_predecessors_searchedP_alt(SubLObject node) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.gt_utilities.gt_all_predecessors_searchedP(node));
    }

    public static SubLObject gt_not_all_predecessors_searchedP(final SubLObject node) {
        return makeBoolean(NIL == gt_all_predecessors_searchedP(node));
    }

    /**
     * has each search predecessor of NODE been searched?
     */
    @LispMethod(comment = "has each search predecessor of NODE been searched?")
    public static final SubLObject gt_all_predecessors_searchedP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
                    try {
                        gt_vars.$gt_result$.bind(T, thread);
                        if (NIL != symbol_function($sym16$GT_SEARCHED_)) {
                            SubLTrampolineFile.checkType(symbol_function($sym16$GT_SEARCHED_), FUNCTION_SPEC_P);
                        }
                        {
                            SubLObject _prev_bind_0_1 = gt_vars.$gt_step_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_step_fn$.bind(symbol_function($sym16$GT_SEARCHED_), thread);
                                {
                                    SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
                                    if (pcase_var.eql($SUPERIOR)) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == com.cyc.cycjava.cycl.gt_utilities.gt_modeP($INFERIOR)) {
                                                Errors.error($str_alt20$invalid_gt_mode___a, $INFERIOR);
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_2 = gt_vars.$gt_mode$.currentBinding(thread);
                                            try {
                                                gt_vars.$gt_mode$.bind($INFERIOR, thread);
                                                SubLTrampolineFile.checkType($sym21$GT_EACH_LINK_NODE_, FUNCTION_SPEC_P);
                                                {
                                                    SubLObject _prev_bind_0_3 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                    try {
                                                        gt_vars.$gt_base_fn$.bind($sym21$GT_EACH_LINK_NODE_, thread);
                                                        gt_search.gt_map_links(node, UNPROVIDED);
                                                    } finally {
                                                        gt_vars.$gt_base_fn$.rebind(_prev_bind_0_3, thread);
                                                    }
                                                }
                                            } finally {
                                                gt_vars.$gt_mode$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    } else {
                                        if (pcase_var.eql($INFERIOR)) {
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == com.cyc.cycjava.cycl.gt_utilities.gt_modeP($SUPERIOR)) {
                                                    Errors.error($str_alt20$invalid_gt_mode___a, $SUPERIOR);
                                                }
                                            }
                                            {
                                                SubLObject _prev_bind_0_4 = gt_vars.$gt_mode$.currentBinding(thread);
                                                try {
                                                    gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                                                    SubLTrampolineFile.checkType($sym21$GT_EACH_LINK_NODE_, FUNCTION_SPEC_P);
                                                    {
                                                        SubLObject _prev_bind_0_5 = gt_vars.$gt_base_fn$.currentBinding(thread);
                                                        try {
                                                            gt_vars.$gt_base_fn$.bind($sym21$GT_EACH_LINK_NODE_, thread);
                                                            gt_search.gt_map_links(node, UNPROVIDED);
                                                        } finally {
                                                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                } finally {
                                                    gt_vars.$gt_mode$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                        } else {
                                            com.cyc.cycjava.cycl.gt_utilities.gt_error(FIVE_INTEGER, $str_alt22$illegal_value_of__gt_mode_, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    }
                                }
                            } finally {
                                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        result = gt_vars.$gt_result$.getDynamicValue(thread);
                    } finally {
                        gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "has each search predecessor of NODE been searched?")
    public static SubLObject gt_all_predecessors_searchedP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind(T, thread);
            if (((NIL != symbol_function($sym16$GT_SEARCHED_)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == function_spec_p(symbol_function($sym16$GT_SEARCHED_)))) {
                throw new AssertionError(symbol_function($sym16$GT_SEARCHED_));
            }
            final SubLObject _prev_bind_0_$1 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(symbol_function($sym16$GT_SEARCHED_), thread);
                final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
                if (pcase_var.eql($SUPERIOR)) {
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_modeP($INFERIOR))) {
                        Errors.error($str20$invalid_gt_mode___a, $INFERIOR);
                    }
                    final SubLObject _prev_bind_0_$2 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind($INFERIOR, thread);
                        assert NIL != function_spec_p($sym21$GT_EACH_LINK_NODE_) : "! function_spec_p(gt_utilities.$sym21$GT_EACH_LINK_NODE_) " + ("Types.function_spec_p(gt_utilities.$sym21$GT_EACH_LINK_NODE_) " + "CommonSymbols.NIL != Types.function_spec_p(gt_utilities.$sym21$GT_EACH_LINK_NODE_) ") + $sym21$GT_EACH_LINK_NODE_;
                        final SubLObject _prev_bind_0_$3 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind($sym21$GT_EACH_LINK_NODE_, thread);
                            gt_search.gt_map_links(node, UNPROVIDED);
                        } finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$2, thread);
                    }
                } else
                    if (pcase_var.eql($INFERIOR)) {
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == gt_modeP($SUPERIOR))) {
                            Errors.error($str20$invalid_gt_mode___a, $SUPERIOR);
                        }
                        final SubLObject _prev_bind_0_$4 = gt_vars.$gt_mode$.currentBinding(thread);
                        try {
                            gt_vars.$gt_mode$.bind($SUPERIOR, thread);
                            assert NIL != function_spec_p($sym21$GT_EACH_LINK_NODE_) : "! function_spec_p(gt_utilities.$sym21$GT_EACH_LINK_NODE_) " + ("Types.function_spec_p(gt_utilities.$sym21$GT_EACH_LINK_NODE_) " + "CommonSymbols.NIL != Types.function_spec_p(gt_utilities.$sym21$GT_EACH_LINK_NODE_) ") + $sym21$GT_EACH_LINK_NODE_;
                            final SubLObject _prev_bind_0_$5 = gt_vars.$gt_base_fn$.currentBinding(thread);
                            try {
                                gt_vars.$gt_base_fn$.bind($sym21$GT_EACH_LINK_NODE_, thread);
                                gt_search.gt_map_links(node, UNPROVIDED);
                            } finally {
                                gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$5, thread);
                            }
                        } finally {
                            gt_vars.$gt_mode$.rebind(_prev_bind_0_$4, thread);
                        }
                    } else {
                        gt_error(FIVE_INTEGER, $str22$illegal_value_of__gt_mode_, gt_vars.$gt_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }

            } finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$1, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        } finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * has each search predecessor of NODE been searched?
     */


    public static final SubLObject gt_each_link_nodeP_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gt_vars.$gt_step_fn$.getDynamicValue(thread).isFunctionSpec()) {
                if (NIL == com.cyc.cycjava.cycl.gt_utilities.gt_step_fn_funcall(node)) {
                    gt_vars.$gt_result$.setDynamicValue(NIL, thread);
                    gt_search.gt_finished(UNPROVIDED);
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_each_link_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_step_fn$.getDynamicValue(thread).isFunctionSpec() && (NIL == gt_step_fn_funcall(node))) {
            gt_vars.$gt_result$.setDynamicValue(NIL, thread);
            gt_search.gt_finished(UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Implements the guts of GT-CHECK-TYPE
     */
    @LispMethod(comment = "Implements the guts of GT-CHECK-TYPE")
    public static final SubLObject gt_check_type_internal_alt(SubLObject v_object, SubLObject type, SubLObject level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(level)) {
                {
                    SubLObject type_fn = com.cyc.cycjava.cycl.gt_utilities.gt_type_fn(type);
                    if (type_fn.isFunctionSpec()) {
                        if (NIL == funcall(type_fn, v_object)) {
                            com.cyc.cycjava.cycl.gt_utilities.gt_cerror(level, $$$skip_gt_query, $str_alt24$_gt_type_violaton___a, com.cyc.cycjava.cycl.gt_utilities.gt_type_violation(type, v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            sublisp_throw($GT_ERROR, NIL);
                        }
                    }
                }
            } else {
                {
                    SubLObject pcase_var = type;
                    if (((pcase_var.eql($GT_INDEX) || pcase_var.eql($GT_GATHER)) || pcase_var.eql($TT_INDEX)) || pcase_var.eql($TT_GATHER)) {
                        if (NIL == com.cyc.cycjava.cycl.gt_utilities.gt_term_p(v_object)) {
                            sublisp_throw($GT_ERROR, NIL);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Implements the guts of GT-CHECK-TYPE")
    public static SubLObject gt_check_type_internal(final SubLObject v_object, final SubLObject type, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(level)) {
            final SubLObject type_fn = gt_type_fn(type);
            if (type_fn.isFunctionSpec() && (NIL == funcall(type_fn, v_object))) {
                gt_cerror(level, $$$skip_gt_query, $str24$_gt_type_violaton___a, gt_type_violation(type, v_object), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                sublisp_throw($GT_ERROR, NIL);
            }
        } else
            if ((((type.eql($GT_INDEX) || type.eql($GT_GATHER)) || type.eql($TT_INDEX)) || type.eql($TT_GATHER)) && (NIL == gt_term_p(v_object))) {
                sublisp_throw($GT_ERROR, NIL);
            }

        return NIL;
    }/**
     * Implements the guts of GT-CHECK-TYPE
     */


    public static final SubLObject gt_step_fn_funcall_alt(SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_step_fn$.getDynamicValue(thread);
                if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_MAP_LINKS)) {
                    return gt_search.gt_map_links(node, UNPROVIDED);
                } else {
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS)) {
                        return gt_search.gt_map_links_rebinding_candidate_mts(node, UNPROVIDED);
                    } else {
                        return gt_vars.$gt_step_fn$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) (funcall(gt_vars.$gt_step_fn$.getDynamicValue(thread), node))) : NIL;
                    }
                }
            }
        }
    }

    public static SubLObject gt_step_fn_funcall(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_step_fn$.getDynamicValue(thread);
        if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_MAP_LINKS)) {
            return gt_search.gt_map_links(node, UNPROVIDED);
        }
        if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_MAP_LINKS_REBINDING_CANDIDATE_MTS)) {
            return gt_search.gt_map_links_rebinding_candidate_mts(node, UNPROVIDED);
        }
        return gt_vars.$gt_step_fn$.getDynamicValue(thread).isFunctionSpec() ? funcall(gt_vars.$gt_step_fn$.getDynamicValue(thread), node) : NIL;
    }

    public static final SubLObject gt_compare_fn_funcall_alt(SubLObject node, SubLObject target) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = gt_vars.$gt_compare_fn$.getDynamicValue(thread);
                if (pcase_var.eql(QUOTE) || pcase_var.eql(EQ)) {
                    return eq(node, target);
                } else {
                    return gt_vars.$gt_compare_fn$.getDynamicValue(thread).isFunctionSpec() ? ((SubLObject) (funcall(gt_vars.$gt_compare_fn$.getDynamicValue(thread), node, target))) : NIL;
                }
            }
        }
    }

    public static SubLObject gt_compare_fn_funcall(final SubLObject node, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_compare_fn$.getDynamicValue(thread);
        if (pcase_var.eql(QUOTE) || pcase_var.eql(EQ)) {
            return eq(node, target);
        }
        return gt_vars.$gt_compare_fn$.getDynamicValue(thread).isFunctionSpec() ? funcall(gt_vars.$gt_compare_fn$.getDynamicValue(thread), node, target) : NIL;
    }

    public static final SubLObject gt_gp_mapper_funcall_alt(SubLObject function, SubLObject node) {
        {
            SubLObject pcase_var = function;
            if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_GATHER_LINK_NODE)) {
                return gt_search.gt_gather_link_node(node);
            } else {
                if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_TEST_LINK_NODE)) {
                    return gt_search.gt_test_link_node(node);
                } else {
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY)) {
                        return gt_search.gt_gather_link_nodes_and_unify_mts_along_the_way(node);
                    } else {
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(GT_GATHER_ACCESS_JUST)) {
                            return gt_search.gt_gather_access_just(node);
                        } else {
                            return funcall(function, node);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject gt_gp_mapper_funcall(final SubLObject function, final SubLObject node) {
        if (function.eql(QUOTE) || function.eql(GT_GATHER_LINK_NODE)) {
            return gt_search.gt_gather_link_node(node);
        }
        if (function.eql(QUOTE) || function.eql(GT_TEST_LINK_NODE)) {
            return gt_search.gt_test_link_node(node);
        }
        if (function.eql(QUOTE) || function.eql(GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY)) {
            return gt_search.gt_gather_link_nodes_and_unify_mts_along_the_way(node);
        }
        if (function.eql(QUOTE) || function.eql(GT_GATHER_ACCESS_JUST)) {
            return gt_search.gt_gather_access_just(node);
        }
        return funcall(function, node);
    }

    public static final SubLObject gt_note_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject gt_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject gt_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, gt_vars.$gt_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, gt_vars.$gt_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject gt_cerror_alt(SubLObject level, SubLObject continue_str, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, gt_vars.$gt_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    public static SubLObject gt_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, gt_vars.$gt_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static final SubLObject gt_warn_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
                apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    public static SubLObject gt_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject declare_gt_utilities_file() {
        declareFunction("gt_term_p", "GT-TERM-P", 1, 0, false);
        declareFunction("gt_modeP", "GT-MODE?", 1, 0, false);
        declareFunction("gt_type_fn", "GT-TYPE-FN", 1, 0, false);
        declareFunction("gt_reflexiveP", "GT-REFLEXIVE?", 0, 0, false);
        declareFunction("gt_index_arg_okP", "GT-INDEX-ARG-OK?", 1, 0, false);
        declareFunction("gt_gather_arg_okP", "GT-GATHER-ARG-OK?", 1, 0, false);
        declareFunction("tt_index_arg_okP", "TT-INDEX-ARG-OK?", 1, 0, false);
        declareFunction("tt_gather_arg_okP", "TT-GATHER-ARG-OK?", 1, 0, false);
        declareFunction("gt_either_arg_okP", "GT-EITHER-ARG-OK?", 1, 0, false);
        declareFunction("gt_type_violation", "GT-TYPE-VIOLATION", 2, 0, false);
        declareFunction("gt_assertion_type_violation", "GT-ASSERTION-TYPE-VIOLATION", 2, 0, false);
        declareFunction("make_gt_search_space", "MAKE-GT-SEARCH-SPACE", 0, 1, false);
        declareFunction("gt_not_all_predecessors_searchedP", "GT-NOT-ALL-PREDECESSORS-SEARCHED?", 1, 0, false);
        declareFunction("gt_all_predecessors_searchedP", "GT-ALL-PREDECESSORS-SEARCHED?", 1, 0, false);
        declareFunction("gt_each_link_nodeP", "GT-EACH-LINK-NODE?", 1, 0, false);
        declareFunction("gt_check_type_internal", "GT-CHECK-TYPE-INTERNAL", 3, 0, false);
        declareFunction("gt_step_fn_funcall", "GT-STEP-FN-FUNCALL", 1, 0, false);
        declareFunction("gt_compare_fn_funcall", "GT-COMPARE-FN-FUNCALL", 2, 0, false);
        declareFunction("gt_gp_mapper_funcall", "GT-GP-MAPPER-FUNCALL", 2, 0, false);
        declareFunction("gt_note", "GT-NOTE", 2, 5, false);
        declareFunction("gt_error", "GT-ERROR", 2, 5, false);
        declareFunction("gt_cerror", "GT-CERROR", 3, 5, false);
        declareFunction("gt_warn", "GT-WARN", 2, 5, false);
        return NIL;
    }

    public static SubLObject init_gt_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_gt_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_gt_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_gt_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_gt_utilities_file();
    }

    static {
    }

    static private final SubLList $list_alt12 = list(makeSymbol("*GT-PRED*"), makeSymbol("*GT-INDEX-ARG*"), makeSymbol("*GT-GATHER-ARG*"));

    static private final SubLString $str_alt20$invalid_gt_mode___a = makeString("invalid gt mode: ~a");

    static private final SubLString $str_alt22$illegal_value_of__gt_mode_ = makeString("illegal value of *gt-mode*");

    static private final SubLString $str_alt24$_gt_type_violaton___a = makeString("(gt type violaton) ~a");
}

/**
 * Total time: 253 ms synthetic
 */
