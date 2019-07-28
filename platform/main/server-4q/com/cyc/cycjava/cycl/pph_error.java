package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_error;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.pph_error.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_error extends SubLTranslatedFile {
    public static final SubLFile me = new pph_error();

    public static final String myName = "com.cyc.cycjava.cycl.pph_error";

    public static final String myFingerPrint = "16eb1103062a03c558dbb77732f8de27e56c51079829716e0ca9e03e441c4d25";

    // defconstant
    private static final SubLSymbol $pph_min_trace_level$ = makeSymbol("*PPH-MIN-TRACE-LEVEL*");

    // defparameter
    public static final SubLSymbol $pph_trace_level$ = makeSymbol("*PPH-TRACE-LEVEL*");

    // defparameter
    public static final SubLSymbol $suspend_pph_sanity_checkingP$ = makeSymbol("*SUSPEND-PPH-SANITY-CHECKING?*");

    // defparameter
    // Should PPH-ERROR calls result in breaks?
    public static final SubLSymbol $pph_break_on_errorP$ = makeSymbol("*PPH-BREAK-ON-ERROR?*");

    // defparameter
    public static final SubLSymbol $pph_error_handling_onP$ = makeSymbol("*PPH-ERROR-HANDLING-ON?*");

    // defparameter
    public static final SubLSymbol $suspend_pph_type_checkingP$ = makeSymbol("*SUSPEND-PPH-TYPE-CHECKING?*");

    // Internal Constants
    public static final SubLSymbol $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_ = makeSymbol("PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?");

    public static final SubLList $list1 = list(makeSymbol("PPH-NOTE"), makeSymbol("PPH-WARN"), makeSymbol("PPH-ERROR"));

    public static final SubLList $list2 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLSymbol FORCE_FORMAT = makeSymbol("FORCE-FORMAT");

    public static final SubLList $list5 = list(list(makeSymbol("ERROR-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list7 = list(list(makeSymbol("*CONTINUE-CERROR?*"), NIL), list(makeSymbol("*PPH-ERROR-HANDLING-ON?*"), T));



    public static final SubLList $list9 = list(makeSymbol("PPH-BREAK-ON-ERROR?"));









    private static final SubLList $list14 = list(makeSymbol("SUPPRESS-PPH-WARNINGS?"));





    private static final SubLSymbol TRUNCATE_PPH_ERROR_MESSAGE = makeSymbol("TRUNCATE-PPH-ERROR-MESSAGE");

    private static final SubLList $list18 = list(makeString("~% Top-level CycL: ~S"));

    private static final SubLList $list19 = list(list(makeSymbol("PPH-TOP-LEVEL-CYCL")));

    private static final SubLSymbol $sym20$NEW_FORMAT_STRING = makeUninternedSymbol("NEW-FORMAT-STRING");



    private static final SubLString $str22$_PPH_error_level__S___a = makeString("(PPH error level ~S) ~a");

    private static final SubLSymbol PPH_HANDLE_ERROR = makeSymbol("PPH-HANDLE-ERROR");



    private static final SubLSymbol PPH_ERROR = makeSymbol("PPH-ERROR");



    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLList $list28 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*ERROR-OUTPUT*")));

    private static final SubLList $list29 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    private static final SubLSymbol PCASE_FEATURE = makeSymbol("PCASE-FEATURE");





    private static final SubLSymbol $sym33$_SUSPEND_PPH_TYPE_CHECKING__ = makeSymbol("*SUSPEND-PPH-TYPE-CHECKING?*");

    private static final SubLString $str34$_S_is_not_a__S = makeString("~S is not a ~S");



    private static final SubLSymbol LIST_OF_TYPE_P = makeSymbol("LIST-OF-TYPE-P");

    private static final SubLString $str37$_S_is_not_a_list_of__S = makeString("~S is not a list of ~S");



    private static final SubLSymbol PPH_CHECK_TYPE = makeSymbol("PPH-CHECK-TYPE");

    public static SubLObject pph_trace(SubLObject level) {
        if (level == UNPROVIDED) {
            level = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != level) {
            pph_set_trace_level(level);
        } else {
            pph_cinc_trace_level();
        }
        return $pph_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject pph_untrace() {
        return pph_set_trace_level($pph_min_trace_level$.getGlobalValue());
    }

    public static SubLObject pph_set_trace_level(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!level.isInteger()) {
            return $pph_trace_level$.getDynamicValue(thread);
        }
        if (level.numL($pph_min_trace_level$.getGlobalValue())) {
            $pph_trace_level$.setDynamicValue($pph_min_trace_level$.getGlobalValue(), thread);
        } else {
            $pph_trace_level$.setDynamicValue(level, thread);
        }
        return $pph_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject pph_cinc_trace_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $pph_trace_level$.setDynamicValue(add($pph_trace_level$.getDynamicValue(thread), ONE_INTEGER), thread);
        return $pph_trace_level$.getDynamicValue(thread);
    }

    public static SubLObject pph_trace_level_exceeds_minimumP(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recursion_depth = (pph_vars.current_generation_level().isPositive()) ? number_utilities.f_1_(pph_vars.current_generation_level()) : ZERO_INTEGER;
        final SubLObject adjusted_trace_level = subtract($pph_trace_level$.getDynamicValue(thread), recursion_depth);
        final SubLObject exceedsP = numGE(adjusted_trace_level, level);
        return exceedsP;
    }

    public static SubLObject pph_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, list($sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), listS(FORCE_FORMAT, T, format_str, append(args, NIL)));
    }

    public static SubLObject pph_sanity_checking_suspendedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($suspend_pph_sanity_checkingP$.getDynamicValue(thread));
    }

    public static SubLObject pph_break_on_errorP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_break_on_errorP$.getDynamicValue(thread);
    }

    public static SubLObject with_pph_error_handling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject error_message = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        error_message = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, $list7, list(PIF, $list9, bq_cons(PROGN, append(body, NIL)), list(PROGN, listS(CATCH_ERROR_MESSAGE, list(error_message), append(body, NIL)), list(PWHEN, list(STRINGP, error_message), list(PUNLESS, $list14, listS(WARN, listS(CCONCATENATE, list(TRUNCATE_PPH_ERROR_MESSAGE, error_message), $list18), $list19))))));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static SubLObject pph_error(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        final SubLObject new_format_string = $sym20$NEW_FORMAT_STRING;
        return list(CLET, list(list(new_format_string, list(FORMAT_NIL, $str22$_PPH_error_level__S___a, level, format_str))), list(PPH_HANDLE_ERROR, new_format_string, bq_cons(LIST, append(args, NIL))));
    }

    public static SubLObject pph_handle_error(final SubLObject format_string, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $pph_error_handling_onP$.getDynamicValue(thread)) {
            apply(CERROR, listS($$$continue_anyway, format_string, args));
        } else
            if (NIL == suppress_pph_warningsP()) {
                apply(WARN, bq_cons(format_string, args));
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }

        return $pph_error_handling_onP$.getDynamicValue(thread);
    }

    public static SubLObject suppress_pph_warningsP() {
        return T;
    }

    public static SubLObject pph_warn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return list(PWHEN, list($sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), listS(PUNLESS, $list14, listS(WARN, format_str, append(args, NIL)), $list28));
    }

    public static SubLObject pph_check_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(COR, $sym33$_SUSPEND_PPH_TYPE_CHECKING__, list(pred, v_object)), list(PPH_ERROR, ONE_INTEGER, list(FORMAT_NIL, $str34$_S_is_not_a__S, v_object, list(QUOTE, pred))))));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static SubLObject pph_check_list_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(COR, $sym33$_SUSPEND_PPH_TYPE_CHECKING__, list(LIST_OF_TYPE_P, list(QUOTE, pred), v_object)), list(PPH_ERROR, ONE_INTEGER, list(FORMAT_NIL, $str37$_S_is_not_a_list_of__S, v_object, list(QUOTE, pred))))));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static SubLObject pph_check_type_if_non_null(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        v_object = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(NULL, v_object), list(PPH_CHECK_TYPE, v_object, pred))));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static SubLObject declare_pph_error_file() {
        declareFunction(me, "pph_trace", "PPH-TRACE", 0, 1, false);
        declareFunction(me, "pph_untrace", "PPH-UNTRACE", 0, 0, false);
        declareFunction(me, "pph_set_trace_level", "PPH-SET-TRACE-LEVEL", 1, 0, false);
        declareFunction(me, "pph_cinc_trace_level", "PPH-CINC-TRACE-LEVEL", 0, 0, false);
        declareFunction(me, "pph_trace_level_exceeds_minimumP", "PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?", 1, 0, false);
        declareMacro(me, "pph_note", "PPH-NOTE");
        declareFunction(me, "pph_sanity_checking_suspendedP", "PPH-SANITY-CHECKING-SUSPENDED?", 0, 0, false);
        declareFunction(me, "pph_break_on_errorP", "PPH-BREAK-ON-ERROR?", 0, 0, false);
        declareMacro(me, "with_pph_error_handling", "WITH-PPH-ERROR-HANDLING");
        declareMacro(me, "pph_error", "PPH-ERROR");
        declareFunction(me, "pph_handle_error", "PPH-HANDLE-ERROR", 2, 0, false);
        declareFunction(me, "suppress_pph_warningsP", "SUPPRESS-PPH-WARNINGS?", 0, 0, false);
        declareMacro(me, "pph_warn", "PPH-WARN");
        declareMacro(me, "pph_check_type", "PPH-CHECK-TYPE");
        declareMacro(me, "pph_check_list_type", "PPH-CHECK-LIST-TYPE");
        declareMacro(me, "pph_check_type_if_non_null", "PPH-CHECK-TYPE-IF-NON-NULL");
        return NIL;
    }

    public static SubLObject init_pph_error_file() {
        defconstant("*PPH-MIN-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*PPH-TRACE-LEVEL*", $pph_min_trace_level$.getGlobalValue());
        defparameter("*SUSPEND-PPH-SANITY-CHECKING?*", T);
        defparameter("*PPH-BREAK-ON-ERROR?*", NIL);
        defparameter("*PPH-ERROR-HANDLING-ON?*", NIL);
        defparameter("*SUSPEND-PPH-TYPE-CHECKING?*", T);
        return NIL;
    }

    public static SubLObject setup_pph_error_file() {
        register_macro_helper($sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, $list1);
        register_macro_helper(PPH_HANDLE_ERROR, PPH_ERROR);
        return NIL;
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















































    }
}

/**
 * Total time: 103 ms
 */
