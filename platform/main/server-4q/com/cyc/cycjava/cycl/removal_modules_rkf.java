package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_rkf extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_rkf();

    public static final String myName = "com.cyc.cycjava.cycl.removal_modules_rkf";

    public static final String myFingerPrint = "90296c19f21fe16b0c421973137fb04657dbf8d7c931a9f77f2ddff8da016ed8";

    private static final SubLObject $$keAssertedTermSentences = reader_make_constant_shell(makeString("keAssertedTermSentences"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLSymbol $REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE = makeKeyword("REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE");

    public static final SubLList $list5 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("keAssertedTermSentences")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("keAssertedTermSentences")), makeKeyword("FORT"), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keAssertedTermSentences <fort> <variable>)\nusing only the KB indexing, explicit assertions involving <fort>,\nand keIrrelevantTerm reasoning."), makeKeyword("EXAMPLE"), makeString("(#$keAssertedTermSentences #$Dog ?FORMULA))") });

    private static final SubLObject $$keComparisonSentences = reader_make_constant_shell(makeString("keComparisonSentences"));

    private static final SubLSymbol $REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE = makeKeyword("REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE");

    public static final SubLList $list8 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("keComparisonSentences")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("keComparisonSentences")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("FORT-OR-NAUT-P"))), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("FORT-OR-NAUT-P"))), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keComparisonSentences <fully-bound1> <fully-bound2> <variable>)\ncalls rkf-compare-terms and returns the CycL sentences they have in common,\nin terms of <fully-bound1>."), makeKeyword("EXAMPLE"), makeString("(#$keComparisonSentences #$Beer #$Wine ?FORMULA))") });

    private static final SubLObject $$keContrastingSentences = reader_make_constant_shell(makeString("keContrastingSentences"));

    private static final SubLSymbol $REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE = makeKeyword("REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("keContrastingSentences")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("keContrastingSentences")), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("FORT-OR-NAUT-P"))), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("FORT-OR-NAUT-P"))), makeKeyword("VARIABLE")), makeKeyword("COST"), makeSymbol("REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$keContrastingSentences <fully-bound1> <fully-bound2> <variable>)\ncalls rkf-compare-terms and returns the CycL sentences true of <fully-bound1>\nbut not <fully-bound2>."), makeKeyword("EXAMPLE"), makeString("(#$keContrastingSentences #$Beer #$Wine ?FORMULA))") });

    private static final SubLObject $$predicateArgIsaSummary = reader_make_constant_shell(makeString("predicateArgIsaSummary"));

    private static final SubLSymbol $REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY = makeKeyword("REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY");

    public static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("predicateArgIsaSummary")), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(reader_make_constant_shell(makeString("predicateArgIsaSummary")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), listS(makeKeyword("ANYTHING"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("Predicate"))), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$predicateArgIsaSummary <fully-bound> . <not-fully-bound>) where ARG1 is a predicate."), makeKeyword("EXAMPLE"), makeString("(#$predicateArgIsaSummary #$behaviorCapable . ?X)\n    (#$predicateArgIsaSummary #$behaviorCapable ?X . ?Y)\n    (#$predicateArgIsaSummary #$behaviorCapable ?X ?Y ?Z)") });

    public static SubLObject removal_ke_asserted_term_formulas_term_index_cost(final SubLObject v_term) {
        return kb_indexing.num_index(v_term);
    }

    public static SubLObject removal_ke_asserted_term_formulas_index_variable_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return removal_ke_asserted_term_formulas_term_index_cost(v_term);
    }

    public static SubLObject removal_ke_asserted_term_formulas_index_variable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = rkf_concept_summarizer.rkf_asserted_sentences(v_term, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = list(cons(arg2, sentence));
            if (NIL != v_bindings) {
                SubLObject assertion = NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                final SubLObject support = (NIL != assertion) ? assertion : arguments.make_hl_support($OPAQUE, sentence, UNPROVIDED, UNPROVIDED);
                backward.removal_add_node(support, v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_ke_comparison_sentences_bound_terms_unbound_sentence_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject term1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
        return min(kb_indexing.num_index(term1), kb_indexing.num_index(term2));
    }

    public static SubLObject removal_ke_comparison_sentences_bound_terms_unbound_sentence_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject variable = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = rkf_tools.rkf_compare_terms(term1, term2, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = list(cons(variable, sentence));
            if (NIL != v_bindings) {
                SubLObject assertion = NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                final SubLObject support = (NIL != assertion) ? assertion : arguments.make_hl_support($OPAQUE, sentence, UNPROVIDED, UNPROVIDED);
                backward.removal_add_node(support, v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_ke_contrasting_sentences_bound_terms_unbound_sentence_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject term1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
        return min(kb_indexing.num_index(term1), kb_indexing.num_index(term2));
    }

    public static SubLObject removal_ke_contrasting_sentences_bound_terms_unbound_sentence_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject variable = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject common_sentences = rkf_tools.rkf_compare_terms(term1, term2, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject term1_unique_sentences = thread.secondMultipleValue();
        final SubLObject term2_unique_sentences = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = term1_unique_sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_bindings = list(cons(variable, sentence));
            if (NIL != v_bindings) {
                SubLObject assertion = NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                final SubLObject support = (NIL != assertion) ? assertion : arguments.make_hl_support($OPAQUE, sentence, UNPROVIDED, UNPROVIDED);
                backward.removal_add_node(support, v_bindings, UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_predicate_arg_isa_summary_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject summary = rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred(predicate, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(asent, summary, T, T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != v_bindings) {
            return backward.removal_add_node(arguments.make_hl_support($OPAQUE, summary, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_rkf_file() {
        declareFunction(me, "removal_ke_asserted_term_formulas_term_index_cost", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-TERM-INDEX-COST", 1, 0, false);
        declareFunction(me, "removal_ke_asserted_term_formulas_index_variable_cost", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-COST", 1, 1, false);
        declareFunction(me, "removal_ke_asserted_term_formulas_index_variable_expand", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_ke_comparison_sentences_bound_terms_unbound_sentence_cost", "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST", 1, 1, false);
        declareFunction(me, "removal_ke_comparison_sentences_bound_terms_unbound_sentence_expand", "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_ke_contrasting_sentences_bound_terms_unbound_sentence_cost", "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST", 1, 1, false);
        declareFunction(me, "removal_ke_contrasting_sentences_bound_terms_unbound_sentence_expand", "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND", 1, 1, false);
        declareFunction(me, "removal_predicate_arg_isa_summary_unify_expand", "REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_rkf_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_rkf_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$keAssertedTermSentences);
        inference_modules.inference_removal_module($REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE, $list5);
        inference_modules.register_solely_specific_removal_module_predicate($$keComparisonSentences);
        inference_modules.inference_removal_module($REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE, $list8);
        inference_modules.register_solely_specific_removal_module_predicate($$keContrastingSentences);
        inference_modules.inference_removal_module($REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE, $list11);
        inference_modules.register_solely_specific_removal_module_predicate($$predicateArgIsaSummary);
        inference_modules.inference_removal_module($REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY, $list14);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_rkf_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_rkf_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_rkf_file();
    }

    
}

/**
 * Total time: 145 ms
 */
