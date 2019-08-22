package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_common_symbols$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_set_common_symbols;
import static com.cyc.cycjava.cycl.constant_handles.invalid_constantP;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_existential_p;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.remove_html_tags;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_1;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.nth_value_step_2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class proof_view_news extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new proof_view_news();

    public static final String myName = "com.cyc.cycjava_2.cycl.proof_view_news";


    // defparameter
    public static final SubLSymbol $proof_view_story_label$ = makeSymbol("*PROOF-VIEW-STORY-LABEL*");

    // defparameter
    private static final SubLSymbol $proof_view_news_detail_last_sentence$ = makeSymbol("*PROOF-VIEW-NEWS-DETAIL-LAST-SENTENCE*");

    // defparameter
    private static final SubLSymbol $proof_view_story_coherence_weight$ = makeSymbol("*PROOF-VIEW-STORY-COHERENCE-WEIGHT*");

    // defparameter
    private static final SubLSymbol $proof_view_story_meaninginess_weight$ = makeSymbol("*PROOF-VIEW-STORY-MEANINGINESS-WEIGHT*");

    // defparameter
    private static final SubLSymbol $proof_view_story_depth_weight$ = makeSymbol("*PROOF-VIEW-STORY-DEPTH-WEIGHT*");

    // defparameter
    private static final SubLSymbol $proof_view_story_section_max_depth$ = makeSymbol("*PROOF-VIEW-STORY-SECTION-MAX-DEPTH*");

    // deflexical
    private static final SubLSymbol $promising_news_query_sample_rate$ = makeSymbol("*PROMISING-NEWS-QUERY-SAMPLE-RATE*");

    // deflexical
    private static final SubLSymbol $news_troller_daemon_abortP$ = makeSymbol("*NEWS-TROLLER-DAEMON-ABORT?*");

    // deflexical
    public static final SubLSymbol $proof_view_news_xsl_file$ = makeSymbol("*PROOF-VIEW-NEWS-XSL-FILE*");

    private static final SubLString $str0$Story_ = makeString("Story:");

    private static final SubLSymbol $STORY_ROOT = makeKeyword("STORY-ROOT");

    private static final SubLSymbol PROOF_VIEW_ADD_STORY_SECTION = makeSymbol("PROOF-VIEW-ADD-STORY-SECTION");

    private static final SubLSymbol $STORY = makeKeyword("STORY");

    private static final SubLObject $$CycProofViewStorySection = reader_make_constant_shell(makeString("CycProofViewStorySection"));

    private static final SubLString $str5$ = makeString("");

    private static final SubLSymbol $HEADLINE = makeKeyword("HEADLINE");



    private static final SubLSymbol PROOF_VIEW_SENTENCE_MEANINGINESS = makeSymbol("PROOF-VIEW-SENTENCE-MEANINGINESS");

    private static final SubLString $str9$_S_is_trivial_in__S = makeString("~S is trivial in ~S");

    private static final SubLString $str10$_S_is_irrelevant_in__S = makeString("~S is irrelevant in ~S");

    private static final SubLSymbol $SUBHEADLINE = makeKeyword("SUBHEADLINE");



    private static final SubLSymbol $sym13$THCL_FORT_ = makeSymbol("THCL-FORT?");

    private static final SubLString $str14$__Main_actors___S__ = makeString("~&Main actors: ~S~%");

    private static final SubLString $str15$__Found__D_background_facts_for__ = makeString("~&Found ~D background facts for ~S~%");

    private static final SubLSymbol $sym16$_ = makeSymbol(">");

    private static final SubLSymbol $sym17$UNLEXIFIED_ = makeSymbol("UNLEXIFIED?");



    private static final SubLString $str19$Unlexified_FORT__S___in__S = makeString("Unlexified FORT ~S~% in ~S");

    private static final SubLString $str20$Trivial_fact__S = makeString("Trivial fact ~S");

    private static final SubLSymbol $SEEN_STORY_SENTENCES = makeKeyword("SEEN-STORY-SENTENCES");

    private static final SubLSymbol $SUMMARY_ROOT = makeKeyword("SUMMARY-ROOT");

    private static final SubLString $str23$__Current_paragraph_now_has__S_se = makeString("~&Current paragraph now has ~S sentences.~%");



    private static final SubLSymbol PROOF_VIEW_STORY_DETAIL_SCORE = makeSymbol("PROOF-VIEW-STORY-DETAIL-SCORE");

    private static final SubLSymbol $sym26$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE = makeSymbol("PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE");

    private static final SubLFloat $float$30_0 = makeDouble(30.0);

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLFloat $float$50_0 = makeDouble(50.0);

    private static final SubLSymbol $STORY_SENTENCES_SO_FAR = makeKeyword("STORY-SENTENCES-SO-FAR");

    private static final SubLSymbol $STORY_PARAGRAPH = makeKeyword("STORY-PARAGRAPH");

    private static final SubLString $str33$_S___coheres_with__S = makeString("~S~% coheres with ~S");



    private static final SubLString $str35$Reached_story_depth_cutoff_of__D_ = makeString("Reached story depth cutoff of ~D.~% Pruning supports for~% ~S");

    private static final SubLList $list36 = list(makeKeyword("ASSERTION-BOOKKEEPING"));

    private static final SubLObject $$englishGloss = reader_make_constant_shell(makeString("englishGloss"));

    private static final SubLSymbol SHOW_PROOF_VIEW_STORY_SECTION = makeSymbol("SHOW-PROOF-VIEW-STORY-SECTION");

    private static final SubLSymbol HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE = makeSymbol("HTML-OUTPUT-PROOF-VIEW-STORY-HEADLINE");

    private static final SubLSymbol HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE = makeSymbol("HTML-OUTPUT-PROOF-VIEW-STORY-SUBHEADLINE");

    private static final SubLSymbol HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH = makeSymbol("HTML-OUTPUT-PROOF-VIEW-STORY-PARAGRAPH");

    private static final SubLSymbol PROOF_VIEW_ENTRY_GET_OBJECT_TYPE = makeSymbol("PROOF-VIEW-ENTRY-GET-OBJECT-TYPE");

    private static final SubLString $str43$pf_object = makeString("pf-object");

    private static final SubLString $str44$story_body = makeString("story-body");

    private static final SubLString $$$entry = makeString("entry");

    private static final SubLString $str46$story_paragraph = makeString("story-paragraph");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $$$News_Troller = makeString("News Troller");

    private static final SubLSymbol TROLL_FOR_NEWS = makeSymbol("TROLL-FOR-NEWS");



    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLString $str53$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLString $str55$Read_invalid_query_info__s = makeString("Read invalid query info ~s");



    private static final SubLString $$$aries = makeString("aries");

    private static final SubLString $$$scorpio = makeString("scorpio");

    private static final SubLString $$$libra = makeString("libra");

    private static final SubLString $str60$__Evaluating_queries_in__S__ = makeString("~&Evaluating queries in ~S~%");

    private static final SubLList $list61 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));

    private static final SubLSymbol $sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_ = makeSymbol("NEWS-TROLLER-QUERY-FORBIDDEN-TERM?");



    private static final SubLString $str64$__Got__D_answer__P_for__S__ = makeString("~&Got ~D answer~:P for ~S~%");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $str66$__Evaluated__D_queries___ = makeString("~&Evaluated ~D queries.~%");

    private static final SubLString $str67$Caught_error_running_promising_qu = makeString("Caught error running promising query ~S~%~A");

    private static final SubLSymbol $sym68$PPH_VAR_TYPING_CLAUSE_ = makeSymbol("PPH-VAR-TYPING-CLAUSE?");

    private static final SubLSymbol INVALID_FILE_NAME_CHAR = makeSymbol("INVALID-FILE-NAME-CHAR");

    private static final SubLString $str70$_ = makeString("/");

    private static final SubLString $str71$_xml = makeString(".xml");

    private static final SubLString $str72$UTF_8 = makeString("UTF-8");

    private static final SubLString $str73$__xml_stylesheet_type__text_xsl__ = makeString("<?xml-stylesheet type=\"text/xsl\" href=\"xml-news.xsl\"?>");

    private static final SubLString $str74$_cyc_projects_shell_DreamCatcherP = makeString("/cyc/projects/shell/DreamCatcherPhaseII/ProofViewNewsArticles/xml-news.xsl");



    private static final SubLString $str76$proof_view_news = makeString("proof-view-news");

    private static final SubLString $str77$Generated_news_story__D_character = makeString("Generated news story ~D characters long (~S paragraphs, ~D demerits) for~% ~S");



    private static final SubLString $str79$_xml_news_xsl = makeString("/xml-news.xsl");

    public static SubLObject headline_for_proof_conclusion(final SubLObject proof_conclusion) {
        return cycl_string.cycl_string_to_utf8_string(pph_headline.generate_english_headline_string(proof_conclusion, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject proof_view_add_story_section(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject story_root_entry = proof_view_populator.proof_view_add_section_root(v_proof_view, $proof_view_story_label$.getDynamicValue(thread));
        final SubLObject item_var = $proof_view_story_label$.getDynamicValue(thread);
        if (NIL == member(item_var, proof_view.$proof_view_tab_entry_labels$.getDynamicValue(thread), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            proof_view.$proof_view_tab_entry_labels$.setDynamicValue(cons(item_var, proof_view.$proof_view_tab_entry_labels$.getDynamicValue(thread)), thread);
        }
        proof_view_build_story_section(story_root_entry);
        proof_view_populator.proof_view_entry_note_expand_initially(story_root_entry);
        if (NIL != list_utilities.lengthG(proof_view.proof_view_entry_get_children(story_root_entry), ONE_INTEGER, UNPROVIDED)) {
            proof_view.proof_view_set_property(v_proof_view, $STORY_ROOT, story_root_entry);
        } else {
            proof_view_populator.proof_view_remove_entry(v_proof_view, story_root_entry);
        }
        return story_root_entry;
    }

    public static SubLObject proof_view_get_story_root_entry(final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject root_entry = proof_view.proof_view_get_root_entry(v_proof_view);
        SubLObject cdolist_list_var = proof_view.proof_view_entry_get_children(root_entry);
        SubLObject child_entry = NIL;
        child_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (proof_view.proof_view_entry_get_label(child_entry).equal($proof_view_story_label$.getDynamicValue(thread))) {
                return child_entry;
            }
            cdolist_list_var = cdolist_list_var.rest();
            child_entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject proof_view_build_story_section(final SubLObject story_root_entry) {
        final SubLObject headline_entry = maybe_add_proof_view_headline(story_root_entry);
        maybe_add_proof_view_subheadline(story_root_entry, headline_entry);
        final SubLObject lede_content = maybe_add_proof_view_lede(story_root_entry);
        maybe_add_proof_view_story_significance(story_root_entry);
        maybe_add_proof_view_story_actors_brief_background(story_root_entry, lede_content);
        maybe_add_proof_view_story_details(story_root_entry);
        return story_root_entry;
    }

    public static SubLObject maybe_add_proof_view_headline(final SubLObject story_root_entry) {
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof_view.proof_view_get_proof(v_proof_view), UNPROVIDED);
        final SubLObject headline_content = proof_view_headline_content(proof_conclusion, v_proof_view);
        return proof_view_populator.proof_view_add_new_entry(v_proof_view, $str5$, story_root_entry, $HEADLINE, headline_content, UNPROVIDED);
    }

    public static SubLObject proof_view_headline_content(final SubLObject proof_conclusion, SubLObject v_proof_view) {
        if (v_proof_view == UNPROVIDED) {
            v_proof_view = NIL;
        }
        if (NIL != el_conjunction_p(proof_conclusion)) {
            SubLObject best_conjunct = NIL;
            SubLObject best_conjunct_score = ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(proof_conclusion, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
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

    public static SubLObject proof_view_headline_conjunct_score(final SubLObject conjunct) {
        if (NIL != pph_utilities.pph_var_typing_predicateP(cycl_utilities.formula_arg0(conjunct), UNPROVIDED)) {
            return ONE_INTEGER;
        }
        return proof_view_sentence_meaninginess(conjunct, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject proof_view_sentence_meaninginess_internal(final SubLObject sentence, SubLObject irrelevance_context, SubLObject triviality_context) {
        if (irrelevance_context == UNPROVIDED) {
            irrelevance_context = pph_proof.pph_irrelevance_check_mt();
        }
        if (triviality_context == UNPROVIDED) {
            triviality_context = pph_proof.pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject best_score = ZERO_INTEGER;
        if (NIL != pph_proof.pph_trivial_sentenceP(sentence, triviality_context)) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str9$_S_is_trivial_in__S, sentence, triviality_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL != pph_proof.pph_irrelevant_formulaP(sentence, NIL, irrelevance_context)) {
                if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str10$_S_is_irrelevant_in__S, sentence, irrelevance_context, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else {
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
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

    public static SubLObject proof_view_sentence_meaninginess(final SubLObject sentence, SubLObject irrelevance_context, SubLObject triviality_context) {
        if (irrelevance_context == UNPROVIDED) {
            irrelevance_context = pph_proof.pph_irrelevance_check_mt();
        }
        if (triviality_context == UNPROVIDED) {
            triviality_context = pph_proof.pph_triviality_check_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return proof_view_sentence_meaninginess_internal(sentence, irrelevance_context, triviality_context);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_SENTENCE_MEANINGINESS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_SENTENCE_MEANINGINESS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_SENTENCE_MEANINGINESS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, irrelevance_context, triviality_context);
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
                    if (irrelevance_context.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && triviality_context.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_sentence_meaninginess_internal(sentence, irrelevance_context, triviality_context)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, irrelevance_context, triviality_context));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject maybe_add_proof_view_subheadline(final SubLObject story_root_entry, final SubLObject headline_entry) {
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof_view.proof_view_get_proof(v_proof_view), UNPROVIDED);
        final SubLObject headline_content = proof_view.proof_view_entry_get_object(headline_entry);
        final SubLObject subheadline_content = proof_view_subheadline_content(proof_conclusion, headline_content, v_proof_view);
        return NIL != subheadline_content ? proof_view_populator.proof_view_add_new_entry(v_proof_view, $str5$, story_root_entry, $SUBHEADLINE, subheadline_content, UNPROVIDED) : NIL;
    }

    public static SubLObject proof_view_subheadline_content(final SubLObject proof_conclusion, final SubLObject headline_content, final SubLObject v_proof_view) {
        if (NIL != el_conjunction_p(proof_conclusion)) {
            final SubLObject conjuncts_to_keep = remove(headline_content, cycl_utilities.formula_args(proof_conclusion, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != conjuncts_to_keep ? NIL != list_utilities.singletonP(conjuncts_to_keep) ? list_utilities.only_one(conjuncts_to_keep) : simplifier.conjoin(conjuncts_to_keep, UNPROVIDED) : NIL;
        }
        return NIL;
    }

    public static SubLObject maybe_add_proof_view_lede(final SubLObject story_root_entry) {
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject proof_conclusion = pph_proof.pph_proof_conclusion(proof_view.proof_view_get_proof(v_proof_view), UNPROVIDED);
        final SubLObject justification_entry = proof_view.proof_view_get_property(v_proof_view, $JUSTIFICATION_ROOT, UNPROVIDED);
        final SubLObject top_level_proof = proof_view.proof_view_get_proof(v_proof_view);
        final SubLObject top_level_rule = pph_proof.pph_real_or_quasi_transformation_proof_rule(top_level_proof);
        final SubLObject top_level_rule_trivialP = pph_proof.pph_trivial_assertionP(top_level_rule, UNPROVIDED);
        final SubLObject lede_content = (NIL != proof_conclusion) ? proof_view_lede_content(proof_conclusion, v_proof_view) : NIL;
        if (NIL != lede_content) {
            proof_view_add_story_paragraph(story_root_entry, lede_content);
        }
        return lede_content;
    }

    public static SubLObject proof_view_lede_content(final SubLObject proof_conclusion, final SubLObject v_proof_view) {
        return proof_conclusion;
    }

    public static SubLObject maybe_add_proof_view_story_significance(final SubLObject story_root_entry) {
        return NIL;
    }

    public static SubLObject maybe_add_proof_view_story_actors_brief_background(final SubLObject story_root_entry, final SubLObject lede_content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject main_actors = cycl_utilities.expression_gather(lede_content, $sym13$THCL_FORT_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject domain_mt = proof_view.proof_view_get_domain_mt(v_proof_view);
        final SubLObject seen_sentences = proof_view_get_seen_story_sentences(v_proof_view);
        final SubLObject unincluded_facts = queues.create_queue(UNPROVIDED);
        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str14$__Main_actors___S__, main_actors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject local_state;
        final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(proof_view.proof_view_entry_get_proof_view(story_root_entry));
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = main_actors;
                SubLObject actor = NIL;
                actor = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject key_facts = remove(ZERO_INTEGER, fact_sheets.thcl_sentences_for_term_fact_sheet(actor, domain_mt), PROOF_VIEW_SENTENCE_MEANINGINESS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject actor_facts = NIL;
                    if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                        format_nil.force_format(T, $str15$__Found__D_background_facts_for__, length(key_facts), actor, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    while ((NIL == list_utilities.lengthGE(actor_facts, THREE_INTEGER, UNPROVIDED)) && (NIL == list_utilities.empty_list_p(key_facts))) {
                        final SubLObject fact = list_utilities.extremal(key_facts, symbol_function($sym16$_), PROOF_VIEW_SENTENCE_MEANINGINESS);
                        if ((NIL != set.set_add(proof_view_summary.proof_view_summary_item_sentence(fact), seen_sentences)) && (NIL != fact_okay_for_proof_view_actor_brief_backgroundP(fact))) {
                            final SubLObject last_fact = list_utilities.last_one(queues.queue_elements(unincluded_facts));
                            if ((NIL == queues.queue_empty_p(unincluded_facts)) && (NIL == proof_view_story_fact_coheres_with_last_factP(fact, last_fact))) {
                                proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
                            }
                            proof_view_maybe_enqueue_unincluded_fact(v_proof_view, fact, unincluded_facts);
                            actor_facts = cons(fact, actor_facts);
                        }
                        key_facts = remove(fact, key_facts, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } 
                    proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
                    cdolist_list_var = cdolist_list_var.rest();
                    actor = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject proof_view_maybe_enqueue_unincluded_fact(final SubLObject v_proof_view, final SubLObject fact, final SubLObject queue) {
        if (NIL == subl_promotions.memberP(proof_view.proof_view_fact_sentence(fact), proof_view_get_story_sentences_so_far(v_proof_view), symbol_function(EQUAL), UNPROVIDED)) {
            queues.enqueue(fact, queue);
        }
        return T;
    }

    public static SubLObject fact_okay_for_proof_view_actor_brief_backgroundP(final SubLObject fact) {
        if (NIL != find_if($sym17$UNLEXIFIED_, cycl_utilities.expression_gather(fact, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            Errors.warn($str19$Unlexified_FORT__S___in__S, find_if($sym17$UNLEXIFIED_, cycl_utilities.expression_gather(fact, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED), fact);
            return NIL;
        }
        if (NIL != pph_proof.sentence_trivial_for_justification_paraphraseP(fact, UNPROVIDED)) {
            Errors.warn($str20$Trivial_fact__S, fact);
            return NIL;
        }
        return T;
    }

    public static SubLObject proof_view_get_seen_story_sentences(final SubLObject v_proof_view) {
        SubLObject ans = proof_view.proof_view_get_property(v_proof_view, $SEEN_STORY_SENTENCES, misc_utilities.uninitialized());
        if (NIL != misc_utilities.uninitialized_p(ans)) {
            ans = set.new_set(symbol_function(EQUAL), UNPROVIDED);
            proof_view.proof_view_set_property(v_proof_view, $SEEN_STORY_SENTENCES, ans);
        }
        return ans;
    }

    public static SubLObject maybe_add_proof_view_story_details(final SubLObject story_root_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject justification_entry = proof_view.proof_view_get_property(v_proof_view, $JUSTIFICATION_ROOT, UNPROVIDED);
        final SubLObject summary_entry = proof_view.proof_view_get_property(v_proof_view, $SUMMARY_ROOT, UNPROVIDED);
        final SubLObject detailed_entries_to_include = detailed_entry_gather_story_entries(justification_entry, UNPROVIDED, UNPROVIDED);
        final SubLObject seen_sentences = proof_view_get_seen_story_sentences(v_proof_view);
        final SubLObject enoughP = NIL;
        final SubLObject unincluded_facts = queues.create_queue(UNPROVIDED);
        if (NIL != summary_entry) {
            set_utilities.set_add_all(proof_view.proof_view_entry_get_children(summary_entry), detailed_entries_to_include);
        }
        final SubLObject local_state;
        final SubLObject state = local_state = proof_view.find_proof_view_memoization_state(v_proof_view);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while ((NIL == enoughP) && (NIL == set.empty_set_p(detailed_entries_to_include))) {
                    final SubLObject last_fact = (NIL != queues.queue_empty_p(unincluded_facts)) ? list_utilities.last_one(proof_view_get_story_sentences_so_far(proof_view.proof_view_entry_get_proof_view(set_utilities.set_arbitrary_element_without_values(detailed_entries_to_include, UNPROVIDED)))) : list_utilities.last_one(queues.queue_elements(unincluded_facts));
                    SubLObject fact = choose_next_proof_view_story_detail(detailed_entries_to_include, unincluded_facts);
                    if (NIL != set.set_add(proof_view_summary.proof_view_summary_item_sentence(fact), seen_sentences)) {
                        if (NIL != arguments.hl_support_p(fact)) {
                            fact = arguments.support_sentence(fact);
                        }
                        if ((NIL == queues.queue_empty_p(unincluded_facts)) && (NIL == proof_view_story_fact_coheres_with_last_factP(fact, last_fact))) {
                            proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
                        }
                        proof_view_maybe_enqueue_unincluded_fact(v_proof_view, fact, unincluded_facts);
                        if (NIL == proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                            continue;
                        }
                        format_nil.force_format(T, $str23$__Current_paragraph_now_has__S_se, queues.queue_size(unincluded_facts), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        proof_add_unincluded_story_facts_paragraph(story_root_entry, unincluded_facts);
        return NIL;
    }

    public static SubLObject choose_next_proof_view_story_detail(final SubLObject detailed_entries_to_include, final SubLObject unincluded_facts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != set.set_p(detailed_entries_to_include) : "set.set_p(detailed_entries_to_include) " + "CommonSymbols.NIL != set.set_p(detailed_entries_to_include) " + detailed_entries_to_include;
        final SubLObject sentences_so_far = proof_view_get_story_sentences_so_far(proof_view.proof_view_entry_get_proof_view(set_utilities.set_arbitrary_element_without_values(detailed_entries_to_include, UNPROVIDED)));
        final SubLObject _prev_bind_0 = $proof_view_news_detail_last_sentence$.currentBinding(thread);
        try {
            $proof_view_news_detail_last_sentence$.bind(NIL != queues.queue_empty_p(unincluded_facts) ? list_utilities.last_one(sentences_so_far) : list_utilities.last_one(queues.queue_elements(unincluded_facts)), thread);
            final SubLObject best_entry = list_utilities.extremal(set.set_element_list(detailed_entries_to_include), symbol_function($sym16$_), PROOF_VIEW_STORY_DETAIL_SCORE);
            set.set_remove(best_entry, detailed_entries_to_include);
            return proof_view.proof_view_entry_get_object(best_entry);
        } finally {
            $proof_view_news_detail_last_sentence$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject proof_view_story_detail_score(final SubLObject entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject last_sentence = $proof_view_news_detail_last_sentence$.getDynamicValue(thread);
        final SubLObject fact = proof_view.proof_view_entry_get_object(entry);
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(entry);
        final SubLObject justification_entry = proof_view.proof_view_get_property(v_proof_view, $JUSTIFICATION_ROOT, UNPROVIDED);
        final SubLObject root_depth = proof_view.proof_view_entry_get_depth(justification_entry);
        final SubLObject depth = subtract(proof_view.proof_view_entry_get_depth(entry), root_depth);
        return proof_view_story_detail_score_wrt_last_sentence(fact, last_sentence, depth);
    }

    public static SubLObject proof_view_story_detail_score_wrt_last_sentence_internal(final SubLObject fact, final SubLObject last_sentence, final SubLObject depth) {
        final SubLObject coherence = length(intersection(proof_view_story_fact_terms(fact), proof_view_story_fact_terms(last_sentence), symbol_function(EQUAL), UNPROVIDED));
        final SubLObject meaninginess = proof_view_sentence_meaninginess(fact, UNPROVIDED, UNPROVIDED);
        return compute_proof_view_story_detail_score(coherence, meaninginess, depth);
    }

    public static SubLObject proof_view_story_detail_score_wrt_last_sentence(final SubLObject fact, final SubLObject last_sentence, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return proof_view_story_detail_score_wrt_last_sentence_internal(fact, last_sentence, depth);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(fact, last_sentence, depth);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fact.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (last_sentence.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && depth.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(proof_view_story_detail_score_wrt_last_sentence_internal(fact, last_sentence, depth)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fact, last_sentence, depth));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject compute_proof_view_story_detail_score(final SubLObject coherence, final SubLObject meaninginess, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(multiply($proof_view_story_coherence_weight$.getDynamicValue(thread), coherence), multiply($proof_view_story_meaninginess_weight$.getDynamicValue(thread), meaninginess), multiply($proof_view_story_depth_weight$.getDynamicValue(thread), divide(ONE_INTEGER, depth)));
    }

    public static SubLObject sort_proof_view_story_details(final SubLObject entries) {
        final SubLObject v_proof_view = (NIL != set.set_emptyP(entries)) ? NIL : proof_view.proof_view_entry_get_proof_view(set_utilities.set_arbitrary_element_without_values(entries, UNPROVIDED));
        return NIL != v_proof_view ? nreverse(proof_view_populator.proof_view_sort_entries_to_maximize_coherence(v_proof_view, proof_view.proof_view_get_domain_mt(v_proof_view), set.set_element_list(entries))) : NIL;
    }

    public static SubLObject proof_view_get_story_sentences_so_far(final SubLObject v_proof_view) {
        return proof_view.proof_view_get_property(v_proof_view, $STORY_SENTENCES_SO_FAR, NIL);
    }

    public static SubLObject proof_view_add_story_sentence(final SubLObject v_proof_view, final SubLObject sentence) {
        return proof_view.proof_view_set_property(v_proof_view, $STORY_SENTENCES_SO_FAR, list_utilities.add_to_end(proof_view.proof_view_fact_sentence(sentence), proof_view_get_story_sentences_so_far(v_proof_view)));
    }

    public static SubLObject proof_add_unincluded_story_facts_paragraph(final SubLObject story_root_entry, final SubLObject unincluded_facts) {
        if (NIL != queues.queue_empty_p(unincluded_facts)) {
            return NIL;
        }
        final SubLObject facts = queues.dequeue_all(unincluded_facts);
        final SubLObject content = (NIL != list_utilities.singletonP(facts)) ? list_utilities.only_one(facts) : simplifier.conjoin(facts, UNPROVIDED);
        return proof_view_add_story_paragraph(story_root_entry, content);
    }

    public static SubLObject proof_view_add_story_paragraph(final SubLObject story_root_entry, final SubLObject content) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(story_root_entry);
        final SubLObject _prev_bind_0 = proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.currentBinding(thread);
        try {
            proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.bind(T, thread);
            final SubLObject story_paragraph_entry = proof_view_populator.proof_view_add_new_entry(v_proof_view, $str5$, story_root_entry, $STORY_PARAGRAPH, content, UNPROVIDED);
            SubLObject cdolist_list_var = (NIL != el_conjunction_p(content)) ? cycl_utilities.formula_args(content, UNPROVIDED) : list(content);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                proof_view_add_story_sentence(v_proof_view, conjunct);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return story_paragraph_entry;
        } finally {
            proof_view_populator.$suspend_auto_sorting_of_proof_view_entriesP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject proof_view_story_fact_coheres_with_last_factP(final SubLObject fact, final SubLObject last_fact) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != proof_view_story_fact_requires_own_paragraphP(fact)) {
            return NIL;
        }
        if (NIL != list_utilities.non_empty_list_p(intersection(proof_view_story_fact_terms(fact), proof_view_story_fact_terms(last_fact), symbol_function(EQUAL), UNPROVIDED))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str33$_S___coheres_with__S, fact, last_fact, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject proof_view_story_fact_terms(final SubLObject fact) {
        return list_utilities.find_all_if(CYCL_DENOTATIONAL_TERM_P, cycl_utilities.formula_args(fact, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject proof_view_story_fact_requires_own_paragraphP(final SubLObject fact) {
        if (NIL != el_conjunction_p(fact)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject detailed_entry_gather_story_entries(final SubLObject detailed_entry, SubLObject entries, SubLObject depth) {
        if (entries == UNPROVIDED) {
            entries = set.new_set(symbol_function(EQL), UNPROVIDED);
        }
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (depth.numGE($proof_view_story_section_max_depth$.getDynamicValue(thread))) {
            if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                Errors.warn($str35$Reached_story_depth_cutoff_of__D_, $proof_view_story_section_max_depth$.getDynamicValue(thread), proof_view.proof_view_entry_get_object(detailed_entry));
            }
        } else {
            SubLObject cdolist_list_var;
            final SubLObject children = cdolist_list_var = proof_view.proof_view_entry_get_children(detailed_entry);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set_utilities.set_add_set(detailed_entry_gather_story_entries(child, entries, number_utilities.f_1X(depth)), entries);
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
            if (NIL != proof_view_story_include_detailed_entryP(detailed_entry)) {
                SubLObject child_missingP = NIL;
                if (NIL == child_missingP) {
                    SubLObject csome_list_var = children;
                    SubLObject child2 = NIL;
                    child2 = csome_list_var.first();
                    while ((NIL == child_missingP) && (NIL != csome_list_var)) {
                        if (NIL == set.set_memberP(child2, entries)) {
                            child_missingP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        child2 = csome_list_var.first();
                    } 
                }
                if ((NIL != list_utilities.empty_list_p(children)) || (NIL != child_missingP)) {
                    set.set_add(detailed_entry, entries);
                }
            }
        }
        return entries;
    }

    public static SubLObject proof_view_story_include_detailed_entryP(final SubLObject detailed_entry) {
        if (NIL != subl_promotions.memberP(proof_view.proof_view_entry_get_object_type(detailed_entry), $list36, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != pph_proof.sentence_trivial_for_justification_paraphraseP(proof_view.proof_view_entry_get_object(detailed_entry), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != proof_view_story_include_detailed_entry_objectP(proof_view.proof_view_entry_get_object(detailed_entry), proof_view.proof_view_entry_get_proof_view(detailed_entry))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject proof_view_story_include_detailed_entry_objectP(final SubLObject v_object, final SubLObject v_proof_view) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.rule_assertionP(v_object)) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(proof_view.proof_view_get_language_mt(v_proof_view));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                return kb_mapping_utilities.some_pred_value_in_relevant_mts(v_object, $$englishGloss, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return cycl_grammar.cycl_sentence_p(v_object);
    }

    public static SubLObject show_proof_view_story_section(final SubLObject root, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_proof_view = proof_view.proof_view_entry_get_proof_view(root);
        if (!root.eql(proof_view.proof_view_get_property(v_proof_view, $STORY_ROOT, UNPROVIDED))) {
            return NIL;
        }
        final SubLObject children = proof_view.proof_view_entry_get_children(root);
        final SubLObject headline_entry = find($HEADLINE, children, symbol_function(EQL), PROOF_VIEW_ENTRY_GET_OBJECT_TYPE, UNPROVIDED, UNPROVIDED);
        final SubLObject include_cyclP = proof_view.proof_view_get_include_cycl_in_outputP(v_proof_view);
        if (NIL != headline_entry) {
            html_markup(proof_view.proof_view_entry_generate_html(headline_entry));
            if (NIL != include_cyclP) {
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str43$pf_object);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    final SubLObject v_object = proof_view.proof_view_entry_get_object(headline_entry);
                    pph_proof.show_proof_view_object(v_object, headline_entry, ZERO_INTEGER);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
        }
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str44$story_body);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject cdolist_list_var = remove(headline_entry, children, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject child = NIL;
            child = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_markup(html_macros.$html_div_head$.getGlobalValue());
                html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$entry);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_div_head$.getGlobalValue());
                    html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str46$story_paragraph);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(proof_view.proof_view_entry_generate_html(child));
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                    }
                    html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    if (NIL != include_cyclP) {
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str43$pf_object);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            final SubLObject v_object2 = proof_view.proof_view_entry_get_object(child);
                            pph_proof.show_proof_view_object(v_object2, child, ZERO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                }
                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                child = cdolist_list_var.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return T;
    }

    public static SubLObject html_output_proof_view_story_headline(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP) {
        if (allow_external_linksP == UNPROVIDED) {
            allow_external_linksP = NIL;
        }
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(ONE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        pph_proof.pph_show_sentence(v_object, pph_headline.generate_english_headline_string(v_object, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(ONE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        return v_object;
    }

    public static SubLObject html_output_proof_view_story_subheadline(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP) {
        if (allow_external_linksP == UNPROVIDED) {
            allow_external_linksP = NIL;
        }
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        pph_proof.pph_show_sentence(v_object, pph_headline.generate_english_headline_string(v_object, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(THREE_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        return v_object;
    }

    public static SubLObject html_output_proof_view_story_paragraph(final SubLObject v_proof_view, final SubLObject v_object, SubLObject allow_external_linksP) {
        if (allow_external_linksP == UNPROVIDED) {
            allow_external_linksP = NIL;
        }
        pph_proof.pph_show_sentence(v_object, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static SubLObject launch_news_troller_daemon() {
        $news_troller_daemon_abortP$.setGlobalValue(NIL);
        return process_utilities.make_cyc_server_process($$$News_Troller, TROLL_FOR_NEWS);
    }

    public static SubLObject halt_news_troller_daemon() {
        $news_troller_daemon_abortP$.setGlobalValue(T);
        return $news_troller_daemon_abortP$.getGlobalValue();
    }

    public static SubLObject troll_for_news(SubLObject keepalive_filename, SubLObject done_queries) {
        if (keepalive_filename == UNPROVIDED) {
            keepalive_filename = NIL;
        }
        if (done_queries == UNPROVIDED) {
            done_queries = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject last_file = NIL;
        SubLObject skip_fileP = NIL;
        SubLObject abortP = $news_troller_daemon_abortP$.getGlobalValue();
        final SubLObject new_kbqs = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while (NIL == abortP) {
                    final SubLObject _prev_bind_0_$7 = Errors.$ignore_warnsP$.currentBinding(thread);
                    try {
                        Errors.$ignore_warnsP$.bind(T, thread);
                        assert NIL != Filesys.directory_p(transcript_utilities.transcript_directory()) : "Filesys.directory_p(transcript_utilities.transcript_directory()) " + "CommonSymbols.NIL != Filesys.directory_p(transcript_utilities.transcript_directory()) " + transcript_utilities.transcript_directory();
                        SubLObject directory_contents_var = Filesys.directory(transcript_utilities.transcript_directory(), T);
                        final SubLObject progress_message_var = NIL;
                        final SubLObject _prev_bind_0_$8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                            if (NIL.isFunctionSpec()) {
                                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
                            }
                            final SubLObject list_var = directory_contents_var;
                            final SubLObject _prev_bind_0_$9 = $progress_note$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                                $progress_start_time$.bind(get_universal_time(), thread);
                                $progress_total$.bind(length(list_var), thread);
                                $progress_sofar$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                try {
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    if (NIL == abortP) {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject current_file = NIL;
                                        current_file = csome_list_var.first();
                                        while ((NIL == abortP) && (NIL != csome_list_var)) {
                                            if (NIL != inference_analysis.asked_queries_filenameP(current_file)) {
                                                SubLObject done_varP = NIL;
                                                SubLObject i = ZERO_INTEGER;
                                                SubLObject stream = NIL;
                                                try {
                                                    final SubLObject _prev_bind_0_$10 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                                    try {
                                                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                        stream = compatibility.open_binary(current_file, $INPUT);
                                                    } finally {
                                                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                    if (!stream.isStream()) {
                                                        Errors.error($str53$Unable_to_open__S, current_file);
                                                    }
                                                    final SubLObject input_stream = stream;
                                                    final SubLObject _prev_bind_0_$11 = $cfasl_common_symbols$.currentBinding(thread);
                                                    try {
                                                        $cfasl_common_symbols$.bind(NIL, thread);
                                                        cfasl_set_common_symbols(inference_analysis.asked_query_common_symbols());
                                                        while (NIL == done_varP) {
                                                            final SubLObject query_info = inference_analysis.load_asked_query_from_stream(input_stream);
                                                            if ($EOF == query_info) {
                                                                done_varP = T;
                                                            } else
                                                                if (query_info.isString()) {
                                                                    Errors.warn($str55$Read_invalid_query_info__s, query_info);
                                                                } else {
                                                                    final SubLObject _prev_bind_0_$12 = Errors.$ignore_warnsP$.currentBinding(thread);
                                                                    try {
                                                                        Errors.$ignore_warnsP$.bind(NIL, thread);
                                                                        SubLObject err_msg = NIL;
                                                                        try {
                                                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                                            final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                                                                            try {
                                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                                try {
                                                                                    if (!current_file.equal(last_file)) {
                                                                                        last_file = current_file;
                                                                                        skip_fileP = makeBoolean(((NIL != string_utilities.substringP($$$aries, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != string_utilities.substringP($$$scorpio, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED))) || (NIL != string_utilities.substringP($$$libra, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                                                                        if ((NIL == skip_fileP) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
                                                                                            format_nil.force_format(T, $str60$__Evaluating_queries_in__S__, current_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                        }
                                                                                    }
                                                                                    if (((NIL == skip_fileP) && (NIL != list_utilities.proper_list_p(query_info))) && (NIL != list_utilities.lengthE(query_info, THREE_INTEGER, UNPROVIDED))) {
                                                                                        SubLObject current;
                                                                                        final SubLObject datum = current = query_info;
                                                                                        SubLObject sentence = NIL;
                                                                                        SubLObject mt = NIL;
                                                                                        SubLObject query_properties = NIL;
                                                                                        destructuring_bind_must_consp(current, datum, $list61);
                                                                                        sentence = current.first();
                                                                                        current = current.rest();
                                                                                        destructuring_bind_must_consp(current, datum, $list61);
                                                                                        mt = current.first();
                                                                                        current = current.rest();
                                                                                        destructuring_bind_must_consp(current, datum, $list61);
                                                                                        query_properties = current.first();
                                                                                        current = current.rest();
                                                                                        if (NIL == current) {
                                                                                            if (((((!random.random($promising_news_query_sample_rate$.getGlobalValue()).isPositive()) && (NIL == set.set_memberP(query_info, done_queries))) && (NIL != inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP(query_properties))) && (NIL == list_utilities.tree_find_if($sym62$NEWS_TROLLER_QUERY_FORBIDDEN_TERM_, query_info, UNPROVIDED))) && (NIL == query_sentence_has_no_obvious_headlineP(sentence))) {
                                                                                                query_properties = putf(query_properties, $BROWSABLE_, T);
                                                                                                SubLObject inference = NIL;
                                                                                                SubLObject time = NIL;
                                                                                                try {
                                                                                                    final SubLObject time_var = get_internal_real_time();
                                                                                                    inference = nth_value_step_2(nth_value_step_1(TWO_INTEGER), inference_kernel.new_cyc_query(sentence, mt, query_properties));
                                                                                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                                                                    final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
                                                                                                    final SubLObject num_to_try = min(FIVE_INTEGER, max(ONE_INTEGER, integerDivide(answer_count, $promising_news_query_sample_rate$.getGlobalValue())));
                                                                                                    if (answer_count.isPositive() && time.numG(ONE_INTEGER)) {
                                                                                                        if (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread)) {
                                                                                                            format_nil.force_format(T, $str64$__Got__D_answer__P_for__S__, answer_count, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                        SubLObject cdolist_list_var = list_utilities.random_n(num_to_try, inference_datastructures_inference.inference_all_answers(inference, UNPROVIDED));
                                                                                                        SubLObject v_answer = NIL;
                                                                                                        v_answer = cdolist_list_var.first();
                                                                                                        while (NIL != cdolist_list_var) {
                                                                                                            if (NIL == abortP) {
                                                                                                                maybe_output_news_story(v_answer);
                                                                                                            }
                                                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                                                            v_answer = cdolist_list_var.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } finally {
                                                                                                    final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        final SubLObject _values = getValuesAsVector();
                                                                                                        set.set_add(query_info, done_queries);
                                                                                                        if (ZERO_INTEGER.eql(mod(set.set_size(done_queries), $int$50)) && (NIL != proof_view.$proof_view_debugP$.getDynamicValue(thread))) {
                                                                                                            format_nil.force_format(T, $str66$__Evaluated__D_queries___, set.set_size(done_queries), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                        inference_datastructures_inference.destroy_inference_and_problem_store(inference);
                                                                                                        restoreValuesFromVector(_values);
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            cdestructuring_bind_error(datum, $list61);
                                                                                        }
                                                                                    }
                                                                                } catch (final Throwable catch_var) {
                                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                                }
                                                                            } finally {
                                                                                Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        } catch (final Throwable ccatch_env_var) {
                                                                            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                                        } finally {
                                                                            thread.throwStack.pop();
                                                                        }
                                                                        if (NIL != err_msg) {
                                                                            Errors.warn($str67$Caught_error_running_promising_qu, current_file, err_msg);
                                                                        }
                                                                    } finally {
                                                                        Errors.$ignore_warnsP$.rebind(_prev_bind_0_$12, thread);
                                                                    }
                                                                    if (NIL != $news_troller_daemon_abortP$.getGlobalValue()) {
                                                                        abortP = T;
                                                                    }
                                                                    file_utilities.possibly_update_keepalive_file(keepalive_filename);
                                                                    i = add(i, ONE_INTEGER);
                                                                }

                                                            if (NIL != abortP) {
                                                                done_varP = abortP;
                                                            }
                                                        } 
                                                    } finally {
                                                        $cfasl_common_symbols$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                } finally {
                                                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (stream.isStream()) {
                                                            close(stream, UNPROVIDED);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                }
                                            }
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            csome_list_var = csome_list_var.rest();
                                            current_file = csome_list_var.first();
                                        } 
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                                $progress_sofar$.rebind(_prev_bind_4, thread);
                                $progress_total$.rebind(_prev_bind_3, thread);
                                $progress_start_time$.rebind(_prev_bind_2, thread);
                                $progress_note$.rebind(_prev_bind_0_$9, thread);
                            }
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_0_$8, thread);
                        }
                    } finally {
                        Errors.$ignore_warnsP$.rebind(_prev_bind_0_$7, thread);
                    }
                } 
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values4 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values4);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return new_kbqs;
    }

    public static SubLObject query_sentence_has_no_obvious_headlineP(final SubLObject sentence) {
        if (NIL != el_conjunction_p(sentence)) {
            final SubLObject badP = makeBoolean(NIL == list_utilities.singletonP(remove_if($sym68$PPH_VAR_TYPING_CLAUSE_, cycl_utilities.formula_args(sentence, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            return badP;
        }
        if (NIL != el_existential_p(sentence)) {
            return query_sentence_has_no_obvious_headlineP(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject news_troller_query_forbidden_termP(final SubLObject v_term) {
        if (NIL != narts_high.invalid_nartP(v_term, UNPROVIDED)) {
            return T;
        }
        if (NIL != invalid_constantP(v_term, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject filename_from_news_proof_view(final SubLObject v_proof_view, final SubLObject directory) {
        final SubLObject story_root = proof_view_get_story_root_entry(v_proof_view);
        final SubLObject headline_entry = proof_view.proof_view_entry_get_children(story_root).first();
        final SubLObject headline = remove_html_tags(proof_view.proof_view_entry_generate_html(headline_entry), UNPROVIDED);
        final SubLObject short_head = (NIL != list_utilities.lengthL(headline, $int$50, UNPROVIDED)) ? headline : string_utilities.substring(headline, ZERO_INTEGER, $int$50);
        final SubLObject clean_head = Strings.string_downcase(remove_if(INVALID_FILE_NAME_CHAR, short_head, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        return cconcatenate(directory, new SubLObject[]{ $str70$_, clean_head, $str71$_xml });
    }

    public static SubLObject invalid_file_name_char(final SubLObject v_char) {
        if (v_char.eql(CHAR_space)) {
            return T;
        }
        if (v_char.eql(CHAR_colon)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject construct_news_story_proof_view(final SubLObject proof, final SubLObject v_answer, SubLObject debugP, SubLObject summary_algorithm) {
        if (debugP == UNPROVIDED) {
            debugP = proof_view.$proof_view_debugP$.getDynamicValue();
        }
        if (summary_algorithm == UNPROVIDED) {
            summary_algorithm = NIL;
        }
        final SubLObject v_proof_view = proof_view.get_new_empty_proof_view(UNPROVIDED, UNPROVIDED);
        proof_view.proof_view_set_proof(v_proof_view, proof);
        proof_view.proof_view_set_answer(v_proof_view, v_answer);
        proof_view.proof_view_set_include_rules_sectionP(v_proof_view, NIL);
        proof_view_linear.proof_view_set_include_linear_sectionP(v_proof_view, NIL);
        proof_view.proof_view_set_allow_external_linksP(v_proof_view, NIL);
        proof_view.proof_view_set_allow_internal_linksP(v_proof_view, NIL);
        proof_view_summary.proof_view_set_include_summary_sectionP(v_proof_view, NIL);
        proof_view.proof_view_set_include_justification_sectionP(v_proof_view, NIL);
        proof_view.proof_view_set_include_sourcesP(v_proof_view, T);
        proof_view_populator.proof_view_set_include_special_sectionP(v_proof_view, $STORY, T);
        proof_view.proof_view_set_allow_internal_linksP(v_proof_view, NIL);
        proof_view.proof_view_set_allow_external_linksP(v_proof_view, NIL);
        proof_view.proof_view_set_link_phrasesP(v_proof_view, NIL);
        proof_view.proof_view_set_include_silkP(v_proof_view, NIL);
        proof_view.proof_view_set_include_cycml_in_xmlP(v_proof_view, NIL);
        proof_view.proof_view_set_include_cycl_in_outputP(v_proof_view, T);
        proof_view.proof_view_set_enable_debugP(v_proof_view, debugP);
        if (NIL != summary_algorithm) {
            proof_view_summary.proof_view_set_summary_algorithm(v_proof_view, summary_algorithm);
        }
        proof_view_populator.proof_view_populate(v_proof_view, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return v_proof_view;
    }

    public static SubLObject output_proof_view_news_story(final SubLObject v_proof_view) {
        xml_utilities.xml_header($float$1_0, $str72$UTF_8, UNPROVIDED);
        xml_utilities.xml_write_string($str73$__xml_stylesheet_type__text_xsl__, UNPROVIDED, UNPROVIDED);
        proof_view.output_proof_view_in_xml(v_proof_view, T);
        return v_proof_view;
    }

    public static SubLObject maybe_output_news_story(final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject proof = pph_proof.inference_answer_get_proofs(inference_answer).first();
        final SubLObject _prev_bind_0 = proof_view.$proof_view_debugP$.currentBinding(thread);
        try {
            proof_view.$proof_view_debugP$.bind(NIL, thread);
            final SubLObject v_proof_view = construct_news_story_proof_view(proof, inference_answer, UNPROVIDED, UNPROVIDED);
            final SubLObject story_root = proof_view.proof_view_get_property(v_proof_view, $STORY_ROOT, NIL);
            final SubLObject para_count = number_utilities.f_1_(proof_view.proof_view_count_entries(story_root));
            SubLObject xml = NIL;
            if (para_count.numG(THREE_INTEGER)) {
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = make_private_string_output_stream();
                        final SubLObject _prev_bind_0_$18 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            output_proof_view_news_story(v_proof_view);
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0_$18, thread);
                        }
                        xml = get_output_stream_string(stream);
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            close(stream, UNPROVIDED);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                    final SubLObject demerits = proof_view.proof_view_entry_get_paraphrase_demerits(story_root, T);
                    if ((NIL != list_utilities.lengthGE(xml, $int$1000, UNPROVIDED)) && para_count.numG(demerits)) {
                        final SubLObject directory = princ_to_string(file_utilities.make_directory_recursive(file_utilities.relative_filename(transcript_utilities.transcript_directory(), $str76$proof_view_news, UNPROVIDED), UNPROVIDED, UNPROVIDED));
                        final SubLObject filename = filename_from_news_proof_view(v_proof_view, directory);
                        Errors.warn($str77$Generated_news_story__D_character, new SubLObject[]{ length(xml), para_count, demerits, inference_answer });
                        SubLObject stream_$20 = NIL;
                        try {
                            final SubLObject _prev_bind_0_$20 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream_$20 = compatibility.open_text(filename, $OUTPUT);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$20, thread);
                            }
                            if (!stream_$20.isStream()) {
                                Errors.error($str53$Unable_to_open__S, filename);
                            }
                            final SubLObject stream_$21 = stream_$20;
                            princ(xml, stream_$21);
                        } finally {
                            final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (stream_$20.isStream()) {
                                    close(stream_$20, UNPROVIDED);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        final SubLObject xsl = cconcatenate(directory, $str79$_xml_news_xsl);
                        if (NIL == file_utilities.file_existsP(xsl)) {
                            file_utilities.create_symbolic_link(xsl, $proof_view_news_xsl_file$.getGlobalValue());
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        proof_view.destroy_proof_view(v_proof_view);
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            return xml;
        } finally {
            proof_view.$proof_view_debugP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject declare_proof_view_news_file() {
        declareFunction("headline_for_proof_conclusion", "HEADLINE-FOR-PROOF-CONCLUSION", 1, 0, false);
        declareFunction("proof_view_add_story_section", "PROOF-VIEW-ADD-STORY-SECTION", 1, 0, false);
        declareFunction("proof_view_get_story_root_entry", "PROOF-VIEW-GET-STORY-ROOT-ENTRY", 1, 0, false);
        declareFunction("proof_view_build_story_section", "PROOF-VIEW-BUILD-STORY-SECTION", 1, 0, false);
        declareFunction("maybe_add_proof_view_headline", "MAYBE-ADD-PROOF-VIEW-HEADLINE", 1, 0, false);
        declareFunction("proof_view_headline_content", "PROOF-VIEW-HEADLINE-CONTENT", 1, 1, false);
        declareFunction("proof_view_headline_conjunct_score", "PROOF-VIEW-HEADLINE-CONJUNCT-SCORE", 1, 0, false);
        declareFunction("proof_view_sentence_meaninginess_internal", "PROOF-VIEW-SENTENCE-MEANINGINESS-INTERNAL", 1, 2, false);
        declareFunction("proof_view_sentence_meaninginess", "PROOF-VIEW-SENTENCE-MEANINGINESS", 1, 2, false);
        declareFunction("maybe_add_proof_view_subheadline", "MAYBE-ADD-PROOF-VIEW-SUBHEADLINE", 2, 0, false);
        declareFunction("proof_view_subheadline_content", "PROOF-VIEW-SUBHEADLINE-CONTENT", 3, 0, false);
        declareFunction("maybe_add_proof_view_lede", "MAYBE-ADD-PROOF-VIEW-LEDE", 1, 0, false);
        declareFunction("proof_view_lede_content", "PROOF-VIEW-LEDE-CONTENT", 2, 0, false);
        declareFunction("maybe_add_proof_view_story_significance", "MAYBE-ADD-PROOF-VIEW-STORY-SIGNIFICANCE", 1, 0, false);
        declareFunction("maybe_add_proof_view_story_actors_brief_background", "MAYBE-ADD-PROOF-VIEW-STORY-ACTORS-BRIEF-BACKGROUND", 2, 0, false);
        declareFunction("proof_view_maybe_enqueue_unincluded_fact", "PROOF-VIEW-MAYBE-ENQUEUE-UNINCLUDED-FACT", 3, 0, false);
        declareFunction("fact_okay_for_proof_view_actor_brief_backgroundP", "FACT-OKAY-FOR-PROOF-VIEW-ACTOR-BRIEF-BACKGROUND?", 1, 0, false);
        declareFunction("proof_view_get_seen_story_sentences", "PROOF-VIEW-GET-SEEN-STORY-SENTENCES", 1, 0, false);
        declareFunction("maybe_add_proof_view_story_details", "MAYBE-ADD-PROOF-VIEW-STORY-DETAILS", 1, 0, false);
        declareFunction("choose_next_proof_view_story_detail", "CHOOSE-NEXT-PROOF-VIEW-STORY-DETAIL", 2, 0, false);
        declareFunction("proof_view_story_detail_score", "PROOF-VIEW-STORY-DETAIL-SCORE", 1, 0, false);
        declareFunction("proof_view_story_detail_score_wrt_last_sentence_internal", "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE-INTERNAL", 3, 0, false);
        declareFunction("proof_view_story_detail_score_wrt_last_sentence", "PROOF-VIEW-STORY-DETAIL-SCORE-WRT-LAST-SENTENCE", 3, 0, false);
        declareFunction("compute_proof_view_story_detail_score", "COMPUTE-PROOF-VIEW-STORY-DETAIL-SCORE", 3, 0, false);
        declareFunction("sort_proof_view_story_details", "SORT-PROOF-VIEW-STORY-DETAILS", 1, 0, false);
        declareFunction("proof_view_get_story_sentences_so_far", "PROOF-VIEW-GET-STORY-SENTENCES-SO-FAR", 1, 0, false);
        declareFunction("proof_view_add_story_sentence", "PROOF-VIEW-ADD-STORY-SENTENCE", 2, 0, false);
        declareFunction("proof_add_unincluded_story_facts_paragraph", "PROOF-ADD-UNINCLUDED-STORY-FACTS-PARAGRAPH", 2, 0, false);
        declareFunction("proof_view_add_story_paragraph", "PROOF-VIEW-ADD-STORY-PARAGRAPH", 2, 0, false);
        declareFunction("proof_view_story_fact_coheres_with_last_factP", "PROOF-VIEW-STORY-FACT-COHERES-WITH-LAST-FACT?", 2, 0, false);
        declareFunction("proof_view_story_fact_terms", "PROOF-VIEW-STORY-FACT-TERMS", 1, 0, false);
        declareFunction("proof_view_story_fact_requires_own_paragraphP", "PROOF-VIEW-STORY-FACT-REQUIRES-OWN-PARAGRAPH?", 1, 0, false);
        declareFunction("detailed_entry_gather_story_entries", "DETAILED-ENTRY-GATHER-STORY-ENTRIES", 1, 2, false);
        declareFunction("proof_view_story_include_detailed_entryP", "PROOF-VIEW-STORY-INCLUDE-DETAILED-ENTRY?", 1, 0, false);
        declareFunction("proof_view_story_include_detailed_entry_objectP", "PROOF-VIEW-STORY-INCLUDE-DETAILED-ENTRY-OBJECT?", 2, 0, false);
        declareFunction("show_proof_view_story_section", "SHOW-PROOF-VIEW-STORY-SECTION", 1, 1, false);
        declareFunction("html_output_proof_view_story_headline", "HTML-OUTPUT-PROOF-VIEW-STORY-HEADLINE", 2, 1, false);
        declareFunction("html_output_proof_view_story_subheadline", "HTML-OUTPUT-PROOF-VIEW-STORY-SUBHEADLINE", 2, 1, false);
        declareFunction("html_output_proof_view_story_paragraph", "HTML-OUTPUT-PROOF-VIEW-STORY-PARAGRAPH", 2, 1, false);
        declareFunction("launch_news_troller_daemon", "LAUNCH-NEWS-TROLLER-DAEMON", 0, 0, false);
        declareFunction("halt_news_troller_daemon", "HALT-NEWS-TROLLER-DAEMON", 0, 0, false);
        declareFunction("troll_for_news", "TROLL-FOR-NEWS", 0, 2, false);
        declareFunction("query_sentence_has_no_obvious_headlineP", "QUERY-SENTENCE-HAS-NO-OBVIOUS-HEADLINE?", 1, 0, false);
        declareFunction("news_troller_query_forbidden_termP", "NEWS-TROLLER-QUERY-FORBIDDEN-TERM?", 1, 0, false);
        declareFunction("filename_from_news_proof_view", "FILENAME-FROM-NEWS-PROOF-VIEW", 2, 0, false);
        declareFunction("invalid_file_name_char", "INVALID-FILE-NAME-CHAR", 1, 0, false);
        declareFunction("construct_news_story_proof_view", "CONSTRUCT-NEWS-STORY-PROOF-VIEW", 2, 2, false);
        declareFunction("output_proof_view_news_story", "OUTPUT-PROOF-VIEW-NEWS-STORY", 1, 0, false);
        declareFunction("maybe_output_news_story", "MAYBE-OUTPUT-NEWS-STORY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_proof_view_news_file() {
        defparameter("*PROOF-VIEW-STORY-LABEL*", $str0$Story_);
        defparameter("*PROOF-VIEW-NEWS-DETAIL-LAST-SENTENCE*", misc_utilities.uninitialized());
        defparameter("*PROOF-VIEW-STORY-COHERENCE-WEIGHT*", $float$30_0);
        defparameter("*PROOF-VIEW-STORY-MEANINGINESS-WEIGHT*", $float$1_0);
        defparameter("*PROOF-VIEW-STORY-DEPTH-WEIGHT*", $float$50_0);
        defparameter("*PROOF-VIEW-STORY-SECTION-MAX-DEPTH*", FIVE_INTEGER);
        deflexical("*PROMISING-NEWS-QUERY-SAMPLE-RATE*", $int$25);
        deflexical("*NEWS-TROLLER-DAEMON-ABORT?*", NIL);
        deflexical("*PROOF-VIEW-NEWS-XSL-FILE*", $str74$_cyc_projects_shell_DreamCatcherP);
        return NIL;
    }

    public static SubLObject setup_proof_view_news_file() {
        note_funcall_helper_function(PROOF_VIEW_ADD_STORY_SECTION);
        proof_view_populator.note_proof_view_special_section_populator(PROOF_VIEW_ADD_STORY_SECTION, $STORY, NIL, $$CycProofViewStorySection);
        memoization_state.note_memoized_function(PROOF_VIEW_SENTENCE_MEANINGINESS);
        memoization_state.note_memoized_function(PROOF_VIEW_STORY_DETAIL_SCORE_WRT_LAST_SENTENCE);
        proof_view.register_proof_view_entry_shower(SHOW_PROOF_VIEW_STORY_SECTION);
        proof_view.register_proof_view_output_fn_for_object_type($HEADLINE, HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE);
        proof_view.register_proof_view_output_fn_for_object_type($SUBHEADLINE, HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE);
        proof_view.register_proof_view_output_fn_for_object_type($STORY_PARAGRAPH, HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH);
        note_funcall_helper_function(SHOW_PROOF_VIEW_STORY_SECTION);
        note_funcall_helper_function(HTML_OUTPUT_PROOF_VIEW_STORY_HEADLINE);
        note_funcall_helper_function(HTML_OUTPUT_PROOF_VIEW_STORY_SUBHEADLINE);
        note_funcall_helper_function(HTML_OUTPUT_PROOF_VIEW_STORY_PARAGRAPH);
        return NIL;
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

    
}

/**
 * Total time: 831 ms
 */
