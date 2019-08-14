/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.control_vars.$within_unassert$;
import static com.cyc.cycjava.cycl.kb_macros.some_fort_being_removedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-PARANOIA
 * source file: /cyc/top/cycl/sbhl/sbhl-paranoia.lisp
 * created:     2019/07/03 17:37:18
 */
public final class sbhl_paranoia extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_paranoia();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_paranoia";


    // defparameter
    // Definitions
    /**
     * Parameter that governs whether we perform work within @see sbhl-check-type
     */
    @LispMethod(comment = "Parameter that governs whether we perform work within @see sbhl-check-type\ndefparameter")
    public static final SubLSymbol $sbhl_object_type_checking_p$ = makeSymbol("*SBHL-OBJECT-TYPE-CHECKING-P*");





    // defparameter
    // suppress retyping of forts iff this is non-nil
    /**
     * suppress retyping of forts iff this is non-nil
     */
    @LispMethod(comment = "suppress retyping of forts iff this is non-nil\ndefparameter")
    public static final SubLSymbol $suppress_sbhl_recachingP$ = makeSymbol("*SUPPRESS-SBHL-RECACHING?*");

    // defparameter
    /**
     * suppress use of fort types, and call the SBHL instead. This should be set to
     * NIL during fort types initialization.
     */
    @LispMethod(comment = "suppress use of fort types, and call the SBHL instead. This should be set to\r\nNIL during fort types initialization.\ndefparameter\nsuppress use of fort types, and call the SBHL instead. This should be set to\nNIL during fort types initialization.")
    public static final SubLSymbol $suspend_sbhl_cache_useP$ = makeSymbol("*SUSPEND-SBHL-CACHE-USE?*");

    static private final SubLList $list1 = list(list(makeSymbol("*SBHL-OBJECT-TYPE-CHECKING-P*"), NIL));

    static private final SubLList $list3 = list(makeSymbol("OBJECT"), makeSymbol("TYPE-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), ONE_INTEGER));

    static private final SubLList $list5 = list(makeSymbol("SBHL-OBJECT-TYPE-CHECKING-P"));

    public static final SubLSymbol $sbhl_type_error_action$ = makeSymbol("*SBHL-TYPE-ERROR-ACTION*");

    private static final SubLSymbol SBHL_ERROR = makeSymbol("SBHL-ERROR");

    static private final SubLString $str10$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLSymbol SBHL_CERROR = makeSymbol("SBHL-CERROR");

    static private final SubLString $$$continue_anyway = makeString("continue anyway");

    static private final SubLList $list18 = list(makeSymbol("WARN"), makeString("~A is not a valid *sbhl-type-error-action* value"), makeSymbol("*SBHL-TYPE-ERROR-ACTION*"));

    private static final SubLSymbol SBHL_CHECK_TYPE = makeSymbol("SBHL-CHECK-TYPE");

    static private final SubLList $list23 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym24$__ = makeSymbol(">=");

    public static final SubLSymbol $sbhl_trace_level$ = makeSymbol("*SBHL-TRACE-LEVEL*");

    public static final SubLSymbol $sbhl_test_level$ = makeSymbol("*SBHL-TEST-LEVEL*");

    public static final SubLSymbol $sbhl_test_maxP$ = makeSymbol("*SBHL-TEST-MAX?*");

    public static final SubLSymbol $sbhl_trace_maxP$ = makeSymbol("*SBHL-TRACE-MAX?*");

    static private final SubLList $list29 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), T));

    static private final SubLList $list30 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), NIL));

    /**
     * Accessor. @return booleanp; the value of @see *sbhl-object-type-checking-p
     */
    @LispMethod(comment = "Accessor. @return booleanp; the value of @see *sbhl-object-type-checking-p")
    public static final SubLObject sbhl_object_type_checking_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $sbhl_object_type_checking_p$.getDynamicValue(thread)) || (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_paranoia.suspend_sbhl_type_checkingP()));
        }
    }

    /**
     * Accessor. @return booleanp; the value of @see *sbhl-object-type-checking-p
     */
    @LispMethod(comment = "Accessor. @return booleanp; the value of @see *sbhl-object-type-checking-p")
    public static SubLObject sbhl_object_type_checking_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $sbhl_object_type_checking_p$.getDynamicValue(thread)) || (NIL == suspend_sbhl_type_checkingP()));
    }

    /**
     * Binds as nil @see *sbhl-object-type-checking-p*.
     */
    @LispMethod(comment = "Binds as nil @see *sbhl-object-type-checking-p*.")
    public static final SubLObject without_sbhl_object_type_checking_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt1, append(body, NIL));
        }
    }

    /**
     * Binds as nil @see *sbhl-object-type-checking-p*.
     */
    @LispMethod(comment = "Binds as nil @see *sbhl-object-type-checking-p*.")
    public static SubLObject without_sbhl_object_type_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list1, append(body, NIL));
    }

    /**
     * If @see sbhl-type-checking-p, applies TYPE-TEST to OBJECT. If this fails, performs action as specified by @see *sbhl-type-error-action*
     */
    @LispMethod(comment = "If @see sbhl-type-checking-p, applies TYPE-TEST to OBJECT. If this fails, performs action as specified by @see *sbhl-type-error-action*")
    public static final SubLObject sbhl_check_type_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject type_test = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            type_test = current.first();
            current = current.rest();
            {
                SubLObject level = (current.isCons()) ? ((SubLObject) (current.first())) : ONE_INTEGER;
                destructuring_bind_must_listp(current, datum, $list_alt3);
                current = current.rest();
                if (NIL == current) {
                    return list(PWHEN, $list_alt5, list(PUNLESS, list(type_test, v_object), list(PCASE, $sbhl_type_error_action$, list($ERROR, list(SBHL_ERROR, level, $str_alt10$_A_is_not_a__A, v_object, list(QUOTE, type_test))), list($CERROR, list(SBHL_CERROR, level, $$$continue_anyway, $str_alt10$_A_is_not_a__A, v_object, list(QUOTE, type_test))), list($WARN, list(WARN, $str_alt10$_A_is_not_a__A, v_object, list(QUOTE, type_test))), list(OTHERWISE, $list_alt18, list(CERROR, $$$continue_anyway, $str_alt10$_A_is_not_a__A, v_object, list(QUOTE, type_test))))));
                } else {
                    cdestructuring_bind_error(datum, $list_alt3);
                }
            }
        }
        return NIL;
    }

    /**
     * If @see sbhl-type-checking-p, applies TYPE-TEST to OBJECT. If this fails, performs action as specified by @see *sbhl-type-error-action*
     */
    @LispMethod(comment = "If @see sbhl-type-checking-p, applies TYPE-TEST to OBJECT. If this fails, performs action as specified by @see *sbhl-type-error-action*")
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

    public static final SubLObject sbhl_check_type_if_present_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_object = NIL;
            SubLObject type_test = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            v_object = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            type_test = current.first();
            current = current.rest();
            {
                SubLObject level = (current.isCons()) ? ((SubLObject) (current.first())) : ONE_INTEGER;
                destructuring_bind_must_listp(current, datum, $list_alt3);
                current = current.rest();
                if (NIL == current) {
                    return list(PWHEN, v_object, list(SBHL_CHECK_TYPE, v_object, type_test, level));
                } else {
                    cdestructuring_bind_error(datum, $list_alt3);
                }
            }
        }
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

    /**
     * Print the FORMAT-STR if LEVEL is >= *sbhl-trace-level*
     */
    @LispMethod(comment = "Print the FORMAT-STR if LEVEL is >= *sbhl-trace-level*")
    public static final SubLObject sbhl_note_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(level, INTEGERP);
            SubLTrampolineFile.checkType(format_str, STRINGP);
            if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    /**
     * Print the FORMAT-STR if LEVEL is >= *sbhl-trace-level*
     */
    @LispMethod(comment = "Print the FORMAT-STR if LEVEL is >= *sbhl-trace-level*")
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
        assert NIL != integerp(level) : "! integerp(level) " + ("Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) ") + level;
        assert NIL != stringp(format_str) : "! stringp(format_str) " + ("Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) ") + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    /**
     * If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.
     */
    @LispMethod(comment = "If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.")
    public static final SubLObject sbhl_error_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(level, INTEGERP);
            SubLTrampolineFile.checkType(format_str, STRINGP);
            if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    /**
     * If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.
     */
    @LispMethod(comment = "If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.")
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
        assert NIL != integerp(level) : "! integerp(level) " + ("Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) ") + level;
        assert NIL != stringp(format_str) : "! stringp(format_str) " + ("Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) ") + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    /**
     * If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with CONTINUE-STR and FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.
     */
    @LispMethod(comment = "If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with CONTINUE-STR and FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.")
    public static final SubLObject sbhl_cerror_alt(SubLObject level, SubLObject continue_str, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(level, INTEGERP);
            SubLTrampolineFile.checkType(continue_str, STRINGP);
            SubLTrampolineFile.checkType(format_str, STRINGP);
            if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
                Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            } else {
                if (add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                    Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                }
            }
            return NIL;
        }
    }

    /**
     * If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with CONTINUE-STR and FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.
     */
    @LispMethod(comment = "If *sbhl-trace-level* is greater than or equal to LEVEL, signal a cerror with CONTINUE-STR and FORMAT-STR. If *sbhl-trace-level* is within 2 of LEVEL, warn with FORMAT-STR. @see cerror. @see warn.")
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
        assert NIL != integerp(level) : "! integerp(level) " + ("Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) ") + level;
        assert NIL != stringp(continue_str) : "! stringp(continue_str) " + ("Types.stringp(continue_str) " + "CommonSymbols.NIL != Types.stringp(continue_str) ") + continue_str;
        assert NIL != stringp(format_str) : "! stringp(format_str) " + ("Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) ") + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, $sbhl_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    /**
     * If *sbhl-trace-level* is greater than or equal to LEVEL, warn with FORMAT-STR. @see warn.
     */
    @LispMethod(comment = "If *sbhl-trace-level* is greater than or equal to LEVEL, warn with FORMAT-STR. @see warn.")
    public static final SubLObject sbhl_warn_alt(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(level, INTEGERP);
            SubLTrampolineFile.checkType(format_str, STRINGP);
            if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
                apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
                return NIL;
            }
            return NIL;
        }
    }

    /**
     * If *sbhl-trace-level* is greater than or equal to LEVEL, warn with FORMAT-STR. @see warn.
     */
    @LispMethod(comment = "If *sbhl-trace-level* is greater than or equal to LEVEL, warn with FORMAT-STR. @see warn.")
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
        assert NIL != integerp(level) : "! integerp(level) " + ("Types.integerp(level) " + "CommonSymbols.NIL != Types.integerp(level) ") + level;
        assert NIL != stringp(format_str) : "! stringp(format_str) " + ("Types.stringp(format_str) " + "CommonSymbols.NIL != Types.stringp(format_str) ") + format_str;
        if ($sbhl_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @return whether to suspend type checking at the moment
     */
    @LispMethod(comment = "@return whether to suspend type checking at the moment")
    public static final SubLObject suspend_sbhl_type_checkingP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != system_parameters.$suspend_sbhl_type_checkingP$.getDynamicValue(thread))) || (NIL != some_fort_being_removedP())) || (NIL != $within_unassert$.getDynamicValue(thread)));
        }
    }

    /**
     *
     *
     * @return whether to suspend type checking at the moment
     */
    @LispMethod(comment = "@return whether to suspend type checking at the moment")
    public static SubLObject suspend_sbhl_type_checkingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != $suspend_type_checkingP$.getDynamicValue(thread)) || (NIL != system_parameters.$suspend_sbhl_type_checkingP$.getDynamicValue(thread))) || (NIL != hl_macros.some_fort_being_removedP())) || (NIL != $within_unassert$.getDynamicValue(thread)));
    }

    /**
     * Executes BODY when *sbhl-trace-level* is greater than or equal to LEVEL
     */
    @LispMethod(comment = "Executes BODY when *sbhl-trace-level* is greater than or equal to LEVEL")
    public static final SubLObject sbhl_trace_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list($sym24$__, $sbhl_trace_level$, level), append(body, NIL));
            }
        }
    }

    /**
     * Executes BODY when *sbhl-trace-level* is greater than or equal to LEVEL
     */
    @LispMethod(comment = "Executes BODY when *sbhl-trace-level* is greater than or equal to LEVEL")
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

    /**
     * Executes BODY when *sbhl-test-level* is greater than or equal to LEVEL
     */
    @LispMethod(comment = "Executes BODY when *sbhl-test-level* is greater than or equal to LEVEL")
    public static final SubLObject sbhl_test_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            level = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(PWHEN, list($sym24$__, $sbhl_test_level$, level), append(body, NIL));
            }
        }
    }

    /**
     * Executes BODY when *sbhl-test-level* is greater than or equal to LEVEL
     */
    @LispMethod(comment = "Executes BODY when *sbhl-test-level* is greater than or equal to LEVEL")
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

    /**
     * Executes BODY iff *sbhl-test-max?* is non-nil
     */
    @LispMethod(comment = "Executes BODY iff *sbhl-test-max?* is non-nil")
    public static final SubLObject sbhl_test_max_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PWHEN, $sbhl_test_maxP$, append(body, NIL));
        }
    }

    @LispMethod(comment = "Executes BODY iff *sbhl-test-max?* is non-nil")
    public static SubLObject sbhl_test_max(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PWHEN, $sbhl_test_maxP$, append(body, NIL));
    }

    /**
     * Executes BODY iff *sbhl-trace-max?* is non-nil
     */
    @LispMethod(comment = "Executes BODY iff *sbhl-trace-max?* is non-nil")
    public static final SubLObject sbhl_trace_max_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(PWHEN, $sbhl_trace_maxP$, append(body, NIL));
        }
    }

    @LispMethod(comment = "Executes BODY iff *sbhl-trace-max?* is non-nil")
    public static SubLObject sbhl_trace_max(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(PWHEN, $sbhl_trace_maxP$, append(body, NIL));
    }

    /**
     * Accessor. @return booleanp; whether we are using sbhl caches.
     * If this is NIL, we are just using sbhl-predicate-relation-p
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether we are using sbhl caches.\r\nIf this is NIL, we are just using sbhl-predicate-relation-p\nAccessor. @return booleanp; whether we are using sbhl caches.\nIf this is NIL, we are just using sbhl-predicate-relation-p")
    public static final SubLObject check_sbhl_cachesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL == $suspend_sbhl_cache_useP$.getDynamicValue(thread)) && (NIL != sbhl_cache.sbhl_caches_initialized_p()));
        }
    }

    /**
     * Accessor. @return booleanp; whether we are using sbhl caches.
     * If this is NIL, we are just using sbhl-predicate-relation-p
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether we are using sbhl caches.\r\nIf this is NIL, we are just using sbhl-predicate-relation-p\nAccessor. @return booleanp; whether we are using sbhl caches.\nIf this is NIL, we are just using sbhl-predicate-relation-p")
    public static SubLObject check_sbhl_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == $suspend_sbhl_cache_useP$.getDynamicValue(thread)) && (NIL == sbhl_search_vars.$sbhl_justification_search_p$.getDynamicValue(thread))) && (NIL != sbhl_cache.sbhl_caches_initialized_p()));
    }

    /**
     * binds *suspend-sbhl-cache-use?* to T for BODY.
     */
    @LispMethod(comment = "binds *suspend-sbhl-cache-use?* to T for BODY.")
    public static final SubLObject without_sbhl_caches_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt29, append(body, NIL));
        }
    }

    /**
     * binds *suspend-sbhl-cache-use?* to T for BODY.
     */
    @LispMethod(comment = "binds *suspend-sbhl-cache-use?* to T for BODY.")
    public static SubLObject without_sbhl_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list29, append(body, NIL));
    }

    /**
     * binds *suspend-sbhl-cache-use?* to NIL for BODY.
     */
    @LispMethod(comment = "binds *suspend-sbhl-cache-use?* to NIL for BODY.")
    public static final SubLObject with_sbhl_caches_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt30, append(body, NIL));
        }
    }

    /**
     * binds *suspend-sbhl-cache-use?* to NIL for BODY.
     */
    @LispMethod(comment = "binds *suspend-sbhl-cache-use?* to NIL for BODY.")
    public static SubLObject with_sbhl_caches(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list30, append(body, NIL));
    }

    public static SubLObject declare_sbhl_paranoia_file() {
        declareFunction("sbhl_object_type_checking_p", "SBHL-OBJECT-TYPE-CHECKING-P", 0, 0, false);
        declareMacro("without_sbhl_object_type_checking", "WITHOUT-SBHL-OBJECT-TYPE-CHECKING");
        declareMacro("sbhl_check_type", "SBHL-CHECK-TYPE");
        declareMacro("sbhl_check_type_if_present", "SBHL-CHECK-TYPE-IF-PRESENT");
        declareFunction("sbhl_note", "SBHL-NOTE", 2, 5, false);
        declareFunction("sbhl_error", "SBHL-ERROR", 2, 5, false);
        declareFunction("sbhl_cerror", "SBHL-CERROR", 3, 5, false);
        declareFunction("sbhl_warn", "SBHL-WARN", 2, 5, false);
        declareFunction("suspend_sbhl_type_checkingP", "SUSPEND-SBHL-TYPE-CHECKING?", 0, 0, false);
        declareMacro("sbhl_trace", "SBHL-TRACE");
        declareMacro("sbhl_test", "SBHL-TEST");
        declareMacro("sbhl_test_max", "SBHL-TEST-MAX");
        declareMacro("sbhl_trace_max", "SBHL-TRACE-MAX");
        declareFunction("check_sbhl_cachesP", "CHECK-SBHL-CACHES?", 0, 0, false);
        declareMacro("without_sbhl_caches", "WITHOUT-SBHL-CACHES");
        declareMacro("with_sbhl_caches", "WITH-SBHL-CACHES");
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

    static private final SubLList $list_alt1 = list(list(makeSymbol("*SBHL-OBJECT-TYPE-CKECKING-P*"), NIL));

    static private final SubLList $list_alt3 = list(makeSymbol("OBJECT"), makeSymbol("TYPE-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), ONE_INTEGER));

    static private final SubLList $list_alt5 = list(makeSymbol("SBHL-OBJECT-TYPE-CHECKING-P"));

    static private final SubLString $str_alt10$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLList $list_alt18 = list(makeSymbol("WARN"), makeString("~A is not a valid *sbhl-type-error-action* value"), makeSymbol("*SBHL-TYPE-ERROR-ACTION*"));

    static private final SubLList $list_alt23 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), T));

    static private final SubLList $list_alt30 = list(list(makeSymbol("*SUSPEND-SBHL-CACHE-USE?*"), NIL));
}

/**
 * Total time: 79 ms
 */
