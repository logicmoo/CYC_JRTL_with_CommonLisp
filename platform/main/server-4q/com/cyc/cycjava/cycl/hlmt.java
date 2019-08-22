package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.make_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_nat_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.possibly_fo_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_nat_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.fully_indexed_term_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hlmt extends SubLTranslatedFile {
    public static final SubLFile me = new hlmt();

    public static final String myName = "com.cyc.cycjava.cycl.hlmt";

    public static final String myFingerPrint = "1cca2fc37bdc707c590465ff6f48830c4079d267e9c072419dc0331e7ac428db";

    // defvar
    public static final SubLSymbol $hlmts_supportedP$ = makeSymbol("*HLMTS-SUPPORTED?*");

    // deflexical
    public static final SubLSymbol $default_monad_mt$ = makeSymbol("*DEFAULT-MONAD-MT*");

    // deflexical
    public static final SubLSymbol $default_temporal_mt_time_parameter$ = makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*");

    // deflexical
    public static final SubLSymbol $default_atemporal_time_parameter$ = makeSymbol("*DEFAULT-ATEMPORAL-TIME-PARAMETER*");

    // deflexical
    public static final SubLSymbol $default_atemporal_genlmt_time_parameter$ = makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*");

    // deflexical
    public static final SubLSymbol $default_atemporal_specmt_time_parameter$ = makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*");

    // deflexical
    public static final SubLSymbol $default_mt_time_interval$ = makeSymbol("*DEFAULT-MT-TIME-INTERVAL*");

    // deflexical
    public static final SubLSymbol $default_mt_time_parameter$ = makeSymbol("*DEFAULT-MT-TIME-PARAMETER*");

    // deflexical
    private static final SubLSymbol $mt_space_function$ = makeSymbol("*MT-SPACE-FUNCTION*");

    // deflexical
    private static final SubLSymbol $temporal_dimension_functions$ = makeSymbol("*TEMPORAL-DIMENSION-FUNCTIONS*");

    // deflexical
    /**
     * The identifiers used to specify different types of slices of mt space. This
     * is an ordered list, and describes the canonical ordering of dimensions
     */
    private static final SubLSymbol $mt_dimension_types$ = makeSymbol("*MT-DIMENSION-TYPES*");

    // deflexical
    // The functions which carve out slices of mt space.
    private static final SubLSymbol $mt_dimension_functions$ = makeSymbol("*MT-DIMENSION-FUNCTIONS*");

    // deflexical
    // The functions which are valid arg0s for a HLMT.
    private static final SubLSymbol $context_space_functions$ = makeSymbol("*CONTEXT-SPACE-FUNCTIONS*");

    // deflexical
    private static final SubLSymbol $anytime_psc$ = makeSymbol("*ANYTIME-PSC*");

    // deflexical
    private static final SubLSymbol $anytime_during_psc_fn$ = makeSymbol("*ANYTIME-DURING-PSC-FN*");

    // deflexical
    /**
     * Constants which are part of HLMT syntax and which therefore are not fully
     * indexed, for pragmatic reasons.
     */
    private static final SubLSymbol $unindexed_hlmt_syntax_constants$ = makeSymbol("*UNINDEXED-HLMT-SYNTAX-CONSTANTS*");



    // deflexical
    private static final SubLSymbol $temporal_dimension_predicates$ = makeSymbol("*TEMPORAL-DIMENSION-PREDICATES*");



    public static final SubLList $list1 = list(list(makeSymbol("*HLMTS-SUPPORTED?*"), T));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell(makeString("Always-TimeInterval"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    public static final SubLList $list7 = list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), reader_make_constant_shell(makeString("MtTimeDimFn")));

    public static final SubLList $list8 = list(makeKeyword("MONAD"), makeKeyword("TIME"));

    public static final SubLList $list9 = list(reader_make_constant_shell(makeString("MtDim")), reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")));

    private static final SubLObject $$AnytimePSC = reader_make_constant_shell(makeString("AnytimePSC"));

    private static final SubLObject $$AnytimeDuringPSCFn = reader_make_constant_shell(makeString("AnytimeDuringPSCFn"));

    public static final SubLList $list12 = list(new SubLObject[]{ reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("MtDim")), reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), reader_make_constant_shell(makeString("mtTimeIndex")), reader_make_constant_shell(makeString("mtTimeParameter")), reader_make_constant_shell(makeString("mtMonad")), reader_make_constant_shell(makeString("Always-TimeInterval")), reader_make_constant_shell(makeString("Null-TimeParameter")), reader_make_constant_shell(makeString("TimePoint")) });

    private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

    private static final SubLObject $$MtTimeWithGranularityDimFn = reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));

    private static final SubLObject $$MtTimeDimFn = reader_make_constant_shell(makeString("MtTimeDimFn"));



    public static final SubLSymbol MT_UNION_MTS_RECURSIVE_INT = makeSymbol("MT-UNION-MTS-RECURSIVE-INT");

    public static final SubLSymbol UNION_MT_RELEVANCE_CONTEXTS = makeSymbol("UNION-MT-RELEVANCE-CONTEXTS");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLSymbol $sym21$ANYTIME_PSC_HLMT_ = makeSymbol("ANYTIME-PSC-HLMT?");

    public static final SubLSymbol HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");

    private static final SubLObject $$MicrotheoryDimensionPredicate = reader_make_constant_shell(makeString("MicrotheoryDimensionPredicate"));

    public static final SubLList $list24 = list(list(makeSymbol("DIM-VAR"), makeSymbol("VAL-VAR"), makeSymbol("HLMT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list25 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    public static final SubLSymbol $sym28$ARGS = makeUninternedSymbol("ARGS");

    public static final SubLSymbol $sym29$ARG = makeUninternedSymbol("ARG");



    public static final SubLSymbol MONAD_MT_P = makeSymbol("MONAD-MT-P");



    public static final SubLList $list33 = list(makeKeyword("MONAD"));

    public static final SubLSymbol MT_DIM_NAUT_P = makeSymbol("MT-DIM-NAUT-P");

    public static final SubLSymbol MT_DIM_NAT_DIMENSION = makeSymbol("MT-DIM-NAT-DIMENSION");

    public static final SubLSymbol MT_SPACE_NAUT_P = makeSymbol("MT-SPACE-NAUT-P");

    public static final SubLSymbol NAUT_ARGS = makeSymbol("NAUT-ARGS");



    public static final SubLSymbol MT_DIMENSION_OF_ARG = makeSymbol("MT-DIMENSION-OF-ARG");



    public static final SubLSymbol ANYTIME_PSC_P = makeSymbol("ANYTIME-PSC-P");

    public static final SubLSymbol ANYTIME_DURING_PSC_FN_NAUT_P = makeSymbol("ANYTIME-DURING-PSC-FN-NAUT-P");

    public static final SubLList $list43 = list(makeKeyword("TIME"));

    public static final SubLSymbol CLOSED_POSSIBLY_HLMT_P = makeSymbol("CLOSED-POSSIBLY-HLMT-P");

    public static final SubLList $list45 = list(makeKeyword("UNKNOWN"));

    public static final SubLSymbol DO_MT_DIMENSIONS = makeSymbol("DO-MT-DIMENSIONS");







    private static final SubLObject $$MtDim = reader_make_constant_shell(makeString("MtDim"));

    private static final SubLObject $$mtMonad = reader_make_constant_shell(makeString("mtMonad"));

    private static final SubLObject $$mtTimeIndex = reader_make_constant_shell(makeString("mtTimeIndex"));

    private static final SubLObject $$mtTimeParameter = reader_make_constant_shell(makeString("mtTimeParameter"));

    private static final SubLSymbol HLMT_DIMENSIONS = makeSymbol("HLMT-DIMENSIONS");

    private static final SubLSymbol $sym55$INTERESTING_HLMT_ = makeSymbol("INTERESTING-HLMT?");

    private static final SubLSymbol REDUCE_MT_UNION_HLMT_INT = makeSymbol("REDUCE-MT-UNION-HLMT-INT");

    private static final SubLSymbol $reduce_mt_union_hlmt_int_caching_state$ = makeSymbol("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_REDUCE_MT_UNION_HLMT_INT = makeSymbol("CLEAR-REDUCE-MT-UNION-HLMT-INT");

    public static final SubLSymbol $sym59$MONAD_MT_ = makeSymbol("MONAD-MT?");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    public static final SubLList $list61 = list(reader_make_constant_shell(makeString("mtTimeIndex")), reader_make_constant_shell(makeString("mtTimeParameter")));

    private static final SubLObject $$TimeInterval = reader_make_constant_shell(makeString("TimeInterval"));

    private static final SubLObject $$TemporalThing = reader_make_constant_shell(makeString("TemporalThing"));

    private static final SubLObject $$TimeParameter = reader_make_constant_shell(makeString("TimeParameter"));

    private static final SubLObject $$SomeTimeInIntervalFn = reader_make_constant_shell(makeString("SomeTimeInIntervalFn"));

    public static final SubLSymbol INDETERMINATE_TIME_INTERVAL_P = makeSymbol("INDETERMINATE-TIME-INTERVAL-P");

    public static final SubLString $str67$Continue_Anyway_ = makeString("Continue Anyway.");

    public static final SubLString $str68$We_should_never_test_two_some_tim = makeString("We should never test two some time conjuncts.");

    public static final SubLList $list69 = list(list(makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol MT_TIME_DIM_NAT_TEMPORAL_VALUES = makeSymbol("MT-TIME-DIM-NAT-TEMPORAL-VALUES");

    public static final SubLString $str72$DIM_NAT__a_is_not_a_microtheory_t = makeString("DIM-NAT ~a is not a microtheory time dimension NAT");



    public static final SubLList $list74 = list(list(makeSymbol("MONAD-MT"), makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS = makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS");

    public static final SubLSymbol HLMT_MONAD_MT_WITHOUT_DEFAULT = makeSymbol("HLMT-MONAD-MT-WITHOUT-DEFAULT");

    public static final SubLSymbol EXPLODE_HLMT_TEMPORAL_FACETS = makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS");

    public static final SubLList $list78 = list(NIL, NIL);

    public static final SubLList $list79 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"), makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*"));





    public static final SubLList $list82 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"));

    public static final SubLList $list83 = list(makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*"));

    public static final SubLList $list84 = list(makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*"));

    public static final SubLString $$$HLMT_Tests = makeString("HLMT Tests");

    private static final SubLString $$$HLMT_Test_Suite = makeString("HLMT Test Suite");

    private static final SubLList $list87 = list(makeString("HLMT Tests"));

    public static SubLObject hlmts_supportedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hlmts_supportedP$.getDynamicValue(thread);
    }

    public static SubLObject with_hlmts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject enable_hlmts() {
        $hlmts_supportedP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject disable_hlmts() {
        $hlmts_supportedP$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject unindexed_hlmt_syntax_constants() {
        return $unindexed_hlmt_syntax_constants$.getGlobalValue();
    }

    public static SubLObject unindexed_hlmt_syntax_constant_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $unindexed_hlmt_syntax_constants$.getGlobalValue());
    }

    public static SubLObject fully_indexed_hlmt_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != fully_indexed_term_p(v_object)) && (NIL == unindexed_hlmt_syntax_constant_p(v_object)));
    }

    public static SubLObject mt_space_function_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $mt_space_function$.getGlobalValue());
    }

    public static SubLObject possibly_mt_p(final SubLObject v_object) {
        return possibly_hlmt_p(v_object);
    }

    public static SubLObject possibly_hlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_fo_naut_p(v_object)) || (NIL != hlmt_p(v_object)));
    }

    public static SubLObject fort_or_chlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != closed_hlmt_p(v_object)));
    }

    public static SubLObject chlmt_p(final SubLObject v_object) {
        return closed_hlmt_p(v_object);
    }

    public static SubLObject closed_hlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt_p(v_object)) && (NIL != variables.cycl_ground_expression_p(v_object)));
    }

    public static SubLObject closed_possibly_hlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_hlmt_p(v_object)) && (NIL != variables.cycl_ground_expression_p(v_object)));
    }

    public static SubLObject hlmt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $hlmts_supportedP$.getDynamicValue(thread) ? hlmt_p_time(v_object) : hlmt_p_no_time(v_object);
    }

    public static SubLObject hlmt_p_no_time(final SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) || (NIL != mt_union_naut_p(v_object)));
    }

    public static SubLObject hlmt_p_time(final SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) || (NIL != hlmt_naut_p(v_object)));
    }

    public static SubLObject possibly_hlmt_naut_p(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            return makeBoolean(((NIL != context_space_function_p(functor)) || (NIL != mt_union_function_p(functor))) || (NIL != anytime_during_psc_fn_p(functor)));
        }
        return NIL;
    }

    public static SubLObject hlmt_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_hlmt_naut_p(v_object)) && ((((NIL != mt_space_naut_p(v_object)) || (NIL != mt_dim_naut_p(v_object))) || (NIL != mt_union_naut_p(v_object))) || (NIL != anytime_during_psc_fn_naut_p(v_object))));
    }

    public static SubLObject mt_space_naut_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != mt_space_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != mt_space_naut_arglist_p(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static SubLObject mt_space_naut_arglist_p(final SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != hlmt_p(args.first())) && (NIL != mt_space_naut_arglist_p(args.rest()))));
    }

    public static SubLObject mt_dim_naut_p(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            if (NIL != mt_dimension_function_p(functor)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject mt_union_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != mt_union_function_p(cycl_utilities.naut_functor(v_object))));
    }

    public static SubLObject mt_union_function_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $$MtUnionFn);
    }

    public static SubLObject hlmtP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_represented_term_p(v_object)) && (NIL != hlmtP_int(v_object)));
    }

    public static SubLObject hlmtP_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $hlmts_supportedP$.getDynamicValue(thread) ? hlmtP_time(v_object) : hlmtP_no_time(v_object);
    }

    public static SubLObject hlmtP_no_time(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt_p(v_object)) && ((NIL != monad_mtP(v_object)) || (NIL != mt_union_nautP(v_object))));
    }

    public static SubLObject hlmtP_time(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt_p(v_object)) && ((NIL != monad_mtP(v_object)) || (NIL != hlmt_nautP(v_object))));
    }

    public static SubLObject hlmt_nautP(final SubLObject v_object) {
        return makeBoolean(((NIL != mt_space_mtP(v_object)) || (NIL != mt_dim_mtP(v_object))) || (NIL != mt_union_nautP(v_object)));
    }

    public static SubLObject mt_space_mtP(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != mt_space_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != mt_space_arglistP(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static SubLObject mt_space_arglistP(final SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != hlmtP_int(args.first())) && (NIL != mt_space_arglistP(args.rest()))));
    }

    public static SubLObject mt_dim_mtP(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            return makeBoolean((NIL != mt_dimension_function_p(functor)) && (NIL != mt_dim_arglistP(functor, cycl_utilities.naut_args(v_object, UNPROVIDED))));
        }
        return NIL;
    }

    public static SubLObject mt_dim_arglistP(final SubLObject functor, final SubLObject args) {
        if (functor.eql($$MtTimeWithGranularityDimFn)) {
            return valid_mt_time_with_granularity_dim_arglistP(args);
        }
        if (functor.eql($$MtTimeDimFn)) {
            return valid_mt_time_dim_arglistP(args);
        }
        return list_utilities.lengthE(args, arity.arity(functor), UNPROVIDED);
    }

    public static SubLObject mt_union_nautP(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != mt_union_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != mt_union_arglistP(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static SubLObject mt_union_arglistP(final SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != hlmtP_int(args.first())) && (NIL != mt_union_arglistP(args.rest()))));
    }

    public static SubLObject hlmt_equal(final SubLObject object0, final SubLObject object1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $hlmts_supportedP$.getDynamicValue(thread)) {
            return equal(object0, object1);
        }
        return kb_utilities.kbeq(object0, object1);
    }

    public static SubLObject hlmt_equalP(final SubLObject object0, final SubLObject object1) {
        if (NIL != hlmt_equal(object0, object1)) {
            return T;
        }
        if ((NIL != monad_mt_p(object0)) && (NIL != monad_mt_p(object1))) {
            return NIL;
        }
        return makeBoolean((NIL != equal_mt_monads_p(object0, object1)) && (NIL != equal_mt_times_p(object0, object1)));
    }

    public static SubLObject new_hlmt(final SubLObject mt_dimensions) {
        assert NIL != listp(mt_dimensions) : "Types.listp(mt_dimensions) " + "CommonSymbols.NIL != Types.listp(mt_dimensions) " + mt_dimensions;
        return cons($mt_space_function$.getGlobalValue(), mt_dimensions);
    }

    public static SubLObject copy_hlmt(final SubLObject v_hlmt) {
        return copy_tree(v_hlmt);
    }

    public static SubLObject new_anytime_during_psc_naut(final SubLObject time_interval) {
        return make_unary_formula($anytime_during_psc_fn$.getGlobalValue(), time_interval);
    }

    public static SubLObject anytime_psc() {
        return $anytime_psc$.getGlobalValue();
    }

    public static SubLObject mt_union_mts(final SubLObject mt_union_hlmt) {
        return cycl_utilities.naut_args(mt_union_hlmt, UNPROVIDED);
    }

    public static SubLObject mt_union_mts_recursive(final SubLObject mt_union_naut) {
        return Mapping.mapcan(MT_UNION_MTS_RECURSIVE_INT, mt_union_mts(mt_union_naut), EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static SubLObject mt_union_mts_recursive_int(final SubLObject v_object) {
        return NIL != mt_union_naut_p(v_object) ? mt_union_mts_recursive(v_object) : list(v_object);
    }

    public static SubLObject union_mt_relevance_contexts(final SubLObject mt_relevance_contexts) {
        if (NIL != list_utilities.member_kbeqP($$EverythingPSC, mt_relevance_contexts)) {
            return $$EverythingPSC;
        }
        if (NIL != list_utilities.member_kbeqP($$InferencePSC, mt_relevance_contexts)) {
            return $$InferencePSC;
        }
        if ((NIL != list_utilities.doubletonP(mt_relevance_contexts)) && (NIL != genl_mts.genl_mtP(mt_relevance_contexts.first(), second(mt_relevance_contexts), UNPROVIDED, UNPROVIDED))) {
            return mt_relevance_contexts.first();
        }
        if ((NIL != list_utilities.doubletonP(mt_relevance_contexts)) && (NIL != genl_mts.genl_mtP(second(mt_relevance_contexts), mt_relevance_contexts.first(), UNPROVIDED, UNPROVIDED))) {
            return second(mt_relevance_contexts);
        }
        if (NIL != find_if($sym21$ANYTIME_PSC_HLMT_, mt_relevance_contexts, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return new_temporal_hlmt(cons($$MtUnionFn, Mapping.mapcar(HLMT_MONAD_MT, mt_relevance_contexts)), anytime_psc(), NIL);
        }
        return cons($$MtUnionFn, mt_relevance_contexts);
    }

    public static SubLObject mt_dimension_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $mt_dimension_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mt_dimension_types() {
        return $mt_dimension_types$.getGlobalValue();
    }

    public static SubLObject mt_dimension_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $mt_dimension_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject context_space_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $context_space_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mt_dimension_predicate_p(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$MicrotheoryDimensionPredicate, UNPROVIDED);
    }

    public static SubLObject do_mt_dimensions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dim_var = NIL;
        SubLObject val_var = NIL;
        SubLObject v_hlmt = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        dim_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        val_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        v_hlmt = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$1, $list25, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject args = $sym28$ARGS;
        final SubLObject arg = $sym29$ARG;
        return list(PCOND, list(list(MONAD_MT_P, v_hlmt), list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list33), list(val_var, v_hlmt)), append(body, NIL)))), list(list(MT_DIM_NAUT_P, v_hlmt), list(PUNLESS, done, listS(CLET, list(list(dim_var, list(MT_DIM_NAT_DIMENSION, v_hlmt)), list(val_var, v_hlmt)), append(body, NIL)))), list(list(MT_SPACE_NAUT_P, v_hlmt), list(CLET, list(list(args, list(NAUT_ARGS, v_hlmt))), list(CSOME, list(arg, args, done), listS(CLET, list(list(dim_var, list(MT_DIMENSION_OF_ARG, arg)), list(val_var, arg)), append(body, NIL))))), list(list(COR, list(ANYTIME_PSC_P, v_hlmt), list(ANYTIME_DURING_PSC_FN_NAUT_P, v_hlmt)), list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list43), list(val_var, v_hlmt)), append(body, NIL)))), list(list(CLOSED_POSSIBLY_HLMT_P, v_hlmt), list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list33), list(val_var, v_hlmt)), append(body, NIL)))), list(T, list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list45), list(val_var, v_hlmt)), append(body, NIL)))));
    }

    public static SubLObject mt_dimension_of_arg(final SubLObject arg) {
        if (NIL != monad_mt_p(arg)) {
            return $MONAD;
        }
        if (NIL != temporal_dimension_mt_p(arg)) {
            return $TIME;
        }
        return $UNKNOWN;
    }

    public static SubLObject single_dimension_mt_dimension(final SubLObject sfd_mt) {
        if (NIL != monad_mt_p(sfd_mt)) {
            return $MONAD;
        }
        if (NIL != possibly_naut_p(sfd_mt)) {
            return mt_dim_nat_dimension(sfd_mt);
        }
        return $UNKNOWN;
    }

    public static SubLObject mt_dim_nat_dimension(final SubLObject mt_dim_nat) {
        if (NIL != anytime_psc_p(mt_dim_nat)) {
            return $TIME;
        }
        final SubLObject pcase_var;
        final SubLObject functor = pcase_var = cycl_utilities.naut_functor(mt_dim_nat);
        if ((pcase_var.eql($$MtTimeWithGranularityDimFn) || pcase_var.eql($$MtTimeDimFn)) || pcase_var.eql($$AnytimeDuringPSCFn)) {
            return $TIME;
        }
        if (!pcase_var.eql($$MtDim)) {
            return NIL;
        }
        final SubLObject pcase_var_$2;
        final SubLObject pred = pcase_var_$2 = cycl_utilities.nat_arg1(mt_dim_nat, UNPROVIDED);
        if (pcase_var_$2.eql($$mtMonad)) {
            return $MONAD;
        }
        if (pcase_var_$2.eql($$mtTimeIndex) || pcase_var_$2.eql($$mtTimeParameter)) {
            return $TIME;
        }
        return NIL;
    }

    public static SubLObject get_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt) {
        SubLObject mt = NIL;
        SubLObject foundP = NIL;
        if (NIL != monad_mt_p(v_hlmt)) {
            if (NIL == foundP) {
                final SubLObject dim_var = $MONAD;
                if (NIL != kb_utilities.kbeq(dim, dim_var)) {
                    mt = v_hlmt;
                    foundP = T;
                }
            }
        } else
            if (NIL != mt_dim_naut_p(v_hlmt)) {
                if (NIL == foundP) {
                    final SubLObject dim_var = mt_dim_nat_dimension(v_hlmt);
                    if (NIL != kb_utilities.kbeq(dim, dim_var)) {
                        mt = v_hlmt;
                        foundP = T;
                    }
                }
            } else
                if (NIL != mt_space_naut_p(v_hlmt)) {
                    final SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                    if (NIL == foundP) {
                        SubLObject csome_list_var = args;
                        SubLObject arg = NIL;
                        arg = csome_list_var.first();
                        while ((NIL == foundP) && (NIL != csome_list_var)) {
                            final SubLObject dim_var2 = mt_dimension_of_arg(arg);
                            final SubLObject mt_var = arg;
                            if (NIL != kb_utilities.kbeq(dim, dim_var2)) {
                                mt = mt_var;
                                foundP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            arg = csome_list_var.first();
                        } 
                    }
                } else
                    if ((NIL != anytime_psc_p(v_hlmt)) || (NIL != anytime_during_psc_fn_naut_p(v_hlmt))) {
                        if (NIL == foundP) {
                            final SubLObject dim_var = $TIME;
                            if (NIL != kb_utilities.kbeq(dim, dim_var)) {
                                mt = v_hlmt;
                                foundP = T;
                            }
                        }
                    } else
                        if (NIL != closed_possibly_hlmt_p(v_hlmt)) {
                            if (NIL == foundP) {
                                final SubLObject dim_var = $MONAD;
                                if (NIL != kb_utilities.kbeq(dim, dim_var)) {
                                    mt = v_hlmt;
                                    foundP = T;
                                }
                            }
                        } else
                            if (NIL == foundP) {
                                final SubLObject dim_var = $UNKNOWN;
                                if (NIL != kb_utilities.kbeq(dim, dim_var)) {
                                    mt = v_hlmt;
                                    foundP = T;
                                }
                            }





        return mt;
    }

    public static SubLObject hlmt_dimensions(final SubLObject v_hlmt) {
        if (NIL != mt_space_naut_p(v_hlmt)) {
            return Mapping.mapcan(HLMT_DIMENSIONS, cycl_utilities.naut_args(v_hlmt, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        }
        return list(v_hlmt);
    }

    public static SubLObject remove_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt) {
        final SubLObject dimensions = hlmt_dimensions(v_hlmt);
        final SubLObject doomed_dimension = get_hlmt_dimension(dim, v_hlmt);
        return new_reduced_hlmt(remove(doomed_dimension, dimensions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject replace_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt, final SubLObject val) {
        final SubLObject dimensions = hlmt_dimensions(v_hlmt);
        final SubLObject doomed_dimension = get_hlmt_dimension(dim, v_hlmt);
        final SubLObject truncated_dimensions = remove(doomed_dimension, dimensions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_dimensions = cons(val, truncated_dimensions);
        return new_reduced_hlmt(new_dimensions);
    }

    public static SubLObject replace_monad_dimension(final SubLObject v_hlmt, final SubLObject monad) {
        return NIL != forts.fort_p(v_hlmt) ? monad : replace_hlmt_dimension($MONAD, v_hlmt, monad);
    }

    public static SubLObject replace_time_dimension(final SubLObject v_hlmt, final SubLObject time_index, SubLObject time_parameter) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        final SubLObject time_dimension = new_time_dimension(time_index, time_parameter);
        return replace_hlmt_dimension($TIME, v_hlmt, time_dimension);
    }

    public static SubLObject default_values_for_dimension_p(final SubLObject dim, final SubLObject val) {
        if (dim.eql($MONAD)) {
            return default_monad_mt_p(val);
        }
        if (dim.eql($TIME)) {
            return default_time_mt_p(val);
        }
        return NIL;
    }

    public static SubLObject some_interesting_hlmtP(final SubLObject hlmts) {
        return list_utilities.any_in_list($sym55$INTERESTING_HLMT_, hlmts, UNPROVIDED);
    }

    public static SubLObject interesting_hlmtP(final SubLObject v_hlmt) {
        SubLObject interestingP = NIL;
        if (NIL != monad_mt_p(v_hlmt)) {
            if (NIL == interestingP) {
                final SubLObject dim = $MONAD;
                if ((NIL == monad_dimension_p(dim)) && (NIL == default_values_for_dimension_p(dim, v_hlmt))) {
                    interestingP = T;
                }
            }
        } else
            if (NIL != mt_dim_naut_p(v_hlmt)) {
                if (NIL == interestingP) {
                    final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                    if ((NIL == monad_dimension_p(dim)) && (NIL == default_values_for_dimension_p(dim, v_hlmt))) {
                        interestingP = T;
                    }
                }
            } else
                if (NIL != mt_space_naut_p(v_hlmt)) {
                    final SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                    if (NIL == interestingP) {
                        SubLObject csome_list_var = args;
                        SubLObject arg = NIL;
                        arg = csome_list_var.first();
                        while ((NIL == interestingP) && (NIL != csome_list_var)) {
                            final SubLObject dim2 = mt_dimension_of_arg(arg);
                            final SubLObject val = arg;
                            if ((NIL == monad_dimension_p(dim2)) && (NIL == default_values_for_dimension_p(dim2, val))) {
                                interestingP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            arg = csome_list_var.first();
                        } 
                    }
                } else
                    if ((NIL != anytime_psc_p(v_hlmt)) || (NIL != anytime_during_psc_fn_naut_p(v_hlmt))) {
                        if (NIL == interestingP) {
                            final SubLObject dim = $TIME;
                            if ((NIL == monad_dimension_p(dim)) && (NIL == default_values_for_dimension_p(dim, v_hlmt))) {
                                interestingP = T;
                            }
                        }
                    } else
                        if (NIL != closed_possibly_hlmt_p(v_hlmt)) {
                            if (NIL == interestingP) {
                                final SubLObject dim = $MONAD;
                                if ((NIL == monad_dimension_p(dim)) && (NIL == default_values_for_dimension_p(dim, v_hlmt))) {
                                    interestingP = T;
                                }
                            }
                        } else
                            if (NIL == interestingP) {
                                final SubLObject dim = $UNKNOWN;
                                if ((NIL == monad_dimension_p(dim)) && (NIL == default_values_for_dimension_p(dim, v_hlmt))) {
                                    interestingP = T;
                                }
                            }





        return interestingP;
    }

    public static SubLObject assertion_hlmt(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return augment_hlmt(mt);
    }

    public static SubLObject hlmt_has_dimension_of_valueP(final SubLObject v_hlmt, final SubLObject dimension, final SubLObject value) {
        SubLObject dimension_of_valueP = NIL;
        if (NIL != monad_mt_p(v_hlmt)) {
            if (NIL == dimension_of_valueP) {
                final SubLObject dim = $MONAD;
                dimension_of_valueP = makeBoolean((NIL != kb_utilities.kbeq(dim, dimension)) && (NIL != hlmt_equal(v_hlmt, value)));
            }
        } else
            if (NIL != mt_dim_naut_p(v_hlmt)) {
                if (NIL == dimension_of_valueP) {
                    final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                    dimension_of_valueP = makeBoolean((NIL != kb_utilities.kbeq(dim, dimension)) && (NIL != hlmt_equal(v_hlmt, value)));
                }
            } else
                if (NIL != mt_space_naut_p(v_hlmt)) {
                    final SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                    if (NIL == dimension_of_valueP) {
                        SubLObject csome_list_var = args;
                        SubLObject arg = NIL;
                        arg = csome_list_var.first();
                        while ((NIL == dimension_of_valueP) && (NIL != csome_list_var)) {
                            final SubLObject dim2 = mt_dimension_of_arg(arg);
                            final SubLObject val = arg;
                            dimension_of_valueP = makeBoolean((NIL != kb_utilities.kbeq(dim2, dimension)) && (NIL != hlmt_equal(val, value)));
                            csome_list_var = csome_list_var.rest();
                            arg = csome_list_var.first();
                        } 
                    }
                } else
                    if ((NIL != anytime_psc_p(v_hlmt)) || (NIL != anytime_during_psc_fn_naut_p(v_hlmt))) {
                        if (NIL == dimension_of_valueP) {
                            final SubLObject dim = $TIME;
                            dimension_of_valueP = makeBoolean((NIL != kb_utilities.kbeq(dim, dimension)) && (NIL != hlmt_equal(v_hlmt, value)));
                        }
                    } else
                        if (NIL != closed_possibly_hlmt_p(v_hlmt)) {
                            if (NIL == dimension_of_valueP) {
                                final SubLObject dim = $MONAD;
                                dimension_of_valueP = makeBoolean((NIL != kb_utilities.kbeq(dim, dimension)) && (NIL != hlmt_equal(v_hlmt, value)));
                            }
                        } else
                            if (NIL == dimension_of_valueP) {
                                final SubLObject dim = $UNKNOWN;
                                dimension_of_valueP = makeBoolean((NIL != kb_utilities.kbeq(dim, dimension)) && (NIL != hlmt_equal(v_hlmt, value)));
                            }





        return dimension_of_valueP;
    }

    public static SubLObject augment_hlmt(final SubLObject v_hlmt) {
        SubLObject remaining_dimensions = copy_list($mt_dimension_types$.getGlobalValue());
        SubLObject dimensions = NIL;
        if (NIL != monad_mt_p(v_hlmt)) {
            final SubLObject dim = $MONAD;
            remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            dimensions = cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
        } else
            if (NIL != mt_dim_naut_p(v_hlmt)) {
                final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                dimensions = cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
            } else
                if (NIL != mt_space_naut_p(v_hlmt)) {
                    SubLObject csome_list_var;
                    final SubLObject args = csome_list_var = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                    SubLObject arg = NIL;
                    arg = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject dim2 = mt_dimension_of_arg(arg);
                        final SubLObject val = arg;
                        remaining_dimensions = delete(dim2, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        dimensions = cons(possibly_augment_dimension(dim2, val), dimensions);
                        csome_list_var = csome_list_var.rest();
                        arg = csome_list_var.first();
                    } 
                } else
                    if ((NIL != anytime_psc_p(v_hlmt)) || (NIL != anytime_during_psc_fn_naut_p(v_hlmt))) {
                        final SubLObject dim = $TIME;
                        remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        dimensions = cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
                    } else
                        if (NIL != closed_possibly_hlmt_p(v_hlmt)) {
                            final SubLObject dim = $MONAD;
                            remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            dimensions = cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
                        } else {
                            final SubLObject dim = $UNKNOWN;
                            remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            dimensions = cons(possibly_augment_dimension(dim, v_hlmt), dimensions);
                        }




        SubLObject cdolist_list_var = remaining_dimensions;
        SubLObject dim3 = NIL;
        dim3 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dimensions = cons(default_dimension_mt(dim3), dimensions);
            cdolist_list_var = cdolist_list_var.rest();
            dim3 = cdolist_list_var.first();
        } 
        return new_hlmt(dimensions);
    }

    public static SubLObject reduce_hlmt(SubLObject v_hlmt, SubLObject minimize_mt_union_mtsP) {
        if (minimize_mt_union_mtsP == UNPROVIDED) {
            minimize_mt_union_mtsP = T;
        }
        v_hlmt = transform_mt_union_nauts(v_hlmt, minimize_mt_union_mtsP);
        final SubLObject monad = hlmt_monad_mt(v_hlmt);
        if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(monad)) {
            return monad;
        }
        if (NIL != kb_utilities.kbeq(monad, v_hlmt)) {
            return v_hlmt;
        }
        SubLObject substantial_dimensions = NIL;
        if (NIL != monad_mt_p(v_hlmt)) {
            final SubLObject dim = $MONAD;
            final SubLObject val = v_hlmt;
            if (NIL == default_values_for_dimension_p(dim, val)) {
                substantial_dimensions = cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
            }
        } else
            if (NIL != mt_dim_naut_p(v_hlmt)) {
                final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                final SubLObject val = v_hlmt;
                if (NIL == default_values_for_dimension_p(dim, val)) {
                    substantial_dimensions = cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
                }
            } else
                if (NIL != mt_space_naut_p(v_hlmt)) {
                    SubLObject csome_list_var;
                    final SubLObject args = csome_list_var = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                    SubLObject arg = NIL;
                    arg = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject dim2 = mt_dimension_of_arg(arg);
                        final SubLObject val2 = arg;
                        if (NIL == default_values_for_dimension_p(dim2, val2)) {
                            substantial_dimensions = cons(possibly_reduce_dimension(dim2, val2), substantial_dimensions);
                        }
                        csome_list_var = csome_list_var.rest();
                        arg = csome_list_var.first();
                    } 
                } else
                    if ((NIL != anytime_psc_p(v_hlmt)) || (NIL != anytime_during_psc_fn_naut_p(v_hlmt))) {
                        final SubLObject dim = $TIME;
                        final SubLObject val = v_hlmt;
                        if (NIL == default_values_for_dimension_p(dim, val)) {
                            substantial_dimensions = cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
                        }
                    } else
                        if (NIL != closed_possibly_hlmt_p(v_hlmt)) {
                            final SubLObject dim = $MONAD;
                            final SubLObject val = v_hlmt;
                            if (NIL == default_values_for_dimension_p(dim, val)) {
                                substantial_dimensions = cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
                            }
                        } else {
                            final SubLObject dim = $UNKNOWN;
                            final SubLObject val = v_hlmt;
                            if (NIL == default_values_for_dimension_p(dim, val)) {
                                substantial_dimensions = cons(possibly_reduce_dimension(dim, val), substantial_dimensions);
                            }
                        }




        if (NIL != list_utilities.singletonP(substantial_dimensions)) {
            return substantial_dimensions.first();
        }
        if (NIL != substantial_dimensions) {
            return new_hlmt(substantial_dimensions);
        }
        return hlmt_monad_mt(v_hlmt);
    }

    public static SubLObject transform_mt_union_nauts(final SubLObject v_hlmt, final SubLObject minimize_mt_union_mtsP) {
        if (NIL != mt_union_naut_p(v_hlmt)) {
            return reduce_mt_union_hlmt(v_hlmt, minimize_mt_union_mtsP);
        }
        if (v_hlmt.isCons()) {
            return cons(transform_mt_union_nauts(v_hlmt.first(), minimize_mt_union_mtsP), transform_mt_union_nauts(v_hlmt.rest(), minimize_mt_union_mtsP));
        }
        return v_hlmt;
    }

    public static SubLObject reduce_mt_union_hlmt(final SubLObject mt_union_hlmt, final SubLObject minimize_mt_union_mtsP) {
        SubLObject mts = mt_union_mts_recursive(mt_union_hlmt);
        if (NIL != list_utilities.member_kbeqP($$EverythingPSC, mts)) {
            return $$EverythingPSC;
        }
        if (NIL != list_utilities.member_kbeqP($$InferencePSC, mts)) {
            return $$InferencePSC;
        }
        if (NIL != minimize_mt_union_mtsP) {
            mts = reduce_mt_union_hlmt_int(kb_utilities.sort_terms(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else {
            mts = kb_utilities.sort_terms(list_utilities.fast_delete_duplicates(mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != list_utilities.lengthLE(mts, ONE_INTEGER, UNPROVIDED)) {
            return mts.first();
        }
        return make_nat_formula($$MtUnionFn, mts);
    }

    public static SubLObject clear_reduce_mt_union_hlmt_int() {
        final SubLObject cs = $reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_reduce_mt_union_hlmt_int(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($reduce_mt_union_hlmt_int_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject reduce_mt_union_hlmt_int_internal(final SubLObject mts) {
        return kb_utilities.sort_terms(genl_mts.min_mts(mts, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject reduce_mt_union_hlmt_int(final SubLObject mts) {
        SubLObject caching_state = $reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(REDUCE_MT_UNION_HLMT_INT, $reduce_mt_union_hlmt_int_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_REDUCE_MT_UNION_HLMT_INT);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(reduce_mt_union_hlmt_int_internal(mts)));
            memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject new_reduced_hlmt(final SubLObject mt_dimensions) {
        return reduce_hlmt(new_hlmt(mt_dimensions), UNPROVIDED);
    }

    public static SubLObject combine_hlmts(SubLObject hlmt1, SubLObject hlmt2) {
        if ((NIL != kb_utilities.kbeq(hlmt1, $$EverythingPSC)) || (NIL != kb_utilities.kbeq(hlmt2, $$EverythingPSC))) {
            return $$EverythingPSC;
        }
        if ((NIL != kb_utilities.kbeq(hlmt1, $$InferencePSC)) || (NIL != kb_utilities.kbeq(hlmt2, $$InferencePSC))) {
            return $$InferencePSC;
        }
        SubLObject mts = NIL;
        hlmt1 = hlmt_czer.canonicalize_hlmt(hlmt1);
        hlmt2 = hlmt_czer.canonicalize_hlmt(hlmt2);
        if (NIL != mt_union_naut_p(hlmt1)) {
            mts = append(mt_union_mts(hlmt1), mts);
        } else {
            mts = cons(hlmt1, mts);
        }
        if (NIL != mt_union_naut_p(hlmt2)) {
            mts = append(mt_union_mts(hlmt2), mts);
        } else {
            mts = cons(hlmt2, mts);
        }
        mts = genl_mts.min_mts(mts, UNPROVIDED);
        if (NIL != list_utilities.singletonP(mts)) {
            return mts.first();
        }
        return czer_main.canonicalize_term(make_formula($$MtUnionFn, mts, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject new_canonicalized_hlmt(final SubLObject mt_dimensions) {
        return hlmt_czer.canonicalize_hlmt(new_hlmt(mt_dimensions));
    }

    public static SubLObject possibly_augment_dimension(final SubLObject dim, final SubLObject val) {
        if (dim.eql($MONAD)) {
            return val;
        }
        if (dim.eql($TIME)) {
            return possibly_augment_time_mt(val);
        }
        return val;
    }

    public static SubLObject possibly_reduce_dimension(final SubLObject dim, final SubLObject val) {
        if (dim.eql($MONAD)) {
            return val;
        }
        if (dim.eql($TIME)) {
            return possibly_reduce_time_mt(val);
        }
        return val;
    }

    public static SubLObject default_dimension_mt(final SubLObject dim) {
        if (dim.eql($MONAD)) {
            return $default_monad_mt$.getGlobalValue();
        }
        if (dim.eql($TIME)) {
            return default_time_mt();
        }
        return NIL;
    }

    public static SubLObject new_hlmt_from_dimension_plist(final SubLObject dim_plist) {
        return NIL;
    }

    public static SubLObject valid_hlmtP(final SubLObject v_hlmt, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != hlmtP(v_hlmt)) && (NIL != valid_hlmt_p(v_hlmt, robust)));
    }

    public static SubLObject valid_hlmt_p(final SubLObject v_hlmt, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if (NIL == hlmt_p(v_hlmt)) {
            return NIL;
        }
        if (NIL != robust) {
            SubLObject invalidP = NIL;
            if (NIL != monad_mt_p(v_hlmt)) {
                if (NIL == invalidP) {
                    final SubLObject dim = $MONAD;
                    if (NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                        invalidP = T;
                    }
                }
            } else
                if (NIL != mt_dim_naut_p(v_hlmt)) {
                    if (NIL == invalidP) {
                        final SubLObject dim = mt_dim_nat_dimension(v_hlmt);
                        if (NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                            invalidP = T;
                        }
                    }
                } else
                    if (NIL != mt_space_naut_p(v_hlmt)) {
                        final SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                        if (NIL == invalidP) {
                            SubLObject csome_list_var = args;
                            SubLObject arg = NIL;
                            arg = csome_list_var.first();
                            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                                final SubLObject dim2 = mt_dimension_of_arg(arg);
                                final SubLObject val = arg;
                                if (NIL == valid_mt_for_dimension_p(dim2, val)) {
                                    invalidP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                arg = csome_list_var.first();
                            } 
                        }
                    } else
                        if ((NIL != anytime_psc_p(v_hlmt)) || (NIL != anytime_during_psc_fn_naut_p(v_hlmt))) {
                            if (NIL == invalidP) {
                                final SubLObject dim = $TIME;
                                if (NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                                    invalidP = T;
                                }
                            }
                        } else
                            if (NIL != closed_possibly_hlmt_p(v_hlmt)) {
                                if (NIL == invalidP) {
                                    final SubLObject dim = $MONAD;
                                    if (NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                                        invalidP = T;
                                    }
                                }
                            } else
                                if (NIL == invalidP) {
                                    final SubLObject dim = $UNKNOWN;
                                    if (NIL == valid_mt_for_dimension_p(dim, v_hlmt)) {
                                        invalidP = T;
                                    }
                                }





            return makeBoolean(NIL == invalidP);
        }
        return valid_monad_mt_p(hlmt_monad_mt(v_hlmt));
    }

    public static SubLObject valid_mt_for_dimension_p(final SubLObject dim, final SubLObject val) {
        if (dim.eql($MONAD)) {
            return valid_monad_mt_p(val);
        }
        if (dim.eql($TIME)) {
            return valid_temporal_mt_slice_p(val);
        }
        return NIL;
    }

    public static SubLObject default_monad_mt_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_monad_mt$.getGlobalValue());
    }

    public static SubLObject monad_dimension_p(final SubLObject v_object) {
        return eql(v_object, $MONAD);
    }

    public static SubLObject monad_mt_p(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL == anytime_psc_p(v_object))) || ((NIL != mt_union_naut_p(v_object)) && (NIL != list_utilities.every_in_list(MONAD_MT_P, mt_union_mts(v_object), UNPROVIDED))));
    }

    public static SubLObject valid_monad_mt_p(final SubLObject mt) {
        if (NIL != mt) {
            return makeBoolean((NIL != forts.valid_fortP(mt)) && (NIL != fort_types_interface.mtP(mt)));
        }
        return T;
    }

    public static SubLObject monad_mtP(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.mtP(v_object))) || ((NIL != mt_union_naut_p(v_object)) && (NIL != list_utilities.every_in_list($sym59$MONAD_MT_, mt_union_mts(v_object), UNPROVIDED))));
    }

    public static SubLObject monad_cycl_mtP(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_mt_p(v_object)) && (NIL == hlmt_naut_p(v_object))) && (NIL != isa.isa_in_any_mtP(v_object, $$Microtheory)));
    }

    public static SubLObject hlmt_monad_mt(final SubLObject v_hlmt) {
        final SubLObject monad_mt = hlmt_monad_mt_without_default(v_hlmt);
        return NIL != monad_mt ? monad_mt : $default_monad_mt$.getGlobalValue();
    }

    public static SubLObject hlmt_monad_mt_without_default(final SubLObject v_hlmt) {
        return NIL != hlmt_naut_p(v_hlmt) ? get_hlmt_dimension($MONAD, v_hlmt) : v_hlmt;
    }

    public static SubLObject assertion_monad_mt(final SubLObject assertion) {
        final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
        final SubLObject monad_mt = hlmt_monad_mt(v_hlmt);
        if (NIL != monad_mt) {
            return monad_mt;
        }
        return $default_monad_mt$.getGlobalValue();
    }

    public static SubLObject equal_mt_monads_p(final SubLObject object0, final SubLObject object1) {
        return monad_mt_equal(hlmt_monad_mt(object0), hlmt_monad_mt(object1));
    }

    public static SubLObject monad_mt_equal(final SubLObject object0, final SubLObject object1) {
        return kb_utilities.kbeq(object0, object1);
    }

    public static SubLObject temporal_dimension_function_p(final SubLObject dim) {
        return subl_promotions.memberP(dim, $temporal_dimension_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject temporal_dimension_predicate_p(final SubLObject pred) {
        return list_utilities.member_kbeqP(pred, $temporal_dimension_predicates$.getGlobalValue());
    }

    public static SubLObject default_mt_time_interval_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_mt_time_interval$.getGlobalValue());
    }

    public static SubLObject default_mt_time_parameter_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_mt_time_parameter$.getGlobalValue());
    }

    public static SubLObject default_time_mt_p(final SubLObject dim) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_naut_p(dim)) {
            thread.resetMultipleValues();
            final SubLObject interval = explode_hlmt_temporal_facets_with_defaults(dim);
            final SubLObject parameter = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((NIL != kb_utilities.kbeq(interval, $default_mt_time_interval$.getGlobalValue())) && (NIL != kb_utilities.kbeq(parameter, $default_mt_time_parameter$.getGlobalValue())));
        }
        return NIL;
    }

    public static SubLObject time_point_mt_time_parameter_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_atemporal_genlmt_time_parameter$.getGlobalValue());
    }

    public static SubLObject mt_time_dim_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != temporal_dimension_function_p(cycl_utilities.naut_functor(v_object))));
    }

    public static SubLObject anytime_psc_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $anytime_psc$.getGlobalValue());
    }

    public static SubLObject anytime_during_psc_fn_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $anytime_during_psc_fn$.getGlobalValue());
    }

    public static SubLObject anytime_during_psc_fn_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != anytime_during_psc_fn_p(cycl_utilities.naut_functor(v_object))));
    }

    public static SubLObject anytime_psc_hlmtP(final SubLObject v_hlmt) {
        return anytime_psc_p(hlmt_temporal_mt(v_hlmt));
    }

    public static SubLObject anytime_during_psc_hlmtP(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        return makeBoolean((NIL != anytime_during_psc_fn_naut_p(time_mt)) && (NIL != isa.isaP(anytime_during_psc_fn_time_interval(time_mt), $$TimeInterval, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject temporal_hlmt_p(final SubLObject v_object) {
        if (NIL != hlmt_naut_p(v_object)) {
            return list_utilities.sublisp_boolean(hlmt_temporal_mt(v_object));
        }
        return NIL;
    }

    public static SubLObject atemporal_hlmtP(final SubLObject v_hlmt) {
        return makeBoolean(NIL == temporal_hlmt_p(v_hlmt));
    }

    public static SubLObject temporal_dimension_mt_p(final SubLObject v_object) {
        if (NIL != anytime_psc_p(v_object)) {
            return T;
        }
        if (NIL != anytime_during_psc_fn_naut_p(v_object)) {
            return T;
        }
        if (NIL == mt_dim_naut_p(v_object)) {
            return NIL;
        }
        final SubLObject functor = cycl_utilities.naut_functor(v_object);
        if (NIL != temporal_dimension_function_p(functor)) {
            return T;
        }
        if (NIL != kb_utilities.kbeq(functor, $$MtDim)) {
            return temporal_dimension_predicate_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject time_dimension_p(final SubLObject v_object) {
        return eq(v_object, $TIME);
    }

    public static SubLObject time_intervalP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$TimeInterval, UNPROVIDED);
    }

    public static SubLObject temporal_objectP(final SubLObject v_object) {
        return makeBoolean((NIL != time_intervalP(v_object)) || (NIL != at_defns.quiet_has_typeP(v_object, $$TemporalThing, UNPROVIDED)));
    }

    public static SubLObject time_parameterP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$TimeParameter, UNPROVIDED);
    }

    public static SubLObject time_mt_with_implicit_parameter_p(final SubLObject dim_nat) {
        return makeBoolean((NIL != possibly_naut_p(dim_nat)) && (NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(dim_nat), $$MtTimeDimFn)));
    }

    public static SubLObject time_mt_with_explicit_parameter_p(final SubLObject dim_nat) {
        return makeBoolean((NIL != possibly_naut_p(dim_nat)) && (NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(dim_nat), $$MtTimeWithGranularityDimFn)));
    }

    public static SubLObject time_mt_with_indeterminate_time_p(final SubLObject dim_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mt_time_dim_naut_p(dim_nat)) {
            thread.resetMultipleValues();
            final SubLObject index = mt_time_dim_nat_temporal_values(dim_nat);
            final SubLObject param = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return indeterminate_time_interval_p(index);
        }
        return NIL;
    }

    public static SubLObject some_time_in_interval_naut_p(final SubLObject interval) {
        return makeBoolean((NIL != possibly_naut_p(interval)) && (NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(interval), $$SomeTimeInIntervalFn)));
    }

    public static SubLObject indeterminate_time_interval_p(final SubLObject interval) {
        return makeBoolean((NIL != possibly_nat_p(interval)) && ((NIL != some_time_in_interval_naut_p(interval)) || (NIL != list_utilities.any_in_list(INDETERMINATE_TIME_INTERVAL_P, cycl_utilities.nat_args(interval, UNPROVIDED), UNPROVIDED))));
    }

    public static SubLObject hlmt_with_indeterminate_time_p(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        if (NIL != time_mt) {
            return time_mt_with_indeterminate_time_p(time_mt);
        }
        return NIL;
    }

    public static SubLObject hlmt_with_anytime_psc_p(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        return makeBoolean((NIL != anytime_psc_p(time_mt)) || (NIL != anytime_during_psc_fn_naut_p(time_mt)));
    }

    public static SubLObject equal_mt_times_p(final SubLObject object0, final SubLObject object1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_utilities.kbeq(object0, object1)) {
            return T;
        }
        final SubLObject indeterminate_0P = hlmt_with_indeterminate_time_p(object0);
        final SubLObject indeterminate_1P = hlmt_with_indeterminate_time_p(object1);
        if ((NIL == indeterminate_0P) && (NIL == indeterminate_1P)) {
            thread.resetMultipleValues();
            final SubLObject interval0 = explode_hlmt_temporal_facets_with_defaults(object0);
            final SubLObject parameter0 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject interval2 = explode_hlmt_temporal_facets_with_defaults(object1);
            final SubLObject parameter2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((NIL != temporal_object_equal(interval0, interval2)) && (NIL != time_parameter_equal(parameter0, parameter2)));
        }
        if ((NIL != indeterminate_0P) && (NIL != indeterminate_1P)) {
            thread.resetMultipleValues();
            final SubLObject interval0 = explode_indeterminate_time_dim_nat(object0);
            final SubLObject sentence0 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            final SubLObject interval2 = explode_indeterminate_time_dim_nat(object1);
            final SubLObject sentence2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((NIL != temporal_object_equal(interval0, interval2)) && (NIL != some_time_sentence_match_p(sentence0, sentence2)));
        }
        return NIL;
    }

    public static SubLObject temporal_object_equal(final SubLObject object0, final SubLObject object1) {
        return equal(object0, object1);
    }

    public static SubLObject time_parameter_equal(final SubLObject object0, final SubLObject object1) {
        return equal(object0, object1);
    }

    public static SubLObject hlmt_times_equal_p(final SubLObject hlmt0, final SubLObject hlmt1) {
        return equal_mt_times_p(hlmt_temporal_mt(hlmt0), hlmt_temporal_mt(hlmt1));
    }

    public static SubLObject some_time_sentence_match_p(final SubLObject sent0, final SubLObject sent1) {
        final SubLObject conjunct0P = el_conjunction_p(sent0);
        final SubLObject conjunct1P = el_conjunction_p(sent1);
        if ((NIL != conjunct0P) && (NIL != conjunct1P)) {
            Errors.cerror($str67$Continue_Anyway_, $str68$We_should_never_test_two_some_tim);
            return NIL;
        }
        if (NIL != conjunct0P) {
            return subsetp(sent1, sent0, symbol_function(EQUAL), UNPROVIDED);
        }
        if (NIL != conjunct1P) {
            return subsetp(sent0, sent1, symbol_function(EQUAL), UNPROVIDED);
        }
        return equal(sent0, sent1);
    }

    public static SubLObject hlmt_temporal_mt(final SubLObject v_hlmt) {
        return get_hlmt_dimension($TIME, v_hlmt);
    }

    public static SubLObject extract_hlmt_temporal_index(final SubLObject v_hlmt) {
        return cycl_utilities.nat_arg1(hlmt_temporal_mt(v_hlmt), UNPROVIDED);
    }

    public static SubLObject extract_hlmt_temporal_index_or_default(final SubLObject v_hlmt) {
        final SubLObject time_interval = cycl_utilities.nat_arg1(hlmt_temporal_mt(v_hlmt), UNPROVIDED);
        return NIL != time_interval ? time_interval : $default_mt_time_interval$.getGlobalValue();
    }

    public static SubLObject extract_hlmt_time_parameter(final SubLObject v_hlmt) {
        final SubLObject time_parameter = cycl_utilities.nat_arg2(hlmt_temporal_mt(v_hlmt), UNPROVIDED);
        return NIL != atemporal_hlmtP(v_hlmt) ? NIL != time_parameter ? time_parameter : $default_atemporal_genlmt_time_parameter$.getGlobalValue() : NIL != time_parameter ? time_parameter : $default_mt_time_parameter$.getGlobalValue();
    }

    public static SubLObject destructure_mt_time_dim_nat(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        temporal_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        time_parameter = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject v_hlmt = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), list(MT_TIME_DIM_NAT_TEMPORAL_VALUES, v_hlmt)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject mt_time_dim_nat_temporal_values(final SubLObject dim_nat) {
        if (NIL == dim_nat) {
            return values(NIL, NIL);
        }
        final SubLObject pcase_var;
        final SubLObject functor = pcase_var = cycl_utilities.naut_functor(dim_nat);
        if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
            return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, UNPROVIDED));
        }
        if (pcase_var.eql($$MtTimeDimFn)) {
            return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), $$Null_TimeParameter);
        }
        Errors.cerror($str67$Continue_Anyway_, $str72$DIM_NAT__a_is_not_a_microtheory_t, dim_nat);
        return NIL;
    }

    public static SubLObject explode_indeterminate_time_dim_nat(final SubLObject dim_nat) {
        return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, UNPROVIDED));
    }

    public static SubLObject anytime_during_psc_fn_time_interval(final SubLObject anytime_during_psc_naut) {
        return cycl_utilities.naut_arg1(anytime_during_psc_naut, UNPROVIDED);
    }

    public static SubLObject explode_hlmt_temporal_facets(final SubLObject v_hlmt, final SubLObject default_interval, final SubLObject default_parameter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        if (NIL != anytime_psc_p(time_mt)) {
            return values(NIL, NIL);
        }
        if (NIL != anytime_during_psc_fn_naut_p(time_mt)) {
            return values(NIL, NIL);
        }
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject temporal_object_$3 = mt_time_dim_nat_temporal_values(time_mt);
        final SubLObject time_parameter_$4 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        temporal_object = temporal_object_$3;
        time_parameter = time_parameter_$4;
        if (NIL == temporal_object) {
            if (default_interval == $ERROR) {
                temporal_object = $default_mt_time_interval$.getGlobalValue();
            } else {
                temporal_object = default_interval;
            }
        }
        if (NIL == time_parameter) {
            if (default_parameter == $ERROR) {
                time_parameter = $default_mt_time_parameter$.getGlobalValue();
            } else {
                time_parameter = default_parameter;
            }
        }
        return values(temporal_object, time_parameter);
    }

    public static SubLObject explode_hlmt_temporal_facets_with_defaults(final SubLObject v_hlmt) {
        return explode_hlmt_temporal_facets(v_hlmt, $default_mt_time_interval$.getGlobalValue(), $default_mt_time_parameter$.getGlobalValue());
    }

    public static SubLObject explode_genlmt_temporal_facets_based_on_temporality(final SubLObject v_hlmt, final SubLObject atemporalP) {
        if (NIL != atemporalP) {
            return explode_hlmt_temporal_facets(v_hlmt, $default_mt_time_interval$.getGlobalValue(), $default_atemporal_genlmt_time_parameter$.getGlobalValue());
        }
        return explode_hlmt_temporal_facets_with_defaults(v_hlmt);
    }

    public static SubLObject destructure_monad_and_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject monad_mt = NIL;
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list74);
        monad_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        temporal_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        time_parameter = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject v_hlmt = NIL;
            destructuring_bind_must_consp(current, datum, $list74);
            v_hlmt = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(list(monad_mt, list(HLMT_MONAD_MT, v_hlmt)), temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), list(EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS, v_hlmt)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list74);
        return NIL;
    }

    public static SubLObject destructure_monad_and_temporal_facets_without_defaults(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject monad_mt = NIL;
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list74);
        monad_mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        temporal_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list74);
        time_parameter = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject v_hlmt = NIL;
            destructuring_bind_must_consp(current, datum, $list74);
            v_hlmt = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(list(monad_mt, list(HLMT_MONAD_MT_WITHOUT_DEFAULT, v_hlmt)), temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), listS(EXPLODE_HLMT_TEMPORAL_FACETS, v_hlmt, $list78)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list74);
        return NIL;
    }

    public static SubLObject destructure_temporal_mt_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        temporal_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        time_parameter = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject v_hlmt = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CLET, list(temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), listS(EXPLODE_HLMT_TEMPORAL_FACETS, v_hlmt, $list79)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject destructure_atemporal_genlmt_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        temporal_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        time_parameter = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject v_hlmt = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = body = current.rest();
            return list(PROGN, list(IGNORE, v_hlmt), listS(CLET, list(bq_cons(temporal_object, $list82), bq_cons(time_parameter, $list83)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject destructure_atemporal_specmt_temporal_facets(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject temporal_object = NIL;
        SubLObject time_parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list69);
        temporal_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list69);
        time_parameter = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject v_hlmt = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            v_hlmt = current.first();
            final SubLObject body;
            current = body = current.rest();
            return list(PROGN, list(IGNORE, v_hlmt), listS(CLET, list(bq_cons(temporal_object, $list82), bq_cons(time_parameter, $list84)), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list69);
        return NIL;
    }

    public static SubLObject new_time_dimension(final SubLObject temporal_object, SubLObject time_parameter) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        if (NIL != anytime_psc_p(temporal_object)) {
            return temporal_object;
        }
        if (NIL != anytime_during_psc_fn_naut_p(temporal_object)) {
            return temporal_object;
        }
        if (NIL != time_parameter) {
            return list($$MtTimeWithGranularityDimFn, temporal_object, time_parameter);
        }
        return list($$MtTimeDimFn, temporal_object);
    }

    public static SubLObject new_temporal_hlmt(final SubLObject monad_mt, final SubLObject temporal_object, final SubLObject time_parameter) {
        return new_hlmt(list(monad_mt, new_time_dimension(temporal_object, time_parameter)));
    }

    public static SubLObject new_canonicalized_temporal_hlmt(final SubLObject monad_mt, final SubLObject time_mt) {
        return hlmt_czer.canonicalize_hlmt(new_hlmt(list(monad_mt, time_mt)));
    }

    public static SubLObject new_default_granularity_hlmt(final SubLObject monad_mt, final SubLObject temporal_object) {
        return new_hlmt(list(monad_mt, new_time_dimension(temporal_object, UNPROVIDED)));
    }

    public static SubLObject default_time_mt() {
        return list($$MtTimeDimFn, $default_mt_time_interval$.getGlobalValue());
    }

    public static SubLObject new_temporal_object_default_parameter_mt(final SubLObject interval) {
        return list($$MtTimeDimFn, interval);
    }

    public static SubLObject possibly_augment_time_mt(final SubLObject time_dim_nat) {
        if (NIL != time_mt_with_implicit_parameter_p(time_dim_nat)) {
            return add_default_parameter_to_time_nat(time_dim_nat);
        }
        return time_dim_nat;
    }

    public static SubLObject possibly_reduce_time_mt(final SubLObject time_dim_nat) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != time_mt_with_explicit_parameter_p(time_dim_nat)) {
            SubLObject interval = NIL;
            SubLObject parameter = NIL;
            thread.resetMultipleValues();
            final SubLObject interval_$5 = mt_time_dim_nat_temporal_values(time_dim_nat);
            final SubLObject parameter_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            interval = interval_$5;
            parameter = parameter_$6;
            if (NIL != default_mt_time_parameter_p(parameter)) {
                return new_temporal_object_default_parameter_mt(interval);
            }
        }
        return time_dim_nat;
    }

    public static SubLObject add_default_parameter_to_time_nat(final SubLObject dim_nat) {
        final SubLObject interval = cycl_utilities.nat_arg1(dim_nat, UNPROVIDED);
        return list($$MtTimeWithGranularityDimFn, interval, $default_mt_time_parameter$.getGlobalValue());
    }

    public static SubLObject valid_temporal_mt_slice_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != temporal_dimension_mt_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            SubLObject interval = NIL;
            SubLObject parameter = NIL;
            thread.resetMultipleValues();
            final SubLObject interval_$7 = mt_time_dim_nat_temporal_values(v_object);
            final SubLObject parameter_$8 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            interval = interval_$7;
            parameter = parameter_$8;
            final SubLObject pcase_var = functor;
            if (pcase_var.eql($$MtTimeDimFn)) {
                return valid_temporal_object_p(interval);
            }
            if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
                return makeBoolean((NIL != valid_temporal_object_p(interval)) && (NIL != valid_time_parameter_p(parameter)));
            }
        }
        return NIL;
    }

    public static SubLObject valid_temporal_object_p(final SubLObject temporal_object) {
        return makeBoolean((NIL == temporal_object) || (NIL != isa.isa_in_any_mtP(temporal_object, $$TemporalThing)));
    }

    public static SubLObject valid_time_parameter_p(final SubLObject time_parameter) {
        return makeBoolean((NIL == time_parameter) || (NIL != isa.isa_in_any_mtP(time_parameter, $$TimeParameter)));
    }

    public static SubLObject valid_mt_time_with_granularity_dim_arglistP(final SubLObject args) {
        return makeBoolean(((NIL != list_utilities.lengthE(args, TWO_INTEGER, UNPROVIDED)) && (NIL != valid_temporal_object_p(args.first()))) && (NIL != valid_time_parameter_p(second(args))));
    }

    public static SubLObject valid_mt_time_dim_arglistP(final SubLObject args) {
        return makeBoolean((NIL != list_utilities.lengthE(args, ONE_INTEGER, UNPROVIDED)) && (NIL != valid_temporal_object_p(args.first())));
    }

    public static SubLObject relevant_mt_with_inference_relevance(final SubLObject test_mt, final SubLObject inference_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inference_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = mt_relevance_macros.relevant_mtP(test_mt);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject declare_hlmt_file() {
        declareFunction(me, "hlmts_supportedP", "HLMTS-SUPPORTED?", 0, 0, false);
        declareMacro(me, "with_hlmts", "WITH-HLMTS");
        declareFunction(me, "enable_hlmts", "ENABLE-HLMTS", 0, 0, false);
        declareFunction(me, "disable_hlmts", "DISABLE-HLMTS", 0, 0, false);
        declareFunction(me, "unindexed_hlmt_syntax_constants", "UNINDEXED-HLMT-SYNTAX-CONSTANTS", 0, 0, false);
        declareFunction(me, "unindexed_hlmt_syntax_constant_p", "UNINDEXED-HLMT-SYNTAX-CONSTANT-P", 1, 0, false);
        declareFunction(me, "fully_indexed_hlmt_term_p", "FULLY-INDEXED-HLMT-TERM-P", 1, 0, false);
        declareFunction(me, "mt_space_function_p", "MT-SPACE-FUNCTION-P", 1, 0, false);
        declareFunction(me, "possibly_mt_p", "POSSIBLY-MT-P", 1, 0, false);
        declareFunction(me, "possibly_hlmt_p", "POSSIBLY-HLMT-P", 1, 0, false);
        declareFunction(me, "fort_or_chlmt_p", "FORT-OR-CHLMT-P", 1, 0, false);
        declareFunction(me, "chlmt_p", "CHLMT-P", 1, 0, false);
        declareFunction(me, "closed_hlmt_p", "CLOSED-HLMT-P", 1, 0, false);
        new hlmt.$closed_hlmt_p$UnaryFunction();
        declareFunction(me, "closed_possibly_hlmt_p", "CLOSED-POSSIBLY-HLMT-P", 1, 0, false);
        declareFunction(me, "hlmt_p", "HLMT-P", 1, 0, false);
        declareFunction(me, "hlmt_p_no_time", "HLMT-P-NO-TIME", 1, 0, false);
        declareFunction(me, "hlmt_p_time", "HLMT-P-TIME", 1, 0, false);
        declareFunction(me, "possibly_hlmt_naut_p", "POSSIBLY-HLMT-NAUT-P", 1, 0, false);
        declareFunction(me, "hlmt_naut_p", "HLMT-NAUT-P", 1, 0, false);
        declareFunction(me, "mt_space_naut_p", "MT-SPACE-NAUT-P", 1, 0, false);
        declareFunction(me, "mt_space_naut_arglist_p", "MT-SPACE-NAUT-ARGLIST-P", 1, 0, false);
        declareFunction(me, "mt_dim_naut_p", "MT-DIM-NAUT-P", 1, 0, false);
        declareFunction(me, "mt_union_naut_p", "MT-UNION-NAUT-P", 1, 0, false);
        declareFunction(me, "mt_union_function_p", "MT-UNION-FUNCTION-P", 1, 0, false);
        declareFunction(me, "hlmtP", "HLMT?", 1, 0, false);
        new hlmt.$hlmtP$UnaryFunction();
        declareFunction(me, "hlmtP_int", "HLMT?-INT", 1, 0, false);
        declareFunction(me, "hlmtP_no_time", "HLMT?-NO-TIME", 1, 0, false);
        declareFunction(me, "hlmtP_time", "HLMT?-TIME", 1, 0, false);
        declareFunction(me, "hlmt_nautP", "HLMT-NAUT?", 1, 0, false);
        declareFunction(me, "mt_space_mtP", "MT-SPACE-MT?", 1, 0, false);
        declareFunction(me, "mt_space_arglistP", "MT-SPACE-ARGLIST?", 1, 0, false);
        declareFunction(me, "mt_dim_mtP", "MT-DIM-MT?", 1, 0, false);
        declareFunction(me, "mt_dim_arglistP", "MT-DIM-ARGLIST?", 2, 0, false);
        declareFunction(me, "mt_union_nautP", "MT-UNION-NAUT?", 1, 0, false);
        declareFunction(me, "mt_union_arglistP", "MT-UNION-ARGLIST?", 1, 0, false);
        declareFunction(me, "hlmt_equal", "HLMT-EQUAL", 2, 0, false);
        new hlmt.$hlmt_equal$BinaryFunction();
        declareFunction(me, "hlmt_equalP", "HLMT-EQUAL?", 2, 0, false);
        declareFunction(me, "new_hlmt", "NEW-HLMT", 1, 0, false);
        declareFunction(me, "copy_hlmt", "COPY-HLMT", 1, 0, false);
        declareFunction(me, "new_anytime_during_psc_naut", "NEW-ANYTIME-DURING-PSC-NAUT", 1, 0, false);
        declareFunction(me, "anytime_psc", "ANYTIME-PSC", 0, 0, false);
        declareFunction(me, "mt_union_mts", "MT-UNION-MTS", 1, 0, false);
        declareFunction(me, "mt_union_mts_recursive", "MT-UNION-MTS-RECURSIVE", 1, 0, false);
        declareFunction(me, "mt_union_mts_recursive_int", "MT-UNION-MTS-RECURSIVE-INT", 1, 0, false);
        new hlmt.$mt_union_mts_recursive_int$UnaryFunction();
        declareFunction(me, "union_mt_relevance_contexts", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
        declareFunction(me, "mt_dimension_type_p", "MT-DIMENSION-TYPE-P", 1, 0, false);
        declareFunction(me, "mt_dimension_types", "MT-DIMENSION-TYPES", 0, 0, false);
        declareFunction(me, "mt_dimension_function_p", "MT-DIMENSION-FUNCTION-P", 1, 0, false);
        declareFunction(me, "context_space_function_p", "CONTEXT-SPACE-FUNCTION-P", 1, 0, false);
        declareFunction(me, "mt_dimension_predicate_p", "MT-DIMENSION-PREDICATE-P", 1, 0, false);
        declareMacro(me, "do_mt_dimensions", "DO-MT-DIMENSIONS");
        declareFunction(me, "mt_dimension_of_arg", "MT-DIMENSION-OF-ARG", 1, 0, false);
        declareFunction(me, "single_dimension_mt_dimension", "SINGLE-DIMENSION-MT-DIMENSION", 1, 0, false);
        new hlmt.$single_dimension_mt_dimension$UnaryFunction();
        declareFunction(me, "mt_dim_nat_dimension", "MT-DIM-NAT-DIMENSION", 1, 0, false);
        declareFunction(me, "get_hlmt_dimension", "GET-HLMT-DIMENSION", 2, 0, false);
        declareFunction(me, "hlmt_dimensions", "HLMT-DIMENSIONS", 1, 0, false);
        declareFunction(me, "remove_hlmt_dimension", "REMOVE-HLMT-DIMENSION", 2, 0, false);
        declareFunction(me, "replace_hlmt_dimension", "REPLACE-HLMT-DIMENSION", 3, 0, false);
        declareFunction(me, "replace_monad_dimension", "REPLACE-MONAD-DIMENSION", 2, 0, false);
        declareFunction(me, "replace_time_dimension", "REPLACE-TIME-DIMENSION", 2, 1, false);
        declareFunction(me, "default_values_for_dimension_p", "DEFAULT-VALUES-FOR-DIMENSION-P", 2, 0, false);
        declareFunction(me, "some_interesting_hlmtP", "SOME-INTERESTING-HLMT?", 1, 0, false);
        declareFunction(me, "interesting_hlmtP", "INTERESTING-HLMT?", 1, 0, false);
        declareFunction(me, "assertion_hlmt", "ASSERTION-HLMT", 1, 0, false);
        declareFunction(me, "hlmt_has_dimension_of_valueP", "HLMT-HAS-DIMENSION-OF-VALUE?", 3, 0, false);
        declareFunction(me, "augment_hlmt", "AUGMENT-HLMT", 1, 0, false);
        declareFunction(me, "reduce_hlmt", "REDUCE-HLMT", 1, 1, false);
        declareFunction(me, "transform_mt_union_nauts", "TRANSFORM-MT-UNION-NAUTS", 2, 0, false);
        declareFunction(me, "reduce_mt_union_hlmt", "REDUCE-MT-UNION-HLMT", 2, 0, false);
        declareFunction(me, "clear_reduce_mt_union_hlmt_int", "CLEAR-REDUCE-MT-UNION-HLMT-INT", 0, 0, false);
        declareFunction(me, "remove_reduce_mt_union_hlmt_int", "REMOVE-REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        declareFunction(me, "reduce_mt_union_hlmt_int_internal", "REDUCE-MT-UNION-HLMT-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "reduce_mt_union_hlmt_int", "REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        declareFunction(me, "new_reduced_hlmt", "NEW-REDUCED-HLMT", 1, 0, false);
        declareFunction(me, "combine_hlmts", "COMBINE-HLMTS", 2, 0, false);
        declareFunction(me, "new_canonicalized_hlmt", "NEW-CANONICALIZED-HLMT", 1, 0, false);
        declareFunction(me, "possibly_augment_dimension", "POSSIBLY-AUGMENT-DIMENSION", 2, 0, false);
        declareFunction(me, "possibly_reduce_dimension", "POSSIBLY-REDUCE-DIMENSION", 2, 0, false);
        declareFunction(me, "default_dimension_mt", "DEFAULT-DIMENSION-MT", 1, 0, false);
        declareFunction(me, "new_hlmt_from_dimension_plist", "NEW-HLMT-FROM-DIMENSION-PLIST", 1, 0, false);
        declareFunction(me, "valid_hlmtP", "VALID-HLMT?", 1, 1, false);
        declareFunction(me, "valid_hlmt_p", "VALID-HLMT-P", 1, 1, false);
        declareFunction(me, "valid_mt_for_dimension_p", "VALID-MT-FOR-DIMENSION-P", 2, 0, false);
        declareFunction(me, "default_monad_mt_p", "DEFAULT-MONAD-MT-P", 1, 0, false);
        declareFunction(me, "monad_dimension_p", "MONAD-DIMENSION-P", 1, 0, false);
        declareFunction(me, "monad_mt_p", "MONAD-MT-P", 1, 0, false);
        new hlmt.$monad_mt_p$UnaryFunction();
        declareFunction(me, "valid_monad_mt_p", "VALID-MONAD-MT-P", 1, 0, false);
        declareFunction(me, "monad_mtP", "MONAD-MT?", 1, 0, false);
        declareFunction(me, "monad_cycl_mtP", "MONAD-CYCL-MT?", 1, 0, false);
        new hlmt.$monad_cycl_mtP$UnaryFunction();
        declareFunction(me, "hlmt_monad_mt", "HLMT-MONAD-MT", 1, 0, false);
        declareFunction(me, "hlmt_monad_mt_without_default", "HLMT-MONAD-MT-WITHOUT-DEFAULT", 1, 0, false);
        declareFunction(me, "assertion_monad_mt", "ASSERTION-MONAD-MT", 1, 0, false);
        declareFunction(me, "equal_mt_monads_p", "EQUAL-MT-MONADS-P", 2, 0, false);
        declareFunction(me, "monad_mt_equal", "MONAD-MT-EQUAL", 2, 0, false);
        declareFunction(me, "temporal_dimension_function_p", "TEMPORAL-DIMENSION-FUNCTION-P", 1, 0, false);
        declareFunction(me, "temporal_dimension_predicate_p", "TEMPORAL-DIMENSION-PREDICATE-P", 1, 0, false);
        declareFunction(me, "default_mt_time_interval_p", "DEFAULT-MT-TIME-INTERVAL-P", 1, 0, false);
        declareFunction(me, "default_mt_time_parameter_p", "DEFAULT-MT-TIME-PARAMETER-P", 1, 0, false);
        declareFunction(me, "default_time_mt_p", "DEFAULT-TIME-MT-P", 1, 0, false);
        declareFunction(me, "time_point_mt_time_parameter_p", "TIME-POINT-MT-TIME-PARAMETER-P", 1, 0, false);
        declareFunction(me, "mt_time_dim_naut_p", "MT-TIME-DIM-NAUT-P", 1, 0, false);
        declareFunction(me, "anytime_psc_p", "ANYTIME-PSC-P", 1, 0, false);
        declareFunction(me, "anytime_during_psc_fn_p", "ANYTIME-DURING-PSC-FN-P", 1, 0, false);
        declareFunction(me, "anytime_during_psc_fn_naut_p", "ANYTIME-DURING-PSC-FN-NAUT-P", 1, 0, false);
        declareFunction(me, "anytime_psc_hlmtP", "ANYTIME-PSC-HLMT?", 1, 0, false);
        declareFunction(me, "anytime_during_psc_hlmtP", "ANYTIME-DURING-PSC-HLMT?", 1, 0, false);
        declareFunction(me, "temporal_hlmt_p", "TEMPORAL-HLMT-P", 1, 0, false);
        declareFunction(me, "atemporal_hlmtP", "ATEMPORAL-HLMT?", 1, 0, false);
        declareFunction(me, "temporal_dimension_mt_p", "TEMPORAL-DIMENSION-MT-P", 1, 0, false);
        new hlmt.$temporal_dimension_mt_p$UnaryFunction();
        declareFunction(me, "time_dimension_p", "TIME-DIMENSION-P", 1, 0, false);
        declareFunction(me, "time_intervalP", "TIME-INTERVAL?", 1, 0, false);
        declareFunction(me, "temporal_objectP", "TEMPORAL-OBJECT?", 1, 0, false);
        declareFunction(me, "time_parameterP", "TIME-PARAMETER?", 1, 0, false);
        declareFunction(me, "time_mt_with_implicit_parameter_p", "TIME-MT-WITH-IMPLICIT-PARAMETER-P", 1, 0, false);
        declareFunction(me, "time_mt_with_explicit_parameter_p", "TIME-MT-WITH-EXPLICIT-PARAMETER-P", 1, 0, false);
        declareFunction(me, "time_mt_with_indeterminate_time_p", "TIME-MT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        declareFunction(me, "some_time_in_interval_naut_p", "SOME-TIME-IN-INTERVAL-NAUT-P", 1, 0, false);
        declareFunction(me, "indeterminate_time_interval_p", "INDETERMINATE-TIME-INTERVAL-P", 1, 0, false);
        declareFunction(me, "hlmt_with_indeterminate_time_p", "HLMT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        declareFunction(me, "hlmt_with_anytime_psc_p", "HLMT-WITH-ANYTIME-PSC-P", 1, 0, false);
        declareFunction(me, "equal_mt_times_p", "EQUAL-MT-TIMES-P", 2, 0, false);
        declareFunction(me, "temporal_object_equal", "TEMPORAL-OBJECT-EQUAL", 2, 0, false);
        declareFunction(me, "time_parameter_equal", "TIME-PARAMETER-EQUAL", 2, 0, false);
        declareFunction(me, "hlmt_times_equal_p", "HLMT-TIMES-EQUAL-P", 2, 0, false);
        declareFunction(me, "some_time_sentence_match_p", "SOME-TIME-SENTENCE-MATCH-P", 2, 0, false);
        declareFunction(me, "hlmt_temporal_mt", "HLMT-TEMPORAL-MT", 1, 0, false);
        declareFunction(me, "extract_hlmt_temporal_index", "EXTRACT-HLMT-TEMPORAL-INDEX", 1, 0, false);
        declareFunction(me, "extract_hlmt_temporal_index_or_default", "EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT", 1, 0, false);
        declareFunction(me, "extract_hlmt_time_parameter", "EXTRACT-HLMT-TIME-PARAMETER", 1, 0, false);
        declareMacro(me, "destructure_mt_time_dim_nat", "DESTRUCTURE-MT-TIME-DIM-NAT");
        declareFunction(me, "mt_time_dim_nat_temporal_values", "MT-TIME-DIM-NAT-TEMPORAL-VALUES", 1, 0, false);
        declareFunction(me, "explode_indeterminate_time_dim_nat", "EXPLODE-INDETERMINATE-TIME-DIM-NAT", 1, 0, false);
        declareFunction(me, "anytime_during_psc_fn_time_interval", "ANYTIME-DURING-PSC-FN-TIME-INTERVAL", 1, 0, false);
        declareFunction(me, "explode_hlmt_temporal_facets", "EXPLODE-HLMT-TEMPORAL-FACETS", 3, 0, false);
        declareFunction(me, "explode_hlmt_temporal_facets_with_defaults", "EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS", 1, 0, false);
        declareFunction(me, "explode_genlmt_temporal_facets_based_on_temporality", "EXPLODE-GENLMT-TEMPORAL-FACETS-BASED-ON-TEMPORALITY", 2, 0, false);
        declareMacro(me, "destructure_monad_and_temporal_facets", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS");
        declareMacro(me, "destructure_monad_and_temporal_facets_without_defaults", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS-WITHOUT-DEFAULTS");
        declareMacro(me, "destructure_temporal_mt_temporal_facets", "DESTRUCTURE-TEMPORAL-MT-TEMPORAL-FACETS");
        declareMacro(me, "destructure_atemporal_genlmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-GENLMT-TEMPORAL-FACETS");
        declareMacro(me, "destructure_atemporal_specmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-SPECMT-TEMPORAL-FACETS");
        declareFunction(me, "new_time_dimension", "NEW-TIME-DIMENSION", 1, 1, false);
        declareFunction(me, "new_temporal_hlmt", "NEW-TEMPORAL-HLMT", 3, 0, false);
        declareFunction(me, "new_canonicalized_temporal_hlmt", "NEW-CANONICALIZED-TEMPORAL-HLMT", 2, 0, false);
        declareFunction(me, "new_default_granularity_hlmt", "NEW-DEFAULT-GRANULARITY-HLMT", 2, 0, false);
        declareFunction(me, "default_time_mt", "DEFAULT-TIME-MT", 0, 0, false);
        declareFunction(me, "new_temporal_object_default_parameter_mt", "NEW-TEMPORAL-OBJECT-DEFAULT-PARAMETER-MT", 1, 0, false);
        declareFunction(me, "possibly_augment_time_mt", "POSSIBLY-AUGMENT-TIME-MT", 1, 0, false);
        declareFunction(me, "possibly_reduce_time_mt", "POSSIBLY-REDUCE-TIME-MT", 1, 0, false);
        declareFunction(me, "add_default_parameter_to_time_nat", "ADD-DEFAULT-PARAMETER-TO-TIME-NAT", 1, 0, false);
        declareFunction(me, "valid_temporal_mt_slice_p", "VALID-TEMPORAL-MT-SLICE-P", 1, 0, false);
        declareFunction(me, "valid_temporal_object_p", "VALID-TEMPORAL-OBJECT-P", 1, 0, false);
        declareFunction(me, "valid_time_parameter_p", "VALID-TIME-PARAMETER-P", 1, 0, false);
        declareFunction(me, "valid_mt_time_with_granularity_dim_arglistP", "VALID-MT-TIME-WITH-GRANULARITY-DIM-ARGLIST?", 1, 0, false);
        declareFunction(me, "valid_mt_time_dim_arglistP", "VALID-MT-TIME-DIM-ARGLIST?", 1, 0, false);
        declareFunction(me, "relevant_mt_with_inference_relevance", "RELEVANT-MT-WITH-INFERENCE-RELEVANCE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_hlmt_file() {
        defvar("*HLMTS-SUPPORTED?*", T);
        deflexical("*DEFAULT-MONAD-MT*", $$UniversalVocabularyMt);
        deflexical("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*", $$Null_TimeParameter);
        deflexical("*DEFAULT-ATEMPORAL-TIME-PARAMETER*", $$Null_TimeParameter);
        deflexical("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*", $$TimePoint);
        deflexical("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*", $$Null_TimeParameter);
        deflexical("*DEFAULT-MT-TIME-INTERVAL*", $$Always_TimeInterval);
        deflexical("*DEFAULT-MT-TIME-PARAMETER*", $$Null_TimeParameter);
        deflexical("*MT-SPACE-FUNCTION*", $$MtSpace);
        deflexical("*TEMPORAL-DIMENSION-FUNCTIONS*", $list7);
        deflexical("*MT-DIMENSION-TYPES*", $list8);
        deflexical("*MT-DIMENSION-FUNCTIONS*", $list9);
        deflexical("*CONTEXT-SPACE-FUNCTIONS*", cons($mt_space_function$.getGlobalValue(), $mt_dimension_functions$.getGlobalValue()));
        deflexical("*ANYTIME-PSC*", $$AnytimePSC);
        deflexical("*ANYTIME-DURING-PSC-FN*", $$AnytimeDuringPSCFn);
        deflexical("*UNINDEXED-HLMT-SYNTAX-CONSTANTS*", $list12);
        deflexical("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*", NIL);
        deflexical("*TEMPORAL-DIMENSION-PREDICATES*", $list61);
        return NIL;
    }

    public static SubLObject setup_hlmt_file() {
        register_external_symbol(UNION_MT_RELEVANCE_CONTEXTS);
        register_macro_helper(MT_DIMENSION_OF_ARG, DO_MT_DIMENSIONS);
        memoization_state.note_globally_cached_function(REDUCE_MT_UNION_HLMT_INT);
        sunit_external.define_test_category($$$HLMT_Tests, UNPROVIDED);
        sunit_external.define_test_suite($$$HLMT_Test_Suite, $list87, UNPROVIDED, UNPROVIDED);
        return NIL;
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

    

    public static final class $closed_hlmt_p$UnaryFunction extends UnaryFunction {
        public $closed_hlmt_p$UnaryFunction() {
            super(extractFunctionNamed("CLOSED-HLMT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return closed_hlmt_p(arg1);
        }
    }

    public static final class $hlmtP$UnaryFunction extends UnaryFunction {
        public $hlmtP$UnaryFunction() {
            super(extractFunctionNamed("HLMT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hlmtP(arg1);
        }
    }

    public static final class $hlmt_equal$BinaryFunction extends BinaryFunction {
        public $hlmt_equal$BinaryFunction() {
            super(extractFunctionNamed("HLMT-EQUAL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return hlmt_equal(arg1, arg2);
        }
    }

    public static final class $mt_union_mts_recursive_int$UnaryFunction extends UnaryFunction {
        public $mt_union_mts_recursive_int$UnaryFunction() {
            super(extractFunctionNamed("MT-UNION-MTS-RECURSIVE-INT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return mt_union_mts_recursive_int(arg1);
        }
    }

    public static final class $single_dimension_mt_dimension$UnaryFunction extends UnaryFunction {
        public $single_dimension_mt_dimension$UnaryFunction() {
            super(extractFunctionNamed("SINGLE-DIMENSION-MT-DIMENSION"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return single_dimension_mt_dimension(arg1);
        }
    }

    public static final class $monad_mt_p$UnaryFunction extends UnaryFunction {
        public $monad_mt_p$UnaryFunction() {
            super(extractFunctionNamed("MONAD-MT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return monad_mt_p(arg1);
        }
    }

    public static final class $monad_cycl_mtP$UnaryFunction extends UnaryFunction {
        public $monad_cycl_mtP$UnaryFunction() {
            super(extractFunctionNamed("MONAD-CYCL-MT?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return monad_cycl_mtP(arg1);
        }
    }

    public static final class $temporal_dimension_mt_p$UnaryFunction extends UnaryFunction {
        public $temporal_dimension_mt_p$UnaryFunction() {
            super(extractFunctionNamed("TEMPORAL-DIMENSION-MT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return temporal_dimension_mt_p(arg1);
        }
    }
}

/**
 * Total time: 511 ms
 */
