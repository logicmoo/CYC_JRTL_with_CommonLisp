/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.make_el_set;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.standard_tokenization;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NIMD-PARSER
 * source file: /cyc/top/cycl/sksi/sksi-widgets/nimd-parser.lisp
 * created:     2019/07/03 17:39:03
 */
public final class nimd_parser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nimd_parser();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $nimd_sentential_concept_tagging_lexicon$ = makeSymbol("*NIMD-SENTENTIAL-CONCEPT-TAGGING-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $nimd_filters_for_topic_of_text_string_fnP$ = makeSymbol("*NIMD-FILTERS-FOR-TOPIC-OF-TEXT-STRING-FN?*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol NUNION = makeSymbol("NUNION");

    static private final SubLString $str1$With_all_the_words = makeString("With_all_the_words");

    static private final SubLString $$$Query = makeString("Query");

    static private final SubLString $str3$With_the_exact_phrase = makeString("With_the_exact_phrase");

    static private final SubLString $str4$With_at_least_one_of_the_words = makeString("With_at_least_one_of_the_words");

    private static final SubLSymbol GLASS_BOX_QUERY_REQUIRED_CONCEPTS = makeSymbol("GLASS-BOX-QUERY-REQUIRED-CONCEPTS");

    static private final SubLString $str6$Without_the_words = makeString("Without_the_words");

    private static final SubLSymbol GLASS_BOX_QUERY_EXCLUDED_CONCEPTS = makeSymbol("GLASS-BOX-QUERY-EXCLUDED-CONCEPTS");

    static private final SubLString $str8$_ = makeString(",");

    static private final SubLList $list9 = list(reader_make_constant_shell("givenNames"), reader_make_constant_shell("middleName"), reader_make_constant_shell("firstName"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("stockTickerSymbol"), reader_make_constant_shell("gospelName-Short"), reader_make_constant_shell("epistleAddresseeText"), reader_make_constant_shell("internetCountryCode"));

    static private final SubLList $list10 = list(CHAR_plus);

    private static final SubLSymbol STRING_TOKEN_STRING = makeSymbol("STRING-TOKEN-STRING");

    private static final SubLString $str12$_s = makeString("'s");

    private static final SubLList $list14 = list($YEAR);

    private static final SubLSymbol GLASS_BOX_TASK_STRING_TOPICS = makeSymbol("GLASS-BOX-TASK-STRING-TOPICS");







    private static final SubLSymbol ADD_CONCEPT_FILTER_SPEC = makeSymbol("ADD-CONCEPT-FILTER-SPEC");

    private static final SubLList $list23 = list(reader_make_constant_shell("ConceptFilterSpecificationFn"), list(reader_make_constant_shell("ConceptNodesForTaskTypeFn"), reader_make_constant_shell("IntelligenceAnalysisTask-Allotment")), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptOrInstance"));

    private static final SubLString $str24$missing_from_parse_result___S__ = makeString("missing from parse result: ~S~%");

    private static final SubLSymbol $sym25$NIMD_TASK_PARSE_CONTAINS_ = makeSymbol("NIMD-TASK-PARSE-CONTAINS?");

    private static final SubLList $list32 = list(list(list(makeString("A recent suicide bombing that apparently targeted the motorcade of Rafik \nHariri, the former Lebanese Prime Minister, resulted in the death of Hariri.\nDetermine who are the most likely suspects for the bombing. Provide information\nabout the motives of terrorist groups or nations that could have directed or\nperformed the bombing."), list(reader_make_constant_shell("Motive"), reader_make_constant_shell("RafikHariri"))), T), list(list(makeString("Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad\'s hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity."), list(reader_make_constant_shell("Iran"), reader_make_constant_shell("MahmoudAhmadinejad"), reader_make_constant_shell("ActOfDissent"), list(reader_make_constant_shell("ResearchingAndDevelopingFn"), reader_make_constant_shell("NuclearRelatedMaterial")))), T), list(list(makeString("Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad\'s hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity."), list(reader_make_constant_shell("Event"))), NIL));

    // Definitions
    /**
     * #$evaluationDefn for #$RequiredConceptsOfSearchStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RequiredConceptsOfSearchStringFn")
    public static final SubLObject glass_box_query_required_concepts_alt(SubLObject source_string) {
        if (!source_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_set(remove_duplicates(creduce(symbol_function(NUNION), list(com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.glass_box_concepts_int(source_string, $str_alt1$With_all_the_words), com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.glass_box_concepts_int(source_string, $$$Query), com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.glass_box_concepts_int(source_string, $str_alt3$With_the_exact_phrase), com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.glass_box_concepts_int(source_string, $str_alt4$With_at_least_one_of_the_words)), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    // Definitions
    /**
     * #$evaluationDefn for #$RequiredConceptsOfSearchStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$RequiredConceptsOfSearchStringFn")
    public static SubLObject glass_box_query_required_concepts(final SubLObject source_string) {
        if (!source_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_set(remove_duplicates(creduce(symbol_function(NUNION), list(glass_box_concepts_int(source_string, $str1$With_all_the_words), glass_box_concepts_int(source_string, $$$Query), glass_box_concepts_int(source_string, $str3$With_the_exact_phrase), glass_box_concepts_int(source_string, $str4$With_at_least_one_of_the_words)), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$ExcludedConceptsOfSearchStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$ExcludedConceptsOfSearchStringFn")
    public static final SubLObject glass_box_query_excluded_concepts_alt(SubLObject source_string) {
        if (!source_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_set(com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.glass_box_concepts_int(source_string, $str_alt6$Without_the_words), UNPROVIDED);
    }

    /**
     * #$evaluationDefn for #$ExcludedConceptsOfSearchStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$ExcludedConceptsOfSearchStringFn")
    public static SubLObject glass_box_query_excluded_concepts(final SubLObject source_string) {
        if (!source_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_set(glass_box_concepts_int(source_string, $str6$Without_the_words), UNPROVIDED);
    }

    public static final SubLObject glass_box_concepts_int_alt(SubLObject source_string, SubLObject search_string) {
        {
            SubLObject query_string = com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.glass_box_search_string(source_string, search_string);
            return com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_search_string_denotation_mapper(query_string);
        }
    }

    public static SubLObject glass_box_concepts_int(final SubLObject source_string, final SubLObject search_string) {
        final SubLObject query_string = glass_box_search_string(source_string, search_string);
        return nimd_search_string_denotation_mapper(query_string);
    }

    public static final SubLObject glass_box_search_string_alt(SubLObject source_string, SubLObject marker_string) {
        {
            SubLObject major_parts = string_utilities.split_string(source_string, $str_alt8$_);
            SubLObject cdolist_list_var = major_parts;
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                if (NIL != string_utilities.starts_with(string_utilities.trim_whitespace(part), marker_string)) {
                    return string_utilities.string_upto(string_utilities.string_after(part, CHAR_quotation), CHAR_quotation);
                }
            }
        }
        return NIL;
    }

    public static SubLObject glass_box_search_string(final SubLObject source_string, final SubLObject marker_string) {
        SubLObject cdolist_list_var;
        final SubLObject major_parts = cdolist_list_var = string_utilities.split_string(source_string, $str8$_);
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != string_utilities.starts_with(string_utilities.trim_whitespace(part), marker_string)) {
                return string_utilities.string_upto(string_utilities.string_after(part, CHAR_quotation), CHAR_quotation);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a raw search string (as recorded from a url)
     * @return list; a list of CycL terms that are mentioned in STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a raw search string (as recorded from a url)\r\n@return list; a list of CycL terms that are mentioned in STRING")
    public static final SubLObject nimd_search_string_denotation_mapper_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!string.isString()) {
                return NIL;
            }
            {
                SubLObject decoded_string = web_utilities.html_url_decode(string);
                SubLObject excluded_preds = $list_alt9;
                SubLObject chunks = string_utilities.string_tokenize(decoded_string, $list_alt10, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                            Errors.error($str_alt11$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject cdolist_list_var = chunks;
                                    SubLObject chunk = NIL;
                                    for (chunk = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , chunk = cdolist_list_var.first()) {
                                        {
                                            SubLObject tokenized_string = string_utilities.string_tokenize(string_utilities.trim_whitespace(chunk), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            SubLObject queued_words = NIL;
                                            while (NIL != list_utilities.lengthG(tokenized_string, ZERO_INTEGER, UNPROVIDED)) {
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject dates = com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_dates_from_string(tokenized_string, UNPROVIDED, UNPROVIDED);
                                                    SubLObject length = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if (NIL != dates) {
                                                        result = cconcatenate(dates, result);
                                                        {
                                                            SubLObject cdolist_list_var_1 = lexicon_accessors.denotation_mapper(string_utilities.bunge(nreverse(queued_words), UNPROVIDED), excluded_preds, UNPROVIDED, UNPROVIDED);
                                                            SubLObject token = NIL;
                                                            for (token = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , token = cdolist_list_var_1.first()) {
                                                                result = cons(standard_tokenization.string_token_value(token), result);
                                                            }
                                                        }
                                                        queued_words = NIL;
                                                        tokenized_string = list_utilities.first_n(length, tokenized_string);
                                                    } else {
                                                        queued_words = cons(tokenized_string.first(), queued_words);
                                                        tokenized_string = tokenized_string.rest();
                                                    }
                                                }
                                            } 
                                            {
                                                SubLObject rest_of_string = string_utilities.bunge(nconc(nreverse(queued_words), tokenized_string), UNPROVIDED);
                                                thread.resetMultipleValues();
                                                {
                                                    SubLObject recognized_terms = lexicon_accessors.denotation_mapper(rest_of_string, excluded_preds, UNPROVIDED, UNPROVIDED);
                                                    SubLObject unrecognized_terms = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject cdolist_list_var_2 = recognized_terms;
                                                        SubLObject token = NIL;
                                                        for (token = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , token = cdolist_list_var_2.first()) {
                                                            if (NIL == com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_uninteresting_word(standard_tokenization.string_token_string(token))) {
                                                                result = cons(standard_tokenization.string_token_value(token), result);
                                                            }
                                                        }
                                                    }
                                                    result = cconcatenate(result, com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_matches_for_unrecognized_terms(Mapping.mapcar(STRING_TOKEN_STRING, unrecognized_terms), excluded_preds));
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a raw search string (as recorded from a url)
     * @return list; a list of CycL terms that are mentioned in STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a raw search string (as recorded from a url)\r\n@return list; a list of CycL terms that are mentioned in STRING")
    public static SubLObject nimd_search_string_denotation_mapper(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return NIL;
        }
        final SubLObject decoded_string = web_utilities.html_url_decode(string);
        final SubLObject excluded_preds = $list9;
        final SubLObject chunks = string_utilities.string_tokenize(decoded_string, $list10, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = chunks;
                SubLObject chunk = NIL;
                chunk = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject tokenized_string = string_utilities.string_tokenize(string_utilities.trim_whitespace(chunk), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject queued_words = NIL;
                    while (NIL != list_utilities.lengthG(tokenized_string, ZERO_INTEGER, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject dates = nimd_dates_from_string(tokenized_string, UNPROVIDED, UNPROVIDED);
                        final SubLObject length = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != dates) {
                            result = cconcatenate(dates, result);
                            SubLObject cdolist_list_var_$1 = lexicon_accessors.denotation_mapper(string_utilities.bunge(nreverse(queued_words), UNPROVIDED), excluded_preds, UNPROVIDED, UNPROVIDED);
                            SubLObject token = NIL;
                            token = cdolist_list_var_$1.first();
                            while (NIL != cdolist_list_var_$1) {
                                result = cons(standard_tokenization.string_token_value(token), result);
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                token = cdolist_list_var_$1.first();
                            } 
                            queued_words = NIL;
                            tokenized_string = list_utilities.first_n(length, tokenized_string);
                        } else {
                            queued_words = cons(tokenized_string.first(), queued_words);
                            tokenized_string = tokenized_string.rest();
                        }
                    } 
                    final SubLObject rest_of_string = string_utilities.bunge(nconc(nreverse(queued_words), tokenized_string), UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject recognized_terms = lexicon_accessors.denotation_mapper(rest_of_string, excluded_preds, UNPROVIDED, UNPROVIDED);
                    final SubLObject unrecognized_terms = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$2 = recognized_terms;
                    SubLObject token2 = NIL;
                    token2 = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        if (NIL == nimd_uninteresting_word(standard_tokenization.string_token_string(token2))) {
                            result = cons(standard_tokenization.string_token_value(token2), result);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        token2 = cdolist_list_var_$2.first();
                    } 
                    result = cconcatenate(result, nimd_matches_for_unrecognized_terms(Mapping.mapcar(STRING_TOKEN_STRING, unrecognized_terms), excluded_preds));
                    cdolist_list_var = cdolist_list_var.rest();
                    chunk = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static final SubLObject nimd_uninteresting_word_alt(SubLObject string) {
        return lexicon_utilities.denots_of_string_stop_word(string);
    }

    public static SubLObject nimd_uninteresting_word(final SubLObject string) {
        return lexicon_utilities.denots_of_string_stop_word(string);
    }

    public static final SubLObject nimd_matches_for_unrecognized_terms_alt(SubLObject strings, SubLObject excluded_preds) {
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = strings;
            SubLObject unrecognized_string = NIL;
            for (unrecognized_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unrecognized_string = cdolist_list_var.first()) {
                {
                    SubLObject unpossessivized_string = string_utilities.post_remove(unrecognized_string, $str_alt13$_s, UNPROVIDED);
                    SubLObject unpossessivized_matches = lexicon_accessors.denotation_mapper(unpossessivized_string, excluded_preds, UNPROVIDED, UNPROVIDED);
                    if (NIL != unpossessivized_matches) {
                        {
                            SubLObject cdolist_list_var_4 = unpossessivized_matches;
                            SubLObject token = NIL;
                            for (token = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , token = cdolist_list_var_4.first()) {
                                if (NIL == com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_uninteresting_word(standard_tokenization.string_token_string(token))) {
                                    result = cons(standard_tokenization.string_token_value(token), result);
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject possible_matches = nl_trie_accessors.nl_trie_matching_phrases(unpossessivized_string, $INFIX);
                            SubLObject cdolist_list_var_5 = possible_matches;
                            SubLObject possible_match = NIL;
                            for (possible_match = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , possible_match = cdolist_list_var_5.first()) {
                                {
                                    SubLObject item_var = nl_trie_accessors.nl_trie_index_item_term(possible_match);
                                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                                        result = cons(item_var, result);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject nimd_matches_for_unrecognized_terms(final SubLObject strings, final SubLObject excluded_preds) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject unrecognized_string = NIL;
        unrecognized_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject unpossessivized_string = string_utilities.post_remove(unrecognized_string, $str12$_s, UNPROVIDED);
            final SubLObject unpossessivized_matches = lexicon_accessors.denotation_mapper(unpossessivized_string, excluded_preds, UNPROVIDED, UNPROVIDED);
            if (NIL != unpossessivized_matches) {
                SubLObject cdolist_list_var_$4 = unpossessivized_matches;
                SubLObject token = NIL;
                token = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL == nimd_uninteresting_word(standard_tokenization.string_token_string(token))) {
                        result = cons(standard_tokenization.string_token_value(token), result);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    token = cdolist_list_var_$4.first();
                } 
            } else {
                SubLObject cdolist_list_var_$5;
                final SubLObject possible_matches = cdolist_list_var_$5 = nl_trie_accessors.nl_trie_matching_phrases(unpossessivized_string, $INFIX);
                SubLObject possible_match = NIL;
                possible_match = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    final SubLObject item_var = nl_trie_accessors.nl_trie_index_item_term(possible_match);
                    if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                        result = cons(item_var, result);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    possible_match = cdolist_list_var_$5.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            unrecognized_string = cdolist_list_var.first();
        } 
        return result;
    }

    /**
     *
     *
     * @param TOKENIZED-STRING
     * 		list; a list of tokens (strings)
     */
    @LispMethod(comment = "@param TOKENIZED-STRING\r\n\t\tlist; a list of tokens (strings)")
    public static final SubLObject nimd_dates_from_string_alt(SubLObject tokenized_string, SubLObject max_date_length, SubLObject min_date_length) {
        if (max_date_length == UNPROVIDED) {
            max_date_length = THREE_INTEGER;
        }
        if (min_date_length == UNPROVIDED) {
            min_date_length = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dates = NIL;
                SubLObject length = min(max_date_length, length(tokenized_string));
                {
                    SubLObject _prev_bind_0 = date_utilities.$date_patterns$.currentBinding(thread);
                    try {
                        date_utilities.$date_patterns$.bind(cons($list_alt15, date_utilities.$date_patterns$.getDynamicValue(thread)), thread);
                        while ((NIL != list_utilities.empty_list_p(dates)) && length.numGE(min_date_length)) {
                            dates = date_utilities.parse_date_from_string_fast(string_utilities.bunge(subseq(tokenized_string, ZERO_INTEGER, length), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            length = subtract(length, ONE_INTEGER);
                        } 
                    } finally {
                        date_utilities.$date_patterns$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(dates, number_utilities.f_1X(length));
            }
        }
    }

    /**
     *
     *
     * @param TOKENIZED-STRING
     * 		list; a list of tokens (strings)
     */
    @LispMethod(comment = "@param TOKENIZED-STRING\r\n\t\tlist; a list of tokens (strings)")
    public static SubLObject nimd_dates_from_string(final SubLObject tokenized_string, SubLObject max_date_length, SubLObject min_date_length) {
        if (max_date_length == UNPROVIDED) {
            max_date_length = THREE_INTEGER;
        }
        if (min_date_length == UNPROVIDED) {
            min_date_length = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = NIL;
        SubLObject length = min(max_date_length, length(tokenized_string));
        final SubLObject _prev_bind_0 = date_utilities.$date_patterns$.currentBinding(thread);
        try {
            date_utilities.$date_patterns$.bind(cons($list14, date_utilities.$date_patterns$.getDynamicValue(thread)), thread);
            while ((NIL != list_utilities.empty_list_p(dates)) && length.numGE(min_date_length)) {
                dates = date_utilities.parse_date_from_string_fast(string_utilities.bunge(subseq(tokenized_string, ZERO_INTEGER, length), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                length = subtract(length, ONE_INTEGER);
            } 
        } finally {
            date_utilities.$date_patterns$.rebind(_prev_bind_0, thread);
        }
        return values(dates, number_utilities.f_1X(length));
    }

    /**
     * #$evaluationDefn for #$TopicsOfTextStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TopicsOfTextStringFn")
    public static final SubLObject glass_box_task_string_topics_alt(SubLObject source_string) {
        {
            SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_string);
            SubLObject string = (NIL != unicodeP) ? ((SubLObject) (unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(source_string, UNPROVIDED)))) : source_string;
            if (!string.isString()) {
                relation_evaluation.throw_unevaluatable();
            }
            return make_el_set(com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_task_string_denotation_mapper(string), UNPROVIDED);
        }
    }

    /**
     * #$evaluationDefn for #$TopicsOfTextStringFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$TopicsOfTextStringFn")
    public static SubLObject glass_box_task_string_topics(final SubLObject source_string) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_string, UNPROVIDED);
        final SubLObject string = (NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(source_string, UNPROVIDED)) : source_string;
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return make_el_set(nimd_task_string_denotation_mapper(string), UNPROVIDED);
    }

    public static final SubLObject nimd_task_string_denotation_mapper_alt(SubLObject source_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_document = document.new_document(source_string, UNPROVIDED);
                SubLObject lexicon = com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.get_nimd_task_string_denotation_mapper_lexicon();
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$TKBSourceSpindleCollectorMt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = remove(NIL, concept_tagger.all_tagged_concepts(v_document, list($LEXICON, lexicon)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != result) {
                    return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return lexicon_accessors.denots_of_string(source_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject nimd_task_string_denotation_mapper(final SubLObject source_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = document.new_document(source_string, UNPROVIDED, UNPROVIDED);
        final SubLObject lexicon = get_nimd_task_string_denotation_mapper_lexicon();
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$TKBSourceSpindleCollectorMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = remove(NIL, concept_tagger.all_tagged_concepts(v_document, list($LEXICON, lexicon)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            return remove_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return lexicon_accessors.denots_of_string(source_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_nimd_task_string_denotation_mapper_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == abstract_lexicon.abstract_lexicon_p($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread))) {
                $nimd_sentential_concept_tagging_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
                methods.funcall_instance_method_with_1_args($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$ClosedClassWord);
                methods.funcall_instance_method_with_1_args($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Adjective);
                methods.funcall_instance_method_with_1_args($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), ADD_CONCEPT_FILTER_SPEC, $list_alt24);
            }
            return $nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_nimd_task_string_denotation_mapper_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread))) {
            $nimd_sentential_concept_tagging_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
            methods.funcall_instance_method_with_1_args($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$ClosedClassWord);
            methods.funcall_instance_method_with_1_args($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), EXCLUDE_POS, $$Adjective);
            if (NIL != $nimd_filters_for_topic_of_text_string_fnP$.getDynamicValue(thread)) {
                methods.funcall_instance_method_with_1_args($nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), ADD_CONCEPT_FILTER_SPEC, $list23);
            }
        }
        return $nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject nimd_task_parse_containsP_alt(SubLObject task_string, SubLObject required_elements) {
        {
            SubLObject parse_result = com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser.nimd_task_string_denotation_mapper(task_string);
            SubLObject failP = NIL;
            if (NIL == failP) {
                {
                    SubLObject csome_list_var = required_elements;
                    SubLObject element = NIL;
                    for (element = csome_list_var.first(); !((NIL != failP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , element = csome_list_var.first()) {
                        if (NIL == member(element, cycl_utilities.hl_to_el(parse_result), EQUAL, UNPROVIDED)) {
                            Errors.warn($str_alt25$missing_from_parse_result___S__, element);
                            failP = T;
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    public static SubLObject nimd_task_parse_containsP(final SubLObject task_string, final SubLObject required_elements) {
        final SubLObject parse_result = nimd_task_string_denotation_mapper(task_string);
        SubLObject failP = NIL;
        if (NIL == failP) {
            SubLObject csome_list_var = required_elements;
            SubLObject element = NIL;
            element = csome_list_var.first();
            while ((NIL == failP) && (NIL != csome_list_var)) {
                if (NIL == member(element, cycl_utilities.hl_to_el(parse_result), EQUAL, UNPROVIDED)) {
                    Errors.warn($str24$missing_from_parse_result___S__, element);
                    failP = T;
                }
                csome_list_var = csome_list_var.rest();
                element = csome_list_var.first();
            } 
        }
        return makeBoolean(NIL == failP);
    }

    public static SubLObject declare_nimd_parser_file() {
        declareFunction("glass_box_query_required_concepts", "GLASS-BOX-QUERY-REQUIRED-CONCEPTS", 1, 0, false);
        declareFunction("glass_box_query_excluded_concepts", "GLASS-BOX-QUERY-EXCLUDED-CONCEPTS", 1, 0, false);
        declareFunction("glass_box_concepts_int", "GLASS-BOX-CONCEPTS-INT", 2, 0, false);
        declareFunction("glass_box_search_string", "GLASS-BOX-SEARCH-STRING", 2, 0, false);
        declareFunction("nimd_search_string_denotation_mapper", "NIMD-SEARCH-STRING-DENOTATION-MAPPER", 1, 0, false);
        declareFunction("nimd_uninteresting_word", "NIMD-UNINTERESTING-WORD", 1, 0, false);
        declareFunction("nimd_matches_for_unrecognized_terms", "NIMD-MATCHES-FOR-UNRECOGNIZED-TERMS", 2, 0, false);
        declareFunction("nimd_dates_from_string", "NIMD-DATES-FROM-STRING", 1, 2, false);
        declareFunction("glass_box_task_string_topics", "GLASS-BOX-TASK-STRING-TOPICS", 1, 0, false);
        declareFunction("nimd_task_string_denotation_mapper", "NIMD-TASK-STRING-DENOTATION-MAPPER", 1, 0, false);
        declareFunction("get_nimd_task_string_denotation_mapper_lexicon", "GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON", 0, 0, false);
        declareFunction("nimd_task_parse_containsP", "NIMD-TASK-PARSE-CONTAINS?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_nimd_parser_file() {
        defparameter("*NIMD-SENTENTIAL-CONCEPT-TAGGING-LEXICON*", NIL);
        defparameter("*NIMD-FILTERS-FOR-TOPIC-OF-TEXT-STRING-FN?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_nimd_parser_file_alt() {
        register_kb_function(GLASS_BOX_QUERY_REQUIRED_CONCEPTS);
        register_kb_function(GLASS_BOX_QUERY_EXCLUDED_CONCEPTS);
        register_kb_function(GLASS_BOX_TASK_STRING_TOPICS);
        define_test_case_table_int($sym26$NIMD_TASK_PARSE_CONTAINS_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt34);
        return NIL;
    }

    public static SubLObject setup_nimd_parser_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(GLASS_BOX_QUERY_REQUIRED_CONCEPTS);
            register_kb_function(GLASS_BOX_QUERY_EXCLUDED_CONCEPTS);
            register_kb_function(GLASS_BOX_TASK_STRING_TOPICS);
            define_test_case_table_int($sym25$NIMD_TASK_PARSE_CONTAINS_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list32);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int($sym26$NIMD_TASK_PARSE_CONTAINS_, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$daves, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list_alt34);
        }
        return NIL;
    }

    public static SubLObject setup_nimd_parser_file_Previous() {
        register_kb_function(GLASS_BOX_QUERY_REQUIRED_CONCEPTS);
        register_kb_function(GLASS_BOX_QUERY_EXCLUDED_CONCEPTS);
        register_kb_function(GLASS_BOX_TASK_STRING_TOPICS);
        define_test_case_table_int($sym25$NIMD_TASK_PARSE_CONTAINS_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list32);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nimd_parser_file();
    }

    static private final SubLString $str_alt1$With_all_the_words = makeString("With_all_the_words");

    @Override
    public void initializeVariables() {
        init_nimd_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nimd_parser_file();
    }

    static private final SubLString $str_alt3$With_the_exact_phrase = makeString("With_the_exact_phrase");

    

    static private final SubLString $str_alt4$With_at_least_one_of_the_words = makeString("With_at_least_one_of_the_words");

    static private final SubLString $str_alt6$Without_the_words = makeString("Without_the_words");

    static private final SubLString $str_alt8$_ = makeString(",");

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("givenNames"), reader_make_constant_shell("middleName"), reader_make_constant_shell("firstName"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("stockTickerSymbol"), reader_make_constant_shell("gospelName-Short"), reader_make_constant_shell("epistleAddresseeText"), reader_make_constant_shell("internetCountryCode"));

    static private final SubLList $list_alt10 = list(CHAR_plus);

    static private final SubLString $str_alt11$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt13$_s = makeString("'s");

    static private final SubLList $list_alt15 = list($YEAR);

    static private final SubLList $list_alt24 = list(reader_make_constant_shell("ConceptFilterSpecificationFn"), list(reader_make_constant_shell("ConceptNodesForTaskTypeFn"), reader_make_constant_shell("IntelligenceAnalysisTask-Allotment")), reader_make_constant_shell("ConceptAndInstancesFilterParameter"), reader_make_constant_shell("TriggerFromConceptOrInstance"));

    static private final SubLString $str_alt25$missing_from_parse_result___S__ = makeString("missing from parse result: ~S~%");

    static private final SubLSymbol $sym26$NIMD_TASK_PARSE_CONTAINS_ = makeSymbol("NIMD-TASK-PARSE-CONTAINS?");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt34 = list(list(list(makeString("A recent suicide bombing that apparently targeted the motorcade of Rafik \nHariri, the former Lebanese Prime Minister, resulted in the death of Hariri.\nDetermine who are the most likely suspects for the bombing. Provide information\nabout the motives of terrorist groups or nations that could have directed or\nperformed the bombing."), list(reader_make_constant_shell("Motive"), reader_make_constant_shell("RafikHariri"))), T), list(list(makeString("Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad\'s hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity."), list(reader_make_constant_shell("Iran"), reader_make_constant_shell("MahmoudAhmadinejad"), reader_make_constant_shell("ActOfDissent"), list(reader_make_constant_shell("ResearchingAndDevelopingFn"), reader_make_constant_shell("NuclearRelatedMaterial")))), T), list(list(makeString("Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad\'s hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity."), list(reader_make_constant_shell("Event"))), NIL));
}

/**
 * Total time: 143 ms
 */
