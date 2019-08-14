/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$exp1$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.exp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sqrt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.floatp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      FRACTION-UTILITIES
 * source file: /cyc/top/cycl/fraction-utilities.lisp
 * created:     2019/07/03 17:37:12
 */
public final class fraction_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_fraction_kitchen_sink_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_fraction_kitchen_sink_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject fraction_kitchen_sink_test_case_p(SubLObject fraction_kitchen_sink_test_case) {
        return classes.subloop_instanceof_class(fraction_kitchen_sink_test_case, FRACTION_KITCHEN_SINK_TEST_CASE);
    }

    // Definitions
    public static final class $fraction_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.this.$numerator;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.this.$denominator;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.this.$numerator = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.this.$denominator = value;
        }

        public SubLObject $numerator = Lisp.NIL;

        public SubLObject $denominator = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.class, FRACTION, FRACTION_P, $list_alt2, $list_alt3, new String[]{ "$numerator", "$denominator" }, $list_alt4, $list_alt5, PRINT_FRACTION);
    }

    public static final SubLFile me = new fraction_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.fraction_utilities";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_fraction$ = makeSymbol("*DTP-FRACTION*");

    private static final SubLSymbol FRACTION_P = makeSymbol("FRACTION-P");

    static private final SubLList $list2 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));

    static private final SubLList $list3 = list(makeKeyword("NUMERATOR"), makeKeyword("DENOMINATOR"));

    static private final SubLList $list4 = list(makeSymbol("FRACT-NUMERATOR"), makeSymbol("FRACT-DENOMINATOR"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-FRACT-NUMERATOR"), makeSymbol("_CSETF-FRACT-DENOMINATOR"));

    private static final SubLSymbol PRINT_FRACTION = makeSymbol("PRINT-FRACTION");

    private static final SubLSymbol FRACTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FRACTION-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLObject fraction_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_fraction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject fraction_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fraction(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject fraction_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject fraction_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.fraction_utilities.$fraction_native.class ? T : NIL;
    }

    public static final SubLObject fract_numerator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FRACTION_P);
        return v_object.getField2();
    }

    public static SubLObject fract_numerator(final SubLObject v_object) {
        assert NIL != fraction_p(v_object) : "! fraction_utilities.fraction_p(v_object) " + "fraction_utilities.fraction_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fract_denominator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FRACTION_P);
        return v_object.getField3();
    }

    public static SubLObject fract_denominator(final SubLObject v_object) {
        assert NIL != fraction_p(v_object) : "! fraction_utilities.fraction_p(v_object) " + "fraction_utilities.fraction_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_fract_numerator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FRACTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fract_numerator(final SubLObject v_object, final SubLObject value) {
        assert NIL != fraction_p(v_object) : "! fraction_utilities.fraction_p(v_object) " + "fraction_utilities.fraction_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fract_denominator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FRACTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fract_denominator(final SubLObject v_object, final SubLObject value) {
        assert NIL != fraction_p(v_object) : "! fraction_utilities.fraction_p(v_object) " + "fraction_utilities.fraction_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_fraction_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.fraction_utilities.$fraction_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NUMERATOR)) {
                        _csetf_fract_numerator(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DENOMINATOR)) {
                            _csetf_fract_denominator(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_fraction(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.fraction_utilities.$fraction_native();
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

    public static final SubLObject print_fraction_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject numerator = fract_numerator(v_object);
            SubLObject denominator = fract_denominator(v_object);
            format(stream, $str_alt15$_A__A, numerator, denominator);
        }
        return NIL;
    }

    public static SubLObject print_fraction(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject numerator = fract_numerator(v_object);
        final SubLObject denominator = fract_denominator(v_object);
        format(stream, $str21$_A__A, numerator, denominator);
        return NIL;
    }

    public static final SubLObject new_fraction_alt(SubLObject numerator, SubLObject denominator) {
        if (denominator == UNPROVIDED) {
            denominator = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(numerator, INTEGERP);
        SubLTrampolineFile.checkType(denominator, NON_ZERO_INTEGER_P);
        return make_fraction(list($NUMERATOR, numerator, $DENOMINATOR, denominator));
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
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return new_fraction(fraction_numerator(fraction), fraction_denominator(fraction));
    }

    public static final SubLObject integer_or_fraction_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isInteger() || (NIL != fraction_p(v_object)));
    }

    public static SubLObject integer_or_fraction_p(final SubLObject v_object) {
        return makeBoolean(v_object.isInteger() || (NIL != fraction_p(v_object)));
    }

    public static final SubLObject number_or_fraction_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isNumber() || (NIL != fraction_p(v_object)));
    }

    public static SubLObject number_or_fraction_p(final SubLObject v_object) {
        return makeBoolean(v_object.isNumber() || (NIL != fraction_p(v_object)));
    }

    public static final SubLObject list_of_fraction_p_alt(SubLObject v_object) {
        if (v_object.isList()) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (NIL == fraction_p(item)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
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

    public static final SubLObject list_of_integer_or_fraction_p_alt(SubLObject v_object) {
        if (v_object.isList()) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (NIL == integer_or_fraction_p(item)) {
                        return NIL;
                    }
                }
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

    public static final SubLObject list_of_number_or_fraction_p_alt(SubLObject v_object) {
        if (v_object.isList()) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (NIL == number_or_fraction_p(item)) {
                        return NIL;
                    }
                }
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
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return zerop(fraction_numerator(fraction));
    }

    public static SubLObject fraction_minus_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return makeBoolean(!minusp(fraction_numerator(fraction)).eql(minusp(fraction_denominator(fraction))));
    }

    public static SubLObject fraction_plus_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return eql(minusp(fraction_numerator(fraction)), minusp(fraction_denominator(fraction)));
    }

    public static SubLObject fraction_integer_p(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return fraction_denominator(fraction).isZero() ? NIL : zerop(mod(fraction_numerator(fraction), fraction_denominator(fraction)));
    }

    public static final SubLObject fraction_numerator_alt(SubLObject fraction) {
        SubLTrampolineFile.checkType(fraction, FRACTION_P);
        return fract_numerator(fraction);
    }

    public static SubLObject fraction_numerator(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return fract_numerator(fraction);
    }

    public static final SubLObject fraction_denominator_alt(SubLObject fraction) {
        SubLTrampolineFile.checkType(fraction, FRACTION_P);
        return fract_denominator(fraction);
    }

    public static SubLObject fraction_denominator(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return fract_denominator(fraction);
    }

    /**
     *
     *
     * @param FRACTION;
    integer-or-fraction-p
     * 		
     * @return integerp
     */
    @LispMethod(comment = "@param FRACTION;\ninteger-or-fraction-p\r\n\t\t\r\n@return integerp")
    public static final SubLObject numerator_alt(SubLObject fraction) {
        SubLTrampolineFile.checkType(fraction, INTEGER_OR_FRACTION_P);
        if (fraction.isInteger()) {
            return fraction;
        } else {
            return fraction_numerator(fraction);
        }
    }

    /**
     *
     *
     * @param FRACTION;
    integer-or-fraction-p
     * 		
     * @return integerp
     */
    @LispMethod(comment = "@param FRACTION;\ninteger-or-fraction-p\r\n\t\t\r\n@return integerp")
    public static SubLObject numerator(final SubLObject fraction) {
        assert NIL != integer_or_fraction_p(fraction) : "! fraction_utilities.integer_or_fraction_p(fraction) " + ("fraction_utilities.integer_or_fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(fraction) ") + fraction;
        if (fraction.isInteger()) {
            return fraction;
        }
        return fraction_numerator(fraction);
    }

    /**
     *
     *
     * @param FRACTION;
    integer-or-fraction-p
     * 		
     * @return integerp
     */
    @LispMethod(comment = "@param FRACTION;\ninteger-or-fraction-p\r\n\t\t\r\n@return integerp")
    public static final SubLObject denominator_alt(SubLObject fraction) {
        SubLTrampolineFile.checkType(fraction, INTEGER_OR_FRACTION_P);
        if (fraction.isInteger()) {
            return ONE_INTEGER;
        } else {
            return fraction_denominator(fraction);
        }
    }

    /**
     *
     *
     * @param FRACTION;
    integer-or-fraction-p
     * 		
     * @return integerp
     */
    @LispMethod(comment = "@param FRACTION;\ninteger-or-fraction-p\r\n\t\t\r\n@return integerp")
    public static SubLObject denominator(final SubLObject fraction) {
        assert NIL != integer_or_fraction_p(fraction) : "! fraction_utilities.integer_or_fraction_p(fraction) " + ("fraction_utilities.integer_or_fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(fraction) ") + fraction;
        if (fraction.isInteger()) {
            return ONE_INTEGER;
        }
        return fraction_denominator(fraction);
    }

    /**
     *
     *
     * @return fraction-p; INTEGER converted to fraction form (INTEGER/1)
     */
    @LispMethod(comment = "@return fraction-p; INTEGER converted to fraction form (INTEGER/1)")
    public static final SubLObject integer_to_fraction_alt(SubLObject integer) {
        SubLTrampolineFile.checkType(integer, INTEGERP);
        return new_fraction(integer, ONE_INTEGER);
    }

    /**
     *
     *
     * @return fraction-p; INTEGER converted to fraction form (INTEGER/1)
     */
    @LispMethod(comment = "@return fraction-p; INTEGER converted to fraction form (INTEGER/1)")
    public static SubLObject integer_to_fraction(final SubLObject integer) {
        assert NIL != integerp(integer) : "! integerp(integer) " + ("Types.integerp(integer) " + "CommonSymbols.NIL != Types.integerp(integer) ") + integer;
        return new_fraction(integer, ONE_INTEGER);
    }

    public static SubLObject float_to_fraction(final SubLObject v_float) {
        assert NIL != floatp(v_float) : "! floatp(v_float) " + ("Types.floatp(v_float) " + "CommonSymbols.NIL != Types.floatp(v_float) ") + v_float;
        return fractionify(scientific_numbers.scientific_number_to_integer_or_fraction(scientific_numbers.scientific_number_from_subl_real(v_float, UNPROVIDED), UNPROVIDED));
    }

    /**
     *
     *
     * @return numberp; FRACTION converted to an integer or float
     */
    @LispMethod(comment = "@return numberp; FRACTION converted to an integer or float")
    public static final SubLObject fraction_to_number_alt(SubLObject fraction) {
        SubLTrampolineFile.checkType(fraction, FRACTION_P);
        return divide(fract_numerator(fraction), fract_denominator(fraction));
    }

    /**
     *
     *
     * @return numberp; FRACTION converted to an integer or float
     */
    @LispMethod(comment = "@return numberp; FRACTION converted to an integer or float")
    public static SubLObject fraction_to_number(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
        return divide(fract_numerator(fraction), fract_denominator(fraction));
    }

    public static SubLObject number_to_fraction(final SubLObject number) {
        assert NIL != numberp(number) : "! numberp(number) " + ("Types.numberp(number) " + "CommonSymbols.NIL != Types.numberp(number) ") + number;
        return number.isInteger() ? integer_to_fraction(number) : float_to_fraction(number);
    }

    /**
     * If the arg is an integer, returns it as a fraction-p.
     * Otherwise, returns the arg.  Does not modify its arg.
     */
    @LispMethod(comment = "If the arg is an integer, returns it as a fraction-p.\r\nOtherwise, returns the arg.  Does not modify its arg.\nIf the arg is an integer, returns it as a fraction-p.\nOtherwise, returns the arg.  Does not modify its arg.")
    public static final SubLObject fractionify_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTEGER_OR_FRACTION_P);
        return v_object.isInteger() ? ((SubLObject) (integer_to_fraction(v_object))) : v_object;
    }

    /**
     * If the arg is an integer, returns it as a fraction-p.
     * Otherwise, returns the arg.  Does not modify its arg.
     */
    @LispMethod(comment = "If the arg is an integer, returns it as a fraction-p.\r\nOtherwise, returns the arg.  Does not modify its arg.\nIf the arg is an integer, returns it as a fraction-p.\nOtherwise, returns the arg.  Does not modify its arg.")
    public static SubLObject fractionify(final SubLObject v_object) {
        assert NIL != number_or_fraction_p(v_object) : "! fraction_utilities.number_or_fraction_p(v_object) " + "fraction_utilities.number_or_fraction_p error :" + v_object;
        return v_object.isNumber() ? number_to_fraction(v_object) : v_object;
    }

    /**
     * If the arg is a fraction-p, returns it as an integer or float.
     * Otherwise, returns the arg.  Does not modify its arg.
     */
    @LispMethod(comment = "If the arg is a fraction-p, returns it as an integer or float.\r\nOtherwise, returns the arg.  Does not modify its arg.\nIf the arg is a fraction-p, returns it as an integer or float.\nOtherwise, returns the arg.  Does not modify its arg.")
    public static final SubLObject defractionify_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, NUMBER_OR_FRACTION_P);
        return NIL != fraction_p(v_object) ? ((SubLObject) (fraction_to_number(v_object))) : v_object;
    }

    /**
     * If the arg is a fraction-p, returns it as an integer or float.
     * Otherwise, returns the arg.  Does not modify its arg.
     */
    @LispMethod(comment = "If the arg is a fraction-p, returns it as an integer or float.\r\nOtherwise, returns the arg.  Does not modify its arg.\nIf the arg is a fraction-p, returns it as an integer or float.\nOtherwise, returns the arg.  Does not modify its arg.")
    public static SubLObject defractionify(final SubLObject v_object) {
        assert NIL != number_or_fraction_p(v_object) : "! fraction_utilities.number_or_fraction_p(v_object) " + "fraction_utilities.number_or_fraction_p error :" + v_object;
        return NIL != fraction_p(v_object) ? fraction_to_number(v_object) : v_object;
    }

    /**
     *
     *
     * @param FRACTION;
    integer-or-fraction-p
     * 		
     * @return integer-or-fractionp
     */
    @LispMethod(comment = "@param FRACTION;\ninteger-or-fraction-p\r\n\t\t\r\n@return integer-or-fractionp")
    public static final SubLObject fraction_reduce_alt(SubLObject fraction) {
        SubLTrampolineFile.checkType(fraction, INTEGER_OR_FRACTION_P);
        if (fraction.isInteger()) {
            return fraction;
        } else {
            {
                SubLObject numerator = fract_numerator(fraction);
                SubLObject denominator = fract_denominator(fraction);
                SubLObject factor = number_utilities.gcd2(numerator, denominator);
                if (NIL != subl_promotions.negative_integer_p(denominator)) {
                    numerator = minus(numerator);
                    denominator = minus(denominator);
                }
                return new_fraction(divide(numerator, factor), divide(denominator, factor));
            }
        }
    }

    /**
     *
     *
     * @param FRACTION;
    integer-or-fraction-p
     * 		
     * @return integer-or-fractionp
     */
    @LispMethod(comment = "@param FRACTION;\ninteger-or-fraction-p\r\n\t\t\r\n@return integer-or-fractionp")
    public static SubLObject fraction_reduce(final SubLObject fraction) {
        assert NIL != integer_or_fraction_p(fraction) : "! fraction_utilities.integer_or_fraction_p(fraction) " + ("fraction_utilities.integer_or_fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(fraction) ") + fraction;
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

    /**
     *
     *
     * @param VALUE;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static final SubLObject reciprocal_alt(SubLObject value) {
        SubLTrampolineFile.checkType(value, INTEGER_OR_FRACTION_P);
        return reciprocal_internal(value);
    }

    /**
     *
     *
     * @param VALUE;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static SubLObject reciprocal(final SubLObject value) {
        assert NIL != number_or_fraction_p(value) : "! fraction_utilities.number_or_fraction_p(value) " + ("fraction_utilities.number_or_fraction_p(value) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value) ") + value;
        return reciprocal_internal(value);
    }

    /**
     *
     *
     * @param VALUE;
    integer-or-fraction-p
     * 		
     * @return fraction-p; the reciprocal of VALUE, but in reduced form
     */
    @LispMethod(comment = "@param VALUE;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p; the reciprocal of VALUE, but in reduced form")
    public static final SubLObject reduced_reciprocal_alt(SubLObject value) {
        SubLTrampolineFile.checkType(value, INTEGER_OR_FRACTION_P);
        {
            SubLObject reciprocal = reciprocal_internal(value);
            return fraction_reduce(reciprocal);
        }
    }

    /**
     *
     *
     * @param VALUE;
    integer-or-fraction-p
     * 		
     * @return fraction-p; the reciprocal of VALUE, but in reduced form
     */
    @LispMethod(comment = "@param VALUE;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p; the reciprocal of VALUE, but in reduced form")
    public static SubLObject reduced_reciprocal(final SubLObject value) {
        assert NIL != number_or_fraction_p(value) : "! fraction_utilities.number_or_fraction_p(value) " + ("fraction_utilities.number_or_fraction_p(value) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value) ") + value;
        final SubLObject reciprocal = reciprocal_internal(value);
        return fraction_reduce(reciprocal);
    }

    public static final SubLObject reciprocal_internal_alt(SubLObject value) {
        return new_fraction(denominator(value), numerator(value));
    }

    public static SubLObject reciprocal_internal(SubLObject value) {
        if (NIL == integer_or_fraction_p(value)) {
            value = fractionify(value);
        }
        return new_fraction(denominator(value), numerator(value));
    }

    /**
     *
     *
     * @param FRACTION1;
    number-or-fraction-p
     * 		
     * @param FRACTION2;
    number-or-fraction-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param FRACTION1;\nnumber-or-fraction-p\r\n\t\t\r\n@param FRACTION2;\nnumber-or-fraction-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject fractionE_alt(SubLObject fraction1, SubLObject fraction2) {
        SubLTrampolineFile.checkType(fraction1, NUMBER_OR_FRACTION_P);
        SubLTrampolineFile.checkType(fraction2, NUMBER_OR_FRACTION_P);
        if ((NIL != fraction_p(fraction1)) && (NIL != fraction_p(fraction2))) {
            {
                SubLObject reduced1 = fraction_reduce(fraction1);
                SubLObject reduced2 = fraction_reduce(fraction2);
                return makeBoolean(fract_numerator(reduced1).numE(fract_numerator(reduced2)) && fract_denominator(reduced1).numE(fract_denominator(reduced2)));
            }
        } else {
            return numE(defractionify(fraction1), defractionify(fraction2));
        }
    }

    /**
     *
     *
     * @param FRACTION1;
    number-or-fraction-p
     * 		
     * @param FRACTION2;
    number-or-fraction-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param FRACTION1;\nnumber-or-fraction-p\r\n\t\t\r\n@param FRACTION2;\nnumber-or-fraction-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject fractionE(final SubLObject fraction1, final SubLObject fraction2) {
        assert NIL != number_or_fraction_p(fraction1) : "! fraction_utilities.number_or_fraction_p(fraction1) " + ("fraction_utilities.number_or_fraction_p(fraction1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(fraction1) ") + fraction1;
        assert NIL != number_or_fraction_p(fraction2) : "! fraction_utilities.number_or_fraction_p(fraction2) " + ("fraction_utilities.number_or_fraction_p(fraction2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(fraction2) ") + fraction2;
        if ((NIL != fraction_p(fraction1)) && (NIL != fraction_p(fraction2))) {
            final SubLObject reduced1 = fraction_reduce(fraction1);
            final SubLObject reduced2 = fraction_reduce(fraction2);
            return makeBoolean(fract_numerator(reduced1).numE(fract_numerator(reduced2)) && fract_denominator(reduced1).numE(fract_denominator(reduced2)));
        }
        return numE(defractionify(fraction1), defractionify(fraction2));
    }

    /**
     *
     *
     * @param VALUES;
     * 		listp of integer-or-fraction-p
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUES;\r\n\t\tlistp of integer-or-fraction-p\r\n@return fraction-p")
    public static final SubLObject fraction_times_alt(SubLObject values) {
        {
            SubLObject list_var = values;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, INTEGER_OR_FRACTION_P);
                }
            }
        }
        if (NIL == values) {
            return new_fraction(ONE_INTEGER, ONE_INTEGER);
        } else {
            {
                SubLObject fractions = Mapping.mapcar(symbol_function(FRACTIONIFY), values);
                if (NIL != list_utilities.singletonP(fractions)) {
                    return fraction_reduce(fractions.first());
                } else {
                    return fraction_times_internal(fractions);
                }
            }
        }
    }

    /**
     *
     *
     * @param VALUES;
     * 		listp of integer-or-fraction-p
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUES;\r\n\t\tlistp of integer-or-fraction-p\r\n@return fraction-p")
    public static SubLObject fraction_times(final SubLObject values) {
        assert NIL != list_utilities.non_dotted_list_p(values) : "! list_utilities.non_dotted_list_p(values) " + ("list_utilities.non_dotted_list_p(values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(values) ") + values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != number_or_fraction_p(elem) : "! fraction_utilities.number_or_fraction_p(elem) " + ("fraction_utilities.number_or_fraction_p(elem) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(elem) ") + elem;
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

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static final SubLObject fraction_times2_alt(SubLObject value1, SubLObject value2) {
        SubLTrampolineFile.checkType(value1, INTEGER_OR_FRACTION_P);
        SubLTrampolineFile.checkType(value2, INTEGER_OR_FRACTION_P);
        {
            SubLObject fraction1 = fractionify(value1);
            SubLObject fraction2 = fractionify(value2);
            return fraction_times2_internal(fraction1, fraction2);
        }
    }

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static SubLObject fraction_times2(final SubLObject value1, final SubLObject value2) {
        assert NIL != number_or_fraction_p(value1) : "! fraction_utilities.number_or_fraction_p(value1) " + ("fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) ") + value1;
        assert NIL != number_or_fraction_p(value2) : "! fraction_utilities.number_or_fraction_p(value2) " + ("fraction_utilities.number_or_fraction_p(value2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value2) ") + value2;
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject fraction2 = fractionify(value2);
        return fraction_times2_internal(fraction1, fraction2);
    }

    public static final SubLObject fraction_times_internal_alt(SubLObject fractions) {
        {
            SubLObject product_of_first_two = fraction_times2_internal(fractions.first(), second(fractions));
            if (NIL != list_utilities.doubletonP(fractions)) {
                return product_of_first_two;
            } else {
                {
                    SubLObject rest_of_list = cddr(fractions);
                    return fraction_times_internal(cons(product_of_first_two, rest_of_list));
                }
            }
        }
    }

    public static SubLObject fraction_times_internal(final SubLObject fractions) {
        final SubLObject product_of_first_two = fraction_times2_internal(fractions.first(), second(fractions));
        if (NIL != list_utilities.doubletonP(fractions)) {
            return product_of_first_two;
        }
        final SubLObject rest_of_list = cddr(fractions);
        return fraction_times_internal(cons(product_of_first_two, rest_of_list));
    }

    public static final SubLObject fraction_times2_internal_alt(SubLObject fraction1, SubLObject fraction2) {
        {
            SubLObject product = new_fraction(multiply(fract_numerator(fraction1), fract_numerator(fraction2)), multiply(fract_denominator(fraction1), fract_denominator(fraction2)));
            return fraction_reduce(product);
        }
    }

    public static SubLObject fraction_times2_internal(final SubLObject fraction1, final SubLObject fraction2) {
        final SubLObject product = new_fraction(multiply(fract_numerator(fraction1), fract_numerator(fraction2)), multiply(fract_denominator(fraction1), fract_denominator(fraction2)));
        return fraction_reduce(product);
    }

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static final SubLObject fraction_divide_alt(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(value1, INTEGER_OR_FRACTION_P);
            SubLTrampolineFile.checkType(value2, INTEGER_OR_FRACTION_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL != fractionE(ZERO_INTEGER, value2)) {
                    Errors.error($str_alt22$Attempt_to_fraction_divide_by_zer);
                }
            }
            {
                SubLObject fraction1 = fractionify(value1);
                SubLObject reciprocal2 = reciprocal(value2);
                return fraction_times2_internal(fraction1, reciprocal2);
            }
        }
    }

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static SubLObject fraction_divide(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != number_or_fraction_p(value1) : "! fraction_utilities.number_or_fraction_p(value1) " + ("fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) ") + value1;
        assert NIL != number_or_fraction_p(value2) : "! fraction_utilities.number_or_fraction_p(value2) " + ("fraction_utilities.number_or_fraction_p(value2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value2) ") + value2;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != fractionE(ZERO_INTEGER, value2))) {
            Errors.error($str30$Attempt_to_fraction_divide_by_zer);
        }
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject reciprocal2 = reciprocal(value2);
        return fraction_times2_internal(fraction1, reciprocal2);
    }

    /**
     *
     *
     * @param VALUES;
     * 		listp of integer-or-fraction-p
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUES;\r\n\t\tlistp of integer-or-fraction-p\r\n@return fraction-p")
    public static final SubLObject fraction_add_alt(SubLObject values) {
        {
            SubLObject list_var = values;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, INTEGER_OR_FRACTION_P);
                }
            }
        }
        if (NIL == values) {
            return new_fraction(ZERO_INTEGER, ONE_INTEGER);
        } else {
            {
                SubLObject fractions = Mapping.mapcar(symbol_function(FRACTIONIFY), values);
                if (NIL != list_utilities.singletonP(fractions)) {
                    return fraction_reduce(fractions.first());
                } else {
                    return fraction_add_internal(fractions);
                }
            }
        }
    }

    /**
     *
     *
     * @param VALUES;
     * 		listp of integer-or-fraction-p
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUES;\r\n\t\tlistp of integer-or-fraction-p\r\n@return fraction-p")
    public static SubLObject fraction_add(final SubLObject values) {
        assert NIL != list_utilities.non_dotted_list_p(values) : "! list_utilities.non_dotted_list_p(values) " + ("list_utilities.non_dotted_list_p(values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(values) ") + values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != number_or_fraction_p(elem) : "! fraction_utilities.number_or_fraction_p(elem) " + ("fraction_utilities.number_or_fraction_p(elem) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(elem) ") + elem;
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

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static final SubLObject fraction_add2_alt(SubLObject value1, SubLObject value2) {
        SubLTrampolineFile.checkType(value1, INTEGER_OR_FRACTION_P);
        SubLTrampolineFile.checkType(value2, INTEGER_OR_FRACTION_P);
        {
            SubLObject fraction1 = fractionify(value1);
            SubLObject fraction2 = fractionify(value2);
            return fraction_add2_internal(fraction1, fraction2);
        }
    }

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return fraction-p")
    public static SubLObject fraction_add2(final SubLObject value1, final SubLObject value2) {
        assert NIL != number_or_fraction_p(value1) : "! fraction_utilities.number_or_fraction_p(value1) " + ("fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) ") + value1;
        assert NIL != number_or_fraction_p(value2) : "! fraction_utilities.number_or_fraction_p(value2) " + ("fraction_utilities.number_or_fraction_p(value2) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value2) ") + value2;
        final SubLObject fraction1 = fractionify(value1);
        final SubLObject fraction2 = fractionify(value2);
        return fraction_add2_internal(fraction1, fraction2);
    }

    public static final SubLObject fraction_add_internal_alt(SubLObject fractions) {
        {
            SubLObject sum_of_first_two = fraction_add2_internal(fractions.first(), second(fractions));
            if (NIL != list_utilities.doubletonP(fractions)) {
                return sum_of_first_two;
            } else {
                return fraction_add_internal(cons(sum_of_first_two, cddr(fractions)));
            }
        }
    }

    public static SubLObject fraction_add_internal(final SubLObject fractions) {
        final SubLObject sum_of_first_two = fraction_add2_internal(fractions.first(), second(fractions));
        if (NIL != list_utilities.doubletonP(fractions)) {
            return sum_of_first_two;
        }
        return fraction_add_internal(cons(sum_of_first_two, cddr(fractions)));
    }

    public static final SubLObject fraction_add2_internal_alt(SubLObject fraction1, SubLObject fraction2) {
        {
            SubLObject numerator1 = fract_numerator(fraction1);
            SubLObject numerator2 = fract_numerator(fraction2);
            SubLObject denominator1 = fract_denominator(fraction1);
            SubLObject denominator2 = fract_denominator(fraction2);
            SubLObject denominator_sum = number_utilities.lcm2(denominator1, denominator2);
            SubLObject factor1 = divide(denominator_sum, denominator1);
            SubLObject factor2 = divide(denominator_sum, denominator2);
            SubLObject new_numerator1 = multiply(factor1, numerator1);
            SubLObject new_numerator2 = multiply(factor2, numerator2);
            SubLObject numerator_sum = add(new_numerator1, new_numerator2);
            return fraction_reduce(new_fraction(numerator_sum, denominator_sum));
        }
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

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return integer-or-fraction-p; Given 1 arg, returns the negation of VALUE1 with the same type
    Given 2 args, returns the difference as a fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return integer-or-fraction-p; Given 1 arg, returns the negation of VALUE1 with the same type\r\nGiven 2 args, returns the difference as a fraction-p")
    public static final SubLObject fraction_minus_alt(SubLObject value1, SubLObject value2) {
        if (value2 == UNPROVIDED) {
            value2 = NIL;
        }
        SubLTrampolineFile.checkType(value1, INTEGER_OR_FRACTION_P);
        if (NIL != value2) {
            return fraction_add2_internal(fractionify(value1), fraction_minus(value2, UNPROVIDED));
        } else {
            return new_fraction(minus(numerator(value1)), denominator(value1));
        }
    }

    /**
     *
     *
     * @param VALUE1;
    integer-or-fraction-p
     * 		
     * @param VALUE2;
    integer-or-fraction-p
     * 		
     * @return integer-or-fraction-p; Given 1 arg, returns the negation of VALUE1 with the same type
    Given 2 args, returns the difference as a fraction-p
     */
    @LispMethod(comment = "@param VALUE1;\ninteger-or-fraction-p\r\n\t\t\r\n@param VALUE2;\ninteger-or-fraction-p\r\n\t\t\r\n@return integer-or-fraction-p; Given 1 arg, returns the negation of VALUE1 with the same type\r\nGiven 2 args, returns the difference as a fraction-p")
    public static SubLObject fraction_minus(final SubLObject value1, SubLObject value2) {
        if (value2 == UNPROVIDED) {
            value2 = NIL;
        }
        assert NIL != number_or_fraction_p(value1) : "! fraction_utilities.number_or_fraction_p(value1) " + ("fraction_utilities.number_or_fraction_p(value1) " + "CommonSymbols.NIL != fraction_utilities.number_or_fraction_p(value1) ") + value1;
        if (NIL != value2) {
            return fraction_add2_internal(fractionify(value1), fraction_minus(value2, UNPROVIDED));
        }
        return new_fraction(minus(numerator(value1)), denominator(value1));
    }

    public static SubLObject fraction_abs(final SubLObject fraction) {
        assert NIL != fraction_p(fraction) : "! fraction_utilities.fraction_p(fraction) " + ("fraction_utilities.fraction_p(fraction) " + "CommonSymbols.NIL != fraction_utilities.fraction_p(fraction) ") + fraction;
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

    /**
     *
     *
     * @param VALUES;
     * 		listp of integer-or-fraction-p
     * @return listp of integerp; the normalized version of VALUES, i.e. the list of minimal integers
    s.t. the ratio of any two elements is the same as the ratio
    of the corresponding elements of VALUES
    This is intended to be used, for example, to normalize a fractional linear equation;
    e.g. In the following example, VALUES would be (3/4 1/8 1)
    and the method would return (6 1 8):
    3/4x + 1/8y = 1z -> 6x + 1y = 8z
     */
    @LispMethod(comment = "@param VALUES;\r\n\t\tlistp of integer-or-fraction-p\r\n@return listp of integerp; the normalized version of VALUES, i.e. the list of minimal integers\r\ns.t. the ratio of any two elements is the same as the ratio\r\nof the corresponding elements of VALUES\r\nThis is intended to be used, for example, to normalize a fractional linear equation;\r\ne.g. In the following example, VALUES would be (3/4 1/8 1)\r\nand the method would return (6 1 8):\r\n3/4x + 1/8y = 1z -> 6x + 1y = 8z")
    public static final SubLObject normalize_fractional_phrase_alt(SubLObject values) {
        {
            SubLObject list_var = values;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, INTEGER_OR_FRACTION_P);
                }
            }
        }
        {
            SubLObject denominators = Mapping.mapcar(symbol_function(DENOMINATOR), Mapping.mapcar(symbol_function(FRACTION_REDUCE), values));
            SubLObject factor = number_utilities.lcm(denominators);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = values;
            SubLObject value = NIL;
            for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                {
                    SubLObject product = fraction_times2(value, factor);
                    result = cons(fraction_to_number(product), result);
                }
            }
            result = nreverse(result);
            return result;
        }
    }

    /**
     *
     *
     * @param VALUES;
     * 		listp of integer-or-fraction-p
     * @return listp of integerp; the normalized version of VALUES, i.e. the list of minimal integers
    s.t. the ratio of any two elements is the same as the ratio
    of the corresponding elements of VALUES
    This is intended to be used, for example, to normalize a fractional linear equation;
    e.g. In the following example, VALUES would be (3/4 1/8 1)
    and the method would return (6 1 8):
    3/4x + 1/8y = 1z -> 6x + 1y = 8z
     */
    @LispMethod(comment = "@param VALUES;\r\n\t\tlistp of integer-or-fraction-p\r\n@return listp of integerp; the normalized version of VALUES, i.e. the list of minimal integers\r\ns.t. the ratio of any two elements is the same as the ratio\r\nof the corresponding elements of VALUES\r\nThis is intended to be used, for example, to normalize a fractional linear equation;\r\ne.g. In the following example, VALUES would be (3/4 1/8 1)\r\nand the method would return (6 1 8):\r\n3/4x + 1/8y = 1z -> 6x + 1y = 8z")
    public static SubLObject normalize_fractional_phrase(final SubLObject values) {
        assert NIL != list_utilities.non_dotted_list_p(values) : "! list_utilities.non_dotted_list_p(values) " + ("list_utilities.non_dotted_list_p(values) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(values) ") + values;
        SubLObject cdolist_list_var = values;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != integer_or_fraction_p(elem) : "! fraction_utilities.integer_or_fraction_p(elem) " + ("fraction_utilities.integer_or_fraction_p(elem) " + "CommonSymbols.NIL != fraction_utilities.integer_or_fraction_p(elem) ") + elem;
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

    public static final SubLObject declare_fraction_utilities_file_alt() {
        declareFunction("fraction_print_function_trampoline", "FRACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fraction_p", "FRACTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.fraction_utilities.$fraction_p$UnaryFunction();
        declareFunction("fract_numerator", "FRACT-NUMERATOR", 1, 0, false);
        declareFunction("fract_denominator", "FRACT-DENOMINATOR", 1, 0, false);
        declareFunction("_csetf_fract_numerator", "_CSETF-FRACT-NUMERATOR", 2, 0, false);
        declareFunction("_csetf_fract_denominator", "_CSETF-FRACT-DENOMINATOR", 2, 0, false);
        declareFunction("make_fraction", "MAKE-FRACTION", 0, 1, false);
        declareFunction("print_fraction", "PRINT-FRACTION", 3, 0, false);
        declareFunction("new_fraction", "NEW-FRACTION", 1, 1, false);
        declareFunction("integer_or_fraction_p", "INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("number_or_fraction_p", "NUMBER-OR-FRACTION-P", 1, 0, false);
        declareFunction("list_of_fraction_p", "LIST-OF-FRACTION-P", 1, 0, false);
        declareFunction("list_of_integer_or_fraction_p", "LIST-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("list_of_number_or_fraction_p", "LIST-OF-NUMBER-OR-FRACTION-P", 1, 0, false);
        declareFunction("fraction_numerator", "FRACTION-NUMERATOR", 1, 0, false);
        declareFunction("fraction_denominator", "FRACTION-DENOMINATOR", 1, 0, false);
        declareFunction("numerator", "NUMERATOR", 1, 0, false);
        declareFunction("denominator", "DENOMINATOR", 1, 0, false);
        declareFunction("integer_to_fraction", "INTEGER-TO-FRACTION", 1, 0, false);
        declareFunction("fraction_to_number", "FRACTION-TO-NUMBER", 1, 0, false);
        declareFunction("fractionify", "FRACTIONIFY", 1, 0, false);
        declareFunction("defractionify", "DEFRACTIONIFY", 1, 0, false);
        declareFunction("fraction_reduce", "FRACTION-REDUCE", 1, 0, false);
        declareFunction("reciprocal", "RECIPROCAL", 1, 0, false);
        declareFunction("reduced_reciprocal", "REDUCED-RECIPROCAL", 1, 0, false);
        declareFunction("reciprocal_internal", "RECIPROCAL-INTERNAL", 1, 0, false);
        declareFunction("fractionE", "FRACTION=", 2, 0, false);
        declareFunction("fraction_times", "FRACTION-TIMES", 1, 0, false);
        declareFunction("fraction_times2", "FRACTION-TIMES2", 2, 0, false);
        declareFunction("fraction_times_internal", "FRACTION-TIMES-INTERNAL", 1, 0, false);
        declareFunction("fraction_times2_internal", "FRACTION-TIMES2-INTERNAL", 2, 0, false);
        declareFunction("fraction_divide", "FRACTION-DIVIDE", 2, 0, false);
        declareFunction("fraction_add", "FRACTION-ADD", 1, 0, false);
        declareFunction("fraction_add2", "FRACTION-ADD2", 2, 0, false);
        declareFunction("fraction_add_internal", "FRACTION-ADD-INTERNAL", 1, 0, false);
        declareFunction("fraction_add2_internal", "FRACTION-ADD2-INTERNAL", 2, 0, false);
        declareFunction("fraction_minus", "FRACTION-MINUS", 1, 1, false);
        declareFunction("normalize_fractional_phrase", "NORMALIZE-FRACTIONAL-PHRASE", 1, 0, false);
        declareFunction("subloop_reserved_initialize_fraction_kitchen_sink_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-FRACTION-KITCHEN-SINK-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_fraction_kitchen_sink_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-FRACTION-KITCHEN-SINK-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("fraction_kitchen_sink_test_case_p", "FRACTION-KITCHEN-SINK-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_fraction_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("fraction_print_function_trampoline", "FRACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("fraction_p", "FRACTION-P", 1, 0, false);
            new fraction_utilities.$fraction_p$UnaryFunction();
            declareFunction("fract_numerator", "FRACT-NUMERATOR", 1, 0, false);
            declareFunction("fract_denominator", "FRACT-DENOMINATOR", 1, 0, false);
            declareFunction("_csetf_fract_numerator", "_CSETF-FRACT-NUMERATOR", 2, 0, false);
            declareFunction("_csetf_fract_denominator", "_CSETF-FRACT-DENOMINATOR", 2, 0, false);
            declareFunction("make_fraction", "MAKE-FRACTION", 0, 1, false);
            declareFunction("visit_defstruct_fraction", "VISIT-DEFSTRUCT-FRACTION", 2, 0, false);
            declareFunction("visit_defstruct_object_fraction_method", "VISIT-DEFSTRUCT-OBJECT-FRACTION-METHOD", 2, 0, false);
            declareFunction("print_fraction", "PRINT-FRACTION", 3, 0, false);
            declareFunction("new_fraction", "NEW-FRACTION", 1, 1, false);
            declareFunction("copy_fraction", "COPY-FRACTION", 1, 0, false);
            declareFunction("integer_or_fraction_p", "INTEGER-OR-FRACTION-P", 1, 0, false);
            declareFunction("number_or_fraction_p", "NUMBER-OR-FRACTION-P", 1, 0, false);
            declareFunction("list_of_fraction_p", "LIST-OF-FRACTION-P", 1, 0, false);
            declareFunction("list_of_integer_or_fraction_p", "LIST-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
            declareFunction("list_of_number_or_fraction_p", "LIST-OF-NUMBER-OR-FRACTION-P", 1, 0, false);
            declareFunction("fraction_zero_p", "FRACTION-ZERO-P", 1, 0, false);
            declareFunction("fraction_minus_p", "FRACTION-MINUS-P", 1, 0, false);
            declareFunction("fraction_plus_p", "FRACTION-PLUS-P", 1, 0, false);
            declareFunction("fraction_integer_p", "FRACTION-INTEGER-P", 1, 0, false);
            declareFunction("fraction_numerator", "FRACTION-NUMERATOR", 1, 0, false);
            declareFunction("fraction_denominator", "FRACTION-DENOMINATOR", 1, 0, false);
            declareFunction("numerator", "NUMERATOR", 1, 0, false);
            declareFunction("denominator", "DENOMINATOR", 1, 0, false);
            declareFunction("integer_to_fraction", "INTEGER-TO-FRACTION", 1, 0, false);
            declareFunction("float_to_fraction", "FLOAT-TO-FRACTION", 1, 0, false);
            declareFunction("fraction_to_number", "FRACTION-TO-NUMBER", 1, 0, false);
            declareFunction("number_to_fraction", "NUMBER-TO-FRACTION", 1, 0, false);
            declareFunction("fractionify", "FRACTIONIFY", 1, 0, false);
            declareFunction("defractionify", "DEFRACTIONIFY", 1, 0, false);
            declareFunction("fraction_reduce", "FRACTION-REDUCE", 1, 0, false);
            declareFunction("reciprocal", "RECIPROCAL", 1, 0, false);
            declareFunction("reduced_reciprocal", "REDUCED-RECIPROCAL", 1, 0, false);
            declareFunction("reciprocal_internal", "RECIPROCAL-INTERNAL", 1, 0, false);
            declareFunction("fractionE", "FRACTION=", 2, 0, false);
            declareFunction("fraction_times", "FRACTION-TIMES", 1, 0, false);
            declareFunction("fraction_times2", "FRACTION-TIMES2", 2, 0, false);
            declareFunction("fraction_times_internal", "FRACTION-TIMES-INTERNAL", 1, 0, false);
            declareFunction("fraction_times2_internal", "FRACTION-TIMES2-INTERNAL", 2, 0, false);
            declareFunction("fraction_divide", "FRACTION-DIVIDE", 2, 0, false);
            declareFunction("fraction_add", "FRACTION-ADD", 1, 0, false);
            declareFunction("fraction_add2", "FRACTION-ADD2", 2, 0, false);
            declareFunction("fraction_add_internal", "FRACTION-ADD-INTERNAL", 1, 0, false);
            declareFunction("fraction_add2_internal", "FRACTION-ADD2-INTERNAL", 2, 0, false);
            declareFunction("fraction_minus", "FRACTION-MINUS", 1, 1, false);
            declareFunction("fraction_abs", "FRACTION-ABS", 1, 0, false);
            declareFunction("fraction_sqrt", "FRACTION-SQRT", 1, 0, false);
            declareFunction("fraction_log", "FRACTION-LOG", 1, 1, false);
            declareFunction("fraction_expt", "FRACTION-EXPT", 2, 0, false);
            declareFunction("fraction_exp", "FRACTION-EXP", 1, 0, false);
            declareFunction("normalize_fractional_phrase", "NORMALIZE-FRACTIONAL-PHRASE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_fraction_kitchen_sink_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-FRACTION-KITCHEN-SINK-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_fraction_kitchen_sink_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-FRACTION-KITCHEN-SINK-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("fraction_kitchen_sink_test_case_p", "FRACTION-KITCHEN-SINK-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_fraction_utilities_file_Previous() {
        declareFunction("fraction_print_function_trampoline", "FRACTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("fraction_p", "FRACTION-P", 1, 0, false);
        new fraction_utilities.$fraction_p$UnaryFunction();
        declareFunction("fract_numerator", "FRACT-NUMERATOR", 1, 0, false);
        declareFunction("fract_denominator", "FRACT-DENOMINATOR", 1, 0, false);
        declareFunction("_csetf_fract_numerator", "_CSETF-FRACT-NUMERATOR", 2, 0, false);
        declareFunction("_csetf_fract_denominator", "_CSETF-FRACT-DENOMINATOR", 2, 0, false);
        declareFunction("make_fraction", "MAKE-FRACTION", 0, 1, false);
        declareFunction("visit_defstruct_fraction", "VISIT-DEFSTRUCT-FRACTION", 2, 0, false);
        declareFunction("visit_defstruct_object_fraction_method", "VISIT-DEFSTRUCT-OBJECT-FRACTION-METHOD", 2, 0, false);
        declareFunction("print_fraction", "PRINT-FRACTION", 3, 0, false);
        declareFunction("new_fraction", "NEW-FRACTION", 1, 1, false);
        declareFunction("copy_fraction", "COPY-FRACTION", 1, 0, false);
        declareFunction("integer_or_fraction_p", "INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("number_or_fraction_p", "NUMBER-OR-FRACTION-P", 1, 0, false);
        declareFunction("list_of_fraction_p", "LIST-OF-FRACTION-P", 1, 0, false);
        declareFunction("list_of_integer_or_fraction_p", "LIST-OF-INTEGER-OR-FRACTION-P", 1, 0, false);
        declareFunction("list_of_number_or_fraction_p", "LIST-OF-NUMBER-OR-FRACTION-P", 1, 0, false);
        declareFunction("fraction_zero_p", "FRACTION-ZERO-P", 1, 0, false);
        declareFunction("fraction_minus_p", "FRACTION-MINUS-P", 1, 0, false);
        declareFunction("fraction_plus_p", "FRACTION-PLUS-P", 1, 0, false);
        declareFunction("fraction_integer_p", "FRACTION-INTEGER-P", 1, 0, false);
        declareFunction("fraction_numerator", "FRACTION-NUMERATOR", 1, 0, false);
        declareFunction("fraction_denominator", "FRACTION-DENOMINATOR", 1, 0, false);
        declareFunction("numerator", "NUMERATOR", 1, 0, false);
        declareFunction("denominator", "DENOMINATOR", 1, 0, false);
        declareFunction("integer_to_fraction", "INTEGER-TO-FRACTION", 1, 0, false);
        declareFunction("float_to_fraction", "FLOAT-TO-FRACTION", 1, 0, false);
        declareFunction("fraction_to_number", "FRACTION-TO-NUMBER", 1, 0, false);
        declareFunction("number_to_fraction", "NUMBER-TO-FRACTION", 1, 0, false);
        declareFunction("fractionify", "FRACTIONIFY", 1, 0, false);
        declareFunction("defractionify", "DEFRACTIONIFY", 1, 0, false);
        declareFunction("fraction_reduce", "FRACTION-REDUCE", 1, 0, false);
        declareFunction("reciprocal", "RECIPROCAL", 1, 0, false);
        declareFunction("reduced_reciprocal", "REDUCED-RECIPROCAL", 1, 0, false);
        declareFunction("reciprocal_internal", "RECIPROCAL-INTERNAL", 1, 0, false);
        declareFunction("fractionE", "FRACTION=", 2, 0, false);
        declareFunction("fraction_times", "FRACTION-TIMES", 1, 0, false);
        declareFunction("fraction_times2", "FRACTION-TIMES2", 2, 0, false);
        declareFunction("fraction_times_internal", "FRACTION-TIMES-INTERNAL", 1, 0, false);
        declareFunction("fraction_times2_internal", "FRACTION-TIMES2-INTERNAL", 2, 0, false);
        declareFunction("fraction_divide", "FRACTION-DIVIDE", 2, 0, false);
        declareFunction("fraction_add", "FRACTION-ADD", 1, 0, false);
        declareFunction("fraction_add2", "FRACTION-ADD2", 2, 0, false);
        declareFunction("fraction_add_internal", "FRACTION-ADD-INTERNAL", 1, 0, false);
        declareFunction("fraction_add2_internal", "FRACTION-ADD2-INTERNAL", 2, 0, false);
        declareFunction("fraction_minus", "FRACTION-MINUS", 1, 1, false);
        declareFunction("fraction_abs", "FRACTION-ABS", 1, 0, false);
        declareFunction("fraction_sqrt", "FRACTION-SQRT", 1, 0, false);
        declareFunction("fraction_log", "FRACTION-LOG", 1, 1, false);
        declareFunction("fraction_expt", "FRACTION-EXPT", 2, 0, false);
        declareFunction("fraction_exp", "FRACTION-EXP", 1, 0, false);
        declareFunction("normalize_fractional_phrase", "NORMALIZE-FRACTIONAL-PHRASE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("NUMERATOR"), makeSymbol("DENOMINATOR"));

    static private final SubLList $list_alt3 = list(makeKeyword("NUMERATOR"), makeKeyword("DENOMINATOR"));

    static private final SubLList $list_alt4 = list(makeSymbol("FRACT-NUMERATOR"), makeSymbol("FRACT-DENOMINATOR"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-FRACT-NUMERATOR"), makeSymbol("_CSETF-FRACT-DENOMINATOR"));

    public static SubLObject init_fraction_utilities_file() {
        defconstant("*DTP-FRACTION*", FRACTION);
        return NIL;
    }

    public static final SubLObject setup_fraction_utilities_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(FRACTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(FRACT_NUMERATOR, _CSETF_FRACT_NUMERATOR);
        def_csetf(FRACT_DENOMINATOR, _CSETF_FRACT_DENOMINATOR);
        identity(FRACTION);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FRACTION_KITCHEN_SINK_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(FRACTION_KITCHEN_SINK_TEST_CASE);
        classes.subloop_new_class(FRACTION_KITCHEN_SINK_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt27);
        classes.class_set_implements_slot_listeners(FRACTION_KITCHEN_SINK_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(FRACTION_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_FRACTION_KITCHEN_SINK_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(FRACTION_KITCHEN_SINK_TEST_CASE, $sym41$SUBLOOP_RESERVED_INITIALIZE_FRACTION_KITCHEN_SINK_TEST_CASE_INSTA);
        subloop_reserved_initialize_fraction_kitchen_sink_test_case_class(FRACTION_KITCHEN_SINK_TEST_CASE);
        sunit_macros.define_test_case_postamble(FRACTION_KITCHEN_SINK_TEST_CASE, $str_alt42$fraction_utilities, $$$cycl, NIL);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NEW_FRACTION_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, INTEGER_OR_FRACTION_P_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NUMBER_OR_FRACTION_P_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, LIST_OF_FRACTION_P_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, LIST_OF_INTEGER_OR_FRACTION_P_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, LIST_OF_NUMBER_OR_FRACTION_P_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NUMERATOR_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, DENOMINATOR_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, $sym52$FRACTION__TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, INTEGER_TO_FRACTION_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_TO_NUMBER_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTIONIFY_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, DEFRACTIONIFY_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_REDUCE_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, RECIPROCAL_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, REDUCED_RECIPROCAL_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_TIMES_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_TIMES2_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_DIVIDE_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_ADD_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_ADD2_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_MINUS_1ARG_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_MINUS_2ARGS_TEST);
        sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NORMALIZE_FRACTIONAL_PHRASE_TEST);
        return NIL;
    }

    public static SubLObject setup_fraction_utilities_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(FRACTION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(FRACT_NUMERATOR, _CSETF_FRACT_NUMERATOR);
            def_csetf(FRACT_DENOMINATOR, _CSETF_FRACT_DENOMINATOR);
            identity(FRACTION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD));
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(FRACTION_KITCHEN_SINK_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(FRACTION_KITCHEN_SINK_TEST_CASE);
            classes.subloop_new_class(FRACTION_KITCHEN_SINK_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt27);
            classes.class_set_implements_slot_listeners(FRACTION_KITCHEN_SINK_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(FRACTION_KITCHEN_SINK_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_FRACTION_KITCHEN_SINK_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(FRACTION_KITCHEN_SINK_TEST_CASE, $sym41$SUBLOOP_RESERVED_INITIALIZE_FRACTION_KITCHEN_SINK_TEST_CASE_INSTA);
            subloop_reserved_initialize_fraction_kitchen_sink_test_case_class(FRACTION_KITCHEN_SINK_TEST_CASE);
            sunit_macros.define_test_case_postamble(FRACTION_KITCHEN_SINK_TEST_CASE, $str_alt42$fraction_utilities, $$$cycl, NIL);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NEW_FRACTION_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, INTEGER_OR_FRACTION_P_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NUMBER_OR_FRACTION_P_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, LIST_OF_FRACTION_P_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, LIST_OF_INTEGER_OR_FRACTION_P_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, LIST_OF_NUMBER_OR_FRACTION_P_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NUMERATOR_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, DENOMINATOR_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, $sym52$FRACTION__TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, INTEGER_TO_FRACTION_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_TO_NUMBER_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTIONIFY_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, DEFRACTIONIFY_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_REDUCE_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, RECIPROCAL_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, REDUCED_RECIPROCAL_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_TIMES_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_TIMES2_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_DIVIDE_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_ADD_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_ADD2_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_MINUS_1ARG_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, FRACTION_MINUS_2ARGS_TEST);
            sunit_macros.def_test_method_register(FRACTION_KITCHEN_SINK_TEST_CASE, NORMALIZE_FRACTIONAL_PHRASE_TEST);
        }
        return NIL;
    }

    public static SubLObject setup_fraction_utilities_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(FRACTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FRACT_NUMERATOR, _CSETF_FRACT_NUMERATOR);
        def_csetf(FRACT_DENOMINATOR, _CSETF_FRACT_DENOMINATOR);
        identity(FRACTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_fraction$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FRACTION_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt15$_A__A = makeString("~A/~A");

    private static final SubLSymbol NON_ZERO_INTEGER_P = makeSymbol("NON-ZERO-INTEGER-P");

    static private final SubLString $str_alt22$Attempt_to_fraction_divide_by_zer = makeString("Attempt to fraction-divide by zero");

    @Override
    public void declareFunctions() {
        declare_fraction_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_fraction_utilities_file();
    }

    private static final SubLSymbol FRACTION_KITCHEN_SINK_TEST_CASE = makeSymbol("FRACTION-KITCHEN-SINK-TEST-CASE");

    @Override
    public void runTopLevelForms() {
        setup_fraction_utilities_file();
    }

    static private final SubLList $list_alt27 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-FRACTION-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTEGER-OR-FRACTION-P-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMBER-OR-FRACTION-P-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LIST-OF-FRACTION-P-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LIST-OF-INTEGER-OR-FRACTION-P-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LIST-OF-NUMBER-OR-FRACTION-P-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NUMERATOR-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DENOMINATOR-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION=-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTEGER-TO-FRACTION-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-TO-NUMBER-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTIONIFY-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEFRACTIONIFY-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-REDUCE-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECIPROCAL-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REDUCED-RECIPROCAL-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-TIMES-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-TIMES2-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-DIVIDE-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-ADD-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-ADD2-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-MINUS-1ARG-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRACTION-MINUS-2ARGS-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NORMALIZE-FRACTIONAL-PHRASE-TEST"), NIL, makeKeyword("PROTECTED")) });

    static {
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

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FRACTION_KITCHEN_SINK_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FRACTION-KITCHEN-SINK-TEST-CASE-CLASS");

    static private final SubLSymbol $sym41$SUBLOOP_RESERVED_INITIALIZE_FRACTION_KITCHEN_SINK_TEST_CASE_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FRACTION-KITCHEN-SINK-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt42$fraction_utilities = makeString("fraction-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol NEW_FRACTION_TEST = makeSymbol("NEW-FRACTION-TEST");

    private static final SubLSymbol INTEGER_OR_FRACTION_P_TEST = makeSymbol("INTEGER-OR-FRACTION-P-TEST");

    private static final SubLSymbol NUMBER_OR_FRACTION_P_TEST = makeSymbol("NUMBER-OR-FRACTION-P-TEST");

    private static final SubLSymbol LIST_OF_FRACTION_P_TEST = makeSymbol("LIST-OF-FRACTION-P-TEST");

    private static final SubLSymbol LIST_OF_INTEGER_OR_FRACTION_P_TEST = makeSymbol("LIST-OF-INTEGER-OR-FRACTION-P-TEST");

    private static final SubLSymbol LIST_OF_NUMBER_OR_FRACTION_P_TEST = makeSymbol("LIST-OF-NUMBER-OR-FRACTION-P-TEST");

    private static final SubLSymbol NUMERATOR_TEST = makeSymbol("NUMERATOR-TEST");

    private static final SubLSymbol DENOMINATOR_TEST = makeSymbol("DENOMINATOR-TEST");

    static private final SubLSymbol $sym52$FRACTION__TEST = makeSymbol("FRACTION=-TEST");

    private static final SubLSymbol INTEGER_TO_FRACTION_TEST = makeSymbol("INTEGER-TO-FRACTION-TEST");

    private static final SubLSymbol FRACTION_TO_NUMBER_TEST = makeSymbol("FRACTION-TO-NUMBER-TEST");

    private static final SubLSymbol FRACTIONIFY_TEST = makeSymbol("FRACTIONIFY-TEST");

    private static final SubLSymbol DEFRACTIONIFY_TEST = makeSymbol("DEFRACTIONIFY-TEST");

    private static final SubLSymbol FRACTION_REDUCE_TEST = makeSymbol("FRACTION-REDUCE-TEST");

    private static final SubLSymbol RECIPROCAL_TEST = makeSymbol("RECIPROCAL-TEST");

    private static final SubLSymbol REDUCED_RECIPROCAL_TEST = makeSymbol("REDUCED-RECIPROCAL-TEST");

    private static final SubLSymbol FRACTION_TIMES_TEST = makeSymbol("FRACTION-TIMES-TEST");

    private static final SubLSymbol FRACTION_TIMES2_TEST = makeSymbol("FRACTION-TIMES2-TEST");

    private static final SubLSymbol FRACTION_DIVIDE_TEST = makeSymbol("FRACTION-DIVIDE-TEST");

    private static final SubLSymbol FRACTION_ADD_TEST = makeSymbol("FRACTION-ADD-TEST");

    private static final SubLSymbol FRACTION_ADD2_TEST = makeSymbol("FRACTION-ADD2-TEST");

    private static final SubLSymbol FRACTION_MINUS_1ARG_TEST = makeSymbol("FRACTION-MINUS-1ARG-TEST");

    private static final SubLSymbol FRACTION_MINUS_2ARGS_TEST = makeSymbol("FRACTION-MINUS-2ARGS-TEST");

    private static final SubLSymbol NORMALIZE_FRACTIONAL_PHRASE_TEST = makeSymbol("NORMALIZE-FRACTIONAL-PHRASE-TEST");
}

/**
 * Total time: 193 ms
 */
