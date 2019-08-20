/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class relationship_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new relationship_question();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RELATIONSHIP_QUESTION = makeSymbol("RELATIONSHIP-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("WORD-GRAPH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INFORMATION-EXTRACTION-GRAPH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol INFORMATION_EXTRACTION_GRAPH = makeSymbol("INFORMATION-EXTRACTION-GRAPH");

    private static final SubLSymbol WORD_GRAPH = makeSymbol("WORD-GRAPH");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-INSTANCE");

    static private final SubLSymbol $sym25$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list26 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list27 = list(makeSymbol("TREE"));

    static private final SubLList $list28 = list(makeString("@return boolean; t if TREE is a relationship question, nil otherwise"), list(makeSymbol("CLET"), list(makeSymbol("WHAT-FLAG"), makeSymbol("REL-FLAG"), makeSymbol("DONE")), list(makeSymbol("CSOME"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("YIELD"))), makeSymbol("DONE")), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-STRING"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-STRING"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), makeSymbol("WORD-STRING"), list(QUOTE, list(makeString("what"), makeString("which"))), list(makeSymbol("FUNCTION"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("WHAT-FLAG"), T)), list(list(makeSymbol("CAND"), list(makeSymbol("RELATIONSHIP-STRING-P"), makeSymbol("WORD-STRING")), makeSymbol("WHAT-FLAG")), list(makeSymbol("CSETQ"), makeSymbol("REL-FLAG"), T)), list(list(makeSymbol("CAND"), list(EQUALP, makeSymbol("WORD-STRING"), makeString("between")), makeSymbol("REL-FLAG")), list(makeSymbol("CSETQ"), makeSymbol("DONE"), T)), list(list(EQUALP, makeSymbol("WORD-STRING"), makeString("common")), list(makeSymbol("CSETQ"), makeSymbol("DONE"), T))))), list(RET, makeSymbol("DONE"))));

    static private final SubLList $list30 = list(makeString("what"), makeString("which"));

    static private final SubLString $$$between = makeString("between");

    static private final SubLString $$$common = makeString("common");

    static private final SubLSymbol $sym34$RELATIONSHIP_QUESTION_ISA__METHOD = makeSymbol("RELATIONSHIP-QUESTION-ISA?-METHOD");

    static private final SubLList $list35 = list(makeString("relationship"), makeString("connection"), makeString("link"), makeString("nexus"), makeString("tie"), makeString("tied"));

    static private final SubLList $list37 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("CONTENT-TERMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYSTRINGS")))), list(makeSymbol("PUNLESS"), list(makeSymbol("RELATIONSHIP-STRING-P"), makeSymbol("TERM")), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("CONTENT-TERMS")))), list(makeSymbol("PUNLESS"), makeSymbol("CONTENT-TERMS"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL), list(makeSymbol("CONTENT-STRING"), list(makeSymbol("BUNGE"), makeSymbol("CONTENT-TERMS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTATION-TERMS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("QUESTION")), list(QUOTE, makeSymbol("AUGMENT-TERMS")), makeSymbol("CONTENT-TERMS"), makeSymbol("CORPUS"))), list(makeSymbol("QUERY"), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), THREE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("QUERY"), list(makeSymbol("CCONCATENATE"), makeSymbol("CONTENT-STRING"), makeString(" "), makeSymbol("QUERY")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LEMUR-QUERY"), makeSymbol("QUERY"), makeSymbol("CORPUS")), makeSymbol("QUERIES")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("QUERIES"))))));

    static private final SubLSymbol $sym38$OUTER_CATCH_FOR_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");

    static private final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol QUESTION_QUERIFY_METHOD = makeSymbol("QUESTION-QUERIFY-METHOD");

    static private final SubLList $list44 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list45 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-SENTENCE-ANSWER"), makeSymbol("SELF"), makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-SCORE")))))));

    private static final SubLSymbol QUESTION_EXTRACT_METHOD = makeSymbol("QUESTION-EXTRACT-METHOD");

    static private final SubLList $list49 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, TEN_INTEGER));

    private static final SubLSymbol QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("QUESTION-ANSWER-CARDINALITY-METHOD");

    // Definitions
    public static final SubLObject get_relationship_question_information_extraction_graph_alt(SubLObject v_relationship_question) {
        return classes.subloop_get_access_protected_instance_slot(v_relationship_question, EIGHT_INTEGER, INFORMATION_EXTRACTION_GRAPH);
    }

    // Definitions
    public static SubLObject get_relationship_question_information_extraction_graph(final SubLObject v_relationship_question) {
        return classes.subloop_get_access_protected_instance_slot(v_relationship_question, EIGHT_INTEGER, INFORMATION_EXTRACTION_GRAPH);
    }

    public static final SubLObject set_relationship_question_information_extraction_graph_alt(SubLObject v_relationship_question, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_relationship_question, value, EIGHT_INTEGER, INFORMATION_EXTRACTION_GRAPH);
    }

    public static SubLObject set_relationship_question_information_extraction_graph(final SubLObject v_relationship_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_relationship_question, value, EIGHT_INTEGER, INFORMATION_EXTRACTION_GRAPH);
    }

    public static final SubLObject get_relationship_question_word_graph_alt(SubLObject v_relationship_question) {
        return classes.subloop_get_access_protected_instance_slot(v_relationship_question, SEVEN_INTEGER, WORD_GRAPH);
    }

    public static SubLObject get_relationship_question_word_graph(final SubLObject v_relationship_question) {
        return classes.subloop_get_access_protected_instance_slot(v_relationship_question, SEVEN_INTEGER, WORD_GRAPH);
    }

    public static final SubLObject set_relationship_question_word_graph_alt(SubLObject v_relationship_question, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_relationship_question, value, SEVEN_INTEGER, WORD_GRAPH);
    }

    public static SubLObject set_relationship_question_word_graph(final SubLObject v_relationship_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_relationship_question, value, SEVEN_INTEGER, WORD_GRAPH);
    }

    public static final SubLObject subloop_reserved_initialize_relationship_question_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, TAGGER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CHUNKER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CANDIDATES, TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CONFIDENCE, TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEARNABLE_TYPES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_relationship_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, TAGGER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CHUNKER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CANDIDATES, TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CONFIDENCE, TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEARNABLE_TYPES, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_relationship_question_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        classes.subloop_initialize_slot(new_instance, RELATIONSHIP_QUESTION, WORD_GRAPH, NIL);
        classes.subloop_initialize_slot(new_instance, RELATIONSHIP_QUESTION, INFORMATION_EXTRACTION_GRAPH, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_relationship_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        classes.subloop_initialize_slot(new_instance, RELATIONSHIP_QUESTION, WORD_GRAPH, NIL);
        classes.subloop_initialize_slot(new_instance, RELATIONSHIP_QUESTION, INFORMATION_EXTRACTION_GRAPH, NIL);
        return NIL;
    }

    public static final SubLObject relationship_question_p_alt(SubLObject v_relationship_question) {
        return classes.subloop_instanceof_class(v_relationship_question, RELATIONSHIP_QUESTION);
    }

    public static SubLObject relationship_question_p(final SubLObject v_relationship_question) {
        return classes.subloop_instanceof_class(v_relationship_question, RELATIONSHIP_QUESTION);
    }

    /**
     *
     *
     * @return boolean; t if TREE is a relationship question, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if TREE is a relationship question, nil otherwise")
    public static final SubLObject relationship_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        {
            SubLObject what_flag = NIL;
            SubLObject rel_flag = NIL;
            SubLObject done = NIL;
            if (NIL == done) {
                {
                    SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(tree, YIELD);
                    SubLObject word = NIL;
                    for (word = csome_list_var.first(); !((NIL != done) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                        {
                            SubLObject word_string = methods.funcall_instance_method_with_0_args(word, GET_STRING);
                            if (NIL != member(word_string, $list_alt30, symbol_function(EQUALP), UNPROVIDED)) {
                                what_flag = T;
                            } else {
                                if ((NIL != com.cyc.cycjava.cycl.quirk.relationship_question.relationship_string_p(word_string)) && (NIL != what_flag)) {
                                    rel_flag = T;
                                } else {
                                    if (word_string.equalp($$$between) && (NIL != rel_flag)) {
                                        done = T;
                                    } else {
                                        if (word_string.equalp($$$common)) {
                                            done = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return done;
        }
    }

    /**
     *
     *
     * @return boolean; t if TREE is a relationship question, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if TREE is a relationship question, nil otherwise")
    public static SubLObject relationship_question_isaP_method(final SubLObject self, final SubLObject tree) {
        SubLObject what_flag = NIL;
        SubLObject rel_flag = NIL;
        SubLObject done = NIL;
        if (NIL == done) {
            SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(tree, YIELD);
            SubLObject word = NIL;
            word = csome_list_var.first();
            while ((NIL == done) && (NIL != csome_list_var)) {
                final SubLObject word_string = methods.funcall_instance_method_with_0_args(word, GET_STRING);
                if (NIL != member(word_string, $list30, symbol_function(EQUALP), UNPROVIDED)) {
                    what_flag = T;
                } else
                    if ((NIL != relationship_string_p(word_string)) && (NIL != what_flag)) {
                        rel_flag = T;
                    } else
                        if (word_string.equalp($$$between) && (NIL != rel_flag)) {
                            done = T;
                        } else
                            if (word_string.equalp($$$common)) {
                                done = T;
                            }



                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            } 
        }
        return done;
    }

    /**
     *
     *
     * @return boolean; t if STRING is a word indicating some form of relationship, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if STRING is a word indicating some form of relationship, nil otherwise")
    public static final SubLObject relationship_string_p_alt(SubLObject string) {
        return member(morphology.get_root(string, UNPROVIDED), $list_alt35, EQUALP, UNPROVIDED);
    }

    /**
     *
     *
     * @return boolean; t if STRING is a word indicating some form of relationship, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if STRING is a word indicating some form of relationship, nil otherwise")
    public static SubLObject relationship_string_p(final SubLObject string) {
        return member(morphology.get_root(string, UNPROVIDED), $list35, EQUALP, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static final SubLObject question_querify_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_question_method = NIL;
            SubLObject corpora = question.get_question_corpora(self);
            try {
                try {
                    {
                        SubLObject content_terms = NIL;
                        {
                            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS);
                            SubLObject v_term = NIL;
                            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                if (NIL == com.cyc.cycjava.cycl.quirk.relationship_question.relationship_string_p(v_term)) {
                                    content_terms = cons(v_term, content_terms);
                                }
                            }
                        }
                        if (NIL == content_terms) {
                            sublisp_throw($sym38$OUTER_CATCH_FOR_QUESTION_METHOD, NIL);
                        }
                        {
                            SubLObject queries = NIL;
                            SubLObject content_string = string_utilities.bunge(content_terms, UNPROVIDED);
                            SubLObject cdolist_list_var = corpora;
                            SubLObject corpus = NIL;
                            for (corpus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , corpus = cdolist_list_var.first()) {
                                {
                                    SubLObject augmentation_terms = methods.funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, content_terms, corpus);
                                    SubLObject query = string_utilities.bunge(augmentation_terms, UNPROVIDED);
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(THREE_INTEGER); i = add(i, ONE_INTEGER)) {
                                        query = cconcatenate(content_string, new SubLObject[]{ $str_alt41$_, query });
                                    }
                                    queries = cons(search_engine.new_lemur_query(query, corpus, UNPROVIDED, UNPROVIDED), queries);
                                }
                            }
                            sublisp_throw($sym38$OUTER_CATCH_FOR_QUESTION_METHOD, nreverse(queries));
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_corpora(self, corpora);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym38$OUTER_CATCH_FOR_QUESTION_METHOD);
            }
            return catch_var_for_question_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static SubLObject question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push($sym38$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                SubLObject content_terms = NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS);
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL == relationship_string_p(v_term)) {
                        content_terms = cons(v_term, content_terms);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
                if (NIL == content_terms) {
                    sublisp_throw($sym38$OUTER_CATCH_FOR_QUESTION_METHOD, NIL);
                }
                SubLObject queries = NIL;
                final SubLObject content_string = string_utilities.bunge(content_terms, UNPROVIDED);
                SubLObject cdolist_list_var2 = corpora;
                SubLObject corpus = NIL;
                corpus = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    final SubLObject augmentation_terms = methods.funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, content_terms, corpus);
                    SubLObject query = string_utilities.bunge(augmentation_terms, UNPROVIDED);
                    SubLObject i;
                    for (i = NIL, i = ZERO_INTEGER; i.numL(THREE_INTEGER); i = add(i, ONE_INTEGER)) {
                        query = cconcatenate(content_string, new SubLObject[]{ $$$_, query });
                    }
                    queries = cons(search_engine.new_lemur_query(query, corpus, UNPROVIDED, UNPROVIDED), queries);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    corpus = cdolist_list_var2.first();
                } 
                sublisp_throw($sym38$OUTER_CATCH_FOR_QUESTION_METHOD, nreverse(queries));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_corpora(self, corpora);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, $sym38$OUTER_CATCH_FOR_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("WORD-GRAPH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INFORMATION-EXTRACTION-GRAPH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt26 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt27 = list(makeSymbol("TREE"));

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static final SubLObject question_extract_method_alt(SubLObject self, SubLObject passage) {
        return list(answer.new_sentence_answer(self, passage, methods.funcall_instance_method_with_0_args(passage, GET_SCORE)));
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static SubLObject question_extract_method(final SubLObject self, final SubLObject passage) {
        return list(answer.new_sentence_answer(self, passage, methods.funcall_instance_method_with_0_args(passage, GET_SCORE)));
    }

    static private final SubLList $list_alt28 = list(makeString("@return boolean; t if TREE is a relationship question, nil otherwise"), list(makeSymbol("CLET"), list(makeSymbol("WHAT-FLAG"), makeSymbol("REL-FLAG"), makeSymbol("DONE")), list(makeSymbol("CSOME"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("YIELD"))), makeSymbol("DONE")), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-STRING"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-STRING"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), makeSymbol("WORD-STRING"), list(QUOTE, list(makeString("what"), makeString("which"))), list(makeSymbol("FUNCTION"), EQUALP)), list(makeSymbol("CSETQ"), makeSymbol("WHAT-FLAG"), T)), list(list(makeSymbol("CAND"), list(makeSymbol("RELATIONSHIP-STRING-P"), makeSymbol("WORD-STRING")), makeSymbol("WHAT-FLAG")), list(makeSymbol("CSETQ"), makeSymbol("REL-FLAG"), T)), list(list(makeSymbol("CAND"), list(EQUALP, makeSymbol("WORD-STRING"), makeString("between")), makeSymbol("REL-FLAG")), list(makeSymbol("CSETQ"), makeSymbol("DONE"), T)), list(list(EQUALP, makeSymbol("WORD-STRING"), makeString("common")), list(makeSymbol("CSETQ"), makeSymbol("DONE"), T))))), list(RET, makeSymbol("DONE"))));

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static final SubLObject question_answer_cardinality_method_alt(SubLObject self) {
        return TEN_INTEGER;
    }

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static SubLObject question_answer_cardinality_method(final SubLObject self) {
        return TEN_INTEGER;
    }

    public static SubLObject declare_relationship_question_file() {
        declareFunction("get_relationship_question_information_extraction_graph", "GET-RELATIONSHIP-QUESTION-INFORMATION-EXTRACTION-GRAPH", 1, 0, false);
        declareFunction("set_relationship_question_information_extraction_graph", "SET-RELATIONSHIP-QUESTION-INFORMATION-EXTRACTION-GRAPH", 2, 0, false);
        declareFunction("get_relationship_question_word_graph", "GET-RELATIONSHIP-QUESTION-WORD-GRAPH", 1, 0, false);
        declareFunction("set_relationship_question_word_graph", "SET-RELATIONSHIP-QUESTION-WORD-GRAPH", 2, 0, false);
        declareFunction("subloop_reserved_initialize_relationship_question_class", "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_relationship_question_instance", "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("relationship_question_p", "RELATIONSHIP-QUESTION-P", 1, 0, false);
        declareFunction("relationship_question_isaP_method", "RELATIONSHIP-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("relationship_string_p", "RELATIONSHIP-STRING-P", 1, 0, false);
        declareFunction("question_querify_method", "QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction("question_extract_method", "QUESTION-EXTRACT-METHOD", 2, 0, false);
        declareFunction("question_answer_cardinality_method", "QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt30 = list(makeString("what"), makeString("which"));

    static private final SubLList $list_alt35 = list(makeString("relationship"), makeString("connection"), makeString("link"), makeString("nexus"), makeString("tie"), makeString("tied"));

    public static SubLObject init_relationship_question_file() {
        return NIL;
    }

    static private final SubLList $list_alt37 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("CONTENT-TERMS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TERM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYSTRINGS")))), list(makeSymbol("PUNLESS"), list(makeSymbol("RELATIONSHIP-STRING-P"), makeSymbol("TERM")), list(makeSymbol("CPUSH"), makeSymbol("TERM"), makeSymbol("CONTENT-TERMS")))), list(makeSymbol("PUNLESS"), makeSymbol("CONTENT-TERMS"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL), list(makeSymbol("CONTENT-STRING"), list(makeSymbol("BUNGE"), makeSymbol("CONTENT-TERMS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTATION-TERMS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("QUESTION")), list(QUOTE, makeSymbol("AUGMENT-TERMS")), makeSymbol("CONTENT-TERMS"), makeSymbol("CORPUS"))), list(makeSymbol("QUERY"), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS")))), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), THREE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("QUERY"), list(makeSymbol("CCONCATENATE"), makeSymbol("CONTENT-STRING"), makeString(" "), makeSymbol("QUERY")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LEMUR-QUERY"), makeSymbol("QUERY"), makeSymbol("CORPUS")), makeSymbol("QUERIES")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("QUERIES"))))));

    public static SubLObject setup_relationship_question_file() {
        classes.subloop_new_class(RELATIONSHIP_QUESTION, QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(RELATIONSHIP_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(RELATIONSHIP_QUESTION, SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(RELATIONSHIP_QUESTION, SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE);
        subloop_reserved_initialize_relationship_question_class(RELATIONSHIP_QUESTION);
        methods.methods_incorporate_class_method($sym25$ISA_, RELATIONSHIP_QUESTION, $list26, $list27, $list28);
        methods.subloop_register_class_method(RELATIONSHIP_QUESTION, $sym25$ISA_, $sym34$RELATIONSHIP_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, QUESTION, $list26, NIL, $list37);
        methods.subloop_register_instance_method(QUESTION, QUERIFY, QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, QUESTION, $list26, $list44, $list45);
        methods.subloop_register_instance_method(QUESTION, EXTRACT, QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_CARDINALITY, QUESTION, $list26, NIL, $list49);
        methods.subloop_register_instance_method(QUESTION, ANSWER_CARDINALITY, QUESTION_ANSWER_CARDINALITY_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_relationship_question_file();
    }

    @Override
    public void initializeVariables() {
        init_relationship_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_relationship_question_file();
    }

    static private final SubLString $str_alt41$_ = makeString(" ");

    static {
    }

    static private final SubLList $list_alt44 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list_alt45 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-SENTENCE-ANSWER"), makeSymbol("SELF"), makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-SCORE")))))));

    static private final SubLList $list_alt49 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, TEN_INTEGER));
}

/**
 * Total time: 139 ms
 */
