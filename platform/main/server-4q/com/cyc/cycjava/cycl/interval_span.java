/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INTERVAL-SPAN
 * source file: /cyc/top/cycl/interval-span.lisp
 * created:     2019/07/03 17:38:23
 */
public final class interval_span extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_interval_span_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_interval_span_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject interval_span_test_case_p(SubLObject interval_span_test_case) {
        return classes.subloop_instanceof_class(interval_span_test_case, INTERVAL_SPAN_TEST_CASE);
    }

    public static final SubLFile me = new interval_span();

 public static final String myName = "com.cyc.cycjava.cycl.interval_span";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_interval_span$ = makeSymbol("*DTP-INTERVAL-SPAN*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $interval_span_table$ = makeSymbol("*INTERVAL-SPAN-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INTERVAL_SPAN = makeSymbol("INTERVAL-SPAN");

    private static final SubLSymbol INTERVAL_SPAN_P = makeSymbol("INTERVAL-SPAN-P");

    static private final SubLList $list2 = list(makeSymbol("START"), makeSymbol("END"));

    static private final SubLList $list3 = list(makeKeyword("START"), makeKeyword("END"));

    static private final SubLList $list4 = list(makeSymbol("INT-SPAN-START"), makeSymbol("INT-SPAN-END"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-INT-SPAN-START"), makeSymbol("_CSETF-INT-SPAN-END"));

    private static final SubLSymbol PRINT_INTERVAL_SPAN = makeSymbol("PRINT-INTERVAL-SPAN");

    private static final SubLSymbol INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INTERVAL-SPAN-P"));

    private static final SubLSymbol INT_SPAN_START = makeSymbol("INT-SPAN-START");

    private static final SubLSymbol _CSETF_INT_SPAN_START = makeSymbol("_CSETF-INT-SPAN-START");

    private static final SubLSymbol INT_SPAN_END = makeSymbol("INT-SPAN-END");

    private static final SubLSymbol _CSETF_INT_SPAN_END = makeSymbol("_CSETF-INT-SPAN-END");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_INTERVAL_SPAN = makeSymbol("MAKE-INTERVAL-SPAN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INTERVAL_SPAN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTERVAL-SPAN-METHOD");

    private static final SubLString $str20$_INTERVAL_SPAN___S__S__ = makeString("<INTERVAL-SPAN (~S ~S)>");

    private static final SubLString $str22$_a_is_not_greater_than_or_equal_t = makeString("~a is not greater than or equal to ~a");

    private static final SubLString $$$Interval_Span_Test_Category = makeString("Interval Span Test Category");

    public static final SubLObject interval_span_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_interval_span(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject interval_span_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_interval_span(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject interval_span_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.interval_span.$interval_span_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject interval_span_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.interval_span.$interval_span_native.class ? T : NIL;
    }

    public static final SubLObject int_span_start_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTERVAL_SPAN_P);
        return v_object.getField2();
    }

    public static SubLObject int_span_start(final SubLObject v_object) {
        assert NIL != interval_span_p(v_object) : "! interval_span.interval_span_p(v_object) " + "interval_span.interval_span_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject int_span_end_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, INTERVAL_SPAN_P);
        return v_object.getField3();
    }

    public static SubLObject int_span_end(final SubLObject v_object) {
        assert NIL != interval_span_p(v_object) : "! interval_span.interval_span_p(v_object) " + "interval_span.interval_span_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_int_span_start_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTERVAL_SPAN_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_int_span_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != interval_span_p(v_object) : "! interval_span.interval_span_p(v_object) " + "interval_span.interval_span_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_int_span_end_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, INTERVAL_SPAN_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_int_span_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != interval_span_p(v_object) : "! interval_span.interval_span_p(v_object) " + "interval_span.interval_span_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_interval_span_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.interval_span.$interval_span_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($START)) {
                        _csetf_int_span_start(v_new, current_value);
                    } else {
                        if (pcase_var.eql($END)) {
                            _csetf_int_span_end(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_interval_span(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.interval_span.$interval_span_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($START)) {
                _csetf_int_span_start(v_new, current_value);
            } else
                if (pcase_var.eql($END)) {
                    _csetf_int_span_end(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_interval_span(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_INTERVAL_SPAN, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $START, int_span_start(obj));
        funcall(visitor_fn, obj, $SLOT, $END, int_span_end(obj));
        funcall(visitor_fn, obj, $END, MAKE_INTERVAL_SPAN, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_interval_span_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_interval_span(obj, visitor_fn);
    }

    public static final SubLObject print_interval_span_alt(SubLObject span, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt15$_INTERVAL_SPAN___S__S__, int_span_start(span), int_span_end(span));
        return span;
    }

    public static SubLObject print_interval_span(final SubLObject span, final SubLObject stream, final SubLObject depth) {
        format(stream, $str20$_INTERVAL_SPAN___S__S__, int_span_start(span), int_span_end(span));
        return span;
    }

    public static final SubLObject lookup_interval_span_alt(SubLObject start, SubLObject end) {
        {
            SubLObject start_spans = dictionary.dictionary_lookup($interval_span_table$.getGlobalValue(), start, NIL);
            return NIL != dictionary.dictionary_p(start_spans) ? ((SubLObject) (dictionary.dictionary_lookup_without_values(start_spans, end, NIL))) : NIL;
        }
    }

    public static SubLObject lookup_interval_span(final SubLObject start, final SubLObject end) {
        final SubLObject start_spans = dictionary.dictionary_lookup($interval_span_table$.getGlobalValue(), start, NIL);
        return NIL != dictionary.dictionary_p(start_spans) ? dictionary.dictionary_lookup_without_values(start_spans, end, NIL) : NIL;
    }

    public static final SubLObject new_interval_span_alt(SubLObject start, SubLObject end) {
        {
            SubLObject span = make_interval_span(list($START, start, $END, end));
            SubLObject start_spans = dictionary.dictionary_lookup_without_values($interval_span_table$.getGlobalValue(), start, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
            dictionary.dictionary_enter(start_spans, end, span);
            dictionary.dictionary_enter($interval_span_table$.getGlobalValue(), start, start_spans);
            return span;
        }
    }

    public static SubLObject new_interval_span(final SubLObject start, final SubLObject end) {
        final SubLObject span = make_interval_span(list($START, start, $END, end));
        final SubLObject start_spans = dictionary.dictionary_lookup_without_values($interval_span_table$.getGlobalValue(), start, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        dictionary.dictionary_enter(start_spans, end, span);
        dictionary.dictionary_enter($interval_span_table$.getGlobalValue(), start, start_spans);
        return span;
    }

    /**
     *
     *
     * @return INTERVAL-SPAN-P; with START and END as indices.
     */
    @LispMethod(comment = "@return INTERVAL-SPAN-P; with START and END as indices.")
    public static final SubLObject get_interval_span_alt(SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(start, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(end, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!end.numGE(start)) {
                    Errors.error($str_alt17$_a_is_not_greater_than_or_equal_t, end, start);
                }
            }
            {
                SubLObject existing = lookup_interval_span(start, end);
                if (NIL != existing) {
                    return existing;
                } else {
                    return new_interval_span(start, end);
                }
            }
        }
    }

    /**
     *
     *
     * @return INTERVAL-SPAN-P; with START and END as indices.
     */
    @LispMethod(comment = "@return INTERVAL-SPAN-P; with START and END as indices.")
    public static SubLObject get_interval_span(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(start) : "! subl_promotions.non_negative_integer_p(start) " + ("subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) ") + start;
        assert NIL != subl_promotions.non_negative_integer_p(end) : "! subl_promotions.non_negative_integer_p(end) " + ("subl_promotions.non_negative_integer_p(end) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(end) ") + end;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!end.numGE(start))) {
            Errors.error($str22$_a_is_not_greater_than_or_equal_t, end, start);
        }
        final SubLObject existing = lookup_interval_span(start, end);
        if (NIL != existing) {
            return existing;
        }
        return new_interval_span(start, end);
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the start index of INTERVAL-SPAN.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; the start index of INTERVAL-SPAN.")
    public static final SubLObject interval_span_start_alt(SubLObject v_interval_span) {
        SubLTrampolineFile.checkType(v_interval_span, INTERVAL_SPAN_P);
        return int_span_start(v_interval_span);
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the start index of INTERVAL-SPAN.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; the start index of INTERVAL-SPAN.")
    public static SubLObject interval_span_start(final SubLObject v_interval_span) {
        assert NIL != interval_span_p(v_interval_span) : "! interval_span.interval_span_p(v_interval_span) " + ("interval_span.interval_span_p(v_interval_span) " + "CommonSymbols.NIL != interval_span.interval_span_p(v_interval_span) ") + v_interval_span;
        return int_span_start(v_interval_span);
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the end index of INTERVAL-SPAN.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; the end index of INTERVAL-SPAN.")
    public static final SubLObject interval_span_end_alt(SubLObject v_interval_span) {
        SubLTrampolineFile.checkType(v_interval_span, INTERVAL_SPAN_P);
        return int_span_end(v_interval_span);
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the end index of INTERVAL-SPAN.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; the end index of INTERVAL-SPAN.")
    public static SubLObject interval_span_end(final SubLObject v_interval_span) {
        assert NIL != interval_span_p(v_interval_span) : "! interval_span.interval_span_p(v_interval_span) " + ("interval_span.interval_span_p(v_interval_span) " + "CommonSymbols.NIL != interval_span.interval_span_p(v_interval_span) ") + v_interval_span;
        return int_span_end(v_interval_span);
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the end minus the start of INTERVAL-SPAN.
    If start and end are indices between items, this should correspond to the number
    of items INTERVAL-SPAN spans.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; the end minus the start of INTERVAL-SPAN.\r\nIf start and end are indices between items, this should correspond to the number\r\nof items INTERVAL-SPAN spans.")
    public static final SubLObject interval_span_length_alt(SubLObject v_interval_span) {
        SubLTrampolineFile.checkType(v_interval_span, INTERVAL_SPAN_P);
        return subtract(int_span_end(v_interval_span), int_span_start(v_interval_span));
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; the end minus the start of INTERVAL-SPAN.
    If start and end are indices between items, this should correspond to the number
    of items INTERVAL-SPAN spans.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; the end minus the start of INTERVAL-SPAN.\r\nIf start and end are indices between items, this should correspond to the number\r\nof items INTERVAL-SPAN spans.")
    public static SubLObject interval_span_length(final SubLObject v_interval_span) {
        assert NIL != interval_span_p(v_interval_span) : "! interval_span.interval_span_p(v_interval_span) " + ("interval_span.interval_span_p(v_interval_span) " + "CommonSymbols.NIL != interval_span.interval_span_p(v_interval_span) ") + v_interval_span;
        return subtract(int_span_end(v_interval_span), int_span_start(v_interval_span));
    }

    /**
     *
     *
     * @return BOOLEAN; Is SPAN1 longer than SPAN2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is SPAN1 longer than SPAN2?")
    public static final SubLObject interval_span_G_alt(SubLObject span1, SubLObject span2) {
        SubLTrampolineFile.checkType(span1, INTERVAL_SPAN_P);
        SubLTrampolineFile.checkType(span2, INTERVAL_SPAN_P);
        return numG(interval_span_length(span1), interval_span_length(span2));
    }

    /**
     *
     *
     * @return BOOLEAN; Is SPAN1 longer than SPAN2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is SPAN1 longer than SPAN2?")
    public static SubLObject interval_span_G(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "! interval_span.interval_span_p(span1) " + ("interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) ") + span1;
        assert NIL != interval_span_p(span2) : "! interval_span.interval_span_p(span2) " + ("interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) ") + span2;
        return numG(interval_span_length(span1), interval_span_length(span2));
    }

    /**
     *
     *
     * @return BOOLEAN; Is SPAN1 shorter than SPAN2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is SPAN1 shorter than SPAN2?")
    public static final SubLObject interval_span_L_alt(SubLObject span1, SubLObject span2) {
        SubLTrampolineFile.checkType(span1, INTERVAL_SPAN_P);
        SubLTrampolineFile.checkType(span2, INTERVAL_SPAN_P);
        return numL(interval_span_length(span1), interval_span_length(span2));
    }

    /**
     *
     *
     * @return BOOLEAN; Is SPAN1 shorter than SPAN2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is SPAN1 shorter than SPAN2?")
    public static SubLObject interval_span_L(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "! interval_span.interval_span_p(span1) " + ("interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) ") + span1;
        assert NIL != interval_span_p(span2) : "! interval_span.interval_span_p(span2) " + ("interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) ") + span2;
        return numL(interval_span_length(span1), interval_span_length(span2));
    }

    /**
     * Used for sorting spans.
     *
     * @return BOOLEANP; T iff SPAN1 starts before SPAN2, or starts at the same place and ends earlier.
     */
    @LispMethod(comment = "Used for sorting spans.\r\n\r\n@return BOOLEANP; T iff SPAN1 starts before SPAN2, or starts at the same place and ends earlier.")
    public static final SubLObject interval_span_precedesP_alt(SubLObject span1, SubLObject span2) {
        SubLTrampolineFile.checkType(span1, INTERVAL_SPAN_P);
        SubLTrampolineFile.checkType(span2, INTERVAL_SPAN_P);
        {
            SubLObject start1 = int_span_start(span1);
            SubLObject end1 = int_span_end(span1);
            SubLObject start2 = int_span_start(span2);
            SubLObject end2 = int_span_end(span2);
            return makeBoolean(start1.numL(start2) || (start1.numE(start2) && end1.numL(end2)));
        }
    }

    @LispMethod(comment = "Used for sorting spans.\r\n\r\n@return BOOLEANP; T iff SPAN1 starts before SPAN2, or starts at the same place and ends earlier.")
    public static SubLObject interval_span_precedesP(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "! interval_span.interval_span_p(span1) " + ("interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) ") + span1;
        assert NIL != interval_span_p(span2) : "! interval_span.interval_span_p(span2) " + ("interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) ") + span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return makeBoolean(start1.numL(start2) || (start1.numE(start2) && end1.numL(end2)));
    }

    /**
     *
     *
     * @return BOOLEANP; T iff SPAN1 starts not after SPAN2, and ends not before SPAN2.
     */
    @LispMethod(comment = "@return BOOLEANP; T iff SPAN1 starts not after SPAN2, and ends not before SPAN2.")
    public static final SubLObject interval_span_subsumesP_alt(SubLObject span1, SubLObject span2) {
        SubLTrampolineFile.checkType(span1, INTERVAL_SPAN_P);
        SubLTrampolineFile.checkType(span2, INTERVAL_SPAN_P);
        {
            SubLObject start1 = int_span_start(span1);
            SubLObject end1 = int_span_end(span1);
            SubLObject start2 = int_span_start(span2);
            SubLObject end2 = int_span_end(span2);
            return makeBoolean(start1.numLE(start2) && end1.numGE(end2));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; T iff SPAN1 starts not after SPAN2, and ends not before SPAN2.
     */
    @LispMethod(comment = "@return BOOLEANP; T iff SPAN1 starts not after SPAN2, and ends not before SPAN2.")
    public static SubLObject interval_span_subsumesP(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "! interval_span.interval_span_p(span1) " + ("interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) ") + span1;
        assert NIL != interval_span_p(span2) : "! interval_span.interval_span_p(span2) " + ("interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) ") + span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return makeBoolean(start1.numLE(start2) && end1.numGE(end2));
    }

    public static SubLObject interval_span_overlapsP(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "! interval_span.interval_span_p(span1) " + ("interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) ") + span1;
        assert NIL != interval_span_p(span2) : "! interval_span.interval_span_p(span2) " + ("interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) ") + span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return makeBoolean((((start2.numLE(end1) && start2.numGE(start1)) || (end2.numLE(end1) && end2.numGE(start1))) || (start1.numLE(end2) && start1.numGE(start2))) || (end1.numLE(end2) && end1.numGE(start2)));
    }

    public static final SubLObject declare_interval_span_file_alt() {
        declareFunction("interval_span_print_function_trampoline", "INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("interval_span_p", "INTERVAL-SPAN-P", 1, 0, false);
        new com.cyc.cycjava.cycl.interval_span.$interval_span_p$UnaryFunction();
        declareFunction("int_span_start", "INT-SPAN-START", 1, 0, false);
        declareFunction("int_span_end", "INT-SPAN-END", 1, 0, false);
        declareFunction("_csetf_int_span_start", "_CSETF-INT-SPAN-START", 2, 0, false);
        declareFunction("_csetf_int_span_end", "_CSETF-INT-SPAN-END", 2, 0, false);
        declareFunction("make_interval_span", "MAKE-INTERVAL-SPAN", 0, 1, false);
        declareFunction("print_interval_span", "PRINT-INTERVAL-SPAN", 3, 0, false);
        declareFunction("lookup_interval_span", "LOOKUP-INTERVAL-SPAN", 2, 0, false);
        declareFunction("new_interval_span", "NEW-INTERVAL-SPAN", 2, 0, false);
        declareFunction("get_interval_span", "GET-INTERVAL-SPAN", 2, 0, false);
        declareFunction("interval_span_start", "INTERVAL-SPAN-START", 1, 0, false);
        declareFunction("interval_span_end", "INTERVAL-SPAN-END", 1, 0, false);
        declareFunction("interval_span_length", "INTERVAL-SPAN-LENGTH", 1, 0, false);
        declareFunction("interval_span_G", "INTERVAL-SPAN->", 2, 0, false);
        declareFunction("interval_span_L", "INTERVAL-SPAN-<", 2, 0, false);
        declareFunction("interval_span_precedesP", "INTERVAL-SPAN-PRECEDES?", 2, 0, false);
        declareFunction("interval_span_subsumesP", "INTERVAL-SPAN-SUBSUMES?", 2, 0, false);
        declareFunction("subloop_reserved_initialize_interval_span_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-INTERVAL-SPAN-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_interval_span_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-INTERVAL-SPAN-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("interval_span_test_case_p", "INTERVAL-SPAN-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_interval_span_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("interval_span_print_function_trampoline", "INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("interval_span_p", "INTERVAL-SPAN-P", 1, 0, false);
            new interval_span.$interval_span_p$UnaryFunction();
            declareFunction("int_span_start", "INT-SPAN-START", 1, 0, false);
            declareFunction("int_span_end", "INT-SPAN-END", 1, 0, false);
            declareFunction("_csetf_int_span_start", "_CSETF-INT-SPAN-START", 2, 0, false);
            declareFunction("_csetf_int_span_end", "_CSETF-INT-SPAN-END", 2, 0, false);
            declareFunction("make_interval_span", "MAKE-INTERVAL-SPAN", 0, 1, false);
            declareFunction("visit_defstruct_interval_span", "VISIT-DEFSTRUCT-INTERVAL-SPAN", 2, 0, false);
            declareFunction("visit_defstruct_object_interval_span_method", "VISIT-DEFSTRUCT-OBJECT-INTERVAL-SPAN-METHOD", 2, 0, false);
            declareFunction("print_interval_span", "PRINT-INTERVAL-SPAN", 3, 0, false);
            declareFunction("lookup_interval_span", "LOOKUP-INTERVAL-SPAN", 2, 0, false);
            declareFunction("new_interval_span", "NEW-INTERVAL-SPAN", 2, 0, false);
            declareFunction("get_interval_span", "GET-INTERVAL-SPAN", 2, 0, false);
            declareFunction("interval_span_start", "INTERVAL-SPAN-START", 1, 0, false);
            declareFunction("interval_span_end", "INTERVAL-SPAN-END", 1, 0, false);
            declareFunction("interval_span_length", "INTERVAL-SPAN-LENGTH", 1, 0, false);
            declareFunction("interval_span_G", "INTERVAL-SPAN->", 2, 0, false);
            declareFunction("interval_span_L", "INTERVAL-SPAN-<", 2, 0, false);
            declareFunction("interval_span_precedesP", "INTERVAL-SPAN-PRECEDES?", 2, 0, false);
            declareFunction("interval_span_subsumesP", "INTERVAL-SPAN-SUBSUMES?", 2, 0, false);
            declareFunction("interval_span_overlapsP", "INTERVAL-SPAN-OVERLAPS?", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("subloop_reserved_initialize_interval_span_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-INTERVAL-SPAN-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_interval_span_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-INTERVAL-SPAN-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("interval_span_test_case_p", "INTERVAL-SPAN-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_interval_span_file_Previous() {
        declareFunction("interval_span_print_function_trampoline", "INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("interval_span_p", "INTERVAL-SPAN-P", 1, 0, false);
        new interval_span.$interval_span_p$UnaryFunction();
        declareFunction("int_span_start", "INT-SPAN-START", 1, 0, false);
        declareFunction("int_span_end", "INT-SPAN-END", 1, 0, false);
        declareFunction("_csetf_int_span_start", "_CSETF-INT-SPAN-START", 2, 0, false);
        declareFunction("_csetf_int_span_end", "_CSETF-INT-SPAN-END", 2, 0, false);
        declareFunction("make_interval_span", "MAKE-INTERVAL-SPAN", 0, 1, false);
        declareFunction("visit_defstruct_interval_span", "VISIT-DEFSTRUCT-INTERVAL-SPAN", 2, 0, false);
        declareFunction("visit_defstruct_object_interval_span_method", "VISIT-DEFSTRUCT-OBJECT-INTERVAL-SPAN-METHOD", 2, 0, false);
        declareFunction("print_interval_span", "PRINT-INTERVAL-SPAN", 3, 0, false);
        declareFunction("lookup_interval_span", "LOOKUP-INTERVAL-SPAN", 2, 0, false);
        declareFunction("new_interval_span", "NEW-INTERVAL-SPAN", 2, 0, false);
        declareFunction("get_interval_span", "GET-INTERVAL-SPAN", 2, 0, false);
        declareFunction("interval_span_start", "INTERVAL-SPAN-START", 1, 0, false);
        declareFunction("interval_span_end", "INTERVAL-SPAN-END", 1, 0, false);
        declareFunction("interval_span_length", "INTERVAL-SPAN-LENGTH", 1, 0, false);
        declareFunction("interval_span_G", "INTERVAL-SPAN->", 2, 0, false);
        declareFunction("interval_span_L", "INTERVAL-SPAN-<", 2, 0, false);
        declareFunction("interval_span_precedesP", "INTERVAL-SPAN-PRECEDES?", 2, 0, false);
        declareFunction("interval_span_subsumesP", "INTERVAL-SPAN-SUBSUMES?", 2, 0, false);
        declareFunction("interval_span_overlapsP", "INTERVAL-SPAN-OVERLAPS?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_interval_span_file() {
        defconstant("*DTP-INTERVAL-SPAN*", INTERVAL_SPAN);
        deflexical("*INTERVAL-SPAN-TABLE*", dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_interval_span_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_interval_span$.getGlobalValue(), symbol_function(INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(INT_SPAN_START, _CSETF_INT_SPAN_START);
        def_csetf(INT_SPAN_END, _CSETF_INT_SPAN_END);
        identity(INTERVAL_SPAN);
        sunit_external.define_test_category($$$Interval_Span_Test_Category, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INTERVAL_SPAN_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(INTERVAL_SPAN_TEST_CASE);
        classes.subloop_new_class(INTERVAL_SPAN_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt21);
        classes.class_set_implements_slot_listeners(INTERVAL_SPAN_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(INTERVAL_SPAN_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_INTERVAL_SPAN_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(INTERVAL_SPAN_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_INTERVAL_SPAN_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_interval_span_test_case_class(INTERVAL_SPAN_TEST_CASE);
        sunit_macros.define_test_case_postamble(INTERVAL_SPAN_TEST_CASE, $str_alt36$standard_tokenization, $$$cycl, $list_alt38);
        sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_COMPARISON);
        sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_LENGTH);
        sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_INDICES);
        sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_CREATION);
        return NIL;
    }

    public static SubLObject setup_interval_span_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_interval_span$.getGlobalValue(), symbol_function(INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list8);
            def_csetf(INT_SPAN_START, _CSETF_INT_SPAN_START);
            def_csetf(INT_SPAN_END, _CSETF_INT_SPAN_END);
            identity(INTERVAL_SPAN);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_interval_span$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INTERVAL_SPAN_METHOD));
            sunit_external.define_test_category($$$Interval_Span_Test_Category, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(INTERVAL_SPAN_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(INTERVAL_SPAN_TEST_CASE);
            classes.subloop_new_class(INTERVAL_SPAN_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt21);
            classes.class_set_implements_slot_listeners(INTERVAL_SPAN_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(INTERVAL_SPAN_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_INTERVAL_SPAN_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(INTERVAL_SPAN_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_INTERVAL_SPAN_TEST_CASE_INSTANCE);
            subloop_reserved_initialize_interval_span_test_case_class(INTERVAL_SPAN_TEST_CASE);
            sunit_macros.define_test_case_postamble(INTERVAL_SPAN_TEST_CASE, $str_alt36$standard_tokenization, $$$cycl, $list_alt38);
            sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_COMPARISON);
            sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_LENGTH);
            sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_INDICES);
            sunit_macros.def_test_method_register(INTERVAL_SPAN_TEST_CASE, TEST_INTERVAL_SPAN_CREATION);
        }
        return NIL;
    }

    public static SubLObject setup_interval_span_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_interval_span$.getGlobalValue(), symbol_function(INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(INT_SPAN_START, _CSETF_INT_SPAN_START);
        def_csetf(INT_SPAN_END, _CSETF_INT_SPAN_END);
        identity(INTERVAL_SPAN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_interval_span$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_INTERVAL_SPAN_METHOD));
        sunit_external.define_test_category($$$Interval_Span_Test_Category, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_interval_span_file();
    }

    @Override
    public void initializeVariables() {
        init_interval_span_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_interval_span_file();
    }

    static private final SubLList $list_alt2 = list(makeSymbol("START"), makeSymbol("END"));

    static {
    }

    public static final class $interval_span_native extends SubLStructNative {
        public SubLObject $start;

        public SubLObject $end;

        private static final SubLStructDeclNative structDecl;

        public $interval_span_native() {
            interval_span.$interval_span_native.this.$start = Lisp.NIL;
            interval_span.$interval_span_native.this.$end = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return interval_span.$interval_span_native.this.$start;
        }

        @Override
        public SubLObject getField3() {
            return interval_span.$interval_span_native.this.$end;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return interval_span.$interval_span_native.this.$start = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return interval_span.$interval_span_native.this.$end = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.interval_span.$interval_span_native.class, INTERVAL_SPAN, INTERVAL_SPAN_P, $list2, $list3, new String[]{ "$start", "$end" }, $list4, $list5, PRINT_INTERVAL_SPAN);
        }
    }

    static private final SubLList $list_alt3 = list(makeKeyword("START"), makeKeyword("END"));

    static private final SubLList $list_alt4 = list(makeSymbol("INT-SPAN-START"), makeSymbol("INT-SPAN-END"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-INT-SPAN-START"), makeSymbol("_CSETF-INT-SPAN-END"));

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt15$_INTERVAL_SPAN___S__S__ = makeString("<INTERVAL-SPAN (~S ~S)>");

    public static final class $interval_span_p$UnaryFunction extends UnaryFunction {
        public $interval_span_p$UnaryFunction() {
            super(extractFunctionNamed("INTERVAL-SPAN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return interval_span_p(arg1);
        }
    }

    static private final SubLString $str_alt17$_a_is_not_greater_than_or_equal_t = makeString("~a is not greater than or equal to ~a");

    private static final SubLSymbol INTERVAL_SPAN_TEST_CASE = makeSymbol("INTERVAL-SPAN-TEST-CASE");

    static private final SubLList $list_alt21 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INTERVAL-SPAN-CREATION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INTERVAL-SPAN-INDICES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INTERVAL-SPAN-LENGTH"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-INTERVAL-SPAN-COMPARISON"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTERVAL_SPAN_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTERVAL-SPAN-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTERVAL_SPAN_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTERVAL-SPAN-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt36$standard_tokenization = makeString("standard-tokenization");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt38 = list(makeString("Interval Span Test Category"));

    private static final SubLSymbol TEST_INTERVAL_SPAN_COMPARISON = makeSymbol("TEST-INTERVAL-SPAN-COMPARISON");

    private static final SubLSymbol TEST_INTERVAL_SPAN_LENGTH = makeSymbol("TEST-INTERVAL-SPAN-LENGTH");

    private static final SubLSymbol TEST_INTERVAL_SPAN_INDICES = makeSymbol("TEST-INTERVAL-SPAN-INDICES");

    private static final SubLSymbol TEST_INTERVAL_SPAN_CREATION = makeSymbol("TEST-INTERVAL-SPAN-CREATION");
}

/**
 * Total time: 129 ms
 */
