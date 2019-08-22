/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class anaphor_resolver extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new anaphor_resolver();

 public static final String myName = "com.cyc.cycjava.cycl.anaphor_resolver";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol ANAPHOR_RESOLVER = makeSymbol("ANAPHOR-RESOLVER");

    static private final SubLList $list2 = list(makeSymbol("COREFERENCE-RESOLVER"));

    static private final SubLList $list3 = list(list(makeSymbol("NEW-DISCOURSE-EACH-RUN?"), makeKeyword("INSTANCE"), makeKeyword("VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("COREF-DISCOURSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-DISCOURSE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-CLASS");

    static private final SubLSymbol $sym9$NEW_DISCOURSE_EACH_RUN_ = makeSymbol("NEW-DISCOURSE-EACH-RUN?");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-INSTANCE");

    static private final SubLList $list12 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list13 = list(makeSymbol("PARSE-TREES"));

    static private final SubLList $list14 = list(list(makeSymbol("PWHEN"), list(makeSymbol("COR"), makeSymbol("NEW-DISCOURSE-EACH-RUN?"), list(makeSymbol("NULL"), makeSymbol("COREF-DISCOURSE"))), list(makeSymbol("CSETQ"), makeSymbol("COREF-DISCOURSE"), list(makeSymbol("NEW-COREF-DISCOURSE")))), list(makeSymbol("RESOLVE-COREFERENCES-IN-LIST-OF-PARSE-TREES"), makeSymbol("PARSE-TREES"), makeSymbol("COREF-DISCOURSE")), list(makeSymbol("CLET"), list(list(makeSymbol("COREF-LISTS"), list(makeSymbol("COREF-DISCOURSE-COREFERRING-EXPRESSIONS"), makeSymbol("COREF-DISCOURSE"))), list(makeSymbol("COREF-WORD-LISTS"), NIL)), list(makeSymbol("DO-LIST"), list(makeSymbol("COREF-LIST"), makeSymbol("COREF-LISTS")), list(makeSymbol("CLET"), list(list(makeSymbol("COREF-WORD-LIST"), NIL)), list(makeSymbol("DO-LIST"), list(makeSymbol("PARSE-TREE"), makeSymbol("COREF-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-TREE"), list(makeSymbol("FIF"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("PARSE-TREE")), list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("PARSE-TREE")))), list(makeSymbol("CPUSH"), makeSymbol("WORD-TREE"), makeSymbol("COREF-WORD-LIST")))), list(makeSymbol("CPUSH"), list(makeSymbol("NREVERSE"), makeSymbol("COREF-WORD-LIST")), makeSymbol("COREF-WORD-LISTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("COREF-WORD-LISTS")))));

    static private final SubLSymbol $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANAPHOR-RESOLVER-METHOD");

    private static final SubLSymbol ANAPHOR_RESOLVER_RUN_METHOD = makeSymbol("ANAPHOR-RESOLVER-RUN-METHOD");

    private static final SubLSymbol NEW_DISCOURSE = makeSymbol("NEW-DISCOURSE");

    static private final SubLList $list19 = list(makeString("Clear out any previous discourse that this instance has been run on."), list(makeSymbol("CSETQ"), makeSymbol("COREF-DISCOURSE"), list(makeSymbol("NEW-COREF-DISCOURSE"))), list(RET, NIL));

    static private final SubLSymbol $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANAPHOR-RESOLVER-METHOD");

    private static final SubLSymbol ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD = makeSymbol("ANAPHOR-RESOLVER-NEW-DISCOURSE-METHOD");

    // Definitions
    public static final SubLObject get_anaphor_resolver_coref_discourse_alt(SubLObject v_anaphor_resolver) {
        return classes.subloop_get_access_protected_instance_slot(v_anaphor_resolver, TWO_INTEGER, COREF_DISCOURSE);
    }

    // Definitions
    public static SubLObject get_anaphor_resolver_coref_discourse(final SubLObject v_anaphor_resolver) {
        return classes.subloop_get_access_protected_instance_slot(v_anaphor_resolver, TWO_INTEGER, COREF_DISCOURSE);
    }

    public static final SubLObject set_anaphor_resolver_coref_discourse_alt(SubLObject v_anaphor_resolver, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_anaphor_resolver, value, TWO_INTEGER, COREF_DISCOURSE);
    }

    public static SubLObject set_anaphor_resolver_coref_discourse(final SubLObject v_anaphor_resolver, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_anaphor_resolver, value, TWO_INTEGER, COREF_DISCOURSE);
    }

    public static final SubLObject get_anaphor_resolver_new_discourse_each_runP_alt(SubLObject v_anaphor_resolver) {
        return classes.subloop_get_instance_slot(v_anaphor_resolver, ONE_INTEGER);
    }

    public static SubLObject get_anaphor_resolver_new_discourse_each_runP(final SubLObject v_anaphor_resolver) {
        return classes.subloop_get_instance_slot(v_anaphor_resolver, ONE_INTEGER);
    }

    public static final SubLObject set_anaphor_resolver_new_discourse_each_runP_alt(SubLObject v_anaphor_resolver, SubLObject value) {
        return classes.subloop_set_instance_slot(v_anaphor_resolver, value, ONE_INTEGER);
    }

    public static SubLObject set_anaphor_resolver_new_discourse_each_runP(final SubLObject v_anaphor_resolver, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_anaphor_resolver, value, ONE_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_anaphor_resolver_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_anaphor_resolver_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_anaphor_resolver_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANAPHOR_RESOLVER, $sym9$NEW_DISCOURSE_EACH_RUN_, NIL);
        classes.subloop_initialize_slot(new_instance, ANAPHOR_RESOLVER, COREF_DISCOURSE, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_anaphor_resolver_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANAPHOR_RESOLVER, $sym9$NEW_DISCOURSE_EACH_RUN_, NIL);
        classes.subloop_initialize_slot(new_instance, ANAPHOR_RESOLVER, COREF_DISCOURSE, NIL);
        return NIL;
    }

    public static final SubLObject anaphor_resolver_p_alt(SubLObject v_anaphor_resolver) {
        return classes.subloop_instanceof_class(v_anaphor_resolver, ANAPHOR_RESOLVER);
    }

    public static SubLObject anaphor_resolver_p(final SubLObject v_anaphor_resolver) {
        return classes.subloop_instanceof_class(v_anaphor_resolver, ANAPHOR_RESOLVER);
    }

    public static final SubLObject anaphor_resolver_run_method_alt(SubLObject self, SubLObject parse_trees) {
        {
            SubLObject catch_var_for_anaphor_resolver_method = NIL;
            SubLObject coref_discourse = com.cyc.cycjava.cycl.anaphor_resolver.get_anaphor_resolver_coref_discourse(self);
            SubLObject new_discourse_each_runP = com.cyc.cycjava.cycl.anaphor_resolver.get_anaphor_resolver_new_discourse_each_runP(self);
            try {
                try {
                    if ((NIL != new_discourse_each_runP) || (NIL == coref_discourse)) {
                        coref_discourse = coreference_resolution.new_coref_discourse(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    coreference_resolution.resolve_coreferences_in_list_of_parse_trees(parse_trees, coref_discourse);
                    {
                        SubLObject coref_lists = coreference_resolution.coref_discourse_coreferring_expressions(coref_discourse);
                        SubLObject coref_word_lists = NIL;
                        SubLObject cdolist_list_var = coref_lists;
                        SubLObject coref_list = NIL;
                        for (coref_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , coref_list = cdolist_list_var.first()) {
                            {
                                SubLObject coref_word_list = NIL;
                                SubLObject cdolist_list_var_1 = coref_list;
                                SubLObject v_parse_tree = NIL;
                                for (v_parse_tree = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , v_parse_tree = cdolist_list_var_1.first()) {
                                    {
                                        SubLObject v_word_tree = (NIL != parse_tree.phrase_tree_p(v_parse_tree)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(v_parse_tree, GET_HEAD))) : v_parse_tree;
                                        coref_word_list = cons(v_word_tree, coref_word_list);
                                    }
                                }
                                coref_word_lists = cons(nreverse(coref_word_list), coref_word_lists);
                            }
                        }
                        sublisp_throw($sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, nreverse(coref_word_lists));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.anaphor_resolver.set_anaphor_resolver_coref_discourse(self, coref_discourse);
                            com.cyc.cycjava.cycl.anaphor_resolver.set_anaphor_resolver_new_discourse_each_runP(self, new_discourse_each_runP);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_anaphor_resolver_method = Errors.handleThrowable(ccatch_env_var, $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
            }
            return catch_var_for_anaphor_resolver_method;
        }
    }

    public static SubLObject anaphor_resolver_run_method(final SubLObject self, final SubLObject parse_trees) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_anaphor_resolver_method = NIL;
        SubLObject coref_discourse = get_anaphor_resolver_coref_discourse(self);
        final SubLObject new_discourse_each_runP = get_anaphor_resolver_new_discourse_each_runP(self);
        try {
            thread.throwStack.push($sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
            try {
                if ((NIL != new_discourse_each_runP) || (NIL == coref_discourse)) {
                    coref_discourse = coreference_resolution.new_coref_discourse(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                coreference_resolution.resolve_coreferences_in_list_of_parse_trees(parse_trees, coref_discourse);
                final SubLObject coref_lists = coreference_resolution.coref_discourse_coreferring_expressions(coref_discourse);
                SubLObject coref_word_lists = NIL;
                SubLObject cdolist_list_var = coref_lists;
                SubLObject coref_list = NIL;
                coref_list = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject coref_word_list = NIL;
                    SubLObject cdolist_list_var_$1 = coref_list;
                    SubLObject v_parse_tree = NIL;
                    v_parse_tree = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        final SubLObject v_word_tree = (NIL != parse_tree.phrase_tree_p(v_parse_tree)) ? methods.funcall_instance_method_with_0_args(v_parse_tree, GET_HEAD) : v_parse_tree;
                        coref_word_list = cons(v_word_tree, coref_word_list);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        v_parse_tree = cdolist_list_var_$1.first();
                    } 
                    coref_word_lists = cons(nreverse(coref_word_list), coref_word_lists);
                    cdolist_list_var = cdolist_list_var.rest();
                    coref_list = cdolist_list_var.first();
                } 
                sublisp_throw($sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, nreverse(coref_word_lists));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_anaphor_resolver_coref_discourse(self, coref_discourse);
                    set_anaphor_resolver_new_discourse_each_runP(self, new_discourse_each_runP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_anaphor_resolver_method = Errors.handleThrowable(ccatch_env_var, $sym15$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_anaphor_resolver_method;
    }

    /**
     * Clear out any previous discourse that this instance has been run on.
     */
    @LispMethod(comment = "Clear out any previous discourse that this instance has been run on.")
    public static final SubLObject anaphor_resolver_new_discourse_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_anaphor_resolver_method = NIL;
            SubLObject coref_discourse = com.cyc.cycjava.cycl.anaphor_resolver.get_anaphor_resolver_coref_discourse(self);
            try {
                try {
                    coref_discourse = coreference_resolution.new_coref_discourse(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    sublisp_throw($sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.anaphor_resolver.set_anaphor_resolver_coref_discourse(self, coref_discourse);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_anaphor_resolver_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
            }
            return catch_var_for_anaphor_resolver_method;
        }
    }

    /**
     * Clear out any previous discourse that this instance has been run on.
     */
    @LispMethod(comment = "Clear out any previous discourse that this instance has been run on.")
    public static SubLObject anaphor_resolver_new_discourse_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_anaphor_resolver_method = NIL;
        SubLObject coref_discourse = get_anaphor_resolver_coref_discourse(self);
        try {
            thread.throwStack.push($sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
            try {
                coref_discourse = coreference_resolution.new_coref_discourse(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_anaphor_resolver_coref_discourse(self, coref_discourse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_anaphor_resolver_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_ANAPHOR_RESOLVER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_anaphor_resolver_method;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("COREFERENCE-RESOLVER"));

    static private final SubLList $list_alt3 = list(list(makeSymbol("NEW-DISCOURSE-EACH-RUN?"), makeKeyword("INSTANCE"), makeKeyword("VALUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("COREF-DISCOURSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-DISCOURSE"), NIL, makeKeyword("PUBLIC")));

    static private final SubLList $list_alt12 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt13 = list(makeSymbol("PARSE-TREES"));

    public static SubLObject declare_anaphor_resolver_file() {
        declareFunction("get_anaphor_resolver_coref_discourse", "GET-ANAPHOR-RESOLVER-COREF-DISCOURSE", 1, 0, false);
        declareFunction("set_anaphor_resolver_coref_discourse", "SET-ANAPHOR-RESOLVER-COREF-DISCOURSE", 2, 0, false);
        declareFunction("get_anaphor_resolver_new_discourse_each_runP", "GET-ANAPHOR-RESOLVER-NEW-DISCOURSE-EACH-RUN?", 1, 0, false);
        declareFunction("set_anaphor_resolver_new_discourse_each_runP", "SET-ANAPHOR-RESOLVER-NEW-DISCOURSE-EACH-RUN?", 2, 0, false);
        declareFunction("subloop_reserved_initialize_anaphor_resolver_class", "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_anaphor_resolver_instance", "SUBLOOP-RESERVED-INITIALIZE-ANAPHOR-RESOLVER-INSTANCE", 1, 0, false);
        declareFunction("anaphor_resolver_p", "ANAPHOR-RESOLVER-P", 1, 0, false);
        declareFunction("anaphor_resolver_run_method", "ANAPHOR-RESOLVER-RUN-METHOD", 2, 0, false);
        declareFunction("anaphor_resolver_new_discourse_method", "ANAPHOR-RESOLVER-NEW-DISCOURSE-METHOD", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt14 = list(list(makeSymbol("PWHEN"), list(makeSymbol("COR"), makeSymbol("NEW-DISCOURSE-EACH-RUN?"), list(makeSymbol("NULL"), makeSymbol("COREF-DISCOURSE"))), list(makeSymbol("CSETQ"), makeSymbol("COREF-DISCOURSE"), list(makeSymbol("NEW-COREF-DISCOURSE")))), list(makeSymbol("RESOLVE-COREFERENCES-IN-LIST-OF-PARSE-TREES"), makeSymbol("PARSE-TREES"), makeSymbol("COREF-DISCOURSE")), list(makeSymbol("CLET"), list(list(makeSymbol("COREF-LISTS"), list(makeSymbol("COREF-DISCOURSE-COREFERRING-EXPRESSIONS"), makeSymbol("COREF-DISCOURSE"))), list(makeSymbol("COREF-WORD-LISTS"), NIL)), list(makeSymbol("DO-LIST"), list(makeSymbol("COREF-LIST"), makeSymbol("COREF-LISTS")), list(makeSymbol("CLET"), list(list(makeSymbol("COREF-WORD-LIST"), NIL)), list(makeSymbol("DO-LIST"), list(makeSymbol("PARSE-TREE"), makeSymbol("COREF-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-TREE"), list(makeSymbol("FIF"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("PARSE-TREE")), list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("PARSE-TREE")))), list(makeSymbol("CPUSH"), makeSymbol("WORD-TREE"), makeSymbol("COREF-WORD-LIST")))), list(makeSymbol("CPUSH"), list(makeSymbol("NREVERSE"), makeSymbol("COREF-WORD-LIST")), makeSymbol("COREF-WORD-LISTS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("COREF-WORD-LISTS")))));

    public static SubLObject init_anaphor_resolver_file() {
        return NIL;
    }

    public static SubLObject setup_anaphor_resolver_file() {
        classes.subloop_new_class(ANAPHOR_RESOLVER, OBJECT, $list2, NIL, $list3);
        classes.class_set_implements_slot_listeners(ANAPHOR_RESOLVER, NIL);
        classes.subloop_note_class_initialization_function(ANAPHOR_RESOLVER, SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_CLASS);
        classes.subloop_note_instance_initialization_function(ANAPHOR_RESOLVER, SUBLOOP_RESERVED_INITIALIZE_ANAPHOR_RESOLVER_INSTANCE);
        subloop_reserved_initialize_anaphor_resolver_class(ANAPHOR_RESOLVER);
        methods.methods_incorporate_instance_method(RUN, ANAPHOR_RESOLVER, $list12, $list13, $list14);
        methods.subloop_register_instance_method(ANAPHOR_RESOLVER, RUN, ANAPHOR_RESOLVER_RUN_METHOD);
        methods.methods_incorporate_instance_method(NEW_DISCOURSE, ANAPHOR_RESOLVER, $list12, NIL, $list19);
        methods.subloop_register_instance_method(ANAPHOR_RESOLVER, NEW_DISCOURSE, ANAPHOR_RESOLVER_NEW_DISCOURSE_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt19 = list(makeString("Clear out any previous discourse that this instance has been run on."), list(makeSymbol("CSETQ"), makeSymbol("COREF-DISCOURSE"), list(makeSymbol("NEW-COREF-DISCOURSE"))), list(RET, NIL));

    @Override
    public void declareFunctions() {
        declare_anaphor_resolver_file();
    }

    @Override
    public void initializeVariables() {
        init_anaphor_resolver_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_anaphor_resolver_file();
    }

    
}

/**
 * Total time: 71 ms
 */
