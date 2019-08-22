package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class yes_no_question extends SubLTranslatedFile {
    public static final SubLFile me = new yes_no_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.yes_no_question";

    public static final String myFingerPrint = "14dcbd3943492d62a9a9ea5e50e50e5cad9413821e597061afc4c7e22fa840a5";

    // Internal Constants
    public static final SubLSymbol YES_NO_QUESTION = makeSymbol("YES-NO-QUESTION");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE");

    public static final SubLSymbol $sym23$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list24 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list25 = list(makeSymbol("TREE"));

    public static final SubLList $list26 = list(makeString("@param PARSE question-tree-p\n   @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("SQ-TREE-P"), makeSymbol("TREE")), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));



    public static final SubLSymbol $sym28$YES_NO_QUESTION_ISA__METHOD = makeSymbol("YES-NO-QUESTION-ISA?-METHOD");

    public static final SubLList $list29 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("SubLBoolean"))))));

    private static final SubLObject $$SubLBoolean = reader_make_constant_shell(makeString("SubLBoolean"));

    public static final SubLSymbol YES_NO_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("YES-NO-QUESTION-ANSWER-TYPES-METHOD");

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

    public static SubLObject yes_no_question_p(final SubLObject v_yes_no_question) {
        return classes.subloop_instanceof_class(v_yes_no_question, YES_NO_QUESTION);
    }

    public static SubLObject yes_no_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.sq_tree_p(tree)) && (NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))));
    }

    public static SubLObject yes_no_question_answer_types_method(final SubLObject self) {
        return list(list($$SubLBoolean));
    }

    public static SubLObject declare_yes_no_question_file() {
        declareFunction(me, "subloop_reserved_initialize_yes_no_question_class", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_yes_no_question_instance", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "yes_no_question_p", "YES-NO-QUESTION-P", 1, 0, false);
        declareFunction(me, "yes_no_question_isaP_method", "YES-NO-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "yes_no_question_answer_types_method", "YES-NO-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

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

    @Override
    public void declareFunctions() {
        declare_yes_no_question_file();
    }

    @Override
    public void initializeVariables() {
        init_yes_no_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_yes_no_question_file();
    }

    
}

/**
 * Total time: 76 ms
 */
