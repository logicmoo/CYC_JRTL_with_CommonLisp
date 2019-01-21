package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_document extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_document";
    public static final String myFingerPrint = "bf1ac1f054bc08e035028335c774f0fbb85e6e48a9fdc61bfd074cd1eb5d636c";
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4213L)
    public static SubLSymbol $pph_summary_max_sentences_for_same_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4421L)
    public static SubLSymbol $pph_track_summary_sourcesP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4480L)
    public static SubLSymbol $pph_summary_sources$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4746L)
    private static SubLSymbol $pph_summary_sentence_sources$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 14768L)
    private static SubLSymbol $pph_coordination_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 15140L)
    private static SubLSymbol $pph_coordination_preds_blacklist$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 15444L)
    public static SubLSymbol $pph_assume_preds_allow_coordinationP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 24224L)
    private static SubLSymbol $pph_attempt_reverse_consolidationP$;
    private static final SubLSymbol $sym0$PPH_SENTENCE_P;
    private static final SubLSymbol $sym1$PPH_SENTENCE_FROM_ASSERTION;
    private static final SubLSymbol $kw2$TEXT;
    private static final SubLSymbol $sym3$_EXIT;
    private static final SubLSymbol $kw4$DECLARATIVE;
    private static final SubLSymbol $sym5$LISTP;
    private static final SubLSymbol $sym6$PPH_CHECK_FOR_ISOMORPHIC_ASSERTION;
    private static final SubLObject $const7$QuantificationalRuleMacroPredicat;
    private static final SubLSymbol $kw8$IGNORE;
    private static final SubLObject $const9$and;
    private static final SubLObject $const10$MtTimeDimFn;
    private static final SubLFloat $float11$2_5;
    private static final SubLString $str12$_;
    private static final SubLString $str13$other_;
    private static final SubLObject $const14$plural;
    private static final SubLString $str15$others;
    private static final SubLSymbol $sym16$INDIVIDUAL_;
    private static final SubLSymbol $sym17$SPECS_FN_NAT_;
    private static final SubLSymbol $sym18$PPH_MAKE_TYPE_LEVEL;
    private static final SubLSymbol $sym19$PPH_CORE_TERM;
    private static final SubLSymbol $sym20$COLLECTION_P;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$ANY;
    private static final SubLObject $const25$CycLSentence;
    private static final SubLSymbol $sym26$PPH_SPEC_;
    private static final SubLObject $const27$TheCoordinationSet;
    private static final SubLString $str28$Cached_demerits__D_for__S;
    private static final SubLObject $const29$QuantitySlot;
    private static final SubLObject $const30$BaseKB;
    private static final SubLSymbol $kw31$TOPIC;
    private static final SubLSymbol $sym32$PPH_RM_CYCL;
    private static final SubLSymbol $sym33$FORT_P;
    private static final SubLString $str34$Failed_to_paraphrase__S;
    private static final SubLString $str35$Probably_too_many_demerits_____S;
    private static final SubLSymbol $sym36$PPH_SENTENCES_SURFACE_EQUAL_MODULO_PRONOUNS_;
    private static final SubLString $str37$__Attempting_to_consolidate_parag;
    private static final SubLString $str38$Performed_reverse_consolidation__;
    private static final SubLString $str39$__Attempting_to_consolidate____S_;
    private static final SubLString $str40$Differ_only_in_subject_____S____S;
    private static final SubLString $str41$Introducing_relative_clause_to_co;
    private static final SubLString $str42$Result___S;
    private static final SubLSymbol $sym43$PREDICATE_P;
    private static final SubLString $str44$Conjoining__S___and__S;
    private static final SubLString $str45$Introduced_restrictive_relative_c;
    private static final SubLSymbol $sym46$SUPPORT_SENTENCE;
    private static final SubLSymbol $sym47$POSSIBLY_CONVERT_SUMMARY_SENTENCE_TO_CYCL;
    private static final SubLObject $const48$followsFromPrecedingDiscourse;
    private static final SubLSymbol $sym49$HLMT_P;
    private static final SubLString $str50$Can_t_make_a_summary_with_no_inpu;
    private static final SubLSymbol $kw51$HTML;
    private static final SubLSymbol $kw52$DEFAULT;
    private static final SubLSymbol $sym53$CDR;
    private static final SubLString $str54$Failed_to_generate__S;
    private static final SubLString $str55$_;
    private static final SubLString $str56$_similar_sentences_;
    private static final SubLSymbol $sym57$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str58$___Top_level_CycL___S;
    private static final SubLString $str59$Can_t_truncate__S;
    private static final SubLObject $const60$BeAux;
    private static final SubLObject $const61$isa;
    private static final SubLSymbol $sym62$GAF_ARG2;
    private static final SubLSymbol $sym63$PPH_PROPER_SPEC_;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 801L)
    public static SubLObject pph_paragraph_p(final SubLObject obj) {
        return pph_phrase.pph_phrase_p(obj, (SubLObject)pph_document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 927L)
    public static SubLObject new_pph_paragraph(SubLObject topic, SubLObject pph_sentences) {
        if (topic == pph_document.UNPROVIDED) {
            topic = (SubLObject)pph_document.NIL;
        }
        if (pph_sentences == pph_document.UNPROVIDED) {
            pph_sentences = (SubLObject)pph_document.NIL;
        }
        SubLObject cdolist_list_var = pph_sentences;
        SubLObject v_pph_sentence = (SubLObject)pph_document.NIL;
        v_pph_sentence = cdolist_list_var.first();
        while (pph_document.NIL != cdolist_list_var) {
            assert pph_document.NIL != pph_sentence.pph_sentence_p(v_pph_sentence) : v_pph_sentence;
            cdolist_list_var = cdolist_list_var.rest();
            v_pph_sentence = cdolist_list_var.first();
        }
        final SubLObject paragraph = pph_data_structures.new_pph_phrase((SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
        if (pph_document.NIL != topic) {
            pph_paragraph_set_topic(paragraph, topic);
        }
        pph_phrase.set_pph_phrase_dtrs_from_list(paragraph, pph_sentences, (SubLObject)pph_document.UNPROVIDED);
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 1328L)
    public static SubLObject pph_paragraph_copy(final SubLObject old_paragraph, SubLObject target) {
        if (target == pph_document.UNPROVIDED) {
            target = (SubLObject)pph_document.NIL;
        }
        if (pph_document.NIL == target) {
            target = new_pph_paragraph((SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
        }
        if (old_paragraph.equalp(target)) {
            return target;
        }
        if (pph_document.NIL != pph_phrase.pph_phrase_dtrs(old_paragraph)) {
            SubLObject sentence_copies = (SubLObject)pph_document.NIL;
            SubLObject dtr_num = (SubLObject)pph_document.ZERO_INTEGER;
            if (document.sign_constituents(old_paragraph).isVector()) {
                final SubLObject vector_var = document.sign_constituents(old_paragraph);
                final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject sentence;
                SubLObject sentence_copy;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                    element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                    sentence = Vectors.aref(vector_var, element_num);
                    sentence_copy = ((pph_document.NIL != pph_sentence.pph_sentence_p(sentence)) ? pph_sentence.pph_sentence_copy(sentence, (SubLObject)pph_document.UNPROVIDED) : sentence);
                    sentence_copies = (SubLObject)ConsesLow.cons(sentence_copy, sentence_copies);
                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_document.ONE_INTEGER);
                }
            }
            pph_phrase.set_pph_phrase_dtrs_from_list(target, Sequences.nreverse(sentence_copies), (SubLObject)pph_document.UNPROVIDED);
        }
        else {
            pph_phrase.pph_phrase_set_dtrs(target, (SubLObject)pph_document.NIL);
        }
        pph_paragraph_set_topic(target, pph_paragraph_topic(old_paragraph));
        return target;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 2209L)
    public static SubLObject pph_summary_paragraph_from_assertions(final SubLObject fort, final SubLObject summary_assertions) {
        final SubLObject cycl_sentences = Mapping.mapcar((SubLObject)pph_document.$sym1$PPH_SENTENCE_FROM_ASSERTION, summary_assertions);
        return pph_summary_paragraph_from_cycl_sentences(fort, cycl_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 2608L)
    public static SubLObject pph_test_paragraph_from_cycl_sentences(final SubLObject fort, final SubLObject summary_cycl_sentences, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject stream) {
        if (language_mt == pph_document.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_document.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_document.UNPROVIDED) {
            mode = (SubLObject)pph_document.$kw2$TEXT;
        }
        if (stream == pph_document.UNPROVIDED) {
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
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 3404L)
    public static SubLObject pph_summary_paragraph_from_cycl_sentences(final SubLObject fort, final SubLObject summary_cycl_sentences) {
        final SubLObject processed_cycl_sentences = pph_process_cycl_sentences_for_summary(summary_cycl_sentences);
        SubLObject pph_sentences = (SubLObject)pph_document.NIL;
        SubLObject cdolist_list_var = processed_cycl_sentences;
        SubLObject summary_cycl = (SubLObject)pph_document.NIL;
        summary_cycl = cdolist_list_var.first();
        while (pph_document.NIL != cdolist_list_var) {
            final SubLObject sentence_cycl = pph_check_for_isomorphic_assertion(fact_sheets.summary_sentence_cycl(summary_cycl), (SubLObject)pph_document.UNPROVIDED);
            pph_sentences = (SubLObject)ConsesLow.cons(pph_sentence.pph_sentence_copy(pph_sentence.new_pph_sentence(sentence_cycl, (SubLObject)pph_document.$kw4$DECLARATIVE, (SubLObject)pph_document.UNPROVIDED), (SubLObject)pph_document.UNPROVIDED), pph_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            summary_cycl = cdolist_list_var.first();
        }
        return pph_paragraph_copy(new_pph_paragraph(fort, Sequences.nreverse(pph_sentences)), (SubLObject)pph_document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4309L)
    public static SubLObject pph_summary_max_sentences_for_same_pred() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_document.$pph_summary_max_sentences_for_same_pred$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4590L)
    public static SubLObject add_pph_summary_source(SubLObject source) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_document.$pph_summary_sources$.setDynamicValue(list_utilities.nadd_to_end(source, pph_document.$pph_summary_sources$.getDynamicValue(thread)), thread);
        return pph_document.$pph_summary_sources$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 4873L)
    public static SubLObject pph_summary_sentence_sources(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_document.NIL != Types.listp(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread)) : pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread);
        thread.resetMultipleValues();
        SubLObject v_sources = list_utilities.alist_lookup(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread), sentence, Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.NIL);
        final SubLObject foundP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (pph_document.NIL == foundP) {
            v_sources = pph_cycl_sentence_sources(sentence);
            pph_note_summary_sentence_sources(sentence, v_sources);
        }
        return v_sources;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 5254L)
    public static SubLObject pph_note_summary_sentence_sources(final SubLObject sentence, SubLObject v_sources) {
        if (v_sources == pph_document.UNPROVIDED) {
            v_sources = pph_cycl_sentence_sources(sentence);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_document.NIL != Types.listp(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread)) : pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread);
        pph_document.$pph_summary_sentence_sources$.setDynamicValue(list_utilities.alist_enter(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread), sentence, v_sources, (SubLObject)pph_document.UNPROVIDED), thread);
        return v_sources;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 5558L)
    public static SubLObject pph_maybe_add_source_footnotes(final SubLObject sentence, final SubLObject paraphrase, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject revised = (SubLObject)pph_document.NIL;
        if (pph_document.NIL != pph_document.$pph_track_summary_sourcesP$.getDynamicValue(thread) && paraphrase.isString()) {
            SubLObject source_ids = (SubLObject)pph_document.NIL;
            SubLObject v_sources = pph_summary_sentence_sources(sentence);
            SubLObject next_new_source_id = number_utilities.f_1X(Sequences.length(pph_document.$pph_summary_sources$.getDynamicValue(thread)));
            if (pph_document.NIL != assertion_handles.assertion_p(sentence)) {
                SubLObject cdolist_list_var = sources.assertion_corroborating_sources(sentence, domain_mt);
                SubLObject corroborating_source = (SubLObject)pph_document.NIL;
                corroborating_source = cdolist_list_var.first();
                while (pph_document.NIL != cdolist_list_var) {
                    final SubLObject item_var = corroborating_source;
                    if (pph_document.NIL == conses_high.member(item_var, v_sources, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                        v_sources = (SubLObject)ConsesLow.cons(item_var, v_sources);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    corroborating_source = cdolist_list_var.first();
                }
            }
            SubLObject cdolist_list_var = v_sources;
            SubLObject source = (SubLObject)pph_document.NIL;
            source = cdolist_list_var.first();
            while (pph_document.NIL != cdolist_list_var) {
                final SubLObject zero_indexed_source_id = Sequences.position(source, pph_document.$pph_summary_sources$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
                SubLObject source_id = (SubLObject)pph_document.NIL;
                if (pph_document.NIL != zero_indexed_source_id) {
                    source_id = number_utilities.f_1X(zero_indexed_source_id);
                }
                else {
                    source_id = next_new_source_id;
                    add_pph_summary_source(source);
                    next_new_source_id = Numbers.add(next_new_source_id, (SubLObject)pph_document.ONE_INTEGER);
                }
                source_ids = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(source_id, source), source_ids);
                cdolist_list_var = cdolist_list_var.rest();
                source = cdolist_list_var.first();
            }
            if (pph_document.NIL != source_ids) {
                revised = pph_add_source_footnotes(paraphrase, source_ids);
            }
        }
        return (pph_document.NIL != revised) ? revised : paraphrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 6616L)
    public static SubLObject pph_add_source_footnotes(final SubLObject paraphrase, final SubLObject source_ids) {
        SubLObject ending_tags = (SubLObject)pph_document.NIL;
        SubLObject strippedP = (SubLObject)pph_document.NIL;
        SubLObject revised = paraphrase;
        while (pph_document.NIL == strippedP) {
            if (pph_document.NIL != string_utilities.ends_with(revised, html_macros.$html_unordered_list_tail$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_document.EQUALP))) {
                ending_tags = (SubLObject)ConsesLow.cons(html_macros.$html_unordered_list_tail$.getGlobalValue(), ending_tags);
                revised = string_utilities.post_remove(revised, html_macros.$html_unordered_list_tail$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_document.EQUALP));
            }
            else if (pph_document.NIL != string_utilities.ends_with(revised, html_macros.$html_list_item_tail$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_document.EQUALP))) {
                ending_tags = (SubLObject)ConsesLow.cons(html_macros.$html_list_item_tail$.getGlobalValue(), ending_tags);
                revised = string_utilities.post_remove(revised, html_macros.$html_list_item_tail$.getGlobalValue(), Symbols.symbol_function((SubLObject)pph_document.EQUALP));
            }
            else {
                strippedP = (SubLObject)pph_document.T;
            }
        }
        revised = Sequences.cconcatenate(revised, pph_html.pph_footnote_string_for_source_ids(source_ids));
        SubLObject cdolist_list_var = ending_tags;
        SubLObject ending_tag = (SubLObject)pph_document.NIL;
        ending_tag = cdolist_list_var.first();
        while (pph_document.NIL != cdolist_list_var) {
            revised = Sequences.cconcatenate(revised, ending_tag);
            cdolist_list_var = cdolist_list_var.rest();
            ending_tag = cdolist_list_var.first();
        }
        return revised;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 7449L)
    public static SubLObject pph_check_for_isomorphic_assertion_internal(final SubLObject sentence, SubLObject mt) {
        if (mt == pph_document.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_document.NIL != el_utilities.atomic_sentenceP(sentence)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject as = czer_meta.find_visible_assertion_cycl(sentence, (SubLObject)pph_document.UNPROVIDED);
                if (pph_document.NIL != as) {
                    return as;
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 7449L)
    public static SubLObject pph_check_for_isomorphic_assertion(final SubLObject sentence, SubLObject mt) {
        if (mt == pph_document.UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)pph_document.NIL;
        if (pph_document.NIL == v_memoization_state) {
            return pph_check_for_isomorphic_assertion_internal(sentence, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)pph_document.$sym6$PPH_CHECK_FOR_ISOMORPHIC_ASSERTION, (SubLObject)pph_document.UNPROVIDED);
        if (pph_document.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)pph_document.$sym6$PPH_CHECK_FOR_ISOMORPHIC_ASSERTION, (SubLObject)pph_document.TWO_INTEGER, (SubLObject)pph_document.NIL, (SubLObject)pph_document.EQUAL, (SubLObject)pph_document.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)pph_document.$sym6$PPH_CHECK_FOR_ISOMORPHIC_ASSERTION, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(sentence, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)pph_document.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)pph_document.NIL;
            collision = cdolist_list_var.first();
            while (pph_document.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pph_document.NIL != cached_args && pph_document.NIL == cached_args.rest() && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_check_for_isomorphic_assertion_internal(sentence, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 7735L)
    public static SubLObject pph_process_cycl_sentences_for_summary(final SubLObject cycl_sentences) {
        SubLObject output_cycls = (SubLObject)pph_document.NIL;
        SubLObject base_cycl = (SubLObject)pph_document.NIL;
        SubLObject coordinate_argnum = (SubLObject)pph_document.NIL;
        SubLObject coordinate_terms = (SubLObject)pph_document.NIL;
        SubLObject coordinated_cycls = (SubLObject)pph_document.NIL;
        SubLObject cdolist_list_var;
        final SubLObject sorted = cdolist_list_var = sort_cycl_sentences_for_summary(cycl_sentences);
        SubLObject summary_sentence = (SubLObject)pph_document.NIL;
        summary_sentence = cdolist_list_var.first();
        while (pph_document.NIL != cdolist_list_var) {
            final SubLObject input_cycl = fact_sheets.summary_sentence_cycl(summary_sentence);
            if (!input_cycl.equal(base_cycl)) {
                if (pph_document.NIL != pph_coordination_matchP(input_cycl, base_cycl, coordinate_argnum)) {
                    if (pph_document.NIL == coordinate_argnum) {
                        coordinate_argnum = pph_find_coordinate_argnum(base_cycl, input_cycl);
                    }
                    if (pph_document.NIL != coordinate_argnum) {
                        SubLObject item_var = cycl_utilities.formula_arg(input_cycl, coordinate_argnum, (SubLObject)pph_document.UNPROVIDED);
                        if (pph_document.NIL == conses_high.member(item_var, coordinate_terms, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                            coordinate_terms = (SubLObject)ConsesLow.cons(item_var, coordinate_terms);
                        }
                        item_var = summary_sentence;
                        if (pph_document.NIL == conses_high.member(item_var, coordinated_cycls, (SubLObject)pph_document.EQUAL, Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                            coordinated_cycls = (SubLObject)ConsesLow.cons(item_var, coordinated_cycls);
                        }
                    }
                }
                else {
                    if (pph_document.NIL != base_cycl && pph_document.NIL != coordinate_argnum && pph_document.NIL != coordinate_terms) {
                        output_cycls = (SubLObject)ConsesLow.cons(fact_sheets.new_summary_sentence(pph_coordinate_sentence(base_cycl, coordinate_argnum, coordinate_terms), coordinated_cycls), output_cycls);
                        final SubLObject item_var = summary_sentence;
                        if (pph_document.NIL == conses_high.member(item_var, coordinated_cycls, (SubLObject)pph_document.EQUAL, Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                            coordinated_cycls = (SubLObject)ConsesLow.cons(item_var, coordinated_cycls);
                        }
                    }
                    else if (pph_document.NIL != base_cycl) {
                        output_cycls = (SubLObject)ConsesLow.cons(base_cycl, output_cycls);
                    }
                    base_cycl = input_cycl;
                    coordinate_terms = (SubLObject)pph_document.NIL;
                    coordinate_argnum = (SubLObject)pph_document.NIL;
                    coordinated_cycls = (SubLObject)pph_document.NIL;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            summary_sentence = cdolist_list_var.first();
        }
        if (pph_document.NIL != base_cycl && pph_document.NIL != coordinate_argnum && pph_document.NIL != coordinate_terms) {
            final SubLObject item_var2 = base_cycl;
            if (pph_document.NIL == conses_high.member(item_var2, coordinated_cycls, (SubLObject)pph_document.EQUAL, Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                coordinated_cycls = (SubLObject)ConsesLow.cons(item_var2, coordinated_cycls);
            }
            output_cycls = (SubLObject)ConsesLow.cons(fact_sheets.new_summary_sentence(pph_coordinate_sentence(base_cycl, coordinate_argnum, coordinate_terms), coordinated_cycls), output_cycls);
        }
        else if (pph_document.NIL != base_cycl) {
            output_cycls = (SubLObject)ConsesLow.cons(base_cycl, output_cycls);
        }
        if (pph_document.NIL == output_cycls) {
            return cycl_sentences;
        }
        return Sequences.nreverse(output_cycls);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 9841L)
    public static SubLObject sort_cycl_sentences_for_summary(final SubLObject cycl_sentences) {
        return fact_sheets.maximize_fact_sheet_sentence_coherence(cycl_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 9972L)
    public static SubLObject pph_sort_terms_to_coordinate(final SubLObject terms_to_coordinate) {
        return kb_utilities.sort_terms(terms_to_coordinate, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 10082L)
    public static SubLObject pph_summary_sentences_share_predP(final SubLObject sentences) {
        SubLObject failP = (SubLObject)pph_document.NIL;
        SubLObject pred = (SubLObject)pph_document.NIL;
        SubLObject arg1 = (SubLObject)pph_document.NIL;
        if (pph_document.NIL == failP) {
            SubLObject csome_list_var = sentences;
            SubLObject sentence = (SubLObject)pph_document.NIL;
            sentence = csome_list_var.first();
            while (pph_document.NIL == failP && pph_document.NIL != csome_list_var) {
                if (pph_document.NIL != pred) {
                    final SubLObject this_pred = pph_summary_sentence_pred(sentence);
                    failP = (SubLObject)SubLObjectFactory.makeBoolean(!this_pred.equal(pred) || (pph_document.NIL != isa.isa_in_any_mtP(pred, pph_document.$const7$QuantificationalRuleMacroPredicat) && !arg1.equal(pph_summary_sentence_arg(sentence, (SubLObject)pph_document.ONE_INTEGER))));
                }
                else {
                    pred = pph_summary_sentence_pred(sentence);
                    arg1 = pph_summary_sentence_arg(sentence, (SubLObject)pph_document.ONE_INTEGER);
                }
                csome_list_var = csome_list_var.rest();
                sentence = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_document.NIL == failP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 10648L)
    public static SubLObject pph_summary_sentence_pred(final SubLObject sentence) {
        return pph_summary_sentence_arg(sentence, (SubLObject)pph_document.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 10749L)
    public static SubLObject pph_summary_sentence_arg(SubLObject sentence, final SubLObject argnum) {
        sentence = fact_sheets.summary_sentence_cycl(sentence);
        return (pph_document.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)pph_document.UNPROVIDED)) ? pph_summary_sentence_arg(cycl_utilities.formula_arg2(sentence, (SubLObject)pph_document.UNPROVIDED), argnum) : cycl_utilities.formula_arg(sentence, argnum, (SubLObject)pph_document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 11000L)
    public static SubLObject pph_coordinated_sentenceP(final SubLObject sentence) {
        final SubLObject pred = cycl_utilities.formula_arg0(sentence);
        final SubLObject terms = cycl_utilities.formula_terms(sentence, (SubLObject)pph_document.$kw8$IGNORE);
        SubLObject list_var = (SubLObject)pph_document.NIL;
        SubLObject arg = (SubLObject)pph_document.NIL;
        SubLObject argnum = (SubLObject)pph_document.NIL;
        list_var = terms;
        arg = list_var.first();
        for (argnum = (SubLObject)pph_document.ZERO_INTEGER; pph_document.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (pph_document.NIL != cycl_grammar.cycl_nat_p(arg) && cycl_utilities.nat_functor(arg).equal(pph_get_coordination_fn(pred, argnum))) {
                return (SubLObject)pph_document.T;
            }
        }
        return (SubLObject)pph_document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 11279L)
    public static SubLObject pph_coordinate_sentence(final SubLObject base_cycl, final SubLObject coordinate_argnum, final SubLObject coordinate_terms) {
        if (pph_document.NIL == coordinate_terms) {
            return base_cycl;
        }
        final SubLObject pred = cycl_utilities.formula_arg0(base_cycl);
        final SubLObject coordination_fn = pph_get_coordination_fn(pred, coordinate_argnum);
        if (pph_document.NIL != coordination_fn) {
            final SubLObject base_term = cycl_utilities.formula_arg(base_cycl, coordinate_argnum, (SubLObject)pph_document.UNPROVIDED);
            SubLObject all_coordinate_terms = (SubLObject)ConsesLow.list(base_term);
            final SubLObject v_sources = pph_summary_sentence_sources(base_cycl);
            SubLObject cdolist_list_var = coordinate_terms;
            SubLObject v_term = (SubLObject)pph_document.NIL;
            v_term = cdolist_list_var.first();
            while (pph_document.NIL != cdolist_list_var) {
                if (pph_document.NIL != el_utilities.el_formula_with_operator_p(v_term, coordination_fn)) {
                    final SubLObject items_var = cycl_utilities.formula_args(v_term, (SubLObject)pph_document.UNPROVIDED);
                    if (items_var.isVector()) {
                        final SubLObject vector_var = items_var;
                        final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject element_num;
                        SubLObject item_var;
                        SubLObject item;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                            element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                            item = (item_var = Vectors.aref(vector_var, element_num));
                            if (pph_document.NIL == conses_high.member(item_var, all_coordinate_terms, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                                all_coordinate_terms = (SubLObject)ConsesLow.cons(item_var, all_coordinate_terms);
                            }
                        }
                    }
                    else {
                        SubLObject cdolist_list_var_$1 = items_var;
                        SubLObject item2 = (SubLObject)pph_document.NIL;
                        item2 = cdolist_list_var_$1.first();
                        while (pph_document.NIL != cdolist_list_var_$1) {
                            final SubLObject item_var2 = item2;
                            if (pph_document.NIL == conses_high.member(item_var2, all_coordinate_terms, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                                all_coordinate_terms = (SubLObject)ConsesLow.cons(item_var2, all_coordinate_terms);
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            item2 = cdolist_list_var_$1.first();
                        }
                    }
                }
                else {
                    final SubLObject item_var3 = v_term;
                    if (pph_document.NIL == conses_high.member(item_var3, all_coordinate_terms, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.IDENTITY))) {
                        all_coordinate_terms = (SubLObject)ConsesLow.cons(item_var3, all_coordinate_terms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
            all_coordinate_terms = Sequences.nreverse(all_coordinate_terms);
            if (pph_document.$const9$and.eql(coordination_fn)) {
                all_coordinate_terms = pph_process_cycl_sentences_for_summary(all_coordinate_terms);
            }
            final SubLObject terms_to_coordinate = pph_terms_to_coordinate(all_coordinate_terms);
            final SubLObject coordination = (pph_document.$const9$and.eql(coordination_fn) && pph_document.NIL != list_utilities.singletonP(terms_to_coordinate)) ? list_utilities.only_one(terms_to_coordinate) : el_utilities.make_el_formula(coordination_fn, pph_sort_terms_to_coordinate(terms_to_coordinate), (SubLObject)pph_document.UNPROVIDED);
            SubLObject new_sentence = el_utilities.replace_formula_arg(coordinate_argnum, coordination, base_cycl);
            final SubLObject mt_time_index = (pph_document.NIL != cycl_grammar.cycl_sentence_p(base_cycl)) ? pph_methods.pph_mt_time_index(pph_cycl_sentence_mt(base_cycl, (SubLObject)pph_document.UNPROVIDED)) : pph_methods.pph_default_mt_time_index();
            if (!mt_time_index.equal(pph_methods.pph_default_mt_time_index())) {
                new_sentence = el_utilities.make_ist_sentence(pph_utilities.pph_canonicalize_hlmt((SubLObject)ConsesLow.list(pph_document.$const10$MtTimeDimFn, mt_time_index)), new_sentence);
            }
            pph_note_summary_sentence_sources(new_sentence, v_sources);
            return new_sentence;
        }
        return (SubLObject)pph_document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 13103L)
    public static SubLObject pph_terms_to_coordinate(final SubLObject all_coordinate_terms) {
        final SubLObject sentence_max = pph_summary_max_sentences_for_same_pred();
        if (pph_document.NIL == sentence_max) {
            return all_coordinate_terms;
        }
        final SubLObject max = Numbers.truncate(Numbers.multiply((SubLObject)pph_document.$float11$2_5, sentence_max), (SubLObject)pph_document.UNPROVIDED);
        final SubLObject too_manyP = list_utilities.lengthG(all_coordinate_terms, max, (SubLObject)pph_document.UNPROVIDED);
        final SubLObject one_too_manyP = (SubLObject)SubLObjectFactory.makeBoolean(pph_document.NIL != too_manyP && pph_document.NIL != list_utilities.lengthE(all_coordinate_terms, number_utilities.f_1X(max), (SubLObject)pph_document.UNPROVIDED));
        final SubLObject max_terms = (pph_document.NIL != one_too_manyP) ? number_utilities.f_1_(max) : max;
        final SubLObject explicit_terms = list_utilities.first_n(max_terms, all_coordinate_terms);
        final SubLObject number_left_off = (SubLObject)((pph_document.NIL != too_manyP) ? Numbers.subtract(Sequences.length(all_coordinate_terms), max_terms) : pph_document.ZERO_INTEGER);
        return (pph_document.NIL != too_manyP) ? list_utilities.add_to_end(Sequences.cconcatenate(format_nil.format_nil_d_no_copy(number_left_off), new SubLObject[] { pph_document.$str12$_, format_nil.format_nil_a_no_copy(pph_coordination_contraction_type_string(all_coordinate_terms)) }), explicit_terms) : explicit_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 13925L)
    public static SubLObject pph_coordination_contraction_type_string(final SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject type = pph_coordination_contraction_type(terms, pph_vars.$pph_domain_mt$.getDynamicValue(thread));
        if (pph_document.NIL != type) {
            return Sequences.cconcatenate((SubLObject)pph_document.$str13$other_, pph_main.generate_phrase(type, (SubLObject)ConsesLow.list(pph_document.$const14$plural), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED));
        }
        return (SubLObject)pph_document.$str15$others;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 14173L)
    public static SubLObject pph_coordination_contraction_type(final SubLObject terms, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)pph_document.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (pph_document.NIL != list_utilities.every_in_list((SubLObject)pph_document.$sym16$INDIVIDUAL_, terms, (SubLObject)pph_document.UNPROVIDED)) {
                types = isa.nearest_common_isa(terms, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
            }
            else if (pph_document.NIL != list_utilities.every_in_list((SubLObject)pph_document.$sym17$SPECS_FN_NAT_, terms, (SubLObject)pph_document.UNPROVIDED)) {
                types = Mapping.mapcar((SubLObject)pph_document.$sym18$PPH_MAKE_TYPE_LEVEL, genls.nearest_common_genls(Mapping.mapcar((SubLObject)pph_document.$sym19$PPH_CORE_TERM, terms), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED));
            }
            else if (pph_document.NIL != list_utilities.every_in_list((SubLObject)pph_document.$sym20$COLLECTION_P, terms, (SubLObject)pph_document.UNPROVIDED)) {
                types = genls.nearest_common_genls(terms, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (pph_document.NIL == types) {
            return (SubLObject)pph_document.NIL;
        }
        return pph_utilities.pph_salient_generalization(pph_utilities.pph_sort_collections_by_generality(types).first(), mt, (SubLObject)pph_document.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 15511L)
    public static SubLObject pph_predicate_is_coordination_restrictedP(final SubLObject pred) {
        return list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(pph_document.$pph_coordination_preds_blacklist$.getGlobalValue(), pred, Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 15680L)
    public static SubLObject pph_get_coordination_fn(final SubLObject pred, final SubLObject coordinate_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info = list_utilities.alist_lookup_without_values(pph_document.$pph_coordination_preds$.getGlobalValue(), pred, Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.NIL);
        SubLObject fn = (SubLObject)pph_document.NIL;
        if (pph_document.NIL == fn) {
            SubLObject csome_list_var = info;
            SubLObject pair = (SubLObject)pph_document.NIL;
            pair = csome_list_var.first();
            while (pph_document.NIL == fn && pph_document.NIL != csome_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject argnum = (SubLObject)pph_document.NIL;
                SubLObject this_fn = (SubLObject)pph_document.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_document.$list23);
                argnum = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_document.$list23);
                this_fn = current.first();
                current = current.rest();
                if (pph_document.NIL == current) {
                    if (argnum == pph_document.$kw24$ANY || argnum.eql(coordinate_argnum)) {
                        fn = this_fn;
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_document.$list23);
                }
                csome_list_var = csome_list_var.rest();
                pair = csome_list_var.first();
            }
        }
        if (pph_document.NIL != pph_document.$pph_assume_preds_allow_coordinationP$.getDynamicValue(thread) && pph_document.NIL == fn) {
            final SubLObject blacklist_entry = list_utilities.alist_lookup_without_values(pph_document.$pph_coordination_preds_blacklist$.getGlobalValue(), pred, Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.NIL);
            if (!blacklist_entry.eql((SubLObject)pph_document.$kw24$ANY)) {
                if (pph_document.NIL == conses_high.member(coordinate_argnum, blacklist_entry, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) {
                    if (coordinate_argnum.isInteger() && pph_document.NIL != subl_promotions.memberP(pph_document.$const25$CycLSentence, kb_accessors.argn_quoted_isa(pred, coordinate_argnum, (SubLObject)pph_document.UNPROVIDED), (SubLObject)pph_document.$sym26$PPH_SPEC_, (SubLObject)pph_document.UNPROVIDED)) {
                        fn = pph_document.$const9$and;
                    }
                    else {
                        fn = pph_document.$const27$TheCoordinationSet;
                    }
                }
            }
        }
        return fn;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 16506L)
    public static SubLObject pph_find_coordinate_argnum(final SubLObject base_cycl, final SubLObject input_cycl) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)pph_document.ONE_INTEGER), pph_coordination_matchP(input_cycl, base_cycl, (SubLObject)pph_document.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 16647L)
    public static SubLObject cached_demerits_for_term(final SubLObject v_term) {
        final SubLObject cached_demerits = (SubLObject)((pph_document.NIL != forts.fort_p(v_term)) ? Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)pph_document.TWO_INTEGER), nl_generation_fort_cache.nl_generation_cache_lookup(v_term, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) : pph_document.NIL);
        return (SubLObject)((pph_document.NIL != cached_demerits) ? cached_demerits : pph_document.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 16835L)
    public static SubLObject pph_coordination_matchP(final SubLObject input_cycl, final SubLObject base_cycl, SubLObject coordinate_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject matchP = (SubLObject)pph_document.NIL;
        if ((pph_document.NIL != assertions_high.gaf_assertionP(input_cycl) || pph_document.NIL != el_utilities.atomic_sentenceP(input_cycl)) && (pph_document.NIL != assertions_high.gaf_assertionP(base_cycl) || pph_document.NIL != el_utilities.atomic_sentenceP(base_cycl)) && pph_document.NIL != el_utilities.same_formula_arity_p(input_cycl, base_cycl, (SubLObject)pph_document.UNPROVIDED) && pph_document.NIL != pph_same_mt_time_indexP(input_cycl, base_cycl) && pph_document.NIL != pph_same_sourcesP(input_cycl, base_cycl)) {
            SubLObject mismatchP = (SubLObject)pph_document.NIL;
            final SubLObject terms = cycl_utilities.formula_terms(input_cycl, (SubLObject)pph_document.$kw8$IGNORE);
            SubLObject list_var = (SubLObject)pph_document.NIL;
            SubLObject input_term = (SubLObject)pph_document.NIL;
            SubLObject argnum = (SubLObject)pph_document.NIL;
            list_var = terms;
            input_term = list_var.first();
            for (argnum = (SubLObject)pph_document.ZERO_INTEGER; pph_document.NIL == mismatchP && pph_document.NIL != list_var; list_var = list_var.rest(), input_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
                final SubLObject cached_demerits = cached_demerits_for_term(input_term);
                final SubLObject base_term = cycl_utilities.formula_arg(base_cycl, argnum, (SubLObject)pph_document.UNPROVIDED);
                final SubLObject base_term_demerits = cached_demerits_for_term(base_term);
                if (argnum.eql(coordinate_argnum)) {
                    if (pph_document.NIL != pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(cached_demerits), (SubLObject)pph_document.UNPROVIDED)) {
                        if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn((SubLObject)pph_document.$str28$Cached_demerits__D_for__S, cached_demerits, input_term);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        mismatchP = (SubLObject)pph_document.T;
                    }
                    if (pph_document.NIL != pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(base_term_demerits), (SubLObject)pph_document.UNPROVIDED)) {
                        if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                            Errors.warn((SubLObject)pph_document.$str28$Cached_demerits__D_for__S, base_term_demerits, base_term);
                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                        }
                        mismatchP = (SubLObject)pph_document.T;
                    }
                }
                else if (!cycl_utilities.formula_arg(base_cycl, argnum, (SubLObject)pph_document.UNPROVIDED).equal(input_term)) {
                    if (pph_document.NIL == coordinate_argnum && argnum.isPositive() && (pph_document.NIL == fort_types_interface.predicate_p(input_term) || (pph_document.NIL != pph_utilities.pph_isaP(input_term, pph_document.$const29$QuantitySlot, (SubLObject)pph_document.UNPROVIDED) && pph_document.NIL != pph_utilities.pph_isaP(base_term, pph_document.$const29$QuantitySlot, (SubLObject)pph_document.UNPROVIDED))) && pph_document.NIL == pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(cached_demerits), (SubLObject)pph_document.UNPROVIDED) && pph_document.NIL == pph_vars.pph_too_many_demerits_p(number_utilities.f_1X(base_term_demerits), (SubLObject)pph_document.UNPROVIDED)) {
                        coordinate_argnum = argnum;
                    }
                    else {
                        mismatchP = (SubLObject)pph_document.T;
                    }
                }
            }
            if (pph_document.NIL == mismatchP && pph_document.NIL == pph_get_coordination_fn(cycl_utilities.formula_arg0(input_cycl), coordinate_argnum)) {
                mismatchP = (SubLObject)pph_document.T;
            }
            matchP = (SubLObject)SubLObjectFactory.makeBoolean(pph_document.NIL == mismatchP);
        }
        return Values.values(matchP, coordinate_argnum);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 18786L)
    public static SubLObject pph_same_mt_time_indexP(final SubLObject sentence1, final SubLObject sentence2) {
        return Equality.equal(pph_methods.pph_mt_time_index(pph_cycl_sentence_mt(sentence1, pph_document.$const30$BaseKB)), pph_methods.pph_mt_time_index(pph_cycl_sentence_mt(sentence2, pph_document.$const30$BaseKB)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 18997L)
    public static SubLObject pph_cycl_sentence_mt(final SubLObject sentence, SubLObject v_default) {
        if (v_default == pph_document.UNPROVIDED) {
            v_default = (SubLObject)pph_document.NIL;
        }
        if (pph_document.NIL != assertion_handles.assertion_p(sentence)) {
            return assertions_high.assertion_mt(sentence);
        }
        if (pph_document.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)pph_document.UNPROVIDED)) {
            return cycl_utilities.formula_arg1(sentence, (SubLObject)pph_document.UNPROVIDED);
        }
        return v_default;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 19223L)
    public static SubLObject pph_same_sourcesP(final SubLObject sentence1, final SubLObject sentence2) {
        return list_utilities.sets_equalP(pph_cycl_sentence_sources(sentence1), pph_cycl_sentence_sources(sentence2), (SubLObject)pph_document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 19385L)
    public static SubLObject pph_cycl_sentence_sources(final SubLObject sentence) {
        if (pph_document.NIL != assertion_handles.assertion_p(sentence)) {
            return sources.assertion_sources(sentence);
        }
        if (pph_document.NIL != el_utilities.ist_sentence_p(sentence, (SubLObject)pph_document.UNPROVIDED)) {
            return sources.mt_sources(cycl_utilities.formula_arg1(sentence, (SubLObject)pph_document.UNPROVIDED));
        }
        return (SubLObject)pph_document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 19611L)
    public static SubLObject pph_paragraph_set_topic(final SubLObject paragraph, final SubLObject topic) {
        return pph_data_structures.pph_phrase_info_set(paragraph, (SubLObject)pph_document.$kw31$TOPIC, topic);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 19822L)
    public static SubLObject pph_paragraph_topic(final SubLObject paragraph) {
        return pph_data_structures.pph_phrase_info_lookup(paragraph, (SubLObject)pph_document.$kw31$TOPIC, pph_phrase.pph_unknown_cycl());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 19988L)
    public static SubLObject pph_paragraph_doneP(final SubLObject paragraph) {
        SubLObject unfinished_sentenceP = (SubLObject)pph_document.NIL;
        SubLObject sentence_num = (SubLObject)pph_document.ZERO_INTEGER;
        if (document.sign_constituents(paragraph).isVector()) {
            final SubLObject vector_var = document.sign_constituents(paragraph);
            final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sentence;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                sentence = Vectors.aref(vector_var, element_num);
                if (pph_document.NIL == pph_sentence.pph_sentence_doneP(sentence)) {
                    unfinished_sentenceP = (SubLObject)pph_document.T;
                }
                sentence_num = Numbers.add(sentence_num, (SubLObject)pph_document.ONE_INTEGER);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(pph_document.NIL == unfinished_sentenceP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 20298L)
    public static SubLObject pph_paragraph_demerits(final SubLObject paragraph) {
        return pph_phrase.pph_phrase_demerits(paragraph);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 20438L)
    public static SubLObject pph_paragraph_remove_sentence(final SubLObject paragraph, final SubLObject sentence) {
        return pph_phrase.pph_phrase_remove_dtr(paragraph, sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 20648L)
    public static SubLObject pph_paragraph_generate(final SubLObject paragraph, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == pph_document.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_document.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_document.UNPROVIDED) {
            mode = (SubLObject)pph_document.$kw2$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject use_bulletsP = Numbers.numL(pph_vars.$pph_use_bulleted_lists_min_level$.getDynamicValue(thread), (SubLObject)pph_document.ONE_INTEGER);
        if (pph_document.NIL != pph_macros.pph_discourse_context_initializedP()) {
            pph_drs.pph_ensure_discourse_participant_rms();
            SubLObject sentence_num = (SubLObject)pph_document.ZERO_INTEGER;
            if (document.sign_constituents(paragraph).isVector()) {
                final SubLObject vector_var = document.sign_constituents(paragraph);
                final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject sentence;
                SubLObject topic;
                SubLObject discourse_referents;
                SubLObject _prev_bind_0;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                    element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                    sentence = Vectors.aref(vector_var, element_num);
                    if (pph_document.NIL != pph_phrase.pph_unknown_cycl_p(pph_sentence.pph_sentence_topic(sentence))) {
                        topic = pph_sentence_topic_from_paragraph(sentence);
                        if (pph_document.NIL != pph_phrase.pph_known_cycl_p(topic)) {
                            pph_sentence.pph_sentence_set_topic(sentence, topic);
                        }
                    }
                    discourse_referents = Mapping.mapcar((SubLObject)pph_document.$sym32$PPH_RM_CYCL, pph_drs.pph_discourse_context_rms((SubLObject)pph_document.UNPROVIDED));
                    _prev_bind_0 = pph_vars.$definite_description_licensed_terms$.currentBinding(thread);
                    try {
                        pph_vars.$definite_description_licensed_terms$.bind(ConsesLow.append(pph_vars.$definite_description_licensed_terms$.getDynamicValue(thread), discourse_referents), thread);
                        pph_sentence.pph_sentence_generate(sentence, language_mt, domain_mt, mode);
                    }
                    finally {
                        pph_vars.$definite_description_licensed_terms$.rebind(_prev_bind_0, thread);
                    }
                    if (pph_document.NIL != use_bulletsP && pph_document.NIL == string_utilities.substringP(pph_methods_formulas.pph_start_list_tag((SubLObject)pph_document.UNPROVIDED), pph_sentence.pph_sentence_string(sentence, (SubLObject)pph_document.UNPROVIDED), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) {
                        pph_sentence.pph_sentence_set_output_list(sentence, (SubLObject)ConsesLow.cons(pph_methods_formulas.pph_start_list_item_item(), list_utilities.add_to_end(pph_methods_formulas.pph_end_list_item_item(), pph_sentence.pph_sentence_output_list(sentence))));
                    }
                    sentence_num = Numbers.add(sentence_num, (SubLObject)pph_document.ONE_INTEGER);
                }
            }
        }
        else {
            final SubLObject _prev_bind_2 = pph_vars.$pph_discourse_context$.currentBinding(thread);
            try {
                pph_vars.$pph_discourse_context$.bind(pph_drs.new_pph_discourse_context(), thread);
                pph_macros.herald_new_discourse_context();
                try {
                    pph_drs.pph_ensure_discourse_participant_rms();
                    SubLObject sentence_num2 = (SubLObject)pph_document.ZERO_INTEGER;
                    if (document.sign_constituents(paragraph).isVector()) {
                        final SubLObject vector_var2 = document.sign_constituents(paragraph);
                        final SubLObject backwardP_var2 = (SubLObject)pph_document.NIL;
                        SubLObject length2;
                        SubLObject v_iteration2;
                        SubLObject element_num2;
                        SubLObject sentence2;
                        SubLObject topic2;
                        SubLObject discourse_referents2;
                        SubLObject _prev_bind_0_$2;
                        for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)pph_document.NIL, v_iteration2 = (SubLObject)pph_document.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)pph_document.ONE_INTEGER)) {
                            element_num2 = ((pph_document.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)pph_document.ONE_INTEGER) : v_iteration2);
                            sentence2 = Vectors.aref(vector_var2, element_num2);
                            if (pph_document.NIL != pph_phrase.pph_unknown_cycl_p(pph_sentence.pph_sentence_topic(sentence2))) {
                                topic2 = pph_sentence_topic_from_paragraph(sentence2);
                                if (pph_document.NIL != pph_phrase.pph_known_cycl_p(topic2)) {
                                    pph_sentence.pph_sentence_set_topic(sentence2, topic2);
                                }
                            }
                            discourse_referents2 = Mapping.mapcar((SubLObject)pph_document.$sym32$PPH_RM_CYCL, pph_drs.pph_discourse_context_rms((SubLObject)pph_document.UNPROVIDED));
                            _prev_bind_0_$2 = pph_vars.$definite_description_licensed_terms$.currentBinding(thread);
                            try {
                                pph_vars.$definite_description_licensed_terms$.bind(ConsesLow.append(pph_vars.$definite_description_licensed_terms$.getDynamicValue(thread), discourse_referents2), thread);
                                pph_sentence.pph_sentence_generate(sentence2, language_mt, domain_mt, mode);
                            }
                            finally {
                                pph_vars.$definite_description_licensed_terms$.rebind(_prev_bind_0_$2, thread);
                            }
                            if (pph_document.NIL != use_bulletsP && pph_document.NIL == string_utilities.substringP(pph_methods_formulas.pph_start_list_tag((SubLObject)pph_document.UNPROVIDED), pph_sentence.pph_sentence_string(sentence2, (SubLObject)pph_document.UNPROVIDED), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) {
                                pph_sentence.pph_sentence_set_output_list(sentence2, (SubLObject)ConsesLow.cons(pph_methods_formulas.pph_start_list_item_item(), list_utilities.add_to_end(pph_methods_formulas.pph_end_list_item_item(), pph_sentence.pph_sentence_output_list(sentence2))));
                            }
                            sentence_num2 = Numbers.add(sentence_num2, (SubLObject)pph_document.ONE_INTEGER);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_macros.herald_end_of_discourse_context();
                        pph_macros.clear_pph_discourse_context();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            }
            finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_2, thread);
            }
        }
        if (pph_document.NIL != use_bulletsP) {
            final SubLObject first_sentence = pph_phrase.pph_phrase_nth_dtr(paragraph, (SubLObject)pph_document.ZERO_INTEGER);
            pph_sentence.pph_sentence_set_output_list(first_sentence, (SubLObject)ConsesLow.cons(pph_methods_formulas.pph_start_list_item((SubLObject)pph_document.UNPROVIDED), pph_sentence.pph_sentence_output_list(first_sentence)));
            final SubLObject end_list_dtr = pph_sentence.new_pph_sentence((SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
            pph_sentence.pph_sentence_set_output_list(end_list_dtr, (SubLObject)ConsesLow.list(pph_methods_formulas.pph_end_list_item((SubLObject)pph_document.UNPROVIDED)));
            pph_phrase.pph_phrase_note_done(end_list_dtr);
            pph_phrase.pph_phrase_append(end_list_dtr, paragraph);
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 22192L)
    public static SubLObject pph_sentence_topic_from_paragraph(final SubLObject sentence) {
        final SubLObject topic = pph_phrase.pph_unknown_cycl();
        SubLObject paragraph;
        for (paragraph = pph_phrase.pph_phrase_mother(sentence); pph_document.NIL != paragraph && pph_document.NIL == pph_paragraph_p(paragraph); paragraph = pph_phrase.pph_phrase_mother(paragraph)) {}
        if (pph_document.NIL != pph_paragraph_p(paragraph)) {
            final SubLObject p_topic = pph_paragraph_topic(paragraph);
            final SubLObject siblings = pph_phrase.pph_phrase_dtrs(pph_phrase.pph_phrase_mother(sentence));
            final SubLObject sentence_position = Sequences.position(sentence, siblings, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
            if (pph_document.NIL != sentence_position && sentence_position.isPositive()) {
                final SubLObject previous_sentence = Vectors.aref(siblings, number_utilities.f_1_(sentence_position));
                SubLObject cdolist_list_var = cycl_utilities.expression_gather(pph_sentence.pph_sentence_cycl(previous_sentence), (SubLObject)pph_document.$sym33$FORT_P, (SubLObject)pph_document.T, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
                SubLObject s_topic = (SubLObject)pph_document.NIL;
                s_topic = cdolist_list_var.first();
                while (pph_document.NIL != cdolist_list_var) {
                    if (pph_document.NIL != cycl_utilities.expression_find(s_topic, pph_sentence.pph_sentence_cycl(sentence), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) {
                        return s_topic;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    s_topic = cdolist_list_var.first();
                }
            }
            if (pph_document.NIL != cycl_utilities.expression_find(p_topic, pph_sentence.pph_sentence_cycl(sentence), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) {
                return p_topic;
            }
        }
        return topic;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 23077L)
    public static SubLObject pph_paragraph_remove_duplicates_and_failures(final SubLObject paragraph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_strings = (SubLObject)pph_document.NIL;
        SubLObject done_sentences = (SubLObject)pph_document.NIL;
        SubLObject sentences_to_omit = (SubLObject)pph_document.NIL;
        SubLObject failed_sentences = (SubLObject)pph_document.NIL;
        SubLObject dtr_num = (SubLObject)pph_document.ZERO_INTEGER;
        if (document.sign_constituents(paragraph).isVector()) {
            final SubLObject vector_var = document.sign_constituents(paragraph);
            final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sentence;
            SubLObject sentence_string;
            SubLObject sentence_cycl;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                sentence = Vectors.aref(vector_var, element_num);
                sentence_string = pph_sentence.pph_sentence_string(sentence, (SubLObject)pph_document.T);
                if (pph_document.NIL == pph_sentence.pph_sentence_doneP(sentence)) {
                    sentence_cycl = pph_sentence.pph_sentence_cycl(sentence);
                    if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_document.$str34$Failed_to_paraphrase__S, sentence_cycl);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    if (pph_document.NIL != pph_vars.pph_too_many_demerits_p(number_utilities.positive_infinity(), (SubLObject)pph_document.UNPROVIDED) && pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                        Errors.warn((SubLObject)pph_document.$str35$Probably_too_many_demerits_____S, sentence_cycl);
                        streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                    }
                    sentences_to_omit = (SubLObject)ConsesLow.cons(sentence, sentences_to_omit);
                    failed_sentences = (SubLObject)ConsesLow.cons(sentence_cycl, failed_sentences);
                }
                else if (pph_document.NIL != subl_promotions.memberP(sentence_string, sentence_strings, Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.UNPROVIDED)) {
                    sentences_to_omit = (SubLObject)ConsesLow.cons(sentence, sentences_to_omit);
                }
                else if (pph_document.NIL != subl_promotions.memberP(sentence, done_sentences, (SubLObject)pph_document.$sym36$PPH_SENTENCES_SURFACE_EQUAL_MODULO_PRONOUNS_, (SubLObject)pph_document.UNPROVIDED)) {
                    sentences_to_omit = (SubLObject)ConsesLow.cons(sentence, sentences_to_omit);
                }
                else {
                    sentence_strings = (SubLObject)ConsesLow.cons(sentence_string, sentence_strings);
                    done_sentences = (SubLObject)ConsesLow.cons(sentence, done_sentences);
                }
                dtr_num = Numbers.add(dtr_num, (SubLObject)pph_document.ONE_INTEGER);
            }
        }
        SubLObject cdolist_list_var = sentences_to_omit;
        SubLObject sentence_to_omit = (SubLObject)pph_document.NIL;
        sentence_to_omit = cdolist_list_var.first();
        while (pph_document.NIL != cdolist_list_var) {
            pph_paragraph_remove_sentence(paragraph, sentence_to_omit);
            cdolist_list_var = cdolist_list_var.rest();
            sentence_to_omit = cdolist_list_var.first();
        }
        return failed_sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 24285L)
    public static SubLObject pph_paragraph_attempt_to_consolidate_sentences(final SubLObject paragraph) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject previous_sentence = misc_utilities.uninitialized();
        final SubLObject _prev_bind_0 = pph_sentence.$dont_generate_multi_clause_sentenceP$.currentBinding(thread);
        try {
            pph_sentence.$dont_generate_multi_clause_sentenceP$.bind((SubLObject)pph_document.T, thread);
            SubLObject to_remove = (SubLObject)pph_document.NIL;
            if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER)) {
                format_nil.force_format((SubLObject)pph_document.T, (SubLObject)pph_document.$str37$__Attempting_to_consolidate_parag, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
            }
            SubLObject sentence_num = (SubLObject)pph_document.ZERO_INTEGER;
            if (document.sign_constituents(paragraph).isVector()) {
                final SubLObject vector_var = document.sign_constituents(paragraph);
                final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject element_num;
                SubLObject this_sentence;
                SubLObject new_removal;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                    element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                    this_sentence = Vectors.aref(vector_var, element_num);
                    new_removal = (SubLObject)pph_document.NIL;
                    if (pph_document.NIL != misc_utilities.initialized_p(previous_sentence)) {
                        new_removal = pph_attempt_consolidation(previous_sentence, this_sentence);
                        if (pph_document.NIL == new_removal && pph_document.NIL != pph_document.$pph_attempt_reverse_consolidationP$.getGlobalValue()) {
                            new_removal = pph_attempt_consolidation(this_sentence, previous_sentence);
                            if (pph_document.NIL != new_removal && pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER)) {
                                format_nil.force_format((SubLObject)pph_document.T, (SubLObject)pph_document.$str38$Performed_reverse_consolidation__, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
                            }
                        }
                    }
                    if (pph_document.NIL != new_removal) {
                        to_remove = (SubLObject)ConsesLow.cons(new_removal, to_remove);
                    }
                    if (!new_removal.eql(this_sentence)) {
                        previous_sentence = this_sentence;
                    }
                    sentence_num = Numbers.add(sentence_num, (SubLObject)pph_document.ONE_INTEGER);
                }
            }
            SubLObject cdolist_list_var = to_remove;
            SubLObject sentence = (SubLObject)pph_document.NIL;
            sentence = cdolist_list_var.first();
            while (pph_document.NIL != cdolist_list_var) {
                pph_phrase.pph_phrase_remove_dtr(paragraph, sentence);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
        }
        finally {
            pph_sentence.$dont_generate_multi_clause_sentenceP$.rebind(_prev_bind_0, thread);
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 25272L)
    public static SubLObject pph_attempt_consolidation(final SubLObject previous_sentence, final SubLObject this_sentence) {
        if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER)) {
            format_nil.force_format((SubLObject)pph_document.T, (SubLObject)pph_document.$str39$__Attempting_to_consolidate____S_, pph_sentence.pph_sentence_string(previous_sentence, (SubLObject)pph_document.NIL), pph_sentence.pph_sentence_string(this_sentence, (SubLObject)pph_document.NIL), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
        }
        SubLObject to_remove = (SubLObject)pph_document.NIL;
        if (pph_document.NIL != misc_utilities.initialized_p(previous_sentence)) {
            if (pph_document.NIL != pph_sentence.pph_sentence_has_same_subjectP(previous_sentence, this_sentence) && pph_document.NIL != pph_sentence.pph_sentence_starts_withP(this_sentence, pph_sentence.pph_sentence_truncated_phrases(previous_sentence)) && pph_document.NIL != pph_sentence.pph_subject_ok_to_distribute_across_andP(pph_sentence.pph_sentence_subject(previous_sentence))) {
                pph_consolidate_sentences_with_same_subject(previous_sentence, this_sentence);
                to_remove = this_sentence;
            }
            else if (pph_document.NIL != pph_sentence.pph_sentences_differ_only_in_subjectP(previous_sentence, this_sentence)) {
                if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER)) {
                    format_nil.force_format((SubLObject)pph_document.T, (SubLObject)pph_document.$str40$Differ_only_in_subject_____S____S, pph_sentence.pph_sentence_string(previous_sentence, (SubLObject)pph_document.NIL), pph_sentence.pph_sentence_string(this_sentence, (SubLObject)pph_document.NIL), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
                }
                pph_sentence.pph_sentence_adjoin_additional_subject(previous_sentence, pph_sentence.pph_sentence_subject(this_sentence));
                to_remove = this_sentence;
            }
            else if (pph_document.NIL != pph_sentence.pph_sentence_ends_with_subject_ofP(previous_sentence, this_sentence)) {
                Errors.warn((SubLObject)pph_document.$str41$Introducing_relative_clause_to_co, pph_string.pph_string_to_utf8(pph_sentence.pph_sentence_string(previous_sentence, (SubLObject)pph_document.NIL)), pph_string.pph_string_to_utf8(pph_sentence.pph_sentence_string(this_sentence, (SubLObject)pph_document.NIL)));
                final SubLObject new_string = pph_sentence.pph_sentence_introduce_relative_clause(previous_sentence, this_sentence);
                Errors.warn((SubLObject)pph_document.$str42$Result___S, pph_string.pph_string_to_utf8(new_string));
                pph_sentence.pph_sentence_set_cycl(previous_sentence, simplifier.conjoin((SubLObject)ConsesLow.list(pph_sentence.pph_sentence_cycl(previous_sentence), pph_sentence.pph_sentence_cycl(this_sentence)), (SubLObject)pph_document.T));
                to_remove = this_sentence;
            }
            else if (cycl_utilities.formula_arg0(pph_sentence.pph_sentence_cycl(previous_sentence)).equal(cycl_utilities.formula_arg0(pph_sentence.pph_sentence_cycl(this_sentence))) && cycl_utilities.expression_gather(pph_sentence.pph_sentence_cycl(previous_sentence), (SubLObject)pph_document.$sym43$PREDICATE_P, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED).equal(cycl_utilities.expression_gather(pph_sentence.pph_sentence_cycl(this_sentence), (SubLObject)pph_document.$sym43$PREDICATE_P, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED)) && pph_document.NIL != list_utilities.non_empty_list_p(pph_sentence.pph_sentence_main_clause_dtr_list(this_sentence))) {
                pph_sentence.pph_sentence_conjoin_roots(previous_sentence, this_sentence);
                to_remove = this_sentence;
            }
        }
        return to_remove;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 27598L)
    public static SubLObject pph_consolidate_sentences_with_same_subject(final SubLObject previous_sentence, final SubLObject this_sentence) {
        final SubLObject prev_string = pph_sentence.pph_sentence_string(previous_sentence, (SubLObject)pph_document.NIL);
        final SubLObject this_string = pph_sentence.pph_sentence_string(this_sentence, (SubLObject)pph_document.NIL);
        Errors.warn((SubLObject)pph_document.$str44$Conjoining__S___and__S, pph_string.pph_string_to_utf8(prev_string), pph_string.pph_string_to_utf8(this_string));
        final SubLObject head_verb_okayP = pph_sentence.pph_subject_compatible_with_verbP(pph_sentence.pph_sentence_subject(previous_sentence), pph_sentence.pph_sentence_head_verb(this_sentence));
        if (prev_string.equal(this_string)) {
            return previous_sentence;
        }
        if (pph_document.NIL != head_verb_okayP && pph_document.NIL != pph_sentence.pph_sentence_okay_for_restrictive_rel_clauseP(previous_sentence)) {
            final SubLObject new_string = pph_sentence.pph_sentence_introduce_restrictive_rel_clause(previous_sentence, this_sentence);
            Errors.warn((SubLObject)pph_document.$str45$Introduced_restrictive_relative_c, pph_string.pph_string_to_utf8(new_string));
            pph_sentence.pph_sentence_set_cycl(previous_sentence, simplifier.conjoin((SubLObject)ConsesLow.list(pph_sentence.pph_sentence_cycl(previous_sentence), pph_sentence.pph_sentence_cycl(this_sentence)), (SubLObject)pph_document.T));
        }
        else if (pph_document.NIL == head_verb_okayP || pph_document.NIL != pph_predicate_is_coordination_restrictedP(cycl_utilities.formula_arg0(pph_sentence.pph_sentence_cycl(previous_sentence)))) {
            pph_sentence.pph_sentence_conjoin_roots(previous_sentence, this_sentence);
        }
        else {
            pph_sentence.pph_sentence_conjoin_main_vp(previous_sentence, this_sentence);
        }
        pph_sentence.pph_sentence_set_cycl(previous_sentence, simplifier.conjoin((SubLObject)ConsesLow.list(pph_sentence.pph_sentence_cycl(previous_sentence), pph_sentence.pph_sentence_cycl(this_sentence)), (SubLObject)pph_document.T));
        return previous_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 29098L)
    public static SubLObject pph_html_paragraph_print(final SubLObject paragraph, SubLObject new_paragraphP) {
        if (new_paragraphP == pph_document.UNPROVIDED) {
            new_paragraphP = (SubLObject)pph_document.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_document.NIL != new_paragraphP) {
            html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
            pph_paragraph_print(paragraph, html_macros.$html_stream$.getDynamicValue(thread));
            html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
        }
        else {
            pph_paragraph_print(paragraph, html_macros.$html_stream$.getDynamicValue(thread));
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 29365L)
    public static SubLObject pph_paragraph_print(final SubLObject paragraph, SubLObject stream) {
        if (stream == pph_document.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject sentence_count = pph_phrase.pph_phrase_dtr_count(paragraph);
        SubLObject sentence_num = (SubLObject)pph_document.ZERO_INTEGER;
        if (document.sign_constituents(paragraph).isVector()) {
            final SubLObject vector_var = document.sign_constituents(paragraph);
            final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject sentence;
            SubLObject sentence_string;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                sentence = Vectors.aref(vector_var, element_num);
                sentence_string = pph_sentence.pph_sentence_string(sentence, (SubLObject)pph_document.T);
                print_high.princ(pph_string.pph_string_if_non_null_to_output_format(sentence_string, (SubLObject)pph_document.UNPROVIDED), stream);
                if (sentence_count.numG(number_utilities.f_1X(sentence_num))) {
                    print_high.princ((SubLObject)pph_document.$str12$_, stream);
                }
                sentence_num = Numbers.add(sentence_num, (SubLObject)pph_document.ONE_INTEGER);
            }
        }
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 29844L)
    public static SubLObject pph_paraphrase_justification(final SubLObject conclusion, final SubLObject justification, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == pph_document.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_document.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_document.UNPROVIDED) {
            mode = (SubLObject)pph_document.$kw2$TEXT;
        }
        final SubLObject paragraph = pph_justification_paragraph_from_supports(conclusion, justification);
        pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
        pph_paragraph_print(paragraph, (SubLObject)pph_document.UNPROVIDED);
        return conclusion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 30465L)
    public static SubLObject pph_justification_paragraph_from_supports(final SubLObject conclusion, final SubLObject supports) {
        final SubLObject support_sentences = Mapping.mapcar((SubLObject)pph_document.$sym46$SUPPORT_SENTENCE, supports);
        final SubLObject processed_support_sentences = Mapping.mapcar((SubLObject)pph_document.$sym47$POSSIBLY_CONVERT_SUMMARY_SENTENCE_TO_CYCL, pph_process_cycl_sentences_for_summary(support_sentences));
        SubLObject pph_sentences = (SubLObject)pph_document.NIL;
        SubLObject cdolist_list_var = processed_support_sentences;
        SubLObject support_cycl = (SubLObject)pph_document.NIL;
        support_cycl = cdolist_list_var.first();
        while (pph_document.NIL != cdolist_list_var) {
            pph_sentences = (SubLObject)ConsesLow.cons(pph_sentence.pph_sentence_copy(pph_sentence.new_pph_sentence(support_cycl, (SubLObject)pph_document.$kw4$DECLARATIVE, (SubLObject)pph_document.UNPROVIDED), (SubLObject)pph_document.UNPROVIDED), pph_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            support_cycl = cdolist_list_var.first();
        }
        final SubLObject conclusion_cycl = el_utilities.make_unary_formula(pph_document.$const48$followsFromPrecedingDiscourse, conclusion);
        final SubLObject conclusion_sentence = pph_sentence.new_pph_sentence(conclusion_cycl, (SubLObject)pph_document.$kw4$DECLARATIVE, (SubLObject)pph_document.UNPROVIDED);
        pph_sentences = (SubLObject)ConsesLow.cons(conclusion_sentence, pph_sentences);
        return pph_paragraph_copy(new_pph_paragraph(conclusion, Sequences.nreverse(pph_sentences)), (SubLObject)pph_document.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 31384L)
    public static SubLObject pph_summarize_term(final SubLObject v_term, final SubLObject raw_summary_sentences, SubLObject language_mt, SubLObject domain_mt, SubLObject mode, SubLObject truncate_initial_sentenceP) {
        if (language_mt == pph_document.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_document.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_document.UNPROVIDED) {
            mode = (SubLObject)pph_document.$kw2$TEXT;
        }
        if (truncate_initial_sentenceP == pph_document.UNPROVIDED) {
            truncate_initial_sentenceP = (SubLObject)pph_document.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert pph_document.NIL != Types.listp(raw_summary_sentences) : raw_summary_sentences;
        assert pph_document.NIL != hlmt.hlmt_p(language_mt) : language_mt;
        assert pph_document.NIL != hlmt.hlmt_p(domain_mt) : domain_mt;
        if (pph_document.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && pph_document.NIL == list_utilities.lengthG(raw_summary_sentences, (SubLObject)pph_document.ZERO_INTEGER, (SubLObject)pph_document.UNPROVIDED)) {
            Errors.error((SubLObject)pph_document.$str50$Can_t_make_a_summary_with_no_inpu);
        }
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_language_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            SubLObject string = (SubLObject)pph_document.NIL;
            SubLObject failed_sentences = (SubLObject)pph_document.NIL;
            SubLObject sentence_paraphrases = (SubLObject)pph_document.NIL;
            final SubLObject _prev_bind_0_$4 = pph_document.$pph_summary_sentence_sources$.currentBinding(thread);
            try {
                pph_document.$pph_summary_sentence_sources$.bind((SubLObject)(pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread).isList() ? pph_document.$pph_summary_sentence_sources$.getDynamicValue(thread) : pph_document.NIL), thread);
                final SubLObject summary_sentences = pph_process_cycl_sentences_for_summary(conses_high.copy_list(raw_summary_sentences));
                if (mode == pph_document.$kw51$HTML && (pph_document.NIL != list_utilities.lengthG(raw_summary_sentences, (SubLObject)pph_document.TWO_INTEGER, (SubLObject)pph_document.UNPROVIDED) || pph_document.NIL != list_utilities.lengthG(summary_sentences, (SubLObject)pph_document.ONE_INTEGER, (SubLObject)pph_document.UNPROVIDED)) && pph_document.NIL != pph_summary_sentences_share_predP(summary_sentences)) {
                    thread.resetMultipleValues();
                    final SubLObject string_$5 = pph_summarize_term_bulleted(v_term, summary_sentences, language_mt, domain_mt);
                    final SubLObject failed_sentences_$6 = thread.secondMultipleValue();
                    final SubLObject sentence_paraphrases_$7 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    string = string_$5;
                    failed_sentences = failed_sentences_$6;
                    sentence_paraphrases = sentence_paraphrases_$7;
                }
                else {
                    thread.resetMultipleValues();
                    final SubLObject string_$6 = pph_summarize_term_with_paragraph(v_term, summary_sentences, language_mt, domain_mt, mode, truncate_initial_sentenceP);
                    final SubLObject failed_sentences_$7 = thread.secondMultipleValue();
                    final SubLObject sentence_paraphrases_$8 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    string = string_$6;
                    failed_sentences = failed_sentences_$7;
                    sentence_paraphrases = sentence_paraphrases_$8;
                }
            }
            finally {
                pph_document.$pph_summary_sentence_sources$.rebind(_prev_bind_0_$4, thread);
            }
            return Values.values(string, failed_sentences, sentence_paraphrases);
        }
        finally {
            pph_vars.$pph_language_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 33183L)
    public static SubLObject pph_summarize_term_bulleted(final SubLObject v_term, final SubLObject summary_sentences, final SubLObject language_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence_paraphrases = (SubLObject)pph_document.NIL;
        SubLObject failed_sentences = (SubLObject)pph_document.NIL;
        final SubLObject max = pph_summary_max_sentences_for_same_pred();
        SubLObject number_done = (SubLObject)pph_document.ZERO_INTEGER;
        SubLObject enoughP = (SubLObject)pph_document.NIL;
        SubLObject string = (SubLObject)pph_document.NIL;
        if (pph_document.NIL != pph_macros.pph_discourse_context_initializedP()) {
            pph_drs.pph_ensure_discourse_participant_rms();
            final SubLObject _prev_bind_0 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_2 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_document.T, thread);
                try {
                    if (pph_document.NIL == enoughP) {
                        SubLObject csome_list_var = summary_sentences;
                        SubLObject summary_sentence = (SubLObject)pph_document.NIL;
                        summary_sentence = csome_list_var.first();
                        while (pph_document.NIL == enoughP && pph_document.NIL != csome_list_var) {
                            final SubLObject cycl_sentence = fact_sheets.summary_sentence_cycl(summary_sentence);
                            SubLObject paraphrase = pph_main.generate_text_wXsentential_force(cycl_sentence, (SubLObject)pph_document.$kw4$DECLARATIVE, (SubLObject)pph_document.$kw52$DEFAULT, language_mt, domain_mt, (SubLObject)pph_document.$kw51$HTML, (SubLObject)pph_document.UNPROVIDED);
                            if (pph_document.NIL != cycl_string.cycl_string_p(paraphrase)) {
                                paraphrase = pph_maybe_add_source_footnotes(cycl_sentence, paraphrase, domain_mt);
                                number_done = Numbers.add(number_done, (SubLObject)pph_document.ONE_INTEGER);
                                if (pph_document.NIL == conses_high.member(paraphrase, sentence_paraphrases, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.$sym53$CDR))) {
                                    sentence_paraphrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cycl_sentence, paraphrase), sentence_paraphrases);
                                }
                                enoughP = (SubLObject)SubLObjectFactory.makeBoolean(pph_document.NIL != max && pph_document.NIL != list_utilities.lengthG(sentence_paraphrases, max, (SubLObject)pph_document.UNPROVIDED));
                            }
                            else {
                                if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                                    Errors.warn((SubLObject)pph_document.$str54$Failed_to_generate__S, cycl_sentence);
                                    streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                }
                                failed_sentences = (SubLObject)ConsesLow.cons(summary_sentence, failed_sentences);
                            }
                            csome_list_var = csome_list_var.rest();
                            summary_sentence = csome_list_var.first();
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_2, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0, thread);
            }
        }
        else {
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
                        pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_document.T, thread);
                        try {
                            if (pph_document.NIL == enoughP) {
                                SubLObject csome_list_var2 = summary_sentences;
                                SubLObject summary_sentence2 = (SubLObject)pph_document.NIL;
                                summary_sentence2 = csome_list_var2.first();
                                while (pph_document.NIL == enoughP && pph_document.NIL != csome_list_var2) {
                                    final SubLObject cycl_sentence2 = fact_sheets.summary_sentence_cycl(summary_sentence2);
                                    SubLObject paraphrase2 = pph_main.generate_text_wXsentential_force(cycl_sentence2, (SubLObject)pph_document.$kw4$DECLARATIVE, (SubLObject)pph_document.$kw52$DEFAULT, language_mt, domain_mt, (SubLObject)pph_document.$kw51$HTML, (SubLObject)pph_document.UNPROVIDED);
                                    if (pph_document.NIL != cycl_string.cycl_string_p(paraphrase2)) {
                                        paraphrase2 = pph_maybe_add_source_footnotes(cycl_sentence2, paraphrase2, domain_mt);
                                        number_done = Numbers.add(number_done, (SubLObject)pph_document.ONE_INTEGER);
                                        if (pph_document.NIL == conses_high.member(paraphrase2, sentence_paraphrases, Symbols.symbol_function((SubLObject)pph_document.EQUAL), Symbols.symbol_function((SubLObject)pph_document.$sym53$CDR))) {
                                            sentence_paraphrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(cycl_sentence2, paraphrase2), sentence_paraphrases);
                                        }
                                        enoughP = (SubLObject)SubLObjectFactory.makeBoolean(pph_document.NIL != max && pph_document.NIL != list_utilities.lengthG(sentence_paraphrases, max, (SubLObject)pph_document.UNPROVIDED));
                                    }
                                    else {
                                        if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                                            Errors.warn((SubLObject)pph_document.$str54$Failed_to_generate__S, cycl_sentence2);
                                            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
                                        }
                                        failed_sentences = (SubLObject)ConsesLow.cons(summary_sentence2, failed_sentences);
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    summary_sentence2 = csome_list_var2.first();
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                pph_macros.destroy_new_pph_phrases();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                            }
                        }
                    }
                    finally {
                        pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_5, thread);
                        pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_4, thread);
                        pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$12, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        pph_macros.herald_end_of_discourse_context();
                        pph_macros.clear_pph_discourse_context();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                    }
                }
            }
            finally {
                pph_vars.$pph_discourse_context$.rebind(_prev_bind_0, thread);
            }
        }
        if (pph_document.NIL != enoughP) {
            SubLObject number_left_off = Numbers.subtract(Sequences.length(summary_sentences), number_done);
            if (number_left_off.isPositive()) {
                if (pph_document.ONE_INTEGER.eql(number_left_off)) {
                    sentence_paraphrases = sentence_paraphrases.rest();
                    number_left_off = Numbers.add(number_left_off, (SubLObject)pph_document.ONE_INTEGER);
                }
                final SubLObject string_$15 = Sequences.cconcatenate((SubLObject)pph_document.$str55$_, new SubLObject[] { format_nil.format_nil_s_no_copy(number_left_off), pph_document.$str56$_similar_sentences_ });
                sentence_paraphrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)pph_document.NIL, string_$15), sentence_paraphrases);
            }
        }
        if (pph_document.NIL != sentence_paraphrases) {
            sentence_paraphrases = Sequences.nreverse(sentence_paraphrases);
            string = pph_make_bulleted_list(list_utilities.alist_values(sentence_paraphrases));
        }
        return Values.values(string, failed_sentences, sentence_paraphrases);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 34953L)
    public static SubLObject pph_make_bulleted_list(final SubLObject texts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject string = (SubLObject)pph_document.NIL;
        SubLObject stream = (SubLObject)pph_document.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_document.UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)pph_document.T, thread);
                    SubLObject cdolist_list_var = texts;
                    SubLObject text = (SubLObject)pph_document.NIL;
                    text = cdolist_list_var.first();
                    while (pph_document.NIL != cdolist_list_var) {
                        html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)pph_document.UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)pph_document.T, thread);
                            html_utilities.html_markup(text);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        text = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)pph_document.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 35190L)
    public static SubLObject pph_summarize_term_with_paragraph(final SubLObject v_term, final SubLObject summary_sentences, final SubLObject language_mt, final SubLObject domain_mt, final SubLObject mode, final SubLObject truncate_initial_sentenceP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failed_sentences = (SubLObject)pph_document.NIL;
        SubLObject sentence_paraphrases = (SubLObject)pph_document.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_language_mt$.bind(language_mt, thread);
            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
            SubLObject string = (SubLObject)pph_document.NIL;
            final SubLObject _prev_bind_0_$18 = pph_macros.$new_pph_phrases$.currentBinding(thread);
            final SubLObject _prev_bind_1_$19 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
            final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
            try {
                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_document.T, thread);
                try {
                    final SubLObject paragraph = pph_summary_paragraph_from_cycl_sentences(v_term, summary_sentences);
                    final SubLObject first_sentence = pph_phrase.pph_phrase_nth_dtr(paragraph, (SubLObject)pph_document.ZERO_INTEGER);
                    SubLObject error_message = (SubLObject)pph_document.NIL;
                    final SubLObject _prev_bind_0_$19 = Errors.$continue_cerrorP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$20 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                    try {
                        Errors.$continue_cerrorP$.bind((SubLObject)pph_document.NIL, thread);
                        pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_document.T, thread);
                        if (pph_document.NIL != pph_error.pph_break_on_errorP()) {
                            final SubLObject _prev_bind_0_$20 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                            try {
                                pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)pph_document.NIL, thread);
                                pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
                            }
                            finally {
                                pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (pph_document.NIL != truncate_initial_sentenceP) {
                                pph_maybe_truncate_summary_sentence(v_term, first_sentence);
                            }
                            failed_sentences = pph_paragraph_remove_duplicates_and_failures(paragraph);
                            pph_paragraph_attempt_to_consolidate_sentences(paragraph);
                            SubLObject dtr_num = (SubLObject)pph_document.ZERO_INTEGER;
                            if (document.sign_constituents(paragraph).isVector()) {
                                final SubLObject vector_var = document.sign_constituents(paragraph);
                                final SubLObject backwardP_var = (SubLObject)pph_document.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject element_num;
                                SubLObject sentence;
                                SubLObject tagsP;
                                SubLObject sentence_string;
                                SubLObject sentence_cycl;
                                SubLObject new_string;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)pph_document.NIL, v_iteration = (SubLObject)pph_document.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)pph_document.ONE_INTEGER)) {
                                    element_num = ((pph_document.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)pph_document.ONE_INTEGER) : v_iteration);
                                    sentence = Vectors.aref(vector_var, element_num);
                                    tagsP = (SubLObject)pph_document.T;
                                    sentence_string = pph_sentence.pph_sentence_string(sentence, tagsP);
                                    sentence_cycl = pph_sentence.pph_sentence_cycl(sentence);
                                    new_string = pph_maybe_add_source_footnotes(sentence_cycl, pph_string.pph_string_if_non_null_to_output_format(sentence_string, (SubLObject)pph_document.UNPROVIDED), domain_mt);
                                    if (!sentence_string.equal(new_string)) {
                                        pph_phrase.pph_phrase_note_string(sentence, new_string, tagsP);
                                    }
                                    sentence_paraphrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sentence_cycl, new_string), sentence_paraphrases);
                                    dtr_num = Numbers.add(dtr_num, (SubLObject)pph_document.ONE_INTEGER);
                                }
                            }
                            if (pph_document.NIL != pph_paragraph_doneP(paragraph) || pph_document.NIL == pph_vars.pph_failure_is_an_option_p()) {
                                SubLObject stream = (SubLObject)pph_document.NIL;
                                try {
                                    stream = streams_high.make_private_string_output_stream();
                                    pph_paragraph_print(paragraph, stream);
                                    string = streams_high.get_output_stream_string(stream);
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        streams_high.close(stream, (SubLObject)pph_document.UNPROVIDED);
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                                    }
                                }
                            }
                        }
                        else {
                            try {
                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                final SubLObject _prev_bind_0_$22 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                    Errors.$error_handler$.bind((SubLObject)pph_document.$sym57$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                    try {
                                        final SubLObject _prev_bind_0_$23 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                                        try {
                                            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)pph_document.NIL, thread);
                                            pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
                                        }
                                        finally {
                                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_0_$23, thread);
                                        }
                                        if (pph_document.NIL != truncate_initial_sentenceP) {
                                            pph_maybe_truncate_summary_sentence(v_term, first_sentence);
                                        }
                                        failed_sentences = pph_paragraph_remove_duplicates_and_failures(paragraph);
                                        pph_paragraph_attempt_to_consolidate_sentences(paragraph);
                                        SubLObject dtr_num2 = (SubLObject)pph_document.ZERO_INTEGER;
                                        if (document.sign_constituents(paragraph).isVector()) {
                                            final SubLObject vector_var2 = document.sign_constituents(paragraph);
                                            final SubLObject backwardP_var2 = (SubLObject)pph_document.NIL;
                                            SubLObject length2;
                                            SubLObject v_iteration2;
                                            SubLObject element_num2;
                                            SubLObject sentence2;
                                            SubLObject tagsP2;
                                            SubLObject sentence_string2;
                                            SubLObject sentence_cycl2;
                                            SubLObject new_string2;
                                            for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)pph_document.NIL, v_iteration2 = (SubLObject)pph_document.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)pph_document.ONE_INTEGER)) {
                                                element_num2 = ((pph_document.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)pph_document.ONE_INTEGER) : v_iteration2);
                                                sentence2 = Vectors.aref(vector_var2, element_num2);
                                                tagsP2 = (SubLObject)pph_document.T;
                                                sentence_string2 = pph_sentence.pph_sentence_string(sentence2, tagsP2);
                                                sentence_cycl2 = pph_sentence.pph_sentence_cycl(sentence2);
                                                new_string2 = pph_maybe_add_source_footnotes(sentence_cycl2, pph_string.pph_string_if_non_null_to_output_format(sentence_string2, (SubLObject)pph_document.UNPROVIDED), domain_mt);
                                                if (!sentence_string2.equal(new_string2)) {
                                                    pph_phrase.pph_phrase_note_string(sentence2, new_string2, tagsP2);
                                                }
                                                sentence_paraphrases = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sentence_cycl2, new_string2), sentence_paraphrases);
                                                dtr_num2 = Numbers.add(dtr_num2, (SubLObject)pph_document.ONE_INTEGER);
                                            }
                                        }
                                        if (pph_document.NIL != pph_paragraph_doneP(paragraph) || pph_document.NIL == pph_vars.pph_failure_is_an_option_p()) {
                                            SubLObject stream2 = (SubLObject)pph_document.NIL;
                                            try {
                                                stream2 = streams_high.make_private_string_output_stream();
                                                pph_paragraph_print(paragraph, stream2);
                                                string = streams_high.get_output_stream_string(stream2);
                                            }
                                            finally {
                                                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                                                    final SubLObject _values2 = Values.getValuesAsVector();
                                                    streams_high.close(stream2, (SubLObject)pph_document.UNPROVIDED);
                                                    Values.restoreValuesFromVector(_values2);
                                                }
                                                finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            }
                                        }
                                    }
                                    catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, (SubLObject)pph_document.NIL);
                                    }
                                }
                                finally {
                                    Errors.$error_handler$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                            catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (error_message.isString() && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                                Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_document.$str58$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                            }
                        }
                    }
                    finally {
                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_1_$20, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        pph_macros.destroy_new_pph_phrases();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                    }
                }
            }
            finally {
                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$19, thread);
                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$18, thread);
            }
            return Values.values(string, failed_sentences, Sequences.nreverse(sentence_paraphrases));
        }
        finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 37023L)
    public static SubLObject pph_maybe_truncate_summary_sentence(final SubLObject v_term, final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject olist = pph_phrase.pph_phrase_output_list(sentence);
        final SubLObject copula_item = pph_find_summary_copula_item(v_term, olist);
        if (pph_document.NIL != pph_data_structures.pph_phrase_output_item_p(copula_item)) {
            final SubLObject new_olist = pph_truncate_summary_olist(olist, copula_item);
            pph_phrase.pph_phrase_set_output_list(sentence, new_olist, (SubLObject)pph_document.UNPROVIDED);
        }
        else if (pph_document.NIL != pph_error.pph_trace_level_exceeds_minimumP((SubLObject)pph_document.ONE_INTEGER) && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
            Errors.warn((SubLObject)pph_document.$str59$Can_t_truncate__S, sentence);
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 37453L)
    public static SubLObject pph_find_summary_copula_item(final SubLObject v_term, final SubLObject olist) {
        SubLObject copula_item = (SubLObject)pph_document.NIL;
        SubLObject found_termP = (SubLObject)pph_document.NIL;
        SubLObject stopP = (SubLObject)pph_document.NIL;
        if (pph_document.NIL == stopP) {
            SubLObject csome_list_var = olist;
            SubLObject item = (SubLObject)pph_document.NIL;
            item = csome_list_var.first();
            while (pph_document.NIL == stopP && pph_document.NIL != csome_list_var) {
                if (pph_document.NIL != found_termP && pph_document.NIL != pph_string_starts_with_copulaP(pph_data_structures.pph_phrase_output_item_string(item))) {
                    copula_item = item;
                    stopP = (SubLObject)pph_document.T;
                }
                else if (pph_data_structures.pph_phrase_output_item_cycl(item).eql(v_term)) {
                    found_termP = (SubLObject)pph_document.T;
                }
                else if (pph_document.NIL != found_termP && pph_document.NIL != pph_data_structures.pph_phrase_output_item_cycl(item)) {
                    stopP = (SubLObject)pph_document.T;
                }
                csome_list_var = csome_list_var.rest();
                item = csome_list_var.first();
            }
        }
        return copula_item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 38144L)
    public static SubLObject pph_english_copula_string_p(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && pph_document.NIL != conses_high.member(pph_document.$const60$BeAux, lexicon_accessors.pos_of_string(string, (SubLObject)pph_document.NIL, pph_vars.$pph_language_mt$.getDynamicValue(thread), (SubLObject)pph_document.UNPROVIDED), (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 38388L)
    public static SubLObject pph_string_starts_with_copulaP(final SubLObject string) {
        if (pph_document.NIL != pph_utilities.pph_english_contextP((SubLObject)pph_document.UNPROVIDED)) {
            final SubLObject first_word = pph_utilities.pph_first_word(string, (SubLObject)pph_document.UNPROVIDED);
            return pph_english_copula_string_p(first_word);
        }
        return (SubLObject)pph_document.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 38598L)
    public static SubLObject pph_truncate_summary_olist(final SubLObject olist, final SubLObject copula_item) {
        final SubLObject copula_string = pph_data_structures.pph_phrase_output_item_string(copula_item);
        final SubLObject first_space = Sequences.position((SubLObject)Characters.CHAR_space, copula_string, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
        SubLObject ans = olist.rest();
        if (first_space.isInteger()) {
            final SubLObject new_string = string_utilities.substring(copula_string, number_utilities.f_1X(first_space), (SubLObject)pph_document.UNPROVIDED);
            pph_data_structures.pph_phrase_output_item_set_string(copula_item, new_string);
        }
        while (pph_document.NIL != ans) {
            if (!ans.first().eql(copula_item)) {
                ans = ans.rest();
            }
            else {
                if (first_space.isInteger()) {
                    return ans;
                }
                return ans.rest();
            }
        }
        return olist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 39293L)
    public static SubLObject pph_summarize_fort(final SubLObject fort, SubLObject language_mt, SubLObject domain_mt, SubLObject mode) {
        if (language_mt == pph_document.UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == pph_document.UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        if (mode == pph_document.UNPROVIDED) {
            mode = (SubLObject)pph_document.$kw2$TEXT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)pph_document.NIL;
        final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            Errors.$continue_cerrorP$.bind((SubLObject)pph_document.NIL, thread);
            pph_error.$pph_error_handling_onP$.bind((SubLObject)pph_document.T, thread);
            if (pph_document.NIL != pph_error.pph_break_on_errorP()) {
                final SubLObject _prev_bind_0_$28 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                final SubLObject _prev_bind_3 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                try {
                    pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                    pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                    pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_document.T, thread);
                    try {
                        final SubLObject _prev_bind_0_$29 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$30 = pph_vars.$pph_language_mt$.currentBinding(thread);
                        try {
                            pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                            pph_vars.$pph_language_mt$.bind(language_mt, thread);
                            final SubLObject summary_assertions = pph_summary_assertions_for_fort(fort, domain_mt);
                            final SubLObject paragraph = pph_summary_paragraph_from_assertions(fort, summary_assertions);
                            pph_paragraph_generate(paragraph, language_mt, domain_mt, mode);
                            pph_paragraph_print(paragraph, (SubLObject)pph_document.UNPROVIDED);
                        }
                        finally {
                            pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$30, thread);
                            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            pph_macros.destroy_new_pph_phrases();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                        }
                    }
                }
                finally {
                    pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_3, thread);
                    pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$29, thread);
                    pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$28, thread);
                }
            }
            else {
                try {
                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$31 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind((SubLObject)pph_document.$sym57$CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            final SubLObject _prev_bind_0_$32 = pph_macros.$new_pph_phrases$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$31 = pph_macros.$new_pph_phrase_count$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = pph_macros.$destroy_new_pph_phrasesP$.currentBinding(thread);
                            try {
                                pph_macros.$new_pph_phrases$.bind(stacks.create_stack(), thread);
                                pph_macros.$new_pph_phrase_count$.bind(pph_macros.get_new_pph_phrase_count(), thread);
                                pph_macros.$destroy_new_pph_phrasesP$.bind((SubLObject)pph_document.T, thread);
                                try {
                                    final SubLObject _prev_bind_0_$33 = pph_vars.$pph_domain_mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$32 = pph_vars.$pph_language_mt$.currentBinding(thread);
                                    try {
                                        pph_vars.$pph_domain_mt$.bind(domain_mt, thread);
                                        pph_vars.$pph_language_mt$.bind(language_mt, thread);
                                        final SubLObject summary_assertions2 = pph_summary_assertions_for_fort(fort, domain_mt);
                                        final SubLObject paragraph2 = pph_summary_paragraph_from_assertions(fort, summary_assertions2);
                                        pph_paragraph_generate(paragraph2, language_mt, domain_mt, mode);
                                        pph_paragraph_print(paragraph2, (SubLObject)pph_document.UNPROVIDED);
                                    }
                                    finally {
                                        pph_vars.$pph_language_mt$.rebind(_prev_bind_1_$32, thread);
                                        pph_vars.$pph_domain_mt$.rebind(_prev_bind_0_$33, thread);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)pph_document.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        pph_macros.destroy_new_pph_phrases();
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                    }
                                }
                            }
                            finally {
                                pph_macros.$destroy_new_pph_phrasesP$.rebind(_prev_bind_4, thread);
                                pph_macros.$new_pph_phrase_count$.rebind(_prev_bind_1_$31, thread);
                                pph_macros.$new_pph_phrases$.rebind(_prev_bind_0_$32, thread);
                            }
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)pph_document.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$31, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && pph_document.NIL == pph_error.suppress_pph_warningsP()) {
                    Errors.warn(Sequences.cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), (SubLObject)pph_document.$str58$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        }
        finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
        }
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 39980L)
    public static SubLObject pph_summary_assertions_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        return pph_summary_isa_assertions_for_fort(fort, domain_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-document.lisp", position = 40108L)
    public static SubLObject pph_summary_isa_assertions_for_fort(final SubLObject fort, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)pph_document.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject all_isa_assertions = cdolist_list_var = kb_mapping.gather_gaf_arg_index_with_predicate(fort, (SubLObject)pph_document.ONE_INTEGER, pph_document.$const61$isa, (SubLObject)pph_document.UNPROVIDED, (SubLObject)pph_document.UNPROVIDED);
            SubLObject isa_assertion = (SubLObject)pph_document.NIL;
            isa_assertion = cdolist_list_var.first();
            while (pph_document.NIL != cdolist_list_var) {
                final SubLObject isa_coll = assertions_high.gaf_arg2(isa_assertion);
                if (pph_document.NIL == conses_high.member(isa_coll, assertions, Symbols.symbol_function((SubLObject)pph_document.EQUAL), (SubLObject)pph_document.$sym62$GAF_ARG2) && pph_document.NIL == conses_high.member(isa_coll, all_isa_assertions, (SubLObject)pph_document.$sym63$PPH_PROPER_SPEC_, (SubLObject)pph_document.$sym62$GAF_ARG2)) {
                    assertions = (SubLObject)ConsesLow.cons(isa_assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                isa_assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    public static SubLObject declare_pph_document_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_p", "PPH-PARAGRAPH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "new_pph_paragraph", "NEW-PPH-PARAGRAPH", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_copy", "PPH-PARAGRAPH-COPY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_paragraph_from_assertions", "PPH-SUMMARY-PARAGRAPH-FROM-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_test_paragraph_from_cycl_sentences", "PPH-TEST-PARAGRAPH-FROM-CYCL-SENTENCES", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_paragraph_from_cycl_sentences", "PPH-SUMMARY-PARAGRAPH-FROM-CYCL-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_max_sentences_for_same_pred", "PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "add_pph_summary_source", "ADD-PPH-SUMMARY-SOURCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_sentence_sources", "PPH-SUMMARY-SENTENCE-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_note_summary_sentence_sources", "PPH-NOTE-SUMMARY-SENTENCE-SOURCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_maybe_add_source_footnotes", "PPH-MAYBE-ADD-SOURCE-FOOTNOTES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_add_source_footnotes", "PPH-ADD-SOURCE-FOOTNOTES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_check_for_isomorphic_assertion_internal", "PPH-CHECK-FOR-ISOMORPHIC-ASSERTION-INTERNAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_check_for_isomorphic_assertion", "PPH-CHECK-FOR-ISOMORPHIC-ASSERTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_process_cycl_sentences_for_summary", "PPH-PROCESS-CYCL-SENTENCES-FOR-SUMMARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "sort_cycl_sentences_for_summary", "SORT-CYCL-SENTENCES-FOR-SUMMARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_sort_terms_to_coordinate", "PPH-SORT-TERMS-TO-COORDINATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_sentences_share_predP", "PPH-SUMMARY-SENTENCES-SHARE-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_sentence_pred", "PPH-SUMMARY-SENTENCE-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_sentence_arg", "PPH-SUMMARY-SENTENCE-ARG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_coordinated_sentenceP", "PPH-COORDINATED-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_coordinate_sentence", "PPH-COORDINATE-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_terms_to_coordinate", "PPH-TERMS-TO-COORDINATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_coordination_contraction_type_string", "PPH-COORDINATION-CONTRACTION-TYPE-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_coordination_contraction_type", "PPH-COORDINATION-CONTRACTION-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_predicate_is_coordination_restrictedP", "PPH-PREDICATE-IS-COORDINATION-RESTRICTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_get_coordination_fn", "PPH-GET-COORDINATION-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_find_coordinate_argnum", "PPH-FIND-COORDINATE-ARGNUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "cached_demerits_for_term", "CACHED-DEMERITS-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_coordination_matchP", "PPH-COORDINATION-MATCH?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_same_mt_time_indexP", "PPH-SAME-MT-TIME-INDEX?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_cycl_sentence_mt", "PPH-CYCL-SENTENCE-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_same_sourcesP", "PPH-SAME-SOURCES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_cycl_sentence_sources", "PPH-CYCL-SENTENCE-SOURCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_set_topic", "PPH-PARAGRAPH-SET-TOPIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_topic", "PPH-PARAGRAPH-TOPIC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_doneP", "PPH-PARAGRAPH-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_demerits", "PPH-PARAGRAPH-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_remove_sentence", "PPH-PARAGRAPH-REMOVE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_generate", "PPH-PARAGRAPH-GENERATE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_sentence_topic_from_paragraph", "PPH-SENTENCE-TOPIC-FROM-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_remove_duplicates_and_failures", "PPH-PARAGRAPH-REMOVE-DUPLICATES-AND-FAILURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_attempt_to_consolidate_sentences", "PPH-PARAGRAPH-ATTEMPT-TO-CONSOLIDATE-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_attempt_consolidation", "PPH-ATTEMPT-CONSOLIDATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_consolidate_sentences_with_same_subject", "PPH-CONSOLIDATE-SENTENCES-WITH-SAME-SUBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_html_paragraph_print", "PPH-HTML-PARAGRAPH-PRINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paragraph_print", "PPH-PARAGRAPH-PRINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_paraphrase_justification", "PPH-PARAPHRASE-JUSTIFICATION", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_justification_paragraph_from_supports", "PPH-JUSTIFICATION-PARAGRAPH-FROM-SUPPORTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summarize_term", "PPH-SUMMARIZE-TERM", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summarize_term_bulleted", "PPH-SUMMARIZE-TERM-BULLETED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_make_bulleted_list", "PPH-MAKE-BULLETED-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summarize_term_with_paragraph", "PPH-SUMMARIZE-TERM-WITH-PARAGRAPH", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_maybe_truncate_summary_sentence", "PPH-MAYBE-TRUNCATE-SUMMARY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_find_summary_copula_item", "PPH-FIND-SUMMARY-COPULA-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_english_copula_string_p", "PPH-ENGLISH-COPULA-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_string_starts_with_copulaP", "PPH-STRING-STARTS-WITH-COPULA?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_truncate_summary_olist", "PPH-TRUNCATE-SUMMARY-OLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summarize_fort", "PPH-SUMMARIZE-FORT", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_assertions_for_fort", "PPH-SUMMARY-ASSERTIONS-FOR-FORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_document", "pph_summary_isa_assertions_for_fort", "PPH-SUMMARY-ISA-ASSERTIONS-FOR-FORT", 2, 0, false);
        return (SubLObject)pph_document.NIL;
    }
    
    public static SubLObject init_pph_document_file() {
        pph_document.$pph_summary_max_sentences_for_same_pred$ = SubLFiles.defparameter("*PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED*", (SubLObject)pph_document.THREE_INTEGER);
        pph_document.$pph_track_summary_sourcesP$ = SubLFiles.defparameter("*PPH-TRACK-SUMMARY-SOURCES?*", (SubLObject)pph_document.NIL);
        pph_document.$pph_summary_sources$ = SubLFiles.defparameter("*PPH-SUMMARY-SOURCES*", (SubLObject)pph_document.NIL);
        pph_document.$pph_summary_sentence_sources$ = SubLFiles.defparameter("*PPH-SUMMARY-SENTENCE-SOURCES*", misc_utilities.uninitialized());
        pph_document.$pph_coordination_preds$ = SubLFiles.deflexical("*PPH-COORDINATION-PREDS*", (SubLObject)pph_document.$list21);
        pph_document.$pph_coordination_preds_blacklist$ = SubLFiles.deflexical("*PPH-COORDINATION-PREDS-BLACKLIST*", (SubLObject)pph_document.$list22);
        pph_document.$pph_assume_preds_allow_coordinationP$ = SubLFiles.defparameter("*PPH-ASSUME-PREDS-ALLOW-COORDINATION?*", (SubLObject)pph_document.T);
        pph_document.$pph_attempt_reverse_consolidationP$ = SubLFiles.deflexical("*PPH-ATTEMPT-REVERSE-CONSOLIDATION?*", (SubLObject)pph_document.T);
        return (SubLObject)pph_document.NIL;
    }
    
    public static SubLObject setup_pph_document_file() {
        memoization_state.note_memoized_function((SubLObject)pph_document.$sym6$PPH_CHECK_FOR_ISOMORPHIC_ASSERTION);
        return (SubLObject)pph_document.NIL;
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
    
    static {
        me = (SubLFile)new pph_document();
        pph_document.$pph_summary_max_sentences_for_same_pred$ = null;
        pph_document.$pph_track_summary_sourcesP$ = null;
        pph_document.$pph_summary_sources$ = null;
        pph_document.$pph_summary_sentence_sources$ = null;
        pph_document.$pph_coordination_preds$ = null;
        pph_document.$pph_coordination_preds_blacklist$ = null;
        pph_document.$pph_assume_preds_allow_coordinationP$ = null;
        pph_document.$pph_attempt_reverse_consolidationP$ = null;
        $sym0$PPH_SENTENCE_P = SubLObjectFactory.makeSymbol("PPH-SENTENCE-P");
        $sym1$PPH_SENTENCE_FROM_ASSERTION = SubLObjectFactory.makeSymbol("PPH-SENTENCE-FROM-ASSERTION");
        $kw2$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $sym3$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw4$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $sym5$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym6$PPH_CHECK_FOR_ISOMORPHIC_ASSERTION = SubLObjectFactory.makeSymbol("PPH-CHECK-FOR-ISOMORPHIC-ASSERTION");
        $const7$QuantificationalRuleMacroPredicat = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantificationalRuleMacroPredicate-Canonical"));
        $kw8$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $const9$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const10$MtTimeDimFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MtTimeDimFn"));
        $float11$2_5 = (SubLFloat)SubLObjectFactory.makeDouble(2.5);
        $str12$_ = SubLObjectFactory.makeString(" ");
        $str13$other_ = SubLObjectFactory.makeString("other ");
        $const14$plural = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("plural"));
        $str15$others = SubLObjectFactory.makeString("others");
        $sym16$INDIVIDUAL_ = SubLObjectFactory.makeSymbol("INDIVIDUAL?");
        $sym17$SPECS_FN_NAT_ = SubLObjectFactory.makeSymbol("SPECS-FN-NAT?");
        $sym18$PPH_MAKE_TYPE_LEVEL = SubLObjectFactory.makeSymbol("PPH-MAKE-TYPE-LEVEL");
        $sym19$PPH_CORE_TERM = SubLObjectFactory.makeSymbol("PPH-CORE-TERM");
        $sym20$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("bordersOn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("politiesBorderEachOther")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("internationalOrganizationMemberCountries")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ANY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)ConsesLow.list((SubLObject)pph_document.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"))), (SubLObject)ConsesLow.list((SubLObject)pph_document.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")))));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conceptuallyRelated")), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("between")), (SubLObject)pph_document.ONE_INTEGER, (SubLObject)pph_document.TWO_INTEGER), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionOverlapFraction")), (SubLObject)pph_document.TWO_INTEGER), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("connectedAtEnd")), (SubLObject)SubLObjectFactory.makeKeyword("ANY")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("affiliatedWith")), (SubLObject)SubLObjectFactory.makeKeyword("ANY")));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-FN"));
        $kw24$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const25$CycLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence"));
        $sym26$PPH_SPEC_ = SubLObjectFactory.makeSymbol("PPH-SPEC?");
        $const27$TheCoordinationSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCoordinationSet"));
        $str28$Cached_demerits__D_for__S = SubLObjectFactory.makeString("Cached demerits ~D for ~S");
        $const29$QuantitySlot = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuantitySlot"));
        $const30$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $kw31$TOPIC = SubLObjectFactory.makeKeyword("TOPIC");
        $sym32$PPH_RM_CYCL = SubLObjectFactory.makeSymbol("PPH-RM-CYCL");
        $sym33$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str34$Failed_to_paraphrase__S = SubLObjectFactory.makeString("Failed to paraphrase ~S");
        $str35$Probably_too_many_demerits_____S = SubLObjectFactory.makeString("Probably too many demerits:~% ~S");
        $sym36$PPH_SENTENCES_SURFACE_EQUAL_MODULO_PRONOUNS_ = SubLObjectFactory.makeSymbol("PPH-SENTENCES-SURFACE-EQUAL-MODULO-PRONOUNS?");
        $str37$__Attempting_to_consolidate_parag = SubLObjectFactory.makeString("~&Attempting to consolidate paragraph sentences.~%");
        $str38$Performed_reverse_consolidation__ = SubLObjectFactory.makeString("Performed reverse consolidation!!");
        $str39$__Attempting_to_consolidate____S_ = SubLObjectFactory.makeString("~&Attempting to consolidate~% ~S~% ~S");
        $str40$Differ_only_in_subject_____S____S = SubLObjectFactory.makeString("Differ only in subject:~% ~S~% ~S");
        $str41$Introducing_relative_clause_to_co = SubLObjectFactory.makeString("Introducing relative clause to consolidate~% ~S~% and ~S");
        $str42$Result___S = SubLObjectFactory.makeString("Result: ~S");
        $sym43$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $str44$Conjoining__S___and__S = SubLObjectFactory.makeString("Conjoining ~S~% and ~S");
        $str45$Introduced_restrictive_relative_c = SubLObjectFactory.makeString("Introduced restrictive relative clause:~% ~S");
        $sym46$SUPPORT_SENTENCE = SubLObjectFactory.makeSymbol("SUPPORT-SENTENCE");
        $sym47$POSSIBLY_CONVERT_SUMMARY_SENTENCE_TO_CYCL = SubLObjectFactory.makeSymbol("POSSIBLY-CONVERT-SUMMARY-SENTENCE-TO-CYCL");
        $const48$followsFromPrecedingDiscourse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("followsFromPrecedingDiscourse"));
        $sym49$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $str50$Can_t_make_a_summary_with_no_inpu = SubLObjectFactory.makeString("Can't make a summary with no input.");
        $kw51$HTML = SubLObjectFactory.makeKeyword("HTML");
        $kw52$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $sym53$CDR = SubLObjectFactory.makeSymbol("CDR");
        $str54$Failed_to_generate__S = SubLObjectFactory.makeString("Failed to generate ~S");
        $str55$_ = SubLObjectFactory.makeString("(");
        $str56$_similar_sentences_ = SubLObjectFactory.makeString(" similar sentences)");
        $sym57$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str58$___Top_level_CycL___S = SubLObjectFactory.makeString("~% Top-level CycL: ~S");
        $str59$Can_t_truncate__S = SubLObjectFactory.makeString("Can't truncate ~S");
        $const60$BeAux = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BeAux"));
        $const61$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $sym62$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $sym63$PPH_PROPER_SPEC_ = SubLObjectFactory.makeSymbol("PPH-PROPER-SPEC?");
    }
}

/*

	Total time: 768 ms
	
*/