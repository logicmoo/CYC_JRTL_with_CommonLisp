package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_math_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.el_math_utilities";
    public static final String myFingerPrint = "2f12b0102c6e61515479ee7646c2846024ea7ba429a65bcafb3f00a0fd6be5ef";
    private static final SubLString $str0$A_KB_dependent_numerical_quantifi;
    private static final SubLObject $const1$IntervalMinFn;
    private static final SubLObject $const2$Unity;
    private static final SubLObject $const3$PlusInfinity;
    private static final SubLObject $const4$IntervalMaxFn;
    private static final SubLObject $const5$thereExistAtLeast;
    private static final SubLObject $const6$thereExistAtMost;
    private static final SubLObject $const7$thereExistExactly;
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 752L)
    public static SubLObject el_minP(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(el_math_utilities.NIL != interval_minP(v_term) || el_math_utilities.NIL != plus_infinity_unityP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 1270L)
    public static SubLObject interval_minP(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(el_math_utilities.NIL != el_utilities.el_formula_p(v_term) && el_math_utilities.$const1$IntervalMinFn.eql(cycl_utilities.formula_arg0(v_term)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 1660L)
    public static SubLObject plus_infinity_unityP(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(el_math_utilities.NIL != el_utilities.el_formula_p(v_term) && el_math_utilities.$const2$Unity.eql(cycl_utilities.formula_arg0(v_term)) && el_math_utilities.$const3$PlusInfinity.eql(cycl_utilities.formula_arg2(v_term, (SubLObject)el_math_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 2107L)
    public static SubLObject el_min(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        if (el_math_utilities.NIL != interval_minP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, (SubLObject)el_math_utilities.UNPROVIDED);
        }
        if (el_math_utilities.NIL != plus_infinity_unityP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, (SubLObject)el_math_utilities.UNPROVIDED);
        }
        return (SubLObject)el_math_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 2577L)
    public static SubLObject el_maxP(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(el_math_utilities.NIL != interval_maxP(v_term) || el_math_utilities.NIL != unity_non_neg_maxP(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 3029L)
    public static SubLObject interval_maxP(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(el_math_utilities.NIL != el_utilities.el_formula_p(v_term) && el_math_utilities.$const4$IntervalMaxFn.eql(cycl_utilities.formula_arg0(v_term)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 3419L)
    public static SubLObject unity_non_neg_maxP(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(el_math_utilities.NIL != el_utilities.el_formula_p(v_term) && el_math_utilities.$const2$Unity.eql(cycl_utilities.formula_arg0(v_term)) && el_math_utilities.ZERO_INTEGER.eql(cycl_utilities.formula_arg1(v_term, (SubLObject)el_math_utilities.UNPROVIDED)) && el_math_utilities.NIL != cycl_utilities.formula_arg2(v_term, (SubLObject)el_math_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 3865L)
    public static SubLObject el_max(final SubLObject v_term) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        if (el_math_utilities.NIL != unity_non_neg_maxP(v_term)) {
            return cycl_utilities.formula_arg2(v_term, (SubLObject)el_math_utilities.UNPROVIDED);
        }
        if (el_math_utilities.NIL != interval_maxP(v_term)) {
            return cycl_utilities.formula_arg1(v_term, (SubLObject)el_math_utilities.UNPROVIDED);
        }
        return (SubLObject)el_math_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-math-utilities.lisp", position = 4320L)
    public static SubLObject quantified_interval(final SubLObject quant, final SubLObject num) {
        if (el_math_utilities.NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error((SubLObject)el_math_utilities.$str0$A_KB_dependent_numerical_quantifi);
        }
        if (el_math_utilities.$const5$thereExistAtLeast.eql(quant)) {
            return el_utilities.make_unary_formula(el_math_utilities.$const1$IntervalMinFn, num);
        }
        if (el_math_utilities.$const6$thereExistAtMost.eql(quant)) {
            return el_utilities.make_unary_formula(el_math_utilities.$const4$IntervalMaxFn, num);
        }
        if (el_math_utilities.$const7$thereExistExactly.eql(quant)) {
            return num;
        }
        return (SubLObject)el_math_utilities.NIL;
    }
    
    public static SubLObject declare_el_math_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "el_minP", "EL-MIN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "interval_minP", "INTERVAL-MIN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "plus_infinity_unityP", "PLUS-INFINITY-UNITY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "el_min", "EL-MIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "el_maxP", "EL-MAX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "interval_maxP", "INTERVAL-MAX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "unity_non_neg_maxP", "UNITY-NON-NEG-MAX?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "el_max", "EL-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.el_math_utilities", "quantified_interval", "QUANTIFIED-INTERVAL", 2, 0, false);
        return (SubLObject)el_math_utilities.NIL;
    }
    
    public static SubLObject init_el_math_utilities_file() {
        return (SubLObject)el_math_utilities.NIL;
    }
    
    public static SubLObject setup_el_math_utilities_file() {
        return (SubLObject)el_math_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_el_math_utilities_file();
    }
    
    public void initializeVariables() {
        init_el_math_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_el_math_utilities_file();
    }
    
    static {
        me = (SubLFile)new el_math_utilities();
        $str0$A_KB_dependent_numerical_quantifi = SubLObjectFactory.makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");
        $const1$IntervalMinFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalMinFn"));
        $const2$Unity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Unity"));
        $const3$PlusInfinity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlusInfinity"));
        $const4$IntervalMaxFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalMaxFn"));
        $const5$thereExistAtLeast = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $const6$thereExistAtMost = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtMost"));
        $const7$thereExistExactly = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistExactly"));
    }
}

/*

	Total time: 107 ms
	
*/