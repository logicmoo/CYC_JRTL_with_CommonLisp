package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.rdf.rdf_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_rdf_date extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "fe1b3a19d2bd14ff9e5e7bc9ccff1778373342e2d8257c0e94c5ecd017d01aec";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 9700L)
	private static SubLSymbol $rdf_date_debugP$;
	private static SubLSymbol $kw$REMOVAL_RDF_DATE_UNIFY_ARG1;
	private static SubLList $list1;
	private static SubLSymbol $kw$REMOVAL_RDF_DATE_UNIFY_ARG2;
	private static SubLList $list3;
	private static SubLSymbol $kw$REMOVAL_RDF_DATE_CHECK;
	private static SubLList $list5;
	private static SubLSymbol $kw$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG;
	private static SubLList $list7;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLSymbol $sym9$REMOVAL_RDF_DATE_UNIFY_ARG1;
	private static SubLSymbol $sym10$REMOVAL_RDF_DATE_UNIFY_ARG2;
	private static SubLSymbol $sym11$REMOVAL_RDF_DATE_CHECK_EXPAND;
	private static SubLString $str12$_4__0d;
	private static SubLString $str13$_4__0d__2__0d;
	private static SubLString $str14$__2__0d;
	private static SubLString $str15$T_2__0d__2__0d__2__0d;
	private static SubLString $str16$__3__0d;
	private static SubLObject $const17$CalendarYear;
	private static SubLObject $const18$RDFTypedLiteralFn;
	private static SubLList $list19;
	private static SubLObject $const20$CalendarMonth;
	private static SubLList $list21;
	private static SubLObject $const22$CalendarDay;
	private static SubLList $list23;
	private static SubLObject $const24$CalendarSecond;
	private static SubLList $list25;
	private static SubLObject $const26$CalendarMilliSecond;
	private static SubLSymbol $kw$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1;
	private static SubLList $list28;
	private static SubLSymbol $kw$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2;
	private static SubLList $list30;
	private static SubLSymbol $kw$REMOVAL_TIME_INTERVAL_SPEC_CHECK;
	private static SubLList $list32;
	private static SubLSymbol $kw$TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG;
	private static SubLList $list34;
	private static SubLObject $const35$hasTimeIntervalSpecString;
	private static SubLSymbol $sym36$REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND;
	private static SubLSymbol $kw$IGNORE_ERRORS_TARGET;
	private static SubLSymbol $sym38$IGNORE_ERRORS_HANDLER;
	private static SubLSymbol $kw$FAIL;
	private static SubLSymbol $sym40$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1;
	private static SubLSymbol $sym41$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2;
	private static SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
	private static SubLString $str43$Time_interval__S_extends_back_to_;
	private static SubLString $str44$Time_interval__S_extends_to_the_e;
	private static SubLString $str45$_;
	private static SubLString $str46$_;
	private static SubLString $str47$_;
	private static SubLString $str48$_;
	private static SubLString $str49$Can_t_convert__S_to_RDF_;
	private static SubLString $str50$__;
	private static SubLObject $const51$DaysDuration;
	private static SubLString $str52$_AD;
	private static SubLSymbol $sym53$WHITESPACE_STRING_;
	private static SubLList $list54;
	private static SubLString $str55$_;
	private static SubLSymbol $kw$INITIAL;
	private static SubLList $list57;
	private static SubLSymbol $kw$STARTED;
	private static SubLSymbol $kw$MIDDLE;
	private static SubLSymbol $kw$LOOKING_FOR_COMMA;
	private static SubLSymbol $kw$ABORT;
	private static SubLSymbol $kw$DONE;
	private static SubLSymbol $kw$LOOKING_FOR_CLOSE_BRACKET;
	private static SubLSymbol $sym64$CYCL_EXPRESSION_P;
	private static SubLSymbol $sym65$CONSTANT_P;
	private static SubLString $str66$_S_is_not_a_valid_time_interval_;
	private static SubLList $list67;
	private static SubLList $list68;
	private static SubLList $list69;
	private static SubLObject $const70$SomeTimeInIntervalFn;
	private static SubLSymbol $sym71$CONSTRUCT_TIME_LITERAL;
	private static SubLSymbol $kw$TEST;
	private static SubLSymbol $sym73$EQUALS_EL_;
	private static SubLSymbol $kw$OWNER;
	private static SubLSymbol $kw$CLASSES;
	private static SubLList $list76;
	private static SubLSymbol $kw$KB;
	private static SubLSymbol $kw$FULL;
	private static SubLSymbol $kw$WORKING_;
	private static SubLList $list80;
	private static SubLSymbol $sym81$CYCL_DATE_FROM_RDF_DATE;
	private static SubLList $list82;
	private static SubLSymbol $sym83$CYCL_TIME_INTERVAL_TO_RDF;
	private static SubLList $list84;
	private static SubLSymbol $sym85$RDF_TIME_INTERVAL_TO_CYCL;
	private static SubLSymbol $sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_;
	private static SubLList $list87;
	private static SubLSymbol $sym88$SOME_TIME_INTERVAL_P;
	private static SubLSymbol $sym89$GET_SOMETIME_DUMMY;
	private static SubLSymbol $kw$SOMETIME;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 2600L)
	public static SubLObject removal_rdf_date_unify_arg1(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rdf_date = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject date_string = cycl_utilities.formula_arg1(rdf_date, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject cycl_date = rdf_utilities.cycl_date_from_rdf_date(date_string);
		SubLObject new_asent = cycl_utilities.expression_subst(cycl_date, var, asent, UNPROVIDED, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(cycl_date, var, T, T);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings,
				justification);
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 3100L)
	public static SubLObject removal_rdf_date_unify_arg2(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject date = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject literal_nat = construct_time_literal(date);
		SubLObject new_asent = cycl_utilities.expression_subst(literal_nat, var, asent, UNPROVIDED, UNPROVIDED);
		thread.resetMultipleValues();
		SubLObject v_bindings = unification_utilities.term_unify(literal_nat, var, T, T);
		SubLObject justification = thread.secondMultipleValue();
		thread.resetMultipleValues();
		backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings,
				justification);
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 3600L)
	public static SubLObject removal_rdf_date_check_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject date = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject rdf_date = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if ((NIL != date_utilities.date_p(date)) && cycl_utilities.formula_arg1(rdf_date, UNPROVIDED).isString()) {
			SubLObject rdf_date_string = cycl_utilities.formula_arg1(rdf_date, UNPROVIDED);
			SubLObject computed_date_nat = construct_time_literal(date);
			SubLObject computed_date_string = cycl_utilities.formula_arg1(computed_date_nat, UNPROVIDED);
			if (computed_date_string.equal(rdf_date_string)) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, asent, UNPROVIDED, UNPROVIDED),
						UNPROVIDED, UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 4100L)
	public static SubLObject construct_time_literal(SubLObject cyc_date) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject date_type = date_utilities.explode_date(cyc_date);
		SubLObject year = thread.secondMultipleValue();
		SubLObject month = thread.thirdMultipleValue();
		SubLObject day = thread.fourthMultipleValue();
		SubLObject hour = thread.fifthMultipleValue();
		SubLObject min = thread.sixthMultipleValue();
		SubLObject sec = thread.seventhMultipleValue();
		SubLObject milli = thread.eighthMultipleValue();
		thread.resetMultipleValues();
		SubLObject year_string = PrintLow.format(NIL, $str12$_4__0d, year);
		SubLObject month_string = PrintLow.format(NIL, $str13$_4__0d__2__0d, year, month);
		SubLObject day_string = PrintLow.format(NIL, $str14$__2__0d, day);
		SubLObject date_string = Sequences.cconcatenate(month_string, day_string);
		SubLObject time_string = PrintLow.format(NIL, $str15$T_2__0d__2__0d__2__0d,
				new SubLObject[] { hour, min, sec });
		SubLObject milli_string = PrintLow.format(NIL, $str16$__3__0d, milli);
		SubLObject literal_nat = NIL;
		if (NIL != isa.isaP(cyc_date, $const17$CalendarYear, UNPROVIDED, UNPROVIDED)) {
			literal_nat = list($const18$RDFTypedLiteralFn, year_string,
					czer_main.canonicalize_term($list19, UNPROVIDED));
		} else if (NIL != isa.isaP(cyc_date, $const20$CalendarMonth, UNPROVIDED, UNPROVIDED)) {
			literal_nat = list($const18$RDFTypedLiteralFn, month_string,
					czer_main.canonicalize_term($list21, UNPROVIDED));
		} else if (NIL != isa.isaP(cyc_date, $const22$CalendarDay, UNPROVIDED, UNPROVIDED)) {
			literal_nat = list($const18$RDFTypedLiteralFn, date_string,
					czer_main.canonicalize_term($list23, UNPROVIDED));
		} else if (NIL != isa.isaP(cyc_date, $const24$CalendarSecond, UNPROVIDED, UNPROVIDED)) {
			SubLObject full_date_string = Sequences.cconcatenate(date_string, time_string);
			literal_nat = list($const18$RDFTypedLiteralFn, full_date_string,
					czer_main.canonicalize_term($list25, UNPROVIDED));
		} else if (NIL != isa.isaP(cyc_date, $const26$CalendarMilliSecond, UNPROVIDED, UNPROVIDED)) {
			SubLObject full_date_string = Sequences.cconcatenate(date_string,
					new SubLObject[] { time_string, milli_string });
			literal_nat = list($const18$RDFTypedLiteralFn, full_date_string,
					czer_main.canonicalize_term($list25, UNPROVIDED));
		}
		return literal_nat;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 7900L)
	public static SubLObject removal_time_interval_spec_check_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject spec_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		if (spec_string.isString()) {
			SubLObject cycl = rdf_time_interval_to_cycl(spec_string);
			if (earliest_possible_start_day(arg1).equal(earliest_possible_start_day(cycl))
					&& latest_possible_start_day(arg1).equal(latest_possible_start_day(cycl))
					&& earliest_possible_end_day(arg1).equal(earliest_possible_end_day(cycl))
					&& latest_possible_end_day(arg1).equal(latest_possible_end_day(cycl))) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, asent, UNPROVIDED, UNPROVIDED),
						UNPROVIDED, UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 8600L)
	public static SubLObject removal_time_interval_spec_unify_arg1(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ignore_errors_tag = NIL;
		try {
			thread.throwStack.push($kw$IGNORE_ERRORS_TARGET);
			SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind(Symbols.symbol_function($sym38$IGNORE_ERRORS_HANDLER), thread);
				try {
					SubLObject var = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
					SubLObject interval_string = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
					SubLObject cycl_time_interval = rdf_time_interval_to_cycl(interval_string);
					if (!cycl_time_interval.eql($kw$FAIL)) {
						SubLObject new_asent = cycl_utilities.expression_subst(cycl_time_interval, var, asent,
								UNPROVIDED, UNPROVIDED);
						thread.resetMultipleValues();
						SubLObject v_bindings = unification_utilities.term_unify(cycl_time_interval, var, T, T);
						SubLObject justification = thread.secondMultipleValue();
						thread.resetMultipleValues();
						backward.removal_add_node(
								arguments.make_hl_support($kw$OPAQUE, new_asent, UNPROVIDED, UNPROVIDED), v_bindings,
								justification);
					}
				} catch (Throwable catch_var) {
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var) {
			ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw$IGNORE_ERRORS_TARGET);
		} finally {
			thread.throwStack.pop();
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 9200L)
	public static SubLObject removal_time_interval_spec_unify_arg2(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject time_interval = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject spec_string = cycl_time_interval_to_rdf(time_interval, UNPROVIDED);
		if (NIL != spec_string) {
			SubLObject new_asent = cycl_utilities.expression_subst(spec_string, var, asent, UNPROVIDED, UNPROVIDED);
			thread.resetMultipleValues();
			SubLObject v_bindings = unification_utilities.term_unify(spec_string, var, T, T);
			SubLObject justification = thread.secondMultipleValue();
			thread.resetMultipleValues();
			backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE, new_asent, UNPROVIDED, UNPROVIDED),
					v_bindings, justification);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 9800L)
	public static SubLObject cycl_time_interval_to_rdf(SubLObject time_interval, SubLObject nesting_depth) {
		if (nesting_depth == UNPROVIDED) {
			nesting_depth = ZERO_INTEGER;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL != date_utilities.date_p(time_interval)) && nesting_depth.numGE(TWO_INTEGER))
			return Values.values(cycl_date_to_rdf(time_interval), NIL);
		SubLObject error_message = NIL;
		SubLObject string = NIL;
		if (NIL == $rdf_date_debugP$.getDynamicValue(thread)) {
			try {
				thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
				SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind($sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						SubLObject eps = earliest_possible_start_day(time_interval);
						SubLObject lps = latest_possible_start_day(time_interval);
						SubLObject epe = earliest_possible_end_day(time_interval);
						SubLObject lpe = latest_possible_end_day(time_interval);
						if (ZERO_INTEGER.eql(nesting_depth)) {
							if (((NIL == lps) || (NIL == eps)) && (NIL != date_utilities.beginning_of_timeP(
									time_interval_utilities.cycl_interval_initial_second(time_interval)))) {
								Errors.error($str43$Time_interval__S_extends_back_to_, time_interval);
							}
							if (((NIL == epe) || (NIL == lpe)) && (NIL != date_utilities
									.end_of_timeP(time_interval_utilities.cycl_interval_final_second(time_interval)))) {
								Errors.error($str44$Time_interval__S_extends_to_the_e, time_interval);
							}
						}
						SubLObject stream = NIL;
						try {
							stream = streams_high.make_private_string_output_stream();
							print_high.princ($str45$_, stream);
							output_time_interval_terminus_range(eps, lps, stream, nesting_depth);
							print_high.princ($str46$_, stream);
							if ((NIL != epe) || (NIL != lpe)) {
								print_high.princ($str47$_, stream);
								output_time_interval_terminus_range(epe, lpe, stream, nesting_depth);
							}
							print_high.princ($str48$_, stream);
							if (ZERO_INTEGER.eql(nesting_depth)) {
								output_duration_range_spec(eps, lps, epe, lpe, stream);
							}
							string = streams_high.get_output_stream_string(stream);
						} finally {
							SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								streams_high.close(stream, UNPROVIDED);
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
							}
						}
					} catch (Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var,
						subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			} finally {
				thread.throwStack.pop();
			}
		} else {
			SubLObject eps2 = earliest_possible_start_day(time_interval);
			SubLObject lps2 = latest_possible_start_day(time_interval);
			SubLObject epe2 = earliest_possible_end_day(time_interval);
			SubLObject lpe2 = latest_possible_end_day(time_interval);
			if (ZERO_INTEGER.eql(nesting_depth)) {
				if (((NIL == lps2) || (NIL == eps2)) && (NIL != date_utilities
						.beginning_of_timeP(time_interval_utilities.cycl_interval_initial_second(time_interval)))) {
					Errors.error($str43$Time_interval__S_extends_back_to_, time_interval);
				}
				if (((NIL == epe2) || (NIL == lpe2)) && (NIL != date_utilities
						.end_of_timeP(time_interval_utilities.cycl_interval_final_second(time_interval)))) {
					Errors.error($str44$Time_interval__S_extends_to_the_e, time_interval);
				}
			}
			SubLObject stream2 = NIL;
			try {
				stream2 = streams_high.make_private_string_output_stream();
				print_high.princ($str45$_, stream2);
				output_time_interval_terminus_range(eps2, lps2, stream2, nesting_depth);
				print_high.princ($str46$_, stream2);
				if ((NIL != epe2) || (NIL != lpe2)) {
					print_high.princ($str47$_, stream2);
					output_time_interval_terminus_range(epe2, lpe2, stream2, nesting_depth);
				}
				print_high.princ($str48$_, stream2);
				if (ZERO_INTEGER.eql(nesting_depth)) {
					output_duration_range_spec(eps2, lps2, epe2, lpe2, stream2);
				}
				string = streams_high.get_output_stream_string(stream2);
			} finally {
				SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values2 = Values.getValuesAsVector();
					streams_high.close(stream2, UNPROVIDED);
					Values.restoreValuesFromVector(_values2);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
				}
			}
		}
		return Values.values((NIL != error_message) ? NIL : string, (NIL != error_message) ? error_message : NIL);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 11300L)
	public static SubLObject output_time_interval_terminus_range(SubLObject earliest_day, SubLObject latest_day,
			SubLObject stream, SubLObject nesting_depth) {
		if ((NIL != earliest_day) || !earliest_day.equal(latest_day)) {
			if (earliest_day.equal(latest_day)) {
				output_time_interval_terminus(earliest_day, stream, nesting_depth);
			} else {
				SubLObject start = (NIL != earliest_day) ? earliest_day
						: date_utilities.$beginning_of_time$.getGlobalValue();
				SubLObject end = (NIL != latest_day) ? latest_day : date_utilities.$end_of_time$.getGlobalValue();
				SubLObject interval = time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(
						start, start, end, end, UNPROVIDED, UNPROVIDED);
				print_high.princ(cycl_time_interval_to_rdf(interval, number_utilities.f_1X(nesting_depth)), stream);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 12000L)
	public static SubLObject output_time_interval_terminus(SubLObject terminus, SubLObject stream,
			SubLObject nesting_depth) {
		if (NIL != date_utilities.date_p(terminus)) {
			print_high.princ(cycl_time_interval_to_rdf(date_utilities.day_of_date(terminus),
					number_utilities.f_1X(nesting_depth)), stream);
		} else if (NIL != sometime_interval_p(terminus)) {
			print_high.princ(cycl_time_interval_to_rdf(cycl_utilities.nat_arg1(terminus, UNPROVIDED),
					number_utilities.f_1X(nesting_depth)), stream);
		} else {
			Errors.error($str49$Can_t_convert__S_to_RDF_, terminus);
		}
		return terminus;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 12400L)
	public static SubLObject output_duration_range_spec(SubLObject earliest_start, SubLObject latest_start,
			SubLObject earliest_end, SubLObject latest_end, SubLObject stream) {
		print_high.princ($str50$__, stream);
		if (NIL == earliest_end) {
			earliest_end = earliest_start;
		}
		if (NIL == latest_start) {
			latest_start = latest_end;
		}
		if ((NIL != earliest_end) && (NIL != latest_start)
				&& (NIL == date_utilities.dateLE(earliest_end, latest_start))) {
			output_duration_spec(date_utilities.time_elapsed(earliest_end, latest_start, $const51$DaysDuration),
					stream);
		}
		print_high.princ($str46$_, stream);
		if ((NIL != earliest_start) && (NIL != latest_end)) {
			print_high.princ($str47$_, stream);
			output_duration_spec(date_utilities.time_elapsed(latest_end, earliest_start, $const51$DaysDuration),
					stream);
		}
		print_high.princ($str48$_, stream);
		return stream;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13100L)
	public static SubLObject output_duration_spec(SubLObject duration, SubLObject stream) {
		PrintLow.format(stream, $str52$_AD,
				Numbers.abs(Numbers.integerDivide(date_utilities.convert_time_quant_to_seconds(duration),
						numeric_date_utilities.$seconds_in_a_day$.getGlobalValue())));
		return duration;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13200L)
	public static SubLObject earliest_possible_start_day(SubLObject time_interval) {
		SubLObject initial_second = time_interval_utilities
				.cycl_interval_initial_second_possibly_indeterminate_early(time_interval);
		return (NIL != date_utilities.date_p(initial_second)) ? date_utilities.day_of_date(initial_second) : NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13500L)
	public static SubLObject earliest_possible_end_day(SubLObject time_interval) {
		SubLObject final_second = time_interval_utilities
				.cycl_interval_final_second_possibly_indeterminate_early(time_interval);
		return (NIL != date_utilities.date_p(final_second)) ? date_utilities.day_of_date(final_second) : NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 13700L)
	public static SubLObject latest_possible_start_day(SubLObject time_interval) {
		SubLObject initial_second = time_interval_utilities
				.cycl_interval_initial_second_possibly_indeterminate_late(time_interval);
		return (NIL != date_utilities.date_p(initial_second)) ? date_utilities.day_of_date(initial_second) : NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14000L)
	public static SubLObject latest_possible_end_day(SubLObject time_interval) {
		SubLObject final_second = time_interval_utilities
				.cycl_interval_final_second_possibly_indeterminate_late(time_interval);
		return (NIL != date_utilities.date_p(final_second)) ? date_utilities.day_of_date(final_second) : NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14200L)
	public static SubLObject cycl_date_to_rdf(SubLObject cycl_date) {
		return cycl_utilities.nat_arg1(construct_time_literal(cycl_date), UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14300L)
	public static SubLObject rdf_time_interval_to_cycl(SubLObject string) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject result = rdf_time_interval_tokens_to_cycl(Sequences.remove_if($sym53$WHITESPACE_STRING_,
				string_utilities.string_tokenize(string, $list54, NIL, T, T, UNPROVIDED, UNPROVIDED), UNPROVIDED,
				UNPROVIDED, UNPROVIDED, UNPROVIDED));
		SubLObject remaining_tokens = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ($kw$FAIL.eql(result) || ((NIL != remaining_tokens) && (NIL == duration_tokens_p(remaining_tokens))))
			return $kw$FAIL;
		return time_interval_utilities.canonicalize_time_interval(result);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 14700L)
	public static SubLObject duration_tokens_p(SubLObject tokens) {
		return makeBoolean((NIL != list_utilities.lengthGE(tokens, FOUR_INTEGER, UNPROVIDED))
				&& (NIL != list_utilities.lengthLE(tokens, SIX_INTEGER, UNPROVIDED)) && $str55$_.equal(tokens.first())
				&& $str45$_.equal(conses_high.second(tokens))
				&& (NIL != conses_high.member($str46$_, tokens, Symbols.symbol_function(EQUAL), UNPROVIDED))
				&& $str48$_.equal(list_utilities.last_one(tokens)));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 15000L)
	public static SubLObject rdf_time_interval_tokens_to_cycl(SubLObject tokens) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject state = $kw$INITIAL;
		SubLObject remaining_tokens = tokens;
		SubLObject start = NIL;
		SubLObject end = NIL;
		while ((NIL != remaining_tokens) && (NIL == conses_high.member(state, $list57, UNPROVIDED, UNPROVIDED))) {
			SubLObject token = remaining_tokens.first();
			remaining_tokens = remaining_tokens.rest();
			SubLObject pcase_var = state;
			if (pcase_var.eql($kw$INITIAL)) {
				if (!token.equal($str45$_)) {
					SubLObject result = rdf_utilities.cycl_date_from_rdf_date(token);
					return Values.values((NIL != result) ? result : $kw$FAIL, remaining_tokens);
				}
				state = $kw$STARTED;
			} else if (pcase_var.eql($kw$STARTED)) {
				if (token.equal($str46$_)) {
					state = $kw$MIDDLE;
				} else {
					thread.resetMultipleValues();
					SubLObject start_$2 = rdf_time_interval_tokens_to_cycl(cons(token, remaining_tokens));
					SubLObject remaining_tokens_$3 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					start = start_$2;
					remaining_tokens = remaining_tokens_$3;
					state = $kw$LOOKING_FOR_COMMA;
					if ($kw$FAIL.eql(start)) {
						start = NIL;
						state = $kw$ABORT;
					} else {
						start = sometimify_interval(start);
					}
				}
			} else if (pcase_var.eql($kw$LOOKING_FOR_COMMA)) {
				if (token.equal($str46$_)) {
					state = $kw$MIDDLE;
				} else {
					if (token.equal($str48$_))
						return Values.values(start, remaining_tokens);
					state = $kw$ABORT;
				}
			} else if (pcase_var.eql($kw$MIDDLE)) {
				if (token.equal($str48$_)) {
					state = $kw$DONE;
				} else {
					thread.resetMultipleValues();
					SubLObject end_$4 = rdf_time_interval_tokens_to_cycl(cons(token, remaining_tokens));
					SubLObject remaining_tokens_$4 = thread.secondMultipleValue();
					thread.resetMultipleValues();
					end = end_$4;
					remaining_tokens = remaining_tokens_$4;
					state = $kw$LOOKING_FOR_CLOSE_BRACKET;
					if ($kw$FAIL.eql(end)) {
						end = NIL;
						state = $kw$ABORT;
					} else {
						end = sometimify_interval(end);
					}
				}
			} else if (pcase_var.eql($kw$LOOKING_FOR_CLOSE_BRACKET)) {
				state = token.equal($str48$_) ? $kw$DONE : $kw$ABORT;
			} else {
				if (pcase_var.eql($kw$ABORT))
					return Values.values($kw$FAIL, remaining_tokens);
				continue;
			}
		}
		if (state != $kw$DONE)
			return Values.values($kw$FAIL, remaining_tokens);
		return Values.values(make_possibly_indefinite_time_interval(start, end), remaining_tokens);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 16800L)
	public static SubLObject make_possibly_indefinite_time_interval(SubLObject start, SubLObject end) {
		SubLObject eps = earliest_possible_start_day(start);
		SubLObject lps = latest_possible_end_day(start);
		SubLObject epe = earliest_possible_start_day(end);
		SubLObject lpe = latest_possible_end_day(end);
		return time_interval_utilities.canonicalize_possibly_indeterminate_time_interval_fn(
				(NIL != eps) ? eps : date_utilities.$beginning_of_time$.getGlobalValue(),
				(NIL != lps) ? lps : date_utilities.$end_of_time$.getGlobalValue(),
				(NIL != epe) ? epe : date_utilities.$beginning_of_time$.getGlobalValue(),
				(NIL != lpe) ? lpe : date_utilities.$end_of_time$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 17200L)
	public static SubLObject sometimify_interval(SubLObject interval) {
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_grammar.cycl_expression_p(interval) : interval;
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
				&& (NIL == cycl_utilities.expression_find_if($sym65$CONSTANT_P, interval, UNPROVIDED, UNPROVIDED))) {
			Errors.error($str66$_S_is_not_a_valid_time_interval_, interval);
		}
		if ((NIL != sometime_interval_p(interval))
				|| $list67.equal(time_interval_utilities.time_interval_duration(interval, $const51$DaysDuration))
				|| (NIL != formula_pattern_match.formula_matches_pattern(interval, $list68)))
			return interval;
		if (NIL != formula_pattern_match.formula_matches_pattern(interval, $list69))
			return sometimify_interval(el_utilities.replace_formula_arg(ONE_INTEGER,
					cycl_utilities.nat_arg1(cycl_utilities.nat_arg1(interval, UNPROVIDED), UNPROVIDED), interval));
		return el_utilities.make_binary_formula($const70$SomeTimeInIntervalFn, interval,
				Guids.guid_to_string(Guids.new_guid()));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18000L)
	public static SubLObject sometime_interval_p(SubLObject interval) {
		return el_utilities.el_formula_with_operator_p(interval, $const70$SomeTimeInIntervalFn);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18100L)
	public static SubLObject possibly_indefinite_time_intervals_equalP(SubLObject int1, SubLObject int2) {
		return makeBoolean(earliest_possible_start_day(int1).equal(earliest_possible_start_day(int2))
				&& latest_possible_start_day(int1).equal(latest_possible_start_day(int2))
				&& earliest_possible_end_day(int1).equal(earliest_possible_end_day(int2))
				&& latest_possible_end_day(int1).equal(latest_possible_end_day(int2)));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18500L)
	public static SubLObject rdf_time_interval_to_cycl_results_okayP(SubLObject actual, SubLObject expected) {
		return czer_utilities.equals_elP(anonymize_sometimes(actual), expected, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18500L)
	public static SubLObject indeterminate_time_intervals_equalP(SubLObject actual, SubLObject expected) {
		return czer_utilities.equals_elP(anonymize_sometimes(actual), anonymize_sometimes(expected), UNPROVIDED,
				UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18500L)
	public static SubLObject anonymize_sometimes(SubLObject expression) {
		return cycl_utilities.expression_transform(expression, $sym88$SOME_TIME_INTERVAL_P, $sym89$GET_SOMETIME_DUMMY,
				UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rdf-date.lisp", position = 18500L)
	public static SubLObject get_sometime_dummy(SubLObject obj) {
		return list($kw$SOMETIME, cycl_utilities.nat_arg1(obj, UNPROVIDED));
	}

	public static SubLObject declare_removal_modules_rdf_date_file() {
		declareFunction("removal_rdf_date_unify_arg1", "REMOVAL-RDF-DATE-UNIFY-ARG1", 1, 1, false);
		declareFunction("removal_rdf_date_unify_arg2", "REMOVAL-RDF-DATE-UNIFY-ARG2", 1, 1, false);
		declareFunction("removal_rdf_date_check_expand", "REMOVAL-RDF-DATE-CHECK-EXPAND", 1, 1, false);
		declareFunction("construct_time_literal", "CONSTRUCT-TIME-LITERAL", 1, 0, false);
		declareFunction("removal_time_interval_spec_check_expand", "REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND", 1,
				1, false);
		declareFunction("removal_time_interval_spec_unify_arg1", "REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1", 1, 1,
				false);
		declareFunction("removal_time_interval_spec_unify_arg2", "REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2", 1, 1,
				false);
		declareFunction("cycl_time_interval_to_rdf", "CYCL-TIME-INTERVAL-TO-RDF", 1, 1, false);
		declareFunction("output_time_interval_terminus_range", "OUTPUT-TIME-INTERVAL-TERMINUS-RANGE", 4, 0,
				false);
		declareFunction("output_time_interval_terminus", "OUTPUT-TIME-INTERVAL-TERMINUS", 3, 0, false);
		declareFunction("output_duration_range_spec", "OUTPUT-DURATION-RANGE-SPEC", 5, 0, false);
		declareFunction("output_duration_spec", "OUTPUT-DURATION-SPEC", 2, 0, false);
		declareFunction("earliest_possible_start_day", "EARLIEST-POSSIBLE-START-DAY", 1, 0, false);
		declareFunction("earliest_possible_end_day", "EARLIEST-POSSIBLE-END-DAY", 1, 0, false);
		declareFunction("latest_possible_start_day", "LATEST-POSSIBLE-START-DAY", 1, 0, false);
		declareFunction("latest_possible_end_day", "LATEST-POSSIBLE-END-DAY", 1, 0, false);
		declareFunction("cycl_date_to_rdf", "CYCL-DATE-TO-RDF", 1, 0, false);
		declareFunction("rdf_time_interval_to_cycl", "RDF-TIME-INTERVAL-TO-CYCL", 1, 0, false);
		declareFunction("duration_tokens_p", "DURATION-TOKENS-P", 1, 0, false);
		declareFunction("rdf_time_interval_tokens_to_cycl", "RDF-TIME-INTERVAL-TOKENS-TO-CYCL", 1, 0, false);
		declareFunction("make_possibly_indefinite_time_interval", "MAKE-POSSIBLY-INDEFINITE-TIME-INTERVAL", 2,
				0, false);
		declareFunction("sometimify_interval", "SOMETIMIFY-INTERVAL", 1, 0, false);
		declareFunction("sometime_interval_p", "SOMETIME-INTERVAL-P", 1, 0, false);
		declareFunction("possibly_indefinite_time_intervals_equalP",
				"POSSIBLY-INDEFINITE-TIME-INTERVALS-EQUAL?", 2, 0, false);
		declareFunction("rdf_time_interval_to_cycl_results_okayP", "RDF-TIME-INTERVAL-TO-CYCL-RESULTS-OKAY?", 2,
				0, false);
		declareFunction("indeterminate_time_intervals_equalP", "INDETERMINATE-TIME-INTERVALS-EQUAL?", 2, 0,
				false);
		declareFunction("anonymize_sometimes", "ANONYMIZE-SOMETIMES", 1, 0, false);
		declareFunction("get_sometime_dummy", "GET-SOMETIME-DUMMY", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_rdf_date_file() {
		$rdf_date_debugP$ = defparameter("*RDF-DATE-DEBUG?*", NIL);
		return NIL;
	}

	public static SubLObject setup_removal_modules_rdf_date_file() {
		inference_modules.inference_removal_module($kw$REMOVAL_RDF_DATE_UNIFY_ARG1, $list1);
		inference_modules.inference_removal_module($kw$REMOVAL_RDF_DATE_UNIFY_ARG2, $list3);
		inference_modules.inference_removal_module($kw$REMOVAL_RDF_DATE_CHECK, $list5);
		preference_modules.inference_preference_module($kw$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list7);
		utilities_macros.note_funcall_helper_function($sym9$REMOVAL_RDF_DATE_UNIFY_ARG1);
		utilities_macros.note_funcall_helper_function($sym10$REMOVAL_RDF_DATE_UNIFY_ARG2);
		utilities_macros.note_funcall_helper_function($sym11$REMOVAL_RDF_DATE_CHECK_EXPAND);
		inference_modules.inference_removal_module($kw$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1, $list28);
		inference_modules.inference_removal_module($kw$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2, $list30);
		inference_modules.inference_removal_module($kw$REMOVAL_TIME_INTERVAL_SPEC_CHECK, $list32);
		preference_modules.inference_preference_module(
				$kw$TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list34);
		inference_modules.register_solely_specific_removal_module_predicate($const35$hasTimeIntervalSpecString);
		utilities_macros.note_funcall_helper_function($sym36$REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND);
		utilities_macros.note_funcall_helper_function($sym40$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1);
		utilities_macros.note_funcall_helper_function($sym41$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2);
		generic_testing.define_test_case_table_int($sym71$CONSTRUCT_TIME_LITERAL, list(new SubLObject[] { $kw$TEST,
				$sym73$EQUALS_EL_, $kw$OWNER, NIL, $kw$CLASSES, $list76, $kw$KB, $kw$FULL, $kw$WORKING_, T }), $list80);
		generic_testing.define_test_case_table_int($sym81$CYCL_DATE_FROM_RDF_DATE, list(new SubLObject[] { $kw$TEST,
				NIL, $kw$OWNER, NIL, $kw$CLASSES, $list76, $kw$KB, $kw$FULL, $kw$WORKING_, T }), $list82);
		generic_testing.define_test_case_table_int($sym83$CYCL_TIME_INTERVAL_TO_RDF, list(new SubLObject[] { $kw$TEST,
				NIL, $kw$OWNER, NIL, $kw$CLASSES, $list76, $kw$KB, $kw$FULL, $kw$WORKING_, T }), $list84);
		generic_testing.define_test_case_table_int($sym85$RDF_TIME_INTERVAL_TO_CYCL,
				list(new SubLObject[] { $kw$TEST, $sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_, $kw$OWNER, NIL,
						$kw$CLASSES, $list76, $kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list87);
		return NIL;
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
		me = new removal_modules_rdf_date();
		$rdf_date_debugP$ = null;
		$kw$REMOVAL_RDF_DATE_UNIFY_ARG1 = makeKeyword("REMOVAL-RDF-DATE-UNIFY-ARG1");
		$list1 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("rdfDate")), makeKeyword("NOT-FULLY-BOUND"),
						makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG1"), makeKeyword("DOCUMENTATION"),
				makeString("Find arg1 bindings based on #$rdfDate values for arg2."), makeKeyword("EXAMPLE"),
				makeString("(#$rdfDate ?DATE (#$RDFTypedLiteralFn \"1984-12-13\" #$CalendarDay))") });
		$kw$REMOVAL_RDF_DATE_UNIFY_ARG2 = makeKeyword("REMOVAL-RDF-DATE-UNIFY-ARG2");
		$list3 = list(
				new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
						constant_handles.reader_make_constant_shell(makeString("rdfDate")),
						makeKeyword("REQUIRED-PATTERN"),
						list(constant_handles.reader_make_constant_shell(makeString("rdfDate")),
								list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("OR"),
										cons(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeKeyword("ANYTHING")),
										cons(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												makeKeyword("ANYTHING")),
										cons(constant_handles.reader_make_constant_shell(makeString("DayFn")),
												makeKeyword("ANYTHING")),
										cons(constant_handles.reader_make_constant_shell(makeString("SecondFn")),
												makeKeyword("ANYTHING")),
										cons(constant_handles.reader_make_constant_shell(makeString("MilliSecondFn")),
												makeKeyword("ANYTHING")))),
								makeKeyword("NOT-FULLY-BOUND")),
						makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"),
						makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG2"),
						makeKeyword("DOCUMENTATION"),
						makeString("Find arg2 bindings based on #$rdfDate values for arg1."), makeKeyword("EXAMPLE"),
						makeString("(#$rdfDate (#$DayFn 13 (#$MonthFn #$December (#$YearFn 1984))) ?RDF-DATE)") });
		$kw$REMOVAL_RDF_DATE_CHECK = makeKeyword("REMOVAL-RDF-DATE-CHECK");
		$list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("rdfDate")), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-RDF-DATE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("Ensure equivalence between arg1 and arg2 of #$rdfDate sentences."), makeKeyword("EXAMPLE"),
				makeString(
						"(#$rdfDate (#$DayFn 13 (#$MonthFn #$December (#$YearFn 1984))) (#$RDFTypedLiteralFn \"1984-12-13\" #$CalendarDay))") });
		$kw$RDF_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword(
				"RDF-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
		$list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("rdfDate")), makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("rdfDate")), makeKeyword("NOT-FULLY-BOUND"),
						makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$sym9$REMOVAL_RDF_DATE_UNIFY_ARG1 = makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG1");
		$sym10$REMOVAL_RDF_DATE_UNIFY_ARG2 = makeSymbol("REMOVAL-RDF-DATE-UNIFY-ARG2");
		$sym11$REMOVAL_RDF_DATE_CHECK_EXPAND = makeSymbol("REMOVAL-RDF-DATE-CHECK-EXPAND");
		$str12$_4__0d = makeString("~4,'0d");
		$str13$_4__0d__2__0d = makeString("~4,'0d-~2,'0d");
		$str14$__2__0d = makeString("-~2,'0d");
		$str15$T_2__0d__2__0d__2__0d = makeString("T~2,'0d:~2,'0d:~2,'0d");
		$str16$__3__0d = makeString(".~3,'0d");
		$const17$CalendarYear = constant_handles.reader_make_constant_shell(makeString("CalendarYear"));
		$const18$RDFTypedLiteralFn = constant_handles.reader_make_constant_shell(makeString("RDFTypedLiteralFn"));
		$list19 = list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
				makeString("http://www.w3.org/2001/XMLSchema#gYear"));
		$const20$CalendarMonth = constant_handles.reader_make_constant_shell(makeString("CalendarMonth"));
		$list21 = list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
				makeString("http://www.w3.org/2001/XMLSchema#gMonthYear"));
		$const22$CalendarDay = constant_handles.reader_make_constant_shell(makeString("CalendarDay"));
		$list23 = list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
				makeString("http://www.w3.org/2001/XMLSchema#Date"));
		$const24$CalendarSecond = constant_handles.reader_make_constant_shell(makeString("CalendarSecond"));
		$list25 = list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
				makeString("http://www.w3.org/2001/XMLSchema#DateTime"));
		$const26$CalendarMilliSecond = constant_handles.reader_make_constant_shell(makeString("CalendarMilliSecond"));
		$kw$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1 = makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1");
		$list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
						makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1"),
				makeKeyword("DOCUMENTATION"),
				makeString("Find arg1 bindings based on #$hasTimeIntervalSpecString values for arg2."),
				makeKeyword("EXAMPLE"),
				makeString("(#$hasTimeIntervalSpecString ?DATE \"[1999-01-12, 1999-06-30]\")") });
		$kw$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2 = makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2");
		$list30 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
						makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2"),
				makeKeyword("DOCUMENTATION"),
				makeString("Find arg2 bindings based on #$hasTimeIntervalSpecString values for arg1."),
				makeKeyword("EXAMPLE"), makeString(
						"(#$hasTimeIntervalSpecString (#$TimeIntervalInclusiveFn (#$DayFn 12 (#$MonthFn #$January (#$YearFn 1999))) (#$DayFn 30 (#$MonthFn #$June (#$YearFn 1999)))) ?TIME-INTERVAL-SPEC)") });
		$kw$REMOVAL_TIME_INTERVAL_SPEC_CHECK = makeKeyword("REMOVAL-TIME-INTERVAL-SPEC-CHECK");
		$list32 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("EXPAND"), makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString("Ensure equivalence between arg1 and arg2 of #$hasTimeIntervalSpecString sentences."),
				makeKeyword("EXAMPLE"), makeString(
						"(#$hasTimeIntervalSpecString (#$TimeIntervalInclusiveFn (#$DayFn 12 (#$MonthFn #$January (#$YearFn 1999))) (#$DayFn 30 (#$MonthFn #$June (#$YearFn 1999)))) \"[1999-01-12, 1999-06-30]\")") });
		$kw$TIME_INTERVAL_SPEC_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword(
				"TIME-INTERVAL-SPEC-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");
		$list34 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("hasTimeIntervalSpecString")),
						makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
		$const35$hasTimeIntervalSpecString = constant_handles
				.reader_make_constant_shell(makeString("hasTimeIntervalSpecString"));
		$sym36$REMOVAL_TIME_INTERVAL_SPEC_CHECK_EXPAND = makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-CHECK-EXPAND");
		$kw$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
		$sym38$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
		$kw$FAIL = makeKeyword("FAIL");
		$sym40$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG1 = makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG1");
		$sym41$REMOVAL_TIME_INTERVAL_SPEC_UNIFY_ARG2 = makeSymbol("REMOVAL-TIME-INTERVAL-SPEC-UNIFY-ARG2");
		$sym42$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$str43$Time_interval__S_extends_back_to_ = makeString(
				"Time interval ~S extends back to the beginning of time.");
		$str44$Time_interval__S_extends_to_the_e = makeString("Time interval ~S extends to the end of time.");
		$str45$_ = makeString("[");
		$str46$_ = makeString(",");
		$str47$_ = makeString(" ");
		$str48$_ = makeString("]");
		$str49$Can_t_convert__S_to_RDF_ = makeString("Can't convert ~S to RDF.");
		$str50$__ = makeString(":[");
		$const51$DaysDuration = constant_handles.reader_make_constant_shell(makeString("DaysDuration"));
		$str52$_AD = makeString("~AD");
		$sym53$WHITESPACE_STRING_ = makeSymbol("WHITESPACE-STRING?");
		$list54 = list(makeString("["), makeString(","), makeString("]"));
		$str55$_ = makeString(":");
		$kw$INITIAL = makeKeyword("INITIAL");
		$list57 = list(makeKeyword("DONE"), makeKeyword("ABORT"));
		$kw$STARTED = makeKeyword("STARTED");
		$kw$MIDDLE = makeKeyword("MIDDLE");
		$kw$LOOKING_FOR_COMMA = makeKeyword("LOOKING-FOR-COMMA");
		$kw$ABORT = makeKeyword("ABORT");
		$kw$DONE = makeKeyword("DONE");
		$kw$LOOKING_FOR_CLOSE_BRACKET = makeKeyword("LOOKING-FOR-CLOSE-BRACKET");
		$sym64$CYCL_EXPRESSION_P = makeSymbol("CYCL-EXPRESSION-P");
		$sym65$CONSTANT_P = makeSymbol("CONSTANT-P");
		$str66$_S_is_not_a_valid_time_interval_ = makeString("~S is not a valid time interval.");
		$list67 = list(constant_handles.reader_make_constant_shell(makeString("DaysDuration")), ONE_INTEGER);
		$list68 = list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
				list(makeKeyword("TEST"), makeSymbol("SOMETIME-INTERVAL-P")),
				list(makeKeyword("TEST"), makeSymbol("SOMETIME-INTERVAL-P")));
		$list69 = list(
				list(makeKeyword("OR"),
						constant_handles.reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")),
						constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive"))),
				list(makeKeyword("TEST"), makeSymbol("SOMETIME-INTERVAL-P")));
		$const70$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn"));
		$sym71$CONSTRUCT_TIME_LITERAL = makeSymbol("CONSTRUCT-TIME-LITERAL");
		$kw$TEST = makeKeyword("TEST");
		$sym73$EQUALS_EL_ = makeSymbol("EQUALS-EL?");
		$kw$OWNER = makeKeyword("OWNER");
		$kw$CLASSES = makeKeyword("CLASSES");
		$list76 = list(makeSymbol("RDF-DATE-TESTS"));
		$kw$KB = makeKeyword("KB");
		$kw$FULL = makeKeyword("FULL");
		$kw$WORKING_ = makeKeyword("WORKING?");
		$list80 = list(
				list(list(list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))),
						list(constant_handles.reader_make_constant_shell(makeString("RDFTypedLiteralFn")),
								makeString("1999"),
								list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
										makeString("http://www.w3.org/2001/XMLSchema#gYear")))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
						constant_handles.reader_make_constant_shell(makeString("January")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))),
						list(constant_handles.reader_make_constant_shell(makeString("RDFTypedLiteralFn")),
								makeString("1999-01"),
								list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
										makeString("http://www.w3.org/2001/XMLSchema#gMonthYear")))),
				list(list(
						ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999))))),
						list(constant_handles.reader_make_constant_shell(makeString("RDFTypedLiteralFn")),
								makeString("1999-01-12"),
								list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
										makeString("http://www.w3.org/2001/XMLSchema#Date")))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(
						constant_handles.reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36),
						list(constant_handles.reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER,
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("January")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1999)))))))),
						list(constant_handles.reader_make_constant_shell(makeString("RDFTypedLiteralFn")),
								makeString("1999-01-12T13:36:00"),
								list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
										makeString("http://www.w3.org/2001/XMLSchema#DateTime")))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("MilliSecondFn")),
						makeInteger(500),
						list(constant_handles.reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(
								constant_handles.reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36),
								list(constant_handles.reader_make_constant_shell(makeString("HourFn")),
										THIRTEEN_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("DayFn")),
												TWELVE_INTEGER,
												list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
														constant_handles
																.reader_make_constant_shell(makeString("January")),
														list(constant_handles.reader_make_constant_shell(
																makeString("YearFn")), makeInteger(1999))))))))),
						list(constant_handles.reader_make_constant_shell(makeString("RDFTypedLiteralFn")),
								makeString("1999-01-12T13:36:00.500"),
								list(constant_handles.reader_make_constant_shell(makeString("URIFn")),
										makeString("http://www.w3.org/2001/XMLSchema#DateTime")))));
		$sym81$CYCL_DATE_FROM_RDF_DATE = makeSymbol("CYCL-DATE-FROM-RDF-DATE");
		$list82 = list(
				list(list(makeString("1999")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999))),
				list(list(makeString("1999-01-12")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999))))),
				list(list(makeString("1999-01-12T13:36:00")), list(
						constant_handles.reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER,
						list(constant_handles.reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36), list(
								constant_handles.reader_make_constant_shell(makeString("HourFn")), THIRTEEN_INTEGER,
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("DayFn")),
										TWELVE_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("January")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1999)))))))),
				list(list(makeString("1999-01-12T13:36:00.500")), list(
						constant_handles.reader_make_constant_shell(makeString("MilliSecondFn")), makeInteger(500),
						list(constant_handles.reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(
								constant_handles.reader_make_constant_shell(makeString("MinuteFn")), makeInteger(36),
								list(constant_handles.reader_make_constant_shell(makeString("HourFn")),
										THIRTEEN_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("DayFn")),
												TWELVE_INTEGER,
												list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
														constant_handles
																.reader_make_constant_shell(makeString("January")),
														list(constant_handles.reader_make_constant_shell(
																makeString("YearFn")), makeInteger(1999))))))))));
		$sym83$CYCL_TIME_INTERVAL_TO_RDF = makeSymbol("CYCL-TIME-INTERVAL-TO-RDF");
		$list84 = list(new SubLObject[] {
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999)))),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), makeInteger(30),
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("June")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999)))))),
						makeString("[[1999-01-12, 1999-01-12], [1999-06-30, 1999-06-30]]:[169D, 169D]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999)))))),
						NIL),
				list(list(ConsesLow.list(
						constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), makeInteger(30),
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("June")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999)))))),
						NIL),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))),
						NIL),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), SIX_INTEGER,
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("September")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1920)))),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								constant_handles.reader_make_constant_shell(makeString("Always-TimeInterval")),
								makeString("d9126543-0a48-11e1-8eea-00219b4436b2")))),
						makeString("[[1920-09-06, 1920-09-06], [1920-09-06,]]:[,]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(2000)),
								makeString("fcabb4ed-0a48-11e1-8f02-00219b4436b2")),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("May")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(2005))),
								makeString("fcabb4ee-0a48-11e1-8f02-00219b4436b2")))),
						makeString("[[2000-01-01, 2000-12-31], [2005-05-01, 2005-05-31]]:[1582D, 1977D]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER,
								list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(2000)))),
						list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
								constant_handles.reader_make_constant_shell(makeString("January")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(2000))))),
						makeString("[[2000-01-01, 2000-01-01], [2000-01-31, 2000-01-31]]:[30D, 30D]")),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1997)),
								makeString("f918ca50-0a48-11e1-8f00-00219b4436b2"))),
						makeString("[[1997-01-01, 1997-12-31], [1997-01-01, 1997-12-31]]:[, 364D]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1943)),
								makeString("4b161dc7-0a44-11e1-8f22-00219b4436b2")),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1944)),
								makeString("4b161dc8-0a44-11e1-8f22-00219b4436b2")))),
						makeString("[[1943-01-01, 1943-12-31], [1944-01-01, 1944-12-31]]:[1D, 730D]")),
				list(list(ConsesLow.list(
						constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
						list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
								constant_handles.reader_make_constant_shell(makeString("December")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(2000))),
						makeString("687111d4-0a44-11e1-8f34-00219b4436b2"))),
						makeString("[[2000-12-01, 2000-12-31], [2000-12-01, 2000-12-31]]:[, 30D]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(
						constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
						list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), makeInteger(29),
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("December")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(2003)))),
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("January")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(2004))))),
						makeString("89391942-0a44-11e1-8f44-00219b4436b2")),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(
								constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), makeInteger(29),
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("December")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(2003)))),
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), ELEVEN_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("January")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(2004))))),
								makeString("89391943-0a44-11e1-8f44-00219b4436b2")))),
						makeString("[[2003-12-29, 2004-01-11], [2003-12-29, 2004-01-11]]:[, 13D]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(
						constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
						list(constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1999))),
						makeString("eabb9554-a5eb-4c64-990d-9af7302b399f")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))),
						makeString("[[, 1999-01-01], [1999-12-31, 1999-12-31]]:[364D,]")),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)),
						list(constant_handles.reader_make_constant_shell(makeString("SomeTimeInIntervalFn")),
								list(constant_handles
										.reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999))),
								makeString("eabb9554-a5eb-4c64-990d-9af7302b399f")))),
						makeString("[[1999-01-01, 1999-01-01], [1999-12-31,]]:[364D,]")) });
		$sym85$RDF_TIME_INTERVAL_TO_CYCL = makeSymbol("RDF-TIME-INTERVAL-TO-CYCL");
		$sym86$RDF_TIME_INTERVAL_TO_CYCL_RESULTS_OKAY_ = makeSymbol("RDF-TIME-INTERVAL-TO-CYCL-RESULTS-OKAY?");
		$list87 = list(new SubLObject[] {
				list(list(makeString("[1999-01-12, 1999-06-30]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999)))),
						list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
								constant_handles.reader_make_constant_shell(makeString("June")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1999))))),
				list(list(makeString("[1999-01-12,]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999)))),
						list(makeKeyword("SOMETIME"), list(
								constant_handles
										.reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")),
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("January")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1999)))))))),
				list(list(makeString("[, 1999-06-30]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(makeKeyword("SOMETIME"), list(
								constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("June")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1999))))),
						list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
								constant_handles.reader_make_constant_shell(makeString("June")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1999))))),
				list(list(makeString("[, 1999-12-31]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(makeKeyword("SOMETIME"), list(
								constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1999)))),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))),
				list(list(makeString("[2000, 2005]")),
						list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
								list(makeKeyword("SOMETIME"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(2000))),
								list(makeKeyword("SOMETIME"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(2005))))),
				list(list(makeString("[[1987-01-01, 1987-12-31],[,]]")),
						list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
								list(makeKeyword("SOMETIME"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1987))),
								list(makeKeyword("SOMETIME"),
										list(constant_handles.reader_make_constant_shell(
												makeString("IntervalStartedByFn-Inclusive")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1987)))))),
				list(list(makeString("[[,],[1987-01-01, 1987-12-31]]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(makeKeyword("SOMETIME"), list(
								constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1987)))),
						list(makeKeyword("SOMETIME"),
								list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
										makeInteger(1987))))),
				list(list(makeString("[,]")), list(makeKeyword("SOMETIME"),
						constant_handles.reader_make_constant_shell(makeString("Always-TimeInterval")))),
				list(list(makeString("[[1880-01-01, 1880-01-01], [1880-12-31, 1880-12-31]]")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1880))),
				list(list(makeString("[[1864-01-01,1864-01-01], [1864-01-01,1864-01-01]]")),
						list(constant_handles.reader_make_constant_shell(makeString("DayFn")), ONE_INTEGER,
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
										constant_handles.reader_make_constant_shell(makeString("January")),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1864))))),
				list(list(makeString("[[1993-01-01, 1993-12-31],[2006-05-01, 2006-05-31]]")),
						list(constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
								ConsesLow.list(
										makeKeyword("SOMETIME"),
										list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
												makeInteger(1993))),
								list(makeKeyword("SOMETIME"),
										list(constant_handles
												.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("May")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(2006)))))),
				list(list(makeString("[[, 1999-01-01], [1999-12-31, 1999-12-31]]:[364D,]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(makeKeyword("SOMETIME"), list(
								constant_handles.reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("DayFn")),
										ONE_INTEGER,
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("January")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1999)))))),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))),
				list(list(makeString("[[1999-01-01, 1999-01-01], [1999-12-31,]]:[364D,]")), list(
						constant_handles.reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")),
						list(constant_handles.reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)),
						list(makeKeyword("SOMETIME"), list(
								constant_handles
										.reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")),
								list(constant_handles.reader_make_constant_shell(makeString("DayFn")), makeInteger(31),
										list(constant_handles.reader_make_constant_shell(makeString("MonthFn")),
												constant_handles.reader_make_constant_shell(makeString("December")),
												list(constant_handles.reader_make_constant_shell(makeString("YearFn")),
														makeInteger(1999)))))))) });
		$sym88$SOME_TIME_INTERVAL_P = makeSymbol("SOME-TIME-INTERVAL-P");
		$sym89$GET_SOMETIME_DUMMY = makeSymbol("GET-SOMETIME-DUMMY");
		$kw$SOMETIME = makeKeyword("SOMETIME");
	}
}
/*
 *
 * Total time: 362 ms
 *
 */