package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class el_math_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new el_math_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.el_math_utilities";

    public static final String myFingerPrint = "2f12b0102c6e61515479ee7646c2846024ea7ba429a65bcafb3f00a0fd6be5ef";

    // Internal Constants
    public static final SubLString $str0$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");

    private static final SubLObject $$IntervalMinFn = reader_make_constant_shell(makeString("IntervalMinFn"));

    private static final SubLObject $$Unity = reader_make_constant_shell(makeString("Unity"));

    private static final SubLObject $$PlusInfinity = reader_make_constant_shell(makeString("PlusInfinity"));

    private static final SubLObject $$IntervalMaxFn = reader_make_constant_shell(makeString("IntervalMaxFn"));

    private static final SubLObject $$thereExistAtLeast = reader_make_constant_shell(makeString("thereExistAtLeast"));

    private static final SubLObject $$thereExistAtMost = reader_make_constant_shell(makeString("thereExistAtMost"));

    private static final SubLObject $$thereExistExactly = reader_make_constant_shell(makeString("thereExistExactly"));

    public static SubLObject el_minP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != interval_minP(v_term)) || (NIL != plus_infinity_unityP(v_term)));
    }

    public static SubLObject interval_minP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && $$IntervalMinFn.eql(cycl_utilities.formula_arg0(v_term)));
    }

    public static SubLObject plus_infinity_unityP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean(((NIL != el_formula_p(v_term)) && $$Unity.eql(cycl_utilities.formula_arg0(v_term))) && $$PlusInfinity.eql(cycl_utilities.formula_arg2(v_term, UNPROVIDED)));
    }

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

    public static SubLObject el_maxP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != interval_maxP(v_term)) || (NIL != unity_non_neg_maxP(v_term)));
    }

    public static SubLObject interval_maxP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((NIL != el_formula_p(v_term)) && $$IntervalMaxFn.eql(cycl_utilities.formula_arg0(v_term)));
    }

    public static SubLObject unity_non_neg_maxP(final SubLObject v_term) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return makeBoolean((((NIL != el_formula_p(v_term)) && $$Unity.eql(cycl_utilities.formula_arg0(v_term))) && ZERO_INTEGER.eql(cycl_utilities.formula_arg1(v_term, UNPROVIDED))) && (NIL != cycl_utilities.formula_arg2(v_term, UNPROVIDED)));
    }

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
        declareFunction(me, "el_minP", "EL-MIN?", 1, 0, false);
        declareFunction(me, "interval_minP", "INTERVAL-MIN?", 1, 0, false);
        declareFunction(me, "plus_infinity_unityP", "PLUS-INFINITY-UNITY?", 1, 0, false);
        declareFunction(me, "el_min", "EL-MIN", 1, 0, false);
        declareFunction(me, "el_maxP", "EL-MAX?", 1, 0, false);
        declareFunction(me, "interval_maxP", "INTERVAL-MAX?", 1, 0, false);
        declareFunction(me, "unity_non_neg_maxP", "UNITY-NON-NEG-MAX?", 1, 0, false);
        declareFunction(me, "el_max", "EL-MAX", 1, 0, false);
        declareFunction(me, "quantified_interval", "QUANTIFIED-INTERVAL", 2, 0, false);
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

    
}

/**
 * Total time: 107 ms
 */
