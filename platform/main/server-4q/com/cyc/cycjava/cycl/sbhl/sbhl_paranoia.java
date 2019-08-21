package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.control_vars.$within_unassert$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_paranoia extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_paranoia();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_paranoia";

    public static final String myFingerPrint = "1c2887e485e89adabb89fd63bc42617b4d93e6ab91163cf7d22eae5da609a56d";

    // defparameter
    // Definitions
    /**
     * Parameter that governs whether we perform work within @see sbhl-check-type
     */
    public static final SubLSymbol $sbhl_object_type_checking_p$ = makeSymbol("*SBHL-OBJECT-TYPE-CHECKING-P*");







    // defparameter
    // controls very expensive sbhl testing
    public static final SubLSymbol $sbhl_test_maxP$ = makeSymbol("*SBHL-TEST-MAX?*");

    // defparameter
    // controls very expensive sbhl tracing
    public static final SubLSymbol $sbhl_trace_maxP$ = makeSymbol("*SBHL-TRACE-MAX?*");

    // defparameter
    // suppress retyping of forts iff this is non-nil
    public static final SubLSymbol $suppress_sbhl_recachingP$ = makeSymbol("*SUPPRESS-SBHL-RECACHING?*");

    // defparameter
    /**
     * suppress use of fort types, and call the SBHL instead. This should be set to
     * NIL during fort types initialization.
     */
    public static final SubLSymbol $suspend_sbhl_cache_useP$ = makeSymbol("*SUSPEND-SBHL-CACHE-USE?*");



    public static final SubLList $list1 = list(list(makeSymbol("*SBHL-OBJECT-TYPE-CHECKING-P*"), NIL));



    public static final SubLList $list3 = list(makeSymbol("OBJECT"), makeSymbol("TYPE-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), ONE_INTEGER));



    public static final SubLList $list5 = list(makeSymbol("SBHL-OBJECT-TYPE-CHECKING-P"));





    public static final SubLSymbol $sbhl_type_error_action$ = makeSymbol("*SBHL-TYPE-ERROR-ACTION*");

    public static final SubLSymbol SBHL_ERROR = makeSymbol("SBHL-ERROR");

    public static final SubLString $str10$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLSymbol SBHL_CERROR = makeSymbol("SBHL-CERROR");

    public static final SubLString $$$continue_anyway = makeString("continue anyway");







    public static final SubLList $list18 = list(makeSymbol("WARN"), makeString("~A is not a valid *sbhl-type-error-action* value"), makeSymbol("*SBHL-TYPE-ERROR-ACTION*"));



    public static final SubLSymbol SBHL_CHECK_TYPE = makeSymbol("SBHL-CHECK-TYPE");





    public static final SubLList $list23 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym24$__ = makeSymbol(">=");

    public static final SubLSymbol $sbhl_trace_level$ = makeSymbol("*SBHL-TRACE-LEVEL*");

    public static final SubLSymbol $sbhl_test_level$ = makeSymbol("*SBHL-TEST-LEVEL*");

    public static final SubLSymbol $sym27$_SBHL_TEST_MAX__ = makeSymbol("*SBHL-TEST-MAX?*");

    public static final SubLSymbol $sym28$_SBHL_TRACE_MAX__ = makeSymbol("*SBHL-TRACE-MAX?*");

    public static final SubLList $list29 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), T));

    public static final SubLList $list30 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), NIL));

    public static SubLObject sbhl_object_type_checking_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $sbhl_object_type_checking_p$.getDynamicValue(thread)) || (NIL == suspend_sbhl_type_checkingP()));
    }

    public static SubLObject without_sbhl_object_type_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    public static SubLObject sbhl_check_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject type_test = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        type_test = current.first();
        current = current.rest();
        final SubLObject level = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list3);
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, $list5, list(PUNLESS, list(type_test, v_object), list(PCASE, $sbhl_type_error_action$, list($ERROR, list(SBHL_ERROR, level, $str10$_A_is_not_a__A, v_object, list(QUOTE, type_test))), list($CERROR, list(SBHL_CERROR, level, $$$continue_anyway, $str10$_A_is_not_a__A, v_object, list(QUOTE, type_test))), list($WARN, list(WARN, $str10$_A_is_not_a__A, v_object, list(QUOTE, type_test))), list(OTHERWISE, $list18, list(CERROR, $$$continue_anyway, $str10$_A_is_not_a__A, v_object, list(QUOTE, type_test))))));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject sbhl_check_type_if_present(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject type_test = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        type_test = current.first();
        current = current.rest();
        final SubLObject level = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list3);
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, v_object, list(SBHL_CHECK_TYPE, v_object, type_test, level));
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject sbhl_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(level) : "Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) " + level;
        assert NIL != stringp(format_str) : "Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) " + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject sbhl_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(level) : "Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) " + level;
        assert NIL != stringp(format_str) : "Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) " + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject sbhl_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(level) : "Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) " + level;
        assert NIL != stringp(continue_str) : "Types.stringp(continue_str) " + "CommonSymbols.NIL != Types.stringp(continue_str) " + continue_str;
        assert NIL != stringp(format_str) : "Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) " + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject sbhl_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(level) : "Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) " + level;
        assert NIL != stringp(format_str) : "Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) " + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject suspend_sbhl_type_checkingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != system_parameters.$suspend_sbhl_type_checkingP$.getDynamicValue(thread))) || (NIL != hl_macros.some_fort_being_removedP())) || (NIL != $within_unassert$.getDynamicValue(thread)));
    }

    public static SubLObject sbhl_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym24$__, $sbhl_trace_level$, level), append(body, NIL));
    }

    public static SubLObject sbhl_test(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        level = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(PWHEN, list($sym24$__, $sbhl_test_level$, level), append(body, NIL));
    }

    public static SubLObject sbhl_test_max(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PWHEN, $sym27$_SBHL_TEST_MAX__, append(body, NIL));
    }

    public static SubLObject sbhl_trace_max(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PWHEN, $sym28$_SBHL_TRACE_MAX__, append(body, NIL));
    }

    public static SubLObject check_sbhl_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == $suspend_sbhl_cache_useP$.getDynamicValue(thread)) && (NIL == sbhl_search_vars.$sbhl_justification_search_p$.getDynamicValue(thread))) && (NIL != sbhl_cache.sbhl_caches_initialized_p()));
    }

    public static SubLObject without_sbhl_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list29, append(body, NIL));
    }

    public static SubLObject with_sbhl_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list30, append(body, NIL));
    }

    public static SubLObject declare_sbhl_paranoia_file() {
        declareFunction(me, "sbhl_object_type_checking_p", "SBHL-OBJECT-TYPE-CHECKING-P", 0, 0, false);
        declareMacro(me, "without_sbhl_object_type_checking", "WITHOUT-SBHL-OBJECT-TYPE-CHECKING");
        declareMacro(me, "sbhl_check_type", "SBHL-CHECK-TYPE");
        declareMacro(me, "sbhl_check_type_if_present", "SBHL-CHECK-TYPE-IF-PRESENT");
        declareFunction(me, "sbhl_note", "SBHL-NOTE", 2, 5, false);
        declareFunction(me, "sbhl_error", "SBHL-ERROR", 2, 5, false);
        declareFunction(me, "sbhl_cerror", "SBHL-CERROR", 3, 5, false);
        declareFunction(me, "sbhl_warn", "SBHL-WARN", 2, 5, false);
        declareFunction(me, "suspend_sbhl_type_checkingP", "SUSPEND-SBHL-TYPE-CHECKING?", 0, 0, false);
        declareMacro(me, "sbhl_trace", "SBHL-TRACE");
        declareMacro(me, "sbhl_test", "SBHL-TEST");
        declareMacro(me, "sbhl_test_max", "SBHL-TEST-MAX");
        declareMacro(me, "sbhl_trace_max", "SBHL-TRACE-MAX");
        declareFunction(me, "check_sbhl_cachesP", "CHECK-SBHL-CACHES?", 0, 0, false);
        declareMacro(me, "without_sbhl_caches", "WITHOUT-SBHL-CACHES");
        declareMacro(me, "with_sbhl_caches", "WITH-SBHL-CACHES");
        return NIL;
    }

    public static SubLObject init_sbhl_paranoia_file() {
        defparameter("*SBHL-OBJECT-TYPE-CHECKING-P*", T);
        defparameter("*SBHL-TYPE-ERROR-ACTION*", $ERROR);
        defparameter("*SBHL-TRACE-LEVEL*", ONE_INTEGER);
        defparameter("*SBHL-TEST-LEVEL*", THREE_INTEGER);
        defparameter("*SBHL-TEST-MAX?*", NIL);
        defparameter("*SBHL-TRACE-MAX?*", NIL);
        defparameter("*SUPPRESS-SBHL-RECACHING?*", NIL);
        defparameter("*SUSPEND-SBHL-CACHE-USE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_paranoia_file() {
        return NIL;
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








































    }
}

/**
 * Total time: 79 ms
 */
