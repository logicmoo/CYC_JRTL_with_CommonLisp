package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_context_tools extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_context_tools();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_context_tools";

    public static final String myFingerPrint = "e0dd98aad1940dbdd963b84c00768e3974a24a8146133fe1b3d07a0f8a167346";

    // deflexical
    private static final SubLSymbol $rkf_interaction_context_stem$ = makeSymbol("*RKF-INTERACTION-CONTEXT-STEM*");

    // deflexical
    private static final SubLSymbol $rkf_scenario_interaction_context_stem$ = makeSymbol("*RKF-SCENARIO-INTERACTION-CONTEXT-STEM*");

    // deflexical
    private static final SubLSymbol $rkf_parsing_interaction_context_stem$ = makeSymbol("*RKF-PARSING-INTERACTION-CONTEXT-STEM*");

    // deflexical
    private static final SubLSymbol $rkf_generation_interaction_context_stem$ = makeSymbol("*RKF-GENERATION-INTERACTION-CONTEXT-STEM*");

    // deflexical
    private static final SubLSymbol $rkf_lexical_interaction_context_stem$ = makeSymbol("*RKF-LEXICAL-INTERACTION-CONTEXT-STEM*");

    // deflexical
    // The specificity order in which the indicators should be tried.
    private static final SubLSymbol $rkf_topic_mt_indicator_predicates$ = makeSymbol("*RKF-TOPIC-MT-INDICATOR-PREDICATES*");



    public static final SubLString $$$InteractionContext = makeString("InteractionContext");

    public static final SubLString $$$ScenarioInteractionContext = makeString("ScenarioInteractionContext");

    public static final SubLString $$$ParsingInteractionContext = makeString("ParsingInteractionContext");

    public static final SubLString $$$GenerationInteractionContext = makeString("GenerationInteractionContext");

    public static final SubLString $$$LexicalInteractionContext = makeString("LexicalInteractionContext");

    private static final SubLObject $$ScenarioDescriptionMt = reader_make_constant_shell(makeString("ScenarioDescriptionMt"));

    private static final SubLObject $$Language_SpecificMicrotheory = reader_make_constant_shell(makeString("Language-SpecificMicrotheory"));

    private static final SubLObject $$TemporaryLexicalMicrotheory = reader_make_constant_shell(makeString("TemporaryLexicalMicrotheory"));

    public static final SubLList $list9 = list(makeSymbol("COLLECTION"), makeSymbol("MT"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list11 = list(reader_make_constant_shell(makeString("RKFInteractionContextMicrotheory")));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    public static final SubLList $list13 = list(reader_make_constant_shell(makeString("Microtheory")));



    private static final SubLObject $$lexicalRootMtForLanguage = reader_make_constant_shell(makeString("lexicalRootMtForLanguage"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$templateParsingRootMtForLanguage = reader_make_constant_shell(makeString("templateParsingRootMtForLanguage"));

    private static final SubLObject $$paraphraseRootMtForLanguage = reader_make_constant_shell(makeString("paraphraseRootMtForLanguage"));

    public static final SubLList $list19 = list(reader_make_constant_shell(makeString("uiaDemoEnvironmentTopic")), reader_make_constant_shell(makeString("mtTopic")));



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLSymbol $sym22$_MT = makeSymbol("?MT");

    public static final SubLList $list23 = list(makeKeyword("GENL"));

    public static final SubLList $list24 = list(list(reader_make_constant_shell(makeString("mtRefinementDomainBasis")), makeSymbol("?MT"), makeKeyword("GENL")));

    private static final SubLObject $$mtRefinementDomainBasis = reader_make_constant_shell(makeString("mtRefinementDomainBasis"));

    public static final SubLString $$$TemporaryLexificationMt = makeString("TemporaryLexificationMt");

    public static SubLObject rkf_set_context(final SubLObject microtheory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(microtheory) : "forts.fort_p(microtheory) " + "CommonSymbols.NIL != forts.fort_p(microtheory) " + microtheory;
        $rkf_mt$.setDynamicValue(microtheory, thread);
        return $rkf_mt$.getDynamicValue(thread);
    }

    public static SubLObject rkf_create_interaction_context(final SubLObject genl_microtheory) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_create_interaction_context_int(list(genl_microtheory), $rkf_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_create_scenario_interaction_context(final SubLObject genl_microtheory) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_create_interaction_context_int(list(genl_microtheory, $$ScenarioDescriptionMt), $rkf_scenario_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_create_parsing_interaction_context(final SubLObject genl_microtheory, final SubLObject parsing_mt, final SubLObject lexical_mt) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_create_specialized_interaction_context_int(list(genl_microtheory, parsing_mt, lexical_mt), $rkf_parsing_interaction_context_stem$.getGlobalValue(), list(list($$Language_SpecificMicrotheory, mt_vars.$mt_mt$.getGlobalValue())));
    }

    public static SubLObject rkf_create_generation_interaction_context(final SubLObject genl_microtheory, final SubLObject generation_mt, final SubLObject lexical_mt) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_create_specialized_interaction_context_int(list(genl_microtheory, generation_mt, lexical_mt), $rkf_generation_interaction_context_stem$.getGlobalValue(), list(list($$Language_SpecificMicrotheory, mt_vars.$mt_mt$.getGlobalValue())));
    }

    public static SubLObject rkf_create_lexical_interaction_context(final SubLObject genl_microtheory, final SubLObject lexical_mt) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_create_specialized_interaction_context_int(list(genl_microtheory, lexical_mt), $rkf_lexical_interaction_context_stem$.getGlobalValue(), list(list($$Language_SpecificMicrotheory, mt_vars.$mt_mt$.getGlobalValue()), list($$TemporaryLexicalMicrotheory, mt_vars.$mt_mt$.getGlobalValue())));
    }

    public static SubLObject rkf_potentially_is_domain_interaction_contextP(final SubLObject fort) {
        return makeBoolean(((((NIL != rkf_potentially_is_an_interaction_contextP(fort)) && (NIL == rkf_potentially_is_scenario_interaction_contextP(fort))) && (NIL == rkf_potentially_is_parsing_interaction_contextP(fort))) && (NIL == rkf_potentially_is_generation_interaction_contextP(fort))) && (NIL == rkf_potentially_is_lexical_interaction_contextP(fort)));
    }

    public static SubLObject rkf_potentially_is_an_interaction_contextP(final SubLObject fort) {
        return rkf_potentially_is_any_interaction_contextP(fort, $rkf_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_potentially_is_scenario_interaction_contextP(final SubLObject fort) {
        return rkf_potentially_is_any_interaction_contextP(fort, $rkf_scenario_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_potentially_is_parsing_interaction_contextP(final SubLObject fort) {
        return rkf_potentially_is_any_interaction_contextP(fort, $rkf_parsing_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_potentially_is_generation_interaction_contextP(final SubLObject fort) {
        return rkf_potentially_is_any_interaction_contextP(fort, $rkf_generation_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_potentially_is_lexical_interaction_contextP(final SubLObject fort) {
        return rkf_potentially_is_any_interaction_contextP(fort, $rkf_lexical_interaction_context_stem$.getGlobalValue());
    }

    public static SubLObject rkf_potentially_is_any_interaction_contextP(final SubLObject fort, final SubLObject stem) {
        final SubLObject name = kb_paths.fort_name(fort);
        return list_utilities.sublisp_boolean(search(stem, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_create_specialized_interaction_context_int(final SubLObject v_genl_mts, final SubLObject name, final SubLObject aspects) {
        final SubLObject v_context = rkf_create_interaction_context_int(v_genl_mts, name);
        SubLObject cdolist_list_var = aspects;
        SubLObject aspect = NIL;
        aspect = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = aspect;
            SubLObject collection = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            collection = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list9);
            mt = current.first();
            current = current.rest();
            if (NIL == current) {
                rkf_assertion_utilities.rkf_assert(list($$isa, v_context, collection), mt, UNPROVIDED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list9);
            }
            cdolist_list_var = cdolist_list_var.rest();
            aspect = cdolist_list_var.first();
        } 
        return v_context;
    }

    public static SubLObject rkf_create_interaction_context_int(final SubLObject v_genl_mts, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_context = NIL;
        final SubLObject genl_mt_1 = v_genl_mts.first();
        final SubLObject _prev_bind_0 = $rkf_mt$.currentBinding(thread);
        try {
            $rkf_mt$.bind(genl_mt_1, thread);
            v_context = rkf_term_utilities.rkf_create(name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $rkf_mt$.rebind(_prev_bind_0, thread);
        }
        rkf_assertion_utilities.rkf_assert(listS($$isa, v_context, $list11), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = v_genl_mts;
        SubLObject genl_mt = NIL;
        genl_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_assert(list($$genlMt, v_context, genl_mt), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            genl_mt = cdolist_list_var.first();
        } 
        return v_context;
    }

    public static SubLObject rkf_instantiate_interaction_context(final SubLObject genl_microtheory, final SubLObject external_id) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_instantiate_interaction_context_int(list(genl_microtheory), $rkf_interaction_context_stem$.getGlobalValue(), external_id);
    }

    public static SubLObject rkf_instantiate_scenario_interaction_context(final SubLObject genl_microtheory, final SubLObject external_id) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_instantiate_interaction_context_int(list(genl_microtheory, $$ScenarioDescriptionMt), $rkf_scenario_interaction_context_stem$.getGlobalValue(), external_id);
    }

    public static SubLObject rkf_instantiate_parsing_interaction_context(final SubLObject genl_microtheory, final SubLObject parsing_mt, final SubLObject lexical_interaction_mt, final SubLObject external_id) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_instantiate_interaction_context_int(list(genl_microtheory, parsing_mt, lexical_interaction_mt), $rkf_parsing_interaction_context_stem$.getGlobalValue(), external_id);
    }

    public static SubLObject rkf_instantiate_generation_interaction_context(final SubLObject genl_microtheory, final SubLObject generation_mt, final SubLObject lexical_interaction_mt, final SubLObject external_id) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_instantiate_interaction_context_int(list(genl_microtheory, generation_mt, lexical_interaction_mt), $rkf_generation_interaction_context_stem$.getGlobalValue(), external_id);
    }

    public static SubLObject rkf_instantiate_lexical_interaction_context(final SubLObject genl_microtheory, final SubLObject lexical_mt, final SubLObject external_id) {
        assert NIL != forts.fort_p(genl_microtheory) : "forts.fort_p(genl_microtheory) " + "CommonSymbols.NIL != forts.fort_p(genl_microtheory) " + genl_microtheory;
        return rkf_instantiate_interaction_context_int(list(genl_microtheory, lexical_mt), $rkf_lexical_interaction_context_stem$.getGlobalValue(), external_id);
    }

    public static SubLObject rkf_instantiate_interaction_context_int(final SubLObject v_genl_mts, final SubLObject name, final SubLObject external_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_context = NIL;
        final SubLObject genl_mt_1 = v_genl_mts.first();
        final SubLObject _prev_bind_0 = $rkf_mt$.currentBinding(thread);
        try {
            $rkf_mt$.bind(genl_mt_1, thread);
            v_context = rkf_term_utilities.rkf_re_create(name, external_id, UNPROVIDED);
        } finally {
            $rkf_mt$.rebind(_prev_bind_0, thread);
        }
        rkf_assertion_utilities.rkf_assert(listS($$isa, v_context, $list13), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = v_genl_mts;
        SubLObject genl_mt = NIL;
        genl_mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_assert(list($$genlMt, v_context, genl_mt), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            genl_mt = cdolist_list_var.first();
        } 
        return v_context;
    }

    public static SubLObject rkf_determine_language_lexical_mt(final SubLObject language) {
        final SubLObject mt_list = backward.removal_ask_variable($MT, list($$lexicalRootMtForLanguage, $MT, language), $$InferencePSC, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(mt_list)) {
            return mt_list.first();
        }
        if (mt_list.isCons()) {
            return mt_list.first();
        }
        return NIL;
    }

    public static SubLObject rkf_determine_language_parsing_mt(final SubLObject language) {
        final SubLObject mt_list = backward.removal_ask_variable($MT, list($$templateParsingRootMtForLanguage, $MT, language), $$InferencePSC, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(mt_list)) {
            return mt_list.first();
        }
        if (mt_list.isCons()) {
            return mt_list.first();
        }
        return NIL;
    }

    public static SubLObject rkf_determine_language_generation_mt(final SubLObject language) {
        final SubLObject mt_list = backward.removal_ask_variable($MT, list($$paraphraseRootMtForLanguage, $MT, language), $$InferencePSC, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(mt_list)) {
            return mt_list.first();
        }
        if (mt_list.isCons()) {
            return mt_list.first();
        }
        return NIL;
    }

    public static SubLObject rkf_determine_domain_mt(final SubLObject topic) {
        SubLObject mt = NIL;
        if (NIL == mt) {
            SubLObject csome_list_var = $rkf_topic_mt_indicator_predicates$.getGlobalValue();
            SubLObject predicate = NIL;
            predicate = csome_list_var.first();
            while ((NIL == mt) && (NIL != csome_list_var)) {
                final SubLObject mt_list = backward.removal_ask_variable($MT, list(predicate, $MT, topic), $$InferencePSC, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(mt_list)) {
                    mt = mt_list.first();
                } else
                    if (mt_list.isCons()) {
                        mt = mt_list.first();
                    }

                csome_list_var = csome_list_var.rest();
                predicate = csome_list_var.first();
            } 
        }
        return mt;
    }

    public static SubLObject rkf_determine_language_domain_refinement_mt(final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLObject mt_list = ask_utilities.ask_variable($GENL, listS($$and, list($$genlMt, $sym22$_MT, language_mt), listS($$genlMt, domain_mt, $list23), $list24), $$InferencePSC, ZERO_INTEGER, NIL, NIL, NIL);
        if (NIL == mt_list) {
            return language_mt;
        }
        final SubLObject min_mts = genl_mts.min_mts(mt_list, UNPROVIDED);
        SubLObject min_mt = NIL;
        if (NIL != list_utilities.singletonP(min_mts)) {
            min_mt = min_mts.first();
        } else {
            min_mt = min_mts.first();
        }
        final SubLObject refinement_mts = ask_utilities.ask_variable($MT, list($$and, list($$genlMt, $MT, language_mt), list($$genlMt, domain_mt, min_mt), list($$mtRefinementDomainBasis, $MT, min_mt)), $$InferencePSC, ZERO_INTEGER, NIL, NIL, NIL);
        if (NIL == refinement_mts) {
            return language_mt;
        }
        final SubLObject min_refinement_mts = genl_mts.min_mts(refinement_mts, UNPROVIDED);
        if (NIL != list_utilities.singletonP(min_refinement_mts)) {
            return min_refinement_mts.first();
        }
        return min_refinement_mts.first();
    }

    public static SubLObject rkf_determine_lexification_mt(final SubLObject language_mt, final SubLObject domain_interaction_mt) {
        final SubLObject existing_mt = rkf_check_lexification_mt(language_mt, domain_interaction_mt);
        if (NIL != existing_mt) {
            return existing_mt;
        }
        return rkf_create_interaction_context_int(list(language_mt, domain_interaction_mt), $$$TemporaryLexificationMt);
    }

    public static SubLObject rkf_check_lexification_mt(final SubLObject language_mt, final SubLObject domain_interaction_mt) {
        final SubLObject mt_list = ask_utilities.ask_variable($MT, list($$and, list($$genlMt, $MT, language_mt), list($$genlMt, $MT, domain_interaction_mt)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return genl_mts.min_mts(mt_list, UNPROVIDED).first();
    }

    public static SubLObject declare_rkf_context_tools_file() {
        declareFunction(me, "rkf_set_context", "RKF-SET-CONTEXT", 1, 0, false);
        declareFunction(me, "rkf_create_interaction_context", "RKF-CREATE-INTERACTION-CONTEXT", 1, 0, false);
        declareFunction(me, "rkf_create_scenario_interaction_context", "RKF-CREATE-SCENARIO-INTERACTION-CONTEXT", 1, 0, false);
        declareFunction(me, "rkf_create_parsing_interaction_context", "RKF-CREATE-PARSING-INTERACTION-CONTEXT", 3, 0, false);
        declareFunction(me, "rkf_create_generation_interaction_context", "RKF-CREATE-GENERATION-INTERACTION-CONTEXT", 3, 0, false);
        declareFunction(me, "rkf_create_lexical_interaction_context", "RKF-CREATE-LEXICAL-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction(me, "rkf_potentially_is_domain_interaction_contextP", "RKF-POTENTIALLY-IS-DOMAIN-INTERACTION-CONTEXT?", 1, 0, false);
        declareFunction(me, "rkf_potentially_is_an_interaction_contextP", "RKF-POTENTIALLY-IS-AN-INTERACTION-CONTEXT?", 1, 0, false);
        declareFunction(me, "rkf_potentially_is_scenario_interaction_contextP", "RKF-POTENTIALLY-IS-SCENARIO-INTERACTION-CONTEXT?", 1, 0, false);
        declareFunction(me, "rkf_potentially_is_parsing_interaction_contextP", "RKF-POTENTIALLY-IS-PARSING-INTERACTION-CONTEXT?", 1, 0, false);
        declareFunction(me, "rkf_potentially_is_generation_interaction_contextP", "RKF-POTENTIALLY-IS-GENERATION-INTERACTION-CONTEXT?", 1, 0, false);
        declareFunction(me, "rkf_potentially_is_lexical_interaction_contextP", "RKF-POTENTIALLY-IS-LEXICAL-INTERACTION-CONTEXT?", 1, 0, false);
        declareFunction(me, "rkf_potentially_is_any_interaction_contextP", "RKF-POTENTIALLY-IS-ANY-INTERACTION-CONTEXT?", 2, 0, false);
        declareFunction(me, "rkf_create_specialized_interaction_context_int", "RKF-CREATE-SPECIALIZED-INTERACTION-CONTEXT-INT", 3, 0, false);
        declareFunction(me, "rkf_create_interaction_context_int", "RKF-CREATE-INTERACTION-CONTEXT-INT", 2, 0, false);
        declareFunction(me, "rkf_instantiate_interaction_context", "RKF-INSTANTIATE-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction(me, "rkf_instantiate_scenario_interaction_context", "RKF-INSTANTIATE-SCENARIO-INTERACTION-CONTEXT", 2, 0, false);
        declareFunction(me, "rkf_instantiate_parsing_interaction_context", "RKF-INSTANTIATE-PARSING-INTERACTION-CONTEXT", 4, 0, false);
        declareFunction(me, "rkf_instantiate_generation_interaction_context", "RKF-INSTANTIATE-GENERATION-INTERACTION-CONTEXT", 4, 0, false);
        declareFunction(me, "rkf_instantiate_lexical_interaction_context", "RKF-INSTANTIATE-LEXICAL-INTERACTION-CONTEXT", 3, 0, false);
        declareFunction(me, "rkf_instantiate_interaction_context_int", "RKF-INSTANTIATE-INTERACTION-CONTEXT-INT", 3, 0, false);
        declareFunction(me, "rkf_determine_language_lexical_mt", "RKF-DETERMINE-LANGUAGE-LEXICAL-MT", 1, 0, false);
        declareFunction(me, "rkf_determine_language_parsing_mt", "RKF-DETERMINE-LANGUAGE-PARSING-MT", 1, 0, false);
        declareFunction(me, "rkf_determine_language_generation_mt", "RKF-DETERMINE-LANGUAGE-GENERATION-MT", 1, 0, false);
        declareFunction(me, "rkf_determine_domain_mt", "RKF-DETERMINE-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "rkf_determine_language_domain_refinement_mt", "RKF-DETERMINE-LANGUAGE-DOMAIN-REFINEMENT-MT", 2, 0, false);
        declareFunction(me, "rkf_determine_lexification_mt", "RKF-DETERMINE-LEXIFICATION-MT", 2, 0, false);
        declareFunction(me, "rkf_check_lexification_mt", "RKF-CHECK-LEXIFICATION-MT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_context_tools_file() {
        deflexical("*RKF-INTERACTION-CONTEXT-STEM*", $$$InteractionContext);
        deflexical("*RKF-SCENARIO-INTERACTION-CONTEXT-STEM*", $$$ScenarioInteractionContext);
        deflexical("*RKF-PARSING-INTERACTION-CONTEXT-STEM*", $$$ParsingInteractionContext);
        deflexical("*RKF-GENERATION-INTERACTION-CONTEXT-STEM*", $$$GenerationInteractionContext);
        deflexical("*RKF-LEXICAL-INTERACTION-CONTEXT-STEM*", $$$LexicalInteractionContext);
        deflexical("*RKF-TOPIC-MT-INDICATOR-PREDICATES*", $list19);
        return NIL;
    }

    public static SubLObject setup_rkf_context_tools_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_context_tools_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_context_tools_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_context_tools_file();
    }

    
}

/**
 * Total time: 77 ms
 */
