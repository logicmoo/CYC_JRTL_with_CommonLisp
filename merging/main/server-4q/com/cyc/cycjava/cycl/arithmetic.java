/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ARITHMETIC
 * source file: /cyc/top/cycl/arithmetic.lisp
 * created:     2019/07/03 17:37:52
 */
public final class arithmetic extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new arithmetic();

 public static final String myName = "com.cyc.cycjava.cycl.arithmetic";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CYC_PLUS_INTERNAL = makeSymbol("CYC-PLUS-INTERNAL");

    private static final SubLSymbol CYC_PLUS = makeSymbol("CYC-PLUS");

    private static final SubLSymbol CYC_DIFFERENCE = makeSymbol("CYC-DIFFERENCE");

    private static final SubLSymbol CYC_MINUS = makeSymbol("CYC-MINUS");

    private static final SubLSymbol CYC_TIMES_INTERNAL = makeSymbol("CYC-TIMES-INTERNAL");

    private static final SubLSymbol CYC_TIMES = makeSymbol("CYC-TIMES");

    private static final SubLSymbol CYC_GREATER_THAN = makeSymbol("CYC-GREATER-THAN");

    private static final SubLSymbol CYC_LESS_THAN = makeSymbol("CYC-LESS-THAN");

    private static final SubLSymbol CYC_GREATER_THAN_OR_EQUAL_TO = makeSymbol("CYC-GREATER-THAN-OR-EQUAL-TO");

    private static final SubLSymbol CYC_LESS_THAN_OR_EQUAL_TO = makeSymbol("CYC-LESS-THAN-OR-EQUAL-TO");

    private static final SubLSymbol CYC_NUMERICALLY_EQUAL = makeSymbol("CYC-NUMERICALLY-EQUAL");

    private static final SubLSymbol POSSIBLY_SANITIZE_FLOAT_MEMOIZED = makeSymbol("POSSIBLY-SANITIZE-FLOAT-MEMOIZED");

    private static final SubLSymbol POSSIBLY_SANITIZE_FLOAT = makeSymbol("POSSIBLY-SANITIZE-FLOAT");

    private static final SubLList $list20 = list(list(list(makeDouble(0.7999999999999999)), makeDouble(0.8)), list(list(makeDouble(0.8000000000000002)), makeDouble(0.8)), list(list(makeDouble(0.799999999999999)), makeDouble(0.799999999999999)), list(list(makeDouble(3.141592653589793)), makeDouble(3.141592653589793)));

    // Definitions
    /**
     * evaluationDefn for #$PlusFn
     */
    @LispMethod(comment = "evaluationDefn for #$PlusFn")
    public static final SubLObject cyc_plus_alt(SubLObject args) {
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
        } else {
            if (NIL != list_utilities.singletonP(args)) {
                return args.first();
            } else {
                return com.cyc.cycjava.cycl.arithmetic.quantity_reduce(CYC_PLUS_INTERNAL, NIL, args);
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * evaluationDefn for #$PlusFn
     */
    @LispMethod(comment = "evaluationDefn for #$PlusFn")
    public static SubLObject cyc_plus(final SubLObject args) {
        if (NIL == args) {
            relation_evaluation.throw_unevaluatable();
            return NIL;
        }
        if (NIL != list_utilities.singletonP(args)) {
            return args.first();
        }
        return quantity_reduce(CYC_PLUS_INTERNAL, NIL, args);
    }

    public static final SubLObject cyc_plus_internal_alt(SubLObject interval1, SubLObject interval2) {
        if (interval1.isNumber() && interval2.isNumber()) {
            return com.cyc.cycjava.cycl.arithmetic.arithmetic_answer(add(interval1, interval2));
        }
        return quantities.cyc_plus_quantities(interval1, interval2);
    }

    public static SubLObject cyc_plus_internal(final SubLObject interval1, final SubLObject interval2) {
        if (interval1.isNumber() && interval2.isNumber()) {
            return arithmetic_answer(add(interval1, interval2));
        }
        return quantities.cyc_plus_quantities(interval1, interval2);
    }

    /**
     * evaluationDefn for #$DifferenceFn
     */
    @LispMethod(comment = "evaluationDefn for #$DifferenceFn")
    public static final SubLObject cyc_difference_alt(SubLObject interval1, SubLObject interval2) {
        return com.cyc.cycjava.cycl.arithmetic.cyc_plus_internal(interval1, com.cyc.cycjava.cycl.arithmetic.cyc_minus(interval2));
    }

    /**
     * evaluationDefn for #$DifferenceFn
     */
    @LispMethod(comment = "evaluationDefn for #$DifferenceFn")
    public static SubLObject cyc_difference(final SubLObject interval1, final SubLObject interval2) {
        return cyc_plus_internal(interval1, cyc_minus(interval2));
    }

    /**
     * evaluationDefn for #$MinusFn
     */
    @LispMethod(comment = "evaluationDefn for #$MinusFn")
    public static final SubLObject cyc_minus_alt(SubLObject interval) {
        if (interval.isNumber()) {
            return com.cyc.cycjava.cycl.arithmetic.arithmetic_answer(minus(interval));
        }
        return quantities.cyc_minus_quantities(interval);
    }

    /**
     * evaluationDefn for #$MinusFn
     */
    @LispMethod(comment = "evaluationDefn for #$MinusFn")
    public static SubLObject cyc_minus(final SubLObject interval) {
        if (interval.isNumber()) {
            return arithmetic_answer(minus(interval));
        }
        if (NIL != collection_defns.fractionP(interval, UNPROVIDED)) {
            return quantities.negate_fraction(interval);
        }
        return quantities.cyc_minus_quantities(interval);
    }

    /**
     * evaluationDefn for #$TimesFn
     */
    @LispMethod(comment = "evaluationDefn for #$TimesFn")
    public static final SubLObject cyc_times_alt(SubLObject args) {
        return com.cyc.cycjava.cycl.arithmetic.quantity_reduce(CYC_TIMES_INTERNAL, ONE_INTEGER, args);
    }

    /**
     * evaluationDefn for #$TimesFn
     */
    @LispMethod(comment = "evaluationDefn for #$TimesFn")
    public static SubLObject cyc_times(final SubLObject args) {
        return quantity_reduce(CYC_TIMES_INTERNAL, ONE_INTEGER, args);
    }

    public static final SubLObject cyc_times_internal_alt(SubLObject interval1, SubLObject interval2) {
        if (ZERO_INTEGER.eql(interval1)) {
            return ZERO_INTEGER;
        } else {
            if (ZERO_INTEGER.eql(interval2)) {
                return ZERO_INTEGER;
            } else {
                if (ONE_INTEGER.eql(interval1)) {
                    return interval2;
                } else {
                    if (ONE_INTEGER.eql(interval2)) {
                        return interval1;
                    } else {
                        if (interval1.isNumber() && interval2.isNumber()) {
                            return com.cyc.cycjava.cycl.arithmetic.arithmetic_answer(multiply(interval1, interval2));
                        }
                    }
                }
            }
        }
        return quantities.cyc_times_quantities(interval1, interval2);
    }

    public static SubLObject cyc_times_internal(final SubLObject interval1, final SubLObject interval2) {
        if (ZERO_INTEGER.eql(interval1)) {
            if ((NIL != extended_numbers.cyc_infinite_number_p(interval2)) || (NIL != extended_numbers.cyc_infinite_range_p(interval2))) {
                return relation_evaluation.throw_unevaluatable();
            }
            return ZERO_INTEGER;
        } else
            if (ZERO_INTEGER.eql(interval2)) {
                if ((NIL != extended_numbers.cyc_infinite_number_p(interval1)) || (NIL != extended_numbers.cyc_infinite_range_p(interval1))) {
                    return relation_evaluation.throw_unevaluatable();
                }
                return ZERO_INTEGER;
            } else {
                if (ONE_INTEGER.eql(interval1)) {
                    return interval2;
                }
                if (ONE_INTEGER.eql(interval2)) {
                    return interval1;
                }
                if (interval1.isNumber() && interval2.isNumber()) {
                    return arithmetic_answer(multiply(interval1, interval2));
                }
                return quantities.cyc_times_quantities(interval1, interval2);
            }

    }

    /**
     * evaluationDefn for #$greaterThan
     */
    @LispMethod(comment = "evaluationDefn for #$greaterThan")
    public static final SubLObject cyc_greater_than_alt(SubLObject interval1, SubLObject interval2) {
        return com.cyc.cycjava.cycl.arithmetic.cyc_less_than(interval2, interval1);
    }

    /**
     * evaluationDefn for #$greaterThan
     */
    @LispMethod(comment = "evaluationDefn for #$greaterThan")
    public static SubLObject cyc_greater_than(final SubLObject interval1, final SubLObject interval2) {
        return cyc_less_than(interval2, interval1);
    }

    /**
     * evaluationDefn for #$lessThan
     */
    @LispMethod(comment = "evaluationDefn for #$lessThan")
    public static final SubLObject cyc_less_than_alt(SubLObject interval1, SubLObject interval2) {
        if (interval1.isNumber() && interval2.isNumber()) {
            return numL(interval1, interval2);
        }
        return quantities.cyc_less_than_quantities(interval1, interval2);
    }

    /**
     * evaluationDefn for #$lessThan
     */
    @LispMethod(comment = "evaluationDefn for #$lessThan")
    public static SubLObject cyc_less_than(SubLObject interval1, SubLObject interval2) {
        interval1 = possibly_sanitize_float(interval1);
        interval2 = possibly_sanitize_float(interval2);
        if (interval1.isNumber() && interval2.isNumber()) {
            return numL(interval1, interval2);
        }
        return quantities.cyc_less_than_quantities(interval1, interval2);
    }

    /**
     * evaluationDefn for #$greaterThanOrEqualTo
     */
    @LispMethod(comment = "evaluationDefn for #$greaterThanOrEqualTo")
    public static final SubLObject cyc_greater_than_or_equal_to_alt(SubLObject interval1, SubLObject interval2) {
        return com.cyc.cycjava.cycl.arithmetic.cyc_less_than_or_equal_to(interval2, interval1);
    }

    /**
     * evaluationDefn for #$greaterThanOrEqualTo
     */
    @LispMethod(comment = "evaluationDefn for #$greaterThanOrEqualTo")
    public static SubLObject cyc_greater_than_or_equal_to(final SubLObject interval1, final SubLObject interval2) {
        return cyc_less_than_or_equal_to(interval2, interval1);
    }

    /**
     * evaluationDefn for #$lessThanOrEqualTo
     */
    @LispMethod(comment = "evaluationDefn for #$lessThanOrEqualTo")
    public static final SubLObject cyc_less_than_or_equal_to_alt(SubLObject interval1, SubLObject interval2) {
        if (interval1.isNumber() && interval2.isNumber()) {
            return numLE(interval1, interval2);
        }
        return quantities.cyc_less_than_or_equal_to_quantities(interval1, interval2);
    }

    /**
     * evaluationDefn for #$lessThanOrEqualTo
     */
    @LispMethod(comment = "evaluationDefn for #$lessThanOrEqualTo")
    public static SubLObject cyc_less_than_or_equal_to(SubLObject interval1, SubLObject interval2) {
        interval1 = possibly_sanitize_float(interval1);
        interval2 = possibly_sanitize_float(interval2);
        if (interval1.isNumber() && interval2.isNumber()) {
            return numLE(interval1, interval2);
        }
        return quantities.cyc_less_than_or_equal_to_quantities(interval1, interval2);
    }

    /**
     * evaluationDefn for #$numericallyEqual
     */
    @LispMethod(comment = "evaluationDefn for #$numericallyEqual")
    public static final SubLObject cyc_numerically_equal_alt(SubLObject interval1, SubLObject interval2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.arithmetic.cyc_less_than_or_equal_to(interval1, interval2)) && (NIL != com.cyc.cycjava.cycl.arithmetic.cyc_greater_than_or_equal_to(interval1, interval2)));
    }

    /**
     * evaluationDefn for #$numericallyEqual
     */
    @LispMethod(comment = "evaluationDefn for #$numericallyEqual")
    public static SubLObject cyc_numerically_equal(SubLObject interval1, SubLObject interval2) {
        interval1 = possibly_sanitize_float(interval1);
        interval2 = possibly_sanitize_float(interval2);
        if (interval1.isNumber() && interval2.isNumber()) {
            return makeBoolean(interval1.numLE(interval2) && interval2.numLE(interval1));
        }
        return makeBoolean((NIL == quantities.cyc_less_than_quantities(interval1, interval2)) && (NIL == quantities.cyc_less_than_quantities(interval2, interval1)));
    }

    public static final SubLObject quantity_reduce_alt(SubLObject lisp_defun, SubLObject identity_constant, SubLObject args) {
        {
            SubLObject num_items = length(args);
            if (num_items.numE(ZERO_INTEGER)) {
                if (NIL != identity_constant) {
                    return identity_constant;
                } else {
                    relation_evaluation.throw_unevaluatable();
                }
            } else {
                if (num_items.numE(ONE_INTEGER)) {
                    if (NIL != identity_constant) {
                        return funcall(lisp_defun, identity_constant, args.first());
                    } else {
                        return args.first();
                    }
                } else {
                    {
                        SubLObject result = args.first();
                        SubLObject items = NIL;
                        SubLObject sofar = NIL;
                        SubLObject item = NIL;
                        for (items = args.rest(), sofar = result, item = items.first(); NIL != items; items = items.rest() , sofar = result , item = items.first()) {
                            result = funcall(lisp_defun, sofar, item);
                        }
                        return result;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject quantity_reduce(final SubLObject lisp_defun, final SubLObject identity_constant, final SubLObject args) {
        final SubLObject num_items = length(args);
        if (num_items.numE(ZERO_INTEGER)) {
            if (NIL != identity_constant) {
                return identity_constant;
            }
            relation_evaluation.throw_unevaluatable();
            return NIL;
        } else {
            if (!num_items.numE(ONE_INTEGER)) {
                SubLObject result = args.first();
                SubLObject items = NIL;
                SubLObject sofar = NIL;
                SubLObject item = NIL;
                items = args.rest();
                sofar = result;
                item = items.first();
                while (NIL != items) {
                    result = funcall(lisp_defun, sofar, item);
                    items = items.rest();
                    sofar = result;
                    item = items.first();
                } 
                return result;
            }
            if (NIL != identity_constant) {
                return funcall(lisp_defun, identity_constant, args.first());
            }
            return args.first();
        }
    }

    public static final SubLObject arithmetic_answer_alt(SubLObject ans) {
        return ans;
    }

    public static SubLObject arithmetic_answer(final SubLObject ans) {
        return possibly_sanitize_float(ans);
    }

    public static SubLObject possibly_sanitize_float(final SubLObject possible_float) {
        if (possible_float.isDouble()) {
            return possibly_sanitize_float_memoized(possible_float);
        }
        return possible_float;
    }

    public static SubLObject possibly_sanitize_float_memoized_internal(final SubLObject possible_float) {
        if (possible_float.isDouble()) {
            final SubLObject v_15_digits = number_utilities.significant_digits(possible_float, FIFTEEN_INTEGER);
            if (!possible_float.numE(v_15_digits)) {
                final SubLObject v_10_digits = number_utilities.significant_digits(possible_float, TEN_INTEGER);
                if (v_10_digits.numE(v_15_digits)) {
                    return v_15_digits;
                }
            }
        }
        return possible_float;
    }

    public static SubLObject possibly_sanitize_float_memoized(final SubLObject possible_float) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return possibly_sanitize_float_memoized_internal(possible_float);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, POSSIBLY_SANITIZE_FLOAT_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), POSSIBLY_SANITIZE_FLOAT_MEMOIZED, ONE_INTEGER, $int$4096, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, POSSIBLY_SANITIZE_FLOAT_MEMOIZED, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, possible_float, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(possibly_sanitize_float_memoized_internal(possible_float)));
            memoization_state.caching_state_put(caching_state, possible_float, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_arithmetic_file() {
        declareFunction("cyc_plus", "CYC-PLUS", 1, 0, false);
        declareFunction("cyc_plus_internal", "CYC-PLUS-INTERNAL", 2, 0, false);
        declareFunction("cyc_difference", "CYC-DIFFERENCE", 2, 0, false);
        declareFunction("cyc_minus", "CYC-MINUS", 1, 0, false);
        declareFunction("cyc_times", "CYC-TIMES", 1, 0, false);
        declareFunction("cyc_times_internal", "CYC-TIMES-INTERNAL", 2, 0, false);
        declareFunction("cyc_greater_than", "CYC-GREATER-THAN", 2, 0, false);
        declareFunction("cyc_less_than", "CYC-LESS-THAN", 2, 0, false);
        declareFunction("cyc_greater_than_or_equal_to", "CYC-GREATER-THAN-OR-EQUAL-TO", 2, 0, false);
        declareFunction("cyc_less_than_or_equal_to", "CYC-LESS-THAN-OR-EQUAL-TO", 2, 0, false);
        declareFunction("cyc_numerically_equal", "CYC-NUMERICALLY-EQUAL", 2, 0, false);
        declareFunction("quantity_reduce", "QUANTITY-REDUCE", 3, 0, false);
        declareFunction("arithmetic_answer", "ARITHMETIC-ANSWER", 1, 0, false);
        declareFunction("possibly_sanitize_float", "POSSIBLY-SANITIZE-FLOAT", 1, 0, false);
        declareFunction("possibly_sanitize_float_memoized_internal", "POSSIBLY-SANITIZE-FLOAT-MEMOIZED-INTERNAL", 1, 0, false);
        declareFunction("possibly_sanitize_float_memoized", "POSSIBLY-SANITIZE-FLOAT-MEMOIZED", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_arithmetic_file() {
        return NIL;
    }

    public static SubLObject setup_arithmetic_file() {
        register_kb_function(CYC_PLUS);
        register_kb_function(CYC_DIFFERENCE);
        register_kb_function(CYC_MINUS);
        register_kb_function(CYC_TIMES);
        register_kb_function(CYC_GREATER_THAN);
        register_kb_function(CYC_LESS_THAN);
        register_kb_function(CYC_GREATER_THAN_OR_EQUAL_TO);
        register_kb_function(CYC_LESS_THAN_OR_EQUAL_TO);
        register_kb_function(CYC_NUMERICALLY_EQUAL);
        memoization_state.note_memoized_function(POSSIBLY_SANITIZE_FLOAT_MEMOIZED);
        define_test_case_table_int(POSSIBLY_SANITIZE_FLOAT, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list20);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_arithmetic_file();
    }

    @Override
    public void initializeVariables() {
        init_arithmetic_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_arithmetic_file();
    }

    
}

/**
 * Total time: 145 ms
 */
