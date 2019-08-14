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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.word_tree;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WH-QUESTION
 * source file: /cyc/top/cycl/quirk/wh-question.lisp
 * created:     2019/07/03 17:39:01
 */
public final class wh_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new wh_question();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.wh_question";


    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SENTENCE2WORD-TREES"), list(makeSymbol("SENTENCE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBJECT-QUESTION-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECT-QUESTION-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WH-PHRASE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-INSTANCE");

    static private final SubLSymbol $sym23$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list25 = list(makeSymbol("TREE"));

    static private final SubLList $list26 = list(makeString("@param TREE parse-tree-p; \n   @return boolean; t if TREE is a wh-question, nil otherwise"), list(makeSymbol("IGNORE"), makeSymbol("TREE")), list(RET, NIL));

    static private final SubLSymbol $sym27$WH_QUESTION_ISA__METHOD = makeSymbol("WH-QUESTION-ISA?-METHOD");

    private static final SubLSymbol SENTENCE2WORD_TREES = makeSymbol("SENTENCE2WORD-TREES");

    static private final SubLList $list29 = list(makeSymbol("SENTENCE"));

    static private final SubLList $list30 = list(makeString("Convert a sentence object into a list of word-tree objects"), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-TREES"), NIL), list(makeSymbol("I"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("SENTENCE-LISTIFY"), makeSymbol("SENTENCE"))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-WORD-TREE"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), list(makeSymbol("WORD-CATEGORY"), makeSymbol("WORD")), NIL, makeSymbol("I"), list(makeSymbol("WORD-INFO"), makeSymbol("WORD"))), makeSymbol("WORD-TREES")), list(makeSymbol("CINC"), makeSymbol("I"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("WORD-TREES")))));

    private static final SubLSymbol WH_QUESTION_SENTENCE2WORD_TREES_METHOD = makeSymbol("WH-QUESTION-SENTENCE2WORD-TREES-METHOD");

    static private final SubLList $list33 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL), list(makeSymbol("CONTENT-TERMS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYSTRINGS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTATION-TERMS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("QUESTION")), list(QUOTE, makeSymbol("AUGMENT-TERMS")), makeSymbol("CONTENT-TERMS"), makeSymbol("CORPUS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("BUNGE"), makeSymbol("CONTENT-TERMS")), makeString(" "), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS"))), makeSymbol("CORPUS")), makeSymbol("QUERIES")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("QUERIES")))));

    static private final SubLSymbol $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");

    static private final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol WH_QUESTION_QUERIFY_METHOD = makeSymbol("WH-QUESTION-QUERIFY-METHOD");

    static private final SubLList $list40 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list41 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("SENTENCE"), list(makeSymbol("SENTENCIFY"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("TAGGED"), list(makeSymbol("TAGGER-TAG-SENTENCE"), makeSymbol("TAGGER"), makeSymbol("SENTENCE"))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE")), makeSymbol("TAGGED")))), list(makeSymbol("YIELD"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("WH-QUESTION")), list(QUOTE, makeSymbol("SENTENCE2WORD-TREES")), makeSymbol("LEXIFIED"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS")))), list(makeSymbol("ANSWERS"), NIL), makeSymbol("I")), list(makeSymbol("PWHEN"), makeSymbol("LEXIFIED"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("BEFORE"), makeSymbol("AFTER"), makeSymbol("DEVIATION")), list(makeSymbol("SPLIT-YIELD"), makeSymbol("YIELD"), makeSymbol("KEYWORDS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DEVIATION"), list(makeSymbol("<"), makeSymbol("DEVIATION"), EIGHT_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATES"), list(makeSymbol("LIST"), makeSymbol("BEFORE"), makeSymbol("AFTER"))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("SCORE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-TYPE-MATCH")), makeSymbol("CANDIDATE")))), list(makeSymbol("PWHEN"), list(makeSymbol("PLUSP"), makeSymbol("SCORE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), list(makeSymbol("*"), makeSymbol("SCORE"), list(makeSymbol("/"), ONE_INTEGER, list(makeSymbol("FIF"), list(makeSymbol("<"), makeSymbol("I"), FOUR_INTEGER), ONE_INTEGER, makeSymbol("I"))))), makeSymbol("ANSWERS"))))))))), list(RET, makeSymbol("ANSWERS"))));

    static private final SubLSymbol $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");

    private static final SubLSymbol TREE_TYPE_MATCH = makeSymbol("TREE-TYPE-MATCH");

    private static final SubLSymbol WH_QUESTION_EXTRACT_METHOD = makeSymbol("WH-QUESTION-EXTRACT-METHOD");

    private static final SubLSymbol SUBJECT_QUESTION_P = makeSymbol("SUBJECT-QUESTION-P");

    static private final SubLList $list51 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list52 = list(makeString("@return booleanp; t if this is a subject question, nil otherwise"), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-HEAD")))))));

    static private final SubLSymbol $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");

    private static final SubLSymbol WH_QUESTION_SUBJECT_QUESTION_P_METHOD = makeSymbol("WH-QUESTION-SUBJECT-QUESTION-P-METHOD");

    private static final SubLSymbol OBJECT_QUESTION_P = makeSymbol("OBJECT-QUESTION-P");

    static private final SubLList $list57 = list(makeString("@return booleanp; t if this is a subject question, nil otherwise"), list(RET, list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-HEAD"))))));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");

    private static final SubLSymbol WH_QUESTION_OBJECT_QUESTION_P_METHOD = makeSymbol("WH-QUESTION-OBJECT-QUESTION-P-METHOD");

    private static final SubLSymbol GET_WH_PHRASE = makeSymbol("GET-WH-PHRASE");

    static private final SubLList $list61 = list(makeString("@return parse-tree-p; the initial wh phrase of this question, \n   like \'How many\', \'Where\', etc"), list(RET, list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("WH-TREE-P")))));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");

    private static final SubLSymbol WH_QUESTION_GET_WH_PHRASE_METHOD = makeSymbol("WH-QUESTION-GET-WH-PHRASE-METHOD");

    static private final SubLList $list67 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, THREE_INTEGER));

    private static final SubLSymbol WH_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("WH-QUESTION-ANSWER-CARDINALITY-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_wh_question_class_alt(SubLObject new_instance) {
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

    // Definitions
    public static SubLObject subloop_reserved_initialize_wh_question_class(final SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_wh_question_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wh_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        return NIL;
    }

    public static final SubLObject wh_question_p_alt(SubLObject v_wh_question) {
        return classes.subloop_instanceof_class(v_wh_question, WH_QUESTION);
    }

    public static SubLObject wh_question_p(final SubLObject v_wh_question) {
        return classes.subloop_instanceof_class(v_wh_question, WH_QUESTION);
    }

    /**
     *
     *
     * @param TREE
    parse-tree-p;
     * 		
     * @return boolean; t if TREE is a wh-question, nil otherwise
     */
    @LispMethod(comment = "@param TREE\nparse-tree-p;\r\n\t\t\r\n@return boolean; t if TREE is a wh-question, nil otherwise")
    public static final SubLObject wh_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return NIL;
    }

    /**
     *
     *
     * @param TREE
    parse-tree-p;
     * 		
     * @return boolean; t if TREE is a wh-question, nil otherwise
     */
    @LispMethod(comment = "@param TREE\nparse-tree-p;\r\n\t\t\r\n@return boolean; t if TREE is a wh-question, nil otherwise")
    public static SubLObject wh_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return NIL;
    }

    /**
     * Convert a sentence object into a list of word-tree objects
     */
    @LispMethod(comment = "Convert a sentence object into a list of word-tree objects")
    public static final SubLObject wh_question_sentence2word_trees_method_alt(SubLObject self, SubLObject sentence) {
        {
            SubLObject word_trees = NIL;
            SubLObject i = ZERO_INTEGER;
            SubLObject cdolist_list_var = document.sentence_listify(sentence);
            SubLObject word = NIL;
            for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                word_trees = cons(word_tree.new_word_tree(document.word_string(word), document.word_category(word), NIL, i, document.word_info(word), UNPROVIDED), word_trees);
                i = add(i, ONE_INTEGER);
            }
            return nreverse(word_trees);
        }
    }

    /**
     * Convert a sentence object into a list of word-tree objects
     */
    @LispMethod(comment = "Convert a sentence object into a list of word-tree objects")
    public static SubLObject wh_question_sentence2word_trees_method(final SubLObject self, final SubLObject sentence) {
        SubLObject word_trees = NIL;
        SubLObject i = ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_listify(sentence);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            word_trees = cons(word_tree.new_word_tree(document.word_string(word), document.word_category(word), NIL, i, document.word_info(word), UNPROVIDED), word_trees);
            i = add(i, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return nreverse(word_trees);
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static final SubLObject wh_question_querify_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_wh_question_method = NIL;
            SubLObject corpora = question.get_question_corpora(self);
            try {
                try {
                    {
                        SubLObject queries = NIL;
                        SubLObject content_terms = methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS);
                        SubLObject cdolist_list_var = corpora;
                        SubLObject corpus = NIL;
                        for (corpus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , corpus = cdolist_list_var.first()) {
                            {
                                SubLObject augmentation_terms = methods.funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, content_terms, corpus);
                                queries = cons(search_engine.new_lemur_query(cconcatenate(string_utilities.bunge(content_terms, UNPROVIDED), new SubLObject[]{ $str_alt37$_, string_utilities.bunge(augmentation_terms, UNPROVIDED) }), corpus, UNPROVIDED, UNPROVIDED), queries);
                            }
                        }
                        sublisp_throw($sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD, nreverse(queries));
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
                catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            }
            return catch_var_for_wh_question_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static SubLObject wh_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push($sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                SubLObject queries = NIL;
                final SubLObject content_terms = methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS);
                SubLObject cdolist_list_var = corpora;
                SubLObject corpus = NIL;
                corpus = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject augmentation_terms = methods.funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, content_terms, corpus);
                    queries = cons(search_engine.new_lemur_query(cconcatenate(string_utilities.bunge(content_terms, UNPROVIDED), new SubLObject[]{ $$$_, string_utilities.bunge(augmentation_terms, UNPROVIDED) }), corpus, UNPROVIDED, UNPROVIDED), queries);
                    cdolist_list_var = cdolist_list_var.rest();
                    corpus = cdolist_list_var.first();
                } 
                sublisp_throw($sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD, nreverse(queries));
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
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static final SubLObject wh_question_extract_method_alt(SubLObject self, SubLObject passage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_wh_question_method = NIL;
                SubLObject tagger = question.get_question_tagger(self);
                SubLObject lexicon = question.get_question_lexicon(self);
                try {
                    try {
                        methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                        {
                            SubLObject sentence = question.sentencify(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                            SubLObject tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
                            SubLObject lexified = (NIL != sentence) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(lexicon, LEXIFY_SENTENCE, tagged))) : NIL;
                            SubLObject yield = methods.funcall_class_method_with_1_args(WH_QUESTION, SENTENCE2WORD_TREES, lexified);
                            SubLObject keywords = methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS);
                            SubLObject answers = NIL;
                            SubLObject i = NIL;
                            if (NIL != lexified) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject before = question.split_yield(yield, keywords);
                                    SubLObject after = thread.secondMultipleValue();
                                    SubLObject deviation = thread.thirdMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((NIL != deviation) && deviation.numL(EIGHT_INTEGER)) {
                                        {
                                            SubLObject cdolist_list_var = list(before, after);
                                            SubLObject candidates = NIL;
                                            for (candidates = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidates = cdolist_list_var.first()) {
                                                i = ZERO_INTEGER;
                                                {
                                                    SubLObject cdolist_list_var_1 = candidates;
                                                    SubLObject candidate = NIL;
                                                    for (candidate = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , candidate = cdolist_list_var_1.first()) {
                                                        i = add(i, ONE_INTEGER);
                                                        {
                                                            SubLObject score = methods.funcall_instance_method_with_1_args(self, TREE_TYPE_MATCH, candidate);
                                                            if (score.isPositive()) {
                                                                answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, multiply(score, divide(ONE_INTEGER, i.numL(FOUR_INTEGER) ? ((SubLObject) (ONE_INTEGER)) : i)), UNPROVIDED), answers);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD, answers);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                question.set_question_tagger(self, tagger);
                                question.set_question_lexicon(self, lexicon);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
                }
                return catch_var_for_wh_question_method;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static SubLObject wh_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = NIL;
        final SubLObject tagger = question.get_question_tagger(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        try {
            thread.throwStack.push($sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject sentence = question.sentencify(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
                final SubLObject lexified = (NIL != sentence) ? methods.funcall_instance_method_with_1_args(lexicon, LEXIFY_SENTENCE, tagged) : NIL;
                final SubLObject yield = methods.funcall_class_method_with_1_args(WH_QUESTION, SENTENCE2WORD_TREES, lexified);
                final SubLObject keywords = methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS);
                SubLObject answers = NIL;
                SubLObject i = NIL;
                if (NIL != lexified) {
                    thread.resetMultipleValues();
                    final SubLObject before = question.split_yield(yield, keywords);
                    final SubLObject after = thread.secondMultipleValue();
                    final SubLObject deviation = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != deviation) && deviation.numL(EIGHT_INTEGER)) {
                        SubLObject cdolist_list_var = list(before, after);
                        SubLObject candidates = NIL;
                        candidates = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            i = ZERO_INTEGER;
                            SubLObject cdolist_list_var_$1 = candidates;
                            SubLObject candidate = NIL;
                            candidate = cdolist_list_var_$1.first();
                            while (NIL != cdolist_list_var_$1) {
                                i = add(i, ONE_INTEGER);
                                final SubLObject score = methods.funcall_instance_method_with_1_args(self, TREE_TYPE_MATCH, candidate);
                                if (score.isPositive()) {
                                    answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, multiply(score, divide(ONE_INTEGER, i.numL(FOUR_INTEGER) ? ONE_INTEGER : i)), UNPROVIDED), answers);
                                }
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                candidate = cdolist_list_var_$1.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            candidates = cdolist_list_var.first();
                        } 
                    }
                }
                sublisp_throw($sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD, answers);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_tagger(self, tagger);
                    question.set_question_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SENTENCE2WORD-TREES"), list(makeSymbol("SENTENCE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBJECT-QUESTION-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECT-QUESTION-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-WH-PHRASE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")));

    /**
     *
     *
     * @return booleanp; t if this is a subject question, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this is a subject question, nil otherwise")
    public static final SubLObject wh_question_subject_question_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_wh_question_method = NIL;
            SubLObject parse = question.get_question_parse(self);
            try {
                try {
                    sublisp_throw($sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD, makeBoolean(NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(parse, GET_HEAD))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            }
            return catch_var_for_wh_question_method;
        }
    }

    /**
     *
     *
     * @return booleanp; t if this is a subject question, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this is a subject question, nil otherwise")
    public static SubLObject wh_question_subject_question_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                sublisp_throw($sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD, makeBoolean(NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(parse, GET_HEAD))));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }

    static private final SubLList $list_alt24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt25 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt26 = list(makeString("@param TREE parse-tree-p; \n   @return boolean; t if TREE is a wh-question, nil otherwise"), list(makeSymbol("IGNORE"), makeSymbol("TREE")), list(RET, NIL));

    /**
     *
     *
     * @return booleanp; t if this is a subject question, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this is a subject question, nil otherwise")
    public static final SubLObject wh_question_object_question_p_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_wh_question_method = NIL;
            SubLObject parse = question.get_question_parse(self);
            try {
                try {
                    sublisp_throw($sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD, word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(parse, GET_HEAD)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            }
            return catch_var_for_wh_question_method;
        }
    }

    /**
     *
     *
     * @return booleanp; t if this is a subject question, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this is a subject question, nil otherwise")
    public static SubLObject wh_question_object_question_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                sublisp_throw($sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD, word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(parse, GET_HEAD)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }

    static private final SubLList $list_alt29 = list(makeSymbol("SENTENCE"));

    static private final SubLList $list_alt30 = list(makeString("Convert a sentence object into a list of word-tree objects"), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-TREES"), NIL), list(makeSymbol("I"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("SENTENCE-LISTIFY"), makeSymbol("SENTENCE"))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-WORD-TREE"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), list(makeSymbol("WORD-CATEGORY"), makeSymbol("WORD")), NIL, makeSymbol("I"), list(makeSymbol("WORD-INFO"), makeSymbol("WORD"))), makeSymbol("WORD-TREES")), list(makeSymbol("CINC"), makeSymbol("I"))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("WORD-TREES")))));

    static private final SubLList $list_alt33 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL), list(makeSymbol("CONTENT-TERMS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYSTRINGS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTATION-TERMS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("QUESTION")), list(QUOTE, makeSymbol("AUGMENT-TERMS")), makeSymbol("CONTENT-TERMS"), makeSymbol("CORPUS")))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("BUNGE"), makeSymbol("CONTENT-TERMS")), makeString(" "), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS"))), makeSymbol("CORPUS")), makeSymbol("QUERIES")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("QUERIES")))));

    /**
     *
     *
     * @return parse-tree-p; the initial wh phrase of this question,
    like 'How many', 'Where', etc
     */
    @LispMethod(comment = "@return parse-tree-p; the initial wh phrase of this question,\r\nlike \'How many\', \'Where\', etc")
    public static final SubLObject wh_question_get_wh_phrase_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_wh_question_method = NIL;
            SubLObject parse = question.get_question_parse(self);
            try {
                try {
                    sublisp_throw($sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD, methods.funcall_instance_method_with_1_args(parse, FIND_FIRST, WH_TREE_P));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            }
            return catch_var_for_wh_question_method;
        }
    }

    /**
     *
     *
     * @return parse-tree-p; the initial wh phrase of this question,
    like 'How many', 'Where', etc
     */
    @LispMethod(comment = "@return parse-tree-p; the initial wh phrase of this question,\r\nlike \'How many\', \'Where\', etc")
    public static SubLObject wh_question_get_wh_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                sublisp_throw($sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD, methods.funcall_instance_method_with_1_args(parse, FIND_FIRST, WH_TREE_P));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }

    static private final SubLString $str_alt37$_ = makeString(" ");

    static private final SubLList $list_alt40 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list_alt41 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("SENTENCE"), list(makeSymbol("SENTENCIFY"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("TAGGED"), list(makeSymbol("TAGGER-TAG-SENTENCE"), makeSymbol("TAGGER"), makeSymbol("SENTENCE"))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE")), makeSymbol("TAGGED")))), list(makeSymbol("YIELD"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("WH-QUESTION")), list(QUOTE, makeSymbol("SENTENCE2WORD-TREES")), makeSymbol("LEXIFIED"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS")))), list(makeSymbol("ANSWERS"), NIL), makeSymbol("I")), list(makeSymbol("PWHEN"), makeSymbol("LEXIFIED"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("BEFORE"), makeSymbol("AFTER"), makeSymbol("DEVIATION")), list(makeSymbol("SPLIT-YIELD"), makeSymbol("YIELD"), makeSymbol("KEYWORDS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DEVIATION"), list(makeSymbol("<"), makeSymbol("DEVIATION"), EIGHT_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATES"), list(makeSymbol("LIST"), makeSymbol("BEFORE"), makeSymbol("AFTER"))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("SCORE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-TYPE-MATCH")), makeSymbol("CANDIDATE")))), list(makeSymbol("PWHEN"), list(makeSymbol("PLUSP"), makeSymbol("SCORE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), list(makeSymbol("*"), makeSymbol("SCORE"), list(makeSymbol("/"), ONE_INTEGER, list(makeSymbol("FIF"), list(makeSymbol("<"), makeSymbol("I"), FOUR_INTEGER), ONE_INTEGER, makeSymbol("I"))))), makeSymbol("ANSWERS"))))))))), list(RET, makeSymbol("ANSWERS"))));

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static final SubLObject wh_question_answer_cardinality_method_alt(SubLObject self) {
        return THREE_INTEGER;
    }

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static SubLObject wh_question_answer_cardinality_method(final SubLObject self) {
        return THREE_INTEGER;
    }

    public static SubLObject declare_wh_question_file() {
        declareFunction("subloop_reserved_initialize_wh_question_class", "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_wh_question_instance", "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("wh_question_p", "WH-QUESTION-P", 1, 0, false);
        declareFunction("wh_question_isaP_method", "WH-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("wh_question_sentence2word_trees_method", "WH-QUESTION-SENTENCE2WORD-TREES-METHOD", 2, 0, false);
        declareFunction("wh_question_querify_method", "WH-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction("wh_question_extract_method", "WH-QUESTION-EXTRACT-METHOD", 2, 0, false);
        declareFunction("wh_question_subject_question_p_method", "WH-QUESTION-SUBJECT-QUESTION-P-METHOD", 1, 0, false);
        declareFunction("wh_question_object_question_p_method", "WH-QUESTION-OBJECT-QUESTION-P-METHOD", 1, 0, false);
        declareFunction("wh_question_get_wh_phrase_method", "WH-QUESTION-GET-WH-PHRASE-METHOD", 1, 0, false);
        declareFunction("wh_question_answer_cardinality_method", "WH-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_wh_question_file() {
        return NIL;
    }

    public static SubLObject setup_wh_question_file() {
        classes.subloop_new_class(WH_QUESTION, QUESTION, NIL, T, $list2);
        classes.class_set_implements_slot_listeners(WH_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(WH_QUESTION, SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(WH_QUESTION, SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE);
        subloop_reserved_initialize_wh_question_class(WH_QUESTION);
        methods.methods_incorporate_class_method($sym23$ISA_, WH_QUESTION, $list24, $list25, $list26);
        methods.subloop_register_class_method(WH_QUESTION, $sym23$ISA_, $sym27$WH_QUESTION_ISA__METHOD);
        methods.methods_incorporate_class_method(SENTENCE2WORD_TREES, WH_QUESTION, $list24, $list29, $list30);
        methods.subloop_register_class_method(WH_QUESTION, SENTENCE2WORD_TREES, WH_QUESTION_SENTENCE2WORD_TREES_METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, WH_QUESTION, $list24, NIL, $list33);
        methods.subloop_register_instance_method(WH_QUESTION, QUERIFY, WH_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, WH_QUESTION, $list24, $list40, $list41);
        methods.subloop_register_instance_method(WH_QUESTION, EXTRACT, WH_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method(SUBJECT_QUESTION_P, WH_QUESTION, $list51, NIL, $list52);
        methods.subloop_register_instance_method(WH_QUESTION, SUBJECT_QUESTION_P, WH_QUESTION_SUBJECT_QUESTION_P_METHOD);
        methods.methods_incorporate_instance_method(OBJECT_QUESTION_P, WH_QUESTION, $list51, NIL, $list57);
        methods.subloop_register_instance_method(WH_QUESTION, OBJECT_QUESTION_P, WH_QUESTION_OBJECT_QUESTION_P_METHOD);
        methods.methods_incorporate_instance_method(GET_WH_PHRASE, WH_QUESTION, $list24, NIL, $list61);
        methods.subloop_register_instance_method(WH_QUESTION, GET_WH_PHRASE, WH_QUESTION_GET_WH_PHRASE_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_CARDINALITY, WH_QUESTION, $list24, NIL, $list67);
        methods.subloop_register_instance_method(WH_QUESTION, ANSWER_CARDINALITY, WH_QUESTION_ANSWER_CARDINALITY_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt51 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt52 = list(makeString("@return booleanp; t if this is a subject question, nil otherwise"), list(RET, list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-HEAD")))))));

    static private final SubLList $list_alt57 = list(makeString("@return booleanp; t if this is a subject question, nil otherwise"), list(RET, list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-HEAD"))))));

    @Override
    public void declareFunctions() {
        declare_wh_question_file();
    }

    @Override
    public void initializeVariables() {
        init_wh_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wh_question_file();
    }

    static {
    }

    static private final SubLList $list_alt61 = list(makeString("@return parse-tree-p; the initial wh phrase of this question, \n   like \'How many\', \'Where\', etc"), list(RET, list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("WH-TREE-P")))));

    static private final SubLList $list_alt67 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, THREE_INTEGER));
}

/**
 * Total time: 199 ms
 */
