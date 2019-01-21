package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rbp_chart_parser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rbp_chart_parser";
    public static final String myFingerPrint = "0afae7f2792fe812c17e91beacba47fa8513c8c8170b6579a236dd3cc6a179fd";
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLSymbol $dtp_rbp_chart$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 2079L)
    private static SubLSymbol $rbp_current_chart$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 4388L)
    private static SubLSymbol $rbp_chart_parse_mode$;
    private static final SubLSymbol $sym0$RBP_CHART;
    private static final SubLSymbol $sym1$RBP_CHART_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$RBP_CHART_SUMMARIZE;
    private static final SubLSymbol $sym7$RBP_CHART_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$RBP_CHART_INPUT_LENGTH;
    private static final SubLSymbol $sym10$_CSETF_RBP_CHART_INPUT_LENGTH;
    private static final SubLSymbol $sym11$RBP_CHART_EDGES;
    private static final SubLSymbol $sym12$_CSETF_RBP_CHART_EDGES;
    private static final SubLSymbol $sym13$RBP_CHART_DONE_SPANS;
    private static final SubLSymbol $sym14$_CSETF_RBP_CHART_DONE_SPANS;
    private static final SubLSymbol $sym15$RBP_CHART_BLOCK_MERGE_FN;
    private static final SubLSymbol $sym16$_CSETF_RBP_CHART_BLOCK_MERGE_FN;
    private static final SubLSymbol $sym17$RBP_CHART_BLOCK_HASH;
    private static final SubLSymbol $sym18$_CSETF_RBP_CHART_BLOCK_HASH;
    private static final SubLSymbol $kw19$INPUT_LENGTH;
    private static final SubLSymbol $kw20$EDGES;
    private static final SubLSymbol $kw21$DONE_SPANS;
    private static final SubLSymbol $kw22$BLOCK_MERGE_FN;
    private static final SubLSymbol $kw23$BLOCK_HASH;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_RBP_CHART;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_RBP_CHART_METHOD;
    private static final SubLString $str30$____RBP_CHART___;
    private static final SubLString $str31$___Input_length___D__;
    private static final SubLString $str32$____Chart_edges___D__;
    private static final SubLString $str33$___Total_Blocks___D_;
    private static final SubLSymbol $kw34$DONE;
    private static final SubLSymbol $kw35$THOROUGH;
    private static final SubLSymbol $kw36$QUICK;
    private static final SubLSymbol $sym37$RBP_CHART_BLOCK_HASH_LOOKUP;
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rbp_chart_summarize(v_object, stream, (SubLObject)rbp_chart_parser.ZERO_INTEGER);
        return (SubLObject)rbp_chart_parser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rbp_chart_native.class) ? rbp_chart_parser.T : rbp_chart_parser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_input_length(final SubLObject v_object) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_edges(final SubLObject v_object) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_done_spans(final SubLObject v_object) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_block_merge_fn(final SubLObject v_object) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject rbp_chart_block_hash(final SubLObject v_object) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject _csetf_rbp_chart_input_length(final SubLObject v_object, final SubLObject value) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject _csetf_rbp_chart_edges(final SubLObject v_object, final SubLObject value) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject _csetf_rbp_chart_done_spans(final SubLObject v_object, final SubLObject value) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject _csetf_rbp_chart_block_merge_fn(final SubLObject v_object, final SubLObject value) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject _csetf_rbp_chart_block_hash(final SubLObject v_object, final SubLObject value) {
        assert rbp_chart_parser.NIL != rbp_chart_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject make_rbp_chart(SubLObject arglist) {
        if (arglist == rbp_chart_parser.UNPROVIDED) {
            arglist = (SubLObject)rbp_chart_parser.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rbp_chart_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rbp_chart_parser.NIL, next = arglist; rbp_chart_parser.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rbp_chart_parser.$kw19$INPUT_LENGTH)) {
                _csetf_rbp_chart_input_length(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rbp_chart_parser.$kw20$EDGES)) {
                _csetf_rbp_chart_edges(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rbp_chart_parser.$kw21$DONE_SPANS)) {
                _csetf_rbp_chart_done_spans(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rbp_chart_parser.$kw22$BLOCK_MERGE_FN)) {
                _csetf_rbp_chart_block_merge_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rbp_chart_parser.$kw23$BLOCK_HASH)) {
                _csetf_rbp_chart_block_hash(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rbp_chart_parser.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject visit_defstruct_rbp_chart(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw25$BEGIN, (SubLObject)rbp_chart_parser.$sym26$MAKE_RBP_CHART, (SubLObject)rbp_chart_parser.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw27$SLOT, (SubLObject)rbp_chart_parser.$kw19$INPUT_LENGTH, rbp_chart_input_length(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw27$SLOT, (SubLObject)rbp_chart_parser.$kw20$EDGES, rbp_chart_edges(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw27$SLOT, (SubLObject)rbp_chart_parser.$kw21$DONE_SPANS, rbp_chart_done_spans(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw27$SLOT, (SubLObject)rbp_chart_parser.$kw22$BLOCK_MERGE_FN, rbp_chart_block_merge_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw27$SLOT, (SubLObject)rbp_chart_parser.$kw23$BLOCK_HASH, rbp_chart_block_hash(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_chart_parser.$kw28$END, (SubLObject)rbp_chart_parser.$sym26$MAKE_RBP_CHART, (SubLObject)rbp_chart_parser.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1318L)
    public static SubLObject visit_defstruct_object_rbp_chart_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rbp_chart(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 1631L)
    public static SubLObject new_rbp_chart(SubLObject input_length, SubLObject edges, SubLObject done_spans, SubLObject block_merge_fn, SubLObject block_hash) {
        if (input_length == rbp_chart_parser.UNPROVIDED) {
            input_length = (SubLObject)rbp_chart_parser.NIL;
        }
        if (edges == rbp_chart_parser.UNPROVIDED) {
            edges = (SubLObject)rbp_chart_parser.NIL;
        }
        if (done_spans == rbp_chart_parser.UNPROVIDED) {
            done_spans = (SubLObject)rbp_chart_parser.NIL;
        }
        if (block_merge_fn == rbp_chart_parser.UNPROVIDED) {
            block_merge_fn = (SubLObject)rbp_chart_parser.NIL;
        }
        if (block_hash == rbp_chart_parser.UNPROVIDED) {
            block_hash = (SubLObject)rbp_chart_parser.NIL;
        }
        final SubLObject chart = make_rbp_chart((SubLObject)rbp_chart_parser.UNPROVIDED);
        _csetf_rbp_chart_input_length(chart, input_length);
        _csetf_rbp_chart_edges(chart, edges);
        _csetf_rbp_chart_done_spans(chart, done_spans);
        _csetf_rbp_chart_block_merge_fn(chart, block_merge_fn);
        _csetf_rbp_chart_block_hash(chart, block_hash);
        return chart;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 2190L)
    public static SubLObject rbp_chart_max_span(SubLObject chart) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        return interval_span.get_interval_span((SubLObject)rbp_chart_parser.ZERO_INTEGER, rbp_chart_input_length(chart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 2375L)
    public static SubLObject rbp_chart_summarize(SubLObject chart, SubLObject stream, SubLObject depth) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        if (stream == rbp_chart_parser.UNPROVIDED) {
            stream = (SubLObject)rbp_chart_parser.T;
        }
        if (depth == rbp_chart_parser.UNPROVIDED) {
            depth = (SubLObject)rbp_chart_parser.NIL;
        }
        PrintLow.format(stream, (SubLObject)rbp_chart_parser.$str30$____RBP_CHART___);
        PrintLow.format(stream, (SubLObject)rbp_chart_parser.$str31$___Input_length___D__, rbp_chart_input_length(chart));
        PrintLow.format(stream, (SubLObject)rbp_chart_parser.$str32$____Chart_edges___D__, Hashtables.hash_table_count(rbp_chart_edges(chart)));
        PrintLow.format(stream, (SubLObject)rbp_chart_parser.$str33$___Total_Blocks___D_, Hashtables.hash_table_count(rbp_chart_block_hash(chart)));
        return (SubLObject)rbp_chart_parser.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 2787L)
    public static SubLObject rbp_chart_parse(SubLObject chart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)rbp_chart_parser.NIL;
        final SubLObject _prev_bind_0 = rbp_chart_parser.$rbp_current_chart$.currentBinding(thread);
        try {
            rbp_chart_parser.$rbp_current_chart$.bind(chart, thread);
            final SubLObject max_span = rbp_chart_max_span(chart);
            parses = rbp_chart_parse_span(max_span);
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue(thread);
        }
        finally {
            rbp_chart_parser.$rbp_current_chart$.rebind(_prev_bind_0, thread);
        }
        return parses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 3176L)
    public static SubLObject rbp_chart_parse_span(final SubLObject span) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rbp_chart_parser.NIL == rbp_chart_doneP(span, (SubLObject)rbp_chart_parser.UNPROVIDED)) {
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
            for (cdotimes_end_var = number_utilities.f_1_(interval_span.interval_span_length(span)), i = (SubLObject)rbp_chart_parser.NIL, i = (SubLObject)rbp_chart_parser.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)rbp_chart_parser.ONE_INTEGER)) {
                mod_head_boundary = Numbers.add(start, i, (SubLObject)rbp_chart_parser.ONE_INTEGER);
                cdolist_list_var = rbp_chart_parse_span(interval_span.get_interval_span(start, mod_head_boundary));
                mod = (SubLObject)rbp_chart_parser.NIL;
                mod = cdolist_list_var.first();
                while (rbp_chart_parser.NIL != cdolist_list_var) {
                    cdolist_list_var_$1 = rbp_chart_parse_span(interval_span.get_interval_span(mod_head_boundary, end));
                    head = (SubLObject)rbp_chart_parser.NIL;
                    head = cdolist_list_var_$1.first();
                    while (rbp_chart_parser.NIL != cdolist_list_var_$1) {
                        cdolist_list_var_$2 = Functions.funcall(rbp_chart_block_merge_fn(rbp_chart_parser.$rbp_current_chart$.getDynamicValue(thread)), mod, head, rbp_chart_block_hash(rbp_chart_parser.$rbp_current_chart$.getDynamicValue(thread)));
                        block = (SubLObject)rbp_chart_parser.NIL;
                        block = cdolist_list_var_$2.first();
                        while (rbp_chart_parser.NIL != cdolist_list_var_$2) {
                            if (rbp_chart_parser.NIL != block) {
                                rbp_chart_add(block, (SubLObject)rbp_chart_parser.UNPROVIDED);
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
            rbp_chart_done(span, (SubLObject)rbp_chart_parser.UNPROVIDED);
        }
        return rbp_chart_lookup(span, (SubLObject)rbp_chart_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 4026L)
    public static SubLObject rbp_chart_doneP(final SubLObject span, SubLObject chart) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        return Equality.eq(Hashtables.gethash(span, rbp_chart_done_spans(chart), (SubLObject)rbp_chart_parser.UNPROVIDED), (SubLObject)rbp_chart_parser.$kw34$DONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 4218L)
    public static SubLObject rbp_chart_done(final SubLObject span, SubLObject chart) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        return Hashtables.sethash(span, rbp_chart_done_spans(chart), (SubLObject)rbp_chart_parser.$kw34$DONE);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 4482L)
    public static SubLObject rbp_chart_add(final SubLObject block, SubLObject chart) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        final SubLObject span = noun_compound_parser.nc_block_span_index(block);
        final SubLObject id = noun_compound_parser.nc_block_unique_id(block);
        if (rbp_chart_parser.$rbp_chart_parse_mode$.getGlobalValue() == rbp_chart_parser.$kw36$QUICK) {
            rbp_chart_done(span, chart);
        }
        rbp_chart_block_hash_add(block, chart);
        return hash_table_utilities.pushnew_hash(span, id, rbp_chart_edges(chart), (SubLObject)rbp_chart_parser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 4861L)
    public static SubLObject rbp_chart_lookup(final SubLObject span, SubLObject chart) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rbp_chart_parser.NIL;
        final SubLObject ids = Hashtables.gethash(span, rbp_chart_edges(chart), (SubLObject)rbp_chart_parser.UNPROVIDED);
        final SubLObject _prev_bind_0 = rbp_chart_parser.$rbp_current_chart$.currentBinding(thread);
        try {
            rbp_chart_parser.$rbp_current_chart$.bind(chart, thread);
            ans = Mapping.mapcar((SubLObject)rbp_chart_parser.$sym37$RBP_CHART_BLOCK_HASH_LOOKUP, ids);
        }
        finally {
            rbp_chart_parser.$rbp_current_chart$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 5170L)
    public static SubLObject rbp_chart_block_hash_add(final SubLObject block, SubLObject chart) {
        if (chart == rbp_chart_parser.UNPROVIDED) {
            chart = rbp_chart_parser.$rbp_current_chart$.getDynamicValue();
        }
        return Hashtables.sethash(noun_compound_parser.nc_block_unique_id(block), rbp_chart_block_hash(chart), block);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-chart-parser.lisp", position = 5339L)
    public static SubLObject rbp_chart_block_hash_lookup(final SubLObject block_id, SubLObject block_hash) {
        if (block_hash == rbp_chart_parser.UNPROVIDED) {
            block_hash = rbp_chart_block_hash(rbp_chart_parser.$rbp_current_chart$.getDynamicValue());
        }
        return Hashtables.gethash(block_id, block_hash, (SubLObject)rbp_chart_parser.UNPROVIDED);
    }
    
    public static SubLObject declare_rbp_chart_parser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_print_function_trampoline", "RBP-CHART-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_p", "RBP-CHART-P", 1, 0, false);
        new $rbp_chart_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_input_length", "RBP-CHART-INPUT-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_edges", "RBP-CHART-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_done_spans", "RBP-CHART-DONE-SPANS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_block_merge_fn", "RBP-CHART-BLOCK-MERGE-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_block_hash", "RBP-CHART-BLOCK-HASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "_csetf_rbp_chart_input_length", "_CSETF-RBP-CHART-INPUT-LENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "_csetf_rbp_chart_edges", "_CSETF-RBP-CHART-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "_csetf_rbp_chart_done_spans", "_CSETF-RBP-CHART-DONE-SPANS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "_csetf_rbp_chart_block_merge_fn", "_CSETF-RBP-CHART-BLOCK-MERGE-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "_csetf_rbp_chart_block_hash", "_CSETF-RBP-CHART-BLOCK-HASH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "make_rbp_chart", "MAKE-RBP-CHART", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "visit_defstruct_rbp_chart", "VISIT-DEFSTRUCT-RBP-CHART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "visit_defstruct_object_rbp_chart_method", "VISIT-DEFSTRUCT-OBJECT-RBP-CHART-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "new_rbp_chart", "NEW-RBP-CHART", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_max_span", "RBP-CHART-MAX-SPAN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_summarize", "RBP-CHART-SUMMARIZE", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_parse", "RBP-CHART-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_parse_span", "RBP-CHART-PARSE-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_doneP", "RBP-CHART-DONE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_done", "RBP-CHART-DONE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_add", "RBP-CHART-ADD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_lookup", "RBP-CHART-LOOKUP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_block_hash_add", "RBP-CHART-BLOCK-HASH-ADD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_chart_parser", "rbp_chart_block_hash_lookup", "RBP-CHART-BLOCK-HASH-LOOKUP", 1, 1, false);
        return (SubLObject)rbp_chart_parser.NIL;
    }
    
    public static SubLObject init_rbp_chart_parser_file() {
        rbp_chart_parser.$dtp_rbp_chart$ = SubLFiles.defconstant("*DTP-RBP-CHART*", (SubLObject)rbp_chart_parser.$sym0$RBP_CHART);
        rbp_chart_parser.$rbp_current_chart$ = SubLFiles.defparameter("*RBP-CURRENT-CHART*", (SubLObject)rbp_chart_parser.NIL);
        rbp_chart_parser.$rbp_chart_parse_mode$ = SubLFiles.deflexical("*RBP-CHART-PARSE-MODE*", (SubLObject)rbp_chart_parser.$kw35$THOROUGH);
        return (SubLObject)rbp_chart_parser.NIL;
    }
    
    public static SubLObject setup_rbp_chart_parser_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rbp_chart_parser.$dtp_rbp_chart$.getGlobalValue(), Symbols.symbol_function((SubLObject)rbp_chart_parser.$sym7$RBP_CHART_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rbp_chart_parser.$list8);
        Structures.def_csetf((SubLObject)rbp_chart_parser.$sym9$RBP_CHART_INPUT_LENGTH, (SubLObject)rbp_chart_parser.$sym10$_CSETF_RBP_CHART_INPUT_LENGTH);
        Structures.def_csetf((SubLObject)rbp_chart_parser.$sym11$RBP_CHART_EDGES, (SubLObject)rbp_chart_parser.$sym12$_CSETF_RBP_CHART_EDGES);
        Structures.def_csetf((SubLObject)rbp_chart_parser.$sym13$RBP_CHART_DONE_SPANS, (SubLObject)rbp_chart_parser.$sym14$_CSETF_RBP_CHART_DONE_SPANS);
        Structures.def_csetf((SubLObject)rbp_chart_parser.$sym15$RBP_CHART_BLOCK_MERGE_FN, (SubLObject)rbp_chart_parser.$sym16$_CSETF_RBP_CHART_BLOCK_MERGE_FN);
        Structures.def_csetf((SubLObject)rbp_chart_parser.$sym17$RBP_CHART_BLOCK_HASH, (SubLObject)rbp_chart_parser.$sym18$_CSETF_RBP_CHART_BLOCK_HASH);
        Equality.identity((SubLObject)rbp_chart_parser.$sym0$RBP_CHART);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rbp_chart_parser.$dtp_rbp_chart$.getGlobalValue(), Symbols.symbol_function((SubLObject)rbp_chart_parser.$sym29$VISIT_DEFSTRUCT_OBJECT_RBP_CHART_METHOD));
        return (SubLObject)rbp_chart_parser.NIL;
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
        me = (SubLFile)new rbp_chart_parser();
        rbp_chart_parser.$dtp_rbp_chart$ = null;
        rbp_chart_parser.$rbp_current_chart$ = null;
        rbp_chart_parser.$rbp_chart_parse_mode$ = null;
        $sym0$RBP_CHART = SubLObjectFactory.makeSymbol("RBP-CHART");
        $sym1$RBP_CHART_P = SubLObjectFactory.makeSymbol("RBP-CHART-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INPUT-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-SPANS"), (SubLObject)SubLObjectFactory.makeSymbol("BLOCK-MERGE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("BLOCK-HASH"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-LENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES"), (SubLObject)SubLObjectFactory.makeKeyword("DONE-SPANS"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK-MERGE-FN"), (SubLObject)SubLObjectFactory.makeKeyword("BLOCK-HASH"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-CHART-INPUT-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-CHART-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-CHART-DONE-SPANS"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-CHART-BLOCK-MERGE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-CHART-BLOCK-HASH"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-INPUT-LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-EDGES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-DONE-SPANS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-BLOCK-MERGE-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-BLOCK-HASH"));
        $sym6$RBP_CHART_SUMMARIZE = SubLObjectFactory.makeSymbol("RBP-CHART-SUMMARIZE");
        $sym7$RBP_CHART_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RBP-CHART-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-CHART-P"));
        $sym9$RBP_CHART_INPUT_LENGTH = SubLObjectFactory.makeSymbol("RBP-CHART-INPUT-LENGTH");
        $sym10$_CSETF_RBP_CHART_INPUT_LENGTH = SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-INPUT-LENGTH");
        $sym11$RBP_CHART_EDGES = SubLObjectFactory.makeSymbol("RBP-CHART-EDGES");
        $sym12$_CSETF_RBP_CHART_EDGES = SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-EDGES");
        $sym13$RBP_CHART_DONE_SPANS = SubLObjectFactory.makeSymbol("RBP-CHART-DONE-SPANS");
        $sym14$_CSETF_RBP_CHART_DONE_SPANS = SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-DONE-SPANS");
        $sym15$RBP_CHART_BLOCK_MERGE_FN = SubLObjectFactory.makeSymbol("RBP-CHART-BLOCK-MERGE-FN");
        $sym16$_CSETF_RBP_CHART_BLOCK_MERGE_FN = SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-BLOCK-MERGE-FN");
        $sym17$RBP_CHART_BLOCK_HASH = SubLObjectFactory.makeSymbol("RBP-CHART-BLOCK-HASH");
        $sym18$_CSETF_RBP_CHART_BLOCK_HASH = SubLObjectFactory.makeSymbol("_CSETF-RBP-CHART-BLOCK-HASH");
        $kw19$INPUT_LENGTH = SubLObjectFactory.makeKeyword("INPUT-LENGTH");
        $kw20$EDGES = SubLObjectFactory.makeKeyword("EDGES");
        $kw21$DONE_SPANS = SubLObjectFactory.makeKeyword("DONE-SPANS");
        $kw22$BLOCK_MERGE_FN = SubLObjectFactory.makeKeyword("BLOCK-MERGE-FN");
        $kw23$BLOCK_HASH = SubLObjectFactory.makeKeyword("BLOCK-HASH");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_RBP_CHART = SubLObjectFactory.makeSymbol("MAKE-RBP-CHART");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_RBP_CHART_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RBP-CHART-METHOD");
        $str30$____RBP_CHART___ = SubLObjectFactory.makeString("~&#<RBP-CHART:~%");
        $str31$___Input_length___D__ = SubLObjectFactory.makeString("~& Input length: ~D~%");
        $str32$____Chart_edges___D__ = SubLObjectFactory.makeString("~&  Chart edges: ~D~%");
        $str33$___Total_Blocks___D_ = SubLObjectFactory.makeString("~& Total Blocks: ~D>");
        $kw34$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw35$THOROUGH = SubLObjectFactory.makeKeyword("THOROUGH");
        $kw36$QUICK = SubLObjectFactory.makeKeyword("QUICK");
        $sym37$RBP_CHART_BLOCK_HASH_LOOKUP = SubLObjectFactory.makeSymbol("RBP-CHART-BLOCK-HASH-LOOKUP");
    }
    
    public static final class $rbp_chart_native extends SubLStructNative
    {
        public SubLObject $input_length;
        public SubLObject $edges;
        public SubLObject $done_spans;
        public SubLObject $block_merge_fn;
        public SubLObject $block_hash;
        private static final SubLStructDeclNative structDecl;
        
        public $rbp_chart_native() {
            this.$input_length = (SubLObject)CommonSymbols.NIL;
            this.$edges = (SubLObject)CommonSymbols.NIL;
            this.$done_spans = (SubLObject)CommonSymbols.NIL;
            this.$block_merge_fn = (SubLObject)CommonSymbols.NIL;
            this.$block_hash = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rbp_chart_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$rbp_chart_native.class, rbp_chart_parser.$sym0$RBP_CHART, rbp_chart_parser.$sym1$RBP_CHART_P, rbp_chart_parser.$list2, rbp_chart_parser.$list3, new String[] { "$input_length", "$edges", "$done_spans", "$block_merge_fn", "$block_hash" }, rbp_chart_parser.$list4, rbp_chart_parser.$list5, rbp_chart_parser.$sym6$RBP_CHART_SUMMARIZE);
        }
    }
    
    public static final class $rbp_chart_p$UnaryFunction extends UnaryFunction
    {
        public $rbp_chart_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RBP-CHART-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rbp_chart_parser.rbp_chart_p(arg1);
        }
    }
}

/*

	Total time: 86 ms
	
*/