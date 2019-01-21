package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class event_location_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.event_location_question";
    public static final String myFingerPrint = "6e5e4df0ea8b7c152d1c526303190d7eb7452d8883a78619b29134250f16c579";
    private static final SubLSymbol $sym0$EVENT_LOCATION_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE;
    private static final SubLSymbol $sym24$ISA_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GET_DAUGHTER;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$GET_PREDICATE;
    private static final SubLSymbol $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD;
    private static final SubLList $list33;
    private static final SubLObject $const34$Place;
    private static final SubLSymbol $sym35$EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 883L)
    public static SubLObject subloop_reserved_initialize_event_location_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym3$OBJECT, (SubLObject)event_location_question.$sym4$INSTANCE_COUNT, (SubLObject)event_location_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym6$LEXICON, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym7$PARSER, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym8$TAGGER, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym9$CHUNKER, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym10$MAX_CANDIDATES, (SubLObject)event_location_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym11$MAX_CONFIDENCE, (SubLObject)event_location_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym12$LEARNABLE_TYPES, (SubLObject)event_location_question.NIL);
        return (SubLObject)event_location_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 883L)
    public static SubLObject subloop_reserved_initialize_event_location_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym3$OBJECT, (SubLObject)event_location_question.$sym14$ISOLATED_P, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym3$OBJECT, (SubLObject)event_location_question.$sym15$INSTANCE_NUMBER, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym16$INFORMATION_REQUEST, (SubLObject)event_location_question.$sym17$ERROR_HANDLING, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym16$INFORMATION_REQUEST, (SubLObject)event_location_question.$sym18$TIMEOUT, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym19$STRING, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym20$PARSE, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym21$ANSWER_TYPES, (SubLObject)event_location_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)event_location_question.$sym5$QUESTION, (SubLObject)event_location_question.$sym22$CORPORA, (SubLObject)event_location_question.NIL);
        return (SubLObject)event_location_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 883L)
    public static SubLObject event_location_question_p(final SubLObject v_event_location_question) {
        return classes.subloop_instanceof_class(v_event_location_question, (SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 1041L)
    public static SubLObject event_location_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(event_location_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)event_location_question.$sym28$GET_DAUGHTER, (SubLObject)event_location_question.ZERO_INTEGER)) && event_location_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)event_location_question.$sym28$GET_DAUGHTER, (SubLObject)event_location_question.ZERO_INTEGER), (SubLObject)event_location_question.$sym29$GET_STRING), (SubLObject)event_location_question.$list30, (SubLObject)event_location_question.UNPROVIDED) && event_location_question.NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, (SubLObject)event_location_question.$sym31$GET_PREDICATE)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/event-location-question.lisp", position = 1440L)
    public static SubLObject event_location_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(event_location_question.$const34$Place));
    }
    
    public static SubLObject declare_event_location_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.event_location_question", "subloop_reserved_initialize_event_location_question_class", "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.event_location_question", "subloop_reserved_initialize_event_location_question_instance", "SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.event_location_question", "event_location_question_p", "EVENT-LOCATION-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.event_location_question", "event_location_question_isaP_method", "EVENT-LOCATION-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.event_location_question", "event_location_question_answer_types_method", "EVENT-LOCATION-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return (SubLObject)event_location_question.NIL;
    }
    
    public static SubLObject init_event_location_question_file() {
        return (SubLObject)event_location_question.NIL;
    }
    
    public static SubLObject setup_event_location_question_file() {
        classes.subloop_new_class((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$sym1$WH_QUESTION, (SubLObject)event_location_question.NIL, (SubLObject)event_location_question.NIL, (SubLObject)event_location_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$sym23$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE);
        subloop_reserved_initialize_event_location_question_class((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)event_location_question.$sym24$ISA_, (SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$list25, (SubLObject)event_location_question.$list26, (SubLObject)event_location_question.$list27);
        methods.subloop_register_class_method((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$sym24$ISA_, (SubLObject)event_location_question.$sym32$EVENT_LOCATION_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)event_location_question.$sym21$ANSWER_TYPES, (SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$list25, (SubLObject)event_location_question.NIL, (SubLObject)event_location_question.$list33);
        methods.subloop_register_instance_method((SubLObject)event_location_question.$sym0$EVENT_LOCATION_QUESTION, (SubLObject)event_location_question.$sym21$ANSWER_TYPES, (SubLObject)event_location_question.$sym35$EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)event_location_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_event_location_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_event_location_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_event_location_question_file();
    }
    
    static {
        me = (SubLFile)new event_location_question();
        $sym0$EVENT_LOCATION_QUESTION = SubLObjectFactory.makeSymbol("EVENT-LOCATION-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)event_location_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_EVENT_LOCATION_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EVENT-LOCATION-QUESTION-INSTANCE");
        $sym24$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolen; t if TREE is an event location (aka where) question, \n   nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)event_location_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)event_location_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("where"), (SubLObject)SubLObjectFactory.makeString("whence"), (SubLObject)SubLObjectFactory.makeString("whither")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"))))))));
        $sym28$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("where"), (SubLObject)SubLObjectFactory.makeString("whence"), (SubLObject)SubLObjectFactory.makeString("whither"));
        $sym31$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $sym32$EVENT_LOCATION_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("EVENT-LOCATION-QUESTION-ISA?-METHOD");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"))))));
        $const34$Place = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"));
        $sym35$EVENT_LOCATION_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("EVENT-LOCATION-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 30 ms
	
*/