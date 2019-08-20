/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl_stats;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.substitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.cyclifier_interface;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.cycjava.cycl.linkage;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      NOUN-LEARNER
 *  source file: /cyc/top/cycl/nl-stats/noun-learner.lisp
 *  created:     2019/07/03 17:39:02
 */
public final class noun_learner extends SubLTranslatedFile implements V02 {
    // // Constructor
    private noun_learner() {
    }

    public static final SubLFile me = new noun_learner();


    // // Definitions
    /**
     * Given that some noun occurred as the subject of each of AS-SUBJECT-VERBS and as the direct object of each of AS-OBJECT-VERBS,
     * what type of thing might it denote?
     */
    public static final SubLObject type_conjecture_based_on_usages_of_noun_with_verbs(SubLObject as_subject_verbs, SubLObject as_object_verbs) {
        {
            SubLObject list_var = as_subject_verbs;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject list_var = as_object_verbs;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, STRINGP);
                }
            }
        }
        {
            SubLObject special_case_result = type_conjecture_fast_success_special_case(as_subject_verbs, as_object_verbs);
            if (NIL != special_case_result) {
                return special_case_result;
            }
        }
        {
            SubLObject count_as_subject_by_verb = list_to_counts_dictionary(as_subject_verbs, symbol_function(EQUALP));
            SubLObject count_as_object_by_verb = list_to_counts_dictionary(as_object_verbs, symbol_function(EQUALP));
            SubLObject collection_typicality_sums = learned_nouns.typicality_sum_by_collection_based_on_noun_usages(count_as_subject_by_verb, count_as_object_by_verb, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != list_utilities.non_empty_list_p(collection_typicality_sums)) {
                {
                    SubLObject top_collection_typicality_sum_pair = collection_typicality_sums.first();
                    if (top_collection_typicality_sum_pair.isCons()) {
                        return top_collection_typicality_sum_pair.first();
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return dictionary-p mapping each item that occurs at least once in LIST to the number of times it occurs
     */
    public static final SubLObject list_to_counts_dictionary(SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject counts_dictionary = dictionary.new_dictionary(test, UNPROVIDED);
            SubLObject cdolist_list_var = list;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                dictionary_utilities.dictionary_increment(counts_dictionary, item, UNPROVIDED);
            }
            return counts_dictionary;
        }
    }

    /**
     * If every listed verb that has a known typical argument has the same typical argument, then that's the answer.
     */
    public static final SubLObject type_conjecture_fast_success_special_case(SubLObject as_subject_verbs, SubLObject as_object_verbs) {
        {
            SubLObject result = NIL;
            SubLObject relation = NIL;
            SubLObject relation_1 = NIL;
            SubLObject verb_list = NIL;
            SubLObject verb_list_2 = NIL;
            for (relation = list($SUBJ, $OBJ), relation_1 = relation.first(), verb_list = list(as_subject_verbs, as_object_verbs), verb_list_2 = verb_list.first(); !((NIL == verb_list) && (NIL == relation)); relation = relation.rest() , relation_1 = relation.first() , verb_list = verb_list.rest() , verb_list_2 = verb_list.first()) {
                {
                    SubLObject cdolist_list_var = verb_list_2;
                    SubLObject verb = NIL;
                    for (verb = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , verb = cdolist_list_var.first()) {
                        {
                            SubLObject typical_arg = verb_argument_lookups.typical_arg(verb, relation_1, NIL);
                            if (NIL != typical_arg) {
                                if (NIL == result) {
                                    result = typical_arg;
                                } else {
                                    if (!result.equal(typical_arg)) {
                                        return NIL;
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

    /**
     * Conjectures the classes of the unknown nouns in SENTENCE.
     * If LISTIFY? is non-nil, the return value is a list whose elements are quadrupletons of the following form:
     * (<noun-string> <cyc-constant> <:genls or :isa or :equals> <confidence>)
     * If LISTIFY? is nil, the return value is a LEARNED-NOUNS-P.
     */
    public static final SubLObject learn_unknown_nouns_from_sentence(SubLObject sentence, SubLObject listifyP) {
        if (listifyP == UNPROVIDED) {
            listifyP = T;
        }
        SubLTrampolineFile.checkType(sentence, STRINGP);
        return learn_unknown_nouns_single_sentence_int(sentence, listifyP);
    }

    /**
     * Like @xref LEARN-UNKNOWN-NOUNS-FROM-SENTENCE, but takes a parse-tree-p as its first argument.
     */
    public static final SubLObject learn_unknown_nouns_from_parse_tree(SubLObject v_parse_tree, SubLObject listifyP) {
        if (listifyP == UNPROVIDED) {
            listifyP = T;
        }
        SubLTrampolineFile.checkType(v_parse_tree, PARSE_TREE_P);
        return learn_unknown_nouns_single_sentence_int(v_parse_tree, listifyP);
    }

    public static final SubLObject learn_unknown_nouns_single_sentence_int(SubLObject sentence_or_parse_tree, SubLObject listifyP) {
        {
            SubLObject verbal_matches_lists = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            verbal_matches_lists = parse_tree_utilities.extract_verbal_matches_downcase_first_word(sentence_or_parse_tree, UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                Errors.warn($str_alt6$_A____S, error, sentence_or_parse_tree);
                verbal_matches_lists = list(NIL, NIL);
            }
            {
                SubLObject learned = learned_nouns.new_learned_nouns(ONE_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject datum = verbal_matches_lists;
                SubLObject current = datum;
                SubLObject verb_subjects_list = NIL;
                SubLObject verb_objects_list = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt7);
                verb_subjects_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt7);
                verb_objects_list = current.first();
                current = current.rest();
                if (NIL == current) {
                    methods.funcall_instance_method_with_2_args(learned, COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS, verb_subjects_list, verb_objects_list);
                } else {
                    cdestructuring_bind_error(datum, $list_alt7);
                }
                if (NIL != listifyP) {
                    return methods.funcall_instance_method_with_0_args(learned, LISTIFY);
                } else {
                    return learned;
                }
            }
        }
    }

    public static final SubLObject learn_unknown_nouns_from_verb_argument_text_files(SubLObject subj_pairs_file, SubLObject obj_pairs_file, SubLObject complex_nouns_file, SubLObject tag_calculation_method, SubLObject noun_relevance_count_threshold, SubLObject keep_irrelevant_nouns_aroundP, SubLObject listifyP) {
        if (tag_calculation_method == UNPROVIDED) {
            tag_calculation_method = NIL;
        }
        if (noun_relevance_count_threshold == UNPROVIDED) {
            noun_relevance_count_threshold = FIVE_INTEGER;
        }
        if (keep_irrelevant_nouns_aroundP == UNPROVIDED) {
            keep_irrelevant_nouns_aroundP = T;
        }
        if (listifyP == UNPROVIDED) {
            listifyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(subj_pairs_file, STRINGP);
            SubLTrampolineFile.checkType(obj_pairs_file, STRINGP);
            SubLTrampolineFile.checkType(complex_nouns_file, STRINGP);
            {
                SubLObject calculate_tag_methods = learned_nouns.get_learned_nouns_calculate_tag_methods(LEARNED_NOUNS);
                if (NIL != tag_calculation_method) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == member(tag_calculation_method, calculate_tag_methods, UNPROVIDED, UNPROVIDED)) {
                            Errors.error($str_alt11$_A_is_not_one_of__A, tag_calculation_method, calculate_tag_methods);
                        }
                    }
                }
            }
            SubLTrampolineFile.checkType(noun_relevance_count_threshold, POSITIVE_INTEGER_P);
            {
                SubLObject learned = learned_nouns.new_learned_nouns(noun_relevance_count_threshold, tag_calculation_method, $int$50);
                methods.funcall_instance_method_with_3_args(learned, COMPILE_RAW_DATA_FROM_TEXT_FILES, subj_pairs_file, obj_pairs_file, complex_nouns_file);
                if (NIL == keep_irrelevant_nouns_aroundP) {
                    methods.funcall_instance_method_with_0_args(learned, PURGE_IRRELEVANT_NOUNS);
                }
                if (NIL != listifyP) {
                    return methods.funcall_instance_method_with_0_args(learned, LISTIFY);
                } else {
                    return learned;
                }
            }
        }
    }

    public static final SubLObject learn_unknown_nouns_from_verb_argument_text_files_directory(SubLObject input_directory, SubLObject subj_pairs_file_suffix, SubLObject obj_pairs_file_suffix, SubLObject complex_nouns_file_suffix, SubLObject tag_calculation_method, SubLObject noun_relevance_count_threshold, SubLObject keep_irrelevant_nouns_aroundP, SubLObject listifyP) {
        if (subj_pairs_file_suffix == UNPROVIDED) {
            subj_pairs_file_suffix = $str_alt16$_subj;
        }
        if (obj_pairs_file_suffix == UNPROVIDED) {
            obj_pairs_file_suffix = $str_alt17$_obj;
        }
        if (complex_nouns_file_suffix == UNPROVIDED) {
            complex_nouns_file_suffix = $str_alt18$_compounds;
        }
        if (tag_calculation_method == UNPROVIDED) {
            tag_calculation_method = NIL;
        }
        if (noun_relevance_count_threshold == UNPROVIDED) {
            noun_relevance_count_threshold = FIVE_INTEGER;
        }
        if (keep_irrelevant_nouns_aroundP == UNPROVIDED) {
            keep_irrelevant_nouns_aroundP = T;
        }
        if (listifyP == UNPROVIDED) {
            listifyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(input_directory, DIRECTORY_P);
            SubLTrampolineFile.checkType(subj_pairs_file_suffix, STRINGP);
            SubLTrampolineFile.checkType(obj_pairs_file_suffix, STRINGP);
            SubLTrampolineFile.checkType(complex_nouns_file_suffix, STRINGP);
            {
                SubLObject calculate_tag_methods = learned_nouns.get_learned_nouns_calculate_tag_methods(LEARNED_NOUNS);
                if (NIL != tag_calculation_method) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == member(tag_calculation_method, calculate_tag_methods, UNPROVIDED, UNPROVIDED)) {
                            Errors.error($str_alt11$_A_is_not_one_of__A, tag_calculation_method, calculate_tag_methods);
                        }
                    }
                }
            }
            SubLTrampolineFile.checkType(noun_relevance_count_threshold, POSITIVE_INTEGER_P);
            {
                SubLObject learned = learned_nouns.new_learned_nouns(noun_relevance_count_threshold, tag_calculation_method, $int$50);
                methods.funcall_instance_method_with_4_args(learned, COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY, input_directory, subj_pairs_file_suffix, obj_pairs_file_suffix, complex_nouns_file_suffix);
                if (NIL == keep_irrelevant_nouns_aroundP) {
                    methods.funcall_instance_method_with_0_args(learned, PURGE_IRRELEVANT_NOUNS);
                }
                if (NIL != listifyP) {
                    return methods.funcall_instance_method_with_0_args(learned, LISTIFY);
                } else {
                    return learned;
                }
            }
        }
    }

    public static final SubLObject learn_unknown_nouns_from_sentencified_corpus(SubLObject corpus_path, SubLObject tag_calculation_method, SubLObject noun_relevance_count_threshold, SubLObject keep_irrelevant_nouns_aroundP, SubLObject listifyP) {
        if (tag_calculation_method == UNPROVIDED) {
            tag_calculation_method = NIL;
        }
        if (noun_relevance_count_threshold == UNPROVIDED) {
            noun_relevance_count_threshold = FIVE_INTEGER;
        }
        if (keep_irrelevant_nouns_aroundP == UNPROVIDED) {
            keep_irrelevant_nouns_aroundP = T;
        }
        if (listifyP == UNPROVIDED) {
            listifyP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject learned = learned_nouns.new_learned_nouns(noun_relevance_count_threshold, tag_calculation_method, $int$50);
                SubLObject file_var = corpus_path;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(file_var, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt22$Unable_to_open__S, file_var);
                    }
                    {
                        SubLObject stream_var = stream;
                        if (stream_var.isStream()) {
                            {
                                SubLObject stream_var_3 = stream_var;
                                SubLObject line_number_var = NIL;
                                SubLObject sentence = NIL;
                                for (line_number_var = ZERO_INTEGER, sentence = read_line(stream_var_3, NIL, NIL, UNPROVIDED); NIL != sentence; line_number_var = number_utilities.f_1X(line_number_var) , sentence = read_line(stream_var_3, NIL, NIL, UNPROVIDED)) {
                                    sentence = substitute(CHAR_quote, CHAR_quotation, sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    {
                                        SubLObject error = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        {
                                                            SubLObject verbal_matches_lists = svo(sentence);
                                                            SubLObject verb_subjects_list = verbal_matches_lists.first();
                                                            SubLObject verb_objects_list = second(verbal_matches_lists);
                                                            SubLObject nouns_without_verbs_list = (NIL != list_utilities.tripleP(verbal_matches_lists)) ? ((SubLObject) (third(verbal_matches_lists))) : NIL;
                                                            methods.funcall_instance_method_with_3_args(learned, COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS, verb_subjects_list, verb_objects_list, nouns_without_verbs_list);
                                                        }
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                        }
                                        if (NIL != error) {
                                            Errors.warn($str_alt6$_A____S, error, sentence);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL == keep_irrelevant_nouns_aroundP) {
                    methods.funcall_instance_method_with_0_args(learned, PURGE_IRRELEVANT_NOUNS);
                }
                if (NIL != listifyP) {
                    return methods.funcall_instance_method_with_0_args(learned, LISTIFY);
                } else {
                    return learned;
                }
            }
        }
    }

    // defvar
    private static final SubLSymbol $svo_parser$ = makeSymbol("*SVO-PARSER*");

    public static final SubLObject ensure_svo_initialized() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == parser.parser_p($svo_parser$.getDynamicValue(thread))) {
                $svo_parser$.setDynamicValue(parser.new_link_parser(linkage.$link_parse_options$.getDynamicValue(thread), $WARN, $int$30), thread);
            }
            return list_utilities.sublisp_boolean($svo_parser$.getDynamicValue(thread));
        }
    }

    public static final SubLObject svo(SubLObject sentence) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            ensure_svo_initialized();
            {
                SubLObject first_word = string_utilities.string_upto(string_utilities.left_trim_whitespace(sentence), string_utilities.$space_char$.getGlobalValue());
                SubLObject v_linkage = methods.funcall_instance_method_with_1_args($svo_parser$.getDynamicValue(thread), PARSE, sentence);
                SubLObject verb_string = NIL;
                SubLObject subject_record = NIL;
                SubLObject object_record = NIL;
                SubLObject noun_record = NIL;
                SubLObject noun = NIL;
                SubLObject nouns = NIL;
                SubLObject subject_records = NIL;
                SubLObject object_records = NIL;
                SubLObject noun_records = NIL;
                if (NIL != linkage.linkage_p(v_linkage)) {
                    instances.set_slot(methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, ONE_INTEGER), STRING, first_word);
                    {
                        SubLObject cdolist_list_var = get_verbs(v_linkage);
                        SubLObject verb = NIL;
                        for (verb = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , verb = cdolist_list_var.first()) {
                            verb_string = morphology.get_root(methods.funcall_instance_method_with_0_args(verb, GET_STRING), UNPROVIDED);
                            noun = methods.funcall_instance_method_with_0_args(verb, GET_SUBJECT);
                            if (NIL != noun) {
                                nouns = cons(noun, nouns);
                                subject_record = get_noun_record(noun, $SUBJ, verb_string);
                                if (NIL != subject_record) {
                                    subject_records = cons(subject_record, subject_records);
                                }
                            }
                            noun = methods.funcall_instance_method_with_0_args(verb, GET_DIRECT_OBJECT);
                            if (NIL != noun) {
                                nouns = cons(noun, nouns);
                                object_record = get_noun_record(noun, $SINGLE, verb_string);
                                if (NIL != object_record) {
                                    object_records = cons(object_record, object_records);
                                }
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = get_noun_heads(v_linkage);
                        SubLObject noun_4 = NIL;
                        for (noun_4 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , noun_4 = cdolist_list_var.first()) {
                            if (NIL == subl_promotions.memberP(noun_4, nouns, EQ, UNPROVIDED)) {
                                noun_record = get_noun_record(noun_4, $IGNORE, NIL);
                                if (NIL != noun_record) {
                                    noun_records = cons(noun_record, noun_records);
                                }
                            }
                        }
                    }
                }
                return list(nreverse(subject_records), nreverse(object_records), nreverse(noun_records));
            }
        }
    }

    public static final SubLObject get_noun_record(SubLObject noun, SubLObject keyword, SubLObject verb_string) {
        if (NIL != linkage.noun_link_word_p(noun)) {
            {
                SubLObject string = methods.funcall_instance_method_with_0_args(noun, GET_STRING);
                SubLObject tag = assign_tag(noun);
                SubLObject det = (NIL != linkage.noun_link_word_p(noun)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(noun, GET_SPECIFIER))) : NIL;
                SubLObject det_string = (NIL != det) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(det, GET_STRING))) : $str_alt34$;
                return list(cconcatenate(format_nil.format_nil_a_no_copy(lexification_utilities.singularize_word(string)), new SubLObject[]{ $str_alt35$_, format_nil.format_nil_a_no_copy(tag) }), NIL != verb_string ? ((SubLObject) (cconcatenate(format_nil.format_nil_a_no_copy(verb_string), new SubLObject[]{ $str_alt35$_, format_nil.format_nil_a_no_copy($VB) }))) : $str_alt34$, get_noun_compound(noun), det_string, keyword);
            }
        }
        return NIL;
    }

    /**
     * returns the noun compound that embeds NOUN
     */
    public static final SubLObject get_noun_compound(SubLObject noun) {
        {
            SubLObject leading = NIL;
            SubLObject trailing = NIL;
            SubLObject v_linkage = methods.funcall_instance_method_with_0_args(noun, GET_LINKAGE);
            SubLObject word = NIL;
            SubLObject i = NIL;
            if (NIL == trailing) {
                {
                    SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(noun, GET_PPS);
                    SubLObject prep = NIL;
                    for (prep = csome_list_var.first(); !((NIL != trailing) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , prep = csome_list_var.first()) {
                        if (methods.funcall_instance_method_with_0_args(prep, GET_STRING).equalp($$$of)) {
                            i = methods.funcall_instance_method_with_0_args(prep, GET_INDEX);
                            word = methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, i);
                            while (NIL != instances.get_slot(word, RIGHT_LINKS)) {
                                trailing = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), trailing);
                                i = add(i, ONE_INTEGER);
                                word = methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, i);
                            } 
                            trailing = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), trailing);
                            trailing = nreverse(trailing);
                        }
                    }
                }
            }
            i = number_utilities.f_1_(methods.funcall_instance_method_with_0_args(noun, GET_INDEX));
            word = methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, i);
            while ((NIL != linkage.noun_link_word_p(word)) && (NIL == linkage.pronoun_link_word_p(word))) {
                leading = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), leading);
                i = subtract(i, ONE_INTEGER);
                word = methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, i);
            } 
            return string_utilities.bunge(append(leading, cons(methods.funcall_instance_method_with_0_args(noun, GET_STRING), trailing)), UNPROVIDED);
        }
    }

    public static final SubLObject assign_tag(SubLObject word) {
        if (NIL != cyclifier_interface.nominal_word_p(word)) {
            if (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY), $list_alt43, UNPROVIDED, UNPROVIDED)) {
                return $NN;
            } else {
                return $NP;
            }
        } else
            if (NIL != linkage.verb_link_word_p(word)) {
                return $VB;
            } else {
                Errors.error($str_alt46$Can_t_assign_tag_to__a, word);
            }

        return NIL;
    }

    /**
     *
     *
     * @return listp; all verbs in LINKAGE
     */
    public static final SubLObject get_verbs(SubLObject v_linkage) {
        {
            SubLObject verbs = NIL;
            SubLObject cdotimes_end_var = methods.funcall_instance_method_with_0_args(v_linkage, LENGTH);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject word = methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, number_utilities.f_1X(i));
                    if (NIL != linkage.main_verb_link_word_p(word)) {
                        verbs = cons(word, verbs);
                    }
                }
            }
            return nreverse(verbs);
        }
    }

    /**
     *
     *
     * @return listp; all nouns heads in LINKAGE
     */
    public static final SubLObject get_noun_heads(SubLObject v_linkage) {
        {
            SubLObject nouns = NIL;
            SubLObject cdotimes_end_var = methods.funcall_instance_method_with_0_args(v_linkage, LENGTH);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject word = methods.funcall_instance_method_with_1_args(v_linkage, GET_WORD, number_utilities.f_1X(i));
                    if (NIL != noun_head_p(word)) {
                        nouns = cons(word, nouns);
                    }
                }
            }
            return nreverse(nouns);
        }
    }

    public static final SubLObject noun_head_p(SubLObject word) {
        return makeBoolean((((NIL != linkage.noun_link_word_p(word)) && (NIL == linkage.pronoun_link_word_p(word))) && (NIL == methods.funcall_instance_method_with_2_args(word, GET_DIRECTLY_RELATED, $AN_PATTERN, $RIGHT))) && (NIL == methods.funcall_instance_method_with_2_args(word, GET_DIRECTLY_RELATED, $G_PATTERN, $RIGHT)));
    }

    public static final SubLObject declare_noun_learner_file() {
        declareFunction("type_conjecture_based_on_usages_of_noun_with_verbs", "TYPE-CONJECTURE-BASED-ON-USAGES-OF-NOUN-WITH-VERBS", 2, 0, false);
        declareFunction("list_to_counts_dictionary", "LIST-TO-COUNTS-DICTIONARY", 1, 1, false);
        declareFunction("type_conjecture_fast_success_special_case", "TYPE-CONJECTURE-FAST-SUCCESS-SPECIAL-CASE", 2, 0, false);
        declareFunction("learn_unknown_nouns_from_sentence", "LEARN-UNKNOWN-NOUNS-FROM-SENTENCE", 1, 1, false);
        declareFunction("learn_unknown_nouns_from_parse_tree", "LEARN-UNKNOWN-NOUNS-FROM-PARSE-TREE", 1, 1, false);
        declareFunction("learn_unknown_nouns_single_sentence_int", "LEARN-UNKNOWN-NOUNS-SINGLE-SENTENCE-INT", 2, 0, false);
        declareFunction("learn_unknown_nouns_from_verb_argument_text_files", "LEARN-UNKNOWN-NOUNS-FROM-VERB-ARGUMENT-TEXT-FILES", 3, 4, false);
        declareFunction("learn_unknown_nouns_from_verb_argument_text_files_directory", "LEARN-UNKNOWN-NOUNS-FROM-VERB-ARGUMENT-TEXT-FILES-DIRECTORY", 1, 7, false);
        declareFunction("learn_unknown_nouns_from_sentencified_corpus", "LEARN-UNKNOWN-NOUNS-FROM-SENTENCIFIED-CORPUS", 1, 4, false);
        declareFunction("ensure_svo_initialized", "ENSURE-SVO-INITIALIZED", 0, 0, false);
        declareFunction("svo", "SVO", 1, 0, false);
        declareFunction("get_noun_record", "GET-NOUN-RECORD", 3, 0, false);
        declareFunction("get_noun_compound", "GET-NOUN-COMPOUND", 1, 0, false);
        declareFunction("assign_tag", "ASSIGN-TAG", 1, 0, false);
        declareFunction("get_verbs", "GET-VERBS", 1, 0, false);
        declareFunction("get_noun_heads", "GET-NOUN-HEADS", 1, 0, false);
        declareFunction("noun_head_p", "NOUN-HEAD-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_noun_learner_file() {
        defvar("*SVO-PARSER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_noun_learner_file() {
                return NIL;
    }













    static private final SubLString $str_alt6$_A____S = makeString("~A : ~S");

    static private final SubLList $list_alt7 = list(makeSymbol("VERB-SUBJECTS-LIST"), makeSymbol("VERB-OBJECTS-LIST"));

    private static final SubLSymbol COMPILE_RAW_DATA_FROM_VERBAL_MATCHES_LISTS = makeSymbol("COMPILE-RAW-DATA-FROM-VERBAL-MATCHES-LISTS");



    private static final SubLSymbol LEARNED_NOUNS = makeSymbol("LEARNED-NOUNS");

    static private final SubLString $str_alt11$_A_is_not_one_of__A = makeString("~A is not one of ~A");



    public static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol COMPILE_RAW_DATA_FROM_TEXT_FILES = makeSymbol("COMPILE-RAW-DATA-FROM-TEXT-FILES");

    private static final SubLSymbol PURGE_IRRELEVANT_NOUNS = makeSymbol("PURGE-IRRELEVANT-NOUNS");

    static private final SubLString $str_alt16$_subj = makeString(".subj");

    static private final SubLString $str_alt17$_obj = makeString(".obj");

    static private final SubLString $str_alt18$_compounds = makeString(".compounds");



    private static final SubLSymbol COMPILE_RAW_DATA_FROM_TEXT_FILES_DIRECTORY = makeSymbol("COMPILE-RAW-DATA-FROM-TEXT-FILES-DIRECTORY");



    static private final SubLString $str_alt22$Unable_to_open__S = makeString("Unable to open ~S");



    public static final SubLInteger $int$30 = makeInteger(30);



















    static private final SubLString $str_alt34$ = makeString("");

    static private final SubLString $str_alt35$_ = makeString("_");





    static private final SubLString $$$of = makeString("of");









    static private final SubLList $list_alt43 = list(makeKeyword("NN"), makeKeyword("NNS"));





    static private final SubLString $str_alt46$Can_t_assign_tag_to__a = makeString("Can't assign tag to ~a");











    // // Initializers
    public void declareFunctions() {
        declare_noun_learner_file();
    }

    public void initializeVariables() {
        init_noun_learner_file();
    }

    public void runTopLevelForms() {
        setup_noun_learner_file();
    }
}

