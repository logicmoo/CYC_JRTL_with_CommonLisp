package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mt_suggestor extends SubLTranslatedFile {
    public static final SubLFile me = new mt_suggestor();

    public static final String myName = "com.cyc.cycjava.cycl.mt_suggestor";

    public static final String myFingerPrint = "2c39bcf7f5a0e4e591febd0ea8e36fc5ed345f9a20939e3f88c6863a84bd2b62";

    // defparameter
    public static final SubLSymbol $mts_forbid_lexical_mts$ = makeSymbol("*MTS-FORBID-LEXICAL-MTS*");

    // defparameter
    public static final SubLSymbol $mts_forbid_project_mts$ = makeSymbol("*MTS-FORBID-PROJECT-MTS*");

    // defparameter
    public static final SubLSymbol $mts_forbid_high_level_mts_for_content_assertions$ = makeSymbol("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*");

    // defparameter
    private static final SubLSymbol $predicate_determined_gaf_cutoff_percent$ = makeSymbol("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*");

    // defparameter
    private static final SubLSymbol $predicate_determined_gaf_cutoff_number$ = makeSymbol("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*");

    // deflexical
    private static final SubLSymbol $mtsugg_related_assertion_formulas_query_properties$ = makeSymbol("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $mtsugg_related_assertion_formulas_query_mt$ = makeSymbol("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*");



    // deflexical
    private static final SubLSymbol $mtsugg_too_general_term_filter$ = makeSymbol("*MTSUGG-TOO-GENERAL-TERM-FILTER*");

    // deflexical
    private static final SubLSymbol $mtsugg_too_general_collection_filter$ = makeSymbol("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*");

    // deflexical
    private static final SubLSymbol $mtsugg_too_general_quoted_collection_filter$ = makeSymbol("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*");



    // deflexical
    private static final SubLSymbol $examination_formulas$ = makeSymbol("*EXAMINATION-FORMULAS*");

    // deflexical
    private static final SubLSymbol $examination_mts$ = makeSymbol("*EXAMINATION-MTS*");

    // deflexical
    private static final SubLSymbol $mts_incorrect_formulas$ = makeSymbol("*MTS-INCORRECT-FORMULAS*");

    // deflexical
    private static final SubLSymbol $mts_actual_mts$ = makeSymbol("*MTS-ACTUAL-MTS*");

    // deflexical
    private static final SubLSymbol $mts_guessed_mts$ = makeSymbol("*MTS-GUESSED-MTS*");



    public static final SubLSymbol $sym1$MTS_NOT_COMMONSENSE_MT_ = makeSymbol("MTS-NOT-COMMONSENSE-MT?");



    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLFloat $float$0_8 = makeDouble(0.8);

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLObject $$LexicalMicrotheory = reader_make_constant_shell(makeString("LexicalMicrotheory"));

    private static final SubLObject $$ProjectMicrotheory = reader_make_constant_shell(makeString("ProjectMicrotheory"));

    private static final SubLObject $$ApplicationContext = reader_make_constant_shell(makeString("ApplicationContext"));

    private static final SubLObject $$SourceMicrotheory = reader_make_constant_shell(makeString("SourceMicrotheory"));

    private static final SubLObject $$MappingMicrotheory = reader_make_constant_shell(makeString("MappingMicrotheory"));

    private static final SubLObject $$ProblemSolvingCntxt = reader_make_constant_shell(makeString("ProblemSolvingCntxt"));

    public static final SubLList $list13 = list(new SubLObject[]{ makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("MAX-TIME"), makeInteger(30), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("CONTINUABLE?"), T, makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY") });

    public static final SubLList $list14 = list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now"))));

    public static final SubLSymbol $sym15$GAF_ = makeSymbol("GAF?");

    public static final SubLSymbol $sym16$_X = makeSymbol("?X");

    public static final SubLSymbol $sym17$_MT = makeSymbol("?MT");



    private static final SubLObject $$ist_Asserted = reader_make_constant_shell(makeString("ist-Asserted"));

    public static final SubLSymbol ASSERTION_MONAD_MT = makeSymbol("ASSERTION-MONAD-MT");



    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLFloat $float$0_2 = makeDouble(0.2);

    public static final SubLSymbol FREQUENCY_LIST_OF_MTS = makeSymbol("FREQUENCY-LIST-OF-MTS");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    public static final SubLSymbol $frequency_list_of_mts_caching_state$ = makeSymbol("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*");

    private static final SubLSymbol $sym31$MTS_TOO_GENERAL_ = makeSymbol("MTS-TOO-GENERAL?");

    private static final SubLObject $$Dog = reader_make_constant_shell(makeString("Dog"));

    private static final SubLSymbol $sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_ = makeSymbol("MTS-TOO-GENERAL-LIGHT-FILTERING?");



    private static final SubLSymbol $sym35$_ = makeSymbol(">");

    private static final SubLSymbol CADDR = makeSymbol("CADDR");



    private static final SubLList $list38 = list(new SubLObject[]{ reader_make_constant_shell(makeString("implies")), reader_make_constant_shell(makeString("and")), reader_make_constant_shell(makeString("not")), reader_make_constant_shell(makeString("or")), reader_make_constant_shell(makeString("termOfUnit")), reader_make_constant_shell(makeString("equals")), reader_make_constant_shell(makeString("ExistingObjectType")), reader_make_constant_shell(makeString("thereExists")), reader_make_constant_shell(makeString("forAll")), reader_make_constant_shell(makeString("comment")), reader_make_constant_shell(makeString("cyclistNotes")), reader_make_constant_shell(makeString("sharedNotes")), reader_make_constant_shell(makeString("different")), reader_make_constant_shell(makeString("Predicate")), reader_make_constant_shell(makeString("unknownSentence")), reader_make_constant_shell(makeString("similarTo")), reader_make_constant_shell(makeString("CollectionType")), reader_make_constant_shell(makeString("abnormal")), reader_make_constant_shell(makeString("evaluate")) });

    public static final SubLList $list39 = list(reader_make_constant_shell(makeString("MetaRelation")), reader_make_constant_shell(makeString("KEFaciliationPredicate")));

    public static final SubLList $list40 = list(reader_make_constant_shell(makeString("CoreConstant")));

    private static final SubLObject $$MetaRelation = reader_make_constant_shell(makeString("MetaRelation"));

    private static final SubLObject $$CoreConstant = reader_make_constant_shell(makeString("CoreConstant"));

    private static final SubLObject $$KEFacilitationPredicate = reader_make_constant_shell(makeString("KEFacilitationPredicate"));

    private static final SubLInteger $int$20000 = makeInteger(20000);





    private static final SubLSymbol TOP_MT_PERCENT_COUNT = makeSymbol("TOP-MT-PERCENT-COUNT");

    private static final SubLSymbol $sym48$_ = makeSymbol("+");



    private static final SubLSymbol $top_mt_percent_count_caching_state$ = makeSymbol("*TOP-MT-PERCENT-COUNT-CACHING-STATE*");

    private static final SubLInteger $int$25 = makeInteger(25);







    private static final SubLList $list55 = list(new SubLObject[]{ makeSymbol("RUN-LARGE-COMMONSENSE-MT-RULES-TEST"), makeSymbol("RUN-BASE-KB-RULES-TEST"), makeSymbol("RUN-LEXICAL-RULES-TEST"), makeSymbol("RUN-LEXICAL-GAFS-TEST"), makeSymbol("RUN-LARGE-COMMONSENSE-MT-GAFS-TEST"), makeSymbol("RUN-META-PREDICATES-TEST"), makeSymbol("RUN-RULE-MACRO-PREDICATES-TEST"), makeSymbol("RUN-NEW-PROJECT-ASSERTIONS-TEST"), makeSymbol("RUN-OLD-PROJECT-ASSERTIONS-TEST") });

    private static final SubLString $str56$Running_test__ = makeString("Running test: ");

    private static final SubLString $str57$_RESULTS__ = makeString(" RESULTS: ");

    private static final SubLString $str58$Incorrect_Formula__ = makeString("Incorrect Formula: ");

    private static final SubLString $str59$Suggested_Mt__ = makeString("Suggested Mt: ");

    private static final SubLString $str60$Actual_Mt__ = makeString("Actual Mt: ");

    private static final SubLString $str61$Frequency_list_of_suggested_mts__ = makeString("Frequency list of suggested mts: ");

    private static final SubLString $str62$Frequency_list_of_actual_mts__ = makeString("Frequency list of actual mts: ");

    private static final SubLObject $$SAICLegacyAssertionsMt = reader_make_constant_shell(makeString("SAICLegacyAssertionsMt"));

    private static final SubLObject $$PredicatePopulationMt = reader_make_constant_shell(makeString("PredicatePopulationMt"));

    private static final SubLObject $$TestVocabularyMt = reader_make_constant_shell(makeString("TestVocabularyMt"));

    private static final SubLObject $$MotleyFoolUKGlossaryMt = reader_make_constant_shell(makeString("MotleyFoolUKGlossaryMt"));

    private static final SubLObject $$WebSearchEnhancementMt = reader_make_constant_shell(makeString("WebSearchEnhancementMt"));

    private static final SubLObject $$DesertShieldMt = reader_make_constant_shell(makeString("DesertShieldMt"));

    private static final SubLObject $$OilEconModelMt = reader_make_constant_shell(makeString("OilEconModelMt"));

    private static final SubLObject $$Y2Scenario_Stage1Mt = reader_make_constant_shell(makeString("Y2Scenario-Stage1Mt"));

    private static final SubLObject $$BeachWalkIMt = reader_make_constant_shell(makeString("BeachWalkIMt"));

    private static final SubLObject $$PQ204Mt = reader_make_constant_shell(makeString("PQ204Mt"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$MetaPredicate = reader_make_constant_shell(makeString("MetaPredicate"));

    private static final SubLObject $$RuleMacroPredicate = reader_make_constant_shell(makeString("RuleMacroPredicate"));

    private static final SubLObject $$BiologyMt = reader_make_constant_shell(makeString("BiologyMt"));

    private static final SubLObject $$ModernMilitaryTacticsMt = reader_make_constant_shell(makeString("ModernMilitaryTacticsMt"));

    private static final SubLObject $$HumanSocialLifeMt = reader_make_constant_shell(makeString("HumanSocialLifeMt"));

    private static final SubLObject $$ChemistryMt = reader_make_constant_shell(makeString("ChemistryMt"));

    private static final SubLObject $$EnglishLexiconMt = reader_make_constant_shell(makeString("EnglishLexiconMt"));

    private static final SubLObject $$EnglishParaphraseMt = reader_make_constant_shell(makeString("EnglishParaphraseMt"));

    private static final SubLObject $$LogicalTruthMt = reader_make_constant_shell(makeString("LogicalTruthMt"));

    private static final SubLObject $$LogicalTruthImplementationMt = reader_make_constant_shell(makeString("LogicalTruthImplementationMt"));

    private static final SubLObject $$CoreCycLMt = reader_make_constant_shell(makeString("CoreCycLMt"));

    private static final SubLString $str86$Trying_Formula__ = makeString("Trying Formula: ");

    private static final SubLString $$$Got_ = makeString("Got ");

    private static final SubLString $$$_out_of_ = makeString(" out of ");







    private static final SubLString $str92$do_broad_mt_index = makeString("do-broad-mt-index");





    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static SubLObject suggest_mt(final SubLObject formula) {
        assert NIL != el_formula_p(formula) : "el_utilities.el_formula_p(formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(formula) " + formula;
        if (NIL != gafP(formula)) {
            return suggest_mt_for_gaf(formula);
        }
        return suggest_mt_by_content(formula);
    }

    public static SubLObject suggest_mt_by_content(final SubLObject formula) {
        final SubLObject data = mts_get_summed_data(formula);
        final SubLObject filtered = remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, data, CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject just_mts = Mapping.mapcar(CAR, filtered);
        return NIL == just_mts ? $$BaseKB : just_mts.first();
    }

    public static SubLObject suggest_mt_for_gaf(final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_list_with_count = mt_list_from_related(gaf);
        final SubLObject mt_list = Mapping.mapcar(CAR, mt_list_with_count);
        if ((NIL != mt_list_with_count) && THREE_INTEGER.numL(cdar(mt_list_with_count))) {
            return mt_list.first();
        }
        final SubLObject predicate_results = top_mt_percent_count(gaf.first(), UNPROVIDED);
        if (((NIL != predicate_results) && second(predicate_results).numG($predicate_determined_gaf_cutoff_percent$.getDynamicValue(thread))) && third(predicate_results).numG($predicate_determined_gaf_cutoff_number$.getDynamicValue(thread))) {
            return predicate_results.first();
        }
        return suggest_mt_by_content(gaf);
    }

    public static SubLObject mts_not_commonsense_mtP(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((mt.equal($$BookkeepingMt) || ((NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread)) && mt.equal($$BaseKB))) || ((NIL != $mts_forbid_high_level_mts_for_content_assertions$.getDynamicValue(thread)) && mt.equal($$UniversalVocabularyMt))) || ((NIL != $mts_forbid_lexical_mts$.getDynamicValue(thread)) && (NIL != isa.isaP(mt, $$LexicalMicrotheory, UNPROVIDED, UNPROVIDED)))) || ((NIL != $mts_forbid_project_mts$.getDynamicValue(thread)) && (NIL != likely_project_related_assertionP(mt))));
    }

    public static SubLObject likely_project_related_assertionP(final SubLObject mt) {
        return makeBoolean((((((NIL == constant_p(mt)) || (NIL != isa.isa_in_any_mtP(mt, $$ProjectMicrotheory))) || ((NIL != isa.isa_in_any_mtP(mt, $$ApplicationContext)) && (NIL == isa.isaP(mt, $$LexicalMicrotheory, UNPROVIDED, UNPROVIDED)))) || (NIL != isa.isaP(mt, $$SourceMicrotheory, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(mt, $$MappingMicrotheory, UNPROVIDED, UNPROVIDED))) || (NIL != isa.isaP(mt, $$ProblemSolvingCntxt, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject mtsugg_get_related_assertions(final SubLObject formula) {
        assert NIL != gafP(formula) : "el_utilities.gafP(formula) " + "CommonSymbols.NIL != el_utilities.gafP(formula) " + formula;
        if (arity.arity(cycl_utilities.formula_arg0(formula)).numL(TWO_INTEGER)) {
            return NIL;
        }
        final SubLObject missing_term = $sym16$_X;
        final SubLObject mt_term = $sym17$_MT;
        SubLObject answers = NIL;
        SubLObject query_formula = NIL;
        SubLObject term_num = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_num = add(term_num, ONE_INTEGER);
            query_formula = copy_tree(formula);
            set_nth(term_num, query_formula, missing_term);
            SubLObject cdolist_list_var_$1;
            final SubLObject v_bindings = cdolist_list_var_$1 = inference_kernel.new_cyc_query(list($$ist_Asserted, mt_term, query_formula), $mtsugg_related_assertion_formulas_query_mt$.getGlobalValue(), $mtsugg_related_assertion_formulas_query_properties$.getGlobalValue());
            SubLObject binding = NIL;
            binding = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject related_formula = copy_tree(formula);
                set_nth(term_num, related_formula, bindings.variable_binding_value(bindings.get_variable_binding(missing_term, binding)));
                final SubLObject mt = bindings.variable_binding_value(bindings.get_variable_binding(mt_term, binding));
                final SubLObject assertion = czer_meta.find_assertion_cycl(related_formula, mt);
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    answers = cons(assertion, answers);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                binding = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return answers;
    }

    public static SubLObject mt_list_from_related(final SubLObject formula) {
        assert NIL != gafP(formula) : "el_utilities.gafP(formula) " + "CommonSymbols.NIL != el_utilities.gafP(formula) " + formula;
        final SubLObject assertions = mtsugg_get_related_assertions(formula);
        if (NIL != assertions) {
            final SubLObject mts = Mapping.mapcar(ASSERTION_MONAD_MT, assertions);
            return number_utilities.get_sorted_frequency_list(mts);
        }
        return NIL;
    }

    public static SubLObject mts_specificity_estimate(final SubLObject v_term) {
        final SubLObject generality = cardinality_estimates.generality_estimate(v_term);
        if (generality.numL($int$100)) {
            return ONE_INTEGER;
        }
        if (generality.numL($int$10000)) {
            return $float$0_5;
        }
        return $float$0_2;
    }

    public static SubLObject frequency_list_of_mts_adjusted(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        final SubLObject freqlist = frequency_list_of_mts(v_term, function_or_predicate, rule_assertion);
        final SubLObject specificity = mts_specificity_estimate(v_term);
        SubLObject adjusted = NIL;
        SubLObject cdolist_list_var = freqlist;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            adjusted = cons(cons(pair.first(), multiply(pair.rest(), specificity)), adjusted);
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return nreverse(adjusted);
    }

    public static SubLObject clear_frequency_list_of_mts() {
        final SubLObject cs = $frequency_list_of_mts_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        return memoization_state.caching_state_remove_function_results_with_args($frequency_list_of_mts_caching_state$.getGlobalValue(), list(v_term, function_or_predicate, rule_assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject frequency_list_of_mts_internal(final SubLObject v_term, final SubLObject function_or_predicate, final SubLObject rule_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mts = NIL;
        if (NIL != list_utilities.sublisp_boolean(function_or_predicate)) {
            if (NIL != fort_types_interface.predicateP(v_term)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(v_term)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(v_term);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$4 = NIL;
                                        final SubLObject token_var_$5 = NIL;
                                        while (NIL == done_var_$4) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                            final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                            if (NIL != valid_$6) {
                                                mts = cons(hlmt.assertion_monad_mt(gaf), mts);
                                            }
                                            done_var_$4 = makeBoolean(NIL == valid_$6);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    if (NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(v_term, NIL, NIL)) {
                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(v_term, NIL, NIL);
                        SubLObject done_var2 = NIL;
                        final SubLObject token_var2 = NIL;
                        while (NIL == done_var2) {
                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                            if (NIL != valid2) {
                                SubLObject final_index_iterator2 = NIL;
                                try {
                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $RULE, NIL, NIL);
                                    SubLObject done_var_$5 = NIL;
                                    final SubLObject token_var_$6 = NIL;
                                    while (NIL == done_var_$5) {
                                        final SubLObject asst = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$6);
                                        final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(asst));
                                        if (NIL != valid_$7) {
                                            mts = cons(hlmt.assertion_monad_mt(asst), mts);
                                        }
                                        done_var_$5 = makeBoolean(NIL == valid_$7);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        if (NIL != final_index_iterator2) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                        }
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            }
                            done_var2 = makeBoolean(NIL == valid2);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else {
                if (NIL == fort_types_interface.functionP(v_term)) {
                    return frequency_list_of_mts(v_term, NIL, UNPROVIDED);
                }
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(v_term, NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_function_rule_final_index_spec_iterator(v_term, NIL);
                        SubLObject done_var3 = NIL;
                        final SubLObject token_var3 = NIL;
                        while (NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                            if (NIL != valid3) {
                                SubLObject final_index_iterator3 = NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $RULE, NIL, NIL);
                                    SubLObject done_var_$6 = NIL;
                                    final SubLObject token_var_$7 = NIL;
                                    while (NIL == done_var_$6) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$7);
                                        final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(asst2));
                                        if (NIL != valid_$8) {
                                            mts = cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$6 = makeBoolean(NIL == valid_$8);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        if (NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            }
                            done_var3 = makeBoolean(NIL == valid3);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            if (length(mts).numL(FOUR_INTEGER)) {
                return frequency_list_of_mts(v_term, NIL, UNPROVIDED);
            }
        } else
            if (NIL != list_utilities.sublisp_boolean(rule_assertion)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                        SubLObject done_var3 = NIL;
                        final SubLObject token_var3 = NIL;
                        while (NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                            if (NIL != valid3) {
                                SubLObject final_index_iterator3 = NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, NIL, NIL, NIL);
                                    SubLObject done_var_$7 = NIL;
                                    final SubLObject token_var_$8 = NIL;
                                    while (NIL == done_var_$7) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$8);
                                        final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(asst2));
                                        if (((NIL != valid_$9) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst2, final_index_spec3))) && (NIL != assertions_high.rule_assertionP(asst2))) {
                                            mts = cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$7 = makeBoolean(NIL == valid_$9);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        if (NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                }
                            }
                            done_var3 = makeBoolean(NIL == valid3);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                        final SubLObject iterator_var3 = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                        SubLObject done_var3 = NIL;
                        final SubLObject token_var3 = NIL;
                        while (NIL == done_var3) {
                            final SubLObject final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
                            final SubLObject valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
                            if (NIL != valid3) {
                                SubLObject final_index_iterator3 = NIL;
                                try {
                                    final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, NIL, NIL, NIL);
                                    SubLObject done_var_$8 = NIL;
                                    final SubLObject token_var_$9 = NIL;
                                    while (NIL == done_var_$8) {
                                        final SubLObject asst2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$9);
                                        final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(asst2));
                                        if ((NIL != valid_$10) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(asst2, final_index_spec3))) {
                                            mts = cons(hlmt.assertion_monad_mt(asst2), mts);
                                        }
                                        done_var_$8 = makeBoolean(NIL == valid_$10);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values5 = getValuesAsVector();
                                        if (NIL != final_index_iterator3) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
                                        }
                                        restoreValuesFromVector(_values5);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                                    }
                                }
                            }
                            done_var3 = makeBoolean(NIL == valid3);
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }

        if (NIL != list_utilities.sublisp_boolean(mts)) {
            return number_utilities.get_sorted_frequency_list(mts);
        }
        return NIL;
    }

    public static SubLObject frequency_list_of_mts(final SubLObject v_term, SubLObject function_or_predicate, SubLObject rule_assertion) {
        if (function_or_predicate == UNPROVIDED) {
            function_or_predicate = NIL;
        }
        if (rule_assertion == UNPROVIDED) {
            rule_assertion = NIL;
        }
        SubLObject caching_state = $frequency_list_of_mts_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FREQUENCY_LIST_OF_MTS, $frequency_list_of_mts_caching_state$, NIL, EQUAL, THREE_INTEGER, FOUR_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, function_or_predicate, rule_assertion);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (function_or_predicate.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && rule_assertion.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(frequency_list_of_mts_internal(v_term, function_or_predicate, rule_assertion)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, function_or_predicate, rule_assertion));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject mts_get_formula_frequency_data(final SubLObject formula) {
        final SubLObject v_forts = cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED);
        final SubLObject filtered = remove_if($sym31$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject frequency_data = NIL;
        SubLObject cdolist_list_var = filtered;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            frequency_data = cons(bq_cons(v_term, subseq(remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted(v_term, used_as_function_or_predicateP($$Dog, formula), UNPROVIDED), CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, FIVE_INTEGER)), frequency_data);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return frequency_data;
    }

    public static SubLObject mts_get_summed_data(final SubLObject formula) {
        final SubLObject v_forts = cycl_utilities.formula_forts(formula, T, UNPROVIDED, UNPROVIDED);
        SubLObject filtered = remove_if($sym31$MTS_TOO_GENERAL_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject mts_for_term = NIL;
        SubLObject mts_for_term_adjusted = NIL;
        SubLObject all_mt_frequencies = NIL;
        SubLObject freqlist = NIL;
        SubLObject summed_data = NIL;
        if (length(filtered).numLE(TWO_INTEGER)) {
            filtered = remove_if($sym33$MTS_TOO_GENERAL_LIGHT_FILTERING_, v_forts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject cdolist_list_var = filtered;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            freqlist = list_utilities.first_n(FIVE_INTEGER, remove_if($sym1$MTS_NOT_COMMONSENSE_MT_, frequency_list_of_mts_adjusted(v_term, used_as_function_or_predicateP(v_term, formula), el_implication_p(formula)), CAR, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            mts_for_term = Mapping.mapcar(CAR, freqlist);
            mts_for_term_adjusted = Mapping.mapcar(CONS, mts_for_term, new SubLObject[]{ make_list(length(mts_for_term), mts_specificity_estimate(v_term)) });
            all_mt_frequencies = append(all_mt_frequencies, freqlist);
            summed_data = append(summed_data, mts_for_term_adjusted);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject small_number_hash = make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED);
        final SubLObject big_number_hash = make_hash_table(TEN_INTEGER, EQUAL, UNPROVIDED);
        SubLObject cdolist_list_var2 = summed_data;
        SubLObject dotted_pair = NIL;
        dotted_pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            hash_table_utilities.cinc_hash(dotted_pair.first(), small_number_hash, dotted_pair.rest(), UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dotted_pair = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = all_mt_frequencies;
        dotted_pair = NIL;
        dotted_pair = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            hash_table_utilities.cinc_hash(dotted_pair.first(), big_number_hash, dotted_pair.rest(), UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            dotted_pair = cdolist_list_var2.first();
        } 
        final SubLObject combined_data = get_combined_list_for_mts_summed_data(hash_table_utilities.hash_table_to_alist(small_number_hash), hash_table_utilities.hash_table_to_alist(big_number_hash));
        final SubLObject semi_sorted = Sort.sort(combined_data, $sym35$_, CADDR);
        final SubLObject sorted = Sort.stable_sort(semi_sorted, $sym35$_, CADR);
        return sorted;
    }

    public static SubLObject get_combined_list_for_mts_summed_data(final SubLObject lst1, final SubLObject lst2) {
        SubLObject final_list = NIL;
        SubLObject one_element = NIL;
        SubLObject pair = NIL;
        SubLObject cdolist_list_var = lst1;
        SubLObject elt = NIL;
        elt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pair = find(elt.first(), lst2, EQUAL, CAR, UNPROVIDED, UNPROVIDED);
            one_element = list(elt.first(), elt.rest(), pair.rest());
            final_list = cons(one_element, final_list);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        } 
        return final_list;
    }

    public static SubLObject mts_too_generalP(final SubLObject v_term, SubLObject light_filtering) {
        if (light_filtering == UNPROVIDED) {
            light_filtering = NIL;
        }
        return makeBoolean((NIL != subl_promotions.memberP(v_term, $mtsugg_too_general_term_filter$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || ((NIL == light_filtering) && (((NIL != isa.isaP(v_term, $$MetaRelation, UNPROVIDED, UNPROVIDED)) || (NIL != isa.quoted_isaP(v_term, $$CoreConstant, $$EverythingPSC, UNPROVIDED))) || (NIL != isa.isaP(v_term, $$KEFacilitationPredicate, UNPROVIDED, UNPROVIDED)))));
    }

    public static SubLObject mts_too_general_light_filteringP(final SubLObject v_term) {
        return mts_too_generalP(v_term, T);
    }

    public static SubLObject get_mt_list_for_predicate(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED).numG(max_assertions)) {
            return NIL;
        }
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            final SubLObject assertions = kb_mapping.gather_predicate_extent_index(predicate, UNPROVIDED, UNPROVIDED);
            final SubLObject mts = Mapping.mapcar(ASSERTION_MT, assertions);
            result = (NIL != mts) ? number_utilities.get_sorted_frequency_list(mts) : NIL;
        } finally {
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject clear_top_mt_percent_count() {
        final SubLObject cs = $top_mt_percent_count_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        return memoization_state.caching_state_remove_function_results_with_args($top_mt_percent_count_caching_state$.getGlobalValue(), list(predicate, max_assertions), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject top_mt_percent_count_internal(final SubLObject predicate, final SubLObject max_assertions) {
        final SubLObject freq_list = get_mt_list_for_predicate(predicate, max_assertions);
        final SubLObject total = (NIL != freq_list) ? apply($sym48$_, Mapping.mapcar(CDR, freq_list)) : NIL;
        return NIL != freq_list ? list(caar(freq_list), divide(cdar(freq_list), total), total) : NIL;
    }

    public static SubLObject top_mt_percent_count(final SubLObject predicate, SubLObject max_assertions) {
        if (max_assertions == UNPROVIDED) {
            max_assertions = $int$20000;
        }
        SubLObject caching_state = $top_mt_percent_count_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TOP_MT_PERCENT_COUNT, $top_mt_percent_count_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$25);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, max_assertions);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && max_assertions.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(top_mt_percent_count_internal(predicate, max_assertions)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, max_assertions));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject used_as_function_or_predicateP(final SubLObject v_term, final SubLObject formula) {
        final SubLObject positions = list_utilities.tree_positions(v_term, formula, EQUAL, UNPROVIDED);
        final SubLObject atoms = remove_if(LISTP, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject lists = remove_if(ATOM, positions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject last_elements = Mapping.mapcar(CAR, Mapping.mapcar(LAST, lists));
        return makeBoolean((NIL != subl_promotions.memberP(ZERO_INTEGER, atoms, EQUAL, UNPROVIDED)) || (NIL != member(ZERO_INTEGER, last_elements, EQUAL, UNPROVIDED)));
    }

    public static SubLObject mts_run_all_tests(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLObject all_tests = $list55;
        SubLObject results = NIL;
        SubLObject testname = NIL;
        mts_clear_test_results();
        mts_clear_tests();
        SubLObject cdolist_list_var = all_tests;
        SubLObject test = NIL;
        test = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            testname = subseq(symbol_name(test), FOUR_INTEGER, UNPROVIDED);
            princ($str56$Running_test__, UNPROVIDED);
            princ(testname, UNPROVIDED);
            terpri(UNPROVIDED);
            results = funcall(test, verbose);
            terpri(UNPROVIDED);
            princ(testname, UNPROVIDED);
            princ($str57$_RESULTS__, UNPROVIDED);
            princ(results, UNPROVIDED);
            terpri(UNPROVIDED);
            terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            test = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject mts_clear_tests() {
        $examination_mts$.setGlobalValue(NIL);
        $examination_formulas$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject mts_clear_test_results() {
        $mts_incorrect_formulas$.setGlobalValue(NIL);
        $mts_actual_mts$.setGlobalValue(NIL);
        $mts_guessed_mts$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject mts_print_test_results(SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = T;
        }
        if (NIL != verbose) {
            SubLObject cdotimes_end_var;
            SubLObject n;
            for (cdotimes_end_var = length($mts_incorrect_formulas$.getGlobalValue()), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
                princ($str58$Incorrect_Formula__, UNPROVIDED);
                terpri(UNPROVIDED);
                princ(nth(n, $mts_incorrect_formulas$.getGlobalValue()), UNPROVIDED);
                terpri(UNPROVIDED);
                princ($str59$Suggested_Mt__, UNPROVIDED);
                princ(nth(n, $mts_guessed_mts$.getGlobalValue()), UNPROVIDED);
                terpri(UNPROVIDED);
                princ($str60$Actual_Mt__, UNPROVIDED);
                princ(nth(n, $mts_actual_mts$.getGlobalValue()), UNPROVIDED);
                terpri(UNPROVIDED);
            }
        }
        princ($str61$Frequency_list_of_suggested_mts__, UNPROVIDED);
        terpri(UNPROVIDED);
        princ(number_utilities.get_sorted_frequency_list($mts_guessed_mts$.getGlobalValue()), UNPROVIDED);
        terpri(UNPROVIDED);
        princ($str62$Frequency_list_of_actual_mts__, UNPROVIDED);
        terpri(UNPROVIDED);
        princ(number_utilities.get_sorted_frequency_list($mts_actual_mts$.getGlobalValue()), UNPROVIDED);
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject mts_default_test(SubLObject print) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        return test_mt_suggestor($examination_formulas$.getGlobalValue(), $examination_mts$.getGlobalValue(), print);
    }

    public static SubLObject run_new_project_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numassertions = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$SAICLegacyAssertionsMt, numassertions, T, T);
        add_n_assertions_in_mt($$PredicatePopulationMt, numassertions, T, T);
        add_n_assertions_in_mt($$TestVocabularyMt, numassertions, T, T);
        add_n_assertions_in_mt($$MotleyFoolUKGlossaryMt, numassertions, T, T);
        return mts_default_test(print);
    }

    public static SubLObject run_old_project_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numrules = divide(assertions, SIX_INTEGER);
        add_n_assertions_in_mt($$WebSearchEnhancementMt, numrules, T, T);
        add_n_assertions_in_mt($$DesertShieldMt, numrules, T, T);
        add_n_assertions_in_mt($$OilEconModelMt, numrules, T, T);
        add_n_assertions_in_mt($$Y2Scenario_Stage1Mt, numrules, T, T);
        add_n_assertions_in_mt($$BeachWalkIMt, numrules, T, T);
        add_n_assertions_in_mt($$PQ204Mt, numrules, T, T);
        return mts_default_test(print);
    }

    public static SubLObject run_definitional_assertions_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        SubLObject cdolist_list_var;
        final SubLObject assts = cdolist_list_var = append(get_about_n_representative_assertions_from_pred($$isa, divide(assertions, TWO_INTEGER)), get_about_n_representative_assertions_from_pred($$genls, divide(assertions, TWO_INTEGER)));
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
            $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return mts_default_test(print);
    }

    public static SubLObject run_meta_predicates_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numpredicates = ceiling(divide(assertions, FIVE_INTEGER), UNPROVIDED);
        final SubLObject predicates = mts_random_subset(isa.all_fort_instances($$MetaPredicate, UNPROVIDED, UNPROVIDED), numpredicates);
        SubLObject assts = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assts = append(assts, get_about_n_representative_assertions_from_pred(pred, ceiling(divide(assertions, numpredicates), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = assts;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
            $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return mts_default_test(print);
    }

    public static SubLObject run_rule_macro_predicates_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numpredicates = ceiling(divide(assertions, FIVE_INTEGER), UNPROVIDED);
        final SubLObject predicates = mts_random_subset(isa.all_fort_instances($$RuleMacroPredicate, UNPROVIDED, UNPROVIDED), numpredicates);
        SubLObject assts = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assts = append(assts, get_about_n_representative_assertions_from_pred(pred, ceiling(divide(assertions, numpredicates), UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        cdolist_list_var = assts;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            $examination_formulas$.setGlobalValue(cons(assertions_high.assertion_formula(assertion), $examination_formulas$.getGlobalValue()));
            $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return mts_default_test(print);
    }

    public static SubLObject run_large_commonsense_mt_rules_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numrules = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$BiologyMt, numrules, NIL, T);
        add_n_assertions_in_mt($$ModernMilitaryTacticsMt, numrules, NIL, T);
        add_n_assertions_in_mt($$HumanSocialLifeMt, numrules, NIL, T);
        add_n_assertions_in_mt($$ChemistryMt, numrules, NIL, T);
        return mts_default_test(print);
    }

    public static SubLObject run_large_commonsense_mt_gafs_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numgafs = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$BiologyMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$ModernMilitaryTacticsMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$HumanSocialLifeMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$ChemistryMt, numgafs, T, NIL);
        return mts_default_test(print);
    }

    public static SubLObject run_base_kb_rules_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        add_n_assertions_in_mt($$BaseKB, assertions, UNPROVIDED, UNPROVIDED);
        return mts_default_test(print);
    }

    public static SubLObject run_lexical_rules_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        add_n_assertions_in_mt($$EnglishLexiconMt, assertions, NIL, T);
        return mts_default_test(print);
    }

    public static SubLObject run_lexical_gafs_test(SubLObject print, SubLObject assertions) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        mts_clear_tests();
        final SubLObject numgafs = divide(assertions, TWO_INTEGER);
        add_n_assertions_in_mt($$EnglishParaphraseMt, numgafs, T, NIL);
        add_n_assertions_in_mt($$EnglishLexiconMt, numgafs, T, NIL);
        return mts_default_test(print);
    }

    public static SubLObject run_high_level_assertions_test(SubLObject print, SubLObject assertions, SubLObject gafsP, SubLObject rulesP) {
        if (print == UNPROVIDED) {
            print = NIL;
        }
        if (assertions == UNPROVIDED) {
            assertions = $int$100;
        }
        if (gafsP == UNPROVIDED) {
            gafsP = T;
        }
        if (rulesP == UNPROVIDED) {
            rulesP = T;
        }
        mts_clear_tests();
        final SubLObject numassertions = divide(assertions, FOUR_INTEGER);
        add_n_assertions_in_mt($$LogicalTruthMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt($$LogicalTruthImplementationMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt($$CoreCycLMt, numassertions, gafsP, rulesP);
        add_n_assertions_in_mt($$CoreCycLMt, numassertions, gafsP, rulesP);
        return mts_default_test(print);
    }

    public static SubLObject test_mt_suggestor(final SubLObject assertionlist, final SubLObject mtlist, SubLObject print) {
        if (print == UNPROVIDED) {
            print = T;
        }
        SubLObject i = ZERO_INTEGER;
        SubLObject right = ZERO_INTEGER;
        SubLObject suggestion = NIL;
        SubLObject cdolist_list_var = assertionlist;
        SubLObject asst = NIL;
        asst = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != print) {
                princ($str86$Trying_Formula__, UNPROVIDED);
                princ(i, UNPROVIDED);
                terpri(UNPROVIDED);
            }
            suggestion = suggest_mt(asst);
            if (NIL != print) {
                princ($str59$Suggested_Mt__, UNPROVIDED);
                princ(suggestion, UNPROVIDED);
                terpri(UNPROVIDED);
                princ($str60$Actual_Mt__, UNPROVIDED);
                princ(nth(i, mtlist), UNPROVIDED);
                terpri(UNPROVIDED);
                terpri(UNPROVIDED);
            }
            if (suggestion.equal(nth(i, mtlist))) {
                right = add(right, ONE_INTEGER);
            } else {
                $mts_incorrect_formulas$.setGlobalValue(cons(asst, $mts_incorrect_formulas$.getGlobalValue()));
                $mts_guessed_mts$.setGlobalValue(cons(suggestion, $mts_guessed_mts$.getGlobalValue()));
                $mts_actual_mts$.setGlobalValue(cons(nth(i, mtlist), $mts_actual_mts$.getGlobalValue()));
            }
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asst = cdolist_list_var.first();
        } 
        if (NIL != print) {
            princ($$$Got_, UNPROVIDED);
            princ(right, UNPROVIDED);
            princ($$$_out_of_, UNPROVIDED);
            princ(i, UNPROVIDED);
            terpri(UNPROVIDED);
        }
        return divide(right, i);
    }

    public static SubLObject add_n_assertions_in_mt(final SubLObject mt, SubLObject n, SubLObject include_gafs, SubLObject include_rules) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (include_gafs == UNPROVIDED) {
            include_gafs = NIL;
        }
        if (include_rules == UNPROVIDED) {
            include_rules = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stopP = NIL;
        SubLObject numsofar = ZERO_INTEGER;
        SubLObject formula = NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = stopP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                        if (NIL != valid) {
                            formula = assertions_high.assertion_formula(assertion);
                            if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion), $examination_mts$.getGlobalValue()));
                                numsofar = add(numsofar, ONE_INTEGER);
                            }
                            if (numsofar.numGE(n)) {
                                stopP = T;
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != stopP));
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($MAPPING_DONE);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str92$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$24 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$24, $SKIP)) {
                                final SubLObject idx_$25 = idx_$24;
                                if (NIL == id_index_dense_objects_empty_p(idx_$25, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$25);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject assertion2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != stopP) {
                                                mapping_finished();
                                            }
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) {
                                                formula = assertions_high.assertion_formula(assertion2);
                                                if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                                    $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion2), $examination_mts$.getGlobalValue()));
                                                    numsofar = add(numsofar, ONE_INTEGER);
                                                }
                                                if (numsofar.numGE(n)) {
                                                    stopP = T;
                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$26 = idx_$24;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$26)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$26);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$26);
                                    final SubLObject end_id = id_index_next_id(idx_$26);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != stopP) {
                                                mapping_finished();
                                            }
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) {
                                                formula = assertions_high.assertion_formula(assertion3);
                                                if (((NIL != include_rules) && (NIL != el_implication_p(formula))) || (((NIL != include_gafs) && (NIL == el_implication_p(formula))) && (length(formula).numL(TWO_INTEGER) || (NIL == fort_types_interface.skolem_functionP(second(formula), UNPROVIDED))))) {
                                                    $examination_formulas$.setGlobalValue(cons(formula, $examination_formulas$.getGlobalValue()));
                                                    $examination_mts$.setGlobalValue(cons(assertions_high.assertion_mt(assertion3), $examination_mts$.getGlobalValue()));
                                                    numsofar = add(numsofar, ONE_INTEGER);
                                                }
                                                if (numsofar.numGE(n)) {
                                                    stopP = T;
                                                }
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                } finally {
                    thread.throwStack.pop();
                }
            }

        return NIL;
    }

    public static SubLObject get_about_n_representative_assertions_from_pred(final SubLObject pred, final SubLObject n) {
        final SubLObject extent = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        final SubLObject prob = (extent.numE(ZERO_INTEGER)) ? ONE_INTEGER : min(ONE_INTEGER, divide(n, extent));
        return get_n_assertions_from_pred_with_prob(pred, n, prob);
    }

    public static SubLObject get_about_n_representative_assertions_from_mt(final SubLObject mt, final SubLObject n) {
        final SubLObject extent = (NIL != kb_indexing.broad_mtP(mt)) ? $int$100000 : kb_indexing.num_mt_index(mt);
        final SubLObject prob = (extent.numE(ZERO_INTEGER)) ? ONE_INTEGER : min(ONE_INTEGER, divide(n, extent));
        return get_n_assertions_from_mt_with_prob(mt, n, prob);
    }

    public static SubLObject get_n_assertions_from_pred_with_prob(final SubLObject pred, final SubLObject n, final SubLObject prob) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject assertion_count = ZERO_INTEGER;
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$28 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = doneP;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$30 = doneP;
                                final SubLObject token_var_$31 = NIL;
                                while (NIL == done_var_$30) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$31);
                                    final SubLObject valid_$32 = makeBoolean(!token_var_$31.eql(assertion));
                                    if ((NIL != valid_$32) && (NIL != number_utilities.true_with_probability(prob))) {
                                        assertions = cons(assertion, assertions);
                                        assertion_count = add(assertion_count, ONE_INTEGER);
                                        doneP = numGE(assertion_count, n);
                                    }
                                    done_var_$30 = makeBoolean((NIL == valid_$32) || (NIL != doneP));
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
                                }
                            }
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject get_n_assertions_from_mt_with_prob(final SubLObject mt, final SubLObject n, final SubLObject prob) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject assertion_count = ZERO_INTEGER;
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql($MT)) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                            if ((NIL != valid) && (NIL != number_utilities.true_with_probability(prob))) {
                                assertions = cons(assertion, assertions);
                                assertion_count = add(assertion_count, ONE_INTEGER);
                                doneP = numGE(assertion_count, n);
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                        }
                    }
                }
            } else
                if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                    SubLObject catch_var = NIL;
                    try {
                        thread.throwStack.push($MAPPING_DONE);
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $str92$do_broad_mt_index;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$35 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$37 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$37, $SKIP)) {
                                    final SubLObject idx_$38 = idx_$37;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$38, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$38);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject assertion2;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (NIL != doneP) {
                                                    mapping_finished();
                                                }
                                                if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, mt, NIL, NIL)) && (NIL != number_utilities.true_with_probability(prob))) {
                                                    assertions = cons(assertion2, assertions);
                                                    assertion_count = add(assertion_count, ONE_INTEGER);
                                                    doneP = numGE(assertion_count, n);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$39 = idx_$37;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$39)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$39);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$39);
                                        final SubLObject end_id = id_index_next_id(idx_$39);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (NIL != doneP) {
                                                    mapping_finished();
                                                }
                                                if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, mt, NIL, NIL)) && (NIL != number_utilities.true_with_probability(prob))) {
                                                    assertions = cons(assertion3, assertions);
                                                    assertion_count = add(assertion_count, ONE_INTEGER);
                                                    doneP = numGE(assertion_count, n);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$36, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$35, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                    } finally {
                        thread.throwStack.pop();
                    }
                }

        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject get_summed_frequencies_from_frequency_list(final SubLObject freq_list) {
        return apply($sym48$_, Mapping.mapcar(CDR, freq_list));
    }

    public static SubLObject mts_random_subset(final SubLObject lst, final SubLObject size) {
        final SubLObject integers = number_utilities.n_random_integers(size, length(lst), UNPROVIDED);
        SubLObject subset = NIL;
        SubLObject cdolist_list_var = integers;
        SubLObject integer = NIL;
        integer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            subset = cons(nth(integer, lst), subset);
            cdolist_list_var = cdolist_list_var.rest();
            integer = cdolist_list_var.first();
        } 
        return subset;
    }

    public static SubLObject declare_mt_suggestor_file() {
        declareFunction(me, "suggest_mt", "SUGGEST-MT", 1, 0, false);
        declareFunction(me, "suggest_mt_by_content", "SUGGEST-MT-BY-CONTENT", 1, 0, false);
        declareFunction(me, "suggest_mt_for_gaf", "SUGGEST-MT-FOR-GAF", 1, 0, false);
        declareFunction(me, "mts_not_commonsense_mtP", "MTS-NOT-COMMONSENSE-MT?", 1, 0, false);
        declareFunction(me, "likely_project_related_assertionP", "LIKELY-PROJECT-RELATED-ASSERTION?", 1, 0, false);
        declareFunction(me, "mtsugg_get_related_assertions", "MTSUGG-GET-RELATED-ASSERTIONS", 1, 0, false);
        declareFunction(me, "mt_list_from_related", "MT-LIST-FROM-RELATED", 1, 0, false);
        declareFunction(me, "mts_specificity_estimate", "MTS-SPECIFICITY-ESTIMATE", 1, 0, false);
        declareFunction(me, "frequency_list_of_mts_adjusted", "FREQUENCY-LIST-OF-MTS-ADJUSTED", 1, 2, false);
        declareFunction(me, "clear_frequency_list_of_mts", "CLEAR-FREQUENCY-LIST-OF-MTS", 0, 0, false);
        declareFunction(me, "remove_frequency_list_of_mts", "REMOVE-FREQUENCY-LIST-OF-MTS", 1, 2, false);
        declareFunction(me, "frequency_list_of_mts_internal", "FREQUENCY-LIST-OF-MTS-INTERNAL", 3, 0, false);
        declareFunction(me, "frequency_list_of_mts", "FREQUENCY-LIST-OF-MTS", 1, 2, false);
        declareFunction(me, "mts_get_formula_frequency_data", "MTS-GET-FORMULA-FREQUENCY-DATA", 1, 0, false);
        declareFunction(me, "mts_get_summed_data", "MTS-GET-SUMMED-DATA", 1, 0, false);
        declareFunction(me, "get_combined_list_for_mts_summed_data", "GET-COMBINED-LIST-FOR-MTS-SUMMED-DATA", 2, 0, false);
        declareFunction(me, "mts_too_generalP", "MTS-TOO-GENERAL?", 1, 1, false);
        declareFunction(me, "mts_too_general_light_filteringP", "MTS-TOO-GENERAL-LIGHT-FILTERING?", 1, 0, false);
        declareFunction(me, "get_mt_list_for_predicate", "GET-MT-LIST-FOR-PREDICATE", 1, 1, false);
        declareFunction(me, "clear_top_mt_percent_count", "CLEAR-TOP-MT-PERCENT-COUNT", 0, 0, false);
        declareFunction(me, "remove_top_mt_percent_count", "REMOVE-TOP-MT-PERCENT-COUNT", 1, 1, false);
        declareFunction(me, "top_mt_percent_count_internal", "TOP-MT-PERCENT-COUNT-INTERNAL", 2, 0, false);
        declareFunction(me, "top_mt_percent_count", "TOP-MT-PERCENT-COUNT", 1, 1, false);
        declareFunction(me, "used_as_function_or_predicateP", "USED-AS-FUNCTION-OR-PREDICATE?", 2, 0, false);
        declareFunction(me, "mts_run_all_tests", "MTS-RUN-ALL-TESTS", 0, 1, false);
        declareFunction(me, "mts_clear_tests", "MTS-CLEAR-TESTS", 0, 0, false);
        declareFunction(me, "mts_clear_test_results", "MTS-CLEAR-TEST-RESULTS", 0, 0, false);
        declareFunction(me, "mts_print_test_results", "MTS-PRINT-TEST-RESULTS", 0, 1, false);
        declareFunction(me, "mts_default_test", "MTS-DEFAULT-TEST", 0, 1, false);
        declareFunction(me, "run_new_project_assertions_test", "RUN-NEW-PROJECT-ASSERTIONS-TEST", 0, 2, false);
        declareFunction(me, "run_old_project_assertions_test", "RUN-OLD-PROJECT-ASSERTIONS-TEST", 0, 2, false);
        declareFunction(me, "run_definitional_assertions_test", "RUN-DEFINITIONAL-ASSERTIONS-TEST", 0, 2, false);
        declareFunction(me, "run_meta_predicates_test", "RUN-META-PREDICATES-TEST", 0, 2, false);
        declareFunction(me, "run_rule_macro_predicates_test", "RUN-RULE-MACRO-PREDICATES-TEST", 0, 2, false);
        declareFunction(me, "run_large_commonsense_mt_rules_test", "RUN-LARGE-COMMONSENSE-MT-RULES-TEST", 0, 2, false);
        declareFunction(me, "run_large_commonsense_mt_gafs_test", "RUN-LARGE-COMMONSENSE-MT-GAFS-TEST", 0, 2, false);
        declareFunction(me, "run_base_kb_rules_test", "RUN-BASE-KB-RULES-TEST", 0, 2, false);
        declareFunction(me, "run_lexical_rules_test", "RUN-LEXICAL-RULES-TEST", 0, 2, false);
        declareFunction(me, "run_lexical_gafs_test", "RUN-LEXICAL-GAFS-TEST", 0, 2, false);
        declareFunction(me, "run_high_level_assertions_test", "RUN-HIGH-LEVEL-ASSERTIONS-TEST", 0, 4, false);
        declareFunction(me, "test_mt_suggestor", "TEST-MT-SUGGESTOR", 2, 1, false);
        declareFunction(me, "add_n_assertions_in_mt", "ADD-N-ASSERTIONS-IN-MT", 1, 3, false);
        declareFunction(me, "get_about_n_representative_assertions_from_pred", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-PRED", 2, 0, false);
        declareFunction(me, "get_about_n_representative_assertions_from_mt", "GET-ABOUT-N-REPRESENTATIVE-ASSERTIONS-FROM-MT", 2, 0, false);
        declareFunction(me, "get_n_assertions_from_pred_with_prob", "GET-N-ASSERTIONS-FROM-PRED-WITH-PROB", 3, 0, false);
        declareFunction(me, "get_n_assertions_from_mt_with_prob", "GET-N-ASSERTIONS-FROM-MT-WITH-PROB", 3, 0, false);
        declareFunction(me, "get_summed_frequencies_from_frequency_list", "GET-SUMMED-FREQUENCIES-FROM-FREQUENCY-LIST", 1, 0, false);
        declareFunction(me, "mts_random_subset", "MTS-RANDOM-SUBSET", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_mt_suggestor_file() {
        defparameter("*MTS-FORBID-LEXICAL-MTS*", NIL);
        defparameter("*MTS-FORBID-PROJECT-MTS*", NIL);
        defparameter("*MTS-FORBID-HIGH-LEVEL-MTS-FOR-CONTENT-ASSERTIONS*", T);
        defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-PERCENT*", $float$0_8);
        defparameter("*PREDICATE-DETERMINED-GAF-CUTOFF-NUMBER*", THREE_INTEGER);
        deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-PROPERTIES*", $list13);
        deflexical("*MTSUGG-RELATED-ASSERTION-FORMULAS-QUERY-MT*", $list14);
        deflexical("*FREQUENCY-LIST-OF-MTS-CACHING-STATE*", NIL);
        deflexical("*MTSUGG-TOO-GENERAL-TERM-FILTER*", $list38);
        deflexical("*MTSUGG-TOO-GENERAL-COLLECTION-FILTER*", $list39);
        deflexical("*MTSUGG-TOO-GENERAL-QUOTED-COLLECTION-FILTER*", $list40);
        deflexical("*TOP-MT-PERCENT-COUNT-CACHING-STATE*", NIL);
        deflexical("*EXAMINATION-FORMULAS*", NIL);
        deflexical("*EXAMINATION-MTS*", NIL);
        deflexical("*MTS-INCORRECT-FORMULAS*", NIL);
        deflexical("*MTS-ACTUAL-MTS*", NIL);
        deflexical("*MTS-GUESSED-MTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_mt_suggestor_file() {
        memoization_state.note_globally_cached_function(FREQUENCY_LIST_OF_MTS);
        memoization_state.note_globally_cached_function(TOP_MT_PERCENT_COUNT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mt_suggestor_file();
    }

    @Override
    public void initializeVariables() {
        init_mt_suggestor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mt_suggestor_file();
    }

    
}

/**
 * Total time: 934 ms
 */
