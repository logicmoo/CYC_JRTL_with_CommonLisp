package com.cyc.cycjava.cycl.quirk;


import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.quirk.value_question;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.quirk.value_question.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class value_question extends SubLTranslatedFile {
    public static final SubLFile me = new value_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.value_question";

    public static final String myFingerPrint = "8e3cf8372098468b52e66104e24578882d60e7734a3adfbd6bf593590ef66b11";

    // Internal Constants
    public static final SubLSymbol VALUE_QUESTION = makeSymbol("VALUE-QUESTION");



    public static final SubLList $list2 = list(list(makeSymbol("VALUE-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYC-FOCUSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VALUE-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-FOCUSES"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol VALUE_PREDICATE = makeSymbol("VALUE-PREDICATE");





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-INSTANCE");

    public static final SubLSymbol GET_VALUE_PREDICATE = makeSymbol("GET-VALUE-PREDICATE");

    public static final SubLList $list27 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list28 = list(list(makeSymbol("RET"), makeSymbol("VALUE-PREDICATE")));

    public static final SubLSymbol $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VALUE-QUESTION-METHOD");

    public static final SubLSymbol VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD = makeSymbol("VALUE-QUESTION-GET-VALUE-PREDICATE-METHOD");

    public static final SubLSymbol GET_CYC_FOCUSES = makeSymbol("GET-CYC-FOCUSES");

    public static final SubLList $list32 = list(makeString("@return listp; a list of Cyc interpretations of the focus of this value-question"), list(makeSymbol("PWHEN"), makeSymbol("CYC-FOCUSES"), list(makeSymbol("RET"), makeSymbol("CYC-FOCUSES"))), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS-TREE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS")))), list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("FOCUS-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))), list(makeSymbol("LEXES"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), makeSymbol("DENOTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), makeSymbol("LEXES")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT")), makeSymbol("DENOTS"))), list(makeSymbol("CSETQ"), makeSymbol("CYC-FOCUSES"), makeSymbol("DENOTS")), list(makeSymbol("RET"), makeSymbol("DENOTS"))));

    public static final SubLSymbol $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VALUE-QUESTION-METHOD");











    public static final SubLSymbol VALUE_QUESTION_GET_CYC_FOCUSES_METHOD = makeSymbol("VALUE-QUESTION-GET-CYC-FOCUSES-METHOD");

    public static SubLObject get_value_question_cyc_focuses(final SubLObject v_value_question) {
        return classes.subloop_get_access_protected_instance_slot(v_value_question, EIGHT_INTEGER, CYC_FOCUSES);
    }

    public static SubLObject set_value_question_cyc_focuses(final SubLObject v_value_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_value_question, value, EIGHT_INTEGER, CYC_FOCUSES);
    }

    public static SubLObject get_value_question_value_predicate(final SubLObject v_value_question) {
        return classes.subloop_get_access_protected_instance_slot(v_value_question, SEVEN_INTEGER, VALUE_PREDICATE);
    }

    public static SubLObject set_value_question_value_predicate(final SubLObject v_value_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_value_question, value, SEVEN_INTEGER, VALUE_PREDICATE);
    }

    public static SubLObject subloop_reserved_initialize_value_question_class(final SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_value_question_instance(final SubLObject new_instance) {
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

    public static SubLObject value_question_p(final SubLObject v_value_question) {
        return classes.subloop_instanceof_class(v_value_question, VALUE_QUESTION);
    }

    public static SubLObject value_question_get_value_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_value_question_method = NIL;
        final SubLObject value_predicate = get_value_question_value_predicate(self);
        try {
            thread.throwStack.push($sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
            try {
                sublisp_throw($sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, value_predicate);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_value_question_value_predicate(self, value_predicate);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_value_question_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_value_question_method;
    }

    public static SubLObject value_question_get_cyc_focuses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_value_question_method = NIL;
        SubLObject cyc_focuses = get_value_question_cyc_focuses(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
            try {
                if (NIL != cyc_focuses) {
                    sublisp_throw($sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, cyc_focuses);
                }
                final SubLObject focus_tree = methods.funcall_instance_method_with_0_args(self, GET_FOCUS);
                final SubLObject head = methods.funcall_instance_method_with_0_args(focus_tree, GET_HEAD);
                final SubLObject lexes = methods.funcall_instance_method_with_0_args(head, GET_LEXES);
                SubLObject denots = NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject lex = NIL;
                lex = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    denots = cons(methods.funcall_instance_method_with_1_args(lex, GET, $DENOT), denots);
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                } 
                cyc_focuses = denots;
                sublisp_throw($sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, denots);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_value_question_cyc_focuses(self, cyc_focuses);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_value_question_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_value_question_method;
    }

    public static SubLObject declare_value_question_file() {
        declareFunction(me, "get_value_question_cyc_focuses", "GET-VALUE-QUESTION-CYC-FOCUSES", 1, 0, false);
        declareFunction(me, "set_value_question_cyc_focuses", "SET-VALUE-QUESTION-CYC-FOCUSES", 2, 0, false);
        declareFunction(me, "get_value_question_value_predicate", "GET-VALUE-QUESTION-VALUE-PREDICATE", 1, 0, false);
        declareFunction(me, "set_value_question_value_predicate", "SET-VALUE-QUESTION-VALUE-PREDICATE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_value_question_class", "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_value_question_instance", "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "value_question_p", "VALUE-QUESTION-P", 1, 0, false);
        declareFunction(me, "value_question_get_value_predicate_method", "VALUE-QUESTION-GET-VALUE-PREDICATE-METHOD", 1, 0, false);
        declareFunction(me, "value_question_get_cyc_focuses_method", "VALUE-QUESTION-GET-CYC-FOCUSES-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_value_question_file() {
        return NIL;
    }

    public static SubLObject setup_value_question_file() {
        classes.subloop_new_class(VALUE_QUESTION, WH_QUESTION, NIL, T, $list2);
        classes.class_set_implements_slot_listeners(VALUE_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(VALUE_QUESTION, SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(VALUE_QUESTION, SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE);
        subloop_reserved_initialize_value_question_class(VALUE_QUESTION);
        methods.methods_incorporate_instance_method(GET_VALUE_PREDICATE, VALUE_QUESTION, $list27, NIL, $list28);
        methods.subloop_register_instance_method(VALUE_QUESTION, GET_VALUE_PREDICATE, VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(GET_CYC_FOCUSES, VALUE_QUESTION, $list27, NIL, $list32);
        methods.subloop_register_instance_method(VALUE_QUESTION, GET_CYC_FOCUSES, VALUE_QUESTION_GET_CYC_FOCUSES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_value_question_file();
    }

    @Override
    public void initializeVariables() {
        init_value_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_value_question_file();
    }

    static {









































    }
}

/**
 * Total time: 155 ms
 */
