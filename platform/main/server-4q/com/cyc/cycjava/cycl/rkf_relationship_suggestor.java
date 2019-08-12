/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.term.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-RELATIONSHIP-SUGGESTOR
 * source file: /cyc/top/cycl/rkf-relationship-suggestor.lisp
 * created:     2019/07/03 17:37:59
 */
public final class rkf_relationship_suggestor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rkf_relationship_suggestor();

 public static final String myName = "com.cyc.cycjava.cycl.rkf_relationship_suggestor";


    // defparameter
    @LispMethod(comment = "The specificity threshold used to determine which one of the two functions for finding relations will be used: SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA or LEGAL-RELATIONS-OF-TERMS-ISA.\ndefparameter")
    private static final SubLSymbol $specificity_cutoff$ = makeSymbol("*SPECIFICITY-CUTOFF*");

    // defparameter
    /**
     * Later set to a hash table by SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA that is
     * used to store the relations that could potentially relate the terms in the
     * input LIST-OF-TERMS of that function.
     */
    @LispMethod(comment = "Later set to a hash table by SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA that is\r\nused to store the relations that could potentially relate the terms in the\r\ninput LIST-OF-TERMS of that function.\ndefparameter\nLater set to a hash table by SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA that is\nused to store the relations that could potentially relate the terms in the\ninput LIST-OF-TERMS of that function.")
    private static final SubLSymbol $specific_term_relations$ = makeSymbol("*SPECIFIC-TERM-RELATIONS*");

    // defparameter
    /**
     * The i-th element of this array is later set to a hash table by
     * LEGAL-RELATIONS-OF-TERMS-ISA that stores the relations that can take the i-th
     * term in the input LIST-OF-TERMS as the i-th argument.
     */
    @LispMethod(comment = "The i-th element of this array is later set to a hash table by\r\nLEGAL-RELATIONS-OF-TERMS-ISA that stores the relations that can take the i-th\r\nterm in the input LIST-OF-TERMS as the i-th argument.\ndefparameter\nThe i-th element of this array is later set to a hash table by\nLEGAL-RELATIONS-OF-TERMS-ISA that stores the relations that can take the i-th\nterm in the input LIST-OF-TERMS as the i-th argument.")
    private static final SubLSymbol $term_relations$ = makeSymbol("*TERM-RELATIONS*");

    // defparameter
    /**
     * The i-th element of this array is later set to an SBHL-SPACE by
     * LEGAL-RELATIONS-OF-TERMS-ISA that is used to mark all-isas of the i-th term
     * in the input LIST-OF-TERMS.
     */
    @LispMethod(comment = "The i-th element of this array is later set to an SBHL-SPACE by\r\nLEGAL-RELATIONS-OF-TERMS-ISA that is used to mark all-isas of the i-th term\r\nin the input LIST-OF-TERMS.\ndefparameter\nThe i-th element of this array is later set to an SBHL-SPACE by\nLEGAL-RELATIONS-OF-TERMS-ISA that is used to mark all-isas of the i-th term\nin the input LIST-OF-TERMS.")
    private static final SubLSymbol $term_isas$ = makeSymbol("*TERM-ISAS*");

    // defparameter
    /**
     * Later set to a hash table by LEGAL-RELATIONS-OF-TERMS-ISA to store the
     * relations that are candidate to relate all the terms in the input
     * LIST-OF-TERMS.
     */
    @LispMethod(comment = "Later set to a hash table by LEGAL-RELATIONS-OF-TERMS-ISA to store the\r\nrelations that are candidate to relate all the terms in the input\r\nLIST-OF-TERMS.\ndefparameter\nLater set to a hash table by LEGAL-RELATIONS-OF-TERMS-ISA to store the\nrelations that are candidate to relate all the terms in the input\nLIST-OF-TERMS.")
    private static final SubLSymbol $terms_candidate_relations$ = makeSymbol("*TERMS-CANDIDATE-RELATIONS*");

    // defparameter
    /**
     * Used by SATISFIES-ALL-ARG-ISAS? to store all-isas of each of the input terms
     * in the process of making sure that all argIsa constraints are satisfied for a
     * given candidate relation.
     */
    @LispMethod(comment = "Used by SATISFIES-ALL-ARG-ISAS? to store all-isas of each of the input terms\r\nin the process of making sure that all argIsa constraints are satisfied for a\r\ngiven candidate relation.\ndefparameter\nUsed by SATISFIES-ALL-ARG-ISAS? to store all-isas of each of the input terms\nin the process of making sure that all argIsa constraints are satisfied for a\ngiven candidate relation.")
    private static final SubLSymbol $candidate_relations_sbhl_space$ = makeSymbol("*CANDIDATE-RELATIONS-SBHL-SPACE*");

    // defparameter
    /**
     * Used by CR-ARGISA-COL-SEARCHED? to signal the caller function
     * CR-ALL-ARG-ISA-CACHED? whether a given argIsa constraint for the relation in
     * question is satisfied.
     */
    @LispMethod(comment = "Used by CR-ARGISA-COL-SEARCHED? to signal the caller function\r\nCR-ALL-ARG-ISA-CACHED? whether a given argIsa constraint for the relation in\r\nquestion is satisfied.\ndefparameter\nUsed by CR-ARGISA-COL-SEARCHED? to signal the caller function\nCR-ALL-ARG-ISA-CACHED? whether a given argIsa constraint for the relation in\nquestion is satisfied.")
    private static final SubLSymbol $cr_mapping_result$ = makeSymbol("*CR-MAPPING-RESULT*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLFloat $float$5_0e_4 = makeDouble(5.0E-4);



    static private final SubLSymbol $sym3$TERM_ = makeSymbol("TERM?");



    private static final SubLSymbol MARK_ALL_TERM_ISAS = makeSymbol("MARK-ALL-TERM-ISAS");

    private static final SubLSymbol GATHER_SPECIFIC_COL_RELATIONS = makeSymbol("GATHER-SPECIFIC-COL-RELATIONS");



    private static final SubLSymbol GATHER_ALL_COL_LEGAL_RELATIONS = makeSymbol("GATHER-ALL-COL-LEGAL-RELATIONS");

    static private final SubLSymbol $sym12$CR_ARGISA_COL_SEARCHED_ = makeSymbol("CR-ARGISA-COL-SEARCHED?");

    private static final SubLSymbol GATHER_COL_LEGAL_RELATIONS = makeSymbol("GATHER-COL-LEGAL-RELATIONS");



    /**
     *
     *
     * @return list; a list of CycL formulas relating TERMS.
     */
    @LispMethod(comment = "@return list; a list of CycL formulas relating TERMS.")
    public static final SubLObject rkf_candidate_formulas_relating_terms_alt(SubLObject terms, SubLObject domain_interaction_mt) {
        return com.cyc.cycjava.cycl.rkf_relationship_suggestor.find_relations_of_terms(terms, $$Thing, domain_interaction_mt);
    }

    /**
     *
     *
     * @return list; a list of CycL formulas relating TERMS.
     */
    @LispMethod(comment = "@return list; a list of CycL formulas relating TERMS.")
    public static SubLObject rkf_candidate_formulas_relating_terms(final SubLObject terms, final SubLObject domain_interaction_mt) {
        return find_relations_of_terms(terms, $$Thing, domain_interaction_mt);
    }

    /**
     * Checks the types of the input list of terms and depending on the value of the input
     * parameter MT, calls the function CALL-RIGHT-FIND-RELATIONS with either all mts or
     * just the input MT.
     */
    @LispMethod(comment = "Checks the types of the input list of terms and depending on the value of the input\r\nparameter MT, calls the function CALL-RIGHT-FIND-RELATIONS with either all mts or\r\njust the input MT.\nChecks the types of the input list of terms and depending on the value of the input\nparameter MT, calls the function CALL-RIGHT-FIND-RELATIONS with either all mts or\njust the input MT.")
    public static final SubLObject find_relations_of_terms_alt(SubLObject list_of_terms, SubLObject specific_term, SubLObject mt) {
        if (specific_term == UNPROVIDED) {
            specific_term = $$Thing;
        }
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = list_of_terms;
                SubLObject each_term = NIL;
                for (each_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_term = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(each_term, $sym3$TERM_);
                }
            }
            {
                SubLObject answers = NIL;
                if (NIL != hlmt.hlmt_equal($ALL, mt)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            answers = com.cyc.cycjava.cycl.rkf_relationship_suggestor.call_right_find_relations(list_of_terms, specific_term);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != hlmt.hlmt_p(mt)) {
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    answers = com.cyc.cycjava.cycl.rkf_relationship_suggestor.call_right_find_relations(list_of_terms, specific_term);
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return answers;
            }
        }
    }

    /**
     * Checks the types of the input list of terms and depending on the value of the input
     * parameter MT, calls the function CALL-RIGHT-FIND-RELATIONS with either all mts or
     * just the input MT.
     */
    @LispMethod(comment = "Checks the types of the input list of terms and depending on the value of the input\r\nparameter MT, calls the function CALL-RIGHT-FIND-RELATIONS with either all mts or\r\njust the input MT.\nChecks the types of the input list of terms and depending on the value of the input\nparameter MT, calls the function CALL-RIGHT-FIND-RELATIONS with either all mts or\njust the input MT.")
    public static SubLObject find_relations_of_terms(final SubLObject list_of_terms, SubLObject specific_term, SubLObject mt) {
        if (specific_term == UNPROVIDED) {
            specific_term = $$Thing;
        }
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = list_of_terms;
        SubLObject each_term = NIL;
        each_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != term.termP(each_term, UNPROVIDED) : "! term.termP(each_term, .UNPROVIDED) " + ("term.termP(each_term, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != term.termP(each_term, CommonSymbols.UNPROVIDED) ") + each_term;
            cdolist_list_var = cdolist_list_var.rest();
            each_term = cdolist_list_var.first();
        } 
        SubLObject answers = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                answers = call_right_find_relations(list_of_terms, specific_term);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    answers = call_right_find_relations(list_of_terms, specific_term);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }

        return answers;
    }

    /**
     * Compares the relative specificity of the input SPECIFIC-TERM to the
     * specificity of #$Thing with a predefined specificity metric. If, according to
     * this comparison, the input SPECIFIC-TERM is found to be ``specific enough''
     * then calls SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA; otherwise, calls
     * LEGAL-RELATIONS-OF-TERMS-ISA.
     */
    @LispMethod(comment = "Compares the relative specificity of the input SPECIFIC-TERM to the\r\nspecificity of #$Thing with a predefined specificity metric. If, according to\r\nthis comparison, the input SPECIFIC-TERM is found to be ``specific enough\'\'\r\nthen calls SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA; otherwise, calls\r\nLEGAL-RELATIONS-OF-TERMS-ISA.\nCompares the relative specificity of the input SPECIFIC-TERM to the\nspecificity of #$Thing with a predefined specificity metric. If, according to\nthis comparison, the input SPECIFIC-TERM is found to be ``specific enough\'\'\nthen calls SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA; otherwise, calls\nLEGAL-RELATIONS-OF-TERMS-ISA.")
    public static final SubLObject call_right_find_relations_alt(SubLObject list_of_terms, SubLObject specific_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject g_spec_term = cardinality_estimates.generality_estimate(specific_term);
                SubLObject g_thing = cardinality_estimates.generality_estimate($$Thing);
                SubLObject g_ratio = divide(g_spec_term, g_thing);
                SubLObject answers = NIL;
                if (g_ratio.numL($specificity_cutoff$.getDynamicValue(thread))) {
                    answers = com.cyc.cycjava.cycl.rkf_relationship_suggestor.specific_legal_relations_of_terms_isa(list_of_terms, specific_term);
                } else {
                    answers = com.cyc.cycjava.cycl.rkf_relationship_suggestor.legal_relations_of_terms_isa(list_of_terms);
                }
                return answers;
            }
        }
    }

    /**
     * Compares the relative specificity of the input SPECIFIC-TERM to the
     * specificity of #$Thing with a predefined specificity metric. If, according to
     * this comparison, the input SPECIFIC-TERM is found to be ``specific enough''
     * then calls SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA; otherwise, calls
     * LEGAL-RELATIONS-OF-TERMS-ISA.
     */
    @LispMethod(comment = "Compares the relative specificity of the input SPECIFIC-TERM to the\r\nspecificity of #$Thing with a predefined specificity metric. If, according to\r\nthis comparison, the input SPECIFIC-TERM is found to be ``specific enough\'\'\r\nthen calls SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA; otherwise, calls\r\nLEGAL-RELATIONS-OF-TERMS-ISA.\nCompares the relative specificity of the input SPECIFIC-TERM to the\nspecificity of #$Thing with a predefined specificity metric. If, according to\nthis comparison, the input SPECIFIC-TERM is found to be ``specific enough\'\'\nthen calls SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA; otherwise, calls\nLEGAL-RELATIONS-OF-TERMS-ISA.")
    public static SubLObject call_right_find_relations(final SubLObject list_of_terms, final SubLObject specific_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject g_spec_term = cardinality_estimates.generality_estimate(specific_term);
        final SubLObject g_thing = cardinality_estimates.generality_estimate($$Thing);
        final SubLObject g_ratio = divide(g_spec_term, g_thing);
        SubLObject answers = NIL;
        if (g_ratio.numL($specificity_cutoff$.getDynamicValue(thread))) {
            answers = specific_legal_relations_of_terms_isa(list_of_terms, specific_term);
        } else {
            answers = legal_relations_of_terms_isa(list_of_terms);
        }
        return answers;
    }

    /**
     * Returns relations one of whose arguments is constrained as one of the isas
     * of one of the terms in LIST-OF-TERMS. The isa in question must be more specific
     * than SPECIFIC-TERM.
     */
    @LispMethod(comment = "Returns relations one of whose arguments is constrained as one of the isas\r\nof one of the terms in LIST-OF-TERMS. The isa in question must be more specific\r\nthan SPECIFIC-TERM.\nReturns relations one of whose arguments is constrained as one of the isas\nof one of the terms in LIST-OF-TERMS. The isa in question must be more specific\nthan SPECIFIC-TERM.")
    public static final SubLObject specific_legal_relations_of_terms_isa_alt(SubLObject list_of_terms, SubLObject specific_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject relations = NIL;
                SubLObject right_arity = list_length(list_of_terms);
                {
                    SubLObject _prev_bind_0 = $specific_term_relations$.currentBinding(thread);
                    try {
                        $specific_term_relations$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                        {
                            SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            {
                                SubLObject _prev_bind_0_1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject _prev_bind_0_2 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                                        SubLObject _prev_bind_1_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                            Mapping.mapcar(symbol_function(MARK_ALL_TERM_ISAS), list_of_terms);
                                            {
                                                SubLObject cdohash_table = sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread);
                                                SubLObject candidate = NIL;
                                                SubLObject value = NIL;
                                                {
                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                    try {
                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                            candidate = getEntryKey(cdohash_entry);
                                                            value = getEntryValue(cdohash_entry);
                                                            if (NIL != cardinality_estimates.generality_estimateL(candidate, specific_term)) {
                                                                com.cyc.cycjava.cycl.rkf_relationship_suggestor.gather_all_specific_col_relations(candidate);
                                                            }
                                                        } 
                                                    } finally {
                                                        releaseEntrySetIterator(cdohash_iterator);
                                                    }
                                                }
                                            }
                                            {
                                                SubLObject cdohash_table = $specific_term_relations$.getDynamicValue(thread);
                                                SubLObject candidate = NIL;
                                                SubLObject value = NIL;
                                                {
                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                    try {
                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                            candidate = getEntryKey(cdohash_entry);
                                                            value = getEntryValue(cdohash_entry);
                                                            if (NIL != (value.first().isInteger() ? ((SubLObject) (numE(value.first(), right_arity))) : T)) {
                                                                {
                                                                    SubLObject item_var = candidate;
                                                                    if (NIL == member(item_var, relations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                        relations = cons(item_var, relations);
                                                                    }
                                                                }
                                                            }
                                                        } 
                                                    } finally {
                                                        releaseEntrySetIterator(cdohash_iterator);
                                                    }
                                                }
                                            }
                                            result = relations;
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_3, thread);
                                            sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        $specific_term_relations$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns relations one of whose arguments is constrained as one of the isas
     * of one of the terms in LIST-OF-TERMS. The isa in question must be more specific
     * than SPECIFIC-TERM.
     */
    @LispMethod(comment = "Returns relations one of whose arguments is constrained as one of the isas\r\nof one of the terms in LIST-OF-TERMS. The isa in question must be more specific\r\nthan SPECIFIC-TERM.\nReturns relations one of whose arguments is constrained as one of the isas\nof one of the terms in LIST-OF-TERMS. The isa in question must be more specific\nthan SPECIFIC-TERM.")
    public static SubLObject specific_legal_relations_of_terms_isa(final SubLObject list_of_terms, final SubLObject specific_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject relations = NIL;
        final SubLObject right_arity = list_length(list_of_terms);
        final SubLObject _prev_bind_0 = $specific_term_relations$.currentBinding(thread);
        try {
            $specific_term_relations$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        Mapping.mapcar(symbol_function(MARK_ALL_TERM_ISAS), list_of_terms);
                        SubLObject cdohash_table = sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread);
                        SubLObject candidate = NIL;
                        SubLObject value = NIL;
                        Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                candidate = getEntryKey(cdohash_entry);
                                value = getEntryValue(cdohash_entry);
                                if (NIL != cardinality_estimates.generality_estimateL(candidate, specific_term)) {
                                    gather_all_specific_col_relations(candidate);
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                        cdohash_table = $specific_term_relations$.getDynamicValue(thread);
                        candidate = NIL;
                        value = NIL;
                        cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                candidate = getEntryKey(cdohash_entry);
                                value = getEntryValue(cdohash_entry);
                                if (NIL != (value.first().isInteger() ? numE(value.first(), right_arity) : T)) {
                                    final SubLObject item_var = candidate;
                                    if (NIL != member(item_var, relations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        continue;
                                    }
                                    relations = cons(item_var, relations);
                                }
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                        result = relations;
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$3, thread);
                        sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            $specific_term_relations$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject gather_all_specific_col_relations_alt(SubLObject col) {
        kb_mapping.map_gaf_arg_index(symbol_function(GATHER_SPECIFIC_COL_RELATIONS), col, THREE_INTEGER, $$argIsa, $TRUE, UNPROVIDED);
        return NIL;
    }

    public static SubLObject gather_all_specific_col_relations(final SubLObject col) {
        kb_mapping.map_gaf_arg_index(symbol_function(GATHER_SPECIFIC_COL_RELATIONS), col, THREE_INTEGER, $$argIsa, $TRUE, UNPROVIDED);
        return NIL;
    }

    /**
     * If the collection mentioned as the third argument in ASSERTION is being
     * searched then add the relation mentioned as the first argument to the
     * hash table *specific-term-relations*.
     */
    @LispMethod(comment = "If the collection mentioned as the third argument in ASSERTION is being\r\nsearched then add the relation mentioned as the first argument to the\r\nhash table *specific-term-relations*.\nIf the collection mentioned as the third argument in ASSERTION is being\nsearched then add the relation mentioned as the first argument to the\nhash table *specific-term-relations*.")
    public static final SubLObject gather_specific_col_relations_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject relation = assertions_high.gaf_arg1(assertion);
                    SubLObject collection = (NIL != forts.fort_p(relation)) ? ((SubLObject) (assertions_high.gaf_arg3(assertion))) : NIL;
                    if (NIL != forts.fort_p(collection)) {
                        if (NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread))) {
                            hash_table_utilities.pushnew_hash(relation, arity.arity(relation), $specific_term_relations$.getDynamicValue(thread), UNPROVIDED);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * If the collection mentioned as the third argument in ASSERTION is being
     * searched then add the relation mentioned as the first argument to the
     * hash table *specific-term-relations*.
     */
    @LispMethod(comment = "If the collection mentioned as the third argument in ASSERTION is being\r\nsearched then add the relation mentioned as the first argument to the\r\nhash table *specific-term-relations*.\nIf the collection mentioned as the third argument in ASSERTION is being\nsearched then add the relation mentioned as the first argument to the\nhash table *specific-term-relations*.")
    public static SubLObject gather_specific_col_relations(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject collection = (NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg3(assertion) : NIL;
            if ((NIL != forts.fort_p(collection)) && (NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread)))) {
                hash_table_utilities.pushnew_hash(relation, arity.arity(relation), $specific_term_relations$.getDynamicValue(thread), UNPROVIDED);
            }
        }
        return NIL;
    }

    /**
     * Returns CycL expressions that represent possible combinations of the terms in LIST-OF-TERMS
     * in the order presented.
     */
    @LispMethod(comment = "Returns CycL expressions that represent possible combinations of the terms in LIST-OF-TERMS\r\nin the order presented.\nReturns CycL expressions that represent possible combinations of the terms in LIST-OF-TERMS\nin the order presented.")
    public static final SubLObject legal_relations_of_terms_isa_alt(SubLObject list_of_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject relations = NIL;
                SubLObject answers = NIL;
                SubLObject right_arity = list_length(list_of_terms);
                {
                    SubLObject list_var = NIL;
                    SubLObject each_term = NIL;
                    SubLObject index = NIL;
                    for (list_var = list_of_terms, each_term = list_var.first(), index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , each_term = list_var.first() , index = add(ONE_INTEGER, index)) {
                        {
                            SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            {
                                SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject _prev_bind_0_4 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                                        SubLObject _prev_bind_1_5 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                            com.cyc.cycjava.cycl.rkf_relationship_suggestor.mark_all_term_isas(each_term);
                                            set_aref($term_isas$.getDynamicValue(thread), index, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread));
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_5, thread);
                                            sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_4, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                } finally {
                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1, thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                        set_aref($term_relations$.getDynamicValue(thread), index, make_hash_table($int$512, UNPROVIDED, UNPROVIDED));
                    }
                }
                {
                    SubLObject new_index = ZERO_INTEGER;
                    {
                        SubLObject _prev_bind_0 = $terms_candidate_relations$.currentBinding(thread);
                        try {
                            $terms_candidate_relations$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                            {
                                SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                {
                                    SubLObject _prev_bind_0_6 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject _prev_bind_0_7 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
                                            SubLObject _prev_bind_1_8 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                {
                                                    SubLObject cdolist_list_var = list_of_terms;
                                                    SubLObject each_term = NIL;
                                                    for (each_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_term = cdolist_list_var.first()) {
                                                        if (NIL != forts.fort_p(each_term)) {
                                                            isa.map_all_isa(symbol_function(GATHER_ALL_COL_LEGAL_RELATIONS), each_term, UNPROVIDED, UNPROVIDED);
                                                        } else {
                                                            {
                                                                SubLObject cdohash_table = aref($term_isas$.getDynamicValue(thread), new_index);
                                                                SubLObject each_isa_of_term = NIL;
                                                                SubLObject value = NIL;
                                                                {
                                                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                                                    try {
                                                                        while (iteratorHasNext(cdohash_iterator)) {
                                                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                                            each_isa_of_term = getEntryKey(cdohash_entry);
                                                                            value = getEntryValue(cdohash_entry);
                                                                            com.cyc.cycjava.cycl.rkf_relationship_suggestor.gather_all_col_legal_relations(each_isa_of_term);
                                                                        } 
                                                                    } finally {
                                                                        releaseEntrySetIterator(cdohash_iterator);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        new_index = add(new_index, ONE_INTEGER);
                                                    }
                                                }
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_8, thread);
                                                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    } finally {
                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1, thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                {
                                    SubLObject cdohash_table = $terms_candidate_relations$.getDynamicValue(thread);
                                    SubLObject candidate = NIL;
                                    SubLObject v_arity = NIL;
                                    {
                                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                        try {
                                            while (iteratorHasNext(cdohash_iterator)) {
                                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                                candidate = getEntryKey(cdohash_entry);
                                                v_arity = getEntryValue(cdohash_entry);
                                                if (((NIL != (v_arity.isInteger() ? ((SubLObject) (numE(v_arity, right_arity))) : T)) && (NIL != com.cyc.cycjava.cycl.rkf_relationship_suggestor.takes_all_terms_as_argsP(candidate, right_arity))) && (NIL != com.cyc.cycjava.cycl.rkf_relationship_suggestor.satisfies_all_arg_isasP(candidate, right_arity))) {
                                                    {
                                                        SubLObject item_var = candidate;
                                                        if (NIL == member(item_var, relations, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            relations = cons(item_var, relations);
                                                        }
                                                    }
                                                }
                                            } 
                                        } finally {
                                            releaseEntrySetIterator(cdohash_iterator);
                                        }
                                    }
                                }
                            }
                        } finally {
                            $terms_candidate_relations$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = relations;
                    SubLObject each_rel = NIL;
                    for (each_rel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each_rel = cdolist_list_var.first()) {
                        answers = cons(cons(each_rel, list_of_terms), answers);
                    }
                }
                return answers;
            }
        }
    }

    /**
     * Returns CycL expressions that represent possible combinations of the terms in LIST-OF-TERMS
     * in the order presented.
     */
    @LispMethod(comment = "Returns CycL expressions that represent possible combinations of the terms in LIST-OF-TERMS\r\nin the order presented.\nReturns CycL expressions that represent possible combinations of the terms in LIST-OF-TERMS\nin the order presented.")
    public static SubLObject legal_relations_of_terms_isa(final SubLObject list_of_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject relations = NIL;
        SubLObject answers = NIL;
        final SubLObject right_arity = list_length(list_of_terms);
        SubLObject list_var = NIL;
        SubLObject each_term = NIL;
        SubLObject index = NIL;
        list_var = list_of_terms;
        each_term = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , each_term = list_var.first() , index = add(ONE_INTEGER, index)) {
            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$5 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$6 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                        mark_all_term_isas(each_term);
                        set_aref($term_isas$.getDynamicValue(thread), index, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread));
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$6, thread);
                        sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_2, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0, thread);
            }
            set_aref($term_relations$.getDynamicValue(thread), index, make_hash_table($int$512, UNPROVIDED, UNPROVIDED));
        }
        SubLObject new_index = ZERO_INTEGER;
        final SubLObject _prev_bind_3 = $terms_candidate_relations$.currentBinding(thread);
        try {
            $terms_candidate_relations$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
            final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
            final SubLObject _prev_bind_0_$7 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$7 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                        SubLObject cdolist_list_var = list_of_terms;
                        SubLObject each_term2 = NIL;
                        each_term2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != forts.fort_p(each_term2)) {
                                isa.map_all_isa(symbol_function(GATHER_ALL_COL_LEGAL_RELATIONS), each_term2, UNPROVIDED, UNPROVIDED);
                            } else {
                                final SubLObject cdohash_table = aref($term_isas$.getDynamicValue(thread), new_index);
                                SubLObject each_isa_of_term = NIL;
                                SubLObject value = NIL;
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        each_isa_of_term = getEntryKey(cdohash_entry);
                                        value = getEntryValue(cdohash_entry);
                                        gather_all_col_legal_relations(each_isa_of_term);
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                            new_index = add(new_index, ONE_INTEGER);
                            cdolist_list_var = cdolist_list_var.rest();
                            each_term2 = cdolist_list_var.first();
                        } 
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$7, thread);
                        sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_4, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$7, thread);
            }
            final SubLObject cdohash_table2 = $terms_candidate_relations$.getDynamicValue(thread);
            SubLObject candidate = NIL;
            SubLObject v_arity = NIL;
            final Iterator cdohash_iterator2 = getEntrySetIterator(cdohash_table2);
            try {
                while (iteratorHasNext(cdohash_iterator2)) {
                    final Map.Entry cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                    candidate = getEntryKey(cdohash_entry2);
                    v_arity = getEntryValue(cdohash_entry2);
                    if (((NIL != (v_arity.isInteger() ? numE(v_arity, right_arity) : T)) && (NIL != takes_all_terms_as_argsP(candidate, right_arity))) && (NIL != satisfies_all_arg_isasP(candidate, right_arity))) {
                        final SubLObject item_var = candidate;
                        if (NIL != member(item_var, relations, symbol_function(EQL), symbol_function(IDENTITY))) {
                            continue;
                        }
                        relations = cons(item_var, relations);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator2);
            }
        } finally {
            $terms_candidate_relations$.rebind(_prev_bind_3, thread);
        }
        SubLObject cdolist_list_var2 = relations;
        SubLObject each_rel = NIL;
        each_rel = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            answers = cons(cons(each_rel, list_of_terms), answers);
            cdolist_list_var2 = cdolist_list_var2.rest();
            each_rel = cdolist_list_var2.first();
        } 
        return answers;
    }

    /**
     * Makes sure that all arg-isa collections for each of the arguments of RELATION are marked.
     */
    @LispMethod(comment = "Makes sure that all arg-isa collections for each of the arguments of RELATION are marked.")
    public static final SubLObject satisfies_all_arg_isasP_alt(SubLObject relation, SubLObject no_of_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = T;
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; !(index.numE(no_of_args) || (NIL == result)); index = add(index, ONE_INTEGER)) {
                    $candidate_relations_sbhl_space$.setDynamicValue(aref($term_isas$.getDynamicValue(thread), index), thread);
                    result = com.cyc.cycjava.cycl.rkf_relationship_suggestor.cr_all_arg_isa_cachedP(relation, add(index, ONE_INTEGER));
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Makes sure that all arg-isa collections for each of the arguments of RELATION are marked.")
    public static SubLObject satisfies_all_arg_isasP(final SubLObject relation, final SubLObject no_of_args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result;
        SubLObject index;
        for (result = T, index = NIL, index = ZERO_INTEGER; (!index.numE(no_of_args)) && (NIL != result); result = cr_all_arg_isa_cachedP(relation, add(index, ONE_INTEGER)) , index = add(index, ONE_INTEGER)) {
            $candidate_relations_sbhl_space$.setDynamicValue(aref($term_isas$.getDynamicValue(thread), index), thread);
        }
        return result;
    }/**
     * Makes sure that all arg-isa collections for each of the arguments of RELATION are marked.
     */


    /**
     * Makes sure that all arg-isa collections for the ARGNUM position of RELATION are marked.
     */
    @LispMethod(comment = "Makes sure that all arg-isa collections for the ARGNUM position of RELATION are marked.")
    public static final SubLObject cr_all_arg_isa_cachedP_alt(SubLObject relation, SubLObject argnum) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_boolean = NIL;
                {
                    SubLObject _prev_bind_0 = $cr_mapping_result$.currentBinding(thread);
                    try {
                        $cr_mapping_result$.bind(T, thread);
                        {
                            SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
                            kb_mapping.map_gaf_arg_index($sym12$CR_ARGISA_COL_SEARCHED_, relation, ONE_INTEGER, arg_isa_pred, $TRUE, UNPROVIDED);
                            v_boolean = $cr_mapping_result$.getDynamicValue(thread);
                        }
                    } finally {
                        $cr_mapping_result$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_boolean;
            }
        }
    }

    @LispMethod(comment = "Makes sure that all arg-isa collections for the ARGNUM position of RELATION are marked.")
    public static SubLObject cr_all_arg_isa_cachedP(final SubLObject relation, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = NIL;
        final SubLObject _prev_bind_0 = $cr_mapping_result$.currentBinding(thread);
        try {
            $cr_mapping_result$.bind(T, thread);
            final SubLObject arg_isa_pred = kb_accessors.arg_isa_pred(argnum, UNPROVIDED, UNPROVIDED);
            kb_mapping.map_gaf_arg_index($sym12$CR_ARGISA_COL_SEARCHED_, relation, ONE_INTEGER, arg_isa_pred, $TRUE, UNPROVIDED);
            v_boolean = $cr_mapping_result$.getDynamicValue(thread);
        } finally {
            $cr_mapping_result$.rebind(_prev_bind_0, thread);
        }
        return v_boolean;
    }/**
     * Makes sure that all arg-isa collections for the ARGNUM position of RELATION are marked.
     */


    /**
     * Makes sure that the arg-isa collection mentioned in ASSERTION is marked.
     */
    @LispMethod(comment = "Makes sure that the arg-isa collection mentioned in ASSERTION is marked.")
    public static final SubLObject cr_argisa_col_searchedP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject col = assertions_high.gaf_arg2(assertion);
                if (NIL != forts.fort_p(col)) {
                    if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, $candidate_relations_sbhl_space$.getDynamicValue(thread))) {
                        $cr_mapping_result$.setDynamicValue(NIL, thread);
                        mapping_finished();
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Makes sure that the arg-isa collection mentioned in ASSERTION is marked.")
    public static SubLObject cr_argisa_col_searchedP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject col = assertions_high.gaf_arg2(assertion);
        if ((NIL != forts.fort_p(col)) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, $candidate_relations_sbhl_space$.getDynamicValue(thread)))) {
            $cr_mapping_result$.setDynamicValue(NIL, thread);
            mapping_finished();
        }
        return NIL;
    }/**
     * Makes sure that the arg-isa collection mentioned in ASSERTION is marked.
     */


    /**
     * Makes sure that RELATION can take all the terms given as input to
     * LEGAL-RELATIONS-OF-TERMS-ISA as its arguments.
     */
    @LispMethod(comment = "Makes sure that RELATION can take all the terms given as input to\r\nLEGAL-RELATIONS-OF-TERMS-ISA as its arguments.\nMakes sure that RELATION can take all the terms given as input to\nLEGAL-RELATIONS-OF-TERMS-ISA as its arguments.")
    public static final SubLObject takes_all_terms_as_argsP_alt(SubLObject relation, SubLObject no_of_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = T;
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; !(index.numE(no_of_args) || (NIL == result)); index = add(index, ONE_INTEGER)) {
                    result = gethash(relation, aref($term_relations$.getDynamicValue(thread), index), UNPROVIDED);
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Makes sure that RELATION can take all the terms given as input to\r\nLEGAL-RELATIONS-OF-TERMS-ISA as its arguments.\nMakes sure that RELATION can take all the terms given as input to\nLEGAL-RELATIONS-OF-TERMS-ISA as its arguments.")
    public static SubLObject takes_all_terms_as_argsP(final SubLObject relation, final SubLObject no_of_args) {
        SubLThread thread;
        SubLObject result;
        SubLObject index;
        for (thread = SubLProcess.currentSubLThread(), result = T, index = NIL, index = ZERO_INTEGER; (!index.numE(no_of_args)) && (NIL != result); result = gethash(relation, aref($term_relations$.getDynamicValue(thread), index), UNPROVIDED) , index = add(index, ONE_INTEGER)) {
        }
        return result;
    }/**
     * Makes sure that RELATION can take all the terms given as input to
     * LEGAL-RELATIONS-OF-TERMS-ISA as its arguments.
     */


    /**
     * Gathers all the relations that refer to the collection COL in one of its argIsa constraints.
     */
    @LispMethod(comment = "Gathers all the relations that refer to the collection COL in one of its argIsa constraints.")
    public static final SubLObject gather_all_col_legal_relations_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread))) {
                sbhl_marking_methods.sbhl_record_node(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread));
                kb_mapping.map_gaf_arg_index(symbol_function(GATHER_COL_LEGAL_RELATIONS), col, THREE_INTEGER, $$argIsa, $TRUE, UNPROVIDED);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Gathers all the relations that refer to the collection COL in one of its argIsa constraints.")
    public static SubLObject gather_all_col_legal_relations(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread))) {
            sbhl_marking_methods.sbhl_record_node(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread));
            kb_mapping.map_gaf_arg_index(symbol_function(GATHER_COL_LEGAL_RELATIONS), col, THREE_INTEGER, $$argIsa, $TRUE, UNPROVIDED);
        }
        return NIL;
    }/**
     * Gathers all the relations that refer to the collection COL in one of its argIsa constraints.
     */


    /**
     * Adds the relation mentioned in the arg-isa constraint ASSERTION in the relation hash table
     * corresponding to the argument number mentioned in ASSERTION, if the collection mentioned
     * in ASSERTION is marked in the sbhl-space used to mark all-isas of the term corresponding
     * to the argument number mentioned in ASSERTION.
     */
    @LispMethod(comment = "Adds the relation mentioned in the arg-isa constraint ASSERTION in the relation hash table\r\ncorresponding to the argument number mentioned in ASSERTION, if the collection mentioned\r\nin ASSERTION is marked in the sbhl-space used to mark all-isas of the term corresponding\r\nto the argument number mentioned in ASSERTION.\nAdds the relation mentioned in the arg-isa constraint ASSERTION in the relation hash table\ncorresponding to the argument number mentioned in ASSERTION, if the collection mentioned\nin ASSERTION is marked in the sbhl-space used to mark all-isas of the term corresponding\nto the argument number mentioned in ASSERTION.")
    public static final SubLObject gather_col_legal_relations_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != assertions_high.gaf_assertionP(assertion)) {
                {
                    SubLObject relation = assertions_high.gaf_arg1(assertion);
                    SubLObject argnum = (NIL != forts.fort_p(relation)) ? ((SubLObject) (assertions_high.gaf_arg2(assertion))) : NIL;
                    SubLObject collection = (argnum.isInteger()) ? ((SubLObject) (assertions_high.gaf_arg3(assertion))) : NIL;
                    if (argnum.numG(ZERO_INTEGER) && argnum.numLE(rkf_tools.$rkf_max_arity$.getGlobalValue())) {
                        {
                            SubLObject space = aref($term_isas$.getDynamicValue(thread), subtract(argnum, ONE_INTEGER));
                            SubLObject relation_hash = (NIL != space) ? ((SubLObject) (aref($term_relations$.getDynamicValue(thread), subtract(argnum, ONE_INTEGER)))) : NIL;
                            if ((NIL != relation_hash) && (NIL != forts.fort_p(collection))) {
                                if (NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, space)) {
                                    hash_table_utilities.pushnew_hash(relation, argnum, relation_hash, UNPROVIDED);
                                    sethash(relation, $terms_candidate_relations$.getDynamicValue(thread), arity.arity(relation));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Adds the relation mentioned in the arg-isa constraint ASSERTION in the relation hash table\r\ncorresponding to the argument number mentioned in ASSERTION, if the collection mentioned\r\nin ASSERTION is marked in the sbhl-space used to mark all-isas of the term corresponding\r\nto the argument number mentioned in ASSERTION.\nAdds the relation mentioned in the arg-isa constraint ASSERTION in the relation hash table\ncorresponding to the argument number mentioned in ASSERTION, if the collection mentioned\nin ASSERTION is marked in the sbhl-space used to mark all-isas of the term corresponding\nto the argument number mentioned in ASSERTION.")
    public static SubLObject gather_col_legal_relations(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject argnum = (NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg2(assertion) : NIL;
            final SubLObject collection = (argnum.isInteger()) ? assertions_high.gaf_arg3(assertion) : NIL;
            if (argnum.numG(ZERO_INTEGER) && argnum.numLE(rkf_tools.$rkf_max_arity$.getGlobalValue())) {
                final SubLObject space = aref($term_isas$.getDynamicValue(thread), subtract(argnum, ONE_INTEGER));
                final SubLObject relation_hash = (NIL != space) ? aref($term_relations$.getDynamicValue(thread), subtract(argnum, ONE_INTEGER)) : NIL;
                if (((NIL != relation_hash) && (NIL != forts.fort_p(collection))) && (NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, space))) {
                    hash_table_utilities.pushnew_hash(relation, argnum, relation_hash, UNPROVIDED);
                    sethash(relation, $terms_candidate_relations$.getDynamicValue(thread), arity.arity(relation));
                }
            }
        }
        return NIL;
    }/**
     * Adds the relation mentioned in the arg-isa constraint ASSERTION in the relation hash table
     * corresponding to the argument number mentioned in ASSERTION, if the collection mentioned
     * in ASSERTION is marked in the sbhl-space used to mark all-isas of the term corresponding
     * to the argument number mentioned in ASSERTION.
     */


    /**
     * Marks all superiors (isas or defns) of TERM.
     */
    @LispMethod(comment = "Marks all superiors (isas or defns) of TERM.")
    public static final SubLObject mark_all_term_isas_alt(SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            isa.sbhl_record_all_isa(v_term, UNPROVIDED, UNPROVIDED);
        } else {
            if (NIL != nautP(v_term, UNPROVIDED)) {
                com.cyc.cycjava.cycl.rkf_relationship_suggestor.mark_all_isas_of_naut(v_term);
            } else {
                com.cyc.cycjava.cycl.rkf_relationship_suggestor.mark_all_defns_of_term(v_term);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Marks all superiors (isas or defns) of TERM.")
    public static SubLObject mark_all_term_isas(final SubLObject v_term) {
        if (NIL != forts.fort_p(v_term)) {
            isa.sbhl_record_all_isa(v_term, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != term.nautP(v_term, UNPROVIDED)) {
                mark_all_isas_of_naut(v_term);
            } else {
                mark_all_defns_of_term(v_term);
            }

        return NIL;
    }/**
     * Marks all superiors (isas or defns) of TERM.
     */


    /**
     * Marks all isas of the NAUT TERM.
     */
    @LispMethod(comment = "Marks all isas of the NAUT TERM.")
    public static final SubLObject mark_all_isas_of_naut_alt(SubLObject v_term) {
        {
            SubLObject functor = cycl_utilities.nat_functor(v_term);
            SubLObject result_isas = kb_accessors.result_isa(functor, UNPROVIDED);
            SubLObject result_isa_args = kb_accessors.result_isa_args(v_term, UNPROVIDED);
            {
                SubLObject cdolist_list_var = result_isas;
                SubLObject result_isa = NIL;
                for (result_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_isa = cdolist_list_var.first()) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), result_isa, UNPROVIDED, UNPROVIDED);
                }
            }
            {
                SubLObject cdolist_list_var = result_isa_args;
                SubLObject result_isa = NIL;
                for (result_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result_isa = cdolist_list_var.first()) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), result_isa, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Marks all isas of the NAUT TERM.")
    public static SubLObject mark_all_isas_of_naut(final SubLObject v_term) {
        final SubLObject functor = cycl_utilities.nat_functor(v_term);
        final SubLObject result_isas = kb_accessors.result_isa(functor, UNPROVIDED);
        final SubLObject result_isa_args = kb_accessors.result_isa_args(v_term, UNPROVIDED);
        SubLObject cdolist_list_var = result_isas;
        SubLObject result_isa = NIL;
        result_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), result_isa, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = result_isa_args;
        result_isa = NIL;
        result_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), result_isa, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            result_isa = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Marks all isas of the NAUT TERM.
     */


    /**
     * Marks all defns of the non-FORT/non-NAUT TERM; e.g. a string or number.
     */
    @LispMethod(comment = "Marks all defns of the non-FORT/non-NAUT TERM; e.g. a string or number.")
    public static final SubLObject mark_all_defns_of_term_alt(SubLObject v_term) {
        {
            SubLObject collections_admitting_term_via_defns = at_defns.collections_admitting_term_via_defns(v_term);
            SubLObject cdolist_list_var = collections_admitting_term_via_defns;
            SubLObject col = NIL;
            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Marks all defns of the non-FORT/non-NAUT TERM; e.g. a string or number.")
    public static SubLObject mark_all_defns_of_term(final SubLObject v_term) {
        SubLObject cdolist_list_var;
        final SubLObject collections_admitting_term_via_defns = cdolist_list_var = at_defns.collections_admitting_term_via_defns(v_term);
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return NIL;
    }/**
     * Marks all defns of the non-FORT/non-NAUT TERM; e.g. a string or number.
     */


    public static SubLObject declare_rkf_relationship_suggestor_file() {
        declareFunction("rkf_candidate_formulas_relating_terms", "RKF-CANDIDATE-FORMULAS-RELATING-TERMS", 2, 0, false);
        declareFunction("find_relations_of_terms", "FIND-RELATIONS-OF-TERMS", 1, 2, false);
        declareFunction("call_right_find_relations", "CALL-RIGHT-FIND-RELATIONS", 2, 0, false);
        declareFunction("specific_legal_relations_of_terms_isa", "SPECIFIC-LEGAL-RELATIONS-OF-TERMS-ISA", 2, 0, false);
        declareFunction("gather_all_specific_col_relations", "GATHER-ALL-SPECIFIC-COL-RELATIONS", 1, 0, false);
        declareFunction("gather_specific_col_relations", "GATHER-SPECIFIC-COL-RELATIONS", 1, 0, false);
        declareFunction("legal_relations_of_terms_isa", "LEGAL-RELATIONS-OF-TERMS-ISA", 1, 0, false);
        declareFunction("satisfies_all_arg_isasP", "SATISFIES-ALL-ARG-ISAS?", 2, 0, false);
        declareFunction("cr_all_arg_isa_cachedP", "CR-ALL-ARG-ISA-CACHED?", 2, 0, false);
        declareFunction("cr_argisa_col_searchedP", "CR-ARGISA-COL-SEARCHED?", 1, 0, false);
        declareFunction("takes_all_terms_as_argsP", "TAKES-ALL-TERMS-AS-ARGS?", 2, 0, false);
        declareFunction("gather_all_col_legal_relations", "GATHER-ALL-COL-LEGAL-RELATIONS", 1, 0, false);
        declareFunction("gather_col_legal_relations", "GATHER-COL-LEGAL-RELATIONS", 1, 0, false);
        declareFunction("mark_all_term_isas", "MARK-ALL-TERM-ISAS", 1, 0, false);
        declareFunction("mark_all_isas_of_naut", "MARK-ALL-ISAS-OF-NAUT", 1, 0, false);
        declareFunction("mark_all_defns_of_term", "MARK-ALL-DEFNS-OF-TERM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_relationship_suggestor_file() {
        defparameter("*SPECIFICITY-CUTOFF*", $float$5_0e_4);
        defparameter("*SPECIFIC-TERM-RELATIONS*", NIL);
        defparameter("*TERM-RELATIONS*", make_vector(rkf_tools.$rkf_max_arity$.getGlobalValue(), NIL));
        defparameter("*TERM-ISAS*", make_vector(rkf_tools.$rkf_max_arity$.getGlobalValue(), NIL));
        defparameter("*TERMS-CANDIDATE-RELATIONS*", NIL);
        defparameter("*CANDIDATE-RELATIONS-SBHL-SPACE*", NIL);
        defparameter("*CR-MAPPING-RESULT*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_relationship_suggestor_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_relationship_suggestor_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_relationship_suggestor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_relationship_suggestor_file();
    }

    static {
    }
}

/**
 * Total time: 376 ms
 */
