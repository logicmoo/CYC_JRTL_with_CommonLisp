package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_paranoia extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_paranoia";
    public static final String myFingerPrint = "1c2887e485e89adabb89fd63bc42617b4d93e6ab91163cf7d22eae5da609a56d";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 776L)
    public static SubLSymbol $sbhl_object_type_checking_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 1468L)
    public static SubLSymbol $sbhl_type_error_action$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 2464L)
    public static SubLSymbol $sbhl_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5121L)
    public static SubLSymbol $sbhl_test_level$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5419L)
    public static SubLSymbol $sbhl_test_maxP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5645L)
    public static SubLSymbol $sbhl_trace_maxP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5875L)
    public static SubLSymbol $suppress_sbhl_recachingP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 6100L)
    public static SubLSymbol $suspend_sbhl_cache_useP$;
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ERROR;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$PWHEN;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PUNLESS;
    private static final SubLSymbol $sym7$PCASE;
    private static final SubLSymbol $sym8$_SBHL_TYPE_ERROR_ACTION_;
    private static final SubLSymbol $sym9$SBHL_ERROR;
    private static final SubLString $str10$_A_is_not_a__A;
    private static final SubLSymbol $sym11$QUOTE;
    private static final SubLSymbol $kw12$CERROR;
    private static final SubLSymbol $sym13$SBHL_CERROR;
    private static final SubLString $str14$continue_anyway;
    private static final SubLSymbol $kw15$WARN;
    private static final SubLSymbol $sym16$WARN;
    private static final SubLSymbol $sym17$OTHERWISE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$CERROR;
    private static final SubLSymbol $sym20$SBHL_CHECK_TYPE;
    private static final SubLSymbol $sym21$INTEGERP;
    private static final SubLSymbol $sym22$STRINGP;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$__;
    private static final SubLSymbol $sym25$_SBHL_TRACE_LEVEL_;
    private static final SubLSymbol $sym26$_SBHL_TEST_LEVEL_;
    private static final SubLSymbol $sym27$_SBHL_TEST_MAX__;
    private static final SubLSymbol $sym28$_SBHL_TRACE_MAX__;
    private static final SubLList $list29;
    private static final SubLList $list30;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 1002L)
    public static SubLObject sbhl_object_type_checking_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_paranoia.NIL != sbhl_paranoia.$sbhl_object_type_checking_p$.getDynamicValue(thread) || sbhl_paranoia.NIL == suspend_sbhl_type_checkingP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 1214L)
    public static SubLObject without_sbhl_object_type_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym0$CLET, (SubLObject)sbhl_paranoia.$list1, ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 1568L)
    public static SubLObject sbhl_check_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)sbhl_paranoia.NIL;
        SubLObject type_test = (SubLObject)sbhl_paranoia.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_paranoia.$list3);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_paranoia.$list3);
        type_test = current.first();
        current = current.rest();
        final SubLObject level = (SubLObject)(current.isCons() ? current.first() : sbhl_paranoia.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_paranoia.$list3);
        current = current.rest();
        if (sbhl_paranoia.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym4$PWHEN, (SubLObject)sbhl_paranoia.$list5, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym6$PUNLESS, (SubLObject)ConsesLow.list(type_test, v_object), (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym7$PCASE, (SubLObject)sbhl_paranoia.$sym8$_SBHL_TYPE_ERROR_ACTION_, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$kw2$ERROR, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym9$SBHL_ERROR, level, (SubLObject)sbhl_paranoia.$str10$_A_is_not_a__A, v_object, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym11$QUOTE, type_test))), (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$kw12$CERROR, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym13$SBHL_CERROR, level, (SubLObject)sbhl_paranoia.$str14$continue_anyway, (SubLObject)sbhl_paranoia.$str10$_A_is_not_a__A, v_object, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym11$QUOTE, type_test))), (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$kw15$WARN, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym16$WARN, (SubLObject)sbhl_paranoia.$str10$_A_is_not_a__A, v_object, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym11$QUOTE, type_test))), (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym17$OTHERWISE, (SubLObject)sbhl_paranoia.$list18, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym19$CERROR, (SubLObject)sbhl_paranoia.$str14$continue_anyway, (SubLObject)sbhl_paranoia.$str10$_A_is_not_a__A, v_object, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym11$QUOTE, type_test))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_paranoia.$list3);
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 2304L)
    public static SubLObject sbhl_check_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)sbhl_paranoia.NIL;
        SubLObject type_test = (SubLObject)sbhl_paranoia.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_paranoia.$list3);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_paranoia.$list3);
        type_test = current.first();
        current = current.rest();
        final SubLObject level = (SubLObject)(current.isCons() ? current.first() : sbhl_paranoia.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_paranoia.$list3);
        current = current.rest();
        if (sbhl_paranoia.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym4$PWHEN, v_object, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym20$SBHL_CHECK_TYPE, v_object, type_test, level));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_paranoia.$list3);
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 2763L)
    public static SubLObject sbhl_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == sbhl_paranoia.UNPROVIDED) {
            arg1 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg2 == sbhl_paranoia.UNPROVIDED) {
            arg2 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg3 == sbhl_paranoia.UNPROVIDED) {
            arg3 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg4 == sbhl_paranoia.UNPROVIDED) {
            arg4 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg5 == sbhl_paranoia.UNPROVIDED) {
            arg5 = (SubLObject)sbhl_paranoia.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_paranoia.NIL != Types.integerp(level) : level;
        assert sbhl_paranoia.NIL != Types.stringp(format_str) : format_str;
        if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            PrintLow.format((SubLObject)sbhl_paranoia.T, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)sbhl_paranoia.NIL;
        }
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 3075L)
    public static SubLObject sbhl_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == sbhl_paranoia.UNPROVIDED) {
            arg1 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg2 == sbhl_paranoia.UNPROVIDED) {
            arg2 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg3 == sbhl_paranoia.UNPROVIDED) {
            arg3 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg4 == sbhl_paranoia.UNPROVIDED) {
            arg4 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg5 == sbhl_paranoia.UNPROVIDED) {
            arg5 = (SubLObject)sbhl_paranoia.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_paranoia.NIL != Types.integerp(level) : level;
        assert sbhl_paranoia.NIL != Types.stringp(format_str) : format_str;
        if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror((SubLObject)sbhl_paranoia.$str14$continue_anyway, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)sbhl_paranoia.TWO_INTEGER, sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 3614L)
    public static SubLObject sbhl_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == sbhl_paranoia.UNPROVIDED) {
            arg1 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg2 == sbhl_paranoia.UNPROVIDED) {
            arg2 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg3 == sbhl_paranoia.UNPROVIDED) {
            arg3 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg4 == sbhl_paranoia.UNPROVIDED) {
            arg4 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg5 == sbhl_paranoia.UNPROVIDED) {
            arg5 = (SubLObject)sbhl_paranoia.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_paranoia.NIL != Types.integerp(level) : level;
        assert sbhl_paranoia.NIL != Types.stringp(continue_str) : continue_str;
        assert sbhl_paranoia.NIL != Types.stringp(format_str) : format_str;
        if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        else if (Numbers.add((SubLObject)sbhl_paranoia.TWO_INTEGER, sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
            Errors.warn(format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
        }
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 4215L)
    public static SubLObject sbhl_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == sbhl_paranoia.UNPROVIDED) {
            arg1 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg2 == sbhl_paranoia.UNPROVIDED) {
            arg2 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg3 == sbhl_paranoia.UNPROVIDED) {
            arg3 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg4 == sbhl_paranoia.UNPROVIDED) {
            arg4 = (SubLObject)sbhl_paranoia.NIL;
        }
        if (arg5 == sbhl_paranoia.UNPROVIDED) {
            arg5 = (SubLObject)sbhl_paranoia.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_paranoia.NIL != Types.integerp(level) : level;
        assert sbhl_paranoia.NIL != Types.stringp(format_str) : format_str;
        if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Functions.apply((SubLObject)sbhl_paranoia.$sym16$WARN, format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5 });
            return (SubLObject)sbhl_paranoia.NIL;
        }
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 4565L)
    public static SubLObject suspend_sbhl_type_checkingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_paranoia.NIL != Types.$suspend_type_checkingP$.getDynamicValue(thread) || sbhl_paranoia.NIL != system_parameters.$suspend_sbhl_type_checkingP$.getDynamicValue(thread) || sbhl_paranoia.NIL != hl_macros.some_fort_being_removedP() || sbhl_paranoia.NIL != control_vars.$within_unassert$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 4871L)
    public static SubLObject sbhl_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)sbhl_paranoia.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_paranoia.$list23);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym24$__, (SubLObject)sbhl_paranoia.$sym25$_SBHL_TRACE_LEVEL_, level), ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5239L)
    public static SubLObject sbhl_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = (SubLObject)sbhl_paranoia.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_paranoia.$list23);
        level = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym4$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sbhl_paranoia.$sym24$__, (SubLObject)sbhl_paranoia.$sym26$_SBHL_TEST_LEVEL_, level), ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5505L)
    public static SubLObject sbhl_test_max(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym4$PWHEN, (SubLObject)sbhl_paranoia.$sym27$_SBHL_TEST_MAX__, ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 5732L)
    public static SubLObject sbhl_trace_max(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym4$PWHEN, (SubLObject)sbhl_paranoia.$sym28$_SBHL_TRACE_MAX__, ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 6358L)
    public static SubLObject check_sbhl_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_paranoia.NIL == sbhl_paranoia.$suspend_sbhl_cache_useP$.getDynamicValue(thread) && sbhl_paranoia.NIL == sbhl_search_vars.$sbhl_justification_search_p$.getDynamicValue(thread) && sbhl_paranoia.NIL != sbhl_cache.sbhl_caches_initialized_p());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 6654L)
    public static SubLObject without_sbhl_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym0$CLET, (SubLObject)sbhl_paranoia.$list29, ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-paranoia.lisp", position = 6815L)
    public static SubLObject with_sbhl_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_paranoia.$sym0$CLET, (SubLObject)sbhl_paranoia.$list30, ConsesLow.append(body, (SubLObject)sbhl_paranoia.NIL));
    }
    
    public static SubLObject declare_sbhl_paranoia_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_object_type_checking_p", "SBHL-OBJECT-TYPE-CHECKING-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "without_sbhl_object_type_checking", "WITHOUT-SBHL-OBJECT-TYPE-CHECKING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_check_type", "SBHL-CHECK-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_check_type_if_present", "SBHL-CHECK-TYPE-IF-PRESENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_note", "SBHL-NOTE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_error", "SBHL-ERROR", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_cerror", "SBHL-CERROR", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_warn", "SBHL-WARN", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "suspend_sbhl_type_checkingP", "SUSPEND-SBHL-TYPE-CHECKING?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_trace", "SBHL-TRACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_test", "SBHL-TEST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_test_max", "SBHL-TEST-MAX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "sbhl_trace_max", "SBHL-TRACE-MAX");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "check_sbhl_cachesP", "CHECK-SBHL-CACHES?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "without_sbhl_caches", "WITHOUT-SBHL-CACHES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_paranoia", "with_sbhl_caches", "WITH-SBHL-CACHES");
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    public static SubLObject init_sbhl_paranoia_file() {
        sbhl_paranoia.$sbhl_object_type_checking_p$ = SubLFiles.defparameter("*SBHL-OBJECT-TYPE-CHECKING-P*", (SubLObject)sbhl_paranoia.T);
        sbhl_paranoia.$sbhl_type_error_action$ = SubLFiles.defparameter("*SBHL-TYPE-ERROR-ACTION*", (SubLObject)sbhl_paranoia.$kw2$ERROR);
        sbhl_paranoia.$sbhl_trace_level$ = SubLFiles.defparameter("*SBHL-TRACE-LEVEL*", (SubLObject)sbhl_paranoia.ONE_INTEGER);
        sbhl_paranoia.$sbhl_test_level$ = SubLFiles.defparameter("*SBHL-TEST-LEVEL*", (SubLObject)sbhl_paranoia.THREE_INTEGER);
        sbhl_paranoia.$sbhl_test_maxP$ = SubLFiles.defparameter("*SBHL-TEST-MAX?*", (SubLObject)sbhl_paranoia.NIL);
        sbhl_paranoia.$sbhl_trace_maxP$ = SubLFiles.defparameter("*SBHL-TRACE-MAX?*", (SubLObject)sbhl_paranoia.NIL);
        sbhl_paranoia.$suppress_sbhl_recachingP$ = SubLFiles.defparameter("*SUPPRESS-SBHL-RECACHING?*", (SubLObject)sbhl_paranoia.NIL);
        sbhl_paranoia.$suspend_sbhl_cache_useP$ = SubLFiles.defparameter("*SUSPEND-SBHL-CACHE-USE?*", (SubLObject)sbhl_paranoia.NIL);
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    public static SubLObject setup_sbhl_paranoia_file() {
        return (SubLObject)sbhl_paranoia.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_paranoia_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_paranoia_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_paranoia_file();
    }
    
    static {
        me = (SubLFile)new sbhl_paranoia();
        sbhl_paranoia.$sbhl_object_type_checking_p$ = null;
        sbhl_paranoia.$sbhl_type_error_action$ = null;
        sbhl_paranoia.$sbhl_trace_level$ = null;
        sbhl_paranoia.$sbhl_test_level$ = null;
        sbhl_paranoia.$sbhl_test_maxP$ = null;
        sbhl_paranoia.$sbhl_trace_maxP$ = null;
        sbhl_paranoia.$suppress_sbhl_recachingP$ = null;
        sbhl_paranoia.$suspend_sbhl_cache_useP$ = null;
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-OBJECT-TYPE-CHECKING-P*"), (SubLObject)sbhl_paranoia.NIL));
        $kw2$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)sbhl_paranoia.ONE_INTEGER));
        $sym4$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-OBJECT-TYPE-CHECKING-P"));
        $sym6$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym7$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym8$_SBHL_TYPE_ERROR_ACTION_ = SubLObjectFactory.makeSymbol("*SBHL-TYPE-ERROR-ACTION*");
        $sym9$SBHL_ERROR = SubLObjectFactory.makeSymbol("SBHL-ERROR");
        $str10$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym11$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw12$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $sym13$SBHL_CERROR = SubLObjectFactory.makeSymbol("SBHL-CERROR");
        $str14$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw15$WARN = SubLObjectFactory.makeKeyword("WARN");
        $sym16$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym17$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WARN"), (SubLObject)SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TYPE-ERROR-ACTION*"));
        $sym19$CERROR = SubLObjectFactory.makeSymbol("CERROR");
        $sym20$SBHL_CHECK_TYPE = SubLObjectFactory.makeSymbol("SBHL-CHECK-TYPE");
        $sym21$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym22$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym24$__ = SubLObjectFactory.makeSymbol(">=");
        $sym25$_SBHL_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*SBHL-TRACE-LEVEL*");
        $sym26$_SBHL_TEST_LEVEL_ = SubLObjectFactory.makeSymbol("*SBHL-TEST-LEVEL*");
        $sym27$_SBHL_TEST_MAX__ = SubLObjectFactory.makeSymbol("*SBHL-TEST-MAX?*");
        $sym28$_SBHL_TRACE_MAX__ = SubLObjectFactory.makeSymbol("*SBHL-TRACE-MAX?*");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), (SubLObject)sbhl_paranoia.T));
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), (SubLObject)sbhl_paranoia.NIL));
    }
}

/*

	Total time: 79 ms
	
*/