package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_slurpers extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexicon_slurpers";
    public static final String myFingerPrint = "48de595decd3832f167897097624b0dd45b0326fb85c4335038feec2edc36470";
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3948L)
    private static SubLSymbol $lexicon_slurper$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6248L)
    private static SubLSymbol $arc_lexicon_slurper$;
    private static final SubLSymbol $sym0$LEXICON_SLURPER_FILTER;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$GENLS_FILTERS;
    private static final SubLSymbol $sym4$ISA_FILTERS;
    private static final SubLSymbol $sym5$INSTANCE_COUNT;
    private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS;
    private static final SubLSymbol $sym7$ISOLATED_P;
    private static final SubLSymbol $sym8$INSTANCE_NUMBER;
    private static final SubLSymbol $sym9$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE;
    private static final SubLSymbol $sym10$MERGE;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD;
    private static final SubLSymbol $sym15$LEXICON_SLURPER_FILTER_P;
    private static final SubLSymbol $sym16$LEXICON_SLURPER_FILTER_MERGE_METHOD;
    private static final SubLSymbol $sym17$APPROVE;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD;
    private static final SubLSymbol $sym21$LEX_ENTRY_P;
    private static final SubLSymbol $sym22$GET;
    private static final SubLSymbol $kw23$DENOT;
    private static final SubLSymbol $sym24$LEXICON_SLURPER_FILTER_APPROVE_METHOD;
    private static final SubLSymbol $sym25$PROPRIETARY_SLURPER_FILTER;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS;
    private static final SubLSymbol $sym28$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE;
    private static final SubLSymbol $sym29$INITIALIZE;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym35$PERSON_SLURPER_FILTER;
    private static final SubLSymbol $sym36$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS;
    private static final SubLSymbol $sym37$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$PERSON_SLURPER_FILTER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym42$ARC_SLURPER_FILTER;
    private static final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS;
    private static final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$ARC_SLURPER_FILTER_INITIALIZE_METHOD;
    private static final SubLSymbol $sym47$LEXICON_SLURPER;
    private static final SubLSymbol $sym48$HAS_NEXT;
    private static final SubLSymbol $sym49$NEXT;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CURRENT_KEY_VALUE;
    private static final SubLSymbol $sym52$SLURPER_FILTER;
    private static final SubLSymbol $sym53$LEXICON_ITERATOR;
    private static final SubLSymbol $sym54$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS;
    private static final SubLSymbol $sym55$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD;
    private static final SubLSymbol $sym58$QUIRK_LEXICON;
    private static final SubLSymbol $sym59$LEXICON_SLURPER_INITIALIZE_METHOD;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$LEXICON_SLURPER_HAS_NEXT_METHOD;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD;
    private static final SubLSymbol $sym65$LEXICON_SLURPER_NEXT_METHOD;
    private static final SubLSymbol $sym66$ARC_LEXICON_SLURPER;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$HEAD_VALUE;
    private static final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS;
    private static final SubLSymbol $sym70$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE;
    private static final SubLList $list71;
    private static final SubLSymbol $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD;
    private static final SubLSymbol $sym73$ARC_LEXICON_SLURPER_INITIALIZE_METHOD;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD;
    private static final SubLSymbol $kw76$STRING;
    private static final SubLSymbol $sym77$ARC_LEXICON_SLURPER_NEXT_METHOD;
    private static final SubLString $str78$;
    private static final SubLString $str79$_;
    private static final SubLSymbol $kw80$CYC_POS;
    private static final SubLSymbol $kw81$INFLECTIONS;
    private static final SubLSymbol $kw82$NP;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject get_lexicon_slurper_filter_genls_filters(final SubLObject lexicon_slurper_filter) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper_filter, (SubLObject)lexicon_slurpers.TWO_INTEGER, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject set_lexicon_slurper_filter_genls_filters(final SubLObject lexicon_slurper_filter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper_filter, value, (SubLObject)lexicon_slurpers.TWO_INTEGER, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject get_lexicon_slurper_filter_isa_filters(final SubLObject lexicon_slurper_filter) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper_filter, (SubLObject)lexicon_slurpers.ONE_INTEGER, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject set_lexicon_slurper_filter_isa_filters(final SubLObject lexicon_slurper_filter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper_filter, value, (SubLObject)lexicon_slurpers.ONE_INTEGER, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject subloop_reserved_initialize_lexicon_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym5$INSTANCE_COUNT, (SubLObject)lexicon_slurpers.ZERO_INTEGER);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject subloop_reserved_initialize_lexicon_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym7$ISOLATED_P, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym8$INSTANCE_NUMBER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2151L)
    public static SubLObject lexicon_slurper_filter_p(final SubLObject lexicon_slurper_filter) {
        return classes.subloop_instanceof_class(lexicon_slurper_filter, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2454L)
    public static SubLObject lexicon_slurper_filter_merge_method(final SubLObject self, final SubLObject other_filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_filter_method = (SubLObject)lexicon_slurpers.NIL;
        SubLObject genls_filters = get_lexicon_slurper_filter_genls_filters(self);
        SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
            try {
                assert lexicon_slurpers.NIL != lexicon_slurper_filter_p(other_filter) : other_filter;
                isa_filters = conses_high.union(isa_filters, instances.get_slot(other_filter, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS), (SubLObject)lexicon_slurpers.UNPROVIDED, (SubLObject)lexicon_slurpers.UNPROVIDED);
                genls_filters = conses_high.union(genls_filters, instances.get_slot(other_filter, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS), (SubLObject)lexicon_slurpers.UNPROVIDED, (SubLObject)lexicon_slurpers.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_filter_genls_filters(self, genls_filters);
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_filter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 2761L)
    public static SubLObject lexicon_slurper_filter_approve_method(final SubLObject self, final SubLObject lex_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_filter_method = (SubLObject)lexicon_slurpers.NIL;
        final SubLObject genls_filters = get_lexicon_slurper_filter_genls_filters(self);
        final SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
            try {
                assert lexicon_slurpers.NIL != abstract_lexicon.lex_entry_p(lex_entry) : lex_entry;
                final SubLObject denot = methods.funcall_instance_method_with_1_args(lex_entry, (SubLObject)lexicon_slurpers.$sym22$GET, (SubLObject)lexicon_slurpers.$kw23$DENOT);
                SubLObject fail = (SubLObject)lexicon_slurpers.NIL;
                if (lexicon_slurpers.NIL == fail) {
                    SubLObject csome_list_var = isa_filters;
                    SubLObject collection = (SubLObject)lexicon_slurpers.NIL;
                    collection = csome_list_var.first();
                    while (lexicon_slurpers.NIL == fail && lexicon_slurpers.NIL != csome_list_var) {
                        if (lexicon_slurpers.NIL != isa.isa_in_any_mtP(denot, collection)) {
                            fail = (SubLObject)lexicon_slurpers.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        collection = csome_list_var.first();
                    }
                }
                if (lexicon_slurpers.NIL == fail) {
                    if (lexicon_slurpers.NIL == fail) {
                        SubLObject csome_list_var = genls_filters;
                        SubLObject collection = (SubLObject)lexicon_slurpers.NIL;
                        collection = csome_list_var.first();
                        while (lexicon_slurpers.NIL == fail && lexicon_slurpers.NIL != csome_list_var) {
                            if (lexicon_slurpers.NIL != genls.genl_in_any_mtP(denot, collection)) {
                                fail = (SubLObject)lexicon_slurpers.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            collection = csome_list_var.first();
                        }
                    }
                    Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD, (SubLObject)SubLObjectFactory.makeBoolean(lexicon_slurpers.NIL == fail));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_filter_genls_filters(self, genls_filters);
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_filter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3188L)
    public static SubLObject subloop_reserved_initialize_proprietary_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym5$INSTANCE_COUNT, (SubLObject)lexicon_slurpers.ZERO_INTEGER);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3188L)
    public static SubLObject subloop_reserved_initialize_proprietary_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym7$ISOLATED_P, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym8$INSTANCE_NUMBER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3188L)
    public static SubLObject proprietary_slurper_filter_p(final SubLObject proprietary_slurper_filter) {
        return classes.subloop_instanceof_class(proprietary_slurper_filter, (SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3342L)
    public static SubLObject proprietary_slurper_filter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_proprietary_slurper_filter_method = (SubLObject)lexicon_slurpers.NIL;
        SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD);
            try {
                object.object_initialize_method(self);
                isa_filters = (SubLObject)lexicon_slurpers.$list33;
                Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_proprietary_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_proprietary_slurper_filter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3500L)
    public static SubLObject subloop_reserved_initialize_person_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym5$INSTANCE_COUNT, (SubLObject)lexicon_slurpers.ZERO_INTEGER);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3500L)
    public static SubLObject subloop_reserved_initialize_person_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym7$ISOLATED_P, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym8$INSTANCE_NUMBER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3500L)
    public static SubLObject person_slurper_filter_p(final SubLObject person_slurper_filter) {
        return classes.subloop_instanceof_class(person_slurper_filter, (SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3572L)
    public static SubLObject person_slurper_filter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_person_slurper_filter_method = (SubLObject)lexicon_slurpers.NIL;
        SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD);
            try {
                object.object_initialize_method(self);
                isa_filters = (SubLObject)lexicon_slurpers.$list40;
                Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_person_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_person_slurper_filter_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3712L)
    public static SubLObject subloop_reserved_initialize_arc_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym5$INSTANCE_COUNT, (SubLObject)lexicon_slurpers.ZERO_INTEGER);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3712L)
    public static SubLObject subloop_reserved_initialize_arc_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym7$ISOLATED_P, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym8$INSTANCE_NUMBER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym4$ISA_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym3$GENLS_FILTERS, (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3712L)
    public static SubLObject arc_slurper_filter_p(final SubLObject arc_slurper_filter) {
        return classes.subloop_instanceof_class(arc_slurper_filter, (SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 3781L)
    public static SubLObject arc_slurper_filter_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        methods.funcall_instance_method_with_1_args(self, (SubLObject)lexicon_slurpers.$sym10$MERGE, object.new_class_instance((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER));
        return self;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4175L)
    public static SubLObject get_lexicon_slurper() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_slurpers.NIL == lexicon_slurpers.$lexicon_slurper$.getDynamicValue(thread)) {
            lexicon_slurpers.$lexicon_slurper$.setDynamicValue(object.new_class_instance((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER), thread);
        }
        return lexicon_slurpers.$lexicon_slurper$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4340L)
    public static SubLObject has_next_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_lexicon_slurper(), (SubLObject)lexicon_slurpers.$sym48$HAS_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4577L)
    public static SubLObject next_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_lexicon_slurper(), (SubLObject)lexicon_slurpers.$sym49$NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 4860L)
    public static SubLObject reset_lexicon_slurper() {
        lexicon_slurpers.$lexicon_slurper$.setDynamicValue((SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject get_lexicon_slurper_current_key_value(final SubLObject lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper, (SubLObject)lexicon_slurpers.THREE_INTEGER, (SubLObject)lexicon_slurpers.$sym51$CURRENT_KEY_VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject set_lexicon_slurper_current_key_value(final SubLObject lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper, value, (SubLObject)lexicon_slurpers.THREE_INTEGER, (SubLObject)lexicon_slurpers.$sym51$CURRENT_KEY_VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject get_lexicon_slurper_slurper_filter(final SubLObject lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper, (SubLObject)lexicon_slurpers.TWO_INTEGER, (SubLObject)lexicon_slurpers.$sym52$SLURPER_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject set_lexicon_slurper_slurper_filter(final SubLObject lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper, value, (SubLObject)lexicon_slurpers.TWO_INTEGER, (SubLObject)lexicon_slurpers.$sym52$SLURPER_FILTER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject get_lexicon_slurper_lexicon_iterator(final SubLObject lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper, (SubLObject)lexicon_slurpers.ONE_INTEGER, (SubLObject)lexicon_slurpers.$sym53$LEXICON_ITERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject set_lexicon_slurper_lexicon_iterator(final SubLObject lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper, value, (SubLObject)lexicon_slurpers.ONE_INTEGER, (SubLObject)lexicon_slurpers.$sym53$LEXICON_ITERATOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject subloop_reserved_initialize_lexicon_slurper_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym5$INSTANCE_COUNT, (SubLObject)lexicon_slurpers.ZERO_INTEGER);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject subloop_reserved_initialize_lexicon_slurper_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym7$ISOLATED_P, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym8$INSTANCE_NUMBER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym53$LEXICON_ITERATOR, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym52$SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym51$CURRENT_KEY_VALUE, (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5052L)
    public static SubLObject lexicon_slurper_p(final SubLObject lexicon_slurper) {
        return classes.subloop_instanceof_class(lexicon_slurper, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5387L)
    public static SubLObject lexicon_slurper_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_method = (SubLObject)lexicon_slurpers.NIL;
        SubLObject slurper_filter = get_lexicon_slurper_slurper_filter(self);
        SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
            try {
                object.object_initialize_method(self);
                lexicon_iterator = abstract_lexicon.new_lexicon_iterator(object.new_class_instance((SubLObject)lexicon_slurpers.$sym58$QUIRK_LEXICON));
                slurper_filter = object.new_class_instance((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER);
                Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_slurper_filter(self, slurper_filter);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 5704L)
    public static SubLObject lexicon_slurper_has_next_method(final SubLObject self) {
        instances.set_slot(self, (SubLObject)lexicon_slurpers.$sym51$CURRENT_KEY_VALUE, methods.funcall_instance_method_with_0_args(self, (SubLObject)lexicon_slurpers.$sym49$NEXT));
        if (lexicon_slurpers.NIL != instances.get_slot(self, (SubLObject)lexicon_slurpers.$sym51$CURRENT_KEY_VALUE)) {
            return (SubLObject)lexicon_slurpers.T;
        }
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6021L)
    public static SubLObject lexicon_slurper_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_method = (SubLObject)lexicon_slurpers.NIL;
        final SubLObject slurper_filter = get_lexicon_slurper_slurper_filter(self);
        final SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
            try {
                SubLObject entry = (SubLObject)lexicon_slurpers.NIL;
                for (SubLObject approved = (SubLObject)lexicon_slurpers.NIL; lexicon_slurpers.NIL == approved; approved = methods.funcall_instance_method_with_0_args(slurper_filter, (SubLObject)lexicon_slurpers.$sym17$APPROVE)) {
                    entry = iteration.iteration_next(lexicon_iterator);
                }
                Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD, entry);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_slurper_filter(self, slurper_filter);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6536L)
    public static SubLObject get_arc_lexicon_slurper() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexicon_slurpers.NIL == lexicon_slurpers.$arc_lexicon_slurper$.getDynamicValue(thread)) {
            lexicon_slurpers.$arc_lexicon_slurper$.setDynamicValue(object.new_class_instance((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER), thread);
        }
        return lexicon_slurpers.$arc_lexicon_slurper$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6721L)
    public static SubLObject has_next_arc_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_arc_lexicon_slurper(), (SubLObject)lexicon_slurpers.$sym48$HAS_NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 6970L)
    public static SubLObject next_arc_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_arc_lexicon_slurper(), (SubLObject)lexicon_slurpers.$sym49$NEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7417L)
    public static SubLObject reset_arc_lexicon_slurper() {
        lexicon_slurpers.$arc_lexicon_slurper$.setDynamicValue((SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
    public static SubLObject get_arc_lexicon_slurper_head_value(final SubLObject arc_lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(arc_lexicon_slurper, (SubLObject)lexicon_slurpers.FOUR_INTEGER, (SubLObject)lexicon_slurpers.$sym68$HEAD_VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
    public static SubLObject set_arc_lexicon_slurper_head_value(final SubLObject arc_lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(arc_lexicon_slurper, value, (SubLObject)lexicon_slurpers.FOUR_INTEGER, (SubLObject)lexicon_slurpers.$sym68$HEAD_VALUE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
    public static SubLObject subloop_reserved_initialize_arc_lexicon_slurper_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym5$INSTANCE_COUNT, (SubLObject)lexicon_slurpers.ZERO_INTEGER);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
    public static SubLObject subloop_reserved_initialize_arc_lexicon_slurper_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym7$ISOLATED_P, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.$sym8$INSTANCE_NUMBER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym53$LEXICON_ITERATOR, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym52$SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym51$CURRENT_KEY_VALUE, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym68$HEAD_VALUE, (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7617L)
    public static SubLObject arc_lexicon_slurper_p(final SubLObject arc_lexicon_slurper) {
        return classes.subloop_instanceof_class(arc_lexicon_slurper, (SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 7794L)
    public static SubLObject arc_lexicon_slurper_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_arc_lexicon_slurper_method = (SubLObject)lexicon_slurpers.NIL;
        SubLObject slurper_filter = get_lexicon_slurper_slurper_filter(self);
        SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
            try {
                lexicon_slurper_initialize_method(self);
                lexicon_iterator = abstract_lexicon.new_lexicon_iterator(object.new_class_instance((SubLObject)lexicon_slurpers.$sym58$QUIRK_LEXICON));
                slurper_filter = object.new_class_instance((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER);
                Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_slurper_filter(self, slurper_filter);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_arc_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_arc_lexicon_slurper_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 8107L)
    public static SubLObject arc_lexicon_slurper_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_arc_lexicon_slurper_method = (SubLObject)lexicon_slurpers.NIL;
        SubLObject current_key_value = get_lexicon_slurper_current_key_value(self);
        final SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push(lexicon_slurpers.$sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
            try {
                if (lexicon_slurpers.NIL != current_key_value) {
                    final SubLObject value = current_key_value;
                    current_key_value = (SubLObject)lexicon_slurpers.NIL;
                    Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, value);
                }
                if (lexicon_slurpers.NIL != iteration.iteration_done(lexicon_iterator)) {
                    Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, (SubLObject)lexicon_slurpers.NIL);
                }
                final SubLObject head_lex = iteration.iteration_next(lexicon_iterator);
                final SubLObject head_lex_string = methods.funcall_instance_method_with_1_args(head_lex, (SubLObject)lexicon_slurpers.$sym22$GET, (SubLObject)lexicon_slurpers.$kw76$STRING);
                SubLObject lexes = (SubLObject)lexicon_slurpers.NIL;
                SubLObject new_head = (SubLObject)lexicon_slurpers.NIL;
                while (lexicon_slurpers.NIL == new_head && lexicon_slurpers.NIL == iteration.iteration_done(lexicon_iterator)) {
                    final SubLObject next_value = iteration.iteration_next(lexicon_iterator);
                    if (!head_lex_string.equalp(methods.funcall_instance_method_with_1_args(next_value, (SubLObject)lexicon_slurpers.$sym22$GET, (SubLObject)lexicon_slurpers.$kw76$STRING))) {
                        new_head = (SubLObject)lexicon_slurpers.T;
                    }
                    if (lexicon_slurpers.NIL == new_head) {
                        lexes = (SubLObject)ConsesLow.cons(next_value, lexes);
                    }
                }
                final SubLObject pos_denots_list = make_arc_pos_denots_list((SubLObject)ConsesLow.cons(head_lex, lexes));
                if (lexicon_slurpers.NIL != pos_denots_list) {
                    final SubLObject safe_string = head_lex_string.isCons() ? make_safe_arc_key(head_lex_string) : head_lex_string;
                    Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, (SubLObject)ConsesLow.list(safe_string, pos_denots_list));
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)lexicon_slurpers.$sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, methods.funcall_instance_method_with_0_args(self, (SubLObject)lexicon_slurpers.$sym49$NEXT));
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)lexicon_slurpers.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_lexicon_slurper_current_key_value(self, current_key_value);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_arc_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)lexicon_slurpers.$sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_arc_lexicon_slurper_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 9015L)
    public static SubLObject make_safe_arc_key(final SubLObject list_of_strings) {
        SubLObject safe = (SubLObject)lexicon_slurpers.NIL;
        SubLObject cdolist_list_var = list_of_strings;
        SubLObject string = (SubLObject)lexicon_slurpers.NIL;
        string = cdolist_list_var.first();
        while (lexicon_slurpers.NIL != cdolist_list_var) {
            safe = (SubLObject)ConsesLow.cons(string_utilities.string_substitute((SubLObject)lexicon_slurpers.$str78$, (SubLObject)lexicon_slurpers.$str79$_, string, (SubLObject)lexicon_slurpers.UNPROVIDED), safe);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        }
        return Sequences.nreverse(safe);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-slurpers.lisp", position = 9209L)
    public static SubLObject make_arc_pos_denots_list(final SubLObject lex_entries) {
        final SubLObject aux_hash = Hashtables.make_hash_table((SubLObject)lexicon_slurpers.EIGHT_INTEGER, (SubLObject)lexicon_slurpers.UNPROVIDED, (SubLObject)lexicon_slurpers.UNPROVIDED);
        SubLObject pos_denots_list = (SubLObject)lexicon_slurpers.NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject entry = (SubLObject)lexicon_slurpers.NIL;
        entry = cdolist_list_var.first();
        while (lexicon_slurpers.NIL != cdolist_list_var) {
            final SubLObject denot = narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, (SubLObject)lexicon_slurpers.$sym22$GET, (SubLObject)lexicon_slurpers.$kw23$DENOT));
            final SubLObject pos = methods.funcall_instance_method_with_1_args(entry, (SubLObject)lexicon_slurpers.$sym22$GET, (SubLObject)lexicon_slurpers.$kw80$CYC_POS);
            SubLObject cdolist_list_var_$1;
            final SubLObject inflections = cdolist_list_var_$1 = methods.funcall_instance_method_with_1_args(entry, (SubLObject)lexicon_slurpers.$sym22$GET, (SubLObject)lexicon_slurpers.$kw81$INFLECTIONS);
            SubLObject infl = (SubLObject)lexicon_slurpers.NIL;
            infl = cdolist_list_var_$1.first();
            while (lexicon_slurpers.NIL != cdolist_list_var_$1) {
                final SubLObject penn_tag = (SubLObject)((lexicon_slurpers.NIL != pos) ? abstract_lexicon.map_from_cyc_to_penn_pos(pos, infl) : lexicon_slurpers.$kw82$NP);
                if (lexicon_slurpers.NIL != penn_tag) {
                    Hashtables.sethash(penn_tag, aux_hash, (SubLObject)ConsesLow.cons(denot, Hashtables.gethash(penn_tag, aux_hash, (SubLObject)lexicon_slurpers.UNPROVIDED)));
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                infl = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        }
        SubLObject k = (SubLObject)lexicon_slurpers.NIL;
        SubLObject v = (SubLObject)lexicon_slurpers.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(aux_hash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                pos_denots_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(k, v), pos_denots_list);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return pos_denots_list;
    }
    
    public static SubLObject declare_lexicon_slurpers_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_lexicon_slurper_filter_genls_filters", "GET-LEXICON-SLURPER-FILTER-GENLS-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "set_lexicon_slurper_filter_genls_filters", "SET-LEXICON-SLURPER-FILTER-GENLS-FILTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_lexicon_slurper_filter_isa_filters", "GET-LEXICON-SLURPER-FILTER-ISA-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "set_lexicon_slurper_filter_isa_filters", "SET-LEXICON-SLURPER-FILTER-ISA-FILTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_lexicon_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_lexicon_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_filter_p", "LEXICON-SLURPER-FILTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_filter_merge_method", "LEXICON-SLURPER-FILTER-MERGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_filter_approve_method", "LEXICON-SLURPER-FILTER-APPROVE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_proprietary_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_proprietary_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "proprietary_slurper_filter_p", "PROPRIETARY-SLURPER-FILTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "proprietary_slurper_filter_initialize_method", "PROPRIETARY-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_person_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_person_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "person_slurper_filter_p", "PERSON-SLURPER-FILTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "person_slurper_filter_initialize_method", "PERSON-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_arc_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_arc_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "arc_slurper_filter_p", "ARC-SLURPER-FILTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "arc_slurper_filter_initialize_method", "ARC-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_lexicon_slurper", "GET-LEXICON-SLURPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "has_next_lexicon_entry", "HAS-NEXT-LEXICON-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "next_lexicon_entry", "NEXT-LEXICON-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "reset_lexicon_slurper", "RESET-LEXICON-SLURPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_lexicon_slurper_current_key_value", "GET-LEXICON-SLURPER-CURRENT-KEY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "set_lexicon_slurper_current_key_value", "SET-LEXICON-SLURPER-CURRENT-KEY-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_lexicon_slurper_slurper_filter", "GET-LEXICON-SLURPER-SLURPER-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "set_lexicon_slurper_slurper_filter", "SET-LEXICON-SLURPER-SLURPER-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_lexicon_slurper_lexicon_iterator", "GET-LEXICON-SLURPER-LEXICON-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "set_lexicon_slurper_lexicon_iterator", "SET-LEXICON-SLURPER-LEXICON-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_lexicon_slurper_class", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_lexicon_slurper_instance", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_p", "LEXICON-SLURPER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_initialize_method", "LEXICON-SLURPER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_has_next_method", "LEXICON-SLURPER-HAS-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "lexicon_slurper_next_method", "LEXICON-SLURPER-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_arc_lexicon_slurper", "GET-ARC-LEXICON-SLURPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "has_next_arc_lexicon_entry", "HAS-NEXT-ARC-LEXICON-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "next_arc_lexicon_entry", "NEXT-ARC-LEXICON-ENTRY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "reset_arc_lexicon_slurper", "RESET-ARC-LEXICON-SLURPER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "get_arc_lexicon_slurper_head_value", "GET-ARC-LEXICON-SLURPER-HEAD-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "set_arc_lexicon_slurper_head_value", "SET-ARC-LEXICON-SLURPER-HEAD-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_arc_lexicon_slurper_class", "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "subloop_reserved_initialize_arc_lexicon_slurper_instance", "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "arc_lexicon_slurper_p", "ARC-LEXICON-SLURPER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "arc_lexicon_slurper_initialize_method", "ARC-LEXICON-SLURPER-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "arc_lexicon_slurper_next_method", "ARC-LEXICON-SLURPER-NEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "make_safe_arc_key", "MAKE-SAFE-ARC-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_slurpers", "make_arc_pos_denots_list", "MAKE-ARC-POS-DENOTS-LIST", 1, 0, false);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    public static SubLObject init_lexicon_slurpers_file() {
        lexicon_slurpers.$lexicon_slurper$ = SubLFiles.defvar("*LEXICON-SLURPER*", (SubLObject)lexicon_slurpers.NIL);
        lexicon_slurpers.$arc_lexicon_slurper$ = SubLFiles.defvar("*ARC-LEXICON-SLURPER*", (SubLObject)lexicon_slurpers.NIL);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    public static SubLObject setup_lexicon_slurpers_file() {
        classes.subloop_new_class((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.T, (SubLObject)lexicon_slurpers.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym6$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym9$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_lexicon_slurper_filter_class((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym10$MERGE, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$list11, (SubLObject)lexicon_slurpers.$list12, (SubLObject)lexicon_slurpers.$list13);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym10$MERGE, (SubLObject)lexicon_slurpers.$sym16$LEXICON_SLURPER_FILTER_MERGE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym17$APPROVE, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$list11, (SubLObject)lexicon_slurpers.$list18, (SubLObject)lexicon_slurpers.$list19);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym17$APPROVE, (SubLObject)lexicon_slurpers.$sym24$LEXICON_SLURPER_FILTER_APPROVE_METHOD);
        classes.subloop_new_class((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list26);
        classes.class_set_implements_slot_listeners((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym27$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym28$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_proprietary_slurper_filter_class((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$list30, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list31);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym25$PROPRIETARY_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym34$PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym36$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym37$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_person_slurper_filter_class((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$list30, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list38);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym35$PERSON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym41$PERSON_SLURPER_FILTER_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym0$LEXICON_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL);
        classes.class_set_implements_slot_listeners((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym43$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym44$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_arc_slurper_filter_class((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$list30, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list45);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym42$ARC_SLURPER_FILTER, (SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym46$ARC_SLURPER_FILTER_INITIALIZE_METHOD);
        classes.subloop_new_class((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym1$OBJECT, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list50);
        classes.class_set_implements_slot_listeners((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym54$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym55$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE);
        subloop_reserved_initialize_lexicon_slurper_class((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$list30, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list56);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym59$LEXICON_SLURPER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym48$HAS_NEXT, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$list60, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list61);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym48$HAS_NEXT, (SubLObject)lexicon_slurpers.$sym62$LEXICON_SLURPER_HAS_NEXT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym49$NEXT, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$list11, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list63);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym49$NEXT, (SubLObject)lexicon_slurpers.$sym65$LEXICON_SLURPER_NEXT_METHOD);
        classes.subloop_new_class((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym47$LEXICON_SLURPER, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list67);
        classes.class_set_implements_slot_listeners((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym69$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym70$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE);
        subloop_reserved_initialize_arc_lexicon_slurper_class((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$list30, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list71);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym29$INITIALIZE, (SubLObject)lexicon_slurpers.$sym73$ARC_LEXICON_SLURPER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)lexicon_slurpers.$sym49$NEXT, (SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$list11, (SubLObject)lexicon_slurpers.NIL, (SubLObject)lexicon_slurpers.$list74);
        methods.subloop_register_instance_method((SubLObject)lexicon_slurpers.$sym66$ARC_LEXICON_SLURPER, (SubLObject)lexicon_slurpers.$sym49$NEXT, (SubLObject)lexicon_slurpers.$sym77$ARC_LEXICON_SLURPER_NEXT_METHOD);
        return (SubLObject)lexicon_slurpers.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lexicon_slurpers_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lexicon_slurpers_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lexicon_slurpers_file();
    }
    
    static {
        me = (SubLFile)new lexicon_slurpers();
        lexicon_slurpers.$lexicon_slurper$ = null;
        lexicon_slurpers.$arc_lexicon_slurper$ = null;
        $sym0$LEXICON_SLURPER_FILTER = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-FILTER");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENLS-FILTERS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-FILTER")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("APPROVE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym3$GENLS_FILTERS = SubLObjectFactory.makeSymbol("GENLS-FILTERS");
        $sym4$ISA_FILTERS = SubLObjectFactory.makeSymbol("ISA-FILTERS");
        $sym5$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym6$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-CLASS");
        $sym7$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym8$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym9$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-INSTANCE");
        $sym10$MERGE = SubLObjectFactory.makeSymbol("MERGE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-FILTER"));
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-FILTER"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-SLURPER-FILTER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNION"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-FILTERS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-FILTER-METHOD");
        $sym15$LEXICON_SLURPER_FILTER_P = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-FILTER-P");
        $sym16$LEXICON_SLURPER_FILTER_MERGE_METHOD = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-FILTER-MERGE-METHOD");
        $sym17$APPROVE = SubLObjectFactory.makeSymbol("APPROVE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("DENOT"))), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)lexicon_slurpers.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLLECTION"), (SubLObject)SubLObjectFactory.makeSymbol("GENLS-FILTERS"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-IN-ANY-MT?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)SubLObjectFactory.makeSymbol("COLLECTION")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"), (SubLObject)lexicon_slurpers.T))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("FAIL"))))));
        $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-FILTER-METHOD");
        $sym21$LEX_ENTRY_P = SubLObjectFactory.makeSymbol("LEX-ENTRY-P");
        $sym22$GET = SubLObjectFactory.makeSymbol("GET");
        $kw23$DENOT = SubLObjectFactory.makeKeyword("DENOT");
        $sym24$LEXICON_SLURPER_FILTER_APPROVE_METHOD = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-FILTER-APPROVE-METHOD");
        $sym25$PROPRIETARY_SLURPER_FILTER = SubLObjectFactory.makeSymbol("PROPRIETARY-SLURPER-FILTER");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)lexicon_slurpers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym27$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-CLASS");
        $sym28$SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-INSTANCE");
        $sym29$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProprietaryConstant"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PROPRIETARY-SLURPER-FILTER-METHOD");
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProprietaryConstant")));
        $sym34$PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("PROPRIETARY-SLURPER-FILTER-INITIALIZE-METHOD");
        $sym35$PERSON_SLURPER_FILTER = SubLObjectFactory.makeSymbol("PERSON-SLURPER-FILTER");
        $sym36$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-CLASS");
        $sym37$SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-INSTANCE");
        $list38 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-FILTERS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PERSON-SLURPER-FILTER-METHOD");
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")));
        $sym41$PERSON_SLURPER_FILTER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("PERSON-SLURPER-FILTER-INITIALIZE-METHOD");
        $sym42$ARC_SLURPER_FILTER = SubLObjectFactory.makeSymbol("ARC-SLURPER-FILTER");
        $sym43$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-CLASS");
        $sym44$SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-INSTANCE");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MERGE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PERSON-SLURPER-FILTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym46$ARC_SLURPER_FILTER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("ARC-SLURPER-FILTER-INITIALIZE-METHOD");
        $sym47$LEXICON_SLURPER = SubLObjectFactory.makeSymbol("LEXICON-SLURPER");
        $sym48$HAS_NEXT = SubLObjectFactory.makeSymbol("HAS-NEXT");
        $sym49$NEXT = SubLObjectFactory.makeSymbol("NEXT");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLURPER-FILTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)lexicon_slurpers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("HAS-NEXT"), (SubLObject)lexicon_slurpers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)lexicon_slurpers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym51$CURRENT_KEY_VALUE = SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE");
        $sym52$SLURPER_FILTER = SubLObjectFactory.makeSymbol("SLURPER-FILTER");
        $sym53$LEXICON_ITERATOR = SubLObjectFactory.makeSymbol("LEXICON-ITERATOR");
        $sym54$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-CLASS");
        $sym55$SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-INSTANCE");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXICON-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUIRK-LEXICON"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLURPER-FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROPRIETARY-SLURPER-FILTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-METHOD");
        $sym58$QUIRK_LEXICON = SubLObjectFactory.makeSymbol("QUIRK-LEXICON");
        $sym59$LEXICON_SLURPER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-INITIALIZE-METHOD");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"), (SubLObject)SubLObjectFactory.makeKeyword("NO-MEMBER-VARIABLES"));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return BOOLEAN; T if slurper has a next element, NIL otherwise\n   @owner bertolo"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)lexicon_slurpers.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)lexicon_slurpers.NIL)));
        $sym62$LEXICON_SLURPER_HAS_NEXT_METHOD = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-HAS-NEXT-METHOD");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("APPROVED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)SubLObjectFactory.makeSymbol("APPROVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATION-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("APPROVED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SLURPER-FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("APPROVE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY"))));
        $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-METHOD");
        $sym65$LEXICON_SLURPER_NEXT_METHOD = SubLObjectFactory.makeSymbol("LEXICON-SLURPER-NEXT-METHOD");
        $sym66$ARC_LEXICON_SLURPER = SubLObjectFactory.makeSymbol("ARC-LEXICON-SLURPER");
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-HEAD-VALUE"), (SubLObject)lexicon_slurpers.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")));
        $sym68$HEAD_VALUE = SubLObjectFactory.makeSymbol("HEAD-VALUE");
        $sym69$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-CLASS");
        $sym70$SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-INSTANCE");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-LEXICON-ITERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUIRK-LEXICON"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLURPER-FILTER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ARC-SLURPER-FILTER")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ARC-LEXICON-SLURPER-METHOD");
        $sym73$ARC_LEXICON_SLURPER_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("ARC-LEXICON-SLURPER-INITIALIZE-METHOD");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-KEY-VALUE"), (SubLObject)lexicon_slurpers.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATION-DONE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)lexicon_slurpers.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATION-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"))), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATION-DONE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITERATION-NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICON-ITERATOR")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)lexicon_slurpers.EQUALP, (SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-VALUE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD"), (SubLObject)lexicon_slurpers.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-HEAD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-DENOTS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-ARC-POS-DENOTS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX"), (SubLObject)SubLObjectFactory.makeSymbol("LEXES"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("POS-DENOTS-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SAFE-STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSP"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-SAFE-ARC-KEY"), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX-STRING")), (SubLObject)SubLObjectFactory.makeSymbol("HEAD-LEX-STRING")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("SAFE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("POS-DENOTS-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT"))))))));
        $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ARC-LEXICON-SLURPER-METHOD");
        $kw76$STRING = SubLObjectFactory.makeKeyword("STRING");
        $sym77$ARC_LEXICON_SLURPER_NEXT_METHOD = SubLObjectFactory.makeSymbol("ARC-LEXICON-SLURPER-NEXT-METHOD");
        $str78$ = SubLObjectFactory.makeString("");
        $str79$_ = SubLObjectFactory.makeString("\"");
        $kw80$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $kw81$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $kw82$NP = SubLObjectFactory.makeKeyword("NP");
    }
}

/*

	Total time: 300 ms
	
*/