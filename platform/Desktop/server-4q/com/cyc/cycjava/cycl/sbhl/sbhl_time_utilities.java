package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities";
    public static final String myFingerPrint = "ee452d1fbbfe562ac0d24a92f18b34b8f0a06d5aafffac613167125d9a95844a";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 599L)
    private static SubLSymbol $time_core_constants$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 1269L)
    private static SubLSymbol $hl_start_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 1485L)
    private static SubLSymbol $hl_start_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 1603L)
    private static SubLSymbol $hl_end_table_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 1751L)
    private static SubLSymbol $hl_end_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLSymbol $dtp_hl_start$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLSymbol $dtp_hl_end$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$VALID_CONSTANT_;
    private static final SubLSymbol $sym2$_HL_START_TABLE_LOCK_;
    private static final SubLString $str3$_hl_start_table_lock_;
    private static final SubLSymbol $sym4$_HL_START_TABLE_;
    private static final SubLInteger $int5$100;
    private static final SubLSymbol $sym6$_HL_END_TABLE_LOCK_;
    private static final SubLString $str7$_hl_end_table_lock_;
    private static final SubLSymbol $sym8$_HL_END_TABLE_;
    private static final SubLSymbol $sym9$HL_START;
    private static final SubLSymbol $sym10$HL_START_P;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$PRINT_HL_ENDPOINT;
    private static final SubLSymbol $sym16$HL_START_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$HL_START_INTERVAL;
    private static final SubLSymbol $sym19$_CSETF_HL_START_INTERVAL;
    private static final SubLSymbol $kw20$INTERVAL;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_HL_START;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD;
    private static final SubLSymbol $sym27$SXHASH_HL_START_METHOD;
    private static final SubLSymbol $sym28$HL_END;
    private static final SubLSymbol $sym29$HL_END_P;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$HL_END_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$HL_END_INTERVAL;
    private static final SubLSymbol $sym35$_CSETF_HL_END_INTERVAL;
    private static final SubLSymbol $sym36$MAKE_HL_END;
    private static final SubLSymbol $sym37$VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD;
    private static final SubLSymbol $sym38$SXHASH_HL_END_METHOD;
    private static final SubLString $str39$_a;
    private static final SubLString $str40$_a_is_not_a_valid_endpoint_p_;
    private static final SubLSymbol $sym41$HL_ENDPOINT_P;
    private static final SubLList $list42;
    private static final SubLSymbol $kw43$START;
    private static final SubLSymbol $kw44$CONJUNCTIVE_;
    private static final SubLSymbol $kw45$NOT_FOUND;
    private static final SubLObject $const46$SomeTimeInIntervalFn;
    private static final SubLObject $const47$TimeIntervalInclusiveFn;
    private static final SubLObject $const48$TimeIntervalBetweenFn;
    private static final SubLObject $const49$StartFn;
    private static final SubLObject $const50$EndFn;
    private static final SubLObject $const51$IntervalStartedByFn;
    private static final SubLObject $const52$IntervalStartedByFn_Inclusive;
    private static final SubLObject $const53$IntervalEndedByFn;
    private static final SubLObject $const54$IntervalEndedByFn_Inclusive;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLObject $const57$MilliSecondFn;
    private static final SubLInteger $int58$999;
    private static final SubLObject $const59$SecondFn;
    private static final SubLInteger $int60$59;
    private static final SubLObject $const61$MinuteFn;
    private static final SubLObject $const62$HourFn;
    private static final SubLInteger $int63$23;
    private static final SubLObject $const64$DayFn;
    private static final SubLInteger $int65$31;
    private static final SubLObject $const66$MonthFn;
    private static final SubLObject $const67$YearFn;
    private static final SubLObject $const68$QuarterFn;
    private static final SubLObject $const69$DecadeFn;
    private static final SubLObject $const70$CenturyFn;
    private static final SubLObject $const71$weak_HL_TimePrecedence;
    private static final SubLList $list72;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 932L)
    public static SubLObject initialize_time_kb_feature() {
        if (sbhl_time_utilities.NIL != list_utilities.every_in_list((SubLObject)sbhl_time_utilities.$sym1$VALID_CONSTANT_, sbhl_time_utilities.$time_core_constants$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED)) {
            kb_control_vars.set_time_kb_loaded();
        }
        else {
            kb_control_vars.unset_time_kb_loaded();
        }
        return kb_control_vars.time_kb_loaded_p();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 1864L)
    public static SubLObject initialize_hl_endpoint_tables() {
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            sbhl_time_utilities.$hl_start_table$.setGlobalValue(Hashtables.make_hash_table((SubLObject)sbhl_time_utilities.$int5$100, Symbols.symbol_function((SubLObject)sbhl_time_utilities.EQUAL), (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            sbhl_time_utilities.$hl_end_table$.setGlobalValue(Hashtables.make_hash_table((SubLObject)sbhl_time_utilities.$int5$100, Symbols.symbol_function((SubLObject)sbhl_time_utilities.EQUAL), (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject hl_start_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hl_endpoint(v_object, stream, (SubLObject)sbhl_time_utilities.ZERO_INTEGER);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject hl_start_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $hl_start_native.class) ? sbhl_time_utilities.T : sbhl_time_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject hl_start_interval(final SubLObject v_object) {
        assert sbhl_time_utilities.NIL != hl_start_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject _csetf_hl_start_interval(final SubLObject v_object, final SubLObject value) {
        assert sbhl_time_utilities.NIL != hl_start_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject make_hl_start(SubLObject arglist) {
        if (arglist == sbhl_time_utilities.UNPROVIDED) {
            arglist = (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $hl_start_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sbhl_time_utilities.NIL, next = arglist; sbhl_time_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sbhl_time_utilities.$kw20$INTERVAL)) {
                _csetf_hl_start_interval(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sbhl_time_utilities.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject visit_defstruct_hl_start(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_time_utilities.$kw22$BEGIN, (SubLObject)sbhl_time_utilities.$sym23$MAKE_HL_START, (SubLObject)sbhl_time_utilities.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_time_utilities.$kw24$SLOT, (SubLObject)sbhl_time_utilities.$kw20$INTERVAL, hl_start_interval(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_time_utilities.$kw25$END, (SubLObject)sbhl_time_utilities.$sym23$MAKE_HL_START, (SubLObject)sbhl_time_utilities.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2350L)
    public static SubLObject visit_defstruct_object_hl_start_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hl_start(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2522L)
    public static SubLObject sxhash_hl_start_method(final SubLObject v_object) {
        return Sxhash.sxhash(hl_start_interval(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject hl_end_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hl_endpoint(v_object, stream, (SubLObject)sbhl_time_utilities.ZERO_INTEGER);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject hl_end_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $hl_end_native.class) ? sbhl_time_utilities.T : sbhl_time_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject hl_end_interval(final SubLObject v_object) {
        assert sbhl_time_utilities.NIL != hl_end_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject _csetf_hl_end_interval(final SubLObject v_object, final SubLObject value) {
        assert sbhl_time_utilities.NIL != hl_end_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject make_hl_end(SubLObject arglist) {
        if (arglist == sbhl_time_utilities.UNPROVIDED) {
            arglist = (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $hl_end_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sbhl_time_utilities.NIL, next = arglist; sbhl_time_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sbhl_time_utilities.$kw20$INTERVAL)) {
                _csetf_hl_end_interval(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sbhl_time_utilities.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject visit_defstruct_hl_end(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_time_utilities.$kw22$BEGIN, (SubLObject)sbhl_time_utilities.$sym36$MAKE_HL_END, (SubLObject)sbhl_time_utilities.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_time_utilities.$kw24$SLOT, (SubLObject)sbhl_time_utilities.$kw20$INTERVAL, hl_end_interval(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sbhl_time_utilities.$kw25$END, (SubLObject)sbhl_time_utilities.$sym36$MAKE_HL_END, (SubLObject)sbhl_time_utilities.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2610L)
    public static SubLObject visit_defstruct_object_hl_end_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hl_end(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2779L)
    public static SubLObject sxhash_hl_end_method(final SubLObject v_object) {
        return Sxhash.sxhash(hl_end_interval(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 2936L)
    public static SubLObject print_hl_endpoint(final SubLObject hl_endpoint, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_utilities.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(hl_endpoint, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, hl_endpoint, (SubLObject)sbhl_time_utilities.T, (SubLObject)sbhl_time_utilities.T);
            PrintLow.format(stream, (SubLObject)sbhl_time_utilities.$str39$_a, hl_interval_of_endpoint(hl_endpoint));
            print_macros.print_unreadable_object_postamble(stream, hl_endpoint, (SubLObject)sbhl_time_utilities.T, (SubLObject)sbhl_time_utilities.T);
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 3160L)
    public static SubLObject new_hl_start(final SubLObject interval) {
        final SubLObject hl_start = make_hl_start((SubLObject)sbhl_time_utilities.UNPROVIDED);
        _csetf_hl_start_interval(hl_start, interval);
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            Hashtables.sethash(interval, sbhl_time_utilities.$hl_start_table$.getGlobalValue(), hl_start);
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        return hl_start;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 3477L)
    public static SubLObject new_hl_end(final SubLObject interval) {
        final SubLObject hl_end = make_hl_end((SubLObject)sbhl_time_utilities.UNPROVIDED);
        _csetf_hl_end_interval(hl_end, interval);
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            Hashtables.sethash(interval, sbhl_time_utilities.$hl_end_table$.getGlobalValue(), hl_end);
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        return hl_end;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 3772L)
    public static SubLObject hl_endpoint_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != hl_start_p(v_object) || sbhl_time_utilities.NIL != hl_end_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 3938L)
    public static SubLObject sbhl_time_node_object_p(final SubLObject v_object) {
        return hl_endpoint_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 4098L)
    public static SubLObject hl_interval_of_endpoint(final SubLObject endpoint) {
        if (sbhl_time_utilities.NIL != hl_start_p(endpoint)) {
            return hl_start_interval(endpoint);
        }
        if (sbhl_time_utilities.NIL != hl_end_p(endpoint)) {
            return hl_end_interval(endpoint);
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_time_utilities.$str40$_a_is_not_a_valid_endpoint_p_, endpoint, (SubLObject)sbhl_time_utilities.UNPROVIDED, (SubLObject)sbhl_time_utilities.UNPROVIDED, (SubLObject)sbhl_time_utilities.UNPROVIDED, (SubLObject)sbhl_time_utilities.UNPROVIDED, (SubLObject)sbhl_time_utilities.UNPROVIDED);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 4422L)
    public static SubLObject find_hl_start(final SubLObject time) {
        SubLObject result = (SubLObject)sbhl_time_utilities.NIL;
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            result = Hashtables.gethash(time, sbhl_time_utilities.$hl_start_table$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED);
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 4596L)
    public static SubLObject find_hl_end(final SubLObject time) {
        SubLObject result = (SubLObject)sbhl_time_utilities.NIL;
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            result = Hashtables.gethash(time, sbhl_time_utilities.$hl_end_table$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED);
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 4764L)
    public static SubLObject remove_hl_start(final SubLObject time, SubLObject hl_start) {
        if (hl_start == sbhl_time_utilities.UNPROVIDED) {
            hl_start = (SubLObject)sbhl_time_utilities.NIL;
        }
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            if (sbhl_time_utilities.NIL == hl_start) {
                hl_start = Hashtables.gethash(time, sbhl_time_utilities.$hl_start_table$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED);
            }
            Hashtables.remhash(time, sbhl_time_utilities.$hl_start_table$.getGlobalValue());
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_start_table_lock$.getGlobalValue());
            }
        }
        remove_hl_endpoint_backpointers(hl_start);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 5125L)
    public static SubLObject remove_hl_end(final SubLObject time, SubLObject hl_end) {
        if (hl_end == sbhl_time_utilities.UNPROVIDED) {
            hl_end = (SubLObject)sbhl_time_utilities.NIL;
        }
        SubLObject release = (SubLObject)sbhl_time_utilities.NIL;
        try {
            release = Locks.seize_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            if (sbhl_time_utilities.NIL == hl_end) {
                hl_end = Hashtables.gethash(time, sbhl_time_utilities.$hl_end_table$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED);
            }
            Hashtables.remhash(time, sbhl_time_utilities.$hl_end_table$.getGlobalValue());
        }
        finally {
            if (sbhl_time_utilities.NIL != release) {
                Locks.release_lock(sbhl_time_utilities.$hl_end_table_lock$.getGlobalValue());
            }
        }
        remove_hl_endpoint_backpointers(hl_end);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 5468L)
    public static SubLObject remove_hl_endpoint(final SubLObject point) {
        assert sbhl_time_utilities.NIL != hl_endpoint_p(point) : point;
        if (sbhl_time_utilities.NIL != hl_start_p(point)) {
            remove_hl_start(hl_interval_of_endpoint(point), (SubLObject)sbhl_time_utilities.UNPROVIDED);
        }
        else {
            remove_hl_end(hl_interval_of_endpoint(point), (SubLObject)sbhl_time_utilities.UNPROVIDED);
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 5772L)
    public static SubLObject remove_hl_endpoint_backpointers(final SubLObject point) {
        assert sbhl_time_utilities.NIL != hl_endpoint_p(point) : point;
        SubLObject cdolist_list_var = sbhl_time_vars.get_sbhl_hl_time_predicates();
        SubLObject sbhl_time_pred = (SubLObject)sbhl_time_utilities.NIL;
        sbhl_time_pred = cdolist_list_var.first();
        while (sbhl_time_utilities.NIL != cdolist_list_var) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module(sbhl_time_pred);
            sbhl_graphs.remove_sbhl_graph_link(point, module);
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_time_pred = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 6137L)
    public static SubLObject time_stored_in_hl_p(final SubLObject time) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != find_hl_start(time) || sbhl_time_utilities.NIL != find_hl_end(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 6327L)
    public static SubLObject hl_start(final SubLObject time) {
        final SubLObject hl_start = find_hl_start(time);
        if (sbhl_time_utilities.NIL != hl_start) {
            return hl_start;
        }
        return new_hl_start(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 6535L)
    public static SubLObject hl_end(final SubLObject time) {
        final SubLObject hl_end = find_hl_end(time);
        if (sbhl_time_utilities.NIL != hl_end) {
            return hl_end;
        }
        return new_hl_end(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 6731L)
    public static SubLObject hl_date_predecessor_of_start(final SubLObject eu_date) {
        return hl_end(numeric_date_utilities.preceding_extended_universal_date(eu_date));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 6932L)
    public static SubLObject hl_date_successor_of_end(final SubLObject eu_date) {
        return hl_start(numeric_date_utilities.succeeding_extended_universal_date(eu_date));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 7129L)
    public static SubLObject sbhl_time_arg_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != el_utilities.groundP(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED) && sbhl_time_utilities.NIL == sksi_infrastructure_utilities.sksi_external_term_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 7329L)
    public static SubLObject sbhl_time_inference_arg_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != sbhl_time_arg_p(v_object) && (sbhl_time_utilities.NIL != time_interval_utilities.valid_time_index_p(v_object) || sbhl_time_utilities.NIL != sbhl_temporal_node_p(hl_start(v_object)) || sbhl_time_utilities.NIL != sbhl_temporal_node_p(hl_end(v_object))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 7549L)
    public static SubLObject sbhl_time_inference_args(final SubLObject literal) {
        SubLObject current;
        final SubLObject datum = current = el_utilities.literal_args(literal, (SubLObject)sbhl_time_utilities.UNPROVIDED);
        SubLObject arg1 = (SubLObject)sbhl_time_utilities.NIL;
        SubLObject arg2 = (SubLObject)sbhl_time_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_utilities.$list42);
        arg1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_utilities.$list42);
        arg2 = current.first();
        current = current.rest();
        if (sbhl_time_utilities.NIL == current) {
            return Values.values(date_utilities.possibly_bind_temporal_indexical_in_object(arg1), date_utilities.possibly_bind_temporal_indexical_in_object(arg2));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_utilities.$list42);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 7785L)
    public static SubLObject sbhl_temporal_node_p(final SubLObject temporal_point) {
        if (sbhl_time_utilities.NIL != sbhl_time_node_object_p(temporal_point)) {
            SubLObject foundP;
            SubLObject rest;
            SubLObject pred;
            for (foundP = (SubLObject)sbhl_time_utilities.NIL, rest = (SubLObject)sbhl_time_utilities.NIL, rest = sbhl_time_vars.get_sbhl_hl_time_predicates(); sbhl_time_utilities.NIL == foundP && sbhl_time_utilities.NIL != rest; rest = rest.rest()) {
                pred = rest.first();
                if (sbhl_time_utilities.NIL != Hashtables.gethash(temporal_point, sbhl_module_vars.get_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(pred)), (SubLObject)sbhl_time_utilities.UNPROVIDED)) {
                    foundP = (SubLObject)sbhl_time_utilities.T;
                }
            }
            return foundP;
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 8095L)
    public static SubLObject temporal_link_disjunction_term_p(final SubLObject temporal_point) {
        return list_utilities.sublisp_boolean(Hashtables.gethash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 8330L)
    public static SubLObject sbhl_temporality_term_p(final SubLObject v_term) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != sbhl_temporal_node_p(hl_start(v_term)) || sbhl_time_utilities.NIL != sbhl_temporal_node_p(hl_end(v_term)) || sbhl_time_utilities.NIL != temporal_link_disjunction_term_p(hl_start(v_term)) || sbhl_time_utilities.NIL != temporal_link_disjunction_term_p(hl_end(v_term)) || sbhl_time_utilities.NIL != hl_endpoint_p(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 8637L)
    public static SubLObject valid_sbhl_time_literal_argsP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != sbhl_time_vars.sbhl_temporality_activeP() && sbhl_time_utilities.NIL != sbhl_time_predicate_p(pred) && sbhl_time_utilities.NIL != sbhl_time_arg_p(arg1) && sbhl_time_utilities.NIL != sbhl_time_arg_p(arg2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 8853L)
    public static SubLObject sbhl_node_passes_temporality_all_accesses_filtersP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_utilities.NIL != sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.getDynamicValue(thread) && sbhl_time_utilities.NIL != date_utilities.possibly_hl_date_p(hl_interval_of_endpoint(node))) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        if (sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == sbhl_time_utilities.$kw43$START) {
            return hl_start_p(node);
        }
        if (sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == sbhl_time_utilities.$kw25$END) {
            return hl_end_p(node);
        }
        return (SubLObject)sbhl_time_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 9412L)
    public static SubLObject point_args(final SubLObject temporal_points) {
        SubLObject args = (SubLObject)sbhl_time_utilities.NIL;
        SubLObject cdolist_list_var = temporal_points;
        SubLObject point = (SubLObject)sbhl_time_utilities.NIL;
        point = cdolist_list_var.first();
        while (sbhl_time_utilities.NIL != cdolist_list_var) {
            args = (SubLObject)ConsesLow.cons(hl_interval_of_endpoint(point), args);
            cdolist_list_var = cdolist_list_var.rest();
            point = cdolist_list_var.first();
        }
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 9663L)
    public static SubLObject sbhl_temporal_point_nartP(final SubLObject v_term) {
        return hl_endpoint_p(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 9751L)
    public static SubLObject quasi_hl_start(final SubLObject time) {
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_utilities.$kw43$START, start_arg(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 9833L)
    public static SubLObject quasi_hl_earliest_start(final SubLObject time) {
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_utilities.$kw43$START, earliest_start_arg(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 9933L)
    public static SubLObject quasi_hl_latest_start(final SubLObject time) {
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_utilities.$kw43$START, latest_start_arg(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10029L)
    public static SubLObject quasi_hl_end(final SubLObject time) {
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_utilities.$kw25$END, end_arg(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10105L)
    public static SubLObject quasi_hl_latest_end(final SubLObject time) {
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_utilities.$kw25$END, latest_end_arg(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10195L)
    public static SubLObject quasi_hl_earliest_end(final SubLObject time) {
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_utilities.$kw25$END, earliest_end_arg(time));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10289L)
    public static SubLObject sbhl_time_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue(), (SubLObject)sbhl_time_utilities.UNPROVIDED, (SubLObject)sbhl_time_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10403L)
    public static SubLObject sbhl_time_predicate_with_no_spec_pred_or_inverseP(final SubLObject predicate) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != sbhl_time_predicate_p(predicate) && sbhl_time_utilities.NIL == genl_predicates.some_spec_pred_or_inverseP(predicate, (SubLObject)sbhl_time_utilities.UNPROVIDED, (SubLObject)sbhl_time_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10576L)
    public static SubLObject conjunctive_temporal_relation_predP(final SubLObject pred) {
        if (sbhl_time_utilities.NIL == sbhl_time_predicate_p(pred)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_utilities.$kw44$CONJUNCTIVE_, (SubLObject)sbhl_time_utilities.$kw45$NOT_FOUND);
        if (sbhl_time_utilities.NIL == Types.booleanp(conjunctiveP)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        return conjunctiveP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 10850L)
    public static SubLObject disjunctive_temporal_relation_predP(final SubLObject pred) {
        if (sbhl_time_utilities.NIL == sbhl_time_predicate_p(pred)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_utilities.$kw44$CONJUNCTIVE_, (SubLObject)sbhl_time_utilities.$kw45$NOT_FOUND);
        if (sbhl_time_utilities.NIL == Types.booleanp(conjunctiveP)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL == conjunctiveP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 11131L)
    public static SubLObject earliest_start_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$const46$SomeTimeInIntervalFn)) {
            return earliest_start_arg(cycl_utilities.nat_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        return start_arg(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 11352L)
    public static SubLObject latest_start_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$const46$SomeTimeInIntervalFn)) {
            return latest_end_arg(cycl_utilities.nat_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        return start_arg(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 11547L)
    public static SubLObject start_arg(final SubLObject time) {
        if (sbhl_time_utilities.NIL != date_interval_nat_p(time)) {
            final SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql(sbhl_time_utilities.$const47$TimeIntervalInclusiveFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const48$TimeIntervalBetweenFn)) {
                return numeric_date_utilities.succeeding_extended_universal_date(end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const49$StartFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const50$EndFn)) {
                return end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const51$IntervalStartedByFn)) {
                return numeric_date_utilities.succeeding_extended_universal_date(end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const52$IntervalStartedByFn_Inclusive)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const53$IntervalEndedByFn)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$const54$IntervalEndedByFn_Inclusive)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
        }
        else if (sbhl_time_utilities.NIL != time_interval_nat_with_possibly_reducible_start_p(time)) {
            final SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql(sbhl_time_utilities.$const47$TimeIntervalInclusiveFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const49$StartFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const50$EndFn)) {
                return end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const52$IntervalStartedByFn_Inclusive)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const53$IntervalEndedByFn)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$const54$IntervalEndedByFn_Inclusive)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
        }
        else {
            if (sbhl_time_utilities.NIL != date_utilities.always_time_intervalP(time)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
            if (sbhl_time_utilities.NIL != date_utilities.beginning_of_timeP(time)) {
                return time;
            }
            if (sbhl_time_utilities.NIL != date_utilities.end_of_timeP(time)) {
                return time;
            }
            if (sbhl_time_utilities.NIL != sbhl_time_el_date_p(time)) {
                return date_utilities.extended_universal_date_for_date_initial_second(time);
            }
            if (sbhl_time_utilities.NIL != el_utilities.groundP(time, (SubLObject)sbhl_time_utilities.UNPROVIDED)) {
                return time;
            }
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 13100L)
    public static SubLObject earliest_end_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$const46$SomeTimeInIntervalFn)) {
            return earliest_start_arg(cycl_utilities.nat_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        return end_arg(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 13297L)
    public static SubLObject latest_end_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$const46$SomeTimeInIntervalFn)) {
            return latest_end_arg(cycl_utilities.nat_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        return end_arg(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 13488L)
    public static SubLObject end_arg(final SubLObject time) {
        if (sbhl_time_utilities.NIL != date_interval_nat_p(time)) {
            final SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql(sbhl_time_utilities.$const47$TimeIntervalInclusiveFn)) {
                return end_arg(cycl_utilities.formula_arg2(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const48$TimeIntervalBetweenFn)) {
                return numeric_date_utilities.preceding_extended_universal_date(start_arg(cycl_utilities.formula_arg2(time, (SubLObject)sbhl_time_utilities.UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const49$StartFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const50$EndFn)) {
                return end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const51$IntervalStartedByFn)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$const52$IntervalStartedByFn_Inclusive)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$const53$IntervalEndedByFn)) {
                return numeric_date_utilities.preceding_extended_universal_date(start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED)));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const54$IntervalEndedByFn_Inclusive)) {
                return end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
        }
        else if (sbhl_time_utilities.NIL != time_interval_nat_with_possibly_reducible_end_p(time)) {
            final SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql(sbhl_time_utilities.$const47$TimeIntervalInclusiveFn)) {
                return end_arg(cycl_utilities.formula_arg2(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const49$StartFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const50$EndFn)) {
                return end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
            if (pcase_var.eql(sbhl_time_utilities.$const51$IntervalStartedByFn)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$const52$IntervalStartedByFn_Inclusive)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql(sbhl_time_utilities.$const54$IntervalEndedByFn_Inclusive)) {
                return end_arg(cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED));
            }
        }
        else {
            if (sbhl_time_utilities.NIL != date_utilities.always_time_intervalP(time)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (sbhl_time_utilities.NIL != date_utilities.beginning_of_timeP(time)) {
                return time;
            }
            if (sbhl_time_utilities.NIL != date_utilities.end_of_timeP(time)) {
                return time;
            }
            if (sbhl_time_utilities.NIL != sbhl_time_el_date_p(time)) {
                return date_utilities.extended_universal_date_for_date_final_second(time);
            }
            if (sbhl_time_utilities.NIL != el_utilities.groundP(time, (SubLObject)sbhl_time_utilities.UNPROVIDED)) {
                return time;
            }
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 15001L)
    public static SubLObject hl_date_point_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != hl_endpoint_p(v_object) && sbhl_time_utilities.NIL != sbhl_time_dates.sbhl_date_p(hl_interval_of_endpoint(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 15209L)
    public static SubLObject date_interval_nat_p(final SubLObject time) {
        if (sbhl_time_utilities.NIL == cycl_grammar.cycl_nat_p(time)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql(sbhl_time_utilities.$const47$TimeIntervalInclusiveFn) || pcase_var.eql(sbhl_time_utilities.$const48$TimeIntervalBetweenFn)) {
            final SubLObject arg1 = cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(time, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean((sbhl_time_utilities.NIL != sbhl_time_el_date_p(arg1) || sbhl_time_utilities.NIL != date_interval_nat_p(arg1)) && (sbhl_time_utilities.NIL != sbhl_time_el_date_p(arg2) || sbhl_time_utilities.NIL != date_interval_nat_p(arg2)));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const49$StartFn) || pcase_var.eql(sbhl_time_utilities.$const50$EndFn) || pcase_var.eql(sbhl_time_utilities.$const51$IntervalStartedByFn) || pcase_var.eql(sbhl_time_utilities.$const53$IntervalEndedByFn) || pcase_var.eql(sbhl_time_utilities.$const52$IntervalStartedByFn_Inclusive) || pcase_var.eql(sbhl_time_utilities.$const54$IntervalEndedByFn_Inclusive)) {
            final SubLObject arg1 = cycl_utilities.formula_arg1(time, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != sbhl_time_el_date_p(arg1) || sbhl_time_utilities.NIL != date_interval_nat_p(arg1));
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 16122L)
    public static SubLObject time_interval_nat_with_possibly_reducible_start_p(final SubLObject time) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != cycl_grammar.cycl_nat_p(time) && sbhl_time_utilities.NIL != conses_high.member(cycl_utilities.formula_operator(time), (SubLObject)sbhl_time_utilities.$list55, Symbols.symbol_function((SubLObject)sbhl_time_utilities.EQL), (SubLObject)sbhl_time_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 16494L)
    public static SubLObject time_interval_nat_with_possibly_reducible_end_p(final SubLObject time) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != cycl_grammar.cycl_nat_p(time) && sbhl_time_utilities.NIL != subl_promotions.memberP(cycl_utilities.formula_operator(time), (SubLObject)sbhl_time_utilities.$list56, Symbols.symbol_function((SubLObject)sbhl_time_utilities.EQL), (SubLObject)sbhl_time_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 16867L)
    public static SubLObject sbhl_time_el_date_p(final SubLObject v_object) {
        return sbhl_time_el_date_p_recursive(v_object, (SubLObject)sbhl_time_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 17099L)
    public static SubLObject sbhl_time_el_date_p_recursive(final SubLObject v_object, final SubLObject expected) {
        if (sbhl_time_utilities.NIL == el_utilities.possibly_naut_p(v_object)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject function = cycl_utilities.formula_operator(v_object);
        if (sbhl_time_utilities.NIL != expected && !function.eql(expected)) {
            return (SubLObject)sbhl_time_utilities.NIL;
        }
        final SubLObject pcase_var = function;
        if (pcase_var.eql(sbhl_time_utilities.$const57$MilliSecondFn)) {
            final SubLObject millisecond = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(millisecond.isInteger() && sbhl_time_utilities.ZERO_INTEGER.numLE(millisecond) && millisecond.numLE((SubLObject)sbhl_time_utilities.$int58$999) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const59$SecondFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const59$SecondFn)) {
            final SubLObject second = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(second.isInteger() && sbhl_time_utilities.ZERO_INTEGER.numLE(second) && second.numLE((SubLObject)sbhl_time_utilities.$int60$59) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const61$MinuteFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const61$MinuteFn)) {
            final SubLObject minute = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(minute.isInteger() && sbhl_time_utilities.ZERO_INTEGER.numLE(minute) && minute.numLE((SubLObject)sbhl_time_utilities.$int60$59) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const62$HourFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const62$HourFn)) {
            final SubLObject hour = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(hour.isInteger() && sbhl_time_utilities.ZERO_INTEGER.numLE(hour) && hour.numLE((SubLObject)sbhl_time_utilities.$int63$23) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const64$DayFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const64$DayFn)) {
            final SubLObject day = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(day.isInteger() && sbhl_time_utilities.ONE_INTEGER.numLE(day) && day.numLE((SubLObject)sbhl_time_utilities.$int65$31) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const66$MonthFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const66$MonthFn)) {
            final SubLObject month = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL != date_utilities.month_p(month) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const67$YearFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const68$QuarterFn)) {
            final SubLObject quarter = cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED);
            return (SubLObject)SubLObjectFactory.makeBoolean(quarter.isInteger() && sbhl_time_utilities.ONE_INTEGER.numLE(quarter) && quarter.numLE((SubLObject)sbhl_time_utilities.FOUR_INTEGER) && sbhl_time_utilities.NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED), sbhl_time_utilities.$const67$YearFn));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const67$YearFn)) {
            return Types.integerp(cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const69$DecadeFn)) {
            return Types.integerp(cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        if (pcase_var.eql(sbhl_time_utilities.$const70$CenturyFn)) {
            return Types.integerp(cycl_utilities.formula_arg1(v_object, (SubLObject)sbhl_time_utilities.UNPROVIDED));
        }
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-utilities.lisp", position = 19274L)
    public static SubLObject sbhl_weak_graph_busted_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_time_utilities.NIL;
        final SubLObject module = sbhl_module_vars.get_sbhl_module(sbhl_time_utilities.$const71$weak_HL_TimePrecedence);
        sbhl_graphs.swap_in_all_graph_links(module);
        final SubLObject iterator = map_utilities.new_map_iterator(sbhl_module_vars.get_sbhl_module_graph(module));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)sbhl_time_utilities.NIL; sbhl_time_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sbhl_time_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = (SubLObject)sbhl_time_utilities.NIL;
                SubLObject link = (SubLObject)sbhl_time_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_utilities.$list72);
                node = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_utilities.$list72);
                link = current.first();
                current = current.rest();
                if (sbhl_time_utilities.NIL == current) {
                    SubLObject interval_term = (SubLObject)sbhl_time_utilities.NIL;
                    if (sbhl_time_utilities.NIL != hl_start_p(node)) {
                        interval_term = hl_start_interval(node);
                    }
                    else if (sbhl_time_utilities.NIL != hl_end_p(node)) {
                        interval_term = hl_end_interval(node);
                    }
                    if (sbhl_time_utilities.NIL == narts_high.naut_p(interval_term) && sbhl_time_utilities.NIL == forts.valid_fortP(interval_term)) {
                        result = (SubLObject)ConsesLow.cons(interval_term, result);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_time_utilities.$list72);
                }
            }
        }
        return Sequences.nreverse(result);
    }
    
    public static SubLObject declare_sbhl_time_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "initialize_time_kb_feature", "INITIALIZE-TIME-KB-FEATURE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "initialize_hl_endpoint_tables", "INITIALIZE-HL-ENDPOINT-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_start_print_function_trampoline", "HL-START-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_start_p", "HL-START-P", 1, 0, false);
        new $hl_start_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_start_interval", "HL-START-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "_csetf_hl_start_interval", "_CSETF-HL-START-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "make_hl_start", "MAKE-HL-START", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "visit_defstruct_hl_start", "VISIT-DEFSTRUCT-HL-START", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "visit_defstruct_object_hl_start_method", "VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sxhash_hl_start_method", "SXHASH-HL-START-METHOD", 1, 0, false);
        new $sxhash_hl_start_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_end_print_function_trampoline", "HL-END-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_end_p", "HL-END-P", 1, 0, false);
        new $hl_end_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_end_interval", "HL-END-INTERVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "_csetf_hl_end_interval", "_CSETF-HL-END-INTERVAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "make_hl_end", "MAKE-HL-END", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "visit_defstruct_hl_end", "VISIT-DEFSTRUCT-HL-END", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "visit_defstruct_object_hl_end_method", "VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sxhash_hl_end_method", "SXHASH-HL-END-METHOD", 1, 0, false);
        new $sxhash_hl_end_method$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "print_hl_endpoint", "PRINT-HL-ENDPOINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "new_hl_start", "NEW-HL-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "new_hl_end", "NEW-HL-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_endpoint_p", "HL-ENDPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_node_object_p", "SBHL-TIME-NODE-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_interval_of_endpoint", "HL-INTERVAL-OF-ENDPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "find_hl_start", "FIND-HL-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "find_hl_end", "FIND-HL-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "remove_hl_start", "REMOVE-HL-START", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "remove_hl_end", "REMOVE-HL-END", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "remove_hl_endpoint", "REMOVE-HL-ENDPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "remove_hl_endpoint_backpointers", "REMOVE-HL-ENDPOINT-BACKPOINTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "time_stored_in_hl_p", "TIME-STORED-IN-HL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_start", "HL-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_end", "HL-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_date_predecessor_of_start", "HL-DATE-PREDECESSOR-OF-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_date_successor_of_end", "HL-DATE-SUCCESSOR-OF-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_arg_p", "SBHL-TIME-ARG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_inference_arg_p", "SBHL-TIME-INFERENCE-ARG-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_inference_args", "SBHL-TIME-INFERENCE-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_temporal_node_p", "SBHL-TEMPORAL-NODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "temporal_link_disjunction_term_p", "TEMPORAL-LINK-DISJUNCTION-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_temporality_term_p", "SBHL-TEMPORALITY-TERM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "valid_sbhl_time_literal_argsP", "VALID-SBHL-TIME-LITERAL-ARGS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_node_passes_temporality_all_accesses_filtersP", "SBHL-NODE-PASSES-TEMPORALITY-ALL-ACCESSES-FILTERS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "point_args", "POINT-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_temporal_point_nartP", "SBHL-TEMPORAL-POINT-NART?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "quasi_hl_start", "QUASI-HL-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "quasi_hl_earliest_start", "QUASI-HL-EARLIEST-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "quasi_hl_latest_start", "QUASI-HL-LATEST-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "quasi_hl_end", "QUASI-HL-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "quasi_hl_latest_end", "QUASI-HL-LATEST-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "quasi_hl_earliest_end", "QUASI-HL-EARLIEST-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_predicate_p", "SBHL-TIME-PREDICATE-P", 1, 0, false);
        new $sbhl_time_predicate_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_predicate_with_no_spec_pred_or_inverseP", "SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "conjunctive_temporal_relation_predP", "CONJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "disjunctive_temporal_relation_predP", "DISJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "earliest_start_arg", "EARLIEST-START-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "latest_start_arg", "LATEST-START-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "start_arg", "START-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "earliest_end_arg", "EARLIEST-END-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "latest_end_arg", "LATEST-END-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "end_arg", "END-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "hl_date_point_p", "HL-DATE-POINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "date_interval_nat_p", "DATE-INTERVAL-NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "time_interval_nat_with_possibly_reducible_start_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-START-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "time_interval_nat_with_possibly_reducible_end_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-END-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_el_date_p", "SBHL-TIME-EL-DATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_time_el_date_p_recursive", "SBHL-TIME-EL-DATE-P-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities", "sbhl_weak_graph_busted_forts", "SBHL-WEAK-GRAPH-BUSTED-FORTS", 0, 0, false);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    public static SubLObject init_sbhl_time_utilities_file() {
        sbhl_time_utilities.$time_core_constants$ = SubLFiles.deflexical("*TIME-CORE-CONSTANTS*", (SubLObject)sbhl_time_utilities.$list0);
        sbhl_time_utilities.$hl_start_table_lock$ = SubLFiles.deflexical("*HL-START-TABLE-LOCK*", maybeDefault((SubLObject)sbhl_time_utilities.$sym2$_HL_START_TABLE_LOCK_, sbhl_time_utilities.$hl_start_table_lock$, ()->(Locks.make_lock((SubLObject)sbhl_time_utilities.$str3$_hl_start_table_lock_))));
        sbhl_time_utilities.$hl_start_table$ = SubLFiles.deflexical("*HL-START-TABLE*", maybeDefault((SubLObject)sbhl_time_utilities.$sym4$_HL_START_TABLE_, sbhl_time_utilities.$hl_start_table$, ()->(Hashtables.make_hash_table((SubLObject)sbhl_time_utilities.$int5$100, Symbols.symbol_function((SubLObject)sbhl_time_utilities.EQUAL), (SubLObject)sbhl_time_utilities.UNPROVIDED))));
        sbhl_time_utilities.$hl_end_table_lock$ = SubLFiles.deflexical("*HL-END-TABLE-LOCK*", maybeDefault((SubLObject)sbhl_time_utilities.$sym6$_HL_END_TABLE_LOCK_, sbhl_time_utilities.$hl_end_table_lock$, ()->(Locks.make_lock((SubLObject)sbhl_time_utilities.$str7$_hl_end_table_lock_))));
        sbhl_time_utilities.$hl_end_table$ = SubLFiles.deflexical("*HL-END-TABLE*", maybeDefault((SubLObject)sbhl_time_utilities.$sym8$_HL_END_TABLE_, sbhl_time_utilities.$hl_end_table$, ()->(Hashtables.make_hash_table((SubLObject)sbhl_time_utilities.$int5$100, Symbols.symbol_function((SubLObject)sbhl_time_utilities.EQUAL), (SubLObject)sbhl_time_utilities.UNPROVIDED))));
        sbhl_time_utilities.$dtp_hl_start$ = SubLFiles.defconstant("*DTP-HL-START*", (SubLObject)sbhl_time_utilities.$sym9$HL_START);
        sbhl_time_utilities.$dtp_hl_end$ = SubLFiles.defconstant("*DTP-HL-END*", (SubLObject)sbhl_time_utilities.$sym28$HL_END);
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    public static SubLObject setup_sbhl_time_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_utilities.$sym2$_HL_START_TABLE_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_utilities.$sym4$_HL_START_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_utilities.$sym6$_HL_END_TABLE_LOCK_);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_utilities.$sym8$_HL_END_TABLE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_utilities.$sym16$HL_START_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sbhl_time_utilities.$list17);
        Structures.def_csetf((SubLObject)sbhl_time_utilities.$sym18$HL_START_INTERVAL, (SubLObject)sbhl_time_utilities.$sym19$_CSETF_HL_START_INTERVAL);
        Equality.identity((SubLObject)sbhl_time_utilities.$sym9$HL_START);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_utilities.$sym26$VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_start$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_utilities.$sym27$SXHASH_HL_START_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_utilities.$sym32$HL_END_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sbhl_time_utilities.$list33);
        Structures.def_csetf((SubLObject)sbhl_time_utilities.$sym34$HL_END_INTERVAL, (SubLObject)sbhl_time_utilities.$sym35$_CSETF_HL_END_INTERVAL);
        Equality.identity((SubLObject)sbhl_time_utilities.$sym28$HL_END);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_utilities.$sym37$VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD));
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), sbhl_time_utilities.$dtp_hl_end$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_utilities.$sym38$SXHASH_HL_END_METHOD));
        return (SubLObject)sbhl_time_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_time_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_time_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_time_utilities_file();
    }
    
    static {
        me = (SubLFile)new sbhl_time_utilities();
        sbhl_time_utilities.$time_core_constants$ = null;
        sbhl_time_utilities.$hl_start_table_lock$ = null;
        sbhl_time_utilities.$hl_start_table$ = null;
        sbhl_time_utilities.$hl_end_table_lock$ = null;
        sbhl_time_utilities.$hl_end_table$ = null;
        sbhl_time_utilities.$dtp_hl_start$ = null;
        sbhl_time_utilities.$dtp_hl_end$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strict-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("successorStrict-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weakSuccessor-HL-TimePrecedence")));
        $sym1$VALID_CONSTANT_ = SubLObjectFactory.makeSymbol("VALID-CONSTANT?");
        $sym2$_HL_START_TABLE_LOCK_ = SubLObjectFactory.makeSymbol("*HL-START-TABLE-LOCK*");
        $str3$_hl_start_table_lock_ = SubLObjectFactory.makeString("*hl-start-table-lock*");
        $sym4$_HL_START_TABLE_ = SubLObjectFactory.makeSymbol("*HL-START-TABLE*");
        $int5$100 = SubLObjectFactory.makeInteger(100);
        $sym6$_HL_END_TABLE_LOCK_ = SubLObjectFactory.makeSymbol("*HL-END-TABLE-LOCK*");
        $str7$_hl_end_table_lock_ = SubLObjectFactory.makeString("*hl-end-table-lock*");
        $sym8$_HL_END_TABLE_ = SubLObjectFactory.makeSymbol("*HL-END-TABLE*");
        $sym9$HL_START = SubLObjectFactory.makeSymbol("HL-START");
        $sym10$HL_START_P = SubLObjectFactory.makeSymbol("HL-START-P");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERVAL"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERVAL"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-START-INTERVAL"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HL-START-INTERVAL"));
        $sym15$PRINT_HL_ENDPOINT = SubLObjectFactory.makeSymbol("PRINT-HL-ENDPOINT");
        $sym16$HL_START_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HL-START-PRINT-FUNCTION-TRAMPOLINE");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HL-START-P"));
        $sym18$HL_START_INTERVAL = SubLObjectFactory.makeSymbol("HL-START-INTERVAL");
        $sym19$_CSETF_HL_START_INTERVAL = SubLObjectFactory.makeSymbol("_CSETF-HL-START-INTERVAL");
        $kw20$INTERVAL = SubLObjectFactory.makeKeyword("INTERVAL");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_HL_START = SubLObjectFactory.makeSymbol("MAKE-HL-START");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD");
        $sym27$SXHASH_HL_START_METHOD = SubLObjectFactory.makeSymbol("SXHASH-HL-START-METHOD");
        $sym28$HL_END = SubLObjectFactory.makeSymbol("HL-END");
        $sym29$HL_END_P = SubLObjectFactory.makeSymbol("HL-END-P");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-END-INTERVAL"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-HL-END-INTERVAL"));
        $sym32$HL_END_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HL-END-PRINT-FUNCTION-TRAMPOLINE");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HL-END-P"));
        $sym34$HL_END_INTERVAL = SubLObjectFactory.makeSymbol("HL-END-INTERVAL");
        $sym35$_CSETF_HL_END_INTERVAL = SubLObjectFactory.makeSymbol("_CSETF-HL-END-INTERVAL");
        $sym36$MAKE_HL_END = SubLObjectFactory.makeSymbol("MAKE-HL-END");
        $sym37$VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD");
        $sym38$SXHASH_HL_END_METHOD = SubLObjectFactory.makeSymbol("SXHASH-HL-END-METHOD");
        $str39$_a = SubLObjectFactory.makeString("~a");
        $str40$_a_is_not_a_valid_endpoint_p_ = SubLObjectFactory.makeString("~a is not a valid endpoint-p.");
        $sym41$HL_ENDPOINT_P = SubLObjectFactory.makeSymbol("HL-ENDPOINT-P");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $kw43$START = SubLObjectFactory.makeKeyword("START");
        $kw44$CONJUNCTIVE_ = SubLObjectFactory.makeKeyword("CONJUNCTIVE?");
        $kw45$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $const46$SomeTimeInIntervalFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SomeTimeInIntervalFn"));
        $const47$TimeIntervalInclusiveFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn"));
        $const48$TimeIntervalBetweenFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalBetweenFn"));
        $const49$StartFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StartFn"));
        $const50$EndFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndFn"));
        $const51$IntervalStartedByFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn"));
        $const52$IntervalStartedByFn_Inclusive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive"));
        $const53$IntervalEndedByFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn"));
        $const54$IntervalEndedByFn_Inclusive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive"));
        $list55 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StartFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")));
        $list56 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TimeIntervalInclusiveFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StartFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EndFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalStartedByFn-Inclusive")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IntervalEndedByFn-Inclusive")));
        $const57$MilliSecondFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MilliSecondFn"));
        $int58$999 = SubLObjectFactory.makeInteger(999);
        $const59$SecondFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondFn"));
        $int60$59 = SubLObjectFactory.makeInteger(59);
        $const61$MinuteFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MinuteFn"));
        $const62$HourFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HourFn"));
        $int63$23 = SubLObjectFactory.makeInteger(23);
        $const64$DayFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DayFn"));
        $int65$31 = SubLObjectFactory.makeInteger(31);
        $const66$MonthFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonthFn"));
        $const67$YearFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("YearFn"));
        $const68$QuarterFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuarterFn"));
        $const69$DecadeFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DecadeFn"));
        $const70$CenturyFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CenturyFn"));
        $const71$weak_HL_TimePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"));
    }
    
    public static final class $hl_start_native extends SubLStructNative
    {
        public SubLObject $interval;
        private static final SubLStructDeclNative structDecl;
        
        public $hl_start_native() {
            this.$interval = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$hl_start_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$interval;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$interval = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$hl_start_native.class, sbhl_time_utilities.$sym9$HL_START, sbhl_time_utilities.$sym10$HL_START_P, sbhl_time_utilities.$list11, sbhl_time_utilities.$list12, new String[] { "$interval" }, sbhl_time_utilities.$list13, sbhl_time_utilities.$list14, sbhl_time_utilities.$sym15$PRINT_HL_ENDPOINT);
        }
    }
    
    public static final class $hl_start_p$UnaryFunction extends UnaryFunction
    {
        public $hl_start_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-START-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.hl_start_p(arg1);
        }
    }
    
    public static final class $sxhash_hl_start_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_hl_start_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-HL-START-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.sxhash_hl_start_method(arg1);
        }
    }
    
    public static final class $hl_end_native extends SubLStructNative
    {
        public SubLObject $interval;
        private static final SubLStructDeclNative structDecl;
        
        public $hl_end_native() {
            this.$interval = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$hl_end_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$interval;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$interval = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$hl_end_native.class, sbhl_time_utilities.$sym28$HL_END, sbhl_time_utilities.$sym29$HL_END_P, sbhl_time_utilities.$list11, sbhl_time_utilities.$list12, new String[] { "$interval" }, sbhl_time_utilities.$list30, sbhl_time_utilities.$list31, sbhl_time_utilities.$sym15$PRINT_HL_ENDPOINT);
        }
    }
    
    public static final class $hl_end_p$UnaryFunction extends UnaryFunction
    {
        public $hl_end_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-END-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.hl_end_p(arg1);
        }
    }
    
    public static final class $sxhash_hl_end_method$UnaryFunction extends UnaryFunction
    {
        public $sxhash_hl_end_method$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SXHASH-HL-END-METHOD"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.sxhash_hl_end_method(arg1);
        }
    }
    
    public static final class $sbhl_time_predicate_p$UnaryFunction extends UnaryFunction
    {
        public $sbhl_time_predicate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SBHL-TIME-PREDICATE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_utilities.sbhl_time_predicate_p(arg1);
        }
    }
}

/*

	Total time: 248 ms
	
*/