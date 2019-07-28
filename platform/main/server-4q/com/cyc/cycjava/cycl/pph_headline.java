package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_headline;
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

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.pph_headline.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_headline extends SubLTranslatedFile {
    public static final SubLFile me = new pph_headline();

    public static final String myName = "com.cyc.cycjava.cycl.pph_headline";

    public static final String myFingerPrint = "bc36e815edd9d5b9cc8af10c242728857b2a66051613ce36d194a2e38b0426d3";

    private static final SubLObject $$EnglishHeadlineParaphraseMt = reader_make_constant_shell(makeString("EnglishHeadlineParaphraseMt"));



    private static final SubLString $str2$Finished_generating__S = makeString("Finished generating ~S");

    private static final SubLString $str3$Removed_extraneous_determiners___ = makeString("Removed extraneous determiners~% ~S");

    private static final SubLString $str4$Removed_extraneous_copulas____S = makeString("Removed extraneous copulas~% ~S");

    private static final SubLString $str5$Tweaked_verb_tense____S = makeString("Tweaked verb tense~% ~S");

    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $$$the_ = makeString("the ");

    private static final SubLString $str8$Updating_string_from__S___to__S = makeString("Updating string from ~S~% to ~S");

    private static final SubLString $str9$Complement___S = makeString("Complement: ~S");

    private static final SubLObject $$passiveParticiple = reader_make_constant_shell(makeString("passiveParticiple"));

    private static final SubLString $$$not = makeString("not");

    private static final SubLString $$$not_ = makeString("not ");

    private static final SubLString $str13$Removing_copula_from__S = makeString("Removing copula from ~S");

    private static final SubLString $str14$Not_removing_copula_with_compleme = makeString("Not removing copula with complement ~S");

    private static final SubLObject $$pastTense_Generic = reader_make_constant_shell(makeString("pastTense-Generic"));

    private static final SubLList $list16 = list(reader_make_constant_shell(makeString("presentTense-Generic")));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLString $str18$Converting__S_to_present_tense = makeString("Converting ~S to present tense");

    private static final SubLObject $$futureTense_Generic = reader_make_constant_shell(makeString("futureTense-Generic"));

    private static final SubLList $list20 = list(reader_make_constant_shell(makeString("infinitive")));

    private static final SubLString $$$to_ = makeString("to ");

    private static final SubLString $str22$Converting__S_to_infinitive = makeString("Converting ~S to infinitive");

    private static final SubLObject $$Indefinite_NLAttr = reader_make_constant_shell(makeString("Indefinite-NLAttr"));

    private static final SubLObject $$Definite_NLAttr = reader_make_constant_shell(makeString("Definite-NLAttr"));

    private static final SubLObject $$Some_NLAttr = reader_make_constant_shell(makeString("Some-NLAttr"));

    private static final SubLObject $$Every_NLAttr = reader_make_constant_shell(makeString("Every-NLAttr"));

    private static final SubLString $str27$_tmp_proof_conclusions_cfasl = makeString("/tmp/proof-conclusions.cfasl");

    private static final SubLSymbol HYPOTHETICAL_TERM_P = makeSymbol("HYPOTHETICAL-TERM-P");

    private static final SubLSymbol $sym29$INVALID_FORT_ = makeSymbol("INVALID-FORT?");

    private static final SubLString $str30$_________________________________ = makeString("~%~%================================================~%~S~%==============================================~%~A~%==========================================~%");

    private static final SubLInteger $int$150 = makeInteger(150);

    private static final SubLString $str32$_define_test_case_table_generate_ = makeString("(define-test-case-table generate-english-headline-string\n    (:owner \"baxter\" :test #\'equal :kb :full :classes \'(pph-test-case-tables))");

    private static final SubLString $str33$_____S_____S___ = makeString("~&((~S)~% ~S)~%");

    private static final SubLString $str34$_ = makeString(")");

    private static final SubLSymbol GENERATE_ENGLISH_HEADLINE_STRING = makeSymbol("GENERATE-ENGLISH-HEADLINE-STRING");







    private static final SubLList $list39 = list(makeSymbol("PPH-TEST-CASE-TABLES-NOT-WORKING"));







    private static final SubLObject $list43 = _constant_43_initializer();

    public static SubLObject generate_english_headline_string(final SubLObject sentence, SubLObject domain_mt, SubLObject language_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (language_mt == UNPROVIDED) {
            language_mt = $$EnglishHeadlineParaphraseMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
        try {
            pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
            pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
            pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
            try {
                final SubLObject _prev_bind_0_$1 = pph_vars.$constant_link_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = pph_vars.$html_generation_term_id_function$.currentBinding(thread);
                final SubLObject _prev_bind_2_$3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = pph_vars.$pph_significant_digits_cutoff$.currentBinding(thread);
                try {
                    pph_vars.$constant_link_function$.bind($NONE, thread);
                    pph_vars.$html_generation_term_id_function$.bind(NIL, thread);
                    pph_vars.$pph_use_bulleted_listsP$.bind(NIL, thread);
                    pph_vars.$pph_significant_digits_cutoff$.bind(THREE_INTEGER, thread);
                    final SubLObject v_pph_phrase = pph_phrase.new_pph_phrase_for_cycl(sentence, UNPROVIDED, UNPROVIDED);
                    SubLObject string = NIL;
                    SubLObject result_agr_pred = NIL;
                    SubLObject justification = NIL;
                    SubLObject output_list = NIL;
                    SubLObject demerits = NIL;
                    final SubLObject _prev_bind_0_$2 = pph_vars.$generation_level$.currentBinding(thread);
                    try {
                        pph_vars.$generation_level$.bind(number_utilities.f_1X(pph_vars.$generation_level$.getDynamicValue(thread)), thread);
                        pph_main.pph_phrase_generate(v_pph_phrase, pph_vars.maybe_temporally_qualify_pph_language_mt(language_mt), domain_mt, UNPROVIDED);
                    } finally {
                        pph_vars.$generation_level$.rebind(_prev_bind_0_$2, thread);
                    }
                    if (NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str2$Finished_generating__S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != pph_headline_remove_extraneous_determiners(v_pph_phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                            format_nil.force_format(T, $str3$Removed_extraneous_determiners___, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != pph_headline_remove_extraneous_copulas(v_pph_phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                            format_nil.force_format(T, $str4$Removed_extraneous_copulas____S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if ((NIL != pph_headline_tweak_head_verb_tense(v_pph_phrase)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                            format_nil.force_format(T, $str5$Tweaked_verb_tense____S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        string = apply_headline_capitalization(pph_string.pph_string_if_non_null_to_output_format(pph_phrase.pph_phrase_string(v_pph_phrase, T), UNPROVIDED));
                        result_agr_pred = pph_phrase.pph_phrase_agr_pred(v_pph_phrase);
                        justification = pph_phrase.pph_phrase_justification(v_pph_phrase);
                        output_list = pph_phrase.pph_phrase_output_list(v_pph_phrase);
                        demerits = pph_phrase.pph_phrase_demerits(v_pph_phrase);
                    }
                    return values(string, result_agr_pred, justification, output_list, demerits);
                } finally {
                    pph_vars.$pph_significant_digits_cutoff$.rebind(_prev_bind_4, thread);
                    pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_2_$3, thread);
                    pph_vars.$html_generation_term_id_function$.rebind(_prev_bind_1_$2, thread);
                    pph_vars.$constant_link_function$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    pph_macros.destroy_new_pph_phrases();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
            pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
            pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_headline_remove_extraneous_determiners(final SubLObject v_pph_phrase) {
        SubLObject changedP = NIL;
        if (((NIL != pph_phrase.pph_phrase_npP(v_pph_phrase)) && (NIL == pph_phrase_resolution.pph_copular_complementP(v_pph_phrase))) && TWO_INTEGER.eql(pph_phrase.pph_phrase_dtr_count(v_pph_phrase))) {
            final SubLObject detp = pph_phrase.pph_phrase_nth_dtr(v_pph_phrase, ZERO_INTEGER);
            if ((NIL != pph_phrase_resolution.pph_phrase_detpP(detp)) && (NIL != pph_detp_cycl_unnewsworthyP(pph_phrase.pph_phrase_cycl(detp, UNPROVIDED)))) {
                pph_phrase.pph_phrase_remove_dtr(v_pph_phrase, detp);
                changedP = T;
            }
        } else
            if ((NIL != pph_utilities.pph_name_string_predP(pph_phrase.pph_phrase_agr_pred(v_pph_phrase))) && (NIL != string_utilities.starts_with_by_test(pph_phrase.pph_phrase_string(v_pph_phrase, T), $$$the_, symbol_function(EQUALP)))) {
                pph_phrase.pph_phrase_set_string(v_pph_phrase, string_utilities.pre_remove(pph_phrase.pph_phrase_string(v_pph_phrase, T), $$$the_, symbol_function(EQUALP)));
                changedP = T;
            }

        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(v_pph_phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(v_pph_phrase);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                dtr = aref(vector_var, element_num);
                if (NIL != pph_headline_remove_extraneous_determiners(dtr)) {
                    changedP = T;
                }
                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        if ((NIL != changedP) && (NIL != pph_phrase.pph_phrase_has_dtrsP(v_pph_phrase))) {
            pph_finished_phrase_update_from_dtrs(v_pph_phrase);
        }
        return changedP;
    }

    public static SubLObject pph_finished_phrase_update_from_dtrs(final SubLObject v_pph_phrase) {
        if (NIL == pph_phrase.pph_phrase_has_dtrsP(v_pph_phrase)) {
            return NIL;
        }
        final SubLObject old_string = pph_phrase.pph_phrase_string(v_pph_phrase, UNPROVIDED);
        pph_phrase_resolution.pph_phrase_set_output_list_from_finished_dtrs(v_pph_phrase);
        final SubLObject new_string = pph_phrase.pph_phrase_output_list_string(pph_phrase.pph_phrase_output_list(v_pph_phrase), UNPROVIDED);
        if (!old_string.equal(new_string)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str8$Updating_string_from__S___to__S, pph_string.pph_string_to_utf8(old_string), pph_string.pph_string_to_utf8(new_string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_headline_remove_extraneous_copulas(final SubLObject v_pph_phrase) {
        if (NIL != pph_phrase.pph_copula_phraseP(pph_phrase.pph_phrase_head_dtr(v_pph_phrase))) {
            final SubLObject head_dtr_num = pph_phrase.pph_phrase_head_dtr_num(v_pph_phrase);
            final SubLObject comp_dtr_num = number_utilities.f_1X(head_dtr_num);
            final SubLObject complement = (pph_phrase.pph_phrase_dtr_count(v_pph_phrase).numG(comp_dtr_num)) ? pph_phrase.pph_phrase_nth_dtr(v_pph_phrase, comp_dtr_num) : NIL;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str9$Complement___S, complement, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (((((((NIL != pph_phrase.pph_det_nbarP(complement)) || (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(complement), $$passiveParticiple, UNPROVIDED))) || (NIL != pph_phrase.pph_phrase_ppP(complement))) || (NIL != pph_phrase.pph_phrase_adjpP(complement))) || (NIL != pph_phrase.pph_phrase_adjP(complement))) || pph_phrase.pph_phrase_string(complement, NIL).equal($$$not)) || (NIL != string_utilities.starts_with(pph_phrase.pph_phrase_string(complement, NIL), $$$not_))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str13$Removing_copula_from__S, v_pph_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_phrase.pph_phrase_remove_dtr(v_pph_phrase, pph_phrase.pph_phrase_head_dtr(v_pph_phrase));
                pph_phrase.pph_phrase_set_head_dtr_num(v_pph_phrase, NIL);
                pph_finished_phrase_update_from_dtrs(v_pph_phrase);
                return T;
            }
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str14$Not_removing_copula_with_compleme, complement, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if ((((NIL != pph_phrase.pph_phrase_has_dtrsP(v_pph_phrase)) && (NIL != pph_phrase.pph_phrase_head_dtr(v_pph_phrase))) && (NIL != pph_phrase.pph_phrase_sP(pph_phrase.pph_phrase_head_dtr(v_pph_phrase)))) && (NIL != pph_headline_remove_extraneous_copulas(pph_phrase.pph_phrase_head_dtr(v_pph_phrase)))) {
            pph_finished_phrase_update_from_dtrs(v_pph_phrase);
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_headline_tweak_head_verb_tense(final SubLObject v_pph_phrase) {
        final SubLObject head_dtr = pph_phrase.pph_phrase_lexical_head_dtr(v_pph_phrase);
        final SubLObject head_wu = (NIL != head_dtr) ? pph_phrase.pph_phrase_wu(head_dtr, UNPROVIDED) : NIL;
        if (NIL != head_wu) {
            if (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(head_dtr), $$pastTense_Generic, UNPROVIDED)) {
                final SubLObject subj = pph_phrase_resolution.pph_phrase_agr_target_phrase(head_dtr, v_pph_phrase);
                final SubLObject new_pred = (NIL != subj) ? pph_phrase_resolution.verb_pred_for_subject(subj, $list16) : NIL;
                final SubLObject new_string = (NIL != new_pred) ? pph_methods_lexicon.pph_first_string_of_wordXspeech_part(head_wu, $$Verb, list(new_pred), UNPROVIDED) : NIL;
                if (NIL != new_string) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str18$Converting__S_to_present_tense, head_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_phrase.pph_phrase_set_string(head_dtr, new_string);
                    pph_finished_phrase_update_from_dtrs(v_pph_phrase);
                    return T;
                }
            } else
                if (NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(head_dtr), $$futureTense_Generic, UNPROVIDED)) {
                    final SubLObject subj = pph_phrase_resolution.pph_phrase_agr_target_phrase(head_dtr, UNPROVIDED);
                    final SubLObject new_pred = (NIL != subj) ? pph_phrase_resolution.verb_pred_for_subject(subj, $list20) : NIL;
                    final SubLObject inf = pph_methods_lexicon.pph_first_string_of_wordXspeech_part(head_wu, $$Verb, list(new_pred), UNPROVIDED);
                    final SubLObject new_string2 = (NIL != inf) ? cconcatenate($$$to_, inf) : NIL;
                    if (NIL != new_string2) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                            format_nil.force_format(T, $str22$Converting__S_to_infinitive, head_dtr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        pph_phrase.pph_phrase_set_string(head_dtr, new_string2);
                        pph_finished_phrase_update_from_dtrs(v_pph_phrase);
                        return T;
                    }
                }

        }
        return NIL;
    }

    public static SubLObject pph_detp_cycl_unnewsworthyP(final SubLObject det_cycl) {
        if (((det_cycl.eql($$Indefinite_NLAttr) || det_cycl.eql($$Definite_NLAttr)) || det_cycl.eql($$Some_NLAttr)) || det_cycl.eql($$Every_NLAttr)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject apply_headline_capitalization(final SubLObject string) {
        return string_utilities.char_subst(CHAR_quote, CHAR_quotation, string_utilities.capitalize_smart(string));
    }

    public static SubLObject print_headlines(SubLObject proof_conclusions) {
        if (proof_conclusions == UNPROVIDED) {
            proof_conclusions = cfasl_utilities.cfasl_load($str27$_tmp_proof_conclusions_cfasl);
        }
        SubLObject cdolist_list_var = proof_conclusions;
        SubLObject proof_conclusion = NIL;
        proof_conclusion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == cycl_utilities.expression_find_if(HYPOTHETICAL_TERM_P, proof_conclusion, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if($sym29$INVALID_FORT_, proof_conclusion, UNPROVIDED, UNPROVIDED))) {
                final SubLObject content = proof_view_news.proof_view_headline_content(proof_conclusion, UNPROVIDED);
                final SubLObject headline = (NIL != content) ? unicode_strings.html_escaped_to_utf8_string(generate_english_headline_string(content, UNPROVIDED, UNPROVIDED)) : NIL;
                if (NIL != headline) {
                    format_nil.force_format(T, $str30$_________________________________, proof_conclusion, headline, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            proof_conclusion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject print_headline_test_case_table(SubLObject proof_conclusions) {
        if (proof_conclusions == UNPROVIDED) {
            proof_conclusions = cfasl_utilities.cfasl_load($str27$_tmp_proof_conclusions_cfasl);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding(thread);
        try {
            Errors.$ignore_warnsP$.bind(T, thread);
            final SubLObject max_length = $int$150;
            format_nil.force_format(T, $str32$_define_test_case_table_generate_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = proof_conclusions;
            SubLObject proof_conclusion = NIL;
            proof_conclusion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (((NIL == assertions_high.invalid_assertionP(proof_conclusion, UNPROVIDED)) && (NIL == cycl_utilities.expression_find_if(HYPOTHETICAL_TERM_P, proof_conclusion, T, UNPROVIDED))) && (NIL == cycl_utilities.expression_find_if($sym29$INVALID_FORT_, proof_conclusion, T, UNPROVIDED))) {
                    final SubLObject _prev_bind_0_$6 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                        final SubLObject content = proof_view_news.proof_view_headline_content(proof_conclusion, UNPROVIDED);
                        final SubLObject headline = (NIL != content) ? generate_english_headline_string(content, UNPROVIDED, UNPROVIDED) : NIL;
                        if ((NIL != headline) && (NIL != list_utilities.lengthLE(headline, max_length, UNPROVIDED))) {
                            format_nil.force_format(T, $str33$_____S_____S___, cycl_utilities.hl_to_el(content), headline, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                proof_conclusion = cdolist_list_var.first();
            } 
            format_nil.force_format(T, $str34$_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            Errors.$ignore_warnsP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_pph_headline_file() {
        declareFunction(me, "generate_english_headline_string", "GENERATE-ENGLISH-HEADLINE-STRING", 1, 2, false);
        declareFunction(me, "pph_headline_remove_extraneous_determiners", "PPH-HEADLINE-REMOVE-EXTRANEOUS-DETERMINERS", 1, 0, false);
        declareFunction(me, "pph_finished_phrase_update_from_dtrs", "PPH-FINISHED-PHRASE-UPDATE-FROM-DTRS", 1, 0, false);
        declareFunction(me, "pph_headline_remove_extraneous_copulas", "PPH-HEADLINE-REMOVE-EXTRANEOUS-COPULAS", 1, 0, false);
        declareFunction(me, "pph_headline_tweak_head_verb_tense", "PPH-HEADLINE-TWEAK-HEAD-VERB-TENSE", 1, 0, false);
        declareFunction(me, "pph_detp_cycl_unnewsworthyP", "PPH-DETP-CYCL-UNNEWSWORTHY?", 1, 0, false);
        declareFunction(me, "apply_headline_capitalization", "APPLY-HEADLINE-CAPITALIZATION", 1, 0, false);
        declareFunction(me, "print_headlines", "PRINT-HEADLINES", 0, 1, false);
        declareFunction(me, "print_headline_test_case_table", "PRINT-HEADLINE-TEST-CASE-TABLE", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_pph_headline_file() {
        return NIL;
    }

    public static SubLObject setup_pph_headline_file() {
        define_test_case_table_int(GENERATE_ENGLISH_HEADLINE_STRING, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, $list39, $KB, $FULL, $WORKING_, T }), $list43);
        return NIL;
    }

    private static SubLObject _constant_43_initializer() {
        return list(new SubLObject[]{ list(list(list(list(reader_make_constant_shell(makeString("TypeCapableFn")), reader_make_constant_shell(makeString("anatomicallyCapableOf"))), reader_make_constant_shell(makeString("SparklingEnopeSquid")), list(reader_make_constant_shell(makeString("WaveEmissionFn")), reader_make_constant_shell(makeString("VisibleLight"))), reader_make_constant_shell(makeString("doneBy")))), makeString("Firefly Squid Anatomically Capable of Glowing")), list(list(list(reader_make_constant_shell(makeString("causes-SubSitTypeSubSitType")), reader_make_constant_shell(makeString("SCerevisiaeMatingScript")), reader_make_constant_shell(makeString("SecretionOfMatingFactorAlpha")), reader_make_constant_shell(makeString("MovementOfATypeCellTowardAlphaTypeCell")))), makeString("In Mating of S. Cerevisiae, Secretion of Mating Factor &#x3B1; Causes Moving toward an &#x3B1; Cell")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("ThomasPynchon")), reader_make_constant_shell(makeString("ArticulateOrEloquent")))), makeString("Thomas Pynchon Fluent")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("knowsAbout")), reader_make_constant_shell(makeString("LudwigVanBeethoven")), reader_make_constant_shell(makeString("CityOfParisFrance"))), reader_make_constant_shell(makeString("False")))), makeString("Ludwig Van Beethoven Does Not Know Something about Paris, France")), list(list(list(reader_make_constant_shell(makeString("goals")), reader_make_constant_shell(makeString("RepublicanParty-US")), list(reader_make_constant_shell(makeString("governmentType")), reader_make_constant_shell(makeString("PalestinianWestBankAndGaza")), reader_make_constant_shell(makeString("DemocraticGeopoliticalEntity"))))), makeString("Republican Party Has the Goal That [West Bank and Gaza Is in Democracy]")), list(list(list(reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("TerroristAttack-March-17-1992-Buenos-Aires")), reader_make_constant_shell(makeString("CityOfBuenosAiresArgentina")))), makeString("March 17, 1992 Car Bombing of the Israeli Embassy in Buenos Aires, Argentina by the Lebanese Hizballah Happened in Buenos Aires, Argentina")), list(list(list(reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("objectRemoved")), reader_make_constant_shell(makeString("Circumcision")), reader_make_constant_shell(makeString("AnimalBodyPart")))), makeString("Body Parts Are Removed during Circumcisions")), list(list(list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("NoddingOff")), reader_make_constant_shell(makeString("Nodding-Gesture")))), makeString("No Noddings Noddings")), list(list(list(reader_make_constant_shell(makeString("typeBehaviorCapable-PerformedBy")), reader_make_constant_shell(makeString("Comedian")), reader_make_constant_shell(makeString("JokeTelling")))), makeString("Instances of Comedians Are Typically Capable of Performing Told Jokes")), list(list(list(reader_make_constant_shell(makeString("typeIngredientTypes")), reader_make_constant_shell(makeString("Pizza")), reader_make_constant_shell(makeString("TomatoBasedSauce")))), makeString("Pizza Includes Tomato Sauce")), list(list(list(reader_make_constant_shell(makeString("birthDate")), reader_make_constant_shell(makeString("NatalieCurtis")), list(reader_make_constant_shell(makeString("DayFn")), EIGHT_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2003)))))), makeString("Natalie Curtis Born on December 8, 2003")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("EscherichiaColi")), reader_make_constant_shell(makeString("BiologicalAgentType")))), makeString("E. Coli a Biological Agent")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("GlycogenBreakdown-CellularSignalingScript")), list(reader_make_constant_shell(makeString("ActivationOfEnzymeTypeFn")), reader_make_constant_shell(makeString("PhosphorylaseKinaseMolecule"))), reader_make_constant_shell(makeString("PhosphorylaseKinaseActivation-GlycogenBreakdownTransductionPathway")))), makeString("Activation of Phosphorylase Kinase Required for Phosphorylase Kinase Activation to Take Place in Cellular Signaling That Results in Glycogen Breakdown")), list(list(list(reader_make_constant_shell(makeString("schooling")), reader_make_constant_shell(makeString("GeorgeWashington")), reader_make_constant_shell(makeString("WestPoint-EducationalOrganization")), reader_make_constant_shell(makeString("Enrolled")))), makeString("George Washington Is Enrolled at United States Military Academy")), list(list(list(reader_make_constant_shell(makeString("doesBusinessWith")), reader_make_constant_shell(makeString("Iran")), reader_make_constant_shell(makeString("TranspekIndustryLtd")))), makeString("Iran Does Business With Transpek Industry Ltd.")), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("TwoByFour")), reader_make_constant_shell(makeString("Foldable"))))), makeString("Two-by-four Not Type of Foldable Thing")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("relationExistsInstance")), reader_make_constant_shell(makeString("objectPaidFor")), reader_make_constant_shell(makeString("Buying")), reader_make_constant_shell(makeString("Love"))), reader_make_constant_shell(makeString("False")))), makeString("Love Not Paid for in Buyings")), list(list(list(reader_make_constant_shell(makeString("supplyThroughAmountDuring")), reader_make_constant_shell(makeString("PlanetEarth")), reader_make_constant_shell(makeString("PetroleumProduct")), reader_make_constant_shell(makeString("StraitOfHormuz")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1995)), list(reader_make_constant_shell(makeString("MillionBarrelsPerDay")), FOURTEEN_INTEGER))), makeString("Earth Supply of Petroleum Product via the Strait of Hormuz during 1995 Is 14 Million Barrels per Day")), list(list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("PulmonaryEdema")), list(reader_make_constant_shell(makeString("PoisoningViaSubstanceFn")), reader_make_constant_shell(makeString("Phosgene"))))), makeString("Pulmonary Edema a Symptom of Phosgene Poisoning")), list(list(list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), reader_make_constant_shell(makeString("Terrorist-Harb-3")))), makeString("Lebanese Hezbollah Has Hajj Khalil Harb as Member")), list(list(list(reader_make_constant_shell(makeString("subOrganizations")), reader_make_constant_shell(makeString("AlQaida")), reader_make_constant_shell(makeString("JihadGroup")))), makeString("New Jihad a Suborganization of Al-Qaeda")), list(list(list(reader_make_constant_shell(makeString("relationAllInstance")), reader_make_constant_shell(makeString("flashPoint")), reader_make_constant_shell(makeString("MustardGas")), list(reader_make_constant_shell(makeString("DegreeCelsius")), makeInteger(104)))), makeString("Flash Point of Mustard Gas Is 104&#x2103;")), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("admittedSentence")), list(reader_make_constant_shell(makeString("behaviorCapable")), reader_make_constant_shell(makeString("Guyren")), list(reader_make_constant_shell(makeString("BirthFn")), reader_make_constant_shell(makeString("Guyren"))), reader_make_constant_shell(makeString("birthParent")))))), makeString("'Guyren Howe Is Capable of His Birth' Not a Well-formed Sentence")), list(list(list(reader_make_constant_shell(makeString("sopEventPertainsToObjectOnDate")), reader_make_constant_shell(makeString("OrionAssetWellStartupCriteriaSpecification")), reader_make_constant_shell(makeString("WellProduction-Oil")), reader_make_constant_shell(makeString("Well-105P4-Orion")), list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(40), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(40), list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), EIGHTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("April")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2011))))))), list(reader_make_constant_shell(makeString("SOPEventFn-NoDepth")), reader_make_constant_shell(makeString("OrionAssetWellStartupCriteriaSpecification")), reader_make_constant_shell(makeString("WellProduction-Oil")), reader_make_constant_shell(makeString("Well-105P4-Orion")), list(reader_make_constant_shell(makeString("SecondFn")), makeInteger(40), list(reader_make_constant_shell(makeString("MinuteFn")), makeInteger(40), list(reader_make_constant_shell(makeString("HourFn")), SEVENTEEN_INTEGER, list(reader_make_constant_shell(makeString("DayFn")), EIGHTEEN_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("April")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2011)))))))))), makeString("Oil Production in Orion 105-P4")), list(list(list(reader_make_constant_shell(makeString("objectTypePlayingRoleInTypeHasPartTypeLackingInObjectTypePlayingRoleInEventType")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("locusOfCellularProcess-Cell")), reader_make_constant_shell(makeString("Anaphase")), reader_make_constant_shell(makeString("MitoticSpindle")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("locusOfCellularProcess-Cell")), reader_make_constant_shell(makeString("InterphaseOfEukaryoticCellCycle")))), makeString("Eukaryotic Cells Have Mitotic Spindles during Anaphase but Not during Interphase")), list(list(list(reader_make_constant_shell(makeString("nameString")), reader_make_constant_shell(makeString("Cyc")), makeString("Cyc"))), makeString("Cyc Is Named 'Cyc'")), list(list(list(list(reader_make_constant_shell(makeString("TypeCapableFn")), reader_make_constant_shell(makeString("behaviorCapable"))), reader_make_constant_shell(makeString("Bat-Mammal")), reader_make_constant_shell(makeString("Flying-FlappingWings")), reader_make_constant_shell(makeString("doneBy")))), makeString("Bats Are Capable of Flying by Flapping Wings")), list(list(list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("Currency")), reader_make_constant_shell(makeString("PlantPart")))), makeString("No Currency a Plant Part")), list(list(list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("conceptuallyRelated")), reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("DogFood"))), list(reader_make_constant_shell(makeString("conceptuallyRelated")), reader_make_constant_shell(makeString("DogFood")), reader_make_constant_shell(makeString("Dog"))))), makeString("Either the Concept 'dog' Is Conceptually Related to the Concept 'dog Food' or the Concept 'dog Food' Is Conceptually Related to the Concept 'dog'")), list(list(list(reader_make_constant_shell(makeString("not")), list(list(reader_make_constant_shell(makeString("TypeCapableFn")), reader_make_constant_shell(makeString("behaviorCapable"))), reader_make_constant_shell(makeString("Automobile")), reader_make_constant_shell(makeString("GoingToSleep")), reader_make_constant_shell(makeString("bodilyDoer"))))), makeString("Cars Not Capable of Going to Sleep")), list(list(list(reader_make_constant_shell(makeString("damages")), reader_make_constant_shell(makeString("TerroristAttack-November-19-1995-Islamabad-Pakistan")), list(reader_make_constant_shell(makeString("EmbassyBuildingFn")), reader_make_constant_shell(makeString("Indonesia-TheNation")), reader_make_constant_shell(makeString("CityOfIslamabadPakistan"))))), makeString("Islamabad, Pakistan Terrorist Attack on November 19, 1995 Damaged Indonesian Embassy in Islamabad, Pakistan")), list(list(list(reader_make_constant_shell(makeString("properSubEventTypes")), reader_make_constant_shell(makeString("InterphaseOfEukaryoticCellCycle")), reader_make_constant_shell(makeString("Replication-DNA")))), makeString("Interphase Involves DNA Replication")), list(list(list(reader_make_constant_shell(makeString("sizeParameterOfObject")), reader_make_constant_shell(makeString("PlanetEarth")), list(reader_make_constant_shell(makeString("MetricTon")), makeDouble(6.0E21)))), makeString("Mass of Earth Is 6 &#xD7; 10<sup>21</sup> Metric Tons")), list(list(list(reader_make_constant_shell(makeString("partTypeCount")), list(reader_make_constant_shell(makeString("EntityOfTypeBetweenStagesFn")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("Mitosis")), reader_make_constant_shell(makeString("Prometaphase")), reader_make_constant_shell(makeString("Metaphase"))), reader_make_constant_shell(makeString("CellNucleus")), ZERO_INTEGER)), makeString("Eukaryotic Cells between the Prometaphase and Metaphase Stages of Mitosis Lack Cell Nuclei")), list(list(list(reader_make_constant_shell(makeString("positionOfPersonInOrganization")), reader_make_constant_shell(makeString("MarthaStewart")), reader_make_constant_shell(makeString("MarthaStewartLivingOmnimedia")), reader_make_constant_shell(makeString("OfficerInOrganization")))), makeString("Martha Stewart Holds Position of Officer at Martha Stewart Living Omnimedia")), list(list(list(reader_make_constant_shell(makeString("spokesmanFor")), list(reader_make_constant_shell(makeString("InstanceNamedFn-Ternary")), makeString("Iranian Hezbollah"), reader_make_constant_shell(makeString("Organization")), makeString("1a571fca-17bc-41d9-861b-eeda621be215")), reader_make_constant_shell(makeString("Terrorist-Mojtaba-Bigdeli")))), makeString("Mojtaba Bigdeli a Spokesperson for Iranian Hezbollah")), list(list(list(reader_make_constant_shell(makeString("distanceBetween")), reader_make_constant_shell(makeString("AxialNorthPoleOfEarth")), reader_make_constant_shell(makeString("AxialSouthPoleOfEarth")), list(reader_make_constant_shell(makeString("Mile")), makeDouble(12506.397610602144)))), makeString("Shortest Distance between North Pole and South Pole Is 12,500 Miles")), list(list(list(reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("HezbollahRocketAttacksOnNorthernIsrael-July132006")), reader_make_constant_shell(makeString("LebaneseHizballah")))), makeString("Lebanese Hezbollah Deliberately Performed the July 13th Rocket Attacks on Northern Israel")), list(list(list(reader_make_constant_shell(makeString("ist")), list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)), reader_make_constant_shell(makeString("TimePoint")))), list(reader_make_constant_shell(makeString("numberOfInhabitants")), reader_make_constant_shell(makeString("PlanetEarth")), makeInteger("6233821945")))), makeString("Current World Data Collector Knowledge (in 2000): the Population of Earth Is 6,230,000,000")), list(list(list(reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("subSituations")), reader_make_constant_shell(makeString("Event")), reader_make_constant_shell(makeString("Event")))), makeString("Events Are Part of Events")), list(list(list(reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("WTCTerroristAttackSept2001")), reader_make_constant_shell(makeString("NewYork-State")))), makeString("September 11 Attack on the WTC Happened in New York State")), list(list(list(reader_make_constant_shell(makeString("equals")), reader_make_constant_shell(makeString("MarkTwain")), reader_make_constant_shell(makeString("SamuelClemens")))), makeString("Mark Twain Identical to Samuel Clemens")), list(list(list(reader_make_constant_shell(makeString("citizens-Birth")), reader_make_constant_shell(makeString("IrishRepublic")), reader_make_constant_shell(makeString("Terrorist-Ferris")))), makeString("Martin Ferris a Citizen by Birth of Ireland")), list(list(list(reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("TerroristAttack-January-1-1996-Colombia")), reader_make_constant_shell(makeString("RevolutionaryArmedForcesOfColombia")))), makeString("Revolutionary Armed Forces of Colombia a Perpetrator in Terrorist Attack in Colombia on January 1, 1996")), list(list(list(reader_make_constant_shell(makeString("hasBeliefSystems")), reader_make_constant_shell(makeString("RedArmyFaction")), reader_make_constant_shell(makeString("Communism")))), makeString("Red Army Faction Believes in Communism")), list(list(list(reader_make_constant_shell(makeString("frequentlyInContactWith")), reader_make_constant_shell(makeString("Terrorist-Fazul")), reader_make_constant_shell(makeString("Terrorist-Mohamed-3")))), makeString("Fazul Mohammed Is Frequently in Contact With Ali Mohamed")), list(list(list(reader_make_constant_shell(makeString("partTypeCount")), reader_make_constant_shell(makeString("DuplicatedChromosome")), reader_make_constant_shell(makeString("DNAMolecule")), TWO_INTEGER)), makeString("Duplicated Chromosomes Have 2 DNA Molecules as Parts")), list(list(list(reader_make_constant_shell(makeString("languageSpoken")), reader_make_constant_shell(makeString("JenniferSullivan")), reader_make_constant_shell(makeString("EnglishLanguage")))), makeString("Jennifer Sullivan Speaks English")), list(list(list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Chicken-Meat")), reader_make_constant_shell(makeString("Meat")))), makeString("Chicken Meat a Type of Meat")), list(list(list(reader_make_constant_shell(makeString("primarySupervisor")), reader_make_constant_shell(makeString("Brett")), reader_make_constant_shell(makeString("ABelasco")))), makeString("Brett Summers's Primary Supervisor Is Alan Belasco")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("Mitosis")), reader_make_constant_shell(makeString("ChromosomeLinesUpAtMetaphasePlate")), reader_make_constant_shell(makeString("Anaphase")))), makeString("Lining Up of Chromosome along the Metaphase Plate Required for Anaphase to Take Place in Mitosis")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("TerroristAttack-March-31-2003-Bologna-Italy")), list(reader_make_constant_shell(makeString("UnsuccessfulAttemptToFn")), list(reader_make_constant_shell(makeString("ProperSubcollectionNamedFn-Ternary")), makeString("attack the headquarters of IBM in Bologna"), reader_make_constant_shell(makeString("ActionOnObject")), makeString("33f6a954-f4ed-11d9-9bea-0002b3a85b0b"))))), makeString("Bologna, Italy Terrorist Attack on March 31, 2003 an Unsuccessful Attempt to Perform Attack the Headquarters of IBM in Bologna")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("relationExistsExists")), reader_make_constant_shell(makeString("ailmentConditionAffects")), reader_make_constant_shell(makeString("TesticularCancer")), reader_make_constant_shell(makeString("AdultFemaleHuman"))), reader_make_constant_shell(makeString("False")))), makeString("No Testicular Cancer Afflicts Any Woman")), list(list(list(reader_make_constant_shell(makeString("preferredNameString")), reader_make_constant_shell(makeString("Terrorist-Abayla")), makeString("Hassan Abayla"))), makeString("'Hassan Abayla' a Preferred Name for Hassan Abayla")), list(list(list(reader_make_constant_shell(makeString("laterThan")), reader_make_constant_shell(makeString("Tomorrow-Indexical")), reader_make_constant_shell(makeString("Today-Indexical")))), makeString("Tomorrow Later than Today")), list(list(list(reader_make_constant_shell(makeString("evaluate")), makeString("06-21-2004"), list(reader_make_constant_shell(makeString("DateEncodeStringFn")), makeString("MM-DD-YYYY"), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(21), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("June")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004))))))), makeString("The String Encoding June 21, 2004 Using the Template MM-DD-YYYY Is 06-21-2004")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("Mitosis")), reader_make_constant_shell(makeString("SisterChromatidsCutByEnzyme-Mitosis")), reader_make_constant_shell(makeString("Telophase")))), makeString("Sister Chromatid Separation Required for Telophase to Take Place in Mitosis")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("MCheckpoint")), reader_make_constant_shell(makeString("Anaphase")))), makeString("M Checkpoint Required for Anaphase to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("residenceOfOrganization")), reader_make_constant_shell(makeString("HarakatUl-Mujahedin")), reader_make_constant_shell(makeString("Pakistan")))), makeString("Harakat Ul-Mujahedin's Headquarters in Pakistan")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Terrorist-al-Zarqawi")), reader_make_constant_shell(makeString("EthnicGroupOfArabs")))), makeString("Abu Musab al-Zarqawi an Arab")), list(list(list(reader_make_constant_shell(makeString("relationAllInstance")), reader_make_constant_shell(makeString("awardSignifiesAchievementInSport")), reader_make_constant_shell(makeString("HeismanAward")), reader_make_constant_shell(makeString("Football-American")))), makeString("Heisman Award Signifies Achievement in Football")), list(list(list(reader_make_constant_shell(makeString("evaluate")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("SquareRootFn")), makeInteger(144)))), makeString("Square Root of 144 = 12")), list(list(list(reader_make_constant_shell(makeString("equivalentRolePlayersOfType-SitTypeToSubSitType")), reader_make_constant_shell(makeString("InterphaseOfEukaryoticCellCycle")), reader_make_constant_shell(makeString("actors")), reader_make_constant_shell(makeString("SPhase")), list(reader_make_constant_shell(makeString("SubEventRoleFn")), reader_make_constant_shell(makeString("outputsCreated"))), reader_make_constant_shell(makeString("DuplicatedChromosome")))), makeString("Duplicated Chromosome That Plays Output Created Role in S Phase during Interphase to Play Actor Role in That Interphase")), list(list(list(reader_make_constant_shell(makeString("mostGeneralCoveringOfEventType")), reader_make_constant_shell(makeString("InterphaseOfEukaryoticCellCycle")), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("G1Phase")), reader_make_constant_shell(makeString("SPhase")), reader_make_constant_shell(makeString("G2Phase"))))), makeString("The most General Way to Decompose Interphase Is as a Sequence of G&#x2081; Phase, S Phase, and G&#x2082; Phase")), list(list(list(reader_make_constant_shell(makeString("hates")), reader_make_constant_shell(makeString("AbuZubaydah")), reader_make_constant_shell(makeString("GeorgeWBush")))), makeString("Abu Zubaydah Hates George W. Bush")), list(list(list(reader_make_constant_shell(makeString("sitTypeHasSubSitTypeUsingOutputFromSubSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("Anaphase")), reader_make_constant_shell(makeString("InterphaseOfEukaryoticCellCycle")), reader_make_constant_shell(makeString("DuplicatedChromosome")))), makeString("In Eukaryotic Cell Cycles, Duplicated Chromosomes Created during Interphase Subsequently Used in Anaphase")), list(list(list(reader_make_constant_shell(makeString("relationAllExists")), reader_make_constant_shell(makeString("physicalDecompositions")), reader_make_constant_shell(makeString("EukaryoticChromosome")), reader_make_constant_shell(makeString("Chromatin")))), makeString("Eukaryotic Chromosomes Contain Chromatin")), list(list(list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("BlackColor")), reader_make_constant_shell(makeString("Swan")))), makeString("No Swan Black")), list(list(list(reader_make_constant_shell(makeString("ist")), list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now")))), list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("hasBeliefSystems")), reader_make_constant_shell(makeString("ChrisDeaton")), reader_make_constant_shell(makeString("Christianity")))))), makeString("Cyc's Knowledge about Cyclists (at Present): Chris Deaton Does Not Believe in Christianity")), list(list(list(reader_make_constant_shell(makeString("majorReligions")), reader_make_constant_shell(makeString("India")), reader_make_constant_shell(makeString("Hinduism")))), makeString("Hinduism a Major Religion in India")), list(list(list(reader_make_constant_shell(makeString("animalInjuredIn")), reader_make_constant_shell(makeString("HizballahUSEmbassyAttack-1984")), reader_make_constant_shell(makeString("Person-91")))), makeString("Reginald Bartholomew Injured during Beirut Terrorist Attack on September 20, 1984")), list(list(list(reader_make_constant_shell(makeString("evaluate")), SEVEN_INTEGER, list(reader_make_constant_shell(makeString("QuotientFn")), list(reader_make_constant_shell(makeString("DifferenceFn")), list(reader_make_constant_shell(makeString("TimesFn")), FIVE_INTEGER, SIX_INTEGER), NINE_INTEGER), list(reader_make_constant_shell(makeString("PlusFn")), ONE_INTEGER, TWO_INTEGER)))), makeString("((5 &#xD7; 6) &#x2212; 9) &#xF7; (1 + 2) = 7")), list(list(list(reader_make_constant_shell(makeString("relationAllInstanceInstance-Conditional-CeterisParibus")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("hasPartTypes")), reader_make_constant_shell(makeString("EarlyMitoticSpindle")), list(reader_make_constant_shell(makeString("QuantifiedVersionOfBinaryPredicateFn")), reader_make_constant_shell(makeString("relationInstanceExists")), list(reader_make_constant_shell(makeString("InverseBinaryPredicateFn")), list(reader_make_constant_shell(makeString("PresentTenseVersionFn")), reader_make_constant_shell(makeString("locusOfCellularProcess-Cell"))))), reader_make_constant_shell(makeString("Prophase")))), makeString("Eukaryotic Cell With Early Mitotic Spindle Undergoing Prophase")), list(list(list(reader_make_constant_shell(makeString("objectTypePlayingRoleInTypeHasPartTypeLackingInObjectTypePlayingRoleInEventType")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("locusOfCellularProcess-Cell")), reader_make_constant_shell(makeString("G1Phase")), reader_make_constant_shell(makeString("CellNucleus")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("locusOfCellularProcess-Cell")), reader_make_constant_shell(makeString("Anaphase")))), makeString("Eukaryotic Cells Have Cell Nuclei during G&#x2081; Phase but Not during Anaphase")), list(list(list(reader_make_constant_shell(makeString("organizationKeyMembers")), reader_make_constant_shell(makeString("LebaneseHizballah")), reader_make_constant_shell(makeString("Terrorist-Mohtashemi")))), makeString("Ali Mohtashemi-Pour a Key Member of Lebanese Hezbollah")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("brothers")), reader_make_constant_shell(makeString("MarkTwain")), reader_make_constant_shell(makeString("SamuelClemens"))), reader_make_constant_shell(makeString("False")))), makeString("Mark Twain's Brothers Do Not Include Samuel Clemens")), list(list(list(reader_make_constant_shell(makeString("hasLeadershipPosition")), reader_make_constant_shell(makeString("Imhausen-ChemieAG")), reader_make_constant_shell(makeString("JurgenHippenstiel-Imhausen")))), makeString("Jurgen Hippenstiel-Imhausen Has Leadership Responsibilities in Imhausen-Chemie")), list(list(list(reader_make_constant_shell(makeString("birthDate")), reader_make_constant_shell(makeString("OsamaBinLaden")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1957)))), makeString("Osama Bin Laden Born in 1957")), list(list(list(reader_make_constant_shell(makeString("residenceOfOrganization")), reader_make_constant_shell(makeString("DeltaGScientific")), reader_make_constant_shell(makeString("RepublicOfSouthAfrica")))), makeString("Delta G Scientific's Headquarters in South Africa")), list(list(list(reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("TerroristAttack-November-8-2003-Riyadh-Saudi-Arabia")), reader_make_constant_shell(makeString("AlQaida")))), makeString("Al-Qaeda a Perpetrator in Riyadh, Saudi Arabia Terrorist Attack on November 8, 2003")), list(list(list(reader_make_constant_shell(makeString("distanceBetween")), list(reader_make_constant_shell(makeString("TerritoryFn")), reader_make_constant_shell(makeString("CityOfAustinTX"))), list(reader_make_constant_shell(makeString("TerritoryFn")), reader_make_constant_shell(makeString("CityOfLosAngelesCA"))), list(reader_make_constant_shell(makeString("Mile")), makeDouble(1241.7095986680342)))), makeString("Shortest Distance between Austin and Los Angeles Is 1240 Miles")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("MitoticPhaseOfCellCycle")), reader_make_constant_shell(makeString("SisterChromatidsCutByEnzyme-Mitosis")), reader_make_constant_shell(makeString("Telophase")))), makeString("Sister Chromatid Separation Required for Telophase to Take Place in M Phase")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("MitoticPhaseOfCellCycle")), reader_make_constant_shell(makeString("ChromosomeLinesUpAtMetaphasePlate")), reader_make_constant_shell(makeString("Anaphase")))), makeString("Lining Up of Chromosome along the Metaphase Plate Required for Anaphase to Take Place in M Phase")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("G2Checkpoint")), reader_make_constant_shell(makeString("MitoticPhaseOfCellCycle")))), makeString("G2 Checkpoint Required for M Phase to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("coveringOfEventType")), reader_make_constant_shell(makeString("Anaphase")), list(reader_make_constant_shell(makeString("TheList")), reader_make_constant_shell(makeString("AnaphaseA")), reader_make_constant_shell(makeString("AnaphaseB"))))), makeString("Anaphase a Sequence of Anaphase A, Anaphase B")), list(list(list(reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("Stinger")), reader_make_constant_shell(makeString("Scorpion")))), makeString("No Stinger a Scorpion")), list(list(list(reader_make_constant_shell(makeString("ratioOfCollectionToDifferentiatedCollection")), reader_make_constant_shell(makeString("Percent")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Bombing")), reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("NorthernIreland"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("TerroristAttack")), reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("IrishRepublicanArmy"))), makeDouble(3.1))), makeString("Percent of Instances of Northern Ireland Bomb Attacks That Are Also Terrorist Attacks Performed by Irish Republican Army Are 3.1")), list(list(list(reader_make_constant_shell(makeString("placeOfDeath")), reader_make_constant_shell(makeString("Terrorist-al-Banna")), reader_make_constant_shell(makeString("CityOfBaghdadIraq")))), makeString("Abu Nidal Died in Baghdad, Iraq")), list(list(list(reader_make_constant_shell(makeString("not")), list(reader_make_constant_shell(makeString("admittedSentence")), list(reader_make_constant_shell(makeString("biologicalFather")), reader_make_constant_shell(makeString("Cyc")), reader_make_constant_shell(makeString("Lenat")))))), makeString("'Doug Lenat Is the Biological Father of Cyc.' Not a Well-formed Sentence")), list(list(list(reader_make_constant_shell(makeString("symptomOfAilment")), reader_make_constant_shell(makeString("UpperRespiratoryInfection")), reader_make_constant_shell(makeString("AnthraxInfection")))), makeString("Upper Respiratory Infections a Symptom of Anthrax")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("Mitosis")), reader_make_constant_shell(makeString("MCheckpoint")), reader_make_constant_shell(makeString("Anaphase")))), makeString("M Checkpoint Required for Anaphase to Take Place in Mitosis")), list(list(list(reader_make_constant_shell(makeString("relationMostExists")), reader_make_constant_shell(makeString("fanOf")), reader_make_constant_shell(makeString("UnitedStatesPerson")), reader_make_constant_shell(makeString("Athlete")))), makeString("Most Americans Fans of Athletes")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("ChromosomalDuplication-Eukaryotic")), reader_make_constant_shell(makeString("SPhase")))), makeString("Chromosomal Duplication Required for S Phase to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("precursors-Chemical")), reader_make_constant_shell(makeString("VX-NerveAgent")), reader_make_constant_shell(makeString("Sulfur")))), makeString("Sulfur Is Chemical Precursor for VX")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("EarlyMitoticSpindleAssembly")), reader_make_constant_shell(makeString("Prophase")))), makeString("Early Mitotic Spindle Formation Required for Prophase to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("relationAllInstanceInstance-Conditional-CeterisParibus")), reader_make_constant_shell(makeString("EukaryoticCell")), reader_make_constant_shell(makeString("hasPartTypes")), reader_make_constant_shell(makeString("MicrofilamentRing")), list(reader_make_constant_shell(makeString("QuantifiedVersionOfBinaryPredicateFn")), reader_make_constant_shell(makeString("relationInstanceExists")), list(reader_make_constant_shell(makeString("InverseBinaryPredicateFn")), list(reader_make_constant_shell(makeString("PresentTenseVersionFn")), reader_make_constant_shell(makeString("locusOfCellularProcess-Cell"))))), reader_make_constant_shell(makeString("Cytokinesis")))), makeString("Eukaryotic Cell With Microfilament Ring Undergoing Cytokinesis")), list(list(list(reader_make_constant_shell(makeString("hasBeliefSystems")), reader_make_constant_shell(makeString("MuhammadTheProphet")), reader_make_constant_shell(makeString("Islam")))), makeString("Muhammad Believes in Islam")), list(list(list(reader_make_constant_shell(makeString("recommendedFoodOrDrinkAllowanceForBLO")), reader_make_constant_shell(makeString("ReginaldQOinkers-ThePig")), list(reader_make_constant_shell(makeString("FoodOrDrinkForFn")), reader_make_constant_shell(makeString("PotbelliedPig"))), list(list(reader_make_constant_shell(makeString("PerFn")), reader_make_constant_shell(makeString("Cup-UnitOfVolume")), reader_make_constant_shell(makeString("DaysDuration"))), makeDouble(1.5), TWO_INTEGER))), makeString("It Is Recommended That Reginald Q. Oinkers Consume 1.5&#x2013;2 Cups per Day of Food or Drink for Potbellied Pigs")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("BotanicalCellWallFormation")), reader_make_constant_shell(makeString("IncorporationOfVesicleMaterialsIntoCellPlate")), reader_make_constant_shell(makeString("CellPlateFormation")))), makeString("Incorporation of Materials from Vesicles into the Cell Plate Required for Cell Plate Formation to Take Place in Botanical Cell Wall Formation")), list(list(list(reader_make_constant_shell(makeString("probability")), list(reader_make_constant_shell(makeString("or")), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Lenat")), reader_make_constant_shell(makeString("OntologicalEngineer"))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Lenat")), reader_make_constant_shell(makeString("ComputerProgrammer")))), makeDouble(0.9999469432))), makeString("Virtually Certain That Doug Lenat Is Ontological Engineer or Developer")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), list(reader_make_constant_shell(makeString("ChangeOnSlotFn")), list(reader_make_constant_shell(makeString("QuantitySlotForArg2Fn")), reader_make_constant_shell(makeString("DNAStuff")), reader_make_constant_shell(makeString("amountPresentAt")))), reader_make_constant_shell(makeString("G2Phase")))), makeString("Change in Amount of DNA Present Required for G&#x2082; Phase to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("hasBeliefSystems")), reader_make_constant_shell(makeString("HillaryClinton")), reader_make_constant_shell(makeString("ProLifeIdeology"))), reader_make_constant_shell(makeString("False")))), makeString("Hillary Clinton Does Not Believe in Pro-life Ideology")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Sarin")), reader_make_constant_shell(makeString("NerveAgentType")))), makeString("Sarin a Nerve Agent")), list(list(list(reader_make_constant_shell(makeString("causes-SitTypeSitType")), reader_make_constant_shell(makeString("PhosphorylationCascade")), reader_make_constant_shell(makeString("CellularLevelResponseToSignal-Amplified")))), makeString("Phosphorylation Cascades Cause Amplified Cellular Response")), list(list(list(reader_make_constant_shell(makeString("biologicalFunction")), reader_make_constant_shell(makeString("Ribosome")), reader_make_constant_shell(makeString("CellularProteinSynthesis")), reader_make_constant_shell(makeString("locusOfCellularProcess-CellPart")))), makeString("Cellular Protein Synthesis Takes Place in Ribosomes")), list(list(list(reader_make_constant_shell(makeString("parts")), reader_make_constant_shell(makeString("ContinentOfAustralia")), reader_make_constant_shell(makeString("CityOfCanberraAustralia")))), makeString("Canberra, Australia Is Part of Australia")), list(list(list(reader_make_constant_shell(makeString("inheritRolePlayersOfType-SubSitTypeToSubSitType")), reader_make_constant_shell(makeString("BrushingOnesTeeth")), list(reader_make_constant_shell(makeString("LookingForObjectOfTypeFn")), reader_make_constant_shell(makeString("ToothpasteTube"))), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("TeethCleaning")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("Person")))), makeString("In Brushing Teeth, Person That Looks for a Toothpaste Tube Also Cleans Teeth")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Trichloroethylene")), reader_make_constant_shell(makeString("ChemicalAgentType")))), makeString("Trichloroethylene a Chemical Warfare Agent")), list(list(list(reader_make_constant_shell(makeString("relationAllExistsCount")), reader_make_constant_shell(makeString("anatomicalParts")), reader_make_constant_shell(makeString("Beetle")), reader_make_constant_shell(makeString("Leg")), SIX_INTEGER)), makeString("Beetle Has Six Legs")), list(list(list(reader_make_constant_shell(makeString("negativeVestedInterest")), reader_make_constant_shell(makeString("AlQaida")), reader_make_constant_shell(makeString("Spain")))), makeString("Al-Qaeda Opposes Spain")), list(list(list(reader_make_constant_shell(makeString("hasBeenIn")), reader_make_constant_shell(makeString("Terrorist-al-Banna")), reader_make_constant_shell(makeString("Libya")))), makeString("Abu Nidal Has Been in Libya")), list(list(list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("Bacon")), reader_make_constant_shell(makeString("Pork")))), makeString("Bacon a Type of Pork")), list(list(list(reader_make_constant_shell(makeString("birthPlace")), reader_make_constant_shell(makeString("JamesCurtis")), reader_make_constant_shell(makeString("CityOfAustinTX")))), makeString("James Curtis Born in Austin")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("G2Checkpoint")), reader_make_constant_shell(makeString("Mitosis")))), makeString("G2 Checkpoint Required for Mitosis to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("symptomOfAilment")), list(reader_make_constant_shell(makeString("LevelOfSubstanceTypeInSysTypeFn")), reader_make_constant_shell(makeString("Acetylcholinesterase")), reader_make_constant_shell(makeString("HomoSapiens")), reader_make_constant_shell(makeString("LowLevelOfStandardSubstanceInSystem"))), list(reader_make_constant_shell(makeString("PoisoningViaSubstanceFn")), reader_make_constant_shell(makeString("Sarin"))))), makeString("Lower than Normal Cholinesterase Enzyme Level a Symptom of Sarin Poisoning")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("inhibitionOfSitTypeAffectsSlot")), reader_make_constant_shell(makeString("MCheckpoint")), list(reader_make_constant_shell(makeString("RestrictionOnSlotFn")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("rateOfEvent")))), reader_make_constant_shell(makeString("True")))), makeString("Interfering With M Checkpoint Would Affect Rate of the Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("HotSauce")), reader_make_constant_shell(makeString("BlandTaste"))), reader_make_constant_shell(makeString("False")))), makeString("Hot Sauce Not Bland")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Texas-State")), reader_make_constant_shell(makeString("State-UnitedStates")))), makeString("Texas a U.S. State")), list(list(list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("Methyldichloroarsine")), reader_make_constant_shell(makeString("BlisterAgentType")))), makeString("Methyldichloroarsine a Blister Agent")), list(list(list(reader_make_constant_shell(makeString("bordersOn")), reader_make_constant_shell(makeString("Germany")), reader_make_constant_shell(makeString("France")))), makeString("Germany Borders on France")), list(list(list(reader_make_constant_shell(makeString("hasDegreeInField")), reader_make_constant_shell(makeString("Terrorist-Alamoudi")), reader_make_constant_shell(makeString("MastersDegree")), reader_make_constant_shell(makeString("BusinessAdministration")))), makeString("Abdulrahman Alamoudi Has Masters Degree in Business Administration")), list(list(list(reader_make_constant_shell(makeString("relationExistsAll")), reader_make_constant_shell(makeString("nontangentialProperPartOfSpaceRegion")), reader_make_constant_shell(makeString("HomogeneousExtendedSpaceRegion")), reader_make_constant_shell(makeString("HomogeneousExtendedSpaceRegion")))), makeString("RCC Region Contains RCC Regions")), list(list(list(reader_make_constant_shell(makeString("movieReleaseYear")), reader_make_constant_shell(makeString("ForYourEyesOnly-TheMovie")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1981)))), makeString("'For Your Eyes Only' Released in 1981")), list(list(list(reader_make_constant_shell(makeString("necessaryConditionFor-InSitType")), reader_make_constant_shell(makeString("EukaryoticCellCycle")), reader_make_constant_shell(makeString("ReplicatedChromosomeCondensation")), reader_make_constant_shell(makeString("Prometaphase")))), makeString("Replicated Chromosome Condensation Required for Prometaphase to Take Place in Eukaryotic Cell Cycle")), list(list(list(reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("TerroristAttack-November-19-2001-Bilbao-Spain")), reader_make_constant_shell(makeString("Spain")))), makeString("Bilbao Bombing on November 19, 2001 Happened in Spain")), list(list(list(reader_make_constant_shell(makeString("sentenceTruth")), list(reader_make_constant_shell(makeString("owns")), reader_make_constant_shell(makeString("DonaldTrump")), reader_make_constant_shell(makeString("PacificOcean"))), reader_make_constant_shell(makeString("False")))), makeString("Donald Trump Does Not Own Pacific Ocean")), list(list(list(reader_make_constant_shell(makeString("sitTypeHasSubSitTypeUsingOutputFromSubSitType")), reader_make_constant_shell(makeString("MitoticPhaseOfCellCycle")), reader_make_constant_shell(makeString("Cytokinesis")), reader_make_constant_shell(makeString("Telophase")), reader_make_constant_shell(makeString("CellNucleus")))), makeString("In M Phase, Cell Nuclei Created during Telophase Subsequently Used in Cytokinesis")), list(list(list(reader_make_constant_shell(makeString("eventOccursAt")), reader_make_constant_shell(makeString("TerroristAttack-July-9-2002-Caldas-Colombia")), reader_make_constant_shell(makeString("Colombia")))), makeString("Caldas, Colombia Terrorist Attack on July 9, 2002 Happened in Colombia")), list(list(list(reader_make_constant_shell(makeString("properSubEventTypes")), reader_make_constant_shell(makeString("MitoticPhaseOfCellCycle")), list(reader_make_constant_shell(makeString("DecreaseOnSlotFn")), list(reader_make_constant_shell(makeString("QuantitySlotForArg2Fn")), reader_make_constant_shell(makeString("MPF")), reader_make_constant_shell(makeString("amountPresentAt")))))), makeString("M Phase Involves Decrease in Quantity of MPF Present")), list(list(list(reader_make_constant_shell(makeString("causes-SubSitTypeSubSitType")), reader_make_constant_shell(makeString("ChemicalInteraction")), reader_make_constant_shell(makeString("CatalystSeparationFromActivator")), list(reader_make_constant_shell(makeString("EndingOfSitTypeFn")), reader_make_constant_shell(makeString("CatalyticActivation"))))), makeString("In Chemical Interactions, Separation of a Catalytic Molecule from Its Activator Causes Ending of Catalytic Activation")), list(list(list(reader_make_constant_shell(makeString("ist")), list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("CyclistsMt")), list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1993))), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("September")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1999)))), reader_make_constant_shell(makeString("Null-TimeParameter")))), list(reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("JonC")), reader_make_constant_shell(makeString("GraduateStudent"))))), makeString("Cyc's Knowledge about Cyclists (time Period between September 1993 and September 1999): Jon Curtis a Graduate Student")) });
    }

    @Override
    public void declareFunctions() {
        declare_pph_headline_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_headline_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_headline_file();
    }

    static {













































    }
}

/**
 * Total time: 348 ms
 */
