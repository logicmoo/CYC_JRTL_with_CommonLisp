package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class plausibility_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.plausibility_utilities";
    public static final String myFingerPrint = "fdcdf5fa1b65e7c935ee1303afca672a75bf0e9d0822b724f48c16063430f7ee";
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 943L)
    private static SubLSymbol $default_plausibility_check_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1021L)
    private static SubLSymbol $implausibility_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1704L)
    private static SubLSymbol $debug_implausibilityP$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1756L)
    private static SubLSymbol $debug_implausibility_wf_checksP$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1817L)
    private static SubLSymbol $implausibility_override_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1881L)
    private static SubLSymbol $implausibility_stats_table$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 1937L)
    private static SubLSymbol $default_plausibility_percent_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2002L)
    private static SubLSymbol $plausibility_factor_completely_implausible$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2075L)
    private static SubLSymbol $plausibility_factor_non_wff$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2216L)
    private static SubLSymbol $plausibility_factor_type_violation$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2352L)
    private static SubLSymbol $plausibility_factor_arg_violation$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2501L)
    private static SubLSymbol $plausibility_factor_arg_disjointness$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2638L)
    private static SubLSymbol $plausibility_factor_not_isa_or_genls$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2781L)
    private static SubLSymbol $plausibility_factor_inter_sentential_contradiction$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 2905L)
    private static SubLSymbol $plausibility_factor_implied_arg_restriction$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3193L)
    private static SubLSymbol $plausibility_factor_no_type_restriction$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3354L)
    private static SubLSymbol $plausibility_factor_typical_volume_violation$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3557L)
    private static SubLSymbol $plausibility_factor_esoteric_term$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3685L)
    private static SubLSymbol $plausibility_factor_splitting_hairs_cutoff$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3833L)
    private static SubLSymbol $plausibility_factor_completely_plausible$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3905L)
    private static SubLSymbol $default_sentence_plausibility_score_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 43308L)
    private static SubLSymbol $typical_volume_applicable_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 43399L)
    private static SubLSymbol $typical_volume_applicable_pred_inverses$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
    private static SubLSymbol $tweak_implausibility_type_restrictions_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
    private static SubLSymbol $implied_argn_type_requirements_for_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
    private static SubLSymbol $implied_argn_type_restrictions_for_pred_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
    private static SubLSymbol $tva_check_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
    private static SubLSymbol $implausible_admitted_argumentP_caching_state$;
    private static final SubLObject $const0$PlausibilityQueryMt;
    private static final SubLList $list1;
    private static final SubLFloat $float2$0_5;
    private static final SubLFloat $float3$0_01;
    private static final SubLFloat $float4$0_02;
    private static final SubLFloat $float5$0_03;
    private static final SubLFloat $float6$0_04;
    private static final SubLFloat $float7$0_05;
    private static final SubLFloat $float8$0_055;
    private static final SubLFloat $float9$0_06;
    private static final SubLFloat $float10$0_07;
    private static final SubLFloat $float11$0_08;
    private static final SubLFloat $float12$0_09;
    private static final SubLFloat $float13$0_1;
    private static final SubLSymbol $kw14$JUSTIFY_;
    private static final SubLInteger $int15$100;
    private static final SubLSymbol $kw16$MAX_TIME;
    private static final SubLSymbol $kw17$PERCENT_CUTOFF;
    private static final SubLSymbol $kw18$CLEAR_CACHES_;
    private static final SubLSymbol $kw19$SUPPRESS_PLAUSIBLE_NART_;
    private static final SubLSymbol $sym20$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $kw21$GATHER_STATS_;
    private static final SubLSymbol $kw22$TIMED_OUT_;
    private static final SubLSymbol $kw23$IMPLAUSIBLE_;
    private static final SubLSymbol $kw24$PLAUSIBLE_;
    private static final SubLString $str25$Bad_justification_;
    private static final SubLSymbol $kw26$PERCENT_CLIPPING_;
    private static final SubLSymbol $kw27$RETURN_BOOLEAN_;
    private static final SubLSymbol $kw28$EAGER;
    private static final SubLObject $const29$equalSymbols;
    private static final SubLObject $const30$equals;
    private static final SubLSymbol $kw31$FORCE_GENLS_TRUTH_CHECK_;
    private static final SubLObject $const32$genls;
    private static final SubLList $list33;
    private static final SubLObject $const34$isa;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$IGNORE;
    private static final SubLObject $const37$admittedArgument;
    private static final SubLObject $const38$False;
    private static final SubLSymbol $kw39$OPAQUE;
    private static final SubLObject $const40$wffViolation;
    private static final SubLString $str41$Sentence_contains_contradictory_c;
    private static final SubLSymbol $kw42$LAZY;
    private static final SubLSymbol $kw43$FROM;
    private static final SubLSymbol $kw44$RELATION_DIRECTION;
    private static final SubLSymbol $kw45$COL_ARG;
    private static final SubLList $list46;
    private static final SubLSymbol $kw47$ARG_ORDER;
    private static final SubLSymbol $kw48$TYPE_COL_PRED;
    private static final SubLList $list49;
    private static final SubLObject $const50$CollectionIntersection2Fn;
    private static final SubLList $list51;
    private static final SubLObject $const52$CollectionUnionFn;
    private static final SubLSymbol $sym53$POSSIBLY_FIND_NART;
    private static final SubLSymbol $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE;
    private static final SubLObject $const55$SubcollectionOfWithRelationToType;
    private static final SubLList $list56;
    private static final SubLObject $const57$SubcollectionOfWithRelationFromTy;
    private static final SubLList $list58;
    private static final SubLObject $const59$SubcollectionOfWithoutRelationToT;
    private static final SubLList $list60;
    private static final SubLObject $const61$SubcollectionOfWithoutRelationFro;
    private static final SubLList $list62;
    private static final SubLObject $const63$SitTypeSpecWithTypeRestrictionOnR;
    private static final SubLList $list64;
    private static final SubLObject $const65$SubcollectionOfWithRelationToFn;
    private static final SubLList $list66;
    private static final SubLObject $const67$SubcollectionOfWithRelationFromFn;
    private static final SubLList $list68;
    private static final SubLObject $const69$SubcollectionOfWithoutRelationToF;
    private static final SubLList $list70;
    private static final SubLObject $const71$SubcollectionOfWithoutRelationFro;
    private static final SubLList $list72;
    private static final SubLObject $const73$UsingAForFn;
    private static final SubLList $list74;
    private static final SubLObject $const75$ReifiableFunction;
    private static final SubLSymbol $kw76$SUPPRESS_WFF_CHECKS_;
    private static final SubLSymbol $kw77$SUPPRESS_WF_CHECKS_;
    private static final SubLString $str78$__implausible_sentence_wrt_variab;
    private static final SubLString $str79$Variable_types_are_disjoint_;
    private static final SubLSymbol $kw80$SUPPRESS_WFT_CHECKS_;
    private static final SubLSymbol $kw81$WFT_CHECK_TYPE;
    private static final SubLString $str82$__implausible_term_wrt_wft___S__;
    private static final SubLList $list83;
    private static final SubLSymbol $kw84$WFF_CHECK_TYPE;
    private static final SubLString $str85$__implausible_sentence_wrt_wff___;
    private static final SubLObject $const86$not;
    private static final SubLList $list87;
    private static final SubLObject $const88$quotedIsa;
    private static final SubLList $list89;
    private static final SubLObject $const90$Collection;
    private static final SubLList $list91;
    private static final SubLObject $const92$argIsa;
    private static final SubLObject $const93$disjointWith;
    private static final SubLObject $const94$AnytimePSC;
    private static final SubLObject $const95$argSometimesIsa;
    private static final SubLObject $const96$unknownSentence;
    private static final SubLSymbol $kw97$MIN_CEILING_COLS;
    private static final SubLObject $const98$genlPreds;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLList $list101;
    private static final SubLList $list102;
    private static final SubLSymbol $kw103$PRED;
    private static final SubLSymbol $kw104$INVERSE;
    private static final SubLObject $const105$typicallyMoreVoluminousThan;
    private static final SubLSymbol $sym106$CLOSED_;
    private static final SubLSymbol $sym107$ESOTERIC_TERM_;
    private static final SubLList $list108;
    private static final SubLObject $const109$EsotericTerm;
    private static final SubLObject $const110$ExotericTerm;
    private static final SubLSymbol $sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS;
    private static final SubLSymbol $sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED;
    private static final SubLSymbol $sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED;
    private static final SubLSymbol $sym114$CLEAR_TVA_CHECK_CACHED;
    private static final SubLSymbol $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_;
    private static final SubLSymbol $sym116$CLEAR_DO_TVA_QUERY_TYPE_TYPE;
    private static final SubLSymbol $sym117$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH;
    private static final SubLString $str118$__tweak_implausibility_type_restr;
    private static final SubLSymbol $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_;
    private static final SubLString $str120$__implied_argn_type_requirements_;
    private static final SubLSymbol $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_;
    private static final SubLString $str122$__implied_argn_type_restrictions_;
    private static final SubLSymbol $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_;
    private static final SubLString $str124$__tva_check_cached___A__;
    private static final SubLSymbol $sym125$_TVA_CHECK_CACHED_CACHING_STATE_;
    private static final SubLString $str126$__implausible_admitted_argument__;
    private static final SubLSymbol $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_;
    private static final SubLString $str128$__do_tva_query_type_type___A__;
    private static final SubLSymbol $sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_;
    private static final SubLString $str130$__do_tva_query_type_disjoint_with;
    private static final SubLSymbol $sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_;
    private static final SubLSymbol $sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS;
    private static final SubLInteger $int133$4096;
    private static final SubLSymbol $sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED;
    private static final SubLObject $const135$relationNotExistsExists;
    private static final SubLSymbol $sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED;
    private static final SubLObject $const137$relationAllExists;
    private static final SubLObject $const138$someTypePlaysRoleInSituationType;
    private static final SubLList $list139;
    private static final SubLSymbol $kw140$NONE;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$TVA_CHECK_CACHED;
    private static final SubLSymbol $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_;
    private static final SubLSymbol $sym144$INTEGERP;
    private static final SubLInteger $int145$8192;
    private static final SubLString $str146$hl_justify_asent_not_legal_to_cal;
    private static final SubLList $list147;
    private static final SubLSymbol $kw148$CONDITIONAL_SENTENCE_;
    private static final SubLString $str149$Could_not_find_hl_support_for__S_;
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 3983L)
    public static SubLObject sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = plausibility_utilities.$default_plausibility_check_mt$.getDynamicValue();
        }
        if (v_properties == plausibility_utilities.UNPROVIDED) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.merge_plist(plausibility_utilities.$default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
        return implausible_sentenceP(sentence, mt, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 4365L)
    public static SubLObject why_sentence_plausibility_factor(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = plausibility_utilities.$default_plausibility_check_mt$.getDynamicValue();
        }
        if (v_properties == plausibility_utilities.UNPROVIDED) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.merge_plist(plausibility_utilities.$default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
        v_properties = conses_high.putf(v_properties, (SubLObject)plausibility_utilities.$kw14$JUSTIFY_, (SubLObject)plausibility_utilities.T);
        return implausible_sentenceP(sentence, mt, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 4808L)
    public static SubLObject sentence_plausibility_score(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = plausibility_utilities.$default_plausibility_check_mt$.getDynamicValue();
        }
        if (v_properties == plausibility_utilities.UNPROVIDED) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.merge_plist(plausibility_utilities.$default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
        thread.resetMultipleValues();
        final SubLObject plausibility_factor = implausible_sentenceP(sentence, mt, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(Numbers.floor(Numbers.multiply((SubLObject)plausibility_utilities.$int15$100, plausibility_factor), (SubLObject)plausibility_utilities.UNPROVIDED), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 5323L)
    public static SubLObject why_sentence_plausibility_score(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = plausibility_utilities.$default_plausibility_check_mt$.getDynamicValue();
        }
        if (v_properties == plausibility_utilities.UNPROVIDED) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.merge_plist(plausibility_utilities.$default_sentence_plausibility_score_properties$.getDynamicValue(thread), v_properties);
        v_properties = conses_high.putf(v_properties, (SubLObject)plausibility_utilities.$kw14$JUSTIFY_, (SubLObject)plausibility_utilities.T);
        thread.resetMultipleValues();
        final SubLObject plausibility_factor = implausible_sentenceP(sentence, mt, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED);
        final SubLObject justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(Numbers.floor(Numbers.multiply((SubLObject)plausibility_utilities.$int15$100, plausibility_factor), (SubLObject)plausibility_utilities.UNPROVIDED), justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 5899L)
    public static SubLObject implausible_sentenceP(final SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject depth) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = plausibility_utilities.$default_plausibility_check_mt$.getDynamicValue();
        }
        if (v_properties == plausibility_utilities.UNPROVIDED) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        if (depth == plausibility_utilities.UNPROVIDED) {
            depth = (SubLObject)plausibility_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject justifyP = get_implausibility_property((SubLObject)plausibility_utilities.$kw14$JUSTIFY_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED);
        final SubLObject max_time = get_implausibility_property((SubLObject)plausibility_utilities.$kw16$MAX_TIME, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED);
        final SubLObject percent_cutoff = get_implausibility_property((SubLObject)plausibility_utilities.$kw17$PERCENT_CUTOFF, v_properties, plausibility_utilities.$default_plausibility_percent_cutoff$.getDynamicValue(thread));
        if (v_properties == plausibility_utilities.T) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        if (plausibility_utilities.NIL != get_implausibility_property((SubLObject)plausibility_utilities.$kw18$CLEAR_CACHES_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            clear_plausibility_caches();
        }
        if (plausibility_utilities.NIL != plausibility_utilities.$debug_implausibilityP$.getDynamicValue(thread)) {
            v_properties = conses_high.putf(v_properties, (SubLObject)plausibility_utilities.$kw14$JUSTIFY_, (SubLObject)plausibility_utilities.T);
        }
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        SubLObject timed_outP = (SubLObject)plausibility_utilities.NIL;
        final SubLObject start_time = Time.get_internal_real_time();
        SubLObject actual_time = (SubLObject)plausibility_utilities.NIL;
        final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
            try {
                subl_macro_promotions.$within_with_timeout$.bind((SubLObject)plausibility_utilities.T, thread);
                SubLObject timer = (SubLObject)plausibility_utilities.NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        subl_macro_promotions.$with_timeout_nesting_depth$.bind(Numbers.add((SubLObject)plausibility_utilities.ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = subl_macro_promotions.with_timeout_start_timer(max_time, tag);
                        final SubLObject _prev_bind_0_$2 = sdc.$ignoring_sdcP$.currentBinding(thread);
                        try {
                            sdc.$ignoring_sdcP$.bind((SubLObject)plausibility_utilities.T, thread);
                            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)plausibility_utilities.EIGHT_INTEGER), thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)plausibility_utilities.T, thread);
                                final SubLObject local_state;
                                final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
                                final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                    try {
                                        thread.resetMultipleValues();
                                        final SubLObject plausibility_factor_$5 = implausible_sentenceP_recursive(sentence, mt, justifyP, v_properties, depth);
                                        final SubLObject justification_$6 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        plausibility_factor = plausibility_factor_$5;
                                        justification = justification_$6;
                                        if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw19$SUPPRESS_PLAUSIBLE_NART_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && !percent_cutoff.numLE(plausibility_utilities.$plausibility_factor_splitting_hairs_cutoff$.getDynamicValue(thread))) {
                                            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                                            try {
                                                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)plausibility_utilities.$sym20$RELEVANT_MT_IS_GENL_MT, thread);
                                                mt_relevance_macros.$mt$.bind(mt, thread);
                                                thread.resetMultipleValues();
                                                final SubLObject plausibility_factor_$6 = plausible_narts.plausibility_of_sentence(sentence, justifyP, mt);
                                                final SubLObject justification_$7 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                plausibility_factor = plausibility_factor_$6;
                                                justification = justification_$7;
                                            }
                                            finally {
                                                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$8, thread);
                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            if (plausibility_factor.isNumber() && plausibility_factor.numLE(plausibility_utilities.$plausibility_factor_splitting_hairs_cutoff$.getDynamicValue(thread))) {
                                                plausibility_factor = Numbers.add((SubLObject)plausibility_utilities.$float3$0_01, plausibility_utilities.$plausibility_factor_splitting_hairs_cutoff$.getDynamicValue(thread));
                                            }
                                        }
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)plausibility_utilities.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                }
                                finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                            finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$3, thread);
                            }
                        }
                        finally {
                            sdc.$ignoring_sdcP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)plausibility_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        subl_macro_promotions.with_timeout_stop_timer(timer);
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
        }
        finally {
            thread.throwStack.pop();
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            plausibility_factor = plausibility_utilities.$plausibility_factor_completely_plausible$.getDynamicValue(thread);
        }
        actual_time = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(numeric_date_utilities.elapsed_internal_real_time(start_time, Time.get_internal_real_time()));
        if (plausibility_utilities.NIL != get_implausibility_property((SubLObject)plausibility_utilities.$kw21$GATHER_STATS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.$implausibility_stats_table$.getDynamicValue(thread).isHashtable()) {
            if (plausibility_utilities.NIL != timed_outP || (max_time.isNumber() && actual_time.isNumber() && actual_time.numG(max_time))) {
                hash_table_utilities.cinc_hash((SubLObject)plausibility_utilities.$kw22$TIMED_OUT_, plausibility_utilities.$implausibility_stats_table$.getDynamicValue(thread), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
            }
            else if (plausibility_factor.numL(percent_cutoff)) {
                hash_table_utilities.cinc_hash((SubLObject)plausibility_utilities.$kw23$IMPLAUSIBLE_, plausibility_utilities.$implausibility_stats_table$.getDynamicValue(thread), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
            }
            else {
                hash_table_utilities.cinc_hash((SubLObject)plausibility_utilities.$kw24$PLAUSIBLE_, plausibility_utilities.$implausibility_stats_table$.getDynamicValue(thread), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
            }
        }
        if (plausibility_utilities.NIL != plausibility_utilities.$debug_implausibilityP$.getDynamicValue(thread) && plausibility_utilities.NIL == arguments.hl_justification_p(justification)) {
            format_nil.print_one_per_line(justification, (SubLObject)plausibility_utilities.UNPROVIDED);
            Errors.sublisp_break((SubLObject)plausibility_utilities.$str25$Bad_justification_, plausibility_utilities.EMPTY_SUBL_OBJECT_ARRAY);
        }
        if (plausibility_utilities.NIL != get_implausibility_property((SubLObject)plausibility_utilities.$kw26$PERCENT_CLIPPING_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && percent_cutoff.isNumber() && plausibility_factor.isNumber() && plausibility_factor.numLE(percent_cutoff)) {
            plausibility_factor = plausibility_utilities.$plausibility_factor_completely_implausible$.getDynamicValue(thread);
        }
        if (plausibility_utilities.NIL != get_implausibility_property((SubLObject)plausibility_utilities.$kw27$RETURN_BOOLEAN_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_factor.isNumber()) {
            plausibility_factor = Numbers.numL(plausibility_factor, percent_cutoff);
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 9671L)
    public static SubLObject implausible_nautP(final SubLObject naut, SubLObject mt, SubLObject v_properties, SubLObject depth) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = plausibility_utilities.$default_plausibility_check_mt$.getDynamicValue();
        }
        if (v_properties == plausibility_utilities.UNPROVIDED) {
            v_properties = (SubLObject)plausibility_utilities.NIL;
        }
        if (depth == plausibility_utilities.UNPROVIDED) {
            depth = (SubLObject)plausibility_utilities.ZERO_INTEGER;
        }
        return implausible_sentenceP(naut, mt, v_properties, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 9838L)
    public static SubLObject get_implausibility_property(final SubLObject property, final SubLObject v_properties, SubLObject v_default) {
        if (v_default == plausibility_utilities.UNPROVIDED) {
            v_default = (SubLObject)plausibility_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = v_default;
        if (plausibility_utilities.T == v_properties) {
            return (SubLObject)((property == plausibility_utilities.$kw14$JUSTIFY_) ? plausibility_utilities.T : v_default);
        }
        if (plausibility_utilities.NIL != list_utilities.property_list_p(v_properties)) {
            result = conses_high.getf(v_properties, property, result);
        }
        if (plausibility_utilities.NIL != list_utilities.property_list_p(plausibility_utilities.$implausibility_override_properties$.getDynamicValue(thread))) {
            result = conses_high.getf(plausibility_utilities.$implausibility_override_properties$.getDynamicValue(thread), property, result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 10387L)
    public static SubLObject implausible_sentenceP_recursive(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plausibility_utilities.NIL != cycl_grammar.cycl_nat_p(sentence)) {
            return implausible_nautP_recursive(sentence, mt, justifyP, v_properties, depth);
        }
        if (plausibility_utilities.NIL == el_utilities.possibly_sentence_p(sentence)) {
            return Values.values((SubLObject)plausibility_utilities.NIL, (SubLObject)plausibility_utilities.NIL);
        }
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == plausibility_factor) {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$13 = implausible_sentence_wrt_wff(sentence, mt, justifyP, (SubLObject)plausibility_utilities.$kw28$EAGER, v_properties);
            final SubLObject justification_$14 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$13;
            justification = justification_$14;
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            final SubLObject depth_increment = (SubLObject)((plausibility_utilities.NIL != el_utilities.el_formula_with_operator_p(sentence, plausibility_utilities.$const29$equalSymbols) || plausibility_utilities.NIL != el_utilities.el_formula_with_operator_p(sentence, plausibility_utilities.$const30$equals) || plausibility_utilities.NIL != el_utilities.el_conjunction_p(sentence)) ? plausibility_utilities.ZERO_INTEGER : plausibility_utilities.ONE_INTEGER);
            if (plausibility_utilities.NIL == plausibility_factor) {
                SubLObject csome_list_var = sentence;
                SubLObject arg = (SubLObject)plausibility_utilities.NIL;
                arg = csome_list_var.first();
                while (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != csome_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject plausibility_factor_$14 = implausible_sentenceP_recursive(arg, mt, justifyP, v_properties, Numbers.add(depth, depth_increment));
                    final SubLObject justification_$15 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    plausibility_factor = plausibility_factor_$14;
                    justification = justification_$15;
                    csome_list_var = csome_list_var.rest();
                    arg = csome_list_var.first();
                }
            }
        }
        if (plausibility_utilities.NIL != get_implausibility_property((SubLObject)plausibility_utilities.$kw31$FORCE_GENLS_TRUTH_CHECK_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != el_utilities.el_formula_with_operator_p(sentence, plausibility_utilities.$const32$genls)) {
            SubLObject v_genls = (SubLObject)plausibility_utilities.NIL;
            SubLObject col1 = (SubLObject)plausibility_utilities.NIL;
            SubLObject col2 = (SubLObject)plausibility_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(sentence, sentence, (SubLObject)plausibility_utilities.$list33);
            v_genls = sentence.first();
            SubLObject current = sentence.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, (SubLObject)plausibility_utilities.$list33);
            col1 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, (SubLObject)plausibility_utilities.$list33);
            col2 = current.first();
            current = current.rest();
            if (plausibility_utilities.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$15 = implausible_genlsP(col1, col2, mt, justifyP, depth);
                final SubLObject justification_$16 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$15;
                justification = justification_$16;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(sentence, (SubLObject)plausibility_utilities.$list33);
            }
        }
        if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != el_utilities.el_formula_with_operator_p(sentence, plausibility_utilities.$const34$isa)) {
            SubLObject v_isa = (SubLObject)plausibility_utilities.NIL;
            SubLObject inst = (SubLObject)plausibility_utilities.NIL;
            SubLObject col3 = (SubLObject)plausibility_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(sentence, sentence, (SubLObject)plausibility_utilities.$list35);
            v_isa = sentence.first();
            SubLObject current = sentence.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, (SubLObject)plausibility_utilities.$list35);
            inst = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, sentence, (SubLObject)plausibility_utilities.$list35);
            col3 = current.first();
            current = current.rest();
            if (plausibility_utilities.NIL == current) {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$16 = implausible_isaP(inst, col3, mt, justifyP, depth);
                final SubLObject justification_$17 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$16;
                justification = justification_$17;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(sentence, (SubLObject)plausibility_utilities.$list35);
            }
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            SubLObject predicate = cycl_utilities.formula_operator(sentence);
            predicate = possibly_find_nart(predicate);
            SubLObject argnum = (SubLObject)plausibility_utilities.ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(sentence, (SubLObject)plausibility_utilities.$kw36$IGNORE);
            SubLObject rest;
            SubLObject arg2;
            for (rest = (SubLObject)plausibility_utilities.NIL, rest = args; plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != rest; rest = rest.rest()) {
                arg2 = rest.first();
                argnum = Numbers.add(argnum, (SubLObject)plausibility_utilities.ONE_INTEGER);
                if (plausibility_utilities.NIL == implausible_admitted_argumentP(arg2, argnum, predicate, mt)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        justification = ConsesLow.append(justification, hl_justify_asent_fast(el_utilities.make_negation(el_utilities.make_ternary_formula(plausibility_utilities.$const37$admittedArgument, arg2, argnum, predicate)), mt));
                    }
                }
            }
            argnum = (SubLObject)plausibility_utilities.ZERO_INTEGER;
            args = cycl_utilities.formula_args(sentence, (SubLObject)plausibility_utilities.$kw36$IGNORE);
            for (rest = (SubLObject)plausibility_utilities.NIL, rest = args; plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != rest; rest = rest.rest()) {
                arg2 = rest.first();
                argnum = Numbers.add(argnum, (SubLObject)plausibility_utilities.ONE_INTEGER);
                if (plausibility_utilities.NIL == implausible_admitted_argument_to_formulaP(arg2, argnum, predicate, sentence, mt)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        justification = ConsesLow.append(justification, hl_justify_asent_fast(el_utilities.make_negation(el_utilities.make_ternary_formula(plausibility_utilities.$const37$admittedArgument, arg2, argnum, predicate)), mt));
                    }
                }
            }
        }
        final SubLObject _prev_bind_0 = czer_vars.$simplify_contradictionsP$.currentBinding(thread);
        try {
            czer_vars.$simplify_contradictionsP$.bind((SubLObject)plausibility_utilities.T, thread);
            final SubLObject simplification = simplifier.fast_simplify_cycl_sentence(sentence, mt, (SubLObject)plausibility_utilities.UNPROVIDED);
            if (plausibility_utilities.$const38$False.eql(simplification)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_inter_sentential_contradiction$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    justification = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)plausibility_utilities.$kw39$OPAQUE, el_utilities.make_binary_formula(plausibility_utilities.$const40$wffViolation, sentence, (SubLObject)plausibility_utilities.$str41$Sentence_contains_contradictory_c), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED));
                }
            }
        }
        finally {
            czer_vars.$simplify_contradictionsP$.rebind(_prev_bind_0, thread);
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$17 = implausible_sentence_wrt_wff(sentence, mt, justifyP, (SubLObject)plausibility_utilities.$kw42$LAZY, v_properties);
            final SubLObject justification_$18 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$17;
            justification = justification_$18;
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$18 = implausible_sentence_wrt_variable_argumentsP(sentence, mt, justifyP, v_properties);
            final SubLObject justification_$19 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$18;
            justification = justification_$19;
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 14056L)
    public static SubLObject implausible_nautP_recursive(final SubLObject v_object, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plausibility_utilities.NIL == narts_high.naut_p(v_object)) {
            return Values.values((SubLObject)plausibility_utilities.NIL, (SubLObject)plausibility_utilities.NIL);
        }
        final SubLObject functor = cycl_utilities.naut_functor(v_object);
        final SubLObject functor_categories = categorize_subcollection_predicate(functor);
        final SubLObject argnum = (SubLObject)((plausibility_utilities.$kw43$FROM == conses_high.getf(functor_categories, (SubLObject)plausibility_utilities.$kw44$RELATION_DIRECTION, (SubLObject)plausibility_utilities.UNPROVIDED)) ? plausibility_utilities.ONE_INTEGER : plausibility_utilities.TWO_INTEGER);
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == plausibility_factor) {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$25 = implausible_term_wrt_wft(v_object, mt, justifyP, (SubLObject)plausibility_utilities.$kw28$EAGER, v_properties);
            final SubLObject justification_$26 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$25;
            justification = justification_$26;
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            if (plausibility_utilities.T == conses_high.getf(functor_categories, (SubLObject)plausibility_utilities.$kw45$COL_ARG, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.naut_args(v_object, (SubLObject)plausibility_utilities.UNPROVIDED);
                SubLObject col_arg = (SubLObject)plausibility_utilities.NIL;
                SubLObject pred = (SubLObject)plausibility_utilities.NIL;
                SubLObject type = (SubLObject)plausibility_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list46);
                col_arg = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list46);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list46);
                type = current.first();
                current = current.rest();
                if (plausibility_utilities.NIL == current) {
                    if (conses_high.getf(functor_categories, (SubLObject)plausibility_utilities.$kw47$ARG_ORDER, (SubLObject)plausibility_utilities.UNPROVIDED) == plausibility_utilities.$kw48$TYPE_COL_PRED) {
                        final SubLObject arg1 = col_arg;
                        final SubLObject arg2 = pred;
                        final SubLObject arg3 = type;
                        col_arg = arg2;
                        type = arg1;
                        pred = arg3;
                    }
                    col_arg = possibly_find_nart(col_arg);
                    pred = possibly_find_nart(pred);
                    type = possibly_find_nart(type);
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$26 = implausible_typeP(col_arg, mt, justifyP);
                        final SubLObject justification_$27 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$26;
                        justification = justification_$27;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$27 = implausible_typeP(type, mt, justifyP);
                        final SubLObject justification_$28 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$27;
                        justification = justification_$28;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$28 = implausible_col_wrt_arg_isa_constraintP(pred, misc_utilities.other_binary_arg(argnum), col_arg, mt, justifyP);
                        final SubLObject justification_$29 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$28;
                        justification = justification_$29;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$29 = implausible_col_wrt_arg_isa_constraintP(pred, argnum, type, mt, justifyP);
                        final SubLObject justification_$30 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$29;
                        justification = justification_$30;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$30 = implausible_col_wrt_arg_sometimes_isa_constraintP(pred, argnum, type, mt, justifyP);
                        final SubLObject justification_$31 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$30;
                        justification = justification_$31;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL == plausibility_factor) {
                        SubLObject csome_list_var = possible_naut_genls(col_arg);
                        SubLObject col = (SubLObject)plausibility_utilities.NIL;
                        col = csome_list_var.first();
                        while (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != csome_list_var) {
                            if (plausibility_utilities.NIL == plausibility_factor) {
                                thread.resetMultipleValues();
                                final SubLObject plausibility_factor_$31 = implausible_col_wrt_implied_argn_type_requirements_for_predP(pred, argnum, col, type, mt, justifyP);
                                final SubLObject justification_$32 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                plausibility_factor = plausibility_factor_$31;
                                justification = justification_$32;
                            }
                            if (plausibility_utilities.NIL == plausibility_factor) {
                                thread.resetMultipleValues();
                                final SubLObject plausibility_factor_$32 = implausible_col_wrt_implied_argn_type_restrictions_for_predP(pred, argnum, col, type, mt, justifyP);
                                final SubLObject justification_$33 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                plausibility_factor = plausibility_factor_$32;
                                justification = justification_$33;
                            }
                            csome_list_var = csome_list_var.rest();
                            col = csome_list_var.first();
                        }
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$33 = implausible_col_wrt_typical_volumeP(pred, argnum, col_arg, type, mt, justifyP);
                        final SubLObject justification_$34 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$33;
                        justification = justification_$34;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plausibility_utilities.$list46);
                }
            }
            else if (plausibility_utilities.NIL != functor_categories && plausibility_utilities.NIL == conses_high.getf(functor_categories, (SubLObject)plausibility_utilities.$kw45$COL_ARG, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.naut_args(v_object, (SubLObject)plausibility_utilities.UNPROVIDED);
                SubLObject col_arg = (SubLObject)plausibility_utilities.NIL;
                SubLObject pred = (SubLObject)plausibility_utilities.NIL;
                SubLObject thing = (SubLObject)plausibility_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list49);
                col_arg = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list49);
                pred = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list49);
                thing = current.first();
                current = current.rest();
                if (plausibility_utilities.NIL == current) {
                    col_arg = possibly_find_nart(col_arg);
                    pred = possibly_find_nart(pred);
                    thing = possibly_find_nart(thing);
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$34 = implausible_typeP(col_arg, mt, justifyP);
                        final SubLObject justification_$35 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$34;
                        justification = justification_$35;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$35 = implausible_col_wrt_arg_isa_constraintP(pred, misc_utilities.other_binary_arg(argnum), col_arg, mt, justifyP);
                        final SubLObject justification_$36 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$35;
                        justification = justification_$36;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$36 = implausible_thing_wrt_arg_isa_constraintP(pred, argnum, thing, mt, justifyP);
                        final SubLObject justification_$37 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$36;
                        justification = justification_$37;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$37 = implausible_thing_wrt_arg_sometimes_isa_constraintP(pred, argnum, thing, mt, justifyP);
                        final SubLObject justification_$38 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$37;
                        justification = justification_$38;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        final SubLObject cols = possible_naut_genls(col_arg);
                        if (plausibility_utilities.NIL == plausibility_factor) {
                            SubLObject csome_list_var2 = cols;
                            SubLObject col2 = (SubLObject)plausibility_utilities.NIL;
                            col2 = csome_list_var2.first();
                            while (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != csome_list_var2) {
                                if (plausibility_utilities.NIL == plausibility_factor) {
                                    thread.resetMultipleValues();
                                    final SubLObject plausibility_factor_$38 = implausible_thing_wrt_implied_argn_type_requirements_for_predP(pred, argnum, col2, thing, mt, justifyP);
                                    final SubLObject justification_$39 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    plausibility_factor = plausibility_factor_$38;
                                    justification = justification_$39;
                                }
                                if (plausibility_utilities.NIL == plausibility_factor) {
                                    thread.resetMultipleValues();
                                    final SubLObject plausibility_factor_$39 = implausible_thing_wrt_implied_argn_type_restrictions_for_predP(pred, argnum, col2, thing, mt, justifyP);
                                    final SubLObject justification_$40 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    plausibility_factor = plausibility_factor_$39;
                                    justification = justification_$40;
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                col2 = csome_list_var2.first();
                            }
                        }
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$40 = implausible_col_wrt_genls_pred_disjointnessP(pred, argnum, col_arg, thing, mt, justifyP);
                        final SubLObject justification_$41 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$40;
                        justification = justification_$41;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$41 = implausible_col_wrt_isa_pred_disjointnessP(pred, argnum, col_arg, thing, mt, justifyP);
                        final SubLObject justification_$42 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$41;
                        justification = justification_$42;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plausibility_utilities.$list49);
                }
            }
            else if (plausibility_utilities.NIL != kb_utilities.kbeq(functor, plausibility_utilities.$const50$CollectionIntersection2Fn)) {
                SubLObject current;
                final SubLObject datum = current = cycl_utilities.naut_args(v_object, (SubLObject)plausibility_utilities.UNPROVIDED);
                SubLObject col3 = (SubLObject)plausibility_utilities.NIL;
                SubLObject col4 = (SubLObject)plausibility_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list51);
                col3 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list51);
                col4 = current.first();
                current = current.rest();
                if (plausibility_utilities.NIL == current) {
                    col3 = possibly_find_nart(col3);
                    col4 = possibly_find_nart(col4);
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$42 = implausible_typeP(col3, mt, justifyP);
                        final SubLObject justification_$43 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$42;
                        justification = justification_$43;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$43 = implausible_typeP(col4, mt, justifyP);
                        final SubLObject justification_$44 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$43;
                        justification = justification_$44;
                    }
                    if (plausibility_utilities.NIL == plausibility_factor) {
                        thread.resetMultipleValues();
                        final SubLObject plausibility_factor_$44 = implausible_intersection_of_two_colsP(col3, col4, mt, justifyP);
                        final SubLObject justification_$45 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        plausibility_factor = plausibility_factor_$44;
                        justification = justification_$45;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plausibility_utilities.$list51);
                }
            }
            else if (plausibility_utilities.NIL != kb_utilities.kbeq(functor, plausibility_utilities.$const52$CollectionUnionFn)) {
                SubLObject cols2 = el_utilities.el_set_items(cycl_utilities.naut_arg1(v_object, (SubLObject)plausibility_utilities.UNPROVIDED));
                cols2 = Mapping.mapcar((SubLObject)plausibility_utilities.$sym53$POSSIBLY_FIND_NART, cols2);
                if (plausibility_utilities.NIL == plausibility_factor) {
                    thread.resetMultipleValues();
                    final SubLObject plausibility_factor_$45 = implausible_union_of_colsP(cols2, mt, justifyP);
                    final SubLObject justification_$46 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    plausibility_factor = plausibility_factor_$45;
                    justification = justification_$46;
                }
            }
            else {
                SubLObject functor_$67 = cycl_utilities.formula_operator(v_object);
                functor_$67 = possibly_find_nart(functor_$67);
                SubLObject argnum_$68 = (SubLObject)plausibility_utilities.ZERO_INTEGER;
                SubLObject args = cycl_utilities.formula_args(v_object, (SubLObject)plausibility_utilities.$kw36$IGNORE);
                SubLObject rest;
                SubLObject arg4;
                for (rest = (SubLObject)plausibility_utilities.NIL, rest = args; plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != rest; rest = rest.rest()) {
                    arg4 = rest.first();
                    argnum_$68 = Numbers.add(argnum_$68, (SubLObject)plausibility_utilities.ONE_INTEGER);
                    if (plausibility_utilities.NIL == implausible_admitted_argumentP(arg4, argnum_$68, functor_$67, mt)) {
                        plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
                        if (plausibility_utilities.NIL != justifyP) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast(el_utilities.make_negation(el_utilities.make_ternary_formula(plausibility_utilities.$const37$admittedArgument, arg4, argnum_$68, functor_$67)), mt));
                        }
                    }
                }
                SubLObject argnum_$69 = (SubLObject)plausibility_utilities.ZERO_INTEGER;
                args = cycl_utilities.formula_args(v_object, (SubLObject)plausibility_utilities.$kw36$IGNORE);
                for (rest = (SubLObject)plausibility_utilities.NIL, rest = args; plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != rest; rest = rest.rest()) {
                    arg4 = rest.first();
                    argnum_$69 = Numbers.add(argnum_$69, (SubLObject)plausibility_utilities.ONE_INTEGER);
                    if (plausibility_utilities.NIL == implausible_admitted_argument_to_formulaP(arg4, argnum_$69, functor_$67, v_object, mt)) {
                        plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
                        if (plausibility_utilities.NIL != justifyP) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast(el_utilities.make_negation(el_utilities.make_ternary_formula(plausibility_utilities.$const37$admittedArgument, arg4, argnum_$69, functor_$67)), mt));
                        }
                    }
                }
            }
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            final SubLObject args2 = cycl_utilities.formula_args(v_object, (SubLObject)plausibility_utilities.$kw36$IGNORE);
            SubLObject rest2;
            SubLObject arg5;
            SubLObject sub_plausibility_factor;
            SubLObject sub_justification;
            for (rest2 = (SubLObject)plausibility_utilities.NIL, rest2 = args2; plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != rest2; rest2 = rest2.rest()) {
                arg5 = rest2.first();
                thread.resetMultipleValues();
                sub_plausibility_factor = implausible_sentenceP_recursive(arg5, mt, justifyP, v_properties, Numbers.add(depth, (SubLObject)plausibility_utilities.ONE_INTEGER));
                sub_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (plausibility_utilities.NIL != sub_plausibility_factor) {
                    plausibility_factor = sub_plausibility_factor;
                    justification = ConsesLow.append(justification, sub_justification);
                }
            }
        }
        if (plausibility_utilities.NIL == plausibility_factor) {
            thread.resetMultipleValues();
            final SubLObject plausibility_factor_$46 = implausible_term_wrt_wft(v_object, mt, justifyP, (SubLObject)plausibility_utilities.$kw42$LAZY, v_properties);
            final SubLObject justification_$47 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            plausibility_factor = plausibility_factor_$46;
            justification = justification_$47;
        }
        return Values.values(plausibility_factor, list_utilities.remove_duplicates_sorted(justification, (SubLObject)plausibility_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 21218L)
    public static SubLObject categorize_subcollection_predicate_internal(final SubLObject pred) {
        return (SubLObject)(pred.eql(plausibility_utilities.$const55$SubcollectionOfWithRelationToType) ? plausibility_utilities.$list56 : (pred.eql(plausibility_utilities.$const57$SubcollectionOfWithRelationFromTy) ? plausibility_utilities.$list58 : (pred.eql(plausibility_utilities.$const59$SubcollectionOfWithoutRelationToT) ? plausibility_utilities.$list60 : (pred.eql(plausibility_utilities.$const61$SubcollectionOfWithoutRelationFro) ? plausibility_utilities.$list62 : (pred.eql(plausibility_utilities.$const63$SitTypeSpecWithTypeRestrictionOnR) ? plausibility_utilities.$list64 : (pred.eql(plausibility_utilities.$const65$SubcollectionOfWithRelationToFn) ? plausibility_utilities.$list66 : (pred.eql(plausibility_utilities.$const67$SubcollectionOfWithRelationFromFn) ? plausibility_utilities.$list68 : (pred.eql(plausibility_utilities.$const69$SubcollectionOfWithoutRelationToF) ? plausibility_utilities.$list70 : (pred.eql(plausibility_utilities.$const71$SubcollectionOfWithoutRelationFro) ? plausibility_utilities.$list72 : (pred.eql(plausibility_utilities.$const73$UsingAForFn) ? plausibility_utilities.$list74 : plausibility_utilities.NIL))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 21218L)
    public static SubLObject categorize_subcollection_predicate(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == v_memoization_state) {
            return categorize_subcollection_predicate_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)plausibility_utilities.$sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE, (SubLObject)plausibility_utilities.UNPROVIDED);
        if (plausibility_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)plausibility_utilities.$sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE, (SubLObject)plausibility_utilities.ONE_INTEGER, (SubLObject)plausibility_utilities.NIL, (SubLObject)plausibility_utilities.EQ, (SubLObject)plausibility_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)plausibility_utilities.$sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(categorize_subcollection_predicate_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, (SubLObject)plausibility_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 22747L)
    public static SubLObject possibly_find_nart(final SubLObject v_object) {
        final SubLObject possible_nart = (SubLObject)((plausibility_utilities.NIL != el_utilities.possibly_naut_p(v_object) && plausibility_utilities.NIL != isa.isa_in_any_mtP(cycl_utilities.el_formula_operator(v_object), plausibility_utilities.$const75$ReifiableFunction)) ? narts_high.find_nart(v_object) : plausibility_utilities.NIL);
        return (plausibility_utilities.NIL != possible_nart) ? possible_nart : v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 23016L)
    public static SubLObject possible_naut_genls(final SubLObject col) {
        return (SubLObject)((plausibility_utilities.NIL != narts_high.naut_p(col)) ? genls.min_cols(genls.naut_genls(col, (SubLObject)plausibility_utilities.UNPROVIDED), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED) : ConsesLow.list(col));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 23136L)
    public static SubLObject implausible_sentence_wrt_variable_argumentsP(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw76$SUPPRESS_WFF_CHECKS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw77$SUPPRESS_WF_CHECKS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL == cyclifier.variable_arguments_okP(sentence, mt)) {
            plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
            if (plausibility_utilities.NIL != plausibility_utilities.$debug_implausibility_wf_checksP$.getDynamicValue(thread)) {
                PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str78$__implausible_sentence_wrt_variab, sentence);
            }
            if (plausibility_utilities.NIL != justifyP) {
                justification = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)plausibility_utilities.$kw39$OPAQUE, el_utilities.make_binary_formula(plausibility_utilities.$const40$wffViolation, sentence, (SubLObject)plausibility_utilities.$str79$Variable_types_are_disjoint_), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED));
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 24038L)
    public static SubLObject implausible_term_wrt_wft(final SubLObject v_term, final SubLObject mt, final SubLObject justifyP, final SubLObject check_type, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw80$SUPPRESS_WFT_CHECKS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw77$SUPPRESS_WF_CHECKS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && check_type.eql(get_implausibility_property((SubLObject)plausibility_utilities.$kw81$WFT_CHECK_TYPE, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED))) {
            final SubLObject _prev_bind_0 = at_vars.$at_check_not_sdcP$.currentBinding(thread);
            try {
                at_vars.$at_check_not_sdcP$.bind((SubLObject)plausibility_utilities.NIL, thread);
                if (plausibility_utilities.NIL == wff.el_wft_fast_in_mtP(v_term, mt)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != plausibility_utilities.$debug_implausibility_wf_checksP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str82$__implausible_term_wrt_wft___S__, v_term);
                    }
                    if (plausibility_utilities.NIL != justifyP) {
                        final SubLObject string = wff.explanation_of_why_not_wft(v_term, mt, (SubLObject)plausibility_utilities.$list83);
                        justification = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)plausibility_utilities.$kw39$OPAQUE, el_utilities.make_binary_formula(plausibility_utilities.$const40$wffViolation, v_term, string), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED));
                    }
                }
            }
            finally {
                at_vars.$at_check_not_sdcP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 25051L)
    public static SubLObject implausible_sentence_wrt_wff(final SubLObject sentence, final SubLObject mt, final SubLObject justifyP, final SubLObject check_type, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw76$SUPPRESS_WFF_CHECKS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL == get_implausibility_property((SubLObject)plausibility_utilities.$kw77$SUPPRESS_WF_CHECKS_, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED) && check_type.eql(get_implausibility_property((SubLObject)plausibility_utilities.$kw84$WFF_CHECK_TYPE, v_properties, (SubLObject)plausibility_utilities.UNPROVIDED))) {
            final SubLObject _prev_bind_0 = at_vars.$at_check_not_sdcP$.currentBinding(thread);
            try {
                at_vars.$at_check_not_sdcP$.bind((SubLObject)plausibility_utilities.NIL, thread);
                if (plausibility_utilities.NIL == wff.el_lenient_wff_assertibleP(sentence, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_non_wff$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != plausibility_utilities.$debug_implausibility_wf_checksP$.getDynamicValue(thread)) {
                        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str85$__implausible_sentence_wrt_wff___, sentence);
                    }
                    if (plausibility_utilities.NIL != justifyP) {
                        final SubLObject string = wff.explanation_of_why_not_lenient_wff_assert(sentence, mt, (SubLObject)plausibility_utilities.$list83);
                        justification = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)plausibility_utilities.$kw39$OPAQUE, el_utilities.make_binary_formula(plausibility_utilities.$const40$wffViolation, sentence, string), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED));
                    }
                }
            }
            finally {
                at_vars.$at_check_not_sdcP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 26112L)
    public static SubLObject implausible_genlsP(SubLObject col1, SubLObject col2, final SubLObject mt, final SubLObject justifyP, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(col1, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col2, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            col1 = possibly_find_nart(col1);
            col2 = possibly_find_nart(col2);
            if (plausibility_utilities.NIL == plausibility_factor) {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$72 = implausible_typeP(col1, mt, justifyP);
                final SubLObject justification_$73 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$72;
                justification = justification_$73;
            }
            if (plausibility_utilities.NIL == plausibility_factor) {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$73 = implausible_typeP(col2, mt, justifyP);
                final SubLObject justification_$74 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$73;
                justification = justification_$74;
            }
            if (plausibility_utilities.NIL == plausibility_factor) {
                final SubLObject col1_order = fort_types_interface.collection_order(col1);
                final SubLObject col2_order = fort_types_interface.collection_order(col2);
                if (col1_order.isInteger() && col2_order.isInteger() && !col1_order.numE(col2_order)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, col1, col2)), mt));
                    }
                }
            }
            if (plausibility_utilities.NIL == plausibility_factor && depth.numE((SubLObject)plausibility_utilities.ZERO_INTEGER)) {
                final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
                try {
                    sdc.$ignoring_sdcP$.bind((SubLObject)plausibility_utilities.T, thread);
                    if (plausibility_utilities.NIL != genls.not_genlP(col1, col2, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                        plausibility_factor = plausibility_utilities.$plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
                        if (plausibility_utilities.NIL != justifyP) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, col1, col2)), mt));
                        }
                    }
                }
                finally {
                    sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 27627L)
    public static SubLObject implausible_isaP(SubLObject inst, SubLObject col, final SubLObject mt, final SubLObject justifyP, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(inst, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            inst = possibly_find_nart(inst);
            col = possibly_find_nart(col);
            if (plausibility_utilities.NIL == plausibility_factor) {
                thread.resetMultipleValues();
                final SubLObject plausibility_factor_$76 = implausible_typeP(col, mt, justifyP);
                final SubLObject justification_$77 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                plausibility_factor = plausibility_factor_$76;
                justification = justification_$77;
            }
            if (plausibility_utilities.NIL == plausibility_factor) {
                final SubLObject inst_order = fort_types_interface.collection_order(inst);
                final SubLObject col_order = fort_types_interface.collection_order(col);
                if (inst_order.isInteger() && col_order.isInteger() && !Numbers.add(inst_order, (SubLObject)plausibility_utilities.ONE_INTEGER).numE(col_order)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.list(plausibility_utilities.$const34$isa, inst, col)), mt));
                    }
                }
            }
            if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != kb_indexing_datastructures.indexed_term_p(inst) && plausibility_utilities.NIL == plausibility_factor) {
                SubLObject csome_list_var = possible_naut_genls(col);
                SubLObject genl = (SubLObject)plausibility_utilities.NIL;
                genl = csome_list_var.first();
                while (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != csome_list_var) {
                    if (plausibility_utilities.NIL != genls.genlP(inst, genl, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                        plausibility_factor = plausibility_utilities.$plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
                        if (plausibility_utilities.NIL != justifyP) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, inst, genl), mt));
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    genl = csome_list_var.first();
                }
            }
            if (plausibility_utilities.NIL == plausibility_factor && depth.numE((SubLObject)plausibility_utilities.ZERO_INTEGER) && plausibility_utilities.NIL != kb_indexing_datastructures.indexed_term_p(col) && plausibility_utilities.NIL == isa.isaP(inst, col, mt, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != isa.not_isaP(inst, col, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_not_isa_or_genls$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.list(plausibility_utilities.$const34$isa, inst, col)), mt));
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 30175L)
    public static SubLObject implausible_typeP(final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            if (plausibility_utilities.NIL == plausibility_factor && (plausibility_utilities.NIL != cycl_grammar.cycl_unrepresented_term_p(type) || plausibility_utilities.NIL != cycl_grammar.cycl_variable_p(type))) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_type_violation$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.listS(plausibility_utilities.$const34$isa, type, (SubLObject)plausibility_utilities.$list87)), mt));
                }
            }
            if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != forts.fort_p(type) && plausibility_utilities.NIL == fort_types_interface.collectionP(type)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_type_violation$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.listS(plausibility_utilities.$const88$quotedIsa, type, (SubLObject)plausibility_utilities.$list89), mt));
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.listS(plausibility_utilities.$const34$isa, type, (SubLObject)plausibility_utilities.$list87)), mt));
                }
            }
            if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != narts_high.naut_p(type) && plausibility_utilities.NIL == isa.nat_isaP(type, plausibility_utilities.$const90$Collection, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_type_violation$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.listS(plausibility_utilities.$const88$quotedIsa, type, (SubLObject)plausibility_utilities.$list91), mt));
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.listS(plausibility_utilities.$const34$isa, type, (SubLObject)plausibility_utilities.$list87)), mt));
                }
            }
            return Values.values(plausibility_factor, justification);
        }
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 31554L)
    public static SubLObject implausible_col_wrt_arg_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            final SubLObject type_isa_constraints = kb_accessors.argn_isa(pred, argnum, mt);
            if (plausibility_utilities.NIL != type_isa_constraints && plausibility_utilities.NIL != disjoint_with.any_disjoint_with_anyP_memoized((SubLObject)ConsesLow.list(type), type_isa_constraints, mt, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_arg_disjointness$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject cdolist_list_var = type_isa_constraints;
                    SubLObject type_isa_constraint = (SubLObject)plausibility_utilities.NIL;
                    type_isa_constraint = cdolist_list_var.first();
                    while (plausibility_utilities.NIL != cdolist_list_var) {
                        if (plausibility_utilities.NIL != disjoint_with.disjoint_withP(type, type_isa_constraint, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const92$argIsa, pred, argnum, type_isa_constraint), mt));
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const93$disjointWith, type, type_isa_constraint), mt));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        type_isa_constraint = cdolist_list_var.first();
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 32420L)
    public static SubLObject implausible_col_wrt_arg_sometimes_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            final SubLObject type_isa_constraints = kb_accessors.argn_sometimes_isa(pred, argnum, mt);
            final SubLObject anytime_mt = hlmt.replace_time_dimension(mt, plausibility_utilities.$const94$AnytimePSC, (SubLObject)plausibility_utilities.UNPROVIDED);
            if (plausibility_utilities.NIL != type_isa_constraints && plausibility_utilities.NIL == genls.all_genlP(type, type_isa_constraints, anytime_mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_arg_violation$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject cdolist_list_var = type_isa_constraints;
                    SubLObject type_isa_constraint = (SubLObject)plausibility_utilities.NIL;
                    type_isa_constraint = cdolist_list_var.first();
                    while (plausibility_utilities.NIL != cdolist_list_var) {
                        if (plausibility_utilities.NIL == genls.genlP(type, type_isa_constraint, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const95$argSometimesIsa, pred, argnum, type_isa_constraint), mt));
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const96$unknownSentence, (SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, type, type_isa_constraint)), anytime_mt));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        type_isa_constraint = cdolist_list_var.first();
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 33409L)
    public static SubLObject implausible_thing_wrt_arg_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(thing, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            final SubLObject thing_isa_constraints = kb_accessors.argn_isa(pred, argnum, mt);
            if (plausibility_utilities.NIL != thing_isa_constraints && plausibility_utilities.NIL != ((plausibility_utilities.NIL != cycl_grammar.cycl_unrepresented_term_p(thing)) ? SubLObjectFactory.makeBoolean(plausibility_utilities.NIL == at_defns.quiet_has_any_typeP(thing, thing_isa_constraints, mt)) : disjoint_with.any_disjoint_with_anyP_memoized(isa.isa(thing, mt, (SubLObject)plausibility_utilities.UNPROVIDED), thing_isa_constraints, mt, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED))) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_arg_disjointness$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject doneP = (SubLObject)plausibility_utilities.NIL;
                    if (plausibility_utilities.NIL == doneP) {
                        SubLObject csome_list_var = thing_isa_constraints;
                        SubLObject thing_isa_constraint = (SubLObject)plausibility_utilities.NIL;
                        thing_isa_constraint = csome_list_var.first();
                        while (plausibility_utilities.NIL == doneP && plausibility_utilities.NIL != csome_list_var) {
                            if (plausibility_utilities.NIL == doneP) {
                                SubLObject csome_list_var_$78 = isa.isa(thing, mt, (SubLObject)plausibility_utilities.UNPROVIDED);
                                SubLObject thing_isa = (SubLObject)plausibility_utilities.NIL;
                                thing_isa = csome_list_var_$78.first();
                                while (plausibility_utilities.NIL == doneP && plausibility_utilities.NIL != csome_list_var_$78) {
                                    if (plausibility_utilities.NIL != disjoint_with.disjoint_withP(thing_isa, thing_isa_constraint, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                                        doneP = (SubLObject)plausibility_utilities.T;
                                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const92$argIsa, pred, argnum, thing_isa_constraint), mt));
                                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const34$isa, thing, thing_isa), mt));
                                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const93$disjointWith, thing_isa, thing_isa_constraint), mt));
                                    }
                                    csome_list_var_$78 = csome_list_var_$78.rest();
                                    thing_isa = csome_list_var_$78.first();
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            thing_isa_constraint = csome_list_var.first();
                        }
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 34657L)
    public static SubLObject implausible_thing_wrt_arg_sometimes_isa_constraintP(final SubLObject pred, final SubLObject argnum, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(thing, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            final SubLObject thing_isa_constraints = kb_accessors.argn_sometimes_isa(pred, argnum, mt);
            final SubLObject anytime_mt = hlmt.replace_time_dimension(mt, plausibility_utilities.$const94$AnytimePSC, (SubLObject)plausibility_utilities.UNPROVIDED);
            if (plausibility_utilities.NIL != thing_isa_constraints && plausibility_utilities.NIL != ((plausibility_utilities.NIL != cycl_grammar.cycl_unrepresented_term_p(thing)) ? SubLObjectFactory.makeBoolean(plausibility_utilities.NIL == at_defns.quiet_has_any_typeP(thing, thing_isa_constraints, anytime_mt)) : SubLObjectFactory.makeBoolean(plausibility_utilities.NIL == isa.all_isaP(thing, thing_isa_constraints, anytime_mt, (SubLObject)plausibility_utilities.UNPROVIDED)))) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_arg_violation$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject cdolist_list_var = thing_isa_constraints;
                    SubLObject thing_isa_constraint = (SubLObject)plausibility_utilities.NIL;
                    thing_isa_constraint = cdolist_list_var.first();
                    while (plausibility_utilities.NIL != cdolist_list_var) {
                        if (plausibility_utilities.NIL == isa.isaP(thing, thing_isa_constraint, anytime_mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const95$argSometimesIsa, pred, argnum, thing_isa_constraint), mt));
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const96$unknownSentence, (SubLObject)ConsesLow.list(plausibility_utilities.$const34$isa, thing, thing_isa_constraint)), anytime_mt));
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        thing_isa_constraint = cdolist_list_var.first();
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 35833L)
    public static SubLObject implausible_col_wrt_implied_argn_type_requirements_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject type_requirements = implied_argn_type_requirements_for_pred(pred, argnum, col, mt, justifyP);
            final SubLObject tr_justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (plausibility_utilities.NIL != genls.any_genlP(type, type_requirements, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject type_requirement = (SubLObject)plausibility_utilities.NIL;
                    SubLObject type_requirement_$79 = (SubLObject)plausibility_utilities.NIL;
                    SubLObject tr_justification = (SubLObject)plausibility_utilities.NIL;
                    SubLObject tr_justification_$80 = (SubLObject)plausibility_utilities.NIL;
                    type_requirement = type_requirements;
                    type_requirement_$79 = type_requirement.first();
                    tr_justification = tr_justifications;
                    tr_justification_$80 = tr_justification.first();
                    while (plausibility_utilities.NIL != tr_justification || plausibility_utilities.NIL != type_requirement) {
                        if (plausibility_utilities.NIL != genls.genlP(type, type_requirement_$79, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                            justification = ConsesLow.append(justification, tr_justification_$80);
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, type, type_requirement_$79), mt));
                        }
                        type_requirement = type_requirement.rest();
                        type_requirement_$79 = type_requirement.first();
                        tr_justification = tr_justification.rest();
                        tr_justification_$80 = tr_justification.first();
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 36724L)
    public static SubLObject implausible_thing_wrt_implied_argn_type_requirements_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(thing, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject type_requirements = implied_argn_type_requirements_for_pred(pred, argnum, col, mt, justifyP);
            final SubLObject tr_justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (plausibility_utilities.NIL != isa.any_isaP(thing, type_requirements, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject type_requirement = (SubLObject)plausibility_utilities.NIL;
                    SubLObject type_requirement_$81 = (SubLObject)plausibility_utilities.NIL;
                    SubLObject tr_justification = (SubLObject)plausibility_utilities.NIL;
                    SubLObject tr_justification_$82 = (SubLObject)plausibility_utilities.NIL;
                    type_requirement = type_requirements;
                    type_requirement_$81 = type_requirement.first();
                    tr_justification = tr_justifications;
                    tr_justification_$82 = tr_justification.first();
                    while (plausibility_utilities.NIL != tr_justification || plausibility_utilities.NIL != type_requirement) {
                        if (plausibility_utilities.NIL != isa.isaP(thing, type_requirement_$81, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                            justification = ConsesLow.append(justification, tr_justification_$82);
                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const34$isa, thing, type_requirement_$81), mt));
                        }
                        type_requirement = type_requirement.rest();
                        type_requirement_$81 = type_requirement.first();
                        tr_justification = tr_justification.rest();
                        tr_justification_$82 = tr_justification.first();
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 37617L)
    public static SubLObject implausible_col_wrt_implied_argn_type_restrictions_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL == el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) || plausibility_utilities.NIL == el_utilities.closedP(col, (SubLObject)plausibility_utilities.UNPROVIDED) || plausibility_utilities.NIL == el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            return (SubLObject)plausibility_utilities.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject type_restrictions = implied_argn_type_restrictions_for_pred(pred, argnum, col, mt, justifyP);
        final SubLObject tr_justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (plausibility_utilities.NIL != genls.any_genlP(type, type_restrictions, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            return (SubLObject)plausibility_utilities.NIL;
        }
        if (plausibility_utilities.NIL == type_restrictions) {
            return (SubLObject)plausibility_utilities.NIL;
        }
        if (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL == genls.any_genlP(type, type_restrictions, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            plausibility_factor = plausibility_utilities.$plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
            if (plausibility_utilities.NIL != justifyP) {
                SubLObject cdolist_list_var = type_restrictions;
                SubLObject type_restriction = (SubLObject)plausibility_utilities.NIL;
                type_restriction = cdolist_list_var.first();
                while (plausibility_utilities.NIL != cdolist_list_var) {
                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const96$unknownSentence, (SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, type, type_restriction)), mt));
                    cdolist_list_var = cdolist_list_var.rest();
                    type_restriction = cdolist_list_var.first();
                }
                cdolist_list_var = tr_justifications;
                SubLObject tr_justification = (SubLObject)plausibility_utilities.NIL;
                tr_justification = cdolist_list_var.first();
                while (plausibility_utilities.NIL != cdolist_list_var) {
                    justification = ConsesLow.append(justification, tr_justification);
                    cdolist_list_var = cdolist_list_var.rest();
                    tr_justification = cdolist_list_var.first();
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 40088L)
    public static SubLObject implausible_thing_wrt_implied_argn_type_restrictions_for_predP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject thing, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(thing, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            thread.resetMultipleValues();
            final SubLObject type_restrictions = implied_argn_type_restrictions_for_pred(pred, argnum, col, mt, justifyP);
            final SubLObject tr_justifications = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (plausibility_utilities.NIL != isa.any_isaP(thing, type_restrictions, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                return (SubLObject)plausibility_utilities.NIL;
            }
            if (plausibility_utilities.NIL == type_restrictions) {
                return (SubLObject)plausibility_utilities.NIL;
            }
            if (plausibility_utilities.NIL == plausibility_factor) {
                thread.resetMultipleValues();
                final SubLObject tweaked_type_restrictions = tweak_implausibility_type_restrictions(type_restrictions, mt);
                final SubLObject tweak_method = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (plausibility_utilities.NIL != constraint_filters.any_not_isaP(tweaked_type_restrictions, thing, mt)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_implied_arg_restriction$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        SubLObject doneP = (SubLObject)plausibility_utilities.NIL;
                        if (plausibility_utilities.NIL == doneP) {
                            SubLObject type_restriction = (SubLObject)plausibility_utilities.NIL;
                            SubLObject type_restriction_$83 = (SubLObject)plausibility_utilities.NIL;
                            SubLObject tr_justification = (SubLObject)plausibility_utilities.NIL;
                            SubLObject tr_justification_$84 = (SubLObject)plausibility_utilities.NIL;
                            type_restriction = tweaked_type_restrictions;
                            type_restriction_$83 = type_restriction.first();
                            tr_justification = tr_justifications;
                            tr_justification_$84 = tr_justification.first();
                            while (plausibility_utilities.NIL == doneP && (plausibility_utilities.NIL != tr_justification || plausibility_utilities.NIL != type_restriction)) {
                                if (plausibility_utilities.NIL != isa.not_isaP(thing, type_restriction_$83, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                                    doneP = (SubLObject)plausibility_utilities.T;
                                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const86$not, (SubLObject)ConsesLow.list(plausibility_utilities.$const34$isa, thing, type_restriction_$83)), mt));
                                    justification = ConsesLow.append(justification, tr_justification_$84);
                                    if (tweak_method == plausibility_utilities.$kw97$MIN_CEILING_COLS) {
                                        SubLObject found_genlsP = (SubLObject)plausibility_utilities.NIL;
                                        if (plausibility_utilities.NIL == found_genlsP) {
                                            SubLObject csome_list_var = type_restrictions;
                                            SubLObject type = (SubLObject)plausibility_utilities.NIL;
                                            type = csome_list_var.first();
                                            while (plausibility_utilities.NIL == found_genlsP && plausibility_utilities.NIL != csome_list_var) {
                                                if (plausibility_utilities.NIL != genls.genlsP(type, type_restriction_$83, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                                                    found_genlsP = (SubLObject)plausibility_utilities.T;
                                                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, type, type_restriction_$83), mt));
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                type = csome_list_var.first();
                                            }
                                        }
                                    }
                                }
                                type_restriction = type_restriction.rest();
                                type_restriction_$83 = type_restriction.first();
                                tr_justification = tr_justification.rest();
                                tr_justification_$84 = tr_justification.first();
                            }
                        }
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 41819L)
    public static SubLObject implausible_col_wrt_genls_pred_disjointnessP(final SubLObject pred, final SubLObject argnum, final SubLObject col_arg, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col_arg, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != forts.fort_p(pred)) {
            final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                sdc.$ignoring_sdcP$.bind((SubLObject)plausibility_utilities.NIL, thread);
                if (plausibility_utilities.NIL != genl_predicates.genl_predP(pred, plausibility_utilities.$const32$genls, mt, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != disjoint_with.disjoint_withP(col_arg, type, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_arg_disjointness$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.listS(plausibility_utilities.$const98$genlPreds, pred, (SubLObject)plausibility_utilities.$list99), mt));
                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const93$disjointWith, col_arg, type), mt));
                    }
                }
            }
            finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 42564L)
    public static SubLObject implausible_col_wrt_isa_pred_disjointnessP(final SubLObject pred, final SubLObject argnum, final SubLObject col_arg, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col_arg, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != forts.fort_p(pred)) {
            final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                sdc.$ignoring_sdcP$.bind((SubLObject)plausibility_utilities.NIL, thread);
                if (argnum.eql((SubLObject)plausibility_utilities.TWO_INTEGER) && plausibility_utilities.NIL != genl_predicates.genl_predP(pred, plausibility_utilities.$const34$isa, mt, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != disjoint_with.disjoint_withP(col_arg, type, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_arg_disjointness$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.listS(plausibility_utilities.$const98$genlPreds, pred, (SubLObject)plausibility_utilities.$list100), mt));
                        justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const93$disjointWith, col_arg, type), mt));
                    }
                }
            }
            finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 43491L)
    public static SubLObject implausible_col_wrt_typical_volumeP(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject type, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(pred, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(type, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != forts.fort_p(pred)) {
            SubLObject arg_order = (SubLObject)plausibility_utilities.NIL;
            if (plausibility_utilities.NIL != genl_predicates.any_genl_predP(pred, plausibility_utilities.$typical_volume_applicable_predicates$.getDynamicValue(thread), mt, (SubLObject)plausibility_utilities.UNPROVIDED) || plausibility_utilities.NIL != genl_predicates.any_genl_inverseP(pred, plausibility_utilities.$typical_volume_applicable_pred_inverses$.getDynamicValue(thread), mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                arg_order = (SubLObject)plausibility_utilities.$kw103$PRED;
            }
            if (plausibility_utilities.NIL != genl_predicates.any_genl_predP(pred, plausibility_utilities.$typical_volume_applicable_pred_inverses$.getDynamicValue(thread), mt, (SubLObject)plausibility_utilities.UNPROVIDED) || plausibility_utilities.NIL != genl_predicates.any_genl_inverseP(pred, plausibility_utilities.$typical_volume_applicable_predicates$.getDynamicValue(thread), mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                arg_order = (SubLObject)plausibility_utilities.$kw104$INVERSE;
            }
            if (plausibility_utilities.NIL != arg_order) {
                final SubLObject cols = possible_naut_genls(type);
                final SubLObject types = possible_naut_genls(col);
                if (plausibility_utilities.NIL == plausibility_factor) {
                    SubLObject csome_list_var = cols;
                    SubLObject this_col = (SubLObject)plausibility_utilities.NIL;
                    this_col = csome_list_var.first();
                    while (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != csome_list_var) {
                        if (plausibility_utilities.NIL == plausibility_factor) {
                            SubLObject csome_list_var_$85 = types;
                            SubLObject this_type = (SubLObject)plausibility_utilities.NIL;
                            this_type = csome_list_var_$85.first();
                            while (plausibility_utilities.NIL == plausibility_factor && plausibility_utilities.NIL != csome_list_var_$85) {
                                final SubLObject tva_sentence = (SubLObject)(((argnum.eql((SubLObject)plausibility_utilities.ONE_INTEGER) && arg_order == plausibility_utilities.$kw103$PRED) || (argnum.eql((SubLObject)plausibility_utilities.TWO_INTEGER) && arg_order == plausibility_utilities.$kw104$INVERSE)) ? el_utilities.make_binary_formula(plausibility_utilities.$const105$typicallyMoreVoluminousThan, this_type, this_col) : (((argnum.eql((SubLObject)plausibility_utilities.ONE_INTEGER) && arg_order == plausibility_utilities.$kw104$INVERSE) || (argnum.eql((SubLObject)plausibility_utilities.TWO_INTEGER) && arg_order == plausibility_utilities.$kw103$PRED)) ? el_utilities.make_binary_formula(plausibility_utilities.$const105$typicallyMoreVoluminousThan, this_col, this_type) : plausibility_utilities.NIL));
                                if (plausibility_utilities.NIL != tva_sentence && plausibility_utilities.NIL != tva_check_cached(tva_sentence, mt)) {
                                    plausibility_factor = plausibility_utilities.$plausibility_factor_typical_volume_violation$.getDynamicValue(thread);
                                    if (plausibility_utilities.NIL != justifyP) {
                                        justification = removal_modules_tva_lookup.tva_justify(tva_sentence, mt);
                                    }
                                }
                                csome_list_var_$85 = csome_list_var_$85.rest();
                                this_type = csome_list_var_$85.first();
                            }
                        }
                        csome_list_var = csome_list_var.rest();
                        this_col = csome_list_var.first();
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 45031L)
    public static SubLObject implausible_intersection_of_two_colsP(final SubLObject col1, final SubLObject col2, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != el_utilities.closedP(col1, (SubLObject)plausibility_utilities.UNPROVIDED) && plausibility_utilities.NIL != el_utilities.closedP(col2, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            final SubLObject cols_1 = possible_naut_genls(col1);
            final SubLObject cols_2 = possible_naut_genls(col2);
            final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
            try {
                sdc.$ignoring_sdcP$.bind((SubLObject)plausibility_utilities.NIL, thread);
                if (plausibility_utilities.NIL != disjoint_with.any_disjoint_with_anyP_memoized(cols_1, cols_2, mt, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                    plausibility_factor = plausibility_utilities.$plausibility_factor_arg_disjointness$.getDynamicValue(thread);
                    if (plausibility_utilities.NIL != justifyP) {
                        final SubLObject doneP = (SubLObject)plausibility_utilities.NIL;
                        if (plausibility_utilities.NIL == doneP) {
                            SubLObject csome_list_var = cols_1;
                            SubLObject this_col_1 = (SubLObject)plausibility_utilities.NIL;
                            this_col_1 = csome_list_var.first();
                            while (plausibility_utilities.NIL == doneP && plausibility_utilities.NIL != csome_list_var) {
                                if (plausibility_utilities.NIL == doneP) {
                                    SubLObject csome_list_var_$86 = cols_2;
                                    SubLObject this_col_2 = (SubLObject)plausibility_utilities.NIL;
                                    this_col_2 = csome_list_var_$86.first();
                                    while (plausibility_utilities.NIL == doneP && plausibility_utilities.NIL != csome_list_var_$86) {
                                        if (plausibility_utilities.NIL != disjoint_with.disjoint_withP(this_col_1, this_col_2, mt, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                                            if (plausibility_utilities.NIL == equals.equalsP(col1, this_col_1, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                                                justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, col1, this_col_1), mt));
                                            }
                                            if (plausibility_utilities.NIL == equals.equalsP(col2, this_col_2, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                                                justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, col2, this_col_2), mt));
                                            }
                                            justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const93$disjointWith, this_col_1, this_col_2), mt));
                                        }
                                        csome_list_var_$86 = csome_list_var_$86.rest();
                                        this_col_2 = csome_list_var_$86.first();
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                this_col_1 = csome_list_var.first();
                            }
                        }
                    }
                }
            }
            finally {
                sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 46109L)
    public static SubLObject implausible_union_of_colsP(final SubLObject cols, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject plausibility_factor = (SubLObject)plausibility_utilities.NIL;
        SubLObject justification = (SubLObject)plausibility_utilities.NIL;
        if (plausibility_utilities.NIL != list_utilities.every_in_list((SubLObject)plausibility_utilities.$sym106$CLOSED_, cols, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            SubLObject check_cols = (SubLObject)plausibility_utilities.NIL;
            SubLObject expanded_cols = (SubLObject)plausibility_utilities.NIL;
            SubLObject cdolist_list_var = cols;
            SubLObject col = (SubLObject)plausibility_utilities.NIL;
            col = cdolist_list_var.first();
            while (plausibility_utilities.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$87 = possible_naut_genls(col);
                SubLObject check_col = (SubLObject)plausibility_utilities.NIL;
                check_col = cdolist_list_var_$87.first();
                while (plausibility_utilities.NIL != cdolist_list_var_$87) {
                    if (plausibility_utilities.NIL == list_utilities.member_kbeqP(col, cols)) {
                        final SubLObject item_var = check_col;
                        if (plausibility_utilities.NIL == conses_high.member(item_var, expanded_cols, Symbols.symbol_function((SubLObject)plausibility_utilities.EQL), Symbols.symbol_function((SubLObject)plausibility_utilities.IDENTITY))) {
                            expanded_cols = (SubLObject)ConsesLow.cons(item_var, expanded_cols);
                        }
                    }
                    final SubLObject item_var = check_col;
                    if (plausibility_utilities.NIL == conses_high.member(item_var, check_cols, Symbols.symbol_function((SubLObject)plausibility_utilities.EQL), Symbols.symbol_function((SubLObject)plausibility_utilities.IDENTITY))) {
                        check_cols = (SubLObject)ConsesLow.cons(item_var, check_cols);
                    }
                    cdolist_list_var_$87 = cdolist_list_var_$87.rest();
                    check_col = cdolist_list_var_$87.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            final SubLObject min_ceiling_cols = genls.min_ceiling_cols(check_cols, (SubLObject)plausibility_utilities.NIL, mt, (SubLObject)plausibility_utilities.UNPROVIDED);
            if (plausibility_utilities.NIL != Sequences.find_if((SubLObject)plausibility_utilities.$sym107$ESOTERIC_TERM_, min_ceiling_cols, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
                plausibility_factor = plausibility_utilities.$plausibility_factor_esoteric_term$.getDynamicValue(thread);
                if (plausibility_utilities.NIL != justifyP) {
                    SubLObject doneP = (SubLObject)plausibility_utilities.NIL;
                    if (plausibility_utilities.NIL == doneP) {
                        SubLObject csome_list_var = min_ceiling_cols;
                        SubLObject min_ceiling_col = (SubLObject)plausibility_utilities.NIL;
                        min_ceiling_col = csome_list_var.first();
                        while (plausibility_utilities.NIL == doneP && plausibility_utilities.NIL != csome_list_var) {
                            if (plausibility_utilities.NIL != esoteric_termP(min_ceiling_col)) {
                                doneP = (SubLObject)plausibility_utilities.T;
                                justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.listS(plausibility_utilities.$const88$quotedIsa, min_ceiling_col, (SubLObject)plausibility_utilities.$list108), mt));
                                SubLObject cdolist_list_var2 = cols;
                                SubLObject col2 = (SubLObject)plausibility_utilities.NIL;
                                col2 = cdolist_list_var2.first();
                                while (plausibility_utilities.NIL != cdolist_list_var2) {
                                    justification = ConsesLow.append(justification, hl_justify_asent_fast((SubLObject)ConsesLow.list(plausibility_utilities.$const32$genls, col2, min_ceiling_col), mt));
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    col2 = cdolist_list_var2.first();
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            min_ceiling_col = csome_list_var.first();
                        }
                    }
                }
            }
        }
        return Values.values(plausibility_factor, justification);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 47168L)
    public static SubLObject esoteric_termP(final SubLObject v_term) {
        return isa.quoted_isa_in_any_mtP(v_term, plausibility_utilities.$const109$EsotericTerm);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 47262L)
    public static SubLObject exoteric_termP(final SubLObject v_term) {
        return isa.quoted_isa_in_any_mtP(v_term, plausibility_utilities.$const110$ExotericTerm);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 47356L)
    public static SubLObject clear_plausibility_caches() {
        Functions.funcall((SubLObject)plausibility_utilities.$sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS);
        Functions.funcall((SubLObject)plausibility_utilities.$sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED);
        Functions.funcall((SubLObject)plausibility_utilities.$sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED);
        Functions.funcall((SubLObject)plausibility_utilities.$sym114$CLEAR_TVA_CHECK_CACHED);
        Functions.funcall((SubLObject)plausibility_utilities.$sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_);
        Functions.funcall((SubLObject)plausibility_utilities.$sym116$CLEAR_DO_TVA_QUERY_TYPE_TYPE);
        Functions.funcall((SubLObject)plausibility_utilities.$sym117$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH);
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 48068L)
    public static SubLObject print_plausibility_cache_sizes() {
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str118$__tweak_implausibility_type_restr, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str120$__implied_argn_type_requirements_, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str122$__implied_argn_type_restrictions_, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str124$__tva_check_cached___A__, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym125$_TVA_CHECK_CACHED_CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym125$_TVA_CHECK_CACHED_CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str126$__implausible_admitted_argument__, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str128$__do_tva_query_type_type___A__, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        PrintLow.format((SubLObject)plausibility_utilities.T, (SubLObject)plausibility_utilities.$str130$__do_tva_query_type_disjoint_with, (SubLObject)((plausibility_utilities.NIL != Symbols.boundp((SubLObject)plausibility_utilities.$sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_)) ? memoization_state.caching_state_size(Symbols.symbol_value((SubLObject)plausibility_utilities.$sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_), (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
    public static SubLObject clear_tweak_implausibility_type_restrictions() {
        final SubLObject cs = plausibility_utilities.$tweak_implausibility_type_restrictions_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
    public static SubLObject remove_tweak_implausibility_type_restrictions(final SubLObject type_restrictions, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(plausibility_utilities.$tweak_implausibility_type_restrictions_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(type_restrictions, mt), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
    public static SubLObject tweak_implausibility_type_restrictions_internal(final SubLObject type_restrictions, final SubLObject mt) {
        if (plausibility_utilities.NIL != disjoint_with.any_disjoint_with_anyP_memoized(type_restrictions, type_restrictions, mt, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            return Values.values(genls.min_ceiling_cols(type_restrictions, (SubLObject)plausibility_utilities.NIL, mt, (SubLObject)plausibility_utilities.UNPROVIDED), (SubLObject)plausibility_utilities.$kw97$MIN_CEILING_COLS);
        }
        return Values.values(type_restrictions, (SubLObject)plausibility_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 49624L)
    public static SubLObject tweak_implausibility_type_restrictions(final SubLObject type_restrictions, final SubLObject mt) {
        SubLObject caching_state = plausibility_utilities.$tweak_implausibility_type_restrictions_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)plausibility_utilities.$sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS, (SubLObject)plausibility_utilities.$sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_, (SubLObject)plausibility_utilities.$int133$4096, (SubLObject)plausibility_utilities.EQUAL, (SubLObject)plausibility_utilities.TWO_INTEGER, (SubLObject)plausibility_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)plausibility_utilities.$sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(type_restrictions, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)plausibility_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)plausibility_utilities.NIL;
            collision = cdolist_list_var.first();
            while (plausibility_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (type_restrictions.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (plausibility_utilities.NIL != cached_args && plausibility_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tweak_implausibility_type_restrictions_internal(type_restrictions, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(type_restrictions, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
    public static SubLObject clear_implied_argn_type_requirements_for_pred() {
        final SubLObject cs = plausibility_utilities.$implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
    public static SubLObject remove_implied_argn_type_requirements_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        return memoization_state.caching_state_remove_function_results_with_args(plausibility_utilities.$implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, argnum, col, mt, justifyP), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
    public static SubLObject implied_argn_type_requirements_for_pred_internal(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        final SubLObject var0 = variables.get_variable((SubLObject)plausibility_utilities.ZERO_INTEGER);
        return (SubLObject)(argnum.eql((SubLObject)plausibility_utilities.TWO_INTEGER) ? tva_unify_with_variable_lookup_and_values((SubLObject)ConsesLow.list(plausibility_utilities.$const135$relationNotExistsExists, pred, col, var0), var0, mt, (SubLObject)plausibility_utilities.NIL, justifyP, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED) : (argnum.eql((SubLObject)plausibility_utilities.ONE_INTEGER) ? tva_unify_with_variable_lookup_and_values((SubLObject)ConsesLow.list(plausibility_utilities.$const135$relationNotExistsExists, pred, var0, col), var0, mt, (SubLObject)plausibility_utilities.NIL, justifyP, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50058L)
    public static SubLObject implied_argn_type_requirements_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        SubLObject caching_state = plausibility_utilities.$implied_argn_type_requirements_for_pred_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)plausibility_utilities.$sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED, (SubLObject)plausibility_utilities.$sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_, (SubLObject)plausibility_utilities.$int133$4096, (SubLObject)plausibility_utilities.EQUAL, (SubLObject)plausibility_utilities.FIVE_INTEGER, (SubLObject)plausibility_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)plausibility_utilities.$sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, argnum, col, mt, justifyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)plausibility_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)plausibility_utilities.NIL;
            collision = cdolist_list_var.first();
            while (plausibility_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (col.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (plausibility_utilities.NIL != cached_args && plausibility_utilities.NIL == cached_args.rest() && justifyP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(implied_argn_type_requirements_for_pred_internal(pred, argnum, col, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, argnum, col, mt, justifyP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
    public static SubLObject clear_implied_argn_type_restrictions_for_pred() {
        final SubLObject cs = plausibility_utilities.$implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
    public static SubLObject remove_implied_argn_type_restrictions_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        return memoization_state.caching_state_remove_function_results_with_args(plausibility_utilities.$implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(pred, argnum, col, mt, justifyP), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
    public static SubLObject implied_argn_type_restrictions_for_pred_internal(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)plausibility_utilities.NIL;
        SubLObject justifications = (SubLObject)plausibility_utilities.NIL;
        final SubLObject var0 = variables.get_variable((SubLObject)plausibility_utilities.ZERO_INTEGER);
        thread.resetMultipleValues();
        SubLObject this_result = (SubLObject)(argnum.eql((SubLObject)plausibility_utilities.TWO_INTEGER) ? tva_unify_with_variable_lookup_and_values((SubLObject)ConsesLow.list(plausibility_utilities.$const137$relationAllExists, pred, col, var0), var0, mt, (SubLObject)plausibility_utilities.NIL, justifyP, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL);
        SubLObject this_justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = ConsesLow.append(result, this_result);
        justifications = ConsesLow.append(justifications, this_justifications);
        thread.resetMultipleValues();
        this_result = (SubLObject)(argnum.eql((SubLObject)plausibility_utilities.TWO_INTEGER) ? tva_unify_with_variable_lookup_and_values((SubLObject)ConsesLow.list(plausibility_utilities.$const138$someTypePlaysRoleInSituationType, col, var0, pred), var0, mt, (SubLObject)plausibility_utilities.NIL, justifyP, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED) : plausibility_utilities.NIL);
        this_justifications = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = ConsesLow.append(result, this_result);
        justifications = ConsesLow.append(justifications, this_justifications);
        SubLObject min_result = genls.min_cols(conses_high.copy_list(result), mt, (SubLObject)plausibility_utilities.UNPROVIDED);
        SubLObject unique_result = (SubLObject)plausibility_utilities.NIL;
        SubLObject unique_justifications = (SubLObject)plausibility_utilities.NIL;
        SubLObject cdolist_list_var = (SubLObject)plausibility_utilities.$list139;
        SubLObject too_general_col = (SubLObject)plausibility_utilities.NIL;
        too_general_col = cdolist_list_var.first();
        while (plausibility_utilities.NIL != cdolist_list_var) {
            if (plausibility_utilities.NIL == list_utilities.singletonP(min_result)) {
                min_result = conses_high.set_difference(min_result, genls.all_genls_among(too_general_col, result, (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            too_general_col = cdolist_list_var.first();
        }
        SubLObject this_result2 = (SubLObject)plausibility_utilities.NIL;
        SubLObject this_result_$88 = (SubLObject)plausibility_utilities.NIL;
        SubLObject this_justification = (SubLObject)plausibility_utilities.NIL;
        SubLObject this_justification_$89 = (SubLObject)plausibility_utilities.NIL;
        this_result2 = result;
        this_result_$88 = this_result2.first();
        this_justification = justifications;
        this_justification_$89 = this_justification.first();
        while (plausibility_utilities.NIL != this_justification || plausibility_utilities.NIL != this_result2) {
            if (plausibility_utilities.NIL != list_utilities.member_kbeqP(this_result_$88, min_result) && plausibility_utilities.NIL == list_utilities.member_kbeqP(this_result_$88, unique_result)) {
                unique_result = (SubLObject)ConsesLow.cons(this_result_$88, unique_result);
                unique_justifications = (SubLObject)ConsesLow.cons(this_justification_$89, unique_justifications);
            }
            this_result2 = this_result2.rest();
            this_result_$88 = this_result2.first();
            this_justification = this_justification.rest();
            this_justification_$89 = this_justification.first();
        }
        result = Sequences.nreverse(unique_result);
        justifications = Sequences.nreverse(unique_justifications);
        return Values.values(result, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 50569L)
    public static SubLObject implied_argn_type_restrictions_for_pred(final SubLObject pred, final SubLObject argnum, final SubLObject col, final SubLObject mt, final SubLObject justifyP) {
        SubLObject caching_state = plausibility_utilities.$implied_argn_type_restrictions_for_pred_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)plausibility_utilities.$sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED, (SubLObject)plausibility_utilities.$sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_, (SubLObject)plausibility_utilities.$int133$4096, (SubLObject)plausibility_utilities.EQUAL, (SubLObject)plausibility_utilities.FIVE_INTEGER, (SubLObject)plausibility_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)plausibility_utilities.$sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, argnum, col, mt, justifyP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)plausibility_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)plausibility_utilities.NIL;
            collision = cdolist_list_var.first();
            while (plausibility_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (col.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (plausibility_utilities.NIL != cached_args && plausibility_utilities.NIL == cached_args.rest() && justifyP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(implied_argn_type_restrictions_for_pred_internal(pred, argnum, col, mt, justifyP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, argnum, col, mt, justifyP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 52805L)
    public static SubLObject tva_unify_with_variable_lookup_and_values(final SubLObject asent, final SubLObject var, SubLObject mt, SubLObject return_one_answer_p, SubLObject compute_justifications_p, SubLObject closure_mode, SubLObject checking_spec_preds_for_cache_resultsP, SubLObject prove_negationP) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (return_one_answer_p == plausibility_utilities.UNPROVIDED) {
            return_one_answer_p = (SubLObject)plausibility_utilities.NIL;
        }
        if (compute_justifications_p == plausibility_utilities.UNPROVIDED) {
            compute_justifications_p = (SubLObject)plausibility_utilities.NIL;
        }
        if (closure_mode == plausibility_utilities.UNPROVIDED) {
            closure_mode = (SubLObject)plausibility_utilities.$kw140$NONE;
        }
        if (checking_spec_preds_for_cache_resultsP == plausibility_utilities.UNPROVIDED) {
            checking_spec_preds_for_cache_resultsP = (SubLObject)plausibility_utilities.T;
        }
        if (prove_negationP == plausibility_utilities.UNPROVIDED) {
            prove_negationP = (SubLObject)plausibility_utilities.NIL;
        }
        final SubLObject bindings_justifications = tva_inference.tva_unify(asent, mt, return_one_answer_p, compute_justifications_p, closure_mode, checking_spec_preds_for_cache_resultsP, prove_negationP);
        SubLObject result = (SubLObject)plausibility_utilities.NIL;
        SubLObject justifications = (SubLObject)plausibility_utilities.NIL;
        SubLObject cdolist_list_var = bindings_justifications;
        SubLObject bindings_justification = (SubLObject)plausibility_utilities.NIL;
        bindings_justification = cdolist_list_var.first();
        while (plausibility_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = bindings_justification;
            SubLObject v_bindings = (SubLObject)plausibility_utilities.NIL;
            SubLObject justification = (SubLObject)plausibility_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list141);
            v_bindings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)plausibility_utilities.$list141);
            justification = current.first();
            current = current.rest();
            if (plausibility_utilities.NIL == current) {
                result = (SubLObject)ConsesLow.cons(bindings.variable_lookup(var, v_bindings), result);
                justifications = (SubLObject)ConsesLow.cons(justification, justifications);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)plausibility_utilities.$list141);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bindings_justification = cdolist_list_var.first();
        }
        return Values.values(result, justifications);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
    public static SubLObject clear_tva_check_cached() {
        final SubLObject cs = plausibility_utilities.$tva_check_cached_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
    public static SubLObject remove_tva_check_cached(final SubLObject sentence, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(plausibility_utilities.$tva_check_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sentence, mt), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
    public static SubLObject tva_check_cached_internal(final SubLObject sentence, final SubLObject mt) {
        return removal_modules_tva_lookup.tva_check(sentence, mt, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53486L)
    public static SubLObject tva_check_cached(final SubLObject sentence, final SubLObject mt) {
        SubLObject caching_state = plausibility_utilities.$tva_check_cached_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)plausibility_utilities.$sym142$TVA_CHECK_CACHED, (SubLObject)plausibility_utilities.$sym125$_TVA_CHECK_CACHED_CACHING_STATE_, (SubLObject)plausibility_utilities.$int133$4096, (SubLObject)plausibility_utilities.EQUAL, (SubLObject)plausibility_utilities.TWO_INTEGER, (SubLObject)plausibility_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)plausibility_utilities.$sym114$CLEAR_TVA_CHECK_CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)plausibility_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)plausibility_utilities.NIL;
            collision = cdolist_list_var.first();
            while (plausibility_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (plausibility_utilities.NIL != cached_args && plausibility_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tva_check_cached_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
    public static SubLObject clear_implausible_admitted_argumentP() {
        final SubLObject cs = plausibility_utilities.$implausible_admitted_argumentP_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
    public static SubLObject remove_implausible_admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args(plausibility_utilities.$implausible_admitted_argumentP_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term, argnum, relation, mt), (SubLObject)plausibility_utilities.UNPROVIDED, (SubLObject)plausibility_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
    public static SubLObject implausible_admitted_argumentP_internal(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert plausibility_utilities.NIL != Types.integerp(argnum) : argnum;
        if (plausibility_utilities.NIL == el_utilities.closedP(relation, (SubLObject)plausibility_utilities.UNPROVIDED) || plausibility_utilities.NIL == el_utilities.closedP(v_term, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            return (SubLObject)plausibility_utilities.T;
        }
        SubLObject admittedP = (SubLObject)plausibility_utilities.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_10 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$at_check_arg_not_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = at_vars.$at_check_not_isa_disjointP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding(thread);
        final SubLObject _prev_bind_18 = at_vars.$at_check_not_genls_disjointP$.currentBinding(thread);
        final SubLObject _prev_bind_19 = at_vars.$at_check_inter_arg_differentP$.currentBinding(thread);
        final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_21 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
        final SubLObject _prev_bind_22 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding(thread);
        final SubLObject _prev_bind_23 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding(thread);
        final SubLObject _prev_bind_24 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_25 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_26 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_27 = at_vars.$at_some_arg_isa_requiredP$.currentBinding(thread);
        final SubLObject _prev_bind_28 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_29 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_30 = czer_vars.$within_negationP$.currentBinding(thread);
        final SubLObject _prev_bind_31 = at_vars.$within_functionP$.currentBinding(thread);
        final SubLObject _prev_bind_32 = at_vars.$within_predicateP$.currentBinding(thread);
        final SubLObject _prev_bind_33 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_defining_mtsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_isaP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_arg_not_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_quoted_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_not_isa_disjointP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_not_quoted_isa_disjointP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_not_genls_disjointP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_inter_arg_differentP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_genlP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_not_genlP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_isa_genlP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_genl_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_formatP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_some_arg_isa_requiredP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind((SubLObject)SubLObjectFactory.makeBoolean(plausibility_utilities.NIL != control_vars.$within_assert$.getDynamicValue(thread) && plausibility_utilities.NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            at_vars.$within_predicateP$.bind((SubLObject)SubLObjectFactory.makeBoolean(plausibility_utilities.NIL != control_vars.$within_assert$.getDynamicValue(thread) && plausibility_utilities.NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            admittedP = implausible_admitted_argument_intP(v_term, argnum, relation, mt);
        }
        finally {
            czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_33, thread);
            at_vars.$within_predicateP$.rebind(_prev_bind_32, thread);
            at_vars.$within_functionP$.rebind(_prev_bind_31, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_30, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_29, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_28, thread);
            at_vars.$at_some_arg_isa_requiredP$.rebind(_prev_bind_27, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_26, thread);
            at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_25, thread);
            at_vars.$at_check_inter_arg_genl_isaP$.rebind(_prev_bind_24, thread);
            at_vars.$at_check_inter_arg_isa_genlP$.rebind(_prev_bind_23, thread);
            at_vars.$at_check_inter_arg_not_genlP$.rebind(_prev_bind_22, thread);
            at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_21, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_20, thread);
            at_vars.$at_check_inter_arg_differentP$.rebind(_prev_bind_19, thread);
            at_vars.$at_check_not_genls_disjointP$.rebind(_prev_bind_18, thread);
            at_vars.$at_check_not_quoted_isa_disjointP$.rebind(_prev_bind_17, thread);
            at_vars.$at_check_not_isa_disjointP$.rebind(_prev_bind_16, thread);
            at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_15, thread);
            at_vars.$at_check_arg_not_isaP$.rebind(_prev_bind_14, thread);
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_13, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_12, thread);
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_11, thread);
            at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_10, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_9, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_8, thread);
            at_vars.$at_arg$.rebind(_prev_bind_7, thread);
            at_vars.$at_reln$.rebind(_prev_bind_6, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 53651L)
    public static SubLObject implausible_admitted_argumentP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, SubLObject mt) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject caching_state = plausibility_utilities.$implausible_admitted_argumentP_caching_state$.getGlobalValue();
        if (plausibility_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)plausibility_utilities.$sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_, (SubLObject)plausibility_utilities.$sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_, (SubLObject)plausibility_utilities.$int145$8192, (SubLObject)plausibility_utilities.EQUAL, (SubLObject)plausibility_utilities.FOUR_INTEGER, (SubLObject)plausibility_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)plausibility_utilities.$sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, argnum, relation, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)plausibility_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)plausibility_utilities.NIL;
            collision = cdolist_list_var.first();
            while (plausibility_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (relation.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (plausibility_utilities.NIL != cached_args && plausibility_utilities.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(implausible_admitted_argumentP_internal(v_term, argnum, relation, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(v_term, argnum, relation, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 55652L)
    public static SubLObject implausible_admitted_argument_intP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = (SubLObject)((plausibility_utilities.NIL != wff_utilities.$check_arityP$.getDynamicValue(thread)) ? arity.max_arity(relation) : plausibility_utilities.NIL);
        return (SubLObject)SubLObjectFactory.makeBoolean(plausibility_utilities.NIL != kb_accessors.relationP(relation) && (!v_arity.isNumber() || v_arity.numGE(argnum)) && (argnum.numG((SubLObject)plausibility_utilities.ZERO_INTEGER) || (argnum.numE((SubLObject)plausibility_utilities.ZERO_INTEGER) && plausibility_utilities.NIL != kb_utilities.kbeq(v_term, relation))) && plausibility_utilities.NIL != arg_type.relation_arg_okP(relation, v_term, argnum, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 56077L)
    public static SubLObject implausible_admitted_argument_to_formulaP(final SubLObject v_term, final SubLObject argnum, final SubLObject relation, final SubLObject formula, SubLObject mt) {
        if (mt == plausibility_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert plausibility_utilities.NIL != Types.integerp(argnum) : argnum;
        if (plausibility_utilities.NIL == el_utilities.closedP(relation, (SubLObject)plausibility_utilities.UNPROVIDED) || plausibility_utilities.NIL == el_utilities.closedP(v_term, (SubLObject)plausibility_utilities.UNPROVIDED)) {
            return (SubLObject)plausibility_utilities.T;
        }
        SubLObject admittedP = (SubLObject)plausibility_utilities.NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_7 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_8 = at_vars.$at_formula$.currentBinding(thread);
        final SubLObject _prev_bind_9 = at_vars.$at_argnum$.currentBinding(thread);
        final SubLObject _prev_bind_10 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
        final SubLObject _prev_bind_11 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
        final SubLObject _prev_bind_12 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        final SubLObject _prev_bind_13 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_14 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_15 = at_vars.$at_check_arg_not_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_16 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_17 = at_vars.$at_check_not_isa_disjointP$.currentBinding(thread);
        final SubLObject _prev_bind_18 = at_vars.$at_check_not_quoted_isa_disjointP$.currentBinding(thread);
        final SubLObject _prev_bind_19 = at_vars.$at_check_not_genls_disjointP$.currentBinding(thread);
        final SubLObject _prev_bind_20 = at_vars.$at_check_inter_arg_differentP$.currentBinding(thread);
        final SubLObject _prev_bind_21 = at_vars.$at_check_inter_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_22 = at_vars.$at_check_inter_arg_genlP$.currentBinding(thread);
        final SubLObject _prev_bind_23 = at_vars.$at_check_inter_arg_not_genlP$.currentBinding(thread);
        final SubLObject _prev_bind_24 = at_vars.$at_check_inter_arg_isa_genlP$.currentBinding(thread);
        final SubLObject _prev_bind_25 = at_vars.$at_check_inter_arg_genl_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_26 = at_vars.$at_check_inter_arg_formatP$.currentBinding(thread);
        final SubLObject _prev_bind_27 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_28 = at_vars.$at_some_arg_isa_requiredP$.currentBinding(thread);
        final SubLObject _prev_bind_29 = at_vars.$gather_at_constraintsP$.currentBinding(thread);
        final SubLObject _prev_bind_30 = czer_vars.$accumulating_semantic_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_31 = czer_vars.$within_negationP$.currentBinding(thread);
        final SubLObject _prev_bind_32 = at_vars.$within_functionP$.currentBinding(thread);
        final SubLObject _prev_bind_33 = at_vars.$within_predicateP$.currentBinding(thread);
        final SubLObject _prev_bind_34 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            wff_vars.$provide_wff_suggestionsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(v_term, thread);
            at_vars.$at_formula$.bind(formula, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            at_vars.$at_check_arg_typesP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_defining_mtsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_genlsP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_arg_formatP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_not_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_arg_quoted_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_not_isa_disjointP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_not_quoted_isa_disjointP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_not_genls_disjointP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_inter_arg_differentP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_genlP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_inter_arg_not_genlP$.bind((SubLObject)plausibility_utilities.T, thread);
            at_vars.$at_check_inter_arg_isa_genlP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_genl_isaP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_inter_arg_formatP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_check_relator_constraintsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$at_some_arg_isa_requiredP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            at_vars.$gather_at_constraintsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            czer_vars.$accumulating_semantic_violationsP$.bind((SubLObject)plausibility_utilities.NIL, thread);
            czer_vars.$within_negationP$.bind(arg_type.at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
            at_vars.$within_functionP$.bind((SubLObject)SubLObjectFactory.makeBoolean(plausibility_utilities.NIL != control_vars.$within_assert$.getDynamicValue(thread) && plausibility_utilities.NIL != arg_type.at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            at_vars.$within_predicateP$.bind((SubLObject)SubLObjectFactory.makeBoolean(plausibility_utilities.NIL != control_vars.$within_assert$.getDynamicValue(thread) && plausibility_utilities.NIL != arg_type.at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread))), thread);
            czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
            admittedP = implausible_admitted_argument_intP(v_term, argnum, relation, mt);
        }
        finally {
            czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_34, thread);
            at_vars.$within_predicateP$.rebind(_prev_bind_33, thread);
            at_vars.$within_functionP$.rebind(_prev_bind_32, thread);
            czer_vars.$within_negationP$.rebind(_prev_bind_31, thread);
            czer_vars.$accumulating_semantic_violationsP$.rebind(_prev_bind_30, thread);
            at_vars.$gather_at_constraintsP$.rebind(_prev_bind_29, thread);
            at_vars.$at_some_arg_isa_requiredP$.rebind(_prev_bind_28, thread);
            at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_27, thread);
            at_vars.$at_check_inter_arg_formatP$.rebind(_prev_bind_26, thread);
            at_vars.$at_check_inter_arg_genl_isaP$.rebind(_prev_bind_25, thread);
            at_vars.$at_check_inter_arg_isa_genlP$.rebind(_prev_bind_24, thread);
            at_vars.$at_check_inter_arg_not_genlP$.rebind(_prev_bind_23, thread);
            at_vars.$at_check_inter_arg_genlP$.rebind(_prev_bind_22, thread);
            at_vars.$at_check_inter_arg_isaP$.rebind(_prev_bind_21, thread);
            at_vars.$at_check_inter_arg_differentP$.rebind(_prev_bind_20, thread);
            at_vars.$at_check_not_genls_disjointP$.rebind(_prev_bind_19, thread);
            at_vars.$at_check_not_quoted_isa_disjointP$.rebind(_prev_bind_18, thread);
            at_vars.$at_check_not_isa_disjointP$.rebind(_prev_bind_17, thread);
            at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_16, thread);
            at_vars.$at_check_arg_not_isaP$.rebind(_prev_bind_15, thread);
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_14, thread);
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_13, thread);
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_12, thread);
            at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_11, thread);
            at_vars.$at_check_arg_typesP$.rebind(_prev_bind_10, thread);
            at_vars.$at_argnum$.rebind(_prev_bind_9, thread);
            at_vars.$at_formula$.rebind(_prev_bind_8, thread);
            at_vars.$at_arg$.rebind(_prev_bind_7, thread);
            at_vars.$at_reln$.rebind(_prev_bind_6, thread);
            wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 58136L)
    public static SubLObject hl_justify_asent_fast(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)plausibility_utilities.NIL;
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding(thread);
        try {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind((SubLObject)plausibility_utilities.T, thread);
            result = hl_justify_asent(sentence, mt);
        }
        finally {
            czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/plausibility-utilities.lisp", position = 58491L)
    public static SubLObject hl_justify_asent(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (plausibility_utilities.NIL != control_vars.within_queryP()) {
            Errors.error((SubLObject)plausibility_utilities.$str146$hl_justify_asent_not_legal_to_cal);
        }
        SubLObject query_properties = (SubLObject)plausibility_utilities.$list147;
        SubLObject result = (SubLObject)plausibility_utilities.NIL;
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, (SubLObject)plausibility_utilities.UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (plausibility_utilities.NIL != el_utilities.el_implication_p(right_sentence)) {
            query_properties = conses_high.putf(query_properties, (SubLObject)plausibility_utilities.$kw148$CONDITIONAL_SENTENCE_, (SubLObject)plausibility_utilities.T);
        }
        result = inference_kernel.new_cyc_query(right_sentence, right_mt, query_properties);
        result = result.first();
        if (plausibility_utilities.NIL == result) {
            if (plausibility_utilities.NIL != plausibility_utilities.$debug_implausibilityP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)plausibility_utilities.$str149$Could_not_find_hl_support_for__S_, sentence, mt);
            }
            result = (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)plausibility_utilities.$kw39$OPAQUE, sentence, mt, (SubLObject)plausibility_utilities.UNPROVIDED));
        }
        return result;
    }
    
    public static SubLObject declare_plausibility_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "sentence_plausibility_factor", "SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "why_sentence_plausibility_factor", "WHY-SENTENCE-PLAUSIBILITY-FACTOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "sentence_plausibility_score", "SENTENCE-PLAUSIBILITY-SCORE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "why_sentence_plausibility_score", "WHY-SENTENCE-PLAUSIBILITY-SCORE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_sentenceP", "IMPLAUSIBLE-SENTENCE?", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_nautP", "IMPLAUSIBLE-NAUT?", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "get_implausibility_property", "GET-IMPLAUSIBILITY-PROPERTY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_sentenceP_recursive", "IMPLAUSIBLE-SENTENCE?-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_nautP_recursive", "IMPLAUSIBLE-NAUT?-RECURSIVE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "categorize_subcollection_predicate_internal", "CATEGORIZE-SUBCOLLECTION-PREDICATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "categorize_subcollection_predicate", "CATEGORIZE-SUBCOLLECTION-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "possibly_find_nart", "POSSIBLY-FIND-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "possible_naut_genls", "POSSIBLE-NAUT-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_sentence_wrt_variable_argumentsP", "IMPLAUSIBLE-SENTENCE-WRT-VARIABLE-ARGUMENTS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_term_wrt_wft", "IMPLAUSIBLE-TERM-WRT-WFT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_sentence_wrt_wff", "IMPLAUSIBLE-SENTENCE-WRT-WFF", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_genlsP", "IMPLAUSIBLE-GENLS?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_isaP", "IMPLAUSIBLE-ISA?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_typeP", "IMPLAUSIBLE-TYPE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_arg_isa_constraintP", "IMPLAUSIBLE-COL-WRT-ARG-ISA-CONSTRAINT?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_arg_sometimes_isa_constraintP", "IMPLAUSIBLE-COL-WRT-ARG-SOMETIMES-ISA-CONSTRAINT?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_thing_wrt_arg_isa_constraintP", "IMPLAUSIBLE-THING-WRT-ARG-ISA-CONSTRAINT?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_thing_wrt_arg_sometimes_isa_constraintP", "IMPLAUSIBLE-THING-WRT-ARG-SOMETIMES-ISA-CONSTRAINT?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_implied_argn_type_requirements_for_predP", "IMPLAUSIBLE-COL-WRT-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_thing_wrt_implied_argn_type_requirements_for_predP", "IMPLAUSIBLE-THING-WRT-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_implied_argn_type_restrictions_for_predP", "IMPLAUSIBLE-COL-WRT-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_thing_wrt_implied_argn_type_restrictions_for_predP", "IMPLAUSIBLE-THING-WRT-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_genls_pred_disjointnessP", "IMPLAUSIBLE-COL-WRT-GENLS-PRED-DISJOINTNESS?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_isa_pred_disjointnessP", "IMPLAUSIBLE-COL-WRT-ISA-PRED-DISJOINTNESS?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_col_wrt_typical_volumeP", "IMPLAUSIBLE-COL-WRT-TYPICAL-VOLUME?", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_intersection_of_two_colsP", "IMPLAUSIBLE-INTERSECTION-OF-TWO-COLS?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_union_of_colsP", "IMPLAUSIBLE-UNION-OF-COLS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "esoteric_termP", "ESOTERIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "exoteric_termP", "EXOTERIC-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "clear_plausibility_caches", "CLEAR-PLAUSIBILITY-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "print_plausibility_cache_sizes", "PRINT-PLAUSIBILITY-CACHE-SIZES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "clear_tweak_implausibility_type_restrictions", "CLEAR-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "remove_tweak_implausibility_type_restrictions", "REMOVE-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "tweak_implausibility_type_restrictions_internal", "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "tweak_implausibility_type_restrictions", "TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "clear_implied_argn_type_requirements_for_pred", "CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "remove_implied_argn_type_requirements_for_pred", "REMOVE-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implied_argn_type_requirements_for_pred_internal", "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implied_argn_type_requirements_for_pred", "IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "clear_implied_argn_type_restrictions_for_pred", "CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "remove_implied_argn_type_restrictions_for_pred", "REMOVE-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implied_argn_type_restrictions_for_pred_internal", "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implied_argn_type_restrictions_for_pred", "IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "tva_unify_with_variable_lookup_and_values", "TVA-UNIFY-WITH-VARIABLE-LOOKUP-AND-VALUES", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "clear_tva_check_cached", "CLEAR-TVA-CHECK-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "remove_tva_check_cached", "REMOVE-TVA-CHECK-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "tva_check_cached_internal", "TVA-CHECK-CACHED-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "tva_check_cached", "TVA-CHECK-CACHED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "clear_implausible_admitted_argumentP", "CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "remove_implausible_admitted_argumentP", "REMOVE-IMPLAUSIBLE-ADMITTED-ARGUMENT?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_admitted_argumentP_internal", "IMPLAUSIBLE-ADMITTED-ARGUMENT?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_admitted_argumentP", "IMPLAUSIBLE-ADMITTED-ARGUMENT?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_admitted_argument_intP", "IMPLAUSIBLE-ADMITTED-ARGUMENT-INT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "implausible_admitted_argument_to_formulaP", "IMPLAUSIBLE-ADMITTED-ARGUMENT-TO-FORMULA?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "hl_justify_asent_fast", "HL-JUSTIFY-ASENT-FAST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.plausibility_utilities", "hl_justify_asent", "HL-JUSTIFY-ASENT", 2, 0, false);
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    public static SubLObject init_plausibility_utilities_file() {
        plausibility_utilities.$default_plausibility_check_mt$ = SubLFiles.defparameter("*DEFAULT-PLAUSIBILITY-CHECK-MT*", plausibility_utilities.$const0$PlausibilityQueryMt);
        plausibility_utilities.$implausibility_properties$ = SubLFiles.deflexical("*IMPLAUSIBILITY-PROPERTIES*", (SubLObject)plausibility_utilities.$list1);
        plausibility_utilities.$debug_implausibilityP$ = SubLFiles.defparameter("*DEBUG-IMPLAUSIBILITY?*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$debug_implausibility_wf_checksP$ = SubLFiles.defparameter("*DEBUG-IMPLAUSIBILITY-WF-CHECKS?*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$implausibility_override_properties$ = SubLFiles.defparameter("*IMPLAUSIBILITY-OVERRIDE-PROPERTIES*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$implausibility_stats_table$ = SubLFiles.defparameter("*IMPLAUSIBILITY-STATS-TABLE*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$default_plausibility_percent_cutoff$ = SubLFiles.defparameter("*DEFAULT-PLAUSIBILITY-PERCENT-CUTOFF*", (SubLObject)plausibility_utilities.$float2$0_5);
        plausibility_utilities.$plausibility_factor_completely_implausible$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-COMPLETELY-IMPLAUSIBLE*", (SubLObject)plausibility_utilities.ZERO_INTEGER);
        plausibility_utilities.$plausibility_factor_non_wff$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-NON-WFF*", (SubLObject)plausibility_utilities.$float3$0_01);
        plausibility_utilities.$plausibility_factor_type_violation$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-TYPE-VIOLATION*", (SubLObject)plausibility_utilities.$float4$0_02);
        plausibility_utilities.$plausibility_factor_arg_violation$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-ARG-VIOLATION*", (SubLObject)plausibility_utilities.$float5$0_03);
        plausibility_utilities.$plausibility_factor_arg_disjointness$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-ARG-DISJOINTNESS*", (SubLObject)plausibility_utilities.$float6$0_04);
        plausibility_utilities.$plausibility_factor_not_isa_or_genls$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-NOT-ISA-OR-GENLS*", (SubLObject)plausibility_utilities.$float7$0_05);
        plausibility_utilities.$plausibility_factor_inter_sentential_contradiction$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-INTER-SENTENTIAL-CONTRADICTION*", (SubLObject)plausibility_utilities.$float8$0_055);
        plausibility_utilities.$plausibility_factor_implied_arg_restriction$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-IMPLIED-ARG-RESTRICTION*", (SubLObject)plausibility_utilities.$float9$0_06);
        plausibility_utilities.$plausibility_factor_no_type_restriction$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-NO-TYPE-RESTRICTION*", (SubLObject)plausibility_utilities.$float10$0_07);
        plausibility_utilities.$plausibility_factor_typical_volume_violation$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-TYPICAL-VOLUME-VIOLATION*", (SubLObject)plausibility_utilities.$float11$0_08);
        plausibility_utilities.$plausibility_factor_esoteric_term$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-ESOTERIC-TERM*", (SubLObject)plausibility_utilities.$float12$0_09);
        plausibility_utilities.$plausibility_factor_splitting_hairs_cutoff$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-SPLITTING-HAIRS-CUTOFF*", (SubLObject)plausibility_utilities.$float13$0_1);
        plausibility_utilities.$plausibility_factor_completely_plausible$ = SubLFiles.defparameter("*PLAUSIBILITY-FACTOR-COMPLETELY-PLAUSIBLE*", (SubLObject)plausibility_utilities.ONE_INTEGER);
        plausibility_utilities.$default_sentence_plausibility_score_properties$ = SubLFiles.defparameter("*DEFAULT-SENTENCE-PLAUSIBILITY-SCORE-PROPERTIES*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$typical_volume_applicable_predicates$ = SubLFiles.defparameter("*TYPICAL-VOLUME-APPLICABLE-PREDICATES*", (SubLObject)plausibility_utilities.$list101);
        plausibility_utilities.$typical_volume_applicable_pred_inverses$ = SubLFiles.defparameter("*TYPICAL-VOLUME-APPLICABLE-PRED-INVERSES*", (SubLObject)plausibility_utilities.$list102);
        plausibility_utilities.$tweak_implausibility_type_restrictions_caching_state$ = SubLFiles.deflexical("*TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-CACHING-STATE*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$implied_argn_type_requirements_for_pred_caching_state$ = SubLFiles.deflexical("*IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-CACHING-STATE*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$implied_argn_type_restrictions_for_pred_caching_state$ = SubLFiles.deflexical("*IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-CACHING-STATE*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$tva_check_cached_caching_state$ = SubLFiles.deflexical("*TVA-CHECK-CACHED-CACHING-STATE*", (SubLObject)plausibility_utilities.NIL);
        plausibility_utilities.$implausible_admitted_argumentP_caching_state$ = SubLFiles.deflexical("*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*", (SubLObject)plausibility_utilities.NIL);
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    public static SubLObject setup_plausibility_utilities_file() {
        memoization_state.note_memoized_function((SubLObject)plausibility_utilities.$sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE);
        memoization_state.note_globally_cached_function((SubLObject)plausibility_utilities.$sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS);
        memoization_state.note_globally_cached_function((SubLObject)plausibility_utilities.$sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED);
        memoization_state.note_globally_cached_function((SubLObject)plausibility_utilities.$sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED);
        memoization_state.note_globally_cached_function((SubLObject)plausibility_utilities.$sym142$TVA_CHECK_CACHED);
        memoization_state.note_globally_cached_function((SubLObject)plausibility_utilities.$sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_);
        return (SubLObject)plausibility_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_plausibility_utilities_file();
    }
    
    public void initializeVariables() {
        init_plausibility_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_plausibility_utilities_file();
    }
    
    static {
        me = (SubLFile)new plausibility_utilities();
        plausibility_utilities.$default_plausibility_check_mt$ = null;
        plausibility_utilities.$implausibility_properties$ = null;
        plausibility_utilities.$debug_implausibilityP$ = null;
        plausibility_utilities.$debug_implausibility_wf_checksP$ = null;
        plausibility_utilities.$implausibility_override_properties$ = null;
        plausibility_utilities.$implausibility_stats_table$ = null;
        plausibility_utilities.$default_plausibility_percent_cutoff$ = null;
        plausibility_utilities.$plausibility_factor_completely_implausible$ = null;
        plausibility_utilities.$plausibility_factor_non_wff$ = null;
        plausibility_utilities.$plausibility_factor_type_violation$ = null;
        plausibility_utilities.$plausibility_factor_arg_violation$ = null;
        plausibility_utilities.$plausibility_factor_arg_disjointness$ = null;
        plausibility_utilities.$plausibility_factor_not_isa_or_genls$ = null;
        plausibility_utilities.$plausibility_factor_inter_sentential_contradiction$ = null;
        plausibility_utilities.$plausibility_factor_implied_arg_restriction$ = null;
        plausibility_utilities.$plausibility_factor_no_type_restriction$ = null;
        plausibility_utilities.$plausibility_factor_typical_volume_violation$ = null;
        plausibility_utilities.$plausibility_factor_esoteric_term$ = null;
        plausibility_utilities.$plausibility_factor_splitting_hairs_cutoff$ = null;
        plausibility_utilities.$plausibility_factor_completely_plausible$ = null;
        plausibility_utilities.$default_sentence_plausibility_score_properties$ = null;
        plausibility_utilities.$typical_volume_applicable_predicates$ = null;
        plausibility_utilities.$typical_volume_applicable_pred_inverses$ = null;
        plausibility_utilities.$tweak_implausibility_type_restrictions_caching_state$ = null;
        plausibility_utilities.$implied_argn_type_requirements_for_pred_caching_state$ = null;
        plausibility_utilities.$implied_argn_type_restrictions_for_pred_caching_state$ = null;
        plausibility_utilities.$tva_check_cached_caching_state$ = null;
        plausibility_utilities.$implausible_admitted_argumentP_caching_state$ = null;
        $const0$PlausibilityQueryMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlausibilityQueryMt"));
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("JUSTIFY?"), SubLObjectFactory.makeKeyword("RETURN-BOOLEAN?"), SubLObjectFactory.makeKeyword("PERCENT-CUTOFF"), SubLObjectFactory.makeKeyword("PERCENT-CLIPPING?"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeKeyword("MAX-STEP"), SubLObjectFactory.makeKeyword("CLEAR-CACHES?"), SubLObjectFactory.makeKeyword("GATHER-STATS?"), SubLObjectFactory.makeKeyword("SUPPRESS-WFF-CHECKS?"), SubLObjectFactory.makeKeyword("WFF-CHECK-TYPE"), SubLObjectFactory.makeKeyword("SUPPRESS-WFT-CHECKS?"), SubLObjectFactory.makeKeyword("WFT-CHECK-TYPE"), SubLObjectFactory.makeKeyword("SUPPRESS-WF-CHECKS?"), SubLObjectFactory.makeKeyword("SUPPRESS-PLAUSIBLE-NART?"), SubLObjectFactory.makeKeyword("FORCE-GENLS-TRUTH-CHECK?") });
        $float2$0_5 = (SubLFloat)SubLObjectFactory.makeDouble(0.5);
        $float3$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $float4$0_02 = (SubLFloat)SubLObjectFactory.makeDouble(0.02);
        $float5$0_03 = (SubLFloat)SubLObjectFactory.makeDouble(0.03);
        $float6$0_04 = (SubLFloat)SubLObjectFactory.makeDouble(0.04);
        $float7$0_05 = (SubLFloat)SubLObjectFactory.makeDouble(0.05);
        $float8$0_055 = (SubLFloat)SubLObjectFactory.makeDouble(0.055);
        $float9$0_06 = (SubLFloat)SubLObjectFactory.makeDouble(0.06);
        $float10$0_07 = (SubLFloat)SubLObjectFactory.makeDouble(0.07);
        $float11$0_08 = (SubLFloat)SubLObjectFactory.makeDouble(0.08);
        $float12$0_09 = (SubLFloat)SubLObjectFactory.makeDouble(0.09);
        $float13$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $kw14$JUSTIFY_ = SubLObjectFactory.makeKeyword("JUSTIFY?");
        $int15$100 = SubLObjectFactory.makeInteger(100);
        $kw16$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $kw17$PERCENT_CUTOFF = SubLObjectFactory.makeKeyword("PERCENT-CUTOFF");
        $kw18$CLEAR_CACHES_ = SubLObjectFactory.makeKeyword("CLEAR-CACHES?");
        $kw19$SUPPRESS_PLAUSIBLE_NART_ = SubLObjectFactory.makeKeyword("SUPPRESS-PLAUSIBLE-NART?");
        $sym20$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $kw21$GATHER_STATS_ = SubLObjectFactory.makeKeyword("GATHER-STATS?");
        $kw22$TIMED_OUT_ = SubLObjectFactory.makeKeyword("TIMED-OUT?");
        $kw23$IMPLAUSIBLE_ = SubLObjectFactory.makeKeyword("IMPLAUSIBLE?");
        $kw24$PLAUSIBLE_ = SubLObjectFactory.makeKeyword("PLAUSIBLE?");
        $str25$Bad_justification_ = SubLObjectFactory.makeString("Bad justification!");
        $kw26$PERCENT_CLIPPING_ = SubLObjectFactory.makeKeyword("PERCENT-CLIPPING?");
        $kw27$RETURN_BOOLEAN_ = SubLObjectFactory.makeKeyword("RETURN-BOOLEAN?");
        $kw28$EAGER = SubLObjectFactory.makeKeyword("EAGER");
        $const29$equalSymbols = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equalSymbols"));
        $const30$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw31$FORCE_GENLS_TRUTH_CHECK_ = SubLObjectFactory.makeKeyword("FORCE-GENLS-TRUTH-CHECK?");
        $const32$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS"), (SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $const34$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA"), (SubLObject)SubLObjectFactory.makeSymbol("INST"), (SubLObject)SubLObjectFactory.makeSymbol("COL"));
        $kw36$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const37$admittedArgument = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("admittedArgument"));
        $const38$False = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("False"));
        $kw39$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const40$wffViolation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wffViolation"));
        $str41$Sentence_contains_contradictory_c = SubLObjectFactory.makeString("Sentence contains contradictory conjuncts");
        $kw42$LAZY = SubLObjectFactory.makeKeyword("LAZY");
        $kw43$FROM = SubLObjectFactory.makeKeyword("FROM");
        $kw44$RELATION_DIRECTION = SubLObjectFactory.makeKeyword("RELATION-DIRECTION");
        $kw45$COL_ARG = SubLObjectFactory.makeKeyword("COL-ARG");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $kw47$ARG_ORDER = SubLObjectFactory.makeKeyword("ARG-ORDER");
        $kw48$TYPE_COL_PRED = SubLObjectFactory.makeKeyword("TYPE-COL-PRED");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-ARG"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("THING"));
        $const50$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL1"), (SubLObject)SubLObjectFactory.makeSymbol("COL2"));
        $const52$CollectionUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionUnionFn"));
        $sym53$POSSIBLY_FIND_NART = SubLObjectFactory.makeSymbol("POSSIBLY-FIND-NART");
        $sym54$CATEGORIZE_SUBCOLLECTION_PREDICATE = SubLObjectFactory.makeSymbol("CATEGORIZE-SUBCOLLECTION-PREDICATE");
        $const55$SubcollectionOfWithRelationToType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToTypeFn"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.T);
        $const57$SubcollectionOfWithRelationFromTy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromTypeFn"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.T);
        $const59$SubcollectionOfWithoutRelationToT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithoutRelationToTypeFn"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.T, (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-SUBSET"), (SubLObject)plausibility_utilities.T);
        $const61$SubcollectionOfWithoutRelationFro = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithoutRelationFromTypeFn"));
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.T, (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-SUBSET"), (SubLObject)plausibility_utilities.T);
        $const63$SitTypeSpecWithTypeRestrictionOnR = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SitTypeSpecWithTypeRestrictionOnRolePlayerFn"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.T, (SubLObject)SubLObjectFactory.makeKeyword("TEMPORALLY-SANE?"), (SubLObject)plausibility_utilities.T);
        $const65$SubcollectionOfWithRelationToFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.NIL);
        $const67$SubcollectionOfWithRelationFromFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationFromFn"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.NIL);
        $const69$SubcollectionOfWithoutRelationToF = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithoutRelationToFn"));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-SUBSET"), (SubLObject)plausibility_utilities.T);
        $const71$SubcollectionOfWithoutRelationFro = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithoutRelationFromFn"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FROM"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INVERSE-SUBSET"), (SubLObject)plausibility_utilities.T);
        $const73$UsingAForFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UsingAForFn"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RELATION-DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("TO"), (SubLObject)SubLObjectFactory.makeKeyword("COL-ARG"), (SubLObject)plausibility_utilities.T, (SubLObject)SubLObjectFactory.makeKeyword("ARG-ORDER"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-COL-PRED"));
        $const75$ReifiableFunction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReifiableFunction"));
        $kw76$SUPPRESS_WFF_CHECKS_ = SubLObjectFactory.makeKeyword("SUPPRESS-WFF-CHECKS?");
        $kw77$SUPPRESS_WF_CHECKS_ = SubLObjectFactory.makeKeyword("SUPPRESS-WF-CHECKS?");
        $str78$__implausible_sentence_wrt_variab = SubLObjectFactory.makeString("~&implausible-sentence-wrt-variable-arguments: ~S~%");
        $str79$Variable_types_are_disjoint_ = SubLObjectFactory.makeString("Variable types are disjoint.");
        $kw80$SUPPRESS_WFT_CHECKS_ = SubLObjectFactory.makeKeyword("SUPPRESS-WFT-CHECKS?");
        $kw81$WFT_CHECK_TYPE = SubLObjectFactory.makeKeyword("WFT-CHECK-TYPE");
        $str82$__implausible_term_wrt_wft___S__ = SubLObjectFactory.makeString("~&implausible-term-wrt-wft: ~S~%");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IO-MODE"), (SubLObject)SubLObjectFactory.makeKeyword("NL"));
        $kw84$WFF_CHECK_TYPE = SubLObjectFactory.makeKeyword("WFF-CHECK-TYPE");
        $str85$__implausible_sentence_wrt_wff___ = SubLObjectFactory.makeString("~&implausible-sentence-wrt-wff: ~S~%");
        $const86$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $list87 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $const88$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list89 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLReifiedDenotationalTerm")));
        $const90$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $list91 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLClosedDenotationalTerm")));
        $const92$argIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa"));
        $const93$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $const94$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $const95$argSometimesIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argSometimesIsa"));
        $const96$unknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unknownSentence"));
        $kw97$MIN_CEILING_COLS = SubLObjectFactory.makeKeyword("MIN-CEILING-COLS");
        $const98$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $list99 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")));
        $list100 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")));
        $list101 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalDecompositions")));
        $list102 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectFoundInLocation")));
        $kw103$PRED = SubLObjectFactory.makeKeyword("PRED");
        $kw104$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $const105$typicallyMoreVoluminousThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typicallyMoreVoluminousThan"));
        $sym106$CLOSED_ = SubLObjectFactory.makeSymbol("CLOSED?");
        $sym107$ESOTERIC_TERM_ = SubLObjectFactory.makeSymbol("ESOTERIC-TERM?");
        $list108 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EsotericTerm")));
        $const109$EsotericTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EsotericTerm"));
        $const110$ExotericTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExotericTerm"));
        $sym111$CLEAR_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS = SubLObjectFactory.makeSymbol("CLEAR-TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS");
        $sym112$CLEAR_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED = SubLObjectFactory.makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED");
        $sym113$CLEAR_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED = SubLObjectFactory.makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED");
        $sym114$CLEAR_TVA_CHECK_CACHED = SubLObjectFactory.makeSymbol("CLEAR-TVA-CHECK-CACHED");
        $sym115$CLEAR_IMPLAUSIBLE_ADMITTED_ARGUMENT_ = SubLObjectFactory.makeSymbol("CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?");
        $sym116$CLEAR_DO_TVA_QUERY_TYPE_TYPE = SubLObjectFactory.makeSymbol("CLEAR-DO-TVA-QUERY-TYPE-TYPE");
        $sym117$CLEAR_DO_TVA_QUERY_TYPE_DISJOINT_WITH = SubLObjectFactory.makeSymbol("CLEAR-DO-TVA-QUERY-TYPE-DISJOINT-WITH");
        $str118$__tweak_implausibility_type_restr = SubLObjectFactory.makeString("~&tweak-implausibility-type-restrictions: ~A~%");
        $sym119$_TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS-CACHING-STATE*");
        $str120$__implied_argn_type_requirements_ = SubLObjectFactory.makeString("~&implied-argn-type-requirements-for-pred: ~A~%");
        $sym121$_IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED-CACHING-STATE*");
        $str122$__implied_argn_type_restrictions_ = SubLObjectFactory.makeString("~&implied-argn-type-restrictions-for-pred: ~A~%");
        $sym123$_IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED-CACHING-STATE*");
        $str124$__tva_check_cached___A__ = SubLObjectFactory.makeString("~&tva-check-cached: ~A~%");
        $sym125$_TVA_CHECK_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*TVA-CHECK-CACHED-CACHING-STATE*");
        $str126$__implausible_admitted_argument__ = SubLObjectFactory.makeString("~&implausible-admitted-argument?: ~A~%");
        $sym127$_IMPLAUSIBLE_ADMITTED_ARGUMENT__CACHING_STATE_ = SubLObjectFactory.makeSymbol("*IMPLAUSIBLE-ADMITTED-ARGUMENT?-CACHING-STATE*");
        $str128$__do_tva_query_type_type___A__ = SubLObjectFactory.makeString("~&do-tva-query-type-type: ~A~%");
        $sym129$_DO_TVA_QUERY_TYPE_TYPE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DO-TVA-QUERY-TYPE-TYPE-CACHING-STATE*");
        $str130$__do_tva_query_type_disjoint_with = SubLObjectFactory.makeString("~&do-tva-query-type-disjoint-with: ~A~%");
        $sym131$_DO_TVA_QUERY_TYPE_DISJOINT_WITH_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*DO-TVA-QUERY-TYPE-DISJOINT-WITH-CACHING-STATE*");
        $sym132$TWEAK_IMPLAUSIBILITY_TYPE_RESTRICTIONS = SubLObjectFactory.makeSymbol("TWEAK-IMPLAUSIBILITY-TYPE-RESTRICTIONS");
        $int133$4096 = SubLObjectFactory.makeInteger(4096);
        $sym134$IMPLIED_ARGN_TYPE_REQUIREMENTS_FOR_PRED = SubLObjectFactory.makeSymbol("IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED");
        $const135$relationNotExistsExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationNotExistsExists"));
        $sym136$IMPLIED_ARGN_TYPE_RESTRICTIONS_FOR_PRED = SubLObjectFactory.makeSymbol("IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED");
        $const137$relationAllExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists"));
        $const138$someTypePlaysRoleInSituationType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("someTypePlaysRoleInSituationType"));
        $list139 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PartiallyTangible")));
        $kw140$NONE = SubLObjectFactory.makeKeyword("NONE");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"));
        $sym142$TVA_CHECK_CACHED = SubLObjectFactory.makeSymbol("TVA-CHECK-CACHED");
        $sym143$IMPLAUSIBLE_ADMITTED_ARGUMENT_ = SubLObjectFactory.makeSymbol("IMPLAUSIBLE-ADMITTED-ARGUMENT?");
        $sym144$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $int145$8192 = SubLObjectFactory.makeInteger(8192);
        $str146$hl_justify_asent_not_legal_to_cal = SubLObjectFactory.makeString("hl-justify-asent not legal to call within inference to avoid infinite recursion");
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), (SubLObject)SubLObjectFactory.makeKeyword("HL"), (SubLObject)SubLObjectFactory.makeKeyword("RETURN"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPORTS"), (SubLObject)SubLObjectFactory.makeKeyword("RESULT-UNIQUENESS"), (SubLObject)SubLObjectFactory.makeKeyword("PROOF"), (SubLObject)SubLObjectFactory.makeKeyword("MAX-NUMBER"), (SubLObject)plausibility_utilities.ONE_INTEGER);
        $kw148$CONDITIONAL_SENTENCE_ = SubLObjectFactory.makeKeyword("CONDITIONAL-SENTENCE?");
        $str149$Could_not_find_hl_support_for__S_ = SubLObjectFactory.makeString("Could not find hl-support for ~S in ~S, using :OPAQUE");
    }
}

/*

	Total time: 1045 ms
	
*/