package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class date_question extends SubLTranslatedFile {
    public static final SubLFile me = new date_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.date_question";

    public static final String myFingerPrint = "0d738612c347cd21abf411d4673556065837196c4d1f06766a76ee7e8904cd67";

    // Internal Constants
    public static final SubLSymbol DATE_QUESTION = makeSymbol("DATE-QUESTION");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ANSWER-TYPES"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")));





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE");

    public static final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list25 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list26 = list(makeSymbol("TREE"));

    public static final SubLList $list27 = list(makeString("@return boolean; t if TREE is a date question, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("when"))))), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("on what date")))));





    public static final SubLList $list30 = list(makeString("when"));

    public static final SubLString $$$on_what_date = makeString("on what date");

    public static final SubLSymbol $sym32$DATE_QUESTION_ISA__METHOD = makeSymbol("DATE-QUESTION-ISA?-METHOD");

    public static final SubLList $list33 = list(makeString("@return listp; the list of expected answers of this question"), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Date"))), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Time-Quantity"))))));

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

    private static final SubLObject $$Time_Quantity = reader_make_constant_shell(makeString("Time-Quantity"));

    public static final SubLSymbol DATE_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("DATE-QUESTION-ANSWER-TYPES-METHOD");



    public static final SubLList $list38 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(makeSymbol("RET"), TEN_INTEGER));

    public static final SubLSymbol DATE_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("DATE-QUESTION-ANSWER-CARDINALITY-METHOD");



    public static final SubLList $list41 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GURUQA-QUERY"), list(makeSymbol("CCONCATENATE"), makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) "), list(makeSymbol("BUNGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYSTRINGS")))), makeString(")")), makeSymbol("CORPUS")), makeSymbol("QUERIES"))), list(makeSymbol("RET"), makeSymbol("QUERIES"))));

    public static final SubLSymbol $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DATE-QUESTION-METHOD");

    public static final SubLString $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM = makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) ");



    public static final SubLString $str45$_ = makeString(")");

    public static final SubLSymbol DATE_QUESTION_QUERIFY_METHOD = makeSymbol("DATE-QUESTION-QUERIFY-METHOD");



    public static final SubLList $list48 = list(makeSymbol("PASSAGE"));

    public static final SubLList $list49 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("PPARSE"), list(makeSymbol("FIM"), makeSymbol("PPARSE"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY")), makeSymbol("LEXICON")))), list(makeSymbol("QSUBJECT"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("QOBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("QPREDICATE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-PREDICATE")))), list(makeSymbol("ANSWERS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("LEXIFIED"), makeSymbol("QPREDICATE")), list(makeSymbol("CDOLIST"), list(makeSymbol("WORD"), list(makeSymbol("FIM"), makeSymbol("LEXIFIED"), list(makeSymbol("QUOTE"), makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("WORD")), list(makeSymbol("WORD-IMPLIES"), makeSymbol("WORD"), makeSymbol("QPREDICATE"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("QSUBJECT"), list(makeSymbol("WORD-TREE-P"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("WORD-IMPLIES"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT"))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("QSUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("CNOT"), makeSymbol("QSUBJECT"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("QOBJECT"), list(makeSymbol("WORD-TREE-P"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-OBJECTS"))))), list(makeSymbol("WORD-IMPLIES"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-OBJECTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("QOBJECT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("CNOT"), makeSymbol("QOBJECT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIERS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(makeSymbol("QUOTE"), makeSymbol("YIELD")))), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CANDIDATE-ANSWER-P")), makeSymbol("CANDIDATE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), TEN_INTEGER), makeSymbol("ANSWERS")))))))))), list(makeSymbol("RET"), makeSymbol("ANSWERS"))));

    public static final SubLSymbol $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DATE-QUESTION-METHOD");





















    public static final SubLSymbol DATE_QUESTION_EXTRACT_METHOD = makeSymbol("DATE-QUESTION-EXTRACT-METHOD");

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

    public static SubLObject date_question_p(final SubLObject v_date_question) {
        return classes.subloop_instanceof_class(v_date_question, DATE_QUESTION);
    }

    public static SubLObject date_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, UNPROVIDED))) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$on_what_date));
    }

    public static SubLObject date_question_answer_types_method(final SubLObject self) {
        return list(list($$Date), list($$Time_Quantity));
    }

    public static SubLObject date_question_answer_cardinality_method(final SubLObject self) {
        return TEN_INTEGER;
    }

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

    public static SubLObject declare_date_question_file() {
        declareFunction(me, "subloop_reserved_initialize_date_question_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_date_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "date_question_p", "DATE-QUESTION-P", 1, 0, false);
        declareFunction(me, "date_question_isaP_method", "DATE-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "date_question_answer_types_method", "DATE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction(me, "date_question_answer_cardinality_method", "DATE-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        declareFunction(me, "date_question_querify_method", "DATE-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction(me, "date_question_extract_method", "DATE-QUESTION-EXTRACT-METHOD", 2, 0, false);
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
