package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.regular_expression_utilities;
import com.cyc.cycjava.cycl.regular_expressions;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_regular_expressions extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_regular_expressions";
	public static String myFingerPrint = "fdb2f380e66a8821ff611aa2ca888c386f7a9488894f7861d7788024e017f286";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1300L)
	public static SubLSymbol $regex_string_match_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1400L)
	private static SubLSymbol $default_regex_string_match_cost$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 5900L)
	public static SubLSymbol $regex_string_match_case_insensitive_mt$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 6000L)
	private static SubLSymbol $default_regex_string_match_case_insensitive_cost$;
	private static SubLObject $const0$regexStringMatch;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $sym2$_REGEX_STRING_MATCH_MT_;
	private static SubLObject $const3$BaseKB;
	private static SubLSymbol $kw$REMOVAL_REGEX_STRING_MATCH_POS;
	private static SubLList $list5;
	private static SubLSymbol $kw$REMOVAL_REGEX_STRING_MATCH_NEG;
	private static SubLList $list7;
	private static SubLSymbol $sym8$STRINGP;
	private static SubLSymbol $kw$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS;
	private static SubLList $list10;
	private static SubLSymbol $sym11$REGEX_STRING_MATCH_WITH_BINDINGS;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLSymbol $kw$TRUE_MON;
	private static SubLObject $const14$regexStringMatch_CaseInsensitive;
	private static SubLSymbol $sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_;
	private static SubLSymbol $kw$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS;
	private static SubLList $list17;
	private static SubLSymbol $kw$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG;
	private static SubLList $list19;
	private static SubLList $list20;
	private static SubLSymbol $kw$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS;
	private static SubLList $list22;
	private static SubLSymbol $sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE;
	private static SubLObject $const24$regexSubstringMatch;
	private static SubLSymbol $kw$META_REMOVAL_COMPLETELY_DECIDABLE_POS;
	private static SubLSymbol $kw$REMOVAL_COMPLETELY_DECIDABLE_NEG;
	private static SubLSymbol $kw$REMOVAL_REGEX_SUBSTRING_MATCH_POS;
	private static SubLList $list28;
	private static SubLSymbol $sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR;
	private static SubLList $list30;
	private static SubLList $list31;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 1700L)
	public static SubLObject removal_regex_string_match_required(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		return regular_expressions.is_regular_expressions_support_availableP();
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 3600L)
	public static SubLObject regex_string_match(SubLObject regex_string, SubLObject data_string) {
		assert NIL != Types.stringp(regex_string) : regex_string;
		assert NIL != Types.stringp(data_string) : data_string;
		return list_utilities.sublisp_boolean(regular_expression_utilities.offsets_of_regex_matches(regex_string,
				data_string, UNPROVIDED, UNPROVIDED));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 4700L)
	public static SubLObject regex_string_match_with_bindings(SubLObject asent, SubLObject sense) {
		return regex_string_match_with_bindings_int(asent, sense, NIL);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 4800L)
	public static SubLObject regex_string_match_with_bindings_int(SubLObject asent, SubLObject sense,
			SubLObject regex_options) {
		SubLObject pattern = cycl_utilities.formula_arg1(asent, UNPROVIDED);
		SubLObject string = cycl_utilities.formula_arg2(asent, UNPROVIDED);
		SubLObject match_var_count = Numbers.subtract(el_utilities.formula_arity(asent, UNPROVIDED), TWO_INTEGER);
		SubLObject matches = regular_expression_utilities.find_all_captured_matches_within_string_from_string(pattern,
				string, regex_options);
		SubLObject result_sentence = el_utilities.make_formula(cycl_utilities.formula_arg0(asent),
				list(pattern, string), UNPROVIDED);
		SubLObject too_few_matchesP = NIL;
		SubLObject cdotimes_end_var;
		SubLObject n;
		SubLObject current_match;
		SubLObject current_result_sentence;
		for (cdotimes_end_var = Sequences.length(matches), n = NIL, n = ZERO_INTEGER; n
				.numL(cdotimes_end_var); n = Numbers.add(n, ONE_INTEGER)) {
			current_match = nth(n, matches);
			current_result_sentence = Sequences.cconcatenate(result_sentence, current_match);
			backward.removal_add_node(
					arguments.make_hl_support($kw$OPAQUE, current_result_sentence, $const3$BaseKB, $kw$TRUE_MON),
					unification_utilities.asent_unify(asent, current_result_sentence, T, UNPROVIDED), UNPROVIDED);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 6300L)
	public static SubLObject removal_regex_string_match_case_insensitive_required(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		return regular_expressions.is_regular_expressions_support_availableP();
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 8600L)
	public static SubLObject regex_string_match_case_insensitive(SubLObject regex_string, SubLObject data_string) {
		assert NIL != Types.stringp(regex_string) : regex_string;
		assert NIL != Types.stringp(data_string) : data_string;
		return list_utilities.sublisp_boolean(
				regular_expression_utilities.offsets_of_regex_matches(regex_string, data_string, $list20, UNPROVIDED));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 9900L)
	public static SubLObject regex_string_match_with_bindings_case_insensitive(SubLObject asent, SubLObject sense) {
		return regex_string_match_with_bindings_int(asent, sense, $list20);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 12000L)
	public static SubLObject removal_regex_substring_match_iterator(SubLObject values) {
		return removal_regex_substring_match_iterator_int(values, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-regular-expressions.lisp", position = 12100L)
	public static SubLObject removal_regex_substring_match_iterator_int(SubLObject values, SubLObject regex_options) {
		if (regex_options == UNPROVIDED) {
			regex_options = NIL;
		}
		SubLObject pattern = NIL;
		SubLObject data = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(values, values, $list30);
		pattern = values.first();
		SubLObject current = values.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, values, $list30);
		data = current.first();
		current = current.rest();
		SubLObject index = current.isCons() ? current.first() : NIL;
		cdestructuring_bind.destructuring_bind_must_listp(current, values, $list30);
		current = current.rest();
		SubLObject span = current.isCons() ? current.first() : NIL;
		cdestructuring_bind.destructuring_bind_must_listp(current, values, $list30);
		current = current.rest();
		if (NIL == current) {
			SubLObject matches = regular_expression_utilities.offsets_of_regex_matches(pattern, data, regex_options,
					UNPROVIDED);
			SubLObject results = NIL;
			SubLObject cdolist_list_var = matches;
			SubLObject match = NIL;
			match = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject current_$2;
				SubLObject datum_$1 = current_$2 = match;
				SubLObject the_start_index = NIL;
				SubLObject the_end_index = NIL;
				cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, $list31);
				the_start_index = current_$2.first();
				current_$2 = (the_end_index = current_$2.rest());
				SubLObject the_span = Numbers.subtract(the_end_index, the_start_index);
				SubLObject input_asent = el_utilities.make_formula($const24$regexSubstringMatch, values, UNPROVIDED);
				SubLObject answer_asent = el_utilities.make_formula($const24$regexSubstringMatch,
						list(pattern, data, the_start_index, the_span), UNPROVIDED);
				SubLObject v_bindings = unification_utilities.gaf_asent_unify(input_asent, answer_asent, UNPROVIDED,
						UNPROVIDED);
				if (NIL != v_bindings) {
					results = cons(v_bindings, results);
				}
				cdolist_list_var = cdolist_list_var.rest();
				match = cdolist_list_var.first();
			}
			return iteration.new_list_iterator(results);
		}
		cdestructuring_bind.cdestructuring_bind_error(values, $list30);
		return NIL;
	}

	public static SubLObject declare_removal_modules_regular_expressions_file() {
		declareFunction(myName, "removal_regex_string_match_required", "REMOVAL-REGEX-STRING-MATCH-REQUIRED", 1, 1,
				false);
		declareFunction(myName, "regex_string_match", "REGEX-STRING-MATCH", 2, 0, false);
		declareFunction(myName, "regex_string_match_with_bindings", "REGEX-STRING-MATCH-WITH-BINDINGS", 2, 0, false);
		declareFunction(myName, "regex_string_match_with_bindings_int", "REGEX-STRING-MATCH-WITH-BINDINGS-INT", 3, 0,
				false);
		declareFunction(myName, "removal_regex_string_match_case_insensitive_required",
				"REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED", 1, 1, false);
		declareFunction(myName, "regex_string_match_case_insensitive", "REGEX-STRING-MATCH-CASE-INSENSITIVE", 2, 0,
				false);
		declareFunction(myName, "regex_string_match_with_bindings_case_insensitive",
				"REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE", 2, 0, false);
		declareFunction(myName, "removal_regex_substring_match_iterator", "REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR", 1,
				0, false);
		declareFunction(myName, "removal_regex_substring_match_iterator_int",
				"REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR-INT", 1, 1, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_regular_expressions_file() {
		$regex_string_match_mt$ = deflexical("*REGEX-STRING-MATCH-MT*",
				maybeDefault($sym2$_REGEX_STRING_MATCH_MT_, $regex_string_match_mt$, $const3$BaseKB));
		$default_regex_string_match_cost$ = defparameter("*DEFAULT-REGEX-STRING-MATCH-COST*",
				control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
		$regex_string_match_case_insensitive_mt$ = deflexical("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*",
				maybeDefault($sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_, $regex_string_match_case_insensitive_mt$,
						$const3$BaseKB));
		$default_regex_string_match_case_insensitive_cost$ = defparameter(
				"*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*",
				control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
		return NIL;
	}

	public static SubLObject setup_removal_modules_regular_expressions_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$regexStringMatch);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$regexStringMatch, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$regexStringMatch, TWO_INTEGER);
		subl_macro_promotions.declare_defglobal($sym2$_REGEX_STRING_MATCH_MT_);
		mt_vars.note_mt_var($sym2$_REGEX_STRING_MATCH_MT_, $const0$regexStringMatch);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_STRING_MATCH_POS, $list5);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_STRING_MATCH_NEG, $list7);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS, $list10);
		utilities_macros.note_funcall_helper_function($sym11$REGEX_STRING_MATCH_WITH_BINDINGS);
		inference_modules.register_solely_specific_removal_module_predicate($const14$regexStringMatch_CaseInsensitive);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const14$regexStringMatch_CaseInsensitive, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const14$regexStringMatch_CaseInsensitive, TWO_INTEGER);
		subl_macro_promotions.declare_defglobal($sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_);
		mt_vars.note_mt_var($sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_, $const14$regexStringMatch_CaseInsensitive);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS, $list17);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG, $list19);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS,
				$list22);
		utilities_macros.note_funcall_helper_function($sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE);
		inference_modules.register_solely_specific_removal_module_predicate($const24$regexSubstringMatch);
		inference_modules.inference_removal_module_use_meta_removal($const24$regexSubstringMatch,
				$kw$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
		inference_modules.inference_removal_module_use_generic($const24$regexSubstringMatch,
				$kw$REMOVAL_COMPLETELY_DECIDABLE_NEG);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const24$regexSubstringMatch, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const24$regexSubstringMatch, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_REGEX_SUBSTRING_MATCH_POS, $list28);
		utilities_macros.note_funcall_helper_function($sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_regular_expressions_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_regular_expressions_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_regular_expressions_file();
	}

	static {
		me = new removal_modules_regular_expressions();
		$regex_string_match_mt$ = null;
		$default_regex_string_match_cost$ = null;
		$regex_string_match_case_insensitive_mt$ = null;
		$default_regex_string_match_case_insensitive_cost$ = null;
		$const0$regexStringMatch = constant_handles.reader_make_constant_shell(makeString("regexStringMatch"));
		$kw$POS = makeKeyword("POS");
		$sym2$_REGEX_STRING_MATCH_MT_ = makeSymbol("*REGEX-STRING-MATCH-MT*");
		$const3$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
		$kw$REMOVAL_REGEX_STRING_MATCH_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-POS");
		$list5 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexStringMatch")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("STRING"),
						makeKeyword("STRING")),
				makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T,
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("regexStringMatch")),
								list(makeKeyword("BIND"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("BIND"), makeSymbol("DATA"))),
						list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("REGEX-STRING-MATCH"),
						list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
						list(makeKeyword("VALUE"), makeSymbol("DATA"))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$regexStringMatch <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"),
				makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch \"[FD]og\" \"Dog\")") });
		$kw$REMOVAL_REGEX_STRING_MATCH_NEG = makeKeyword("REMOVAL-REGEX-STRING-MATCH-NEG");
		$list7 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexStringMatch")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("regexStringMatch")), makeKeyword("STRING"),
						makeKeyword("STRING")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T,
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("regexStringMatch")),
								list(makeKeyword("BIND"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("BIND"), makeSymbol("DATA"))),
						list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"),
						list(makeKeyword("CALL"), makeSymbol("REGEX-STRING-MATCH"),
								list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$not (#$regexStringMatch <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>"),
				makeKeyword("EXAMPLE"), makeString("(#$not (#$regexStringMatch \"[FD]og\" \"Log\"))") });
		$sym8$STRINGP = makeSymbol("STRINGP");
		$kw$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_POS = makeKeyword("REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-POS");
		$list10 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexStringMatch")),
				makeKeyword("REQUIRED-PATTERN"),
				listS(constant_handles.reader_make_constant_shell(makeString("regexStringMatch")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS"), makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"),
				makeKeyword("SUPPORT-MT"), constant_handles.reader_make_constant_shell(makeString("BaseKB")),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$regexStringMatch <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied to <data string>"),
				makeKeyword("EXAMPLE"),
				makeString("(#$regexStringMatch \"dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });
		$sym11$REGEX_STRING_MATCH_WITH_BINDINGS = makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS");
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$kw$TRUE_MON = makeKeyword("TRUE-MON");
		$const14$regexStringMatch_CaseInsensitive = constant_handles
				.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive"));
		$sym15$_REGEX_STRING_MATCH_CASE_INSENSITIVE_MT_ = makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*");
		$kw$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_POS = makeKeyword(
				"REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-POS");
		$list17 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
						makeKeyword("STRING"), makeKeyword("STRING")),
				makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-REQUIRED"),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T,
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles
								.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
								list(makeKeyword("BIND"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("BIND"), makeSymbol("DATA"))),
						list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"),
						list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
						list(makeKeyword("VALUE"), makeSymbol("DATA"))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>)\n    when <data string> matches the regular expression in <regular-expression string>"),
				makeKeyword("EXAMPLE"), makeString("(#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Dog\")") });
		$kw$REMOVAL_REGEX_STRING_MATCH_CASE_INSENSITIVE_NEG = makeKeyword(
				"REMOVAL-REGEX-STRING-MATCH-CASE-INSENSITIVE-NEG");
		$list19 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
						makeKeyword("STRING"), makeKeyword("STRING")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-CASE-INSENSITIVE-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("CHECK"), T,
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles
								.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
								list(makeKeyword("BIND"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("BIND"), makeSymbol("DATA"))),
						list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("INVERT-BOOLEAN-ANSWER"),
						list(makeKeyword("CALL"), makeSymbol("REGEX-STRING-MATCH-CASE-INSENSITIVE"),
								list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*REGEX-STRING-MATCH-CASE-INSENSITIVE-MT*"), makeKeyword("SUPPORT-STRENGTH"),
				makeKeyword("MONOTONIC"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$not (#$regexStringMatch-CaseInsensitive <regular-expression string> <data string>))\n    when <data string> doesn't match the regular expression in <regular-expression string>"),
				makeKeyword("EXAMPLE"),
				makeString("(#$not (#$regexStringMatch-CaseInsensitive \"[fd]OG\" \"Log\"))") });
		$list20 = list(makeKeyword("CASELESS"));
		$kw$REMOVAL_REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE_POS = makeKeyword(
				"REMOVAL-REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE-POS");
		$list22 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
				makeKeyword("REQUIRED-PATTERN"),
				listS(constant_handles.reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE"), makeKeyword("SUPPORT-MODULE"),
				makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
				constant_handles.reader_make_constant_shell(makeString("BaseKB")), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$regexStringMatch-CaseInsensitive <regular-expression string> <data string> <vars>))\n    holds when <vars> is the captured matches when <regular-expression string> is applied case-insensitively \n    to <data string>"),
				makeKeyword("EXAMPLE"),
				makeString("(#$regexStringMatch-CaseInsensitive \"Dog(.*)mice\" \"dogs hate mice\" \"s hate \")") });
		$sym23$REGEX_STRING_MATCH_WITH_BINDINGS_CASE_INSENSITIVE = makeSymbol(
				"REGEX-STRING-MATCH-WITH-BINDINGS-CASE-INSENSITIVE");
		$const24$regexSubstringMatch = constant_handles.reader_make_constant_shell(makeString("regexSubstringMatch"));
		$kw$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
		$kw$REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
		$kw$REMOVAL_REGEX_SUBSTRING_MATCH_POS = makeKeyword("REMOVAL-REGEX-SUBSTRING-MATCH-POS");
		$list28 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("regexSubstringMatch")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("regexSubstringMatch")),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"),
						makeKeyword("ANYTHING")),
				makeKeyword("REQUIRED"), makeSymbol("REMOVAL-REGEX-STRING-MATCH-REQUIRED"),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-REGEX-STRING-MATCH-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("regexSubstringMatch")),
								list(makeKeyword("BIND"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("BIND"), makeSymbol("DATA")),
								list(makeKeyword("BIND"), makeSymbol("INDEX")),
								list(makeKeyword("BIND"), makeSymbol("SPAN"))),
						list(list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")),
								list(makeKeyword("VALUE"), makeSymbol("INDEX")),
								list(makeKeyword("VALUE"), makeSymbol("SPAN")))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR"), makeKeyword("INPUT")),
				makeKeyword("OUTPUT-DECODE-PATTERN"),
				list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("BINDINGS")),
						list(makeKeyword("VALUE"), makeSymbol("BINDINGS"))),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"),
						list(makeKeyword("VALUE"), makeSymbol("BINDINGS")),
						list(constant_handles.reader_make_constant_shell(makeString("regexSubstringMatch")),
								list(makeKeyword("VALUE"), makeSymbol("REGULAR-EXPRESSION")),
								list(makeKeyword("VALUE"), makeSymbol("DATA")),
								list(makeKeyword("VALUE"), makeSymbol("INDEX")),
								list(makeKeyword("VALUE"), makeSymbol("SPAN")))),
				makeKeyword("SUPPORT-MODULE"), makeKeyword("OPAQUE"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*REGEX-STRING-MATCH-MT*"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$regexSubstringMatch <regular-expression string> <data string> <data index> <data span>)\n    when <data string> matches the regular expression in <regular-expression string> starting\n    at index and continuing for span characters"),
				makeKeyword("EXAMPLE"), makeString("(#$regexSubstringMatch \"[FD]og\" \"Dog\" 0 3)") });
		$sym29$REMOVAL_REGEX_SUBSTRING_MATCH_ITERATOR = makeSymbol("REMOVAL-REGEX-SUBSTRING-MATCH-ITERATOR");
		$list30 = list(makeSymbol("PATTERN"), makeSymbol("DATA"), makeSymbol("&OPTIONAL"), makeSymbol("INDEX"),
				makeSymbol("SPAN"));
		$list31 = cons(makeSymbol("THE-START-INDEX"), makeSymbol("THE-END-INDEX"));
	}
}
/*
 *
 * Total time: 163 ms
 *
 */