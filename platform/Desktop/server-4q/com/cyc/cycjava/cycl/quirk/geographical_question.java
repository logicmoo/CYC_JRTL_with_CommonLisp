package com.cyc.cycjava.cycl.quirk;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class geographical_question extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.geographical_question";
    public static final String myFingerPrint = "ab5c5ccc730d12ae3ce821f4d4ce57f5ebcbd4ebd55bc2c85b53ed5128ab076b";
    private static final SubLSymbol $sym0$GEOGRAPHICAL_QUESTION;
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
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$INFORMATION_REQUEST;
    private static final SubLSymbol $sym17$ERROR_HANDLING;
    private static final SubLSymbol $sym18$TIMEOUT;
    private static final SubLSymbol $sym19$STRING;
    private static final SubLSymbol $sym20$PARSE;
    private static final SubLSymbol $sym21$ANSWER_TYPES;
    private static final SubLSymbol $sym22$CORPORA;
    private static final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE;
    private static final SubLSymbol $sym24$ISA_;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GET_DAUGHTER;
    private static final SubLSymbol $sym29$GET_STRING;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$GET_PREDICATE;
    private static final SubLSymbol $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD;
    private static final SubLSymbol $sym33$QUERIFY;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD;
    private static final SubLSymbol $sym36$GET_SUBJECT;
    private static final SubLObject $const37$thereExists;
    private static final SubLSymbol $sym38$_FOCUS;
    private static final SubLObject $const39$and;
    private static final SubLList $list40;
    private static final SubLObject $const41$placeName_Standard;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLString $str44$_a___in;
    private static final SubLString $str45$_a___near;
    private static final SubLString $str46$_a___close_to;
    private static final SubLString $str47$_a_in;
    private static final SubLString $str48$_a_near_;
    private static final SubLString $str49$_a_______;
    private static final SubLSymbol $sym50$GEOGRAPHICAL_QUESTION_QUERIFY_METHOD;
    private static final SubLList $list51;
    private static final SubLObject $const52$Place;
    private static final SubLSymbol $sym53$GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD;
    private static final SubLSymbol $sym54$ANSWER_CARDINALITY;
    private static final SubLList $list55;
    private static final SubLInteger $int56$1000;
    private static final SubLSymbol $sym57$GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD;
    private static final SubLSymbol $sym58$EXTRACT;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$INFORMATION_P;
    private static final SubLSymbol $sym62$EXTRACT_FROM_PASSAGE;
    private static final SubLSymbol $sym63$EXTRACT_FROM_ASSIGNMENT;
    private static final SubLSymbol $sym64$GEOGRAPHICAL_QUESTION_EXTRACT_METHOD;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD;
    private static final SubLSymbol $sym68$GET_CONTENT;
    private static final SubLObject $const69$PlanetEarth;
    private static final SubLString $str70$in_;
    private static final SubLSymbol $sym71$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLSymbol $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD;
    private static final SubLSymbol $sym75$ABSTRACT_PASSAGE_P;
    private static final SubLSymbol $sym76$LEARN;
    private static final SubLSymbol $sym77$LEXIFY;
    private static final SubLList $list78;
    private static final SubLSymbol $kw79$DFR2L;
    private static final SubLSymbol $kw80$DFL2R;
    private static final SubLString $str81$_S_is_not_one_of__S;
    private static final SubLSymbol $sym82$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD;
    private static final SubLSymbol $sym83$EXTRACT_COMMA_PP;
    private static final SubLList $list84;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$GET_SISTER;
    private static final SubLSymbol $sym87$GET_CATEGORY;
    private static final SubLSymbol $kw88$_;
    private static final SubLSymbol $sym89$GET_HEAD;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$GET_COMPLEMENTS;
    private static final SubLSymbol $sym92$CANDIDATE_ANSWER_P;
    private static final SubLSymbol $sym93$GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD;
    private static final SubLSymbol $sym94$EXTRACT_NONCOMMA_PP;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD;
    private static final SubLSymbol $sym98$EXTRACT_APPOSITIVE;
    private static final SubLList $list99;
    private static final SubLSymbol $sym100$DAUGHTER_COUNT;
    private static final SubLSymbol $sym101$GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 883L)
    public static SubLObject subloop_reserved_initialize_geographical_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym3$OBJECT, (SubLObject)geographical_question.$sym4$INSTANCE_COUNT, (SubLObject)geographical_question.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym6$LEXICON, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym7$PARSER, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym8$TAGGER, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym9$CHUNKER, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym10$MAX_CANDIDATES, (SubLObject)geographical_question.TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym11$MAX_CONFIDENCE, (SubLObject)geographical_question.TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym12$LEARNABLE_TYPES, (SubLObject)geographical_question.NIL);
        return (SubLObject)geographical_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 883L)
    public static SubLObject subloop_reserved_initialize_geographical_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym3$OBJECT, (SubLObject)geographical_question.$sym14$ISOLATED_P, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym3$OBJECT, (SubLObject)geographical_question.$sym15$INSTANCE_NUMBER, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym16$INFORMATION_REQUEST, (SubLObject)geographical_question.$sym17$ERROR_HANDLING, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym16$INFORMATION_REQUEST, (SubLObject)geographical_question.$sym18$TIMEOUT, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym19$STRING, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym20$PARSE, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym21$ANSWER_TYPES, (SubLObject)geographical_question.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)geographical_question.$sym5$QUESTION, (SubLObject)geographical_question.$sym22$CORPORA, (SubLObject)geographical_question.NIL);
        return (SubLObject)geographical_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 883L)
    public static SubLObject geographical_question_p(final SubLObject v_geographical_question) {
        return classes.subloop_instanceof_class(v_geographical_question, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 1417L)
    public static SubLObject geographical_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return (SubLObject)SubLObjectFactory.makeBoolean(geographical_question.NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.ZERO_INTEGER)) && geographical_question.NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.ZERO_INTEGER), (SubLObject)geographical_question.$sym29$GET_STRING), (SubLObject)geographical_question.$list30, (SubLObject)geographical_question.UNPROVIDED) && geographical_question.NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, (SubLObject)geographical_question.$sym31$GET_PREDICATE)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 1712L)
    public static SubLObject geographical_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_geographical_question_method = (SubLObject)geographical_question.NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(geographical_question.$sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
            try {
                final SubLObject subject = methods.funcall_instance_method_with_0_args(parse, (SubLObject)geographical_question.$sym36$GET_SUBJECT);
                final SubLObject focus = (SubLObject)((geographical_question.NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, (SubLObject)geographical_question.$sym29$GET_STRING) : geographical_question.NIL);
                final SubLObject cycl_query = (SubLObject)((geographical_question.NIL != focus) ? ConsesLow.list(geographical_question.$const37$thereExists, (SubLObject)geographical_question.$sym38$_FOCUS, (SubLObject)ConsesLow.list(geographical_question.$const39$and, (SubLObject)geographical_question.$list40, (SubLObject)ConsesLow.list(geographical_question.$const41$placeName_Standard, (SubLObject)geographical_question.$sym38$_FOCUS, focus))) : geographical_question.NIL);
                SubLObject queries = (SubLObject)((geographical_question.NIL != cycl_query) ? ConsesLow.list(search_engine.new_cycl_query(cycl_query, (SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)geographical_question.$list42)), (SubLObject)geographical_question.UNPROVIDED), search_engine.new_cycl_query(cycl_query, (SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)geographical_question.$list43)), (SubLObject)geographical_question.UNPROVIDED)) : geographical_question.NIL);
                if (geographical_question.NIL != focus) {
                    SubLObject cdolist_list_var = corpora;
                    SubLObject corpus = (SubLObject)geographical_question.NIL;
                    corpus = cdolist_list_var.first();
                    while (geographical_question.NIL != cdolist_list_var) {
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(PrintLow.format((SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$str44$_a___in, focus), corpus), queries);
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(PrintLow.format((SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$str45$_a___near, focus), corpus), queries);
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(PrintLow.format((SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$str46$_a___close_to, focus), corpus), queries);
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(PrintLow.format((SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$str47$_a_in, focus), corpus), queries);
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(PrintLow.format((SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$str48$_a_near_, focus), corpus), queries);
                        queries = (SubLObject)ConsesLow.cons(search_engine.new_glimpse_query(PrintLow.format((SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$str49$_a_______, focus), corpus), queries);
                        cdolist_list_var = cdolist_list_var.rest();
                        corpus = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)geographical_question.$sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, Sequences.nreverse(queries));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)geographical_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_corpora(self, corpora);
                    question.set_question_parse(self, parse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_geographical_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)geographical_question.$sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_geographical_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 2893L)
    public static SubLObject geographical_question_answer_types_method(final SubLObject self) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(geographical_question.$const52$Place));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 3147L)
    public static SubLObject geographical_question_answer_cardinality_method(final SubLObject self) {
        return (SubLObject)geographical_question.$int56$1000;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 3321L)
    public static SubLObject geographical_question_extract_method(final SubLObject self, final SubLObject info) {
        assert geographical_question.NIL != search_engine.information_p(info) : info;
        return (SubLObject)((geographical_question.NIL != search_engine.abstract_passage_p(info)) ? methods.funcall_instance_method_with_1_args(self, (SubLObject)geographical_question.$sym62$EXTRACT_FROM_PASSAGE, info) : ((geographical_question.NIL != search_engine.var_assignment_p(info)) ? methods.funcall_instance_method_with_1_args(self, (SubLObject)geographical_question.$sym63$EXTRACT_FROM_ASSIGNMENT, info) : geographical_question.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 3754L)
    public static SubLObject geographical_question_extract_from_assignment_method(final SubLObject self, final SubLObject assignment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_geographical_question_method = (SubLObject)geographical_question.NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        try {
            thread.throwStack.push(geographical_question.$sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
            try {
                final SubLObject varXbinding = methods.funcall_instance_method_with_0_args(assignment, (SubLObject)geographical_question.$sym68$GET_CONTENT).first();
                if (geographical_question.NIL != varXbinding && !varXbinding.rest().eql(geographical_question.$const69$PlanetEarth)) {
                    Dynamic.sublisp_throw((SubLObject)geographical_question.$sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, (SubLObject)ConsesLow.list(answer.new_text_answer(self, Sequences.cconcatenate((SubLObject)geographical_question.$str70$in_, pph_main.generate_phrase(varXbinding.rest(), (SubLObject)geographical_question.UNPROVIDED, (SubLObject)geographical_question.UNPROVIDED, (SubLObject)geographical_question.UNPROVIDED, (SubLObject)geographical_question.UNPROVIDED, (SubLObject)geographical_question.UNPROVIDED, (SubLObject)geographical_question.UNPROVIDED, (SubLObject)geographical_question.UNPROVIDED)), assignment, max_confidence, (SubLObject)geographical_question.UNPROVIDED)));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)geographical_question.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_geographical_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)geographical_question.$sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_geographical_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 4201L)
    public static SubLObject geographical_question_extract_from_passage_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_geographical_question_method = (SubLObject)geographical_question.NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push(geographical_question.$sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
            try {
                assert geographical_question.NIL != search_engine.abstract_passage_p(passage) : passage;
                methods.funcall_instance_method_with_1_args(lexicon, (SubLObject)geographical_question.$sym76$LEARN, methods.funcall_instance_method_with_0_args(passage, (SubLObject)geographical_question.$sym68$GET_CONTENT));
                final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)geographical_question.$sym20$PARSE, methods.funcall_instance_method_with_0_args(passage, (SubLObject)geographical_question.$sym68$GET_CONTENT));
                final SubLObject lexified = (SubLObject)((geographical_question.NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym77$LEXIFY, lexicon) : geographical_question.NIL);
                final SubLObject focus = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(parse, (SubLObject)geographical_question.$sym36$GET_SUBJECT), (SubLObject)geographical_question.$sym29$GET_STRING);
                SubLObject answers = (SubLObject)geographical_question.NIL;
                final SubLObject extractors = (SubLObject)geographical_question.$list78;
                if (geographical_question.NIL != parse_tree.parse_tree_p(lexified)) {
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject order_var = (SubLObject)geographical_question.$kw79$DFR2L;
                    final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)geographical_question.$kw80$DFL2R, (SubLObject)geographical_question.$kw79$DFR2L);
                    SubLObject sub = (SubLObject)geographical_question.NIL;
                    if (geographical_question.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && geographical_question.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)geographical_question.EQ), (SubLObject)geographical_question.UNPROVIDED)) {
                        Errors.error((SubLObject)geographical_question.$str81$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                    stacks.stack_push(lexified, stack);
                    while (geographical_question.NIL == stacks.stack_empty_p(stack) && geographical_question.NIL == answers) {
                        sub = stacks.stack_pop(stack);
                        if (geographical_question.NIL != parse_tree.phrase_tree_p(sub) && geographical_question.NIL == answers) {
                            SubLObject csome_list_var = extractors;
                            SubLObject extractor = (SubLObject)geographical_question.NIL;
                            extractor = csome_list_var.first();
                            while (geographical_question.NIL == answers && geographical_question.NIL != csome_list_var) {
                                final SubLObject v_answer = methods.funcall_instance_method_with_2_args(self, extractor, focus, sub);
                                if (geographical_question.NIL != v_answer) {
                                    answers = (SubLObject)ConsesLow.cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)geographical_question.$sym29$GET_STRING), passage, max_confidence, (SubLObject)geographical_question.UNPROVIDED), answers);
                                }
                                csome_list_var = csome_list_var.rest();
                                extractor = csome_list_var.first();
                            }
                        }
                        if (geographical_question.NIL != parse_tree.phrase_tree_p(sub)) {
                            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                            final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)geographical_question.$kw80$DFL2R);
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject daughter;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)geographical_question.NIL, v_iteration = (SubLObject)geographical_question.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)geographical_question.ONE_INTEGER)) {
                                element_num = ((geographical_question.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)geographical_question.ONE_INTEGER) : v_iteration);
                                daughter = Vectors.aref(vector_var, element_num);
                                stacks.stack_push(daughter, stack);
                            }
                        }
                    }
                }
                Dynamic.sublisp_throw((SubLObject)geographical_question.$sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, answers);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)geographical_question.T, thread);
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
            catch_var_for_geographical_question_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)geographical_question.$sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_geographical_question_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 5065L)
    public static SubLObject geographical_question_extract_comma_pp_method(final SubLObject self, final SubLObject v_term, final SubLObject tree) {
        if (geographical_question.NIL != string_utilities.ends_with(methods.funcall_instance_method_with_0_args(tree, (SubLObject)geographical_question.$sym29$GET_STRING), v_term, (SubLObject)geographical_question.UNPROVIDED) && geographical_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym87$GET_CATEGORY) == geographical_question.$kw88$_ && geographical_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.TWO_INTEGER) && geographical_question.NIL != parse_tree.pp_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.TWO_INTEGER)) && geographical_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)geographical_question.$sym89$GET_HEAD), (SubLObject)geographical_question.$sym29$GET_STRING), (SubLObject)geographical_question.$list90, (SubLObject)geographical_question.EQUAL, (SubLObject)geographical_question.UNPROVIDED) && geographical_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)geographical_question.$sym91$GET_COMPLEMENTS).first(), (SubLObject)geographical_question.$sym89$GET_HEAD) && geographical_question.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)geographical_question.$sym92$CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)geographical_question.$sym91$GET_COMPLEMENTS).first(), (SubLObject)geographical_question.$sym89$GET_HEAD))) {
            return methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.TWO_INTEGER);
        }
        return (SubLObject)geographical_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 5825L)
    public static SubLObject geographical_question_extract_noncomma_pp_method(final SubLObject self, final SubLObject v_term, final SubLObject tree) {
        if (geographical_question.NIL != string_utilities.ends_with(methods.funcall_instance_method_with_0_args(tree, (SubLObject)geographical_question.$sym29$GET_STRING), v_term, (SubLObject)geographical_question.UNPROVIDED) && geographical_question.NIL != methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER) && geographical_question.NIL != parse_tree.pp_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER)) && geographical_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym89$GET_HEAD) && geographical_question.NIL != conses_high.member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym89$GET_HEAD), (SubLObject)geographical_question.$sym29$GET_STRING), (SubLObject)geographical_question.$list96, (SubLObject)geographical_question.EQUAL, (SubLObject)geographical_question.UNPROVIDED) && geographical_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym91$GET_COMPLEMENTS).first() && geographical_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym91$GET_COMPLEMENTS).first(), (SubLObject)geographical_question.$sym89$GET_HEAD) && geographical_question.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)geographical_question.$sym92$CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym91$GET_COMPLEMENTS).first(), (SubLObject)geographical_question.$sym89$GET_HEAD))) {
            return methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym86$GET_SISTER, (SubLObject)geographical_question.ONE_INTEGER);
        }
        return (SubLObject)geographical_question.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/geographical-question.lisp", position = 6588L)
    public static SubLObject geographical_question_extract_appositive_method(final SubLObject self, final SubLObject v_term, final SubLObject tree) {
        if (geographical_question.NIL != parse_tree.np_tree_p(tree) && methods.funcall_instance_method_with_0_args(tree, (SubLObject)geographical_question.$sym100$DAUGHTER_COUNT).numG((SubLObject)geographical_question.TWO_INTEGER) && methods.funcall_instance_method_with_0_args(tree, (SubLObject)geographical_question.$sym100$DAUGHTER_COUNT).numL((SubLObject)geographical_question.FIVE_INTEGER) && geographical_question.NIL != question.np_term_match(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.ZERO_INTEGER), v_term, (SubLObject)geographical_question.UNPROVIDED) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)geographical_question.$sym87$GET_CATEGORY) == geographical_question.$kw88$_ && geographical_question.NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.TWO_INTEGER)) && geographical_question.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)geographical_question.$sym89$GET_HEAD) && geographical_question.NIL != methods.funcall_instance_method_with_1_args(self, (SubLObject)geographical_question.$sym92$CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)geographical_question.$sym89$GET_HEAD))) {
            return methods.funcall_instance_method_with_1_args(tree, (SubLObject)geographical_question.$sym28$GET_DAUGHTER, (SubLObject)geographical_question.TWO_INTEGER);
        }
        return (SubLObject)geographical_question.NIL;
    }
    
    public static SubLObject declare_geographical_question_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "subloop_reserved_initialize_geographical_question_class", "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "subloop_reserved_initialize_geographical_question_instance", "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_p", "GEOGRAPHICAL-QUESTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_isaP_method", "GEOGRAPHICAL-QUESTION-ISA?-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_querify_method", "GEOGRAPHICAL-QUESTION-QUERIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_answer_types_method", "GEOGRAPHICAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_answer_cardinality_method", "GEOGRAPHICAL-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_extract_method", "GEOGRAPHICAL-QUESTION-EXTRACT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_extract_from_assignment_method", "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-ASSIGNMENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_extract_from_passage_method", "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-PASSAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_extract_comma_pp_method", "GEOGRAPHICAL-QUESTION-EXTRACT-COMMA-PP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_extract_noncomma_pp_method", "GEOGRAPHICAL-QUESTION-EXTRACT-NONCOMMA-PP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.geographical_question", "geographical_question_extract_appositive_method", "GEOGRAPHICAL-QUESTION-EXTRACT-APPOSITIVE-METHOD", 3, 0, false);
        return (SubLObject)geographical_question.NIL;
    }
    
    public static SubLObject init_geographical_question_file() {
        return (SubLObject)geographical_question.NIL;
    }
    
    public static SubLObject setup_geographical_question_file() {
        classes.subloop_new_class((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym1$WH_QUESTION, (SubLObject)geographical_question.NIL, (SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym13$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym23$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE);
        subloop_reserved_initialize_geographical_question_class((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION);
        methods.methods_incorporate_class_method((SubLObject)geographical_question.$sym24$ISA_, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list26, (SubLObject)geographical_question.$list27);
        methods.subloop_register_class_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym24$ISA_, (SubLObject)geographical_question.$sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym33$QUERIFY, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$list34);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym33$QUERIFY, (SubLObject)geographical_question.$sym50$GEOGRAPHICAL_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym21$ANSWER_TYPES, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$list51);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym21$ANSWER_TYPES, (SubLObject)geographical_question.$sym53$GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym54$ANSWER_CARDINALITY, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.NIL, (SubLObject)geographical_question.$list55);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym54$ANSWER_CARDINALITY, (SubLObject)geographical_question.$sym57$GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym58$EXTRACT, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list59, (SubLObject)geographical_question.$list60);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym58$EXTRACT, (SubLObject)geographical_question.$sym64$GEOGRAPHICAL_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym63$EXTRACT_FROM_ASSIGNMENT, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list65, (SubLObject)geographical_question.$list66);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym63$EXTRACT_FROM_ASSIGNMENT, (SubLObject)geographical_question.$sym71$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym62$EXTRACT_FROM_PASSAGE, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list72, (SubLObject)geographical_question.$list73);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym62$EXTRACT_FROM_PASSAGE, (SubLObject)geographical_question.$sym82$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym83$EXTRACT_COMMA_PP, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list84, (SubLObject)geographical_question.$list85);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym83$EXTRACT_COMMA_PP, (SubLObject)geographical_question.$sym93$GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym94$EXTRACT_NONCOMMA_PP, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list84, (SubLObject)geographical_question.$list95);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym94$EXTRACT_NONCOMMA_PP, (SubLObject)geographical_question.$sym97$GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)geographical_question.$sym98$EXTRACT_APPOSITIVE, (SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$list25, (SubLObject)geographical_question.$list84, (SubLObject)geographical_question.$list99);
        methods.subloop_register_instance_method((SubLObject)geographical_question.$sym0$GEOGRAPHICAL_QUESTION, (SubLObject)geographical_question.$sym98$EXTRACT_APPOSITIVE, (SubLObject)geographical_question.$sym101$GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD);
        return (SubLObject)geographical_question.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_geographical_question_file();
    }
    
    @Override
	public void initializeVariables() {
        init_geographical_question_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_geographical_question_file();
    }
    
    static {
        me = (SubLFile)new geographical_question();
        $sym0$GEOGRAPHICAL_QUESTION = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION");
        $sym1$WH_QUESTION = SubLObjectFactory.makeSymbol("WH-QUESTION");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ISA?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIFY"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-TYPES"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-FROM-PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-FROM-ASSIGNMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENT")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-PP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-APPOSITIVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
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
        $sym13$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$INFORMATION_REQUEST = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST");
        $sym17$ERROR_HANDLING = SubLObjectFactory.makeSymbol("ERROR-HANDLING");
        $sym18$TIMEOUT = SubLObjectFactory.makeSymbol("TIMEOUT");
        $sym19$STRING = SubLObjectFactory.makeSymbol("STRING");
        $sym20$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym21$ANSWER_TYPES = SubLObjectFactory.makeSymbol("ANSWER-TYPES");
        $sym22$CORPORA = SubLObjectFactory.makeSymbol("CORPORA");
        $sym23$SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-INSTANCE");
        $sym24$ISA_ = SubLObjectFactory.makeSymbol("ISA?");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WH-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("where"), (SubLObject)SubLObjectFactory.makeString("whence"), (SubLObject)SubLObjectFactory.makeString("whither")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUX-VERB-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PREDICATE")))))));
        $sym28$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym29$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("where"), (SubLObject)SubLObjectFactory.makeString("whence"), (SubLObject)SubLObjectFactory.makeString("whither"));
        $sym31$GET_PREDICATE = SubLObjectFactory.makeSymbol("GET-PREDICATE");
        $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-ISA?-METHOD");
        $sym33$QUERIFY = SubLObjectFactory.makeSymbol("QUERIFY");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?FOCUS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions")), (SubLObject)SubLObjectFactory.makeSymbol("?WHERE"), (SubLObject)SubLObjectFactory.makeSymbol("?FOCUS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-Standard")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("?FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERIES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCL-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-NART"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nima-Gns-KS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CYCL-QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-NART"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Usgs-KS"))))))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CORPUS"), (SubLObject)SubLObjectFactory.makeSymbol("CORPORA")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeString("~a\\, in"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeString("~a\\, near"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeString("~a\\, close to"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeString("~a in"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeString("~a near "), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-GLIMPSE-QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)geographical_question.NIL, (SubLObject)SubLObjectFactory.makeString("~a\\, #\\, "), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS")), (SubLObject)SubLObjectFactory.makeSymbol("CORPUS")), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("QUERIES")))));
        $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD");
        $sym36$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $const37$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $sym38$_FOCUS = SubLObjectFactory.makeSymbol("?FOCUS");
        $const39$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("geographicalSubRegions")), (SubLObject)SubLObjectFactory.makeSymbol("?WHERE"), (SubLObject)SubLObjectFactory.makeSymbol("?FOCUS"));
        $const41$placeName_Standard = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-Standard"));
        $list42 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nima-Gns-KS")));
        $list43 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Usgs-KS")));
        $str44$_a___in = SubLObjectFactory.makeString("~a\\, in");
        $str45$_a___near = SubLObjectFactory.makeString("~a\\, near");
        $str46$_a___close_to = SubLObjectFactory.makeString("~a\\, close to");
        $str47$_a_in = SubLObjectFactory.makeString("~a in");
        $str48$_a_near_ = SubLObjectFactory.makeString("~a near ");
        $str49$_a_______ = SubLObjectFactory.makeString("~a\\, #\\, ");
        $sym50$GEOGRAPHICAL_QUESTION_QUERIFY_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-QUERIFY-METHOD");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"))))));
        $const52$Place = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Place"));
        $sym53$GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-ANSWER-TYPES-METHOD");
        $sym54$ANSWER_CARDINALITY = SubLObjectFactory.makeSymbol("ANSWER-CARDINALITY");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-integer-p; the number of answers expected for this question"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeInteger(1000)));
        $int56$1000 = SubLObjectFactory.makeInteger(1000);
        $sym57$GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-ANSWER-CARDINALITY-METHOD");
        $sym58$EXTRACT = SubLObjectFactory.makeSymbol("EXTRACT");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from INFO\n   @note instead of an explicit fcond, dispatching using OO methods would be nice"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("INFO"), (SubLObject)SubLObjectFactory.makeSymbol("INFORMATION-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INFO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-FROM-PASSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("INFO"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-ASSIGNMENT-P"), (SubLObject)SubLObjectFactory.makeSymbol("INFO")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-FROM-ASSIGNMENT")), (SubLObject)SubLObjectFactory.makeSymbol("INFO"))), (SubLObject)ConsesLow.list((SubLObject)geographical_question.T, (SubLObject)geographical_question.NIL))));
        $sym61$INFORMATION_P = SubLObjectFactory.makeSymbol("INFORMATION-P");
        $sym62$EXTRACT_FROM_PASSAGE = SubLObjectFactory.makeSymbol("EXTRACT-FROM-PASSAGE");
        $sym63$EXTRACT_FROM_ASSIGNMENT = SubLObjectFactory.makeSymbol("EXTRACT-FROM-ASSIGNMENT");
        $sym64$GEOGRAPHICAL_QUESTION_EXTRACT_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-METHOD");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENT"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from ASSIGNMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR.BINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("VAR.BINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)geographical_question.EQL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR.BINDING")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanetEarth"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString("in "), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENERATE-PHRASE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR.BINDING")))), (SubLObject)SubLObjectFactory.makeSymbol("ASSIGNMENT"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-CONFIDENCE")))))));
        $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD");
        $sym68$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $const69$PlanetEarth = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PlanetEarth"));
        $str70$in_ = SubLObjectFactory.makeString("in ");
        $sym71$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-FROM-ASSIGNMENT-METHOD");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a list of answers to this question from PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEARN")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFY")), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SUBJECT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)geographical_question.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACTORS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-COMMA-PP"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-NONCOMMA-PP"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-APPOSITIVE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-PARSE-TREE-SUBTREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB"), (SubLObject)SubLObjectFactory.makeSymbol("LEXIFIED"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("SUB")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACTORS"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACTOR"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("SUB")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-TEXT-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("PASSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-CONFIDENCE")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD");
        $sym75$ABSTRACT_PASSAGE_P = SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P");
        $sym76$LEARN = SubLObjectFactory.makeSymbol("LEARN");
        $sym77$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-COMMA-PP"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-NONCOMMA-PP"), (SubLObject)SubLObjectFactory.makeSymbol("EXTRACT-APPOSITIVE"));
        $kw79$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $kw80$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $str81$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $sym82$GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-FROM-PASSAGE-METHOD");
        $sym83$EXTRACT_COMMA_PP = SubLObjectFactory.makeSymbol("EXTRACT-COMMA-PP");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return pp-tree-p or nil; the pp tree in phrases like 'Guam, in the Pacific, ...'"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENDS-WITH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), ConsesLow.list((SubLObject)geographical_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword(",")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.TWO_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("in"), (SubLObject)SubLObjectFactory.makeString("near"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("close to"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)geographical_question.EQUAL)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.TWO_INTEGER))));
        $sym86$GET_SISTER = SubLObjectFactory.makeSymbol("GET-SISTER");
        $sym87$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $kw88$_ = SubLObjectFactory.makeKeyword(",");
        $sym89$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("in"), (SubLObject)SubLObjectFactory.makeString("near"), (SubLObject)SubLObjectFactory.makeString("on"), (SubLObject)SubLObjectFactory.makeString("close to"));
        $sym91$GET_COMPLEMENTS = SubLObjectFactory.makeSymbol("GET-COMPLEMENTS");
        $sym92$CANDIDATE_ANSWER_P = SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P");
        $sym93$GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-COMMA-PP-METHOD");
        $sym94$EXTRACT_NONCOMMA_PP = SubLObjectFactory.makeSymbol("EXTRACT-NONCOMMA-PP");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return pp-tree-p or nil; the pp tree in phrases like 'Guam in the Pacific, ...'"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENDS-WITH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PP-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("in"), (SubLObject)SubLObjectFactory.makeString("near"), (SubLObject)SubLObjectFactory.makeString("close to"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)geographical_question.EQUAL)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-COMPLEMENTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-SISTER")), (SubLObject)geographical_question.ONE_INTEGER))));
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("in"), (SubLObject)SubLObjectFactory.makeString("near"), (SubLObject)SubLObjectFactory.makeString("close to"));
        $sym97$GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-NONCOMMA-PP-METHOD");
        $sym98$EXTRACT_APPOSITIVE = SubLObjectFactory.makeSymbol("EXTRACT-APPOSITIVE");
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return np-tree-p or nil; the np tree in phrases like 'Austin, Texas, ...'"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CAND"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TREE")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)geographical_question.TWO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("DAUGHTER-COUNT"))), (SubLObject)geographical_question.FIVE_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP-TERM-MATCH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("TERM")), ConsesLow.list((SubLObject)geographical_question.EQ, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CATEGORY"))), (SubLObject)SubLObjectFactory.makeKeyword(",")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NOMINAL-TREE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.TWO_INTEGER)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CANDIDATE-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD")))) }), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DAUGHTER")), (SubLObject)geographical_question.TWO_INTEGER))));
        $sym100$DAUGHTER_COUNT = SubLObjectFactory.makeSymbol("DAUGHTER-COUNT");
        $sym101$GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD = SubLObjectFactory.makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-APPOSITIVE-METHOD");
    }
}

/*

	Total time: 322 ms
	
*/