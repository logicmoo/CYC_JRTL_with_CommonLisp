package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.time_parameter_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_date_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities";
    public static final String myFingerPrint = "bb07720054526272bd4ee00e6a53001ac6f24bdcac5f9b2b31c4199ad6836830";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 1272L)
    private static SubLSymbol $default_year_of_date_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 5115L)
    private static SubLSymbol $default_month_of_date_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 9050L)
    private static SubLSymbol $default_day_number_of_date_check_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 13113L)
    private static SubLSymbol $default_hour_number_of_date_check_cost$;
    private static final SubLObject $const0$yearOfDate;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLSymbol $kw3$REMOVAL_YEAR_OF_DATE_CHECK_POS;
    private static final SubLList $list4;
    private static final SubLSymbol $kw5$REMOVAL_YEAR_OF_DATE_CHECK_NEG;
    private static final SubLList $list6;
    private static final SubLSymbol $kw7$REMOVAL_YEAR_OF_DATE_UNIFY;
    private static final SubLList $list8;
    private static final SubLObject $const9$monthOfDate;
    private static final SubLSymbol $kw10$REMOVAL_MONTH_OF_DATE_CHECK_POS;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$REMOVAL_MONTH_OF_DATE_CHECK_NEG;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$REMOVAL_MONTH_OF_DATE_UNIFY;
    private static final SubLList $list15;
    private static final SubLObject $const16$dayNumberOfDate;
    private static final SubLSymbol $kw17$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$REMOVAL_DAY_NUMBER_OF_DATE_UNIFY;
    private static final SubLList $list22;
    private static final SubLObject $const23$hourNumberOfDate;
    private static final SubLSymbol $kw24$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY;
    private static final SubLList $list29;
    private static final SubLSymbol $kw30$REMOVAL_DATE_INTERVALS_INTERSECT_CHECK;
    private static final SubLList $list31;
    private static final SubLSymbol $kw32$REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$REMOVAL_DATE_INTERVAL_DURATION_UNIFY;
    private static final SubLList $list35;
    private static final SubLSymbol $kw36$REMOVAL_DATE_INTERVAL_DURATION_CHECK;
    private static final SubLList $list37;
    private static final SubLSymbol $kw38$UNEVALUATABLE;
    private static final SubLSymbol $kw39$REMOVAL_DEFINING_TIME_UNIT_CHECK;
    private static final SubLList $list40;
    private static final SubLObject $const41$BaseKB;
    private static final SubLSymbol $kw42$REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY;
    private static final SubLList $list43;
    private static final SubLObject $const44$definingTimeUnit;
    private static final SubLSymbol $kw45$REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY;
    private static final SubLList $list46;
    private static final SubLObject $const47$latestDateInListBeforeDate;
    private static final SubLSymbol $kw48$REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE;
    private static final SubLList $list49;
    private static final SubLSymbol $kw50$DATE_LIST_ARG_IS_NOT_AN_EL_LIST;
    private static final SubLSymbol $kw51$LIMIT_DATE_ARG_IS_NOT_A_DATE;
    private static final SubLSymbol $kw52$OPAQUE;
    private static final SubLObject $const53$startingDate_Precise;
    private static final SubLSymbol $kw54$REMOVAL_STARTING_DATE_PRECISE;
    private static final SubLList $list55;
    private static final SubLObject $const56$EverythingPSC;
    private static final SubLObject $const57$startingDate;
    private static final SubLObject $const58$temporallySubsumes;
    private static final SubLObject $const59$endingDate_Precise;
    private static final SubLSymbol $kw60$REMOVAL_ENDING_DATE_PRECISE;
    private static final SubLList $list61;
    private static final SubLObject $const62$endingDate;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 881L)
    public static SubLObject inference_extract_date_year(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return (SubLObject)((removal_modules_date_utilities.NIL != date_utilities.date_p(date)) ? date_utilities.extract_date_year(date) : removal_modules_date_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 1058L)
    public static SubLObject year_of_dateP(final SubLObject year, final SubLObject date) {
        final SubLObject extracted_year = inference_extract_date_year(date);
        if (year.eql(extracted_year)) {
            return extracted_year;
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 4711L)
    public static SubLObject inference_extract_date_month(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return (SubLObject)((removal_modules_date_utilities.NIL != date_utilities.date_p(date)) ? date_utilities.extract_date_month(date) : removal_modules_date_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 4890L)
    public static SubLObject month_of_dateP(final SubLObject month, final SubLObject date) {
        final SubLObject extracted_month = inference_extract_date_month(date);
        if (month.equal(extracted_month)) {
            return extracted_month;
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 8614L)
    public static SubLObject inference_extract_date_day(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return (SubLObject)((removal_modules_date_utilities.NIL != date_utilities.date_p(date)) ? date_utilities.extract_date_day(date) : removal_modules_date_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 8789L)
    public static SubLObject day_number_of_dateP(final SubLObject day_number, final SubLObject date) {
        final SubLObject extracted_day_number = inference_extract_date_day(date);
        if (day_number.eql(extracted_day_number)) {
            return extracted_day_number;
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 12713L)
    public static SubLObject inference_extract_date_hour(SubLObject date) {
        date = date_utilities.possibly_bind_temporal_indexical_in_object(date);
        return (SubLObject)((removal_modules_date_utilities.NIL != date_utilities.date_p(date)) ? date_utilities.extract_date_hour(date) : removal_modules_date_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 12890L)
    public static SubLObject hour_number_of_dateP(final SubLObject hour, final SubLObject date) {
        final SubLObject extracted_hour = inference_extract_date_hour(date);
        if (hour.equal(extracted_hour)) {
            return extracted_hour;
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 20307L)
    public static SubLObject inference_date_interval_duration(final SubLObject date, SubLObject not_fully_bound) {
        if (not_fully_bound == removal_modules_date_utilities.UNPROVIDED) {
            not_fully_bound = (SubLObject)removal_modules_date_utilities.NIL;
        }
        SubLObject precision = (SubLObject)removal_modules_date_utilities.NIL;
        if (removal_modules_date_utilities.NIL != el_utilities.possibly_naut_p(not_fully_bound)) {
            final SubLObject operator = cycl_utilities.formula_operator(not_fully_bound);
            if (removal_modules_date_utilities.NIL != time_parameter_utilities.duration_function_p(operator)) {
                precision = operator;
            }
        }
        return time_interval_utilities.date_interval_duration(date, precision);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 21614L)
    public static SubLObject inference_date_interval_durationP(final SubLObject interval, final SubLObject duration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject durationP = (SubLObject)removal_modules_date_utilities.NIL;
        SubLObject catch_this = (SubLObject)removal_modules_date_utilities.NIL;
        try {
            thread.throwStack.push(removal_modules_date_utilities.$kw38$UNEVALUATABLE);
            durationP = arithmetic.cyc_numerically_equal(time_interval_utilities.date_interval_duration(interval, time_parameter_utilities.duration_precision(duration)), duration);
        }
        catch (Throwable ccatch_env_var) {
            catch_this = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_modules_date_utilities.$kw38$UNEVALUATABLE);
        }
        finally {
            thread.throwStack.pop();
        }
        return durationP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 22758L)
    public static SubLObject inference_defining_time_unit_check(final SubLObject type, final SubLObject unit) {
        return Equality.eql(unit, date_utilities.inference_defining_time_unit(type));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 22880L)
    public static SubLObject make_defining_time_unit_support(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_date_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_date_utilities.NIL;
        }
        return czer_meta.find_assertion_cycl(asent, removal_modules_date_utilities.$const41$BaseKB);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 23968L)
    public static SubLObject inference_defining_time_unit_arg1_unify(final SubLObject unit) {
        return kb_mapping_utilities.fpred_value_in_any_mt(unit, removal_modules_date_utilities.$const44$definingTimeUnit, (SubLObject)removal_modules_date_utilities.TWO_INTEGER, (SubLObject)removal_modules_date_utilities.ONE_INTEGER, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 25044L)
    public static SubLObject inference_defining_time_unit_arg2_unify(final SubLObject type) {
        return date_utilities.inference_defining_time_unit(type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 26375L)
    public static SubLObject removal_latest_date_in_list_before_date_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_date_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_date_utilities.NIL;
        }
        final SubLObject date_var_arg = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        final SubLObject date_list_arg = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        final SubLObject limit_date_arg = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        if (removal_modules_date_utilities.NIL == el_utilities.el_list_p(date_list_arg)) {
            return Values.values((SubLObject)removal_modules_date_utilities.NIL, (SubLObject)removal_modules_date_utilities.$kw50$DATE_LIST_ARG_IS_NOT_AN_EL_LIST);
        }
        if (removal_modules_date_utilities.NIL == date_utilities.date_p(limit_date_arg)) {
            return Values.values((SubLObject)removal_modules_date_utilities.$kw51$LIMIT_DATE_ARG_IS_NOT_A_DATE);
        }
        final SubLObject date_list_items = el_utilities.el_list_items(date_list_arg);
        SubLObject latest_date_before_date = (SubLObject)removal_modules_date_utilities.NIL;
        SubLObject cdolist_list_var = date_list_items;
        SubLObject date_item = (SubLObject)removal_modules_date_utilities.NIL;
        date_item = cdolist_list_var.first();
        while (removal_modules_date_utilities.NIL != cdolist_list_var) {
            if (removal_modules_date_utilities.NIL != date_utilities.dateLE(date_utilities.cycl_date_initial_second(date_item), date_utilities.cycl_date_initial_second(limit_date_arg)) && (removal_modules_date_utilities.NIL == latest_date_before_date || removal_modules_date_utilities.NIL != date_utilities.dateGE(date_utilities.cycl_date_initial_second(date_item), date_utilities.cycl_date_initial_second(limit_date_arg)))) {
                latest_date_before_date = date_item;
            }
            cdolist_list_var = cdolist_list_var.rest();
            date_item = cdolist_list_var.first();
        }
        if (removal_modules_date_utilities.NIL != latest_date_before_date) {
            final SubLObject v_bindings = unification_utilities.term_unify(date_var_arg, latest_date_before_date, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            if (removal_modules_date_utilities.NIL != v_bindings) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_date_utilities.$kw52$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED), v_bindings, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 28159L)
    public static SubLObject removal_starting_date_precise(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_date_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_date_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject thing = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        SubLObject assertions = (SubLObject)removal_modules_date_utilities.NIL;
        final SubLObject mt_name = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (mt_name.eql(removal_modules_date_utilities.$const56$EverythingPSC)) {
            assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(thing, removal_modules_date_utilities.$const57$startingDate, (SubLObject)removal_modules_date_utilities.ONE_INTEGER, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        }
        else {
            assertions = kb_mapping_utilities.pred_value_gafs_in_mt(thing, removal_modules_date_utilities.$const57$startingDate, mt_name, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        }
        if (removal_modules_date_utilities.NIL == assertions) {
            return (SubLObject)removal_modules_date_utilities.NIL;
        }
        if (Sequences.length(assertions).numE((SubLObject)removal_modules_date_utilities.ONE_INTEGER)) {
            final SubLObject assertion = cycl_utilities.formula_arg0(assertions);
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            if (removal_modules_date_utilities.NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, (SubLObject)removal_modules_date_utilities.NIL);
            }
        }
        final SubLObject most_precise_assertion = find_most_precise_date(assertions);
        if (removal_modules_date_utilities.NIL != most_precise_assertion) {
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(most_precise_assertion), (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            if (removal_modules_date_utilities.NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, assertions.rest());
            }
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 29224L)
    public static SubLObject find_most_precise_date(final SubLObject lst_of_assertions) {
        SubLObject current_best_assertion = cycl_utilities.formula_arg0(lst_of_assertions);
        SubLObject cdolist_list_var = cycl_utilities.formula_args(lst_of_assertions, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        SubLObject assertion = (SubLObject)removal_modules_date_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (removal_modules_date_utilities.NIL != cdolist_list_var) {
            final SubLObject date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            final SubLObject current_best_date = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            if (!current_best_date.equal(date) && removal_modules_date_utilities.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(removal_modules_date_utilities.$const58$temporallySubsumes, current_best_date, date, (SubLObject)removal_modules_date_utilities.$kw1$POS, removal_modules_date_utilities.$const41$BaseKB)) {
                current_best_assertion = assertion;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return current_best_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-date-utilities.lisp", position = 30442L)
    public static SubLObject removal_ending_date_precise(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_date_utilities.UNPROVIDED) {
            sense = (SubLObject)removal_modules_date_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject thing = cycl_utilities.formula_arg1(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        final SubLObject var = cycl_utilities.formula_arg2(asent, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        SubLObject assertions = (SubLObject)removal_modules_date_utilities.NIL;
        final SubLObject mt_name = mt_relevance_macros.$mt$.getDynamicValue(thread);
        if (mt_name.eql(removal_modules_date_utilities.$const56$EverythingPSC)) {
            assertions = kb_mapping_utilities.pred_value_gafs_in_any_mt(thing, removal_modules_date_utilities.$const62$endingDate, (SubLObject)removal_modules_date_utilities.ONE_INTEGER, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        }
        else {
            assertions = kb_mapping_utilities.pred_value_gafs_in_mt(thing, removal_modules_date_utilities.$const62$endingDate, mt_name, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
        }
        if (removal_modules_date_utilities.NIL == assertions) {
            return (SubLObject)removal_modules_date_utilities.NIL;
        }
        if (Sequences.length(assertions).numE((SubLObject)removal_modules_date_utilities.ONE_INTEGER)) {
            final SubLObject assertion = cycl_utilities.formula_arg0(assertions);
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(assertion), (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            if (removal_modules_date_utilities.NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, (SubLObject)removal_modules_date_utilities.NIL);
            }
        }
        final SubLObject most_precise_assertion = find_most_precise_date(assertions);
        if (removal_modules_date_utilities.NIL != most_precise_assertion) {
            final SubLObject v_answer = cycl_utilities.formula_arg2(assertions_high.gaf_formula(most_precise_assertion), (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            final SubLObject v_bindings = unification_utilities.term_unify(var, v_answer, (SubLObject)removal_modules_date_utilities.UNPROVIDED, (SubLObject)removal_modules_date_utilities.UNPROVIDED);
            if (removal_modules_date_utilities.NIL != v_answer) {
                backward.removal_add_node(assertions.first(), v_bindings, assertions.rest());
            }
        }
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    public static SubLObject declare_removal_modules_date_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_extract_date_year", "INFERENCE-EXTRACT-DATE-YEAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "year_of_dateP", "YEAR-OF-DATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_extract_date_month", "INFERENCE-EXTRACT-DATE-MONTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "month_of_dateP", "MONTH-OF-DATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_extract_date_day", "INFERENCE-EXTRACT-DATE-DAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "day_number_of_dateP", "DAY-NUMBER-OF-DATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_extract_date_hour", "INFERENCE-EXTRACT-DATE-HOUR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "hour_number_of_dateP", "HOUR-NUMBER-OF-DATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_date_interval_duration", "INFERENCE-DATE-INTERVAL-DURATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_date_interval_durationP", "INFERENCE-DATE-INTERVAL-DURATION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_defining_time_unit_check", "INFERENCE-DEFINING-TIME-UNIT-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "make_defining_time_unit_support", "MAKE-DEFINING-TIME-UNIT-SUPPORT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_defining_time_unit_arg1_unify", "INFERENCE-DEFINING-TIME-UNIT-ARG1-UNIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "inference_defining_time_unit_arg2_unify", "INFERENCE-DEFINING-TIME-UNIT-ARG2-UNIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "removal_latest_date_in_list_before_date_expand", "REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "removal_starting_date_precise", "REMOVAL-STARTING-DATE-PRECISE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "find_most_precise_date", "FIND-MOST-PRECISE-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_date_utilities", "removal_ending_date_precise", "REMOVAL-ENDING-DATE-PRECISE", 1, 1, false);
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    public static SubLObject init_removal_modules_date_utilities_file() {
        removal_modules_date_utilities.$default_year_of_date_check_cost$ = SubLFiles.defparameter("*DEFAULT-YEAR-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_date_utilities.$default_month_of_date_check_cost$ = SubLFiles.defparameter("*DEFAULT-MONTH-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_date_utilities.$default_day_number_of_date_check_cost$ = SubLFiles.defparameter("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        removal_modules_date_utilities.$default_hour_number_of_date_check_cost$ = SubLFiles.defparameter("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    public static SubLObject setup_removal_modules_date_utilities_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const0$yearOfDate);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_date_utilities.$kw1$POS, removal_modules_date_utilities.$const0$yearOfDate, (SubLObject)removal_modules_date_utilities.TWO_INTEGER);
        preference_modules.doomed_unless_all_args_bindable((SubLObject)removal_modules_date_utilities.$kw2$NEG, removal_modules_date_utilities.$const0$yearOfDate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw3$REMOVAL_YEAR_OF_DATE_CHECK_POS, (SubLObject)removal_modules_date_utilities.$list4);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw5$REMOVAL_YEAR_OF_DATE_CHECK_NEG, (SubLObject)removal_modules_date_utilities.$list6);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw7$REMOVAL_YEAR_OF_DATE_UNIFY, (SubLObject)removal_modules_date_utilities.$list8);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const9$monthOfDate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw10$REMOVAL_MONTH_OF_DATE_CHECK_POS, (SubLObject)removal_modules_date_utilities.$list11);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw12$REMOVAL_MONTH_OF_DATE_CHECK_NEG, (SubLObject)removal_modules_date_utilities.$list13);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw14$REMOVAL_MONTH_OF_DATE_UNIFY, (SubLObject)removal_modules_date_utilities.$list15);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const16$dayNumberOfDate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw17$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS, (SubLObject)removal_modules_date_utilities.$list18);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw19$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG, (SubLObject)removal_modules_date_utilities.$list20);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw21$REMOVAL_DAY_NUMBER_OF_DATE_UNIFY, (SubLObject)removal_modules_date_utilities.$list22);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const23$hourNumberOfDate);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw24$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS, (SubLObject)removal_modules_date_utilities.$list25);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw26$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG, (SubLObject)removal_modules_date_utilities.$list27);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw28$REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY, (SubLObject)removal_modules_date_utilities.$list29);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw30$REMOVAL_DATE_INTERVALS_INTERSECT_CHECK, (SubLObject)removal_modules_date_utilities.$list31);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw32$REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK, (SubLObject)removal_modules_date_utilities.$list33);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw34$REMOVAL_DATE_INTERVAL_DURATION_UNIFY, (SubLObject)removal_modules_date_utilities.$list35);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw36$REMOVAL_DATE_INTERVAL_DURATION_CHECK, (SubLObject)removal_modules_date_utilities.$list37);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw39$REMOVAL_DEFINING_TIME_UNIT_CHECK, (SubLObject)removal_modules_date_utilities.$list40);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw42$REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY, (SubLObject)removal_modules_date_utilities.$list43);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw45$REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY, (SubLObject)removal_modules_date_utilities.$list46);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const47$latestDateInListBeforeDate);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_date_utilities.$kw1$POS, removal_modules_date_utilities.$const47$latestDateInListBeforeDate, (SubLObject)removal_modules_date_utilities.TWO_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_date_utilities.$kw1$POS, removal_modules_date_utilities.$const47$latestDateInListBeforeDate, (SubLObject)removal_modules_date_utilities.THREE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw48$REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE, (SubLObject)removal_modules_date_utilities.$list49);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const53$startingDate_Precise);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_date_utilities.$kw1$POS, removal_modules_date_utilities.$const53$startingDate_Precise, (SubLObject)removal_modules_date_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw54$REMOVAL_STARTING_DATE_PRECISE, (SubLObject)removal_modules_date_utilities.$list55);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_date_utilities.$const59$endingDate_Precise);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_date_utilities.$kw1$POS, removal_modules_date_utilities.$const59$endingDate_Precise, (SubLObject)removal_modules_date_utilities.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_date_utilities.$kw60$REMOVAL_ENDING_DATE_PRECISE, (SubLObject)removal_modules_date_utilities.$list61);
        return (SubLObject)removal_modules_date_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_date_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_date_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_date_utilities_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_date_utilities();
        removal_modules_date_utilities.$default_year_of_date_check_cost$ = null;
        removal_modules_date_utilities.$default_month_of_date_check_cost$ = null;
        removal_modules_date_utilities.$default_day_number_of_date_check_cost$ = null;
        removal_modules_date_utilities.$default_hour_number_of_date_check_cost$ = null;
        $const0$yearOfDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw3$REMOVAL_YEAR_OF_DATE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-YEAR-OF-DATE-CHECK-POS");
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$yearOfDate <year> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$yearOfDate 2003 (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))") });
        $kw5$REMOVAL_YEAR_OF_DATE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-YEAR-OF-DATE-CHECK-NEG");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YEAR"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("YEAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$yearOfDate <year> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$yearOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn #$August \n                                       (#$YearFn 2003)))))))") });
        $kw7$REMOVAL_YEAR_OF_DATE_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-YEAR-OF-DATE-UNIFY");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-YEAR-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-EXTRACT-DATE-YEAR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("yearOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$yearOfDate <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$yearOfDate ?YEAR \n                        (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))") });
        $const9$monthOfDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate"));
        $kw10$REMOVAL_MONTH_OF_DATE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-MONTH-OF-DATE-CHECK-POS");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$monthOfDate <month> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$monthOfDate #$August (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn #$August \n                             (#$YearFn 2003)))))))") });
        $kw12$REMOVAL_MONTH_OF_DATE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-MONTH-OF-DATE-CHECK-NEG");
        $list13 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONTH"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MONTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$monthOfDate <month> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$monthOfDate #$February (#$SecondFn 54 \n                                     (#$MinuteFn 48 \n                                      (#$HourFn 10 \n                                       (#$DayFn 28 \n                                        (#$MonthFn August \n                                         (#$YearFn 2003)))))))") });
        $kw14$REMOVAL_MONTH_OF_DATE_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-MONTH-OF-DATE-UNIFY");
        $list15 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-MONTH-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-EXTRACT-DATE-MONTH"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("monthOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$monthOfDate <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$monthOfDate ?MONTH (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn August \n                               (#$YearFn 2003)))))))") });
        $const16$dayNumberOfDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate"));
        $kw17$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-DAY-NUMBER-OF-DATE-CHECK-POS");
        $list18 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$dayNumberOfDate <day-number> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$dayNumberOfDate 28 (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn #$August \n                               (#$YearFn 2003)))))))") });
        $kw19$REMOVAL_DAY_NUMBER_OF_DATE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-DAY-NUMBER-OF-DATE-CHECK-NEG");
        $list20 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DAY-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$dayNumberOfDate <day-number> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$dayNumberOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn August \n                                       (#$YearFn 2003)))))))") });
        $kw21$REMOVAL_DAY_NUMBER_OF_DATE_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-DAY-NUMBER-OF-DATE-UNIFY");
        $list22 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-EXTRACT-DATE-DAY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dayNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$dayNumberOfDate <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$dayNumberOfDate ?DAY-NUMBER\n                        (#$SecondFn 54 \n                         (#$MinuteFn 48 \n                          (#$HourFn 10 \n                           (#$DayFn 28 \n                            (#$MonthFn August \n                             (#$YearFn 2003)))))))") });
        $const23$hourNumberOfDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate"));
        $kw24$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_POS = SubLObjectFactory.makeKeyword("REMOVAL-HOUR-NUMBER-OF-DATE-CHECK-POS");
        $list25 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$hourNumberOfDate <hour-number> <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$hourNumberOfDate 28 (#$SecondFn 54 \n                           (#$MinuteFn 48 \n                            (#$HourFn 10 \n                             (#$DayFn 28 \n                              (#$MonthFn #$August \n                               (#$YearFn 2003)))))))") });
        $kw26$REMOVAL_HOUR_NUMBER_OF_DATE_CHECK_NEG = SubLObjectFactory.makeKeyword("REMOVAL-HOUR-NUMBER-OF-DATE-CHECK-NEG");
        $list27 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("NEG"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INVERT-BOOLEAN-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER-OF-DATE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("HOUR-NUMBER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$not (#$hourNumberOfDate <hour-number> <fully-bound-p>))"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$not #$hourNumberOfDate 1970 (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                 (#$HourFn 10 \n                                   (#$DayFn 28 \n                                     (#$MonthFn August \n                                       (#$YearFn 2003)))))))") });
        $kw28$REMOVAL_HOUR_NUMBER_OF_DATE_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-HOUR-NUMBER-OF-DATE-UNIFY");
        $list29 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-HOUR-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-EXTRACT-DATE-HOUR"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hourNumberOfDate")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE"))), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$hourNumberOfDate <not-fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$hourNumberOfDate ?HOUR (#$SecondFn 54 \n                               (#$MinuteFn 48 \n                                (#$HourFn 10 \n                                 (#$DayFn 28 \n                                  (#$MonthFn August \n                                   (#$YearFn 2003)))))))") });
        $kw30$REMOVAL_DATE_INTERVALS_INTERSECT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-DATE-INTERVALS-INTERSECT-CHECK");
        $list31 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyIntersects")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-INDEXICAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-INDEXICAL-P")))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallyIntersects")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE1"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVALS-OR-INDEXICALS-INTERSECT?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*TIME-INFERENCE-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallyIntersects <date-interval> <date-interval>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallyIntersects (#$IntervalEndedByFn (#$YearFn 2005)) (#$IntervalStartedBy (#$YearFn 2003)))") });
        $kw32$REMOVAL_DATE_INTERVAL_SUBSUMES_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-DATE-INTERVAL-SUBSUMES-CHECK");
        $list33 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-INDEXICAL-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDETERMINATE-DATE-INTERVAL-P"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("INDETERMINATE-DATE-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("TEMPORAL-INDEXICAL-P"))))), SubLObjectFactory.makeKeyword("EXCLUSIVE"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("SUPPLANTS"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE1"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-OR-INDEXICAL-SUBSUMES?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE2")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*TIME-INFERENCE-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$temporallySubsumes <date-interval> <date-interval>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$temporallySubsumes (#$IntervalEndedByFn (#$YearFn 2005)) (#$YearFn 2003))") });
        $kw34$REMOVAL_DATE_INTERVAL_DURATION_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-DATE-INTERVAL-DURATION-UNIFY");
        $list35 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*DEFAULT-DAY-NUMBER-OF-DATE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND")))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-DATE-INTERVAL-DURATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("NOT-FULLY-BOUND"))))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*TIME-INFERENCE-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$duration <date-interval> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$duration (#$TimeIntervalInclusiveFn (#$YearFn 2001) (#$YearFn 2004)) ?DURATION)") });
        $kw36$REMOVAL_DATE_INTERVAL_DURATION_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-DATE-INTERVAL-DURATION-CHECK");
        $list37 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("DURATION-P"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("duration")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DURATION"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DURATION")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("DURATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-DATE-INTERVAL-DURATION?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DATE-INTERVAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DURATION")))), SubLObjectFactory.makeKeyword("SUPPORT-MODULE"), SubLObjectFactory.makeKeyword("TIME"), SubLObjectFactory.makeKeyword("SUPPORT-MT"), SubLObjectFactory.makeSymbol("*TIME-INFERENCE-MT*"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$duration <date-interval> <duration>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$duration (#$TimeIntervalInclusiveFn (#$YearFn 2001) (#$YearFn 2004)) (#$YearsDuration 4))") });
        $kw38$UNEVALUATABLE = SubLObjectFactory.makeKeyword("UNEVALUATABLE");
        $kw39$REMOVAL_DEFINING_TIME_UNIT_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-DEFINING-TIME-UNIT-CHECK");
        $list40 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), SubLObjectFactory.makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT")))), SubLObjectFactory.makeKeyword("OUTPUT-CHECK-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TUPLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-DEFINING-TIME-UNIT-CHECK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT")))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-DEFINING-TIME-UNIT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$definingTimeUnit <fort> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$definingTimeUnit #$CalendarSecond #$SecondsDuration)") });
        $const41$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw42$REMOVAL_DEFINING_TIME_UNIT_ARG1_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-DEFINING-TIME-UNIT-ARG1-UNIFY");
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FORT")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_date_utilities.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-DEFINING-TIME-UNIT-ARG1-UNIFY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("UNIT"))), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-DEFINING-TIME-UNIT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$definingTimeUnit <not-fully-bound> <fort>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$definingTimeUnit ?WHAT #$SecondsDuration)") });
        $const44$definingTimeUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit"));
        $kw45$REMOVAL_DEFINING_TIME_UNIT_ARG2_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-DEFINING-TIME-UNIT-ARG2-UNIFY");
        $list46 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_date_utilities.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("INPUT-EXTRACT-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), SubLObjectFactory.makeKeyword("OUTPUT-GENERATE-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-DEFINING-TIME-UNIT-ARG2-UNIFY"), (SubLObject)SubLObjectFactory.makeKeyword("INPUT"))), SubLObjectFactory.makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definingTimeUnit")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE")), (SubLObject)SubLObjectFactory.makeKeyword("INPUT")), SubLObjectFactory.makeKeyword("SUPPORT"), SubLObjectFactory.makeSymbol("MAKE-DEFINING-TIME-UNIT-SUPPORT"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$definingTimeUnit <fort> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$definingTimeUnit #$CalendarSecond ?WHAT)") });
        $const47$latestDateInListBeforeDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latestDateInListBeforeDate"));
        $kw48$REMOVAL_LATEST_DATE_IN_LIST_BEFORE_DATE = SubLObjectFactory.makeKeyword("REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE");
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latestDateInListBeforeDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("latestDateInListBeforeDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_date_utilities.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-LATEST-DATE-IN-LIST-BEFORE-DATE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$latestDateInListBeforeDate <not-fully-bound> <fully-bound> <fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$latestDateInListBeforeDate ?DATE \n (#$TheList \n  (#$DayFn 5 \n   (#$MonthFn #$March \n    (#$YearFn 2012))) \n  (#$DayFn 8 \n   (#$MonthFn #$February \n    (#$YearFn 2012))) \n  (#$DayFn 10 \n   (#$MonthFn #$January \n    (#$YearFn 2012))))\n (#$DayFn 15 \n  (#$MonthFn #$February \n   (#$YearFn 2012))))\n-->\n(((?DATE #$DayFn 8 (#$MonthFn #$February (#$YearFn 2012)))))") });
        $kw50$DATE_LIST_ARG_IS_NOT_AN_EL_LIST = SubLObjectFactory.makeKeyword("DATE-LIST-ARG-IS-NOT-AN-EL-LIST");
        $kw51$LIMIT_DATE_ARG_IS_NOT_A_DATE = SubLObjectFactory.makeKeyword("LIMIT-DATE-ARG-IS-NOT-A-DATE");
        $kw52$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const53$startingDate_Precise = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate-Precise"));
        $kw54$REMOVAL_STARTING_DATE_PRECISE = SubLObjectFactory.makeKeyword("REMOVAL-STARTING-DATE-PRECISE");
        $list55 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate-Precise")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate-Precise")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_date_utilities.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-STARTING-DATE-PRECISE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$startingDate-Precise <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $const56$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const57$startingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startingDate"));
        $const58$temporallySubsumes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporallySubsumes"));
        $const59$endingDate_Precise = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate-Precise"));
        $kw60$REMOVAL_ENDING_DATE_PRECISE = SubLObjectFactory.makeKeyword("REMOVAL-ENDING-DATE-PRECISE");
        $list61 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate-Precise")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate-Precise")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_date_utilities.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-ENDING-DATE-PRECISE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$endingDate-Precise <fully-bound> <not-fully-bound>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("") });
        $const62$endingDate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("endingDate"));
    }
}

/*

	Total time: 293 ms
	
*/