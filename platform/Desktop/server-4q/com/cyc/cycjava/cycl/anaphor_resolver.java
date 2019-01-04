package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class anaphor_resolver extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.anaphor_resolver";
    public static final String myFingerPrint = "4cabeac4907ffaccdedc00acd5319e006c9217aff48b9770491a4e8460635f99";
    private static final SubLSymbol $sym0$ANAPHOR_RESOLVER;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$COREF_DISCOURSE;
    private static final SubLSymbol $sym5$INSTANCE_COUNT;
    private static final SubLSymbol $sym6$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS;
    private static final SubLSymbol $sym7$ISOLATED_P;
    private static final SubLSymbol $sym8$INSTANCE_NUMBER;
    private static final SubLSymbol $sym9$NEW_DISCOURSE_EACH_RUN_;
    private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE;
    private static final SubLSymbol $sym11$RUN;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD;
    private static final SubLSymbol $sym16$GET_HEAD;
    private static final SubLSymbol $sym17$ANAPHOR_RESOLVER_RUN_METHOD;
    private static final SubLSymbol $sym18$NEW_DISCOURSE;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD;
    private static final SubLSymbol $sym21$ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject get_anaphor_resolver_coref_discourse(final SubLObject v_anaphor_resolver) {
        return classes.subloop_get_access_protected_instance_slot(v_anaphor_resolver, (SubLObject)anaphor_resolver.TWO_INTEGER, (SubLObject)anaphor_resolver.$sym4$COREF_DISCOURSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject set_anaphor_resolver_coref_discourse(final SubLObject v_anaphor_resolver, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_anaphor_resolver, value, (SubLObject)anaphor_resolver.TWO_INTEGER, (SubLObject)anaphor_resolver.$sym4$COREF_DISCOURSE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject get_anaphor_resolver_new_discourse_each_runP(final SubLObject v_anaphor_resolver) {
        return classes.subloop_get_instance_slot(v_anaphor_resolver, (SubLObject)anaphor_resolver.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject set_anaphor_resolver_new_discourse_each_runP(final SubLObject v_anaphor_resolver, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_anaphor_resolver, value, (SubLObject)anaphor_resolver.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject subloop_reserved_initialize_anaphor_resolver_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)anaphor_resolver.$sym1$OBJECT, (SubLObject)anaphor_resolver.$sym5$INSTANCE_COUNT, (SubLObject)anaphor_resolver.ZERO_INTEGER);
        return (SubLObject)anaphor_resolver.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject subloop_reserved_initialize_anaphor_resolver_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)anaphor_resolver.$sym1$OBJECT, (SubLObject)anaphor_resolver.$sym7$ISOLATED_P, (SubLObject)anaphor_resolver.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)anaphor_resolver.$sym1$OBJECT, (SubLObject)anaphor_resolver.$sym8$INSTANCE_NUMBER, (SubLObject)anaphor_resolver.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym9$NEW_DISCOURSE_EACH_RUN_, (SubLObject)anaphor_resolver.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym4$COREF_DISCOURSE, (SubLObject)anaphor_resolver.NIL);
        return (SubLObject)anaphor_resolver.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 867L)
    public static SubLObject anaphor_resolver_p(final SubLObject v_anaphor_resolver) {
        return classes.subloop_instanceof_class(v_anaphor_resolver, (SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 1148L)
    public static SubLObject anaphor_resolver_run_method(final SubLObject self, final SubLObject parse_trees) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_anaphor_resolver_method = (SubLObject)anaphor_resolver.NIL;
        SubLObject coref_discourse = get_anaphor_resolver_coref_discourse(self);
        final SubLObject new_discourse_each_runP = get_anaphor_resolver_new_discourse_each_runP(self);
        try {
            thread.throwStack.push(anaphor_resolver.$sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
            try {
                if (anaphor_resolver.NIL != new_discourse_each_runP || anaphor_resolver.NIL == coref_discourse) {
                    coref_discourse = coreference_resolution.new_coref_discourse((SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED);
                }
                coreference_resolution.resolve_coreferences_in_list_of_parse_trees(parse_trees, coref_discourse);
                final SubLObject coref_lists = coreference_resolution.coref_discourse_coreferring_expressions(coref_discourse);
                SubLObject coref_word_lists = (SubLObject)anaphor_resolver.NIL;
                SubLObject cdolist_list_var = coref_lists;
                SubLObject coref_list = (SubLObject)anaphor_resolver.NIL;
                coref_list = cdolist_list_var.first();
                while (anaphor_resolver.NIL != cdolist_list_var) {
                    SubLObject coref_word_list = (SubLObject)anaphor_resolver.NIL;
                    SubLObject cdolist_list_var_$1 = coref_list;
                    SubLObject v_parse_tree = (SubLObject)anaphor_resolver.NIL;
                    v_parse_tree = cdolist_list_var_$1.first();
                    while (anaphor_resolver.NIL != cdolist_list_var_$1) {
                        final SubLObject v_word_tree = (anaphor_resolver.NIL != parse_tree.phrase_tree_p(v_parse_tree)) ? methods.funcall_instance_method_with_0_args(v_parse_tree, (SubLObject)anaphor_resolver.$sym16$GET_HEAD) : v_parse_tree;
                        coref_word_list = (SubLObject)ConsesLow.cons(v_word_tree, coref_word_list);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        v_parse_tree = cdolist_list_var_$1.first();
                    }
                    coref_word_lists = (SubLObject)ConsesLow.cons(Sequences.nreverse(coref_word_list), coref_word_lists);
                    cdolist_list_var = cdolist_list_var.rest();
                    coref_list = cdolist_list_var.first();
                }
                Dynamic.sublisp_throw((SubLObject)anaphor_resolver.$sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, Sequences.nreverse(coref_word_lists));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)anaphor_resolver.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_anaphor_resolver_coref_discourse(self, coref_discourse);
                    set_anaphor_resolver_new_discourse_each_runP(self, new_discourse_each_runP);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_anaphor_resolver_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)anaphor_resolver.$sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_anaphor_resolver_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/anaphor-resolver.lisp", position = 1970L)
    public static SubLObject anaphor_resolver_new_discourse_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_anaphor_resolver_method = (SubLObject)anaphor_resolver.NIL;
        SubLObject coref_discourse = get_anaphor_resolver_coref_discourse(self);
        try {
            thread.throwStack.push(anaphor_resolver.$sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
            try {
                coref_discourse = coreference_resolution.new_coref_discourse((SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED, (SubLObject)anaphor_resolver.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)anaphor_resolver.$sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, (SubLObject)anaphor_resolver.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)anaphor_resolver.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_anaphor_resolver_coref_discourse(self, coref_discourse);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_anaphor_resolver_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)anaphor_resolver.$sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_anaphor_resolver_method;
    }
    
    public static SubLObject declare_anaphor_resolver_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "get_anaphor_resolver_coref_discourse", "GET-ANAPHOR-RESOLVER-COREF-DISCOURSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "set_anaphor_resolver_coref_discourse", "SET-ANAPHOR-RESOLVER-COREF-DISCOURSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "get_anaphor_resolver_new_discourse_each_runP", "GET-ANAPHOR-RESOLVER-NEW-DISCOURSE-EACH-RUN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "set_anaphor_resolver_new_discourse_each_runP", "SET-ANAPHOR-RESOLVER-NEW-DISCOURSE-EACH-RUN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "subloop_reserved_initialize_anaphor_resolver_class", "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "subloop_reserved_initialize_anaphor_resolver_instance", "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "anaphor_resolver_p", "ANAPHOR-RESOLVER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "anaphor_resolver_run_method", "ANAPHOR-RESOLVER-RUN-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.anaphor_resolver", "anaphor_resolver_new_discourse_method", "ANAPHOR-RESOLVER-NEW-DISCOURSE-METHOD", 1, 0, false);
        return (SubLObject)anaphor_resolver.NIL;
    }
    
    public static SubLObject init_anaphor_resolver_file() {
        return (SubLObject)anaphor_resolver.NIL;
    }
    
    public static SubLObject setup_anaphor_resolver_file() {
        classes.subloop_new_class((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym1$OBJECT, (SubLObject)anaphor_resolver.$list2, (SubLObject)anaphor_resolver.NIL, (SubLObject)anaphor_resolver.$list3);
        classes.class_set_implements_slot_listeners((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym6$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym10$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE);
        subloop_reserved_initialize_anaphor_resolver_class((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER);
        methods.methods_incorporate_instance_method((SubLObject)anaphor_resolver.$sym11$RUN, (SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$list12, (SubLObject)anaphor_resolver.$list13, (SubLObject)anaphor_resolver.$list14);
        methods.subloop_register_instance_method((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym11$RUN, (SubLObject)anaphor_resolver.$sym17$ANAPHOR_RESOLVER_RUN_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)anaphor_resolver.$sym18$NEW_DISCOURSE, (SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$list12, (SubLObject)anaphor_resolver.NIL, (SubLObject)anaphor_resolver.$list19);
        methods.subloop_register_instance_method((SubLObject)anaphor_resolver.$sym0$ANAPHOR_RESOLVER, (SubLObject)anaphor_resolver.$sym18$NEW_DISCOURSE, (SubLObject)anaphor_resolver.$sym21$ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD);
        return (SubLObject)anaphor_resolver.NIL;
    }
    
    public void declareFunctions() {
        declare_anaphor_resolver_file();
    }
    
    public void initializeVariables() {
        init_anaphor_resolver_file();
    }
    
    public void runTopLevelForms() {
        setup_anaphor_resolver_file();
    }
    
    static {
        me = (SubLFile)new anaphor_resolver();
        $sym0$ANAPHOR_RESOLVER = SubLObjectFactory.makeSymbol("ANAPHOR-RESOLVER");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREFERENCE-RESOLVER"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DISCOURSE-EACH-RUN?"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)anaphor_resolver.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DISCOURSE"), (SubLObject)anaphor_resolver.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym4$COREF_DISCOURSE = SubLObjectFactory.makeSymbol("COREF-DISCOURSE");
        $sym5$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym6$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-CLASS");
        $sym7$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym8$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym9$NEW_DISCOURSE_EACH_RUN_ = SubLObjectFactory.makeSymbol("NEW-DISCOURSE-EACH-RUN?");
        $sym10$SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-INSTANCE");
        $sym11$RUN = SubLObjectFactory.makeSymbol("RUN");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-DISCOURSE-EACH-RUN?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COREF-DISCOURSE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOLVE-COREFERENCES-IN-LIST-OF-PARSE-TREES"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-LISTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE-COREFERRING-EXPRESSIONS"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-WORD-LISTS"), (SubLObject)anaphor_resolver.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-LISTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COREF-WORD-LIST"), (SubLObject)anaphor_resolver.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-LIST")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHRASE-TREE-P"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-HEAD"))), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("WORD-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-WORD-LIST")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-WORD-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("COREF-WORD-LISTS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-WORD-LISTS")))));
        $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANAPHOR-RESOLVER-METHOD");
        $sym16$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym17$ANAPHOR_RESOLVER_RUN_METHOD = SubLObjectFactory.makeSymbol("ANAPHOR-RESOLVER-RUN-METHOD");
        $sym18$NEW_DISCOURSE = SubLObjectFactory.makeSymbol("NEW-DISCOURSE");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Clear out any previous discourse that this instance has been run on."), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("COREF-DISCOURSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-COREF-DISCOURSE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)anaphor_resolver.NIL));
        $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-ANAPHOR-RESOLVER-METHOD");
        $sym21$ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD = SubLObjectFactory.makeSymbol("ANAPHOR-RESOLVER-NEW-DISCOURSE-METHOD");
    }
}

/*

	Total time: 71 ms
	
*/