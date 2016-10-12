/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class math_utilities extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new math_utilities();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities";
	@SubL(source = "sublisp/math-utilities.lisp", position = 1065)
	private static SubLSymbol $bell_double_precision_bits$ = null;

	//// Definitions

	@SubL(source = "sublisp/math-utilities.lisp", position = 1488)
	private static SubLSymbol $bell_extended_precision_bits$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 1591)
	private static SubLSymbol $bell_2_expt_p$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 1754)
	private static SubLSymbol $bell_2_expt_p_1$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 1865)
	private static SubLSymbol $bell_2_expt_p_n$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 2002)
	private static SubLSymbol $bell_2_expt_p_n_1$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 2150)
	private static SubLSymbol $bell_2_expt_n$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 2246)
	private static SubLSymbol $bell_2_expt_n_1$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 2354)
	private static SubLSymbol $bell_log5_of_2_expt_n$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 2483)
	private static SubLSymbol $bell_exp_table_lookup_limit$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 4838)
	private static SubLSymbol $bell_delta$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 4886)
	private static SubLSymbol $bell_beta$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 4967)
	private static SubLSymbol $bell_beta_expt_n_1$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 5133)
	private static SubLSymbol $bell_beta_significand$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 5169)
	private static SubLSymbol $bell_beta_exponent$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 5202)
	private static SubLSymbol $bell_delta_significand$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 5239)
	private static SubLSymbol $bell_delta_exponent$ = null;

	@SubL(source = "sublisp/math-utilities.lisp", position = 5273)
	private static SubLSymbol $bell_approximation_float$ = null;

	public static SubLInteger $int0$53 = SubLObjectFactory.makeInteger(53);

	public static SubLInteger $int1$64 = SubLObjectFactory.makeInteger(64);

	public static SubLInteger $int2$18446744073709551616 = SubLObjectFactory.makeInteger("18446744073709551616");

	public static SubLInteger $int3$9223372036854775808 = SubLObjectFactory.makeInteger("9223372036854775808");

	public static SubLInteger $int4$2048 = SubLObjectFactory.makeInteger(2048);

	public static SubLInteger $int5$1024 = SubLObjectFactory.makeInteger(1024);

	public static SubLInteger $int6$9007199254740992 = SubLObjectFactory.makeInteger("9007199254740992");

	public static SubLInteger $int7$4503599627370496 = SubLObjectFactory.makeInteger("4503599627370496");

	public static SubLInteger $int8$23 = SubLObjectFactory.makeInteger(23);

	public static SubLInteger $int9$17976931348623157 = SubLObjectFactory.makeInteger("17976931348623157");

	public static SubLInteger $int10$292 = SubLObjectFactory.makeInteger(292);

	public static SubLInteger $int11$30 = SubLObjectFactory.makeInteger(30);

	public static SubLInteger $int12$_300 = SubLObjectFactory.makeInteger(-300);

	public static SubLSymbol $sym13$__ = SubLObjectFactory.makeSymbol("<=");

	public static SubLSymbol $sym14$_ = SubLObjectFactory.makeSymbol("<");

	public static SubLSymbol $sym15$__ = SubLObjectFactory.makeSymbol(">=");

	//// Internal Constants

	public static SubLSymbol $sym16$_ = SubLObjectFactory.makeSymbol(">");

	@SubL(source = "sublisp/math-utilities.lisp", position = 5491)
	public static SubLObject bell_compare(SubLObject x, SubLObject y) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = CommonSymbols.NIL;
				SubLObject flag = CommonSymbols.NIL;
				SubLObject d = Numbers.subtract(x, y);
				SubLObject d2 = Numbers.multiply(CommonSymbols.TWO_INTEGER,
						math_utilities.$bell_beta_significand$.getDynamicValue(thread), Numbers.abs(d));
				if (d2.numL(y)) {
					if (math_utilities.$bell_beta_significand$.getDynamicValue(thread).numE(
							math_utilities.$bell_beta_expt_n_1$.getGlobalValue()) && d.numL(CommonSymbols.ZERO_INTEGER)
							&& Numbers.multiply(math_utilities.$bell_beta$.getGlobalValue(), d2).numG(y)) {
						result = math_utilities
								.bell_prev_float(math_utilities.$bell_approximation_float$.getDynamicValue(thread));
						flag = CommonSymbols.ZERO_INTEGER;
					} else {
						result = math_utilities.$bell_approximation_float$.getDynamicValue(thread);
						flag = CommonSymbols.ONE_INTEGER;
					}
				} else if (d2.numE(y)) {
					if (CommonSymbols.NIL != Numbers
							.evenp(math_utilities.$bell_beta_significand$.getDynamicValue(thread))) {
						if (math_utilities.$bell_beta_significand$.getDynamicValue(thread)
								.numE(math_utilities.$bell_beta_expt_n_1$.getGlobalValue())
								&& d.numL(CommonSymbols.ZERO_INTEGER)) {
							result = math_utilities
									.bell_prev_float(math_utilities.$bell_approximation_float$.getDynamicValue(thread));
							flag = CommonSymbols.ZERO_INTEGER;
						} else {
							result = math_utilities.$bell_approximation_float$.getDynamicValue(thread);
							flag = CommonSymbols.ONE_INTEGER;
						}
					} else if (d.numL(CommonSymbols.ZERO_INTEGER)) {
						result = math_utilities
								.bell_prev_float(math_utilities.$bell_approximation_float$.getDynamicValue(thread));
						flag = CommonSymbols.ONE_INTEGER;
					} else if (d.numG(CommonSymbols.ZERO_INTEGER)) {
						result = math_utilities
								.bell_next_float(math_utilities.$bell_approximation_float$.getDynamicValue(thread));
						flag = CommonSymbols.ONE_INTEGER;
					}
				} else if (d.numL(CommonSymbols.ZERO_INTEGER)) {
					result = math_utilities
							.bell_prev_float(math_utilities.$bell_approximation_float$.getDynamicValue(thread));
					flag = CommonSymbols.ZERO_INTEGER;
				} else if (d.numG(CommonSymbols.ZERO_INTEGER)) {
					result = math_utilities
							.bell_next_float(math_utilities.$bell_approximation_float$.getDynamicValue(thread));
					flag = CommonSymbols.ZERO_INTEGER;
				}
				return Values.values(result, flag);
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 5312)
	public static SubLObject bell_fail(SubLObject f0, SubLObject e0, SubLObject z0) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = math_utilities.$bell_delta_significand$.currentBinding(thread);
					SubLObject _prev_bind_1 = math_utilities.$bell_delta_exponent$.currentBinding(thread);
					try {
						math_utilities.$bell_delta_significand$.bind(f0, thread);
						math_utilities.$bell_delta_exponent$.bind(e0, thread);
						result = math_utilities.bell_fail_loop(z0);
					} finally {
						math_utilities.$bell_delta_exponent$.rebind(_prev_bind_1, thread);
						math_utilities.$bell_delta_significand$.rebind(_prev_bind_0, thread);
					}
				}
				return result;
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 6699)
	public static SubLObject bell_fail_loop(SubLObject z0) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject result = CommonSymbols.NIL;
				SubLObject flag = CommonSymbols.NIL;
				{
					SubLObject _prev_bind_0 = math_utilities.$bell_approximation_float$.currentBinding(thread);
					SubLObject _prev_bind_1 = math_utilities.$bell_beta_significand$.currentBinding(thread);
					SubLObject _prev_bind_2 = math_utilities.$bell_beta_exponent$.currentBinding(thread);
					try {
						math_utilities.$bell_approximation_float$.bind(z0, thread);
						math_utilities.$bell_beta_significand$.bind(math_utilities.bell_float_significand(
								math_utilities.$bell_approximation_float$.getDynamicValue(thread)), thread);
						math_utilities.$bell_beta_exponent$.bind(math_utilities.bell_float_exponent(
								math_utilities.$bell_approximation_float$.getDynamicValue(thread)), thread);
						if (math_utilities.$bell_delta_exponent$.getDynamicValue(thread)
								.numGE(CommonSymbols.ZERO_INTEGER)
								&& math_utilities.$bell_beta_exponent$.getDynamicValue(thread)
										.numGE(CommonSymbols.ZERO_INTEGER)) {
							thread.resetMultipleValues();
							{
								SubLObject r1 = math_utilities
										.bell_compare(
												Numbers.multiply(
														math_utilities.$bell_delta_significand$.getDynamicValue(thread),
														Numbers.expt(
																math_utilities.$bell_delta$.getGlobalValue(),
																math_utilities.$bell_delta_exponent$
																		.getDynamicValue(thread))),
												Numbers.multiply(
														math_utilities.$bell_beta_significand$.getDynamicValue(thread),
														Numbers.expt(math_utilities.$bell_beta$.getGlobalValue(),
																math_utilities.$bell_beta_exponent$
																		.getDynamicValue(thread))));
								SubLObject r2 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								result = r1;
								flag = r2;
							}
						} else if (math_utilities.$bell_delta_exponent$.getDynamicValue(thread)
								.numGE(CommonSymbols.ZERO_INTEGER)
								&& math_utilities.$bell_beta_exponent$.getDynamicValue(thread)
										.numL(CommonSymbols.ZERO_INTEGER)) {
							thread.resetMultipleValues();
							{
								SubLObject r1 = math_utilities.bell_compare(
										Numbers.multiply(
												math_utilities.$bell_delta_significand$.getDynamicValue(thread),
												Numbers.expt(math_utilities.$bell_delta$.getGlobalValue(),
														math_utilities.$bell_delta_exponent$.getDynamicValue(thread)),
												Numbers.expt(math_utilities.$bell_beta$.getGlobalValue(),
														Numbers.minus(math_utilities.$bell_beta_exponent$
																.getDynamicValue(thread)))),
										math_utilities.$bell_beta_significand$.getDynamicValue(thread));
								SubLObject r2 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								result = r1;
								flag = r2;
							}
						} else if (math_utilities.$bell_delta_exponent$.getDynamicValue(thread)
								.numL(CommonSymbols.ZERO_INTEGER)
								&& math_utilities.$bell_beta_exponent$.getDynamicValue(thread)
										.numGE(CommonSymbols.ZERO_INTEGER)) {
							thread.resetMultipleValues();
							{
								SubLObject r1 = math_utilities.bell_compare(
										math_utilities.$bell_delta_significand$.getDynamicValue(thread),
										Numbers.multiply(math_utilities.$bell_beta_significand$.getDynamicValue(thread),
												Numbers.expt(math_utilities.$bell_beta$.getGlobalValue(),
														math_utilities.$bell_beta_exponent$.getDynamicValue(thread)),
												Numbers.expt(math_utilities.$bell_delta$.getGlobalValue(),
														Numbers.minus(math_utilities.$bell_delta_exponent$
																.getDynamicValue(thread)))));
								SubLObject r2 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								result = r1;
								flag = r2;
							}
						} else if (math_utilities.$bell_delta_exponent$.getDynamicValue(thread)
								.numL(CommonSymbols.ZERO_INTEGER)
								&& math_utilities.$bell_beta_exponent$.getDynamicValue(thread)
										.numL(CommonSymbols.ZERO_INTEGER)) {
							thread.resetMultipleValues();
							{
								SubLObject r1 = math_utilities.bell_compare(
										Numbers.multiply(
												math_utilities.$bell_delta_significand$.getDynamicValue(thread),
												Numbers.expt(math_utilities.$bell_beta$.getGlobalValue(),
														Numbers.minus(math_utilities.$bell_beta_exponent$
																.getDynamicValue(thread)))),
										Numbers.multiply(math_utilities.$bell_beta_significand$.getDynamicValue(thread),
												Numbers.expt(math_utilities.$bell_delta$.getGlobalValue(),
														Numbers.minus(math_utilities.$bell_delta_exponent$
																.getDynamicValue(thread)))));
								SubLObject r2 = thread.secondMultipleValue();
								thread.resetMultipleValues();
								result = r1;
								flag = r2;
							}
						}
					} finally {
						math_utilities.$bell_beta_exponent$.rebind(_prev_bind_2, thread);
						math_utilities.$bell_beta_significand$.rebind(_prev_bind_1, thread);
						math_utilities.$bell_approximation_float$.rebind(_prev_bind_0, thread);
					}
				}
				if (flag.numE(CommonSymbols.ZERO_INTEGER))
					return math_utilities.bell_fail_loop(result);
				else
					return result;
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 2793)
	public static SubLObject bell_float_exponent(SubLObject x) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject r1 = Numbers.integer_decode_float(x);
				SubLObject r2 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return r2;
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 2675)
	public static SubLObject bell_float_significand(SubLObject x) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject r1 = Numbers.integer_decode_float(x);
				SubLObject r2 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				return r1;
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 3778)
	public static SubLObject bell_multiply_and_test(SubLObject f, SubLObject e) {
		{
			SubLObject result = CommonSymbols.NIL;
			if (f.numG(Numbers.multiply(math_utilities.$int9$17976931348623157,
					Numbers.expt(CommonSymbols.TEN_INTEGER, math_utilities.$int10$292)))) {
				SubLObject num_digits = Numbers.ceiling(Numbers.log(f, CommonSymbols.TEN_INTEGER),
						CommonSymbols.UNPROVIDED);
				SubLObject f_new = Numbers.round(
						Numbers.divide(f,
								Numbers.expt(CommonSymbols.TEN_INTEGER,
										Numbers.subtract(num_digits, math_utilities.$int11$30))),
						CommonSymbols.UNPROVIDED);
				SubLObject e_new = Numbers.add(e, Numbers.subtract(num_digits, math_utilities.$int11$30));
				SubLObject z = Numbers.multiply(f_new, math_utilities.bell_ten_to_e(e_new));
				result = math_utilities.bell_fail(f, e, z);
			} else {
				SubLObject x = Numbers.sublisp_float(f, CommonSymbols.UNPROVIDED);
				SubLObject y = e.numL(math_utilities.$int12$_300)
						? (SubLObject) math_utilities.bell_ten_to_e(Numbers.ceiling(e, CommonSymbols.TWO_INTEGER))
						: math_utilities.bell_ten_to_e(e);
				SubLObject y2 = e.numL(math_utilities.$int12$_300)
						? (SubLObject) math_utilities.bell_ten_to_e(Numbers.floor(e, CommonSymbols.TWO_INTEGER))
						: CommonSymbols.ONE_INTEGER;
				SubLObject z = Numbers.multiply(Numbers.multiply(x, y), y2);
				result = math_utilities.bell_fail(f, e, z);
			}
			return result;
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 2906)
	public static SubLObject bell_next_float(SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject x = Numbers.sublisp_float(arg, CommonSymbols.UNPROVIDED);
				if (x.numGE(CommonSymbols.ZERO_INTEGER)) {
					thread.resetMultipleValues();
					{
						SubLObject significand = Numbers.integer_decode_float(x);
						SubLObject exponent = thread.secondMultipleValue();
						SubLObject sign = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						return Numbers.sublisp_float(Numbers.scale_float(
								Numbers.multiply(sign, Numbers.sublisp_float(
										Numbers.add(significand, CommonSymbols.ONE_INTEGER), CommonSymbols.UNPROVIDED)),
								exponent), CommonSymbols.UNPROVIDED);
					}
				} else {
					thread.resetMultipleValues();
					{
						SubLObject significand = Numbers.integer_decode_float(x);
						SubLObject exponent = thread.secondMultipleValue();
						SubLObject sign = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						return Numbers.sublisp_float(Numbers.scale_float(Numbers.multiply(sign, Numbers.sublisp_float(
								Numbers.subtract(significand, CommonSymbols.ONE_INTEGER), CommonSymbols.UNPROVIDED)),
								exponent), CommonSymbols.UNPROVIDED);
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 3342)
	public static SubLObject bell_prev_float(SubLObject arg) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject x = Numbers.sublisp_float(arg, CommonSymbols.UNPROVIDED);
				if (x.numGE(CommonSymbols.ZERO_INTEGER)) {
					thread.resetMultipleValues();
					{
						SubLObject significand = Numbers.integer_decode_float(x);
						SubLObject exponent = thread.secondMultipleValue();
						SubLObject sign = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						return Numbers.sublisp_float(Numbers.scale_float(Numbers.multiply(sign, Numbers.sublisp_float(
								Numbers.subtract(significand, CommonSymbols.ONE_INTEGER), CommonSymbols.UNPROVIDED)),
								exponent), CommonSymbols.UNPROVIDED);
					}
				} else {
					thread.resetMultipleValues();
					{
						SubLObject significand = Numbers.integer_decode_float(x);
						SubLObject exponent = thread.secondMultipleValue();
						SubLObject sign = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						return Numbers.sublisp_float(Numbers.scale_float(
								Numbers.multiply(sign, Numbers.sublisp_float(
										Numbers.add(significand, CommonSymbols.ONE_INTEGER), CommonSymbols.UNPROVIDED)),
								exponent), CommonSymbols.UNPROVIDED);
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 2528)
	public static SubLObject bell_ten_to_e(SubLObject e) {
		return Numbers.sublisp_float(Numbers.expt(CommonSymbols.TEN_INTEGER, e), CommonSymbols.UNPROVIDED);
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 4430)
	public static SubLObject bellerophon(SubLObject f, SubLObject e) {
		if (f.numL(math_utilities.$bell_2_expt_n$.getGlobalValue()) && e.numGE(CommonSymbols.ZERO_INTEGER)
				&& e.numL(math_utilities.$bell_exp_table_lookup_limit$.getGlobalValue())
				&& e.numL(math_utilities.$bell_log5_of_2_expt_n$.getGlobalValue()))
			return Numbers.multiply(Numbers.sublisp_float(f, CommonSymbols.UNPROVIDED),
					math_utilities.bell_ten_to_e(e));
		else if (f.numL(math_utilities.$bell_2_expt_n$.getGlobalValue()) && e.numL(CommonSymbols.ZERO_INTEGER)
				&& Numbers.minus(e).numL(math_utilities.$bell_exp_table_lookup_limit$.getGlobalValue())
				&& Numbers.minus(e).numL(math_utilities.$bell_log5_of_2_expt_n$.getGlobalValue()))
			return Numbers.divide(Numbers.sublisp_float(f, CommonSymbols.UNPROVIDED),
					math_utilities.bell_ten_to_e(Numbers.minus(e)));
		else
			return math_utilities.bell_multiply_and_test(f, e);
	}

	public static SubLObject declare_math_utilities_file() {
		SubLFiles.declareFunction(math_utilities.myName, "bell_ten_to_e", "BELL_TEN-TO-E", 1, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_float_significand", "BELL_FLOAT-SIGNIFICAND", 1, 0,
				false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_float_exponent", "BELL_FLOAT-EXPONENT", 1, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_next_float", "BELL_NEXT-FLOAT", 1, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_prev_float", "BELL_PREV-FLOAT", 1, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_multiply_and_test", "BELL_MULTIPLY-AND-TEST", 2, 0,
				false);
		SubLFiles.declareFunction(math_utilities.myName, "bellerophon", "BELLEROPHON", 2, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_fail", "BELL_FAIL", 3, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_compare", "BELL_COMPARE", 2, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "bell_fail_loop", "BELL_FAIL-LOOP", 1, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "fdl_generate", "FDL_GENERATE", 5, 0, false);
		SubLFiles.declareFunction(math_utilities.myName, "flonum_digit_list", "FLONUM-DIGIT-LIST", 1, 0, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 8303)
	public static SubLObject fdl_generate(SubLObject r, SubLObject s, SubLObject mX, SubLObject m_, SubLObject roundp) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			thread.resetMultipleValues();
			{
				SubLObject quotient = Numbers.truncate(Numbers.multiply(r, CommonSymbols.TEN_INTEGER), s);
				SubLObject remainder = thread.secondMultipleValue();
				thread.resetMultipleValues();
				mX = Numbers.multiply(mX, CommonSymbols.TEN_INTEGER);
				m_ = Numbers.multiply(m_, CommonSymbols.TEN_INTEGER);
				{
					SubLObject tc1 = Functions.funcall(
							CommonSymbols.NIL != roundp ? (SubLObject) Symbols.symbol_function(math_utilities.$sym13$__)
									: Symbols.symbol_function(math_utilities.$sym14$_),
							remainder, m_);
					SubLObject tc2 = Functions.funcall(
							CommonSymbols.NIL != roundp ? (SubLObject) Symbols.symbol_function(math_utilities.$sym15$__)
									: Symbols.symbol_function(math_utilities.$sym16$_),
							Numbers.add(remainder, mX), s);
					if (CommonSymbols.NIL != tc1) {
						if (CommonSymbols.NIL != tc2) {
							if (Numbers.multiply(remainder, CommonSymbols.TWO_INTEGER).numL(s))
								return ConsesLow.list(quotient);
							else
								return ConsesLow.list(Numbers.add(quotient, CommonSymbols.ONE_INTEGER));
						} else
							return ConsesLow.list(quotient);
					} else if (CommonSymbols.NIL != tc2)
						return ConsesLow.list(Numbers.add(quotient, CommonSymbols.ONE_INTEGER));
					else
						return ConsesLow.cons(quotient, math_utilities.fdl_generate(remainder, s, mX, m_, roundp));
				}
			}
		}
	}

	@SubL(source = "sublisp/math-utilities.lisp", position = 8967)
	public static SubLObject flonum_digit_list(SubLObject flonum) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			flonum = Numbers.sublisp_float(Numbers.abs(flonum), CommonSymbols.UNPROVIDED);
			if (flonum.isZero())
				return Values.values(CommonSymbols.NIL, CommonSymbols.ZERO_INTEGER);
			else {
				SubLObject radix = Numbers.float_radix(flonum);
				SubLObject digits = Numbers.float_digits(flonum);
				thread.resetMultipleValues();
				{
					SubLObject significand = Numbers.integer_decode_float(flonum);
					SubLObject exponent = thread.secondMultipleValue();
					SubLObject sign = thread.thirdMultipleValue();
					thread.resetMultipleValues();
					{
						SubLObject r = CommonSymbols.NIL;
						SubLObject s = CommonSymbols.NIL;
						SubLObject mX = CommonSymbols.NIL;
						SubLObject m_ = CommonSymbols.NIL;
						if (exponent.isNegative()) {
							if (exponent.numE(Numbers.$double_float_minimum_exponent$.getGlobalValue()) || !significand
									.numE(Numbers.expt(radix, Numbers.subtract(digits, CommonSymbols.ONE_INTEGER)))) {
								r = Numbers.multiply(significand, CommonSymbols.TWO_INTEGER);
								s = Numbers.multiply(Numbers.expt(radix, Numbers.minus(exponent)),
										CommonSymbols.TWO_INTEGER);
								mX = CommonSymbols.ONE_INTEGER;
								m_ = CommonSymbols.ONE_INTEGER;
							} else {
								r = Numbers.multiply(significand, radix, CommonSymbols.TWO_INTEGER);
								s = Numbers.multiply(
										Numbers.expt(radix,
												Numbers.add(Numbers.minus(exponent), CommonSymbols.ONE_INTEGER)),
										CommonSymbols.TWO_INTEGER);
								mX = radix;
								m_ = CommonSymbols.ONE_INTEGER;
							}
						} else if (significand
								.numE(Numbers.expt(radix, Numbers.subtract(digits, CommonSymbols.ONE_INTEGER)))) {
							r = Numbers.multiply(significand,
									Numbers.expt(radix, Numbers.add(exponent, CommonSymbols.ONE_INTEGER)),
									CommonSymbols.TWO_INTEGER);
							s = Numbers.multiply(radix, CommonSymbols.TWO_INTEGER);
							mX = Numbers.expt(radix, Numbers.add(exponent, CommonSymbols.ONE_INTEGER));
							m_ = Numbers.expt(radix, exponent);
						} else {
							r = Numbers.multiply(significand, Numbers.expt(radix, exponent), CommonSymbols.TWO_INTEGER);
							s = CommonSymbols.TWO_INTEGER;
							mX = Numbers.expt(radix, exponent);
							m_ = Numbers.expt(radix, exponent);
						}
						{
							SubLObject estimate = Numbers.ceiling(Numbers.log(flonum, CommonSymbols.TEN_INTEGER),
									CommonSymbols.UNPROVIDED);
							if (estimate.numGE(CommonSymbols.ZERO_INTEGER))
								s = Numbers.multiply(s, Numbers.expt(CommonSymbols.TEN_INTEGER, estimate));
							else {
								SubLObject scale = Numbers.expt(CommonSymbols.TEN_INTEGER, Numbers.minus(estimate));
								r = Numbers.multiply(r, scale);
								mX = Numbers.multiply(mX, scale);
								m_ = Numbers.multiply(m_, scale);
							}
							{
								SubLObject roundp = Numbers.evenp(significand);
								if (CommonSymbols.NIL != Functions.funcall(
										CommonSymbols.NIL != roundp
												? (SubLObject) Symbols.symbol_function(math_utilities.$sym15$__)
												: Symbols.symbol_function(math_utilities.$sym16$_),
										Numbers.add(r, mX), s))
									return Values.values(
											math_utilities.fdl_generate(r,
													Numbers.multiply(s, CommonSymbols.TEN_INTEGER), mX, m_, roundp),
											Numbers.add(estimate, CommonSymbols.ONE_INTEGER));
								else
									return Values.values(math_utilities.fdl_generate(r, s, mX, m_, roundp), estimate);
							}
						}
					}
				}
			}
		}
	}

	public static SubLObject init_math_utilities_file() {
		math_utilities.$bell_double_precision_bits$ = SubLFiles.defconstant("BELL_DOUBLE-PRECISION-BITS",
				math_utilities.$int0$53);
		math_utilities.$bell_extended_precision_bits$ = SubLFiles.defconstant("BELL_EXTENDED-PRECISION-BITS",
				math_utilities.$int1$64);
		math_utilities.$bell_2_expt_p$ = SubLFiles.defconstant("BELL_2_EXPT_P",
				math_utilities.$int2$18446744073709551616);
		math_utilities.$bell_2_expt_p_1$ = SubLFiles.defconstant("BELL_2_EXPT_P-1",
				math_utilities.$int3$9223372036854775808);
		math_utilities.$bell_2_expt_p_n$ = SubLFiles.defconstant("BELL_2_EXPT_P-N", math_utilities.$int4$2048);
		math_utilities.$bell_2_expt_p_n_1$ = SubLFiles.defconstant("BELL_2_EXPT_P-N-1", math_utilities.$int5$1024);
		math_utilities.$bell_2_expt_n$ = SubLFiles.defconstant("BELL_2_EXPT_N", math_utilities.$int6$9007199254740992);
		math_utilities.$bell_2_expt_n_1$ = SubLFiles.defconstant("BELL_2_EXPT_N-1",
				math_utilities.$int7$4503599627370496);
		math_utilities.$bell_log5_of_2_expt_n$ = SubLFiles.defconstant("BELL_LOG5_OF_2_EXPT_N",
				math_utilities.$int8$23);
		math_utilities.$bell_exp_table_lookup_limit$ = SubLFiles.defconstant("BELL_EXP-TABLE-LOOKUP-LIMIT",
				math_utilities.$int8$23);
		math_utilities.$bell_delta$ = SubLFiles.defconstant("BELL_DELTA", CommonSymbols.TEN_INTEGER);
		math_utilities.$bell_beta$ = SubLFiles.defconstant("BELL_BETA", CommonSymbols.TWO_INTEGER);
		math_utilities.$bell_beta_expt_n_1$ = SubLFiles.defconstant("BELL_BETA_EXPT_N-1",
				math_utilities.$int7$4503599627370496);
		math_utilities.$bell_beta_significand$ = SubLFiles.defvar("BELL_BETA-SIGNIFICAND", CommonSymbols.NIL);
		math_utilities.$bell_beta_exponent$ = SubLFiles.defvar("BELL_BETA-EXPONENT", CommonSymbols.NIL);
		math_utilities.$bell_delta_significand$ = SubLFiles.defvar("BELL_DELTA-SIGNIFICAND", CommonSymbols.NIL);
		math_utilities.$bell_delta_exponent$ = SubLFiles.defvar("BELL_DELTA-EXPONENT", CommonSymbols.NIL);
		math_utilities.$bell_approximation_float$ = SubLFiles.defvar("BELL_APPROXIMATION-FLOAT", CommonSymbols.NIL);
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_math_utilities_file() {
		// CVS_ID("Id: math-utilities.lisp 126640 2008-12-04 13:39:36Z builder
		// ");
		return CommonSymbols.NIL;
	}

	private math_utilities() {
	}

	//// Initializers

	public void declareFunctions() {
		math_utilities.declare_math_utilities_file();
	}

	public void initializeVariables() {
		math_utilities.init_math_utilities_file();
	}

	public void runTopLevelForms() {
		math_utilities.setup_math_utilities_file();
	}

}
