/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rbp_chart_parser extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new rbp_chart_parser();

 public static final String myName = "com.cyc.cycjava.cycl.rbp_chart_parser";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rbp_chart$ = makeSymbol("*DTP-RBP-CHART*");

    // defparameter
    // Used to avoid passing the chart around all over the place.
    /**
     * Used to avoid passing the chart around all over the place.
     */
    @LispMethod(comment = "Used to avoid passing the chart around all over the place.\ndefparameter")
    private static final SubLSymbol $rbp_current_chart$ = makeSymbol("*RBP-CURRENT-CHART*");

    // deflexical
    // possible values: :quick, :thorough
    /**
     * possible values: :quick, :thorough
     */
    @LispMethod(comment = "possible values: :quick, :thorough\ndeflexical")
    private static final SubLSymbol $rbp_chart_parse_mode$ = makeSymbol("*RBP-CHART-PARSE-MODE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RBP_CHART = makeSymbol("RBP-CHART");

    private static final SubLSymbol RBP_CHART_P = makeSymbol("RBP-CHART-P");

    static private final SubLList $list2 = list(makeSymbol("INPUT-LENGTH"), makeSymbol("EDGES"), makeSymbol("DONE-SPANS"), makeSymbol("BLOCK-MERGE-FN"), makeSymbol("BLOCK-HASH"));

    static private final SubLList $list3 = list(makeKeyword("INPUT-LENGTH"), makeKeyword("EDGES"), makeKeyword("DONE-SPANS"), makeKeyword("BLOCK-MERGE-FN"), makeKeyword("BLOCK-HASH"));

    static private final SubLList $list4 = list(makeSymbol("RBP-CHART-INPUT-LENGTH"), makeSymbol("RBP-CHART-EDGES"), makeSymbol("RBP-CHART-DONE-SPANS"), makeSymbol("RBP-CHART-BLOCK-MERGE-FN"), makeSymbol("RBP-CHART-BLOCK-HASH"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-RBP-CHART-INPUT-LENGTH"), makeSymbol("_CSETF-RBP-CHART-EDGES"), makeSymbol("_CSETF-RBP-CHART-DONE-SPANS"), makeSymbol("_CSETF-RBP-CHART-BLOCK-MERGE-FN"), makeSymbol("_CSETF-RBP-CHART-BLOCK-HASH"));

    private static final SubLSymbol RBP_CHART_SUMMARIZE = makeSymbol("RBP-CHART-SUMMARIZE");

    private static final SubLSymbol RBP_CHART_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RBP-CHART-PRINT-FUNCTION-TRAMPOLINE");

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

    public static final SubLObject rbp_chart_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        rbp_chart_summarize(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rbp_chart_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rbp_chart_summarize(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rbp_chart_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rbp_chart_parser.$rbp_chart_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rbp_chart_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rbp_chart_parser.$rbp_chart_native.class ? T : NIL;
    }

    public static final SubLObject rbp_chart_input_length_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.getField2();
    }

    public static SubLObject rbp_chart_input_length(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rbp_chart_edges_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.getField3();
    }

    public static SubLObject rbp_chart_edges(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rbp_chart_done_spans_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.getField4();
    }

    public static SubLObject rbp_chart_done_spans(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rbp_chart_block_merge_fn_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.getField5();
    }

    public static SubLObject rbp_chart_block_merge_fn(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rbp_chart_block_hash_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.getField6();
    }

    public static SubLObject rbp_chart_block_hash(final SubLObject v_object) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_rbp_chart_input_length_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rbp_chart_input_length(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rbp_chart_edges_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rbp_chart_edges(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rbp_chart_done_spans_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rbp_chart_done_spans(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rbp_chart_block_merge_fn_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rbp_chart_block_merge_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rbp_chart_block_hash_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RBP_CHART_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rbp_chart_block_hash(final SubLObject v_object, final SubLObject value) {
        assert NIL != rbp_chart_p(v_object) : "! rbp_chart_parser.rbp_chart_p(v_object) " + "rbp_chart_parser.rbp_chart_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_rbp_chart_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rbp_chart_parser.$rbp_chart_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INPUT_LENGTH)) {
                        _csetf_rbp_chart_input_length(v_new, current_value);
                    } else {
                        if (pcase_var.eql($EDGES)) {
                            _csetf_rbp_chart_edges(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DONE_SPANS)) {
                                _csetf_rbp_chart_done_spans(v_new, current_value);
                            } else {
                                if (pcase_var.eql($BLOCK_MERGE_FN)) {
                                    _csetf_rbp_chart_block_merge_fn(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($BLOCK_HASH)) {
                                        _csetf_rbp_chart_block_hash(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rbp_chart(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rbp_chart_parser.$rbp_chart_native();
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

    public static final SubLObject new_rbp_chart_alt(SubLObject input_length, SubLObject edges, SubLObject done_spans, SubLObject block_merge_fn, SubLObject block_hash) {
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
        {
            SubLObject chart = make_rbp_chart(UNPROVIDED);
            _csetf_rbp_chart_input_length(chart, input_length);
            _csetf_rbp_chart_edges(chart, edges);
            _csetf_rbp_chart_done_spans(chart, done_spans);
            _csetf_rbp_chart_block_merge_fn(chart, block_merge_fn);
            _csetf_rbp_chart_block_hash(chart, block_hash);
            return chart;
        }
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

    /**
     *
     *
     * @return a span that spans the entire input
     */
    @LispMethod(comment = "@return a span that spans the entire input")
    public static final SubLObject rbp_chart_max_span_alt(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return interval_span.get_interval_span(ZERO_INTEGER, rbp_chart_input_length(chart));
    }

    /**
     *
     *
     * @return a span that spans the entire input
     */
    @LispMethod(comment = "@return a span that spans the entire input")
    public static SubLObject rbp_chart_max_span(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return interval_span.get_interval_span(ZERO_INTEGER, rbp_chart_input_length(chart));
    }

    public static final SubLObject rbp_chart_summarize_alt(SubLObject chart, SubLObject stream, SubLObject depth) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt24$____RBP_CHART___);
        format(stream, $str_alt25$___Input_length___D__, rbp_chart_input_length(chart));
        format(stream, $str_alt26$____Chart_edges___D__, hash_table_count(rbp_chart_edges(chart)));
        format(stream, $str_alt27$___Total_Blocks___D_, hash_table_count(rbp_chart_block_hash(chart)));
        return T;
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

    /**
     *
     *
     * @param CHART
     * 		an RBP-CHART structure
     * @return LISTP of blocks spanning the input.
    Also modifies CHART to include edges found by parsing.
     */
    @LispMethod(comment = "@param CHART\r\n\t\tan RBP-CHART structure\r\n@return LISTP of blocks spanning the input.\r\nAlso modifies CHART to include edges found by parsing.")
    public static final SubLObject rbp_chart_parse_alt(SubLObject chart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                {
                    SubLObject _prev_bind_0 = $rbp_current_chart$.currentBinding(thread);
                    try {
                        $rbp_current_chart$.bind(chart, thread);
                        {
                            SubLObject max_span = rbp_chart_max_span(chart);
                            parses = rbp_chart_parse_span(max_span);
                            chart = $rbp_current_chart$.getDynamicValue(thread);
                        }
                    } finally {
                        $rbp_current_chart$.rebind(_prev_bind_0, thread);
                    }
                }
                return parses;
            }
        }
    }

    /**
     *
     *
     * @param CHART
     * 		an RBP-CHART structure
     * @return LISTP of blocks spanning the input.
    Also modifies CHART to include edges found by parsing.
     */
    @LispMethod(comment = "@param CHART\r\n\t\tan RBP-CHART structure\r\n@return LISTP of blocks spanning the input.\r\nAlso modifies CHART to include edges found by parsing.")
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

    /**
     * Flesh out *RBP-CURRENT-CHART* for SPAN and all its sub-spans.
     *
     * @return LISTP of blocks spanning SPAN
    Also modifies *RBP-CURRENT-CHART* to include edges found by parsing.
     */
    @LispMethod(comment = "Flesh out *RBP-CURRENT-CHART* for SPAN and all its sub-spans.\r\n\r\n@return LISTP of blocks spanning SPAN\r\nAlso modifies *RBP-CURRENT-CHART* to include edges found by parsing.")
    public static final SubLObject rbp_chart_parse_span_alt(SubLObject span) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == rbp_chart_doneP(span, UNPROVIDED)) {
                {
                    SubLObject start = interval_span.interval_span_start(span);
                    SubLObject end = interval_span.interval_span_end(span);
                    SubLObject cdotimes_end_var = number_utilities.f_1_(interval_span.interval_span_length(span));
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                        {
                            SubLObject mod_head_boundary = add(start, i, ONE_INTEGER);
                            SubLObject cdolist_list_var = rbp_chart_parse_span(interval_span.get_interval_span(start, mod_head_boundary));
                            SubLObject mod = NIL;
                            for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                                {
                                    SubLObject cdolist_list_var_1 = rbp_chart_parse_span(interval_span.get_interval_span(mod_head_boundary, end));
                                    SubLObject head = NIL;
                                    for (head = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , head = cdolist_list_var_1.first()) {
                                        {
                                            SubLObject cdolist_list_var_2 = funcall(rbp_chart_block_merge_fn($rbp_current_chart$.getDynamicValue(thread)), mod, head, rbp_chart_block_hash($rbp_current_chart$.getDynamicValue(thread)));
                                            SubLObject block = NIL;
                                            for (block = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , block = cdolist_list_var_2.first()) {
                                                if (NIL != block) {
                                                    rbp_chart_add(block, UNPROVIDED);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                rbp_chart_done(span, UNPROVIDED);
            }
            return rbp_chart_lookup(span, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Flesh out *RBP-CURRENT-CHART* for SPAN and all its sub-spans.\r\n\r\n@return LISTP of blocks spanning SPAN\r\nAlso modifies *RBP-CURRENT-CHART* to include edges found by parsing.")
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

    /**
     *
     *
     * @return BOOLEAN; Has SPAN already been parsed?
     */
    @LispMethod(comment = "@return BOOLEAN; Has SPAN already been parsed?")
    public static final SubLObject rbp_chart_doneP_alt(SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return eq(gethash(span, rbp_chart_done_spans(chart), UNPROVIDED), $DONE);
    }

    /**
     *
     *
     * @return BOOLEAN; Has SPAN already been parsed?
     */
    @LispMethod(comment = "@return BOOLEAN; Has SPAN already been parsed?")
    public static SubLObject rbp_chart_doneP(final SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return eq(gethash(span, rbp_chart_done_spans(chart), UNPROVIDED), $DONE);
    }

    /**
     * Mark SPAN as already parsed.
     */
    @LispMethod(comment = "Mark SPAN as already parsed.")
    public static final SubLObject rbp_chart_done_alt(SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return sethash(span, rbp_chart_done_spans(chart), $DONE);
    }

    @LispMethod(comment = "Mark SPAN as already parsed.")
    public static SubLObject rbp_chart_done(final SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return sethash(span, rbp_chart_done_spans(chart), $DONE);
    }

    /**
     * Add BLOCK to *RBP-CURRENT-CHART*.
     */
    @LispMethod(comment = "Add BLOCK to *RBP-CURRENT-CHART*.")
    public static final SubLObject rbp_chart_add_alt(SubLObject block, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        {
            SubLObject span = noun_compound_parser.nc_block_span_index(block);
            SubLObject id = noun_compound_parser.nc_block_unique_id(block);
            if ($rbp_chart_parse_mode$.getGlobalValue() == $QUICK) {
                rbp_chart_done(span, chart);
            }
            rbp_chart_block_hash_add(block, chart);
            return hash_table_utilities.pushnew_hash(span, id, rbp_chart_edges(chart), UNPROVIDED);
        }
    }

    @LispMethod(comment = "Add BLOCK to *RBP-CURRENT-CHART*.")
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

    /**
     *
     *
     * @return LISTP of blocks known to span SPAN
     */
    @LispMethod(comment = "@return LISTP of blocks known to span SPAN")
    public static final SubLObject rbp_chart_lookup_alt(SubLObject span, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject ids = gethash(span, rbp_chart_edges(chart), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $rbp_current_chart$.currentBinding(thread);
                    try {
                        $rbp_current_chart$.bind(chart, thread);
                        ans = Mapping.mapcar(RBP_CHART_BLOCK_HASH_LOOKUP, ids);
                    } finally {
                        $rbp_current_chart$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP of blocks known to span SPAN
     */
    @LispMethod(comment = "@return LISTP of blocks known to span SPAN")
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

    public static final SubLObject rbp_chart_block_hash_add_alt(SubLObject block, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return sethash(noun_compound_parser.nc_block_unique_id(block), rbp_chart_block_hash(chart), block);
    }

    public static SubLObject rbp_chart_block_hash_add(final SubLObject block, SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = $rbp_current_chart$.getDynamicValue();
        }
        return sethash(noun_compound_parser.nc_block_unique_id(block), rbp_chart_block_hash(chart), block);
    }

    public static final SubLObject rbp_chart_block_hash_lookup_alt(SubLObject block_id, SubLObject block_hash) {
        if (block_hash == UNPROVIDED) {
            block_hash = rbp_chart_block_hash($rbp_current_chart$.getDynamicValue());
        }
        return gethash(block_id, block_hash, UNPROVIDED);
    }

    public static SubLObject rbp_chart_block_hash_lookup(final SubLObject block_id, SubLObject block_hash) {
        if (block_hash == UNPROVIDED) {
            block_hash = rbp_chart_block_hash($rbp_current_chart$.getDynamicValue());
        }
        return gethash(block_id, block_hash, UNPROVIDED);
    }

    public static SubLObject declare_rbp_chart_parser_file() {
        declareFunction("rbp_chart_print_function_trampoline", "RBP-CHART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rbp_chart_p", "RBP-CHART-P", 1, 0, false);
        new rbp_chart_parser.$rbp_chart_p$UnaryFunction();
        declareFunction("rbp_chart_input_length", "RBP-CHART-INPUT-LENGTH", 1, 0, false);
        declareFunction("rbp_chart_edges", "RBP-CHART-EDGES", 1, 0, false);
        declareFunction("rbp_chart_done_spans", "RBP-CHART-DONE-SPANS", 1, 0, false);
        declareFunction("rbp_chart_block_merge_fn", "RBP-CHART-BLOCK-MERGE-FN", 1, 0, false);
        declareFunction("rbp_chart_block_hash", "RBP-CHART-BLOCK-HASH", 1, 0, false);
        declareFunction("_csetf_rbp_chart_input_length", "_CSETF-RBP-CHART-INPUT-LENGTH", 2, 0, false);
        declareFunction("_csetf_rbp_chart_edges", "_CSETF-RBP-CHART-EDGES", 2, 0, false);
        declareFunction("_csetf_rbp_chart_done_spans", "_CSETF-RBP-CHART-DONE-SPANS", 2, 0, false);
        declareFunction("_csetf_rbp_chart_block_merge_fn", "_CSETF-RBP-CHART-BLOCK-MERGE-FN", 2, 0, false);
        declareFunction("_csetf_rbp_chart_block_hash", "_CSETF-RBP-CHART-BLOCK-HASH", 2, 0, false);
        declareFunction("make_rbp_chart", "MAKE-RBP-CHART", 0, 1, false);
        declareFunction("visit_defstruct_rbp_chart", "VISIT-DEFSTRUCT-RBP-CHART", 2, 0, false);
        declareFunction("visit_defstruct_object_rbp_chart_method", "VISIT-DEFSTRUCT-OBJECT-RBP-CHART-METHOD", 2, 0, false);
        declareFunction("new_rbp_chart", "NEW-RBP-CHART", 0, 5, false);
        declareFunction("rbp_chart_max_span", "RBP-CHART-MAX-SPAN", 0, 1, false);
        declareFunction("rbp_chart_summarize", "RBP-CHART-SUMMARIZE", 0, 3, false);
        declareFunction("rbp_chart_parse", "RBP-CHART-PARSE", 1, 0, false);
        declareFunction("rbp_chart_parse_span", "RBP-CHART-PARSE-SPAN", 1, 0, false);
        declareFunction("rbp_chart_doneP", "RBP-CHART-DONE?", 1, 1, false);
        declareFunction("rbp_chart_done", "RBP-CHART-DONE", 1, 1, false);
        declareFunction("rbp_chart_add", "RBP-CHART-ADD", 1, 1, false);
        declareFunction("rbp_chart_lookup", "RBP-CHART-LOOKUP", 1, 1, false);
        declareFunction("rbp_chart_block_hash_add", "RBP-CHART-BLOCK-HASH-ADD", 1, 1, false);
        declareFunction("rbp_chart_block_hash_lookup", "RBP-CHART-BLOCK-HASH-LOOKUP", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_rbp_chart_parser_file() {
        defconstant("*DTP-RBP-CHART*", RBP_CHART);
        defparameter("*RBP-CURRENT-CHART*", NIL);
        deflexical("*RBP-CHART-PARSE-MODE*", $THOROUGH);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("INPUT-LENGTH"), makeSymbol("EDGES"), makeSymbol("DONE-SPANS"), makeSymbol("BLOCK-MERGE-FN"), makeSymbol("BLOCK-HASH"));

    static private final SubLList $list_alt3 = list(makeKeyword("INPUT-LENGTH"), makeKeyword("EDGES"), makeKeyword("DONE-SPANS"), makeKeyword("BLOCK-MERGE-FN"), makeKeyword("BLOCK-HASH"));

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

    static private final SubLList $list_alt4 = list(makeSymbol("RBP-CHART-INPUT-LENGTH"), makeSymbol("RBP-CHART-EDGES"), makeSymbol("RBP-CHART-DONE-SPANS"), makeSymbol("RBP-CHART-BLOCK-MERGE-FN"), makeSymbol("RBP-CHART-BLOCK-HASH"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-RBP-CHART-INPUT-LENGTH"), makeSymbol("_CSETF-RBP-CHART-EDGES"), makeSymbol("_CSETF-RBP-CHART-DONE-SPANS"), makeSymbol("_CSETF-RBP-CHART-BLOCK-MERGE-FN"), makeSymbol("_CSETF-RBP-CHART-BLOCK-HASH"));

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

        public $rbp_chart_native() {
            rbp_chart_parser.$rbp_chart_native.this.$input_length = Lisp.NIL;
            rbp_chart_parser.$rbp_chart_native.this.$edges = Lisp.NIL;
            rbp_chart_parser.$rbp_chart_native.this.$done_spans = Lisp.NIL;
            rbp_chart_parser.$rbp_chart_native.this.$block_merge_fn = Lisp.NIL;
            rbp_chart_parser.$rbp_chart_native.this.$block_hash = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rbp_chart_parser.$rbp_chart_native.this.$input_length;
        }

        @Override
        public SubLObject getField3() {
            return rbp_chart_parser.$rbp_chart_native.this.$edges;
        }

        @Override
        public SubLObject getField4() {
            return rbp_chart_parser.$rbp_chart_native.this.$done_spans;
        }

        @Override
        public SubLObject getField5() {
            return rbp_chart_parser.$rbp_chart_native.this.$block_merge_fn;
        }

        @Override
        public SubLObject getField6() {
            return rbp_chart_parser.$rbp_chart_native.this.$block_hash;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rbp_chart_parser.$rbp_chart_native.this.$input_length = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rbp_chart_parser.$rbp_chart_native.this.$edges = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rbp_chart_parser.$rbp_chart_native.this.$done_spans = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rbp_chart_parser.$rbp_chart_native.this.$block_merge_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rbp_chart_parser.$rbp_chart_native.this.$block_hash = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rbp_chart_parser.$rbp_chart_native.class, RBP_CHART, RBP_CHART_P, $list2, $list3, new String[]{ "$input_length", "$edges", "$done_spans", "$block_merge_fn", "$block_hash" }, $list4, $list5, RBP_CHART_SUMMARIZE);
        }
    }

    static private final SubLString $str_alt23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt24$____RBP_CHART___ = makeString("~&#<RBP-CHART:~%");

    static private final SubLString $str_alt25$___Input_length___D__ = makeString("~& Input length: ~D~%");

    static private final SubLString $str_alt26$____Chart_edges___D__ = makeString("~&  Chart edges: ~D~%");

    static private final SubLString $str_alt27$___Total_Blocks___D_ = makeString("~& Total Blocks: ~D>");

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
