package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
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

public final class shop_basic_world_state extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.shop_basic_world_state";
    public static final String myFingerPrint = "64a0fd173aa588ef90e6ab7d2e695a42f375cc1bef5c22da955be50f39c000f9";
    private static final SubLSymbol $sym0$SHOP_WORLD_STATE;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$SHOP_BASIC_WORLD_STATE;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$VAR_MANAGER;
    private static final SubLSymbol $sym7$NEGATIVE_LITERALS;
    private static final SubLSymbol $sym8$POSITIVE_LITERALS;
    private static final SubLSymbol $sym9$INSTANCE_COUNT;
    private static final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_CLASS;
    private static final SubLSymbol $sym11$ISOLATED_P;
    private static final SubLSymbol $sym12$INSTANCE_NUMBER;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_INSTANCE;
    private static final SubLSymbol $sym14$INITIALIZE;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym18$SHOP_BASIC_WORLD_STATE_INITIALIZE_METHOD;
    private static final SubLSymbol $sym19$SAME_STATE_P;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym24$SHOP_BASIC_WORLD_STATE_SAME_STATE_P_METHOD;
    private static final SubLSymbol $sym25$ADD_ATOM;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLString $str29$ADD_ATOM___s_is_negated___;
    private static final SubLSymbol $sym30$SHOP_BASIC_WORLD_STATE_ADD_ATOM_METHOD;
    private static final SubLSymbol $sym31$DELETE_ATOM;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLString $str34$DELETE_ATOM___s_is_negated___;
    private static final SubLSymbol $sym35$SHOP_BASIC_WORLD_STATE_DELETE_ATOM_METHOD;
    private static final SubLSymbol $sym36$ADD_LITERAL;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$SHOP_BASIC_WORLD_STATE_ADD_LITERAL_METHOD;
    private static final SubLSymbol $sym39$DELETE_LITERAL;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$SHOP_BASIC_WORLD_STATE_DELETE_LITERAL_METHOD;
    private static final SubLSymbol $sym42$ADD_LITERALS;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$SHOP_BASIC_WORLD_STATE_ADD_LITERALS_METHOD;
    private static final SubLSymbol $sym46$DELETE_LITERALS;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$SHOP_BASIC_WORLD_STATE_DELETE_LITERALS_METHOD;
    private static final SubLSymbol $sym49$COPY_STATE;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym52$SHOP_BASIC_WORLD_STATE_COPY_STATE_METHOD;
    private static final SubLSymbol $sym53$NEXT_STATE;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$SHOP_BASIC_WORLD_STATE_NEXT_STATE_METHOD;
    private static final SubLSymbol $sym56$POSITIVE_MATCHES_TO_PREDICATE;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym60$CCONCATENATE;
    private static final SubLSymbol $sym61$SHOP_BASIC_WORLD_STATE_POSITIVE_MATCHES_TO_PREDICATE_METHOD;
    private static final SubLSymbol $sym62$NEGATIVE_MATCHES_TO_PREDICATE;
    private static final SubLList $list63;
    private static final SubLSymbol $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD;
    private static final SubLSymbol $sym65$SHOP_BASIC_WORLD_STATE_NEGATIVE_MATCHES_TO_PREDICATE_METHOD;
    private static final SubLSymbol $sym66$ASK_GROUND_LITERAL;
    private static final SubLList $list67;
    private static final SubLString $str68$ask_ground_literal___s_is_not_gro;
    private static final SubLSymbol $sym69$SHOP_BASIC_WORLD_STATE_ASK_GROUND_LITERAL_METHOD;
    private static final SubLSymbol $sym70$ASK_IF_NOT_GROUND_LITERAL;
    private static final SubLList $list71;
    private static final SubLString $str72$ask_if_not_ground_literal___s_is_;
    private static final SubLSymbol $sym73$SHOP_BASIC_WORLD_STATE_ASK_IF_NOT_GROUND_LITERAL_METHOD;
    private static final SubLSymbol $sym74$ASK;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$SHOP_BASIC_WORLD_STATE_ASK_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 795L)
    public static SubLObject shop_world_state_p(final SubLObject shop_world_state) {
        return interfaces.subloop_instanceof_interface(shop_world_state, (SubLObject)shop_basic_world_state.$sym0$SHOP_WORLD_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject get_shop_basic_world_state_var_manager(final SubLObject v_shop_basic_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_world_state, (SubLObject)shop_basic_world_state.THREE_INTEGER, (SubLObject)shop_basic_world_state.$sym6$VAR_MANAGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject set_shop_basic_world_state_var_manager(final SubLObject v_shop_basic_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_world_state, value, (SubLObject)shop_basic_world_state.THREE_INTEGER, (SubLObject)shop_basic_world_state.$sym6$VAR_MANAGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject get_shop_basic_world_state_negative_literals(final SubLObject v_shop_basic_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_world_state, (SubLObject)shop_basic_world_state.TWO_INTEGER, (SubLObject)shop_basic_world_state.$sym7$NEGATIVE_LITERALS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject set_shop_basic_world_state_negative_literals(final SubLObject v_shop_basic_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_world_state, value, (SubLObject)shop_basic_world_state.TWO_INTEGER, (SubLObject)shop_basic_world_state.$sym7$NEGATIVE_LITERALS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject get_shop_basic_world_state_positive_literals(final SubLObject v_shop_basic_world_state) {
        return classes.subloop_get_access_protected_instance_slot(v_shop_basic_world_state, (SubLObject)shop_basic_world_state.ONE_INTEGER, (SubLObject)shop_basic_world_state.$sym8$POSITIVE_LITERALS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject set_shop_basic_world_state_positive_literals(final SubLObject v_shop_basic_world_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_shop_basic_world_state, value, (SubLObject)shop_basic_world_state.ONE_INTEGER, (SubLObject)shop_basic_world_state.$sym8$POSITIVE_LITERALS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject subloop_reserved_initialize_shop_basic_world_state_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_world_state.$sym3$OBJECT, (SubLObject)shop_basic_world_state.$sym9$INSTANCE_COUNT, (SubLObject)shop_basic_world_state.ZERO_INTEGER);
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject subloop_reserved_initialize_shop_basic_world_state_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_world_state.$sym3$OBJECT, (SubLObject)shop_basic_world_state.$sym11$ISOLATED_P, (SubLObject)shop_basic_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_world_state.$sym3$OBJECT, (SubLObject)shop_basic_world_state.$sym12$INSTANCE_NUMBER, (SubLObject)shop_basic_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym8$POSITIVE_LITERALS, (SubLObject)shop_basic_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym7$NEGATIVE_LITERALS, (SubLObject)shop_basic_world_state.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym6$VAR_MANAGER, (SubLObject)shop_basic_world_state.NIL);
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 1414L)
    public static SubLObject shop_basic_world_state_p(final SubLObject v_shop_basic_world_state) {
        return classes.subloop_instanceof_class(v_shop_basic_world_state, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 2103L)
    public static SubLObject shop_basic_world_state_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        SubLObject negative_literals = get_shop_basic_world_state_negative_literals(self);
        SubLObject positive_literals = get_shop_basic_world_state_positive_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                object.object_initialize_method(self);
                positive_literals = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)shop_basic_world_state.EQ), (SubLObject)shop_basic_world_state.TEN_INTEGER);
                negative_literals = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)shop_basic_world_state.EQ), (SubLObject)shop_basic_world_state.TEN_INTEGER);
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_negative_literals(self, negative_literals);
                    set_shop_basic_world_state_positive_literals(self, positive_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 2317L)
    public static SubLObject shop_basic_world_state_same_state_p_method(final SubLObject self, final SubLObject state1, final SubLObject state2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        final SubLObject negative_literals = get_shop_basic_world_state_negative_literals(self);
        final SubLObject positive_literals = get_shop_basic_world_state_positive_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                final SubLObject pos_lits2 = instances.get_slot(state2, (SubLObject)shop_basic_world_state.$sym8$POSITIVE_LITERALS);
                final SubLObject neg_lits2 = instances.get_slot(state2, (SubLObject)shop_basic_world_state.$sym7$NEGATIVE_LITERALS);
                SubLObject v_answer = (SubLObject)shop_basic_world_state.T;
                SubLObject doneP;
                SubLObject iteration_state;
                for (doneP = (SubLObject)shop_basic_world_state.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(instances.get_slot(state1, (SubLObject)shop_basic_world_state.$sym8$POSITIVE_LITERALS))); shop_basic_world_state.NIL == doneP && shop_basic_world_state.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject value1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject value2 = dictionary.dictionary_lookup(key, pos_lits2, (SubLObject)shop_basic_world_state.UNPROVIDED);
                    if (shop_basic_world_state.NIL != conses_high.subsetp(value1, value2, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED) && shop_basic_world_state.NIL != conses_high.subsetp(value2, value1, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED)) {
                        doneP = (SubLObject)shop_basic_world_state.T;
                        v_answer = (SubLObject)shop_basic_world_state.NIL;
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(instances.get_slot(state1, (SubLObject)shop_basic_world_state.$sym7$NEGATIVE_LITERALS))); shop_basic_world_state.NIL == doneP && shop_basic_world_state.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject value1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject value2 = dictionary.dictionary_lookup(key, neg_lits2, (SubLObject)shop_basic_world_state.UNPROVIDED);
                    if (shop_basic_world_state.NIL != conses_high.subsetp(value1, value2, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED) && shop_basic_world_state.NIL != conses_high.subsetp(value2, value1, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED)) {
                        doneP = (SubLObject)shop_basic_world_state.T;
                        v_answer = (SubLObject)shop_basic_world_state.NIL;
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, v_answer);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_negative_literals(self, negative_literals);
                    set_shop_basic_world_state_positive_literals(self, positive_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 3060L)
    public static SubLObject shop_basic_world_state_add_atom_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        final SubLObject negative_literals = get_shop_basic_world_state_negative_literals(self);
        final SubLObject positive_literals = get_shop_basic_world_state_positive_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                if (shop_basic_world_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_world_state.NIL != cycl_utilities.negatedP(literal)) {
                    Errors.error((SubLObject)shop_basic_world_state.$str29$ADD_ATOM___s_is_negated___, literal);
                }
                final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)shop_basic_world_state.UNPROVIDED);
                final SubLObject negated_lits = dictionary.dictionary_lookup(negative_literals, pred, (SubLObject)shop_basic_world_state.UNPROVIDED);
                dictionary_utilities.dictionary_pushnew(positive_literals, pred, literal, Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED);
                dictionary.dictionary_enter(negative_literals, pred, Sequences.remove(literal, negated_lits, Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED));
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, (SubLObject)shop_basic_world_state.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_negative_literals(self, negative_literals);
                    set_shop_basic_world_state_positive_literals(self, positive_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 3596L)
    public static SubLObject shop_basic_world_state_delete_atom_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        final SubLObject negative_literals = get_shop_basic_world_state_negative_literals(self);
        final SubLObject positive_literals = get_shop_basic_world_state_positive_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                if (shop_basic_world_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_world_state.NIL != cycl_utilities.negatedP(literal)) {
                    Errors.error((SubLObject)shop_basic_world_state.$str34$DELETE_ATOM___s_is_negated___, literal);
                }
                final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)shop_basic_world_state.UNPROVIDED);
                final SubLObject positive_lits = dictionary.dictionary_lookup(positive_literals, pred, (SubLObject)shop_basic_world_state.UNPROVIDED);
                dictionary_utilities.dictionary_pushnew(negative_literals, pred, literal, Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED);
                dictionary.dictionary_enter(positive_literals, pred, Sequences.remove(literal, positive_lits, Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED));
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, (SubLObject)shop_basic_world_state.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_negative_literals(self, negative_literals);
                    set_shop_basic_world_state_positive_literals(self, positive_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4137L)
    public static SubLObject shop_basic_world_state_add_literal_method(final SubLObject self, final SubLObject literal) {
        return shop_basic_world_state_add_atom_method(self, literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4280L)
    public static SubLObject shop_basic_world_state_delete_literal_method(final SubLObject self, final SubLObject literal) {
        return shop_basic_world_state_delete_atom_method(self, literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4422L)
    public static SubLObject shop_basic_world_state_add_literals_method(final SubLObject self, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = (SubLObject)shop_basic_world_state.NIL;
        lit = cdolist_list_var.first();
        while (shop_basic_world_state.NIL != cdolist_list_var) {
            shop_basic_world_state_add_atom_method(self, lit);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4592L)
    public static SubLObject shop_basic_world_state_delete_literals_method(final SubLObject self, final SubLObject literals) {
        SubLObject cdolist_list_var = literals;
        SubLObject lit = (SubLObject)shop_basic_world_state.NIL;
        lit = cdolist_list_var.first();
        while (shop_basic_world_state.NIL != cdolist_list_var) {
            shop_basic_world_state_delete_atom_method(self, lit);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 4767L)
    public static SubLObject shop_basic_world_state_copy_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        final SubLObject negative_literals = get_shop_basic_world_state_negative_literals(self);
        final SubLObject positive_literals = get_shop_basic_world_state_positive_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                final SubLObject new_state = object.object_new_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE);
                instances.set_slot(new_state, (SubLObject)shop_basic_world_state.$sym8$POSITIVE_LITERALS, dictionary_utilities.copy_dictionary(positive_literals));
                instances.set_slot(new_state, (SubLObject)shop_basic_world_state.$sym7$NEGATIVE_LITERALS, dictionary_utilities.copy_dictionary(negative_literals));
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, new_state);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_negative_literals(self, negative_literals);
                    set_shop_basic_world_state_positive_literals(self, positive_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5147L)
    public static SubLObject shop_basic_world_state_next_state_method(final SubLObject self) {
        return shop_basic_world_state_copy_state_method(self);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5319L)
    public static SubLObject shop_basic_world_state_positive_matches_to_predicate_method(final SubLObject self, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        final SubLObject positive_literals = get_shop_basic_world_state_positive_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_world_state.$sym60$CCONCATENATE), multibindings.apply_mb(dictionary.dictionary_lookup(positive_literals, pred, (SubLObject)shop_basic_world_state.UNPROVIDED), shop_parameters.$shop_ask_multibinding$.getDynamicValue(thread))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_positive_literals(self, positive_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5534L)
    public static SubLObject shop_basic_world_state_negative_matches_to_predicate_method(final SubLObject self, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_shop_basic_world_state_method = (SubLObject)shop_basic_world_state.NIL;
        final SubLObject negative_literals = get_shop_basic_world_state_negative_literals(self);
        try {
            thread.throwStack.push(shop_basic_world_state.$sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)shop_basic_world_state.$sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD, Functions.apply(Symbols.symbol_function((SubLObject)shop_basic_world_state.$sym60$CCONCATENATE), multibindings.apply_mb(dictionary.dictionary_lookup(negative_literals, pred, (SubLObject)shop_basic_world_state.UNPROVIDED), shop_parameters.$shop_ask_multibinding$.getDynamicValue(thread))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)shop_basic_world_state.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_shop_basic_world_state_negative_literals(self, negative_literals);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_shop_basic_world_state_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)shop_basic_world_state.$sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_shop_basic_world_state_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 5750L)
    public static SubLObject shop_basic_world_state_ask_ground_literal_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shop_basic_world_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_world_state.NIL == el_utilities.groundP(literal, (SubLObject)shop_basic_world_state.UNPROVIDED)) {
            Errors.error((SubLObject)shop_basic_world_state.$str68$ask_ground_literal___s_is_not_gro, literal);
        }
        return conses_high.member(literal, shop_basic_world_state_positive_matches_to_predicate_method(self, el_utilities.literal_predicate(literal, (SubLObject)shop_basic_world_state.UNPROVIDED)), Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 6013L)
    public static SubLObject shop_basic_world_state_ask_if_not_ground_literal_method(final SubLObject self, final SubLObject literal) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (shop_basic_world_state.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && shop_basic_world_state.NIL == el_utilities.groundP(literal, (SubLObject)shop_basic_world_state.UNPROVIDED)) {
            Errors.error((SubLObject)shop_basic_world_state.$str72$ask_if_not_ground_literal___s_is_, literal);
        }
        return conses_high.member(literal, shop_basic_world_state_negative_matches_to_predicate_method(self, el_utilities.literal_predicate(literal, (SubLObject)shop_basic_world_state.UNPROVIDED)), Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 6290L)
    public static SubLObject shop_basic_world_state_ask_method(final SubLObject self, final SubLObject literal) {
        if (shop_basic_world_state.NIL == el_utilities.groundP(literal, (SubLObject)shop_basic_world_state.UNPROVIDED)) {
            final SubLObject pred = el_utilities.literal_predicate(literal, (SubLObject)shop_basic_world_state.UNPROVIDED);
            final SubLObject positive_matches = shop_basic_world_state_positive_matches_to_predicate_method(self, pred);
            SubLObject v_bindings = (SubLObject)shop_basic_world_state.NIL;
            SubLObject cdolist_list_var = positive_matches;
            SubLObject cur_lit = (SubLObject)shop_basic_world_state.NIL;
            cur_lit = cdolist_list_var.first();
            while (shop_basic_world_state.NIL != cdolist_list_var) {
                final SubLObject mgu = unification_utilities.term_unify(literal, cur_lit, (SubLObject)shop_basic_world_state.UNPROVIDED, (SubLObject)shop_basic_world_state.UNPROVIDED);
                if (shop_basic_world_state.NIL != mgu) {
                    v_bindings = (SubLObject)ConsesLow.cons(mgu, v_bindings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_lit = cdolist_list_var.first();
            }
            return v_bindings;
        }
        if (shop_basic_world_state.NIL != shop_basic_world_state_ask_ground_literal_method(self, literal)) {
            return (SubLObject)shop_basic_world_state.$list76;
        }
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/shop-basic-world-state.lisp", position = 6934L)
    public static SubLObject confirm_bindings_against_world_state(final SubLObject world_state, final SubLObject goals, final SubLObject v_bindings) {
        if (v_bindings.equal((SubLObject)shop_basic_world_state.$list76)) {
            SubLObject confirmedP = (SubLObject)shop_basic_world_state.T;
            SubLObject cdolist_list_var = goals;
            SubLObject cur_lit = (SubLObject)shop_basic_world_state.NIL;
            cur_lit = cdolist_list_var.first();
            while (shop_basic_world_state.NIL != cdolist_list_var) {
                final SubLObject pred = el_utilities.literal_predicate(cur_lit, (SubLObject)shop_basic_world_state.UNPROVIDED);
                final SubLObject neg_matches = methods.funcall_instance_method_with_1_args(world_state, (SubLObject)shop_basic_world_state.$sym62$NEGATIVE_MATCHES_TO_PREDICATE, pred);
                if (shop_basic_world_state.NIL != subl_promotions.memberP(cur_lit, neg_matches, Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED)) {
                    confirmedP = (SubLObject)shop_basic_world_state.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_lit = cdolist_list_var.first();
            }
            return (SubLObject)((shop_basic_world_state.NIL != confirmedP) ? v_bindings : shop_basic_world_state.NIL);
        }
        SubLObject new_bindings = (SubLObject)shop_basic_world_state.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject cur_binding = (SubLObject)shop_basic_world_state.NIL;
        cur_binding = cdolist_list_var.first();
        while (shop_basic_world_state.NIL != cdolist_list_var) {
            SubLObject confirmedP2 = (SubLObject)shop_basic_world_state.T;
            SubLObject cdolist_list_var_$1 = goals;
            SubLObject cur_lit2 = (SubLObject)shop_basic_world_state.NIL;
            cur_lit2 = cdolist_list_var_$1.first();
            while (shop_basic_world_state.NIL != cdolist_list_var_$1) {
                if (shop_basic_world_state.NIL == cycl_utilities.negatedP(cur_lit2)) {
                    final SubLObject pred2 = el_utilities.literal_predicate(cur_lit2, (SubLObject)shop_basic_world_state.UNPROVIDED);
                    final SubLObject neg_matches2 = methods.funcall_instance_method_with_1_args(world_state, (SubLObject)shop_basic_world_state.$sym62$NEGATIVE_MATCHES_TO_PREDICATE, pred2);
                    if (shop_basic_world_state.NIL != subl_promotions.memberP(shop_datastructures.shop_apply_substitution(cur_lit2, cur_binding), neg_matches2, Symbols.symbol_function((SubLObject)shop_basic_world_state.EQUAL), (SubLObject)shop_basic_world_state.UNPROVIDED)) {
                        confirmedP2 = (SubLObject)shop_basic_world_state.NIL;
                    }
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                cur_lit2 = cdolist_list_var_$1.first();
            }
            if (shop_basic_world_state.NIL != confirmedP2) {
                new_bindings = (SubLObject)ConsesLow.cons(cur_binding, new_bindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_binding = cdolist_list_var.first();
        }
        return new_bindings;
    }
    
    public static SubLObject declare_shop_basic_world_state_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_world_state_p", "SHOP-WORLD-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "get_shop_basic_world_state_var_manager", "GET-SHOP-BASIC-WORLD-STATE-VAR-MANAGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "set_shop_basic_world_state_var_manager", "SET-SHOP-BASIC-WORLD-STATE-VAR-MANAGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "get_shop_basic_world_state_negative_literals", "GET-SHOP-BASIC-WORLD-STATE-NEGATIVE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "set_shop_basic_world_state_negative_literals", "SET-SHOP-BASIC-WORLD-STATE-NEGATIVE-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "get_shop_basic_world_state_positive_literals", "GET-SHOP-BASIC-WORLD-STATE-POSITIVE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "set_shop_basic_world_state_positive_literals", "SET-SHOP-BASIC-WORLD-STATE-POSITIVE-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "subloop_reserved_initialize_shop_basic_world_state_class", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "subloop_reserved_initialize_shop_basic_world_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_p", "SHOP-BASIC-WORLD-STATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_initialize_method", "SHOP-BASIC-WORLD-STATE-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_same_state_p_method", "SHOP-BASIC-WORLD-STATE-SAME-STATE-P-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_add_atom_method", "SHOP-BASIC-WORLD-STATE-ADD-ATOM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_delete_atom_method", "SHOP-BASIC-WORLD-STATE-DELETE-ATOM-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_add_literal_method", "SHOP-BASIC-WORLD-STATE-ADD-LITERAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_delete_literal_method", "SHOP-BASIC-WORLD-STATE-DELETE-LITERAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_add_literals_method", "SHOP-BASIC-WORLD-STATE-ADD-LITERALS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_delete_literals_method", "SHOP-BASIC-WORLD-STATE-DELETE-LITERALS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_copy_state_method", "SHOP-BASIC-WORLD-STATE-COPY-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_next_state_method", "SHOP-BASIC-WORLD-STATE-NEXT-STATE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_positive_matches_to_predicate_method", "SHOP-BASIC-WORLD-STATE-POSITIVE-MATCHES-TO-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_negative_matches_to_predicate_method", "SHOP-BASIC-WORLD-STATE-NEGATIVE-MATCHES-TO-PREDICATE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_ask_ground_literal_method", "SHOP-BASIC-WORLD-STATE-ASK-GROUND-LITERAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_ask_if_not_ground_literal_method", "SHOP-BASIC-WORLD-STATE-ASK-IF-NOT-GROUND-LITERAL-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "shop_basic_world_state_ask_method", "SHOP-BASIC-WORLD-STATE-ASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.shop_basic_world_state", "confirm_bindings_against_world_state", "CONFIRM-BINDINGS-AGAINST-WORLD-STATE", 3, 0, false);
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    public static SubLObject init_shop_basic_world_state_file() {
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    public static SubLObject setup_shop_basic_world_state_file() {
        interfaces.new_interface((SubLObject)shop_basic_world_state.$sym0$SHOP_WORLD_STATE, (SubLObject)shop_basic_world_state.NIL, (SubLObject)shop_basic_world_state.NIL, (SubLObject)shop_basic_world_state.$list1);
        classes.subloop_new_class((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym3$OBJECT, (SubLObject)shop_basic_world_state.$list4, (SubLObject)shop_basic_world_state.NIL, (SubLObject)shop_basic_world_state.$list5);
        classes.class_set_implements_slot_listeners((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_INSTANCE);
        subloop_reserved_initialize_shop_basic_world_state_class((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym14$INITIALIZE, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list15, (SubLObject)shop_basic_world_state.NIL, (SubLObject)shop_basic_world_state.$list16);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym14$INITIALIZE, (SubLObject)shop_basic_world_state.$sym18$SHOP_BASIC_WORLD_STATE_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method((SubLObject)shop_basic_world_state.$sym19$SAME_STATE_P, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list21, (SubLObject)shop_basic_world_state.$list22);
        methods.subloop_register_class_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym19$SAME_STATE_P, (SubLObject)shop_basic_world_state.$sym24$SHOP_BASIC_WORLD_STATE_SAME_STATE_P_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym25$ADD_ATOM, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list27);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym25$ADD_ATOM, (SubLObject)shop_basic_world_state.$sym30$SHOP_BASIC_WORLD_STATE_ADD_ATOM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym31$DELETE_ATOM, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list32);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym31$DELETE_ATOM, (SubLObject)shop_basic_world_state.$sym35$SHOP_BASIC_WORLD_STATE_DELETE_ATOM_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym36$ADD_LITERAL, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list37);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym36$ADD_LITERAL, (SubLObject)shop_basic_world_state.$sym38$SHOP_BASIC_WORLD_STATE_ADD_LITERAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym39$DELETE_LITERAL, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list40);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym39$DELETE_LITERAL, (SubLObject)shop_basic_world_state.$sym41$SHOP_BASIC_WORLD_STATE_DELETE_LITERAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym42$ADD_LITERALS, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list43, (SubLObject)shop_basic_world_state.$list44);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym42$ADD_LITERALS, (SubLObject)shop_basic_world_state.$sym45$SHOP_BASIC_WORLD_STATE_ADD_LITERALS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym46$DELETE_LITERALS, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list43, (SubLObject)shop_basic_world_state.$list47);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym46$DELETE_LITERALS, (SubLObject)shop_basic_world_state.$sym48$SHOP_BASIC_WORLD_STATE_DELETE_LITERALS_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym49$COPY_STATE, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.NIL, (SubLObject)shop_basic_world_state.$list50);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym49$COPY_STATE, (SubLObject)shop_basic_world_state.$sym52$SHOP_BASIC_WORLD_STATE_COPY_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym53$NEXT_STATE, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.NIL, (SubLObject)shop_basic_world_state.$list54);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym53$NEXT_STATE, (SubLObject)shop_basic_world_state.$sym55$SHOP_BASIC_WORLD_STATE_NEXT_STATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym56$POSITIVE_MATCHES_TO_PREDICATE, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list15, (SubLObject)shop_basic_world_state.$list57, (SubLObject)shop_basic_world_state.$list58);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym56$POSITIVE_MATCHES_TO_PREDICATE, (SubLObject)shop_basic_world_state.$sym61$SHOP_BASIC_WORLD_STATE_POSITIVE_MATCHES_TO_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym62$NEGATIVE_MATCHES_TO_PREDICATE, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list15, (SubLObject)shop_basic_world_state.$list57, (SubLObject)shop_basic_world_state.$list63);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym62$NEGATIVE_MATCHES_TO_PREDICATE, (SubLObject)shop_basic_world_state.$sym65$SHOP_BASIC_WORLD_STATE_NEGATIVE_MATCHES_TO_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym66$ASK_GROUND_LITERAL, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list67);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym66$ASK_GROUND_LITERAL, (SubLObject)shop_basic_world_state.$sym69$SHOP_BASIC_WORLD_STATE_ASK_GROUND_LITERAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym70$ASK_IF_NOT_GROUND_LITERAL, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list71);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym70$ASK_IF_NOT_GROUND_LITERAL, (SubLObject)shop_basic_world_state.$sym73$SHOP_BASIC_WORLD_STATE_ASK_IF_NOT_GROUND_LITERAL_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)shop_basic_world_state.$sym74$ASK, (SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$list20, (SubLObject)shop_basic_world_state.$list26, (SubLObject)shop_basic_world_state.$list75);
        methods.subloop_register_instance_method((SubLObject)shop_basic_world_state.$sym2$SHOP_BASIC_WORLD_STATE, (SubLObject)shop_basic_world_state.$sym74$ASK, (SubLObject)shop_basic_world_state.$sym77$SHOP_BASIC_WORLD_STATE_ASK_METHOD);
        return (SubLObject)shop_basic_world_state.NIL;
    }
    
    public void declareFunctions() {
        declare_shop_basic_world_state_file();
    }
    
    public void initializeVariables() {
        init_shop_basic_world_state_file();
    }
    
    public void runTopLevelForms() {
        setup_shop_basic_world_state_file();
    }
    
    static {
        me = (SubLFile)new shop_basic_world_state();
        $sym0$SHOP_WORLD_STATE = SubLObjectFactory.makeSymbol("SHOP-WORLD-STATE");
        $list1 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-ATOM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATOM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("DELETE-ATOM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ATOM")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("COPY-STATE"), (SubLObject)shop_basic_world_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEXT-STATE"), (SubLObject)shop_basic_world_state.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-CLASS-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SAME-STATE-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE1"), (SubLObject)SubLObjectFactory.makeSymbol("STATE2")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")) });
        $sym2$SHOP_BASIC_WORLD_STATE = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE");
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SHOP-WORLD-STATE"));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR-MANAGER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PRIVATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASK-GROUND-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASK-IF-NOT-GROUND-LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-MATCHES-TO-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-MATCHES-TO-PREDICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ASK-WITH-MULTIBINDING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("MBINDING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym6$VAR_MANAGER = SubLObjectFactory.makeSymbol("VAR-MANAGER");
        $sym7$NEGATIVE_LITERALS = SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS");
        $sym8$POSITIVE_LITERALS = SubLObjectFactory.makeSymbol("POSITIVE-LITERALS");
        $sym9$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym10$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-CLASS");
        $sym11$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym12$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym13$SUBLOOP_RESERVED_INITIALIZE_SHOP_BASIC_WORLD_STATE_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SHOP-BASIC-WORLD-STATE-INSTANCE");
        $sym14$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list16 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQ), (SubLObject)shop_basic_world_state.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQ), (SubLObject)shop_basic_world_state.TEN_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym17$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $sym18$SHOP_BASIC_WORLD_STATE_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-INITIALIZE-METHOD");
        $sym19$SAME_STATE_P = SubLObjectFactory.makeSymbol("SAME-STATE-P");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE1"), (SubLObject)SubLObjectFactory.makeSymbol("STATE2"));
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-LITS2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("STATE2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("STATE2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)shop_basic_world_state.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)shop_basic_world_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("STATE1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"))), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS2")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)shop_basic_world_state.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)shop_basic_world_state.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("STATE1"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"))), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE2"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS2")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSETP"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?"), (SubLObject)shop_basic_world_state.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"), (SubLObject)shop_basic_world_state.NIL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("ANSWER"))));
        $sym23$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $sym24$SHOP_BASIC_WORLD_STATE_SAME_STATE_P_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-SAME-STATE-P-METHOD");
        $sym25$ADD_ATOM = SubLObjectFactory.makeSymbol("ADD-ATOM");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERAL consp\n   @return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATED?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)SubLObjectFactory.makeString("ADD-ATOM: ~s is negated.~%"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATED-LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-PUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATED-LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_world_state.T));
        $sym28$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $str29$ADD_ATOM___s_is_negated___ = SubLObjectFactory.makeString("ADD-ATOM: ~s is negated.~%");
        $sym30$SHOP_BASIC_WORLD_STATE_ADD_ATOM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-ADD-ATOM-METHOD");
        $sym31$DELETE_ATOM = SubLObjectFactory.makeSymbol("DELETE-ATOM");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERAL consp\n   @return booleanp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATED?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)SubLObjectFactory.makeString("DELETE-ATOM: ~s is negated.~%"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-PUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQUAL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-ENTER"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQUAL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_world_state.T));
        $sym33$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $str34$DELETE_ATOM___s_is_negated___ = SubLObjectFactory.makeString("DELETE-ATOM: ~s is negated.~%");
        $sym35$SHOP_BASIC_WORLD_STATE_DELETE_ATOM_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-DELETE-ATOM-METHOD");
        $sym36$ADD_LITERAL = SubLObjectFactory.makeSymbol("ADD-LITERAL");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERAL listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))));
        $sym38$SHOP_BASIC_WORLD_STATE_ADD_LITERAL_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-ADD-LITERAL-METHOD");
        $sym39$DELETE_LITERAL = SubLObjectFactory.makeSymbol("DELETE-LITERAL");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERAL listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))));
        $sym41$SHOP_BASIC_WORLD_STATE_DELETE_LITERAL_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-DELETE-LITERAL-METHOD");
        $sym42$ADD_LITERALS = SubLObjectFactory.makeSymbol("ADD-LITERALS");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERALS"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERALS listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_world_state.NIL));
        $sym45$SHOP_BASIC_WORLD_STATE_ADD_LITERALS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-ADD-LITERALS-METHOD");
        $sym46$DELETE_LITERALS = SubLObjectFactory.makeSymbol("DELETE-LITERALS");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERALS listp"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE-ATOM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LIT"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_world_state.NIL));
        $sym48$SHOP_BASIC_WORLD_STATE_DELETE_LITERALS_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-DELETE-LITERALS-METHOD");
        $sym49$COPY_STATE = SubLObjectFactory.makeSymbol("COPY-STATE");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return shop-basic-world-state-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-DICTIONARY"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-STATE"))));
        $sym51$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $sym52$SHOP_BASIC_WORLD_STATE_COPY_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-COPY-STATE-METHOD");
        $sym53$NEXT_STATE = SubLObjectFactory.makeSymbol("NEXT-STATE");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return shop-basic-world-state-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INLINE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COPY-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE")), (SubLObject)SubLObjectFactory.makeSymbol("SELF"))));
        $sym55$SHOP_BASIC_WORLD_STATE_NEXT_STATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-NEXT-STATE-METHOD");
        $sym56$POSITIVE_MATCHES_TO_PREDICATE = SubLObjectFactory.makeSymbol("POSITIVE-MATCHES-TO-PREDICATE");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-ASK-MULTIBINDING*")))));
        $sym59$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $sym60$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym61$SHOP_BASIC_WORLD_STATE_POSITIVE_MATCHES_TO_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-POSITIVE-MATCHES-TO-PREDICATE-METHOD");
        $sym62$NEGATIVE_MATCHES_TO_PREDICATE = SubLObjectFactory.makeSymbol("NEGATIVE-MATCHES-TO-PREDICATE");
        $list63 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("APPLY-MB"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DICTIONARY-LOOKUP"), (SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-LITERALS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)SubLObjectFactory.makeSymbol("*SHOP-ASK-MULTIBINDING*")))));
        $sym64$OUTER_CATCH_FOR_SHOP_BASIC_WORLD_STATE_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-SHOP-BASIC-WORLD-STATE-METHOD");
        $sym65$SHOP_BASIC_WORLD_STATE_NEGATIVE_MATCHES_TO_PREDICATE_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-NEGATIVE-MATCHES-TO-PREDICATE-METHOD");
        $sym66$ASK_GROUND_LITERAL = SubLObjectFactory.makeSymbol("ASK-GROUND-LITERAL");
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUND?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeString("ask-ground-literal: ~s is not ground.~%"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-MATCHES-TO-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQUAL))));
        $str68$ask_ground_literal___s_is_not_gro = SubLObjectFactory.makeString("ask-ground-literal: ~s is not ground.~%");
        $sym69$SHOP_BASIC_WORLD_STATE_ASK_GROUND_LITERAL_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-ASK-GROUND-LITERAL-METHOD");
        $sym70$ASK_IF_NOT_GROUND_LITERAL = SubLObjectFactory.makeSymbol("ASK-IF-NOT-GROUND-LITERAL");
        $list71 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUND?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)SubLObjectFactory.makeString("ask-if-not-ground-literal: ~s is not ground.~%"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEGATIVE-MATCHES-TO-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)shop_basic_world_state.EQUAL))));
        $str72$ask_if_not_ground_literal___s_is_ = SubLObjectFactory.makeString("ask-if-not-ground-literal: ~s is not ground.~%");
        $sym73$SHOP_BASIC_WORLD_STATE_ASK_IF_NOT_GROUND_LITERAL_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-ASK-IF-NOT-GROUND-LITERAL-METHOD");
        $sym74$ASK = SubLObjectFactory.makeSymbol("ASK");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param LITERAL consp\n   @param MBINDING multibinding-p\n   @return binding-list-p"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUND?"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASK-GROUND-LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)shop_basic_world_state.T, (SubLObject)shop_basic_world_state.T))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)shop_basic_world_state.NIL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-MATCHES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-MATCHES-TO-PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)shop_basic_world_state.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUR-LIT"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-MATCHES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MGU"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-UNIFY"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("CUR-LIT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MGU"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("MGU"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"))));
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)shop_basic_world_state.T, (SubLObject)shop_basic_world_state.T)));
        $sym77$SHOP_BASIC_WORLD_STATE_ASK_METHOD = SubLObjectFactory.makeSymbol("SHOP-BASIC-WORLD-STATE-ASK-METHOD");
    }
}

/*

	Total time: 315 ms
	
*/