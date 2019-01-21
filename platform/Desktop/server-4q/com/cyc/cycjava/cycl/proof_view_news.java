package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class proof_view_news extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.proof_view_news";
    public static final String myFingerPrint = "cf720921a547811791c4f6d1349c4a978bae957210ac2533e6361f1776c8e197";
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 976L)
    public static SubLSymbol $proof_view_story_label$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 10944L)
    private static SubLSymbol $proof_view_news_detail_last_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12671L)
    private static SubLSymbol $proof_view_story_coherence_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12736L)
    private static SubLSymbol $proof_view_story_meaninginess_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12802L)
    private static SubLSymbol $proof_view_story_depth_weight$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15468L)
    private static SubLSymbol $proof_view_story_section_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19722L)
    private static SubLSymbol $promising_news_query_sample_rate$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19869L)
    private static SubLSymbol $news_troller_daemon_abortP$;
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 25651L)
    public static SubLSymbol $proof_view_news_xsl_file$;
    private static final SubLString $str0$Story_;
    private static final SubLSymbol $kw1$STORY_ROOT;
    private static final SubLSymbol $sym2$PROOF_VIEW_ADD_STORY_SECTION;
    private static final SubLSymbol $kw3$STORY;
    private static final SubLObject $const4$CycProofViewStorySection;
    private static final SubLString $str5$;
    private static final SubLSymbol $kw6$HEADLINE;
    private static final SubLSymbol $kw7$IGNORE;
    private static final SubLSymbol $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS;
    private static final SubLString $str9$_S_is_trivial_in__S;
    private static final SubLString $str10$_S_is_irrelevant_in__S;
    private static final SubLSymbol $kw11$SUBHEADLINE;
    private static final SubLSymbol $kw12$JUSTIFICATION_ROOT;
    private static final SubLSymbol $sym13$THCL_FORT_;
    private static final SubLString $str14$__Main_actors___S__;
    private static final SubLString $str15$__Found__D_background_facts_for__;
    private static final SubLSymbol $sym16$_;
    private static final SubLSymbol $sym17$UNLEXIFIED_;
    private static final SubLSymbol $sym18$FORT_P;
    private static final SubLString $str19$Unlexified_FORT__S___in__S;
    private static final SubLString $str20$Trivial_fact__S;
    private static final SubLSymbol $kw21$SEEN_STORY_SENTENCES;
    private static final SubLSymbol $kw22$SUMMARY_ROOT;
    private static final SubLString $str23$__Current_paragraph_now_has__S_se;
    private static final SubLSymbol $sym24$SET_P;
    private static final SubLSymbol $sym25$PROOF_VIEW_STORY_DETAIL_SCORE;
    private static final SubLSymbol $sym26$_EXIT;
    private static final SubLSymbol $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE;
    private static final SubLFloat $float28$30_0;
    private static final SubLFloat $float29$1_0;
    private static final SubLFloat $float30$50_0;
    private static final SubLSymbol $kw31$STORY_SENTENCES_SO_FAR;
    private static final SubLSymbol $kw32$STORY_PARAGRAPH;
    private static final SubLString $str33$_S___coheres_with__S;
    private static final SubLSymbol $sym34$CYCL_DENOTATIONAL_TERM_P;
    private static final SubLString $str35$Reached_story_depth_cutoff_of__D_;
    private static final SubLList $list36;
    private static final SubLObject $const37$englishGloss;
    private static final SubLSymbol $sym38$SHOW_PROOF_VIEW_STORY_SECTION;
    private static final SubLSymbol $sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE;
    private static final SubLSymbol $sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE;
    private static final SubLSymbol $sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH;
    private static final SubLSymbol $sym42$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE;
    private static final SubLString $str43$pf_object;
    private static final SubLString $str44$story_body;
    private static final SubLString $str45$entry;
    private static final SubLString $str46$story_paragraph;
    private static final SubLInteger $int47$25;
    private static final SubLString $str48$News_Troller;
    private static final SubLSymbol $sym49$TROLL_FOR_NEWS;
    private static final SubLSymbol $sym50$DIRECTORY_P;
    private static final SubLString $str51$cdolist;
    private static final SubLSymbol $kw52$INPUT;
    private static final SubLString $str53$Unable_to_open__S;
    private static final SubLSymbol $kw54$EOF;
    private static final SubLString $str55$Read_invalid_query_info__s;
    private static final SubLSymbol $sym56$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str57$aries;
    private static final SubLString $str58$scorpio;
    private static final SubLString $str59$libra;
    private static final SubLString $str60$__Evaluating_queries_in__S__;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_;
    private static final SubLSymbol $kw63$BROWSABLE_;
    private static final SubLString $str64$__Got__D_answer__P_for__S__;
    private static final SubLInteger $int65$50;
    private static final SubLString $str66$__Evaluated__D_queries___;
    private static final SubLString $str67$Caught_error_running_promising_qu;
    private static final SubLSymbol $sym68$PPH_VAR_TYPING_CLAUSE_;
    private static final SubLSymbol $sym69$INVALID_FILE_NAME_CHAR;
    private static final SubLString $str70$_;
    private static final SubLString $str71$_xml;
    private static final SubLString $str72$UTF_8;
    private static final SubLString $str73$__xml_stylesheet_type__text_xsl__;
    private static final SubLString $str74$_cyc_projects_shell_DreamCatcherP;
    private static final SubLInteger $int75$1000;
    private static final SubLString $str76$proof_view_news;
    private static final SubLString $str77$Generated_news_story__D_character;
    private static final SubLSymbol $kw78$OUTPUT;
    private static final SubLString $str79$_xml_news_xsl;
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 818L)
    public static SubLObject headline_for_proof_conclusion(final SubLObject proof_conclusion) {
        return cycl_string.cycl_string_to_utf8_string(pph_headline.generate_english_headline_string(proof_conclusion, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 1152L)
    public static SubLObject proof_view_add_story_section(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject story_root_entry = proof_view_populator.proof_view_add_section_root(v_proof_view, proof_view_news.$proof_view_story_label$.getDynamicValue(thread));
        final SubLObject item_var = proof_view_news.$proof_view_story_label$.getDynamicValue(thread);
        if (proof_view_news.NIL == conses_high.member(item_var, proof_view.$proof_view_tab_entry_labels$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), Symbols.symbol_function((SubLObject)proof_view_news.IDENTITY))) {
            proof_view.$proof_view_tab_entry_labels$.setDynamicValue((SubLObject)ConsesLow.cons(item_var, proof_view.$proof_view_tab_entry_labels$.getDynamicValue(thread)), thread);
        }
        proof_view_build_story_section(story_root_entry);
        proof_view_populator.proof_view_entry_note_expand_initially(story_root_entry);
        if (proof_view_news.NIL != list_utilities.lengthG(proof_view.proof_view_entry_get_children(story_root_entry), (SubLObject)proof_view_news.ONE_INTEGER, (SubLObject)proof_view_news.UNPROVIDED)) {
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_news.$kw1$STORY_ROOT, story_root_entry);
        }
        else {
            proof_view_populator.proof_view_remove_entry(v_proof_view, story_root_entry);
        }
        return story_root_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 1795L)
    public static SubLObject proof_view_get_story_root_entry(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(root_entry);
        SubLObject child_entry = (SubLObject)proof_view_news.NIL;
        child_entry = cdolist_list_var.first();
        while (proof_view_news.NIL != cdolist_list_var) {
            if (proof_view.proof_view_entry_get_label(child_entry).equal(proof_view_news.$proof_view_story_label$.getDynamicValue(thread))) {
                return child_entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child_entry = cdolist_list_var.first();
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 2113L)
    public static SubLObject proof_view_build_story_section(final SubLObject story_root_entry) {
        final SubLObject headline_entry = maybe_add_proof_view_headline(story_root_entry);
        maybe_add_proof_view_subheadline(story_root_entry, headline_entry);
        final SubLObject lede_content = maybe_add_proof_view_lede(story_root_entry);
        maybe_add_proof_view_story_significance(story_root_entry);
        maybe_add_proof_view_story_actors_brief_background(story_root_entry, lede_content);
        maybe_add_proof_view_story_details(story_root_entry);
        return story_root_entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 2631L)
    public static SubLObject maybe_add_proof_view_headline(final SubLObject story_root_entry) {
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof_view.proof_view_get_proof(v_proof_view), (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject headline_content = proof_view_headline_content(proof_conclusion, v_proof_view);
        return proof_view_populator.proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_news.$str5$, story_root_entry, (SubLObject)proof_view_news.$kw6$HEADLINE, headline_content, (SubLObject)proof_view_news.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3033L)
    public static SubLObject proof_view_headline_content(final SubLObject proof_conclusion, SubLObject v_proof_view) {
        if (v_proof_view == proof_view_news.UNPROVIDED) {
            v_proof_view = (SubLObject)proof_view_news.NIL;
        }
        if (proof_view_news.NIL != el_utilities.el_conjunction_p(proof_conclusion)) {
            SubLObject best_conjunct = (SubLObject)proof_view_news.NIL;
            SubLObject best_conjunct_score = (SubLObject)proof_view_news.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(proof_conclusion, (SubLObject)proof_view_news.$kw7$IGNORE);
            SubLObject conjunct = (SubLObject)proof_view_news.NIL;
            conjunct = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                final SubLObject best_score = proof_view_headline_conjunct_score(conjunct);
                if (best_score.numG(best_conjunct_score)) {
                    best_conjunct = conjunct;
                    best_conjunct_score = best_score;
                }
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return best_conjunct;
        }
        return proof_conclusion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3601L)
    public static SubLObject proof_view_headline_conjunct_score(final SubLObject conjunct) {
        if (proof_view_news.NIL != pph_utilities.pph_var_typing_predicateP(cycl_utilities.formula_arg0(conjunct), (SubLObject)proof_view_news.UNPROVIDED)) {
            return (SubLObject)proof_view_news.ONE_INTEGER;
        }
        return proof_view_sentence_meaninginess(conjunct, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3853L)
    public static SubLObject proof_view_sentence_meaninginess_internal(final SubLObject sentence, SubLObject irrelevance_context, SubLObject triviality_context) {
        if (irrelevance_context == proof_view_news.UNPROVIDED) {
            irrelevance_context = pph_proof.pph_irrelevance_check_mt();
        }
        if (triviality_context == proof_view_news.UNPROVIDED) {
            triviality_context = pph_proof.pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_score = (SubLObject)proof_view_news.ZERO_INTEGER;
        if (proof_view_news.NIL != pph_proof.pph_trivial_sentenceP(sentence, triviality_context)) {
            if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str9$_S_is_trivial_in__S, sentence, triviality_context, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            }
        }
        else if (proof_view_news.NIL != pph_proof.pph_irrelevant_formulaP(sentence, (SubLObject)proof_view_news.NIL, irrelevance_context)) {
            if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str10$_S_is_irrelevant_in__S, sentence, irrelevance_context, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            }
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)proof_view_news.$kw7$IGNORE);
            SubLObject v_term = (SubLObject)proof_view_news.NIL;
            v_term = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                final SubLObject term_score = string_relevant_assertions.term_meaninginess(v_term);
                if (term_score.numG(best_score)) {
                    best_score = term_score;
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return best_score;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 3853L)
    public static SubLObject proof_view_sentence_meaninginess(final SubLObject sentence, SubLObject irrelevance_context, SubLObject triviality_context) {
        if (irrelevance_context == proof_view_news.UNPROVIDED) {
            irrelevance_context = pph_proof.pph_irrelevance_check_mt();
        }
        if (triviality_context == proof_view_news.UNPROVIDED) {
            triviality_context = pph_proof.pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_news.NIL;
        if (proof_view_news.NIL == v_memoization_state) {
            return proof_view_sentence_meaninginess_internal(sentence, irrelevance_context, triviality_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_news.$sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, (SubLObject)proof_view_news.UNPROVIDED);
        if (proof_view_news.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_news.$sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, (SubLObject)proof_view_news.THREE_INTEGER, (SubLObject)proof_view_news.NIL, (SubLObject)proof_view_news.EQUAL, (SubLObject)proof_view_news.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_news.$sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, irrelevance_context, triviality_context);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)proof_view_news.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)proof_view_news.NIL;
            collision = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (irrelevance_context.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (proof_view_news.NIL != cached_args && proof_view_news.NIL == cached_args.rest() && triviality_context.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(proof_view_sentence_meaninginess_internal(sentence, irrelevance_context, triviality_context)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(sentence, irrelevance_context, triviality_context));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 4612L)
    public static SubLObject maybe_add_proof_view_subheadline(final SubLObject story_root_entry, final SubLObject headline_entry) {
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof_view.proof_view_get_proof(v_proof_view), (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject headline_content = proof_view.proof_view_entry_get_object(headline_entry);
        final SubLObject subheadline_content = proof_view_subheadline_content(proof_conclusion, headline_content, v_proof_view);
        return (SubLObject)((proof_view_news.NIL != subheadline_content) ? proof_view_populator.proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_news.$str5$, story_root_entry, (SubLObject)proof_view_news.$kw11$SUBHEADLINE, subheadline_content, (SubLObject)proof_view_news.UNPROVIDED) : proof_view_news.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 5161L)
    public static SubLObject proof_view_subheadline_content(final SubLObject proof_conclusion, final SubLObject headline_content, final SubLObject v_proof_view) {
        if (proof_view_news.NIL != el_utilities.el_conjunction_p(proof_conclusion)) {
            final SubLObject conjuncts_to_keep = Sequences.remove(headline_content, cycl_utilities.formula_args(proof_conclusion, (SubLObject)proof_view_news.UNPROVIDED), Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            return (SubLObject)((proof_view_news.NIL != conjuncts_to_keep) ? ((proof_view_news.NIL != list_utilities.singletonP(conjuncts_to_keep)) ? list_utilities.only_one(conjuncts_to_keep) : simplifier.conjoin(conjuncts_to_keep, (SubLObject)proof_view_news.UNPROVIDED)) : proof_view_news.NIL);
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 5592L)
    public static SubLObject maybe_add_proof_view_lede(final SubLObject story_root_entry) {
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof_view.proof_view_get_proof(v_proof_view), (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject justification_entry = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw12$JUSTIFICATION_ROOT, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject top_level_proof = proof_view.proof_view_get_proof(v_proof_view);
        final SubLObject top_level_rule = pph_proof.pph_real_or_quasi_transformation_proof_rule(top_level_proof);
        final SubLObject top_level_rule_trivialP = pph_proof.pph_trivial_assertionP(top_level_rule, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject lede_content = (SubLObject)((proof_view_news.NIL != proof_conclusion) ? proof_view_lede_content(proof_conclusion, v_proof_view) : proof_view_news.NIL);
        if (proof_view_news.NIL != lede_content) {
            proof_view_add_story_paragraph(story_root_entry, lede_content);
        }
        return lede_content;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 6305L)
    public static SubLObject proof_view_lede_content(final SubLObject proof_conclusion, final SubLObject v_proof_view) {
        return proof_conclusion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 6467L)
    public static SubLObject maybe_add_proof_view_story_significance(final SubLObject story_root_entry) {
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 6584L)
    public static SubLObject maybe_add_proof_view_story_actors_brief_background(final SubLObject story_root_entry, final SubLObject lede_content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject main_actors = cycl_utilities.expression_gather(lede_content, (SubLObject)proof_view_news.$sym13$THCL_FORT_, (SubLObject)proof_view_news.T, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject domain_mt = proof_view.proof_view_get_domain_mt(v_proof_view);
        final SubLObject seen_sentences = proof_view_get_seen_story_sentences(v_proof_view);
        final SubLObject unincluded_facts = queues.create_queue((SubLObject)proof_view_news.UNPROVIDED);
        if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str14$__Main_actors___S__, main_actors, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        }
        final SubLObject local_state;
        final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(proof_view.proof_view_entry_get_proof_view(story_root_entry));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = main_actors;
                SubLObject actor = (SubLObject)proof_view_news.NIL;
                actor = cdolist_list_var.first();
                while (proof_view_news.NIL != cdolist_list_var) {
                    SubLObject key_facts = Sequences.remove((SubLObject)proof_view_news.ZERO_INTEGER, fact_sheets.thcl_sentences_for_term_fact_sheet(actor, domain_mt), (SubLObject)proof_view_news.$sym8$PROOF_VIEW_SENTENCE_MEANINGINESS, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                    SubLObject actor_facts = (SubLObject)proof_view_news.NIL;
                    if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str15$__Found__D_background_facts_for__, Sequences.length(key_facts), actor, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                    }
                    while (proof_view_news.NIL == list_utilities.lengthGE(actor_facts, (SubLObject)proof_view_news.THREE_INTEGER, (SubLObject)proof_view_news.UNPROVIDED) && proof_view_news.NIL == list_utilities.empty_list_p(key_facts)) {
                        final SubLObject fact = list_utilities.extremal(key_facts, Symbols.symbol_function((SubLObject)proof_view_news.$sym16$_), (SubLObject)proof_view_news.$sym8$PROOF_VIEW_SENTENCE_MEANINGINESS);
                        if (proof_view_news.NIL != set.set_add(proof_view_summary.proof_view_summary_item_sentence(fact), seen_sentences) && proof_view_news.NIL != fact_okay_for_proof_view_actor_brief_backgroundP(fact)) {
                            final SubLObject last_fact = list_utilities.last_one(queues.queue_elements(unincluded_facts));
                            if (proof_view_news.NIL == queues.queue_empty_p(unincluded_facts) && proof_view_news.NIL == proof_view_story_fact_coheres_with_last_factP(fact, last_fact)) {
                                proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
                            }
                            proof_view_maybe_enqueue_unincluded_fact(v_proof_view, fact, unincluded_facts);
                            actor_facts = (SubLObject)ConsesLow.cons(fact, actor_facts);
                        }
                        key_facts = Sequences.remove(fact, key_facts, Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                    }
                    proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
                    cdolist_list_var = cdolist_list_var.rest();
                    actor = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 8231L)
    public static SubLObject proof_view_maybe_enqueue_unincluded_fact(final SubLObject v_proof_view, final SubLObject fact, final SubLObject queue) {
        if (proof_view_news.NIL == subl_promotions.memberP(proof_view.proof_view_fact_sentence(fact), proof_view_get_story_sentences_so_far(v_proof_view), Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED)) {
            queues.enqueue(fact, queue);
        }
        return (SubLObject)proof_view_news.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 8468L)
    public static SubLObject fact_okay_for_proof_view_actor_brief_backgroundP(final SubLObject fact) {
        if (proof_view_news.NIL != Sequences.find_if((SubLObject)proof_view_news.$sym17$UNLEXIFIED_, cycl_utilities.expression_gather(fact, (SubLObject)proof_view_news.$sym18$FORT_P, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED)) {
            Errors.warn((SubLObject)proof_view_news.$str19$Unlexified_FORT__S___in__S, Sequences.find_if((SubLObject)proof_view_news.$sym17$UNLEXIFIED_, cycl_utilities.expression_gather(fact, (SubLObject)proof_view_news.$sym18$FORT_P, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED), fact);
            return (SubLObject)proof_view_news.NIL;
        }
        if (proof_view_news.NIL != pph_proof.sentence_trivial_for_justification_paraphraseP(fact, (SubLObject)proof_view_news.UNPROVIDED)) {
            Errors.warn((SubLObject)proof_view_news.$str20$Trivial_fact__S, fact);
            return (SubLObject)proof_view_news.NIL;
        }
        return (SubLObject)proof_view_news.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 8854L)
    public static SubLObject proof_view_get_seen_story_sentences(final SubLObject v_proof_view) {
        SubLObject ans = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw21$SEEN_STORY_SENTENCES, misc_utilities.uninitialized());
        if (proof_view_news.NIL != misc_utilities.uninitialized_p(ans)) {
            ans = set.new_set(Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED);
            proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_news.$kw21$SEEN_STORY_SENTENCES, ans);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 9166L)
    public static SubLObject maybe_add_proof_view_story_details(final SubLObject story_root_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject justification_entry = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw12$JUSTIFICATION_ROOT, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject summary_entry = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw22$SUMMARY_ROOT, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject detailed_entries_to_include = detailed_entry_gather_story_entries(justification_entry, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject seen_sentences = proof_view_get_seen_story_sentences(v_proof_view);
        final SubLObject enoughP = (SubLObject)proof_view_news.NIL;
        final SubLObject unincluded_facts = queues.create_queue((SubLObject)proof_view_news.UNPROVIDED);
        if (proof_view_news.NIL != summary_entry) {
            set_utilities.set_add_all(proof_view.proof_view_entry_get_children(summary_entry), detailed_entries_to_include);
        }
        final SubLObject local_state;
        final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(v_proof_view);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while (proof_view_news.NIL == enoughP && proof_view_news.NIL == set.empty_set_p(detailed_entries_to_include)) {
                    final SubLObject last_fact = (proof_view_news.NIL != queues.queue_empty_p(unincluded_facts)) ? list_utilities.last_one(proof_view_get_story_sentences_so_far(proof_view.proof_view_entry_get_proof_view(set_utilities.set_arbitrary_element_without_values(detailed_entries_to_include, (SubLObject)proof_view_news.UNPROVIDED)))) : list_utilities.last_one(queues.queue_elements(unincluded_facts));
                    SubLObject fact = choose_next_proof_view_story_detail(detailed_entries_to_include, unincluded_facts);
                    if (proof_view_news.NIL != set.set_add(proof_view_summary.proof_view_summary_item_sentence(fact), seen_sentences)) {
                        if (proof_view_news.NIL != arguments.hl_support_p(fact)) {
                            fact = arguments.support_sentence(fact);
                        }
                        if (proof_view_news.NIL == queues.queue_empty_p(unincluded_facts) && proof_view_news.NIL == proof_view_story_fact_coheres_with_last_factP(fact, last_fact)) {
                            proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
                        }
                        proof_view_maybe_enqueue_unincluded_fact(v_proof_view, fact, unincluded_facts);
                        if (proof_view_news.NIL == proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                            continue;
                        }
                        format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str23$__Current_paragraph_now_has__S_se, queues.queue_size(unincluded_facts), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 11023L)
    public static SubLObject choose_next_proof_view_story_detail(final SubLObject detailed_entries_to_include, final SubLObject unincluded_facts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert proof_view_news.NIL != set.set_p(detailed_entries_to_include) : detailed_entries_to_include;
        final SubLObject sentences_so_far = proof_view_get_story_sentences_so_far(proof_view.proof_view_entry_get_proof_view(set_utilities.set_arbitrary_element_without_values(detailed_entries_to_include, (SubLObject)proof_view_news.UNPROVIDED)));
        final SubLObject _prev_bind_0 = proof_view_news.$proof_view_news_detail_last_sentence$.currentBinding(thread);
        try {
            proof_view_news.$proof_view_news_detail_last_sentence$.bind((proof_view_news.NIL != queues.queue_empty_p(unincluded_facts)) ? list_utilities.last_one(sentences_so_far) : list_utilities.last_one(queues.queue_elements(unincluded_facts)), thread);
            final SubLObject best_entry = list_utilities.extremal(set.set_element_list(detailed_entries_to_include), Symbols.symbol_function((SubLObject)proof_view_news.$sym16$_), (SubLObject)proof_view_news.$sym25$PROOF_VIEW_STORY_DETAIL_SCORE);
            set.set_remove(best_entry, detailed_entries_to_include);
            return proof_view.proof_view_entry_get_object(best_entry);
        }
        finally {
            proof_view_news.$proof_view_news_detail_last_sentence$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 11753L)
    public static SubLObject proof_view_story_detail_score(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_sentence = proof_view_news.$proof_view_news_detail_last_sentence$.getDynamicValue(thread);
        final SubLObject fact = proof_view.proof_view_entry_get_object(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject justification_entry = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw12$JUSTIFICATION_ROOT, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject root_depth = proof_view.proof_view_entry_get_depth(justification_entry);
        final SubLObject depth = Numbers.subtract(proof_view.proof_view_entry_get_depth(entry), root_depth);
        return proof_view_story_detail_score_wrt_last_sentence(fact, last_sentence, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12265L)
    public static SubLObject proof_view_story_detail_score_wrt_last_sentence_internal(final SubLObject fact, final SubLObject last_sentence, final SubLObject depth) {
        final SubLObject coherence = Sequences.length(conses_high.intersection(proof_view_story_fact_terms(fact), proof_view_story_fact_terms(last_sentence), Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED));
        final SubLObject meaninginess = proof_view_sentence_meaninginess(fact, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        return compute_proof_view_story_detail_score(coherence, meaninginess, depth);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12265L)
    public static SubLObject proof_view_story_detail_score_wrt_last_sentence(final SubLObject fact, final SubLObject last_sentence, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)proof_view_news.NIL;
        if (proof_view_news.NIL == v_memoization_state) {
            return proof_view_story_detail_score_wrt_last_sentence_internal(fact, last_sentence, depth);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)proof_view_news.$sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, (SubLObject)proof_view_news.UNPROVIDED);
        if (proof_view_news.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)proof_view_news.$sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, (SubLObject)proof_view_news.THREE_INTEGER, (SubLObject)proof_view_news.NIL, (SubLObject)proof_view_news.EQUAL, (SubLObject)proof_view_news.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)proof_view_news.$sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(fact, last_sentence, depth);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)proof_view_news.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)proof_view_news.NIL;
            collision = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (fact.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (last_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (proof_view_news.NIL != cached_args && proof_view_news.NIL == cached_args.rest() && depth.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(proof_view_story_detail_score_wrt_last_sentence_internal(fact, last_sentence, depth)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(fact, last_sentence, depth));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 12862L)
    public static SubLObject compute_proof_view_story_detail_score(final SubLObject coherence, final SubLObject meaninginess, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.add(Numbers.multiply(proof_view_news.$proof_view_story_coherence_weight$.getDynamicValue(thread), coherence), Numbers.multiply(proof_view_news.$proof_view_story_meaninginess_weight$.getDynamicValue(thread), meaninginess), Numbers.multiply(proof_view_news.$proof_view_story_depth_weight$.getDynamicValue(thread), Numbers.divide((SubLObject)proof_view_news.ONE_INTEGER, depth)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13121L)
    public static SubLObject sort_proof_view_story_details(final SubLObject entries) {
        final SubLObject v_proof_view = (SubLObject)((proof_view_news.NIL != set.set_emptyP(entries)) ? proof_view_news.NIL : proof_view.proof_view_entry_get_proof_view(set_utilities.set_arbitrary_element_without_values(entries, (SubLObject)proof_view_news.UNPROVIDED)));
        return (SubLObject)((proof_view_news.NIL != v_proof_view) ? Sequences.nreverse(proof_view_populator.proof_view_sort_entries_to_maximize_coherence(v_proof_view, proof_view.proof_view_get_domain_mt(v_proof_view), set.set_element_list(entries))) : proof_view_news.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13593L)
    public static SubLObject proof_view_get_story_sentences_so_far(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw31$STORY_SENTENCES_SO_FAR, (SubLObject)proof_view_news.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13734L)
    public static SubLObject proof_view_add_story_sentence(final SubLObject v_proof_view, final SubLObject sentence) {
        return proof_view.proof_view_set_property(v_proof_view, (SubLObject)proof_view_news.$kw31$STORY_SENTENCES_SO_FAR, list_utilities.add_to_end(proof_view.proof_view_fact_sentence(sentence), proof_view_get_story_sentences_so_far(v_proof_view)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 13981L)
    public static SubLObject proof_add_unincluded_story_facts_paragraph(final SubLObject story_root_entry, final SubLObject unincluded_facts) {
        if (proof_view_news.NIL != queues.queue_empty_p(unincluded_facts)) {
            return (SubLObject)proof_view_news.NIL;
        }
        final SubLObject facts = queues.dequeue_all(unincluded_facts);
        final SubLObject content = (proof_view_news.NIL != list_utilities.singletonP(facts)) ? list_utilities.only_one(facts) : simplifier.conjoin(facts, (SubLObject)proof_view_news.UNPROVIDED);
        return proof_view_add_story_paragraph(story_root_entry, content);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 14323L)
    public static SubLObject proof_view_add_story_paragraph(final SubLObject story_root_entry, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject _prev_bind_0 = proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.currentBinding(thread);
        try {
            proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.bind((SubLObject)proof_view_news.T, thread);
            final SubLObject story_paragraph_entry = proof_view_populator.proof_view_add_new_entry(v_proof_view, (SubLObject)proof_view_news.$str5$, story_root_entry, (SubLObject)proof_view_news.$kw32$STORY_PARAGRAPH, content, (SubLObject)proof_view_news.UNPROVIDED);
            SubLObject cdolist_list_var = (SubLObject)((proof_view_news.NIL != el_utilities.el_conjunction_p(content)) ? cycl_utilities.formula_args(content, (SubLObject)proof_view_news.UNPROVIDED) : ConsesLow.list(content));
            SubLObject conjunct = (SubLObject)proof_view_news.NIL;
            conjunct = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                proof_view_add_story_sentence(v_proof_view, conjunct);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
            return story_paragraph_entry;
        }
        finally {
            proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 14825L)
    public static SubLObject proof_view_story_fact_coheres_with_last_factP(final SubLObject fact, final SubLObject last_fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_news.NIL != proof_view_story_fact_requires_own_paragraphP(fact)) {
            return (SubLObject)proof_view_news.NIL;
        }
        if (proof_view_news.NIL != list_utilities.non_empty_list_p(conses_high.intersection(proof_view_story_fact_terms(fact), proof_view_story_fact_terms(last_fact), Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED))) {
            if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str33$_S___coheres_with__S, fact, last_fact, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            }
            return (SubLObject)proof_view_news.T;
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15208L)
    public static SubLObject proof_view_story_fact_terms(final SubLObject fact) {
        return list_utilities.find_all_if((SubLObject)proof_view_news.$sym34$CYCL_DENOTATIONAL_TERM_P, cycl_utilities.formula_args(fact, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15329L)
    public static SubLObject proof_view_story_fact_requires_own_paragraphP(final SubLObject fact) {
        if (proof_view_news.NIL != el_utilities.el_conjunction_p(fact)) {
            return (SubLObject)proof_view_news.T;
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 15531L)
    public static SubLObject detailed_entry_gather_story_entries(final SubLObject detailed_entry, SubLObject entries, SubLObject depth) {
        if (entries == proof_view_news.UNPROVIDED) {
            entries = set.new_set(Symbols.symbol_function((SubLObject)proof_view_news.EQL), (SubLObject)proof_view_news.UNPROVIDED);
        }
        if (depth == proof_view_news.UNPROVIDED) {
            depth = (SubLObject)proof_view_news.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (depth.numGE(proof_view_news.$proof_view_story_section_max_depth$.getDynamicValue(thread))) {
            if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)proof_view_news.$str35$Reached_story_depth_cutoff_of__D_, proof_view_news.$proof_view_story_section_max_depth$.getDynamicValue(thread), proof_view.proof_view_entry_get_object(detailed_entry));
            }
        }
        else {
            SubLObject cdolist_list_var;
            final SubLObject children = cdolist_list_var = proof_view.proof_view_entry_get_children(detailed_entry);
            SubLObject child = (SubLObject)proof_view_news.NIL;
            child = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                set_utilities.set_add_set(detailed_entry_gather_story_entries(child, entries, number_utilities.f_1X(depth)), entries);
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
            if (proof_view_news.NIL != proof_view_story_include_detailed_entryP(detailed_entry)) {
                SubLObject child_missingP = (SubLObject)proof_view_news.NIL;
                if (proof_view_news.NIL == child_missingP) {
                    SubLObject csome_list_var = children;
                    SubLObject child2 = (SubLObject)proof_view_news.NIL;
                    child2 = csome_list_var.first();
                    while (proof_view_news.NIL == child_missingP && proof_view_news.NIL != csome_list_var) {
                        if (proof_view_news.NIL == set.set_memberP(child2, entries)) {
                            child_missingP = (SubLObject)proof_view_news.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        child2 = csome_list_var.first();
                    }
                }
                if (proof_view_news.NIL != list_utilities.empty_list_p(children) || proof_view_news.NIL != child_missingP) {
                    set.set_add(detailed_entry, entries);
                }
            }
        }
        return entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 16578L)
    public static SubLObject proof_view_story_include_detailed_entryP(final SubLObject detailed_entry) {
        if (proof_view_news.NIL != subl_promotions.memberP(proof_view.proof_view_entry_get_object_type(detailed_entry), (SubLObject)proof_view_news.$list36, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED)) {
            return (SubLObject)proof_view_news.NIL;
        }
        if (proof_view_news.NIL != pph_proof.sentence_trivial_for_justification_paraphraseP(proof_view.proof_view_entry_get_object(detailed_entry), (SubLObject)proof_view_news.UNPROVIDED)) {
            return (SubLObject)proof_view_news.NIL;
        }
        if (proof_view_news.NIL != proof_view_story_include_detailed_entry_objectP(proof_view.proof_view_entry_get_object(detailed_entry), proof_view.proof_view_entry_get_proof_view(detailed_entry))) {
            return (SubLObject)proof_view_news.T;
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 17077L)
    public static SubLObject proof_view_story_include_detailed_entry_objectP(final SubLObject v_object, final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (proof_view_news.NIL != assertions_high.rule_assertionP(v_object)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(proof_view.proof_view_get_language_mt(v_proof_view));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, proof_view_news.$const37$englishGloss, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return cycl_grammar.cycl_sentence_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 17805L)
    public static SubLObject show_proof_view_story_section(final SubLObject root, SubLObject depth) {
        if (depth == proof_view_news.UNPROVIDED) {
            depth = (SubLObject)proof_view_news.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(root);
        if (!root.eql(proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw1$STORY_ROOT, (SubLObject)proof_view_news.UNPROVIDED))) {
            return (SubLObject)proof_view_news.NIL;
        }
        final SubLObject children = proof_view.proof_view_entry_get_children(root);
        final SubLObject headline_entry = Sequences.find((SubLObject)proof_view_news.$kw6$HEADLINE, children, Symbols.symbol_function((SubLObject)proof_view_news.EQL), (SubLObject)proof_view_news.$sym42$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject include_cyclP = proof_view.proof_view_get_include_cycl_in_outputP(v_proof_view);
        if (proof_view_news.NIL != headline_entry) {
            html_utilities.html_markup(proof_view.proof_view_entry_generate_html(headline_entry));
            if (proof_view_news.NIL != include_cyclP) {
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                html_utilities.html_markup((SubLObject)proof_view_news.$str43$pf_object);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)proof_view_news.T, thread);
                    final SubLObject v_object = proof_view.proof_view_entry_get_object(headline_entry);
                    pph_proof.show_proof_view_object(v_object, headline_entry, (SubLObject)proof_view_news.ZERO_INTEGER);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
        html_utilities.html_markup((SubLObject)proof_view_news.$str44$story_body);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)proof_view_news.T, thread);
            SubLObject cdolist_list_var = Sequences.remove(headline_entry, children, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            SubLObject child = (SubLObject)proof_view_news.NIL;
            child = cdolist_list_var.first();
            while (proof_view_news.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                html_utilities.html_markup((SubLObject)proof_view_news.$str45$entry);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)proof_view_news.T, thread);
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)proof_view_news.$str46$story_paragraph);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)proof_view_news.T, thread);
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)proof_view_news.T, thread);
                            html_utilities.html_markup(proof_view.proof_view_entry_generate_html(child));
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    if (proof_view_news.NIL != include_cyclP) {
                        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)proof_view_news.$str43$pf_object);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)proof_view_news.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)proof_view_news.T, thread);
                            final SubLObject v_object2 = proof_view.proof_view_entry_get_object(child);
                            pph_proof.show_proof_view_object(v_object2, child, (SubLObject)proof_view_news.ZERO_INTEGER);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return (SubLObject)proof_view_news.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19039L)
    public static SubLObject html_output_proof_view_story_headline(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP) {
        if (allow_external_linksP == proof_view_news.UNPROVIDED) {
            allow_external_linksP = (SubLObject)proof_view_news.NIL;
        }
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)proof_view_news.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
        pph_proof.pph_show_sentence(v_object, pph_headline.generate_english_headline_string(v_object, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)proof_view_news.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19289L)
    public static SubLObject html_output_proof_view_story_subheadline(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP) {
        if (allow_external_linksP == proof_view_news.UNPROVIDED) {
            allow_external_linksP = (SubLObject)proof_view_news.NIL;
        }
        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_utilities.html_markup((SubLObject)proof_view_news.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
        pph_proof.pph_show_sentence(v_object, pph_headline.generate_english_headline_string(v_object, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_utilities.html_markup((SubLObject)proof_view_news.THREE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)proof_view_news.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19539L)
    public static SubLObject html_output_proof_view_story_paragraph(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP) {
        if (allow_external_linksP == proof_view_news.UNPROVIDED) {
            allow_external_linksP = (SubLObject)proof_view_news.NIL;
        }
        pph_proof.pph_show_sentence(v_object, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 19924L)
    public static SubLObject launch_news_troller_daemon() {
        proof_view_news.$news_troller_daemon_abortP$.setGlobalValue((SubLObject)proof_view_news.NIL);
        return process_utilities.make_cyc_server_process((SubLObject)proof_view_news.$str48$News_Troller, (SubLObject)proof_view_news.$sym49$TROLL_FOR_NEWS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 20072L)
    public static SubLObject halt_news_troller_daemon() {
        proof_view_news.$news_troller_daemon_abortP$.setGlobalValue((SubLObject)proof_view_news.T);
        return proof_view_news.$news_troller_daemon_abortP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 20188L)
    public static SubLObject troll_for_news(SubLObject keepalive_filename, SubLObject done_queries) {
        if (keepalive_filename == proof_view_news.UNPROVIDED) {
            keepalive_filename = (SubLObject)proof_view_news.NIL;
        }
        if (done_queries == proof_view_news.UNPROVIDED) {
            done_queries = set.new_set(Symbols.symbol_function((SubLObject)proof_view_news.EQUAL), (SubLObject)proof_view_news.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_file = (SubLObject)proof_view_news.NIL;
        SubLObject skip_fileP = (SubLObject)proof_view_news.NIL;
        SubLObject abortP = proof_view_news.$news_troller_daemon_abortP$.getGlobalValue();
        final SubLObject new_kbqs = (SubLObject)proof_view_news.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while (proof_view_news.NIL == abortP) {
                    final SubLObject _prev_bind_0_$7 = Errors.$ignore_warnsP$.currentBinding(thread);
                    try {
                        Errors.$ignore_warnsP$.bind((SubLObject)proof_view_news.T, thread);
                        assert proof_view_news.NIL != Filesys.directory_p(transcript_utilities.transcript_directory()) : transcript_utilities.transcript_directory();
                        SubLObject directory_contents_var = Filesys.directory(transcript_utilities.transcript_directory(), (SubLObject)proof_view_news.T);
                        final SubLObject progress_message_var = (SubLObject)proof_view_news.NIL;
                        final SubLObject _prev_bind_0_$8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                        try {
                            utilities_macros.$silent_progressP$.bind((SubLObject)SubLObjectFactory.makeBoolean(!progress_message_var.isString()), thread);
                            if (proof_view_news.NIL.isFunctionSpec()) {
                                directory_contents_var = Sort.sort(directory_contents_var, (SubLObject)proof_view_news.NIL, (SubLObject)proof_view_news.UNPROVIDED);
                            }
                            final SubLObject list_var = directory_contents_var;
                            final SubLObject _prev_bind_0_$9 = utilities_macros.$progress_note$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$progress_note$.bind((SubLObject)((proof_view_news.NIL != progress_message_var) ? progress_message_var : proof_view_news.$str51$cdolist), thread);
                                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                                utilities_macros.$progress_sofar$.bind((SubLObject)proof_view_news.ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_index$.bind((SubLObject)proof_view_news.ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)proof_view_news.NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)proof_view_news.T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                                try {
                                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                    if (proof_view_news.NIL == abortP) {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject current_file = (SubLObject)proof_view_news.NIL;
                                        current_file = csome_list_var.first();
                                        while (proof_view_news.NIL == abortP && proof_view_news.NIL != csome_list_var) {
                                            if (proof_view_news.NIL != inference_analysis.asked_queries_filenameP(current_file)) {
                                                SubLObject done_varP = (SubLObject)proof_view_news.NIL;
                                                SubLObject i = (SubLObject)proof_view_news.ZERO_INTEGER;
                                                SubLObject stream = (SubLObject)proof_view_news.NIL;
                                                try {
                                                    final SubLObject _prev_bind_0_$10 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                    try {
                                                        stream_macros.$stream_requires_locking$.bind((SubLObject)proof_view_news.NIL, thread);
                                                        stream = compatibility.open_binary(current_file, (SubLObject)proof_view_news.$kw52$INPUT);
                                                    }
                                                    finally {
                                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                    if (!stream.isStream()) {
                                                        Errors.error((SubLObject)proof_view_news.$str53$Unable_to_open__S, current_file);
                                                    }
                                                    final SubLObject input_stream = stream;
                                                    final SubLObject _prev_bind_0_$11 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                                                    try {
                                                        cfasl.$cfasl_common_symbols$.bind((SubLObject)proof_view_news.NIL, thread);
                                                        cfasl.cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                                                        while (proof_view_news.NIL == done_varP) {
                                                            final SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                                                            if (proof_view_news.$kw54$EOF == query_info) {
                                                                done_varP = (SubLObject)proof_view_news.T;
                                                            }
                                                            else if (query_info.isString()) {
                                                                Errors.warn((SubLObject)proof_view_news.$str55$Read_invalid_query_info__s, query_info);
                                                            }
                                                            else {
                                                                final SubLObject _prev_bind_0_$12 = Errors.$ignore_warnsP$.currentBinding(thread);
                                                                try {
                                                                    Errors.$ignore_warnsP$.bind((SubLObject)proof_view_news.NIL, thread);
                                                                    SubLObject err_msg = (SubLObject)proof_view_news.NIL;
                                                                    try {
                                                                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                                        final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                                                                        try {
                                                                            Errors.$error_handler$.bind((SubLObject)proof_view_news.$sym56$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                            try {
                                                                                if (!current_file.equal(last_file)) {
                                                                                    last_file = current_file;
                                                                                    skip_fileP = (SubLObject)SubLObjectFactory.makeBoolean(proof_view_news.NIL != string_utilities.substringP((SubLObject)proof_view_news.$str57$aries, current_file, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED) || proof_view_news.NIL != string_utilities.substringP((SubLObject)proof_view_news.$str58$scorpio, current_file, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED) || proof_view_news.NIL != string_utilities.substringP((SubLObject)proof_view_news.$str59$libra, current_file, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED));
                                                                                    if (proof_view_news.NIL == skip_fileP && proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                                                                        format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str60$__Evaluating_queries_in__S__, current_file, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                                                                                    }
                                                                                }
                                                                                if (proof_view_news.NIL == skip_fileP && proof_view_news.NIL != list_utilities.proper_list_p(query_info) && proof_view_news.NIL != list_utilities.lengthE(query_info, (SubLObject)proof_view_news.THREE_INTEGER, (SubLObject)proof_view_news.UNPROVIDED)) {
                                                                                    SubLObject current;
                                                                                    final SubLObject datum = current = query_info;
                                                                                    SubLObject sentence = (SubLObject)proof_view_news.NIL;
                                                                                    SubLObject mt = (SubLObject)proof_view_news.NIL;
                                                                                    SubLObject query_properties = (SubLObject)proof_view_news.NIL;
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_news.$list61);
                                                                                    sentence = current.first();
                                                                                    current = current.rest();
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_news.$list61);
                                                                                    mt = current.first();
                                                                                    current = current.rest();
                                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)proof_view_news.$list61);
                                                                                    query_properties = current.first();
                                                                                    current = current.rest();
                                                                                    if (proof_view_news.NIL == current) {
                                                                                        if (!random.random(proof_view_news.$promising_news_query_sample_rate$.getGlobalValue()).isPositive() && proof_view_news.NIL == set.set_memberP(query_info, done_queries) && proof_view_news.NIL != inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP(query_properties) && proof_view_news.NIL == list_utilities.tree_find_if((SubLObject)proof_view_news.$sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_, query_info, (SubLObject)proof_view_news.UNPROVIDED) && proof_view_news.NIL == query_sentence_has_no_obvious_headlineP(sentence)) {
                                                                                            query_properties = conses_high.putf(query_properties, (SubLObject)proof_view_news.$kw63$BROWSABLE_, (SubLObject)proof_view_news.T);
                                                                                            SubLObject inference = (SubLObject)proof_view_news.NIL;
                                                                                            SubLObject time = (SubLObject)proof_view_news.NIL;
                                                                                            try {
                                                                                                final SubLObject time_var = Time.get_internal_real_time();
                                                                                                inference = Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)proof_view_news.TWO_INTEGER), inference_kernel.new_cyc_query(sentence, mt, query_properties));
                                                                                                time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
                                                                                                final SubLObject num_to_try = Numbers.min((SubLObject)proof_view_news.FIVE_INTEGER, Numbers.max((SubLObject)proof_view_news.ONE_INTEGER, Numbers.integerDivide(answer_count, proof_view_news.$promising_news_query_sample_rate$.getGlobalValue())));
                                                                                                if (answer_count.isPositive() && time.numG((SubLObject)proof_view_news.ONE_INTEGER)) {
                                                                                                    if (proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                                                                                        format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str64$__Got__D_answer__P_for__S__, answer_count, sentence, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                                                                                                    }
                                                                                                    SubLObject cdolist_list_var = list_utilities.random_n(num_to_try, inference_datastructures_inference.inference_all_answers(inference, (SubLObject)proof_view_news.UNPROVIDED));
                                                                                                    SubLObject v_answer = (SubLObject)proof_view_news.NIL;
                                                                                                    v_answer = cdolist_list_var.first();
                                                                                                    while (proof_view_news.NIL != cdolist_list_var) {
                                                                                                        if (proof_view_news.NIL == abortP) {
                                                                                                            maybe_output_news_story(v_answer);
                                                                                                        }
                                                                                                        cdolist_list_var = cdolist_list_var.rest();
                                                                                                        v_answer = cdolist_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            finally {
                                                                                                final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                try {
                                                                                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                                                                                                    final SubLObject _values = Values.getValuesAsVector();
                                                                                                    set.set_add(query_info, done_queries);
                                                                                                    if (proof_view_news.ZERO_INTEGER.eql(Numbers.mod(set.set_size(done_queries), (SubLObject)proof_view_news.$int65$50)) && proof_view_news.NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                                                                                        format_nil.force_format((SubLObject)proof_view_news.T, (SubLObject)proof_view_news.$str66$__Evaluated__D_queries___, set.set_size(done_queries), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
                                                                                                    }
                                                                                                    inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                                                                                                    Values.restoreValuesFromVector(_values);
                                                                                                }
                                                                                                finally {
                                                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)proof_view_news.$list61);
                                                                                    }
                                                                                }
                                                                            }
                                                                            catch (Throwable catch_var) {
                                                                                Errors.handleThrowable(catch_var, (SubLObject)proof_view_news.NIL);
                                                                            }
                                                                        }
                                                                        finally {
                                                                            Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    }
                                                                    catch (Throwable ccatch_env_var) {
                                                                        err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                                    }
                                                                    finally {
                                                                        thread.throwStack.pop();
                                                                    }
                                                                    if (proof_view_news.NIL != err_msg) {
                                                                        Errors.warn((SubLObject)proof_view_news.$str67$Caught_error_running_promising_qu, current_file, err_msg);
                                                                    }
                                                                }
                                                                finally {
                                                                    Errors.$ignore_warnsP$.rebind(_prev_bind_0_$12, thread);
                                                                }
                                                                if (proof_view_news.NIL != proof_view_news.$news_troller_daemon_abortP$.getGlobalValue()) {
                                                                    abortP = (SubLObject)proof_view_news.T;
                                                                }
                                                                file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                                                i = Numbers.add(i, (SubLObject)proof_view_news.ONE_INTEGER);
                                                            }
                                                            if (proof_view_news.NIL != abortP) {
                                                                done_varP = abortP;
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                                                        final SubLObject _values2 = Values.getValuesAsVector();
                                                        if (stream.isStream()) {
                                                            streams_high.close(stream, (SubLObject)proof_view_news.UNPROVIDED);
                                                        }
                                                        Values.restoreValuesFromVector(_values2);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                }
                                            }
                                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)proof_view_news.ONE_INTEGER), thread);
                                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                            csome_list_var = csome_list_var.rest();
                                            current_file = csome_list_var.first();
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$16 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                                        final SubLObject _values3 = Values.getValuesAsVector();
                                        utilities_macros.noting_percent_progress_postamble();
                                        Values.restoreValuesFromVector(_values3);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            }
                            finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                                utilities_macros.$progress_note$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                        finally {
                            utilities_macros.$silent_progressP$.rebind(_prev_bind_0_$8, thread);
                        }
                    }
                    finally {
                        Errors.$ignore_warnsP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return new_kbqs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 22883L)
    public static SubLObject query_sentence_has_no_obvious_headlineP(final SubLObject sentence) {
        if (proof_view_news.NIL != el_utilities.el_conjunction_p(sentence)) {
            final SubLObject badP = (SubLObject)SubLObjectFactory.makeBoolean(proof_view_news.NIL == list_utilities.singletonP(Sequences.remove_if((SubLObject)proof_view_news.$sym68$PPH_VAR_TYPING_CLAUSE_, cycl_utilities.formula_args(sentence, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED)));
            return badP;
        }
        if (proof_view_news.NIL != el_utilities.el_existential_p(sentence)) {
            return query_sentence_has_no_obvious_headlineP(cycl_utilities.formula_arg2(sentence, (SubLObject)proof_view_news.UNPROVIDED));
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 23310L)
    public static SubLObject news_troller_query_forbidden_termP(final SubLObject v_term) {
        if (proof_view_news.NIL != narts_high.invalid_nartP(v_term, (SubLObject)proof_view_news.UNPROVIDED)) {
            return (SubLObject)proof_view_news.T;
        }
        if (proof_view_news.NIL != constant_handles.invalid_constantP(v_term, (SubLObject)proof_view_news.UNPROVIDED)) {
            return (SubLObject)proof_view_news.T;
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 23481L)
    public static SubLObject filename_from_news_proof_view(final SubLObject v_proof_view, final SubLObject directory) {
        final SubLObject story_root = proof_view_get_story_root_entry(v_proof_view);
        final SubLObject headline_entry = proof_view.proof_view_entry_get_children(story_root).first();
        final SubLObject headline = html_utilities.remove_html_tags(proof_view.proof_view_entry_generate_html(headline_entry), (SubLObject)proof_view_news.UNPROVIDED);
        final SubLObject short_head = (proof_view_news.NIL != list_utilities.lengthL(headline, (SubLObject)proof_view_news.$int65$50, (SubLObject)proof_view_news.UNPROVIDED)) ? headline : string_utilities.substring(headline, (SubLObject)proof_view_news.ZERO_INTEGER, (SubLObject)proof_view_news.$int65$50);
        final SubLObject clean_head = Strings.string_downcase(Sequences.remove_if((SubLObject)proof_view_news.$sym69$INVALID_FILE_NAME_CHAR, short_head, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        return Sequences.cconcatenate(directory, new SubLObject[] { proof_view_news.$str70$_, clean_head, proof_view_news.$str71$_xml });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 23995L)
    public static SubLObject invalid_file_name_char(final SubLObject v_char) {
        if (v_char.eql((SubLObject)Characters.CHAR_space)) {
            return (SubLObject)proof_view_news.T;
        }
        if (v_char.eql((SubLObject)Characters.CHAR_colon)) {
            return (SubLObject)proof_view_news.T;
        }
        return (SubLObject)proof_view_news.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 24124L)
    public static SubLObject construct_news_story_proof_view(final SubLObject proof, final SubLObject v_answer, SubLObject debugP, SubLObject summary_algorithm) {
        if (debugP == proof_view_news.UNPROVIDED) {
            debugP = proof_view.$proof_view_debugP$.getDynamicValue();
        }
        if (summary_algorithm == proof_view_news.UNPROVIDED) {
            summary_algorithm = (SubLObject)proof_view_news.NIL;
        }
        final SubLObject v_proof_view = proof_view.get_new_empty_proof_view((SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        proof_view.proof_view_set_proof(v_proof_view, proof);
        proof_view.proof_view_set_answer(v_proof_view, v_answer);
        proof_view.proof_view_set_include_rules_sectionP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_allow_external_linksP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_allow_internal_linksP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_include_justification_sectionP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_include_sourcesP(v_proof_view, (SubLObject)proof_view_news.T);
        proof_view_populator.proof_view_set_include_special_sectionP(v_proof_view, (SubLObject)proof_view_news.$kw3$STORY, (SubLObject)proof_view_news.T);
        proof_view.proof_view_set_allow_internal_linksP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_allow_external_linksP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_link_phrasesP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_include_silkP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_include_cycml_in_xmlP(v_proof_view, (SubLObject)proof_view_news.NIL);
        proof_view.proof_view_set_include_cycl_in_outputP(v_proof_view, (SubLObject)proof_view_news.T);
        proof_view.proof_view_set_enable_debugP(v_proof_view, debugP);
        if (proof_view_news.NIL != summary_algorithm) {
            proof_view_summary.proof_view_set_summary_algorithm(v_proof_view, summary_algorithm);
        }
        proof_view_populator.proof_view_populate(v_proof_view, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 25420L)
    public static SubLObject output_proof_view_news_story(final SubLObject v_proof_view) {
        xml_utilities.xml_header((SubLObject)proof_view_news.$float29$1_0, (SubLObject)proof_view_news.$str72$UTF_8, (SubLObject)proof_view_news.UNPROVIDED);
        xml_utilities.xml_write_string((SubLObject)proof_view_news.$str73$__xml_stylesheet_type__text_xsl__, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
        proof_view.output_proof_view_in_xml(v_proof_view, (SubLObject)proof_view_news.T);
        return v_proof_view;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/proof-view-news.lisp", position = 25779L)
    public static SubLObject maybe_output_news_story(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof = pph_proof.inference_answer_get_proofs(inference_answer).first();
        final SubLObject _prev_bind_0 = proof_view.$proof_view_debugP$.currentBinding(thread);
        try {
            proof_view.$proof_view_debugP$.bind((SubLObject)proof_view_news.NIL, thread);
            final SubLObject v_proof_view = construct_news_story_proof_view(proof, inference_answer, (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED);
            final SubLObject story_root = proof_view.proof_view_get_property(v_proof_view, (SubLObject)proof_view_news.$kw1$STORY_ROOT, (SubLObject)proof_view_news.NIL);
            final SubLObject para_count = number_utilities.f_1_(proof_view.proof_view_count_entries(story_root));
            SubLObject xml = (SubLObject)proof_view_news.NIL;
            if (para_count.numG((SubLObject)proof_view_news.THREE_INTEGER)) {
                try {
                    SubLObject stream = (SubLObject)proof_view_news.NIL;
                    try {
                        stream = streams_high.make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$18 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            output_proof_view_news_story(v_proof_view);
                        }
                        finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0_$18, thread);
                        }
                        xml = streams_high.get_output_stream_string(stream);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            streams_high.close(stream, (SubLObject)proof_view_news.UNPROVIDED);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    final SubLObject demerits = proof_view.proof_view_entry_get_paraphrase_demerits(story_root, (SubLObject)proof_view_news.T);
                    if (proof_view_news.NIL != list_utilities.lengthGE(xml, (SubLObject)proof_view_news.$int75$1000, (SubLObject)proof_view_news.UNPROVIDED) && para_count.numG(demerits)) {
                        final SubLObject directory = print_high.princ_to_string(file_utilities.make_directory_recursive(file_utilities.relative_filename(transcript_utilities.transcript_directory(), (SubLObject)proof_view_news.$str76$proof_view_news, (SubLObject)proof_view_news.UNPROVIDED), (SubLObject)proof_view_news.UNPROVIDED, (SubLObject)proof_view_news.UNPROVIDED));
                        final SubLObject filename = filename_from_news_proof_view(v_proof_view, directory);
                        Errors.warn((SubLObject)proof_view_news.$str77$Generated_news_story__D_character, new SubLObject[] { Sequences.length(xml), para_count, demerits, inference_answer });
                        SubLObject stream_$20 = (SubLObject)proof_view_news.NIL;
                        try {
                            final SubLObject _prev_bind_0_$20 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind((SubLObject)proof_view_news.NIL, thread);
                                stream_$20 = compatibility.open_text(filename, (SubLObject)proof_view_news.$kw78$OUTPUT);
                            }
                            finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (!stream_$20.isStream()) {
                                Errors.error((SubLObject)proof_view_news.$str53$Unable_to_open__S, filename);
                            }
                            final SubLObject stream_$21 = stream_$20;
                            print_high.princ(xml, stream_$21);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (stream_$20.isStream()) {
                                    streams_high.close(stream_$20, (SubLObject)proof_view_news.UNPROVIDED);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        final SubLObject xsl = Sequences.cconcatenate(directory, (SubLObject)proof_view_news.$str79$_xml_news_xsl);
                        if (proof_view_news.NIL == file_utilities.file_existsP(xsl)) {
                            file_utilities.create_symbolic_link(xsl, proof_view_news.$proof_view_news_xsl_file$.getGlobalValue());
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)proof_view_news.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        proof_view.destroy_proof_view(v_proof_view);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            return xml;
        }
        finally {
            proof_view.$proof_view_debugP$.rebind(_prev_bind_0, thread);
        }
    }
    
    public static SubLObject declare_proof_view_news_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "headline_for_proof_conclusion", "HEADLINE-FOR-PROOF-CONCLUSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_add_story_section", "PROOF-VIEW-ADD-STORY-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_get_story_root_entry", "PROOF-VIEW-GET-STORY-ROOT-ENTRY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_build_story_section", "PROOF-VIEW-BUILD-STORY-SECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_add_proof_view_headline", "MAYBE-ADD-PROOF-VIEW-HEADLINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_headline_content", "PROOF-VIEW-HEADLINE-CONTENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_headline_conjunct_score", "PROOF-VIEW-HEADLINE-CONJUNCT-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_sentence_meaninginess_internal", "PROOF-VIEW-SENTENCE-MEANINGINESS-INTERNAL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_sentence_meaninginess", "PROOF-VIEW-SENTENCE-MEANINGINESS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_add_proof_view_subheadline", "MAYBE-ADD-PROOF-VIEW-SUBHEADLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_subheadline_content", "PROOF-VIEW-SUBHEADLINE-CONTENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_add_proof_view_lede", "MAYBE-ADD-PROOF-VIEW-LEDE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_lede_content", "PROOF-VIEW-LEDE-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_add_proof_view_story_significance", "MAYBE-ADD-PROOF-VIEW-STORY-SIGNIFICANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_add_proof_view_story_actors_brief_background", "MAYBE-ADD-PROOF-VIEW-STORY-ACTORS-BRIEF-BACKGROUND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_maybe_enqueue_unincluded_fact", "PROOF-VIEW-MAYBE-ENQUEUE-UNINCLUDED-FACT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "fact_okay_for_proof_view_actor_brief_backgroundP", "FACT-OKAY-FOR-PROOF-VIEW-ACTOR-BRIEF-BACKGROUND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_get_seen_story_sentences", "PROOF-VIEW-GET-SEEN-STORY-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_add_proof_view_story_details", "MAYBE-ADD-PROOF-VIEW-STORY-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "choose_next_proof_view_story_detail", "CHOOSE-NEXT-PROOF-VIEW-STORY-DETAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_detail_score", "PROOF-VIEW-STORY-DETAIL-SCORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_detail_score_wrt_last_sentence_internal", "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_detail_score_wrt_last_sentence", "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "compute_proof_view_story_detail_score", "COMPUTE-PROOF-VIEW-STORY-DETAIL-SCORE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "sort_proof_view_story_details", "SORT-PROOF-VIEW-STORY-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_get_story_sentences_so_far", "PROOF-VIEW-GET-STORY-SENTENCES-SO-FAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_add_story_sentence", "PROOF-VIEW-ADD-STORY-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_add_unincluded_story_facts_paragraph", "PROOF-ADD-UNINCLUDED-STORY-FACTS-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_add_story_paragraph", "PROOF-VIEW-ADD-STORY-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_fact_coheres_with_last_factP", "PROOF-VIEW-STORY-FACT-COHERES-WITH-LAST-FACT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_fact_terms", "PROOF-VIEW-STORY-FACT-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_fact_requires_own_paragraphP", "PROOF-VIEW-STORY-FACT-REQUIRES-OWN-PARAGRAPH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "detailed_entry_gather_story_entries", "DETAILED-ENTRY-GATHER-STORY-ENTRIES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_include_detailed_entryP", "PROOF-VIEW-STORY-INCLUDE-DETAILED-ENTRY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "proof_view_story_include_detailed_entry_objectP", "PROOF-VIEW-STORY-INCLUDE-DETAILED-ENTRY-OBJECT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "show_proof_view_story_section", "SHOW-PROOF-VIEW-STORY-SECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "html_output_proof_view_story_headline", "HTML-OUTPUT-PROOF-VIEW-STORY-HEADLINE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "html_output_proof_view_story_subheadline", "HTML-OUTPUT-PROOF-VIEW-STORY-SUBHEADLINE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "html_output_proof_view_story_paragraph", "HTML-OUTPUT-PROOF-VIEW-STORY-PARAGRAPH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "launch_news_troller_daemon", "LAUNCH-NEWS-TROLLER-DAEMON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "halt_news_troller_daemon", "HALT-NEWS-TROLLER-DAEMON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "troll_for_news", "TROLL-FOR-NEWS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "query_sentence_has_no_obvious_headlineP", "QUERY-SENTENCE-HAS-NO-OBVIOUS-HEADLINE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "news_troller_query_forbidden_termP", "NEWS-TROLLER-QUERY-FORBIDDEN-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "filename_from_news_proof_view", "FILENAME-FROM-NEWS-PROOF-VIEW", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "invalid_file_name_char", "INVALID-FILE-NAME-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "construct_news_story_proof_view", "CONSTRUCT-NEWS-STORY-PROOF-VIEW", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "output_proof_view_news_story", "OUTPUT-PROOF-VIEW-NEWS-STORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.proof_view_news", "maybe_output_news_story", "MAYBE-OUTPUT-NEWS-STORY", 1, 0, false);
        return (SubLObject)proof_view_news.NIL;
    }
    
    public static SubLObject init_proof_view_news_file() {
        proof_view_news.$proof_view_story_label$ = SubLFiles.defparameter("*PROOF-VIEW-STORY-LABEL*", (SubLObject)proof_view_news.$str0$Story_);
        proof_view_news.$proof_view_news_detail_last_sentence$ = SubLFiles.defparameter("*PROOF-VIEW-NEWS-DETAIL-LAST-SENTENCE*", misc_utilities.uninitialized());
        proof_view_news.$proof_view_story_coherence_weight$ = SubLFiles.defparameter("*PROOF-VIEW-STORY-COHERENCE-WEIGHT*", (SubLObject)proof_view_news.$float28$30_0);
        proof_view_news.$proof_view_story_meaninginess_weight$ = SubLFiles.defparameter("*PROOF-VIEW-STORY-MEANINGINESS-WEIGHT*", (SubLObject)proof_view_news.$float29$1_0);
        proof_view_news.$proof_view_story_depth_weight$ = SubLFiles.defparameter("*PROOF-VIEW-STORY-DEPTH-WEIGHT*", (SubLObject)proof_view_news.$float30$50_0);
        proof_view_news.$proof_view_story_section_max_depth$ = SubLFiles.defparameter("*PROOF-VIEW-STORY-SECTION-MAX-DEPTH*", (SubLObject)proof_view_news.FIVE_INTEGER);
        proof_view_news.$promising_news_query_sample_rate$ = SubLFiles.deflexical("*PROMISING-NEWS-QUERY-SAMPLE-RATE*", (SubLObject)proof_view_news.$int47$25);
        proof_view_news.$news_troller_daemon_abortP$ = SubLFiles.deflexical("*NEWS-TROLLER-DAEMON-ABORT?*", (SubLObject)proof_view_news.NIL);
        proof_view_news.$proof_view_news_xsl_file$ = SubLFiles.deflexical("*PROOF-VIEW-NEWS-XSL-FILE*", (SubLObject)proof_view_news.$str74$_cyc_projects_shell_DreamCatcherP);
        return (SubLObject)proof_view_news.NIL;
    }
    
    public static SubLObject setup_proof_view_news_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_news.$sym2$PROOF_VIEW_ADD_STORY_SECTION);
        proof_view_populator.note_proof_view_special_section_populator((SubLObject)proof_view_news.$sym2$PROOF_VIEW_ADD_STORY_SECTION, (SubLObject)proof_view_news.$kw3$STORY, (SubLObject)proof_view_news.NIL, proof_view_news.$const4$CycProofViewStorySection);
        memoization_state.note_memoized_function((SubLObject)proof_view_news.$sym8$PROOF_VIEW_SENTENCE_MEANINGINESS);
        memoization_state.note_memoized_function((SubLObject)proof_view_news.$sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE);
        proof_view.register_proof_view_entry_shower((SubLObject)proof_view_news.$sym38$SHOW_PROOF_VIEW_STORY_SECTION);
        proof_view.register_proof_view_output_fn_for_object_type((SubLObject)proof_view_news.$kw6$HEADLINE, (SubLObject)proof_view_news.$sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE);
        proof_view.register_proof_view_output_fn_for_object_type((SubLObject)proof_view_news.$kw11$SUBHEADLINE, (SubLObject)proof_view_news.$sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE);
        proof_view.register_proof_view_output_fn_for_object_type((SubLObject)proof_view_news.$kw32$STORY_PARAGRAPH, (SubLObject)proof_view_news.$sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH);
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_news.$sym38$SHOW_PROOF_VIEW_STORY_SECTION);
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_news.$sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE);
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_news.$sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE);
        utilities_macros.note_funcall_helper_function((SubLObject)proof_view_news.$sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH);
        return (SubLObject)proof_view_news.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_proof_view_news_file();
    }
    
    @Override
	public void initializeVariables() {
        init_proof_view_news_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_proof_view_news_file();
    }
    
    static {
        me = (SubLFile)new proof_view_news();
        proof_view_news.$proof_view_story_label$ = null;
        proof_view_news.$proof_view_news_detail_last_sentence$ = null;
        proof_view_news.$proof_view_story_coherence_weight$ = null;
        proof_view_news.$proof_view_story_meaninginess_weight$ = null;
        proof_view_news.$proof_view_story_depth_weight$ = null;
        proof_view_news.$proof_view_story_section_max_depth$ = null;
        proof_view_news.$promising_news_query_sample_rate$ = null;
        proof_view_news.$news_troller_daemon_abortP$ = null;
        proof_view_news.$proof_view_news_xsl_file$ = null;
        $str0$Story_ = SubLObjectFactory.makeString("Story:");
        $kw1$STORY_ROOT = SubLObjectFactory.makeKeyword("STORY-ROOT");
        $sym2$PROOF_VIEW_ADD_STORY_SECTION = SubLObjectFactory.makeSymbol("PROOF-VIEW-ADD-STORY-SECTION");
        $kw3$STORY = SubLObjectFactory.makeKeyword("STORY");
        $const4$CycProofViewStorySection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycProofViewStorySection"));
        $str5$ = SubLObjectFactory.makeString("");
        $kw6$HEADLINE = SubLObjectFactory.makeKeyword("HEADLINE");
        $kw7$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $sym8$PROOF_VIEW_SENTENCE_MEANINGINESS = SubLObjectFactory.makeSymbol("PROOF-VIEW-SENTENCE-MEANINGINESS");
        $str9$_S_is_trivial_in__S = SubLObjectFactory.makeString("~S is trivial in ~S");
        $str10$_S_is_irrelevant_in__S = SubLObjectFactory.makeString("~S is irrelevant in ~S");
        $kw11$SUBHEADLINE = SubLObjectFactory.makeKeyword("SUBHEADLINE");
        $kw12$JUSTIFICATION_ROOT = SubLObjectFactory.makeKeyword("JUSTIFICATION-ROOT");
        $sym13$THCL_FORT_ = SubLObjectFactory.makeSymbol("THCL-FORT?");
        $str14$__Main_actors___S__ = SubLObjectFactory.makeString("~&Main actors: ~S~%");
        $str15$__Found__D_background_facts_for__ = SubLObjectFactory.makeString("~&Found ~D background facts for ~S~%");
        $sym16$_ = SubLObjectFactory.makeSymbol(">");
        $sym17$UNLEXIFIED_ = SubLObjectFactory.makeSymbol("UNLEXIFIED?");
        $sym18$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $str19$Unlexified_FORT__S___in__S = SubLObjectFactory.makeString("Unlexified FORT ~S~% in ~S");
        $str20$Trivial_fact__S = SubLObjectFactory.makeString("Trivial fact ~S");
        $kw21$SEEN_STORY_SENTENCES = SubLObjectFactory.makeKeyword("SEEN-STORY-SENTENCES");
        $kw22$SUMMARY_ROOT = SubLObjectFactory.makeKeyword("SUMMARY-ROOT");
        $str23$__Current_paragraph_now_has__S_se = SubLObjectFactory.makeString("~&Current paragraph now has ~S sentences.~%");
        $sym24$SET_P = SubLObjectFactory.makeSymbol("SET-P");
        $sym25$PROOF_VIEW_STORY_DETAIL_SCORE = SubLObjectFactory.makeSymbol("PROOF-VIEW-STORY-DETAIL-SCORE");
        $sym26$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym27$PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE = SubLObjectFactory.makeSymbol("PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE");
        $float28$30_0 = (SubLFloat)SubLObjectFactory.makeDouble(30.0);
        $float29$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $float30$50_0 = (SubLFloat)SubLObjectFactory.makeDouble(50.0);
        $kw31$STORY_SENTENCES_SO_FAR = SubLObjectFactory.makeKeyword("STORY-SENTENCES-SO-FAR");
        $kw32$STORY_PARAGRAPH = SubLObjectFactory.makeKeyword("STORY-PARAGRAPH");
        $str33$_S___coheres_with__S = SubLObjectFactory.makeString("~S~% coheres with ~S");
        $sym34$CYCL_DENOTATIONAL_TERM_P = SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P");
        $str35$Reached_story_depth_cutoff_of__D_ = SubLObjectFactory.makeString("Reached story depth cutoff of ~D.~% Pruning supports for~% ~S");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION-BOOKKEEPING"));
        $const37$englishGloss = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("englishGloss"));
        $sym38$SHOW_PROOF_VIEW_STORY_SECTION = SubLObjectFactory.makeSymbol("SHOW-PROOF-VIEW-STORY-SECTION");
        $sym39$HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE = SubLObjectFactory.makeSymbol("HTML-OUTPUT-PROOF-VIEW-STORY-HEADLINE");
        $sym40$HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE = SubLObjectFactory.makeSymbol("HTML-OUTPUT-PROOF-VIEW-STORY-SUBHEADLINE");
        $sym41$HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH = SubLObjectFactory.makeSymbol("HTML-OUTPUT-PROOF-VIEW-STORY-PARAGRAPH");
        $sym42$PROOF_VIEW_ENTRY_GET_OBJECT_TYPE = SubLObjectFactory.makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT-TYPE");
        $str43$pf_object = SubLObjectFactory.makeString("pf-object");
        $str44$story_body = SubLObjectFactory.makeString("story-body");
        $str45$entry = SubLObjectFactory.makeString("entry");
        $str46$story_paragraph = SubLObjectFactory.makeString("story-paragraph");
        $int47$25 = SubLObjectFactory.makeInteger(25);
        $str48$News_Troller = SubLObjectFactory.makeString("News Troller");
        $sym49$TROLL_FOR_NEWS = SubLObjectFactory.makeSymbol("TROLL-FOR-NEWS");
        $sym50$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
        $str51$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw52$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str53$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw54$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str55$Read_invalid_query_info__s = SubLObjectFactory.makeString("Read invalid query info ~s");
        $sym56$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str57$aries = SubLObjectFactory.makeString("aries");
        $str58$scorpio = SubLObjectFactory.makeString("scorpio");
        $str59$libra = SubLObjectFactory.makeString("libra");
        $str60$__Evaluating_queries_in__S__ = SubLObjectFactory.makeString("~&Evaluating queries in ~S~%");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY-PROPERTIES"));
        $sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_ = SubLObjectFactory.makeSymbol("NEWS-TROLLER-QUERY-FORBIDDEN-TERM?");
        $kw63$BROWSABLE_ = SubLObjectFactory.makeKeyword("BROWSABLE?");
        $str64$__Got__D_answer__P_for__S__ = SubLObjectFactory.makeString("~&Got ~D answer~:P for ~S~%");
        $int65$50 = SubLObjectFactory.makeInteger(50);
        $str66$__Evaluated__D_queries___ = SubLObjectFactory.makeString("~&Evaluated ~D queries.~%");
        $str67$Caught_error_running_promising_qu = SubLObjectFactory.makeString("Caught error running promising query ~S~%~A");
        $sym68$PPH_VAR_TYPING_CLAUSE_ = SubLObjectFactory.makeSymbol("PPH-VAR-TYPING-CLAUSE?");
        $sym69$INVALID_FILE_NAME_CHAR = SubLObjectFactory.makeSymbol("INVALID-FILE-NAME-CHAR");
        $str70$_ = SubLObjectFactory.makeString("/");
        $str71$_xml = SubLObjectFactory.makeString(".xml");
        $str72$UTF_8 = SubLObjectFactory.makeString("UTF-8");
        $str73$__xml_stylesheet_type__text_xsl__ = SubLObjectFactory.makeString("<?xml-stylesheet type=\"text/xsl\" href=\"xml-news.xsl\"?>");
        $str74$_cyc_projects_shell_DreamCatcherP = SubLObjectFactory.makeString("/cyc/projects/shell/DreamCatcherPhaseII/ProofViewNewsArticles/xml-news.xsl");
        $int75$1000 = SubLObjectFactory.makeInteger(1000);
        $str76$proof_view_news = SubLObjectFactory.makeString("proof-view-news");
        $str77$Generated_news_story__D_character = SubLObjectFactory.makeString("Generated news story ~D characters long (~S paragraphs, ~D demerits) for~% ~S");
        $kw78$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str79$_xml_news_xsl = SubLObjectFactory.makeString("/xml-news.xsl");
    }
}

/*

	Total time: 831 ms
	
*/