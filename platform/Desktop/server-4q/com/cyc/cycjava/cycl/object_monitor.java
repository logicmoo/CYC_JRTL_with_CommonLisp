package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class object_monitor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.object_monitor";
    public static final String myFingerPrint = "be2f481145cdff76f4ce8ebb7c19afc6194b6e10bbe957f5eb3ebf06eac1f412";
    private static final SubLSymbol $sym0$OBJECT_MONITOR;
    private static final SubLSymbol $sym1$OBJECT;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$TAB_STRING;
    private static final SubLSymbol $sym4$NESTING_DEPTH;
    private static final SubLSymbol $sym5$SUBJECTS;
    private static final SubLInteger $int6$4097;
    private static final SubLSymbol $sym7$INSTANCE_COUNT;
    private static final SubLSymbol $sym8$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS;
    private static final SubLSymbol $sym9$ISOLATED_P;
    private static final SubLSymbol $sym10$MONITORING_P;
    private static final SubLSymbol $sym11$INSTANCE_NUMBER;
    private static final SubLSymbol $sym12$STREAM;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE;
    private static final SubLSymbol $sym14$INITIALIZE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLString $str17$____;
    private static final SubLSymbol $sym18$OBJECT_MONITOR_INITIALIZE_METHOD;
    private static final SubLSymbol $sym19$TAB_TO_DEPTH;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLSymbol $sym22$OBJECT_MONITOR_TAB_TO_DEPTH_METHOD;
    private static final SubLSymbol $sym23$MONITOR_SET_SLOT;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLString $str27$__;
    private static final SubLString $str28$_SET_SLOT__S__S__S_;
    private static final SubLSymbol $kw29$UNKNOWN_SLOT;
    private static final SubLSymbol $sym30$OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD;
    private static final SubLSymbol $sym31$MONITOR_BEFORE_METHOD;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLString $str35$Entered____S__S___S;
    private static final SubLString $str36$Entered___S__S;
    private static final SubLString $str37$Arg___S____S;
    private static final SubLSymbol $sym38$OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD;
    private static final SubLSymbol $sym39$MONITOR_AFTER_METHOD;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLString $str42$Returning____S__S___S_____S;
    private static final SubLString $str43$Returning___S__S_____S;
    private static final SubLSymbol $sym44$OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD;
    private static final SubLSymbol $sym45$MONITOR;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLSymbol $sym49$OBJECT_MONITOR_MONITOR_METHOD;
    private static final SubLSymbol $sym50$UNMONITOR;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLSymbol $sym53$OBJECT_MONITOR_UNMONITOR_METHOD;
    private static final SubLSymbol $sym54$MONITOR_INSTANCE;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$OBJECT_MONITOR_MONITOR_INSTANCE_METHOD;
    private static final SubLSymbol $sym57$START_MONITORING;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLSymbol $sym60$OBJECT_MONITOR_START_MONITORING_METHOD;
    private static final SubLSymbol $sym61$STOP_MONITORING;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD;
    private static final SubLSymbol $sym64$OBJECT_MONITOR_STOP_MONITORING_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject get_object_monitor_tab_string(final SubLObject v_object_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_object_monitor, (SubLObject)object_monitor.FOUR_INTEGER, (SubLObject)object_monitor.$sym3$TAB_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject set_object_monitor_tab_string(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object_monitor, value, (SubLObject)object_monitor.FOUR_INTEGER, (SubLObject)object_monitor.$sym3$TAB_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject get_object_monitor_nesting_depth(final SubLObject v_object_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_object_monitor, (SubLObject)object_monitor.THREE_INTEGER, (SubLObject)object_monitor.$sym4$NESTING_DEPTH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject set_object_monitor_nesting_depth(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object_monitor, value, (SubLObject)object_monitor.THREE_INTEGER, (SubLObject)object_monitor.$sym4$NESTING_DEPTH);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject get_object_monitor_stream(final SubLObject v_object_monitor) {
        return classes.subloop_get_instance_slot(v_object_monitor, (SubLObject)object_monitor.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject set_object_monitor_stream(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_object_monitor, value, (SubLObject)object_monitor.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject get_object_monitor_subjects(final SubLObject v_object_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_object_monitor, (SubLObject)object_monitor.ONE_INTEGER, (SubLObject)object_monitor.$sym5$SUBJECTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject set_object_monitor_subjects(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object_monitor, value, (SubLObject)object_monitor.ONE_INTEGER, (SubLObject)object_monitor.$sym5$SUBJECTS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject get_object_monitor_monitoring_p(final SubLObject v_object_monitor) {
        return classes.ldb_test((SubLObject)object_monitor.$int6$4097, subloop_structures.instance_boolean_slots(v_object_monitor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject set_object_monitor_monitoring_p(final SubLObject v_object_monitor, final SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(v_object_monitor, bytes.dpb((SubLObject)((object_monitor.NIL != value) ? object_monitor.ONE_INTEGER : object_monitor.ZERO_INTEGER), (SubLObject)object_monitor.$int6$4097, subloop_structures.instance_boolean_slots(v_object_monitor)));
        return value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject subloop_reserved_initialize_object_monitor_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym1$OBJECT, (SubLObject)object_monitor.$sym7$INSTANCE_COUNT, (SubLObject)object_monitor.ZERO_INTEGER);
        return (SubLObject)object_monitor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject subloop_reserved_initialize_object_monitor_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym1$OBJECT, (SubLObject)object_monitor.$sym9$ISOLATED_P, (SubLObject)object_monitor.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym10$MONITORING_P, (SubLObject)object_monitor.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym1$OBJECT, (SubLObject)object_monitor.$sym11$INSTANCE_NUMBER, (SubLObject)object_monitor.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym5$SUBJECTS, (SubLObject)object_monitor.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym12$STREAM, (SubLObject)object_monitor.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym4$NESTING_DEPTH, (SubLObject)object_monitor.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym3$TAB_STRING, (SubLObject)object_monitor.NIL);
        return (SubLObject)object_monitor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 1581L)
    public static SubLObject object_monitor_p(final SubLObject v_object_monitor) {
        return classes.subloop_instanceof_class(v_object_monitor, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 3675L)
    public static SubLObject object_monitor_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        SubLObject tab_string = get_object_monitor_tab_string(self);
        SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        SubLObject stream = get_object_monitor_stream(self);
        SubLObject subjects = get_object_monitor_subjects(self);
        SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push(object_monitor.$sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                object.object_initialize_method(self);
                monitoring_p = (SubLObject)object_monitor.NIL;
                subjects = (SubLObject)object_monitor.NIL;
                stream = (SubLObject)object_monitor.T;
                nesting_depth = (SubLObject)object_monitor.ZERO_INTEGER;
                tab_string = (SubLObject)object_monitor.$str17$____;
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, self);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_tab_string(self, tab_string);
                    set_object_monitor_nesting_depth(self, nesting_depth);
                    set_object_monitor_stream(self, stream);
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 4116L)
    public static SubLObject object_monitor_tab_to_depth_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        final SubLObject tab_string = get_object_monitor_tab_string(self);
        final SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        final SubLObject stream = get_object_monitor_stream(self);
        try {
            thread.throwStack.push(object_monitor.$sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                SubLObject i;
                for (i = (SubLObject)object_monitor.NIL, i = (SubLObject)object_monitor.ZERO_INTEGER; i.numL(nesting_depth); i = Numbers.add(i, (SubLObject)object_monitor.ONE_INTEGER)) {
                    PrintLow.format(stream, tab_string);
                }
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_tab_string(self, tab_string);
                    set_object_monitor_nesting_depth(self, nesting_depth);
                    set_object_monitor_stream(self, stream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 4246L)
    public static SubLObject object_monitor_monitor_set_slot_method(final SubLObject self, final SubLObject target, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        final SubLObject stream = get_object_monitor_stream(self);
        try {
            thread.throwStack.push(object_monitor.$sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                PrintLow.format(stream, (SubLObject)object_monitor.$str27$__);
                object_monitor_tab_to_depth_method(self);
                PrintLow.format(stream, (SubLObject)object_monitor.$str28$_SET_SLOT__S__S__S_, new SubLObject[] { target, (object_monitor.NIL != slot_listeners.$active_slot_listener$.getDynamicValue(thread) && object_monitor.NIL != subloop_structures.slot_listener_p(slot_listeners.$active_slot_listener$.getDynamicValue(thread))) ? subloop_structures.sl_slot_name(slot_listeners.$active_slot_listener$.getDynamicValue(thread)) : object_monitor.$kw29$UNKNOWN_SLOT, new_value });
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_stream(self, stream);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 4743L)
    public static SubLObject object_monitor_monitor_before_method_method(final SubLObject self, final SubLObject instance_or_class, final SubLObject owning_method_name, SubLObject args) {
        SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        final SubLObject stream = get_object_monitor_stream(self);
        PrintLow.format(stream, (SubLObject)object_monitor.$str27$__);
        object_monitor_tab_to_depth_method(self);
        SubLObject filtered_lambda_list = method_listeners.method_listeners_filtered_lambda_list(instance_or_class, owning_method_name);
        SubLObject current_var = (SubLObject)object_monitor.NIL;
        SubLObject current_arg = (SubLObject)object_monitor.NIL;
        if (object_monitor.NIL != subloop_structures.instance_p(instance_or_class)) {
            final SubLObject class_of_instance = subloop_structures.instance_class(instance_or_class);
            PrintLow.format(stream, (SubLObject)object_monitor.$str35$Entered____S__S___S, new SubLObject[] { owning_method_name, subloop_structures.class_name(class_of_instance), ConsesLow.cons(instance_or_class, args) });
        }
        else if (object_monitor.NIL != subloop_structures.class_p(instance_or_class)) {
            PrintLow.format(stream, (SubLObject)object_monitor.$str35$Entered____S__S___S, new SubLObject[] { owning_method_name, subloop_structures.class_name(instance_or_class), args });
        }
        else {
            PrintLow.format(stream, (SubLObject)object_monitor.$str36$Entered___S__S, owning_method_name, (SubLObject)ConsesLow.cons(owning_method_name, args));
        }
        while (object_monitor.NIL != filtered_lambda_list && object_monitor.NIL != args) {
            PrintLow.format(stream, (SubLObject)object_monitor.$str27$__);
            object_monitor_tab_to_depth_method(self);
            current_var = filtered_lambda_list.first();
            current_arg = args.first();
            PrintLow.format(stream, (SubLObject)object_monitor.$str37$Arg___S____S, current_var, current_arg);
            filtered_lambda_list = filtered_lambda_list.rest();
            args = args.rest();
        }
        nesting_depth = Numbers.add(nesting_depth, (SubLObject)object_monitor.ONE_INTEGER);
        set_object_monitor_nesting_depth(self, nesting_depth);
        return (SubLObject)object_monitor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 5904L)
    public static SubLObject object_monitor_monitor_after_method_method(final SubLObject self, final SubLObject instance_or_class, final SubLObject owning_method_name, final SubLObject args, final SubLObject result) {
        SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        final SubLObject stream = get_object_monitor_stream(self);
        nesting_depth = Numbers.subtract(nesting_depth, (SubLObject)object_monitor.ONE_INTEGER);
        set_object_monitor_nesting_depth(self, nesting_depth);
        PrintLow.format(stream, (SubLObject)object_monitor.$str27$__);
        object_monitor_tab_to_depth_method(self);
        if (object_monitor.NIL != subloop_structures.instance_p(instance_or_class)) {
            final SubLObject class_of_instance = subloop_structures.instance_class(instance_or_class);
            PrintLow.format(stream, (SubLObject)object_monitor.$str42$Returning____S__S___S_____S, new SubLObject[] { owning_method_name, subloop_structures.class_name(class_of_instance), ConsesLow.cons(instance_or_class, args), result });
        }
        else if (object_monitor.NIL != subloop_structures.class_p(instance_or_class)) {
            PrintLow.format(stream, (SubLObject)object_monitor.$str42$Returning____S__S___S_____S, new SubLObject[] { owning_method_name, subloop_structures.class_name(instance_or_class), args, result });
        }
        else {
            PrintLow.format(stream, (SubLObject)object_monitor.$str43$Returning___S__S_____S, new SubLObject[] { owning_method_name, ConsesLow.cons(owning_method_name, args), result });
        }
        return (SubLObject)object_monitor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 6635L)
    public static SubLObject object_monitor_monitor_method(final SubLObject self, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        SubLObject subjects = get_object_monitor_subjects(self);
        final SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push(object_monitor.$sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                if (object_monitor.NIL != subloop_structures.instance_p(target)) {
                    if (object_monitor.NIL == conses_high.member(target, subjects, Symbols.symbol_function((SubLObject)object_monitor.EQL), Symbols.symbol_function((SubLObject)object_monitor.IDENTITY))) {
                        subjects = (SubLObject)ConsesLow.cons(target, subjects);
                    }
                    if (object_monitor.NIL != monitoring_p) {
                        object_monitor_monitor_instance_method(self, target);
                    }
                    Dynamic.sublisp_throw((SubLObject)object_monitor.$sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.T);
                }
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 6903L)
    public static SubLObject object_monitor_unmonitor_method(final SubLObject self, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        SubLObject subjects = get_object_monitor_subjects(self);
        final SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push(object_monitor.$sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                if (object_monitor.NIL != conses_high.member(target, subjects, Symbols.symbol_function((SubLObject)object_monitor.EQ), (SubLObject)object_monitor.UNPROVIDED)) {
                    subjects = Sequences.delete(target, subjects, (SubLObject)object_monitor.UNPROVIDED, (SubLObject)object_monitor.UNPROVIDED, (SubLObject)object_monitor.UNPROVIDED, (SubLObject)object_monitor.UNPROVIDED, (SubLObject)object_monitor.UNPROVIDED);
                    if (object_monitor.NIL != monitoring_p) {
                        object.object_remove_all_set_slot_listeners_method(self, target, (SubLObject)object_monitor.UNPROVIDED);
                    }
                    Dynamic.sublisp_throw((SubLObject)object_monitor.$sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.T);
                }
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.NIL);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 7352L)
    public static SubLObject object_monitor_monitor_instance_method(final SubLObject self, final SubLObject target) {
        SubLObject v_slots = (SubLObject)object_monitor.NIL;
        SubLObject method_names = (SubLObject)object_monitor.NIL;
        SubLObject cdolist_list_var;
        v_slots = (cdolist_list_var = instances.instances_all_any_instance_slots(target));
        SubLObject slot = (SubLObject)object_monitor.NIL;
        slot = cdolist_list_var.first();
        while (object_monitor.NIL != cdolist_list_var) {
            object.object_add_set_slot_listener_method(self, target, slot, (SubLObject)object_monitor.$sym23$MONITOR_SET_SLOT);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        }
        method_names = (cdolist_list_var = methods.methods_get_all_method_names(target));
        SubLObject method_name = (SubLObject)object_monitor.NIL;
        method_name = cdolist_list_var.first();
        while (object_monitor.NIL != cdolist_list_var) {
            object.object_add_class_wide_before_method_listener_method(self, target, method_name, (SubLObject)object_monitor.$sym31$MONITOR_BEFORE_METHOD);
            object.object_add_class_wide_after_method_listener_method(self, target, method_name, (SubLObject)object_monitor.$sym39$MONITOR_AFTER_METHOD);
            cdolist_list_var = cdolist_list_var.rest();
            method_name = cdolist_list_var.first();
        }
        return (SubLObject)object_monitor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 7900L)
    public static SubLObject object_monitor_start_monitoring_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        final SubLObject subjects = get_object_monitor_subjects(self);
        SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push(object_monitor.$sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                SubLObject cdolist_list_var = subjects;
                SubLObject target = (SubLObject)object_monitor.NIL;
                target = cdolist_list_var.first();
                while (object_monitor.NIL != cdolist_list_var) {
                    object_monitor_monitor_instance_method(self, target);
                    cdolist_list_var = cdolist_list_var.rest();
                    target = cdolist_list_var.first();
                }
                monitoring_p = (SubLObject)object_monitor.T;
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/object-monitor.lisp", position = 8265L)
    public static SubLObject object_monitor_stop_monitoring_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = (SubLObject)object_monitor.NIL;
        final SubLObject subjects = get_object_monitor_subjects(self);
        SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push(object_monitor.$sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                if (object_monitor.NIL != monitoring_p) {
                    SubLObject cdolist_list_var = subjects;
                    SubLObject target = (SubLObject)object_monitor.NIL;
                    target = cdolist_list_var.first();
                    while (object_monitor.NIL != cdolist_list_var) {
                        object.object_remove_all_set_slot_listeners_method(self, target, (SubLObject)object_monitor.UNPROVIDED);
                        object.object_remove_all_class_wide_method_listeners_method(self, target, (SubLObject)object_monitor.UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        target = cdolist_list_var.first();
                    }
                    monitoring_p = (SubLObject)object_monitor.NIL;
                }
                Dynamic.sublisp_throw((SubLObject)object_monitor.$sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, (SubLObject)object_monitor.T);
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)object_monitor.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, (SubLObject)object_monitor.$sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        }
        finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }
    
    public static SubLObject declare_object_monitor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "get_object_monitor_tab_string", "GET-OBJECT-MONITOR-TAB-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "set_object_monitor_tab_string", "SET-OBJECT-MONITOR-TAB-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "get_object_monitor_nesting_depth", "GET-OBJECT-MONITOR-NESTING-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "set_object_monitor_nesting_depth", "SET-OBJECT-MONITOR-NESTING-DEPTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "get_object_monitor_stream", "GET-OBJECT-MONITOR-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "set_object_monitor_stream", "SET-OBJECT-MONITOR-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "get_object_monitor_subjects", "GET-OBJECT-MONITOR-SUBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "set_object_monitor_subjects", "SET-OBJECT-MONITOR-SUBJECTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "get_object_monitor_monitoring_p", "GET-OBJECT-MONITOR-MONITORING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "set_object_monitor_monitoring_p", "SET-OBJECT-MONITOR-MONITORING-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "subloop_reserved_initialize_object_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "subloop_reserved_initialize_object_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_p", "OBJECT-MONITOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_initialize_method", "OBJECT-MONITOR-INITIALIZE-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_tab_to_depth_method", "OBJECT-MONITOR-TAB-TO-DEPTH-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_monitor_set_slot_method", "OBJECT-MONITOR-MONITOR-SET-SLOT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_monitor_before_method_method", "OBJECT-MONITOR-MONITOR-BEFORE-METHOD-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_monitor_after_method_method", "OBJECT-MONITOR-MONITOR-AFTER-METHOD-METHOD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_monitor_method", "OBJECT-MONITOR-MONITOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_unmonitor_method", "OBJECT-MONITOR-UNMONITOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_monitor_instance_method", "OBJECT-MONITOR-MONITOR-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_start_monitoring_method", "OBJECT-MONITOR-START-MONITORING-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.object_monitor", "object_monitor_stop_monitoring_method", "OBJECT-MONITOR-STOP-MONITORING-METHOD", 1, 0, false);
        return (SubLObject)object_monitor.NIL;
    }
    
    public static SubLObject init_object_monitor_file() {
        return (SubLObject)object_monitor.NIL;
    }
    
    public static SubLObject setup_object_monitor_file() {
        classes.subloop_new_class((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym1$OBJECT, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym8$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym13$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE);
        subloop_reserved_initialize_object_monitor_class((SubLObject)object_monitor.$sym0$OBJECT_MONITOR);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym14$INITIALIZE, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list15);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym14$INITIALIZE, (SubLObject)object_monitor.$sym18$OBJECT_MONITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym19$TAB_TO_DEPTH, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list20);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym19$TAB_TO_DEPTH, (SubLObject)object_monitor.$sym22$OBJECT_MONITOR_TAB_TO_DEPTH_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym23$MONITOR_SET_SLOT, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list24, (SubLObject)object_monitor.$list25);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym23$MONITOR_SET_SLOT, (SubLObject)object_monitor.$sym30$OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym31$MONITOR_BEFORE_METHOD, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$list32, (SubLObject)object_monitor.$list33, (SubLObject)object_monitor.$list34);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym31$MONITOR_BEFORE_METHOD, (SubLObject)object_monitor.$sym38$OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym39$MONITOR_AFTER_METHOD, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$list32, (SubLObject)object_monitor.$list40, (SubLObject)object_monitor.$list41);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym39$MONITOR_AFTER_METHOD, (SubLObject)object_monitor.$sym44$OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym45$MONITOR, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list46, (SubLObject)object_monitor.$list47);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym45$MONITOR, (SubLObject)object_monitor.$sym49$OBJECT_MONITOR_MONITOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym50$UNMONITOR, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list46, (SubLObject)object_monitor.$list51);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym50$UNMONITOR, (SubLObject)object_monitor.$sym53$OBJECT_MONITOR_UNMONITOR_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym54$MONITOR_INSTANCE, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list46, (SubLObject)object_monitor.$list55);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym54$MONITOR_INSTANCE, (SubLObject)object_monitor.$sym56$OBJECT_MONITOR_MONITOR_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym57$START_MONITORING, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list58);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym57$START_MONITORING, (SubLObject)object_monitor.$sym60$OBJECT_MONITOR_START_MONITORING_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)object_monitor.$sym61$STOP_MONITORING, (SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.NIL, (SubLObject)object_monitor.$list62);
        methods.subloop_register_instance_method((SubLObject)object_monitor.$sym0$OBJECT_MONITOR, (SubLObject)object_monitor.$sym61$STOP_MONITORING, (SubLObject)object_monitor.$sym64$OBJECT_MONITOR_STOP_MONITORING_METHOD);
        return (SubLObject)object_monitor.NIL;
    }
    
    public void declareFunctions() {
        declare_object_monitor_file();
    }
    
    public void initializeVariables() {
        init_object_monitor_file();
    }
    
    public void runTopLevelForms() {
        setup_object_monitor_file();
    }
    
    static {
        me = (SubLFile)new object_monitor();
        $sym0$OBJECT_MONITOR = SubLObjectFactory.makeSymbol("OBJECT-MONITOR");
        $sym1$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list2 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NESTING-DEPTH"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB-STRING"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)object_monitor.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TAB-TO-DEPTH"), (SubLObject)object_monitor.NIL, (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-SET-SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-BEFORE-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-AFTER-METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("UNMONITOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("START-MONITORING"), (SubLObject)object_monitor.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("STOP-MONITORING"), (SubLObject)object_monitor.NIL) });
        $sym3$TAB_STRING = SubLObjectFactory.makeSymbol("TAB-STRING");
        $sym4$NESTING_DEPTH = SubLObjectFactory.makeSymbol("NESTING-DEPTH");
        $sym5$SUBJECTS = SubLObjectFactory.makeSymbol("SUBJECTS");
        $int6$4097 = SubLObjectFactory.makeInteger(4097);
        $sym7$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym8$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-CLASS");
        $sym9$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym10$MONITORING_P = SubLObjectFactory.makeSymbol("MONITORING-P");
        $sym11$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym12$STREAM = SubLObjectFactory.makeSymbol("STREAM");
        $sym13$SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-INSTANCE");
        $sym14$INITIALIZE = SubLObjectFactory.makeSymbol("INITIALIZE");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)object_monitor.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS"), (SubLObject)object_monitor.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)object_monitor.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("NESTING-DEPTH"), (SubLObject)object_monitor.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TAB-STRING"), (SubLObject)SubLObjectFactory.makeString("   |")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")));
        $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $str17$____ = SubLObjectFactory.makeString("   |");
        $sym18$OBJECT_MONITOR_INITIALIZE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-INITIALIZE-METHOD");
        $sym19$TAB_TO_DEPTH = SubLObjectFactory.makeSymbol("TAB-TO-DEPTH");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("I"), (SubLObject)SubLObjectFactory.makeSymbol("NESTING-DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeSymbol("TAB-STRING"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $sym22$OBJECT_MONITOR_TAB_TO_DEPTH_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-TAB-TO-DEPTH-METHOD");
        $sym23$MONITOR_SET_SLOT = SubLObjectFactory.makeSymbol("MONITOR-SET-SLOT");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB-TO-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("(SET-SLOT ~S ~S ~S)"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("*ACTIVE-SLOT-LISTENER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENER-P"), (SubLObject)SubLObjectFactory.makeSymbol("*ACTIVE-SLOT-LISTENER*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SL-SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("*ACTIVE-SLOT-LISTENER*")), (SubLObject)SubLObjectFactory.makeKeyword("UNKNOWN-SLOT")), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $str27$__ = SubLObjectFactory.makeString("~%");
        $str28$_SET_SLOT__S__S__S_ = SubLObjectFactory.makeString("(SET-SLOT ~S ~S ~S)");
        $kw29$UNKNOWN_SLOT = SubLObjectFactory.makeKeyword("UNKNOWN-SLOT");
        $sym30$OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-MONITOR-SET-SLOT-METHOD");
        $sym31$MONITOR_BEFORE_METHOD = SubLObjectFactory.makeSymbol("MONITOR-BEFORE-METHOD");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("AUTO-UPDATE"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB-TO-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERED-LAMBDA-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENERS-FILTERED-LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-VAR"), (SubLObject)object_monitor.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ARG"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Entered: (~S ~S) ~S"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Entered: (~S ~S) ~S"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))), (SubLObject)ConsesLow.list((SubLObject)object_monitor.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Entered: ~S ~S"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED-LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB-TO-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-VAR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED-LAMBDA-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ARG"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Arg: ~S = ~S"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-ARG")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED-LAMBDA-LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("FILTERED-LAMBDA-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("NESTING-DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $str35$Entered____S__S___S = SubLObjectFactory.makeString("Entered: (~S ~S) ~S");
        $str36$Entered___S__S = SubLObjectFactory.makeString("Entered: ~S ~S");
        $str37$Arg___S____S = SubLObjectFactory.makeString("Arg: ~S = ~S");
        $sym38$OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-MONITOR-BEFORE-METHOD-METHOD");
        $sym39$MONITOR_AFTER_METHOD = SubLObjectFactory.makeSymbol("MONITOR-AFTER-METHOD");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("NESTING-DEPTH")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("~%")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAB-TO-DEPTH"), (SubLObject)SubLObjectFactory.makeSymbol("SELF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Returning: (~S ~S) ~S -> ~S"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OF-INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Returning: (~S ~S) ~S -> ~S"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-OR-CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"))), (SubLObject)ConsesLow.list((SubLObject)object_monitor.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT"), (SubLObject)SubLObjectFactory.makeSymbol("STREAM"), (SubLObject)SubLObjectFactory.makeString("Returning: ~S ~S -> ~S"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONS"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS")), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $str42$Returning____S__S___S_____S = SubLObjectFactory.makeString("Returning: (~S ~S) ~S -> ~S");
        $str43$Returning___S__S_____S = SubLObjectFactory.makeString("Returning: ~S ~S -> ~S");
        $sym44$OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-MONITOR-AFTER-METHOD-METHOD");
        $sym45$MONITOR = SubLObjectFactory.makeSymbol("MONITOR");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"));
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONITOR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $sym49$OBJECT_MONITOR_MONITOR_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-MONITOR-METHOD");
        $sym50$UNMONITOR = SubLObjectFactory.makeSymbol("UNMONITOR");
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)object_monitor.EQ)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELETE"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.T)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $sym53$OBJECT_MONITOR_UNMONITOR_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-UNMONITOR-METHOD");
        $sym54$MONITOR_INSTANCE = SubLObjectFactory.makeSymbol("MONITOR-INSTANCE");
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAMES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES-ALL-ANY-INSTANCE-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-SET-SLOT-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-SET-SLOT")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAMES"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHODS-GET-ALL-METHOD-NAMES"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAMES")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-BEFORE-METHOD"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("MONITOR-AFTER-METHOD"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.NIL));
        $sym56$OBJECT_MONITOR_MONITOR_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-MONITOR-INSTANCE-METHOD");
        $sym57$START_MONITORING = SubLObjectFactory.makeSymbol("START-MONITORING");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MONITOR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)object_monitor.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.T));
        $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $sym60$OBJECT_MONITOR_START_MONITORING_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-START-MONITORING-METHOD");
        $sym61$STOP_MONITORING = SubLObjectFactory.makeSymbol("STOP-MONITORING");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SUBJECTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS"), (SubLObject)SubLObjectFactory.makeSymbol("SELF"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("MONITORING-P"), (SubLObject)object_monitor.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)object_monitor.T));
        $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = SubLObjectFactory.makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");
        $sym64$OBJECT_MONITOR_STOP_MONITORING_METHOD = SubLObjectFactory.makeSymbol("OBJECT-MONITOR-STOP-MONITORING-METHOD");
    }
}

/*

	Total time: 324 ms
	
*/