package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_analogy_developer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_analogy_developer";
    public static final String myFingerPrint = "301d4d2c4d36a3686c9939f6187f78853a26483cb3a35f4fa2d6ea7199280604";
    private static final SubLString $str0$_a_must_be_a_fort_or_a_naut;
    private static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const2$EverythingPSC;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-analogy-developer.lisp", position = 790L)
    public static SubLObject rkf_analogous_formulas(final SubLObject target, SubLObject source, SubLObject mt) {
        if (mt == rkf_analogy_developer.UNPROVIDED) {
            mt = control_vars.$rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_analogy_developer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && rkf_analogy_developer.NIL == cycl_utilities.fort_or_naut_p(target)) {
            Errors.error((SubLObject)rkf_analogy_developer.$str0$_a_must_be_a_fort_or_a_naut, target);
        }
        if (rkf_analogy_developer.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && rkf_analogy_developer.NIL == cycl_utilities.fort_or_naut_p(source)) {
            Errors.error((SubLObject)rkf_analogy_developer.$str0$_a_must_be_a_fort_or_a_naut, source);
        }
        SubLObject target_term = (SubLObject)rkf_analogy_developer.NIL;
        SubLObject source_term = (SubLObject)rkf_analogy_developer.NIL;
        if (rkf_analogy_developer.NIL != nart_handles.nart_p(target)) {
            target_term = narts_high.nart_hl_formula(target);
        }
        else {
            target_term = target;
        }
        if (rkf_analogy_developer.NIL != nart_handles.nart_p(source)) {
            source_term = narts_high.nart_hl_formula(source);
        }
        else {
            source_term = source;
        }
        final SubLObject source_formulas = rkf_harvest_analogous_formulas(source, mt);
        final SubLObject target_formulas = conses_high.subst(target_term, source_term, source_formulas, Symbols.symbol_function((SubLObject)rkf_analogy_developer.EQUAL), (SubLObject)rkf_analogy_developer.UNPROVIDED);
        SubLObject answers = (SubLObject)rkf_analogy_developer.NIL;
        SubLObject cdolist_list_var = target_formulas;
        SubLObject target_formula = (SubLObject)rkf_analogy_developer.NIL;
        target_formula = cdolist_list_var.first();
        while (rkf_analogy_developer.NIL != cdolist_list_var) {
            if (rkf_analogy_developer.NIL != rkf_query_utilities.rkf_unknown(target_formula, mt) && rkf_analogy_developer.NIL != rkf_query_utilities.rkf_unknown(el_utilities.make_negation(target_formula), mt)) {
                answers = (SubLObject)ConsesLow.cons(target_formula, answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            target_formula = cdolist_list_var.first();
        }
        answers = Sequences.nreverse(answers);
        return answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-analogy-developer.lisp", position = 1752L)
    public static SubLObject rkf_harvest_analogous_formulas(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formulas = rkf_concept_summarizer.rkf_summarize(v_term, mt, (SubLObject)rkf_analogy_developer.UNPROVIDED);
        SubLObject el_formulas = (SubLObject)rkf_analogy_developer.NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = (SubLObject)rkf_analogy_developer.NIL;
        formula = cdolist_list_var.first();
        while (rkf_analogy_developer.NIL != cdolist_list_var) {
            SubLObject assertion = (SubLObject)rkf_analogy_developer.NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_analogy_developer.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(rkf_analogy_developer.$const2$EverythingPSC, thread);
                assertion = czer_meta.find_assertion_cycl(formula, (SubLObject)rkf_analogy_developer.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (rkf_analogy_developer.NIL != assertion_handles.assertion_p(assertion) && rkf_analogy_developer.NIL != assertions_high.asserted_assertionP(assertion)) {
                el_formulas = (SubLObject)ConsesLow.cons(cycl_utilities.hl_to_el(formula), el_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        }
        return Sequences.nreverse(el_formulas);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-analogy-developer.lisp", position = 2532L)
    public static SubLObject rkf_analogous_negation(final SubLObject target, SubLObject source, final SubLObject target_formula) {
        return cycl_utilities.negate(conses_high.subst(source, target, target_formula, Symbols.symbol_function((SubLObject)rkf_analogy_developer.EQUAL), (SubLObject)rkf_analogy_developer.UNPROVIDED));
    }
    
    public static SubLObject declare_rkf_analogy_developer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_analogy_developer", "rkf_analogous_formulas", "RKF-ANALOGOUS-FORMULAS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_analogy_developer", "rkf_harvest_analogous_formulas", "RKF-HARVEST-ANALOGOUS-FORMULAS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_analogy_developer", "rkf_analogous_negation", "RKF-ANALOGOUS-NEGATION", 3, 0, false);
        return (SubLObject)rkf_analogy_developer.NIL;
    }
    
    public static SubLObject init_rkf_analogy_developer_file() {
        return (SubLObject)rkf_analogy_developer.NIL;
    }
    
    public static SubLObject setup_rkf_analogy_developer_file() {
        return (SubLObject)rkf_analogy_developer.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_analogy_developer_file();
    }
    
    public void initializeVariables() {
        init_rkf_analogy_developer_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_analogy_developer_file();
    }
    
    static {
        me = (SubLFile)new rkf_analogy_developer();
        $str0$_a_must_be_a_fort_or_a_naut = SubLObjectFactory.makeString("~a must be a fort or a naut");
        $sym1$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const2$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
    }
}

/*

	Total time: 88 ms
	
*/