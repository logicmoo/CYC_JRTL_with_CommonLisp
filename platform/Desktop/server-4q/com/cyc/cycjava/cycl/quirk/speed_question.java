package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class speed_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.speed_question";
    public static final String myFingerPrint = "3c546e43cde86078193502141ac9a386dfe823bc9e09cfee0b713257d7d791b0";
    private static final SubLSymbol $sym0$SPEED_QUESTION;
    private static final SubLSymbol $sym1$WH_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_INSTANCE;
    private static final SubLSymbol $sym24$ISA_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GET_DAUGHTER;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$SPEED_QUESTION_ISA__METHOD;
    private static final SubLList $list32;
    private static final SubLObject $const33$Speed;
    private static final SubLSymbol $sym34$SPEED_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/speed-question.lisp", position = 858L)
    public static SubLObject subloop_reserved_initialize_speed_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym3$OBJECT, (SubLObject)speed_question.$sym4$INSTANCE_COUNT, (SubLObject)speed_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym6$LEXICON, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym7$PARSER, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym8$TAGGER, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym9$CHUNKER, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym10$MAX_CANDIDATES, (SubLObject)speed_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym11$MAX_CONFIDENCE, (SubLObject)speed_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym12$LEARNABLE_TYPES, (SubLObject)speed_question.NIL);
        return (SubLObject)speed_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/speed-question.lisp", position = 858L)
    public static SubLObject subloop_reserved_initialize_speed_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym3$OBJECT, (SubLObject)speed_question.$sym14$ISOLATED_P, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym3$OBJECT, (SubLObject)speed_question.$sym15$INSTANCE_NUMBER, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym16$INFORMATION_REQUEST, (SubLObject)speed_question.$sym17$ERROR_HANDLING, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym16$INFORMATION_REQUEST, (SubLObject)speed_question.$sym18$TIMEOUT, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym19$STRING, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym20$PARSE, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym21$ANSWER_TYPES, (SubLObject)speed_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)speed_question.$sym5$QUESTION, (SubLObject)speed_question.$sym22$CORPORA, (SubLObject)speed_question.NIL);
        return (SubLObject)speed_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/speed-question.lisp", position = 858L)
    public static SubLObject speed_question_p(final SubLObject v_speed_question) {
        return classes.subloop_instanceof_class(v_speed_question, (SubLObject)speed_question.$sym0$SPEED_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/speed-question.lisp", position = 1007L)
    public static SubLObject speed_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(speed_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)speed_question.$sym28$GET_DAUGHTER, (SubLObject)speed_question.ZERO_INTEGER)) && speed_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)speed_question.$sym28$GET_DAUGHTER, (SubLObject)speed_question.ZERO_INTEGER), (SubLObject)speed_question.$sym29$GET_STRING), (SubLObject)speed_question.$list30, (SubLObject)speed_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/speed-question.lisp", position = 1238L)
    public static SubLObject speed_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(speed_question.$const33$Speed));
    }
    
    public static SubLObject declare_speed_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.speed_question", "subloop_reserved_initialize_speed_question_class", "SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.speed_question", "subloop_reserved_initialize_speed_question_instance", "SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.speed_question", "speed_question_p", "SPEED-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.speed_question", "speed_question_isaP_method", "SPEED-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.speed_question", "speed_question_answer_types_method", "SPEED-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return (SubLObject)speed_question.NIL;
    }
    
    public static SubLObject init_speed_question_file() {
        return (SubLObject)speed_question.NIL;
    }
    
    public static SubLObject setup_speed_question_file() {
        classes.subloop_new_class((SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$sym1$WH_QUESTION, (SubLObject)speed_question.NIL, (SubLObject)speed_question.NIL, (SubLObject)speed_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$sym23$SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_INSTANCE);
        subloop_reserved_initialize_speed_question_class((SubLObject)speed_question.$sym0$SPEED_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)speed_question.$sym24$ISA_, (SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$list25, (SubLObject)speed_question.$list26, (SubLObject)speed_question.$list27);
        methods.subloop_register_class_method((SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$sym24$ISA_, (SubLObject)speed_question.$sym31$SPEED_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)speed_question.$sym21$ANSWER_TYPES, (SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$list25, (SubLObject)speed_question.NIL, (SubLObject)speed_question.$list32);
        methods.subloop_register_instance_method((SubLObject)speed_question.$sym0$SPEED_QUESTION, (SubLObject)speed_question.$sym21$ANSWER_TYPES, (SubLObject)speed_question.$sym34$SPEED_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)speed_question.NIL;
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
        me = (SubLFile)new speed_question();
        $sym0$SPEED_QUESTION = SubLObjectFactory.makeSymbol("SPEED-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)speed_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_SPEED_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPEED-QUESTION-INSTANCE");
        $sym24$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)speed_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)speed_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How fast")))))));
        $sym28$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How fast"));
        $sym31$SPEED_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("SPEED-QUESTION-ISA?-METHOD");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Speed"))))));
        $const33$Speed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Speed"));
        $sym34$SPEED_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("SPEED-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 77 ms
	
*/