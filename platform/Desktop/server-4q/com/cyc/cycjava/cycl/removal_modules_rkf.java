package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_rkf extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.removal_modules_rkf";
    public static final String myFingerPrint = "90296c19f21fe16b0c421973137fb04657dbf8d7c931a9f77f2ddff8da016ed8";
    private static final SubLObject $const0$keAssertedTermSentences;
    private static final SubLSymbol $sym1$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const2$EverythingPSC;
    private static final SubLSymbol $kw3$OPAQUE;
    private static final SubLSymbol $kw4$REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE;
    private static final SubLList $list5;
    private static final SubLObject $const6$keComparisonSentences;
    private static final SubLSymbol $kw7$REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE;
    private static final SubLList $list8;
    private static final SubLObject $const9$keContrastingSentences;
    private static final SubLSymbol $kw10$REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE;
    private static final SubLList $list11;
    private static final SubLObject $const12$predicateArgIsaSummary;
    private static final SubLSymbol $kw13$REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY;
    private static final SubLList $list14;
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 1096L)
    public static SubLObject removal_ke_asserted_term_formulas_term_index_cost(final SubLObject v_term) {
        return kb_indexing.num_index(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 2367L)
    public static SubLObject removal_ke_asserted_term_formulas_index_variable_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        return removal_ke_asserted_term_formulas_term_index_cost(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 2826L)
    public static SubLObject removal_ke_asserted_term_formulas_index_variable_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = rkf_concept_summarizer.rkf_asserted_sentences(v_term, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject sentence = (SubLObject)removal_modules_rkf.NIL;
        sentence = cdolist_list_var.first();
        while (removal_modules_rkf.NIL != cdolist_list_var) {
            final SubLObject v_bindings = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(arg2, sentence));
            if (removal_modules_rkf.NIL != v_bindings) {
                SubLObject assertion = (SubLObject)removal_modules_rkf.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_rkf.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(removal_modules_rkf.$const2$EverythingPSC, thread);
                    assertion = czer_meta.find_assertion_cycl(sentence, (SubLObject)removal_modules_rkf.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                final SubLObject support = (removal_modules_rkf.NIL != assertion) ? assertion : arguments.make_hl_support((SubLObject)removal_modules_rkf.$kw3$OPAQUE, sentence, (SubLObject)removal_modules_rkf.UNPROVIDED, (SubLObject)removal_modules_rkf.UNPROVIDED);
                backward.removal_add_node(support, v_bindings, (SubLObject)removal_modules_rkf.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 4301L)
    public static SubLObject removal_ke_comparison_sentences_bound_terms_unbound_sentence_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLObject term1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject term2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        return Numbers.min(kb_indexing.num_index(term1), kb_indexing.num_index(term2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 4639L)
    public static SubLObject removal_ke_comparison_sentences_bound_terms_unbound_sentence_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject variable = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = rkf_tools.rkf_compare_terms(term1, term2, mt_relevance_macros.$mt$.getDynamicValue(thread));
        SubLObject sentence = (SubLObject)removal_modules_rkf.NIL;
        sentence = cdolist_list_var.first();
        while (removal_modules_rkf.NIL != cdolist_list_var) {
            final SubLObject v_bindings = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(variable, sentence));
            if (removal_modules_rkf.NIL != v_bindings) {
                SubLObject assertion = (SubLObject)removal_modules_rkf.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_rkf.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(removal_modules_rkf.$const2$EverythingPSC, thread);
                    assertion = czer_meta.find_assertion_cycl(sentence, (SubLObject)removal_modules_rkf.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                final SubLObject support = (removal_modules_rkf.NIL != assertion) ? assertion : arguments.make_hl_support((SubLObject)removal_modules_rkf.$kw3$OPAQUE, sentence, (SubLObject)removal_modules_rkf.UNPROVIDED, (SubLObject)removal_modules_rkf.UNPROVIDED);
                backward.removal_add_node(support, v_bindings, (SubLObject)removal_modules_rkf.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 6341L)
    public static SubLObject removal_ke_contrasting_sentences_bound_terms_unbound_sentence_cost(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLObject term1 = cycl_utilities.sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject term2 = cycl_utilities.sentence_arg2(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        return Numbers.min(kb_indexing.num_index(term1), kb_indexing.num_index(term2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 6680L)
    public static SubLObject removal_ke_contrasting_sentences_bound_terms_unbound_sentence_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject term1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject term2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject variable = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject common_sentences = rkf_tools.rkf_compare_terms(term1, term2, mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject term1_unique_sentences = thread.secondMultipleValue();
        final SubLObject term2_unique_sentences = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = term1_unique_sentences;
        SubLObject sentence = (SubLObject)removal_modules_rkf.NIL;
        sentence = cdolist_list_var.first();
        while (removal_modules_rkf.NIL != cdolist_list_var) {
            final SubLObject v_bindings = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(variable, sentence));
            if (removal_modules_rkf.NIL != v_bindings) {
                SubLObject assertion = (SubLObject)removal_modules_rkf.NIL;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)removal_modules_rkf.$sym1$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(removal_modules_rkf.$const2$EverythingPSC, thread);
                    assertion = czer_meta.find_assertion_cycl(sentence, (SubLObject)removal_modules_rkf.UNPROVIDED);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                final SubLObject support = (removal_modules_rkf.NIL != assertion) ? assertion : arguments.make_hl_support((SubLObject)removal_modules_rkf.$kw3$OPAQUE, sentence, (SubLObject)removal_modules_rkf.UNPROVIDED, (SubLObject)removal_modules_rkf.UNPROVIDED);
                backward.removal_add_node(support, v_bindings, (SubLObject)removal_modules_rkf.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        }
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/removal-modules-rkf.lisp", position = 9244L)
    public static SubLObject removal_predicate_arg_isa_summary_unify_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_rkf.UNPROVIDED) {
            sense = (SubLObject)removal_modules_rkf.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_rkf.UNPROVIDED);
        final SubLObject summary = rkf_concept_communicator.rkf_arg_type_summary_cycl_for_pred(predicate, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_rkf.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(asent, summary, (SubLObject)removal_modules_rkf.T, (SubLObject)removal_modules_rkf.T);
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_rkf.NIL != v_bindings) {
            return backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_rkf.$kw3$OPAQUE, summary, (SubLObject)removal_modules_rkf.UNPROVIDED, (SubLObject)removal_modules_rkf.UNPROVIDED), v_bindings, unify_justification);
        }
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    public static SubLObject declare_removal_modules_rkf_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_asserted_term_formulas_term_index_cost", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-TERM-INDEX-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_asserted_term_formulas_index_variable_cost", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_asserted_term_formulas_index_variable_expand", "REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_comparison_sentences_bound_terms_unbound_sentence_cost", "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_comparison_sentences_bound_terms_unbound_sentence_expand", "REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_contrasting_sentences_bound_terms_unbound_sentence_cost", "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_ke_contrasting_sentences_bound_terms_unbound_sentence_expand", "REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.removal_modules_rkf", "removal_predicate_arg_isa_summary_unify_expand", "REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY-EXPAND", 1, 1, false);
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    public static SubLObject init_removal_modules_rkf_file() {
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    public static SubLObject setup_removal_modules_rkf_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rkf.$const0$keAssertedTermSentences);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rkf.$kw4$REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE, (SubLObject)removal_modules_rkf.$list5);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rkf.$const6$keComparisonSentences);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rkf.$kw7$REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE, (SubLObject)removal_modules_rkf.$list8);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rkf.$const9$keContrastingSentences);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rkf.$kw10$REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE, (SubLObject)removal_modules_rkf.$list11);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_rkf.$const12$predicateArgIsaSummary);
        inference_modules.inference_removal_module((SubLObject)removal_modules_rkf.$kw13$REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY, (SubLObject)removal_modules_rkf.$list14);
        return (SubLObject)removal_modules_rkf.NIL;
    }
    
    public void declareFunctions() {
        declare_removal_modules_rkf_file();
    }
    
    public void initializeVariables() {
        init_removal_modules_rkf_file();
    }
    
    public void runTopLevelForms() {
        setup_removal_modules_rkf_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_rkf();
        $const0$keAssertedTermSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keAssertedTermSentences"));
        $sym1$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const2$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw3$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw4$REMOVAL_KE_ASSERTED_TERM_FORMULAS_INDEX_VARIABLE = SubLObjectFactory.makeKeyword("REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE");
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keAssertedTermSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keAssertedTermSentences")), (SubLObject)SubLObjectFactory.makeKeyword("FORT"), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KE-ASSERTED-TERM-FORMULAS-INDEX-VARIABLE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$keAssertedTermSentences <fort> <variable>)\nusing only the KB indexing, explicit assertions involving <fort>,\nand keIrrelevantTerm reasoning."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$keAssertedTermSentences #$Dog ?FORMULA))") });
        $const6$keComparisonSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keComparisonSentences"));
        $kw7$REMOVAL_KE_COMPARISON_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keComparisonSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keComparisonSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-OR-NAUT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-OR-NAUT-P"))), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KE-COMPARISON-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$keComparisonSentences <fully-bound1> <fully-bound2> <variable>)\ncalls rkf-compare-terms and returns the CycL sentences they have in common,\nin terms of <fully-bound1>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$keComparisonSentences #$Beer #$Wine ?FORMULA))") });
        $const9$keContrastingSentences = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keContrastingSentences"));
        $kw10$REMOVAL_KE_CONTRASTING_SENTENCES_BOUND_TERMS_UNBOUND_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE");
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keContrastingSentences")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keContrastingSentences")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-OR-NAUT-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-OR-NAUT-P"))), (SubLObject)SubLObjectFactory.makeKeyword("VARIABLE")), SubLObjectFactory.makeKeyword("COST"), SubLObjectFactory.makeSymbol("REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-COST"), SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-KE-CONTRASTING-SENTENCES-BOUND-TERMS-UNBOUND-SENTENCE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$keContrastingSentences <fully-bound1> <fully-bound2> <variable>)\ncalls rkf-compare-terms and returns the CycL sentences true of <fully-bound1>\nbut not <fully-bound2>."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$keContrastingSentences #$Beer #$Wine ?FORMULA))") });
        $const12$predicateArgIsaSummary = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateArgIsaSummary"));
        $kw13$REMOVAL_PREDICATE_ARG_ISA_SUMMARY_UNIFY = SubLObjectFactory.makeKeyword("REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateArgIsaSummary")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AND"), (SubLObject)ConsesLow.listS(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateArgIsaSummary")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), (SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"))), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_rkf.ONE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-PREDICATE-ARG-ISA-SUMMARY-UNIFY-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$predicateArgIsaSummary <fully-bound> . <not-fully-bound>) where ARG1 is a predicate."), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$predicateArgIsaSummary #$behaviorCapable . ?X)\n    (#$predicateArgIsaSummary #$behaviorCapable ?X . ?Y)\n    (#$predicateArgIsaSummary #$behaviorCapable ?X ?Y ?Z)") });
    }
}

/*

	Total time: 145 ms
	
*/