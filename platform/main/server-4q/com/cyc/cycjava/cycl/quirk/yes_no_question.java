/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      YES-NO-QUESTION
 * source file: /cyc/top/cycl/quirk/yes-no-question.lisp
 * created:     2019/07/03 17:39:01
 */
public final class yes_no_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new yes_no_question();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol YES_NO_QUESTION = makeSymbol("YES-NO-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE");

    static private final SubLSymbol $sym23$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list25 = list(makeSymbol("TREE"));

    static private final SubLList $list26 = list(makeString("@param PARSE question-tree-p\n   @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise"), list(RET, list(makeSymbol("CAND"), list(makeSymbol("SQ-TREE-P"), makeSymbol("TREE")), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    static private final SubLSymbol $sym28$YES_NO_QUESTION_ISA__METHOD = makeSymbol("YES-NO-QUESTION-ISA?-METHOD");

    static private final SubLList $list29 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("SubLBoolean")))));



    private static final SubLSymbol YES_NO_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("YES-NO-QUESTION-ANSWER-TYPES-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_yes_no_question_class_alt(SubLObject new_instance) {
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
    public static SubLObject subloop_reserved_initialize_yes_no_question_class(final SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_yes_no_question_instance_alt(SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_yes_no_question_instance(final SubLObject new_instance) {
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

    public static final SubLObject yes_no_question_p_alt(SubLObject v_yes_no_question) {
        return classes.subloop_instanceof_class(v_yes_no_question, YES_NO_QUESTION);
    }

    public static SubLObject yes_no_question_p(final SubLObject v_yes_no_question) {
        return classes.subloop_instanceof_class(v_yes_no_question, YES_NO_QUESTION);
    }

    /**
     *
     *
     * @param PARSE
    question-tree-p
     * 		
     * @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise
     */
    @LispMethod(comment = "@param PARSE\nquestion-tree-p\r\n\t\t\r\n@return boolean; t if PARSE is a yes-no question parse tree, nil otherwise")
    public static final SubLObject yes_no_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean((NIL != parse_tree.sq_tree_p(tree)) && (NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))));
    }

    /**
     *
     *
     * @param PARSE
    question-tree-p
     * 		
     * @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise
     */
    @LispMethod(comment = "@param PARSE\nquestion-tree-p\r\n\t\t\r\n@return boolean; t if PARSE is a yes-no question parse tree, nil otherwise")
    public static SubLObject yes_no_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.sq_tree_p(tree)) && (NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))));
    }

    /**
     *
     *
     * @return list; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return list; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static final SubLObject yes_no_question_answer_types_method_alt(SubLObject self) {
        return list(list($$SubLBoolean));
    }

    /**
     *
     *
     * @return list; an enumeration of CycL collections any answer to this question
    must belong to. If nil, there is no such semantic type restriction
     */
    @LispMethod(comment = "@return list; an enumeration of CycL collections any answer to this question\r\nmust belong to. If nil, there is no such semantic type restriction")
    public static SubLObject yes_no_question_answer_types_method(final SubLObject self) {
        return list(list($$SubLBoolean));
    }

    public static SubLObject declare_yes_no_question_file() {
        declareFunction("subloop_reserved_initialize_yes_no_question_class", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_yes_no_question_instance", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("yes_no_question_p", "YES-NO-QUESTION-P", 1, 0, false);
        declareFunction("yes_no_question_isaP_method", "YES-NO-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("yes_no_question_answer_types_method", "YES-NO-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    public static SubLObject init_yes_no_question_file() {
        return NIL;
    }

    public static SubLObject setup_yes_no_question_file() {
        classes.subloop_new_class(YES_NO_QUESTION, QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(YES_NO_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(YES_NO_QUESTION, SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(YES_NO_QUESTION, SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE);
        subloop_reserved_initialize_yes_no_question_class(YES_NO_QUESTION);
        methods.methods_incorporate_class_method($sym23$ISA_, YES_NO_QUESTION, $list24, $list25, $list26);
        methods.subloop_register_class_method(YES_NO_QUESTION, $sym23$ISA_, $sym28$YES_NO_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, YES_NO_QUESTION, $list24, NIL, $list29);
        methods.subloop_register_instance_method(YES_NO_QUESTION, ANSWER_TYPES, YES_NO_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt25 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt26 = list(makeString("@param PARSE question-tree-p\n   @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise"), list(RET, list(makeSymbol("CAND"), list(makeSymbol("SQ-TREE-P"), makeSymbol("TREE")), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    @Override
    public void declareFunctions() {
        declare_yes_no_question_file();
    }

    @Override
    public void initializeVariables() {
        init_yes_no_question_file();
    }

    static private final SubLList $list_alt29 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("SubLBoolean")))));

    @Override
    public void runTopLevelForms() {
        setup_yes_no_question_file();
    }

    static {
    }
}

/**
 * Total time: 76 ms
 */
