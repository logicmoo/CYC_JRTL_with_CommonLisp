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
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class event_location_question extends SubLTranslatedFile {
    public static final SubLFile me = new event_location_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.event_location_question";

    public static final String myFingerPrint = "6e5e4df0ea8b7c152d1c526303190d7eb7452d8883a78619b29134250f16c579";

    // Internal Constants
    public static final SubLSymbol EVENT_LOCATION_QUESTION = makeSymbol("EVENT-LOCATION-QUESTION");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-INSTANCE");

    public static final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list25 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list26 = list(makeSymbol("TREE"));

    public static final SubLList $list27 = list(makeString("@return boolen; t if TREE is an event location (aka where) question, \n   nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("where"), makeString("whence"), makeString("whither")))), list(makeSymbol("CNOT"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-PREDICATE"))))))));





    public static final SubLList $list30 = list(makeString("where"), makeString("whence"), makeString("whither"));



    public static final SubLSymbol $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD = makeSymbol("EVENT-LOCATION-QUESTION-ISA?-METHOD");

    public static final SubLList $list33 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Place"))))));

    private static final SubLObject $$Place = reader_make_constant_shell(makeString("Place"));

    public static final SubLSymbol EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("EVENT-LOCATION-QUESTION-ANSWER-TYPES-METHOD");

    public static SubLObject subloop_reserved_initialize_event_location_question_class(final SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_event_location_question_instance(final SubLObject new_instance) {
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

    public static SubLObject event_location_question_p(final SubLObject v_event_location_question) {
        return classes.subloop_instanceof_class(v_event_location_question, EVENT_LOCATION_QUESTION);
    }

    public static SubLObject event_location_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, UNPROVIDED))) && (NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_PREDICATE))));
    }

    public static SubLObject event_location_question_answer_types_method(final SubLObject self) {
        return list(list($$Place));
    }

    public static SubLObject declare_event_location_question_file() {
        declareFunction(me, "subloop_reserved_initialize_event_location_question_class", "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_event_location_question_instance", "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "event_location_question_p", "EVENT-LOCATION-QUESTION-P", 1, 0, false);
        declareFunction(me, "event_location_question_isaP_method", "EVENT-LOCATION-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "event_location_question_answer_types_method", "EVENT-LOCATION-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_event_location_question_file() {
        return NIL;
    }

    public static SubLObject setup_event_location_question_file() {
        classes.subloop_new_class(EVENT_LOCATION_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(EVENT_LOCATION_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(EVENT_LOCATION_QUESTION, SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(EVENT_LOCATION_QUESTION, SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE);
        subloop_reserved_initialize_event_location_question_class(EVENT_LOCATION_QUESTION);
        methods.methods_incorporate_class_method($sym24$ISA_, EVENT_LOCATION_QUESTION, $list25, $list26, $list27);
        methods.subloop_register_class_method(EVENT_LOCATION_QUESTION, $sym24$ISA_, $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, EVENT_LOCATION_QUESTION, $list25, NIL, $list33);
        methods.subloop_register_instance_method(EVENT_LOCATION_QUESTION, ANSWER_TYPES, EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_event_location_question_file();
    }

    @Override
    public void initializeVariables() {
        init_event_location_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_event_location_question_file();
    }

    
}

/**
 * Total time: 30 ms
 */
