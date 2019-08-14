/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.isa.isaP;
import static com.cyc.cycjava.cycl.lexicon_vars.$lexicon_lookup_mt$;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_assertion_mt;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      AUTO-LEXIFIER
 * source file: /cyc/top/cycl/auto-lexifier.lisp
 * created:     2019/07/03 17:38:26
 */
public final class auto_lexifier extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new auto_lexifier();

 public static final String myName = "com.cyc.cycjava.cycl.auto_lexifier";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bogus_unicode_string$ = makeSymbol("*BOGUS-UNICODE-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $bogusly_lexified_terms$ = makeSymbol("*BOGUSLY-LEXIFIED-TERMS*");







    private static final SubLString $str3$No_lexical_Mt_for__S___Unable_to_ = makeString("No lexical Mt for ~S.  Unable to auto-lexify ~S as ~S.");

    private static final SubLString $str4$No_valid_characters_for__S_in__S_ = makeString("No valid characters for ~S in ~S.  Unable to autolexify.");







    private static final SubLSymbol NON_ASCII_CHAR_P = makeSymbol("NON-ASCII-CHAR-P");

    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_CHART_P = makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");

    private static final SubLList $list13 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    private static final SubLSymbol GET_PSP_EDGE_SPAN = makeSymbol("GET-PSP-EDGE-SPAN");

    private static final SubLObject $$singular_Generic = reader_make_constant_shell("singular-Generic");



    private static final SubLSymbol $sym18$_ = makeSymbol(">");

    private static final SubLList $list19 = list(makeString("The "), makeString("the "));

    private static final SubLString $$$the_ = makeString("the ");





    private static final SubLSymbol $sym24$_ORTH = makeSymbol("?ORTH");





    private static final SubLList $list27 = list(makeSymbol("?ORTH"));



    private static final SubLSymbol LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE = makeSymbol("LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE");

    private static final SubLSymbol $sym30$_RANGE = makeSymbol("?RANGE");

    private static final SubLList $list31 = list(reader_make_constant_shell("unicodeCodePointRangeUsedInWritingSystem"), makeSymbol("?RANGE"), makeSymbol("?ORTH"));



    private static final SubLSymbol $language_has_known_unicode_codepoint_range_caching_state$ = makeSymbol("*LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-CACHING-STATE*");

    private static final SubLSymbol AUTO_LEXIFY = makeSymbol("AUTO-LEXIFY");

    private static final SubLList $list42 = list(list(list(makeString("turkey sandwich"), reader_make_constant_shell("FederalBureauOfInvestigation")), list(list(reader_make_constant_shell("definiteDescriptions"), reader_make_constant_shell("FederalBureauOfInvestigation"), makeString("the turkey sandwich")))), list(list(makeString("turkey sandwich"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("turkey")), reader_make_constant_shell("Sandwich-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("turkey sandwich on rye"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("headMedialString"), list(reader_make_constant_shell("TheList"), makeString("turkey")), reader_make_constant_shell("Sandwich-TheWord"), list(reader_make_constant_shell("TheList"), makeString("on"), makeString("rye")), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("newspaper agency"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("newspaper")), reader_make_constant_shell("Agency-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("Parisian terrorist organization"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("Parisian"), makeString("terrorist")), reader_make_constant_shell("Organization-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("terrorist organization"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("terrorist")), reader_make_constant_shell("Organization-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))));

    private static final SubLList $list43 = list(reader_make_constant_shell("UnicodeStringFn"), makeString("&uA6;&uB0;&u80;&u93;&u9D;&uC3;&uA2;&uA4;&uB6;&uB3;&uBC;"));



    private static final SubLObject $$wikipediaArticleName_Canonical = reader_make_constant_shell("wikipediaArticleName-Canonical");

    private static final SubLObject $$CycTermLearner_2010Edition = reader_make_constant_shell("CycTermLearner-2010Edition");

    private static final SubLString $str49$Bad_name___S_contains__S = makeString("Bad name: ~S contains ~S");

    private static final SubLString $str50$_home_baxter_logs_bogusly_lexifie = makeString("/home/baxter/logs/bogusly-lexified-terms.cfasl");

    public static SubLObject auto_lexify_for_language(final SubLObject string, final SubLObject meaning, final SubLObject language, SubLObject domain_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexical_mt = lexicon_utilities.lexical_mt_for_language(language);
        if (language.equal($$EnglishLanguage)) {
            final SubLObject sentences = auto_lexify(string, meaning, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), domain_mt);
            SubLObject contextualized_sentences = NIL;
            SubLObject cdolist_list_var = sentences;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                contextualized_sentences = cons(list($$ist, lexical_mt, sentence), contextualized_sentences);
                cdolist_list_var = cdolist_list_var.rest();
                sentence = cdolist_list_var.first();
            } 
            return nreverse(contextualized_sentences);
        }
        final SubLObject lexical_mt_$1 = lexicon_utilities.lexical_mt_for_language(language);
        SubLObject lexical_sentence = NIL;
        if (NIL == lexical_mt_$1) {
            Errors.warn($str3$No_lexical_Mt_for__S___Unable_to_, language, meaning, string);
            return NIL;
        }
        if (NIL != string_known_invalid_for_language(string, language)) {
            Errors.warn($str4$No_valid_characters_for__S_in__S_, string, language);
            return NIL;
        }
        if (NIL != isa.isaP(meaning, $$Individual, domain_mt, UNPROVIDED)) {
            lexical_sentence = list($$ist, lexical_mt_$1, list($$nameString, meaning, unicode_nauts.utf8_string_to_cycl_safe_string(string)));
        } else {
            lexical_sentence = list($$ist, lexical_mt_$1, list($$termStrings, meaning, unicode_nauts.utf8_string_to_cycl_safe_string(string)));
        }
        return list(lexical_sentence);
    }

    // Definitions
    /**
     *
     *
     * @unknown (auto-lexify "turkey sandwich on rye" #$HeartAttack) => ((#$headMedialString (#$TheList "turkey") #$Sandwich-TheWord (#$TheList "on" "rye") #$CountNoun #$HeartAttack))
     */
    @LispMethod(comment = "@unknown (auto-lexify \"turkey sandwich on rye\" #$HeartAttack) => ((#$headMedialString (#$TheList \"turkey\") #$Sandwich-TheWord (#$TheList \"on\" \"rye\") #$CountNoun #$HeartAttack))")
    public static final SubLObject auto_lexify_alt(SubLObject string, SubLObject meaning, SubLObject lexical_mt, SubLObject domain_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$InferencePSC;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject answers = NIL;
                SubLObject unique_heads = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$guess_semantics_for_unknown_wordsP$.currentBinding(thread);
                    try {
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($ON, thread);
                        parsing_vars.$guess_semantics_for_unknown_wordsP$.bind(T, thread);
                        {
                            SubLObject start_index = NIL;
                            SubLObject end_index = NIL;
                            SubLObject chart = NIL;
                            if ((NIL == parsing_vars.$psp_chart$.getDynamicValue(thread)) || (NIL != parsing_macros.psp_chart_matches_gap_type_p(parsing_vars.$psp_chart$.getDynamicValue(thread), $NONE))) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject start_index_1 = psp_main.psp_find_string_in_charts(string, parsing_vars.$psp_chart$.getDynamicValue(thread), parsing_vars.$psp_extra_charts$.getDynamicValue(thread));
                                    SubLObject end_index_2 = thread.secondMultipleValue();
                                    SubLObject chart_3 = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    start_index = start_index_1;
                                    end_index = end_index_2;
                                    chart = chart_3;
                                }
                            }
                            if (NIL != start_index) {
                                {
                                    SubLObject _prev_bind_0_4 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_5 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = parsing_vars.$psp_chart$.currentBinding(thread);
                                    try {
                                        parsing_vars.$psp_chart_start_index$.bind(start_index, thread);
                                        parsing_vars.$psp_chart_end_index$.bind(end_index, thread);
                                        parsing_vars.$psp_chart$.bind(chart, thread);
                                        psp_syntax.psp_chart_do_syntactic_parsing(chart, UNPROVIDED, UNPROVIDED);
                                        {
                                            SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                                            SubLTrampolineFile.checkType(chart_to_use, PHRASE_STRUCTURE_PARSER_CHART_P);
                                            if (psp_chart.psp_chart_max_span() == $ANY) {
                                                {
                                                    SubLObject pcase_var = $ANY;
                                                    if (pcase_var.eql($ANY)) {
                                                        {
                                                            SubLObject chart_to_use_6 = (NIL != chart_to_use) ? ((SubLObject) (chart_to_use)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                            SubLTrampolineFile.checkType(chart_to_use_6, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_6)));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject value = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                                                            SubLObject edge = NIL;
                                                                            for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                                if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                                    {
                                                                                        SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                            unique_heads = cons(head_lexeme, unique_heads);
                                                                                            {
                                                                                                SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                                if (NIL != var) {
                                                                                                    answers = cons(var, answers);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($LEXICAL)) {
                                                            {
                                                                SubLObject chart_to_use_7 = (NIL != chart_to_use) ? ((SubLObject) (chart_to_use)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                SubLTrampolineFile.checkType(chart_to_use_7, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_7)));
                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            SubLObject value = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                                                                SubLObject edge = NIL;
                                                                                for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                                    if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                                        {
                                                                                            SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                            if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                                unique_heads = cons(head_lexeme, unique_heads);
                                                                                                {
                                                                                                    SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                                    if (NIL != var) {
                                                                                                        answers = cons(var, answers);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                        }
                                                                    } 
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (NIL != interval_span.interval_span_p(psp_chart.psp_chart_max_span())) {
                                                    {
                                                        SubLObject pcase_var = $ANY;
                                                        if (pcase_var.eql($ANY)) {
                                                            {
                                                                SubLObject csome_list_var = psp_chart.psp_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                                                                SubLObject edge = NIL;
                                                                for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                    if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                        {
                                                                            SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                            if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                unique_heads = cons(head_lexeme, unique_heads);
                                                                                {
                                                                                    SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                    if (NIL != var) {
                                                                                        answers = cons(var, answers);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            if (pcase_var.eql($LEXICAL)) {
                                                                {
                                                                    SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                                                                    SubLObject edge = NIL;
                                                                    for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                        if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                            {
                                                                                SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                    unique_heads = cons(head_lexeme, unique_heads);
                                                                                    {
                                                                                        SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                        if (NIL != var) {
                                                                                            answers = cons(var, answers);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        parsing_vars.$psp_chart$.rebind(_prev_bind_2, thread);
                                        parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_5, thread);
                                        parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                            } else {
                                {
                                    SubLObject _prev_bind_0_8 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_9 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                                    try {
                                        parsing_vars.$psp_chart_start_index$.bind(ZERO_INTEGER, thread);
                                        parsing_vars.$psp_chart_end_index$.bind(NIL, thread);
                                        {
                                            SubLObject chart_10 = psp_syntax.psp_chart_for_string(string, parsing_macros.get_psp_lexicon(), $NONE, UNPROVIDED);
                                            SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_10);
                                            {
                                                SubLObject _prev_bind_0_11 = memoization_state.$memoization_state$.currentBinding(thread);
                                                try {
                                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                                    {
                                                        SubLObject original_memoization_process = NIL;
                                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                            {
                                                                SubLObject current_proc = current_process();
                                                                if (NIL == original_memoization_process) {
                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                } else {
                                                                    if (original_memoization_process != current_proc) {
                                                                        Errors.error($str_alt8$Invalid_attempt_to_reuse_memoizat);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_12 = parsing_vars.$psp_chart$.currentBinding(thread);
                                                                try {
                                                                    parsing_vars.$psp_chart$.bind(chart_10, thread);
                                                                    {
                                                                        SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                        SubLTrampolineFile.checkType(chart_to_use, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                        if (psp_chart.psp_chart_max_span() == $ANY) {
                                                                            {
                                                                                SubLObject pcase_var = $ANY;
                                                                                if (pcase_var.eql($ANY)) {
                                                                                    {
                                                                                        SubLObject chart_to_use_13 = (NIL != chart_to_use) ? ((SubLObject) (chart_to_use)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                                        SubLTrampolineFile.checkType(chart_to_use_13, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                                        {
                                                                                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_13)));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                    SubLObject value = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                                                                                        SubLObject edge = NIL;
                                                                                                        for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                                                            if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                                                                {
                                                                                                                    SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                                                    if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                                                        unique_heads = cons(head_lexeme, unique_heads);
                                                                                                                        {
                                                                                                                            SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                                                            if (NIL != var) {
                                                                                                                                answers = cons(var, answers);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    if (pcase_var.eql($LEXICAL)) {
                                                                                        {
                                                                                            SubLObject chart_to_use_14 = (NIL != chart_to_use) ? ((SubLObject) (chart_to_use)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                                                                            SubLTrampolineFile.checkType(chart_to_use_14, PHRASE_STRUCTURE_PARSER_CHART_P);
                                                                                            {
                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_14)));
                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                        SubLObject value = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        {
                                                                                                            SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                                                                                            SubLObject edge = NIL;
                                                                                                            for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                                                                if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                                                                    {
                                                                                                                        SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                                                            unique_heads = cons(head_lexeme, unique_heads);
                                                                                                                            {
                                                                                                                                SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                                                                if (NIL != var) {
                                                                                                                                    answers = cons(var, answers);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                    }
                                                                                                } 
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (NIL != interval_span.interval_span_p(psp_chart.psp_chart_max_span())) {
                                                                                {
                                                                                    SubLObject pcase_var = $ANY;
                                                                                    if (pcase_var.eql($ANY)) {
                                                                                        {
                                                                                            SubLObject csome_list_var = psp_chart.psp_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                                                                                            SubLObject edge = NIL;
                                                                                            for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                                                if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                                                    {
                                                                                                        SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                                            unique_heads = cons(head_lexeme, unique_heads);
                                                                                                            {
                                                                                                                SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                                                if (NIL != var) {
                                                                                                                    answers = cons(var, answers);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        if (pcase_var.eql($LEXICAL)) {
                                                                                            {
                                                                                                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                                                                                                SubLObject edge = NIL;
                                                                                                for (edge = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , edge = csome_list_var.first()) {
                                                                                                    if (NIL != psp_chart.psp_do_edge_okP(edge, $list_alt5, T)) {
                                                                                                        {
                                                                                                            SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                                                                            if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                                                                                unique_heads = cons(head_lexeme, unique_heads);
                                                                                                                {
                                                                                                                    SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                                                                                    if (NIL != var) {
                                                                                                                        answers = cons(var, answers);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue(thread)) {
                                                                            psp_chart.destroy_psp_chart(UNPROVIDED);
                                                                        }
                                                                    }
                                                                } finally {
                                                                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_12, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            {
                                                                SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                    }
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                        }
                                    } finally {
                                        parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_9, thread);
                                        parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_8, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$guess_semantics_for_unknown_wordsP$.rebind(_prev_bind_1, thread);
                        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == answers) {
                    {
                        SubLObject var = com.cyc.cycjava.cycl.auto_lexifier.make_proper_name_formula(meaning, string);
                        if (NIL != var) {
                            answers = cons(var, answers);
                        }
                    }
                }
                return remove_duplicates(answers, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @unknown (auto-lexify "turkey sandwich on rye" #$HeartAttack) => ((#$headMedialString (#$TheList "turkey") #$Sandwich-TheWord (#$TheList "on" "rye") #$CountNoun #$HeartAttack))
     */
    @LispMethod(comment = "@unknown (auto-lexify \"turkey sandwich on rye\" #$HeartAttack) => ((#$headMedialString (#$TheList \"turkey\") #$Sandwich-TheWord (#$TheList \"on\" \"rye\") #$CountNoun #$HeartAttack))")
    public static SubLObject auto_lexify(final SubLObject string, final SubLObject meaning, SubLObject lexical_mt, SubLObject domain_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject answers = NIL;
        SubLObject unique_heads = NIL;
        final SubLObject v_cycl_string = (NIL != find_if(NON_ASCII_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? cycl_string.convert_string_to_cycl(string) : string;
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$guess_semantics_for_unknown_wordsP$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind($OFF, thread);
            parsing_vars.$guess_semantics_for_unknown_wordsP$.bind(T, thread);
            SubLObject start_index = NIL;
            SubLObject end_index = NIL;
            SubLObject chart = NIL;
            if ((NIL == parsing_vars.$psp_chart$.getDynamicValue(thread)) || (NIL != parsing_macros.psp_chart_matches_gap_type_p(parsing_vars.$psp_chart$.getDynamicValue(thread), $NONE))) {
                thread.resetMultipleValues();
                final SubLObject start_index_$2 = psp_main.psp_find_string_in_charts(cycl_string.cycl_string_to_utf8_string(v_cycl_string), parsing_vars.$psp_chart$.getDynamicValue(thread), parsing_vars.$psp_extra_charts$.getDynamicValue(thread));
                final SubLObject end_index_$3 = thread.secondMultipleValue();
                final SubLObject chart_$4 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                start_index = start_index_$2;
                end_index = end_index_$3;
                chart = chart_$4;
            }
            if (NIL != start_index) {
                final SubLObject _prev_bind_0_$5 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$6 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = parsing_vars.$psp_chart$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart_start_index$.bind(start_index, thread);
                    parsing_vars.$psp_chart_end_index$.bind(end_index, thread);
                    parsing_vars.$psp_chart$.bind(chart, thread);
                    psp_syntax.psp_chart_do_syntactic_parsing(chart, UNPROVIDED, UNPROVIDED);
                    final SubLObject chart_to_use = parsing_vars.$psp_chart$.getDynamicValue(thread);
                    assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use) ") + chart_to_use;
                    if (psp_chart.psp_chart_max_span() == $ANY) {
                        final SubLObject pcase_var = $ANY;
                        if (pcase_var.eql($ANY)) {
                            final SubLObject chart_to_use_$7 = (NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                            assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$7) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$7) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$7) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$7) ") + chart_to_use_$7;
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$7))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject value = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject csome_list_var = psp_chart.psp_edges_with_span(span_to_do, chart_to_use);
                                SubLObject edge = NIL;
                                edge = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    if (NIL != psp_chart.psp_do_edge_okP(edge, $list13, T)) {
                                        final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                            unique_heads = cons(head_lexeme, unique_heads);
                                            final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                            if (NIL != var) {
                                                answers = cons(var, answers);
                                            }
                                        }
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    edge = csome_list_var.first();
                                } 
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        } else
                            if (pcase_var.eql($LEXICAL)) {
                                final SubLObject chart_to_use_$8 = (NIL != chart_to_use) ? chart_to_use : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$8) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$8) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$8) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$8) ") + chart_to_use_$8;
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$8))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject span_to_do = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject value = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(span_to_do, chart_to_use);
                                    SubLObject edge = NIL;
                                    edge = csome_list_var.first();
                                    while (NIL != csome_list_var) {
                                        if (NIL != psp_chart.psp_do_edge_okP(edge, $list13, T)) {
                                            final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                            if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                unique_heads = cons(head_lexeme, unique_heads);
                                                final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                if (NIL != var) {
                                                    answers = cons(var, answers);
                                                }
                                            }
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        edge = csome_list_var.first();
                                    } 
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }

                    } else
                        if (NIL != interval_span.interval_span_p(psp_chart.psp_chart_max_span())) {
                            final SubLObject pcase_var = $ANY;
                            if (pcase_var.eql($ANY)) {
                                SubLObject csome_list_var2 = psp_chart.psp_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                                SubLObject edge2 = NIL;
                                edge2 = csome_list_var2.first();
                                while (NIL != csome_list_var2) {
                                    if (NIL != psp_chart.psp_do_edge_okP(edge2, $list13, T)) {
                                        final SubLObject head_lexeme2 = psp_chart.get_psp_edge_head_lexeme(edge2);
                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme2), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                            unique_heads = cons(head_lexeme2, unique_heads);
                                            final SubLObject var2 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme2, lexical_mt, domain_mt);
                                            if (NIL != var2) {
                                                answers = cons(var2, answers);
                                            }
                                        }
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    edge2 = csome_list_var2.first();
                                } 
                            } else
                                if (pcase_var.eql($LEXICAL)) {
                                    SubLObject csome_list_var2 = psp_chart.psp_lexical_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use);
                                    SubLObject edge2 = NIL;
                                    edge2 = csome_list_var2.first();
                                    while (NIL != csome_list_var2) {
                                        if (NIL != psp_chart.psp_do_edge_okP(edge2, $list13, T)) {
                                            final SubLObject head_lexeme2 = psp_chart.get_psp_edge_head_lexeme(edge2);
                                            if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme2), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                unique_heads = cons(head_lexeme2, unique_heads);
                                                final SubLObject var2 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme2, lexical_mt, domain_mt);
                                                if (NIL != var2) {
                                                    answers = cons(var2, answers);
                                                }
                                            }
                                        }
                                        csome_list_var2 = csome_list_var2.rest();
                                        edge2 = csome_list_var2.first();
                                    } 
                                }

                        }

                } finally {
                    parsing_vars.$psp_chart$.rebind(_prev_bind_3, thread);
                    parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_$6, thread);
                    parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_$5, thread);
                }
            } else {
                final SubLObject _prev_bind_0_$6 = parsing_vars.$psp_chart_start_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = parsing_vars.$psp_chart_end_index$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart_start_index$.bind(ZERO_INTEGER, thread);
                    parsing_vars.$psp_chart_end_index$.bind(NIL, thread);
                    final SubLObject chart_$5 = psp_syntax.psp_chart_for_string(cycl_string.cycl_string_to_utf8_string(v_cycl_string), parsing_macros.get_psp_lexicon(), $NONE, UNPROVIDED);
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
                                assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use2) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use2) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use2) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use2) ") + chart_to_use2;
                                if (psp_chart.psp_chart_max_span() == $ANY) {
                                    final SubLObject pcase_var2 = $ANY;
                                    if (pcase_var2.eql($ANY)) {
                                        final SubLObject chart_to_use_$9 = (NIL != chart_to_use2) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                        assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$9) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$9) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$9) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$9) ") + chart_to_use_$9;
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$9))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject value2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject csome_list_var3 = psp_chart.psp_edges_with_span(span_to_do2, chart_to_use2);
                                            SubLObject edge3 = NIL;
                                            edge3 = csome_list_var3.first();
                                            while (NIL != csome_list_var3) {
                                                if (NIL != psp_chart.psp_do_edge_okP(edge3, $list13, T)) {
                                                    final SubLObject head_lexeme3 = psp_chart.get_psp_edge_head_lexeme(edge3);
                                                    if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme3), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                        unique_heads = cons(head_lexeme3, unique_heads);
                                                        final SubLObject var3 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme3, lexical_mt, domain_mt);
                                                        if (NIL != var3) {
                                                            answers = cons(var3, answers);
                                                        }
                                                    }
                                                }
                                                csome_list_var3 = csome_list_var3.rest();
                                                edge3 = csome_list_var3.first();
                                            } 
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    } else
                                        if (pcase_var2.eql($LEXICAL)) {
                                            final SubLObject chart_to_use_$10 = (NIL != chart_to_use2) ? chart_to_use2 : parsing_vars.$psp_chart$.getDynamicValue(thread);
                                            assert NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$10) : "! psp_chart.phrase_structure_parser_chart_p(chart_to_use_$10) " + ("psp_chart.phrase_structure_parser_chart_p(chart_to_use_$10) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(chart_to_use_$10) ") + chart_to_use_$10;
                                            SubLObject iteration_state2;
                                            for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(psp_chart.psp_chart_spans_to_edges(chart_to_use_$10))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                thread.resetMultipleValues();
                                                final SubLObject span_to_do2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                final SubLObject value2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                SubLObject csome_list_var3 = psp_chart.psp_lexical_edges_with_span(span_to_do2, chart_to_use2);
                                                SubLObject edge3 = NIL;
                                                edge3 = csome_list_var3.first();
                                                while (NIL != csome_list_var3) {
                                                    if (NIL != psp_chart.psp_do_edge_okP(edge3, $list13, T)) {
                                                        final SubLObject head_lexeme3 = psp_chart.get_psp_edge_head_lexeme(edge3);
                                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme3), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                            unique_heads = cons(head_lexeme3, unique_heads);
                                                            final SubLObject var3 = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme3, lexical_mt, domain_mt);
                                                            if (NIL != var3) {
                                                                answers = cons(var3, answers);
                                                            }
                                                        }
                                                    }
                                                    csome_list_var3 = csome_list_var3.rest();
                                                    edge3 = csome_list_var3.first();
                                                } 
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                        }

                                } else
                                    if (NIL != interval_span.interval_span_p(psp_chart.psp_chart_max_span())) {
                                        final SubLObject pcase_var2 = $ANY;
                                        if (pcase_var2.eql($ANY)) {
                                            SubLObject csome_list_var = psp_chart.psp_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use2);
                                            SubLObject edge = NIL;
                                            edge = csome_list_var.first();
                                            while (NIL != csome_list_var) {
                                                if (NIL != psp_chart.psp_do_edge_okP(edge, $list13, T)) {
                                                    final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                    if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                        unique_heads = cons(head_lexeme, unique_heads);
                                                        final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                        if (NIL != var) {
                                                            answers = cons(var, answers);
                                                        }
                                                    }
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                edge = csome_list_var.first();
                                            } 
                                        } else
                                            if (pcase_var2.eql($LEXICAL)) {
                                                SubLObject csome_list_var = psp_chart.psp_lexical_edges_with_span(psp_chart.psp_chart_max_span(), chart_to_use2);
                                                SubLObject edge = NIL;
                                                edge = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if (NIL != psp_chart.psp_do_edge_okP(edge, $list13, T)) {
                                                        final SubLObject head_lexeme = psp_chart.get_psp_edge_head_lexeme(edge);
                                                        if (NIL == find(psp_chart.get_psp_edge_span(head_lexeme), unique_heads, EQUAL, GET_PSP_EDGE_SPAN, UNPROVIDED, UNPROVIDED)) {
                                                            unique_heads = cons(head_lexeme, unique_heads);
                                                            final SubLObject var = auto_lexify_nbar_with_head_edge(string, meaning, head_lexeme, lexical_mt, domain_mt);
                                                            if (NIL != var) {
                                                                answers = cons(var, answers);
                                                            }
                                                        }
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    edge = csome_list_var.first();
                                                } 
                                            }

                                    }

                                if (NIL == parsing_vars.$psp_dont_destroy_chartP$.getDynamicValue(thread)) {
                                    psp_chart.destroy_psp_chart(UNPROVIDED);
                                }
                            } finally {
                                parsing_vars.$psp_chart$.rebind(_prev_bind_0_$8, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$7, thread);
                    }
                } finally {
                    parsing_vars.$psp_chart_end_index$.rebind(_prev_bind_1_$7, thread);
                    parsing_vars.$psp_chart_start_index$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            parsing_vars.$guess_semantics_for_unknown_wordsP$.rebind(_prev_bind_2, thread);
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        if (NIL == answers) {
            final SubLObject var4 = make_proper_name_formula(meaning, v_cycl_string);
            if (NIL != var4) {
                answers = cons(var4, answers);
            }
        }
        return remove_duplicates(answers, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject auto_lexify_nbar_with_head_edge_alt(SubLObject string, SubLObject meaning, SubLObject head_lexeme, SubLObject lexical_mt, SubLObject domain_mt) {
        if (NIL != isaP(meaning, $$Individual, domain_mt, UNPROVIDED)) {
            if (NIL != lexicon_accessors.genl_pos_predP(psp_chart.get_psp_edge_pos_pred(head_lexeme), $$singular_Generic, lexical_mt)) {
                return com.cyc.cycjava.cycl.auto_lexifier.make_def_description(meaning, string);
            }
        } else {
            {
                SubLObject span_length = interval_span.interval_span_length(psp_chart.get_psp_edge_span(head_lexeme));
                SubLObject head_string = psp_chart.get_psp_edge_string(head_lexeme);
                SubLObject category = psp_chart.get_psp_edge_category(head_lexeme);
                SubLObject head_position = add(ONE_INTEGER, interval_span.interval_span_start(psp_chart.get_psp_edge_span(head_lexeme)));
                if (span_length != ONE_INTEGER) {
                    {
                        SubLObject locations = nl_trie.nl_trie_head_locations_in_lexical_string(head_string);
                        if (NIL != locations) {
                            {
                                SubLObject location = Sort.sort(locations, $sym11$_, UNPROVIDED).first();
                                head_position = add(head_position, location);
                            }
                        } else {
                            {
                                SubLObject location = length(string_utilities.string_tokenize(head_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                head_position = add(head_position, location);
                            }
                        }
                    }
                }
                if (NIL != lexicon_accessors.speech_partP(category, UNPROVIDED)) {
                    return lexification_wizard.determine_lexical_formula(meaning, string, head_position, category, lexical_mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject auto_lexify_nbar_with_head_edge(final SubLObject string, final SubLObject meaning, final SubLObject head_lexeme, final SubLObject lexical_mt, final SubLObject domain_mt) {
        if (NIL != isa.isaP(meaning, $$Individual, domain_mt, UNPROVIDED)) {
            if (NIL != lexicon_accessors.genl_pos_predP(psp_chart.get_psp_edge_pos_pred(head_lexeme), $$singular_Generic, lexical_mt)) {
                if (NIL != isa.isaP(meaning, $$Person, domain_mt, UNPROVIDED)) {
                    return make_proper_name_formula(meaning, string);
                }
                return make_def_description(meaning, string);
            }
        } else {
            final SubLObject span_length = interval_span.interval_span_length(psp_chart.get_psp_edge_span(head_lexeme));
            final SubLObject head_string = psp_chart.get_psp_edge_string(head_lexeme);
            final SubLObject category = psp_chart.get_psp_edge_category(head_lexeme);
            SubLObject head_position = add(ONE_INTEGER, interval_span.interval_span_start(psp_chart.get_psp_edge_span(head_lexeme)));
            if (!span_length.eql(ONE_INTEGER)) {
                final SubLObject locations = nl_trie.nl_trie_head_locations_in_lexical_string(head_string);
                if (NIL != locations) {
                    final SubLObject location = Sort.sort(locations, $sym18$_, UNPROVIDED).first();
                    head_position = add(head_position, location);
                } else {
                    final SubLObject location = length(string_utilities.string_tokenize(head_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    head_position = add(head_position, location);
                }
            }
            if (NIL != lexicon_accessors.speech_partP(category, UNPROVIDED)) {
                return lexification_wizard.determine_lexical_formula(meaning, string, head_position, category, lexical_mt);
            }
        }
        return NIL;
    }

    public static final SubLObject make_def_description_alt(SubLObject meaning, SubLObject string) {
        {
            SubLObject full_string = cconcatenate($str_alt12$the_, string);
            return list($$definiteDescriptions, meaning, full_string);
        }
    }

    public static SubLObject make_def_description(final SubLObject meaning, final SubLObject string) {
        final SubLObject full_string = (NIL != string_utilities.starts_with_one_of(string, $list19)) ? string : cconcatenate($$$the_, string);
        return list($$definiteDescriptions, meaning, full_string);
    }

    public static final SubLObject make_proper_name_formula_alt(SubLObject cyc_term, SubLObject lex_phrase) {
        {
            SubLObject cyc_predicate = misc_kb_utilities.fort_for_string(lexification_wizard.$default_proper_name_pred$.getGlobalValue());
            return list(cyc_predicate, cyc_term, lex_phrase);
        }
    }

    public static SubLObject make_proper_name_formula(final SubLObject cyc_term, final SubLObject lex_phrase) {
        final SubLObject cyc_predicate = misc_kb_utilities.fort_for_string(lexification_wizard.$default_proper_name_pred$.getGlobalValue());
        return list(cyc_predicate, cyc_term, lex_phrase);
    }

    public static SubLObject string_known_invalid_for_language(final SubLObject str, final SubLObject lang) {
        assert NIL != stringp(str) : "! stringp(str) " + ("Types.stringp(str) " + "CommonSymbols.NIL != Types.stringp(str) ") + str;
        if (NIL != unicode_strings.ascii_string_p(str)) {
            return NIL;
        }
        return makeBoolean((NIL != language_has_known_unicode_codepoint_range(lang)) && (NIL == ask_utilities.query_boolean(list($$thereExists, $sym24$_ORTH, list($$and, listS($$orthography, lang, $list27), listS($$stringHasCharacterInOrthography, unicode_nauts.utf8_string_to_cycl_safe_string(str), $list27))), $$InferencePSC, UNPROVIDED)));
    }

    public static SubLObject clear_language_has_known_unicode_codepoint_range() {
        final SubLObject cs = $language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_language_has_known_unicode_codepoint_range(final SubLObject lang) {
        return memoization_state.caching_state_remove_function_results_with_args($language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue(), list(lang), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject language_has_known_unicode_codepoint_range_internal(final SubLObject lang) {
        return ask_utilities.query_boolean(list($$thereExists, $sym24$_ORTH, list($$thereExists, $sym30$_RANGE, list($$and, $list31, listS($$orthography, lang, $list27)))), $$LanguageAndWritingSystemMt, UNPROVIDED);
    }

    public static SubLObject language_has_known_unicode_codepoint_range(final SubLObject lang) {
        SubLObject caching_state = $language_has_known_unicode_codepoint_range_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE, $language_has_known_unicode_codepoint_range_caching_state$, $int$64, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, lang, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(language_has_known_unicode_codepoint_range_internal(lang)));
            memoization_state.caching_state_put(caching_state, lang, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject bogusly_lexified_terms() {
        return $bogusly_lexified_terms$.getGlobalValue();
    }

    public static SubLObject remove_bogus_auto_lexified_names() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bogus_char_vector = cycl_string.cycl_string_to_unicode_vector($bogus_unicode_string$.getGlobalValue());
        final SubLObject bad_terms = $bogusly_lexified_terms$.getGlobalValue();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$wikipediaArticleName_Canonical;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$17 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$18 = $progress_last_pacification_time$.currentBinding(thread);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$19 = NIL;
                                final SubLObject token_var_$20 = NIL;
                                while (NIL == done_var_$19) {
                                    final SubLObject wanc_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                    final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(wanc_as));
                                    if (NIL != valid_$21) {
                                        final SubLObject v_term = assertions_high.gaf_arg1(wanc_as);
                                        final SubLObject pred_var_$22 = $$nameString;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var_$22)) {
                                            final SubLObject iterator_var_$23 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var_$22);
                                            SubLObject done_var_$20 = NIL;
                                            final SubLObject token_var_$21 = NIL;
                                            while (NIL == done_var_$20) {
                                                final SubLObject final_index_spec_$26 = iteration.iteration_next_without_values_macro_helper(iterator_var_$23, token_var_$21);
                                                final SubLObject valid_$22 = makeBoolean(!token_var_$21.eql(final_index_spec_$26));
                                                if (NIL != valid_$22) {
                                                    SubLObject final_index_iterator_$28 = NIL;
                                                    try {
                                                        final_index_iterator_$28 = kb_mapping_macros.new_final_index_iterator(final_index_spec_$26, $GAF, NIL, NIL);
                                                        SubLObject done_var_$21 = NIL;
                                                        final SubLObject token_var_$22 = NIL;
                                                        while (NIL == done_var_$21) {
                                                            final SubLObject name_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator_$28, token_var_$22);
                                                            final SubLObject valid_$23 = makeBoolean(!token_var_$22.eql(name_gaf));
                                                            if ((NIL != valid_$23) && (NIL != removal_modules_assertion_mt.assertion_asserted_byP(name_gaf, $$CycTermLearner_2010Edition))) {
                                                                SubLObject badP = NIL;
                                                                final SubLObject name = assertions_high.gaf_arg2(name_gaf);
                                                                final SubLObject name_vector = cycl_string.cycl_string_to_unicode_vector(name);
                                                                if (NIL != unicode_nauts.unicode_naut_p(name, UNPROVIDED)) {
                                                                    final SubLObject vector_var = bogus_char_vector;
                                                                    final SubLObject backwardP_var = NIL;
                                                                    SubLObject length;
                                                                    SubLObject v_iteration;
                                                                    SubLObject element_num;
                                                                    SubLObject bogus_char_code;
                                                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                                        bogus_char_code = aref(vector_var, element_num);
                                                                        if (NIL != find(bogus_char_code, name_vector, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                            Errors.warn($str49$Bad_name___S_contains__S, name, bogus_char_code);
                                                                            badP = T;
                                                                        }
                                                                    }
                                                                }
                                                                if (NIL != badP) {
                                                                    set.set_add(v_term, bad_terms);
                                                                    ke.ke_unassert_assertion(name_gaf);
                                                                }
                                                            }
                                                            done_var_$21 = makeBoolean(NIL == valid_$23);
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator_$28) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator_$28);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                                        }
                                                    }
                                                }
                                                done_var_$20 = makeBoolean(NIL == valid_$22);
                                            } 
                                        }
                                    }
                                    done_var_$19 = makeBoolean(NIL == valid_$21);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
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
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$18, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return bad_terms;
    }

    static private final SubLList $list_alt5 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    static private final SubLString $str_alt8$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLSymbol $sym11$_ = makeSymbol(">");

    static private final SubLString $str_alt12$the_ = makeString("the ");

    static private final SubLString $$$ecoppock = makeString("ecoppock");

    static private final SubLList $list_alt22 = list(list(list(makeString("turkey sandwich"), reader_make_constant_shell("DaveS")), list(list(reader_make_constant_shell("definiteDescriptions"), reader_make_constant_shell("DaveS"), makeString("the turkey sandwich")))), list(list(makeString("turkey sandwich"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("turkey")), reader_make_constant_shell("Sandwich-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("turkey sandwich on rye"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("headMedialString"), list(reader_make_constant_shell("TheList"), makeString("turkey")), reader_make_constant_shell("Sandwich-TheWord"), list(reader_make_constant_shell("TheList"), makeString("on"), makeString("rye")), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("newspaper agency"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("newspaper")), reader_make_constant_shell("Agency-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("Parisian terrorist organization"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("Parisian"), makeString("terrorist")), reader_make_constant_shell("Organization-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))), list(list(makeString("terrorist organization"), reader_make_constant_shell("HeartAttack")), list(list(reader_make_constant_shell("multiWordString"), list(reader_make_constant_shell("TheList"), makeString("terrorist")), reader_make_constant_shell("Organization-TheWord"), reader_make_constant_shell("CountNoun"), reader_make_constant_shell("HeartAttack")))));

    public static SubLObject load_bogusly_lexified_terms(SubLObject file) {
        if (file == UNPROVIDED) {
            file = $str50$_home_baxter_logs_bogusly_lexifie;
        }
        $bogusly_lexified_terms$.setGlobalValue(cfasl_utilities.cfasl_load(file));
        return $bogusly_lexified_terms$.getGlobalValue();
    }

    public static SubLObject declare_auto_lexifier_file() {
        declareFunction("auto_lexify_for_language", "AUTO-LEXIFY-FOR-LANGUAGE", 3, 1, false);
        declareFunction("auto_lexify", "AUTO-LEXIFY", 2, 2, false);
        declareFunction("auto_lexify_nbar_with_head_edge", "AUTO-LEXIFY-NBAR-WITH-HEAD-EDGE", 5, 0, false);
        declareFunction("make_def_description", "MAKE-DEF-DESCRIPTION", 2, 0, false);
        declareFunction("make_proper_name_formula", "MAKE-PROPER-NAME-FORMULA", 2, 0, false);
        declareFunction("string_known_invalid_for_language", "STRING-KNOWN-INVALID-FOR-LANGUAGE", 2, 0, false);
        declareFunction("clear_language_has_known_unicode_codepoint_range", "CLEAR-LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 0, 0, false);
        declareFunction("remove_language_has_known_unicode_codepoint_range", "REMOVE-LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 1, 0, false);
        declareFunction("language_has_known_unicode_codepoint_range_internal", "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-INTERNAL", 1, 0, false);
        declareFunction("language_has_known_unicode_codepoint_range", "LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE", 1, 0, false);
        declareFunction("bogusly_lexified_terms", "BOGUSLY-LEXIFIED-TERMS", 0, 0, false);
        declareFunction("remove_bogus_auto_lexified_names", "REMOVE-BOGUS-AUTO-LEXIFIED-NAMES", 0, 0, false);
        declareFunction("load_bogusly_lexified_terms", "LOAD-BOGUSLY-LEXIFIED-TERMS", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_auto_lexifier_file() {
        deflexical("*LANGUAGE-HAS-KNOWN-UNICODE-CODEPOINT-RANGE-CACHING-STATE*", NIL);
        deflexical("*BOGUS-UNICODE-STRING*", $list43);
        deflexical("*BOGUSLY-LEXIFIED-TERMS*", set.new_set(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_auto_lexifier_file_alt() {
        define_test_case_table_int(AUTO_LEXIFY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$ecoppock, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt22);
        return NIL;
    }

    public static SubLObject setup_auto_lexifier_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE);
            define_test_case_table_int(AUTO_LEXIFY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list42);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(AUTO_LEXIFY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$ecoppock, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt22);
        }
        return NIL;
    }

    public static SubLObject setup_auto_lexifier_file_Previous() {
        memoization_state.note_globally_cached_function(LANGUAGE_HAS_KNOWN_UNICODE_CODEPOINT_RANGE);
        define_test_case_table_int(AUTO_LEXIFY, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list42);
        return NIL;
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
    }
}

/**
 * Total time: 537 ms
 */
