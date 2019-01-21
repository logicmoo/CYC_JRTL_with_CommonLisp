package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hlmt extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hlmt";
    public static final String myFingerPrint = "1cca2fc37bdc707c590465ff6f48830c4079d267e9c072419dc0331e7ac428db";
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1234L)
    public static SubLSymbol $hlmts_supportedP$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1917L)
    public static SubLSymbol $default_monad_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1996L)
    public static SubLSymbol $default_temporal_mt_time_parameter$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2077L)
    public static SubLSymbol $default_atemporal_time_parameter$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2156L)
    public static SubLSymbol $default_atemporal_genlmt_time_parameter$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2233L)
    public static SubLSymbol $default_atemporal_specmt_time_parameter$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2319L)
    public static SubLSymbol $default_mt_time_interval$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2391L)
    public static SubLSymbol $default_mt_time_parameter$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2463L)
    private static SubLSymbol $mt_space_function$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2530L)
    private static SubLSymbol $temporal_dimension_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2629L)
    private static SubLSymbol $mt_dimension_types$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 2886L)
    private static SubLSymbol $mt_dimension_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 3093L)
    private static SubLSymbol $context_space_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 3252L)
    private static SubLSymbol $anytime_psc$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 3311L)
    private static SubLSymbol $anytime_during_psc_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 3377L)
    private static SubLSymbol $unindexed_hlmt_syntax_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20764L)
    private static SubLSymbol $reduce_mt_union_hlmt_int_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25548L)
    private static SubLSymbol $temporal_dimension_predicates$;
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLObject $const2$UniversalVocabularyMt;
    private static final SubLObject $const3$Null_TimeParameter;
    private static final SubLObject $const4$TimePoint;
    private static final SubLObject $const5$Always_TimeInterval;
    private static final SubLObject $const6$MtSpace;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLObject $const10$AnytimePSC;
    private static final SubLObject $const11$AnytimeDuringPSCFn;
    private static final SubLList $list12;
    private static final SubLObject $const13$MtUnionFn;
    private static final SubLObject $const14$MtTimeWithGranularityDimFn;
    private static final SubLObject $const15$MtTimeDimFn;
    private static final SubLSymbol $sym16$LISTP;
    private static final SubLSymbol $sym17$MT_UNION_MTS_RECURSIVE_INT;
    private static final SubLSymbol $sym18$UNION_MT_RELEVANCE_CONTEXTS;
    private static final SubLObject $const19$EverythingPSC;
    private static final SubLObject $const20$InferencePSC;
    private static final SubLSymbol $sym21$ANYTIME_PSC_HLMT_;
    private static final SubLSymbol $sym22$HLMT_MONAD_MT;
    private static final SubLObject $const23$MicrotheoryDimensionPredicate;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw27$DONE;
    private static final SubLSymbol $sym28$ARGS;
    private static final SubLSymbol $sym29$ARG;
    private static final SubLSymbol $sym30$PCOND;
    private static final SubLSymbol $sym31$MONAD_MT_P;
    private static final SubLSymbol $sym32$PUNLESS;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$MT_DIM_NAUT_P;
    private static final SubLSymbol $sym35$MT_DIM_NAT_DIMENSION;
    private static final SubLSymbol $sym36$MT_SPACE_NAUT_P;
    private static final SubLSymbol $sym37$NAUT_ARGS;
    private static final SubLSymbol $sym38$CSOME;
    private static final SubLSymbol $sym39$MT_DIMENSION_OF_ARG;
    private static final SubLSymbol $sym40$COR;
    private static final SubLSymbol $sym41$ANYTIME_PSC_P;
    private static final SubLSymbol $sym42$ANYTIME_DURING_PSC_FN_NAUT_P;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$CLOSED_POSSIBLY_HLMT_P;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$DO_MT_DIMENSIONS;
    private static final SubLSymbol $kw47$MONAD;
    private static final SubLSymbol $kw48$TIME;
    private static final SubLSymbol $kw49$UNKNOWN;
    private static final SubLObject $const50$MtDim;
    private static final SubLObject $const51$mtMonad;
    private static final SubLObject $const52$mtTimeIndex;
    private static final SubLObject $const53$mtTimeParameter;
    private static final SubLSymbol $sym54$HLMT_DIMENSIONS;
    private static final SubLSymbol $sym55$INTERESTING_HLMT_;
    private static final SubLSymbol $sym56$REDUCE_MT_UNION_HLMT_INT;
    private static final SubLSymbol $sym57$_REDUCE_MT_UNION_HLMT_INT_CACHING_STATE_;
    private static final SubLSymbol $sym58$CLEAR_REDUCE_MT_UNION_HLMT_INT;
    private static final SubLSymbol $sym59$MONAD_MT_;
    private static final SubLObject $const60$Microtheory;
    private static final SubLList $list61;
    private static final SubLObject $const62$TimeInterval;
    private static final SubLObject $const63$TemporalThing;
    private static final SubLObject $const64$TimeParameter;
    private static final SubLObject $const65$SomeTimeInIntervalFn;
    private static final SubLSymbol $sym66$INDETERMINATE_TIME_INTERVAL_P;
    private static final SubLString $str67$Continue_Anyway_;
    private static final SubLString $str68$We_should_never_test_two_some_tim;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$CMULTIPLE_VALUE_SETQ;
    private static final SubLSymbol $sym71$MT_TIME_DIM_NAT_TEMPORAL_VALUES;
    private static final SubLString $str72$DIM_NAT__a_is_not_a_microtheory_t;
    private static final SubLSymbol $kw73$ERROR;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS;
    private static final SubLSymbol $sym76$HLMT_MONAD_MT_WITHOUT_DEFAULT;
    private static final SubLSymbol $sym77$EXPLODE_HLMT_TEMPORAL_FACETS;
    private static final SubLList $list78;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$PROGN;
    private static final SubLSymbol $sym81$IGNORE;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLList $list84;
    private static final SubLString $str85$HLMT_Tests;
    private static final SubLString $str86$HLMT_Test_Suite;
    private static final SubLList $list87;
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1418L)
    public static SubLObject hlmts_supportedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hlmt.$hlmts_supportedP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1532L)
    public static SubLObject with_hlmts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)hlmt.$list1, ConsesLow.append(body, (SubLObject)hlmt.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1629L)
    public static SubLObject enable_hlmts() {
        hlmt.$hlmts_supportedP$.setDynamicValue((SubLObject)hlmt.T);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 1835L)
    public static SubLObject disable_hlmts() {
        hlmt.$hlmts_supportedP$.setDynamicValue((SubLObject)hlmt.NIL);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 3730L)
    public static SubLObject unindexed_hlmt_syntax_constants() {
        return hlmt.$unindexed_hlmt_syntax_constants$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 3912L)
    public static SubLObject unindexed_hlmt_syntax_constant_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, hlmt.$unindexed_hlmt_syntax_constants$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 4028L)
    public static SubLObject fully_indexed_hlmt_term_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_indexing_datastructures.fully_indexed_term_p(v_object) && hlmt.NIL == unindexed_hlmt_syntax_constant_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 4327L)
    public static SubLObject mt_space_function_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$mt_space_function$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 4531L)
    public static SubLObject possibly_mt_p(final SubLObject v_object) {
        return possibly_hlmt_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 4629L)
    public static SubLObject possibly_hlmt_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_fo_naut_p(v_object) || hlmt.NIL != hlmt_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 4829L)
    public static SubLObject fort_or_chlmt_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != forts.fort_p(v_object) || hlmt.NIL != closed_hlmt_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 4996L)
    public static SubLObject chlmt_p(final SubLObject v_object) {
        return closed_hlmt_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 5100L)
    public static SubLObject closed_hlmt_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != hlmt_p(v_object) && hlmt.NIL != variables.cycl_ground_expression_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 5271L)
    public static SubLObject closed_possibly_hlmt_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != possibly_hlmt_p(v_object) && hlmt.NIL != variables.cycl_ground_expression_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 5473L)
    public static SubLObject hlmt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (hlmt.NIL != hlmt.$hlmts_supportedP$.getDynamicValue(thread)) ? hlmt_p_time(v_object) : hlmt_p_no_time(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 5785L)
    public static SubLObject hlmt_p_no_time(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != forts.valid_fortP(v_object) || hlmt.NIL != mt_union_naut_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 6006L)
    public static SubLObject hlmt_p_time(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != forts.valid_fortP(v_object) || hlmt.NIL != hlmt_naut_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 6106L)
    public static SubLObject possibly_hlmt_naut_p(final SubLObject v_object) {
        if (hlmt.NIL != el_utilities.possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != context_space_function_p(functor) || hlmt.NIL != mt_union_function_p(functor) || hlmt.NIL != anytime_during_psc_fn_p(functor));
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 6374L)
    public static SubLObject hlmt_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != possibly_hlmt_naut_p(v_object) && (hlmt.NIL != mt_space_naut_p(v_object) || hlmt.NIL != mt_dim_naut_p(v_object) || hlmt.NIL != mt_union_naut_p(v_object) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 6618L)
    public static SubLObject mt_space_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(v_object) && hlmt.NIL != mt_space_function_p(cycl_utilities.naut_functor(v_object)) && hlmt.NIL != mt_space_naut_arglist_p(cycl_utilities.naut_args(v_object, (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 6811L)
    public static SubLObject mt_space_naut_arglist_p(final SubLObject args) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == args || (hlmt.NIL != hlmt_p(args.first()) && hlmt.NIL != mt_space_naut_arglist_p(args.rest())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7002L)
    public static SubLObject mt_dim_naut_p(final SubLObject v_object) {
        if (hlmt.NIL != el_utilities.possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            if (hlmt.NIL != mt_dimension_function_p(functor)) {
                return (SubLObject)hlmt.T;
            }
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7192L)
    public static SubLObject mt_union_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(v_object) && hlmt.NIL != mt_union_function_p(cycl_utilities.naut_functor(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7324L)
    public static SubLObject mt_union_function_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$const13$MtUnionFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7405L)
    public static SubLObject hlmtP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != cycl_grammar.cycl_represented_term_p(v_object) && hlmt.NIL != hlmtP_int(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7688L)
    public static SubLObject hlmtP_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (hlmt.NIL != hlmt.$hlmts_supportedP$.getDynamicValue(thread)) ? hlmtP_time(v_object) : hlmtP_no_time(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7814L)
    public static SubLObject hlmtP_no_time(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != hlmt_p(v_object) && (hlmt.NIL != monad_mtP(v_object) || hlmt.NIL != mt_union_nautP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 7950L)
    public static SubLObject hlmtP_time(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != hlmt_p(v_object) && (hlmt.NIL != monad_mtP(v_object) || hlmt.NIL != hlmt_nautP(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 8075L)
    public static SubLObject hlmt_nautP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != mt_space_mtP(v_object) || hlmt.NIL != mt_dim_mtP(v_object) || hlmt.NIL != mt_union_nautP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 8209L)
    public static SubLObject mt_space_mtP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(v_object) && hlmt.NIL != mt_space_function_p(cycl_utilities.naut_functor(v_object)) && hlmt.NIL != mt_space_arglistP(cycl_utilities.naut_args(v_object, (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 8389L)
    public static SubLObject mt_space_arglistP(final SubLObject args) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == args || (hlmt.NIL != hlmtP_int(args.first()) && hlmt.NIL != mt_space_arglistP(args.rest())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 8571L)
    public static SubLObject mt_dim_mtP(final SubLObject v_object) {
        if (hlmt.NIL != el_utilities.possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != mt_dimension_function_p(functor) && hlmt.NIL != mt_dim_arglistP(functor, cycl_utilities.naut_args(v_object, (SubLObject)hlmt.UNPROVIDED)));
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 8802L)
    public static SubLObject mt_dim_arglistP(final SubLObject functor, final SubLObject args) {
        if (functor.eql(hlmt.$const14$MtTimeWithGranularityDimFn)) {
            return valid_mt_time_with_granularity_dim_arglistP(args);
        }
        if (functor.eql(hlmt.$const15$MtTimeDimFn)) {
            return valid_mt_time_dim_arglistP(args);
        }
        return list_utilities.lengthE(args, arity.arity(functor), (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 9103L)
    public static SubLObject mt_union_nautP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(v_object) && hlmt.NIL != mt_union_function_p(cycl_utilities.naut_functor(v_object)) && hlmt.NIL != mt_union_arglistP(cycl_utilities.naut_args(v_object, (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 9285L)
    public static SubLObject mt_union_arglistP(final SubLObject args) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == args || (hlmt.NIL != hlmtP_int(args.first()) && hlmt.NIL != mt_union_arglistP(args.rest())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 9467L)
    public static SubLObject hlmt_equal(final SubLObject object0, final SubLObject object1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hlmt.NIL != hlmt.$hlmts_supportedP$.getDynamicValue(thread)) {
            return Equality.equal(object0, object1);
        }
        return kb_utilities.kbeq(object0, object1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 9713L)
    public static SubLObject hlmt_equalP(final SubLObject object0, final SubLObject object1) {
        if (hlmt.NIL != hlmt_equal(object0, object1)) {
            return (SubLObject)hlmt.T;
        }
        if (hlmt.NIL != monad_mt_p(object0) && hlmt.NIL != monad_mt_p(object1)) {
            return (SubLObject)hlmt.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != equal_mt_monads_p(object0, object1) && hlmt.NIL != equal_mt_times_p(object0, object1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 10320L)
    public static SubLObject new_hlmt(final SubLObject mt_dimensions) {
        assert hlmt.NIL != Types.listp(mt_dimensions) : mt_dimensions;
        return (SubLObject)ConsesLow.cons(hlmt.$mt_space_function$.getGlobalValue(), mt_dimensions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 10529L)
    public static SubLObject copy_hlmt(final SubLObject v_hlmt) {
        return conses_high.copy_tree(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 10693L)
    public static SubLObject new_anytime_during_psc_naut(final SubLObject time_interval) {
        return el_utilities.make_unary_formula(hlmt.$anytime_during_psc_fn$.getGlobalValue(), time_interval);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 10821L)
    public static SubLObject anytime_psc() {
        return hlmt.$anytime_psc$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 10875L)
    public static SubLObject mt_union_mts(final SubLObject mt_union_hlmt) {
        return cycl_utilities.naut_args(mt_union_hlmt, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 10964L)
    public static SubLObject mt_union_mts_recursive(final SubLObject mt_union_naut) {
        return Mapping.mapcan((SubLObject)hlmt.$sym17$MT_UNION_MTS_RECURSIVE_INT, mt_union_mts(mt_union_naut), hlmt.EMPTY_SUBL_OBJECT_ARRAY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 11095L)
    public static SubLObject mt_union_mts_recursive_int(final SubLObject v_object) {
        return (SubLObject)((hlmt.NIL != mt_union_naut_p(v_object)) ? mt_union_mts_recursive(v_object) : ConsesLow.list(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 11241L)
    public static SubLObject union_mt_relevance_contexts(final SubLObject mt_relevance_contexts) {
        if (hlmt.NIL != list_utilities.member_kbeqP(hlmt.$const19$EverythingPSC, mt_relevance_contexts)) {
            return hlmt.$const19$EverythingPSC;
        }
        if (hlmt.NIL != list_utilities.member_kbeqP(hlmt.$const20$InferencePSC, mt_relevance_contexts)) {
            return hlmt.$const20$InferencePSC;
        }
        if (hlmt.NIL != list_utilities.doubletonP(mt_relevance_contexts) && hlmt.NIL != genl_mts.genl_mtP(mt_relevance_contexts.first(), conses_high.second(mt_relevance_contexts), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED)) {
            return mt_relevance_contexts.first();
        }
        if (hlmt.NIL != list_utilities.doubletonP(mt_relevance_contexts) && hlmt.NIL != genl_mts.genl_mtP(conses_high.second(mt_relevance_contexts), mt_relevance_contexts.first(), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED)) {
            return conses_high.second(mt_relevance_contexts);
        }
        if (hlmt.NIL != Sequences.find_if((SubLObject)hlmt.$sym21$ANYTIME_PSC_HLMT_, mt_relevance_contexts, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED)) {
            return new_temporal_hlmt((SubLObject)ConsesLow.cons(hlmt.$const13$MtUnionFn, Mapping.mapcar((SubLObject)hlmt.$sym22$HLMT_MONAD_MT, mt_relevance_contexts)), anytime_psc(), (SubLObject)hlmt.NIL);
        }
        return (SubLObject)ConsesLow.cons(hlmt.$const13$MtUnionFn, mt_relevance_contexts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 12025L)
    public static SubLObject mt_dimension_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, hlmt.$mt_dimension_types$.getGlobalValue(), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 12345L)
    public static SubLObject mt_dimension_types() {
        return hlmt.$mt_dimension_types$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 12416L)
    public static SubLObject mt_dimension_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, hlmt.$mt_dimension_functions$.getGlobalValue(), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 12516L)
    public static SubLObject context_space_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, hlmt.$context_space_functions$.getGlobalValue(), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 12618L)
    public static SubLObject mt_dimension_predicate_p(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, hlmt.$const23$MicrotheoryDimensionPredicate, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 12734L)
    public static SubLObject do_mt_dimensions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dim_var = (SubLObject)hlmt.NIL;
        SubLObject val_var = (SubLObject)hlmt.NIL;
        SubLObject v_hlmt = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list24);
        dim_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list24);
        val_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list24);
        v_hlmt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)hlmt.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)hlmt.NIL;
        SubLObject current_$1 = (SubLObject)hlmt.NIL;
        while (hlmt.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hlmt.$list24);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)hlmt.$list24);
            if (hlmt.NIL == conses_high.member(current_$1, (SubLObject)hlmt.$list25, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED)) {
                bad = (SubLObject)hlmt.T;
            }
            if (current_$1 == hlmt.$kw26$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (hlmt.NIL != bad && hlmt.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list24);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)hlmt.$kw27$DONE, current);
        final SubLObject done = (SubLObject)((hlmt.NIL != done_tail) ? conses_high.cadr(done_tail) : hlmt.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject args = (SubLObject)hlmt.$sym28$ARGS;
        final SubLObject arg = (SubLObject)hlmt.$sym29$ARG;
        return (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym30$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hlmt.$sym31$MONAD_MT_P, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym32$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(dim_var, (SubLObject)hlmt.$list33), (SubLObject)ConsesLow.list(val_var, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hlmt.$sym34$MT_DIM_NAUT_P, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym32$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dim_var, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym35$MT_DIM_NAT_DIMENSION, v_hlmt)), (SubLObject)ConsesLow.list(val_var, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hlmt.$sym36$MT_SPACE_NAUT_P, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(args, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym37$NAUT_ARGS, v_hlmt))), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym38$CSOME, (SubLObject)ConsesLow.list(arg, args, done), (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(dim_var, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym39$MT_DIMENSION_OF_ARG, arg)), (SubLObject)ConsesLow.list(val_var, arg)), ConsesLow.append(body, (SubLObject)hlmt.NIL))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hlmt.$sym40$COR, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym41$ANYTIME_PSC_P, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym42$ANYTIME_DURING_PSC_FN_NAUT_P, v_hlmt)), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym32$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(dim_var, (SubLObject)hlmt.$list43), (SubLObject)ConsesLow.list(val_var, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL)))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hlmt.$sym44$CLOSED_POSSIBLY_HLMT_P, v_hlmt), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym32$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(dim_var, (SubLObject)hlmt.$list33), (SubLObject)ConsesLow.list(val_var, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL)))), (SubLObject)ConsesLow.list((SubLObject)hlmt.T, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym32$PUNLESS, done, (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(dim_var, (SubLObject)hlmt.$list45), (SubLObject)ConsesLow.list(val_var, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 13934L)
    public static SubLObject mt_dimension_of_arg(final SubLObject arg) {
        if (hlmt.NIL != monad_mt_p(arg)) {
            return (SubLObject)hlmt.$kw47$MONAD;
        }
        if (hlmt.NIL != temporal_dimension_mt_p(arg)) {
            return (SubLObject)hlmt.$kw48$TIME;
        }
        return (SubLObject)hlmt.$kw49$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 14129L)
    public static SubLObject single_dimension_mt_dimension(final SubLObject sfd_mt) {
        if (hlmt.NIL != monad_mt_p(sfd_mt)) {
            return (SubLObject)hlmt.$kw47$MONAD;
        }
        if (hlmt.NIL != el_utilities.possibly_naut_p(sfd_mt)) {
            return mt_dim_nat_dimension(sfd_mt);
        }
        return (SubLObject)hlmt.$kw49$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 14437L)
    public static SubLObject mt_dim_nat_dimension(final SubLObject mt_dim_nat) {
        if (hlmt.NIL != anytime_psc_p(mt_dim_nat)) {
            return (SubLObject)hlmt.$kw48$TIME;
        }
        final SubLObject pcase_var;
        final SubLObject functor = pcase_var = cycl_utilities.naut_functor(mt_dim_nat);
        if (pcase_var.eql(hlmt.$const14$MtTimeWithGranularityDimFn) || pcase_var.eql(hlmt.$const15$MtTimeDimFn) || pcase_var.eql(hlmt.$const11$AnytimeDuringPSCFn)) {
            return (SubLObject)hlmt.$kw48$TIME;
        }
        if (!pcase_var.eql(hlmt.$const50$MtDim)) {
            return (SubLObject)hlmt.NIL;
        }
        final SubLObject pcase_var_$2;
        final SubLObject pred = pcase_var_$2 = cycl_utilities.nat_arg1(mt_dim_nat, (SubLObject)hlmt.UNPROVIDED);
        if (pcase_var_$2.eql(hlmt.$const51$mtMonad)) {
            return (SubLObject)hlmt.$kw47$MONAD;
        }
        if (pcase_var_$2.eql(hlmt.$const52$mtTimeIndex) || pcase_var_$2.eql(hlmt.$const53$mtTimeParameter)) {
            return (SubLObject)hlmt.$kw48$TIME;
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 15140L)
    public static SubLObject get_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt) {
        SubLObject mt = (SubLObject)hlmt.NIL;
        SubLObject foundP = (SubLObject)hlmt.NIL;
        if (hlmt.NIL != monad_mt_p(v_hlmt)) {
            if (hlmt.NIL == foundP) {
                final SubLObject dim_var = (SubLObject)hlmt.$kw47$MONAD;
                if (hlmt.NIL != kb_utilities.kbeq(dim, dim_var)) {
                    mt = v_hlmt;
                    foundP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL != mt_dim_naut_p(v_hlmt)) {
            if (hlmt.NIL == foundP) {
                final SubLObject dim_var = mt_dim_nat_dimension(v_hlmt);
                if (hlmt.NIL != kb_utilities.kbeq(dim, dim_var)) {
                    mt = v_hlmt;
                    foundP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
            final SubLObject args = cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED);
            if (hlmt.NIL == foundP) {
                SubLObject csome_list_var = args;
                SubLObject arg = (SubLObject)hlmt.NIL;
                arg = csome_list_var.first();
                while (hlmt.NIL == foundP && hlmt.NIL != csome_list_var) {
                    final SubLObject dim_var2 = mt_dimension_of_arg(arg);
                    final SubLObject mt_var = arg;
                    if (hlmt.NIL != kb_utilities.kbeq(dim, dim_var2)) {
                        mt = mt_var;
                        foundP = (SubLObject)hlmt.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    arg = csome_list_var.first();
                }
            }
        }
        else if (hlmt.NIL != anytime_psc_p(v_hlmt) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_hlmt)) {
            if (hlmt.NIL == foundP) {
                final SubLObject dim_var = (SubLObject)hlmt.$kw48$TIME;
                if (hlmt.NIL != kb_utilities.kbeq(dim, dim_var)) {
                    mt = v_hlmt;
                    foundP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL != closed_possibly_hlmt_p(v_hlmt)) {
            if (hlmt.NIL == foundP) {
                final SubLObject dim_var = (SubLObject)hlmt.$kw47$MONAD;
                if (hlmt.NIL != kb_utilities.kbeq(dim, dim_var)) {
                    mt = v_hlmt;
                    foundP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL == foundP) {
            final SubLObject dim_var = (SubLObject)hlmt.$kw49$UNKNOWN;
            if (hlmt.NIL != kb_utilities.kbeq(dim, dim_var)) {
                mt = v_hlmt;
                foundP = (SubLObject)hlmt.T;
            }
        }
        return mt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 15467L)
    public static SubLObject hlmt_dimensions(final SubLObject v_hlmt) {
        if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
            return Mapping.mapcan((SubLObject)hlmt.$sym54$HLMT_DIMENSIONS, cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED), hlmt.EMPTY_SUBL_OBJECT_ARRAY);
        }
        return (SubLObject)ConsesLow.list(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 15672L)
    public static SubLObject remove_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt) {
        final SubLObject dimensions = hlmt_dimensions(v_hlmt);
        final SubLObject doomed_dimension = get_hlmt_dimension(dim, v_hlmt);
        return new_reduced_hlmt(Sequences.remove(doomed_dimension, dimensions, Symbols.symbol_function((SubLObject)hlmt.EQUAL), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 16056L)
    public static SubLObject replace_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt, final SubLObject val) {
        final SubLObject dimensions = hlmt_dimensions(v_hlmt);
        final SubLObject doomed_dimension = get_hlmt_dimension(dim, v_hlmt);
        final SubLObject truncated_dimensions = Sequences.remove(doomed_dimension, dimensions, Symbols.symbol_function((SubLObject)hlmt.EQUAL), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
        final SubLObject new_dimensions = (SubLObject)ConsesLow.cons(val, truncated_dimensions);
        return new_reduced_hlmt(new_dimensions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 16559L)
    public static SubLObject replace_monad_dimension(final SubLObject v_hlmt, final SubLObject monad) {
        return (hlmt.NIL != forts.fort_p(v_hlmt)) ? monad : replace_hlmt_dimension((SubLObject)hlmt.$kw47$MONAD, v_hlmt, monad);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 16700L)
    public static SubLObject replace_time_dimension(final SubLObject v_hlmt, final SubLObject time_index, SubLObject time_parameter) {
        if (time_parameter == hlmt.UNPROVIDED) {
            time_parameter = (SubLObject)hlmt.NIL;
        }
        final SubLObject time_dimension = new_time_dimension(time_index, time_parameter);
        return replace_hlmt_dimension((SubLObject)hlmt.$kw48$TIME, v_hlmt, time_dimension);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 16919L)
    public static SubLObject default_values_for_dimension_p(final SubLObject dim, final SubLObject val) {
        if (dim.eql((SubLObject)hlmt.$kw47$MONAD)) {
            return default_monad_mt_p(val);
        }
        if (dim.eql((SubLObject)hlmt.$kw48$TIME)) {
            return default_time_mt_p(val);
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 17229L)
    public static SubLObject some_interesting_hlmtP(final SubLObject hlmts) {
        return list_utilities.any_in_list((SubLObject)hlmt.$sym55$INTERESTING_HLMT_, hlmts, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 17426L)
    public static SubLObject interesting_hlmtP(final SubLObject v_hlmt) {
        SubLObject interestingP = (SubLObject)hlmt.NIL;
        if (hlmt.NIL != monad_mt_p(v_hlmt)) {
            if (hlmt.NIL == interestingP) {
                final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
                if (hlmt.NIL == monad_dimension_p(dim) && hlmt.NIL == default_values_for_dimension_p(dim, v_hlmt)) {
                    interestingP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL != mt_dim_naut_p(v_hlmt)) {
            if (hlmt.NIL == interestingP) {
                final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                if (hlmt.NIL == monad_dimension_p(dim) && hlmt.NIL == default_values_for_dimension_p(dim, v_hlmt)) {
                    interestingP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
            final SubLObject args = cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED);
            if (hlmt.NIL == interestingP) {
                SubLObject csome_list_var = args;
                SubLObject arg = (SubLObject)hlmt.NIL;
                arg = csome_list_var.first();
                while (hlmt.NIL == interestingP && hlmt.NIL != csome_list_var) {
                    final SubLObject dim2 = mt_dimension_of_arg(arg);
                    final SubLObject val = arg;
                    if (hlmt.NIL == monad_dimension_p(dim2) && hlmt.NIL == default_values_for_dimension_p(dim2, val)) {
                        interestingP = (SubLObject)hlmt.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    arg = csome_list_var.first();
                }
            }
        }
        else if (hlmt.NIL != anytime_psc_p(v_hlmt) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_hlmt)) {
            if (hlmt.NIL == interestingP) {
                final SubLObject dim = (SubLObject)hlmt.$kw48$TIME;
                if (hlmt.NIL == monad_dimension_p(dim) && hlmt.NIL == default_values_for_dimension_p(dim, v_hlmt)) {
                    interestingP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL != closed_possibly_hlmt_p(v_hlmt)) {
            if (hlmt.NIL == interestingP) {
                final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
                if (hlmt.NIL == monad_dimension_p(dim) && hlmt.NIL == default_values_for_dimension_p(dim, v_hlmt)) {
                    interestingP = (SubLObject)hlmt.T;
                }
            }
        }
        else if (hlmt.NIL == interestingP) {
            final SubLObject dim = (SubLObject)hlmt.$kw49$UNKNOWN;
            if (hlmt.NIL == monad_dimension_p(dim) && hlmt.NIL == default_values_for_dimension_p(dim, v_hlmt)) {
                interestingP = (SubLObject)hlmt.T;
            }
        }
        return interestingP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 17764L)
    public static SubLObject assertion_hlmt(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return augment_hlmt(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 17972L)
    public static SubLObject hlmt_has_dimension_of_valueP(final SubLObject v_hlmt, final SubLObject dimension, final SubLObject value) {
        SubLObject dimension_of_valueP = (SubLObject)hlmt.NIL;
        if (hlmt.NIL != monad_mt_p(v_hlmt)) {
            if (hlmt.NIL == dimension_of_valueP) {
                final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
                dimension_of_valueP = (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(dim, dimension) && hlmt.NIL != hlmt_equal(v_hlmt, value));
            }
        }
        else if (hlmt.NIL != mt_dim_naut_p(v_hlmt)) {
            if (hlmt.NIL == dimension_of_valueP) {
                final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                dimension_of_valueP = (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(dim, dimension) && hlmt.NIL != hlmt_equal(v_hlmt, value));
            }
        }
        else if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
            final SubLObject args = cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED);
            if (hlmt.NIL == dimension_of_valueP) {
                SubLObject csome_list_var = args;
                SubLObject arg = (SubLObject)hlmt.NIL;
                arg = csome_list_var.first();
                while (hlmt.NIL == dimension_of_valueP && hlmt.NIL != csome_list_var) {
                    final SubLObject dim2 = mt_dimension_of_arg(arg);
                    final SubLObject val = arg;
                    dimension_of_valueP = (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(dim2, dimension) && hlmt.NIL != hlmt_equal(val, value));
                    csome_list_var = csome_list_var.rest();
                    arg = csome_list_var.first();
                }
            }
        }
        else if (hlmt.NIL != anytime_psc_p(v_hlmt) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_hlmt)) {
            if (hlmt.NIL == dimension_of_valueP) {
                final SubLObject dim = (SubLObject)hlmt.$kw48$TIME;
                dimension_of_valueP = (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(dim, dimension) && hlmt.NIL != hlmt_equal(v_hlmt, value));
            }
        }
        else if (hlmt.NIL != closed_possibly_hlmt_p(v_hlmt)) {
            if (hlmt.NIL == dimension_of_valueP) {
                final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
                dimension_of_valueP = (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(dim, dimension) && hlmt.NIL != hlmt_equal(v_hlmt, value));
            }
        }
        else if (hlmt.NIL == dimension_of_valueP) {
            final SubLObject dim = (SubLObject)hlmt.$kw49$UNKNOWN;
            dimension_of_valueP = (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(dim, dimension) && hlmt.NIL != hlmt_equal(v_hlmt, value));
        }
        return dimension_of_valueP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 18262L)
    public static SubLObject augment_hlmt(final SubLObject v_hlmt) {
        SubLObject remaining_dimensions = conses_high.copy_list(hlmt.$mt_dimension_types$.getGlobalValue());
        SubLObject dimensions = (SubLObject)hlmt.NIL;
        if (hlmt.NIL != monad_mt_p(v_hlmt)) {
            final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
            remaining_dimensions = Sequences.delete(dim, remaining_dimensions, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
            dimensions = (SubLObject)ConsesLow.cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
        }
        else if (hlmt.NIL != mt_dim_naut_p(v_hlmt)) {
            final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
            remaining_dimensions = Sequences.delete(dim, remaining_dimensions, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
            dimensions = (SubLObject)ConsesLow.cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
        }
        else if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
            SubLObject csome_list_var;
            final SubLObject args = csome_list_var = cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED);
            SubLObject arg = (SubLObject)hlmt.NIL;
            arg = csome_list_var.first();
            while (hlmt.NIL != csome_list_var) {
                final SubLObject dim2 = mt_dimension_of_arg(arg);
                final SubLObject val = arg;
                remaining_dimensions = Sequences.delete(dim2, remaining_dimensions, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
                dimensions = (SubLObject)ConsesLow.cons(possibly_augment_dimension(dim2, val), dimensions);
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        else if (hlmt.NIL != anytime_psc_p(v_hlmt) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_hlmt)) {
            final SubLObject dim = (SubLObject)hlmt.$kw48$TIME;
            remaining_dimensions = Sequences.delete(dim, remaining_dimensions, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
            dimensions = (SubLObject)ConsesLow.cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
        }
        else if (hlmt.NIL != closed_possibly_hlmt_p(v_hlmt)) {
            final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
            remaining_dimensions = Sequences.delete(dim, remaining_dimensions, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
            dimensions = (SubLObject)ConsesLow.cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
        }
        else {
            final SubLObject dim = (SubLObject)hlmt.$kw49$UNKNOWN;
            remaining_dimensions = Sequences.delete(dim, remaining_dimensions, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
            dimensions = (SubLObject)ConsesLow.cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
        }
        SubLObject cdolist_list_var = remaining_dimensions;
        SubLObject dim3 = (SubLObject)hlmt.NIL;
        dim3 = cdolist_list_var.first();
        while (hlmt.NIL != cdolist_list_var) {
            dimensions = (SubLObject)ConsesLow.cons(default_dimension_mt(dim3), dimensions);
            cdolist_list_var = cdolist_list_var.rest();
            dim3 = cdolist_list_var.first();
        }
        return new_hlmt(dimensions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 18848L)
    public static SubLObject reduce_hlmt(SubLObject v_hlmt, SubLObject minimize_mt_union_mtsP) {
        if (minimize_mt_union_mtsP == hlmt.UNPROVIDED) {
            minimize_mt_union_mtsP = (SubLObject)hlmt.T;
        }
        v_hlmt = transform_mt_union_nauts(v_hlmt, minimize_mt_union_mtsP);
        final SubLObject monad = hlmt_monad_mt(v_hlmt);
        if (hlmt.NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(monad)) {
            return monad;
        }
        if (hlmt.NIL != kb_utilities.kbeq(monad, v_hlmt)) {
            return v_hlmt;
        }
        SubLObject substantial_dimensions = (SubLObject)hlmt.NIL;
        if (hlmt.NIL != monad_mt_p(v_hlmt)) {
            final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
            final SubLObject val = v_hlmt;
            if (hlmt.NIL == default_values_for_dimension_p(dim, val)) {
                substantial_dimensions = (SubLObject)ConsesLow.cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
            }
        }
        else if (hlmt.NIL != mt_dim_naut_p(v_hlmt)) {
            final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
            final SubLObject val = v_hlmt;
            if (hlmt.NIL == default_values_for_dimension_p(dim, val)) {
                substantial_dimensions = (SubLObject)ConsesLow.cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
            }
        }
        else if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
            SubLObject csome_list_var;
            final SubLObject args = csome_list_var = cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED);
            SubLObject arg = (SubLObject)hlmt.NIL;
            arg = csome_list_var.first();
            while (hlmt.NIL != csome_list_var) {
                final SubLObject dim2 = mt_dimension_of_arg(arg);
                final SubLObject val2 = arg;
                if (hlmt.NIL == default_values_for_dimension_p(dim2, val2)) {
                    substantial_dimensions = (SubLObject)ConsesLow.cons(possibly_reduce_dimension(dim2, val2), substantial_dimensions);
                }
                csome_list_var = csome_list_var.rest();
                arg = csome_list_var.first();
            }
        }
        else if (hlmt.NIL != anytime_psc_p(v_hlmt) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_hlmt)) {
            final SubLObject dim = (SubLObject)hlmt.$kw48$TIME;
            final SubLObject val = v_hlmt;
            if (hlmt.NIL == default_values_for_dimension_p(dim, val)) {
                substantial_dimensions = (SubLObject)ConsesLow.cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
            }
        }
        else if (hlmt.NIL != closed_possibly_hlmt_p(v_hlmt)) {
            final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
            final SubLObject val = v_hlmt;
            if (hlmt.NIL == default_values_for_dimension_p(dim, val)) {
                substantial_dimensions = (SubLObject)ConsesLow.cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
            }
        }
        else {
            final SubLObject dim = (SubLObject)hlmt.$kw49$UNKNOWN;
            final SubLObject val = v_hlmt;
            if (hlmt.NIL == default_values_for_dimension_p(dim, val)) {
                substantial_dimensions = (SubLObject)ConsesLow.cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
            }
        }
        if (hlmt.NIL != list_utilities.singletonP(substantial_dimensions)) {
            return substantial_dimensions.first();
        }
        if (hlmt.NIL != substantial_dimensions) {
            return new_hlmt(substantial_dimensions);
        }
        return hlmt_monad_mt(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 19826L)
    public static SubLObject transform_mt_union_nauts(final SubLObject v_hlmt, final SubLObject minimize_mt_union_mtsP) {
        if (hlmt.NIL != mt_union_naut_p(v_hlmt)) {
            return reduce_mt_union_hlmt(v_hlmt, minimize_mt_union_mtsP);
        }
        if (v_hlmt.isCons()) {
            return (SubLObject)ConsesLow.cons(transform_mt_union_nauts(v_hlmt.first(), minimize_mt_union_mtsP), transform_mt_union_nauts(v_hlmt.rest(), minimize_mt_union_mtsP));
        }
        return v_hlmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20176L)
    public static SubLObject reduce_mt_union_hlmt(final SubLObject mt_union_hlmt, final SubLObject minimize_mt_union_mtsP) {
        SubLObject mts = mt_union_mts_recursive(mt_union_hlmt);
        if (hlmt.NIL != list_utilities.member_kbeqP(hlmt.$const19$EverythingPSC, mts)) {
            return hlmt.$const19$EverythingPSC;
        }
        if (hlmt.NIL != list_utilities.member_kbeqP(hlmt.$const20$InferencePSC, mts)) {
            return hlmt.$const20$InferencePSC;
        }
        if (hlmt.NIL != minimize_mt_union_mtsP) {
            mts = reduce_mt_union_hlmt_int(kb_utilities.sort_terms(mts, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED));
        }
        else {
            mts = kb_utilities.sort_terms(list_utilities.fast_delete_duplicates(mts, Symbols.symbol_function((SubLObject)hlmt.EQUAL), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
        }
        if (hlmt.NIL != list_utilities.lengthLE(mts, (SubLObject)hlmt.ONE_INTEGER, (SubLObject)hlmt.UNPROVIDED)) {
            return mts.first();
        }
        return el_utilities.make_nat_formula(hlmt.$const13$MtUnionFn, mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20764L)
    public static SubLObject clear_reduce_mt_union_hlmt_int() {
        final SubLObject cs = hlmt.$reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
        if (hlmt.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20764L)
    public static SubLObject remove_reduce_mt_union_hlmt_int(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args(hlmt.$reduce_mt_union_hlmt_int_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(mts), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20764L)
    public static SubLObject reduce_mt_union_hlmt_int_internal(final SubLObject mts) {
        return kb_utilities.sort_terms(genl_mts.min_mts(mts, (SubLObject)hlmt.UNPROVIDED), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20764L)
    public static SubLObject reduce_mt_union_hlmt_int(final SubLObject mts) {
        SubLObject caching_state = hlmt.$reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
        if (hlmt.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)hlmt.$sym56$REDUCE_MT_UNION_HLMT_INT, (SubLObject)hlmt.$sym57$_REDUCE_MT_UNION_HLMT_INT_CACHING_STATE_, (SubLObject)hlmt.NIL, (SubLObject)hlmt.EQUAL, (SubLObject)hlmt.ONE_INTEGER, (SubLObject)hlmt.ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback((SubLObject)hlmt.$sym58$CLEAR_REDUCE_MT_UNION_HLMT_INT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(reduce_mt_union_hlmt_int_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, (SubLObject)hlmt.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 20898L)
    public static SubLObject new_reduced_hlmt(final SubLObject mt_dimensions) {
        return reduce_hlmt(new_hlmt(mt_dimensions), (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 21080L)
    public static SubLObject combine_hlmts(SubLObject hlmt1, SubLObject hlmt2) {
        if (hlmt.NIL != kb_utilities.kbeq(hlmt1, hlmt.$const19$EverythingPSC) || hlmt.NIL != kb_utilities.kbeq(hlmt2, hlmt.$const19$EverythingPSC)) {
            return hlmt.$const19$EverythingPSC;
        }
        if (hlmt.NIL != kb_utilities.kbeq(hlmt1, hlmt.$const20$InferencePSC) || hlmt.NIL != kb_utilities.kbeq(hlmt2, hlmt.$const20$InferencePSC)) {
            return hlmt.$const20$InferencePSC;
        }
        SubLObject mts = (SubLObject)hlmt.NIL;
        hlmt1 = hlmt_czer.canonicalize_hlmt(hlmt1);
        hlmt2 = hlmt_czer.canonicalize_hlmt(hlmt2);
        if (hlmt.NIL != mt_union_naut_p(hlmt1)) {
            mts = ConsesLow.append(mt_union_mts(hlmt1), mts);
        }
        else {
            mts = (SubLObject)ConsesLow.cons(hlmt1, mts);
        }
        if (hlmt.NIL != mt_union_naut_p(hlmt2)) {
            mts = ConsesLow.append(mt_union_mts(hlmt2), mts);
        }
        else {
            mts = (SubLObject)ConsesLow.cons(hlmt2, mts);
        }
        mts = genl_mts.min_mts(mts, (SubLObject)hlmt.UNPROVIDED);
        if (hlmt.NIL != list_utilities.singletonP(mts)) {
            return mts.first();
        }
        return czer_main.canonicalize_term(el_utilities.make_formula(hlmt.$const13$MtUnionFn, mts, (SubLObject)hlmt.UNPROVIDED), (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 21865L)
    public static SubLObject new_canonicalized_hlmt(final SubLObject mt_dimensions) {
        return hlmt_czer.canonicalize_hlmt(new_hlmt(mt_dimensions));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 22083L)
    public static SubLObject possibly_augment_dimension(final SubLObject dim, final SubLObject val) {
        if (dim.eql((SubLObject)hlmt.$kw47$MONAD)) {
            return val;
        }
        if (dim.eql((SubLObject)hlmt.$kw48$TIME)) {
            return possibly_augment_time_mt(val);
        }
        return val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 22301L)
    public static SubLObject possibly_reduce_dimension(final SubLObject dim, final SubLObject val) {
        if (dim.eql((SubLObject)hlmt.$kw47$MONAD)) {
            return val;
        }
        if (dim.eql((SubLObject)hlmt.$kw48$TIME)) {
            return possibly_reduce_time_mt(val);
        }
        return val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 22516L)
    public static SubLObject default_dimension_mt(final SubLObject dim) {
        if (dim.eql((SubLObject)hlmt.$kw47$MONAD)) {
            return hlmt.$default_monad_mt$.getGlobalValue();
        }
        if (dim.eql((SubLObject)hlmt.$kw48$TIME)) {
            return default_time_mt();
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 22846L)
    public static SubLObject new_hlmt_from_dimension_plist(final SubLObject dim_plist) {
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 23020L)
    public static SubLObject valid_hlmtP(final SubLObject v_hlmt, SubLObject robust) {
        if (robust == hlmt.UNPROVIDED) {
            robust = (SubLObject)hlmt.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != hlmtP(v_hlmt) && hlmt.NIL != valid_hlmt_p(v_hlmt, robust));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 23212L)
    public static SubLObject valid_hlmt_p(final SubLObject v_hlmt, SubLObject robust) {
        if (robust == hlmt.UNPROVIDED) {
            robust = (SubLObject)hlmt.NIL;
        }
        if (hlmt.NIL == hlmt_p(v_hlmt)) {
            return (SubLObject)hlmt.NIL;
        }
        if (hlmt.NIL != robust) {
            SubLObject invalidP = (SubLObject)hlmt.NIL;
            if (hlmt.NIL != monad_mt_p(v_hlmt)) {
                if (hlmt.NIL == invalidP) {
                    final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
                    if (hlmt.NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                        invalidP = (SubLObject)hlmt.T;
                    }
                }
            }
            else if (hlmt.NIL != mt_dim_naut_p(v_hlmt)) {
                if (hlmt.NIL == invalidP) {
                    final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                    if (hlmt.NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                        invalidP = (SubLObject)hlmt.T;
                    }
                }
            }
            else if (hlmt.NIL != mt_space_naut_p(v_hlmt)) {
                final SubLObject args = cycl_utilities.naut_args(v_hlmt, (SubLObject)hlmt.UNPROVIDED);
                if (hlmt.NIL == invalidP) {
                    SubLObject csome_list_var = args;
                    SubLObject arg = (SubLObject)hlmt.NIL;
                    arg = csome_list_var.first();
                    while (hlmt.NIL == invalidP && hlmt.NIL != csome_list_var) {
                        final SubLObject dim2 = mt_dimension_of_arg(arg);
                        final SubLObject val = arg;
                        if (hlmt.NIL == valid_mt_for_dimension_p(dim2, val)) {
                            invalidP = (SubLObject)hlmt.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        arg = csome_list_var.first();
                    }
                }
            }
            else if (hlmt.NIL != anytime_psc_p(v_hlmt) || hlmt.NIL != anytime_during_psc_fn_naut_p(v_hlmt)) {
                if (hlmt.NIL == invalidP) {
                    final SubLObject dim = (SubLObject)hlmt.$kw48$TIME;
                    if (hlmt.NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                        invalidP = (SubLObject)hlmt.T;
                    }
                }
            }
            else if (hlmt.NIL != closed_possibly_hlmt_p(v_hlmt)) {
                if (hlmt.NIL == invalidP) {
                    final SubLObject dim = (SubLObject)hlmt.$kw47$MONAD;
                    if (hlmt.NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                        invalidP = (SubLObject)hlmt.T;
                    }
                }
            }
            else if (hlmt.NIL == invalidP) {
                final SubLObject dim = (SubLObject)hlmt.$kw49$UNKNOWN;
                if (hlmt.NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                    invalidP = (SubLObject)hlmt.T;
                }
            }
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == invalidP);
        }
        return valid_monad_mt_p(hlmt_monad_mt(v_hlmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 23544L)
    public static SubLObject valid_mt_for_dimension_p(final SubLObject dim, final SubLObject val) {
        if (dim.eql((SubLObject)hlmt.$kw47$MONAD)) {
            return valid_monad_mt_p(val);
        }
        if (dim.eql((SubLObject)hlmt.$kw48$TIME)) {
            return valid_temporal_mt_slice_p(val);
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 23781L)
    public static SubLObject default_monad_mt_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$default_monad_mt$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 23942L)
    public static SubLObject monad_dimension_p(final SubLObject v_object) {
        return Equality.eql(v_object, (SubLObject)hlmt.$kw47$MONAD);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 24039L)
    public static SubLObject monad_mt_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((hlmt.NIL != forts.fort_p(v_object) && hlmt.NIL == anytime_psc_p(v_object)) || (hlmt.NIL != mt_union_naut_p(v_object) && hlmt.NIL != list_utilities.every_in_list((SubLObject)hlmt.$sym31$MONAD_MT_P, mt_union_mts(v_object), (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 24247L)
    public static SubLObject valid_monad_mt_p(final SubLObject mt) {
        if (hlmt.NIL != mt) {
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != forts.valid_fortP(mt) && hlmt.NIL != fort_types_interface.mtP(mt));
        }
        return (SubLObject)hlmt.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 24396L)
    public static SubLObject monad_mtP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((hlmt.NIL != forts.fort_p(v_object) && hlmt.NIL != fort_types_interface.mtP(v_object)) || (hlmt.NIL != mt_union_naut_p(v_object) && hlmt.NIL != list_utilities.every_in_list((SubLObject)hlmt.$sym59$MONAD_MT_, mt_union_mts(v_object), (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 24609L)
    public static SubLObject monad_cycl_mtP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != possibly_mt_p(v_object) && hlmt.NIL == hlmt_naut_p(v_object) && hlmt.NIL != isa.isa_in_any_mtP(v_object, hlmt.$const60$Microtheory));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 24766L)
    public static SubLObject hlmt_monad_mt(final SubLObject v_hlmt) {
        final SubLObject monad_mt = hlmt_monad_mt_without_default(v_hlmt);
        return (hlmt.NIL != monad_mt) ? monad_mt : hlmt.$default_monad_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 24955L)
    public static SubLObject hlmt_monad_mt_without_default(final SubLObject v_hlmt) {
        return (hlmt.NIL != hlmt_naut_p(v_hlmt)) ? get_hlmt_dimension((SubLObject)hlmt.$kw47$MONAD, v_hlmt) : v_hlmt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25120L)
    public static SubLObject assertion_monad_mt(final SubLObject assertion) {
        final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
        final SubLObject monad_mt = hlmt_monad_mt(v_hlmt);
        if (hlmt.NIL != monad_mt) {
            return monad_mt;
        }
        return hlmt.$default_monad_mt$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25312L)
    public static SubLObject equal_mt_monads_p(final SubLObject object0, final SubLObject object1) {
        return monad_mt_equal(hlmt_monad_mt(object0), hlmt_monad_mt(object1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25467L)
    public static SubLObject monad_mt_equal(final SubLObject object0, final SubLObject object1) {
        return kb_utilities.kbeq(object0, object1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25693L)
    public static SubLObject temporal_dimension_function_p(final SubLObject dim) {
        return subl_promotions.memberP(dim, hlmt.$temporal_dimension_functions$.getGlobalValue(), (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25799L)
    public static SubLObject temporal_dimension_predicate_p(final SubLObject pred) {
        return list_utilities.member_kbeqP(pred, hlmt.$temporal_dimension_predicates$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 25914L)
    public static SubLObject default_mt_time_interval_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$default_mt_time_interval$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26019L)
    public static SubLObject default_mt_time_parameter_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$default_mt_time_parameter$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26126L)
    public static SubLObject default_time_mt_p(final SubLObject dim) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hlmt.NIL != el_utilities.possibly_naut_p(dim)) {
            thread.resetMultipleValues();
            final SubLObject interval = explode_hlmt_temporal_facets_with_defaults(dim);
            final SubLObject parameter = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != kb_utilities.kbeq(interval, hlmt.$default_mt_time_interval$.getGlobalValue()) && hlmt.NIL != kb_utilities.kbeq(parameter, hlmt.$default_mt_time_parameter$.getGlobalValue()));
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26431L)
    public static SubLObject time_point_mt_time_parameter_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$default_atemporal_genlmt_time_parameter$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26555L)
    public static SubLObject mt_time_dim_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(v_object) && hlmt.NIL != temporal_dimension_function_p(cycl_utilities.naut_functor(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26701L)
    public static SubLObject anytime_psc_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$anytime_psc$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26778L)
    public static SubLObject anytime_during_psc_fn_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, hlmt.$anytime_during_psc_fn$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 26874L)
    public static SubLObject anytime_during_psc_fn_naut_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(v_object) && hlmt.NIL != anytime_during_psc_fn_p(cycl_utilities.naut_functor(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 27023L)
    public static SubLObject anytime_psc_hlmtP(final SubLObject v_hlmt) {
        return anytime_psc_p(hlmt_temporal_mt(v_hlmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 27113L)
    public static SubLObject anytime_during_psc_hlmtP(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != anytime_during_psc_fn_naut_p(time_mt) && hlmt.NIL != isa.isaP(anytime_during_psc_fn_time_interval(time_mt), hlmt.$const62$TimeInterval, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 27339L)
    public static SubLObject temporal_hlmt_p(final SubLObject v_object) {
        if (hlmt.NIL != hlmt_naut_p(v_object)) {
            return list_utilities.sublisp_boolean(hlmt_temporal_mt(v_object));
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 27501L)
    public static SubLObject atemporal_hlmtP(final SubLObject v_hlmt) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == temporal_hlmt_p(v_hlmt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 27651L)
    public static SubLObject temporal_dimension_mt_p(final SubLObject v_object) {
        if (hlmt.NIL != anytime_psc_p(v_object)) {
            return (SubLObject)hlmt.T;
        }
        if (hlmt.NIL != anytime_during_psc_fn_naut_p(v_object)) {
            return (SubLObject)hlmt.T;
        }
        if (hlmt.NIL == mt_dim_naut_p(v_object)) {
            return (SubLObject)hlmt.NIL;
        }
        final SubLObject functor = cycl_utilities.naut_functor(v_object);
        if (hlmt.NIL != temporal_dimension_function_p(functor)) {
            return (SubLObject)hlmt.T;
        }
        if (hlmt.NIL != kb_utilities.kbeq(functor, hlmt.$const50$MtDim)) {
            return temporal_dimension_predicate_p(cycl_utilities.nat_arg1(v_object, (SubLObject)hlmt.UNPROVIDED));
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 28077L)
    public static SubLObject time_dimension_p(final SubLObject v_object) {
        return Equality.eq(v_object, (SubLObject)hlmt.$kw48$TIME);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 28146L)
    public static SubLObject time_intervalP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, hlmt.$const62$TimeInterval, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 28305L)
    public static SubLObject temporal_objectP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != time_intervalP(v_object) || hlmt.NIL != at_defns.quiet_has_typeP(v_object, hlmt.$const63$TemporalThing, (SubLObject)hlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 28560L)
    public static SubLObject time_parameterP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, hlmt.$const64$TimeParameter, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 28721L)
    public static SubLObject time_mt_with_implicit_parameter_p(final SubLObject dim_nat) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(dim_nat) && hlmt.NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(dim_nat), hlmt.$const15$MtTimeDimFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 28909L)
    public static SubLObject time_mt_with_explicit_parameter_p(final SubLObject dim_nat) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(dim_nat) && hlmt.NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(dim_nat), hlmt.$const14$MtTimeWithGranularityDimFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 29112L)
    public static SubLObject time_mt_with_indeterminate_time_p(final SubLObject dim_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hlmt.NIL != mt_time_dim_naut_p(dim_nat)) {
            thread.resetMultipleValues();
            final SubLObject index = mt_time_dim_nat_temporal_values(dim_nat);
            final SubLObject param = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return indeterminate_time_interval_p(index);
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 29381L)
    public static SubLObject some_time_in_interval_naut_p(final SubLObject interval) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_naut_p(interval) && hlmt.NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(interval), hlmt.$const65$SomeTimeInIntervalFn));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 29541L)
    public static SubLObject indeterminate_time_interval_p(final SubLObject interval) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != el_utilities.possibly_nat_p(interval) && (hlmt.NIL != some_time_in_interval_naut_p(interval) || hlmt.NIL != list_utilities.any_in_list((SubLObject)hlmt.$sym66$INDETERMINATE_TIME_INTERVAL_P, cycl_utilities.nat_args(interval, (SubLObject)hlmt.UNPROVIDED), (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 29762L)
    public static SubLObject hlmt_with_indeterminate_time_p(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        if (hlmt.NIL != time_mt) {
            return time_mt_with_indeterminate_time_p(time_mt);
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 29945L)
    public static SubLObject hlmt_with_anytime_psc_p(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != anytime_psc_p(time_mt) || hlmt.NIL != anytime_during_psc_fn_naut_p(time_mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 30124L)
    public static SubLObject equal_mt_times_p(final SubLObject object0, final SubLObject object1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hlmt.NIL != kb_utilities.kbeq(object0, object1)) {
            return (SubLObject)hlmt.T;
        }
        final SubLObject indeterminate_0P = hlmt_with_indeterminate_time_p(object0);
        final SubLObject indeterminate_1P = hlmt_with_indeterminate_time_p(object1);
        if (hlmt.NIL == indeterminate_0P && hlmt.NIL == indeterminate_1P) {
            thread.resetMultipleValues();
            final SubLObject interval0 = explode_hlmt_temporal_facets_with_defaults(object0);
            final SubLObject parameter0 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject interval2 = explode_hlmt_temporal_facets_with_defaults(object1);
            final SubLObject parameter2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != temporal_object_equal(interval0, interval2) && hlmt.NIL != time_parameter_equal(parameter0, parameter2));
        }
        if (hlmt.NIL != indeterminate_0P && hlmt.NIL != indeterminate_1P) {
            thread.resetMultipleValues();
            final SubLObject interval0 = explode_indeterminate_time_dim_nat(object0);
            final SubLObject sentence0 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject interval2 = explode_indeterminate_time_dim_nat(object1);
            final SubLObject sentence2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != temporal_object_equal(interval0, interval2) && hlmt.NIL != some_time_sentence_match_p(sentence0, sentence2));
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 31293L)
    public static SubLObject temporal_object_equal(final SubLObject object0, final SubLObject object1) {
        return Equality.equal(object0, object1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 31470L)
    public static SubLObject time_parameter_equal(final SubLObject object0, final SubLObject object1) {
        return Equality.equal(object0, object1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 31569L)
    public static SubLObject hlmt_times_equal_p(final SubLObject hlmt0, final SubLObject hlmt1) {
        return equal_mt_times_p(hlmt_temporal_mt(hlmt0), hlmt_temporal_mt(hlmt1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 31696L)
    public static SubLObject some_time_sentence_match_p(final SubLObject sent0, final SubLObject sent1) {
        final SubLObject conjunct0P = el_utilities.el_conjunction_p(sent0);
        final SubLObject conjunct1P = el_utilities.el_conjunction_p(sent1);
        if (hlmt.NIL != conjunct0P && hlmt.NIL != conjunct1P) {
            Errors.cerror((SubLObject)hlmt.$str67$Continue_Anyway_, (SubLObject)hlmt.$str68$We_should_never_test_two_some_tim);
            return (SubLObject)hlmt.NIL;
        }
        if (hlmt.NIL != conjunct0P) {
            return conses_high.subsetp(sent1, sent0, Symbols.symbol_function((SubLObject)hlmt.EQUAL), (SubLObject)hlmt.UNPROVIDED);
        }
        if (hlmt.NIL != conjunct1P) {
            return conses_high.subsetp(sent0, sent1, Symbols.symbol_function((SubLObject)hlmt.EQUAL), (SubLObject)hlmt.UNPROVIDED);
        }
        return Equality.equal(sent0, sent1);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 32228L)
    public static SubLObject hlmt_temporal_mt(final SubLObject v_hlmt) {
        return get_hlmt_dimension((SubLObject)hlmt.$kw48$TIME, v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 32364L)
    public static SubLObject extract_hlmt_temporal_index(final SubLObject v_hlmt) {
        return cycl_utilities.nat_arg1(hlmt_temporal_mt(v_hlmt), (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 32462L)
    public static SubLObject extract_hlmt_temporal_index_or_default(final SubLObject v_hlmt) {
        final SubLObject time_interval = cycl_utilities.nat_arg1(hlmt_temporal_mt(v_hlmt), (SubLObject)hlmt.UNPROVIDED);
        return (hlmt.NIL != time_interval) ? time_interval : hlmt.$default_mt_time_interval$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 32652L)
    public static SubLObject extract_hlmt_time_parameter(final SubLObject v_hlmt) {
        final SubLObject time_parameter = cycl_utilities.nat_arg2(hlmt_temporal_mt(v_hlmt), (SubLObject)hlmt.UNPROVIDED);
        return (hlmt.NIL != atemporal_hlmtP(v_hlmt)) ? ((hlmt.NIL != time_parameter) ? time_parameter : hlmt.$default_atemporal_genlmt_time_parameter$.getGlobalValue()) : ((hlmt.NIL != time_parameter) ? time_parameter : hlmt.$default_mt_time_parameter$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 32945L)
    public static SubLObject destructure_mt_time_dim_nat(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        temporal_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        time_parameter = current.first();
        current = current.rest();
        if (hlmt.NIL == current) {
            current = temp;
            SubLObject v_hlmt = (SubLObject)hlmt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(temporal_object, time_parameter), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym70$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(temporal_object, time_parameter), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym71$MT_TIME_DIM_NAT_TEMPORAL_VALUES, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list69);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 33318L)
    public static SubLObject mt_time_dim_nat_temporal_values(final SubLObject dim_nat) {
        if (hlmt.NIL == dim_nat) {
            return Values.values((SubLObject)hlmt.NIL, (SubLObject)hlmt.NIL);
        }
        final SubLObject pcase_var;
        final SubLObject functor = pcase_var = cycl_utilities.naut_functor(dim_nat);
        if (pcase_var.eql(hlmt.$const14$MtTimeWithGranularityDimFn)) {
            return Values.values(cycl_utilities.nat_arg1(dim_nat, (SubLObject)hlmt.UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, (SubLObject)hlmt.UNPROVIDED));
        }
        if (pcase_var.eql(hlmt.$const15$MtTimeDimFn)) {
            return Values.values(cycl_utilities.nat_arg1(dim_nat, (SubLObject)hlmt.UNPROVIDED), hlmt.$const3$Null_TimeParameter);
        }
        Errors.cerror((SubLObject)hlmt.$str67$Continue_Anyway_, (SubLObject)hlmt.$str72$DIM_NAT__a_is_not_a_microtheory_t, dim_nat);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 33839L)
    public static SubLObject explode_indeterminate_time_dim_nat(final SubLObject dim_nat) {
        return Values.values(cycl_utilities.nat_arg1(dim_nat, (SubLObject)hlmt.UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, (SubLObject)hlmt.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 34077L)
    public static SubLObject anytime_during_psc_fn_time_interval(final SubLObject anytime_during_psc_naut) {
        return cycl_utilities.naut_arg1(anytime_during_psc_naut, (SubLObject)hlmt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 34200L)
    public static SubLObject explode_hlmt_temporal_facets(final SubLObject v_hlmt, final SubLObject default_interval, final SubLObject default_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        if (hlmt.NIL != anytime_psc_p(time_mt)) {
            return Values.values((SubLObject)hlmt.NIL, (SubLObject)hlmt.NIL);
        }
        if (hlmt.NIL != anytime_during_psc_fn_naut_p(time_mt)) {
            return Values.values((SubLObject)hlmt.NIL, (SubLObject)hlmt.NIL);
        }
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        thread.resetMultipleValues();
        final SubLObject temporal_object_$3 = mt_time_dim_nat_temporal_values(time_mt);
        final SubLObject time_parameter_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        temporal_object = temporal_object_$3;
        time_parameter = time_parameter_$4;
        if (hlmt.NIL == temporal_object) {
            if (default_interval == hlmt.$kw73$ERROR) {
                temporal_object = hlmt.$default_mt_time_interval$.getGlobalValue();
            }
            else {
                temporal_object = default_interval;
            }
        }
        if (hlmt.NIL == time_parameter) {
            if (default_parameter == hlmt.$kw73$ERROR) {
                time_parameter = hlmt.$default_mt_time_parameter$.getGlobalValue();
            }
            else {
                time_parameter = default_parameter;
            }
        }
        return Values.values(temporal_object, time_parameter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 35009L)
    public static SubLObject explode_hlmt_temporal_facets_with_defaults(final SubLObject v_hlmt) {
        return explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_mt_time_parameter$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 35178L)
    public static SubLObject explode_genlmt_temporal_facets_based_on_temporality(final SubLObject v_hlmt, final SubLObject atemporalP) {
        if (hlmt.NIL != atemporalP) {
            return explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_atemporal_genlmt_time_parameter$.getGlobalValue());
        }
        return explode_hlmt_temporal_facets_with_defaults(v_hlmt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 35468L)
    public static SubLObject destructure_monad_and_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject monad_mt = (SubLObject)hlmt.NIL;
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        monad_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        temporal_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        time_parameter = current.first();
        current = current.rest();
        if (hlmt.NIL == current) {
            current = temp;
            SubLObject v_hlmt = (SubLObject)hlmt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
            v_hlmt = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(monad_mt, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym22$HLMT_MONAD_MT, v_hlmt)), temporal_object, time_parameter), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym70$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(temporal_object, time_parameter), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym75$EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS, v_hlmt)), ConsesLow.append(body, (SubLObject)hlmt.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list74);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 35859L)
    public static SubLObject destructure_monad_and_temporal_facets_without_defaults(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject monad_mt = (SubLObject)hlmt.NIL;
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        monad_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        temporal_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
        time_parameter = current.first();
        current = current.rest();
        if (hlmt.NIL == current) {
            current = temp;
            SubLObject v_hlmt = (SubLObject)hlmt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list74);
            v_hlmt = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(monad_mt, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym76$HLMT_MONAD_MT_WITHOUT_DEFAULT, v_hlmt)), temporal_object, time_parameter), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym70$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(temporal_object, time_parameter), (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym77$EXPLODE_HLMT_TEMPORAL_FACETS, v_hlmt, (SubLObject)hlmt.$list78)), ConsesLow.append(body, (SubLObject)hlmt.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list74);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 36332L)
    public static SubLObject destructure_temporal_mt_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        temporal_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        time_parameter = current.first();
        current = current.rest();
        if (hlmt.NIL == current) {
            current = temp;
            SubLObject v_hlmt = (SubLObject)hlmt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(temporal_object, time_parameter), (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym70$CMULTIPLE_VALUE_SETQ, (SubLObject)ConsesLow.list(temporal_object, time_parameter), (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym77$EXPLODE_HLMT_TEMPORAL_FACETS, v_hlmt, (SubLObject)hlmt.$list79)), ConsesLow.append(body, (SubLObject)hlmt.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list69);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 36850L)
    public static SubLObject destructure_atemporal_genlmt_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        temporal_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        time_parameter = current.first();
        current = current.rest();
        if (hlmt.NIL == current) {
            current = temp;
            SubLObject v_hlmt = (SubLObject)hlmt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym80$PROGN, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym81$IGNORE, v_hlmt), (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(temporal_object, (SubLObject)hlmt.$list82), reader.bq_cons(time_parameter, (SubLObject)hlmt.$list83)), ConsesLow.append(body, (SubLObject)hlmt.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list69);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 37142L)
    public static SubLObject destructure_atemporal_specmt_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = (SubLObject)hlmt.NIL;
        SubLObject time_parameter = (SubLObject)hlmt.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        temporal_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
        time_parameter = current.first();
        current = current.rest();
        if (hlmt.NIL == current) {
            current = temp;
            SubLObject v_hlmt = (SubLObject)hlmt.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hlmt.$list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym80$PROGN, (SubLObject)ConsesLow.list((SubLObject)hlmt.$sym81$IGNORE, v_hlmt), (SubLObject)ConsesLow.listS((SubLObject)hlmt.$sym0$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(temporal_object, (SubLObject)hlmt.$list82), reader.bq_cons(time_parameter, (SubLObject)hlmt.$list84)), ConsesLow.append(body, (SubLObject)hlmt.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hlmt.$list69);
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 37434L)
    public static SubLObject new_time_dimension(final SubLObject temporal_object, SubLObject time_parameter) {
        if (time_parameter == hlmt.UNPROVIDED) {
            time_parameter = (SubLObject)hlmt.NIL;
        }
        if (hlmt.NIL != anytime_psc_p(temporal_object)) {
            return temporal_object;
        }
        if (hlmt.NIL != anytime_during_psc_fn_naut_p(temporal_object)) {
            return temporal_object;
        }
        if (hlmt.NIL != time_parameter) {
            return (SubLObject)ConsesLow.list(hlmt.$const14$MtTimeWithGranularityDimFn, temporal_object, time_parameter);
        }
        return (SubLObject)ConsesLow.list(hlmt.$const15$MtTimeDimFn, temporal_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 37847L)
    public static SubLObject new_temporal_hlmt(final SubLObject monad_mt, final SubLObject temporal_object, final SubLObject time_parameter) {
        return new_hlmt((SubLObject)ConsesLow.list(monad_mt, new_time_dimension(temporal_object, time_parameter)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 38014L)
    public static SubLObject new_canonicalized_temporal_hlmt(final SubLObject monad_mt, final SubLObject time_mt) {
        return hlmt_czer.canonicalize_hlmt(new_hlmt((SubLObject)ConsesLow.list(monad_mt, time_mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 38148L)
    public static SubLObject new_default_granularity_hlmt(final SubLObject monad_mt, final SubLObject temporal_object) {
        return new_hlmt((SubLObject)ConsesLow.list(monad_mt, new_time_dimension(temporal_object, (SubLObject)hlmt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 38296L)
    public static SubLObject default_time_mt() {
        return (SubLObject)ConsesLow.list(hlmt.$const15$MtTimeDimFn, hlmt.$default_mt_time_interval$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 38389L)
    public static SubLObject new_temporal_object_default_parameter_mt(final SubLObject interval) {
        return (SubLObject)ConsesLow.list(hlmt.$const15$MtTimeDimFn, interval);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 38494L)
    public static SubLObject possibly_augment_time_mt(final SubLObject time_dim_nat) {
        if (hlmt.NIL != time_mt_with_implicit_parameter_p(time_dim_nat)) {
            return add_default_parameter_to_time_nat(time_dim_nat);
        }
        return time_dim_nat;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 38697L)
    public static SubLObject possibly_reduce_time_mt(final SubLObject time_dim_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hlmt.NIL != time_mt_with_explicit_parameter_p(time_dim_nat)) {
            SubLObject interval = (SubLObject)hlmt.NIL;
            SubLObject parameter = (SubLObject)hlmt.NIL;
            thread.resetMultipleValues();
            final SubLObject interval_$5 = mt_time_dim_nat_temporal_values(time_dim_nat);
            final SubLObject parameter_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            interval = interval_$5;
            parameter = parameter_$6;
            if (hlmt.NIL != default_mt_time_parameter_p(parameter)) {
                return new_temporal_object_default_parameter_mt(interval);
            }
        }
        return time_dim_nat;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 39015L)
    public static SubLObject add_default_parameter_to_time_nat(final SubLObject dim_nat) {
        final SubLObject interval = cycl_utilities.nat_arg1(dim_nat, (SubLObject)hlmt.UNPROVIDED);
        return (SubLObject)ConsesLow.list(hlmt.$const14$MtTimeWithGranularityDimFn, interval, hlmt.$default_mt_time_parameter$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 39199L)
    public static SubLObject valid_temporal_mt_slice_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (hlmt.NIL != temporal_dimension_mt_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            SubLObject interval = (SubLObject)hlmt.NIL;
            SubLObject parameter = (SubLObject)hlmt.NIL;
            thread.resetMultipleValues();
            final SubLObject interval_$7 = mt_time_dim_nat_temporal_values(v_object);
            final SubLObject parameter_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            interval = interval_$7;
            parameter = parameter_$8;
            final SubLObject pcase_var = functor;
            if (pcase_var.eql(hlmt.$const15$MtTimeDimFn)) {
                return valid_temporal_object_p(interval);
            }
            if (pcase_var.eql(hlmt.$const14$MtTimeWithGranularityDimFn)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != valid_temporal_object_p(interval) && hlmt.NIL != valid_time_parameter_p(parameter));
            }
        }
        return (SubLObject)hlmt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 39647L)
    public static SubLObject valid_temporal_object_p(final SubLObject temporal_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == temporal_object || hlmt.NIL != isa.isa_in_any_mtP(temporal_object, hlmt.$const63$TemporalThing));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 39815L)
    public static SubLObject valid_time_parameter_p(final SubLObject time_parameter) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL == time_parameter || hlmt.NIL != isa.isa_in_any_mtP(time_parameter, hlmt.$const64$TimeParameter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 39979L)
    public static SubLObject valid_mt_time_with_granularity_dim_arglistP(final SubLObject args) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != list_utilities.lengthE(args, (SubLObject)hlmt.TWO_INTEGER, (SubLObject)hlmt.UNPROVIDED) && hlmt.NIL != valid_temporal_object_p(args.first()) && hlmt.NIL != valid_time_parameter_p(conses_high.second(args)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 40170L)
    public static SubLObject valid_mt_time_dim_arglistP(final SubLObject args) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hlmt.NIL != list_utilities.lengthE(args, (SubLObject)hlmt.ONE_INTEGER, (SubLObject)hlmt.UNPROVIDED) && hlmt.NIL != valid_temporal_object_p(args.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hlmt.lisp", position = 40299L)
    public static SubLObject relevant_mt_with_inference_relevance(final SubLObject test_mt, final SubLObject inference_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hlmt.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inference_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = mt_relevance_macros.relevant_mtP(test_mt);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    public static SubLObject declare_hlmt_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmts_supportedP", "HLMTS-SUPPORTED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "with_hlmts", "WITH-HLMTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "enable_hlmts", "ENABLE-HLMTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "disable_hlmts", "DISABLE-HLMTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "unindexed_hlmt_syntax_constants", "UNINDEXED-HLMT-SYNTAX-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "unindexed_hlmt_syntax_constant_p", "UNINDEXED-HLMT-SYNTAX-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "fully_indexed_hlmt_term_p", "FULLY-INDEXED-HLMT-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_space_function_p", "MT-SPACE-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_mt_p", "POSSIBLY-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_hlmt_p", "POSSIBLY-HLMT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "fort_or_chlmt_p", "FORT-OR-CHLMT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "chlmt_p", "CHLMT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "closed_hlmt_p", "CLOSED-HLMT-P", 1, 0, false);
        new $closed_hlmt_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "closed_possibly_hlmt_p", "CLOSED-POSSIBLY-HLMT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_p", "HLMT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_p_no_time", "HLMT-P-NO-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_p_time", "HLMT-P-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_hlmt_naut_p", "POSSIBLY-HLMT-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_naut_p", "HLMT-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_space_naut_p", "MT-SPACE-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_space_naut_arglist_p", "MT-SPACE-NAUT-ARGLIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dim_naut_p", "MT-DIM-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_naut_p", "MT-UNION-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_function_p", "MT-UNION-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmtP", "HLMT?", 1, 0, false);
        new $hlmtP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmtP_int", "HLMT?-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmtP_no_time", "HLMT?-NO-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmtP_time", "HLMT?-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_nautP", "HLMT-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_space_mtP", "MT-SPACE-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_space_arglistP", "MT-SPACE-ARGLIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dim_mtP", "MT-DIM-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dim_arglistP", "MT-DIM-ARGLIST?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_nautP", "MT-UNION-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_arglistP", "MT-UNION-ARGLIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_equal", "HLMT-EQUAL", 2, 0, false);
        new $hlmt_equal$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_equalP", "HLMT-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_hlmt", "NEW-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "copy_hlmt", "COPY-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_anytime_during_psc_naut", "NEW-ANYTIME-DURING-PSC-NAUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_psc", "ANYTIME-PSC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_mts", "MT-UNION-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_mts_recursive", "MT-UNION-MTS-RECURSIVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_union_mts_recursive_int", "MT-UNION-MTS-RECURSIVE-INT", 1, 0, false);
        new $mt_union_mts_recursive_int$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "union_mt_relevance_contexts", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dimension_type_p", "MT-DIMENSION-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dimension_types", "MT-DIMENSION-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dimension_function_p", "MT-DIMENSION-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "context_space_function_p", "CONTEXT-SPACE-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dimension_predicate_p", "MT-DIMENSION-PREDICATE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "do_mt_dimensions", "DO-MT-DIMENSIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dimension_of_arg", "MT-DIMENSION-OF-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "single_dimension_mt_dimension", "SINGLE-DIMENSION-MT-DIMENSION", 1, 0, false);
        new $single_dimension_mt_dimension$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_dim_nat_dimension", "MT-DIM-NAT-DIMENSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "get_hlmt_dimension", "GET-HLMT-DIMENSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_dimensions", "HLMT-DIMENSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "remove_hlmt_dimension", "REMOVE-HLMT-DIMENSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "replace_hlmt_dimension", "REPLACE-HLMT-DIMENSION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "replace_monad_dimension", "REPLACE-MONAD-DIMENSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "replace_time_dimension", "REPLACE-TIME-DIMENSION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_values_for_dimension_p", "DEFAULT-VALUES-FOR-DIMENSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "some_interesting_hlmtP", "SOME-INTERESTING-HLMT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "interesting_hlmtP", "INTERESTING-HLMT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "assertion_hlmt", "ASSERTION-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_has_dimension_of_valueP", "HLMT-HAS-DIMENSION-OF-VALUE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "augment_hlmt", "AUGMENT-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "reduce_hlmt", "REDUCE-HLMT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "transform_mt_union_nauts", "TRANSFORM-MT-UNION-NAUTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "reduce_mt_union_hlmt", "REDUCE-MT-UNION-HLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "clear_reduce_mt_union_hlmt_int", "CLEAR-REDUCE-MT-UNION-HLMT-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "remove_reduce_mt_union_hlmt_int", "REMOVE-REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "reduce_mt_union_hlmt_int_internal", "REDUCE-MT-UNION-HLMT-INT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "reduce_mt_union_hlmt_int", "REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_reduced_hlmt", "NEW-REDUCED-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "combine_hlmts", "COMBINE-HLMTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_canonicalized_hlmt", "NEW-CANONICALIZED-HLMT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_augment_dimension", "POSSIBLY-AUGMENT-DIMENSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_reduce_dimension", "POSSIBLY-REDUCE-DIMENSION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_dimension_mt", "DEFAULT-DIMENSION-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_hlmt_from_dimension_plist", "NEW-HLMT-FROM-DIMENSION-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_hlmtP", "VALID-HLMT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_hlmt_p", "VALID-HLMT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_mt_for_dimension_p", "VALID-MT-FOR-DIMENSION-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_monad_mt_p", "DEFAULT-MONAD-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "monad_dimension_p", "MONAD-DIMENSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "monad_mt_p", "MONAD-MT-P", 1, 0, false);
        new $monad_mt_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_monad_mt_p", "VALID-MONAD-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "monad_mtP", "MONAD-MT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "monad_cycl_mtP", "MONAD-CYCL-MT?", 1, 0, false);
        new $monad_cycl_mtP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_monad_mt", "HLMT-MONAD-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_monad_mt_without_default", "HLMT-MONAD-MT-WITHOUT-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "assertion_monad_mt", "ASSERTION-MONAD-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "equal_mt_monads_p", "EQUAL-MT-MONADS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "monad_mt_equal", "MONAD-MT-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "temporal_dimension_function_p", "TEMPORAL-DIMENSION-FUNCTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "temporal_dimension_predicate_p", "TEMPORAL-DIMENSION-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_mt_time_interval_p", "DEFAULT-MT-TIME-INTERVAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_mt_time_parameter_p", "DEFAULT-MT-TIME-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_time_mt_p", "DEFAULT-TIME-MT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_point_mt_time_parameter_p", "TIME-POINT-MT-TIME-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_time_dim_naut_p", "MT-TIME-DIM-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_psc_p", "ANYTIME-PSC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_during_psc_fn_p", "ANYTIME-DURING-PSC-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_during_psc_fn_naut_p", "ANYTIME-DURING-PSC-FN-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_psc_hlmtP", "ANYTIME-PSC-HLMT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_during_psc_hlmtP", "ANYTIME-DURING-PSC-HLMT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "temporal_hlmt_p", "TEMPORAL-HLMT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "atemporal_hlmtP", "ATEMPORAL-HLMT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "temporal_dimension_mt_p", "TEMPORAL-DIMENSION-MT-P", 1, 0, false);
        new $temporal_dimension_mt_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_dimension_p", "TIME-DIMENSION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_intervalP", "TIME-INTERVAL?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "temporal_objectP", "TEMPORAL-OBJECT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_parameterP", "TIME-PARAMETER?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_mt_with_implicit_parameter_p", "TIME-MT-WITH-IMPLICIT-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_mt_with_explicit_parameter_p", "TIME-MT-WITH-EXPLICIT-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_mt_with_indeterminate_time_p", "TIME-MT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "some_time_in_interval_naut_p", "SOME-TIME-IN-INTERVAL-NAUT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "indeterminate_time_interval_p", "INDETERMINATE-TIME-INTERVAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_with_indeterminate_time_p", "HLMT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_with_anytime_psc_p", "HLMT-WITH-ANYTIME-PSC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "equal_mt_times_p", "EQUAL-MT-TIMES-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "temporal_object_equal", "TEMPORAL-OBJECT-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "time_parameter_equal", "TIME-PARAMETER-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_times_equal_p", "HLMT-TIMES-EQUAL-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "some_time_sentence_match_p", "SOME-TIME-SENTENCE-MATCH-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "hlmt_temporal_mt", "HLMT-TEMPORAL-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "extract_hlmt_temporal_index", "EXTRACT-HLMT-TEMPORAL-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "extract_hlmt_temporal_index_or_default", "EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "extract_hlmt_time_parameter", "EXTRACT-HLMT-TIME-PARAMETER", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "destructure_mt_time_dim_nat", "DESTRUCTURE-MT-TIME-DIM-NAT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "mt_time_dim_nat_temporal_values", "MT-TIME-DIM-NAT-TEMPORAL-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "explode_indeterminate_time_dim_nat", "EXPLODE-INDETERMINATE-TIME-DIM-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "anytime_during_psc_fn_time_interval", "ANYTIME-DURING-PSC-FN-TIME-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "explode_hlmt_temporal_facets", "EXPLODE-HLMT-TEMPORAL-FACETS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "explode_hlmt_temporal_facets_with_defaults", "EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "explode_genlmt_temporal_facets_based_on_temporality", "EXPLODE-GENLMT-TEMPORAL-FACETS-BASED-ON-TEMPORALITY", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "destructure_monad_and_temporal_facets", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "destructure_monad_and_temporal_facets_without_defaults", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS-WITHOUT-DEFAULTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "destructure_temporal_mt_temporal_facets", "DESTRUCTURE-TEMPORAL-MT-TEMPORAL-FACETS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "destructure_atemporal_genlmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-GENLMT-TEMPORAL-FACETS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hlmt", "destructure_atemporal_specmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-SPECMT-TEMPORAL-FACETS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_time_dimension", "NEW-TIME-DIMENSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_temporal_hlmt", "NEW-TEMPORAL-HLMT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_canonicalized_temporal_hlmt", "NEW-CANONICALIZED-TEMPORAL-HLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_default_granularity_hlmt", "NEW-DEFAULT-GRANULARITY-HLMT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "default_time_mt", "DEFAULT-TIME-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "new_temporal_object_default_parameter_mt", "NEW-TEMPORAL-OBJECT-DEFAULT-PARAMETER-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_augment_time_mt", "POSSIBLY-AUGMENT-TIME-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "possibly_reduce_time_mt", "POSSIBLY-REDUCE-TIME-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "add_default_parameter_to_time_nat", "ADD-DEFAULT-PARAMETER-TO-TIME-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_temporal_mt_slice_p", "VALID-TEMPORAL-MT-SLICE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_temporal_object_p", "VALID-TEMPORAL-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_time_parameter_p", "VALID-TIME-PARAMETER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_mt_time_with_granularity_dim_arglistP", "VALID-MT-TIME-WITH-GRANULARITY-DIM-ARGLIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "valid_mt_time_dim_arglistP", "VALID-MT-TIME-DIM-ARGLIST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hlmt", "relevant_mt_with_inference_relevance", "RELEVANT-MT-WITH-INFERENCE-RELEVANCE", 2, 0, false);
        return (SubLObject)hlmt.NIL;
    }
    
    public static SubLObject init_hlmt_file() {
        hlmt.$hlmts_supportedP$ = SubLFiles.defvar("*HLMTS-SUPPORTED?*", (SubLObject)hlmt.T);
        hlmt.$default_monad_mt$ = SubLFiles.deflexical("*DEFAULT-MONAD-MT*", hlmt.$const2$UniversalVocabularyMt);
        hlmt.$default_temporal_mt_time_parameter$ = SubLFiles.deflexical("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*", hlmt.$const3$Null_TimeParameter);
        hlmt.$default_atemporal_time_parameter$ = SubLFiles.deflexical("*DEFAULT-ATEMPORAL-TIME-PARAMETER*", hlmt.$const3$Null_TimeParameter);
        hlmt.$default_atemporal_genlmt_time_parameter$ = SubLFiles.deflexical("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*", hlmt.$const4$TimePoint);
        hlmt.$default_atemporal_specmt_time_parameter$ = SubLFiles.deflexical("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*", hlmt.$const3$Null_TimeParameter);
        hlmt.$default_mt_time_interval$ = SubLFiles.deflexical("*DEFAULT-MT-TIME-INTERVAL*", hlmt.$const5$Always_TimeInterval);
        hlmt.$default_mt_time_parameter$ = SubLFiles.deflexical("*DEFAULT-MT-TIME-PARAMETER*", hlmt.$const3$Null_TimeParameter);
        hlmt.$mt_space_function$ = SubLFiles.deflexical("*MT-SPACE-FUNCTION*", hlmt.$const6$MtSpace);
        hlmt.$temporal_dimension_functions$ = SubLFiles.deflexical("*TEMPORAL-DIMENSION-FUNCTIONS*", (SubLObject)hlmt.$list7);
        hlmt.$mt_dimension_types$ = SubLFiles.deflexical("*MT-DIMENSION-TYPES*", (SubLObject)hlmt.$list8);
        hlmt.$mt_dimension_functions$ = SubLFiles.deflexical("*MT-DIMENSION-FUNCTIONS*", (SubLObject)hlmt.$list9);
        hlmt.$context_space_functions$ = SubLFiles.deflexical("*CONTEXT-SPACE-FUNCTIONS*", (SubLObject)ConsesLow.cons(hlmt.$mt_space_function$.getGlobalValue(), hlmt.$mt_dimension_functions$.getGlobalValue()));
        hlmt.$anytime_psc$ = SubLFiles.deflexical("*ANYTIME-PSC*", hlmt.$const10$AnytimePSC);
        hlmt.$anytime_during_psc_fn$ = SubLFiles.deflexical("*ANYTIME-DURING-PSC-FN*", hlmt.$const11$AnytimeDuringPSCFn);
        hlmt.$unindexed_hlmt_syntax_constants$ = SubLFiles.deflexical("*UNINDEXED-HLMT-SYNTAX-CONSTANTS*", (SubLObject)hlmt.$list12);
        hlmt.$reduce_mt_union_hlmt_int_caching_state$ = SubLFiles.deflexical("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*", (SubLObject)hlmt.NIL);
        hlmt.$temporal_dimension_predicates$ = SubLFiles.deflexical("*TEMPORAL-DIMENSION-PREDICATES*", (SubLObject)hlmt.$list61);
        return (SubLObject)hlmt.NIL;
    }
    
    public static SubLObject setup_hlmt_file() {
        access_macros.register_external_symbol((SubLObject)hlmt.$sym18$UNION_MT_RELEVANCE_CONTEXTS);
        access_macros.register_macro_helper((SubLObject)hlmt.$sym39$MT_DIMENSION_OF_ARG, (SubLObject)hlmt.$sym46$DO_MT_DIMENSIONS);
        memoization_state.note_globally_cached_function((SubLObject)hlmt.$sym56$REDUCE_MT_UNION_HLMT_INT);
        sunit_external.define_test_category((SubLObject)hlmt.$str85$HLMT_Tests, (SubLObject)hlmt.UNPROVIDED);
        sunit_external.define_test_suite((SubLObject)hlmt.$str86$HLMT_Test_Suite, (SubLObject)hlmt.$list87, (SubLObject)hlmt.UNPROVIDED, (SubLObject)hlmt.UNPROVIDED);
        return (SubLObject)hlmt.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_hlmt_file();
    }
    
    @Override
	public void initializeVariables() {
        init_hlmt_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_hlmt_file();
    }
    
    static {
        me = (SubLFile)new hlmt();
        hlmt.$hlmts_supportedP$ = null;
        hlmt.$default_monad_mt$ = null;
        hlmt.$default_temporal_mt_time_parameter$ = null;
        hlmt.$default_atemporal_time_parameter$ = null;
        hlmt.$default_atemporal_genlmt_time_parameter$ = null;
        hlmt.$default_atemporal_specmt_time_parameter$ = null;
        hlmt.$default_mt_time_interval$ = null;
        hlmt.$default_mt_time_parameter$ = null;
        hlmt.$mt_space_function$ = null;
        hlmt.$temporal_dimension_functions$ = null;
        hlmt.$mt_dimension_types$ = null;
        hlmt.$mt_dimension_functions$ = null;
        hlmt.$context_space_functions$ = null;
        hlmt.$anytime_psc$ = null;
        hlmt.$anytime_during_psc_fn$ = null;
        hlmt.$unindexed_hlmt_syntax_constants$ = null;
        hlmt.$reduce_mt_union_hlmt_int_caching_state$ = null;
        hlmt.$temporal_dimension_predicates$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HLMTS-SUPPORTED?*"), (SubLObject)hlmt.T));
        $const2$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $const3$Null_TimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter"));
        $const4$TimePoint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint"));
        $const5$Always_TimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval"));
        $const6$MtSpace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace"));
        $list7 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONAD"), (SubLObject)SubLObjectFactory.makeKeyword("TIME"));
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtDim")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")));
        $const10$AnytimePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimePSC"));
        $const11$AnytimeDuringPSCFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AnytimeDuringPSCFn"));
        $list12 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtSpace")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtDim")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Null-TimeParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimePoint")) });
        $const13$MtUnionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtUnionFn"));
        $const14$MtTimeWithGranularityDimFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeWithGranularityDimFn"));
        $const15$MtTimeDimFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn"));
        $sym16$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym17$MT_UNION_MTS_RECURSIVE_INT = SubLObjectFactory.makeSymbol("MT-UNION-MTS-RECURSIVE-INT");
        $sym18$UNION_MT_RELEVANCE_CONTEXTS = SubLObjectFactory.makeSymbol("UNION-MT-RELEVANCE-CONTEXTS");
        $const19$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const20$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym21$ANYTIME_PSC_HLMT_ = SubLObjectFactory.makeSymbol("ANYTIME-PSC-HLMT?");
        $sym22$HLMT_MONAD_MT = SubLObjectFactory.makeSymbol("HLMT-MONAD-MT");
        $const23$MicrotheoryDimensionPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MicrotheoryDimensionPredicate"));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VAL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw26$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw27$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym28$ARGS = SubLObjectFactory.makeUninternedSymbol("ARGS");
        $sym29$ARG = SubLObjectFactory.makeUninternedSymbol("ARG");
        $sym30$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym31$MONAD_MT_P = SubLObjectFactory.makeSymbol("MONAD-MT-P");
        $sym32$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONAD"));
        $sym34$MT_DIM_NAUT_P = SubLObjectFactory.makeSymbol("MT-DIM-NAUT-P");
        $sym35$MT_DIM_NAT_DIMENSION = SubLObjectFactory.makeSymbol("MT-DIM-NAT-DIMENSION");
        $sym36$MT_SPACE_NAUT_P = SubLObjectFactory.makeSymbol("MT-SPACE-NAUT-P");
        $sym37$NAUT_ARGS = SubLObjectFactory.makeSymbol("NAUT-ARGS");
        $sym38$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym39$MT_DIMENSION_OF_ARG = SubLObjectFactory.makeSymbol("MT-DIMENSION-OF-ARG");
        $sym40$COR = SubLObjectFactory.makeSymbol("COR");
        $sym41$ANYTIME_PSC_P = SubLObjectFactory.makeSymbol("ANYTIME-PSC-P");
        $sym42$ANYTIME_DURING_PSC_FN_NAUT_P = SubLObjectFactory.makeSymbol("ANYTIME-DURING-PSC-FN-NAUT-P");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TIME"));
        $sym44$CLOSED_POSSIBLY_HLMT_P = SubLObjectFactory.makeSymbol("CLOSED-POSSIBLY-HLMT-P");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN"));
        $sym46$DO_MT_DIMENSIONS = SubLObjectFactory.makeSymbol("DO-MT-DIMENSIONS");
        $kw47$MONAD = SubLObjectFactory.makeKeyword("MONAD");
        $kw48$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw49$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $const50$MtDim = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtDim"));
        $const51$mtMonad = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtMonad"));
        $const52$mtTimeIndex = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex"));
        $const53$mtTimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter"));
        $sym54$HLMT_DIMENSIONS = SubLObjectFactory.makeSymbol("HLMT-DIMENSIONS");
        $sym55$INTERESTING_HLMT_ = SubLObjectFactory.makeSymbol("INTERESTING-HLMT?");
        $sym56$REDUCE_MT_UNION_HLMT_INT = SubLObjectFactory.makeSymbol("REDUCE-MT-UNION-HLMT-INT");
        $sym57$_REDUCE_MT_UNION_HLMT_INT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*");
        $sym58$CLEAR_REDUCE_MT_UNION_HLMT_INT = SubLObjectFactory.makeSymbol("CLEAR-REDUCE-MT-UNION-HLMT-INT");
        $sym59$MONAD_MT_ = SubLObjectFactory.makeSymbol("MONAD-MT?");
        $const60$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeParameter")));
        $const62$TimeInterval = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeInterval"));
        $const63$TemporalThing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporalThing"));
        $const64$TimeParameter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeParameter"));
        $const65$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn"));
        $sym66$INDETERMINATE_TIME_INTERVAL_P = SubLObjectFactory.makeSymbol("INDETERMINATE-TIME-INTERVAL-P");
        $str67$Continue_Anyway_ = SubLObjectFactory.makeString("Continue Anyway.");
        $str68$We_should_never_test_two_some_tim = SubLObjectFactory.makeString("We should never test two some time conjuncts.");
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-PARAMETER")), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym70$CMULTIPLE_VALUE_SETQ = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-SETQ");
        $sym71$MT_TIME_DIM_NAT_TEMPORAL_VALUES = SubLObjectFactory.makeSymbol("MT-TIME-DIM-NAT-TEMPORAL-VALUES");
        $str72$DIM_NAT__a_is_not_a_microtheory_t = SubLObjectFactory.makeString("DIM-NAT ~a is not a microtheory time dimension NAT");
        $kw73$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONAD-MT"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TIME-PARAMETER")), (SubLObject)SubLObjectFactory.makeSymbol("HLMT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym75$EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS = SubLObjectFactory.makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS");
        $sym76$HLMT_MONAD_MT_WITHOUT_DEFAULT = SubLObjectFactory.makeSymbol("HLMT-MONAD-MT-WITHOUT-DEFAULT");
        $sym77$EXPLODE_HLMT_TEMPORAL_FACETS = SubLObjectFactory.makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS");
        $list78 = ConsesLow.list((SubLObject)hlmt.NIL, (SubLObject)hlmt.NIL);
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"), (SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*"));
        $sym80$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym81$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*"));
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*"));
        $str85$HLMT_Tests = SubLObjectFactory.makeString("HLMT Tests");
        $str86$HLMT_Test_Suite = SubLObjectFactory.makeString("HLMT Test Suite");
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("HLMT Tests"));
    }
    
    public static final class $closed_hlmt_p$UnaryFunction extends UnaryFunction
    {
        public $closed_hlmt_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLOSED-HLMT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.closed_hlmt_p(arg1);
        }
    }
    
    public static final class $hlmtP$UnaryFunction extends UnaryFunction
    {
        public $hlmtP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HLMT?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.hlmtP(arg1);
        }
    }
    
    public static final class $hlmt_equal$BinaryFunction extends BinaryFunction
    {
        public $hlmt_equal$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HLMT-EQUAL"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return hlmt.hlmt_equal(arg1, arg2);
        }
    }
    
    public static final class $mt_union_mts_recursive_int$UnaryFunction extends UnaryFunction
    {
        public $mt_union_mts_recursive_int$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MT-UNION-MTS-RECURSIVE-INT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.mt_union_mts_recursive_int(arg1);
        }
    }
    
    public static final class $single_dimension_mt_dimension$UnaryFunction extends UnaryFunction
    {
        public $single_dimension_mt_dimension$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SINGLE-DIMENSION-MT-DIMENSION"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.single_dimension_mt_dimension(arg1);
        }
    }
    
    public static final class $monad_mt_p$UnaryFunction extends UnaryFunction
    {
        public $monad_mt_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MONAD-MT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.monad_mt_p(arg1);
        }
    }
    
    public static final class $monad_cycl_mtP$UnaryFunction extends UnaryFunction
    {
        public $monad_cycl_mtP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("MONAD-CYCL-MT?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.monad_cycl_mtP(arg1);
        }
    }
    
    public static final class $temporal_dimension_mt_p$UnaryFunction extends UnaryFunction
    {
        public $temporal_dimension_mt_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TEMPORAL-DIMENSION-MT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hlmt.temporal_dimension_mt_p(arg1);
        }
    }
}

/*

	Total time: 511 ms
	
*/