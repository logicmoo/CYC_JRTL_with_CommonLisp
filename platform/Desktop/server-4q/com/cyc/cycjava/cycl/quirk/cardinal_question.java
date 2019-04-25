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

public final class cardinal_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.cardinal_question";
    public static final String myFingerPrint = "ccfeae7ee7fa0fc343c122d5ec4b3f403c7f282ea946bdb7dbbcf9659b3f330b";
    private static final SubLSymbol $sym0$CARDINAL_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_CLASS;
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
    private static final SubLSymbol $sym25$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_INSTANCE;
    private static final SubLSymbol $sym26$ISA_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$GET_DAUGHTER;
    private static final SubLSymbol $sym31$GET_STRING;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$CARDINAL_QUESTION_ISA__METHOD;
    private static final SubLList $list34;
    private static final SubLObject $const35$Cardinal_Mathematical;
    private static final SubLSymbol $sym36$CARDINAL_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/cardinal-question.lisp", position = 848L)
    public static SubLObject subloop_reserved_initialize_cardinal_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym3$OBJECT, (SubLObject)cardinal_question.$sym4$INSTANCE_COUNT, (SubLObject)cardinal_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym6$LEXICON, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym7$PARSER, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym8$TAGGER, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym9$CHUNKER, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym10$MAX_CANDIDATES, (SubLObject)cardinal_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym11$MAX_CONFIDENCE, (SubLObject)cardinal_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym12$LEARNABLE_TYPES, (SubLObject)cardinal_question.NIL);
        return (SubLObject)cardinal_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/cardinal-question.lisp", position = 848L)
    public static SubLObject subloop_reserved_initialize_cardinal_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym3$OBJECT, (SubLObject)cardinal_question.$sym14$ISOLATED_P, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym3$OBJECT, (SubLObject)cardinal_question.$sym15$INSTANCE_NUMBER, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym16$INFORMATION_REQUEST, (SubLObject)cardinal_question.$sym17$ERROR_HANDLING, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym16$INFORMATION_REQUEST, (SubLObject)cardinal_question.$sym18$TIMEOUT, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym19$STRING, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym20$PARSE, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym21$ANSWER_TYPES, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym5$QUESTION, (SubLObject)cardinal_question.$sym22$CORPORA, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym1$VALUE_QUESTION, (SubLObject)cardinal_question.$sym23$VALUE_PREDICATE, (SubLObject)cardinal_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cardinal_question.$sym1$VALUE_QUESTION, (SubLObject)cardinal_question.$sym24$CYC_FOCUSES, (SubLObject)cardinal_question.NIL);
        return (SubLObject)cardinal_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/cardinal-question.lisp", position = 848L)
    public static SubLObject cardinal_question_p(final SubLObject v_cardinal_question) {
        return classes.subloop_instanceof_class(v_cardinal_question, (SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/cardinal-question.lisp", position = 1003L)
    public static SubLObject cardinal_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cardinal_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)cardinal_question.$sym30$GET_DAUGHTER, (SubLObject)cardinal_question.ZERO_INTEGER)) && cardinal_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)cardinal_question.$sym30$GET_DAUGHTER, (SubLObject)cardinal_question.ZERO_INTEGER), (SubLObject)cardinal_question.$sym31$GET_STRING), (SubLObject)cardinal_question.$list32, (SubLObject)cardinal_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/cardinal-question.lisp", position = 1237L)
    public static SubLObject cardinal_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cardinal_question.$const35$Cardinal_Mathematical));
    }
    
    public static SubLObject declare_cardinal_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.cardinal_question", "subloop_reserved_initialize_cardinal_question_class", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.cardinal_question", "subloop_reserved_initialize_cardinal_question_instance", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.cardinal_question", "cardinal_question_p", "CARDINAL-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.cardinal_question", "cardinal_question_isaP_method", "CARDINAL-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.cardinal_question", "cardinal_question_answer_types_method", "CARDINAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return (SubLObject)cardinal_question.NIL;
    }
    
    public static SubLObject init_cardinal_question_file() {
        return (SubLObject)cardinal_question.NIL;
    }
    
    public static SubLObject setup_cardinal_question_file() {
        classes.subloop_new_class((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$sym1$VALUE_QUESTION, (SubLObject)cardinal_question.NIL, (SubLObject)cardinal_question.NIL, (SubLObject)cardinal_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$sym25$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_INSTANCE);
        subloop_reserved_initialize_cardinal_question_class((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)cardinal_question.$sym26$ISA_, (SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$list27, (SubLObject)cardinal_question.$list28, (SubLObject)cardinal_question.$list29);
        methods.subloop_register_class_method((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$sym26$ISA_, (SubLObject)cardinal_question.$sym33$CARDINAL_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cardinal_question.$sym21$ANSWER_TYPES, (SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$list27, (SubLObject)cardinal_question.NIL, (SubLObject)cardinal_question.$list34);
        methods.subloop_register_instance_method((SubLObject)cardinal_question.$sym0$CARDINAL_QUESTION, (SubLObject)cardinal_question.$sym21$ANSWER_TYPES, (SubLObject)cardinal_question.$sym36$CARDINAL_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)cardinal_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cardinal_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cardinal_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cardinal_question_file();
    }
    
    static {
        me = (SubLFile)new cardinal_question();
        $sym0$CARDINAL_QUESTION = SubLObjectFactory.makeSymbol("CARDINAL-QUESTION");
        $sym1$VALUE_QUESTION = SubLObjectFactory.makeSymbol("VALUE-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)cardinal_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-CLASS");
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
        $sym25$SUBLOOP_RESERVED_INITIALIZE_CARDINAL_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-QUESTION-INSTANCE");
        $sym26$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)cardinal_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)cardinal_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How many")))))));
        $sym30$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym31$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("How many"));
        $sym33$CARDINAL_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("CARDINAL-QUESTION-ISA?-METHOD");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardinal-Mathematical"))))));
        $const35$Cardinal_Mathematical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cardinal-Mathematical"));
        $sym36$CARDINAL_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("CARDINAL-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 29 ms
	
*/