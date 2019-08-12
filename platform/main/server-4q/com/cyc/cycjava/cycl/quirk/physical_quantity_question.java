/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class physical_quantity_question extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new physical_quantity_question();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.physical_quantity_question";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol PHYSICAL_QUANTITY_QUESTION = makeSymbol("PHYSICAL-QUANTITY-QUESTION");

    private static final SubLSymbol VALUE_QUESTION = makeSymbol("VALUE-QUESTION");

    static private final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-CLASS");

    private static final SubLSymbol VALUE_PREDICATE = makeSymbol("VALUE-PREDICATE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-INSTANCE");

    static private final SubLSymbol $sym26$ISA_ = makeSymbol("ISA?");

    static private final SubLList $list27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list28 = list(makeSymbol("TREE"));

    static private final SubLList $list29 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("How big"), makeString("How much")))))));

    static private final SubLList $list32 = list(makeString("How big"), makeString("How much"));

    static private final SubLSymbol $sym33$PHYSICAL_QUANTITY_QUESTION_ISA__METHOD = makeSymbol("PHYSICAL-QUANTITY-QUESTION-ISA?-METHOD");

    static private final SubLList $list35 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VALUE-PREDICATE")), reader_make_constant_shell("sizeParameterOfObject")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PHYSICAL-QUANTITY-QUESTION-METHOD");



    private static final SubLSymbol PHYSICAL_QUANTITY_QUESTION_INITIALIZE_METHOD = makeSymbol("PHYSICAL-QUANTITY-QUESTION-INITIALIZE-METHOD");

    static private final SubLList $list39 = list(list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("PhysicalQuantity")))));



    private static final SubLSymbol PHYSICAL_QUANTITY_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("PHYSICAL-QUANTITY-QUESTION-ANSWER-TYPES-METHOD");

    // Definitions
    public static final SubLObject subloop_reserved_initialize_physical_quantity_question_class_alt(SubLObject new_instance) {
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

    public static final SubLObject subloop_reserved_initialize_physical_quantity_question_instance_alt(SubLObject new_instance) {
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

    public static final SubLObject physical_quantity_question_p_alt(SubLObject v_physical_quantity_question) {
        return classes.subloop_instanceof_class(v_physical_quantity_question, PHYSICAL_QUANTITY_QUESTION);
    }

    public static SubLObject physical_quantity_question_p(final SubLObject v_physical_quantity_question) {
        return classes.subloop_instanceof_class(v_physical_quantity_question, PHYSICAL_QUANTITY_QUESTION);
    }

    public static final SubLObject physical_quantity_question_isaP_method_alt(SubLObject self, SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list_alt32, UNPROVIDED)));
    }

    public static SubLObject physical_quantity_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list32, UNPROVIDED)));
    }

    public static final SubLObject physical_quantity_question_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_physical_quantity_question_method = NIL;
            SubLObject value_predicate = value_question.get_value_question_value_predicate(self);
            try {
                try {
                    question.question_initialize_method(self);
                    instances.set_slot(self, VALUE_PREDICATE, $$sizeParameterOfObject);
                    sublisp_throw($sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            value_question.set_value_question_value_predicate(self, value_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_physical_quantity_question_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD);
            }
            return catch_var_for_physical_quantity_question_method;
        }
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

    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));

    public static final SubLObject physical_quantity_question_answer_types_method_alt(SubLObject self) {
        return list(list($$PhysicalQuantity));
    }

    public static SubLObject physical_quantity_question_answer_types_method(final SubLObject self) {
        return list(list($$PhysicalQuantity));
    }

    public static SubLObject declare_physical_quantity_question_file() {
        declareFunction("subloop_reserved_initialize_physical_quantity_question_class", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_physical_quantity_question_instance", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-INSTANCE", 1, 0, false);
        declareFunction("physical_quantity_question_p", "PHYSICAL-QUANTITY-QUESTION-P", 1, 0, false);
        declareFunction("physical_quantity_question_isaP_method", "PHYSICAL-QUANTITY-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction("physical_quantity_question_initialize_method", "PHYSICAL-QUANTITY-QUESTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("physical_quantity_question_answer_types_method", "PHYSICAL-QUANTITY-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt27 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt28 = list(makeSymbol("TREE"));

    static private final SubLList $list_alt29 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), list(QUOTE, list(makeString("How big"), makeString("How much")))))));

    public static SubLObject init_physical_quantity_question_file() {
        return NIL;
    }

    static private final SubLList $list_alt32 = list(makeString("How big"), makeString("How much"));

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

    static private final SubLList $list_alt35 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("VALUE-PREDICATE")), reader_make_constant_shell("sizeParameterOfObject")), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt39 = list(list(RET, list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell("PhysicalQuantity")))));

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
