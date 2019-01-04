package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.instances;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class physical_quantity_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.physical_quantity_question";
    public static final String myFingerPrint = "f746d7b901b051bffaf4adf3ab8702425d580351b8cef3f4ff74f3e4dfb37429";
    private static final SubLSymbol $sym0$PHYSICAL_QUANTITY_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_CLASS;
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
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_INSTANCE;
    private static final SubLSymbol $sym26$ISA_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$GET_DAUGHTER;
    private static final SubLSymbol $sym31$GET_STRING;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$PHYSICAL_QUANTITY_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym34$INITIALIZE;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD;
    private static final SubLObject $const37$sizeParameterOfObject;
    private static final SubLSymbol $sym38$PHYSICAL_QUANTITY_QUESTION_INITIALIZE_METHOD;
    private static final SubLList $list39;
    private static final SubLObject $const40$PhysicalQuantity;
    private static final SubLSymbol $sym41$PHYSICAL_QUANTITY_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/physical-quantity-question.lisp", position = 876L)
    public static SubLObject subloop_reserved_initialize_physical_quantity_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym3$OBJECT, (SubLObject)physical_quantity_question.$sym4$INSTANCE_COUNT, (SubLObject)physical_quantity_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym6$LEXICON, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym7$PARSER, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym8$TAGGER, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym9$CHUNKER, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym10$MAX_CANDIDATES, (SubLObject)physical_quantity_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym11$MAX_CONFIDENCE, (SubLObject)physical_quantity_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym12$LEARNABLE_TYPES, (SubLObject)physical_quantity_question.NIL);
        return (SubLObject)physical_quantity_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/physical-quantity-question.lisp", position = 876L)
    public static SubLObject subloop_reserved_initialize_physical_quantity_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym3$OBJECT, (SubLObject)physical_quantity_question.$sym14$ISOLATED_P, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym3$OBJECT, (SubLObject)physical_quantity_question.$sym15$INSTANCE_NUMBER, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym16$INFORMATION_REQUEST, (SubLObject)physical_quantity_question.$sym17$ERROR_HANDLING, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym16$INFORMATION_REQUEST, (SubLObject)physical_quantity_question.$sym18$TIMEOUT, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym19$STRING, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym20$PARSE, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym21$ANSWER_TYPES, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym5$QUESTION, (SubLObject)physical_quantity_question.$sym22$CORPORA, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym1$VALUE_QUESTION, (SubLObject)physical_quantity_question.$sym23$VALUE_PREDICATE, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)physical_quantity_question.$sym1$VALUE_QUESTION, (SubLObject)physical_quantity_question.$sym24$CYC_FOCUSES, (SubLObject)physical_quantity_question.NIL);
        return (SubLObject)physical_quantity_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/physical-quantity-question.lisp", position = 876L)
    public static SubLObject physical_quantity_question_p(final SubLObject v_physical_quantity_question) {
        return classes.subloop_instanceof_class(v_physical_quantity_question, (SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/physical-quantity-question.lisp", position = 1090L)
    public static SubLObject physical_quantity_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(physical_quantity_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)physical_quantity_question.$sym30$GET_DAUGHTER, (SubLObject)physical_quantity_question.ZERO_INTEGER)) && physical_quantity_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)physical_quantity_question.$sym30$GET_DAUGHTER, (SubLObject)physical_quantity_question.ZERO_INTEGER), (SubLObject)physical_quantity_question.$sym31$GET_STRING), (SubLObject)physical_quantity_question.$list32, (SubLObject)physical_quantity_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/physical-quantity-question.lisp", position = 1335L)
    public static SubLObject physical_quantity_question_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_physical_quantity_question_method = (SubLObject)physical_quantity_question.NIL;
        final SubLObject value_predicate = value_question.get_value_question_value_predicate(self);
        try {
            thread.throwStack.push(physical_quantity_question.$sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD);
            try {
                question.question_initialize_method(self);
                instances.set_slot(self, (SubLObject)physical_quantity_question.$sym23$VALUE_PREDICATE, physical_quantity_question.$const37$sizeParameterOfObject);
                Dynamic.sublisp_throw((SubLObject)physical_quantity_question.$sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)physical_quantity_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    value_question.set_value_question_value_predicate(self, value_predicate);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_physical_quantity_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)physical_quantity_question.$sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_physical_quantity_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/physical-quantity-question.lisp", position = 1505L)
    public static SubLObject physical_quantity_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(physical_quantity_question.$const40$PhysicalQuantity));
    }
    
    public static SubLObject declare_physical_quantity_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.physical_quantity_question", "subloop_reserved_initialize_physical_quantity_question_class", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.physical_quantity_question", "subloop_reserved_initialize_physical_quantity_question_instance", "SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.physical_quantity_question", "physical_quantity_question_p", "PHYSICAL-QUANTITY-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.physical_quantity_question", "physical_quantity_question_isaP_method", "PHYSICAL-QUANTITY-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.physical_quantity_question", "physical_quantity_question_initialize_method", "PHYSICAL-QUANTITY-QUESTION-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.physical_quantity_question", "physical_quantity_question_answer_types_method", "PHYSICAL-QUANTITY-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return (SubLObject)physical_quantity_question.NIL;
    }
    
    public static SubLObject init_physical_quantity_question_file() {
        return (SubLObject)physical_quantity_question.NIL;
    }
    
    public static SubLObject setup_physical_quantity_question_file() {
        classes.subloop_new_class((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$sym1$VALUE_QUESTION, (SubLObject)physical_quantity_question.NIL, (SubLObject)physical_quantity_question.NIL, (SubLObject)physical_quantity_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$sym25$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_INSTANCE);
        subloop_reserved_initialize_physical_quantity_question_class((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)physical_quantity_question.$sym26$ISA_, (SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$list27, (SubLObject)physical_quantity_question.$list28, (SubLObject)physical_quantity_question.$list29);
        methods.subloop_register_class_method((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$sym26$ISA_, (SubLObject)physical_quantity_question.$sym33$PHYSICAL_QUANTITY_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)physical_quantity_question.$sym34$INITIALIZE, (SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$list27, (SubLObject)physical_quantity_question.NIL, (SubLObject)physical_quantity_question.$list35);
        methods.subloop_register_instance_method((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$sym34$INITIALIZE, (SubLObject)physical_quantity_question.$sym38$PHYSICAL_QUANTITY_QUESTION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)physical_quantity_question.$sym21$ANSWER_TYPES, (SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$list27, (SubLObject)physical_quantity_question.NIL, (SubLObject)physical_quantity_question.$list39);
        methods.subloop_register_instance_method((SubLObject)physical_quantity_question.$sym0$PHYSICAL_QUANTITY_QUESTION, (SubLObject)physical_quantity_question.$sym21$ANSWER_TYPES, (SubLObject)physical_quantity_question.$sym41$PHYSICAL_QUANTITY_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)physical_quantity_question.NIL;
    }
    
    public void declareFunctions() {
        declare_physical_quantity_question_file();
    }
    
    public void initializeVariables() {
        init_physical_quantity_question_file();
    }
    
    public void runTopLevelForms() {
        setup_physical_quantity_question_file();
    }
    
    static {
        me = (SubLFile)new physical_quantity_question();
        $sym0$PHYSICAL_QUANTITY_QUESTION = SubLObjectFactory.makeSymbol("PHYSICAL-QUANTITY-QUESTION");
        $sym1$VALUE_QUESTION = SubLObjectFactory.makeSymbol("VALUE-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)physical_quantity_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)physical_quantity_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-CLASS");
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
        $sym25$SUBLOOP_RESERVED_INITIALIZE_PHYSICAL_QUANTITY_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PHYSICAL-QUANTITY-QUESTION-INSTANCE");
        $sym26$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)physical_quantity_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)physical_quantity_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How big"), (SubLObject)SubLObjectFactory.makeString("How much")))))));
        $sym30$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym31$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How big"), (SubLObject)SubLObjectFactory.makeString("How much"));
        $sym33$PHYSICAL_QUANTITY_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("PHYSICAL-QUANTITY-QUESTION-ISA?-METHOD");
        $sym34$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-PREDICATE")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sizeParameterOfObject"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym36$OUTER_CATCH_FOR_PHYSICAL_QUANTITY_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PHYSICAL-QUANTITY-QUESTION-METHOD");
        $const37$sizeParameterOfObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sizeParameterOfObject"));
        $sym38$PHYSICAL_QUANTITY_QUESTION_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("PHYSICAL-QUANTITY-QUESTION-INITIALIZE-METHOD");
        $list39 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalQuantity"))))));
        $const40$PhysicalQuantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhysicalQuantity"));
        $sym41$PHYSICAL_QUANTITY_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("PHYSICAL-QUANTITY-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 93 ms
	
*/