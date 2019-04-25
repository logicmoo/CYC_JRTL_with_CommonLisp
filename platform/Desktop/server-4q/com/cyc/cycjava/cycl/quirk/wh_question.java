package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wh_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.wh_question";
    public static final String myFingerPrint = "3fc28cf43f1b4a9ab84988567cab58a0cc3137137691ea8aa2e4092f3f2e0849";
    private static final SubLSymbol $sym0$WH_QUESTION;
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
    private static final SubLSymbol $sym12$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS;
    private static final SubLSymbol $sym13$ISOLATED_P;
    private static final SubLSymbol $sym14$INSTANCE_NUMBER;
    private static final SubLSymbol $sym15$INFORMATION_REQUEST;
    private static final SubLSymbol $sym16$ERROR_HANDLING;
    private static final SubLSymbol $sym17$TIMEOUT;
    private static final SubLSymbol $sym18$STRING;
    private static final SubLSymbol $sym19$PARSE;
    private static final SubLSymbol $sym20$ANSWER_TYPES;
    private static final SubLSymbol $sym21$CORPORA;
    private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE;
    private static final SubLSymbol $sym23$ISA_;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$WH_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym28$SENTENCE2WORD_TREES;
    private static final SubLList $list29;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$WH_QUESTION_SENTENCE2WORD_TREES_METHOD;
    private static final SubLSymbol $sym32$QUERIFY;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
    private static final SubLSymbol $sym35$GET_KEYSTRINGS;
    private static final SubLSymbol $sym36$AUGMENT_TERMS;
    private static final SubLString $str37$_;
    private static final SubLSymbol $sym38$WH_QUESTION_QUERIFY_METHOD;
    private static final SubLSymbol $sym39$EXTRACT;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
    private static final SubLSymbol $sym43$LEARN;
    private static final SubLSymbol $sym44$GET_CONTENT;
    private static final SubLSymbol $sym45$LEXIFY_SENTENCE;
    private static final SubLSymbol $sym46$GET_KEYWORDS;
    private static final SubLSymbol $sym47$TREE_TYPE_MATCH;
    private static final SubLSymbol $sym48$GET_STRING;
    private static final SubLSymbol $sym49$WH_QUESTION_EXTRACT_METHOD;
    private static final SubLSymbol $sym50$SUBJECT_QUESTION_P;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
    private static final SubLSymbol $sym54$GET_HEAD;
    private static final SubLSymbol $sym55$WH_QUESTION_SUBJECT_QUESTION_P_METHOD;
    private static final SubLSymbol $sym56$OBJECT_QUESTION_P;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
    private static final SubLSymbol $sym59$WH_QUESTION_OBJECT_QUESTION_P_METHOD;
    private static final SubLSymbol $sym60$GET_WH_PHRASE;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD;
    private static final SubLSymbol $sym63$FIND_FIRST;
    private static final SubLSymbol $sym64$WH_TREE_P;
    private static final SubLSymbol $sym65$WH_QUESTION_GET_WH_PHRASE_METHOD;
    private static final SubLSymbol $sym66$ANSWER_CARDINALITY;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$WH_QUESTION_ANSWER_CARDINALITY_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 837L)
    public static SubLObject subloop_reserved_initialize_wh_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym3$OBJECT, (SubLObject)wh_question.$sym4$INSTANCE_COUNT, (SubLObject)wh_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym5$LEXICON, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym6$PARSER, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym7$TAGGER, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym8$CHUNKER, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym9$MAX_CANDIDATES, (SubLObject)wh_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym10$MAX_CONFIDENCE, (SubLObject)wh_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym11$LEARNABLE_TYPES, (SubLObject)wh_question.NIL);
        return (SubLObject)wh_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 837L)
    public static SubLObject subloop_reserved_initialize_wh_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym3$OBJECT, (SubLObject)wh_question.$sym13$ISOLATED_P, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym3$OBJECT, (SubLObject)wh_question.$sym14$INSTANCE_NUMBER, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym15$INFORMATION_REQUEST, (SubLObject)wh_question.$sym16$ERROR_HANDLING, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym15$INFORMATION_REQUEST, (SubLObject)wh_question.$sym17$TIMEOUT, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym18$STRING, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym19$PARSE, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym20$ANSWER_TYPES, (SubLObject)wh_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym21$CORPORA, (SubLObject)wh_question.NIL);
        return (SubLObject)wh_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 837L)
    public static SubLObject wh_question_p(final SubLObject v_wh_question) {
        return classes.subloop_instanceof_class(v_wh_question, (SubLObject)wh_question.$sym0$WH_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 1411L)
    public static SubLObject wh_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)wh_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 1589L)
    public static SubLObject wh_question_sentence2word_trees_method(final SubLObject self, final SubLObject sentence) {
        SubLObject word_trees = (SubLObject)wh_question.NIL;
        SubLObject i = (SubLObject)wh_question.ZERO_INTEGER;
        SubLObject cdolist_list_var = document.sentence_listify(sentence);
        SubLObject word = (SubLObject)wh_question.NIL;
        word = cdolist_list_var.first();
        while (wh_question.NIL != cdolist_list_var) {
            word_trees = (SubLObject)ConsesLow.cons(word_tree.new_word_tree(document.word_string(word), document.word_category(word), (SubLObject)wh_question.NIL, i, document.word_info(word), (SubLObject)wh_question.UNPROVIDED), word_trees);
            i = Numbers.add(i, (SubLObject)wh_question.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        return Sequences.nreverse(word_trees);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 1972L)
    public static SubLObject wh_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = (SubLObject)wh_question.NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push(wh_question.$sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                SubLObject queries = (SubLObject)wh_question.NIL;
                final SubLObject content_terms = methods.funcall_instance_method_with_0_args(self, (SubLObject)wh_question.$sym35$GET_KEYSTRINGS);
                SubLObject cdolist_list_var = corpora;
                SubLObject corpus = (SubLObject)wh_question.NIL;
                corpus = cdolist_list_var.first();
                while (wh_question.NIL != cdolist_list_var) {
                    final SubLObject augmentation_terms = methods.funcall_class_method_with_2_args((SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.$sym36$AUGMENT_TERMS, content_terms, corpus);
                    queries = (SubLObject)ConsesLow.cons(search_engine.new_lemur_query(Sequences.cconcatenate(string_utilities.bunge(content_terms, (SubLObject)wh_question.UNPROVIDED), new SubLObject[] { wh_question.$str37$_, string_utilities.bunge(augmentation_terms, (SubLObject)wh_question.UNPROVIDED) }), corpus, (SubLObject)wh_question.UNPROVIDED, (SubLObject)wh_question.UNPROVIDED), queries);
                    cdolist_list_var = cdolist_list_var.rest();
                    corpus = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)wh_question.$sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD, Sequences.nreverse(queries));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wh_question.T, thread);
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
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wh_question.$sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 2472L)
    public static SubLObject wh_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = (SubLObject)wh_question.NIL;
        final SubLObject tagger = question.get_question_tagger(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        try {
            thread.throwStack.push(wh_question.$sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)wh_question.$sym43$LEARN, methods.funcall_instance_method_with_0_args(passage, (SubLObject)wh_question.$sym44$GET_CONTENT));
                final SubLObject sentence = question.sentencify(methods.funcall_instance_method_with_0_args(passage, (SubLObject)wh_question.$sym44$GET_CONTENT));
                final SubLObject tagged = pos_tagger.tagger_tag_sentence(tagger, sentence);
                final SubLObject lexified = (SubLObject)((wh_question.NIL != sentence) ? methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)wh_question.$sym45$LEXIFY_SENTENCE, tagged) : wh_question.NIL);
                final SubLObject yield = methods.funcall_class_method_with_1_args((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym28$SENTENCE2WORD_TREES, lexified);
                final SubLObject keywords = methods.funcall_instance_method_with_0_args(self, (SubLObject)wh_question.$sym46$GET_KEYWORDS);
                SubLObject answers = (SubLObject)wh_question.NIL;
                SubLObject i = (SubLObject)wh_question.NIL;
                if (wh_question.NIL != lexified) {
                    thread.resetMultipleValues();
                    final SubLObject before = question.split_yield(yield, keywords);
                    final SubLObject after = thread.secondMultipleValue();
                    final SubLObject deviation = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (wh_question.NIL != deviation && deviation.numL((SubLObject)wh_question.EIGHT_INTEGER)) {
                        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(before, after);
                        SubLObject candidates = (SubLObject)wh_question.NIL;
                        candidates = cdolist_list_var.first();
                        while (wh_question.NIL != cdolist_list_var) {
                            i = (SubLObject)wh_question.ZERO_INTEGER;
                            SubLObject cdolist_list_var_$1 = candidates;
                            SubLObject candidate = (SubLObject)wh_question.NIL;
                            candidate = cdolist_list_var_$1.first();
                            while (wh_question.NIL != cdolist_list_var_$1) {
                                i = Numbers.add(i, (SubLObject)wh_question.ONE_INTEGER);
                                final SubLObject score = methods.funcall_instance_method_with_1_args(self, (SubLObject)wh_question.$sym47$TREE_TYPE_MATCH, candidate);
                                if (score.isPositive()) {
                                    answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(candidate, (SubLObject)wh_question.$sym48$GET_STRING), passage, Numbers.multiply(score, Numbers.divide((SubLObject)wh_question.ONE_INTEGER, (SubLObject)(i.numL((SubLObject)wh_question.FOUR_INTEGER) ? wh_question.ONE_INTEGER : i))), (SubLObject)wh_question.UNPROVIDED), answers);
                                }
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                candidate = cdolist_list_var_$1.first();
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            candidates = cdolist_list_var.first();
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)wh_question.$sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wh_question.T, thread);
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
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wh_question.$sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 3625L)
    public static SubLObject wh_question_subject_question_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = (SubLObject)wh_question.NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(wh_question.$sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wh_question.$sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(wh_question.NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(parse, (SubLObject)wh_question.$sym54$GET_HEAD))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wh_question.T, thread);
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
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wh_question.$sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 3816L)
    public static SubLObject wh_question_object_question_p_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = (SubLObject)wh_question.NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(wh_question.$sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wh_question.$sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD, word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(parse, (SubLObject)wh_question.$sym54$GET_HEAD)));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wh_question.T, thread);
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
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wh_question.$sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 3999L)
    public static SubLObject wh_question_get_wh_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_wh_question_method = (SubLObject)wh_question.NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(wh_question.$sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)wh_question.$sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD, methods.funcall_instance_method_with_1_args(parse, (SubLObject)wh_question.$sym63$FIND_FIRST, (SubLObject)wh_question.$sym64$WH_TREE_P));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)wh_question.T, thread);
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
            catch_var_for_wh_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)wh_question.$sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_wh_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/wh-question.lisp", position = 4207L)
    public static SubLObject wh_question_answer_cardinality_method(final SubLObject self) {
        return (SubLObject)wh_question.THREE_INTEGER;
    }
    
    public static SubLObject declare_wh_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "subloop_reserved_initialize_wh_question_class", "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "subloop_reserved_initialize_wh_question_instance", "SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_p", "WH-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_isaP_method", "WH-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_sentence2word_trees_method", "WH-QUESTION-SENTENCE2WORD-TREES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_querify_method", "WH-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_extract_method", "WH-QUESTION-EXTRACT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_subject_question_p_method", "WH-QUESTION-SUBJECT-QUESTION-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_object_question_p_method", "WH-QUESTION-OBJECT-QUESTION-P-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_get_wh_phrase_method", "WH-QUESTION-GET-WH-PHRASE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.wh_question", "wh_question_answer_cardinality_method", "WH-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        return (SubLObject)wh_question.NIL;
    }
    
    public static SubLObject init_wh_question_file() {
        return (SubLObject)wh_question.NIL;
    }
    
    public static SubLObject setup_wh_question_file() {
        classes.subloop_new_class((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym1$QUESTION, (SubLObject)wh_question.NIL, (SubLObject)wh_question.T, (SubLObject)wh_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym12$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym22$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE);
        subloop_reserved_initialize_wh_question_class((SubLObject)wh_question.$sym0$WH_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)wh_question.$sym23$ISA_, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list24, (SubLObject)wh_question.$list25, (SubLObject)wh_question.$list26);
        methods.subloop_register_class_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym23$ISA_, (SubLObject)wh_question.$sym27$WH_QUESTION_ISA__METHOD);
        methods.methods_incorporate_class_method((SubLObject)wh_question.$sym28$SENTENCE2WORD_TREES, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list24, (SubLObject)wh_question.$list29, (SubLObject)wh_question.$list30);
        methods.subloop_register_class_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym28$SENTENCE2WORD_TREES, (SubLObject)wh_question.$sym31$WH_QUESTION_SENTENCE2WORD_TREES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wh_question.$sym32$QUERIFY, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list24, (SubLObject)wh_question.NIL, (SubLObject)wh_question.$list33);
        methods.subloop_register_instance_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym32$QUERIFY, (SubLObject)wh_question.$sym38$WH_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wh_question.$sym39$EXTRACT, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list24, (SubLObject)wh_question.$list40, (SubLObject)wh_question.$list41);
        methods.subloop_register_instance_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym39$EXTRACT, (SubLObject)wh_question.$sym49$WH_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wh_question.$sym50$SUBJECT_QUESTION_P, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list51, (SubLObject)wh_question.NIL, (SubLObject)wh_question.$list52);
        methods.subloop_register_instance_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym50$SUBJECT_QUESTION_P, (SubLObject)wh_question.$sym55$WH_QUESTION_SUBJECT_QUESTION_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wh_question.$sym56$OBJECT_QUESTION_P, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list51, (SubLObject)wh_question.NIL, (SubLObject)wh_question.$list57);
        methods.subloop_register_instance_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym56$OBJECT_QUESTION_P, (SubLObject)wh_question.$sym59$WH_QUESTION_OBJECT_QUESTION_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wh_question.$sym60$GET_WH_PHRASE, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list24, (SubLObject)wh_question.NIL, (SubLObject)wh_question.$list61);
        methods.subloop_register_instance_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym60$GET_WH_PHRASE, (SubLObject)wh_question.$sym65$WH_QUESTION_GET_WH_PHRASE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)wh_question.$sym66$ANSWER_CARDINALITY, (SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$list24, (SubLObject)wh_question.NIL, (SubLObject)wh_question.$list67);
        methods.subloop_register_instance_method((SubLObject)wh_question.$sym0$WH_QUESTION, (SubLObject)wh_question.$sym66$ANSWER_CARDINALITY, (SubLObject)wh_question.$sym68$WH_QUESTION_ANSWER_CARDINALITY_METHOD);
        return (SubLObject)wh_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wh_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wh_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wh_question_file();
    }
    
    static {
        me = (SubLFile)new wh_question();
        $sym0$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $sym1$QUESTION = SubLObjectFactory.makeSymbol("QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE2WORD-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT-QUESTION-P"), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-QUESTION-P"), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-WH-PHRASE"), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY"), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$LEXICON = SubLObjectFactory.makeSymbol("LEXICON");
        $sym6$PARSER = SubLObjectFactory.makeSymbol("PARSER");
        $sym7$TAGGER = SubLObjectFactory.makeSymbol("TAGGER");
        $sym8$CHUNKER = SubLObjectFactory.makeSymbol("CHUNKER");
        $sym9$MAX_CANDIDATES = SubLObjectFactory.makeSymbol("MAX-CANDIDATES");
        $sym10$MAX_CONFIDENCE = SubLObjectFactory.makeSymbol("MAX-CONFIDENCE");
        $sym11$LEARNABLE_TYPES = SubLObjectFactory.makeSymbol("LEARNABLE-TYPES");
        $sym12$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-CLASS");
        $sym13$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym14$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym15$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym16$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym17$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym18$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym19$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym20$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym21$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym22$SUBLOOP_RESERVED_INITIALIZE_WH_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WH-QUESTION-INSTANCE");
        $sym23$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param TREE parse-tree-p; \n   @return boolean; t if TREE is a wh-question, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)wh_question.NIL));
        $sym27$WH_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-ISA?-METHOD");
        $sym28$SENTENCE2WORD_TREES = SubLObjectFactory.makeSymbol("SENTENCE2WORD-TREES");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"));
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Convert a sentence object into a list of word-tree objects"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREES"), (SubLObject)wh_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)wh_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-LISTIFY"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-WORD-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)wh_question.NIL, (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("WORD"))), (SubLObject)SubLObjectFactory.makeSymbol("WORD-TREES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-TREES")))));
        $sym31$WH_QUESTION_SENTENCE2WORD_TREES_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-SENTENCE2WORD-TREES-METHOD");
        $sym32$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)wh_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYSTRINGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENT-TERMS")), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEMUR-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TERMS")), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUNGE"), (SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"))), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))));
        $sym34$OUTER_CATCH_FOR_WH_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");
        $sym35$GET_KEYSTRINGS = SubLObjectFactory.makeSymbol("GET-KEYSTRINGS");
        $sym36$AUGMENT_TERMS = SubLObjectFactory.makeSymbol("AUGMENT-TERMS");
        $str37$_ = SubLObjectFactory.makeString(" ");
        $sym38$WH_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-QUERIFY-METHOD");
        $sym39$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCIFY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAGGER-TAG-SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("TAGGER"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE")), (SubLObject)SubLObjectFactory.makeSymbol("TAGGED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WH-QUESTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCE2WORD-TREES")), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYWORDS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)wh_question.NIL), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BEFORE"), (SubLObject)SubLObjectFactory.makeSymbol("AFTER"), (SubLObject)SubLObjectFactory.makeSymbol("DEVIATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPLIT-YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("YIELD"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("DEVIATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("DEVIATION"), (SubLObject)wh_question.EIGHT_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("BEFORE"), (SubLObject)SubLObjectFactory.makeSymbol("AFTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)wh_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE-TYPE-MATCH")), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PLUSP"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)SubLObjectFactory.makeSymbol("SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)wh_question.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)wh_question.FOUR_INTEGER), (SubLObject)wh_question.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("I"))))), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym42$OUTER_CATCH_FOR_WH_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");
        $sym43$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym44$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $sym45$LEXIFY_SENTENCE = SubLObjectFactory.makeSymbol("LEXIFY-SENTENCE");
        $sym46$GET_KEYWORDS = SubLObjectFactory.makeSymbol("GET-KEYWORDS");
        $sym47$TREE_TYPE_MATCH = SubLObjectFactory.makeSymbol("TREE-TYPE-MATCH");
        $sym48$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym49$WH_QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-EXTRACT-METHOD");
        $sym50$SUBJECT_QUESTION_P = SubLObjectFactory.makeSymbol("SUBJECT-QUESTION-P");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this is a subject question, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))))));
        $sym53$OUTER_CATCH_FOR_WH_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");
        $sym54$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym55$WH_QUESTION_SUBJECT_QUESTION_P_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-SUBJECT-QUESTION-P-METHOD");
        $sym56$OBJECT_QUESTION_P = SubLObjectFactory.makeSymbol("OBJECT-QUESTION-P");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return booleanp; t if this is a subject question, nil otherwise"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))))));
        $sym58$OUTER_CATCH_FOR_WH_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");
        $sym59$WH_QUESTION_OBJECT_QUESTION_P_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-OBJECT-QUESTION-P-METHOD");
        $sym60$GET_WH_PHRASE = SubLObjectFactory.makeSymbol("GET-WH-PHRASE");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the initial wh phrase of this question, \n   like 'How many', 'Where', etc"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("FIND-FIRST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P")))));
        $sym62$OUTER_CATCH_FOR_WH_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-WH-QUESTION-METHOD");
        $sym63$FIND_FIRST = SubLObjectFactory.makeSymbol("FIND-FIRST");
        $sym64$WH_TREE_P = SubLObjectFactory.makeSymbol("WH-TREE-P");
        $sym65$WH_QUESTION_GET_WH_PHRASE_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-GET-WH-PHRASE-METHOD");
        $sym66$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the number of answers expected for this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)wh_question.THREE_INTEGER));
        $sym68$WH_QUESTION_ANSWER_CARDINALITY_METHOD = SubLObjectFactory.makeSymbol("WH-QUESTION-ANSWER-CARDINALITY-METHOD");
    }
}

/*

	Total time: 199 ms
	
*/