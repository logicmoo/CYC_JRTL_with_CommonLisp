/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$double_float_minimum_exponent$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public class math_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new math_utilities();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities";

    // defconstant
    // Definitions
    private static final SubLSymbol $bell_double_precision_bits$ = makeSymbol("BELL_DOUBLE-PRECISION-BITS");

    // defconstant
    private static final SubLSymbol $bell_extended_precision_bits$ = makeSymbol("BELL_EXTENDED-PRECISION-BITS");

    // defconstant
    private static final SubLSymbol $bell_2_expt_p$ = makeSymbol("BELL_2_EXPT_P");

    // defconstant
    private static final SubLSymbol $bell_2_expt_p_1$ = makeSymbol("BELL_2_EXPT_P-1");

    // defconstant
    private static final SubLSymbol $bell_2_expt_p_n$ = makeSymbol("BELL_2_EXPT_P-N");

    // defconstant
    private static final SubLSymbol $bell_2_expt_p_n_1$ = makeSymbol("BELL_2_EXPT_P-N-1");

    // defconstant
    private static final SubLSymbol $bell_2_expt_n$ = makeSymbol("BELL_2_EXPT_N");

    // defconstant
    private static final SubLSymbol $bell_2_expt_n_1$ = makeSymbol("BELL_2_EXPT_N-1");

    // defconstant
    private static final SubLSymbol $bell_log5_of_2_expt_n$ = makeSymbol("BELL_LOG5_OF_2_EXPT_N");

    // defconstant
    private static final SubLSymbol $bell_exp_table_lookup_limit$ = makeSymbol("BELL_EXP-TABLE-LOOKUP-LIMIT");

    // defconstant
    private static final SubLSymbol $bell_delta$ = makeSymbol("BELL_DELTA");

    // defconstant
    private static final SubLSymbol $bell_beta$ = makeSymbol("BELL_BETA");

    // defconstant
    private static final SubLSymbol $bell_beta_expt_n_1$ = makeSymbol("BELL_BETA_EXPT_N-1");

    // defvar
    private static final SubLSymbol $bell_beta_significand$ = makeSymbol("BELL_BETA-SIGNIFICAND");

    // defvar
    private static final SubLSymbol $bell_beta_exponent$ = makeSymbol("BELL_BETA-EXPONENT");

    // defvar
    private static final SubLSymbol $bell_delta_significand$ = makeSymbol("BELL_DELTA-SIGNIFICAND");

    // defvar
    private static final SubLSymbol $bell_delta_exponent$ = makeSymbol("BELL_DELTA-EXPONENT");

    // defvar
    private static final SubLSymbol $bell_approximation_float$ = makeSymbol("BELL_APPROXIMATION-FLOAT");

    private static final SubLInteger $int$53 = makeInteger(53);



    private static final SubLInteger $int$18446744073709551616 = makeInteger("18446744073709551616");

    private static final SubLInteger $int$9223372036854775808 = makeInteger("9223372036854775808");

    private static final SubLInteger $int$2048 = makeInteger(2048);

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLInteger $int$9007199254740992 = makeInteger("9007199254740992");

    private static final SubLInteger $int$4503599627370496 = makeInteger("4503599627370496");

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLInteger $int$17976931348623157 = makeInteger("17976931348623157");

    private static final SubLInteger $int$292 = makeInteger(292);

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLInteger $int$_300 = makeInteger(-300);

    public static final SubLSymbol $sym13$__ = makeSymbol("<=");

    public static final SubLSymbol $sym14$_ = makeSymbol("<");

    public static final SubLSymbol $sym15$__ = makeSymbol(">=");

    public static final SubLSymbol $sym16$_ = makeSymbol(">");

    public static SubLObject bell_ten_to_e(SubLObject e) {
        return sublisp_float(expt(TEN_INTEGER, e), UNPROVIDED);
    }

    public static SubLObject bell_float_significand(SubLObject x) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject r1 = integer_decode_float(x);
        SubLObject r2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return r1;
    }

    public static SubLObject bell_float_exponent(SubLObject x) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject r1 = integer_decode_float(x);
        SubLObject r2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return r2;
    }

    public static SubLObject bell_next_float(SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject x = sublisp_float(arg, UNPROVIDED);
        SubLObject significand;
        SubLObject exponent;
        SubLObject sign;
        if (x.numGE(ZERO_INTEGER)) {
            thread.resetMultipleValues();
            significand = integer_decode_float(x);
            exponent = thread.secondMultipleValue();
            sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return sublisp_float(scale_float(multiply(sign, sublisp_float(add(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
        } else {
            thread.resetMultipleValues();
            significand = integer_decode_float(x);
            exponent = thread.secondMultipleValue();
            sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return sublisp_float(scale_float(multiply(sign, sublisp_float(subtract(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
        }
    }

    public static SubLObject bell_prev_float(SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject x = sublisp_float(arg, UNPROVIDED);
        SubLObject significand;
        SubLObject exponent;
        SubLObject sign;
        if (x.numGE(ZERO_INTEGER)) {
            thread.resetMultipleValues();
            significand = integer_decode_float(x);
            exponent = thread.secondMultipleValue();
            sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return sublisp_float(scale_float(multiply(sign, sublisp_float(subtract(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
        } else {
            thread.resetMultipleValues();
            significand = integer_decode_float(x);
            exponent = thread.secondMultipleValue();
            sign = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return sublisp_float(scale_float(multiply(sign, sublisp_float(add(significand, ONE_INTEGER), UNPROVIDED)), exponent), UNPROVIDED);
        }
    }

    public static SubLObject bell_multiply_and_test(SubLObject f, SubLObject e) {
        SubLNil result = NIL;
        SubLObject x;
        SubLObject y;
        SubLObject z;
        SubLObject result1;
        if (f.numG(multiply($int$17976931348623157, expt(TEN_INTEGER, $int$292)))) {
            x = ceiling(log(f, TEN_INTEGER), UNPROVIDED);
            y = round(divide(f, expt(TEN_INTEGER, subtract(x, $int$30))), UNPROVIDED);
            SubLObject y2 = add(e, subtract(x, $int$30));
            z = multiply(y, bell_ten_to_e(y2));
            result1 = bell_fail(f, e, z);
        } else {
            x = sublisp_float(f, UNPROVIDED);
            y = (e.numL($int$_300)) ? bell_ten_to_e(ceiling(e, TWO_INTEGER)) : bell_ten_to_e(e);
            Object y21 = (e.numL($int$_300)) ? bell_ten_to_e(floor(e, TWO_INTEGER)) : ONE_INTEGER;
            z = multiply(multiply(x, y), ((SubLObject) (y21)));
            result1 = bell_fail(f, e, z);
        }
        return result1;
    }

    public static SubLObject bellerophon(SubLObject f, SubLObject e) {
        return ((f.numL($bell_2_expt_n$.getGlobalValue()) && e.numGE(ZERO_INTEGER)) && e.numL($bell_exp_table_lookup_limit$.getGlobalValue())) && e.numL($bell_log5_of_2_expt_n$.getGlobalValue()) ? multiply(sublisp_float(f, UNPROVIDED), bell_ten_to_e(e)) : ((f.numL($bell_2_expt_n$.getGlobalValue()) && e.numL(ZERO_INTEGER)) && minus(e).numL($bell_exp_table_lookup_limit$.getGlobalValue())) && minus(e).numL($bell_log5_of_2_expt_n$.getGlobalValue()) ? divide(sublisp_float(f, UNPROVIDED), bell_ten_to_e(minus(e))) : bell_multiply_and_test(f, e);
    }

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

    public static SubLObject bell_compare(SubLObject x, SubLObject y) {
        SubLThread thread = SubLProcess.currentSubLThread();
        Object result = NIL;
        Object flag = NIL;
        SubLObject d = subtract(x, y);
        SubLObject d2 = multiply(TWO_INTEGER, $bell_beta_significand$.getDynamicValue(thread), abs(d));
        if (d2.numL(y)) {
            if (($bell_beta_significand$.getDynamicValue(thread).numE($bell_beta_expt_n_1$.getGlobalValue()) && d.numL(ZERO_INTEGER)) && multiply($bell_beta$.getGlobalValue(), d2).numG(y)) {
                result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
                flag = ZERO_INTEGER;
            } else {
                result = $bell_approximation_float$.getDynamicValue(thread);
                flag = ONE_INTEGER;
            }
        } else
            if (d2.numE(y)) {
                if (NIL != evenp($bell_beta_significand$.getDynamicValue(thread))) {
                    if ($bell_beta_significand$.getDynamicValue(thread).numE($bell_beta_expt_n_1$.getGlobalValue()) && d.numL(ZERO_INTEGER)) {
                        result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
                        flag = ZERO_INTEGER;
                    } else {
                        result = $bell_approximation_float$.getDynamicValue(thread);
                        flag = ONE_INTEGER;
                    }
                } else
                    if (d.numL(ZERO_INTEGER)) {
                        result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
                        flag = ONE_INTEGER;
                    } else
                        if (d.numG(ZERO_INTEGER)) {
                            result = bell_next_float($bell_approximation_float$.getDynamicValue(thread));
                            flag = ONE_INTEGER;
                        }


            } else
                if (d.numL(ZERO_INTEGER)) {
                    result = bell_prev_float($bell_approximation_float$.getDynamicValue(thread));
                    flag = ZERO_INTEGER;
                } else
                    if (d.numG(ZERO_INTEGER)) {
                        result = bell_next_float($bell_approximation_float$.getDynamicValue(thread));
                        flag = ZERO_INTEGER;
                    }



        return values(((SubLObject) (result)), ((SubLObject) (flag)));
    }

    public static SubLObject bell_fail_loop(SubLObject z0) {
        SubLThread thread = SubLProcess.currentSubLThread();
        Object result = NIL;
        Object flag = NIL;
        SubLObject _prev_bind_0 = $bell_approximation_float$.currentBinding(thread);
        SubLObject _prev_bind_1 = $bell_beta_significand$.currentBinding(thread);
        SubLObject _prev_bind_2 = $bell_beta_exponent$.currentBinding(thread);
        try {
            $bell_approximation_float$.bind(z0, thread);
            $bell_beta_significand$.bind(bell_float_significand($bell_approximation_float$.getDynamicValue(thread)), thread);
            $bell_beta_exponent$.bind(bell_float_exponent($bell_approximation_float$.getDynamicValue(thread)), thread);
            SubLObject r1;
            SubLObject r2;
            if ($bell_delta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER) && $bell_beta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                thread.resetMultipleValues();
                r1 = bell_compare(multiply($bell_delta_significand$.getDynamicValue(thread), expt($bell_delta$.getGlobalValue(), $bell_delta_exponent$.getDynamicValue(thread))), multiply($bell_beta_significand$.getDynamicValue(thread), expt($bell_beta$.getGlobalValue(), $bell_beta_exponent$.getDynamicValue(thread))));
                r2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = r1;
                flag = r2;
            } else
                if ($bell_delta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER) && $bell_beta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
                    thread.resetMultipleValues();
                    r1 = bell_compare(multiply($bell_delta_significand$.getDynamicValue(thread), expt($bell_delta$.getGlobalValue(), $bell_delta_exponent$.getDynamicValue(thread)), expt($bell_beta$.getGlobalValue(), minus($bell_beta_exponent$.getDynamicValue(thread)))), $bell_beta_significand$.getDynamicValue(thread));
                    r2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    result = r1;
                    flag = r2;
                } else
                    if ($bell_delta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER) && $bell_beta_exponent$.getDynamicValue(thread).numGE(ZERO_INTEGER)) {
                        thread.resetMultipleValues();
                        r1 = bell_compare($bell_delta_significand$.getDynamicValue(thread), multiply($bell_beta_significand$.getDynamicValue(thread), expt($bell_beta$.getGlobalValue(), $bell_beta_exponent$.getDynamicValue(thread)), expt($bell_delta$.getGlobalValue(), minus($bell_delta_exponent$.getDynamicValue(thread)))));
                        r2 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        result = r1;
                        flag = r2;
                    } else
                        if ($bell_delta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER) && $bell_beta_exponent$.getDynamicValue(thread).numL(ZERO_INTEGER)) {
                            thread.resetMultipleValues();
                            r1 = bell_compare(multiply($bell_delta_significand$.getDynamicValue(thread), expt($bell_beta$.getGlobalValue(), minus($bell_beta_exponent$.getDynamicValue(thread)))), multiply($bell_beta_significand$.getDynamicValue(thread), expt($bell_delta$.getGlobalValue(), minus($bell_delta_exponent$.getDynamicValue(thread)))));
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
        return ((SubLObject) (((SubLObject) (flag)).numE(ZERO_INTEGER) ? bell_fail_loop(((SubLObject) (result))) : result));
    }

    public static SubLObject fdl_generate(SubLObject r, SubLObject s, SubLObject mX, SubLObject m_, SubLObject roundp) {
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject quotient = truncate(multiply(r, TEN_INTEGER), s);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        mX = multiply(mX, TEN_INTEGER);
        m_ = multiply(m_, TEN_INTEGER);
        SubLObject tc1 = funcall(NIL != roundp ? symbol_function($sym13$__) : symbol_function($sym14$_), remainder, m_);
        SubLObject tc2 = funcall(NIL != roundp ? symbol_function($sym15$__) : symbol_function($sym16$_), add(remainder, mX), s);
        return NIL != tc1 ? NIL != tc2 ? multiply(remainder, TWO_INTEGER).numL(s) ? list(quotient) : list(add(quotient, ONE_INTEGER)) : list(quotient) : NIL != tc2 ? list(add(quotient, ONE_INTEGER)) : cons(quotient, fdl_generate(remainder, s, mX, m_, roundp));
    }

    public static SubLObject flonum_digit_list(SubLObject flonum) {
        SubLThread thread = SubLProcess.currentSubLThread();
        flonum = sublisp_float(abs(flonum), UNPROVIDED);
        if (flonum.isZero())
            return values(NIL, ZERO_INTEGER);
        else {
            SubLObject radix = float_radix(flonum);
            SubLObject digits = float_digits(flonum);
            thread.resetMultipleValues();
            SubLObject significand = integer_decode_float(flonum);
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
                if ((!exponent.numE($double_float_minimum_exponent$.getGlobalValue())) && significand.numE(expt(radix, subtract(digits, ONE_INTEGER)))) {
                    r1 = multiply(significand, radix, TWO_INTEGER);
                    s1 = multiply(expt(radix, add(minus(exponent), ONE_INTEGER)), TWO_INTEGER);
                    mX1 = radix;
                    m_1 = ONE_INTEGER;
                } else {
                    r1 = multiply(significand, TWO_INTEGER);
                    s1 = multiply(expt(radix, minus(exponent)), TWO_INTEGER);
                    mX1 = ONE_INTEGER;
                    m_1 = ONE_INTEGER;
                }
            } else
                if (significand.numE(expt(radix, subtract(digits, ONE_INTEGER)))) {
                    r1 = multiply(significand, expt(radix, add(exponent, ONE_INTEGER)), TWO_INTEGER);
                    s1 = multiply(radix, TWO_INTEGER);
                    mX1 = expt(radix, add(exponent, ONE_INTEGER));
                    m_1 = expt(radix, exponent);
                } else {
                    r1 = multiply(significand, expt(radix, exponent), TWO_INTEGER);
                    s1 = TWO_INTEGER;
                    mX1 = expt(radix, exponent);
                    m_1 = expt(radix, exponent);
                }

            SubLObject estimate = ceiling(log(flonum, TEN_INTEGER), UNPROVIDED);
            SubLObject roundp;
            if (estimate.numGE(ZERO_INTEGER))
                s1 = multiply(((SubLObject) (s1)), expt(TEN_INTEGER, estimate));
            else {
                roundp = expt(TEN_INTEGER, minus(estimate));
                r1 = multiply(r1, roundp);
                mX1 = multiply(((SubLObject) (mX1)), roundp);
                m_1 = multiply(((SubLObject) (m_1)), roundp);
            }
            roundp = evenp(significand);
            return NIL != funcall(NIL != roundp ? symbol_function($sym15$__) : symbol_function($sym16$_), add(r1, ((SubLObject) (mX1))), ((SubLObject) (s1))) ? values(fdl_generate(r1, multiply(((SubLObject) (s1)), TEN_INTEGER), ((SubLObject) (mX1)), ((SubLObject) (m_1)), roundp), add(estimate, ONE_INTEGER)) : values(fdl_generate(r1, ((SubLObject) (s1)), ((SubLObject) (mX1)), ((SubLObject) (m_1)), roundp), estimate);
        }
    }

    public static SubLObject declare_math_utilities_file() {
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_ten_to_e", "BELL_TEN-TO-E", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_float_significand", "BELL_FLOAT-SIGNIFICAND", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_float_exponent", "BELL_FLOAT-EXPONENT", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_next_float", "BELL_NEXT-FLOAT", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_prev_float", "BELL_PREV-FLOAT", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_multiply_and_test", "BELL_MULTIPLY-AND-TEST", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bellerophon", "BELLEROPHON", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_fail", "BELL_FAIL", 3, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_compare", "BELL_COMPARE", 2, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "bell_fail_loop", "BELL_FAIL-LOOP", 1, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "fdl_generate", "FDL_GENERATE", 5, 0, false);
        declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.math_utilities", "flonum_digit_list", "FLONUM-DIGIT-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_math_utilities_file() {
        defconstant("BELL_DOUBLE-PRECISION-BITS", $int$53);
        defconstant("BELL_EXTENDED-PRECISION-BITS", $int$64);
        defconstant("BELL_2_EXPT_P", $int$18446744073709551616);
        defconstant("BELL_2_EXPT_P-1", $int$9223372036854775808);
        defconstant("BELL_2_EXPT_P-N", $int$2048);
        defconstant("BELL_2_EXPT_P-N-1", $int$1024);
        defconstant("BELL_2_EXPT_N", $int$9007199254740992);
        defconstant("BELL_2_EXPT_N-1", $int$4503599627370496);
        defconstant("BELL_LOG5_OF_2_EXPT_N", $int$23);
        defconstant("BELL_EXP-TABLE-LOOKUP-LIMIT", $int$23);
        defconstant("BELL_DELTA", TEN_INTEGER);
        defconstant("BELL_BETA", TWO_INTEGER);
        defconstant("BELL_BETA_EXPT_N-1", $int$4503599627370496);
        defvar("BELL_BETA-SIGNIFICAND", NIL);
        defvar("BELL_BETA-EXPONENT", NIL);
        defvar("BELL_DELTA-SIGNIFICAND", NIL);
        defvar("BELL_DELTA-EXPONENT", NIL);
        defvar("BELL_APPROXIMATION-FLOAT", NIL);
        return NIL;
    }

    public static SubLObject setup_math_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_math_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_math_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_math_utilities_file();
    }
}

