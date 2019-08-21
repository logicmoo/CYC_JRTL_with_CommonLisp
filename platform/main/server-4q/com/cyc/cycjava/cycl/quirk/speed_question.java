package com.cyc.cycjava.cycl.quirk;


import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.quirk.speed_question;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.quirk.speed_question.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class speed_question extends SubLTranslatedFile {
    public static final SubLFile me = new speed_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.speed_question";

    public static final String myFingerPrint = "3c546e43cde86078193502141ac9a386dfe823bc9e09cfee0b713257d7d791b0";

    // Internal Constants
    public static final SubLSymbol SPEED_QUESTION = makeSymbol("SPEED-QUESTION");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-INSTANCE");

    public static final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list25 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list26 = list(makeSymbol("TREE"));

    public static final SubLList $list27 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("How fast")))))));





    public static final SubLList $list30 = list(makeString("How fast"));

    public static final SubLSymbol $sym31$SPEED_QUESTION_ISA__METHOD = makeSymbol("SPEED-QUESTION-ISA?-METHOD");

    public static final SubLList $list32 = list(list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Speed"))))));

    private static final SubLObject $$Speed = reader_make_constant_shell(makeString("Speed"));

    public static final SubLSymbol SPEED_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("SPEED-QUESTION-ANSWER-TYPES-METHOD");

    public static SubLObject subloop_reserved_initialize_speed_question_class(final SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_speed_question_instance(final SubLObject new_instance) {
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

    public static SubLObject speed_question_p(final SubLObject v_speed_question) {
        return classes.subloop_instanceof_class(v_speed_question, SPEED_QUESTION);
    }

    public static SubLObject speed_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, UNPROVIDED)));
    }

    public static SubLObject speed_question_answer_types_method(final SubLObject self) {
        return list(list($$Speed));
    }

    public static SubLObject declare_speed_question_file() {
        declareFunction(me, "subloop_reserved_initialize_speed_question_class", "SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_speed_question_instance", "SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "speed_question_p", "SPEED-QUESTION-P", 1, 0, false);
        declareFunction(me, "speed_question_isaP_method", "SPEED-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "speed_question_answer_types_method", "SPEED-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_speed_question_file() {
        return NIL;
    }

    public static SubLObject setup_speed_question_file() {
        classes.subloop_new_class(SPEED_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(SPEED_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(SPEED_QUESTION, SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(SPEED_QUESTION, SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_INSTANCE);
        subloop_reserved_initialize_speed_question_class(SPEED_QUESTION);
        methods.methods_incorporate_class_method($sym24$ISA_, SPEED_QUESTION, $list25, $list26, $list27);
        methods.subloop_register_class_method(SPEED_QUESTION, $sym24$ISA_, $sym31$SPEED_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, SPEED_QUESTION, $list25, NIL, $list32);
        methods.subloop_register_instance_method(SPEED_QUESTION, ANSWER_TYPES, SPEED_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_speed_question_file();
    }

    @Override
    public void initializeVariables() {
        init_speed_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_speed_question_file();
    }

    static {




































    }
}

/**
 * Total time: 77 ms
 */
