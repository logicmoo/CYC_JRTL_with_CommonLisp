/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      STRING-TYPING
 * source file: /cyc/top/cycl/string-typing.lisp
 * created:     2019/07/03 17:38:57
 */
public final class string_typing extends SubLTranslatedFile implements V12 {
    /**
     * types WORD0 as :INDIVIDUAL, :COLLECTION or :UNKNOWN using part-of-speech tagging
     */
    @LispMethod(comment = "types WORD0 as :INDIVIDUAL, :COLLECTION or :UNKNOWN using part-of-speech tagging")
    public static final SubLObject type_string_pos_tagging(SubLObject word0) {
        {
            SubLObject word = string_utilities.strip_punctuation(word0);
            SubLObject tags = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.string_typing.sentences_containing(word0, TEN_INTEGER);
            SubLObject sentence_string = NIL;
            for (sentence_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence_string = cdolist_list_var.first()) {
                {
                    SubLObject sentence = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(sentence_string, UNPROVIDED));
                    SubLObject vector_var = document.sentence_yield(sentence);
                    SubLObject backwardP_var = NIL;
                    SubLObject length = length(vector_var);
                    SubLObject v_iteration = NIL;
                    for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        {
                            SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                            SubLObject w = aref(vector_var, element_num);
                            if (NIL != Strings.stringE(word, document.word_string(w), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                tags = cons(document.word_category(w), tags);
                            }
                        }
                    }
                }
            }
            {
                SubLObject frequent = com.cyc.cycjava.cycl.string_typing.most_frequent(tags);
                SubLObject tag = (NIL != list_utilities.singletonP(frequent)) ? ((SubLObject) (frequent.first())) : NIL;
                SubLObject pcase_var = tag;
                if (pcase_var.eql($NNP)) {
                    return $INDIVIDUAL;
                } else {
                    if (pcase_var.eql($NNPS)) {
                        return $INDIVIDUAL;
                    } else {
                        if (pcase_var.eql($NN)) {
                            return $COLLECTION;
                        } else {
                            if (pcase_var.eql($NNS)) {
                                return $COLLECTION;
                            } else {
                                return $UNKNOWN;
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * types WORD as :INDIVIDUAL or :COLLECTION using web counts of singular and plural versions
     */
    @LispMethod(comment = "types WORD as :INDIVIDUAL or :COLLECTION using web counts of singular and plural versions")
    public static final SubLObject type_string_pluralize(SubLObject word) {
        if (NIL != com.cyc.cycjava.cycl.string_typing.singularP(word)) {
            return divide(number_utilities.f_1X(yahoo.yahoo_count_cached(string_utilities.quote_string(word, UNPROVIDED))), number_utilities.f_1X(yahoo.yahoo_count_cached(string_utilities.quote_string(com.cyc.cycjava.cycl.string_typing.plural_string(word, UNPROVIDED), UNPROVIDED)))).numL(TEN_INTEGER) ? ((SubLObject) ($COLLECTION)) : $INDIVIDUAL;
        } else {
            return divide(number_utilities.f_1X(yahoo.yahoo_count_cached(string_utilities.quote_string(morphology.singularize_string(word, UNPROVIDED), UNPROVIDED))), number_utilities.f_1X(yahoo.yahoo_count_cached(string_utilities.quote_string(word, UNPROVIDED)))).numL(TEN_INTEGER) ? ((SubLObject) ($COLLECTION)) : $INDIVIDUAL;
        }
    }

    /**
     * returns sentences from the web containing SEARCHSTRING
     */
    @LispMethod(comment = "returns sentences from the web containing SEARCHSTRING")
    public static final SubLObject sentences_containing(SubLObject searchstring, SubLObject hits) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(searchstring, STRINGP);
            {
                SubLObject sentences = NIL;
                SubLObject count = ZERO_INTEGER;
                SubLObject doneP = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject pattern = regular_expressions.compile_regular_expression(cconcatenate($str_alt35$_b, new SubLObject[]{ searchstring, $str_alt35$_b }), NIL);
                    SubLObject error_code = thread.secondMultipleValue();
                    SubLObject error_offset = thread.thirdMultipleValue();
                    SubLObject error_msg = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    try {
                        if (NIL == regular_expressions.regex_pattern_p(pattern)) {
                            Errors.error($str_alt36$Error__A___A__compiling_regular_e, new SubLObject[]{ error_code, error_msg, cconcatenate($str_alt35$_b, new SubLObject[]{ searchstring, $str_alt35$_b }), error_offset });
                        }
                        if (NIL == doneP) {
                            {
                                SubLObject csome_list_var = yahoo.yahoo_search(string_utilities.quote_string(searchstring, UNPROVIDED), ONE_INTEGER, multiply(hits, TWO_INTEGER), UNPROVIDED);
                                SubLObject record = NIL;
                                for (record = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , record = csome_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var = document.sentencify_string(fourth(record));
                                        SubLObject sentence = NIL;
                                        for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                                            if ((NIL == string_utilities.starts_with(sentence, $str_alt37$http_)) && (NIL != regular_expression_utilities.regex_matchP(pattern, sentence))) {
                                                sentences = cons(sentence, sentences);
                                            }
                                        }
                                    }
                                    doneP = numE(count, hits);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != regular_expressions.regex_pattern_p(pattern)) {
                                    regular_expressions.discard_regular_expression_pattern(pattern);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return com.cyc.cycjava.cycl.string_typing.random_sample(sentences, min(hits, length(sentences)));
            }
        }
    }

    public static final SubLFile me = new string_typing();

 public static final String myName = "com.cyc.cycjava.cycl.string_typing";


    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLSymbol $sym4$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol ORGANIZATION = makeSymbol("ORGANIZATION");

    private static final SubLSymbol LOCATION = makeSymbol("LOCATION");

    private static final SubLList $list17 = list(new SubLObject[]{ makeString("Mr"), makeString("Mrs"), makeString("Miss"), makeString("Ms"), makeString("Sir"), makeString("Prof"), makeString("Colonel"), makeString("General"), makeString("Lieutenant"), makeString("Captain"), makeString("Major"), makeString("Seargant"), makeString("President"), makeString("Lady") });









    private static final SubLList $list25 = list(makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("NNP"), $NNPS, makeKeyword("FW"), makeKeyword("VBG"));

    private static final SubLList $list26 = list(list(QUOTE, makeSymbol("PERSON")), list(QUOTE, makeSymbol("ORGANIZATION")), list(QUOTE, makeSymbol("LOCATION")), list(QUOTE, makeSymbol("DATE")));

    private static final SubLSymbol NEW_LINIFY = makeSymbol("NEW-LINIFY");

    private static final SubLString $$$lynx = makeString("lynx");

    private static final SubLString $str30$_dump = makeString("-dump");

    private static final SubLString $str31$number_of_sample_elements__a_exce = makeString("number of sample elements ~a exceeds list size ~a");



    // Definitions
    /**
     * returns :COLLECTION if WORD is a collection, :INDIVIDUAL if it is an individual, and
     * :UNKNOWN if the type of WORD can not be determined
     */
    @LispMethod(comment = "returns :COLLECTION if WORD is a collection, :INDIVIDUAL if it is an individual, and\r\n:UNKNOWN if the type of WORD can not be determined\nreturns :COLLECTION if WORD is a collection, :INDIVIDUAL if it is an individual, and\n:UNKNOWN if the type of WORD can not be determined")
    public static final SubLObject type_string_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, STRINGP);
        {
            SubLObject type = com.cyc.cycjava.cycl.string_typing.type_string_cyc(word);
            if (!type.eql($UNKNOWN)) {
                return type;
            }
            type = com.cyc.cycjava.cycl.string_typing.type_string_ner(word);
            if (!type.eql($UNKNOWN)) {
                return type;
            }
        }
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            if (NIL != com.cyc.cycjava.cycl.string_typing.phraseP(word)) {
                                {
                                    SubLObject head_word = com.cyc.cycjava.cycl.string_typing.get_np_head(word);
                                    if (NIL == string_utilities_lexical.every_word_starts_with_capitalP(word)) {
                                        if (NIL != com.cyc.cycjava.cycl.string_typing.head_only_admits_collectionsP(head_word, UNPROVIDED)) {
                                            return $COLLECTION;
                                        } else {
                                            return com.cyc.cycjava.cycl.string_typing.type_string_pluralize(word);
                                        }
                                    } else {
                                        {
                                            SubLObject type = com.cyc.cycjava.cycl.string_typing.type_string_cyc(head_word);
                                            if (type.eql($UNKNOWN)) {
                                                type = com.cyc.cycjava.cycl.string_typing.type_string_pos_tagging(head_word);
                                                if (type.eql($UNKNOWN)) {
                                                    return com.cyc.cycjava.cycl.string_typing.type_string_pluralize(word);
                                                } else {
                                                    return type;
                                                }
                                            } else {
                                                return type;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (NIL != string_utilities.lower_case_string_p(word)) {
                                    return com.cyc.cycjava.cycl.string_typing.type_string_pos_tagging(word);
                                } else {
                                    return com.cyc.cycjava.cycl.string_typing.type_string_pluralize(word);
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return $UNKNOWN;
    }

    // Definitions
    /**
     * returns :COLLECTION if WORD is a collection, :INDIVIDUAL if it is an individual, and
     * :UNKNOWN if the type of WORD can not be determined
     */
    @LispMethod(comment = "returns :COLLECTION if WORD is a collection, :INDIVIDUAL if it is an individual, and\r\n:UNKNOWN if the type of WORD can not be determined\nreturns :COLLECTION if WORD is a collection, :INDIVIDUAL if it is an individual, and\n:UNKNOWN if the type of WORD can not be determined")
    public static SubLObject type_string(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word) : "! stringp(word) " + ("Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) ") + word;
        SubLObject type = type_string_cyc(word);
        if (!type.eql($UNKNOWN)) {
            return type;
        }
        type = type_string_ner(word);
        if (!type.eql($UNKNOWN)) {
            return type;
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != phraseP(word)) {
                        final SubLObject head_word = get_np_head(word);
                        if (NIL != string_utilities_lexical.every_word_starts_with_capitalP(word)) {
                            final SubLObject type2 = type_string_cyc(head_word);
                            return type2;
                        }
                        if (NIL != head_only_admits_collectionsP(head_word, UNPROVIDED)) {
                            return $COLLECTION;
                        }
                        return $UNKNOWN;
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return $UNKNOWN;
    }

    /**
     * types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using a named entity recognizer
     */
    @LispMethod(comment = "types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using a named entity recognizer")
    public static final SubLObject type_string_ner_alt(SubLObject word) {
        {
            SubLObject ner = methods.funcall_class_method_with_0_args(STANFORD_NER, NEW);
            SubLObject named_entities = methods.funcall_instance_method_with_1_args(ner, RUN, word);
            if (NIL != list_utilities.singletonP(named_entities)) {
                {
                    SubLObject type = methods.funcall_instance_method_with_0_args(named_entities.first().first(), GET_TYPE);
                    SubLObject pcase_var = type;
                    if (pcase_var.eql(QUOTE) || pcase_var.eql(PERSON)) {
                        return $INDIVIDUAL;
                    } else {
                        if (pcase_var.eql(QUOTE) || pcase_var.eql(ORGANIZATION)) {
                            return $INDIVIDUAL;
                        } else {
                            if (pcase_var.eql(QUOTE) || pcase_var.eql(LOCATION)) {
                                return $INDIVIDUAL;
                            } else {
                                if (pcase_var.eql(QUOTE) || pcase_var.eql(DATE)) {
                                    return $INDIVIDUAL;
                                } else {
                                    return $UNKNOWN;
                                }
                            }
                        }
                    }
                }
            } else {
                if (((NIL != list_utilities.doubletonP(named_entities)) && methods.funcall_instance_method_with_0_args(second(named_entities).first(), GET_TYPE).eql(PERSON)) && (NIL != member(methods.funcall_instance_method_with_0_args(named_entities.first().first(), GET_STRING), $list_alt21, EQUALP, UNPROVIDED))) {
                    return $INDIVIDUAL;
                } else {
                    return $UNKNOWN;
                }
            }
        }
    }

    @LispMethod(comment = "types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using a named entity recognizer")
    public static SubLObject type_string_ner(final SubLObject word) {
        final SubLObject ner = methods.funcall_class_method_with_0_args(STANFORD_NER, NEW);
        final SubLObject named_entities = methods.funcall_instance_method_with_1_args(ner, RUN, word);
        if (NIL != list_utilities.singletonP(named_entities)) {
            final SubLObject pcase_var;
            final SubLObject type = pcase_var = methods.funcall_instance_method_with_0_args(named_entities.first().first(), GET_TYPE);
            if (pcase_var.eql(QUOTE) || pcase_var.eql(PERSON)) {
                return $INDIVIDUAL;
            }
            if (pcase_var.eql(QUOTE) || pcase_var.eql(ORGANIZATION)) {
                return $INDIVIDUAL;
            }
            if (pcase_var.eql(QUOTE) || pcase_var.eql(LOCATION)) {
                return $INDIVIDUAL;
            }
            if (pcase_var.eql(QUOTE) || pcase_var.eql(DATE)) {
                return $INDIVIDUAL;
            }
            return $UNKNOWN;
        } else {
            if (((NIL != list_utilities.doubletonP(named_entities)) && methods.funcall_instance_method_with_0_args(second(named_entities).first(), GET_TYPE).eql(PERSON)) && (NIL != member(methods.funcall_instance_method_with_0_args(named_entities.first().first(), GET_STRING), $list17, EQUALP, UNPROVIDED))) {
                return $INDIVIDUAL;
            }
            return $UNKNOWN;
        }
    }/**
     * types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using a named entity recognizer
     */


    /**
     * types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using Cyc
     */
    @LispMethod(comment = "types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using Cyc")
    public static final SubLObject type_string_cyc_alt(SubLObject word) {
        {
            SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
            SubLObject types = NIL;
            SubLObject denot = NIL;
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, word);
            SubLObject lex = NIL;
            for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                if (NIL != fort_types_interface.collection_in_any_mtP(denot)) {
                    types = cons($COLLECTION, types);
                } else {
                    if (NIL != fort_types_interface.functorP(denot)) {
                    } else {
                        if (NIL != fort_types_interface.predicateP(denot)) {
                        } else {
                            if (NIL != kb_accessors.individualP(denot)) {
                                types = cons($INDIVIDUAL, types);
                            }
                        }
                    }
                }
            }
            if (NIL != types) {
                {
                    SubLObject frequent = com.cyc.cycjava.cycl.string_typing.most_frequent(types);
                    SubLObject tag = (NIL != list_utilities.singletonP(frequent)) ? ((SubLObject) (frequent.first())) : $UNKNOWN;
                    return tag;
                }
            } else {
                return $UNKNOWN;
            }
        }
    }

    @LispMethod(comment = "types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using Cyc")
    public static SubLObject type_string_cyc(final SubLObject word) {
        final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
        SubLObject types = NIL;
        SubLObject denot = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, word);
        SubLObject lex = NIL;
        lex = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
            if (NIL != fort_types_interface.collection_in_any_mtP(denot)) {
                types = cons($COLLECTION, types);
            } else
                if (NIL == fort_types_interface.functorP(denot)) {
                    if (NIL == fort_types_interface.predicateP(denot)) {
                        if (NIL != kb_accessors.individualP(denot)) {
                            types = cons($INDIVIDUAL, types);
                        }
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            lex = cdolist_list_var.first();
        } 
        if (NIL != types) {
            final SubLObject frequent = most_frequent(types);
            final SubLObject tag = (NIL != list_utilities.singletonP(frequent)) ? frequent.first() : $UNKNOWN;
            return tag;
        }
        return $UNKNOWN;
    }/**
     * types WORD as :INDIVIDUAL, :COLLECTION or :UNKNOWN, using Cyc
     */


    /**
     * When HEAD is used as the head of string, does that string 'necessarily' denote a collection?
     * For example, anything that ends in 'disease' almost certainly denotes a collection of disease, as
     * opposed to an #$Individual disease.
     */
    @LispMethod(comment = "When HEAD is used as the head of string, does that string \'necessarily\' denote a collection?\r\nFor example, anything that ends in \'disease\' almost certainly denotes a collection of disease, as\r\nopposed to an #$Individual disease.\nWhen HEAD is used as the head of string, does that string \'necessarily\' denote a collection?\nFor example, anything that ends in \'disease\' almost certainly denotes a collection of disease, as\nopposed to an #$Individual disease.")
    public static final SubLObject head_only_admits_collectionsP_alt(SubLObject head, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        {
            SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
            SubLObject denot = NIL;
            SubLObject value_set = T;
            SubLObject allows_individualsP = NIL;
            SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lexicon, GET, head);
            if (NIL == lex_entries) {
                return NIL;
            }
            if (NIL == allows_individualsP) {
                {
                    SubLObject csome_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, head);
                    SubLObject lex = NIL;
                    for (lex = csome_list_var.first(); !((NIL != allows_individualsP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lex = csome_list_var.first()) {
                        denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                        if (!((NIL != builder_utilities.higher_order_collectionP(denot)) || (NIL != com.cyc.cycjava.cycl.string_typing.dont_make_instancesP(denot, mt)))) {
                            allows_individualsP = T;
                        }
                    }
                }
            }
            return NIL != value_set ? ((SubLObject) (makeBoolean(NIL == allows_individualsP))) : NIL;
        }
    }

    @LispMethod(comment = "When HEAD is used as the head of string, does that string \'necessarily\' denote a collection?\r\nFor example, anything that ends in \'disease\' almost certainly denotes a collection of disease, as\r\nopposed to an #$Individual disease.\nWhen HEAD is used as the head of string, does that string \'necessarily\' denote a collection?\nFor example, anything that ends in \'disease\' almost certainly denotes a collection of disease, as\nopposed to an #$Individual disease.")
    public static SubLObject head_only_admits_collectionsP(final SubLObject head, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLObject lexicon = term_lexicon.new_case_sensitivity_preferred_term_lexicon();
        SubLObject denot = NIL;
        final SubLObject value_set = T;
        SubLObject allows_individualsP = NIL;
        final SubLObject lex_entries = methods.funcall_instance_method_with_1_args(lexicon, GET, head);
        if (NIL == lex_entries) {
            return NIL;
        }
        if (NIL == allows_individualsP) {
            SubLObject csome_list_var = methods.funcall_instance_method_with_1_args(lexicon, GET, head);
            SubLObject lex = NIL;
            lex = csome_list_var.first();
            while ((NIL == allows_individualsP) && (NIL != csome_list_var)) {
                denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                if ((NIL == builder_utilities.higher_order_collectionP(denot)) && (NIL == dont_make_instancesP(denot, mt))) {
                    allows_individualsP = T;
                }
                csome_list_var = csome_list_var.rest();
                lex = csome_list_var.first();
            } 
        }
        return NIL != value_set ? makeBoolean(NIL == allows_individualsP) : NIL;
    }/**
     * When HEAD is used as the head of string, does that string 'necessarily' denote a collection?
     * For example, anything that ends in 'disease' almost certainly denotes a collection of disease, as
     * opposed to an #$Individual disease.
     */


    public static final SubLObject dont_make_instancesP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return ask_utilities.query_boolean(list($$or, list($$noNotableInstances, v_term), list($$instancesDontNeedLexification, v_term)), mt, UNPROVIDED);
    }

    public static SubLObject dont_make_instancesP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return ask_utilities.query_boolean(list($$or, list($$noNotableInstances, v_term), list($$instancesDontNeedLexification, v_term)), mt, UNPROVIDED);
    }

    /**
     * returns t iff WORD is a compound phrase
     */
    @LispMethod(comment = "returns t iff WORD is a compound phrase")
    public static final SubLObject phraseP_alt(SubLObject word) {
        return numG(length(string_utilities.split_string(word, UNPROVIDED)), ONE_INTEGER);
    }

    @LispMethod(comment = "returns t iff WORD is a compound phrase")
    public static SubLObject phraseP(final SubLObject word) {
        return numG(length(string_utilities.split_string(word, UNPROVIDED)), ONE_INTEGER);
    }/**
     * returns t iff WORD is a compound phrase
     */


    /**
     * returns the head of the NP PHRASE as a string
     */
    @LispMethod(comment = "returns the head of the NP PHRASE as a string")
    public static final SubLObject get_np_head_alt(SubLObject phrase) {
        {
            SubLObject head = com.cyc.cycjava.cycl.string_typing.get_np_head_tagged(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(phrase, UNPROVIDED)));
            return NIL != head ? ((SubLObject) (document.word_string(head))) : last(string_utilities.split_string(phrase, UNPROVIDED), UNPROVIDED).first();
        }
    }

    @LispMethod(comment = "returns the head of the NP PHRASE as a string")
    public static SubLObject get_np_head(final SubLObject phrase) {
        final SubLObject head = get_np_head_tagged(pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(phrase, UNPROVIDED)));
        return NIL != head ? document.word_string(head) : last(string_utilities.split_string(phrase, UNPROVIDED), UNPROVIDED).first();
    }/**
     * returns the head of the NP PHRASE as a string
     */


    /**
     * returns the head of the NP TAGGED (a tagged sentence object) as a word object
     */
    @LispMethod(comment = "returns the head of the NP TAGGED (a tagged sentence object) as a word object")
    public static final SubLObject get_np_head_tagged_alt(SubLObject tagged) {
        {
            SubLObject nouns = NIL;
            SubLObject vector_var = document.sentence_yield(tagged);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    SubLObject cat = document.word_category(word);
                    if ((NIL != nouns) && cat.eql($IN)) {
                        return nouns.first();
                    }
                    if (NIL != member(cat, $list_alt29, UNPROVIDED, UNPROVIDED)) {
                        nouns = cons(word, nouns);
                    }
                }
            }
            return nouns.first();
        }
    }

    @LispMethod(comment = "returns the head of the NP TAGGED (a tagged sentence object) as a word object")
    public static SubLObject get_np_head_tagged(final SubLObject tagged) {
        SubLObject nouns = NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(tagged);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cat = document.word_category(word);
            if ((NIL != nouns) && cat.eql($IN)) {
                return nouns.first();
            }
            if (NIL != member(cat, $list25, UNPROVIDED, UNPROVIDED)) {
                nouns = cons(word, nouns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return nouns.first();
    }/**
     * returns the head of the NP TAGGED (a tagged sentence object) as a word object
     */


    /**
     * returns t iff WORD is singular
     */
    @LispMethod(comment = "returns t iff WORD is singular")
    public static final SubLObject singularP_alt(SubLObject word) {
        {
            SubLObject ne = methods.funcall_instance_method_with_1_args(methods.funcall_class_method_with_0_args(STANFORD_NER, NEW), RUN, word).first().first();
            if (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(ne, GET_TYPE), $list_alt30, UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        {
            SubLObject tokens = string_utilities.split_string(word, UNPROVIDED);
            SubLObject head = (NIL != list_utilities.lengthE(tokens, ONE_INTEGER, UNPROVIDED)) ? ((SubLObject) (word)) : com.cyc.cycjava.cycl.string_typing.get_np_head(word);
            return equalp(head, morphology.singularize_string(head, UNPROVIDED));
        }
    }

    @LispMethod(comment = "returns t iff WORD is singular")
    public static SubLObject singularP(final SubLObject word) {
        final SubLObject ne = methods.funcall_instance_method_with_1_args(methods.funcall_class_method_with_0_args(STANFORD_NER, NEW), RUN, word).first().first();
        if (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(ne, GET_TYPE), $list26, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        final SubLObject tokens = string_utilities.split_string(word, UNPROVIDED);
        final SubLObject head = (NIL != list_utilities.lengthE(tokens, ONE_INTEGER, UNPROVIDED)) ? word : get_np_head(word);
        return equalp(head, morphology.singularize_string(head, UNPROVIDED));
    }/**
     * returns t iff WORD is singular
     */


    /**
     *
     *
     * @param URL
    string
     * 		
     * @return stringp; the webpage at URL as a string
     */
    @LispMethod(comment = "@param URL\nstring\r\n\t\t\r\n@return stringp; the webpage at URL as a string")
    public static final SubLObject lynx_alt(SubLObject url) {
        SubLTrampolineFile.checkType(url, STRINGP);
        return apply(CCONCATENATE, Mapping.mapcar(NEW_LINIFY, os_process_utilities.os_process_evaluation_output_strings($$$lynx, list($str_alt34$_dump, url), UNPROVIDED, UNPROVIDED)));
    }

    /**
     *
     *
     * @param URL
    string
     * 		
     * @return stringp; the webpage at URL as a string
     */
    @LispMethod(comment = "@param URL\nstring\r\n\t\t\r\n@return stringp; the webpage at URL as a string")
    public static SubLObject lynx(final SubLObject url) {
        assert NIL != stringp(url) : "! stringp(url) " + ("Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) ") + url;
        return apply(CCONCATENATE, Mapping.mapcar(NEW_LINIFY, os_process_utilities.os_process_evaluation_output_strings($$$lynx, list($str30$_dump, url), UNPROVIDED, UNPROVIDED)));
    }

    /**
     * appends a newline at the end of STRING
     */
    @LispMethod(comment = "appends a newline at the end of STRING")
    public static final SubLObject new_linify_alt(SubLObject string) {
        return cconcatenate(string, string_utilities.$new_line_string$.getGlobalValue());
    }

    @LispMethod(comment = "appends a newline at the end of STRING")
    public static SubLObject new_linify(final SubLObject string) {
        return cconcatenate(string, string_utilities.$new_line_string$.getGlobalValue());
    }/**
     * appends a newline at the end of STRING
     */


    /**
     * returns a list of N random elements from ELEMENTS
     */
    @LispMethod(comment = "returns a list of N random elements from ELEMENTS")
    public static final SubLObject random_sample_alt(SubLObject elements, SubLObject n) {
        {
            SubLObject size = length(elements);
            if (n.numG(size)) {
                Errors.error($str_alt38$number_of_sample_elements__a_exce, n, size);
            }
            {
                SubLObject sample = NIL;
                SubLObject member = NIL;
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                    member = nth(random.random(length(elements)), elements);
                    sample = cons(member, sample);
                    delete(member, elements, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return sample;
            }
        }
    }

    @LispMethod(comment = "returns a list of N random elements from ELEMENTS")
    public static SubLObject random_sample(final SubLObject elements, final SubLObject n) {
        final SubLObject size = length(elements);
        if (n.numG(size)) {
            Errors.error($str31$number_of_sample_elements__a_exce, n, size);
        }
        SubLObject sample = NIL;
        SubLObject member = NIL;
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
            member = nth(random.random(length(elements)), elements);
            sample = cons(member, sample);
            delete(member, elements, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return sample;
    }/**
     * returns a list of N random elements from ELEMENTS
     */


    /**
     * returns a list of the most frequent elements of ELEMENTS
     */
    @LispMethod(comment = "returns a list of the most frequent elements of ELEMENTS")
    public static final SubLObject most_frequent_alt(SubLObject elements) {
        {
            SubLObject counts = NIL;
            {
                SubLObject cdolist_list_var = elements;
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    {
                        SubLObject old_entry = assoc(element, counts, UNPROVIDED, UNPROVIDED);
                        if (NIL == old_entry) {
                            old_entry = cons(element, ZERO_INTEGER);
                            counts = cons(old_entry, counts);
                        }
                        rplacd(old_entry, number_utilities.f_1X(old_entry.rest()));
                    }
                }
            }
            {
                SubLObject max = ZERO_INTEGER;
                SubLObject max_elements = NIL;
                {
                    SubLObject cdolist_list_var = counts;
                    SubLObject entry = NIL;
                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                        if (entry.rest().numG(max)) {
                            max = entry.rest();
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = counts;
                    SubLObject entry = NIL;
                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                        if (entry.rest().numE(max)) {
                            max_elements = cons(entry.first(), max_elements);
                        }
                    }
                }
                return max_elements;
            }
        }
    }

    @LispMethod(comment = "returns a list of the most frequent elements of ELEMENTS")
    public static SubLObject most_frequent(final SubLObject elements) {
        SubLObject counts = NIL;
        SubLObject cdolist_list_var = elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject old_entry = assoc(element, counts, UNPROVIDED, UNPROVIDED);
            if (NIL == old_entry) {
                old_entry = cons(element, ZERO_INTEGER);
                counts = cons(old_entry, counts);
            }
            rplacd(old_entry, number_utilities.f_1X(old_entry.rest()));
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        SubLObject max = ZERO_INTEGER;
        SubLObject max_elements = NIL;
        SubLObject cdolist_list_var2 = counts;
        SubLObject entry = NIL;
        entry = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (entry.rest().numG(max)) {
                max = entry.rest();
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = counts;
        entry = NIL;
        entry = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (entry.rest().numE(max)) {
                max_elements = cons(entry.first(), max_elements);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            entry = cdolist_list_var2.first();
        } 
        return max_elements;
    }/**
     * returns a list of the most frequent elements of ELEMENTS
     */


    /**
     * Return the best guess at a plural form for STRING.
     *
     * @param mt;
     * 		the microtheory to look from.
     */
    @LispMethod(comment = "Return the best guess at a plural form for STRING.\r\n\r\n@param mt;\r\n\t\tthe microtheory to look from.")
    public static final SubLObject plural_string_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        {
            SubLObject ans = morphology.pluralize_string_wXlexicon(string, mt);
            if (NIL == ans) {
                {
                    SubLObject tagged = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, UNPROVIDED));
                    SubLObject head = com.cyc.cycjava.cycl.string_typing.get_np_head_tagged(tagged);
                    SubLObject words = document.sentence_yield(tagged);
                    if (NIL == head) {
                        head = vector_utilities.last_aref(words);
                    }
                    {
                        SubLObject plural_head = morphology.pluralize_string_wXlexicon(document.word_string(head), mt);
                        if (NIL == plural_head) {
                            plural_head = morphology.plural_reg(document.word_string(head));
                        }
                        document.set_word_string(head, plural_head);
                        ans = com.cyc.cycjava.cycl.string_typing.sentence_compute_string(tagged);
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Return the best guess at a plural form for STRING.\r\n\r\n@param mt;\r\n\t\tthe microtheory to look from.")
    public static SubLObject plural_string(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        SubLObject ans = morphology.pluralize_string_wXlexicon(string, mt);
        if (NIL == ans) {
            final SubLObject tagged = pos_tagger.tagger_tag_sentence(pos_tagger.get_tagger(), document.new_sentence(string, UNPROVIDED));
            SubLObject head = get_np_head_tagged(tagged);
            final SubLObject words = document.sentence_yield(tagged);
            if (NIL == head) {
                head = vector_utilities.last_aref(words);
            }
            SubLObject plural_head = morphology.pluralize_string_wXlexicon(document.word_string(head), mt);
            if (NIL == plural_head) {
                plural_head = morphology.plural_reg(document.word_string(head));
            }
            document.set_word_string(head, plural_head);
            ans = sentence_compute_string(tagged);
        }
        return ans;
    }/**
     * Return the best guess at a plural form for STRING.
     *
     * @param mt;
     * 		the microtheory to look from.
     */


    /**
     * returns the string of sentence object SENTENCE
     */
    @LispMethod(comment = "returns the string of sentence object SENTENCE")
    public static final SubLObject sentence_compute_string_alt(SubLObject sentence) {
        {
            SubLObject strings = NIL;
            SubLObject vector_var = document.sentence_yield(sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject word = aref(vector_var, element_num);
                    strings = cons(document.word_string(word), strings);
                }
            }
            return string_utilities.bunge(nreverse(strings), UNPROVIDED);
        }
    }

    @LispMethod(comment = "returns the string of sentence object SENTENCE")
    public static SubLObject sentence_compute_string(final SubLObject sentence) {
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = document.sentence_yield_exhaustive(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            strings = cons(document.word_string(word), strings);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return string_utilities.bunge(nreverse(strings), UNPROVIDED);
    }/**
     * returns the string of sentence object SENTENCE
     */


    public static final SubLObject declare_string_typing_file_alt() {
        declareFunction("type_string", "TYPE-STRING", 1, 0, false);
        declareFunction("type_string_pluralize", "TYPE-STRING-PLURALIZE", 1, 0, false);
        declareFunction("type_string_pos_tagging", "TYPE-STRING-POS-TAGGING", 1, 0, false);
        declareFunction("type_string_ner", "TYPE-STRING-NER", 1, 0, false);
        declareFunction("type_string_cyc", "TYPE-STRING-CYC", 1, 0, false);
        declareFunction("head_only_admits_collectionsP", "HEAD-ONLY-ADMITS-COLLECTIONS?", 1, 1, false);
        declareFunction("dont_make_instancesP", "DONT-MAKE-INSTANCES?", 1, 1, false);
        declareFunction("phraseP", "PHRASE?", 1, 0, false);
        declareFunction("get_np_head", "GET-NP-HEAD", 1, 0, false);
        declareFunction("get_np_head_tagged", "GET-NP-HEAD-TAGGED", 1, 0, false);
        declareFunction("singularP", "SINGULAR?", 1, 0, false);
        declareFunction("lynx", "LYNX", 1, 0, false);
        declareFunction("new_linify", "NEW-LINIFY", 1, 0, false);
        declareFunction("sentences_containing", "SENTENCES-CONTAINING", 2, 0, false);
        declareFunction("random_sample", "RANDOM-SAMPLE", 2, 0, false);
        declareFunction("most_frequent", "MOST-FREQUENT", 1, 0, false);
        declareFunction("plural_string", "PLURAL-STRING", 1, 1, false);
        declareFunction("sentence_compute_string", "SENTENCE-COMPUTE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_string_typing_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("type_string", "TYPE-STRING", 1, 0, false);
            declareFunction("type_string_ner", "TYPE-STRING-NER", 1, 0, false);
            declareFunction("type_string_cyc", "TYPE-STRING-CYC", 1, 0, false);
            declareFunction("head_only_admits_collectionsP", "HEAD-ONLY-ADMITS-COLLECTIONS?", 1, 1, false);
            declareFunction("dont_make_instancesP", "DONT-MAKE-INSTANCES?", 1, 1, false);
            declareFunction("phraseP", "PHRASE?", 1, 0, false);
            declareFunction("get_np_head", "GET-NP-HEAD", 1, 0, false);
            declareFunction("get_np_head_tagged", "GET-NP-HEAD-TAGGED", 1, 0, false);
            declareFunction("singularP", "SINGULAR?", 1, 0, false);
            declareFunction("lynx", "LYNX", 1, 0, false);
            declareFunction("new_linify", "NEW-LINIFY", 1, 0, false);
            declareFunction("random_sample", "RANDOM-SAMPLE", 2, 0, false);
            declareFunction("most_frequent", "MOST-FREQUENT", 1, 0, false);
            declareFunction("plural_string", "PLURAL-STRING", 1, 1, false);
            declareFunction("sentence_compute_string", "SENTENCE-COMPUTE-STRING", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("type_string_pluralize", "TYPE-STRING-PLURALIZE", 1, 0, false);
            declareFunction("type_string_pos_tagging", "TYPE-STRING-POS-TAGGING", 1, 0, false);
            declareFunction("sentences_containing", "SENTENCES-CONTAINING", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_string_typing_file_Previous() {
        declareFunction("type_string", "TYPE-STRING", 1, 0, false);
        declareFunction("type_string_ner", "TYPE-STRING-NER", 1, 0, false);
        declareFunction("type_string_cyc", "TYPE-STRING-CYC", 1, 0, false);
        declareFunction("head_only_admits_collectionsP", "HEAD-ONLY-ADMITS-COLLECTIONS?", 1, 1, false);
        declareFunction("dont_make_instancesP", "DONT-MAKE-INSTANCES?", 1, 1, false);
        declareFunction("phraseP", "PHRASE?", 1, 0, false);
        declareFunction("get_np_head", "GET-NP-HEAD", 1, 0, false);
        declareFunction("get_np_head_tagged", "GET-NP-HEAD-TAGGED", 1, 0, false);
        declareFunction("singularP", "SINGULAR?", 1, 0, false);
        declareFunction("lynx", "LYNX", 1, 0, false);
        declareFunction("new_linify", "NEW-LINIFY", 1, 0, false);
        declareFunction("random_sample", "RANDOM-SAMPLE", 2, 0, false);
        declareFunction("most_frequent", "MOST-FREQUENT", 1, 0, false);
        declareFunction("plural_string", "PLURAL-STRING", 1, 1, false);
        declareFunction("sentence_compute_string", "SENTENCE-COMPUTE-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_string_typing_file() {
        return NIL;
    }

    public static SubLObject setup_string_typing_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_string_typing_file();
    }

    @Override
    public void initializeVariables() {
        init_string_typing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_string_typing_file();
    }

    static {
    }

    static private final SubLList $list_alt21 = list(new SubLObject[]{ makeString("Mr"), makeString("Mrs"), makeString("Miss"), makeString("Ms"), makeString("Sir"), makeString("Prof"), makeString("Colonel"), makeString("General"), makeString("Lieutenant"), makeString("Captain"), makeString("Major"), makeString("Seargant"), makeString("President"), makeString("Lady") });

    static private final SubLList $list_alt29 = list(makeKeyword("NN"), makeKeyword("NNS"), makeKeyword("NNP"), $NNPS, makeKeyword("FW"), makeKeyword("VBG"));

    static private final SubLList $list_alt30 = list(list(QUOTE, makeSymbol("PERSON")), list(QUOTE, makeSymbol("ORGANIZATION")), list(QUOTE, makeSymbol("LOCATION")), list(QUOTE, makeSymbol("DATE")));

    static private final SubLString $str_alt34$_dump = makeString("-dump");

    static private final SubLString $str_alt35$_b = makeString("\\b");

    static private final SubLString $str_alt36$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

    static private final SubLString $str_alt37$http_ = makeString("http:");

    static private final SubLString $str_alt38$number_of_sample_elements__a_exce = makeString("number of sample elements ~a exceeds list size ~a");
}

/**
 * Total time: 207 ms
 */
