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
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CARDINAL-QUESTION
 * source file: /cyc/top/cycl/quirk/cardinal-question.lisp
 * created:     2019/07/03 17:39:01
 */
public final class cardinal_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cardinal_question();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.cardinal_question";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CARDINAL_QUESTION = makeSymbol("CARDINAL-QUESTION");

    private static final SubLSymbol VALUE_QUESTION = makeSymbol("VALUE-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-CLASS");

    private static final SubLSymbol VALUE_PREDICATE = makeSymbol("VALUE-PREDICATE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-INSTANCE");

    static private final SubLSymbol $sym26$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list28 = list(makeSymbol("TREE"));

    static private final SubLList $list29 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("How many")))))));

    static private final SubLList $list32 = list(makeString("How many"));

    static private final SubLSymbol $sym33$CARDINAL_QUESTION_ISA__METHOD = makeSymbol("CARDINAL-QUESTION-ISA?-METHOD");

    static private final SubLList $list34 = list(list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("Cardinal-Mathematical")))));

    private static final SubLObject $$Cardinal_Mathematical = reader_make_constant_shell("Cardinal-Mathematical");

    private static final SubLSymbol CARDINAL_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("CARDINAL-QUESTION-ANSWER-TYPES-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_cardinal_question_class_alt(SubLObject new_instance) {
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
    public static SubLObject subloop_reserved_initialize_cardinal_question_class(final SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_cardinal_question_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        classes.subloop_initialize_slot(new_instance, VALUE_QUESTION, VALUE_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, VALUE_QUESTION, CYC_FOCUSES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cardinal_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        classes.subloop_initialize_slot(new_instance, VALUE_QUESTION, VALUE_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, VALUE_QUESTION, CYC_FOCUSES, NIL);
        return NIL;
    }

    public static final SubLObject cardinal_question_p_alt(SubLObject v_cardinal_question) {
        return classes.subloop_instanceof_class(v_cardinal_question, CARDINAL_QUESTION);
    }

    public static SubLObject cardinal_question_p(final SubLObject v_cardinal_question) {
        return classes.subloop_instanceof_class(v_cardinal_question, CARDINAL_QUESTION);
    }

    public static final SubLObject cardinal_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list_alt32, UNPROVIDED)));
    }

    public static SubLObject cardinal_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list32, UNPROVIDED)));
    }

    public static final SubLObject cardinal_question_answer_types_method_alt(SubLObject self) {
        return list(list($$Cardinal_Mathematical));
    }

    public static SubLObject cardinal_question_answer_types_method(final SubLObject self) {
        return list(list($$Cardinal_Mathematical));
    }

    public static SubLObject declare_cardinal_question_file() {
        declareFunction("subloop_reserved_initialize_cardinal_question_class", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cardinal_question_instance", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("cardinal_question_p", "CARDINAL-QUESTION-P", 1, 0, false);
        declareFunction("cardinal_question_isaP_method", "CARDINAL-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("cardinal_question_answer_types_method", "CARDINAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    public static SubLObject init_cardinal_question_file() {
        return NIL;
    }

    public static SubLObject setup_cardinal_question_file() {
        classes.subloop_new_class(CARDINAL_QUESTION, VALUE_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(CARDINAL_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(CARDINAL_QUESTION, SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(CARDINAL_QUESTION, SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_INSTANCE);
        subloop_reserved_initialize_cardinal_question_class(CARDINAL_QUESTION);
        methods.methods_incorporate_class_method($sym26$ISA_, CARDINAL_QUESTION, $list27, $list28, $list29);
        methods.subloop_register_class_method(CARDINAL_QUESTION, $sym26$ISA_, $sym33$CARDINAL_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, CARDINAL_QUESTION, $list27, NIL, $list34);
        methods.subloop_register_instance_method(CARDINAL_QUESTION, ANSWER_TYPES, CARDINAL_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt28 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt29 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("How many")))))));

    static private final SubLList $list_alt32 = list(makeString("How many"));

    static private final SubLList $list_alt34 = list(list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("Cardinal-Mathematical")))));

    @Override
    public void declareFunctions() {
        declare_cardinal_question_file();
    }

    @Override
    public void initializeVariables() {
        init_cardinal_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cardinal_question_file();
    }

    static {
    }
}

/**
 * Total time: 29 ms
 */
