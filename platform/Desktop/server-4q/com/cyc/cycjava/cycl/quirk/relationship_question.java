package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class relationship_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.relationship_question";
    public static final String myFingerPrint = "5df1aeda613135d7081f74d0a8faca386829d9d5f465b1615940113f5d2592d1";
    private static final SubLSymbol $sym0$RELATIONSHIP_QUESTION;
    private static final SubLSymbol $sym1$QUESTION;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$INFORMATION_EXTRACTION_GRAPH;
    private static final SubLSymbol $sym4$WORD_GRAPH;
    private static final SubLSymbol $sym5$OBJECT;
    private static final SubLSymbol $sym6$INSTANCE_COUNT;
    private static final SubLSymbol $sym7$LEXICON;
    private static final SubLSymbol $sym8$PARSER;
    private static final SubLSymbol $sym9$TAGGER;
    private static final SubLSymbol $sym10$CHUNKER;
    private static final SubLSymbol $sym11$MAX_CANDIDATES;
    private static final SubLSymbol $sym12$MAX_CONFIDENCE;
    private static final SubLSymbol $sym13$LEARNABLE_TYPES;
    private static final SubLSymbol $sym14$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS;
    private static final SubLSymbol $sym15$ISOLATED_P;
    private static final SubLSymbol $sym16$INSTANCE_NUMBER;
    private static final SubLSymbol $sym17$INFORMATION_REQUEST;
    private static final SubLSymbol $sym18$ERROR_HANDLING;
    private static final SubLSymbol $sym19$TIMEOUT;
    private static final SubLSymbol $sym20$STRING;
    private static final SubLSymbol $sym21$PARSE;
    private static final SubLSymbol $sym22$ANSWER_TYPES;
    private static final SubLSymbol $sym23$CORPORA;
    private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE;
    private static final SubLSymbol $sym25$ISA_;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLString $str31$between;
    private static final SubLString $str32$common;
    private static final SubLSymbol $sym33$YIELD;
    private static final SubLSymbol $sym34$RELATIONSHIP_QUESTION_ISA__METHOD;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$QUERIFY;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$OUTER_CATCH_FOR_QUESTION_METHOD;
    private static final SubLSymbol $sym39$GET_KEYSTRINGS;
    private static final SubLSymbol $sym40$AUGMENT_TERMS;
    private static final SubLString $str41$_;
    private static final SubLSymbol $sym42$QUESTION_QUERIFY_METHOD;
    private static final SubLSymbol $sym43$EXTRACT;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$GET_SCORE;
    private static final SubLSymbol $sym47$QUESTION_EXTRACT_METHOD;
    private static final SubLSymbol $sym48$ANSWER_CARDINALITY;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$QUESTION_ANSWER_CARDINALITY_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject get_relationship_question_information_extraction_graph(final SubLObject v_relationship_question) {
        return classes.subloop_get_access_protected_instance_slot(v_relationship_question, (SubLObject)relationship_question.EIGHT_INTEGER, (SubLObject)relationship_question.$sym3$INFORMATION_EXTRACTION_GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject set_relationship_question_information_extraction_graph(final SubLObject v_relationship_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_relationship_question, value, (SubLObject)relationship_question.EIGHT_INTEGER, (SubLObject)relationship_question.$sym3$INFORMATION_EXTRACTION_GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject get_relationship_question_word_graph(final SubLObject v_relationship_question) {
        return classes.subloop_get_access_protected_instance_slot(v_relationship_question, (SubLObject)relationship_question.SEVEN_INTEGER, (SubLObject)relationship_question.$sym4$WORD_GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject set_relationship_question_word_graph(final SubLObject v_relationship_question, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_relationship_question, value, (SubLObject)relationship_question.SEVEN_INTEGER, (SubLObject)relationship_question.$sym4$WORD_GRAPH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject subloop_reserved_initialize_relationship_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym5$OBJECT, (SubLObject)relationship_question.$sym6$INSTANCE_COUNT, (SubLObject)relationship_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym7$LEXICON, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym8$PARSER, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym9$TAGGER, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym10$CHUNKER, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym11$MAX_CANDIDATES, (SubLObject)relationship_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym12$MAX_CONFIDENCE, (SubLObject)relationship_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym13$LEARNABLE_TYPES, (SubLObject)relationship_question.NIL);
        return (SubLObject)relationship_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject subloop_reserved_initialize_relationship_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym5$OBJECT, (SubLObject)relationship_question.$sym15$ISOLATED_P, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym5$OBJECT, (SubLObject)relationship_question.$sym16$INSTANCE_NUMBER, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym17$INFORMATION_REQUEST, (SubLObject)relationship_question.$sym18$ERROR_HANDLING, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym17$INFORMATION_REQUEST, (SubLObject)relationship_question.$sym19$TIMEOUT, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym20$STRING, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym21$PARSE, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym22$ANSWER_TYPES, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym23$CORPORA, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$sym4$WORD_GRAPH, (SubLObject)relationship_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$sym3$INFORMATION_EXTRACTION_GRAPH, (SubLObject)relationship_question.NIL);
        return (SubLObject)relationship_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 893L)
    public static SubLObject relationship_question_p(final SubLObject v_relationship_question) {
        return classes.subloop_instanceof_class(v_relationship_question, (SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 1203L)
    public static SubLObject relationship_question_isaP_method(final SubLObject self, final SubLObject tree) {
        SubLObject what_flag = (SubLObject)relationship_question.NIL;
        SubLObject rel_flag = (SubLObject)relationship_question.NIL;
        SubLObject done = (SubLObject)relationship_question.NIL;
        if (relationship_question.NIL == done) {
            SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(tree, (SubLObject)relationship_question.$sym33$YIELD);
            SubLObject word = (SubLObject)relationship_question.NIL;
            word = csome_list_var.first();
            while (relationship_question.NIL == done && relationship_question.NIL != csome_list_var) {
                final SubLObject word_string = methods.funcall_instance_method_with_0_args(word, (SubLObject)relationship_question.$sym29$GET_STRING);
                if (relationship_question.NIL != conses_high.member(word_string, (SubLObject)relationship_question.$list30, Symbols.symbol_function((SubLObject)relationship_question.EQUALP), (SubLObject)relationship_question.UNPROVIDED)) {
                    what_flag = (SubLObject)relationship_question.T;
                }
                else if (relationship_question.NIL != relationship_string_p(word_string) && relationship_question.NIL != what_flag) {
                    rel_flag = (SubLObject)relationship_question.T;
                }
                else if (word_string.equalp((SubLObject)relationship_question.$str31$between) && relationship_question.NIL != rel_flag) {
                    done = (SubLObject)relationship_question.T;
                }
                else if (word_string.equalp((SubLObject)relationship_question.$str32$common)) {
                    done = (SubLObject)relationship_question.T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            }
        }
        return done;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 1783L)
    public static SubLObject relationship_string_p(final SubLObject string) {
        return conses_high.member(morphology.get_root(string, (SubLObject)relationship_question.UNPROVIDED), (SubLObject)relationship_question.$list35, (SubLObject)relationship_question.EQUALP, (SubLObject)relationship_question.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 2029L)
    public static SubLObject question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_method = (SubLObject)relationship_question.NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push(relationship_question.$sym38$OUTER_CATCH_FOR_QUESTION_METHOD);
            try {
                SubLObject content_terms = (SubLObject)relationship_question.NIL;
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)relationship_question.$sym39$GET_KEYSTRINGS);
                SubLObject v_term = (SubLObject)relationship_question.NIL;
                v_term = cdolist_list_var.first();
                while (relationship_question.NIL != cdolist_list_var) {
                    if (relationship_question.NIL == relationship_string_p(v_term)) {
                        content_terms = (SubLObject)ConsesLow.cons(v_term, content_terms);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                }
                if (relationship_question.NIL == content_terms) {
                    Dynamic.sublisp_throw((SubLObject)relationship_question.$sym38$OUTER_CATCH_FOR_QUESTION_METHOD, (SubLObject)relationship_question.NIL);
                }
                SubLObject queries = (SubLObject)relationship_question.NIL;
                final SubLObject content_string = string_utilities.bunge(content_terms, (SubLObject)relationship_question.UNPROVIDED);
                SubLObject cdolist_list_var2 = corpora;
                SubLObject corpus = (SubLObject)relationship_question.NIL;
                corpus = cdolist_list_var2.first();
                while (relationship_question.NIL != cdolist_list_var2) {
                    final SubLObject augmentation_terms = methods.funcall_class_method_with_2_args((SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym40$AUGMENT_TERMS, content_terms, corpus);
                    SubLObject query = string_utilities.bunge(augmentation_terms, (SubLObject)relationship_question.UNPROVIDED);
                    SubLObject i;
                    for (i = (SubLObject)relationship_question.NIL, i = (SubLObject)relationship_question.ZERO_INTEGER; i.numL((SubLObject)relationship_question.THREE_INTEGER); i = Numbers.add(i, (SubLObject)relationship_question.ONE_INTEGER)) {
                        query = Sequences.cconcatenate(content_string, new SubLObject[] { relationship_question.$str41$_, query });
                    }
                    queries = (SubLObject)ConsesLow.cons(search_engine.new_lemur_query(query, corpus, (SubLObject)relationship_question.UNPROVIDED, (SubLObject)relationship_question.UNPROVIDED), queries);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    corpus = cdolist_list_var2.first();
                }
                Dynamic.sublisp_throw((SubLObject)relationship_question.$sym38$OUTER_CATCH_FOR_QUESTION_METHOD, Sequences.nreverse(queries));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)relationship_question.T, thread);
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
            catch_var_for_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)relationship_question.$sym38$OUTER_CATCH_FOR_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 2748L)
    public static SubLObject question_extract_method(final SubLObject self, final SubLObject passage) {
        return (SubLObject)ConsesLow.list(answer.new_sentence_answer(self, passage, methods.funcall_instance_method_with_0_args(passage, (SubLObject)relationship_question.$sym46$GET_SCORE)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/relationship-question.lisp", position = 2953L)
    public static SubLObject question_answer_cardinality_method(final SubLObject self) {
        return (SubLObject)relationship_question.TEN_INTEGER;
    }
    
    public static SubLObject declare_relationship_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "get_relationship_question_information_extraction_graph", "GET-RELATIONSHIP-QUESTION-INFORMATION-EXTRACTION-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "set_relationship_question_information_extraction_graph", "SET-RELATIONSHIP-QUESTION-INFORMATION-EXTRACTION-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "get_relationship_question_word_graph", "GET-RELATIONSHIP-QUESTION-WORD-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "set_relationship_question_word_graph", "SET-RELATIONSHIP-QUESTION-WORD-GRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "subloop_reserved_initialize_relationship_question_class", "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "subloop_reserved_initialize_relationship_question_instance", "SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "relationship_question_p", "RELATIONSHIP-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "relationship_question_isaP_method", "RELATIONSHIP-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "relationship_string_p", "RELATIONSHIP-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "question_querify_method", "QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "question_extract_method", "QUESTION-EXTRACT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.relationship_question", "question_answer_cardinality_method", "QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        return (SubLObject)relationship_question.NIL;
    }
    
    public static SubLObject init_relationship_question_file() {
        return (SubLObject)relationship_question.NIL;
    }
    
    public static SubLObject setup_relationship_question_file() {
        classes.subloop_new_class((SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.NIL, (SubLObject)relationship_question.NIL, (SubLObject)relationship_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$sym14$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$sym24$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE);
        subloop_reserved_initialize_relationship_question_class((SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)relationship_question.$sym25$ISA_, (SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$list26, (SubLObject)relationship_question.$list27, (SubLObject)relationship_question.$list28);
        methods.subloop_register_class_method((SubLObject)relationship_question.$sym0$RELATIONSHIP_QUESTION, (SubLObject)relationship_question.$sym25$ISA_, (SubLObject)relationship_question.$sym34$RELATIONSHIP_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)relationship_question.$sym36$QUERIFY, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$list26, (SubLObject)relationship_question.NIL, (SubLObject)relationship_question.$list37);
        methods.subloop_register_instance_method((SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym36$QUERIFY, (SubLObject)relationship_question.$sym42$QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)relationship_question.$sym43$EXTRACT, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$list26, (SubLObject)relationship_question.$list44, (SubLObject)relationship_question.$list45);
        methods.subloop_register_instance_method((SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym43$EXTRACT, (SubLObject)relationship_question.$sym47$QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)relationship_question.$sym48$ANSWER_CARDINALITY, (SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$list26, (SubLObject)relationship_question.NIL, (SubLObject)relationship_question.$list49);
        methods.subloop_register_instance_method((SubLObject)relationship_question.$sym1$QUESTION, (SubLObject)relationship_question.$sym48$ANSWER_CARDINALITY, (SubLObject)relationship_question.$sym50$QUESTION_ANSWER_CARDINALITY_METHOD);
        return (SubLObject)relationship_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_relationship_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_relationship_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_relationship_question_file();
    }
    
    static {
        me = (SubLFile)new relationship_question();
        $sym0$RELATIONSHIP_QUESTION = SubLObjectFactory.makeSymbol("RELATIONSHIP-QUESTION");
        $sym1$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-GRAPH"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-GRAPH"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)relationship_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$INFORMATION_EXTRACTION_GRAPH = SubLObjectFactory.makeSymbol("INFORMATION-EXTRACTION-GRAPH");
        $sym4$WORD_GRAPH = SubLObjectFactory.makeSymbol("WORD-GRAPH");
        $sym5$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym6$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym7$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym8$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym9$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym10$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym11$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym12$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym13$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $sym14$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-CLASS");
        $sym15$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym16$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym17$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym18$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym19$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym20$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym21$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym22$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym23$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym24$SUBLOOP_RESERVED_INITIALIZE_RELATIONSHIP_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-RELATIONSHIP-QUESTION-INSTANCE");
        $sym25$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if TREE is a relationship question, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHAT-FLAG"), (SubLObject)SubLObjectFactory.makeSymbol("REL-FLAG"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("what"), (SubLObject)SubLObjectFactory.makeString("which"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)relationship_question.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("WHAT-FLAG"), (SubLObject)relationship_question.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIONSHIP-STRING-P"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("WHAT-FLAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("REL-FLAG"), (SubLObject)relationship_question.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)relationship_question.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeString("between")), (SubLObject)SubLObjectFactory.makeSymbol("REL-FLAG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)relationship_question.T)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)relationship_question.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeString("common")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)relationship_question.T))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"))));
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("what"), (SubLObject)SubLObjectFactory.makeString("which"));
        $str31$between = SubLObjectFactory.makeString("between");
        $str32$common = SubLObjectFactory.makeString("common");
        $sym33$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym34$RELATIONSHIP_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("RELATIONSHIP-QUESTION-ISA?-METHOD");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("relationship"), (SubLObject)SubLObjectFactory.makeString("connection"), (SubLObject)SubLObjectFactory.makeString("link"), (SubLObject)SubLObjectFactory.makeString("nexus"), (SubLObject)SubLObjectFactory.makeString("tie"), (SubLObject)SubLObjectFactory.makeString("tied"));
        $sym36$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS"), (SubLObject)relationship_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYSTRINGS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIONSHIP-STRING-P"), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)relationship_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)relationship_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT-TERMS")), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)relationship_question.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-STRING"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeSymbol("QUERY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"))))));
        $sym38$OUTER_CATCH_FOR_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-METHOD");
        $sym39$GET_KEYSTRINGS = SubLObjectFactory.makeSymbol("GET-KEYSTRINGS");
        $sym40$AUGMENT_TERMS = SubLObjectFactory.makeSymbol("AUGMENT-TERMS");
        $str41$_ = SubLObjectFactory.makeString(" ");
        $sym42$QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("QUESTION-QUERIFY-METHOD");
        $sym43$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SENTENCE-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SCORE")))))));
        $sym46$GET_SCORE = SubLObjectFactory.makeSymbol("GET-SCORE");
        $sym47$QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("QUESTION-EXTRACT-METHOD");
        $sym48$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the number of answers expected for this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)relationship_question.TEN_INTEGER));
        $sym50$QUESTION_ANSWER_CARDINALITY_METHOD = SubLObjectFactory.makeSymbol("QUESTION-ANSWER-CARDINALITY-METHOD");
    }
}

/*

	Total time: 139 ms
	
*/