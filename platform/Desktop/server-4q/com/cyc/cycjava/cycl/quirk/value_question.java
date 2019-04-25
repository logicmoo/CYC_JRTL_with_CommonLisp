package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class value_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.value_question";
    public static final String myFingerPrint = "8e3cf8372098468b52e66104e24578882d60e7734a3adfbd6bf593590ef66b11";
    private static final SubLSymbol $sym0$VALUE_QUESTION;
    private static final SubLSymbol $sym1$WH_QUESTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CYC_FOCUSES;
    private static final SubLSymbol $sym4$VALUE_PREDICATE;
    private static final SubLSymbol $sym5$OBJECT;
    private static final SubLSymbol $sym6$INSTANCE_COUNT;
    private static final SubLSymbol $sym7$QUESTION;
    private static final SubLSymbol $sym8$LEXICON;
    private static final SubLSymbol $sym9$PARSER;
    private static final SubLSymbol $sym10$TAGGER;
    private static final SubLSymbol $sym11$CHUNKER;
    private static final SubLSymbol $sym12$MAX_CANDIDATES;
    private static final SubLSymbol $sym13$MAX_CONFIDENCE;
    private static final SubLSymbol $sym14$LEARNABLE_TYPES;
    private static final SubLSymbol $sym15$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS;
    private static final SubLSymbol $sym16$ISOLATED_P;
    private static final SubLSymbol $sym17$INSTANCE_NUMBER;
    private static final SubLSymbol $sym18$INFORMATION_REQUEST;
    private static final SubLSymbol $sym19$ERROR_HANDLING;
    private static final SubLSymbol $sym20$TIMEOUT;
    private static final SubLSymbol $sym21$STRING;
    private static final SubLSymbol $sym22$PARSE;
    private static final SubLSymbol $sym23$ANSWER_TYPES;
    private static final SubLSymbol $sym24$CORPORA;
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE;
    private static final SubLSymbol $sym26$GET_VALUE_PREDICATE;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD;
    private static final SubLSymbol $sym30$VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD;
    private static final SubLSymbol $sym31$GET_CYC_FOCUSES;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD;
    private static final SubLSymbol $sym34$GET_FOCUS;
    private static final SubLSymbol $sym35$GET_HEAD;
    private static final SubLSymbol $sym36$GET_LEXES;
    private static final SubLSymbol $sym37$GET;
    private static final SubLSymbol $kw38$DENOT;
    private static final SubLSymbol $sym39$VALUE_QUESTION_GET_CYC_FOCUSES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject get_value_question_cyc_focuses(final SubLObject v_value_question) {
        return classes.subloop_get_access_protected_instance_slot(v_value_question, (SubLObject)value_question.EIGHT_INTEGER, (SubLObject)value_question.$sym3$CYC_FOCUSES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject set_value_question_cyc_focuses(final SubLObject v_value_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_value_question, value, (SubLObject)value_question.EIGHT_INTEGER, (SubLObject)value_question.$sym3$CYC_FOCUSES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject get_value_question_value_predicate(final SubLObject v_value_question) {
        return classes.subloop_get_access_protected_instance_slot(v_value_question, (SubLObject)value_question.SEVEN_INTEGER, (SubLObject)value_question.$sym4$VALUE_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject set_value_question_value_predicate(final SubLObject v_value_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_value_question, value, (SubLObject)value_question.SEVEN_INTEGER, (SubLObject)value_question.$sym4$VALUE_PREDICATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject subloop_reserved_initialize_value_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym5$OBJECT, (SubLObject)value_question.$sym6$INSTANCE_COUNT, (SubLObject)value_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym8$LEXICON, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym9$PARSER, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym10$TAGGER, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym11$CHUNKER, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym12$MAX_CANDIDATES, (SubLObject)value_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym13$MAX_CONFIDENCE, (SubLObject)value_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym14$LEARNABLE_TYPES, (SubLObject)value_question.NIL);
        return (SubLObject)value_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject subloop_reserved_initialize_value_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym5$OBJECT, (SubLObject)value_question.$sym16$ISOLATED_P, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym5$OBJECT, (SubLObject)value_question.$sym17$INSTANCE_NUMBER, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym18$INFORMATION_REQUEST, (SubLObject)value_question.$sym19$ERROR_HANDLING, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym18$INFORMATION_REQUEST, (SubLObject)value_question.$sym20$TIMEOUT, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym21$STRING, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym22$PARSE, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym23$ANSWER_TYPES, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym7$QUESTION, (SubLObject)value_question.$sym24$CORPORA, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym4$VALUE_PREDICATE, (SubLObject)value_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym3$CYC_FOCUSES, (SubLObject)value_question.NIL);
        return (SubLObject)value_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 852L)
    public static SubLObject value_question_p(final SubLObject v_value_question) {
        return classes.subloop_instanceof_class(v_value_question, (SubLObject)value_question.$sym0$VALUE_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 1496L)
    public static SubLObject value_question_get_value_predicate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_value_question_method = (SubLObject)value_question.NIL;
        final SubLObject value_predicate = get_value_question_value_predicate(self);
        try {
            thread.throwStack.push(value_question.$sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)value_question.$sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, value_predicate);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_value_question_value_predicate(self, value_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_value_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)value_question.$sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_value_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/value-question.lisp", position = 1591L)
    public static SubLObject value_question_get_cyc_focuses_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_value_question_method = (SubLObject)value_question.NIL;
        SubLObject cyc_focuses = get_value_question_cyc_focuses(self);
        try {
            thread.throwStack.push(value_question.$sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
            try {
                if (value_question.NIL != cyc_focuses) {
                    Dynamic.sublisp_throw((SubLObject)value_question.$sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, cyc_focuses);
                }
                final SubLObject focus_tree = methods.funcall_instance_method_with_0_args(self, (SubLObject)value_question.$sym34$GET_FOCUS);
                final SubLObject head = methods.funcall_instance_method_with_0_args(focus_tree, (SubLObject)value_question.$sym35$GET_HEAD);
                final SubLObject lexes = methods.funcall_instance_method_with_0_args(head, (SubLObject)value_question.$sym36$GET_LEXES);
                SubLObject denots = (SubLObject)value_question.NIL;
                SubLObject cdolist_list_var = lexes;
                SubLObject lex = (SubLObject)value_question.NIL;
                lex = cdolist_list_var.first();
                while (value_question.NIL != cdolist_list_var) {
                    denots = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(lex, (SubLObject)value_question.$sym37$GET, (SubLObject)value_question.$kw38$DENOT), denots);
                    cdolist_list_var = cdolist_list_var.rest();
                    lex = cdolist_list_var.first();
                }
                cyc_focuses = denots;
                Dynamic.sublisp_throw((SubLObject)value_question.$sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD, denots);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)value_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_value_question_cyc_focuses(self, cyc_focuses);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_value_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)value_question.$sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_value_question_method;
    }
    
    public static SubLObject declare_value_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "get_value_question_cyc_focuses", "GET-VALUE-QUESTION-CYC-FOCUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "set_value_question_cyc_focuses", "SET-VALUE-QUESTION-CYC-FOCUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "get_value_question_value_predicate", "GET-VALUE-QUESTION-VALUE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "set_value_question_value_predicate", "SET-VALUE-QUESTION-VALUE-PREDICATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "subloop_reserved_initialize_value_question_class", "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "subloop_reserved_initialize_value_question_instance", "SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "value_question_p", "VALUE-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "value_question_get_value_predicate_method", "VALUE-QUESTION-GET-VALUE-PREDICATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.value_question", "value_question_get_cyc_focuses_method", "VALUE-QUESTION-GET-CYC-FOCUSES-METHOD", 1, 0, false);
        return (SubLObject)value_question.NIL;
    }
    
    public static SubLObject init_value_question_file() {
        return (SubLObject)value_question.NIL;
    }
    
    public static SubLObject setup_value_question_file() {
        classes.subloop_new_class((SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym1$WH_QUESTION, (SubLObject)value_question.NIL, (SubLObject)value_question.T, (SubLObject)value_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym15$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym25$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE);
        subloop_reserved_initialize_value_question_class((SubLObject)value_question.$sym0$VALUE_QUESTION);
        methods.methods_incorporate_instance_method((SubLObject)value_question.$sym26$GET_VALUE_PREDICATE, (SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$list27, (SubLObject)value_question.NIL, (SubLObject)value_question.$list28);
        methods.subloop_register_instance_method((SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym26$GET_VALUE_PREDICATE, (SubLObject)value_question.$sym30$VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)value_question.$sym31$GET_CYC_FOCUSES, (SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$list27, (SubLObject)value_question.NIL, (SubLObject)value_question.$list32);
        methods.subloop_register_instance_method((SubLObject)value_question.$sym0$VALUE_QUESTION, (SubLObject)value_question.$sym31$GET_CYC_FOCUSES, (SubLObject)value_question.$sym39$VALUE_QUESTION_GET_CYC_FOCUSES_METHOD);
        return (SubLObject)value_question.NIL;
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
        me = (SubLFile)new value_question();
        $sym0$VALUE_QUESTION = SubLObjectFactory.makeSymbol("VALUE-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VALUE-PREDICATE"), (SubLObject)value_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CYC-FOCUSES"), (SubLObject)value_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym3$CYC_FOCUSES = SubLObjectFactory.makeSymbol("CYC-FOCUSES");
        $sym4$VALUE_PREDICATE = SubLObjectFactory.makeSymbol("VALUE-PREDICATE");
        $sym5$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym6$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym7$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $sym8$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym9$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym10$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym11$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym12$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym13$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym14$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $sym15$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-CLASS");
        $sym16$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym17$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym18$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym19$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym20$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym21$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym22$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym23$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym24$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym25$SUBLOOP_RESERVED_INITIALIZE_VALUE_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-QUESTION-INSTANCE");
        $sym26$GET_VALUE_PREDICATE = SubLObjectFactory.makeSymbol("GET-VALUE-PREDICATE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-PREDICATE")));
        $sym29$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VALUE-QUESTION-METHOD");
        $sym30$VALUE_QUESTION_GET_VALUE_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("VALUE-QUESTION-GET-VALUE-PREDICATE-METHOD");
        $sym31$GET_CYC_FOCUSES = SubLObjectFactory.makeSymbol("GET-CYC-FOCUSES");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of Cyc interpretations of the focus of this value-question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-LEXES")))), (SubLObject)SubLObjectFactory.makeSymbol("DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), (SubLObject)SubLObjectFactory.makeSymbol("DENOTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CYC-FOCUSES"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DENOTS"))));
        $sym33$OUTER_CATCH_FOR_VALUE_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VALUE-QUESTION-METHOD");
        $sym34$GET_FOCUS = SubLObjectFactory.makeSymbol("GET-FOCUS");
        $sym35$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym36$GET_LEXES = SubLObjectFactory.makeSymbol("GET-LEXES");
        $sym37$GET = SubLObjectFactory.makeSymbol("GET");
        $kw38$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym39$VALUE_QUESTION_GET_CYC_FOCUSES_METHOD = SubLObjectFactory.makeSymbol("VALUE-QUESTION-GET-CYC-FOCUSES-METHOD");
    }
}

/*

	Total time: 155 ms
	
*/