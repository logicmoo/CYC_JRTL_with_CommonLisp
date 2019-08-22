package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class lexicon_slurpers extends SubLTranslatedFile {
    public static final SubLFile me = new lexicon_slurpers();

    public static final String myName = "com.cyc.cycjava.cycl.lexicon_slurpers";

    public static final String myFingerPrint = "48de595decd3832f167897097624b0dd45b0326fb85c4335038feec2edc36470";

    // defvar
    private static final SubLSymbol $lexicon_slurper$ = makeSymbol("*LEXICON-SLURPER*");

    // defvar
    private static final SubLSymbol $arc_lexicon_slurper$ = makeSymbol("*ARC-LEXICON-SLURPER*");

    // Internal Constants
    public static final SubLSymbol LEXICON_SLURPER_FILTER = makeSymbol("LEXICON-SLURPER-FILTER");



    public static final SubLList $list2 = list(list(makeSymbol("ISA-FILTERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GENLS-FILTERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MERGE"), list(makeSymbol("OTHER-FILTER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPROVE"), list(makeSymbol("LEX-ENTRY")), makeKeyword("PUBLIC")));

    public static final SubLSymbol GENLS_FILTERS = makeSymbol("GENLS-FILTERS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-INSTANCE");

    public static final SubLSymbol MERGE = makeSymbol("MERGE");

    public static final SubLList $list11 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list12 = list(makeSymbol("OTHER-FILTER"));

    public static final SubLList $list13 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OTHER-FILTER"), makeSymbol("LEXICON-SLURPER-FILTER-P")), list(makeSymbol("CSETQ"), makeSymbol("ISA-FILTERS"), list(makeSymbol("UNION"), makeSymbol("ISA-FILTERS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER-FILTER"), list(makeSymbol("QUOTE"), makeSymbol("ISA-FILTERS"))))), list(makeSymbol("CSETQ"), makeSymbol("GENLS-FILTERS"), list(makeSymbol("UNION"), makeSymbol("GENLS-FILTERS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER-FILTER"), list(makeSymbol("QUOTE"), makeSymbol("GENLS-FILTERS"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-FILTER-METHOD");

    public static final SubLSymbol LEXICON_SLURPER_FILTER_P = makeSymbol("LEXICON-SLURPER-FILTER-P");

    public static final SubLSymbol LEXICON_SLURPER_FILTER_MERGE_METHOD = makeSymbol("LEXICON-SLURPER-FILTER-MERGE-METHOD");

    public static final SubLSymbol APPROVE = makeSymbol("APPROVE");

    public static final SubLList $list18 = list(makeSymbol("LEX-ENTRY"));

    public static final SubLList $list19 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRY-P")), list(makeSymbol("CLET"), list(list(makeSymbol("DENOT"), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT"))), makeSymbol("FAIL")), list(makeSymbol("CSOME"), list(makeSymbol("COLLECTION"), makeSymbol("ISA-FILTERS"), makeSymbol("FAIL")), list(makeSymbol("PWHEN"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("DENOT"), makeSymbol("COLLECTION")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T))), list(makeSymbol("PUNLESS"), makeSymbol("FAIL"), list(makeSymbol("CSOME"), list(makeSymbol("COLLECTION"), makeSymbol("GENLS-FILTERS"), makeSymbol("FAIL")), list(makeSymbol("PWHEN"), list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("DENOT"), makeSymbol("COLLECTION")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T))), list(makeSymbol("RET"), list(makeSymbol("CNOT"), makeSymbol("FAIL"))))));

    public static final SubLSymbol $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-FILTER-METHOD");







    public static final SubLSymbol LEXICON_SLURPER_FILTER_APPROVE_METHOD = makeSymbol("LEXICON-SLURPER-FILTER-APPROVE-METHOD");

    public static final SubLSymbol PROPRIETARY_SLURPER_FILTER = makeSymbol("PROPRIETARY-SLURPER-FILTER");

    public static final SubLList $list26 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-INSTANCE");



    public static final SubLList $list30 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list31 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ISA-FILTERS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("ProprietaryConstant"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PROPRIETARY-SLURPER-FILTER-METHOD");

    public static final SubLList $list33 = list(reader_make_constant_shell(makeString("ProprietaryConstant")));

    public static final SubLSymbol PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD = makeSymbol("PROPRIETARY-SLURPER-FILTER-INITIALIZE-METHOD");

    public static final SubLSymbol PERSON_SLURPER_FILTER = makeSymbol("PERSON-SLURPER-FILTER");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-INSTANCE");

    public static final SubLList $list38 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ISA-FILTERS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Person"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PERSON-SLURPER-FILTER-METHOD");

    public static final SubLList $list40 = list(reader_make_constant_shell(makeString("Person")));

    public static final SubLSymbol PERSON_SLURPER_FILTER_INITIALIZE_METHOD = makeSymbol("PERSON-SLURPER-FILTER-INITIALIZE-METHOD");

    public static final SubLSymbol ARC_SLURPER_FILTER = makeSymbol("ARC-SLURPER-FILTER");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-INSTANCE");

    public static final SubLList $list45 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("MERGE")), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PERSON-SLURPER-FILTER")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol ARC_SLURPER_FILTER_INITIALIZE_METHOD = makeSymbol("ARC-SLURPER-FILTER-INITIALIZE-METHOD");

    public static final SubLSymbol LEXICON_SLURPER = makeSymbol("LEXICON-SLURPER");

    public static final SubLSymbol HAS_NEXT = makeSymbol("HAS-NEXT");



    public static final SubLList $list50 = list(list(makeSymbol("LEXICON-ITERATOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SLURPER-FILTER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-KEY-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-NEXT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT"), NIL, makeKeyword("PUBLIC")));

    public static final SubLSymbol CURRENT_KEY_VALUE = makeSymbol("CURRENT-KEY-VALUE");

    public static final SubLSymbol SLURPER_FILTER = makeSymbol("SLURPER-FILTER");



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-INSTANCE");

    public static final SubLList $list56 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LEXICON-ITERATOR"), list(makeSymbol("NEW-LEXICON-ITERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("QUIRK-LEXICON"))))), list(makeSymbol("CSETQ"), makeSymbol("SLURPER-FILTER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PROPRIETARY-SLURPER-FILTER")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-METHOD");

    public static final SubLSymbol QUIRK_LEXICON = makeSymbol("QUIRK-LEXICON");

    public static final SubLSymbol LEXICON_SLURPER_INITIALIZE_METHOD = makeSymbol("LEXICON-SLURPER-INITIALIZE-METHOD");

    public static final SubLList $list60 = list(makeKeyword("PUBLIC"), makeKeyword("NO-MEMBER-VARIABLES"));

    public static final SubLList $list61 = list(makeString("@return BOOLEAN; T if slurper has a next element, NIL otherwise\n   @owner bertolo"), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CURRENT-KEY-VALUE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT")))), list(makeSymbol("PIF"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CURRENT-KEY-VALUE"))), list(makeSymbol("RET"), T), list(makeSymbol("RET"), NIL)));

    public static final SubLSymbol LEXICON_SLURPER_HAS_NEXT_METHOD = makeSymbol("LEXICON-SLURPER-HAS-NEXT-METHOD");

    public static final SubLList $list63 = list(list(makeSymbol("CLET"), list(makeSymbol("ENTRY"), makeSymbol("APPROVED")), list(makeSymbol("UNTIL"), makeSymbol("APPROVED"), list(makeSymbol("CSETQ"), makeSymbol("ENTRY"), list(makeSymbol("ITERATION-NEXT"), makeSymbol("LEXICON-ITERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("APPROVED"), list(makeSymbol("FIM"), makeSymbol("SLURPER-FILTER"), list(makeSymbol("QUOTE"), makeSymbol("APPROVE"))))), list(makeSymbol("RET"), makeSymbol("ENTRY"))));

    public static final SubLSymbol $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-LEXICON-SLURPER-METHOD");

    public static final SubLSymbol LEXICON_SLURPER_NEXT_METHOD = makeSymbol("LEXICON-SLURPER-NEXT-METHOD");

    public static final SubLSymbol ARC_LEXICON_SLURPER = makeSymbol("ARC-LEXICON-SLURPER");

    public static final SubLList $list67 = list(list(makeSymbol("HEAD-VALUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETE-HEAD-VALUE"), NIL, makeKeyword("PRIVATE")));

    public static final SubLSymbol HEAD_VALUE = makeSymbol("HEAD-VALUE");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-CLASS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-INSTANCE");

    public static final SubLList $list71 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LEXICON-ITERATOR"), list(makeSymbol("NEW-LEXICON-ITERATOR"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("QUIRK-LEXICON"))))), list(makeSymbol("CSETQ"), makeSymbol("SLURPER-FILTER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("ARC-SLURPER-FILTER")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ARC-LEXICON-SLURPER-METHOD");

    public static final SubLSymbol ARC_LEXICON_SLURPER_INITIALIZE_METHOD = makeSymbol("ARC-LEXICON-SLURPER-INITIALIZE-METHOD");

    public static final SubLList $list74 = list(list(makeSymbol("PWHEN"), makeSymbol("CURRENT-KEY-VALUE"), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), makeSymbol("CURRENT-KEY-VALUE"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-KEY-VALUE"), NIL), list(makeSymbol("RET"), makeSymbol("VALUE")))), list(makeSymbol("PWHEN"), list(makeSymbol("ITERATION-DONE"), makeSymbol("LEXICON-ITERATOR")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-LEX"), list(makeSymbol("ITERATION-NEXT"), makeSymbol("LEXICON-ITERATOR"))), list(makeSymbol("HEAD-LEX-STRING"), list(makeSymbol("FIM"), makeSymbol("HEAD-LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("STRING"))), makeSymbol("LEXES"), makeSymbol("NEW-HEAD")), list(makeSymbol("UNTIL"), list(makeSymbol("COR"), makeSymbol("NEW-HEAD"), list(makeSymbol("ITERATION-DONE"), makeSymbol("LEXICON-ITERATOR"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-VALUE"), list(makeSymbol("ITERATION-NEXT"), makeSymbol("LEXICON-ITERATOR")))), list(makeSymbol("PUNLESS"), list(EQUALP, makeSymbol("HEAD-LEX-STRING"), list(makeSymbol("FIM"), makeSymbol("NEXT-VALUE"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("STRING"))), list(makeSymbol("CSETQ"), makeSymbol("NEW-HEAD"), T)), list(makeSymbol("PUNLESS"), makeSymbol("NEW-HEAD"), list(makeSymbol("CPUSH"), makeSymbol("NEXT-VALUE"), makeSymbol("LEXES"))))), list(makeSymbol("CLET"), list(list(makeSymbol("POS-DENOTS-LIST"), list(makeSymbol("MAKE-ARC-POS-DENOTS-LIST"), list(makeSymbol("CONS"), makeSymbol("HEAD-LEX"), makeSymbol("LEXES"))))), list(makeSymbol("PIF"), makeSymbol("POS-DENOTS-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("SAFE-STRING"), list(makeSymbol("FIF"), list(makeSymbol("CONSP"), makeSymbol("HEAD-LEX-STRING")), list(makeSymbol("MAKE-SAFE-ARC-KEY"), makeSymbol("HEAD-LEX-STRING")), makeSymbol("HEAD-LEX-STRING")))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("SAFE-STRING"), makeSymbol("POS-DENOTS-LIST")))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))))))));

    public static final SubLSymbol $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ARC-LEXICON-SLURPER-METHOD");



    public static final SubLSymbol ARC_LEXICON_SLURPER_NEXT_METHOD = makeSymbol("ARC-LEXICON-SLURPER-NEXT-METHOD");

    public static final SubLString $str78$ = makeString("");

    public static final SubLString $str79$_ = makeString("\"");







    public static SubLObject get_lexicon_slurper_filter_genls_filters(final SubLObject lexicon_slurper_filter) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper_filter, TWO_INTEGER, GENLS_FILTERS);
    }

    public static SubLObject set_lexicon_slurper_filter_genls_filters(final SubLObject lexicon_slurper_filter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper_filter, value, TWO_INTEGER, GENLS_FILTERS);
    }

    public static SubLObject get_lexicon_slurper_filter_isa_filters(final SubLObject lexicon_slurper_filter) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper_filter, ONE_INTEGER, ISA_FILTERS);
    }

    public static SubLObject set_lexicon_slurper_filter_isa_filters(final SubLObject lexicon_slurper_filter, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper_filter, value, ONE_INTEGER, ISA_FILTERS);
    }

    public static SubLObject subloop_reserved_initialize_lexicon_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lexicon_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, ISA_FILTERS, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, GENLS_FILTERS, NIL);
        return NIL;
    }

    public static SubLObject lexicon_slurper_filter_p(final SubLObject lexicon_slurper_filter) {
        return classes.subloop_instanceof_class(lexicon_slurper_filter, LEXICON_SLURPER_FILTER);
    }

    public static SubLObject lexicon_slurper_filter_merge_method(final SubLObject self, final SubLObject other_filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_filter_method = NIL;
        SubLObject genls_filters = get_lexicon_slurper_filter_genls_filters(self);
        SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push($sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
            try {
                assert NIL != lexicon_slurper_filter_p(other_filter) : "lexicon_slurpers.lexicon_slurper_filter_p(other_filter) " + "CommonSymbols.NIL != lexicon_slurpers.lexicon_slurper_filter_p(other_filter) " + other_filter;
                isa_filters = union(isa_filters, instances.get_slot(other_filter, ISA_FILTERS), UNPROVIDED, UNPROVIDED);
                genls_filters = union(genls_filters, instances.get_slot(other_filter, GENLS_FILTERS), UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_filter_genls_filters(self, genls_filters);
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, $sym14$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_filter_method;
    }

    public static SubLObject lexicon_slurper_filter_approve_method(final SubLObject self, final SubLObject lex_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_filter_method = NIL;
        final SubLObject genls_filters = get_lexicon_slurper_filter_genls_filters(self);
        final SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push($sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
            try {
                assert NIL != abstract_lexicon.lex_entry_p(lex_entry) : "abstract_lexicon.lex_entry_p(lex_entry) " + "CommonSymbols.NIL != abstract_lexicon.lex_entry_p(lex_entry) " + lex_entry;
                final SubLObject denot = methods.funcall_instance_method_with_1_args(lex_entry, GET, $DENOT);
                SubLObject fail = NIL;
                if (NIL == fail) {
                    SubLObject csome_list_var = isa_filters;
                    SubLObject collection = NIL;
                    collection = csome_list_var.first();
                    while ((NIL == fail) && (NIL != csome_list_var)) {
                        if (NIL != isa.isa_in_any_mtP(denot, collection)) {
                            fail = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        collection = csome_list_var.first();
                    } 
                }
                if (NIL == fail) {
                    if (NIL == fail) {
                        SubLObject csome_list_var = genls_filters;
                        SubLObject collection = NIL;
                        collection = csome_list_var.first();
                        while ((NIL == fail) && (NIL != csome_list_var)) {
                            if (NIL != genls.genl_in_any_mtP(denot, collection)) {
                                fail = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            collection = csome_list_var.first();
                        } 
                    }
                    sublisp_throw($sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD, makeBoolean(NIL == fail));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_filter_genls_filters(self, genls_filters);
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_LEXICON_SLURPER_FILTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_filter_method;
    }

    public static SubLObject subloop_reserved_initialize_proprietary_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_proprietary_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, ISA_FILTERS, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, GENLS_FILTERS, NIL);
        return NIL;
    }

    public static SubLObject proprietary_slurper_filter_p(final SubLObject proprietary_slurper_filter) {
        return classes.subloop_instanceof_class(proprietary_slurper_filter, PROPRIETARY_SLURPER_FILTER);
    }

    public static SubLObject proprietary_slurper_filter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_proprietary_slurper_filter_method = NIL;
        SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push($sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD);
            try {
                object.object_initialize_method(self);
                isa_filters = $list33;
                sublisp_throw($sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_proprietary_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_PROPRIETARY_SLURPER_FILTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_proprietary_slurper_filter_method;
    }

    public static SubLObject subloop_reserved_initialize_person_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_person_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, ISA_FILTERS, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, GENLS_FILTERS, NIL);
        return NIL;
    }

    public static SubLObject person_slurper_filter_p(final SubLObject person_slurper_filter) {
        return classes.subloop_instanceof_class(person_slurper_filter, PERSON_SLURPER_FILTER);
    }

    public static SubLObject person_slurper_filter_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_person_slurper_filter_method = NIL;
        SubLObject isa_filters = get_lexicon_slurper_filter_isa_filters(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD);
            try {
                object.object_initialize_method(self);
                isa_filters = $list40;
                sublisp_throw($sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_filter_isa_filters(self, isa_filters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_person_slurper_filter_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_PERSON_SLURPER_FILTER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_person_slurper_filter_method;
    }

    public static SubLObject subloop_reserved_initialize_arc_slurper_filter_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_arc_slurper_filter_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, ISA_FILTERS, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER_FILTER, GENLS_FILTERS, NIL);
        return NIL;
    }

    public static SubLObject arc_slurper_filter_p(final SubLObject arc_slurper_filter) {
        return classes.subloop_instanceof_class(arc_slurper_filter, ARC_SLURPER_FILTER);
    }

    public static SubLObject arc_slurper_filter_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        methods.funcall_instance_method_with_1_args(self, MERGE, object.new_class_instance(PERSON_SLURPER_FILTER));
        return self;
    }

    public static SubLObject get_lexicon_slurper() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $lexicon_slurper$.getDynamicValue(thread)) {
            $lexicon_slurper$.setDynamicValue(object.new_class_instance(LEXICON_SLURPER), thread);
        }
        return $lexicon_slurper$.getDynamicValue(thread);
    }

    public static SubLObject has_next_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_lexicon_slurper(), HAS_NEXT);
    }

    public static SubLObject next_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_lexicon_slurper(), NEXT);
    }

    public static SubLObject reset_lexicon_slurper() {
        $lexicon_slurper$.setDynamicValue(NIL);
        return T;
    }

    public static SubLObject get_lexicon_slurper_current_key_value(final SubLObject lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper, THREE_INTEGER, CURRENT_KEY_VALUE);
    }

    public static SubLObject set_lexicon_slurper_current_key_value(final SubLObject lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper, value, THREE_INTEGER, CURRENT_KEY_VALUE);
    }

    public static SubLObject get_lexicon_slurper_slurper_filter(final SubLObject lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper, TWO_INTEGER, SLURPER_FILTER);
    }

    public static SubLObject set_lexicon_slurper_slurper_filter(final SubLObject lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper, value, TWO_INTEGER, SLURPER_FILTER);
    }

    public static SubLObject get_lexicon_slurper_lexicon_iterator(final SubLObject lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(lexicon_slurper, ONE_INTEGER, LEXICON_ITERATOR);
    }

    public static SubLObject set_lexicon_slurper_lexicon_iterator(final SubLObject lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(lexicon_slurper, value, ONE_INTEGER, LEXICON_ITERATOR);
    }

    public static SubLObject subloop_reserved_initialize_lexicon_slurper_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_lexicon_slurper_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER, LEXICON_ITERATOR, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER, SLURPER_FILTER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER, CURRENT_KEY_VALUE, NIL);
        return NIL;
    }

    public static SubLObject lexicon_slurper_p(final SubLObject lexicon_slurper) {
        return classes.subloop_instanceof_class(lexicon_slurper, LEXICON_SLURPER);
    }

    public static SubLObject lexicon_slurper_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_method = NIL;
        SubLObject slurper_filter = get_lexicon_slurper_slurper_filter(self);
        SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push($sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
            try {
                object.object_initialize_method(self);
                lexicon_iterator = abstract_lexicon.new_lexicon_iterator(object.new_class_instance(QUIRK_LEXICON));
                slurper_filter = object.new_class_instance(PROPRIETARY_SLURPER_FILTER);
                sublisp_throw($sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_slurper_filter(self, slurper_filter);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_method;
    }

    public static SubLObject lexicon_slurper_has_next_method(final SubLObject self) {
        instances.set_slot(self, CURRENT_KEY_VALUE, methods.funcall_instance_method_with_0_args(self, NEXT));
        if (NIL != instances.get_slot(self, CURRENT_KEY_VALUE)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject lexicon_slurper_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_lexicon_slurper_method = NIL;
        final SubLObject slurper_filter = get_lexicon_slurper_slurper_filter(self);
        final SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push($sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
            try {
                SubLObject entry = NIL;
                for (SubLObject approved = NIL; NIL == approved; approved = methods.funcall_instance_method_with_0_args(slurper_filter, APPROVE)) {
                    entry = iteration.iteration_next(lexicon_iterator);
                }
                sublisp_throw($sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD, entry);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_slurper_filter(self, slurper_filter);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_LEXICON_SLURPER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_lexicon_slurper_method;
    }

    public static SubLObject get_arc_lexicon_slurper() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $arc_lexicon_slurper$.getDynamicValue(thread)) {
            $arc_lexicon_slurper$.setDynamicValue(object.new_class_instance(ARC_LEXICON_SLURPER), thread);
        }
        return $arc_lexicon_slurper$.getDynamicValue(thread);
    }

    public static SubLObject has_next_arc_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_arc_lexicon_slurper(), HAS_NEXT);
    }

    public static SubLObject next_arc_lexicon_entry() {
        return methods.funcall_instance_method_with_0_args(get_arc_lexicon_slurper(), NEXT);
    }

    public static SubLObject reset_arc_lexicon_slurper() {
        $arc_lexicon_slurper$.setDynamicValue(NIL);
        return T;
    }

    public static SubLObject get_arc_lexicon_slurper_head_value(final SubLObject arc_lexicon_slurper) {
        return classes.subloop_get_access_protected_instance_slot(arc_lexicon_slurper, FOUR_INTEGER, HEAD_VALUE);
    }

    public static SubLObject set_arc_lexicon_slurper_head_value(final SubLObject arc_lexicon_slurper, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(arc_lexicon_slurper, value, FOUR_INTEGER, HEAD_VALUE);
    }

    public static SubLObject subloop_reserved_initialize_arc_lexicon_slurper_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_arc_lexicon_slurper_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER, LEXICON_ITERATOR, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER, SLURPER_FILTER, NIL);
        classes.subloop_initialize_slot(new_instance, LEXICON_SLURPER, CURRENT_KEY_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, ARC_LEXICON_SLURPER, HEAD_VALUE, NIL);
        return NIL;
    }

    public static SubLObject arc_lexicon_slurper_p(final SubLObject arc_lexicon_slurper) {
        return classes.subloop_instanceof_class(arc_lexicon_slurper, ARC_LEXICON_SLURPER);
    }

    public static SubLObject arc_lexicon_slurper_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_arc_lexicon_slurper_method = NIL;
        SubLObject slurper_filter = get_lexicon_slurper_slurper_filter(self);
        SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push($sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
            try {
                lexicon_slurper_initialize_method(self);
                lexicon_iterator = abstract_lexicon.new_lexicon_iterator(object.new_class_instance(QUIRK_LEXICON));
                slurper_filter = object.new_class_instance(ARC_SLURPER_FILTER);
                sublisp_throw($sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_slurper_filter(self, slurper_filter);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_arc_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_arc_lexicon_slurper_method;
    }

    public static SubLObject arc_lexicon_slurper_next_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_arc_lexicon_slurper_method = NIL;
        SubLObject current_key_value = get_lexicon_slurper_current_key_value(self);
        final SubLObject lexicon_iterator = get_lexicon_slurper_lexicon_iterator(self);
        try {
            thread.throwStack.push($sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
            try {
                if (NIL != current_key_value) {
                    final SubLObject value = current_key_value;
                    current_key_value = NIL;
                    sublisp_throw($sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, value);
                }
                if (NIL != iteration.iteration_done(lexicon_iterator)) {
                    sublisp_throw($sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, NIL);
                }
                final SubLObject head_lex = iteration.iteration_next(lexicon_iterator);
                final SubLObject head_lex_string = methods.funcall_instance_method_with_1_args(head_lex, GET, $STRING);
                SubLObject lexes = NIL;
                SubLObject new_head = NIL;
                while ((NIL == new_head) && (NIL == iteration.iteration_done(lexicon_iterator))) {
                    final SubLObject next_value = iteration.iteration_next(lexicon_iterator);
                    if (!head_lex_string.equalp(methods.funcall_instance_method_with_1_args(next_value, GET, $STRING))) {
                        new_head = T;
                    }
                    if (NIL == new_head) {
                        lexes = cons(next_value, lexes);
                    }
                } 
                final SubLObject pos_denots_list = make_arc_pos_denots_list(cons(head_lex, lexes));
                if (NIL != pos_denots_list) {
                    final SubLObject safe_string = (head_lex_string.isCons()) ? make_safe_arc_key(head_lex_string) : head_lex_string;
                    sublisp_throw($sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, list(safe_string, pos_denots_list));
                } else {
                    sublisp_throw($sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD, methods.funcall_instance_method_with_0_args(self, NEXT));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_lexicon_slurper_current_key_value(self, current_key_value);
                    set_lexicon_slurper_lexicon_iterator(self, lexicon_iterator);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_arc_lexicon_slurper_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_ARC_LEXICON_SLURPER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_arc_lexicon_slurper_method;
    }

    public static SubLObject make_safe_arc_key(final SubLObject list_of_strings) {
        SubLObject safe = NIL;
        SubLObject cdolist_list_var = list_of_strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            safe = cons(string_utilities.string_substitute($str78$, $str79$_, string, UNPROVIDED), safe);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return nreverse(safe);
    }

    public static SubLObject make_arc_pos_denots_list(final SubLObject lex_entries) {
        final SubLObject aux_hash = make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject pos_denots_list = NIL;
        SubLObject cdolist_list_var = lex_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denot = narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT));
            final SubLObject pos = methods.funcall_instance_method_with_1_args(entry, GET, $CYC_POS);
            SubLObject cdolist_list_var_$1;
            final SubLObject inflections = cdolist_list_var_$1 = methods.funcall_instance_method_with_1_args(entry, GET, $INFLECTIONS);
            SubLObject infl = NIL;
            infl = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject penn_tag = (NIL != pos) ? abstract_lexicon.map_from_cyc_to_penn_pos(pos, infl) : $NP;
                if (NIL != penn_tag) {
                    sethash(penn_tag, aux_hash, cons(denot, gethash(penn_tag, aux_hash, UNPROVIDED)));
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                infl = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        SubLObject k = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(aux_hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                pos_denots_list = cons(list(k, v), pos_denots_list);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return pos_denots_list;
    }

    public static SubLObject declare_lexicon_slurpers_file() {
        declareFunction(me, "get_lexicon_slurper_filter_genls_filters", "GET-LEXICON-SLURPER-FILTER-GENLS-FILTERS", 1, 0, false);
        declareFunction(me, "set_lexicon_slurper_filter_genls_filters", "SET-LEXICON-SLURPER-FILTER-GENLS-FILTERS", 2, 0, false);
        declareFunction(me, "get_lexicon_slurper_filter_isa_filters", "GET-LEXICON-SLURPER-FILTER-ISA-FILTERS", 1, 0, false);
        declareFunction(me, "set_lexicon_slurper_filter_isa_filters", "SET-LEXICON-SLURPER-FILTER-ISA-FILTERS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lexicon_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lexicon_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-FILTER-INSTANCE", 1, 0, false);
        declareFunction(me, "lexicon_slurper_filter_p", "LEXICON-SLURPER-FILTER-P", 1, 0, false);
        declareFunction(me, "lexicon_slurper_filter_merge_method", "LEXICON-SLURPER-FILTER-MERGE-METHOD", 2, 0, false);
        declareFunction(me, "lexicon_slurper_filter_approve_method", "LEXICON-SLURPER-FILTER-APPROVE-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_proprietary_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_proprietary_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-PROPRIETARY-SLURPER-FILTER-INSTANCE", 1, 0, false);
        declareFunction(me, "proprietary_slurper_filter_p", "PROPRIETARY-SLURPER-FILTER-P", 1, 0, false);
        declareFunction(me, "proprietary_slurper_filter_initialize_method", "PROPRIETARY-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_person_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_person_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-PERSON-SLURPER-FILTER-INSTANCE", 1, 0, false);
        declareFunction(me, "person_slurper_filter_p", "PERSON-SLURPER-FILTER-P", 1, 0, false);
        declareFunction(me, "person_slurper_filter_initialize_method", "PERSON-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_arc_slurper_filter_class", "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_arc_slurper_filter_instance", "SUBLOOP-RESERVED-INITIALIZE-ARC-SLURPER-FILTER-INSTANCE", 1, 0, false);
        declareFunction(me, "arc_slurper_filter_p", "ARC-SLURPER-FILTER-P", 1, 0, false);
        declareFunction(me, "arc_slurper_filter_initialize_method", "ARC-SLURPER-FILTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "get_lexicon_slurper", "GET-LEXICON-SLURPER", 0, 0, false);
        declareFunction(me, "has_next_lexicon_entry", "HAS-NEXT-LEXICON-ENTRY", 0, 0, false);
        declareFunction(me, "next_lexicon_entry", "NEXT-LEXICON-ENTRY", 0, 0, false);
        declareFunction(me, "reset_lexicon_slurper", "RESET-LEXICON-SLURPER", 0, 0, false);
        declareFunction(me, "get_lexicon_slurper_current_key_value", "GET-LEXICON-SLURPER-CURRENT-KEY-VALUE", 1, 0, false);
        declareFunction(me, "set_lexicon_slurper_current_key_value", "SET-LEXICON-SLURPER-CURRENT-KEY-VALUE", 2, 0, false);
        declareFunction(me, "get_lexicon_slurper_slurper_filter", "GET-LEXICON-SLURPER-SLURPER-FILTER", 1, 0, false);
        declareFunction(me, "set_lexicon_slurper_slurper_filter", "SET-LEXICON-SLURPER-SLURPER-FILTER", 2, 0, false);
        declareFunction(me, "get_lexicon_slurper_lexicon_iterator", "GET-LEXICON-SLURPER-LEXICON-ITERATOR", 1, 0, false);
        declareFunction(me, "set_lexicon_slurper_lexicon_iterator", "SET-LEXICON-SLURPER-LEXICON-ITERATOR", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lexicon_slurper_class", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_lexicon_slurper_instance", "SUBLOOP-RESERVED-INITIALIZE-LEXICON-SLURPER-INSTANCE", 1, 0, false);
        declareFunction(me, "lexicon_slurper_p", "LEXICON-SLURPER-P", 1, 0, false);
        declareFunction(me, "lexicon_slurper_initialize_method", "LEXICON-SLURPER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "lexicon_slurper_has_next_method", "LEXICON-SLURPER-HAS-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "lexicon_slurper_next_method", "LEXICON-SLURPER-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "get_arc_lexicon_slurper", "GET-ARC-LEXICON-SLURPER", 0, 0, false);
        declareFunction(me, "has_next_arc_lexicon_entry", "HAS-NEXT-ARC-LEXICON-ENTRY", 0, 0, false);
        declareFunction(me, "next_arc_lexicon_entry", "NEXT-ARC-LEXICON-ENTRY", 0, 0, false);
        declareFunction(me, "reset_arc_lexicon_slurper", "RESET-ARC-LEXICON-SLURPER", 0, 0, false);
        declareFunction(me, "get_arc_lexicon_slurper_head_value", "GET-ARC-LEXICON-SLURPER-HEAD-VALUE", 1, 0, false);
        declareFunction(me, "set_arc_lexicon_slurper_head_value", "SET-ARC-LEXICON-SLURPER-HEAD-VALUE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_arc_lexicon_slurper_class", "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_arc_lexicon_slurper_instance", "SUBLOOP-RESERVED-INITIALIZE-ARC-LEXICON-SLURPER-INSTANCE", 1, 0, false);
        declareFunction(me, "arc_lexicon_slurper_p", "ARC-LEXICON-SLURPER-P", 1, 0, false);
        declareFunction(me, "arc_lexicon_slurper_initialize_method", "ARC-LEXICON-SLURPER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "arc_lexicon_slurper_next_method", "ARC-LEXICON-SLURPER-NEXT-METHOD", 1, 0, false);
        declareFunction(me, "make_safe_arc_key", "MAKE-SAFE-ARC-KEY", 1, 0, false);
        declareFunction(me, "make_arc_pos_denots_list", "MAKE-ARC-POS-DENOTS-LIST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_lexicon_slurpers_file() {
        defvar("*LEXICON-SLURPER*", NIL);
        defvar("*ARC-LEXICON-SLURPER*", NIL);
        return NIL;
    }

    public static SubLObject setup_lexicon_slurpers_file() {
        classes.subloop_new_class(LEXICON_SLURPER_FILTER, OBJECT, NIL, T, $list2);
        classes.class_set_implements_slot_listeners(LEXICON_SLURPER_FILTER, NIL);
        classes.subloop_note_class_initialization_function(LEXICON_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function(LEXICON_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_lexicon_slurper_filter_class(LEXICON_SLURPER_FILTER);
        methods.methods_incorporate_instance_method(MERGE, LEXICON_SLURPER_FILTER, $list11, $list12, $list13);
        methods.subloop_register_instance_method(LEXICON_SLURPER_FILTER, MERGE, LEXICON_SLURPER_FILTER_MERGE_METHOD);
        methods.methods_incorporate_instance_method(APPROVE, LEXICON_SLURPER_FILTER, $list11, $list18, $list19);
        methods.subloop_register_instance_method(LEXICON_SLURPER_FILTER, APPROVE, LEXICON_SLURPER_FILTER_APPROVE_METHOD);
        classes.subloop_new_class(PROPRIETARY_SLURPER_FILTER, LEXICON_SLURPER_FILTER, NIL, NIL, $list26);
        classes.class_set_implements_slot_listeners(PROPRIETARY_SLURPER_FILTER, NIL);
        classes.subloop_note_class_initialization_function(PROPRIETARY_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function(PROPRIETARY_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_PROPRIETARY_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_proprietary_slurper_filter_class(PROPRIETARY_SLURPER_FILTER);
        methods.methods_incorporate_instance_method(INITIALIZE, PROPRIETARY_SLURPER_FILTER, $list30, NIL, $list31);
        methods.subloop_register_instance_method(PROPRIETARY_SLURPER_FILTER, INITIALIZE, PROPRIETARY_SLURPER_FILTER_INITIALIZE_METHOD);
        classes.subloop_new_class(PERSON_SLURPER_FILTER, LEXICON_SLURPER_FILTER, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(PERSON_SLURPER_FILTER, NIL);
        classes.subloop_note_class_initialization_function(PERSON_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function(PERSON_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_PERSON_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_person_slurper_filter_class(PERSON_SLURPER_FILTER);
        methods.methods_incorporate_instance_method(INITIALIZE, PERSON_SLURPER_FILTER, $list30, NIL, $list38);
        methods.subloop_register_instance_method(PERSON_SLURPER_FILTER, INITIALIZE, PERSON_SLURPER_FILTER_INITIALIZE_METHOD);
        classes.subloop_new_class(ARC_SLURPER_FILTER, LEXICON_SLURPER_FILTER, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(ARC_SLURPER_FILTER, NIL);
        classes.subloop_note_class_initialization_function(ARC_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_CLASS);
        classes.subloop_note_instance_initialization_function(ARC_SLURPER_FILTER, SUBLOOP_RESERVED_INITIALIZE_ARC_SLURPER_FILTER_INSTANCE);
        subloop_reserved_initialize_arc_slurper_filter_class(ARC_SLURPER_FILTER);
        methods.methods_incorporate_instance_method(INITIALIZE, ARC_SLURPER_FILTER, $list30, NIL, $list45);
        methods.subloop_register_instance_method(ARC_SLURPER_FILTER, INITIALIZE, ARC_SLURPER_FILTER_INITIALIZE_METHOD);
        classes.subloop_new_class(LEXICON_SLURPER, OBJECT, NIL, NIL, $list50);
        classes.class_set_implements_slot_listeners(LEXICON_SLURPER, NIL);
        classes.subloop_note_class_initialization_function(LEXICON_SLURPER, SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_CLASS);
        classes.subloop_note_instance_initialization_function(LEXICON_SLURPER, SUBLOOP_RESERVED_INITIALIZE_LEXICON_SLURPER_INSTANCE);
        subloop_reserved_initialize_lexicon_slurper_class(LEXICON_SLURPER);
        methods.methods_incorporate_instance_method(INITIALIZE, LEXICON_SLURPER, $list30, NIL, $list56);
        methods.subloop_register_instance_method(LEXICON_SLURPER, INITIALIZE, LEXICON_SLURPER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(HAS_NEXT, LEXICON_SLURPER, $list60, NIL, $list61);
        methods.subloop_register_instance_method(LEXICON_SLURPER, HAS_NEXT, LEXICON_SLURPER_HAS_NEXT_METHOD);
        methods.methods_incorporate_instance_method(NEXT, LEXICON_SLURPER, $list11, NIL, $list63);
        methods.subloop_register_instance_method(LEXICON_SLURPER, NEXT, LEXICON_SLURPER_NEXT_METHOD);
        classes.subloop_new_class(ARC_LEXICON_SLURPER, LEXICON_SLURPER, NIL, NIL, $list67);
        classes.class_set_implements_slot_listeners(ARC_LEXICON_SLURPER, NIL);
        classes.subloop_note_class_initialization_function(ARC_LEXICON_SLURPER, SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_CLASS);
        classes.subloop_note_instance_initialization_function(ARC_LEXICON_SLURPER, SUBLOOP_RESERVED_INITIALIZE_ARC_LEXICON_SLURPER_INSTANCE);
        subloop_reserved_initialize_arc_lexicon_slurper_class(ARC_LEXICON_SLURPER);
        methods.methods_incorporate_instance_method(INITIALIZE, ARC_LEXICON_SLURPER, $list30, NIL, $list71);
        methods.subloop_register_instance_method(ARC_LEXICON_SLURPER, INITIALIZE, ARC_LEXICON_SLURPER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(NEXT, ARC_LEXICON_SLURPER, $list11, NIL, $list74);
        methods.subloop_register_instance_method(ARC_LEXICON_SLURPER, NEXT, ARC_LEXICON_SLURPER_NEXT_METHOD);
        return NIL;
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

    
}

/**
 * Total time: 300 ms
 */
