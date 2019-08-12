/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      EXTENDED-NUMBERS
 * source file: /cyc/top/cycl/extended-numbers.lisp
 * created:     2019/07/03 17:37:52
 */
public final class extended_numbers extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new extended_numbers();

 public static final String myName = "com.cyc.cycjava.cycl.extended_numbers";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $fraction_core_constants$ = makeSymbol("*FRACTION-CORE-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $include_fractions_in_extended_numbersP$ = makeSymbol("*INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $check_new_vs_old_extended_number_mathP$ = makeSymbol("*CHECK-NEW-VS-OLD-EXTENDED-NUMBER-MATH?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYC_EXTENDED_NUMBER_P = makeSymbol("CYC-EXTENDED-NUMBER-P");

    private static final SubLList $list1 = list(reader_make_constant_shell("SimpleFractionFn"), reader_make_constant_shell("MixedFractionFn"), reader_make_constant_shell("DecimalFractionFn"), reader_make_constant_shell("NegativeMixedFractionFn"));

    private static final SubLSymbol $sym2$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol EXTENDED_NUMBER_P = makeSymbol("EXTENDED-NUMBER-P");





    private static final SubLSymbol POSSIBLY_INFINITE_OR_EXTENDED_NUMBER_P = makeSymbol("POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-P");

    private static final SubLString $str7$___TimesFn__S__S_______Old___S___ = makeString("(#$TimesFn ~S ~S)...~% Old: ~S~% New: ~S");

    private static final SubLString $str8$___QuotientFn__S__S_______Old___S = makeString("(#$QuotientFn ~S ~S)...~% Old: ~S~% New: ~S");

    private static final SubLString $str9$___PlusFn__S__S_______Old___S___N = makeString("(#$PlusFn ~S ~S)...~% Old: ~S~% New: ~S");

    private static final SubLString $str10$___MinusFn__S__S_______Old___S___ = makeString("(#$MinusFn ~S ~S)...~% Old: ~S~% New: ~S");

    private static final SubLString $str12$Raising__S_to_the_power__S_would_ = makeString("Raising ~S to the power ~S would result in an imaginary number.");

    private static final SubLString $str13$Can_t_do_modulo_with_0_base_ = makeString("Can't do modulo with 0 base.");

    private static final SubLString $str14$Looks_like_not_enough_significant = makeString("Looks like not enough significant digits to compute a modulo.");

    private static final SubLSymbol TEST_ZEROP = makeSymbol("TEST-ZEROP");

    private static final SubLList $list23 = list(list(list(ZERO_INTEGER), T), list(list(NIL), NIL), list(list(list(reader_make_constant_shell("SimpleFractionFn"), ZERO_INTEGER, TEN_INTEGER)), NIL));

    // Definitions
    public static final SubLObject cyc_extended_number_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.extended_numbers.extended_number_p(v_object);
    }

    // Definitions
    public static SubLObject cyc_extended_number_p(final SubLObject v_object) {
        return extended_number_p(v_object);
    }

    public static SubLObject initialize_fraction_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym2$VALID_CONSTANT_, $fraction_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_fraction_kb_loaded();
        } else {
            kb_control_vars.unset_fraction_kb_loaded();
        }
        return kb_control_vars.fraction_kb_loaded_p();
    }

    public static SubLObject include_fractions_in_extended_numbersP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $include_fractions_in_extended_numbersP$.getDynamicValue(thread)) && (NIL != kb_control_vars.fraction_kb_loaded_p()));
    }

    public static final SubLObject extended_number_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() || (NIL != scientific_numbers.scientific_number_p(v_object)));
    }

    public static SubLObject extended_number_p(final SubLObject v_object) {
        return makeBoolean((v_object.isNumber() || (NIL != scientific_numbers.scientific_number_p(v_object))) || ((NIL != include_fractions_in_extended_numbersP()) && ((NIL != fraction_utilities.fraction_p(v_object)) || (NIL != collection_defns.fractionP(v_object, UNPROVIDED)))));
    }

    public static final SubLObject extended_number_zero_p_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_zero_p(ex_num);
        } else {
            return zerop(ex_num);
        }
    }

    public static SubLObject extended_number_zero_p(final SubLObject ex_num) {
        if (NIL == extended_number_p(ex_num)) {
            return NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_zero_p(ex_num);
        }
        if (ex_num.isNumber()) {
            return zerop(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_zero_p(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return extended_number_zero_p(math_expression_utilities.fraction_from_el(ex_num));
        }
        return NIL;
    }

    public static final SubLObject extended_number_minus_p_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_minus_p(ex_num);
        } else {
            return minusp(ex_num);
        }
    }

    public static SubLObject extended_number_minus_p(final SubLObject ex_num) {
        if (NIL == extended_number_p(ex_num)) {
            return NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_minus_p(ex_num);
        }
        if (ex_num.isNumber()) {
            return minusp(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_minus_p(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return extended_number_minus_p(math_expression_utilities.fraction_from_el(ex_num));
        }
        return NIL;
    }

    public static final SubLObject extended_number_plus_p_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_plus_p(ex_num);
        } else {
            return plusp(ex_num);
        }
    }

    public static SubLObject extended_number_plus_p(final SubLObject ex_num) {
        if (NIL == extended_number_p(ex_num)) {
            return NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_plus_p(ex_num);
        }
        if (ex_num.isNumber()) {
            return plusp(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_plus_p(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return extended_number_plus_p(math_expression_utilities.fraction_from_el(ex_num));
        }
        return NIL;
    }

    public static final SubLObject extended_number_non_negative_p_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_non_negative_p(ex_num);
        } else {
            return number_utilities.non_negative_number_p(ex_num);
        }
    }

    public static SubLObject extended_number_non_negative_p(final SubLObject ex_num) {
        if (NIL == extended_number_p(ex_num)) {
            return NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_non_negative_p(ex_num);
        }
        if (ex_num.isNumber()) {
            return number_utilities.non_negative_number_p(ex_num);
        }
        if (NIL != include_fractions_in_extended_numbersP()) {
            return makeBoolean(NIL == extended_number_minus_p(ex_num));
        }
        return NIL;
    }

    public static SubLObject extended_number_integer_p(final SubLObject ex_num) {
        if (NIL == extended_number_p(ex_num)) {
            return NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_integer_p(ex_num);
        }
        if (ex_num.isNumber()) {
            return integerp(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_integer_p(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return extended_number_integer_p(math_expression_utilities.fraction_from_el(ex_num));
        }
        return NIL;
    }

    public static final SubLObject extended_number_abs_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_abs(ex_num);
        } else {
            return abs(ex_num);
        }
    }

    public static SubLObject extended_number_abs(final SubLObject ex_num) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_abs(ex_num);
        }
        if (ex_num.isNumber()) {
            return abs(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return fraction_or_number_to_el(extended_number_abs(math_expression_utilities.fraction_from_el(ex_num)));
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_abs(ex_num);
        }
        return NIL;
    }

    public static final SubLObject extended_number_negate_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_negate(ex_num);
        } else {
            return minus(ex_num);
        }
    }

    public static SubLObject extended_number_negate(final SubLObject ex_num) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_negate(ex_num);
        }
        if (ex_num.isNumber()) {
            return minus(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return fraction_or_number_to_el(extended_number_negate(math_expression_utilities.fraction_from_el(ex_num)));
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_minus(ex_num, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject copy_extended_number_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.copy_scientific_number(ex_num);
        } else {
            return ex_num;
        }
    }

    public static SubLObject copy_extended_number(final SubLObject ex_num) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.copy_scientific_number(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            return fraction_or_number_to_el(copy_extended_number(math_expression_utilities.fraction_from_el(ex_num)));
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.copy_fraction(ex_num);
        }
        return ex_num;
    }

    public static SubLObject cyc_positive_infinity_p(final SubLObject v_object) {
        return eql(v_object, $$PlusInfinity);
    }

    public static SubLObject cyc_negative_infinity_p(final SubLObject v_object) {
        return eql(v_object, $$MinusInfinity);
    }

    public static SubLObject cyc_infinite_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != cyc_positive_infinity_p(v_object)) || (NIL != cyc_negative_infinity_p(v_object)));
    }

    public static SubLObject cyc_infinite_range_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != cycl_grammar.cycl_nat_p(v_object)) {
            thread.resetMultipleValues();
            final SubLObject unit = quantities.explode_interval(v_object);
            final SubLObject num1 = thread.secondMultipleValue();
            final SubLObject num2 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((NIL != cyc_infinite_number_p(num1)) || (NIL != cyc_infinite_number_p(num2)));
        }
        return NIL;
    }

    public static SubLObject possibly_infinite_or_extended_number_p(final SubLObject v_object) {
        return makeBoolean((NIL != extended_number_p(v_object)) || (NIL != cyc_infinite_number_p(v_object)));
    }

    public static SubLObject possibly_infinite_or_extended_number_minus_p(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_minus_p(ex_num);
        }
        return cyc_negative_infinity_p(ex_num);
    }

    public static SubLObject possibly_infinite_or_extended_number_plus_p(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_plus_p(ex_num);
        }
        return cyc_positive_infinity_p(ex_num);
    }

    public static SubLObject possibly_infinite_or_extended_number_abs(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_abs(ex_num);
        }
        if (NIL != cyc_infinite_number_p(ex_num)) {
            return $$PlusInfinity;
        }
        return NIL;
    }

    public static SubLObject possibly_infinite_or_extended_number_negate(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_negate(ex_num);
        }
        if (NIL != cyc_positive_infinity_p(ex_num)) {
            return $$MinusInfinity;
        }
        if (NIL != cyc_negative_infinity_p(ex_num)) {
            return $$PlusInfinity;
        }
        return NIL;
    }

    public static SubLObject copy_possibly_infinite_or_extended_number(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.copy_scientific_number(ex_num);
        }
        return ex_num;
    }

    public static final SubLObject extended_numberE_alt(SubLObject ex_num0, SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_numberE(ex_num0, ex_num1, digits);
            } else {
                if (ex_num1.isInteger()) {
                    return scientific_number_utilities.scientific_number_integerE(ex_num0, ex_num1, digits);
                } else {
                    return scientific_number_utilities.scientific_numberE(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED), digits);
                }
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_numberE(ex_num0, ex_num1, digits);
                } else {
                    return scientific_number_utilities.scientific_numberE(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1, UNPROVIDED);
                }
            } else {
                if (NIL != digits) {
                    return numE(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
                } else {
                    return numE(ex_num0, ex_num1);
                }
            }
        }
    }

    public static SubLObject extended_numberE(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if (ex_num0.equal(ex_num1)) {
            return T;
        }
        return NIL != include_fractions_in_extended_numbersP() ? extended_numberE_int(ex_num0, ex_num1, digits) : extended_numberE_old(ex_num0, ex_num1, digits);
    }

    public static SubLObject extended_numberE_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            return extended_numberE_int(scientific_numbers.scientific_number_to_subl_real(ex_num0), ex_num1, NIL != digits ? digits : scientific_number_utilities.scientific_number_comparison_significant_digits(ex_num0, ex_num1));
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
            return extended_numberE_int(ex_num0, scientific_numbers.scientific_number_to_subl_real(ex_num1), NIL != digits ? digits : scientific_number_utilities.scientific_number_comparison_significant_digits(ex_num1, ex_num0));
        }
        if (NIL != collection_defns.fractionP(ex_num0, UNPROVIDED)) {
            return extended_numberE_int(math_expression_utilities.fraction_from_el(ex_num0), ex_num1, digits);
        }
        if (NIL != collection_defns.fractionP(ex_num1, UNPROVIDED)) {
            return extended_numberE_int(ex_num0, math_expression_utilities.fraction_from_el(ex_num1), digits);
        }
        if (NIL != fraction_utilities.fraction_p(ex_num0)) {
            return extended_numberE_int(fraction_utilities.fraction_to_number(ex_num0), ex_num1, digits);
        }
        if (NIL != fraction_utilities.fraction_p(ex_num1)) {
            return extended_numberE_int(fraction_utilities.fraction_to_number(ex_num1), ex_num0, digits);
        }
        if (NIL != subl_promotions.positive_integer_p(digits)) {
            return numE(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
        }
        return numE(ex_num0, ex_num1);
    }

    public static SubLObject extended_numberE_old(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_numberE(ex_num0, ex_num1, digits);
            }
            if (ex_num1.isInteger()) {
                return scientific_number_utilities.scientific_number_integerE(ex_num0, ex_num1, digits);
            }
            return scientific_number_utilities.scientific_numberE(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED), digits);
        } else
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_numberE(ex_num0, ex_num1, digits);
                }
                return scientific_number_utilities.scientific_numberE(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1, UNPROVIDED);
            } else {
                if (NIL != digits) {
                    return numE(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
                }
                return numE(ex_num0, ex_num1);
            }

    }

    public static final SubLObject extended_numberG_alt(SubLObject ex_num0, SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_numberG(ex_num0, ex_num1, digits);
            } else {
                if (ex_num1.isInteger()) {
                    return scientific_number_utilities.scientific_number_integerG(ex_num0, ex_num1, digits);
                } else {
                    return scientific_number_utilities.scientific_numberG(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED), digits);
                }
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_numberG(ex_num0, ex_num1, UNPROVIDED);
                } else {
                    return scientific_number_utilities.scientific_numberG(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1, digits);
                }
            } else {
                if (NIL != digits) {
                    return numG(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
                } else {
                    return numG(ex_num0, ex_num1);
                }
            }
        }
    }

    public static SubLObject extended_numberG(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        return NIL != include_fractions_in_extended_numbersP() ? extended_numberG_int(ex_num0, ex_num1, digits) : extended_numberG_old(ex_num0, ex_num1, digits);
    }

    public static SubLObject extended_numberG_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            return extended_numberG_int(scientific_numbers.scientific_number_to_subl_real(ex_num0), ex_num1, NIL != digits ? digits : scientific_number_utilities.scientific_number_comparison_significant_digits(ex_num0, ex_num1));
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
            return extended_numberG_int(ex_num0, scientific_numbers.scientific_number_to_subl_real(ex_num1), NIL != digits ? digits : scientific_number_utilities.scientific_number_comparison_significant_digits(ex_num1, ex_num0));
        }
        if (NIL != collection_defns.fractionP(ex_num0, UNPROVIDED)) {
            return extended_numberG_int(math_expression_utilities.fraction_from_el(ex_num0), ex_num1, digits);
        }
        if (NIL != collection_defns.fractionP(ex_num1, UNPROVIDED)) {
            return extended_numberG_int(ex_num0, math_expression_utilities.fraction_from_el(ex_num1), digits);
        }
        if (NIL != fraction_utilities.fraction_p(ex_num0)) {
            return extended_numberG_int(fraction_utilities.fraction_to_number(ex_num0), ex_num1, digits);
        }
        if (NIL != fraction_utilities.fraction_p(ex_num1)) {
            return extended_numberG_int(ex_num0, fraction_utilities.fraction_to_number(ex_num1), digits);
        }
        if (NIL != subl_promotions.positive_integer_p(digits)) {
            return numG(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
        }
        return numG(ex_num0, ex_num1);
    }

    public static SubLObject extended_numberG_old(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_numberG(ex_num0, ex_num1, digits);
            }
            if (ex_num1.isInteger()) {
                return scientific_number_utilities.scientific_number_integerG(ex_num0, ex_num1, digits);
            }
            return scientific_number_utilities.scientific_numberG(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED), digits);
        } else
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_numberG(ex_num0, ex_num1, UNPROVIDED);
                }
                return scientific_number_utilities.scientific_numberG(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1, digits);
            } else {
                if (NIL != digits) {
                    return numG(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
                }
                return numG(ex_num0, ex_num1);
            }

    }

    public static final SubLObject extended_numberGE_alt(SubLObject ex_num0, SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_numberGE(ex_num0, ex_num1, digits);
            } else {
                if (ex_num1.isInteger()) {
                    return scientific_number_utilities.scientific_number_integerGE(ex_num0, ex_num1, digits);
                } else {
                    return scientific_number_utilities.scientific_numberGE(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED), digits);
                }
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_numberGE(ex_num0, ex_num1, digits);
                } else {
                    return scientific_number_utilities.scientific_numberGE(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1, digits);
                }
            } else {
                if (NIL != digits) {
                    return numGE(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
                } else {
                    return numGE(ex_num0, ex_num1);
                }
            }
        }
    }

    public static SubLObject extended_numberGE(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        return NIL != include_fractions_in_extended_numbersP() ? extended_numberGE_int(ex_num0, ex_num1, digits) : extended_numberGE_old(ex_num0, ex_num1, digits);
    }

    public static SubLObject extended_numberGE_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return makeBoolean((NIL != extended_numberG(ex_num0, ex_num1, digits)) || (NIL != extended_numberE(ex_num0, ex_num1, digits)));
    }

    public static SubLObject extended_numberGE_old(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_numberGE(ex_num0, ex_num1, digits);
            }
            if (ex_num1.isInteger()) {
                return scientific_number_utilities.scientific_number_integerGE(ex_num0, ex_num1, digits);
            }
            return scientific_number_utilities.scientific_numberGE(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED), digits);
        } else
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_numberGE(ex_num0, ex_num1, digits);
                }
                return scientific_number_utilities.scientific_numberGE(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1, digits);
            } else {
                if (NIL != digits) {
                    return numGE(number_utilities.significant_digits(ex_num0, digits), number_utilities.significant_digits(ex_num1, digits));
                }
                return numGE(ex_num0, ex_num1);
            }

    }

    public static final SubLObject extended_numberL_alt(SubLObject ex_num0, SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.extended_numbers.extended_numberG(ex_num1, ex_num0, digits);
    }

    public static SubLObject extended_numberL(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return extended_numberG(ex_num1, ex_num0, digits);
    }

    public static final SubLObject extended_numberLE_alt(SubLObject ex_num0, SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return com.cyc.cycjava.cycl.extended_numbers.extended_numberGE(ex_num1, ex_num0, digits);
    }

    public static SubLObject extended_numberLE(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject digits) {
        if (digits == UNPROVIDED) {
            digits = NIL;
        }
        return extended_numberGE(ex_num1, ex_num0, digits);
    }

    public static SubLObject possibly_infinite_or_extended_numberLE(final SubLObject smaller, final SubLObject bigger) {
        if (NIL != cyc_negative_infinity_p(smaller)) {
            return possibly_infinite_or_extended_number_p(bigger);
        }
        if (NIL != cyc_positive_infinity_p(bigger)) {
            return possibly_infinite_or_extended_number_p(smaller);
        }
        return makeBoolean(((NIL != extended_number_p(smaller)) && (NIL != extended_number_p(bigger))) && (NIL != extended_numberLE(smaller, bigger, UNPROVIDED)));
    }

    public static SubLObject possibly_infinite_or_extended_numberE(final SubLObject smaller, final SubLObject bigger) {
        if ((NIL != cyc_infinite_number_p(smaller)) && (NIL != cyc_infinite_number_p(bigger))) {
            return equal(smaller, bigger);
        }
        return makeBoolean(((NIL != extended_number_p(smaller)) && (NIL != extended_number_p(bigger))) && (NIL != extended_numberE(smaller, bigger, UNPROVIDED)));
    }

    public static SubLObject possibly_infinite_or_extended_numberL(final SubLObject smaller, final SubLObject bigger) {
        if (NIL != cyc_negative_infinity_p(smaller)) {
            return makeBoolean((NIL != extended_number_p(bigger)) || (NIL != cyc_positive_infinity_p(bigger)));
        }
        if (NIL != cyc_positive_infinity_p(bigger)) {
            return makeBoolean((NIL != extended_number_p(smaller)) || (NIL != cyc_negative_infinity_p(smaller)));
        }
        return makeBoolean(((NIL != extended_number_p(smaller)) && (NIL != extended_number_p(bigger))) && (NIL != extended_numberL(smaller, bigger, UNPROVIDED)));
    }

    public static SubLObject extended_number_to_subl_real(final SubLObject ex_num) {
        if (ex_num.isNumber()) {
            return ex_num;
        }
        if (NIL != collection_defns.fractionP(ex_num, UNPROVIDED)) {
            return extended_number_to_subl_real(math_expression_utilities.fraction_from_el(ex_num));
        }
        if (NIL != fraction_utilities.fraction_p(ex_num)) {
            return fraction_utilities.fraction_to_number(ex_num);
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_numbers.scientific_number_to_subl_real(ex_num);
        }
        return NIL;
    }

    public static final SubLObject extended_number_times_alt(SubLObject ex_num0, SubLObject ex_num1) {
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_times(ex_num0, ex_num1);
            } else {
                if (ex_num1.isInteger()) {
                    return scientific_number_utilities.scientific_number_integer_times(ex_num0, ex_num1);
                } else {
                    return scientific_number_utilities.scientific_number_times(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
                }
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_number_times(ex_num0, ex_num1);
                } else {
                    return scientific_number_utilities.scientific_number_times(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
                }
            } else {
                return multiply(ex_num0, ex_num1);
            }
        }
    }

    public static SubLObject extended_number_times(final SubLObject ex_num0, final SubLObject ex_num1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if ((((NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue(thread)) && (NIL == collection_defns.fractionP(ex_num0, UNPROVIDED))) && (NIL == collection_defns.fractionP(ex_num1, UNPROVIDED))) && (!extended_number_times_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED).equal(extended_number_times_old(ex_num0, ex_num1)))) {
            Errors.warn($str7$___TimesFn__S__S_______Old___S___, new SubLObject[]{ ex_num0, ex_num1, extended_number_times_old(ex_num0, ex_num1), extended_number_times_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED) });
        }
        return NIL != include_fractions_in_extended_numbersP() ? extended_number_times_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED) : extended_number_times_old(ex_num0, ex_num1);
    }

    public static SubLObject extended_number_times_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject return_as_scientific_numberP, SubLObject max_significant_digits) {
        if (return_as_scientific_numberP == UNPROVIDED) {
            return_as_scientific_numberP = NIL;
        }
        if (max_significant_digits == UNPROVIDED) {
            max_significant_digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            return extended_number_times_int(scientific_numbers.scientific_number_to_integer_or_fraction(ex_num0, UNPROVIDED), ex_num1, T, NIL != max_significant_digits ? min(max_significant_digits, scientific_numbers.scientific_number_significant_digit_count(ex_num0)) : scientific_numbers.scientific_number_significant_digit_count(ex_num0));
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
            return extended_number_times_int(ex_num0, scientific_numbers.scientific_number_to_integer_or_fraction(ex_num1, UNPROVIDED), T, NIL != max_significant_digits ? min(max_significant_digits, scientific_numbers.scientific_number_significant_digit_count(ex_num1)) : scientific_numbers.scientific_number_significant_digit_count(ex_num1));
        }
        if (NIL != collection_defns.fractionP(ex_num0, UNPROVIDED)) {
            final SubLObject result = extended_number_times_int(math_expression_utilities.fraction_from_el(ex_num0), ex_num1, return_as_scientific_numberP, max_significant_digits);
            return fraction_or_number_to_el(result);
        }
        if (NIL != collection_defns.fractionP(ex_num1, UNPROVIDED)) {
            final SubLObject result = extended_number_times_int(ex_num0, math_expression_utilities.fraction_from_el(ex_num1), return_as_scientific_numberP, max_significant_digits);
            return fraction_or_number_to_el(result);
        }
        if ((NIL != fraction_utilities.fraction_p(ex_num0)) || (NIL != fraction_utilities.fraction_p(ex_num1))) {
            final SubLObject result = fraction_utilities.fraction_times2(ex_num0, ex_num1);
            return NIL != return_as_scientific_numberP ? scientific_numbers.scientific_number_from_subl_real(fraction_utilities.defractionify(result), max_significant_digits) : result;
        }
        final SubLObject result = multiply(ex_num0, ex_num1);
        return NIL != return_as_scientific_numberP ? scientific_numbers.scientific_number_from_subl_real(result, max_significant_digits) : result;
    }

    public static SubLObject extended_number_times_old(final SubLObject ex_num0, final SubLObject ex_num1) {
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_times(ex_num0, ex_num1);
            }
            if (ex_num1.isInteger()) {
                return scientific_number_utilities.scientific_number_integer_times(ex_num0, ex_num1);
            }
            return scientific_number_utilities.scientific_number_times(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
        } else {
            if (NIL == scientific_numbers.scientific_number_p(ex_num1)) {
                return multiply(ex_num0, ex_num1);
            }
            if (ex_num0.isInteger()) {
                return scientific_number_utilities.integer_scientific_number_times(ex_num0, ex_num1);
            }
            return scientific_number_utilities.scientific_number_times(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
        }
    }

    public static final SubLObject extended_number_quotient_alt(SubLObject ex_num0, SubLObject ex_num1) {
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_quotient(ex_num0, ex_num1);
            } else {
                if (ex_num1.isInteger()) {
                    return scientific_number_utilities.scientific_number_integer_quotient(ex_num0, ex_num1);
                } else {
                    return scientific_number_utilities.scientific_number_quotient(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
                }
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                if (ex_num0.isInteger()) {
                    return scientific_number_utilities.integer_scientific_number_quotient(ex_num0, ex_num1);
                } else {
                    return scientific_number_utilities.scientific_number_quotient(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
                }
            } else {
                return divide(ex_num0, ex_num1);
            }
        }
    }

    public static SubLObject extended_number_quotient(final SubLObject ex_num0, final SubLObject ex_num1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if ((((NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue(thread)) && (NIL == collection_defns.fractionP(ex_num0, UNPROVIDED))) && (NIL == collection_defns.fractionP(ex_num1, UNPROVIDED))) && (!extended_number_quotient_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED).equal(extended_number_quotient_old(ex_num0, ex_num1)))) {
            Errors.warn($str8$___QuotientFn__S__S_______Old___S, new SubLObject[]{ ex_num0, ex_num1, extended_number_quotient_old(ex_num0, ex_num1), extended_number_quotient_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED) });
        }
        return NIL != include_fractions_in_extended_numbersP() ? extended_number_quotient_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED) : extended_number_quotient_old(ex_num0, ex_num1);
    }

    public static SubLObject extended_number_quotient_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject return_as_scientific_numberP, SubLObject max_significant_digits) {
        if (return_as_scientific_numberP == UNPROVIDED) {
            return_as_scientific_numberP = NIL;
        }
        if (max_significant_digits == UNPROVIDED) {
            max_significant_digits = NIL;
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            return extended_number_quotient_int(scientific_numbers.scientific_number_to_integer_or_fraction(ex_num0, UNPROVIDED), ex_num1, T, NIL != max_significant_digits ? min(max_significant_digits, scientific_numbers.scientific_number_significant_digit_count(ex_num0)) : scientific_numbers.scientific_number_significant_digit_count(ex_num0));
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
            return extended_number_quotient_int(ex_num0, scientific_numbers.scientific_number_to_integer_or_fraction(ex_num1, UNPROVIDED), T, NIL != max_significant_digits ? min(max_significant_digits, scientific_numbers.scientific_number_significant_digit_count(ex_num1)) : scientific_numbers.scientific_number_significant_digit_count(ex_num1));
        }
        if (NIL != collection_defns.fractionP(ex_num0, UNPROVIDED)) {
            final SubLObject result = extended_number_quotient_int(math_expression_utilities.fraction_from_el(ex_num0), ex_num1, return_as_scientific_numberP, max_significant_digits);
            return fraction_or_number_to_el(result);
        }
        if (NIL != collection_defns.fractionP(ex_num1, UNPROVIDED)) {
            final SubLObject result = extended_number_quotient_int(ex_num0, math_expression_utilities.fraction_from_el(ex_num1), return_as_scientific_numberP, max_significant_digits);
            return fraction_or_number_to_el(result);
        }
        if ((NIL != fraction_utilities.fraction_p(ex_num0)) || (NIL != fraction_utilities.fraction_p(ex_num1))) {
            final SubLObject result = fraction_utilities.fraction_divide(ex_num0, ex_num1);
            return NIL != return_as_scientific_numberP ? scientific_numbers.scientific_number_from_subl_real(fraction_utilities.defractionify(result), max_significant_digits) : result;
        }
        if (NIL != return_as_scientific_numberP) {
            return scientific_numbers.scientific_number_from_subl_real(divide(ex_num0, ex_num1), max_significant_digits);
        }
        if (((ex_num0.isInteger() && ex_num1.isInteger()) && (NIL != include_fractions_in_extended_numbersP())) && (!mod(ex_num0, ex_num1).isZero())) {
            return math_expression_utilities.fraction_to_el(fraction_utilities.fraction_reduce(fraction_utilities.new_fraction(ex_num0, ex_num1)));
        }
        if ((ex_num0.isInteger() && ex_num1.isInteger()) && mod(ex_num0, ex_num1).isZero()) {
            return integerDivide(ex_num0, ex_num1);
        }
        return divide(ex_num0, ex_num1);
    }

    public static SubLObject extended_number_quotient_old(final SubLObject ex_num0, final SubLObject ex_num1) {
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_quotient(ex_num0, ex_num1);
            }
            if (ex_num1.isInteger()) {
                return scientific_number_utilities.scientific_number_integer_quotient(ex_num0, ex_num1);
            }
            return scientific_number_utilities.scientific_number_quotient(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
        } else {
            if (NIL == scientific_numbers.scientific_number_p(ex_num1)) {
                return divide(ex_num0, ex_num1);
            }
            if (ex_num0.isInteger()) {
                return scientific_number_utilities.integer_scientific_number_quotient(ex_num0, ex_num1);
            }
            return scientific_number_utilities.scientific_number_quotient(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
        }
    }

    public static final SubLObject extended_number_plus_alt(SubLObject ex_num0, SubLObject ex_num1) {
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_plus(ex_num0, ex_num1);
            } else {
                return scientific_number_utilities.scientific_number_plus(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_plus(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
            } else {
                return add(ex_num0, ex_num1);
            }
        }
    }

    public static SubLObject extended_number_plus(final SubLObject ex_num0, final SubLObject ex_num1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if ((((NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue(thread)) && (NIL == collection_defns.fractionP(ex_num0, UNPROVIDED))) && (NIL == collection_defns.fractionP(ex_num1, UNPROVIDED))) && (!extended_number_plus_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED).equal(extended_number_plus_old(ex_num0, ex_num1)))) {
            Errors.warn($str9$___PlusFn__S__S_______Old___S___N, new SubLObject[]{ ex_num0, ex_num1, extended_number_plus_old(ex_num0, ex_num1), extended_number_plus_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED) });
        }
        return NIL != include_fractions_in_extended_numbersP() ? extended_number_plus_int(ex_num0, ex_num1, UNPROVIDED, UNPROVIDED) : extended_number_plus_old(ex_num0, ex_num1);
    }

    public static SubLObject extended_number_plus_int(final SubLObject ex_num0, final SubLObject ex_num1, SubLObject return_as_scientific_numberP, SubLObject max_significant_digits) {
        if (return_as_scientific_numberP == UNPROVIDED) {
            return_as_scientific_numberP = NIL;
        }
        if (max_significant_digits == UNPROVIDED) {
            max_significant_digits = NIL;
        }
        if ((((((NIL != scientific_numbers.scientific_number_p(ex_num0)) || (NIL != scientific_numbers.scientific_number_p(ex_num1))) && (NIL == collection_defns.fractionP(ex_num0, UNPROVIDED))) && (NIL == fraction_utilities.fraction_p(ex_num0))) && (NIL == collection_defns.fractionP(ex_num1, UNPROVIDED))) && (NIL == fraction_utilities.fraction_p(ex_num1))) {
            return extended_number_plus_old(ex_num0, ex_num1);
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            return extended_number_plus_int(scientific_numbers.scientific_number_to_integer_or_fraction(ex_num0, UNPROVIDED), ex_num1, T, scientific_number_significant_digits_for_addition(ex_num0, max_significant_digits));
        }
        if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
            return extended_number_plus_int(ex_num0, scientific_numbers.scientific_number_to_integer_or_fraction(ex_num1, UNPROVIDED), T, scientific_number_significant_digits_for_addition(ex_num1, max_significant_digits));
        }
        if (NIL != collection_defns.fractionP(ex_num0, UNPROVIDED)) {
            return fraction_or_number_to_el(extended_number_plus_int(math_expression_utilities.fraction_from_el(ex_num0), ex_num1, return_as_scientific_numberP, max_significant_digits));
        }
        if (NIL != collection_defns.fractionP(ex_num1, UNPROVIDED)) {
            return fraction_or_number_to_el(extended_number_plus_int(ex_num0, math_expression_utilities.fraction_from_el(ex_num1), return_as_scientific_numberP, max_significant_digits));
        }
        if ((NIL != fraction_utilities.fraction_p(ex_num0)) || (NIL != fraction_utilities.fraction_p(ex_num1))) {
            final SubLObject result = fraction_utilities.fraction_add2(ex_num0, ex_num1);
            return NIL != return_as_scientific_numberP ? scientific_numbers.scientific_number_from_subl_real(fraction_utilities.defractionify(result), max_significant_digits) : result;
        }
        final SubLObject result = add(ex_num0, ex_num1);
        return NIL != return_as_scientific_numberP ? scientific_numbers.scientific_number_from_subl_real(result, max_significant_digits) : result;
    }

    public static SubLObject scientific_number_significant_digits_for_addition(final SubLObject ex_num0, final SubLObject max_significant_digits) {
        return NIL != scientific_numbers.scientific_number_zero_p(ex_num0) ? max_significant_digits : max(ONE_INTEGER, NIL != max_significant_digits ? min(max_significant_digits, scientific_numbers.scientific_number_significant_digit_count(ex_num0)) : scientific_numbers.scientific_number_significant_digit_count(ex_num0));
    }

    public static SubLObject extended_number_plus_old(final SubLObject ex_num0, final SubLObject ex_num1) {
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_plus(ex_num0, ex_num1);
            }
            return scientific_number_utilities.scientific_number_plus(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_plus(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
            }
            return add(ex_num0, ex_num1);
        }
    }

    public static final SubLObject extended_number_minus_alt(SubLObject ex_num0, SubLObject ex_num1) {
        SubLTrampolineFile.checkType(ex_num0, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(ex_num1, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_minus(ex_num0, ex_num1);
            } else {
                return scientific_number_utilities.scientific_number_minus(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
            }
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_minus(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
            } else {
                return subtract(ex_num0, ex_num1);
            }
        }
    }

    public static SubLObject extended_number_minus(final SubLObject ex_num0, final SubLObject ex_num1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if ((((NIL != $check_new_vs_old_extended_number_mathP$.getDynamicValue(thread)) && (NIL == collection_defns.fractionP(ex_num0, UNPROVIDED))) && (NIL == collection_defns.fractionP(ex_num1, UNPROVIDED))) && (!extended_number_minus_int(ex_num0, ex_num1).equal(extended_number_minus_old(ex_num0, ex_num1)))) {
            Errors.warn($str10$___MinusFn__S__S_______Old___S___, new SubLObject[]{ ex_num0, ex_num1, extended_number_minus_old(ex_num0, ex_num1), extended_number_minus_int(ex_num0, ex_num1) });
        }
        return NIL != include_fractions_in_extended_numbersP() ? extended_number_minus_int(ex_num0, ex_num1) : extended_number_minus_old(ex_num0, ex_num1);
    }

    public static SubLObject extended_number_minus_int(final SubLObject ex_num0, final SubLObject ex_num1) {
        return extended_number_plus_int(ex_num0, extended_number_negate(ex_num1), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject extended_number_minus_old(final SubLObject ex_num0, final SubLObject ex_num1) {
        assert NIL != extended_number_p(ex_num0) : "! extended_numbers.extended_number_p(ex_num0) " + ("extended_numbers.extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != extended_number_p(ex_num1) : "! extended_numbers.extended_number_p(ex_num1) " + ("extended_numbers.extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num1) ") + ex_num1;
        if (NIL != scientific_numbers.scientific_number_p(ex_num0)) {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_minus(ex_num0, ex_num1);
            }
            return scientific_number_utilities.scientific_number_minus(ex_num0, scientific_numbers.scientific_number_from_subl_real(ex_num1, UNPROVIDED));
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num1)) {
                return scientific_number_utilities.scientific_number_minus(scientific_numbers.scientific_number_from_subl_real(ex_num0, UNPROVIDED), ex_num1);
            }
            return subtract(ex_num0, ex_num1);
        }
    }

    public static SubLObject possibly_infinite_or_extended_number_times(final SubLObject ex_num0, final SubLObject ex_num1) {
        if ((NIL != extended_number_p(ex_num0)) && (NIL != extended_number_p(ex_num1))) {
            return extended_number_times(ex_num0, ex_num1);
        }
        if (((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != cyc_infinite_number_p(ex_num1))) && ex_num0.eql(ex_num1)) {
            return $$PlusInfinity;
        }
        if (((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != cyc_infinite_number_p(ex_num1))) && (!ex_num0.eql(ex_num1))) {
            return $$MinusInfinity;
        }
        if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != extended_number_plus_p(ex_num1))) {
            return ex_num0;
        }
        if ((NIL != cyc_infinite_number_p(ex_num1)) && (NIL != extended_number_plus_p(ex_num0))) {
            return ex_num1;
        }
        if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != extended_number_minus_p(ex_num1))) {
            return possibly_infinite_or_extended_number_negate(ex_num0);
        }
        if ((NIL != cyc_infinite_number_p(ex_num1)) && (NIL != extended_number_minus_p(ex_num0))) {
            return possibly_infinite_or_extended_number_negate(ex_num1);
        }
        return NIL;
    }

    public static SubLObject possibly_infinite_or_extended_number_plus(final SubLObject ex_num0, final SubLObject ex_num1) {
        if ((NIL != extended_number_p(ex_num0)) && (NIL != extended_number_p(ex_num1))) {
            return extended_number_plus(ex_num0, ex_num1);
        }
        if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != cyc_infinite_number_p(ex_num1))) {
            if (ex_num0.eql(ex_num1)) {
                return ex_num0;
            }
            return relation_evaluation.throw_unevaluatable();
        } else {
            if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != extended_number_p(ex_num1))) {
                return ex_num0;
            }
            if ((NIL != cyc_infinite_number_p(ex_num1)) && (NIL != extended_number_p(ex_num0))) {
                return ex_num1;
            }
            return NIL;
        }
    }

    public static SubLObject possibly_infinite_or_extended_number_quotient(final SubLObject ex_num0, final SubLObject ex_num1) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num0) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num0) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num0) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num0) ") + ex_num0;
        assert NIL != possibly_infinite_or_extended_number_p(ex_num1) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num1) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num1) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num1) ") + ex_num1;
        if ((NIL != extended_number_p(ex_num0)) && (NIL != extended_number_p(ex_num1))) {
            return extended_number_quotient(ex_num0, ex_num1);
        }
        if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != cyc_infinite_number_p(ex_num1))) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if ((NIL != extended_number_p(ex_num0)) && (NIL != cyc_infinite_number_p(ex_num1))) {
                return ZERO_INTEGER;
            }
            if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != extended_number_plus_p(ex_num1))) {
                return ex_num0;
            }
            if ((NIL != cyc_infinite_number_p(ex_num0)) && (NIL != extended_number_minus_p(ex_num1))) {
                return possibly_infinite_or_extended_number_negate(ex_num0);
            }
        }
        return NIL;
    }

    public static final SubLObject extended_number_min_alt(SubLObject ex_nums) {
        {
            SubLObject list_var = ex_nums;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, EXTENDED_NUMBER_P);
                }
            }
        }
        {
            SubLObject possible_min = ex_nums.first();
            SubLObject cdolist_list_var = ex_nums.rest();
            SubLObject ex_num = NIL;
            for (ex_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ex_num = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.extended_numbers.extended_numberL(ex_num, possible_min, UNPROVIDED)) {
                    possible_min = com.cyc.cycjava.cycl.extended_numbers.copy_extended_number(ex_num);
                }
            }
            return possible_min;
        }
    }

    public static SubLObject extended_number_min(final SubLObject ex_nums) {
        assert NIL != list_utilities.non_dotted_list_p(ex_nums) : "! list_utilities.non_dotted_list_p(ex_nums) " + ("list_utilities.non_dotted_list_p(ex_nums) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ex_nums) ") + ex_nums;
        SubLObject cdolist_list_var = ex_nums;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != extended_number_p(elem) : "! extended_numbers.extended_number_p(elem) " + ("extended_numbers.extended_number_p(elem) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject possible_min = ex_nums.first();
        cdolist_list_var = ex_nums.rest();
        SubLObject ex_num = NIL;
        ex_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != extended_numberL(ex_num, possible_min, UNPROVIDED)) {
                possible_min = copy_extended_number(ex_num);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ex_num = cdolist_list_var.first();
        } 
        return possible_min;
    }

    public static final SubLObject extended_number_max_alt(SubLObject ex_nums) {
        {
            SubLObject list_var = ex_nums;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, EXTENDED_NUMBER_P);
                }
            }
        }
        {
            SubLObject possible_min = ex_nums.first();
            SubLObject cdolist_list_var = ex_nums.rest();
            SubLObject ex_num = NIL;
            for (ex_num = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ex_num = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.extended_numbers.extended_numberG(ex_num, possible_min, UNPROVIDED)) {
                    possible_min = com.cyc.cycjava.cycl.extended_numbers.copy_extended_number(ex_num);
                }
            }
            return possible_min;
        }
    }

    public static SubLObject extended_number_max(final SubLObject ex_nums) {
        assert NIL != list_utilities.non_dotted_list_p(ex_nums) : "! list_utilities.non_dotted_list_p(ex_nums) " + ("list_utilities.non_dotted_list_p(ex_nums) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ex_nums) ") + ex_nums;
        SubLObject cdolist_list_var = ex_nums;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != extended_number_p(elem) : "! extended_numbers.extended_number_p(elem) " + ("extended_numbers.extended_number_p(elem) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject possible_min = ex_nums.first();
        cdolist_list_var = ex_nums.rest();
        SubLObject ex_num = NIL;
        ex_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != extended_numberG(ex_num, possible_min, UNPROVIDED)) {
                possible_min = copy_extended_number(ex_num);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ex_num = cdolist_list_var.first();
        } 
        return possible_min;
    }

    public static final SubLObject extended_number_sqrt_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_sqrt(ex_num);
        } else {
            return sqrt(ex_num);
        }
    }

    public static SubLObject extended_number_sqrt(final SubLObject ex_num) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_sqrt(ex_num);
        }
        if (ex_num.isNumber()) {
            return sqrt(ex_num);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            final SubLObject result = extended_number_sqrt(math_expression_utilities.fraction_from_el(ex_num));
            return fraction_or_number_to_el(result);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_sqrt(ex_num);
        }
        return NIL;
    }

    public static final SubLObject extended_number_log_alt(SubLObject ex_num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $exp1$.getGlobalValue();
        }
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        SubLTrampolineFile.checkType(base, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_log(ex_num, base);
        } else {
            return log(ex_num, base);
        }
    }

    public static SubLObject extended_number_log(final SubLObject ex_num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $exp1$.getGlobalValue();
        }
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_log(ex_num, base);
        }
        if (ex_num.isNumber()) {
            return log(ex_num, base);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
            final SubLObject result = extended_number_log(math_expression_utilities.fraction_from_el(ex_num), base);
            return fraction_or_number_to_el(result);
        }
        if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
            return fraction_utilities.fraction_log(ex_num, base);
        }
        return NIL;
    }

    public static final SubLObject extended_number_expt_alt(SubLObject base, SubLObject ex_num) {
        SubLTrampolineFile.checkType(base, NUMBERP);
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_expt(base, ex_num);
        } else {
            return expt(base, ex_num);
        }
    }

    public static SubLObject extended_number_expt(final SubLObject base, final SubLObject ex_num) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_zero_p(ex_num)) {
            return ONE_INTEGER;
        }
        if ((NIL != extended_number_minus_p(base)) && (NIL == extended_number_integer_p(ex_num))) {
            Errors.error($str12$Raising__S_to_the_power__S_would_, base, ex_num);
        } else
            if (NIL != power_too_largeP(base, ex_num)) {
                relation_evaluation.throw_unevaluatable();
            } else {
                if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
                    final SubLObject result = extended_number_expt(base, math_expression_utilities.fraction_from_el(ex_num));
                    return fraction_or_number_to_el(result);
                }
                if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(base, UNPROVIDED))) {
                    final SubLObject result = extended_number_expt(math_expression_utilities.fraction_from_el(base), ex_num);
                    return fraction_or_number_to_el(result);
                }
                if ((NIL != include_fractions_in_extended_numbersP()) && ((NIL != fraction_utilities.fraction_p(base)) || (NIL != fraction_utilities.fraction_p(ex_num)))) {
                    return fraction_utilities.fraction_expt(base, ex_num);
                }
                if (NIL != scientific_numbers.scientific_number_p(base)) {
                    final SubLObject digits = scientific_numbers.scientific_number_significant_digit_count(base);
                    return scientific_numbers.scientific_number_from_subl_real(extended_number_expt(scientific_numbers.scientific_number_to_subl_real(base), ex_num), digits);
                }
                if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
                    return scientific_number_utilities.scientific_number_expt(base, ex_num);
                }
                if (ex_num.isNumber()) {
                    return expt(base, ex_num);
                }
            }

        return NIL;
    }

    public static final SubLObject extended_number_exp_alt(SubLObject ex_num) {
        SubLTrampolineFile.checkType(ex_num, EXTENDED_NUMBER_P);
        if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
            return scientific_number_utilities.scientific_number_exp(ex_num);
        } else {
            return exp(ex_num);
        }
    }

    public static SubLObject extended_number_exp(final SubLObject ex_num) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        if (NIL != power_too_largeP(exp(ONE_INTEGER), ex_num)) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if (NIL != scientific_numbers.scientific_number_p(ex_num)) {
                return scientific_number_utilities.scientific_number_exp(ex_num);
            }
            if (ex_num.isNumber()) {
                return exp(ex_num);
            }
            if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != collection_defns.fractionP(ex_num, UNPROVIDED))) {
                final SubLObject result = extended_number_exp(math_expression_utilities.fraction_from_el(ex_num));
                return fraction_or_number_to_el(result);
            }
            if ((NIL != include_fractions_in_extended_numbersP()) && (NIL != fraction_utilities.fraction_p(ex_num))) {
                return fraction_utilities.fraction_exp(ex_num);
            }
        }
        return NIL;
    }

    public static SubLObject extended_number_modulo(final SubLObject ex_num, final SubLObject base) {
        assert NIL != extended_number_p(ex_num) : "! extended_numbers.extended_number_p(ex_num) " + ("extended_numbers.extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(ex_num) ") + ex_num;
        assert NIL != extended_number_p(base) : "! extended_numbers.extended_number_p(base) " + ("extended_numbers.extended_number_p(base) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(base) ") + base;
        if (ex_num.isNumber() && base.isNumber()) {
            return mod(ex_num, base);
        }
        if (NIL != extended_number_zero_p(base)) {
            Errors.error($str13$Can_t_do_modulo_with_0_base_);
            return NIL;
        }
        if (NIL != extended_number_zero_p(ex_num)) {
            return ZERO_INTEGER;
        }
        if (NIL != extended_numberE(ex_num, base, UNPROVIDED)) {
            return ZERO_INTEGER;
        }
        final SubLObject quotient = quantities.cyc_round_truncate(extended_number_quotient(ex_num, base));
        final SubLObject remainder = extended_number_minus(ex_num, extended_number_times(base, quotient));
        if (NIL != extended_numberG(extended_number_abs(remainder), extended_number_abs(base), UNPROVIDED)) {
            Errors.error($str14$Looks_like_not_enough_significant);
        }
        return NIL != extended_number_zero_p(remainder) ? ZERO_INTEGER : extended_number_plus_p(remainder).eql(extended_number_plus_p(base)) ? remainder : extended_number_plus(remainder, base);
    }

    public static SubLObject extended_number_approx(final SubLObject ex_num) {
        return number_utilities.significant_digits(extended_number_to_subl_real(ex_num), TWO_INTEGER);
    }

    public static SubLObject fraction_or_number_to_el(final SubLObject obj) {
        return NIL != fraction_utilities.fraction_p(obj) ? math_expression_utilities.fraction_to_el(obj) : NIL != math_expression_utilities.really_big_number_for_fractionP(obj) ? scientific_numbers.scientific_number_from_subl_real(obj, UNPROVIDED) : obj;
    }

    public static SubLObject possibly_infinite_or_extended_number_min(final SubLObject ex_nums) {
        assert NIL != list_utilities.non_dotted_list_p(ex_nums) : "! list_utilities.non_dotted_list_p(ex_nums) " + ("list_utilities.non_dotted_list_p(ex_nums) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ex_nums) ") + ex_nums;
        SubLObject cdolist_list_var = ex_nums;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != possibly_infinite_or_extended_number_p(elem) : "! extended_numbers.possibly_infinite_or_extended_number_p(elem) " + ("extended_numbers.possibly_infinite_or_extended_number_p(elem) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject possible_min = ex_nums.first();
        cdolist_list_var = ex_nums.rest();
        SubLObject ex_num = NIL;
        ex_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != possibly_infinite_or_extended_numberL(ex_num, possible_min)) {
                possible_min = copy_possibly_infinite_or_extended_number(ex_num);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ex_num = cdolist_list_var.first();
        } 
        return possible_min;
    }

    public static SubLObject possibly_infinite_or_extended_number_max(final SubLObject ex_nums) {
        assert NIL != list_utilities.non_dotted_list_p(ex_nums) : "! list_utilities.non_dotted_list_p(ex_nums) " + ("list_utilities.non_dotted_list_p(ex_nums) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(ex_nums) ") + ex_nums;
        SubLObject cdolist_list_var = ex_nums;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != possibly_infinite_or_extended_number_p(elem) : "! extended_numbers.possibly_infinite_or_extended_number_p(elem) " + ("extended_numbers.possibly_infinite_or_extended_number_p(elem) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject possible_min = ex_nums.first();
        cdolist_list_var = ex_nums.rest();
        SubLObject ex_num = NIL;
        ex_num = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != possibly_infinite_or_extended_numberL(possible_min, ex_num)) {
                possible_min = copy_possibly_infinite_or_extended_number(ex_num);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ex_num = cdolist_list_var.first();
        } 
        return possible_min;
    }

    public static SubLObject possibly_infinite_or_extended_number_sqrt(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_sqrt(ex_num);
        }
        if (NIL != cyc_positive_infinity_p(ex_num)) {
            return $$PlusInfinity;
        }
        if (NIL != cyc_negative_infinity_p(ex_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static SubLObject possibly_infinite_or_extended_number_log(final SubLObject ex_num, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $exp1$.getGlobalValue();
        }
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        assert NIL != extended_number_p(base) : "! extended_numbers.extended_number_p(base) " + ("extended_numbers.extended_number_p(base) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(base) ") + base;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_log(ex_num, base);
        }
        if (NIL != cyc_positive_infinity_p(ex_num)) {
            return $$PlusInfinity;
        }
        if (NIL != cyc_negative_infinity_p(ex_num)) {
            relation_evaluation.throw_unevaluatable();
        }
        return NIL;
    }

    public static SubLObject possibly_infinite_or_extended_number_expt(final SubLObject base, final SubLObject ex_num) {
        assert NIL != extended_number_p(base) : "! extended_numbers.extended_number_p(base) " + ("extended_numbers.extended_number_p(base) " + "CommonSymbols.NIL != extended_numbers.extended_number_p(base) ") + base;
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_expt(base, ex_num);
        }
        if (NIL != cyc_positive_infinity_p(ex_num)) {
            return $$PlusInfinity;
        }
        if (NIL != cyc_negative_infinity_p(ex_num)) {
            return ZERO_INTEGER;
        }
        return NIL;
    }

    public static SubLObject power_too_largeP(final SubLObject base, final SubLObject ex_num) {
        return extended_numberG(ex_num, $int$1000, UNPROVIDED);
    }

    public static SubLObject possibly_infinite_or_extended_number_exp(final SubLObject ex_num) {
        assert NIL != possibly_infinite_or_extended_number_p(ex_num) : "! extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + ("extended_numbers.possibly_infinite_or_extended_number_p(ex_num) " + "CommonSymbols.NIL != extended_numbers.possibly_infinite_or_extended_number_p(ex_num) ") + ex_num;
        if (NIL != extended_number_p(ex_num)) {
            return extended_number_exp(ex_num);
        }
        if (NIL != cyc_positive_infinity_p(ex_num)) {
            return $$PlusInfinity;
        }
        if (NIL != cyc_negative_infinity_p(ex_num)) {
            return ZERO_INTEGER;
        }
        return NIL;
    }

    public static SubLObject test_zerop(final SubLObject v_object) {
        if (v_object.isZero()) {
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_extended_numbers_file() {
        declareFunction("cyc_extended_number_p", "CYC-EXTENDED-NUMBER-P", 1, 0, false);
        declareFunction("initialize_fraction_kb_feature", "INITIALIZE-FRACTION-KB-FEATURE", 0, 0, false);
        declareFunction("include_fractions_in_extended_numbersP", "INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?", 0, 0, false);
        declareFunction("extended_number_p", "EXTENDED-NUMBER-P", 1, 0, false);
        declareFunction("extended_number_zero_p", "EXTENDED-NUMBER-ZERO-P", 1, 0, false);
        declareFunction("extended_number_minus_p", "EXTENDED-NUMBER-MINUS-P", 1, 0, false);
        declareFunction("extended_number_plus_p", "EXTENDED-NUMBER-PLUS-P", 1, 0, false);
        declareFunction("extended_number_non_negative_p", "EXTENDED-NUMBER-NON-NEGATIVE-P", 1, 0, false);
        declareFunction("extended_number_integer_p", "EXTENDED-NUMBER-INTEGER-P", 1, 0, false);
        declareFunction("extended_number_abs", "EXTENDED-NUMBER-ABS", 1, 0, false);
        declareFunction("extended_number_negate", "EXTENDED-NUMBER-NEGATE", 1, 0, false);
        declareFunction("copy_extended_number", "COPY-EXTENDED-NUMBER", 1, 0, false);
        declareFunction("cyc_positive_infinity_p", "CYC-POSITIVE-INFINITY-P", 1, 0, false);
        declareFunction("cyc_negative_infinity_p", "CYC-NEGATIVE-INFINITY-P", 1, 0, false);
        declareFunction("cyc_infinite_number_p", "CYC-INFINITE-NUMBER-P", 1, 0, false);
        declareFunction("cyc_infinite_range_p", "CYC-INFINITE-RANGE-P", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_p", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-P", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_minus_p", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-MINUS-P", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_plus_p", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-PLUS-P", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_abs", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-ABS", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_negate", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-NEGATE", 1, 0, false);
        declareFunction("copy_possibly_infinite_or_extended_number", "COPY-POSSIBLY-INFINITE-OR-EXTENDED-NUMBER", 1, 0, false);
        declareFunction("extended_numberE", "EXTENDED-NUMBER=", 2, 1, false);
        declareFunction("extended_numberE_int", "EXTENDED-NUMBER=-INT", 2, 1, false);
        declareFunction("extended_numberE_old", "EXTENDED-NUMBER=-OLD", 2, 1, false);
        declareFunction("extended_numberG", "EXTENDED-NUMBER>", 2, 1, false);
        declareFunction("extended_numberG_int", "EXTENDED-NUMBER>-INT", 2, 1, false);
        declareFunction("extended_numberG_old", "EXTENDED-NUMBER>-OLD", 2, 1, false);
        declareFunction("extended_numberGE", "EXTENDED-NUMBER>=", 2, 1, false);
        declareFunction("extended_numberGE_int", "EXTENDED-NUMBER>=-INT", 2, 1, false);
        declareFunction("extended_numberGE_old", "EXTENDED-NUMBER>=-OLD", 2, 1, false);
        declareFunction("extended_numberL", "EXTENDED-NUMBER<", 2, 1, false);
        declareFunction("extended_numberLE", "EXTENDED-NUMBER<=", 2, 1, false);
        declareFunction("possibly_infinite_or_extended_numberLE", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER<=", 2, 0, false);
        declareFunction("possibly_infinite_or_extended_numberE", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER=", 2, 0, false);
        declareFunction("possibly_infinite_or_extended_numberL", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER<", 2, 0, false);
        declareFunction("extended_number_to_subl_real", "EXTENDED-NUMBER-TO-SUBL-REAL", 1, 0, false);
        declareFunction("extended_number_times", "EXTENDED-NUMBER-TIMES", 2, 0, false);
        declareFunction("extended_number_times_int", "EXTENDED-NUMBER-TIMES-INT", 2, 2, false);
        declareFunction("extended_number_times_old", "EXTENDED-NUMBER-TIMES-OLD", 2, 0, false);
        declareFunction("extended_number_quotient", "EXTENDED-NUMBER-QUOTIENT", 2, 0, false);
        declareFunction("extended_number_quotient_int", "EXTENDED-NUMBER-QUOTIENT-INT", 2, 2, false);
        declareFunction("extended_number_quotient_old", "EXTENDED-NUMBER-QUOTIENT-OLD", 2, 0, false);
        declareFunction("extended_number_plus", "EXTENDED-NUMBER-PLUS", 2, 0, false);
        declareFunction("extended_number_plus_int", "EXTENDED-NUMBER-PLUS-INT", 2, 2, false);
        declareFunction("scientific_number_significant_digits_for_addition", "SCIENTIFIC-NUMBER-SIGNIFICANT-DIGITS-FOR-ADDITION", 2, 0, false);
        declareFunction("extended_number_plus_old", "EXTENDED-NUMBER-PLUS-OLD", 2, 0, false);
        declareFunction("extended_number_minus", "EXTENDED-NUMBER-MINUS", 2, 0, false);
        declareFunction("extended_number_minus_int", "EXTENDED-NUMBER-MINUS-INT", 2, 0, false);
        declareFunction("extended_number_minus_old", "EXTENDED-NUMBER-MINUS-OLD", 2, 0, false);
        declareFunction("possibly_infinite_or_extended_number_times", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-TIMES", 2, 0, false);
        declareFunction("possibly_infinite_or_extended_number_plus", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-PLUS", 2, 0, false);
        declareFunction("possibly_infinite_or_extended_number_quotient", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-QUOTIENT", 2, 0, false);
        declareFunction("extended_number_min", "EXTENDED-NUMBER-MIN", 1, 0, false);
        declareFunction("extended_number_max", "EXTENDED-NUMBER-MAX", 1, 0, false);
        declareFunction("extended_number_sqrt", "EXTENDED-NUMBER-SQRT", 1, 0, false);
        declareFunction("extended_number_log", "EXTENDED-NUMBER-LOG", 1, 1, false);
        declareFunction("extended_number_expt", "EXTENDED-NUMBER-EXPT", 2, 0, false);
        declareFunction("extended_number_exp", "EXTENDED-NUMBER-EXP", 1, 0, false);
        declareFunction("extended_number_modulo", "EXTENDED-NUMBER-MODULO", 2, 0, false);
        declareFunction("extended_number_approx", "EXTENDED-NUMBER-APPROX", 1, 0, false);
        declareFunction("fraction_or_number_to_el", "FRACTION-OR-NUMBER-TO-EL", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_min", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-MIN", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_max", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-MAX", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_sqrt", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-SQRT", 1, 0, false);
        declareFunction("possibly_infinite_or_extended_number_log", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-LOG", 1, 1, false);
        declareFunction("possibly_infinite_or_extended_number_expt", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-EXPT", 2, 0, false);
        declareFunction("power_too_largeP", "POWER-TOO-LARGE?", 2, 0, false);
        declareFunction("possibly_infinite_or_extended_number_exp", "POSSIBLY-INFINITE-OR-EXTENDED-NUMBER-EXP", 1, 0, false);
        declareFunction("test_zerop", "TEST-ZEROP", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_extended_numbers_file() {
        deflexical("*FRACTION-CORE-CONSTANTS*", $list1);
        defparameter("*INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?*", T);
        defparameter("*CHECK-NEW-VS-OLD-EXTENDED-NUMBER-MATH?*", NIL);
        return NIL;
    }

    public static SubLObject setup_extended_numbers_file() {
        register_kb_function(CYC_EXTENDED_NUMBER_P);
        define_test_case_table_int(TEST_ZEROP, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list23);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_extended_numbers_file();
    }

    @Override
    public void initializeVariables() {
        init_extended_numbers_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_extended_numbers_file();
    }

    static {
    }
}

/**
 * Total time: 389 ms
 */
