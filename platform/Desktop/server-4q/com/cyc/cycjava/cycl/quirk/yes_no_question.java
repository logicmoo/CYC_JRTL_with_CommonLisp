package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class yes_no_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.yes_no_question";
    public static final String myFingerPrint = "14dcbd3943492d62a9a9ea5e50e50e5cad9413821e597061afc4c7e22fa840a5";
    private static final SubLSymbol $sym0$YES_NO_QUESTION;
    private static final SubLSymbol $sym1$QUESTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$LEXICON;
    private static final SubLSymbol $sym6$PARSER;
    private static final SubLSymbol $sym7$TAGGER;
    private static final SubLSymbol $sym8$CHUNKER;
    private static final SubLSymbol $sym9$MAX_CANDIDATES;
    private static final SubLSymbol $sym10$MAX_CONFIDENCE;
    private static final SubLSymbol $sym11$LEARNABLE_TYPES;
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS;
    private static final SubLSymbol $sym13$ISOLATED_P;
    private static final SubLSymbol $sym14$INSTANCE_NUMBER;
    private static final SubLSymbol $sym15$INFORMATION_REQUEST;
    private static final SubLSymbol $sym16$ERROR_HANDLING;
    private static final SubLSymbol $sym17$TIMEOUT;
    private static final SubLSymbol $sym18$STRING;
    private static final SubLSymbol $sym19$PARSE;
    private static final SubLSymbol $sym20$ANSWER_TYPES;
    private static final SubLSymbol $sym21$CORPORA;
    private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE;
    private static final SubLSymbol $sym23$ISA_;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$GET_DAUGHTER;
    private static final SubLSymbol $sym28$YES_NO_QUESTION_ISA__METHOD;
    private static final SubLList $list29;
    private static final SubLObject $const30$SubLBoolean;
    private static final SubLSymbol $sym31$YES_NO_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 854L)
    public static SubLObject subloop_reserved_initialize_yes_no_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym3$OBJECT, (SubLObject)yes_no_question.$sym4$INSTANCE_COUNT, (SubLObject)yes_no_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym5$LEXICON, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym6$PARSER, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym7$TAGGER, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym8$CHUNKER, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym9$MAX_CANDIDATES, (SubLObject)yes_no_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym10$MAX_CONFIDENCE, (SubLObject)yes_no_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym11$LEARNABLE_TYPES, (SubLObject)yes_no_question.NIL);
        return (SubLObject)yes_no_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 854L)
    public static SubLObject subloop_reserved_initialize_yes_no_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym3$OBJECT, (SubLObject)yes_no_question.$sym13$ISOLATED_P, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym3$OBJECT, (SubLObject)yes_no_question.$sym14$INSTANCE_NUMBER, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym15$INFORMATION_REQUEST, (SubLObject)yes_no_question.$sym16$ERROR_HANDLING, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym15$INFORMATION_REQUEST, (SubLObject)yes_no_question.$sym17$TIMEOUT, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym18$STRING, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym19$PARSE, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym20$ANSWER_TYPES, (SubLObject)yes_no_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.$sym21$CORPORA, (SubLObject)yes_no_question.NIL);
        return (SubLObject)yes_no_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 854L)
    public static SubLObject yes_no_question_p(final SubLObject v_yes_no_question) {
        return classes.subloop_instanceof_class(v_yes_no_question, (SubLObject)yes_no_question.$sym0$YES_NO_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 1001L)
    public static SubLObject yes_no_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(yes_no_question.NIL != parse_tree.sq_tree_p(tree) && yes_no_question.NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)yes_no_question.$sym27$GET_DAUGHTER, (SubLObject)yes_no_question.ZERO_INTEGER)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/yes-no-question.lisp", position = 1256L)
    public static SubLObject yes_no_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(yes_no_question.$const30$SubLBoolean));
    }
    
    public static SubLObject declare_yes_no_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.yes_no_question", "subloop_reserved_initialize_yes_no_question_class", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.yes_no_question", "subloop_reserved_initialize_yes_no_question_instance", "SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.yes_no_question", "yes_no_question_p", "YES-NO-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.yes_no_question", "yes_no_question_isaP_method", "YES-NO-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.yes_no_question", "yes_no_question_answer_types_method", "YES-NO-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        return (SubLObject)yes_no_question.NIL;
    }
    
    public static SubLObject init_yes_no_question_file() {
        return (SubLObject)yes_no_question.NIL;
    }
    
    public static SubLObject setup_yes_no_question_file() {
        classes.subloop_new_class((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$sym1$QUESTION, (SubLObject)yes_no_question.NIL, (SubLObject)yes_no_question.NIL, (SubLObject)yes_no_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$sym12$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$sym22$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE);
        subloop_reserved_initialize_yes_no_question_class((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)yes_no_question.$sym23$ISA_, (SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$list24, (SubLObject)yes_no_question.$list25, (SubLObject)yes_no_question.$list26);
        methods.subloop_register_class_method((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$sym23$ISA_, (SubLObject)yes_no_question.$sym28$YES_NO_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)yes_no_question.$sym20$ANSWER_TYPES, (SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$list24, (SubLObject)yes_no_question.NIL, (SubLObject)yes_no_question.$list29);
        methods.subloop_register_instance_method((SubLObject)yes_no_question.$sym0$YES_NO_QUESTION, (SubLObject)yes_no_question.$sym20$ANSWER_TYPES, (SubLObject)yes_no_question.$sym31$YES_NO_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)yes_no_question.NIL;
    }
    
    public void declareFunctions() {
        declare_yes_no_question_file();
    }
    
    public void initializeVariables() {
        init_yes_no_question_file();
    }
    
    public void runTopLevelForms() {
        setup_yes_no_question_file();
    }
    
    static {
        me = (SubLFile)new yes_no_question();
        $sym0$YES_NO_QUESTION = SubLObjectFactory.makeSymbol("YES-NO-QUESTION");
        $sym1$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)yes_no_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym6$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym7$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym8$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym9$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym10$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym11$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-CLASS");
        $sym13$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym14$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym15$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym16$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym17$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym18$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym19$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym20$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym21$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym22$SUBLOOP_RESERVED_INITIALIZE_YES_NO_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-YES-NO-QUESTION-INSTANCE");
        $sym23$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PARSE question-tree-p\n   @return boolean; t if PARSE is a yes-no question parse tree, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SQ-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)yes_no_question.ZERO_INTEGER)))));
        $sym27$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym28$YES_NO_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("YES-NO-QUESTION-ISA?-METHOD");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLBoolean"))))));
        $const30$SubLBoolean = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLBoolean"));
        $sym31$YES_NO_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("YES-NO-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 76 ms
	
*/