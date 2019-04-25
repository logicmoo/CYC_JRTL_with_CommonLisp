package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.word_tree;
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

public final class intelligent_agent_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.intelligent_agent_question";
    public static final String myFingerPrint = "dc5617775db505b64f28e333e0e77ac6a74a1600e62f2a460b861b3bb84c1828";
    private static final SubLSymbol $sym0$INTELLIGENT_AGENT_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE;
    private static final SubLSymbol $sym24$ISA_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GET_DAUGHTER;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$GET_PREDICATE;
    private static final SubLSymbol $sym32$GET_SUBJECT;
    private static final SubLSymbol $sym33$GET_HEAD;
    private static final SubLSymbol $sym34$GET_CATEGORY;
    private static final SubLSymbol $kw35$NN;
    private static final SubLString $str36$the;
    private static final SubLSymbol $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym38$QUERIFY;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD;
    private static final SubLSymbol $sym41$EXTRACT;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD;
    private static final SubLSymbol $sym45$LEARN;
    private static final SubLSymbol $sym46$GET_CONTENT;
    private static final SubLSymbol $sym47$LEXIFY;
    private static final SubLSymbol $sym48$SUBJECT_QUESTION_P;
    private static final SubLSymbol $sym49$GET_SEMANTIC_OBJECTS;
    private static final SubLSymbol $sym50$GET_SEMANTIC_SUBJECT;
    private static final SubLSymbol $sym51$YIELD;
    private static final SubLSymbol $sym52$INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD;
    private static final SubLList $list53;
    private static final SubLObject $const54$Person;
    private static final SubLObject $const55$IntelligentAgent;
    private static final SubLSymbol $sym56$INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 870L)
    public static SubLObject subloop_reserved_initialize_intelligent_agent_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym3$OBJECT, (SubLObject)intelligent_agent_question.$sym4$INSTANCE_COUNT, (SubLObject)intelligent_agent_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym6$LEXICON, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym7$PARSER, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym8$TAGGER, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym9$CHUNKER, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym10$MAX_CANDIDATES, (SubLObject)intelligent_agent_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym11$MAX_CONFIDENCE, (SubLObject)intelligent_agent_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym12$LEARNABLE_TYPES, (SubLObject)intelligent_agent_question.NIL);
        return (SubLObject)intelligent_agent_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 870L)
    public static SubLObject subloop_reserved_initialize_intelligent_agent_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym3$OBJECT, (SubLObject)intelligent_agent_question.$sym14$ISOLATED_P, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym3$OBJECT, (SubLObject)intelligent_agent_question.$sym15$INSTANCE_NUMBER, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym16$INFORMATION_REQUEST, (SubLObject)intelligent_agent_question.$sym17$ERROR_HANDLING, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym16$INFORMATION_REQUEST, (SubLObject)intelligent_agent_question.$sym18$TIMEOUT, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym19$STRING, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym20$PARSE, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym21$ANSWER_TYPES, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)intelligent_agent_question.$sym5$QUESTION, (SubLObject)intelligent_agent_question.$sym22$CORPORA, (SubLObject)intelligent_agent_question.NIL);
        return (SubLObject)intelligent_agent_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 870L)
    public static SubLObject intelligent_agent_question_p(final SubLObject v_intelligent_agent_question) {
        return classes.subloop_instanceof_class(v_intelligent_agent_question, (SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 1166L)
    public static SubLObject intelligent_agent_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(intelligent_agent_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)intelligent_agent_question.$sym28$GET_DAUGHTER, (SubLObject)intelligent_agent_question.ZERO_INTEGER)) && intelligent_agent_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)intelligent_agent_question.$sym28$GET_DAUGHTER, (SubLObject)intelligent_agent_question.ZERO_INTEGER), (SubLObject)intelligent_agent_question.$sym29$GET_STRING), (SubLObject)intelligent_agent_question.$list30, (SubLObject)intelligent_agent_question.UNPROVIDED) && (intelligent_agent_question.NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, (SubLObject)intelligent_agent_question.$sym31$GET_PREDICATE)) || (intelligent_agent_question.NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, (SubLObject)intelligent_agent_question.$sym31$GET_PREDICATE)) && intelligent_agent_question.NIL != methods.funcall_instance_method_with_0_args(tree, (SubLObject)intelligent_agent_question.$sym32$GET_SUBJECT) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)intelligent_agent_question.$sym32$GET_SUBJECT), (SubLObject)intelligent_agent_question.$sym33$GET_HEAD), (SubLObject)intelligent_agent_question.$sym34$GET_CATEGORY) == intelligent_agent_question.$kw35$NN || intelligent_agent_question.NIL != string_utilities.starts_with(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, (SubLObject)intelligent_agent_question.$sym32$GET_SUBJECT), (SubLObject)intelligent_agent_question.$sym29$GET_STRING), (SubLObject)intelligent_agent_question.$str36$the)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 1722L)
    public static SubLObject intelligent_agent_question_querify_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list(search_engine.new_lemur_query(methods.funcall_instance_method_with_0_args(self, (SubLObject)intelligent_agent_question.$sym29$GET_STRING), (SubLObject)intelligent_agent_question.UNPROVIDED, (SubLObject)intelligent_agent_question.UNPROVIDED, (SubLObject)intelligent_agent_question.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 1952L)
    public static SubLObject intelligent_agent_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_intelligent_agent_question_method = (SubLObject)intelligent_agent_question.NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(intelligent_agent_question.$sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)intelligent_agent_question.$sym45$LEARN, methods.funcall_instance_method_with_0_args(passage, (SubLObject)intelligent_agent_question.$sym46$GET_CONTENT));
                final SubLObject pparse = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)intelligent_agent_question.$sym20$PARSE, passage_sentence(methods.funcall_instance_method_with_0_args(passage, (SubLObject)intelligent_agent_question.$sym46$GET_CONTENT)));
                final SubLObject lexified = (SubLObject)((intelligent_agent_question.NIL != pparse) ? methods.funcall_instance_method_with_1_args(pparse, (SubLObject)intelligent_agent_question.$sym47$LEXIFY, lexicon) : intelligent_agent_question.NIL);
                final SubLObject predicate = methods.funcall_instance_method_with_0_args(parse, (SubLObject)intelligent_agent_question.$sym31$GET_PREDICATE);
                SubLObject candidate = (SubLObject)intelligent_agent_question.NIL;
                SubLObject subject = (SubLObject)intelligent_agent_question.NIL;
                SubLObject v_object = (SubLObject)intelligent_agent_question.NIL;
                SubLObject answers = (SubLObject)intelligent_agent_question.NIL;
                if (intelligent_agent_question.NIL != lexified && intelligent_agent_question.NIL != predicate) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(lexified, (SubLObject)intelligent_agent_question.$sym51$YIELD);
                    SubLObject word = (SubLObject)intelligent_agent_question.NIL;
                    word = cdolist_list_var.first();
                    while (intelligent_agent_question.NIL != cdolist_list_var) {
                        if (intelligent_agent_question.NIL != parse_tree.verbal_tree_p(word) && intelligent_agent_question.NIL != question.word_implies(word, predicate)) {
                            if (intelligent_agent_question.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)intelligent_agent_question.$sym48$SUBJECT_QUESTION_P)) {
                                v_object = methods.funcall_instance_method_with_0_args(word, (SubLObject)intelligent_agent_question.$sym49$GET_SEMANTIC_OBJECTS).first();
                                v_object = (SubLObject)((intelligent_agent_question.NIL != v_object) ? methods.funcall_instance_method_with_0_args(v_object, (SubLObject)intelligent_agent_question.$sym33$GET_HEAD) : intelligent_agent_question.NIL);
                                if (intelligent_agent_question.NIL != v_object && intelligent_agent_question.NIL != question.word_implies(v_object, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(predicate, (SubLObject)intelligent_agent_question.$sym49$GET_SEMANTIC_OBJECTS).first(), (SubLObject)intelligent_agent_question.$sym33$GET_HEAD))) {
                                    candidate = methods.funcall_instance_method_with_0_args(word, (SubLObject)intelligent_agent_question.$sym50$GET_SEMANTIC_SUBJECT);
                                }
                            }
                            else {
                                subject = methods.funcall_instance_method_with_0_args(word, (SubLObject)intelligent_agent_question.$sym50$GET_SEMANTIC_SUBJECT);
                                subject = (SubLObject)((intelligent_agent_question.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)intelligent_agent_question.$sym33$GET_HEAD) : intelligent_agent_question.NIL);
                                if (intelligent_agent_question.NIL != subject && intelligent_agent_question.NIL != question.word_implies(subject, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(predicate, (SubLObject)intelligent_agent_question.$sym50$GET_SEMANTIC_SUBJECT), (SubLObject)intelligent_agent_question.$sym33$GET_HEAD))) {
                                    candidate = methods.funcall_instance_method_with_0_args(word, (SubLObject)intelligent_agent_question.$sym49$GET_SEMANTIC_OBJECTS).first();
                                }
                            }
                            if (intelligent_agent_question.NIL != candidate) {
                                answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, (SubLObject)intelligent_agent_question.$sym29$GET_STRING), passage, Numbers.multiply(new SubLObject[] { max_confidence }), (SubLObject)intelligent_agent_question.UNPROVIDED), answers);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        word = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)intelligent_agent_question.$sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)intelligent_agent_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    question.set_question_parser(self, v_parser);
                    question.set_question_lexicon(self, lexicon);
                    question.set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_intelligent_agent_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)intelligent_agent_question.$sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_intelligent_agent_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 3418L)
    public static SubLObject intelligent_agent_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(intelligent_agent_question.$const54$Person, intelligent_agent_question.$const55$IntelligentAgent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/intelligent-agent-question.lisp", position = 3697L)
    public static SubLObject passage_sentence(final SubLObject passage) {
        return passage;
    }
    
    public static SubLObject declare_intelligent_agent_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "subloop_reserved_initialize_intelligent_agent_question_class", "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "subloop_reserved_initialize_intelligent_agent_question_instance", "SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "intelligent_agent_question_p", "INTELLIGENT-AGENT-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "intelligent_agent_question_isaP_method", "INTELLIGENT-AGENT-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "intelligent_agent_question_querify_method", "INTELLIGENT-AGENT-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "intelligent_agent_question_extract_method", "INTELLIGENT-AGENT-QUESTION-EXTRACT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "intelligent_agent_question_answer_types_method", "INTELLIGENT-AGENT-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.intelligent_agent_question", "passage_sentence", "PASSAGE-SENTENCE", 1, 0, false);
        return (SubLObject)intelligent_agent_question.NIL;
    }
    
    public static SubLObject init_intelligent_agent_question_file() {
        return (SubLObject)intelligent_agent_question.NIL;
    }
    
    public static SubLObject setup_intelligent_agent_question_file() {
        classes.subloop_new_class((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym1$WH_QUESTION, (SubLObject)intelligent_agent_question.NIL, (SubLObject)intelligent_agent_question.NIL, (SubLObject)intelligent_agent_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym23$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE);
        subloop_reserved_initialize_intelligent_agent_question_class((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)intelligent_agent_question.$sym24$ISA_, (SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$list25, (SubLObject)intelligent_agent_question.$list26, (SubLObject)intelligent_agent_question.$list27);
        methods.subloop_register_class_method((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym24$ISA_, (SubLObject)intelligent_agent_question.$sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)intelligent_agent_question.$sym38$QUERIFY, (SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$list25, (SubLObject)intelligent_agent_question.NIL, (SubLObject)intelligent_agent_question.$list39);
        methods.subloop_register_instance_method((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym38$QUERIFY, (SubLObject)intelligent_agent_question.$sym40$INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)intelligent_agent_question.$sym41$EXTRACT, (SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$list25, (SubLObject)intelligent_agent_question.$list42, (SubLObject)intelligent_agent_question.$list43);
        methods.subloop_register_instance_method((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym41$EXTRACT, (SubLObject)intelligent_agent_question.$sym52$INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)intelligent_agent_question.$sym21$ANSWER_TYPES, (SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$list25, (SubLObject)intelligent_agent_question.NIL, (SubLObject)intelligent_agent_question.$list53);
        methods.subloop_register_instance_method((SubLObject)intelligent_agent_question.$sym0$INTELLIGENT_AGENT_QUESTION, (SubLObject)intelligent_agent_question.$sym21$ANSWER_TYPES, (SubLObject)intelligent_agent_question.$sym56$INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD);
        return (SubLObject)intelligent_agent_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_intelligent_agent_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_intelligent_agent_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_intelligent_agent_question_file();
    }
    
    static {
        me = (SubLFile)new intelligent_agent_question();
        $sym0$INTELLIGENT_AGENT_QUESTION = SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)intelligent_agent_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)intelligent_agent_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)intelligent_agent_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_INTELLIGENT_AGENT_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTELLIGENT-AGENT-QUESTION-INSTANCE");
        $sym24$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)intelligent_agent_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)intelligent_agent_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("who"), (SubLObject)SubLObjectFactory.makeString("whose"), (SubLObject)SubLObjectFactory.makeString("whom")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)intelligent_agent_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword("NN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("the"))))))));
        $sym28$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("who"), (SubLObject)SubLObjectFactory.makeString("whose"), (SubLObject)SubLObjectFactory.makeString("whom"));
        $sym31$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $sym32$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $sym33$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym34$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw35$NN = SubLObjectFactory.makeKeyword("NN");
        $str36$the = SubLObjectFactory.makeString("the");
        $sym37$INTELLIGENT_AGENT_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION-ISA?-METHOD");
        $sym38$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))))));
        $sym40$INTELLIGENT_AGENT_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION-QUERIFY-METHOD");
        $sym41$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE-SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PPARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PPARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE")))), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)intelligent_agent_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-IMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT-QUESTION-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-IMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-IMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-CONFIDENCE"))), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym44$OUTER_CATCH_FOR_INTELLIGENT_AGENT_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-INTELLIGENT-AGENT-QUESTION-METHOD");
        $sym45$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym46$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym47$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym48$SUBJECT_QUESTION_P = SubLObjectFactory.makeSymbol("SUBJECT-QUESTION-P");
        $sym49$GET_SEMANTIC_OBJECTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS");
        $sym50$GET_SEMANTIC_SUBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT");
        $sym51$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym52$INTELLIGENT_AGENT_QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION-EXTRACT-METHOD");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligentAgent"))))));
        $const54$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $const55$IntelligentAgent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntelligentAgent"));
        $sym56$INTELLIGENT_AGENT_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("INTELLIGENT-AGENT-QUESTION-ANSWER-TYPES-METHOD");
    }
}

/*

	Total time: 168 ms
	
*/