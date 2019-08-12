/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WHAT-QUESTION
 * source file: /cyc/top/cycl/quirk/what-question.lisp
 * created:     2019/07/03 17:39:01
 */
public final class what_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new what_question();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.what_question";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol WHAT_QUESTION = makeSymbol("WHAT-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-PERCENTAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FOCUS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-INSTANCE");

    static private final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list25 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list26 = list(makeSymbol("TREE"));

    static private final SubLList $list27 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("what"), makeString("which"))), list(QUOTE, EQUALP)), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(QUOTE, makeSymbol("GET-PREDICATE"))))))));

    static private final SubLList $list30 = list(makeString("what"), makeString("which"));

    static private final SubLSymbol $sym33$WHAT_QUESTION_ISA__METHOD = makeSymbol("WHAT-QUESTION-ISA?-METHOD");

    static private final SubLList $list35 = list(makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), list(RET, makeInteger(100)));

    private static final SubLSymbol WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD = makeSymbol("WHAT-QUESTION-REQUIRE-PERCENTAGE-METHOD");

    static private final SubLList $list39 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-FOCUS"))))), list(makeSymbol("PWHEN"), makeSymbol("FOCUS"), list(makeSymbol("CLET"), list(list(makeSymbol("SEARCH-TERMS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("WORD-TREE-GET-STRING-METHOD")), list(makeSymbol("SET-DIFFERENCE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS"))), list(makeSymbol("FIM"), makeSymbol("FOCUS"), list(QUOTE, makeSymbol("YIELD")))))), makeSymbol("SEARCH-TYPE"), list(makeSymbol("SEARCH-TYPES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PATH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWER-TYPES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE"), makeSymbol("PATH")), list(makeSymbol("CSETQ"), makeSymbol("SEARCH-TYPE"), list(makeSymbol("CYC-TO-RESPORATOR"), makeSymbol("TYPE"))), list(makeSymbol("PWHEN"), makeSymbol("SEARCH-TYPE"), list(makeSymbol("CPUSH"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("SEARCH-TYPE")), makeString("$")), makeSymbol("SEARCH-TYPES"))))), list(makeSymbol("PIF"), makeSymbol("SEARCH-TYPES"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-GURUQA-QUERY"), list(makeSymbol("CCONCATENATE"), makeString("@SEN(@SYN("), list(makeSymbol("BUNGE"), makeSymbol("SEARCH-TYPES")), makeString(") "), list(makeSymbol("BUNGE"), makeSymbol("SEARCH-TERMS")), makeString(")"))))), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING")))))))))));

    static private final SubLSymbol $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");

    private static final SubLSymbol WORD_TREE_GET_STRING_METHOD = makeSymbol("WORD-TREE-GET-STRING-METHOD");

    static private final SubLString $str45$_ = makeString("$");

    static private final SubLString $str46$_SEN__SYN_ = makeString("@SEN(@SYN(");

    static private final SubLString $str47$__ = makeString(") ");

    static private final SubLString $str48$_ = makeString(")");

    private static final SubLSymbol WHAT_QUESTION_QUERIFY_METHOD = makeSymbol("WHAT-QUESTION-QUERIFY-METHOD");

    static private final SubLList $list51 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list52 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("SENTENCE"), list(makeSymbol("SENTENCIFY"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("TAGGED"), list(makeSymbol("TAGGER-TAG-SENTENCE"), makeSymbol("TAGGER"), makeSymbol("SENTENCE"))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE")), makeSymbol("TAGGED")))), list(makeSymbol("YIELD"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("WH-QUESTION")), list(QUOTE, makeSymbol("SENTENCE2WORD-TREES")), makeSymbol("LEXIFIED"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("SET-DIFFERENCE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS"))), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-FOCUS"))), list(QUOTE, makeSymbol("YIELD"))))), list(makeSymbol("ANSWERS"), NIL), makeSymbol("I")), list(makeSymbol("PWHEN"), makeSymbol("LEXIFIED"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("BEFORE"), makeSymbol("AFTER"), makeSymbol("DEVIATION"), makeSymbol("FOUND")), list(makeSymbol("SPLIT-YIELD"), makeSymbol("YIELD"), makeSymbol("KEYWORDS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DEVIATION"), list(makeSymbol("<"), makeSymbol("DEVIATION"), EIGHT_INTEGER), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("KEYWORDS")), makeSymbol("FOUND"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATES"), list(makeSymbol("LIST"), makeSymbol("BEFORE"), makeSymbol("AFTER"))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("SCORE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-TYPE-MATCH")), makeSymbol("CANDIDATE")))), list(makeSymbol("PWHEN"), list(makeSymbol("PLUSP"), makeSymbol("SCORE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), list(makeSymbol("*"), makeSymbol("SCORE"), list(makeSymbol("/"), ONE_INTEGER, list(makeSymbol("FIF"), list(makeSymbol("<"), makeSymbol("I"), FOUR_INTEGER), ONE_INTEGER, makeSymbol("I"))))), makeSymbol("ANSWERS"))))))))), list(RET, makeSymbol("ANSWERS"))));

    static private final SubLSymbol $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");

    private static final SubLSymbol SENTENCE2WORD_TREES = makeSymbol("SENTENCE2WORD-TREES");

    private static final SubLSymbol TREE_TYPE_MATCH = makeSymbol("TREE-TYPE-MATCH");

    private static final SubLSymbol WHAT_QUESTION_EXTRACT_METHOD = makeSymbol("WHAT-QUESTION-EXTRACT-METHOD");

    static private final SubLList $list60 = list(makeString("@return parse-tree-p; the focus of this what-question"), list(RET, list(makeSymbol("FIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUBJECT-QUESTION-P"))), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-OBJECTS")))))));

    static private final SubLSymbol $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");

    private static final SubLSymbol SUBJECT_QUESTION_P = makeSymbol("SUBJECT-QUESTION-P");

    private static final SubLSymbol WHAT_QUESTION_GET_FOCUS_METHOD = makeSymbol("WHAT-QUESTION-GET-FOCUS-METHOD");

    static private final SubLList $list65 = list(makeString("@return listp; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-FOCUS")))), list(makeSymbol("HEAD"), list(makeSymbol("FWHEN"), makeSymbol("FOCUS"), list(makeSymbol("FIM"), makeSymbol("FOCUS"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("FOCUS-STRING"), list(makeSymbol("FWHEN"), makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-STRING"))))), list(makeSymbol("LEXTYPES"), NIL), list(makeSymbol("MYTYPES"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("FOCUS-STRING"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("FOCUS-STRING")), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), list(makeSymbol("STRING-DOWNCASE"), makeSymbol("FOCUS-STRING"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INTERSECTION"), list(QUOTE, list(makeKeyword("NN"), makeKeyword("NNS"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), list(QUOTE, EQ)), list(makeSymbol("CPUSHNEW"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")), makeSymbol("LEXTYPES")))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEXTYPE"), makeSymbol("LEXTYPES")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE-PATH"), list(makeSymbol("LIST"), makeSymbol("LEXTYPE")))), list(makeSymbol("CPUSH"), list(makeSymbol("NREVERSE"), makeSymbol("TYPE-PATH")), makeSymbol("MYTYPES"))))), list(RET, makeSymbol("MYTYPES")))));

    static private final SubLSymbol $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");

    static private final SubLList $list68 = list(makeKeyword("NN"), makeKeyword("NNS"));



    private static final SubLSymbol WHAT_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("WHAT-QUESTION-ANSWER-TYPES-METHOD");

    static private final SubLList $list76 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, makeInteger(25)));



    private static final SubLSymbol WHAT_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("WHAT-QUESTION-ANSWER-CARDINALITY-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_what_question_class_alt(SubLObject new_instance) {
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
    public static SubLObject subloop_reserved_initialize_what_question_class(final SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_what_question_instance_alt(SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_what_question_instance(final SubLObject new_instance) {
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

    public static final SubLObject what_question_p_alt(SubLObject v_what_question) {
        return classes.subloop_instanceof_class(v_what_question, WHAT_QUESTION);
    }

    public static SubLObject what_question_p(final SubLObject v_what_question) {
        return classes.subloop_instanceof_class(v_what_question, WHAT_QUESTION);
    }

    public static final SubLObject what_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean((((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list_alt30, EQUALP))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_SUBJECT))) && (NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_PREDICATE))));
    }

    public static SubLObject what_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, EQUALP))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_SUBJECT))) && (NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_PREDICATE))));
    }

    /**
     *
     *
     * @return positive-integer-p; the percentage of total confidence weight of candidate
    answers to be returned as actual answers
     */
    @LispMethod(comment = "@return positive-integer-p; the percentage of total confidence weight of candidate\r\nanswers to be returned as actual answers")
    public static final SubLObject what_question_require_percentage_method_alt(SubLObject self) {
        return $int$100;
    }

    /**
     *
     *
     * @return positive-integer-p; the percentage of total confidence weight of candidate
    answers to be returned as actual answers
     */
    @LispMethod(comment = "@return positive-integer-p; the percentage of total confidence weight of candidate\r\nanswers to be returned as actual answers")
    public static SubLObject what_question_require_percentage_method(final SubLObject self) {
        return $int$100;
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static final SubLObject what_question_querify_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_what_question_method = NIL;
            SubLObject answer_types = question.get_question_answer_types(self);
            try {
                try {
                    {
                        SubLObject focus = methods.funcall_instance_method_with_0_args(self, GET_FOCUS);
                        if (NIL != focus) {
                            {
                                SubLObject search_terms = Mapping.mapcar(WORD_TREE_GET_STRING_METHOD, set_difference(methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS), methods.funcall_instance_method_with_0_args(focus, YIELD), UNPROVIDED, UNPROVIDED));
                                SubLObject search_type = NIL;
                                SubLObject search_types = NIL;
                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, ANSWER_TYPES);
                                SubLObject path = NIL;
                                for (path = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , path = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_1 = path;
                                        SubLObject type = NIL;
                                        for (type = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , type = cdolist_list_var_1.first()) {
                                            search_type = question.cyc_to_resporator(type);
                                            if (NIL != search_type) {
                                                search_types = cons(cconcatenate(princ_to_string(search_type), $str_alt45$_), search_types);
                                            }
                                        }
                                    }
                                }
                                if (NIL != search_types) {
                                    sublisp_throw($sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, list(search_engine.new_guruqa_query(cconcatenate($str_alt46$_SEN__SYN_, new SubLObject[]{ string_utilities.bunge(search_types, UNPROVIDED), $str_alt47$__, string_utilities.bunge(search_terms, UNPROVIDED), $str_alt48$_ }), UNPROVIDED)));
                                } else {
                                    sublisp_throw($sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, list(search_engine.new_lemur_query(methods.funcall_instance_method_with_0_args(self, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                                }
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            question.set_question_answer_types(self, answer_types);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            }
            return catch_var_for_what_question_method;
        }
    }

    /**
     *
     *
     * @return listp; a list of queries likely to extract passages relevant to answer
    this question
     */
    @LispMethod(comment = "@return listp; a list of queries likely to extract passages relevant to answer\r\nthis question")
    public static SubLObject what_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = NIL;
        final SubLObject answer_types = question.get_question_answer_types(self);
        try {
            thread.throwStack.push($sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                final SubLObject focus = methods.funcall_instance_method_with_0_args(self, GET_FOCUS);
                if (NIL != focus) {
                    final SubLObject search_terms = Mapping.mapcar(WORD_TREE_GET_STRING_METHOD, set_difference(methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS), methods.funcall_instance_method_with_0_args(focus, YIELD), UNPROVIDED, UNPROVIDED));
                    SubLObject search_type = NIL;
                    SubLObject search_types = NIL;
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, ANSWER_TYPES);
                    SubLObject path = NIL;
                    path = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$1 = path;
                        SubLObject type = NIL;
                        type = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            search_type = question.cyc_to_resporator(type);
                            if (NIL != search_type) {
                                search_types = cons(cconcatenate(princ_to_string(search_type), $str45$_), search_types);
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            type = cdolist_list_var_$1.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        path = cdolist_list_var.first();
                    } 
                    if (NIL != search_types) {
                        sublisp_throw($sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, list(search_engine.new_guruqa_query(cconcatenate($str46$_SEN__SYN_, new SubLObject[]{ string_utilities.bunge(search_types, UNPROVIDED), $str47$__, string_utilities.bunge(search_terms, UNPROVIDED), $str48$_ }), UNPROVIDED)));
                    } else {
                        sublisp_throw($sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, list(search_engine.new_lemur_query(methods.funcall_instance_method_with_0_args(self, GET_STRING), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    }
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_answer_types(self, answer_types);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static final SubLObject what_question_extract_method_alt(SubLObject self, SubLObject passage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_what_question_method = NIL;
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
                            SubLObject keywords = set_difference(methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS), methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, GET_FOCUS), YIELD), UNPROVIDED, UNPROVIDED);
                            SubLObject answers = NIL;
                            SubLObject i = NIL;
                            if (NIL != lexified) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject before = question.split_yield(yield, keywords);
                                    SubLObject after = thread.secondMultipleValue();
                                    SubLObject deviation = thread.thirdMultipleValue();
                                    SubLObject found = thread.fourthMultipleValue();
                                    thread.resetMultipleValues();
                                    if (((NIL != deviation) && deviation.numL(EIGHT_INTEGER)) && length(keywords).numE(found)) {
                                        {
                                            SubLObject cdolist_list_var = list(before, after);
                                            SubLObject candidates = NIL;
                                            for (candidates = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidates = cdolist_list_var.first()) {
                                                i = ZERO_INTEGER;
                                                {
                                                    SubLObject cdolist_list_var_2 = candidates;
                                                    SubLObject candidate = NIL;
                                                    for (candidate = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , candidate = cdolist_list_var_2.first()) {
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
                            sublisp_throw($sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, answers);
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
                    catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
                }
                return catch_var_for_what_question_method;
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of answers to this question from PASSAGE
     */
    @LispMethod(comment = "@return listp; a list of answers to this question from PASSAGE")
    public static SubLObject what_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = NIL;
        final SubLObject tagger = question.get_question_tagger(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        try {
            thread.throwStack.push($sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject sentence = question.sentencify(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
                final SubLObject lexified = (NIL != sentence) ? methods.funcall_instance_method_with_1_args(lexicon, LEXIFY_SENTENCE, tagged) : NIL;
                final SubLObject yield = methods.funcall_class_method_with_1_args(WH_QUESTION, SENTENCE2WORD_TREES, lexified);
                final SubLObject keywords = set_difference(methods.funcall_instance_method_with_0_args(self, GET_KEYWORDS), methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, GET_FOCUS), YIELD), UNPROVIDED, UNPROVIDED);
                SubLObject answers = NIL;
                SubLObject i = NIL;
                if (NIL != lexified) {
                    thread.resetMultipleValues();
                    final SubLObject before = question.split_yield(yield, keywords);
                    final SubLObject after = thread.secondMultipleValue();
                    final SubLObject deviation = thread.thirdMultipleValue();
                    final SubLObject found = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (((NIL != deviation) && deviation.numL(EIGHT_INTEGER)) && length(keywords).numE(found)) {
                        SubLObject cdolist_list_var = list(before, after);
                        SubLObject candidates = NIL;
                        candidates = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            i = ZERO_INTEGER;
                            SubLObject cdolist_list_var_$2 = candidates;
                            SubLObject candidate = NIL;
                            candidate = cdolist_list_var_$2.first();
                            while (NIL != cdolist_list_var_$2) {
                                i = add(i, ONE_INTEGER);
                                final SubLObject score = methods.funcall_instance_method_with_1_args(self, TREE_TYPE_MATCH, candidate);
                                if (score.isPositive()) {
                                    answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, GET_STRING), passage, multiply(score, divide(ONE_INTEGER, i.numL(FOUR_INTEGER) ? ONE_INTEGER : i)), UNPROVIDED), answers);
                                }
                                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                candidate = cdolist_list_var_$2.first();
                            } 
                            cdolist_list_var = cdolist_list_var.rest();
                            candidates = cdolist_list_var.first();
                        } 
                    }
                }
                sublisp_throw($sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, answers);
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
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-PERCENTAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FOCUS"), NIL, makeKeyword("PROTECTED")));

    /**
     *
     *
     * @return parse-tree-p; the focus of this what-question
     */
    @LispMethod(comment = "@return parse-tree-p; the focus of this what-question")
    public static final SubLObject what_question_get_focus_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_what_question_method = NIL;
            SubLObject parse = question.get_question_parse(self);
            try {
                try {
                    sublisp_throw($sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_QUESTION_P) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(parse, GET_SUBJECT))) : methods.funcall_instance_method_with_0_args(parse, GET_OBJECTS).first());
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
                catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            }
            return catch_var_for_what_question_method;
        }
    }

    /**
     *
     *
     * @return parse-tree-p; the focus of this what-question
     */
    @LispMethod(comment = "@return parse-tree-p; the focus of this what-question")
    public static SubLObject what_question_get_focus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                sublisp_throw($sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_QUESTION_P) ? methods.funcall_instance_method_with_0_args(parse, GET_SUBJECT) : methods.funcall_instance_method_with_0_args(parse, GET_OBJECTS).first());
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
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }

    static private final SubLList $list_alt25 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt26 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt27 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("what"), makeString("which"))), list(QUOTE, EQUALP)), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(QUOTE, makeSymbol("GET-PREDICATE"))))))));

    static private final SubLList $list_alt30 = list(makeString("what"), makeString("which"));

    /**
     *
     *
     * @return listp; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return listp; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static final SubLObject what_question_answer_types_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_what_question_method = NIL;
                SubLObject lexicon = question.get_question_lexicon(self);
                try {
                    try {
                        {
                            SubLObject focus = methods.funcall_instance_method_with_0_args(self, GET_FOCUS);
                            SubLObject head = (NIL != focus) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(focus, GET_HEAD))) : NIL;
                            SubLObject focus_string = (NIL != head) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(head, GET_STRING))) : NIL;
                            SubLObject lextypes = NIL;
                            SubLObject mytypes = NIL;
                            if (NIL != focus_string) {
                                {
                                    SubLObject cdolist_list_var = append(methods.funcall_instance_method_with_1_args(lexicon, GET, focus_string), methods.funcall_instance_method_with_1_args(lexicon, GET, Strings.string_downcase(focus_string, UNPROVIDED, UNPROVIDED)));
                                    SubLObject lex = NIL;
                                    for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                                        if (NIL != intersection($list_alt68, methods.funcall_instance_method_with_1_args(lex, GET, $PENN_TAGS), EQ, UNPROVIDED)) {
                                            {
                                                SubLObject item_var = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                                                if (NIL == member(item_var, lextypes, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    lextypes = cons(item_var, lextypes);
                                                }
                                            }
                                        }
                                    }
                                }
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        {
                                            SubLObject cdolist_list_var = lextypes;
                                            SubLObject lextype = NIL;
                                            for (lextype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lextype = cdolist_list_var.first()) {
                                                {
                                                    SubLObject type_path = list(lextype);
                                                    mytypes = cons(nreverse(type_path), mytypes);
                                                }
                                            }
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                sublisp_throw($sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, mytypes);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                question.set_question_lexicon(self, lexicon);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
                }
                return catch_var_for_what_question_method;
            }
        }
    }

    /**
     *
     *
     * @return listp; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return listp; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static SubLObject what_question_answer_types_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = NIL;
        final SubLObject lexicon = question.get_question_lexicon(self);
        try {
            thread.throwStack.push($sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                final SubLObject focus = methods.funcall_instance_method_with_0_args(self, GET_FOCUS);
                final SubLObject head = (NIL != focus) ? methods.funcall_instance_method_with_0_args(focus, GET_HEAD) : NIL;
                final SubLObject focus_string = (NIL != head) ? methods.funcall_instance_method_with_0_args(head, GET_STRING) : NIL;
                SubLObject lextypes = NIL;
                SubLObject mytypes = NIL;
                if (NIL != focus_string) {
                    SubLObject cdolist_list_var = append(methods.funcall_instance_method_with_1_args(lexicon, GET, focus_string), methods.funcall_instance_method_with_1_args(lexicon, GET, Strings.string_downcase(focus_string, UNPROVIDED, UNPROVIDED)));
                    SubLObject lex = NIL;
                    lex = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != intersection($list68, methods.funcall_instance_method_with_1_args(lex, GET, $PENN_TAGS), EQ, UNPROVIDED)) {
                            final SubLObject item_var = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
                            if (NIL == member(item_var, lextypes, symbol_function(EQL), symbol_function(IDENTITY))) {
                                lextypes = cons(item_var, lextypes);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lex = cdolist_list_var.first();
                    } 
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        SubLObject cdolist_list_var2 = lextypes;
                        SubLObject lextype = NIL;
                        lextype = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject type_path = list(lextype);
                            mytypes = cons(nreverse(type_path), mytypes);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            lextype = cdolist_list_var2.first();
                        } 
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    sublisp_throw($sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, mytypes);
                }
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }

    static private final SubLList $list_alt35 = list(makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), list(RET, makeInteger(100)));

    static private final SubLList $list_alt39 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-FOCUS"))))), list(makeSymbol("PWHEN"), makeSymbol("FOCUS"), list(makeSymbol("CLET"), list(list(makeSymbol("SEARCH-TERMS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("WORD-TREE-GET-STRING-METHOD")), list(makeSymbol("SET-DIFFERENCE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS"))), list(makeSymbol("FIM"), makeSymbol("FOCUS"), list(QUOTE, makeSymbol("YIELD")))))), makeSymbol("SEARCH-TYPE"), list(makeSymbol("SEARCH-TYPES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PATH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWER-TYPES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE"), makeSymbol("PATH")), list(makeSymbol("CSETQ"), makeSymbol("SEARCH-TYPE"), list(makeSymbol("CYC-TO-RESPORATOR"), makeSymbol("TYPE"))), list(makeSymbol("PWHEN"), makeSymbol("SEARCH-TYPE"), list(makeSymbol("CPUSH"), list(makeSymbol("CCONCATENATE"), list(makeSymbol("PRINC-TO-STRING"), makeSymbol("SEARCH-TYPE")), makeString("$")), makeSymbol("SEARCH-TYPES"))))), list(makeSymbol("PIF"), makeSymbol("SEARCH-TYPES"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-GURUQA-QUERY"), list(makeSymbol("CCONCATENATE"), makeString("@SEN(@SYN("), list(makeSymbol("BUNGE"), makeSymbol("SEARCH-TYPES")), makeString(") "), list(makeSymbol("BUNGE"), makeSymbol("SEARCH-TERMS")), makeString(")"))))), list(RET, list(makeSymbol("LIST"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING")))))))))));

    static private final SubLString $str_alt45$_ = makeString("$");

    static private final SubLString $str_alt46$_SEN__SYN_ = makeString("@SEN(@SYN(");

    static private final SubLString $str_alt47$__ = makeString(") ");

    static private final SubLString $str_alt48$_ = makeString(")");

    static private final SubLList $list_alt51 = list(makeSymbol("PASSAGE"));

    static private final SubLList $list_alt52 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("SENTENCE"), list(makeSymbol("SENTENCIFY"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("TAGGED"), list(makeSymbol("TAGGER-TAG-SENTENCE"), makeSymbol("TAGGER"), makeSymbol("SENTENCE"))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("LEXIFY-SENTENCE")), makeSymbol("TAGGED")))), list(makeSymbol("YIELD"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("WH-QUESTION")), list(QUOTE, makeSymbol("SENTENCE2WORD-TREES")), makeSymbol("LEXIFIED"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("SET-DIFFERENCE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORDS"))), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-FOCUS"))), list(QUOTE, makeSymbol("YIELD"))))), list(makeSymbol("ANSWERS"), NIL), makeSymbol("I")), list(makeSymbol("PWHEN"), makeSymbol("LEXIFIED"), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("BEFORE"), makeSymbol("AFTER"), makeSymbol("DEVIATION"), makeSymbol("FOUND")), list(makeSymbol("SPLIT-YIELD"), makeSymbol("YIELD"), makeSymbol("KEYWORDS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DEVIATION"), list(makeSymbol("<"), makeSymbol("DEVIATION"), EIGHT_INTEGER), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("KEYWORDS")), makeSymbol("FOUND"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATES"), list(makeSymbol("LIST"), makeSymbol("BEFORE"), makeSymbol("AFTER"))), list(makeSymbol("CSETQ"), makeSymbol("I"), ZERO_INTEGER), list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")), list(makeSymbol("CINC"), makeSymbol("I")), list(makeSymbol("CLET"), list(list(makeSymbol("SCORE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-TYPE-MATCH")), makeSymbol("CANDIDATE")))), list(makeSymbol("PWHEN"), list(makeSymbol("PLUSP"), makeSymbol("SCORE")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), list(makeSymbol("*"), makeSymbol("SCORE"), list(makeSymbol("/"), ONE_INTEGER, list(makeSymbol("FIF"), list(makeSymbol("<"), makeSymbol("I"), FOUR_INTEGER), ONE_INTEGER, makeSymbol("I"))))), makeSymbol("ANSWERS"))))))))), list(RET, makeSymbol("ANSWERS"))));

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static final SubLObject what_question_answer_cardinality_method_alt(SubLObject self) {
        return $int$25;
    }

    /**
     *
     *
     * @return positive-integer-p; the number of answers expected for this question
     */
    @LispMethod(comment = "@return positive-integer-p; the number of answers expected for this question")
    public static SubLObject what_question_answer_cardinality_method(final SubLObject self) {
        return $int$25;
    }

    public static SubLObject declare_what_question_file() {
        declareFunction("subloop_reserved_initialize_what_question_class", "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_what_question_instance", "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("what_question_p", "WHAT-QUESTION-P", 1, 0, false);
        declareFunction("what_question_isaP_method", "WHAT-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("what_question_require_percentage_method", "WHAT-QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false);
        declareFunction("what_question_querify_method", "WHAT-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction("what_question_extract_method", "WHAT-QUESTION-EXTRACT-METHOD", 2, 0, false);
        declareFunction("what_question_get_focus_method", "WHAT-QUESTION-GET-FOCUS-METHOD", 1, 0, false);
        declareFunction("what_question_answer_types_method", "WHAT-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction("what_question_answer_cardinality_method", "WHAT-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_what_question_file() {
        return NIL;
    }

    public static SubLObject setup_what_question_file() {
        classes.subloop_new_class(WHAT_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(WHAT_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(WHAT_QUESTION, SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(WHAT_QUESTION, SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE);
        subloop_reserved_initialize_what_question_class(WHAT_QUESTION);
        methods.methods_incorporate_class_method($sym24$ISA_, WHAT_QUESTION, $list25, $list26, $list27);
        methods.subloop_register_class_method(WHAT_QUESTION, $sym24$ISA_, $sym33$WHAT_QUESTION_ISA__METHOD);
        methods.methods_incorporate_class_method(REQUIRE_PERCENTAGE, WHAT_QUESTION, $list25, NIL, $list35);
        methods.subloop_register_class_method(WHAT_QUESTION, REQUIRE_PERCENTAGE, WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, WHAT_QUESTION, $list25, NIL, $list39);
        methods.subloop_register_instance_method(WHAT_QUESTION, QUERIFY, WHAT_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, WHAT_QUESTION, $list25, $list51, $list52);
        methods.subloop_register_instance_method(WHAT_QUESTION, EXTRACT, WHAT_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method(GET_FOCUS, WHAT_QUESTION, $list25, NIL, $list60);
        methods.subloop_register_instance_method(WHAT_QUESTION, GET_FOCUS, WHAT_QUESTION_GET_FOCUS_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, WHAT_QUESTION, $list25, NIL, $list65);
        methods.subloop_register_instance_method(WHAT_QUESTION, ANSWER_TYPES, WHAT_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_CARDINALITY, WHAT_QUESTION, $list25, NIL, $list76);
        methods.subloop_register_instance_method(WHAT_QUESTION, ANSWER_CARDINALITY, WHAT_QUESTION_ANSWER_CARDINALITY_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt60 = list(makeString("@return parse-tree-p; the focus of this what-question"), list(RET, list(makeSymbol("FIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUBJECT-QUESTION-P"))), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(QUOTE, makeSymbol("GET-OBJECTS")))))));

    static private final SubLList $list_alt65 = list(makeString("@return listp; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-FOCUS")))), list(makeSymbol("HEAD"), list(makeSymbol("FWHEN"), makeSymbol("FOCUS"), list(makeSymbol("FIM"), makeSymbol("FOCUS"), list(QUOTE, makeSymbol("GET-HEAD"))))), list(makeSymbol("FOCUS-STRING"), list(makeSymbol("FWHEN"), makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-STRING"))))), list(makeSymbol("LEXTYPES"), NIL), list(makeSymbol("MYTYPES"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("FOCUS-STRING"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), makeSymbol("FOCUS-STRING")), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), list(makeSymbol("STRING-DOWNCASE"), makeSymbol("FOCUS-STRING"))))), list(makeSymbol("PWHEN"), list(makeSymbol("INTERSECTION"), list(QUOTE, list(makeKeyword("NN"), makeKeyword("NNS"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS")), list(QUOTE, EQ)), list(makeSymbol("CPUSHNEW"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")), makeSymbol("LEXTYPES")))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEXTYPE"), makeSymbol("LEXTYPES")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE-PATH"), list(makeSymbol("LIST"), makeSymbol("LEXTYPE")))), list(makeSymbol("CPUSH"), list(makeSymbol("NREVERSE"), makeSymbol("TYPE-PATH")), makeSymbol("MYTYPES"))))), list(RET, makeSymbol("MYTYPES")))));

    @Override
    public void declareFunctions() {
        declare_what_question_file();
    }

    @Override
    public void initializeVariables() {
        init_what_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_what_question_file();
    }

    static {
    }

    static private final SubLList $list_alt68 = list(makeKeyword("NN"), makeKeyword("NNS"));

    static private final SubLList $list_alt76 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(RET, makeInteger(25)));
}

/**
 * Total time: 428 ms
 */
