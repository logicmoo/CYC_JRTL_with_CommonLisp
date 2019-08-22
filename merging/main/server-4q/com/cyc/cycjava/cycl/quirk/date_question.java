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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
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


public final class date_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new date_question();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.date_question";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol DATE_QUESTION = makeSymbol("DATE-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ANSWER-TYPES"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE");

    static private final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list25 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list26 = list(makeSymbol("TREE"));

    static private final SubLList $list27 = list(makeString("@return boolean; t if TREE is a date question, nil otherwise"), list(RET, list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("when"))))), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), makeString("on what date")))));

    static private final SubLList $list30 = list(makeString("when"));

    static private final SubLString $$$on_what_date = makeString("on what date");

    static private final SubLSymbol $sym32$DATE_QUESTION_ISA__METHOD = makeSymbol("DATE-QUESTION-ISA?-METHOD");

    static private final SubLList $list33 = list(makeString("@return listp; the list of expected answers of this question"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("Date")), list(makeSymbol("LIST"), reader_make_constant_shell("Time-Quantity")))));



    private static final SubLObject $$Time_Quantity = reader_make_constant_shell("Time-Quantity");

    private static final SubLSymbol DATE_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("DATE-QUESTION-ANSWER-TYPES-METHOD");

    static private final SubLList $list38 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, TEN_INTEGER));

    private static final SubLSymbol DATE_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("DATE-QUESTION-ANSWER-CARDINALITY-METHOD");

    static private final SubLList $list41 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GURUQA-QUERY"), list(makeSymbol("CCONCATENATE"), makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) "), list(makeSymbol("BUNGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYSTRINGS")))), makeString(")")), makeSymbol("CORPUS")), makeSymbol("QUERIES"))), list(RET, makeSymbol("QUERIES"))));

    static private final SubLSymbol $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DATE-QUESTION-METHOD");

    static private final SubLString $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM = makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) ");

    static private final SubLString $str45$_ = makeString(")");

    private static final SubLSymbol DATE_QUESTION_QUERIFY_METHOD = makeSymbol("DATE-QUESTION-QUERIFY-METHOD");

    static private final SubLList $list48 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list49 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("PARSE")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PPARSE"), list(QUOTE, makeSymbol("LEXIFY")), makeSymbol("LEXICON")))), list(makeSymbol("QSUBJECT"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("QOBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("QPREDICATE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-PREDICATE")))), list(makeSymbol("ANSWERS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("LEXIFIED"), makeSymbol("QPREDICATE")), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("LEXIFIED"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("WORD")), list(makeSymbol("WORD-IMPLIES"), makeSymbol("WORD"), makeSymbol("QPREDICATE"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("QSUBJECT"), list(makeSymbol("WORD-TREE-P"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("WORD-IMPLIES"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("QSUBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CNOT"), makeSymbol("QSUBJECT"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("QOBJECT"), list(makeSymbol("WORD-TREE-P"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("WORD-IMPLIES"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))), list(QUOTE, makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("QOBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CNOT"), makeSymbol("QOBJECT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-MODIFIERS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CANDIDATE-ANSWER-P")), makeSymbol("CANDIDATE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), TEN_INTEGER), makeSymbol("ANSWERS")))))))))), list(RET, makeSymbol("ANSWERS"))));

    static private final SubLSymbol $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DATE-QUESTION-METHOD");

    private static final SubLSymbol DATE_QUESTION_EXTRACT_METHOD = makeSymbol("DATE-QUESTION-EXTRACT-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_date_question_class_alt(SubLObject new_instance) {
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
    public static SubLObject subloop_reserved_initialize_date_question_class(final SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_date_question_instance_alt(SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_date_question_instance(final SubLObject new_instance) {
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

    public static final SubLObject date_question_p_alt(SubLObject v_date_question) {
        return classes.subloop_instanceof_class(v_date_question, DATE_QUESTION);
    }

    public static SubLObject date_question_p(final SubLObject v_date_question) {
        return classes.subloop_instanceof_class(v_date_question, DATE_QUESTION);
    }

    /**
     *
     *
     * @return boolean; t if TREE is a date question, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if TREE is a date question, nil otherwise")
    public static final SubLObject date_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list_alt30, UNPROVIDED))) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$on_what_date));
    }

    /**
     *
     *
     * @return boolean; t if TREE is a date question, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if TREE is a date question, nil otherwise")
    public static SubLObject date_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, UNPROVIDED))) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$on_what_date));
    }

    /**
     *
     *
     * @return listp; the list of expected answers of this question
     */
    @LispMethod(comment = "@return listp; the list of expected answers of this question")
    public static final SubLObject date_question_answer_types_method_alt(SubLObject self) {
        return list(list($$Date), list($$Time_Quantity));
    }

    /**
     *
     *
     * @return listp; the list of expected answers of this question
     */
    @LispMethod(comment = "@return listp; the list of expected answers of this question")
    public static SubLObject date_question_answer_types_method(final SubLObject self) {
        return list(list($$Date), list($$Time_Quantity));
    }

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static final SubLObject date_question_answer_cardinality_method_alt(SubLObject self) {
        return TEN_INTEGER;
    }

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static SubLObject date_question_answer_cardinality_method(final SubLObject self) {
        return TEN_INTEGER;
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static final SubLObject date_question_querify_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_date_question_method = NIL;
            SubLObject corpora = question.get_question_corpora(self);
            try {
                try {
                    {
                        SubLObject queries = NIL;
                        SubLObject cdolist_list_var = corpora;
                        SubLObject corpus = NIL;
                        for (corpus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , corpus = cdolist_list_var.first()) {
                            queries = cons(search_engine.new_guruqa_query(cconcatenate($str_alt43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM, new SubLObject[]{ string_utilities.bunge(methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS), UNPROVIDED), $str_alt45$_ }), corpus), queries);
                        }
                        sublisp_throw($sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, queries);
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
                catch_var_for_date_question_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
            }
            return catch_var_for_date_question_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static SubLObject date_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_date_question_method = NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push($sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
            try {
                SubLObject queries = NIL;
                SubLObject cdolist_list_var = corpora;
                SubLObject corpus = NIL;
                corpus = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    queries = cons(search_engine.new_guruqa_query(cconcatenate($str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM, new SubLObject[]{ string_utilities.bunge(methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS), UNPROVIDED), $str45$_ }), corpus), queries);
                    cdolist_list_var = cdolist_list_var.rest();
                    corpus = cdolist_list_var.first();
                } 
                sublisp_throw($sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, queries);
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
            catch_var_for_date_question_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_date_question_method;
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static final SubLObject date_question_extract_method_alt(SubLObject self, SubLObject passage) {
        {
            SubLObject catch_var_for_date_question_method = NIL;
            SubLObject v_parser = question.get_question_parser(self);
            SubLObject lexicon = question.get_question_lexicon(self);
            SubLObject parse = question.get_question_parse(self);
            try {
                try {
                    methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                    {
                        SubLObject pparse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                        SubLObject lexified = (NIL != pparse) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(pparse, LEXIFY, lexicon))) : NIL;
                        SubLObject qsubject = methods.funcall_instance_method_with_0_args(parse, GET_SEMANTIC_SUBJECT);
                        SubLObject qobject = methods.funcall_instance_method_with_0_args(parse, GET_SEMANTIC_OBJECTS).first();
                        SubLObject qpredicate = methods.funcall_instance_method_with_0_args(parse, GET_PREDICATE);
                        SubLObject answers = NIL;
                        if ((NIL != lexified) && (NIL != qpredicate)) {
                            {
                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(lexified, YIELD);
                                SubLObject word = NIL;
                                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                                    if ((NIL != parse_tree.verbal_tree_p(word)) && (NIL != question.word_implies(word, qpredicate))) {
                                        if ((((NIL != qsubject) && (NIL != word_tree.word_tree_p(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT)))) && (NIL != question.word_implies(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT), GET_HEAD), methods.funcall_instance_method_with_0_args(qsubject, GET_HEAD)))) || (NIL == qsubject)) {
                                            if ((((NIL != qobject) && (NIL != word_tree.word_tree_p(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first()))) && (NIL != question.word_implies(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first(), GET_HEAD), methods.funcall_instance_method_with_0_args(qobject, GET_HEAD)))) || (NIL == qobject)) {
                                                {
                                                    SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_0_args(word, GET_MODIFIERS);
                                                    SubLObject mod = NIL;
                                                    for (mod = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , mod = cdolist_list_var_1.first()) {
                                                        {
                                                            SubLObject cdolist_list_var_2 = methods.funcall_instance_method_with_0_args(mod, YIELD);
                                                            SubLObject candidate = NIL;
                                                            for (candidate = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , candidate = cdolist_list_var_2.first()) {
                                                                if (NIL != methods.funcall_instance_method_with_1_args(self, CANDIDATE_ANSWER_P, candidate)) {
                                                                    answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, TEN_INTEGER, UNPROVIDED), answers);
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
                        sublisp_throw($sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, answers);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_parser(self, v_parser);
                            question.set_question_lexicon(self, lexicon);
                            question.set_question_parse(self, parse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_date_question_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
            }
            return catch_var_for_date_question_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static SubLObject date_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_date_question_method = NIL;
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject pparse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject lexified = (NIL != pparse) ? methods.funcall_instance_method_with_1_args(pparse, LEXIFY, lexicon) : NIL;
                final SubLObject qsubject = methods.funcall_instance_method_with_0_args(parse, GET_SEMANTIC_SUBJECT);
                final SubLObject qobject = methods.funcall_instance_method_with_0_args(parse, GET_SEMANTIC_OBJECTS).first();
                final SubLObject qpredicate = methods.funcall_instance_method_with_0_args(parse, GET_PREDICATE);
                SubLObject answers = NIL;
                if ((NIL != lexified) && (NIL != qpredicate)) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(lexified, YIELD);
                    SubLObject word = NIL;
                    word = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((((NIL != parse_tree.verbal_tree_p(word)) && (NIL != question.word_implies(word, qpredicate))) && ((((NIL != qsubject) && (NIL != word_tree.word_tree_p(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT)))) && (NIL != question.word_implies(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_SUBJECT), GET_HEAD), methods.funcall_instance_method_with_0_args(qsubject, GET_HEAD)))) || (NIL == qsubject))) && ((((NIL != qobject) && (NIL != word_tree.word_tree_p(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first()))) && (NIL != question.word_implies(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, GET_SEMANTIC_OBJECTS).first(), GET_HEAD), methods.funcall_instance_method_with_0_args(qobject, GET_HEAD)))) || (NIL == qobject))) {
                            SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(word, GET_MODIFIERS);
                            SubLObject mod = NIL;
                            mod = cdolist_list_var_$1.first();
                            while (NIL != cdolist_list_var_$1) {
                                SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(mod, YIELD);
                                SubLObject candidate = NIL;
                                candidate = cdolist_list_var_$2.first();
                                while (NIL != cdolist_list_var_$2) {
                                    if (NIL != methods.funcall_instance_method_with_1_args(self, CANDIDATE_ANSWER_P, candidate)) {
                                        answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, TEN_INTEGER, UNPROVIDED), answers);
                                    }
                                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                    candidate = cdolist_list_var_$2.first();
                                } 
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                mod = cdolist_list_var_$1.first();
                            } 
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        word = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, answers);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parser(self, v_parser);
                    question.set_question_lexicon(self, lexicon);
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_date_question_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_date_question_method;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ANSWER-TYPES"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")));

    static private final SubLList $list_alt25 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt26 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt27 = list(makeString("@return boolean; t if TREE is a date question, nil otherwise"), list(RET, list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("when"))))), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), makeString("on what date")))));

    static private final SubLList $list_alt30 = list(makeString("when"));

    static private final SubLList $list_alt33 = list(makeString("@return listp; the list of expected answers of this question"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("Date")), list(makeSymbol("LIST"), reader_make_constant_shell("Time-Quantity")))));

    static private final SubLList $list_alt38 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, TEN_INTEGER));

    static private final SubLList $list_alt41 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GURUQA-QUERY"), list(makeSymbol("CCONCATENATE"), makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) "), list(makeSymbol("BUNGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYSTRINGS")))), makeString(")")), makeSymbol("CORPUS")), makeSymbol("QUERIES"))), list(RET, makeSymbol("QUERIES"))));

    static private final SubLString $str_alt43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM = makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) ");

    static private final SubLString $str_alt45$_ = makeString(")");

    static private final SubLList $list_alt48 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list_alt49 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("PARSE")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PPARSE"), list(QUOTE, makeSymbol("LEXIFY")), makeSymbol("LEXICON")))), list(makeSymbol("QSUBJECT"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("QOBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("QPREDICATE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-PREDICATE")))), list(makeSymbol("ANSWERS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("LEXIFIED"), makeSymbol("QPREDICATE")), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("LEXIFIED"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("WORD")), list(makeSymbol("WORD-IMPLIES"), makeSymbol("WORD"), makeSymbol("QPREDICATE"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("QSUBJECT"), list(makeSymbol("WORD-TREE-P"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("WORD-IMPLIES"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("QSUBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CNOT"), makeSymbol("QSUBJECT"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("QOBJECT"), list(makeSymbol("WORD-TREE-P"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("WORD-IMPLIES"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS")))), list(QUOTE, makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("QOBJECT"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("CNOT"), makeSymbol("QOBJECT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(QUOTE, makeSymbol("GET-MODIFIERS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CANDIDATE-ANSWER-P")), makeSymbol("CANDIDATE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), TEN_INTEGER), makeSymbol("ANSWERS")))))))))), list(RET, makeSymbol("ANSWERS"))));

    public static SubLObject declare_date_question_file() {
        declareFunction("subloop_reserved_initialize_date_question_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_date_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("date_question_p", "DATE-QUESTION-P", 1, 0, false);
        declareFunction("date_question_isaP_method", "DATE-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("date_question_answer_types_method", "DATE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction("date_question_answer_cardinality_method", "DATE-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        declareFunction("date_question_querify_method", "DATE-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction("date_question_extract_method", "DATE-QUESTION-EXTRACT-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_date_question_file() {
        return NIL;
    }

    public static SubLObject setup_date_question_file() {
        classes.subloop_new_class(DATE_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(DATE_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(DATE_QUESTION, SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(DATE_QUESTION, SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE);
        subloop_reserved_initialize_date_question_class(DATE_QUESTION);
        methods.methods_incorporate_class_method($sym24$ISA_, DATE_QUESTION, $list25, $list26, $list27);
        methods.subloop_register_class_method(DATE_QUESTION, $sym24$ISA_, $sym32$DATE_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, DATE_QUESTION, $list25, NIL, $list33);
        methods.subloop_register_instance_method(DATE_QUESTION, ANSWER_TYPES, DATE_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_CARDINALITY, DATE_QUESTION, $list25, NIL, $list38);
        methods.subloop_register_instance_method(DATE_QUESTION, ANSWER_CARDINALITY, DATE_QUESTION_ANSWER_CARDINALITY_METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, DATE_QUESTION, $list25, NIL, $list41);
        methods.subloop_register_instance_method(DATE_QUESTION, QUERIFY, DATE_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, DATE_QUESTION, $list25, $list48, $list49);
        methods.subloop_register_instance_method(DATE_QUESTION, EXTRACT, DATE_QUESTION_EXTRACT_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_date_question_file();
    }

    @Override
    public void initializeVariables() {
        init_date_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_date_question_file();
    }

    
}

/**
 * Total time: 128 ms
 */
