package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_equation_permutations extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myFingerPrint = "a16b132c140ef503b6bd67cdd3030fdb1a7c57ac9b4c89cb1b32cb1760335bf5";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6100L)
	private static SubLSymbol $equation_permutable_operators$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 13600L)
	public static SubLSymbol $equation_permutations_defining_mt$;
	private static SubLObject $const0$numericallyEquals;
	private static SubLSymbol $sym1$CYCL_EQUATION_P;
	private static SubLSymbol $sym2$EQUATION_CANONICAL_PERMUTATION_;
	private static SubLList $list3;
	private static SubLObject $const4$PlusFn;
	private static SubLObject $const5$DifferenceFn;
	private static SubLObject $const6$TimesFn;
	private static SubLObject $const7$QuotientFn;
	private static SubLObject $const8$LogFn;
	private static SubLObject $const9$ExpFn;
	private static SubLObject $const10$The;
	private static SubLList $list11;
	private static SubLList $list12;
	private static SubLList $list13;
	private static SubLSymbol $sym14$MAKE_ADDITION;
	private static SubLSymbol $sym15$MAKE_MULTIPLICATION;
	private static SubLObject $const16$equationPermutations;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_;
	private static SubLObject $const19$UniversalVocabularyMt;
	private static SubLSymbol $kw$REMOVAL_EQUATION_PERMUTATIONS_CHECK;
	private static SubLList $list21;
	private static SubLSymbol $kw$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY;
	private static SubLList $list23;
	private static SubLSymbol $kw$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY;
	private static SubLList $list25;
	private static SubLSymbol $sym26$EQUATION_PERMUTATIONS_FROM_ADDITION;
	private static SubLSymbol $kw$TEST;
	private static SubLSymbol $kw$OWNER;
	private static SubLSymbol $kw$CLASSES;
	private static SubLSymbol $kw$KB;
	private static SubLSymbol $kw$TINY;
	private static SubLSymbol $kw$WORKING_;
	private static SubLList $list33;
	private static SubLSymbol $sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION;
	private static SubLList $list35;
	private static SubLSymbol $sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION;
	private static SubLList $list37;
	private static SubLSymbol $sym38$EQUATION_PERMUTATIONS_FROM_DIVISION;
	private static SubLList $list39;
	private static SubLSymbol $sym40$EQUATION_IMMEDIATE_PERMUTATIONS;
	private static SubLList $list41;
	private static SubLSymbol $sym42$EQUATION_CANONICAL_PERMUTATIONS;
	private static SubLSymbol $kw$FULL;
	private static SubLList $list44;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 1100L)
	public static SubLObject cycl_equation_p(SubLObject v_object) {
		return makeBoolean((NIL != el_utilities.el_formula_with_operator_p(v_object, $const0$numericallyEquals))
				&& (NIL != el_utilities.formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 1500L)
	public static SubLObject equation_permutations(SubLObject equation) {
		assert NIL != cycl_equation_p(equation) : equation;
		SubLObject unprocessed_equations = queues.create_queue(UNPROVIDED);
		SubLObject seen_equations = set.new_set(Symbols.symbol_function(EQUAL), UNPROVIDED);
		SubLObject all_permutations = NIL;
		queues.enqueue(equation, unprocessed_equations);
		set.set_add(equation, seen_equations);
		while (NIL == queues.queue_empty_p(unprocessed_equations)) {
			SubLObject unprocessed_equation = queues.dequeue(unprocessed_equations);
			SubLObject immediate_permutations = equation_immediate_permutations(unprocessed_equation);
			all_permutations = cons(unprocessed_equation, all_permutations);
			SubLObject cdolist_list_var = immediate_permutations;
			SubLObject immediate_permutation = NIL;
			immediate_permutation = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL == set.set_memberP(immediate_permutation, seen_equations)) {
					queues.enqueue(immediate_permutation, unprocessed_equations);
					set.set_add(immediate_permutation, seen_equations);
				}
				cdolist_list_var = cdolist_list_var.rest();
				immediate_permutation = cdolist_list_var.first();
			}
		}
		all_permutations = kb_utilities.sort_terms(all_permutations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
				UNPROVIDED, UNPROVIDED);
		return all_permutations;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 2600L)
	public static SubLObject equation_canonical_permutations(SubLObject equation) {
		SubLObject all_permutations = equation_permutations(equation);
		SubLObject canonical_permutations = NIL;
		SubLObject cdolist_list_var = all_permutations;
		SubLObject permutation = NIL;
		permutation = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != equation_canonical_permutationP(permutation)) {
				canonical_permutations = cons(permutation, canonical_permutations);
			}
			cdolist_list_var = cdolist_list_var.rest();
			permutation = cdolist_list_var.first();
		}
		canonical_permutations = kb_utilities.sort_terms(canonical_permutations, UNPROVIDED, UNPROVIDED, UNPROVIDED,
				UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return canonical_permutations;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 3200L)
	public static SubLObject equation_has_canonical_permutationP(SubLObject equation, SubLObject permutation) {
		assert NIL != cycl_equation_p(equation) : equation;
		assert NIL != cycl_equation_p(permutation) : permutation;
		return makeBoolean((NIL != equation_canonical_permutationP(permutation))
				&& (NIL != list_utilities.member_equalP(permutation, equation_canonical_permutations(equation))));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 3600L)
	public static SubLObject equation_canonical_permutationP(SubLObject permutation) {
		if (NIL == cycl_equation_p(permutation))
			return NIL;
		SubLObject arg1 = cycl_utilities.formula_arg1(permutation, UNPROVIDED);
		if (arg1.isNumber())
			return NIL;
		return makeBoolean(((NIL == el_utilities.el_formula_p(arg1))
				|| (NIL == equation_permutable_operator_p(cycl_utilities.formula_operator(arg1))))
				&& (NIL == cycl_utilities.expression_find(arg1, cycl_utilities.formula_arg2(permutation, UNPROVIDED),
						UNPROVIDED, UNPROVIDED, UNPROVIDED)));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 4900L)
	public static SubLObject equation_immediate_permutations(SubLObject equation) {
		SubLObject num_eq = NIL;
		SubLObject expression1 = NIL;
		SubLObject expression2 = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(equation, equation, $list3);
		num_eq = equation.first();
		SubLObject current = equation.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, equation, $list3);
		expression1 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, equation, $list3);
		expression2 = current.first();
		current = current.rest();
		if (NIL == current) {
			list_utilities.verify_operator(num_eq, $const0$numericallyEquals);
			SubLObject permutations = NIL;
			if (NIL != el_utilities.el_formula_p(expression1)) {
				SubLObject pcase_var;
				SubLObject operator = pcase_var = cycl_utilities.formula_operator(expression1);
				if (pcase_var.eql($const4$PlusFn)) {
					permutations = equation_permutations_from_addition(expression1, expression2);
				} else if (pcase_var.eql($const5$DifferenceFn)) {
					permutations = equation_permutations_from_subtraction(expression1, expression2);
				} else if (pcase_var.eql($const6$TimesFn)) {
					permutations = equation_permutations_from_multiplication(expression1, expression2);
				} else if (pcase_var.eql($const7$QuotientFn)) {
					permutations = equation_permutations_from_division(expression1, expression2);
				} else if (pcase_var.eql($const8$LogFn)) {
					permutations = equation_permutations_from_natural_log(expression1, expression2);
				} else if (pcase_var.eql($const9$ExpFn)) {
					permutations = equation_permutations_from_natural_exp(expression1, expression2);
				} else if (pcase_var.eql($const10$The)) {
				}
			}
			permutations = cons(make_equation(expression2, expression1), permutations);
			return permutations;
		}
		cdestructuring_bind.cdestructuring_bind_error(equation, $list3);
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6400L)
	public static SubLObject equation_permutable_operator_p(SubLObject v_object) {
		return subl_promotions.memberP(v_object, $equation_permutable_operators$.getGlobalValue(), UNPROVIDED,
				UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 6500L)
	public static SubLObject equation_permutations_from_addition(SubLObject addition, SubLObject other) {
		list_utilities.verify_form_with_operator(addition, $const4$PlusFn);
		SubLObject addends = cycl_utilities.formula_args(addition, UNPROVIDED);
		SubLObject permutations = NIL;
		SubLObject list_var = NIL;
		SubLObject addend = NIL;
		SubLObject index = NIL;
		list_var = addends;
		addend = list_var.first();
		for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), addend = list_var
				.first(), index = Numbers.add(ONE_INTEGER, index)) {
			SubLObject rest_addends = list_utilities.remove_nth(index, addends);
			SubLObject rest_term = (NIL != list_utilities.singletonP(rest_addends)) ? rest_addends.first()
					: make_addition(rest_addends);
			SubLObject permuted_other = make_difference(other, rest_term);
			SubLObject permutation = make_equation(addend, permuted_other);
			permutations = cons(permutation, permutations);
		}
		return Sequences.nreverse(permutations);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 7200L)
	public static SubLObject equation_permutations_from_subtraction(SubLObject subtraction, SubLObject other) {
		list_utilities.verify_form_with_operator(subtraction, $const5$DifferenceFn);
		SubLObject current;
		SubLObject datum = current = cycl_utilities.formula_args(subtraction, UNPROVIDED);
		SubLObject minuend = NIL;
		SubLObject subtrahend = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
		minuend = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list12);
		subtrahend = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject permuted1 = make_addition(list(other, subtrahend));
			SubLObject permuted2 = make_difference(minuend, other);
			SubLObject permutation1 = make_equation(minuend, permuted1);
			SubLObject permutation2 = make_equation(subtrahend, permuted2);
			return list(permutation1, permutation2);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list12);
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 7800L)
	public static SubLObject equation_permutations_from_multiplication(SubLObject multiplication, SubLObject other) {
		list_utilities.verify_form_with_operator(multiplication, $const6$TimesFn);
		SubLObject addends = cycl_utilities.formula_args(multiplication, UNPROVIDED);
		SubLObject permutations = NIL;
		SubLObject list_var = NIL;
		SubLObject addend = NIL;
		SubLObject index = NIL;
		list_var = addends;
		addend = list_var.first();
		for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), addend = list_var
				.first(), index = Numbers.add(ONE_INTEGER, index)) {
			SubLObject rest_addends = list_utilities.remove_nth(index, addends);
			SubLObject rest_term = (NIL != list_utilities.singletonP(rest_addends)) ? rest_addends.first()
					: make_multiplication(rest_addends);
			SubLObject permuted_other = make_quotient(other, rest_term);
			SubLObject permutation = make_equation(addend, permuted_other);
			permutations = cons(permutation, permutations);
			rest_addends = list_utilities.remove_nth(index, addends);
			SubLObject permuted_numerator = (NIL != list_utilities.form_with_operator_p(addend, $const7$QuotientFn))
					? make_quotient(make_multiplication(append(list(conses_high.second(addend)), rest_addends)),
							conses_high.third(addend))
					: make_multiplication(addends);
			SubLObject permutation2 = make_equation(other, permuted_numerator);
			permutations = cons(permutation2, permutations);
		}
		return Sequences.nreverse(permutations);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 9200L)
	public static SubLObject equation_permutations_from_division(SubLObject division, SubLObject other) {
		list_utilities.verify_form_with_operator(division, $const7$QuotientFn);
		SubLObject current;
		SubLObject datum = current = cycl_utilities.formula_args(division, UNPROVIDED);
		SubLObject numerator = NIL;
		SubLObject denominator = NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
		numerator = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
		denominator = current.first();
		current = current.rest();
		if (NIL == current) {
			SubLObject permuted1 = make_multiplication(list(other, denominator));
			SubLObject permuted2 = make_quotient(numerator, other);
			SubLObject permutation1 = make_equation(numerator, permuted1);
			SubLObject permutation2 = make_equation(denominator, permuted2);
			return list(permutation1, permutation2);
		}
		cdestructuring_bind.cdestructuring_bind_error(datum, $list13);
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 9800L)
	public static SubLObject equation_permutations_from_natural_log(SubLObject log_formula, SubLObject other) {
		list_utilities.verify_form_with_operator(log_formula, $const8$LogFn);
		SubLObject v_term = cycl_utilities.formula_arg1(log_formula, ONE_INTEGER);
		SubLObject permuted = el_utilities.make_unary_formula($const9$ExpFn, other);
		SubLObject permutation = make_equation(v_term, permuted);
		return list(permutation);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10200L)
	public static SubLObject equation_permutations_from_natural_exp(SubLObject exp_formula, SubLObject other) {
		list_utilities.verify_form_with_operator(exp_formula, $const9$ExpFn);
		SubLObject v_term = cycl_utilities.formula_arg1(exp_formula, ONE_INTEGER);
		SubLObject permuted = el_utilities.make_unary_formula($const8$LogFn, other);
		SubLObject permutation = make_equation(v_term, permuted);
		return list(permutation);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10600L)
	public static SubLObject make_equation(SubLObject expression1, SubLObject expression2) {
		return el_utilities.make_binary_formula($const0$numericallyEquals, expression1, expression2);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10800L)
	public static SubLObject make_commutative_formula(SubLObject relation, SubLObject args) {
		args = kb_utilities.sort_terms(args, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return el_utilities.make_formula(relation, args, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 10900L)
	public static SubLObject make_symmetric_formula(SubLObject relation, SubLObject arg1, SubLObject arg2) {
		return make_commutative_formula(relation, list(arg1, arg2));
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 11000L)
	public static SubLObject make_associative_commutative_formula(SubLObject operator, SubLObject args) {
		SubLObject final_args = NIL;
		SubLObject cdolist_list_var = args;
		SubLObject arg = NIL;
		arg = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != el_utilities.el_formula_with_operator_p(arg, operator)) {
				SubLObject cdolist_list_var_$1;
				SubLObject sub_args = cdolist_list_var_$1 = cycl_utilities.formula_args(arg, UNPROVIDED);
				SubLObject sub_arg = NIL;
				sub_arg = cdolist_list_var_$1.first();
				while (NIL != cdolist_list_var_$1) {
					final_args = cons(sub_arg, final_args);
					cdolist_list_var_$1 = cdolist_list_var_$1.rest();
					sub_arg = cdolist_list_var_$1.first();
				}
			} else {
				final_args = cons(arg, final_args);
			}
			cdolist_list_var = cdolist_list_var.rest();
			arg = cdolist_list_var.first();
		}
		if (NIL != list_utilities.singletonP(final_args))
			return final_args.first();
		return make_commutative_formula(operator, final_args);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 11600L)
	public static SubLObject make_separator_formula(SubLObject operator, SubLObject arg1, SubLObject arg2,
			SubLObject aggregator) {
		if (NIL != el_utilities.el_formula_with_operator_p(arg1, operator)) {
			SubLObject sub_arg1 = cycl_utilities.formula_arg1(arg1, UNPROVIDED);
			SubLObject sub_arg2 = cycl_utilities.formula_arg2(arg1, UNPROVIDED);
			SubLObject new_arg2 = Functions.funcall(aggregator, list(sub_arg2, arg2));
			return make_separator_formula(operator, sub_arg1, new_arg2, aggregator);
		}
		return el_utilities.make_binary_formula(operator, arg1, arg2);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12200L)
	public static SubLObject make_addition(SubLObject addends) {
		return make_associative_commutative_formula($const4$PlusFn, addends);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12400L)
	public static SubLObject make_multiplication(SubLObject products) {
		return make_associative_commutative_formula($const6$TimesFn, products);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12600L)
	public static SubLObject make_difference(SubLObject minuend, SubLObject subtrahend) {
		return make_separator_formula($const5$DifferenceFn, minuend, subtrahend, $sym14$MAKE_ADDITION);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-equation-permutations.lisp", position = 12900L)
	public static SubLObject make_quotient(SubLObject numerator, SubLObject denominator) {
		return make_separator_formula($const7$QuotientFn, numerator, denominator, $sym15$MAKE_MULTIPLICATION);
	}

	public static SubLObject declare_removal_modules_equation_permutations_file() {
		declareFunction("cycl_equation_p", "CYCL-EQUATION-P", 1, 0, false);
		declareFunction("equation_permutations", "EQUATION-PERMUTATIONS", 1, 0, false);
		declareFunction("equation_canonical_permutations", "EQUATION-CANONICAL-PERMUTATIONS", 1, 0, false);
		declareFunction("equation_has_canonical_permutationP", "EQUATION-HAS-CANONICAL-PERMUTATION?", 2, 0,
				false);
		declareFunction("equation_canonical_permutationP", "EQUATION-CANONICAL-PERMUTATION?", 1, 0, false);
		declareFunction("equation_immediate_permutations", "EQUATION-IMMEDIATE-PERMUTATIONS", 1, 0, false);
		declareFunction("equation_permutable_operator_p", "EQUATION-PERMUTABLE-OPERATOR-P", 1, 0, false);
		declareFunction("equation_permutations_from_addition", "EQUATION-PERMUTATIONS-FROM-ADDITION", 2, 0,
				false);
		declareFunction("equation_permutations_from_subtraction", "EQUATION-PERMUTATIONS-FROM-SUBTRACTION", 2,
				0, false);
		declareFunction("equation_permutations_from_multiplication",
				"EQUATION-PERMUTATIONS-FROM-MULTIPLICATION", 2, 0, false);
		declareFunction("equation_permutations_from_division", "EQUATION-PERMUTATIONS-FROM-DIVISION", 2, 0,
				false);
		declareFunction("equation_permutations_from_natural_log", "EQUATION-PERMUTATIONS-FROM-NATURAL-LOG", 2,
				0, false);
		declareFunction("equation_permutations_from_natural_exp", "EQUATION-PERMUTATIONS-FROM-NATURAL-EXP", 2,
				0, false);
		declareFunction("make_equation", "MAKE-EQUATION", 2, 0, false);
		declareFunction("make_commutative_formula", "MAKE-COMMUTATIVE-FORMULA", 2, 0, false);
		declareFunction("make_symmetric_formula", "MAKE-SYMMETRIC-FORMULA", 3, 0, false);
		declareFunction("make_associative_commutative_formula", "MAKE-ASSOCIATIVE-COMMUTATIVE-FORMULA", 2, 0,
				false);
		declareFunction("make_separator_formula", "MAKE-SEPARATOR-FORMULA", 4, 0, false);
		declareFunction("make_addition", "MAKE-ADDITION", 1, 0, false);
		declareFunction("make_multiplication", "MAKE-MULTIPLICATION", 1, 0, false);
		declareFunction("make_difference", "MAKE-DIFFERENCE", 2, 0, false);
		declareFunction("make_quotient", "MAKE-QUOTIENT", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_equation_permutations_file() {
		$equation_permutable_operators$ = deflexical("*EQUATION-PERMUTABLE-OPERATORS*", $list11);
		$equation_permutations_defining_mt$ = deflexical("*EQUATION-PERMUTATIONS-DEFINING-MT*",
				maybeDefault($sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_, $equation_permutations_defining_mt$,
						$const19$UniversalVocabularyMt));
		return NIL;
	}

	public static SubLObject setup_removal_modules_equation_permutations_file() {
		utilities_macros.note_funcall_helper_function($sym2$EQUATION_CANONICAL_PERMUTATION_);
		inference_modules.register_solely_specific_removal_module_predicate($const16$equationPermutations);
		preference_modules.doomed_unless_either_arg_bindable($kw$POS, $const16$equationPermutations);
		subl_macro_promotions.declare_defglobal($sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_);
		mt_vars.note_mt_var($sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_, $const16$equationPermutations);
		inference_modules.inference_removal_module($kw$REMOVAL_EQUATION_PERMUTATIONS_CHECK, $list21);
		inference_modules.inference_removal_module($kw$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY, $list23);
		inference_modules.inference_removal_module($kw$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY, $list25);
		generic_testing.define_test_case_table_int($sym26$EQUATION_PERMUTATIONS_FROM_ADDITION,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$TINY, $kw$WORKING_, T }),
				$list33);
		generic_testing.define_test_case_table_int($sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$TINY, $kw$WORKING_, T }),
				$list35);
		generic_testing.define_test_case_table_int($sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$TINY, $kw$WORKING_, T }),
				$list37);
		generic_testing.define_test_case_table_int($sym38$EQUATION_PERMUTATIONS_FROM_DIVISION,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$TINY, $kw$WORKING_, T }),
				$list39);
		generic_testing.define_test_case_table_int($sym40$EQUATION_IMMEDIATE_PERMUTATIONS,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$TINY, $kw$WORKING_, T }),
				$list41);
		generic_testing.define_test_case_table_int($sym42$EQUATION_CANONICAL_PERMUTATIONS,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list44);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_equation_permutations_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_equation_permutations_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_equation_permutations_file();
	}

	static {
		me = new removal_modules_equation_permutations();
		$equation_permutable_operators$ = null;
		$equation_permutations_defining_mt$ = null;
		$const0$numericallyEquals = constant_handles.reader_make_constant_shell(makeString("numericallyEquals"));
		$sym1$CYCL_EQUATION_P = makeSymbol("CYCL-EQUATION-P");
		$sym2$EQUATION_CANONICAL_PERMUTATION_ = makeSymbol("EQUATION-CANONICAL-PERMUTATION?");
		$list3 = list(makeSymbol("NUM-EQ"), makeSymbol("EXPRESSION1"), makeSymbol("EXPRESSION2"));
		$const4$PlusFn = constant_handles.reader_make_constant_shell(makeString("PlusFn"));
		$const5$DifferenceFn = constant_handles.reader_make_constant_shell(makeString("DifferenceFn"));
		$const6$TimesFn = constant_handles.reader_make_constant_shell(makeString("TimesFn"));
		$const7$QuotientFn = constant_handles.reader_make_constant_shell(makeString("QuotientFn"));
		$const8$LogFn = constant_handles.reader_make_constant_shell(makeString("LogFn"));
		$const9$ExpFn = constant_handles.reader_make_constant_shell(makeString("ExpFn"));
		$const10$The = constant_handles.reader_make_constant_shell(makeString("The"));
		$list11 = list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
				constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
				constant_handles.reader_make_constant_shell(makeString("TimesFn")),
				constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
				constant_handles.reader_make_constant_shell(makeString("LogFn")),
				constant_handles.reader_make_constant_shell(makeString("ExpFn")));
		$list12 = list(makeSymbol("MINUEND"), makeSymbol("SUBTRAHEND"));
		$list13 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));
		$sym14$MAKE_ADDITION = makeSymbol("MAKE-ADDITION");
		$sym15$MAKE_MULTIPLICATION = makeSymbol("MAKE-MULTIPLICATION");
		$const16$equationPermutations = constant_handles.reader_make_constant_shell(makeString("equationPermutations"));
		$kw$POS = makeKeyword("POS");
		$sym18$_EQUATION_PERMUTATIONS_DEFINING_MT_ = makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*");
		$const19$UniversalVocabularyMt = constant_handles
				.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
		$kw$REMOVAL_EQUATION_PERMUTATIONS_CHECK = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-CHECK");
		$list21 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
						list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
						list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
								list(makeKeyword("BIND"), makeSymbol("EQUATION")),
								list(makeKeyword("BIND"), makeSymbol("PERMUTATION"))),
						list(list(makeKeyword("VALUE"), makeSymbol("EQUATION")),
								list(makeKeyword("VALUE"), makeSymbol("PERMUTATION")))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("TUPLE"), list(makeSymbol("EQUATION"), makeSymbol("PERMUTATION")),
						list(makeKeyword("CALL"), makeSymbol("EQUATION-HAS-CANONICAL-PERMUTATION-P"),
								list(makeKeyword("VALUE"), makeSymbol("EQUATION")),
								list(makeKeyword("VALUE"), makeSymbol("PERMUTATION")))),
				makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$equationPermutations \n  (#$numericallyEquals <bound> <bound>)\n  (#$numericallyEquals <bound> <bound>))"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });
		$kw$REMOVAL_EQUATION_PERMUTATIONS_ARG1_UNIFY = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG1-UNIFY");
		$list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
						makeKeyword("NOT-FULLY-BOUND"),
						list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))),
				makeKeyword("COST-EXPRESSION"), TWENTY_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
								makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("EQUATION"))),
						list(makeKeyword("VALUE"), makeSymbol("EQUATION"))),
				makeKeyword("INPUT-VERIFY-PATTERN"),
				list(makeKeyword("TEST"), makeSymbol("EQUATION-CANONICAL-PERMUTATION?")),
				makeKeyword("OUTPUT-GENERATE-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("EQUATION-PERMUTATIONS"), makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
						makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("EQUATION"))),
				makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString("(#$equationPermutations  <whatever> (#$numericallyEquals <bound> <bound>))"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$equationPermutations \n  ?EQUATION \n  (#$numericallyEquals :PRESSURE (#$QuotientFn (#$TimesFn :MOLARITY :R :TEMPERATURE) :VOLUME)))") });
		$kw$REMOVAL_EQUATION_PERMUTATIONS_ARG2_UNIFY = makeKeyword("REMOVAL-EQUATION-PERMUTATIONS-ARG2-UNIFY");
		$list25 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
						list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
						makeKeyword("ANYTHING")),
				makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"),
				makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
								list(makeKeyword("BIND"), makeSymbol("EQUATION")), makeKeyword("ANYTHING")),
						list(makeKeyword("VALUE"), makeSymbol("EQUATION"))),
				makeKeyword("OUTPUT-GENERATE-PATTERN"),
				ConsesLow
						.list(makeKeyword("CALL"), makeSymbol("EQUATION-CANONICAL-PERMUTATIONS"), makeKeyword("INPUT")),
				makeKeyword("OUTPUT-CONSTRUCT-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("equationPermutations")),
						list(makeKeyword("VALUE"), makeSymbol("EQUATION")), makeKeyword("INPUT")),
				makeKeyword("SUPPORT-STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("SUPPORT-MT"),
				makeSymbol("*EQUATION-PERMUTATIONS-DEFINING-MT*"), makeKeyword("DOCUMENTATION"),
				makeString("(#$equationPermutations (#$numericallyEquals <bound> <bound>) <whatever>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$equationPermutations\n  (#$numericallyEquals (#$TimesFn :PRESSURE :VOLUME) (#$TimesFn :MOLARITY :R :TEMPERATURE))\n  ?PERMUTED)") });
		$sym26$EQUATION_PERMUTATIONS_FROM_ADDITION = makeSymbol("EQUATION-PERMUTATIONS-FROM-ADDITION");
		$kw$TEST = makeKeyword("TEST");
		$kw$OWNER = makeKeyword("OWNER");
		$kw$CLASSES = makeKeyword("CLASSES");
		$kw$KB = makeKeyword("KB");
		$kw$TINY = makeKeyword("TINY");
		$kw$WORKING_ = makeKeyword("WORKING?");
		$list33 = list(
				list(list(list(constant_handles.reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"),
						makeKeyword("B")), makeKeyword("OTHER")),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("A"),
								list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
										makeKeyword("OTHER"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
												makeKeyword("OTHER"), makeKeyword("A"))))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"),
						makeKeyword("B"), makeKeyword("C")), makeKeyword("OTHER")),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("A"),
								list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
												makeKeyword("B"), makeKeyword("C")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
												makeKeyword("OTHER"),
												list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
														makeKeyword("A"), makeKeyword("C")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("C"),
										list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
												makeKeyword("OTHER"),
												list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
														makeKeyword("A"), makeKeyword("B")))))));
		$sym34$EQUATION_PERMUTATIONS_FROM_SUBTRACTION = makeSymbol("EQUATION-PERMUTATIONS-FROM-SUBTRACTION");
		$list35 = list(list(
				list(list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"),
						makeKeyword("B")), makeKeyword("OTHER")),
				list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						makeKeyword("A"),
						list(constant_handles.reader_make_constant_shell(makeString("PlusFn")), makeKeyword("B"),
								makeKeyword("OTHER"))),
						list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("B"),
								list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
										makeKeyword("A"), makeKeyword("OTHER"))))));
		$sym36$EQUATION_PERMUTATIONS_FROM_MULTIPLICATION = makeSymbol("EQUATION-PERMUTATIONS-FROM-MULTIPLICATION");
		$list37 = list(
				list(list(list(constant_handles.reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"),
						makeKeyword("B")), makeKeyword("OTHER")),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("A"),
								list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
										makeKeyword("OTHER"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("OTHER"), makeKeyword("A"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"))))),
				list(ConsesLow.list(list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
						makeKeyword("A"), makeKeyword("B"), makeKeyword("C")), makeKeyword("OTHER")),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("A"),
								list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("B"), makeKeyword("C")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"), makeKeyword("C"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("OTHER"),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("A"), makeKeyword("C")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"), makeKeyword("C"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("C"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("OTHER"),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("A"), makeKeyword("B")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"), makeKeyword("C"))))));
		$sym38$EQUATION_PERMUTATIONS_FROM_DIVISION = makeSymbol("EQUATION-PERMUTATIONS-FROM-DIVISION");
		$list39 = list(list(
				list(list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"),
						makeKeyword("B")), makeKeyword("OTHER")),
				list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						makeKeyword("A"),
						list(constant_handles.reader_make_constant_shell(makeString("TimesFn")), makeKeyword("B"),
								makeKeyword("OTHER"))),
						list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("B"),
								list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
										makeKeyword("A"), makeKeyword("OTHER"))))));
		$sym40$EQUATION_IMMEDIATE_PERMUTATIONS = makeSymbol("EQUATION-IMMEDIATE-PERMUTATIONS");
		$list41 = list(
				list(list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						list(constant_handles.reader_make_constant_shell(makeString("PlusFn")), makeKeyword("A"),
								makeKeyword("B")),
						makeKeyword("OTHER"))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("OTHER"),
								list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
										makeKeyword("A"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("A"),
										list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
												makeKeyword("OTHER"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
												makeKeyword("OTHER"), makeKeyword("A"))))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")), makeKeyword("A"),
								makeKeyword("B")),
						makeKeyword("OTHER"))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("OTHER"),
								list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
										makeKeyword("A"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("A"),
										list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
												makeKeyword("B"), makeKeyword("OTHER"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("DifferenceFn")),
												makeKeyword("A"), makeKeyword("OTHER"))))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						list(constant_handles.reader_make_constant_shell(makeString("TimesFn")), makeKeyword("A"),
								makeKeyword("B")),
						makeKeyword("OTHER"))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("OTHER"),
								list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
										makeKeyword("A"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("A"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("OTHER"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("OTHER"), makeKeyword("A"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("OTHER"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("A"), makeKeyword("B"))))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")), makeKeyword("A"),
								makeKeyword("B")),
						makeKeyword("OTHER"))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("OTHER"),
								list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
										makeKeyword("A"), makeKeyword("B"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("A"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("B"), makeKeyword("OTHER"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("B"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("A"), makeKeyword("OTHER"))))));
		$sym42$EQUATION_CANONICAL_PERMUTATIONS = makeSymbol("EQUATION-CANONICAL-PERMUTATIONS");
		$kw$FULL = makeKeyword("FULL");
		$list44 = list(
				list(list(list(
						constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						list(constant_handles.reader_make_constant_shell(makeString("The")),
								constant_handles.reader_make_constant_shell(makeString("ElectricalResistance"))),
						list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
								list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("The")),
												constant_handles.reader_make_constant_shell(makeString("Length"))),
										list(constant_handles.reader_make_constant_shell(makeString("The")),
												constant_handles
														.reader_make_constant_shell(makeString("BulkResistance")))),
								list(constant_handles.reader_make_constant_shell(makeString("The")),
										constant_handles.reader_make_constant_shell(makeString("Area")))))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								list(constant_handles.reader_make_constant_shell(makeString("The")),
										constant_handles.reader_make_constant_shell(makeString("Length"))),
								list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												list(constant_handles.reader_make_constant_shell(makeString("The")),
														constant_handles.reader_make_constant_shell(
																makeString("ElectricalResistance"))),
												list(constant_handles.reader_make_constant_shell(makeString("The")),
														constant_handles
																.reader_make_constant_shell(makeString("Area")))),
										list(constant_handles.reader_make_constant_shell(makeString("The")),
												constant_handles
														.reader_make_constant_shell(makeString("BulkResistance"))))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										ConsesLow.list(constant_handles
												.reader_make_constant_shell(makeString("The")),
												constant_handles.reader_make_constant_shell(
														makeString("ElectricalResistance"))),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														list(constant_handles
																.reader_make_constant_shell(makeString("The")),
																constant_handles.reader_make_constant_shell(
																		makeString("Length"))),
														list(constant_handles
																.reader_make_constant_shell(makeString("The")),
																constant_handles.reader_make_constant_shell(
																		makeString("BulkResistance")))),
												list(constant_handles.reader_make_constant_shell(makeString("The")),
														constant_handles
																.reader_make_constant_shell(makeString("Area"))))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										ConsesLow.list(constant_handles
												.reader_make_constant_shell(makeString("The")),
												constant_handles.reader_make_constant_shell(makeString("Area"))),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														list(constant_handles
																.reader_make_constant_shell(makeString("The")),
																constant_handles.reader_make_constant_shell(
																		makeString("Length"))),
														list(constant_handles
																.reader_make_constant_shell(makeString("The")),
																constant_handles.reader_make_constant_shell(
																		makeString("BulkResistance")))),
												list(constant_handles
														.reader_make_constant_shell(makeString("The")),
														constant_handles.reader_make_constant_shell(
																makeString("ElectricalResistance"))))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										list(constant_handles.reader_make_constant_shell(makeString("The")),
												constant_handles
														.reader_make_constant_shell(makeString("BulkResistance"))),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														list(constant_handles
																.reader_make_constant_shell(makeString("The")),
																constant_handles.reader_make_constant_shell(
																		makeString("ElectricalResistance"))),
														list(constant_handles
																.reader_make_constant_shell(makeString("The")),
																constant_handles.reader_make_constant_shell(
																		makeString("Area")))),
												list(constant_handles.reader_make_constant_shell(makeString("The")),
														constant_handles
																.reader_make_constant_shell(makeString("Length"))))))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
								makeKeyword("PRESSURE"), makeKeyword("VOLUME")),
						list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
								makeKeyword("MOLARITY"), makeKeyword("R"), makeKeyword("TEMPERATURE")))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("MOLARITY"),
								list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("PRESSURE"), makeKeyword("VOLUME")),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeKeyword("R"), makeKeyword("TEMPERATURE")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("PRESSURE"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("MOLARITY"), makeKeyword("R"),
														makeKeyword("TEMPERATURE")),
												makeKeyword("VOLUME"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("R"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("PRESSURE"), makeKeyword("VOLUME")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("MOLARITY"), makeKeyword("TEMPERATURE")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("TEMPERATURE"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("PRESSURE"), makeKeyword("VOLUME")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("MOLARITY"), makeKeyword("R")))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("VOLUME"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("MOLARITY"), makeKeyword("R"),
														makeKeyword("TEMPERATURE")),
												makeKeyword("PRESSURE"))))),
				list(list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
						makeKeyword("BILL-PLUS-TIP"),
						list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
								makeKeyword("BILL-ABOUT"),
								list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
										makeKeyword("BILL-ABOUT"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												makeKeyword("TIP-PERCENT"), makeInteger(100)))))),
						list(list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
								makeKeyword("BILL-PLUS-TIP"),
								list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
										makeKeyword("BILL-ABOUT"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("BILL-ABOUT"), makeKeyword("TIP-PERCENT")),
												makeInteger(100)))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("BILL-PLUS-TIP"),
										list(constant_handles.reader_make_constant_shell(makeString("PlusFn")),
												makeKeyword("BILL-ABOUT"),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeKeyword("BILL-ABOUT"),
														list(constant_handles
																.reader_make_constant_shell(makeString("QuotientFn")),
																makeKeyword("TIP-PERCENT"), makeInteger(100))))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("TIP-PERCENT"),
										list(constant_handles.reader_make_constant_shell(makeString("QuotientFn")),
												list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
														makeInteger(100),
														list(constant_handles
																.reader_make_constant_shell(makeString("DifferenceFn")),
																makeKeyword("BILL-PLUS-TIP"),
																makeKeyword("BILL-ABOUT"))),
												makeKeyword("BILL-ABOUT"))),
								list(constant_handles.reader_make_constant_shell(makeString("numericallyEquals")),
										makeKeyword("TIP-PERCENT"),
										list(constant_handles.reader_make_constant_shell(makeString("TimesFn")),
												makeInteger(100),
												list(constant_handles
														.reader_make_constant_shell(makeString("QuotientFn")),
														list(constant_handles
																.reader_make_constant_shell(makeString("DifferenceFn")),
																makeKeyword("BILL-PLUS-TIP"),
																makeKeyword("BILL-ABOUT")),
														makeKeyword("BILL-ABOUT")))))));
	}
}
/*
 *
 * Total time: 238 ms
 *
 */