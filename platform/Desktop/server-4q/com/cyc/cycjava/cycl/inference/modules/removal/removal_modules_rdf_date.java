package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rdf_date extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date";
    public static final String myFingerPrint = "fe1b3a19d2bd14ff9e5e7bc9ccff1778373342e2d8257c0e94c5ecd017d01aec";
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 9790L)
    private static SubLSymbol $rdf_date_debugP$;
    private static final SubLSymbol $kw0$REMOVAL_RDF_DATE_UNIFY_ARG1;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$REMOVAL_RDF_DATE_UNIFY_ARG2;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$REMOVAL_RDF_DATE_CHECK;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$OPAQUE;
    private static final SubLSymbol $sym9$REMOVAL_RDF_DATE_UNIFY_ARG1;
    private static final SubLSymbol $sym10$REMOVAL_RDF_DATE_UNIFY_ARG2;
    private static final SubLSymbol $sym11$REMOVAL_RDF_DATE_CHECK_EXPAND;
    private static final SubLString $str12$_4__0d;
    private static final SubLString $str13$_4__0d__2__0d;
    private static final SubLString $str14$__2__0d;
    private static final SubLString $str15$T_2__0d__2__0d__2__0d;
    private static final SubLString $str16$__3__0d;
    private static final SubLObject $const17$CalendarYear;
    private static final SubLObject $const18$RDFTypedLiteralFn;
    private static final SubLList $list19;
    private static final SubLObject $const20$CalendarMonth;
    private static final SubLList $list21;
    private static final SubLObject $const22$CalendarDay;
    private static final SubLList $list23;
    private static final SubLObject $const24$CalendarSecond;
    private static final SubLList $list25;
    private static final SubLObject $const26$CalendarMilliSecond;
    private static final SubLSymbol $kw27$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2;
    private static final SubLList $list30;
    private static final SubLSymbol $kw31$REMOVAL_TIME_INTERVAL_SPEC_CHECK;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG;
    private static final SubLList $list34;
    private static final SubLObject $const35$hasTimeIntervalSpecString;
    private static final SubLSymbol $sym36$REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND;
    private static final SubLSymbol $kw37$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym38$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $kw39$FAIL;
    private static final SubLSymbol $sym40$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1;
    private static final SubLSymbol $sym41$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2;
    private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str43$Time_interval__S_extends_back_to_;
    private static final SubLString $str44$Time_interval__S_extends_to_the_e;
    private static final SubLString $str45$_;
    private static final SubLString $str46$_;
    private static final SubLString $str47$_;
    private static final SubLString $str48$_;
    private static final SubLString $str49$Can_t_convert__S_to_RDF_;
    private static final SubLString $str50$__;
    private static final SubLObject $const51$DaysDuration;
    private static final SubLString $str52$_AD;
    private static final SubLSymbol $sym53$WHITESPACE_STRING_;
    private static final SubLList $list54;
    private static final SubLString $str55$_;
    private static final SubLSymbol $kw56$INITIAL;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$STARTED;
    private static final SubLSymbol $kw59$MIDDLE;
    private static final SubLSymbol $kw60$LOOKING_FOR_COMMA;
    private static final SubLSymbol $kw61$ABORT;
    private static final SubLSymbol $kw62$DONE;
    private static final SubLSymbol $kw63$LOOKING_FOR_CLOSE_BRACKET;
    private static final SubLSymbol $sym64$CYCL_EXPRESSION_P;
    private static final SubLSymbol $sym65$CONSTANT_P;
    private static final SubLString $str66$_S_is_not_a_valid_time_interval_;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLObject $const70$SomeTimeInIntervalFn;
    private static final SubLSymbol $sym71$CONSTRUCT_TIME_LITERAL;
    private static final SubLSymbol $kw72$TEST;
    private static final SubLSymbol $sym73$EQUALS_EL_;
    private static final SubLSymbol $kw74$OWNER;
    private static final SubLSymbol $kw75$CLASSES;
    private static final SubLList $list76;
    private static final SubLSymbol $kw77$KB;
    private static final SubLSymbol $kw78$FULL;
    private static final SubLSymbol $kw79$WORKING_;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$CYCL_DATE_FROM_RDF_DATE;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$CYCL_TIME_INTERVAL_TO_RDF;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$RDF_TIME_INTERVAL_TO_CYCL;
    private static final SubLSymbol $sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$SOME_TIME_INTERVAL_P;
    private static final SubLSymbol $sym89$GET_SOMETIME_DUMMY;
    private static final SubLSymbol $kw90$SOMETIME;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 2627L)
    public static SubLObject removal_rdf_date_unify_arg1(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf_date.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf_date.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rdf_date = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject date_string = cycl_utilities.formula_arg1(rdf_date, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject cycl_date = rdf_utilities.cycl_date_from_rdf_date(date_string);
        final SubLObject new_asent = cycl_utilities.expression_subst(cycl_date, var, asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(cycl_date, var, (SubLObject)removal_modules_rdf_date.T, (SubLObject)removal_modules_rdf_date.T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf_date.$kw8$OPAQUE, new_asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), v_bindings, justification);
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 3160L)
    public static SubLObject removal_rdf_date_unify_arg2(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf_date.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf_date.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject date = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject literal_nat = construct_time_literal(date);
        final SubLObject new_asent = cycl_utilities.expression_subst(literal_nat, var, asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(literal_nat, var, (SubLObject)removal_modules_rdf_date.T, (SubLObject)removal_modules_rdf_date.T);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf_date.$kw8$OPAQUE, new_asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), v_bindings, justification);
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 3626L)
    public static SubLObject removal_rdf_date_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf_date.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf_date.NIL;
        }
        final SubLObject date = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject rdf_date = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        if (removal_modules_rdf_date.NIL != date_utilities.date_p(date) && cycl_utilities.formula_arg1(rdf_date, (SubLObject)removal_modules_rdf_date.UNPROVIDED).isString()) {
            final SubLObject rdf_date_string = cycl_utilities.formula_arg1(rdf_date, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
            final SubLObject computed_date_nat = construct_time_literal(date);
            final SubLObject computed_date_string = cycl_utilities.formula_arg1(computed_date_nat, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
            if (computed_date_string.equal(rdf_date_string)) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf_date.$kw8$OPAQUE, asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 4181L)
    public static SubLObject construct_time_literal(final SubLObject cyc_date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject date_type = date_utilities.explode_date(cyc_date);
        final SubLObject year = thread.secondMultipleValue();
        final SubLObject month = thread.thirdMultipleValue();
        final SubLObject day = thread.fourthMultipleValue();
        final SubLObject hour = thread.fifthMultipleValue();
        final SubLObject min = thread.sixthMultipleValue();
        final SubLObject sec = thread.seventhMultipleValue();
        final SubLObject milli = thread.eighthMultipleValue();
        thread.resetMultipleValues();
        final SubLObject year_string = PrintLow.format((SubLObject)removal_modules_rdf_date.NIL, (SubLObject)removal_modules_rdf_date.$str12$_4__0d, year);
        final SubLObject month_string = PrintLow.format((SubLObject)removal_modules_rdf_date.NIL, (SubLObject)removal_modules_rdf_date.$str13$_4__0d__2__0d, year, month);
        final SubLObject day_string = PrintLow.format((SubLObject)removal_modules_rdf_date.NIL, (SubLObject)removal_modules_rdf_date.$str14$__2__0d, day);
        final SubLObject date_string = Sequences.cconcatenate(month_string, day_string);
        final SubLObject time_string = PrintLow.format((SubLObject)removal_modules_rdf_date.NIL, (SubLObject)removal_modules_rdf_date.$str15$T_2__0d__2__0d__2__0d, new SubLObject[] { hour, min, sec });
        final SubLObject milli_string = PrintLow.format((SubLObject)removal_modules_rdf_date.NIL, (SubLObject)removal_modules_rdf_date.$str16$__3__0d, milli);
        SubLObject literal_nat = (SubLObject)removal_modules_rdf_date.NIL;
        if (removal_modules_rdf_date.NIL != isa.isaP(cyc_date, removal_modules_rdf_date.$const17$CalendarYear, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            literal_nat = (SubLObject)ConsesLow.list(removal_modules_rdf_date.$const18$RDFTypedLiteralFn, year_string, czer_main.canonicalize_term((SubLObject)removal_modules_rdf_date.$list19, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
        }
        else if (removal_modules_rdf_date.NIL != isa.isaP(cyc_date, removal_modules_rdf_date.$const20$CalendarMonth, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            literal_nat = (SubLObject)ConsesLow.list(removal_modules_rdf_date.$const18$RDFTypedLiteralFn, month_string, czer_main.canonicalize_term((SubLObject)removal_modules_rdf_date.$list21, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
        }
        else if (removal_modules_rdf_date.NIL != isa.isaP(cyc_date, removal_modules_rdf_date.$const22$CalendarDay, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            literal_nat = (SubLObject)ConsesLow.list(removal_modules_rdf_date.$const18$RDFTypedLiteralFn, date_string, czer_main.canonicalize_term((SubLObject)removal_modules_rdf_date.$list23, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
        }
        else if (removal_modules_rdf_date.NIL != isa.isaP(cyc_date, removal_modules_rdf_date.$const24$CalendarSecond, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            final SubLObject full_date_string = Sequences.cconcatenate(date_string, time_string);
            literal_nat = (SubLObject)ConsesLow.list(removal_modules_rdf_date.$const18$RDFTypedLiteralFn, full_date_string, czer_main.canonicalize_term((SubLObject)removal_modules_rdf_date.$list25, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
        }
        else if (removal_modules_rdf_date.NIL != isa.isaP(cyc_date, removal_modules_rdf_date.$const26$CalendarMilliSecond, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            final SubLObject full_date_string = Sequences.cconcatenate(date_string, new SubLObject[] { time_string, milli_string });
            literal_nat = (SubLObject)ConsesLow.list(removal_modules_rdf_date.$const18$RDFTypedLiteralFn, full_date_string, czer_main.canonicalize_term((SubLObject)removal_modules_rdf_date.$list25, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
        }
        return literal_nat;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 7957L)
    public static SubLObject removal_time_interval_spec_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf_date.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf_date.NIL;
        }
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject spec_string = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        if (spec_string.isString()) {
            final SubLObject cycl = rdf_time_interval_to_cycl(spec_string);
            if (earliest_possible_start_day(arg1).equal(earliest_possible_start_day(cycl)) && latest_possible_start_day(arg1).equal(latest_possible_start_day(cycl)) && earliest_possible_end_day(arg1).equal(earliest_possible_end_day(cycl)) && latest_possible_end_day(arg1).equal(latest_possible_end_day(cycl))) {
                backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf_date.$kw8$OPAQUE, asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
            }
        }
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 8652L)
    public static SubLObject removal_time_interval_spec_unify_arg1(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf_date.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf_date.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = (SubLObject)removal_modules_rdf_date.NIL;
        try {
            thread.throwStack.push(removal_modules_rdf_date.$kw37$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)removal_modules_rdf_date.$sym38$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
                    final SubLObject interval_string = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
                    final SubLObject cycl_time_interval = rdf_time_interval_to_cycl(interval_string);
                    if (!cycl_time_interval.eql((SubLObject)removal_modules_rdf_date.$kw39$FAIL)) {
                        final SubLObject new_asent = cycl_utilities.expression_subst(cycl_time_interval, var, asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(cycl_time_interval, var, (SubLObject)removal_modules_rdf_date.T, (SubLObject)removal_modules_rdf_date.T);
                        final SubLObject justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf_date.$kw8$OPAQUE, new_asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), v_bindings, justification);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)removal_modules_rdf_date.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)removal_modules_rdf_date.$kw37$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 9256L)
    public static SubLObject removal_time_interval_spec_unify_arg2(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rdf_date.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rdf_date.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject time_interval = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        final SubLObject spec_string = cycl_time_interval_to_rdf(time_interval, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
        if (removal_modules_rdf_date.NIL != spec_string) {
            final SubLObject new_asent = cycl_utilities.expression_subst(spec_string, var, asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(spec_string, var, (SubLObject)removal_modules_rdf_date.T, (SubLObject)removal_modules_rdf_date.T);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rdf_date.$kw8$OPAQUE, new_asent, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), v_bindings, justification);
        }
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 9836L)
    public static SubLObject cycl_time_interval_to_rdf(final SubLObject time_interval, SubLObject nesting_depth) {
        if (nesting_depth == removal_modules_rdf_date.UNPROVIDED) {
            nesting_depth = (SubLObject)removal_modules_rdf_date.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (removal_modules_rdf_date.NIL != date_utilities.date_p(time_interval) && nesting_depth.numGE((SubLObject)removal_modules_rdf_date.TWO_INTEGER)) {
            return Values.values(cycl_date_to_rdf(time_interval), (SubLObject)removal_modules_rdf_date.NIL);
        }
        SubLObject error_message = (SubLObject)removal_modules_rdf_date.NIL;
        SubLObject string = (SubLObject)removal_modules_rdf_date.NIL;
        if (removal_modules_rdf_date.NIL == removal_modules_rdf_date.$rdf_date_debugP$.getDynamicValue(thread)) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)removal_modules_rdf_date.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject eps = earliest_possible_start_day(time_interval);
                        final SubLObject lps = latest_possible_start_day(time_interval);
                        final SubLObject epe = earliest_possible_end_day(time_interval);
                        final SubLObject lpe = latest_possible_end_day(time_interval);
                        if (removal_modules_rdf_date.ZERO_INTEGER.eql(nesting_depth)) {
                            if ((removal_modules_rdf_date.NIL == lps || removal_modules_rdf_date.NIL == eps) && removal_modules_rdf_date.NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(time_interval))) {
                                Errors.error((SubLObject)removal_modules_rdf_date.$str43$Time_interval__S_extends_back_to_, time_interval);
                            }
                            if ((removal_modules_rdf_date.NIL == epe || removal_modules_rdf_date.NIL == lpe) && removal_modules_rdf_date.NIL != date_utilities.end_of_timeP(time_interval_utilities.cycl_interval_final_second(time_interval))) {
                                Errors.error((SubLObject)removal_modules_rdf_date.$str44$Time_interval__S_extends_to_the_e, time_interval);
                            }
                        }
                        SubLObject stream = (SubLObject)removal_modules_rdf_date.NIL;
                        try {
                            stream = streams_high.make_private_string_output_stream();
                            print_high.princ((SubLObject)removal_modules_rdf_date.$str45$_, stream);
                            output_time_interval_terminus_range(eps, lps, stream, nesting_depth);
                            print_high.princ((SubLObject)removal_modules_rdf_date.$str46$_, stream);
                            if (removal_modules_rdf_date.NIL != epe || removal_modules_rdf_date.NIL != lpe) {
                                print_high.princ((SubLObject)removal_modules_rdf_date.$str47$_, stream);
                                output_time_interval_terminus_range(epe, lpe, stream, nesting_depth);
                            }
                            print_high.princ((SubLObject)removal_modules_rdf_date.$str48$_, stream);
                            if (removal_modules_rdf_date.ZERO_INTEGER.eql(nesting_depth)) {
                                output_duration_range_spec(eps, lps, epe, lpe, stream);
                            }
                            string = streams_high.get_output_stream_string(stream);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rdf_date.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                streams_high.close(stream, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)removal_modules_rdf_date.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
        }
        else {
            final SubLObject eps2 = earliest_possible_start_day(time_interval);
            final SubLObject lps2 = latest_possible_start_day(time_interval);
            final SubLObject epe2 = earliest_possible_end_day(time_interval);
            final SubLObject lpe2 = latest_possible_end_day(time_interval);
            if (removal_modules_rdf_date.ZERO_INTEGER.eql(nesting_depth)) {
                if ((removal_modules_rdf_date.NIL == lps2 || removal_modules_rdf_date.NIL == eps2) && removal_modules_rdf_date.NIL != date_utilities.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(time_interval))) {
                    Errors.error((SubLObject)removal_modules_rdf_date.$str43$Time_interval__S_extends_back_to_, time_interval);
                }
                if ((removal_modules_rdf_date.NIL == epe2 || removal_modules_rdf_date.NIL == lpe2) && removal_modules_rdf_date.NIL != date_utilities.end_of_timeP(time_interval_utilities.cycl_interval_final_second(time_interval))) {
                    Errors.error((SubLObject)removal_modules_rdf_date.$str44$Time_interval__S_extends_to_the_e, time_interval);
                }
            }
            SubLObject stream2 = (SubLObject)removal_modules_rdf_date.NIL;
            try {
                stream2 = streams_high.make_private_string_output_stream();
                print_high.princ((SubLObject)removal_modules_rdf_date.$str45$_, stream2);
                output_time_interval_terminus_range(eps2, lps2, stream2, nesting_depth);
                print_high.princ((SubLObject)removal_modules_rdf_date.$str46$_, stream2);
                if (removal_modules_rdf_date.NIL != epe2 || removal_modules_rdf_date.NIL != lpe2) {
                    print_high.princ((SubLObject)removal_modules_rdf_date.$str47$_, stream2);
                    output_time_interval_terminus_range(epe2, lpe2, stream2, nesting_depth);
                }
                print_high.princ((SubLObject)removal_modules_rdf_date.$str48$_, stream2);
                if (removal_modules_rdf_date.ZERO_INTEGER.eql(nesting_depth)) {
                    output_duration_range_spec(eps2, lps2, epe2, lpe2, stream2);
                }
                string = streams_high.get_output_stream_string(stream2);
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)removal_modules_rdf_date.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    streams_high.close(stream2, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        return Values.values((SubLObject)((removal_modules_rdf_date.NIL != error_message) ? removal_modules_rdf_date.NIL : string), (SubLObject)((removal_modules_rdf_date.NIL != error_message) ? error_message : removal_modules_rdf_date.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 11386L)
    public static SubLObject output_time_interval_terminus_range(final SubLObject earliest_day, final SubLObject latest_day, final SubLObject stream, final SubLObject nesting_depth) {
        if (removal_modules_rdf_date.NIL != earliest_day || !earliest_day.equal(latest_day)) {
            if (earliest_day.equal(latest_day)) {
                output_time_interval_terminus(earliest_day, stream, nesting_depth);
            }
            else {
                final SubLObject start = (removal_modules_rdf_date.NIL != earliest_day) ? earliest_day : date_utilities.$beginning_of_time$.getGlobalValue();
                final SubLObject end = (removal_modules_rdf_date.NIL != latest_day) ? latest_day : date_utilities.$end_of_time$.getGlobalValue();
                final SubLObject interval = time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(start, start, end, end, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
                print_high.princ(cycl_time_interval_to_rdf(interval, number_utilities.f_1X(nesting_depth)), stream);
            }
        }
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 12065L)
    public static SubLObject output_time_interval_terminus(final SubLObject terminus, final SubLObject stream, final SubLObject nesting_depth) {
        if (removal_modules_rdf_date.NIL != date_utilities.date_p(terminus)) {
            print_high.princ(cycl_time_interval_to_rdf(date_utilities.day_of_date(terminus), number_utilities.f_1X(nesting_depth)), stream);
        }
        else if (removal_modules_rdf_date.NIL != sometime_interval_p(terminus)) {
            print_high.princ(cycl_time_interval_to_rdf(cycl_utilities.nat_arg1(terminus, (SubLObject)removal_modules_rdf_date.UNPROVIDED), number_utilities.f_1X(nesting_depth)), stream);
        }
        else {
            Errors.error((SubLObject)removal_modules_rdf_date.$str49$Can_t_convert__S_to_RDF_, terminus);
        }
        return terminus;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 12457L)
    public static SubLObject output_duration_range_spec(final SubLObject earliest_start, SubLObject latest_start, SubLObject earliest_end, final SubLObject latest_end, final SubLObject stream) {
        print_high.princ((SubLObject)removal_modules_rdf_date.$str50$__, stream);
        if (removal_modules_rdf_date.NIL == earliest_end) {
            earliest_end = earliest_start;
        }
        if (removal_modules_rdf_date.NIL == latest_start) {
            latest_start = latest_end;
        }
        if (removal_modules_rdf_date.NIL != earliest_end && removal_modules_rdf_date.NIL != latest_start && removal_modules_rdf_date.NIL == date_utilities.dateLE(earliest_end, latest_start)) {
            output_duration_spec(date_utilities.time_elapsed(earliest_end, latest_start, removal_modules_rdf_date.$const51$DaysDuration), stream);
        }
        print_high.princ((SubLObject)removal_modules_rdf_date.$str46$_, stream);
        if (removal_modules_rdf_date.NIL != earliest_start && removal_modules_rdf_date.NIL != latest_end) {
            print_high.princ((SubLObject)removal_modules_rdf_date.$str47$_, stream);
            output_duration_spec(date_utilities.time_elapsed(latest_end, earliest_start, removal_modules_rdf_date.$const51$DaysDuration), stream);
        }
        print_high.princ((SubLObject)removal_modules_rdf_date.$str48$_, stream);
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13124L)
    public static SubLObject output_duration_spec(final SubLObject duration, final SubLObject stream) {
        PrintLow.format(stream, (SubLObject)removal_modules_rdf_date.$str52$_AD, Numbers.abs(Numbers.integerDivide(date_utilities.convert_time_quant_to_seconds(duration), numeric_date_utilities.$seconds_in_a_day$.getGlobalValue())));
        return duration;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13295L)
    public static SubLObject earliest_possible_start_day(final SubLObject time_interval) {
        final SubLObject initial_second = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_early(time_interval);
        return (SubLObject)((removal_modules_rdf_date.NIL != date_utilities.date_p(initial_second)) ? date_utilities.day_of_date(initial_second) : removal_modules_rdf_date.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13546L)
    public static SubLObject earliest_possible_end_day(final SubLObject time_interval) {
        final SubLObject final_second = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_early(time_interval);
        return (SubLObject)((removal_modules_rdf_date.NIL != date_utilities.date_p(final_second)) ? date_utilities.day_of_date(final_second) : removal_modules_rdf_date.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13787L)
    public static SubLObject latest_possible_start_day(final SubLObject time_interval) {
        final SubLObject initial_second = time_interval_utilities.cycl_interval_initial_second_possibly_indeterminate_late(time_interval);
        return (SubLObject)((removal_modules_rdf_date.NIL != date_utilities.date_p(initial_second)) ? date_utilities.day_of_date(initial_second) : removal_modules_rdf_date.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14035L)
    public static SubLObject latest_possible_end_day(final SubLObject time_interval) {
        final SubLObject final_second = time_interval_utilities.cycl_interval_final_second_possibly_indeterminate_late(time_interval);
        return (SubLObject)((removal_modules_rdf_date.NIL != date_utilities.date_p(final_second)) ? date_utilities.day_of_date(final_second) : removal_modules_rdf_date.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14273L)
    public static SubLObject cycl_date_to_rdf(final SubLObject cycl_date) {
        return cycl_utilities.nat_arg1(construct_time_literal(cycl_date), (SubLObject)removal_modules_rdf_date.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14374L)
    public static SubLObject rdf_time_interval_to_cycl(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject result = rdf_time_interval_tokens_to_cycl(Sequences.remove_if((SubLObject)removal_modules_rdf_date.$sym53$WHITESPACE_STRING_, string_utilities.string_tokenize(string, (SubLObject)removal_modules_rdf_date.$list54, (SubLObject)removal_modules_rdf_date.NIL, (SubLObject)removal_modules_rdf_date.T, (SubLObject)removal_modules_rdf_date.T, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED), (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
        final SubLObject remaining_tokens = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_rdf_date.$kw39$FAIL.eql(result) || (removal_modules_rdf_date.NIL != remaining_tokens && removal_modules_rdf_date.NIL == duration_tokens_p(remaining_tokens))) {
            return (SubLObject)removal_modules_rdf_date.$kw39$FAIL;
        }
        return time_interval_utilities.canonicalize_time_interval(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14774L)
    public static SubLObject duration_tokens_p(final SubLObject tokens) {
        return (SubLObject)SubLObjectFactory.makeBoolean(removal_modules_rdf_date.NIL != list_utilities.lengthGE(tokens, (SubLObject)removal_modules_rdf_date.FOUR_INTEGER, (SubLObject)removal_modules_rdf_date.UNPROVIDED) && removal_modules_rdf_date.NIL != list_utilities.lengthLE(tokens, (SubLObject)removal_modules_rdf_date.SIX_INTEGER, (SubLObject)removal_modules_rdf_date.UNPROVIDED) && removal_modules_rdf_date.$str55$_.equal(tokens.first()) && removal_modules_rdf_date.$str45$_.equal(conses_high.second(tokens)) && removal_modules_rdf_date.NIL != conses_high.member((SubLObject)removal_modules_rdf_date.$str46$_, tokens, Symbols.symbol_function((SubLObject)removal_modules_rdf_date.EQUAL), (SubLObject)removal_modules_rdf_date.UNPROVIDED) && removal_modules_rdf_date.$str48$_.equal(list_utilities.last_one(tokens)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 15017L)
    public static SubLObject rdf_time_interval_tokens_to_cycl(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject state = (SubLObject)removal_modules_rdf_date.$kw56$INITIAL;
        SubLObject remaining_tokens = tokens;
        SubLObject start = (SubLObject)removal_modules_rdf_date.NIL;
        SubLObject end = (SubLObject)removal_modules_rdf_date.NIL;
        while (removal_modules_rdf_date.NIL != remaining_tokens && removal_modules_rdf_date.NIL == conses_high.member(state, (SubLObject)removal_modules_rdf_date.$list57, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            final SubLObject token = remaining_tokens.first();
            remaining_tokens = remaining_tokens.rest();
            final SubLObject pcase_var = state;
            if (pcase_var.eql((SubLObject)removal_modules_rdf_date.$kw56$INITIAL)) {
                if (!token.equal((SubLObject)removal_modules_rdf_date.$str45$_)) {
                    final SubLObject result = rdf_utilities.cycl_date_from_rdf_date(token);
                    return Values.values((SubLObject)((removal_modules_rdf_date.NIL != result) ? result : removal_modules_rdf_date.$kw39$FAIL), remaining_tokens);
                }
                state = (SubLObject)removal_modules_rdf_date.$kw58$STARTED;
            }
            else if (pcase_var.eql((SubLObject)removal_modules_rdf_date.$kw58$STARTED)) {
                if (token.equal((SubLObject)removal_modules_rdf_date.$str46$_)) {
                    state = (SubLObject)removal_modules_rdf_date.$kw59$MIDDLE;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject start_$2 = rdf_time_interval_tokens_to_cycl((SubLObject)ConsesLow.cons(token, remaining_tokens));
                    final SubLObject remaining_tokens_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    start = start_$2;
                    remaining_tokens = remaining_tokens_$3;
                    state = (SubLObject)removal_modules_rdf_date.$kw60$LOOKING_FOR_COMMA;
                    if (removal_modules_rdf_date.$kw39$FAIL.eql(start)) {
                        start = (SubLObject)removal_modules_rdf_date.NIL;
                        state = (SubLObject)removal_modules_rdf_date.$kw61$ABORT;
                    }
                    else {
                        start = sometimify_interval(start);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_rdf_date.$kw60$LOOKING_FOR_COMMA)) {
                if (token.equal((SubLObject)removal_modules_rdf_date.$str46$_)) {
                    state = (SubLObject)removal_modules_rdf_date.$kw59$MIDDLE;
                }
                else {
                    if (token.equal((SubLObject)removal_modules_rdf_date.$str48$_)) {
                        return Values.values(start, remaining_tokens);
                    }
                    state = (SubLObject)removal_modules_rdf_date.$kw61$ABORT;
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_rdf_date.$kw59$MIDDLE)) {
                if (token.equal((SubLObject)removal_modules_rdf_date.$str48$_)) {
                    state = (SubLObject)removal_modules_rdf_date.$kw62$DONE;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject end_$4 = rdf_time_interval_tokens_to_cycl((SubLObject)ConsesLow.cons(token, remaining_tokens));
                    final SubLObject remaining_tokens_$4 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    end = end_$4;
                    remaining_tokens = remaining_tokens_$4;
                    state = (SubLObject)removal_modules_rdf_date.$kw63$LOOKING_FOR_CLOSE_BRACKET;
                    if (removal_modules_rdf_date.$kw39$FAIL.eql(end)) {
                        end = (SubLObject)removal_modules_rdf_date.NIL;
                        state = (SubLObject)removal_modules_rdf_date.$kw61$ABORT;
                    }
                    else {
                        end = sometimify_interval(end);
                    }
                }
            }
            else if (pcase_var.eql((SubLObject)removal_modules_rdf_date.$kw63$LOOKING_FOR_CLOSE_BRACKET)) {
                state = (SubLObject)(token.equal((SubLObject)removal_modules_rdf_date.$str48$_) ? removal_modules_rdf_date.$kw62$DONE : removal_modules_rdf_date.$kw61$ABORT);
            }
            else {
                if (pcase_var.eql((SubLObject)removal_modules_rdf_date.$kw61$ABORT)) {
                    return Values.values((SubLObject)removal_modules_rdf_date.$kw39$FAIL, remaining_tokens);
                }
                continue;
            }
        }
        if (state != removal_modules_rdf_date.$kw62$DONE) {
            return Values.values((SubLObject)removal_modules_rdf_date.$kw39$FAIL, remaining_tokens);
        }
        return Values.values(make_possibly_indefinite_time_interval(start, end), remaining_tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 16831L)
    public static SubLObject make_possibly_indefinite_time_interval(final SubLObject start, final SubLObject end) {
        final SubLObject eps = earliest_possible_start_day(start);
        final SubLObject lps = latest_possible_end_day(start);
        final SubLObject epe = earliest_possible_start_day(end);
        final SubLObject lpe = latest_possible_end_day(end);
        return time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn((removal_modules_rdf_date.NIL != eps) ? eps : date_utilities.$beginning_of_time$.getGlobalValue(), (removal_modules_rdf_date.NIL != lps) ? lps : date_utilities.$end_of_time$.getGlobalValue(), (removal_modules_rdf_date.NIL != epe) ? epe : date_utilities.$beginning_of_time$.getGlobalValue(), (removal_modules_rdf_date.NIL != lpe) ? lpe : date_utilities.$end_of_time$.getGlobalValue(), (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 17278L)
    public static SubLObject sometimify_interval(final SubLObject interval) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert removal_modules_rdf_date.NIL != cycl_grammar.cycl_expression_p(interval) : interval;
        if (removal_modules_rdf_date.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && removal_modules_rdf_date.NIL == cycl_utilities.expression_find_if((SubLObject)removal_modules_rdf_date.$sym65$CONSTANT_P, interval, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED)) {
            Errors.error((SubLObject)removal_modules_rdf_date.$str66$_S_is_not_a_valid_time_interval_, interval);
        }
        if (removal_modules_rdf_date.NIL != sometime_interval_p(interval) || removal_modules_rdf_date.$list67.equal(time_interval_utilities.time_interval_duration(interval, removal_modules_rdf_date.$const51$DaysDuration)) || removal_modules_rdf_date.NIL != formula_pattern_match.formula_matches_pattern(interval, (SubLObject)removal_modules_rdf_date.$list68)) {
            return interval;
        }
        if (removal_modules_rdf_date.NIL != formula_pattern_match.formula_matches_pattern(interval, (SubLObject)removal_modules_rdf_date.$list69)) {
            return sometimify_interval(el_utilities.replace_formula_arg((SubLObject)removal_modules_rdf_date.ONE_INTEGER, cycl_utilities.nat_arg1(cycl_utilities.nat_arg1(interval, (SubLObject)removal_modules_rdf_date.UNPROVIDED), (SubLObject)removal_modules_rdf_date.UNPROVIDED), interval));
        }
        return el_utilities.make_binary_formula(removal_modules_rdf_date.$const70$SomeTimeInIntervalFn, interval, Guids.guid_to_string(Guids.new_guid()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18070L)
    public static SubLObject sometime_interval_p(final SubLObject interval) {
        return el_utilities.el_formula_with_operator_p(interval, removal_modules_rdf_date.$const70$SomeTimeInIntervalFn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18188L)
    public static SubLObject possibly_indefinite_time_intervals_equalP(final SubLObject int1, final SubLObject int2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(earliest_possible_start_day(int1).equal(earliest_possible_start_day(int2)) && latest_possible_start_day(int1).equal(latest_possible_start_day(int2)) && earliest_possible_end_day(int1).equal(earliest_possible_end_day(int2)) && latest_possible_end_day(int1).equal(latest_possible_end_day(int2)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18589L)
    public static SubLObject rdf_time_interval_to_cycl_results_okayP(final SubLObject actual, final SubLObject expected) {
        return czer_utilities.equals_elP(anonymize_sometimes(actual), expected, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18589L)
    public static SubLObject indeterminate_time_intervals_equalP(final SubLObject actual, final SubLObject expected) {
        return czer_utilities.equals_elP(anonymize_sometimes(actual), anonymize_sometimes(expected), (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18589L)
    public static SubLObject anonymize_sometimes(final SubLObject expression) {
        return cycl_utilities.expression_transform(expression, (SubLObject)removal_modules_rdf_date.$sym88$SOME_TIME_INTERVAL_P, (SubLObject)removal_modules_rdf_date.$sym89$GET_SOMETIME_DUMMY, (SubLObject)removal_modules_rdf_date.UNPROVIDED, (SubLObject)removal_modules_rdf_date.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18589L)
    public static SubLObject get_sometime_dummy(final SubLObject obj) {
        return (SubLObject)ConsesLow.list((SubLObject)removal_modules_rdf_date.$kw90$SOMETIME, cycl_utilities.nat_arg1(obj, (SubLObject)removal_modules_rdf_date.UNPROVIDED));
    }
    
    public static SubLObject declare_removal_modules_rdf_date_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "removal_rdf_date_unify_arg1", "REMOVAL-RDF-DATE-UNIFY-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "removal_rdf_date_unify_arg2", "REMOVAL-RDF-DATE-UNIFY-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "removal_rdf_date_check_expand", "REMOVAL-RDF-DATE-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "construct_time_literal", "CONSTRUCT-TIME-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "removal_time_interval_spec_check_expand", "REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "removal_time_interval_spec_unify_arg1", "REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "removal_time_interval_spec_unify_arg2", "REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "cycl_time_interval_to_rdf", "CYCL-TIME-INTERVAL-TO-RDF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "output_time_interval_terminus_range", "OUTPUT-TIME-INTERVAL-TERMINUS-RANGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "output_time_interval_terminus", "OUTPUT-TIME-INTERVAL-TERMINUS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "output_duration_range_spec", "OUTPUT-DURATION-RANGE-SPEC", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "output_duration_spec", "OUTPUT-DURATION-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "earliest_possible_start_day", "EARLIEST-POSSIBLE-START-DAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "earliest_possible_end_day", "EARLIEST-POSSIBLE-END-DAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "latest_possible_start_day", "LATEST-POSSIBLE-START-DAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "latest_possible_end_day", "LATEST-POSSIBLE-END-DAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "cycl_date_to_rdf", "CYCL-DATE-TO-RDF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "rdf_time_interval_to_cycl", "RDF-TIME-INTERVAL-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "duration_tokens_p", "DURATION-TOKENS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "rdf_time_interval_tokens_to_cycl", "RDF-TIME-INTERVAL-TOKENS-TO-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "make_possibly_indefinite_time_interval", "MAKE-POSSIBLY-INDEFINITE-TIME-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "sometimify_interval", "SOMETIMIFY-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "sometime_interval_p", "SOMETIME-INTERVAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "possibly_indefinite_time_intervals_equalP", "POSSIBLY-INDEFINITE-TIME-INTERVALS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "rdf_time_interval_to_cycl_results_okayP", "RDF-TIME-INTERVAL-TO-CYCL-RESULTS-OKAY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "indeterminate_time_intervals_equalP", "INDETERMINATE-TIME-INTERVALS-EQUAL?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "anonymize_sometimes", "ANONYMIZE-SOMETIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rdf_date", "get_sometime_dummy", "GET-SOMETIME-DUMMY", 1, 0, false);
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    public static SubLObject init_removal_modules_rdf_date_file() {
        removal_modules_rdf_date.$rdf_date_debugP$ = SubLFiles.defparameter("*RDF-DATE-DEBUG?*", (SubLObject)removal_modules_rdf_date.NIL);
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    public static SubLObject setup_removal_modules_rdf_date_file() {
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf_date.$kw0$REMOVAL_RDF_DATE_UNIFY_ARG1, (SubLObject)removal_modules_rdf_date.$list1);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf_date.$kw2$REMOVAL_RDF_DATE_UNIFY_ARG2, (SubLObject)removal_modules_rdf_date.$list3);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf_date.$kw4$REMOVAL_RDF_DATE_CHECK, (SubLObject)removal_modules_rdf_date.$list5);
        preference_modules.inference_preference_module((SubLObject)removal_modules_rdf_date.$kw6$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, (SubLObject)removal_modules_rdf_date.$list7);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf_date.$sym9$REMOVAL_RDF_DATE_UNIFY_ARG1);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf_date.$sym10$REMOVAL_RDF_DATE_UNIFY_ARG2);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf_date.$sym11$REMOVAL_RDF_DATE_CHECK_EXPAND);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf_date.$kw27$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1, (SubLObject)removal_modules_rdf_date.$list28);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf_date.$kw29$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2, (SubLObject)removal_modules_rdf_date.$list30);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rdf_date.$kw31$REMOVAL_TIME_INTERVAL_SPEC_CHECK, (SubLObject)removal_modules_rdf_date.$list32);
        preference_modules.inference_preference_module((SubLObject)removal_modules_rdf_date.$kw33$TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, (SubLObject)removal_modules_rdf_date.$list34);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rdf_date.$const35$hasTimeIntervalSpecString);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf_date.$sym36$REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf_date.$sym40$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1);
        utilities_macros.note_funcall_helper_function((SubLObject)removal_modules_rdf_date.$sym41$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_rdf_date.$sym71$CONSTRUCT_TIME_LITERAL, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rdf_date.$kw72$TEST, removal_modules_rdf_date.$sym73$EQUALS_EL_, removal_modules_rdf_date.$kw74$OWNER, removal_modules_rdf_date.NIL, removal_modules_rdf_date.$kw75$CLASSES, removal_modules_rdf_date.$list76, removal_modules_rdf_date.$kw77$KB, removal_modules_rdf_date.$kw78$FULL, removal_modules_rdf_date.$kw79$WORKING_, removal_modules_rdf_date.T }), (SubLObject)removal_modules_rdf_date.$list80);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_rdf_date.$sym81$CYCL_DATE_FROM_RDF_DATE, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rdf_date.$kw72$TEST, removal_modules_rdf_date.NIL, removal_modules_rdf_date.$kw74$OWNER, removal_modules_rdf_date.NIL, removal_modules_rdf_date.$kw75$CLASSES, removal_modules_rdf_date.$list76, removal_modules_rdf_date.$kw77$KB, removal_modules_rdf_date.$kw78$FULL, removal_modules_rdf_date.$kw79$WORKING_, removal_modules_rdf_date.T }), (SubLObject)removal_modules_rdf_date.$list82);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_rdf_date.$sym83$CYCL_TIME_INTERVAL_TO_RDF, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rdf_date.$kw72$TEST, removal_modules_rdf_date.NIL, removal_modules_rdf_date.$kw74$OWNER, removal_modules_rdf_date.NIL, removal_modules_rdf_date.$kw75$CLASSES, removal_modules_rdf_date.$list76, removal_modules_rdf_date.$kw77$KB, removal_modules_rdf_date.$kw78$FULL, removal_modules_rdf_date.$kw79$WORKING_, removal_modules_rdf_date.T }), (SubLObject)removal_modules_rdf_date.$list84);
        generic_testing.define_test_case_table_int((SubLObject)removal_modules_rdf_date.$sym85$RDF_TIME_INTERVAL_TO_CYCL, (SubLObject)ConsesLow.list(new SubLObject[] { removal_modules_rdf_date.$kw72$TEST, removal_modules_rdf_date.$sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_, removal_modules_rdf_date.$kw74$OWNER, removal_modules_rdf_date.NIL, removal_modules_rdf_date.$kw75$CLASSES, removal_modules_rdf_date.$list76, removal_modules_rdf_date.$kw77$KB, removal_modules_rdf_date.$kw78$FULL, removal_modules_rdf_date.$kw79$WORKING_, removal_modules_rdf_date.T }), (SubLObject)removal_modules_rdf_date.$list87);
        return (SubLObject)removal_modules_rdf_date.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_rdf_date_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_rdf_date_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_rdf_date_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_rdf_date();
        removal_modules_rdf_date.$rdf_date_debugP$ = null;
        $kw0$REMOVAL_RDF_DATE_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-RDF-DATE-UNIFY-ARG1");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf_date.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG1"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Find arg1 bindings based on #$rdfDate values for arg2."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$rdfDate ?DATE (#$RDFTypedLiteralFn \"1984-12-13\" #$CalendarDay))") });
        $kw2$REMOVAL_RDF_DATE_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-RDF-DATE-UNIFY-ARG2");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")))), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf_date.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG2"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Find arg2 bindings based on #$rdfDate values for arg1."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$rdfDate (#$DayFn 13 (#$MonthFn #$December (#$YearFn 1984))) ?RDF-DATE)") });
        $kw4$REMOVAL_RDF_DATE_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-RDF-DATE-CHECK");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf_date.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-RDF-DATE-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Ensure equivalence between arg1 and arg2 of #$rdfDate sentences."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$rdfDate (#$DayFn 13 (#$MonthFn #$December (#$YearFn 1984))) (#$RDFTypedLiteralFn \"1984-12-13\" #$CalendarDay))") });
        $kw6$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = SubLObjectFactory.makeKeyword("RDF-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rdfDate")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $kw8$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $sym9$REMOVAL_RDF_DATE_UNIFY_ARG1 = SubLObjectFactory.makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG1");
        $sym10$REMOVAL_RDF_DATE_UNIFY_ARG2 = SubLObjectFactory.makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG2");
        $sym11$REMOVAL_RDF_DATE_CHECK_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-RDF-DATE-CHECK-EXPAND");
        $str12$_4__0d = SubLObjectFactory.makeString("~4,'0d");
        $str13$_4__0d__2__0d = SubLObjectFactory.makeString("~4,'0d-~2,'0d");
        $str14$__2__0d = SubLObjectFactory.makeString("-~2,'0d");
        $str15$T_2__0d__2__0d__2__0d = SubLObjectFactory.makeString("T~2,'0d:~2,'0d:~2,'0d");
        $str16$__3__0d = SubLObjectFactory.makeString(".~3,'0d");
        $const17$CalendarYear = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarYear"));
        $const18$RDFTypedLiteralFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTypedLiteralFn"));
        $list19 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#gYear"));
        $const20$CalendarMonth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMonth"));
        $list21 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#gMonthYear"));
        $const22$CalendarDay = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarDay"));
        $list23 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#Date"));
        $const24$CalendarSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarSecond"));
        $list25 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#DateTime"));
        $const26$CalendarMilliSecond = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CalendarMilliSecond"));
        $kw27$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1 = SubLObjectFactory.makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf_date.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Find arg1 bindings based on #$hasTimeIntervalSpecString values for arg2."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$hasTimeIntervalSpecString ?DATE \"[1999-01-12, 1999-06-30]\")") });
        $kw29$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2 = SubLObjectFactory.makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2");
        $list30 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf_date.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Find arg2 bindings based on #$hasTimeIntervalSpecString values for arg1."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$hasTimeIntervalSpecString (#$TimeIntervalInclusiveFn (#$DayFn 12 (#$MonthFn #$January (#$YearFn 1999))) (#$DayFn 30 (#$MonthFn #$June (#$YearFn 1999)))) ?TIME-INTERVAL-SPEC)") });
        $kw31$REMOVAL_TIME_INTERVAL_SPEC_CHECK = SubLObjectFactory.makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-CHECK");
        $list32 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rdf_date.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("Ensure equivalence between arg1 and arg2 of #$hasTimeIntervalSpecString sentences."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$hasTimeIntervalSpecString (#$TimeIntervalInclusiveFn (#$DayFn 12 (#$MonthFn #$January (#$YearFn 1999))) (#$DayFn 30 (#$MonthFn #$June (#$YearFn 1999)))) \"[1999-01-12, 1999-06-30]\")") });
        $kw33$TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = SubLObjectFactory.makeKeyword("TIME-INTERVAL-SPEC-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString")), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)SubLObjectFactory.makeKeyword("PREFERENCE-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("GROSSLY-DISPREFERRED"));
        $const35$hasTimeIntervalSpecString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasTimeIntervalSpecString"));
        $sym36$REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND = SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND");
        $kw37$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym38$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $kw39$FAIL = SubLObjectFactory.makeKeyword("FAIL");
        $sym40$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1 = SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1");
        $sym41$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2 = SubLObjectFactory.makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2");
        $sym42$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str43$Time_interval__S_extends_back_to_ = SubLObjectFactory.makeString("Time interval ~S extends back to the beginning of time.");
        $str44$Time_interval__S_extends_to_the_e = SubLObjectFactory.makeString("Time interval ~S extends to the end of time.");
        $str45$_ = SubLObjectFactory.makeString("[");
        $str46$_ = SubLObjectFactory.makeString(",");
        $str47$_ = SubLObjectFactory.makeString(" ");
        $str48$_ = SubLObjectFactory.makeString("]");
        $str49$Can_t_convert__S_to_RDF_ = SubLObjectFactory.makeString("Can't convert ~S to RDF.");
        $str50$__ = SubLObjectFactory.makeString(":[");
        $const51$DaysDuration = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration"));
        $str52$_AD = SubLObjectFactory.makeString("~AD");
        $sym53$WHITESPACE_STRING_ = SubLObjectFactory.makeSymbol("WHITESPACE-STRING?");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("["), (SubLObject)SubLObjectFactory.makeString(","), (SubLObject)SubLObjectFactory.makeString("]"));
        $str55$_ = SubLObjectFactory.makeString(":");
        $kw56$INITIAL = SubLObjectFactory.makeKeyword("INITIAL");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("ABORT"));
        $kw58$STARTED = SubLObjectFactory.makeKeyword("STARTED");
        $kw59$MIDDLE = SubLObjectFactory.makeKeyword("MIDDLE");
        $kw60$LOOKING_FOR_COMMA = SubLObjectFactory.makeKeyword("LOOKING-FOR-COMMA");
        $kw61$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $kw62$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw63$LOOKING_FOR_CLOSE_BRACKET = SubLObjectFactory.makeKeyword("LOOKING-FOR-CLOSE-BRACKET");
        $sym64$CYCL_EXPRESSION_P = SubLObjectFactory.makeSymbol("CYCL-EXPRESSION-P");
        $sym65$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $str66$_S_is_not_a_valid_time_interval_ = SubLObjectFactory.makeString("~S is not a valid time interval.");
        $list67 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DaysDuration")), (SubLObject)removal_modules_rdf_date.ONE_INTEGER);
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SOMETIME-INTERVAL-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SOMETIME-INTERVAL-P")));
        $list69 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("SOMETIME-INTERVAL-P")));
        $const70$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn"));
        $sym71$CONSTRUCT_TIME_LITERAL = SubLObjectFactory.makeSymbol("CONSTRUCT-TIME-LITERAL");
        $kw72$TEST = SubLObjectFactory.makeKeyword("TEST");
        $sym73$EQUALS_EL_ = SubLObjectFactory.makeSymbol("EQUALS-EL?");
        $kw74$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw75$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RDF-DATE-TESTS"));
        $kw77$KB = SubLObjectFactory.makeKeyword("KB");
        $kw78$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw79$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTypedLiteralFn")), (SubLObject)SubLObjectFactory.makeString("1999"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#gYear")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTypedLiteralFn")), (SubLObject)SubLObjectFactory.makeString("1999-01"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#gMonthYear")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTypedLiteralFn")), (SubLObject)SubLObjectFactory.makeString("1999-01-12"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#Date")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)removal_modules_rdf_date.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)removal_modules_rdf_date.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTypedLiteralFn")), (SubLObject)SubLObjectFactory.makeString("1999-01-12T13:36:00"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#DateTime")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)SubLObjectFactory.makeInteger(500), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)removal_modules_rdf_date.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)removal_modules_rdf_date.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTypedLiteralFn")), (SubLObject)SubLObjectFactory.makeString("1999-01-12T13:36:00.500"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("URIFn")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2001/XMLSchema#DateTime")))));
        $sym81$CYCL_DATE_FROM_RDF_DATE = SubLObjectFactory.makeSymbol("CYCL-DATE-FROM-RDF-DATE");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1999")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1999-01-12")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1999-01-12T13:36:00")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)removal_modules_rdf_date.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)removal_modules_rdf_date.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("1999-01-12T13:36:00.500")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn")), (SubLObject)SubLObjectFactory.makeInteger(500), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)removal_modules_rdf_date.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)removal_modules_rdf_date.THIRTEEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))))))));
        $sym83$CYCL_TIME_INTERVAL_TO_RDF = SubLObjectFactory.makeSymbol("CYCL-TIME-INTERVAL-TO-RDF");
        $list84 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))), (SubLObject)SubLObjectFactory.makeString("[[1999-01-12, 1999-01-12], [1999-06-30, 1999-06-30]]:[169D, 169D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))), (SubLObject)removal_modules_rdf_date.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))), (SubLObject)removal_modules_rdf_date.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)removal_modules_rdf_date.NIL), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.SIX_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("September")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1920)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval")), (SubLObject)SubLObjectFactory.makeString("d9126543-0a48-11e1-8eea-00219b4436b2")))), (SubLObject)SubLObjectFactory.makeString("[[1920-09-06, 1920-09-06], [1920-09-06,]]:[,]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)), (SubLObject)SubLObjectFactory.makeString("fcabb4ed-0a48-11e1-8f02-00219b4436b2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("May")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2005))), (SubLObject)SubLObjectFactory.makeString("fcabb4ee-0a48-11e1-8f02-00219b4436b2")))), (SubLObject)SubLObjectFactory.makeString("[[2000-01-01, 2000-12-31], [2005-05-01, 2005-05-31]]:[1582D, 1977D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000))))), (SubLObject)SubLObjectFactory.makeString("[[2000-01-01, 2000-01-01], [2000-01-31, 2000-01-31]]:[30D, 30D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1997)), (SubLObject)SubLObjectFactory.makeString("f918ca50-0a48-11e1-8f00-00219b4436b2"))), (SubLObject)SubLObjectFactory.makeString("[[1997-01-01, 1997-12-31], [1997-01-01, 1997-12-31]]:[, 364D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1943)), (SubLObject)SubLObjectFactory.makeString("4b161dc7-0a44-11e1-8f22-00219b4436b2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1944)), (SubLObject)SubLObjectFactory.makeString("4b161dc8-0a44-11e1-8f22-00219b4436b2")))), (SubLObject)SubLObjectFactory.makeString("[[1943-01-01, 1943-12-31], [1944-01-01, 1944-12-31]]:[1D, 730D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000))), (SubLObject)SubLObjectFactory.makeString("687111d4-0a44-11e1-8f34-00219b4436b2"))), (SubLObject)SubLObjectFactory.makeString("[[2000-12-01, 2000-12-31], [2000-12-01, 2000-12-31]]:[, 30D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2003)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.ELEVEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2004))))), (SubLObject)SubLObjectFactory.makeString("89391942-0a44-11e1-8f44-00219b4436b2")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2003)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.ELEVEN_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2004))))), (SubLObject)SubLObjectFactory.makeString("89391943-0a44-11e1-8f44-00219b4436b2")))), (SubLObject)SubLObjectFactory.makeString("[[2003-12-29, 2004-01-11], [2003-12-29, 2004-01-11]]:[, 13D]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))), (SubLObject)SubLObjectFactory.makeString("eabb9554-a5eb-4c64-990d-9af7302b399f")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)SubLObjectFactory.makeString("[[, 1999-01-01], [1999-12-31, 1999-12-31]]:[364D,]")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))), (SubLObject)SubLObjectFactory.makeString("eabb9554-a5eb-4c64-990d-9af7302b399f")))), (SubLObject)SubLObjectFactory.makeString("[[1999-01-01, 1999-01-01], [1999-12-31,]]:[364D,]")) });
        $sym85$RDF_TIME_INTERVAL_TO_CYCL = SubLObjectFactory.makeSymbol("RDF-TIME-INTERVAL-TO-CYCL");
        $sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_ = SubLObjectFactory.makeSymbol("RDF-TIME-INTERVAL-TO-CYCL-RESULTS-OKAY?");
        $list87 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[1999-01-12, 1999-06-30]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[1999-01-12,]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.TWELVE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[, 1999-06-30]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("June")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[, 1999-12-31]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[2000, 2005]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2000))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2005))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[1987-01-01, 1987-12-31],[,]]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1987))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1987)))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[,],[1987-01-01, 1987-12-31]]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1987)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1987))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[,]")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Always-TimeInterval")))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[1880-01-01, 1880-01-01], [1880-12-31, 1880-12-31]]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1880))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[1864-01-01,1864-01-01], [1864-01-01,1864-01-01]]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1864))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[1993-01-01, 1993-12-31],[2006-05-01, 2006-05-31]]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1993))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("May")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(2006)))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[, 1999-01-01], [1999-12-31, 1999-12-31]]:[364D,]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)removal_modules_rdf_date.ONE_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("January")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("[[1999-01-01, 1999-01-01], [1999-12-31,]]:[364D,]")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOMETIME"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn")), (SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("December")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn")), (SubLObject)SubLObjectFactory.makeInteger(1999)))))))) });
        $sym88$SOME_TIME_INTERVAL_P = SubLObjectFactory.makeSymbol("SOME-TIME-INTERVAL-P");
        $sym89$GET_SOMETIME_DUMMY = SubLObjectFactory.makeSymbol("GET-SOMETIME-DUMMY");
        $kw90$SOMETIME = SubLObjectFactory.makeKeyword("SOMETIME");
    }
}

/*

	Total time: 362 ms
	
*/