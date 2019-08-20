/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.format_nil.format_nil_s_no_copy;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.reformulator_module_quantifier_unifier_3;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sksi.data_parser;
import com.cyc.cycjava.cycl.sksi.mapping_engine;
import com.cyc.cycjava.cycl.sksi.semantic_etl_bus;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_smt;
import com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.cycjava.cycl.sksi.report_generation.sksi_report_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-DEBUGGING
 * source file: /cyc/top/cycl/sksi/sksi-infrastructure/sksi-debugging.lisp
 * created:     2019/07/03 17:37:52
 */
public final class sksi_debugging extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sksi_debugging();



    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $sksi_min_trace_level$ = makeSymbol("*SKSI-MIN-TRACE-LEVEL*");

    // defparameter
    @LispMethod(comment = "A non-negative integer.\r\n0 means no tracing.\r\nn means tracing at levels 1, ..., n.\ndefparameter\nA non-negative integer.\n0 means no tracing.\nn means tracing at levels 1, ..., n.")
    public static final SubLSymbol $sksi_trace_level$ = makeSymbol("*SKSI-TRACE-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_custom_error_handling_table$ = makeSymbol("*SKSI-CUSTOM-ERROR-HANDLING-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $sksi_custom_error_handling_default$ = makeSymbol("*SKSI-CUSTOM-ERROR-HANDLING-DEFAULT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sksi_violations$ = makeSymbol("*SKSI-VIOLATIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLSymbol $sym2$SKSI_TRACE_LEVEL_EXCEEDS_MINIMUM_ = makeSymbol("SKSI-TRACE-LEVEL-EXCEEDS-MINIMUM?");

    public static final SubLSymbol $sksi_trace_stream$ = makeSymbol("*SKSI-TRACE-STREAM*");

    private static final SubLString $str6$__SKSI__A_ = makeString("~&SKSI-~A ");

    static private final SubLList $list7 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*SKSI-TRACE-STREAM*")));

    static private final SubLList $list8 = list(list(makeSymbol("TRACE-LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list10 = list(list(makeSymbol("*SKSI-TRACE-LEVEL*")));

    private static final SubLSymbol SKSI_TRACE = makeSymbol("SKSI-TRACE");

    private static final SubLList $list13 = list(list(makeSymbol("SKSI-UNTRACE")));

    static private final SubLList $list15 = list(makeKeyword("IGNORE"), $WARN, makeKeyword("BREAK"), makeKeyword("CUSTOM"));

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLList $list20 = list(new SubLObject[]{ cons(makeString("#<SDBC-CLIENT-ERROR"), makeKeyword("BREAK")), cons(makeString("#<SDBC-SQL-ERROR: This connection has been closed.>"), makeKeyword("BREAK")), cons(makeString("This connection has been closed."), makeKeyword("BREAK")), cons(makeString("Invalid operation: statement is closed."), makeKeyword("BREAK")), cons(makeString("Connection timed out"), makeKeyword("BREAK")), cons(makeString("end-of-file on stream"), makeKeyword("BREAK")), cons(makeString("Got invalid type for object: NIL. Wanted type: STREAMP Actual type: NIL"), makeKeyword("BREAK")), cons(makeString("FATAL: terminating connection due to administrator command"), makeKeyword("BREAK")), cons(makeString("ERRORCODE=-4470"), makeKeyword("BREAK")), cons(makeString("SQLCODE=-1001"), makeKeyword("BREAK")), cons(makeString("SQLCODE=-206"), $WARN), cons(makeString("SQLCODE=-204"), $WARN), cons(makeString("No field encodings for physical field indexical"), $WARN) });

    private static final SubLList $list21 = cons(makeSymbol("TABLE-SUBSTRING"), makeSymbol("TABLE-ACTION"));

    private static final SubLString $str22$Unexpected_error_action__s_define = makeString("Unexpected error action ~s defined for substring ~s");

    private static final SubLString $$$Continue_without_accessing_ = makeString("Continue without accessing ");

    private static final SubLString $str24$_ = makeString(".");

    static private final SubLList $list25 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list27 = list(makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P"));

    public static final SubLSymbol $sksi_error_handling_mode$ = makeSymbol("*SKSI-ERROR-HANDLING-MODE*");

    private static final SubLSymbol WITH_SKSI_ERROR_HANDLING_MODE = makeSymbol("WITH-SKSI-ERROR-HANDLING-MODE");

    static private final SubLList $list30 = list(list(makeSymbol("*INFERENCE-DEBUG?*"), T));

    public static final SubLSymbol $sksi_sks_error_handling_mode$ = makeSymbol("*SKSI-SKS-ERROR-HANDLING-MODE*");

    private static final SubLSymbol WITH_SKSI_SKS_ERROR_HANDLING_MODE = makeSymbol("WITH-SKSI-SKS-ERROR-HANDLING-MODE");

    public static final SubLSymbol $sksi_registration_error_handling_mode$ = makeSymbol("*SKSI-REGISTRATION-ERROR-HANDLING-MODE*");

    private static final SubLSymbol WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE = makeSymbol("WITH-SKSI-REGISTRATION-ERROR-HANDLING-MODE");

    private static final SubLList $list35 = list(list(makeSymbol("RESULT"), makeSymbol("TRACE-LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym36$STRING_STREAM = makeUninternedSymbol("STRING-STREAM");

    private static final SubLList $list37 = list(list(makeSymbol("MAKE-STRING-OUTPUT-STREAM")));

    private static final SubLSymbol WITH_SKSI_TRACE_LEVEL = makeSymbol("WITH-SKSI-TRACE-LEVEL");

    private static final SubLList $list41 = list(new SubLObject[]{ makeKeyword("SKSI-MISSING-DECODINGS"), makeKeyword("SKSI-MISSING-ENCODINGS"), makeKeyword("SKSI-MISSING-FIELDS"), makeKeyword("SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL"), makeKeyword("SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL"), makeKeyword("SKSI-MISSING-REQUIRED-FIELD-VALUE"), makeKeyword("SKSI-LIT-MS-ARG-MISMATCH"), makeKeyword("SKSI-UNREFORMULATABLE"), makeKeyword("SKSI-COMPARISON-ASENT-INAPPLICABLE"), makeKeyword("SKSI-COMPARISON-OPERATOR-FORBIDDEN"), makeKeyword("SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND"), makeKeyword("SKSI-LIST-LENGTH-MISMATCH") });

    private static final SubLSymbol $SKSI_MISSING_DECODINGS = makeKeyword("SKSI-MISSING-DECODINGS");

    private static final SubLSymbol $SKSI_MISSING_ENCODINGS = makeKeyword("SKSI-MISSING-ENCODINGS");

    private static final SubLSymbol $SKSI_MISSING_FIELDS = makeKeyword("SKSI-MISSING-FIELDS");

    private static final SubLSymbol $SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL = makeKeyword("SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL");

    private static final SubLSymbol $SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL = makeKeyword("SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL");

    private static final SubLSymbol $SKSI_MISSING_REQUIRED_FIELD_VALUE = makeKeyword("SKSI-MISSING-REQUIRED-FIELD-VALUE");

    private static final SubLSymbol $SKSI_LIT_MS_ARG_MISMATCH = makeKeyword("SKSI-LIT-MS-ARG-MISMATCH");

    private static final SubLSymbol $SKSI_COMPARISON_ASENT_INAPPLICABLE = makeKeyword("SKSI-COMPARISON-ASENT-INAPPLICABLE");

    private static final SubLSymbol $SKSI_COMPARISON_OPERATOR_FORBIDDEN = makeKeyword("SKSI-COMPARISON-OPERATOR-FORBIDDEN");

    private static final SubLSymbol $SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND = makeKeyword("SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND");

    private static final SubLSymbol $SKSI_LIST_LENGTH_MISMATCH = makeKeyword("SKSI-LIST-LENGTH-MISMATCH");

    private static final SubLSymbol $SKSI_EVALUATE_CSQL_UNPRODUCIBLE = makeKeyword("SKSI-EVALUATE-CSQL-UNPRODUCIBLE");

    private static final SubLSymbol $SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE = makeKeyword("SKSI-UNKNOWN-SENTENCE-CSQL-UNPRODUCIBLE");

    private static final SubLString $$$Continue_anyway = makeString("Continue anyway");

    private static final SubLString $str57$Unknown_violation__s_ = makeString("Unknown violation ~s.");

    private static final SubLString $$$Could_not_find_decodings_for_ = makeString("Could not find decodings for ");

    private static final SubLString $$$Could_not_find_encodings_for_ = makeString("Could not find encodings for ");

    private static final SubLString $$$Could_not_find_fields_for_ = makeString("Could not find fields for ");

    private static final SubLString $str61$Could_not_find_physical_field_for = makeString("Could not find physical field for indexical ");

    private static final SubLString $str62$Could_not_find_logical_field_for_ = makeString("Could not find logical field for indexical ");

    private static final SubLList $list63 = list(makeSymbol("PHYSICAL-FIELD"), makeSymbol("PHYSICAL-SCHEMA"));

    private static final SubLString $$$Missing_a_value_for_ = makeString("Missing a value for ");

    private static final SubLString $str65$__which_is_a___requiredFields_for = makeString(", which is a #$requiredFields for ");

    private static final SubLList $list66 = list(makeSymbol("LIT-ARG"), makeSymbol("MEANING-SENTENCE-ARG"));

    private static final SubLString $str67$Mismatch_between_literal_argument = makeString("Mismatch between literal argument ");

    private static final SubLString $$$_and_meaning_sentence_argument_ = makeString(" and meaning sentence argument ");

    private static final SubLString $str69$_unreformulatable_ = makeString(" unreformulatable.");

    private static final SubLString $str70$_inapplicable_ = makeString(" inapplicable.");

    private static final SubLString $str71$_forbidden_ = makeString(" forbidden.");

    private static final SubLString $str72$_has_no_variables_so_can_t_sent_t = makeString(" has no variables so can't sent to DB.");

    private static final SubLList $list73 = list(makeSymbol("LIST0"), makeSymbol("LIST1"));

    private static final SubLString $$$Mismatch_between_lengths_of_ = makeString("Mismatch between lengths of ");

    private static final SubLString $$$_and_ = makeString(" and ");

    private static final SubLString $str76$No_CSQL_can_be_generated_for_the_ = makeString("No CSQL can be generated for the evaluate expression ");

    private static final SubLString $str77$No_CSQL_can_be_generated_for_the_ = makeString("No CSQL can be generated for the sksiUnknownSentence expression ");

    private static final SubLList $list78 = list(list(makeSymbol("VIOLATION"), makeSymbol("MESSAGE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym79$RESULT = makeUninternedSymbol("RESULT");

    private static final SubLSymbol SKSI_VIOLATION_MESSAGE = makeSymbol("SKSI-VIOLATION-MESSAGE");

    private static final SubLList $list82 = list(list(makeSymbol("MESSAGE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_SKSI_VIOLATION_HANDLING = makeSymbol("WITH-SKSI-VIOLATION-HANDLING");

    public static final SubLObject sksi_trace_alt(SubLObject level) {
        if (level == UNPROVIDED) {
            level = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != level) {
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_set_trace_level(level);
            } else {
                com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_cinc_trace_level();
            }
            return $sksi_trace_level$.getDynamicValue(thread);
        }
    }

    public static SubLObject sksi_trace(SubLObject level) {
        if (level == UNPROVIDED) {
            level = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != level) {
            sksi_set_trace_level(level);
        } else {
            sksi_cinc_trace_level();
        }
        return $sksi_trace_level$.getDynamicValue(thread);
    }

    public static final SubLObject sksi_untrace_alt() {
        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_set_trace_level($sksi_min_trace_level$.getGlobalValue());
    }

    public static SubLObject sksi_untrace() {
        return sksi_set_trace_level($sksi_min_trace_level$.getGlobalValue());
    }

    public static final SubLObject sksi_set_trace_level_alt(SubLObject level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!level.isInteger()) {
                return $sksi_trace_level$.getDynamicValue(thread);
            }
            if (level.numL($sksi_min_trace_level$.getGlobalValue())) {
                $sksi_trace_level$.setDynamicValue($sksi_min_trace_level$.getGlobalValue(), thread);
            } else {
                $sksi_trace_level$.setDynamicValue(level, thread);
            }
            return $sksi_trace_level$.getDynamicValue(thread);
        }
    }

    public static SubLObject sksi_set_trace_level(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!level.isInteger()) {
            return $sksi_trace_level$.getDynamicValue(thread);
        }
        if (level.numL($sksi_min_trace_level$.getGlobalValue())) {
            $sksi_trace_level$.setDynamicValue($sksi_min_trace_level$.getGlobalValue(), thread);
        } else {
            $sksi_trace_level$.setDynamicValue(level, thread);
        }
        return $sksi_trace_level$.getDynamicValue(thread);
    }

    public static final SubLObject sksi_cinc_trace_level_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sksi_trace_level$.setDynamicValue(add($sksi_trace_level$.getDynamicValue(thread), ONE_INTEGER), thread);
            return $sksi_trace_level$.getDynamicValue(thread);
        }
    }

    public static SubLObject sksi_cinc_trace_level() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $sksi_trace_level$.setDynamicValue(add($sksi_trace_level$.getDynamicValue(thread), ONE_INTEGER), thread);
        return $sksi_trace_level$.getDynamicValue(thread);
    }

    public static final SubLObject sksi_trace_level_exceeds_minimumP_alt(SubLObject level) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject recursion_depth = (pph_vars.current_generation_level().isPositive()) ? ((SubLObject) (number_utilities.f_1_(pph_vars.current_generation_level()))) : ZERO_INTEGER;
                SubLObject adjusted_trace_level = subtract($sksi_trace_level$.getDynamicValue(thread), recursion_depth);
                return numGE(adjusted_trace_level, level);
            }
        }
    }

    public static SubLObject sksi_trace_level_exceeds_minimumP(final SubLObject level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numGE($sksi_trace_level$.getDynamicValue(thread), level);
    }

    /**
     * Report something not necessarily bad.
     */
    @LispMethod(comment = "Report something not necessarily bad.")
    public static final SubLObject sksi_note_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject level = NIL;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            level = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(PWHEN, list($sym2$SKSI_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), listS(FORMAT, $sksi_trace_stream$, listS(CCONCATENATE, $str_alt6$SKSI_, format_str, $list_alt7), append(args, NIL)), $list_alt8);
            }
        }
    }

    /**
     * Report something not necessarily bad.
     */
    @LispMethod(comment = "Report something not necessarily bad.")
    public static SubLObject sksi_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject level = NIL;
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        level = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(PWHEN, list($sym2$SKSI_TRACE_LEVEL_EXCEEDS_MINIMUM_, level), listS(FORMAT, $sksi_trace_stream$, list(CCONCATENATE, $str6$__SKSI__A_, format_str), level, append(args, NIL)), $list7);
    }

    /**
     * Rebind the trace-level without setting it
     */
    @LispMethod(comment = "Rebind the trace-level without setting it")
    public static final SubLObject with_sksi_trace_level_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject trace_level = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    trace_level = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, $list_alt11, list(SKSI_TRACE, trace_level), bq_cons(PROGN, append(body, NIL)), $list_alt14);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt9);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Rebind the trace-level without setting it
     */
    @LispMethod(comment = "Rebind the trace-level without setting it")
    public static SubLObject with_sksi_trace_level(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject trace_level = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        trace_level = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, $list10, list(SKSI_TRACE, trace_level), bq_cons(PROGN, append(body, NIL)), $list13);
        }
        cdestructuring_bind_error(datum, $list8);
        return NIL;
    }

    public static final SubLObject valid_sksi_error_handling_mode_p_alt(SubLObject mode) {
        return list_utilities.member_eqP(mode, $list_alt15);
    }

    public static SubLObject valid_sksi_error_handling_mode_p(final SubLObject mode) {
        return makeBoolean(($CUSTOM == mode) || (NIL != valid_atomic_sksi_error_handling_mode_p(mode)));
    }

    public static SubLObject valid_atomic_sksi_error_handling_mode_p(final SubLObject mode) {
        return list_utilities.member_eqP(mode, $list15);
    }

    public static final SubLObject sksi_ignore_errors_alt() {
        $sksi_error_handling_mode$.setDynamicValue($IGNORE);
        return $IGNORE;
    }

    public static SubLObject sksi_ignore_errors() {
        $sksi_error_handling_mode$.setDynamicValue($IGNORE);
        return $IGNORE;
    }

    public static final SubLObject sksi_warn_on_errors_alt() {
        $sksi_error_handling_mode$.setDynamicValue($WARN);
        return $WARN;
    }

    public static SubLObject sksi_warn_on_errors() {
        $sksi_error_handling_mode$.setDynamicValue($WARN);
        return $WARN;
    }

    public static final SubLObject sksi_break_on_errors_alt() {
        $sksi_error_handling_mode$.setDynamicValue($BREAK);
        return $BREAK;
    }

    public static SubLObject sksi_break_on_errors() {
        $sksi_error_handling_mode$.setDynamicValue($BREAK);
        return $BREAK;
    }

    public static final SubLObject sksi_error_handling_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $sksi_error_handling_mode$.getDynamicValue(thread)) {
                return $IGNORE;
            }
            return $sksi_error_handling_mode$.getDynamicValue(thread);
        }
    }

    public static SubLObject sksi_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $sksi_error_handling_mode$.getDynamicValue(thread)) {
            return $IGNORE;
        }
        return $sksi_error_handling_mode$.getDynamicValue(thread);
    }

    public static final SubLObject sksi_error_alt(SubLObject error_string) {
        if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_ignore_errorsP()) {
        } else {
            if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_warn_on_errorsP()) {
                Errors.warn(error_string);
            } else {
                if (NIL != com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_break_on_errorsP()) {
                    Errors.cerror($$$Continue, error_string);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sksi_error(final SubLObject error_string) {
        if (NIL != sksi_possibly_act_on_custom_error_action(error_string)) {
            return NIL;
        }
        if (NIL == sksi_ignore_errorsP()) {
            if (NIL != sksi_warn_on_errorsP()) {
                Errors.warn(error_string);
            } else
                if (NIL != sksi_break_on_errorsP()) {
                    Errors.cerror($$$Continue, error_string);
                }

        }
        return NIL;
    }

    public static final SubLObject sksi_sks_error_handling_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $sksi_sks_error_handling_mode$.getDynamicValue(thread) ? ((SubLObject) ($sksi_sks_error_handling_mode$.getDynamicValue(thread))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_error_handling_mode();
        }
    }

    public static SubLObject sksi_sks_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $sksi_sks_error_handling_mode$.getDynamicValue(thread) ? $sksi_sks_error_handling_mode$.getDynamicValue(thread) : sksi_error_handling_mode();
    }

    public static final SubLObject sksi_registration_error_handling_mode_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $sksi_registration_error_handling_mode$.getDynamicValue(thread) ? ((SubLObject) ($sksi_registration_error_handling_mode$.getDynamicValue(thread))) : com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_error_handling_mode();
        }
    }

    public static SubLObject sksi_registration_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $sksi_registration_error_handling_mode$.getDynamicValue(thread) ? $sksi_registration_error_handling_mode$.getDynamicValue(thread) : NIL != $sksi_error_handling_mode$.getDynamicValue(thread) ? $sksi_error_handling_mode$.getDynamicValue(thread) : $IGNORE;
    }

    public static SubLObject sksi_default_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = sksi_error_handling_mode();
        return $CUSTOM == mode ? $sksi_custom_error_handling_default$.getDynamicValue(thread) : mode;
    }

    public static SubLObject sksi_default_sks_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = sksi_sks_error_handling_mode();
        return $CUSTOM == mode ? $sksi_custom_error_handling_default$.getDynamicValue(thread) : mode;
    }

    public static SubLObject sksi_default_registration_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mode = sksi_registration_error_handling_mode();
        return $CUSTOM == mode ? $sksi_custom_error_handling_default$.getDynamicValue(thread) : mode;
    }

    public static SubLObject lookup_string_in_sksi_custom_error_handling_table(final SubLObject error_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject action = NIL;
        if (NIL == action) {
            SubLObject csome_list_var = $sksi_custom_error_handling_table$.getDynamicValue(thread);
            SubLObject table_pair = NIL;
            table_pair = csome_list_var.first();
            while ((NIL == action) && (NIL != csome_list_var)) {
                SubLObject current;
                final SubLObject datum = current = table_pair;
                SubLObject table_substring = NIL;
                SubLObject table_action = NIL;
                destructuring_bind_must_consp(current, datum, $list21);
                table_substring = current.first();
                current = table_action = current.rest();
                if (NIL != string_utilities.substringP(table_substring, error_string, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED)) {
                    action = table_action;
                }
                csome_list_var = csome_list_var.rest();
                table_pair = csome_list_var.first();
            } 
        }
        return action;
    }

    public static SubLObject sksi_possibly_act_on_custom_error_action(final SubLObject error_string) {
        if ($CUSTOM == sksi_error_handling_mode()) {
            final SubLObject action = lookup_string_in_sksi_custom_error_handling_table(error_string);
            if (NIL != action) {
                final SubLObject pcase_var = action;
                if (!pcase_var.eql($IGNORE)) {
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error_string);
                    } else
                        if (pcase_var.eql($BREAK)) {
                            Errors.cerror($$$Continue, error_string);
                        } else {
                            Errors.cerror($$$Continue, $str22$Unexpected_error_action__s_define, action, error_string);
                        }

                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject sksi_possibly_act_on_custom_sks_error_action(final SubLObject error_string, final SubLObject sks, final SubLObject error_type) {
        if ($CUSTOM == sksi_sks_error_handling_mode()) {
            final SubLObject action = lookup_string_in_sksi_custom_error_handling_table(error_string);
            if (NIL != action) {
                final SubLObject pcase_var = action;
                if (!pcase_var.eql($IGNORE)) {
                    if (pcase_var.eql($WARN)) {
                        Errors.warn(error_string);
                    } else
                        if (pcase_var.eql($BREAK)) {
                            final SubLObject cont_string = cconcatenate($$$Continue_without_accessing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(sks), $str24$_ });
                            Errors.cerror(cont_string, error_string);
                        } else {
                            Errors.cerror($$$Continue, $str22$Unexpected_error_action__s_define, action, error_string);
                        }

                }
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject sksi_ignore_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_error_handling_mode(), $IGNORE);
    }

    public static SubLObject sksi_ignore_errorsP() {
        return eq(sksi_default_error_handling_mode(), $IGNORE);
    }

    public static final SubLObject sksi_warn_on_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_error_handling_mode(), $WARN);
    }

    public static SubLObject sksi_warn_on_errorsP() {
        return eq(sksi_default_error_handling_mode(), $WARN);
    }

    public static final SubLObject sksi_break_on_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_error_handling_mode(), $BREAK);
    }

    public static SubLObject sksi_break_on_errorsP() {
        return eq(sksi_default_error_handling_mode(), $BREAK);
    }

    public static final SubLObject sksi_ignore_sks_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_sks_error_handling_mode(), $IGNORE);
    }

    public static SubLObject sksi_ignore_sks_errorsP() {
        return eq(sksi_default_sks_error_handling_mode(), $IGNORE);
    }

    public static final SubLObject sksi_warn_on_sks_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_sks_error_handling_mode(), $WARN);
    }

    public static SubLObject sksi_warn_on_sks_errorsP() {
        return eq(sksi_default_sks_error_handling_mode(), $WARN);
    }

    public static final SubLObject sksi_break_on_sks_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_sks_error_handling_mode(), $BREAK);
    }

    public static SubLObject sksi_break_on_sks_errorsP() {
        return eq(sksi_default_sks_error_handling_mode(), $BREAK);
    }

    public static final SubLObject sksi_ignore_registration_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_registration_error_handling_mode(), $IGNORE);
    }

    public static SubLObject sksi_ignore_registration_errorsP() {
        return eq(sksi_default_registration_error_handling_mode(), $IGNORE);
    }

    public static final SubLObject sksi_warn_on_registration_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_registration_error_handling_mode(), $WARN);
    }

    public static SubLObject sksi_warn_on_registration_errorsP() {
        return eq(sksi_default_registration_error_handling_mode(), $WARN);
    }

    public static final SubLObject sksi_break_on_registration_errorsP_alt() {
        return eq(com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_registration_error_handling_mode(), $BREAK);
    }

    public static SubLObject sksi_break_on_registration_errorsP() {
        return eq(sksi_default_registration_error_handling_mode(), $BREAK);
    }

    public static final SubLObject with_sksi_error_handling_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, mode, $list_alt22), listS(CLET, list(list($sksi_error_handling_mode$, mode)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_sksi_error_handling_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, mode, $list27), listS(CLET, list(list($sksi_error_handling_mode$, mode)), append(body, NIL)));
    }

    public static final SubLObject with_sksi_ignore_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SKSI_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
    }

    public static final SubLObject with_sksi_warn_on_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SKSI_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
    }

    public static final SubLObject with_sksi_break_on_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt25, listS(WITH_SKSI_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
        }
    }

    public static SubLObject with_sksi_break_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list30, listS(WITH_SKSI_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
    }

    public static final SubLObject with_sksi_sks_error_handling_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, mode, $list_alt22), listS(CLET, list(list($sksi_sks_error_handling_mode$, mode)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_sksi_sks_error_handling_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, mode, $list27), listS(CLET, list(list($sksi_sks_error_handling_mode$, mode)), append(body, NIL)));
    }

    public static final SubLObject with_sksi_ignore_sks_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SKSI_SKS_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_ignore_sks_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_SKS_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
    }

    public static final SubLObject with_sksi_warn_on_sks_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SKSI_SKS_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_warn_on_sks_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_SKS_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
    }

    public static final SubLObject with_sksi_break_on_sks_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt25, listS(WITH_SKSI_SKS_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
        }
    }

    public static SubLObject with_sksi_break_on_sks_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list30, listS(WITH_SKSI_SKS_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
    }

    public static final SubLObject with_sksi_registration_error_handling_mode_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mode = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            mode = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(CHECK_TYPE, mode, $list_alt22), listS(CLET, list(list($sksi_registration_error_handling_mode$, mode)), append(body, NIL)));
            }
        }
    }

    public static SubLObject with_sksi_registration_error_handling_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        mode = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(CHECK_TYPE, mode, $list27), listS(CLET, list(list($sksi_registration_error_handling_mode$, mode)), append(body, NIL)));
    }

    public static final SubLObject with_sksi_ignore_registration_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_ignore_registration_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $IGNORE, append(body, NIL));
    }

    public static final SubLObject with_sksi_warn_on_registration_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
        }
    }

    public static SubLObject with_sksi_warn_on_registration_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $WARN, append(body, NIL));
    }

    public static final SubLObject with_sksi_break_on_registration_errors_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt25, listS(WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
        }
    }

    public static SubLObject with_sksi_break_on_registration_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list30, listS(WITH_SKSI_REGISTRATION_ERROR_HANDLING_MODE, $BREAK, append(body, NIL)));
    }

    public static final SubLObject with_sksi_tracing_to_string_stream_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject result = NIL;
                    SubLObject trace_level = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    result = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt30);
                    trace_level = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject string_stream = $sym31$STRING_STREAM;
                            return list(CLET, list(bq_cons(string_stream, $list_alt32)), list(CLET, list(list($sksi_trace_stream$, string_stream)), listS(WITH_SKSI_TRACE_LEVEL, list(trace_level), append(body, NIL))), list(CSETQ, result, list(GET_OUTPUT_STREAM_STRING, string_stream)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt30);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sksi_tracing_to_string_stream(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject result = NIL;
        SubLObject trace_level = NIL;
        destructuring_bind_must_consp(current, datum, $list35);
        result = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list35);
        trace_level = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject string_stream = $sym36$STRING_STREAM;
            return list(CLET, list(bq_cons(string_stream, $list37)), list(CLET, list(list($sksi_trace_stream$, string_stream)), listS(WITH_SKSI_TRACE_LEVEL, list(trace_level), append(body, NIL))), list(CSETQ, result, list(GET_OUTPUT_STREAM_STRING, string_stream)));
        }
        cdestructuring_bind_error(datum, $list35);
        return NIL;
    }

    public static final SubLObject sksi_violation_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $sksi_violations$.getGlobalValue());
    }

    public static SubLObject sksi_violation_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $sksi_violations$.getGlobalValue());
    }

    public static final SubLObject sksi_violations_alt() {
        return $sksi_violations$.getGlobalValue();
    }

    public static SubLObject sksi_violations() {
        return $sksi_violations$.getGlobalValue();
    }

    public static final SubLObject sksi_violation_message_alt(SubLObject violation, SubLObject result) {
        {
            SubLObject pcase_var = violation;
            if (pcase_var.eql($SKSI_MISSING_DECODINGS)) {
                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_missing_decodings_message(result);
            } else {
                if (pcase_var.eql($SKSI_MISSING_ENCODINGS)) {
                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_missing_encodings_message(result);
                } else {
                    if (pcase_var.eql($SKSI_MISSING_FIELDS)) {
                        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_missing_fields_message(result);
                    } else {
                        if (pcase_var.eql($SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL)) {
                            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_missing_physical_field_for_indexical_message(result);
                        } else {
                            if (pcase_var.eql($SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL)) {
                                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_missing_logical_field_for_indexical_message(result);
                            } else {
                                if (pcase_var.eql($SKSI_MISSING_REQUIRED_FIELD_VALUE)) {
                                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_missing_required_field_value_message(result);
                                } else {
                                    if (pcase_var.eql($SKSI_LIT_MS_ARG_MISMATCH)) {
                                        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_lit_ms_arg_mismatch_message(result);
                                    } else {
                                        if (pcase_var.eql($SKSI_UNREFORMULATABLE)) {
                                            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_unreformulatable_message(result);
                                        } else {
                                            if (pcase_var.eql($SKSI_COMPARISON_ASENT_INAPPLICABLE)) {
                                                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_comparison_asent_inapplicable_message(result);
                                            } else {
                                                if (pcase_var.eql($SKSI_COMPARISON_OPERATOR_FORBIDDEN)) {
                                                    return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_comparison_operator_forbidden_message(result);
                                                } else {
                                                    if (pcase_var.eql($SKSI_LIST_LENGTH_MISMATCH)) {
                                                        return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_list_length_mismatch_message(result);
                                                    } else {
                                                        if (pcase_var.eql($SKSI_EVALUATE_CSQL_UNPRODUCIBLE)) {
                                                            return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_evaluate_csql_unproducible_message(result);
                                                        } else {
                                                            if (pcase_var.eql($SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE)) {
                                                                return com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging.sksi_unknown_sentence_csql_unproducible_message(result);
                                                            } else {
                                                                return Errors.cerror($$$Continue_anyway, $str_alt51$Unknown_violation__s_, violation);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sksi_violation_message(final SubLObject violation, final SubLObject result) {
        if (violation.eql($SKSI_MISSING_DECODINGS)) {
            return sksi_missing_decodings_message(result);
        }
        if (violation.eql($SKSI_MISSING_ENCODINGS)) {
            return sksi_missing_encodings_message(result);
        }
        if (violation.eql($SKSI_MISSING_FIELDS)) {
            return sksi_missing_fields_message(result);
        }
        if (violation.eql($SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL)) {
            return sksi_missing_physical_field_for_indexical_message(result);
        }
        if (violation.eql($SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL)) {
            return sksi_missing_logical_field_for_indexical_message(result);
        }
        if (violation.eql($SKSI_MISSING_REQUIRED_FIELD_VALUE)) {
            return sksi_missing_required_field_value_message(result);
        }
        if (violation.eql($SKSI_LIT_MS_ARG_MISMATCH)) {
            return sksi_lit_ms_arg_mismatch_message(result);
        }
        if (violation.eql($SKSI_UNREFORMULATABLE)) {
            return sksi_unreformulatable_message(result);
        }
        if (violation.eql($SKSI_COMPARISON_ASENT_INAPPLICABLE)) {
            return sksi_comparison_asent_inapplicable_message(result);
        }
        if (violation.eql($SKSI_COMPARISON_OPERATOR_FORBIDDEN)) {
            return sksi_comparison_operator_forbidden_message(result);
        }
        if (violation.eql($SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND)) {
            return sksi_comparison_asent_no_variable_found_message(result);
        }
        if (violation.eql($SKSI_LIST_LENGTH_MISMATCH)) {
            return sksi_list_length_mismatch_message(result);
        }
        if (violation.eql($SKSI_EVALUATE_CSQL_UNPRODUCIBLE)) {
            return sksi_evaluate_csql_unproducible_message(result);
        }
        if (violation.eql($SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE)) {
            return sksi_unknown_sentence_csql_unproducible_message(result);
        }
        return Errors.cerror($$$Continue_anyway, $str57$Unknown_violation__s_, violation);
    }

    public static final SubLObject sksi_missing_decodings_message_alt(SubLObject logical_field) {
        return cconcatenate($str_alt52$Could_not_find_decodings_for_, new SubLObject[]{ format_nil_s_no_copy(logical_field), $str_alt53$_ });
    }

    public static SubLObject sksi_missing_decodings_message(final SubLObject logical_field) {
        return cconcatenate($$$Could_not_find_decodings_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(logical_field), $str24$_ });
    }

    public static final SubLObject sksi_missing_encodings_message_alt(SubLObject physical_field_indexical) {
        return cconcatenate($str_alt54$Could_not_find_encodings_for_, new SubLObject[]{ format_nil_s_no_copy(physical_field_indexical), $str_alt53$_ });
    }

    public static SubLObject sksi_missing_encodings_message(final SubLObject physical_field_indexical) {
        return cconcatenate($$$Could_not_find_encodings_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(physical_field_indexical), $str24$_ });
    }

    public static final SubLObject sksi_missing_fields_message_alt(SubLObject meaning_sentence_arg) {
        return cconcatenate($str_alt55$Could_not_find_fields_for_, new SubLObject[]{ format_nil_s_no_copy(meaning_sentence_arg), $str_alt53$_ });
    }

    public static SubLObject sksi_missing_fields_message(final SubLObject meaning_sentence_arg) {
        return cconcatenate($$$Could_not_find_fields_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(meaning_sentence_arg), $str24$_ });
    }

    public static final SubLObject sksi_missing_physical_field_for_indexical_message_alt(SubLObject physical_field_indexical) {
        return cconcatenate($str_alt56$Could_not_find_physical_field_for, new SubLObject[]{ format_nil_s_no_copy(physical_field_indexical), $str_alt53$_ });
    }

    public static SubLObject sksi_missing_physical_field_for_indexical_message(final SubLObject physical_field_indexical) {
        return cconcatenate($str61$Could_not_find_physical_field_for, new SubLObject[]{ format_nil.format_nil_s_no_copy(physical_field_indexical), $str24$_ });
    }

    public static final SubLObject sksi_missing_logical_field_for_indexical_message_alt(SubLObject logical_field_indexical) {
        return cconcatenate($str_alt57$Could_not_find_logical_field_for_, new SubLObject[]{ format_nil_s_no_copy(logical_field_indexical), $str_alt53$_ });
    }

    public static SubLObject sksi_missing_logical_field_for_indexical_message(final SubLObject logical_field_indexical) {
        return cconcatenate($str62$Could_not_find_logical_field_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(logical_field_indexical), $str24$_ });
    }

    public static final SubLObject sksi_missing_required_field_value_message_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject physical_field = NIL;
            SubLObject physical_schema = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            physical_field = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt58);
            physical_schema = current.first();
            current = current.rest();
            if (NIL == current) {
                return cconcatenate($str_alt59$Missing_a_value_for_, new SubLObject[]{ format_nil_s_no_copy(physical_field), $str_alt60$__which_is_a___requiredFields_for, format_nil_s_no_copy(physical_schema), $str_alt53$_ });
            } else {
                cdestructuring_bind_error(datum, $list_alt58);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_missing_required_field_value_message(final SubLObject args) {
        SubLObject physical_field = NIL;
        SubLObject physical_schema = NIL;
        destructuring_bind_must_consp(args, args, $list63);
        physical_field = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list63);
        physical_schema = current.first();
        current = current.rest();
        if (NIL == current) {
            return cconcatenate($$$Missing_a_value_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(physical_field), $str65$__which_is_a___requiredFields_for, format_nil.format_nil_s_no_copy(physical_schema), $str24$_ });
        }
        cdestructuring_bind_error(args, $list63);
        return NIL;
    }

    public static final SubLObject sksi_lit_ms_arg_mismatch_message_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject lit_arg = NIL;
            SubLObject meaning_sentence_arg = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt61);
            lit_arg = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt61);
            meaning_sentence_arg = current.first();
            current = current.rest();
            if (NIL == current) {
                return cconcatenate($str_alt62$Mismatch_between_literal_argument, new SubLObject[]{ format_nil_s_no_copy(lit_arg), $str_alt63$_and_meaning_sentence_argument_, format_nil_s_no_copy(meaning_sentence_arg), $str_alt53$_ });
            } else {
                cdestructuring_bind_error(datum, $list_alt61);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_lit_ms_arg_mismatch_message(final SubLObject args) {
        SubLObject lit_arg = NIL;
        SubLObject meaning_sentence_arg = NIL;
        destructuring_bind_must_consp(args, args, $list66);
        lit_arg = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list66);
        meaning_sentence_arg = current.first();
        current = current.rest();
        if (NIL == current) {
            return cconcatenate($str67$Mismatch_between_literal_argument, new SubLObject[]{ format_nil.format_nil_s_no_copy(lit_arg), $$$_and_meaning_sentence_argument_, format_nil.format_nil_s_no_copy(meaning_sentence_arg), $str24$_ });
        }
        cdestructuring_bind_error(args, $list66);
        return NIL;
    }

    public static final SubLObject sksi_unreformulatable_message_alt(SubLObject expression) {
        return cconcatenate(format_nil_s_no_copy(expression), $str_alt64$_unreformulatable_);
    }

    public static SubLObject sksi_unreformulatable_message(final SubLObject expression) {
        return cconcatenate(format_nil.format_nil_s_no_copy(expression), $str69$_unreformulatable_);
    }

    public static final SubLObject sksi_comparison_asent_inapplicable_message_alt(SubLObject expression) {
        return cconcatenate(format_nil_s_no_copy(expression), $str_alt65$_inapplicable_);
    }

    public static SubLObject sksi_comparison_asent_inapplicable_message(final SubLObject expression) {
        return cconcatenate(format_nil.format_nil_s_no_copy(expression), $str70$_inapplicable_);
    }

    public static final SubLObject sksi_comparison_operator_forbidden_message_alt(SubLObject operator) {
        return cconcatenate(format_nil_s_no_copy(operator), $str_alt66$_forbidden_);
    }

    public static SubLObject sksi_comparison_operator_forbidden_message(final SubLObject operator) {
        return cconcatenate(format_nil.format_nil_s_no_copy(operator), $str71$_forbidden_);
    }

    public static SubLObject sksi_comparison_asent_no_variable_found_message(final SubLObject operator) {
        return cconcatenate(format_nil.format_nil_s_no_copy(operator), $str72$_has_no_variables_so_can_t_sent_t);
    }

    public static final SubLObject sksi_list_length_mismatch_message_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject list0 = NIL;
            SubLObject list1 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt67);
            list0 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt67);
            list1 = current.first();
            current = current.rest();
            if (NIL == current) {
                return cconcatenate($str_alt68$Mismatch_between_lengths_of_, new SubLObject[]{ format_nil_s_no_copy(list0), $str_alt69$_and_, format_nil_s_no_copy(list1), $str_alt53$_ });
            } else {
                cdestructuring_bind_error(datum, $list_alt67);
            }
        }
        return NIL;
    }

    public static SubLObject sksi_list_length_mismatch_message(final SubLObject args) {
        SubLObject list0 = NIL;
        SubLObject list2 = NIL;
        destructuring_bind_must_consp(args, args, $list73);
        list0 = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list73);
        list2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return cconcatenate($$$Mismatch_between_lengths_of_, new SubLObject[]{ format_nil.format_nil_s_no_copy(list0), $$$_and_, format_nil.format_nil_s_no_copy(list2), $str24$_ });
        }
        cdestructuring_bind_error(args, $list73);
        return NIL;
    }

    public static final SubLObject sksi_evaluate_csql_unproducible_message_alt(SubLObject expression) {
        return cconcatenate($str_alt70$No_CSQL_can_be_generated_for_the_, new SubLObject[]{ format_nil_a_no_copy(expression), $str_alt53$_ });
    }

    public static SubLObject sksi_evaluate_csql_unproducible_message(final SubLObject expression) {
        return cconcatenate($str76$No_CSQL_can_be_generated_for_the_, new SubLObject[]{ format_nil.format_nil_a_no_copy(expression), $str24$_ });
    }

    public static final SubLObject sksi_unknown_sentence_csql_unproducible_message_alt(SubLObject expression) {
        return cconcatenate($str_alt71$No_CSQL_can_be_generated_for_the_, new SubLObject[]{ format_nil_a_no_copy(expression), $str_alt53$_ });
    }

    public static SubLObject sksi_unknown_sentence_csql_unproducible_message(final SubLObject expression) {
        return cconcatenate($str77$No_CSQL_can_be_generated_for_the_, new SubLObject[]{ format_nil.format_nil_a_no_copy(expression), $str24$_ });
    }

    public static final SubLObject with_sksi_violation_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt72);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject violation = NIL;
                    SubLObject message_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    violation = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt72);
                    message_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject result = $sym73$RESULT;
                            return list(CLET, list(result), listS(CCATCH, violation, result, append(body, NIL)), list(PWHEN, result, list(CSETQ, message_var, list(SKSI_VIOLATION_MESSAGE, violation, result))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt72);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sksi_violation_handling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject violation = NIL;
        SubLObject message_var = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        violation = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        message_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject result = $sym79$RESULT;
            return list(CLET, list(result), listS(CCATCH, violation, result, append(body, NIL)), list(PWHEN, result, list(CSETQ, message_var, list(SKSI_VIOLATION_MESSAGE, violation, result))));
        }
        cdestructuring_bind_error(datum, $list78);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("LEVEL"), makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLString $str_alt6$SKSI_ = makeString("SKSI ");

    static private final SubLList $list_alt7 = list(makeString("~%"));

    static private final SubLList $list_alt8 = list(list(makeSymbol("FORCE-OUTPUT"), makeSymbol("*SKSI-TRACE-STREAM*")));

    static private final SubLList $list_alt9 = list(list(makeSymbol("TRACE-LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("*SKSI-TRACE-LEVEL*")));

    static private final SubLList $list_alt14 = list(list(makeSymbol("SKSI-UNTRACE")));

    public static final SubLObject with_sksi_crm_violation_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt76);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject message_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    message_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_DECODINGS, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_ENCODINGS, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_FIELDS, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_REQUIRED_FIELD_VALUE, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_LIT_MS_ARG_MISMATCH, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_UNREFORMULATABLE, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_COMPARISON_ASENT_INAPPLICABLE, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_COMPARISON_OPERATOR_FORBIDDEN, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_LIST_LENGTH_MISMATCH, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_EVALUATE_CSQL_UNPRODUCIBLE, message_var), listS(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE, message_var), append(body, NIL))))))))))))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt76);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sksi_crm_violation_handling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject message_var = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        message_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_DECODINGS, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_ENCODINGS, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_FIELDS, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_REQUIRED_FIELD_VALUE, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_LIT_MS_ARG_MISMATCH, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_UNREFORMULATABLE, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_COMPARISON_ASENT_INAPPLICABLE, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_COMPARISON_OPERATOR_FORBIDDEN, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_LIST_LENGTH_MISMATCH, message_var), list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_EVALUATE_CSQL_UNPRODUCIBLE, message_var), listS(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE, message_var), append(body, NIL)))))))))))))));
        }
        cdestructuring_bind_error(datum, $list82);
        return NIL;
    }

    static private final SubLList $list_alt15 = list(makeKeyword("IGNORE"), $WARN, makeKeyword("BREAK"));

    static private final SubLList $list_alt20 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt22 = list(makeSymbol("VALID-SKSI-ERROR-HANDLING-MODE-P"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("*INFERENCE-DEBUG?*"), T));

    static private final SubLList $list_alt30 = list(list(makeSymbol("RESULT"), makeSymbol("TRACE-LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym31$STRING_STREAM = makeUninternedSymbol("STRING-STREAM");

    static private final SubLList $list_alt32 = list(list(makeSymbol("MAKE-STRING-OUTPUT-STREAM")));

    static private final SubLList $list_alt36 = list(new SubLObject[]{ makeKeyword("SKSI-MISSING-DECODINGS"), makeKeyword("SKSI-MISSING-ENCODINGS"), makeKeyword("SKSI-MISSING-FIELDS"), makeKeyword("SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL"), makeKeyword("SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL"), makeKeyword("SKSI-MISSING-REQUIRED-FIELD-VALUE"), makeKeyword("SKSI-LIT-MS-ARG-MISMATCH"), makeKeyword("SKSI-UNREFORMULATABLE"), makeKeyword("SKSI-COMPARISON-ASENT-INAPPLICABLE"), makeKeyword("SKSI-COMPARISON-OPERATOR-FORBIDDEN"), makeKeyword("SKSI-LIST-LENGTH-MISMATCH") });

    public static final SubLObject with_sksi_translation_violation_handling_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt76);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject message_var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt76);
                    message_var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_DECODINGS, message_var), listS(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_ENCODINGS, message_var), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt76);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_sksi_translation_violation_handling(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject message_var = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        message_var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_DECODINGS, message_var), listS(WITH_SKSI_VIOLATION_HANDLING, list($SKSI_MISSING_ENCODINGS, message_var), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list82);
        return NIL;
    }

    public static SubLObject clear_sksi_caches() {
        data_parser.clear_semantic_etl_upper_ontology_termP();
        data_parser.clear_data_parser_all_genls();
        data_parser.clear_data_parser_all_isa();
        sksi_batch_translate.clear_sksi_schema_translation_lifting_rule();
        sksi_batch_translate.clear_sksi_get_datum_var();
        sksi_batch_translate.clear_sksi_get_raw_var();
        sksi_batch_translate.clear_sksi_get_arg_var();
        sksi_batch_translate.clear_sksi_schema_translation_lifting_rule();
        sksi_batch_translate.clear_sksi_get_datum_var();
        sksi_batch_translate.clear_sksi_get_raw_var();
        sksi_batch_translate.clear_sksi_get_arg_var();
        mapping_engine.clear_date_genls();
        reformulator_module_quantifier_unifier_3.clear_all_fort_instances_cached();
        sksi_smt.clear_sksi_smt_compile_param_definitions();
        sksi_smt.clear_sksi_smt_column_or_fort_name();
        sksi_smt.clear_sksi_smt_compile_param_definitions();
        sksi_smt.clear_sksi_smt_column_or_fort_name();
        simple_db.clear_simple_sksi_terms();
        simple_db.clear_simple_sksi_assertions_for_sks();
        simple_db.clear_simple_sksi_terms();
        simple_db.clear_simple_sksi_assertions_for_sks();
        sksi_removal_module_generation.clear_generate_sksi_slrm_required_function();
        sksi_removal_module_generation.clear_generate_sksi_slrm_required_function();
        sksi_report_generation.clear_run_column_query();
        sksi_report_generation.clear_run_column_query();
        semantic_etl_bus.clear_semantic_etl_fuse_databases();
        sksi_kb_accessors.clear_sksi_content_mts();
        sksi_reformulate.clear_cmls_decoding_table();
        sksi_result_set_iterators.clear_cached_sqlrs_all_rows();
        sksi_sks_interaction.clear_get_results_from_sksi_web_page_subl_method_cached();
        sksi_sks_interaction.clear_cached_get_result_set_from_sql_source();
        sksi_sks_interaction.clear_cached_get_result_set_from_sparql_source();
        sksi_kb_accessors.clear_sksi_content_mts();
        sksi_reformulate.clear_cmls_decoding_table();
        sksi_result_set_iterators.clear_cached_sqlrs_all_rows();
        sksi_sks_interaction.clear_get_results_from_sksi_web_page_subl_method_cached();
        sksi_sks_interaction.clear_cached_get_result_set_from_sql_source();
        sksi_sks_interaction.clear_cached_get_result_set_from_sparql_source();
        data_parser.clear_semantic_etl_upper_ontology_termP();
        data_parser.clear_data_parser_all_genls();
        data_parser.clear_data_parser_all_isa();
        mapping_engine.clear_date_genls();
        reformulator_module_quantifier_unifier_3.clear_all_fort_instances_cached();
        semantic_etl_bus.clear_semantic_etl_fuse_databases();
        return NIL;
    }

    static private final SubLString $str_alt51$Unknown_violation__s_ = makeString("Unknown violation ~s.");

    static private final SubLString $str_alt52$Could_not_find_decodings_for_ = makeString("Could not find decodings for ");

    static private final SubLString $str_alt53$_ = makeString(".");

    static private final SubLString $str_alt54$Could_not_find_encodings_for_ = makeString("Could not find encodings for ");

    static private final SubLString $str_alt55$Could_not_find_fields_for_ = makeString("Could not find fields for ");

    static private final SubLString $str_alt56$Could_not_find_physical_field_for = makeString("Could not find physical field for indexical ");

    static private final SubLString $str_alt57$Could_not_find_logical_field_for_ = makeString("Could not find logical field for indexical ");

    static private final SubLList $list_alt58 = list(makeSymbol("PHYSICAL-FIELD"), makeSymbol("PHYSICAL-SCHEMA"));

    static private final SubLString $str_alt59$Missing_a_value_for_ = makeString("Missing a value for ");

    static private final SubLString $str_alt60$__which_is_a___requiredFields_for = makeString(", which is a #$requiredFields for ");

    static private final SubLList $list_alt61 = list(makeSymbol("LIT-ARG"), makeSymbol("MEANING-SENTENCE-ARG"));

    static private final SubLString $str_alt62$Mismatch_between_literal_argument = makeString("Mismatch between literal argument ");

    static private final SubLString $str_alt63$_and_meaning_sentence_argument_ = makeString(" and meaning sentence argument ");

    static private final SubLString $str_alt64$_unreformulatable_ = makeString(" unreformulatable.");

    static private final SubLString $str_alt65$_inapplicable_ = makeString(" inapplicable.");

    static private final SubLString $str_alt66$_forbidden_ = makeString(" forbidden.");

    static private final SubLList $list_alt67 = list(makeSymbol("LIST0"), makeSymbol("LIST1"));

    public static SubLObject declare_sksi_debugging_file() {
        declareFunction("sksi_trace", "SKSI-TRACE", 0, 1, false);
        declareFunction("sksi_untrace", "SKSI-UNTRACE", 0, 0, false);
        declareFunction("sksi_set_trace_level", "SKSI-SET-TRACE-LEVEL", 1, 0, false);
        declareFunction("sksi_cinc_trace_level", "SKSI-CINC-TRACE-LEVEL", 0, 0, false);
        declareFunction("sksi_trace_level_exceeds_minimumP", "SKSI-TRACE-LEVEL-EXCEEDS-MINIMUM?", 1, 0, false);
        declareMacro("sksi_note", "SKSI-NOTE");
        declareMacro("with_sksi_trace_level", "WITH-SKSI-TRACE-LEVEL");
        declareFunction("valid_sksi_error_handling_mode_p", "VALID-SKSI-ERROR-HANDLING-MODE-P", 1, 0, false);
        declareFunction("valid_atomic_sksi_error_handling_mode_p", "VALID-ATOMIC-SKSI-ERROR-HANDLING-MODE-P", 1, 0, false);
        declareFunction("sksi_ignore_errors", "SKSI-IGNORE-ERRORS", 0, 0, false);
        declareFunction("sksi_warn_on_errors", "SKSI-WARN-ON-ERRORS", 0, 0, false);
        declareFunction("sksi_break_on_errors", "SKSI-BREAK-ON-ERRORS", 0, 0, false);
        declareFunction("sksi_error_handling_mode", "SKSI-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("sksi_error", "SKSI-ERROR", 1, 0, false);
        declareFunction("sksi_sks_error_handling_mode", "SKSI-SKS-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("sksi_registration_error_handling_mode", "SKSI-REGISTRATION-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("sksi_default_error_handling_mode", "SKSI-DEFAULT-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("sksi_default_sks_error_handling_mode", "SKSI-DEFAULT-SKS-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("sksi_default_registration_error_handling_mode", "SKSI-DEFAULT-REGISTRATION-ERROR-HANDLING-MODE", 0, 0, false);
        declareFunction("lookup_string_in_sksi_custom_error_handling_table", "LOOKUP-STRING-IN-SKSI-CUSTOM-ERROR-HANDLING-TABLE", 1, 0, false);
        declareFunction("sksi_possibly_act_on_custom_error_action", "SKSI-POSSIBLY-ACT-ON-CUSTOM-ERROR-ACTION", 1, 0, false);
        declareFunction("sksi_possibly_act_on_custom_sks_error_action", "SKSI-POSSIBLY-ACT-ON-CUSTOM-SKS-ERROR-ACTION", 3, 0, false);
        declareFunction("sksi_ignore_errorsP", "SKSI-IGNORE-ERRORS?", 0, 0, false);
        declareFunction("sksi_warn_on_errorsP", "SKSI-WARN-ON-ERRORS?", 0, 0, false);
        declareFunction("sksi_break_on_errorsP", "SKSI-BREAK-ON-ERRORS?", 0, 0, false);
        declareFunction("sksi_ignore_sks_errorsP", "SKSI-IGNORE-SKS-ERRORS?", 0, 0, false);
        declareFunction("sksi_warn_on_sks_errorsP", "SKSI-WARN-ON-SKS-ERRORS?", 0, 0, false);
        declareFunction("sksi_break_on_sks_errorsP", "SKSI-BREAK-ON-SKS-ERRORS?", 0, 0, false);
        declareFunction("sksi_ignore_registration_errorsP", "SKSI-IGNORE-REGISTRATION-ERRORS?", 0, 0, false);
        declareFunction("sksi_warn_on_registration_errorsP", "SKSI-WARN-ON-REGISTRATION-ERRORS?", 0, 0, false);
        declareFunction("sksi_break_on_registration_errorsP", "SKSI-BREAK-ON-REGISTRATION-ERRORS?", 0, 0, false);
        declareMacro("with_sksi_error_handling_mode", "WITH-SKSI-ERROR-HANDLING-MODE");
        declareMacro("with_sksi_ignore_errors", "WITH-SKSI-IGNORE-ERRORS");
        declareMacro("with_sksi_warn_on_errors", "WITH-SKSI-WARN-ON-ERRORS");
        declareMacro("with_sksi_break_on_errors", "WITH-SKSI-BREAK-ON-ERRORS");
        declareMacro("with_sksi_sks_error_handling_mode", "WITH-SKSI-SKS-ERROR-HANDLING-MODE");
        declareMacro("with_sksi_ignore_sks_errors", "WITH-SKSI-IGNORE-SKS-ERRORS");
        declareMacro("with_sksi_warn_on_sks_errors", "WITH-SKSI-WARN-ON-SKS-ERRORS");
        declareMacro("with_sksi_break_on_sks_errors", "WITH-SKSI-BREAK-ON-SKS-ERRORS");
        declareMacro("with_sksi_registration_error_handling_mode", "WITH-SKSI-REGISTRATION-ERROR-HANDLING-MODE");
        declareMacro("with_sksi_ignore_registration_errors", "WITH-SKSI-IGNORE-REGISTRATION-ERRORS");
        declareMacro("with_sksi_warn_on_registration_errors", "WITH-SKSI-WARN-ON-REGISTRATION-ERRORS");
        declareMacro("with_sksi_break_on_registration_errors", "WITH-SKSI-BREAK-ON-REGISTRATION-ERRORS");
        declareMacro("with_sksi_tracing_to_string_stream", "WITH-SKSI-TRACING-TO-STRING-STREAM");
        declareFunction("sksi_violation_p", "SKSI-VIOLATION-P", 1, 0, false);
        declareFunction("sksi_violations", "SKSI-VIOLATIONS", 0, 0, false);
        declareFunction("sksi_violation_message", "SKSI-VIOLATION-MESSAGE", 2, 0, false);
        declareFunction("sksi_missing_decodings_message", "SKSI-MISSING-DECODINGS-MESSAGE", 1, 0, false);
        declareFunction("sksi_missing_encodings_message", "SKSI-MISSING-ENCODINGS-MESSAGE", 1, 0, false);
        declareFunction("sksi_missing_fields_message", "SKSI-MISSING-FIELDS-MESSAGE", 1, 0, false);
        declareFunction("sksi_missing_physical_field_for_indexical_message", "SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL-MESSAGE", 1, 0, false);
        declareFunction("sksi_missing_logical_field_for_indexical_message", "SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL-MESSAGE", 1, 0, false);
        declareFunction("sksi_missing_required_field_value_message", "SKSI-MISSING-REQUIRED-FIELD-VALUE-MESSAGE", 1, 0, false);
        declareFunction("sksi_lit_ms_arg_mismatch_message", "SKSI-LIT-MS-ARG-MISMATCH-MESSAGE", 1, 0, false);
        declareFunction("sksi_unreformulatable_message", "SKSI-UNREFORMULATABLE-MESSAGE", 1, 0, false);
        declareFunction("sksi_comparison_asent_inapplicable_message", "SKSI-COMPARISON-ASENT-INAPPLICABLE-MESSAGE", 1, 0, false);
        declareFunction("sksi_comparison_operator_forbidden_message", "SKSI-COMPARISON-OPERATOR-FORBIDDEN-MESSAGE", 1, 0, false);
        declareFunction("sksi_comparison_asent_no_variable_found_message", "SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND-MESSAGE", 1, 0, false);
        declareFunction("sksi_list_length_mismatch_message", "SKSI-LIST-LENGTH-MISMATCH-MESSAGE", 1, 0, false);
        declareFunction("sksi_evaluate_csql_unproducible_message", "SKSI-EVALUATE-CSQL-UNPRODUCIBLE-MESSAGE", 1, 0, false);
        declareFunction("sksi_unknown_sentence_csql_unproducible_message", "SKSI-UNKNOWN-SENTENCE-CSQL-UNPRODUCIBLE-MESSAGE", 1, 0, false);
        declareMacro("with_sksi_violation_handling", "WITH-SKSI-VIOLATION-HANDLING");
        declareMacro("with_sksi_crm_violation_handling", "WITH-SKSI-CRM-VIOLATION-HANDLING");
        declareMacro("with_sksi_translation_violation_handling", "WITH-SKSI-TRANSLATION-VIOLATION-HANDLING");
        declareFunction("clear_sksi_caches", "CLEAR-SKSI-CACHES", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt68$Mismatch_between_lengths_of_ = makeString("Mismatch between lengths of ");

    static private final SubLString $str_alt69$_and_ = makeString(" and ");

    static private final SubLString $str_alt70$No_CSQL_can_be_generated_for_the_ = makeString("No CSQL can be generated for the evaluate expression ");

    static private final SubLString $str_alt71$No_CSQL_can_be_generated_for_the_ = makeString("No CSQL can be generated for the sksiUnknownSentence expression ");

    static private final SubLList $list_alt72 = list(list(makeSymbol("VIOLATION"), makeSymbol("MESSAGE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym73$RESULT = makeUninternedSymbol("RESULT");

    static private final SubLList $list_alt76 = list(list(makeSymbol("MESSAGE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject init_sksi_debugging_file_alt() {
        defconstant("*SKSI-MIN-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*SKSI-TRACE-LEVEL*", $sksi_min_trace_level$.getGlobalValue());
        defparameter("*SKSI-TRACE-STREAM*", T);
        defparameter("*SKSI-ERROR-HANDLING-MODE*", NIL);
        defparameter("*SKSI-SKS-ERROR-HANDLING-MODE*", NIL);
        defparameter("*SKSI-REGISTRATION-ERROR-HANDLING-MODE*", NIL);
        deflexical("*SKSI-VIOLATIONS*", $list_alt36);
        return NIL;
    }

    public static SubLObject init_sksi_debugging_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*SKSI-MIN-TRACE-LEVEL*", ZERO_INTEGER);
            defparameter("*SKSI-TRACE-LEVEL*", $sksi_min_trace_level$.getGlobalValue());
            defparameter("*SKSI-TRACE-STREAM*", T);
            defparameter("*SKSI-ERROR-HANDLING-MODE*", NIL);
            defparameter("*SKSI-SKS-ERROR-HANDLING-MODE*", NIL);
            defparameter("*SKSI-REGISTRATION-ERROR-HANDLING-MODE*", NIL);
            defparameter("*SKSI-CUSTOM-ERROR-HANDLING-TABLE*", $list20);
            defparameter("*SKSI-CUSTOM-ERROR-HANDLING-DEFAULT*", $WARN);
            deflexical("*SKSI-VIOLATIONS*", $list41);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SKSI-VIOLATIONS*", $list_alt36);
        }
        return NIL;
    }

    public static SubLObject init_sksi_debugging_file_Previous() {
        defconstant("*SKSI-MIN-TRACE-LEVEL*", ZERO_INTEGER);
        defparameter("*SKSI-TRACE-LEVEL*", $sksi_min_trace_level$.getGlobalValue());
        defparameter("*SKSI-TRACE-STREAM*", T);
        defparameter("*SKSI-ERROR-HANDLING-MODE*", NIL);
        defparameter("*SKSI-SKS-ERROR-HANDLING-MODE*", NIL);
        defparameter("*SKSI-REGISTRATION-ERROR-HANDLING-MODE*", NIL);
        defparameter("*SKSI-CUSTOM-ERROR-HANDLING-TABLE*", $list20);
        defparameter("*SKSI-CUSTOM-ERROR-HANDLING-DEFAULT*", $WARN);
        deflexical("*SKSI-VIOLATIONS*", $list41);
        return NIL;
    }

    public static SubLObject setup_sksi_debugging_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_debugging_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_debugging_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_debugging_file();
    }

    static {
    }
}

/**
 * Total time: 205 ms
 */
