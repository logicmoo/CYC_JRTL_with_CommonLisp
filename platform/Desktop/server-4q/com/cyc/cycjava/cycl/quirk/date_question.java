package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
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

public final class date_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.date_question";
    public static final String myFingerPrint = "0d738612c347cd21abf411d4673556065837196c4d1f06766a76ee7e8904cd67";
    private static final SubLSymbol $sym0$DATE_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE;
    private static final SubLSymbol $sym24$ISA_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GET_DAUGHTER;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLString $str31$on_what_date;
    private static final SubLSymbol $sym32$DATE_QUESTION_ISA__METHOD;
    private static final SubLList $list33;
    private static final SubLObject $const34$Date;
    private static final SubLObject $const35$Time_Quantity;
    private static final SubLSymbol $sym36$DATE_QUESTION_ANSWER_TYPES_METHOD;
    private static final SubLSymbol $sym37$ANSWER_CARDINALITY;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$DATE_QUESTION_ANSWER_CARDINALITY_METHOD;
    private static final SubLSymbol $sym40$QUERIFY;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD;
    private static final SubLString $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM;
    private static final SubLSymbol $sym44$GET_KEYSTRINGS;
    private static final SubLString $str45$_;
    private static final SubLSymbol $sym46$DATE_QUESTION_QUERIFY_METHOD;
    private static final SubLSymbol $sym47$EXTRACT;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD;
    private static final SubLSymbol $sym51$LEARN;
    private static final SubLSymbol $sym52$GET_CONTENT;
    private static final SubLSymbol $sym53$LEXIFY;
    private static final SubLSymbol $sym54$GET_SEMANTIC_SUBJECT;
    private static final SubLSymbol $sym55$GET_SEMANTIC_OBJECTS;
    private static final SubLSymbol $sym56$GET_PREDICATE;
    private static final SubLSymbol $sym57$GET_HEAD;
    private static final SubLSymbol $sym58$CANDIDATE_ANSWER_P;
    private static final SubLSymbol $sym59$YIELD;
    private static final SubLSymbol $sym60$GET_MODIFIERS;
    private static final SubLSymbol $sym61$DATE_QUESTION_EXTRACT_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 852L)
    public static SubLObject subloop_reserved_initialize_date_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym3$OBJECT, (SubLObject)date_question.$sym4$INSTANCE_COUNT, (SubLObject)date_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym6$LEXICON, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym7$PARSER, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym8$TAGGER, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym9$CHUNKER, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym10$MAX_CANDIDATES, (SubLObject)date_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym11$MAX_CONFIDENCE, (SubLObject)date_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym12$LEARNABLE_TYPES, (SubLObject)date_question.NIL);
        return (SubLObject)date_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 852L)
    public static SubLObject subloop_reserved_initialize_date_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym3$OBJECT, (SubLObject)date_question.$sym14$ISOLATED_P, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym3$OBJECT, (SubLObject)date_question.$sym15$INSTANCE_NUMBER, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym16$INFORMATION_REQUEST, (SubLObject)date_question.$sym17$ERROR_HANDLING, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym16$INFORMATION_REQUEST, (SubLObject)date_question.$sym18$TIMEOUT, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym19$STRING, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym20$PARSE, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym21$ANSWER_TYPES, (SubLObject)date_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)date_question.$sym5$QUESTION, (SubLObject)date_question.$sym22$CORPORA, (SubLObject)date_question.NIL);
        return (SubLObject)date_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 852L)
    public static SubLObject date_question_p(final SubLObject v_date_question) {
        return classes.subloop_instanceof_class(v_date_question, (SubLObject)date_question.$sym0$DATE_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1160L)
    public static SubLObject date_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean((date_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)date_question.$sym28$GET_DAUGHTER, (SubLObject)date_question.ZERO_INTEGER)) && date_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)date_question.$sym28$GET_DAUGHTER, (SubLObject)date_question.ZERO_INTEGER), (SubLObject)date_question.$sym29$GET_STRING), (SubLObject)date_question.$list30, (SubLObject)date_question.UNPROVIDED)) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)date_question.$sym28$GET_DAUGHTER, (SubLObject)date_question.ZERO_INTEGER), (SubLObject)date_question.$sym29$GET_STRING).equalp((SubLObject)date_question.$str31$on_what_date));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1532L)
    public static SubLObject date_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(date_question.$const34$Date), (SubLObject)ConsesLow.list(date_question.$const35$Time_Quantity));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1715L)
    public static SubLObject date_question_answer_cardinality_method(final SubLObject self) {
        return (SubLObject)date_question.TEN_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 1879L)
    public static SubLObject date_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_date_question_method = (SubLObject)date_question.NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push(date_question.$sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
            try {
                SubLObject queries = (SubLObject)date_question.NIL;
                SubLObject cdolist_list_var = corpora;
                SubLObject corpus = (SubLObject)date_question.NIL;
                corpus = cdolist_list_var.first();
                while (date_question.NIL != cdolist_list_var) {
                    queries = (SubLObject)ConsesLow.cons(search_engine.new_guruqa_query(Sequences.cconcatenate((SubLObject)date_question.$str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM, new SubLObject[] { string_utilities.bunge(methods.funcall_instance_method_with_0_args(self, (SubLObject)date_question.$sym44$GET_KEYSTRINGS), (SubLObject)date_question.UNPROVIDED), date_question.$str45$_ }), corpus), queries);
                    cdolist_list_var = cdolist_list_var.rest();
                    corpus = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)date_question.$sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, queries);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)date_question.T, thread);
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
            catch_var_for_date_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)date_question.$sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_date_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/date-question.lisp", position = 2287L)
    public static SubLObject date_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_date_question_method = (SubLObject)date_question.NIL;
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(date_question.$sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)date_question.$sym51$LEARN, methods.funcall_instance_method_with_0_args(passage, (SubLObject)date_question.$sym52$GET_CONTENT));
                final SubLObject pparse = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)date_question.$sym20$PARSE, methods.funcall_instance_method_with_0_args(passage, (SubLObject)date_question.$sym52$GET_CONTENT));
                final SubLObject lexified = (SubLObject)((date_question.NIL != pparse) ? methods.funcall_instance_method_with_1_args(pparse, (SubLObject)date_question.$sym53$LEXIFY, lexicon) : date_question.NIL);
                final SubLObject qsubject = methods.funcall_instance_method_with_0_args(parse, (SubLObject)date_question.$sym54$GET_SEMANTIC_SUBJECT);
                final SubLObject qobject = methods.funcall_instance_method_with_0_args(parse, (SubLObject)date_question.$sym55$GET_SEMANTIC_OBJECTS).first();
                final SubLObject qpredicate = methods.funcall_instance_method_with_0_args(parse, (SubLObject)date_question.$sym56$GET_PREDICATE);
                SubLObject answers = (SubLObject)date_question.NIL;
                if (date_question.NIL != lexified && date_question.NIL != qpredicate) {
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(lexified, (SubLObject)date_question.$sym59$YIELD);
                    SubLObject word = (SubLObject)date_question.NIL;
                    word = cdolist_list_var.first();
                    while (date_question.NIL != cdolist_list_var) {
                        if (date_question.NIL != parse_tree.verbal_tree_p(word) && date_question.NIL != question.word_implies(word, qpredicate) && ((date_question.NIL != qsubject && date_question.NIL != word_tree.word_tree_p(methods.funcall_instance_method_with_0_args(word, (SubLObject)date_question.$sym54$GET_SEMANTIC_SUBJECT)) && date_question.NIL != question.word_implies(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, (SubLObject)date_question.$sym54$GET_SEMANTIC_SUBJECT), (SubLObject)date_question.$sym57$GET_HEAD), methods.funcall_instance_method_with_0_args(qsubject, (SubLObject)date_question.$sym57$GET_HEAD))) || date_question.NIL == qsubject) && ((date_question.NIL != qobject && date_question.NIL != word_tree.word_tree_p(methods.funcall_instance_method_with_0_args(word, (SubLObject)date_question.$sym55$GET_SEMANTIC_OBJECTS).first()) && date_question.NIL != question.word_implies(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(word, (SubLObject)date_question.$sym55$GET_SEMANTIC_OBJECTS).first(), (SubLObject)date_question.$sym57$GET_HEAD), methods.funcall_instance_method_with_0_args(qobject, (SubLObject)date_question.$sym57$GET_HEAD))) || date_question.NIL == qobject)) {
                            SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(word, (SubLObject)date_question.$sym60$GET_MODIFIERS);
                            SubLObject mod = (SubLObject)date_question.NIL;
                            mod = cdolist_list_var_$1.first();
                            while (date_question.NIL != cdolist_list_var_$1) {
                                SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(mod, (SubLObject)date_question.$sym59$YIELD);
                                SubLObject candidate = (SubLObject)date_question.NIL;
                                candidate = cdolist_list_var_$2.first();
                                while (date_question.NIL != cdolist_list_var_$2) {
                                    if (date_question.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)date_question.$sym58$CANDIDATE_ANSWER_P, candidate)) {
                                        answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, (SubLObject)date_question.$sym29$GET_STRING), passage, (SubLObject)date_question.TEN_INTEGER, (SubLObject)date_question.UNPROVIDED), answers);
                                    }
                                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                    candidate = cdolist_list_var_$2.first();
                                }
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                mod = cdolist_list_var_$1.first();
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        word = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)date_question.$sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)date_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
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
            catch_var_for_date_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)date_question.$sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_date_question_method;
    }
    
    public static SubLObject declare_date_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "subloop_reserved_initialize_date_question_class", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "subloop_reserved_initialize_date_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "date_question_p", "DATE-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "date_question_isaP_method", "DATE-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "date_question_answer_types_method", "DATE-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "date_question_answer_cardinality_method", "DATE-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "date_question_querify_method", "DATE-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.date_question", "date_question_extract_method", "DATE-QUESTION-EXTRACT-METHOD", 2, 0, false);
        return (SubLObject)date_question.NIL;
    }
    
    public static SubLObject init_date_question_file() {
        return (SubLObject)date_question.NIL;
    }
    
    public static SubLObject setup_date_question_file() {
        classes.subloop_new_class((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym1$WH_QUESTION, (SubLObject)date_question.NIL, (SubLObject)date_question.NIL, (SubLObject)date_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym23$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE);
        subloop_reserved_initialize_date_question_class((SubLObject)date_question.$sym0$DATE_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)date_question.$sym24$ISA_, (SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$list25, (SubLObject)date_question.$list26, (SubLObject)date_question.$list27);
        methods.subloop_register_class_method((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym24$ISA_, (SubLObject)date_question.$sym32$DATE_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)date_question.$sym21$ANSWER_TYPES, (SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$list25, (SubLObject)date_question.NIL, (SubLObject)date_question.$list33);
        methods.subloop_register_instance_method((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym21$ANSWER_TYPES, (SubLObject)date_question.$sym36$DATE_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)date_question.$sym37$ANSWER_CARDINALITY, (SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$list25, (SubLObject)date_question.NIL, (SubLObject)date_question.$list38);
        methods.subloop_register_instance_method((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym37$ANSWER_CARDINALITY, (SubLObject)date_question.$sym39$DATE_QUESTION_ANSWER_CARDINALITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)date_question.$sym40$QUERIFY, (SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$list25, (SubLObject)date_question.NIL, (SubLObject)date_question.$list41);
        methods.subloop_register_instance_method((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym40$QUERIFY, (SubLObject)date_question.$sym46$DATE_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)date_question.$sym47$EXTRACT, (SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$list25, (SubLObject)date_question.$list48, (SubLObject)date_question.$list49);
        methods.subloop_register_instance_method((SubLObject)date_question.$sym0$DATE_QUESTION, (SubLObject)date_question.$sym47$EXTRACT, (SubLObject)date_question.$sym61$DATE_QUESTION_EXTRACT_METHOD);
        return (SubLObject)date_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_date_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_date_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_date_question_file();
    }
    
    static {
        me = (SubLFile)new date_question();
        $sym0$DATE_QUESTION = SubLObjectFactory.makeSymbol("DATE-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY"), (SubLObject)date_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)date_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_DATE_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DATE-QUESTION-INSTANCE");
        $sym24$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return boolean; t if TREE is a date question, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)date_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)date_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("when"))))), (SubLObject)ConsesLow.list((SubLObject)date_question.EQUALP, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)date_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeString("on what date")))));
        $sym28$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("when"));
        $str31$on_what_date = SubLObjectFactory.makeString("on what date");
        $sym32$DATE_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("DATE-QUESTION-ISA?-METHOD");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the list of expected answers of this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Time-Quantity"))))));
        $const34$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $const35$Time_Quantity = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Time-Quantity"));
        $sym36$DATE_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("DATE-QUESTION-ANSWER-TYPES-METHOD");
        $sym37$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the number of answers expected for this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)date_question.TEN_INTEGER));
        $sym39$DATE_QUESTION_ANSWER_CARDINALITY_METHOD = SubLObjectFactory.makeSymbol("DATE-QUESTION-ANSWER-CARDINALITY-METHOD");
        $sym40$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)date_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GURUQA-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYSTRINGS")))), (SubLObject)SubLObjectFactory.makeString(")")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES"))));
        $sym42$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DATE-QUESTION-METHOD");
        $str43$_WIN_1__SYN_YEAR__TIMEOFYEAR__TIM = SubLObjectFactory.makeString("@WIN(1 @SYN(YEAR$ TIMEOFYEAR$ TIME$ DATE$) ");
        $sym44$GET_KEYSTRINGS = SubLObjectFactory.makeSymbol("GET-KEYSTRINGS");
        $str45$_ = SubLObjectFactory.makeString(")");
        $sym46$DATE_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("DATE-QUESTION-QUERIFY-METHOD");
        $sym47$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("PPARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PPARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QSUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QOBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QPREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)date_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("QPREDICATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VERBAL-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-IMPLIES"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)SubLObjectFactory.makeSymbol("QPREDICATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("QSUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-IMPLIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QSUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("QSUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("QOBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-IMPLIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("QOBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("QOBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-MODIFIERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("MOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P")), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)date_question.TEN_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym50$OUTER_CATCH_FOR_DATE_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-DATE-QUESTION-METHOD");
        $sym51$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym52$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym53$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $sym54$GET_SEMANTIC_SUBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT");
        $sym55$GET_SEMANTIC_OBJECTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS");
        $sym56$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $sym57$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym58$CANDIDATE_ANSWER_P = SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P");
        $sym59$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $sym60$GET_MODIFIERS = SubLObjectFactory.makeSymbol("GET-MODIFIERS");
        $sym61$DATE_QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("DATE-QUESTION-EXTRACT-METHOD");
    }
}

/*

	Total time: 128 ms
	
*/