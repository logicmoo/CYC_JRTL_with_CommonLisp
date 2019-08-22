package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arithmetic;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.plausibility_utilities;
import com.cyc.cycjava.cycl.plausible_narts;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_plausibility extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new removal_modules_plausibility();

    public static final String myName = "com.cyc.cycjava_2.cycl.inference.modules.removal.removal_modules_plausibility";


    private static final SubLObject $$referentiallyEmptyNAT = reader_make_constant_shell(makeString("referentiallyEmptyNAT"));



    private static final SubLSymbol $REMOVAL_REFERENTIALLY_EMPTY_NAT = makeKeyword("REMOVAL-REFERENTIALLY-EMPTY-NAT");

    private static final SubLList $list3 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("referentiallyEmptyNAT")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("referentiallyEmptyNAT")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-REFERENTIALLY-EMPTY-NAT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$referentiallyEmptyNAT <fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$ist #$PlausibilityQueryMt\n (#$referentiallyEmptyNAT\n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog)))") });

    private static final SubLObject $$sentencePlausibilityScore = reader_make_constant_shell(makeString("sentencePlausibilityScore"));

    private static final SubLSymbol $REMOVAL_SENTENCE_PLAUSIBILITY_SCORE = makeKeyword("REMOVAL-SENTENCE-PLAUSIBILITY-SCORE");

    private static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("sentencePlausibilityScore")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("sentencePlausibilityScore")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SENTENCE-PLAUSIBILITY-SCORE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$sentencePlausibilityScore <fully-bound-p> <not-fully-bound-p>)"), makeKeyword("EXAMPLE"), makeString("(#$ist #$PlausibilityQueryMt\n (#$sentencePlausibilityScore\n  (#$Quote (#$equalSymbols ?X (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog))) ?NUM))") });

    private static final SubLObject $$NumericLikelihoodFn = reader_make_constant_shell(makeString("NumericLikelihoodFn"));

    private static final SubLObject $$plausibilityOfCollection = reader_make_constant_shell(makeString("plausibilityOfCollection"));

    private static final SubLSymbol $REMOVAL_PLAUSIBILITY_OF_COLLECTION = makeKeyword("REMOVAL-PLAUSIBILITY-OF-COLLECTION");

    private static final SubLList $list10 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("plausibilityOfCollection")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("plausibilityOfCollection")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-PLAUSIBILITY-OF-COLLECTION"), makeKeyword("DOCUMENTATION"), makeString("(#$plausibilityOfCollection <fully-bound-p> ?x)"), makeKeyword("EXAMPLE"), makeString("(plausibilityOfCollection \n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog) ?x))") });



    private static final SubLObject $$plausibilityOfSentence = reader_make_constant_shell(makeString("plausibilityOfSentence"));

    private static final SubLSymbol $REMOVAL_PLAUSIBILITY_OF_SENTENCE = makeKeyword("REMOVAL-PLAUSIBILITY-OF-SENTENCE");

    private static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("plausibilityOfSentence")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("plausibilityOfSentence")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-PLAUSIBILITY-OF-SENTENCE"), makeKeyword("DOCUMENTATION"), makeString("(#$plausibilityOfSentence <fully-bound-p> ?x)"), makeKeyword("EXAMPLE"), makeString("(plausibilityOfSentence  \n  (#$SubcollectionOfWithRelationToTypeFn #$PlayingAMusicalInstrument #$doneBy #$Dog) ?x))") });

    private static final SubLObject $const15$subsumptionProbabilityOfDescripti = reader_make_constant_shell(makeString("subsumptionProbabilityOfDescriptionByDescription"));

    private static final SubLSymbol $REMOVAL_DISTANCE_BETWEEN_TERM_SETS = makeKeyword("REMOVAL-DISTANCE-BETWEEN-TERM-SETS");

    private static final SubLList $list17 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("subsumptionProbabilityOfDescriptionByDescription")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("subsumptionProbabilityOfDescriptionByDescription")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), THREE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-DISTANCE-BETWEEN-TERM-SETS"), makeKeyword("DOCUMENTATION"), makeString("(#$subsumptionProbabilityOfDescriptionByDescription <fully-bound-p> <fully bound>  ?x)"), makeKeyword("EXAMPLE"), makeString("(subsumptionProbabilityOfDescriptionByDescription SET-1 SET-2 ?x))") });

    public static SubLObject removal_referentially_empty_nat_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(nat)) {
            nat = czer_utilities.unwrap_quotes(nat);
        }
        if (NIL != nart_handles.nart_p(nat)) {
            nat = narts_high.nart_el_formula(nat);
        }
        thread.resetMultipleValues();
        final SubLObject result = plausibility_utilities.implausible_nautP(nat, mt_relevance_macros.$mt$.getDynamicValue(thread), T, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != result) {
            backward.removal_add_node(justification.first(), NIL, justification.rest());
        }
        return NIL;
    }

    public static SubLObject removal_sentence_plausibility_score_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
            sentence = czer_utilities.unwrap_quotes(sentence);
        }
        sentence = cycl_utilities.hl_to_el(sentence);
        thread.resetMultipleValues();
        final SubLObject factor = plausibility_utilities.why_sentence_plausibility_factor(sentence, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != factor) {
            final SubLObject likelihood = make_unary_formula($$NumericLikelihoodFn, arithmetic.possibly_sanitize_float(factor));
            final SubLObject v_bindings = unification_utilities.term_unify(var, likelihood, UNPROVIDED, UNPROVIDED);
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        return NIL;
    }

    public static SubLObject removal_plausibility_of_collection(final SubLObject asent, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nat = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(nat)) {
            nat = czer_utilities.unwrap_quotes(nat);
        }
        if (NIL != nart_handles.nart_p(nat)) {
            nat = narts_high.nart_el_formula(nat);
        }
        thread.resetMultipleValues();
        final SubLObject result = plausible_narts.find_plausibility_of_collection(nat, T, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if ((NIL != result) && (NIL != justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && (NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_plausibility_of_sentence(final SubLObject asent, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        if (NIL != cycl_grammar.fast_cycl_quoted_term_p(sentence)) {
            sentence = czer_utilities.unwrap_quotes(sentence);
        }
        thread.resetMultipleValues();
        final SubLObject result = plausible_narts.find_plausibility_of_sentences(sentence, T, UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if ((NIL != result) && (NIL != justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && (NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject removal_distance_between_term_sets(final SubLObject asent, final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject set_2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject var = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject result = plausible_narts.find_distance_between_term_sets(set_1, set_2, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify(var, result, UNPROVIDED, UNPROVIDED);
        if ((NIL != result) && (NIL != justification)) {
            backward.removal_add_node(justification.first(), v_bindings, justification.rest());
        }
        if ((NIL != result) && (NIL == justification)) {
            backward.removal_add_node(arguments.make_hl_support($OPAQUE, bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_plausibility_file() {
        declareFunction("removal_referentially_empty_nat_expand", "REMOVAL-REFERENTIALLY-EMPTY-NAT-EXPAND", 1, 1, false);
        declareFunction("removal_sentence_plausibility_score_expand", "REMOVAL-SENTENCE-PLAUSIBILITY-SCORE-EXPAND", 1, 1, false);
        declareFunction("removal_plausibility_of_collection", "REMOVAL-PLAUSIBILITY-OF-COLLECTION", 2, 0, false);
        declareFunction("removal_plausibility_of_sentence", "REMOVAL-PLAUSIBILITY-OF-SENTENCE", 2, 0, false);
        declareFunction("removal_distance_between_term_sets", "REMOVAL-DISTANCE-BETWEEN-TERM-SETS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_plausibility_file() {
        return NIL;
    }

    public static SubLObject setup_removal_modules_plausibility_file() {
        inference_modules.register_solely_specific_removal_module_predicate($$referentiallyEmptyNAT);
        preference_modules.doomed_unless_arg_bindable($POS, $$referentiallyEmptyNAT, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_REFERENTIALLY_EMPTY_NAT, $list3);
        inference_modules.register_solely_specific_removal_module_predicate($$sentencePlausibilityScore);
        preference_modules.doomed_unless_arg_bindable($POS, $$sentencePlausibilityScore, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_SENTENCE_PLAUSIBILITY_SCORE, $list6);
        inference_modules.register_solely_specific_removal_module_predicate($$plausibilityOfCollection);
        preference_modules.doomed_unless_arg_bindable($POS, $$plausibilityOfCollection, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PLAUSIBILITY_OF_COLLECTION, $list10);
        inference_modules.register_solely_specific_removal_module_predicate($$plausibilityOfSentence);
        preference_modules.doomed_unless_arg_bindable($POS, $$plausibilityOfSentence, ONE_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_PLAUSIBILITY_OF_SENTENCE, $list14);
        inference_modules.register_solely_specific_removal_module_predicate($const15$subsumptionProbabilityOfDescripti);
        preference_modules.doomed_unless_arg_bindable($POS, $const15$subsumptionProbabilityOfDescripti, ONE_INTEGER);
        preference_modules.doomed_unless_arg_bindable($POS, $const15$subsumptionProbabilityOfDescripti, TWO_INTEGER);
        inference_modules.inference_removal_module($REMOVAL_DISTANCE_BETWEEN_TERM_SETS, $list17);
        return NIL;
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

    
}

/**
 * Total time: 161 ms
 */
