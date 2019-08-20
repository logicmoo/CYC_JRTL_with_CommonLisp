/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class el_math_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new el_math_utilities();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");















    // Definitions
    /**
     *
     *
     * @return boolean; t iff it is TERM has a minimum of a specific format;
    i.e. if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).
     */
    @LispMethod(comment = "@return boolean; t iff it is TERM has a minimum of a specific format;\r\ni.e. if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).")
    public static final SubLObject el_minP_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.el_math_utilities.interval_minP(v_term)) || (NIL != com.cyc.cycjava.cycl.el_math_utilities.plus_infinity_unityP(v_term)));
    }

    // Definitions
    /**
     *
     *
     * @return boolean; t iff it is TERM has a minimum of a specific format;
    i.e. if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).
     */
    @LispMethod(comment = "@return boolean; t iff it is TERM has a minimum of a specific format;\r\ni.e. if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).")
    public static SubLObject el_minP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != interval_minP(v_term)) || (NIL != plus_infinity_unityP(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMinFn.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMinFn.")
    public static final SubLObject interval_minP_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && ($$IntervalMinFn == cycl_utilities.formula_arg0(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMinFn.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMinFn.")
    public static SubLObject interval_minP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && $$IntervalMinFn.eql(cycl_utilities.formula_arg0(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is of the form (#$Unity <something> #$PlusInfinity [...]).
     */
    @LispMethod(comment = "@return boolean; t iff TERM is of the form (#$Unity <something> #$PlusInfinity [...]).")
    public static final SubLObject plus_infinity_unityP_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean(((NIL != el_formula_p(v_term)) && ($$Unity == cycl_utilities.formula_arg0(v_term))) && ($$PlusInfinity == cycl_utilities.formula_arg2(v_term, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is of the form (#$Unity <something> #$PlusInfinity [...]).
     */
    @LispMethod(comment = "@return boolean; t iff TERM is of the form (#$Unity <something> #$PlusInfinity [...]).")
    public static SubLObject plus_infinity_unityP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean(((NIL != el_formula_p(v_term)) && $$Unity.eql(cycl_utilities.formula_arg0(v_term))) && $$PlusInfinity.eql(cycl_utilities.formula_arg2(v_term, UNPROVIDED)));
    }

    /**
     * Returns <min> if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).
     * Otherwise it will return NIL.
     */
    @LispMethod(comment = "Returns <min> if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).\r\nOtherwise it will return NIL.\nReturns <min> if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).\nOtherwise it will return NIL.")
    public static final SubLObject el_min_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != com.cyc.cycjava.cycl.el_math_utilities.interval_minP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
        } else {
            if (NIL != com.cyc.cycjava.cycl.el_math_utilities.plus_infinity_unityP(v_term)) {
                return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Returns <min> if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).\r\nOtherwise it will return NIL.\nReturns <min> if TERM is of the form (#$IntervalMinFn <min>) or (#$Unity <min> #$PlusInfinity).\nOtherwise it will return NIL.")
    public static SubLObject el_min(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != interval_minP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
        }
        if (NIL != plus_infinity_unityP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff it is TERM has a maximum of a specific format;
    i.e. if TERM is an EL formula of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).
     */
    @LispMethod(comment = "@return boolean; t iff it is TERM has a maximum of a specific format;\r\ni.e. if TERM is an EL formula of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).")
    public static final SubLObject el_maxP_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != com.cyc.cycjava.cycl.el_math_utilities.interval_maxP(v_term)) || (NIL != com.cyc.cycjava.cycl.el_math_utilities.unity_non_neg_maxP(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff it is TERM has a maximum of a specific format;
    i.e. if TERM is an EL formula of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).
     */
    @LispMethod(comment = "@return boolean; t iff it is TERM has a maximum of a specific format;\r\ni.e. if TERM is an EL formula of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).")
    public static SubLObject el_maxP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != interval_maxP(v_term)) || (NIL != unity_non_neg_maxP(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMaxFn.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMaxFn.")
    public static final SubLObject interval_maxP_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && ($$IntervalMaxFn == cycl_utilities.formula_arg0(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMaxFn.
     */
    @LispMethod(comment = "@return boolean; t iff TERM is an EL formula whose arg0 is #$IntervalMaxFn.")
    public static SubLObject interval_maxP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && $$IntervalMaxFn.eql(cycl_utilities.formula_arg0(v_term)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is an EL formula of the form (#$Unity 0 <max>).
     */
    @LispMethod(comment = "@return boolean; t iff TERM is an EL formula of the form (#$Unity 0 <max>).")
    public static final SubLObject unity_non_neg_maxP_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((((NIL != el_formula_p(v_term)) && ($$Unity == cycl_utilities.formula_arg0(v_term))) && (ZERO_INTEGER == cycl_utilities.formula_arg1(v_term, UNPROVIDED))) && (NIL != cycl_utilities.formula_arg2(v_term, UNPROVIDED)));
    }

    /**
     *
     *
     * @return boolean; t iff TERM is an EL formula of the form (#$Unity 0 <max>).
     */
    @LispMethod(comment = "@return boolean; t iff TERM is an EL formula of the form (#$Unity 0 <max>).")
    public static SubLObject unity_non_neg_maxP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((((NIL != el_formula_p(v_term)) && $$Unity.eql(cycl_utilities.formula_arg0(v_term))) && ZERO_INTEGER.eql(cycl_utilities.formula_arg1(v_term, UNPROVIDED))) && (NIL != cycl_utilities.formula_arg2(v_term, UNPROVIDED)));
    }

    /**
     * Returns <max> if TERM is of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).
     * Otherwise it will return NIL.
     */
    @LispMethod(comment = "Returns <max> if TERM is of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).\r\nOtherwise it will return NIL.\nReturns <max> if TERM is of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).\nOtherwise it will return NIL.")
    public static final SubLObject el_max_alt(SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != com.cyc.cycjava.cycl.el_math_utilities.unity_non_neg_maxP(v_term)) {
            return cycl_utilities.formula_arg2(v_term, UNPROVIDED);
        } else {
            if (NIL != com.cyc.cycjava.cycl.el_math_utilities.interval_maxP(v_term)) {
                return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Returns <max> if TERM is of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).
     * Otherwise it will return NIL.
     */
    @LispMethod(comment = "Returns <max> if TERM is of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).\r\nOtherwise it will return NIL.\nReturns <max> if TERM is of the form (#$IntervalMaxFn <max>) or (#$Unity 0 <max>).\nOtherwise it will return NIL.")
    public static SubLObject el_max(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        if (NIL != unity_non_neg_maxP(v_term)) {
            return cycl_utilities.formula_arg2(v_term, UNPROVIDED);
        }
        if (NIL != interval_maxP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Given a bounded existential quantifier and a number, returns a Cyc scalar interval denoting the interval.
     * e.g. (quantified-interval #$thereExistAtLeast 4) returns (#$IntervalMinFn 4).
     */
    @LispMethod(comment = "Given a bounded existential quantifier and a number, returns a Cyc scalar interval denoting the interval.\r\ne.g. (quantified-interval #$thereExistAtLeast 4) returns (#$IntervalMinFn 4).\nGiven a bounded existential quantifier and a number, returns a Cyc scalar interval denoting the interval.\ne.g. (quantified-interval #$thereExistAtLeast 4) returns (#$IntervalMinFn 4).")
    public static final SubLObject quantified_interval_alt(SubLObject quant, SubLObject num) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str_alt0$A_KB_dependent_numerical_quantifi);
        }
        if ($$thereExistAtLeast == quant) {
            return make_unary_formula($$IntervalMinFn, num);
        } else {
            if ($$thereExistAtMost == quant) {
                return make_unary_formula($$IntervalMaxFn, num);
            } else {
                if ($$thereExistExactly == quant) {
                    return num;
                } else {
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "Given a bounded existential quantifier and a number, returns a Cyc scalar interval denoting the interval.\r\ne.g. (quantified-interval #$thereExistAtLeast 4) returns (#$IntervalMinFn 4).\nGiven a bounded existential quantifier and a number, returns a Cyc scalar interval denoting the interval.\ne.g. (quantified-interval #$thereExistAtLeast 4) returns (#$IntervalMinFn 4).")
    public static SubLObject quantified_interval(final SubLObject quant, final SubLObject num) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        if ($$thereExistAtLeast.eql(quant)) {
            return make_unary_formula($$IntervalMinFn, num);
        }
        if ($$thereExistAtMost.eql(quant)) {
            return make_unary_formula($$IntervalMaxFn, num);
        }
        if ($$thereExistExactly.eql(quant)) {
            return num;
        }
        return NIL;
    }

    public static SubLObject declare_el_math_utilities_file() {
        declareFunction("el_minP", "EL-MIN?", 1, 0, false);
        declareFunction("interval_minP", "INTERVAL-MIN?", 1, 0, false);
        declareFunction("plus_infinity_unityP", "PLUS-INFINITY-UNITY?", 1, 0, false);
        declareFunction("el_min", "EL-MIN", 1, 0, false);
        declareFunction("el_maxP", "EL-MAX?", 1, 0, false);
        declareFunction("interval_maxP", "INTERVAL-MAX?", 1, 0, false);
        declareFunction("unity_non_neg_maxP", "UNITY-NON-NEG-MAX?", 1, 0, false);
        declareFunction("el_max", "EL-MAX", 1, 0, false);
        declareFunction("quantified_interval", "QUANTIFIED-INTERVAL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_el_math_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_el_math_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_el_math_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_el_math_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_el_math_utilities_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
}

/**
 * Total time: 107 ms
 */
