package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class shop_mt_world_state extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_mt_world_state";
    public static final String myFingerPrint = "16a63f1cb90db97b51a1f3127c0c67f259c9d352e831d5eab8d3e050c7335cbc";
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2150L)
    private static SubLSymbol $shop_hyp_mt_prefix$;
    private static final SubLSymbol $sym0$SHOP_MT_WORLD_STATE;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$DELETES;
    private static final SubLSymbol $sym5$MT;
    private static final SubLSymbol $sym6$INSTANCE_COUNT;
    private static final SubLSymbol $sym7$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS;
    private static final SubLSymbol $sym8$ISOLATED_P;
    private static final SubLSymbol $sym9$INSTANCE_NUMBER;
    private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE;
    private static final SubLString $str11$SHOP_WS;
    private static final SubLSymbol $sym12$INITIALIZE;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym16$SHOP_MT_WORLD_STATE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym17$COPY_STATE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym20$SHOP_MT_WORLD_STATE_COPY_STATE_METHOD;
    private static final SubLSymbol $sym21$NEXT_STATE;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym24$SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD;
    private static final SubLSymbol $sym25$ADD_ATOM;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD;
    private static final SubLSymbol $sym31$DELETE_ATOM;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLObject $const34$not;
    private static final SubLSymbol $sym35$SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD;
    private static final SubLSymbol $sym36$ADD_LITERALS;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD;
    private static final SubLSymbol $sym40$DELETE_LITERALS;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD;
    private static final SubLSymbol $sym43$ADD_LITERAL;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD;
    private static final SubLSymbol $sym46$DELETE_LITERAL;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD;
    private static final SubLSymbol $sym49$SAME_STATE_P;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym53$SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD;
    private static final SubLSymbol $sym54$FILTER_DELETED_BINDINGS;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym59$SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD;
    private static final SubLSymbol $sym60$ASK;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym64$INFERENCE_RETURN_BLISTS_AND_SUPPORTS;
    private static final SubLSymbol $sym65$INFERENCE_RETURN_BLISTS;
    private static final SubLSymbol $sym66$SHOP_MT_WORLD_STATE_ASK_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject get_shop_mt_world_state_deletes(final SubLObject v_shop_mt_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_mt_world_state, (SubLObject)shop_mt_world_state.TWO_INTEGER, (SubLObject)shop_mt_world_state.$sym4$DELETES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject set_shop_mt_world_state_deletes(final SubLObject v_shop_mt_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_mt_world_state, value, (SubLObject)shop_mt_world_state.TWO_INTEGER, (SubLObject)shop_mt_world_state.$sym4$DELETES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject get_shop_mt_world_state_mt(final SubLObject v_shop_mt_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_mt_world_state, (SubLObject)shop_mt_world_state.ONE_INTEGER, (SubLObject)shop_mt_world_state.$sym5$MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject set_shop_mt_world_state_mt(final SubLObject v_shop_mt_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_mt_world_state, value, (SubLObject)shop_mt_world_state.ONE_INTEGER, (SubLObject)shop_mt_world_state.$sym5$MT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject subloop_reserved_initialize_shop_mt_world_state_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_mt_world_state.$sym1$OBJECT, (SubLObject)shop_mt_world_state.$sym6$INSTANCE_COUNT, (SubLObject)shop_mt_world_state.ZERO_INTEGER);
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject subloop_reserved_initialize_shop_mt_world_state_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_mt_world_state.$sym1$OBJECT, (SubLObject)shop_mt_world_state.$sym8$ISOLATED_P, (SubLObject)shop_mt_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_mt_world_state.$sym1$OBJECT, (SubLObject)shop_mt_world_state.$sym9$INSTANCE_NUMBER, (SubLObject)shop_mt_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym5$MT, (SubLObject)shop_mt_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym4$DELETES, (SubLObject)shop_mt_world_state.NIL);
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 1889L)
    public static SubLObject shop_mt_world_state_p(final SubLObject v_shop_mt_world_state) {
        return classes.subloop_instanceof_class(v_shop_mt_world_state, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2293L)
    public static SubLObject shop_mt_world_state_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        SubLObject deletes = get_shop_mt_world_state_deletes(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                object.object_initialize_method(self);
                deletes = set.new_set(Symbols.symbol_function((SubLObject)shop_mt_world_state.EQUAL), (SubLObject)shop_mt_world_state.TEN_INTEGER);
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2438L)
    public static SubLObject shop_mt_world_state_copy_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject new_state = object.object_new_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE);
                instances.set_slot(new_state, (SubLObject)shop_mt_world_state.$sym5$MT, mt);
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, new_state);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2704L)
    public static SubLObject shop_mt_world_state_next_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject next_state = shop_mt_world_state_copy_state_method(self);
                final SubLObject next_mt = prove.hypothesize_spec_mt(mt, shop_mt_world_state.$shop_hyp_mt_prefix$.getDynamicValue(thread));
                instances.set_slot(next_state, (SubLObject)shop_mt_world_state.$sym5$MT, next_mt);
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, next_state);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 2974L)
    public static SubLObject shop_mt_world_state_add_atom_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                cyc_kernel.cyc_assert(literal, mt, (SubLObject)shop_mt_world_state.$list29);
                if (shop_mt_world_state.NIL != set.set_memberP(literal, deletes)) {
                    set.set_remove(literal, deletes);
                }
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, (SubLObject)shop_mt_world_state.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    set_shop_mt_world_state_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3298L)
    public static SubLObject shop_mt_world_state_delete_atom_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                cyc_kernel.cyc_assert((SubLObject)ConsesLow.list(shop_mt_world_state.$const34$not, literal), mt, (SubLObject)shop_mt_world_state.$list29);
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, set.set_add(literal, deletes));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    set_shop_mt_world_state_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3582L)
    public static SubLObject shop_mt_world_state_add_literals_method(final SubLObject self, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = (SubLObject)shop_mt_world_state.NIL;
        lit = cdolist_list_var.first();
        while (shop_mt_world_state.NIL != cdolist_list_var) {
            shop_mt_world_state_add_atom_method(self, lit);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3756L)
    public static SubLObject shop_mt_world_state_delete_literals_method(final SubLObject self, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = (SubLObject)shop_mt_world_state.NIL;
        lit = cdolist_list_var.first();
        while (shop_mt_world_state.NIL != cdolist_list_var) {
            shop_mt_world_state_delete_atom_method(self, lit);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 3934L)
    public static SubLObject shop_mt_world_state_add_literal_method(final SubLObject self, final SubLObject literal) {
        return shop_mt_world_state_add_atom_method(self, literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 4082L)
    public static SubLObject shop_mt_world_state_delete_literal_method(final SubLObject self, final SubLObject literal) {
        return shop_mt_world_state_delete_atom_method(self, literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 4236L)
    public static SubLObject shop_mt_world_state_same_state_p_method(final SubLObject self, final SubLObject state1, final SubLObject state2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject mt2 = get_shop_mt_world_state_mt(state1);
                final SubLObject deletes2 = get_shop_mt_world_state_deletes(state1);
                final SubLObject mt3 = get_shop_mt_world_state_mt(state2);
                final SubLObject deletes3 = get_shop_mt_world_state_deletes(state2);
                if (shop_mt_world_state.NIL == set_utilities.set_subsetP(deletes2, deletes3) || shop_mt_world_state.NIL == set_utilities.set_subsetP(deletes3, deletes2)) {
                    Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, (SubLObject)shop_mt_world_state.NIL);
                }
                if (mt2.equal(mt3)) {
                    Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, (SubLObject)shop_mt_world_state.T);
                }
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, (SubLObject)shop_mt_world_state.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    set_shop_mt_world_state_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 4830L)
    public static SubLObject shop_mt_world_state_filter_deleted_bindings_method(final SubLObject self, final SubLObject v_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject deletes = get_shop_mt_world_state_deletes(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                SubLObject new_bindings = (SubLObject)shop_mt_world_state.NIL;
                if (shop_mt_world_state.NIL != set.set_emptyP(deletes)) {
                    new_bindings = v_bindings;
                }
                else {
                    SubLObject cdolist_list_var = v_bindings;
                    SubLObject cur_binding = (SubLObject)shop_mt_world_state.NIL;
                    cur_binding = cdolist_list_var.first();
                    while (shop_mt_world_state.NIL != cdolist_list_var) {
                        SubLObject doneP = (SubLObject)shop_mt_world_state.NIL;
                        SubLObject bad_bindingP = (SubLObject)shop_mt_world_state.NIL;
                        if (shop_mt_world_state.NIL == doneP) {
                            SubLObject csome_list_var = conses_high.second(cur_binding);
                            SubLObject cur_support = (SubLObject)shop_mt_world_state.NIL;
                            cur_support = csome_list_var.first();
                            while (shop_mt_world_state.NIL == doneP && shop_mt_world_state.NIL != csome_list_var) {
                                if (shop_mt_world_state.NIL != assertions_high.gaf_assertionP(cur_support) && shop_mt_world_state.NIL != set.set_memberP(cur_support, deletes)) {
                                    doneP = (SubLObject)shop_mt_world_state.T;
                                    bad_bindingP = (SubLObject)shop_mt_world_state.T;
                                }
                                csome_list_var = csome_list_var.rest();
                                cur_support = csome_list_var.first();
                            }
                        }
                        if (shop_mt_world_state.NIL == bad_bindingP) {
                            new_bindings = (SubLObject)ConsesLow.cons(cur_binding, new_bindings);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cur_binding = cdolist_list_var.first();
                    }
                }
                Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, Sequences.nreverse(new_bindings));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_deletes(self, deletes);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-mt-world-state.lisp", position = 5490L)
    public static SubLObject shop_mt_world_state_ask_method(final SubLObject self, final SubLObject formula, final SubLObject mbind, final SubLObject backchain) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_mt_world_state_method = (SubLObject)shop_mt_world_state.NIL;
        final SubLObject mt = get_shop_mt_world_state_mt(self);
        try {
            thread.throwStack.push(shop_mt_world_state.$sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
            try {
                final SubLObject _prev_bind_0 = control_vars.$inference_answer_handler$.currentBinding(thread);
                try {
                    control_vars.$inference_answer_handler$.bind((SubLObject)((shop_mt_world_state.NIL != shop_parameters.$shop_use_inference_supportsP$.getDynamicValue(thread)) ? shop_mt_world_state.$sym64$INFERENCE_RETURN_BLISTS_AND_SUPPORTS : shop_mt_world_state.$sym65$INFERENCE_RETURN_BLISTS), thread);
                    SubLObject v_bindings = (SubLObject)shop_mt_world_state.NIL;
                    if (shop_mt_world_state.NIL != shop_parameters.$shop_use_shop_askP$.getDynamicValue(thread)) {
                        v_bindings = shop_inference.shop_ask(formula, mt, backchain, (SubLObject)shop_mt_world_state.UNPROVIDED, (SubLObject)shop_mt_world_state.UNPROVIDED, (SubLObject)shop_mt_world_state.UNPROVIDED);
                    }
                    else {
                        v_bindings = fi.fi_ask_int(formula, mt, backchain, (SubLObject)shop_mt_world_state.UNPROVIDED, (SubLObject)shop_mt_world_state.UNPROVIDED, (SubLObject)shop_mt_world_state.UNPROVIDED);
                    }
                    v_bindings = shop_mt_world_state_filter_deleted_bindings_method(self, v_bindings);
                    Dynamic.sublisp_throw((SubLObject)shop_mt_world_state.$sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD, v_bindings);
                }
                finally {
                    control_vars.$inference_answer_handler$.rebind(_prev_bind_0, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_mt_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_mt_world_state_mt(self, mt);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_mt_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_mt_world_state.$sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_mt_world_state_method;
    }
    
    public static SubLObject declare_shop_mt_world_state_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "get_shop_mt_world_state_deletes", "GET-SHOP-MT-WORLD-STATE-DELETES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "set_shop_mt_world_state_deletes", "SET-SHOP-MT-WORLD-STATE-DELETES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "get_shop_mt_world_state_mt", "GET-SHOP-MT-WORLD-STATE-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "set_shop_mt_world_state_mt", "SET-SHOP-MT-WORLD-STATE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "subloop_reserved_initialize_shop_mt_world_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "subloop_reserved_initialize_shop_mt_world_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_p", "SHOP-MT-WORLD-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_initialize_method", "SHOP-MT-WORLD-STATE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_copy_state_method", "SHOP-MT-WORLD-STATE-COPY-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_next_state_method", "SHOP-MT-WORLD-STATE-NEXT-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_add_atom_method", "SHOP-MT-WORLD-STATE-ADD-ATOM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_delete_atom_method", "SHOP-MT-WORLD-STATE-DELETE-ATOM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_add_literals_method", "SHOP-MT-WORLD-STATE-ADD-LITERALS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_delete_literals_method", "SHOP-MT-WORLD-STATE-DELETE-LITERALS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_add_literal_method", "SHOP-MT-WORLD-STATE-ADD-LITERAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_delete_literal_method", "SHOP-MT-WORLD-STATE-DELETE-LITERAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_same_state_p_method", "SHOP-MT-WORLD-STATE-SAME-STATE-P-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_filter_deleted_bindings_method", "SHOP-MT-WORLD-STATE-FILTER-DELETED-BINDINGS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_mt_world_state", "shop_mt_world_state_ask_method", "SHOP-MT-WORLD-STATE-ASK-METHOD", 4, 0, false);
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
    public static SubLObject init_shop_mt_world_state_file() {
        shop_mt_world_state.$shop_hyp_mt_prefix$ = SubLFiles.defparameter("*SHOP-HYP-MT-PREFIX*", (SubLObject)shop_mt_world_state.$str11$SHOP_WS);
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
    public static SubLObject setup_shop_mt_world_state_file() {
        classes.subloop_new_class((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym1$OBJECT, (SubLObject)shop_mt_world_state.$list2, (SubLObject)shop_mt_world_state.NIL, (SubLObject)shop_mt_world_state.$list3);
        classes.class_set_implements_slot_listeners((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym7$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE);
        subloop_reserved_initialize_shop_mt_world_state_class((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym12$INITIALIZE, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.NIL, (SubLObject)shop_mt_world_state.$list14);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym12$INITIALIZE, (SubLObject)shop_mt_world_state.$sym16$SHOP_MT_WORLD_STATE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym17$COPY_STATE, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.NIL, (SubLObject)shop_mt_world_state.$list18);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym17$COPY_STATE, (SubLObject)shop_mt_world_state.$sym20$SHOP_MT_WORLD_STATE_COPY_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym21$NEXT_STATE, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.NIL, (SubLObject)shop_mt_world_state.$list22);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym21$NEXT_STATE, (SubLObject)shop_mt_world_state.$sym24$SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym25$ADD_ATOM, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list26, (SubLObject)shop_mt_world_state.$list27);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym25$ADD_ATOM, (SubLObject)shop_mt_world_state.$sym30$SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym31$DELETE_ATOM, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list26, (SubLObject)shop_mt_world_state.$list32);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym31$DELETE_ATOM, (SubLObject)shop_mt_world_state.$sym35$SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym36$ADD_LITERALS, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list37, (SubLObject)shop_mt_world_state.$list38);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym36$ADD_LITERALS, (SubLObject)shop_mt_world_state.$sym39$SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym40$DELETE_LITERALS, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list37, (SubLObject)shop_mt_world_state.$list41);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym40$DELETE_LITERALS, (SubLObject)shop_mt_world_state.$sym42$SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym43$ADD_LITERAL, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list26, (SubLObject)shop_mt_world_state.$list44);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym43$ADD_LITERAL, (SubLObject)shop_mt_world_state.$sym45$SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym46$DELETE_LITERAL, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list26, (SubLObject)shop_mt_world_state.$list47);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym46$DELETE_LITERAL, (SubLObject)shop_mt_world_state.$sym48$SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_mt_world_state.$sym49$SAME_STATE_P, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list50, (SubLObject)shop_mt_world_state.$list51);
        methods.subloop_register_class_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym49$SAME_STATE_P, (SubLObject)shop_mt_world_state.$sym53$SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym54$FILTER_DELETED_BINDINGS, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list55, (SubLObject)shop_mt_world_state.$list56, (SubLObject)shop_mt_world_state.$list57);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym54$FILTER_DELETED_BINDINGS, (SubLObject)shop_mt_world_state.$sym59$SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_mt_world_state.$sym60$ASK, (SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$list13, (SubLObject)shop_mt_world_state.$list61, (SubLObject)shop_mt_world_state.$list62);
        methods.subloop_register_instance_method((SubLObject)shop_mt_world_state.$sym0$SHOP_MT_WORLD_STATE, (SubLObject)shop_mt_world_state.$sym60$ASK, (SubLObject)shop_mt_world_state.$sym66$SHOP_MT_WORLD_STATE_ASK_METHOD);
        return (SubLObject)shop_mt_world_state.NIL;
    }
    
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
    
    static {
        me = (SubLFile)new shop_mt_world_state();
        shop_mt_world_state.$shop_hyp_mt_prefix$ = null;
        $sym0$SHOP_MT_WORLD_STATE = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-WORLD-STATE"));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-DELETED-BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")));
        $sym4$DELETES = SubLObjectFactory.makeSymbol("DELETES");
        $sym5$MT = SubLObjectFactory.makeSymbol("MT");
        $sym6$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym7$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-CLASS");
        $sym8$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym9$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_MT_WORLD_STATE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-MT-WORLD-STATE-INSTANCE");
        $str11$SHOP_WS = SubLObjectFactory.makeString("SHOP-WS");
        $sym12$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_mt_world_state.EQUAL), (SubLObject)shop_mt_world_state.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym15$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $sym16$SHOP_MT_WORLD_STATE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-INITIALIZE-METHOD");
        $sym17$COPY_STATE = SubLObjectFactory.makeSymbol("COPY-STATE");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"))));
        $sym19$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $sym20$SHOP_MT_WORLD_STATE_COPY_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-COPY-STATE-METHOD");
        $sym21$NEXT_STATE = SubLObjectFactory.makeSymbol("NEXT-STATE");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT-MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HYPOTHESIZE-SPEC-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-HYP-MT-PREFIX*")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-MT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-STATE"))));
        $sym23$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $sym24$SHOP_MT_WORLD_STATE_NEXT_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-NEXT-STATE-METHOD");
        $sym25$ADD_ATOM = SubLObjectFactory.makeSymbol("ADD-ATOM");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"));
        $list27 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERT-MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeString("(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_mt_world_state.NIL));
        $sym28$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $sym30$SHOP_MT_WORLD_STATE_ADD_ATOM_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-ADD-ATOM-METHOD");
        $sym31$DELETE_ATOM = SubLObjectFactory.makeSymbol("DELETE-ATOM");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERT-MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeString("(ADD-ATOM SHOP-MT-WORLD-STATE) (LITERAL): LITERAL is not ground.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-ASSERT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not")), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-ADD"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES"))));
        $sym33$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $const34$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $sym35$SHOP_MT_WORLD_STATE_DELETE_ATOM_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-DELETE-ATOM-METHOD");
        $sym36$ADD_LITERALS = SubLObjectFactory.makeSymbol("ADD-LITERALS");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERALS listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_mt_world_state.NIL));
        $sym39$SHOP_MT_WORLD_STATE_ADD_LITERALS_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-ADD-LITERALS-METHOD");
        $sym40$DELETE_LITERALS = SubLObjectFactory.makeSymbol("DELETE-LITERALS");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERALS listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_mt_world_state.NIL));
        $sym42$SHOP_MT_WORLD_STATE_DELETE_LITERALS_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-DELETE-LITERALS-METHOD");
        $sym43$ADD_LITERAL = SubLObjectFactory.makeSymbol("ADD-LITERAL");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))));
        $sym45$SHOP_MT_WORLD_STATE_ADD_LITERAL_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-ADD-LITERAL-METHOD");
        $sym46$DELETE_LITERAL = SubLObjectFactory.makeSymbol("DELETE-LITERAL");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))));
        $sym48$SHOP_MT_WORLD_STATE_DELETE_LITERAL_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-DELETE-LITERAL-METHOD");
        $sym49$SAME_STATE_P = SubLObjectFactory.makeSymbol("SAME-STATE-P");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE1"), (SubLObject)SubLObjectFactory.makeSymbol("STATE2"));
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("STATE1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("STATE1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("STATE2"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-GET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETES"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("STATE2")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SUBSET?"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES1"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SUBSET?"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES2"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_mt_world_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)shop_mt_world_state.EQUAL, (SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("MT2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_mt_world_state.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_mt_world_state.NIL)));
        $sym52$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $sym53$SHOP_MT_WORLD_STATE_SAME_STATE_P_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-SAME-STATE-P-METHOD");
        $sym54$FILTER_DELETED_BINDINGS = SubLObjectFactory.makeSymbol("FILTER-DELETED-BINDINGS");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"));
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-BINDINGS"), (SubLObject)shop_mt_world_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-EMPTY?"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)shop_mt_world_state.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAD-BINDING?"), (SubLObject)shop_mt_world_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-SUPPORT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECOND"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-BINDING")), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF-ASSERTION?"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SUPPORT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-MEMBER?"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-SUPPORT"), (SubLObject)SubLObjectFactory.makeSymbol("DELETES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)shop_mt_world_state.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BAD-BINDING?"), (SubLObject)shop_mt_world_state.T)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("BAD-BINDING?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-BINDINGS"))))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-BINDINGS")))));
        $sym58$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $sym59$SHOP_MT_WORLD_STATE_FILTER_DELETED_BINDINGS_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-FILTER-DELETED-BINDINGS-METHOD");
        $sym60$ASK = SubLObjectFactory.makeSymbol("ASK");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"));
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("MBIND")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INFERENCE-ANSWER-HANDLER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-INFERENCE-SUPPORTS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-RETURN-BLISTS")))), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-USE-SHOP-ASK?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-ASK"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FI-ASK-INT"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("BACKCHAIN")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTER-DELETED-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))));
        $sym63$OUTER_CATCH_FOR_SHOP_MT_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-MT-WORLD-STATE-METHOD");
        $sym64$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = SubLObjectFactory.makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");
        $sym65$INFERENCE_RETURN_BLISTS = SubLObjectFactory.makeSymbol("INFERENCE-RETURN-BLISTS");
        $sym66$SHOP_MT_WORLD_STATE_ASK_METHOD = SubLObjectFactory.makeSymbol("SHOP-MT-WORLD-STATE-ASK-METHOD");
    }
}

/*

	Total time: 266 ms
	
*/