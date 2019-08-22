package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.el_utilities.make_negation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_analogy_developer extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_analogy_developer();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_analogy_developer";

    public static final String myFingerPrint = "301d4d2c4d36a3686c9939f6187f78853a26483cb3a35f4fa2d6ea7199280604";

    // Internal Constants
    public static final SubLString $str0$_a_must_be_a_fort_or_a_naut = makeString("~a must be a fort or a naut");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    public static SubLObject rkf_analogous_formulas(final SubLObject target, SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_utilities.fort_or_naut_p(target))) {
            Errors.error($str0$_a_must_be_a_fort_or_a_naut, target);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cycl_utilities.fort_or_naut_p(source))) {
            Errors.error($str0$_a_must_be_a_fort_or_a_naut, source);
        }
        SubLObject target_term = NIL;
        SubLObject source_term = NIL;
        if (NIL != nart_handles.nart_p(target)) {
            target_term = narts_high.nart_hl_formula(target);
        } else {
            target_term = target;
        }
        if (NIL != nart_handles.nart_p(source)) {
            source_term = narts_high.nart_hl_formula(source);
        } else {
            source_term = source;
        }
        final SubLObject source_formulas = rkf_harvest_analogous_formulas(source, mt);
        final SubLObject target_formulas = subst(target_term, source_term, source_formulas, symbol_function(EQUAL), UNPROVIDED);
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = target_formulas;
        SubLObject target_formula = NIL;
        target_formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != rkf_query_utilities.rkf_unknown(target_formula, mt)) && (NIL != rkf_query_utilities.rkf_unknown(make_negation(target_formula), mt))) {
                answers = cons(target_formula, answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            target_formula = cdolist_list_var.first();
        } 
        answers = nreverse(answers);
        return answers;
    }

    public static SubLObject rkf_harvest_analogous_formulas(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formulas = rkf_concept_summarizer.rkf_summarize(v_term, mt, UNPROVIDED);
        SubLObject el_formulas = NIL;
        SubLObject cdolist_list_var = formulas;
        SubLObject formula = NIL;
        formula = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject assertion = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                assertion = czer_meta.find_assertion_cycl(formula, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if ((NIL != assertion_handles.assertion_p(assertion)) && (NIL != assertions_high.asserted_assertionP(assertion))) {
                el_formulas = cons(cycl_utilities.hl_to_el(formula), el_formulas);
            }
            cdolist_list_var = cdolist_list_var.rest();
            formula = cdolist_list_var.first();
        } 
        return nreverse(el_formulas);
    }

    public static SubLObject rkf_analogous_negation(final SubLObject target, SubLObject source, final SubLObject target_formula) {
        return cycl_utilities.negate(subst(source, target, target_formula, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject declare_rkf_analogy_developer_file() {
        declareFunction(me, "rkf_analogous_formulas", "RKF-ANALOGOUS-FORMULAS", 2, 1, false);
        declareFunction(me, "rkf_harvest_analogous_formulas", "RKF-HARVEST-ANALOGOUS-FORMULAS", 2, 0, false);
        declareFunction(me, "rkf_analogous_negation", "RKF-ANALOGOUS-NEGATION", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_analogy_developer_file() {
        return NIL;
    }

    public static SubLObject setup_rkf_analogy_developer_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_analogy_developer_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_analogy_developer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_analogy_developer_file();
    }

    
}

/**
 * Total time: 88 ms
 */
