/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class pph_error extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new pph_error();

 public static final String myName = "com.cyc.cycjava.cycl.pph_error";


    // defconstant
    // Definitions
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $pph_min_trace_level$ = makeSymbol("*PPH-MIN-TRACE-LEVEL*");

    // defparameter
    @LispMethod(comment = "A value from 0 to 3. 0 means no tracing. 3 is maximal tracing.\ndefparameter")
    public static final SubLSymbol $pph_trace_level$ = makeSymbol("*PPH-TRACE-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $suspend_pph_sanity_checkingP$ = makeSymbol("*SUSPEND-PPH-SANITY-CHECKING?*");

    // defparameter
    // Should PPH-ERROR calls result in breaks?
    /**
     * Should PPH-ERROR calls result in breaks?
     */
    @LispMethod(comment = "Should PPH-ERROR calls result in breaks?\ndefparameter")
    public static final SubLSymbol $pph_break_on_errorP$ = makeSymbol("*PPH-BREAK-ON-ERROR?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pph_error_handling_onP$ = makeSymbol("*PPH-ERROR-HANDLING-ON?*");



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_ = makeSymbol("PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?");

    static private final SubLList $list1 = list(makeSymbol("PPH-NOTE"), makeSymbol("PPH-WARN"), makeSymbol("PPH-ERROR"));

    static private final SubLList $list2 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol FORCE_FORMAT = makeSymbol("FORCE-FORMAT");

    static private final SubLList $list5 = list(list(makeSymbol("ERROR-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list7 = list(list(makeSymbol("*CONTINUE-CERROR?*"), NIL), list(makeSymbol("*PPH-ERROR-HANDLING-ON?*"), T));

    static private final SubLList $list9 = list(makeSymbol("PPH-BREAK-ON-ERROR?"));

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

    public static final SubLSymbol $suspend_pph_type_checkingP$ = makeSymbol("*SUSPEND-PPH-TYPE-CHECKING?*");

    private static final SubLString $str34$_S_is_not_a__S = makeString("~S is not a ~S");

    private static final SubLSymbol LIST_OF_TYPE_P = makeSymbol("LIST-OF-TYPE-P");

    private static final SubLString $str37$_S_is_not_a_list_of__S = makeString("~S is not a list of ~S");

    private static final SubLSymbol PPH_CHECK_TYPE = makeSymbol("PPH-CHECK-TYPE");

    public static final SubLObject pph_trace_alt(SubLObject level) {
        if (level == UNPROVIDED) {
            level = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != level) {
                com.cyc.cycjava.cycl.pph_error.pph_set_trace_level(level);
            } else {
                com.cyc.cycjava.cycl.pph_error.pph_cinc_trace_level();
            }
            return $pph_trace_level$.getDynamicValue(thread);
        }
    }

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

    public static final SubLObject pph_untrace_alt() {
        return com.cyc.cycjava.cycl.pph_error.pph_set_trace_level($pph_min_trace_level$.getGlobalValue());
    }

    public static SubLObject pph_untrace() {
        return pph_set_trace_level($pph_min_trace_level$.getGlobalValue());
    }

    public static final SubLObject pph_set_trace_level_alt(SubLObject level) {
        {
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

    public static final SubLObject pph_cinc_trace_level_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $pph_trace_level$.setDynamicValue(add($pph_trace_level$.getDynamicValue(thread), ONE_INTEGER), thread);
            return $pph_trace_level$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_cinc_trace_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $pph_trace_level$.setDynamicValue(add($pph_trace_level$.getDynamicValue(thread), ONE_INTEGER), thread);
        return $pph_trace_level$.getDynamicValue(thread);
    }

    public static final SubLObject pph_trace_level_exceeds_minimumP_alt(SubLObject level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject recursion_depth = (pph_vars.current_generation_level().isPositive()) ? ((SubLObject) (number_utilities.f_1_(pph_vars.current_generation_level()))) : ZERO_INTEGER;
                SubLObject adjusted_trace_level = subtract($pph_trace_level$.getDynamicValue(thread), recursion_depth);
                SubLObject exceedsP = numGE(adjusted_trace_level, level);
                return exceedsP;
            }
        }
    }

    public static SubLObject pph_trace_level_exceeds_minimumP(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject recursion_depth = (pph_vars.current_generation_level().isPositive()) ? number_utilities.f_1_(pph_vars.current_generation_level()) : ZERO_INTEGER;
        final SubLObject adjusted_trace_level = subtract($pph_trace_level$.getDynamicValue(thread), recursion_depth);
        final SubLObject exceedsP = numGE(adjusted_trace_level, level);
        return exceedsP;
    }

    /**
     * Report something not necessarily bad.
     */
    @LispMethod(comment = "Report something not necessarily bad.")
    public static final SubLObject pph_note_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, list($sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), listS(FORMAT, T, format_str, append(args, NIL)));
            }
        }
    }

    /**
     * Report something not necessarily bad.
     */
    @LispMethod(comment = "Report something not necessarily bad.")
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

    public static final SubLObject pph_sanity_checking_suspendedP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return list_utilities.sublisp_boolean($suspend_pph_sanity_checkingP$.getDynamicValue(thread));
        }
    }

    public static SubLObject pph_sanity_checking_suspendedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($suspend_pph_sanity_checkingP$.getDynamicValue(thread));
    }

    public static final SubLObject pph_break_on_errorP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $pph_break_on_errorP$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_break_on_errorP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $pph_break_on_errorP$.getDynamicValue(thread);
    }

    /**
     * Execute BODY with error handling parameterized by *PPH-BREAK-ON-ERRORS?*.
     * If NIL, error will be caught and their error messages stored in ERROR-MESSAGE.
     * If non-NIL, execution will halt immediately upon error, allowing debugging.
     */
    @LispMethod(comment = "Execute BODY with error handling parameterized by *PPH-BREAK-ON-ERRORS?*.\r\nIf NIL, error will be caught and their error messages stored in ERROR-MESSAGE.\r\nIf non-NIL, execution will halt immediately upon error, allowing debugging.\nExecute BODY with error handling parameterized by *PPH-BREAK-ON-ERRORS?*.\nIf NIL, error will be caught and their error messages stored in ERROR-MESSAGE.\nIf non-NIL, execution will halt immediately upon error, allowing debugging.")
    public static final SubLObject with_pph_error_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt5);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject error_message = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt5);
                    error_message = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CLET, $list_alt7, list(PIF, $list_alt9, bq_cons(PROGN, append(body, NIL)), list(PROGN, listS(CATCH_ERROR_MESSAGE, list(error_message), append(body, NIL)), list(PWHEN, list(STRINGP, error_message), list(PWHEN_FEATURE, $CYC_MAINT, list(WARN, error_message))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt5);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with error handling parameterized by *PPH-BREAK-ON-ERRORS?*.
     * If NIL, error will be caught and their error messages stored in ERROR-MESSAGE.
     * If non-NIL, execution will halt immediately upon error, allowing debugging.
     */
    @LispMethod(comment = "Execute BODY with error handling parameterized by *PPH-BREAK-ON-ERRORS?*.\r\nIf NIL, error will be caught and their error messages stored in ERROR-MESSAGE.\r\nIf non-NIL, execution will halt immediately upon error, allowing debugging.\nExecute BODY with error handling parameterized by *PPH-BREAK-ON-ERRORS?*.\nIf NIL, error will be caught and their error messages stored in ERROR-MESSAGE.\nIf non-NIL, execution will halt immediately upon error, allowing debugging.")
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

    /**
     * Report errors.
     */
    @LispMethod(comment = "Report errors.")
    public static final SubLObject pph_error_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                SubLObject new_format_string = $sym16$NEW_FORMAT_STRING;
                return list(CLET, list(list(new_format_string, list(FORMAT_NIL, $str_alt18$_PPH_error_level__S___a, level, format_str))), list(PPH_HANDLE_ERROR, new_format_string, bq_cons(LIST, append(args, NIL))));
            }
        }
    }

    /**
     * Report errors.
     */
    @LispMethod(comment = "Report errors.")
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

    public static final SubLObject pph_handle_error_alt(SubLObject format_string, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $pph_error_handling_onP$.getDynamicValue(thread)) {
                apply(CERROR, listS($$$continue_anyway, format_string, args));
            } else {
                apply(WARN, bq_cons(format_string, args));
            }
            return $pph_error_handling_onP$.getDynamicValue(thread);
        }
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

    /**
     * Report warnings.
     */
    @LispMethod(comment = "Report warnings.")
    public static final SubLObject pph_warn_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(PWHEN, list($sym0$PPH_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), list(PWHEN_FEATURE, $CYC_MAINT, listS(WARN, format_str, append(args, NIL))));
            }
        }
    }

    /**
     * Report warnings.
     */
    @LispMethod(comment = "Report warnings.")
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

    public static final SubLObject pph_check_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt24);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(COR, $suspend_pph_type_checkingP$, list(pred, v_object)), list(PPH_ERROR, ONE_INTEGER, list(FORMAT_NIL, $str_alt29$_S_is_not_a__S, v_object, list(QUOTE, pred))))));
            } else {
                cdestructuring_bind_error(datum, $list_alt24);
            }
        }
        return NIL;
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
            return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(COR, $suspend_pph_type_checkingP$, list(pred, v_object)), list(PPH_ERROR, ONE_INTEGER, list(FORMAT_NIL, $str34$_S_is_not_a__S, v_object, list(QUOTE, pred))))));
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
            return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(COR, $suspend_pph_type_checkingP$, list(LIST_OF_TYPE_P, list(QUOTE, pred), v_object)), list(PPH_ERROR, ONE_INTEGER, list(FORMAT_NIL, $str37$_S_is_not_a_list_of__S, v_object, list(QUOTE, pred))))));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }

    public static final SubLObject pph_check_type_if_non_null_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt24);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt24);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(PCASE_FEATURE, list($CYC_MAINT, list(PUNLESS, list(NULL, v_object), list(PPH_CHECK_TYPE, v_object, pred))));
            } else {
                cdestructuring_bind_error(datum, $list_alt24);
            }
        }
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

    static private final SubLList $list_alt1 = list(makeSymbol("PPH-NOTE"), makeSymbol("PPH-WARN"), makeSymbol("PPH-ERROR"));

    public static SubLObject declare_pph_error_file() {
        declareFunction("pph_trace", "PPH-TRACE", 0, 1, false);
        declareFunction("pph_untrace", "PPH-UNTRACE", 0, 0, false);
        declareFunction("pph_set_trace_level", "PPH-SET-TRACE-LEVEL", 1, 0, false);
        declareFunction("pph_cinc_trace_level", "PPH-CINC-TRACE-LEVEL", 0, 0, false);
        declareFunction("pph_trace_level_exceeds_minimumP", "PPH-TRACE-LEVEL-EXCEEDS-MINIMUM?", 1, 0, false);
        declareMacro("pph_note", "PPH-NOTE");
        declareFunction("pph_sanity_checking_suspendedP", "PPH-SANITY-CHECKING-SUSPENDED?", 0, 0, false);
        declareFunction("pph_break_on_errorP", "PPH-BREAK-ON-ERROR?", 0, 0, false);
        declareMacro("with_pph_error_handling", "WITH-PPH-ERROR-HANDLING");
        declareMacro("pph_error", "PPH-ERROR");
        declareFunction("pph_handle_error", "PPH-HANDLE-ERROR", 2, 0, false);
        declareFunction("suppress_pph_warningsP", "SUPPRESS-PPH-WARNINGS?", 0, 0, false);
        declareMacro("pph_warn", "PPH-WARN");
        declareMacro("pph_check_type", "PPH-CHECK-TYPE");
        declareMacro("pph_check_list_type", "PPH-CHECK-LIST-TYPE");
        declareMacro("pph_check_type_if_non_null", "PPH-CHECK-TYPE-IF-NON-NULL");
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("ERROR-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list(list(makeSymbol("*CONTINUE-CERROR?*"), NIL), list(makeSymbol("*PPH-ERROR-HANDLING-ON?*"), T));

    static private final SubLList $list_alt9 = list(makeSymbol("PPH-BREAK-ON-ERROR?"));

    static private final SubLSymbol $sym16$NEW_FORMAT_STRING = makeUninternedSymbol("NEW-FORMAT-STRING");

    static private final SubLString $str_alt18$_PPH_error_level__S___a = makeString("(PPH error level ~S) ~a");

    static private final SubLList $list_alt24 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));

    public static SubLObject init_pph_error_file() {
        defconstant("*PPH-MIN-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*PPH-TRACE-LEVEL*", $pph_min_trace_level$.getGlobalValue());
        defparameter("*SUSPEND-PPH-SANITY-CHECKING?*", T);
        defparameter("*PPH-BREAK-ON-ERROR?*", NIL);
        defparameter("*PPH-ERROR-HANDLING-ON?*", NIL);
        defparameter("*SUSPEND-PPH-TYPE-CHECKING?*", T);
        return NIL;
    }

    static private final SubLString $str_alt29$_S_is_not_a__S = makeString("~S is not a ~S");

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

    
}

/**
 * Total time: 103 ms
 */
