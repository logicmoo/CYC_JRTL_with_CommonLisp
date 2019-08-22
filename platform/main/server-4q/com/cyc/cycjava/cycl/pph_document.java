package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_document extends SubLTranslatedFile {
    public static final SubLFile me = new pph_document();

    public static final String myName = "com.cyc.cycjava.cycl.pph_document";

    public static final String myFingerPrint = "bf1ac1f054bc08e035028335c774f0fbb85e6e48a9fdc61bfd074cd1eb5d636c";

    // defparameter
    public static final SubLSymbol $pph_summary_max_sentences_for_same_pred$ = makeSymbol("*PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED*");

    // defparameter
    public static final SubLSymbol $pph_track_summary_sourcesP$ = makeSymbol("*PPH-TRACK-SUMMARY-SOURCES?*");

    // defparameter
    // LISTP of sources for facts used in the current summary.
    public static final SubLSymbol $pph_summary_sources$ = makeSymbol("*PPH-SUMMARY-SOURCES*");

    // defparameter
    // ALIST-P mapping sentences to their lists of sources
    private static final SubLSymbol $pph_summary_sentence_sources$ = makeSymbol("*PPH-SUMMARY-SENTENCE-SOURCES*");

    // deflexical
    private static final SubLSymbol $pph_coordination_preds$ = makeSymbol("*PPH-COORDINATION-PREDS*");

    // deflexical
    /**
     * Don't coordinate the specified args for these predicates -- they don't do
     * well.
     */
    private static final SubLSymbol $pph_coordination_preds_blacklist$ = makeSymbol("*PPH-COORDINATION-PREDS-BLACKLIST*");

    // defparameter
    public static final SubLSymbol $pph_assume_preds_allow_coordinationP$ = makeSymbol("*PPH-ASSUME-PREDS-ALLOW-COORDINATION?*");

    // deflexical
    private static final SubLSymbol $pph_attempt_reverse_consolidationP$ = makeSymbol("*PPH-ATTEMPT-REVERSE-CONSOLIDATION?*");

    // Internal Constants
    public static final SubLSymbol PPH_SENTENCE_P = makeSymbol("PPH-SENTENCE-P");

    private static final SubLSymbol PPH_SENTENCE_FROM_ASSERTION = makeSymbol("PPH-SENTENCE-FROM-ASSERTION");



    private static final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");





    private static final SubLSymbol PPH_CHECK_FOR_ISOMORPHIC_ASSERTION = makeSymbol("PPH-CHECK-FOR-ISOMORPHIC-ASSERTION");

    private static final SubLObject $const7$QuantificationalRuleMacroPredicat = reader_make_constant_shell(makeString("QuantificationalRuleMacroPredicate-Canonical"));



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$MtTimeDimFn = reader_make_constant_shell(makeString("MtTimeDimFn"));

    private static final SubLFloat $float$2_5 = makeDouble(2.5);

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $$$other_ = makeString("other ");

    private static final SubLObject $$plural = reader_make_constant_shell(makeString("plural"));

    private static final SubLString $$$others = makeString("others");

    private static final SubLSymbol $sym16$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");

    private static final SubLSymbol $sym17$SPECS_FN_NAT_ = makeSymbol("SPECS-FN-NAT?");

    private static final SubLSymbol PPH_MAKE_TYPE_LEVEL = makeSymbol("PPH-MAKE-TYPE-LEVEL");

    private static final SubLSymbol PPH_CORE_TERM = makeSymbol("PPH-CORE-TERM");



    private static final SubLList $list21 = list(list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("ANY"), reader_make_constant_shell(makeString("TheCoordinationSet")))), list(reader_make_constant_shell(makeString("genls")), list(makeKeyword("ANY"), reader_make_constant_shell(makeString("TheCoordinationSet")))), list(reader_make_constant_shell(makeString("bordersOn")), list(makeKeyword("ANY"), reader_make_constant_shell(makeString("TheCoordinationSet")))), list(reader_make_constant_shell(makeString("politiesBorderEachOther")), list(makeKeyword("ANY"), reader_make_constant_shell(makeString("TheCoordinationSet")))), list(reader_make_constant_shell(makeString("internationalOrganizationMemberCountries")), list(makeKeyword("ANY"), reader_make_constant_shell(makeString("TheCoordinationSet")))), list(reader_make_constant_shell(makeString("ist")), list(ONE_INTEGER, reader_make_constant_shell(makeString("TheCoordinationSet"))), list(TWO_INTEGER, reader_make_constant_shell(makeString("and")))));

    public static final SubLList $list22 = list(cons(reader_make_constant_shell(makeString("conceptuallyRelated")), makeKeyword("ANY")), list(reader_make_constant_shell(makeString("between")), ONE_INTEGER, TWO_INTEGER), list(reader_make_constant_shell(makeString("collectionOverlapFraction")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("connectedAtEnd")), makeKeyword("ANY")), cons(reader_make_constant_shell(makeString("affiliatedWith")), makeKeyword("ANY")));

    public static final SubLList $list23 = list(makeSymbol("ARGNUM"), makeSymbol("THIS-FN"));



    private static final SubLObject $$CycLSentence = reader_make_constant_shell(makeString("CycLSentence"));

    private static final SubLSymbol $sym26$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    private static final SubLObject $$TheCoordinationSet = reader_make_constant_shell(makeString("TheCoordinationSet"));

    private static final SubLString $str28$Cached_demerits__D_for__S = makeString("Cached demerits ~D for ~S");

    private static final SubLObject $$QuantitySlot = reader_make_constant_shell(makeString("QuantitySlot"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));



    private static final SubLSymbol PPH_RM_CYCL = makeSymbol("PPH-RM-CYCL");



    private static final SubLString $str34$Failed_to_paraphrase__S = makeString("Failed to paraphrase ~S");

    private static final SubLString $str35$Probably_too_many_demerits_____S = makeString("Probably too many demerits:~% ~S");

    private static final SubLSymbol $sym36$PPH_SENTENCES_SURFACE_EQUAL_MODULO_PRONOUNS_ = makeSymbol("PPH-SENTENCES-SURFACE-EQUAL-MODULO-PRONOUNS?");

    private static final SubLString $str37$__Attempting_to_consolidate_parag = makeString("~&Attempting to consolidate paragraph sentences.~%");

    private static final SubLString $str38$Performed_reverse_consolidation__ = makeString("Performed reverse consolidation!!");

    private static final SubLString $str39$__Attempting_to_consolidate____S_ = makeString("~&Attempting to consolidate~% ~S~% ~S");

    private static final SubLString $str40$Differ_only_in_subject_____S____S = makeString("Differ only in subject:~% ~S~% ~S");

    private static final SubLString $str41$Introducing_relative_clause_to_co = makeString("Introducing relative clause to consolidate~% ~S~% and ~S");

    private static final SubLString $str42$Result___S = makeString("Result: ~S");



    private static final SubLString $str44$Conjoining__S___and__S = makeString("Conjoining ~S~% and ~S");

    private static final SubLString $str45$Introduced_restrictive_relative_c = makeString("Introduced restrictive relative clause:~% ~S");



    private static final SubLSymbol POSSIBLY_CONVERT_SUMMARY_SENTENCE_TO_CYCL = makeSymbol("POSSIBLY-CONVERT-SUMMARY-SENTENCE-TO-CYCL");

    private static final SubLObject $$followsFromPrecedingDiscourse = reader_make_constant_shell(makeString("followsFromPrecedingDiscourse"));



    private static final SubLString $str50$Can_t_make_a_summary_with_no_inpu = makeString("Can't make a summary with no input.");







    private static final SubLString $str54$Failed_to_generate__S = makeString("Failed to generate ~S");

    private static final SubLString $str55$_ = makeString("(");

    private static final SubLString $str56$_similar_sentences_ = makeString(" similar sentences)");



    private static final SubLString $str58$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLString $str59$Can_t_truncate__S = makeString("Can't truncate ~S");

    private static final SubLObject $$BeAux = reader_make_constant_shell(makeString("BeAux"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLSymbol $sym63$PPH_PROPER_SPEC_ = makeSymbol("PPH-PROPER-SPEC?");

    public static SubLObject pph_paragraph_p(final SubLObject obj) {
        return pph_phrase.pph_phrase_p(obj, UNPROVIDED);
    }

    public static SubLObject new_pph_paragraph(SubLObject topic, SubLObject pph_sentences) {
        if (topic == UNPROVIDED) {
            topic = NIL;
        }
        if (pph_sentences == UNPROVIDED) {
            pph_sentences = NIL;
        }
        SubLObject cdolist_list_var = pph_sentences;
        SubLObject v_pph_sentence = NIL;
        v_pph_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != pph_sentence.pph_sentence_p(v_pph_sentence) : "pph_sentence.pph_sentence_p(v_pph_sentence) " + "CommonSymbols.NIL != pph_sentence.pph_sentence_p(v_pph_sentence) " + v_pph_sentence;
            cdolist_list_var = cdolist_list_var.rest();
            v_pph_sentence = cdolist_list_var.first();
        } 
        final SubLObject paragraph = pph_data_structures.new_pph_phrase(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != topic) {
            pph_paragraph_set_topic(paragraph, topic);
        }
        pph_phrase.set_pph_phrase_dtrs_from_list(paragraph, pph_sentences, UNPROVIDED);
        return paragraph;
    }

    public static SubLObject pph_paragraph_copy(final SubLObject old_paragraph, SubLObject target) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (NIL == target) {
            target = new_pph_paragraph(UNPROVIDED, UNPROVIDED);
        }
        if (old_paragraph.equalp(target)) {
            return target;
        }
        if (NIL != pph_phrase.pph_phrase_dtrs(old_paragraph)) {
            SubLObject sentence_copies = NIL;
            SubLObject dtr_num = ZERO_INTEGER;
            if (document.sign_constituents(old_paragraph).isVector()) {
                final SubLObject vector_var = document.sign_constituents(old_paragraph);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject sentence;
                SubLObject sentence_copy;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    sentence = aref(vector_var, element_num);
                    sentence_copy = (NIL != pph_sentence.pph_sentence_p(sentence)) ? pph_sentence.pph_sentence_copy(sentence, UNPROVIDED) : sentence;
                    sentence_copies = cons(sentence_copy, sentence_copies);
                    dtr_num = add(dtr_num, ONE_INTEGER);
                }
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(target, nreverse(sentence_copies), UNPROVIDED);
        } else {
            pph_phrase.pph_phrase_set_dtrs(target, NIL);
        }
        pph_paragraph_set_topic(target, pph_paragraph_topic(old_paragraph));
        return target;
    }

    public static SubLObject pph_summary_paragraph_from_assertions(final SubLObject fort, final SubLObject summary_assertions) {
        final SubLObject cycl_sentences = Mapping.mapcar(PPH_SENTENCE_FROM_ASSERTION, summary_assertions);
        return pph_summary_paragraph_from_cycl_sentences(fort, cycl_sentences);
    }

    public static SubLObject pph_test_paragraph_from_cycl_sentences(final SubLObject fort, final SubLObject summary_cycl_sentences, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject stream) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            final SubLObject paragraph = pph_summary_paragraph_from_cycl_sentences(fort, summary_cycl_sentences);
            pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
            pph_paragraph_print(paragraph, stream);
            return paragraph;
        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_summary_paragraph_from_cycl_sentences(final SubLObject fort, final SubLObject summary_cycl_sentences) {
        final SubLObject processed_cycl_sentences = pph_process_cycl_sentences_for_summary(summary_cycl_sentences);
        SubLObject pph_sentences = NIL;
        SubLObject cdolist_list_var = processed_cycl_sentences;
        SubLObject summary_cycl = NIL;
        summary_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentence_cycl = pph_check_for_isomorphic_assertion(fact_sheets.summary_sentence_cycl(summary_cycl), UNPROVIDED);
            pph_sentences = cons(pph_sentence.pph_sentence_copy(pph_sentence.new_pph_sentence(sentence_cycl, $DECLARATIVE, UNPROVIDED), UNPROVIDED), pph_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            summary_cycl = cdolist_list_var.first();
        } 
        return pph_paragraph_copy(new_pph_paragraph(fort, nreverse(pph_sentences)), UNPROVIDED);
    }

    public static SubLObject pph_summary_max_sentences_for_same_pred() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_summary_max_sentences_for_same_pred$.getDynamicValue(thread);
    }

    public static SubLObject add_pph_summary_source(SubLObject source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $pph_summary_sources$.setDynamicValue(list_utilities.nadd_to_end(source, $pph_summary_sources$.getDynamicValue(thread)), thread);
        return $pph_summary_sources$.getDynamicValue(thread);
    }

    public static SubLObject pph_summary_sentence_sources(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp($pph_summary_sentence_sources$.getDynamicValue(thread)) : "Types.listp(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.listp(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread)) " + $pph_summary_sentence_sources$.getDynamicValue(thread);
        thread.resetMultipleValues();
        SubLObject v_sources = list_utilities.alist_lookup($pph_summary_sentence_sources$.getDynamicValue(thread), sentence, symbol_function(EQUAL), NIL);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL == foundP) {
            v_sources = pph_cycl_sentence_sources(sentence);
            pph_note_summary_sentence_sources(sentence, v_sources);
        }
        return v_sources;
    }

    public static SubLObject pph_note_summary_sentence_sources(final SubLObject sentence, SubLObject v_sources) {
        if (v_sources == UNPROVIDED) {
            v_sources = pph_cycl_sentence_sources(sentence);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp($pph_summary_sentence_sources$.getDynamicValue(thread)) : "Types.listp(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread)) " + "CommonSymbols.NIL != Types.listp(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread)) " + $pph_summary_sentence_sources$.getDynamicValue(thread);
        $pph_summary_sentence_sources$.setDynamicValue(list_utilities.alist_enter($pph_summary_sentence_sources$.getDynamicValue(thread), sentence, v_sources, UNPROVIDED), thread);
        return v_sources;
    }

    public static SubLObject pph_maybe_add_source_footnotes(final SubLObject sentence, final SubLObject paraphrase, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject revised = NIL;
        if ((NIL != $pph_track_summary_sourcesP$.getDynamicValue(thread)) && paraphrase.isString()) {
            SubLObject source_ids = NIL;
            SubLObject v_sources = pph_summary_sentence_sources(sentence);
            SubLObject next_new_source_id = number_utilities.f_1X(length($pph_summary_sources$.getDynamicValue(thread)));
            if (NIL != assertion_handles.assertion_p(sentence)) {
                SubLObject cdolist_list_var = sources.assertion_corroborating_sources(sentence, domain_mt);
                SubLObject corroborating_source = NIL;
                corroborating_source = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = corroborating_source;
                    if (NIL == member(item_var, v_sources, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        v_sources = cons(item_var, v_sources);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    corroborating_source = cdolist_list_var.first();
                } 
            }
            SubLObject cdolist_list_var = v_sources;
            SubLObject source = NIL;
            source = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject zero_indexed_source_id = position(source, $pph_summary_sources$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject source_id = NIL;
                if (NIL != zero_indexed_source_id) {
                    source_id = number_utilities.f_1X(zero_indexed_source_id);
                } else {
                    source_id = next_new_source_id;
                    add_pph_summary_source(source);
                    next_new_source_id = add(next_new_source_id, ONE_INTEGER);
                }
                source_ids = cons(cons(source_id, source), source_ids);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            } 
            if (NIL != source_ids) {
                revised = pph_add_source_footnotes(paraphrase, source_ids);
            }
        }
        return NIL != revised ? revised : paraphrase;
    }

    public static SubLObject pph_add_source_footnotes(final SubLObject paraphrase, final SubLObject source_ids) {
        SubLObject ending_tags = NIL;
        SubLObject strippedP = NIL;
        SubLObject revised = paraphrase;
        while (NIL == strippedP) {
            if (NIL != string_utilities.ends_with(revised, html_macros.$html_unordered_list_tail$.getGlobalValue(), symbol_function(EQUALP))) {
                ending_tags = cons(html_macros.$html_unordered_list_tail$.getGlobalValue(), ending_tags);
                revised = string_utilities.post_remove(revised, html_macros.$html_unordered_list_tail$.getGlobalValue(), symbol_function(EQUALP));
            } else
                if (NIL != string_utilities.ends_with(revised, html_macros.$html_list_item_tail$.getGlobalValue(), symbol_function(EQUALP))) {
                    ending_tags = cons(html_macros.$html_list_item_tail$.getGlobalValue(), ending_tags);
                    revised = string_utilities.post_remove(revised, html_macros.$html_list_item_tail$.getGlobalValue(), symbol_function(EQUALP));
                } else {
                    strippedP = T;
                }

        } 
        revised = cconcatenate(revised, pph_html.pph_footnote_string_for_source_ids(source_ids));
        SubLObject cdolist_list_var = ending_tags;
        SubLObject ending_tag = NIL;
        ending_tag = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            revised = cconcatenate(revised, ending_tag);
            cdolist_list_var = cdolist_list_var.rest();
            ending_tag = cdolist_list_var.first();
        } 
        return revised;
    }

    public static SubLObject pph_check_for_isomorphic_assertion_internal(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != atomic_sentenceP(sentence)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject as = czer_meta.find_visible_assertion_cycl(sentence, UNPROVIDED);
                if (NIL != as) {
                    return as;
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return sentence;
    }

    public static SubLObject pph_check_for_isomorphic_assertion(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return pph_check_for_isomorphic_assertion_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PPH_CHECK_FOR_ISOMORPHIC_ASSERTION, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PPH_CHECK_FOR_ISOMORPHIC_ASSERTION, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PPH_CHECK_FOR_ISOMORPHIC_ASSERTION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(pph_check_for_isomorphic_assertion_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject pph_process_cycl_sentences_for_summary(final SubLObject cycl_sentences) {
        SubLObject output_cycls = NIL;
        SubLObject base_cycl = NIL;
        SubLObject coordinate_argnum = NIL;
        SubLObject coordinate_terms = NIL;
        SubLObject coordinated_cycls = NIL;
        SubLObject cdolist_list_var;
        final SubLObject sorted = cdolist_list_var = sort_cycl_sentences_for_summary(cycl_sentences);
        SubLObject summary_sentence = NIL;
        summary_sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject input_cycl = fact_sheets.summary_sentence_cycl(summary_sentence);
            if (!input_cycl.equal(base_cycl)) {
                if (NIL != pph_coordination_matchP(input_cycl, base_cycl, coordinate_argnum)) {
                    if (NIL == coordinate_argnum) {
                        coordinate_argnum = pph_find_coordinate_argnum(base_cycl, input_cycl);
                    }
                    if (NIL != coordinate_argnum) {
                        SubLObject item_var = cycl_utilities.formula_arg(input_cycl, coordinate_argnum, UNPROVIDED);
                        if (NIL == member(item_var, coordinate_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            coordinate_terms = cons(item_var, coordinate_terms);
                        }
                        item_var = summary_sentence;
                        if (NIL == member(item_var, coordinated_cycls, EQUAL, symbol_function(IDENTITY))) {
                            coordinated_cycls = cons(item_var, coordinated_cycls);
                        }
                    }
                } else {
                    if (((NIL != base_cycl) && (NIL != coordinate_argnum)) && (NIL != coordinate_terms)) {
                        output_cycls = cons(fact_sheets.new_summary_sentence(pph_coordinate_sentence(base_cycl, coordinate_argnum, coordinate_terms), coordinated_cycls), output_cycls);
                        final SubLObject item_var = summary_sentence;
                        if (NIL == member(item_var, coordinated_cycls, EQUAL, symbol_function(IDENTITY))) {
                            coordinated_cycls = cons(item_var, coordinated_cycls);
                        }
                    } else
                        if (NIL != base_cycl) {
                            output_cycls = cons(base_cycl, output_cycls);
                        }

                    base_cycl = input_cycl;
                    coordinate_terms = NIL;
                    coordinate_argnum = NIL;
                    coordinated_cycls = NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            summary_sentence = cdolist_list_var.first();
        } 
        if (((NIL != base_cycl) && (NIL != coordinate_argnum)) && (NIL != coordinate_terms)) {
            final SubLObject item_var2 = base_cycl;
            if (NIL == member(item_var2, coordinated_cycls, EQUAL, symbol_function(IDENTITY))) {
                coordinated_cycls = cons(item_var2, coordinated_cycls);
            }
            output_cycls = cons(fact_sheets.new_summary_sentence(pph_coordinate_sentence(base_cycl, coordinate_argnum, coordinate_terms), coordinated_cycls), output_cycls);
        } else
            if (NIL != base_cycl) {
                output_cycls = cons(base_cycl, output_cycls);
            }

        if (NIL == output_cycls) {
            return cycl_sentences;
        }
        return nreverse(output_cycls);
    }

    public static SubLObject sort_cycl_sentences_for_summary(final SubLObject cycl_sentences) {
        return fact_sheets.maximize_fact_sheet_sentence_coherence(cycl_sentences);
    }

    public static SubLObject pph_sort_terms_to_coordinate(final SubLObject terms_to_coordinate) {
        return kb_utilities.sort_terms(terms_to_coordinate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject pph_summary_sentences_share_predP(final SubLObject sentences) {
        SubLObject failP = NIL;
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL != pred) {
                    final SubLObject this_pred = pph_summary_sentence_pred(sentence);
                    failP = makeBoolean((!this_pred.equal(pred)) || ((NIL != isa.isa_in_any_mtP(pred, $const7$QuantificationalRuleMacroPredicat)) && (!arg1.equal(pph_summary_sentence_arg(sentence, ONE_INTEGER)))));
                } else {
                    pred = pph_summary_sentence_pred(sentence);
                    arg1 = pph_summary_sentence_arg(sentence, ONE_INTEGER);
                }
                csome_list_var = csome_list_var.rest();
                sentence = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject pph_summary_sentence_pred(final SubLObject sentence) {
        return pph_summary_sentence_arg(sentence, ZERO_INTEGER);
    }

    public static SubLObject pph_summary_sentence_arg(SubLObject sentence, final SubLObject argnum) {
        sentence = fact_sheets.summary_sentence_cycl(sentence);
        return NIL != ist_sentence_p(sentence, UNPROVIDED) ? pph_summary_sentence_arg(cycl_utilities.formula_arg2(sentence, UNPROVIDED), argnum) : cycl_utilities.formula_arg(sentence, argnum, UNPROVIDED);
    }

    public static SubLObject pph_coordinated_sentenceP(final SubLObject sentence) {
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject terms = cycl_utilities.formula_terms(sentence, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject arg = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        arg = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , arg = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if ((NIL != cycl_grammar.cycl_nat_p(arg)) && cycl_utilities.nat_functor(arg).equal(pph_get_coordination_fn(pred, argnum))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject pph_coordinate_sentence(final SubLObject base_cycl, final SubLObject coordinate_argnum, final SubLObject coordinate_terms) {
        if (NIL == coordinate_terms) {
            return base_cycl;
        }
        final SubLObject pred = cycl_utilities.formula_arg0(base_cycl);
        final SubLObject coordination_fn = pph_get_coordination_fn(pred, coordinate_argnum);
        if (NIL != coordination_fn) {
            final SubLObject base_term = cycl_utilities.formula_arg(base_cycl, coordinate_argnum, UNPROVIDED);
            SubLObject all_coordinate_terms = list(base_term);
            final SubLObject v_sources = pph_summary_sentence_sources(base_cycl);
            SubLObject cdolist_list_var = coordinate_terms;
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_formula_with_operator_p(v_term, coordination_fn)) {
                    final SubLObject items_var = cycl_utilities.formula_args(v_term, UNPROVIDED);
                    if (items_var.isVector()) {
                        final SubLObject vector_var = items_var;
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject item_var;
                        SubLObject item;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            item = item_var = aref(vector_var, element_num);
                            if (NIL == member(item_var, all_coordinate_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                all_coordinate_terms = cons(item_var, all_coordinate_terms);
                            }
                        }
                    } else {
                        SubLObject cdolist_list_var_$1 = items_var;
                        SubLObject item2 = NIL;
                        item2 = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            final SubLObject item_var2 = item2;
                            if (NIL == member(item_var2, all_coordinate_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                all_coordinate_terms = cons(item_var2, all_coordinate_terms);
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            item2 = cdolist_list_var_$1.first();
                        } 
                    }
                } else {
                    final SubLObject item_var3 = v_term;
                    if (NIL == member(item_var3, all_coordinate_terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        all_coordinate_terms = cons(item_var3, all_coordinate_terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
            all_coordinate_terms = nreverse(all_coordinate_terms);
            if ($$and.eql(coordination_fn)) {
                all_coordinate_terms = pph_process_cycl_sentences_for_summary(all_coordinate_terms);
            }
            final SubLObject terms_to_coordinate = pph_terms_to_coordinate(all_coordinate_terms);
            final SubLObject coordination = ($$and.eql(coordination_fn) && (NIL != list_utilities.singletonP(terms_to_coordinate))) ? list_utilities.only_one(terms_to_coordinate) : make_el_formula(coordination_fn, pph_sort_terms_to_coordinate(terms_to_coordinate), UNPROVIDED);
            SubLObject new_sentence = replace_formula_arg(coordinate_argnum, coordination, base_cycl);
            final SubLObject mt_time_index = (NIL != cycl_grammar.cycl_sentence_p(base_cycl)) ? pph_methods.pph_mt_time_index(pph_cycl_sentence_mt(base_cycl, UNPROVIDED)) : pph_methods.pph_default_mt_time_index();
            if (!mt_time_index.equal(pph_methods.pph_default_mt_time_index())) {
                new_sentence = make_ist_sentence(pph_utilities.pph_canonicalize_hlmt(list($$MtTimeDimFn, mt_time_index)), new_sentence);
            }
            pph_note_summary_sentence_sources(new_sentence, v_sources);
            return new_sentence;
        }
        return NIL;
    }

    public static SubLObject pph_terms_to_coordinate(final SubLObject all_coordinate_terms) {
        final SubLObject sentence_max = pph_summary_max_sentences_for_same_pred();
        if (NIL == sentence_max) {
            return all_coordinate_terms;
        }
        final SubLObject max = truncate(multiply($float$2_5, sentence_max), UNPROVIDED);
        final SubLObject too_manyP = list_utilities.lengthG(all_coordinate_terms, max, UNPROVIDED);
        final SubLObject one_too_manyP = makeBoolean((NIL != too_manyP) && (NIL != list_utilities.lengthE(all_coordinate_terms, number_utilities.f_1X(max), UNPROVIDED)));
        final SubLObject max_terms = (NIL != one_too_manyP) ? number_utilities.f_1_(max) : max;
        final SubLObject explicit_terms = list_utilities.first_n(max_terms, all_coordinate_terms);
        final SubLObject number_left_off = (NIL != too_manyP) ? subtract(length(all_coordinate_terms), max_terms) : ZERO_INTEGER;
        return NIL != too_manyP ? list_utilities.add_to_end(cconcatenate(format_nil.format_nil_d_no_copy(number_left_off), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(pph_coordination_contraction_type_string(all_coordinate_terms)) }), explicit_terms) : explicit_terms;
    }

    public static SubLObject pph_coordination_contraction_type_string(final SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = pph_coordination_contraction_type(terms, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        if (NIL != type) {
            return cconcatenate($$$other_, pph_main.generate_phrase(type, list($$plural), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return $$$others;
    }

    public static SubLObject pph_coordination_contraction_type(final SubLObject terms, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != list_utilities.every_in_list($sym16$INDIVIDUAL_, terms, UNPROVIDED)) {
                types = isa.nearest_common_isa(terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != list_utilities.every_in_list($sym17$SPECS_FN_NAT_, terms, UNPROVIDED)) {
                    types = Mapping.mapcar(PPH_MAKE_TYPE_LEVEL, genls.nearest_common_genls(Mapping.mapcar(PPH_CORE_TERM, terms), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                } else
                    if (NIL != list_utilities.every_in_list(COLLECTION_P, terms, UNPROVIDED)) {
                        types = genls.nearest_common_genls(terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }


        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL == types) {
            return NIL;
        }
        return pph_utilities.pph_salient_generalization(pph_utilities.pph_sort_collections_by_generality(types).first(), mt, NIL);
    }

    public static SubLObject pph_predicate_is_coordination_restrictedP(final SubLObject pred) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values($pph_coordination_preds_blacklist$.getGlobalValue(), pred, symbol_function(EQUAL), NIL));
    }

    public static SubLObject pph_get_coordination_fn(final SubLObject pred, final SubLObject coordinate_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info = list_utilities.alist_lookup_without_values($pph_coordination_preds$.getGlobalValue(), pred, symbol_function(EQUAL), NIL);
        SubLObject fn = NIL;
        if (NIL == fn) {
            SubLObject csome_list_var = info;
            SubLObject pair = NIL;
            pair = csome_list_var.first();
            while ((NIL == fn) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject argnum = NIL;
                SubLObject this_fn = NIL;
                destructuring_bind_must_consp(current, datum, $list23);
                argnum = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list23);
                this_fn = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((argnum == $ANY) || argnum.eql(coordinate_argnum)) {
                        fn = this_fn;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list23);
                }
                csome_list_var = csome_list_var.rest();
                pair = csome_list_var.first();
            } 
        }
        if ((NIL != $pph_assume_preds_allow_coordinationP$.getDynamicValue(thread)) && (NIL == fn)) {
            final SubLObject blacklist_entry = list_utilities.alist_lookup_without_values($pph_coordination_preds_blacklist$.getGlobalValue(), pred, symbol_function(EQUAL), NIL);
            if (!blacklist_entry.eql($ANY)) {
                if (NIL == member(coordinate_argnum, blacklist_entry, UNPROVIDED, UNPROVIDED)) {
                    if (coordinate_argnum.isInteger() && (NIL != subl_promotions.memberP($$CycLSentence, kb_accessors.argn_quoted_isa(pred, coordinate_argnum, UNPROVIDED), $sym26$PPH_SPEC_, UNPROVIDED))) {
                        fn = $$and;
                    } else {
                        fn = $$TheCoordinationSet;
                    }
                }
            }
        }
        return fn;
    }

    public static SubLObject pph_find_coordinate_argnum(final SubLObject base_cycl, final SubLObject input_cycl) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), pph_coordination_matchP(input_cycl, base_cycl, NIL));
    }

    public static SubLObject cached_demerits_for_term(final SubLObject v_term) {
        final SubLObject cached_demerits = (NIL != forts.fort_p(v_term)) ? nth_value_step_2(nth_value_step_1(TWO_INTEGER), nl_generation_fort_cache.nl_generation_cache_lookup(v_term, UNPROVIDED, UNPROVIDED)) : NIL;
        return NIL != cached_demerits ? cached_demerits : ZERO_INTEGER;
    }

    public static SubLObject pph_coordination_matchP(final SubLObject input_cycl, final SubLObject base_cycl, SubLObject coordinate_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matchP = NIL;
        if ((((((NIL != assertions_high.gaf_assertionP(input_cycl)) || (NIL != atomic_sentenceP(input_cycl))) && ((NIL != assertions_high.gaf_assertionP(base_cycl)) || (NIL != atomic_sentenceP(base_cycl)))) && (NIL != same_formula_arity_p(input_cycl, base_cycl, UNPROVIDED))) && (NIL != pph_same_mt_time_indexP(input_cycl, base_cycl))) && (NIL != pph_same_sourcesP(input_cycl, base_cycl))) {
            SubLObject mismatchP = NIL;
            final SubLObject terms = cycl_utilities.formula_terms(input_cycl, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject input_term = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            input_term = list_var.first();
            for (argnum = ZERO_INTEGER; (NIL == mismatchP) && (NIL != list_var); list_var = list_var.rest() , input_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                final SubLObject cached_demerits = cached_demerits_for_term(input_term);
                final SubLObject base_term = cycl_utilities.formula_arg(base_cycl, argnum, UNPROVIDED);
                final SubLObject base_term_demerits = cached_demerits_for_term(base_term);
                if (argnum.eql(coordinate_argnum)) {
                    if (NIL != pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(cached_demerits), UNPROVIDED)) {
                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn($str28$Cached_demerits__D_for__S, cached_demerits, input_term);
                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        mismatchP = T;
                    }
                    if (NIL != pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(base_term_demerits), UNPROVIDED)) {
                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                            Errors.warn($str28$Cached_demerits__D_for__S, base_term_demerits, base_term);
                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        mismatchP = T;
                    }
                } else
                    if (!cycl_utilities.formula_arg(base_cycl, argnum, UNPROVIDED).equal(input_term)) {
                        if (((((NIL == coordinate_argnum) && argnum.isPositive()) && ((NIL == fort_types_interface.predicate_p(input_term)) || ((NIL != pph_utilities.pph_isaP(input_term, $$QuantitySlot, UNPROVIDED)) && (NIL != pph_utilities.pph_isaP(base_term, $$QuantitySlot, UNPROVIDED))))) && (NIL == pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(cached_demerits), UNPROVIDED))) && (NIL == pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(base_term_demerits), UNPROVIDED))) {
                            coordinate_argnum = argnum;
                        } else {
                            mismatchP = T;
                        }
                    }

            }
            if ((NIL == mismatchP) && (NIL == pph_get_coordination_fn(cycl_utilities.formula_arg0(input_cycl), coordinate_argnum))) {
                mismatchP = T;
            }
            matchP = makeBoolean(NIL == mismatchP);
        }
        return values(matchP, coordinate_argnum);
    }

    public static SubLObject pph_same_mt_time_indexP(final SubLObject sentence1, final SubLObject sentence2) {
        return equal(pph_methods.pph_mt_time_index(pph_cycl_sentence_mt(sentence1, $$BaseKB)), pph_methods.pph_mt_time_index(pph_cycl_sentence_mt(sentence2, $$BaseKB)));
    }

    public static SubLObject pph_cycl_sentence_mt(final SubLObject sentence, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        if (NIL != assertion_handles.assertion_p(sentence)) {
            return assertions_high.assertion_mt(sentence);
        }
        if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
            return cycl_utilities.formula_arg1(sentence, UNPROVIDED);
        }
        return v_default;
    }

    public static SubLObject pph_same_sourcesP(final SubLObject sentence1, final SubLObject sentence2) {
        return list_utilities.sets_equalP(pph_cycl_sentence_sources(sentence1), pph_cycl_sentence_sources(sentence2), UNPROVIDED);
    }

    public static SubLObject pph_cycl_sentence_sources(final SubLObject sentence) {
        if (NIL != assertion_handles.assertion_p(sentence)) {
            return sources.assertion_sources(sentence);
        }
        if (NIL != ist_sentence_p(sentence, UNPROVIDED)) {
            return sources.mt_sources(cycl_utilities.formula_arg1(sentence, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject pph_paragraph_set_topic(final SubLObject paragraph, final SubLObject topic) {
        return pph_data_structures.pph_phrase_info_set(paragraph, $TOPIC, topic);
    }

    public static SubLObject pph_paragraph_topic(final SubLObject paragraph) {
        return pph_data_structures.pph_phrase_info_lookup(paragraph, $TOPIC, pph_phrase.pph_unknown_cycl());
    }

    public static SubLObject pph_paragraph_doneP(final SubLObject paragraph) {
        SubLObject unfinished_sentenceP = NIL;
        SubLObject sentence_num = ZERO_INTEGER;
        if (document.sign_constituents(paragraph).isVector()) {
            final SubLObject vector_var = document.sign_constituents(paragraph);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sentence;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                sentence = aref(vector_var, element_num);
                if (NIL == pph_sentence.pph_sentence_doneP(sentence)) {
                    unfinished_sentenceP = T;
                }
                sentence_num = add(sentence_num, ONE_INTEGER);
            }
        }
        return makeBoolean(NIL == unfinished_sentenceP);
    }

    public static SubLObject pph_paragraph_demerits(final SubLObject paragraph) {
        return pph_phrase.pph_phrase_demerits(paragraph);
    }

    public static SubLObject pph_paragraph_remove_sentence(final SubLObject paragraph, final SubLObject sentence) {
        return pph_phrase.pph_phrase_remove_dtr(paragraph, sentence);
    }

    public static SubLObject pph_paragraph_generate(final SubLObject paragraph, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject use_bulletsP = numL(pph_vars.$pph_use_bulleted_lists_min_level$.getDynamicValue(thread), ONE_INTEGER);
        if (NIL != pph_macros.pph_discourse_context_initializedP()) {
            pph_drs.pph_ensure_discourse_participant_rms();
            SubLObject sentence_num = ZERO_INTEGER;
            if (document.sign_constituents(paragraph).isVector()) {
                final SubLObject vector_var = document.sign_constituents(paragraph);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject sentence;
                SubLObject topic;
                SubLObject discourse_referents;
                SubLObject _prev_bind_0;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    sentence = aref(vector_var, element_num);
                    if (NIL != pph_phrase.pph_unknown_cycl_p(pph_sentence.pph_sentence_topic(sentence))) {
                        topic = pph_sentence_topic_from_paragraph(sentence);
                        if (NIL != pph_phrase.pph_known_cycl_p(topic)) {
                            pph_sentence.pph_sentence_set_topic(sentence, topic);
                        }
                    }
                    discourse_referents = Mapping.mapcar(PPH_RM_CYCL, pph_drs.pph_discourse_context_rms(UNPROVIDED));
                    _prev_bind_0 = pph_vars.$definite_description_licensed_terms$.currentBinding(thread);
                    try {
                        pph_vars.$definite_description_licensed_terms$.bind(append(pph_vars.$definite_description_licensed_terms$.getDynamicValue(thread), discourse_referents), thread);
                        pph_sentence.pph_sentence_generate(sentence, language_mt, domain_mt, mode);
                    } finally {
                        pph_vars.$definite_description_licensed_terms$.rebind(_prev_bind_0, thread);
                    }
                    if ((NIL != use_bulletsP) && (NIL == string_utilities.substringP(pph_methods_formulas.pph_start_list_tag(UNPROVIDED), pph_sentence.pph_sentence_string(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                        pph_sentence.pph_sentence_set_output_list(sentence, cons(pph_methods_formulas.pph_start_list_item_item(), list_utilities.add_to_end(pph_methods_formulas.pph_end_list_item_item(), pph_sentence.pph_sentence_output_list(sentence))));
                    }
                    sentence_num = add(sentence_num, ONE_INTEGER);
                }
            }
        } else {
            final SubLObject _prev_bind_2 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                pph_macros.herald_new_discourse_context();
                try {
                    pph_drs.pph_ensure_discourse_participant_rms();
                    SubLObject sentence_num2 = ZERO_INTEGER;
                    if (document.sign_constituents(paragraph).isVector()) {
                        final SubLObject vector_var2 = document.sign_constituents(paragraph);
                        final SubLObject backwardP_var2 = NIL;
                        SubLObject length2;
                        SubLObject v_iteration2;
                        SubLObject element_num2;
                        SubLObject sentence2;
                        SubLObject topic2;
                        SubLObject discourse_referents2;
                        SubLObject _prev_bind_0_$2;
                        for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                            element_num2 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                            sentence2 = aref(vector_var2, element_num2);
                            if (NIL != pph_phrase.pph_unknown_cycl_p(pph_sentence.pph_sentence_topic(sentence2))) {
                                topic2 = pph_sentence_topic_from_paragraph(sentence2);
                                if (NIL != pph_phrase.pph_known_cycl_p(topic2)) {
                                    pph_sentence.pph_sentence_set_topic(sentence2, topic2);
                                }
                            }
                            discourse_referents2 = Mapping.mapcar(PPH_RM_CYCL, pph_drs.pph_discourse_context_rms(UNPROVIDED));
                            _prev_bind_0_$2 = pph_vars.$definite_description_licensed_terms$.currentBinding(thread);
                            try {
                                pph_vars.$definite_description_licensed_terms$.bind(append(pph_vars.$definite_description_licensed_terms$.getDynamicValue(thread), discourse_referents2), thread);
                                pph_sentence.pph_sentence_generate(sentence2, language_mt, domain_mt, mode);
                            } finally {
                                pph_vars.$definite_description_licensed_terms$.rebind(_prev_bind_0_$2, thread);
                            }
                            if ((NIL != use_bulletsP) && (NIL == string_utilities.substringP(pph_methods_formulas.pph_start_list_tag(UNPROVIDED), pph_sentence.pph_sentence_string(sentence2, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                pph_sentence.pph_sentence_set_output_list(sentence2, cons(pph_methods_formulas.pph_start_list_item_item(), list_utilities.add_to_end(pph_methods_formulas.pph_end_list_item_item(), pph_sentence.pph_sentence_output_list(sentence2))));
                            }
                            sentence_num2 = add(sentence_num2, ONE_INTEGER);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_macros.herald_end_of_discourse_context();
                        pph_macros.clear_pph_discourse_context();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_2, thread);
            }
        }
        if (NIL != use_bulletsP) {
            final SubLObject first_sentence = pph_phrase.pph_phrase_nth_dtr(paragraph, ZERO_INTEGER);
            pph_sentence.pph_sentence_set_output_list(first_sentence, cons(pph_methods_formulas.pph_start_list_item(UNPROVIDED), pph_sentence.pph_sentence_output_list(first_sentence)));
            final SubLObject end_list_dtr = pph_sentence.new_pph_sentence(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            pph_sentence.pph_sentence_set_output_list(end_list_dtr, list(pph_methods_formulas.pph_end_list_item(UNPROVIDED)));
            pph_phrase.pph_phrase_note_done(end_list_dtr);
            pph_phrase.pph_phrase_append(end_list_dtr, paragraph);
        }
        return paragraph;
    }

    public static SubLObject pph_sentence_topic_from_paragraph(final SubLObject sentence) {
        final SubLObject topic = pph_phrase.pph_unknown_cycl();
        SubLObject paragraph;
        for (paragraph = pph_phrase.pph_phrase_mother(sentence); (NIL != paragraph) && (NIL == pph_paragraph_p(paragraph)); paragraph = pph_phrase.pph_phrase_mother(paragraph)) {
        }
        if (NIL != pph_paragraph_p(paragraph)) {
            final SubLObject p_topic = pph_paragraph_topic(paragraph);
            final SubLObject siblings = pph_phrase.pph_phrase_dtrs(pph_phrase.pph_phrase_mother(sentence));
            final SubLObject sentence_position = position(sentence, siblings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != sentence_position) && sentence_position.isPositive()) {
                final SubLObject previous_sentence = aref(siblings, number_utilities.f_1_(sentence_position));
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(pph_sentence.pph_sentence_cycl(previous_sentence), FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject s_topic = NIL;
                s_topic = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.expression_find(s_topic, pph_sentence.pph_sentence_cycl(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return s_topic;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    s_topic = cdolist_list_var.first();
                } 
            }
            if (NIL != cycl_utilities.expression_find(p_topic, pph_sentence.pph_sentence_cycl(sentence), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return p_topic;
            }
        }
        return topic;
    }

    public static SubLObject pph_paragraph_remove_duplicates_and_failures(final SubLObject paragraph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_strings = NIL;
        SubLObject done_sentences = NIL;
        SubLObject sentences_to_omit = NIL;
        SubLObject failed_sentences = NIL;
        SubLObject dtr_num = ZERO_INTEGER;
        if (document.sign_constituents(paragraph).isVector()) {
            final SubLObject vector_var = document.sign_constituents(paragraph);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sentence;
            SubLObject sentence_string;
            SubLObject sentence_cycl;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                sentence = aref(vector_var, element_num);
                sentence_string = pph_sentence.pph_sentence_string(sentence, T);
                if (NIL == pph_sentence.pph_sentence_doneP(sentence)) {
                    sentence_cycl = pph_sentence.pph_sentence_cycl(sentence);
                    if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str34$Failed_to_paraphrase__S, sentence_cycl);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    if (((NIL != pph_vars.pph_too_many_demerits_p(number_utilities.positive_infinity(), UNPROVIDED)) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) && (NIL == pph_error.suppress_pph_warningsP())) {
                        Errors.warn($str35$Probably_too_many_demerits_____S, sentence_cycl);
                        force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    sentences_to_omit = cons(sentence, sentences_to_omit);
                    failed_sentences = cons(sentence_cycl, failed_sentences);
                } else
                    if (NIL != subl_promotions.memberP(sentence_string, sentence_strings, symbol_function(EQUAL), UNPROVIDED)) {
                        sentences_to_omit = cons(sentence, sentences_to_omit);
                    } else
                        if (NIL != subl_promotions.memberP(sentence, done_sentences, $sym36$PPH_SENTENCES_SURFACE_EQUAL_MODULO_PRONOUNS_, UNPROVIDED)) {
                            sentences_to_omit = cons(sentence, sentences_to_omit);
                        } else {
                            sentence_strings = cons(sentence_string, sentence_strings);
                            done_sentences = cons(sentence, done_sentences);
                        }


                dtr_num = add(dtr_num, ONE_INTEGER);
            }
        }
        SubLObject cdolist_list_var = sentences_to_omit;
        SubLObject sentence_to_omit = NIL;
        sentence_to_omit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_paragraph_remove_sentence(paragraph, sentence_to_omit);
            cdolist_list_var = cdolist_list_var.rest();
            sentence_to_omit = cdolist_list_var.first();
        } 
        return failed_sentences;
    }

    public static SubLObject pph_paragraph_attempt_to_consolidate_sentences(final SubLObject paragraph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject previous_sentence = misc_utilities.uninitialized();
        final SubLObject _prev_bind_0 = pph_sentence.$dont_generate_multi_clause_sentenceP$.currentBinding(thread);
        try {
            pph_sentence.$dont_generate_multi_clause_sentenceP$.bind(T, thread);
            SubLObject to_remove = NIL;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                format_nil.force_format(T, $str37$__Attempting_to_consolidate_parag, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            SubLObject sentence_num = ZERO_INTEGER;
            if (document.sign_constituents(paragraph).isVector()) {
                final SubLObject vector_var = document.sign_constituents(paragraph);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject this_sentence;
                SubLObject new_removal;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    this_sentence = aref(vector_var, element_num);
                    new_removal = NIL;
                    if (NIL != misc_utilities.initialized_p(previous_sentence)) {
                        new_removal = pph_attempt_consolidation(previous_sentence, this_sentence);
                        if ((NIL == new_removal) && (NIL != $pph_attempt_reverse_consolidationP$.getGlobalValue())) {
                            new_removal = pph_attempt_consolidation(this_sentence, previous_sentence);
                            if ((NIL != new_removal) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
                                format_nil.force_format(T, $str38$Performed_reverse_consolidation__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                    if (NIL != new_removal) {
                        to_remove = cons(new_removal, to_remove);
                    }
                    if (!new_removal.eql(this_sentence)) {
                        previous_sentence = this_sentence;
                    }
                    sentence_num = add(sentence_num, ONE_INTEGER);
                }
            }
            SubLObject cdolist_list_var = to_remove;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_phrase.pph_phrase_remove_dtr(paragraph, sentence);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
        } finally {
            pph_sentence.$dont_generate_multi_clause_sentenceP$.rebind(_prev_bind_0, thread);
        }
        return paragraph;
    }

    public static SubLObject pph_attempt_consolidation(final SubLObject previous_sentence, final SubLObject this_sentence) {
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str39$__Attempting_to_consolidate____S_, pph_sentence.pph_sentence_string(previous_sentence, NIL), pph_sentence.pph_sentence_string(this_sentence, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject to_remove = NIL;
        if (NIL != misc_utilities.initialized_p(previous_sentence)) {
            if (((NIL != pph_sentence.pph_sentence_has_same_subjectP(previous_sentence, this_sentence)) && (NIL != pph_sentence.pph_sentence_starts_withP(this_sentence, pph_sentence.pph_sentence_truncated_phrases(previous_sentence)))) && (NIL != pph_sentence.pph_subject_ok_to_distribute_across_andP(pph_sentence.pph_sentence_subject(previous_sentence)))) {
                pph_consolidate_sentences_with_same_subject(previous_sentence, this_sentence);
                to_remove = this_sentence;
            } else
                if (NIL != pph_sentence.pph_sentences_differ_only_in_subjectP(previous_sentence, this_sentence)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str40$Differ_only_in_subject_____S____S, pph_sentence.pph_sentence_string(previous_sentence, NIL), pph_sentence.pph_sentence_string(this_sentence, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    pph_sentence.pph_sentence_adjoin_additional_subject(previous_sentence, pph_sentence.pph_sentence_subject(this_sentence));
                    to_remove = this_sentence;
                } else
                    if (NIL != pph_sentence.pph_sentence_ends_with_subject_ofP(previous_sentence, this_sentence)) {
                        Errors.warn($str41$Introducing_relative_clause_to_co, pph_string.pph_string_to_utf8(pph_sentence.pph_sentence_string(previous_sentence, NIL)), pph_string.pph_string_to_utf8(pph_sentence.pph_sentence_string(this_sentence, NIL)));
                        final SubLObject new_string = pph_sentence.pph_sentence_introduce_relative_clause(previous_sentence, this_sentence);
                        Errors.warn($str42$Result___S, pph_string.pph_string_to_utf8(new_string));
                        pph_sentence.pph_sentence_set_cycl(previous_sentence, simplifier.conjoin(list(pph_sentence.pph_sentence_cycl(previous_sentence), pph_sentence.pph_sentence_cycl(this_sentence)), T));
                        to_remove = this_sentence;
                    } else
                        if ((cycl_utilities.formula_arg0(pph_sentence.pph_sentence_cycl(previous_sentence)).equal(cycl_utilities.formula_arg0(pph_sentence.pph_sentence_cycl(this_sentence))) && cycl_utilities.expression_gather(pph_sentence.pph_sentence_cycl(previous_sentence), PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).equal(cycl_utilities.expression_gather(pph_sentence.pph_sentence_cycl(this_sentence), PREDICATE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != list_utilities.non_empty_list_p(pph_sentence.pph_sentence_main_clause_dtr_list(this_sentence)))) {
                            pph_sentence.pph_sentence_conjoin_roots(previous_sentence, this_sentence);
                            to_remove = this_sentence;
                        }



        }
        return to_remove;
    }

    public static SubLObject pph_consolidate_sentences_with_same_subject(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject prev_string = pph_sentence.pph_sentence_string(previous_sentence, NIL);
        final SubLObject this_string = pph_sentence.pph_sentence_string(this_sentence, NIL);
        Errors.warn($str44$Conjoining__S___and__S, pph_string.pph_string_to_utf8(prev_string), pph_string.pph_string_to_utf8(this_string));
        final SubLObject head_verb_okayP = pph_sentence.pph_subject_compatible_with_verbP(pph_sentence.pph_sentence_subject(previous_sentence), pph_sentence.pph_sentence_head_verb(this_sentence));
        if (prev_string.equal(this_string)) {
            return previous_sentence;
        }
        if ((NIL != head_verb_okayP) && (NIL != pph_sentence.pph_sentence_okay_for_restrictive_rel_clauseP(previous_sentence))) {
            final SubLObject new_string = pph_sentence.pph_sentence_introduce_restrictive_rel_clause(previous_sentence, this_sentence);
            Errors.warn($str45$Introduced_restrictive_relative_c, pph_string.pph_string_to_utf8(new_string));
            pph_sentence.pph_sentence_set_cycl(previous_sentence, simplifier.conjoin(list(pph_sentence.pph_sentence_cycl(previous_sentence), pph_sentence.pph_sentence_cycl(this_sentence)), T));
        } else
            if ((NIL == head_verb_okayP) || (NIL != pph_predicate_is_coordination_restrictedP(cycl_utilities.formula_arg0(pph_sentence.pph_sentence_cycl(previous_sentence))))) {
                pph_sentence.pph_sentence_conjoin_roots(previous_sentence, this_sentence);
            } else {
                pph_sentence.pph_sentence_conjoin_main_vp(previous_sentence, this_sentence);
            }

        pph_sentence.pph_sentence_set_cycl(previous_sentence, simplifier.conjoin(list(pph_sentence.pph_sentence_cycl(previous_sentence), pph_sentence.pph_sentence_cycl(this_sentence)), T));
        return previous_sentence;
    }

    public static SubLObject pph_html_paragraph_print(final SubLObject paragraph, SubLObject new_paragraphP) {
        if (new_paragraphP == UNPROVIDED) {
            new_paragraphP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != new_paragraphP) {
            html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
            pph_paragraph_print(paragraph, html_macros.$html_stream$.getDynamicValue(thread));
            html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
        } else {
            pph_paragraph_print(paragraph, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return paragraph;
    }

    public static SubLObject pph_paragraph_print(final SubLObject paragraph, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject sentence_count = pph_phrase.pph_phrase_dtr_count(paragraph);
        SubLObject sentence_num = ZERO_INTEGER;
        if (document.sign_constituents(paragraph).isVector()) {
            final SubLObject vector_var = document.sign_constituents(paragraph);
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sentence;
            SubLObject sentence_string;
            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                sentence = aref(vector_var, element_num);
                sentence_string = pph_sentence.pph_sentence_string(sentence, T);
                princ(pph_string.pph_string_if_non_null_to_output_format(sentence_string, UNPROVIDED), stream);
                if (sentence_count.numG(number_utilities.f_1X(sentence_num))) {
                    princ($$$_, stream);
                }
                sentence_num = add(sentence_num, ONE_INTEGER);
            }
        }
        return paragraph;
    }

    public static SubLObject pph_paraphrase_justification(final SubLObject conclusion, final SubLObject justification, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLObject paragraph = pph_justification_paragraph_from_supports(conclusion, justification);
        pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
        pph_paragraph_print(paragraph, UNPROVIDED);
        return conclusion;
    }

    public static SubLObject pph_justification_paragraph_from_supports(final SubLObject conclusion, final SubLObject supports) {
        final SubLObject support_sentences = Mapping.mapcar(SUPPORT_SENTENCE, supports);
        final SubLObject processed_support_sentences = Mapping.mapcar(POSSIBLY_CONVERT_SUMMARY_SENTENCE_TO_CYCL, pph_process_cycl_sentences_for_summary(support_sentences));
        SubLObject pph_sentences = NIL;
        SubLObject cdolist_list_var = processed_support_sentences;
        SubLObject support_cycl = NIL;
        support_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_sentences = cons(pph_sentence.pph_sentence_copy(pph_sentence.new_pph_sentence(support_cycl, $DECLARATIVE, UNPROVIDED), UNPROVIDED), pph_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            support_cycl = cdolist_list_var.first();
        } 
        final SubLObject conclusion_cycl = make_unary_formula($$followsFromPrecedingDiscourse, conclusion);
        final SubLObject conclusion_sentence = pph_sentence.new_pph_sentence(conclusion_cycl, $DECLARATIVE, UNPROVIDED);
        pph_sentences = cons(conclusion_sentence, pph_sentences);
        return pph_paragraph_copy(new_pph_paragraph(conclusion, nreverse(pph_sentences)), UNPROVIDED);
    }

    public static SubLObject pph_summarize_term(final SubLObject v_term, final SubLObject raw_summary_sentences, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject truncate_initial_sentenceP) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        if (truncate_initial_sentenceP == UNPROVIDED) {
            truncate_initial_sentenceP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(raw_summary_sentences) : "Types.listp(raw_summary_sentences) " + "CommonSymbols.NIL != Types.listp(raw_summary_sentences) " + raw_summary_sentences;
        assert NIL != hlmt.hlmt_p(language_mt) : "hlmt.hlmt_p(language_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(language_mt) " + language_mt;
        assert NIL != hlmt.hlmt_p(domain_mt) : "hlmt.hlmt_p(domain_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(domain_mt) " + domain_mt;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.lengthG(raw_summary_sentences, ZERO_INTEGER, UNPROVIDED))) {
            Errors.error($str50$Can_t_make_a_summary_with_no_inpu);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            SubLObject string = NIL;
            SubLObject failed_sentences = NIL;
            SubLObject sentence_paraphrases = NIL;
            final SubLObject _prev_bind_0_$4 = $pph_summary_sentence_sources$.currentBinding(thread);
            try {
                $pph_summary_sentence_sources$.bind($pph_summary_sentence_sources$.getDynamicValue(thread).isList() ? $pph_summary_sentence_sources$.getDynamicValue(thread) : NIL, thread);
                final SubLObject summary_sentences = pph_process_cycl_sentences_for_summary(copy_list(raw_summary_sentences));
                if (((mode == $HTML) && ((NIL != list_utilities.lengthG(raw_summary_sentences, TWO_INTEGER, UNPROVIDED)) || (NIL != list_utilities.lengthG(summary_sentences, ONE_INTEGER, UNPROVIDED)))) && (NIL != pph_summary_sentences_share_predP(summary_sentences))) {
                    thread.resetMultipleValues();
                    final SubLObject string_$5 = pph_summarize_term_bulleted(v_term, summary_sentences, language_mt, domain_mt);
                    final SubLObject failed_sentences_$6 = thread.secondMultipleValue();
                    final SubLObject sentence_paraphrases_$7 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    string = string_$5;
                    failed_sentences = failed_sentences_$6;
                    sentence_paraphrases = sentence_paraphrases_$7;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject string_$6 = pph_summarize_term_with_paragraph(v_term, summary_sentences, language_mt, domain_mt, mode, truncate_initial_sentenceP);
                    final SubLObject failed_sentences_$7 = thread.secondMultipleValue();
                    final SubLObject sentence_paraphrases_$8 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    string = string_$6;
                    failed_sentences = failed_sentences_$7;
                    sentence_paraphrases = sentence_paraphrases_$8;
                }
            } finally {
                $pph_summary_sentence_sources$.rebind(_prev_bind_0_$4, thread);
            }
            return values(string, failed_sentences, sentence_paraphrases);
        } finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_summarize_term_bulleted(final SubLObject v_term, final SubLObject summary_sentences, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_paraphrases = NIL;
        SubLObject failed_sentences = NIL;
        final SubLObject max = pph_summary_max_sentences_for_same_pred();
        SubLObject number_done = ZERO_INTEGER;
        SubLObject enoughP = NIL;
        SubLObject string = NIL;
        if (NIL != pph_macros.pph_discourse_context_initializedP()) {
            pph_drs.pph_ensure_discourse_participant_rms();
            final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                try {
                    if (NIL == enoughP) {
                        SubLObject csome_list_var = summary_sentences;
                        SubLObject summary_sentence = NIL;
                        summary_sentence = csome_list_var.first();
                        while ((NIL == enoughP) && (NIL != csome_list_var)) {
                            final SubLObject cycl_sentence = fact_sheets.summary_sentence_cycl(summary_sentence);
                            SubLObject paraphrase = pph_main.generate_text_wXsentential_force(cycl_sentence, $DECLARATIVE, $DEFAULT, language_mt, domain_mt, $HTML, UNPROVIDED);
                            if (NIL != cycl_string.cycl_string_p(paraphrase)) {
                                paraphrase = pph_maybe_add_source_footnotes(cycl_sentence, paraphrase, domain_mt);
                                number_done = add(number_done, ONE_INTEGER);
                                if (NIL == member(paraphrase, sentence_paraphrases, symbol_function(EQUAL), symbol_function(CDR))) {
                                    sentence_paraphrases = cons(cons(cycl_sentence, paraphrase), sentence_paraphrases);
                                }
                                enoughP = makeBoolean((NIL != max) && (NIL != list_utilities.lengthG(sentence_paraphrases, max, UNPROVIDED)));
                            } else {
                                if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                    Errors.warn($str54$Failed_to_generate__S, cycl_sentence);
                                    force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                failed_sentences = cons(summary_sentence, failed_sentences);
                            }
                            csome_list_var = csome_list_var.rest();
                            summary_sentence = csome_list_var.first();
                        } 
                    }
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject _prev_bind_0 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                pph_macros.herald_new_discourse_context();
                try {
                    pph_drs.pph_ensure_discourse_participant_rms();
                    final SubLObject _prev_bind_0_$12 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                    try {
                        pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                        pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                        pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                        try {
                            if (NIL == enoughP) {
                                SubLObject csome_list_var2 = summary_sentences;
                                SubLObject summary_sentence2 = NIL;
                                summary_sentence2 = csome_list_var2.first();
                                while ((NIL == enoughP) && (NIL != csome_list_var2)) {
                                    final SubLObject cycl_sentence2 = fact_sheets.summary_sentence_cycl(summary_sentence2);
                                    SubLObject paraphrase2 = pph_main.generate_text_wXsentential_force(cycl_sentence2, $DECLARATIVE, $DEFAULT, language_mt, domain_mt, $HTML, UNPROVIDED);
                                    if (NIL != cycl_string.cycl_string_p(paraphrase2)) {
                                        paraphrase2 = pph_maybe_add_source_footnotes(cycl_sentence2, paraphrase2, domain_mt);
                                        number_done = add(number_done, ONE_INTEGER);
                                        if (NIL == member(paraphrase2, sentence_paraphrases, symbol_function(EQUAL), symbol_function(CDR))) {
                                            sentence_paraphrases = cons(cons(cycl_sentence2, paraphrase2), sentence_paraphrases);
                                        }
                                        enoughP = makeBoolean((NIL != max) && (NIL != list_utilities.lengthG(sentence_paraphrases, max, UNPROVIDED)));
                                    } else {
                                        if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                                            Errors.warn($str54$Failed_to_generate__S, cycl_sentence2);
                                            force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        failed_sentences = cons(summary_sentence2, failed_sentences);
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    summary_sentence2 = csome_list_var2.first();
                                } 
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                pph_macros.destroy_new_pph_phrases();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    } finally {
                        pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_5, thread);
                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_4, thread);
                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$12, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        pph_macros.herald_end_of_discourse_context();
                        pph_macros.clear_pph_discourse_context();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            } finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != enoughP) {
            SubLObject number_left_off = subtract(length(summary_sentences), number_done);
            if (number_left_off.isPositive()) {
                if (ONE_INTEGER.eql(number_left_off)) {
                    sentence_paraphrases = sentence_paraphrases.rest();
                    number_left_off = add(number_left_off, ONE_INTEGER);
                }
                final SubLObject string_$15 = cconcatenate($str55$_, new SubLObject[]{ format_nil.format_nil_s_no_copy(number_left_off), $str56$_similar_sentences_ });
                sentence_paraphrases = cons(cons(NIL, string_$15), sentence_paraphrases);
            }
        }
        if (NIL != sentence_paraphrases) {
            sentence_paraphrases = nreverse(sentence_paraphrases);
            string = pph_make_bulleted_list(list_utilities.alist_values(sentence_paraphrases));
        }
        return values(string, failed_sentences, sentence_paraphrases);
    }

    public static SubLObject pph_make_bulleted_list(final SubLObject texts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = texts;
                    SubLObject text = NIL;
                    text = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(text);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        text = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string;
    }

    public static SubLObject pph_summarize_term_with_paragraph(final SubLObject v_term, final SubLObject summary_sentences, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject truncate_initial_sentenceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failed_sentences = NIL;
        SubLObject sentence_paraphrases = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            SubLObject string = NIL;
            final SubLObject _prev_bind_0_$18 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_1_$19 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                try {
                    final SubLObject paragraph = pph_summary_paragraph_from_cycl_sentences(v_term, summary_sentences);
                    final SubLObject first_sentence = pph_phrase.pph_phrase_nth_dtr(paragraph, ZERO_INTEGER);
                    SubLObject error_message = NIL;
                    final SubLObject _prev_bind_0_$19 = Errors.$continue_cerrorP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$20 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                    try {
                        Errors.$continue_cerrorP$.bind(NIL, thread);
                        pph_error.$pph_error_handling_onP$.bind(T, thread);
                        if (NIL != pph_error.pph_break_on_errorP()) {
                            final SubLObject _prev_bind_0_$20 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_use_bulleted_listsP$.bind(NIL, thread);
                                pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
                            } finally {
                                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (NIL != truncate_initial_sentenceP) {
                                pph_maybe_truncate_summary_sentence(v_term, first_sentence);
                            }
                            failed_sentences = pph_paragraph_remove_duplicates_and_failures(paragraph);
                            pph_paragraph_attempt_to_consolidate_sentences(paragraph);
                            SubLObject dtr_num = ZERO_INTEGER;
                            if (document.sign_constituents(paragraph).isVector()) {
                                final SubLObject vector_var = document.sign_constituents(paragraph);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject sentence;
                                SubLObject tagsP;
                                SubLObject sentence_string;
                                SubLObject sentence_cycl;
                                SubLObject new_string;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    sentence = aref(vector_var, element_num);
                                    tagsP = T;
                                    sentence_string = pph_sentence.pph_sentence_string(sentence, tagsP);
                                    sentence_cycl = pph_sentence.pph_sentence_cycl(sentence);
                                    new_string = pph_maybe_add_source_footnotes(sentence_cycl, pph_string.pph_string_if_non_null_to_output_format(sentence_string, UNPROVIDED), domain_mt);
                                    if (!sentence_string.equal(new_string)) {
                                        pph_phrase.pph_phrase_note_string(sentence, new_string, tagsP);
                                    }
                                    sentence_paraphrases = cons(cons(sentence_cycl, new_string), sentence_paraphrases);
                                    dtr_num = add(dtr_num, ONE_INTEGER);
                                }
                            }
                            if ((NIL != pph_paragraph_doneP(paragraph)) || (NIL == pph_vars.pph_failure_is_an_option_p())) {
                                SubLObject stream = NIL;
                                try {
                                    stream = make_private_string_output_stream();
                                    pph_paragraph_print(paragraph, stream);
                                    string = get_output_stream_string(stream);
                                } finally {
                                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        close(stream, UNPROVIDED);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                    }
                                }
                            }
                        } else {
                            try {
                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$22 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$23 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_use_bulleted_listsP$.bind(NIL, thread);
                                            pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
                                        } finally {
                                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        if (NIL != truncate_initial_sentenceP) {
                                            pph_maybe_truncate_summary_sentence(v_term, first_sentence);
                                        }
                                        failed_sentences = pph_paragraph_remove_duplicates_and_failures(paragraph);
                                        pph_paragraph_attempt_to_consolidate_sentences(paragraph);
                                        SubLObject dtr_num2 = ZERO_INTEGER;
                                        if (document.sign_constituents(paragraph).isVector()) {
                                            final SubLObject vector_var2 = document.sign_constituents(paragraph);
                                            final SubLObject backwardP_var2 = NIL;
                                            SubLObject length2;
                                            SubLObject v_iteration2;
                                            SubLObject element_num2;
                                            SubLObject sentence2;
                                            SubLObject tagsP2;
                                            SubLObject sentence_string2;
                                            SubLObject sentence_cycl2;
                                            SubLObject new_string2;
                                            for (length2 = length(vector_var2), v_iteration2 = NIL, v_iteration2 = ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = add(v_iteration2, ONE_INTEGER)) {
                                                element_num2 = (NIL != backwardP_var2) ? subtract(length2, v_iteration2, ONE_INTEGER) : v_iteration2;
                                                sentence2 = aref(vector_var2, element_num2);
                                                tagsP2 = T;
                                                sentence_string2 = pph_sentence.pph_sentence_string(sentence2, tagsP2);
                                                sentence_cycl2 = pph_sentence.pph_sentence_cycl(sentence2);
                                                new_string2 = pph_maybe_add_source_footnotes(sentence_cycl2, pph_string.pph_string_if_non_null_to_output_format(sentence_string2, UNPROVIDED), domain_mt);
                                                if (!sentence_string2.equal(new_string2)) {
                                                    pph_phrase.pph_phrase_note_string(sentence2, new_string2, tagsP2);
                                                }
                                                sentence_paraphrases = cons(cons(sentence_cycl2, new_string2), sentence_paraphrases);
                                                dtr_num2 = add(dtr_num2, ONE_INTEGER);
                                            }
                                        }
                                        if ((NIL != pph_paragraph_doneP(paragraph)) || (NIL == pph_vars.pph_failure_is_an_option_p())) {
                                            SubLObject stream2 = NIL;
                                            try {
                                                stream2 = make_private_string_output_stream();
                                                pph_paragraph_print(paragraph, stream2);
                                                string = get_output_stream_string(stream2);
                                            } finally {
                                                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    close(stream2, UNPROVIDED);
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            }
                                        }
                                    } catch (final Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$22, thread);
                                }
                            } catch (final Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            } finally {
                                thread.throwStack.pop();
                            }
                            if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                                Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str58$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                            }
                        }
                    } finally {
                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$20, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$19, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
            } finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$19, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$18, thread);
            }
            return values(string, failed_sentences, nreverse(sentence_paraphrases));
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject pph_maybe_truncate_summary_sentence(final SubLObject v_term, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject olist = pph_phrase.pph_phrase_output_list(sentence);
        final SubLObject copula_item = pph_find_summary_copula_item(v_term, olist);
        if (NIL != pph_data_structures.pph_phrase_output_item_p(copula_item)) {
            final SubLObject new_olist = pph_truncate_summary_olist(olist, copula_item);
            pph_phrase.pph_phrase_set_output_list(sentence, new_olist, UNPROVIDED);
        } else
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str59$Can_t_truncate__S, sentence);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }

        return sentence;
    }

    public static SubLObject pph_find_summary_copula_item(final SubLObject v_term, final SubLObject olist) {
        SubLObject copula_item = NIL;
        SubLObject found_termP = NIL;
        SubLObject stopP = NIL;
        if (NIL == stopP) {
            SubLObject csome_list_var = olist;
            SubLObject item = NIL;
            item = csome_list_var.first();
            while ((NIL == stopP) && (NIL != csome_list_var)) {
                if ((NIL != found_termP) && (NIL != pph_string_starts_with_copulaP(pph_data_structures.pph_phrase_output_item_string(item)))) {
                    copula_item = item;
                    stopP = T;
                } else
                    if (pph_data_structures.pph_phrase_output_item_cycl(item).eql(v_term)) {
                        found_termP = T;
                    } else
                        if ((NIL != found_termP) && (NIL != pph_data_structures.pph_phrase_output_item_cycl(item))) {
                            stopP = T;
                        }


                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            } 
        }
        return copula_item;
    }

    public static SubLObject pph_english_copula_string_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(string.isString() && (NIL != member($$BeAux, lexicon_accessors.pos_of_string(string, NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), UNPROVIDED), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject pph_string_starts_with_copulaP(final SubLObject string) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            final SubLObject first_word = pph_utilities.pph_first_word(string, UNPROVIDED);
            return pph_english_copula_string_p(first_word);
        }
        return NIL;
    }

    public static SubLObject pph_truncate_summary_olist(final SubLObject olist, final SubLObject copula_item) {
        final SubLObject copula_string = pph_data_structures.pph_phrase_output_item_string(copula_item);
        final SubLObject first_space = position(CHAR_space, copula_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ans = olist.rest();
        if (first_space.isInteger()) {
            final SubLObject new_string = string_utilities.substring(copula_string, number_utilities.f_1X(first_space), UNPROVIDED);
            pph_data_structures.pph_phrase_output_item_set_string(copula_item, new_string);
        }
        while (NIL != ans) {
            if (!ans.first().eql(copula_item)) {
                ans = ans.rest();
            } else {
                if (first_space.isInteger()) {
                    return ans;
                }
                return ans.rest();
            }
        } 
        return olist;
    }

    public static SubLObject pph_summarize_fort(final SubLObject fort, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == UNPROVIDED) {
            mode = $TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind(NIL, thread);
            pph_error.$pph_error_handling_onP$.bind(T, thread);
            if (NIL != pph_error.pph_break_on_errorP()) {
                final SubLObject _prev_bind_0_$28 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                try {
                    pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                    pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                    pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                    try {
                        final SubLObject _prev_bind_0_$29 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$30 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        try {
                            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                            pph_vars.$pph_language_mt$.bind(language_mt, thread);
                            final SubLObject summary_assertions = pph_summary_assertions_for_fort(fort, domain_mt);
                            final SubLObject paragraph = pph_summary_paragraph_from_assertions(fort, summary_assertions);
                            pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
                            pph_paragraph_print(paragraph, UNPROVIDED);
                        } finally {
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$30, thread);
                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$29, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            pph_macros.destroy_new_pph_phrases();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                } finally {
                    pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                    pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$29, thread);
                    pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$28, thread);
                }
            } else {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$31 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$32 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$31 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                            try {
                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                pph_macros.$destroy_new_pph_phrasesP$.bind(T, thread);
                                try {
                                    final SubLObject _prev_bind_0_$33 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$32 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                        pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                        final SubLObject summary_assertions2 = pph_summary_assertions_for_fort(fort, domain_mt);
                                        final SubLObject paragraph2 = pph_summary_paragraph_from_assertions(fort, summary_assertions2);
                                        pph_paragraph_generate(paragraph2, language_mt, domain_mt, mode);
                                        pph_paragraph_print(paragraph2, UNPROVIDED);
                                    } finally {
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$32, thread);
                                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$33, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        pph_macros.destroy_new_pph_phrases();
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                            } finally {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$31, thread);
                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$32, thread);
                            }
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$31, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str58$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        } finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        return fort;
    }

    public static SubLObject pph_summary_assertions_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        return pph_summary_isa_assertions_for_fort(fort, domain_mt);
    }

    public static SubLObject pph_summary_isa_assertions_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject all_isa_assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate(fort, ONE_INTEGER, $$isa, UNPROVIDED, UNPROVIDED);
            SubLObject isa_assertion = NIL;
            isa_assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject isa_coll = assertions_high.gaf_arg2(isa_assertion);
                if ((NIL == member(isa_coll, assertions, symbol_function(EQUAL), GAF_ARG2)) && (NIL == member(isa_coll, all_isa_assertions, $sym63$PPH_PROPER_SPEC_, GAF_ARG2))) {
                    assertions = cons(isa_assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                isa_assertion = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject declare_pph_document_file() {
        declareFunction(me, "pph_paragraph_p", "PPH-PARAGRAPH-P", 1, 0, false);
        declareFunction(me, "new_pph_paragraph", "NEW-PPH-PARAGRAPH", 0, 2, false);
        declareFunction(me, "pph_paragraph_copy", "PPH-PARAGRAPH-COPY", 1, 1, false);
        declareFunction(me, "pph_summary_paragraph_from_assertions", "PPH-SUMMARY-PARAGRAPH-FROM-ASSERTIONS", 2, 0, false);
        declareFunction(me, "pph_test_paragraph_from_cycl_sentences", "PPH-TEST-PARAGRAPH-FROM-CYCL-SENTENCES", 2, 4, false);
        declareFunction(me, "pph_summary_paragraph_from_cycl_sentences", "PPH-SUMMARY-PARAGRAPH-FROM-CYCL-SENTENCES", 2, 0, false);
        declareFunction(me, "pph_summary_max_sentences_for_same_pred", "PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED", 0, 0, false);
        declareFunction(me, "add_pph_summary_source", "ADD-PPH-SUMMARY-SOURCE", 1, 0, false);
        declareFunction(me, "pph_summary_sentence_sources", "PPH-SUMMARY-SENTENCE-SOURCES", 1, 0, false);
        declareFunction(me, "pph_note_summary_sentence_sources", "PPH-NOTE-SUMMARY-SENTENCE-SOURCES", 1, 1, false);
        declareFunction(me, "pph_maybe_add_source_footnotes", "PPH-MAYBE-ADD-SOURCE-FOOTNOTES", 3, 0, false);
        declareFunction(me, "pph_add_source_footnotes", "PPH-ADD-SOURCE-FOOTNOTES", 2, 0, false);
        declareFunction(me, "pph_check_for_isomorphic_assertion_internal", "PPH-CHECK-FOR-ISOMORPHIC-ASSERTION-INTERNAL", 1, 1, false);
        declareFunction(me, "pph_check_for_isomorphic_assertion", "PPH-CHECK-FOR-ISOMORPHIC-ASSERTION", 1, 1, false);
        declareFunction(me, "pph_process_cycl_sentences_for_summary", "PPH-PROCESS-CYCL-SENTENCES-FOR-SUMMARY", 1, 0, false);
        declareFunction(me, "sort_cycl_sentences_for_summary", "SORT-CYCL-SENTENCES-FOR-SUMMARY", 1, 0, false);
        declareFunction(me, "pph_sort_terms_to_coordinate", "PPH-SORT-TERMS-TO-COORDINATE", 1, 0, false);
        declareFunction(me, "pph_summary_sentences_share_predP", "PPH-SUMMARY-SENTENCES-SHARE-PRED?", 1, 0, false);
        declareFunction(me, "pph_summary_sentence_pred", "PPH-SUMMARY-SENTENCE-PRED", 1, 0, false);
        declareFunction(me, "pph_summary_sentence_arg", "PPH-SUMMARY-SENTENCE-ARG", 2, 0, false);
        declareFunction(me, "pph_coordinated_sentenceP", "PPH-COORDINATED-SENTENCE?", 1, 0, false);
        declareFunction(me, "pph_coordinate_sentence", "PPH-COORDINATE-SENTENCE", 3, 0, false);
        declareFunction(me, "pph_terms_to_coordinate", "PPH-TERMS-TO-COORDINATE", 1, 0, false);
        declareFunction(me, "pph_coordination_contraction_type_string", "PPH-COORDINATION-CONTRACTION-TYPE-STRING", 1, 0, false);
        declareFunction(me, "pph_coordination_contraction_type", "PPH-COORDINATION-CONTRACTION-TYPE", 2, 0, false);
        declareFunction(me, "pph_predicate_is_coordination_restrictedP", "PPH-PREDICATE-IS-COORDINATION-RESTRICTED?", 1, 0, false);
        declareFunction(me, "pph_get_coordination_fn", "PPH-GET-COORDINATION-FN", 2, 0, false);
        declareFunction(me, "pph_find_coordinate_argnum", "PPH-FIND-COORDINATE-ARGNUM", 2, 0, false);
        declareFunction(me, "cached_demerits_for_term", "CACHED-DEMERITS-FOR-TERM", 1, 0, false);
        declareFunction(me, "pph_coordination_matchP", "PPH-COORDINATION-MATCH?", 3, 0, false);
        declareFunction(me, "pph_same_mt_time_indexP", "PPH-SAME-MT-TIME-INDEX?", 2, 0, false);
        declareFunction(me, "pph_cycl_sentence_mt", "PPH-CYCL-SENTENCE-MT", 1, 1, false);
        declareFunction(me, "pph_same_sourcesP", "PPH-SAME-SOURCES?", 2, 0, false);
        declareFunction(me, "pph_cycl_sentence_sources", "PPH-CYCL-SENTENCE-SOURCES", 1, 0, false);
        declareFunction(me, "pph_paragraph_set_topic", "PPH-PARAGRAPH-SET-TOPIC", 2, 0, false);
        declareFunction(me, "pph_paragraph_topic", "PPH-PARAGRAPH-TOPIC", 1, 0, false);
        declareFunction(me, "pph_paragraph_doneP", "PPH-PARAGRAPH-DONE?", 1, 0, false);
        declareFunction(me, "pph_paragraph_demerits", "PPH-PARAGRAPH-DEMERITS", 1, 0, false);
        declareFunction(me, "pph_paragraph_remove_sentence", "PPH-PARAGRAPH-REMOVE-SENTENCE", 2, 0, false);
        declareFunction(me, "pph_paragraph_generate", "PPH-PARAGRAPH-GENERATE", 1, 3, false);
        declareFunction(me, "pph_sentence_topic_from_paragraph", "PPH-SENTENCE-TOPIC-FROM-PARAGRAPH", 1, 0, false);
        declareFunction(me, "pph_paragraph_remove_duplicates_and_failures", "PPH-PARAGRAPH-REMOVE-DUPLICATES-AND-FAILURES", 1, 0, false);
        declareFunction(me, "pph_paragraph_attempt_to_consolidate_sentences", "PPH-PARAGRAPH-ATTEMPT-TO-CONSOLIDATE-SENTENCES", 1, 0, false);
        declareFunction(me, "pph_attempt_consolidation", "PPH-ATTEMPT-CONSOLIDATION", 2, 0, false);
        declareFunction(me, "pph_consolidate_sentences_with_same_subject", "PPH-CONSOLIDATE-SENTENCES-WITH-SAME-SUBJECT", 2, 0, false);
        declareFunction(me, "pph_html_paragraph_print", "PPH-HTML-PARAGRAPH-PRINT", 1, 1, false);
        declareFunction(me, "pph_paragraph_print", "PPH-PARAGRAPH-PRINT", 1, 1, false);
        declareFunction(me, "pph_paraphrase_justification", "PPH-PARAPHRASE-JUSTIFICATION", 2, 3, false);
        declareFunction(me, "pph_justification_paragraph_from_supports", "PPH-JUSTIFICATION-PARAGRAPH-FROM-SUPPORTS", 2, 0, false);
        declareFunction(me, "pph_summarize_term", "PPH-SUMMARIZE-TERM", 2, 4, false);
        declareFunction(me, "pph_summarize_term_bulleted", "PPH-SUMMARIZE-TERM-BULLETED", 4, 0, false);
        declareFunction(me, "pph_make_bulleted_list", "PPH-MAKE-BULLETED-LIST", 1, 0, false);
        declareFunction(me, "pph_summarize_term_with_paragraph", "PPH-SUMMARIZE-TERM-WITH-PARAGRAPH", 6, 0, false);
        declareFunction(me, "pph_maybe_truncate_summary_sentence", "PPH-MAYBE-TRUNCATE-SUMMARY-SENTENCE", 2, 0, false);
        declareFunction(me, "pph_find_summary_copula_item", "PPH-FIND-SUMMARY-COPULA-ITEM", 2, 0, false);
        declareFunction(me, "pph_english_copula_string_p", "PPH-ENGLISH-COPULA-STRING-P", 1, 0, false);
        declareFunction(me, "pph_string_starts_with_copulaP", "PPH-STRING-STARTS-WITH-COPULA?", 1, 0, false);
        declareFunction(me, "pph_truncate_summary_olist", "PPH-TRUNCATE-SUMMARY-OLIST", 2, 0, false);
        declareFunction(me, "pph_summarize_fort", "PPH-SUMMARIZE-FORT", 1, 3, false);
        declareFunction(me, "pph_summary_assertions_for_fort", "PPH-SUMMARY-ASSERTIONS-FOR-FORT", 2, 0, false);
        declareFunction(me, "pph_summary_isa_assertions_for_fort", "PPH-SUMMARY-ISA-ASSERTIONS-FOR-FORT", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_document_file() {
        defparameter("*PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED*", THREE_INTEGER);
        defparameter("*PPH-TRACK-SUMMARY-SOURCES?*", NIL);
        defparameter("*PPH-SUMMARY-SOURCES*", NIL);
        defparameter("*PPH-SUMMARY-SENTENCE-SOURCES*", misc_utilities.uninitialized());
        deflexical("*PPH-COORDINATION-PREDS*", $list21);
        deflexical("*PPH-COORDINATION-PREDS-BLACKLIST*", $list22);
        defparameter("*PPH-ASSUME-PREDS-ALLOW-COORDINATION?*", T);
        deflexical("*PPH-ATTEMPT-REVERSE-CONSOLIDATION?*", T);
        return NIL;
    }

    public static SubLObject setup_pph_document_file() {
        memoization_state.note_memoized_function(PPH_CHECK_FOR_ISOMORPHIC_ASSERTION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_document_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_document_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_document_file();
    }

    
}

/**
 * Total time: 768 ms
 */
