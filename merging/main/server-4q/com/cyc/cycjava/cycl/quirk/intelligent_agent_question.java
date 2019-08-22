/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
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
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
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


public final class intelligent_agent_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new intelligent_agent_question();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.intelligent_agent_question";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INTELLIGENT_AGENT_QUESTION = makeSymbol("INTELLIGENT-AGENT-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-INSTANCE");

    static private final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list25 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list26 = list(makeSymbol("TREE"));

    static private final SubLList $list27 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("who"), makeString("whose"), makeString("whom")))), list(makeSymbol("COR"), list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-PREDICATE"))))), list(makeSymbol("CAND"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-PREDICATE")))), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("COR"), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeKeyword("NN")), list(makeSymbol("STARTS-WITH"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-STRING"))), makeString("the"))))))));

    static private final SubLList $list30 = list(makeString("who"), makeString("whose"), makeString("whom"));

    static private final SubLString $$$the = makeString("the");

    static private final SubLSymbol $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD = makeSymbol("INTELLIGENT-AGENT-QUESTION-ISA?-METHOD");

    static private final SubLList $list39 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING")))))));

    private static final SubLSymbol INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD = makeSymbol("INTELLIGENT-AGENT-QUESTION-QUERIFY-METHOD");

    static private final SubLList $list42 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list43 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("PARSE")), list(makeSymbol("PASSAGE-SENTENCE"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PPARSE"), list(QUOTE, makeSymbol("LEXIFY")), makeSymbol("LEXICON")))), list(makeSymbol("PREDICATE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-PREDICATE")))), makeSymbol("CANDIDATE"), makeSymbol("SUBJECT"), makeSymbol("OBJECT"), list(makeSymbol("ANSWERS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("LEXIFIED"), makeSymbol("PREDICATE")), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("LEXIFIED"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("WORD")), list(makeSymbol("WORD-IMPLIES"), makeSymbol("WORD"), makeSymbol("PREDICATE"))), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUBJECT-QUESTION-P"))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("OBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("CSETQ"), makeSymbol("OBJECT"), list(makeSymbol("FWHEN"), makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBJECT"), list(makeSymbol("WORD-IMPLIES"), makeSymbol("OBJECT"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PREDICATE"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("WORD-IMPLIES"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PREDICATE"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATE"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))))))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATE"), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), list(makeSymbol("*"), makeSymbol("MAX-CONFIDENCE"))), makeSymbol("ANSWERS")))))), list(RET, makeSymbol("ANSWERS"))));

    static private final SubLSymbol $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-INTELLIGENT-AGENT-QUESTION-METHOD");

    private static final SubLSymbol SUBJECT_QUESTION_P = makeSymbol("SUBJECT-QUESTION-P");

    private static final SubLSymbol INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD = makeSymbol("INTELLIGENT-AGENT-QUESTION-EXTRACT-METHOD");

    static private final SubLList $list53 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("Person"), reader_make_constant_shell("IntelligentAgent")))));





    private static final SubLSymbol INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("INTELLIGENT-AGENT-QUESTION-ANSWER-TYPES-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_intelligent_agent_question_class_alt(SubLObject new_instance) {
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
    public static SubLObject subloop_reserved_initialize_intelligent_agent_question_class(final SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_intelligent_agent_question_instance_alt(SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_intelligent_agent_question_instance(final SubLObject new_instance) {
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

    public static final SubLObject intelligent_agent_question_p_alt(SubLObject v_intelligent_agent_question) {
        return classes.subloop_instanceof_class(v_intelligent_agent_question, INTELLIGENT_AGENT_QUESTION);
    }

    public static SubLObject intelligent_agent_question_p(final SubLObject v_intelligent_agent_question) {
        return classes.subloop_instanceof_class(v_intelligent_agent_question, INTELLIGENT_AGENT_QUESTION);
    }

    public static final SubLObject intelligent_agent_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list_alt30, UNPROVIDED))) && ((NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_PREDICATE))) || (((NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_PREDICATE))) && (NIL != methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT))) && ((methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_HEAD), GET_CATEGORY) == $NN) || (NIL != string_utilities.starts_with(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_STRING), $$$the))))));
    }

    public static SubLObject intelligent_agent_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, UNPROVIDED))) && ((NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_PREDICATE))) || (((NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_PREDICATE))) && (NIL != methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT))) && ((methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_HEAD), GET_CATEGORY) == $NN) || (NIL != string_utilities.starts_with(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_STRING), $$$the))))));
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static final SubLObject intelligent_agent_question_querify_method_alt(SubLObject self) {
        return list(search_engine.new_lemur_query(methods.funcall_instance_method_with_0_args(self, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static SubLObject intelligent_agent_question_querify_method(final SubLObject self) {
        return list(search_engine.new_lemur_query(methods.funcall_instance_method_with_0_args(self, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static final SubLObject intelligent_agent_question_extract_method_alt(SubLObject self, SubLObject passage) {
        {
            SubLObject catch_var_for_intelligent_agent_question_method = NIL;
            SubLObject max_confidence = question.get_question_max_confidence(self);
            SubLObject v_parser = question.get_question_parser(self);
            SubLObject lexicon = question.get_question_lexicon(self);
            SubLObject parse = question.get_question_parse(self);
            try {
                try {
                    methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                    {
                        SubLObject pparse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, com.cyc.cycjava.cycl.quirk.intelligent_agent_question.passage_sentence(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT)));
                        SubLObject lexified = (NIL != pparse) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(pparse, LEXIFY, lexicon))) : NIL;
                        SubLObject predicate = methods.funcall_instance_method_with_0_args(parse, GET_PREDICATE);
                        SubLObject candidate = NIL;
                        SubLObject subject = NIL;
                        SubLObject v_object = NIL;
                        SubLObject answers = NIL;
                        if ((NIL != lexified) && (NIL != predicate)) {
                            {
                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(lexified, YIELD);
                                SubLObject word = NIL;
                                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                    if ((NIL != parse_tree.verbal_tree_p(word)) && (NIL != question.word_implies(word, predicate))) {
                                        if (NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_QUESTION_P)) {
                                            v_object = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first();
                                            v_object = (NIL != v_object) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(v_object, GET_HEAD))) : NIL;
                                            if ((NIL != v_object) && (NIL != question.word_implies(v_object, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(predicate, GET_SEMANTIC_OBJECTS).first(), GET_HEAD)))) {
                                                candidate = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT);
                                            }
                                        } else {
                                            subject = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT);
                                            subject = (NIL != subject) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(subject, GET_HEAD))) : NIL;
                                            if ((NIL != subject) && (NIL != question.word_implies(subject, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(predicate, GET_SEMANTIC_SUBJECT), GET_HEAD)))) {
                                                candidate = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first();
                                            }
                                        }
                                        if (NIL != candidate) {
                                            answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, multiply(new SubLObject[]{ max_confidence }), UNPROVIDED), answers);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD, answers);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_max_confidence(self, max_confidence);
                            question.set_question_parser(self, v_parser);
                            question.set_question_lexicon(self, lexicon);
                            question.set_question_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_intelligent_agent_question_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD);
            }
            return catch_var_for_intelligent_agent_question_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static SubLObject intelligent_agent_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_intelligent_agent_question_method = NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject pparse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, passage_sentence(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT)));
                final SubLObject lexified = (NIL != pparse) ? methods.funcall_instance_method_with_1_args(pparse, LEXIFY, lexicon) : NIL;
                final SubLObject predicate = methods.funcall_instance_method_with_0_args(parse, GET_PREDICATE);
                SubLObject candidate = NIL;
                SubLObject subject = NIL;
                SubLObject v_object = NIL;
                SubLObject answers = NIL;
                if ((NIL != lexified) && (NIL != predicate)) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(lexified, YIELD);
                    SubLObject word = NIL;
                    word = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != parse_tree.verbal_tree_p(word)) && (NIL != question.word_implies(word, predicate))) {
                            if (NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_QUESTION_P)) {
                                v_object = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first();
                                v_object = (NIL != v_object) ? methods.funcall_instance_method_with_0_args(v_object, GET_HEAD) : NIL;
                                if ((NIL != v_object) && (NIL != question.word_implies(v_object, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(predicate, GET_SEMANTIC_OBJECTS).first(), GET_HEAD)))) {
                                    candidate = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT);
                                }
                            } else {
                                subject = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT);
                                subject = (NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, GET_HEAD) : NIL;
                                if ((NIL != subject) && (NIL != question.word_implies(subject, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(predicate, GET_SEMANTIC_SUBJECT), GET_HEAD)))) {
                                    candidate = methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first();
                                }
                            }
                            if (NIL != candidate) {
                                answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, multiply(new SubLObject[]{ max_confidence }), UNPROVIDED), answers);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        word = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD, answers);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    question.set_question_parser(self, v_parser);
                    question.set_question_lexicon(self, lexicon);
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_intelligent_agent_question_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_intelligent_agent_question_method;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt25 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt26 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt27 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("who"), makeString("whose"), makeString("whom")))), list(makeSymbol("COR"), list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-PREDICATE"))))), list(makeSymbol("CAND"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-PREDICATE")))), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("COR"), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeKeyword("NN")), list(makeSymbol("STARTS-WITH"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-STRING"))), makeString("the"))))))));

    static private final SubLList $list_alt30 = list(makeString("who"), makeString("whose"), makeString("whom"));

    static private final SubLList $list_alt39 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING")))))));

    static private final SubLList $list_alt42 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list_alt43 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("PARSE")), list(makeSymbol("PASSAGE-SENTENCE"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PPARSE"), list(QUOTE, makeSymbol("LEXIFY")), makeSymbol("LEXICON")))), list(makeSymbol("PREDICATE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-PREDICATE")))), makeSymbol("CANDIDATE"), makeSymbol("SUBJECT"), makeSymbol("OBJECT"), list(makeSymbol("ANSWERS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("LEXIFIED"), makeSymbol("PREDICATE")), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("LEXIFIED"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("WORD")), list(makeSymbol("WORD-IMPLIES"), makeSymbol("WORD"), makeSymbol("PREDICATE"))), list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUBJECT-QUESTION-P"))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("OBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("CSETQ"), makeSymbol("OBJECT"), list(makeSymbol("FWHEN"), makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("OBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBJECT"), list(makeSymbol("WORD-IMPLIES"), makeSymbol("OBJECT"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PREDICATE"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("WORD-IMPLIES"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PREDICATE"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATE"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))))))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATE"), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), list(makeSymbol("*"), makeSymbol("MAX-CONFIDENCE"))), makeSymbol("ANSWERS")))))), list(RET, makeSymbol("ANSWERS"))));

    /**
     *
     *
     * @return list; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return list; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static final SubLObject intelligent_agent_question_answer_types_method_alt(SubLObject self) {
        return list(list($$Person, $$IntelligentAgent));
    }

    /**
     *
     *
     * @return list; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return list; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static SubLObject intelligent_agent_question_answer_types_method(final SubLObject self) {
        return list(list($$Person, $$IntelligentAgent));
    }

    public static final SubLObject passage_sentence_alt(SubLObject passage) {
        return passage;
    }

    public static SubLObject passage_sentence(final SubLObject passage) {
        return passage;
    }

    public static SubLObject declare_intelligent_agent_question_file() {
        declareFunction("subloop_reserved_initialize_intelligent_agent_question_class", "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_intelligent_agent_question_instance", "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("intelligent_agent_question_p", "INTELLIGENT-AGENT-QUESTION-P", 1, 0, false);
        declareFunction("intelligent_agent_question_isaP_method", "INTELLIGENT-AGENT-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("intelligent_agent_question_querify_method", "INTELLIGENT-AGENT-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction("intelligent_agent_question_extract_method", "INTELLIGENT-AGENT-QUESTION-EXTRACT-METHOD", 2, 0, false);
        declareFunction("intelligent_agent_question_answer_types_method", "INTELLIGENT-AGENT-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction("passage_sentence", "PASSAGE-SENTENCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_intelligent_agent_question_file() {
        return NIL;
    }

    public static SubLObject setup_intelligent_agent_question_file() {
        classes.subloop_new_class(INTELLIGENT_AGENT_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(INTELLIGENT_AGENT_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(INTELLIGENT_AGENT_QUESTION, SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(INTELLIGENT_AGENT_QUESTION, SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE);
        subloop_reserved_initialize_intelligent_agent_question_class(INTELLIGENT_AGENT_QUESTION);
        methods.methods_incorporate_class_method($sym24$ISA_, INTELLIGENT_AGENT_QUESTION, $list25, $list26, $list27);
        methods.subloop_register_class_method(INTELLIGENT_AGENT_QUESTION, $sym24$ISA_, $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, INTELLIGENT_AGENT_QUESTION, $list25, NIL, $list39);
        methods.subloop_register_instance_method(INTELLIGENT_AGENT_QUESTION, QUERIFY, INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, INTELLIGENT_AGENT_QUESTION, $list25, $list42, $list43);
        methods.subloop_register_instance_method(INTELLIGENT_AGENT_QUESTION, EXTRACT, INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, INTELLIGENT_AGENT_QUESTION, $list25, NIL, $list53);
        methods.subloop_register_instance_method(INTELLIGENT_AGENT_QUESTION, ANSWER_TYPES, INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_intelligent_agent_question_file();
    }

    @Override
    public void initializeVariables() {
        init_intelligent_agent_question_file();
    }

    static private final SubLList $list_alt53 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("Person"), reader_make_constant_shell("IntelligentAgent")))));

    @Override
    public void runTopLevelForms() {
        setup_intelligent_agent_question_file();
    }

    
}

/**
 * Total time: 168 ms
 */
