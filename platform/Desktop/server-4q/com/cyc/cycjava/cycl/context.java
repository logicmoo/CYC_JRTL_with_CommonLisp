package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class context extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.context";
    public static final String myFingerPrint = "71ef8a70d50e9aa5da7f97d1ddfaed2a08d51faf507018293ecbf721256a31f8";
    private static final SubLSymbol $sym0$CONTEXT;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$PARSE_TREE_CONTEXT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS;
    private static final SubLSymbol $sym6$ISOLATED_P;
    private static final SubLSymbol $sym7$INSTANCE_NUMBER;
    private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE;
    private static final SubLSymbol $sym9$INITIALIZE;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD;
    private static final SubLSymbol $sym13$CONTEXT_INITIALIZE_METHOD;
    private static final SubLSymbol $sym14$GET_PARSE_TREE_CONTEXT;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD;
    private static final SubLSymbol $sym18$CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$INSTANCES;
    private static final SubLSymbol $sym21$PARSE_TREES;
    private static final SubLSymbol $sym22$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS;
    private static final SubLSymbol $sym23$INSTANCE_COUNTER;
    private static final SubLSymbol $sym24$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLInteger $int27$32;
    private static final SubLSymbol $sym28$PARSE_TREE_CONTEXT_INITIALIZE_METHOD;
    private static final SubLSymbol $sym29$ADD_TREE;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLSymbol $sym33$PARSE_TREE_P;
    private static final SubLSymbol $sym34$PARSE_TREE_CONTEXT_ADD_TREE_METHOD;
    private static final SubLSymbol $sym35$GET_TREE;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLSymbol $sym39$INTEGERP;
    private static final SubLSymbol $sym40$PARSE_TREE_CONTEXT_GET_TREE_METHOD;
    private static final SubLSymbol $sym41$GET_PRECEDING_TREES;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLSymbol $sym45$PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD;
    private static final SubLSymbol $sym46$GET_FOLLOWING_TREES;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLSymbol $sym49$PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD;
    private static final SubLSymbol $sym50$GET_INSTANCE;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLSymbol $sym54$CYCLIFIABLE_P;
    private static final SubLSymbol $sym55$GET_REFS;
    private static final SubLSymbol $sym56$CREATE_INSTANCE;
    private static final SubLSymbol $sym57$PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLObject $const60$InstanceFn;
    private static final SubLSymbol $sym61$PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD;
    private static final SubLSymbol $sym62$NEW_VARIABLE;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLString $str65$X;
    private static final SubLSymbol $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD;
    private static final SubLSymbol $sym67$PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1234L)
    public static SubLObject get_context_parse_tree_context(final SubLObject v_context) {
        return classes.subloop_get_access_protected_instance_slot(v_context, (SubLObject)context.ONE_INTEGER, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1234L)
    public static SubLObject set_context_parse_tree_context(final SubLObject v_context, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_context, value, (SubLObject)context.ONE_INTEGER, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1234L)
    public static SubLObject subloop_reserved_initialize_context_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.$sym4$INSTANCE_COUNT, (SubLObject)context.ZERO_INTEGER);
        return (SubLObject)context.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1234L)
    public static SubLObject subloop_reserved_initialize_context_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.$sym6$ISOLATED_P, (SubLObject)context.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.$sym7$INSTANCE_NUMBER, (SubLObject)context.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.NIL);
        return (SubLObject)context.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1234L)
    public static SubLObject context_p(final SubLObject v_context) {
        return classes.subloop_instanceof_class(v_context, (SubLObject)context.$sym0$CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1475L)
    public static SubLObject context_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_context_method = (SubLObject)context.NIL;
        SubLObject parse_tree_context = get_context_parse_tree_context(self);
        try {
            thread.throwStack.push(context.$sym12$OUTER_CATCH_FOR_CONTEXT_METHOD);
            try {
                object.object_initialize_method(self);
                parse_tree_context = object.new_class_instance((SubLObject)context.$sym3$PARSE_TREE_CONTEXT);
                Dynamic.sublisp_throw((SubLObject)context.$sym12$OUTER_CATCH_FOR_CONTEXT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_context_parse_tree_context(self, parse_tree_context);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym12$OUTER_CATCH_FOR_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1680L)
    public static SubLObject context_get_parse_tree_context_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_context_method = (SubLObject)context.NIL;
        final SubLObject parse_tree_context = get_context_parse_tree_context(self);
        try {
            thread.throwStack.push(context.$sym17$OUTER_CATCH_FOR_CONTEXT_METHOD);
            try {
                Dynamic.sublisp_throw((SubLObject)context.$sym17$OUTER_CATCH_FOR_CONTEXT_METHOD, parse_tree_context);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_context_parse_tree_context(self, parse_tree_context);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym17$OUTER_CATCH_FOR_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject get_parse_tree_context_instance_counter(final SubLObject parse_tree_context) {
        return classes.subloop_get_instance_slot(parse_tree_context, (SubLObject)context.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject set_parse_tree_context_instance_counter(final SubLObject parse_tree_context, final SubLObject value) {
        return classes.subloop_set_instance_slot(parse_tree_context, value, (SubLObject)context.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject get_parse_tree_context_instances(final SubLObject parse_tree_context) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_context, (SubLObject)context.TWO_INTEGER, (SubLObject)context.$sym20$INSTANCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject set_parse_tree_context_instances(final SubLObject parse_tree_context, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_context, value, (SubLObject)context.TWO_INTEGER, (SubLObject)context.$sym20$INSTANCES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject get_parse_tree_context_parse_trees(final SubLObject parse_tree_context) {
        return classes.subloop_get_access_protected_instance_slot(parse_tree_context, (SubLObject)context.ONE_INTEGER, (SubLObject)context.$sym21$PARSE_TREES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject set_parse_tree_context_parse_trees(final SubLObject parse_tree_context, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(parse_tree_context, value, (SubLObject)context.ONE_INTEGER, (SubLObject)context.$sym21$PARSE_TREES);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject subloop_reserved_initialize_parse_tree_context_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.$sym4$INSTANCE_COUNT, (SubLObject)context.ZERO_INTEGER);
        return (SubLObject)context.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject subloop_reserved_initialize_parse_tree_context_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.$sym6$ISOLATED_P, (SubLObject)context.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.$sym7$INSTANCE_NUMBER, (SubLObject)context.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym21$PARSE_TREES, (SubLObject)context.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym20$INSTANCES, (SubLObject)context.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym23$INSTANCE_COUNTER, (SubLObject)context.ZERO_INTEGER);
        return (SubLObject)context.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 1832L)
    public static SubLObject parse_tree_context_p(final SubLObject parse_tree_context) {
        return classes.subloop_instanceof_class(parse_tree_context, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 2537L)
    public static SubLObject parse_tree_context_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        SubLObject v_instances = get_parse_tree_context_instances(self);
        try {
            thread.throwStack.push(context.$sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                object.object_initialize_method(self);
                v_instances = Hashtables.make_hash_table((SubLObject)context.$int27$32, (SubLObject)context.EQL, (SubLObject)context.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)context.$sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_instances(self, v_instances);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 2686L)
    public static SubLObject parse_tree_context_add_tree_method(final SubLObject self, final SubLObject v_parse_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push(context.$sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert context.NIL != parse_tree.parse_tree_p(v_parse_tree) : v_parse_tree;
                if (context.NIL == conses_high.member(v_parse_tree, parse_trees, (SubLObject)context.EQ, Symbols.symbol_function((SubLObject)context.IDENTITY))) {
                    parse_trees = (SubLObject)ConsesLow.cons(v_parse_tree, parse_trees);
                }
                Dynamic.sublisp_throw((SubLObject)context.$sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, parse_trees);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 3018L)
    public static SubLObject parse_tree_context_get_tree_method(final SubLObject self, final SubLObject tree, final SubLObject i) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        final SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push(context.$sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert context.NIL != parse_tree.parse_tree_p(tree) : tree;
                assert context.NIL != Types.integerp(i) : i;
                SubLObject position = Sequences.position(tree, parse_trees, (SubLObject)context.EQ, (SubLObject)context.UNPROVIDED, (SubLObject)context.UNPROVIDED, (SubLObject)context.UNPROVIDED);
                SubLObject offset = (SubLObject)context.NIL;
                if (context.NIL == position) {
                    position = (SubLObject)context.MINUS_ONE_INTEGER;
                }
                offset = Numbers.subtract(position, i);
                Dynamic.sublisp_throw((SubLObject)context.$sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, (SubLObject)((context.NIL != subl_promotions.non_negative_integer_p(offset)) ? ConsesLow.nth(offset, parse_trees) : context.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 3477L)
    public static SubLObject parse_tree_context_get_preceding_trees_method(final SubLObject self, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        final SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push(context.$sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert context.NIL != parse_tree.parse_tree_p(tree) : tree;
                SubLObject position = Sequences.position(tree, parse_trees, (SubLObject)context.EQ, (SubLObject)context.UNPROVIDED, (SubLObject)context.UNPROVIDED, (SubLObject)context.UNPROVIDED);
                if (context.NIL == position) {
                    position = (SubLObject)context.MINUS_ONE_INTEGER;
                }
                Dynamic.sublisp_throw((SubLObject)context.$sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, Sequences.subseq(parse_trees, number_utilities.f_1X(position), (SubLObject)context.UNPROVIDED));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 3818L)
    public static SubLObject parse_tree_context_get_following_trees_method(final SubLObject self, final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        final SubLObject parse_trees = get_parse_tree_context_parse_trees(self);
        try {
            thread.throwStack.push(context.$sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert context.NIL != parse_tree.parse_tree_p(tree) : tree;
                final SubLObject position = Sequences.position(tree, parse_trees, (SubLObject)context.EQ, (SubLObject)context.UNPROVIDED, (SubLObject)context.UNPROVIDED, (SubLObject)context.UNPROVIDED);
                Dynamic.sublisp_throw((SubLObject)context.$sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, (SubLObject)((context.NIL != position) ? Sequences.nreverse(Sequences.subseq(parse_trees, (SubLObject)context.ZERO_INTEGER, position)) : context.NIL));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_parse_trees(self, parse_trees);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 4141L)
    public static SubLObject parse_tree_context_get_instance_method(final SubLObject self, final SubLObject np) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        final SubLObject v_instances = get_parse_tree_context_instances(self);
        try {
            thread.throwStack.push(context.$sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                assert context.NIL != cyclifier_interface.cyclifiable_p(np) : np;
                SubLObject instance = Hashtables.gethash(methods.funcall_instance_method_with_0_args(np, (SubLObject)context.$sym55$GET_REFS), v_instances, (SubLObject)context.UNPROVIDED);
                if (context.NIL == instance) {
                    instance = methods.funcall_instance_method_with_1_args(self, (SubLObject)context.$sym56$CREATE_INSTANCE, np);
                }
                Dynamic.sublisp_throw((SubLObject)context.$sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, instance);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_instances(self, v_instances);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 4447L)
    public static SubLObject parse_tree_context_create_instance_method(final SubLObject self, final SubLObject np) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        final SubLObject v_instances = get_parse_tree_context_instances(self);
        try {
            thread.throwStack.push(context.$sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                final SubLObject ref = methods.funcall_instance_method_with_0_args(np, (SubLObject)context.$sym55$GET_REFS).first();
                final SubLObject instance = (SubLObject)ConsesLow.list(context.$const60$InstanceFn, cycl_variables.el_var_name(ref));
                Hashtables.sethash(ref, v_instances, instance);
                Dynamic.sublisp_throw((SubLObject)context.$sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, instance);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_instances(self, v_instances);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/context.lisp", position = 4715L)
    public static SubLObject parse_tree_context_new_variable_method(final SubLObject self, SubLObject string) {
        if (string == context.UNPROVIDED) {
            string = (SubLObject)context.$str65$X;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_parse_tree_context_method = (SubLObject)context.NIL;
        SubLObject instance_counter = get_parse_tree_context_instance_counter(self);
        try {
            thread.throwStack.push(context.$sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
            try {
                instance_counter = Numbers.add(instance_counter, (SubLObject)context.ONE_INTEGER);
                Dynamic.sublisp_throw((SubLObject)context.$sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD, cycl_variables.make_el_var(el_utilities.string_to_el_var_name(Sequences.cconcatenate(string, PrintLow.write_to_string(instance_counter, context.EMPTY_SUBL_OBJECT_ARRAY)))));
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)context.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_parse_tree_context_instance_counter(self, instance_counter);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_parse_tree_context_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)context.$sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_parse_tree_context_method;
    }
    
    public static SubLObject declare_context_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "get_context_parse_tree_context", "GET-CONTEXT-PARSE-TREE-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "set_context_parse_tree_context", "SET-CONTEXT-PARSE-TREE-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "subloop_reserved_initialize_context_class", "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "subloop_reserved_initialize_context_instance", "SUBLOOP-RESERVED-INITIALIZE-CONTEXT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "context_p", "CONTEXT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "context_initialize_method", "CONTEXT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "context_get_parse_tree_context_method", "CONTEXT-GET-PARSE-TREE-CONTEXT-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "get_parse_tree_context_instance_counter", "GET-PARSE-TREE-CONTEXT-INSTANCE-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "set_parse_tree_context_instance_counter", "SET-PARSE-TREE-CONTEXT-INSTANCE-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "get_parse_tree_context_instances", "GET-PARSE-TREE-CONTEXT-INSTANCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "set_parse_tree_context_instances", "SET-PARSE-TREE-CONTEXT-INSTANCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "get_parse_tree_context_parse_trees", "GET-PARSE-TREE-CONTEXT-PARSE-TREES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "set_parse_tree_context_parse_trees", "SET-PARSE-TREE-CONTEXT-PARSE-TREES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "subloop_reserved_initialize_parse_tree_context_class", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "subloop_reserved_initialize_parse_tree_context_instance", "SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_p", "PARSE-TREE-CONTEXT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_initialize_method", "PARSE-TREE-CONTEXT-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_add_tree_method", "PARSE-TREE-CONTEXT-ADD-TREE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_get_tree_method", "PARSE-TREE-CONTEXT-GET-TREE-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_get_preceding_trees_method", "PARSE-TREE-CONTEXT-GET-PRECEDING-TREES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_get_following_trees_method", "PARSE-TREE-CONTEXT-GET-FOLLOWING-TREES-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_get_instance_method", "PARSE-TREE-CONTEXT-GET-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_create_instance_method", "PARSE-TREE-CONTEXT-CREATE-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.context", "parse_tree_context_new_variable_method", "PARSE-TREE-CONTEXT-NEW-VARIABLE-METHOD", 1, 1, false);
        return (SubLObject)context.NIL;
    }
    
    public static SubLObject init_context_file() {
        return (SubLObject)context.NIL;
    }
    
    public static SubLObject setup_context_file() {
        classes.subloop_new_class((SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.NIL, (SubLObject)context.NIL, (SubLObject)context.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)context.$sym0$CONTEXT, (SubLObject)context.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$sym5$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$sym8$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE);
        subloop_reserved_initialize_context_class((SubLObject)context.$sym0$CONTEXT);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym9$INITIALIZE, (SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$list10, (SubLObject)context.NIL, (SubLObject)context.$list11);
        methods.subloop_register_instance_method((SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$sym9$INITIALIZE, (SubLObject)context.$sym13$CONTEXT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym14$GET_PARSE_TREE_CONTEXT, (SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$list15, (SubLObject)context.NIL, (SubLObject)context.$list16);
        methods.subloop_register_instance_method((SubLObject)context.$sym0$CONTEXT, (SubLObject)context.$sym14$GET_PARSE_TREE_CONTEXT, (SubLObject)context.$sym18$CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD);
        classes.subloop_new_class((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym1$OBJECT, (SubLObject)context.NIL, (SubLObject)context.NIL, (SubLObject)context.$list19);
        classes.class_set_implements_slot_listeners((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym22$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym24$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE);
        subloop_reserved_initialize_parse_tree_context_class((SubLObject)context.$sym3$PARSE_TREE_CONTEXT);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym9$INITIALIZE, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list10, (SubLObject)context.NIL, (SubLObject)context.$list25);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym9$INITIALIZE, (SubLObject)context.$sym28$PARSE_TREE_CONTEXT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym29$ADD_TREE, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list15, (SubLObject)context.$list30, (SubLObject)context.$list31);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym29$ADD_TREE, (SubLObject)context.$sym34$PARSE_TREE_CONTEXT_ADD_TREE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym35$GET_TREE, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list15, (SubLObject)context.$list36, (SubLObject)context.$list37);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym35$GET_TREE, (SubLObject)context.$sym40$PARSE_TREE_CONTEXT_GET_TREE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym41$GET_PRECEDING_TREES, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list15, (SubLObject)context.$list42, (SubLObject)context.$list43);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym41$GET_PRECEDING_TREES, (SubLObject)context.$sym45$PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym46$GET_FOLLOWING_TREES, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list15, (SubLObject)context.$list42, (SubLObject)context.$list47);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym46$GET_FOLLOWING_TREES, (SubLObject)context.$sym49$PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym50$GET_INSTANCE, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list15, (SubLObject)context.$list51, (SubLObject)context.$list52);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym50$GET_INSTANCE, (SubLObject)context.$sym57$PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym56$CREATE_INSTANCE, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list10, (SubLObject)context.$list51, (SubLObject)context.$list58);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym56$CREATE_INSTANCE, (SubLObject)context.$sym61$PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)context.$sym62$NEW_VARIABLE, (SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$list10, (SubLObject)context.$list63, (SubLObject)context.$list64);
        methods.subloop_register_instance_method((SubLObject)context.$sym3$PARSE_TREE_CONTEXT, (SubLObject)context.$sym62$NEW_VARIABLE, (SubLObject)context.$sym67$PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD);
        return (SubLObject)context.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_context_file();
    }
    
    @Override
	public void initializeVariables() {
        init_context_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_context_file();
    }
    
    static {
        me = (SubLFile)new context();
        $sym0$CONTEXT = SubLObjectFactory.makeSymbol("CONTEXT");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PARSE-TREE-CONTEXT"), (SubLObject)context.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym3$PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXT-CLASS");
        $sym6$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym7$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym8$SUBLOOP_RESERVED_INITIALIZE_CONTEXT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CONTEXT-INSTANCE");
        $sym9$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return context-p; a new empty context"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym12$OUTER_CATCH_FOR_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXT-METHOD");
        $sym13$CONTEXT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("CONTEXT-INITIALIZE-METHOD");
        $sym14$GET_PARSE_TREE_CONTEXT = SubLObjectFactory.makeSymbol("GET-PARSE-TREE-CONTEXT");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the parse-tree-context of this context"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT")));
        $sym17$OUTER_CATCH_FOR_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-CONTEXT-METHOD");
        $sym18$CONTEXT_GET_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeSymbol("CONTEXT-GET-PARSE-TREE-CONTEXT-METHOD");
        $list19 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNTER"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)context.ZERO_INTEGER), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)context.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("ADD-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("I")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-PRECEDING-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-FOLLOWING-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("GET-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VARIABLE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")) });
        $sym20$INSTANCES = SubLObjectFactory.makeSymbol("INSTANCES");
        $sym21$PARSE_TREES = SubLObjectFactory.makeSymbol("PARSE-TREES");
        $sym22$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-CLASS");
        $sym23$INSTANCE_COUNTER = SubLObjectFactory.makeSymbol("INSTANCE-COUNTER");
        $sym24$SUBLOOP_RESERVED_INITIALIZE_PARSE_TREE_CONTEXT_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARSE-TREE-CONTEXT-INSTANCE");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)context.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym26$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $int27$32 = SubLObjectFactory.makeInteger(32);
        $sym28$PARSE_TREE_CONTEXT_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-INITIALIZE-METHOD");
        $sym29$ADD_TREE = SubLObjectFactory.makeSymbol("ADD-TREE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param PARSE-TREE parse-tree-; the parse tree to be added to this context\n   @return listp; a list of all trees of this context, from most to least recent"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)context.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES")));
        $sym32$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $sym33$PARSE_TREE_P = SubLObjectFactory.makeSymbol("PARSE-TREE-P");
        $sym34$PARSE_TREE_CONTEXT_ADD_TREE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-ADD-TREE-METHOD");
        $sym35$GET_TREE = SubLObjectFactory.makeSymbol("GET-TREE");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("I"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return parse-tree-p; the Ith parse tree preceding (if I is negative) or succeeding\n   (if I is positive) TREE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)context.EQ))), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)context.MINUS_ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("I"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NTH"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"))))));
        $sym38$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $sym39$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym40$PARSE_TREE_CONTEXT_GET_TREE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-GET-TREE-METHOD");
        $sym41$GET_PRECEDING_TREES = SubLObjectFactory.makeSymbol("GET-PRECEDING-TREES");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TREE"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; all trees in this context preceding TREE, from most to least recent"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)context.EQ)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)context.MINUS_ONE_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSEQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("1+"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"))))));
        $sym44$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $sym45$PARSE_TREE_CONTEXT_GET_PRECEDING_TREES_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-GET-PRECEDING-TREES-METHOD");
        $sym46$GET_FOLLOWING_TREES = SubLObjectFactory.makeSymbol("GET-FOLLOWING-TREES");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; all trees in this context following TREE, from least to most recent"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)SubLObjectFactory.makeSymbol("TREE"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)context.EQ)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("POSITION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NREVERSE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSEQ"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-TREES"), (SubLObject)context.ZERO_INTEGER, (SubLObject)SubLObjectFactory.makeSymbol("POSITION")))))));
        $sym48$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $sym49$PARSE_TREE_CONTEXT_GET_FOLLOWING_TREES_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-GET-FOLLOWING-TREES-METHOD");
        $sym50$GET_INSTANCE = SubLObjectFactory.makeSymbol("GET-INSTANCE");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NP"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; the instance denoted by NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)SubLObjectFactory.makeSymbol("CYCLIFIABLE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-INSTANCE")), (SubLObject)SubLObjectFactory.makeSymbol("NP")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))));
        $sym53$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $sym54$CYCLIFIABLE_P = SubLObjectFactory.makeSymbol("CYCLIFIABLE-P");
        $sym55$GET_REFS = SubLObjectFactory.makeSymbol("GET-REFS");
        $sym56$CREATE_INSTANCE = SubLObjectFactory.makeSymbol("CREATE-INSTANCE");
        $sym57$PARSE_TREE_CONTEXT_GET_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-GET-INSTANCE-METHOD");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return listp; a newly created instance"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("NP"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("GET-REFS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VAR-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("REF"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("REF"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCES"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))));
        $sym59$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $const60$InstanceFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceFn"));
        $sym61$PARSE_TREE_CONTEXT_CREATE_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-CREATE-INSTANCE-METHOD");
        $sym62$NEW_VARIABLE = SubLObjectFactory.makeSymbol("NEW-VARIABLE");
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeString("X")));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@return el-variable-p; a new variable unique for this context, containing STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNTER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-EL-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TO-EL-VAR-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CCONCATENATE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WRITE-TO-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-COUNTER")))))));
        $str65$X = SubLObjectFactory.makeString("X");
        $sym66$OUTER_CATCH_FOR_PARSE_TREE_CONTEXT_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-PARSE-TREE-CONTEXT-METHOD");
        $sym67$PARSE_TREE_CONTEXT_NEW_VARIABLE_METHOD = SubLObjectFactory.makeSymbol("PARSE-TREE-CONTEXT-NEW-VARIABLE-METHOD");
    }
}

/*

	Total time: 384 ms
	
*/