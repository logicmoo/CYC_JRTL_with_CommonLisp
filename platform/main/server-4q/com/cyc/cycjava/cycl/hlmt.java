/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.genl_mts.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.kb_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hlmt extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_replace_hlmt_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_replace_hlmt_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_mt_union_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_mt_union_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_combine_hlmts_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_combine_hlmts_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject replace_hlmt_p(SubLObject replace_hlmt) {
        return classes.subloop_instanceof_class(replace_hlmt, REPLACE_HLMT);
    }

    public static final SubLObject mt_union_p(SubLObject mt_union) {
        return classes.subloop_instanceof_class(mt_union, MT_UNION);
    }

    public static final SubLObject combine_hlmts_p(SubLObject combine_hlmts) {
        return classes.subloop_instanceof_class(combine_hlmts, COMBINE_HLMTS);
    }

    public static final SubLFile me = new hlmt();

 public static final String myName = "com.cyc.cycjava.cycl.hlmt";


    // defvar
    // Definitions
    @LispMethod(comment = "Whether we allow non-atomic unreified mts.\ndefvar")
    public static final SubLSymbol $hlmts_supportedP$ = makeSymbol("*HLMTS-SUPPORTED?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_monad_mt$ = makeSymbol("*DEFAULT-MONAD-MT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_temporal_mt_time_parameter$ = makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_atemporal_time_parameter$ = makeSymbol("*DEFAULT-ATEMPORAL-TIME-PARAMETER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_atemporal_genlmt_time_parameter$ = makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_atemporal_specmt_time_parameter$ = makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_mt_time_interval$ = makeSymbol("*DEFAULT-MT-TIME-INTERVAL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $default_mt_time_parameter$ = makeSymbol("*DEFAULT-MT-TIME-PARAMETER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $mt_space_function$ = makeSymbol("*MT-SPACE-FUNCTION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $temporal_dimension_functions$ = makeSymbol("*TEMPORAL-DIMENSION-FUNCTIONS*");

    // deflexical
    /**
     * The identifiers used to specify different types of slices of mt space. This
     * is an ordered list, and describes the canonical ordering of dimensions
     */
    @LispMethod(comment = "The identifiers used to specify different types of slices of mt space. This\r\nis an ordered list, and describes the canonical ordering of dimensions\ndeflexical\nThe identifiers used to specify different types of slices of mt space. This\nis an ordered list, and describes the canonical ordering of dimensions")
    private static final SubLSymbol $mt_dimension_types$ = makeSymbol("*MT-DIMENSION-TYPES*");

    // deflexical
    // The functions which carve out slices of mt space.
    /**
     * The functions which carve out slices of mt space.
     */
    @LispMethod(comment = "The functions which carve out slices of mt space.\ndeflexical")
    private static final SubLSymbol $mt_dimension_functions$ = makeSymbol("*MT-DIMENSION-FUNCTIONS*");

    // deflexical
    // The functions which are valid arg0s for a HLMT.
    /**
     * The functions which are valid arg0s for a HLMT.
     */
    @LispMethod(comment = "The functions which are valid arg0s for a HLMT.\ndeflexical")
    private static final SubLSymbol $context_space_functions$ = makeSymbol("*CONTEXT-SPACE-FUNCTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $anytime_psc$ = makeSymbol("*ANYTIME-PSC*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $anytime_during_psc_fn$ = makeSymbol("*ANYTIME-DURING-PSC-FN*");

    // deflexical
    /**
     * Constants which are part of HLMT syntax and which therefore are not fully
     * indexed, for pragmatic reasons.
     */
    @LispMethod(comment = "Constants which are part of HLMT syntax and which therefore are not fully\r\nindexed, for pragmatic reasons.\ndeflexical\nConstants which are part of HLMT syntax and which therefore are not fully\nindexed, for pragmatic reasons.")
    private static final SubLSymbol $unindexed_hlmt_syntax_constants$ = makeSymbol("*UNINDEXED-HLMT-SYNTAX-CONSTANTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $temporal_dimension_predicates$ = makeSymbol("*TEMPORAL-DIMENSION-PREDICATES*");

    static private final SubLList $list1 = list(list(makeSymbol("*HLMTS-SUPPORTED?*"), T));



    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");



    private static final SubLObject $$Always_TimeInterval = reader_make_constant_shell("Always-TimeInterval");



    static private final SubLList $list7 = list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), reader_make_constant_shell("MtTimeDimFn"));

    static private final SubLList $list8 = list(makeKeyword("MONAD"), $TIME);

    static private final SubLList $list9 = list(reader_make_constant_shell("MtDim"), reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("MtTimeWithGranularityDimFn"));





    static private final SubLList $list12 = list(new SubLObject[]{ reader_make_constant_shell("MtSpace"), reader_make_constant_shell("MtDim"), reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("MtTimeWithGranularityDimFn"), reader_make_constant_shell("mtTimeIndex"), reader_make_constant_shell("mtTimeParameter"), reader_make_constant_shell("mtMonad"), reader_make_constant_shell("Always-TimeInterval"), reader_make_constant_shell("Null-TimeParameter"), reader_make_constant_shell("TimePoint") });







    private static final SubLSymbol MT_UNION_MTS_RECURSIVE_INT = makeSymbol("MT-UNION-MTS-RECURSIVE-INT");

    private static final SubLSymbol UNION_MT_RELEVANCE_CONTEXTS = makeSymbol("UNION-MT-RELEVANCE-CONTEXTS");





    static private final SubLSymbol $sym21$ANYTIME_PSC_HLMT_ = makeSymbol("ANYTIME-PSC-HLMT?");

    private static final SubLSymbol HLMT_MONAD_MT = makeSymbol("HLMT-MONAD-MT");



    static private final SubLList $list24 = list(list(makeSymbol("DIM-VAR"), makeSymbol("VAL-VAR"), makeSymbol("HLMT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list25 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym28$ARGS = makeUninternedSymbol("ARGS");

    static private final SubLSymbol $sym29$ARG = makeUninternedSymbol("ARG");

    private static final SubLSymbol MONAD_MT_P = makeSymbol("MONAD-MT-P");

    static private final SubLList $list33 = list(makeKeyword("MONAD"));

    private static final SubLSymbol MT_DIM_NAUT_P = makeSymbol("MT-DIM-NAUT-P");

    private static final SubLSymbol MT_DIM_NAT_DIMENSION = makeSymbol("MT-DIM-NAT-DIMENSION");

    private static final SubLSymbol MT_SPACE_NAUT_P = makeSymbol("MT-SPACE-NAUT-P");

    private static final SubLSymbol NAUT_ARGS = makeSymbol("NAUT-ARGS");

    private static final SubLSymbol MT_DIMENSION_OF_ARG = makeSymbol("MT-DIMENSION-OF-ARG");

    private static final SubLSymbol ANYTIME_PSC_P = makeSymbol("ANYTIME-PSC-P");

    private static final SubLSymbol ANYTIME_DURING_PSC_FN_NAUT_P = makeSymbol("ANYTIME-DURING-PSC-FN-NAUT-P");

    static private final SubLList $list43 = list($TIME);

    private static final SubLSymbol CLOSED_POSSIBLY_HLMT_P = makeSymbol("CLOSED-POSSIBLY-HLMT-P");

    static private final SubLList $list45 = list(makeKeyword("UNKNOWN"));

    private static final SubLSymbol DO_MT_DIMENSIONS = makeSymbol("DO-MT-DIMENSIONS");









    private static final SubLSymbol HLMT_DIMENSIONS = makeSymbol("HLMT-DIMENSIONS");

    private static final SubLSymbol $sym55$INTERESTING_HLMT_ = makeSymbol("INTERESTING-HLMT?");

    private static final SubLSymbol REDUCE_MT_UNION_HLMT_INT = makeSymbol("REDUCE-MT-UNION-HLMT-INT");

    private static final SubLSymbol $reduce_mt_union_hlmt_int_caching_state$ = makeSymbol("*REDUCE-MT-UNION-HLMT-INT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_REDUCE_MT_UNION_HLMT_INT = makeSymbol("CLEAR-REDUCE-MT-UNION-HLMT-INT");

    static private final SubLSymbol $sym59$MONAD_MT_ = makeSymbol("MONAD-MT?");



    static private final SubLList $list61 = list(reader_make_constant_shell("mtTimeIndex"), reader_make_constant_shell("mtTimeParameter"));









    private static final SubLSymbol INDETERMINATE_TIME_INTERVAL_P = makeSymbol("INDETERMINATE-TIME-INTERVAL-P");

    static private final SubLString $str67$Continue_Anyway_ = makeString("Continue Anyway.");

    static private final SubLString $str68$We_should_never_test_two_some_tim = makeString("We should never test two some time conjuncts.");

    static private final SubLList $list69 = list(list(makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol MT_TIME_DIM_NAT_TEMPORAL_VALUES = makeSymbol("MT-TIME-DIM-NAT-TEMPORAL-VALUES");

    static private final SubLString $str72$DIM_NAT__a_is_not_a_microtheory_t = makeString("DIM-NAT ~a is not a microtheory time dimension NAT");

    static private final SubLList $list74 = list(list(makeSymbol("MONAD-MT"), makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS = makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS");

    private static final SubLSymbol HLMT_MONAD_MT_WITHOUT_DEFAULT = makeSymbol("HLMT-MONAD-MT-WITHOUT-DEFAULT");

    private static final SubLSymbol EXPLODE_HLMT_TEMPORAL_FACETS = makeSymbol("EXPLODE-HLMT-TEMPORAL-FACETS");

    static private final SubLList $list78 = list(NIL, NIL);

    static private final SubLList $list79 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"), makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*"));

    static private final SubLList $list82 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"));

    static private final SubLList $list83 = list(makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*"));

    static private final SubLList $list84 = list(makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*"));

    static private final SubLString $$$HLMT_Tests = makeString("HLMT Tests");

    private static final SubLString $$$HLMT_Test_Suite = makeString("HLMT Test Suite");

    private static final SubLList $list87 = list(makeString("HLMT Tests"));

    /**
     * Whether we allow non-atomic unreified mts.
     */
    @LispMethod(comment = "Whether we allow non-atomic unreified mts.")
    public static final SubLObject hlmts_supportedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $hlmts_supportedP$.getDynamicValue(thread);
        }
    }

    /**
     * Whether we allow non-atomic unreified mts.
     */
    @LispMethod(comment = "Whether we allow non-atomic unreified mts.")
    public static SubLObject hlmts_supportedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $hlmts_supportedP$.getDynamicValue(thread);
    }

    public static final SubLObject with_hlmts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    public static SubLObject with_hlmts(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static final SubLObject enable_hlmts_alt() {
        $hlmts_supportedP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject enable_hlmts() {
        $hlmts_supportedP$.setDynamicValue(T);
        return NIL;
    }

    public static final SubLObject disable_hlmts_alt() {
        $hlmts_supportedP$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject disable_hlmts() {
        $hlmts_supportedP$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject unindexed_hlmt_syntax_constants_alt() {
        return $unindexed_hlmt_syntax_constants$.getGlobalValue();
    }

    public static SubLObject unindexed_hlmt_syntax_constants() {
        return $unindexed_hlmt_syntax_constants$.getGlobalValue();
    }

    public static final SubLObject unindexed_hlmt_syntax_constant_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $unindexed_hlmt_syntax_constants$.getGlobalValue());
    }

    public static SubLObject unindexed_hlmt_syntax_constant_p(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, $unindexed_hlmt_syntax_constants$.getGlobalValue());
    }

    /**
     * Return T iff OBJECT is the type which will be indexed in the other index,
     * if necessary, when it appears in a HLMT that is the mt of an assertion.
     */
    @LispMethod(comment = "Return T iff OBJECT is the type which will be indexed in the other index,\r\nif necessary, when it appears in a HLMT that is the mt of an assertion.\nReturn T iff OBJECT is the type which will be indexed in the other index,\nif necessary, when it appears in a HLMT that is the mt of an assertion.")
    public static final SubLObject fully_indexed_hlmt_term_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != fully_indexed_term_p(v_object)) && (NIL == com.cyc.cycjava.cycl.hlmt.unindexed_hlmt_syntax_constant_p(v_object)));
    }

    /**
     * Return T iff OBJECT is the type which will be indexed in the other index,
     * if necessary, when it appears in a HLMT that is the mt of an assertion.
     */
    @LispMethod(comment = "Return T iff OBJECT is the type which will be indexed in the other index,\r\nif necessary, when it appears in a HLMT that is the mt of an assertion.\nReturn T iff OBJECT is the type which will be indexed in the other index,\nif necessary, when it appears in a HLMT that is the mt of an assertion.")
    public static SubLObject fully_indexed_hlmt_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != fully_indexed_term_p(v_object)) && (NIL == unindexed_hlmt_syntax_constant_p(v_object)));
    }

    public static final SubLObject mt_space_function_p_alt(SubLObject v_object) {
        return eq(v_object, $mt_space_function$.getGlobalValue());
    }

    public static SubLObject mt_space_function_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $mt_space_function$.getGlobalValue());
    }

    public static final SubLObject possibly_mt_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.hlmt.possibly_hlmt_p(v_object);
    }

    public static SubLObject possibly_mt_p(final SubLObject v_object) {
        return possibly_hlmt_p(v_object);
    }

    public static final SubLObject possibly_hlmt_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != possibly_fo_naut_p(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_p(v_object)));
    }

    public static SubLObject possibly_hlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_fo_naut_p(v_object)) || (NIL != hlmt_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is a fort-p or closed-hlmt-p.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is a fort-p or closed-hlmt-p.")
    public static final SubLObject fort_or_chlmt_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.closed_hlmt_p(v_object)));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is a fort-p or closed-hlmt-p.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is a fort-p or closed-hlmt-p.")
    public static SubLObject fort_or_chlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) || (NIL != closed_hlmt_p(v_object)));
    }

    /**
     * Shorthand for @xref closed-hlmt-p.
     */
    @LispMethod(comment = "Shorthand for @xref closed-hlmt-p.")
    public static final SubLObject chlmt_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.hlmt.closed_hlmt_p(v_object);
    }

    /**
     * Shorthand for @xref closed-hlmt-p.
     */
    @LispMethod(comment = "Shorthand for @xref closed-hlmt-p.")
    public static SubLObject chlmt_p(final SubLObject v_object) {
        return closed_hlmt_p(v_object);
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an HLMT, and is closed
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an HLMT, and is closed")
    public static final SubLObject closed_hlmt_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.hlmt_p(v_object)) && (NIL != variables.cycl_ground_expression_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is an HLMT, and is closed
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is an HLMT, and is closed")
    public static SubLObject closed_hlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt_p(v_object)) && (NIL != variables.cycl_ground_expression_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT can possibly be an HLMT, and is closed
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT can possibly be an HLMT, and is closed")
    public static final SubLObject closed_possibly_hlmt_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.possibly_hlmt_p(v_object)) && (NIL != variables.cycl_ground_expression_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT can possibly be an HLMT, and is closed
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT can possibly be an HLMT, and is closed")
    public static SubLObject closed_possibly_hlmt_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_hlmt_p(v_object)) && (NIL != variables.cycl_ground_expression_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT might be an HLMT,
    that is, an HL representation of a microtheory.
    Hence it must be closed.
     * @unknown hlmt? returns true iff OBJECT actually is an HLMT
     */
    @LispMethod(comment = "@return boolean; t if OBJECT might be an HLMT,\r\nthat is, an HL representation of a microtheory.\r\nHence it must be closed.\r\n@unknown hlmt? returns true iff OBJECT actually is an HLMT")
    public static final SubLObject hlmt_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $hlmts_supportedP$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt.hlmt_p_time(v_object))) : com.cyc.cycjava.cycl.hlmt.hlmt_p_no_time(v_object);
        }
    }

    /**
     *
     *
     * @return boolean; t if OBJECT might be an HLMT,
    that is, an HL representation of a microtheory.
    Hence it must be closed.
     * @unknown hlmt? returns true iff OBJECT actually is an HLMT
     */
    @LispMethod(comment = "@return boolean; t if OBJECT might be an HLMT,\r\nthat is, an HL representation of a microtheory.\r\nHence it must be closed.\r\n@unknown hlmt? returns true iff OBJECT actually is an HLMT")
    public static SubLObject hlmt_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $hlmts_supportedP$.getDynamicValue(thread) ? hlmt_p_time(v_object) : hlmt_p_no_time(v_object);
    }

    public static final SubLObject hlmt_p_no_time_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(v_object)));
    }

    public static SubLObject hlmt_p_no_time(final SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) || (NIL != mt_union_naut_p(v_object)));
    }

    public static final SubLObject hlmt_p_time_alt(SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_naut_p(v_object)));
    }

    public static SubLObject hlmt_p_time(final SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) || (NIL != hlmt_naut_p(v_object)));
    }

    public static final SubLObject possibly_hlmt_naut_p_alt(SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            {
                SubLObject functor = cycl_utilities.naut_functor(v_object);
                return makeBoolean(((NIL != com.cyc.cycjava.cycl.hlmt.context_space_function_p(functor)) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_function_p(functor))) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_p(functor)));
            }
        } else {
            return NIL;
        }
    }

    public static SubLObject possibly_hlmt_naut_p(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            return makeBoolean(((NIL != context_space_function_p(functor)) || (NIL != mt_union_function_p(functor))) || (NIL != anytime_during_psc_fn_p(functor)));
        }
        return NIL;
    }

    public static final SubLObject hlmt_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.possibly_hlmt_naut_p(v_object)) && ((((NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_object))) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(v_object))) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_object))));
    }

    public static SubLObject hlmt_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_hlmt_naut_p(v_object)) && ((((NIL != mt_space_naut_p(v_object)) || (NIL != mt_dim_naut_p(v_object))) || (NIL != mt_union_naut_p(v_object))) || (NIL != anytime_during_psc_fn_naut_p(v_object))));
    }

    public static final SubLObject mt_space_naut_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_arglist_p(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static SubLObject mt_space_naut_p(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != mt_space_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != mt_space_naut_arglist_p(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static final SubLObject mt_space_naut_arglist_p_alt(SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != com.cyc.cycjava.cycl.hlmt.hlmt_p(args.first())) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_arglist_p(args.rest()))));
    }

    public static SubLObject mt_space_naut_arglist_p(final SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != hlmt_p(args.first())) && (NIL != mt_space_naut_arglist_p(args.rest()))));
    }

    public static final SubLObject mt_dim_naut_p_alt(SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            {
                SubLObject functor = cycl_utilities.naut_functor(v_object);
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dimension_function_p(functor)) {
                    return T;
                }
            }
        }
        return NIL;
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

    public static final SubLObject mt_union_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_function_p(cycl_utilities.naut_functor(v_object))));
    }

    public static SubLObject mt_union_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != mt_union_function_p(cycl_utilities.naut_functor(v_object))));
    }

    public static final SubLObject mt_union_function_p_alt(SubLObject v_object) {
        return eq(v_object, $$MtUnionFn);
    }

    public static SubLObject mt_union_function_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $$MtUnionFn);
    }

    /**
     * Like @xref hlmt-p but also does fort-types checks that the relevant bits
     * have fort-types of microtheories, and arity checks on all the dimensions.
     */
    @LispMethod(comment = "Like @xref hlmt-p but also does fort-types checks that the relevant bits\r\nhave fort-types of microtheories, and arity checks on all the dimensions.\nLike @xref hlmt-p but also does fort-types checks that the relevant bits\nhave fort-types of microtheories, and arity checks on all the dimensions.")
    public static final SubLObject hlmtP_alt(SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_represented_term_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmtP_int(v_object)));
    }

    /**
     * Like @xref hlmt-p but also does fort-types checks that the relevant bits
     * have fort-types of microtheories, and arity checks on all the dimensions.
     */
    @LispMethod(comment = "Like @xref hlmt-p but also does fort-types checks that the relevant bits\r\nhave fort-types of microtheories, and arity checks on all the dimensions.\nLike @xref hlmt-p but also does fort-types checks that the relevant bits\nhave fort-types of microtheories, and arity checks on all the dimensions.")
    public static SubLObject hlmtP(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_grammar.cycl_represented_term_p(v_object)) && (NIL != hlmtP_int(v_object)));
    }

    public static final SubLObject hlmtP_int_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $hlmts_supportedP$.getDynamicValue(thread) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt.hlmtP_time(v_object))) : com.cyc.cycjava.cycl.hlmt.hlmtP_no_time(v_object);
        }
    }

    public static SubLObject hlmtP_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $hlmts_supportedP$.getDynamicValue(thread) ? hlmtP_time(v_object) : hlmtP_no_time(v_object);
    }

    public static final SubLObject hlmtP_no_time_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.hlmt_p(v_object)) && ((NIL != com.cyc.cycjava.cycl.hlmt.monad_mtP(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_nautP(v_object))));
    }

    public static SubLObject hlmtP_no_time(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt_p(v_object)) && ((NIL != monad_mtP(v_object)) || (NIL != mt_union_nautP(v_object))));
    }

    public static final SubLObject hlmtP_time_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.hlmt_p(v_object)) && ((NIL != com.cyc.cycjava.cycl.hlmt.monad_mtP(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_nautP(v_object))));
    }

    public static SubLObject hlmtP_time(final SubLObject v_object) {
        return makeBoolean((NIL != hlmt_p(v_object)) && ((NIL != monad_mtP(v_object)) || (NIL != hlmt_nautP(v_object))));
    }

    public static final SubLObject hlmt_nautP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.hlmt.mt_space_mtP(v_object)) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_mtP(v_object))) || (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_nautP(v_object)));
    }

    public static SubLObject hlmt_nautP(final SubLObject v_object) {
        return makeBoolean(((NIL != mt_space_mtP(v_object)) || (NIL != mt_dim_mtP(v_object))) || (NIL != mt_union_nautP(v_object)));
    }

    public static final SubLObject mt_space_mtP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_arglistP(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static SubLObject mt_space_mtP(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != mt_space_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != mt_space_arglistP(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static final SubLObject mt_space_arglistP_alt(SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != com.cyc.cycjava.cycl.hlmt.hlmtP_int(args.first())) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_arglistP(args.rest()))));
    }

    public static SubLObject mt_space_arglistP(final SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != hlmtP_int(args.first())) && (NIL != mt_space_arglistP(args.rest()))));
    }

    public static final SubLObject mt_dim_mtP_alt(SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            {
                SubLObject functor = cycl_utilities.naut_functor(v_object);
                return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.mt_dimension_function_p(functor)) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_arglistP(functor, cycl_utilities.naut_args(v_object, UNPROVIDED))));
            }
        }
        return NIL;
    }

    public static SubLObject mt_dim_mtP(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            final SubLObject functor = cycl_utilities.naut_functor(v_object);
            return makeBoolean((NIL != mt_dimension_function_p(functor)) && (NIL != mt_dim_arglistP(functor, cycl_utilities.naut_args(v_object, UNPROVIDED))));
        }
        return NIL;
    }

    public static final SubLObject mt_dim_arglistP_alt(SubLObject functor, SubLObject args) {
        {
            SubLObject pcase_var = functor;
            if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
                return com.cyc.cycjava.cycl.hlmt.valid_mt_time_with_granularity_dim_arglistP(args);
            } else {
                if (pcase_var.eql($$MtTimeDimFn)) {
                    return com.cyc.cycjava.cycl.hlmt.valid_mt_time_dim_arglistP(args);
                } else {
                    return list_utilities.lengthE(args, arity.arity(functor), UNPROVIDED);
                }
            }
        }
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

    public static final SubLObject mt_union_nautP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_arglistP(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static SubLObject mt_union_nautP(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_naut_p(v_object)) && (NIL != mt_union_function_p(cycl_utilities.naut_functor(v_object)))) && (NIL != mt_union_arglistP(cycl_utilities.naut_args(v_object, UNPROVIDED))));
    }

    public static final SubLObject mt_union_arglistP_alt(SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != com.cyc.cycjava.cycl.hlmt.hlmtP_int(args.first())) && (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_arglistP(args.rest()))));
    }

    public static SubLObject mt_union_arglistP(final SubLObject args) {
        return makeBoolean((NIL == args) || ((NIL != hlmtP_int(args.first())) && (NIL != mt_union_arglistP(args.rest()))));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT0 is equal to OBJECT1.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT0 is equal to OBJECT1.")
    public static final SubLObject hlmt_equal_alt(SubLObject object0, SubLObject object1) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $hlmts_supportedP$.getDynamicValue(thread)) {
                return equal(object0, object1);
            } else {
                return eq(object0, object1);
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT0 is equal to OBJECT1.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT0 is equal to OBJECT1.")
    public static SubLObject hlmt_equal(final SubLObject object0, final SubLObject object1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $hlmts_supportedP$.getDynamicValue(thread)) {
            return equal(object0, object1);
        }
        return kb_utilities.kbeq(object0, object1);
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT0 is equal to OBJECT1 insofar as all of their dimensions are equal.  What constitutes equality for a given dimension is dependent on that dimension.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT0 is equal to OBJECT1 insofar as all of their dimensions are equal.  What constitutes equality for a given dimension is dependent on that dimension.")
    public static final SubLObject hlmt_equalP_alt(SubLObject object0, SubLObject object1) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(object0, object1)) {
            return T;
        }
        if ((NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(object0)) && (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(object1))) {
            return NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.equal_mt_monads_p(object0, object1)) && (NIL != com.cyc.cycjava.cycl.hlmt.equal_mt_times_p(object0, object1)));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT0 is equal to OBJECT1 insofar as all of their dimensions are equal.  What constitutes equality for a given dimension is dependent on that dimension.
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT0 is equal to OBJECT1 insofar as all of their dimensions are equal.  What constitutes equality for a given dimension is dependent on that dimension.")
    public static SubLObject hlmt_equalP(final SubLObject object0, final SubLObject object1) {
        if (NIL != hlmt_equal(object0, object1)) {
            return T;
        }
        if ((NIL != monad_mt_p(object0)) && (NIL != monad_mt_p(object1))) {
            return NIL;
        }
        return makeBoolean((NIL != equal_mt_monads_p(object0, object1)) && (NIL != equal_mt_times_p(object0, object1)));
    }

    /**
     *
     *
     * @return hlmt-p;  Returns a new hlmt made from MT-DIMENSIONS.
     */
    @LispMethod(comment = "@return hlmt-p;  Returns a new hlmt made from MT-DIMENSIONS.")
    public static final SubLObject new_hlmt_alt(SubLObject mt_dimensions) {
        SubLTrampolineFile.checkType(mt_dimensions, LISTP);
        return cons($mt_space_function$.getGlobalValue(), mt_dimensions);
    }

    /**
     *
     *
     * @return hlmt-p;  Returns a new hlmt made from MT-DIMENSIONS.
     */
    @LispMethod(comment = "@return hlmt-p;  Returns a new hlmt made from MT-DIMENSIONS.")
    public static SubLObject new_hlmt(final SubLObject mt_dimensions) {
        assert NIL != listp(mt_dimensions) : "! listp(mt_dimensions) " + ("Types.listp(mt_dimensions) " + "CommonSymbols.NIL != Types.listp(mt_dimensions) ") + mt_dimensions;
        return cons($mt_space_function$.getGlobalValue(), mt_dimensions);
    }

    /**
     *
     *
     * @return hlmt-p;  Returns a possibly new hlmt, made by copying the parts of HLMT into a new location.
     */
    @LispMethod(comment = "@return hlmt-p;  Returns a possibly new hlmt, made by copying the parts of HLMT into a new location.")
    public static final SubLObject copy_hlmt_alt(SubLObject v_hlmt) {
        return copy_tree(v_hlmt);
    }

    /**
     *
     *
     * @return hlmt-p;  Returns a possibly new hlmt, made by copying the parts of HLMT into a new location.
     */
    @LispMethod(comment = "@return hlmt-p;  Returns a possibly new hlmt, made by copying the parts of HLMT into a new location.")
    public static SubLObject copy_hlmt(final SubLObject v_hlmt) {
        return copy_tree(v_hlmt);
    }

    public static final SubLObject new_anytime_during_psc_naut_alt(SubLObject time_interval) {
        return make_unary_formula($anytime_during_psc_fn$.getGlobalValue(), time_interval);
    }

    public static SubLObject new_anytime_during_psc_naut(final SubLObject time_interval) {
        return make_unary_formula($anytime_during_psc_fn$.getGlobalValue(), time_interval);
    }

    public static final SubLObject anytime_psc_alt() {
        return $anytime_psc$.getGlobalValue();
    }

    public static SubLObject anytime_psc() {
        return $anytime_psc$.getGlobalValue();
    }

    public static final SubLObject mt_union_mts_alt(SubLObject mt_union_hlmt) {
        return cycl_utilities.naut_args(mt_union_hlmt, UNPROVIDED);
    }

    public static SubLObject mt_union_mts(final SubLObject mt_union_hlmt) {
        return cycl_utilities.naut_args(mt_union_hlmt, UNPROVIDED);
    }

    public static final SubLObject mt_union_mts_recursive_alt(SubLObject mt_union_naut) {
        return Mapping.mapcan(MT_UNION_MTS_RECURSIVE_INT, com.cyc.cycjava.cycl.hlmt.mt_union_mts(mt_union_naut), EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static SubLObject mt_union_mts_recursive(final SubLObject mt_union_naut) {
        return Mapping.mapcan(MT_UNION_MTS_RECURSIVE_INT, mt_union_mts(mt_union_naut), EMPTY_SUBL_OBJECT_ARRAY);
    }

    public static final SubLObject mt_union_mts_recursive_int_alt(SubLObject v_object) {
        return NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(v_object) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt.mt_union_mts_recursive(v_object))) : list(v_object);
    }

    public static SubLObject mt_union_mts_recursive_int(final SubLObject v_object) {
        return NIL != mt_union_naut_p(v_object) ? mt_union_mts_recursive(v_object) : list(v_object);
    }

    public static final SubLObject union_mt_relevance_contexts_alt(SubLObject mt_relevance_contexts) {
        if (NIL != list_utilities.member_eqP($$EverythingPSC, mt_relevance_contexts)) {
            return $$EverythingPSC;
        } else {
            if (NIL != list_utilities.member_eqP($$InferencePSC, mt_relevance_contexts)) {
                return $$InferencePSC;
            } else {
                if (NIL != find_if($sym21$ANYTIME_PSC_HLMT_, mt_relevance_contexts, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return com.cyc.cycjava.cycl.hlmt.new_temporal_hlmt(cons($$MtUnionFn, Mapping.mapcar(HLMT_MONAD_MT, mt_relevance_contexts)), com.cyc.cycjava.cycl.hlmt.anytime_psc(), NIL);
                } else {
                    return cons($$MtUnionFn, mt_relevance_contexts);
                }
            }
        }
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

    public static final SubLObject mt_dimension_type_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $mt_dimension_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mt_dimension_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $mt_dimension_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mt_dimension_types_alt() {
        return $mt_dimension_types$.getGlobalValue();
    }

    public static SubLObject mt_dimension_types() {
        return $mt_dimension_types$.getGlobalValue();
    }

    public static final SubLObject mt_dimension_function_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $mt_dimension_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mt_dimension_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $mt_dimension_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject context_space_function_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $context_space_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject context_space_function_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $context_space_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject mt_dimension_predicate_p_alt(SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$MicrotheoryDimensionPredicate, UNPROVIDED);
    }

    public static SubLObject mt_dimension_predicate_p(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$MicrotheoryDimensionPredicate, UNPROVIDED);
    }

    /**
     * Iterator. Binds DIM-VAR to the mt-dimension-type-p for VAL-VAR for each of MT's dimesions. Optionally stops iteration when DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterator. Binds DIM-VAR to the mt-dimension-type-p for VAL-VAR for each of MT\'s dimesions. Optionally stops iteration when DONE becomes non-nil.")
    public static final SubLObject do_mt_dimensions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dim_var = NIL;
                    SubLObject val_var = NIL;
                    SubLObject v_hlmt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    dim_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    val_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    v_hlmt = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt24);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt24);
                            if (NIL == member(current_1, $list_alt25, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt24);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject args = $sym28$ARGS;
                                SubLObject arg = $sym29$ARG;
                                return list(PCOND, list(list(MONAD_MT_P, v_hlmt), list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list_alt33), list(val_var, v_hlmt)), append(body, NIL)))), list(list(MT_DIM_NAUT_P, v_hlmt), list(PUNLESS, done, listS(CLET, list(list(dim_var, list(MT_DIM_NAT_DIMENSION, v_hlmt)), list(val_var, v_hlmt)), append(body, NIL)))), list(list(MT_SPACE_NAUT_P, v_hlmt), list(CLET, list(list(args, list(NAUT_ARGS, v_hlmt))), list(CSOME, list(arg, args, done), listS(CLET, list(list(dim_var, list(MT_DIMENSION_OF_ARG, arg)), list(val_var, arg)), append(body, NIL))))), list(list(COR, list(ANYTIME_PSC_P, v_hlmt), list(ANYTIME_DURING_PSC_FN_NAUT_P, v_hlmt)), list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list_alt43), list(val_var, v_hlmt)), append(body, NIL)))), list(list(CLOSED_POSSIBLY_HLMT_P, v_hlmt), list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list_alt33), list(val_var, v_hlmt)), append(body, NIL)))), list(T, list(PUNLESS, done, listS(CLET, list(bq_cons(dim_var, $list_alt45), list(val_var, v_hlmt)), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterator. Binds DIM-VAR to the mt-dimension-type-p for VAL-VAR for each of MT's dimesions. Optionally stops iteration when DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterator. Binds DIM-VAR to the mt-dimension-type-p for VAL-VAR for each of MT\'s dimesions. Optionally stops iteration when DONE becomes non-nil.")
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

    public static final SubLObject mt_dimension_of_arg_alt(SubLObject arg) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(arg)) {
            return $MONAD;
        } else {
            if (NIL != com.cyc.cycjava.cycl.hlmt.temporal_dimension_mt_p(arg)) {
                return $TIME;
            } else {
                return $UNKNOWN;
            }
        }
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

    /**
     *
     *
     * @return mt-dimension-type-p; Returns the dimension of the single fixed dimension microtheory SFD-MT.
     */
    @LispMethod(comment = "@return mt-dimension-type-p; Returns the dimension of the single fixed dimension microtheory SFD-MT.")
    public static final SubLObject single_dimension_mt_dimension_alt(SubLObject sfd_mt) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(sfd_mt)) {
            return $MONAD;
        } else {
            if (NIL != possibly_naut_p(sfd_mt)) {
                return com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(sfd_mt);
            } else {
                return $UNKNOWN;
            }
        }
    }

    /**
     *
     *
     * @return mt-dimension-type-p; Returns the dimension of the single fixed dimension microtheory SFD-MT.
     */
    @LispMethod(comment = "@return mt-dimension-type-p; Returns the dimension of the single fixed dimension microtheory SFD-MT.")
    public static SubLObject single_dimension_mt_dimension(final SubLObject sfd_mt) {
        if (NIL != monad_mt_p(sfd_mt)) {
            return $MONAD;
        }
        if (NIL != possibly_naut_p(sfd_mt)) {
            return mt_dim_nat_dimension(sfd_mt);
        }
        return $UNKNOWN;
    }

    /**
     *
     *
     * @return mt-dimension-type-p; Returns the dimension of MT-DIM-NAT.
     */
    @LispMethod(comment = "@return mt-dimension-type-p; Returns the dimension of MT-DIM-NAT.")
    public static final SubLObject mt_dim_nat_dimension_alt(SubLObject mt_dim_nat) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(mt_dim_nat)) {
            return $TIME;
        }
        {
            SubLObject functor = cycl_utilities.naut_functor(mt_dim_nat);
            SubLObject pcase_var = functor;
            if ((pcase_var.eql($$MtTimeWithGranularityDimFn) || pcase_var.eql($$MtTimeDimFn)) || pcase_var.eql($$AnytimeDuringPSCFn)) {
                return $TIME;
            } else {
                if (pcase_var.eql($$MtDim)) {
                    {
                        SubLObject pred = cycl_utilities.nat_arg1(mt_dim_nat, UNPROVIDED);
                        SubLObject pcase_var_2 = pred;
                        if (pcase_var_2.eql($$mtMonad)) {
                            return $MONAD;
                        } else {
                            if (pcase_var_2.eql($$mtTimeIndex) || pcase_var_2.eql($$mtTimeParameter)) {
                                return $TIME;
                            } else {
                                return NIL;
                            }
                        }
                    }
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return mt-dimension-type-p; Returns the dimension of MT-DIM-NAT.
     */
    @LispMethod(comment = "@return mt-dimension-type-p; Returns the dimension of MT-DIM-NAT.")
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

    /**
     *
     *
     * @return mt-p;  The dimension of HLMT specified by DIM.
     * @param DIM
    mt-dimension-type-p
     * 		
     * @param HLMT
    hlmt-p
     * 		
     */
    @LispMethod(comment = "@return mt-p;  The dimension of HLMT specified by DIM.\r\n@param DIM\nmt-dimension-type-p\r\n\t\t\r\n@param HLMT\nhlmt-p")
    public static final SubLObject get_hlmt_dimension_alt(SubLObject dim, SubLObject v_hlmt) {
        {
            SubLObject mt = NIL;
            SubLObject foundP = NIL;
            if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(v_hlmt)) {
                if (NIL == foundP) {
                    {
                        SubLObject dim_var = $MONAD;
                        SubLObject mt_var = v_hlmt;
                        if (dim == dim_var) {
                            mt = mt_var;
                            foundP = T;
                        }
                    }
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_hlmt)) {
                    if (NIL == foundP) {
                        {
                            SubLObject dim_var = com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(v_hlmt);
                            SubLObject mt_var = v_hlmt;
                            if (dim == dim_var) {
                                mt = mt_var;
                                foundP = T;
                            }
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
                        {
                            SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                            if (NIL == foundP) {
                                {
                                    SubLObject csome_list_var = args;
                                    SubLObject arg = NIL;
                                    for (arg = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                        {
                                            SubLObject dim_var = com.cyc.cycjava.cycl.hlmt.mt_dimension_of_arg(arg);
                                            SubLObject mt_var = arg;
                                            if (dim == dim_var) {
                                                mt = mt_var;
                                                foundP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_hlmt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_hlmt))) {
                            if (NIL == foundP) {
                                {
                                    SubLObject dim_var = $TIME;
                                    SubLObject mt_var = v_hlmt;
                                    if (dim == dim_var) {
                                        mt = mt_var;
                                        foundP = T;
                                    }
                                }
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p(v_hlmt)) {
                                if (NIL == foundP) {
                                    {
                                        SubLObject dim_var = $MONAD;
                                        SubLObject mt_var = v_hlmt;
                                        if (dim == dim_var) {
                                            mt = mt_var;
                                            foundP = T;
                                        }
                                    }
                                }
                            } else {
                                if (NIL == foundP) {
                                    {
                                        SubLObject dim_var = $UNKNOWN;
                                        SubLObject mt_var = v_hlmt;
                                        if (dim == dim_var) {
                                            mt = mt_var;
                                            foundP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return mt;
        }
    }

    /**
     *
     *
     * @return mt-p;  The dimension of HLMT specified by DIM.
     * @param DIM
    mt-dimension-type-p
     * 		
     * @param HLMT
    hlmt-p
     * 		
     */
    @LispMethod(comment = "@return mt-p;  The dimension of HLMT specified by DIM.\r\n@param DIM\nmt-dimension-type-p\r\n\t\t\r\n@param HLMT\nhlmt-p")
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

    /**
     *
     *
     * @return listp; the list of HLMT's dimensions.
     */
    @LispMethod(comment = "@return listp; the list of HLMT\'s dimensions.")
    public static final SubLObject hlmt_dimensions_alt(SubLObject v_hlmt) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
            return cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
        } else {
            return list(v_hlmt);
        }
    }

    /**
     *
     *
     * @return listp; the list of HLMT's dimensions.
     */
    @LispMethod(comment = "@return listp; the list of HLMT\'s dimensions.")
    public static SubLObject hlmt_dimensions(final SubLObject v_hlmt) {
        if (NIL != mt_space_naut_p(v_hlmt)) {
            return Mapping.mapcan(HLMT_DIMENSIONS, cycl_utilities.naut_args(v_hlmt, UNPROVIDED), EMPTY_SUBL_OBJECT_ARRAY);
        }
        return list(v_hlmt);
    }

    /**
     *
     *
     * @return hlmt-p; a new, reduced HLMT with the dimension specified by DIM removed.
     */
    @LispMethod(comment = "@return hlmt-p; a new, reduced HLMT with the dimension specified by DIM removed.")
    public static final SubLObject remove_hlmt_dimension_alt(SubLObject dim, SubLObject v_hlmt) {
        {
            SubLObject dimensions = com.cyc.cycjava.cycl.hlmt.hlmt_dimensions(v_hlmt);
            SubLObject doomed_dimension = com.cyc.cycjava.cycl.hlmt.get_hlmt_dimension(dim, v_hlmt);
            return com.cyc.cycjava.cycl.hlmt.new_reduced_hlmt(remove(doomed_dimension, dimensions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
    }

    /**
     *
     *
     * @return hlmt-p; a new, reduced HLMT with the dimension specified by DIM removed.
     */
    @LispMethod(comment = "@return hlmt-p; a new, reduced HLMT with the dimension specified by DIM removed.")
    public static SubLObject remove_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt) {
        final SubLObject dimensions = hlmt_dimensions(v_hlmt);
        final SubLObject doomed_dimension = get_hlmt_dimension(dim, v_hlmt);
        return new_reduced_hlmt(remove(doomed_dimension, dimensions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return hlmt-p; a new, reduced HLMT with the dimension specified by DIM replaced by the value VAL.
     */
    @LispMethod(comment = "@return hlmt-p; a new, reduced HLMT with the dimension specified by DIM replaced by the value VAL.")
    public static final SubLObject replace_hlmt_dimension_alt(SubLObject dim, SubLObject v_hlmt, SubLObject val) {
        {
            SubLObject dimensions = com.cyc.cycjava.cycl.hlmt.hlmt_dimensions(v_hlmt);
            SubLObject doomed_dimension = com.cyc.cycjava.cycl.hlmt.get_hlmt_dimension(dim, v_hlmt);
            SubLObject truncated_dimensions = remove(doomed_dimension, dimensions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject new_dimensions = cons(val, truncated_dimensions);
            return com.cyc.cycjava.cycl.hlmt.new_reduced_hlmt(new_dimensions);
        }
    }

    /**
     *
     *
     * @return hlmt-p; a new, reduced HLMT with the dimension specified by DIM replaced by the value VAL.
     */
    @LispMethod(comment = "@return hlmt-p; a new, reduced HLMT with the dimension specified by DIM replaced by the value VAL.")
    public static SubLObject replace_hlmt_dimension(final SubLObject dim, final SubLObject v_hlmt, final SubLObject val) {
        final SubLObject dimensions = hlmt_dimensions(v_hlmt);
        final SubLObject doomed_dimension = get_hlmt_dimension(dim, v_hlmt);
        final SubLObject truncated_dimensions = remove(doomed_dimension, dimensions, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_dimensions = cons(val, truncated_dimensions);
        return new_reduced_hlmt(new_dimensions);
    }

    public static final SubLObject replace_monad_dimension_alt(SubLObject v_hlmt, SubLObject monad) {
        return NIL != forts.fort_p(v_hlmt) ? ((SubLObject) (monad)) : com.cyc.cycjava.cycl.hlmt.replace_hlmt_dimension($MONAD, v_hlmt, monad);
    }

    public static SubLObject replace_monad_dimension(final SubLObject v_hlmt, final SubLObject monad) {
        return NIL != forts.fort_p(v_hlmt) ? monad : replace_hlmt_dimension($MONAD, v_hlmt, monad);
    }

    public static final SubLObject replace_time_dimension_alt(SubLObject v_hlmt, SubLObject time_index, SubLObject time_parameter) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        {
            SubLObject time_dimension = com.cyc.cycjava.cycl.hlmt.new_time_dimension(time_index, time_parameter);
            return com.cyc.cycjava.cycl.hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dimension);
        }
    }

    public static SubLObject replace_time_dimension(final SubLObject v_hlmt, final SubLObject time_index, SubLObject time_parameter) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        final SubLObject time_dimension = new_time_dimension(time_index, time_parameter);
        return replace_hlmt_dimension($TIME, v_hlmt, time_dimension);
    }

    /**
     *
     *
     * @return booleanp; Whether VAL has the default values for dimension DIM.
     */
    @LispMethod(comment = "@return booleanp; Whether VAL has the default values for dimension DIM.")
    public static final SubLObject default_values_for_dimension_p_alt(SubLObject dim, SubLObject val) {
        {
            SubLObject pcase_var = dim;
            if (pcase_var.eql($MONAD)) {
                return com.cyc.cycjava.cycl.hlmt.default_monad_mt_p(val);
            } else {
                if (pcase_var.eql($TIME)) {
                    return com.cyc.cycjava.cycl.hlmt.default_time_mt_p(val);
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return booleanp; Whether VAL has the default values for dimension DIM.
     */
    @LispMethod(comment = "@return booleanp; Whether VAL has the default values for dimension DIM.")
    public static SubLObject default_values_for_dimension_p(final SubLObject dim, final SubLObject val) {
        if (dim.eql($MONAD)) {
            return default_monad_mt_p(val);
        }
        if (dim.eql($TIME)) {
            return default_time_mt_p(val);
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether any hlmt in HLMTS has a non-monadic dimensions with non default values.
     */
    @LispMethod(comment = "@return booleanp; whether any hlmt in HLMTS has a non-monadic dimensions with non default values.")
    public static final SubLObject some_interesting_hlmtP_alt(SubLObject hlmts) {
        return list_utilities.any_in_list($sym54$INTERESTING_HLMT_, hlmts, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether any hlmt in HLMTS has a non-monadic dimensions with non default values.
     */
    @LispMethod(comment = "@return booleanp; whether any hlmt in HLMTS has a non-monadic dimensions with non default values.")
    public static SubLObject some_interesting_hlmtP(final SubLObject hlmts) {
        return list_utilities.any_in_list($sym55$INTERESTING_HLMT_, hlmts, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; whether HLMT has a non default non monad dimension.
     */
    @LispMethod(comment = "@return booleanp; whether HLMT has a non default non monad dimension.")
    public static final SubLObject interesting_hlmtP_alt(SubLObject v_hlmt) {
        {
            SubLObject interestingP = NIL;
            if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(v_hlmt)) {
                if (NIL == interestingP) {
                    {
                        SubLObject dim = $MONAD;
                        SubLObject val = v_hlmt;
                        if (NIL == com.cyc.cycjava.cycl.hlmt.monad_dimension_p(dim)) {
                            if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                interestingP = T;
                            }
                        }
                    }
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_hlmt)) {
                    if (NIL == interestingP) {
                        {
                            SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(v_hlmt);
                            SubLObject val = v_hlmt;
                            if (NIL == com.cyc.cycjava.cycl.hlmt.monad_dimension_p(dim)) {
                                if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                    interestingP = T;
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
                        {
                            SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                            if (NIL == interestingP) {
                                {
                                    SubLObject csome_list_var = args;
                                    SubLObject arg = NIL;
                                    for (arg = csome_list_var.first(); !((NIL != interestingP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                        {
                                            SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dimension_of_arg(arg);
                                            SubLObject val = arg;
                                            if (NIL == com.cyc.cycjava.cycl.hlmt.monad_dimension_p(dim)) {
                                                if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                                    interestingP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_hlmt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_hlmt))) {
                            if (NIL == interestingP) {
                                {
                                    SubLObject dim = $TIME;
                                    SubLObject val = v_hlmt;
                                    if (NIL == com.cyc.cycjava.cycl.hlmt.monad_dimension_p(dim)) {
                                        if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                            interestingP = T;
                                        }
                                    }
                                }
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p(v_hlmt)) {
                                if (NIL == interestingP) {
                                    {
                                        SubLObject dim = $MONAD;
                                        SubLObject val = v_hlmt;
                                        if (NIL == com.cyc.cycjava.cycl.hlmt.monad_dimension_p(dim)) {
                                            if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                                interestingP = T;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (NIL == interestingP) {
                                    {
                                        SubLObject dim = $UNKNOWN;
                                        SubLObject val = v_hlmt;
                                        if (NIL == com.cyc.cycjava.cycl.hlmt.monad_dimension_p(dim)) {
                                            if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                                interestingP = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return interestingP;
        }
    }

    /**
     *
     *
     * @return booleanp; whether HLMT has a non default non monad dimension.
     */
    @LispMethod(comment = "@return booleanp; whether HLMT has a non default non monad dimension.")
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

    /**
     *
     *
     * @return hlmt-p; the microtheory of ASSERTION, with all dimension default values filled in.
     */
    @LispMethod(comment = "@return hlmt-p; the microtheory of ASSERTION, with all dimension default values filled in.")
    public static final SubLObject assertion_hlmt_alt(SubLObject assertion) {
        {
            SubLObject mt = assertions_high.assertion_mt(assertion);
            return com.cyc.cycjava.cycl.hlmt.augment_hlmt(mt);
        }
    }

    /**
     *
     *
     * @return hlmt-p; the microtheory of ASSERTION, with all dimension default values filled in.
     */
    @LispMethod(comment = "@return hlmt-p; the microtheory of ASSERTION, with all dimension default values filled in.")
    public static SubLObject assertion_hlmt(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return augment_hlmt(mt);
    }

    public static final SubLObject hlmt_has_dimension_of_valueP_alt(SubLObject v_hlmt, SubLObject dimension, SubLObject value) {
        {
            SubLObject dimension_of_valueP = NIL;
            if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(v_hlmt)) {
                if (NIL == dimension_of_valueP) {
                    {
                        SubLObject dim = $MONAD;
                        SubLObject val = v_hlmt;
                        dimension_of_valueP = makeBoolean((dim == dimension) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(val, value)));
                    }
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_hlmt)) {
                    if (NIL == dimension_of_valueP) {
                        {
                            SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(v_hlmt);
                            SubLObject val = v_hlmt;
                            dimension_of_valueP = makeBoolean((dim == dimension) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(val, value)));
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
                        {
                            SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                            if (NIL == dimension_of_valueP) {
                                {
                                    SubLObject csome_list_var = args;
                                    SubLObject arg = NIL;
                                    for (arg = csome_list_var.first(); !((NIL != dimension_of_valueP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                        {
                                            SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dimension_of_arg(arg);
                                            SubLObject val = arg;
                                            dimension_of_valueP = makeBoolean((dim == dimension) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(val, value)));
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_hlmt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_hlmt))) {
                            if (NIL == dimension_of_valueP) {
                                {
                                    SubLObject dim = $TIME;
                                    SubLObject val = v_hlmt;
                                    dimension_of_valueP = makeBoolean((dim == dimension) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(val, value)));
                                }
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p(v_hlmt)) {
                                if (NIL == dimension_of_valueP) {
                                    {
                                        SubLObject dim = $MONAD;
                                        SubLObject val = v_hlmt;
                                        dimension_of_valueP = makeBoolean((dim == dimension) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(val, value)));
                                    }
                                }
                            } else {
                                if (NIL == dimension_of_valueP) {
                                    {
                                        SubLObject dim = $UNKNOWN;
                                        SubLObject val = v_hlmt;
                                        dimension_of_valueP = makeBoolean((dim == dimension) && (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_equal(val, value)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return dimension_of_valueP;
        }
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

    /**
     *
     *
     * @return hlmt-p; Returns a new hlmt, made from HLMT with all dimension default values filled in. @note result is destructible.
     */
    @LispMethod(comment = "@return hlmt-p; Returns a new hlmt, made from HLMT with all dimension default values filled in. @note result is destructible.")
    public static final SubLObject augment_hlmt_alt(SubLObject v_hlmt) {
        {
            SubLObject remaining_dimensions = copy_list($mt_dimension_types$.getGlobalValue());
            SubLObject dimensions = NIL;
            if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(v_hlmt)) {
                {
                    SubLObject dim = $MONAD;
                    SubLObject val = v_hlmt;
                    remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_augment_dimension(dim, val), dimensions);
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_hlmt)) {
                    {
                        SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(v_hlmt);
                        SubLObject val = v_hlmt;
                        remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_augment_dimension(dim, val), dimensions);
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
                        {
                            SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                            SubLObject csome_list_var = args;
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                {
                                    SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dimension_of_arg(arg);
                                    SubLObject val = arg;
                                    remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_augment_dimension(dim, val), dimensions);
                                }
                            }
                        }
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_hlmt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_hlmt))) {
                            {
                                SubLObject dim = $TIME;
                                SubLObject val = v_hlmt;
                                remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_augment_dimension(dim, val), dimensions);
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p(v_hlmt)) {
                                {
                                    SubLObject dim = $MONAD;
                                    SubLObject val = v_hlmt;
                                    remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_augment_dimension(dim, val), dimensions);
                                }
                            } else {
                                {
                                    SubLObject dim = $UNKNOWN;
                                    SubLObject val = v_hlmt;
                                    remaining_dimensions = delete(dim, remaining_dimensions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_augment_dimension(dim, val), dimensions);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = remaining_dimensions;
                SubLObject dim = NIL;
                for (dim = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dim = cdolist_list_var.first()) {
                    dimensions = cons(com.cyc.cycjava.cycl.hlmt.default_dimension_mt(dim), dimensions);
                }
            }
            return com.cyc.cycjava.cycl.hlmt.new_hlmt(dimensions);
        }
    }

    /**
     *
     *
     * @return hlmt-p; Returns a new hlmt, made from HLMT with all dimension default values filled in. @note result is destructible.
     */
    @LispMethod(comment = "@return hlmt-p; Returns a new hlmt, made from HLMT with all dimension default values filled in. @note result is destructible.")
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

    /**
     * Removes default values from HLMT, for more compact storage. @note result is destructible.
     */
    @LispMethod(comment = "Removes default values from HLMT, for more compact storage. @note result is destructible.")
    public static final SubLObject reduce_hlmt_alt(SubLObject v_hlmt, SubLObject minimize_mt_union_mtsP) {
        if (minimize_mt_union_mtsP == UNPROVIDED) {
            minimize_mt_union_mtsP = T;
        }
        v_hlmt = com.cyc.cycjava.cycl.hlmt.transform_mt_union_nauts(v_hlmt, minimize_mt_union_mtsP);
        {
            SubLObject monad = com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt(v_hlmt);
            if (NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP(monad)) {
                return monad;
            }
            if (monad == v_hlmt) {
                return v_hlmt;
            }
        }
        {
            SubLObject substantial_dimensions = NIL;
            if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(v_hlmt)) {
                {
                    SubLObject dim = $MONAD;
                    SubLObject val = v_hlmt;
                    if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                        substantial_dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_reduce_dimension(dim, val), substantial_dimensions);
                    }
                }
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_hlmt)) {
                    {
                        SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(v_hlmt);
                        SubLObject val = v_hlmt;
                        if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                            substantial_dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_reduce_dimension(dim, val), substantial_dimensions);
                        }
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
                        {
                            SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                            SubLObject csome_list_var = args;
                            SubLObject arg = NIL;
                            for (arg = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                {
                                    SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dimension_of_arg(arg);
                                    SubLObject val = arg;
                                    if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                        substantial_dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_reduce_dimension(dim, val), substantial_dimensions);
                                    }
                                }
                            }
                        }
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_hlmt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_hlmt))) {
                            {
                                SubLObject dim = $TIME;
                                SubLObject val = v_hlmt;
                                if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                    substantial_dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_reduce_dimension(dim, val), substantial_dimensions);
                                }
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p(v_hlmt)) {
                                {
                                    SubLObject dim = $MONAD;
                                    SubLObject val = v_hlmt;
                                    if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                        substantial_dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_reduce_dimension(dim, val), substantial_dimensions);
                                    }
                                }
                            } else {
                                {
                                    SubLObject dim = $UNKNOWN;
                                    SubLObject val = v_hlmt;
                                    if (NIL == com.cyc.cycjava.cycl.hlmt.default_values_for_dimension_p(dim, val)) {
                                        substantial_dimensions = cons(com.cyc.cycjava.cycl.hlmt.possibly_reduce_dimension(dim, val), substantial_dimensions);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != list_utilities.singletonP(substantial_dimensions)) {
                return substantial_dimensions.first();
            } else {
                if (NIL != substantial_dimensions) {
                    return com.cyc.cycjava.cycl.hlmt.new_hlmt(substantial_dimensions);
                } else {
                    return com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt(v_hlmt);
                }
            }
        }
    }

    /**
     * Removes default values from HLMT, for more compact storage. @note result is destructible.
     */
    @LispMethod(comment = "Removes default values from HLMT, for more compact storage. @note result is destructible.")
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

    public static final SubLObject transform_mt_union_nauts_alt(SubLObject v_hlmt, SubLObject minimize_mt_union_mtsP) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(v_hlmt)) {
            return com.cyc.cycjava.cycl.hlmt.reduce_mt_union_hlmt(v_hlmt, minimize_mt_union_mtsP);
        } else {
            if (v_hlmt.isCons()) {
                return cons(com.cyc.cycjava.cycl.hlmt.transform_mt_union_nauts(v_hlmt.first(), minimize_mt_union_mtsP), com.cyc.cycjava.cycl.hlmt.transform_mt_union_nauts(v_hlmt.rest(), minimize_mt_union_mtsP));
            } else {
                return v_hlmt;
            }
        }
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

    public static final SubLObject reduce_mt_union_hlmt_alt(SubLObject mt_union_hlmt, SubLObject minimize_mt_union_mtsP) {
        {
            SubLObject mts = com.cyc.cycjava.cycl.hlmt.mt_union_mts_recursive(mt_union_hlmt);
            if (NIL != list_utilities.member_eqP($$EverythingPSC, mts)) {
                return $$EverythingPSC;
            } else {
                if (NIL != list_utilities.member_eqP($$InferencePSC, mts)) {
                    return $$InferencePSC;
                } else {
                    if (NIL != minimize_mt_union_mtsP) {
                        mts = com.cyc.cycjava.cycl.hlmt.reduce_mt_union_hlmt_int(sort_terms(mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } else {
                        mts = sort_terms(list_utilities.fast_delete_duplicates(mts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL != list_utilities.lengthLE(mts, ONE_INTEGER, UNPROVIDED)) {
                        return mts.first();
                    } else {
                        return make_nat_formula($$MtUnionFn, mts);
                    }
                }
            }
        }
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

    public static final SubLObject clear_reduce_mt_union_hlmt_int_alt() {
        {
            SubLObject cs = $reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_reduce_mt_union_hlmt_int() {
        final SubLObject cs = $reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_reduce_mt_union_hlmt_int_alt(SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($reduce_mt_union_hlmt_int_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_reduce_mt_union_hlmt_int(final SubLObject mts) {
        return memoization_state.caching_state_remove_function_results_with_args($reduce_mt_union_hlmt_int_caching_state$.getGlobalValue(), list(mts), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject reduce_mt_union_hlmt_int_internal_alt(SubLObject mts) {
        return sort_terms(min_mts(mts, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject reduce_mt_union_hlmt_int_internal(final SubLObject mts) {
        return kb_utilities.sort_terms(genl_mts.min_mts(mts, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject reduce_mt_union_hlmt_int_alt(SubLObject mts) {
        {
            SubLObject caching_state = $reduce_mt_union_hlmt_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(REDUCE_MT_UNION_HLMT_INT, $reduce_mt_union_hlmt_int_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
                memoization_state.register_mt_dependent_cache_clear_callback(CLEAR_REDUCE_MT_UNION_HLMT_INT);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mts, $kw58$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw58$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.hlmt.reduce_mt_union_hlmt_int_internal(mts)));
                    memoization_state.caching_state_put(caching_state, mts, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    /**
     *
     *
     * @return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced.
     */
    @LispMethod(comment = "@return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced.")
    public static final SubLObject new_reduced_hlmt_alt(SubLObject mt_dimensions) {
        return com.cyc.cycjava.cycl.hlmt.reduce_hlmt(com.cyc.cycjava.cycl.hlmt.new_hlmt(mt_dimensions), UNPROVIDED);
    }

    /**
     *
     *
     * @return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced.
     */
    @LispMethod(comment = "@return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced.")
    public static SubLObject new_reduced_hlmt(final SubLObject mt_dimensions) {
        return reduce_hlmt(new_hlmt(mt_dimensions), UNPROVIDED);
    }

    /**
     *
     *
     * @return hlmt-p; The hlmt generated when doing a union of HLMT1 and HLMT2.
     */
    @LispMethod(comment = "@return hlmt-p; The hlmt generated when doing a union of HLMT1 and HLMT2.")
    public static final SubLObject combine_hlmts_alt(SubLObject hlmt1, SubLObject hlmt2) {
        if ((hlmt1 == $$EverythingPSC) || (hlmt2 == $$EverythingPSC)) {
            return $$EverythingPSC;
        }
        if ((hlmt1 == $$InferencePSC) || (hlmt2 == $$InferencePSC)) {
            return $$InferencePSC;
        }
        {
            SubLObject mts = NIL;
            hlmt1 = hlmt_czer.canonicalize_hlmt(hlmt1);
            hlmt2 = hlmt_czer.canonicalize_hlmt(hlmt2);
            if (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(hlmt1)) {
                mts = append(com.cyc.cycjava.cycl.hlmt.mt_union_mts(hlmt1), mts);
            } else {
                mts = cons(hlmt1, mts);
            }
            if (NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(hlmt2)) {
                mts = append(com.cyc.cycjava.cycl.hlmt.mt_union_mts(hlmt2), mts);
            } else {
                mts = cons(hlmt2, mts);
            }
            mts = min_mts(mts, UNPROVIDED);
            if (NIL != list_utilities.singletonP(mts)) {
                return mts.first();
            }
            return czer_main.canonicalize_term(make_formula($$MtUnionFn, mts, UNPROVIDED), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return hlmt-p; The hlmt generated when doing a union of HLMT1 and HLMT2.
     */
    @LispMethod(comment = "@return hlmt-p; The hlmt generated when doing a union of HLMT1 and HLMT2.")
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

    /**
     *
     *
     * @return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced and canonically ordered.
     */
    @LispMethod(comment = "@return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced and canonically ordered.")
    public static final SubLObject new_canonicalized_hlmt_alt(SubLObject mt_dimensions) {
        return hlmt_czer.canonicalize_hlmt(com.cyc.cycjava.cycl.hlmt.new_hlmt(mt_dimensions));
    }

    /**
     *
     *
     * @return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced and canonically ordered.
     */
    @LispMethod(comment = "@return hlmt-p; a HLMT constructed with MT-DIMENSIONS that is maximally reduced and canonically ordered.")
    public static SubLObject new_canonicalized_hlmt(final SubLObject mt_dimensions) {
        return hlmt_czer.canonicalize_hlmt(new_hlmt(mt_dimensions));
    }

    public static final SubLObject possibly_augment_dimension_alt(SubLObject dim, SubLObject val) {
        {
            SubLObject pcase_var = dim;
            if (pcase_var.eql($MONAD)) {
                return val;
            } else {
                if (pcase_var.eql($TIME)) {
                    return com.cyc.cycjava.cycl.hlmt.possibly_augment_time_mt(val);
                } else {
                    return val;
                }
            }
        }
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

    public static final SubLObject possibly_reduce_dimension_alt(SubLObject dim, SubLObject val) {
        {
            SubLObject pcase_var = dim;
            if (pcase_var.eql($MONAD)) {
                return val;
            } else {
                if (pcase_var.eql($TIME)) {
                    return com.cyc.cycjava.cycl.hlmt.possibly_reduce_time_mt(val);
                } else {
                    return val;
                }
            }
        }
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

    /**
     *
     *
     * @return hlmt-p; Returns a hlmt of the dimensional slice DIM, with the default values of that dimension.
     */
    @LispMethod(comment = "@return hlmt-p; Returns a hlmt of the dimensional slice DIM, with the default values of that dimension.")
    public static final SubLObject default_dimension_mt_alt(SubLObject dim) {
        {
            SubLObject pcase_var = dim;
            if (pcase_var.eql($MONAD)) {
                return $default_monad_mt$.getGlobalValue();
            } else {
                if (pcase_var.eql($TIME)) {
                    return com.cyc.cycjava.cycl.hlmt.default_time_mt();
                } else {
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @return hlmt-p; Returns a hlmt of the dimensional slice DIM, with the default values of that dimension.
     */
    @LispMethod(comment = "@return hlmt-p; Returns a hlmt of the dimensional slice DIM, with the default values of that dimension.")
    public static SubLObject default_dimension_mt(final SubLObject dim) {
        if (dim.eql($MONAD)) {
            return $default_monad_mt$.getGlobalValue();
        }
        if (dim.eql($TIME)) {
            return default_time_mt();
        }
        return NIL;
    }

    /**
     *
     *
     * @return hlmt-p; A new hlmt with dimensions as specified by DIM-PLIST
     */
    @LispMethod(comment = "@return hlmt-p; A new hlmt with dimensions as specified by DIM-PLIST")
    public static final SubLObject new_hlmt_from_dimension_plist_alt(SubLObject dim_plist) {
        return NIL;
    }

    /**
     *
     *
     * @return hlmt-p; A new hlmt with dimensions as specified by DIM-PLIST
     */
    @LispMethod(comment = "@return hlmt-p; A new hlmt with dimensions as specified by DIM-PLIST")
    public static SubLObject new_hlmt_from_dimension_plist(final SubLObject dim_plist) {
        return NIL;
    }

    public static final SubLObject valid_hlmtP_alt(SubLObject v_hlmt, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.hlmtP(v_hlmt)) && (NIL != com.cyc.cycjava.cycl.hlmt.valid_hlmt_p(v_hlmt, robust)));
    }

    public static SubLObject valid_hlmtP(final SubLObject v_hlmt, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != hlmtP(v_hlmt)) && (NIL != valid_hlmt_p(v_hlmt, robust)));
    }

    public static final SubLObject valid_hlmt_p_alt(SubLObject v_hlmt, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_p(v_hlmt)) {
            if (NIL != robust) {
                {
                    SubLObject invalidP = NIL;
                    if (NIL != com.cyc.cycjava.cycl.hlmt.monad_mt_p(v_hlmt)) {
                        if (NIL == invalidP) {
                            {
                                SubLObject dim = $MONAD;
                                SubLObject val = v_hlmt;
                                if (NIL == com.cyc.cycjava.cycl.hlmt.valid_mt_for_dimension_p(dim, val)) {
                                    invalidP = T;
                                }
                            }
                        }
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_hlmt)) {
                            if (NIL == invalidP) {
                                {
                                    SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dim_nat_dimension(v_hlmt);
                                    SubLObject val = v_hlmt;
                                    if (NIL == com.cyc.cycjava.cycl.hlmt.valid_mt_for_dimension_p(dim, val)) {
                                        invalidP = T;
                                    }
                                }
                            }
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.hlmt.mt_space_naut_p(v_hlmt)) {
                                {
                                    SubLObject args = cycl_utilities.naut_args(v_hlmt, UNPROVIDED);
                                    if (NIL == invalidP) {
                                        {
                                            SubLObject csome_list_var = args;
                                            SubLObject arg = NIL;
                                            for (arg = csome_list_var.first(); !((NIL != invalidP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , arg = csome_list_var.first()) {
                                                {
                                                    SubLObject dim = com.cyc.cycjava.cycl.hlmt.mt_dimension_of_arg(arg);
                                                    SubLObject val = arg;
                                                    if (NIL == com.cyc.cycjava.cycl.hlmt.valid_mt_for_dimension_p(dim, val)) {
                                                        invalidP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if ((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_hlmt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_hlmt))) {
                                    if (NIL == invalidP) {
                                        {
                                            SubLObject dim = $TIME;
                                            SubLObject val = v_hlmt;
                                            if (NIL == com.cyc.cycjava.cycl.hlmt.valid_mt_for_dimension_p(dim, val)) {
                                                invalidP = T;
                                            }
                                        }
                                    }
                                } else {
                                    if (NIL != com.cyc.cycjava.cycl.hlmt.closed_possibly_hlmt_p(v_hlmt)) {
                                        if (NIL == invalidP) {
                                            {
                                                SubLObject dim = $MONAD;
                                                SubLObject val = v_hlmt;
                                                if (NIL == com.cyc.cycjava.cycl.hlmt.valid_mt_for_dimension_p(dim, val)) {
                                                    invalidP = T;
                                                }
                                            }
                                        }
                                    } else {
                                        if (NIL == invalidP) {
                                            {
                                                SubLObject dim = $UNKNOWN;
                                                SubLObject val = v_hlmt;
                                                if (NIL == com.cyc.cycjava.cycl.hlmt.valid_mt_for_dimension_p(dim, val)) {
                                                    invalidP = T;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return makeBoolean(NIL == invalidP);
                }
            } else {
                return com.cyc.cycjava.cycl.hlmt.valid_monad_mt_p(com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt(v_hlmt));
            }
        }
        return NIL;
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

    public static final SubLObject valid_mt_for_dimension_p_alt(SubLObject dim, SubLObject val) {
        {
            SubLObject pcase_var = dim;
            if (pcase_var.eql($MONAD)) {
                return com.cyc.cycjava.cycl.hlmt.valid_monad_mt_p(val);
            } else {
                if (pcase_var.eql($TIME)) {
                    return com.cyc.cycjava.cycl.hlmt.valid_temporal_mt_slice_p(val);
                } else {
                    return NIL;
                }
            }
        }
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

    public static final SubLObject default_monad_mt_p_alt(SubLObject v_object) {
        return eq(v_object, $default_monad_mt$.getGlobalValue());
    }

    public static SubLObject default_monad_mt_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_monad_mt$.getGlobalValue());
    }

    public static final SubLObject monad_dimension_p_alt(SubLObject v_object) {
        return eq(v_object, $MONAD);
    }

    public static SubLObject monad_dimension_p(final SubLObject v_object) {
        return eql(v_object, $MONAD);
    }

    public static final SubLObject monad_mt_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL == com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_object))) || ((NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(v_object)) && (NIL != list_utilities.every_in_list(MONAD_MT_P, com.cyc.cycjava.cycl.hlmt.mt_union_mts(v_object), UNPROVIDED))));
    }

    public static SubLObject monad_mt_p(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL == anytime_psc_p(v_object))) || ((NIL != mt_union_naut_p(v_object)) && (NIL != list_utilities.every_in_list(MONAD_MT_P, mt_union_mts(v_object), UNPROVIDED))));
    }

    public static final SubLObject valid_monad_mt_p_alt(SubLObject mt) {
        if (NIL != mt) {
            return makeBoolean((NIL != forts.valid_fortP(mt)) && (NIL != fort_types_interface.mtP(mt)));
        } else {
            return T;
        }
    }

    public static SubLObject valid_monad_mt_p(final SubLObject mt) {
        if (NIL != mt) {
            return makeBoolean((NIL != forts.valid_fortP(mt)) && (NIL != fort_types_interface.mtP(mt)));
        }
        return T;
    }

    public static final SubLObject monad_mtP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.mtP(v_object))) || ((NIL != com.cyc.cycjava.cycl.hlmt.mt_union_naut_p(v_object)) && (NIL != list_utilities.every_in_list($sym59$MONAD_MT_, com.cyc.cycjava.cycl.hlmt.mt_union_mts(v_object), UNPROVIDED))));
    }

    public static SubLObject monad_mtP(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.mtP(v_object))) || ((NIL != mt_union_naut_p(v_object)) && (NIL != list_utilities.every_in_list($sym59$MONAD_MT_, mt_union_mts(v_object), UNPROVIDED))));
    }

    public static final SubLObject monad_cycl_mtP_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.hlmt.possibly_mt_p(v_object)) && (NIL == com.cyc.cycjava.cycl.hlmt.hlmt_naut_p(v_object))) && (NIL != isa.isa_in_any_mtP(v_object, $$Microtheory)));
    }

    public static SubLObject monad_cycl_mtP(final SubLObject v_object) {
        return makeBoolean(((NIL != possibly_mt_p(v_object)) && (NIL == hlmt_naut_p(v_object))) && (NIL != isa.isa_in_any_mtP(v_object, $$Microtheory)));
    }

    /**
     *
     *
     * @return monad-mt-p
     */
    @LispMethod(comment = "@return monad-mt-p")
    public static final SubLObject hlmt_monad_mt_alt(SubLObject v_hlmt) {
        {
            SubLObject monad_mt = com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt_without_default(v_hlmt);
            return NIL != monad_mt ? ((SubLObject) (monad_mt)) : $default_monad_mt$.getGlobalValue();
        }
    }

    /**
     *
     *
     * @return monad-mt-p
     */
    @LispMethod(comment = "@return monad-mt-p")
    public static SubLObject hlmt_monad_mt(final SubLObject v_hlmt) {
        final SubLObject monad_mt = hlmt_monad_mt_without_default(v_hlmt);
        return NIL != monad_mt ? monad_mt : $default_monad_mt$.getGlobalValue();
    }

    /**
     *
     *
     * @return nil or monad-mt-p
     */
    @LispMethod(comment = "@return nil or monad-mt-p")
    public static final SubLObject hlmt_monad_mt_without_default_alt(SubLObject v_hlmt) {
        return NIL != com.cyc.cycjava.cycl.hlmt.hlmt_naut_p(v_hlmt) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt.get_hlmt_dimension($MONAD, v_hlmt))) : v_hlmt;
    }

    /**
     *
     *
     * @return nil or monad-mt-p
     */
    @LispMethod(comment = "@return nil or monad-mt-p")
    public static SubLObject hlmt_monad_mt_without_default(final SubLObject v_hlmt) {
        return NIL != hlmt_naut_p(v_hlmt) ? get_hlmt_dimension($MONAD, v_hlmt) : v_hlmt;
    }

    public static final SubLObject assertion_monad_mt_alt(SubLObject assertion) {
        {
            SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
            SubLObject monad_mt = com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt(v_hlmt);
            if (NIL != monad_mt) {
                return monad_mt;
            } else {
                return $default_monad_mt$.getGlobalValue();
            }
        }
    }

    public static SubLObject assertion_monad_mt(final SubLObject assertion) {
        final SubLObject v_hlmt = assertions_high.assertion_mt(assertion);
        final SubLObject monad_mt = hlmt_monad_mt(v_hlmt);
        if (NIL != monad_mt) {
            return monad_mt;
        }
        return $default_monad_mt$.getGlobalValue();
    }

    public static final SubLObject equal_mt_monads_p_alt(SubLObject object0, SubLObject object1) {
        return com.cyc.cycjava.cycl.hlmt.monad_mt_equal(com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt(object0), com.cyc.cycjava.cycl.hlmt.hlmt_monad_mt(object1));
    }

    public static SubLObject equal_mt_monads_p(final SubLObject object0, final SubLObject object1) {
        return monad_mt_equal(hlmt_monad_mt(object0), hlmt_monad_mt(object1));
    }

    public static final SubLObject monad_mt_equal_alt(SubLObject object0, SubLObject object1) {
        return eq(object0, object1);
    }

    public static SubLObject monad_mt_equal(final SubLObject object0, final SubLObject object1) {
        return kb_utilities.kbeq(object0, object1);
    }

    public static final SubLObject temporal_dimension_function_p_alt(SubLObject dim) {
        return subl_promotions.memberP(dim, $temporal_dimension_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject temporal_dimension_function_p(final SubLObject dim) {
        return subl_promotions.memberP(dim, $temporal_dimension_functions$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject temporal_dimension_predicate_p_alt(SubLObject pred) {
        return subl_promotions.memberP(pred, $temporal_dimension_predicates$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject temporal_dimension_predicate_p(final SubLObject pred) {
        return list_utilities.member_kbeqP(pred, $temporal_dimension_predicates$.getGlobalValue());
    }

    public static final SubLObject default_mt_time_interval_p_alt(SubLObject v_object) {
        return eq(v_object, $default_mt_time_interval$.getGlobalValue());
    }

    public static SubLObject default_mt_time_interval_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_mt_time_interval$.getGlobalValue());
    }

    public static final SubLObject default_mt_time_parameter_p_alt(SubLObject v_object) {
        return eq(v_object, $default_mt_time_parameter$.getGlobalValue());
    }

    public static SubLObject default_mt_time_parameter_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $default_mt_time_parameter$.getGlobalValue());
    }

    public static final SubLObject default_time_mt_p_alt(SubLObject dim) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != possibly_naut_p(dim)) {
                thread.resetMultipleValues();
                {
                    SubLObject interval = com.cyc.cycjava.cycl.hlmt.explode_hlmt_temporal_facets_with_defaults(dim);
                    SubLObject parameter = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return makeBoolean((interval == $default_mt_time_interval$.getGlobalValue()) && (parameter == $default_mt_time_parameter$.getGlobalValue()));
                }
            } else {
                return NIL;
            }
        }
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

    public static final SubLObject mt_time_dim_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.temporal_dimension_function_p(cycl_utilities.naut_functor(v_object))));
    }

    public static SubLObject mt_time_dim_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != temporal_dimension_function_p(cycl_utilities.naut_functor(v_object))));
    }

    public static final SubLObject anytime_psc_p_alt(SubLObject v_object) {
        return eq(v_object, $anytime_psc$.getGlobalValue());
    }

    public static SubLObject anytime_psc_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $anytime_psc$.getGlobalValue());
    }

    public static final SubLObject anytime_during_psc_fn_p_alt(SubLObject v_object) {
        return eq(v_object, $anytime_during_psc_fn$.getGlobalValue());
    }

    public static SubLObject anytime_during_psc_fn_p(final SubLObject v_object) {
        return kb_utilities.kbeq(v_object, $anytime_during_psc_fn$.getGlobalValue());
    }

    public static final SubLObject anytime_during_psc_fn_naut_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_p(cycl_utilities.naut_functor(v_object))));
    }

    public static SubLObject anytime_during_psc_fn_naut_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != anytime_during_psc_fn_p(cycl_utilities.naut_functor(v_object))));
    }

    public static final SubLObject anytime_psc_hlmtP_alt(SubLObject v_hlmt) {
        return com.cyc.cycjava.cycl.hlmt.anytime_psc_p(com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt));
    }

    public static SubLObject anytime_psc_hlmtP(final SubLObject v_hlmt) {
        return anytime_psc_p(hlmt_temporal_mt(v_hlmt));
    }

    public static final SubLObject anytime_during_psc_hlmtP_alt(SubLObject v_hlmt) {
        {
            SubLObject time_mt = com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt);
            return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(time_mt)) && (NIL != isa.isaP(com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_time_interval(time_mt), $$TimeInterval, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject anytime_during_psc_hlmtP(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        return makeBoolean((NIL != anytime_during_psc_fn_naut_p(time_mt)) && (NIL != isa.isaP(anytime_during_psc_fn_time_interval(time_mt), $$TimeInterval, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject temporal_hlmt_p_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.hlmt_naut_p(v_object)) {
            return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_object));
        }
        return NIL;
    }

    public static SubLObject temporal_hlmt_p(final SubLObject v_object) {
        if (NIL != hlmt_naut_p(v_object)) {
            return list_utilities.sublisp_boolean(hlmt_temporal_mt(v_object));
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Returns whether HLMT is an Atemporal Microtheory.
     */
    @LispMethod(comment = "@return booleanp; Returns whether HLMT is an Atemporal Microtheory.")
    public static final SubLObject atemporal_hlmtP_alt(SubLObject v_hlmt) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.hlmt.temporal_hlmt_p(v_hlmt));
    }

    /**
     *
     *
     * @return booleanp; Returns whether HLMT is an Atemporal Microtheory.
     */
    @LispMethod(comment = "@return booleanp; Returns whether HLMT is an Atemporal Microtheory.")
    public static SubLObject atemporal_hlmtP(final SubLObject v_hlmt) {
        return makeBoolean(NIL == temporal_hlmt_p(v_hlmt));
    }

    public static final SubLObject temporal_dimension_mt_p_alt(SubLObject v_object) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(v_object)) {
            return T;
        } else {
            if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(v_object)) {
                return T;
            } else {
                if (NIL != com.cyc.cycjava.cycl.hlmt.mt_dim_naut_p(v_object)) {
                    {
                        SubLObject functor = cycl_utilities.naut_functor(v_object);
                        if (NIL != com.cyc.cycjava.cycl.hlmt.temporal_dimension_function_p(functor)) {
                            return T;
                        } else {
                            if (functor == $$MtDim) {
                                return com.cyc.cycjava.cycl.hlmt.temporal_dimension_predicate_p(cycl_utilities.nat_arg1(v_object, UNPROVIDED));
                            } else {
                                return NIL;
                            }
                        }
                    }
                } else {
                    return NIL;
                }
            }
        }
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

    public static final SubLObject time_dimension_p_alt(SubLObject v_object) {
        return eq(v_object, $TIME);
    }

    public static SubLObject time_dimension_p(final SubLObject v_object) {
        return eq(v_object, $TIME);
    }

    public static final SubLObject time_intervalP_alt(SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$TimeInterval, UNPROVIDED);
    }

    public static SubLObject time_intervalP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$TimeInterval, UNPROVIDED);
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is a #$TemporalThing
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is a #$TemporalThing")
    public static final SubLObject temporal_objectP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.time_intervalP(v_object)) || (NIL != at_defns.quiet_has_typeP(v_object, $$TemporalThing, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT is a #$TemporalThing
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT is a #$TemporalThing")
    public static SubLObject temporal_objectP(final SubLObject v_object) {
        return makeBoolean((NIL != time_intervalP(v_object)) || (NIL != at_defns.quiet_has_typeP(v_object, $$TemporalThing, UNPROVIDED)));
    }

    public static final SubLObject time_parameterP_alt(SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$TimeParameter, UNPROVIDED);
    }

    public static SubLObject time_parameterP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$TimeParameter, UNPROVIDED);
    }

    public static final SubLObject time_mt_with_implicit_parameter_p_alt(SubLObject dim_nat) {
        return makeBoolean((NIL != possibly_naut_p(dim_nat)) && (cycl_utilities.naut_functor(dim_nat) == $$MtTimeDimFn));
    }

    public static SubLObject time_mt_with_implicit_parameter_p(final SubLObject dim_nat) {
        return makeBoolean((NIL != possibly_naut_p(dim_nat)) && (NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(dim_nat), $$MtTimeDimFn)));
    }

    public static final SubLObject time_mt_with_explicit_parameter_p_alt(SubLObject dim_nat) {
        return makeBoolean((NIL != possibly_naut_p(dim_nat)) && (cycl_utilities.naut_functor(dim_nat) == $$MtTimeWithGranularityDimFn));
    }

    public static SubLObject time_mt_with_explicit_parameter_p(final SubLObject dim_nat) {
        return makeBoolean((NIL != possibly_naut_p(dim_nat)) && (NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(dim_nat), $$MtTimeWithGranularityDimFn)));
    }

    public static final SubLObject time_mt_with_indeterminate_time_p_alt(SubLObject dim_nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.hlmt.mt_time_dim_naut_p(dim_nat)) {
                thread.resetMultipleValues();
                {
                    SubLObject index = com.cyc.cycjava.cycl.hlmt.mt_time_dim_nat_temporal_values(dim_nat);
                    SubLObject param = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return com.cyc.cycjava.cycl.hlmt.indeterminate_time_interval_p(index);
                }
            } else {
                return NIL;
            }
        }
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

    public static final SubLObject some_time_in_interval_naut_p_alt(SubLObject interval) {
        return makeBoolean((NIL != possibly_naut_p(interval)) && (cycl_utilities.naut_functor(interval) == $$SomeTimeInIntervalFn));
    }

    public static SubLObject some_time_in_interval_naut_p(final SubLObject interval) {
        return makeBoolean((NIL != possibly_naut_p(interval)) && (NIL != kb_utilities.kbeq(cycl_utilities.naut_functor(interval), $$SomeTimeInIntervalFn)));
    }

    public static final SubLObject indeterminate_time_interval_p_alt(SubLObject interval) {
        return makeBoolean((NIL != possibly_nat_p(interval)) && ((NIL != com.cyc.cycjava.cycl.hlmt.some_time_in_interval_naut_p(interval)) || (NIL != list_utilities.any_in_list(INDETERMINATE_TIME_INTERVAL_P, cycl_utilities.nat_args(interval, UNPROVIDED), UNPROVIDED))));
    }

    public static SubLObject indeterminate_time_interval_p(final SubLObject interval) {
        return makeBoolean((NIL != possibly_nat_p(interval)) && ((NIL != some_time_in_interval_naut_p(interval)) || (NIL != list_utilities.any_in_list(INDETERMINATE_TIME_INTERVAL_P, cycl_utilities.nat_args(interval, UNPROVIDED), UNPROVIDED))));
    }

    public static final SubLObject hlmt_with_indeterminate_time_p_alt(SubLObject v_hlmt) {
        {
            SubLObject time_mt = com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt);
            if (NIL != time_mt) {
                return com.cyc.cycjava.cycl.hlmt.time_mt_with_indeterminate_time_p(time_mt);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject hlmt_with_indeterminate_time_p(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        if (NIL != time_mt) {
            return time_mt_with_indeterminate_time_p(time_mt);
        }
        return NIL;
    }

    public static final SubLObject hlmt_with_anytime_psc_p_alt(SubLObject v_hlmt) {
        {
            SubLObject time_mt = com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt);
            return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(time_mt)) || (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(time_mt)));
        }
    }

    public static SubLObject hlmt_with_anytime_psc_p(final SubLObject v_hlmt) {
        final SubLObject time_mt = hlmt_temporal_mt(v_hlmt);
        return makeBoolean((NIL != anytime_psc_p(time_mt)) || (NIL != anytime_during_psc_fn_naut_p(time_mt)));
    }

    public static final SubLObject equal_mt_times_p_alt(SubLObject object0, SubLObject object1) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (object0 == object1) {
                return T;
            }
            {
                SubLObject indeterminate_0P = com.cyc.cycjava.cycl.hlmt.hlmt_with_indeterminate_time_p(object0);
                SubLObject indeterminate_1P = com.cyc.cycjava.cycl.hlmt.hlmt_with_indeterminate_time_p(object1);
                if ((NIL == indeterminate_0P) && (NIL == indeterminate_1P)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject interval0 = com.cyc.cycjava.cycl.hlmt.explode_hlmt_temporal_facets_with_defaults(object0);
                        SubLObject parameter0 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject interval1 = com.cyc.cycjava.cycl.hlmt.explode_hlmt_temporal_facets_with_defaults(object1);
                            SubLObject parameter1 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.temporal_object_equal(interval0, interval1)) && (NIL != com.cyc.cycjava.cycl.hlmt.time_parameter_equal(parameter0, parameter1)));
                        }
                    }
                } else {
                    if ((NIL != indeterminate_0P) && (NIL != indeterminate_1P)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject interval0 = com.cyc.cycjava.cycl.hlmt.explode_indeterminate_time_dim_nat(object0);
                            SubLObject sentence0 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            thread.resetMultipleValues();
                            {
                                SubLObject interval1 = com.cyc.cycjava.cycl.hlmt.explode_indeterminate_time_dim_nat(object1);
                                SubLObject sentence1 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.temporal_object_equal(interval0, interval1)) && (NIL != com.cyc.cycjava.cycl.hlmt.some_time_sentence_match_p(sentence0, sentence1)));
                            }
                        }
                    } else {
                        return NIL;
                    }
                }
            }
        }
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

    /**
     *
     *
     * @return booleanp; Whether OBJECT1 and OBJECT2 are equal temporal objects
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT1 and OBJECT2 are equal temporal objects")
    public static final SubLObject temporal_object_equal_alt(SubLObject object0, SubLObject object1) {
        return equal(object0, object1);
    }

    /**
     *
     *
     * @return booleanp; Whether OBJECT1 and OBJECT2 are equal temporal objects
     */
    @LispMethod(comment = "@return booleanp; Whether OBJECT1 and OBJECT2 are equal temporal objects")
    public static SubLObject temporal_object_equal(final SubLObject object0, final SubLObject object1) {
        return equal(object0, object1);
    }

    public static final SubLObject time_parameter_equal_alt(SubLObject object0, SubLObject object1) {
        return equal(object0, object1);
    }

    public static SubLObject time_parameter_equal(final SubLObject object0, final SubLObject object1) {
        return equal(object0, object1);
    }

    public static final SubLObject hlmt_times_equal_p_alt(SubLObject hlmt0, SubLObject hlmt1) {
        return com.cyc.cycjava.cycl.hlmt.equal_mt_times_p(com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(hlmt0), com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(hlmt1));
    }

    public static SubLObject hlmt_times_equal_p(final SubLObject hlmt0, final SubLObject hlmt1) {
        return equal_mt_times_p(hlmt_temporal_mt(hlmt0), hlmt_temporal_mt(hlmt1));
    }

    public static final SubLObject some_time_sentence_match_p_alt(SubLObject sent0, SubLObject sent1) {
        {
            SubLObject conjunct0P = el_conjunction_p(sent0);
            SubLObject conjunct1P = el_conjunction_p(sent1);
            if ((NIL != conjunct0P) && (NIL != conjunct1P)) {
                Errors.cerror($str_alt67$Continue_Anyway_, $str_alt68$We_should_never_test_two_some_tim);
                return NIL;
            } else {
                if (NIL != conjunct0P) {
                    return subsetp(sent1, sent0, symbol_function(EQUAL), UNPROVIDED);
                } else {
                    if (NIL != conjunct1P) {
                        return subsetp(sent0, sent1, symbol_function(EQUAL), UNPROVIDED);
                    } else {
                        return equal(sent0, sent1);
                    }
                }
            }
        }
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

    public static final SubLObject hlmt_temporal_mt_alt(SubLObject v_hlmt) {
        return com.cyc.cycjava.cycl.hlmt.get_hlmt_dimension($TIME, v_hlmt);
    }

    public static SubLObject hlmt_temporal_mt(final SubLObject v_hlmt) {
        return get_hlmt_dimension($TIME, v_hlmt);
    }

    public static final SubLObject extract_hlmt_temporal_index_alt(SubLObject v_hlmt) {
        return cycl_utilities.nat_arg1(com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt), UNPROVIDED);
    }

    public static SubLObject extract_hlmt_temporal_index(final SubLObject v_hlmt) {
        return cycl_utilities.nat_arg1(hlmt_temporal_mt(v_hlmt), UNPROVIDED);
    }

    public static final SubLObject extract_hlmt_temporal_index_or_default_alt(SubLObject v_hlmt) {
        {
            SubLObject time_interval = cycl_utilities.nat_arg1(com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt), UNPROVIDED);
            return NIL != time_interval ? ((SubLObject) (time_interval)) : $default_mt_time_interval$.getGlobalValue();
        }
    }

    public static SubLObject extract_hlmt_temporal_index_or_default(final SubLObject v_hlmt) {
        final SubLObject time_interval = cycl_utilities.nat_arg1(hlmt_temporal_mt(v_hlmt), UNPROVIDED);
        return NIL != time_interval ? time_interval : $default_mt_time_interval$.getGlobalValue();
    }

    public static final SubLObject extract_hlmt_time_parameter_alt(SubLObject v_hlmt) {
        {
            SubLObject time_parameter = cycl_utilities.nat_arg2(com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt), UNPROVIDED);
            return NIL != com.cyc.cycjava.cycl.hlmt.atemporal_hlmtP(v_hlmt) ? ((SubLObject) (NIL != time_parameter ? ((SubLObject) (time_parameter)) : $default_atemporal_genlmt_time_parameter$.getGlobalValue())) : NIL != time_parameter ? ((SubLObject) (time_parameter)) : $default_mt_time_parameter$.getGlobalValue();
        }
    }

    public static SubLObject extract_hlmt_time_parameter(final SubLObject v_hlmt) {
        final SubLObject time_parameter = cycl_utilities.nat_arg2(hlmt_temporal_mt(v_hlmt), UNPROVIDED);
        return NIL != atemporal_hlmtP(v_hlmt) ? NIL != time_parameter ? time_parameter : $default_atemporal_genlmt_time_parameter$.getGlobalValue() : NIL != time_parameter ? time_parameter : $default_mt_time_parameter$.getGlobalValue();
    }

    /**
     * Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT
     *
     * @param HLMT
    temporal-dimension-mt-p.
     * 		
     */
    @LispMethod(comment = "Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT\r\n\r\n@param HLMT\ntemporal-dimension-mt-p.")
    public static final SubLObject destructure_mt_time_dim_nat_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject temporal_object = NIL;
                    SubLObject time_parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    temporal_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    time_parameter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_hlmt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt69);
                            v_hlmt = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), list(MT_TIME_DIM_NAT_TEMPORAL_VALUES, v_hlmt)), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT\r\n\r\n@param HLMT\n\t\ttemporal-dimension-mt-p.")
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
    }/**
     * Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT
     *
     * @param HLMT
    		temporal-dimension-mt-p.
     * 		
     */


    /**
     *
     *
     * @param DIM-NAT
    temporal-dimension-mt-p
     * 		
     */
    @LispMethod(comment = "@param DIM-NAT\ntemporal-dimension-mt-p")
    public static final SubLObject mt_time_dim_nat_temporal_values_alt(SubLObject dim_nat) {
        if (NIL == dim_nat) {
            return values(NIL, NIL);
        }
        {
            SubLObject functor = cycl_utilities.naut_functor(dim_nat);
            SubLObject pcase_var = functor;
            if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
                return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, UNPROVIDED));
            } else {
                if (pcase_var.eql($$MtTimeDimFn)) {
                    return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), $$Null_TimeParameter);
                } else {
                    Errors.cerror($str_alt67$Continue_Anyway_, $str_alt72$DIM_NAT__a_is_not_a_microtheory_t, dim_nat);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param DIM-NAT
    temporal-dimension-mt-p
     * 		
     */
    @LispMethod(comment = "@param DIM-NAT\ntemporal-dimension-mt-p")
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

    /**
     * Returns the interval and sentence for the indeterminate time nat DIM-NAT.
     *
     * @param DIM-NAT
    temporal-dimension-mt-p
     * 		
     */
    @LispMethod(comment = "Returns the interval and sentence for the indeterminate time nat DIM-NAT.\r\n\r\n@param DIM-NAT\ntemporal-dimension-mt-p")
    public static final SubLObject explode_indeterminate_time_dim_nat_alt(SubLObject dim_nat) {
        return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, UNPROVIDED));
    }

    @LispMethod(comment = "Returns the interval and sentence for the indeterminate time nat DIM-NAT.\r\n\r\n@param DIM-NAT\n\t\ttemporal-dimension-mt-p")
    public static SubLObject explode_indeterminate_time_dim_nat(final SubLObject dim_nat) {
        return values(cycl_utilities.nat_arg1(dim_nat, UNPROVIDED), cycl_utilities.nat_arg2(dim_nat, UNPROVIDED));
    }/**
     * Returns the interval and sentence for the indeterminate time nat DIM-NAT.
     *
     * @param DIM-NAT
    		temporal-dimension-mt-p
     * 		
     */


    public static final SubLObject anytime_during_psc_fn_time_interval_alt(SubLObject anytime_during_psc_naut) {
        return cycl_utilities.naut_arg1(anytime_during_psc_naut, UNPROVIDED);
    }

    public static SubLObject anytime_during_psc_fn_time_interval(final SubLObject anytime_during_psc_naut) {
        return cycl_utilities.naut_arg1(anytime_during_psc_naut, UNPROVIDED);
    }

    public static final SubLObject explode_hlmt_temporal_facets_alt(SubLObject v_hlmt, SubLObject default_interval, SubLObject default_parameter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_mt = com.cyc.cycjava.cycl.hlmt.hlmt_temporal_mt(v_hlmt);
                if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(time_mt)) {
                    return values(NIL, NIL);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(time_mt)) {
                        return values(NIL, NIL);
                    } else {
                        {
                            SubLObject temporal_object = NIL;
                            SubLObject time_parameter = NIL;
                            thread.resetMultipleValues();
                            {
                                SubLObject temporal_object_3 = com.cyc.cycjava.cycl.hlmt.mt_time_dim_nat_temporal_values(time_mt);
                                SubLObject time_parameter_4 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                temporal_object = temporal_object_3;
                                time_parameter = time_parameter_4;
                            }
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
                    }
                }
            }
        }
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

    public static final SubLObject explode_hlmt_temporal_facets_with_defaults_alt(SubLObject v_hlmt) {
        return com.cyc.cycjava.cycl.hlmt.explode_hlmt_temporal_facets(v_hlmt, $default_mt_time_interval$.getGlobalValue(), $default_mt_time_parameter$.getGlobalValue());
    }

    public static SubLObject explode_hlmt_temporal_facets_with_defaults(final SubLObject v_hlmt) {
        return explode_hlmt_temporal_facets(v_hlmt, $default_mt_time_interval$.getGlobalValue(), $default_mt_time_parameter$.getGlobalValue());
    }

    public static final SubLObject explode_genlmt_temporal_facets_based_on_temporality_alt(SubLObject v_hlmt, SubLObject atemporalP) {
        if (NIL != atemporalP) {
            return com.cyc.cycjava.cycl.hlmt.explode_hlmt_temporal_facets(v_hlmt, $default_mt_time_interval$.getGlobalValue(), $default_atemporal_genlmt_time_parameter$.getGlobalValue());
        } else {
            return com.cyc.cycjava.cycl.hlmt.explode_hlmt_temporal_facets_with_defaults(v_hlmt);
        }
    }

    public static SubLObject explode_genlmt_temporal_facets_based_on_temporality(final SubLObject v_hlmt, final SubLObject atemporalP) {
        if (NIL != atemporalP) {
            return explode_hlmt_temporal_facets(v_hlmt, $default_mt_time_interval$.getGlobalValue(), $default_atemporal_genlmt_time_parameter$.getGlobalValue());
        }
        return explode_hlmt_temporal_facets_with_defaults(v_hlmt);
    }

    /**
     * Imposes the defaults for HLMT
     */
    @LispMethod(comment = "Imposes the defaults for HLMT")
    public static final SubLObject destructure_monad_and_temporal_facets_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject monad_mt = NIL;
                    SubLObject temporal_object = NIL;
                    SubLObject time_parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    monad_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    temporal_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    time_parameter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_hlmt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt74);
                            v_hlmt = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(list(monad_mt, list(HLMT_MONAD_MT, v_hlmt)), temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), list(EXPLODE_HLMT_TEMPORAL_FACETS_WITH_DEFAULTS, v_hlmt)), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt74);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Imposes the defaults for HLMT")
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
    }/**
     * Imposes the defaults for HLMT
     */


    /**
     *
     *
     * @unknown Binds TEMPORAL-OBJECT and TIME-PARAMETER to NIL if they are not explicit in HLMT
     */
    @LispMethod(comment = "@unknown Binds TEMPORAL-OBJECT and TIME-PARAMETER to NIL if they are not explicit in HLMT")
    public static final SubLObject destructure_monad_and_temporal_facets_without_defaults_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject monad_mt = NIL;
                    SubLObject temporal_object = NIL;
                    SubLObject time_parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    monad_mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    temporal_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    time_parameter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_hlmt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt74);
                            v_hlmt = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(list(monad_mt, list(HLMT_MONAD_MT_WITHOUT_DEFAULT, v_hlmt)), temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), listS(EXPLODE_HLMT_TEMPORAL_FACETS, v_hlmt, $list_alt78)), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt74);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown Binds TEMPORAL-OBJECT and TIME-PARAMETER to NIL if they are not explicit in HLMT
     */
    @LispMethod(comment = "@unknown Binds TEMPORAL-OBJECT and TIME-PARAMETER to NIL if they are not explicit in HLMT")
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

    /**
     * Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT, to either what they are stated in the hlmt or to the default values expressed for HLMT's monad mt.
     */
    @LispMethod(comment = "Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT, to either what they are stated in the hlmt or to the default values expressed for HLMT\'s monad mt.")
    public static final SubLObject destructure_temporal_mt_temporal_facets_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject temporal_object = NIL;
                    SubLObject time_parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    temporal_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    time_parameter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_hlmt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt69);
                            v_hlmt = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return listS(CLET, list(temporal_object, time_parameter), list(CMULTIPLE_VALUE_SETQ, list(temporal_object, time_parameter), listS(EXPLODE_HLMT_TEMPORAL_FACETS, v_hlmt, $list_alt79)), append(body, NIL));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT, to either what they are stated in the hlmt or to the default values expressed for HLMT\'s monad mt.")
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
    }/**
     * Binds the TEMPORAL-OBJECT and TIME-PARAMETER of HLMT, to either what they are stated in the hlmt or to the default values expressed for HLMT's monad mt.
     */


    public static final SubLObject destructure_atemporal_genlmt_temporal_facets_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject temporal_object = NIL;
                    SubLObject time_parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    temporal_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    time_parameter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_hlmt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt69);
                            v_hlmt = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return list(PROGN, list(IGNORE, v_hlmt), listS(CLET, list(bq_cons(temporal_object, $list_alt82), bq_cons(time_parameter, $list_alt83)), append(body, NIL)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
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

    public static final SubLObject destructure_atemporal_specmt_temporal_facets_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt69);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject temporal_object = NIL;
                    SubLObject time_parameter = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    temporal_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt69);
                    time_parameter = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject v_hlmt = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt69);
                            v_hlmt = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                return list(PROGN, list(IGNORE, v_hlmt), listS(CLET, list(bq_cons(temporal_object, $list_alt82), bq_cons(time_parameter, $list_alt84)), append(body, NIL)));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt69);
                    }
                }
            }
        }
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

    public static final SubLObject new_time_dimension_alt(SubLObject temporal_object, SubLObject time_parameter) {
        if (time_parameter == UNPROVIDED) {
            time_parameter = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_psc_p(temporal_object)) {
            return temporal_object;
        } else {
            if (NIL != com.cyc.cycjava.cycl.hlmt.anytime_during_psc_fn_naut_p(temporal_object)) {
                return temporal_object;
            } else {
                if (NIL != time_parameter) {
                    return list($$MtTimeWithGranularityDimFn, temporal_object, time_parameter);
                } else {
                    return list($$MtTimeDimFn, temporal_object);
                }
            }
        }
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

    public static final SubLObject new_temporal_hlmt_alt(SubLObject monad_mt, SubLObject temporal_object, SubLObject time_parameter) {
        return com.cyc.cycjava.cycl.hlmt.new_hlmt(list(monad_mt, com.cyc.cycjava.cycl.hlmt.new_time_dimension(temporal_object, time_parameter)));
    }

    public static SubLObject new_temporal_hlmt(final SubLObject monad_mt, final SubLObject temporal_object, final SubLObject time_parameter) {
        return new_hlmt(list(monad_mt, new_time_dimension(temporal_object, time_parameter)));
    }

    public static final SubLObject new_canonicalized_temporal_hlmt_alt(SubLObject monad_mt, SubLObject time_mt) {
        return hlmt_czer.canonicalize_hlmt(com.cyc.cycjava.cycl.hlmt.new_hlmt(list(monad_mt, time_mt)));
    }

    public static SubLObject new_canonicalized_temporal_hlmt(final SubLObject monad_mt, final SubLObject time_mt) {
        return hlmt_czer.canonicalize_hlmt(new_hlmt(list(monad_mt, time_mt)));
    }

    public static final SubLObject new_default_granularity_hlmt_alt(SubLObject monad_mt, SubLObject temporal_object) {
        return com.cyc.cycjava.cycl.hlmt.new_hlmt(list(monad_mt, com.cyc.cycjava.cycl.hlmt.new_time_dimension(temporal_object, UNPROVIDED)));
    }

    public static SubLObject new_default_granularity_hlmt(final SubLObject monad_mt, final SubLObject temporal_object) {
        return new_hlmt(list(monad_mt, new_time_dimension(temporal_object, UNPROVIDED)));
    }

    public static final SubLObject default_time_mt_alt() {
        return list($$MtTimeDimFn, $default_mt_time_interval$.getGlobalValue());
    }

    public static SubLObject default_time_mt() {
        return list($$MtTimeDimFn, $default_mt_time_interval$.getGlobalValue());
    }

    public static final SubLObject new_temporal_object_default_parameter_mt_alt(SubLObject interval) {
        return list($$MtTimeDimFn, interval);
    }

    public static SubLObject new_temporal_object_default_parameter_mt(final SubLObject interval) {
        return list($$MtTimeDimFn, interval);
    }

    public static final SubLObject possibly_augment_time_mt_alt(SubLObject time_dim_nat) {
        if (NIL != com.cyc.cycjava.cycl.hlmt.time_mt_with_implicit_parameter_p(time_dim_nat)) {
            return com.cyc.cycjava.cycl.hlmt.add_default_parameter_to_time_nat(time_dim_nat);
        } else {
            return time_dim_nat;
        }
    }

    public static SubLObject possibly_augment_time_mt(final SubLObject time_dim_nat) {
        if (NIL != time_mt_with_implicit_parameter_p(time_dim_nat)) {
            return add_default_parameter_to_time_nat(time_dim_nat);
        }
        return time_dim_nat;
    }

    public static final SubLObject possibly_reduce_time_mt_alt(SubLObject time_dim_nat) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.hlmt.time_mt_with_explicit_parameter_p(time_dim_nat)) {
                {
                    SubLObject interval = NIL;
                    SubLObject parameter = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject interval_5 = com.cyc.cycjava.cycl.hlmt.mt_time_dim_nat_temporal_values(time_dim_nat);
                        SubLObject parameter_6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        interval = interval_5;
                        parameter = parameter_6;
                    }
                    if (NIL != com.cyc.cycjava.cycl.hlmt.default_mt_time_parameter_p(parameter)) {
                        return com.cyc.cycjava.cycl.hlmt.new_temporal_object_default_parameter_mt(interval);
                    }
                }
            }
            return time_dim_nat;
        }
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

    public static final SubLObject add_default_parameter_to_time_nat_alt(SubLObject dim_nat) {
        {
            SubLObject interval = cycl_utilities.nat_arg1(dim_nat, UNPROVIDED);
            return list($$MtTimeWithGranularityDimFn, interval, $default_mt_time_parameter$.getGlobalValue());
        }
    }

    public static SubLObject add_default_parameter_to_time_nat(final SubLObject dim_nat) {
        final SubLObject interval = cycl_utilities.nat_arg1(dim_nat, UNPROVIDED);
        return list($$MtTimeWithGranularityDimFn, interval, $default_mt_time_parameter$.getGlobalValue());
    }

    public static final SubLObject valid_temporal_mt_slice_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.hlmt.temporal_dimension_mt_p(v_object)) {
                {
                    SubLObject functor = cycl_utilities.naut_functor(v_object);
                    SubLObject interval = NIL;
                    SubLObject parameter = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject interval_7 = com.cyc.cycjava.cycl.hlmt.mt_time_dim_nat_temporal_values(v_object);
                        SubLObject parameter_8 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        interval = interval_7;
                        parameter = parameter_8;
                    }
                    {
                        SubLObject pcase_var = functor;
                        if (pcase_var.eql($$MtTimeDimFn)) {
                            return com.cyc.cycjava.cycl.hlmt.valid_temporal_object_p(interval);
                        } else {
                            if (pcase_var.eql($$MtTimeWithGranularityDimFn)) {
                                return makeBoolean((NIL != com.cyc.cycjava.cycl.hlmt.valid_temporal_object_p(interval)) && (NIL != com.cyc.cycjava.cycl.hlmt.valid_time_parameter_p(parameter)));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject valid_temporal_object_p_alt(SubLObject temporal_object) {
        return makeBoolean((NIL == temporal_object) || (NIL != isa.isa_in_any_mtP(temporal_object, $$TemporalThing)));
    }

    public static SubLObject valid_temporal_object_p(final SubLObject temporal_object) {
        return makeBoolean((NIL == temporal_object) || (NIL != isa.isa_in_any_mtP(temporal_object, $$TemporalThing)));
    }

    public static final SubLObject valid_time_parameter_p_alt(SubLObject time_parameter) {
        return makeBoolean((NIL == time_parameter) || (NIL != isa.isa_in_any_mtP(time_parameter, $$TimeParameter)));
    }

    public static SubLObject valid_time_parameter_p(final SubLObject time_parameter) {
        return makeBoolean((NIL == time_parameter) || (NIL != isa.isa_in_any_mtP(time_parameter, $$TimeParameter)));
    }

    public static final SubLObject valid_mt_time_with_granularity_dim_arglistP_alt(SubLObject args) {
        return makeBoolean(((NIL != list_utilities.lengthE(args, TWO_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.hlmt.valid_temporal_object_p(args.first()))) && (NIL != com.cyc.cycjava.cycl.hlmt.valid_time_parameter_p(second(args))));
    }

    public static SubLObject valid_mt_time_with_granularity_dim_arglistP(final SubLObject args) {
        return makeBoolean(((NIL != list_utilities.lengthE(args, TWO_INTEGER, UNPROVIDED)) && (NIL != valid_temporal_object_p(args.first()))) && (NIL != valid_time_parameter_p(second(args))));
    }

    public static final SubLObject valid_mt_time_dim_arglistP_alt(SubLObject args) {
        return makeBoolean((NIL != list_utilities.lengthE(args, ONE_INTEGER, UNPROVIDED)) && (NIL != com.cyc.cycjava.cycl.hlmt.valid_temporal_object_p(args.first())));
    }

    public static SubLObject valid_mt_time_dim_arglistP(final SubLObject args) {
        return makeBoolean((NIL != list_utilities.lengthE(args, ONE_INTEGER, UNPROVIDED)) && (NIL != valid_temporal_object_p(args.first())));
    }

    public static final SubLObject relevant_mt_with_inference_relevance_alt(SubLObject test_mt, SubLObject inference_mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inference_mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = mt_relevance_macros.relevant_mtP(test_mt);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
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

    public static final SubLObject declare_hlmt_file_alt() {
        declareFunction("hlmts_supportedP", "HLMTS-SUPPORTED?", 0, 0, false);
        declareMacro("with_hlmts", "WITH-HLMTS");
        declareFunction("enable_hlmts", "ENABLE-HLMTS", 0, 0, false);
        declareFunction("disable_hlmts", "DISABLE-HLMTS", 0, 0, false);
        declareFunction("unindexed_hlmt_syntax_constants", "UNINDEXED-HLMT-SYNTAX-CONSTANTS", 0, 0, false);
        declareFunction("unindexed_hlmt_syntax_constant_p", "UNINDEXED-HLMT-SYNTAX-CONSTANT-P", 1, 0, false);
        declareFunction("fully_indexed_hlmt_term_p", "FULLY-INDEXED-HLMT-TERM-P", 1, 0, false);
        declareFunction("mt_space_function_p", "MT-SPACE-FUNCTION-P", 1, 0, false);
        declareFunction("possibly_mt_p", "POSSIBLY-MT-P", 1, 0, false);
        declareFunction("possibly_hlmt_p", "POSSIBLY-HLMT-P", 1, 0, false);
        declareFunction("fort_or_chlmt_p", "FORT-OR-CHLMT-P", 1, 0, false);
        declareFunction("chlmt_p", "CHLMT-P", 1, 0, false);
        declareFunction("closed_hlmt_p", "CLOSED-HLMT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$closed_hlmt_p$UnaryFunction();
        declareFunction("closed_possibly_hlmt_p", "CLOSED-POSSIBLY-HLMT-P", 1, 0, false);
        declareFunction("hlmt_p", "HLMT-P", 1, 0, false);
        declareFunction("hlmt_p_no_time", "HLMT-P-NO-TIME", 1, 0, false);
        declareFunction("hlmt_p_time", "HLMT-P-TIME", 1, 0, false);
        declareFunction("possibly_hlmt_naut_p", "POSSIBLY-HLMT-NAUT-P", 1, 0, false);
        declareFunction("hlmt_naut_p", "HLMT-NAUT-P", 1, 0, false);
        declareFunction("mt_space_naut_p", "MT-SPACE-NAUT-P", 1, 0, false);
        declareFunction("mt_space_naut_arglist_p", "MT-SPACE-NAUT-ARGLIST-P", 1, 0, false);
        declareFunction("mt_dim_naut_p", "MT-DIM-NAUT-P", 1, 0, false);
        declareFunction("mt_union_naut_p", "MT-UNION-NAUT-P", 1, 0, false);
        declareFunction("mt_union_function_p", "MT-UNION-FUNCTION-P", 1, 0, false);
        declareFunction("hlmtP", "HLMT?", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$hlmtP$UnaryFunction();
        declareFunction("hlmtP_int", "HLMT?-INT", 1, 0, false);
        declareFunction("hlmtP_no_time", "HLMT?-NO-TIME", 1, 0, false);
        declareFunction("hlmtP_time", "HLMT?-TIME", 1, 0, false);
        declareFunction("hlmt_nautP", "HLMT-NAUT?", 1, 0, false);
        declareFunction("mt_space_mtP", "MT-SPACE-MT?", 1, 0, false);
        declareFunction("mt_space_arglistP", "MT-SPACE-ARGLIST?", 1, 0, false);
        declareFunction("mt_dim_mtP", "MT-DIM-MT?", 1, 0, false);
        declareFunction("mt_dim_arglistP", "MT-DIM-ARGLIST?", 2, 0, false);
        declareFunction("mt_union_nautP", "MT-UNION-NAUT?", 1, 0, false);
        declareFunction("mt_union_arglistP", "MT-UNION-ARGLIST?", 1, 0, false);
        declareFunction("hlmt_equal", "HLMT-EQUAL", 2, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$hlmt_equal$BinaryFunction();
        declareFunction("hlmt_equalP", "HLMT-EQUAL?", 2, 0, false);
        declareFunction("new_hlmt", "NEW-HLMT", 1, 0, false);
        declareFunction("copy_hlmt", "COPY-HLMT", 1, 0, false);
        declareFunction("new_anytime_during_psc_naut", "NEW-ANYTIME-DURING-PSC-NAUT", 1, 0, false);
        declareFunction("anytime_psc", "ANYTIME-PSC", 0, 0, false);
        declareFunction("mt_union_mts", "MT-UNION-MTS", 1, 0, false);
        declareFunction("mt_union_mts_recursive", "MT-UNION-MTS-RECURSIVE", 1, 0, false);
        declareFunction("mt_union_mts_recursive_int", "MT-UNION-MTS-RECURSIVE-INT", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$mt_union_mts_recursive_int$UnaryFunction();
        declareFunction("union_mt_relevance_contexts", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
        declareFunction("mt_dimension_type_p", "MT-DIMENSION-TYPE-P", 1, 0, false);
        declareFunction("mt_dimension_types", "MT-DIMENSION-TYPES", 0, 0, false);
        declareFunction("mt_dimension_function_p", "MT-DIMENSION-FUNCTION-P", 1, 0, false);
        declareFunction("context_space_function_p", "CONTEXT-SPACE-FUNCTION-P", 1, 0, false);
        declareFunction("mt_dimension_predicate_p", "MT-DIMENSION-PREDICATE-P", 1, 0, false);
        declareMacro("do_mt_dimensions", "DO-MT-DIMENSIONS");
        declareFunction("mt_dimension_of_arg", "MT-DIMENSION-OF-ARG", 1, 0, false);
        declareFunction("single_dimension_mt_dimension", "SINGLE-DIMENSION-MT-DIMENSION", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$single_dimension_mt_dimension$UnaryFunction();
        declareFunction("mt_dim_nat_dimension", "MT-DIM-NAT-DIMENSION", 1, 0, false);
        declareFunction("get_hlmt_dimension", "GET-HLMT-DIMENSION", 2, 0, false);
        declareFunction("hlmt_dimensions", "HLMT-DIMENSIONS", 1, 0, false);
        declareFunction("remove_hlmt_dimension", "REMOVE-HLMT-DIMENSION", 2, 0, false);
        declareFunction("replace_hlmt_dimension", "REPLACE-HLMT-DIMENSION", 3, 0, false);
        declareFunction("replace_monad_dimension", "REPLACE-MONAD-DIMENSION", 2, 0, false);
        declareFunction("replace_time_dimension", "REPLACE-TIME-DIMENSION", 2, 1, false);
        declareFunction("default_values_for_dimension_p", "DEFAULT-VALUES-FOR-DIMENSION-P", 2, 0, false);
        declareFunction("some_interesting_hlmtP", "SOME-INTERESTING-HLMT?", 1, 0, false);
        declareFunction("interesting_hlmtP", "INTERESTING-HLMT?", 1, 0, false);
        declareFunction("assertion_hlmt", "ASSERTION-HLMT", 1, 0, false);
        declareFunction("hlmt_has_dimension_of_valueP", "HLMT-HAS-DIMENSION-OF-VALUE?", 3, 0, false);
        declareFunction("augment_hlmt", "AUGMENT-HLMT", 1, 0, false);
        declareFunction("reduce_hlmt", "REDUCE-HLMT", 1, 1, false);
        declareFunction("transform_mt_union_nauts", "TRANSFORM-MT-UNION-NAUTS", 2, 0, false);
        declareFunction("reduce_mt_union_hlmt", "REDUCE-MT-UNION-HLMT", 2, 0, false);
        declareFunction("clear_reduce_mt_union_hlmt_int", "CLEAR-REDUCE-MT-UNION-HLMT-INT", 0, 0, false);
        declareFunction("remove_reduce_mt_union_hlmt_int", "REMOVE-REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        declareFunction("reduce_mt_union_hlmt_int_internal", "REDUCE-MT-UNION-HLMT-INT-INTERNAL", 1, 0, false);
        declareFunction("reduce_mt_union_hlmt_int", "REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        declareFunction("new_reduced_hlmt", "NEW-REDUCED-HLMT", 1, 0, false);
        declareFunction("combine_hlmts", "COMBINE-HLMTS", 2, 0, false);
        declareFunction("new_canonicalized_hlmt", "NEW-CANONICALIZED-HLMT", 1, 0, false);
        declareFunction("possibly_augment_dimension", "POSSIBLY-AUGMENT-DIMENSION", 2, 0, false);
        declareFunction("possibly_reduce_dimension", "POSSIBLY-REDUCE-DIMENSION", 2, 0, false);
        declareFunction("default_dimension_mt", "DEFAULT-DIMENSION-MT", 1, 0, false);
        declareFunction("new_hlmt_from_dimension_plist", "NEW-HLMT-FROM-DIMENSION-PLIST", 1, 0, false);
        declareFunction("valid_hlmtP", "VALID-HLMT?", 1, 1, false);
        declareFunction("valid_hlmt_p", "VALID-HLMT-P", 1, 1, false);
        declareFunction("valid_mt_for_dimension_p", "VALID-MT-FOR-DIMENSION-P", 2, 0, false);
        declareFunction("default_monad_mt_p", "DEFAULT-MONAD-MT-P", 1, 0, false);
        declareFunction("monad_dimension_p", "MONAD-DIMENSION-P", 1, 0, false);
        declareFunction("monad_mt_p", "MONAD-MT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$monad_mt_p$UnaryFunction();
        declareFunction("valid_monad_mt_p", "VALID-MONAD-MT-P", 1, 0, false);
        declareFunction("monad_mtP", "MONAD-MT?", 1, 0, false);
        declareFunction("monad_cycl_mtP", "MONAD-CYCL-MT?", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$monad_cycl_mtP$UnaryFunction();
        declareFunction("hlmt_monad_mt", "HLMT-MONAD-MT", 1, 0, false);
        declareFunction("hlmt_monad_mt_without_default", "HLMT-MONAD-MT-WITHOUT-DEFAULT", 1, 0, false);
        declareFunction("assertion_monad_mt", "ASSERTION-MONAD-MT", 1, 0, false);
        declareFunction("equal_mt_monads_p", "EQUAL-MT-MONADS-P", 2, 0, false);
        declareFunction("monad_mt_equal", "MONAD-MT-EQUAL", 2, 0, false);
        declareFunction("temporal_dimension_function_p", "TEMPORAL-DIMENSION-FUNCTION-P", 1, 0, false);
        declareFunction("temporal_dimension_predicate_p", "TEMPORAL-DIMENSION-PREDICATE-P", 1, 0, false);
        declareFunction("default_mt_time_interval_p", "DEFAULT-MT-TIME-INTERVAL-P", 1, 0, false);
        declareFunction("default_mt_time_parameter_p", "DEFAULT-MT-TIME-PARAMETER-P", 1, 0, false);
        declareFunction("default_time_mt_p", "DEFAULT-TIME-MT-P", 1, 0, false);
        declareFunction("mt_time_dim_naut_p", "MT-TIME-DIM-NAUT-P", 1, 0, false);
        declareFunction("anytime_psc_p", "ANYTIME-PSC-P", 1, 0, false);
        declareFunction("anytime_during_psc_fn_p", "ANYTIME-DURING-PSC-FN-P", 1, 0, false);
        declareFunction("anytime_during_psc_fn_naut_p", "ANYTIME-DURING-PSC-FN-NAUT-P", 1, 0, false);
        declareFunction("anytime_psc_hlmtP", "ANYTIME-PSC-HLMT?", 1, 0, false);
        declareFunction("anytime_during_psc_hlmtP", "ANYTIME-DURING-PSC-HLMT?", 1, 0, false);
        declareFunction("temporal_hlmt_p", "TEMPORAL-HLMT-P", 1, 0, false);
        declareFunction("atemporal_hlmtP", "ATEMPORAL-HLMT?", 1, 0, false);
        declareFunction("temporal_dimension_mt_p", "TEMPORAL-DIMENSION-MT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.hlmt.$temporal_dimension_mt_p$UnaryFunction();
        declareFunction("time_dimension_p", "TIME-DIMENSION-P", 1, 0, false);
        declareFunction("time_intervalP", "TIME-INTERVAL?", 1, 0, false);
        declareFunction("temporal_objectP", "TEMPORAL-OBJECT?", 1, 0, false);
        declareFunction("time_parameterP", "TIME-PARAMETER?", 1, 0, false);
        declareFunction("time_mt_with_implicit_parameter_p", "TIME-MT-WITH-IMPLICIT-PARAMETER-P", 1, 0, false);
        declareFunction("time_mt_with_explicit_parameter_p", "TIME-MT-WITH-EXPLICIT-PARAMETER-P", 1, 0, false);
        declareFunction("time_mt_with_indeterminate_time_p", "TIME-MT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        declareFunction("some_time_in_interval_naut_p", "SOME-TIME-IN-INTERVAL-NAUT-P", 1, 0, false);
        declareFunction("indeterminate_time_interval_p", "INDETERMINATE-TIME-INTERVAL-P", 1, 0, false);
        declareFunction("hlmt_with_indeterminate_time_p", "HLMT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        declareFunction("hlmt_with_anytime_psc_p", "HLMT-WITH-ANYTIME-PSC-P", 1, 0, false);
        declareFunction("equal_mt_times_p", "EQUAL-MT-TIMES-P", 2, 0, false);
        declareFunction("temporal_object_equal", "TEMPORAL-OBJECT-EQUAL", 2, 0, false);
        declareFunction("time_parameter_equal", "TIME-PARAMETER-EQUAL", 2, 0, false);
        declareFunction("hlmt_times_equal_p", "HLMT-TIMES-EQUAL-P", 2, 0, false);
        declareFunction("some_time_sentence_match_p", "SOME-TIME-SENTENCE-MATCH-P", 2, 0, false);
        declareFunction("hlmt_temporal_mt", "HLMT-TEMPORAL-MT", 1, 0, false);
        declareFunction("extract_hlmt_temporal_index", "EXTRACT-HLMT-TEMPORAL-INDEX", 1, 0, false);
        declareFunction("extract_hlmt_temporal_index_or_default", "EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT", 1, 0, false);
        declareFunction("extract_hlmt_time_parameter", "EXTRACT-HLMT-TIME-PARAMETER", 1, 0, false);
        declareMacro("destructure_mt_time_dim_nat", "DESTRUCTURE-MT-TIME-DIM-NAT");
        declareFunction("mt_time_dim_nat_temporal_values", "MT-TIME-DIM-NAT-TEMPORAL-VALUES", 1, 0, false);
        declareFunction("explode_indeterminate_time_dim_nat", "EXPLODE-INDETERMINATE-TIME-DIM-NAT", 1, 0, false);
        declareFunction("anytime_during_psc_fn_time_interval", "ANYTIME-DURING-PSC-FN-TIME-INTERVAL", 1, 0, false);
        declareFunction("explode_hlmt_temporal_facets", "EXPLODE-HLMT-TEMPORAL-FACETS", 3, 0, false);
        declareFunction("explode_hlmt_temporal_facets_with_defaults", "EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS", 1, 0, false);
        declareFunction("explode_genlmt_temporal_facets_based_on_temporality", "EXPLODE-GENLMT-TEMPORAL-FACETS-BASED-ON-TEMPORALITY", 2, 0, false);
        declareMacro("destructure_monad_and_temporal_facets", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS");
        declareMacro("destructure_monad_and_temporal_facets_without_defaults", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS-WITHOUT-DEFAULTS");
        declareMacro("destructure_temporal_mt_temporal_facets", "DESTRUCTURE-TEMPORAL-MT-TEMPORAL-FACETS");
        declareMacro("destructure_atemporal_genlmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-GENLMT-TEMPORAL-FACETS");
        declareMacro("destructure_atemporal_specmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-SPECMT-TEMPORAL-FACETS");
        declareFunction("new_time_dimension", "NEW-TIME-DIMENSION", 1, 1, false);
        declareFunction("new_temporal_hlmt", "NEW-TEMPORAL-HLMT", 3, 0, false);
        declareFunction("new_canonicalized_temporal_hlmt", "NEW-CANONICALIZED-TEMPORAL-HLMT", 2, 0, false);
        declareFunction("new_default_granularity_hlmt", "NEW-DEFAULT-GRANULARITY-HLMT", 2, 0, false);
        declareFunction("default_time_mt", "DEFAULT-TIME-MT", 0, 0, false);
        declareFunction("new_temporal_object_default_parameter_mt", "NEW-TEMPORAL-OBJECT-DEFAULT-PARAMETER-MT", 1, 0, false);
        declareFunction("possibly_augment_time_mt", "POSSIBLY-AUGMENT-TIME-MT", 1, 0, false);
        declareFunction("possibly_reduce_time_mt", "POSSIBLY-REDUCE-TIME-MT", 1, 0, false);
        declareFunction("add_default_parameter_to_time_nat", "ADD-DEFAULT-PARAMETER-TO-TIME-NAT", 1, 0, false);
        declareFunction("valid_temporal_mt_slice_p", "VALID-TEMPORAL-MT-SLICE-P", 1, 0, false);
        declareFunction("valid_temporal_object_p", "VALID-TEMPORAL-OBJECT-P", 1, 0, false);
        declareFunction("valid_time_parameter_p", "VALID-TIME-PARAMETER-P", 1, 0, false);
        declareFunction("valid_mt_time_with_granularity_dim_arglistP", "VALID-MT-TIME-WITH-GRANULARITY-DIM-ARGLIST?", 1, 0, false);
        declareFunction("valid_mt_time_dim_arglistP", "VALID-MT-TIME-DIM-ARGLIST?", 1, 0, false);
        declareFunction("subloop_reserved_initialize_replace_hlmt_class", "SUBLOOP-RESERVED-INITIALIZE-REPLACE-HLMT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_replace_hlmt_instance", "SUBLOOP-RESERVED-INITIALIZE-REPLACE-HLMT-INSTANCE", 1, 0, false);
        declareFunction("replace_hlmt_p", "REPLACE-HLMT-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_combine_hlmts_class", "SUBLOOP-RESERVED-INITIALIZE-COMBINE-HLMTS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_combine_hlmts_instance", "SUBLOOP-RESERVED-INITIALIZE-COMBINE-HLMTS-INSTANCE", 1, 0, false);
        declareFunction("combine_hlmts_p", "COMBINE-HLMTS-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_mt_union_class", "SUBLOOP-RESERVED-INITIALIZE-MT-UNION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_mt_union_instance", "SUBLOOP-RESERVED-INITIALIZE-MT-UNION-INSTANCE", 1, 0, false);
        declareFunction("mt_union_p", "MT-UNION-P", 1, 0, false);
        declareFunction("relevant_mt_with_inference_relevance", "RELEVANT-MT-WITH-INFERENCE-RELEVANCE", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_hlmt_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("hlmts_supportedP", "HLMTS-SUPPORTED?", 0, 0, false);
            declareMacro("with_hlmts", "WITH-HLMTS");
            declareFunction("enable_hlmts", "ENABLE-HLMTS", 0, 0, false);
            declareFunction("disable_hlmts", "DISABLE-HLMTS", 0, 0, false);
            declareFunction("unindexed_hlmt_syntax_constants", "UNINDEXED-HLMT-SYNTAX-CONSTANTS", 0, 0, false);
            declareFunction("unindexed_hlmt_syntax_constant_p", "UNINDEXED-HLMT-SYNTAX-CONSTANT-P", 1, 0, false);
            declareFunction("fully_indexed_hlmt_term_p", "FULLY-INDEXED-HLMT-TERM-P", 1, 0, false);
            declareFunction("mt_space_function_p", "MT-SPACE-FUNCTION-P", 1, 0, false);
            declareFunction("possibly_mt_p", "POSSIBLY-MT-P", 1, 0, false);
            declareFunction("possibly_hlmt_p", "POSSIBLY-HLMT-P", 1, 0, false);
            declareFunction("fort_or_chlmt_p", "FORT-OR-CHLMT-P", 1, 0, false);
            declareFunction("chlmt_p", "CHLMT-P", 1, 0, false);
            declareFunction("closed_hlmt_p", "CLOSED-HLMT-P", 1, 0, false);
            new hlmt.$closed_hlmt_p$UnaryFunction();
            declareFunction("closed_possibly_hlmt_p", "CLOSED-POSSIBLY-HLMT-P", 1, 0, false);
            declareFunction("hlmt_p", "HLMT-P", 1, 0, false);
            declareFunction("hlmt_p_no_time", "HLMT-P-NO-TIME", 1, 0, false);
            declareFunction("hlmt_p_time", "HLMT-P-TIME", 1, 0, false);
            declareFunction("possibly_hlmt_naut_p", "POSSIBLY-HLMT-NAUT-P", 1, 0, false);
            declareFunction("hlmt_naut_p", "HLMT-NAUT-P", 1, 0, false);
            declareFunction("mt_space_naut_p", "MT-SPACE-NAUT-P", 1, 0, false);
            declareFunction("mt_space_naut_arglist_p", "MT-SPACE-NAUT-ARGLIST-P", 1, 0, false);
            declareFunction("mt_dim_naut_p", "MT-DIM-NAUT-P", 1, 0, false);
            declareFunction("mt_union_naut_p", "MT-UNION-NAUT-P", 1, 0, false);
            declareFunction("mt_union_function_p", "MT-UNION-FUNCTION-P", 1, 0, false);
            declareFunction("hlmtP", "HLMT?", 1, 0, false);
            new hlmt.$hlmtP$UnaryFunction();
            declareFunction("hlmtP_int", "HLMT?-INT", 1, 0, false);
            declareFunction("hlmtP_no_time", "HLMT?-NO-TIME", 1, 0, false);
            declareFunction("hlmtP_time", "HLMT?-TIME", 1, 0, false);
            declareFunction("hlmt_nautP", "HLMT-NAUT?", 1, 0, false);
            declareFunction("mt_space_mtP", "MT-SPACE-MT?", 1, 0, false);
            declareFunction("mt_space_arglistP", "MT-SPACE-ARGLIST?", 1, 0, false);
            declareFunction("mt_dim_mtP", "MT-DIM-MT?", 1, 0, false);
            declareFunction("mt_dim_arglistP", "MT-DIM-ARGLIST?", 2, 0, false);
            declareFunction("mt_union_nautP", "MT-UNION-NAUT?", 1, 0, false);
            declareFunction("mt_union_arglistP", "MT-UNION-ARGLIST?", 1, 0, false);
            declareFunction("hlmt_equal", "HLMT-EQUAL", 2, 0, false);
            new hlmt.$hlmt_equal$BinaryFunction();
            declareFunction("hlmt_equalP", "HLMT-EQUAL?", 2, 0, false);
            declareFunction("new_hlmt", "NEW-HLMT", 1, 0, false);
            declareFunction("copy_hlmt", "COPY-HLMT", 1, 0, false);
            declareFunction("new_anytime_during_psc_naut", "NEW-ANYTIME-DURING-PSC-NAUT", 1, 0, false);
            declareFunction("anytime_psc", "ANYTIME-PSC", 0, 0, false);
            declareFunction("mt_union_mts", "MT-UNION-MTS", 1, 0, false);
            declareFunction("mt_union_mts_recursive", "MT-UNION-MTS-RECURSIVE", 1, 0, false);
            declareFunction("mt_union_mts_recursive_int", "MT-UNION-MTS-RECURSIVE-INT", 1, 0, false);
            new hlmt.$mt_union_mts_recursive_int$UnaryFunction();
            declareFunction("union_mt_relevance_contexts", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
            declareFunction("mt_dimension_type_p", "MT-DIMENSION-TYPE-P", 1, 0, false);
            declareFunction("mt_dimension_types", "MT-DIMENSION-TYPES", 0, 0, false);
            declareFunction("mt_dimension_function_p", "MT-DIMENSION-FUNCTION-P", 1, 0, false);
            declareFunction("context_space_function_p", "CONTEXT-SPACE-FUNCTION-P", 1, 0, false);
            declareFunction("mt_dimension_predicate_p", "MT-DIMENSION-PREDICATE-P", 1, 0, false);
            declareMacro("do_mt_dimensions", "DO-MT-DIMENSIONS");
            declareFunction("mt_dimension_of_arg", "MT-DIMENSION-OF-ARG", 1, 0, false);
            declareFunction("single_dimension_mt_dimension", "SINGLE-DIMENSION-MT-DIMENSION", 1, 0, false);
            new hlmt.$single_dimension_mt_dimension$UnaryFunction();
            declareFunction("mt_dim_nat_dimension", "MT-DIM-NAT-DIMENSION", 1, 0, false);
            declareFunction("get_hlmt_dimension", "GET-HLMT-DIMENSION", 2, 0, false);
            declareFunction("hlmt_dimensions", "HLMT-DIMENSIONS", 1, 0, false);
            declareFunction("remove_hlmt_dimension", "REMOVE-HLMT-DIMENSION", 2, 0, false);
            declareFunction("replace_hlmt_dimension", "REPLACE-HLMT-DIMENSION", 3, 0, false);
            declareFunction("replace_monad_dimension", "REPLACE-MONAD-DIMENSION", 2, 0, false);
            declareFunction("replace_time_dimension", "REPLACE-TIME-DIMENSION", 2, 1, false);
            declareFunction("default_values_for_dimension_p", "DEFAULT-VALUES-FOR-DIMENSION-P", 2, 0, false);
            declareFunction("some_interesting_hlmtP", "SOME-INTERESTING-HLMT?", 1, 0, false);
            declareFunction("interesting_hlmtP", "INTERESTING-HLMT?", 1, 0, false);
            declareFunction("assertion_hlmt", "ASSERTION-HLMT", 1, 0, false);
            declareFunction("hlmt_has_dimension_of_valueP", "HLMT-HAS-DIMENSION-OF-VALUE?", 3, 0, false);
            declareFunction("augment_hlmt", "AUGMENT-HLMT", 1, 0, false);
            declareFunction("reduce_hlmt", "REDUCE-HLMT", 1, 1, false);
            declareFunction("transform_mt_union_nauts", "TRANSFORM-MT-UNION-NAUTS", 2, 0, false);
            declareFunction("reduce_mt_union_hlmt", "REDUCE-MT-UNION-HLMT", 2, 0, false);
            declareFunction("clear_reduce_mt_union_hlmt_int", "CLEAR-REDUCE-MT-UNION-HLMT-INT", 0, 0, false);
            declareFunction("remove_reduce_mt_union_hlmt_int", "REMOVE-REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
            declareFunction("reduce_mt_union_hlmt_int_internal", "REDUCE-MT-UNION-HLMT-INT-INTERNAL", 1, 0, false);
            declareFunction("reduce_mt_union_hlmt_int", "REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
            declareFunction("new_reduced_hlmt", "NEW-REDUCED-HLMT", 1, 0, false);
            declareFunction("combine_hlmts", "COMBINE-HLMTS", 2, 0, false);
            declareFunction("new_canonicalized_hlmt", "NEW-CANONICALIZED-HLMT", 1, 0, false);
            declareFunction("possibly_augment_dimension", "POSSIBLY-AUGMENT-DIMENSION", 2, 0, false);
            declareFunction("possibly_reduce_dimension", "POSSIBLY-REDUCE-DIMENSION", 2, 0, false);
            declareFunction("default_dimension_mt", "DEFAULT-DIMENSION-MT", 1, 0, false);
            declareFunction("new_hlmt_from_dimension_plist", "NEW-HLMT-FROM-DIMENSION-PLIST", 1, 0, false);
            declareFunction("valid_hlmtP", "VALID-HLMT?", 1, 1, false);
            declareFunction("valid_hlmt_p", "VALID-HLMT-P", 1, 1, false);
            declareFunction("valid_mt_for_dimension_p", "VALID-MT-FOR-DIMENSION-P", 2, 0, false);
            declareFunction("default_monad_mt_p", "DEFAULT-MONAD-MT-P", 1, 0, false);
            declareFunction("monad_dimension_p", "MONAD-DIMENSION-P", 1, 0, false);
            declareFunction("monad_mt_p", "MONAD-MT-P", 1, 0, false);
            new hlmt.$monad_mt_p$UnaryFunction();
            declareFunction("valid_monad_mt_p", "VALID-MONAD-MT-P", 1, 0, false);
            declareFunction("monad_mtP", "MONAD-MT?", 1, 0, false);
            declareFunction("monad_cycl_mtP", "MONAD-CYCL-MT?", 1, 0, false);
            new hlmt.$monad_cycl_mtP$UnaryFunction();
            declareFunction("hlmt_monad_mt", "HLMT-MONAD-MT", 1, 0, false);
            declareFunction("hlmt_monad_mt_without_default", "HLMT-MONAD-MT-WITHOUT-DEFAULT", 1, 0, false);
            declareFunction("assertion_monad_mt", "ASSERTION-MONAD-MT", 1, 0, false);
            declareFunction("equal_mt_monads_p", "EQUAL-MT-MONADS-P", 2, 0, false);
            declareFunction("monad_mt_equal", "MONAD-MT-EQUAL", 2, 0, false);
            declareFunction("temporal_dimension_function_p", "TEMPORAL-DIMENSION-FUNCTION-P", 1, 0, false);
            declareFunction("temporal_dimension_predicate_p", "TEMPORAL-DIMENSION-PREDICATE-P", 1, 0, false);
            declareFunction("default_mt_time_interval_p", "DEFAULT-MT-TIME-INTERVAL-P", 1, 0, false);
            declareFunction("default_mt_time_parameter_p", "DEFAULT-MT-TIME-PARAMETER-P", 1, 0, false);
            declareFunction("default_time_mt_p", "DEFAULT-TIME-MT-P", 1, 0, false);
            declareFunction("time_point_mt_time_parameter_p", "TIME-POINT-MT-TIME-PARAMETER-P", 1, 0, false);
            declareFunction("mt_time_dim_naut_p", "MT-TIME-DIM-NAUT-P", 1, 0, false);
            declareFunction("anytime_psc_p", "ANYTIME-PSC-P", 1, 0, false);
            declareFunction("anytime_during_psc_fn_p", "ANYTIME-DURING-PSC-FN-P", 1, 0, false);
            declareFunction("anytime_during_psc_fn_naut_p", "ANYTIME-DURING-PSC-FN-NAUT-P", 1, 0, false);
            declareFunction("anytime_psc_hlmtP", "ANYTIME-PSC-HLMT?", 1, 0, false);
            declareFunction("anytime_during_psc_hlmtP", "ANYTIME-DURING-PSC-HLMT?", 1, 0, false);
            declareFunction("temporal_hlmt_p", "TEMPORAL-HLMT-P", 1, 0, false);
            declareFunction("atemporal_hlmtP", "ATEMPORAL-HLMT?", 1, 0, false);
            declareFunction("temporal_dimension_mt_p", "TEMPORAL-DIMENSION-MT-P", 1, 0, false);
            new hlmt.$temporal_dimension_mt_p$UnaryFunction();
            declareFunction("time_dimension_p", "TIME-DIMENSION-P", 1, 0, false);
            declareFunction("time_intervalP", "TIME-INTERVAL?", 1, 0, false);
            declareFunction("temporal_objectP", "TEMPORAL-OBJECT?", 1, 0, false);
            declareFunction("time_parameterP", "TIME-PARAMETER?", 1, 0, false);
            declareFunction("time_mt_with_implicit_parameter_p", "TIME-MT-WITH-IMPLICIT-PARAMETER-P", 1, 0, false);
            declareFunction("time_mt_with_explicit_parameter_p", "TIME-MT-WITH-EXPLICIT-PARAMETER-P", 1, 0, false);
            declareFunction("time_mt_with_indeterminate_time_p", "TIME-MT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
            declareFunction("some_time_in_interval_naut_p", "SOME-TIME-IN-INTERVAL-NAUT-P", 1, 0, false);
            declareFunction("indeterminate_time_interval_p", "INDETERMINATE-TIME-INTERVAL-P", 1, 0, false);
            declareFunction("hlmt_with_indeterminate_time_p", "HLMT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
            declareFunction("hlmt_with_anytime_psc_p", "HLMT-WITH-ANYTIME-PSC-P", 1, 0, false);
            declareFunction("equal_mt_times_p", "EQUAL-MT-TIMES-P", 2, 0, false);
            declareFunction("temporal_object_equal", "TEMPORAL-OBJECT-EQUAL", 2, 0, false);
            declareFunction("time_parameter_equal", "TIME-PARAMETER-EQUAL", 2, 0, false);
            declareFunction("hlmt_times_equal_p", "HLMT-TIMES-EQUAL-P", 2, 0, false);
            declareFunction("some_time_sentence_match_p", "SOME-TIME-SENTENCE-MATCH-P", 2, 0, false);
            declareFunction("hlmt_temporal_mt", "HLMT-TEMPORAL-MT", 1, 0, false);
            declareFunction("extract_hlmt_temporal_index", "EXTRACT-HLMT-TEMPORAL-INDEX", 1, 0, false);
            declareFunction("extract_hlmt_temporal_index_or_default", "EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT", 1, 0, false);
            declareFunction("extract_hlmt_time_parameter", "EXTRACT-HLMT-TIME-PARAMETER", 1, 0, false);
            declareMacro("destructure_mt_time_dim_nat", "DESTRUCTURE-MT-TIME-DIM-NAT");
            declareFunction("mt_time_dim_nat_temporal_values", "MT-TIME-DIM-NAT-TEMPORAL-VALUES", 1, 0, false);
            declareFunction("explode_indeterminate_time_dim_nat", "EXPLODE-INDETERMINATE-TIME-DIM-NAT", 1, 0, false);
            declareFunction("anytime_during_psc_fn_time_interval", "ANYTIME-DURING-PSC-FN-TIME-INTERVAL", 1, 0, false);
            declareFunction("explode_hlmt_temporal_facets", "EXPLODE-HLMT-TEMPORAL-FACETS", 3, 0, false);
            declareFunction("explode_hlmt_temporal_facets_with_defaults", "EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS", 1, 0, false);
            declareFunction("explode_genlmt_temporal_facets_based_on_temporality", "EXPLODE-GENLMT-TEMPORAL-FACETS-BASED-ON-TEMPORALITY", 2, 0, false);
            declareMacro("destructure_monad_and_temporal_facets", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS");
            declareMacro("destructure_monad_and_temporal_facets_without_defaults", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS-WITHOUT-DEFAULTS");
            declareMacro("destructure_temporal_mt_temporal_facets", "DESTRUCTURE-TEMPORAL-MT-TEMPORAL-FACETS");
            declareMacro("destructure_atemporal_genlmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-GENLMT-TEMPORAL-FACETS");
            declareMacro("destructure_atemporal_specmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-SPECMT-TEMPORAL-FACETS");
            declareFunction("new_time_dimension", "NEW-TIME-DIMENSION", 1, 1, false);
            declareFunction("new_temporal_hlmt", "NEW-TEMPORAL-HLMT", 3, 0, false);
            declareFunction("new_canonicalized_temporal_hlmt", "NEW-CANONICALIZED-TEMPORAL-HLMT", 2, 0, false);
            declareFunction("new_default_granularity_hlmt", "NEW-DEFAULT-GRANULARITY-HLMT", 2, 0, false);
            declareFunction("default_time_mt", "DEFAULT-TIME-MT", 0, 0, false);
            declareFunction("new_temporal_object_default_parameter_mt", "NEW-TEMPORAL-OBJECT-DEFAULT-PARAMETER-MT", 1, 0, false);
            declareFunction("possibly_augment_time_mt", "POSSIBLY-AUGMENT-TIME-MT", 1, 0, false);
            declareFunction("possibly_reduce_time_mt", "POSSIBLY-REDUCE-TIME-MT", 1, 0, false);
            declareFunction("add_default_parameter_to_time_nat", "ADD-DEFAULT-PARAMETER-TO-TIME-NAT", 1, 0, false);
            declareFunction("valid_temporal_mt_slice_p", "VALID-TEMPORAL-MT-SLICE-P", 1, 0, false);
            declareFunction("valid_temporal_object_p", "VALID-TEMPORAL-OBJECT-P", 1, 0, false);
            declareFunction("valid_time_parameter_p", "VALID-TIME-PARAMETER-P", 1, 0, false);
            declareFunction("valid_mt_time_with_granularity_dim_arglistP", "VALID-MT-TIME-WITH-GRANULARITY-DIM-ARGLIST?", 1, 0, false);
            declareFunction("valid_mt_time_dim_arglistP", "VALID-MT-TIME-DIM-ARGLIST?", 1, 0, false);
            declareFunction("relevant_mt_with_inference_relevance", "RELEVANT-MT-WITH-INFERENCE-RELEVANCE", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_replace_hlmt_class", "SUBLOOP-RESERVED-INITIALIZE-REPLACE-HLMT-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_replace_hlmt_instance", "SUBLOOP-RESERVED-INITIALIZE-REPLACE-HLMT-INSTANCE", 1, 0, false);
            declareFunction("replace_hlmt_p", "REPLACE-HLMT-P", 1, 0, false);
            declareFunction("subloop_reserved_initialize_combine_hlmts_class", "SUBLOOP-RESERVED-INITIALIZE-COMBINE-HLMTS-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_combine_hlmts_instance", "SUBLOOP-RESERVED-INITIALIZE-COMBINE-HLMTS-INSTANCE", 1, 0, false);
            declareFunction("combine_hlmts_p", "COMBINE-HLMTS-P", 1, 0, false);
            declareFunction("subloop_reserved_initialize_mt_union_class", "SUBLOOP-RESERVED-INITIALIZE-MT-UNION-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_mt_union_instance", "SUBLOOP-RESERVED-INITIALIZE-MT-UNION-INSTANCE", 1, 0, false);
            declareFunction("mt_union_p", "MT-UNION-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_hlmt_file_Previous() {
        declareFunction("hlmts_supportedP", "HLMTS-SUPPORTED?", 0, 0, false);
        declareMacro("with_hlmts", "WITH-HLMTS");
        declareFunction("enable_hlmts", "ENABLE-HLMTS", 0, 0, false);
        declareFunction("disable_hlmts", "DISABLE-HLMTS", 0, 0, false);
        declareFunction("unindexed_hlmt_syntax_constants", "UNINDEXED-HLMT-SYNTAX-CONSTANTS", 0, 0, false);
        declareFunction("unindexed_hlmt_syntax_constant_p", "UNINDEXED-HLMT-SYNTAX-CONSTANT-P", 1, 0, false);
        declareFunction("fully_indexed_hlmt_term_p", "FULLY-INDEXED-HLMT-TERM-P", 1, 0, false);
        declareFunction("mt_space_function_p", "MT-SPACE-FUNCTION-P", 1, 0, false);
        declareFunction("possibly_mt_p", "POSSIBLY-MT-P", 1, 0, false);
        declareFunction("possibly_hlmt_p", "POSSIBLY-HLMT-P", 1, 0, false);
        declareFunction("fort_or_chlmt_p", "FORT-OR-CHLMT-P", 1, 0, false);
        declareFunction("chlmt_p", "CHLMT-P", 1, 0, false);
        declareFunction("closed_hlmt_p", "CLOSED-HLMT-P", 1, 0, false);
        new hlmt.$closed_hlmt_p$UnaryFunction();
        declareFunction("closed_possibly_hlmt_p", "CLOSED-POSSIBLY-HLMT-P", 1, 0, false);
        declareFunction("hlmt_p", "HLMT-P", 1, 0, false);
        declareFunction("hlmt_p_no_time", "HLMT-P-NO-TIME", 1, 0, false);
        declareFunction("hlmt_p_time", "HLMT-P-TIME", 1, 0, false);
        declareFunction("possibly_hlmt_naut_p", "POSSIBLY-HLMT-NAUT-P", 1, 0, false);
        declareFunction("hlmt_naut_p", "HLMT-NAUT-P", 1, 0, false);
        declareFunction("mt_space_naut_p", "MT-SPACE-NAUT-P", 1, 0, false);
        declareFunction("mt_space_naut_arglist_p", "MT-SPACE-NAUT-ARGLIST-P", 1, 0, false);
        declareFunction("mt_dim_naut_p", "MT-DIM-NAUT-P", 1, 0, false);
        declareFunction("mt_union_naut_p", "MT-UNION-NAUT-P", 1, 0, false);
        declareFunction("mt_union_function_p", "MT-UNION-FUNCTION-P", 1, 0, false);
        declareFunction("hlmtP", "HLMT?", 1, 0, false);
        new hlmt.$hlmtP$UnaryFunction();
        declareFunction("hlmtP_int", "HLMT?-INT", 1, 0, false);
        declareFunction("hlmtP_no_time", "HLMT?-NO-TIME", 1, 0, false);
        declareFunction("hlmtP_time", "HLMT?-TIME", 1, 0, false);
        declareFunction("hlmt_nautP", "HLMT-NAUT?", 1, 0, false);
        declareFunction("mt_space_mtP", "MT-SPACE-MT?", 1, 0, false);
        declareFunction("mt_space_arglistP", "MT-SPACE-ARGLIST?", 1, 0, false);
        declareFunction("mt_dim_mtP", "MT-DIM-MT?", 1, 0, false);
        declareFunction("mt_dim_arglistP", "MT-DIM-ARGLIST?", 2, 0, false);
        declareFunction("mt_union_nautP", "MT-UNION-NAUT?", 1, 0, false);
        declareFunction("mt_union_arglistP", "MT-UNION-ARGLIST?", 1, 0, false);
        declareFunction("hlmt_equal", "HLMT-EQUAL", 2, 0, false);
        new hlmt.$hlmt_equal$BinaryFunction();
        declareFunction("hlmt_equalP", "HLMT-EQUAL?", 2, 0, false);
        declareFunction("new_hlmt", "NEW-HLMT", 1, 0, false);
        declareFunction("copy_hlmt", "COPY-HLMT", 1, 0, false);
        declareFunction("new_anytime_during_psc_naut", "NEW-ANYTIME-DURING-PSC-NAUT", 1, 0, false);
        declareFunction("anytime_psc", "ANYTIME-PSC", 0, 0, false);
        declareFunction("mt_union_mts", "MT-UNION-MTS", 1, 0, false);
        declareFunction("mt_union_mts_recursive", "MT-UNION-MTS-RECURSIVE", 1, 0, false);
        declareFunction("mt_union_mts_recursive_int", "MT-UNION-MTS-RECURSIVE-INT", 1, 0, false);
        new hlmt.$mt_union_mts_recursive_int$UnaryFunction();
        declareFunction("union_mt_relevance_contexts", "UNION-MT-RELEVANCE-CONTEXTS", 1, 0, false);
        declareFunction("mt_dimension_type_p", "MT-DIMENSION-TYPE-P", 1, 0, false);
        declareFunction("mt_dimension_types", "MT-DIMENSION-TYPES", 0, 0, false);
        declareFunction("mt_dimension_function_p", "MT-DIMENSION-FUNCTION-P", 1, 0, false);
        declareFunction("context_space_function_p", "CONTEXT-SPACE-FUNCTION-P", 1, 0, false);
        declareFunction("mt_dimension_predicate_p", "MT-DIMENSION-PREDICATE-P", 1, 0, false);
        declareMacro("do_mt_dimensions", "DO-MT-DIMENSIONS");
        declareFunction("mt_dimension_of_arg", "MT-DIMENSION-OF-ARG", 1, 0, false);
        declareFunction("single_dimension_mt_dimension", "SINGLE-DIMENSION-MT-DIMENSION", 1, 0, false);
        new hlmt.$single_dimension_mt_dimension$UnaryFunction();
        declareFunction("mt_dim_nat_dimension", "MT-DIM-NAT-DIMENSION", 1, 0, false);
        declareFunction("get_hlmt_dimension", "GET-HLMT-DIMENSION", 2, 0, false);
        declareFunction("hlmt_dimensions", "HLMT-DIMENSIONS", 1, 0, false);
        declareFunction("remove_hlmt_dimension", "REMOVE-HLMT-DIMENSION", 2, 0, false);
        declareFunction("replace_hlmt_dimension", "REPLACE-HLMT-DIMENSION", 3, 0, false);
        declareFunction("replace_monad_dimension", "REPLACE-MONAD-DIMENSION", 2, 0, false);
        declareFunction("replace_time_dimension", "REPLACE-TIME-DIMENSION", 2, 1, false);
        declareFunction("default_values_for_dimension_p", "DEFAULT-VALUES-FOR-DIMENSION-P", 2, 0, false);
        declareFunction("some_interesting_hlmtP", "SOME-INTERESTING-HLMT?", 1, 0, false);
        declareFunction("interesting_hlmtP", "INTERESTING-HLMT?", 1, 0, false);
        declareFunction("assertion_hlmt", "ASSERTION-HLMT", 1, 0, false);
        declareFunction("hlmt_has_dimension_of_valueP", "HLMT-HAS-DIMENSION-OF-VALUE?", 3, 0, false);
        declareFunction("augment_hlmt", "AUGMENT-HLMT", 1, 0, false);
        declareFunction("reduce_hlmt", "REDUCE-HLMT", 1, 1, false);
        declareFunction("transform_mt_union_nauts", "TRANSFORM-MT-UNION-NAUTS", 2, 0, false);
        declareFunction("reduce_mt_union_hlmt", "REDUCE-MT-UNION-HLMT", 2, 0, false);
        declareFunction("clear_reduce_mt_union_hlmt_int", "CLEAR-REDUCE-MT-UNION-HLMT-INT", 0, 0, false);
        declareFunction("remove_reduce_mt_union_hlmt_int", "REMOVE-REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        declareFunction("reduce_mt_union_hlmt_int_internal", "REDUCE-MT-UNION-HLMT-INT-INTERNAL", 1, 0, false);
        declareFunction("reduce_mt_union_hlmt_int", "REDUCE-MT-UNION-HLMT-INT", 1, 0, false);
        declareFunction("new_reduced_hlmt", "NEW-REDUCED-HLMT", 1, 0, false);
        declareFunction("combine_hlmts", "COMBINE-HLMTS", 2, 0, false);
        declareFunction("new_canonicalized_hlmt", "NEW-CANONICALIZED-HLMT", 1, 0, false);
        declareFunction("possibly_augment_dimension", "POSSIBLY-AUGMENT-DIMENSION", 2, 0, false);
        declareFunction("possibly_reduce_dimension", "POSSIBLY-REDUCE-DIMENSION", 2, 0, false);
        declareFunction("default_dimension_mt", "DEFAULT-DIMENSION-MT", 1, 0, false);
        declareFunction("new_hlmt_from_dimension_plist", "NEW-HLMT-FROM-DIMENSION-PLIST", 1, 0, false);
        declareFunction("valid_hlmtP", "VALID-HLMT?", 1, 1, false);
        declareFunction("valid_hlmt_p", "VALID-HLMT-P", 1, 1, false);
        declareFunction("valid_mt_for_dimension_p", "VALID-MT-FOR-DIMENSION-P", 2, 0, false);
        declareFunction("default_monad_mt_p", "DEFAULT-MONAD-MT-P", 1, 0, false);
        declareFunction("monad_dimension_p", "MONAD-DIMENSION-P", 1, 0, false);
        declareFunction("monad_mt_p", "MONAD-MT-P", 1, 0, false);
        new hlmt.$monad_mt_p$UnaryFunction();
        declareFunction("valid_monad_mt_p", "VALID-MONAD-MT-P", 1, 0, false);
        declareFunction("monad_mtP", "MONAD-MT?", 1, 0, false);
        declareFunction("monad_cycl_mtP", "MONAD-CYCL-MT?", 1, 0, false);
        new hlmt.$monad_cycl_mtP$UnaryFunction();
        declareFunction("hlmt_monad_mt", "HLMT-MONAD-MT", 1, 0, false);
        declareFunction("hlmt_monad_mt_without_default", "HLMT-MONAD-MT-WITHOUT-DEFAULT", 1, 0, false);
        declareFunction("assertion_monad_mt", "ASSERTION-MONAD-MT", 1, 0, false);
        declareFunction("equal_mt_monads_p", "EQUAL-MT-MONADS-P", 2, 0, false);
        declareFunction("monad_mt_equal", "MONAD-MT-EQUAL", 2, 0, false);
        declareFunction("temporal_dimension_function_p", "TEMPORAL-DIMENSION-FUNCTION-P", 1, 0, false);
        declareFunction("temporal_dimension_predicate_p", "TEMPORAL-DIMENSION-PREDICATE-P", 1, 0, false);
        declareFunction("default_mt_time_interval_p", "DEFAULT-MT-TIME-INTERVAL-P", 1, 0, false);
        declareFunction("default_mt_time_parameter_p", "DEFAULT-MT-TIME-PARAMETER-P", 1, 0, false);
        declareFunction("default_time_mt_p", "DEFAULT-TIME-MT-P", 1, 0, false);
        declareFunction("time_point_mt_time_parameter_p", "TIME-POINT-MT-TIME-PARAMETER-P", 1, 0, false);
        declareFunction("mt_time_dim_naut_p", "MT-TIME-DIM-NAUT-P", 1, 0, false);
        declareFunction("anytime_psc_p", "ANYTIME-PSC-P", 1, 0, false);
        declareFunction("anytime_during_psc_fn_p", "ANYTIME-DURING-PSC-FN-P", 1, 0, false);
        declareFunction("anytime_during_psc_fn_naut_p", "ANYTIME-DURING-PSC-FN-NAUT-P", 1, 0, false);
        declareFunction("anytime_psc_hlmtP", "ANYTIME-PSC-HLMT?", 1, 0, false);
        declareFunction("anytime_during_psc_hlmtP", "ANYTIME-DURING-PSC-HLMT?", 1, 0, false);
        declareFunction("temporal_hlmt_p", "TEMPORAL-HLMT-P", 1, 0, false);
        declareFunction("atemporal_hlmtP", "ATEMPORAL-HLMT?", 1, 0, false);
        declareFunction("temporal_dimension_mt_p", "TEMPORAL-DIMENSION-MT-P", 1, 0, false);
        new hlmt.$temporal_dimension_mt_p$UnaryFunction();
        declareFunction("time_dimension_p", "TIME-DIMENSION-P", 1, 0, false);
        declareFunction("time_intervalP", "TIME-INTERVAL?", 1, 0, false);
        declareFunction("temporal_objectP", "TEMPORAL-OBJECT?", 1, 0, false);
        declareFunction("time_parameterP", "TIME-PARAMETER?", 1, 0, false);
        declareFunction("time_mt_with_implicit_parameter_p", "TIME-MT-WITH-IMPLICIT-PARAMETER-P", 1, 0, false);
        declareFunction("time_mt_with_explicit_parameter_p", "TIME-MT-WITH-EXPLICIT-PARAMETER-P", 1, 0, false);
        declareFunction("time_mt_with_indeterminate_time_p", "TIME-MT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        declareFunction("some_time_in_interval_naut_p", "SOME-TIME-IN-INTERVAL-NAUT-P", 1, 0, false);
        declareFunction("indeterminate_time_interval_p", "INDETERMINATE-TIME-INTERVAL-P", 1, 0, false);
        declareFunction("hlmt_with_indeterminate_time_p", "HLMT-WITH-INDETERMINATE-TIME-P", 1, 0, false);
        declareFunction("hlmt_with_anytime_psc_p", "HLMT-WITH-ANYTIME-PSC-P", 1, 0, false);
        declareFunction("equal_mt_times_p", "EQUAL-MT-TIMES-P", 2, 0, false);
        declareFunction("temporal_object_equal", "TEMPORAL-OBJECT-EQUAL", 2, 0, false);
        declareFunction("time_parameter_equal", "TIME-PARAMETER-EQUAL", 2, 0, false);
        declareFunction("hlmt_times_equal_p", "HLMT-TIMES-EQUAL-P", 2, 0, false);
        declareFunction("some_time_sentence_match_p", "SOME-TIME-SENTENCE-MATCH-P", 2, 0, false);
        declareFunction("hlmt_temporal_mt", "HLMT-TEMPORAL-MT", 1, 0, false);
        declareFunction("extract_hlmt_temporal_index", "EXTRACT-HLMT-TEMPORAL-INDEX", 1, 0, false);
        declareFunction("extract_hlmt_temporal_index_or_default", "EXTRACT-HLMT-TEMPORAL-INDEX-OR-DEFAULT", 1, 0, false);
        declareFunction("extract_hlmt_time_parameter", "EXTRACT-HLMT-TIME-PARAMETER", 1, 0, false);
        declareMacro("destructure_mt_time_dim_nat", "DESTRUCTURE-MT-TIME-DIM-NAT");
        declareFunction("mt_time_dim_nat_temporal_values", "MT-TIME-DIM-NAT-TEMPORAL-VALUES", 1, 0, false);
        declareFunction("explode_indeterminate_time_dim_nat", "EXPLODE-INDETERMINATE-TIME-DIM-NAT", 1, 0, false);
        declareFunction("anytime_during_psc_fn_time_interval", "ANYTIME-DURING-PSC-FN-TIME-INTERVAL", 1, 0, false);
        declareFunction("explode_hlmt_temporal_facets", "EXPLODE-HLMT-TEMPORAL-FACETS", 3, 0, false);
        declareFunction("explode_hlmt_temporal_facets_with_defaults", "EXPLODE-HLMT-TEMPORAL-FACETS-WITH-DEFAULTS", 1, 0, false);
        declareFunction("explode_genlmt_temporal_facets_based_on_temporality", "EXPLODE-GENLMT-TEMPORAL-FACETS-BASED-ON-TEMPORALITY", 2, 0, false);
        declareMacro("destructure_monad_and_temporal_facets", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS");
        declareMacro("destructure_monad_and_temporal_facets_without_defaults", "DESTRUCTURE-MONAD-AND-TEMPORAL-FACETS-WITHOUT-DEFAULTS");
        declareMacro("destructure_temporal_mt_temporal_facets", "DESTRUCTURE-TEMPORAL-MT-TEMPORAL-FACETS");
        declareMacro("destructure_atemporal_genlmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-GENLMT-TEMPORAL-FACETS");
        declareMacro("destructure_atemporal_specmt_temporal_facets", "DESTRUCTURE-ATEMPORAL-SPECMT-TEMPORAL-FACETS");
        declareFunction("new_time_dimension", "NEW-TIME-DIMENSION", 1, 1, false);
        declareFunction("new_temporal_hlmt", "NEW-TEMPORAL-HLMT", 3, 0, false);
        declareFunction("new_canonicalized_temporal_hlmt", "NEW-CANONICALIZED-TEMPORAL-HLMT", 2, 0, false);
        declareFunction("new_default_granularity_hlmt", "NEW-DEFAULT-GRANULARITY-HLMT", 2, 0, false);
        declareFunction("default_time_mt", "DEFAULT-TIME-MT", 0, 0, false);
        declareFunction("new_temporal_object_default_parameter_mt", "NEW-TEMPORAL-OBJECT-DEFAULT-PARAMETER-MT", 1, 0, false);
        declareFunction("possibly_augment_time_mt", "POSSIBLY-AUGMENT-TIME-MT", 1, 0, false);
        declareFunction("possibly_reduce_time_mt", "POSSIBLY-REDUCE-TIME-MT", 1, 0, false);
        declareFunction("add_default_parameter_to_time_nat", "ADD-DEFAULT-PARAMETER-TO-TIME-NAT", 1, 0, false);
        declareFunction("valid_temporal_mt_slice_p", "VALID-TEMPORAL-MT-SLICE-P", 1, 0, false);
        declareFunction("valid_temporal_object_p", "VALID-TEMPORAL-OBJECT-P", 1, 0, false);
        declareFunction("valid_time_parameter_p", "VALID-TIME-PARAMETER-P", 1, 0, false);
        declareFunction("valid_mt_time_with_granularity_dim_arglistP", "VALID-MT-TIME-WITH-GRANULARITY-DIM-ARGLIST?", 1, 0, false);
        declareFunction("valid_mt_time_dim_arglistP", "VALID-MT-TIME-DIM-ARGLIST?", 1, 0, false);
        declareFunction("relevant_mt_with_inference_relevance", "RELEVANT-MT-WITH-INFERENCE-RELEVANCE", 2, 0, false);
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

    public static final SubLObject setup_hlmt_file_alt() {
        register_external_symbol(UNION_MT_RELEVANCE_CONTEXTS);
        register_macro_helper(MT_DIMENSION_OF_ARG, DO_MT_DIMENSIONS);
        memoization_state.note_globally_cached_function(REDUCE_MT_UNION_HLMT_INT);
        sunit_external.define_test_category($$$HLMT_Tests, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(REPLACE_HLMT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(REPLACE_HLMT);
        classes.subloop_new_class(REPLACE_HLMT, TEST_CASE, NIL, NIL, $list_alt88);
        classes.class_set_implements_slot_listeners(REPLACE_HLMT, NIL);
        classes.subloop_note_class_initialization_function(REPLACE_HLMT, SUBLOOP_RESERVED_INITIALIZE_REPLACE_HLMT_CLASS);
        classes.subloop_note_instance_initialization_function(REPLACE_HLMT, SUBLOOP_RESERVED_INITIALIZE_REPLACE_HLMT_INSTANCE);
        com.cyc.cycjava.cycl.hlmt.subloop_reserved_initialize_replace_hlmt_class(REPLACE_HLMT);
        sunit_macros.define_test_case_postamble(REPLACE_HLMT, $$$hlmt, $$$cycl, $list_alt105);
        sunit_macros.def_test_method_register(REPLACE_HLMT, TEST1);
        sunit_macros.def_test_method_register(REPLACE_HLMT, TEST2);
        sunit_macros.def_test_method_register(REPLACE_HLMT, TEST3);
        sunit_macros.def_test_method_register(REPLACE_HLMT, TEST4);
        sunit_macros.def_test_method_register(REPLACE_HLMT, TEST5);
        sunit_macros.def_test_method_register(REPLACE_HLMT, TEST6);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COMBINE_HLMTS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(COMBINE_HLMTS);
        classes.subloop_new_class(COMBINE_HLMTS, TEST_CASE, NIL, NIL, $list_alt113);
        classes.class_set_implements_slot_listeners(COMBINE_HLMTS, NIL);
        classes.subloop_note_class_initialization_function(COMBINE_HLMTS, SUBLOOP_RESERVED_INITIALIZE_COMBINE_HLMTS_CLASS);
        classes.subloop_note_instance_initialization_function(COMBINE_HLMTS, SUBLOOP_RESERVED_INITIALIZE_COMBINE_HLMTS_INSTANCE);
        com.cyc.cycjava.cycl.hlmt.subloop_reserved_initialize_combine_hlmts_class(COMBINE_HLMTS);
        sunit_macros.define_test_case_postamble(COMBINE_HLMTS, $$$hlmt, $$$cycl, $list_alt105);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST1);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST2);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST3);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST4);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST5);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST6);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST7);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST8);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST9);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST10);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST11);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST12);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST13);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST14);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST15);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST16);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST17);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST18);
        sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST19);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MT_UNION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(MT_UNION);
        classes.subloop_new_class(MT_UNION, TEST_CASE, NIL, NIL, $list_alt130);
        classes.class_set_implements_slot_listeners(MT_UNION, NIL);
        classes.subloop_note_class_initialization_function(MT_UNION, SUBLOOP_RESERVED_INITIALIZE_MT_UNION_CLASS);
        classes.subloop_note_instance_initialization_function(MT_UNION, SUBLOOP_RESERVED_INITIALIZE_MT_UNION_INSTANCE);
        com.cyc.cycjava.cycl.hlmt.subloop_reserved_initialize_mt_union_class(MT_UNION);
        sunit_macros.define_test_case_postamble(MT_UNION, $$$hlmt, $$$cycl, $list_alt105);
        sunit_macros.def_test_method_register(MT_UNION, TEST1);
        sunit_macros.def_test_method_register(MT_UNION, TEST2);
        sunit_macros.def_test_method_register(MT_UNION, TEST3);
        sunit_macros.def_test_method_register(MT_UNION, TEST4);
        sunit_macros.def_test_method_register(MT_UNION, TEST5);
        sunit_macros.def_test_method_register(MT_UNION, TEST6);
        sunit_macros.def_test_method_register(MT_UNION, TEST7);
        sunit_macros.def_test_method_register(MT_UNION, TEST8);
        sunit_macros.def_test_method_register(MT_UNION, TEST9);
        sunit_macros.def_test_method_register(MT_UNION, TEST10);
        sunit_macros.def_test_method_register(MT_UNION, TEST11);
        sunit_macros.def_test_method_register(MT_UNION, TEST12);
        sunit_macros.def_test_method_register(MT_UNION, TEST13);
        sunit_macros.def_test_method_register(MT_UNION, TEST14);
        sunit_macros.def_test_method_register(MT_UNION, TEST15);
        sunit_external.define_test_suite($$$HLMT_Test_Suite, $list_alt105, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject setup_hlmt_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(UNION_MT_RELEVANCE_CONTEXTS);
            register_macro_helper(MT_DIMENSION_OF_ARG, DO_MT_DIMENSIONS);
            memoization_state.note_globally_cached_function(REDUCE_MT_UNION_HLMT_INT);
            sunit_external.define_test_category($$$HLMT_Tests, UNPROVIDED);
            sunit_external.define_test_suite($$$HLMT_Test_Suite, $list87, UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(REPLACE_HLMT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(REPLACE_HLMT);
            classes.subloop_new_class(REPLACE_HLMT, TEST_CASE, NIL, NIL, $list_alt88);
            classes.class_set_implements_slot_listeners(REPLACE_HLMT, NIL);
            classes.subloop_note_class_initialization_function(REPLACE_HLMT, SUBLOOP_RESERVED_INITIALIZE_REPLACE_HLMT_CLASS);
            classes.subloop_note_instance_initialization_function(REPLACE_HLMT, SUBLOOP_RESERVED_INITIALIZE_REPLACE_HLMT_INSTANCE);
            com.cyc.cycjava.cycl.hlmt.subloop_reserved_initialize_replace_hlmt_class(REPLACE_HLMT);
            sunit_macros.define_test_case_postamble(REPLACE_HLMT, $$$hlmt, $$$cycl, $list_alt105);
            sunit_macros.def_test_method_register(REPLACE_HLMT, TEST1);
            sunit_macros.def_test_method_register(REPLACE_HLMT, TEST2);
            sunit_macros.def_test_method_register(REPLACE_HLMT, TEST3);
            sunit_macros.def_test_method_register(REPLACE_HLMT, TEST4);
            sunit_macros.def_test_method_register(REPLACE_HLMT, TEST5);
            sunit_macros.def_test_method_register(REPLACE_HLMT, TEST6);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(COMBINE_HLMTS, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(COMBINE_HLMTS);
            classes.subloop_new_class(COMBINE_HLMTS, TEST_CASE, NIL, NIL, $list_alt113);
            classes.class_set_implements_slot_listeners(COMBINE_HLMTS, NIL);
            classes.subloop_note_class_initialization_function(COMBINE_HLMTS, SUBLOOP_RESERVED_INITIALIZE_COMBINE_HLMTS_CLASS);
            classes.subloop_note_instance_initialization_function(COMBINE_HLMTS, SUBLOOP_RESERVED_INITIALIZE_COMBINE_HLMTS_INSTANCE);
            com.cyc.cycjava.cycl.hlmt.subloop_reserved_initialize_combine_hlmts_class(COMBINE_HLMTS);
            sunit_macros.define_test_case_postamble(COMBINE_HLMTS, $$$hlmt, $$$cycl, $list_alt105);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST1);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST2);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST3);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST4);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST5);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST6);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST7);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST8);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST9);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST10);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST11);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST12);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST13);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST14);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST15);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST16);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST17);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST18);
            sunit_macros.def_test_method_register(COMBINE_HLMTS, TEST19);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MT_UNION, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(MT_UNION);
            classes.subloop_new_class(MT_UNION, TEST_CASE, NIL, NIL, $list_alt130);
            classes.class_set_implements_slot_listeners(MT_UNION, NIL);
            classes.subloop_note_class_initialization_function(MT_UNION, SUBLOOP_RESERVED_INITIALIZE_MT_UNION_CLASS);
            classes.subloop_note_instance_initialization_function(MT_UNION, SUBLOOP_RESERVED_INITIALIZE_MT_UNION_INSTANCE);
            com.cyc.cycjava.cycl.hlmt.subloop_reserved_initialize_mt_union_class(MT_UNION);
            sunit_macros.define_test_case_postamble(MT_UNION, $$$hlmt, $$$cycl, $list_alt105);
            sunit_macros.def_test_method_register(MT_UNION, TEST1);
            sunit_macros.def_test_method_register(MT_UNION, TEST2);
            sunit_macros.def_test_method_register(MT_UNION, TEST3);
            sunit_macros.def_test_method_register(MT_UNION, TEST4);
            sunit_macros.def_test_method_register(MT_UNION, TEST5);
            sunit_macros.def_test_method_register(MT_UNION, TEST6);
            sunit_macros.def_test_method_register(MT_UNION, TEST7);
            sunit_macros.def_test_method_register(MT_UNION, TEST8);
            sunit_macros.def_test_method_register(MT_UNION, TEST9);
            sunit_macros.def_test_method_register(MT_UNION, TEST10);
            sunit_macros.def_test_method_register(MT_UNION, TEST11);
            sunit_macros.def_test_method_register(MT_UNION, TEST12);
            sunit_macros.def_test_method_register(MT_UNION, TEST13);
            sunit_macros.def_test_method_register(MT_UNION, TEST14);
            sunit_macros.def_test_method_register(MT_UNION, TEST15);
            sunit_external.define_test_suite($$$HLMT_Test_Suite, $list_alt105, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject setup_hlmt_file_Previous() {
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

    static {
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

    static private final SubLList $list_alt1 = list(list(makeSymbol("*HLMTS-SUPPORTED?*"), T));

    static private final SubLList $list_alt7 = list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), reader_make_constant_shell("MtTimeDimFn"));

    static private final SubLList $list_alt8 = list(makeKeyword("MONAD"), $TIME);

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("MtDim"), reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("MtTimeWithGranularityDimFn"));

    static private final SubLList $list_alt12 = list(new SubLObject[]{ reader_make_constant_shell("MtSpace"), reader_make_constant_shell("MtDim"), reader_make_constant_shell("MtTimeDimFn"), reader_make_constant_shell("MtTimeWithGranularityDimFn"), reader_make_constant_shell("mtTimeIndex"), reader_make_constant_shell("mtTimeParameter"), reader_make_constant_shell("mtMonad"), reader_make_constant_shell("Always-TimeInterval"), reader_make_constant_shell("Null-TimeParameter"), reader_make_constant_shell("TimePoint") });

    static private final SubLList $list_alt24 = list(list(makeSymbol("DIM-VAR"), makeSymbol("VAL-VAR"), makeSymbol("HLMT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt25 = list($DONE);

    static private final SubLList $list_alt33 = list(makeKeyword("MONAD"));

    static private final SubLList $list_alt43 = list($TIME);

    static private final SubLList $list_alt45 = list(makeKeyword("UNKNOWN"));

    static private final SubLSymbol $sym54$INTERESTING_HLMT_ = makeSymbol("INTERESTING-HLMT?");

    public static final SubLSymbol $kw58$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt61 = list(reader_make_constant_shell("mtTimeIndex"), reader_make_constant_shell("mtTimeParameter"));

    static private final SubLString $str_alt67$Continue_Anyway_ = makeString("Continue Anyway.");

    static private final SubLString $str_alt68$We_should_never_test_two_some_tim = makeString("We should never test two some time conjuncts.");

    static private final SubLList $list_alt69 = list(list(makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt72$DIM_NAT__a_is_not_a_microtheory_t = makeString("DIM-NAT ~a is not a microtheory time dimension NAT");

    static private final SubLList $list_alt74 = list(list(makeSymbol("MONAD-MT"), makeSymbol("TEMPORAL-OBJECT"), makeSymbol("TIME-PARAMETER")), makeSymbol("HLMT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt78 = list(NIL, NIL);

    static private final SubLList $list_alt79 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"), makeSymbol("*DEFAULT-TEMPORAL-MT-TIME-PARAMETER*"));

    static private final SubLList $list_alt82 = list(makeSymbol("*DEFAULT-MT-TIME-INTERVAL*"));

    static private final SubLList $list_alt83 = list(makeSymbol("*DEFAULT-ATEMPORAL-GENLMT-TIME-PARAMETER*"));

    static private final SubLList $list_alt84 = list(makeSymbol("*DEFAULT-ATEMPORAL-SPECMT-TIME-PARAMETER*"));

    private static final SubLSymbol REPLACE_HLMT = makeSymbol("REPLACE-HLMT");

    static private final SubLList $list_alt88 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST2"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST3"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST4"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST5"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST6"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REPLACE_HLMT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REPLACE-HLMT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_REPLACE_HLMT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-REPLACE-HLMT-INSTANCE");

    static private final SubLString $$$hlmt = makeString("hlmt");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt105 = list(makeString("HLMT Tests"));

    private static final SubLSymbol COMBINE_HLMTS = makeSymbol("COMBINE-HLMTS");

    static private final SubLList $list_alt113 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST2"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST3"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST4"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST5"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST6"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST7"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST8"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST9"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST10"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST11"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST12"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST13"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST14"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST15"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST16"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST17"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST18"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST19"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMBINE_HLMTS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMBINE-HLMTS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COMBINE_HLMTS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COMBINE-HLMTS-INSTANCE");

    private static final SubLSymbol TEST7 = makeSymbol("TEST7");

    private static final SubLSymbol TEST8 = makeSymbol("TEST8");

    private static final SubLSymbol TEST9 = makeSymbol("TEST9");

    private static final SubLSymbol TEST10 = makeSymbol("TEST10");

    private static final SubLSymbol TEST11 = makeSymbol("TEST11");

    private static final SubLSymbol TEST12 = makeSymbol("TEST12");

    private static final SubLSymbol TEST13 = makeSymbol("TEST13");

    private static final SubLSymbol TEST14 = makeSymbol("TEST14");

    private static final SubLSymbol TEST15 = makeSymbol("TEST15");

    private static final SubLSymbol TEST16 = makeSymbol("TEST16");

    private static final SubLSymbol TEST17 = makeSymbol("TEST17");

    private static final SubLSymbol TEST18 = makeSymbol("TEST18");

    private static final SubLSymbol TEST19 = makeSymbol("TEST19");

    private static final SubLSymbol MT_UNION = makeSymbol("MT-UNION");

    static private final SubLList $list_alt130 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST2"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST3"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST4"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST5"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST6"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST7"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST8"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST9"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST10"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST11"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST12"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST13"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST14"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST15"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MT_UNION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MT-UNION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MT_UNION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MT-UNION-INSTANCE");
}

/**
 * Total time: 511 ms
 */
