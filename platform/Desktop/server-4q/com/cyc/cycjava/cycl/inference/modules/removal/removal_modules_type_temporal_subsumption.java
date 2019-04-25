package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.hlmt_relevance;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_type_temporal_subsumption extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption";
    public static final String myFingerPrint = "efae72f8f77143e2b7d587957ec170eec753a7f1712b066ca67bfcd5e13dc62e";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 1734L)
    private static SubLSymbol $default_temporally_subsumes_typetype_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 6060L)
    private static SubLSymbol $default_temporally_subsumes_instype_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 10132L)
    private static SubLSymbol $default_temporally_subsumed_by_instype_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13931L)
    private static SubLSymbol $time_point_subsumed_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14379L)
    private static SubLSymbol $null_param_subsumes_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14702L)
    private static SubLSymbol $temporally_subsumes_typetype_reflexive_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14932L)
    private static SubLSymbol $rae_defining_temporally_subsumes_typetype_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15256L)
    private static SubLSymbol $temporal_subsumption_of_sliding_types_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15629L)
    private static SubLSymbol $period_plus_duration_subsumes_gappy_type$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22402L)
    private static SubLSymbol $always_subsumes_everything_support$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22730L)
    private static SubLSymbol $time_point_subsumed_by_everything_support$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22967L)
    private static SubLSymbol $cooriginating_interval_of_lesser_duration_is_subsumed_support$;
    private static final SubLSymbol $kw0$TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE;
    private static final SubLList $list7;
    private static final SubLObject $const8$TimeParameter;
    private static final SubLSymbol $kw9$REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS;
    private static final SubLList $list12;
    private static final SubLSymbol $kw13$TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS;
    private static final SubLList $list20;
    private static final SubLObject $const21$temporallySubsumedBy_InsType;
    private static final SubLSymbol $kw22$POS;
    private static final SubLSymbol $kw23$REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK;
    private static final SubLList $list24;
    private static final SubLObject $const25$Null_TimeParameter;
    private static final SubLObject $const26$TimePoint;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLObject $const29$temporallySubsumes_TypeType;
    private static final SubLSymbol $kw30$UNINITIALIZED;
    private static final SubLSymbol $sym31$_TIME_POINT_SUBSUMED_RULE_;
    private static final SubLSymbol $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$_NULL_PARAM_SUBSUMES_RULE_;
    private static final SubLSymbol $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_;
    private static final SubLSymbol $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_;
    private static final SubLSymbol $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_;
    private static final SubLSymbol $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_;
    private static final SubLSymbol $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$TRANSITIVITY;
    private static final SubLObject $const50$UniversalVocabularyMt;
    private static final SubLSymbol $kw51$EVAL;
    private static final SubLObject $const52$lessThanOrEqualTo;
    private static final SubLObject $const53$evaluate;
    private static final SubLObject $const54$QuotientFn;
    private static final SubLList $list55;
    private static final SubLObject $const56$TimesFn;
    private static final SubLSymbol $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE;
    private static final SubLSymbol $kw58$TIME;
    private static final SubLSymbol $kw59$ISA;
    private static final SubLObject $const60$isa;
    private static final SubLList $list61;
    private static final SubLSymbol $kw62$QUERY;
    private static final SubLObject $const63$periodOfTimeIntervalSeries;
    private static final SubLObject $const64$durationOfType;
    private static final SubLObject $const65$PlusFn;
    private static final SubLSymbol $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE;
    private static final SubLSymbol $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_;
    private static final SubLSymbol $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_;
    private static final SubLSymbol $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_;
    private static final SubLSymbol $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I;
    private static final SubLList $list75;
    private static final SubLObject $const76$Always_TimeInterval;
    private static final SubLObject $const77$temporallySubsumes;
    private static final SubLSymbol $kw78$OPAQUE;
    private static final SubLObject $const79$duration;
    private static final SubLObject $const80$thereExists;
    private static final SubLSymbol $sym81$_INTERVAL;
    private static final SubLObject $const82$and;
    private static final SubLObject $const83$temporallyCooriginating;
    private static final SubLSymbol $kw84$DEPTH_FIRST;
    private static final SubLObject $const85$temporallySubsumes_InsType;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 3650L)
    public static SubLObject inference_temporally_subsumes_typetype(final SubLObject type) {
        return all_types_temporally_subsumed_by_type(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 3767L)
    public static SubLObject removal_temporally_subsumes_typetype_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_temporal_subsumption.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        }
        return Numbers.divide(Sequences.length(isa.all_fort_instances(removal_modules_type_temporal_subsumption.$const8$TimeParameter, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED)), (SubLObject)removal_modules_type_temporal_subsumption.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 4958L)
    public static SubLObject inference_temporally_subsumed_typetype(final SubLObject type) {
        return all_types_temporally_subsuming_type(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 5073L)
    public static SubLObject removal_temporally_subsumed_typetype_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_temporal_subsumption.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        }
        return Numbers.divide(Sequences.length(isa.all_fort_instances(removal_modules_type_temporal_subsumption.$const8$TimeParameter, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED)), (SubLObject)removal_modules_type_temporal_subsumption.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 8062L)
    public static SubLObject inference_temporally_subsumes_instype_generate_types(final SubLObject interval) {
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 8228L)
    public static SubLObject removal_temporally_subsumes_instype_generate_types_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_temporal_subsumption.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        }
        return (SubLObject)removal_modules_type_temporal_subsumption.TEN_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 9430L)
    public static SubLObject inference_temporally_subsumed_instype_generate_intervals(final SubLObject type) {
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 9592L)
    public static SubLObject removal_temporally_subsumed_instype_generate_intervals_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_type_temporal_subsumption.UNPROVIDED) {
            sense = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        }
        return (SubLObject)removal_modules_type_temporal_subsumption.TEN_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 11120L)
    public static SubLObject all_types_temporally_subsumed_by_type(final SubLObject type) {
        if (type.eql(removal_modules_type_temporal_subsumption.$const25$Null_TimeParameter)) {
            return isa.all_fort_instances(removal_modules_type_temporal_subsumption.$const8$TimeParameter, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        }
        if (type.eql(removal_modules_type_temporal_subsumption.$const26$TimePoint)) {
            return (SubLObject)removal_modules_type_temporal_subsumption.$list27;
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(type)) {
            return all_types_subsumed_by_sliding_type(type);
        }
        return all_types_subsumed_by_conventional_type(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 11967L)
    public static SubLObject all_types_temporally_subsuming_type(final SubLObject type) {
        if (type.eql(removal_modules_type_temporal_subsumption.$const25$Null_TimeParameter)) {
            return (SubLObject)removal_modules_type_temporal_subsumption.$list28;
        }
        if (type.eql(removal_modules_type_temporal_subsumption.$const26$TimePoint)) {
            return isa.all_fort_instances(removal_modules_type_temporal_subsumption.$const8$TimeParameter, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(type)) {
            return all_types_subsuming_sliding_type(type);
        }
        return all_types_subsuming_conventional_type(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12459L)
    public static SubLObject all_intervals_temporally_subsuming_type(final SubLObject type) {
        return (SubLObject)ConsesLow.list(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12693L)
    public static SubLObject all_types_temporally_subsumed_by_interval(final SubLObject interval) {
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 12899L)
    public static SubLObject all_types_subsumed_by_sliding_type(final SubLObject type) {
        final SubLObject params = isa.all_fort_instances(removal_modules_type_temporal_subsumption.$const8$TimeParameter, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        SubLObject cdolist_list_var = params;
        SubLObject param = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        param = cdolist_list_var.first();
        while (removal_modules_type_temporal_subsumption.NIL != cdolist_list_var) {
            if (removal_modules_type_temporal_subsumption.NIL != hlmt_relevance.bigger_time_typeP(type, param)) {
                result = (SubLObject)ConsesLow.cons(param, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13218L)
    public static SubLObject all_types_subsumed_by_conventional_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)removal_modules_type_temporal_subsumption.T, thread);
            result = gt_methods.gt_all_superiors(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, type, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        }
        finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13424L)
    public static SubLObject all_types_subsuming_sliding_type(final SubLObject type) {
        final SubLObject params = isa.all_fort_instances(removal_modules_type_temporal_subsumption.$const8$TimeParameter, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        SubLObject result = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        SubLObject cdolist_list_var = params;
        SubLObject param = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        param = cdolist_list_var.first();
        while (removal_modules_type_temporal_subsumption.NIL != cdolist_list_var) {
            if (removal_modules_type_temporal_subsumption.NIL != hlmt_relevance.bigger_time_typeP(param, type)) {
                result = (SubLObject)ConsesLow.cons(param, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            param = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13727L)
    public static SubLObject all_types_subsuming_conventional_type(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        final SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)removal_modules_type_temporal_subsumption.T, thread);
            result = gt_methods.gt_all_inferiors(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, type, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        }
        finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 13931L)
    public static SubLObject time_point_subsumed_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list33, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14379L)
    public static SubLObject null_param_subsumes_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list36, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14702L)
    public static SubLObject temporally_subsumes_typetype_reflexive_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list39, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 14932L)
    public static SubLObject rae_defining_temporally_subsumes_typetype_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list42, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15256L)
    public static SubLObject temporal_subsumption_of_sliding_types_ruleX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list45, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 15629L)
    public static SubLObject period_plus_duration_subsumes_gappy_typeX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list48, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 16099L)
    public static SubLObject why_bigger_time_typeP(final SubLObject big, final SubLObject small) {
        return why_temporally_subsumes_typetypeP(big, small);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 16359L)
    public static SubLObject why_temporally_subsumes_typetypeP(final SubLObject big, final SubLObject small) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (big.equal(small)) {
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$temporally_subsumes_typetype_reflexive_rule$.getDynamicValue(thread));
        }
        if (big.eql(removal_modules_type_temporal_subsumption.$const25$Null_TimeParameter)) {
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$null_param_subsumes_rule$.getDynamicValue(thread));
        }
        if (small.eql(removal_modules_type_temporal_subsumption.$const26$TimePoint)) {
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$time_point_subsumed_rule$.getDynamicValue(thread));
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(big) && removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(small)) {
            return why_sliding_time_typeLE(small, big);
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.conventional_time_series_p(big) && removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(small)) {
            return why_covering_type_subsumes_sliding_typeP(big, small);
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(big) && removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.conventional_time_series_p(small)) {
            return why_sliding_type_subsumes_covering_typeP(big, small);
        }
        return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw49$TRANSITIVITY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, big, small), removal_modules_type_temporal_subsumption.$const50$UniversalVocabularyMt, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 17446L)
    public static SubLObject why_sliding_time_typeLE(final SubLObject small, final SubLObject big) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject small_unit = time_parameter_utilities.extract_sliding_time_type(small);
        final SubLObject big_unit = time_parameter_utilities.extract_sliding_time_type(big);
        final SubLObject small_amount = time_parameter_utilities.extract_sliding_type_amount(small);
        final SubLObject big_amount = time_parameter_utilities.extract_sliding_type_amount(big);
        if (small_unit.eql(big_unit)) {
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), removal_modules_type_temporal_subsumption.$temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const52$lessThanOrEqualTo, small_amount, big_amount), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.duration_typeL(small_unit, big_unit)) {
            final SubLObject quotient = time_parameter_utilities.find_duration_quotient(small_unit, big_unit, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
            final SubLObject product = Numbers.multiply(quotient, big_amount);
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), removal_modules_type_temporal_subsumption.$temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const53$evaluate, quotient, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const54$QuotientFn, reader.bq_cons(big_unit, (SubLObject)removal_modules_type_temporal_subsumption.$list55), reader.bq_cons(small_unit, (SubLObject)removal_modules_type_temporal_subsumption.$list55))), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const53$evaluate, (SubLObject)ConsesLow.list(small_unit, product), (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const56$TimesFn, (SubLObject)ConsesLow.list(small_unit, quotient), big_amount)), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const52$lessThanOrEqualTo, small_amount, product), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
        }
        final SubLObject quotient = time_parameter_utilities.find_duration_quotient(big_unit, small_unit, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        final SubLObject product = Numbers.multiply(quotient, small_amount);
        return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$rae_defining_temporally_subsumes_typetype_rule$.getDynamicValue(thread), removal_modules_type_temporal_subsumption.$temporal_subsumption_of_sliding_types_rule$.getDynamicValue(thread), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const53$evaluate, quotient, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const54$QuotientFn, reader.bq_cons(small_unit, (SubLObject)removal_modules_type_temporal_subsumption.$list55), reader.bq_cons(big_unit, (SubLObject)removal_modules_type_temporal_subsumption.$list55))), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const53$evaluate, (SubLObject)ConsesLow.list(big_unit, product), (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const56$TimesFn, (SubLObject)ConsesLow.list(big_unit, quotient), small_amount)), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const52$lessThanOrEqualTo, product, big_amount), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 19179L)
    public static SubLObject why_covering_type_subsumes_sliding_typeP(final SubLObject covering_type, final SubLObject sliding_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumed_sliding_type = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        final SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)removal_modules_type_temporal_subsumption.T, thread);
            subsumed_sliding_type = gt_methods.gt_gather_superior(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, covering_type, (SubLObject)removal_modules_type_temporal_subsumption.$sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, removal_modules_type_temporal_subsumption.$const50$UniversalVocabularyMt);
        }
        finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_type_temporal_subsumption.NIL != subsumed_sliding_type) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw49$TRANSITIVITY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, covering_type, subsumed_sliding_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw58$TIME, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, subsumed_sliding_type, sliding_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
        }
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 19925L)
    public static SubLObject first_parameterGEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) && removal_modules_type_temporal_subsumption.NIL != hlmt_relevance.sliding_time_typeLE(hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread), time_parameter)) {
            return time_parameter;
        }
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 20156L)
    public static SubLObject why_sliding_type_subsumes_covering_typeP(final SubLObject sliding_type, final SubLObject covering_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.gappy_time_type_p(covering_type)) {
            final SubLObject min_subsuming_slider = hlmt_relevance.minimally_subsuming_sliding_type_for_gappy_type(covering_type);
            SubLObject result = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
            if (removal_modules_type_temporal_subsumption.NIL != hlmt_relevance.sliding_time_typeLE(min_subsuming_slider, sliding_type)) {
                final SubLObject period_dur = time_parameter_utilities.gappy_type_period(covering_type);
                final SubLObject type_dur = time_parameter_utilities.gappy_type_duration(covering_type);
                result = (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$period_plus_duration_subsumes_gappy_type$.getDynamicValue(thread), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw59$ISA, (SubLObject)ConsesLow.listS(removal_modules_type_temporal_subsumption.$const60$isa, sliding_type, (SubLObject)removal_modules_type_temporal_subsumption.$list61), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw62$QUERY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const63$periodOfTimeIntervalSeries, covering_type, period_dur), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw62$QUERY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const64$durationOfType, covering_type, type_dur), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const53$evaluate, time_parameter_utilities.extract_sliding_type(min_subsuming_slider), (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const65$PlusFn, period_dur, type_dur)), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
                if (!min_subsuming_slider.equal(sliding_type)) {
                    result = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw58$TIME, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, sliding_type, min_subsuming_slider), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), result);
                }
                return result;
            }
        }
        SubLObject subsuming_sliding_type = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        final SubLObject _prev_bind_0 = hlmt_relevance.$hlmt_sliding_type$.currentBinding(thread);
        final SubLObject _prev_bind_2 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
        try {
            hlmt_relevance.$hlmt_sliding_type$.bind(sliding_type, thread);
            gt_vars.$suspend_gt_type_checkingP$.bind((SubLObject)removal_modules_type_temporal_subsumption.T, thread);
            subsuming_sliding_type = gt_methods.gt_gather_inferior(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, covering_type, (SubLObject)removal_modules_type_temporal_subsumption.$sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE, removal_modules_type_temporal_subsumption.$const50$UniversalVocabularyMt);
        }
        finally {
            gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_2, thread);
            hlmt_relevance.$hlmt_sliding_type$.rebind(_prev_bind_0, thread);
        }
        if (removal_modules_type_temporal_subsumption.NIL != subsuming_sliding_type) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw49$TRANSITIVITY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, subsuming_sliding_type, covering_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw58$TIME, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const29$temporallySubsumes_TypeType, sliding_type, subsuming_sliding_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
        }
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22171L)
    public static SubLObject first_parameterLEprevious_sliding_type(final SubLObject time_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_type_temporal_subsumption.NIL != time_parameter_utilities.sliding_time_type_p(time_parameter) && removal_modules_type_temporal_subsumption.NIL != hlmt_relevance.sliding_time_typeLE(time_parameter, hlmt_relevance.$hlmt_sliding_type$.getDynamicValue(thread))) {
            return time_parameter;
        }
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22402L)
    public static SubLObject always_subsumes_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list69, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22730L)
    public static SubLObject time_point_subsumed_by_everything_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list72, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 22967L)
    public static SubLObject cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer() {
        return hl_supports.find_assertion_or_make_support((SubLObject)removal_modules_type_temporal_subsumption.$list75, hlmt_relevance.$time_inference_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 23459L)
    public static SubLObject why_time_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        return why_temporally_subsumes_instypeP(interval, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 23700L)
    public static SubLObject why_temporally_subsumes_instypeP(final SubLObject interval, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (interval.eql(removal_modules_type_temporal_subsumption.$const76$Always_TimeInterval)) {
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$always_subsumes_everything_support$.getDynamicValue(thread));
        }
        if (type.eql(removal_modules_type_temporal_subsumption.$const26$TimePoint)) {
            return (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$time_point_subsumed_by_everything_support$.getDynamicValue(thread));
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_interval_utilities.date_interval_p(interval)) {
            return why_date_interval_subsumes_typeP(interval, type);
        }
        return why_arbitrary_interval_subsumes_typeP(interval, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 24338L)
    public static SubLObject why_date_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        final SubLObject witness = time_parameter_utilities.nth_type_starting_no_earlier_than_start_of_interval(interval, type, (SubLObject)removal_modules_type_temporal_subsumption.ZERO_INTEGER);
        return (SubLObject)(witness.equal(interval) ? ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw59$ISA, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const60$isa, witness, type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED)) : ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw59$ISA, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const60$isa, witness, type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw58$TIME, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const77$temporallySubsumes, interval, witness), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 25834L)
    public static SubLObject interval_subsumes_cooriginating_type_justification(final SubLObject type, final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type_duration = time_parameter_utilities.get_duration_of_type(type);
        final SubLObject interval_duration = time_parameter_utilities.get_duration_of_interval(interval);
        return (SubLObject)((removal_modules_type_temporal_subsumption.NIL != type_duration && removal_modules_type_temporal_subsumption.NIL != interval_duration) ? ConsesLow.list(make_cooriginating_interval_support(type, interval), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw62$QUERY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const64$durationOfType, type, type_duration), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw78$OPAQUE, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const79$duration, interval, interval_duration), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw51$EVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const52$lessThanOrEqualTo, type_duration, interval_duration), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), removal_modules_type_temporal_subsumption.$cooriginating_interval_of_lesser_duration_is_subsumed_support$.getDynamicValue(thread)) : removal_modules_type_temporal_subsumption.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 26462L)
    public static SubLObject make_cooriginating_interval_support(final SubLObject type, final SubLObject interval) {
        return arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw78$OPAQUE, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const80$thereExists, (SubLObject)removal_modules_type_temporal_subsumption.$sym81$_INTERVAL, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const82$and, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const60$isa, (SubLObject)removal_modules_type_temporal_subsumption.$sym81$_INTERVAL, type), (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const83$temporallyCooriginating, (SubLObject)removal_modules_type_temporal_subsumption.$sym81$_INTERVAL, interval))), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-type-temporal-subsumption.lisp", position = 26697L)
    public static SubLObject why_arbitrary_interval_subsumes_typeP(final SubLObject interval, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject subsumed_type = (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        final SubLObject iterator = ghl_search_methods.new_ghl_closure_iterator(removal_modules_type_temporal_subsumption.$const77$temporallySubsumes, interval, ghl_search_vars.ghl_forward_direction(), (SubLObject)removal_modules_type_temporal_subsumption.NIL, (SubLObject)removal_modules_type_temporal_subsumption.NIL, (SubLObject)removal_modules_type_temporal_subsumption.$kw84$DEPTH_FIRST, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED);
        SubLObject valid;
        for (SubLObject done_var = subsumed_type; removal_modules_type_temporal_subsumption.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_type_temporal_subsumption.NIL == valid || removal_modules_type_temporal_subsumption.NIL != subsumed_type)) {
            thread.resetMultipleValues();
            final SubLObject subsumed_interval = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (removal_modules_type_temporal_subsumption.NIL != valid && removal_modules_type_temporal_subsumption.NIL != hlmt_relevance.arbitrary_interval_subsumes_typeP_int(subsumed_type, type)) {
                subsumed_type = subsumed_interval;
            }
        }
        if (removal_modules_type_temporal_subsumption.NIL == subsumed_type) {
            return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
        }
        if (removal_modules_type_temporal_subsumption.NIL != time_interval_utilities.date_interval_p(subsumed_type)) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw49$TRANSITIVITY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const77$temporallySubsumes, interval, subsumed_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw58$TIME, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const85$temporallySubsumes_InsType, subsumed_type, type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
        }
        return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)removal_modules_type_temporal_subsumption.$kw49$TRANSITIVITY, (SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const77$temporallySubsumes, interval, subsumed_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED, (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED), czer_meta.find_assertion_cycl((SubLObject)ConsesLow.list(removal_modules_type_temporal_subsumption.$const85$temporallySubsumes_InsType, interval, subsumed_type), (SubLObject)removal_modules_type_temporal_subsumption.UNPROVIDED));
    }
    
    public static SubLObject declare_removal_modules_type_temporal_subsumption_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "inference_temporally_subsumes_typetype", "INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "removal_temporally_subsumes_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "inference_temporally_subsumed_typetype", "INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "removal_temporally_subsumed_typetype_cost", "REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "inference_temporally_subsumes_instype_generate_types", "INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "removal_temporally_subsumes_instype_generate_types_cost", "REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "inference_temporally_subsumed_instype_generate_intervals", "INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "removal_temporally_subsumed_instype_generate_intervals_cost", "REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_temporally_subsumed_by_type", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_temporally_subsuming_type", "ALL-TYPES-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_intervals_temporally_subsuming_type", "ALL-INTERVALS-TEMPORALLY-SUBSUMING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_temporally_subsumed_by_interval", "ALL-TYPES-TEMPORALLY-SUBSUMED-BY-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_subsumed_by_sliding_type", "ALL-TYPES-SUBSUMED-BY-SLIDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_subsumed_by_conventional_type", "ALL-TYPES-SUBSUMED-BY-CONVENTIONAL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_subsuming_sliding_type", "ALL-TYPES-SUBSUMING-SLIDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "all_types_subsuming_conventional_type", "ALL-TYPES-SUBSUMING-CONVENTIONAL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "time_point_subsumed_ruleX_initializer", "*TIME-POINT-SUBSUMED-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "null_param_subsumes_ruleX_initializer", "*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "temporally_subsumes_typetype_reflexive_ruleX_initializer", "*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "rae_defining_temporally_subsumes_typetype_ruleX_initializer", "*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "temporal_subsumption_of_sliding_types_ruleX_initializer", "*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "period_plus_duration_subsumes_gappy_typeX_initializer", "*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_bigger_time_typeP", "WHY-BIGGER-TIME-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_temporally_subsumes_typetypeP", "WHY-TEMPORALLY-SUBSUMES-TYPETYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_sliding_time_typeLE", "WHY-SLIDING-TIME-TYPE<=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_covering_type_subsumes_sliding_typeP", "WHY-COVERING-TYPE-SUBSUMES-SLIDING-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "first_parameterGEprevious_sliding_type", "FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_sliding_type_subsumes_covering_typeP", "WHY-SLIDING-TYPE-SUBSUMES-COVERING-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "first_parameterLEprevious_sliding_type", "FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "always_subsumes_everything_supportX_initializer", "*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "time_point_subsumed_by_everything_supportX_initializer", "*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "cooriginating_interval_of_lesser_duration_is_subsumed_supportX_initializer", "*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_time_interval_subsumes_typeP", "WHY-TIME-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_temporally_subsumes_instypeP", "WHY-TEMPORALLY-SUBSUMES-INSTYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_date_interval_subsumes_typeP", "WHY-DATE-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "interval_subsumes_cooriginating_type_justification", "INTERVAL-SUBSUMES-COORIGINATING-TYPE-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "make_cooriginating_interval_support", "MAKE-COORIGINATING-INTERVAL-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_type_temporal_subsumption", "why_arbitrary_interval_subsumes_typeP", "WHY-ARBITRARY-INTERVAL-SUBSUMES-TYPE?", 2, 0, false);
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    public static SubLObject init_removal_modules_type_temporal_subsumption_file() {
        removal_modules_type_temporal_subsumption.$default_temporally_subsumes_typetype_check_cost$ = SubLFiles.defparameter("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*", (SubLObject)removal_modules_type_temporal_subsumption.ONE_INTEGER);
        removal_modules_type_temporal_subsumption.$default_temporally_subsumes_instype_check_cost$ = SubLFiles.defparameter("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*", (SubLObject)removal_modules_type_temporal_subsumption.ONE_INTEGER);
        removal_modules_type_temporal_subsumption.$default_temporally_subsumed_by_instype_check_cost$ = SubLFiles.defparameter("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*", (SubLObject)removal_modules_type_temporal_subsumption.ONE_INTEGER);
        removal_modules_type_temporal_subsumption.$time_point_subsumed_rule$ = SubLFiles.defvar("*TIME-POINT-SUBSUMED-RULE*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$null_param_subsumes_rule$ = SubLFiles.defvar("*NULL-PARAM-SUBSUMES-RULE*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$temporally_subsumes_typetype_reflexive_rule$ = SubLFiles.defvar("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$rae_defining_temporally_subsumes_typetype_rule$ = SubLFiles.defvar("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$temporal_subsumption_of_sliding_types_rule$ = SubLFiles.defvar("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$period_plus_duration_subsumes_gappy_type$ = SubLFiles.defvar("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$always_subsumes_everything_support$ = SubLFiles.defvar("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$time_point_subsumed_by_everything_support$ = SubLFiles.defvar("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        removal_modules_type_temporal_subsumption.$cooriginating_interval_of_lesser_duration_is_subsumed_support$ = SubLFiles.defvar("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*", (SubLObject)removal_modules_type_temporal_subsumption.$kw30$UNINITIALIZED);
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    public static SubLObject setup_removal_modules_type_temporal_subsumption_file() {
        preference_modules.inference_preference_module((SubLObject)removal_modules_type_temporal_subsumption.$kw0$TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS, (SubLObject)removal_modules_type_temporal_subsumption.$list1);
        preference_modules.inference_preference_module((SubLObject)removal_modules_type_temporal_subsumption.$kw2$TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS, (SubLObject)removal_modules_type_temporal_subsumption.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw4$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK, (SubLObject)removal_modules_type_temporal_subsumption.$list5);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw6$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE, (SubLObject)removal_modules_type_temporal_subsumption.$list7);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw9$REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE, (SubLObject)removal_modules_type_temporal_subsumption.$list10);
        preference_modules.inference_preference_module((SubLObject)removal_modules_type_temporal_subsumption.$kw11$TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS, (SubLObject)removal_modules_type_temporal_subsumption.$list12);
        preference_modules.inference_preference_module((SubLObject)removal_modules_type_temporal_subsumption.$kw13$TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS, (SubLObject)removal_modules_type_temporal_subsumption.$list14);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw15$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK, (SubLObject)removal_modules_type_temporal_subsumption.$list16);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw17$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES, (SubLObject)removal_modules_type_temporal_subsumption.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw19$REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS, (SubLObject)removal_modules_type_temporal_subsumption.$list20);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_type_temporal_subsumption.$const21$temporallySubsumedBy_InsType);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_type_temporal_subsumption.$kw22$POS, removal_modules_type_temporal_subsumption.$const21$temporallySubsumedBy_InsType);
        inference_modules.inference_removal_module((SubLObject)removal_modules_type_temporal_subsumption.$kw23$REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK, (SubLObject)removal_modules_type_temporal_subsumption.$list24);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym31$_TIME_POINT_SUBSUMED_RULE_, (SubLObject)removal_modules_type_temporal_subsumption.$sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym34$_NULL_PARAM_SUBSUMES_RULE_, (SubLObject)removal_modules_type_temporal_subsumption.$sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_, (SubLObject)removal_modules_type_temporal_subsumption.$sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_, (SubLObject)removal_modules_type_temporal_subsumption.$sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_, (SubLObject)removal_modules_type_temporal_subsumption.$sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_, (SubLObject)removal_modules_type_temporal_subsumption.$sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_, (SubLObject)removal_modules_type_temporal_subsumption.$sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_, (SubLObject)removal_modules_type_temporal_subsumption.$sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER);
        utilities_macros.register_kb_variable_initialization((SubLObject)removal_modules_type_temporal_subsumption.$sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_, (SubLObject)removal_modules_type_temporal_subsumption.$sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I);
        return (SubLObject)removal_modules_type_temporal_subsumption.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_type_temporal_subsumption_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_type_temporal_subsumption_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_type_temporal_subsumption_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_type_temporal_subsumption();
        removal_modules_type_temporal_subsumption.$default_temporally_subsumes_typetype_check_cost$ = null;
        removal_modules_type_temporal_subsumption.$default_temporally_subsumes_instype_check_cost$ = null;
        removal_modules_type_temporal_subsumption.$default_temporally_subsumed_by_instype_check_cost$ = null;
        removal_modules_type_temporal_subsumption.$time_point_subsumed_rule$ = null;
        removal_modules_type_temporal_subsumption.$null_param_subsumes_rule$ = null;
        removal_modules_type_temporal_subsumption.$temporally_subsumes_typetype_reflexive_rule$ = null;
        removal_modules_type_temporal_subsumption.$rae_defining_temporally_subsumes_typetype_rule$ = null;
        removal_modules_type_temporal_subsumption.$temporal_subsumption_of_sliding_types_rule$ = null;
        removal_modules_type_temporal_subsumption.$period_plus_duration_subsumes_gappy_type$ = null;
        removal_modules_type_temporal_subsumption.$always_subsumes_everything_support$ = null;
        removal_modules_type_temporal_subsumption.$time_point_subsumed_by_everything_support$ = null;
        removal_modules_type_temporal_subsumption.$cooriginating_interval_of_lesser_duration_is_subsumed_support$ = null;
        $kw0$TEMPORALLY_SUBSUMES_TYPETYPE_DELAY_POS = SubLObjectFactory.makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-DELAY-POS");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw2$TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE_POS = SubLObjectFactory.makeKeyword("TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE-POS");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw4$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-TYPETYPE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BIG"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("BIGGER-TIME-TYPE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes-TypeType TYPE1 TYPE2)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes-TypeType #$CalendarDay #$CalendarHour)") });
        $kw6$REMOVAL_TEMPORALLY_SUBSUMES_TYPETYPE_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-GENERATE");
        $list7 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-TYPETYPE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("BIG")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-TYPETYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("BIG")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes-TypeType TYPE ?X)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes-TypeType #$CalendarDay ?WHAT) ->\n    #$CalendarHour, #$CalendarMinute, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 1)), etc ") });
        $const8$TimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeParameter"));
        $kw9$REMOVAL_TEMPORALLY_SUBSUMED_TYPETYPE_GENERATE = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-GENERATE");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-TYPETYPE-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-TYPETYPE"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("SMALL"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes-TypeType ?X TYPE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes-TypeType ?WHAT #$CalendarDay) ->\n    #$CalendarWeek, #$CalendarMonth, (#$SameLengthTimeIntervalTypeFn (#$DaysDuration 2)), etc") });
        $kw11$TEMPORALLY_SUBSUMES_INSTYPE_DELAY_POS = SubLObjectFactory.makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-DELAY-POS");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("DISALLOWED"));
        $kw13$TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_POS = SubLObjectFactory.makeKeyword("TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-POS");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"))), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw15$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-CHECK");
        $list16 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMES-INSTYPE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-INTERVAL-SUBSUMES-TYPE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes-InsType INTERVAL TYPE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes-InsType #$TheYear2000 #$CalendarYear)") });
        $kw17$REMOVAL_TEMPORALLY_SUBSUMES_INSTYPE_GENERATE_TYPES = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TEMPORALLY-SUBSUMES-INSTYPE-GENERATE-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes-InsType Interval ?X)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes-InsType #$TheYear2000 ?WHAT) ->\n    #$CalendarYear, #$CalendarDay, (#$SameLengthTimeIntervalTypeFn (#$YearsDuration 1)), etc") });
        $kw19$REMOVAL_TEMPORALLY_SUBSUMED_INSTYPE_GENERATE_INTERVALS = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS-COST"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-TEMPORALLY-SUBSUMED-INSTYPE-GENERATE-INTERVALS"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes-InsType ?WHAT TYPE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes-InsType ?WHAT #$CalendarDay) ->\n    #$TheYear2000, (#$DayFn 4 (#$MonthFn #$July (#$YearFn 1776))), etc") });
        $const21$temporallySubsumedBy_InsType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumedBy-InsType"));
        $kw22$POS = SubLObjectFactory.makeKeyword("POS");
        $kw23$REMOVAL_TEMPORALLY_SUBSUMED_BY_INSTYPE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK");
        $list24 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumedBy-InsType")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumedBy-InsType")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-TEMPORALLY-SUBSUMED-BY-INSTYPE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumedBy-InsType")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-INTERVAL-SUBSUMED-BY-TYPE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumedBy-InsType INTERVAL TYPE)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumedBy-InsType #$TheYear2000 #$CalendarYear)") });
        $const25$Null_TimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter"));
        $const26$TimePoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $list27 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")));
        $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter")));
        $const29$temporallySubsumes_TypeType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType"));
        $kw30$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym31$_TIME_POINT_SUBSUMED_RULE_ = SubLObjectFactory.makeSymbol("*TIME-POINT-SUBSUMED-RULE*");
        $sym32$_TIME_POINT_SUBSUMED_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER");
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeParameter"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"))));
        $sym34$_NULL_PARAM_SUBSUMES_RULE_ = SubLObjectFactory.makeSymbol("*NULL-PARAM-SUBSUMES-RULE*");
        $sym35$_NULL_PARAM_SUBSUMES_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER");
        $list36 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeParameter"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter")), (SubLObject)SubLObjectFactory.makeSymbol("?X"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter")), (SubLObject)SubLObjectFactory.makeSymbol("?X")));
        $sym37$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE_ = SubLObjectFactory.makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*");
        $sym38$_TEMPORALLY_SUBSUMES_TYPETYPE_REFLEXIVE_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER");
        $list39 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate")));
        $sym40$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE_ = SubLObjectFactory.makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*");
        $sym41$_RAE_DEFINING_TEMPORALLY_SUBSUMES_TYPETYPE_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER");
        $list42 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)SubLObjectFactory.makeSymbol("?LONGER-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SHORTER-TYPE")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)SubLObjectFactory.makeSymbol("?LONGER-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?SHORTER-TYPE")));
        $sym43$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE_ = SubLObjectFactory.makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*");
        $sym44$_TEMPORAL_SUBSUMPTION_OF_SLIDING_TYPES_RULE__INITIALIZER = SubLObjectFactory.makeSymbol("*TEMPORAL-SUBSUMPTION-OF-SLIDING-TYPES-RULE*-INITIALIZER");
        $list45 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INT1"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SameLengthTimeIntervalTypeFn")), (SubLObject)SubLObjectFactory.makeSymbol("?DUR1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INT2"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SameLengthTimeIntervalTypeFn")), (SubLObject)SubLObjectFactory.makeSymbol("?DUR2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo")), (SubLObject)SubLObjectFactory.makeSymbol("?DUR1"), (SubLObject)SubLObjectFactory.makeSymbol("?DUR2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)SubLObjectFactory.makeSymbol("?INT2"), (SubLObject)SubLObjectFactory.makeSymbol("?INT1")));
        $sym46$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE_ = SubLObjectFactory.makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*");
        $sym47$_PERIOD_PLUS_DURATION_SUBSUMES_GAPPY_TYPE__INITIALIZER = SubLObjectFactory.makeSymbol("*PERIOD-PLUS-DURATION-SUBSUMES-GAPPY-TYPE*-INITIALIZER");
        $list48 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("periodOfTimeIntervalSeries")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?DURATION1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("durationOfType")), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("?DURATION2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-TypeType")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SameLengthTimeIntervalTypeFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn")), (SubLObject)SubLObjectFactory.makeSymbol("?DURATION1"), (SubLObject)SubLObjectFactory.makeSymbol("?DURATION2"))), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE")));
        $kw49$TRANSITIVITY = SubLObjectFactory.makeKeyword("TRANSITIVITY");
        $const50$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $kw51$EVAL = SubLObjectFactory.makeKeyword("EVAL");
        $const52$lessThanOrEqualTo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo"));
        $const53$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $const54$QuotientFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuotientFn"));
        $list55 = ConsesLow.list((SubLObject)removal_modules_type_temporal_subsumption.ONE_INTEGER);
        $const56$TimesFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimesFn"));
        $sym57$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = SubLObjectFactory.makeSymbol("FIRST-PARAMETER>=PREVIOUS-SLIDING-TYPE");
        $kw58$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw59$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const60$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps")));
        $kw62$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $const63$periodOfTimeIntervalSeries = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("periodOfTimeIntervalSeries"));
        $const64$durationOfType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("durationOfType"));
        $const65$PlusFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusFn"));
        $sym66$FIRST_PARAMETER__PREVIOUS_SLIDING_TYPE = SubLObjectFactory.makeSymbol("FIRST-PARAMETER<=PREVIOUS-SLIDING-TYPE");
        $sym67$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT_ = SubLObjectFactory.makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*");
        $sym68$_ALWAYS_SUBSUMES_EVERYTHING_SUPPORT__INITIALIZER = SubLObjectFactory.makeSymbol("*ALWAYS-SUBSUMES-EVERYTHING-SUPPORT*-INITIALIZER");
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("timeSlices")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval")));
        $sym70$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT_ = SubLObjectFactory.makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*");
        $sym71$_TIME_POINT_SUBSUMED_BY_EVERYTHING_SUPPORT__INITIALIZER = SubLObjectFactory.makeSymbol("*TIME-POINT-SUBSUMED-BY-EVERYTHING-SUPPORT*-INITIALIZER");
        $list72 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")));
        $sym73$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT_ = SubLObjectFactory.makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*");
        $sym74$_COORIGINATING_INTERVAL_OF_LESSER_DURATION_IS_SUBSUMED_SUPPORT__I = SubLObjectFactory.makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER");
        $list75 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL1"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL2"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL1"), (SubLObject)SubLObjectFactory.makeSymbol("?DUR1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL2"), (SubLObject)SubLObjectFactory.makeSymbol("?DUR2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lessThanOrEqualTo")), (SubLObject)SubLObjectFactory.makeSymbol("?DUR2"), (SubLObject)SubLObjectFactory.makeSymbol("?DUR1")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyCooriginating")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL1"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL2"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL1"), (SubLObject)SubLObjectFactory.makeSymbol("?INTERVAL2")));
        $const76$Always_TimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $const77$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $kw78$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const79$duration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration"));
        $const80$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym81$_INTERVAL = SubLObjectFactory.makeSymbol("?INTERVAL");
        $const82$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const83$temporallyCooriginating = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyCooriginating"));
        $kw84$DEPTH_FIRST = SubLObjectFactory.makeKeyword("DEPTH-FIRST");
        $const85$temporallySubsumes_InsType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes-InsType"));
    }
}

/*

	Total time: 220 ms
	
*/