package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class timing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.timing";
    public static final String myFingerPrint = "0b8c8b97a5ccad1d408f339d214b4e9834caafd5d4d13b622c041742a43cfb57";
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 1700L)
    private static SubLSymbol $time_testing_environment$;
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 1837L)
    private static SubLSymbol $timing_table$;
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 1976L)
    private static SubLSymbol $utilize_timing_hooks$;
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 2065L)
    private static SubLSymbol $all_currently_active$;
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 2224L)
    private static SubLSymbol $timed_funs$;
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLSymbol $dtp_timing_info$;
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_TIMED_FUNS_;
    private static final SubLString $str8$Timing_info_cleared;
    private static final SubLString $str9$Time_testing_environment_cleared;
    private static final SubLSymbol $sym10$TIMING_INFO;
    private static final SubLSymbol $sym11$TIMING_INFO_P;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$PRINT_TIMING_INFO;
    private static final SubLSymbol $sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$TIMING_INFO_COUNT;
    private static final SubLSymbol $sym20$_CSETF_TIMING_INFO_COUNT;
    private static final SubLSymbol $sym21$TIMING_INFO_TOTAL;
    private static final SubLSymbol $sym22$_CSETF_TIMING_INFO_TOTAL;
    private static final SubLSymbol $sym23$TIMING_INFO_MAX;
    private static final SubLSymbol $sym24$_CSETF_TIMING_INFO_MAX;
    private static final SubLSymbol $kw25$COUNT;
    private static final SubLSymbol $kw26$TOTAL;
    private static final SubLSymbol $kw27$MAX;
    private static final SubLString $str28$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw29$BEGIN;
    private static final SubLSymbol $sym30$MAKE_TIMING_INFO;
    private static final SubLSymbol $kw31$SLOT;
    private static final SubLSymbol $kw32$END;
    private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD;
    private static final SubLString $str34$____TIMING_INFO__Count__S_Total__;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$LOCAL_TIMER;
    private static final SubLSymbol $sym37$RESULT;
    private static final SubLString $str38$_IN_TIMER;
    private static final SubLSymbol $sym39$PROGN;
    private static final SubLSymbol $sym40$PIF;
    private static final SubLSymbol $sym41$TIME_FUNCTION_;
    private static final SubLSymbol $sym42$QUOTE;
    private static final SubLSymbol $sym43$CTIME;
    private static final SubLSymbol $sym44$CSETQ;
    private static final SubLSymbol $sym45$MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym46$RECORD_TIME;
    private static final SubLSymbol $sym47$RET;
    private static final SubLSymbol $sym48$VALUES_LIST;
    private static final SubLSymbol $sym49$DEFINE_PRIVATE;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$DEFTIMED_GENERIC;
    private static final SubLSymbol $sym52$DEFINE_PROTECTED;
    private static final SubLSymbol $sym53$DEFINE;
    private static final SubLSymbol $sym54$DEFINE_PUBLIC;
    private static final SubLSymbol $sym55$DEFINE_API;
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 2322L)
    public static SubLObject with_new_testing_environement(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)timing.$sym0$CLET, reader.bq_cons((SubLObject)timing.$list1, ConsesLow.append(body, (SubLObject)timing.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 2854L)
    public static SubLObject timing_no_functions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym0$CLET, (SubLObject)timing.$list2, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 3030L)
    public static SubLObject timing_all_functions(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym0$CLET, (SubLObject)timing.$list3, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 3203L)
    public static SubLObject timing_these_functions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject functions = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list4);
        functions = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)timing.$list5, (SubLObject)timing.$list6, (SubLObject)ConsesLow.list((SubLObject)timing.$sym7$_TIMED_FUNS_, functions)), ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 3430L)
    public static SubLObject report_fun(final SubLObject fun) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject timing_info = Hashtables.gethash(fun, timing.$timing_table$.getDynamicValue(thread), (SubLObject)timing.UNPROVIDED);
        return (SubLObject)ConsesLow.cons(fun, report_time(timing_info));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 3750L)
    public static SubLObject report_time(final SubLObject timing_info) {
        final SubLObject count = timing_info_count(timing_info);
        final SubLObject total = timing_info_total(timing_info);
        final SubLObject max = timing_info_max(timing_info);
        final SubLObject mean = Numbers.divide(total, count);
        return (SubLObject)ConsesLow.list(mean, max);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 4217L)
    public static SubLObject report_timing_info(SubLObject key) {
        if (key == timing.UNPROVIDED) {
            key = (SubLObject)timing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accumulator = (SubLObject)timing.NIL;
        final SubLObject cdohash_table = timing.$timing_table$.getDynamicValue(thread);
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject info = (SubLObject)timing.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                fun = Hashtables.getEntryKey(cdohash_entry);
                info = Hashtables.getEntryValue(cdohash_entry);
                accumulator = (SubLObject)ConsesLow.cons(report_fun(fun), accumulator);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        if (timing.NIL != key) {
            Hashtables.sethash(key, timing.$time_testing_environment$.getDynamicValue(thread), accumulator);
            clear_timing_info();
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 4707L)
    public static SubLObject report_time_testing_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accumulator = (SubLObject)timing.NIL;
        final SubLObject cdohash_table = timing.$time_testing_environment$.getDynamicValue(thread);
        SubLObject test_run = (SubLObject)timing.NIL;
        SubLObject info = (SubLObject)timing.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                test_run = Hashtables.getEntryKey(cdohash_entry);
                info = Hashtables.getEntryValue(cdohash_entry);
                accumulator = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(test_run, (SubLObject)ConsesLow.list(info)), accumulator);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5042L)
    public static SubLObject clear_timing_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.clrhash(timing.$timing_table$.getDynamicValue(thread));
        return (SubLObject)timing.$str8$Timing_info_cleared;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5287L)
    public static SubLObject clear_time_testing_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Hashtables.clrhash(timing.$time_testing_environment$.getDynamicValue(thread));
        return (SubLObject)timing.$str9$Time_testing_environment_cleared;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject timing_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_timing_info(v_object, stream, (SubLObject)timing.ZERO_INTEGER);
        return (SubLObject)timing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject timing_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $timing_info_native.class) ? timing.T : timing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject timing_info_count(final SubLObject v_object) {
        assert timing.NIL != timing_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject timing_info_total(final SubLObject v_object) {
        assert timing.NIL != timing_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject timing_info_max(final SubLObject v_object) {
        assert timing.NIL != timing_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject _csetf_timing_info_count(final SubLObject v_object, final SubLObject value) {
        assert timing.NIL != timing_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject _csetf_timing_info_total(final SubLObject v_object, final SubLObject value) {
        assert timing.NIL != timing_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject _csetf_timing_info_max(final SubLObject v_object, final SubLObject value) {
        assert timing.NIL != timing_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject make_timing_info(SubLObject arglist) {
        if (arglist == timing.UNPROVIDED) {
            arglist = (SubLObject)timing.NIL;
        }
        final SubLObject v_new = (SubLObject)new $timing_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)timing.NIL, next = arglist; timing.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)timing.$kw25$COUNT)) {
                _csetf_timing_info_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)timing.$kw26$TOTAL)) {
                _csetf_timing_info_total(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)timing.$kw27$MAX)) {
                _csetf_timing_info_max(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)timing.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject visit_defstruct_timing_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)timing.$kw29$BEGIN, (SubLObject)timing.$sym30$MAKE_TIMING_INFO, (SubLObject)timing.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)timing.$kw31$SLOT, (SubLObject)timing.$kw25$COUNT, timing_info_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)timing.$kw31$SLOT, (SubLObject)timing.$kw26$TOTAL, timing_info_total(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)timing.$kw31$SLOT, (SubLObject)timing.$kw27$MAX, timing_info_max(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)timing.$kw32$END, (SubLObject)timing.$sym30$MAKE_TIMING_INFO, (SubLObject)timing.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5452L)
    public static SubLObject visit_defstruct_object_timing_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_timing_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 5744L)
    public static SubLObject print_timing_info(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)timing.$str34$____TIMING_INFO__Count__S_Total__, new SubLObject[] { timing_info_count(v_object), timing_info_total(v_object), timing_info_max(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 6144L)
    public static SubLObject time_functionP(final SubLObject function_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(timing.NIL != timing.$utilize_timing_hooks$.getDynamicValue(thread) && (timing.NIL != timing.$all_currently_active$.getDynamicValue(thread) || timing.NIL != subl_promotions.memberP(function_name, timing.$timed_funs$.getDynamicValue(thread), (SubLObject)timing.UNPROVIDED, (SubLObject)timing.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 6426L)
    public static SubLObject record_time(final SubLObject function_name, final SubLObject time) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject timing_info = Hashtables.gethash(function_name, timing.$timing_table$.getDynamicValue(thread), (SubLObject)timing.UNPROVIDED);
        if (timing.NIL != timing_info) {
            update_timing_info(timing_info, time);
        }
        else {
            Hashtables.sethash(function_name, timing.$timing_table$.getDynamicValue(thread), new_timing_info(time));
        }
        return timing_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 6792L)
    public static SubLObject new_timing_info(final SubLObject time) {
        final SubLObject timing_info = make_timing_info((SubLObject)timing.UNPROVIDED);
        _csetf_timing_info_count(timing_info, (SubLObject)timing.ONE_INTEGER);
        _csetf_timing_info_total(timing_info, time);
        _csetf_timing_info_max(timing_info, time);
        return timing_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 7135L)
    public static SubLObject update_timing_info(final SubLObject timing_info, final SubLObject time) {
        _csetf_timing_info_count(timing_info, Numbers.add(timing_info_count(timing_info), (SubLObject)timing.ONE_INTEGER));
        _csetf_timing_info_total(timing_info, Numbers.add(timing_info_total(timing_info), time));
        if (time.numG(timing_info_max(timing_info))) {
            _csetf_timing_info_max(timing_info, time);
        }
        return timing_info;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 7486L)
    public static SubLObject deftimed_generic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject defining_form = (SubLObject)timing.NIL;
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject args = (SubLObject)timing.NIL;
        SubLObject stuff = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list35);
        defining_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list35);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list35);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list35);
        stuff = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject local_timer = (SubLObject)timing.$sym36$LOCAL_TIMER;
        final SubLObject result = (SubLObject)timing.$sym37$RESULT;
        final SubLObject f2 = Packages.intern(Sequences.cconcatenate(Symbols.symbol_name(fun), (SubLObject)timing.$str38$_IN_TIMER), (SubLObject)timing.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)timing.$sym39$PROGN, (SubLObject)ConsesLow.listS(defining_form, fun, args, ConsesLow.append(stuff, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)timing.$sym40$PIF, (SubLObject)ConsesLow.list((SubLObject)timing.$sym41$TIME_FUNCTION_, (SubLObject)ConsesLow.list((SubLObject)timing.$sym42$QUOTE, fun)), (SubLObject)ConsesLow.list((SubLObject)timing.$sym0$CLET, (SubLObject)ConsesLow.list(local_timer, result), (SubLObject)ConsesLow.list((SubLObject)timing.$sym43$CTIME, local_timer, (SubLObject)ConsesLow.list((SubLObject)timing.$sym44$CSETQ, result, (SubLObject)ConsesLow.list((SubLObject)timing.$sym45$MULTIPLE_VALUE_LIST, reader.bq_cons(f2, ConsesLow.append(utilities_macros.argnames_from_arglist(args), (SubLObject)timing.NIL))))), (SubLObject)ConsesLow.list((SubLObject)timing.$sym46$RECORD_TIME, (SubLObject)ConsesLow.list((SubLObject)timing.$sym42$QUOTE, fun), local_timer), (SubLObject)ConsesLow.list((SubLObject)timing.$sym47$RET, (SubLObject)ConsesLow.list((SubLObject)timing.$sym48$VALUES_LIST, result))), (SubLObject)ConsesLow.list((SubLObject)timing.$sym47$RET, reader.bq_cons(f2, ConsesLow.append(utilities_macros.argnames_from_arglist(args), (SubLObject)timing.NIL))))))), (SubLObject)ConsesLow.listS((SubLObject)timing.$sym49$DEFINE_PRIVATE, f2, args, ConsesLow.append(body, (SubLObject)timing.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 8272L)
    public static SubLObject deftimed_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject args = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = (stuff = current.first());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym51$DEFTIMED_GENERIC, (SubLObject)timing.$sym49$DEFINE_PRIVATE, fun, args, stuff, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 8488L)
    public static SubLObject deftimed_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject args = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = (stuff = current.first());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym51$DEFTIMED_GENERIC, (SubLObject)timing.$sym52$DEFINE_PROTECTED, fun, args, stuff, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 8625L)
    public static SubLObject deftimed(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject args = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = (stuff = current.first());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym51$DEFTIMED_GENERIC, (SubLObject)timing.$sym53$DEFINE, fun, args, stuff, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 8742L)
    public static SubLObject deftimed_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject args = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = (stuff = current.first());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym51$DEFTIMED_GENERIC, (SubLObject)timing.$sym54$DEFINE_PUBLIC, fun, args, stuff, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/timing.lisp", position = 8873L)
    public static SubLObject deftimed_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fun = (SubLObject)timing.NIL;
        SubLObject args = (SubLObject)timing.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        fun = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        args = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)timing.$list50);
        final SubLObject temp = current.rest();
        final SubLObject stuff;
        current = (stuff = current.first());
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)timing.$sym51$DEFTIMED_GENERIC, (SubLObject)timing.$sym55$DEFINE_API, fun, args, stuff, ConsesLow.append(body, (SubLObject)timing.NIL));
    }
    
    public static SubLObject declare_timing_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "with_new_testing_environement", "WITH-NEW-TESTING-ENVIRONEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "timing_no_functions", "TIMING-NO-FUNCTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "timing_all_functions", "TIMING-ALL-FUNCTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "timing_these_functions", "TIMING-THESE-FUNCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "report_fun", "REPORT-FUN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "report_time", "REPORT-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "report_timing_info", "REPORT-TIMING-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "report_time_testing_info", "REPORT-TIME-TESTING-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "clear_timing_info", "CLEAR-TIMING-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "clear_time_testing_info", "CLEAR-TIME-TESTING-INFO", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "timing_info_print_function_trampoline", "TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "timing_info_p", "TIMING-INFO-P", 1, 0, false);
        new $timing_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "timing_info_count", "TIMING-INFO-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "timing_info_total", "TIMING-INFO-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "timing_info_max", "TIMING-INFO-MAX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "_csetf_timing_info_count", "_CSETF-TIMING-INFO-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "_csetf_timing_info_total", "_CSETF-TIMING-INFO-TOTAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "_csetf_timing_info_max", "_CSETF-TIMING-INFO-MAX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "make_timing_info", "MAKE-TIMING-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "visit_defstruct_timing_info", "VISIT-DEFSTRUCT-TIMING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "visit_defstruct_object_timing_info_method", "VISIT-DEFSTRUCT-OBJECT-TIMING-INFO-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "print_timing_info", "PRINT-TIMING-INFO", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "time_functionP", "TIME-FUNCTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "record_time", "RECORD-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "new_timing_info", "NEW-TIMING-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.timing", "update_timing_info", "UPDATE-TIMING-INFO", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "deftimed_generic", "DEFTIMED-GENERIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "deftimed_private", "DEFTIMED-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "deftimed_protected", "DEFTIMED-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "deftimed", "DEFTIMED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "deftimed_public", "DEFTIMED-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.timing", "deftimed_api", "DEFTIMED-API");
        return (SubLObject)timing.NIL;
    }
    
    public static SubLObject init_timing_file() {
        timing.$time_testing_environment$ = SubLFiles.defparameter("*TIME-TESTING-ENVIRONMENT*", Hashtables.make_hash_table((SubLObject)timing.TEN_INTEGER, (SubLObject)timing.UNPROVIDED, (SubLObject)timing.UNPROVIDED));
        timing.$timing_table$ = SubLFiles.defparameter("*TIMING-TABLE*", Hashtables.make_hash_table((SubLObject)timing.TEN_INTEGER, (SubLObject)timing.UNPROVIDED, (SubLObject)timing.UNPROVIDED));
        timing.$utilize_timing_hooks$ = SubLFiles.defparameter("*UTILIZE-TIMING-HOOKS*", (SubLObject)timing.T);
        timing.$all_currently_active$ = SubLFiles.defparameter("*ALL-CURRENTLY-ACTIVE*", (SubLObject)timing.NIL);
        timing.$timed_funs$ = SubLFiles.defparameter("*TIMED-FUNS*", (SubLObject)timing.NIL);
        timing.$dtp_timing_info$ = SubLFiles.defconstant("*DTP-TIMING-INFO*", (SubLObject)timing.$sym10$TIMING_INFO);
        return (SubLObject)timing.NIL;
    }
    
    public static SubLObject setup_timing_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), timing.$dtp_timing_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)timing.$sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)timing.$list18);
        Structures.def_csetf((SubLObject)timing.$sym19$TIMING_INFO_COUNT, (SubLObject)timing.$sym20$_CSETF_TIMING_INFO_COUNT);
        Structures.def_csetf((SubLObject)timing.$sym21$TIMING_INFO_TOTAL, (SubLObject)timing.$sym22$_CSETF_TIMING_INFO_TOTAL);
        Structures.def_csetf((SubLObject)timing.$sym23$TIMING_INFO_MAX, (SubLObject)timing.$sym24$_CSETF_TIMING_INFO_MAX);
        Equality.identity((SubLObject)timing.$sym10$TIMING_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), timing.$dtp_timing_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)timing.$sym33$VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD));
        return (SubLObject)timing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_timing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_timing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_timing_file();
    }
    
    static {
        me = (SubLFile)new timing();
        timing.$time_testing_environment$ = null;
        timing.$timing_table$ = null;
        timing.$utilize_timing_hooks$ = null;
        timing.$all_currently_active$ = null;
        timing.$timed_funs$ = null;
        timing.$dtp_timing_info$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TIMING-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)timing.TEN_INTEGER));
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UTILIZE-TIMING-HOOKS*"), (SubLObject)timing.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALL-CURRENTLY-ACTIVE*"), (SubLObject)timing.NIL));
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UTILIZE-TIMING-HOOKS*"), (SubLObject)timing.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALL-CURRENTLY-ACTIVE*"), (SubLObject)timing.T));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*UTILIZE-TIMING-HOOKS*"), (SubLObject)timing.T);
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ALL-CURRENTLY-ACTIVE*"), (SubLObject)timing.NIL);
        $sym7$_TIMED_FUNS_ = SubLObjectFactory.makeSymbol("*TIMED-FUNS*");
        $str8$Timing_info_cleared = SubLObjectFactory.makeString("Timing info cleared");
        $str9$Time_testing_environment_cleared = SubLObjectFactory.makeString("Time testing environment cleared");
        $sym10$TIMING_INFO = SubLObjectFactory.makeSymbol("TIMING-INFO");
        $sym11$TIMING_INFO_P = SubLObjectFactory.makeSymbol("TIMING-INFO-P");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("MAX"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("TOTAL"), (SubLObject)SubLObjectFactory.makeKeyword("MAX"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TIMING-INFO-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING-INFO-TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING-INFO-MAX"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TIMING-INFO-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TIMING-INFO-TOTAL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TIMING-INFO-MAX"));
        $sym16$PRINT_TIMING_INFO = SubLObjectFactory.makeSymbol("PRINT-TIMING-INFO");
        $sym17$TIMING_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TIMING-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TIMING-INFO-P"));
        $sym19$TIMING_INFO_COUNT = SubLObjectFactory.makeSymbol("TIMING-INFO-COUNT");
        $sym20$_CSETF_TIMING_INFO_COUNT = SubLObjectFactory.makeSymbol("_CSETF-TIMING-INFO-COUNT");
        $sym21$TIMING_INFO_TOTAL = SubLObjectFactory.makeSymbol("TIMING-INFO-TOTAL");
        $sym22$_CSETF_TIMING_INFO_TOTAL = SubLObjectFactory.makeSymbol("_CSETF-TIMING-INFO-TOTAL");
        $sym23$TIMING_INFO_MAX = SubLObjectFactory.makeSymbol("TIMING-INFO-MAX");
        $sym24$_CSETF_TIMING_INFO_MAX = SubLObjectFactory.makeSymbol("_CSETF-TIMING-INFO-MAX");
        $kw25$COUNT = SubLObjectFactory.makeKeyword("COUNT");
        $kw26$TOTAL = SubLObjectFactory.makeKeyword("TOTAL");
        $kw27$MAX = SubLObjectFactory.makeKeyword("MAX");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_TIMING_INFO = SubLObjectFactory.makeSymbol("MAKE-TIMING-INFO");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_TIMING_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TIMING-INFO-METHOD");
        $str34$____TIMING_INFO__Count__S_Total__ = SubLObjectFactory.makeString("~&#<TIMING-INFO: Count=~S Total=~S Max=~S>~%");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINING-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FUN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("STUFF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$LOCAL_TIMER = SubLObjectFactory.makeUninternedSymbol("LOCAL-TIMER");
        $sym37$RESULT = SubLObjectFactory.makeUninternedSymbol("RESULT");
        $str38$_IN_TIMER = SubLObjectFactory.makeString("-IN-TIMER");
        $sym39$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym40$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym41$TIME_FUNCTION_ = SubLObjectFactory.makeSymbol("TIME-FUNCTION?");
        $sym42$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym43$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym44$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym45$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $sym46$RECORD_TIME = SubLObjectFactory.makeSymbol("RECORD-TIME");
        $sym47$RET = SubLObjectFactory.makeSymbol("RET");
        $sym48$VALUES_LIST = SubLObjectFactory.makeSymbol("VALUES-LIST");
        $sym49$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("STUFF")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym51$DEFTIMED_GENERIC = SubLObjectFactory.makeSymbol("DEFTIMED-GENERIC");
        $sym52$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $sym53$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $sym54$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym55$DEFINE_API = SubLObjectFactory.makeSymbol("DEFINE-API");
    }
    
    public static final class $timing_info_native extends SubLStructNative
    {
        public SubLObject $count;
        public SubLObject $total;
        public SubLObject $max;
        private static final SubLStructDeclNative structDecl;
        
        public $timing_info_native() {
            this.$count = (SubLObject)CommonSymbols.NIL;
            this.$total = (SubLObject)CommonSymbols.NIL;
            this.$max = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$timing_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$count;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$total;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$max;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$count = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$total = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$max = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$timing_info_native.class, timing.$sym10$TIMING_INFO, timing.$sym11$TIMING_INFO_P, timing.$list12, timing.$list13, new String[] { "$count", "$total", "$max" }, timing.$list14, timing.$list15, timing.$sym16$PRINT_TIMING_INFO);
        }
    }
    
    public static final class $timing_info_p$UnaryFunction extends UnaryFunction
    {
        public $timing_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TIMING-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return timing.timing_info_p(arg1);
        }
    }
}

/*

	Total time: 306 ms
	
*/