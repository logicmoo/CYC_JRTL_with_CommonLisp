package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.plausible_narts;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.plausibility_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_plausibility extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_plausibility";
    public static final String myFingerPrint = "139109a1efbc8f0721cacb41d4d3af9e12e67ce4a95bbe4d70406982728247e4";
    private static final SubLObject $const0$referentiallyEmptyNAT;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$REMOVAL_REFERENTIALLY_EMPTY_NAT;
    private static final SubLList $list3;
    private static final SubLObject $const4$sentencePlausibilityScore;
    private static final SubLSymbol $kw5$REMOVAL_SENTENCE_PLAUSIBILITY_SCORE;
    private static final SubLList $list6;
    private static final SubLObject $const7$NumericLikelihoodFn;
    private static final SubLObject $const8$plausibilityOfCollection;
    private static final SubLSymbol $kw9$REMOVAL_PLAUSIBILITY_OF_COLLECTION;
    private static final SubLList $list10;
    private static final SubLSymbol $kw11$OPAQUE;
    private static final SubLObject $const12$plausibilityOfSentence;
    private static final SubLSymbol $kw13$REMOVAL_PLAUSIBILITY_OF_SENTENCE;
    private static final SubLList $list14;
    private static final SubLObject $const15$subsumptionProbabilityOfDescripti;
    private static final SubLSymbol $kw16$REMOVAL_DISTANCE_BETWEEN_TERM_SETS;
    private static final SubLList $list17;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 1720L)
    public static SubLObject removal_referentially_empty_nat_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_plausibility.UNPROVIDED) {
            sense = (SubLObject)removal_modules_plausibility.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != cycl_grammar.fast_cycl_quoted_term_p(nat)) {
            nat = czer_utilities.unwrap_quotes(nat);
        }
        if (removal_modules_plausibility.NIL != nart_handles.nart_p(nat)) {
            nat = narts_high.nart_el_formula(nat);
        }
        thread.resetMultipleValues();
        final SubLObject result = plausibility_utilities.implausible_nautP(nat, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_plausibility.T, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_plausibility.NIL != result) {
            backward.removal_add_node(justification.first(), (SubLObject)removal_modules_plausibility.NIL, justification.rest());
        }
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 3061L)
    public static SubLObject removal_sentence_plausibility_score_expand(final SubLObject asent, SubLObject sense) {
        if (sense == removal_modules_plausibility.UNPROVIDED) {
            sense = (SubLObject)removal_modules_plausibility.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
            sentence = czer_utilities.unwrap_quotes(sentence);
        }
        sentence = cycl_utilities.hl_to_el(sentence);
        thread.resetMultipleValues();
        final SubLObject factor = plausibility_utilities.why_sentence_plausibility_factor(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (removal_modules_plausibility.NIL != factor) {
            final SubLObject likelihood = el_utilities.make_unary_formula(removal_modules_plausibility.$const7$NumericLikelihoodFn, arithmetic.possibly_sanitize_float(factor));
            final SubLObject v_bindings = unification_utilities.term_unify(var, likelihood, (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED);
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 4454L)
    public static SubLObject removal_plausibility_of_collection(final SubLObject asent, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != cycl_grammar.fast_cycl_quoted_term_p(nat)) {
            nat = czer_utilities.unwrap_quotes(nat);
        }
        if (removal_modules_plausibility.NIL != nart_handles.nart_p(nat)) {
            nat = narts_high.nart_el_formula(nat);
        }
        thread.resetMultipleValues();
        final SubLObject result = plausible_narts.find_plausibility_of_collection(nat, (SubLObject)removal_modules_plausibility.T, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != result && removal_modules_plausibility.NIL != justification) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_plausibility.NIL != result && removal_modules_plausibility.NIL == justification) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_plausibility.$kw11$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED), v_bindings, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        }
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 5914L)
    public static SubLObject removal_plausibility_of_sentence(final SubLObject asent, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
            sentence = czer_utilities.unwrap_quotes(sentence);
        }
        thread.resetMultipleValues();
        final SubLObject result = plausible_narts.find_plausibility_of_sentences(sentence, (SubLObject)removal_modules_plausibility.T, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != result && removal_modules_plausibility.NIL != justification) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_plausibility.NIL != result && removal_modules_plausibility.NIL == justification) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_plausibility.$kw11$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED), v_bindings, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        }
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-plausibility.lisp", position = 7547L)
    public static SubLObject removal_distance_between_term_sets(final SubLObject asent, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_1 = cycl_utilities.atomic_sentence_arg1(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject set_2 = cycl_utilities.atomic_sentence_arg2(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = plausible_narts.find_distance_between_term_sets(set_1, set_2, mt_relevance_macros.$mt$.getDynamicValue(thread), (SubLObject)removal_modules_plausibility.UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        if (removal_modules_plausibility.NIL != result && removal_modules_plausibility.NIL != justification) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if (removal_modules_plausibility.NIL != result && removal_modules_plausibility.NIL == justification) {
            backward.removal_add_node(arguments.make_hl_support((SubLObject)removal_modules_plausibility.$kw11$OPAQUE, bindings.apply_bindings(v_bindings, asent), (SubLObject)removal_modules_plausibility.UNPROVIDED, (SubLObject)removal_modules_plausibility.UNPROVIDED), v_bindings, (SubLObject)removal_modules_plausibility.UNPROVIDED);
        }
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    public static SubLObject declare_removal_modules_plausibility_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_plausibility", "removal_referentially_empty_nat_expand", "REMOVAL-REFERENTIALLY-EMPTY-NAT-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_plausibility", "removal_sentence_plausibility_score_expand", "REMOVAL-SENTENCE-PLAUSIBILITY-SCORE-EXPAND", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_plausibility", "removal_plausibility_of_collection", "REMOVAL-PLAUSIBILITY-OF-COLLECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_plausibility", "removal_plausibility_of_sentence", "REMOVAL-PLAUSIBILITY-OF-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_plausibility", "removal_distance_between_term_sets", "REMOVAL-DISTANCE-BETWEEN-TERM-SETS", 2, 0, false);
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    public static SubLObject init_removal_modules_plausibility_file() {
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    public static SubLObject setup_removal_modules_plausibility_file() {
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_plausibility.$const0$referentiallyEmptyNAT);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_plausibility.$kw1$POS, removal_modules_plausibility.$const0$referentiallyEmptyNAT, (SubLObject)removal_modules_plausibility.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_plausibility.$kw2$REMOVAL_REFERENTIALLY_EMPTY_NAT, (SubLObject)removal_modules_plausibility.$list3);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_plausibility.$const4$sentencePlausibilityScore);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_plausibility.$kw1$POS, removal_modules_plausibility.$const4$sentencePlausibilityScore, (SubLObject)removal_modules_plausibility.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_plausibility.$kw5$REMOVAL_SENTENCE_PLAUSIBILITY_SCORE, (SubLObject)removal_modules_plausibility.$list6);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_plausibility.$const8$plausibilityOfCollection);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_plausibility.$kw1$POS, removal_modules_plausibility.$const8$plausibilityOfCollection, (SubLObject)removal_modules_plausibility.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_plausibility.$kw9$REMOVAL_PLAUSIBILITY_OF_COLLECTION, (SubLObject)removal_modules_plausibility.$list10);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_plausibility.$const12$plausibilityOfSentence);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_plausibility.$kw1$POS, removal_modules_plausibility.$const12$plausibilityOfSentence, (SubLObject)removal_modules_plausibility.ONE_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_plausibility.$kw13$REMOVAL_PLAUSIBILITY_OF_SENTENCE, (SubLObject)removal_modules_plausibility.$list14);
        inference_modules.register_solely_specific_removal_module_predicate(removal_modules_plausibility.$const15$subsumptionProbabilityOfDescripti);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_plausibility.$kw1$POS, removal_modules_plausibility.$const15$subsumptionProbabilityOfDescripti, (SubLObject)removal_modules_plausibility.ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable((SubLObject)removal_modules_plausibility.$kw1$POS, removal_modules_plausibility.$const15$subsumptionProbabilityOfDescripti, (SubLObject)removal_modules_plausibility.TWO_INTEGER);
        inference_modules.inference_removal_module((SubLObject)removal_modules_plausibility.$kw16$REMOVAL_DISTANCE_BETWEEN_TERM_SETS, (SubLObject)removal_modules_plausibility.$list17);
        return (SubLObject)removal_modules_plausibility.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_removal_modules_plausibility_file();
    }
    
    @Override
	public void initializeVariables() {
        init_removal_modules_plausibility_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_removal_modules_plausibility_file();
    }
    
    static {
        me = (SubLFile)new removal_modules_plausibility();
        $const0$referentiallyEmptyNAT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("referentiallyEmptyNAT"));
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$REMOVAL_REFERENTIALLY_EMPTY_NAT = SubLObjectFactory.makeKeyword("REMOVAL-REFERENTIALLY-EMPTY-NAT");
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("referentiallyEmptyNAT")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("referentiallyEmptyNAT")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_plausibility.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-REFERENTIALLY-EMPTY-NAT-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$referentiallyEmptyNAT <fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$PlausibilityQueryMt\n (#$referentiallyEmptyNAT\n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog)))") });
        $const4$sentencePlausibilityScore = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentencePlausibilityScore"));
        $kw5$REMOVAL_SENTENCE_PLAUSIBILITY_SCORE = SubLObjectFactory.makeKeyword("REMOVAL-SENTENCE-PLAUSIBILITY-SCORE");
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentencePlausibilityScore")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sentencePlausibilityScore")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_plausibility.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-SENTENCE-PLAUSIBILITY-SCORE-EXPAND"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$sentencePlausibilityScore <fully-bound-p> <not-fully-bound-p>)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(#$ist #$PlausibilityQueryMt\n (#$sentencePlausibilityScore\n  (#$Quote (#$equalSymbols ?X (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog))) ?NUM))") });
        $const7$NumericLikelihoodFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericLikelihoodFn"));
        $const8$plausibilityOfCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plausibilityOfCollection"));
        $kw9$REMOVAL_PLAUSIBILITY_OF_COLLECTION = SubLObjectFactory.makeKeyword("REMOVAL-PLAUSIBILITY-OF-COLLECTION");
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plausibilityOfCollection")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plausibilityOfCollection")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_plausibility.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-PLAUSIBILITY-OF-COLLECTION"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$plausibilityOfCollection <fully-bound-p> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(plausibilityOfCollection \n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog) ?x))") });
        $kw11$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const12$plausibilityOfSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plausibilityOfSentence"));
        $kw13$REMOVAL_PLAUSIBILITY_OF_SENTENCE = SubLObjectFactory.makeKeyword("REMOVAL-PLAUSIBILITY-OF-SENTENCE");
        $list14 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plausibilityOfSentence")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plausibilityOfSentence")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_plausibility.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-PLAUSIBILITY-OF-SENTENCE"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$plausibilityOfSentence <fully-bound-p> ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(plausibilityOfSentence  \n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog) ?x))") });
        $const15$subsumptionProbabilityOfDescripti = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsumptionProbabilityOfDescriptionByDescription"));
        $kw16$REMOVAL_DISTANCE_BETWEEN_TERM_SETS = SubLObjectFactory.makeKeyword("REMOVAL-DISTANCE-BETWEEN-TERM-SETS");
        $list17 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("SENSE"), SubLObjectFactory.makeKeyword("POS"), SubLObjectFactory.makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsumptionProbabilityOfDescriptionByDescription")), SubLObjectFactory.makeKeyword("REQUIRED-PATTERN"), ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subsumptionProbabilityOfDescriptionByDescription")), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("FULLY-BOUND"), (SubLObject)SubLObjectFactory.makeKeyword("NOT-FULLY-BOUND")), SubLObjectFactory.makeKeyword("COST-EXPRESSION"), removal_modules_plausibility.THREE_INTEGER, SubLObjectFactory.makeKeyword("COMPLETENESS"), SubLObjectFactory.makeKeyword("COMPLETE"), SubLObjectFactory.makeKeyword("EXPAND"), SubLObjectFactory.makeSymbol("REMOVAL-DISTANCE-BETWEEN-TERM-SETS"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("(#$subsumptionProbabilityOfDescriptionByDescription <fully-bound-p> <fully bound>  ?x)"), SubLObjectFactory.makeKeyword("EXAMPLE"), SubLObjectFactory.makeString("(subsumptionProbabilityOfDescriptionByDescription SET-1 SET-2 ?x))") });
    }
}

/*

	Total time: 161 ms
	
*/