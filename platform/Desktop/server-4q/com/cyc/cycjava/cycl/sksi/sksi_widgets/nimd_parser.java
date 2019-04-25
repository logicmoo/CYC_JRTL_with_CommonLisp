package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.abstract_lexicon;
import com.cyc.cycjava.cycl.concept_tagger;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.nl_trie_accessors;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.standard_tokenization;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nimd_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser";
    public static final String myFingerPrint = "5cfb38dbf1d35bd3567e3717c302cacbbd5bc1b31b6fd6c74e8e413d1669aad8";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 7113L)
    private static SubLSymbol $nimd_sentential_concept_tagging_lexicon$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 7189L)
    public static SubLSymbol $nimd_filters_for_topic_of_text_string_fnP$;
    private static final SubLSymbol $sym0$NUNION;
    private static final SubLString $str1$With_all_the_words;
    private static final SubLString $str2$Query;
    private static final SubLString $str3$With_the_exact_phrase;
    private static final SubLString $str4$With_at_least_one_of_the_words;
    private static final SubLSymbol $sym5$GLASS_BOX_QUERY_REQUIRED_CONCEPTS;
    private static final SubLString $str6$Without_the_words;
    private static final SubLSymbol $sym7$GLASS_BOX_QUERY_EXCLUDED_CONCEPTS;
    private static final SubLString $str8$_;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$STRING_TOKEN_STRING;
    private static final SubLString $str12$_s;
    private static final SubLSymbol $kw13$INFIX;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$GLASS_BOX_TASK_STRING_TOPICS;
    private static final SubLObject $const16$TKBSourceSpindleCollectorMt;
    private static final SubLSymbol $kw17$LEXICON;
    private static final SubLSymbol $sym18$TERM_LEXICON;
    private static final SubLSymbol $sym19$EXCLUDE_POS;
    private static final SubLObject $const20$ClosedClassWord;
    private static final SubLObject $const21$Adjective;
    private static final SubLSymbol $sym22$ADD_CONCEPT_FILTER_SPEC;
    private static final SubLList $list23;
    private static final SubLString $str24$missing_from_parse_result___S__;
    private static final SubLSymbol $sym25$NIMD_TASK_PARSE_CONTAINS_;
    private static final SubLSymbol $kw26$TEST;
    private static final SubLSymbol $kw27$OWNER;
    private static final SubLSymbol $kw28$CLASSES;
    private static final SubLSymbol $kw29$KB;
    private static final SubLSymbol $kw30$FULL;
    private static final SubLSymbol $kw31$WORKING_;
    private static final SubLList $list32;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 969L)
    public static SubLObject glass_box_query_required_concepts(final SubLObject source_string) {
        if (!source_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.make_el_set(Sequences.remove_duplicates(Sequences.creduce(Symbols.symbol_function((SubLObject)nimd_parser.$sym0$NUNION), (SubLObject)ConsesLow.list(glass_box_concepts_int(source_string, (SubLObject)nimd_parser.$str1$With_all_the_words), glass_box_concepts_int(source_string, (SubLObject)nimd_parser.$str2$Query), glass_box_concepts_int(source_string, (SubLObject)nimd_parser.$str3$With_the_exact_phrase), glass_box_concepts_int(source_string, (SubLObject)nimd_parser.$str4$With_at_least_one_of_the_words)), (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED), (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED), (SubLObject)nimd_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 1709L)
    public static SubLObject glass_box_query_excluded_concepts(final SubLObject source_string) {
        if (!source_string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.make_el_set(glass_box_concepts_int(source_string, (SubLObject)nimd_parser.$str6$Without_the_words), (SubLObject)nimd_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 1988L)
    public static SubLObject glass_box_concepts_int(final SubLObject source_string, final SubLObject search_string) {
        final SubLObject query_string = glass_box_search_string(source_string, search_string);
        return nimd_search_string_denotation_mapper(query_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 2201L)
    public static SubLObject glass_box_search_string(final SubLObject source_string, final SubLObject marker_string) {
        SubLObject cdolist_list_var;
        final SubLObject major_parts = cdolist_list_var = string_utilities.split_string(source_string, (SubLObject)nimd_parser.$str8$_);
        SubLObject part = (SubLObject)nimd_parser.NIL;
        part = cdolist_list_var.first();
        while (nimd_parser.NIL != cdolist_list_var) {
            if (nimd_parser.NIL != string_utilities.starts_with(string_utilities.trim_whitespace(part), marker_string)) {
                return string_utilities.string_upto(string_utilities.string_after(part, (SubLObject)Characters.CHAR_quotation), (SubLObject)Characters.CHAR_quotation);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        }
        return (SubLObject)nimd_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 2490L)
    public static SubLObject nimd_search_string_denotation_mapper(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return (SubLObject)nimd_parser.NIL;
        }
        final SubLObject decoded_string = web_utilities.html_url_decode(string);
        final SubLObject excluded_preds = (SubLObject)nimd_parser.$list9;
        final SubLObject chunks = string_utilities.string_tokenize(decoded_string, (SubLObject)nimd_parser.$list10, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
        SubLObject result = (SubLObject)nimd_parser.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject cdolist_list_var = chunks;
                SubLObject chunk = (SubLObject)nimd_parser.NIL;
                chunk = cdolist_list_var.first();
                while (nimd_parser.NIL != cdolist_list_var) {
                    SubLObject tokenized_string = string_utilities.string_tokenize(string_utilities.trim_whitespace(chunk), (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
                    SubLObject queued_words = (SubLObject)nimd_parser.NIL;
                    while (nimd_parser.NIL != list_utilities.lengthG(tokenized_string, (SubLObject)nimd_parser.ZERO_INTEGER, (SubLObject)nimd_parser.UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject dates = nimd_dates_from_string(tokenized_string, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
                        final SubLObject length = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (nimd_parser.NIL != dates) {
                            result = Sequences.cconcatenate(dates, result);
                            SubLObject cdolist_list_var_$1 = lexicon_accessors.denotation_mapper(string_utilities.bunge(Sequences.nreverse(queued_words), (SubLObject)nimd_parser.UNPROVIDED), excluded_preds, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
                            SubLObject token = (SubLObject)nimd_parser.NIL;
                            token = cdolist_list_var_$1.first();
                            while (nimd_parser.NIL != cdolist_list_var_$1) {
                                result = (SubLObject)ConsesLow.cons(standard_tokenization.string_token_value(token), result);
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                token = cdolist_list_var_$1.first();
                            }
                            queued_words = (SubLObject)nimd_parser.NIL;
                            tokenized_string = list_utilities.first_n(length, tokenized_string);
                        }
                        else {
                            queued_words = (SubLObject)ConsesLow.cons(tokenized_string.first(), queued_words);
                            tokenized_string = tokenized_string.rest();
                        }
                    }
                    final SubLObject rest_of_string = string_utilities.bunge(ConsesLow.nconc(Sequences.nreverse(queued_words), tokenized_string), (SubLObject)nimd_parser.UNPROVIDED);
                    thread.resetMultipleValues();
                    final SubLObject recognized_terms = lexicon_accessors.denotation_mapper(rest_of_string, excluded_preds, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
                    final SubLObject unrecognized_terms = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    SubLObject cdolist_list_var_$2 = recognized_terms;
                    SubLObject token2 = (SubLObject)nimd_parser.NIL;
                    token2 = cdolist_list_var_$2.first();
                    while (nimd_parser.NIL != cdolist_list_var_$2) {
                        if (nimd_parser.NIL == nimd_uninteresting_word(standard_tokenization.string_token_string(token2))) {
                            result = (SubLObject)ConsesLow.cons(standard_tokenization.string_token_value(token2), result);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        token2 = cdolist_list_var_$2.first();
                    }
                    result = Sequences.cconcatenate(result, nimd_matches_for_unrecognized_terms(Mapping.mapcar((SubLObject)nimd_parser.$sym11$STRING_TOKEN_STRING, unrecognized_terms), excluded_preds));
                    cdolist_list_var = cdolist_list_var.rest();
                    chunk = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nimd_parser.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 4410L)
    public static SubLObject nimd_uninteresting_word(final SubLObject string) {
        return lexicon_utilities.denots_of_string_stop_word(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 4505L)
    public static SubLObject nimd_matches_for_unrecognized_terms(final SubLObject strings, final SubLObject excluded_preds) {
        SubLObject result = (SubLObject)nimd_parser.NIL;
        SubLObject cdolist_list_var = strings;
        SubLObject unrecognized_string = (SubLObject)nimd_parser.NIL;
        unrecognized_string = cdolist_list_var.first();
        while (nimd_parser.NIL != cdolist_list_var) {
            final SubLObject unpossessivized_string = string_utilities.post_remove(unrecognized_string, (SubLObject)nimd_parser.$str12$_s, (SubLObject)nimd_parser.UNPROVIDED);
            final SubLObject unpossessivized_matches = lexicon_accessors.denotation_mapper(unpossessivized_string, excluded_preds, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
            if (nimd_parser.NIL != unpossessivized_matches) {
                SubLObject cdolist_list_var_$4 = unpossessivized_matches;
                SubLObject token = (SubLObject)nimd_parser.NIL;
                token = cdolist_list_var_$4.first();
                while (nimd_parser.NIL != cdolist_list_var_$4) {
                    if (nimd_parser.NIL == nimd_uninteresting_word(standard_tokenization.string_token_string(token))) {
                        result = (SubLObject)ConsesLow.cons(standard_tokenization.string_token_value(token), result);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    token = cdolist_list_var_$4.first();
                }
            }
            else {
                SubLObject cdolist_list_var_$5;
                final SubLObject possible_matches = cdolist_list_var_$5 = nl_trie_accessors.nl_trie_matching_phrases(unpossessivized_string, (SubLObject)nimd_parser.$kw13$INFIX);
                SubLObject possible_match = (SubLObject)nimd_parser.NIL;
                possible_match = cdolist_list_var_$5.first();
                while (nimd_parser.NIL != cdolist_list_var_$5) {
                    final SubLObject item_var = nl_trie_accessors.nl_trie_index_item_term(possible_match);
                    if (nimd_parser.NIL == conses_high.member(item_var, result, (SubLObject)nimd_parser.EQUAL, Symbols.symbol_function((SubLObject)nimd_parser.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var, result);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 5322L)
    public static SubLObject nimd_dates_from_string(final SubLObject tokenized_string, SubLObject max_date_length, SubLObject min_date_length) {
        if (max_date_length == nimd_parser.UNPROVIDED) {
            max_date_length = (SubLObject)nimd_parser.THREE_INTEGER;
        }
        if (min_date_length == nimd_parser.UNPROVIDED) {
            min_date_length = (SubLObject)nimd_parser.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject dates = (SubLObject)nimd_parser.NIL;
        SubLObject length = Numbers.min(max_date_length, Sequences.length(tokenized_string));
        final SubLObject _prev_bind_0 = date_utilities.$date_patterns$.currentBinding(thread);
        try {
            date_utilities.$date_patterns$.bind((SubLObject)ConsesLow.cons((SubLObject)nimd_parser.$list14, date_utilities.$date_patterns$.getDynamicValue(thread)), thread);
            while (nimd_parser.NIL != list_utilities.empty_list_p(dates) && length.numGE(min_date_length)) {
                dates = date_utilities.parse_date_from_string_fast(string_utilities.bunge(Sequences.subseq(tokenized_string, (SubLObject)nimd_parser.ZERO_INTEGER, length), (SubLObject)nimd_parser.UNPROVIDED), (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
                length = Numbers.subtract(length, (SubLObject)nimd_parser.ONE_INTEGER);
            }
        }
        finally {
            date_utilities.$date_patterns$.rebind(_prev_bind_0, thread);
        }
        return Values.values(dates, number_utilities.f_1X(length));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 5842L)
    public static SubLObject glass_box_task_string_topics(final SubLObject source_string) {
        final SubLObject unicodeP = unicode_nauts.unicode_naut_p(source_string, (SubLObject)nimd_parser.UNPROVIDED);
        final SubLObject string = (nimd_parser.NIL != unicodeP) ? unicode_strings.unicode_display_to_html(cycl_utilities.nat_arg1(source_string, (SubLObject)nimd_parser.UNPROVIDED)) : source_string;
        if (!string.isString()) {
            relation_evaluation.throw_unevaluatable();
        }
        return el_utilities.make_el_set(nimd_task_string_denotation_mapper(string), (SubLObject)nimd_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 6265L)
    public static SubLObject nimd_task_string_denotation_mapper(final SubLObject source_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_document = document.new_document(source_string, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
        final SubLObject lexicon = get_nimd_task_string_denotation_mapper_lexicon();
        SubLObject result = (SubLObject)nimd_parser.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(nimd_parser.$const16$TKBSourceSpindleCollectorMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = Sequences.remove((SubLObject)nimd_parser.NIL, concept_tagger.all_tagged_concepts(v_document, (SubLObject)ConsesLow.list((SubLObject)nimd_parser.$kw17$LEXICON, lexicon)), (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (nimd_parser.NIL != result) {
            return Sequences.remove_duplicates(result, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
        }
        return lexicon_accessors.denots_of_string(source_string, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED, (SubLObject)nimd_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 7263L)
    public static SubLObject get_nimd_task_string_denotation_mapper_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (nimd_parser.NIL == abstract_lexicon.abstract_lexicon_p(nimd_parser.$nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread))) {
            nimd_parser.$nimd_sentential_concept_tagging_lexicon$.setDynamicValue(object.new_class_instance((SubLObject)nimd_parser.$sym18$TERM_LEXICON), thread);
            methods.funcall_instance_method_with_1_args(nimd_parser.$nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), (SubLObject)nimd_parser.$sym19$EXCLUDE_POS, nimd_parser.$const20$ClosedClassWord);
            methods.funcall_instance_method_with_1_args(nimd_parser.$nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), (SubLObject)nimd_parser.$sym19$EXCLUDE_POS, nimd_parser.$const21$Adjective);
            if (nimd_parser.NIL != nimd_parser.$nimd_filters_for_topic_of_text_string_fnP$.getDynamicValue(thread)) {
                methods.funcall_instance_method_with_1_args(nimd_parser.$nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread), (SubLObject)nimd_parser.$sym22$ADD_CONCEPT_FILTER_SPEC, (SubLObject)nimd_parser.$list23);
            }
        }
        return nimd_parser.$nimd_sentential_concept_tagging_lexicon$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nimd-parser.lisp", position = 8111L)
    public static SubLObject nimd_task_parse_containsP(final SubLObject task_string, final SubLObject required_elements) {
        final SubLObject parse_result = nimd_task_string_denotation_mapper(task_string);
        SubLObject failP = (SubLObject)nimd_parser.NIL;
        if (nimd_parser.NIL == failP) {
            SubLObject csome_list_var = required_elements;
            SubLObject element = (SubLObject)nimd_parser.NIL;
            element = csome_list_var.first();
            while (nimd_parser.NIL == failP && nimd_parser.NIL != csome_list_var) {
                if (nimd_parser.NIL == conses_high.member(element, cycl_utilities.hl_to_el(parse_result), (SubLObject)nimd_parser.EQUAL, (SubLObject)nimd_parser.UNPROVIDED)) {
                    Errors.warn((SubLObject)nimd_parser.$str24$missing_from_parse_result___S__, element);
                    failP = (SubLObject)nimd_parser.T;
                }
                csome_list_var = csome_list_var.rest();
                element = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(nimd_parser.NIL == failP);
    }
    
    public static SubLObject declare_nimd_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "glass_box_query_required_concepts", "GLASS-BOX-QUERY-REQUIRED-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "glass_box_query_excluded_concepts", "GLASS-BOX-QUERY-EXCLUDED-CONCEPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "glass_box_concepts_int", "GLASS-BOX-CONCEPTS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "glass_box_search_string", "GLASS-BOX-SEARCH-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "nimd_search_string_denotation_mapper", "NIMD-SEARCH-STRING-DENOTATION-MAPPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "nimd_uninteresting_word", "NIMD-UNINTERESTING-WORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "nimd_matches_for_unrecognized_terms", "NIMD-MATCHES-FOR-UNRECOGNIZED-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "nimd_dates_from_string", "NIMD-DATES-FROM-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "glass_box_task_string_topics", "GLASS-BOX-TASK-STRING-TOPICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "nimd_task_string_denotation_mapper", "NIMD-TASK-STRING-DENOTATION-MAPPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "get_nimd_task_string_denotation_mapper_lexicon", "GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nimd_parser", "nimd_task_parse_containsP", "NIMD-TASK-PARSE-CONTAINS?", 2, 0, false);
        return (SubLObject)nimd_parser.NIL;
    }
    
    public static SubLObject init_nimd_parser_file() {
        nimd_parser.$nimd_sentential_concept_tagging_lexicon$ = SubLFiles.defparameter("*NIMD-SENTENTIAL-CONCEPT-TAGGING-LEXICON*", (SubLObject)nimd_parser.NIL);
        nimd_parser.$nimd_filters_for_topic_of_text_string_fnP$ = SubLFiles.defparameter("*NIMD-FILTERS-FOR-TOPIC-OF-TEXT-STRING-FN?*", (SubLObject)nimd_parser.NIL);
        return (SubLObject)nimd_parser.NIL;
    }
    
    public static SubLObject setup_nimd_parser_file() {
        utilities_macros.register_kb_function((SubLObject)nimd_parser.$sym5$GLASS_BOX_QUERY_REQUIRED_CONCEPTS);
        utilities_macros.register_kb_function((SubLObject)nimd_parser.$sym7$GLASS_BOX_QUERY_EXCLUDED_CONCEPTS);
        utilities_macros.register_kb_function((SubLObject)nimd_parser.$sym15$GLASS_BOX_TASK_STRING_TOPICS);
        generic_testing.define_test_case_table_int((SubLObject)nimd_parser.$sym25$NIMD_TASK_PARSE_CONTAINS_, (SubLObject)ConsesLow.list(new SubLObject[] { nimd_parser.$kw26$TEST, nimd_parser.NIL, nimd_parser.$kw27$OWNER, nimd_parser.NIL, nimd_parser.$kw28$CLASSES, nimd_parser.NIL, nimd_parser.$kw29$KB, nimd_parser.$kw30$FULL, nimd_parser.$kw31$WORKING_, nimd_parser.T }), (SubLObject)nimd_parser.$list32);
        return (SubLObject)nimd_parser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_nimd_parser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_nimd_parser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_nimd_parser_file();
    }
    
    static {
        me = (SubLFile)new nimd_parser();
        nimd_parser.$nimd_sentential_concept_tagging_lexicon$ = null;
        nimd_parser.$nimd_filters_for_topic_of_text_string_fnP$ = null;
        $sym0$NUNION = SubLObjectFactory.makeSymbol("NUNION");
        $str1$With_all_the_words = SubLObjectFactory.makeString("With_all_the_words");
        $str2$Query = SubLObjectFactory.makeString("Query");
        $str3$With_the_exact_phrase = SubLObjectFactory.makeString("With_the_exact_phrase");
        $str4$With_at_least_one_of_the_words = SubLObjectFactory.makeString("With_at_least_one_of_the_words");
        $sym5$GLASS_BOX_QUERY_REQUIRED_CONCEPTS = SubLObjectFactory.makeSymbol("GLASS-BOX-QUERY-REQUIRED-CONCEPTS");
        $str6$Without_the_words = SubLObjectFactory.makeString("Without_the_words");
        $sym7$GLASS_BOX_QUERY_EXCLUDED_CONCEPTS = SubLObjectFactory.makeSymbol("GLASS-BOX-QUERY-EXCLUDED-CONCEPTS");
        $str8$_ = SubLObjectFactory.makeString(",");
        $list9 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("givenNames")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("middleName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("firstName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryCodeDigraph")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("stockTickerSymbol")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gospelName-Short")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("epistleAddresseeText")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("internetCountryCode")));
        $list10 = ConsesLow.list((SubLObject)Characters.CHAR_plus);
        $sym11$STRING_TOKEN_STRING = SubLObjectFactory.makeSymbol("STRING-TOKEN-STRING");
        $str12$_s = SubLObjectFactory.makeString("'s");
        $kw13$INFIX = SubLObjectFactory.makeKeyword("INFIX");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("YEAR"));
        $sym15$GLASS_BOX_TASK_STRING_TOPICS = SubLObjectFactory.makeSymbol("GLASS-BOX-TASK-STRING-TOPICS");
        $const16$TKBSourceSpindleCollectorMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"));
        $kw17$LEXICON = SubLObjectFactory.makeKeyword("LEXICON");
        $sym18$TERM_LEXICON = SubLObjectFactory.makeSymbol("TERM-LEXICON");
        $sym19$EXCLUDE_POS = SubLObjectFactory.makeSymbol("EXCLUDE-POS");
        $const20$ClosedClassWord = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ClosedClassWord"));
        $const21$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $sym22$ADD_CONCEPT_FILTER_SPEC = SubLObjectFactory.makeSymbol("ADD-CONCEPT-FILTER-SPEC");
        $list23 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptFilterSpecificationFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptNodesForTaskTypeFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligenceAnalysisTask-Allotment"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ConceptAndInstancesFilterParameter")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TriggerFromConceptOrInstance")));
        $str24$missing_from_parse_result___S__ = SubLObjectFactory.makeString("missing from parse result: ~S~%");
        $sym25$NIMD_TASK_PARSE_CONTAINS_ = SubLObjectFactory.makeSymbol("NIMD-TASK-PARSE-CONTAINS?");
        $kw26$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw27$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw28$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw29$KB = SubLObjectFactory.makeKeyword("KB");
        $kw30$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw31$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("A recent suicide bombing that apparently targeted the motorcade of Rafik \nHariri, the former Lebanese Prime Minister, resulted in the death of Hariri.\nDetermine who are the most likely suspects for the bombing. Provide information\nabout the motives of terrorist groups or nations that could have directed or\nperformed the bombing."), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Motive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RafikHariri")))), (SubLObject)nimd_parser.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad's hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity."), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Iran")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MahmoudAhmadinejad")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ActOfDissent")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchingAndDevelopingFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NuclearRelatedMaterial"))))), (SubLObject)nimd_parser.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Recent reports indicate that there is growing\ndissent among Iranian reformers against their hardline leader, Mahmoud\nAhmadinejad. Some reformers seem to believe Ahmadinejad's hardline tactics are\nundermining their strategic goals because they are creating a climate in which\nit is increasingly challenging for Iran to pursue a nuclear program. Gather\nevidence of dissent. Develop strategies to exploit these cracks in Iranian\nsolidarity."), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event")))), (SubLObject)nimd_parser.NIL));
    }
}

/*

	Total time: 143 ms
	
*/