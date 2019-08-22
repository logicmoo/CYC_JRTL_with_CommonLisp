/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$inference_answer_handler$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SHOP-MT-WORLD-STATE
 * source file: /cyc/top/cycl/shop-mt-world-state.lisp
 * created:     2019/07/03 17:38:26
 */
public final class shop_mt_world_state extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new shop_mt_world_state();

 public static final String myName = "com.cyc.cycjava.cycl.shop_mt_world_state";


    // defparameter
    /**
     * This should be a distinctive prefix, once we figure out what it should be.
     */
    @LispMethod(comment = "This should be a distinctive prefix, once we figure out what it should be.\ndefparameter")
    private static final SubLSymbol $shop_hyp_mt_prefix$ = makeSymbol("*SHOP-HYP-MT-PREFIX*");

    static private final SubLList $list2 = list(makeSymbol("SHOP-WORLD-STATE"));

    static private final SubLList $list3 = list(list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DELETES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FILTER-DELETED-BINDINGS"), list(makeSymbol("BINDINGS")), makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-INSTANCE");

    static private final SubLString $str11$SHOP_WS = makeString("SHOP-WS");

    static private final SubLList $list13 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list14 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DELETES"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL), TEN_INTEGER)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    private static final SubLSymbol SHOP_MT_WORLD_STATE_INITIALIZE_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-INITIALIZE-METHOD");

    private static final SubLSymbol COPY_STATE = makeSymbol("COPY-STATE");

    static private final SubLList $list18 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-MT-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-MT-WORLD-STATE"))))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-STATE"), list(QUOTE, makeSymbol("MT")), makeSymbol("MT")), list(RET, makeSymbol("NEW-STATE"))));

    static private final SubLSymbol $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    private static final SubLSymbol SHOP_MT_WORLD_STATE_COPY_STATE_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-COPY-STATE-METHOD");

    static private final SubLList $list22 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COPY-STATE"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"))), list(makeSymbol("NEXT-MT"), list(makeSymbol("HYPOTHESIZE-SPEC-MT"), makeSymbol("MT"), makeSymbol("*SHOP-HYP-MT-PREFIX*")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEXT-STATE"), list(QUOTE, makeSymbol("MT")), makeSymbol("NEXT-MT")), list(RET, makeSymbol("NEXT-STATE"))));

    static private final SubLSymbol $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    private static final SubLSymbol SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-NEXT-STATE-METHOD");

    private static final SubLSymbol ADD_ATOM = makeSymbol("ADD-ATOM");

    static private final SubLList $list26 = list(makeSymbol("LITERAL"));

    static private final SubLList $list27 = list(list(makeSymbol("ASSERT-MUST"), list(makeSymbol("GAF?"), makeSymbol("LITERAL")), makeString("(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground.")), list(makeSymbol("CYC-ASSERT"), makeSymbol("LITERAL"), makeSymbol("MT"), list(QUOTE, list(makeKeyword("MONOTONIC"), makeKeyword("FORWARD")))), list(makeSymbol("PWHEN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("LITERAL"), makeSymbol("DELETES")), list(makeSymbol("SET-REMOVE"), makeSymbol("LITERAL"), makeSymbol("DELETES"))), list(RET, NIL));

    static private final SubLSymbol $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    static private final SubLList $list29 = list(makeKeyword("MONOTONIC"), makeKeyword("FORWARD"));

    private static final SubLSymbol SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-ADD-ATOM-METHOD");

    private static final SubLSymbol DELETE_ATOM = makeSymbol("DELETE-ATOM");

    static private final SubLList $list32 = list(list(makeSymbol("ASSERT-MUST"), list(makeSymbol("GAF?"), makeSymbol("LITERAL")), makeString("(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground.")), list(makeSymbol("CYC-ASSERT"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("not"), makeSymbol("LITERAL")), makeSymbol("MT"), list(QUOTE, list(makeKeyword("MONOTONIC"), makeKeyword("FORWARD")))), list(RET, list(makeSymbol("SET-ADD"), makeSymbol("LITERAL"), makeSymbol("DELETES"))));

    static private final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");



    private static final SubLSymbol SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-DELETE-ATOM-METHOD");

    static private final SubLList $list37 = list(makeSymbol("LITERALS"));

    static private final SubLList $list38 = list(makeString("@param LITERALS listp"), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("LITERALS")), list(makeSymbol("ADD-ATOM"), makeSymbol("SELF"), makeSymbol("LIT"))), list(RET, NIL));

    private static final SubLSymbol SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-ADD-LITERALS-METHOD");

    static private final SubLList $list41 = list(makeString("@param LITERALS listp"), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("LITERALS")), list(makeSymbol("DELETE-ATOM"), makeSymbol("SELF"), makeSymbol("LIT"))), list(RET, NIL));

    private static final SubLSymbol SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-DELETE-LITERALS-METHOD");

    private static final SubLSymbol ADD_LITERAL = makeSymbol("ADD-LITERAL");

    static private final SubLList $list44 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-ATOM"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"), makeSymbol("LITERAL"))));

    private static final SubLSymbol SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-ADD-LITERAL-METHOD");

    private static final SubLSymbol DELETE_LITERAL = makeSymbol("DELETE-LITERAL");

    static private final SubLList $list47 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETE-ATOM"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"), makeSymbol("LITERAL"))));

    private static final SubLSymbol SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-DELETE-LITERAL-METHOD");

    private static final SubLSymbol SAME_STATE_P = makeSymbol("SAME-STATE-P");

    static private final SubLList $list50 = list(makeSymbol("STATE1"), makeSymbol("STATE2"));

    static private final SubLList $list51 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MT1"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("MT"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE1"))), list(makeSymbol("DELETES1"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("DELETES"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE1"))), list(makeSymbol("MT2"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("MT"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE2"))), list(makeSymbol("DELETES2"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("DELETES"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE2")))), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), list(makeSymbol("SET-SUBSET?"), makeSymbol("DELETES1"), makeSymbol("DELETES2")), list(makeSymbol("SET-SUBSET?"), makeSymbol("DELETES2"), makeSymbol("DELETES1"))), list(RET, NIL)), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("MT1"), makeSymbol("MT2")), list(RET, T)), list(RET, NIL)));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    private static final SubLSymbol SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-SAME-STATE-P-METHOD");

    private static final SubLSymbol FILTER_DELETED_BINDINGS = makeSymbol("FILTER-DELETED-BINDINGS");

    static private final SubLList $list55 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list56 = list(makeSymbol("BINDINGS"));

    static private final SubLList $list57 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-BINDINGS"), NIL)), list(makeSymbol("PIF"), list(makeSymbol("SET-EMPTY?"), makeSymbol("DELETES")), list(makeSymbol("CSETQ"), makeSymbol("NEW-BINDINGS"), makeSymbol("BINDINGS")), list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-BINDING"), makeSymbol("BINDINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("DONE?"), NIL), list(makeSymbol("BAD-BINDING?"), NIL)), list(makeSymbol("CSOME"), list(makeSymbol("CUR-SUPPORT"), list(makeSymbol("SECOND"), makeSymbol("CUR-BINDING")), makeSymbol("DONE?")), list(makeSymbol("PWHEN"), list(makeSymbol("GAF-ASSERTION?"), makeSymbol("CUR-SUPPORT")), list(makeSymbol("PWHEN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("CUR-SUPPORT"), makeSymbol("DELETES")), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T), list(makeSymbol("CSETQ"), makeSymbol("BAD-BINDING?"), T)))), list(makeSymbol("PUNLESS"), makeSymbol("BAD-BINDING?"), list(makeSymbol("CPUSH"), makeSymbol("CUR-BINDING"), makeSymbol("NEW-BINDINGS"))))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("NEW-BINDINGS")))));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    private static final SubLSymbol SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-FILTER-DELETED-BINDINGS-METHOD");

    static private final SubLList $list61 = list(makeSymbol("FORMULA"), makeSymbol("MBIND"), makeSymbol("BACKCHAIN"));

    static private final SubLList $list62 = list(list(makeSymbol("IGNORE"), makeSymbol("MBIND")), list(makeSymbol("CLET"), list(list(makeSymbol("*INFERENCE-ANSWER-HANDLER*"), list(makeSymbol("FIF"), makeSymbol("*SHOP-USE-INFERENCE-SUPPORTS?*"), list(QUOTE, makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS")), list(QUOTE, makeSymbol("INFERENCE-RETURN-BLISTS")))), makeSymbol("BINDINGS")), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-SHOP-ASK?*"), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("SHOP-ASK"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("BACKCHAIN"))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("FI-ASK-INT"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("BACKCHAIN")))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FILTER-DELETED-BINDINGS"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"), makeSymbol("BINDINGS"))), list(RET, makeSymbol("BINDINGS"))));

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");

    private static final SubLSymbol INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");

    private static final SubLSymbol INFERENCE_RETURN_BLISTS = makeSymbol("INFERENCE-RETURN-BLISTS");

    private static final SubLSymbol SHOP_MT_WORLD_STATE_ASK_METHOD = makeSymbol("SHOP-MT-WORLD-STATE-ASK-METHOD");

    // Definitions
    public static final SubLObject get_shop_mt_world_state_deletes_alt(SubLObject v_shop_mt_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_mt_world_state, TWO_INTEGER, DELETES);
    }

    // Definitions
    public static SubLObject get_shop_mt_world_state_deletes(final SubLObject v_shop_mt_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_mt_world_state, TWO_INTEGER, DELETES);
    }

    public static final SubLObject set_shop_mt_world_state_deletes_alt(SubLObject v_shop_mt_world_state, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_mt_world_state, value, TWO_INTEGER, DELETES);
    }

    public static SubLObject set_shop_mt_world_state_deletes(final SubLObject v_shop_mt_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_mt_world_state, value, TWO_INTEGER, DELETES);
    }

    public static final SubLObject get_shop_mt_world_state_mt_alt(SubLObject v_shop_mt_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_mt_world_state, ONE_INTEGER, MT);
    }

    public static SubLObject get_shop_mt_world_state_mt(final SubLObject v_shop_mt_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_mt_world_state, ONE_INTEGER, MT);
    }

    public static final SubLObject set_shop_mt_world_state_mt_alt(SubLObject v_shop_mt_world_state, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_mt_world_state, value, ONE_INTEGER, MT);
    }

    public static SubLObject set_shop_mt_world_state_mt(final SubLObject v_shop_mt_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_mt_world_state, value, ONE_INTEGER, MT);
    }

    public static final SubLObject subloop_reserved_initialize_shop_mt_world_state_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_mt_world_state_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_shop_mt_world_state_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_MT_WORLD_STATE, MT, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_MT_WORLD_STATE, DELETES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_shop_mt_world_state_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_MT_WORLD_STATE, MT, NIL);
        classes.subloop_initialize_slot(new_instance, SHOP_MT_WORLD_STATE, DELETES, NIL);
        return NIL;
    }

    public static final SubLObject shop_mt_world_state_p_alt(SubLObject v_shop_mt_world_state) {
        return classes.subloop_instanceof_class(v_shop_mt_world_state, SHOP_MT_WORLD_STATE);
    }

    public static SubLObject shop_mt_world_state_p(final SubLObject v_shop_mt_world_state) {
        return classes.subloop_instanceof_class(v_shop_mt_world_state, SHOP_MT_WORLD_STATE);
    }

    public static final SubLObject shop_mt_world_state_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_mt_world_state_method = NIL;
            SubLObject deletes = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(self);
            try {
                try {
                    object.object_initialize_method(self);
                    deletes = set.new_set(symbol_function(EQUAL), TEN_INTEGER);
                    sublisp_throw($sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_deletes(self, deletes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            }
            return catch_var_for_shop_mt_world_state_method;
        }
    }

    public static SubLObject shop_mt_world_state_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        SubLObject deletes = get_shop_mt_world_state_deletes(self);
        try {
            thread.throwStack.push($sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                object.object_initialize_method(self);
                deletes = set.new_set(symbol_function(EQUAL), TEN_INTEGER);
                sublisp_throw($sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    public static final SubLObject shop_mt_world_state_copy_state_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_shop_mt_world_state_method = NIL;
            SubLObject mt = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(self);
            try {
                try {
                    {
                        SubLObject new_state = object.object_new_method(SHOP_MT_WORLD_STATE);
                        instances.set_slot(new_state, MT, mt);
                        sublisp_throw($sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, new_state);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_mt(self, mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            }
            return catch_var_for_shop_mt_world_state_method;
        }
    }

    public static SubLObject shop_mt_world_state_copy_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push($sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject new_state = object.object_new_method(SHOP_MT_WORLD_STATE);
                instances.set_slot(new_state, MT, mt);
                sublisp_throw($sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, new_state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_mt(self, mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    public static final SubLObject shop_mt_world_state_next_state_method_alt(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_mt_world_state_method = NIL;
                SubLObject mt = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(self);
                try {
                    try {
                        {
                            SubLObject next_state = com.cyc.cycjava.cycl.shop_mt_world_state.shop_mt_world_state_copy_state_method(self);
                            SubLObject next_mt = prove.hypothesize_spec_mt(mt, $shop_hyp_mt_prefix$.getDynamicValue(thread));
                            instances.set_slot(next_state, MT, next_mt);
                            sublisp_throw($sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, next_state);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_mt(self, mt);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
                }
                return catch_var_for_shop_mt_world_state_method;
            }
        }
    }

    public static SubLObject shop_mt_world_state_next_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push($sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject next_state = shop_mt_world_state_copy_state_method(self);
                final SubLObject next_mt = prove.hypothesize_spec_mt(mt, $shop_hyp_mt_prefix$.getDynamicValue(thread));
                instances.set_slot(next_state, MT, next_mt);
                sublisp_throw($sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, next_state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_mt(self, mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    public static final SubLObject shop_mt_world_state_add_atom_method_alt(SubLObject self, SubLObject literal) {
        {
            SubLObject catch_var_for_shop_mt_world_state_method = NIL;
            SubLObject deletes = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(self);
            SubLObject mt = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(self);
            try {
                try {
                    cyc_kernel.cyc_assert(literal, mt, $list_alt29);
                    if (NIL != set.set_memberP(literal, deletes)) {
                        set.set_remove(literal, deletes);
                    }
                    sublisp_throw($sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_deletes(self, deletes);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_mt(self, mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            }
            return catch_var_for_shop_mt_world_state_method;
        }
    }

    public static SubLObject shop_mt_world_state_add_atom_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push($sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                cyc_kernel.cyc_assert(literal, mt, $list29);
                if (NIL != set.set_memberP(literal, deletes)) {
                    set.set_remove(literal, deletes);
                }
                sublisp_throw($sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    set_shop_mt_world_state_mt(self, mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    public static final SubLObject shop_mt_world_state_delete_atom_method_alt(SubLObject self, SubLObject literal) {
        {
            SubLObject catch_var_for_shop_mt_world_state_method = NIL;
            SubLObject deletes = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(self);
            SubLObject mt = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(self);
            try {
                try {
                    cyc_kernel.cyc_assert(list($$not, literal), mt, $list_alt29);
                    sublisp_throw($sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, set.set_add(literal, deletes));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_deletes(self, deletes);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_mt(self, mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            }
            return catch_var_for_shop_mt_world_state_method;
        }
    }

    public static SubLObject shop_mt_world_state_delete_atom_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push($sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                cyc_kernel.cyc_assert(list($$not, literal), mt, $list29);
                sublisp_throw($sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, set.set_add(literal, deletes));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    set_shop_mt_world_state_mt(self, mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    /**
     *
     *
     * @param LITERALS
    listp
     * 		
     */
    @LispMethod(comment = "@param LITERALS\nlistp")
    public static final SubLObject shop_mt_world_state_add_literals_method_alt(SubLObject self, SubLObject literals) {
        {
            SubLObject cdolist_list_var = literals;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.shop_mt_world_state.shop_mt_world_state_add_atom_method(self, lit);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param LITERALS
    listp
     * 		
     */
    @LispMethod(comment = "@param LITERALS\nlistp")
    public static SubLObject shop_mt_world_state_add_literals_method(final SubLObject self, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            shop_mt_world_state_add_atom_method(self, lit);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param LITERALS
    listp
     * 		
     */
    @LispMethod(comment = "@param LITERALS\nlistp")
    public static final SubLObject shop_mt_world_state_delete_literals_method_alt(SubLObject self, SubLObject literals) {
        {
            SubLObject cdolist_list_var = literals;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.shop_mt_world_state.shop_mt_world_state_delete_atom_method(self, lit);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param LITERALS
    listp
     * 		
     */
    @LispMethod(comment = "@param LITERALS\nlistp")
    public static SubLObject shop_mt_world_state_delete_literals_method(final SubLObject self, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            shop_mt_world_state_delete_atom_method(self, lit);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject shop_mt_world_state_add_literal_method_alt(SubLObject self, SubLObject literal) {
        return com.cyc.cycjava.cycl.shop_mt_world_state.shop_mt_world_state_add_atom_method(self, literal);
    }

    public static SubLObject shop_mt_world_state_add_literal_method(final SubLObject self, final SubLObject literal) {
        return shop_mt_world_state_add_atom_method(self, literal);
    }

    public static final SubLObject shop_mt_world_state_delete_literal_method_alt(SubLObject self, SubLObject literal) {
        return com.cyc.cycjava.cycl.shop_mt_world_state.shop_mt_world_state_delete_atom_method(self, literal);
    }

    public static SubLObject shop_mt_world_state_delete_literal_method(final SubLObject self, final SubLObject literal) {
        return shop_mt_world_state_delete_atom_method(self, literal);
    }

    public static final SubLObject shop_mt_world_state_same_state_p_method_alt(SubLObject self, SubLObject state1, SubLObject state2) {
        {
            SubLObject catch_var_for_shop_mt_world_state_method = NIL;
            SubLObject deletes = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(self);
            SubLObject mt = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(self);
            try {
                try {
                    {
                        SubLObject mt1 = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(state1);
                        SubLObject deletes1 = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(state1);
                        SubLObject mt2 = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(state2);
                        SubLObject deletes2 = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(state2);
                        if (!((NIL != set_utilities.set_subsetP(deletes1, deletes2)) && (NIL != set_utilities.set_subsetP(deletes2, deletes1)))) {
                            sublisp_throw($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL);
                        }
                        if (mt1.equal(mt2)) {
                            sublisp_throw($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, T);
                        }
                        sublisp_throw($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_deletes(self, deletes);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_mt(self, mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            }
            return catch_var_for_shop_mt_world_state_method;
        }
    }

    public static SubLObject shop_mt_world_state_same_state_p_method(final SubLObject self, final SubLObject state1, final SubLObject state2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject mt2 = get_shop_mt_world_state_mt(state1);
                final SubLObject deletes2 = get_shop_mt_world_state_deletes(state1);
                final SubLObject mt3 = get_shop_mt_world_state_mt(state2);
                final SubLObject deletes3 = get_shop_mt_world_state_deletes(state2);
                if ((NIL == set_utilities.set_subsetP(deletes2, deletes3)) || (NIL == set_utilities.set_subsetP(deletes3, deletes2))) {
                    sublisp_throw($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL);
                }
                if (mt2.equal(mt3)) {
                    sublisp_throw($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, T);
                }
                sublisp_throw($sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    set_shop_mt_world_state_mt(self, mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    public static final SubLObject shop_mt_world_state_filter_deleted_bindings_method_alt(SubLObject self, SubLObject v_bindings) {
        {
            SubLObject catch_var_for_shop_mt_world_state_method = NIL;
            SubLObject deletes = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_deletes(self);
            try {
                try {
                    {
                        SubLObject new_bindings = NIL;
                        if (NIL != set.set_emptyP(deletes)) {
                            new_bindings = v_bindings;
                        } else {
                            {
                                SubLObject cdolist_list_var = v_bindings;
                                SubLObject cur_binding = NIL;
                                for (cur_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_binding = cdolist_list_var.first()) {
                                    {
                                        SubLObject doneP = NIL;
                                        SubLObject bad_bindingP = NIL;
                                        if (NIL == doneP) {
                                            {
                                                SubLObject csome_list_var = second(cur_binding);
                                                SubLObject cur_support = NIL;
                                                for (cur_support = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cur_support = csome_list_var.first()) {
                                                    if (NIL != assertions_high.gaf_assertionP(cur_support)) {
                                                        if (NIL != set.set_memberP(cur_support, deletes)) {
                                                            doneP = T;
                                                            bad_bindingP = T;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if (NIL == bad_bindingP) {
                                            new_bindings = cons(cur_binding, new_bindings);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, nreverse(new_bindings));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_deletes(self, deletes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            }
            return catch_var_for_shop_mt_world_state_method;
        }
    }

    public static SubLObject shop_mt_world_state_filter_deleted_bindings_method(final SubLObject self, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        try {
            thread.throwStack.push($sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                SubLObject new_bindings = NIL;
                if (NIL != set.set_emptyP(deletes)) {
                    new_bindings = v_bindings;
                } else {
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject cur_binding = NIL;
                    cur_binding = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject doneP = NIL;
                        SubLObject bad_bindingP = NIL;
                        if (NIL == doneP) {
                            SubLObject csome_list_var = second(cur_binding);
                            SubLObject cur_support = NIL;
                            cur_support = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                if ((NIL != assertions_high.gaf_assertionP(cur_support)) && (NIL != set.set_memberP(cur_support, deletes))) {
                                    doneP = T;
                                    bad_bindingP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                cur_support = csome_list_var.first();
                            } 
                        }
                        if (NIL == bad_bindingP) {
                            new_bindings = cons(cur_binding, new_bindings);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cur_binding = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, nreverse(new_bindings));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("SHOP-WORLD-STATE"));

    static private final SubLList $list_alt3 = list(list(makeSymbol("MT"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DELETES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FILTER-DELETED-BINDINGS"), list(makeSymbol("BINDINGS")), makeKeyword("PROTECTED")));

    static private final SubLString $str_alt11$SHOP_WS = makeString("SHOP-WS");

    static private final SubLList $list_alt13 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt14 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DELETES"), list(makeSymbol("NEW-SET"), list(makeSymbol("FUNCTION"), EQUAL), TEN_INTEGER)), list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt18 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("SHOP-MT-WORLD-STATE")), list(QUOTE, makeSymbol("SHOP-MT-WORLD-STATE"))))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-STATE"), list(QUOTE, makeSymbol("MT")), makeSymbol("MT")), list(RET, makeSymbol("NEW-STATE"))));

    static private final SubLList $list_alt22 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-STATE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COPY-STATE"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"))), list(makeSymbol("NEXT-MT"), list(makeSymbol("HYPOTHESIZE-SPEC-MT"), makeSymbol("MT"), makeSymbol("*SHOP-HYP-MT-PREFIX*")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEXT-STATE"), list(QUOTE, makeSymbol("MT")), makeSymbol("NEXT-MT")), list(RET, makeSymbol("NEXT-STATE"))));

    public static final SubLObject shop_mt_world_state_ask_method_alt(SubLObject self, SubLObject formula, SubLObject mbind, SubLObject backchain) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_shop_mt_world_state_method = NIL;
                SubLObject mt = com.cyc.cycjava.cycl.shop_mt_world_state.get_shop_mt_world_state_mt(self);
                try {
                    try {
                        {
                            SubLObject _prev_bind_0 = $inference_answer_handler$.currentBinding(thread);
                            try {
                                $inference_answer_handler$.bind(NIL != shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread) ? ((SubLObject) (INFERENCE_RETURN_BLISTS_AND_SUPPORTS)) : INFERENCE_RETURN_BLISTS, thread);
                                {
                                    SubLObject v_bindings = NIL;
                                    if (NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue(thread)) {
                                        v_bindings = shop_inference.shop_ask(formula, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else {
                                        v_bindings = fi.fi_ask_int(formula, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    v_bindings = com.cyc.cycjava.cycl.shop_mt_world_state.shop_mt_world_state_filter_deleted_bindings_method(self, v_bindings);
                                    sublisp_throw($sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, v_bindings);
                                }
                            } finally {
                                $inference_answer_handler$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.shop_mt_world_state.set_shop_mt_world_state_mt(self, mt);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
                }
                return catch_var_for_shop_mt_world_state_method;
            }
        }
    }

    public static SubLObject shop_mt_world_state_ask_method(final SubLObject self, final SubLObject formula, final SubLObject mbind, final SubLObject backchain) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = NIL;
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject _prev_bind_0 = $inference_answer_handler$.currentBinding(thread);
                try {
                    $inference_answer_handler$.bind(NIL != shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread) ? INFERENCE_RETURN_BLISTS_AND_SUPPORTS : INFERENCE_RETURN_BLISTS, thread);
                    SubLObject v_bindings = NIL;
                    if (NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue(thread)) {
                        v_bindings = shop_inference.shop_ask(formula, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        v_bindings = fi.fi_ask_int(formula, mt, backchain, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    v_bindings = shop_mt_world_state_filter_deleted_bindings_method(self, v_bindings);
                    sublisp_throw($sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, v_bindings);
                } finally {
                    $inference_answer_handler$.rebind(_prev_bind_0, thread);
                }
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_shop_mt_world_state_mt(self, mt);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }

    static private final SubLList $list_alt26 = list(makeSymbol("LITERAL"));

    static private final SubLList $list_alt27 = list(list(makeSymbol("ASSERT-MUST"), list(makeSymbol("GAF?"), makeSymbol("LITERAL")), makeString("(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground.")), list(makeSymbol("CYC-ASSERT"), makeSymbol("LITERAL"), makeSymbol("MT"), list(QUOTE, list(makeKeyword("MONOTONIC"), makeKeyword("FORWARD")))), list(makeSymbol("PWHEN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("LITERAL"), makeSymbol("DELETES")), list(makeSymbol("SET-REMOVE"), makeSymbol("LITERAL"), makeSymbol("DELETES"))), list(RET, NIL));

    static private final SubLList $list_alt29 = list(makeKeyword("MONOTONIC"), makeKeyword("FORWARD"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("ASSERT-MUST"), list(makeSymbol("GAF?"), makeSymbol("LITERAL")), makeString("(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground.")), list(makeSymbol("CYC-ASSERT"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell("not"), makeSymbol("LITERAL")), makeSymbol("MT"), list(QUOTE, list(makeKeyword("MONOTONIC"), makeKeyword("FORWARD")))), list(RET, list(makeSymbol("SET-ADD"), makeSymbol("LITERAL"), makeSymbol("DELETES"))));

    static private final SubLList $list_alt37 = list(makeSymbol("LITERALS"));

    static private final SubLList $list_alt38 = list(makeString("@param LITERALS listp"), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("LITERALS")), list(makeSymbol("ADD-ATOM"), makeSymbol("SELF"), makeSymbol("LIT"))), list(RET, NIL));

    public static SubLObject declare_shop_mt_world_state_file() {
        declareFunction("get_shop_mt_world_state_deletes", "GET-SHOP-MT-WORLD-STATE-DELETES", 1, 0, false);
        declareFunction("set_shop_mt_world_state_deletes", "SET-SHOP-MT-WORLD-STATE-DELETES", 2, 0, false);
        declareFunction("get_shop_mt_world_state_mt", "GET-SHOP-MT-WORLD-STATE-MT", 1, 0, false);
        declareFunction("set_shop_mt_world_state_mt", "SET-SHOP-MT-WORLD-STATE-MT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_shop_mt_world_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_shop_mt_world_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-INSTANCE", 1, 0, false);
        declareFunction("shop_mt_world_state_p", "SHOP-MT-WORLD-STATE-P", 1, 0, false);
        declareFunction("shop_mt_world_state_initialize_method", "SHOP-MT-WORLD-STATE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("shop_mt_world_state_copy_state_method", "SHOP-MT-WORLD-STATE-COPY-STATE-METHOD", 1, 0, false);
        declareFunction("shop_mt_world_state_next_state_method", "SHOP-MT-WORLD-STATE-NEXT-STATE-METHOD", 1, 0, false);
        declareFunction("shop_mt_world_state_add_atom_method", "SHOP-MT-WORLD-STATE-ADD-ATOM-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_delete_atom_method", "SHOP-MT-WORLD-STATE-DELETE-ATOM-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_add_literals_method", "SHOP-MT-WORLD-STATE-ADD-LITERALS-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_delete_literals_method", "SHOP-MT-WORLD-STATE-DELETE-LITERALS-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_add_literal_method", "SHOP-MT-WORLD-STATE-ADD-LITERAL-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_delete_literal_method", "SHOP-MT-WORLD-STATE-DELETE-LITERAL-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_same_state_p_method", "SHOP-MT-WORLD-STATE-SAME-STATE-P-METHOD", 3, 0, false);
        declareFunction("shop_mt_world_state_filter_deleted_bindings_method", "SHOP-MT-WORLD-STATE-FILTER-DELETED-BINDINGS-METHOD", 2, 0, false);
        declareFunction("shop_mt_world_state_ask_method", "SHOP-MT-WORLD-STATE-ASK-METHOD", 4, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt41 = list(makeString("@param LITERALS listp"), list(makeSymbol("CDOLIST"), list(makeSymbol("LIT"), makeSymbol("LITERALS")), list(makeSymbol("DELETE-ATOM"), makeSymbol("SELF"), makeSymbol("LIT"))), list(RET, NIL));

    static private final SubLList $list_alt44 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-ATOM"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"), makeSymbol("LITERAL"))));

    static private final SubLList $list_alt47 = list(list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETE-ATOM"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"), makeSymbol("LITERAL"))));

    static private final SubLList $list_alt50 = list(makeSymbol("STATE1"), makeSymbol("STATE2"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MT1"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("MT"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE1"))), list(makeSymbol("DELETES1"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("DELETES"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE1"))), list(makeSymbol("MT2"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("MT"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE2"))), list(makeSymbol("DELETES2"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("DELETES"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("STATE2")))), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), list(makeSymbol("SET-SUBSET?"), makeSymbol("DELETES1"), makeSymbol("DELETES2")), list(makeSymbol("SET-SUBSET?"), makeSymbol("DELETES2"), makeSymbol("DELETES1"))), list(RET, NIL)), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("MT1"), makeSymbol("MT2")), list(RET, T)), list(RET, NIL)));

    public static SubLObject init_shop_mt_world_state_file() {
        defparameter("*SHOP-HYP-MT-PREFIX*", $str11$SHOP_WS);
        return NIL;
    }

    public static SubLObject setup_shop_mt_world_state_file() {
        classes.subloop_new_class(SHOP_MT_WORLD_STATE, OBJECT, $list2, NIL, $list3);
        classes.class_set_implements_slot_listeners(SHOP_MT_WORLD_STATE, NIL);
        classes.subloop_note_class_initialization_function(SHOP_MT_WORLD_STATE, SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS);
        classes.subloop_note_instance_initialization_function(SHOP_MT_WORLD_STATE, SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE);
        subloop_reserved_initialize_shop_mt_world_state_class(SHOP_MT_WORLD_STATE);
        methods.methods_incorporate_instance_method(INITIALIZE, SHOP_MT_WORLD_STATE, $list13, NIL, $list14);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, INITIALIZE, SHOP_MT_WORLD_STATE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(COPY_STATE, SHOP_MT_WORLD_STATE, $list13, NIL, $list18);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, COPY_STATE, SHOP_MT_WORLD_STATE_COPY_STATE_METHOD);
        methods.methods_incorporate_instance_method(NEXT_STATE, SHOP_MT_WORLD_STATE, $list13, NIL, $list22);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, NEXT_STATE, SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD);
        methods.methods_incorporate_instance_method(ADD_ATOM, SHOP_MT_WORLD_STATE, $list13, $list26, $list27);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, ADD_ATOM, SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD);
        methods.methods_incorporate_instance_method(DELETE_ATOM, SHOP_MT_WORLD_STATE, $list13, $list26, $list32);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, DELETE_ATOM, SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD);
        methods.methods_incorporate_instance_method(ADD_LITERALS, SHOP_MT_WORLD_STATE, $list13, $list37, $list38);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, ADD_LITERALS, SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LITERALS, SHOP_MT_WORLD_STATE, $list13, $list37, $list41);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, DELETE_LITERALS, SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD);
        methods.methods_incorporate_instance_method(ADD_LITERAL, SHOP_MT_WORLD_STATE, $list13, $list26, $list44);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, ADD_LITERAL, SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LITERAL, SHOP_MT_WORLD_STATE, $list13, $list26, $list47);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, DELETE_LITERAL, SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD);
        methods.methods_incorporate_class_method(SAME_STATE_P, SHOP_MT_WORLD_STATE, $list13, $list50, $list51);
        methods.subloop_register_class_method(SHOP_MT_WORLD_STATE, SAME_STATE_P, SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD);
        methods.methods_incorporate_instance_method(FILTER_DELETED_BINDINGS, SHOP_MT_WORLD_STATE, $list55, $list56, $list57);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, FILTER_DELETED_BINDINGS, SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(ASK, SHOP_MT_WORLD_STATE, $list13, $list61, $list62);
        methods.subloop_register_instance_method(SHOP_MT_WORLD_STATE, ASK, SHOP_MT_WORLD_STATE_ASK_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt55 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt56 = list(makeSymbol("BINDINGS"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-BINDINGS"), NIL)), list(makeSymbol("PIF"), list(makeSymbol("SET-EMPTY?"), makeSymbol("DELETES")), list(makeSymbol("CSETQ"), makeSymbol("NEW-BINDINGS"), makeSymbol("BINDINGS")), list(makeSymbol("PROGN"), list(makeSymbol("CDOLIST"), list(makeSymbol("CUR-BINDING"), makeSymbol("BINDINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("DONE?"), NIL), list(makeSymbol("BAD-BINDING?"), NIL)), list(makeSymbol("CSOME"), list(makeSymbol("CUR-SUPPORT"), list(makeSymbol("SECOND"), makeSymbol("CUR-BINDING")), makeSymbol("DONE?")), list(makeSymbol("PWHEN"), list(makeSymbol("GAF-ASSERTION?"), makeSymbol("CUR-SUPPORT")), list(makeSymbol("PWHEN"), list(makeSymbol("SET-MEMBER?"), makeSymbol("CUR-SUPPORT"), makeSymbol("DELETES")), list(makeSymbol("CSETQ"), makeSymbol("DONE?"), T), list(makeSymbol("CSETQ"), makeSymbol("BAD-BINDING?"), T)))), list(makeSymbol("PUNLESS"), makeSymbol("BAD-BINDING?"), list(makeSymbol("CPUSH"), makeSymbol("CUR-BINDING"), makeSymbol("NEW-BINDINGS"))))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("NEW-BINDINGS")))));

    static private final SubLList $list_alt61 = list(makeSymbol("FORMULA"), makeSymbol("MBIND"), makeSymbol("BACKCHAIN"));

    static private final SubLList $list_alt62 = list(list(makeSymbol("IGNORE"), makeSymbol("MBIND")), list(makeSymbol("CLET"), list(list(makeSymbol("*INFERENCE-ANSWER-HANDLER*"), list(makeSymbol("FIF"), makeSymbol("*SHOP-USE-INFERENCE-SUPPORTS?*"), list(QUOTE, makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS")), list(QUOTE, makeSymbol("INFERENCE-RETURN-BLISTS")))), makeSymbol("BINDINGS")), list(makeSymbol("PIF"), makeSymbol("*SHOP-USE-SHOP-ASK?*"), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("SHOP-ASK"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("BACKCHAIN"))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("FI-ASK-INT"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("BACKCHAIN")))), list(makeSymbol("CSETQ"), makeSymbol("BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FILTER-DELETED-BINDINGS"), makeSymbol("SHOP-MT-WORLD-STATE")), makeSymbol("SELF"), makeSymbol("BINDINGS"))), list(RET, makeSymbol("BINDINGS"))));

    @Override
    public void declareFunctions() {
        declare_shop_mt_world_state_file();
    }

    @Override
    public void initializeVariables() {
        init_shop_mt_world_state_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_shop_mt_world_state_file();
    }

    
}

/**
 * Total time: 266 ms
 */
