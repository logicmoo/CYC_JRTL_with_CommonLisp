package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_error extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_error";
    public static final String myFingerPrint = "16eb1103062a03c558dbb77732f8de27e56c51079829716e0ca9e03e441c4d25";
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 763L)
    private static SubLSymbol $pph_min_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 811L)
    public static SubLSymbol $pph_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2093L)
    public static SubLSymbol $suspend_pph_sanity_checkingP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2254L)
    public static SubLSymbol $pph_break_on_errorP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2424L)
    public static SubLSymbol $pph_error_handling_onP$;
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4373L)
    public static SubLSymbol $suspend_pph_type_checkingP$;
    private static final SubLSymbol $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$PWHEN;
    private static final SubLSymbol $sym4$FORCE_FORMAT;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$CLET;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$PIF;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PROGN;
    private static final SubLSymbol $sym11$CATCH_ERROR_MESSAGE;
    private static final SubLSymbol $sym12$STRINGP;
    private static final SubLSymbol $sym13$PUNLESS;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$WARN;
    private static final SubLSymbol $sym16$CCONCATENATE;
    private static final SubLSymbol $sym17$TRUNCATE_PPH_ERROR_MESSAGE;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$NEW_FORMAT_STRING;
    private static final SubLSymbol $sym21$FORMAT_NIL;
    private static final SubLString $str22$_PPH_error_level__S___a;
    private static final SubLSymbol $sym23$PPH_HANDLE_ERROR;
    private static final SubLSymbol $sym24$LIST;
    private static final SubLSymbol $sym25$PPH_ERROR;
    private static final SubLSymbol $sym26$CERROR;
    private static final SubLString $str27$continue_anyway;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$PCASE_FEATURE;
    private static final SubLSymbol $kw31$CYC_MAINT;
    private static final SubLSymbol $sym32$COR;
    private static final SubLSymbol $sym33$_SUSPEND_PPH_TYPE_CHECKING__;
    private static final SubLString $str34$_S_is_not_a__S;
    private static final SubLSymbol $sym35$QUOTE;
    private static final SubLSymbol $sym36$LIST_OF_TYPE_P;
    private static final SubLString $str37$_S_is_not_a_list_of__S;
    private static final SubLSymbol $sym38$NULL;
    private static final SubLSymbol $sym39$PPH_CHECK_TYPE;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 944L)
    public static SubLObject pph_trace(SubLObject level) {
        if (level == pph_error.UNPROVIDED) {
            level = (SubLObject)pph_error.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_error.NIL != level) {
            pph_set_trace_level(level);
        }
        else {
            pph_cinc_trace_level();
        }
        return pph_error.$pph_trace_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1094L)
    public static SubLObject pph_untrace() {
        return pph_set_trace_level(pph_error.$pph_min_trace_level$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1178L)
    public static SubLObject pph_set_trace_level(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!level.isInteger()) {
            return pph_error.$pph_trace_level$.getDynamicValue(thread);
        }
        if (level.numL(pph_error.$pph_min_trace_level$.getGlobalValue())) {
            pph_error.$pph_trace_level$.setDynamicValue(pph_error.$pph_min_trace_level$.getGlobalValue(), thread);
        }
        else {
            pph_error.$pph_trace_level$.setDynamicValue(level, thread);
        }
        return pph_error.$pph_trace_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1441L)
    public static SubLObject pph_cinc_trace_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_error.$pph_trace_level$.setDynamicValue(Numbers.add(pph_error.$pph_trace_level$.getDynamicValue(thread), (SubLObject)pph_error.ONE_INTEGER), thread);
        return pph_error.$pph_trace_level$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1536L)
    public static SubLObject pph_trace_level_exceeds_minimumP(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recursion_depth = (SubLObject)(pph_vars.current_generation_level().isPositive() ? number_utilities.f_1_(pph_vars.current_generation_level()) : pph_error.ZERO_INTEGER);
        final SubLObject adjusted_trace_level = Numbers.subtract(pph_error.$pph_trace_level$.getDynamicValue(thread), recursion_depth);
        final SubLObject exceedsP = Numbers.numGE(adjusted_trace_level, level);
        return exceedsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 1892L)
    public static SubLObject pph_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)pph_error.NIL;
        SubLObject format_str = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list2);
        level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list2);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym3$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), (SubLObject)ConsesLow.listS((SubLObject)pph_error.$sym4$FORCE_FORMAT, (SubLObject)pph_error.T, format_str, ConsesLow.append(args, (SubLObject)pph_error.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2152L)
    public static SubLObject pph_sanity_checking_suspendedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(pph_error.$suspend_pph_sanity_checkingP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2351L)
    public static SubLObject pph_break_on_errorP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return pph_error.$pph_break_on_errorP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 2479L)
    public static SubLObject with_pph_error_handling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject error_message = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list5);
        error_message = current.first();
        current = current.rest();
        if (pph_error.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym6$CLET, (SubLObject)pph_error.$list7, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym8$PIF, (SubLObject)pph_error.$list9, reader.bq_cons((SubLObject)pph_error.$sym10$PROGN, ConsesLow.append(body, (SubLObject)pph_error.NIL)), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym10$PROGN, (SubLObject)ConsesLow.listS((SubLObject)pph_error.$sym11$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(error_message), ConsesLow.append(body, (SubLObject)pph_error.NIL)), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym3$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym12$STRINGP, error_message), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym13$PUNLESS, (SubLObject)pph_error.$list14, (SubLObject)ConsesLow.listS((SubLObject)pph_error.$sym15$WARN, (SubLObject)ConsesLow.listS((SubLObject)pph_error.$sym16$CCONCATENATE, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym17$TRUNCATE_PPH_ERROR_MESSAGE, error_message), (SubLObject)pph_error.$list18), (SubLObject)pph_error.$list19))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_error.$list5);
        return (SubLObject)pph_error.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 3185L)
    public static SubLObject pph_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)pph_error.NIL;
        SubLObject format_str = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list2);
        level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list2);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject new_format_string = (SubLObject)pph_error.$sym20$NEW_FORMAT_STRING;
        return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym6$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_format_string, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym21$FORMAT_NIL, (SubLObject)pph_error.$str22$_PPH_error_level__S___a, level, format_str))), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym23$PPH_HANDLE_ERROR, new_format_string, reader.bq_cons((SubLObject)pph_error.$sym24$LIST, ConsesLow.append(args, (SubLObject)pph_error.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 3473L)
    public static SubLObject pph_handle_error(final SubLObject format_string, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_error.NIL != pph_error.$pph_error_handling_onP$.getDynamicValue(thread)) {
            Functions.apply((SubLObject)pph_error.$sym26$CERROR, (SubLObject)ConsesLow.listS((SubLObject)pph_error.$str27$continue_anyway, format_string, args));
        }
        else if (pph_error.NIL == suppress_pph_warningsP()) {
            Functions.apply((SubLObject)pph_error.$sym15$WARN, reader.bq_cons(format_string, args));
            streams_high.force_output(StreamsLow.$error_output$.getDynamicValue(thread));
        }
        return pph_error.$pph_error_handling_onP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4008L)
    public static SubLObject suppress_pph_warningsP() {
        return (SubLObject)pph_error.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4128L)
    public static SubLObject pph_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)pph_error.NIL;
        SubLObject format_str = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list2);
        level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list2);
        format_str = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym3$PWHEN, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), (SubLObject)ConsesLow.listS((SubLObject)pph_error.$sym13$PUNLESS, (SubLObject)pph_error.$list14, (SubLObject)ConsesLow.listS((SubLObject)pph_error.$sym15$WARN, format_str, ConsesLow.append(args, (SubLObject)pph_error.NIL)), (SubLObject)pph_error.$list28));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4430L)
    public static SubLObject pph_check_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)pph_error.NIL;
        SubLObject pred = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list29);
        pred = current.first();
        current = current.rest();
        if (pph_error.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym30$PCASE_FEATURE, (SubLObject)ConsesLow.list((SubLObject)pph_error.$kw31$CYC_MAINT, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym13$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym32$COR, (SubLObject)pph_error.$sym33$_SUSPEND_PPH_TYPE_CHECKING__, (SubLObject)ConsesLow.list(pred, v_object)), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym25$PPH_ERROR, (SubLObject)pph_error.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym21$FORMAT_NIL, (SubLObject)pph_error.$str34$_S_is_not_a__S, v_object, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym35$QUOTE, pred))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_error.$list29);
        return (SubLObject)pph_error.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4652L)
    public static SubLObject pph_check_list_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)pph_error.NIL;
        SubLObject pred = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list29);
        pred = current.first();
        current = current.rest();
        if (pph_error.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym30$PCASE_FEATURE, (SubLObject)ConsesLow.list((SubLObject)pph_error.$kw31$CYC_MAINT, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym13$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym32$COR, (SubLObject)pph_error.$sym33$_SUSPEND_PPH_TYPE_CHECKING__, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym36$LIST_OF_TYPE_P, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym35$QUOTE, pred), v_object)), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym25$PPH_ERROR, (SubLObject)pph_error.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym21$FORMAT_NIL, (SubLObject)pph_error.$str37$_S_is_not_a_list_of__S, v_object, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym35$QUOTE, pred))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_error.$list29);
        return (SubLObject)pph_error.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-error.lisp", position = 4903L)
    public static SubLObject pph_check_type_if_non_null(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)pph_error.NIL;
        SubLObject pred = (SubLObject)pph_error.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list29);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_error.$list29);
        pred = current.first();
        current = current.rest();
        if (pph_error.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym30$PCASE_FEATURE, (SubLObject)ConsesLow.list((SubLObject)pph_error.$kw31$CYC_MAINT, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym13$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym38$NULL, v_object), (SubLObject)ConsesLow.list((SubLObject)pph_error.$sym39$PPH_CHECK_TYPE, v_object, pred))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_error.$list29);
        return (SubLObject)pph_error.NIL;
    }
    
    public static SubLObject declare_pph_error_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_trace", "PPH-TRACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_untrace", "PPH-UNTRACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_set_trace_level", "PPH-SET-TRACE-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_cinc_trace_level", "PPH-CINC-TRACE-LEVEL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_trace_level_exceeds_minimumP", "PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "pph_note", "PPH-NOTE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_sanity_checking_suspendedP", "PPH-SANITY-CHECKING-SUSPENDED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_break_on_errorP", "PPH-BREAK-ON-ERROR?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "with_pph_error_handling", "WITH-PPH-ERROR-HANDLING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "pph_error", "PPH-ERROR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "pph_handle_error", "PPH-HANDLE-ERROR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_error", "suppress_pph_warningsP", "SUPPRESS-PPH-WARNINGS?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "pph_warn", "PPH-WARN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "pph_check_type", "PPH-CHECK-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "pph_check_list_type", "PPH-CHECK-LIST-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_error", "pph_check_type_if_non_null", "PPH-CHECK-TYPE-IF-NON-NULL");
        return (SubLObject)pph_error.NIL;
    }
    
    public static SubLObject init_pph_error_file() {
        pph_error.$pph_min_trace_level$ = SubLFiles.defconstant("*PPH-MIN-TRACE-LEVEL*", (SubLObject)pph_error.ZERO_INTEGER);
        pph_error.$pph_trace_level$ = SubLFiles.defparameter("*PPH-TRACE-LEVEL*", pph_error.$pph_min_trace_level$.getGlobalValue());
        pph_error.$suspend_pph_sanity_checkingP$ = SubLFiles.defparameter("*SUSPEND-PPH-SANITY-CHECKING?*", (SubLObject)pph_error.T);
        pph_error.$pph_break_on_errorP$ = SubLFiles.defparameter("*PPH-BREAK-ON-ERROR?*", (SubLObject)pph_error.NIL);
        pph_error.$pph_error_handling_onP$ = SubLFiles.defparameter("*PPH-ERROR-HANDLING-ON?*", (SubLObject)pph_error.NIL);
        pph_error.$suspend_pph_type_checkingP$ = SubLFiles.defparameter("*SUSPEND-PPH-TYPE-CHECKING?*", (SubLObject)pph_error.T);
        return (SubLObject)pph_error.NIL;
    }
    
    public static SubLObject setup_pph_error_file() {
        access_macros.register_macro_helper((SubLObject)pph_error.$sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, (SubLObject)pph_error.$list1);
        access_macros.register_macro_helper((SubLObject)pph_error.$sym23$PPH_HANDLE_ERROR, (SubLObject)pph_error.$sym25$PPH_ERROR);
        return (SubLObject)pph_error.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_pph_error_file();
    }
    
    @Override
	public void initializeVariables() {
        init_pph_error_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_pph_error_file();
    }
    
    static {
        me = (SubLFile)new pph_error();
        pph_error.$pph_min_trace_level$ = null;
        pph_error.$pph_trace_level$ = null;
        pph_error.$suspend_pph_sanity_checkingP$ = null;
        pph_error.$pph_break_on_errorP$ = null;
        pph_error.$pph_error_handling_onP$ = null;
        pph_error.$suspend_pph_type_checkingP$ = null;
        $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_ = SubLObjectFactory.makeSymbol("PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-NOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-WARN"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-ERROR"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym3$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym4$FORCE_FORMAT = SubLObjectFactory.makeSymbol("FORCE-FORMAT");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym6$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONTINUE-CERROR?*"), (SubLObject)pph_error.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-ERROR-HANDLING-ON?*"), (SubLObject)pph_error.T));
        $sym8$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-BREAK-ON-ERROR?"));
        $sym10$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym11$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym12$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym13$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPRESS-PPH-WARNINGS?"));
        $sym15$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym16$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $sym17$TRUNCATE_PPH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("TRUNCATE-PPH-ERROR-MESSAGE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("~% Top-level CycL: ~S"));
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-TOP-LEVEL-CYCL")));
        $sym20$NEW_FORMAT_STRING = SubLObjectFactory.makeUninternedSymbol("NEW-FORMAT-STRING");
        $sym21$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $str22$_PPH_error_level__S___a = SubLObjectFactory.makeString("(PPH error level ~S) ~a");
        $sym23$PPH_HANDLE_ERROR = SubLObjectFactory.makeSymbol("PPH-HANDLE-ERROR");
        $sym24$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym25$PPH_ERROR = SubLObjectFactory.makeSymbol("PPH-ERROR");
        $sym26$CERROR = SubLObjectFactory.makeSymbol("CERROR");
        $str27$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)SubLObjectFactory.makeSymbol("*ERROR-OUTPUT*")));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym30$PCASE_FEATURE = SubLObjectFactory.makeSymbol("PCASE-FEATURE");
        $kw31$CYC_MAINT = SubLObjectFactory.makeKeyword("CYC-MAINT");
        $sym32$COR = SubLObjectFactory.makeSymbol("COR");
        $sym33$_SUSPEND_PPH_TYPE_CHECKING__ = SubLObjectFactory.makeSymbol("*SUSPEND-PPH-TYPE-CHECKING?*");
        $str34$_S_is_not_a__S = SubLObjectFactory.makeString("~S is not a ~S");
        $sym35$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym36$LIST_OF_TYPE_P = SubLObjectFactory.makeSymbol("LIST-OF-TYPE-P");
        $str37$_S_is_not_a_list_of__S = SubLObjectFactory.makeString("~S is not a list of ~S");
        $sym38$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym39$PPH_CHECK_TYPE = SubLObjectFactory.makeSymbol("PPH-CHECK-TYPE");
    }
}

/*

	Total time: 103 ms
	
*/