package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_quaternary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sources extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new sources();

    public static final String myName = "com.cyc.cycjava_2.cycl.sources";


    // deflexical
    private static final SubLSymbol $non_assertion_source_citation_preds$ = makeSymbol("*NON-ASSERTION-SOURCE-CITATION-PREDS*");

    // defparameter
    private static final SubLSymbol $inference_answer_sources_visited_assertions$ = makeSymbol("*INFERENCE-ANSWER-SOURCES-VISITED-ASSERTIONS*");

    // deflexical
    private static final SubLSymbol $cde_document_pattern$ = makeSymbol("*CDE-DOCUMENT-PATTERN*");

    // defparameter
    private static final SubLSymbol $source_icon_domain_mt$ = makeSymbol("*SOURCE-ICON-DOMAIN-MT*");





    // defconstant
    private static final SubLSymbol $source_unknown_publisher$ = makeSymbol("*SOURCE-UNKNOWN-PUBLISHER*");

    private static final SubLSymbol $sym0$POSSIBLE_SOURCE_ATTRIBUTION_ASSERTION_ = makeSymbol("POSSIBLE-SOURCE-ATTRIBUTION-ASSERTION?");

    private static final SubLList $list1 = list(new SubLObject[]{ reader_make_constant_shell(makeString("highlyRelevantAssertion")), reader_make_constant_shell(makeString("nonAbducibleRule")), reader_make_constant_shell(makeString("forwardReificationRule")), reader_make_constant_shell(makeString("except")), reader_make_constant_shell(makeString("abnormal")), reader_make_constant_shell(makeString("meetsPragmaticRequirement")), reader_make_constant_shell(makeString("assertPriorToInCreationTemplate")), reader_make_constant_shell(makeString("creationTemplateAssertions")), reader_make_constant_shell(makeString("creationTemplateAllowableRules")), reader_make_constant_shell(makeString("comment")), reader_make_constant_shell(makeString("cyclistNotes")), reader_make_constant_shell(makeString("cyclistNoteOKForInclusionInResearchCyc")), reader_make_constant_shell(makeString("sharedNotes")), reader_make_constant_shell(makeString("definitionalDisplayAssertion")), reader_make_constant_shell(makeString("salientAssertions")), reader_make_constant_shell(makeString("exampleAssertions")), reader_make_constant_shell(makeString("toBeReviewedBy")), reader_make_constant_shell(makeString("mixedRule")), reader_make_constant_shell(makeString("correctsMixedRule")), reader_make_constant_shell(makeString("assertionWorkflowStatus")), reader_make_constant_shell(makeString("workaroundAssertionForBug")), reader_make_constant_shell(makeString("genStringAssertion")), reader_make_constant_shell(makeString("genStringAssertion-Terse")), reader_make_constant_shell(makeString("genStringAssertion-Precise")), reader_make_constant_shell(makeString("englishGloss")), reader_make_constant_shell(makeString("politenessOfWS")), reader_make_constant_shell(makeString("formalityOfWS")), reader_make_constant_shell(makeString("strengthOfLexicalMapping")), reader_make_constant_shell(makeString("nlPragmaticRequirement")), reader_make_constant_shell(makeString("rhetoricalDeviceOfPhrase")), reader_make_constant_shell(makeString("reformulationPrecondition")), reader_make_constant_shell(makeString("useReformulationRuleForNPPOutputTersification")), reader_make_constant_shell(makeString("useReformulationRuleForQuantifierUnification")), reader_make_constant_shell(makeString("useReformulationRuleForVPPProcessing-NonStateVerbs")), reader_make_constant_shell(makeString("useReformulationRuleForQueryProcessing")), reader_make_constant_shell(makeString("useReformulationRuleForQuantifierMovement")), reader_make_constant_shell(makeString("useReformulationRuleForQuantifierProcessing")), reader_make_constant_shell(makeString("useReformulationRuleForSubcollectionProcessing")), reader_make_constant_shell(makeString("useReformulationRuleForSimplification")), reader_make_constant_shell(makeString("tkbAptimaTieAssertion")), reader_make_constant_shell(makeString("tkbAptimaTieAssertion-Prototype2")), reader_make_constant_shell(makeString("tkbAptimaTieAssertion-Prototype")), reader_make_constant_shell(makeString("ruleTrivialForJustificationParaphrase")), reader_make_constant_shell(makeString("ruleConclusionsTrivial")), reader_make_constant_shell(makeString("assertionUsedInProcessType")), reader_make_constant_shell(makeString("constraint")), reader_make_constant_shell(makeString("domainSpecificDefaultForwardRule")), reader_make_constant_shell(makeString("assertionEvaluated")), reader_make_constant_shell(makeString("evaluee-Direct")), reader_make_constant_shell(makeString("nthInOrdering")), reader_make_constant_shell(makeString("usedInWPDemoInferencing")), reader_make_constant_shell(makeString("chemicalLaw")), reader_make_constant_shell(makeString("softwareAssertionParameterValueInSpecification")), reader_make_constant_shell(makeString("omitFromIKB")), reader_make_constant_shell(makeString("programActionTypeRules")), reader_make_constant_shell(makeString("queryPracticeRules")), reader_make_constant_shell(makeString("queryPracticeGAFs")), reader_make_constant_shell(makeString("deprecatedSalientDescriptorRuleAssertion")), reader_make_constant_shell(makeString("assertionDirectionForProjectBuilds")), reader_make_constant_shell(makeString("genlRules")) });

    private static final SubLSymbol INFERENCE_ANSWER_SOURCES_FROM_SIGNATURE = makeSymbol("INFERENCE-ANSWER-SOURCES-FROM-SIGNATURE");

    private static final SubLSymbol INFERENCE_ANSWER_SOURCES = makeSymbol("INFERENCE-ANSWER-SOURCES");



    private static final SubLObject $const5$supportsInMtMayHaveGraphInformati = reader_make_constant_shell(makeString("supportsInMtMayHaveGraphInformation"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol $sym7$_GRAPH = makeSymbol("?GRAPH");

    private static final SubLObject $$ist_Graph = reader_make_constant_shell(makeString("ist-Graph"));

    private static final SubLSymbol MT_SOURCES = makeSymbol("MT-SOURCES");

    private static final SubLSymbol $sym10$_SOURCE = makeSymbol("?SOURCE");

    private static final SubLObject $$mtSource = reader_make_constant_shell(makeString("mtSource"));

    private static final SubLList $list12 = list(makeSymbol("?SOURCE"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list14 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

    private static final SubLSymbol ASSERTION_SOURCES_VIA_INFERENCE = makeSymbol("ASSERTION-SOURCES-VIA-INFERENCE");

    private static final SubLObject $$sourceOfAssertion_NonTrivial = reader_make_constant_shell(makeString("sourceOfAssertion-NonTrivial"));

    private static final SubLList $list17 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));



    private static final SubLSymbol CDE_DOCUMENT_P = makeSymbol("CDE-DOCUMENT-P");

    private static final SubLObject $$StringInDocumentFn = reader_make_constant_shell(makeString("StringInDocumentFn"));

    private static final SubLSymbol ICON_PATH_FOR_SOURCE = makeSymbol("ICON-PATH-FOR-SOURCE");

    private static final SubLString $str22$_ = makeString("/");

    private static final SubLString $str23$Can_t_find_icon_image_file__S_for = makeString("Can't find icon image file ~S for ~S");

    private static final SubLSymbol ADD_TINY_ICON = makeSymbol("ADD-TINY-ICON");

    private static final SubLSymbol REMOVE_TINY_ICON = makeSymbol("REMOVE-TINY-ICON");

    private static final SubLSymbol ICON_RELATIVE_PATH_FOR_SOURCE = makeSymbol("ICON-RELATIVE-PATH-FOR-SOURCE");

    private static final SubLSymbol $icon_relative_path_for_source_caching_state$ = makeSymbol("*ICON-RELATIVE-PATH-FOR-SOURCE-CACHING-STATE*");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLObject $$issuerOfCW = reader_make_constant_shell(makeString("issuerOfCW"));

    private static final SubLObject $$tinyIconTermImagePathname = reader_make_constant_shell(makeString("tinyIconTermImagePathname"));

    private static final SubLObject $$subWorks = reader_make_constant_shell(makeString("subWorks"));

    private static final SubLObject $$editionOfPeriodicalByDate = reader_make_constant_shell(makeString("editionOfPeriodicalByDate"));

    private static final SubLObject $$publisher = reader_make_constant_shell(makeString("publisher"));

    private static final SubLString $str34$defaultTinyIconTermImagePathnameF = makeString("defaultTinyIconTermImagePathnameForType");





    private static final SubLList $list37 = list(makeSymbol("PLACEHOLDER"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $tkb_image_root_placeholder$ = makeSymbol("*TKB-IMAGE-ROOT-PLACEHOLDER*");

    private static final SubLList $list40 = list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("*TKB-IMAGE-ROOT-PLACEHOLDER*"), makeSymbol("STRINGP"));

    private static final SubLSymbol GET_TKB_IMAGE_ROOT = makeSymbol("GET-TKB-IMAGE-ROOT");

    private static final SubLObject $$salientTermsImageRoot = reader_make_constant_shell(makeString("salientTermsImageRoot"));

    private static final SubLSymbol SOURCE_ICON_PATHS_FOR_ANSWER = makeSymbol("SOURCE-ICON-PATHS-FOR-ANSWER");

    private static final SubLString $str44$_unknown_provenance_ = makeString("(unknown provenance)");

    private static final SubLList $list45 = cons(makeSymbol("ICON-PATH"), makeSymbol("SOURCE-DATA"));

    private static final SubLList $list46 = list(makeSymbol("MEDIA-ORG"), makeSymbol("SOURCE"), makeSymbol("SOURCE-TYPE"));

    private static final SubLList $list47 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));

    private static final SubLString $str48$_ = makeString("(");

    private static final SubLString $str49$_of_unknown_provenance_ = makeString(" of unknown provenance)");

    private static final SubLSymbol SOURCE_CITATION_STRING = makeSymbol("SOURCE-CITATION-STRING");



    private static final SubLObject $$HypertextMarkupLanguage = reader_make_constant_shell(makeString("HypertextMarkupLanguage"));

    private static final SubLSymbol $sym53$_X = makeSymbol("?X");

    private static final SubLSymbol $sym54$_Y = makeSymbol("?Y");

    private static final SubLSymbol $sym55$_CITATION = makeSymbol("?CITATION");

    private static final SubLObject $const56$citationStringForStyleAndRenderin = reader_make_constant_shell(makeString("citationStringForStyleAndRendering"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");





    public static SubLObject assertion_sourcedP(final SubLObject assertion) {
        return list_utilities.sublisp_boolean(assertion_sources_int(assertion, T));
    }

    public static SubLObject assertion_sources(final SubLObject assertion) {
        return assertion_sources_int(assertion, NIL);
    }

    public static SubLObject assertion_sources_int(final SubLObject assertion, final SubLObject booleanP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_sources = hlmt_sources(hlmt.assertion_hlmt(assertion));
        SubLObject strengthenedP = NIL;
        if (((NIL == v_sources) || (NIL == booleanP)) && (NIL != find_if($sym0$POSSIBLE_SOURCE_ATTRIBUTION_ASSERTION_, assertion_utilities.all_meta_assertions(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            thread.resetMultipleValues();
            final SubLObject v_sources_$1 = assertion_sources_via_inference(assertion);
            final SubLObject strengthenedP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_sources = v_sources_$1;
            strengthenedP = strengthenedP_$2;
        }
        return values(v_sources, strengthenedP);
    }

    public static SubLObject possible_source_attribution_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL == find(assertions_high.gaf_arg0(assertion), $non_assertion_source_citation_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject hlmt_sources(final SubLObject v_hlmt) {
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(v_hlmt);
        return mt_sources(monad_mt);
    }

    public static SubLObject inference_answer_sources_from_signature(final SubLObject answer_signature) {
        final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_from_signature(answer_signature);
        return inference_answer_sources(inference_answer);
    }

    public static SubLObject inference_answer_sources_internal(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_sources = NIL;
        final SubLObject _prev_bind_0 = $inference_answer_sources_visited_assertions$.currentBinding(thread);
        try {
            $inference_answer_sources_visited_assertions$.bind(NIL, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$3 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(v_answer);
                    SubLObject justification = NIL;
                    justification = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        v_sources = append(v_sources, inference_answer_justification_sources_int(justification));
                        cdolist_list_var = cdolist_list_var.rest();
                        justification = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $inference_answer_sources_visited_assertions$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(v_sources, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_answer_sources(final SubLObject v_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_answer_sources_internal(v_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ANSWER_SOURCES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ANSWER_SOURCES, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ANSWER_SOURCES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_answer, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_answer_sources_internal(v_answer)));
            memoization_state.caching_state_put(caching_state, v_answer, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_answer_justification_sources_int(final SubLObject justification) {
        SubLObject v_sources = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justification_supports(justification);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_sources = append(v_sources, support_sources_recursive_int(support));
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(v_sources, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject support_sources_recursive_int(final SubLObject support) {
        SubLObject v_sources = NIL;
        if (NIL != arguments.hl_support_with_module_p(support, $SKSI)) {
            v_sources = sksi_support_sources(support);
        } else {
            SubLObject cdolist_list_var = hl_supports.hl_justify_expanded(support);
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != assertion_handles.assertion_p(assertion)) {
                    v_sources = append(v_sources, assertion_sources_recursive_int(assertion));
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return list_utilities.fast_delete_duplicates(v_sources, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_support_sources(final SubLObject support) {
        final SubLObject mt = arguments.hl_support_mt(support);
        SubLObject v_sources;
        final SubLObject mt_sources = v_sources = hlmt_sources(mt);
        if (NIL != backward.removal_ask(list($const5$supportsInMtMayHaveGraphInformati, mt), $$BaseKB, UNPROVIDED, UNPROVIDED)) {
            final SubLObject sentence = arguments.support_sentence(support);
            final SubLObject graph_sources = ask_utilities.query_variable($sym7$_GRAPH, list($$ist_Graph, $sym7$_GRAPH, sentence), mt, UNPROVIDED);
            v_sources = append(graph_sources, v_sources);
        }
        return v_sources;
    }

    public static SubLObject assertion_sources_recursive_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != subl_promotions.memberP(assertion, $inference_answer_sources_visited_assertions$.getDynamicValue(thread), symbol_function(EQ), UNPROVIDED)) {
            return NIL;
        }
        $inference_answer_sources_visited_assertions$.setDynamicValue(cons(assertion, $inference_answer_sources_visited_assertions$.getDynamicValue(thread)), thread);
        SubLObject v_sources = assertion_sources(assertion);
        SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != deduction_handles.deduction_p(argument)) {
                v_sources = append(v_sources, deduction_sources_recursive_int(argument));
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(v_sources, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject deduction_sources_recursive_int(final SubLObject deduction) {
        SubLObject v_sources = NIL;
        SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_sources = append(v_sources, support_sources_recursive_int(support));
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(v_sources, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_corroborating_sources(final SubLObject assertion, final SubLObject query_mt) {
        final SubLObject v_hlmt = hlmt.assertion_hlmt(assertion);
        SubLObject v_sources = NIL;
        SubLObject cdolist_list_var = czer_meta.find_visible_assertions_cycl(uncanonicalizer.assertion_el_formula(assertion), query_mt);
        SubLObject other_assertion = NIL;
        other_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!other_assertion.eql(assertion)) && (NIL != hlmt.hlmt_times_equal_p(v_hlmt, hlmt.assertion_hlmt(other_assertion)))) {
                SubLObject cdolist_list_var_$5 = assertion_sources(other_assertion);
                SubLObject other_source = NIL;
                other_source = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    final SubLObject item_var = other_source;
                    if (NIL == member(item_var, v_sources, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        v_sources = cons(item_var, v_sources);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    other_source = cdolist_list_var_$5.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_assertion = cdolist_list_var.first();
        } 
        return v_sources;
    }

    public static SubLObject mt_sources_internal(final SubLObject monad_mt) {
        SubLObject v_sources = NIL;
        if (NIL != indexed_term_p(monad_mt)) {
            v_sources = ask_utilities.query_variable($sym10$_SOURCE, listS($$mtSource, monad_mt, $list12), $$InferencePSC, $list14);
        }
        return v_sources;
    }

    public static SubLObject mt_sources(final SubLObject monad_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return mt_sources_internal(monad_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, MT_SOURCES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), MT_SOURCES, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, MT_SOURCES, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, monad_mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(mt_sources_internal(monad_mt)));
            memoization_state.caching_state_put(caching_state, monad_mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject assertion_sources_via_inference_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject all_sources = ask_utilities.query_variable($sym10$_SOURCE, list($$sourceOfAssertion_NonTrivial, $sym10$_SOURCE, assertion), $$InferencePSC, $list17);
        thread.resetMultipleValues();
        final SubLObject v_sources = possibly_combine_assertion_sources(assertion, all_sources);
        final SubLObject strengthenedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(v_sources, strengthenedP);
    }

    public static SubLObject assertion_sources_via_inference(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return assertion_sources_via_inference_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ASSERTION_SOURCES_VIA_INFERENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ASSERTION_SOURCES_VIA_INFERENCE, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ASSERTION_SOURCES_VIA_INFERENCE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(assertion_sources_via_inference_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject possibly_combine_assertion_sources(final SubLObject assertion, final SubLObject all_sources) {
        SubLObject strengthenedP = NIL;
        SubLObject v_sources = NIL;
        if (((NIL != list_utilities.doubletonP(all_sources)) && (NIL != find_if(STRINGP, all_sources, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find_if(CDE_DOCUMENT_P, all_sources, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject combined = source_from_cde_document_and_string(all_sources);
            if (NIL != combined) {
                v_sources = cons(combined, v_sources);
                strengthenedP = T;
            }
        }
        if (NIL == v_sources) {
            v_sources = all_sources;
        }
        return values(v_sources, strengthenedP);
    }

    public static SubLObject cde_document_pattern() {
        if (NIL != misc_utilities.uninitialized_p($cde_document_pattern$.getGlobalValue())) {
        }
        if (NIL != misc_utilities.uninitialized_p($cde_document_pattern$.getGlobalValue())) {
            $cde_document_pattern$.setGlobalValue(NIL);
        }
        return $cde_document_pattern$.getGlobalValue();
    }

    public static SubLObject cde_document_p(final SubLObject v_object) {
        return makeBoolean((NIL != el_formula_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, cde_document_pattern())));
    }

    public static SubLObject source_from_cde_document_and_string(final SubLObject v_sources) {
        SubLObject v_document = NIL;
        SubLObject string = NIL;
        SubLObject found_everythingP = NIL;
        if (NIL == valid_constantP($$StringInDocumentFn, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == found_everythingP) {
            SubLObject csome_list_var = v_sources;
            SubLObject source = NIL;
            source = csome_list_var.first();
            while ((NIL == found_everythingP) && (NIL != csome_list_var)) {
                if (NIL != cde_document_p(source)) {
                    v_document = source;
                } else
                    if (source.isString()) {
                        string = source;
                    }

                if ((NIL != v_document) && (NIL != string)) {
                    found_everythingP = T;
                }
                csome_list_var = csome_list_var.rest();
                source = csome_list_var.first();
            } 
        }
        if (NIL != found_everythingP) {
            return make_binary_formula($$StringInDocumentFn, v_document, string);
        }
        return NIL;
    }

    public static SubLObject source_icon_domain_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $source_icon_domain_mt$.getDynamicValue(thread) ? $source_icon_domain_mt$.getDynamicValue(thread) : $$InferencePSC;
    }

    public static SubLObject icon_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject path = icon_relative_path_for_source(source, mt);
        SubLObject provenance = thread.secondMultipleValue();
        SubLObject source_type = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (path.isString()) {
            final SubLObject root = get_tkb_image_root();
            path = (root.isString()) ? cconcatenate(root, path) : NIL;
            if (NIL != string_utilities.starts_with(path, http_kernel.http_server_base_url(UNPROVIDED))) {
                final SubLObject htdocs_path = cconcatenate($str22$_, string_utilities.pre_remove(path, http_kernel.http_server_base_url(UNPROVIDED), UNPROVIDED));
                if (NIL == file_utilities.file_existsP(file_utilities.relative_filename(system_parameters.$http_htdocs_directory$.getDynamicValue(thread), htdocs_path, UNPROVIDED))) {
                    Errors.warn($str23$Can_t_find_icon_image_file__S_for, htdocs_path, source);
                    path = NIL;
                    provenance = NIL;
                    source_type = NIL;
                }
            }
        }
        return values(path, provenance, source_type);
    }

    public static SubLObject add_tiny_icon(final SubLObject argument, final SubLObject assertion) {
        clear_icon_relative_path_for_source();
        return NIL;
    }

    public static SubLObject remove_tiny_icon(final SubLObject argument, final SubLObject assertion) {
        clear_icon_relative_path_for_source();
        return NIL;
    }

    public static SubLObject clear_icon_relative_path_for_source() {
        final SubLObject cs = $icon_relative_path_for_source_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        return memoization_state.caching_state_remove_function_results_with_args($icon_relative_path_for_source_caching_state$.getGlobalValue(), list(source, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject icon_relative_path_for_source_internal(SubLObject source, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject path = non_default_icon_relative_path_for_source(source, mt);
        final SubLObject provenance = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject source_type = NIL;
        if (!path.isString()) {
            thread.resetMultipleValues();
            final SubLObject path_$6 = default_icon_relative_path_for_source(source, mt);
            final SubLObject source_type_$7 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            path = path_$6;
            source_type = source_type_$7;
        }
        return values(path, provenance, source_type);
    }

    public static SubLObject icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        SubLObject caching_state = $icon_relative_path_for_source_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ICON_RELATIVE_PATH_FOR_SOURCE, $icon_relative_path_for_source_caching_state$, NIL, EQUAL, TWO_INTEGER, $int$500);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(source, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (source.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(icon_relative_path_for_source_internal(source, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(source, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject non_default_icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject path = NIL;
        SubLObject provenance = NIL;
        if (NIL != indexed_term_p(source)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject issuers = kb_mapping_utilities.pred_values(source, $$issuerOfCW, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject rest;
                SubLObject issuer;
                for (rest = NIL, rest = issuers; (NIL == path) && (NIL != rest); rest = rest.rest()) {
                    issuer = provenance = rest.first();
                    if (NIL != indexed_term_p(issuer)) {
                        path = kb_mapping_utilities.fpred_value(issuer, $$tinyIconTermImagePathname, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                if (NIL == path) {
                    final SubLObject superworks = kb_mapping_utilities.pred_values(source, $$subWorks, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
                    SubLObject superwork;
                    for (rest = NIL, rest = superworks; (NIL == path) && (NIL != rest); rest = rest.rest()) {
                        superwork = provenance = rest.first();
                        if (NIL != indexed_term_p(superwork)) {
                            path = kb_mapping_utilities.fpred_value(superwork, $$tinyIconTermImagePathname, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    if (NIL == path) {
                        SubLObject periodicals;
                        SubLObject rest_$8;
                        SubLObject periodical;
                        for (rest = NIL, rest = superworks; (NIL == path) && (NIL != rest); rest = rest.rest()) {
                            superwork = rest.first();
                            if (NIL != indexed_term_p(superwork)) {
                                periodicals = kb_mapping_utilities.pred_values(superwork, $$editionOfPeriodicalByDate, THREE_INTEGER, ONE_INTEGER, UNPROVIDED);
                                for (rest_$8 = NIL, rest_$8 = periodicals; (NIL == path) && (NIL != rest_$8); rest_$8 = rest_$8.rest()) {
                                    periodical = provenance = rest_$8.first();
                                    if (NIL != indexed_term_p(periodical)) {
                                        path = kb_mapping_utilities.fpred_value(periodical, $$tinyIconTermImagePathname, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == path) {
                    final SubLObject publishers = kb_mapping_utilities.pred_values(source, $$publisher, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject publisher;
                    for (rest = NIL, rest = publishers; (NIL == path) && (NIL != rest); rest = rest.rest()) {
                        publisher = provenance = rest.first();
                        if (NIL != indexed_term_p(publisher)) {
                            path = kb_mapping_utilities.fpred_value(publisher, $$tinyIconTermImagePathname, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return values(path, provenance);
    }

    public static SubLObject default_icon_relative_path_for_source(SubLObject source, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = source_icon_domain_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_icon_path_predicate = constants_high.find_constant($str34$defaultTinyIconTermImagePathnameF);
        if (NIL == default_icon_path_predicate) {
            return values(NIL, NIL);
        }
        SubLObject path = NIL;
        SubLObject type = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = default_icon_path_predicate;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$9 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_2_$11 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                SubLObject done_var_$12 = NIL;
                                final SubLObject token_var_$13 = NIL;
                                while (NIL == done_var_$12) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$13);
                                    final SubLObject valid_$14 = makeBoolean(!token_var_$13.eql(gaf));
                                    if (NIL != valid_$14) {
                                        final SubLObject this_type = assertions_high.gaf_arg1(gaf);
                                        if ((NIL != isa.isaP(source, this_type, UNPROVIDED, UNPROVIDED)) && ((NIL == type) || (NIL != more_specific_typeP(this_type, type, UNPROVIDED)))) {
                                            type = this_type;
                                            path = assertions_high.gaf_arg2(gaf);
                                        }
                                    }
                                    done_var_$12 = makeBoolean(NIL == valid_$14);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
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
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$11, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$10, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (!path.isString()) {
            return values(NIL, NIL);
        }
        final SubLObject min_type = really_min_isa_among_specs_of(source, type, mt);
        return values(path, min_type);
    }

    public static SubLObject more_specific_typeP(final SubLObject spec_type, final SubLObject genl_type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != genls.genlP(spec_type, genl_type, mt, UNPROVIDED)) || ((NIL == genls.genlP(genl_type, spec_type, mt, UNPROVIDED)) && (NIL != cardinality_estimates.generality_estimateG(genl_type, spec_type))));
    }

    public static SubLObject really_min_isa_among_specs_of(final SubLObject ins, final SubLObject coll, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            final SubLObject min_isas = isa.min_isa(ins, UNPROVIDED, UNPROVIDED);
            final SubLObject specs_among_min_isas = genls.all_specs_among(coll, min_isas, UNPROVIDED, UNPROVIDED);
            result = genls.min_col(specs_among_min_isas, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject with_tkb_image_root_placeholder(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject placeholder = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        placeholder = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($tkb_image_root_placeholder$, placeholder)), $list40, append(body, NIL));
    }

    public static SubLObject get_tkb_image_root() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $tkb_image_root_placeholder$.getDynamicValue(thread) ? $tkb_image_root_placeholder$.getDynamicValue(thread) : get_tkb_image_root_no_placeholder();
    }

    public static SubLObject get_tkb_image_root_no_placeholder() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(source_icon_domain_mt(), thread);
            results = kb_mapping_utilities.pred_refs($$salientTermsImageRoot, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != list_utilities.empty_list_p(results)) {
            return NIL;
        }
        final SubLObject result = results.first();
        return http_kernel.get_absolute_url(result, NIL);
    }

    public static SubLObject source_icon_paths_for_answer(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject inference_answer_id) {
        return source_icon_paths_for_inference_answer(inference_datastructures_inference.find_inference_answer_by_ids(problem_store_id, inference_id, inference_answer_id));
    }

    public static SubLObject source_icon_paths_for_inference_answer(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = (NIL != inference_datastructures_inference.inference_answer_p(inference_answer)) ? inference_datastructures_inference.inference_answer_inference(inference_answer) : NIL;
        final SubLObject inference_mt = (NIL != inference_datastructures_inference.inference_p(inference)) ? pph_proof.pph_get_inference_mt(inference) : NIL;
        SubLObject icon_paths_with_media_orgs = NIL;
        SubLObject icon_paths_with_tooltip_renderings = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var;
                final SubLObject v_sources = cdolist_list_var = inference_answer_sources(inference_answer);
                SubLObject source = NIL;
                source = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject icon_path = icon_path_for_source(source, inference_mt);
                    final SubLObject media_org = thread.secondMultipleValue();
                    final SubLObject source_type = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != icon_path) {
                        icon_paths_with_media_orgs = list_utilities.alist_pushnew(icon_paths_with_media_orgs, icon_path, list(media_org, source, source_type), symbol_function(EQUAL), symbol_function(EQUAL));
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    source = cdolist_list_var.first();
                } 
                SubLObject cdolist_list_var2 = icon_paths_with_media_orgs;
                SubLObject cons = NIL;
                cons = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject icon_path2 = NIL;
                    SubLObject source_data = NIL;
                    destructuring_bind_must_consp(current, datum, $list45);
                    icon_path2 = current.first();
                    current = source_data = current.rest();
                    SubLObject tooltip_renderings = NIL;
                    SubLObject cdolist_list_var_$16 = source_data;
                    SubLObject source_datum = NIL;
                    source_datum = cdolist_list_var_$16.first();
                    while (NIL != cdolist_list_var_$16) {
                        SubLObject current_$18;
                        final SubLObject datum_$17 = current_$18 = source_datum;
                        SubLObject media_org2 = NIL;
                        SubLObject source2 = NIL;
                        SubLObject source_type2 = NIL;
                        destructuring_bind_must_consp(current_$18, datum_$17, $list46);
                        media_org2 = current_$18.first();
                        current_$18 = current_$18.rest();
                        destructuring_bind_must_consp(current_$18, datum_$17, $list46);
                        source2 = current_$18.first();
                        current_$18 = current_$18.rest();
                        destructuring_bind_must_consp(current_$18, datum_$17, $list46);
                        source_type2 = current_$18.first();
                        current_$18 = current_$18.rest();
                        if (NIL == current_$18) {
                            final SubLObject tooltip_rendering = tooltip_rendering_for_source(source2, media_org2, source_type2);
                            tooltip_renderings = cons(list(tooltip_rendering, source2), tooltip_renderings);
                        } else {
                            cdestructuring_bind_error(datum_$17, $list46);
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        source_datum = cdolist_list_var_$16.first();
                    } 
                    icon_paths_with_tooltip_renderings = cons(cons(icon_path2, tooltip_renderings), icon_paths_with_tooltip_renderings);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    cons = cdolist_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return icon_paths_with_tooltip_renderings;
    }

    public static SubLObject tooltip_rendering_for_source(SubLObject source, final SubLObject media_org, final SubLObject source_type) {
        SubLObject paraphrase = NIL;
        SubLObject v_term = source;
        if (NIL != media_org) {
            paraphrase = pph_main.generate_phrase_for_java(media_org, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            v_term = media_org;
        }
        if (NIL == paraphrase) {
            paraphrase = pph_main.generate_phrase_for_java(source, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            v_term = source;
        }
        if ((NIL == paraphrase) && (NIL != cycl_grammar.cycl_denotational_term_p(source_type))) {
            final SubLObject source_type_pph = pph_main.generate_phrase(source_type, $list47, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (source_type_pph.isString()) {
                paraphrase = pph_main.generate_phrase_for_java(cconcatenate($str48$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(source_type_pph), $str49$_of_unknown_provenance_ }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                v_term = source_type;
            }
        }
        if (NIL == paraphrase) {
            paraphrase = pph_main.generate_phrase_for_java($source_unknown_publisher$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            v_term = NIL;
        }
        return list(paraphrase, v_term);
    }

    public static SubLObject source_citation_string(SubLObject source, SubLObject style, SubLObject markup_language) {
        if (style == UNPROVIDED) {
            style = $ANY;
        }
        if (markup_language == UNPROVIDED) {
            markup_language = $$HypertextMarkupLanguage;
        }
        if ($ANY == style) {
            style = $sym53$_X;
        }
        if ($ANY == markup_language) {
            markup_language = $sym54$_Y;
        }
        final SubLObject citation_var = $sym55$_CITATION;
        final SubLObject citations = ask_utilities.query_variable(citation_var, make_quaternary_formula($const56$citationStringForStyleAndRenderin, source, style, markup_language, citation_var), $$InferencePSC, list($MAX_TRANSFORMATION_DEPTH, ZERO_INTEGER, $MAX_TIME, FIVE_INTEGER, $MAX_NUMBER, ONE_INTEGER));
        return NIL != list_utilities.non_empty_list_p(citations) ? citations.first() : NIL;
    }

    public static SubLObject declare_sources_file() {
        declareFunction("assertion_sourcedP", "ASSERTION-SOURCED?", 1, 0, false);
        declareFunction("assertion_sources", "ASSERTION-SOURCES", 1, 0, false);
        declareFunction("assertion_sources_int", "ASSERTION-SOURCES-INT", 2, 0, false);
        declareFunction("possible_source_attribution_assertionP", "POSSIBLE-SOURCE-ATTRIBUTION-ASSERTION?", 1, 0, false);
        declareFunction("hlmt_sources", "HLMT-SOURCES", 1, 0, false);
        declareFunction("inference_answer_sources_from_signature", "INFERENCE-ANSWER-SOURCES-FROM-SIGNATURE", 1, 0, false);
        declareFunction("inference_answer_sources_internal", "INFERENCE-ANSWER-SOURCES-INTERNAL", 1, 0, false);
        declareFunction("inference_answer_sources", "INFERENCE-ANSWER-SOURCES", 1, 0, false);
        declareFunction("inference_answer_justification_sources_int", "INFERENCE-ANSWER-JUSTIFICATION-SOURCES-INT", 1, 0, false);
        declareFunction("support_sources_recursive_int", "SUPPORT-SOURCES-RECURSIVE-INT", 1, 0, false);
        declareFunction("sksi_support_sources", "SKSI-SUPPORT-SOURCES", 1, 0, false);
        declareFunction("assertion_sources_recursive_int", "ASSERTION-SOURCES-RECURSIVE-INT", 1, 0, false);
        declareFunction("deduction_sources_recursive_int", "DEDUCTION-SOURCES-RECURSIVE-INT", 1, 0, false);
        declareFunction("assertion_corroborating_sources", "ASSERTION-CORROBORATING-SOURCES", 2, 0, false);
        declareFunction("mt_sources_internal", "MT-SOURCES-INTERNAL", 1, 0, false);
        declareFunction("mt_sources", "MT-SOURCES", 1, 0, false);
        declareFunction("assertion_sources_via_inference_internal", "ASSERTION-SOURCES-VIA-INFERENCE-INTERNAL", 1, 0, false);
        declareFunction("assertion_sources_via_inference", "ASSERTION-SOURCES-VIA-INFERENCE", 1, 0, false);
        declareFunction("possibly_combine_assertion_sources", "POSSIBLY-COMBINE-ASSERTION-SOURCES", 2, 0, false);
        declareFunction("cde_document_pattern", "CDE-DOCUMENT-PATTERN", 0, 0, false);
        declareFunction("cde_document_p", "CDE-DOCUMENT-P", 1, 0, false);
        declareFunction("source_from_cde_document_and_string", "SOURCE-FROM-CDE-DOCUMENT-AND-STRING", 1, 0, false);
        declareFunction("source_icon_domain_mt", "SOURCE-ICON-DOMAIN-MT", 0, 0, false);
        declareFunction("icon_path_for_source", "ICON-PATH-FOR-SOURCE", 1, 1, false);
        declareFunction("add_tiny_icon", "ADD-TINY-ICON", 2, 0, false);
        declareFunction("remove_tiny_icon", "REMOVE-TINY-ICON", 2, 0, false);
        declareFunction("clear_icon_relative_path_for_source", "CLEAR-ICON-RELATIVE-PATH-FOR-SOURCE", 0, 0, false);
        declareFunction("remove_icon_relative_path_for_source", "REMOVE-ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        declareFunction("icon_relative_path_for_source_internal", "ICON-RELATIVE-PATH-FOR-SOURCE-INTERNAL", 2, 0, false);
        declareFunction("icon_relative_path_for_source", "ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        declareFunction("non_default_icon_relative_path_for_source", "NON-DEFAULT-ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        declareFunction("default_icon_relative_path_for_source", "DEFAULT-ICON-RELATIVE-PATH-FOR-SOURCE", 1, 1, false);
        declareFunction("more_specific_typeP", "MORE-SPECIFIC-TYPE?", 2, 1, false);
        declareFunction("really_min_isa_among_specs_of", "REALLY-MIN-ISA-AMONG-SPECS-OF", 3, 0, false);
        declareMacro("with_tkb_image_root_placeholder", "WITH-TKB-IMAGE-ROOT-PLACEHOLDER");
        declareFunction("get_tkb_image_root", "GET-TKB-IMAGE-ROOT", 0, 0, false);
        declareFunction("get_tkb_image_root_no_placeholder", "GET-TKB-IMAGE-ROOT-NO-PLACEHOLDER", 0, 0, false);
        declareFunction("source_icon_paths_for_answer", "SOURCE-ICON-PATHS-FOR-ANSWER", 3, 0, false);
        declareFunction("source_icon_paths_for_inference_answer", "SOURCE-ICON-PATHS-FOR-INFERENCE-ANSWER", 1, 0, false);
        declareFunction("tooltip_rendering_for_source", "TOOLTIP-RENDERING-FOR-SOURCE", 3, 0, false);
        declareFunction("source_citation_string", "SOURCE-CITATION-STRING", 1, 2, false);
        return NIL;
    }

    public static SubLObject init_sources_file() {
        deflexical("*NON-ASSERTION-SOURCE-CITATION-PREDS*", $list1);
        defparameter("*INFERENCE-ANSWER-SOURCES-VISITED-ASSERTIONS*", NIL);
        deflexical("*CDE-DOCUMENT-PATTERN*", misc_utilities.uninitialized());
        defparameter("*SOURCE-ICON-DOMAIN-MT*", NIL);
        deflexical("*ICON-RELATIVE-PATH-FOR-SOURCE-CACHING-STATE*", NIL);
        defparameter("*TKB-IMAGE-ROOT-PLACEHOLDER*", NIL);
        defconstant("*SOURCE-UNKNOWN-PUBLISHER*", $str44$_unknown_provenance_);
        return NIL;
    }

    public static SubLObject setup_sources_file() {
        register_external_symbol(INFERENCE_ANSWER_SOURCES_FROM_SIGNATURE);
        memoization_state.note_memoized_function(INFERENCE_ANSWER_SOURCES);
        memoization_state.note_memoized_function(MT_SOURCES);
        memoization_state.note_memoized_function(ASSERTION_SOURCES_VIA_INFERENCE);
        register_external_symbol(ICON_PATH_FOR_SOURCE);
        register_kb_function(ADD_TINY_ICON);
        register_kb_function(REMOVE_TINY_ICON);
        memoization_state.note_globally_cached_function(ICON_RELATIVE_PATH_FOR_SOURCE);
        register_external_symbol(GET_TKB_IMAGE_ROOT);
        register_external_symbol(SOURCE_ICON_PATHS_FOR_ANSWER);
        register_external_symbol(SOURCE_CITATION_STRING);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sources_file();
    }

    @Override
    public void initializeVariables() {
        init_sources_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sources_file();
    }

    static {




































































    }
}

/**
 * Total time: 473 ms
 */
