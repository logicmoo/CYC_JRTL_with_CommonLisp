//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class math_utilities extends SubLTranslatedFile {
	public static SubLFile me = new math_utilities();
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities";
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 1065L)
	private static SubLSymbol $bell_double_precision_bits$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 1488L)
	private static SubLSymbol $bell_extended_precision_bits$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 1591L)
	private static SubLSymbol $bell_2_expt_p$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 1754L)
	private static SubLSymbol $bell_2_expt_p_1$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 1865L)
	private static SubLSymbol $bell_2_expt_p_n$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2002L)
	private static SubLSymbol $bell_2_expt_p_n_1$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2150L)
	private static SubLSymbol $bell_2_expt_n$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2246L)
	private static SubLSymbol $bell_2_expt_n_1$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2354L)
	private static SubLSymbol $bell_log5_of_2_expt_n$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2483L)
	private static SubLSymbol $bell_exp_table_lookup_limit$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 4838L)
	private static SubLSymbol $bell_delta$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 4886L)
	private static SubLSymbol $bell_beta$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 4967L)
	private static SubLSymbol $bell_beta_expt_n_1$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5133L)
	private static SubLSymbol $bell_beta_significand$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5169L)
	private static SubLSymbol $bell_beta_exponent$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5202L)
	private static SubLSymbol $bell_delta_significand$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5239L)
	private static SubLSymbol $bell_delta_exponent$ = null;
	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5273L)
	private static SubLSymbol $bell_approximation_float$ = null;
	private static SubLInteger $int0$53 = SubLObjectFactory.makeInteger(53);
	private static SubLInteger $int1$64 = SubLObjectFactory.makeInteger(64);
	private static SubLInteger $int2$18446744073709551616 = SubLObjectFactory.makeInteger("18446744073709551616");
	private static SubLInteger $int3$9223372036854775808 = SubLObjectFactory.makeInteger("9223372036854775808");
	private static SubLInteger $int4$2048 = SubLObjectFactory.makeInteger(2048);
	private static SubLInteger $int5$1024 = SubLObjectFactory.makeInteger(1024);
	private static SubLInteger $int6$9007199254740992 = SubLObjectFactory.makeInteger("9007199254740992");
	private static SubLInteger $int7$4503599627370496 = SubLObjectFactory.makeInteger("4503599627370496");
	private static SubLInteger $int8$23 = SubLObjectFactory.makeInteger(23);
	private static SubLInteger $int9$17976931348623157 = SubLObjectFactory.makeInteger("17976931348623157");
	private static SubLInteger $int10$292 = SubLObjectFactory.makeInteger(292);
	private static SubLInteger $int11$30 = SubLObjectFactory.makeInteger(30);
	private static SubLInteger $int12$_300 = SubLObjectFactory.makeInteger(-300);
	private static SubLSymbol $sym13$__ = SubLObjectFactory.makeSymbol("<=");
	private static SubLSymbol $sym14$_ = SubLObjectFactory.makeSymbol("<");
	private static SubLSymbol $sym15$__ = SubLObjectFactory.makeSymbol(">=");
	private static SubLSymbol $sym16$_ = SubLObjectFactory.makeSymbol(">");

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2528L)
	public static SubLObject bell_ten_to_e(SubLObject e) {
		return Numbers.sublisp_float(Numbers.expt(TEN_INTEGER, e), UNPROVIDED);
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2675L)
	public static SubLObject bell_float_significand(SubLObject x) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject r1 = Numbers.integer_decode_float(x);
		SubLObject r2 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return r1;
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2793L)
	public static SubLObject bell_float_exponent(SubLObject x) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject r1 = Numbers.integer_decode_float(x);
		SubLObject r2 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return r2;
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 2906L)
	public static SubLObject bell_next_float(SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject x = Numbers.sublisp_float(arg, UNPROVIDED);
		SubLObject significand;
		SubLObject exponent;
		SubLObject sign;
		if (x.numGE(ZERO_INTEGER)) {
			thread.resetMultipleValues();
			significand = Numbers.integer_decode_float(x);
			exponent = thread.secondMultipleValue();
			sign = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Numbers.sublisp_float(Numbers.scale_float(
					Numbers.multiply(sign, Numbers.sublisp_float(Numbers.add(significand, ONE_INTEGER), UNPROVIDED)),
					exponent), UNPROVIDED);
		} else {
			thread.resetMultipleValues();
			significand = Numbers.integer_decode_float(x);
			exponent = thread.secondMultipleValue();
			sign = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Numbers
					.sublisp_float(Numbers.scale_float(
							Numbers.multiply(sign,
									Numbers.sublisp_float(Numbers.subtract(significand, ONE_INTEGER), UNPROVIDED)),
							exponent), UNPROVIDED);
		}
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 3342L)
	public static SubLObject bell_prev_float(SubLObject arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject x = Numbers.sublisp_float(arg, UNPROVIDED);
		SubLObject significand;
		SubLObject exponent;
		SubLObject sign;
		if (x.numGE(ZERO_INTEGER)) {
			thread.resetMultipleValues();
			significand = Numbers.integer_decode_float(x);
			exponent = thread.secondMultipleValue();
			sign = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Numbers
					.sublisp_float(Numbers.scale_float(
							Numbers.multiply(sign,
									Numbers.sublisp_float(Numbers.subtract(significand, ONE_INTEGER), UNPROVIDED)),
							exponent), UNPROVIDED);
		} else {
			thread.resetMultipleValues();
			significand = Numbers.integer_decode_float(x);
			exponent = thread.secondMultipleValue();
			sign = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			return Numbers.sublisp_float(Numbers.scale_float(
					Numbers.multiply(sign, Numbers.sublisp_float(Numbers.add(significand, ONE_INTEGER), UNPROVIDED)),
					exponent), UNPROVIDED);
		}
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 3778L)
	public static SubLObject bell_multiply_and_test(SubLObject f, SubLObject e) {
		SubLNil result = NIL;
		SubLObject x;
		SubLObject y;
		SubLObject z;
		SubLObject result1;
		if (f.numG(Numbers.multiply($int9$17976931348623157, Numbers.expt(TEN_INTEGER, $int10$292)))) {
			x = Numbers.ceiling(Numbers.log(f, TEN_INTEGER), UNPROVIDED);
			y = Numbers.round(Numbers.divide(f, Numbers.expt(TEN_INTEGER, Numbers.subtract(x, $int11$30))), UNPROVIDED);
			SubLObject y2 = Numbers.add(e, Numbers.subtract(x, $int11$30));
			z = Numbers.multiply(y, bell_ten_to_e(y2));
			result1 = bell_fail(f, e, z);
		} else {
			x = Numbers.sublisp_float(f, UNPROVIDED);
			y = e.numL($int12$_300) ? bell_ten_to_e(Numbers.ceiling(e, TWO_INTEGER)) : bell_ten_to_e(e);
			Object y21 = e.numL($int12$_300) ? bell_ten_to_e(Numbers.floor(e, TWO_INTEGER)) : ONE_INTEGER;
			z = Numbers.multiply(Numbers.multiply(x, y), (SubLObject) y21);
			result1 = bell_fail(f, e, z);
		}
		return result1;
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 4430L)
	public static SubLObject bellerophon(SubLObject f, SubLObject e) {
		return f.numL($bell_2_expt_n$.getGlobalValue()) && e.numGE(ZERO_INTEGER)
				&& e.numL($bell_exp_table_lookup_limit$.getGlobalValue())
				&& e.numL($bell_log5_of_2_expt_n$.getGlobalValue())
						? Numbers.multiply(Numbers.sublisp_float(f, UNPROVIDED), bell_ten_to_e(e))
						: f.numL($bell_2_expt_n$.getGlobalValue()) && e.numL(ZERO_INTEGER)
								&& Numbers.minus(e).numL($bell_exp_table_lookup_limit$.getGlobalValue())
								&& Numbers.minus(e).numL($bell_log5_of_2_expt_n$.getGlobalValue())
										? Numbers.divide(Numbers.sublisp_float(f, UNPROVIDED),
												bell_ten_to_e(Numbers.minus(e)))
										: bell_multiply_and_test(f, e);
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5312L)
	public static SubLObject bell_fail(SubLObject f0, SubLObject e0, SubLObject z0) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLNil result = NIL;
		SubLObject _prev_bind_0 = $bell_delta_significand$.currentBinding(thread);
		SubLObject _prev_bind_1 = $bell_delta_exponent$.currentBinding(thread);
		SubLObject result1;
		try {
			$bell_delta_significand$.bind(f0, thread);
			$bell_delta_exponent$.bind(e0, thread);
			result1 = bell_fail_loop(z0);
		} finally {
			$bell_delta_exponent$.rebind(_prev_bind_1, thread);
			$bell_delta_significand$.rebind(_prev_bind_0, thread);
		}
		return result1;
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 5491L)
	public static SubLObject bell_compare(SubLObject x, SubLObject y) {
		SubLThread thread = SubLProcess.currentSubLThread();
		Object result = NIL;
		Object flag = NIL;
		SubLObject d = Numbers.subtract(x, y);
		SubLObject d2 = Numbers.multiply(TWO_INTEGER, $bell_beta_significand$.getDynamicValue(thread), Numbers.abs(d));
		if (d2.numL(y)) {
			if ($bell_beta_significand$.getDynamicValue(thread).numE($bell_beta_expt_n_1$.getGlobalValue())
					&& d.numL(ZERO_INTEGER) && Numbers.multiply($bell_beta$.getGlobalValue(), d2).numG(y)) {
				result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
				flag = ZERO_INTEGER;
			} else {
				result = $bell_approximation_float$.getDynamicValue(thread);
				flag = ONE_INTEGER;
			}
		} else if (d2.numE(y)) {
			if (NIL != Numbers.evenp($bell_beta_significand$.getDynamicValue(thread))) {
				if ($bell_beta_significand$.getDynamicValue(thread).numE($bell_beta_expt_n_1$.getGlobalValue())
						&& d.numL(ZERO_INTEGER)) {
					result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
					flag = ZERO_INTEGER;
				} else {
					result = $bell_approximation_float$.getDynamicValue(thread);
					flag = ONE_INTEGER;
				}
			} else if (d.numL(ZERO_INTEGER)) {
				result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
				flag = ONE_INTEGER;
			} else if (d.numG(ZERO_INTEGER)) {
				result = bell_next_float($bell_approximation_float$.getDynamicValue(thread));
				flag = ONE_INTEGER;
			}
		} else if (d.numL(ZERO_INTEGER)) {
			result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
			flag = ZERO_INTEGER;
		} else if (d.numG(ZERO_INTEGER)) {
			result = bell_next_float($bell_approximation_float$.getDynamicValue(thread));
			flag = ZERO_INTEGER;
		}
		return Values.values((SubLObject) result, (SubLObject) flag);
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 6699L)
	public static SubLObject bell_fail_loop(SubLObject z0) {
		SubLThread thread = SubLProcess.currentSubLThread();
		Object result = NIL;
		Object flag = NIL;
		SubLObject _prev_bind_0 = $bell_approximation_float$.currentBinding(thread);
		SubLObject _prev_bind_1 = $bell_beta_significand$.currentBinding(thread);
		SubLObject _prev_bind_2 = $bell_beta_exponent$.currentBinding(thread);
		try {
			$bell_approximation_float$.bind(z0, thread);
			$bell_beta_significand$.bind(bell_float_significand($bell_approximation_float$.getDynamicValue(thread)),
					thread);
			$bell_beta_exponent$.bind(bell_float_exponent($bell_approximation_float$.getDynamicValue(thread)), thread);
			SubLObject r1;
			SubLObject r2;
			if ($bell_delta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)
					&& $bell_beta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
				thread.resetMultipleValues();
				r1 = bell_compare(
						Numbers.multiply($bell_delta_significand$.getDynamicValue(thread),
								Numbers.expt($bell_delta$.getGlobalValue(),
										$bell_delta_exponent$.getDynamicValue(thread))),
						Numbers.multiply($bell_beta_significand$.getDynamicValue(thread), Numbers
								.expt($bell_beta$.getGlobalValue(), $bell_beta_exponent$.getDynamicValue(thread))));
				r2 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				result = r1;
				flag = r2;
			} else if ($bell_delta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)
					&& $bell_beta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
				thread.resetMultipleValues();
				r1 = bell_compare(Numbers.multiply($bell_delta_significand$.getDynamicValue(thread),
						Numbers.expt($bell_delta$.getGlobalValue(), $bell_delta_exponent$.getDynamicValue(thread)),
						Numbers.expt($bell_beta$.getGlobalValue(),
								Numbers.minus($bell_beta_exponent$.getDynamicValue(thread)))),
						$bell_beta_significand$.getDynamicValue(thread));
				r2 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				result = r1;
				flag = r2;
			} else if ($bell_delta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)
					&& $bell_beta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
				thread.resetMultipleValues();
				r1 = bell_compare($bell_delta_significand$.getDynamicValue(thread),
						Numbers.multiply($bell_beta_significand$.getDynamicValue(thread),
								Numbers.expt($bell_beta$.getGlobalValue(),
										$bell_beta_exponent$.getDynamicValue(thread)),
								Numbers.expt($bell_delta$.getGlobalValue(),
										Numbers.minus($bell_delta_exponent$.getDynamicValue(thread)))));
				r2 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				result = r1;
				flag = r2;
			} else if ($bell_delta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)
					&& $bell_beta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
				thread.resetMultipleValues();
				r1 = bell_compare(
						Numbers.multiply($bell_delta_significand$.getDynamicValue(thread),
								Numbers.expt($bell_beta$.getGlobalValue(),
										Numbers.minus($bell_beta_exponent$.getDynamicValue(thread)))),
						Numbers.multiply($bell_beta_significand$.getDynamicValue(thread),
								Numbers.expt($bell_delta$.getGlobalValue(),
										Numbers.minus($bell_delta_exponent$.getDynamicValue(thread)))));
				r2 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				result = r1;
				flag = r2;
			}
		} finally {
			$bell_beta_exponent$.rebind(_prev_bind_2, thread);
			$bell_beta_significand$.rebind(_prev_bind_1, thread);
			$bell_approximation_float$.rebind(_prev_bind_0, thread);
		}
		return (SubLObject) (((SubLObject) flag).numE(ZERO_INTEGER) ? bell_fail_loop((SubLObject) result) : result);
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 8303L)
	public static SubLObject fdl_generate(SubLObject r, SubLObject s, SubLObject mX, SubLObject m_, SubLObject roundp) {
		SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject quotient = Numbers.truncate(Numbers.multiply(r, TEN_INTEGER), s);
		SubLObject remainder = thread.secondMultipleValue();
		thread.resetMultipleValues();
		mX = Numbers.multiply(mX, TEN_INTEGER);
		m_ = Numbers.multiply(m_, TEN_INTEGER);
		SubLObject tc1 = Functions.funcall(
				NIL != roundp ? Symbols.symbol_function($sym13$__) : Symbols.symbol_function($sym14$_), remainder, m_);
		SubLObject tc2 = Functions.funcall(
				NIL != roundp ? Symbols.symbol_function($sym15$__) : Symbols.symbol_function($sym16$_),
				Numbers.add(remainder, mX), s);
		return NIL != tc1
				? NIL != tc2 ? Numbers.multiply(remainder, TWO_INTEGER).numL(s) ? ConsesLow.list(quotient)
						: ConsesLow.list(Numbers.add(quotient, ONE_INTEGER)) : ConsesLow.list(quotient)
				: NIL != tc2 ? ConsesLow.list(Numbers.add(quotient, ONE_INTEGER))
						: ConsesLow.cons(quotient, fdl_generate(remainder, s, mX, m_, roundp));
	}

	@SubLTranslatedFile.SubL(source = "sublisp/math-utilities.lisp", position = 8967L)
	public static SubLObject flonum_digit_list(SubLObject flonum) {
		SubLThread thread = SubLProcess.currentSubLThread();
		flonum = Numbers.sublisp_float(Numbers.abs(flonum), UNPROVIDED);
		if (flonum.isZero())
			return Values.values(NIL, ZERO_INTEGER);
		else {
			SubLObject radix = Numbers.float_radix(flonum);
			SubLObject digits = Numbers.float_digits(flonum);
			thread.resetMultipleValues();
			SubLObject significand = Numbers.integer_decode_float(flonum);
			SubLObject exponent = thread.secondMultipleValue();
			SubLObject sign = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			SubLNil r = NIL;
			SubLNil s = NIL;
			SubLNil mX = NIL;
			SubLNil m_ = NIL;
			Object m_1;
			SubLObject r1;
			Object s1;
			Object mX1;
			if (exponent.isNegative()) {
				if (!exponent.numE(Numbers.$double_float_minimum_exponent$.getGlobalValue())
						&& significand.numE(Numbers.expt(radix, Numbers.subtract(digits, ONE_INTEGER)))) {
					r1 = Numbers.multiply(significand, radix, TWO_INTEGER);
					s1 = Numbers.multiply(Numbers.expt(radix, Numbers.add(Numbers.minus(exponent), ONE_INTEGER)),
							TWO_INTEGER);
					mX1 = radix;
					m_1 = ONE_INTEGER;
				} else {
					r1 = Numbers.multiply(significand, TWO_INTEGER);
					s1 = Numbers.multiply(Numbers.expt(radix, Numbers.minus(exponent)), TWO_INTEGER);
					mX1 = ONE_INTEGER;
					m_1 = ONE_INTEGER;
				}
			} else if (significand.numE(Numbers.expt(radix, Numbers.subtract(digits, ONE_INTEGER)))) {
				r1 = Numbers.multiply(significand, Numbers.expt(radix, Numbers.add(exponent, ONE_INTEGER)),
						TWO_INTEGER);
				s1 = Numbers.multiply(radix, TWO_INTEGER);
				mX1 = Numbers.expt(radix, Numbers.add(exponent, ONE_INTEGER));
				m_1 = Numbers.expt(radix, exponent);
			} else {
				r1 = Numbers.multiply(significand, Numbers.expt(radix, exponent), TWO_INTEGER);
				s1 = TWO_INTEGER;
				mX1 = Numbers.expt(radix, exponent);
				m_1 = Numbers.expt(radix, exponent);
			}
			SubLObject estimate = Numbers.ceiling(Numbers.log(flonum, TEN_INTEGER), UNPROVIDED);
			SubLObject roundp;
			if (estimate.numGE(ZERO_INTEGER))
				s1 = Numbers.multiply((SubLObject) s1, Numbers.expt(TEN_INTEGER, estimate));
			else {
				roundp = Numbers.expt(TEN_INTEGER, Numbers.minus(estimate));
				r1 = Numbers.multiply(r1, roundp);
				mX1 = Numbers.multiply((SubLObject) mX1, roundp);
				m_1 = Numbers.multiply((SubLObject) m_1, roundp);
			}
			roundp = Numbers.evenp(significand);
			return NIL != Functions.funcall(
					NIL != roundp ? Symbols.symbol_function($sym15$__) : Symbols.symbol_function($sym16$_),
					Numbers.add(r1, (SubLObject) mX1), (SubLObject) s1)
							? Values.values(fdl_generate(r1, Numbers.multiply((SubLObject) s1, TEN_INTEGER),
									(SubLObject) mX1, (SubLObject) m_1, roundp), Numbers.add(estimate, ONE_INTEGER))
							: Values.values(
									fdl_generate(r1, (SubLObject) s1, (SubLObject) mX1, (SubLObject) m_1, roundp),
									estimate);
		}
	}

	public static SubLObject declare_math_utilities_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_ten_to_e",
				"BELL_TEN-TO-E", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities",
				"bell_float_significand", "BELL_FLOAT-SIGNIFICAND", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_float_exponent",
				"BELL_FLOAT-EXPONENT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_next_float",
				"BELL_NEXT-FLOAT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_prev_float",
				"BELL_PREV-FLOAT", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities",
				"bell_multiply_and_test", "BELL_MULTIPLY-AND-TEST", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bellerophon",
				"BELLEROPHON", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_fail",
				"BELL_FAIL", 3, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_compare",
				"BELL_COMPARE", 2, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_fail_loop",
				"BELL_FAIL-LOOP", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "fdl_generate",
				"FDL_GENERATE", 5, 0, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "flonum_digit_list",
				"FLONUM-DIGIT-LIST", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_math_utilities_file() {
		$bell_double_precision_bits$ = SubLFiles.defconstant("BELL_DOUBLE-PRECISION-BITS", $int0$53);
		$bell_extended_precision_bits$ = SubLFiles.defconstant("BELL_EXTENDED-PRECISION-BITS", $int1$64);
		$bell_2_expt_p$ = SubLFiles.defconstant("BELL_2_EXPT_P", $int2$18446744073709551616);
		$bell_2_expt_p_1$ = SubLFiles.defconstant("BELL_2_EXPT_P-1", $int3$9223372036854775808);
		$bell_2_expt_p_n$ = SubLFiles.defconstant("BELL_2_EXPT_P-N", $int4$2048);
		$bell_2_expt_p_n_1$ = SubLFiles.defconstant("BELL_2_EXPT_P-N-1", $int5$1024);
		$bell_2_expt_n$ = SubLFiles.defconstant("BELL_2_EXPT_N", $int6$9007199254740992);
		$bell_2_expt_n_1$ = SubLFiles.defconstant("BELL_2_EXPT_N-1", $int7$4503599627370496);
		$bell_log5_of_2_expt_n$ = SubLFiles.defconstant("BELL_LOG5_OF_2_EXPT_N", $int8$23);
		$bell_exp_table_lookup_limit$ = SubLFiles.defconstant("BELL_EXP-TABLE-LOOKUP-LIMIT", $int8$23);
		$bell_delta$ = SubLFiles.defconstant("BELL_DELTA", TEN_INTEGER);
		$bell_beta$ = SubLFiles.defconstant("BELL_BETA", TWO_INTEGER);
		$bell_beta_expt_n_1$ = SubLFiles.defconstant("BELL_BETA_EXPT_N-1", $int7$4503599627370496);
		$bell_beta_significand$ = SubLFiles.defvar("BELL_BETA-SIGNIFICAND", NIL);
		$bell_beta_exponent$ = SubLFiles.defvar("BELL_BETA-EXPONENT", NIL);
		$bell_delta_significand$ = SubLFiles.defvar("BELL_DELTA-SIGNIFICAND", NIL);
		$bell_delta_exponent$ = SubLFiles.defvar("BELL_DELTA-EXPONENT", NIL);
		$bell_approximation_float$ = SubLFiles.defvar("BELL_APPROXIMATION-FLOAT", NIL);
		return NIL;
	}

	public static SubLObject setup_math_utilities_file() {
		return NIL;
	}

	public void declareFunctions() {
		declare_math_utilities_file();
	}

	public void initializeVariables() {
		init_math_utilities_file();
	}

	public void runTopLevelForms() {
		setup_math_utilities_file();
	}
}
