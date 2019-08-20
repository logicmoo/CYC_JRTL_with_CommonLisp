/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_0;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.elt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SCIENTIFIC-NUMBERS
 * source file: /cyc/top/cycl/scientific-numbers.lisp
 * created:     2019/07/03 17:37:52
 */
public final class scientific_numbers extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt11$ = makeString("");

    public static final SubLFile me = new scientific_numbers();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_P = makeSymbol("CYC-SCIENTIFIC-NUMBER-P");



    private static final SubLSymbol SCIENTIFIC_NUMBER_P = makeSymbol("SCIENTIFIC-NUMBER-P");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_FROM_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-STRING");

    static private final SubLString $$$0 = makeString("0");

    static private final SubLString $str8$_ = makeString("-");

    private static final SubLSymbol NON_ZERO_DIGIT_CHAR_P = makeSymbol("NON-ZERO-DIGIT-CHAR-P");

    static private final SubLString $$$e = makeString("e");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_TO_STRING = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-STRING");

    private static final SubLString $str12$ = makeString("");

    private static final SubLString $str13$_ = makeString(".");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym17$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL = makeSymbol("CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL");

    private static final SubLInteger $int$_8 = makeInteger(-8);

    private static final SubLString $str20$Magnitude_of_exponent_of__S_is_to = makeString("Magnitude of exponent of ~S is too great to convert to a SubL real number.");

    private static final SubLFloat $float$10_0 = makeDouble(10.0);

    private static final SubLSymbol CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT = makeSymbol("CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT");

    // Definitions
    public static final SubLObject cyc_scientific_number_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.scientific_numbers.scientific_number_p(v_object);
    }

    // Definitions
    public static SubLObject cyc_scientific_number_p(final SubLObject v_object) {
        return scientific_number_p(v_object);
    }

    /**
     * We check that object is a nat with functor #$ScientificNumberFn
     * and two integer args.
     */
    @LispMethod(comment = "We check that object is a nat with functor #$ScientificNumberFn\r\nand two integer args.\nWe check that object is a nat with functor #$ScientificNumberFn\nand two integer args.")
    public static final SubLObject scientific_number_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$ScientificNumberFn)) && (NIL != el_binary_formula_p(v_object))) && cycl_utilities.formula_arg1(v_object, UNPROVIDED).isInteger()) && cycl_utilities.formula_arg2(v_object, UNPROVIDED).isInteger());
    }

    /**
     * We check that object is a nat with functor #$ScientificNumberFn
     * and two integer args.
     */
    @LispMethod(comment = "We check that object is a nat with functor #$ScientificNumberFn\r\nand two integer args.\nWe check that object is a nat with functor #$ScientificNumberFn\nand two integer args.")
    public static SubLObject scientific_number_p(final SubLObject v_object) {
        return makeBoolean((((NIL != el_formula_with_operator_p(v_object, $$ScientificNumberFn)) && (NIL != el_binary_formula_p(v_object))) && cycl_utilities.el_formula_arg1(v_object, UNPROVIDED).isInteger()) && cycl_utilities.el_formula_arg2(v_object, UNPROVIDED).isInteger());
    }

    public static final SubLObject new_scientific_number_alt(SubLObject significand, SubLObject exponent) {
        SubLTrampolineFile.checkType(significand, INTEGERP);
        SubLTrampolineFile.checkType(exponent, INTEGERP);
        return list($$ScientificNumberFn, significand, exponent);
    }

    public static SubLObject new_scientific_number(final SubLObject significand, final SubLObject exponent) {
        assert NIL != integerp(significand) : "! integerp(significand) " + ("Types.integerp(significand) " + "CommonSymbols.NIL != Types.integerp(significand) ") + significand;
        assert NIL != integerp(exponent) : "! integerp(exponent) " + ("Types.integerp(exponent) " + "CommonSymbols.NIL != Types.integerp(exponent) ") + exponent;
        return list($$ScientificNumberFn, significand, exponent);
    }

    /**
     * Creates a scientific number with sig-digits siginificant digits from
     * int.  If sig-digits is nil, then the length of int is used instead.
     */
    @LispMethod(comment = "Creates a scientific number with sig-digits siginificant digits from\r\nint.  If sig-digits is nil, then the length of int is used instead.\nCreates a scientific number with sig-digits siginificant digits from\nint.  If sig-digits is nil, then the length of int is used instead.")
    public static final SubLObject new_scientific_number_from_integer_alt(SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = NIL;
        }
        SubLTrampolineFile.checkType(v_int, INTEGERP);
        if (v_int.isZero()) {
            return com.cyc.cycjava.cycl.scientific_numbers.new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        {
            SubLObject significand = NIL;
            SubLObject exponent = NIL;
            if (NIL != sig_digits) {
                SubLTrampolineFile.checkType(sig_digits, POSITIVE_INTEGER_P);
                {
                    SubLObject new_int = number_utilities.significant_digits(v_int, sig_digits);
                    SubLObject int_length = number_utilities.decimal_integer_length(new_int);
                    SubLObject difference = subtract(sig_digits, int_length);
                    significand = (difference.numGE(ZERO_INTEGER)) ? ((SubLObject) (multiply(new_int, expt(TEN_INTEGER, difference)))) : integerDivide(new_int, expt(TEN_INTEGER, abs(difference)));
                    exponent = subtract(int_length, ONE_INTEGER);
                }
            } else {
                significand = v_int;
                exponent = subtract(number_utilities.decimal_integer_length(v_int), ONE_INTEGER);
            }
            return com.cyc.cycjava.cycl.scientific_numbers.new_scientific_number(significand, exponent);
        }
    }

    /**
     * Creates a scientific number with sig-digits siginificant digits from
     * int.  If sig-digits is nil, then the length of int is used instead.
     */
    @LispMethod(comment = "Creates a scientific number with sig-digits siginificant digits from\r\nint.  If sig-digits is nil, then the length of int is used instead.\nCreates a scientific number with sig-digits siginificant digits from\nint.  If sig-digits is nil, then the length of int is used instead.")
    public static SubLObject new_scientific_number_from_integer(final SubLObject v_int, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = NIL;
        }
        assert NIL != integerp(v_int) : "! integerp(v_int) " + ("Types.integerp(v_int) " + "CommonSymbols.NIL != Types.integerp(v_int) ") + v_int;
        if (v_int.isZero()) {
            return new_scientific_number(ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject significand = NIL;
        SubLObject exponent = NIL;
        if (NIL != sig_digits) {
            assert NIL != subl_promotions.positive_integer_p(sig_digits) : "! subl_promotions.positive_integer_p(sig_digits) " + ("subl_promotions.positive_integer_p(sig_digits) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sig_digits) ") + sig_digits;
            final SubLObject new_int = number_utilities.significant_digits(v_int, sig_digits);
            final SubLObject int_length = number_utilities.decimal_integer_length(new_int);
            final SubLObject difference = subtract(sig_digits, int_length);
            significand = (difference.numGE(ZERO_INTEGER)) ? multiply(new_int, expt(TEN_INTEGER, difference)) : integerDivide(new_int, expt(TEN_INTEGER, abs(difference)));
            exponent = subtract(int_length, ONE_INTEGER);
        } else {
            significand = v_int;
            exponent = subtract(number_utilities.decimal_integer_length(v_int), ONE_INTEGER);
        }
        return new_scientific_number(significand, exponent);
    }

    public static final SubLObject scientific_number_significand_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        return cycl_utilities.nat_arg1(sci_num, UNPROVIDED);
    }

    public static SubLObject scientific_number_significand(final SubLObject sci_num) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        return cycl_utilities.el_formula_arg1(sci_num, UNPROVIDED);
    }

    public static final SubLObject scientific_number_exponent_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        return cycl_utilities.nat_arg2(sci_num, UNPROVIDED);
    }

    public static SubLObject scientific_number_exponent(final SubLObject sci_num) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        return cycl_utilities.el_formula_arg2(sci_num, UNPROVIDED);
    }

    public static final SubLObject copy_scientific_number_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        {
            SubLObject significand = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(sci_num);
            SubLObject exponent = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_exponent(sci_num);
            return com.cyc.cycjava.cycl.scientific_numbers.new_scientific_number(significand, exponent);
        }
    }

    public static SubLObject copy_scientific_number(final SubLObject sci_num) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        final SubLObject significand = scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_number_exponent(sci_num);
        return new_scientific_number(significand, exponent);
    }

    public static final SubLObject scientific_number_zero_p_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        return numE(ZERO_INTEGER, com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(sci_num));
    }

    public static SubLObject scientific_number_zero_p(final SubLObject sci_num) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        return numE(ZERO_INTEGER, scientific_number_significand(sci_num));
    }

    public static SubLObject scientific_number_integer_p(final SubLObject sci_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        SubLObject significand = scientific_number_significand(sci_num);
        thread.resetMultipleValues();
        SubLObject quotient = truncate(significand, TEN_INTEGER);
        SubLObject remainder = thread.secondMultipleValue();
        thread.resetMultipleValues();
        while (quotient.numG(ZERO_INTEGER) && ZERO_INTEGER.eql(remainder)) {
            significand = quotient;
            thread.resetMultipleValues();
            final SubLObject quotient_$1 = truncate(significand, TEN_INTEGER);
            final SubLObject remainder_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            quotient = quotient_$1;
            remainder = remainder_$2;
        } 
        return numGE(number_utilities.f_1X(scientific_number_exponent(sci_num)), number_utilities.decimal_integer_length(significand));
    }

    public static final SubLObject scientific_number_minus_p_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        return minusp(com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(sci_num));
    }

    public static SubLObject scientific_number_minus_p(final SubLObject sci_num) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        return minusp(scientific_number_significand(sci_num));
    }

    public static final SubLObject scientific_number_plus_p_alt(SubLObject sci_num) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        return plusp(com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(sci_num));
    }

    public static SubLObject scientific_number_plus_p(final SubLObject sci_num) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        return plusp(scientific_number_significand(sci_num));
    }

    public static final SubLObject scientific_number_non_negative_p_alt(SubLObject sci_num) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.scientific_numbers.scientific_number_minus_p(sci_num));
    }

    public static SubLObject scientific_number_non_negative_p(final SubLObject sci_num) {
        return makeBoolean(NIL == scientific_number_minus_p(sci_num));
    }

    public static final SubLObject scientific_number_add_significant_zeros_alt(SubLObject sci_num, SubLObject zeros) {
        SubLTrampolineFile.checkType(sci_num, SCIENTIFIC_NUMBER_P);
        SubLTrampolineFile.checkType(zeros, POSITIVE_INTEGER_P);
        {
            SubLObject significand = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(sci_num);
            SubLObject exponent = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_exponent(sci_num);
            SubLObject new_significand = multiply(significand, expt(TEN_INTEGER, zeros));
            return com.cyc.cycjava.cycl.scientific_numbers.new_scientific_number(new_significand, exponent);
        }
    }

    public static SubLObject scientific_number_add_significant_zeros(final SubLObject sci_num, final SubLObject zeros) {
        assert NIL != scientific_number_p(sci_num) : "! scientific_numbers.scientific_number_p(sci_num) " + ("scientific_numbers.scientific_number_p(sci_num) " + "CommonSymbols.NIL != scientific_numbers.scientific_number_p(sci_num) ") + sci_num;
        assert NIL != subl_promotions.positive_integer_p(zeros) : "! subl_promotions.positive_integer_p(zeros) " + ("subl_promotions.positive_integer_p(zeros) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(zeros) ") + zeros;
        final SubLObject significand = scientific_number_significand(sci_num);
        final SubLObject exponent = scientific_number_exponent(sci_num);
        final SubLObject new_significand = multiply(significand, expt(TEN_INTEGER, zeros));
        return new_scientific_number(new_significand, exponent);
    }

    public static final SubLObject cyc_scientific_number_from_string_alt(SubLObject string) {
        return com.cyc.cycjava.cycl.scientific_numbers.scientific_number_from_string(string, UNPROVIDED);
    }

    public static SubLObject cyc_scientific_number_from_string(final SubLObject string) {
        return scientific_number_from_string(string, UNPROVIDED);
    }

    /**
     * We make a scientific number from a string with (if non-null) sig-digits
     * significant digits.
     */
    @LispMethod(comment = "We make a scientific number from a string with (if non-null) sig-digits\r\nsignificant digits.\nWe make a scientific number from a string with (if non-null) sig-digits\nsignificant digits.")
    public static final SubLObject scientific_number_from_string_alt(SubLObject string, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = NIL;
        }
        if (NIL == number_utilities.extended_number_string_p(string)) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject significand = NIL;
            SubLObject exponent = NIL;
            SubLObject exponent_marker = find_if(ALPHA_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject exponent_string = (NIL != exponent_marker) ? ((SubLObject) (string_utilities.string_after(string, exponent_marker))) : $$$0;
            SubLObject significand_string = (NIL != exponent_marker) ? ((SubLObject) (string_utilities.string_upto(string, exponent_marker))) : string_utilities.copy_string(string);
            SubLObject negativeP = NIL;
            if (CHAR_hyphen == elt(significand_string, ZERO_INTEGER)) {
                negativeP = T;
                significand_string = string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED);
            } else {
                if (CHAR_plus == elt(significand_string, ZERO_INTEGER)) {
                    significand_string = string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED);
                }
            }
            if (CHAR_period == elt(significand_string, ZERO_INTEGER)) {
                significand_string = cconcatenate($$$0, significand_string);
            }
            {
                SubLObject decimal_position = string_utilities.char_position(CHAR_period, significand_string, UNPROVIDED);
                if (NIL != decimal_position) {
                    significand_string = remove(CHAR_period, significand_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    decimal_position = length(significand_string);
                }
                {
                    SubLObject first_significant_digit = com.cyc.cycjava.cycl.scientific_numbers.first_non_zero_digit_position(significand_string);
                    if ((NIL != negativeP) && (NIL != first_significant_digit)) {
                        significand_string = cconcatenate($str_alt8$_, significand_string);
                    }
                    if (NIL != first_significant_digit) {
                        significand = string_utilities.string_to_integer(significand_string);
                        exponent = add(string_utilities.string_to_integer(exponent_string), subtract(decimal_position, first_significant_digit, ONE_INTEGER));
                    } else {
                        significand = ZERO_INTEGER;
                    }
                    if (significand.numE(ZERO_INTEGER)) {
                        exponent = ZERO_INTEGER;
                    }
                }
            }
            {
                SubLObject new_sci_num = com.cyc.cycjava.cycl.scientific_numbers.new_scientific_number(significand, exponent);
                if (NIL != sig_digits) {
                    {
                        SubLObject new_sig_digits = com.cyc.cycjava.cycl.scientific_numbers.cyc_scientific_number_significant_digit_count(new_sci_num);
                        if (new_sig_digits.numG(sig_digits)) {
                            return number_utilities.significant_digits(new_sci_num, sig_digits);
                        } else {
                            if (new_sig_digits.numL(sig_digits)) {
                                return com.cyc.cycjava.cycl.scientific_numbers.scientific_number_add_significant_zeros(new_sci_num, subtract(sig_digits, new_sig_digits));
                            } else {
                                return new_sci_num;
                            }
                        }
                    }
                } else {
                    return new_sci_num;
                }
            }
        }
    }

    /**
     * We make a scientific number from a string with (if non-null) sig-digits
     * significant digits.
     */
    @LispMethod(comment = "We make a scientific number from a string with (if non-null) sig-digits\r\nsignificant digits.\nWe make a scientific number from a string with (if non-null) sig-digits\nsignificant digits.")
    public static SubLObject scientific_number_from_string(final SubLObject string, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = NIL;
        }
        if (NIL == number_utilities.extended_number_string_p(string)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject significand = NIL;
        SubLObject exponent = NIL;
        final SubLObject exponent_marker = find_if(ALPHA_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject exponent_string = (NIL != exponent_marker) ? string_utilities.string_after(string, exponent_marker) : $$$0;
        SubLObject significand_string = (NIL != exponent_marker) ? string_utilities.string_upto(string, exponent_marker) : string_utilities.copy_string(string);
        SubLObject negativeP = NIL;
        if (CHAR_hyphen.eql(elt(significand_string, ZERO_INTEGER))) {
            negativeP = T;
            significand_string = string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED);
        } else
            if (CHAR_plus.eql(elt(significand_string, ZERO_INTEGER))) {
                significand_string = string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED);
            }

        if (CHAR_period.eql(elt(significand_string, ZERO_INTEGER))) {
            significand_string = cconcatenate($$$0, significand_string);
        }
        SubLObject decimal_position = string_utilities.char_position(CHAR_period, significand_string, UNPROVIDED);
        if (NIL != decimal_position) {
            significand_string = remove(CHAR_period, significand_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            decimal_position = length(significand_string);
        }
        final SubLObject first_significant_digit = first_non_zero_digit_position(significand_string);
        if ((NIL != negativeP) && (NIL != first_significant_digit)) {
            significand_string = cconcatenate($str8$_, significand_string);
        }
        if (NIL != first_significant_digit) {
            significand = string_utilities.string_to_integer(significand_string);
            exponent = add(string_utilities.string_to_integer(exponent_string), subtract(decimal_position, first_significant_digit, ONE_INTEGER));
        } else {
            significand = ZERO_INTEGER;
        }
        if (significand.numE(ZERO_INTEGER)) {
            exponent = ZERO_INTEGER;
        }
        final SubLObject new_sci_num = new_scientific_number(significand, exponent);
        if (NIL == sig_digits) {
            return new_sci_num;
        }
        final SubLObject new_sig_digits = cyc_scientific_number_significant_digit_count(new_sci_num);
        if (new_sig_digits.numG(sig_digits)) {
            return number_utilities.significant_digits(new_sci_num, sig_digits);
        }
        if (new_sig_digits.numL(sig_digits)) {
            return scientific_number_add_significant_zeros(new_sci_num, subtract(sig_digits, new_sig_digits));
        }
        return new_sci_num;
    }

    public static final SubLObject first_non_zero_digit_position_alt(SubLObject string) {
        return position_if(NON_ZERO_DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject first_non_zero_digit_position(final SubLObject string) {
        return position_if(NON_ZERO_DIGIT_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject non_zero_digit_char_p_alt(SubLObject v_char) {
        return makeBoolean((NIL != digit_char_p(v_char, UNPROVIDED)) && (v_char != CHAR_0));
    }

    public static SubLObject non_zero_digit_char_p(final SubLObject v_char) {
        return makeBoolean((NIL != digit_char_p(v_char, UNPROVIDED)) && (!v_char.eql(CHAR_0)));
    }

    /**
     * INPUTS should be a list the first element of which is the scientific number and
     * and second element of which, if present, should be the exponent marker (in the
     * form of a string.  Notably, the function will return "0" for
     * (#$ScientificNumberFn 0 X), regardless of X or the presence or choice of exponent
     * marker.
     */
    @LispMethod(comment = "INPUTS should be a list the first element of which is the scientific number and\r\nand second element of which, if present, should be the exponent marker (in the\r\nform of a string.  Notably, the function will return \"0\" for\r\n(#$ScientificNumberFn 0 X), regardless of X or the presence or choice of exponent\r\nmarker.\nINPUTS should be a list the first element of which is the scientific number and\nand second element of which, if present, should be the exponent marker (in the\nform of a string.  Notably, the function will return \"0\" for\n(#$ScientificNumberFn 0 X), regardless of X or the presence or choice of exponent\nmarker.")
    public static final SubLObject cyc_scientific_number_to_string_alt(SubLObject inputs) {
        {
            SubLObject scientific_number = NIL;
            SubLObject exponent_marker = $$$e;
            if (length(inputs).numE(ONE_INTEGER)) {
                scientific_number = inputs.first();
            } else {
                scientific_number = inputs.first();
                exponent_marker = second(inputs);
            }
            if (!((NIL != com.cyc.cycjava.cycl.scientific_numbers.cyc_scientific_number_p(scientific_number)) && exponent_marker.isString())) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject significand = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(scientific_number);
                if (significand.isZero()) {
                    return $$$0;
                }
                {
                    SubLObject significand_string = string_utilities.str(significand);
                    SubLObject exponent = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_exponent(scientific_number);
                    SubLObject exponent_string = string_utilities.str(exponent);
                    SubLObject sign = NIL;
                    if (CHAR_hyphen == elt(significand_string, ZERO_INTEGER)) {
                        sign = $str_alt8$_;
                        significand_string = string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED);
                    } else {
                        sign = $str_alt11$;
                    }
                    if (length(significand_string).numG(ONE_INTEGER)) {
                        significand_string = cconcatenate(string_utilities.substring(significand_string, ZERO_INTEGER, ONE_INTEGER), new SubLObject[]{ $str_alt12$_, string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED) });
                    }
                    return cconcatenate(sign, new SubLObject[]{ significand_string, exponent_marker, exponent_string });
                }
            }
        }
    }

    /**
     * INPUTS should be a list the first element of which is the scientific number and
     * and second element of which, if present, should be the exponent marker (in the
     * form of a string.  Notably, the function will return "0" for
     * (#$ScientificNumberFn 0 X), regardless of X or the presence or choice of exponent
     * marker.
     */
    @LispMethod(comment = "INPUTS should be a list the first element of which is the scientific number and\r\nand second element of which, if present, should be the exponent marker (in the\r\nform of a string.  Notably, the function will return \"0\" for\r\n(#$ScientificNumberFn 0 X), regardless of X or the presence or choice of exponent\r\nmarker.\nINPUTS should be a list the first element of which is the scientific number and\nand second element of which, if present, should be the exponent marker (in the\nform of a string.  Notably, the function will return \"0\" for\n(#$ScientificNumberFn 0 X), regardless of X or the presence or choice of exponent\nmarker.")
    public static SubLObject cyc_scientific_number_to_string(final SubLObject inputs) {
        SubLObject scientific_number = NIL;
        SubLObject exponent_marker = $$$e;
        if (length(inputs).numE(ONE_INTEGER)) {
            scientific_number = inputs.first();
        } else {
            scientific_number = inputs.first();
            exponent_marker = second(inputs);
        }
        if ((NIL == cyc_scientific_number_p(scientific_number)) || (!exponent_marker.isString())) {
            relation_evaluation.throw_unevaluatable();
        }
        return scientific_number_to_string(scientific_number, exponent_marker);
    }

    public static SubLObject scientific_number_to_string(final SubLObject scientific_number, SubLObject exponent_marker) {
        if (exponent_marker == UNPROVIDED) {
            exponent_marker = $$$e;
        }
        final SubLObject significand = scientific_number_significand(scientific_number);
        if (significand.isZero()) {
            return $$$0;
        }
        SubLObject significand_string = string_utilities.str(significand);
        final SubLObject exponent = scientific_number_exponent(scientific_number);
        final SubLObject exponent_string = string_utilities.str(exponent);
        SubLObject sign = NIL;
        if (CHAR_hyphen.eql(elt(significand_string, ZERO_INTEGER))) {
            sign = $str8$_;
            significand_string = string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED);
        } else {
            sign = $str12$;
        }
        if (length(significand_string).numG(ONE_INTEGER)) {
            significand_string = cconcatenate(string_utilities.substring(significand_string, ZERO_INTEGER, ONE_INTEGER), new SubLObject[]{ $str13$_, string_utilities.substring(significand_string, ONE_INTEGER, UNPROVIDED) });
        }
        return cconcatenate(sign, new SubLObject[]{ significand_string, exponent_marker, exponent_string });
    }

    public static final SubLObject cyc_scientific_number_from_subl_real_alt(SubLObject number) {
        return com.cyc.cycjava.cycl.scientific_numbers.scientific_number_from_subl_real(number, UNPROVIDED);
    }

    public static SubLObject cyc_scientific_number_from_subl_real(final SubLObject number) {
        return scientific_number_from_subl_real(number, UNPROVIDED);
    }

    public static final SubLObject scientific_number_from_subl_real_alt(SubLObject number, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = NIL;
        }
        return com.cyc.cycjava.cycl.scientific_numbers.scientific_number_from_string(string_utilities.str(number), sig_digits);
    }

    public static SubLObject scientific_number_from_subl_real(final SubLObject number, SubLObject sig_digits) {
        if (sig_digits == UNPROVIDED) {
            sig_digits = NIL;
        }
        return scientific_number_from_string(string_utilities.str(number), sig_digits);
    }

    public static final SubLObject cyc_scientific_number_to_subl_real_alt(SubLObject scientific_number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject number_string = com.cyc.cycjava.cycl.scientific_numbers.cyc_scientific_number_to_string(list(scientific_number));
                thread.resetMultipleValues();
                {
                    SubLObject number = read_from_string_ignoring_errors(number_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject other = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return number;
                }
            }
        }
    }

    public static SubLObject cyc_scientific_number_to_subl_real(final SubLObject scientific_number) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    return scientific_number_to_subl_real(scientific_number);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        relation_evaluation.throw_unevaluatable();
        return NIL;
    }

    public static SubLObject scientific_number_to_subl_real(final SubLObject scientific_number) {
        if (NIL != scientific_number_zero_p(scientific_number)) {
            return ZERO_INTEGER;
        }
        final SubLObject sig = scientific_number_significand(scientific_number);
        final SubLObject exp = scientific_number_exponent(scientific_number);
        if (exp.numG(SIXTEEN_INTEGER) || exp.numL($int$_8)) {
            Errors.error($str20$Magnitude_of_exponent_of__S_is_to, scientific_number);
        }
        final SubLObject real_sig = multiply($float$10_0, sig, expt(TEN_INTEGER, minus(number_utilities.decimal_integer_length(sig))));
        return number_utilities.significant_digits(multiply(real_sig, expt(TEN_INTEGER, exp)), scientific_number_significant_digit_count(scientific_number));
    }

    static private final SubLString $str_alt8$_ = makeString("-");

    static private final SubLString $str_alt12$_ = makeString(".");

    public static SubLObject scientific_number_to_integer_or_fraction(final SubLObject scientific_number, SubLObject reduce_fractionsP) {
        if (reduce_fractionsP == UNPROVIDED) {
            reduce_fractionsP = NIL;
        }
        if (NIL != scientific_number_zero_p(scientific_number)) {
            return ZERO_INTEGER;
        }
        if (NIL != scientific_number_integer_p(scientific_number)) {
            final SubLObject real = scientific_number_to_subl_real(scientific_number);
            final SubLObject ans = (real.isInteger()) ? real : truncate(real, UNPROVIDED);
            return ans;
        }
        final SubLObject num = scientific_number_significand(scientific_number);
        final SubLObject exp = number_utilities.f_1_(subtract(number_utilities.decimal_integer_length(scientific_number_significand(scientific_number)), scientific_number_exponent(scientific_number)));
        final SubLObject den = scientific_number_to_integer_or_fraction(new_scientific_number(ONE_INTEGER, exp), UNPROVIDED);
        final SubLObject fract = fraction_utilities.new_fraction(num, den);
        return NIL != reduce_fractionsP ? fraction_utilities.fraction_reduce(fract) : fract;
    }

    public static final SubLObject cyc_scientific_number_significant_digit_count_alt(SubLObject scientific_number) {
        {
            SubLObject significand = com.cyc.cycjava.cycl.scientific_numbers.scientific_number_significand(scientific_number);
            return number_utilities.decimal_integer_length(significand);
        }
    }

    public static SubLObject cyc_scientific_number_significant_digit_count(final SubLObject scientific_number) {
        return scientific_number_significant_digit_count(scientific_number);
    }

    public static SubLObject scientific_number_significant_digit_count(final SubLObject scientific_number) {
        final SubLObject significand = scientific_number_significand(scientific_number);
        return number_utilities.decimal_integer_length(significand);
    }

    public static SubLObject scientific_number_decimal_places(final SubLObject scientific_number) {
        return max(ZERO_INTEGER, subtract(scientific_number_significant_digit_count(scientific_number), ONE_INTEGER, scientific_number_exponent(scientific_number)));
    }

    public static SubLObject declare_scientific_numbers_file() {
        declareFunction("cyc_scientific_number_p", "CYC-SCIENTIFIC-NUMBER-P", 1, 0, false);
        declareFunction("scientific_number_p", "SCIENTIFIC-NUMBER-P", 1, 0, false);
        declareFunction("new_scientific_number", "NEW-SCIENTIFIC-NUMBER", 2, 0, false);
        declareFunction("new_scientific_number_from_integer", "NEW-SCIENTIFIC-NUMBER-FROM-INTEGER", 1, 1, false);
        declareFunction("scientific_number_significand", "SCIENTIFIC-NUMBER-SIGNIFICAND", 1, 0, false);
        declareFunction("scientific_number_exponent", "SCIENTIFIC-NUMBER-EXPONENT", 1, 0, false);
        declareFunction("copy_scientific_number", "COPY-SCIENTIFIC-NUMBER", 1, 0, false);
        declareFunction("scientific_number_zero_p", "SCIENTIFIC-NUMBER-ZERO-P", 1, 0, false);
        declareFunction("scientific_number_integer_p", "SCIENTIFIC-NUMBER-INTEGER-P", 1, 0, false);
        declareFunction("scientific_number_minus_p", "SCIENTIFIC-NUMBER-MINUS-P", 1, 0, false);
        declareFunction("scientific_number_plus_p", "SCIENTIFIC-NUMBER-PLUS-P", 1, 0, false);
        declareFunction("scientific_number_non_negative_p", "SCIENTIFIC-NUMBER-NON-NEGATIVE-P", 1, 0, false);
        declareFunction("scientific_number_add_significant_zeros", "SCIENTIFIC-NUMBER-ADD-SIGNIFICANT-ZEROS", 2, 0, false);
        declareFunction("cyc_scientific_number_from_string", "CYC-SCIENTIFIC-NUMBER-FROM-STRING", 1, 0, false);
        declareFunction("scientific_number_from_string", "SCIENTIFIC-NUMBER-FROM-STRING", 1, 1, false);
        declareFunction("first_non_zero_digit_position", "FIRST-NON-ZERO-DIGIT-POSITION", 1, 0, false);
        declareFunction("non_zero_digit_char_p", "NON-ZERO-DIGIT-CHAR-P", 1, 0, false);
        declareFunction("cyc_scientific_number_to_string", "CYC-SCIENTIFIC-NUMBER-TO-STRING", 1, 0, false);
        declareFunction("scientific_number_to_string", "SCIENTIFIC-NUMBER-TO-STRING", 1, 1, false);
        declareFunction("cyc_scientific_number_from_subl_real", "CYC-SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 0, false);
        declareFunction("scientific_number_from_subl_real", "SCIENTIFIC-NUMBER-FROM-SUBL-REAL", 1, 1, false);
        declareFunction("cyc_scientific_number_to_subl_real", "CYC-SCIENTIFIC-NUMBER-TO-SUBL-REAL", 1, 0, false);
        declareFunction("scientific_number_to_subl_real", "SCIENTIFIC-NUMBER-TO-SUBL-REAL", 1, 0, false);
        declareFunction("scientific_number_to_integer_or_fraction", "SCIENTIFIC-NUMBER-TO-INTEGER-OR-FRACTION", 1, 1, false);
        declareFunction("cyc_scientific_number_significant_digit_count", "CYC-SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT", 1, 0, false);
        declareFunction("scientific_number_significant_digit_count", "SCIENTIFIC-NUMBER-SIGNIFICANT-DIGIT-COUNT", 1, 0, false);
        declareFunction("scientific_number_decimal_places", "SCIENTIFIC-NUMBER-DECIMAL-PLACES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_scientific_numbers_file() {
        return NIL;
    }

    public static SubLObject setup_scientific_numbers_file() {
        register_kb_function(CYC_SCIENTIFIC_NUMBER_P);
        register_kb_function(CYC_SCIENTIFIC_NUMBER_FROM_STRING);
        register_kb_function(CYC_SCIENTIFIC_NUMBER_TO_STRING);
        register_kb_function(CYC_SCIENTIFIC_NUMBER_FROM_SUBL_REAL);
        register_kb_function(CYC_SCIENTIFIC_NUMBER_TO_SUBL_REAL);
        register_kb_function(CYC_SCIENTIFIC_NUMBER_SIGNIFICANT_DIGIT_COUNT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_scientific_numbers_file();
    }

    @Override
    public void initializeVariables() {
        init_scientific_numbers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_scientific_numbers_file();
    }

    static {
    }
}

/**
 * Total time: 192 ms
 */
