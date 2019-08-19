package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class query_relaxation extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.query_relaxation";
	public static String myFingerPrint = "3454002a1533d4b1e43feb1114e5592ed507d2e81dc2414b70685efa9951171a";
	private static SubLObject $const0$QueryRelaxationStrategy_RemoveLit;
	private static SubLObject $const1$QueryRelaxationStrategyChangeValu;
	private static SubLString $str2$time_to_implement_support_for__S;
	private static SubLObject $const3$strategyHasPredicateOrder;
	private static SubLSymbol $kw$TRUE;
	private static SubLList $list5;
	private static SubLObject $const6$valueChangeListForStrategy;
	private static SubLList $list7;
	private static SubLList $list8;
	private static SubLList $list9;
	private static SubLList $list10;
	private static SubLObject $const11$DaysDuration;
	private static SubLSymbol $sym12$CONJUNCTION_WITH_TARGET_LITERAL_P;
	private static SubLSymbol $sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL;
	private static SubLSymbol $sym14$FORMULA_OPERATOR;
	private static SubLSymbol $sym15$CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE;
	private static SubLSymbol $kw$TEST;
	private static SubLSymbol $kw$OWNER;
	private static SubLSymbol $kw$CLASSES;
	private static SubLSymbol $kw$KB;
	private static SubLSymbol $kw$TINY;
	private static SubLSymbol $kw$WORKING_;
	private static SubLList $list22;

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 1100L)
	public static SubLObject new_cyc_query_with_relaxation(SubLObject sentence, SubLObject mt, SubLObject relaxation,
			SubLObject query_properties) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (relaxation == UNPROVIDED) {
			relaxation = NIL;
		}
		if (query_properties == UNPROVIDED) {
			query_properties = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject all_inferences = NIL;
		SubLObject all_metrics = NIL;
		SubLObject last_results = NIL;
		SubLObject last_halt_reason = NIL;
		SubLObject done = NIL;
		while (NIL == done) {
			thread.resetMultipleValues();
			SubLObject results = inference_kernel.new_cyc_query(sentence, mt, query_properties);
			SubLObject halt_reason = thread.secondMultipleValue();
			SubLObject inference = thread.thirdMultipleValue();
			SubLObject metrics = thread.fourthMultipleValue();
			thread.resetMultipleValues();
			last_results = results;
			last_halt_reason = halt_reason;
			SubLObject var = inference;
			if (NIL != var) {
				all_inferences = cons(var, all_inferences);
			}
			var = metrics;
			if (NIL != var) {
				all_metrics = cons(var, all_metrics);
			}
			done = relaxtion_strategy_termination_condition_satisfiedP(relaxation, results);
			if (NIL == done) {
				thread.resetMultipleValues();
				SubLObject relaxed_sentence = relax_query_sentence(sentence, relaxation);
				SubLObject invalidP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != invalidP) {
					done = T;
				} else {
					sentence = relaxed_sentence;
				}
			}
		}
		all_inferences = Sequences.nreverse(all_inferences);
		all_metrics = Sequences.nreverse(all_metrics);
		return Values.values(last_results, last_halt_reason, all_inferences, all_metrics);
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 2100L)
	public static SubLObject relaxtion_strategy_termination_condition_satisfiedP(SubLObject relaxation,
			SubLObject results) {
		return list_utilities.sublisp_boolean(results.first());
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 2300L)
	public static SubLObject relax_query_sentence(SubLObject sentence, SubLObject relaxation) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject invalidP = NIL;
		SubLObject handledP = NIL;
		if ((NIL == invalidP) && (NIL != isa.isa_in_any_mtP(relaxation, $const0$QueryRelaxationStrategy_RemoveLit))) {
			handledP = T;
			thread.resetMultipleValues();
			SubLObject sentence_$1 = relax_query_sentence_by_removing_literals(sentence, relaxation);
			SubLObject invalidP_$2 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			sentence = sentence_$1;
			invalidP = invalidP_$2;
		}
		if ((NIL == invalidP) && (NIL != isa.isa_in_any_mtP(relaxation, $const1$QueryRelaxationStrategyChangeValu))) {
			handledP = T;
			thread.resetMultipleValues();
			SubLObject sentence_$2 = relax_query_sentence_by_changing_value(sentence, relaxation);
			SubLObject invalidP_$3 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			sentence = sentence_$2;
			invalidP = invalidP_$3;
		}
		if (NIL == handledP)
			return Errors.error($str2$time_to_implement_support_for__S, relaxation);
		return Values.values(sentence, invalidP);
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 3000L)
	public static SubLObject relax_query_sentence_by_removing_literals(SubLObject sentence, SubLObject relaxation) {
		SubLObject el_predicate_order_list = kb_mapping_utilities.fpred_value_in_any_mt(relaxation,
				$const3$strategyHasPredicateOrder, ONE_INTEGER, TWO_INTEGER, $kw$TRUE);
		if (NIL != el_predicate_order_list) {
			SubLObject predicate_order_list = el_utilities.el_list_items(el_predicate_order_list);
			SubLObject cdolist_list_var;
			SubLObject inverse_preference_list = cdolist_list_var = Sequences.reverse(predicate_order_list);
			SubLObject predicate = NIL;
			predicate = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != list_utilities.simple_tree_findP(predicate, sentence)) {
					SubLObject relaxed_sentence = cycl_remove_predicate_literals_from_sentence(sentence, predicate);
					return Values.values(relaxed_sentence, NIL);
				}
				cdolist_list_var = cdolist_list_var.rest();
				predicate = cdolist_list_var.first();
			}
		}
		return Values.values(NIL, T);
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 3700L)
	public static SubLObject relax_query_sentence_by_changing_value(SubLObject sentence, SubLObject relaxation) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject cdolist_list_var;
		SubLObject value_change_list_specs = cdolist_list_var = gather_value_change_list_specs_for_strategy(relaxation);
		SubLObject value_change_list_spec = NIL;
		value_change_list_spec = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			SubLObject datum = current = value_change_list_spec;
			SubLObject pattern_formula = NIL;
			SubLObject arg_position = NIL;
			SubLObject el_value_list = NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
			pattern_formula = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
			arg_position = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list5);
			el_value_list = current.first();
			current = current.rest();
			if (NIL == current) {
				thread.resetMultipleValues();
				SubLObject changed_sentence = relax_query_sentence_apply_value_change_spec(sentence, pattern_formula,
						arg_position, el_value_list);
				SubLObject invalidP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != invalidP)
					return Values.values(NIL, T);
				sentence = changed_sentence;
			} else {
				cdestructuring_bind.cdestructuring_bind_error(datum, $list5);
			}
			cdolist_list_var = cdolist_list_var.rest();
			value_change_list_spec = cdolist_list_var.first();
		}
		return Values.values(sentence, NIL);
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 4400L)
	public static SubLObject gather_value_change_list_specs_for_strategy(SubLObject relaxation) {
		return kb_mapping_utilities.pred_value_tuples_in_any_mt(relaxation, $const6$valueChangeListForStrategy,
				ONE_INTEGER, $list7, $kw$TRUE);
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 4600L)
	public static SubLObject relax_query_sentence_apply_value_change_spec(SubLObject sentence,
			SubLObject pattern_formula, SubLObject arg_position, SubLObject el_value_list) {
		if (pattern_formula.equal($list8) && arg_position.equal($list9) && el_value_list.equal($list10)) {
			SubLObject pair;
			SubLObject old;
			SubLObject v_new;
			SubLObject old_expression;
			SubLObject new_expression;
			for (pair = NIL, pair = cons(TEN_INTEGER, el_utilities.el_list_items(el_value_list)); !pair
					.isAtom(); pair = pair.rest()) {
				old = pair.first();
				v_new = conses_high.second(pair);
				if ((NIL != old) && (NIL != v_new)) {
					old_expression = list($const11$DaysDuration, old);
					new_expression = list($const11$DaysDuration, v_new);
					if (NIL != list_utilities.simple_tree_find_via_equalP(old_expression, sentence)) {
						sentence = cycl_utilities.expression_subst(new_expression, old_expression, sentence,
								Symbols.symbol_function(EQUAL), UNPROVIDED);
						return Values.values(sentence, NIL);
					}
				}
			}
			return Values.values(NIL, T);
		}
		return Errors.error($str2$time_to_implement_support_for__S, $const6$valueChangeListForStrategy);
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 5600L)
	public static SubLObject cycl_remove_predicate_literals_from_sentence(SubLObject sentence, SubLObject predicate) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject _prev_bind_0 = control_vars.$mapping_target$.currentBinding(thread);
		try {
			control_vars.$mapping_target$.bind(predicate, thread);
			sentence = cycl_utilities.expression_transform(sentence,
					Symbols.symbol_function($sym12$CONJUNCTION_WITH_TARGET_LITERAL_P),
					Symbols.symbol_function($sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL), UNPROVIDED, UNPROVIDED);
		} finally {
			control_vars.$mapping_target$.rebind(_prev_bind_0, thread);
		}
		return sentence;
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 5900L)
	public static SubLObject conjunction_with_target_literal_p(SubLObject v_object, SubLObject predicate) {
		if (predicate == UNPROVIDED) {
			predicate = control_vars.$mapping_target$.getDynamicValue();
		}
		if (NIL != el_utilities.el_conjunction_p(v_object)) {
			SubLObject cdolist_list_var;
			SubLObject conjuncts = cdolist_list_var = cycl_utilities.formula_args(v_object, UNPROVIDED);
			SubLObject conjunct = NIL;
			conjunct = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if ((NIL != collection_defns.cycl_atomic_sentenceP(conjunct))
						&& predicate.equal(cycl_utilities.atomic_sentence_predicate(conjunct)))
					return conjunct;
				cdolist_list_var = cdolist_list_var.rest();
				conjunct = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/query-relaxation.lisp", position = 6300L)
	public static SubLObject conjunction_without_target_literal(SubLObject conjunction, SubLObject predicate) {
		if (predicate == UNPROVIDED) {
			predicate = control_vars.$mapping_target$.getDynamicValue();
		}
		SubLObject conjuncts = cycl_utilities.formula_args(conjunction, UNPROVIDED);
		conjuncts = Sequences.remove(predicate, conjuncts, Symbols.symbol_function(EQUAL),
				Symbols.symbol_function($sym14$FORMULA_OPERATOR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return el_utilities.make_conjunction(conjuncts);
	}

	public static SubLObject declare_query_relaxation_file() {
		declareFunction(myName, "new_cyc_query_with_relaxation", "NEW-CYC-QUERY-WITH-RELAXATION", 1, 3, false);
		declareFunction(myName, "relaxtion_strategy_termination_condition_satisfiedP",
				"RELAXTION-STRATEGY-TERMINATION-CONDITION-SATISFIED?", 2, 0, false);
		declareFunction(myName, "relax_query_sentence", "RELAX-QUERY-SENTENCE", 2, 0, false);
		declareFunction(myName, "relax_query_sentence_by_removing_literals",
				"RELAX-QUERY-SENTENCE-BY-REMOVING-LITERALS", 2, 0, false);
		declareFunction(myName, "relax_query_sentence_by_changing_value", "RELAX-QUERY-SENTENCE-BY-CHANGING-VALUE", 2,
				0, false);
		declareFunction(myName, "gather_value_change_list_specs_for_strategy",
				"GATHER-VALUE-CHANGE-LIST-SPECS-FOR-STRATEGY", 1, 0, false);
		declareFunction(myName, "relax_query_sentence_apply_value_change_spec",
				"RELAX-QUERY-SENTENCE-APPLY-VALUE-CHANGE-SPEC", 4, 0, false);
		declareFunction(myName, "cycl_remove_predicate_literals_from_sentence",
				"CYCL-REMOVE-PREDICATE-LITERALS-FROM-SENTENCE", 2, 0, false);
		declareFunction(myName, "conjunction_with_target_literal_p", "CONJUNCTION-WITH-TARGET-LITERAL-P", 1, 1, false);
		declareFunction(myName, "conjunction_without_target_literal", "CONJUNCTION-WITHOUT-TARGET-LITERAL", 1, 1,
				false);
		return NIL;
	}

	public static SubLObject init_query_relaxation_file() {
		return NIL;
	}

	public static SubLObject setup_query_relaxation_file() {
		utilities_macros.note_funcall_helper_function($sym12$CONJUNCTION_WITH_TARGET_LITERAL_P);
		utilities_macros.note_funcall_helper_function($sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL);
		generic_testing.define_test_case_table_int($sym15$CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE,
				list(new SubLObject[] { $kw$TEST, NIL, $kw$OWNER, NIL, $kw$CLASSES, NIL, $kw$KB, $kw$TINY, $kw$WORKING_,
						T }),
				$list22);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_query_relaxation_file();
	}

	@Override
	public void initializeVariables() {
		init_query_relaxation_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_query_relaxation_file();
	}

	static {
		me = new query_relaxation();
		$const0$QueryRelaxationStrategy_RemoveLit = constant_handles
				.reader_make_constant_shell(makeString("QueryRelaxationStrategy-RemoveLiteralViaSpecifiedOrder"));
		$const1$QueryRelaxationStrategyChangeValu = constant_handles
				.reader_make_constant_shell(makeString("QueryRelaxationStrategyChangeValueInArgAccordingToSpec"));
		$str2$time_to_implement_support_for__S = makeString("time to implement support for ~S");
		$const3$strategyHasPredicateOrder = constant_handles
				.reader_make_constant_shell(makeString("strategyHasPredicateOrder"));
		$kw$TRUE = makeKeyword("TRUE");
		$list5 = list(makeSymbol("PATTERN-FORMULA"), makeSymbol("ARG-POSITION"), makeSymbol("EL-VALUE-LIST"));
		$const6$valueChangeListForStrategy = constant_handles
				.reader_make_constant_shell(makeString("valueChangeListForStrategy"));
		$list7 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER);
		$list8 = list(constant_handles.reader_make_constant_shell(makeString("DaysDuration")),
				list(constant_handles.reader_make_constant_shell(makeString("SomeExampleFn")),
						constant_handles.reader_make_constant_shell(makeString("Integer"))));
		$list9 = list(constant_handles.reader_make_constant_shell(makeString("FormulaArgPositionFn")), ONE_INTEGER);
		$list10 = list(constant_handles.reader_make_constant_shell(makeString("TheList")), FIFTEEN_INTEGER,
				TWENTY_INTEGER, makeInteger(25), makeInteger(30));
		$const11$DaysDuration = constant_handles.reader_make_constant_shell(makeString("DaysDuration"));
		$sym12$CONJUNCTION_WITH_TARGET_LITERAL_P = makeSymbol("CONJUNCTION-WITH-TARGET-LITERAL-P");
		$sym13$CONJUNCTION_WITHOUT_TARGET_LITERAL = makeSymbol("CONJUNCTION-WITHOUT-TARGET-LITERAL");
		$sym14$FORMULA_OPERATOR = makeSymbol("FORMULA-OPERATOR");
		$sym15$CYCL_REMOVE_PREDICATE_LITERALS_FROM_SENTENCE = makeSymbol(
				"CYCL-REMOVE-PREDICATE-LITERALS-FROM-SENTENCE");
		$kw$TEST = makeKeyword("TEST");
		$kw$OWNER = makeKeyword("OWNER");
		$kw$CLASSES = makeKeyword("CLASSES");
		$kw$KB = makeKeyword("KB");
		$kw$TINY = makeKeyword("TINY");
		$kw$WORKING_ = makeKeyword("WORKING?");
		$list22 = ConsesLow.list(
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("and")),
								list(constant_handles.reader_make_constant_shell(makeString("comment")),
										makeSymbol("?X"), makeString("foo")),
								list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?X"),
										constant_handles.reader_make_constant_shell(makeString("Thing"))),
								list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?X"),
										constant_handles.reader_make_constant_shell(makeString("Individual")))),
						constant_handles.reader_make_constant_shell(makeString("isa"))),
						list(constant_handles.reader_make_constant_shell(makeString("and")),
								list(constant_handles.reader_make_constant_shell(makeString("comment")),
										makeSymbol("?X"), makeString("foo")),
								list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?X"),
										constant_handles.reader_make_constant_shell(makeString("Individual"))))),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("and")),
								list(constant_handles.reader_make_constant_shell(makeString("comment")),
										makeSymbol("?X"), makeString("foo")),
								list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?X"),
										constant_handles.reader_make_constant_shell(makeString("Individual")))),
						constant_handles.reader_make_constant_shell(makeString("comment"))),
						list(constant_handles.reader_make_constant_shell(makeString("and")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("genls")),
										makeSymbol("?X"),
										constant_handles.reader_make_constant_shell(makeString("Individual"))))),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("and")),
								list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?X"),
										constant_handles.reader_make_constant_shell(makeString("Individual")))),
						constant_handles.reader_make_constant_shell(makeString("genls"))),
						list(constant_handles.reader_make_constant_shell(makeString("and")))));
	}
}
/*
 *
 * Total time: 118 ms
 *
 */