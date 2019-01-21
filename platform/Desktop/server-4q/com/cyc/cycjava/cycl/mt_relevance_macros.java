package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_relevance_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.mt_relevance_macros";
    public static final String myFingerPrint = "94aed547e114a738d6c16f7423e3ef87df9d555b0fb83b8edd7cb05b182ecc7d";
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 812L)
    public static SubLSymbol $relevant_mt_function$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1423L)
    public static SubLSymbol $mt$;
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1749L)
    public static SubLSymbol $relevant_mts$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$_RELEVANT_MT_FUNCTION_;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$_MT_;
    private static final SubLSymbol $sym6$IN_MT_LIST;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$_RELEVANT_MTS_;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$HLMT_EQUAL;
    private static final SubLSymbol $sym12$SPECIAL_CORE_LOOP_MT_P;
    private static final SubLSymbol $sym13$CORE_MICROTHEORY_P;
    private static final SubLObject $const14$TimePoint;
    private static final SubLSymbol $sym15$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym16$RELEVANT_MT_IS_ANY_MT;
    private static final SubLSymbol $sym17$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLSymbol $sym18$RELEVANT_MT_IS_EQ;
    private static final SubLSymbol $sym19$RELEVANT_MT_IS_IN_LIST;
    private static final SubLSymbol $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
    private static final SubLSymbol $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
    private static final SubLSymbol $kw22$ALL;
    private static final SubLSymbol $kw23$UNABLE_TO_DETERMINE;
    private static final SubLSymbol $sym24$RELEVANT_MT_IS_SPEC_MT;
    private static final SubLSymbol $sym25$WITH_MT_FUNCTION;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$IN_MT;
    private static final SubLSymbol $sym28$WITH_GENL_MTS;
    private static final SubLString $str29$MT_and_all_its_genl_mts_are_relev;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$CANONICALIZE_HLMT;
    private static final SubLSymbol $sym32$WITH_MT;
    private static final SubLList $list33;
    private static final SubLObject $const34$EverythingPSC;
    private static final SubLSymbol $sym35$WITH_ALL_MTS;
    private static final SubLList $list36;
    private static final SubLString $str37$All_mts_are_relevant_within_BODY_;
    private static final SubLList $list38;
    private static final SubLObject $const39$InferencePSC;
    private static final SubLSymbol $sym40$WITH_ANY_MT;
    private static final SubLString $str41$Any_mt_can_be_used_for_relevance_;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$WITH_JUST_MT;
    private static final SubLString $str44$Only_MT_is_relevant_within_BODY__;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$WITH_MT_LIST;
    private static final SubLString $str47$Each_mt_in_the_list_MT_LIST_is_re;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$WITH_MT_LIST_AND_GENL_MTS;
    private static final SubLSymbol $sym51$MT_UNION_MTS;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$PROGN;
    private static final SubLSymbol $sym55$MT_VAR;
    private static final SubLSymbol $sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION;
    private static final SubLSymbol $sym57$POSSIBLY_IN_MT_DETERMINE_MT;
    private static final SubLSymbol $sym58$POSSIBLY_IN_MT;
    private static final SubLSymbol $sym59$MT_VAR;
    private static final SubLSymbol $sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION;
    private static final SubLSymbol $sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT;
    private static final SubLSymbol $sym62$POSSIBLY_WITH_JUST_MT;
    private static final SubLSymbol $sym63$HLMT_P;
    private static final SubLSymbol $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL;
    private static final SubLSymbol $sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE;
    private static final SubLSymbol $sym66$WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLString $str67$BODY_evaluated_with_the_same_rele;
    private static final SubLSymbol $sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC;
    private static final SubLString $str69$No_microtheory_was_specified_;
    private static final SubLSymbol $sym70$WITH_INFERENCE_MT_RELEVANCE_EL;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$MT_VAR;
    private static final SubLSymbol $sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT;
    private static final SubLSymbol $sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION;
    private static final SubLSymbol $sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST;
    private static final SubLSymbol $sym76$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE;
    private static final SubLSymbol $sym77$POSSIBLY_HLMT_P;
    private static final SubLSymbol $sym78$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$PSC_INFERENCE;
    private static final SubLSymbol $sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_;
    private static final SubLSymbol $sym84$ALL_MTS_INFERENCE;
    private static final SubLSymbol $sym85$WITH_MT_UNION_RELEVANCE_;
    private static final SubLSymbol $sym86$MT_UNION_INFERENCE;
    private static final SubLSymbol $sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_;
    private static final SubLSymbol $sym88$ANYTIME_PSC_INFERENCE;
    private static final SubLObject $const89$MtUnionFn;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$PCOND;
    private static final SubLSymbol $sym92$MT_FUNCTION_EQ;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLSymbol $sym95$MT_UNION_NAUT_P;
    private static final SubLSymbol $sym96$WITH_GENL_MTS_OF_UNION;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$DO_ALL_FORT_INSTANCES;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$MAP_MTS;
    private static final SubLString $str101$Iterate_over_all_microtheories__b;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 865L)
    public static SubLObject with_mt_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list1);
        function = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym3$_RELEVANT_MT_FUNCTION_, function)), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1059L)
    public static SubLObject mt_function_eq(final SubLObject mt_function, final SubLObject symbol) {
        return Equality.eq(mt_function, symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1230L)
    public static SubLObject relevant_mt_function_eq(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_function_eq(mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread), symbol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1623L)
    public static SubLObject in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym5$_MT_, mt)), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 1795L)
    public static SubLObject in_mt_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_list = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list8);
        mt_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym9$_RELEVANT_MTS_, mt_list)), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2062L)
    public static SubLObject current_mt_relevance_mt_context() {
        return mt_vars.$mt_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2239L)
    public static SubLObject current_mt_relevance_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_relevance_macros.$mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2325L)
    public static SubLObject current_mt_relevance_mt_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_relevance_macros.$relevant_mts$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2400L)
    public static SubLObject current_mt_relevance_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2789L)
    public static SubLObject relevant_mt_is_everything(final SubLObject mt) {
        return (SubLObject)mt_relevance_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 2862L)
    public static SubLObject relevant_mt_is_any_mt(final SubLObject mt) {
        return (SubLObject)mt_relevance_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 3154L)
    public static SubLObject relevant_mt_is_eq(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hlmt.hlmt_equal(mt_relevance_macros.$mt$.getDynamicValue(thread), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 3532L)
    public static SubLObject relevant_mt_is_in_list(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(mt, mt_relevance_macros.$relevant_mts$.getDynamicValue(thread), (SubLObject)mt_relevance_macros.$sym11$HLMT_EQUAL, (SubLObject)mt_relevance_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 3626L)
    public static SubLObject relevant_mt_is_genl_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL != hlmt.hlmt_equal(mt, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)mt_relevance_macros.T;
        }
        final SubLObject spec_coreP = mt_vars.core_microtheory_p(mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
        if (mt_relevance_macros.NIL != spec_coreP && mt_relevance_macros.NIL != genl_coreP) {
            return mt_vars.core_genl_mtP(mt, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        if (mt_relevance_macros.NIL != genl_coreP) {
            return (SubLObject)mt_relevance_macros.T;
        }
        if (mt_relevance_macros.NIL != spec_coreP) {
            return (SubLObject)mt_relevance_macros.NIL;
        }
        return mt_relevance_cache.basemtP(mt_relevance_macros.$mt$.getDynamicValue(thread), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 4276L)
    public static SubLObject relevant_mt_is_spec_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL != hlmt.hlmt_equal(mt, mt_relevance_macros.$mt$.getDynamicValue(thread))) {
            return (SubLObject)mt_relevance_macros.T;
        }
        final SubLObject spec_coreP = mt_vars.core_microtheory_p(mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject genl_coreP = mt_vars.core_microtheory_p(mt);
        if (mt_relevance_macros.NIL != spec_coreP && mt_relevance_macros.NIL != genl_coreP) {
            if (mt_relevance_macros.NIL != mt_vars.special_core_loop_mt_p(mt) && mt_relevance_macros.NIL != mt_vars.special_core_loop_mt_p(mt_relevance_macros.$mt$.getDynamicValue(thread))) {
                return (SubLObject)mt_relevance_macros.T;
            }
            return mt_vars.core_microtheory_L(mt, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        else {
            if (mt_relevance_macros.NIL != spec_coreP) {
                return (SubLObject)mt_relevance_macros.T;
            }
            if (mt_relevance_macros.NIL != genl_coreP) {
                return (SubLObject)mt_relevance_macros.NIL;
            }
            return mt_relevance_cache.basemtP(mt, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 5077L)
    public static SubLObject relevant_mt_is_genl_mt_of_list_member(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL != mt_vars.special_core_loop_mt_p(mt) && mt_relevance_macros.NIL != Sequences.find_if((SubLObject)mt_relevance_macros.$sym12$SPECIAL_CORE_LOOP_MT_P, mt_relevance_macros.$relevant_mts$.getDynamicValue(thread), (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED)) {
            return (SubLObject)mt_relevance_macros.T;
        }
        if (mt_relevance_macros.NIL != mt_vars.core_microtheory_p(mt)) {
            if (mt_relevance_macros.NIL != mt_relevance_macros.$relevant_mts$.getDynamicValue(thread) && mt_relevance_macros.NIL != list_utilities.find_if_not((SubLObject)mt_relevance_macros.$sym13$CORE_MICROTHEORY_P, mt_relevance_macros.$relevant_mts$.getDynamicValue(thread), (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED)) {
                return (SubLObject)mt_relevance_macros.T;
            }
            SubLObject cdolist_list_var = mt_relevance_macros.$relevant_mts$.getDynamicValue(thread);
            SubLObject relevant_mt = (SubLObject)mt_relevance_macros.NIL;
            relevant_mt = cdolist_list_var.first();
            while (mt_relevance_macros.NIL != cdolist_list_var) {
                if (mt_relevance_macros.NIL != mt_vars.core_microtheory_L(relevant_mt, mt)) {
                    return (SubLObject)mt_relevance_macros.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                relevant_mt = cdolist_list_var.first();
            }
        }
        SubLObject cdolist_list_var = mt_relevance_macros.$relevant_mts$.getDynamicValue(thread);
        SubLObject relevant_mt = (SubLObject)mt_relevance_macros.NIL;
        relevant_mt = cdolist_list_var.first();
        while (mt_relevance_macros.NIL != cdolist_list_var) {
            if (mt_relevance_macros.NIL != mt_relevance_cache.basemtP(relevant_mt, mt)) {
                return (SubLObject)mt_relevance_macros.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            relevant_mt = cdolist_list_var.first();
        }
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 5660L)
    public static SubLObject relevant_mt_is_genl_mt_with_any_time(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
        if (mt_relevance_macros.NIL == relevant_mt_is_genl_mt(monad_mt)) {
            return (SubLObject)mt_relevance_macros.NIL;
        }
        final SubLObject anytime = hlmt.hlmt_temporal_mt(mt_relevance_macros.$mt$.getDynamicValue(thread));
        if (mt_relevance_macros.NIL != hlmt.anytime_psc_p(anytime)) {
            return (SubLObject)mt_relevance_macros.T;
        }
        final SubLObject time_mt = hlmt.hlmt_temporal_mt(mt);
        if (mt_relevance_macros.NIL != time_mt) {
            final SubLObject base_time = hlmt.anytime_during_psc_fn_time_interval(anytime);
            final SubLObject base_mt = hlmt.new_time_dimension(base_time, mt_relevance_macros.$const14$TimePoint);
            return hlmt_relevance.temporal_mts_intersectP(time_mt, base_mt);
        }
        return (SubLObject)mt_relevance_macros.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 6214L)
    public static SubLObject relevant_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        if (mt_relevance_macros.NIL == function) {
            return relevant_mt_is_genl_mt(mt);
        }
        final SubLObject pcase_var = function;
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym15$RELEVANT_MT_IS_GENL_MT)) {
            return relevant_mt_is_genl_mt(mt);
        }
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym16$RELEVANT_MT_IS_ANY_MT)) {
            return relevant_mt_is_any_mt(mt);
        }
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym17$RELEVANT_MT_IS_EVERYTHING)) {
            return relevant_mt_is_everything(mt);
        }
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym18$RELEVANT_MT_IS_EQ)) {
            return relevant_mt_is_eq(mt);
        }
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym19$RELEVANT_MT_IS_IN_LIST)) {
            return relevant_mt_is_in_list(mt);
        }
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER)) {
            return relevant_mt_is_genl_mt_of_list_member(mt);
        }
        if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME)) {
            return relevant_mt_is_genl_mt_with_any_time(mt);
        }
        return Functions.funcall(function, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 7352L)
    public static SubLObject all_possibly_relevant_mts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (mt_relevance_macros.NIL == function) {
            if (mt_relevance_macros.NIL != mt) {
                return genl_mts.all_genl_mts(mt, (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED);
            }
            return (SubLObject)mt_relevance_macros.$kw22$ALL;
        }
        else {
            final SubLObject pcase_var = function;
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym15$RELEVANT_MT_IS_GENL_MT)) {
                return genl_mts.all_genl_mts(mt, (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED);
            }
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym16$RELEVANT_MT_IS_ANY_MT)) {
                return (SubLObject)mt_relevance_macros.$kw22$ALL;
            }
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym17$RELEVANT_MT_IS_EVERYTHING)) {
                return (SubLObject)mt_relevance_macros.$kw22$ALL;
            }
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym18$RELEVANT_MT_IS_EQ)) {
                return (SubLObject)ConsesLow.list(mt);
            }
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym19$RELEVANT_MT_IS_IN_LIST)) {
                return mt_relevance_macros.$relevant_mts$.getDynamicValue(thread);
            }
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER)) {
                return (SubLObject)mt_relevance_macros.$kw23$UNABLE_TO_DETERMINE;
            }
            if (pcase_var.eql((SubLObject)mt_relevance_macros.$sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME)) {
                return (SubLObject)mt_relevance_macros.$kw23$UNABLE_TO_DETERMINE;
            }
            return (SubLObject)mt_relevance_macros.$kw23$UNABLE_TO_DETERMINE;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 8564L)
    public static SubLObject relevant_assertionP(final SubLObject assertion) {
        if (mt_relevance_macros.NIL != assertion_handles.assertion_p(assertion)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_macros.NIL != any_or_all_mts_are_relevantP() || mt_relevance_macros.NIL != relevant_mtP(assertions_high.assertion_mt(assertion)));
        }
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 8836L)
    public static SubLObject mt_relevance_unspecifiedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL == mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread)) {
            return (SubLObject)mt_relevance_macros.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_macros.NIL != relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym15$RELEVANT_MT_IS_GENL_MT) && mt_relevance_macros.$mt$.getDynamicValue(thread).eql(mt_vars.$assertible_theory_mt_root$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9048L)
    public static SubLObject genl_mts_are_relevantP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_macros.NIL == mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread) || mt_relevance_macros.NIL != relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym15$RELEVANT_MT_IS_GENL_MT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9193L)
    public static SubLObject any_mt_is_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym16$RELEVANT_MT_IS_ANY_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9293L)
    public static SubLObject all_mts_are_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym17$RELEVANT_MT_IS_EVERYTHING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9399L)
    public static SubLObject any_or_all_mts_are_relevantP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_macros.NIL != relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym17$RELEVANT_MT_IS_EVERYTHING) || mt_relevance_macros.NIL != relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym16$RELEVANT_MT_IS_ANY_MT));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9572L)
    public static SubLObject listed_mts_are_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym19$RELEVANT_MT_IS_IN_LIST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9678L)
    public static SubLObject genl_mts_of_listed_mts_are_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9811L)
    public static SubLObject any_time_is_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 9928L)
    public static SubLObject spec_mts_are_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym24$RELEVANT_MT_IS_SPEC_MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10032L)
    public static SubLObject only_specified_mt_is_relevantP() {
        return relevant_mt_function_eq((SubLObject)mt_relevance_macros.$sym18$RELEVANT_MT_IS_EQ);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10139L)
    public static SubLObject with_genl_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list26, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, mt, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10410L)
    public static SubLObject with_genl_mts_el(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject elmt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list30);
        elmt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym28$WITH_GENL_MTS, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym31$CANONICALIZE_HLMT, elmt), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10644L)
    public static SubLObject with_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym28$WITH_GENL_MTS, mt, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10808L)
    public static SubLObject with_all_mts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list33, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, mt_relevance_macros.$const34$EverythingPSC, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 10982L)
    public static SubLObject with_any_mt(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list38, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, mt_relevance_macros.$const39$InferencePSC, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11215L)
    public static SubLObject with_just_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list42, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, mt, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11386L)
    public static SubLObject with_mt_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_list = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list8);
        mt_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list45, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym6$IN_MT_LIST, mt_list, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11596L)
    public static SubLObject with_mt_list_and_genl_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_list = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list8);
        mt_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list48, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym6$IN_MT_LIST, mt_list, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 11849L)
    public static SubLObject with_genl_mts_of_union(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_union = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list49);
        mt_union = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym50$WITH_MT_LIST_AND_GENL_MTS, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym51$MT_UNION_MTS, mt_union), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12072L)
    public static SubLObject with_any_time_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list52, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, mt, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12293L)
    public static SubLObject with_spec_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)mt_relevance_macros.$list53, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, mt, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12571L)
    public static SubLObject possibly_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (mt_relevance_macros.NIL == mt) {
            return reader.bq_cons((SubLObject)mt_relevance_macros.$sym54$PROGN, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
        }
        final SubLObject mt_var = (SubLObject)mt_relevance_macros.$sym55$MT_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_var, mt)), (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION, mt_var), (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym57$POSSIBLY_IN_MT_DETERMINE_MT, mt_var), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 12952L)
    public static SubLObject possibly_in_mt_determine_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL == mt || mt_relevance_macros.NIL != with_inference_any_mt_relevanceP(mt) || mt_relevance_macros.NIL != with_inference_mt_relevance_all_mtsP(mt) || mt_relevance_macros.NIL != genl_mts_of_listed_mts_are_relevantP() || mt_relevance_macros.NIL != any_time_is_relevantP()) {
            return mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        }
        return (SubLObject)mt_relevance_macros.$sym15$RELEVANT_MT_IS_GENL_MT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 13340L)
    public static SubLObject possibly_in_mt_determine_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (mt_relevance_macros.NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 13550L)
    public static SubLObject possibly_with_just_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (mt_relevance_macros.NIL == mt) {
            return reader.bq_cons((SubLObject)mt_relevance_macros.$sym54$PROGN, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
        }
        final SubLObject mt_var = (SubLObject)mt_relevance_macros.$sym59$MT_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_var, mt)), (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, mt_var), (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym27$IN_MT, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT, mt_var), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14017L)
    public static SubLObject possibly_with_just_mt_determine_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL == mt) {
            return mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        }
        assert mt_relevance_macros.NIL != hlmt.hlmt_p(mt) : mt;
        return (SubLObject)mt_relevance_macros.$sym18$RELEVANT_MT_IS_EQ;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14231L)
    public static SubLObject possibly_with_just_mt_determine_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (mt_relevance_macros.NIL != mt) ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14352L)
    public static SubLObject with_inference_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE, mt), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 14933L)
    public static SubLObject with_inference_mt_relevance_el(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject elmt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list30);
        elmt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym66$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, elmt), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15202L)
    public static SubLObject with_inference_mt_relevance_validate(final SubLObject mt) {
        return (mt_relevance_macros.NIL != mt) ? mt : Errors.error((SubLObject)mt_relevance_macros.$str69$No_microtheory_was_specified_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15380L)
    public static SubLObject determine_inference_mt_relevance_el_spec(final SubLObject elmt) {
        return (mt_relevance_macros.NIL != hlmt.possibly_mt_p(elmt)) ? hlmt_czer.canonicalize_hlmt(elmt) : elmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15568L)
    public static SubLObject possibly_with_inference_mt_relevance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, mt, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 15832L)
    public static SubLObject possibly_with_inference_mt_relevance_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list4);
        mt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (mt_relevance_macros.NIL == mt) {
            return reader.bq_cons((SubLObject)mt_relevance_macros.$sym54$PROGN, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
        }
        final SubLObject mt_var = (SubLObject)mt_relevance_macros.$sym72$MT_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(mt_var, mt)), (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym27$IN_MT, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT, mt_var), (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym25$WITH_MT_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, mt_var), (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym6$IN_MT_LIST, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, mt_var), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 16714L)
    public static SubLObject possibly_with_inference_mt_relevance_el(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject elmt = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list30);
        elmt = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym76$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE, (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym31$CANONICALIZE_HLMT, elmt), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 16928L)
    public static SubLObject update_inference_mt_relevance_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL != mt && !mt_relevance_macros.assertionsDisabledSynth && mt_relevance_macros.NIL == hlmt.possibly_hlmt_p(mt)) {
            throw new AssertionError(mt);
        }
        if (mt_relevance_macros.NIL == mt) {
            return mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 17157L)
    public static SubLObject update_inference_mt_relevance_function(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL == mt) {
            return mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        }
        if (mt_relevance_macros.NIL != with_inference_any_mt_relevanceP(mt)) {
            return (SubLObject)mt_relevance_macros.$sym16$RELEVANT_MT_IS_ANY_MT;
        }
        if (mt_relevance_macros.NIL != with_inference_mt_relevance_all_mtsP(mt)) {
            return (SubLObject)mt_relevance_macros.$sym17$RELEVANT_MT_IS_EVERYTHING;
        }
        if (mt_relevance_macros.NIL != with_mt_union_relevanceP(mt)) {
            return (SubLObject)mt_relevance_macros.$sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER;
        }
        if (mt_relevance_macros.NIL != with_inference_anytime_relevanceP(mt)) {
            return (SubLObject)mt_relevance_macros.$sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME;
        }
        return (SubLObject)mt_relevance_macros.$sym15$RELEVANT_MT_IS_GENL_MT;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 17702L)
    public static SubLObject update_inference_mt_relevance_mt_list(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL == mt) {
            return mt_relevance_macros.$relevant_mts$.getDynamicValue(thread);
        }
        if (mt_relevance_macros.NIL != with_mt_union_relevanceP(mt)) {
            return hlmt.mt_union_mts(mt);
        }
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 17951L)
    public static SubLObject determine_possibly_with_inference_mt_relevance_mt_and_spec(final SubLObject mt) {
        return Values.values(update_inference_mt_relevance_function(mt), update_inference_mt_relevance_mt(mt), update_inference_mt_relevance_mt_list(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 18337L)
    public static SubLObject with_inference_any_mt_relevanceP(final SubLObject mt) {
        return Equality.eq((SubLObject)mt_relevance_macros.$sym82$PSC_INFERENCE, psc.mt_inference_function(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19137L)
    public static SubLObject with_inference_mt_relevance_all_mtsP(final SubLObject mt) {
        return Equality.eq((SubLObject)mt_relevance_macros.$sym84$ALL_MTS_INFERENCE, psc.mt_inference_function(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19335L)
    public static SubLObject with_mt_union_relevanceP(final SubLObject mt) {
        return Equality.eq((SubLObject)mt_relevance_macros.$sym86$MT_UNION_INFERENCE, psc.mt_inference_function(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19522L)
    public static SubLObject with_inference_anytime_relevanceP(final SubLObject mt) {
        return Equality.eq((SubLObject)mt_relevance_macros.$sym88$ANYTIME_PSC_INFERENCE, psc.mt_inference_function(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 19721L)
    public static SubLObject inference_relevant_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL != all_mts_are_relevantP()) {
            return mt_relevance_macros.$const34$EverythingPSC;
        }
        if (mt_relevance_macros.NIL != any_mt_is_relevantP()) {
            return mt_relevance_macros.$const39$InferencePSC;
        }
        if (mt_relevance_macros.NIL != genl_mts_of_listed_mts_are_relevantP()) {
            return el_utilities.make_formula(mt_relevance_macros.$const89$MtUnionFn, mt_relevance_macros.$relevant_mts$.getDynamicValue(thread), (SubLObject)mt_relevance_macros.UNPROVIDED);
        }
        if (mt_relevance_macros.NIL != genl_mts_are_relevantP()) {
            return mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        return mt_relevance_macros.$mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 20277L)
    public static SubLObject mt_info(SubLObject mt) {
        if (mt == mt_relevance_macros.UNPROVIDED) {
            mt = (SubLObject)mt_relevance_macros.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (mt_relevance_macros.NIL != all_mts_are_relevantP()) {
            return mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        }
        if (mt_relevance_macros.NIL != any_mt_is_relevantP()) {
            return mt_relevance_macros.$relevant_mt_function$.getDynamicValue(thread);
        }
        if (mt_relevance_macros.NIL != genl_mts_of_listed_mts_are_relevantP()) {
            return el_utilities.make_formula(mt_relevance_macros.$const89$MtUnionFn, mt_relevance_macros.$relevant_mts$.getDynamicValue(thread), (SubLObject)mt_relevance_macros.UNPROVIDED);
        }
        if (mt_relevance_macros.NIL != mt) {
            return mt;
        }
        if (mt_relevance_macros.NIL != mt_relevance_macros.$mt$.getDynamicValue(thread)) {
            return mt_relevance_macros.$mt$.getDynamicValue(thread);
        }
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 20598L)
    public static SubLObject mt_to_mt_info(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_info = (SubLObject)mt_relevance_macros.NIL;
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            mt_info = mt_info((SubLObject)mt_relevance_macros.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return mt_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 20787L)
    public static SubLObject mt_info_to_mt(final SubLObject mt_info) {
        if (mt_relevance_macros.NIL != mt_function_eq(mt_info, (SubLObject)mt_relevance_macros.$sym17$RELEVANT_MT_IS_EVERYTHING)) {
            return mt_relevance_macros.$const34$EverythingPSC;
        }
        if (mt_relevance_macros.NIL != mt_function_eq(mt_info, (SubLObject)mt_relevance_macros.$sym16$RELEVANT_MT_IS_ANY_MT)) {
            return mt_relevance_macros.$const39$InferencePSC;
        }
        return mt_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21019L)
    public static SubLObject with_mt_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt_info = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list90);
        mt_info = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym91$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym92$MT_FUNCTION_EQ, mt_info, (SubLObject)mt_relevance_macros.$list93), reader.bq_cons((SubLObject)mt_relevance_macros.$sym35$WITH_ALL_MTS, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym92$MT_FUNCTION_EQ, mt_info, (SubLObject)mt_relevance_macros.$list94), reader.bq_cons((SubLObject)mt_relevance_macros.$sym40$WITH_ANY_MT, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym95$MT_UNION_NAUT_P, mt_info), (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym96$WITH_GENL_MTS_OF_UNION, mt_info, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.T, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym28$WITH_GENL_MTS, mt_info, ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21485L)
    public static SubLObject in_one_of_these_mtsP(final SubLObject ass, final SubLObject mts) {
        return subl_promotions.memberP(assertions_high.assertion_mt(ass), mts, (SubLObject)mt_relevance_macros.UNPROVIDED, (SubLObject)mt_relevance_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21577L)
    public static SubLObject any_or_all_mts_relevant_to_mtP(final SubLObject mt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(mt_relevance_macros.NIL != with_inference_any_mt_relevanceP(mt) || mt_relevance_macros.NIL != with_inference_mt_relevance_all_mtsP(mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 21729L)
    public static SubLObject conservative_constraint_mt(final SubLObject mt) {
        if (mt_relevance_macros.NIL != any_or_all_mts_relevant_to_mtP(mt)) {
            return mt_vars.$core_mt_floor$.getGlobalValue();
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 22061L)
    public static SubLObject mt_relevant_to_mtP(final SubLObject mt, final SubLObject possibly_relevant_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relevantP = (SubLObject)mt_relevance_macros.NIL;
        final SubLObject mt_var = with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(update_inference_mt_relevance_mt_list(mt_var), thread);
            relevantP = relevant_mtP(possibly_relevant_mt);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return relevantP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 22305L)
    public static SubLObject any_relevant_mtP(final SubLObject mts) {
        SubLObject relevantP = (SubLObject)mt_relevance_macros.NIL;
        if (mt_relevance_macros.NIL == relevantP) {
            SubLObject csome_list_var = mts;
            SubLObject mt = (SubLObject)mt_relevance_macros.NIL;
            mt = csome_list_var.first();
            while (mt_relevance_macros.NIL == relevantP && mt_relevance_macros.NIL != csome_list_var) {
                if (mt_relevance_macros.NIL != relevant_mtP(mt)) {
                    relevantP = (SubLObject)mt_relevance_macros.T;
                }
                csome_list_var = csome_list_var.rest();
                mt = csome_list_var.first();
            }
        }
        return relevantP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-macros.lisp", position = 22470L)
    public static SubLObject map_mts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list97);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)mt_relevance_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)mt_relevance_macros.$list97);
        var = current.first();
        current = current.rest();
        if (mt_relevance_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)mt_relevance_macros.$sym35$WITH_ALL_MTS, (SubLObject)ConsesLow.listS((SubLObject)mt_relevance_macros.$sym98$DO_ALL_FORT_INSTANCES, reader.bq_cons(var, (SubLObject)mt_relevance_macros.$list99), ConsesLow.append(body, (SubLObject)mt_relevance_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)mt_relevance_macros.$list97);
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    public static SubLObject declare_mt_relevance_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_mt_function", "WITH-MT-FUNCTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "mt_function_eq", "MT-FUNCTION-EQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_function_eq", "RELEVANT-MT-FUNCTION-EQ", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "in_mt", "IN-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "in_mt_list", "IN-MT-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "current_mt_relevance_mt_context", "CURRENT-MT-RELEVANCE-MT-CONTEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "current_mt_relevance_mt", "CURRENT-MT-RELEVANCE-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "current_mt_relevance_mt_list", "CURRENT-MT-RELEVANCE-MT-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "current_mt_relevance_test", "CURRENT-MT-RELEVANCE-TEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_everything", "RELEVANT-MT-IS-EVERYTHING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_any_mt", "RELEVANT-MT-IS-ANY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_eq", "RELEVANT-MT-IS-EQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_in_list", "RELEVANT-MT-IS-IN-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_genl_mt", "RELEVANT-MT-IS-GENL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_spec_mt", "RELEVANT-MT-IS-SPEC-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_genl_mt_of_list_member", "RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mt_is_genl_mt_with_any_time", "RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_mtP", "RELEVANT-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "all_possibly_relevant_mts", "ALL-POSSIBLY-RELEVANT-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "relevant_assertionP", "RELEVANT-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "mt_relevance_unspecifiedP", "MT-RELEVANCE-UNSPECIFIED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "genl_mts_are_relevantP", "GENL-MTS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "any_mt_is_relevantP", "ANY-MT-IS-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "all_mts_are_relevantP", "ALL-MTS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "any_or_all_mts_are_relevantP", "ANY-OR-ALL-MTS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "listed_mts_are_relevantP", "LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "genl_mts_of_listed_mts_are_relevantP", "GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "any_time_is_relevantP", "ANY-TIME-IS-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "spec_mts_are_relevantP", "SPEC-MTS-ARE-RELEVANT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "only_specified_mt_is_relevantP", "ONLY-SPECIFIED-MT-IS-RELEVANT?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_genl_mts", "WITH-GENL-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_genl_mts_el", "WITH-GENL-MTS-EL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_mt", "WITH-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_all_mts", "WITH-ALL-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_any_mt", "WITH-ANY-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_just_mt", "WITH-JUST-MT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_mt_list", "WITH-MT-LIST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_mt_list_and_genl_mts", "WITH-MT-LIST-AND-GENL-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_genl_mts_of_union", "WITH-GENL-MTS-OF-UNION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_any_time_relevance", "WITH-ANY-TIME-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_spec_mts", "WITH-SPEC-MTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_in_mt", "POSSIBLY-IN-MT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_in_mt_determine_function", "POSSIBLY-IN-MT-DETERMINE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_in_mt_determine_mt", "POSSIBLY-IN-MT-DETERMINE-MT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_with_just_mt", "POSSIBLY-WITH-JUST-MT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_with_just_mt_determine_function", "POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_with_just_mt_determine_mt", "POSSIBLY-WITH-JUST-MT-DETERMINE-MT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_inference_mt_relevance", "WITH-INFERENCE-MT-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_inference_mt_relevance_el", "WITH-INFERENCE-MT-RELEVANCE-EL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "with_inference_mt_relevance_validate", "WITH-INFERENCE-MT-RELEVANCE-VALIDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "determine_inference_mt_relevance_el_spec", "DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_with_inference_mt_relevance", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_with_inference_mt_relevance_internal", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "possibly_with_inference_mt_relevance_el", "POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-EL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "update_inference_mt_relevance_mt", "UPDATE-INFERENCE-MT-RELEVANCE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "update_inference_mt_relevance_function", "UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "update_inference_mt_relevance_mt_list", "UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "determine_possibly_with_inference_mt_relevance_mt_and_spec", "DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "with_inference_any_mt_relevanceP", "WITH-INFERENCE-ANY-MT-RELEVANCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "with_inference_mt_relevance_all_mtsP", "WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "with_mt_union_relevanceP", "WITH-MT-UNION-RELEVANCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "with_inference_anytime_relevanceP", "WITH-INFERENCE-ANYTIME-RELEVANCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "inference_relevant_mt", "INFERENCE-RELEVANT-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "mt_info", "MT-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "mt_to_mt_info", "MT-TO-MT-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "mt_info_to_mt", "MT-INFO-TO-MT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "with_mt_info", "WITH-MT-INFO");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "in_one_of_these_mtsP", "IN-ONE-OF-THESE-MTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "any_or_all_mts_relevant_to_mtP", "ANY-OR-ALL-MTS-RELEVANT-TO-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "conservative_constraint_mt", "CONSERVATIVE-CONSTRAINT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "mt_relevant_to_mtP", "MT-RELEVANT-TO-MT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.mt_relevance_macros", "any_relevant_mtP", "ANY-RELEVANT-MT?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.mt_relevance_macros", "map_mts", "MAP-MTS");
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    public static SubLObject init_mt_relevance_macros_file() {
        mt_relevance_macros.$relevant_mt_function$ = SubLFiles.defparameter("*RELEVANT-MT-FUNCTION*", (SubLObject)mt_relevance_macros.NIL);
        mt_relevance_macros.$mt$ = SubLFiles.defparameter("*MT*", mt_vars.$assertible_theory_mt_root$.getGlobalValue());
        mt_relevance_macros.$relevant_mts$ = SubLFiles.defparameter("*RELEVANT-MTS*", (SubLObject)mt_relevance_macros.NIL);
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    public static SubLObject setup_mt_relevance_macros_file() {
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)mt_relevance_macros.$list0);
        mt_vars.note_mt_var(mt_relevance_macros.$mt$.getDynamicValue(), (SubLObject)mt_relevance_macros.UNPROVIDED);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym6$IN_MT_LIST, (SubLObject)mt_relevance_macros.$list7);
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)mt_relevance_macros.$list10);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym28$WITH_GENL_MTS, (SubLObject)mt_relevance_macros.$list4, (SubLObject)mt_relevance_macros.$str29$MT_and_all_its_genl_mts_are_relev);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym32$WITH_MT, (SubLObject)mt_relevance_macros.$list4, (SubLObject)mt_relevance_macros.$str29$MT_and_all_its_genl_mts_are_relev);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym35$WITH_ALL_MTS, (SubLObject)mt_relevance_macros.$list36, (SubLObject)mt_relevance_macros.$str37$All_mts_are_relevant_within_BODY_);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym40$WITH_ANY_MT, (SubLObject)mt_relevance_macros.$list36, (SubLObject)mt_relevance_macros.$str41$Any_mt_can_be_used_for_relevance_);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym43$WITH_JUST_MT, (SubLObject)mt_relevance_macros.$list4, (SubLObject)mt_relevance_macros.$str44$Only_MT_is_relevant_within_BODY__);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym46$WITH_MT_LIST, (SubLObject)mt_relevance_macros.$list8, (SubLObject)mt_relevance_macros.$str47$Each_mt_in_the_list_MT_LIST_is_re);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION, (SubLObject)mt_relevance_macros.$sym58$POSSIBLY_IN_MT);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym57$POSSIBLY_IN_MT_DETERMINE_MT, (SubLObject)mt_relevance_macros.$sym58$POSSIBLY_IN_MT);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION, (SubLObject)mt_relevance_macros.$sym62$POSSIBLY_WITH_JUST_MT);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT, (SubLObject)mt_relevance_macros.$sym62$POSSIBLY_WITH_JUST_MT);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym66$WITH_INFERENCE_MT_RELEVANCE, (SubLObject)mt_relevance_macros.$list4, (SubLObject)mt_relevance_macros.$str67$BODY_evaluated_with_the_same_rele);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE, (SubLObject)mt_relevance_macros.$sym66$WITH_INFERENCE_MT_RELEVANCE);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC, (SubLObject)mt_relevance_macros.$sym70$WITH_INFERENCE_MT_RELEVANCE_EL);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL, (SubLObject)mt_relevance_macros.$list71);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT, (SubLObject)mt_relevance_macros.$sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION, (SubLObject)mt_relevance_macros.$sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST, (SubLObject)mt_relevance_macros.$sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL);
        access_macros.define_obsolete_register((SubLObject)mt_relevance_macros.$sym78$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC, (SubLObject)mt_relevance_macros.$list79);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_, (SubLObject)mt_relevance_macros.$list81);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_, (SubLObject)mt_relevance_macros.$list81);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym85$WITH_MT_UNION_RELEVANCE_, (SubLObject)mt_relevance_macros.$list81);
        access_macros.register_macro_helper((SubLObject)mt_relevance_macros.$sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_, (SubLObject)mt_relevance_macros.$list81);
        utilities_macros.register_cyc_api_macro((SubLObject)mt_relevance_macros.$sym100$MAP_MTS, (SubLObject)mt_relevance_macros.$list97, (SubLObject)mt_relevance_macros.$str101$Iterate_over_all_microtheories__b);
        return (SubLObject)mt_relevance_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_mt_relevance_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_mt_relevance_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_mt_relevance_macros_file();
    }
    
    static {
        me = (SubLFile)new mt_relevance_macros();
        mt_relevance_macros.$relevant_mt_function$ = null;
        mt_relevance_macros.$mt$ = null;
        mt_relevance_macros.$relevant_mts$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("MT-FUNCTION-EQ"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-FUNCTION-EQ"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$_RELEVANT_MT_FUNCTION_ = SubLObjectFactory.makeSymbol("*RELEVANT-MT-FUNCTION*");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym5$_MT_ = SubLObjectFactory.makeSymbol("*MT*");
        $sym6$IN_MT_LIST = SubLObjectFactory.makeSymbol("IN-MT-LIST");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("WITH-MT-LIST-AND-GENL-MTS"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym9$_RELEVANT_MTS_ = SubLObjectFactory.makeSymbol("*RELEVANT-MTS*");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-IN-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-SPEC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));
        $sym11$HLMT_EQUAL = SubLObjectFactory.makeSymbol("HLMT-EQUAL");
        $sym12$SPECIAL_CORE_LOOP_MT_P = SubLObjectFactory.makeSymbol("SPECIAL-CORE-LOOP-MT-P");
        $sym13$CORE_MICROTHEORY_P = SubLObjectFactory.makeSymbol("CORE-MICROTHEORY-P");
        $const14$TimePoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $sym15$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym16$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
        $sym17$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $sym18$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $sym19$RELEVANT_MT_IS_IN_LIST = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-IN-LIST");
        $sym20$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
        $sym21$RELEVANT_MT_IS_GENL_MT_WITH_ANY_TIME = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME");
        $kw22$ALL = SubLObjectFactory.makeKeyword("ALL");
        $kw23$UNABLE_TO_DETERMINE = SubLObjectFactory.makeKeyword("UNABLE-TO-DETERMINE");
        $sym24$RELEVANT_MT_IS_SPEC_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-SPEC-MT");
        $sym25$WITH_MT_FUNCTION = SubLObjectFactory.makeSymbol("WITH-MT-FUNCTION");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT"));
        $sym27$IN_MT = SubLObjectFactory.makeSymbol("IN-MT");
        $sym28$WITH_GENL_MTS = SubLObjectFactory.makeSymbol("WITH-GENL-MTS");
        $str29$MT_and_all_its_genl_mts_are_relev = SubLObjectFactory.makeString("MT and all its genl mts are relevant within BODY.");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELMT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym31$CANONICALIZE_HLMT = SubLObjectFactory.makeSymbol("CANONICALIZE-HLMT");
        $sym32$WITH_MT = SubLObjectFactory.makeSymbol("WITH-MT");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING"));
        $const34$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym35$WITH_ALL_MTS = SubLObjectFactory.makeSymbol("WITH-ALL-MTS");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str37$All_mts_are_relevant_within_BODY_ = SubLObjectFactory.makeString("All mts are relevant within BODY.");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT"));
        $const39$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym40$WITH_ANY_MT = SubLObjectFactory.makeSymbol("WITH-ANY-MT");
        $str41$Any_mt_can_be_used_for_relevance_ = SubLObjectFactory.makeString("Any mt can be used for relevance for a particular inference within &BODY.");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ"));
        $sym43$WITH_JUST_MT = SubLObjectFactory.makeSymbol("WITH-JUST-MT");
        $str44$Only_MT_is_relevant_within_BODY__ = SubLObjectFactory.makeString("Only MT is relevant within BODY (no genl mts).");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-IN-LIST"));
        $sym46$WITH_MT_LIST = SubLObjectFactory.makeSymbol("WITH-MT-LIST");
        $str47$Each_mt_in_the_list_MT_LIST_is_re = SubLObjectFactory.makeString("Each mt in the list MT-LIST is relevant within BODY (no genl mts).");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-UNION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym50$WITH_MT_LIST_AND_GENL_MTS = SubLObjectFactory.makeSymbol("WITH-MT-LIST-AND-GENL-MTS");
        $sym51$MT_UNION_MTS = SubLObjectFactory.makeSymbol("MT-UNION-MTS");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT-WITH-ANY-TIME"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-SPEC-MT"));
        $sym54$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym55$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym56$POSSIBLY_IN_MT_DETERMINE_FUNCTION = SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT-DETERMINE-FUNCTION");
        $sym57$POSSIBLY_IN_MT_DETERMINE_MT = SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT-DETERMINE-MT");
        $sym58$POSSIBLY_IN_MT = SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT");
        $sym59$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym60$POSSIBLY_WITH_JUST_MT_DETERMINE_FUNCTION = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-JUST-MT-DETERMINE-FUNCTION");
        $sym61$POSSIBLY_WITH_JUST_MT_DETERMINE_MT = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-JUST-MT-DETERMINE-MT");
        $sym62$POSSIBLY_WITH_JUST_MT = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-JUST-MT");
        $sym63$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $sym64$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_INTERNAL = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL");
        $sym65$WITH_INFERENCE_MT_RELEVANCE_VALIDATE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE-VALIDATE");
        $sym66$WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE");
        $str67$BODY_evaluated_with_the_same_rele = SubLObjectFactory.makeString("BODY evaluated with the same relevance used for inferences in MT.\n   This is like @xref with-genl-mts, except it is special-cased to\n   @xref with-all-mts when the mt is #$EverythingPSC,\n   @xref with-any-mt when the mt is #$InferencePSC.\n   Also, with-inference-mt-relevance errors if passed NIL for an mt.");
        $sym68$DETERMINE_INFERENCE_MT_RELEVANCE_EL_SPEC = SubLObjectFactory.makeSymbol("DETERMINE-INFERENCE-MT-RELEVANCE-EL-SPEC");
        $str69$No_microtheory_was_specified_ = SubLObjectFactory.makeString("No microtheory was specified.");
        $sym70$WITH_INFERENCE_MT_RELEVANCE_EL = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE-EL");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE"));
        $sym72$MT_VAR = SubLObjectFactory.makeUninternedSymbol("MT-VAR");
        $sym73$UPDATE_INFERENCE_MT_RELEVANCE_MT = SubLObjectFactory.makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT");
        $sym74$UPDATE_INFERENCE_MT_RELEVANCE_FUNCTION = SubLObjectFactory.makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION");
        $sym75$UPDATE_INFERENCE_MT_RELEVANCE_MT_LIST = SubLObjectFactory.makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST");
        $sym76$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
        $sym77$POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("POSSIBLY-HLMT-P");
        $sym78$DETERMINE_POSSIBLY_WITH_INFERENCE_MT_RELEVANCE_MT_AND_SPEC = SubLObjectFactory.makeSymbol("DETERMINE-POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-MT-AND-SPEC");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATE-INFERENCE-MT-RELEVANCE-MT-LIST"));
        $sym80$WITH_INFERENCE_ANY_MT_RELEVANCE_ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-ANY-MT-RELEVANCE?");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE-INTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-IN-MT"));
        $sym82$PSC_INFERENCE = SubLObjectFactory.makeSymbol("PSC-INFERENCE");
        $sym83$WITH_INFERENCE_MT_RELEVANCE_ALL_MTS_ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-MT-RELEVANCE-ALL-MTS?");
        $sym84$ALL_MTS_INFERENCE = SubLObjectFactory.makeSymbol("ALL-MTS-INFERENCE");
        $sym85$WITH_MT_UNION_RELEVANCE_ = SubLObjectFactory.makeSymbol("WITH-MT-UNION-RELEVANCE?");
        $sym86$MT_UNION_INFERENCE = SubLObjectFactory.makeSymbol("MT-UNION-INFERENCE");
        $sym87$WITH_INFERENCE_ANYTIME_RELEVANCE_ = SubLObjectFactory.makeSymbol("WITH-INFERENCE-ANYTIME-RELEVANCE?");
        $sym88$ANYTIME_PSC_INFERENCE = SubLObjectFactory.makeSymbol("ANYTIME-PSC-INFERENCE");
        $const89$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym91$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym92$MT_FUNCTION_EQ = SubLObjectFactory.makeSymbol("MT-FUNCTION-EQ");
        $list93 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING")));
        $list94 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT")));
        $sym95$MT_UNION_NAUT_P = SubLObjectFactory.makeSymbol("MT-UNION-NAUT-P");
        $sym96$WITH_GENL_MTS_OF_UNION = SubLObjectFactory.makeSymbol("WITH-GENL-MTS-OF-UNION");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym98$DO_ALL_FORT_INSTANCES = SubLObjectFactory.makeSymbol("DO-ALL-FORT-INSTANCES");
        $list99 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $sym100$MAP_MTS = SubLObjectFactory.makeSymbol("MAP-MTS");
        $str101$Iterate_over_all_microtheories__b = SubLObjectFactory.makeString("Iterate over all microtheories, binding VAR to an mt and executing BODY.");
    }
}

/*

	Total time: 278 ms
	 synthetic 
*/