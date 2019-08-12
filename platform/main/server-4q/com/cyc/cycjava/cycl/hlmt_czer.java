/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.czer_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class hlmt_czer extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_cze_hlmt_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cze_hlmt_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject cze_hlmt_p(SubLObject cze_hlmt) {
        return classes.subloop_instanceof_class(cze_hlmt, CZE_HLMT);
    }

    public static final SubLFile me = new hlmt_czer();

 public static final String myName = "com.cyc.cycjava.cycl.hlmt_czer";




    static private final SubLSymbol $sym2$SKOLEMIZE_FORWARD_ = makeSymbol("SKOLEMIZE-FORWARD?");

    static private final SubLSymbol $sym3$HLMT_ = makeSymbol("HLMT?");

    private static final SubLSymbol SINGLE_DIMENSION_MT_DIMENSION = makeSymbol("SINGLE-DIMENSION-MT-DIMENSION");

    static private final SubLString $str7$Can_t_yet_handle_negated_metric_t = makeString("Can't yet handle negated metric tense operators");









    static private final SubLString $str12$_a_is_not_a_known_tense_operator_ = makeString("~a is not a known tense operator.");

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell("Null-TimeParameter");



    static private final SubLString $$$T = makeString("T");









    private static final SubLObject $const20$IntervalEndedByLastSubintervalOfT = reader_make_constant_shell("IntervalEndedByLastSubintervalOfTypeFn");

    private static final SubLObject $const21$IntervalStartedByFirstSubinterval = reader_make_constant_shell("IntervalStartedByFirstSubintervalOfTypeFn");



    private static final SubLObject $$was_Metric = reader_make_constant_shell("was-Metric");

    private static final SubLObject $$willBe_Metric = reader_make_constant_shell("willBe-Metric");

    static private final SubLString $str25$_a_is_not_a_metric_tense_operator = makeString("~a is not a metric tense operator.");

    private static final SubLSymbol IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");









    static private final SubLList $list31 = list(reader_make_constant_shell("Null-TimeParameter"));

    // Definitions
    /**
     * Returns the mt that MT denotes, in a canonical form.
     * Will reify the monad if it is a closed nat.
     * Returns NIL if MT is ill-formed.
     */
    @LispMethod(comment = "Returns the mt that MT denotes, in a canonical form.\r\nWill reify the monad if it is a closed nat.\r\nReturns NIL if MT is ill-formed.\nReturns the mt that MT denotes, in a canonical form.\nWill reify the monad if it is a closed nat.\nReturns NIL if MT is ill-formed.")
    public static final SubLObject canonicalize_hlmt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
            thread.resetMultipleValues();
            {
                SubLObject new_mt = precanonicalizer.safe_precanonicalizations(mt, $$BaseKB);
                SubLObject dummy_mt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                mt = new_mt;
            }
            if (NIL != mt) {
                mt = hlmt.reduce_hlmt(mt, within_queryP());
                mt = cycl_utilities.reify_when_closed_naut(mt);
                if (NIL != kb_control_vars.within_forward_inferenceP()) {
                    if (NIL == wff_macros.within_wffP()) {
                        if (NIL != possibly_naut_p(hlmt.hlmt_monad_mt(mt))) {
                            if (NIL != list_utilities.tree_find_if(symbol_function($sym2$SKOLEMIZE_FORWARD_), hlmt.hlmt_monad_mt(mt), UNPROVIDED)) {
                                mt = czer_main.canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
                            }
                        }
                    }
                }
                mt = com.cyc.cycjava.cycl.hlmt_czer.canonicalize_hlmt_int(mt);
            }
            return mt;
        }
    }

    // Definitions
    /**
     * Returns the mt that MT denotes, in a canonical form.
     * Will reify the monad if it is a closed nat.
     * Returns NIL if MT is ill-formed.
     */
    @LispMethod(comment = "Returns the mt that MT denotes, in a canonical form.\r\nWill reify the monad if it is a closed nat.\r\nReturns NIL if MT is ill-formed.\nReturns the mt that MT denotes, in a canonical form.\nWill reify the monad if it is a closed nat.\nReturns NIL if MT is ill-formed.")
    public static SubLObject canonicalize_hlmt(SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$assume_hlmt_is_canonicalP$.getDynamicValue(thread)) {
            return mt;
        }
        assert NIL != hlmt.possibly_mt_p(mt) : "! hlmt.possibly_mt_p(mt) " + ("hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) ") + mt;
        thread.resetMultipleValues();
        final SubLObject new_mt = precanonicalizer.safe_precanonicalizations(mt, $$BaseKB);
        final SubLObject dummy_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        mt = new_mt;
        if (NIL != mt) {
            mt = hlmt.reduce_hlmt(mt, within_queryP());
            mt = cycl_utilities.reify_when_closed_naut(mt);
            if ((((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL == wff_macros.within_wffP())) && (NIL != possibly_naut_p(hlmt.hlmt_monad_mt(mt)))) && (NIL != list_utilities.tree_find_if(symbol_function($sym2$SKOLEMIZE_FORWARD_), hlmt.hlmt_monad_mt(mt), UNPROVIDED))) {
                mt = czer_main.canonicalize_term(mt, mt_vars.$mt_mt$.getGlobalValue());
            }
            mt = canonicalize_hlmt_int(mt);
        }
        return mt;
    }

    /**
     * Convert MT into a HLMT and return it, otherwise generate an error.
     */
    @LispMethod(comment = "Convert MT into a HLMT and return it, otherwise generate an error.")
    public static final SubLObject coerce_to_hlmt_alt(SubLObject mt) {
        {
            SubLObject v_hlmt = com.cyc.cycjava.cycl.hlmt_czer.canonicalize_hlmt(mt);
            SubLTrampolineFile.checkType(v_hlmt, $sym3$HLMT_);
            return v_hlmt;
        }
    }

    /**
     * Convert MT into a HLMT and return it, otherwise generate an error.
     */
    @LispMethod(comment = "Convert MT into a HLMT and return it, otherwise generate an error.")
    public static SubLObject coerce_to_hlmt(final SubLObject mt) {
        final SubLObject v_hlmt = canonicalize_hlmt(mt);
        assert NIL != hlmt.hlmtP(v_hlmt) : "! hlmt.hlmtP(v_hlmt) " + ("hlmt.hlmtP(v_hlmt) " + "CommonSymbols.NIL != hlmt.hlmtP(v_hlmt) ") + v_hlmt;
        return v_hlmt;
    }

    public static final SubLObject canonicalize_hlmt_int_alt(SubLObject v_hlmt) {
        if (NIL != hlmt.mt_space_naut_p(v_hlmt)) {
            v_hlmt = com.cyc.cycjava.cycl.hlmt_czer.canonicalize_hlmt_time_dimension(v_hlmt);
            {
                SubLObject dimensions = hlmt.hlmt_dimensions(v_hlmt);
                dimensions = com.cyc.cycjava.cycl.hlmt_czer.sort_hlmt_dimensions(dimensions);
                v_hlmt = hlmt.new_hlmt(dimensions);
            }
        }
        if ((NIL != within_assertP()) && (NIL != hlmt.hlmt_with_anytime_psc_p(v_hlmt))) {
            v_hlmt = NIL;
        }
        return v_hlmt;
    }

    public static SubLObject canonicalize_hlmt_int(SubLObject v_hlmt) {
        if (NIL != hlmt.mt_space_naut_p(v_hlmt)) {
            v_hlmt = canonicalize_hlmt_time_dimension(v_hlmt);
            SubLObject dimensions = hlmt.hlmt_dimensions(v_hlmt);
            dimensions = sort_hlmt_dimensions(dimensions);
            v_hlmt = hlmt.new_hlmt(dimensions);
        }
        if ((NIL != within_assertP()) && (NIL != hlmt.hlmt_with_anytime_psc_p(v_hlmt))) {
            v_hlmt = NIL;
        }
        return v_hlmt;
    }

    /**
     *
     *
     * @unknown DIMS. Sorts DIMS destructively.
     */
    @LispMethod(comment = "@unknown DIMS. Sorts DIMS destructively.")
    public static final SubLObject sort_hlmt_dimensions_alt(SubLObject dims) {
        return list_utilities.sort_via_position(dims, hlmt.mt_dimension_types(), EQ, SINGLE_DIMENSION_MT_DIMENSION);
    }

    /**
     *
     *
     * @unknown DIMS. Sorts DIMS destructively.
     */
    @LispMethod(comment = "@unknown DIMS. Sorts DIMS destructively.")
    public static SubLObject sort_hlmt_dimensions(final SubLObject dims) {
        return list_utilities.sort_via_position(dims, hlmt.mt_dimension_types(), EQL, SINGLE_DIMENSION_MT_DIMENSION);
    }

    public static final SubLObject canonicalize_hlmt_time_dimension_alt(SubLObject v_hlmt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_dim = hlmt.hlmt_temporal_mt(v_hlmt);
                if (NIL != time_dim) {
                    if (NIL != hlmt.anytime_psc_p(time_dim)) {
                    } else {
                        if (NIL != hlmt.anytime_during_psc_fn_naut_p(time_dim)) {
                            {
                                SubLObject index = hlmt.anytime_during_psc_fn_time_interval(time_dim);
                                if (NIL != time_interval_utilities.date_interval_p(index)) {
                                    index = time_interval_utilities.canonicalize_time_interval(index);
                                    if (NIL != date_utilities.always_time_intervalP(index)) {
                                        time_dim = hlmt.anytime_psc();
                                    } else {
                                        time_dim = hlmt.new_anytime_during_psc_naut(index);
                                    }
                                    v_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim);
                                }
                            }
                        } else {
                            {
                                SubLObject index = NIL;
                                SubLObject param = NIL;
                                thread.resetMultipleValues();
                                {
                                    SubLObject index_1 = hlmt.mt_time_dim_nat_temporal_values(time_dim);
                                    SubLObject param_2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    index = index_1;
                                    param = param_2;
                                }
                                if (NIL != time_interval_utilities.date_interval_p(index)) {
                                    index = time_interval_utilities.canonicalize_time_interval(index);
                                    time_dim = hlmt.new_time_dimension(index, param);
                                    v_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim);
                                }
                            }
                        }
                    }
                }
            }
            return v_hlmt;
        }
    }

    public static SubLObject canonicalize_hlmt_time_dimension(SubLObject v_hlmt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time_dim = hlmt.hlmt_temporal_mt(v_hlmt);
        if (NIL != time_dim) {
            if (NIL == hlmt.anytime_psc_p(time_dim)) {
                if (NIL != hlmt.anytime_during_psc_fn_naut_p(time_dim)) {
                    SubLObject index = hlmt.anytime_during_psc_fn_time_interval(time_dim);
                    if (NIL != time_interval_utilities.date_interval_p(index)) {
                        index = time_interval_utilities.canonicalize_time_interval(index);
                        if (NIL != date_utilities.always_time_intervalP(index)) {
                            time_dim = hlmt.anytime_psc();
                        } else {
                            time_dim = hlmt.new_anytime_during_psc_naut(index);
                        }
                        v_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim);
                    }
                } else {
                    SubLObject index = NIL;
                    SubLObject param = NIL;
                    thread.resetMultipleValues();
                    final SubLObject index_$1 = hlmt.mt_time_dim_nat_temporal_values(time_dim);
                    final SubLObject param_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    index = index_$1;
                    param = param_$2;
                    if (NIL != time_interval_utilities.date_interval_p(index)) {
                        index = time_interval_utilities.canonicalize_time_interval(index);
                        time_dim = hlmt.new_time_dimension(index, param);
                        v_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim);
                    }
                }
            }
        }
        return v_hlmt;
    }

    /**
     *
     *
     * @unknown a sentence which would be equivalent to ASENT if SENSE is :POS and (#$not ASENT) if SENSE is :NEG.
     */
    @LispMethod(comment = "@unknown a sentence which would be equivalent to ASENT if SENSE is :POS and (#$not ASENT) if SENSE is :NEG.")
    public static final SubLObject tense_recursive_expander_alt(SubLObject asent, SubLObject sense, SubLObject v_hlmt) {
        {
            SubLObject negatedP = eq($NEG, sense);
            return NIL != hlmt.atemporal_hlmtP(v_hlmt) ? ((SubLObject) (com.cyc.cycjava.cycl.hlmt_czer.tense_recursive_expander_atemporal(asent, v_hlmt, negatedP))) : com.cyc.cycjava.cycl.hlmt_czer.tense_recursive_expander_temporal(asent, v_hlmt, negatedP);
        }
    }

    /**
     *
     *
     * @unknown a sentence which would be equivalent to ASENT if SENSE is :POS and (#$not ASENT) if SENSE is :NEG.
     */
    @LispMethod(comment = "@unknown a sentence which would be equivalent to ASENT if SENSE is :POS and (#$not ASENT) if SENSE is :NEG.")
    public static SubLObject tense_recursive_expander(final SubLObject asent, final SubLObject sense, final SubLObject v_hlmt) {
        final SubLObject negatedP = eq($NEG, sense);
        return NIL != hlmt.atemporal_hlmtP(v_hlmt) ? tense_recursive_expander_atemporal(asent, v_hlmt, negatedP) : tense_recursive_expander_temporal(asent, v_hlmt, negatedP);
    }

    public static final SubLObject tense_recursive_expander_atemporal_alt(SubLObject asent, SubLObject v_hlmt, SubLObject negatedP) {
        return values(com.cyc.cycjava.cycl.hlmt_czer.remove_tense_operators(asent, negatedP), v_hlmt);
    }

    public static SubLObject tense_recursive_expander_atemporal(final SubLObject asent, final SubLObject v_hlmt, final SubLObject negatedP) {
        return values(remove_tense_operators(asent, negatedP), v_hlmt);
    }

    public static final SubLObject remove_tense_operators_alt(SubLObject formula, SubLObject negatedP) {
        if (NIL != el_negation_p(formula)) {
            return com.cyc.cycjava.cycl.hlmt_czer.remove_tense_operators(cycl_utilities.formula_arg1(formula, UNPROVIDED), makeBoolean(NIL == negatedP));
        } else {
            {
                SubLObject operator = cycl_utilities.formula_operator(formula);
                if (NIL != cyc_const_tense_operator_p(operator)) {
                    return com.cyc.cycjava.cycl.hlmt_czer.remove_tense_operators(cycl_utilities.formula_arg1(formula, UNPROVIDED), negatedP);
                } else {
                    return NIL != negatedP ? ((SubLObject) (make_negation(formula))) : formula;
                }
            }
        }
    }

    public static SubLObject remove_tense_operators(final SubLObject formula, final SubLObject negatedP) {
        if (NIL != el_negation_p(formula)) {
            return remove_tense_operators(cycl_utilities.formula_arg1(formula, UNPROVIDED), makeBoolean(NIL == negatedP));
        }
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        if (NIL != cyc_const_tense_operator_p(operator)) {
            return remove_tense_operators(cycl_utilities.formula_arg1(formula, UNPROVIDED), negatedP);
        }
        return NIL != negatedP ? make_negation(formula) : formula;
    }

    public static final SubLObject tense_recursive_expander_temporal_alt(SubLObject asent, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_formula = com.cyc.cycjava.cycl.hlmt_czer.tense_recursive_expander_temporal_int(asent, v_hlmt, negatedP);
                SubLObject new_hlmt = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(new_formula, com.cyc.cycjava.cycl.hlmt_czer.canonicalize_hlmt(new_hlmt));
            }
        }
    }

    public static SubLObject tense_recursive_expander_temporal(final SubLObject asent, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_formula = tense_recursive_expander_temporal_int(asent, v_hlmt, negatedP);
        final SubLObject new_hlmt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(new_formula, canonicalize_hlmt(new_hlmt));
    }

    public static final SubLObject tense_recursive_expander_temporal_int_alt(SubLObject el_formula, SubLObject v_hlmt, SubLObject negatedP) {
        if (NIL != el_negation_p(el_formula)) {
            return com.cyc.cycjava.cycl.hlmt_czer.tense_recursive_expander_temporal_int(cycl_utilities.formula_arg1(el_formula, UNPROVIDED), v_hlmt, makeBoolean(NIL == negatedP));
        } else {
            {
                SubLObject operator = cycl_utilities.formula_operator(el_formula);
                if (NIL != cyc_const_tense_operator_p(operator)) {
                    if (NIL != negatedP) {
                        operator = com.cyc.cycjava.cycl.hlmt_czer.negated_tense_operator(operator);
                    }
                    return com.cyc.cycjava.cycl.hlmt_czer.tensify_sentence(operator, cycl_utilities.formula_arg1(el_formula, UNPROVIDED), v_hlmt, negatedP);
                } else {
                    if (NIL != cyc_const_metric_tense_operator_p(operator)) {
                        if (NIL != negatedP) {
                            Errors.error($str_alt7$Can_t_yet_handle_negated_metric_t);
                        }
                        return com.cyc.cycjava.cycl.hlmt_czer.metrically_tensify_sentence(el_formula, v_hlmt, negatedP);
                    } else {
                        if (NIL != negatedP) {
                            return values(make_negation(el_formula), v_hlmt);
                        } else {
                            return values(el_formula, v_hlmt);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject tense_recursive_expander_temporal_int(final SubLObject el_formula, final SubLObject v_hlmt, final SubLObject negatedP) {
        if (NIL != el_negation_p(el_formula)) {
            return tense_recursive_expander_temporal_int(cycl_utilities.formula_arg1(el_formula, UNPROVIDED), v_hlmt, makeBoolean(NIL == negatedP));
        }
        SubLObject operator = cycl_utilities.formula_operator(el_formula);
        if (NIL != cyc_const_tense_operator_p(operator)) {
            if (NIL != negatedP) {
                operator = negated_tense_operator(operator);
            }
            return tensify_sentence(operator, cycl_utilities.formula_arg1(el_formula, UNPROVIDED), v_hlmt, negatedP);
        }
        if (NIL != cyc_const_metric_tense_operator_p(operator)) {
            if (NIL != negatedP) {
                Errors.error($str7$Can_t_yet_handle_negated_metric_t);
            }
            return metrically_tensify_sentence(el_formula, v_hlmt, negatedP);
        }
        if (NIL != negatedP) {
            return values(make_negation(el_formula), v_hlmt);
        }
        return values(el_formula, v_hlmt);
    }

    public static final SubLObject negated_tense_operator_alt(SubLObject operator) {
        {
            SubLObject pcase_var = operator;
            if (pcase_var.eql($$was)) {
                return $$hasAlwaysBeen;
            } else {
                if (pcase_var.eql($$willBe)) {
                    return $$willAlwaysBe;
                } else {
                    if (pcase_var.eql($$hasAlwaysBeen)) {
                        return $$was;
                    } else {
                        if (pcase_var.eql($$willAlwaysBe)) {
                            return $$willBe;
                        } else {
                            return Errors.error($str_alt12$_a_is_not_a_known_tense_operator_, operator);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject negated_tense_operator(final SubLObject operator) {
        if (operator.eql($$was)) {
            return $$hasAlwaysBeen;
        }
        if (operator.eql($$willBe)) {
            return $$willAlwaysBe;
        }
        if (operator.eql($$hasAlwaysBeen)) {
            return $$was;
        }
        if (operator.eql($$willAlwaysBe)) {
            return $$willBe;
        }
        return Errors.error($str12$_a_is_not_a_known_tense_operator_, operator);
    }

    public static final SubLObject tensify_sentence_alt(SubLObject operator, SubLObject formula, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = operator;
                if (pcase_var.eql($$was)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject formula_3 = com.cyc.cycjava.cycl.hlmt_czer.tensify_was_sentence(formula, v_hlmt, negatedP);
                        SubLObject v_hlmt_4 = thread.secondMultipleValue();
                        SubLObject negatedP_5 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        formula = formula_3;
                        v_hlmt = v_hlmt_4;
                        negatedP = negatedP_5;
                    }
                } else {
                    if (pcase_var.eql($$willBe)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject formula_6 = com.cyc.cycjava.cycl.hlmt_czer.tensify_will_be_sentence(formula, v_hlmt, negatedP);
                            SubLObject v_hlmt_7 = thread.secondMultipleValue();
                            SubLObject negatedP_8 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            formula = formula_6;
                            v_hlmt = v_hlmt_7;
                            negatedP = negatedP_8;
                        }
                    } else {
                        if (pcase_var.eql($$hasAlwaysBeen)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject formula_9 = com.cyc.cycjava.cycl.hlmt_czer.tensify_has_always_been_sentence(formula, v_hlmt, negatedP);
                                SubLObject v_hlmt_10 = thread.secondMultipleValue();
                                SubLObject negatedP_11 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                formula = formula_9;
                                v_hlmt = v_hlmt_10;
                                negatedP = negatedP_11;
                            }
                        } else {
                            if (pcase_var.eql($$willAlwaysBe)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject formula_12 = com.cyc.cycjava.cycl.hlmt_czer.tensify_will_always_be_sentence(formula, v_hlmt, negatedP);
                                    SubLObject v_hlmt_13 = thread.secondMultipleValue();
                                    SubLObject negatedP_14 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    formula = formula_12;
                                    v_hlmt = v_hlmt_13;
                                    negatedP = negatedP_14;
                                }
                            } else {
                                Errors.error($str_alt12$_a_is_not_a_known_tense_operator_, operator);
                            }
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.hlmt_czer.tense_recursive_expander_temporal_int(formula, v_hlmt, negatedP);
        }
    }

    public static SubLObject tensify_sentence(final SubLObject operator, SubLObject formula, SubLObject v_hlmt, SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operator.eql($$was)) {
            thread.resetMultipleValues();
            final SubLObject formula_$3 = tensify_was_sentence(formula, v_hlmt, negatedP);
            final SubLObject v_hlmt_$4 = thread.secondMultipleValue();
            final SubLObject negatedP_$5 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            formula = formula_$3;
            v_hlmt = v_hlmt_$4;
            negatedP = negatedP_$5;
        } else
            if (operator.eql($$willBe)) {
                thread.resetMultipleValues();
                final SubLObject formula_$4 = tensify_will_be_sentence(formula, v_hlmt, negatedP);
                final SubLObject v_hlmt_$5 = thread.secondMultipleValue();
                final SubLObject negatedP_$6 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                formula = formula_$4;
                v_hlmt = v_hlmt_$5;
                negatedP = negatedP_$6;
            } else
                if (operator.eql($$hasAlwaysBeen)) {
                    thread.resetMultipleValues();
                    final SubLObject formula_$5 = tensify_has_always_been_sentence(formula, v_hlmt, negatedP);
                    final SubLObject v_hlmt_$6 = thread.secondMultipleValue();
                    final SubLObject negatedP_$7 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    formula = formula_$5;
                    v_hlmt = v_hlmt_$6;
                    negatedP = negatedP_$7;
                } else
                    if (operator.eql($$willAlwaysBe)) {
                        thread.resetMultipleValues();
                        final SubLObject formula_$6 = tensify_will_always_be_sentence(formula, v_hlmt, negatedP);
                        final SubLObject v_hlmt_$7 = thread.secondMultipleValue();
                        final SubLObject negatedP_$8 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        formula = formula_$6;
                        v_hlmt = v_hlmt_$7;
                        negatedP = negatedP_$8;
                    } else {
                        Errors.error($str12$_a_is_not_a_known_tense_operator_, operator);
                    }



        return tense_recursive_expander_temporal_int(formula, v_hlmt, negatedP);
    }

    public static final SubLObject tensify_was_sentence_alt(SubLObject formula, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interval = NIL;
                SubLObject parameter = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject interval_15 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject parameter_16 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    interval = interval_15;
                    parameter = parameter_16;
                }
                {
                    SubLObject new_interval = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, $$Null_TimeParameter);
                    SubLObject fixed_time_dim = hlmt.new_time_dimension(new_interval, $$TimePoint);
                    SubLObject var = cycl_variables.make_el_var(gensym($$$T));
                    SubLObject variable_time_dim = (NIL != within_assert_tense_czer_modeP()) ? ((SubLObject) (hlmt.new_time_dimension(var, UNPROVIDED))) : var;
                    SubLObject new_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, variable_time_dim);
                    SubLObject new_formula = (NIL != negatedP) ? ((SubLObject) (make_negation(formula))) : formula;
                    SubLObject new_sentence = list($$thereExists, var, list($$and, list($$temporalMicrotheoriesIntersect, fixed_time_dim, variable_time_dim), list($$ist, new_hlmt, new_formula)));
                    return values(new_sentence, $$BaseKB, NIL);
                }
            }
        }
    }

    public static SubLObject tensify_was_sentence(final SubLObject formula, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject interval = NIL;
        SubLObject parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject interval_$15 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject parameter_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        interval = interval_$15;
        parameter = parameter_$16;
        final SubLObject new_interval = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, $$Null_TimeParameter);
        final SubLObject fixed_time_dim = hlmt.new_time_dimension(new_interval, $$TimePoint);
        final SubLObject var = cycl_variables.make_el_var(gensym($$$T));
        final SubLObject variable_time_dim = (NIL != czer_vars.within_assert_tense_czer_modeP()) ? hlmt.new_time_dimension(var, UNPROVIDED) : var;
        final SubLObject new_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, variable_time_dim);
        final SubLObject new_formula = (NIL != negatedP) ? make_negation(formula) : formula;
        final SubLObject new_sentence = list($$thereExists, var, list($$and, list($$temporalMicrotheoriesIntersect, fixed_time_dim, variable_time_dim), list($$ist, new_hlmt, new_formula)));
        return values(new_sentence, $$BaseKB, NIL);
    }

    public static final SubLObject tensify_will_be_sentence_alt(SubLObject formula, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject interval = NIL;
                SubLObject parameter = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject interval_17 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject parameter_18 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    interval = interval_17;
                    parameter = parameter_18;
                }
                {
                    SubLObject new_interval = time_parameter_utilities.time_started_by_first_type_in_interval(interval, $$Null_TimeParameter);
                    SubLObject fixed_time_dim = hlmt.new_time_dimension(new_interval, $$TimePoint);
                    SubLObject var = cycl_variables.make_el_var(gensym($$$T));
                    SubLObject variable_time_dim = (NIL != within_assert_tense_czer_modeP()) ? ((SubLObject) (hlmt.new_time_dimension(var, UNPROVIDED))) : var;
                    SubLObject new_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, variable_time_dim);
                    SubLObject new_formula = (NIL != negatedP) ? ((SubLObject) (make_negation(formula))) : formula;
                    SubLObject new_sentence = list($$thereExists, var, list($$and, list($$temporalMicrotheoriesIntersect, fixed_time_dim, variable_time_dim), list($$ist, new_hlmt, new_formula)));
                    return values(new_sentence, $$BaseKB, NIL);
                }
            }
        }
    }

    public static SubLObject tensify_will_be_sentence(final SubLObject formula, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject interval = NIL;
        SubLObject parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject interval_$17 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject parameter_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        interval = interval_$17;
        parameter = parameter_$18;
        final SubLObject new_interval = time_parameter_utilities.time_started_by_first_type_in_interval(interval, $$Null_TimeParameter);
        final SubLObject fixed_time_dim = hlmt.new_time_dimension(new_interval, $$TimePoint);
        final SubLObject var = cycl_variables.make_el_var(gensym($$$T));
        final SubLObject variable_time_dim = (NIL != czer_vars.within_assert_tense_czer_modeP()) ? hlmt.new_time_dimension(var, UNPROVIDED) : var;
        final SubLObject new_hlmt = hlmt.replace_hlmt_dimension($TIME, v_hlmt, variable_time_dim);
        final SubLObject new_formula = (NIL != negatedP) ? make_negation(formula) : formula;
        final SubLObject new_sentence = list($$thereExists, var, list($$and, list($$temporalMicrotheoriesIntersect, fixed_time_dim, variable_time_dim), list($$ist, new_hlmt, new_formula)));
        return values(new_sentence, $$BaseKB, NIL);
    }

    public static final SubLObject tensify_has_always_been_sentence_alt(SubLObject formula, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_dim = NIL;
                SubLObject interval = NIL;
                SubLObject parameter = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject interval_19 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject parameter_20 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    interval = interval_19;
                    parameter = parameter_20;
                }
                {
                    SubLObject time_dim_interval = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, parameter);
                    if (NIL == time_dim_interval) {
                        time_dim_interval = list($const20$IntervalEndedByLastSubintervalOfT, interval, parameter);
                    }
                    time_dim = hlmt.new_time_dimension(time_dim_interval, $$TimePoint);
                }
                return values(formula, hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim), negatedP);
            }
        }
    }

    public static SubLObject tensify_has_always_been_sentence(final SubLObject formula, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time_dim = NIL;
        SubLObject interval = NIL;
        SubLObject parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject interval_$19 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject parameter_$20 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        interval = interval_$19;
        parameter = parameter_$20;
        SubLObject time_dim_interval = time_parameter_utilities.time_ended_by_last_type_in_interval(interval, parameter);
        if (NIL == time_dim_interval) {
            time_dim_interval = list($const20$IntervalEndedByLastSubintervalOfT, interval, parameter);
        }
        time_dim = hlmt.new_time_dimension(time_dim_interval, $$TimePoint);
        return values(formula, hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim), negatedP);
    }

    public static final SubLObject tensify_will_always_be_sentence_alt(SubLObject formula, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time_dim = NIL;
                SubLObject interval = NIL;
                SubLObject parameter = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject interval_21 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                    SubLObject parameter_22 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    interval = interval_21;
                    parameter = parameter_22;
                }
                {
                    SubLObject time_dim_interval = time_parameter_utilities.time_started_by_first_type_in_interval(interval, parameter);
                    if (NIL == time_dim_interval) {
                        time_dim_interval = list($const21$IntervalStartedByFirstSubinterval, interval, parameter);
                    }
                    time_dim = hlmt.new_time_dimension(time_dim_interval, $$TimePoint);
                }
                return values(formula, hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim), negatedP);
            }
        }
    }

    public static SubLObject tensify_will_always_be_sentence(final SubLObject formula, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time_dim = NIL;
        SubLObject interval = NIL;
        SubLObject parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject interval_$21 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject parameter_$22 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        interval = interval_$21;
        parameter = parameter_$22;
        SubLObject time_dim_interval = time_parameter_utilities.time_started_by_first_type_in_interval(interval, parameter);
        if (NIL == time_dim_interval) {
            time_dim_interval = list($const21$IntervalStartedByFirstSubinterval, interval, parameter);
        }
        time_dim = hlmt.new_time_dimension(time_dim_interval, $$TimePoint);
        return values(formula, hlmt.replace_hlmt_dimension($TIME, v_hlmt, time_dim), negatedP);
    }

    public static final SubLObject metrically_tensify_sentence_alt(SubLObject sentence, SubLObject v_hlmt, SubLObject negatedP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject operator = unmake_ternary_formula(sentence);
                SubLObject type = thread.secondMultipleValue();
                SubLObject n = thread.thirdMultipleValue();
                SubLObject formula = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject interval = NIL;
                    SubLObject parameter = NIL;
                    thread.resetMultipleValues();
                    {
                        SubLObject interval_23 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
                        SubLObject parameter_24 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        interval = interval_23;
                        parameter = parameter_24;
                    }
                    if (NIL != com.cyc.cycjava.cycl.hlmt_czer.interval_metrically_inappropriateP(interval, operator, type)) {
                        return values($$False, $$BaseKB);
                    } else {
                        return com.cyc.cycjava.cycl.hlmt_czer.tense_recursive_expander_temporal_int(formula, com.cyc.cycjava.cycl.hlmt_czer.metrically_tensify_hlmt(v_hlmt, operator, type, n), negatedP);
                    }
                }
            }
        }
    }

    public static SubLObject metrically_tensify_sentence(final SubLObject sentence, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject operator = unmake_ternary_formula(sentence);
        final SubLObject type = thread.secondMultipleValue();
        final SubLObject n = thread.thirdMultipleValue();
        final SubLObject formula = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject interval = NIL;
        SubLObject parameter = NIL;
        thread.resetMultipleValues();
        final SubLObject interval_$23 = hlmt.explode_hlmt_temporal_facets(v_hlmt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue());
        final SubLObject parameter_$24 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        interval = interval_$23;
        parameter = parameter_$24;
        if (NIL != interval_metrically_inappropriateP(interval, operator, type)) {
            return values($$False, $$BaseKB);
        }
        return tense_recursive_expander_temporal_int(formula, metrically_tensify_hlmt(v_hlmt, operator, type, n), negatedP);
    }

    public static final SubLObject interval_metrically_inappropriateP_alt(SubLObject interval, SubLObject operator, SubLObject type) {
        if (!((NIL != time_interval_utilities.date_interval_p(interval)) && (NIL != time_interval_utilities.metric_tense_supported_type_p(type)))) {
            return NIL;
        }
        {
            SubLObject pcase_var = operator;
            if (pcase_var.eql($$was_Metric)) {
                {
                    SubLObject before_interval = time_parameter_utilities.nth_type_ending_before_start_of_interval(interval, type, ZERO_INTEGER);
                    SubLObject after_interval = time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, ZERO_INTEGER);
                    return makeBoolean(!(before_interval.equal(after_interval) || after_interval.equal(time_parameter_utilities.nth_type_starting_after_start_of_interval(before_interval, type, ZERO_INTEGER))));
                }
            } else {
                if (pcase_var.eql($$willBe_Metric)) {
                    {
                        SubLObject before_interval = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, ZERO_INTEGER);
                        SubLObject after_interval = time_parameter_utilities.nth_type_starting_after_end_of_interval(interval, type, ZERO_INTEGER);
                        return makeBoolean(!(before_interval.equal(after_interval) || after_interval.equal(time_parameter_utilities.nth_type_starting_after_start_of_interval(before_interval, type, ZERO_INTEGER))));
                    }
                } else {
                    return Errors.error($str_alt25$_a_is_not_a_metric_tense_operator, operator);
                }
            }
        }
    }

    public static SubLObject interval_metrically_inappropriateP(final SubLObject interval, final SubLObject operator, final SubLObject type) {
        if ((NIL == time_interval_utilities.date_interval_p(interval)) || (NIL == time_interval_utilities.metric_tense_supported_type_p(type))) {
            return NIL;
        }
        if (operator.eql($$was_Metric)) {
            final SubLObject before_interval = time_parameter_utilities.nth_type_ending_before_start_of_interval(interval, type, ZERO_INTEGER);
            final SubLObject after_interval = time_parameter_utilities.nth_type_ending_no_later_than_end_of_interval(interval, type, ZERO_INTEGER);
            return makeBoolean((!before_interval.equal(after_interval)) && (!after_interval.equal(time_parameter_utilities.nth_type_starting_after_start_of_interval(before_interval, type, ZERO_INTEGER))));
        }
        if (operator.eql($$willBe_Metric)) {
            final SubLObject before_interval = time_parameter_utilities.nth_type_starting_no_later_than_start_of_interval(interval, type, ZERO_INTEGER);
            final SubLObject after_interval = time_parameter_utilities.nth_type_starting_after_end_of_interval(interval, type, ZERO_INTEGER);
            return makeBoolean((!before_interval.equal(after_interval)) && (!after_interval.equal(time_parameter_utilities.nth_type_starting_after_start_of_interval(before_interval, type, ZERO_INTEGER))));
        }
        return Errors.error($str25$_a_is_not_a_metric_tense_operator, operator);
    }

    public static final SubLObject metrically_tensify_hlmt_alt(SubLObject v_hlmt, SubLObject tense_operator, SubLObject type, SubLObject num) {
        {
            SubLObject pcase_var = tense_operator;
            if (pcase_var.eql($$was_Metric)) {
                return com.cyc.cycjava.cycl.hlmt_czer.was_metric_hlmt(v_hlmt, type, num);
            } else {
                if (pcase_var.eql($$willBe_Metric)) {
                    return com.cyc.cycjava.cycl.hlmt_czer.will_be_metric_hlmt(v_hlmt, type, num);
                } else {
                    return Errors.error($str_alt25$_a_is_not_a_metric_tense_operator, tense_operator);
                }
            }
        }
    }

    public static SubLObject metrically_tensify_hlmt(final SubLObject v_hlmt, final SubLObject tense_operator, final SubLObject type, final SubLObject num) {
        if (tense_operator.eql($$was_Metric)) {
            return was_metric_hlmt(v_hlmt, type, num);
        }
        if (tense_operator.eql($$willBe_Metric)) {
            return will_be_metric_hlmt(v_hlmt, type, num);
        }
        return Errors.error($str25$_a_is_not_a_metric_tense_operator, tense_operator);
    }

    public static final SubLObject was_metric_hlmt_alt(SubLObject v_hlmt, SubLObject type, SubLObject amount) {
        {
            SubLObject atemporal_mt = hlmt.remove_hlmt_dimension($TIME, v_hlmt);
            SubLObject interval = hlmt.extract_hlmt_temporal_index(v_hlmt);
            SubLObject new_interval = time_interval_utilities.was_metric_before_interval(interval, type, amount);
            SubLObject time_dim = hlmt.new_time_dimension(new_interval, $$Null_TimeParameter);
            return hlmt.new_canonicalized_hlmt(cons(time_dim, hlmt.hlmt_dimensions(atemporal_mt)));
        }
    }

    public static SubLObject was_metric_hlmt(final SubLObject v_hlmt, final SubLObject type, final SubLObject amount) {
        final SubLObject atemporal_mt = hlmt.remove_hlmt_dimension($TIME, v_hlmt);
        final SubLObject interval = hlmt.extract_hlmt_temporal_index(v_hlmt);
        final SubLObject new_interval = time_interval_utilities.was_metric_before_interval(interval, type, amount);
        final SubLObject time_dim = hlmt.new_time_dimension(new_interval, $$Null_TimeParameter);
        return hlmt.new_canonicalized_hlmt(cons(time_dim, hlmt.hlmt_dimensions(atemporal_mt)));
    }

    public static final SubLObject will_be_metric_hlmt_alt(SubLObject v_hlmt, SubLObject type, SubLObject amount) {
        {
            SubLObject atemporal_mt = hlmt.remove_hlmt_dimension($TIME, v_hlmt);
            SubLObject interval = hlmt.extract_hlmt_temporal_index(v_hlmt);
            SubLObject new_interval = time_interval_utilities.will_be_metric_after_interval(interval, type, amount);
            SubLObject time_dim = hlmt.new_time_dimension(new_interval, $$Null_TimeParameter);
            return hlmt.new_canonicalized_hlmt(cons(time_dim, hlmt.hlmt_dimensions(atemporal_mt)));
        }
    }

    public static SubLObject will_be_metric_hlmt(final SubLObject v_hlmt, final SubLObject type, final SubLObject amount) {
        final SubLObject atemporal_mt = hlmt.remove_hlmt_dimension($TIME, v_hlmt);
        final SubLObject interval = hlmt.extract_hlmt_temporal_index(v_hlmt);
        final SubLObject new_interval = time_interval_utilities.will_be_metric_after_interval(interval, type, amount);
        final SubLObject time_dim = hlmt.new_time_dimension(new_interval, $$Null_TimeParameter);
        return hlmt.new_canonicalized_hlmt(cons(time_dim, hlmt.hlmt_dimensions(atemporal_mt)));
    }

    public static final SubLObject tense_recursive_contractor_alt(SubLObject el_sentence, SubLObject mt) {
        if (NIL != el_existential_p(el_sentence)) {
            {
                SubLObject existential_sentence = quantified_sub_sentence(el_sentence);
                if (NIL != el_conjunction_p(existential_sentence)) {
                    {
                        SubLObject conjunction_lits = cycl_utilities.formula_args(existential_sentence, UNPROVIDED);
                        if (NIL != list_utilities.doubletonP(conjunction_lits)) {
                            {
                                SubLObject ist_sentence = find_if(IST_SENTENCE_P, conjunction_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject non_ist_sentence = list_utilities.find_if_not(IST_SENTENCE_P, conjunction_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject ist_sentence_mt = cycl_utilities.sentence_arg1(ist_sentence, UNPROVIDED);
                                SubLObject ist_sentence_formula = cycl_utilities.sentence_arg2(ist_sentence, UNPROVIDED);
                                if (cycl_utilities.sentence_arg0(non_ist_sentence) == $$temporalMicrotheoriesIntersect) {
                                    {
                                        SubLObject temporal_mt = (cycl_utilities.sentence_arg1(non_ist_sentence, UNPROVIDED).equal(ist_sentence_mt)) ? ((SubLObject) (cycl_utilities.sentence_arg2(non_ist_sentence, UNPROVIDED))) : cycl_utilities.sentence_arg1(non_ist_sentence, UNPROVIDED);
                                        SubLObject time_interval_relation = cycl_utilities.sentence_arg0(cycl_utilities.sentence_arg1(temporal_mt, UNPROVIDED));
                                        SubLObject time = cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(temporal_mt, UNPROVIDED), UNPROVIDED);
                                        SubLObject monad = cycl_utilities.hl_to_el(hlmt.hlmt_monad_mt(czer_main.canonicalize_assert_mt(ist_sentence_mt)));
                                        SubLObject tense_relation = NIL;
                                        SubLObject pcase_var = time_interval_relation;
                                        if (pcase_var.eql($$IntervalEndedByFn)) {
                                            tense_relation = $$was;
                                        } else {
                                            if (pcase_var.eql($$IntervalStartedByFn)) {
                                                tense_relation = $$willBe;
                                            }
                                        }
                                        if (NIL != tense_relation) {
                                            return values(make_unary_formula(tense_relation, ist_sentence_formula), list($$MtSpace, monad, listS($$MtTimeWithGranularityDimFn, time, $list_alt31)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return values(el_sentence, mt);
    }

    public static SubLObject tense_recursive_contractor(final SubLObject el_sentence, final SubLObject mt) {
        if (NIL != el_existential_p(el_sentence)) {
            final SubLObject existential_sentence = quantified_sub_sentence(el_sentence);
            if (NIL != el_conjunction_p(existential_sentence)) {
                final SubLObject conjunction_lits = cycl_utilities.formula_args(existential_sentence, UNPROVIDED);
                if (NIL != list_utilities.doubletonP(conjunction_lits)) {
                    final SubLObject ist_sentence = find_if(IST_SENTENCE_P, conjunction_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject non_ist_sentence = list_utilities.find_if_not(IST_SENTENCE_P, conjunction_lits, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject ist_sentence_mt = cycl_utilities.sentence_arg1(ist_sentence, UNPROVIDED);
                    final SubLObject ist_sentence_formula = cycl_utilities.sentence_arg2(ist_sentence, UNPROVIDED);
                    if (cycl_utilities.sentence_arg0(non_ist_sentence).eql($$temporalMicrotheoriesIntersect)) {
                        final SubLObject temporal_mt = (cycl_utilities.sentence_arg1(non_ist_sentence, UNPROVIDED).equal(ist_sentence_mt)) ? cycl_utilities.sentence_arg2(non_ist_sentence, UNPROVIDED) : cycl_utilities.sentence_arg1(non_ist_sentence, UNPROVIDED);
                        final SubLObject time_interval_relation = cycl_utilities.sentence_arg0(cycl_utilities.sentence_arg1(temporal_mt, UNPROVIDED));
                        final SubLObject time = cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(temporal_mt, UNPROVIDED), UNPROVIDED);
                        final SubLObject monad = cycl_utilities.hl_to_el(hlmt.hlmt_monad_mt(czer_main.canonicalize_assert_mt(ist_sentence_mt)));
                        SubLObject tense_relation = NIL;
                        final SubLObject pcase_var = time_interval_relation;
                        if (pcase_var.eql($$IntervalEndedByFn)) {
                            tense_relation = $$was;
                        } else
                            if (pcase_var.eql($$IntervalStartedByFn)) {
                                tense_relation = $$willBe;
                            }

                        if (NIL != tense_relation) {
                            return values(make_unary_formula(tense_relation, ist_sentence_formula), list($$MtSpace, monad, listS($$MtTimeWithGranularityDimFn, time, $list31)));
                        }
                    }
                }
            }
        }
        return values(el_sentence, mt);
    }

    public static final SubLObject declare_hlmt_czer_file_alt() {
        declareFunction("canonicalize_hlmt", "CANONICALIZE-HLMT", 1, 0, false);
        declareFunction("coerce_to_hlmt", "COERCE-TO-HLMT", 1, 0, false);
        declareFunction("canonicalize_hlmt_int", "CANONICALIZE-HLMT-INT", 1, 0, false);
        declareFunction("sort_hlmt_dimensions", "SORT-HLMT-DIMENSIONS", 1, 0, false);
        declareFunction("canonicalize_hlmt_time_dimension", "CANONICALIZE-HLMT-TIME-DIMENSION", 1, 0, false);
        declareFunction("tense_recursive_expander", "TENSE-RECURSIVE-EXPANDER", 3, 0, false);
        declareFunction("tense_recursive_expander_atemporal", "TENSE-RECURSIVE-EXPANDER-ATEMPORAL", 3, 0, false);
        declareFunction("remove_tense_operators", "REMOVE-TENSE-OPERATORS", 2, 0, false);
        declareFunction("tense_recursive_expander_temporal", "TENSE-RECURSIVE-EXPANDER-TEMPORAL", 3, 0, false);
        declareFunction("tense_recursive_expander_temporal_int", "TENSE-RECURSIVE-EXPANDER-TEMPORAL-INT", 3, 0, false);
        declareFunction("negated_tense_operator", "NEGATED-TENSE-OPERATOR", 1, 0, false);
        declareFunction("tensify_sentence", "TENSIFY-SENTENCE", 4, 0, false);
        declareFunction("tensify_was_sentence", "TENSIFY-WAS-SENTENCE", 3, 0, false);
        declareFunction("tensify_will_be_sentence", "TENSIFY-WILL-BE-SENTENCE", 3, 0, false);
        declareFunction("tensify_has_always_been_sentence", "TENSIFY-HAS-ALWAYS-BEEN-SENTENCE", 3, 0, false);
        declareFunction("tensify_will_always_be_sentence", "TENSIFY-WILL-ALWAYS-BE-SENTENCE", 3, 0, false);
        declareFunction("metrically_tensify_sentence", "METRICALLY-TENSIFY-SENTENCE", 3, 0, false);
        declareFunction("interval_metrically_inappropriateP", "INTERVAL-METRICALLY-INAPPROPRIATE?", 3, 0, false);
        declareFunction("metrically_tensify_hlmt", "METRICALLY-TENSIFY-HLMT", 4, 0, false);
        declareFunction("was_metric_hlmt", "WAS-METRIC-HLMT", 3, 0, false);
        declareFunction("will_be_metric_hlmt", "WILL-BE-METRIC-HLMT", 3, 0, false);
        declareFunction("tense_recursive_contractor", "TENSE-RECURSIVE-CONTRACTOR", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cze_hlmt_class", "SUBLOOP-RESERVED-INITIALIZE-CZE-HLMT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cze_hlmt_instance", "SUBLOOP-RESERVED-INITIALIZE-CZE-HLMT-INSTANCE", 1, 0, false);
        declareFunction("cze_hlmt_p", "CZE-HLMT-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_hlmt_czer_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("canonicalize_hlmt", "CANONICALIZE-HLMT", 1, 0, false);
            declareFunction("coerce_to_hlmt", "COERCE-TO-HLMT", 1, 0, false);
            declareFunction("canonicalize_hlmt_int", "CANONICALIZE-HLMT-INT", 1, 0, false);
            declareFunction("sort_hlmt_dimensions", "SORT-HLMT-DIMENSIONS", 1, 0, false);
            declareFunction("canonicalize_hlmt_time_dimension", "CANONICALIZE-HLMT-TIME-DIMENSION", 1, 0, false);
            declareFunction("tense_recursive_expander", "TENSE-RECURSIVE-EXPANDER", 3, 0, false);
            declareFunction("tense_recursive_expander_atemporal", "TENSE-RECURSIVE-EXPANDER-ATEMPORAL", 3, 0, false);
            declareFunction("remove_tense_operators", "REMOVE-TENSE-OPERATORS", 2, 0, false);
            declareFunction("tense_recursive_expander_temporal", "TENSE-RECURSIVE-EXPANDER-TEMPORAL", 3, 0, false);
            declareFunction("tense_recursive_expander_temporal_int", "TENSE-RECURSIVE-EXPANDER-TEMPORAL-INT", 3, 0, false);
            declareFunction("negated_tense_operator", "NEGATED-TENSE-OPERATOR", 1, 0, false);
            declareFunction("tensify_sentence", "TENSIFY-SENTENCE", 4, 0, false);
            declareFunction("tensify_was_sentence", "TENSIFY-WAS-SENTENCE", 3, 0, false);
            declareFunction("tensify_will_be_sentence", "TENSIFY-WILL-BE-SENTENCE", 3, 0, false);
            declareFunction("tensify_has_always_been_sentence", "TENSIFY-HAS-ALWAYS-BEEN-SENTENCE", 3, 0, false);
            declareFunction("tensify_will_always_be_sentence", "TENSIFY-WILL-ALWAYS-BE-SENTENCE", 3, 0, false);
            declareFunction("metrically_tensify_sentence", "METRICALLY-TENSIFY-SENTENCE", 3, 0, false);
            declareFunction("interval_metrically_inappropriateP", "INTERVAL-METRICALLY-INAPPROPRIATE?", 3, 0, false);
            declareFunction("metrically_tensify_hlmt", "METRICALLY-TENSIFY-HLMT", 4, 0, false);
            declareFunction("was_metric_hlmt", "WAS-METRIC-HLMT", 3, 0, false);
            declareFunction("will_be_metric_hlmt", "WILL-BE-METRIC-HLMT", 3, 0, false);
            declareFunction("tense_recursive_contractor", "TENSE-RECURSIVE-CONTRACTOR", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_cze_hlmt_class", "SUBLOOP-RESERVED-INITIALIZE-CZE-HLMT-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_cze_hlmt_instance", "SUBLOOP-RESERVED-INITIALIZE-CZE-HLMT-INSTANCE", 1, 0, false);
            declareFunction("cze_hlmt_p", "CZE-HLMT-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_hlmt_czer_file_Previous() {
        declareFunction("canonicalize_hlmt", "CANONICALIZE-HLMT", 1, 0, false);
        declareFunction("coerce_to_hlmt", "COERCE-TO-HLMT", 1, 0, false);
        declareFunction("canonicalize_hlmt_int", "CANONICALIZE-HLMT-INT", 1, 0, false);
        declareFunction("sort_hlmt_dimensions", "SORT-HLMT-DIMENSIONS", 1, 0, false);
        declareFunction("canonicalize_hlmt_time_dimension", "CANONICALIZE-HLMT-TIME-DIMENSION", 1, 0, false);
        declareFunction("tense_recursive_expander", "TENSE-RECURSIVE-EXPANDER", 3, 0, false);
        declareFunction("tense_recursive_expander_atemporal", "TENSE-RECURSIVE-EXPANDER-ATEMPORAL", 3, 0, false);
        declareFunction("remove_tense_operators", "REMOVE-TENSE-OPERATORS", 2, 0, false);
        declareFunction("tense_recursive_expander_temporal", "TENSE-RECURSIVE-EXPANDER-TEMPORAL", 3, 0, false);
        declareFunction("tense_recursive_expander_temporal_int", "TENSE-RECURSIVE-EXPANDER-TEMPORAL-INT", 3, 0, false);
        declareFunction("negated_tense_operator", "NEGATED-TENSE-OPERATOR", 1, 0, false);
        declareFunction("tensify_sentence", "TENSIFY-SENTENCE", 4, 0, false);
        declareFunction("tensify_was_sentence", "TENSIFY-WAS-SENTENCE", 3, 0, false);
        declareFunction("tensify_will_be_sentence", "TENSIFY-WILL-BE-SENTENCE", 3, 0, false);
        declareFunction("tensify_has_always_been_sentence", "TENSIFY-HAS-ALWAYS-BEEN-SENTENCE", 3, 0, false);
        declareFunction("tensify_will_always_be_sentence", "TENSIFY-WILL-ALWAYS-BE-SENTENCE", 3, 0, false);
        declareFunction("metrically_tensify_sentence", "METRICALLY-TENSIFY-SENTENCE", 3, 0, false);
        declareFunction("interval_metrically_inappropriateP", "INTERVAL-METRICALLY-INAPPROPRIATE?", 3, 0, false);
        declareFunction("metrically_tensify_hlmt", "METRICALLY-TENSIFY-HLMT", 4, 0, false);
        declareFunction("was_metric_hlmt", "WAS-METRIC-HLMT", 3, 0, false);
        declareFunction("will_be_metric_hlmt", "WILL-BE-METRIC-HLMT", 3, 0, false);
        declareFunction("tense_recursive_contractor", "TENSE-RECURSIVE-CONTRACTOR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_hlmt_czer_file() {
        return NIL;
    }

    public static final SubLObject setup_hlmt_czer_file_alt() {
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CZE_HLMT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(CZE_HLMT);
        classes.subloop_new_class(CZE_HLMT, TEST_CASE, NIL, NIL, $list_alt34);
        classes.class_set_implements_slot_listeners(CZE_HLMT, NIL);
        classes.subloop_note_class_initialization_function(CZE_HLMT, SUBLOOP_RESERVED_INITIALIZE_CZE_HLMT_CLASS);
        classes.subloop_note_instance_initialization_function(CZE_HLMT, SUBLOOP_RESERVED_INITIALIZE_CZE_HLMT_INSTANCE);
        com.cyc.cycjava.cycl.hlmt_czer.subloop_reserved_initialize_cze_hlmt_class(CZE_HLMT);
        sunit_macros.define_test_case_postamble(CZE_HLMT, $$$hlmt, $$$cycl, $list_alt51);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST1);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST2);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST3);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST4);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST5);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST6);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST7);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST8);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST9);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST10);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST11);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST12);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST13);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST14);
        sunit_macros.def_test_method_register(CZE_HLMT, TEST15);
        return NIL;
    }

    public static SubLObject setup_hlmt_czer_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(CZE_HLMT, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(CZE_HLMT);
            classes.subloop_new_class(CZE_HLMT, TEST_CASE, NIL, NIL, $list_alt34);
            classes.class_set_implements_slot_listeners(CZE_HLMT, NIL);
            classes.subloop_note_class_initialization_function(CZE_HLMT, SUBLOOP_RESERVED_INITIALIZE_CZE_HLMT_CLASS);
            classes.subloop_note_instance_initialization_function(CZE_HLMT, SUBLOOP_RESERVED_INITIALIZE_CZE_HLMT_INSTANCE);
            com.cyc.cycjava.cycl.hlmt_czer.subloop_reserved_initialize_cze_hlmt_class(CZE_HLMT);
            sunit_macros.define_test_case_postamble(CZE_HLMT, $$$hlmt, $$$cycl, $list_alt51);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST1);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST2);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST3);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST4);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST5);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST6);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST7);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST8);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST9);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST10);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST11);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST12);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST13);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST14);
            sunit_macros.def_test_method_register(CZE_HLMT, TEST15);
        }
        return NIL;
    }

    public static SubLObject setup_hlmt_czer_file_Previous() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_hlmt_czer_file();
    }

    @Override
    public void initializeVariables() {
        init_hlmt_czer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_hlmt_czer_file();
    }

    static {
    }

    static private final SubLString $str_alt7$Can_t_yet_handle_negated_metric_t = makeString("Can't yet handle negated metric tense operators");

    static private final SubLString $str_alt12$_a_is_not_a_known_tense_operator_ = makeString("~a is not a known tense operator.");

    static private final SubLString $str_alt25$_a_is_not_a_metric_tense_operator = makeString("~a is not a metric tense operator.");

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("Null-TimeParameter"));

    private static final SubLSymbol CZE_HLMT = makeSymbol("CZE-HLMT");

    static private final SubLList $list_alt34 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST2"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST3"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST4"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST5"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST6"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST7"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST8"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST9"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST10"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST11"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST12"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST13"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST14"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST15"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CZE_HLMT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CZE-HLMT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CZE_HLMT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CZE-HLMT-INSTANCE");

    static private final SubLString $$$hlmt = makeString("hlmt");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt51 = list(makeString("HLMT Tests"));

    private static final SubLSymbol TEST7 = makeSymbol("TEST7");

    private static final SubLSymbol TEST8 = makeSymbol("TEST8");

    private static final SubLSymbol TEST9 = makeSymbol("TEST9");

    private static final SubLSymbol TEST10 = makeSymbol("TEST10");

    private static final SubLSymbol TEST11 = makeSymbol("TEST11");

    private static final SubLSymbol TEST12 = makeSymbol("TEST12");

    private static final SubLSymbol TEST13 = makeSymbol("TEST13");

    private static final SubLSymbol TEST14 = makeSymbol("TEST14");

    private static final SubLSymbol TEST15 = makeSymbol("TEST15");
}

/**
 * Total time: 190 ms
 */
