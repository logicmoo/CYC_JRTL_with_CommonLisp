/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-ANALOGY-DEVELOPER
 * source file: /cyc/top/cycl/rkf-analogy-developer.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_analogy_developer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_analogy_developer();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_analogy_developer";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$_a_must_be_a_fort_or_a_naut = makeString("~a must be a fort or a naut");



    // Definitions
    public static final SubLObject rkf_analogous_formulas_alt(SubLObject target, SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cycl_utilities.fort_or_naut_p(target)) {
                    Errors.error($str_alt0$_a_must_be_a_fort_or_a_naut, target);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cycl_utilities.fort_or_naut_p(source)) {
                    Errors.error($str_alt0$_a_must_be_a_fort_or_a_naut, source);
                }
            }
            {
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
                {
                    SubLObject source_formulas = com.cyc.cycjava.cycl.rkf_analogy_developer.rkf_harvest_analogous_formulas(source, mt);
                    SubLObject target_formulas = subst(target_term, source_term, source_formulas, symbol_function(EQUAL), UNPROVIDED);
                    SubLObject answers = NIL;
                    SubLObject cdolist_list_var = target_formulas;
                    SubLObject target_formula = NIL;
                    for (target_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , target_formula = cdolist_list_var.first()) {
                        if ((NIL != rkf_query_utilities.rkf_unknown(target_formula, mt)) && (NIL != rkf_query_utilities.rkf_unknown(make_negation(target_formula), mt))) {
                            answers = cons(target_formula, answers);
                        }
                    }
                    answers = nreverse(answers);
                    return answers;
                }
            }
        }
    }

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

    /**
     * Obtain the formulas and make sure that you can expand even into the NARTs.
     * Currently, we prune the concluded ones and hope they will be concluded
     * again if they are meaningful; another approach would be to ignore their
     * being redundant during assertion.
     */
    @LispMethod(comment = "Obtain the formulas and make sure that you can expand even into the NARTs.\r\nCurrently, we prune the concluded ones and hope they will be concluded\r\nagain if they are meaningful; another approach would be to ignore their\r\nbeing redundant during assertion.\nObtain the formulas and make sure that you can expand even into the NARTs.\nCurrently, we prune the concluded ones and hope they will be concluded\nagain if they are meaningful; another approach would be to ignore their\nbeing redundant during assertion.")
    public static final SubLObject rkf_harvest_analogous_formulas_alt(SubLObject v_term, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formulas = rkf_concept_summarizer.rkf_summarize(v_term, mt, UNPROVIDED);
                SubLObject el_formulas = NIL;
                SubLObject cdolist_list_var = formulas;
                SubLObject formula = NIL;
                for (formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , formula = cdolist_list_var.first()) {
                    {
                        SubLObject assertion = NIL;
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                assertion = czer_meta.find_assertion_cycl(formula, UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (NIL != assertion_handles.assertion_p(assertion)) {
                            if (NIL != assertions_high.asserted_assertionP(assertion)) {
                                el_formulas = cons(cycl_utilities.hl_to_el(formula), el_formulas);
                            }
                        }
                    }
                }
                return nreverse(el_formulas);
            }
        }
    }

    /**
     * Obtain the formulas and make sure that you can expand even into the NARTs.
     * Currently, we prune the concluded ones and hope they will be concluded
     * again if they are meaningful; another approach would be to ignore their
     * being redundant during assertion.
     */
    @LispMethod(comment = "Obtain the formulas and make sure that you can expand even into the NARTs.\r\nCurrently, we prune the concluded ones and hope they will be concluded\r\nagain if they are meaningful; another approach would be to ignore their\r\nbeing redundant during assertion.\nObtain the formulas and make sure that you can expand even into the NARTs.\nCurrently, we prune the concluded ones and hope they will be concluded\nagain if they are meaningful; another approach would be to ignore their\nbeing redundant during assertion.")
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

    public static final SubLObject rkf_analogous_negation_alt(SubLObject target, SubLObject source, SubLObject target_formula) {
        return cycl_utilities.negate(subst(source, target, target_formula, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject rkf_analogous_negation(final SubLObject target, SubLObject source, final SubLObject target_formula) {
        return cycl_utilities.negate(subst(source, target, target_formula, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject declare_rkf_analogy_developer_file() {
        declareFunction("rkf_analogous_formulas", "RKF-ANALOGOUS-FORMULAS", 2, 1, false);
        declareFunction("rkf_harvest_analogous_formulas", "RKF-HARVEST-ANALOGOUS-FORMULAS", 2, 0, false);
        declareFunction("rkf_analogous_negation", "RKF-ANALOGOUS-NEGATION", 3, 0, false);
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

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$_a_must_be_a_fort_or_a_naut = makeString("~a must be a fort or a naut");
}

/**
 * Total time: 88 ms
 */
