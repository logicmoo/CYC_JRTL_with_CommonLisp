package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_sksi extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_sksi";
    public static final String myFingerPrint = "e0b69af9ef55652721a6202f0a847079d4f1374dbeae1ad0191f9e11bdb2107f";
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 915L)
    private static SubLSymbol $inside_generate_sksiP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 3266L)
    private static SubLSymbol $pph_sksi_name_string_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 3569L)
    private static SubLSymbol $generate_sksi_skip_patterns$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 11000L)
    private static SubLSymbol $paraphrase_fns_for_external_terms$;
    private static final SubLSymbol $sym0$GENERATE_SKSI;
    private static final SubLSymbol $kw1$SKSI_SUPPORTED_EXTERNAL_TERM;
    private static final SubLSymbol $kw2$DECENT;
    private static final SubLSymbol $sym3$GENERATE_SKSI_MEMOIZED;
    private static final SubLString $str4$Recursive_call_to_GENERATE_SKSI_;
    private static final SubLObject $const5$InferencePSC;
    private static final SubLSymbol $kw6$ALLOWED_MODULES;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$RETURN;
    private static final SubLSymbol $kw9$BINDINGS_AND_SUPPORTS;
    private static final SubLSymbol $sym10$_NAME;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$MAX_TRANSFORMATION_DEPTH;
    private static final SubLList $list13;
    private static final SubLObject $const14$termStrings;
    private static final SubLSymbol $kw15$REWRITE_ALLOWED_;
    private static final SubLSymbol $sym16$_EXIT;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLObject $const19$preferredNameString;
    private static final SubLObject $const20$genStringAssertion;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$THIS_PRED;
    private static final SubLSymbol $sym25$GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI;
    private static final SubLSymbol $kw26$FALLBACK;
    private static final SubLSymbol $sym27$PPH_URI_STRING_;
    private static final SubLString $str28$_;
    private static final SubLString $str29$_;
    private static final SubLSymbol $sym30$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const31$EverythingPSC;
    private static final SubLObject $const32$standardPrefixForURI;
    private static final SubLSymbol $kw33$GAF;
    private static final SubLSymbol $kw34$TRUE;
    private static final SubLList $list35;
    private static final SubLObject $const36$uriString;
    private static final SubLString $str37$_;
    private static final SubLSymbol $sym38$GENERATE_EXTERNAL_TERM_FROM_CURRENT_INFERENCE_ANSWER;
    private static final SubLSymbol $kw39$BEST;
    private static final SubLSymbol $sym40$INFERENCE_ANSWER_SKSI_SUPPORTS;
    private static final SubLSymbol $sym41$PPH_GENERALITY_ESTIMATE_;
    private static final SubLObject $const42$Thing;
    private static final SubLSymbol $sym43$_X;
    private static final SubLSymbol $sym44$VALID_EXTERNAL_TERM_TYPE_;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$VALUE;
    private static final SubLObject $const50$nonPlural_Generic;
    private static final SubLObject $const51$MedicalPatient;
    private static final SubLSymbol $kw52$DEFINITE;
    private static final SubLString $str53$_with_ID_;
    private static final SubLString $str54$_of_the_patient_with_ID_;
    private static final SubLObject $const55$SecondFn;
    private static final SubLString $str56$_starting_at_;
    private static final SubLObject $const57$DayFn;
    private static final SubLString $str58$_on_;
    private static final SubLString $str59$_;
    private static final SubLSymbol $kw60$NONE;
    private static final SubLSymbol $kw61$ANY;
    private static final SubLObject $const62$Situation;
    private static final SubLObject $const63$TimeIntervalInclusiveFn;
    private static final SubLSymbol $sym64$PPH_SPEC_;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$DATE;
    private static final SubLObject $const67$startsNoLaterThan;
    private static final SubLObject $const68$time_intervalContains;
    private static final SubLSymbol $sym69$DATE_P;
    private static final SubLSymbol $sym70$DATE_;
    private static final SubLList $list71;
    private static final SubLObject $const72$startsNoEarlierThan;
    private static final SubLSymbol $sym73$DATE_;
    private static final SubLObject $const74$cCFCCFID;
    private static final SubLObject $const75$cCF_contains;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 1042L)
    public static SubLObject generate_sksi(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sksi_naut = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_sksi.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject name = generate_sksi_memoized(sksi_naut, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
        final SubLObject pred = thread.secondMultipleValue();
        final SubLObject support = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (name.isString()) {
            pph_phrase.pph_phrase_set_string(phrase, name);
            pph_phrase.pph_phrase_set_agr_pred(phrase, pred, (SubLObject)pph_sksi.UNPROVIDED);
            pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
            if (pph_sksi.NIL != arguments.support_p(support)) {
                pph_phrase.pph_phrase_add_justification(phrase, support);
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 1556L)
    public static SubLObject generate_sksi_memoized_internal(final SubLObject sksi_naut, SubLObject inside_generate_sksiP, SubLObject domain_mt) {
        if (inside_generate_sksiP == pph_sksi.UNPROVIDED) {
            inside_generate_sksiP = pph_sksi.$inside_generate_sksiP$.getDynamicValue();
        }
        if (domain_mt == pph_sksi.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_sksi.$inside_generate_sksiP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_sksi.$inside_generate_sksiP$.bind(inside_generate_sksiP, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            SubLObject name = (SubLObject)pph_sksi.NIL;
            SubLObject pred = (SubLObject)pph_sksi.NIL;
            SubLObject support = (SubLObject)pph_sksi.NIL;
            if (pph_sksi.NIL != pph_sksi.$inside_generate_sksiP$.getDynamicValue(thread)) {
                if (pph_sksi.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_sksi.ONE_INTEGER) && pph_sksi.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn((SubLObject)pph_sksi.$str4$Recursive_call_to_GENERATE_SKSI_);
                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                }
            }
            else if (pph_sksi.NIL == skip_generate_sksi_for_nautP(sksi_naut)) {
                final SubLObject _prev_bind_0_$1 = pph_sksi.$inside_generate_sksiP$.currentBinding(thread);
                try {
                    pph_sksi.$inside_generate_sksiP$.bind((SubLObject)pph_sksi.T, thread);
                    final SubLObject mt = (pph_sksi.NIL != sksi_kb_accessors.sksi_content_mt_p(pph_vars.$pph_domain_mt$.getDynamicValue(thread))) ? pph_vars.$pph_domain_mt$.getDynamicValue(thread) : pph_sksi.$const5$InferencePSC;
                    SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)pph_sksi.$kw6$ALLOWED_MODULES, (SubLObject)pph_sksi.$list7, (SubLObject)pph_sksi.$kw8$RETURN, (SubLObject)pph_sksi.$kw9$BINDINGS_AND_SUPPORTS);
                    final SubLObject name_var = (SubLObject)pph_sksi.$sym10$_NAME;
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
                    for (doneP = (SubLObject)pph_sksi.NIL, rest = (SubLObject)pph_sksi.NIL, rest = pph_sksi_name_string_preds(); pph_sksi.NIL == doneP && pph_sksi.NIL != rest; rest = rest.rest()) {
                        cons = rest.first();
                        datum = (current = cons);
                        name_string_pred = (SubLObject)pph_sksi.NIL;
                        backchains = (SubLObject)pph_sksi.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_sksi.$list11);
                        name_string_pred = current.first();
                        current = (backchains = current.rest());
                        v_properties = conses_high.putf(v_properties, (SubLObject)pph_sksi.$kw12$MAX_TRANSFORMATION_DEPTH, backchains);
                        if (backchains.isPositive()) {
                            v_properties = conses_high.putf(v_properties, (SubLObject)pph_sksi.$kw6$ALLOWED_MODULES, (SubLObject)pph_sksi.$list13);
                        }
                        if (pred.eql(pph_sksi.$const14$termStrings)) {
                            v_properties = conses_high.putf(v_properties, (SubLObject)pph_sksi.$kw15$REWRITE_ALLOWED_, (SubLObject)pph_sksi.T);
                        }
                        query_results = pph_utilities.pph_query((SubLObject)ConsesLow.list(name_string_pred, sksi_naut, name_var), mt, v_properties);
                        if (pph_sksi.NIL != query_results) {
                            thread.resetMultipleValues();
                            this_name = pph_name_and_pred_from_sksi_query_results(query_results, sksi_naut, name_var, name_string_pred);
                            this_pred = thread.secondMultipleValue();
                            this_support = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (this_name.isString()) {
                                name = this_name;
                                pred = this_pred;
                                support = this_support;
                                doneP = (SubLObject)pph_sksi.T;
                            }
                        }
                    }
                }
                finally {
                    pph_sksi.$inside_generate_sksiP$.rebind(_prev_bind_0_$1, thread);
                }
            }
            return Values.values(name, pred, support);
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_sksi.$inside_generate_sksiP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 1556L)
    public static SubLObject generate_sksi_memoized(final SubLObject sksi_naut, SubLObject inside_generate_sksiP, SubLObject domain_mt) {
        if (inside_generate_sksiP == pph_sksi.UNPROVIDED) {
            inside_generate_sksiP = pph_sksi.$inside_generate_sksiP$.getDynamicValue();
        }
        if (domain_mt == pph_sksi.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_sksi.NIL;
        if (pph_sksi.NIL == v_memoization_state) {
            return generate_sksi_memoized_internal(sksi_naut, inside_generate_sksiP, domain_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_sksi.$sym3$GENERATE_SKSI_MEMOIZED, (SubLObject)pph_sksi.UNPROVIDED);
        if (pph_sksi.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_sksi.$sym3$GENERATE_SKSI_MEMOIZED, (SubLObject)pph_sksi.THREE_INTEGER, (SubLObject)pph_sksi.NIL, (SubLObject)pph_sksi.EQ, (SubLObject)pph_sksi.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_sksi.$sym3$GENERATE_SKSI_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sksi_naut, inside_generate_sksiP, domain_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_sksi.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_sksi.NIL;
            collision = cdolist_list_var.first();
            while (pph_sksi.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sksi_naut.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (inside_generate_sksiP.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (pph_sksi.NIL != cached_args && pph_sksi.NIL == cached_args.rest() && domain_mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(generate_sksi_memoized_internal(sksi_naut, inside_generate_sksiP, domain_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sksi_naut, inside_generate_sksiP, domain_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 3775L)
    public static SubLObject skip_generate_sksi_for_nautP(final SubLObject sksi_naut) {
        SubLObject skipP = (SubLObject)pph_sksi.NIL;
        if (pph_sksi.NIL == skipP) {
            SubLObject csome_list_var = pph_sksi.$generate_sksi_skip_patterns$.getGlobalValue();
            SubLObject pattern = (SubLObject)pph_sksi.NIL;
            pattern = csome_list_var.first();
            while (pph_sksi.NIL == skipP && pph_sksi.NIL != csome_list_var) {
                if (pph_sksi.NIL != formula_pattern_match.formula_matches_pattern(sksi_naut, pattern)) {
                    skipP = (SubLObject)pph_sksi.T;
                }
                csome_list_var = csome_list_var.rest();
                pattern = csome_list_var.first();
            }
        }
        return skipP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 4045L)
    public static SubLObject pph_sksi_name_string_preds() {
        return pph_sksi.$pph_sksi_name_string_preds$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 4130L)
    public static SubLObject pph_name_and_pred_from_sksi_query_results(final SubLObject query_results, final SubLObject sksi_naut, final SubLObject name_var, final SubLObject proven_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = (SubLObject)pph_sksi.NIL;
        SubLObject pred = (SubLObject)pph_sksi.NIL;
        SubLObject cdolist_list_var = query_results;
        SubLObject result = (SubLObject)pph_sksi.NIL;
        result = cdolist_list_var.first();
        while (pph_sksi.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject this_name = pph_name_and_pred_from_query_result(result, name_var, proven_pred);
            final SubLObject this_pred = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (this_name.isString()) {
                if (pph_sksi.NIL != pph_preferred_sksi_lexificationP(this_pred, sksi_naut, this_name)) {
                    return Values.values(this_name, this_pred);
                }
                if (pph_sksi.NIL != pph_ideal_sksi_name_pred_p(this_pred)) {
                    return Values.values(this_name, this_pred);
                }
                if (pph_sksi.NIL != pph_better_sksi_name_pred_p(this_pred, pred)) {
                    name = this_name;
                    pred = this_pred;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        }
        return Values.values(name, pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 4907L)
    public static SubLObject pph_preferred_sksi_lexificationP(final SubLObject this_pred, final SubLObject sksi_naut, final SubLObject this_name) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sksi.NIL != pph_utilities.pph_genl_predicateP(this_pred, pph_sksi.$const19$preferredNameString, (SubLObject)pph_sksi.UNPROVIDED) || pph_sksi.NIL != cyc_kernel.closed_query_success_result_p(pph_utilities.pph_query((SubLObject)ConsesLow.list(pph_sksi.$const20$genStringAssertion, sksi_naut, (SubLObject)ConsesLow.list(this_pred, sksi_naut, this_name)), pph_sksi.$const5$InferencePSC, (SubLObject)pph_sksi.$list21)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 5280L)
    public static SubLObject pph_ideal_sksi_name_pred_p(final SubLObject this_pred) {
        return Equality.eq(this_pred, pph_sksi.$const19$preferredNameString);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 5382L)
    public static SubLObject pph_better_sksi_name_pred_p(final SubLObject this_pred, final SubLObject other_pred) {
        if (pph_sksi.NIL != pph_utilities.pph_genl_predicateP(this_pred, other_pred, (SubLObject)pph_sksi.UNPROVIDED)) {
            return (SubLObject)pph_sksi.T;
        }
        if (pph_sksi.NIL != pph_utilities.pph_name_string_predP(this_pred) && pph_sksi.NIL == pph_utilities.pph_name_string_predP(other_pred)) {
            return (SubLObject)pph_sksi.T;
        }
        return (SubLObject)pph_sksi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 5641L)
    public static SubLObject pph_name_and_pred_from_query_result(final SubLObject result, final SubLObject name_var, final SubLObject proven_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = (SubLObject)pph_sksi.NIL;
        SubLObject supports = (SubLObject)pph_sksi.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(result, result, (SubLObject)pph_sksi.$list22);
        v_bindings = result.first();
        SubLObject current = result.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, result, (SubLObject)pph_sksi.$list22);
        supports = current.first();
        current = current.rest();
        if (pph_sksi.NIL == current) {
            final SubLObject name = bindings.variable_lookup(name_var, v_bindings);
            SubLObject pred = (SubLObject)pph_sksi.NIL;
            if (pph_sksi.NIL == pred) {
                SubLObject csome_list_var = supports;
                SubLObject support = (SubLObject)pph_sksi.NIL;
                support = csome_list_var.first();
                while (pph_sksi.NIL == pred && pph_sksi.NIL != csome_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject successP = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), (SubLObject)pph_sksi.$list23);
                    final SubLObject v_bindings_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (pph_sksi.NIL != successP) {
                        pred = list_utilities.alist_lookup(v_bindings_$2, (SubLObject)pph_sksi.$sym24$THIS_PRED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
                    }
                    csome_list_var = csome_list_var.rest();
                    support = csome_list_var.first();
                }
            }
            if (pph_sksi.NIL == forts.fort_p(pred)) {
                pred = proven_pred;
            }
            return Values.values(name, pred);
        }
        cdestructuring_bind.cdestructuring_bind_error(result, (SubLObject)pph_sksi.$list22);
        return (SubLObject)pph_sksi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 6344L)
    public static SubLObject generate_external_term_from_explicit_uri(final SubLObject phrase) {
        final SubLObject external_term = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_sksi.UNPROVIDED);
        final SubLObject uri = cycl_utilities.expression_find_if((SubLObject)pph_sksi.$sym27$PPH_URI_STRING_, cycl_utilities.formula_args(external_term, (SubLObject)pph_sksi.UNPROVIDED), (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
        if (pph_sksi.NIL != uri) {
            pph_phrase.pph_phrase_set_string(phrase, pph_display_string_for_uri(uri));
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 6729L)
    public static SubLObject pph_uri_stringP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obj.isString() && pph_sksi.NIL != list_utilities.lengthG(obj, (SubLObject)pph_sksi.TWO_INTEGER, (SubLObject)pph_sksi.UNPROVIDED) && (pph_sksi.NIL != web_utilities.uri_p(obj, (SubLObject)pph_sksi.UNPROVIDED) || (string_utilities.first_char(obj).eql((SubLObject)Characters.CHAR_less) && string_utilities.last_char(obj).eql((SubLObject)Characters.CHAR_greater) && pph_sksi.NIL != web_utilities.uri_p(string_utilities.substring(obj, (SubLObject)pph_sksi.ONE_INTEGER, Numbers.subtract(Sequences.length(obj), (SubLObject)pph_sksi.ONE_INTEGER)), (SubLObject)pph_sksi.UNPROVIDED))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 6959L)
    public static SubLObject pph_display_string_for_uri(final SubLObject uri) {
        final SubLObject full_uri = string_utilities.post_remove(string_utilities.pre_remove(uri, (SubLObject)pph_sksi.$str28$_, (SubLObject)pph_sksi.UNPROVIDED), (SubLObject)pph_sksi.$str29$_, (SubLObject)pph_sksi.UNPROVIDED);
        return pph_maybe_abbreviate_uri(full_uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 7117L)
    public static SubLObject pph_maybe_abbreviate_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abbreviated = (SubLObject)pph_sksi.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)pph_sksi.$sym30$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(pph_sksi.$const31$EverythingPSC, thread);
            final SubLObject pred_var = pph_sksi.$const32$standardPrefixForURI;
            if (pph_sksi.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)pph_sksi.NIL;
                final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$4 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)pph_sksi.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)pph_sksi.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)pph_sksi.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)pph_sksi.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((pph_sksi.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : pph_sksi.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)pph_sksi.NIL;
                    final SubLObject token_var = (SubLObject)pph_sksi.NIL;
                    while (pph_sksi.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (pph_sksi.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)pph_sksi.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)pph_sksi.$kw33$GAF, (SubLObject)pph_sksi.$kw34$TRUE, (SubLObject)pph_sksi.NIL);
                                SubLObject done_var_$5 = (SubLObject)pph_sksi.NIL;
                                final SubLObject token_var_$6 = (SubLObject)pph_sksi.NIL;
                                while (pph_sksi.NIL == done_var_$5) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
                                    final SubLObject valid_$7 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$6.eql(gaf));
                                    if (pph_sksi.NIL != valid_$7) {
                                        SubLObject current;
                                        final SubLObject datum = current = assertions_high.gaf_args(gaf);
                                        SubLObject prefix = (SubLObject)pph_sksi.NIL;
                                        SubLObject reified_uri = (SubLObject)pph_sksi.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_sksi.$list35);
                                        prefix = current.first();
                                        current = current.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_sksi.$list35);
                                        reified_uri = current.first();
                                        current = current.rest();
                                        if (pph_sksi.NIL == current) {
                                            SubLObject expanded = (SubLObject)pph_sksi.NIL;
                                            final SubLObject pred_var_$8 = pph_sksi.$const36$uriString;
                                            if (pph_sksi.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(reified_uri, (SubLObject)pph_sksi.ONE_INTEGER, pred_var_$8)) {
                                                final SubLObject iterator_var_$9 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(reified_uri, (SubLObject)pph_sksi.ONE_INTEGER, pred_var_$8);
                                                SubLObject done_var_$6 = (SubLObject)pph_sksi.NIL;
                                                final SubLObject token_var_$7 = (SubLObject)pph_sksi.NIL;
                                                while (pph_sksi.NIL == done_var_$6) {
                                                    final SubLObject final_index_spec_$12 = iteration.iteration_next_without_values_macro_helper(iterator_var_$9, token_var_$7);
                                                    final SubLObject valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(final_index_spec_$12));
                                                    if (pph_sksi.NIL != valid_$8) {
                                                        SubLObject final_index_iterator_$14 = (SubLObject)pph_sksi.NIL;
                                                        try {
                                                            final_index_iterator_$14 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$12, (SubLObject)pph_sksi.$kw33$GAF, (SubLObject)pph_sksi.$kw34$TRUE, (SubLObject)pph_sksi.NIL);
                                                            SubLObject done_var_$7 = (SubLObject)pph_sksi.NIL;
                                                            final SubLObject token_var_$8 = (SubLObject)pph_sksi.NIL;
                                                            while (pph_sksi.NIL == done_var_$7) {
                                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$14, token_var_$8);
                                                                final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(assertion));
                                                                if (pph_sksi.NIL != valid_$9) {
                                                                    expanded = assertions_high.gaf_arg(assertion, (SubLObject)pph_sksi.TWO_INTEGER);
                                                                    if (pph_sksi.NIL != string_utilities.starts_with(uri, expanded)) {
                                                                        abbreviated = Sequences.cconcatenate(prefix, new SubLObject[] { pph_sksi.$str37$_, string_utilities.pre_remove(uri, expanded, (SubLObject)pph_sksi.UNPROVIDED) });
                                                                    }
                                                                }
                                                                done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(pph_sksi.NIL == valid_$9);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_sksi.T, thread);
                                                                final SubLObject _values = Values.getValuesAsVector();
                                                                if (pph_sksi.NIL != final_index_iterator_$14) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$14);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(pph_sksi.NIL == valid_$8);
                                                }
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_sksi.$list35);
                                        }
                                    }
                                    done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(pph_sksi.NIL == valid_$7);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_sksi.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (pph_sksi.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(pph_sksi.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$4, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (pph_sksi.NIL != abbreviated) ? abbreviated : uri;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 7773L)
    public static SubLObject generate_external_term_from_current_inference_answer(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject external_term = pph_phrase.pph_phrase_cycl(phrase, (SubLObject)pph_sksi.UNPROVIDED);
        if (pph_sksi.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_sksi.UNPROVIDED) && pph_sksi.NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread))) {
            thread.resetMultipleValues();
            final SubLObject description = generate_external_term_from_current_inference_answer_internal(external_term);
            final SubLObject pred = thread.secondMultipleValue();
            final SubLObject supports = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (description.isString()) {
                pph_phrase.pph_phrase_set_string(phrase, description);
                pph_phrase.pph_phrase_set_agr_pred(phrase, pred, (SubLObject)pph_sksi.UNPROVIDED);
                pph_phrase.pph_phrase_maybe_add_anchor_tags(phrase);
                SubLObject cdolist_list_var = supports;
                SubLObject support = (SubLObject)pph_sksi.NIL;
                support = cdolist_list_var.first();
                while (pph_sksi.NIL != cdolist_list_var) {
                    pph_phrase.pph_phrase_add_justification(phrase, support);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
        }
        return phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 8468L)
    public static SubLObject pph_sksi_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((pph_sksi.NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread))) ? inference_answer_sksi_supports(pph_vars.$pph_inference_answer$.getDynamicValue(thread)) : pph_sksi.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 8631L)
    public static SubLObject inference_answer_sksi_supports_internal(final SubLObject inference_answer) {
        SubLObject sksi_supports = (SubLObject)pph_sksi.NIL;
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
        SubLObject justification = (SubLObject)pph_sksi.NIL;
        justification = cdolist_list_var.first();
        while (pph_sksi.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20 = inference_datastructures_inference.inference_answer_justification_supports(justification);
            SubLObject support = (SubLObject)pph_sksi.NIL;
            support = cdolist_list_var_$20.first();
            while (pph_sksi.NIL != cdolist_list_var_$20) {
                if (pph_sksi.NIL != sksi_infrastructure_utilities.sksi_support_p(support)) {
                    final SubLObject item_var = support;
                    if (pph_sksi.NIL == conses_high.member(item_var, sksi_supports, Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), Symbols.symbol_function((SubLObject)pph_sksi.IDENTITY))) {
                        sksi_supports = (SubLObject)ConsesLow.cons(item_var, sksi_supports);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 8631L)
    public static SubLObject inference_answer_sksi_supports(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_sksi.NIL;
        if (pph_sksi.NIL == v_memoization_state) {
            return inference_answer_sksi_supports_internal(inference_answer);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_sksi.$sym40$INFERENCE_ANSWER_SKSI_SUPPORTS, (SubLObject)pph_sksi.UNPROVIDED);
        if (pph_sksi.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_sksi.$sym40$INFERENCE_ANSWER_SKSI_SUPPORTS, (SubLObject)pph_sksi.ONE_INTEGER, (SubLObject)pph_sksi.NIL, (SubLObject)pph_sksi.EQ, (SubLObject)pph_sksi.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_sksi.$sym40$INFERENCE_ANSWER_SKSI_SUPPORTS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, inference_answer, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(inference_answer_sksi_supports_internal(inference_answer)));
            memoization_state.caching_state_put(caching_state, inference_answer, results, (SubLObject)pph_sksi.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 9034L)
    public static SubLObject external_term_types(final SubLObject external_term) {
        return Sort.sort(conses_high.union(external_term_types_from_sksi_supports(external_term), external_term_types_from_isa_constraints(external_term), Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), (SubLObject)pph_sksi.UNPROVIDED), (SubLObject)pph_sksi.$sym41$PPH_GENERALITY_ESTIMATE_, (SubLObject)pph_sksi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 9398L)
    public static SubLObject valid_external_term_typeP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!pph_utilities.pph_core_term(v_object).eql(pph_sksi.$const42$Thing) && pph_sksi.NIL != pph_utilities.pph_valid_var_typeP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 9545L)
    public static SubLObject external_term_types_from_sksi_supports(final SubLObject external_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)pph_sksi.NIL;
        final SubLObject inference = inference_datastructures_inference.inference_answer_inference(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
        final SubLObject mt = pph_proof.pph_get_inference_mt(inference);
        final SubLObject var = (SubLObject)pph_sksi.$sym43$_X;
        SubLObject cdolist_list_var = pph_sksi_supports();
        SubLObject support = (SubLObject)pph_sksi.NIL;
        support = cdolist_list_var.first();
        while (pph_sksi.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$21 = pph_variable_handling.pph_variable_isa_constraints(var, cycl_utilities.expression_subst(var, external_term, arguments.support_sentence(support), Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), (SubLObject)pph_sksi.UNPROVIDED), mt, (SubLObject)pph_sksi.T, (SubLObject)pph_sksi.T, (SubLObject)pph_sksi.$sym44$VALID_EXTERNAL_TERM_TYPE_);
            SubLObject type = (SubLObject)pph_sksi.NIL;
            type = cdolist_list_var_$21.first();
            while (pph_sksi.NIL != cdolist_list_var_$21) {
                final SubLObject item_var = type;
                if (pph_sksi.NIL == conses_high.member(item_var, types, Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), Symbols.symbol_function((SubLObject)pph_sksi.IDENTITY))) {
                    types = (SubLObject)ConsesLow.cons(item_var, types);
                }
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                type = cdolist_list_var_$21.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 10139L)
    public static SubLObject external_term_types_from_isa_constraints(final SubLObject external_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)pph_sksi.NIL;
        if (pph_sksi.NIL != inference_datastructures_inference.valid_inference_answer_p(pph_vars.$pph_inference_answer$.getDynamicValue(thread))) {
            final SubLObject inference = inference_datastructures_inference.inference_answer_inference(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
            final SubLObject var = (SubLObject)pph_sksi.$sym43$_X;
            final SubLObject proven_sentence = pph_utilities.pph_proven_sentence_from_inference_answer();
            final SubLObject sentence = cycl_utilities.expression_subst(var, external_term, proven_sentence, Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), (SubLObject)pph_sksi.UNPROVIDED);
            final SubLObject mt = pph_proof.pph_get_inference_mt(inference);
            SubLObject cdolist_list_var = inference_kernel.inference_answer_el_bindings(pph_vars.$pph_inference_answer$.getDynamicValue(thread));
            SubLObject binding = (SubLObject)pph_sksi.NIL;
            binding = cdolist_list_var.first();
            while (pph_sksi.NIL != cdolist_list_var) {
                if (external_term.equal(bindings.variable_binding_value(binding))) {
                    SubLObject cdolist_list_var_$22 = pph_variable_handling.pph_variable_isa_constraints(var, sentence, mt, (SubLObject)pph_sksi.T, (SubLObject)pph_sksi.T, (SubLObject)pph_sksi.$sym44$VALID_EXTERNAL_TERM_TYPE_);
                    SubLObject type = (SubLObject)pph_sksi.NIL;
                    type = cdolist_list_var_$22.first();
                    while (pph_sksi.NIL != cdolist_list_var_$22) {
                        final SubLObject item_var = type;
                        if (pph_sksi.NIL == conses_high.member(item_var, types, Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), Symbols.symbol_function((SubLObject)pph_sksi.IDENTITY))) {
                            types = (SubLObject)ConsesLow.cons(item_var, types);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 11134L)
    public static SubLObject paraphrase_fn_for_external_term(final SubLObject external_term) {
        SubLObject fn;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject pattern;
        SubLObject this_fn;
        for (fn = (SubLObject)pph_sksi.NIL, rest = (SubLObject)pph_sksi.NIL, rest = pph_sksi.$paraphrase_fns_for_external_terms$.getGlobalValue(); pph_sksi.NIL == fn && pph_sksi.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            pattern = (SubLObject)pph_sksi.NIL;
            this_fn = (SubLObject)pph_sksi.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_sksi.$list46);
            pattern = current.first();
            current = (this_fn = current.rest());
            if (pph_sksi.NIL != formula_pattern_match.formula_matches_pattern(external_term, pattern)) {
                fn = this_fn;
            }
        }
        return fn;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 11393L)
    public static SubLObject generate_external_term_from_current_inference_answer_internal(final SubLObject external_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fn = paraphrase_fn_for_external_term(external_term);
        SubLObject description = (SubLObject)pph_sksi.NIL;
        SubLObject head_pred = (SubLObject)pph_sksi.NIL;
        SubLObject supports = (SubLObject)pph_sksi.NIL;
        if (pph_sksi.NIL != Symbols.fboundp(fn)) {
            thread.resetMultipleValues();
            final SubLObject description_$23 = Functions.funcall(fn, external_term);
            final SubLObject head_pred_$24 = thread.secondMultipleValue();
            final SubLObject supports_$25 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            description = description_$23;
            head_pred = head_pred_$24;
            supports = supports_$25;
        }
        return Values.values(description, head_pred, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 11753L)
    public static SubLObject fpred_value_from_pph_sksi_supports(final SubLObject v_term, final SubLObject pred, SubLObject sksi_supports, SubLObject index) {
        if (sksi_supports == pph_sksi.UNPROVIDED) {
            sksi_supports = pph_sksi_supports();
        }
        if (index == pph_sksi.UNPROVIDED) {
            index = (SubLObject)pph_sksi.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject my_value = (SubLObject)pph_sksi.NIL;
        final SubLObject pattern = (SubLObject)(index.eql((SubLObject)pph_sksi.ONE_INTEGER) ? ConsesLow.listS(pred, v_term, (SubLObject)pph_sksi.$list47) : ConsesLow.list(pred, (SubLObject)pph_sksi.$list48, v_term));
        if (pph_sksi.NIL == my_value) {
            SubLObject csome_list_var = sksi_supports;
            SubLObject support = (SubLObject)pph_sksi.NIL;
            support = csome_list_var.first();
            while (pph_sksi.NIL == my_value && pph_sksi.NIL != csome_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), pattern);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_sksi.NIL != success) {
                    final SubLObject value = my_value = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_sksi.$sym49$VALUE, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                support = csome_list_var.first();
            }
        }
        return my_value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 12205L)
    public static SubLObject pred_values_from_pph_sksi_supports(final SubLObject v_term, final SubLObject pred, SubLObject sksi_supports, SubLObject index) {
        if (sksi_supports == pph_sksi.UNPROVIDED) {
            sksi_supports = pph_sksi_supports();
        }
        if (index == pph_sksi.UNPROVIDED) {
            index = (SubLObject)pph_sksi.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject my_values = (SubLObject)pph_sksi.NIL;
        final SubLObject pattern = (SubLObject)(index.eql((SubLObject)pph_sksi.ONE_INTEGER) ? ConsesLow.listS(pred, v_term, (SubLObject)pph_sksi.$list47) : ConsesLow.list(pred, (SubLObject)pph_sksi.$list48, v_term));
        SubLObject cdolist_list_var = sksi_supports;
        SubLObject support = (SubLObject)pph_sksi.NIL;
        support = cdolist_list_var.first();
        while (pph_sksi.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), pattern);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (pph_sksi.NIL != success) {
                final SubLObject item_var;
                final SubLObject value = item_var = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_sksi.$sym49$VALUE, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
                if (pph_sksi.NIL == conses_high.member(item_var, my_values, Symbols.symbol_function((SubLObject)pph_sksi.EQUAL), Symbols.symbol_function((SubLObject)pph_sksi.IDENTITY))) {
                    my_values = (SubLObject)ConsesLow.cons(item_var, my_values);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        return my_values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 12663L)
    public static SubLObject generate_bnode_from_current_inference_answer(final SubLObject bnode) {
        final SubLObject sksi_supports = pph_sksi_supports();
        final SubLObject bnode_is_patientP = bnode_is_patientP(bnode, sksi_supports);
        final SubLObject head_pred = pph_sksi.$const50$nonPlural_Generic;
        SubLObject description = (SubLObject)((pph_sksi.NIL != bnode_is_patientP) ? pph_main.generate_string_from_phrase_naut(pph_utilities.pph_np_cycl_for_term_type(pph_sksi.$const51$MedicalPatient, (SubLObject)pph_sksi.$kw52$DEFINITE, head_pred), (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED) : pph_sksi.NIL);
        final SubLObject supports = (SubLObject)pph_sksi.NIL;
        if (pph_sksi.NIL == description) {
            SubLObject csome_list_var;
            SubLObject type;
            for (csome_list_var = external_term_types(bnode), type = (SubLObject)pph_sksi.NIL, type = csome_list_var.first(); pph_sksi.NIL == description && pph_sksi.NIL != csome_list_var; description = pph_main.generate_string_from_phrase_naut(pph_utilities.pph_np_cycl_for_term_type(type, (SubLObject)pph_sksi.$kw52$DEFINITE, head_pred), (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED), csome_list_var = csome_list_var.rest(), type = csome_list_var.first()) {}
        }
        if (pph_sksi.NIL != description) {
            final SubLObject patient_id = bnode_patient_id(bnode, sksi_supports);
            if (pph_sksi.NIL != patient_id) {
                if (pph_sksi.NIL != bnode_is_patientP) {
                    description = Sequences.cconcatenate(description, new SubLObject[] { pph_sksi.$str53$_with_ID_, patient_id });
                }
                else {
                    description = Sequences.cconcatenate(description, new SubLObject[] { pph_sksi.$str54$_of_the_patient_with_ID_, patient_id });
                }
            }
            if (pph_sksi.NIL == bnode_is_patientP) {
                final SubLObject date = bnode_date(bnode, sksi_supports);
                SubLObject connector = (SubLObject)pph_sksi.NIL;
                if (pph_sksi.NIL != date) {
                    if (pph_sksi.NIL != el_utilities.el_formula_with_operator_p(date, pph_sksi.$const55$SecondFn)) {
                        connector = (SubLObject)pph_sksi.$str56$_starting_at_;
                    }
                    else if (pph_sksi.NIL != el_utilities.el_formula_with_operator_p(date, pph_sksi.$const57$DayFn)) {
                        connector = (SubLObject)pph_sksi.$str58$_on_;
                    }
                    else {
                        connector = (SubLObject)pph_sksi.$str59$_;
                    }
                    description = Sequences.cconcatenate(description, new SubLObject[] { connector, pph_main.generate_text_wXsentential_force(date, (SubLObject)pph_sksi.$kw60$NONE, (SubLObject)pph_sksi.$kw61$ANY, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED) });
                }
            }
        }
        return Values.values(description, head_pred, supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 14087L)
    public static SubLObject bnode_date(final SubLObject bnode, final SubLObject sksi_supports) {
        if (pph_sksi.NIL == bnode_isaP(bnode, pph_sksi.$const62$Situation)) {
            return (SubLObject)pph_sksi.NIL;
        }
        final SubLObject my_max_date = bnode_max_date_of_event_bnode(bnode, sksi_supports);
        final SubLObject max_date = (pph_sksi.NIL != my_max_date) ? my_max_date : bnode_max_date_of_event_bnode(bnode_parent_bnode(bnode, sksi_supports), sksi_supports);
        final SubLObject my_min_date = bnode_min_date_of_event_bnode(bnode, sksi_supports);
        final SubLObject min_date = (pph_sksi.NIL != my_min_date) ? my_min_date : bnode_min_date_of_event_bnode(bnode_parent_bnode(bnode, sksi_supports), sksi_supports);
        if (pph_sksi.NIL == max_date) {
            return min_date;
        }
        if (pph_sksi.NIL == min_date) {
            return max_date;
        }
        if (min_date.equal(max_date)) {
            return min_date;
        }
        if (pph_sksi.NIL != date_utilities.date_p(min_date) && pph_sksi.NIL != date_utilities.date_p(max_date)) {
            return el_utilities.make_binary_formula(pph_sksi.$const63$TimeIntervalInclusiveFn, min_date, max_date);
        }
        return (SubLObject)pph_sksi.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 14882L)
    public static SubLObject bnode_isaP(final SubLObject bnode, final SubLObject collection) {
        return subl_promotions.memberP(collection, external_term_types(bnode), (SubLObject)pph_sksi.$sym64$PPH_SPEC_, (SubLObject)pph_sksi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 14998L)
    public static SubLObject bnode_max_date_of_event_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candi_dates = (SubLObject)pph_sksi.NIL;
        SubLObject cdolist_list_var = pred_values_from_pph_sksi_supports(bnode, pph_sksi.$const68$time_intervalContains, sksi_supports, (SubLObject)pph_sksi.TWO_INTEGER);
        SubLObject container = (SubLObject)pph_sksi.NIL;
        container = cdolist_list_var.first();
        while (pph_sksi.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$26 = pred_values_from_pph_sksi_supports(container, pph_sksi.$const67$startsNoLaterThan, sksi_supports, (SubLObject)pph_sksi.ONE_INTEGER);
            SubLObject my_date = (SubLObject)pph_sksi.NIL;
            my_date = cdolist_list_var_$26.first();
            while (pph_sksi.NIL != cdolist_list_var_$26) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(my_date, (SubLObject)pph_sksi.$list65);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_sksi.NIL != success) {
                    final SubLObject date = my_date = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_sksi.$sym66$DATE, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
                }
                final SubLObject var = my_date;
                if (pph_sksi.NIL != var) {
                    candi_dates = (SubLObject)ConsesLow.cons(var, candi_dates);
                }
                cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                my_date = cdolist_list_var_$26.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            container = cdolist_list_var.first();
        }
        if (pph_sksi.NIL != Sequences.find_if((SubLObject)pph_sksi.$sym69$DATE_P, candi_dates, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED)) {
            return list_utilities.extremal(list_utilities.delete_if_not((SubLObject)pph_sksi.$sym69$DATE_P, candi_dates, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED), (SubLObject)pph_sksi.$sym70$DATE_, (SubLObject)pph_sksi.UNPROVIDED);
        }
        return candi_dates.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 15682L)
    public static SubLObject bnode_min_date_of_event_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candi_dates = (SubLObject)pph_sksi.NIL;
        SubLObject cdolist_list_var = pred_values_from_pph_sksi_supports(bnode, pph_sksi.$const68$time_intervalContains, sksi_supports, (SubLObject)pph_sksi.TWO_INTEGER);
        SubLObject container = (SubLObject)pph_sksi.NIL;
        container = cdolist_list_var.first();
        while (pph_sksi.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$27 = pred_values_from_pph_sksi_supports(container, pph_sksi.$const72$startsNoEarlierThan, sksi_supports, (SubLObject)pph_sksi.ONE_INTEGER);
            SubLObject my_date = (SubLObject)pph_sksi.NIL;
            my_date = cdolist_list_var_$27.first();
            while (pph_sksi.NIL != cdolist_list_var_$27) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(my_date, (SubLObject)pph_sksi.$list71);
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (pph_sksi.NIL != success) {
                    final SubLObject date = my_date = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)pph_sksi.$sym66$DATE, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED);
                }
                final SubLObject var = my_date;
                if (pph_sksi.NIL != var) {
                    candi_dates = (SubLObject)ConsesLow.cons(var, candi_dates);
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                my_date = cdolist_list_var_$27.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            container = cdolist_list_var.first();
        }
        if (pph_sksi.NIL != Sequences.find_if((SubLObject)pph_sksi.$sym69$DATE_P, candi_dates, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED)) {
            return list_utilities.extremal(list_utilities.delete_if_not((SubLObject)pph_sksi.$sym69$DATE_P, candi_dates, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED), (SubLObject)pph_sksi.$sym73$DATE_, (SubLObject)pph_sksi.UNPROVIDED);
        }
        return candi_dates.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 16365L)
    public static SubLObject bnode_patient_id(final SubLObject bnode, final SubLObject sksi_supports) {
        final SubLObject patient = bnode_patient_bnode(bnode, sksi_supports);
        return (SubLObject)((pph_sksi.NIL != patient) ? bnode_id(patient, sksi_supports) : pph_sksi.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 16607L)
    public static SubLObject bnode_id(final SubLObject bnode, final SubLObject sksi_supports) {
        return fpred_value_from_pph_sksi_supports(bnode, pph_sksi.$const74$cCFCCFID, sksi_supports, (SubLObject)pph_sksi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 16797L)
    public static SubLObject bnode_is_patientP(final SubLObject bnode, final SubLObject sksi_supports) {
        return Equality.equal(bnode, bnode_patient_bnode(bnode, sksi_supports));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 16919L)
    public static SubLObject bnode_patient_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        SubLObject patient = (SubLObject)pph_sksi.NIL;
        final SubLObject record = bnode_record_bnode(bnode, sksi_supports);
        if (pph_sksi.NIL == patient) {
            SubLObject csome_list_var = bnode_child_bnodes(record, sksi_supports);
            SubLObject sub_node = (SubLObject)pph_sksi.NIL;
            sub_node = csome_list_var.first();
            while (pph_sksi.NIL == patient && pph_sksi.NIL != csome_list_var) {
                if (pph_sksi.NIL != subl_promotions.memberP(pph_sksi.$const51$MedicalPatient, external_term_types(sub_node), (SubLObject)pph_sksi.UNPROVIDED, (SubLObject)pph_sksi.UNPROVIDED)) {
                    patient = sub_node;
                }
                csome_list_var = csome_list_var.rest();
                sub_node = csome_list_var.first();
            }
        }
        return patient;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 17318L)
    public static SubLObject bnode_parent_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        return fpred_value_from_pph_sksi_supports(bnode, pph_sksi.$const75$cCF_contains, sksi_supports, (SubLObject)pph_sksi.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 17508L)
    public static SubLObject bnode_child_bnodes(final SubLObject bnode, final SubLObject sksi_supports) {
        return pred_values_from_pph_sksi_supports(bnode, pph_sksi.$const75$cCF_contains, sksi_supports, (SubLObject)pph_sksi.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 17700L)
    public static SubLObject bnode_record_bnode(final SubLObject bnode, final SubLObject sksi_supports) {
        SubLObject ans;
        for (ans = bnode; pph_sksi.NIL != ans && pph_sksi.NIL == record_bnode_p(ans); ans = bnode_parent_bnode(ans, sksi_supports)) {}
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-sksi.lisp", position = 17903L)
    public static SubLObject record_bnode_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_sksi.NIL != pph_types.ccf_bnode_p(v_object) && Characters.CHAR_less.eql(string_utilities.first_char(cycl_utilities.nat_arg2(v_object, (SubLObject)pph_sksi.UNPROVIDED))));
    }
    
    public static SubLObject declare_pph_sksi_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_sksi", "GENERATE-SKSI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_sksi_memoized_internal", "GENERATE-SKSI-MEMOIZED-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_sksi_memoized", "GENERATE-SKSI-MEMOIZED", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "skip_generate_sksi_for_nautP", "SKIP-GENERATE-SKSI-FOR-NAUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_sksi_name_string_preds", "PPH-SKSI-NAME-STRING-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_name_and_pred_from_sksi_query_results", "PPH-NAME-AND-PRED-FROM-SKSI-QUERY-RESULTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_preferred_sksi_lexificationP", "PPH-PREFERRED-SKSI-LEXIFICATION?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_ideal_sksi_name_pred_p", "PPH-IDEAL-SKSI-NAME-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_better_sksi_name_pred_p", "PPH-BETTER-SKSI-NAME-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_name_and_pred_from_query_result", "PPH-NAME-AND-PRED-FROM-QUERY-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_external_term_from_explicit_uri", "GENERATE-EXTERNAL-TERM-FROM-EXPLICIT-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_uri_stringP", "PPH-URI-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_display_string_for_uri", "PPH-DISPLAY-STRING-FOR-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_maybe_abbreviate_uri", "PPH-MAYBE-ABBREVIATE-URI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_external_term_from_current_inference_answer", "GENERATE-EXTERNAL-TERM-FROM-CURRENT-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pph_sksi_supports", "PPH-SKSI-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "inference_answer_sksi_supports_internal", "INFERENCE-ANSWER-SKSI-SUPPORTS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "inference_answer_sksi_supports", "INFERENCE-ANSWER-SKSI-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "external_term_types", "EXTERNAL-TERM-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "valid_external_term_typeP", "VALID-EXTERNAL-TERM-TYPE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "external_term_types_from_sksi_supports", "EXTERNAL-TERM-TYPES-FROM-SKSI-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "external_term_types_from_isa_constraints", "EXTERNAL-TERM-TYPES-FROM-ISA-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "paraphrase_fn_for_external_term", "PARAPHRASE-FN-FOR-EXTERNAL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_external_term_from_current_inference_answer_internal", "GENERATE-EXTERNAL-TERM-FROM-CURRENT-INFERENCE-ANSWER-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "fpred_value_from_pph_sksi_supports", "FPRED-VALUE-FROM-PPH-SKSI-SUPPORTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "pred_values_from_pph_sksi_supports", "PRED-VALUES-FROM-PPH-SKSI-SUPPORTS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "generate_bnode_from_current_inference_answer", "GENERATE-BNODE-FROM-CURRENT-INFERENCE-ANSWER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_date", "BNODE-DATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_isaP", "BNODE-ISA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_max_date_of_event_bnode", "BNODE-MAX-DATE-OF-EVENT-BNODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_min_date_of_event_bnode", "BNODE-MIN-DATE-OF-EVENT-BNODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_patient_id", "BNODE-PATIENT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_id", "BNODE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_is_patientP", "BNODE-IS-PATIENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_patient_bnode", "BNODE-PATIENT-BNODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_parent_bnode", "BNODE-PARENT-BNODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_child_bnodes", "BNODE-CHILD-BNODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "bnode_record_bnode", "BNODE-RECORD-BNODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_sksi", "record_bnode_p", "RECORD-BNODE-P", 1, 0, false);
        return (SubLObject)pph_sksi.NIL;
    }
    
    public static SubLObject init_pph_sksi_file() {
        pph_sksi.$inside_generate_sksiP$ = SubLFiles.defparameter("*INSIDE-GENERATE-SKSI?*", (SubLObject)pph_sksi.NIL);
        pph_sksi.$pph_sksi_name_string_preds$ = SubLFiles.deflexical("*PPH-SKSI-NAME-STRING-PREDS*", (SubLObject)pph_sksi.$list17);
        pph_sksi.$generate_sksi_skip_patterns$ = SubLFiles.deflexical("*GENERATE-SKSI-SKIP-PATTERNS*", (SubLObject)pph_sksi.$list18);
        pph_sksi.$paraphrase_fns_for_external_terms$ = SubLFiles.deflexical("*PARAPHRASE-FNS-FOR-EXTERNAL-TERMS*", (SubLObject)pph_sksi.$list45);
        return (SubLObject)pph_sksi.NIL;
    }
    
    public static SubLObject setup_pph_sksi_file() {
        pph_types.pph_register_method((SubLObject)pph_sksi.$sym0$GENERATE_SKSI, (SubLObject)pph_sksi.$kw1$SKSI_SUPPORTED_EXTERNAL_TERM, (SubLObject)pph_sksi.$kw2$DECENT);
        memoization_state.note_memoized_function((SubLObject)pph_sksi.$sym3$GENERATE_SKSI_MEMOIZED);
        pph_types.pph_register_method((SubLObject)pph_sksi.$sym25$GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI, (SubLObject)pph_sksi.$kw1$SKSI_SUPPORTED_EXTERNAL_TERM, (SubLObject)pph_sksi.$kw26$FALLBACK);
        utilities_macros.note_funcall_helper_function((SubLObject)pph_sksi.$sym25$GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI);
        pph_types.pph_register_method((SubLObject)pph_sksi.$sym38$GENERATE_EXTERNAL_TERM_FROM_CURRENT_INFERENCE_ANSWER, (SubLObject)pph_sksi.$kw1$SKSI_SUPPORTED_EXTERNAL_TERM, (SubLObject)pph_sksi.$kw39$BEST);
        memoization_state.note_memoized_function((SubLObject)pph_sksi.$sym40$INFERENCE_ANSWER_SKSI_SUPPORTS);
        return (SubLObject)pph_sksi.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_sksi_file();
    }
    
    public void initializeVariables() {
        init_pph_sksi_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_sksi_file();
    }
    
    static {
        me = (SubLFile)new pph_sksi();
        pph_sksi.$inside_generate_sksiP$ = null;
        pph_sksi.$pph_sksi_name_string_preds$ = null;
        pph_sksi.$generate_sksi_skip_patterns$ = null;
        pph_sksi.$paraphrase_fns_for_external_terms$ = null;
        $sym0$GENERATE_SKSI = SubLObjectFactory.makeSymbol("GENERATE-SKSI");
        $kw1$SKSI_SUPPORTED_EXTERNAL_TERM = SubLObjectFactory.makeKeyword("SKSI-SUPPORTED-EXTERNAL-TERM");
        $kw2$DECENT = SubLObjectFactory.makeKeyword("DECENT");
        $sym3$GENERATE_SKSI_MEMOIZED = SubLObjectFactory.makeSymbol("GENERATE-SKSI-MEMOIZED");
        $str4$Recursive_call_to_GENERATE_SKSI_ = SubLObjectFactory.makeString("Recursive call to GENERATE-SKSI.");
        $const5$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $kw6$ALLOWED_MODULES = SubLObjectFactory.makeKeyword("ALLOWED-MODULES");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI"));
        $kw8$RETURN = SubLObjectFactory.makeKeyword("RETURN");
        $kw9$BINDINGS_AND_SUPPORTS = SubLObjectFactory.makeKeyword("BINDINGS-AND-SUPPORTS");
        $sym10$_NAME = SubLObjectFactory.makeSymbol("?NAME");
        $list11 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NAME-STRING-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAINS"));
        $kw12$MAX_TRANSFORMATION_DEPTH = SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)SubLObjectFactory.makeKeyword("TRANS-PREDICATE-POS"), (SubLObject)SubLObjectFactory.makeKeyword("DETERMINE-NEW-TRANSFORMATION-TACTICS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI")));
        $const14$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $kw15$REWRITE_ALLOWED_ = SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?");
        $sym16$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString")), (SubLObject)pph_sksi.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredTermStrings")), (SubLObject)pph_sksi.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)pph_sksi.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork")), (SubLObject)pph_sksi.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definiteDescriptions")), (SubLObject)pph_sksi.ZERO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")), (SubLObject)pph_sksi.ZERO_INTEGER));
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SchemaObjectFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-Bnode-CMLS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxPatientMapping")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxClaimMapping")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRxPharmacyFormalProductTypeMapping"))), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")));
        $const19$preferredNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString"));
        $const20$genStringAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REWRITE-ALLOWED?"), (SubLObject)pph_sksi.T, (SubLObject)SubLObjectFactory.makeKeyword("ALLOWED-MODULES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MODULE-SUBTYPE"), (SubLObject)SubLObjectFactory.makeKeyword("SKSI")));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPORTS"));
        $list23 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-PRED")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings")));
        $sym24$THIS_PRED = SubLObjectFactory.makeSymbol("THIS-PRED");
        $sym25$GENERATE_EXTERNAL_TERM_FROM_EXPLICIT_URI = SubLObjectFactory.makeSymbol("GENERATE-EXTERNAL-TERM-FROM-EXPLICIT-URI");
        $kw26$FALLBACK = SubLObjectFactory.makeKeyword("FALLBACK");
        $sym27$PPH_URI_STRING_ = SubLObjectFactory.makeSymbol("PPH-URI-STRING?");
        $str28$_ = SubLObjectFactory.makeString("<");
        $str29$_ = SubLObjectFactory.makeString(">");
        $sym30$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const31$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const32$standardPrefixForURI = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("standardPrefixForURI"));
        $kw33$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw34$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("REIFIED-URI"));
        $const36$uriString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("uriString"));
        $str37$_ = SubLObjectFactory.makeString(":");
        $sym38$GENERATE_EXTERNAL_TERM_FROM_CURRENT_INFERENCE_ANSWER = SubLObjectFactory.makeSymbol("GENERATE-EXTERNAL-TERM-FROM-CURRENT-INFERENCE-ANSWER");
        $kw39$BEST = SubLObjectFactory.makeKeyword("BEST");
        $sym40$INFERENCE_ANSWER_SKSI_SUPPORTS = SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-SKSI-SUPPORTS");
        $sym41$PPH_GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("PPH-GENERALITY-ESTIMATE<");
        $const42$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $sym43$_X = SubLObjectFactory.makeSymbol("?X");
        $sym44$VALID_EXTERNAL_TERM_TYPE_ = SubLObjectFactory.makeSymbol("VALID-EXTERNAL-TERM-TYPE?");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("CCF-BNODE-P")), (SubLObject)SubLObjectFactory.makeSymbol("GENERATE-BNODE-FROM-CURRENT-INFERENCE-ANSWER")));
        $list46 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-FN"));
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym49$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $const50$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $const51$MedicalPatient = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MedicalPatient"));
        $kw52$DEFINITE = SubLObjectFactory.makeKeyword("DEFINITE");
        $str53$_with_ID_ = SubLObjectFactory.makeString(" with ID ");
        $str54$_of_the_patient_with_ID_ = SubLObjectFactory.makeString(" of the patient with ID ");
        $const55$SecondFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn"));
        $str56$_starting_at_ = SubLObjectFactory.makeString(" starting at ");
        $const57$DayFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn"));
        $str58$_on_ = SubLObjectFactory.makeString(" on ");
        $str59$_ = SubLObjectFactory.makeString(" ");
        $kw60$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw61$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const62$Situation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Situation"));
        $const63$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $sym64$PPH_SPEC_ = SubLObjectFactory.makeSymbol("PPH-SPEC?");
        $list65 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)SubLObjectFactory.makeInteger(59), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)SubLObjectFactory.makeInteger(59), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))));
        $sym66$DATE = SubLObjectFactory.makeSymbol("DATE");
        $const67$startsNoLaterThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsNoLaterThan"));
        $const68$time_intervalContains = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("time:intervalContains"));
        $sym69$DATE_P = SubLObjectFactory.makeSymbol("DATE-P");
        $sym70$DATE_ = SubLObjectFactory.makeSymbol("DATE<");
        $list71 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn")), (SubLObject)pph_sksi.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn")), (SubLObject)pph_sksi.ZERO_INTEGER, (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn")), (SubLObject)pph_sksi.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("DATE")))));
        $const72$startsNoEarlierThan = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("startsNoEarlierThan"));
        $sym73$DATE_ = SubLObjectFactory.makeSymbol("DATE>");
        $const74$cCFCCFID = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCFCCFID"));
        $const75$cCF_contains = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cCF-contains"));
    }
}

/*

	Total time: 288 ms
	
*/