package com.cyc.cycjava.cycl.quirk;


import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.quirk.physical_quantity_question;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.quirk.physical_quantity_question.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class physical_quantity_question extends SubLTranslatedFile {
    public static final SubLFile me = new physical_quantity_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.physical_quantity_question";

    public static final String myFingerPrint = "f746d7b901b051bffaf4adf3ab8702425d580351b8cef3f4ff74f3e4dfb37429";

    // Internal Constants
    public static final SubLSymbol PHYSICAL_QUANTITY_QUESTION = makeSymbol("PHYSICAL-QUANTITY-QUESTION");

    public static final SubLSymbol VALUE_QUESTION = makeSymbol("VALUE-QUESTION");

    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-CLASS");



















    public static final SubLSymbol VALUE_PREDICATE = makeSymbol("VALUE-PREDICATE");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-INSTANCE");

    public static final SubLSymbol $sym26$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list27 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list28 = list(makeSymbol("TREE"));

    public static final SubLList $list29 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("How big"), makeString("How much")))))));





    public static final SubLList $list32 = list(makeString("How big"), makeString("How much"));

    public static final SubLSymbol $sym33$PHYSICAL_QUANTITY_QUESTION_ISA__METHOD = makeSymbol("PHYSICAL-QUANTITY-QUESTION-ISA?-METHOD");



    public static final SubLList $list35 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VALUE-PREDICATE")), reader_make_constant_shell(makeString("sizeParameterOfObject"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PHYSICAL-QUANTITY-QUESTION-METHOD");

    private static final SubLObject $$sizeParameterOfObject = reader_make_constant_shell(makeString("sizeParameterOfObject"));

    public static final SubLSymbol PHYSICAL_QUANTITY_QUESTION_INITIALIZE_METHOD = makeSymbol("PHYSICAL-QUANTITY-QUESTION-INITIALIZE-METHOD");

    public static final SubLList $list39 = list(list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("PhysicalQuantity"))))));

    private static final SubLObject $$PhysicalQuantity = reader_make_constant_shell(makeString("PhysicalQuantity"));

    public static final SubLSymbol PHYSICAL_QUANTITY_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("PHYSICAL-QUANTITY-QUESTION-ANSWER-TYPES-METHOD");

    public static SubLObject subloop_reserved_initialize_physical_quantity_question_class(final SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_physical_quantity_question_instance(final SubLObject new_instance) {
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

    public static SubLObject physical_quantity_question_p(final SubLObject v_physical_quantity_question) {
        return classes.subloop_instanceof_class(v_physical_quantity_question, PHYSICAL_QUANTITY_QUESTION);
    }

    public static SubLObject physical_quantity_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list32, UNPROVIDED)));
    }

    public static SubLObject physical_quantity_question_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_physical_quantity_question_method = NIL;
        final SubLObject value_predicate = value_question.get_value_question_value_predicate(self);
        try {
            thread.throwStack.push($sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD);
            try {
                question.question_initialize_method(self);
                instances.set_slot(self, VALUE_PREDICATE, $$sizeParameterOfObject);
                sublisp_throw($sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    value_question.set_value_question_value_predicate(self, value_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_physical_quantity_question_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_physical_quantity_question_method;
    }

    public static SubLObject physical_quantity_question_answer_types_method(final SubLObject self) {
        return list(list($$PhysicalQuantity));
    }

    public static SubLObject declare_physical_quantity_question_file() {
        declareFunction(me, "subloop_reserved_initialize_physical_quantity_question_class", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_physical_quantity_question_instance", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "physical_quantity_question_p", "PHYSICAL-QUANTITY-QUESTION-P", 1, 0, false);
        declareFunction(me, "physical_quantity_question_isaP_method", "PHYSICAL-QUANTITY-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "physical_quantity_question_initialize_method", "PHYSICAL-QUANTITY-QUESTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "physical_quantity_question_answer_types_method", "PHYSICAL-QUANTITY-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_physical_quantity_question_file() {
        return NIL;
    }

    public static SubLObject setup_physical_quantity_question_file() {
        classes.subloop_new_class(PHYSICAL_QUANTITY_QUESTION, VALUE_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(PHYSICAL_QUANTITY_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(PHYSICAL_QUANTITY_QUESTION, SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(PHYSICAL_QUANTITY_QUESTION, SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_INSTANCE);
        subloop_reserved_initialize_physical_quantity_question_class(PHYSICAL_QUANTITY_QUESTION);
        methods.methods_incorporate_class_method($sym26$ISA_, PHYSICAL_QUANTITY_QUESTION, $list27, $list28, $list29);
        methods.subloop_register_class_method(PHYSICAL_QUANTITY_QUESTION, $sym26$ISA_, $sym33$PHYSICAL_QUANTITY_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, PHYSICAL_QUANTITY_QUESTION, $list27, NIL, $list35);
        methods.subloop_register_instance_method(PHYSICAL_QUANTITY_QUESTION, INITIALIZE, PHYSICAL_QUANTITY_QUESTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, PHYSICAL_QUANTITY_QUESTION, $list27, NIL, $list39);
        methods.subloop_register_instance_method(PHYSICAL_QUANTITY_QUESTION, ANSWER_TYPES, PHYSICAL_QUANTITY_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_physical_quantity_question_file();
    }

    @Override
    public void initializeVariables() {
        init_physical_quantity_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_physical_quantity_question_file();
    }

    static {











































    }
}

/**
 * Total time: 93 ms
 */
