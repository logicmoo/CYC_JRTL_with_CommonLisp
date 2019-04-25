package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class fraction_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.fraction_utilities";
    public static final String myFingerPrint = "dbdb58b129360da8bac52798f4041cece6be22f1b6ede9fb7e6aeea57507297c";
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLSymbol $dtp_fraction$;
    private static final SubLSymbol $sym0$FRACTION;
    private static final SubLSymbol $sym1$FRACTION_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_FRACTION;
    private static final SubLSymbol $sym7$FRACTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FRACT_NUMERATOR;
    private static final SubLSymbol $sym10$_CSETF_FRACT_NUMERATOR;
    private static final SubLSymbol $sym11$FRACT_DENOMINATOR;
    private static final SubLSymbol $sym12$_CSETF_FRACT_DENOMINATOR;
    private static final SubLSymbol $kw13$NUMERATOR;
    private static final SubLSymbol $kw14$DENOMINATOR;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_FRACTION;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD;
    private static final SubLString $str21$_A__A;
    private static final SubLString $str22$Can_t_coerce__S_to_an_INTEGERP_;
    private static final SubLSymbol $sym23$INTEGER_OR_FRACTION_P;
    private static final SubLSymbol $sym24$INTEGERP;
    private static final SubLSymbol $sym25$FLOATP;
    private static final SubLSymbol $sym26$NUMBERP;
    private static final SubLSymbol $sym27$NUMBER_OR_FRACTION_P;
    private static final SubLSymbol $sym28$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym29$FRACTIONIFY;
    private static final SubLString $str30$Attempt_to_fraction_divide_by_zer;
    private static final SubLString $str31$Can_t_raise__S_to__S;
    private static final SubLSymbol $sym32$DENOMINATOR;
    private static final SubLSymbol $sym33$FRACTION_REDUCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject fraction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fraction(v_object, stream, (SubLObject)fraction_utilities.ZERO_INTEGER);
        return (SubLObject)fraction_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject fraction_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fraction_native.class) ? fraction_utilities.T : fraction_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject fract_numerator(final SubLObject v_object) {
        assert fraction_utilities.NIL != fraction_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject fract_denominator(final SubLObject v_object) {
        assert fraction_utilities.NIL != fraction_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject _csetf_fract_numerator(final SubLObject v_object, final SubLObject value) {
        assert fraction_utilities.NIL != fraction_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject _csetf_fract_denominator(final SubLObject v_object, final SubLObject value) {
        assert fraction_utilities.NIL != fraction_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject make_fraction(SubLObject arglist) {
        if (arglist == fraction_utilities.UNPROVIDED) {
            arglist = (SubLObject)fraction_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fraction_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)fraction_utilities.NIL, next = arglist; fraction_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)fraction_utilities.$kw13$NUMERATOR)) {
                _csetf_fract_numerator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)fraction_utilities.$kw14$DENOMINATOR)) {
                _csetf_fract_denominator(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)fraction_utilities.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject visit_defstruct_fraction(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)fraction_utilities.$kw16$BEGIN, (SubLObject)fraction_utilities.$sym17$MAKE_FRACTION, (SubLObject)fraction_utilities.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)fraction_utilities.$kw18$SLOT, (SubLObject)fraction_utilities.$kw13$NUMERATOR, fract_numerator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)fraction_utilities.$kw18$SLOT, (SubLObject)fraction_utilities.$kw14$DENOMINATOR, fract_denominator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)fraction_utilities.$kw19$END, (SubLObject)fraction_utilities.$sym17$MAKE_FRACTION, (SubLObject)fraction_utilities.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1061L)
    public static SubLObject visit_defstruct_object_fraction_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fraction(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1177L)
    public static SubLObject print_fraction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject numerator = fract_numerator(v_object);
        final SubLObject denominator = fract_denominator(v_object);
        PrintLow.format(stream, (SubLObject)fraction_utilities.$str21$_A__A, numerator, denominator);
        return (SubLObject)fraction_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 1404L)
    public static SubLObject new_fraction(SubLObject numerator, SubLObject denominator) {
        if (denominator == fraction_utilities.UNPROVIDED) {
            denominator = (SubLObject)fraction_utilities.ONE_INTEGER;
        }
        if (!numerator.isInteger()) {
            final SubLObject numerator_int = Numbers.truncate(numerator, (SubLObject)fraction_utilities.UNPROVIDED);
            if (!numerator.equalp(numerator_int)) {
                Errors.error((SubLObject)fraction_utilities.$str22$Can_t_coerce__S_to_an_INTEGERP_, numerator);
            }
            numerator = numerator_int;
        }
        if (!denominator.isInteger()) {
            final SubLObject denominator_int = Numbers.truncate(denominator, (SubLObject)fraction_utilities.UNPROVIDED);
            if (!denominator.equalp(denominator_int)) {
                Errors.error((SubLObject)fraction_utilities.$str22$Can_t_coerce__S_to_an_INTEGERP_, denominator);
            }
            denominator = denominator_int;
        }
        return make_fraction((SubLObject)ConsesLow.list((SubLObject)fraction_utilities.$kw13$NUMERATOR, numerator, (SubLObject)fraction_utilities.$kw14$DENOMINATOR, denominator));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2026L)
    public static SubLObject copy_fraction(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return new_fraction(fraction_numerator(fraction), fraction_denominator(fraction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2188L)
    public static SubLObject integer_or_fraction_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isInteger() || fraction_utilities.NIL != fraction_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2308L)
    public static SubLObject number_or_fraction_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isNumber() || fraction_utilities.NIL != fraction_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2411L)
    public static SubLObject list_of_fraction_p(final SubLObject v_object) {
        if (v_object.isList()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = (SubLObject)fraction_utilities.NIL;
            item = cdolist_list_var.first();
            while (fraction_utilities.NIL != cdolist_list_var) {
                if (fraction_utilities.NIL == fraction_p(item)) {
                    return (SubLObject)fraction_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            return (SubLObject)fraction_utilities.T;
        }
        return (SubLObject)fraction_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2578L)
    public static SubLObject list_of_integer_or_fraction_p(final SubLObject v_object) {
        if (v_object.isList()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = (SubLObject)fraction_utilities.NIL;
            item = cdolist_list_var.first();
            while (fraction_utilities.NIL != cdolist_list_var) {
                if (fraction_utilities.NIL == integer_or_fraction_p(item)) {
                    return (SubLObject)fraction_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            return (SubLObject)fraction_utilities.T;
        }
        return (SubLObject)fraction_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2767L)
    public static SubLObject list_of_number_or_fraction_p(final SubLObject v_object) {
        if (v_object.isList()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject item = (SubLObject)fraction_utilities.NIL;
            item = cdolist_list_var.first();
            while (fraction_utilities.NIL != cdolist_list_var) {
                if (fraction_utilities.NIL == number_or_fraction_p(item)) {
                    return (SubLObject)fraction_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            return (SubLObject)fraction_utilities.T;
        }
        return (SubLObject)fraction_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 2954L)
    public static SubLObject fraction_zero_p(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return Numbers.zerop(fraction_numerator(fraction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 3079L)
    public static SubLObject fraction_minus_p(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return (SubLObject)SubLObjectFactory.makeBoolean(!Numbers.minusp(fraction_numerator(fraction)).eql(Numbers.minusp(fraction_denominator(fraction))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 3296L)
    public static SubLObject fraction_plus_p(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return Equality.eql(Numbers.minusp(fraction_numerator(fraction)), Numbers.minusp(fraction_denominator(fraction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 3509L)
    public static SubLObject fraction_integer_p(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return (SubLObject)(fraction_denominator(fraction).isZero() ? fraction_utilities.NIL : Numbers.zerop(Numbers.mod(fraction_numerator(fraction), fraction_denominator(fraction))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 3734L)
    public static SubLObject fraction_numerator(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return fract_numerator(fraction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 3867L)
    public static SubLObject fraction_denominator(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return fract_denominator(fraction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 3989L)
    public static SubLObject numerator(final SubLObject fraction) {
        assert fraction_utilities.NIL != integer_or_fraction_p(fraction) : fraction;
        if (fraction.isInteger()) {
            return fraction;
        }
        return fraction_numerator(fraction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 4244L)
    public static SubLObject denominator(final SubLObject fraction) {
        assert fraction_utilities.NIL != integer_or_fraction_p(fraction) : fraction;
        if (fraction.isInteger()) {
            return (SubLObject)fraction_utilities.ONE_INTEGER;
        }
        return fraction_denominator(fraction);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 4482L)
    public static SubLObject integer_to_fraction(final SubLObject integer) {
        assert fraction_utilities.NIL != Types.integerp(integer) : integer;
        return new_fraction(integer, (SubLObject)fraction_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 4680L)
    public static SubLObject float_to_fraction(final SubLObject v_float) {
        assert fraction_utilities.NIL != Types.floatp(v_float) : v_float;
        return fractionify(scientific_numbers.scientific_number_to_integer_or_fraction(scientific_numbers.scientific_number_from_subl_real(v_float, (SubLObject)fraction_utilities.UNPROVIDED), (SubLObject)fraction_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 4917L)
    public static SubLObject fraction_to_number(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return Numbers.divide(fract_numerator(fraction), fract_denominator(fraction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 5130L)
    public static SubLObject number_to_fraction(final SubLObject number) {
        assert fraction_utilities.NIL != Types.numberp(number) : number;
        return number.isInteger() ? integer_to_fraction(number) : float_to_fraction(number);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 5360L)
    public static SubLObject fractionify(final SubLObject v_object) {
        assert fraction_utilities.NIL != number_or_fraction_p(v_object) : v_object;
        return v_object.isNumber() ? number_to_fraction(v_object) : v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 5630L)
    public static SubLObject defractionify(final SubLObject v_object) {
        assert fraction_utilities.NIL != number_or_fraction_p(v_object) : v_object;
        return (fraction_utilities.NIL != fraction_p(v_object)) ? fraction_to_number(v_object) : v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 5916L)
    public static SubLObject fraction_reduce(final SubLObject fraction) {
        assert fraction_utilities.NIL != integer_or_fraction_p(fraction) : fraction;
        if (fraction.isInteger()) {
            return fraction;
        }
        SubLObject numerator = fract_numerator(fraction);
        SubLObject denominator = fract_denominator(fraction);
        final SubLObject factor = number_utilities.gcd2(numerator, denominator);
        if (fraction_utilities.NIL != subl_promotions.negative_integer_p(denominator)) {
            numerator = Numbers.minus(numerator);
            denominator = Numbers.minus(denominator);
        }
        else if (factor.eql((SubLObject)fraction_utilities.ONE_INTEGER) && !denominator.numE(factor)) {
            return fraction;
        }
        if (denominator.numE(factor)) {
            return Numbers.divide(numerator, factor);
        }
        return new_fraction(Numbers.divide(numerator, factor), Numbers.divide(denominator, factor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 6750L)
    public static SubLObject reciprocal(final SubLObject value) {
        assert fraction_utilities.NIL != number_or_fraction_p(value) : value;
        return reciprocal_internal(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 6926L)
    public static SubLObject reduced_reciprocal(final SubLObject value) {
        assert fraction_utilities.NIL != number_or_fraction_p(value) : value;
        final SubLObject reciprocal = reciprocal_internal(value);
        return fraction_reduce(reciprocal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 7211L)
    public static SubLObject reciprocal_internal(SubLObject value) {
        if (fraction_utilities.NIL == integer_or_fraction_p(value)) {
            value = fractionify(value);
        }
        return new_fraction(denominator(value), numerator(value));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 7412L)
    public static SubLObject fractionE(final SubLObject fraction1, final SubLObject fraction2) {
        assert fraction_utilities.NIL != number_or_fraction_p(fraction1) : fraction1;
        assert fraction_utilities.NIL != number_or_fraction_p(fraction2) : fraction2;
        if (fraction_utilities.NIL != fraction_p(fraction1) && fraction_utilities.NIL != fraction_p(fraction2)) {
            final SubLObject reduced1 = fraction_reduce(fraction1);
            final SubLObject reduced2 = fraction_reduce(fraction2);
            return (SubLObject)SubLObjectFactory.makeBoolean(fract_numerator(reduced1).numE(fract_numerator(reduced2)) && fract_denominator(reduced1).numE(fract_denominator(reduced2)));
        }
        return Numbers.numE(defractionify(fraction1), defractionify(fraction2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 8059L)
    public static SubLObject fraction_times(final SubLObject values) {
        assert fraction_utilities.NIL != list_utilities.non_dotted_list_p(values) : values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = (SubLObject)fraction_utilities.NIL;
        elem = cdolist_list_var.first();
        while (fraction_utilities.NIL != cdolist_list_var) {
            assert fraction_utilities.NIL != number_or_fraction_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (fraction_utilities.NIL == values) {
            return new_fraction((SubLObject)fraction_utilities.ONE_INTEGER, (SubLObject)fraction_utilities.ONE_INTEGER);
        }
        final SubLObject fractions = Mapping.mapcar(Symbols.symbol_function((SubLObject)fraction_utilities.$sym29$FRACTIONIFY), values);
        if (fraction_utilities.NIL != list_utilities.singletonP(fractions)) {
            return fraction_reduce(fractions.first());
        }
        return fraction_times_internal(fractions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 8462L)
    public static SubLObject fraction_times2(final SubLObject value1, final SubLObject value2) {
        assert fraction_utilities.NIL != number_or_fraction_p(value1) : value1;
        assert fraction_utilities.NIL != number_or_fraction_p(value2) : value2;
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject fraction2 = fractionify(value2);
        return fraction_times2_internal(fraction1, fraction2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 8836L)
    public static SubLObject fraction_times_internal(final SubLObject fractions) {
        final SubLObject product_of_first_two = fraction_times2_internal(fractions.first(), conses_high.second(fractions));
        if (fraction_utilities.NIL != list_utilities.doubletonP(fractions)) {
            return product_of_first_two;
        }
        final SubLObject rest_of_list = conses_high.cddr(fractions);
        return fraction_times_internal((SubLObject)ConsesLow.cons(product_of_first_two, rest_of_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 9317L)
    public static SubLObject fraction_times2_internal(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject product = new_fraction(Numbers.multiply(fract_numerator(fraction1), fract_numerator(fraction2)), Numbers.multiply(fract_denominator(fraction1), fract_denominator(fraction2)));
        return fraction_reduce(product);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 9666L)
    public static SubLObject fraction_divide(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert fraction_utilities.NIL != number_or_fraction_p(value1) : value1;
        assert fraction_utilities.NIL != number_or_fraction_p(value2) : value2;
        if (fraction_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && fraction_utilities.NIL != fractionE((SubLObject)fraction_utilities.ZERO_INTEGER, value2)) {
            Errors.error((SubLObject)fraction_utilities.$str30$Attempt_to_fraction_divide_by_zer);
        }
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject reciprocal2 = reciprocal(value2);
        return fraction_times2_internal(fraction1, reciprocal2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 10137L)
    public static SubLObject fraction_add(final SubLObject values) {
        assert fraction_utilities.NIL != list_utilities.non_dotted_list_p(values) : values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = (SubLObject)fraction_utilities.NIL;
        elem = cdolist_list_var.first();
        while (fraction_utilities.NIL != cdolist_list_var) {
            assert fraction_utilities.NIL != number_or_fraction_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (fraction_utilities.NIL == values) {
            return new_fraction((SubLObject)fraction_utilities.ZERO_INTEGER, (SubLObject)fraction_utilities.ONE_INTEGER);
        }
        final SubLObject fractions = Mapping.mapcar(Symbols.symbol_function((SubLObject)fraction_utilities.$sym29$FRACTIONIFY), values);
        if (fraction_utilities.NIL != list_utilities.singletonP(fractions)) {
            return fraction_reduce(fractions.first());
        }
        return fraction_add_internal(fractions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 10547L)
    public static SubLObject fraction_add2(final SubLObject value1, final SubLObject value2) {
        assert fraction_utilities.NIL != number_or_fraction_p(value1) : value1;
        assert fraction_utilities.NIL != number_or_fraction_p(value2) : value2;
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject fraction2 = fractionify(value2);
        return fraction_add2_internal(fraction1, fraction2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 10930L)
    public static SubLObject fraction_add_internal(final SubLObject fractions) {
        final SubLObject sum_of_first_two = fraction_add2_internal(fractions.first(), conses_high.second(fractions));
        if (fraction_utilities.NIL != list_utilities.doubletonP(fractions)) {
            return sum_of_first_two;
        }
        return fraction_add_internal((SubLObject)ConsesLow.cons(sum_of_first_two, conses_high.cddr(fractions)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 11346L)
    public static SubLObject fraction_add2_internal(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject numerator1 = fract_numerator(fraction1);
        final SubLObject numerator2 = fract_numerator(fraction2);
        final SubLObject denominator1 = fract_denominator(fraction1);
        final SubLObject denominator2 = fract_denominator(fraction2);
        final SubLObject denominator_sum = number_utilities.lcm2(denominator1, denominator2);
        final SubLObject factor1 = Numbers.integerDivide(denominator_sum, denominator1);
        final SubLObject factor2 = Numbers.integerDivide(denominator_sum, denominator2);
        final SubLObject new_numerator1 = Numbers.multiply(factor1, numerator1);
        final SubLObject new_numerator2 = Numbers.multiply(factor2, numerator2);
        final SubLObject numerator_sum = Numbers.add(new_numerator1, new_numerator2);
        return fraction_reduce(new_fraction(numerator_sum, denominator_sum));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 12066L)
    public static SubLObject fraction_minus(final SubLObject value1, SubLObject value2) {
        if (value2 == fraction_utilities.UNPROVIDED) {
            value2 = (SubLObject)fraction_utilities.NIL;
        }
        assert fraction_utilities.NIL != number_or_fraction_p(value1) : value1;
        if (fraction_utilities.NIL != value2) {
            return fraction_add2_internal(fractionify(value1), fraction_minus(value2, (SubLObject)fraction_utilities.UNPROVIDED));
        }
        return new_fraction(Numbers.minus(numerator(value1)), denominator(value1));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 12619L)
    public static SubLObject fraction_abs(final SubLObject fraction) {
        assert fraction_utilities.NIL != fraction_p(fraction) : fraction;
        return (fraction_utilities.NIL != fraction_plus_p(fraction)) ? fraction : new_fraction(Numbers.abs(fraction_numerator(fraction)), Numbers.abs(fraction_denominator(fraction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 12951L)
    public static SubLObject fraction_sqrt(final SubLObject fraction) {
        final SubLObject numerator = Numbers.sqrt(fraction_numerator(fraction));
        final SubLObject denominator = Numbers.sqrt(fraction_denominator(fraction));
        return (numerator.isInteger() && denominator.isInteger()) ? new_fraction(numerator, denominator) : Numbers.divide(numerator, denominator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 13315L)
    public static SubLObject fraction_log(final SubLObject fraction, SubLObject base) {
        if (base == fraction_utilities.UNPROVIDED) {
            base = Numbers.$exp1$.getGlobalValue();
        }
        return Numbers.log(defractionify(fraction), defractionify(base));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 13505L)
    public static SubLObject fraction_expt(SubLObject base, final SubLObject power) {
        if (fraction_utilities.NIL != fraction_p(base)) {
            base = fraction_reduce(base);
            final SubLObject numerator = fraction_expt(fraction_numerator(base), power);
            final SubLObject denominator = fraction_expt(fraction_denominator(base), power);
            return (numerator.isInteger() && denominator.isInteger()) ? fraction_reduce(new_fraction(numerator, denominator)) : Numbers.divide(numerator, denominator);
        }
        if (fraction_utilities.NIL != extended_numbers.power_too_largeP(base, defractionify(power))) {
            Errors.error((SubLObject)fraction_utilities.$str31$Can_t_raise__S_to__S, base, power);
            return (SubLObject)fraction_utilities.NIL;
        }
        return Numbers.expt(defractionify(base), defractionify(power));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 14147L)
    public static SubLObject fraction_exp(final SubLObject fraction) {
        return Numbers.exp(defractionify(fraction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/fraction-utilities.lisp", position = 14293L)
    public static SubLObject normalize_fractional_phrase(final SubLObject values) {
        assert fraction_utilities.NIL != list_utilities.non_dotted_list_p(values) : values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = (SubLObject)fraction_utilities.NIL;
        elem = cdolist_list_var.first();
        while (fraction_utilities.NIL != cdolist_list_var) {
            assert fraction_utilities.NIL != integer_or_fraction_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject denominators = Mapping.mapcar(Symbols.symbol_function((SubLObject)fraction_utilities.$sym32$DENOMINATOR), Mapping.mapcar(Symbols.symbol_function((SubLObject)fraction_utilities.$sym33$FRACTION_REDUCE), values));
        final SubLObject factor = number_utilities.lcm(denominators);
        SubLObject result = (SubLObject)fraction_utilities.NIL;
        SubLObject cdolist_list_var2 = values;
        SubLObject value = (SubLObject)fraction_utilities.NIL;
        value = cdolist_list_var2.first();
        while (fraction_utilities.NIL != cdolist_list_var2) {
            final SubLObject product = fraction_times2(value, factor);
            result = (SubLObject)ConsesLow.cons(defractionify(product), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            value = cdolist_list_var2.first();
        }
        result = Sequences.nreverse(result);
        return result;
    }
    
    public static SubLObject declare_fraction_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_print_function_trampoline", "FRACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_p", "FRACTION-P", 1, 0, false);
        new $fraction_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fract_numerator", "FRACT-NUMERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fract_denominator", "FRACT-DENOMINATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "_csetf_fract_numerator", "_CSETF-FRACT-NUMERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "_csetf_fract_denominator", "_CSETF-FRACT-DENOMINATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "make_fraction", "MAKE-FRACTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "visit_defstruct_fraction", "VISIT-DEFSTRUCT-FRACTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "visit_defstruct_object_fraction_method", "VISIT-DEFSTRUCT-OBJECT-FRACTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "print_fraction", "PRINT-FRACTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "new_fraction", "NEW-FRACTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "copy_fraction", "COPY-FRACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "integer_or_fraction_p", "INTEGER-OR-FRACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "number_or_fraction_p", "NUMBER-OR-FRACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "list_of_fraction_p", "LIST-OF-FRACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "list_of_integer_or_fraction_p", "LIST-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "list_of_number_or_fraction_p", "LIST-OF-NUMBER-OR-FRACTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_zero_p", "FRACTION-ZERO-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_minus_p", "FRACTION-MINUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_plus_p", "FRACTION-PLUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_integer_p", "FRACTION-INTEGER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_numerator", "FRACTION-NUMERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_denominator", "FRACTION-DENOMINATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "numerator", "NUMERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "denominator", "DENOMINATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "integer_to_fraction", "INTEGER-TO-FRACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "float_to_fraction", "FLOAT-TO-FRACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_to_number", "FRACTION-TO-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "number_to_fraction", "NUMBER-TO-FRACTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fractionify", "FRACTIONIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "defractionify", "DEFRACTIONIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_reduce", "FRACTION-REDUCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "reciprocal", "RECIPROCAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "reduced_reciprocal", "REDUCED-RECIPROCAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "reciprocal_internal", "RECIPROCAL-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fractionE", "FRACTION=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_times", "FRACTION-TIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_times2", "FRACTION-TIMES2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_times_internal", "FRACTION-TIMES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_times2_internal", "FRACTION-TIMES2-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_divide", "FRACTION-DIVIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_add", "FRACTION-ADD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_add2", "FRACTION-ADD2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_add_internal", "FRACTION-ADD-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_add2_internal", "FRACTION-ADD2-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_minus", "FRACTION-MINUS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_abs", "FRACTION-ABS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_sqrt", "FRACTION-SQRT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_log", "FRACTION-LOG", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_expt", "FRACTION-EXPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "fraction_exp", "FRACTION-EXP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.fraction_utilities", "normalize_fractional_phrase", "NORMALIZE-FRACTIONAL-PHRASE", 1, 0, false);
        return (SubLObject)fraction_utilities.NIL;
    }
    
    public static SubLObject init_fraction_utilities_file() {
        fraction_utilities.$dtp_fraction$ = SubLFiles.defconstant("*DTP-FRACTION*", (SubLObject)fraction_utilities.$sym0$FRACTION);
        return (SubLObject)fraction_utilities.NIL;
    }
    
    public static SubLObject setup_fraction_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), fraction_utilities.$dtp_fraction$.getGlobalValue(), Symbols.symbol_function((SubLObject)fraction_utilities.$sym7$FRACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)fraction_utilities.$list8);
        Structures.def_csetf((SubLObject)fraction_utilities.$sym9$FRACT_NUMERATOR, (SubLObject)fraction_utilities.$sym10$_CSETF_FRACT_NUMERATOR);
        Structures.def_csetf((SubLObject)fraction_utilities.$sym11$FRACT_DENOMINATOR, (SubLObject)fraction_utilities.$sym12$_CSETF_FRACT_DENOMINATOR);
        Equality.identity((SubLObject)fraction_utilities.$sym0$FRACTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), fraction_utilities.$dtp_fraction$.getGlobalValue(), Symbols.symbol_function((SubLObject)fraction_utilities.$sym20$VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD));
        return (SubLObject)fraction_utilities.NIL;
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
        me = (SubLFile)new fraction_utilities();
        fraction_utilities.$dtp_fraction$ = null;
        $sym0$FRACTION = SubLObjectFactory.makeSymbol("FRACTION");
        $sym1$FRACTION_P = SubLObjectFactory.makeSymbol("FRACTION-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("DENOMINATOR"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUMERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("DENOMINATOR"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRACT-NUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("FRACT-DENOMINATOR"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FRACT-NUMERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FRACT-DENOMINATOR"));
        $sym6$PRINT_FRACTION = SubLObjectFactory.makeSymbol("PRINT-FRACTION");
        $sym7$FRACTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FRACTION-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FRACTION-P"));
        $sym9$FRACT_NUMERATOR = SubLObjectFactory.makeSymbol("FRACT-NUMERATOR");
        $sym10$_CSETF_FRACT_NUMERATOR = SubLObjectFactory.makeSymbol("_CSETF-FRACT-NUMERATOR");
        $sym11$FRACT_DENOMINATOR = SubLObjectFactory.makeSymbol("FRACT-DENOMINATOR");
        $sym12$_CSETF_FRACT_DENOMINATOR = SubLObjectFactory.makeSymbol("_CSETF-FRACT-DENOMINATOR");
        $kw13$NUMERATOR = SubLObjectFactory.makeKeyword("NUMERATOR");
        $kw14$DENOMINATOR = SubLObjectFactory.makeKeyword("DENOMINATOR");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_FRACTION = SubLObjectFactory.makeSymbol("MAKE-FRACTION");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FRACTION-METHOD");
        $str21$_A__A = SubLObjectFactory.makeString("~A/~A");
        $str22$Can_t_coerce__S_to_an_INTEGERP_ = SubLObjectFactory.makeString("Can't coerce ~S to an INTEGERP.");
        $sym23$INTEGER_OR_FRACTION_P = SubLObjectFactory.makeSymbol("INTEGER-OR-FRACTION-P");
        $sym24$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym25$FLOATP = SubLObjectFactory.makeSymbol("FLOATP");
        $sym26$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym27$NUMBER_OR_FRACTION_P = SubLObjectFactory.makeSymbol("NUMBER-OR-FRACTION-P");
        $sym28$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym29$FRACTIONIFY = SubLObjectFactory.makeSymbol("FRACTIONIFY");
        $str30$Attempt_to_fraction_divide_by_zer = SubLObjectFactory.makeString("Attempt to fraction-divide by zero");
        $str31$Can_t_raise__S_to__S = SubLObjectFactory.makeString("Can't raise ~S to ~S");
        $sym32$DENOMINATOR = SubLObjectFactory.makeSymbol("DENOMINATOR");
        $sym33$FRACTION_REDUCE = SubLObjectFactory.makeSymbol("FRACTION-REDUCE");
    }
    
    public static final class $fraction_native extends SubLStructNative
    {
        public SubLObject $numerator;
        public SubLObject $denominator;
        private static final SubLStructDeclNative structDecl;
        
        public $fraction_native() {
            this.$numerator = (SubLObject)CommonSymbols.NIL;
            this.$denominator = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fraction_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$fraction_native.class, fraction_utilities.$sym0$FRACTION, fraction_utilities.$sym1$FRACTION_P, fraction_utilities.$list2, fraction_utilities.$list3, new String[] { "$numerator", "$denominator" }, fraction_utilities.$list4, fraction_utilities.$list5, fraction_utilities.$sym6$PRINT_FRACTION);
        }
    }
    
    public static final class $fraction_p$UnaryFunction extends UnaryFunction
    {
        public $fraction_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FRACTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return fraction_utilities.fraction_p(arg1);
        }
    }
}

/*

	Total time: 193 ms
	
*/