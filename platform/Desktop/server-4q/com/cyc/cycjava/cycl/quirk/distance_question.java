package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class distance_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.distance_question";
    public static final String myFingerPrint = "e961fbbacdfd0da2a86a1de0a33704b4239c6801c576ffd6258a4e6d07c45200";
    private static final SubLSymbol $sym0$DISTANCE_QUESTION;
    private static final SubLSymbol $sym1$VALUE_QUESTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$QUESTION;
    private static final SubLSymbol $sym6$LEXICON;
    private static final SubLSymbol $sym7$PARSER;
    private static final SubLSymbol $sym8$TAGGER;
    private static final SubLSymbol $sym9$CHUNKER;
    private static final SubLSymbol $sym10$MAX_CANDIDATES;
    private static final SubLSymbol $sym11$MAX_CONFIDENCE;
    private static final SubLSymbol $sym12$LEARNABLE_TYPES;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$VALUE_PREDICATE;
    private static final SubLSymbol $sym24$CYC_FOCUSES;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE;
    private static final SubLSymbol $sym26$ISA_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$GET_DAUGHTER;
    private static final SubLSymbol $sym31$GET_STRING;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$DISTANCE_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym34$QUERIFY;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD;
    private static final SubLString $str37$_WIN_1_SIZE1__;
    private static final SubLSymbol $sym38$GET_KEYSTRINGS;
    private static final SubLString $str39$_;
    private static final SubLSymbol $sym40$DISTANCE_QUESTION_QUERIFY_METHOD;
    private static final SubLList $list41;
    private static final SubLObject $const42$Distance;
    private static final SubLSymbol $sym43$DISTANCE_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 861L)
    public static SubLObject subloop_reserved_initialize_distance_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym3$OBJECT, (SubLObject)distance_question.$sym4$INSTANCE_COUNT, (SubLObject)distance_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym6$LEXICON, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym7$PARSER, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym8$TAGGER, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym9$CHUNKER, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym10$MAX_CANDIDATES, (SubLObject)distance_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym11$MAX_CONFIDENCE, (SubLObject)distance_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym12$LEARNABLE_TYPES, (SubLObject)distance_question.NIL);
        return (SubLObject)distance_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 861L)
    public static SubLObject subloop_reserved_initialize_distance_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym3$OBJECT, (SubLObject)distance_question.$sym14$ISOLATED_P, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym3$OBJECT, (SubLObject)distance_question.$sym15$INSTANCE_NUMBER, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym16$INFORMATION_REQUEST, (SubLObject)distance_question.$sym17$ERROR_HANDLING, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym16$INFORMATION_REQUEST, (SubLObject)distance_question.$sym18$TIMEOUT, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym19$STRING, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym20$PARSE, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym21$ANSWER_TYPES, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym5$QUESTION, (SubLObject)distance_question.$sym22$CORPORA, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym1$VALUE_QUESTION, (SubLObject)distance_question.$sym23$VALUE_PREDICATE, (SubLObject)distance_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)distance_question.$sym1$VALUE_QUESTION, (SubLObject)distance_question.$sym24$CYC_FOCUSES, (SubLObject)distance_question.NIL);
        return (SubLObject)distance_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 861L)
    public static SubLObject distance_question_p(final SubLObject v_distance_question) {
        return classes.subloop_instanceof_class(v_distance_question, (SubLObject)distance_question.$sym0$DISTANCE_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 1062L)
    public static SubLObject distance_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(distance_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)distance_question.$sym30$GET_DAUGHTER, (SubLObject)distance_question.ZERO_INTEGER)) && distance_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)distance_question.$sym30$GET_DAUGHTER, (SubLObject)distance_question.ZERO_INTEGER), (SubLObject)distance_question.$sym31$GET_STRING), (SubLObject)distance_question.$list32, (SubLObject)distance_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 1348L)
    public static SubLObject distance_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_distance_question_method = (SubLObject)distance_question.NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push(distance_question.$sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD);
            try {
                SubLObject queries = (SubLObject)distance_question.NIL;
                SubLObject cdolist_list_var = corpora;
                SubLObject corpus = (SubLObject)distance_question.NIL;
                corpus = cdolist_list_var.first();
                while (distance_question.NIL != cdolist_list_var) {
                    queries = (SubLObject)ConsesLow.cons(search_engine.new_guruqa_query(Sequences.cconcatenate((SubLObject)distance_question.$str37$_WIN_1_SIZE1__, new SubLObject[] { string_utilities.bunge(methods.funcall_instance_method_with_0_args(self, (SubLObject)distance_question.$sym38$GET_KEYSTRINGS), (SubLObject)distance_question.UNPROVIDED), distance_question.$str39$_ }), corpus), queries);
                    cdolist_list_var = cdolist_list_var.rest();
                    corpus = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)distance_question.$sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD, queries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)distance_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_corpora(self, corpora);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_distance_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)distance_question.$sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_distance_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/distance-question.lisp", position = 1626L)
    public static SubLObject distance_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(distance_question.$const42$Distance));
    }
    
    public static SubLObject declare_distance_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.distance_question", "subloop_reserved_initialize_distance_question_class", "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.distance_question", "subloop_reserved_initialize_distance_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.distance_question", "distance_question_p", "DISTANCE-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.distance_question", "distance_question_isaP_method", "DISTANCE-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.distance_question", "distance_question_querify_method", "DISTANCE-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.distance_question", "distance_question_answer_types_method", "DISTANCE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return (SubLObject)distance_question.NIL;
    }
    
    public static SubLObject init_distance_question_file() {
        return (SubLObject)distance_question.NIL;
    }
    
    public static SubLObject setup_distance_question_file() {
        classes.subloop_new_class((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$sym1$VALUE_QUESTION, (SubLObject)distance_question.NIL, (SubLObject)distance_question.NIL, (SubLObject)distance_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$sym25$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE);
        subloop_reserved_initialize_distance_question_class((SubLObject)distance_question.$sym0$DISTANCE_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)distance_question.$sym26$ISA_, (SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$list27, (SubLObject)distance_question.$list28, (SubLObject)distance_question.$list29);
        methods.subloop_register_class_method((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$sym26$ISA_, (SubLObject)distance_question.$sym33$DISTANCE_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)distance_question.$sym34$QUERIFY, (SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$list27, (SubLObject)distance_question.NIL, (SubLObject)distance_question.$list35);
        methods.subloop_register_instance_method((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$sym34$QUERIFY, (SubLObject)distance_question.$sym40$DISTANCE_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)distance_question.$sym21$ANSWER_TYPES, (SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$list27, (SubLObject)distance_question.NIL, (SubLObject)distance_question.$list41);
        methods.subloop_register_instance_method((SubLObject)distance_question.$sym0$DISTANCE_QUESTION, (SubLObject)distance_question.$sym21$ANSWER_TYPES, (SubLObject)distance_question.$sym43$DISTANCE_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)distance_question.NIL;
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
    
    static {
        me = (SubLFile)new distance_question();
        $sym0$DISTANCE_QUESTION = SubLObjectFactory.makeSymbol("DISTANCE-QUESTION");
        $sym1$VALUE_QUESTION = SubLObjectFactory.makeSymbol("VALUE-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)distance_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)distance_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym6$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym7$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym8$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym9$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym10$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym11$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym12$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $sym13$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$VALUE_PREDICATE = SubLObjectFactory.makeSymbol("VALUE-PREDICATE");
        $sym24$CYC_FOCUSES = SubLObjectFactory.makeSymbol("CYC-FOCUSES");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_DISTANCE_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DISTANCE-QUESTION-INSTANCE");
        $sym26$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)distance_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)distance_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How tall"), (SubLObject)SubLObjectFactory.makeString("How long"), (SubLObject)SubLObjectFactory.makeString("How wide"), (SubLObject)SubLObjectFactory.makeString("How far"), (SubLObject)SubLObjectFactory.makeString("How much in miles")))))));
        $sym30$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym31$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How tall"), (SubLObject)SubLObjectFactory.makeString("How long"), (SubLObject)SubLObjectFactory.makeString("How wide"), (SubLObject)SubLObjectFactory.makeString("How far"), (SubLObject)SubLObjectFactory.makeString("How much in miles"));
        $sym33$DISTANCE_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("DISTANCE-QUESTION-ISA?-METHOD");
        $sym34$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)distance_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GURUQA-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("@WIN(1 SIZE1$ "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYSTRINGS")))), (SubLObject)SubLObjectFactory.makeString(")")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"))));
        $sym36$OUTER_CATCH_FOR_DISTANCE_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DISTANCE-QUESTION-METHOD");
        $str37$_WIN_1_SIZE1__ = SubLObjectFactory.makeString("@WIN(1 SIZE1$ ");
        $sym38$GET_KEYSTRINGS = SubLObjectFactory.makeSymbol("GET-KEYSTRINGS");
        $str39$_ = SubLObjectFactory.makeString(")");
        $sym40$DISTANCE_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("DISTANCE-QUESTION-QUERIFY-METHOD");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Distance"))))));
        $const42$Distance = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Distance"));
        $sym43$DISTANCE_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("DISTANCE-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 51 ms
	
*/