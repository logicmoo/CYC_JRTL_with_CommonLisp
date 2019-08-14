/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_promotions.negative_integer_p;
import static com.cyc.cycjava.cycl.subl_promotions.positive_integer_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.exp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.floor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.oddp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sqrt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SCIENTIFIC-NUMBER-UTILITIES
 * source file: /cyc/top/cycl/scientific-number-utilities.lisp
 * created:     2019/07/03 17:37:52
 */
public final class scientific_number_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new scientific_number_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.scientific_number_utilities";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $scientific_number_e$ = makeSymbol("*SCIENTIFIC-NUMBER-E*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SCIENTIFIC_NUMBER_P = makeSymbol("SCIENTIFIC-NUMBER-P");

    static private final SubLList $list3 = list(reader_make_constant_shell("ScientificNumberFn"), makeInteger("2718281828459045"), ZERO_INTEGER);

    private static final SubLSymbol EXTENDED_NUMBER_P = makeSymbol("EXTENDED-NUMBER-P");

    // Definitions
    public static final SubLObject scientific_number_abs_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
            SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
            return scientific_numbers.new_scientific_number(abs(significand), exponent);
        }
    }

    // Definitions
    public static SubLObject scientific_number_abs(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        return scientific_numbers.new_scientific_number(abs(significand), exponent);
    }

    public static final SubLObject scientific_number_negate_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
            SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
            return scientific_numbers.new_scientific_number(multiply(MINUS_ONE_INTEGER, significand), exponent);
        }
    }

    public static SubLObject scientific_number_negate(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        return scientific_numbers.new_scientific_number(multiply(MINUS_ONE_INTEGER, significand), exponent);
    }

    public static final SubLObject scientific_number_integer_part_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
            SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
            SubLObject sig_length = number_utilities.decimal_integer_length(significand);
            SubLObject division_exponent = subtract(sig_length, exponent, ONE_INTEGER);
            if (exponent.numL(ZERO_INTEGER)) {
                return ZERO_INTEGER;
            } else {
                if (division_exponent.numL(ZERO_INTEGER)) {
                    return multiply(significand, expt(TEN_INTEGER, minus(division_exponent)));
                } else {
                    return integerDivide(significand, expt(TEN_INTEGER, division_exponent));
                }
            }
        }
    }

    public static SubLObject scientific_number_integer_part(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject sig_length = number_utilities.decimal_integer_length(significand);
        final SubLObject division_exponent = subtract(sig_length, exponent, ONE_INTEGER);
        if (exponent.numL(ZERO_INTEGER)) {
            return ZERO_INTEGER;
        }
        if (division_exponent.numL(ZERO_INTEGER)) {
            return multiply(significand, expt(TEN_INTEGER, minus(division_exponent)));
        }
        return integerDivide(significand, expt(TEN_INTEGER, division_exponent));
    }

    public static final SubLObject scientific_number_significant_digits_alt(SubLObject sci_num, SubLObject digits) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(digits, POSITIVE_INTEGER_P);
        {
            SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
            SubLObject significand_length = number_utilities.decimal_integer_length(significand);
            SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
            SubLObject new_significand = number_utilities.significant_digits(significand, digits);
            SubLObject new_significand_length = number_utilities.decimal_integer_length(new_significand);
            SubLObject division_exponent = subtract(new_significand_length, digits);
            if (new_significand_length.numG(significand_length)) {
                exponent = add(exponent, subtract(new_significand_length, significand_length));
            }
            if (division_exponent.numG(ZERO_INTEGER)) {
                new_significand = integerDivide(new_significand, expt(TEN_INTEGER, division_exponent));
            }
            return scientific_numbers.new_scientific_number(new_significand, exponent);
        }
    }

    public static SubLObject scientific_number_significant_digits(final SubLObject sci_num, final SubLObject digits) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        assert NIL != subl_promotions.positive_integer_p(digits) : "! subl_promotions.positive_integer_p(digits) " + ("subl_promotions.positive_integer_p(digits) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(digits) ") + digits;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject significand_length = number_utilities.decimal_integer_length(significand);
        SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        SubLObject new_significand = number_utilities.significant_digits(significand, digits);
        final SubLObject new_significand_length = number_utilities.decimal_integer_length(new_significand);
        final SubLObject division_exponent = subtract(new_significand_length, digits);
        if (new_significand_length.numG(significand_length)) {
            exponent = add(exponent, subtract(new_significand_length, significand_length));
        }
        if (division_exponent.numG(ZERO_INTEGER)) {
            new_significand = integerDivide(new_significand, expt(TEN_INTEGER, division_exponent));
        }
        return scientific_numbers.new_scientific_number(new_significand, exponent);
    }

    public static final SubLObject scientific_number_eql_alt(SubLObject sci_num0, SubLObject sci_num1) {
        SubLTrampolineFile.checkType(sci_num0, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num1, SCIENTIFIC_NUMBER_P);
        {
            SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
            SubLObject exponent1 = scientific_numbers.scientific_number_exponent(sci_num1);
            if (exponent0.numE(exponent1)) {
                {
                    SubLObject significand0 = scientific_numbers.scientific_number_significand(sci_num0);
                    SubLObject significand1 = scientific_numbers.scientific_number_significand(sci_num1);
                    return numE(significand0, significand1);
                }
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject scientific_number_eql(final SubLObject sci_num0, final SubLObject sci_num1) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num0) : "! scientific_numbers.scientific_number_p(sci_num0) " + ("scientific_numbers.scientific_number_p(sci_num0) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num0) ") + sci_num0;
        assert NIL != scientific_numbers.scientific_number_p(sci_num1) : "! scientific_numbers.scientific_number_p(sci_num1) " + ("scientific_numbers.scientific_number_p(sci_num1) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num1) ") + sci_num1;
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(sci_num1);
        if (exponent0.numE(exponent2)) {
            final SubLObject significand0 = scientific_numbers.scientific_number_significand(sci_num0);
            final SubLObject significand2 = scientific_numbers.scientific_number_significand(sci_num1);
            return numE(significand0, significand2);
        }
        return NIL;
    }

    public static SubLObject scientific_number_comparison_significant_digits(final SubLObject sci_num, final SubLObject ex_num) {
        return max(ONE_INTEGER, NIL != scientific_numbers.scientific_number_p(ex_num) ? min(scientific_numbers.scientific_number_significant_digit_count(sci_num), scientific_numbers.scientific_number_significant_digit_count(ex_num)) : ex_num.isInteger() ? scientific_numbers.scientific_number_significant_digit_count(sci_num) : ex_num.isNumber() ? min(scientific_numbers.scientific_number_significant_digit_count(sci_num), scientific_numbers.scientific_number_significant_digit_count(scientific_numbers.scientific_number_from_subl_real(ex_num, UNPROVIDED))) : scientific_numbers.scientific_number_significant_digit_count(sci_num));
    }

    /**
     * Are sci-num0 and sci-num1 equal up to digits number of significant digits?
     * If digits is nil, then we take it to be the minimum number of significant
     * digits between sci-num0 and sci-num1.
     */
    @LispMethod(comment = "Are sci-num0 and sci-num1 equal up to digits number of significant digits?\r\nIf digits is nil, then we take it to be the minimum number of significant\r\ndigits between sci-num0 and sci-num1.\nAre sci-num0 and sci-num1 equal up to digits number of significant digits?\nIf digits is nil, then we take it to be the minimum number of significant\ndigits between sci-num0 and sci-num1.")
    public static final SubLObject scientific_numberE_alt(SubLObject sci_num0, SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(sci_num0, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num1, SCIENTIFIC_NUMBER_P);
        if (NIL != digits) {
            SubLTrampolineFile.checkType(digits, POSITIVE_INTEGER_P);
        } else {
            digits = max(ONE_INTEGER, min(scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num0), scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num1)));
        }
        {
            SubLObject new_sci_num0 = number_utilities.significant_digits(sci_num0, digits);
            SubLObject new_sci_num1 = number_utilities.significant_digits(sci_num1, digits);
            SubLObject exponent0 = scientific_numbers.scientific_number_exponent(new_sci_num0);
            SubLObject exponent1 = scientific_numbers.scientific_number_exponent(new_sci_num1);
            if (exponent0.numE(exponent1)) {
                {
                    SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci_num0);
                    SubLObject significand1 = scientific_numbers.scientific_number_significand(new_sci_num1);
                    if ((ZERO_INTEGER.numE(significand0) || digits.numGE(number_utilities.decimal_integer_length(significand0))) && (ZERO_INTEGER.numE(significand1) || digits.numGE(number_utilities.decimal_integer_length(significand1)))) {
                        return numE(significand0, significand1);
                    } else {
                        return NIL;
                    }
                }
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Are sci-num0 and sci-num1 equal up to digits number of significant digits?\r\nIf digits is nil, then we take it to be the minimum number of significant\r\ndigits between sci-num0 and sci-num1.\nAre sci-num0 and sci-num1 equal up to digits number of significant digits?\nIf digits is nil, then we take it to be the minimum number of significant\ndigits between sci-num0 and sci-num1.")
    public static SubLObject scientific_numberE(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        assert NIL != scientific_numbers.scientific_number_p(sci_num0) : "! scientific_numbers.scientific_number_p(sci_num0) " + ("scientific_numbers.scientific_number_p(sci_num0) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num0) ") + sci_num0;
        assert NIL != scientific_numbers.scientific_number_p(sci_num1) : "! scientific_numbers.scientific_number_p(sci_num1) " + ("scientific_numbers.scientific_number_p(sci_num1) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num1) ") + sci_num1;
        digits = (NIL != digits) ? digits : scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        assert NIL != subl_promotions.positive_integer_p(digits) : "! subl_promotions.positive_integer_p(digits) " + ("subl_promotions.positive_integer_p(digits) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(digits) ") + digits;
        final SubLObject new_sci_num0 = number_utilities.significant_digits(sci_num0, digits);
        final SubLObject new_sci_num2 = number_utilities.significant_digits(sci_num1, digits);
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(new_sci_num0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(new_sci_num2);
        if (!exponent0.numE(exponent2)) {
            return NIL;
        }
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci_num0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(new_sci_num2);
        if ((ZERO_INTEGER.numE(significand0) || digits.numGE(number_utilities.decimal_integer_length(significand0))) && (ZERO_INTEGER.numE(significand2) || digits.numGE(number_utilities.decimal_integer_length(significand2)))) {
            return numE(significand0, significand2);
        }
        return NIL;
    }

    public static final SubLObject scientific_number_integerE_alt(SubLObject sci_num, SubLObject v_int, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return zerop(v_int);
        } else {
            {
                SubLObject sig_digits = (NIL != digits) ? ((SubLObject) (digits)) : scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
                SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
                return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberE(sci_num, new_sci_num, sig_digits);
            }
        }
    }

    public static SubLObject scientific_number_integerE(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        sig_digits = (NIL != sig_digits) ? sig_digits : scientific_number_comparison_significant_digits(sci_num, v_int);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return zerop(v_int);
        }
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_numberE(sci_num, new_sci_num, sig_digits);
    }

    public static final SubLObject integer_scientific_numberE_alt(SubLObject v_int, SubLObject sci_num, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_integerE(sci_num, v_int, digits);
    }

    public static SubLObject integer_scientific_numberE(final SubLObject v_int, final SubLObject sci_num, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return scientific_number_integerE(sci_num, v_int, digits);
    }

    /**
     * Is sci-num0 greater than sci-num1 to digits number of significant digits?
     * If digits is nil, then we take it to be the minimum number of significant
     * digits between sci-num0 and sci-num1.
     */
    @LispMethod(comment = "Is sci-num0 greater than sci-num1 to digits number of significant digits?\r\nIf digits is nil, then we take it to be the minimum number of significant\r\ndigits between sci-num0 and sci-num1.\nIs sci-num0 greater than sci-num1 to digits number of significant digits?\nIf digits is nil, then we take it to be the minimum number of significant\ndigits between sci-num0 and sci-num1.")
    public static final SubLObject scientific_numberG_alt(SubLObject sci_num0, SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(sci_num0, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num1, SCIENTIFIC_NUMBER_P);
        if (NIL != digits) {
            SubLTrampolineFile.checkType(digits, POSITIVE_INTEGER_P);
        } else {
            digits = max(ONE_INTEGER, min(scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num0), scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num1)));
        }
        {
            SubLObject new_sci_num0 = number_utilities.significant_digits(sci_num0, digits);
            SubLObject new_sci_num1 = number_utilities.significant_digits(sci_num1, digits);
            SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci_num0);
            SubLObject exponent0 = scientific_numbers.scientific_number_exponent(new_sci_num0);
            SubLObject significand1 = scientific_numbers.scientific_number_significand(new_sci_num1);
            SubLObject exponent1 = scientific_numbers.scientific_number_exponent(new_sci_num1);
            if ((ZERO_INTEGER.numE(significand0) || digits.numLE(number_utilities.decimal_integer_length(significand0))) && (ZERO_INTEGER.numE(significand1) || digits.numLE(number_utilities.decimal_integer_length(significand1)))) {
                if (ZERO_INTEGER.numE(significand0)) {
                    return minusp(significand1);
                } else {
                    if (ZERO_INTEGER.numE(significand1)) {
                        return plusp(significand0);
                    } else {
                        if (exponent0.numG(exponent1)) {
                            return plusp(significand0);
                        } else {
                            if (exponent1.numG(exponent0)) {
                                return minusp(significand1);
                            } else {
                                if (exponent0.numE(exponent1)) {
                                    return numG(significand0, significand1);
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Is sci-num0 greater than sci-num1 to digits number of significant digits?\r\nIf digits is nil, then we take it to be the minimum number of significant\r\ndigits between sci-num0 and sci-num1.\nIs sci-num0 greater than sci-num1 to digits number of significant digits?\nIf digits is nil, then we take it to be the minimum number of significant\ndigits between sci-num0 and sci-num1.")
    public static SubLObject scientific_numberG(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        assert NIL != scientific_numbers.scientific_number_p(sci_num0) : "! scientific_numbers.scientific_number_p(sci_num0) " + ("scientific_numbers.scientific_number_p(sci_num0) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num0) ") + sci_num0;
        assert NIL != scientific_numbers.scientific_number_p(sci_num1) : "! scientific_numbers.scientific_number_p(sci_num1) " + ("scientific_numbers.scientific_number_p(sci_num1) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num1) ") + sci_num1;
        digits = (NIL != digits) ? digits : scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        assert NIL != subl_promotions.positive_integer_p(digits) : "! subl_promotions.positive_integer_p(digits) " + ("subl_promotions.positive_integer_p(digits) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(digits) ") + digits;
        final SubLObject new_sci_num0 = number_utilities.significant_digits(sci_num0, digits);
        final SubLObject new_sci_num2 = number_utilities.significant_digits(sci_num1, digits);
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci_num0);
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(new_sci_num0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(new_sci_num2);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(new_sci_num2);
        if (((!ZERO_INTEGER.numE(significand0)) && (!digits.numLE(number_utilities.decimal_integer_length(significand0)))) || ((!ZERO_INTEGER.numE(significand2)) && (!digits.numLE(number_utilities.decimal_integer_length(significand2))))) {
            return NIL;
        }
        if (ZERO_INTEGER.numE(significand0)) {
            return minusp(significand2);
        }
        if (ZERO_INTEGER.numE(significand2)) {
            return plusp(significand0);
        }
        if (exponent0.numG(exponent2)) {
            return plusp(significand0);
        }
        if (exponent2.numG(exponent0)) {
            return minusp(significand2);
        }
        if (exponent0.numE(exponent2)) {
            return numG(significand0, significand2);
        }
        return NIL;
    }

    public static final SubLObject scientific_number_integerG_alt(SubLObject sci_num, SubLObject v_int, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return negative_integer_p(v_int);
        } else {
            {
                SubLObject sig_digits = (NIL != digits) ? ((SubLObject) (digits)) : scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
                SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
                return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberG(sci_num, new_sci_num, sig_digits);
            }
        }
    }

    public static SubLObject scientific_number_integerG(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        sig_digits = (NIL != sig_digits) ? sig_digits : scientific_number_comparison_significant_digits(sci_num, v_int);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return subl_promotions.negative_integer_p(v_int);
        }
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_numberG(sci_num, new_sci_num, sig_digits);
    }

    public static final SubLObject integer_scientific_numberG_alt(SubLObject v_int, SubLObject sci_num, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return positive_integer_p(v_int);
        } else {
            {
                SubLObject sig_digits = (NIL != digits) ? ((SubLObject) (digits)) : scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
                SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
                return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberG(new_sci_num, sci_num, sig_digits);
            }
        }
    }

    public static SubLObject integer_scientific_numberG(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        sig_digits = (NIL != sig_digits) ? sig_digits : scientific_number_comparison_significant_digits(sci_num, v_int);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return subl_promotions.positive_integer_p(v_int);
        }
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_numberG(new_sci_num, sci_num, sig_digits);
    }

    public static final SubLObject scientific_numberGE_alt(SubLObject sci_num0, SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberE(sci_num0, sci_num1, digits)) || (NIL != com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberG(sci_num0, sci_num1, digits)));
    }

    public static SubLObject scientific_numberGE(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        }
        return makeBoolean((NIL != scientific_numberE(sci_num0, sci_num1, sig_digits)) || (NIL != scientific_numberG(sci_num0, sci_num1, sig_digits)));
    }

    public static final SubLObject scientific_number_integerGE_alt(SubLObject sci_num, SubLObject v_int, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_integerE(sci_num, v_int, digits)) || (NIL != com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_integerG(sci_num, v_int, digits)));
    }

    public static SubLObject scientific_number_integerGE(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return makeBoolean((NIL != scientific_number_integerE(sci_num, v_int, sig_digits)) || (NIL != scientific_number_integerG(sci_num, v_int, sig_digits)));
    }

    public static final SubLObject integer_scientific_numberGE_alt(SubLObject v_int, SubLObject sci_num, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.scientific_number_utilities.integer_scientific_numberE(v_int, sci_num, digits)) || (NIL != com.cyc.cycjava.cycl.scientific_number_utilities.integer_scientific_numberG(v_int, sci_num, digits)));
    }

    public static SubLObject integer_scientific_numberGE(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return makeBoolean((NIL != integer_scientific_numberE(v_int, sci_num, sig_digits)) || (NIL != integer_scientific_numberG(v_int, sci_num, sig_digits)));
    }

    public static final SubLObject scientific_numberL_alt(SubLObject sci_num0, SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberG(sci_num1, sci_num0, digits);
    }

    public static SubLObject scientific_numberL(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        }
        return scientific_numberG(sci_num1, sci_num0, sig_digits);
    }

    public static final SubLObject scientific_number_integerL_alt(SubLObject sci_num, SubLObject v_int, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.integer_scientific_numberG(v_int, sci_num, digits);
    }

    public static SubLObject scientific_number_integerL(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return integer_scientific_numberG(v_int, sci_num, sig_digits);
    }

    public static final SubLObject integer_scientific_numberL_alt(SubLObject v_int, SubLObject sci_num, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_integerG(sci_num, v_int, digits);
    }

    public static SubLObject integer_scientific_numberL(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return scientific_number_integerG(sci_num, v_int, sig_digits);
    }

    public static final SubLObject scientific_numberLE_alt(SubLObject sci_num0, SubLObject sci_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_numberGE(sci_num0, sci_num1, digits);
    }

    public static SubLObject scientific_numberLE(final SubLObject sci_num0, final SubLObject sci_num1, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num0, sci_num1);
        }
        return scientific_numberGE(sci_num0, sci_num1, sig_digits);
    }

    public static final SubLObject scientific_number_integerLE_alt(SubLObject sci_num, SubLObject v_int, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.integer_scientific_numberGE(v_int, sci_num, digits);
    }

    public static SubLObject scientific_number_integerLE(final SubLObject sci_num, final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return integer_scientific_numberGE(v_int, sci_num, sig_digits);
    }

    public static final SubLObject integer_scientific_numberLE_alt(SubLObject v_int, SubLObject sci_num, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_integerGE(sci_num, v_int, digits);
    }

    public static SubLObject integer_scientific_numberLE(final SubLObject v_int, final SubLObject sci_num, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = scientific_number_comparison_significant_digits(sci_num, v_int);
        }
        return scientific_number_integerGE(sci_num, v_int, sig_digits);
    }

    public static final SubLObject scientific_number_times_alt(SubLObject sci_num0, SubLObject sci_num1) {
        SubLTrampolineFile.checkType(sci_num0, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num1, SCIENTIFIC_NUMBER_P);
        {
            SubLObject significand0 = scientific_numbers.scientific_number_significand(sci_num0);
            SubLObject significand1 = scientific_numbers.scientific_number_significand(sci_num1);
            if (significand0.isZero() || significand1.isZero()) {
                return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
            } else {
                {
                    SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
                    SubLObject sig_length0 = number_utilities.decimal_integer_length(significand0);
                    SubLObject exponent1 = scientific_numbers.scientific_number_exponent(sci_num1);
                    SubLObject sig_length1 = number_utilities.decimal_integer_length(significand1);
                    SubLObject new_significand = multiply(significand0, significand1);
                    SubLObject new_sig_length = number_utilities.decimal_integer_length(new_significand);
                    SubLObject new_exponent = subtract(new_sig_length, new SubLObject[]{ subtract(sig_length0, exponent0, ONE_INTEGER), subtract(sig_length1, exponent1, ONE_INTEGER), ONE_INTEGER });
                    SubLObject new_sig_digits = min(sig_length0, sig_length1);
                    return number_utilities.significant_digits(scientific_numbers.new_scientific_number(new_significand, new_exponent), new_sig_digits);
                }
            }
        }
    }

    public static SubLObject scientific_number_times(final SubLObject sci_num0, final SubLObject sci_num1) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num0) : "! scientific_numbers.scientific_number_p(sci_num0) " + ("scientific_numbers.scientific_number_p(sci_num0) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num0) ") + sci_num0;
        assert NIL != scientific_numbers.scientific_number_p(sci_num1) : "! scientific_numbers.scientific_number_p(sci_num1) " + ("scientific_numbers.scientific_number_p(sci_num1) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num1) ") + sci_num1;
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(sci_num0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(sci_num1);
        if (significand0.isZero() || significand2.isZero()) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
        final SubLObject sig_length0 = number_utilities.decimal_integer_length(significand0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(sci_num1);
        final SubLObject sig_length2 = number_utilities.decimal_integer_length(significand2);
        final SubLObject new_significand = multiply(significand0, significand2);
        final SubLObject new_sig_length = number_utilities.decimal_integer_length(new_significand);
        final SubLObject new_exponent = subtract(new_sig_length, new SubLObject[]{ subtract(sig_length0, exponent0, ONE_INTEGER), subtract(sig_length2, exponent2, ONE_INTEGER), ONE_INTEGER });
        final SubLObject new_sig_digits = min(sig_length0, sig_length2);
        return number_utilities.significant_digits(scientific_numbers.new_scientific_number(new_significand, new_exponent), new_sig_digits);
    }

    public static final SubLObject scientific_number_integer_times_alt(SubLObject sci_num, SubLObject v_int) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        if ((NIL != scientific_numbers.scientific_number_zero_p(sci_num)) || v_int.isZero()) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
            return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_times(sci_num, new_sci_num);
        }
    }

    public static SubLObject scientific_number_integer_times(final SubLObject sci_num, final SubLObject v_int) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        if ((NIL != scientific_numbers.scientific_number_zero_p(sci_num)) || v_int.isZero()) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_number_times(sci_num, new_sci_num);
    }

    public static final SubLObject integer_scientific_number_times_alt(SubLObject v_int, SubLObject sci_num) {
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_integer_times(sci_num, v_int);
    }

    public static SubLObject integer_scientific_number_times(final SubLObject v_int, final SubLObject sci_num) {
        return scientific_number_integer_times(sci_num, v_int);
    }

    public static final SubLObject scientific_number_inverse_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject real_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
            return scientific_numbers.scientific_number_from_subl_real(divide(ONE_INTEGER, real_num), sig_digits);
        }
    }

    public static SubLObject scientific_number_inverse(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        return scientific_numbers.scientific_number_from_subl_real(divide(ONE_INTEGER, real_num), sig_digits);
    }

    public static final SubLObject scientific_number_quotient_alt(SubLObject sci_num0, SubLObject sci_num1) {
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_times(sci_num0, com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_inverse(sci_num1));
    }

    public static SubLObject scientific_number_quotient(final SubLObject sci_num0, final SubLObject sci_num1) {
        return scientific_number_times(sci_num0, scientific_number_inverse(sci_num1));
    }

    public static final SubLObject scientific_number_integer_quotient_alt(SubLObject sci_num, SubLObject v_int) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        if (v_int.isZero()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
            return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_quotient(sci_num, new_sci_num);
        }
    }

    public static SubLObject scientific_number_integer_quotient(final SubLObject sci_num, final SubLObject v_int) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        if (v_int.isZero()) {
            relation_evaluation.throw_unevaluatable();
        }
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_number_quotient(sci_num, new_sci_num);
    }

    public static final SubLObject integer_scientific_number_quotient_alt(SubLObject v_int, SubLObject sci_num) {
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (v_int.isZero()) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
            return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_quotient(new_sci_num, sci_num);
        }
    }

    public static SubLObject integer_scientific_number_quotient(final SubLObject v_int, final SubLObject sci_num) {
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        if (v_int.isZero()) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_sci_num = scientific_numbers.new_scientific_number_from_integer(v_int, sig_digits);
        return scientific_number_quotient(new_sci_num, sci_num);
    }

    public static final SubLObject scientific_number_plus_alt(SubLObject sci_num0, SubLObject sci_num1) {
        SubLTrampolineFile.checkType(sci_num0, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num1, SCIENTIFIC_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num0)) {
            return scientific_numbers.copy_scientific_number(sci_num1);
        }
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num1)) {
            return scientific_numbers.copy_scientific_number(sci_num0);
        }
        {
            SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
            SubLObject exponent1 = scientific_numbers.scientific_number_exponent(sci_num1);
            SubLObject result = NIL;
            if (exponent0.numE(exponent1)) {
                result = com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_plus_same_exponent(sci_num0, sci_num1, exponent0);
            } else {
                if (exponent0.numG(exponent1)) {
                    result = com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_plus_different_exponents(sci_num0, exponent0, sci_num1, exponent1);
                } else {
                    if (exponent0.numL(exponent1)) {
                        result = com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_plus_different_exponents(sci_num1, exponent1, sci_num0, exponent0);
                    }
                }
            }
            if (NIL != scientific_numbers.scientific_number_zero_p(result)) {
                return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
            } else {
                return result;
            }
        }
    }

    public static SubLObject scientific_number_plus(final SubLObject sci_num0, final SubLObject sci_num1) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num0) : "! scientific_numbers.scientific_number_p(sci_num0) " + ("scientific_numbers.scientific_number_p(sci_num0) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num0) ") + sci_num0;
        assert NIL != scientific_numbers.scientific_number_p(sci_num1) : "! scientific_numbers.scientific_number_p(sci_num1) " + ("scientific_numbers.scientific_number_p(sci_num1) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num1) ") + sci_num1;
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num0)) {
            return scientific_numbers.copy_scientific_number(sci_num1);
        }
        if (NIL != scientific_numbers.scientific_number_zero_p(sci_num1)) {
            return scientific_numbers.copy_scientific_number(sci_num0);
        }
        final SubLObject exponent0 = scientific_numbers.scientific_number_exponent(sci_num0);
        final SubLObject exponent2 = scientific_numbers.scientific_number_exponent(sci_num1);
        SubLObject result = NIL;
        if (exponent0.numE(exponent2)) {
            result = scientific_number_plus_same_exponent(sci_num0, sci_num1, exponent0);
        } else
            if (exponent0.numG(exponent2)) {
                result = scientific_number_plus_different_exponents(sci_num0, exponent0, sci_num1, exponent2);
            } else
                if (exponent0.numL(exponent2)) {
                    result = scientific_number_plus_different_exponents(sci_num1, exponent2, sci_num0, exponent0);
                }


        if (NIL != scientific_numbers.scientific_number_zero_p(result)) {
            return scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        return result;
    }

    public static final SubLObject scientific_number_plus_same_exponent_alt(SubLObject sci_num0, SubLObject sci_num1, SubLObject exponent) {
        {
            SubLObject sig_digits0 = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num0);
            SubLObject sig_digits1 = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num1);
            SubLObject sig_digits = min(sig_digits0, sig_digits1);
            SubLObject new_sci0 = number_utilities.significant_digits(sci_num0, sig_digits);
            SubLObject new_sci1 = number_utilities.significant_digits(sci_num1, sig_digits);
            SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci0);
            SubLObject significand1 = scientific_numbers.scientific_number_significand(new_sci1);
            SubLObject sum = add(significand0, significand1);
            SubLObject sum_length = number_utilities.decimal_integer_length(sum);
            SubLObject difference = subtract(sum_length, sig_digits);
            SubLObject new_exponent = add(exponent, difference);
            return scientific_numbers.new_scientific_number(sum, new_exponent);
        }
    }

    public static SubLObject scientific_number_plus_same_exponent(final SubLObject sci_num0, final SubLObject sci_num1, final SubLObject exponent) {
        final SubLObject sig_digits0 = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num0);
        final SubLObject sig_digits2 = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num1);
        final SubLObject sig_digits3 = min(sig_digits0, sig_digits2);
        final SubLObject new_sci0 = number_utilities.significant_digits(sci_num0, sig_digits3);
        final SubLObject new_sci2 = number_utilities.significant_digits(sci_num1, sig_digits3);
        final SubLObject significand0 = scientific_numbers.scientific_number_significand(new_sci0);
        final SubLObject significand2 = scientific_numbers.scientific_number_significand(new_sci2);
        final SubLObject sum = add(significand0, significand2);
        final SubLObject sum_length = number_utilities.decimal_integer_length(sum);
        final SubLObject difference = subtract(sum_length, sig_digits3);
        final SubLObject new_exponent = add(exponent, difference);
        return scientific_numbers.new_scientific_number(sum, new_exponent);
    }

    public static final SubLObject scientific_number_plus_different_exponents_alt(SubLObject sci_num_large, SubLObject exponent_large, SubLObject sci_num_small, SubLObject exponent_small) {
        {
            SubLObject exponent_diff = subtract(exponent_large, exponent_small);
            SubLObject significand_large = scientific_numbers.scientific_number_significand(sci_num_large);
            SubLObject guarded_significand_large = multiply(TEN_INTEGER, significand_large);
            SubLObject guarded_sci_num_large = scientific_numbers.new_scientific_number(guarded_significand_large, exponent_large);
            SubLObject sig_digits_large = scientific_numbers.cyc_scientific_number_significant_digit_count(guarded_sci_num_large);
            SubLObject sig_digits_small = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num_small);
            if (exponent_diff.numGE(sig_digits_large)) {
                return scientific_numbers.copy_scientific_number(sci_num_large);
            } else {
                {
                    SubLObject sig_digits = min(sig_digits_large, add(exponent_diff, sig_digits_small));
                    SubLObject new_sci_num_large = number_utilities.significant_digits(guarded_sci_num_large, sig_digits);
                    SubLObject new_sci_num_small = number_utilities.significant_digits(sci_num_small, subtract(sig_digits, exponent_diff));
                    SubLObject new_significand_large = scientific_numbers.scientific_number_significand(new_sci_num_large);
                    SubLObject new_significand_small = scientific_numbers.scientific_number_significand(new_sci_num_small);
                    SubLObject sum = add(new_significand_large, new_significand_small);
                    SubLObject new_sig_digits = min(subtract(sig_digits_large, ONE_INTEGER), add(sig_digits_small, exponent_diff));
                    SubLObject sum_length = number_utilities.decimal_integer_length(sum);
                    SubLObject adjustment_factor = subtract(sum_length, sig_digits);
                    SubLObject new_exponent = add(exponent_large, adjustment_factor);
                    SubLObject almost_final_sig_digits = add(new_sig_digits, adjustment_factor);
                    SubLObject initial_result = (almost_final_sig_digits.numG(ZERO_INTEGER)) ? ((SubLObject) (scientific_numbers.new_scientific_number(sum, new_exponent))) : scientific_numbers.new_scientific_number(number_utilities.significant_digits(integerDivide(sum, TEN_INTEGER), ONE_INTEGER), add(new_exponent, ONE_INTEGER));
                    SubLObject final_sig_digits = (almost_final_sig_digits.numG(ZERO_INTEGER)) ? ((SubLObject) (almost_final_sig_digits)) : ONE_INTEGER;
                    return number_utilities.significant_digits(initial_result, final_sig_digits);
                }
            }
        }
    }

    public static SubLObject scientific_number_plus_different_exponents(final SubLObject sci_num_large, final SubLObject exponent_large, final SubLObject sci_num_small, final SubLObject exponent_small) {
        final SubLObject exponent_diff = subtract(exponent_large, exponent_small);
        final SubLObject significand_large = scientific_numbers.scientific_number_significand(sci_num_large);
        final SubLObject guarded_significand_large = multiply(TEN_INTEGER, significand_large);
        final SubLObject guarded_sci_num_large = scientific_numbers.new_scientific_number(guarded_significand_large, exponent_large);
        final SubLObject sig_digits_large = scientific_numbers.cyc_scientific_number_significant_digit_count(guarded_sci_num_large);
        final SubLObject sig_digits_small = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num_small);
        if (exponent_diff.numGE(sig_digits_large)) {
            return scientific_numbers.copy_scientific_number(sci_num_large);
        }
        final SubLObject sig_digits = min(sig_digits_large, add(exponent_diff, sig_digits_small));
        final SubLObject new_sci_num_large = number_utilities.significant_digits(guarded_sci_num_large, sig_digits);
        final SubLObject new_sci_num_small = number_utilities.significant_digits(sci_num_small, subtract(sig_digits, exponent_diff));
        final SubLObject new_significand_large = scientific_numbers.scientific_number_significand(new_sci_num_large);
        final SubLObject new_significand_small = scientific_numbers.scientific_number_significand(new_sci_num_small);
        final SubLObject sum = add(new_significand_large, new_significand_small);
        final SubLObject new_sig_digits = min(subtract(sig_digits_large, ONE_INTEGER), add(sig_digits_small, exponent_diff));
        final SubLObject sum_length = number_utilities.decimal_integer_length(sum);
        final SubLObject adjustment_factor = subtract(sum_length, sig_digits);
        final SubLObject new_exponent = add(exponent_large, adjustment_factor);
        final SubLObject almost_final_sig_digits = add(new_sig_digits, adjustment_factor);
        final SubLObject initial_result = (almost_final_sig_digits.numG(ZERO_INTEGER)) ? scientific_numbers.new_scientific_number(sum, new_exponent) : scientific_numbers.new_scientific_number(number_utilities.significant_digits(integerDivide(sum, TEN_INTEGER), ONE_INTEGER), add(new_exponent, ONE_INTEGER));
        final SubLObject final_sig_digits = (almost_final_sig_digits.numG(ZERO_INTEGER)) ? almost_final_sig_digits : ONE_INTEGER;
        return number_utilities.significant_digits(initial_result, final_sig_digits);
    }

    public static final SubLObject scientific_number_minus_alt(SubLObject sci_num0, SubLObject sci_num1) {
        {
            SubLObject significand1 = scientific_numbers.scientific_number_significand(sci_num1);
            SubLObject exponent1 = scientific_numbers.scientific_number_exponent(sci_num1);
            SubLObject new_sci_num1 = scientific_numbers.new_scientific_number(minus(significand1), exponent1);
            return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_plus(sci_num0, new_sci_num1);
        }
    }

    public static SubLObject scientific_number_minus(final SubLObject sci_num0, final SubLObject sci_num1) {
        final SubLObject significand1 = scientific_numbers.scientific_number_significand(sci_num1);
        final SubLObject exponent1 = scientific_numbers.scientific_number_exponent(sci_num1);
        final SubLObject new_sci_num1 = scientific_numbers.new_scientific_number(minus(significand1), exponent1);
        return scientific_number_plus(sci_num0, new_sci_num1);
    }

    public static final SubLObject scientific_number_log_alt(SubLObject sci_num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $scientific_number_e$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(base, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        if (base.numE(TEN_INTEGER)) {
            return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_log10(sci_num);
        }
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
            SubLObject new_num = log(real_sci_num, base);
            return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
        }
    }

    public static SubLObject scientific_number_log(final SubLObject sci_num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $scientific_number_e$.getGlobalValue();
        }
        assert NIL != extended_numbers.extended_number_p(base) : "! extended_numbers.extended_number_p(base) " + ("extended_numbers.extended_number_p(base) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(base) ") + base;
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        if (base.numE(TEN_INTEGER)) {
            return scientific_number_log10(sci_num);
        }
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = log(real_sci_num, base);
        return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
    }

    public static final SubLObject scientific_number_log10_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
            SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
            SubLObject exponent_length = number_utilities.decimal_integer_length(exponent);
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject new_significand = log(divide(significand, expt(TEN_INTEGER, subtract(sig_digits, ONE_INTEGER))), TEN_INTEGER);
            SubLObject new_number = add(exponent, new_significand);
            SubLObject new_sig_digits = add(sig_digits, exponent_length);
            return scientific_numbers.scientific_number_from_subl_real(new_number, new_sig_digits);
        }
    }

    public static SubLObject scientific_number_log10(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject exponent_length = number_utilities.decimal_integer_length(exponent);
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject new_significand = log(divide(significand, expt(TEN_INTEGER, subtract(sig_digits, ONE_INTEGER))), TEN_INTEGER);
        final SubLObject new_number = add(exponent, new_significand);
        final SubLObject new_sig_digits = add(sig_digits, exponent_length);
        return scientific_numbers.scientific_number_from_subl_real(new_number, new_sig_digits);
    }

    public static final SubLObject scientific_number_antilog_alt(SubLObject sci_num, SubLObject base) {
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_expt(base, sci_num);
    }

    public static SubLObject scientific_number_antilog(final SubLObject sci_num, final SubLObject base) {
        return scientific_number_expt(base, sci_num);
    }

    public static final SubLObject scientific_number_antilog10_alt(SubLObject sci_num) {
        return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_expt(TEN_INTEGER, sci_num);
    }

    public static SubLObject scientific_number_antilog10(final SubLObject sci_num) {
        return scientific_number_expt(TEN_INTEGER, sci_num);
    }

    public static final SubLObject scientific_number_sqrt_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
            SubLObject new_num = expt(real_sci_num, $float$0_5);
            return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
        }
    }

    public static SubLObject scientific_number_sqrt(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject old_exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject new_exponent = floor(divide(old_exponent, TWO_INTEGER), UNPROVIDED);
        final SubLObject old_significand = scientific_numbers.scientific_number_significand(sci_num);
        final SubLObject old_significand_float = (old_significand.isZero()) ? ZERO_INTEGER : divide(old_significand, expt(TEN_INTEGER, truncate(log(abs(old_significand), TEN_INTEGER), UNPROVIDED)));
        final SubLObject new_significand_square = (NIL != oddp(old_exponent)) ? multiply(TEN_INTEGER, old_significand_float) : old_significand_float;
        final SubLObject new_significand_float = (new_significand_square.isZero()) ? ZERO_INTEGER : number_utilities.significant_digits(sqrt(new_significand_square), sig_digits);
        final SubLObject new_significand = read_from_string(remove(CHAR_period, princ_to_string(new_significand_float), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return scientific_numbers.new_scientific_number(new_significand, new_exponent);
    }

    public static final SubLObject scientific_number_expt10_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
            SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
            SubLObject new_num = expt(TEN_INTEGER, real_sci_num);
            SubLObject new_sig_digits = max(subtract(sig_digits, exponent, ONE_INTEGER), ONE_INTEGER);
            return scientific_numbers.scientific_number_from_subl_real(new_num, new_sig_digits);
        }
    }

    public static SubLObject scientific_number_expt10(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject exponent = scientific_numbers.scientific_number_exponent(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = expt(TEN_INTEGER, real_sci_num);
        final SubLObject new_sig_digits = max(subtract(sig_digits, exponent, ONE_INTEGER), ONE_INTEGER);
        return scientific_numbers.scientific_number_from_subl_real(new_num, new_sig_digits);
    }

    public static final SubLObject scientific_number_expt_alt(SubLObject base, SubLObject sci_num) {
        SubLTrampolineFile.checkType(base, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        if (base.numE(TEN_INTEGER)) {
            return com.cyc.cycjava.cycl.scientific_number_utilities.scientific_number_expt10(sci_num);
        }
        {
            SubLObject new_base = (NIL != scientific_numbers.scientific_number_p(base)) ? ((SubLObject) (scientific_numbers.cyc_scientific_number_to_subl_real(base))) : base;
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
            SubLObject new_num = expt(new_base, real_sci_num);
            return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
        }
    }

    public static SubLObject scientific_number_expt(final SubLObject base, final SubLObject sci_num) {
        assert NIL != extended_numbers.extended_number_p(base) : "! extended_numbers.extended_number_p(base) " + ("extended_numbers.extended_number_p(base) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(base) ") + base;
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        if (base.numE(TEN_INTEGER)) {
            return scientific_number_expt10(sci_num);
        }
        final SubLObject new_base = (NIL != scientific_numbers.scientific_number_p(base)) ? scientific_numbers.cyc_scientific_number_to_subl_real(base) : base;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = expt(new_base, real_sci_num);
        return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
    }

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("ScientificNumberFn"), makeInteger("2718281828459045"), ZERO_INTEGER);

    public static final SubLFloat $float$0_5 = makeDouble(0.5);

    public static final SubLObject scientific_number_exp_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
            SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
            SubLObject new_num = exp(real_sci_num);
            return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
        }
    }

    public static SubLObject scientific_number_exp(final SubLObject sci_num) {
        assert NIL != scientific_numbers.scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject sig_digits = scientific_numbers.cyc_scientific_number_significant_digit_count(sci_num);
        final SubLObject real_sci_num = scientific_numbers.cyc_scientific_number_to_subl_real(sci_num);
        final SubLObject new_num = exp(real_sci_num);
        return scientific_numbers.scientific_number_from_subl_real(new_num, sig_digits);
    }

    public static SubLObject declare_scientific_number_utilities_file() {
        declareFunction("scientific_number_abs", "SCIENTIFIC-NUMBER-ABS", 1, 0, false);
        declareFunction("scientific_number_negate", "SCIENTIFIC-NUMBER-NEGATE", 1, 0, false);
        declareFunction("scientific_number_integer_part", "SCIENTIFIC-NUMBER-INTEGER-PART", 1, 0, false);
        declareFunction("scientific_number_significant_digits", "SCIENTIFIC-NUMBER-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("scientific_number_eql", "SCIENTIFIC-NUMBER-EQL", 2, 0, false);
        declareFunction("scientific_number_comparison_significant_digits", "SCIENTIFIC-NUMBER-COMPARISON-SIGNIFICANT-DIGITS", 2, 0, false);
        declareFunction("scientific_numberE", "SCIENTIFIC-NUMBER=", 2, 1, false);
        declareFunction("scientific_number_integerE", "SCIENTIFIC-NUMBER-INTEGER=", 2, 1, false);
        declareFunction("integer_scientific_numberE", "INTEGER-SCIENTIFIC-NUMBER=", 2, 1, false);
        declareFunction("scientific_numberG", "SCIENTIFIC-NUMBER>", 2, 1, false);
        declareFunction("scientific_number_integerG", "SCIENTIFIC-NUMBER-INTEGER>", 2, 1, false);
        declareFunction("integer_scientific_numberG", "INTEGER-SCIENTIFIC-NUMBER>", 2, 1, false);
        declareFunction("scientific_numberGE", "SCIENTIFIC-NUMBER>=", 2, 1, false);
        declareFunction("scientific_number_integerGE", "SCIENTIFIC-NUMBER-INTEGER>=", 2, 1, false);
        declareFunction("integer_scientific_numberGE", "INTEGER-SCIENTIFIC-NUMBER>=", 2, 1, false);
        declareFunction("scientific_numberL", "SCIENTIFIC-NUMBER<", 2, 1, false);
        declareFunction("scientific_number_integerL", "SCIENTIFIC-NUMBER-INTEGER<", 2, 1, false);
        declareFunction("integer_scientific_numberL", "INTEGER-SCIENTIFIC-NUMBER<", 2, 1, false);
        declareFunction("scientific_numberLE", "SCIENTIFIC-NUMBER<=", 2, 1, false);
        declareFunction("scientific_number_integerLE", "SCIENTIFIC-NUMBER-INTEGER<=", 2, 1, false);
        declareFunction("integer_scientific_numberLE", "INTEGER-SCIENTIFIC-NUMBER<=", 2, 1, false);
        declareFunction("scientific_number_times", "SCIENTIFIC-NUMBER-TIMES", 2, 0, false);
        declareFunction("scientific_number_integer_times", "SCIENTIFIC-NUMBER-INTEGER-TIMES", 2, 0, false);
        declareFunction("integer_scientific_number_times", "INTEGER-SCIENTIFIC-NUMBER-TIMES", 2, 0, false);
        declareFunction("scientific_number_inverse", "SCIENTIFIC-NUMBER-INVERSE", 1, 0, false);
        declareFunction("scientific_number_quotient", "SCIENTIFIC-NUMBER-QUOTIENT", 2, 0, false);
        declareFunction("scientific_number_integer_quotient", "SCIENTIFIC-NUMBER-INTEGER-QUOTIENT", 2, 0, false);
        declareFunction("integer_scientific_number_quotient", "INTEGER-SCIENTIFIC-NUMBER-QUOTIENT", 2, 0, false);
        declareFunction("scientific_number_plus", "SCIENTIFIC-NUMBER-PLUS", 2, 0, false);
        declareFunction("scientific_number_plus_same_exponent", "SCIENTIFIC-NUMBER-PLUS-SAME-EXPONENT", 3, 0, false);
        declareFunction("scientific_number_plus_different_exponents", "SCIENTIFIC-NUMBER-PLUS-DIFFERENT-EXPONENTS", 4, 0, false);
        declareFunction("scientific_number_minus", "SCIENTIFIC-NUMBER-MINUS", 2, 0, false);
        declareFunction("scientific_number_log", "SCIENTIFIC-NUMBER-LOG", 1, 1, false);
        declareFunction("scientific_number_log10", "SCIENTIFIC-NUMBER-LOG10", 1, 0, false);
        declareFunction("scientific_number_antilog", "SCIENTIFIC-NUMBER-ANTILOG", 2, 0, false);
        declareFunction("scientific_number_antilog10", "SCIENTIFIC-NUMBER-ANTILOG10", 1, 0, false);
        declareFunction("scientific_number_sqrt", "SCIENTIFIC-NUMBER-SQRT", 1, 0, false);
        declareFunction("scientific_number_expt10", "SCIENTIFIC-NUMBER-EXPT10", 1, 0, false);
        declareFunction("scientific_number_expt", "SCIENTIFIC-NUMBER-EXPT", 2, 0, false);
        declareFunction("scientific_number_exp", "SCIENTIFIC-NUMBER-EXP", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_scientific_number_utilities_file() {
        defconstant("*SCIENTIFIC-NUMBER-E*", $list3);
        return NIL;
    }

    public static SubLObject setup_scientific_number_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_scientific_number_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_scientific_number_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_scientific_number_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 186 ms
 */
