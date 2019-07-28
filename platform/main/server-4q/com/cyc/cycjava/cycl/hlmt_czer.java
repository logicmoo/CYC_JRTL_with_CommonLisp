package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.hlmt_czer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.hlmt_czer.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class hlmt_czer extends SubLTranslatedFile {
    public static final SubLFile me = new hlmt_czer();

    public static final String myName = "com.cyc.cycjava.cycl.hlmt_czer";

    public static final String myFingerPrint = "66571fd4c4c4781d3ef7bbeabddf5434728ab53a1b98c101e680908723ce01a7";



    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    public static final SubLSymbol $sym2$SKOLEMIZE_FORWARD_ = makeSymbol("SKOLEMIZE-FORWARD?");

    public static final SubLSymbol $sym3$HLMT_ = makeSymbol("HLMT?");

    public static final SubLSymbol SINGLE_DIMENSION_MT_DIMENSION = makeSymbol("SINGLE-DIMENSION-MT-DIMENSION");





    public static final SubLString $str7$Can_t_yet_handle_negated_metric_t = makeString("Can't yet handle negated metric tense operators");

    private static final SubLObject $$was = reader_make_constant_shell(makeString("was"));

    private static final SubLObject $$hasAlwaysBeen = reader_make_constant_shell(makeString("hasAlwaysBeen"));

    private static final SubLObject $$willBe = reader_make_constant_shell(makeString("willBe"));

    private static final SubLObject $$willAlwaysBe = reader_make_constant_shell(makeString("willAlwaysBe"));

    public static final SubLString $str12$_a_is_not_a_known_tense_operator_ = makeString("~a is not a known tense operator.");

    private static final SubLObject $$Null_TimeParameter = reader_make_constant_shell(makeString("Null-TimeParameter"));

    private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

    public static final SubLString $$$T = makeString("T");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$temporalMicrotheoriesIntersect = reader_make_constant_shell(makeString("temporalMicrotheoriesIntersect"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $const20$IntervalEndedByLastSubintervalOfT = reader_make_constant_shell(makeString("IntervalEndedByLastSubintervalOfTypeFn"));

    private static final SubLObject $const21$IntervalStartedByFirstSubinterval = reader_make_constant_shell(makeString("IntervalStartedByFirstSubintervalOfTypeFn"));

    private static final SubLObject $$False = reader_make_constant_shell(makeString("False"));

    private static final SubLObject $$was_Metric = reader_make_constant_shell(makeString("was-Metric"));

    private static final SubLObject $$willBe_Metric = reader_make_constant_shell(makeString("willBe-Metric"));

    public static final SubLString $str25$_a_is_not_a_metric_tense_operator = makeString("~a is not a metric tense operator.");

    public static final SubLSymbol IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");

    private static final SubLObject $$IntervalEndedByFn = reader_make_constant_shell(makeString("IntervalEndedByFn"));

    private static final SubLObject $$IntervalStartedByFn = reader_make_constant_shell(makeString("IntervalStartedByFn"));

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLObject $$MtTimeWithGranularityDimFn = reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));

    public static final SubLList $list31 = list(reader_make_constant_shell(makeString("Null-TimeParameter")));

    public static SubLObject canonicalize_hlmt(SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != czer_vars.$assume_hlmt_is_canonicalP$.getDynamicValue(thread)) {
            return mt;
        }
        assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
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

    public static SubLObject coerce_to_hlmt(final SubLObject mt) {
        final SubLObject v_hlmt = canonicalize_hlmt(mt);
        assert NIL != hlmt.hlmtP(v_hlmt) : "hlmt.hlmtP(v_hlmt) " + "CommonSymbols.NIL != hlmt.hlmtP(v_hlmt) " + v_hlmt;
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

    public static SubLObject sort_hlmt_dimensions(final SubLObject dims) {
        return list_utilities.sort_via_position(dims, hlmt.mt_dimension_types(), EQL, SINGLE_DIMENSION_MT_DIMENSION);
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

    public static SubLObject tense_recursive_expander(final SubLObject asent, final SubLObject sense, final SubLObject v_hlmt) {
        final SubLObject negatedP = eq($NEG, sense);
        return NIL != hlmt.atemporal_hlmtP(v_hlmt) ? tense_recursive_expander_atemporal(asent, v_hlmt, negatedP) : tense_recursive_expander_temporal(asent, v_hlmt, negatedP);
    }

    public static SubLObject tense_recursive_expander_atemporal(final SubLObject asent, final SubLObject v_hlmt, final SubLObject negatedP) {
        return values(remove_tense_operators(asent, negatedP), v_hlmt);
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

    public static SubLObject tense_recursive_expander_temporal(final SubLObject asent, final SubLObject v_hlmt, final SubLObject negatedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_formula = tense_recursive_expander_temporal_int(asent, v_hlmt, negatedP);
        final SubLObject new_hlmt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(new_formula, canonicalize_hlmt(new_hlmt));
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

    public static SubLObject metrically_tensify_hlmt(final SubLObject v_hlmt, final SubLObject tense_operator, final SubLObject type, final SubLObject num) {
        if (tense_operator.eql($$was_Metric)) {
            return was_metric_hlmt(v_hlmt, type, num);
        }
        if (tense_operator.eql($$willBe_Metric)) {
            return will_be_metric_hlmt(v_hlmt, type, num);
        }
        return Errors.error($str25$_a_is_not_a_metric_tense_operator, tense_operator);
    }

    public static SubLObject was_metric_hlmt(final SubLObject v_hlmt, final SubLObject type, final SubLObject amount) {
        final SubLObject atemporal_mt = hlmt.remove_hlmt_dimension($TIME, v_hlmt);
        final SubLObject interval = hlmt.extract_hlmt_temporal_index(v_hlmt);
        final SubLObject new_interval = time_interval_utilities.was_metric_before_interval(interval, type, amount);
        final SubLObject time_dim = hlmt.new_time_dimension(new_interval, $$Null_TimeParameter);
        return hlmt.new_canonicalized_hlmt(cons(time_dim, hlmt.hlmt_dimensions(atemporal_mt)));
    }

    public static SubLObject will_be_metric_hlmt(final SubLObject v_hlmt, final SubLObject type, final SubLObject amount) {
        final SubLObject atemporal_mt = hlmt.remove_hlmt_dimension($TIME, v_hlmt);
        final SubLObject interval = hlmt.extract_hlmt_temporal_index(v_hlmt);
        final SubLObject new_interval = time_interval_utilities.will_be_metric_after_interval(interval, type, amount);
        final SubLObject time_dim = hlmt.new_time_dimension(new_interval, $$Null_TimeParameter);
        return hlmt.new_canonicalized_hlmt(cons(time_dim, hlmt.hlmt_dimensions(atemporal_mt)));
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

    public static SubLObject declare_hlmt_czer_file() {
        declareFunction(me, "canonicalize_hlmt", "CANONICALIZE-HLMT", 1, 0, false);
        declareFunction(me, "coerce_to_hlmt", "COERCE-TO-HLMT", 1, 0, false);
        declareFunction(me, "canonicalize_hlmt_int", "CANONICALIZE-HLMT-INT", 1, 0, false);
        declareFunction(me, "sort_hlmt_dimensions", "SORT-HLMT-DIMENSIONS", 1, 0, false);
        declareFunction(me, "canonicalize_hlmt_time_dimension", "CANONICALIZE-HLMT-TIME-DIMENSION", 1, 0, false);
        declareFunction(me, "tense_recursive_expander", "TENSE-RECURSIVE-EXPANDER", 3, 0, false);
        declareFunction(me, "tense_recursive_expander_atemporal", "TENSE-RECURSIVE-EXPANDER-ATEMPORAL", 3, 0, false);
        declareFunction(me, "remove_tense_operators", "REMOVE-TENSE-OPERATORS", 2, 0, false);
        declareFunction(me, "tense_recursive_expander_temporal", "TENSE-RECURSIVE-EXPANDER-TEMPORAL", 3, 0, false);
        declareFunction(me, "tense_recursive_expander_temporal_int", "TENSE-RECURSIVE-EXPANDER-TEMPORAL-INT", 3, 0, false);
        declareFunction(me, "negated_tense_operator", "NEGATED-TENSE-OPERATOR", 1, 0, false);
        declareFunction(me, "tensify_sentence", "TENSIFY-SENTENCE", 4, 0, false);
        declareFunction(me, "tensify_was_sentence", "TENSIFY-WAS-SENTENCE", 3, 0, false);
        declareFunction(me, "tensify_will_be_sentence", "TENSIFY-WILL-BE-SENTENCE", 3, 0, false);
        declareFunction(me, "tensify_has_always_been_sentence", "TENSIFY-HAS-ALWAYS-BEEN-SENTENCE", 3, 0, false);
        declareFunction(me, "tensify_will_always_be_sentence", "TENSIFY-WILL-ALWAYS-BE-SENTENCE", 3, 0, false);
        declareFunction(me, "metrically_tensify_sentence", "METRICALLY-TENSIFY-SENTENCE", 3, 0, false);
        declareFunction(me, "interval_metrically_inappropriateP", "INTERVAL-METRICALLY-INAPPROPRIATE?", 3, 0, false);
        declareFunction(me, "metrically_tensify_hlmt", "METRICALLY-TENSIFY-HLMT", 4, 0, false);
        declareFunction(me, "was_metric_hlmt", "WAS-METRIC-HLMT", 3, 0, false);
        declareFunction(me, "will_be_metric_hlmt", "WILL-BE-METRIC-HLMT", 3, 0, false);
        declareFunction(me, "tense_recursive_contractor", "TENSE-RECURSIVE-CONTRACTOR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_hlmt_czer_file() {
        return NIL;
    }

    public static SubLObject setup_hlmt_czer_file() {
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
}

/**
 * Total time: 190 ms
 */
