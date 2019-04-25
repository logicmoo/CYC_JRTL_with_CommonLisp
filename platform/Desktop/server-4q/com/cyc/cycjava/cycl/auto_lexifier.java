package com.cyc.cycjava.cycl;

import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class auto_lexifier extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.auto_lexifier";
    public static final String myFingerPrint = "65c8d4b0762a667144cdc9a88dd9672c95deb4f60ba628fe93e0087e4b2e0e16";
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
    private static SubLSymbol $language_has_known_unicode_codepoint_range_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 6915L)
    private static SubLSymbol $bogus_unicode_string$;
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 7039L)
    private static SubLSymbol $bogusly_lexified_terms$;
    private static final SubLObject $const0$InferencePSC;
    private static final SubLObject $const1$EnglishLanguage;
    private static final SubLObject $const2$ist;
    private static final SubLString $str3$No_lexical_Mt_for__S___Unable_to_;
    private static final SubLString $str4$No_valid_characters_for__S_in__S_;
    private static final SubLObject $const5$Individual;
    private static final SubLObject $const6$nameString;
    private static final SubLObject $const7$termStrings;
    private static final SubLSymbol $sym8$NON_ASCII_CHAR_P;
    private static final SubLSymbol $kw9$OFF;
    private static final SubLSymbol $kw10$NONE;
    private static final SubLSymbol $sym11$PHRASE_STRUCTURE_PARSER_CHART_P;
    private static final SubLSymbol $kw12$ANY;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$GET_PSP_EDGE_SPAN;
    private static final SubLSymbol $kw15$LEXICAL;
    private static final SubLObject $const16$singular_Generic;
    private static final SubLObject $const17$Person;
    private static final SubLSymbol $sym18$_;
    private static final SubLList $list19;
    private static final SubLString $str20$the_;
    private static final SubLObject $const21$definiteDescriptions;
    private static final SubLSymbol $sym22$STRINGP;
    private static final SubLObject $const23$thereExists;
    private static final SubLSymbol $sym24$_ORTH;
    private static final SubLObject $const25$and;
    private static final SubLObject $const26$orthography;
    private static final SubLList $list27;
    private static final SubLObject $const28$stringHasCharacterInOrthography;
    private static final SubLSymbol $sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE;
    private static final SubLSymbol $sym30$_RANGE;
    private static final SubLList $list31;
    private static final SubLObject $const32$LanguageAndWritingSystemMt;
    private static final SubLSymbol $sym33$_LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE_CACHING_STATE_;
    private static final SubLInteger $int34$64;
    private static final SubLSymbol $sym35$AUTO_LEXIFY;
    private static final SubLSymbol $kw36$TEST;
    private static final SubLSymbol $kw37$OWNER;
    private static final SubLSymbol $kw38$CLASSES;
    private static final SubLSymbol $kw39$KB;
    private static final SubLSymbol $kw40$FULL;
    private static final SubLSymbol $kw41$WORKING_;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const45$EverythingPSC;
    private static final SubLObject $const46$wikipediaArticleName_Canonical;
    private static final SubLSymbol $kw47$GAF;
    private static final SubLObject $const48$CycTermLearner_2010Edition;
    private static final SubLString $str49$Bad_name___S_contains__S;
    private static final SubLString $str50$_home_baxter_logs_bogusly_lexifie;
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 1051L)
    public static SubLObject auto_lexify_for_language(final SubLObject string, final SubLObject meaning, final SubLObject language, SubLObject domain_mt) {
        if (domain_mt == auto_lexifier.UNPROVIDED) {
            domain_mt = auto_lexifier.$const0$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexical_mt = lexicon_utilities.lexical_mt_for_language(language);
        if (language.equal(auto_lexifier.$const1$EnglishLanguage)) {
            final SubLObject sentences = auto_lexify(string, meaning, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), domain_mt);
            SubLObject contextualized_sentences = (SubLObject)auto_lexifier.NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = (SubLObject)auto_lexifier.NIL;
            sentence = cdolist_list_var.first();
            while (auto_lexifier.NIL != cdolist_list_var) {
                contextualized_sentences = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(auto_lexifier.$const2$ist, lexical_mt, sentence), contextualized_sentences);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            }
            return Sequences.nreverse(contextualized_sentences);
        }
        final SubLObject lexical_mt_$1 = lexicon_utilities.lexical_mt_for_language(language);
        SubLObject lexical_sentence = (SubLObject)auto_lexifier.NIL;
        if (auto_lexifier.NIL == lexical_mt_$1) {
            Errors.warn((SubLObject)auto_lexifier.$str3$No_lexical_Mt_for__S___Unable_to_, language, meaning, string);
            return (SubLObject)auto_lexifier.NIL;
        }
        if (auto_lexifier.NIL != string_known_invalid_for_language(string, language)) {
            Errors.warn((SubLObject)auto_lexifier.$str4$No_valid_characters_for__S_in__S_, string, language);
            return (SubLObject)auto_lexifier.NIL;
        }
        if (auto_lexifier.NIL != isa.isaP(meaning, auto_lexifier.$const5$Individual, domain_mt, (SubLObject)auto_lexifier.UNPROVIDED)) {
            lexical_sentence = (SubLObject)ConsesLow.list(auto_lexifier.$const2$ist, lexical_mt_$1, (SubLObject)ConsesLow.list(auto_lexifier.$const6$nameString, meaning, unicode_nauts.utf8_string_to_cycl_safe_string(string)));
        }
        else {
            lexical_sentence = (SubLObject)ConsesLow.list(auto_lexifier.$const2$ist, lexical_mt_$1, (SubLObject)ConsesLow.list(auto_lexifier.$const7$termStrings, meaning, unicode_nauts.utf8_string_to_cycl_safe_string(string)));
        }
        return (SubLObject)ConsesLow.list(lexical_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 2213L)
    public static SubLObject auto_lexify(final SubLObject string, final SubLObject meaning, SubLObject lexical_mt, SubLObject domain_mt) {
        if (lexical_mt == auto_lexifier.UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (domain_mt == auto_lexifier.UNPROVIDED) {
            domain_mt = auto_lexifier.$const0$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = (SubLObject)auto_lexifier.NIL;
        SubLObject unique_heads = (SubLObject)auto_lexifier.NIL;
        final SubLObject v_cycl_string = (auto_lexifier.NIL != Sequences.find_if((SubLObject)auto_lexifier.$sym8$NON_ASCII_CHAR_P, string, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) ? cycl_string.convert_string_to_cycl(string) : string;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$guess_semantics_for_unknown_wordsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind((SubLObject)auto_lexifier.$kw9$OFF, thread);
            parsing_vars.$guess_semantics_for_unknown_wordsP$.bind((SubLObject)auto_lexifier.T, thread);
            SubLObject start_index = (SubLObject)auto_lexifier.NIL;
            SubLObject end_index = (SubLObject)auto_lexifier.NIL;
            SubLObject chart = (SubLObject)auto_lexifier.NIL;
            if (auto_lexifier.NIL == parsing_vars.$psp_chart$.getDynamicValue(thread) || auto_lexifier.NIL != parsing_macros.psp_chart_matches_gap_type_p(parsing_vars.$psp_chart$.getDynamicValue(thread), (SubLObject)auto_lexifier.$kw10$NONE)) {
                thread.resetMultipleValues();
                final SubLObject start_index_$2 = psp_main.psp_find_string_in_charts(cycl_string.cycl_string_to_utf8_string(v_cycl_string), parsing_vars.$psp_chart$.getDynamicValue(thread), parsing_vars.$psp_extra_charts$.getDynamicValue(thread));
                final SubLObject end_index_$3 = thread.secondMultipleValue();
                final SubLObject chart_$4 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                start_index = start_index_$2;
                end_index = end_index_$3;
                chart = chart_$4;
            }
            if (auto_lexifier.NIL != start_index) {
                final SubLObject _prev_bind_0_$5 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart_start_index$.bind(start_index, thread);
                    parsing_vars.$psp_chart_end_index$.bind(end_index, thread);
                    parsing_vars.$psp_chart$.bind(chart, thread);
                    psp_syntax.psp_chart_do_syntactic_parsing(chart, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED);
                    final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                    assert auto_lexifier.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) : chart_to_use;
                    if (psp_chart.psp_chart_max_span() == auto_lexifier.$kw12$ANY) {
                        final SubLObject pcase_var = (SubLObject)auto_lexifier.$kw12$ANY;
                        if (pcase_var.eql((SubLObject)auto_lexifier.$kw12$ANY)) {
                            final SubLObject chart_to_use_$7 = (auto_lexifier.NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                            assert auto_lexifier.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$7) : chart_to_use_$7;
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$7))); auto_lexifier.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject value = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                SubLObject edge = (SubLObject)auto_lexifier.NIL;
                                edge = csome_list_var.first();
                                while (auto_lexifier.NIL != csome_list_var) {
                                    if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                        final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                        if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                            unique_heads = (SubLObject)ConsesLow.cons(head_lexeme, unique_heads);
                                            final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                            if (auto_lexifier.NIL != var) {
                                                answers = (SubLObject)ConsesLow.cons(var, answers);
                                            }
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    edge = csome_list_var.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        else if (pcase_var.eql((SubLObject)auto_lexifier.$kw15$LEXICAL)) {
                            final SubLObject chart_to_use_$8 = (auto_lexifier.NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                            assert auto_lexifier.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$8) : chart_to_use_$8;
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$8))); auto_lexifier.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject value = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                SubLObject edge = (SubLObject)auto_lexifier.NIL;
                                edge = csome_list_var.first();
                                while (auto_lexifier.NIL != csome_list_var) {
                                    if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                        final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                        if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                            unique_heads = (SubLObject)ConsesLow.cons(head_lexeme, unique_heads);
                                            final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                            if (auto_lexifier.NIL != var) {
                                                answers = (SubLObject)ConsesLow.cons(var, answers);
                                            }
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    edge = csome_list_var.first();
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                    else if (auto_lexifier.NIL != interval_span.interval_span_p(psp_chart.psp_chart_max_span())) {
                        final SubLObject pcase_var = (SubLObject)auto_lexifier.$kw12$ANY;
                        if (pcase_var.eql((SubLObject)auto_lexifier.$kw12$ANY)) {
                            SubLObject csome_list_var2 = psp_chart.psp_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                            SubLObject edge2 = (SubLObject)auto_lexifier.NIL;
                            edge2 = csome_list_var2.first();
                            while (auto_lexifier.NIL != csome_list_var2) {
                                if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge2, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                    final SubLObject head_lexeme2 = psp_chart.get_psp_edge_head_lexeme(edge2);
                                    if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme2), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                        unique_heads = (SubLObject)ConsesLow.cons(head_lexeme2, unique_heads);
                                        final SubLObject var2 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme2, lexical_mt, domain_mt);
                                        if (auto_lexifier.NIL != var2) {
                                            answers = (SubLObject)ConsesLow.cons(var2, answers);
                                        }
                                    }
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                edge2 = csome_list_var2.first();
                            }
                        }
                        else if (pcase_var.eql((SubLObject)auto_lexifier.$kw15$LEXICAL)) {
                            SubLObject csome_list_var2 = psp_chart.psp_lexical_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                            SubLObject edge2 = (SubLObject)auto_lexifier.NIL;
                            edge2 = csome_list_var2.first();
                            while (auto_lexifier.NIL != csome_list_var2) {
                                if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge2, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                    final SubLObject head_lexeme2 = psp_chart.get_psp_edge_head_lexeme(edge2);
                                    if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme2), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                        unique_heads = (SubLObject)ConsesLow.cons(head_lexeme2, unique_heads);
                                        final SubLObject var2 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme2, lexical_mt, domain_mt);
                                        if (auto_lexifier.NIL != var2) {
                                            answers = (SubLObject)ConsesLow.cons(var2, answers);
                                        }
                                    }
                                }
                                csome_list_var2 = csome_list_var2.rest();
                                edge2 = csome_list_var2.first();
                            }
                        }
                    }
                }
                finally {
                    parsing_vars.$psp_chart$.rebind(_prev_bind_3, thread);
                    parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_$6, thread);
                    parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_$5, thread);
                }
            }
            else {
                final SubLObject _prev_bind_0_$6 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart_start_index$.bind((SubLObject)auto_lexifier.ZERO_INTEGER, thread);
                    parsing_vars.$psp_chart_end_index$.bind((SubLObject)auto_lexifier.NIL, thread);
                    final SubLObject chart_$5 = psp_syntax.psp_chart_for_string(cycl_string.cycl_string_to_utf8_string(v_cycl_string), parsing_macros.get_psp_lexicon(), (SubLObject)auto_lexifier.$kw10$NONE, (SubLObject)auto_lexifier.UNPROVIDED);
                    final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_$5);
                    final SubLObject _prev_bind_0_$7 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            final SubLObject _prev_bind_0_$8 = parsing_vars.$psp_chart$.currentBinding(thread);
                            try {
                                parsing_vars.$psp_chart$.bind(chart_$5, thread);
                                final SubLObject chart_to_use2 = parsing_vars.$psp_chart$.getDynamicValue(thread);
                                assert auto_lexifier.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use2) : chart_to_use2;
                                if (psp_chart.psp_chart_max_span() == auto_lexifier.$kw12$ANY) {
                                    final SubLObject pcase_var2 = (SubLObject)auto_lexifier.$kw12$ANY;
                                    if (pcase_var2.eql((SubLObject)auto_lexifier.$kw12$ANY)) {
                                        final SubLObject chart_to_use_$9 = (auto_lexifier.NIL != chart_to_use2) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                        assert auto_lexifier.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$9) : chart_to_use_$9;
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$9))); auto_lexifier.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject value2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject csome_list_var3 = psp_chart.psp_edges_with_span(span_to_do2, chart_to_use2);
                                            SubLObject edge3 = (SubLObject)auto_lexifier.NIL;
                                            edge3 = csome_list_var3.first();
                                            while (auto_lexifier.NIL != csome_list_var3) {
                                                if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge3, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                                    final SubLObject head_lexeme3 = psp_chart.get_psp_edge_head_lexeme(edge3);
                                                    if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme3), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                                        unique_heads = (SubLObject)ConsesLow.cons(head_lexeme3, unique_heads);
                                                        final SubLObject var3 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme3, lexical_mt, domain_mt);
                                                        if (auto_lexifier.NIL != var3) {
                                                            answers = (SubLObject)ConsesLow.cons(var3, answers);
                                                        }
                                                    }
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                edge3 = csome_list_var3.first();
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    }
                                    else if (pcase_var2.eql((SubLObject)auto_lexifier.$kw15$LEXICAL)) {
                                        final SubLObject chart_to_use_$10 = (auto_lexifier.NIL != chart_to_use2) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                        assert auto_lexifier.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$10) : chart_to_use_$10;
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$10))); auto_lexifier.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject value2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject csome_list_var3 = psp_chart.psp_lexical_edges_with_span(span_to_do2, chart_to_use2);
                                            SubLObject edge3 = (SubLObject)auto_lexifier.NIL;
                                            edge3 = csome_list_var3.first();
                                            while (auto_lexifier.NIL != csome_list_var3) {
                                                if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge3, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                                    final SubLObject head_lexeme3 = psp_chart.get_psp_edge_head_lexeme(edge3);
                                                    if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme3), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                                        unique_heads = (SubLObject)ConsesLow.cons(head_lexeme3, unique_heads);
                                                        final SubLObject var3 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme3, lexical_mt, domain_mt);
                                                        if (auto_lexifier.NIL != var3) {
                                                            answers = (SubLObject)ConsesLow.cons(var3, answers);
                                                        }
                                                    }
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                edge3 = csome_list_var3.first();
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    }
                                }
                                else if (auto_lexifier.NIL != interval_span.interval_span_p(psp_chart.psp_chart_max_span())) {
                                    final SubLObject pcase_var2 = (SubLObject)auto_lexifier.$kw12$ANY;
                                    if (pcase_var2.eql((SubLObject)auto_lexifier.$kw12$ANY)) {
                                        SubLObject csome_list_var = psp_chart.psp_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use2);
                                        SubLObject edge = (SubLObject)auto_lexifier.NIL;
                                        edge = csome_list_var.first();
                                        while (auto_lexifier.NIL != csome_list_var) {
                                            if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                                final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                                    unique_heads = (SubLObject)ConsesLow.cons(head_lexeme, unique_heads);
                                                    final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                    if (auto_lexifier.NIL != var) {
                                                        answers = (SubLObject)ConsesLow.cons(var, answers);
                                                    }
                                                }
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            edge = csome_list_var.first();
                                        }
                                    }
                                    else if (pcase_var2.eql((SubLObject)auto_lexifier.$kw15$LEXICAL)) {
                                        SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use2);
                                        SubLObject edge = (SubLObject)auto_lexifier.NIL;
                                        edge = csome_list_var.first();
                                        while (auto_lexifier.NIL != csome_list_var) {
                                            if (auto_lexifier.NIL != psp_chart.psp_do_edge_okP(edge, (SubLObject)auto_lexifier.$list13, (SubLObject)auto_lexifier.T)) {
                                                final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                if (auto_lexifier.NIL == Sequences.find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.$sym14$GET_PSP_EDGE_SPAN, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                                    unique_heads = (SubLObject)ConsesLow.cons(head_lexeme, unique_heads);
                                                    final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                    if (auto_lexifier.NIL != var) {
                                                        answers = (SubLObject)ConsesLow.cons(var, answers);
                                                    }
                                                }
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            edge = csome_list_var.first();
                                        }
                                    }
                                }
                                if (auto_lexifier.NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue(thread)) {
                                    psp_chart.destroy_psp_chart((SubLObject)auto_lexifier.UNPROVIDED);
                                }
                            }
                            finally {
                                parsing_vars.$psp_chart$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)auto_lexifier.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$7, thread);
                    }
                }
                finally {
                    parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_$7, thread);
                    parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            parsing_vars.$guess_semantics_for_unknown_wordsP$.rebind(_prev_bind_2, thread);
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        if (auto_lexifier.NIL == answers) {
            final SubLObject var4 = make_proper_name_formula(meaning, v_cycl_string);
            if (auto_lexifier.NIL != var4) {
                answers = (SubLObject)ConsesLow.cons(var4, answers);
            }
        }
        return Sequences.remove_duplicates(answers, (SubLObject)auto_lexifier.EQUAL, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 3514L)
    public static SubLObject auto_lexify_nbar_with_head_edge(final SubLObject string, final SubLObject meaning, final SubLObject head_lexeme, final SubLObject lexical_mt, final SubLObject domain_mt) {
        if (auto_lexifier.NIL != isa.isaP(meaning, auto_lexifier.$const5$Individual, domain_mt, (SubLObject)auto_lexifier.UNPROVIDED)) {
            if (auto_lexifier.NIL != lexicon_accessors.genl_pos_predP(psp_chart.get_psp_edge_pos_pred(head_lexeme), auto_lexifier.$const16$singular_Generic, lexical_mt)) {
                if (auto_lexifier.NIL != isa.isaP(meaning, auto_lexifier.$const17$Person, domain_mt, (SubLObject)auto_lexifier.UNPROVIDED)) {
                    return make_proper_name_formula(meaning, string);
                }
                return make_def_description(meaning, string);
            }
        }
        else {
            final SubLObject span_length = interval_span.interval_span_length(psp_chart.get_psp_edge_span(head_lexeme));
            final SubLObject head_string = psp_chart.get_psp_edge_string(head_lexeme);
            final SubLObject category = psp_chart.get_psp_edge_category(head_lexeme);
            SubLObject head_position = Numbers.add((SubLObject)auto_lexifier.ONE_INTEGER, interval_span.interval_span_start(psp_chart.get_psp_edge_span(head_lexeme)));
            if (!span_length.eql((SubLObject)auto_lexifier.ONE_INTEGER)) {
                final SubLObject locations = nl_trie.nl_trie_head_locations_in_lexical_string(head_string);
                if (auto_lexifier.NIL != locations) {
                    final SubLObject location = Sort.sort(locations, (SubLObject)auto_lexifier.$sym18$_, (SubLObject)auto_lexifier.UNPROVIDED).first();
                    head_position = Numbers.add(head_position, location);
                }
                else {
                    final SubLObject location = Sequences.length(string_utilities.string_tokenize(head_string, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED));
                    head_position = Numbers.add(head_position, location);
                }
            }
            if (auto_lexifier.NIL != lexicon_accessors.speech_partP(category, (SubLObject)auto_lexifier.UNPROVIDED)) {
                return lexification_wizard.determine_lexical_formula(meaning, string, head_position, category, lexical_mt);
            }
        }
        return (SubLObject)auto_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 4712L)
    public static SubLObject make_def_description(final SubLObject meaning, final SubLObject string) {
        final SubLObject full_string = (auto_lexifier.NIL != string_utilities.starts_with_one_of(string, (SubLObject)auto_lexifier.$list19)) ? string : Sequences.cconcatenate((SubLObject)auto_lexifier.$str20$the_, string);
        return (SubLObject)ConsesLow.list(auto_lexifier.$const21$definiteDescriptions, meaning, full_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 4949L)
    public static SubLObject make_proper_name_formula(final SubLObject cyc_term, final SubLObject lex_phrase) {
        final SubLObject cyc_predicate = misc_kb_utilities.fort_for_string(lexification_wizard.$default_proper_name_pred$.getGlobalValue());
        return (SubLObject)ConsesLow.list(cyc_predicate, cyc_term, lex_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5136L)
    public static SubLObject string_known_invalid_for_language(final SubLObject str, final SubLObject lang) {
        assert auto_lexifier.NIL != Types.stringp(str) : str;
        if (auto_lexifier.NIL != unicode_strings.ascii_string_p(str)) {
            return (SubLObject)auto_lexifier.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(auto_lexifier.NIL != language_has_known_unicode_codepoint_range(lang) && auto_lexifier.NIL == ask_utilities.query_boolean((SubLObject)ConsesLow.list(auto_lexifier.$const23$thereExists, (SubLObject)auto_lexifier.$sym24$_ORTH, (SubLObject)ConsesLow.list(auto_lexifier.$const25$and, (SubLObject)ConsesLow.listS(auto_lexifier.$const26$orthography, lang, (SubLObject)auto_lexifier.$list27), (SubLObject)ConsesLow.listS(auto_lexifier.$const28$stringHasCharacterInOrthography, unicode_nauts.utf8_string_to_cycl_safe_string(str), (SubLObject)auto_lexifier.$list27))), auto_lexifier.$const0$InferencePSC, (SubLObject)auto_lexifier.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
    public static SubLObject clear_language_has_known_unicode_codepoint_range() {
        final SubLObject cs = auto_lexifier.$language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue();
        if (auto_lexifier.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)auto_lexifier.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
    public static SubLObject remove_language_has_known_unicode_codepoint_range(final SubLObject lang) {
        return memoization_state.caching_state_remove_function_results_with_args(auto_lexifier.$language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(lang), (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
    public static SubLObject language_has_known_unicode_codepoint_range_internal(final SubLObject lang) {
        return ask_utilities.query_boolean((SubLObject)ConsesLow.list(auto_lexifier.$const23$thereExists, (SubLObject)auto_lexifier.$sym24$_ORTH, (SubLObject)ConsesLow.list(auto_lexifier.$const23$thereExists, (SubLObject)auto_lexifier.$sym30$_RANGE, (SubLObject)ConsesLow.list(auto_lexifier.$const25$and, (SubLObject)auto_lexifier.$list31, (SubLObject)ConsesLow.listS(auto_lexifier.$const26$orthography, lang, (SubLObject)auto_lexifier.$list27)))), auto_lexifier.$const32$LanguageAndWritingSystemMt, (SubLObject)auto_lexifier.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 5634L)
    public static SubLObject language_has_known_unicode_codepoint_range(final SubLObject lang) {
        SubLObject caching_state = auto_lexifier.$language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue();
        if (auto_lexifier.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)auto_lexifier.$sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE, (SubLObject)auto_lexifier.$sym33$_LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE_CACHING_STATE_, (SubLObject)auto_lexifier.$int34$64, (SubLObject)auto_lexifier.EQL, (SubLObject)auto_lexifier.ONE_INTEGER, (SubLObject)auto_lexifier.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, lang, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(language_has_known_unicode_codepoint_range_internal(lang)));
            memoization_state.caching_state_put(caching_state, lang, results, (SubLObject)auto_lexifier.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 7104L)
    public static SubLObject bogusly_lexified_terms() {
        return auto_lexifier.$bogusly_lexified_terms$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 7182L)
    public static SubLObject remove_bogus_auto_lexified_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bogus_char_vector = cycl_string.cycl_string_to_unicode_vector(auto_lexifier.$bogus_unicode_string$.getGlobalValue());
        final SubLObject bad_terms = auto_lexifier.$bogusly_lexified_terms$.getGlobalValue();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)auto_lexifier.$sym44$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(auto_lexifier.$const45$EverythingPSC, thread);
            final SubLObject pred_var = auto_lexifier.$const46$wikipediaArticleName_Canonical;
            if (auto_lexifier.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)auto_lexifier.NIL;
                final SubLObject _prev_bind_0_$17 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
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
                    utilities_macros.$progress_notification_count$.bind((SubLObject)auto_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)auto_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)auto_lexifier.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)auto_lexifier.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((auto_lexifier.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : auto_lexifier.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)auto_lexifier.NIL;
                    final SubLObject token_var = (SubLObject)auto_lexifier.NIL;
                    while (auto_lexifier.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (auto_lexifier.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)auto_lexifier.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)auto_lexifier.$kw47$GAF, (SubLObject)auto_lexifier.NIL, (SubLObject)auto_lexifier.NIL);
                                SubLObject done_var_$19 = (SubLObject)auto_lexifier.NIL;
                                final SubLObject token_var_$20 = (SubLObject)auto_lexifier.NIL;
                                while (auto_lexifier.NIL == done_var_$19) {
                                    final SubLObject wanc_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$20.eql(wanc_as));
                                    if (auto_lexifier.NIL != valid_$21) {
                                        final SubLObject v_term = assertions_high.gaf_arg1(wanc_as);
                                        final SubLObject pred_var_$22 = auto_lexifier.$const6$nameString;
                                        if (auto_lexifier.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, (SubLObject)auto_lexifier.ONE_INTEGER, pred_var_$22)) {
                                            final SubLObject iterator_var_$23 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, (SubLObject)auto_lexifier.ONE_INTEGER, pred_var_$22);
                                            SubLObject done_var_$20 = (SubLObject)auto_lexifier.NIL;
                                            final SubLObject token_var_$21 = (SubLObject)auto_lexifier.NIL;
                                            while (auto_lexifier.NIL == done_var_$20) {
                                                final SubLObject final_index_spec_$26 = iteration.iteration_next_without_values_macro_helper(iterator_var_$23, token_var_$21);
                                                final SubLObject valid_$22 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$21.eql(final_index_spec_$26));
                                                if (auto_lexifier.NIL != valid_$22) {
                                                    SubLObject final_index_iterator_$28 = (SubLObject)auto_lexifier.NIL;
                                                    try {
                                                        final_index_iterator_$28 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$26, (SubLObject)auto_lexifier.$kw47$GAF, (SubLObject)auto_lexifier.NIL, (SubLObject)auto_lexifier.NIL);
                                                        SubLObject done_var_$21 = (SubLObject)auto_lexifier.NIL;
                                                        final SubLObject token_var_$22 = (SubLObject)auto_lexifier.NIL;
                                                        while (auto_lexifier.NIL == done_var_$21) {
                                                            final SubLObject name_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$28, token_var_$22);
                                                            final SubLObject valid_$23 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$22.eql(name_gaf));
                                                            if (auto_lexifier.NIL != valid_$23 && auto_lexifier.NIL != removal_modules_assertion_mt.assertion_asserted_byP(name_gaf, auto_lexifier.$const48$CycTermLearner_2010Edition)) {
                                                                SubLObject badP = (SubLObject)auto_lexifier.NIL;
                                                                final SubLObject name = assertions_high.gaf_arg2(name_gaf);
                                                                final SubLObject name_vector = cycl_string.cycl_string_to_unicode_vector(name);
                                                                if (auto_lexifier.NIL != unicode_nauts.unicode_naut_p(name, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                                                    final SubLObject vector_var = bogus_char_vector;
                                                                    final SubLObject backwardP_var = (SubLObject)auto_lexifier.NIL;
                                                                    SubLObject length;
                                                                    SubLObject v_iteration;
                                                                    SubLObject element_num;
                                                                    SubLObject bogus_char_code;
                                                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)auto_lexifier.NIL, v_iteration = (SubLObject)auto_lexifier.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)auto_lexifier.ONE_INTEGER)) {
                                                                        element_num = ((auto_lexifier.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)auto_lexifier.ONE_INTEGER) : v_iteration);
                                                                        bogus_char_code = Vectors.aref(vector_var, element_num);
                                                                        if (auto_lexifier.NIL != Sequences.find(bogus_char_code, name_vector, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED, (SubLObject)auto_lexifier.UNPROVIDED)) {
                                                                            Errors.warn((SubLObject)auto_lexifier.$str49$Bad_name___S_contains__S, name, bogus_char_code);
                                                                            badP = (SubLObject)auto_lexifier.T;
                                                                        }
                                                                    }
                                                                }
                                                                if (auto_lexifier.NIL != badP) {
                                                                    set.set_add(v_term, bad_terms);
                                                                    ke.ke_unassert_assertion(name_gaf);
                                                                }
                                                            }
                                                            done_var_$21 = (SubLObject)SubLObjectFactory.makeBoolean(auto_lexifier.NIL == valid_$23);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)auto_lexifier.T, thread);
                                                            final SubLObject _values = Values.getValuesAsVector();
                                                            if (auto_lexifier.NIL != final_index_iterator_$28) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$28);
                                                            }
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                                done_var_$20 = (SubLObject)SubLObjectFactory.makeBoolean(auto_lexifier.NIL == valid_$22);
                                            }
                                        }
                                    }
                                    done_var_$19 = (SubLObject)SubLObjectFactory.makeBoolean(auto_lexifier.NIL == valid_$21);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)auto_lexifier.T, thread);
                                    final SubLObject _values2 = Values.getValuesAsVector();
                                    if (auto_lexifier.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values2);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(auto_lexifier.NIL == valid);
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
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$17, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return bad_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/auto-lexifier.lisp", position = 8072L)
    public static SubLObject load_bogusly_lexified_terms(SubLObject file) {
        if (file == auto_lexifier.UNPROVIDED) {
            file = (SubLObject)auto_lexifier.$str50$_home_baxter_logs_bogusly_lexifie;
        }
        auto_lexifier.$bogusly_lexified_terms$.setGlobalValue(cfasl_utilities.cfasl_load(file));
        return auto_lexifier.$bogusly_lexified_terms$.getGlobalValue();
    }
    
    public static SubLObject declare_auto_lexifier_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "auto_lexify_for_language", "AUTO-LEXIFY-FOR-LANGUAGE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "auto_lexify", "AUTO-LEXIFY", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "auto_lexify_nbar_with_head_edge", "AUTO-LEXIFY-NBAR-WITH-HEAD-EDGE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "make_def_description", "MAKE-DEF-DESCRIPTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "make_proper_name_formula", "MAKE-PROPER-NAME-FORMULA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "string_known_invalid_for_language", "STRING-KNOWN-INVALID-FOR-LANGUAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "clear_language_has_known_unicode_codepoint_range", "CLEAR-LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "remove_language_has_known_unicode_codepoint_range", "REMOVE-LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "language_has_known_unicode_codepoint_range_internal", "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "language_has_known_unicode_codepoint_range", "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "bogusly_lexified_terms", "BOGUSLY-LEXIFIED-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "remove_bogus_auto_lexified_names", "REMOVE-BOGUS-AUTO-LEXIFIED-NAMES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.auto_lexifier", "load_bogusly_lexified_terms", "LOAD-BOGUSLY-LEXIFIED-TERMS", 0, 1, false);
        return (SubLObject)auto_lexifier.NIL;
    }
    
    public static SubLObject init_auto_lexifier_file() {
        auto_lexifier.$language_has_known_unicode_codepoint_range_caching_state$ = SubLFiles.deflexical("*LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-CACHING-STATE*", (SubLObject)auto_lexifier.NIL);
        auto_lexifier.$bogus_unicode_string$ = SubLFiles.deflexical("*BOGUS-UNICODE-STRING*", (SubLObject)auto_lexifier.$list43);
        auto_lexifier.$bogusly_lexified_terms$ = SubLFiles.deflexical("*BOGUSLY-LEXIFIED-TERMS*", set.new_set(Symbols.symbol_function((SubLObject)auto_lexifier.EQUAL), (SubLObject)auto_lexifier.UNPROVIDED));
        return (SubLObject)auto_lexifier.NIL;
    }
    
    public static SubLObject setup_auto_lexifier_file() {
        memoization_state.note_globally_cached_function((SubLObject)auto_lexifier.$sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE);
        generic_testing.define_test_case_table_int((SubLObject)auto_lexifier.$sym35$AUTO_LEXIFY, (SubLObject)ConsesLow.list(new SubLObject[] { auto_lexifier.$kw36$TEST, auto_lexifier.EQUAL, auto_lexifier.$kw37$OWNER, auto_lexifier.NIL, auto_lexifier.$kw38$CLASSES, auto_lexifier.NIL, auto_lexifier.$kw39$KB, auto_lexifier.$kw40$FULL, auto_lexifier.$kw41$WORKING_, auto_lexifier.T }), (SubLObject)auto_lexifier.$list42);
        return (SubLObject)auto_lexifier.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_auto_lexifier_file();
    }
    
    @Override
	public void initializeVariables() {
        init_auto_lexifier_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_auto_lexifier_file();
    }
    
    static {
        me = (SubLFile)new auto_lexifier();
        auto_lexifier.$language_has_known_unicode_codepoint_range_caching_state$ = null;
        auto_lexifier.$bogus_unicode_string$ = null;
        auto_lexifier.$bogusly_lexified_terms$ = null;
        $const0$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $const1$EnglishLanguage = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishLanguage"));
        $const2$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $str3$No_lexical_Mt_for__S___Unable_to_ = SubLObjectFactory.makeString("No lexical Mt for ~S.  Unable to auto-lexify ~S as ~S.");
        $str4$No_valid_characters_for__S_in__S_ = SubLObjectFactory.makeString("No valid characters for ~S in ~S.  Unable to autolexify.");
        $const5$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const6$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $const7$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $sym8$NON_ASCII_CHAR_P = SubLObjectFactory.makeSymbol("NON-ASCII-CHAR-P");
        $kw9$OFF = SubLObjectFactory.makeKeyword("OFF");
        $kw10$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym11$PHRASE_STRUCTURE_PARSER_CHART_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");
        $kw12$ANY = SubLObjectFactory.makeKeyword("ANY");
        $list13 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")));
        $sym14$GET_PSP_EDGE_SPAN = SubLObjectFactory.makeSymbol("GET-PSP-EDGE-SPAN");
        $kw15$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $const16$singular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular-Generic"));
        $const17$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $sym18$_ = SubLObjectFactory.makeSymbol(">");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("The "), (SubLObject)SubLObjectFactory.makeString("the "));
        $str20$the_ = SubLObjectFactory.makeString("the ");
        $const21$definiteDescriptions = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definiteDescriptions"));
        $sym22$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $const23$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym24$_ORTH = SubLObjectFactory.makeSymbol("?ORTH");
        $const25$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const26$orthography = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("orthography"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ORTH"));
        $const28$stringHasCharacterInOrthography = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("stringHasCharacterInOrthography"));
        $sym29$LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE = SubLObjectFactory.makeSymbol("LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE");
        $sym30$_RANGE = SubLObjectFactory.makeSymbol("?RANGE");
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("unicodeCodePointRangeUsedInWritingSystem")), (SubLObject)SubLObjectFactory.makeSymbol("?RANGE"), (SubLObject)SubLObjectFactory.makeSymbol("?ORTH"));
        $const32$LanguageAndWritingSystemMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LanguageAndWritingSystemMt"));
        $sym33$_LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-CACHING-STATE*");
        $int34$64 = SubLObjectFactory.makeInteger(64);
        $sym35$AUTO_LEXIFY = SubLObjectFactory.makeSymbol("AUTO-LEXIFY");
        $kw36$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw37$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw38$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw39$KB = SubLObjectFactory.makeKeyword("KB");
        $kw40$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw41$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("turkey sandwich"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FederalBureauOfInvestigation"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definiteDescriptions")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FederalBureauOfInvestigation")), (SubLObject)SubLObjectFactory.makeString("the turkey sandwich")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("turkey sandwich"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeString("turkey")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sandwich-TheWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("turkey sandwich on rye"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeString("turkey")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Sandwich-TheWord")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("rye")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("newspaper agency"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeString("newspaper")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Agency-TheWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Parisian terrorist organization"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeString("Parisian"), (SubLObject)SubLObjectFactory.makeString("terrorist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization-TheWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("terrorist organization"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList")), (SubLObject)SubLObjectFactory.makeString("terrorist")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Organization-TheWord")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HeartAttack"))))));
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnicodeStringFn")), (SubLObject)SubLObjectFactory.makeString("&uA6;&uB0;&u80;&u93;&u9D;&uC3;&uA2;&uA4;&uB6;&uB3;&uBC;"));
        $sym44$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const45$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const46$wikipediaArticleName_Canonical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wikipediaArticleName-Canonical"));
        $kw47$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const48$CycTermLearner_2010Edition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycTermLearner-2010Edition"));
        $str49$Bad_name___S_contains__S = SubLObjectFactory.makeString("Bad name: ~S contains ~S");
        $str50$_home_baxter_logs_bogusly_lexifie = SubLObjectFactory.makeString("/home/baxter/logs/bogusly-lexified-terms.cfasl");
    }
}

/*

	Total time: 537 ms
	
*/