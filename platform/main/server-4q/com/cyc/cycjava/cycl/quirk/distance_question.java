package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class distance_question extends SubLTranslatedFile {
    public static final SubLFile me = new distance_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.distance_question";

    public static final String myFingerPrint = "e961fbbacdfd0da2a86a1de0a33704b4239c6801c576ffd6258a4e6d07c45200";

    // Internal Constants
    public static final SubLSymbol DISTANCE_QUESTION = makeSymbol("DISTANCE-QUESTION");

    public static final SubLSymbol VALUE_QUESTION = makeSymbol("VALUE-QUESTION");

    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")));





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-CLASS");



















    public static final SubLSymbol VALUE_PREDICATE = makeSymbol("VALUE-PREDICATE");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-INSTANCE");

    public static final SubLSymbol $sym26$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list27 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list28 = list(makeSymbol("TREE"));

    public static final SubLList $list29 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("How tall"), makeString("How long"), makeString("How wide"), makeString("How far"), makeString("How much in miles")))))));





    public static final SubLList $list32 = list(makeString("How tall"), makeString("How long"), makeString("How wide"), makeString("How far"), makeString("How much in miles"));

    public static final SubLSymbol $sym33$DISTANCE_QUESTION_ISA__METHOD = makeSymbol("DISTANCE-QUESTION-ISA?-METHOD");



    public static final SubLList $list35 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUERIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GURUQA-QUERY"), list(makeSymbol("CCONCATENATE"), makeString("@WIN(1 SIZE1$ "), list(makeSymbol("BUNGE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYSTRINGS")))), makeString(")")), makeSymbol("CORPUS")), makeSymbol("QUERIES"))), list(makeSymbol("RET"), makeSymbol("QUERIES"))));

    public static final SubLSymbol $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DISTANCE-QUESTION-METHOD");

    public static final SubLString $str37$_WIN_1_SIZE1__ = makeString("@WIN(1 SIZE1$ ");



    public static final SubLString $str39$_ = makeString(")");

    public static final SubLSymbol DISTANCE_QUESTION_QUERIFY_METHOD = makeSymbol("DISTANCE-QUESTION-QUERIFY-METHOD");

    public static final SubLList $list41 = list(list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Distance"))))));

    private static final SubLObject $$Distance = reader_make_constant_shell(makeString("Distance"));

    public static final SubLSymbol DISTANCE_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("DISTANCE-QUESTION-ANSWER-TYPES-METHOD");

    public static SubLObject subloop_reserved_initialize_distance_question_class(final SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_distance_question_instance(final SubLObject new_instance) {
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

    public static SubLObject distance_question_p(final SubLObject v_distance_question) {
        return classes.subloop_instanceof_class(v_distance_question, DISTANCE_QUESTION);
    }

    public static SubLObject distance_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list32, UNPROVIDED)));
    }

    public static SubLObject distance_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_distance_question_method = NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push($sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD);
            try {
                SubLObject queries = NIL;
                SubLObject cdolist_list_var = corpora;
                SubLObject corpus = NIL;
                corpus = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    queries = cons(search_engine.new_guruqa_query(cconcatenate($str37$_WIN_1_SIZE1__, new SubLObject[]{ string_utilities.bunge(methods.funcall_instance_method_with_0_args(self, GET_KEYSTRINGS), UNPROVIDED), $str39$_ }), corpus), queries);
                    cdolist_list_var = cdolist_list_var.rest();
                    corpus = cdolist_list_var.first();
                } 
                sublisp_throw($sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD, queries);
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
            catch_var_for_distance_question_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_distance_question_method;
    }

    public static SubLObject distance_question_answer_types_method(final SubLObject self) {
        return list(list($$Distance));
    }

    public static SubLObject declare_distance_question_file() {
        declareFunction(me, "subloop_reserved_initialize_distance_question_class", "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_distance_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "distance_question_p", "DISTANCE-QUESTION-P", 1, 0, false);
        declareFunction(me, "distance_question_isaP_method", "DISTANCE-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "distance_question_querify_method", "DISTANCE-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction(me, "distance_question_answer_types_method", "DISTANCE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_distance_question_file() {
        return NIL;
    }

    public static SubLObject setup_distance_question_file() {
        classes.subloop_new_class(DISTANCE_QUESTION, VALUE_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(DISTANCE_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(DISTANCE_QUESTION, SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(DISTANCE_QUESTION, SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE);
        subloop_reserved_initialize_distance_question_class(DISTANCE_QUESTION);
        methods.methods_incorporate_class_method($sym26$ISA_, DISTANCE_QUESTION, $list27, $list28, $list29);
        methods.subloop_register_class_method(DISTANCE_QUESTION, $sym26$ISA_, $sym33$DISTANCE_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, DISTANCE_QUESTION, $list27, NIL, $list35);
        methods.subloop_register_instance_method(DISTANCE_QUESTION, QUERIFY, DISTANCE_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, DISTANCE_QUESTION, $list27, NIL, $list41);
        methods.subloop_register_instance_method(DISTANCE_QUESTION, ANSWER_TYPES, DISTANCE_QUESTION_ANSWER_TYPES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_distance_question_file();
    }

    @Override
    public void initializeVariables() {
        init_distance_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_distance_question_file();
    }

    
}

/**
 * Total time: 51 ms
 */
