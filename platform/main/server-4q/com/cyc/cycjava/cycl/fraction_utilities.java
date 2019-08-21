package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.fraction_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.fraction_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$exp1$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.fraction_utilities.*; 
 public final class fraction_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new fraction_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.fraction_utilities";

    public static final String myFingerPrint = "dbdb58b129360da8bac52798f4041cece6be22f1b6ede9fb7e6aeea57507297c";

    // defconstant
    public static final SubLSymbol $dtp_fraction$ = makeSymbol("*DTP-FRACTION*");



    public static final SubLSymbol FRACTION_P = makeSymbol("FRACTION-P");

    public static final SubLList $list2 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));

    public static final SubLList $list3 = list(makeKeyword("NUMERATOR"), makeKeyword("DENOMINATOR"));

    public static final SubLList $list4 = list(makeSymbol("FRACT-NUMERATOR"), makeSymbol("FRACT-DENOMINATOR"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FRACT-NUMERATOR"), makeSymbol("_CSETF-FRACT-DENOMINATOR"));

    public static final SubLSymbol PRINT_FRACTION = makeSymbol("PRINT-FRACTION");

    public static final SubLSymbol FRACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FRACTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FRACTION-P"));

    private static final SubLSymbol FRACT_NUMERATOR = makeSymbol("FRACT-NUMERATOR");

    private static final SubLSymbol _CSETF_FRACT_NUMERATOR = makeSymbol("_CSETF-FRACT-NUMERATOR");

    private static final SubLSymbol FRACT_DENOMINATOR = makeSymbol("FRACT-DENOMINATOR");

    private static final SubLSymbol _CSETF_FRACT_DENOMINATOR = makeSymbol("_CSETF-FRACT-DENOMINATOR");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FRACTION = makeSymbol("MAKE-FRACTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FRACTION-METHOD");

    private static final SubLString $str21$_A__A = makeString("~A/~A");

    private static final SubLString $str22$Can_t_coerce__S_to_an_INTEGERP_ = makeString("Can't coerce ~S to an INTEGERP.");

    private static final SubLSymbol INTEGER_OR_FRACTION_P = makeSymbol("INTEGER-OR-FRACTION-P");







    private static final SubLSymbol NUMBER_OR_FRACTION_P = makeSymbol("NUMBER-OR-FRACTION-P");



    private static final SubLSymbol FRACTIONIFY = makeSymbol("FRACTIONIFY");

    private static final SubLString $str30$Attempt_to_fraction_divide_by_zer = makeString("Attempt to fraction-divide by zero");

    private static final SubLString $str31$Can_t_raise__S_to__S = makeString("Can't raise ~S to ~S");



    private static final SubLSymbol FRACTION_REDUCE = makeSymbol("FRACTION-REDUCE");

    public static SubLObject fraction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fraction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fraction_p(final SubLObject v_object) {
        return v_object.getClass() == $fraction_native.class ? T : NIL;
    }

    public static SubLObject fract_numerator(final SubLObject v_object) {
        assert NIL != fraction_p(v_object) : "fraction_utilities.fraction_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject fract_denominator(final SubLObject v_object) {
        assert NIL != fraction_p(v_object) : "fraction_utilities.fraction_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_fract_numerator(final SubLObject v_object, final SubLObject value) {
        assert NIL != fraction_p(v_object) : "fraction_utilities.fraction_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fract_denominator(final SubLObject v_object, final SubLObject value) {
        assert NIL != fraction_p(v_object) : "fraction_utilities.fraction_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_fraction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $fraction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NUMERATOR)) {
                _csetf_fract_numerator(v_new, current_value);
            } else
                if (pcase_var.eql($DENOMINATOR)) {
                    _csetf_fract_denominator(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_fraction(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FRACTION, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NUMERATOR, fract_numerator(obj));
        funcall(visitor_fn, obj, $SLOT, $DENOMINATOR, fract_denominator(obj));
        funcall(visitor_fn, obj, $END, MAKE_FRACTION, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_fraction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fraction(obj, visitor_fn);
    }

    public static SubLObject print_fraction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject numerator = fract_numerator(v_object);
        final SubLObject denominator = fract_denominator(v_object);
        format(stream, $str21$_A__A, numerator, denominator);
        return NIL;
    }

    public static SubLObject new_fraction(SubLObject numerator, SubLObject denominator) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        if (!numerator.isInteger()) {
            final SubLObject numerator_int = truncate(numerator, UNPROVIDED);
            if (!numerator.equalp(numerator_int)) {
                Errors.error($str22$Can_t_coerce__S_to_an_INTEGERP_, numerator);
            }
            numerator = numerator_int;
        }
        if (!denominator.isInteger()) {
            final SubLObject denominator_int = truncate(denominator, UNPROVIDED);
            if (!denominator.equalp(denominator_int)) {
                Errors.error($str22$Can_t_coerce__S_to_an_INTEGERP_, denominator);
            }
            denominator = denominator_int;
        }
        return make_fraction(list($NUMERATOR, numerator, $DENOMINATOR, denominator));
    }

    public static SubLObject copy_fraction(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return new_fraction(fraction_numerator(fraction), fraction_denominator(fraction));
    }

    public static SubLObject integer_or_fraction_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() || (NIL != fraction_p(v_object)));
    }

    public static SubLObject number_or_fraction_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() || (NIL != fraction_p(v_object)));
    }

    public static SubLObject list_of_fraction_p(final SubLObject v_object) {
        if (v_object.isList()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == fraction_p(item)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject list_of_integer_or_fraction_p(final SubLObject v_object) {
        if (v_object.isList()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == integer_or_fraction_p(item)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject list_of_number_or_fraction_p(final SubLObject v_object) {
        if (v_object.isList()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == number_or_fraction_p(item)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject fraction_zero_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return zerop(fraction_numerator(fraction));
    }

    public static SubLObject fraction_minus_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return makeBoolean(!minusp(fraction_numerator(fraction)).eql(minusp(fraction_denominator(fraction))));
    }

    public static SubLObject fraction_plus_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return eql(minusp(fraction_numerator(fraction)), minusp(fraction_denominator(fraction)));
    }

    public static SubLObject fraction_integer_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return fraction_denominator(fraction).isZero() ? NIL : zerop(mod(fraction_numerator(fraction), fraction_denominator(fraction)));
    }

    public static SubLObject fraction_numerator(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return fract_numerator(fraction);
    }

    public static SubLObject fraction_denominator(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return fract_denominator(fraction);
    }

    public static SubLObject numerator(final SubLObject fraction) {
        assert NIL != integer_or_fraction_p(fraction) : "fraction_utilities.integer_or_fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(fraction) " + fraction;
        if (fraction.isInteger()) {
            return fraction;
        }
        return fraction_numerator(fraction);
    }

    public static SubLObject denominator(final SubLObject fraction) {
        assert NIL != integer_or_fraction_p(fraction) : "fraction_utilities.integer_or_fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(fraction) " + fraction;
        if (fraction.isInteger()) {
            return ONE_INTEGER;
        }
        return fraction_denominator(fraction);
    }

    public static SubLObject integer_to_fraction(final SubLObject integer) {
        assert NIL != integerp(integer) : "Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) " + integer;
        return new_fraction(integer, ONE_INTEGER);
    }

    public static SubLObject float_to_fraction(final SubLObject v_float) {
        assert NIL != floatp(v_float) : "Types.floatp(v_float) " + "CommonSymbols.NIL != Types.floatp(v_float) " + v_float;
        return fractionify(scientific_numbers.scientific_number_to_integer_or_fraction(scientific_numbers.scientific_number_from_subl_real(v_float, UNPROVIDED), UNPROVIDED));
    }

    public static SubLObject fraction_to_number(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return divide(fract_numerator(fraction), fract_denominator(fraction));
    }

    public static SubLObject number_to_fraction(final SubLObject number) {
        assert NIL != numberp(number) : "Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) " + number;
        return number.isInteger() ? integer_to_fraction(number) : float_to_fraction(number);
    }

    public static SubLObject fractionify(final SubLObject v_object) {
        assert NIL != number_or_fraction_p(v_object) : "fraction_utilities.number_or_fraction_p error :" + v_object;
        return v_object.isNumber() ? number_to_fraction(v_object) : v_object;
    }

    public static SubLObject defractionify(final SubLObject v_object) {
        assert NIL != number_or_fraction_p(v_object) : "fraction_utilities.number_or_fraction_p error :" + v_object;
        return NIL != fraction_p(v_object) ? fraction_to_number(v_object) : v_object;
    }

    public static SubLObject fraction_reduce(final SubLObject fraction) {
        assert NIL != integer_or_fraction_p(fraction) : "fraction_utilities.integer_or_fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(fraction) " + fraction;
        if (fraction.isInteger()) {
            return fraction;
        }
        SubLObject numerator = fract_numerator(fraction);
        SubLObject denominator = fract_denominator(fraction);
        final SubLObject factor = number_utilities.gcd2(numerator, denominator);
        if (NIL != subl_promotions.negative_integer_p(denominator)) {
            numerator = minus(numerator);
            denominator = minus(denominator);
        } else
            if (factor.eql(ONE_INTEGER) && (!denominator.numE(factor))) {
                return fraction;
            }

        if (denominator.numE(factor)) {
            return divide(numerator, factor);
        }
        return new_fraction(divide(numerator, factor), divide(denominator, factor));
    }

    public static SubLObject reciprocal(final SubLObject value) {
        assert NIL != number_or_fraction_p(value) : "fraction_utilities.number_or_fraction_p(value) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value) " + value;
        return reciprocal_internal(value);
    }

    public static SubLObject reduced_reciprocal(final SubLObject value) {
        assert NIL != number_or_fraction_p(value) : "fraction_utilities.number_or_fraction_p(value) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value) " + value;
        final SubLObject reciprocal = reciprocal_internal(value);
        return fraction_reduce(reciprocal);
    }

    public static SubLObject reciprocal_internal(SubLObject value) {
        if (NIL == integer_or_fraction_p(value)) {
            value = fractionify(value);
        }
        return new_fraction(denominator(value), numerator(value));
    }

    public static SubLObject fractionE(final SubLObject fraction1, final SubLObject fraction2) {
        assert NIL != number_or_fraction_p(fraction1) : "fraction_utilities.number_or_fraction_p(fraction1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(fraction1) " + fraction1;
        assert NIL != number_or_fraction_p(fraction2) : "fraction_utilities.number_or_fraction_p(fraction2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(fraction2) " + fraction2;
        if ((NIL != fraction_p(fraction1)) && (NIL != fraction_p(fraction2))) {
            final SubLObject reduced1 = fraction_reduce(fraction1);
            final SubLObject reduced2 = fraction_reduce(fraction2);
            return makeBoolean(fract_numerator(reduced1).numE(fract_numerator(reduced2)) && fract_denominator(reduced1).numE(fract_denominator(reduced2)));
        }
        return numE(defractionify(fraction1), defractionify(fraction2));
    }

    public static SubLObject fraction_times(final SubLObject values) {
        assert NIL != list_utilities.non_dotted_list_p(values) : "list_utilities.non_dotted_list_p(values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(values) " + values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != number_or_fraction_p(elem) : "fraction_utilities.number_or_fraction_p(elem) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == values) {
            return new_fraction(ONE_INTEGER, ONE_INTEGER);
        }
        final SubLObject fractions = Mapping.mapcar(symbol_function(FRACTIONIFY), values);
        if (NIL != list_utilities.singletonP(fractions)) {
            return fraction_reduce(fractions.first());
        }
        return fraction_times_internal(fractions);
    }

    public static SubLObject fraction_times2(final SubLObject value1, final SubLObject value2) {
        assert NIL != number_or_fraction_p(value1) : "fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) " + value1;
        assert NIL != number_or_fraction_p(value2) : "fraction_utilities.number_or_fraction_p(value2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value2) " + value2;
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject fraction2 = fractionify(value2);
        return fraction_times2_internal(fraction1, fraction2);
    }

    public static SubLObject fraction_times_internal(final SubLObject fractions) {
        final SubLObject product_of_first_two = fraction_times2_internal(fractions.first(), second(fractions));
        if (NIL != list_utilities.doubletonP(fractions)) {
            return product_of_first_two;
        }
        final SubLObject rest_of_list = cddr(fractions);
        return fraction_times_internal(cons(product_of_first_two, rest_of_list));
    }

    public static SubLObject fraction_times2_internal(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject product = new_fraction(multiply(fract_numerator(fraction1), fract_numerator(fraction2)), multiply(fract_denominator(fraction1), fract_denominator(fraction2)));
        return fraction_reduce(product);
    }

    public static SubLObject fraction_divide(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_or_fraction_p(value1) : "fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) " + value1;
        assert NIL != number_or_fraction_p(value2) : "fraction_utilities.number_or_fraction_p(value2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value2) " + value2;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != fractionE(ZERO_INTEGER, value2))) {
            Errors.error($str30$Attempt_to_fraction_divide_by_zer);
        }
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject reciprocal2 = reciprocal(value2);
        return fraction_times2_internal(fraction1, reciprocal2);
    }

    public static SubLObject fraction_add(final SubLObject values) {
        assert NIL != list_utilities.non_dotted_list_p(values) : "list_utilities.non_dotted_list_p(values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(values) " + values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != number_or_fraction_p(elem) : "fraction_utilities.number_or_fraction_p(elem) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == values) {
            return new_fraction(ZERO_INTEGER, ONE_INTEGER);
        }
        final SubLObject fractions = Mapping.mapcar(symbol_function(FRACTIONIFY), values);
        if (NIL != list_utilities.singletonP(fractions)) {
            return fraction_reduce(fractions.first());
        }
        return fraction_add_internal(fractions);
    }

    public static SubLObject fraction_add2(final SubLObject value1, final SubLObject value2) {
        assert NIL != number_or_fraction_p(value1) : "fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) " + value1;
        assert NIL != number_or_fraction_p(value2) : "fraction_utilities.number_or_fraction_p(value2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value2) " + value2;
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject fraction2 = fractionify(value2);
        return fraction_add2_internal(fraction1, fraction2);
    }

    public static SubLObject fraction_add_internal(final SubLObject fractions) {
        final SubLObject sum_of_first_two = fraction_add2_internal(fractions.first(), second(fractions));
        if (NIL != list_utilities.doubletonP(fractions)) {
            return sum_of_first_two;
        }
        return fraction_add_internal(cons(sum_of_first_two, cddr(fractions)));
    }

    public static SubLObject fraction_add2_internal(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject numerator1 = fract_numerator(fraction1);
        final SubLObject numerator2 = fract_numerator(fraction2);
        final SubLObject denominator1 = fract_denominator(fraction1);
        final SubLObject denominator2 = fract_denominator(fraction2);
        final SubLObject denominator_sum = number_utilities.lcm2(denominator1, denominator2);
        final SubLObject factor1 = integerDivide(denominator_sum, denominator1);
        final SubLObject factor2 = integerDivide(denominator_sum, denominator2);
        final SubLObject new_numerator1 = multiply(factor1, numerator1);
        final SubLObject new_numerator2 = multiply(factor2, numerator2);
        final SubLObject numerator_sum = add(new_numerator1, new_numerator2);
        return fraction_reduce(new_fraction(numerator_sum, denominator_sum));
    }

    public static SubLObject fraction_minus(final SubLObject value1, SubLObject value2) {
        if (value2 == UNPROVIDED) {
            value2 = NIL;
        }
        assert NIL != number_or_fraction_p(value1) : "fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) " + value1;
        if (NIL != value2) {
            return fraction_add2_internal(fractionify(value1), fraction_minus(value2, UNPROVIDED));
        }
        return new_fraction(minus(numerator(value1)), denominator(value1));
    }

    public static SubLObject fraction_abs(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) " + fraction;
        return NIL != fraction_plus_p(fraction) ? fraction : new_fraction(abs(fraction_numerator(fraction)), abs(fraction_denominator(fraction)));
    }

    public static SubLObject fraction_sqrt(final SubLObject fraction) {
        final SubLObject numerator = sqrt(fraction_numerator(fraction));
        final SubLObject denominator = sqrt(fraction_denominator(fraction));
        return numerator.isInteger() && denominator.isInteger() ? new_fraction(numerator, denominator) : divide(numerator, denominator);
    }

    public static SubLObject fraction_log(final SubLObject fraction, SubLObject base) {
        if (base == UNPROVIDED) {
            base = $exp1$.getGlobalValue();
        }
        return log(defractionify(fraction), defractionify(base));
    }

    public static SubLObject fraction_expt(SubLObject base, final SubLObject power) {
        if (NIL != fraction_p(base)) {
            base = fraction_reduce(base);
            final SubLObject numerator = fraction_expt(fraction_numerator(base), power);
            final SubLObject denominator = fraction_expt(fraction_denominator(base), power);
            return numerator.isInteger() && denominator.isInteger() ? fraction_reduce(new_fraction(numerator, denominator)) : divide(numerator, denominator);
        }
        if (NIL != extended_numbers.power_too_largeP(base, defractionify(power))) {
            Errors.error($str31$Can_t_raise__S_to__S, base, power);
            return NIL;
        }
        return expt(defractionify(base), defractionify(power));
    }

    public static SubLObject fraction_exp(final SubLObject fraction) {
        return exp(defractionify(fraction));
    }

    public static SubLObject normalize_fractional_phrase(final SubLObject values) {
        assert NIL != list_utilities.non_dotted_list_p(values) : "list_utilities.non_dotted_list_p(values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(values) " + values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != integer_or_fraction_p(elem) : "fraction_utilities.integer_or_fraction_p(elem) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject denominators = Mapping.mapcar(symbol_function(DENOMINATOR), Mapping.mapcar(symbol_function(FRACTION_REDUCE), values));
        final SubLObject factor = number_utilities.lcm(denominators);
        SubLObject result = NIL;
        SubLObject cdolist_list_var2 = values;
        SubLObject value = NIL;
        value = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject product = fraction_times2(value, factor);
            result = cons(defractionify(product), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            value = cdolist_list_var2.first();
        } 
        result = nreverse(result);
        return result;
    }

    public static SubLObject declare_fraction_utilities_file() {
        declareFunction(me, "fraction_print_function_trampoline", "FRACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "fraction_p", "FRACTION-P", 1, 0, false);
        new fraction_utilities.$fraction_p$UnaryFunction();
        declareFunction(me, "fract_numerator", "FRACT-NUMERATOR", 1, 0, false);
        declareFunction(me, "fract_denominator", "FRACT-DENOMINATOR", 1, 0, false);
        declareFunction(me, "_csetf_fract_numerator", "_CSETF-FRACT-NUMERATOR", 2, 0, false);
        declareFunction(me, "_csetf_fract_denominator", "_CSETF-FRACT-DENOMINATOR", 2, 0, false);
        declareFunction(me, "make_fraction", "MAKE-FRACTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_fraction", "VISIT-DEFSTRUCT-FRACTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_fraction_method", "VISIT-DEFSTRUCT-OBJECT-FRACTION-METHOD", 2, 0, false);
        declareFunction(me, "print_fraction", "PRINT-FRACTION", 3, 0, false);
        declareFunction(me, "new_fraction", "NEW-FRACTION", 1, 1, false);
        declareFunction(me, "copy_fraction", "COPY-FRACTION", 1, 0, false);
        declareFunction(me, "integer_or_fraction_p", "INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction(me, "number_or_fraction_p", "NUMBER-OR-FRACTION-P", 1, 0, false);
        declareFunction(me, "list_of_fraction_p", "LIST-OF-FRACTION-P", 1, 0, false);
        declareFunction(me, "list_of_integer_or_fraction_p", "LIST-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction(me, "list_of_number_or_fraction_p", "LIST-OF-NUMBER-OR-FRACTION-P", 1, 0, false);
        declareFunction(me, "fraction_zero_p", "FRACTION-ZERO-P", 1, 0, false);
        declareFunction(me, "fraction_minus_p", "FRACTION-MINUS-P", 1, 0, false);
        declareFunction(me, "fraction_plus_p", "FRACTION-PLUS-P", 1, 0, false);
        declareFunction(me, "fraction_integer_p", "FRACTION-INTEGER-P", 1, 0, false);
        declareFunction(me, "fraction_numerator", "FRACTION-NUMERATOR", 1, 0, false);
        declareFunction(me, "fraction_denominator", "FRACTION-DENOMINATOR", 1, 0, false);
        declareFunction(me, "numerator", "NUMERATOR", 1, 0, false);
        declareFunction(me, "denominator", "DENOMINATOR", 1, 0, false);
        declareFunction(me, "integer_to_fraction", "INTEGER-TO-FRACTION", 1, 0, false);
        declareFunction(me, "float_to_fraction", "FLOAT-TO-FRACTION", 1, 0, false);
        declareFunction(me, "fraction_to_number", "FRACTION-TO-NUMBER", 1, 0, false);
        declareFunction(me, "number_to_fraction", "NUMBER-TO-FRACTION", 1, 0, false);
        declareFunction(me, "fractionify", "FRACTIONIFY", 1, 0, false);
        declareFunction(me, "defractionify", "DEFRACTIONIFY", 1, 0, false);
        declareFunction(me, "fraction_reduce", "FRACTION-REDUCE", 1, 0, false);
        declareFunction(me, "reciprocal", "RECIPROCAL", 1, 0, false);
        declareFunction(me, "reduced_reciprocal", "REDUCED-RECIPROCAL", 1, 0, false);
        declareFunction(me, "reciprocal_internal", "RECIPROCAL-INTERNAL", 1, 0, false);
        declareFunction(me, "fractionE", "FRACTION=", 2, 0, false);
        declareFunction(me, "fraction_times", "FRACTION-TIMES", 1, 0, false);
        declareFunction(me, "fraction_times2", "FRACTION-TIMES2", 2, 0, false);
        declareFunction(me, "fraction_times_internal", "FRACTION-TIMES-INTERNAL", 1, 0, false);
        declareFunction(me, "fraction_times2_internal", "FRACTION-TIMES2-INTERNAL", 2, 0, false);
        declareFunction(me, "fraction_divide", "FRACTION-DIVIDE", 2, 0, false);
        declareFunction(me, "fraction_add", "FRACTION-ADD", 1, 0, false);
        declareFunction(me, "fraction_add2", "FRACTION-ADD2", 2, 0, false);
        declareFunction(me, "fraction_add_internal", "FRACTION-ADD-INTERNAL", 1, 0, false);
        declareFunction(me, "fraction_add2_internal", "FRACTION-ADD2-INTERNAL", 2, 0, false);
        declareFunction(me, "fraction_minus", "FRACTION-MINUS", 1, 1, false);
        declareFunction(me, "fraction_abs", "FRACTION-ABS", 1, 0, false);
        declareFunction(me, "fraction_sqrt", "FRACTION-SQRT", 1, 0, false);
        declareFunction(me, "fraction_log", "FRACTION-LOG", 1, 1, false);
        declareFunction(me, "fraction_expt", "FRACTION-EXPT", 2, 0, false);
        declareFunction(me, "fraction_exp", "FRACTION-EXP", 1, 0, false);
        declareFunction(me, "normalize_fractional_phrase", "NORMALIZE-FRACTIONAL-PHRASE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_fraction_utilities_file() {
        defconstant("*DTP-FRACTION*", FRACTION);
        return NIL;
    }

    public static SubLObject setup_fraction_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(FRACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FRACT_NUMERATOR, _CSETF_FRACT_NUMERATOR);
        def_csetf(FRACT_DENOMINATOR, _CSETF_FRACT_DENOMINATOR);
        identity(FRACTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_fraction_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_fraction_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_fraction_utilities_file();
    }

    static {




































    }

    public static final class $fraction_native extends SubLStructNative {
        public SubLObject $numerator;

        public SubLObject $denominator;

        private static final SubLStructDeclNative structDecl;

        private $fraction_native() {
            this.$numerator = Lisp.NIL;
            this.$denominator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$numerator;
        }

        @Override
        public SubLObject getField3() {
            return this.$denominator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$numerator = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$denominator = value;
        }

        static {
            structDecl = makeStructDeclNative($fraction_native.class, FRACTION, FRACTION_P, $list2, $list3, new String[]{ "$numerator", "$denominator" }, $list4, $list5, PRINT_FRACTION);
        }
    }

    public static final class $fraction_p$UnaryFunction extends UnaryFunction {
        public $fraction_p$UnaryFunction() {
            super(extractFunctionNamed("FRACTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return fraction_p(arg1);
        }
    }
}

/**
 * Total time: 193 ms
 */
