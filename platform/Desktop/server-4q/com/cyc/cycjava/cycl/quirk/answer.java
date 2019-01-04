package com.cyc.cycjava.cycl.quirk;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.clustering;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.classes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class answer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.quirk.answer";
    public static final String myFingerPrint = "877d2a2b7c4cbbc7c582ae0ef0f7fba8503d0f80bb219fc89ea60fe2043b9f0c";
    private static final SubLSymbol $sym0$ANSWER;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$INFO;
    private static final SubLSymbol $sym4$JUSTIFICATION;
    private static final SubLSymbol $sym5$RELEVANCE;
    private static final SubLSymbol $sym6$CONFIDENCE;
    private static final SubLSymbol $sym7$CONTENT;
    private static final SubLSymbol $sym8$INFO_REQUEST;
    private static final SubLSymbol $sym9$INSTANCE_COUNT;
    private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS;
    private static final SubLSymbol $sym11$ISOLATED_P;
    private static final SubLSymbol $sym12$INSTANCE_NUMBER;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE;
    private static final SubLSymbol $sym14$MAX_INSTANCES;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$LISTP;
    private static final SubLSymbol $sym19$GET_CONFIDENCE;
    private static final SubLSymbol $sym20$ANSWER_MAX_INSTANCES_METHOD;
    private static final SubLSymbol $sym21$PRINT;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLString $str26$__ANSWER_for_;
    private static final SubLString $str27$__;
    private static final SubLString $str28$____2F___2F_;
    private static final SubLSymbol $sym29$ANSWER_PRINT_METHOD;
    private static final SubLSymbol $sym30$GET_INFO_REQUEST;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym33$ANSWER_GET_INFO_REQUEST_METHOD;
    private static final SubLSymbol $sym34$GET_CONTENT;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym37$ANSWER_GET_CONTENT_METHOD;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym40$ANSWER_GET_CONFIDENCE_METHOD;
    private static final SubLSymbol $sym41$GET_RELEVANCE;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym44$ANSWER_GET_RELEVANCE_METHOD;
    private static final SubLSymbol $sym45$JUSTIFY;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym48$ANSWER_JUSTIFY_METHOD;
    private static final SubLSymbol $sym49$GET_INFO;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym52$ANSWER_GET_INFO_METHOD;
    private static final SubLSymbol $sym53$GET_PARSE_TREE;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $kw56$PARSE_TREE;
    private static final SubLSymbol $sym57$ANSWER_GET_PARSE_TREE_METHOD;
    private static final SubLSymbol $sym58$NATURAL_LANGUAGE_FACTOID;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym61$GET_KEYSTRINGS;
    private static final SubLString $str62$_;
    private static final SubLSymbol $sym63$ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD;
    private static final SubLSymbol $sym64$OLDER;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $sym67$ANSWER_P;
    private static final SubLSymbol $sym68$GET_DATE;
    private static final SubLSymbol $sym69$ANSWER_OLDER_METHOD;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$OUTER_CATCH_FOR_ANSWER_METHOD;
    private static final SubLSymbol $sym72$GET_PUBLICATION_DATE;
    private static final SubLSymbol $sym73$ANSWER_GET_DATE_METHOD;
    private static final SubLSymbol $sym74$TEXT_ANSWER;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$AUGMENTATION_TERMS;
    private static final SubLSymbol $sym77$PARSE;
    private static final SubLSymbol $sym78$VECTOR;
    private static final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS;
    private static final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE;
    private static final SubLSymbol $sym81$INFORMATION_REQUEST_P;
    private static final SubLSymbol $sym82$INFORMATION_P;
    private static final SubLSymbol $sym83$NUMBERP;
    private static final SubLSymbol $sym84$SIMILARITY_FUNCTION;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$TEXT_ANSWER_SIMILARITY;
    private static final SubLSymbol $sym87$TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD;
    private static final SubLSymbol $sym88$REQUIRE_SIMILARITY;
    private static final SubLList $list89;
    private static final SubLFloat $float90$0_3;
    private static final SubLSymbol $sym91$TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD;
    private static final SubLSymbol $sym92$TYPICAL_INSTANCE;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$GET_TEXT_ANSWER_VECTOR;
    private static final SubLSymbol $sym95$TEXT_ANSWER_TYPICAL_INSTANCE_METHOD;
    private static final SubLSymbol $sym96$SELECT;
    private static final SubLList $list97;
    private static final SubLSymbol $sym98$REQUIRE_PERCENTAGE;
    private static final SubLInteger $int99$100;
    private static final SubLSymbol $sym100$TEXT_ANSWER_BETTER;
    private static final SubLSymbol $sym101$TEXT_ANSWER_SELECT_METHOD;
    private static final SubLSymbol $sym102$CLUSTER_P;
    private static final SubLSymbol $sym103$GET_VECTOR;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD;
    private static final SubLSymbol $sym106$TEXT_ANSWER_GET_VECTOR_METHOD;
    private static final SubLSymbol $sym107$SIMILARITY;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$TEXT_ANSWER_P;
    private static final SubLSymbol $sym111$TEXT_ANSWER_SIMILARITY_METHOD;
    private static final SubLSymbol $sym112$VALUE_ANSWER;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$INTERPRETED_VALUES;
    private static final SubLSymbol $sym115$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS;
    private static final SubLSymbol $sym116$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE;
    private static final SubLSymbol $sym117$PARSE_TREE_P;
    private static final SubLString $str118$_;
    private static final SubLString $str119$__RRB_;
    private static final SubLString $str120$_;
    private static final SubLString $str121$_LRB__;
    private static final SubLSymbol $sym122$GET_STRING;
    private static final SubLList $list123;
    private static final SubLSymbol $sym124$VALUE_ANSWER_SIMILARITY;
    private static final SubLSymbol $sym125$VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD;
    private static final SubLSymbol $sym126$GET_INTERPRETED_VALUES;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD;
    private static final SubLSymbol $sym129$VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD;
    private static final SubLList $list130;
    private static final SubLSymbol $sym131$VALUE_ANSWER_P;
    private static final SubLSymbol $sym132$VALUE_ANSWER_SIMILARITY_METHOD;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$VALUE_ANSWER_TYPICAL_INSTANCE_METHOD;
    private static final SubLSymbol $sym135$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym136$SENTENCE_ANSWER;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS;
    private static final SubLSymbol $sym139$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE;
    private static final SubLSymbol $sym140$SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD;
    private static final SubLList $list141;
    private static final SubLSymbol $sym142$SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD;
    private static final SubLList $list143;
    private static final SubLSymbol $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD;
    private static final SubLString $str145$__SENTENCE_ANSWER_for_;
    private static final SubLSymbol $sym146$SENTENCE_ANSWER_PRINT_METHOD;
    private static final SubLSymbol $sym147$STRINGP;
    private static final SubLSymbol $sym148$STANFORD_PARSER;
    private static final SubLSymbol $sym149$GET_PARSER;
    private static final SubLSymbol $kw150$NP;
    private static final SubLSymbol $sym151$GET_CATEGORY;
    private static final SubLSymbol $sym152$GET_HEAD;
    private static final SubLSymbol $kw153$NNS;
    private static final SubLString $str154$are;
    private static final SubLString $str155$is;
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject get_answer_info(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, (SubLObject)answer.SIX_INTEGER, (SubLObject)answer.$sym3$INFO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject set_answer_info(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, (SubLObject)answer.SIX_INTEGER, (SubLObject)answer.$sym3$INFO);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject get_answer_justification(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, (SubLObject)answer.FIVE_INTEGER, (SubLObject)answer.$sym4$JUSTIFICATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject set_answer_justification(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, (SubLObject)answer.FIVE_INTEGER, (SubLObject)answer.$sym4$JUSTIFICATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject get_answer_relevance(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, (SubLObject)answer.FOUR_INTEGER, (SubLObject)answer.$sym5$RELEVANCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject set_answer_relevance(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, (SubLObject)answer.FOUR_INTEGER, (SubLObject)answer.$sym5$RELEVANCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject get_answer_confidence(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, (SubLObject)answer.THREE_INTEGER, (SubLObject)answer.$sym6$CONFIDENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject set_answer_confidence(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, (SubLObject)answer.THREE_INTEGER, (SubLObject)answer.$sym6$CONFIDENCE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject get_answer_content(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, (SubLObject)answer.TWO_INTEGER, (SubLObject)answer.$sym7$CONTENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject set_answer_content(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, (SubLObject)answer.TWO_INTEGER, (SubLObject)answer.$sym7$CONTENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject get_answer_info_request(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, (SubLObject)answer.ONE_INTEGER, (SubLObject)answer.$sym8$INFO_REQUEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject set_answer_info_request(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, (SubLObject)answer.ONE_INTEGER, (SubLObject)answer.$sym8$INFO_REQUEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject subloop_reserved_initialize_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym9$INSTANCE_COUNT, (SubLObject)answer.ZERO_INTEGER);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject subloop_reserved_initialize_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym11$ISOLATED_P, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym12$INSTANCE_NUMBER, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym8$INFO_REQUEST, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym7$CONTENT, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym6$CONFIDENCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym5$RELEVANCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym4$JUSTIFICATION, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym3$INFO, (SubLObject)answer.NIL);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 834L)
    public static SubLObject answer_p(final SubLObject v_answer) {
        return classes.subloop_instanceof_class(v_answer, (SubLObject)answer.$sym0$ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 1716L)
    public static SubLObject answer_max_instances_method(final SubLObject self, final SubLObject answers) {
        assert answer.NIL != Types.listp(answers) : answers;
        SubLObject max_score = (SubLObject)answer.ZERO_INTEGER;
        SubLObject max_answers = (SubLObject)answer.NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = (SubLObject)answer.NIL;
        v_answer = cdolist_list_var.first();
        while (answer.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)answer.$sym19$GET_CONFIDENCE).numG(max_score)) {
                max_score = methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)answer.$sym19$GET_CONFIDENCE);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        cdolist_list_var = answers;
        v_answer = (SubLObject)answer.NIL;
        v_answer = cdolist_list_var.first();
        while (answer.NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)answer.$sym19$GET_CONFIDENCE).numE(max_score)) {
                max_answers = (SubLObject)ConsesLow.cons(v_answer, max_answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return max_answers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 2319L)
    public static SubLObject answer_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject relevance = get_answer_relevance(self);
        final SubLObject confidence = get_answer_confidence(self);
        final SubLObject content = get_answer_content(self);
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push(answer.$sym25$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                streams_high.write_string((SubLObject)answer.$str26$__ANSWER_for_, stream, (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED);
                print_high.prin1(info_request, stream);
                streams_high.write_string((SubLObject)answer.$str27$__, stream, (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED);
                print_high.prin1(content, stream);
                PrintLow.format(stream, (SubLObject)answer.$str28$____2F___2F_, confidence, relevance);
                Dynamic.sublisp_throw((SubLObject)answer.$sym25$OUTER_CATCH_FOR_ANSWER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_relevance(self, relevance);
                    set_answer_confidence(self, confidence);
                    set_answer_content(self, content);
                    set_answer_info_request(self, info_request);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym25$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 2640L)
    public static SubLObject answer_get_info_request_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push(answer.$sym32$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym32$OUTER_CATCH_FOR_ANSWER_METHOD, info_request);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_info_request(self, info_request);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym32$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 2773L)
    public static SubLObject answer_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject content = get_answer_content(self);
        try {
            thread.throwStack.push(answer.$sym36$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym36$OUTER_CATCH_FOR_ANSWER_METHOD, content);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_content(self, content);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym36$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 2890L)
    public static SubLObject answer_get_confidence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject confidence = get_answer_confidence(self);
        try {
            thread.throwStack.push(answer.$sym39$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym39$OUTER_CATCH_FOR_ANSWER_METHOD, confidence);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_confidence(self, confidence);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym39$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 3033L)
    public static SubLObject answer_get_relevance_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject relevance = get_answer_relevance(self);
        try {
            thread.throwStack.push(answer.$sym43$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym43$OUTER_CATCH_FOR_ANSWER_METHOD, relevance);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_relevance(self, relevance);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym43$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 3173L)
    public static SubLObject answer_justify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject justification = get_answer_justification(self);
        try {
            thread.throwStack.push(answer.$sym47$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym47$OUTER_CATCH_FOR_ANSWER_METHOD, justification);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_justification(self, justification);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym47$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 3300L)
    public static SubLObject answer_get_info_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject info = get_answer_info(self);
        try {
            thread.throwStack.push(answer.$sym51$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym51$OUTER_CATCH_FOR_ANSWER_METHOD, info);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_info(self, info);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym51$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 3415L)
    public static SubLObject answer_get_parse_tree_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject info = get_answer_info(self);
        try {
            thread.throwStack.push(answer.$sym55$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym55$OUTER_CATCH_FOR_ANSWER_METHOD, conses_high.getf(info, (SubLObject)answer.$kw56$PARSE_TREE, (SubLObject)answer.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_info(self, info);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym55$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 3573L)
    public static SubLObject answer_natural_language_factoid_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject justification = get_answer_justification(self);
        final SubLObject content = get_answer_content(self);
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push(answer.$sym60$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                SubLObject focus = (SubLObject)answer.NIL;
                SubLObject copula = (SubLObject)answer.NIL;
                SubLObject factoid = (SubLObject)answer.NIL;
                if (answer.NIL != definitional_question.definitional_question_p(info_request)) {
                    focus = methods.funcall_instance_method_with_0_args(info_request, (SubLObject)answer.$sym61$GET_KEYSTRINGS).first();
                    copula = find_subject_agreement(content);
                    if (!copula.equal(string_utilities.$empty_string$.getGlobalValue())) {
                        copula = Sequences.cconcatenate((SubLObject)answer.$str62$_, new SubLObject[] { copula, answer.$str62$_ });
                    }
                    factoid = Sequences.cconcatenate(focus, new SubLObject[] { copula, content });
                }
                else {
                    factoid = methods.funcall_instance_method_with_0_args(justification, (SubLObject)answer.$sym34$GET_CONTENT);
                }
                if (factoid.isString()) {
                    Dynamic.sublisp_throw((SubLObject)answer.$sym60$OUTER_CATCH_FOR_ANSWER_METHOD, factoid);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)answer.$sym60$OUTER_CATCH_FOR_ANSWER_METHOD, string_utilities.$empty_string$.getGlobalValue());
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_justification(self, justification);
                    set_answer_content(self, content);
                    set_answer_info_request(self, info_request);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym60$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 4507L)
    public static SubLObject answer_older_method(final SubLObject self, final SubLObject other_answer) {
        assert answer.NIL != answer_p(other_answer) : other_answer;
        final SubLObject this_date = methods.funcall_instance_method_with_0_args(self, (SubLObject)answer.$sym68$GET_DATE);
        final SubLObject other_date = methods.funcall_instance_method_with_0_args(other_answer, (SubLObject)answer.$sym68$GET_DATE);
        if (answer.NIL != date_utilities.date_p(this_date) && answer.NIL != date_utilities.date_p(other_date)) {
            return date_utilities.dateL(this_date, other_date);
        }
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 4924L)
    public static SubLObject answer_get_date_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = (SubLObject)answer.NIL;
        final SubLObject justification = get_answer_justification(self);
        try {
            thread.throwStack.push(answer.$sym71$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                if (answer.NIL != search_engine.abstract_passage_p(justification)) {
                    Dynamic.sublisp_throw((SubLObject)answer.$sym71$OUTER_CATCH_FOR_ANSWER_METHOD, methods.funcall_instance_method_with_0_args(justification, (SubLObject)answer.$sym72$GET_PUBLICATION_DATE));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_justification(self, justification);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym71$OUTER_CATCH_FOR_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject get_text_answer_augmentation_terms(final SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, (SubLObject)answer.NINE_INTEGER, (SubLObject)answer.$sym76$AUGMENTATION_TERMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject set_text_answer_augmentation_terms(final SubLObject text_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, (SubLObject)answer.NINE_INTEGER, (SubLObject)answer.$sym76$AUGMENTATION_TERMS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject get_text_answer_parse(final SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, (SubLObject)answer.EIGHT_INTEGER, (SubLObject)answer.$sym77$PARSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject set_text_answer_parse(final SubLObject text_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, (SubLObject)answer.EIGHT_INTEGER, (SubLObject)answer.$sym77$PARSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject get_text_answer_vector(final SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, (SubLObject)answer.SEVEN_INTEGER, (SubLObject)answer.$sym78$VECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject set_text_answer_vector(final SubLObject text_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, (SubLObject)answer.SEVEN_INTEGER, (SubLObject)answer.$sym78$VECTOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject subloop_reserved_initialize_text_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym9$INSTANCE_COUNT, (SubLObject)answer.ZERO_INTEGER);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject subloop_reserved_initialize_text_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym11$ISOLATED_P, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym12$INSTANCE_NUMBER, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym8$INFO_REQUEST, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym7$CONTENT, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym6$CONFIDENCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym5$RELEVANCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym4$JUSTIFICATION, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym3$INFO, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym78$VECTOR, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym77$PARSE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym76$AUGMENTATION_TERMS, (SubLObject)answer.NIL);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5176L)
    public static SubLObject text_answer_p(final SubLObject text_answer) {
        return classes.subloop_instanceof_class(text_answer, (SubLObject)answer.$sym74$TEXT_ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 5768L)
    public static SubLObject new_text_answer(final SubLObject info_request, final SubLObject string, final SubLObject justification, final SubLObject confidence, SubLObject v_parse_tree) {
        if (v_parse_tree == answer.UNPROVIDED) {
            v_parse_tree = (SubLObject)answer.NIL;
        }
        assert answer.NIL != search_engine.information_request_p(info_request) : info_request;
        assert answer.NIL != search_engine.information_p(justification) : justification;
        assert answer.NIL != Types.numberp(confidence) : confidence;
        final SubLObject v_answer = object.new_class_instance((SubLObject)answer.$sym74$TEXT_ANSWER);
        set_answer_info_request(v_answer, info_request);
        set_answer_content(v_answer, string);
        set_answer_justification(v_answer, justification);
        set_answer_confidence(v_answer, confidence);
        set_answer_info(v_answer, (SubLObject)ConsesLow.list((SubLObject)answer.$kw56$PARSE_TREE, v_parse_tree));
        set_text_answer_vector(v_answer, question.new_string_vector(string));
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 6435L)
    public static SubLObject text_answer_similarity_function_method(final SubLObject self) {
        return (SubLObject)answer.$sym86$TEXT_ANSWER_SIMILARITY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 6535L)
    public static SubLObject text_answer_require_similarity_method(final SubLObject self) {
        return (SubLObject)answer.$float90$0_3;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 6867L)
    public static SubLObject text_answer_typical_instance_method(final SubLObject self, final SubLObject answers) {
        assert answer.NIL != Types.listp(answers) : answers;
        SubLObject typical = answers.first();
        final SubLObject centroid = sparse_vector.svector_centroid(Mapping.mapcar((SubLObject)answer.$sym94$GET_TEXT_ANSWER_VECTOR, answers));
        final SubLObject centroid_length = sparse_vector.svector_length(centroid);
        if (!centroid_length.isZero()) {
            final SubLObject typical_vector = get_text_answer_vector(typical);
            SubLObject min_distance = scenario.safe_svector_cosine_angle(typical_vector, centroid, (SubLObject)answer.UNPROVIDED);
            SubLObject distance = (SubLObject)answer.NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = (SubLObject)answer.NIL;
            v_answer = cdolist_list_var.first();
            while (answer.NIL != cdolist_list_var) {
                final SubLObject answer_vector = get_text_answer_vector(v_answer);
                distance = scenario.safe_svector_cosine_angle(answer_vector, centroid, (SubLObject)answer.UNPROVIDED);
                if (distance.numG(min_distance)) {
                    min_distance = distance;
                    typical = v_answer;
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            }
        }
        return typical;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 7699L)
    public static SubLObject text_answer_select_method(final SubLObject self, final SubLObject answers) {
        assert answer.NIL != Types.listp(answers) : answers;
        final SubLObject require_percentage = methods.funcall_class_method_with_0_args(methods.funcall_instance_method_with_0_args(answers.first(), (SubLObject)answer.$sym30$GET_INFO_REQUEST), (SubLObject)answer.$sym98$REQUIRE_PERCENTAGE);
        final SubLObject require_similarity = methods.funcall_class_method_with_0_args(self, (SubLObject)answer.$sym88$REQUIRE_SIMILARITY);
        SubLObject typicals = (SubLObject)answer.NIL;
        SubLObject total_confidence = (SubLObject)answer.ZERO_INTEGER;
        SubLObject selected = (SubLObject)answer.NIL;
        final SubLObject similarity_function = (SubLObject)((answer.NIL != answers) ? methods.funcall_class_method_with_0_args(answers.first(), (SubLObject)answer.$sym84$SIMILARITY_FUNCTION) : answer.NIL);
        SubLObject cdolist_list_var = clustering.cluster(answers, similarity_function, (SubLObject)answer.ONE_INTEGER, require_similarity);
        SubLObject cluster = (SubLObject)answer.NIL;
        cluster = cdolist_list_var.first();
        while (answer.NIL != cdolist_list_var) {
            final SubLObject v_answer = methods.funcall_class_method_with_1_args(self, (SubLObject)answer.$sym92$TYPICAL_INSTANCE, methods.funcall_class_method_with_1_args(self, (SubLObject)answer.$sym14$MAX_INSTANCES, clustering.cluster_elements(cluster)));
            set_answer_relevance(v_answer, clustering.cluster_cardinality(cluster));
            typicals = (SubLObject)ConsesLow.cons(v_answer, typicals);
            total_confidence = Numbers.add(total_confidence, methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)answer.$sym19$GET_CONFIDENCE));
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        }
        final SubLObject stop_after_confidence = Numbers.multiply(Numbers.divide(total_confidence, (SubLObject)answer.$int99$100), require_percentage);
        SubLObject sofar_confidence = (SubLObject)answer.ZERO_INTEGER;
        SubLObject stopP = Numbers.numGE(sofar_confidence, stop_after_confidence);
        if (answer.NIL == stopP) {
            SubLObject csome_list_var = Sort.sort(typicals, (SubLObject)answer.$sym100$TEXT_ANSWER_BETTER, (SubLObject)answer.UNPROVIDED);
            SubLObject v_answer2 = (SubLObject)answer.NIL;
            v_answer2 = csome_list_var.first();
            while (answer.NIL == stopP && answer.NIL != csome_list_var) {
                selected = (SubLObject)ConsesLow.cons(v_answer2, selected);
                sofar_confidence = Numbers.add(sofar_confidence, methods.funcall_instance_method_with_0_args(v_answer2, (SubLObject)answer.$sym19$GET_CONFIDENCE));
                stopP = Numbers.numGE(sofar_confidence, stop_after_confidence);
                csome_list_var = csome_list_var.rest();
                v_answer2 = csome_list_var.first();
            }
        }
        return Sequences.nreverse(selected);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 9263L)
    public static SubLObject text_answer_better(final SubLObject answer1, final SubLObject answer2) {
        return methods.funcall_instance_method_with_0_args(answer1, (SubLObject)answer.$sym19$GET_CONFIDENCE).numE(methods.funcall_instance_method_with_0_args(answer2, (SubLObject)answer.$sym19$GET_CONFIDENCE)) ? Numbers.numG(methods.funcall_instance_method_with_0_args(answer1, (SubLObject)answer.$sym41$GET_RELEVANCE), methods.funcall_instance_method_with_0_args(answer2, (SubLObject)answer.$sym41$GET_RELEVANCE)) : Numbers.numG(methods.funcall_instance_method_with_0_args(answer1, (SubLObject)answer.$sym19$GET_CONFIDENCE), methods.funcall_instance_method_with_0_args(answer2, (SubLObject)answer.$sym19$GET_CONFIDENCE));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 9612L)
    public static SubLObject text_answer_set_confidence(final SubLObject answers) {
        assert answer.NIL != clustering.cluster_p(answers) : answers;
        SubLObject confidence = (SubLObject)answer.ZERO_INTEGER;
        SubLObject cdolist_list_var = clustering.cluster_elements(answers);
        SubLObject v_answer = (SubLObject)answer.NIL;
        v_answer = cdolist_list_var.first();
        while (answer.NIL != cdolist_list_var) {
            confidence = Numbers.add(confidence, methods.funcall_instance_method_with_0_args(v_answer, (SubLObject)answer.$sym19$GET_CONFIDENCE));
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        }
        return confidence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 9923L)
    public static SubLObject text_answer_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_answer_method = (SubLObject)answer.NIL;
        final SubLObject vector = get_text_answer_vector(self);
        try {
            thread.throwStack.push(answer.$sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD, vector);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_text_answer_vector(self, vector);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_text_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 10054L)
    public static SubLObject text_answer_similarity_method(final SubLObject self, final SubLObject ans1, final SubLObject ans2) {
        assert answer.NIL != text_answer_p(ans1) : ans1;
        assert answer.NIL != text_answer_p(ans2) : ans2;
        if (answer.NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(ans1, (SubLObject)answer.$sym34$GET_CONTENT), methods.funcall_instance_method_with_0_args(ans2, (SubLObject)answer.$sym34$GET_CONTENT), (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED)) {
            return (SubLObject)answer.ONE_INTEGER;
        }
        return scenario.safe_svector_cosine_angle(methods.funcall_instance_method_with_0_args(ans1, (SubLObject)answer.$sym103$GET_VECTOR), methods.funcall_instance_method_with_0_args(ans2, (SubLObject)answer.$sym103$GET_VECTOR), (SubLObject)answer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 10526L)
    public static SubLObject get_value_answer_interpreted_values(final SubLObject value_answer) {
        return classes.subloop_get_access_protected_instance_slot(value_answer, (SubLObject)answer.TEN_INTEGER, (SubLObject)answer.$sym114$INTERPRETED_VALUES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 10526L)
    public static SubLObject set_value_answer_interpreted_values(final SubLObject value_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(value_answer, value, (SubLObject)answer.TEN_INTEGER, (SubLObject)answer.$sym114$INTERPRETED_VALUES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 10526L)
    public static SubLObject subloop_reserved_initialize_value_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym9$INSTANCE_COUNT, (SubLObject)answer.ZERO_INTEGER);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 10526L)
    public static SubLObject subloop_reserved_initialize_value_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym11$ISOLATED_P, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym12$INSTANCE_NUMBER, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym8$INFO_REQUEST, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym7$CONTENT, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym6$CONFIDENCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym5$RELEVANCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym4$JUSTIFICATION, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym3$INFO, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym78$VECTOR, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym77$PARSE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym76$AUGMENTATION_TERMS, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym114$INTERPRETED_VALUES, (SubLObject)answer.NIL);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 10526L)
    public static SubLObject value_answer_p(final SubLObject value_answer) {
        return classes.subloop_instanceof_class(value_answer, (SubLObject)answer.$sym112$VALUE_ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 11755L)
    public static SubLObject new_value_answer(final SubLObject info_request, final SubLObject parse, final SubLObject justification, final SubLObject confidence, SubLObject cyc_interpretations) {
        if (cyc_interpretations == answer.UNPROVIDED) {
            cyc_interpretations = (SubLObject)answer.NIL;
        }
        assert answer.NIL != search_engine.information_request_p(info_request) : info_request;
        assert answer.NIL != parse_tree.parse_tree_p(parse) : parse;
        assert answer.NIL != search_engine.information_p(justification) : justification;
        assert answer.NIL != Types.numberp(confidence) : confidence;
        assert answer.NIL != Types.listp(cyc_interpretations) : cyc_interpretations;
        final SubLObject v_answer = object.new_class_instance((SubLObject)answer.$sym112$VALUE_ANSWER);
        set_answer_info_request(v_answer, info_request);
        set_answer_content(v_answer, string_utilities.string_substitute((SubLObject)answer.$str118$_, (SubLObject)answer.$str119$__RRB_, string_utilities.string_substitute((SubLObject)answer.$str120$_, (SubLObject)answer.$str121$_LRB__, methods.funcall_instance_method_with_0_args(parse, (SubLObject)answer.$sym122$GET_STRING), (SubLObject)answer.UNPROVIDED), (SubLObject)answer.UNPROVIDED));
        set_answer_justification(v_answer, justification);
        set_answer_confidence(v_answer, confidence);
        set_text_answer_parse(v_answer, parse);
        set_value_answer_interpreted_values(v_answer, cyc_interpretations);
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 12602L)
    public static SubLObject value_answer_similarity_function_method(final SubLObject self) {
        return (SubLObject)answer.$sym124$VALUE_ANSWER_SIMILARITY;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 12779L)
    public static SubLObject value_answer_get_interpreted_values_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_value_answer_method = (SubLObject)answer.NIL;
        final SubLObject interpreted_values = get_value_answer_interpreted_values(self);
        try {
            thread.throwStack.push(answer.$sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)answer.$sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD, interpreted_values);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_value_answer_interpreted_values(self, interpreted_values);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_value_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_value_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 12878L)
    public static SubLObject value_answer_similarity_method(final SubLObject self, final SubLObject ans1, final SubLObject ans2) {
        assert answer.NIL != value_answer_p(ans1) : ans1;
        assert answer.NIL != value_answer_p(ans2) : ans2;
        SubLObject max = (SubLObject)answer.ZERO_INTEGER;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ans1, (SubLObject)answer.$sym126$GET_INTERPRETED_VALUES);
        SubLObject iv1 = (SubLObject)answer.NIL;
        iv1 = cdolist_list_var.first();
        while (answer.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(ans2, (SubLObject)answer.$sym126$GET_INTERPRETED_VALUES);
            SubLObject iv2 = (SubLObject)answer.NIL;
            iv2 = cdolist_list_var_$1.first();
            while (answer.NIL != cdolist_list_var_$1) {
                final SubLObject value = amount_similarity(iv1, iv2);
                if (value.numG(max)) {
                    max = value;
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                iv2 = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            iv1 = cdolist_list_var.first();
        }
        return max;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 13429L)
    public static SubLObject value_answer_typical_instance_method(final SubLObject self, final SubLObject answers) {
        return list_utilities.random_element(answers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 13590L)
    public static SubLObject amount_similarity(final SubLObject amount1, final SubLObject amount2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)answer.NIL;
        SubLObject error_message = (SubLObject)answer.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)answer.$sym135$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject quotient = quantities.cyc_quotient(amount1, amount2);
                    if (quotient.isNumber() && quotient.numG((SubLObject)answer.ONE_INTEGER)) {
                        result = Numbers.invert(quotient);
                    }
                    else if (quotient.isNumber()) {
                        result = quotient;
                    }
                    else {
                        result = (SubLObject)answer.ZERO_INTEGER;
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)answer.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (answer.NIL != error_message) {
            result = (SubLObject)answer.ZERO_INTEGER;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 13997L)
    public static SubLObject subloop_reserved_initialize_sentence_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym9$INSTANCE_COUNT, (SubLObject)answer.ZERO_INTEGER);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 13997L)
    public static SubLObject subloop_reserved_initialize_sentence_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym11$ISOLATED_P, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.$sym12$INSTANCE_NUMBER, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym8$INFO_REQUEST, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym7$CONTENT, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym6$CONFIDENCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym5$RELEVANCE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym4$JUSTIFICATION, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym3$INFO, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym78$VECTOR, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym77$PARSE, (SubLObject)answer.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym76$AUGMENTATION_TERMS, (SubLObject)answer.NIL);
        return (SubLObject)answer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 13997L)
    public static SubLObject sentence_answer_p(final SubLObject sentence_answer) {
        return classes.subloop_instanceof_class(sentence_answer, (SubLObject)answer.$sym136$SENTENCE_ANSWER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 14241L)
    public static SubLObject new_sentence_answer(final SubLObject info_request, final SubLObject passage, final SubLObject confidence) {
        final SubLObject v_answer = object.new_class_instance((SubLObject)answer.$sym136$SENTENCE_ANSWER);
        set_answer_info_request(v_answer, info_request);
        set_answer_content(v_answer, methods.funcall_instance_method_with_0_args(passage, (SubLObject)answer.$sym34$GET_CONTENT));
        set_answer_justification(v_answer, passage);
        set_answer_confidence(v_answer, confidence);
        set_answer_relevance(v_answer, (SubLObject)answer.ONE_INTEGER);
        set_text_answer_vector(v_answer, question.new_string_vector(methods.funcall_instance_method_with_0_args(passage, (SubLObject)answer.$sym34$GET_CONTENT)));
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 14707L)
    public static SubLObject sentence_answer_require_similarity_method(final SubLObject self) {
        return (SubLObject)answer.$float90$0_3;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 15043L)
    public static SubLObject sentence_answer_typical_instance_method(final SubLObject self, final SubLObject answers) {
        return methods.funcall_class_method_with_1_args(self, (SubLObject)answer.$sym14$MAX_INSTANCES, answers).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 15250L)
    public static SubLObject sentence_answer_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sentence_answer_method = (SubLObject)answer.NIL;
        final SubLObject relevance = get_answer_relevance(self);
        final SubLObject confidence = get_answer_confidence(self);
        final SubLObject content = get_answer_content(self);
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push(answer.$sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD);
            try {
                streams_high.write_string((SubLObject)answer.$str145$__SENTENCE_ANSWER_for_, stream, (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED);
                print_high.prin1(info_request, stream);
                streams_high.write_string((SubLObject)answer.$str27$__, stream, (SubLObject)answer.UNPROVIDED, (SubLObject)answer.UNPROVIDED);
                print_high.prin1(content, stream);
                PrintLow.format(stream, (SubLObject)answer.$str28$____2F___2F_, confidence, relevance);
                Dynamic.sublisp_throw((SubLObject)answer.$sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)answer.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_answer_relevance(self, relevance);
                    set_answer_confidence(self, confidence);
                    set_answer_content(self, content);
                    set_answer_info_request(self, info_request);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_sentence_answer_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)answer.$sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sentence_answer_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 15593L)
    public static SubLObject text_answer_similarity(final SubLObject ans1, final SubLObject ans2) {
        assert answer.NIL != text_answer_p(ans1) : ans1;
        assert answer.NIL != text_answer_p(ans2) : ans2;
        return methods.funcall_class_method_with_2_args((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym107$SIMILARITY, ans1, ans2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 16018L)
    public static SubLObject value_answer_similarity(final SubLObject ans1, final SubLObject ans2) {
        assert answer.NIL != value_answer_p(ans1) : ans1;
        assert answer.NIL != value_answer_p(ans2) : ans2;
        return methods.funcall_class_method_with_2_args((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym107$SIMILARITY, ans1, ans2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/quirk/answer.lisp", position = 16391L)
    public static SubLObject find_subject_agreement(final SubLObject string) {
        assert answer.NIL != Types.stringp(string) : string;
        final SubLObject v_parser = methods.funcall_class_method_with_0_args((SubLObject)answer.$sym148$STANFORD_PARSER, (SubLObject)answer.$sym149$GET_PARSER);
        final SubLObject parse = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)answer.$sym77$PARSE, string);
        if (!answer.$kw150$NP.eql(methods.funcall_instance_method_with_0_args(parse, (SubLObject)answer.$sym151$GET_CATEGORY))) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        final SubLObject head = methods.funcall_instance_method_with_0_args(parse, (SubLObject)answer.$sym152$GET_HEAD);
        final SubLObject category = methods.funcall_instance_method_with_0_args(head, (SubLObject)answer.$sym151$GET_CATEGORY);
        if (category.eql((SubLObject)answer.$kw153$NNS)) {
            return (SubLObject)answer.$str154$are;
        }
        return (SubLObject)answer.$str155$is;
    }
    
    public static SubLObject declare_answer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_answer_info", "GET-ANSWER-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_answer_info", "SET-ANSWER-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_answer_justification", "GET-ANSWER-JUSTIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_answer_justification", "SET-ANSWER-JUSTIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_answer_relevance", "GET-ANSWER-RELEVANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_answer_relevance", "SET-ANSWER-RELEVANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_answer_confidence", "GET-ANSWER-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_answer_confidence", "SET-ANSWER-CONFIDENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_answer_content", "GET-ANSWER-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_answer_content", "SET-ANSWER-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_answer_info_request", "GET-ANSWER-INFO-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_answer_info_request", "SET-ANSWER-INFO-REQUEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_answer_class", "SUBLOOP-RESERVED-INITIALIZE-ANSWER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-ANSWER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_p", "ANSWER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_max_instances_method", "ANSWER-MAX-INSTANCES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_print_method", "ANSWER-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_info_request_method", "ANSWER-GET-INFO-REQUEST-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_content_method", "ANSWER-GET-CONTENT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_confidence_method", "ANSWER-GET-CONFIDENCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_relevance_method", "ANSWER-GET-RELEVANCE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_justify_method", "ANSWER-JUSTIFY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_info_method", "ANSWER-GET-INFO-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_parse_tree_method", "ANSWER-GET-PARSE-TREE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_natural_language_factoid_method", "ANSWER-NATURAL-LANGUAGE-FACTOID-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_older_method", "ANSWER-OLDER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "answer_get_date_method", "ANSWER-GET-DATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_text_answer_augmentation_terms", "GET-TEXT-ANSWER-AUGMENTATION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_text_answer_augmentation_terms", "SET-TEXT-ANSWER-AUGMENTATION-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_text_answer_parse", "GET-TEXT-ANSWER-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_text_answer_parse", "SET-TEXT-ANSWER-PARSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_text_answer_vector", "GET-TEXT-ANSWER-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_text_answer_vector", "SET-TEXT-ANSWER-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_text_answer_class", "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_text_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_p", "TEXT-ANSWER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "new_text_answer", "NEW-TEXT-ANSWER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_similarity_function_method", "TEXT-ANSWER-SIMILARITY-FUNCTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_require_similarity_method", "TEXT-ANSWER-REQUIRE-SIMILARITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_typical_instance_method", "TEXT-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_select_method", "TEXT-ANSWER-SELECT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_better", "TEXT-ANSWER-BETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_set_confidence", "TEXT-ANSWER-SET-CONFIDENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_get_vector_method", "TEXT-ANSWER-GET-VECTOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_similarity_method", "TEXT-ANSWER-SIMILARITY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "get_value_answer_interpreted_values", "GET-VALUE-ANSWER-INTERPRETED-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "set_value_answer_interpreted_values", "SET-VALUE-ANSWER-INTERPRETED-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_value_answer_class", "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_value_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "value_answer_p", "VALUE-ANSWER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "new_value_answer", "NEW-VALUE-ANSWER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "value_answer_similarity_function_method", "VALUE-ANSWER-SIMILARITY-FUNCTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "value_answer_get_interpreted_values_method", "VALUE-ANSWER-GET-INTERPRETED-VALUES-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "value_answer_similarity_method", "VALUE-ANSWER-SIMILARITY-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "value_answer_typical_instance_method", "VALUE-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "amount_similarity", "AMOUNT-SIMILARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_sentence_answer_class", "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "subloop_reserved_initialize_sentence_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "sentence_answer_p", "SENTENCE-ANSWER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "new_sentence_answer", "NEW-SENTENCE-ANSWER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "sentence_answer_require_similarity_method", "SENTENCE-ANSWER-REQUIRE-SIMILARITY-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "sentence_answer_typical_instance_method", "SENTENCE-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "sentence_answer_print_method", "SENTENCE-ANSWER-PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "text_answer_similarity", "TEXT-ANSWER-SIMILARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "value_answer_similarity", "VALUE-ANSWER-SIMILARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.quirk.answer", "find_subject_agreement", "FIND-SUBJECT-AGREEMENT", 1, 0, false);
        return (SubLObject)answer.NIL;
    }
    
    public static SubLObject init_answer_file() {
        return (SubLObject)answer.NIL;
    }
    
    public static SubLObject setup_answer_file() {
        classes.subloop_new_class((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym1$OBJECT, (SubLObject)answer.NIL, (SubLObject)answer.NIL, (SubLObject)answer.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym10$SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym13$SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE);
        subloop_reserved_initialize_answer_class((SubLObject)answer.$sym0$ANSWER);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym14$MAX_INSTANCES, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list16, (SubLObject)answer.$list17);
        methods.subloop_register_class_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym14$MAX_INSTANCES, (SubLObject)answer.$sym20$ANSWER_MAX_INSTANCES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym21$PRINT, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.$list23, (SubLObject)answer.$list24);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym21$PRINT, (SubLObject)answer.$sym29$ANSWER_PRINT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym30$GET_INFO_REQUEST, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list31);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym30$GET_INFO_REQUEST, (SubLObject)answer.$sym33$ANSWER_GET_INFO_REQUEST_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym34$GET_CONTENT, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list35);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym34$GET_CONTENT, (SubLObject)answer.$sym37$ANSWER_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym19$GET_CONFIDENCE, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list38);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym19$GET_CONFIDENCE, (SubLObject)answer.$sym40$ANSWER_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym41$GET_RELEVANCE, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list42);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym41$GET_RELEVANCE, (SubLObject)answer.$sym44$ANSWER_GET_RELEVANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym45$JUSTIFY, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list46);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym45$JUSTIFY, (SubLObject)answer.$sym48$ANSWER_JUSTIFY_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym49$GET_INFO, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list50);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym49$GET_INFO, (SubLObject)answer.$sym52$ANSWER_GET_INFO_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym53$GET_PARSE_TREE, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list54);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym53$GET_PARSE_TREE, (SubLObject)answer.$sym57$ANSWER_GET_PARSE_TREE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym58$NATURAL_LANGUAGE_FACTOID, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list59);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym58$NATURAL_LANGUAGE_FACTOID, (SubLObject)answer.$sym63$ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym64$OLDER, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list65, (SubLObject)answer.$list66);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym64$OLDER, (SubLObject)answer.$sym69$ANSWER_OLDER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym68$GET_DATE, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list70);
        methods.subloop_register_instance_method((SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.$sym68$GET_DATE, (SubLObject)answer.$sym73$ANSWER_GET_DATE_METHOD);
        classes.subloop_new_class((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym0$ANSWER, (SubLObject)answer.NIL, (SubLObject)answer.NIL, (SubLObject)answer.$list75);
        classes.class_set_implements_slot_listeners((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym79$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym80$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE);
        subloop_reserved_initialize_text_answer_class((SubLObject)answer.$sym74$TEXT_ANSWER);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym84$SIMILARITY_FUNCTION, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.NIL, (SubLObject)answer.$list85);
        methods.subloop_register_class_method((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym84$SIMILARITY_FUNCTION, (SubLObject)answer.$sym87$TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym88$REQUIRE_SIMILARITY, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.NIL, (SubLObject)answer.$list89);
        methods.subloop_register_class_method((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym88$REQUIRE_SIMILARITY, (SubLObject)answer.$sym91$TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym92$TYPICAL_INSTANCE, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list16, (SubLObject)answer.$list93);
        methods.subloop_register_class_method((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym92$TYPICAL_INSTANCE, (SubLObject)answer.$sym95$TEXT_ANSWER_TYPICAL_INSTANCE_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym96$SELECT, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list16, (SubLObject)answer.$list97);
        methods.subloop_register_class_method((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym96$SELECT, (SubLObject)answer.$sym101$TEXT_ANSWER_SELECT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym103$GET_VECTOR, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.NIL, (SubLObject)answer.$list104);
        methods.subloop_register_instance_method((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym103$GET_VECTOR, (SubLObject)answer.$sym106$TEXT_ANSWER_GET_VECTOR_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym107$SIMILARITY, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list108, (SubLObject)answer.$list109);
        methods.subloop_register_class_method((SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.$sym107$SIMILARITY, (SubLObject)answer.$sym111$TEXT_ANSWER_SIMILARITY_METHOD);
        classes.subloop_new_class((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.NIL, (SubLObject)answer.NIL, (SubLObject)answer.$list113);
        classes.class_set_implements_slot_listeners((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym115$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym116$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE);
        subloop_reserved_initialize_value_answer_class((SubLObject)answer.$sym112$VALUE_ANSWER);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym84$SIMILARITY_FUNCTION, (SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.NIL, (SubLObject)answer.$list123);
        methods.subloop_register_class_method((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym84$SIMILARITY_FUNCTION, (SubLObject)answer.$sym125$VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym126$GET_INTERPRETED_VALUES, (SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.NIL, (SubLObject)answer.$list127);
        methods.subloop_register_instance_method((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym126$GET_INTERPRETED_VALUES, (SubLObject)answer.$sym129$VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym107$SIMILARITY, (SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list108, (SubLObject)answer.$list130);
        methods.subloop_register_class_method((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym107$SIMILARITY, (SubLObject)answer.$sym132$VALUE_ANSWER_SIMILARITY_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym92$TYPICAL_INSTANCE, (SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list16, (SubLObject)answer.$list133);
        methods.subloop_register_class_method((SubLObject)answer.$sym112$VALUE_ANSWER, (SubLObject)answer.$sym92$TYPICAL_INSTANCE, (SubLObject)answer.$sym134$VALUE_ANSWER_TYPICAL_INSTANCE_METHOD);
        classes.subloop_new_class((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$sym74$TEXT_ANSWER, (SubLObject)answer.NIL, (SubLObject)answer.NIL, (SubLObject)answer.$list137);
        classes.class_set_implements_slot_listeners((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$sym138$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$sym139$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE);
        subloop_reserved_initialize_sentence_answer_class((SubLObject)answer.$sym136$SENTENCE_ANSWER);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym88$REQUIRE_SIMILARITY, (SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.NIL, (SubLObject)answer.$list89);
        methods.subloop_register_class_method((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$sym88$REQUIRE_SIMILARITY, (SubLObject)answer.$sym140$SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD);
        methods.methods_incorporate_class_method((SubLObject)answer.$sym92$TYPICAL_INSTANCE, (SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$list15, (SubLObject)answer.$list16, (SubLObject)answer.$list141);
        methods.subloop_register_class_method((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$sym92$TYPICAL_INSTANCE, (SubLObject)answer.$sym142$SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)answer.$sym21$PRINT, (SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$list22, (SubLObject)answer.$list23, (SubLObject)answer.$list143);
        methods.subloop_register_instance_method((SubLObject)answer.$sym136$SENTENCE_ANSWER, (SubLObject)answer.$sym21$PRINT, (SubLObject)answer.$sym146$SENTENCE_ANSWER_PRINT_METHOD);
        return (SubLObject)answer.NIL;
    }
    
    public void declareFunctions() {
        declare_answer_file();
    }
    
    public void initializeVariables() {
        init_answer_file();
    }
    
    public void runTopLevelForms() {
        setup_answer_file();
    }
    
    static {
        me = (SubLFile)new answer();
        $sym0$ANSWER = SubLObjectFactory.makeSymbol("ANSWER");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELEVANCE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFO"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CANDIDATES")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INFO-REQUEST"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-RELEVANCE"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFY"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NATURAL-LANGUAGE-FACTOID"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("OLDER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-ANSWER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DATE"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym3$INFO = SubLObjectFactory.makeSymbol("INFO");
        $sym4$JUSTIFICATION = SubLObjectFactory.makeSymbol("JUSTIFICATION");
        $sym5$RELEVANCE = SubLObjectFactory.makeSymbol("RELEVANCE");
        $sym6$CONFIDENCE = SubLObjectFactory.makeSymbol("CONFIDENCE");
        $sym7$CONTENT = SubLObjectFactory.makeSymbol("CONTENT");
        $sym8$INFO_REQUEST = SubLObjectFactory.makeSymbol("INFO-REQUEST");
        $sym9$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym10$SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANSWER-CLASS");
        $sym11$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym12$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym13$SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANSWER-INSTANCE");
        $sym14$MAX_INSTANCES = SubLObjectFactory.makeSymbol("MAX-INSTANCES");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANSWERS listp\n    @return answer-p; the highest scoring answer among ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE"), (SubLObject)answer.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX-ANSWERS"), (SubLObject)answer.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE"))), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE"))), (SubLObject)SubLObjectFactory.makeSymbol("MAX-SCORE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-ANSWERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-ANSWERS"))));
        $sym18$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym19$GET_CONFIDENCE = SubLObjectFactory.makeSymbol("GET-CONFIDENCE");
        $sym20$ANSWER_MAX_INSTANCES_METHOD = SubLObjectFactory.makeSymbol("ANSWER-MAX-INSTANCES-METHOD");
        $sym21$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this answer to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<ANSWER for "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(" (~,2F/~,2F)"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym25$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $str26$__ANSWER_for_ = SubLObjectFactory.makeString("#<ANSWER for ");
        $str27$__ = SubLObjectFactory.makeString(": ");
        $str28$____2F___2F_ = SubLObjectFactory.makeString(" (~,2F/~,2F)");
        $sym29$ANSWER_PRINT_METHOD = SubLObjectFactory.makeSymbol("ANSWER-PRINT-METHOD");
        $sym30$GET_INFO_REQUEST = SubLObjectFactory.makeSymbol("GET-INFO-REQUEST");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return object; the info-request of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST")));
        $sym32$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym33$ANSWER_GET_INFO_REQUEST_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-INFO-REQUEST-METHOD");
        $sym34$GET_CONTENT = SubLObjectFactory.makeSymbol("GET-CONTENT");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return object; the string of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")));
        $sym36$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym37$ANSWER_GET_CONTENT_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-CONTENT-METHOD");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return non-negative-integer-p; the confidence of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE")));
        $sym39$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym40$ANSWER_GET_CONFIDENCE_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-CONFIDENCE-METHOD");
        $sym41$GET_RELEVANCE = SubLObjectFactory.makeSymbol("GET-RELEVANCE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return non-negative-integer-p; the relevance of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANCE")));
        $sym43$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym44$ANSWER_GET_RELEVANCE_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-RELEVANCE-METHOD");
        $sym45$JUSTIFY = SubLObjectFactory.makeSymbol("JUSTIFY");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return passage; the justification of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")));
        $sym47$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym48$ANSWER_JUSTIFY_METHOD = SubLObjectFactory.makeSymbol("ANSWER-JUSTIFY-METHOD");
        $sym49$GET_INFO = SubLObjectFactory.makeSymbol("GET-INFO");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return passage; the info slot of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INFO")));
        $sym51$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym52$ANSWER_GET_INFO_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-INFO-METHOD");
        $sym53$GET_PARSE_TREE = SubLObjectFactory.makeSymbol("GET-PARSE-TREE");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return passage; the parse-tree of this answer, if there is one"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETF"), (SubLObject)SubLObjectFactory.makeSymbol("INFO"), (SubLObject)SubLObjectFactory.makeKeyword("PARSE-TREE"))));
        $sym55$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $kw56$PARSE_TREE = SubLObjectFactory.makeKeyword("PARSE-TREE");
        $sym57$ANSWER_GET_PARSE_TREE_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-PARSE-TREE-METHOD");
        $sym58$NATURAL_LANGUAGE_FACTOID = SubLObjectFactory.makeSymbol("NATURAL-LANGUAGE-FACTOID");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return stringp; a simple string stating the answer, whenever possible, in the form\n  of a truth-bearing sentence. For example, the sentence 'Kofi Annan is\n  the UN Secretary General' in response to the question 'who is Kofi Annan?'\n  @owner bertolo."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA"), (SubLObject)SubLObjectFactory.makeSymbol("FACTOID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINITIONAL-QUESTION-P"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-KEYSTRINGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-SUBJECT-AGREEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)answer.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("COPULA"), (SubLObject)SubLObjectFactory.makeSymbol("*EMPTY-STRING*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeString(" "), (SubLObject)SubLObjectFactory.makeSymbol("COPULA"), (SubLObject)SubLObjectFactory.makeString(" ")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FACTOID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("FOCUS"), (SubLObject)SubLObjectFactory.makeSymbol("COPULA"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)answer.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FACTOID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"), (SubLObject)SubLObjectFactory.makeSymbol("FACTOID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("FACTOID")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("*EMPTY-STRING*")))));
        $sym60$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym61$GET_KEYSTRINGS = SubLObjectFactory.makeSymbol("GET-KEYSTRINGS");
        $str62$_ = SubLObjectFactory.makeString(" ");
        $sym63$ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD = SubLObjectFactory.makeSymbol("ANSWER-NATURAL-LANGUAGE-FACTOID-METHOD");
        $sym64$OLDER = SubLObjectFactory.makeSymbol("OLDER");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-ANSWER"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param OTHER-ANSWER, answer-p\n   @return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.\n   @owner bertolo."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THIS-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DATE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-DATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-DATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-DATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE-P"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-DATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE<"), (SubLObject)SubLObjectFactory.makeSymbol("THIS-DATE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-DATE"))))));
        $sym67$ANSWER_P = SubLObjectFactory.makeSymbol("ANSWER-P");
        $sym68$GET_DATE = SubLObjectFactory.makeSymbol("GET-DATE");
        $sym69$ANSWER_OLDER_METHOD = SubLObjectFactory.makeSymbol("ANSWER-OLDER-METHOD");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return date-p, the publication date of the source on which this answer depends.\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ABSTRACT-PASSAGE-P"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("JUSTIFICATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE"))))));
        $sym71$OUTER_CATCH_FOR_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");
        $sym72$GET_PUBLICATION_DATE = SubLObjectFactory.makeSymbol("GET-PUBLICATION-DATE");
        $sym73$ANSWER_GET_DATE_METHOD = SubLObjectFactory.makeSymbol("ANSWER-GET-DATE-METHOD");
        $sym74$TEXT_ANSWER = SubLObjectFactory.makeSymbol("TEXT-ANSWER");
        $list75 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELECT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY-FUNCTION"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym76$AUGMENTATION_TERMS = SubLObjectFactory.makeSymbol("AUGMENTATION-TERMS");
        $sym77$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym78$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $sym79$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-CLASS");
        $sym80$SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-INSTANCE");
        $sym81$INFORMATION_REQUEST_P = SubLObjectFactory.makeSymbol("INFORMATION-REQUEST-P");
        $sym82$INFORMATION_P = SubLObjectFactory.makeSymbol("INFORMATION-P");
        $sym83$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym84$SIMILARITY_FUNCTION = SubLObjectFactory.makeSymbol("SIMILARITY-FUNCTION");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-ANSWER-SIMILARITY"))));
        $sym86$TEXT_ANSWER_SIMILARITY = SubLObjectFactory.makeSymbol("TEXT-ANSWER-SIMILARITY");
        $sym87$TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD = SubLObjectFactory.makeSymbol("TEXT-ANSWER-SIMILARITY-FUNCTION-METHOD");
        $sym88$REQUIRE_SIMILARITY = SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return positive-number-p; a value between 0 and 1 that specifies a minimal \n   similarity that is required for two answers to end up in the same cluster\n   during answer clustering. A low number implies few clusters, a high number\n   many clusters"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeDouble(0.3)));
        $float90$0_3 = (SubLFloat)SubLObjectFactory.makeDouble(0.3);
        $sym91$TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD = SubLObjectFactory.makeSymbol("TEXT-ANSWER-REQUIRE-SIMILARITY-METHOD");
        $sym92$TYPICAL_INSTANCE = SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CENTROID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SVECTOR-CENTROID"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPCAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TEXT-ANSWER-VECTOR")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CENTROID-LENGTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SVECTOR-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ZEROP"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID-LENGTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TEXT-ANSWER-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MIN-DISTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID"))), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-TEXT-ANSWER-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("CENTROID"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-DISTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MIN-DISTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("DISTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL"))));
        $sym94$GET_TEXT_ANSWER_VECTOR = SubLObjectFactory.makeSymbol("GET-TEXT-ANSWER-VECTOR");
        $sym95$TEXT_ANSWER_TYPICAL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("TEXT-ANSWER-TYPICAL-INSTANCE-METHOD");
        $sym96$SELECT = SubLObjectFactory.makeSymbol("SELECT");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANSWERS listp;\n     @return listp; the list of conses of the most salient answers among ANSWERS \n     and their confidences, ranked by their salientness"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INFO-REQUEST"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPICALS"), (SubLObject)answer.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOTAL-CONFIDENCE"), (SubLObject)answer.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECTED"), (SubLObject)answer.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY-FUNCTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY-FUNCTION")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"), (SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY-FUNCTION"), (SubLObject)answer.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-INSTANCES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-ELEMENTS"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ANSWER-RELEVANCE"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLUSTER-CARDINALITY"), (SubLObject)SubLObjectFactory.makeSymbol("CLUSTER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-CONFIDENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP-AFTER-CONFIDENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeInteger(100)), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOFAR-CONFIDENCE"), (SubLObject)answer.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STOP?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("SOFAR-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-AFTER-CONFIDENCE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SORT"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-ANSWER-BETTER"))), (SubLObject)SubLObjectFactory.makeSymbol("STOP?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)SubLObjectFactory.makeSymbol("SELECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("SOFAR-CONFIDENCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONFIDENCE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STOP?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("SOFAR-CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-AFTER-CONFIDENCE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("SELECTED")))));
        $sym98$REQUIRE_PERCENTAGE = SubLObjectFactory.makeSymbol("REQUIRE-PERCENTAGE");
        $int99$100 = SubLObjectFactory.makeInteger(100);
        $sym100$TEXT_ANSWER_BETTER = SubLObjectFactory.makeSymbol("TEXT-ANSWER-BETTER");
        $sym101$TEXT_ANSWER_SELECT_METHOD = SubLObjectFactory.makeSymbol("TEXT-ANSWER-SELECT-METHOD");
        $sym102$CLUSTER_P = SubLObjectFactory.makeSymbol("CLUSTER-P");
        $sym103$GET_VECTOR = SubLObjectFactory.makeSymbol("GET-VECTOR");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return svector-p; the word vector of this answer"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VECTOR")));
        $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-ANSWER-METHOD");
        $sym106$TEXT_ANSWER_GET_VECTOR_METHOD = SubLObjectFactory.makeSymbol("TEXT-ANSWER-GET-VECTOR-METHOD");
        $sym107$SIMILARITY = SubLObjectFactory.makeSymbol("SIMILARITY");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING="), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-CONTENT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)answer.ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-VECTOR"))))));
        $sym110$TEXT_ANSWER_P = SubLObjectFactory.makeSymbol("TEXT-ANSWER-P");
        $sym111$TEXT_ANSWER_SIMILARITY_METHOD = SubLObjectFactory.makeSymbol("TEXT-ANSWER-SIMILARITY-METHOD");
        $sym112$VALUE_ANSWER = SubLObjectFactory.makeSymbol("VALUE-ANSWER");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERPRETED-VALUES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SIMILARITY-FUNCTION"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERPRETED-VALUES"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym114$INTERPRETED_VALUES = SubLObjectFactory.makeSymbol("INTERPRETED-VALUES");
        $sym115$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-CLASS");
        $sym116$SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-INSTANCE");
        $sym117$PARSE_TREE_P = SubLObjectFactory.makeSymbol("PARSE-TREE-P");
        $str118$_ = SubLObjectFactory.makeString(")");
        $str119$__RRB_ = SubLObjectFactory.makeString(" -RRB-");
        $str120$_ = SubLObjectFactory.makeString("(");
        $str121$_LRB__ = SubLObjectFactory.makeString("-LRB- ");
        $sym122$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return symbolp; the similarity function used to compare value-answers"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-ANSWER-SIMILARITY"))));
        $sym124$VALUE_ANSWER_SIMILARITY = SubLObjectFactory.makeSymbol("VALUE-ANSWER-SIMILARITY");
        $sym125$VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD = SubLObjectFactory.makeSymbol("VALUE-ANSWER-SIMILARITY-FUNCTION-METHOD");
        $sym126$GET_INTERPRETED_VALUES = SubLObjectFactory.makeSymbol("GET-INTERPRETED-VALUES");
        $list127 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPRETED-VALUES")));
        $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-VALUE-ANSWER-METHOD");
        $sym129$VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD = SubLObjectFactory.makeSymbol("VALUE-ANSWER-GET-INTERPRETED-VALUES-METHOD");
        $list130 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-ANSWER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)answer.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IV1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANS1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERPRETED-VALUES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IV2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("ANS2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INTERPRETED-VALUES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AMOUNT-SIMILARITY"), (SubLObject)SubLObjectFactory.makeSymbol("IV1"), (SubLObject)SubLObjectFactory.makeSymbol("IV2")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"))));
        $sym131$VALUE_ANSWER_P = SubLObjectFactory.makeSymbol("VALUE-ANSWER-P");
        $sym132$VALUE_ANSWER_SIMILARITY_METHOD = SubLObjectFactory.makeSymbol("VALUE-ANSWER-SIMILARITY-METHOD");
        $list133 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RANDOM-ELEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS"))));
        $sym134$VALUE_ANSWER_TYPICAL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("VALUE-ANSWER-TYPICAL-INSTANCE-METHOD");
        $sym135$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym136$SENTENCE_ANSWER = SubLObjectFactory.makeSymbol("SENTENCE-ANSWER");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRE-SIMILARITY"), (SubLObject)answer.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TYPICAL-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym138$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-CLASS");
        $sym139$SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-INSTANCE");
        $sym140$SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD = SubLObjectFactory.makeSymbol("SENTENCE-ANSWER-REQUIRE-SIMILARITY-METHOD");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param ANSWERS listp\n   @return answer-p; the most typical answer among ANSWERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FCM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-INSTANCES")), (SubLObject)SubLObjectFactory.makeSymbol("ANSWERS")))));
        $sym142$SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("SENTENCE-ANSWER-TYPICAL-INSTANCE-METHOD");
        $list143 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Prints this answer to STREAM, ignoring DEPTH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString("#<SENTENCE-ANSWER for "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("INFO-REQUEST"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-STRING"), (SubLObject)SubLObjectFactory.makeString(": "), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIN1"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString(" (~,2F/~,2F)"), (SubLObject)SubLObjectFactory.makeSymbol("CONFIDENCE"), (SubLObject)SubLObjectFactory.makeSymbol("RELEVANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SENTENCE-ANSWER-METHOD");
        $str145$__SENTENCE_ANSWER_for_ = SubLObjectFactory.makeString("#<SENTENCE-ANSWER for ");
        $sym146$SENTENCE_ANSWER_PRINT_METHOD = SubLObjectFactory.makeSymbol("SENTENCE-ANSWER-PRINT-METHOD");
        $sym147$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym148$STANFORD_PARSER = SubLObjectFactory.makeSymbol("STANFORD-PARSER");
        $sym149$GET_PARSER = SubLObjectFactory.makeSymbol("GET-PARSER");
        $kw150$NP = SubLObjectFactory.makeKeyword("NP");
        $sym151$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $sym152$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $kw153$NNS = SubLObjectFactory.makeKeyword("NNS");
        $str154$are = SubLObjectFactory.makeString("are");
        $str155$is = SubLObjectFactory.makeString("is");
    }
}

/*

	Total time: 414 ms
	
*/