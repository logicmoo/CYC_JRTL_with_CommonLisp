package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_tva_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gt_utilities";
    public static final String myFingerPrint = "0015213ac1be0d11435befd5f06bbfd4416edfb8463191fae2cc3fd99b852137";
    private static final SubLSymbol $kw0$GT_INDEX;
    private static final SubLSymbol $sym1$GT_INDEX_ARG_OK_;
    private static final SubLSymbol $kw2$GT_GATHER;
    private static final SubLSymbol $sym3$GT_GATHER_ARG_OK_;
    private static final SubLSymbol $kw4$GT_EITHER;
    private static final SubLSymbol $sym5$GT_EITHER_ARG_OK_;
    private static final SubLSymbol $kw6$TT_INDEX;
    private static final SubLSymbol $sym7$TT_INDEX_ARG_OK_;
    private static final SubLSymbol $kw8$TT_GATHER;
    private static final SubLSymbol $sym9$TT_GATHER_ARG_OK_;
    private static final SubLSymbol $kw10$ASSERTION;
    private static final SubLSymbol $kw11$ACCESSORS;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$CCONCATENATE;
    private static final SubLSymbol $kw14$TT_EITHER;
    private static final SubLInteger $int15$128;
    private static final SubLSymbol $sym16$GT_SEARCHED_;
    private static final SubLSymbol $sym17$FUNCTION_SPEC_P;
    private static final SubLSymbol $kw18$SUPERIOR;
    private static final SubLSymbol $kw19$INFERIOR;
    private static final SubLString $str20$invalid_gt_mode___a;
    private static final SubLSymbol $sym21$GT_EACH_LINK_NODE_;
    private static final SubLString $str22$illegal_value_of__gt_mode_;
    private static final SubLString $str23$skip_gt_query;
    private static final SubLString $str24$_gt_type_violaton___a;
    private static final SubLSymbol $kw25$GT_ERROR;
    private static final SubLSymbol $sym26$QUOTE;
    private static final SubLSymbol $sym27$GT_MAP_LINKS;
    private static final SubLSymbol $sym28$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS;
    private static final SubLSymbol $sym29$GT_GATHER_LINK_NODE;
    private static final SubLSymbol $sym30$GT_TEST_LINK_NODE;
    private static final SubLSymbol $sym31$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY;
    private static final SubLSymbol $sym32$GT_GATHER_ACCESS_JUST;
    private static final SubLString $str33$continue_anyway;
    private static final SubLSymbol $sym34$WARN;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 380L)
    public static SubLObject gt_term_p(final SubLObject obj) {
        if (gt_utilities.NIL != cycl_utilities.reified_term_p(obj)) {
            return (SubLObject)gt_utilities.T;
        }
        if (gt_utilities.NIL != sksi_tva_utilities.sksi_transitivity_possibleP()) {
            return sksi_infrastructure_utilities.sksi_external_term_p(obj);
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 707L)
    public static SubLObject gt_modeP(final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(mode, gt_vars.$gt_modes$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 825L)
    public static SubLObject gt_type_fn(final SubLObject type) {
        if (type.eql((SubLObject)gt_utilities.$kw0$GT_INDEX)) {
            return (SubLObject)gt_utilities.$sym1$GT_INDEX_ARG_OK_;
        }
        if (type.eql((SubLObject)gt_utilities.$kw2$GT_GATHER)) {
            return (SubLObject)gt_utilities.$sym3$GT_GATHER_ARG_OK_;
        }
        if (type.eql((SubLObject)gt_utilities.$kw4$GT_EITHER)) {
            return (SubLObject)gt_utilities.$sym5$GT_EITHER_ARG_OK_;
        }
        if (type.eql((SubLObject)gt_utilities.$kw6$TT_INDEX)) {
            return (SubLObject)gt_utilities.$sym7$TT_INDEX_ARG_OK_;
        }
        if (type.eql((SubLObject)gt_utilities.$kw8$TT_GATHER)) {
            return (SubLObject)gt_utilities.$sym9$TT_GATHER_ARG_OK_;
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 1076L)
    public static SubLObject gt_reflexiveP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$kw10$ASSERTION)) {
            return kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread));
        }
        if (pcase_var.eql((SubLObject)gt_utilities.$kw11$ACCESSORS)) {
            SubLObject not_reflexiveP = (SubLObject)gt_utilities.NIL;
            if (gt_utilities.NIL == not_reflexiveP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = (SubLObject)gt_utilities.NIL;
                accessor = csome_list_var.first();
                while (gt_utilities.NIL == not_reflexiveP && gt_utilities.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_index_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_gather_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (gt_utilities.NIL == current) {
                            not_reflexiveP = (SubLObject)SubLObjectFactory.makeBoolean(gt_utilities.NIL == kb_accessors.reflexive_predicateP(gt_vars.$gt_pred$.getDynamicValue(thread)));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_utilities.$list12);
                        }
                    }
                    finally {
                        gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                        gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                        gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    accessor = csome_list_var.first();
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(gt_utilities.NIL == not_reflexiveP);
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 1509L)
    public static SubLObject gt_index_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$kw10$ASSERTION)) {
            return arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)gt_utilities.$kw11$ACCESSORS)) {
            SubLObject okP = (SubLObject)gt_utilities.NIL;
            if (gt_utilities.NIL == okP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = (SubLObject)gt_utilities.NIL;
                accessor = csome_list_var.first();
                while (gt_utilities.NIL == okP && gt_utilities.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_index_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_gather_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (gt_utilities.NIL == current) {
                            okP = arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_utilities.$list12);
                        }
                    }
                    finally {
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
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 1905L)
    public static SubLObject gt_gather_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$kw10$ASSERTION)) {
            return arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)gt_utilities.$kw11$ACCESSORS)) {
            SubLObject okP = (SubLObject)gt_utilities.NIL;
            if (gt_utilities.NIL == okP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = (SubLObject)gt_utilities.NIL;
                accessor = csome_list_var.first();
                while (gt_utilities.NIL == okP && gt_utilities.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_index_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_gather_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (gt_utilities.NIL == current) {
                            okP = arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_utilities.$list12);
                        }
                    }
                    finally {
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
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 2303L)
    public static SubLObject tt_index_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arg_type.relation_arg_okP(gt_vars.$tt_pred$.getDynamicValue(thread), v_object, gt_vars.$tt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 2398L)
    public static SubLObject tt_gather_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return arg_type.relation_arg_okP(gt_vars.$tt_pred$.getDynamicValue(thread), v_object, gt_vars.$tt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 2495L)
    public static SubLObject gt_either_arg_okP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$kw10$ASSERTION)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(gt_utilities.NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED) || gt_utilities.NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED));
        }
        if (pcase_var.eql((SubLObject)gt_utilities.$kw11$ACCESSORS)) {
            SubLObject okP = (SubLObject)gt_utilities.NIL;
            if (gt_utilities.NIL == okP) {
                SubLObject csome_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
                SubLObject accessor = (SubLObject)gt_utilities.NIL;
                accessor = csome_list_var.first();
                while (gt_utilities.NIL == okP && gt_utilities.NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = accessor;
                    final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                    try {
                        gt_vars.$gt_pred$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_index_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        gt_vars.$gt_gather_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                        gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                        current = current.rest();
                        if (gt_utilities.NIL == current) {
                            okP = (SubLObject)SubLObjectFactory.makeBoolean(gt_utilities.NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED) || gt_utilities.NIL != arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), v_object, gt_vars.$gt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED));
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_utilities.$list12);
                        }
                    }
                    finally {
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
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 3024L)
    public static SubLObject gt_type_violation(final SubLObject type, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_link_type$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$kw10$ASSERTION)) {
            return gt_assertion_type_violation(type, node);
        }
        if (pcase_var.eql((SubLObject)gt_utilities.$kw11$ACCESSORS)) {
            SubLObject violations = (SubLObject)gt_utilities.NIL;
            SubLObject cdolist_list_var = gt_vars.$gt_accessors$.getDynamicValue(thread);
            SubLObject accessor = (SubLObject)gt_utilities.NIL;
            accessor = cdolist_list_var.first();
            while (gt_utilities.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = accessor;
                final SubLObject _prev_bind_0 = gt_vars.$gt_pred$.currentBinding(thread);
                final SubLObject _prev_bind_2 = gt_vars.$gt_index_arg$.currentBinding(thread);
                final SubLObject _prev_bind_3 = gt_vars.$gt_gather_arg$.currentBinding(thread);
                try {
                    gt_vars.$gt_pred$.bind((SubLObject)gt_utilities.NIL, thread);
                    gt_vars.$gt_index_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                    gt_vars.$gt_gather_arg$.bind((SubLObject)gt_utilities.NIL, thread);
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                    gt_vars.$gt_pred$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                    gt_vars.$gt_index_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_utilities.$list12);
                    gt_vars.$gt_gather_arg$.setDynamicValue(current.first(), thread);
                    current = current.rest();
                    if (gt_utilities.NIL == current) {
                        if (type == gt_utilities.$kw0$GT_INDEX && gt_utilities.NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED)) {
                            violations = (SubLObject)ConsesLow.cons(gt_assertion_type_violation(type, node), violations);
                        }
                        else if (type == gt_utilities.$kw2$GT_GATHER && gt_utilities.NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED)) {
                            violations = (SubLObject)ConsesLow.cons(gt_assertion_type_violation(type, node), violations);
                        }
                        else if (type == gt_utilities.$kw4$GT_EITHER && gt_utilities.NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_index_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED) && gt_utilities.NIL == arg_type.relation_arg_okP(gt_vars.$gt_pred$.getDynamicValue(thread), node, gt_vars.$gt_gather_arg$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED)) {
                            violations = (SubLObject)ConsesLow.cons(gt_assertion_type_violation(type, node), violations);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_utilities.$list12);
                    }
                }
                finally {
                    gt_vars.$gt_gather_arg$.rebind(_prev_bind_3, thread);
                    gt_vars.$gt_index_arg$.rebind(_prev_bind_2, thread);
                    gt_vars.$gt_pred$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                accessor = cdolist_list_var.first();
            }
            return Functions.apply(Symbols.symbol_function((SubLObject)gt_utilities.$sym13$CCONCATENATE), Sequences.nreverse(violations));
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 3914L)
    public static SubLObject gt_assertion_type_violation(final SubLObject type, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (type.eql((SubLObject)gt_utilities.$kw0$GT_INDEX)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (type.eql((SubLObject)gt_utilities.$kw2$GT_GATHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (type.eql((SubLObject)gt_utilities.$kw4$GT_EITHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (type.eql((SubLObject)gt_utilities.$kw6$TT_INDEX)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (type.eql((SubLObject)gt_utilities.$kw8$TT_GATHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (type.eql((SubLObject)gt_utilities.$kw14$TT_EITHER)) {
            return wff.explain_wff_violation(at_vars.$current_at_violation$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED);
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 4415L)
    public static SubLObject make_gt_search_space(SubLObject size) {
        if (size == gt_utilities.UNPROVIDED) {
            size = (SubLObject)gt_utilities.$int15$128;
        }
        return Hashtables.make_hash_table(size, (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 4579L)
    public static SubLObject gt_not_all_predecessors_searchedP(final SubLObject node) {
        return (SubLObject)SubLObjectFactory.makeBoolean(gt_utilities.NIL == gt_all_predecessors_searchedP(node));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 4742L)
    public static SubLObject gt_all_predecessors_searchedP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)gt_utilities.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$gt_result$.currentBinding(thread);
        try {
            gt_vars.$gt_result$.bind((SubLObject)gt_utilities.T, thread);
            if (gt_utilities.NIL != Symbols.symbol_function((SubLObject)gt_utilities.$sym16$GT_SEARCHED_) && !gt_utilities.assertionsDisabledInClass && gt_utilities.NIL == Types.function_spec_p(Symbols.symbol_function((SubLObject)gt_utilities.$sym16$GT_SEARCHED_))) {
                throw new AssertionError(Symbols.symbol_function((SubLObject)gt_utilities.$sym16$GT_SEARCHED_));
            }
            final SubLObject _prev_bind_0_$1 = gt_vars.$gt_step_fn$.currentBinding(thread);
            try {
                gt_vars.$gt_step_fn$.bind(Symbols.symbol_function((SubLObject)gt_utilities.$sym16$GT_SEARCHED_), thread);
                final SubLObject pcase_var = gt_vars.$gt_mode$.getDynamicValue(thread);
                if (pcase_var.eql((SubLObject)gt_utilities.$kw18$SUPERIOR)) {
                    if (gt_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_utilities.NIL == gt_modeP((SubLObject)gt_utilities.$kw19$INFERIOR)) {
                        Errors.error((SubLObject)gt_utilities.$str20$invalid_gt_mode___a, (SubLObject)gt_utilities.$kw19$INFERIOR);
                    }
                    final SubLObject _prev_bind_0_$2 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_utilities.$kw19$INFERIOR, thread);
                        assert gt_utilities.NIL != Types.function_spec_p((SubLObject)gt_utilities.$sym21$GT_EACH_LINK_NODE_) : gt_utilities.$sym21$GT_EACH_LINK_NODE_;
                        final SubLObject _prev_bind_0_$3 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind((SubLObject)gt_utilities.$sym21$GT_EACH_LINK_NODE_, thread);
                            gt_search.gt_map_links(node, (SubLObject)gt_utilities.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$2, thread);
                    }
                }
                else if (pcase_var.eql((SubLObject)gt_utilities.$kw19$INFERIOR)) {
                    if (gt_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && gt_utilities.NIL == gt_modeP((SubLObject)gt_utilities.$kw18$SUPERIOR)) {
                        Errors.error((SubLObject)gt_utilities.$str20$invalid_gt_mode___a, (SubLObject)gt_utilities.$kw18$SUPERIOR);
                    }
                    final SubLObject _prev_bind_0_$4 = gt_vars.$gt_mode$.currentBinding(thread);
                    try {
                        gt_vars.$gt_mode$.bind((SubLObject)gt_utilities.$kw18$SUPERIOR, thread);
                        assert gt_utilities.NIL != Types.function_spec_p((SubLObject)gt_utilities.$sym21$GT_EACH_LINK_NODE_) : gt_utilities.$sym21$GT_EACH_LINK_NODE_;
                        final SubLObject _prev_bind_0_$5 = gt_vars.$gt_base_fn$.currentBinding(thread);
                        try {
                            gt_vars.$gt_base_fn$.bind((SubLObject)gt_utilities.$sym21$GT_EACH_LINK_NODE_, thread);
                            gt_search.gt_map_links(node, (SubLObject)gt_utilities.UNPROVIDED);
                        }
                        finally {
                            gt_vars.$gt_base_fn$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    finally {
                        gt_vars.$gt_mode$.rebind(_prev_bind_0_$4, thread);
                    }
                }
                else {
                    gt_error((SubLObject)gt_utilities.FIVE_INTEGER, (SubLObject)gt_utilities.$str22$illegal_value_of__gt_mode_, gt_vars.$gt_mode$.getDynamicValue(thread), (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED);
                }
            }
            finally {
                gt_vars.$gt_step_fn$.rebind(_prev_bind_0_$1, thread);
            }
            result = gt_vars.$gt_result$.getDynamicValue(thread);
        }
        finally {
            gt_vars.$gt_result$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 5318L)
    public static SubLObject gt_each_link_nodeP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_step_fn$.getDynamicValue(thread).isFunctionSpec() && gt_utilities.NIL == gt_step_fn_funcall(node)) {
            gt_vars.$gt_result$.setDynamicValue((SubLObject)gt_utilities.NIL, thread);
            gt_search.gt_finished((SubLObject)gt_utilities.UNPROVIDED);
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 5497L)
    public static SubLObject gt_check_type_internal(final SubLObject v_object, final SubLObject type, final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_test_level$.getDynamicValue(thread).numGE(level)) {
            final SubLObject type_fn = gt_type_fn(type);
            if (type_fn.isFunctionSpec() && gt_utilities.NIL == Functions.funcall(type_fn, v_object)) {
                gt_cerror(level, (SubLObject)gt_utilities.$str23$skip_gt_query, (SubLObject)gt_utilities.$str24$_gt_type_violaton___a, gt_type_violation(type, v_object), (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED, (SubLObject)gt_utilities.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)gt_utilities.$kw25$GT_ERROR, (SubLObject)gt_utilities.NIL);
            }
        }
        else if ((type.eql((SubLObject)gt_utilities.$kw0$GT_INDEX) || type.eql((SubLObject)gt_utilities.$kw2$GT_GATHER) || type.eql((SubLObject)gt_utilities.$kw6$TT_INDEX) || type.eql((SubLObject)gt_utilities.$kw8$TT_GATHER)) && gt_utilities.NIL == gt_term_p(v_object)) {
            Dynamic.sublisp_throw((SubLObject)gt_utilities.$kw25$GT_ERROR, (SubLObject)gt_utilities.NIL);
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 6376L)
    public static SubLObject gt_step_fn_funcall(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_step_fn$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$sym26$QUOTE) || pcase_var.eql((SubLObject)gt_utilities.$sym27$GT_MAP_LINKS)) {
            return gt_search.gt_map_links(node, (SubLObject)gt_utilities.UNPROVIDED);
        }
        if (pcase_var.eql((SubLObject)gt_utilities.$sym26$QUOTE) || pcase_var.eql((SubLObject)gt_utilities.$sym28$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS)) {
            return gt_search.gt_map_links_rebinding_candidate_mts(node, (SubLObject)gt_utilities.UNPROVIDED);
        }
        return (SubLObject)(gt_vars.$gt_step_fn$.getDynamicValue(thread).isFunctionSpec() ? Functions.funcall(gt_vars.$gt_step_fn$.getDynamicValue(thread), node) : gt_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 6764L)
    public static SubLObject gt_compare_fn_funcall(final SubLObject node, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = gt_vars.$gt_compare_fn$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)gt_utilities.$sym26$QUOTE) || pcase_var.eql((SubLObject)gt_utilities.EQ)) {
            return Equality.eq(node, target);
        }
        return (SubLObject)(gt_vars.$gt_compare_fn$.getDynamicValue(thread).isFunctionSpec() ? Functions.funcall(gt_vars.$gt_compare_fn$.getDynamicValue(thread), node, target) : gt_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 6996L)
    public static SubLObject gt_gp_mapper_funcall(final SubLObject function, final SubLObject node) {
        if (function.eql((SubLObject)gt_utilities.$sym26$QUOTE) || function.eql((SubLObject)gt_utilities.$sym29$GT_GATHER_LINK_NODE)) {
            return gt_search.gt_gather_link_node(node);
        }
        if (function.eql((SubLObject)gt_utilities.$sym26$QUOTE) || function.eql((SubLObject)gt_utilities.$sym30$GT_TEST_LINK_NODE)) {
            return gt_search.gt_test_link_node(node);
        }
        if (function.eql((SubLObject)gt_utilities.$sym26$QUOTE) || function.eql((SubLObject)gt_utilities.$sym31$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY)) {
            return gt_search.gt_gather_link_nodes_and_unify_mts_along_the_way(node);
        }
        if (function.eql((SubLObject)gt_utilities.$sym26$QUOTE) || function.eql((SubLObject)gt_utilities.$sym32$GT_GATHER_ACCESS_JUST)) {
            return gt_search.gt_gather_access_just(node);
        }
        return Functions.funcall(function, node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 7441L)
    public static SubLObject gt_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == gt_utilities.UNPROVIDED) {
            arg1 = (SubLObject)gt_utilities.NIL;
        }
        if (arg2 == gt_utilities.UNPROVIDED) {
            arg2 = (SubLObject)gt_utilities.NIL;
        }
        if (arg3 == gt_utilities.UNPROVIDED) {
            arg3 = (SubLObject)gt_utilities.NIL;
        }
        if (arg4 == gt_utilities.UNPROVIDED) {
            arg4 = (SubLObject)gt_utilities.NIL;
        }
        if (arg5 == gt_utilities.UNPROVIDED) {
            arg5 = (SubLObject)gt_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            PrintLow.format((SubLObject)gt_utilities.T, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)gt_utilities.NIL;
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 7685L)
    public static SubLObject gt_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == gt_utilities.UNPROVIDED) {
            arg1 = (SubLObject)gt_utilities.NIL;
        }
        if (arg2 == gt_utilities.UNPROVIDED) {
            arg2 = (SubLObject)gt_utilities.NIL;
        }
        if (arg3 == gt_utilities.UNPROVIDED) {
            arg3 = (SubLObject)gt_utilities.NIL;
        }
        if (arg4 == gt_utilities.UNPROVIDED) {
            arg4 = (SubLObject)gt_utilities.NIL;
        }
        if (arg5 == gt_utilities.UNPROVIDED) {
            arg5 = (SubLObject)gt_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)gt_utilities.$str33$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)gt_utilities.TWO_INTEGER, gt_vars.$gt_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 7960L)
    public static SubLObject gt_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == gt_utilities.UNPROVIDED) {
            arg1 = (SubLObject)gt_utilities.NIL;
        }
        if (arg2 == gt_utilities.UNPROVIDED) {
            arg2 = (SubLObject)gt_utilities.NIL;
        }
        if (arg3 == gt_utilities.UNPROVIDED) {
            arg3 = (SubLObject)gt_utilities.NIL;
        }
        if (arg4 == gt_utilities.UNPROVIDED) {
            arg4 = (SubLObject)gt_utilities.NIL;
        }
        if (arg5 == gt_utilities.UNPROVIDED) {
            arg5 = (SubLObject)gt_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)gt_utilities.TWO_INTEGER, gt_vars.$gt_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-utilities.lisp", position = 8244L)
    public static SubLObject gt_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == gt_utilities.UNPROVIDED) {
            arg1 = (SubLObject)gt_utilities.NIL;
        }
        if (arg2 == gt_utilities.UNPROVIDED) {
            arg2 = (SubLObject)gt_utilities.NIL;
        }
        if (arg3 == gt_utilities.UNPROVIDED) {
            arg3 = (SubLObject)gt_utilities.NIL;
        }
        if (arg4 == gt_utilities.UNPROVIDED) {
            arg4 = (SubLObject)gt_utilities.NIL;
        }
        if (arg5 == gt_utilities.UNPROVIDED) {
            arg5 = (SubLObject)gt_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (gt_vars.$gt_trace_level$.getDynamicValue(thread).numGE(level)) {
            Functions.apply((SubLObject)gt_utilities.$sym34$WARN, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)gt_utilities.NIL;
        }
        return (SubLObject)gt_utilities.NIL;
    }
    
    public static SubLObject declare_gt_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_term_p", "GT-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_modeP", "GT-MODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_type_fn", "GT-TYPE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_reflexiveP", "GT-REFLEXIVE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_index_arg_okP", "GT-INDEX-ARG-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_gather_arg_okP", "GT-GATHER-ARG-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "tt_index_arg_okP", "TT-INDEX-ARG-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "tt_gather_arg_okP", "TT-GATHER-ARG-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_either_arg_okP", "GT-EITHER-ARG-OK?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_type_violation", "GT-TYPE-VIOLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_assertion_type_violation", "GT-ASSERTION-TYPE-VIOLATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "make_gt_search_space", "MAKE-GT-SEARCH-SPACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_not_all_predecessors_searchedP", "GT-NOT-ALL-PREDECESSORS-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_all_predecessors_searchedP", "GT-ALL-PREDECESSORS-SEARCHED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_each_link_nodeP", "GT-EACH-LINK-NODE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_check_type_internal", "GT-CHECK-TYPE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_step_fn_funcall", "GT-STEP-FN-FUNCALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_compare_fn_funcall", "GT-COMPARE-FN-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_gp_mapper_funcall", "GT-GP-MAPPER-FUNCALL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_note", "GT-NOTE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_error", "GT-ERROR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_cerror", "GT-CERROR", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.gt_utilities", "gt_warn", "GT-WARN", 2, 5, false);
        return (SubLObject)gt_utilities.NIL;
    }
    
    public static SubLObject init_gt_utilities_file() {
        return (SubLObject)gt_utilities.NIL;
    }
    
    public static SubLObject setup_gt_utilities_file() {
        return (SubLObject)gt_utilities.NIL;
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
        me = (SubLFile)new gt_utilities();
        $kw0$GT_INDEX = SubLObjectFactory.makeKeyword("GT-INDEX");
        $sym1$GT_INDEX_ARG_OK_ = SubLObjectFactory.makeSymbol("GT-INDEX-ARG-OK?");
        $kw2$GT_GATHER = SubLObjectFactory.makeKeyword("GT-GATHER");
        $sym3$GT_GATHER_ARG_OK_ = SubLObjectFactory.makeSymbol("GT-GATHER-ARG-OK?");
        $kw4$GT_EITHER = SubLObjectFactory.makeKeyword("GT-EITHER");
        $sym5$GT_EITHER_ARG_OK_ = SubLObjectFactory.makeSymbol("GT-EITHER-ARG-OK?");
        $kw6$TT_INDEX = SubLObjectFactory.makeKeyword("TT-INDEX");
        $sym7$TT_INDEX_ARG_OK_ = SubLObjectFactory.makeSymbol("TT-INDEX-ARG-OK?");
        $kw8$TT_GATHER = SubLObjectFactory.makeKeyword("TT-GATHER");
        $sym9$TT_GATHER_ARG_OK_ = SubLObjectFactory.makeSymbol("TT-GATHER-ARG-OK?");
        $kw10$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw11$ACCESSORS = SubLObjectFactory.makeKeyword("ACCESSORS");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-PRED*"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-INDEX-ARG*"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-GATHER-ARG*"));
        $sym13$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $kw14$TT_EITHER = SubLObjectFactory.makeKeyword("TT-EITHER");
        $int15$128 = SubLObjectFactory.makeInteger(128);
        $sym16$GT_SEARCHED_ = SubLObjectFactory.makeSymbol("GT-SEARCHED?");
        $sym17$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $kw18$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $kw19$INFERIOR = SubLObjectFactory.makeKeyword("INFERIOR");
        $str20$invalid_gt_mode___a = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $sym21$GT_EACH_LINK_NODE_ = SubLObjectFactory.makeSymbol("GT-EACH-LINK-NODE?");
        $str22$illegal_value_of__gt_mode_ = SubLObjectFactory.makeString("illegal value of *gt-mode*");
        $str23$skip_gt_query = SubLObjectFactory.makeString("skip gt query");
        $str24$_gt_type_violaton___a = SubLObjectFactory.makeString("(gt type violaton) ~a");
        $kw25$GT_ERROR = SubLObjectFactory.makeKeyword("GT-ERROR");
        $sym26$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym27$GT_MAP_LINKS = SubLObjectFactory.makeSymbol("GT-MAP-LINKS");
        $sym28$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS = SubLObjectFactory.makeSymbol("GT-MAP-LINKS-REBINDING-CANDIDATE-MTS");
        $sym29$GT_GATHER_LINK_NODE = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODE");
        $sym30$GT_TEST_LINK_NODE = SubLObjectFactory.makeSymbol("GT-TEST-LINK-NODE");
        $sym31$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY = SubLObjectFactory.makeSymbol("GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY");
        $sym32$GT_GATHER_ACCESS_JUST = SubLObjectFactory.makeSymbol("GT-GATHER-ACCESS-JUST");
        $str33$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $sym34$WARN = SubLObjectFactory.makeSymbol("WARN");
    }
}

/*

	Total time: 253 ms
	 synthetic 
*/