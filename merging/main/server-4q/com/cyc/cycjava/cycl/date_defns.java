/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.date_utilities.current_time_interval_of_type;
import static com.cyc.cycjava.cycl.date_utilities.cyc_date_decode_string_internal;
import static com.cyc.cycjava.cycl.date_utilities.cyc_date_encode_string_internal;
import static com.cyc.cycjava.cycl.date_utilities.cyc_date_from_string_internal;
import static com.cyc.cycjava.cycl.date_utilities.cyc_time_elapsed_decode_string_internal;
import static com.cyc.cycjava.cycl.date_utilities.cyc_time_elapsed_encode_string_internal;
import static com.cyc.cycjava.cycl.date_utilities.dateL;
import static com.cyc.cycjava.cycl.date_utilities.date_after;
import static com.cyc.cycjava.cycl.date_utilities.date_before;
import static com.cyc.cycjava.cycl.date_utilities.date_p;
import static com.cyc.cycjava.cycl.date_utilities.date_precision;
import static com.cyc.cycjava.cycl.date_utilities.date_subsumes;
import static com.cyc.cycjava.cycl.date_utilities.day_of_date;
import static com.cyc.cycjava.cycl.date_utilities.day_of_week_after_date;
import static com.cyc.cycjava.cycl.date_utilities.day_of_week_after_date_inclusive;
import static com.cyc.cycjava.cycl.date_utilities.day_of_week_of_date;
import static com.cyc.cycjava.cycl.date_utilities.day_of_week_p;
import static com.cyc.cycjava.cycl.date_utilities.day_of_week_prior_to_date;
import static com.cyc.cycjava.cycl.date_utilities.day_of_week_prior_to_date_inclusive;
import static com.cyc.cycjava.cycl.date_utilities.extract_date_day;
import static com.cyc.cycjava.cycl.date_utilities.extract_date_month;
import static com.cyc.cycjava.cycl.date_utilities.extract_date_year;
import static com.cyc.cycjava.cycl.date_utilities.generalized_date_p;
import static com.cyc.cycjava.cycl.date_utilities.next_iterated_cyclic_interval_inclusive;
import static com.cyc.cycjava.cycl.date_utilities.possibly_bind_temporal_indexical_in_object;
import static com.cyc.cycjava.cycl.date_utilities.time_elapsed;
import static com.cyc.cycjava.cycl.date_utilities.universal_date_to_cycl_date;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.cycjava.cycl.relation_evaluation.throw_unevaluatable;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_indexical_referent;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      DATE-DEFNS
 * source file: /cyc/top/cycl/date-defns.lisp
 * created:     2019/07/03 17:37:52
 */
public final class date_defns extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new date_defns();

 public static final String myName = "com.cyc.cycjava.cycl.date_defns";






    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol CYC_DAY_OF_WEEK_DEFN = makeSymbol("CYC-DAY-OF-WEEK-DEFN");



    private static final SubLSymbol CYC_DATE_AFTER = makeSymbol("CYC-DATE-AFTER");

    private static final SubLSymbol CYC_DATE_AFTER_PRECISE = makeSymbol("CYC-DATE-AFTER-PRECISE");

    private static final SubLSymbol CYC_DATE_AFTER_DURATION_START_PRECISE = makeSymbol("CYC-DATE-AFTER-DURATION-START-PRECISE");

    private static final SubLString $str8$A_KB_dependent_date_specific_func = makeString("A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates.");

    private static final SubLSymbol CYC_DATE_BEFORE = makeSymbol("CYC-DATE-BEFORE");

    private static final SubLSymbol CYC_DATE_BEFORE_PRECISE = makeSymbol("CYC-DATE-BEFORE-PRECISE");

    private static final SubLSymbol CYC_DATE_FROM_INTEGER = makeSymbol("CYC-DATE-FROM-INTEGER");

    private static final SubLSymbol CYC_DATE_INITIAL_SECOND = makeSymbol("CYC-DATE-INITIAL-SECOND");

    private static final SubLSymbol CYC_DATE_FINAL_SECOND = makeSymbol("CYC-DATE-FINAL-SECOND");

    private static final SubLSymbol CYC_DATE_ENCODE_STRING = makeSymbol("CYC-DATE-ENCODE-STRING");

    private static final SubLSymbol CYC_DATE_DECODE_STRING = makeSymbol("CYC-DATE-DECODE-STRING");

    private static final SubLSymbol CYC_DATE_FROM_STRING = makeSymbol("CYC-DATE-FROM-STRING");

    private static final SubLSymbol CYC_DAY_OF_DATE = makeSymbol("CYC-DAY-OF-DATE");

    private static final SubLSymbol CYC_HOUR_OF_DATE = makeSymbol("CYC-HOUR-OF-DATE");

    private static final SubLSymbol CYC_MINUTE_OF_DATE = makeSymbol("CYC-MINUTE-OF-DATE");

    private static final SubLList $list20 = list(reader_make_constant_shell("HoursDuration"), reader_make_constant_shell("MinutesDuration"), reader_make_constant_shell("SecondsDuration"));

    private static final SubLSymbol CYC_TIME_ELAPSED_ENCODE_STRING = makeSymbol("CYC-TIME-ELAPSED-ENCODE-STRING");

    private static final SubLSymbol CYC_TIME_ELAPSED_DECODE_STRING = makeSymbol("CYC-TIME-ELAPSED-DECODE-STRING");

    private static final SubLSymbol CYC_TIME_INTERVAL_OF_SPEC_STRING = makeSymbol("CYC-TIME-INTERVAL-OF-SPEC-STRING");

    private static final SubLSymbol CYC_LATER_THAN = makeSymbol("CYC-LATER-THAN");

    private static final SubLSymbol CYC_DATE_SUBSUMES = makeSymbol("CYC-DATE-SUBSUMES");

    private static final SubLSymbol CYC_TIME_ELAPSED = makeSymbol("CYC-TIME-ELAPSED");

    private static final SubLSymbol CYC_DAY_OF_WEEK_OF_DATE = makeSymbol("CYC-DAY-OF-WEEK-OF-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_PRIOR_TO_DATE = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE = makeSymbol("CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_AFTER_DATE = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE");

    private static final SubLSymbol CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE = makeSymbol("CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE");

    private static final SubLSymbol CYC_CURRENT_ITERATED_CYCLIC_INTERVAL = makeSymbol("CYC-CURRENT-ITERATED-CYCLIC-INTERVAL");

    private static final SubLSymbol CYC_NEXT_ITERATED_CYCLIC_INTERVAL = makeSymbol("CYC-NEXT-ITERATED-CYCLIC-INTERVAL");

    private static final SubLSymbol CYC_YEAR_OF_DATE = makeSymbol("CYC-YEAR-OF-DATE");

    private static final SubLSymbol CYC_MONTH_OF_DATE = makeSymbol("CYC-MONTH-OF-DATE");

    private static final SubLSymbol CYC_DAY_NUMBER_OF_DATE = makeSymbol("CYC-DAY-NUMBER-OF-DATE");

    private static final SubLSymbol CYC_EVALUATE_DATE_HELPER = makeSymbol("CYC-EVALUATE-DATE-HELPER");

    private static final SubLSymbol $sym40$DATE_ = makeSymbol("DATE<");



    private static final SubLSymbol CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES = makeSymbol("CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES");

    public static SubLObject cyc_evaluate_date_helper(SubLObject date) {
        if (NIL != date_utilities.temporal_indexical_p(date)) {
            final SubLObject indexical_value = removal_modules_indexical_referent.temporal_indexical_expand(date);
            relation_evaluation.cyc_evaluate_note_support(arguments.make_hl_support($OPAQUE, make_binary_formula($$indexicalReferent, date, indexical_value), $$BaseKB, UNPROVIDED));
            date = indexical_value;
        }
        return date;
    }

    // Definitions
    public static final SubLObject cyc_day_of_week_defn_alt(SubLObject v_object) {
        if (NIL != date_p(v_object)) {
            if ($$CalendarDay == date_precision(v_object)) {
                {
                    SubLObject col = at_vars.defn_collection();
                    return eq(col, day_of_week_of_date(v_object));
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject cyc_day_of_week_defn(final SubLObject v_object) {
        if ((NIL != date_utilities.date_p(v_object)) && $$CalendarDay.eql(date_utilities.date_precision(v_object))) {
            final SubLObject col = at_vars.defn_collection();
            return eq(col, date_utilities.day_of_week_of_date(v_object));
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$DateAfterFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateAfterFn")
    public static final SubLObject cyc_date_after_alt(SubLObject date, SubLObject time) {
        if (!((NIL != date_p(date)) && (NIL != time_parameter_utilities.duration_p(time)))) {
            throw_unevaluatable();
        }
        {
            SubLObject result = date_after(date, time);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$DateAfterFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateAfterFn")
    public static SubLObject cyc_date_after(SubLObject date, final SubLObject time) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.date_p(date)) || (NIL == time_parameter_utilities.duration_p(time))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.date_after(date, time);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_date_after_precise(SubLObject date, final SubLObject time) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.date_p(date)) || (NIL == time_parameter_utilities.duration_p(time))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.date_after_precise(date, time);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_date_after_duration_start_precise(SubLObject date, final SubLObject time) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.date_p(date)) || (NIL == time_parameter_utilities.duration_p(time))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.date_after_duration_start_precise(date, time);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$DateBeforeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateBeforeFn")
    public static final SubLObject cyc_date_before_alt(SubLObject date, SubLObject time) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str_alt3$A_KB_dependent_date_specific_func);
        }
        if (!((NIL != date_p(date)) && (NIL != time_parameter_utilities.duration_p(time)))) {
            throw_unevaluatable();
        }
        {
            SubLObject result = date_before(date, time);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$DateBeforeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateBeforeFn")
    public static SubLObject cyc_date_before(SubLObject date, final SubLObject time) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str8$A_KB_dependent_date_specific_func);
        }
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.date_p(date)) || (NIL == time_parameter_utilities.duration_p(time))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.date_before(date, time);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static SubLObject cyc_date_before_precise(SubLObject date, final SubLObject time) {
        if (NIL == kb_control_vars.date_kb_loaded_p()) {
            Errors.error($str8$A_KB_dependent_date_specific_func);
        }
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.date_p(date)) || (NIL == time_parameter_utilities.duration_p(time))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.date_before_precise(date, time);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$DateFromIntegerFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateFromIntegerFn")
    public static final SubLObject cyc_date_from_integer_alt(SubLObject universal_date) {
        if (!universal_date.isInteger()) {
            throw_unevaluatable();
        }
        return universal_date_to_cycl_date(universal_date);
    }

    /**
     * #$evaluationDefn for #$DateFromIntegerFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateFromIntegerFn")
    public static SubLObject cyc_date_from_integer(final SubLObject universal_date) {
        if (!universal_date.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return date_utilities.universal_date_to_cycl_date(universal_date);
    }

    public static final SubLObject cyc_date_initial_second_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        return time_interval_utilities.cycl_interval_initial_second(date);
    }

    public static SubLObject cyc_date_initial_second(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        return time_interval_utilities.cycl_interval_initial_second(date);
    }

    public static final SubLObject cyc_date_final_second_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        return time_interval_utilities.cycl_interval_final_second(date);
    }

    public static SubLObject cyc_date_final_second(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        return time_interval_utilities.cycl_interval_final_second(date);
    }

    /**
     * #$evaluationDefn for #$DateEncodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateEncodeStringFn")
    public static final SubLObject cyc_date_encode_string_alt(SubLObject template, SubLObject date) {
        if (!(template.isString() && (NIL != date_p(date)))) {
            throw_unevaluatable();
        }
        {
            SubLObject date_string = cyc_date_encode_string_internal(template, date);
            if (NIL == date_string) {
                throw_unevaluatable();
            }
            return date_string;
        }
    }

    /**
     * #$evaluationDefn for #$DateEncodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateEncodeStringFn")
    public static SubLObject cyc_date_encode_string(final SubLObject template, SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if ((!template.isString()) || (NIL == date_utilities.date_p(date))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject date_string = date_utilities.cyc_date_encode_string_internal(template, date);
        if (NIL == date_string) {
            relation_evaluation.throw_unevaluatable();
        }
        return date_string;
    }

    /**
     * #$evaluationDefn for #$DateDecodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateDecodeStringFn")
    public static final SubLObject cyc_date_decode_string_alt(SubLObject template, SubLObject date_string) {
        if (!(template.isString() && date_string.isString())) {
            throw_unevaluatable();
        }
        {
            SubLObject date = cyc_date_decode_string_internal(template, date_string);
            if (NIL == date) {
                throw_unevaluatable();
            }
            return date;
        }
    }

    /**
     * #$evaluationDefn for #$DateDecodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DateDecodeStringFn")
    public static SubLObject cyc_date_decode_string(final SubLObject template, final SubLObject date_string) {
        if ((!template.isString()) || (!date_string.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject date = date_utilities.cyc_date_decode_string_internal(template, date_string);
        if (NIL == date) {
            relation_evaluation.throw_unevaluatable();
        }
        return date;
    }

    /**
     *
     *
     * @param DATE-STRING,
    stringp
     * 		
     * @return naut-p
    Parses a string such as 'February 17, 1345' into a CycL NAUT such as
    (#$DayFn 17 (#$MonthFn #$February (#$YearFn 1345)))
    This is the #$evaluationDefn for #$DateFromStringFn.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param DATE-STRING,\nstringp\r\n\t\t\r\n@return naut-p\r\nParses a string such as \'February 17, 1345\' into a CycL NAUT such as\r\n(#$DayFn 17 (#$MonthFn #$February (#$YearFn 1345)))\r\nThis is the #$evaluationDefn for #$DateFromStringFn.\r\n@unknown bertolo")
    public static final SubLObject cyc_date_from_string_alt(SubLObject date_string) {
        if (!date_string.isString()) {
            throw_unevaluatable();
        }
        return cyc_date_from_string_internal(date_string);
    }

    /**
     *
     *
     * @param DATE-STRING,
    stringp
     * 		
     * @return naut-p
    Parses a string such as 'February 17, 1345' into a CycL NAUT such as
    (#$DayFn 17 (#$MonthFn #$February (#$YearFn 1345)))
    This is the #$evaluationDefn for #$DateFromStringFn.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param DATE-STRING,\nstringp\r\n\t\t\r\n@return naut-p\r\nParses a string such as \'February 17, 1345\' into a CycL NAUT such as\r\n(#$DayFn 17 (#$MonthFn #$February (#$YearFn 1345)))\r\nThis is the #$evaluationDefn for #$DateFromStringFn.\r\n@unknown bertolo")
    public static SubLObject cyc_date_from_string(final SubLObject date_string) {
        if (!date_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject dates = date_utilities.cyc_date_from_string_internal(date_string);
        if (NIL != dates) {
            return dates.first();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    /**
     * Evaluation defn for #$DayOfDateFn.
     */
    @LispMethod(comment = "Evaluation defn for #$DayOfDateFn.")
    public static final SubLObject cyc_day_of_date_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        {
            SubLObject day = day_of_date(date);
            if (NIL == narts_high.naut_p(day)) {
                throw_unevaluatable();
            }
            return day;
        }
    }

    /**
     * Evaluation defn for #$DayOfDateFn.
     */
    @LispMethod(comment = "Evaluation defn for #$DayOfDateFn.")
    public static SubLObject cyc_day_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject day = date_utilities.day_of_date(date);
        if (NIL == narts_high.naut_p(day)) {
            relation_evaluation.throw_unevaluatable();
        }
        return day;
    }

    public static SubLObject cyc_hour_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject day = date_utilities.hour_of_date(date);
        if (NIL == narts_high.naut_p(day)) {
            relation_evaluation.throw_unevaluatable();
        }
        return day;
    }

    public static SubLObject cyc_minute_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject day = date_utilities.minute_of_date(date);
        if (NIL == narts_high.naut_p(day)) {
            relation_evaluation.throw_unevaluatable();
        }
        return day;
    }

    /**
     * #$evaluationDefn for #$TimeElapsedEncodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TimeElapsedEncodeStringFn")
    public static final SubLObject cyc_time_elapsed_encode_string_alt(SubLObject template, SubLObject time_quant) {
        if (!((template.isString() && (NIL != el_formula_p(time_quant))) && (NIL != subl_promotions.memberP(cycl_utilities.formula_operator(time_quant), $list_alt12, UNPROVIDED, UNPROVIDED)))) {
            throw_unevaluatable();
        }
        {
            SubLObject time_string = cyc_time_elapsed_encode_string_internal(template, time_quant);
            if (NIL == time_string) {
                throw_unevaluatable();
            }
            return time_string;
        }
    }

    /**
     * #$evaluationDefn for #$TimeElapsedEncodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TimeElapsedEncodeStringFn")
    public static SubLObject cyc_time_elapsed_encode_string(final SubLObject template, final SubLObject time_quant) {
        if (((!template.isString()) || (NIL == el_formula_p(time_quant))) || (NIL == subl_promotions.memberP(cycl_utilities.formula_operator(time_quant), $list20, UNPROVIDED, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject time_string = date_utilities.cyc_time_elapsed_encode_string_internal(template, time_quant);
        if (NIL == time_string) {
            relation_evaluation.throw_unevaluatable();
        }
        return time_string;
    }

    /**
     * #$evaluationDefn for #$TimeElapsedDecodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TimeElapsedDecodeStringFn")
    public static final SubLObject cyc_time_elapsed_decode_string_alt(SubLObject template, SubLObject time_string) {
        if (!(template.isString() && time_string.isString())) {
            throw_unevaluatable();
        }
        {
            SubLObject time_quant = cyc_time_elapsed_decode_string_internal(template, time_string);
            if (NIL == time_quant) {
                throw_unevaluatable();
            }
            return time_quant;
        }
    }

    /**
     * #$evaluationDefn for #$TimeElapsedDecodeStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TimeElapsedDecodeStringFn")
    public static SubLObject cyc_time_elapsed_decode_string(final SubLObject template, final SubLObject time_string) {
        if ((!template.isString()) || (!time_string.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject time_quant = date_utilities.cyc_time_elapsed_decode_string_internal(template, time_string);
        if (NIL == time_quant) {
            relation_evaluation.throw_unevaluatable();
        }
        return time_quant;
    }

    public static SubLObject cyc_time_interval_of_spec_string(final SubLObject spec_string) {
        final SubLObject time_interval = removal_modules_rdf_date.rdf_time_interval_to_cycl(spec_string);
        if ($FAIL.eql(time_interval)) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        return time_interval;
    }

    /**
     * #$evaluationDefn for #$laterThan
     */
    @LispMethod(comment = "#$evaluationDefn for #$laterThan")
    public static final SubLObject cyc_later_than_alt(SubLObject date1, SubLObject date2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            date1 = possibly_bind_temporal_indexical_in_object(date1);
            date2 = possibly_bind_temporal_indexical_in_object(date2);
            if ((NIL != generalized_date_p(date1)) && (NIL != generalized_date_p(date2))) {
                return dateL(date2, date1);
            } else {
                if ((NIL != isa.isaP(date1, $$Date, UNPROVIDED, UNPROVIDED)) && (NIL != isa.isaP(date2, $$Date, UNPROVIDED, UNPROVIDED))) {
                    if (NIL != sbhl_time_modules.starts_after_ending_ofP(date2, date1, UNPROVIDED)) {
                        return T;
                    } else {
                        if (NIL != sbhl_time_modules.not_starts_after_ending_ofP(date2, date1, UNPROVIDED)) {
                            return NIL;
                        } else {
                            {
                                SubLObject result = NIL;
                                {
                                    SubLObject _prev_bind_0 = gt_vars.$suspend_gt_type_checkingP$.currentBinding(thread);
                                    try {
                                        gt_vars.$suspend_gt_type_checkingP$.bind(T, thread);
                                        result = gt_methods.gt_booleanP($$laterThan, date1, date2, UNPROVIDED);
                                    } finally {
                                        gt_vars.$suspend_gt_type_checkingP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                return NIL != result ? ((SubLObject) (result)) : throw_unevaluatable();
                            }
                        }
                    }
                } else {
                    return throw_unevaluatable();
                }
            }
        }
    }

    /**
     * #$evaluationDefn for #$laterThan
     */
    @LispMethod(comment = "#$evaluationDefn for #$laterThan")
    public static SubLObject cyc_later_than(SubLObject late_date, SubLObject early_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        late_date = cyc_evaluate_date_helper(late_date);
        early_date = cyc_evaluate_date_helper(early_date);
        thread.resetMultipleValues();
        final SubLObject result = date_utilities.later_than(late_date, early_date);
        final SubLObject unevaluatableP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != unevaluatableP) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$dateSubsumes
     */
    @LispMethod(comment = "#$evaluationDefn for #$dateSubsumes")
    public static final SubLObject cyc_date_subsumes_alt(SubLObject date1, SubLObject date2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject result = date_subsumes(date1, date2);
                SubLObject valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == valid) {
                    throw_unevaluatable();
                }
                return result;
            }
        }
    }

    /**
     * #$evaluationDefn for #$dateSubsumes
     */
    @LispMethod(comment = "#$evaluationDefn for #$dateSubsumes")
    public static SubLObject cyc_date_subsumes(SubLObject date1, SubLObject date2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        date1 = cyc_evaluate_date_helper(date1);
        date2 = cyc_evaluate_date_helper(date2);
        thread.resetMultipleValues();
        final SubLObject result = date_utilities.date_subsumes(date1, date2);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == valid) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$TimeElapsedFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TimeElapsedFn")
    public static final SubLObject cyc_time_elapsed_alt(SubLObject date1, SubLObject date2) {
        if (!((NIL != date_p(date1)) && (NIL != date_p(date2)))) {
            throw_unevaluatable();
        }
        return time_elapsed(date1, date2, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$TimeElapsedFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TimeElapsedFn")
    public static SubLObject cyc_time_elapsed(SubLObject date1, SubLObject date2) {
        date1 = cyc_evaluate_date_helper(date1);
        date2 = cyc_evaluate_date_helper(date2);
        if ((NIL == date_utilities.date_p(date1)) || (NIL == date_utilities.date_p(date2))) {
            relation_evaluation.throw_unevaluatable();
        }
        return date_utilities.time_elapsed(date1, date2, UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$DayOfWeekTypeForDateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekTypeForDateFn")
    public static final SubLObject cyc_day_of_week_of_date_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        {
            SubLObject weekday = day_of_week_of_date(date);
            if (NIL == weekday) {
                throw_unevaluatable();
            }
            return weekday;
        }
    }

    /**
     * #$evaluationDefn for #$DayOfWeekTypeForDateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekTypeForDateFn")
    public static SubLObject cyc_day_of_week_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject weekday = date_utilities.day_of_week_of_date(date);
        if (NIL == weekday) {
            relation_evaluation.throw_unevaluatable();
        }
        return weekday;
    }

    /**
     * #$evaluationDefn for #$DayOfWeekPriorToDateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekPriorToDateFn")
    public static final SubLObject cyc_day_of_week_prior_to_date_alt(SubLObject day_of_week, SubLObject date) {
        if (!((NIL != day_of_week_p(day_of_week)) && (NIL != date_p(date)))) {
            throw_unevaluatable();
        }
        {
            SubLObject result = day_of_week_prior_to_date(day_of_week, date);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$DayOfWeekPriorToDateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekPriorToDateFn")
    public static SubLObject cyc_day_of_week_prior_to_date(final SubLObject day_of_week, SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.day_of_week_p(day_of_week)) || (NIL == date_utilities.date_p(date))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.day_of_week_prior_to_date(day_of_week, date);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$DayOfWeekPriorToDateFn-Inclusive
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekPriorToDateFn-Inclusive")
    public static final SubLObject cyc_day_of_week_prior_to_date_inclusive_alt(SubLObject day_of_week, SubLObject date) {
        if (!((NIL != day_of_week_p(day_of_week)) && (NIL != date_p(date)))) {
            throw_unevaluatable();
        }
        {
            SubLObject result = day_of_week_prior_to_date_inclusive(day_of_week, date);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$DayOfWeekPriorToDateFn-Inclusive
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekPriorToDateFn-Inclusive")
    public static SubLObject cyc_day_of_week_prior_to_date_inclusive(final SubLObject day_of_week, SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.day_of_week_p(day_of_week)) || (NIL == date_utilities.date_p(date))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.day_of_week_prior_to_date_inclusive(day_of_week, date);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$DayOfWeekAfterDateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekAfterDateFn")
    public static final SubLObject cyc_day_of_week_after_date_alt(SubLObject day_of_week, SubLObject date) {
        if (!((NIL != day_of_week_p(day_of_week)) && (NIL != date_p(date)))) {
            throw_unevaluatable();
        }
        {
            SubLObject result = day_of_week_after_date(day_of_week, date);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$DayOfWeekAfterDateFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekAfterDateFn")
    public static SubLObject cyc_day_of_week_after_date(final SubLObject day_of_week, SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.day_of_week_p(day_of_week)) || (NIL == date_utilities.date_p(date))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.day_of_week_after_date(day_of_week, date);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$DayOfWeekAfterDateFn-Inclusive
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekAfterDateFn-Inclusive")
    public static final SubLObject cyc_day_of_week_after_date_inclusive_alt(SubLObject day_of_week, SubLObject date) {
        if (!((NIL != day_of_week_p(day_of_week)) && (NIL != date_p(date)))) {
            throw_unevaluatable();
        }
        {
            SubLObject result = day_of_week_after_date_inclusive(day_of_week, date);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$DayOfWeekAfterDateFn-Inclusive
     */
    @LispMethod(comment = "#$evaluationDefn for #$DayOfWeekAfterDateFn-Inclusive")
    public static SubLObject cyc_day_of_week_after_date_inclusive(final SubLObject day_of_week, SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if ((NIL == date_utilities.day_of_week_p(day_of_week)) || (NIL == date_utilities.date_p(date))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.day_of_week_after_date_inclusive(day_of_week, date);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$CurrentIteratedCyclicIntervalFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$CurrentIteratedCyclicIntervalFn")
    public static final SubLObject cyc_current_iterated_cyclic_interval_alt(SubLObject cyclic_interval_type_on_calendar_scale) {
        if (NIL == cyclic_interval_type_on_calendar_scale) {
            throw_unevaluatable();
        }
        {
            SubLObject result = current_time_interval_of_type(cyclic_interval_type_on_calendar_scale);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$CurrentIteratedCyclicIntervalFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$CurrentIteratedCyclicIntervalFn")
    public static SubLObject cyc_current_iterated_cyclic_interval(final SubLObject cyclic_interval_type_on_calendar_scale) {
        if (NIL == cyclic_interval_type_on_calendar_scale) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.current_time_interval_of_type(cyclic_interval_type_on_calendar_scale);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$NextIteratedCyclicIntervalFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$NextIteratedCyclicIntervalFn")
    public static final SubLObject cyc_next_iterated_cyclic_interval_alt(SubLObject cyclic_interval_type_on_calendar_scale) {
        if (NIL == cyclic_interval_type_on_calendar_scale) {
            throw_unevaluatable();
        }
        {
            SubLObject result = next_iterated_cyclic_interval_inclusive(cyclic_interval_type_on_calendar_scale, UNPROVIDED);
            if (NIL == result) {
                throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$NextIteratedCyclicIntervalFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$NextIteratedCyclicIntervalFn")
    public static SubLObject cyc_next_iterated_cyclic_interval(final SubLObject cyclic_interval_type_on_calendar_scale) {
        if (NIL == cyclic_interval_type_on_calendar_scale) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = date_utilities.next_iterated_cyclic_interval_inclusive(cyclic_interval_type_on_calendar_scale, UNPROVIDED);
        if (NIL == result) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject cyc_year_of_date_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        {
            SubLObject year = extract_date_year(date);
            if (!year.isInteger()) {
                throw_unevaluatable();
            }
            return year;
        }
    }

    public static SubLObject cyc_year_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject year = date_utilities.extract_date_year(date);
        if (!year.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return year;
    }

    public static final SubLObject cyc_month_of_date_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        {
            SubLObject month = extract_date_month(date);
            if (NIL == constant_p(month)) {
                throw_unevaluatable();
            }
            return month;
        }
    }

    public static SubLObject cyc_month_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject month = date_utilities.extract_date_month(date);
        if (NIL == constant_p(month)) {
            relation_evaluation.throw_unevaluatable();
        }
        return month;
    }

    public static final SubLObject cyc_day_number_of_date_alt(SubLObject date) {
        if (NIL == date_p(date)) {
            throw_unevaluatable();
        }
        {
            SubLObject day = extract_date_day(date);
            if (!day.isInteger()) {
                throw_unevaluatable();
            }
            return day;
        }
    }

    public static SubLObject cyc_day_number_of_date(SubLObject date) {
        date = cyc_evaluate_date_helper(date);
        if (NIL == date_utilities.date_p(date)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject day = date_utilities.extract_date_day(date);
        if (!day.isInteger()) {
            relation_evaluation.throw_unevaluatable();
        }
        return day;
    }

    /**
     * evaluationDefn for #$MinimalTimeIntervalCoveringDatesFn
     */
    @LispMethod(comment = "evaluationDefn for #$MinimalTimeIntervalCoveringDatesFn")
    public static final SubLObject cyc_minimal_time_interval_covering_dates_alt(SubLObject args) {
        if (!((NIL != list_utilities.lengthGE(args, ONE_INTEGER, UNPROVIDED)) && (NIL != list_utilities.list_of_type_p(DATE_P, args)))) {
            throw_unevaluatable();
        }
        {
            SubLObject sorted_dates = Sort.sort(com.cyc.cycjava.cycl.date_defns.remove_subsumed_dates(list_utilities.fast_delete_duplicates(copy_list(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), $sym31$DATE_, UNPROVIDED);
            if (NIL != sorted_dates) {
                if (NIL != list_utilities.singletonP(sorted_dates)) {
                    return sorted_dates.first();
                } else {
                    return make_el_formula($$TimeIntervalInclusiveFn, list(sorted_dates.first(), list_utilities.last_one(sorted_dates)), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     * evaluationDefn for #$MinimalTimeIntervalCoveringDatesFn
     */
    @LispMethod(comment = "evaluationDefn for #$MinimalTimeIntervalCoveringDatesFn")
    public static SubLObject cyc_minimal_time_interval_covering_dates(SubLObject args) {
        args = Mapping.mapcar(CYC_EVALUATE_DATE_HELPER, args);
        if ((NIL == list_utilities.lengthGE(args, ONE_INTEGER, UNPROVIDED)) || (NIL == list_utilities.list_of_type_p(DATE_P, args))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject sorted_dates = Sort.sort(remove_subsumed_dates(list_utilities.fast_delete_duplicates(copy_list(args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), $sym40$DATE_, UNPROVIDED);
        if (NIL == sorted_dates) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(sorted_dates)) {
            return sorted_dates.first();
        }
        return make_el_formula($$TimeIntervalInclusiveFn, list(sorted_dates.first(), list_utilities.last_one(sorted_dates)), UNPROVIDED);
    }

    public static final SubLObject remove_subsumed_dates_alt(SubLObject dates) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = dates;
            SubLObject date1 = NIL;
            for (date1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , date1 = cdolist_list_var.first()) {
                {
                    SubLObject subsumedP = NIL;
                    if (NIL == subsumedP) {
                        {
                            SubLObject csome_list_var = remove(date1, dates, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject date2 = NIL;
                            for (date2 = csome_list_var.first(); !((NIL != subsumedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , date2 = csome_list_var.first()) {
                                if (NIL != com.cyc.cycjava.cycl.date_defns.cyc_date_subsumes(date2, date1)) {
                                    subsumedP = T;
                                }
                            }
                        }
                    }
                    if (NIL == subsumedP) {
                        result = cons(date1, result);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject remove_subsumed_dates(final SubLObject dates) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dates;
        SubLObject date1 = NIL;
        date1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject subsumedP = NIL;
            if (NIL == subsumedP) {
                SubLObject csome_list_var = remove(date1, dates, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject date2 = NIL;
                date2 = csome_list_var.first();
                while ((NIL == subsumedP) && (NIL != csome_list_var)) {
                    if (NIL != cyc_date_subsumes(date2, date1)) {
                        subsumedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    date2 = csome_list_var.first();
                } 
            }
            if (NIL == subsumedP) {
                result = cons(date1, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            date1 = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject declare_date_defns_file() {
        declareFunction("cyc_evaluate_date_helper", "CYC-EVALUATE-DATE-HELPER", 1, 0, false);
        declareFunction("cyc_day_of_week_defn", "CYC-DAY-OF-WEEK-DEFN", 1, 0, false);
        declareFunction("cyc_date_after", "CYC-DATE-AFTER", 2, 0, false);
        declareFunction("cyc_date_after_precise", "CYC-DATE-AFTER-PRECISE", 2, 0, false);
        declareFunction("cyc_date_after_duration_start_precise", "CYC-DATE-AFTER-DURATION-START-PRECISE", 2, 0, false);
        declareFunction("cyc_date_before", "CYC-DATE-BEFORE", 2, 0, false);
        declareFunction("cyc_date_before_precise", "CYC-DATE-BEFORE-PRECISE", 2, 0, false);
        declareFunction("cyc_date_from_integer", "CYC-DATE-FROM-INTEGER", 1, 0, false);
        declareFunction("cyc_date_initial_second", "CYC-DATE-INITIAL-SECOND", 1, 0, false);
        declareFunction("cyc_date_final_second", "CYC-DATE-FINAL-SECOND", 1, 0, false);
        declareFunction("cyc_date_encode_string", "CYC-DATE-ENCODE-STRING", 2, 0, false);
        declareFunction("cyc_date_decode_string", "CYC-DATE-DECODE-STRING", 2, 0, false);
        declareFunction("cyc_date_from_string", "CYC-DATE-FROM-STRING", 1, 0, false);
        declareFunction("cyc_day_of_date", "CYC-DAY-OF-DATE", 1, 0, false);
        declareFunction("cyc_hour_of_date", "CYC-HOUR-OF-DATE", 1, 0, false);
        declareFunction("cyc_minute_of_date", "CYC-MINUTE-OF-DATE", 1, 0, false);
        declareFunction("cyc_time_elapsed_encode_string", "CYC-TIME-ELAPSED-ENCODE-STRING", 2, 0, false);
        declareFunction("cyc_time_elapsed_decode_string", "CYC-TIME-ELAPSED-DECODE-STRING", 2, 0, false);
        declareFunction("cyc_time_interval_of_spec_string", "CYC-TIME-INTERVAL-OF-SPEC-STRING", 1, 0, false);
        declareFunction("cyc_later_than", "CYC-LATER-THAN", 2, 0, false);
        declareFunction("cyc_date_subsumes", "CYC-DATE-SUBSUMES", 2, 0, false);
        declareFunction("cyc_time_elapsed", "CYC-TIME-ELAPSED", 2, 0, false);
        declareFunction("cyc_day_of_week_of_date", "CYC-DAY-OF-WEEK-OF-DATE", 1, 0, false);
        declareFunction("cyc_day_of_week_prior_to_date", "CYC-DAY-OF-WEEK-PRIOR-TO-DATE", 2, 0, false);
        declareFunction("cyc_day_of_week_prior_to_date_inclusive", "CYC-DAY-OF-WEEK-PRIOR-TO-DATE-INCLUSIVE", 2, 0, false);
        declareFunction("cyc_day_of_week_after_date", "CYC-DAY-OF-WEEK-AFTER-DATE", 2, 0, false);
        declareFunction("cyc_day_of_week_after_date_inclusive", "CYC-DAY-OF-WEEK-AFTER-DATE-INCLUSIVE", 2, 0, false);
        declareFunction("cyc_current_iterated_cyclic_interval", "CYC-CURRENT-ITERATED-CYCLIC-INTERVAL", 1, 0, false);
        declareFunction("cyc_next_iterated_cyclic_interval", "CYC-NEXT-ITERATED-CYCLIC-INTERVAL", 1, 0, false);
        declareFunction("cyc_year_of_date", "CYC-YEAR-OF-DATE", 1, 0, false);
        declareFunction("cyc_month_of_date", "CYC-MONTH-OF-DATE", 1, 0, false);
        declareFunction("cyc_day_number_of_date", "CYC-DAY-NUMBER-OF-DATE", 1, 0, false);
        declareFunction("cyc_minimal_time_interval_covering_dates", "CYC-MINIMAL-TIME-INTERVAL-COVERING-DATES", 1, 0, false);
        declareFunction("remove_subsumed_dates", "REMOVE-SUBSUMED-DATES", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt3$A_KB_dependent_date_specific_func = makeString("A KB-dependent date-specific function was called, but the current Cyc KB does not contain knowledge about dates.");

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("HoursDuration"), reader_make_constant_shell("MinutesDuration"), reader_make_constant_shell("SecondsDuration"));





    public static SubLObject init_date_defns_file() {
        return NIL;
    }

    public static final SubLObject setup_date_defns_file_alt() {
        if (CYC_DAY_OF_WEEK_DEFN.isSymbol()) {
            {
                SubLObject item_var = CYC_DAY_OF_WEEK_DEFN;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
        }
        register_kb_function(CYC_DAY_OF_WEEK_DEFN);
        register_kb_function(CYC_DATE_AFTER);
        register_kb_function(CYC_DATE_BEFORE);
        register_kb_function(CYC_DATE_FROM_INTEGER);
        register_kb_function(CYC_DATE_INITIAL_SECOND);
        register_kb_function(CYC_DATE_FINAL_SECOND);
        register_kb_function(CYC_DATE_ENCODE_STRING);
        register_kb_function(CYC_DATE_DECODE_STRING);
        register_kb_function(CYC_DATE_FROM_STRING);
        register_kb_function(CYC_DAY_OF_DATE);
        register_kb_function(CYC_TIME_ELAPSED_ENCODE_STRING);
        register_kb_function(CYC_TIME_ELAPSED_DECODE_STRING);
        register_kb_function(CYC_LATER_THAN);
        register_kb_function(CYC_DATE_SUBSUMES);
        register_kb_function(CYC_TIME_ELAPSED);
        register_kb_function(CYC_DAY_OF_WEEK_OF_DATE);
        register_kb_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
        register_kb_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
        register_kb_function(CYC_DAY_OF_WEEK_AFTER_DATE);
        register_kb_function(CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
        register_kb_function(CYC_CURRENT_ITERATED_CYCLIC_INTERVAL);
        register_kb_function(CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
        register_kb_function(CYC_YEAR_OF_DATE);
        register_kb_function(CYC_MONTH_OF_DATE);
        register_kb_function(CYC_DAY_NUMBER_OF_DATE);
        register_kb_function(CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES);
        return NIL;
    }

    public static SubLObject setup_date_defns_file() {
        if (SubLFiles.USE_V1) {
            if (CYC_DAY_OF_WEEK_DEFN.isSymbol()) {
                final SubLObject item_var = CYC_DAY_OF_WEEK_DEFN;
                if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                }
            }
            register_kb_function(CYC_DAY_OF_WEEK_DEFN);
            register_kb_function(CYC_DATE_AFTER);
            register_kb_function(CYC_DATE_AFTER_PRECISE);
            register_kb_function(CYC_DATE_AFTER_DURATION_START_PRECISE);
            register_kb_function(CYC_DATE_BEFORE);
            register_kb_function(CYC_DATE_BEFORE_PRECISE);
            register_kb_function(CYC_DATE_FROM_INTEGER);
            register_kb_function(CYC_DATE_INITIAL_SECOND);
            register_kb_function(CYC_DATE_FINAL_SECOND);
            register_kb_function(CYC_DATE_ENCODE_STRING);
            register_kb_function(CYC_DATE_DECODE_STRING);
            register_kb_function(CYC_DATE_FROM_STRING);
            register_kb_function(CYC_DAY_OF_DATE);
            register_kb_function(CYC_HOUR_OF_DATE);
            register_kb_function(CYC_MINUTE_OF_DATE);
            register_kb_function(CYC_TIME_ELAPSED_ENCODE_STRING);
            register_kb_function(CYC_TIME_ELAPSED_DECODE_STRING);
            register_kb_function(CYC_TIME_INTERVAL_OF_SPEC_STRING);
            register_kb_function(CYC_LATER_THAN);
            register_kb_function(CYC_DATE_SUBSUMES);
            register_kb_function(CYC_TIME_ELAPSED);
            register_kb_function(CYC_DAY_OF_WEEK_OF_DATE);
            register_kb_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
            register_kb_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
            register_kb_function(CYC_DAY_OF_WEEK_AFTER_DATE);
            register_kb_function(CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
            register_kb_function(CYC_CURRENT_ITERATED_CYCLIC_INTERVAL);
            register_kb_function(CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
            register_kb_function(CYC_YEAR_OF_DATE);
            register_kb_function(CYC_MONTH_OF_DATE);
            register_kb_function(CYC_DAY_NUMBER_OF_DATE);
            register_kb_function(CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES);
        }
        if (SubLFiles.USE_V2) {
            if (CYC_DAY_OF_WEEK_DEFN.isSymbol()) {
                {
                    SubLObject item_var = CYC_DAY_OF_WEEK_DEFN;
                    if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject setup_date_defns_file_Previous() {
        if (CYC_DAY_OF_WEEK_DEFN.isSymbol()) {
            final SubLObject item_var = CYC_DAY_OF_WEEK_DEFN;
            if (NIL == member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
            }
        }
        register_kb_function(CYC_DAY_OF_WEEK_DEFN);
        register_kb_function(CYC_DATE_AFTER);
        register_kb_function(CYC_DATE_AFTER_PRECISE);
        register_kb_function(CYC_DATE_AFTER_DURATION_START_PRECISE);
        register_kb_function(CYC_DATE_BEFORE);
        register_kb_function(CYC_DATE_BEFORE_PRECISE);
        register_kb_function(CYC_DATE_FROM_INTEGER);
        register_kb_function(CYC_DATE_INITIAL_SECOND);
        register_kb_function(CYC_DATE_FINAL_SECOND);
        register_kb_function(CYC_DATE_ENCODE_STRING);
        register_kb_function(CYC_DATE_DECODE_STRING);
        register_kb_function(CYC_DATE_FROM_STRING);
        register_kb_function(CYC_DAY_OF_DATE);
        register_kb_function(CYC_HOUR_OF_DATE);
        register_kb_function(CYC_MINUTE_OF_DATE);
        register_kb_function(CYC_TIME_ELAPSED_ENCODE_STRING);
        register_kb_function(CYC_TIME_ELAPSED_DECODE_STRING);
        register_kb_function(CYC_TIME_INTERVAL_OF_SPEC_STRING);
        register_kb_function(CYC_LATER_THAN);
        register_kb_function(CYC_DATE_SUBSUMES);
        register_kb_function(CYC_TIME_ELAPSED);
        register_kb_function(CYC_DAY_OF_WEEK_OF_DATE);
        register_kb_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE);
        register_kb_function(CYC_DAY_OF_WEEK_PRIOR_TO_DATE_INCLUSIVE);
        register_kb_function(CYC_DAY_OF_WEEK_AFTER_DATE);
        register_kb_function(CYC_DAY_OF_WEEK_AFTER_DATE_INCLUSIVE);
        register_kb_function(CYC_CURRENT_ITERATED_CYCLIC_INTERVAL);
        register_kb_function(CYC_NEXT_ITERATED_CYCLIC_INTERVAL);
        register_kb_function(CYC_YEAR_OF_DATE);
        register_kb_function(CYC_MONTH_OF_DATE);
        register_kb_function(CYC_DAY_NUMBER_OF_DATE);
        register_kb_function(CYC_MINIMAL_TIME_INTERVAL_COVERING_DATES);
        return NIL;
    }

    static private final SubLSymbol $sym31$DATE_ = makeSymbol("DATE<");

    @Override
    public void declareFunctions() {
        declare_date_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_date_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_date_defns_file();
    }

    
}

/**
 * Total time: 186 ms
 */
