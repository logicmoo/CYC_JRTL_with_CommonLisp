/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-TIME-QUERY-PROCESSING
 * source file: /cyc/top/cycl/sbhl/sbhl-time-query-processing.lisp
 * created:     2019/07/03 17:37:36
 */
public final class sbhl_time_query_processing extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_time_query_processing();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing";


    static private final SubLList $list3 = list(makeKeyword("WEAK-SUCCESSORS-SUCCESSOR"), makeKeyword("SUCCESSORS-SUCCESSOR-STRICT"));

    private static final SubLSymbol $WEAK_SUCCESSORS_SUCCESSOR = makeKeyword("WEAK-SUCCESSORS-SUCCESSOR");

    private static final SubLSymbol $WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR = makeKeyword("WEAK-SUCCESSORS-SUCCESSORS-SUCCESSOR");

    private static final SubLSymbol $SUCCESSORS_SUCCESSOR_STRICT = makeKeyword("SUCCESSORS-SUCCESSOR-STRICT");

    private static final SubLSymbol $WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR = makeKeyword("WEAK-SUCCESSORS-SUCCESSOR-SUCCESSOR");

    private static final SubLSymbol $DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");



    // Definitions
    public static final SubLObject true_temporal_relation_literalP_alt(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject sense, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        {
            SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
            if (!conjunction_fn.isFunctionSpec()) {
                return NIL;
            }
            {
                SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
                SubLObject pcase_var = sense;
                if (pcase_var.eql($POS)) {
                    if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_quasi_link_conjunctionP(conjuncts, mt);
                    } else {
                        if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.false_temporal_quasi_link_conjunctionP(conjuncts, mt);
                        }
                    }
                } else {
                    if (pcase_var.eql($NEG)) {
                        if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.false_temporal_quasi_link_conjunctionP(conjuncts, mt);
                        } else {
                            if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_quasi_link_conjunctionP(conjuncts, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject true_temporal_relation_literalP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
        if (!conjunction_fn.isFunctionSpec()) {
            return NIL;
        }
        final SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
        if (sense.eql($POS)) {
            if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                return true_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
            if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                return false_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
        } else
            if (sense.eql($NEG)) {
                if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                    return false_temporal_quasi_link_conjunctionP(conjuncts, mt);
                }
                if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                    return true_temporal_quasi_link_conjunctionP(conjuncts, mt);
                }
            }

        return NIL;
    }

    public static final SubLObject true_temporal_quasi_link_conjunctionP_alt(SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject unverified_conjunctP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
                        if ((NIL == mt) && (!((NIL != mt_relevance_macros.all_mts_are_relevantP()) || (NIL != mt_relevance_macros.any_mt_is_relevantP())))) {
                            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                        }
                        if (NIL == unverified_conjunctP) {
                            {
                                SubLObject csome_list_var = quasi_conjuncts;
                                SubLObject conjunct = NIL;
                                for (conjunct = csome_list_var.first(); !((NIL != unverified_conjunctP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , conjunct = csome_list_var.first()) {
                                    {
                                        SubLObject link_tag = conjunct.first();
                                        SubLObject before = second(conjunct);
                                        SubLObject after = third(conjunct);
                                        unverified_conjunctP = makeBoolean(NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_quasi_linkP(link_tag, before, after, mt));
                                    }
                                }
                            }
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.remove_temporal_link_disjunction_consequents(mt);
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return makeBoolean(NIL == unverified_conjunctP);
            }
        }
    }

    public static SubLObject true_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unverified_conjunctP = NIL;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
            if (((NIL == mt) && (NIL == mt_relevance_macros.all_mts_are_relevantP())) && (NIL == mt_relevance_macros.any_mt_is_relevantP())) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (NIL == unverified_conjunctP) {
                SubLObject csome_list_var = quasi_conjuncts;
                SubLObject conjunct = NIL;
                conjunct = csome_list_var.first();
                while ((NIL == unverified_conjunctP) && (NIL != csome_list_var)) {
                    final SubLObject link_tag = conjunct.first();
                    final SubLObject before = second(conjunct);
                    final SubLObject after = third(conjunct);
                    unverified_conjunctP = makeBoolean(NIL == true_temporal_quasi_linkP(link_tag, before, after, mt));
                    csome_list_var = csome_list_var.rest();
                    conjunct = csome_list_var.first();
                } 
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        } finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == unverified_conjunctP);
    }

    public static final SubLObject false_temporal_quasi_link_conjunctionP_alt(SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject quasi_disjuncts = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.temporal_link_conjunction_negation(quasi_conjuncts);
                SubLObject verified_disjunctP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
                        if ((NIL == mt) && (!((NIL != mt_relevance_macros.all_mts_are_relevantP()) || (NIL != mt_relevance_macros.any_mt_is_relevantP())))) {
                            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                        }
                        if (NIL == verified_disjunctP) {
                            {
                                SubLObject csome_list_var = quasi_disjuncts;
                                SubLObject quasi_disjunct = NIL;
                                for (quasi_disjunct = csome_list_var.first(); !((NIL != verified_disjunctP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , quasi_disjunct = csome_list_var.first()) {
                                    {
                                        SubLObject link_tag = quasi_disjunct.first();
                                        SubLObject before = second(quasi_disjunct);
                                        SubLObject after = third(quasi_disjunct);
                                        verified_disjunctP = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_quasi_linkP(link_tag, before, after, mt);
                                    }
                                }
                            }
                        }
                        if (NIL == verified_disjunctP) {
                            {
                                SubLObject disjunct = NIL;
                                SubLObject disjuncts = NIL;
                                {
                                    SubLObject cdolist_list_var = quasi_disjuncts;
                                    SubLObject quasi_disjunct = NIL;
                                    for (quasi_disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quasi_disjunct = cdolist_list_var.first()) {
                                        {
                                            SubLObject link = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(quasi_disjunct);
                                            SubLObject link_tag = link.first();
                                            if (NIL != link) {
                                                if (NIL != disjunct) {
                                                    disjuncts = cons(link, disjuncts);
                                                } else {
                                                    if (NIL != subl_promotions.memberP(link_tag, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                                        disjunct = link;
                                                    } else {
                                                        disjuncts = cons(link, disjuncts);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == disjunct) {
                                    disjunct = disjuncts.first();
                                    disjuncts = disjuncts.rest();
                                }
                                if (NIL != disjuncts) {
                                    {
                                        SubLObject conjuncts = NIL;
                                        SubLObject link_addedP = NIL;
                                        if (NIL == mt) {
                                            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                                        }
                                        {
                                            SubLObject cdolist_list_var = disjuncts;
                                            SubLObject link = NIL;
                                            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                                conjuncts = cons(com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.temporal_link_negation(link), conjuncts);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = conjuncts;
                                            SubLObject conjunct = NIL;
                                            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                {
                                                    SubLObject link_tag = conjunct.first();
                                                    SubLObject before = second(conjunct);
                                                    SubLObject after = third(conjunct);
                                                    link_addedP = makeBoolean((NIL != sbhl_time_assertion_processing.add_temporal_link($CONDITIONAL_PROOF, link_tag, before, after, mt)) || (NIL != link_addedP));
                                                }
                                            }
                                        }
                                        if (NIL != link_addedP) {
                                            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                                            }
                                            {
                                                SubLObject link_tag = disjunct.first();
                                                SubLObject before = second(disjunct);
                                                SubLObject after = third(disjunct);
                                                verified_disjunctP = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_linkP(link_tag, before, after, mt);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = conjuncts;
                                            SubLObject conjunct = NIL;
                                            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                {
                                                    SubLObject link_tag = conjunct.first();
                                                    SubLObject before = second(conjunct);
                                                    SubLObject after = third(conjunct);
                                                    sbhl_time_assertion_processing.remove_temporal_link($CONDITIONAL_PROOF, link_tag, before, after, mt);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.remove_temporal_link_disjunction_consequents(mt);
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_0, thread);
                    }
                }
                return verified_disjunctP;
            }
        }
    }

    public static SubLObject false_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject quasi_disjuncts = temporal_link_conjunction_negation(quasi_conjuncts);
        SubLObject verified_disjunctP = NIL;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
            if (((NIL == mt) && (NIL == mt_relevance_macros.all_mts_are_relevantP())) && (NIL == mt_relevance_macros.any_mt_is_relevantP())) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (NIL == verified_disjunctP) {
                SubLObject csome_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct = NIL;
                quasi_disjunct = csome_list_var.first();
                while ((NIL == verified_disjunctP) && (NIL != csome_list_var)) {
                    final SubLObject link_tag = quasi_disjunct.first();
                    final SubLObject before = second(quasi_disjunct);
                    final SubLObject after = third(quasi_disjunct);
                    verified_disjunctP = true_temporal_quasi_linkP(link_tag, before, after, mt);
                    csome_list_var = csome_list_var.rest();
                    quasi_disjunct = csome_list_var.first();
                } 
            }
            if (NIL == verified_disjunctP) {
                SubLObject disjunct = NIL;
                SubLObject disjuncts = NIL;
                SubLObject cdolist_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct2 = NIL;
                quasi_disjunct2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject link = adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(quasi_disjunct2);
                    final SubLObject link_tag2 = link.first();
                    if (NIL != link) {
                        if (NIL != disjunct) {
                            disjuncts = cons(link, disjuncts);
                        } else
                            if (NIL != subl_promotions.memberP(link_tag2, $list3, UNPROVIDED, UNPROVIDED)) {
                                disjunct = link;
                            } else {
                                disjuncts = cons(link, disjuncts);
                            }

                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    quasi_disjunct2 = cdolist_list_var.first();
                } 
                if (NIL == disjunct) {
                    disjunct = disjuncts.first();
                    disjuncts = disjuncts.rest();
                }
                if (NIL != disjuncts) {
                    SubLObject conjuncts = NIL;
                    SubLObject link_addedP = NIL;
                    if (NIL == mt) {
                        mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                    }
                    SubLObject cdolist_list_var2 = disjuncts;
                    SubLObject link2 = NIL;
                    link2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        conjuncts = cons(temporal_link_negation(link2), conjuncts);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        link2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = conjuncts;
                    SubLObject conjunct = NIL;
                    conjunct = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = second(conjunct);
                        final SubLObject after2 = third(conjunct);
                        link_addedP = makeBoolean((NIL != sbhl_time_assertion_processing.add_temporal_link($CONDITIONAL_PROOF, link_tag3, before2, after2, mt)) || (NIL != link_addedP));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    } 
                    if (NIL != link_addedP) {
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            add_temporal_link_disjunction_consequents(mt);
                        }
                        final SubLObject link_tag4 = disjunct.first();
                        final SubLObject before3 = second(disjunct);
                        final SubLObject after3 = third(disjunct);
                        verified_disjunctP = true_temporal_linkP(link_tag4, before3, after3, mt);
                    }
                    cdolist_list_var2 = conjuncts;
                    conjunct = NIL;
                    conjunct = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = second(conjunct);
                        final SubLObject after2 = third(conjunct);
                        sbhl_time_assertion_processing.remove_temporal_link($CONDITIONAL_PROOF, link_tag3, before2, after2, mt);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    } 
                }
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        } finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_0, thread);
        }
        return verified_disjunctP;
    }

    public static final SubLObject temporal_link_conjunction_negation_alt(SubLObject conjuncts) {
        {
            SubLObject disjuncts = NIL;
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = NIL;
            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                {
                    SubLObject link_tag = conjunct.first();
                    SubLObject before = second(conjunct);
                    SubLObject after = third(conjunct);
                    SubLObject pcase_var = link_tag;
                    if (pcase_var.eql($WEAK)) {
                        disjuncts = cons(list($STRICT, after, before), disjuncts);
                    } else {
                        if (pcase_var.eql($STRICT)) {
                            disjuncts = cons(list($WEAK, after, before), disjuncts);
                        } else {
                            if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                disjuncts = cons(list($SUCCESSOR_STRICT, after, before), disjuncts);
                            } else {
                                if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                    disjuncts = cons(list($WEAK_SUCCESSOR, after, before), disjuncts);
                                } else {
                                    if (pcase_var.eql($COORDINATE)) {
                                        disjuncts = cons(list($STRICT, after, before), disjuncts);
                                        disjuncts = cons(list($STRICT, before, after), disjuncts);
                                    } else {
                                        if (pcase_var.eql($SUCCESSOR)) {
                                            disjuncts = cons(list($WEAK, after, before), disjuncts);
                                            disjuncts = cons(list($SUCCESSOR_STRICT, before, after), disjuncts);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return disjuncts;
        }
    }

    public static SubLObject temporal_link_conjunction_negation(final SubLObject conjuncts) {
        SubLObject disjuncts = NIL;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject link_tag = conjunct.first();
            final SubLObject before = second(conjunct);
            final SubLObject after = third(conjunct);
            final SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                disjuncts = cons(list($STRICT, after, before), disjuncts);
            } else
                if (pcase_var.eql($STRICT)) {
                    disjuncts = cons(list($WEAK, after, before), disjuncts);
                } else
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        disjuncts = cons(list($SUCCESSOR_STRICT, after, before), disjuncts);
                    } else
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            disjuncts = cons(list($WEAK_SUCCESSOR, after, before), disjuncts);
                        } else
                            if (pcase_var.eql($COORDINATE)) {
                                disjuncts = cons(list($STRICT, after, before), disjuncts);
                                disjuncts = cons(list($STRICT, before, after), disjuncts);
                            } else
                                if (pcase_var.eql($SUCCESSOR)) {
                                    disjuncts = cons(list($WEAK, after, before), disjuncts);
                                    disjuncts = cons(list($SUCCESSOR_STRICT, before, after), disjuncts);
                                }





            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return disjuncts;
    }

    public static final SubLObject temporal_link_negation_alt(SubLObject link) {
        {
            SubLObject link_tag = link.first();
            SubLObject before = second(link);
            SubLObject after = third(link);
            SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                return list($STRICT, after, before);
            } else {
                if (pcase_var.eql($STRICT)) {
                    return list($WEAK, after, before);
                } else {
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        return list($SUCCESSOR_STRICT, after, before);
                    } else {
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            return list($WEAK_SUCCESSOR, after, before);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject temporal_link_negation(final SubLObject link) {
        final SubLObject link_tag = link.first();
        final SubLObject before = second(link);
        final SubLObject after = third(link);
        final SubLObject pcase_var = link_tag;
        if (pcase_var.eql($WEAK)) {
            return list($STRICT, after, before);
        }
        if (pcase_var.eql($STRICT)) {
            return list($WEAK, after, before);
        }
        if (pcase_var.eql($WEAK_SUCCESSOR)) {
            return list($SUCCESSOR_STRICT, after, before);
        }
        if (pcase_var.eql($SUCCESSOR_STRICT)) {
            return list($WEAK_SUCCESSOR, after, before);
        }
        return NIL;
    }

    public static final SubLObject adjust_temporal_quasi_link_to_existing_nodes_alt(SubLObject quasi_link) {
        {
            SubLObject link_tag = quasi_link.first();
            SubLObject before = second(quasi_link);
            SubLObject after = third(quasi_link);
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes(link_tag, before);
            if (NIL == link_before_half) {
                return NIL;
            }
            link_tag = link_before_half.first();
            before = second(link_before_half);
            {
                SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes(link_tag, after);
                if (NIL == link_after_half) {
                    return NIL;
                }
                link_tag = link_after_half.first();
                after = second(link_after_half);
                return list(link_tag, before, after);
            }
        }
    }

    public static SubLObject adjust_temporal_quasi_link_to_existing_nodes(final SubLObject quasi_link) {
        SubLObject link_tag = quasi_link.first();
        SubLObject before = second(quasi_link);
        SubLObject after = third(quasi_link);
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes(link_tag, before);
        if (NIL == link_before_half) {
            return NIL;
        }
        link_tag = link_before_half.first();
        before = second(link_before_half);
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes(link_tag, after);
        if (NIL == link_after_half) {
            return NIL;
        }
        link_tag = link_after_half.first();
        after = second(link_after_half);
        return list(link_tag, before, after);
    }

    public static final SubLObject adjust_quasi_link_before_half_to_existing_nodes_alt(SubLObject link_tag, SubLObject quasi_before) {
        {
            SubLObject before_tag = quasi_before.first();
            SubLObject before_time = second(quasi_before);
            SubLObject before = NIL;
            SubLObject date_adjusted_to_predecessorP = NIL;
            SubLObject date_adjusted_to_successorP = NIL;
            SubLObject date_adjusted_to_closest_existing_dateP = NIL;
            if (NIL != sbhl_time_dates.sbhl_date_p(before_time)) {
                {
                    SubLObject pcase_var = before_tag;
                    if (pcase_var.eql($START)) {
                        return list(link_tag, sbhl_time_utilities.hl_start(before_time));
                    } else {
                        if (pcase_var.eql($END)) {
                            return list(link_tag, sbhl_time_utilities.hl_end(before_time));
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = before_tag;
                if (pcase_var.eql($START)) {
                    before = sbhl_time_utilities.hl_start(before_time);
                    if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                        if (before_time.isInteger()) {
                            before = sbhl_time_utilities.hl_date_predecessor_of_start(before_time);
                            date_adjusted_to_predecessorP = T;
                            if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                                before = sbhl_time_utilities.hl_end(before_time);
                                date_adjusted_to_closest_existing_dateP = T;
                                if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                                    before = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.closest_existing_date_point_after(before_time);
                                }
                            }
                        } else {
                            before = sbhl_time_utilities.hl_end(before_time);
                        }
                    }
                } else {
                    if (pcase_var.eql($END)) {
                        before = sbhl_time_utilities.hl_end(before_time);
                        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                            if (before_time.isInteger()) {
                                before = sbhl_time_utilities.hl_date_successor_of_end(before_time);
                                date_adjusted_to_successorP = T;
                                if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                                    before = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.closest_existing_date_point_after(before_time);
                                    date_adjusted_to_closest_existing_dateP = T;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                return NIL;
            }
            if (NIL != date_adjusted_to_closest_existing_dateP) {
                {
                    SubLObject pcase_var = link_tag;
                    if (pcase_var.eql($WEAK)) {
                        link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
                    } else {
                        if (pcase_var.eql($STRICT)) {
                            link_tag = $WEAK_SUCCESSOR;
                        } else {
                            if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                link_tag = $WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
                            } else {
                                if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                    link_tag = $WEAK;
                                } else {
                                    if (pcase_var.eql($COORDINATE)) {
                                        return NIL;
                                    } else {
                                        if (pcase_var.eql($SUCCESSOR)) {
                                            return NIL;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (NIL != date_adjusted_to_predecessorP) {
                    {
                        SubLObject pcase_var = link_tag;
                        if (pcase_var.eql($WEAK)) {
                            link_tag = $STRICT;
                        } else {
                            if (pcase_var.eql($STRICT)) {
                                link_tag = $SUCCESSOR_STRICT;
                            } else {
                                if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                    link_tag = $WEAK;
                                } else {
                                    if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                        link_tag = $SUCCESSORS_SUCCESSOR_STRICT;
                                    } else {
                                        if (pcase_var.eql($COORDINATE)) {
                                            link_tag = $SUCCESSOR;
                                        } else {
                                            if (pcase_var.eql($SUCCESSOR)) {
                                                link_tag = $SUCCESSORS_SUCCESSOR;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != date_adjusted_to_successorP) {
                        {
                            SubLObject pcase_var = link_tag;
                            if (pcase_var.eql($WEAK)) {
                                link_tag = $WEAK_SUCCESSOR;
                            } else {
                                if (pcase_var.eql($STRICT)) {
                                    link_tag = $WEAK;
                                } else {
                                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                        link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
                                    } else {
                                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                            link_tag = $STRICT;
                                        } else {
                                            if (pcase_var.eql($COORDINATE)) {
                                                link_tag = $PREDECESSOR;
                                            } else {
                                                if (pcase_var.eql($SUCCESSOR)) {
                                                    link_tag = $COORDINATE;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return list(link_tag, before);
        }
    }

    public static SubLObject adjust_quasi_link_before_half_to_existing_nodes(SubLObject link_tag, final SubLObject quasi_before) {
        final SubLObject before_tag = quasi_before.first();
        final SubLObject before_time = second(quasi_before);
        SubLObject before = NIL;
        SubLObject date_adjusted_to_predecessorP = NIL;
        SubLObject date_adjusted_to_successorP = NIL;
        SubLObject date_adjusted_to_closest_existing_dateP = NIL;
        if (NIL != sbhl_time_dates.sbhl_date_p(before_time)) {
            final SubLObject pcase_var = before_tag;
            if (pcase_var.eql($START)) {
                return list(link_tag, sbhl_time_utilities.hl_start(before_time));
            }
            if (pcase_var.eql($END)) {
                return list(link_tag, sbhl_time_utilities.hl_end(before_time));
            }
        }
        SubLObject pcase_var = before_tag;
        if (pcase_var.eql($START)) {
            before = sbhl_time_utilities.hl_start(before_time);
            if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                if (before_time.isInteger()) {
                    before = sbhl_time_utilities.hl_date_predecessor_of_start(before_time);
                    date_adjusted_to_predecessorP = T;
                    if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                        before = sbhl_time_utilities.hl_end(before_time);
                        date_adjusted_to_closest_existing_dateP = T;
                        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                            before = closest_existing_date_point_after(before_time);
                        }
                    }
                } else {
                    before = sbhl_time_utilities.hl_end(before_time);
                }
            }
        } else
            if (pcase_var.eql($END)) {
                before = sbhl_time_utilities.hl_end(before_time);
                if ((NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) && before_time.isInteger()) {
                    before = sbhl_time_utilities.hl_date_successor_of_end(before_time);
                    date_adjusted_to_successorP = T;
                    if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                        before = closest_existing_date_point_after(before_time);
                        date_adjusted_to_closest_existing_dateP = T;
                    }
                }
            }

        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
            return NIL;
        }
        if (NIL != date_adjusted_to_closest_existing_dateP) {
            pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
            } else
                if (pcase_var.eql($STRICT)) {
                    link_tag = $WEAK_SUCCESSOR;
                } else
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        link_tag = $WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
                    } else
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            link_tag = $WEAK;
                        } else {
                            if (pcase_var.eql($COORDINATE)) {
                                return NIL;
                            }
                            if (pcase_var.eql($SUCCESSOR)) {
                                return NIL;
                            }
                        }



        } else
            if (NIL != date_adjusted_to_predecessorP) {
                pcase_var = link_tag;
                if (pcase_var.eql($WEAK)) {
                    link_tag = $STRICT;
                } else
                    if (pcase_var.eql($STRICT)) {
                        link_tag = $SUCCESSOR_STRICT;
                    } else
                        if (pcase_var.eql($WEAK_SUCCESSOR)) {
                            link_tag = $WEAK;
                        } else
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                link_tag = $SUCCESSORS_SUCCESSOR_STRICT;
                            } else
                                if (pcase_var.eql($COORDINATE)) {
                                    link_tag = $SUCCESSOR;
                                } else
                                    if (pcase_var.eql($SUCCESSOR)) {
                                        link_tag = $SUCCESSORS_SUCCESSOR;
                                    }





            } else
                if (NIL != date_adjusted_to_successorP) {
                    pcase_var = link_tag;
                    if (pcase_var.eql($WEAK)) {
                        link_tag = $WEAK_SUCCESSOR;
                    } else
                        if (pcase_var.eql($STRICT)) {
                            link_tag = $WEAK;
                        } else
                            if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
                            } else
                                if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                    link_tag = $STRICT;
                                } else
                                    if (pcase_var.eql($COORDINATE)) {
                                        link_tag = $PREDECESSOR;
                                    } else
                                        if (pcase_var.eql($SUCCESSOR)) {
                                            link_tag = $COORDINATE;
                                        }





                }


        return list(link_tag, before);
    }

    public static final SubLObject adjust_quasi_link_after_half_to_existing_nodes_alt(SubLObject link_tag, SubLObject quasi_after) {
        {
            SubLObject after_tag = quasi_after.first();
            SubLObject after_time = second(quasi_after);
            SubLObject after = NIL;
            SubLObject date_adjusted_to_predecessorP = NIL;
            SubLObject date_adjusted_to_successorP = NIL;
            SubLObject date_adjusted_to_closest_existing_dateP = NIL;
            if (NIL != sbhl_time_dates.sbhl_date_p(after_time)) {
                {
                    SubLObject pcase_var = after_tag;
                    if (pcase_var.eql($START)) {
                        return list(link_tag, sbhl_time_utilities.hl_start(after_time));
                    } else {
                        if (pcase_var.eql($END)) {
                            return list(link_tag, sbhl_time_utilities.hl_end(after_time));
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = after_tag;
                if (pcase_var.eql($START)) {
                    after = sbhl_time_utilities.hl_start(after_time);
                    if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                        if (after_time.isInteger()) {
                            after = sbhl_time_utilities.hl_date_predecessor_of_start(after_time);
                            date_adjusted_to_predecessorP = T;
                            if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                                after = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.closest_existing_date_point_before(after_time);
                                date_adjusted_to_closest_existing_dateP = T;
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($END)) {
                        after = sbhl_time_utilities.hl_end(after_time);
                        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                            if (after_time.isInteger()) {
                                after = sbhl_time_utilities.hl_date_successor_of_end(after_time);
                                date_adjusted_to_successorP = T;
                                if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                                    after = sbhl_time_utilities.hl_start(after_time);
                                    date_adjusted_to_closest_existing_dateP = T;
                                    if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                                        after = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.closest_existing_date_point_before(after_time);
                                    }
                                }
                            } else {
                                after = sbhl_time_utilities.hl_start(after_time);
                            }
                        }
                    }
                }
            }
            if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                return NIL;
            }
            if (NIL != date_adjusted_to_closest_existing_dateP) {
                {
                    SubLObject pcase_var = link_tag;
                    if (pcase_var.eql($WEAK)) {
                        link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
                    } else {
                        if (pcase_var.eql($STRICT)) {
                            link_tag = $WEAK_SUCCESSOR;
                        } else {
                            if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                link_tag = $WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
                            } else {
                                if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                    link_tag = $WEAK;
                                } else {
                                    if (pcase_var.eql($COORDINATE)) {
                                        return NIL;
                                    } else {
                                        if (pcase_var.eql($SUCCESSOR)) {
                                            return NIL;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (NIL != date_adjusted_to_predecessorP) {
                    {
                        SubLObject pcase_var = link_tag;
                        if (pcase_var.eql($WEAK)) {
                            link_tag = $WEAK_SUCCESSOR;
                        } else {
                            if (pcase_var.eql($STRICT)) {
                                link_tag = $WEAK;
                            } else {
                                if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                    link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
                                } else {
                                    if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                        link_tag = $STRICT;
                                    } else {
                                        if (pcase_var.eql($COORDINATE)) {
                                            link_tag = $PREDECESSOR;
                                        } else {
                                            if (pcase_var.eql($SUCCESSOR)) {
                                                link_tag = $COORDINATE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != date_adjusted_to_successorP) {
                        {
                            SubLObject pcase_var = link_tag;
                            if (pcase_var.eql($WEAK)) {
                                link_tag = $STRICT;
                            } else {
                                if (pcase_var.eql($STRICT)) {
                                    link_tag = $SUCCESSOR_STRICT;
                                } else {
                                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                        link_tag = $WEAK;
                                    } else {
                                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                            link_tag = $SUCCESSORS_SUCCESSOR_STRICT;
                                        } else {
                                            if (pcase_var.eql($COORDINATE)) {
                                                link_tag = $SUCCESSOR;
                                            } else {
                                                if (pcase_var.eql($SUCCESSOR)) {
                                                    link_tag = $SUCCESSORS_SUCCESSOR;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return list(link_tag, after);
        }
    }

    public static SubLObject adjust_quasi_link_after_half_to_existing_nodes(SubLObject link_tag, final SubLObject quasi_after) {
        final SubLObject after_tag = quasi_after.first();
        final SubLObject after_time = second(quasi_after);
        SubLObject after = NIL;
        SubLObject date_adjusted_to_predecessorP = NIL;
        SubLObject date_adjusted_to_successorP = NIL;
        SubLObject date_adjusted_to_closest_existing_dateP = NIL;
        if (NIL != sbhl_time_dates.sbhl_date_p(after_time)) {
            final SubLObject pcase_var = after_tag;
            if (pcase_var.eql($START)) {
                return list(link_tag, sbhl_time_utilities.hl_start(after_time));
            }
            if (pcase_var.eql($END)) {
                return list(link_tag, sbhl_time_utilities.hl_end(after_time));
            }
        }
        SubLObject pcase_var = after_tag;
        if (pcase_var.eql($START)) {
            after = sbhl_time_utilities.hl_start(after_time);
            if ((NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) && after_time.isInteger()) {
                after = sbhl_time_utilities.hl_date_predecessor_of_start(after_time);
                date_adjusted_to_predecessorP = T;
                if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                    after = closest_existing_date_point_before(after_time);
                    date_adjusted_to_closest_existing_dateP = T;
                }
            }
        } else
            if (pcase_var.eql($END)) {
                after = sbhl_time_utilities.hl_end(after_time);
                if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                    if (after_time.isInteger()) {
                        after = sbhl_time_utilities.hl_date_successor_of_end(after_time);
                        date_adjusted_to_successorP = T;
                        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                            after = sbhl_time_utilities.hl_start(after_time);
                            date_adjusted_to_closest_existing_dateP = T;
                            if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                                after = closest_existing_date_point_before(after_time);
                            }
                        }
                    } else {
                        after = sbhl_time_utilities.hl_start(after_time);
                    }
                }
            }

        if (NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
            return NIL;
        }
        if (NIL != date_adjusted_to_closest_existing_dateP) {
            pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
            } else
                if (pcase_var.eql($STRICT)) {
                    link_tag = $WEAK_SUCCESSOR;
                } else
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        link_tag = $WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
                    } else
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            link_tag = $WEAK;
                        } else {
                            if (pcase_var.eql($COORDINATE)) {
                                return NIL;
                            }
                            if (pcase_var.eql($SUCCESSOR)) {
                                return NIL;
                            }
                        }



        } else
            if (NIL != date_adjusted_to_predecessorP) {
                pcase_var = link_tag;
                if (pcase_var.eql($WEAK)) {
                    link_tag = $WEAK_SUCCESSOR;
                } else
                    if (pcase_var.eql($STRICT)) {
                        link_tag = $WEAK;
                    } else
                        if (pcase_var.eql($WEAK_SUCCESSOR)) {
                            link_tag = $WEAK_SUCCESSORS_SUCCESSOR;
                        } else
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                link_tag = $STRICT;
                            } else
                                if (pcase_var.eql($COORDINATE)) {
                                    link_tag = $PREDECESSOR;
                                } else
                                    if (pcase_var.eql($SUCCESSOR)) {
                                        link_tag = $COORDINATE;
                                    }





            } else
                if (NIL != date_adjusted_to_successorP) {
                    pcase_var = link_tag;
                    if (pcase_var.eql($WEAK)) {
                        link_tag = $STRICT;
                    } else
                        if (pcase_var.eql($STRICT)) {
                            link_tag = $SUCCESSOR_STRICT;
                        } else
                            if (pcase_var.eql($WEAK_SUCCESSOR)) {
                                link_tag = $WEAK;
                            } else
                                if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                    link_tag = $SUCCESSORS_SUCCESSOR_STRICT;
                                } else
                                    if (pcase_var.eql($COORDINATE)) {
                                        link_tag = $SUCCESSOR;
                                    } else
                                        if (pcase_var.eql($SUCCESSOR)) {
                                            link_tag = $SUCCESSORS_SUCCESSOR;
                                        }





                }


        return list(link_tag, after);
    }

    public static final SubLObject adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes_alt(SubLObject quasi_link) {
        {
            SubLObject link_tag = quasi_link.first();
            SubLObject before = second(quasi_link);
            SubLObject after = third(quasi_link);
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes(link_tag, before);
            if (NIL == link_before_half) {
                return NIL;
            }
            link_tag = link_before_half.first();
            before = second(link_before_half);
            {
                SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes(link_tag, after);
                if (NIL == link_after_half) {
                    return NIL;
                }
                link_tag = link_after_half.first();
                after = second(link_after_half);
                return list(link_tag, before, after);
            }
        }
    }

    public static SubLObject adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(final SubLObject quasi_link) {
        SubLObject link_tag = quasi_link.first();
        SubLObject before = second(quasi_link);
        SubLObject after = third(quasi_link);
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes(link_tag, before);
        if (NIL == link_before_half) {
            return NIL;
        }
        link_tag = link_before_half.first();
        before = second(link_before_half);
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes(link_tag, after);
        if (NIL == link_after_half) {
            return NIL;
        }
        link_tag = link_after_half.first();
        after = second(link_after_half);
        return list(link_tag, before, after);
    }

    public static final SubLObject adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes_alt(SubLObject link_tag, SubLObject quasi_before) {
        {
            SubLObject before_tag = quasi_before.first();
            SubLObject before_time = second(quasi_before);
            SubLObject before = NIL;
            SubLObject pcase_var = before_tag;
            if (pcase_var.eql($START)) {
                before = sbhl_time_utilities.hl_start(before_time);
            } else {
                if (pcase_var.eql($END)) {
                    before = sbhl_time_utilities.hl_end(before_time);
                }
            }
            return NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(before) ? ((SubLObject) (list(link_tag, before))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes(link_tag, quasi_before);
        }
    }

    public static SubLObject adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes(final SubLObject link_tag, final SubLObject quasi_before) {
        final SubLObject before_tag = quasi_before.first();
        final SubLObject before_time = second(quasi_before);
        SubLObject before = NIL;
        final SubLObject pcase_var = before_tag;
        if (pcase_var.eql($START)) {
            before = sbhl_time_utilities.hl_start(before_time);
        } else
            if (pcase_var.eql($END)) {
                before = sbhl_time_utilities.hl_end(before_time);
            }

        return NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(before) ? list(link_tag, before) : adjust_quasi_link_before_half_to_existing_nodes(link_tag, quasi_before);
    }

    public static final SubLObject adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes_alt(SubLObject link_tag, SubLObject quasi_after) {
        {
            SubLObject after_tag = quasi_after.first();
            SubLObject after_time = second(quasi_after);
            SubLObject after = NIL;
            SubLObject pcase_var = after_tag;
            if (pcase_var.eql($START)) {
                after = sbhl_time_utilities.hl_start(after_time);
            } else {
                if (pcase_var.eql($END)) {
                    after = sbhl_time_utilities.hl_end(after_time);
                }
            }
            return NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(after) ? ((SubLObject) (list(link_tag, after))) : com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes(link_tag, quasi_after);
        }
    }

    public static SubLObject adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes(final SubLObject link_tag, final SubLObject quasi_after) {
        final SubLObject after_tag = quasi_after.first();
        final SubLObject after_time = second(quasi_after);
        SubLObject after = NIL;
        final SubLObject pcase_var = after_tag;
        if (pcase_var.eql($START)) {
            after = sbhl_time_utilities.hl_start(after_time);
        } else
            if (pcase_var.eql($END)) {
                after = sbhl_time_utilities.hl_end(after_time);
            }

        return NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(after) ? list(link_tag, after) : adjust_quasi_link_after_half_to_existing_nodes(link_tag, quasi_after);
    }

    public static final SubLObject closest_existing_date_point_before_alt(SubLObject eu_date) {
        {
            SubLObject eu_date_before = NIL;
            SubLObject date_point_before = NIL;
            SubLObject doneP = NIL;
            if ((NIL != sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()) && eu_date.numG(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue().first())) {
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue();
                        SubLObject existing_eu_date = NIL;
                        for (existing_eu_date = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , existing_eu_date = csome_list_var.first()) {
                            if (eu_date.numLE(existing_eu_date)) {
                                doneP = T;
                            } else {
                                eu_date_before = existing_eu_date;
                            }
                        }
                    }
                }
                if (NIL != eu_date_before) {
                    date_point_before = sbhl_time_utilities.hl_end(eu_date_before);
                    if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_before)) {
                        return date_point_before;
                    } else {
                        date_point_before = sbhl_time_utilities.hl_start(eu_date_before);
                        if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_before)) {
                            return date_point_before;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject closest_existing_date_point_before(final SubLObject eu_date) {
        SubLObject eu_date_before = NIL;
        SubLObject date_point_before = NIL;
        SubLObject doneP = NIL;
        if ((NIL != sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()) && eu_date.numG(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue().first())) {
            if (NIL == doneP) {
                SubLObject csome_list_var = sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue();
                SubLObject existing_eu_date = NIL;
                existing_eu_date = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (eu_date.numLE(existing_eu_date)) {
                        doneP = T;
                    } else {
                        eu_date_before = existing_eu_date;
                    }
                    csome_list_var = csome_list_var.rest();
                    existing_eu_date = csome_list_var.first();
                } 
            }
            if (NIL != eu_date_before) {
                date_point_before = sbhl_time_utilities.hl_end(eu_date_before);
                if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_before)) {
                    return date_point_before;
                }
                date_point_before = sbhl_time_utilities.hl_start(eu_date_before);
                if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_before)) {
                    return date_point_before;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject closest_existing_date_point_after_alt(SubLObject eu_date) {
        {
            SubLObject eu_date_after = NIL;
            SubLObject date_point_after = NIL;
            if (NIL == eu_date_after) {
                {
                    SubLObject csome_list_var = sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue();
                    SubLObject existing_eu_date = NIL;
                    for (existing_eu_date = csome_list_var.first(); !((NIL != eu_date_after) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , existing_eu_date = csome_list_var.first()) {
                        if (eu_date.numL(existing_eu_date)) {
                            eu_date_after = existing_eu_date;
                        }
                    }
                }
            }
            if (NIL != eu_date_after) {
                date_point_after = sbhl_time_utilities.hl_start(eu_date_after);
                if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_after)) {
                    return date_point_after;
                } else {
                    date_point_after = sbhl_time_utilities.hl_end(eu_date_after);
                    if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_after)) {
                        return date_point_after;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject closest_existing_date_point_after(final SubLObject eu_date) {
        SubLObject eu_date_after = NIL;
        SubLObject date_point_after = NIL;
        if (NIL == eu_date_after) {
            SubLObject csome_list_var = sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue();
            SubLObject existing_eu_date = NIL;
            existing_eu_date = csome_list_var.first();
            while ((NIL == eu_date_after) && (NIL != csome_list_var)) {
                if (eu_date.numL(existing_eu_date)) {
                    eu_date_after = existing_eu_date;
                }
                csome_list_var = csome_list_var.rest();
                existing_eu_date = csome_list_var.first();
            } 
        }
        if (NIL != eu_date_after) {
            date_point_after = sbhl_time_utilities.hl_start(eu_date_after);
            if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_after)) {
                return date_point_after;
            }
            date_point_after = sbhl_time_utilities.hl_end(eu_date_after);
            if (NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_after)) {
                return date_point_after;
            }
        }
        return NIL;
    }

    public static final SubLObject true_temporal_quasi_linkP_alt(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject before_tag = before.first();
            SubLObject before_time = second(before);
            SubLObject after_tag = after.first();
            SubLObject after_time = second(after);
            if (before_time.isInteger() && after_time.isInteger()) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_date_date_quasi_linkP(link_tag, before, after);
            } else {
                if ((before_time.equal(after_time) && ((link_tag == $WEAK) || (link_tag == $WEAK_SUCCESSOR))) && ((after_tag == $END) || ((before_tag == $START) && (after_tag == $START)))) {
                    return T;
                } else {
                    if ((before_time.equal(after_time) && (link_tag == $COORDINATE)) && (((before_tag == $START) && (after_tag == $START)) || ((before_tag == $END) && (after_tag == $END)))) {
                        return T;
                    } else {
                        {
                            SubLObject quasi_link = list(link_tag, before, after);
                            SubLObject link = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_temporal_quasi_link_to_existing_nodes(quasi_link);
                            if (NIL == link) {
                                return NIL;
                            }
                            link_tag = link.first();
                            before = second(link);
                            after = third(link);
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_linkP(link_tag, before, after, mt);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject true_temporal_quasi_linkP(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject before_tag = before.first();
        final SubLObject before_time = second(before);
        final SubLObject after_tag = after.first();
        final SubLObject after_time = second(after);
        if (before_time.isInteger() && after_time.isInteger()) {
            return true_date_date_quasi_linkP(link_tag, before, after);
        }
        if ((before_time.equal(after_time) && ((link_tag == $WEAK) || (link_tag == $WEAK_SUCCESSOR))) && ((after_tag == $END) || ((before_tag == $START) && (after_tag == $START)))) {
            return T;
        }
        if ((before_time.equal(after_time) && (link_tag == $COORDINATE)) && (((before_tag == $START) && (after_tag == $START)) || ((before_tag == $END) && (after_tag == $END)))) {
            return T;
        }
        final SubLObject quasi_link = list(link_tag, before, after);
        final SubLObject link = adjust_temporal_quasi_link_to_existing_nodes(quasi_link);
        if (NIL == link) {
            return NIL;
        }
        link_tag = link.first();
        before = second(link);
        after = third(link);
        return true_temporal_linkP(link_tag, before, after, mt);
    }

    public static final SubLObject date_date_quasi_link_p_alt(SubLObject quasi_link) {
        {
            SubLObject before = second(quasi_link);
            SubLObject before_time = second(before);
            SubLObject after = third(quasi_link);
            SubLObject after_time = second(after);
            return makeBoolean(before_time.isInteger() && after_time.isInteger());
        }
    }

    public static SubLObject date_date_quasi_link_p(final SubLObject quasi_link) {
        final SubLObject before = second(quasi_link);
        final SubLObject before_time = second(before);
        final SubLObject after = third(quasi_link);
        final SubLObject after_time = second(after);
        return makeBoolean(before_time.isInteger() && after_time.isInteger());
    }

    public static final SubLObject true_date_date_quasi_linkP_alt(SubLObject link_tag, SubLObject before, SubLObject after) {
        {
            SubLObject before_tag = before.first();
            SubLObject before_time = second(before);
            SubLObject after_tag = after.first();
            SubLObject after_time = second(after);
            SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                return makeBoolean(before_time.numL(after_time) || (before_time.numE(after_time) && ((before_tag == $START) || (after_tag == $END))));
            } else {
                if (pcase_var.eql($STRICT)) {
                    return makeBoolean(before_time.numL(after_time) || ((before_time.numE(after_time) && (before_tag == $START)) && (after_tag == $END)));
                } else {
                    if (pcase_var.eql($COORDINATE)) {
                        return makeBoolean(before_time.numE(after_time) && (before_tag == after_tag));
                    } else {
                        if (pcase_var.eql($SUCCESSOR)) {
                            return makeBoolean(((before_tag == $END) && (after_tag == $START)) && numeric_date_utilities.succeeding_extended_universal_date(before_time).numE(after_time));
                        } else {
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                return makeBoolean(((before_time.numL(after_time) && ((before_tag == $START) || (after_tag == $END))) || ((before_time.numE(after_time) && (before_tag == $START)) && (after_tag == $END))) || numeric_date_utilities.succeeding_extended_universal_date(before_time).numL(after_time));
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject true_date_date_quasi_linkP(final SubLObject link_tag, final SubLObject before, final SubLObject after) {
        final SubLObject before_tag = before.first();
        final SubLObject before_time = second(before);
        final SubLObject after_tag = after.first();
        final SubLObject after_time = second(after);
        if (link_tag.eql($WEAK)) {
            return makeBoolean(before_time.numL(after_time) || (before_time.numE(after_time) && ((before_tag == $START) || (after_tag == $END))));
        }
        if (link_tag.eql($STRICT)) {
            return makeBoolean(before_time.numL(after_time) || ((before_time.numE(after_time) && (before_tag == $START)) && (after_tag == $END)));
        }
        if (link_tag.eql($COORDINATE)) {
            return makeBoolean(before_time.numE(after_time) && before_tag.eql(after_tag));
        }
        if (link_tag.eql($SUCCESSOR)) {
            return makeBoolean(((before_tag == $END) && (after_tag == $START)) && numeric_date_utilities.succeeding_extended_universal_date(before_time).numE(after_time));
        }
        if (link_tag.eql($SUCCESSOR_STRICT)) {
            return makeBoolean(((before_time.numL(after_time) && ((before_tag == $START) || (after_tag == $END))) || ((before_time.numE(after_time) && (before_tag == $START)) && (after_tag == $END))) || numeric_date_utilities.succeeding_extended_universal_date(before_time).numL(after_time));
        }
        return NIL;
    }

    public static final SubLObject true_temporal_linkP_alt(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                return sbhl_time_search.weakly_precedesP(before, after, mt);
            } else {
                if (pcase_var.eql($STRICT)) {
                    return sbhl_time_search.strictly_precedesP(before, after, mt);
                } else {
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        return sbhl_time_search.weakly_precedes_successorP(before, after, mt);
                    } else {
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            return sbhl_time_search.successor_strictly_precedesP(before, after, mt);
                        } else {
                            if (pcase_var.eql($COORDINATE)) {
                                return sbhl_time_search.coordinateP(before, after, mt);
                            } else {
                                if (pcase_var.eql($SUCCESSOR)) {
                                    return sbhl_time_search.successorP(before, after, mt);
                                } else {
                                    if (pcase_var.eql($PREDECESSOR)) {
                                        return sbhl_time_search.predecessorP(before, after, mt);
                                    } else {
                                        if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                                            return sbhl_time_search.weakly_precedes_successors_successorP(before, after, mt);
                                        } else {
                                            if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR)) {
                                                return sbhl_time_search.weakly_precedes_successors_successors_successorP(before, after, mt);
                                            } else {
                                                if (pcase_var.eql($SUCCESSORS_SUCCESSOR)) {
                                                    return sbhl_time_search.successors_successorP(before, after, mt);
                                                } else {
                                                    if (pcase_var.eql($SUCCESSORS_SUCCESSOR_STRICT)) {
                                                        return sbhl_time_search.successors_successor_strictly_precedesP(before, after, mt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject true_temporal_linkP(final SubLObject link_tag, final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (link_tag.eql($WEAK)) {
            return sbhl_time_search.weakly_precedesP(before, after, mt);
        }
        if (link_tag.eql($STRICT)) {
            return sbhl_time_search.strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSOR)) {
            return sbhl_time_search.weakly_precedes_successorP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSOR_STRICT)) {
            return sbhl_time_search.successor_strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql($COORDINATE)) {
            return sbhl_time_search.coordinateP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSOR)) {
            return sbhl_time_search.successorP(before, after, mt);
        }
        if (link_tag.eql($PREDECESSOR)) {
            return sbhl_time_search.predecessorP(before, after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.weakly_precedes_successors_successorP(before, after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR)) {
            return sbhl_time_search.weakly_precedes_successors_successors_successorP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.successors_successorP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSORS_SUCCESSOR_STRICT)) {
            return sbhl_time_search.successors_successor_strictly_precedesP(before, after, mt);
        }
        return NIL;
    }

    public static final SubLObject add_temporal_link_disjunction_consequents_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread).isHashtable()) {
                sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.setDynamicValue(make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED), thread);
            }
            {
                SubLObject link_addedP = NIL;
                if (NIL == link_addedP) {
                    {
                        SubLObject catch_var = NIL;
                        try {
                            {
                                SubLObject link_disjunction = NIL;
                                SubLObject supports = NIL;
                                {
                                    final Iterator cdohash_iterator = getEntrySetIterator(sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            link_disjunction = getEntryKey(cdohash_entry);
                                            supports = getEntryValue(cdohash_entry);
                                            subl_macros.do_hash_table_done_check(link_addedP);
                                            {
                                                SubLObject disjuncts = link_disjunction.first();
                                                SubLObject link_disjunction_mt = second(link_disjunction);
                                                SubLObject consequent = NIL;
                                                if (NIL == gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), UNPROVIDED)) {
                                                    if (NIL != genl_mts.genl_mtP(mt, link_disjunction_mt, UNPROVIDED, UNPROVIDED)) {
                                                        consequent = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.determine_temporal_link_disjunction_consequent(disjuncts, mt);
                                                        if (NIL != consequent) {
                                                            sethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), consequent);
                                                            {
                                                                SubLObject link_tag = consequent.first();
                                                                SubLObject before = sbhl_time_assertion_processing.find_or_create_hl_temporal_point(second(consequent));
                                                                SubLObject after = sbhl_time_assertion_processing.find_or_create_hl_temporal_point(third(consequent));
                                                                link_addedP = sbhl_time_assertion_processing.add_temporal_link(link_disjunction, link_tag, before, after, mt);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
                        }
                    }
                }
                if (NIL != link_addedP) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                }
            }
            return NIL;
        }
    }

    public static SubLObject add_temporal_link_disjunction_consequents(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread).isHashtable()) {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.setDynamicValue(make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED), thread);
        }
        SubLObject link_addedP = NIL;
        if (NIL == link_addedP) {
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($DO_HASH_TABLE);
                SubLObject link_disjunction = NIL;
                SubLObject supports = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        link_disjunction = getEntryKey(cdohash_entry);
                        supports = getEntryValue(cdohash_entry);
                        subl_macros.do_hash_table_done_check(link_addedP);
                        final SubLObject disjuncts = link_disjunction.first();
                        final SubLObject link_disjunction_mt = second(link_disjunction);
                        SubLObject consequent = NIL;
                        if ((NIL == gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), UNPROVIDED)) && (NIL != genl_mts.genl_mtP(mt, link_disjunction_mt, UNPROVIDED, UNPROVIDED))) {
                            consequent = determine_temporal_link_disjunction_consequent(disjuncts, mt);
                            if (NIL == consequent) {
                                continue;
                            }
                            sethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), consequent);
                            final SubLObject link_tag = consequent.first();
                            final SubLObject before = sbhl_time_assertion_processing.find_or_create_hl_temporal_point(second(consequent));
                            final SubLObject after = sbhl_time_assertion_processing.find_or_create_hl_temporal_point(third(consequent));
                            link_addedP = sbhl_time_assertion_processing.add_temporal_link(link_disjunction, link_tag, before, after, mt);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $DO_HASH_TABLE);
            } finally {
                thread.throwStack.pop();
            }
        }
        if (NIL != link_addedP) {
            add_temporal_link_disjunction_consequents(mt);
        }
        return NIL;
    }

    public static final SubLObject remove_temporal_link_disjunction_consequents_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread).isHashtable()) {
                {
                    SubLObject cdohash_table = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread);
                    SubLObject link_disjunction = NIL;
                    SubLObject consequent = NIL;
                    {
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                link_disjunction = getEntryKey(cdohash_entry);
                                consequent = getEntryValue(cdohash_entry);
                                {
                                    SubLObject link_tag = consequent.first();
                                    SubLObject before = sbhl_time_assertion_processing.find_hl_temporal_point(second(consequent));
                                    SubLObject after = sbhl_time_assertion_processing.find_hl_temporal_point(third(consequent));
                                    sbhl_time_assertion_processing.remove_temporal_link(link_disjunction, link_tag, before, after, mt);
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject remove_temporal_link_disjunction_consequents(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread).isHashtable()) {
            final SubLObject cdohash_table = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread);
            SubLObject link_disjunction = NIL;
            SubLObject consequent = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    link_disjunction = getEntryKey(cdohash_entry);
                    consequent = getEntryValue(cdohash_entry);
                    final SubLObject link_tag = consequent.first();
                    final SubLObject before = sbhl_time_assertion_processing.find_hl_temporal_point(second(consequent));
                    final SubLObject after = sbhl_time_assertion_processing.find_hl_temporal_point(third(consequent));
                    sbhl_time_assertion_processing.remove_temporal_link(link_disjunction, link_tag, before, after, mt);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return NIL;
    }

    public static final SubLObject determine_temporal_link_disjunction_consequent_alt(SubLObject disjuncts, SubLObject mt) {
        {
            SubLObject consequent = NIL;
            SubLObject cdolist_list_var = disjuncts;
            SubLObject disjunct = NIL;
            for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                {
                    SubLObject negation = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.temporal_link_negation(disjunct);
                    SubLObject negation_link_tag = negation.first();
                    SubLObject negation_before = second(negation);
                    SubLObject negation_after = third(negation);
                    if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_quasi_linkP(negation_link_tag, negation_before, negation_after, mt)) {
                        if (NIL != consequent) {
                            return NIL;
                        } else {
                            consequent = disjunct;
                        }
                    }
                }
            }
            if (NIL != consequent) {
                {
                    SubLObject link_tag = consequent.first();
                    SubLObject before = second(consequent);
                    SubLObject after = third(consequent);
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.true_temporal_quasi_linkP(link_tag, before, after, mt)) {
                        consequent = NIL;
                    }
                }
            }
            return consequent;
        }
    }

    public static SubLObject determine_temporal_link_disjunction_consequent(final SubLObject disjuncts, final SubLObject mt) {
        SubLObject consequent = NIL;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject disjunct = NIL;
        disjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject negation = temporal_link_negation(disjunct);
            final SubLObject negation_link_tag = negation.first();
            final SubLObject negation_before = second(negation);
            final SubLObject negation_after = third(negation);
            if (NIL == true_temporal_quasi_linkP(negation_link_tag, negation_before, negation_after, mt)) {
                if (NIL != consequent) {
                    return NIL;
                }
                consequent = disjunct;
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        } 
        if (NIL != consequent) {
            final SubLObject link_tag = consequent.first();
            final SubLObject before = second(consequent);
            final SubLObject after = third(consequent);
            if (NIL != true_temporal_quasi_linkP(link_tag, before, after, mt)) {
                consequent = NIL;
            }
        }
        return consequent;
    }

    public static final SubLObject all_weakly_before_quasi_link_alt(SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes($WEAK, quasi_after);
            SubLObject link_tag = link_after_half.first();
            SubLObject after = second(link_after_half);
            return NIL != link_after_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_before(link_tag, after, mt))) : NIL;
        }
    }

    public static SubLObject all_weakly_before_quasi_link(final SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes($WEAK, quasi_after);
        final SubLObject link_tag = link_after_half.first();
        final SubLObject after = second(link_after_half);
        return NIL != link_after_half ? all_temporal_link_before(link_tag, after, mt) : NIL;
    }

    public static final SubLObject all_weakly_after_quasi_link_alt(SubLObject quasi_before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes($WEAK, quasi_before);
            SubLObject link_tag = link_before_half.first();
            SubLObject before = second(link_before_half);
            return NIL != link_before_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_after(link_tag, before, mt))) : NIL;
        }
    }

    public static SubLObject all_weakly_after_quasi_link(final SubLObject quasi_before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes($WEAK, quasi_before);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = second(link_before_half);
        return NIL != link_before_half ? all_temporal_link_after(link_tag, before, mt) : NIL;
    }

    public static final SubLObject all_strictly_before_quasi_link_alt(SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes($STRICT, quasi_after);
            SubLObject link_tag = link_after_half.first();
            SubLObject after = second(link_after_half);
            return NIL != link_after_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_before(link_tag, after, mt))) : NIL;
        }
    }

    public static SubLObject all_strictly_before_quasi_link(final SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes($STRICT, quasi_after);
        final SubLObject link_tag = link_after_half.first();
        final SubLObject after = second(link_after_half);
        return NIL != link_after_half ? all_temporal_link_before(link_tag, after, mt) : NIL;
    }

    public static final SubLObject all_strictly_after_quasi_link_alt(SubLObject quasi_before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes($STRICT, quasi_before);
            SubLObject link_tag = link_before_half.first();
            SubLObject before = second(link_before_half);
            return NIL != link_before_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_after(link_tag, before, mt))) : NIL;
        }
    }

    public static SubLObject all_strictly_after_quasi_link(final SubLObject quasi_before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes($STRICT, quasi_before);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = second(link_before_half);
        return NIL != link_before_half ? all_temporal_link_after(link_tag, before, mt) : NIL;
    }

    public static final SubLObject all_coordinate_quasi_link_alt(SubLObject quasi_link, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes($COORDINATE, quasi_link);
            SubLObject link_tag = link_before_half.first();
            SubLObject before = second(link_before_half);
            return NIL != link_before_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_after(link_tag, before, mt))) : NIL;
        }
    }

    public static SubLObject all_coordinate_quasi_link(final SubLObject quasi_link, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes($COORDINATE, quasi_link);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = second(link_before_half);
        return NIL != link_before_half ? all_temporal_link_after(link_tag, before, mt) : NIL;
    }

    public static final SubLObject all_successors_quasi_link_alt(SubLObject quasi_before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes($SUCCESSOR, quasi_before);
            SubLObject link_tag = link_before_half.first();
            SubLObject before = second(link_before_half);
            return NIL != link_before_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_after(link_tag, before, mt))) : NIL;
        }
    }

    public static SubLObject all_successors_quasi_link(final SubLObject quasi_before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes($SUCCESSOR, quasi_before);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = second(link_before_half);
        return NIL != link_before_half ? all_temporal_link_after(link_tag, before, mt) : NIL;
    }

    public static final SubLObject all_predecessors_quasi_link_alt(SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes($SUCCESSOR, quasi_after);
            SubLObject link_tag = link_after_half.first();
            SubLObject after = second(link_after_half);
            return NIL != link_after_half ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_before(link_tag, after, mt))) : NIL;
        }
    }

    public static SubLObject all_predecessors_quasi_link(final SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes($SUCCESSOR, quasi_after);
        final SubLObject link_tag = link_after_half.first();
        final SubLObject after = second(link_after_half);
        return NIL != link_after_half ? all_temporal_link_before(link_tag, after, mt) : NIL;
    }

    public static final SubLObject all_temporal_link_before_alt(SubLObject link_tag, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                return sbhl_time_search.all_weakly_precedes_inverse(after, mt);
            } else {
                if (pcase_var.eql($STRICT)) {
                    return sbhl_time_search.all_strictly_precedes_inverse(after, mt);
                } else {
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        return sbhl_time_search.all_weakly_precedes_successor_inverse(after, mt);
                    } else {
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            return sbhl_time_search.all_successor_strictly_precedes_inverse(after, mt);
                        } else {
                            if (pcase_var.eql($COORDINATE)) {
                                return sbhl_time_search.all_coordinate(after, mt);
                            } else {
                                if (pcase_var.eql($SUCCESSOR)) {
                                    return sbhl_time_search.all_predecessors(after, mt);
                                } else {
                                    if (pcase_var.eql($PREDECESSOR)) {
                                        return sbhl_time_search.all_successors(after, mt);
                                    } else {
                                        if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                                            return sbhl_time_search.all_weakly_precedes_successors_successor_inverse(after, mt);
                                        } else {
                                            if (pcase_var.eql($SUCCESSORS_SUCCESSOR)) {
                                                return sbhl_time_search.all_predecessors_predecessors(after, mt);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject all_temporal_link_before(final SubLObject link_tag, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (link_tag.eql($WEAK)) {
            return sbhl_time_search.all_weakly_precedes_inverse(after, mt);
        }
        if (link_tag.eql($STRICT)) {
            return sbhl_time_search.all_strictly_precedes_inverse(after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successor_inverse(after, mt);
        }
        if (link_tag.eql($SUCCESSOR_STRICT)) {
            return sbhl_time_search.all_successor_strictly_precedes_inverse(after, mt);
        }
        if (link_tag.eql($COORDINATE)) {
            return sbhl_time_search.all_coordinate(after, mt);
        }
        if (link_tag.eql($SUCCESSOR)) {
            return sbhl_time_search.all_predecessors(after, mt);
        }
        if (link_tag.eql($PREDECESSOR)) {
            return sbhl_time_search.all_successors(after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successors_successor_inverse(after, mt);
        }
        if (link_tag.eql($SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_predecessors_predecessors(after, mt);
        }
        return NIL;
    }

    public static final SubLObject all_temporal_link_after_alt(SubLObject link_tag, SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                return sbhl_time_search.all_weakly_precedes(before, mt);
            } else {
                if (pcase_var.eql($STRICT)) {
                    return sbhl_time_search.all_strictly_precedes(before, mt);
                } else {
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        return sbhl_time_search.all_weakly_precedes_successor(before, mt);
                    } else {
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            return sbhl_time_search.all_successor_strictly_precedes(before, mt);
                        } else {
                            if (pcase_var.eql($COORDINATE)) {
                                return sbhl_time_search.all_coordinate(before, mt);
                            } else {
                                if (pcase_var.eql($SUCCESSOR)) {
                                    return sbhl_time_search.all_successors(before, mt);
                                } else {
                                    if (pcase_var.eql($PREDECESSOR)) {
                                        return sbhl_time_search.all_predecessors(before, mt);
                                    } else {
                                        if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                                            return sbhl_time_search.all_weakly_precedes_successors_successor(before, mt);
                                        } else {
                                            if (pcase_var.eql($SUCCESSORS_SUCCESSOR)) {
                                                return sbhl_time_search.all_successors_successors(before, mt);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject all_temporal_link_after(final SubLObject link_tag, final SubLObject before, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (link_tag.eql($WEAK)) {
            return sbhl_time_search.all_weakly_precedes(before, mt);
        }
        if (link_tag.eql($STRICT)) {
            return sbhl_time_search.all_strictly_precedes(before, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successor(before, mt);
        }
        if (link_tag.eql($SUCCESSOR_STRICT)) {
            return sbhl_time_search.all_successor_strictly_precedes(before, mt);
        }
        if (link_tag.eql($COORDINATE)) {
            return sbhl_time_search.all_coordinate(before, mt);
        }
        if (link_tag.eql($SUCCESSOR)) {
            return sbhl_time_search.all_successors(before, mt);
        }
        if (link_tag.eql($PREDECESSOR)) {
            return sbhl_time_search.all_predecessors(before, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successors_successor(before, mt);
        }
        if (link_tag.eql($SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_successors_successors(before, mt);
        }
        return NIL;
    }

    public static final SubLObject all_weakly_between_quasi_links_alt(SubLObject quasi_before, SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes($WEAK, quasi_before);
            SubLObject before_link_tag = link_before_half.first();
            SubLObject before = second(link_before_half);
            if (NIL == link_before_half) {
                return NIL;
            }
            {
                SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes($WEAK, quasi_after);
                SubLObject after_link_tag = link_after_half.first();
                SubLObject after = second(link_after_half);
                if (NIL == link_after_half) {
                    return NIL;
                }
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_between(before_link_tag, before, after_link_tag, after, mt);
            }
        }
    }

    public static SubLObject all_weakly_between_quasi_links(final SubLObject quasi_before, final SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes($WEAK, quasi_before);
        final SubLObject before_link_tag = link_before_half.first();
        final SubLObject before = second(link_before_half);
        if (NIL == link_before_half) {
            return NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes($WEAK, quasi_after);
        final SubLObject after_link_tag = link_after_half.first();
        final SubLObject after = second(link_after_half);
        if (NIL == link_after_half) {
            return NIL;
        }
        return all_temporal_link_between(before_link_tag, before, after_link_tag, after, mt);
    }

    public static final SubLObject all_strictly_between_quasi_links_alt(SubLObject quasi_before, SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject link_before_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_before_half_to_existing_nodes($STRICT, quasi_before);
            SubLObject before_link_tag = link_before_half.first();
            SubLObject before = second(link_before_half);
            if (NIL == link_before_half) {
                return NIL;
            }
            {
                SubLObject link_after_half = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_quasi_link_after_half_to_existing_nodes($STRICT, quasi_after);
                SubLObject after_link_tag = link_after_half.first();
                SubLObject after = second(link_after_half);
                if (NIL == link_after_half) {
                    return NIL;
                }
                return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.all_temporal_link_between(before_link_tag, before, after_link_tag, after, mt);
            }
        }
    }

    public static SubLObject all_strictly_between_quasi_links(final SubLObject quasi_before, final SubLObject quasi_after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes($STRICT, quasi_before);
        final SubLObject before_link_tag = link_before_half.first();
        final SubLObject before = second(link_before_half);
        if (NIL == link_before_half) {
            return NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes($STRICT, quasi_after);
        final SubLObject after_link_tag = link_after_half.first();
        final SubLObject after = second(link_after_half);
        if (NIL == link_after_half) {
            return NIL;
        }
        return all_temporal_link_between(before_link_tag, before, after_link_tag, after, mt);
    }

    public static final SubLObject all_temporal_link_between_alt(SubLObject before_link_tag, SubLObject before, SubLObject after_link_tag, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject initial_marking_depth = NIL;
            SubLObject initial_searching_depth = NIL;
            {
                SubLObject pcase_var = before_link_tag;
                if (pcase_var.eql($WEAK)) {
                    initial_marking_depth = ZERO_INTEGER;
                } else {
                    if (pcase_var.eql($STRICT)) {
                        initial_marking_depth = MINUS_ONE_INTEGER;
                    } else {
                        if (pcase_var.eql($WEAK_SUCCESSOR)) {
                            initial_marking_depth = ONE_INTEGER;
                        } else {
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                initial_marking_depth = $int$_2;
                            } else {
                                if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                                    initial_marking_depth = TWO_INTEGER;
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject pcase_var = after_link_tag;
                if (pcase_var.eql($WEAK)) {
                    initial_searching_depth = ZERO_INTEGER;
                } else {
                    if (pcase_var.eql($STRICT)) {
                        initial_searching_depth = MINUS_ONE_INTEGER;
                    } else {
                        if (pcase_var.eql($WEAK_SUCCESSOR)) {
                            initial_searching_depth = ONE_INTEGER;
                        } else {
                            if (pcase_var.eql($SUCCESSOR_STRICT)) {
                                initial_searching_depth = $int$_2;
                            } else {
                                if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                                    initial_searching_depth = TWO_INTEGER;
                                }
                            }
                        }
                    }
                }
            }
            return sbhl_time_search.all_between(initial_marking_depth, initial_searching_depth, before, after, mt);
        }
    }

    public static SubLObject all_temporal_link_between(final SubLObject before_link_tag, final SubLObject before, final SubLObject after_link_tag, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject initial_marking_depth = NIL;
        SubLObject initial_searching_depth = NIL;
        if (before_link_tag.eql($WEAK)) {
            initial_marking_depth = ZERO_INTEGER;
        } else
            if (before_link_tag.eql($STRICT)) {
                initial_marking_depth = MINUS_ONE_INTEGER;
            } else
                if (before_link_tag.eql($WEAK_SUCCESSOR)) {
                    initial_marking_depth = ONE_INTEGER;
                } else
                    if (before_link_tag.eql($SUCCESSOR_STRICT)) {
                        initial_marking_depth = $int$_2;
                    } else
                        if (before_link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                            initial_marking_depth = TWO_INTEGER;
                        }




        if (after_link_tag.eql($WEAK)) {
            initial_searching_depth = ZERO_INTEGER;
        } else
            if (after_link_tag.eql($STRICT)) {
                initial_searching_depth = MINUS_ONE_INTEGER;
            } else
                if (after_link_tag.eql($WEAK_SUCCESSOR)) {
                    initial_searching_depth = ONE_INTEGER;
                } else
                    if (after_link_tag.eql($SUCCESSOR_STRICT)) {
                        initial_searching_depth = $int$_2;
                    } else
                        if (after_link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                            initial_searching_depth = TWO_INTEGER;
                        }




        return sbhl_time_search.all_between(initial_marking_depth, initial_searching_depth, before, after, mt);
    }

    /**
     * Intended for use in the SubL Interactor.
     */
    @LispMethod(comment = "Intended for use in the SubL Interactor.")
    public static final SubLObject why_temporal_relationP_alt(SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != literalP(literal)) && literal_arity(literal_atomic_sentence(literal), UNPROVIDED).numE(TWO_INTEGER)) && ((NIL == mt) || (NIL != hlmt.hlmt_p(mt)))) {
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_verbose_justsP$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_verbose_justsP$.bind(NIL, thread);
                        {
                            SubLObject gaf = literal_atomic_sentence(literal);
                            SubLObject pred = cycl_utilities.formula_arg0(gaf);
                            SubLObject arg1 = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                            SubLObject arg2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                            SubLObject sense = (NIL != el_negation_p(literal)) ? ((SubLObject) ($NEG)) : $POS;
                            SubLObject supports = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_relation_literalP(pred, arg1, arg2, sense, mt);
                            SubLObject cdolist_list_var = supports;
                            SubLObject support = NIL;
                            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                if (!support.eql(supports.first())) {
                                    html_newline(UNPROVIDED);
                                }
                                if (NIL != assertion_handles.assertion_p(support)) {
                                    cb_show_assertion_readably(support, T, UNPROVIDED);
                                } else {
                                    cb_form(support, ZERO_INTEGER, T);
                                }
                            }
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporality_verbose_justsP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Intended for use in the SubL Interactor.")
    public static SubLObject why_temporal_relationP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != literalP(literal)) && literal_arity(literal_atomic_sentence(literal), UNPROVIDED).numE(TWO_INTEGER)) && ((NIL == mt) || (NIL != hlmt.hlmt_p(mt)))) {
            final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_verbose_justsP$.currentBinding(thread);
            try {
                sbhl_time_vars.$sbhl_temporality_verbose_justsP$.bind(NIL, thread);
                final SubLObject gaf = literal_atomic_sentence(literal);
                final SubLObject pred = cycl_utilities.formula_arg0(gaf);
                final SubLObject arg1 = cycl_utilities.formula_arg1(gaf, UNPROVIDED);
                final SubLObject arg2 = cycl_utilities.formula_arg2(gaf, UNPROVIDED);
                final SubLObject sense = (NIL != el_negation_p(literal)) ? $NEG : $POS;
                SubLObject cdolist_list_var;
                final SubLObject supports = cdolist_list_var = why_true_temporal_relation_literalP(pred, arg1, arg2, sense, mt);
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (!support.eql(supports.first())) {
                        html_newline(UNPROVIDED);
                    }
                    if (NIL != assertion_handles.assertion_p(support)) {
                        cb_show_assertion_readably(support, T, UNPROVIDED);
                    } else {
                        cb_form(support, ZERO_INTEGER, T);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            } finally {
                sbhl_time_vars.$sbhl_temporality_verbose_justsP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }/**
     * Intended for use in the SubL Interactor.
     */


    public static final SubLObject why_true_temporal_relation_literalP_alt(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject sense, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        } else {
            if ((arg1.equal(arg2) && (sense == $POS)) && (NIL != kb_accessors.reflexive_predicateP(pred))) {
                return list(arguments.make_hl_support($REFLEXIVE, list(pred, arg1, arg2), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue(), UNPROVIDED));
            } else {
                if ((arg1.equal(arg2) && (sense == $NEG)) && (NIL != kb_accessors.irreflexive_predicateP(pred))) {
                    return list(arguments.make_hl_support($REFLEXIVE, list(pred, arg1, arg2), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue(), UNPROVIDED));
                } else {
                    {
                        SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
                        if (NIL == fboundp(conjunction_fn)) {
                            return NIL;
                        }
                        {
                            SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
                            SubLObject pcase_var = sense;
                            if (pcase_var.eql($POS)) {
                                if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                                    return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_quasi_link_conjunctionP(conjuncts, mt);
                                } else {
                                    if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_false_temporal_quasi_link_conjunctionP(conjuncts, mt);
                                    }
                                }
                            } else {
                                if (pcase_var.eql($NEG)) {
                                    if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                                        return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_false_temporal_quasi_link_conjunctionP(conjuncts, mt);
                                    } else {
                                        if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_quasi_link_conjunctionP(conjuncts, mt);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject why_true_temporal_relation_literalP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return NIL;
        }
        if ((arg1.equal(arg2) && (sense == $POS)) && (NIL != kb_accessors.reflexive_predicateP(pred))) {
            return list(arguments.make_hl_support($REFLEXIVE, list(pred, arg1, arg2), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue(), UNPROVIDED));
        }
        if ((arg1.equal(arg2) && (sense == $NEG)) && (NIL != kb_accessors.irreflexive_predicateP(pred))) {
            return list(arguments.make_hl_support($REFLEXIVE, list(pred, arg1, arg2), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue(), UNPROVIDED));
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTION_FN, UNPROVIDED);
        if (NIL == fboundp(conjunction_fn)) {
            return NIL;
        }
        final SubLObject conjuncts = funcall(conjunction_fn, arg1, arg2);
        if (sense.eql($POS)) {
            if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                return why_true_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
            if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                return why_false_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
        } else
            if (sense.eql($NEG)) {
                if (NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                    return why_false_temporal_quasi_link_conjunctionP(conjuncts, mt);
                }
                if (NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                    return why_true_temporal_quasi_link_conjunctionP(conjuncts, mt);
                }
            }

        return NIL;
    }

    public static final SubLObject why_true_temporal_quasi_link_conjunctionP_alt(SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                SubLObject missing_partial_justP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind(NIL, thread);
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
                        if ((NIL == mt) && (!((NIL != mt_relevance_macros.all_mts_are_relevantP()) || (NIL != mt_relevance_macros.any_mt_is_relevantP())))) {
                            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                        }
                        if (NIL == missing_partial_justP) {
                            {
                                SubLObject csome_list_var = quasi_conjuncts;
                                SubLObject conjunct = NIL;
                                for (conjunct = csome_list_var.first(); !((NIL != missing_partial_justP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , conjunct = csome_list_var.first()) {
                                    {
                                        SubLObject link_tag = conjunct.first();
                                        SubLObject before = second(conjunct);
                                        SubLObject after = third(conjunct);
                                        SubLObject partial_just = NIL;
                                        partial_just = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_quasi_linkP(link_tag, before, after, mt);
                                        if (NIL != partial_just) {
                                            if (partial_just.first().isList() && ($$equals == caar(partial_just))) {
                                                {
                                                    SubLObject item_var = partial_just.first();
                                                    if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                        just = cons(item_var, just);
                                                    }
                                                }
                                            } else {
                                                just = append(partial_just, just);
                                            }
                                        } else {
                                            missing_partial_justP = T;
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.remove_temporal_link_disjunction_consequents(mt);
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_1, thread);
                        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != missing_partial_justP ? ((SubLObject) (NIL)) : NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread) ? ((SubLObject) (just)) : remove_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject why_true_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        SubLObject missing_partial_justP = NIL;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind(NIL, thread);
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
            if (((NIL == mt) && (NIL == mt_relevance_macros.all_mts_are_relevantP())) && (NIL == mt_relevance_macros.any_mt_is_relevantP())) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (NIL == missing_partial_justP) {
                SubLObject csome_list_var = quasi_conjuncts;
                SubLObject conjunct = NIL;
                conjunct = csome_list_var.first();
                while ((NIL == missing_partial_justP) && (NIL != csome_list_var)) {
                    final SubLObject link_tag = conjunct.first();
                    final SubLObject before = second(conjunct);
                    final SubLObject after = third(conjunct);
                    SubLObject partial_just = NIL;
                    partial_just = why_true_temporal_quasi_linkP(link_tag, before, after, mt);
                    if (NIL != partial_just) {
                        if (partial_just.first().isList() && $$equals.eql(caar(partial_just))) {
                            final SubLObject item_var = partial_just.first();
                            if (NIL == member(item_var, just, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                just = cons(item_var, just);
                            }
                        } else {
                            just = append(partial_just, just);
                        }
                    } else {
                        missing_partial_justP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    conjunct = csome_list_var.first();
                } 
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        } finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
        }
        return NIL != missing_partial_justP ? NIL : NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread) ? just : remove_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_false_temporal_quasi_link_conjunctionP_alt(SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject just = NIL;
                SubLObject quasi_disjuncts = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.temporal_link_conjunction_negation(quasi_conjuncts);
                {
                    SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
                    try {
                        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind(NIL, thread);
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
                        if ((NIL == mt) && (!((NIL != mt_relevance_macros.all_mts_are_relevantP()) || (NIL != mt_relevance_macros.any_mt_is_relevantP())))) {
                            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                        }
                        if (NIL == just) {
                            {
                                SubLObject csome_list_var = quasi_disjuncts;
                                SubLObject quasi_disjunct = NIL;
                                for (quasi_disjunct = csome_list_var.first(); !((NIL != just) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , quasi_disjunct = csome_list_var.first()) {
                                    {
                                        SubLObject link_tag = quasi_disjunct.first();
                                        SubLObject before = second(quasi_disjunct);
                                        SubLObject after = third(quasi_disjunct);
                                        just = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_quasi_linkP(link_tag, before, after, mt);
                                    }
                                }
                            }
                        }
                        if (NIL == just) {
                            {
                                SubLObject disjunct = NIL;
                                SubLObject disjuncts = NIL;
                                {
                                    SubLObject cdolist_list_var = quasi_disjuncts;
                                    SubLObject quasi_disjunct = NIL;
                                    for (quasi_disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , quasi_disjunct = cdolist_list_var.first()) {
                                        {
                                            SubLObject link = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(quasi_disjunct);
                                            SubLObject link_tag = link.first();
                                            if (NIL != link) {
                                                if (NIL != disjunct) {
                                                    disjuncts = cons(link, disjuncts);
                                                } else {
                                                    if (NIL != subl_promotions.memberP(link_tag, $list_alt3, UNPROVIDED, UNPROVIDED)) {
                                                        disjunct = link;
                                                    } else {
                                                        disjuncts = cons(link, disjuncts);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == disjunct) {
                                    disjunct = disjuncts.first();
                                    disjuncts = disjuncts.rest();
                                }
                                if (NIL != disjuncts) {
                                    {
                                        SubLObject conjuncts = NIL;
                                        SubLObject link_addedP = NIL;
                                        if (NIL == mt) {
                                            mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                                        }
                                        {
                                            SubLObject cdolist_list_var = disjuncts;
                                            SubLObject link = NIL;
                                            for (link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , link = cdolist_list_var.first()) {
                                                conjuncts = cons(com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.temporal_link_negation(link), conjuncts);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = conjuncts;
                                            SubLObject conjunct = NIL;
                                            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                {
                                                    SubLObject link_tag = conjunct.first();
                                                    SubLObject before = second(conjunct);
                                                    SubLObject after = third(conjunct);
                                                    link_addedP = makeBoolean((NIL != sbhl_time_assertion_processing.add_temporal_link($CONDITIONAL_PROOF, link_tag, before, after, mt)) || (NIL != link_addedP));
                                                }
                                            }
                                        }
                                        if (NIL != link_addedP) {
                                            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.add_temporal_link_disjunction_consequents(mt);
                                            }
                                            {
                                                SubLObject link_tag = disjunct.first();
                                                SubLObject before = second(disjunct);
                                                SubLObject after = third(disjunct);
                                                just = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_linkP(link_tag, before, after, mt);
                                            }
                                        }
                                        {
                                            SubLObject cdolist_list_var = conjuncts;
                                            SubLObject conjunct = NIL;
                                            for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                                                {
                                                    SubLObject link_tag = conjunct.first();
                                                    SubLObject before = second(conjunct);
                                                    SubLObject after = third(conjunct);
                                                    sbhl_time_assertion_processing.remove_temporal_link($CONDITIONAL_PROOF, link_tag, before, after, mt);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.remove_temporal_link_disjunction_consequents(mt);
                        }
                    } finally {
                        sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_1, thread);
                        sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread) ? ((SubLObject) (just)) : remove_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject why_false_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject quasi_disjuncts = temporal_link_conjunction_negation(quasi_conjuncts);
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind(NIL, thread);
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind(NIL, thread);
            if (((NIL == mt) && (NIL == mt_relevance_macros.all_mts_are_relevantP())) && (NIL == mt_relevance_macros.any_mt_is_relevantP())) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (NIL == just) {
                SubLObject csome_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct = NIL;
                quasi_disjunct = csome_list_var.first();
                while ((NIL == just) && (NIL != csome_list_var)) {
                    final SubLObject link_tag = quasi_disjunct.first();
                    final SubLObject before = second(quasi_disjunct);
                    final SubLObject after = third(quasi_disjunct);
                    just = why_true_temporal_quasi_linkP(link_tag, before, after, mt);
                    csome_list_var = csome_list_var.rest();
                    quasi_disjunct = csome_list_var.first();
                } 
            }
            if (NIL == just) {
                SubLObject disjunct = NIL;
                SubLObject disjuncts = NIL;
                SubLObject cdolist_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct2 = NIL;
                quasi_disjunct2 = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject link = adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(quasi_disjunct2);
                    final SubLObject link_tag2 = link.first();
                    if (NIL != link) {
                        if (NIL != disjunct) {
                            disjuncts = cons(link, disjuncts);
                        } else
                            if (NIL != subl_promotions.memberP(link_tag2, $list3, UNPROVIDED, UNPROVIDED)) {
                                disjunct = link;
                            } else {
                                disjuncts = cons(link, disjuncts);
                            }

                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    quasi_disjunct2 = cdolist_list_var.first();
                } 
                if (NIL == disjunct) {
                    disjunct = disjuncts.first();
                    disjuncts = disjuncts.rest();
                }
                if (NIL != disjuncts) {
                    SubLObject conjuncts = NIL;
                    SubLObject link_addedP = NIL;
                    if (NIL == mt) {
                        mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                    }
                    SubLObject cdolist_list_var2 = disjuncts;
                    SubLObject link2 = NIL;
                    link2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        conjuncts = cons(temporal_link_negation(link2), conjuncts);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        link2 = cdolist_list_var2.first();
                    } 
                    cdolist_list_var2 = conjuncts;
                    SubLObject conjunct = NIL;
                    conjunct = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = second(conjunct);
                        final SubLObject after2 = third(conjunct);
                        link_addedP = makeBoolean((NIL != sbhl_time_assertion_processing.add_temporal_link($CONDITIONAL_PROOF, link_tag3, before2, after2, mt)) || (NIL != link_addedP));
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    } 
                    if (NIL != link_addedP) {
                        if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            add_temporal_link_disjunction_consequents(mt);
                        }
                        final SubLObject link_tag4 = disjunct.first();
                        final SubLObject before3 = second(disjunct);
                        final SubLObject after3 = third(disjunct);
                        just = why_true_temporal_linkP(link_tag4, before3, after3, mt);
                    }
                    cdolist_list_var2 = conjuncts;
                    conjunct = NIL;
                    conjunct = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = second(conjunct);
                        final SubLObject after2 = third(conjunct);
                        sbhl_time_assertion_processing.remove_temporal_link($CONDITIONAL_PROOF, link_tag3, before2, after2, mt);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    } 
                }
            }
            if (NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        } finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
        }
        return NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread) ? just : remove_duplicates(just, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject why_true_temporal_quasi_linkP_alt(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject before_tag = before.first();
            SubLObject before_time = second(before);
            SubLObject after_tag = after.first();
            SubLObject after_time = second(after);
            if (before_time.isInteger() && after_time.isInteger()) {
                return NIL;
            } else {
                if ((before_time.equal(after_time) && ((link_tag == $WEAK) || (link_tag == $WEAK_SUCCESSOR))) && ((after_tag == $END) || ((before_tag == $START) && (after_tag == $START)))) {
                    return list(arguments.make_hl_support($EQUALITY, list($$equals, before_time, after_time), mt, UNPROVIDED));
                } else {
                    if ((before_time.equal(after_time) && (link_tag == $COORDINATE)) && (((before_tag == $START) && (after_tag == $START)) || ((before_tag == $END) && (after_tag == $END)))) {
                        return list(arguments.make_hl_support($EQUALITY, list($$equals, before_time, after_time), mt, UNPROVIDED));
                    } else {
                        {
                            SubLObject quasi_link = list(link_tag, before, after);
                            SubLObject link = com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.adjust_temporal_quasi_link_to_existing_nodes(quasi_link);
                            if (NIL == link) {
                                return NIL;
                            }
                            link_tag = link.first();
                            before = second(link);
                            after = third(link);
                            return com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing.why_true_temporal_linkP(link_tag, before, after, mt);
                        }
                    }
                }
            }
        }
    }

    public static SubLObject why_true_temporal_quasi_linkP(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject before_tag = before.first();
        final SubLObject before_time = second(before);
        final SubLObject after_tag = after.first();
        final SubLObject after_time = second(after);
        if (before_time.isInteger() && after_time.isInteger()) {
            return NIL;
        }
        if ((before_time.equal(after_time) && ((link_tag == $WEAK) || (link_tag == $WEAK_SUCCESSOR))) && ((after_tag == $END) || ((before_tag == $START) && (after_tag == $START)))) {
            return list(arguments.make_hl_support($EQUALITY, list($$equals, before_time, after_time), mt, UNPROVIDED));
        }
        if ((before_time.equal(after_time) && (link_tag == $COORDINATE)) && (((before_tag == $START) && (after_tag == $START)) || ((before_tag == $END) && (after_tag == $END)))) {
            return list(arguments.make_hl_support($EQUALITY, list($$equals, before_time, after_time), mt, UNPROVIDED));
        }
        final SubLObject quasi_link = list(link_tag, before, after);
        final SubLObject link = adjust_temporal_quasi_link_to_existing_nodes(quasi_link);
        if (NIL == link) {
            return NIL;
        }
        link_tag = link.first();
        before = second(link);
        after = third(link);
        return why_true_temporal_linkP(link_tag, before, after, mt);
    }

    public static final SubLObject why_true_temporal_linkP_alt(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            SubLObject pcase_var = link_tag;
            if (pcase_var.eql($WEAK)) {
                return sbhl_time_search.why_weakly_precedesP(before, after, mt);
            } else {
                if (pcase_var.eql($STRICT)) {
                    return sbhl_time_search.why_strictly_precedesP(before, after, mt);
                } else {
                    if (pcase_var.eql($WEAK_SUCCESSOR)) {
                        return sbhl_time_search.why_weakly_precedes_successorP(before, after, mt);
                    } else {
                        if (pcase_var.eql($SUCCESSOR_STRICT)) {
                            return sbhl_time_search.why_successor_strictly_precedesP(before, after, mt);
                        } else {
                            if (pcase_var.eql($COORDINATE)) {
                                return sbhl_time_search.why_coordinateP(before, after, mt);
                            } else {
                                if (pcase_var.eql($SUCCESSOR)) {
                                    return sbhl_time_search.why_successorP(before, after, mt);
                                } else {
                                    if (pcase_var.eql($PREDECESSOR)) {
                                        return sbhl_time_search.why_predecessorP(before, after, mt);
                                    } else {
                                        if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
                                            return sbhl_time_search.why_weakly_precedes_successors_successorP(before, after, mt);
                                        } else {
                                            if (pcase_var.eql($WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR)) {
                                                return sbhl_time_search.why_weakly_precedes_successors_successors_successorP(before, after, mt);
                                            } else {
                                                if (pcase_var.eql($SUCCESSORS_SUCCESSOR)) {
                                                    return sbhl_time_search.why_successors_successorP(before, after, mt);
                                                } else {
                                                    if (pcase_var.eql($SUCCESSORS_SUCCESSOR_STRICT)) {
                                                        return sbhl_time_search.why_successors_successor_strictly_precedesP(before, after, mt);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject why_true_temporal_linkP(final SubLObject link_tag, final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (link_tag.eql($WEAK)) {
            return sbhl_time_search.why_weakly_precedesP(before, after, mt);
        }
        if (link_tag.eql($STRICT)) {
            return sbhl_time_search.why_strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSOR)) {
            return sbhl_time_search.why_weakly_precedes_successorP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSOR_STRICT)) {
            return sbhl_time_search.why_successor_strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql($COORDINATE)) {
            return sbhl_time_search.why_coordinateP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSOR)) {
            return sbhl_time_search.why_successorP(before, after, mt);
        }
        if (link_tag.eql($PREDECESSOR)) {
            return sbhl_time_search.why_predecessorP(before, after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.why_weakly_precedes_successors_successorP(before, after, mt);
        }
        if (link_tag.eql($WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR)) {
            return sbhl_time_search.why_weakly_precedes_successors_successors_successorP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.why_successors_successorP(before, after, mt);
        }
        if (link_tag.eql($SUCCESSORS_SUCCESSOR_STRICT)) {
            return sbhl_time_search.why_successors_successor_strictly_precedesP(before, after, mt);
        }
        return NIL;
    }

    public static SubLObject declare_sbhl_time_query_processing_file() {
        declareFunction("true_temporal_relation_literalP", "TRUE-TEMPORAL-RELATION-LITERAL?", 4, 1, false);
        declareFunction("true_temporal_quasi_link_conjunctionP", "TRUE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        declareFunction("false_temporal_quasi_link_conjunctionP", "FALSE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        declareFunction("temporal_link_conjunction_negation", "TEMPORAL-LINK-CONJUNCTION-NEGATION", 1, 0, false);
        declareFunction("temporal_link_negation", "TEMPORAL-LINK-NEGATION", 1, 0, false);
        declareFunction("adjust_temporal_quasi_link_to_existing_nodes", "ADJUST-TEMPORAL-QUASI-LINK-TO-EXISTING-NODES", 1, 0, false);
        declareFunction("adjust_quasi_link_before_half_to_existing_nodes", "ADJUST-QUASI-LINK-BEFORE-HALF-TO-EXISTING-NODES", 2, 0, false);
        declareFunction("adjust_quasi_link_after_half_to_existing_nodes", "ADJUST-QUASI-LINK-AFTER-HALF-TO-EXISTING-NODES", 2, 0, false);
        declareFunction("adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes", "ADJUST-TEMPORAL-QUASI-LINK-TO-LINK-DISJUNCTION-TERMS-AND-EXISTING-NODES", 1, 0, false);
        declareFunction("adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes", "ADJUST-QUASI-LINK-BEFORE-HALF-TO-LINK-DISJUNCTION-TERMS-AND-EXISTING-NODES", 2, 0, false);
        declareFunction("adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes", "ADJUST-QUASI-LINK-AFTER-HALF-TO-LINK-DISJUNCTION-TERMS-AND-EXISTING-NODES", 2, 0, false);
        declareFunction("closest_existing_date_point_before", "CLOSEST-EXISTING-DATE-POINT-BEFORE", 1, 0, false);
        declareFunction("closest_existing_date_point_after", "CLOSEST-EXISTING-DATE-POINT-AFTER", 1, 0, false);
        declareFunction("true_temporal_quasi_linkP", "TRUE-TEMPORAL-QUASI-LINK?", 3, 1, false);
        declareFunction("date_date_quasi_link_p", "DATE-DATE-QUASI-LINK-P", 1, 0, false);
        declareFunction("true_date_date_quasi_linkP", "TRUE-DATE-DATE-QUASI-LINK?", 3, 0, false);
        declareFunction("true_temporal_linkP", "TRUE-TEMPORAL-LINK?", 3, 1, false);
        declareFunction("add_temporal_link_disjunction_consequents", "ADD-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS", 1, 0, false);
        declareFunction("remove_temporal_link_disjunction_consequents", "REMOVE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS", 1, 0, false);
        declareFunction("determine_temporal_link_disjunction_consequent", "DETERMINE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT", 2, 0, false);
        declareFunction("all_weakly_before_quasi_link", "ALL-WEAKLY-BEFORE-QUASI-LINK", 1, 1, false);
        declareFunction("all_weakly_after_quasi_link", "ALL-WEAKLY-AFTER-QUASI-LINK", 1, 1, false);
        declareFunction("all_strictly_before_quasi_link", "ALL-STRICTLY-BEFORE-QUASI-LINK", 1, 1, false);
        declareFunction("all_strictly_after_quasi_link", "ALL-STRICTLY-AFTER-QUASI-LINK", 1, 1, false);
        declareFunction("all_coordinate_quasi_link", "ALL-COORDINATE-QUASI-LINK", 1, 1, false);
        declareFunction("all_successors_quasi_link", "ALL-SUCCESSORS-QUASI-LINK", 1, 1, false);
        declareFunction("all_predecessors_quasi_link", "ALL-PREDECESSORS-QUASI-LINK", 1, 1, false);
        declareFunction("all_temporal_link_before", "ALL-TEMPORAL-LINK-BEFORE", 2, 1, false);
        declareFunction("all_temporal_link_after", "ALL-TEMPORAL-LINK-AFTER", 2, 1, false);
        declareFunction("all_weakly_between_quasi_links", "ALL-WEAKLY-BETWEEN-QUASI-LINKS", 2, 1, false);
        declareFunction("all_strictly_between_quasi_links", "ALL-STRICTLY-BETWEEN-QUASI-LINKS", 2, 1, false);
        declareFunction("all_temporal_link_between", "ALL-TEMPORAL-LINK-BETWEEN", 4, 1, false);
        declareFunction("why_temporal_relationP", "WHY-TEMPORAL-RELATION?", 1, 1, false);
        declareFunction("why_true_temporal_relation_literalP", "WHY-TRUE-TEMPORAL-RELATION-LITERAL?", 4, 1, false);
        declareFunction("why_true_temporal_quasi_link_conjunctionP", "WHY-TRUE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        declareFunction("why_false_temporal_quasi_link_conjunctionP", "WHY-FALSE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        declareFunction("why_true_temporal_quasi_linkP", "WHY-TRUE-TEMPORAL-QUASI-LINK?", 3, 1, false);
        declareFunction("why_true_temporal_linkP", "WHY-TRUE-TEMPORAL-LINK?", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_sbhl_time_query_processing_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_time_query_processing_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_query_processing_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_query_processing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_query_processing_file();
    }

    static {
    }

    static private final SubLList $list_alt3 = list(makeKeyword("WEAK-SUCCESSORS-SUCCESSOR"), makeKeyword("SUCCESSORS-SUCCESSOR-STRICT"));
}

/**
 * Total time: 595 ms
 */
