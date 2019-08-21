package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.interval_span;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.interval_span.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.interval_span.*; 
 public final class interval_span extends SubLTranslatedFile {
    public static final SubLFile me = new interval_span();

    public static final String myName = "com.cyc.cycjava.cycl.interval_span";

    public static final String myFingerPrint = "82aad11c0bab3c336c532662773a6b0b1d86464ee7e192386c2c8066741d3c8d";

    // defconstant
    public static final SubLSymbol $dtp_interval_span$ = makeSymbol("*DTP-INTERVAL-SPAN*");

    // deflexical
    private static final SubLSymbol $interval_span_table$ = makeSymbol("*INTERVAL-SPAN-TABLE*");

    // Internal Constants
    public static final SubLSymbol INTERVAL_SPAN = makeSymbol("INTERVAL-SPAN");

    public static final SubLSymbol INTERVAL_SPAN_P = makeSymbol("INTERVAL-SPAN-P");

    public static final SubLList $list2 = list(makeSymbol("START"), makeSymbol("END"));

    public static final SubLList $list3 = list(makeKeyword("START"), makeKeyword("END"));

    public static final SubLList $list4 = list(makeSymbol("INT-SPAN-START"), makeSymbol("INT-SPAN-END"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-INT-SPAN-START"), makeSymbol("_CSETF-INT-SPAN-END"));

    public static final SubLSymbol PRINT_INTERVAL_SPAN = makeSymbol("PRINT-INTERVAL-SPAN");

    public static final SubLSymbol INTERVAL_SPAN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE");

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

    public static SubLObject interval_span_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_interval_span(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject interval_span_p(final SubLObject v_object) {
        return v_object.getClass() == $interval_span_native.class ? T : NIL;
    }

    public static SubLObject int_span_start(final SubLObject v_object) {
        assert NIL != interval_span_p(v_object) : "interval_span.interval_span_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject int_span_end(final SubLObject v_object) {
        assert NIL != interval_span_p(v_object) : "interval_span.interval_span_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_int_span_start(final SubLObject v_object, final SubLObject value) {
        assert NIL != interval_span_p(v_object) : "interval_span.interval_span_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_int_span_end(final SubLObject v_object, final SubLObject value) {
        assert NIL != interval_span_p(v_object) : "interval_span.interval_span_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_interval_span(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $interval_span_native();
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

    public static SubLObject print_interval_span(final SubLObject span, final SubLObject stream, final SubLObject depth) {
        format(stream, $str20$_INTERVAL_SPAN___S__S__, int_span_start(span), int_span_end(span));
        return span;
    }

    public static SubLObject lookup_interval_span(final SubLObject start, final SubLObject end) {
        final SubLObject start_spans = dictionary.dictionary_lookup($interval_span_table$.getGlobalValue(), start, NIL);
        return NIL != dictionary.dictionary_p(start_spans) ? dictionary.dictionary_lookup_without_values(start_spans, end, NIL) : NIL;
    }

    public static SubLObject new_interval_span(final SubLObject start, final SubLObject end) {
        final SubLObject span = make_interval_span(list($START, start, $END, end));
        final SubLObject start_spans = dictionary.dictionary_lookup_without_values($interval_span_table$.getGlobalValue(), start, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        dictionary.dictionary_enter(start_spans, end, span);
        dictionary.dictionary_enter($interval_span_table$.getGlobalValue(), start, start_spans);
        return span;
    }

    public static SubLObject get_interval_span(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(start) : "subl_promotions.non_negative_integer_p(start) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start) " + start;
        assert NIL != subl_promotions.non_negative_integer_p(end) : "subl_promotions.non_negative_integer_p(end) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(end) " + end;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!end.numGE(start))) {
            Errors.error($str22$_a_is_not_greater_than_or_equal_t, end, start);
        }
        final SubLObject existing = lookup_interval_span(start, end);
        if (NIL != existing) {
            return existing;
        }
        return new_interval_span(start, end);
    }

    public static SubLObject interval_span_start(final SubLObject v_interval_span) {
        assert NIL != interval_span_p(v_interval_span) : "interval_span.interval_span_p(v_interval_span) " + "CommonSymbols.NIL != interval_span.interval_span_p(v_interval_span) " + v_interval_span;
        return int_span_start(v_interval_span);
    }

    public static SubLObject interval_span_end(final SubLObject v_interval_span) {
        assert NIL != interval_span_p(v_interval_span) : "interval_span.interval_span_p(v_interval_span) " + "CommonSymbols.NIL != interval_span.interval_span_p(v_interval_span) " + v_interval_span;
        return int_span_end(v_interval_span);
    }

    public static SubLObject interval_span_length(final SubLObject v_interval_span) {
        assert NIL != interval_span_p(v_interval_span) : "interval_span.interval_span_p(v_interval_span) " + "CommonSymbols.NIL != interval_span.interval_span_p(v_interval_span) " + v_interval_span;
        return subtract(int_span_end(v_interval_span), int_span_start(v_interval_span));
    }

    public static SubLObject interval_span_G(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) " + span1;
        assert NIL != interval_span_p(span2) : "interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) " + span2;
        return numG(interval_span_length(span1), interval_span_length(span2));
    }

    public static SubLObject interval_span_L(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) " + span1;
        assert NIL != interval_span_p(span2) : "interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) " + span2;
        return numL(interval_span_length(span1), interval_span_length(span2));
    }

    public static SubLObject interval_span_precedesP(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) " + span1;
        assert NIL != interval_span_p(span2) : "interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) " + span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return makeBoolean(start1.numL(start2) || (start1.numE(start2) && end1.numL(end2)));
    }

    public static SubLObject interval_span_subsumesP(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) " + span1;
        assert NIL != interval_span_p(span2) : "interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) " + span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return makeBoolean(start1.numLE(start2) && end1.numGE(end2));
    }

    public static SubLObject interval_span_overlapsP(final SubLObject span1, final SubLObject span2) {
        assert NIL != interval_span_p(span1) : "interval_span.interval_span_p(span1) " + "CommonSymbols.NIL != interval_span.interval_span_p(span1) " + span1;
        assert NIL != interval_span_p(span2) : "interval_span.interval_span_p(span2) " + "CommonSymbols.NIL != interval_span.interval_span_p(span2) " + span2;
        final SubLObject start1 = int_span_start(span1);
        final SubLObject end1 = int_span_end(span1);
        final SubLObject start2 = int_span_start(span2);
        final SubLObject end2 = int_span_end(span2);
        return makeBoolean((((start2.numLE(end1) && start2.numGE(start1)) || (end2.numLE(end1) && end2.numGE(start1))) || (start1.numLE(end2) && start1.numGE(start2))) || (end1.numLE(end2) && end1.numGE(start2)));
    }

    public static SubLObject declare_interval_span_file() {
        declareFunction(me, "interval_span_print_function_trampoline", "INTERVAL-SPAN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "interval_span_p", "INTERVAL-SPAN-P", 1, 0, false);
        new interval_span.$interval_span_p$UnaryFunction();
        declareFunction(me, "int_span_start", "INT-SPAN-START", 1, 0, false);
        declareFunction(me, "int_span_end", "INT-SPAN-END", 1, 0, false);
        declareFunction(me, "_csetf_int_span_start", "_CSETF-INT-SPAN-START", 2, 0, false);
        declareFunction(me, "_csetf_int_span_end", "_CSETF-INT-SPAN-END", 2, 0, false);
        declareFunction(me, "make_interval_span", "MAKE-INTERVAL-SPAN", 0, 1, false);
        declareFunction(me, "visit_defstruct_interval_span", "VISIT-DEFSTRUCT-INTERVAL-SPAN", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_interval_span_method", "VISIT-DEFSTRUCT-OBJECT-INTERVAL-SPAN-METHOD", 2, 0, false);
        declareFunction(me, "print_interval_span", "PRINT-INTERVAL-SPAN", 3, 0, false);
        declareFunction(me, "lookup_interval_span", "LOOKUP-INTERVAL-SPAN", 2, 0, false);
        declareFunction(me, "new_interval_span", "NEW-INTERVAL-SPAN", 2, 0, false);
        declareFunction(me, "get_interval_span", "GET-INTERVAL-SPAN", 2, 0, false);
        declareFunction(me, "interval_span_start", "INTERVAL-SPAN-START", 1, 0, false);
        declareFunction(me, "interval_span_end", "INTERVAL-SPAN-END", 1, 0, false);
        declareFunction(me, "interval_span_length", "INTERVAL-SPAN-LENGTH", 1, 0, false);
        declareFunction(me, "interval_span_G", "INTERVAL-SPAN->", 2, 0, false);
        declareFunction(me, "interval_span_L", "INTERVAL-SPAN-<", 2, 0, false);
        declareFunction(me, "interval_span_precedesP", "INTERVAL-SPAN-PRECEDES?", 2, 0, false);
        declareFunction(me, "interval_span_subsumesP", "INTERVAL-SPAN-SUBSUMES?", 2, 0, false);
        declareFunction(me, "interval_span_overlapsP", "INTERVAL-SPAN-OVERLAPS?", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_interval_span_file() {
        defconstant("*DTP-INTERVAL-SPAN*", INTERVAL_SPAN);
        deflexical("*INTERVAL-SPAN-TABLE*", dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_interval_span_file() {
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

    static {



























    }

    public static final class $interval_span_native extends SubLStructNative {
        public SubLObject $start;

        public SubLObject $end;

        private static final SubLStructDeclNative structDecl;

        private $interval_span_native() {
            this.$start = Lisp.NIL;
            this.$end = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$start;
        }

        @Override
        public SubLObject getField3() {
            return this.$end;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$start = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$end = value;
        }

        static {
            structDecl = makeStructDeclNative($interval_span_native.class, INTERVAL_SPAN, INTERVAL_SPAN_P, $list2, $list3, new String[]{ "$start", "$end" }, $list4, $list5, PRINT_INTERVAL_SPAN);
        }
    }

    public static final class $interval_span_p$UnaryFunction extends UnaryFunction {
        public $interval_span_p$UnaryFunction() {
            super(extractFunctionNamed("INTERVAL-SPAN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return interval_span_p(arg1);
        }
    }
}

/**
 * Total time: 129 ms
 */
