package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rbp_chart_parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
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

import static com.cyc.cycjava.cycl.rbp_chart_parser.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
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


import static com.cyc.cycjava.cycl.rbp_chart_parser.*; 
 public final class rbp_chart_parser extends SubLTranslatedFile {
    public static final SubLFile me = new rbp_chart_parser();

    public static final String myName = "com.cyc.cycjava.cycl.rbp_chart_parser";

    public static final String myFingerPrint = "0afae7f2792fe812c17e91beacba47fa8513c8c8170b6579a236dd3cc6a179fd";

    // defconstant
    public static final SubLSymbol $dtp_rbp_chart$ = makeSymbol("*DTP-RBP-CHART*");

    // defparameter
    // Used to avoid passing the chart around all over the place.
    private static final SubLSymbol $rbp_current_chart$ = makeSymbol("*RBP-CURRENT-CHART*");

    // deflexical
    // possible values: :quick, :thorough
    private static final SubLSymbol $rbp_chart_parse_mode$ = makeSymbol("*RBP-CHART-PARSE-MODE*");

    // Internal Constants
    public static final SubLSymbol RBP_CHART = makeSymbol("RBP-CHART");

    public static final SubLSymbol RBP_CHART_P = makeSymbol("RBP-CHART-P");

    public static final SubLList $list2 = list(makeSymbol("INPUT-LENGTH"), makeSymbol("EDGES"), makeSymbol("DONE-SPANS"), makeSymbol("BLOCK-MERGE-FN"), makeSymbol("BLOCK-HASH"));

    public static final SubLList $list3 = list(makeKeyword("INPUT-LENGTH"), makeKeyword("EDGES"), makeKeyword("DONE-SPANS"), makeKeyword("BLOCK-MERGE-FN"), makeKeyword("BLOCK-HASH"));

    public static final SubLList $list4 = list(makeSymbol("RBP-CHART-INPUT-LENGTH"), makeSymbol("RBP-CHART-EDGES"), makeSymbol("RBP-CHART-DONE-SPANS"), makeSymbol("RBP-CHART-BLOCK-MERGE-FN"), makeSymbol("RBP-CHART-BLOCK-HASH"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-RBP-CHART-INPUT-LENGTH"), makeSymbol("_CSETF-RBP-CHART-EDGES"), makeSymbol("_CSETF-RBP-CHART-DONE-SPANS"), makeSymbol("_CSETF-RBP-CHART-BLOCK-MERGE-FN"), makeSymbol("_CSETF-RBP-CHART-BLOCK-HASH"));

    public static final SubLSymbol RBP_CHART_SUMMARIZE = makeSymbol("RBP-CHART-SUMMARIZE");

    public static final SubLSymbol RBP_CHART_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RBP-CHART-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RBP-CHART-P"));

    private static final SubLSymbol RBP_CHART_INPUT_LENGTH = makeSymbol("RBP-CHART-INPUT-LENGTH");

    private static final SubLSymbol _CSETF_RBP_CHART_INPUT_LENGTH = makeSymbol("_CSETF-RBP-CHART-INPUT-LENGTH");

    private static final SubLSymbol RBP_CHART_EDGES = makeSymbol("RBP-CHART-EDGES");

    private static final SubLSymbol _CSETF_RBP_CHART_EDGES = makeSymbol("_CSETF-RBP-CHART-EDGES");

    private static final SubLSymbol RBP_CHART_DONE_SPANS = makeSymbol("RBP-CHART-DONE-SPANS");

    private static final SubLSymbol _CSETF_RBP_CHART_DONE_SPANS = makeSymbol("_CSETF-RBP-CHART-DONE-SPANS");

    private static final SubLSymbol RBP_CHART_BLOCK_MERGE_FN = makeSymbol("RBP-CHART-BLOCK-MERGE-FN");

    private static final SubLSymbol _CSETF_RBP_CHART_BLOCK_MERGE_FN = makeSymbol("_CSETF-RBP-CHART-BLOCK-MERGE-FN");

    private static final SubLSymbol RBP_CHART_BLOCK_HASH = makeSymbol("RBP-CHART-BLOCK-HASH");

    private static final SubLSymbol _CSETF_RBP_CHART_BLOCK_HASH = makeSymbol("_CSETF-RBP-CHART-BLOCK-HASH");







    private static final SubLSymbol $BLOCK_MERGE_FN = makeKeyword("BLOCK-MERGE-FN");



    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RBP_CHART = makeSymbol("MAKE-RBP-CHART");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RBP_CHART_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RBP-CHART-METHOD");

    private static final SubLString $str30$____RBP_CHART___ = makeString("~&#<RBP-CHART:~%");

    private static final SubLString $str31$___Input_length___D__ = makeString("~& Input length: ~D~%");

    private static final SubLString $str32$____Chart_edges___D__ = makeString("~&  Chart edges: ~D~%");

    private static final SubLString $str33$___Total_Blocks___D_ = makeString("~& Total Blocks: ~D>");







    private static final SubLSymbol RBP_CHART_BLOCK_HASH_LOOKUP = makeSymbol("RBP-CHART-BLOCK-HASH-LOOKUP");

    public static SubLObject rbp_chart_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rbp_chart_summarize(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rbp_chart_p(final SubLObject v_object) {
        return v_object.getClass() == $rbp_chart_native.class ? T : NIL;
    }

    public static SubLObject rbp_chart_input_length(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rbp_chart_edges(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rbp_chart_done_spans(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rbp_chart_block_merge_fn(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rbp_chart_block_hash(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_rbp_chart_input_length(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rbp_chart_edges(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rbp_chart_done_spans(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rbp_chart_block_merge_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rbp_chart_block_hash(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_rbp_chart(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $rbp_chart_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INPUT_LENGTH)) {
                _csetf_rbp_chart_input_length(v_new, current_value);
            } else
                if (pcase_var.eql($EDGES)) {
                    _csetf_rbp_chart_edges(v_new, current_value);
                } else
                    if (pcase_var.eql($DONE_SPANS)) {
                        _csetf_rbp_chart_done_spans(v_new, current_value);
                    } else
                        if (pcase_var.eql($BLOCK_MERGE_FN)) {
                            _csetf_rbp_chart_block_merge_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($BLOCK_HASH)) {
                                _csetf_rbp_chart_block_hash(v_new, current_value);
                            } else {
                                Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rbp_chart(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RBP_CHART, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INPUT_LENGTH, rbp_chart_input_length(obj));
        funcall(visitor_fn, obj, $SLOT, $EDGES, rbp_chart_edges(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_SPANS, rbp_chart_done_spans(obj));
        funcall(visitor_fn, obj, $SLOT, $BLOCK_MERGE_FN, rbp_chart_block_merge_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $BLOCK_HASH, rbp_chart_block_hash(obj));
        funcall(visitor_fn, obj, $END, MAKE_RBP_CHART, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rbp_chart_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rbp_chart(obj, visitor_fn);
    }

    public static SubLObject new_rbp_chart(SubLObject input_length, SubLObject edges, SubLObject done_spans, SubLObject block_merge_fn, SubLObject block_hash) {
        if (input_length == UNPROVIDED) {
            input_length = NIL;
        }
        if (edges == UNPROVIDED) {
            edges = NIL;
        }
        if (done_spans == UNPROVIDED) {
            done_spans = NIL;
        }
        if (block_merge_fn == UNPROVIDED) {
            block_merge_fn = NIL;
        }
        if (block_hash == UNPROVIDED) {
            block_hash = NIL;
        }
        final SubLObject chart = make_rbp_chart(UNPROVIDED);
        _csetf_rbp_chart_input_length(chart, input_length);
        _csetf_rbp_chart_edges(chart, edges);
        _csetf_rbp_chart_done_spans(chart, done_spans);
        _csetf_rbp_chart_block_merge_fn(chart, block_merge_fn);
        _csetf_rbp_chart_block_hash(chart, block_hash);
        return chart;
    }

    public static SubLObject rbp_chart_max_span(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return interval_span.get_interval_span(ZERO_INTEGER, rbp_chart_input_length(chart));
    }

    public static SubLObject rbp_chart_summarize(SubLObject chart, SubLObject stream, SubLObject depth) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str30$____RBP_CHART___);
        format(stream, $str31$___Input_length___D__, rbp_chart_input_length(chart));
        format(stream, $str32$____Chart_edges___D__, hash_table_count(rbp_chart_edges(chart)));
        format(stream, $str33$___Total_Blocks___D_, hash_table_count(rbp_chart_block_hash(chart)));
        return T;
    }

    public static SubLObject rbp_chart_parse(SubLObject chart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        final SubLObject _prev_bind_0 = $rbp_current_chart$.currentBinding(thread);
        try {
            $rbp_current_chart$.bind(chart, thread);
            final SubLObject max_span = rbp_chart_max_span(chart);
            parses = rbp_chart_parse_span(max_span);
            chart = $rbp_current_chart$.getDynamicValue(thread);
        } finally {
            $rbp_current_chart$.rebind(_prev_bind_0, thread);
        }
        return parses;
    }

    public static SubLObject rbp_chart_parse_span(final SubLObject span) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == rbp_chart_doneP(span, UNPROVIDED)) {
            final SubLObject start = interval_span.interval_span_start(span);
            final SubLObject end = interval_span.interval_span_end(span);
            SubLObject cdotimes_end_var;
            SubLObject i;
            SubLObject mod_head_boundary;
            SubLObject cdolist_list_var;
            SubLObject mod;
            SubLObject cdolist_list_var_$1;
            SubLObject head;
            SubLObject cdolist_list_var_$2;
            SubLObject block;
            for (cdotimes_end_var = number_utilities.f_1_(interval_span.interval_span_length(span)), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                mod_head_boundary = add(start, i, ONE_INTEGER);
                cdolist_list_var = rbp_chart_parse_span(interval_span.get_interval_span(start, mod_head_boundary));
                mod = NIL;
                mod = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cdolist_list_var_$1 = rbp_chart_parse_span(interval_span.get_interval_span(mod_head_boundary, end));
                    head = NIL;
                    head = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        cdolist_list_var_$2 = funcall(rbp_chart_block_merge_fn($rbp_current_chart$.getDynamicValue(thread)), mod, head, rbp_chart_block_hash($rbp_current_chart$.getDynamicValue(thread)));
                        block = NIL;
                        block = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if (NIL != block) {
                                rbp_chart_add(block, UNPROVIDED);
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            block = cdolist_list_var_$2.first();
                        } 
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        head = cdolist_list_var_$1.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    mod = cdolist_list_var.first();
                } 
            }
            rbp_chart_done(span, UNPROVIDED);
        }
        return rbp_chart_lookup(span, UNPROVIDED);
    }

    public static SubLObject rbp_chart_doneP(final SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return eq(gethash(span, rbp_chart_done_spans(chart), UNPROVIDED), $DONE);
    }

    public static SubLObject rbp_chart_done(final SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return sethash(span, rbp_chart_done_spans(chart), $DONE);
    }

    public static SubLObject rbp_chart_add(final SubLObject block, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        final SubLObject span = noun_compound_parser.nc_block_span_index(block);
        final SubLObject id = noun_compound_parser.nc_block_unique_id(block);
        if ($rbp_chart_parse_mode$.getGlobalValue() == $QUICK) {
            rbp_chart_done(span, chart);
        }
        rbp_chart_block_hash_add(block, chart);
        return hash_table_utilities.pushnew_hash(span, id, rbp_chart_edges(chart), UNPROVIDED);
    }

    public static SubLObject rbp_chart_lookup(final SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject ids = gethash(span, rbp_chart_edges(chart), UNPROVIDED);
        final SubLObject _prev_bind_0 = $rbp_current_chart$.currentBinding(thread);
        try {
            $rbp_current_chart$.bind(chart, thread);
            ans = Mapping.mapcar(RBP_CHART_BLOCK_HASH_LOOKUP, ids);
        } finally {
            $rbp_current_chart$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rbp_chart_block_hash_add(final SubLObject block, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return sethash(noun_compound_parser.nc_block_unique_id(block), rbp_chart_block_hash(chart), block);
    }

    public static SubLObject rbp_chart_block_hash_lookup(final SubLObject block_id, SubLObject block_hash) {
        if (block_hash == UNPROVIDED) {
            block_hash = rbp_chart_block_hash($rbp_current_chart$.getDynamicValue());
        }
        return gethash(block_id, block_hash, UNPROVIDED);
    }

    public static SubLObject declare_rbp_chart_parser_file() {
        declareFunction(me, "rbp_chart_print_function_trampoline", "RBP-CHART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "rbp_chart_p", "RBP-CHART-P", 1, 0, false);
        new rbp_chart_parser.$rbp_chart_p$UnaryFunction();
        declareFunction(me, "rbp_chart_input_length", "RBP-CHART-INPUT-LENGTH", 1, 0, false);
        declareFunction(me, "rbp_chart_edges", "RBP-CHART-EDGES", 1, 0, false);
        declareFunction(me, "rbp_chart_done_spans", "RBP-CHART-DONE-SPANS", 1, 0, false);
        declareFunction(me, "rbp_chart_block_merge_fn", "RBP-CHART-BLOCK-MERGE-FN", 1, 0, false);
        declareFunction(me, "rbp_chart_block_hash", "RBP-CHART-BLOCK-HASH", 1, 0, false);
        declareFunction(me, "_csetf_rbp_chart_input_length", "_CSETF-RBP-CHART-INPUT-LENGTH", 2, 0, false);
        declareFunction(me, "_csetf_rbp_chart_edges", "_CSETF-RBP-CHART-EDGES", 2, 0, false);
        declareFunction(me, "_csetf_rbp_chart_done_spans", "_CSETF-RBP-CHART-DONE-SPANS", 2, 0, false);
        declareFunction(me, "_csetf_rbp_chart_block_merge_fn", "_CSETF-RBP-CHART-BLOCK-MERGE-FN", 2, 0, false);
        declareFunction(me, "_csetf_rbp_chart_block_hash", "_CSETF-RBP-CHART-BLOCK-HASH", 2, 0, false);
        declareFunction(me, "make_rbp_chart", "MAKE-RBP-CHART", 0, 1, false);
        declareFunction(me, "visit_defstruct_rbp_chart", "VISIT-DEFSTRUCT-RBP-CHART", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_rbp_chart_method", "VISIT-DEFSTRUCT-OBJECT-RBP-CHART-METHOD", 2, 0, false);
        declareFunction(me, "new_rbp_chart", "NEW-RBP-CHART", 0, 5, false);
        declareFunction(me, "rbp_chart_max_span", "RBP-CHART-MAX-SPAN", 0, 1, false);
        declareFunction(me, "rbp_chart_summarize", "RBP-CHART-SUMMARIZE", 0, 3, false);
        declareFunction(me, "rbp_chart_parse", "RBP-CHART-PARSE", 1, 0, false);
        declareFunction(me, "rbp_chart_parse_span", "RBP-CHART-PARSE-SPAN", 1, 0, false);
        declareFunction(me, "rbp_chart_doneP", "RBP-CHART-DONE?", 1, 1, false);
        declareFunction(me, "rbp_chart_done", "RBP-CHART-DONE", 1, 1, false);
        declareFunction(me, "rbp_chart_add", "RBP-CHART-ADD", 1, 1, false);
        declareFunction(me, "rbp_chart_lookup", "RBP-CHART-LOOKUP", 1, 1, false);
        declareFunction(me, "rbp_chart_block_hash_add", "RBP-CHART-BLOCK-HASH-ADD", 1, 1, false);
        declareFunction(me, "rbp_chart_block_hash_lookup", "RBP-CHART-BLOCK-HASH-LOOKUP", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_rbp_chart_parser_file() {
        defconstant("*DTP-RBP-CHART*", RBP_CHART);
        defparameter("*RBP-CURRENT-CHART*", NIL);
        deflexical("*RBP-CHART-PARSE-MODE*", $THOROUGH);
        return NIL;
    }

    public static SubLObject setup_rbp_chart_parser_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_rbp_chart$.getGlobalValue(), symbol_function(RBP_CHART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(RBP_CHART_INPUT_LENGTH, _CSETF_RBP_CHART_INPUT_LENGTH);
        def_csetf(RBP_CHART_EDGES, _CSETF_RBP_CHART_EDGES);
        def_csetf(RBP_CHART_DONE_SPANS, _CSETF_RBP_CHART_DONE_SPANS);
        def_csetf(RBP_CHART_BLOCK_MERGE_FN, _CSETF_RBP_CHART_BLOCK_MERGE_FN);
        def_csetf(RBP_CHART_BLOCK_HASH, _CSETF_RBP_CHART_BLOCK_HASH);
        identity(RBP_CHART);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_rbp_chart$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RBP_CHART_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rbp_chart_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_rbp_chart_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rbp_chart_parser_file();
    }

    static {










































    }

    public static final class $rbp_chart_native extends SubLStructNative {
        public SubLObject $input_length;

        public SubLObject $edges;

        public SubLObject $done_spans;

        public SubLObject $block_merge_fn;

        public SubLObject $block_hash;

        private static final SubLStructDeclNative structDecl;

        private $rbp_chart_native() {
            this.$input_length = Lisp.NIL;
            this.$edges = Lisp.NIL;
            this.$done_spans = Lisp.NIL;
            this.$block_merge_fn = Lisp.NIL;
            this.$block_hash = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$input_length;
        }

        @Override
        public SubLObject getField3() {
            return this.$edges;
        }

        @Override
        public SubLObject getField4() {
            return this.$done_spans;
        }

        @Override
        public SubLObject getField5() {
            return this.$block_merge_fn;
        }

        @Override
        public SubLObject getField6() {
            return this.$block_hash;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$input_length = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$edges = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$done_spans = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$block_merge_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$block_hash = value;
        }

        static {
            structDecl = makeStructDeclNative($rbp_chart_native.class, RBP_CHART, RBP_CHART_P, $list2, $list3, new String[]{ "$input_length", "$edges", "$done_spans", "$block_merge_fn", "$block_hash" }, $list4, $list5, RBP_CHART_SUMMARIZE);
        }
    }

    public static final class $rbp_chart_p$UnaryFunction extends UnaryFunction {
        public $rbp_chart_p$UnaryFunction() {
            super(extractFunctionNamed("RBP-CHART-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rbp_chart_p(arg1);
        }
    }
}

/**
 * Total time: 86 ms
 */
