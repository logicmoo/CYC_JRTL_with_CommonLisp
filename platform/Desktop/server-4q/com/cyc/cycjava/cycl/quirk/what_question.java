package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class what_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.what_question";
    public static final String myFingerPrint = "110890ec5523e37b52f43578a3d4df209091799a4adb73f29c80d7ded654cda0";
    private static final SubLSymbol $sym0$WHAT_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE;
    private static final SubLSymbol $sym24$ISA_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GET_DAUGHTER;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$GET_SUBJECT;
    private static final SubLSymbol $sym32$GET_PREDICATE;
    private static final SubLSymbol $sym33$WHAT_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym34$REQUIRE_PERCENTAGE;
    private static final SubLList $list35;
    private static final SubLInteger $int36$100;
    private static final SubLSymbol $sym37$WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD;
    private static final SubLSymbol $sym38$QUERIFY;
    private static final SubLList $list39;
    private static final SubLSymbol $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
    private static final SubLSymbol $sym41$GET_FOCUS;
    private static final SubLSymbol $sym42$WORD_TREE_GET_STRING_METHOD;
    private static final SubLSymbol $sym43$GET_KEYWORDS;
    private static final SubLSymbol $sym44$YIELD;
    private static final SubLString $str45$_;
    private static final SubLString $str46$_SEN__SYN_;
    private static final SubLString $str47$__;
    private static final SubLString $str48$_;
    private static final SubLSymbol $sym49$WHAT_QUESTION_QUERIFY_METHOD;
    private static final SubLSymbol $sym50$EXTRACT;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
    private static final SubLSymbol $sym54$LEARN;
    private static final SubLSymbol $sym55$GET_CONTENT;
    private static final SubLSymbol $sym56$LEXIFY_SENTENCE;
    private static final SubLSymbol $sym57$SENTENCE2WORD_TREES;
    private static final SubLSymbol $sym58$TREE_TYPE_MATCH;
    private static final SubLSymbol $sym59$WHAT_QUESTION_EXTRACT_METHOD;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
    private static final SubLSymbol $sym62$SUBJECT_QUESTION_P;
    private static final SubLSymbol $sym63$GET_OBJECTS;
    private static final SubLSymbol $sym64$WHAT_QUESTION_GET_FOCUS_METHOD;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD;
    private static final SubLSymbol $sym67$GET_HEAD;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$GET;
    private static final SubLSymbol $kw70$PENN_TAGS;
    private static final SubLSymbol $kw71$DENOT;
    private static final SubLSymbol $sym72$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const73$EverythingPSC;
    private static final SubLSymbol $sym74$WHAT_QUESTION_ANSWER_TYPES_METHOD;
    private static final SubLSymbol $sym75$ANSWER_CARDINALITY;
    private static final SubLList $list76;
    private static final SubLInteger $int77$25;
    private static final SubLSymbol $sym78$WHAT_QUESTION_ANSWER_CARDINALITY_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 843L)
    public static SubLObject subloop_reserved_initialize_what_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym3$OBJECT, (SubLObject)what_question.$sym4$INSTANCE_COUNT, (SubLObject)what_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym6$LEXICON, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym7$PARSER, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym8$TAGGER, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym9$CHUNKER, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym10$MAX_CANDIDATES, (SubLObject)what_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym11$MAX_CONFIDENCE, (SubLObject)what_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym12$LEARNABLE_TYPES, (SubLObject)what_question.NIL);
        return (SubLObject)what_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 843L)
    public static SubLObject subloop_reserved_initialize_what_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym3$OBJECT, (SubLObject)what_question.$sym14$ISOLATED_P, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym3$OBJECT, (SubLObject)what_question.$sym15$INSTANCE_NUMBER, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym16$INFORMATION_REQUEST, (SubLObject)what_question.$sym17$ERROR_HANDLING, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym16$INFORMATION_REQUEST, (SubLObject)what_question.$sym18$TIMEOUT, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym19$STRING, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym20$PARSE, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym21$ANSWER_TYPES, (SubLObject)what_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)what_question.$sym5$QUESTION, (SubLObject)what_question.$sym22$CORPORA, (SubLObject)what_question.NIL);
        return (SubLObject)what_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 843L)
    public static SubLObject what_question_p(final SubLObject v_what_question) {
        return classes.subloop_instanceof_class(v_what_question, (SubLObject)what_question.$sym0$WHAT_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 1293L)
    public static SubLObject what_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(what_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)what_question.$sym28$GET_DAUGHTER, (SubLObject)what_question.ZERO_INTEGER)) && what_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)what_question.$sym28$GET_DAUGHTER, (SubLObject)what_question.ZERO_INTEGER), (SubLObject)what_question.$sym29$GET_STRING), (SubLObject)what_question.$list30, (SubLObject)what_question.EQUALP) && what_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)what_question.$sym28$GET_DAUGHTER, (SubLObject)what_question.ONE_INTEGER), (SubLObject)what_question.$sym31$GET_SUBJECT) && what_question.NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)what_question.$sym28$GET_DAUGHTER, (SubLObject)what_question.ONE_INTEGER), (SubLObject)what_question.$sym32$GET_PREDICATE)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 1664L)
    public static SubLObject what_question_require_percentage_method(final SubLObject self) {
        return (SubLObject)what_question.$int36$100;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 1876L)
    public static SubLObject what_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = (SubLObject)what_question.NIL;
        final SubLObject answer_types = question.get_question_answer_types(self);
        try {
            thread.throwStack.push(what_question.$sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                final SubLObject focus = methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym41$GET_FOCUS);
                if (what_question.NIL != focus) {
                    final SubLObject search_terms = Mapping.mapcar((SubLObject)what_question.$sym42$WORD_TREE_GET_STRING_METHOD, conses_high.set_difference(methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym43$GET_KEYWORDS), methods.funcall_instance_method_with_0_args(focus, (SubLObject)what_question.$sym44$YIELD), (SubLObject)what_question.UNPROVIDED, (SubLObject)what_question.UNPROVIDED));
                    SubLObject search_type = (SubLObject)what_question.NIL;
                    SubLObject search_types = (SubLObject)what_question.NIL;
                    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym21$ANSWER_TYPES);
                    SubLObject path = (SubLObject)what_question.NIL;
                    path = cdolist_list_var.first();
                    while (what_question.NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$1 = path;
                        SubLObject type = (SubLObject)what_question.NIL;
                        type = cdolist_list_var_$1.first();
                        while (what_question.NIL != cdolist_list_var_$1) {
                            search_type = question.cyc_to_resporator(type);
                            if (what_question.NIL != search_type) {
                                search_types = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(print_high.princ_to_string(search_type), (SubLObject)what_question.$str45$_), search_types);
                            }
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            type = cdolist_list_var_$1.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        path = cdolist_list_var.first();
                    }
                    if (what_question.NIL != search_types) {
                        Dynamic.sublisp_throw((SubLObject)what_question.$sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, (SubLObject)ConsesLow.list(search_engine.new_guruqa_query(Sequences.cconcatenate((SubLObject)what_question.$str46$_SEN__SYN_, new SubLObject[] { string_utilities.bunge(search_types, (SubLObject)what_question.UNPROVIDED), what_question.$str47$__, string_utilities.bunge(search_terms, (SubLObject)what_question.UNPROVIDED), what_question.$str48$_ }), (SubLObject)what_question.UNPROVIDED)));
                    }
                    else {
                        Dynamic.sublisp_throw((SubLObject)what_question.$sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, (SubLObject)ConsesLow.list(search_engine.new_lemur_query(methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym29$GET_STRING), (SubLObject)what_question.UNPROVIDED, (SubLObject)what_question.UNPROVIDED, (SubLObject)what_question.UNPROVIDED)));
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)what_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_answer_types(self, answer_types);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)what_question.$sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 2863L)
    public static SubLObject what_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = (SubLObject)what_question.NIL;
        final SubLObject tagger = question.get_question_tagger(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        try {
            thread.throwStack.push(what_question.$sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)what_question.$sym54$LEARN, methods.funcall_instance_method_with_0_args(passage, (SubLObject)what_question.$sym55$GET_CONTENT));
                final SubLObject sentence = question.sentencify(methods.funcall_instance_method_with_0_args(passage, (SubLObject)what_question.$sym55$GET_CONTENT));
                final SubLObject tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
                final SubLObject lexified = (SubLObject)((what_question.NIL != sentence) ? methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)what_question.$sym56$LEXIFY_SENTENCE, tagged) : what_question.NIL);
                final SubLObject yield = methods.funcall_class_method_with_1_args((SubLObject)what_question.$sym1$WH_QUESTION, (SubLObject)what_question.$sym57$SENTENCE2WORD_TREES, lexified);
                final SubLObject keywords = conses_high.set_difference(methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym43$GET_KEYWORDS), methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym41$GET_FOCUS), (SubLObject)what_question.$sym44$YIELD), (SubLObject)what_question.UNPROVIDED, (SubLObject)what_question.UNPROVIDED);
                SubLObject answers = (SubLObject)what_question.NIL;
                SubLObject i = (SubLObject)what_question.NIL;
                if (what_question.NIL != lexified) {
                    thread.resetMultipleValues();
                    final SubLObject before = question.split_yield(yield, keywords);
                    final SubLObject after = thread.secondMultipleValue();
                    final SubLObject deviation = thread.thirdMultipleValue();
                    final SubLObject found = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (what_question.NIL != deviation && deviation.numL((SubLObject)what_question.EIGHT_INTEGER) && Sequences.length(keywords).numE(found)) {
                        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(before, after);
                        SubLObject candidates = (SubLObject)what_question.NIL;
                        candidates = cdolist_list_var.first();
                        while (what_question.NIL != cdolist_list_var) {
                            i = (SubLObject)what_question.ZERO_INTEGER;
                            SubLObject cdolist_list_var_$2 = candidates;
                            SubLObject candidate = (SubLObject)what_question.NIL;
                            candidate = cdolist_list_var_$2.first();
                            while (what_question.NIL != cdolist_list_var_$2) {
                                i = Numbers.add(i, (SubLObject)what_question.ONE_INTEGER);
                                final SubLObject score = methods.funcall_instance_method_with_1_args(self, (SubLObject)what_question.$sym58$TREE_TYPE_MATCH, candidate);
                                if (score.isPositive()) {
                                    answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, (SubLObject)what_question.$sym29$GET_STRING), passage, Numbers.multiply(score, Numbers.divide((SubLObject)what_question.ONE_INTEGER, (SubLObject)(i.numL((SubLObject)what_question.FOUR_INTEGER) ? what_question.ONE_INTEGER : i))), (SubLObject)what_question.UNPROVIDED), answers);
                                }
                                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                                candidate = cdolist_list_var_$2.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            candidates = cdolist_list_var.first();
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)what_question.$sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)what_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_tagger(self, tagger);
                    question.set_question_lexicon(self, lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)what_question.$sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 4104L)
    public static SubLObject what_question_get_focus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = (SubLObject)what_question.NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(what_question.$sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)what_question.$sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, (what_question.NIL != methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym62$SUBJECT_QUESTION_P)) ? methods.funcall_instance_method_with_0_args(parse, (SubLObject)what_question.$sym31$GET_SUBJECT) : methods.funcall_instance_method_with_0_args(parse, (SubLObject)what_question.$sym63$GET_OBJECTS).first());
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)what_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)what_question.$sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 4339L)
    public static SubLObject what_question_answer_types_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_what_question_method = (SubLObject)what_question.NIL;
        final SubLObject lexicon = question.get_question_lexicon(self);
        try {
            thread.throwStack.push(what_question.$sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
            try {
                final SubLObject focus = methods.funcall_instance_method_with_0_args(self, (SubLObject)what_question.$sym41$GET_FOCUS);
                final SubLObject head = (SubLObject)((what_question.NIL != focus) ? methods.funcall_instance_method_with_0_args(focus, (SubLObject)what_question.$sym67$GET_HEAD) : what_question.NIL);
                final SubLObject focus_string = (SubLObject)((what_question.NIL != head) ? methods.funcall_instance_method_with_0_args(head, (SubLObject)what_question.$sym29$GET_STRING) : what_question.NIL);
                SubLObject lextypes = (SubLObject)what_question.NIL;
                SubLObject mytypes = (SubLObject)what_question.NIL;
                if (what_question.NIL != focus_string) {
                    SubLObject cdolist_list_var = ConsesLow.append(methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)what_question.$sym69$GET, focus_string), methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)what_question.$sym69$GET, Strings.string_downcase(focus_string, (SubLObject)what_question.UNPROVIDED, (SubLObject)what_question.UNPROVIDED)));
                    SubLObject lex = (SubLObject)what_question.NIL;
                    lex = cdolist_list_var.first();
                    while (what_question.NIL != cdolist_list_var) {
                        if (what_question.NIL != conses_high.intersection((SubLObject)what_question.$list68, methods.funcall_instance_method_with_1_args(lex, (SubLObject)what_question.$sym69$GET, (SubLObject)what_question.$kw70$PENN_TAGS), (SubLObject)what_question.EQ, (SubLObject)what_question.UNPROVIDED)) {
                            final SubLObject item_var = methods.funcall_instance_method_with_1_args(lex, (SubLObject)what_question.$sym69$GET, (SubLObject)what_question.$kw71$DENOT);
                            if (what_question.NIL == conses_high.member(item_var, lextypes, Symbols.symbol_function((SubLObject)what_question.EQL), Symbols.symbol_function((SubLObject)what_question.IDENTITY))) {
                                lextypes = (SubLObject)ConsesLow.cons(item_var, lextypes);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        lex = cdolist_list_var.first();
                    }
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)what_question.$sym72$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(what_question.$const73$EverythingPSC, thread);
                        SubLObject cdolist_list_var2 = lextypes;
                        SubLObject lextype = (SubLObject)what_question.NIL;
                        lextype = cdolist_list_var2.first();
                        while (what_question.NIL != cdolist_list_var2) {
                            final SubLObject type_path = (SubLObject)ConsesLow.list(lextype);
                            mytypes = (SubLObject)ConsesLow.cons(Sequences.nreverse(type_path), mytypes);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            lextype = cdolist_list_var2.first();
                        }
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    Dynamic.sublisp_throw((SubLObject)what_question.$sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD, mytypes);
                }
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)what_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_lexicon(self, lexicon);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_what_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)what_question.$sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_what_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/what-question.lisp", position = 5438L)
    public static SubLObject what_question_answer_cardinality_method(final SubLObject self) {
        return (SubLObject)what_question.$int77$25;
    }
    
    public static SubLObject declare_what_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "subloop_reserved_initialize_what_question_class", "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "subloop_reserved_initialize_what_question_instance", "SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_p", "WHAT-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_isaP_method", "WHAT-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_require_percentage_method", "WHAT-QUESTION-REQUIRE-PERCENTAGE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_querify_method", "WHAT-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_extract_method", "WHAT-QUESTION-EXTRACT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_get_focus_method", "WHAT-QUESTION-GET-FOCUS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_answer_types_method", "WHAT-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.what_question", "what_question_answer_cardinality_method", "WHAT-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        return (SubLObject)what_question.NIL;
    }
    
    public static SubLObject init_what_question_file() {
        return (SubLObject)what_question.NIL;
    }
    
    public static SubLObject setup_what_question_file() {
        classes.subloop_new_class((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym1$WH_QUESTION, (SubLObject)what_question.NIL, (SubLObject)what_question.NIL, (SubLObject)what_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym23$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE);
        subloop_reserved_initialize_what_question_class((SubLObject)what_question.$sym0$WHAT_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)what_question.$sym24$ISA_, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.$list26, (SubLObject)what_question.$list27);
        methods.subloop_register_class_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym24$ISA_, (SubLObject)what_question.$sym33$WHAT_QUESTION_ISA__METHOD);
        methods.methods_incorporate_class_method((SubLObject)what_question.$sym34$REQUIRE_PERCENTAGE, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.NIL, (SubLObject)what_question.$list35);
        methods.subloop_register_class_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym34$REQUIRE_PERCENTAGE, (SubLObject)what_question.$sym37$WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)what_question.$sym38$QUERIFY, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.NIL, (SubLObject)what_question.$list39);
        methods.subloop_register_instance_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym38$QUERIFY, (SubLObject)what_question.$sym49$WHAT_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)what_question.$sym50$EXTRACT, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.$list51, (SubLObject)what_question.$list52);
        methods.subloop_register_instance_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym50$EXTRACT, (SubLObject)what_question.$sym59$WHAT_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)what_question.$sym41$GET_FOCUS, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.NIL, (SubLObject)what_question.$list60);
        methods.subloop_register_instance_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym41$GET_FOCUS, (SubLObject)what_question.$sym64$WHAT_QUESTION_GET_FOCUS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)what_question.$sym21$ANSWER_TYPES, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.NIL, (SubLObject)what_question.$list65);
        methods.subloop_register_instance_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym21$ANSWER_TYPES, (SubLObject)what_question.$sym74$WHAT_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)what_question.$sym75$ANSWER_CARDINALITY, (SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$list25, (SubLObject)what_question.NIL, (SubLObject)what_question.$list76);
        methods.subloop_register_instance_method((SubLObject)what_question.$sym0$WHAT_QUESTION, (SubLObject)what_question.$sym75$ANSWER_CARDINALITY, (SubLObject)what_question.$sym78$WHAT_QUESTION_ANSWER_CARDINALITY_METHOD);
        return (SubLObject)what_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_what_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_what_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_what_question_file();
    }
    
    static {
        me = (SubLFile)new what_question();
        $sym0$WHAT_QUESTION = SubLObjectFactory.makeSymbol("WHAT-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE"), (SubLObject)what_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)what_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)what_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY"), (SubLObject)what_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"), (SubLObject)what_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_WHAT_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WHAT-QUESTION-INSTANCE");
        $sym24$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)what_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)what_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("what"), (SubLObject)SubLObjectFactory.makeString("which"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)what_question.EQUALP)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)what_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)what_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE"))))))));
        $sym28$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("what"), (SubLObject)SubLObjectFactory.makeString("which"));
        $sym31$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $sym32$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $sym33$WHAT_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-ISA?-METHOD");
        $sym34$REQUIRE_PERCENTAGE = SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the percentage of total confidence weight of candidate\n   answers to be returned as actual answers"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeInteger(100)));
        $int36$100 = SubLObjectFactory.makeInteger(100);
        $sym37$WHAT_QUESTION_REQUIRE_PERCENTAGE_METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-REQUIRE-PERCENTAGE-METHOD");
        $sym38$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE-GET-STRING-METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIFFERENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD")))))), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPES"), (SubLObject)what_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PATH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-TO-RESPORATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRINC-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPE")), (SubLObject)SubLObjectFactory.makeString("$")), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GURUQA-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("@SEN(@SYN("), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TYPES")), (SubLObject)SubLObjectFactory.makeString(") "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH-TERMS")), (SubLObject)SubLObjectFactory.makeString(")"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))))))))));
        $sym40$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");
        $sym41$GET_FOCUS = SubLObjectFactory.makeSymbol("GET-FOCUS");
        $sym42$WORD_TREE_GET_STRING_METHOD = SubLObjectFactory.makeSymbol("WORD-TREE-GET-STRING-METHOD");
        $sym43$GET_KEYWORDS = SubLObjectFactory.makeSymbol("GET-KEYWORDS");
        $sym44$YIELD = SubLObjectFactory.makeSymbol("YIELD");
        $str45$_ = SubLObjectFactory.makeString("$");
        $str46$_SEN__SYN_ = SubLObjectFactory.makeString("@SEN(@SYN(");
        $str47$__ = SubLObjectFactory.makeString(") ");
        $str48$_ = SubLObjectFactory.makeString(")");
        $sym49$WHAT_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-QUERIFY-METHOD");
        $sym50$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-TAG-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("TAGGED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WH-QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE2WORD-TREES")), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-DIFFERENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)what_question.NIL), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BEFORE"), (SubLObject)SubLObjectFactory.makeSymbol("AFTER"), (SubLObject)SubLObjectFactory.makeSymbol("DEVIATION"), (SubLObject)SubLObjectFactory.makeSymbol("FOUND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPLIT-YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("DEVIATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("DEVIATION"), (SubLObject)what_question.EIGHT_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)SubLObjectFactory.makeSymbol("FOUND"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("BEFORE"), (SubLObject)SubLObjectFactory.makeSymbol("AFTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)what_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-TYPE-MATCH")), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLUSP"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)what_question.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)what_question.FOUR_INTEGER), (SubLObject)what_question.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("I"))))), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym53$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");
        $sym54$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym55$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym56$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $sym57$SENTENCE2WORD_TREES = SubLObjectFactory.makeSymbol("SENTENCE2WORD-TREES");
        $sym58$TREE_TYPE_MATCH = SubLObjectFactory.makeSymbol("TREE-TYPE-MATCH");
        $sym59$WHAT_QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-EXTRACT-METHOD");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the focus of this what-question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT-QUESTION-P"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-OBJECTS")))))));
        $sym61$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");
        $sym62$SUBJECT_QUESTION_P = SubLObjectFactory.makeSymbol("SUBJECT-QUESTION-P");
        $sym63$GET_OBJECTS = SubLObjectFactory.makeSymbol("GET-OBJECTS");
        $sym64$WHAT_QUESTION_GET_FOCUS_METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-GET-FOCUS-METHOD");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOCUS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXTYPES"), (SubLObject)what_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MYTYPES"), (SubLObject)what_question.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPEND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-DOWNCASE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)what_question.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT")), (SubLObject)SubLObjectFactory.makeSymbol("LEXTYPES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXTYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXTYPES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-PATH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LEXTYPE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-PATH")), (SubLObject)SubLObjectFactory.makeSymbol("MYTYPES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MYTYPES")))));
        $sym66$OUTER_CATCH_FOR_WHAT_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WHAT-QUESTION-METHOD");
        $sym67$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NN"), (SubLObject)SubLObjectFactory.makeKeyword("NNS"));
        $sym69$GET = SubLObjectFactory.makeSymbol("GET");
        $kw70$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $kw71$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym72$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const73$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym74$WHAT_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-ANSWER-TYPES-METHOD");
        $sym75$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the number of answers expected for this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeInteger(25)));
        $int77$25 = SubLObjectFactory.makeInteger(25);
        $sym78$WHAT_QUESTION_ANSWER_CARDINALITY_METHOD = SubLObjectFactory.makeSymbol("WHAT-QUESTION-ANSWER-CARDINALITY-METHOD");
    }
}

/*

	Total time: 428 ms
	
*/