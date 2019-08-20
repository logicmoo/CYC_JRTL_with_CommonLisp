package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$keyword_package$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class google_charts extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new google_charts();



    // deflexical
    private static final SubLSymbol $html_google_data_table_chart_script$ = makeSymbol("*HTML-GOOGLE-DATA-TABLE-CHART-SCRIPT*");

    // deflexical
    private static final SubLSymbol $google_chart_meta_properties$ = makeSymbol("*GOOGLE-CHART-META-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $google_chart_properties$ = makeSymbol("*GOOGLE-CHART-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $google_chart_h_axis_properties$ = makeSymbol("*GOOGLE-CHART-H-AXIS-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $google_chart_v_axis_properties$ = makeSymbol("*GOOGLE-CHART-V-AXIS-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $google_chart_legend_properties$ = makeSymbol("*GOOGLE-CHART-LEGEND-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $google_data_properties$ = makeSymbol("*GOOGLE-DATA-PROPERTIES*");







    private static final SubLSymbol $CHART_TYPE = makeKeyword("CHART-TYPE");

    private static final SubLSymbol $SCATTER_CHART = makeKeyword("SCATTER-CHART");

    private static final SubLSymbol $LINE_CHART = makeKeyword("LINE-CHART");

    private static final SubLSymbol $PIE_CHART = makeKeyword("PIE-CHART");

    private static final SubLString $str5$unsupported_chart_type___S = makeString("unsupported chart type: ~S");

    private static final SubLString $str6$http___www_google_com_jsapi = makeString("http://www.google.com/jsapi");

    private static final SubLString $str7$text_javascript = makeString("text/javascript");

    private static final SubLString $str8$__google_load__visualization____1 = makeString("  google.load('visualization', '1', {packages: ['corechart']});");

    private static final SubLString $str9$___function__A_elementID__chartOp = makeString("\n  function ~A(elementID, chartOptions, dataColumns, dataRows) {\n    var docElement   = document.getElementById(elementID);\n    var dataQuaArray = dataRows;\n    dataQuaArray.unshift(dataColumns);\n    var dataTable = google.visualization.arrayToDataTable(dataQuaArray);\n    var chartObject = new google.visualization.~A(docElement);\n    chartObject.draw(dataTable, chartOptions);\n  }");

    private static final SubLString $$$drawScatterChart = makeString("drawScatterChart");

    private static final SubLString $$$ScatterChart = makeString("ScatterChart");

    private static final SubLString $$$drawLineChart = makeString("drawLineChart");

    private static final SubLString $$$LineChart = makeString("LineChart");

    private static final SubLString $$$drawPieChart = makeString("drawPieChart");

    private static final SubLString $$$PieChart = makeString("PieChart");

    private static final SubLList $list16 = list(makeKeyword("ID"), makeKeyword("WIDTH"), makeKeyword("HEIGHT"));

    private static final SubLList $list17 = list(makeKeyword("TITLE"), makeKeyword("CURVE-TYPE"));

    private static final SubLList $list18 = list(makeKeyword("H-AXIS-TITLE"), makeKeyword("H-AXIS-MIN-VALUE"), makeKeyword("H-AXIS-MAX-VALUE"));

    private static final SubLList $list19 = list(makeKeyword("V-AXIS-TITLE"), makeKeyword("V-AXIS-MIN-VALUE"), makeKeyword("V-AXIS-MAX-VALUE"));

    private static final SubLList $list20 = list(makeKeyword("LEGEND-POSITION"));

    private static final SubLList $list21 = list(makeKeyword("DATA-COLUMNS"), makeKeyword("DATA-ROWS"));





    private static final SubLInteger $int$600 = makeInteger(600);



    private static final SubLString $$$chart = makeString("chart");

    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLString $$$px = makeString("px");

    private static final SubLString $str29$options_ = makeString("options_");

    private static final SubLString $str30$columns_ = makeString("columns_");

    private static final SubLString $str31$rows_ = makeString("rows_");

    private static final SubLString $str32$width__ = makeString("width: ");

    private static final SubLString $str33$__height__ = makeString("; height: ");

    private static final SubLString $str34$_ = makeString(";");

    private static final SubLString $str35$____var__A____ = makeString("~%  var ~A = {");

    private static final SubLString $str36$_______hAxis__ = makeString(",~%    hAxis: ");

    private static final SubLSymbol $H_AXIS = makeKeyword("H-AXIS");

    private static final SubLString $str38$_______vAxis__ = makeString(",~%    vAxis: ");

    private static final SubLSymbol $V_AXIS = makeKeyword("V-AXIS");

    private static final SubLString $str40$_______legend__ = makeString(",~%    legend: ");

    private static final SubLSymbol $LEGEND = makeKeyword("LEGEND");

    private static final SubLString $str42$____ = makeString("~%  ");

    private static final SubLString $str43$__ = makeString("};");

    private static final SubLSymbol $DATA_COLUMNS = makeKeyword("DATA-COLUMNS");

    private static final SubLSymbol $DATA_ROWS = makeKeyword("DATA-ROWS");

    private static final SubLString $str46$____var__A_______ = makeString("~%  var ~A =~%  [");

    private static final SubLString $str47$__ = makeString(", ");

    private static final SubLString $str48$__A_ = makeString("'~A'");

    private static final SubLString $str49$__ = makeString("];");

    private static final SubLString $str50$____var__A________ = makeString("~%  var ~A = [~%  ");

    private static final SubLString $str51$_____ = makeString(",~%  ");

    private static final SubLString $str52$_ = makeString("[");

    private static final SubLString $str53$_ = makeString("]");

    private static final SubLString $str54$_____A___A____A___A___A__ = makeString("~%  ~A('~A', ~A, ~A, ~A);");

    private static final SubLString $str55$_ = makeString("{");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str57$__ = makeString(": ");

    private static final SubLString $str58$_ = makeString("}");

    private static final SubLSymbol GOOGLE_PROPERTY_STRING = makeSymbol("GOOGLE-PROPERTY-STRING");



    private static final SubLList $list61 = list(CHAR_hyphen);

    private static final SubLList $list62 = list(makeSymbol("FIRST-STRING"), makeSymbol("&REST"), makeSymbol("REST-STRINGS"));

    private static final SubLSymbol STRING_CAPITALIZE = makeSymbol("STRING-CAPITALIZE");

    private static final SubLSymbol $google_property_string_caching_state$ = makeSymbol("*GOOGLE-PROPERTY-STRING-CACHING-STATE*");

    private static final SubLList $list65 = cons(makeSymbol("PROPERTY"), makeSymbol("VALUE"));

    private static final SubLSymbol GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX = makeSymbol("GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX");

    private static final SubLSymbol $google_property_simplify_wrt_prefix_caching_state$ = makeSymbol("*GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX-CACHING-STATE*");

    private static final SubLInteger $int$450 = makeInteger(450);



    private static final SubLString $$$Inference_ = makeString("Inference ");

    private static final SubLString $str71$_ = makeString(".");

    private static final SubLString $$$_Answer_Timeline = makeString(" Answer Timeline");

    private static final SubLString $$$milliseconds = makeString("milliseconds");

    private static final SubLString $$$seconds = makeString("seconds");

    private static final SubLString $str75$Time__ = makeString("Time (");

    private static final SubLString $str76$_ = makeString(")");

    private static final SubLString $str77$Answer__ = makeString("Answer #");



    private static final SubLSymbol $sym79$_ = makeSymbol("*");







    private static final SubLSymbol $H_AXIS_TITLE = makeKeyword("H-AXIS-TITLE");

    private static final SubLSymbol $H_AXIS_MIN_VALUE = makeKeyword("H-AXIS-MIN-VALUE");

    private static final SubLSymbol $H_AXIS_MAX_VALUE = makeKeyword("H-AXIS-MAX-VALUE");

    private static final SubLSymbol $V_AXIS_TITLE = makeKeyword("V-AXIS-TITLE");

    private static final SubLSymbol $V_AXIS_MIN_VALUE = makeKeyword("V-AXIS-MIN-VALUE");

    private static final SubLSymbol $V_AXIS_MAX_VALUE = makeKeyword("V-AXIS-MAX-VALUE");

    private static final SubLSymbol $LEGEND_POSITION = makeKeyword("LEGEND-POSITION");



    private static final SubLString $str91$Time__Answer = makeString("Time, Answer");

    public static SubLObject html_google_chart(final SubLObject chart_spec) {
        assert NIL != list_utilities.property_list_p(chart_spec) : "list_utilities.property_list_p(chart_spec) " + "CommonSymbols.NIL != list_utilities.property_list_p(chart_spec) " + chart_spec;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = getf(chart_spec, $CHART_TYPE, UNPROVIDED);
        if (pcase_var.eql($SCATTER_CHART)) {
            return html_google_scatter_chart(chart_spec);
        }
        if (pcase_var.eql($LINE_CHART)) {
            return html_google_line_chart(chart_spec);
        }
        if (pcase_var.eql($PIE_CHART)) {
            return html_google_pie_chart(chart_spec);
        }
        return Errors.error($str5$unsupported_chart_type___S, type);
    }

    public static SubLObject html_google_chart_scripts(final SubLObject types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str6$http___www_google_com_jsapi);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str7$text_javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str7$text_javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_terpri(UNPROVIDED);
            html_markup($str8$__google_load__visualization____1);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        SubLObject cdolist_list_var = types;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql($SCATTER_CHART)) {
                html_google_scatter_chart_script();
            } else
                if (pcase_var.eql($LINE_CHART)) {
                    html_google_line_chart_script();
                } else
                    if (pcase_var.eql($PIE_CHART)) {
                        html_google_pie_chart_script();
                    } else {
                        Errors.error($str5$unsupported_chart_type___S, type);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return types;
    }

    public static SubLObject html_google_data_table_chart_script(final SubLObject draw_method, final SubLObject constructor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str7$text_javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $html_google_data_table_chart_script$.getGlobalValue(), draw_method, constructor);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_google_scatter_chart(final SubLObject chart_spec) {
        return html_google_data_table_chart(chart_spec, $$$drawScatterChart);
    }

    public static SubLObject html_google_scatter_chart_script() {
        return html_google_data_table_chart_script($$$drawScatterChart, $$$ScatterChart);
    }

    public static SubLObject html_google_line_chart(final SubLObject chart_spec) {
        return html_google_data_table_chart(chart_spec, $$$drawLineChart);
    }

    public static SubLObject html_google_line_chart_script() {
        return html_google_data_table_chart_script($$$drawLineChart, $$$LineChart);
    }

    public static SubLObject html_google_pie_chart(final SubLObject chart_spec) {
        return html_google_data_table_chart(chart_spec, $$$drawPieChart);
    }

    public static SubLObject html_google_pie_chart_script() {
        return html_google_data_table_chart_script($$$drawPieChart, $$$PieChart);
    }

    public static SubLObject html_google_data_table_chart(final SubLObject chart_spec, final SubLObject draw_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_properties = list_utilities.plist_restricted_to_indicators(chart_spec, $google_chart_meta_properties$.getGlobalValue());
        final SubLObject chart_properties = list_utilities.plist_restricted_to_indicators(chart_spec, $google_chart_properties$.getGlobalValue());
        final SubLObject h_axis_properties = list_utilities.plist_restricted_to_indicators(chart_spec, $google_chart_h_axis_properties$.getGlobalValue());
        final SubLObject v_axis_properties = list_utilities.plist_restricted_to_indicators(chart_spec, $google_chart_v_axis_properties$.getGlobalValue());
        final SubLObject legend_properties = list_utilities.plist_restricted_to_indicators(chart_spec, $google_chart_legend_properties$.getGlobalValue());
        final SubLObject data_properties = list_utilities.plist_restricted_to_indicators(chart_spec, $google_data_properties$.getGlobalValue());
        final SubLObject current;
        final SubLObject datum = current = meta_properties;
        final SubLObject id_tail = property_list_member($ID, current);
        SubLObject id = (NIL != id_tail) ? cadr(id_tail) : NIL;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        SubLObject width = (NIL != width_tail) ? cadr(width_tail) : $int$600;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        SubLObject height = (NIL != height_tail) ? cadr(height_tail) : NIL;
        if (NIL == id) {
            id = cconcatenate($$$chart, format_nil.format_nil_a_no_copy(random.random($int$1000000)));
        }
        if ((NIL == height) && width.isInteger()) {
            height = round(divide(multiply(THREE_INTEGER, width), FOUR_INTEGER), UNPROVIDED);
        }
        if (height.isInteger()) {
            height = cconcatenate(format_nil.format_nil_a_no_copy(height), $$$px);
        }
        if (width.isInteger()) {
            width = cconcatenate(format_nil.format_nil_a_no_copy(width), $$$px);
        }
        final SubLObject options_var = cconcatenate($str29$options_, format_nil.format_nil_a_no_copy(id));
        final SubLObject columns_var = cconcatenate($str30$columns_, format_nil.format_nil_a_no_copy(id));
        final SubLObject rows_var = cconcatenate($str31$rows_, format_nil.format_nil_a_no_copy(id));
        final SubLObject div_style = cconcatenate($str32$width__, new SubLObject[]{ format_nil.format_nil_a_no_copy(width), $str33$__height__, format_nil.format_nil_a_no_copy(height), $str34$_ });
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str7$text_javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str35$____var__A____, options_var);
            html_output_google_properties(chart_properties, FOUR_INTEGER, NIL);
            if (NIL != h_axis_properties) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str36$_______hAxis__);
                html_output_google_properties(google_plist_prefix_simplify(h_axis_properties, $H_AXIS), NIL, T);
            }
            if (NIL != v_axis_properties) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str38$_______vAxis__);
                html_output_google_properties(google_plist_prefix_simplify(v_axis_properties, $V_AXIS), NIL, T);
            }
            if (NIL != legend_properties) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str40$_______legend__);
                html_output_google_properties(google_plist_prefix_simplify(legend_properties, $LEGEND), NIL, T);
            }
            format(html_macros.$html_stream$.getDynamicValue(thread), $str42$____);
            html_markup($str43$__);
            final SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = data_properties;
            final SubLObject data_columns_tail = property_list_member($DATA_COLUMNS, current_$2);
            final SubLObject data_columns = (NIL != data_columns_tail) ? cadr(data_columns_tail) : NIL;
            final SubLObject data_rows_tail = property_list_member($DATA_ROWS, current_$2);
            final SubLObject data_rows = (NIL != data_rows_tail) ? cadr(data_rows_tail) : NIL;
            format(html_macros.$html_stream$.getDynamicValue(thread), $str46$____var__A_______, columns_var);
            SubLObject list_var = NIL;
            SubLObject column = NIL;
            SubLObject index = NIL;
            list_var = data_columns;
            column = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , column = list_var.first() , index = add(ONE_INTEGER, index)) {
                if (!index.isZero()) {
                    html_markup($str47$__);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str48$__A_, column);
            }
            html_markup($str49$__);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str50$____var__A________, rows_var);
            list_var = NIL;
            SubLObject row = NIL;
            SubLObject row_index = NIL;
            list_var = data_rows;
            row = list_var.first();
            for (row_index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , row = list_var.first() , row_index = add(ONE_INTEGER, row_index)) {
                if (!row_index.isZero()) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str51$_____);
                }
                html_markup($str52$_);
                SubLObject list_var_$3 = NIL;
                SubLObject item = NIL;
                SubLObject item_index = NIL;
                list_var_$3 = row;
                item = list_var_$3.first();
                for (item_index = ZERO_INTEGER; NIL != list_var_$3; list_var_$3 = list_var_$3.rest() , item = list_var_$3.first() , item_index = add(ONE_INTEGER, item_index)) {
                    if (!item_index.isZero()) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str47$__);
                    }
                    if (item.isString()) {
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str48$__A_, item);
                    } else {
                        html_princ(item);
                    }
                }
                html_markup($str53$_);
            }
            format(html_macros.$html_stream$.getDynamicValue(thread), $str42$____);
            html_markup($str49$__);
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(div_style);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str7$text_javascript);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str54$_____A___A____A___A___A__, new SubLObject[]{ draw_method, id, options_var, columns_var, rows_var });
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_output_google_properties(final SubLObject plist, SubLObject wrap_betweenP, SubLObject bracesP) {
        if (wrap_betweenP == UNPROVIDED) {
            wrap_betweenP = NIL;
        }
        if (bracesP == UNPROVIDED) {
            bracesP = NIL;
        }
        SubLObject index = ZERO_INTEGER;
        if (NIL != bracesP) {
            html_markup($str55$_);
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject i;
        for (remainder = NIL, remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            if (!index.isZero()) {
                html_markup($str47$__);
            }
            if (NIL != wrap_betweenP) {
                html_terpri(UNPROVIDED);
                if (wrap_betweenP.isInteger()) {
                    for (i = NIL, i = ZERO_INTEGER; i.numL(wrap_betweenP); i = add(i, ONE_INTEGER)) {
                        html_markup($$$_);
                    }
                }
            }
            html_output_google_property(property);
            html_markup($str57$__);
            html_output_google_property_value(value);
            index = add(index, ONE_INTEGER);
        }
        if (NIL != bracesP) {
            html_markup($str58$_);
        }
        return NIL;
    }

    public static SubLObject html_output_google_property(final SubLObject property) {
        final SubLObject string = google_property_string(property);
        return html_markup(string);
    }

    public static SubLObject clear_google_property_string() {
        final SubLObject cs = $google_property_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_google_property_string(final SubLObject symbol) {
        return memoization_state.caching_state_remove_function_results_with_args($google_property_string_caching_state$.getGlobalValue(), list(symbol), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject google_property_string_internal(final SubLObject symbol) {
        assert NIL != symbolp(symbol) : "Types.symbolp(symbol) " + "CommonSymbols.NIL != Types.symbolp(symbol) " + symbol;
        final SubLObject basis = symbol_name(symbol);
        final SubLObject raw_strings = string_utilities.split_string(basis, $list61);
        SubLObject current;
        final SubLObject datum = current = raw_strings;
        SubLObject first_string = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        first_string = current.first();
        SubLObject rest_strings;
        current = rest_strings = current.rest();
        first_string = Strings.string_downcase(first_string, UNPROVIDED, UNPROVIDED);
        rest_strings = Mapping.mapcar(symbol_function(STRING_CAPITALIZE), rest_strings);
        return string_utilities.concatenate_strings(cons(first_string, rest_strings));
    }

    public static SubLObject google_property_string(final SubLObject symbol) {
        SubLObject caching_state = $google_property_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GOOGLE_PROPERTY_STRING, $google_property_string_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, symbol, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(google_property_string_internal(symbol)));
            memoization_state.caching_state_put(caching_state, symbol, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject html_output_google_property_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (value.isString()) {
            return format(html_macros.$html_stream$.getDynamicValue(thread), $str48$__A_, value);
        }
        if (value.isKeyword()) {
            final SubLObject string = google_property_string(value);
            return html_output_google_property_value(string);
        }
        return html_princ(value);
    }

    public static SubLObject google_plist_prefix_simplify(final SubLObject plist, final SubLObject prefix_symbol) {
        final SubLObject alist = list_utilities.plist_to_alist(plist);
        SubLObject simpler_alist = NIL;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject property = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list65);
            property = current.first();
            current = value = current.rest();
            final SubLObject simplier_prop = google_property_simplify_wrt_prefix(property, prefix_symbol);
            simpler_alist = cons(cons(simplier_prop, value), simpler_alist);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return list_utilities.alist_to_plist(nreverse(simpler_alist));
    }

    public static SubLObject clear_google_property_simplify_wrt_prefix() {
        final SubLObject cs = $google_property_simplify_wrt_prefix_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_google_property_simplify_wrt_prefix(final SubLObject property, final SubLObject prefix_symbol) {
        return memoization_state.caching_state_remove_function_results_with_args($google_property_simplify_wrt_prefix_caching_state$.getGlobalValue(), list(property, prefix_symbol), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject google_property_simplify_wrt_prefix_internal(final SubLObject property, final SubLObject prefix_symbol) {
        final SubLObject big_name = symbol_name(property);
        final SubLObject prefix = symbol_name(prefix_symbol);
        final SubLObject prefix_start = search(prefix, big_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (ZERO_INTEGER.eql(prefix_start)) {
            final SubLObject suffix_start = number_utilities.f_1X(length(prefix));
            final SubLObject simpler_name = string_utilities.substring(big_name, suffix_start, UNPROVIDED);
            return intern(simpler_name, $keyword_package$.getGlobalValue());
        }
        return property;
    }

    public static SubLObject google_property_simplify_wrt_prefix(final SubLObject property, final SubLObject prefix_symbol) {
        SubLObject caching_state = $google_property_simplify_wrt_prefix_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX, $google_property_simplify_wrt_prefix_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(property, prefix_symbol);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (property.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && prefix_symbol.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(google_property_simplify_wrt_prefix_internal(property, prefix_symbol)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(property, prefix_symbol));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_answer_timeline_google_chart(final SubLObject inference, SubLObject chart_properties) {
        if (chart_properties == UNPROVIDED) {
            chart_properties = NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = chart_properties;
        final SubLObject width_tail = property_list_member($WIDTH, current);
        final SubLObject width = (NIL != width_tail) ? cadr(width_tail) : $int$600;
        final SubLObject height_tail = property_list_member($HEIGHT, current);
        final SubLObject height = (NIL != height_tail) ? cadr(height_tail) : $int$450;
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        SubLObject tuples = cb_query.inference_answer_tuples_for_chart(inference);
        final SubLObject last_tuple = list_utilities.last_one(tuples);
        final SubLObject last_raw_time = last_tuple.first();
        final SubLObject last_raw_answer = second(last_tuple);
        final SubLObject use_millisecondsP = numLE(last_raw_time, ONE_INTEGER);
        final SubLObject last_time = multiply(NIL != use_millisecondsP ? $int$1000 : ONE_INTEGER, number_utilities.significant_digits(last_raw_time, THREE_INTEGER));
        final SubLObject last_answer = max(TWO_INTEGER, last_raw_answer);
        final SubLObject title = cconcatenate($$$Inference_, new SubLObject[]{ format_nil.format_nil_a_no_copy(store_suid), $str71$_, format_nil.format_nil_a_no_copy(inference_suid), $$$_Answer_Timeline });
        final SubLObject h_axis_units = (NIL != use_millisecondsP) ? $$$milliseconds : $$$seconds;
        final SubLObject h_axis_title = cconcatenate($str75$Time__, new SubLObject[]{ format_nil.format_nil_a_no_copy(h_axis_units), $str76$_ });
        final SubLObject v_axis_title = $str77$Answer__;
        if (NIL != use_millisecondsP) {
            tuples = Mapping.mapcar(symbol_function(LIST), Mapping.mapcar(symbol_function($sym79$_), Mapping.mapcar(symbol_function(FIRST), tuples), new SubLObject[]{ make_list(length(tuples), $int$1000) }), new SubLObject[]{ Mapping.mapcar(symbol_function(SECOND), tuples) });
        }
        return list(new SubLObject[]{ $CHART_TYPE, $SCATTER_CHART, $TITLE, title, $WIDTH, width, $HEIGHT, height, $H_AXIS_TITLE, h_axis_title, $H_AXIS_MIN_VALUE, ZERO_INTEGER, $H_AXIS_MAX_VALUE, last_time, $V_AXIS_TITLE, v_axis_title, $V_AXIS_MIN_VALUE, ZERO_INTEGER, $V_AXIS_MAX_VALUE, last_answer, $LEGEND_POSITION, $NONE, $DATA_COLUMNS, list(h_axis_title, $str91$Time__Answer), $DATA_ROWS, tuples });
    }

    public static SubLObject declare_google_charts_file() {
        declareFunction("html_google_chart", "HTML-GOOGLE-CHART", 1, 0, false);
        declareFunction("html_google_chart_scripts", "HTML-GOOGLE-CHART-SCRIPTS", 1, 0, false);
        declareFunction("html_google_data_table_chart_script", "HTML-GOOGLE-DATA-TABLE-CHART-SCRIPT", 2, 0, false);
        declareFunction("html_google_scatter_chart", "HTML-GOOGLE-SCATTER-CHART", 1, 0, false);
        declareFunction("html_google_scatter_chart_script", "HTML-GOOGLE-SCATTER-CHART-SCRIPT", 0, 0, false);
        declareFunction("html_google_line_chart", "HTML-GOOGLE-LINE-CHART", 1, 0, false);
        declareFunction("html_google_line_chart_script", "HTML-GOOGLE-LINE-CHART-SCRIPT", 0, 0, false);
        declareFunction("html_google_pie_chart", "HTML-GOOGLE-PIE-CHART", 1, 0, false);
        declareFunction("html_google_pie_chart_script", "HTML-GOOGLE-PIE-CHART-SCRIPT", 0, 0, false);
        declareFunction("html_google_data_table_chart", "HTML-GOOGLE-DATA-TABLE-CHART", 2, 0, false);
        declareFunction("html_output_google_properties", "HTML-OUTPUT-GOOGLE-PROPERTIES", 1, 2, false);
        declareFunction("html_output_google_property", "HTML-OUTPUT-GOOGLE-PROPERTY", 1, 0, false);
        declareFunction("clear_google_property_string", "CLEAR-GOOGLE-PROPERTY-STRING", 0, 0, false);
        declareFunction("remove_google_property_string", "REMOVE-GOOGLE-PROPERTY-STRING", 1, 0, false);
        declareFunction("google_property_string_internal", "GOOGLE-PROPERTY-STRING-INTERNAL", 1, 0, false);
        declareFunction("google_property_string", "GOOGLE-PROPERTY-STRING", 1, 0, false);
        declareFunction("html_output_google_property_value", "HTML-OUTPUT-GOOGLE-PROPERTY-VALUE", 1, 0, false);
        declareFunction("google_plist_prefix_simplify", "GOOGLE-PLIST-PREFIX-SIMPLIFY", 2, 0, false);
        declareFunction("clear_google_property_simplify_wrt_prefix", "CLEAR-GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX", 0, 0, false);
        declareFunction("remove_google_property_simplify_wrt_prefix", "REMOVE-GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX", 2, 0, false);
        declareFunction("google_property_simplify_wrt_prefix_internal", "GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX-INTERNAL", 2, 0, false);
        declareFunction("google_property_simplify_wrt_prefix", "GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX", 2, 0, false);
        declareFunction("inference_answer_timeline_google_chart", "INFERENCE-ANSWER-TIMELINE-GOOGLE-CHART", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_google_charts_file() {
        deflexical("*HTML-GOOGLE-DATA-TABLE-CHART-SCRIPT*", $str9$___function__A_elementID__chartOp);
        deflexical("*GOOGLE-CHART-META-PROPERTIES*", $list16);
        deflexical("*GOOGLE-CHART-PROPERTIES*", $list17);
        deflexical("*GOOGLE-CHART-H-AXIS-PROPERTIES*", $list18);
        deflexical("*GOOGLE-CHART-V-AXIS-PROPERTIES*", $list19);
        deflexical("*GOOGLE-CHART-LEGEND-PROPERTIES*", $list20);
        deflexical("*GOOGLE-DATA-PROPERTIES*", $list21);
        deflexical("*GOOGLE-PROPERTY-STRING-CACHING-STATE*", NIL);
        deflexical("*GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_google_charts_file() {
        memoization_state.note_globally_cached_function(GOOGLE_PROPERTY_STRING);
        memoization_state.note_globally_cached_function(GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_google_charts_file();
    }

    @Override
    public void initializeVariables() {
        init_google_charts_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_google_charts_file();
    }

    static {






































































































    }
}

/**
 * Total time: 190 ms
 */
