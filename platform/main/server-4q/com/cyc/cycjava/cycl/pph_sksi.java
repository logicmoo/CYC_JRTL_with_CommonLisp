package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.pph_sksi;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.pph_sksi.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_sksi extends SubLTranslatedFile {
    public static final SubLFile me = new pph_sksi();

    public static final String myName = "com.cyc.cycjava.cycl.pph_sksi";

    public static final String myFingerPrint = "e0b69af9ef55652721a6202f0a847079d4f1374dbeae1ad0191f9e11bdb2107f";

    // defparameter
    private static final SubLSymbol $inside_generate_sksiP$ = makeSymbol("*INSIDE-GENERATE-SKSI?*");

    // deflexical
    private static final SubLSymbol $pph_sksi_name_string_preds$ = makeSymbol("*PPH-SKSI-NAME-STRING-PREDS*");

    // deflexical
    private static final SubLSymbol $generate_sksi_skip_patterns$ = makeSymbol("*GENERATE-SKSI-SKIP-PATTERNS*");

    // deflexical
    private static final SubLSymbol $paraphrase_fns_for_external_terms$ = makeSymbol("*PARAPHRASE-FNS-FOR-EXTERNAL-TERMS*");

    // Internal Constants
    public static final SubLSymbol GENERATE_SKSI = makeSymbol("GENERATE-SKSI");

    private static final SubLSymbol $SKSI_SUPPORTED_EXTERNAL_TERM = makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM");



    private static final SubLSymbol GENERATE_SKSI_MEMOIZED = makeSymbol("GENERATE-SKSI-MEMOIZED");

    private static final SubLString $str4$Recursive_call_to_GENERATE_SKSI_ = makeString("Recursive call to GENERATE-SKSI.");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));



    private static final SubLList $list7 = list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI"));



    private static final SubLSymbol $BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");

    private static final SubLSymbol $sym10$_NAME = makeSymbol("?NAME");

    private static final SubLList $list11 = cons(makeSymbol("NAME-STRING-PRED"), makeSymbol("BACKCHAINS"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLList $list13 = list(makeKeyword("OR"), makeKeyword("TRANS-PREDICATE-POS"), makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI")));

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    private static final SubLSymbol $kw15$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    private static final SubLSymbol $sym16$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list17 = list(cons(reader_make_constant_shell(makeString("preferredNameString")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("preferredTermStrings")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("nameString")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("titleOfWork")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("definiteDescriptions")), ZERO_INTEGER), cons(reader_make_constant_shell(makeString("termStrings")), ZERO_INTEGER));

    private static final SubLList $list18 = list(list(reader_make_constant_shell(makeString("SchemaObjectFn")), list(makeKeyword("OR"), reader_make_constant_shell(makeString("CCF-SDB-Bnode-CMLS")), reader_make_constant_shell(makeString("CycRxPatientMapping")), reader_make_constant_shell(makeString("CycRxClaimMapping")), reader_make_constant_shell(makeString("CycRxPharmacyFormalProductTypeMapping"))), makeKeyword("ANYTHING")));

    private static final SubLObject $$preferredNameString = reader_make_constant_shell(makeString("preferredNameString"));

    private static final SubLObject $$genStringAssertion = reader_make_constant_shell(makeString("genStringAssertion"));

    private static final SubLList $list21 = list(makeKeyword("REWRITE-ALLOWED?"), T, makeKeyword("ALLOWED-MODULES"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI")));

    private static final SubLList $list22 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));

    private static final SubLList $list23 = list(reader_make_constant_shell(makeString("genlPreds")), list(makeKeyword("BIND"), makeSymbol("THIS-PRED")), reader_make_constant_shell(makeString("termStrings")));

    private static final SubLSymbol THIS_PRED = makeSymbol("THIS-PRED");

    private static final SubLSymbol GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI = makeSymbol("GENERATE-EXTERNAL-TERM-FROM-EXPLICIT-URI");



    private static final SubLSymbol $sym27$PPH_URI_STRING_ = makeSymbol("PPH-URI-STRING?");

    private static final SubLString $str28$_ = makeString("<");

    public static final SubLString $str29$_ = makeString(">");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$standardPrefixForURI = reader_make_constant_shell(makeString("standardPrefixForURI"));





    private static final SubLList $list35 = list(makeSymbol("PREFIX"), makeSymbol("REIFIED-URI"));

    private static final SubLObject $$uriString = reader_make_constant_shell(makeString("uriString"));

    private static final SubLString $str37$_ = makeString(":");

    private static final SubLSymbol GENERATE_EXTERNAL_TERM_FROM_CURRENT_INFERENCE_ANSWER = makeSymbol("GENERATE-EXTERNAL-TERM-FROM-CURRENT-INFERENCE-ANSWER");



    private static final SubLSymbol INFERENCE_ANSWER_SKSI_SUPPORTS = makeSymbol("INFERENCE-ANSWER-SKSI-SUPPORTS");

    private static final SubLSymbol $sym41$PPH_GENERALITY_ESTIMATE_ = makeSymbol("PPH-GENERALITY-ESTIMATE<");

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $sym43$_X = makeSymbol("?X");

    private static final SubLSymbol $sym44$VALID_EXTERNAL_TERM_TYPE_ = makeSymbol("VALID-EXTERNAL-TERM-TYPE?");

    private static final SubLList $list45 = list(cons(list(makeKeyword("TEST"), makeSymbol("CCF-BNODE-P")), makeSymbol("GENERATE-BNODE-FROM-CURRENT-INFERENCE-ANSWER")));

    private static final SubLList $list46 = cons(makeSymbol("PATTERN"), makeSymbol("THIS-FN"));

    private static final SubLList $list47 = list(list(makeKeyword("BIND"), makeSymbol("VALUE")));

    private static final SubLList $list48 = list(makeKeyword("BIND"), makeSymbol("VALUE"));



    private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell(makeString("nonPlural-Generic"));

    private static final SubLObject $$MedicalPatient = reader_make_constant_shell(makeString("MedicalPatient"));



    private static final SubLString $$$_with_ID_ = makeString(" with ID ");

    private static final SubLString $$$_of_the_patient_with_ID_ = makeString(" of the patient with ID ");

    private static final SubLObject $$SecondFn = reader_make_constant_shell(makeString("SecondFn"));

    private static final SubLString $$$_starting_at_ = makeString(" starting at ");

    private static final SubLObject $$DayFn = reader_make_constant_shell(makeString("DayFn"));

    private static final SubLString $$$_on_ = makeString(" on ");

    private static final SubLString $$$_ = makeString(" ");





    private static final SubLObject $$Situation = reader_make_constant_shell(makeString("Situation"));

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLSymbol $sym64$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    private static final SubLList $list65 = list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(59), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(59), list(reader_make_constant_shell(makeString("HourFn")), makeInteger(23), list(makeKeyword("BIND"), makeSymbol("DATE")))));



    private static final SubLObject $$startsNoLaterThan = reader_make_constant_shell(makeString("startsNoLaterThan"));

    private static final SubLObject $const68$time_intervalContains = reader_make_constant_shell(makeString("time:intervalContains"));



    private static final SubLSymbol $sym70$DATE_ = makeSymbol("DATE<");

    private static final SubLList $list71 = list(reader_make_constant_shell(makeString("SecondFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("MinuteFn")), ZERO_INTEGER, list(reader_make_constant_shell(makeString("HourFn")), ZERO_INTEGER, list(makeKeyword("BIND"), makeSymbol("DATE")))));

    private static final SubLObject $$startsNoEarlierThan = reader_make_constant_shell(makeString("startsNoEarlierThan"));

    private static final SubLSymbol $sym73$DATE_ = makeSymbol("DATE>");

    private static final SubLObject $$cCFCCFID = reader_make_constant_shell(makeString("cCFCCFID"));

    private static final SubLObject $$cCF_contains = reader_make_constant_shell(makeString("cCF-contains"));

    public static SubLObject generate_sksi(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sksi_naut = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject name = generate_sksi_memoized(sksi_naut, UNPROVIDED, UNPROVIDED);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject support = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (name.isString()) {
            pph_phrase.pph_phrase_set_string(phrase, name);
            pph_phrase.pph_phrase_set_agr_pred(phrase, pred, UNPROVIDED);
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
            if (NIL != arguments.support_p(support)) {
                pph_phrase.pph_phrase_add_justification(phrase, support);
            }
        }
        return phrase;
    }

    public static SubLObject generate_sksi_memoized_internal(final SubLObject sksi_naut, SubLObject inside_generate_sksiP, SubLObject domain_mt) {
        if (inside_generate_sksiP == UNPROVIDED) {
            inside_generate_sksiP = $inside_generate_sksiP$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $inside_generate_sksiP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            $inside_generate_sksiP$.bind(inside_generate_sksiP, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            SubLObject name = NIL;
            SubLObject pred = NIL;
            SubLObject support = NIL;
            if (NIL != $inside_generate_sksiP$.getDynamicValue(thread)) {
                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn($str4$Recursive_call_to_GENERATE_SKSI_);
                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            } else
                if (NIL == skip_generate_sksi_for_nautP(sksi_naut)) {
                    final SubLObject _prev_bind_0_$1 = $inside_generate_sksiP$.currentBinding(thread);
                    try {
                        $inside_generate_sksiP$.bind(T, thread);
                        final SubLObject mt = (NIL != sksi_kb_accessors.sksi_content_mt_p(pph_vars.$pph_domain_mt$.getDynamicValue(thread))) ? pph_vars.$pph_domain_mt$.getDynamicValue(thread) : $$InferencePSC;
                        SubLObject v_properties = list($ALLOWED_MODULES, $list7, $RETURN, $BINDINGS_AND_SUPPORTS);
                        final SubLObject name_var = $sym10$_NAME;
                        SubLObject doneP;
                        SubLObject rest;
                        SubLObject cons;
                        SubLObject current;
                        SubLObject datum;
                        SubLObject name_string_pred;
                        SubLObject backchains;
                        SubLObject query_results;
                        SubLObject this_name;
                        SubLObject this_pred;
                        SubLObject this_support;
                        for (doneP = NIL, rest = NIL, rest = pph_sksi_name_string_preds(); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                            cons = rest.first();
                            datum = current = cons;
                            name_string_pred = NIL;
                            backchains = NIL;
                            destructuring_bind_must_consp(current, datum, $list11);
                            name_string_pred = current.first();
                            current = backchains = current.rest();
                            v_properties = putf(v_properties, $MAX_TRANSFORMATION_DEPTH, backchains);
                            if (backchains.isPositive()) {
                                v_properties = putf(v_properties, $ALLOWED_MODULES, $list13);
                            }
                            if (pred.eql($$termStrings)) {
                                v_properties = putf(v_properties, $kw15$REWRITE_ALLOWED_, T);
                            }
                            query_results = pph_utilities.pph_query(list(name_string_pred, sksi_naut, name_var), mt, v_properties);
                            if (NIL != query_results) {
                                thread.resetMultipleValues();
                                this_name = pph_name_and_pred_from_sksi_query_results(query_results, sksi_naut, name_var, name_string_pred);
                                this_pred = thread.secondMultipleValue();
                                this_support = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                if (this_name.isString()) {
                                    name = this_name;
                                    pred = this_pred;
                                    support = this_support;
                                    doneP = T;
                                }
                            }
                        }
                    } finally {
                        $inside_generate_sksiP$.rebind(_prev_bind_0_$1, thread);
                    }
                }

            return values(name, pred, support);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            $inside_generate_sksiP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject generate_sksi_memoized(final SubLObject sksi_naut, SubLObject inside_generate_sksiP, SubLObject domain_mt) {
        if (inside_generate_sksiP == UNPROVIDED) {
            inside_generate_sksiP = $inside_generate_sksiP$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return generate_sksi_memoized_internal(sksi_naut, inside_generate_sksiP, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GENERATE_SKSI_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GENERATE_SKSI_MEMOIZED, THREE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GENERATE_SKSI_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sksi_naut, inside_generate_sksiP, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sksi_naut.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inside_generate_sksiP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(generate_sksi_memoized_internal(sksi_naut, inside_generate_sksiP, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sksi_naut, inside_generate_sksiP, domain_mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject skip_generate_sksi_for_nautP(final SubLObject sksi_naut) {
        SubLObject skipP = NIL;
        if (NIL == skipP) {
            SubLObject csome_list_var = $generate_sksi_skip_patterns$.getGlobalValue();
            SubLObject pattern = NIL;
            pattern = csome_list_var.first();
            while ((NIL == skipP) && (NIL != csome_list_var)) {
                if (NIL != formula_pattern_match.formula_matches_pattern(sksi_naut, pattern)) {
                    skipP = T;
                }
                csome_list_var = csome_list_var.rest();
                pattern = csome_list_var.first();
            } 
        }
        return skipP;
    }

    public static SubLObject pph_sksi_name_string_preds() {
        return $pph_sksi_name_string_preds$.getGlobalValue();
    }

    public static SubLObject pph_name_and_pred_from_sksi_query_results(final SubLObject query_results, final SubLObject sksi_naut, final SubLObject name_var, final SubLObject proven_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = NIL;
        SubLObject pred = NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_name = pph_name_and_pred_from_query_result(result, name_var, proven_pred);
            final SubLObject this_pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (this_name.isString()) {
                if (NIL != pph_preferred_sksi_lexificationP(this_pred, sksi_naut, this_name)) {
                    return values(this_name, this_pred);
                }
                if (NIL != pph_ideal_sksi_name_pred_p(this_pred)) {
                    return values(this_name, this_pred);
                }
                if (NIL != pph_better_sksi_name_pred_p(this_pred, pred)) {
                    name = this_name;
                    pred = this_pred;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return values(name, pred);
    }

    public static SubLObject pph_preferred_sksi_lexificationP(final SubLObject this_pred, final SubLObject sksi_naut, final SubLObject this_name) {
        return makeBoolean((NIL != pph_utilities.pph_genl_predicateP(this_pred, $$preferredNameString, UNPROVIDED)) || (NIL != cyc_kernel.closed_query_success_result_p(pph_utilities.pph_query(list($$genStringAssertion, sksi_naut, list(this_pred, sksi_naut, this_name)), $$InferencePSC, $list21))));
    }

    public static SubLObject pph_ideal_sksi_name_pred_p(final SubLObject this_pred) {
        return eq(this_pred, $$preferredNameString);
    }

    public static SubLObject pph_better_sksi_name_pred_p(final SubLObject this_pred, final SubLObject other_pred) {
        if (NIL != pph_utilities.pph_genl_predicateP(this_pred, other_pred, UNPROVIDED)) {
            return T;
        }
        if ((NIL != pph_utilities.pph_name_string_predP(this_pred)) && (NIL == pph_utilities.pph_name_string_predP(other_pred))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_name_and_pred_from_query_result(final SubLObject result, final SubLObject name_var, final SubLObject proven_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        SubLObject supports = NIL;
        destructuring_bind_must_consp(result, result, $list22);
        v_bindings = result.first();
        SubLObject current = result.rest();
        destructuring_bind_must_consp(current, result, $list22);
        supports = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject name = bindings.variable_lookup(name_var, v_bindings);
            SubLObject pred = NIL;
            if (NIL == pred) {
                SubLObject csome_list_var = supports;
                SubLObject support = NIL;
                support = csome_list_var.first();
                while ((NIL == pred) && (NIL != csome_list_var)) {
                    thread.resetMultipleValues();
                    final SubLObject successP = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), $list23);
                    final SubLObject v_bindings_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != successP) {
                        pred = list_utilities.alist_lookup(v_bindings_$2, THIS_PRED, UNPROVIDED, UNPROVIDED);
                    }
                    csome_list_var = csome_list_var.rest();
                    support = csome_list_var.first();
                } 
            }
            if (NIL == forts.fort_p(pred)) {
                pred = proven_pred;
            }
            return values(name, pred);
        }
        cdestructuring_bind_error(result, $list22);
        return NIL;
    }

    public static SubLObject generate_external_term_from_explicit_uri(final SubLObject phrase) {
        final SubLObject external_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject uri = cycl_utilities.expression_find_if($sym27$PPH_URI_STRING_, cycl_utilities.formula_args(external_term, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        if (NIL != uri) {
            pph_phrase.pph_phrase_set_string(phrase, pph_display_string_for_uri(uri));
        }
        return phrase;
    }

    public static SubLObject pph_uri_stringP(final SubLObject obj) {
        return makeBoolean((obj.isString() && (NIL != list_utilities.lengthG(obj, TWO_INTEGER, UNPROVIDED))) && ((NIL != web_utilities.uri_p(obj, UNPROVIDED)) || ((string_utilities.first_char(obj).eql(CHAR_less) && string_utilities.last_char(obj).eql(CHAR_greater)) && (NIL != web_utilities.uri_p(string_utilities.substring(obj, ONE_INTEGER, subtract(length(obj), ONE_INTEGER)), UNPROVIDED)))));
    }

    public static SubLObject pph_display_string_for_uri(final SubLObject uri) {
        final SubLObject full_uri = string_utilities.post_remove(string_utilities.pre_remove(uri, $str28$_, UNPROVIDED), $str29$_, UNPROVIDED);
        return pph_maybe_abbreviate_uri(full_uri);
    }

    public static SubLObject pph_maybe_abbreviate_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abbreviated = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$standardPrefixForURI;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$3 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = $progress_last_pacification_time$.currentBinding(thread);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$5 = NIL;
                                final SubLObject token_var_$6 = NIL;
                                while (NIL == done_var_$5) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(gaf));
                                    if (NIL != valid_$7) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(gaf);
                                        SubLObject prefix = NIL;
                                        SubLObject reified_uri = NIL;
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        prefix = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list35);
                                        reified_uri = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            SubLObject expanded = NIL;
                                            final SubLObject pred_var_$8 = $$uriString;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_uri, ONE_INTEGER, pred_var_$8)) {
                                                final SubLObject iterator_var_$9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_uri, ONE_INTEGER, pred_var_$8);
                                                SubLObject done_var_$6 = NIL;
                                                final SubLObject token_var_$7 = NIL;
                                                while (NIL == done_var_$6) {
                                                    final SubLObject final_index_spec_$12 = iteration.iteration_next_without_values_macro_helper(iterator_var_$9, token_var_$7);
                                                    final SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(final_index_spec_$12));
                                                    if (NIL != valid_$8) {
                                                        SubLObject final_index_iterator_$14 = NIL;
                                                        try {
                                                            final_index_iterator_$14 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$12, $GAF, $TRUE, NIL);
                                                            SubLObject done_var_$7 = NIL;
                                                            final SubLObject token_var_$8 = NIL;
                                                            while (NIL == done_var_$7) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$14, token_var_$8);
                                                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(assertion));
                                                                if (NIL != valid_$9) {
                                                                    expanded = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                    if (NIL != string_utilities.starts_with(uri, expanded)) {
                                                                        abbreviated = cconcatenate(prefix, new SubLObject[]{ $str37$_, string_utilities.pre_remove(uri, expanded, UNPROVIDED) });
                                                                    }
                                                                }
                                                                done_var_$7 = makeBoolean(NIL == valid_$9);
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator_$14) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$14);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var_$6 = makeBoolean(NIL == valid_$8);
                                                } 
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list35);
                                        }
                                    }
                                    done_var_$5 = makeBoolean(NIL == valid_$7);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
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
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$4, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL != abbreviated ? abbreviated : uri;
    }

    public static SubLObject generate_external_term_from_current_inference_answer(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject external_term = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        if ((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread)))) {
            thread.resetMultipleValues();
            final SubLObject description = generate_external_term_from_current_inference_answer_internal(external_term);
            final SubLObject pred = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (description.isString()) {
                pph_phrase.pph_phrase_set_string(phrase, description);
                pph_phrase.pph_phrase_set_agr_pred(phrase, pred, UNPROVIDED);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                SubLObject cdolist_list_var = supports;
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    pph_phrase.pph_phrase_add_justification(phrase, support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            }
        }
        return phrase;
    }

    public static SubLObject pph_sksi_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread)) ? inference_answer_sksi_supports(pph_vars.$pph_inference_answer$.getDynamicValue(thread)) : NIL;
    }

    public static SubLObject inference_answer_sksi_supports_internal(final SubLObject inference_answer) {
        SubLObject sksi_supports = NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = NIL;
        justification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20 = inference_datastructures_inference.inference_answer_justification_supports(justification);
            SubLObject support = NIL;
            support = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                if (NIL != sksi_infrastructure_utilities.sksi_support_p(support)) {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, sksi_supports, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        sksi_supports = cons(item_var, sksi_supports);
                    }
                }
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                support = cdolist_list_var_$20.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            justification = cdolist_list_var.first();
        } 
        return sksi_supports;
    }

    public static SubLObject inference_answer_sksi_supports(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_answer_sksi_supports_internal(inference_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_ANSWER_SKSI_SUPPORTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_ANSWER_SKSI_SUPPORTS, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_ANSWER_SKSI_SUPPORTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, inference_answer, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_answer_sksi_supports_internal(inference_answer)));
            memoization_state.caching_state_put(caching_state, inference_answer, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject external_term_types(final SubLObject external_term) {
        return Sort.sort(union(external_term_types_from_sksi_supports(external_term), external_term_types_from_isa_constraints(external_term), symbol_function(EQUAL), UNPROVIDED), $sym41$PPH_GENERALITY_ESTIMATE_, UNPROVIDED);
    }

    public static SubLObject valid_external_term_typeP(final SubLObject v_object) {
        return makeBoolean((!pph_utilities.pph_core_term(v_object).eql($$Thing)) && (NIL != pph_utilities.pph_valid_var_typeP(v_object)));
    }

    public static SubLObject external_term_types_from_sksi_supports(final SubLObject external_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
        final SubLObject mt = pph_proof.pph_get_inference_mt(inference);
        final SubLObject var = $sym43$_X;
        SubLObject cdolist_list_var = pph_sksi_supports();
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$21 = pph_variable_handling.pph_variable_isa_constraints(var, cycl_utilities.expression_subst(var, external_term, arguments.support_sentence(support), symbol_function(EQUAL), UNPROVIDED), mt, T, T, $sym44$VALID_EXTERNAL_TERM_TYPE_);
            SubLObject type = NIL;
            type = cdolist_list_var_$21.first();
            while (NIL != cdolist_list_var_$21) {
                final SubLObject item_var = type;
                if (NIL == member(item_var, types, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    types = cons(item_var, types);
                }
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                type = cdolist_list_var_$21.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return types;
    }

    public static SubLObject external_term_types_from_isa_constraints(final SubLObject external_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        if (NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread))) {
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
            final SubLObject var = $sym43$_X;
            final SubLObject proven_sentence = pph_utilities.pph_proven_sentence_from_inference_answer();
            final SubLObject sentence = cycl_utilities.expression_subst(var, external_term, proven_sentence, symbol_function(EQUAL), UNPROVIDED);
            final SubLObject mt = pph_proof.pph_get_inference_mt(inference);
            SubLObject cdolist_list_var = inference_kernel.inference_answer_el_bindings(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
            SubLObject binding = NIL;
            binding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (external_term.equal(bindings.variable_binding_value(binding))) {
                    SubLObject cdolist_list_var_$22 = pph_variable_handling.pph_variable_isa_constraints(var, sentence, mt, T, T, $sym44$VALID_EXTERNAL_TERM_TYPE_);
                    SubLObject type = NIL;
                    type = cdolist_list_var_$22.first();
                    while (NIL != cdolist_list_var_$22) {
                        final SubLObject item_var = type;
                        if (NIL == member(item_var, types, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            types = cons(item_var, types);
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        type = cdolist_list_var_$22.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding = cdolist_list_var.first();
            } 
        }
        return types;
    }

    public static SubLObject paraphrase_fn_for_external_term(final SubLObject external_term) {
        SubLObject fn;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject pattern;
        SubLObject this_fn;
        for (fn = NIL, rest = NIL, rest = $paraphrase_fns_for_external_terms$.getGlobalValue(); (NIL == fn) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            pattern = NIL;
            this_fn = NIL;
            destructuring_bind_must_consp(current, datum, $list46);
            pattern = current.first();
            current = this_fn = current.rest();
            if (NIL != formula_pattern_match.formula_matches_pattern(external_term, pattern)) {
                fn = this_fn;
            }
        }
        return fn;
    }

    public static SubLObject generate_external_term_from_current_inference_answer_internal(final SubLObject external_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fn = paraphrase_fn_for_external_term(external_term);
        SubLObject description = NIL;
        SubLObject head_pred = NIL;
        SubLObject supports = NIL;
        if (NIL != fboundp(fn)) {
            thread.resetMultipleValues();
            final SubLObject description_$23 = funcall(fn, external_term);
            final SubLObject head_pred_$24 = thread.secondMultipleValue();
            final SubLObject supports_$25 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            description = description_$23;
            head_pred = head_pred_$24;
            supports = supports_$25;
        }
        return values(description, head_pred, supports);
    }

    public static SubLObject fpred_value_from_pph_sksi_supports(final SubLObject v_term, final SubLObject pred, SubLObject sksi_supports, SubLObject index) {
        if (sksi_supports == UNPROVIDED) {
            sksi_supports = pph_sksi_supports();
        }
        if (index == UNPROVIDED) {
            index = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject my_value = NIL;
        final SubLObject pattern = (index.eql(ONE_INTEGER)) ? listS(pred, v_term, $list47) : list(pred, $list48, v_term);
        if (NIL == my_value) {
            SubLObject csome_list_var = sksi_supports;
            SubLObject support = NIL;
            support = csome_list_var.first();
            while ((NIL == my_value) && (NIL != csome_list_var)) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), pattern);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject value = my_value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            } 
        }
        return my_value;
    }

    public static SubLObject pred_values_from_pph_sksi_supports(final SubLObject v_term, final SubLObject pred, SubLObject sksi_supports, SubLObject index) {
        if (sksi_supports == UNPROVIDED) {
            sksi_supports = pph_sksi_supports();
        }
        if (index == UNPROVIDED) {
            index = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject my_values = NIL;
        final SubLObject pattern = (index.eql(ONE_INTEGER)) ? listS(pred, v_term, $list47) : list(pred, $list48, v_term);
        SubLObject cdolist_list_var = sksi_supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject item_var;
                final SubLObject value = item_var = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                if (NIL == member(item_var, my_values, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    my_values = cons(item_var, my_values);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return my_values;
    }

    public static SubLObject generate_bnode_from_current_inference_answer(final SubLObject bnode) {
        final SubLObject sksi_supports = pph_sksi_supports();
        final SubLObject bnode_is_patientP = bnode_is_patientP(bnode, sksi_supports);
        final SubLObject head_pred = $$nonPlural_Generic;
        SubLObject description = (NIL != bnode_is_patientP) ? pph_main.generate_string_from_phrase_naut(pph_utilities.pph_np_cycl_for_term_type($$MedicalPatient, $DEFINITE, head_pred), UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject supports = NIL;
        if (NIL == description) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = external_term_types(bnode), type = NIL, type = csome_list_var.first(); (NIL == description) && (NIL != csome_list_var); description = pph_main.generate_string_from_phrase_naut(pph_utilities.pph_np_cycl_for_term_type(type, $DEFINITE, head_pred), UNPROVIDED, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , type = csome_list_var.first()) {
            }
        }
        if (NIL != description) {
            final SubLObject patient_id = bnode_patient_id(bnode, sksi_supports);
            if (NIL != patient_id) {
                if (NIL != bnode_is_patientP) {
                    description = cconcatenate(description, new SubLObject[]{ $$$_with_ID_, patient_id });
                } else {
                    description = cconcatenate(description, new SubLObject[]{ $$$_of_the_patient_with_ID_, patient_id });
                }
            }
            if (NIL == bnode_is_patientP) {
                final SubLObject date = bnode_date(bnode, sksi_supports);
                SubLObject connector = NIL;
                if (NIL != date) {
                    if (NIL != el_formula_with_operator_p(date, $$SecondFn)) {
                        connector = $$$_starting_at_;
                    } else
                        if (NIL != el_formula_with_operator_p(date, $$DayFn)) {
                            connector = $$$_on_;
                        } else {
                            connector = $$$_;
                        }

                    description = cconcatenate(description, new SubLObject[]{ connector, pph_main.generate_text_wXsentential_force(date, $NONE, $ANY, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) });
                }
            }
        }
        return values(description, head_pred, supports);
    }

    public static SubLObject bnode_date(final SubLObject bnode, final SubLObject sksi_supports) {
        if (NIL == bnode_isaP(bnode, $$Situation)) {
            return NIL;
        }
        final SubLObject my_max_date = bnode_max_date_of_event_bnode(bnode, sksi_supports);
        final SubLObject max_date = (NIL != my_max_date) ? my_max_date : bnode_max_date_of_event_bnode(bnode_parent_bnode(bnode, sksi_supports), sksi_supports);
        final SubLObject my_min_date = bnode_min_date_of_event_bnode(bnode, sksi_supports);
        final SubLObject min_date = (NIL != my_min_date) ? my_min_date : bnode_min_date_of_event_bnode(bnode_parent_bnode(bnode, sksi_supports), sksi_supports);
        if (NIL == max_date) {
            return min_date;
        }
        if (NIL == min_date) {
            return max_date;
        }
        if (min_date.equal(max_date)) {
            return min_date;
        }
        if ((NIL != date_utilities.date_p(min_date)) && (NIL != date_utilities.date_p(max_date))) {
            return make_binary_formula($$TimeIntervalInclusiveFn, min_date, max_date);
        }
        return NIL;
    }

    public static SubLObject bnode_isaP(final SubLObject bnode, final SubLObject collection) {
        return subl_promotions.memberP(collection, external_term_types(bnode), $sym64$PPH_SPEC_, UNPROVIDED);
    }

    public static SubLObject bnode_max_date_of_event_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candi_dates = NIL;
        SubLObject cdolist_list_var = pred_values_from_pph_sksi_supports(bnode, $const68$time_intervalContains, sksi_supports, TWO_INTEGER);
        SubLObject container = NIL;
        container = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$26 = pred_values_from_pph_sksi_supports(container, $$startsNoLaterThan, sksi_supports, ONE_INTEGER);
            SubLObject my_date = NIL;
            my_date = cdolist_list_var_$26.first();
            while (NIL != cdolist_list_var_$26) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(my_date, $list65);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject date = my_date = list_utilities.alist_lookup_without_values(v_bindings, DATE, UNPROVIDED, UNPROVIDED);
                }
                final SubLObject var = my_date;
                if (NIL != var) {
                    candi_dates = cons(var, candi_dates);
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                my_date = cdolist_list_var_$26.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            container = cdolist_list_var.first();
        } 
        if (NIL != find_if(DATE_P, candi_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list_utilities.extremal(list_utilities.delete_if_not(DATE_P, candi_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym70$DATE_, UNPROVIDED);
        }
        return candi_dates.first();
    }

    public static SubLObject bnode_min_date_of_event_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candi_dates = NIL;
        SubLObject cdolist_list_var = pred_values_from_pph_sksi_supports(bnode, $const68$time_intervalContains, sksi_supports, TWO_INTEGER);
        SubLObject container = NIL;
        container = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$27 = pred_values_from_pph_sksi_supports(container, $$startsNoEarlierThan, sksi_supports, ONE_INTEGER);
            SubLObject my_date = NIL;
            my_date = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(my_date, $list71);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject date = my_date = list_utilities.alist_lookup_without_values(v_bindings, DATE, UNPROVIDED, UNPROVIDED);
                }
                final SubLObject var = my_date;
                if (NIL != var) {
                    candi_dates = cons(var, candi_dates);
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                my_date = cdolist_list_var_$27.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            container = cdolist_list_var.first();
        } 
        if (NIL != find_if(DATE_P, candi_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list_utilities.extremal(list_utilities.delete_if_not(DATE_P, candi_dates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym73$DATE_, UNPROVIDED);
        }
        return candi_dates.first();
    }

    public static SubLObject bnode_patient_id(final SubLObject bnode, final SubLObject sksi_supports) {
        final SubLObject patient = bnode_patient_bnode(bnode, sksi_supports);
        return NIL != patient ? bnode_id(patient, sksi_supports) : NIL;
    }

    public static SubLObject bnode_id(final SubLObject bnode, final SubLObject sksi_supports) {
        return fpred_value_from_pph_sksi_supports(bnode, $$cCFCCFID, sksi_supports, UNPROVIDED);
    }

    public static SubLObject bnode_is_patientP(final SubLObject bnode, final SubLObject sksi_supports) {
        return equal(bnode, bnode_patient_bnode(bnode, sksi_supports));
    }

    public static SubLObject bnode_patient_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        SubLObject patient = NIL;
        final SubLObject record = bnode_record_bnode(bnode, sksi_supports);
        if (NIL == patient) {
            SubLObject csome_list_var = bnode_child_bnodes(record, sksi_supports);
            SubLObject sub_node = NIL;
            sub_node = csome_list_var.first();
            while ((NIL == patient) && (NIL != csome_list_var)) {
                if (NIL != subl_promotions.memberP($$MedicalPatient, external_term_types(sub_node), UNPROVIDED, UNPROVIDED)) {
                    patient = sub_node;
                }
                csome_list_var = csome_list_var.rest();
                sub_node = csome_list_var.first();
            } 
        }
        return patient;
    }

    public static SubLObject bnode_parent_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        return fpred_value_from_pph_sksi_supports(bnode, $$cCF_contains, sksi_supports, TWO_INTEGER);
    }

    public static SubLObject bnode_child_bnodes(final SubLObject bnode, final SubLObject sksi_supports) {
        return pred_values_from_pph_sksi_supports(bnode, $$cCF_contains, sksi_supports, UNPROVIDED);
    }

    public static SubLObject bnode_record_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        SubLObject ans;
        for (ans = bnode; (NIL != ans) && (NIL == record_bnode_p(ans)); ans = bnode_parent_bnode(ans, sksi_supports)) {
        }
        return ans;
    }

    public static SubLObject record_bnode_p(final SubLObject v_object) {
        return makeBoolean((NIL != pph_types.ccf_bnode_p(v_object)) && CHAR_less.eql(string_utilities.first_char(cycl_utilities.nat_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject declare_pph_sksi_file() {
        declareFunction(me, "generate_sksi", "GENERATE-SKSI", 1, 0, false);
        declareFunction(me, "generate_sksi_memoized_internal", "GENERATE-SKSI-MEMOIZED-INTERNAL", 1, 2, false);
        declareFunction(me, "generate_sksi_memoized", "GENERATE-SKSI-MEMOIZED", 1, 2, false);
        declareFunction(me, "skip_generate_sksi_for_nautP", "SKIP-GENERATE-SKSI-FOR-NAUT?", 1, 0, false);
        declareFunction(me, "pph_sksi_name_string_preds", "PPH-SKSI-NAME-STRING-PREDS", 0, 0, false);
        declareFunction(me, "pph_name_and_pred_from_sksi_query_results", "PPH-NAME-AND-PRED-FROM-SKSI-QUERY-RESULTS", 4, 0, false);
        declareFunction(me, "pph_preferred_sksi_lexificationP", "PPH-PREFERRED-SKSI-LEXIFICATION?", 3, 0, false);
        declareFunction(me, "pph_ideal_sksi_name_pred_p", "PPH-IDEAL-SKSI-NAME-PRED-P", 1, 0, false);
        declareFunction(me, "pph_better_sksi_name_pred_p", "PPH-BETTER-SKSI-NAME-PRED-P", 2, 0, false);
        declareFunction(me, "pph_name_and_pred_from_query_result", "PPH-NAME-AND-PRED-FROM-QUERY-RESULT", 3, 0, false);
        declareFunction(me, "generate_external_term_from_explicit_uri", "GENERATE-EXTERNAL-TERM-FROM-EXPLICIT-URI", 1, 0, false);
        declareFunction(me, "pph_uri_stringP", "PPH-URI-STRING?", 1, 0, false);
        declareFunction(me, "pph_display_string_for_uri", "PPH-DISPLAY-STRING-FOR-URI", 1, 0, false);
        declareFunction(me, "pph_maybe_abbreviate_uri", "PPH-MAYBE-ABBREVIATE-URI", 1, 0, false);
        declareFunction(me, "generate_external_term_from_current_inference_answer", "GENERATE-EXTERNAL-TERM-FROM-CURRENT-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(me, "pph_sksi_supports", "PPH-SKSI-SUPPORTS", 0, 0, false);
        declareFunction(me, "inference_answer_sksi_supports_internal", "INFERENCE-ANSWER-SKSI-SUPPORTS-INTERNAL", 1, 0, false);
        declareFunction(me, "inference_answer_sksi_supports", "INFERENCE-ANSWER-SKSI-SUPPORTS", 1, 0, false);
        declareFunction(me, "external_term_types", "EXTERNAL-TERM-TYPES", 1, 0, false);
        declareFunction(me, "valid_external_term_typeP", "VALID-EXTERNAL-TERM-TYPE?", 1, 0, false);
        declareFunction(me, "external_term_types_from_sksi_supports", "EXTERNAL-TERM-TYPES-FROM-SKSI-SUPPORTS", 1, 0, false);
        declareFunction(me, "external_term_types_from_isa_constraints", "EXTERNAL-TERM-TYPES-FROM-ISA-CONSTRAINTS", 1, 0, false);
        declareFunction(me, "paraphrase_fn_for_external_term", "PARAPHRASE-FN-FOR-EXTERNAL-TERM", 1, 0, false);
        declareFunction(me, "generate_external_term_from_current_inference_answer_internal", "GENERATE-EXTERNAL-TERM-FROM-CURRENT-INFERENCE-ANSWER-INTERNAL", 1, 0, false);
        declareFunction(me, "fpred_value_from_pph_sksi_supports", "FPRED-VALUE-FROM-PPH-SKSI-SUPPORTS", 2, 2, false);
        declareFunction(me, "pred_values_from_pph_sksi_supports", "PRED-VALUES-FROM-PPH-SKSI-SUPPORTS", 2, 2, false);
        declareFunction(me, "generate_bnode_from_current_inference_answer", "GENERATE-BNODE-FROM-CURRENT-INFERENCE-ANSWER", 1, 0, false);
        declareFunction(me, "bnode_date", "BNODE-DATE", 2, 0, false);
        declareFunction(me, "bnode_isaP", "BNODE-ISA?", 2, 0, false);
        declareFunction(me, "bnode_max_date_of_event_bnode", "BNODE-MAX-DATE-OF-EVENT-BNODE", 2, 0, false);
        declareFunction(me, "bnode_min_date_of_event_bnode", "BNODE-MIN-DATE-OF-EVENT-BNODE", 2, 0, false);
        declareFunction(me, "bnode_patient_id", "BNODE-PATIENT-ID", 2, 0, false);
        declareFunction(me, "bnode_id", "BNODE-ID", 2, 0, false);
        declareFunction(me, "bnode_is_patientP", "BNODE-IS-PATIENT?", 2, 0, false);
        declareFunction(me, "bnode_patient_bnode", "BNODE-PATIENT-BNODE", 2, 0, false);
        declareFunction(me, "bnode_parent_bnode", "BNODE-PARENT-BNODE", 2, 0, false);
        declareFunction(me, "bnode_child_bnodes", "BNODE-CHILD-BNODES", 2, 0, false);
        declareFunction(me, "bnode_record_bnode", "BNODE-RECORD-BNODE", 2, 0, false);
        declareFunction(me, "record_bnode_p", "RECORD-BNODE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_sksi_file() {
        defparameter("*INSIDE-GENERATE-SKSI?*", NIL);
        deflexical("*PPH-SKSI-NAME-STRING-PREDS*", $list17);
        deflexical("*GENERATE-SKSI-SKIP-PATTERNS*", $list18);
        deflexical("*PARAPHRASE-FNS-FOR-EXTERNAL-TERMS*", $list45);
        return NIL;
    }

    public static SubLObject setup_pph_sksi_file() {
        pph_types.pph_register_method(GENERATE_SKSI, $SKSI_SUPPORTED_EXTERNAL_TERM, $DECENT);
        memoization_state.note_memoized_function(GENERATE_SKSI_MEMOIZED);
        pph_types.pph_register_method(GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI, $SKSI_SUPPORTED_EXTERNAL_TERM, $FALLBACK);
        note_funcall_helper_function(GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI);
        pph_types.pph_register_method(GENERATE_EXTERNAL_TERM_FROM_CURRENT_INFERENCE_ANSWER, $SKSI_SUPPORTED_EXTERNAL_TERM, $BEST);
        memoization_state.note_memoized_function(INFERENCE_ANSWER_SKSI_SUPPORTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_sksi_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_sksi_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_sksi_file();
    }

    static {

















































































    }
}

/**
 * Total time: 288 ms
 */
