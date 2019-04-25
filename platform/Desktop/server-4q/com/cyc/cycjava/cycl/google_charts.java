package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class google_charts extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.google_charts";
    public static final String myFingerPrint = "180962dc9a7733a9217dd3a075733d9b1c0b80bedeeccfa713e10c54205ee009";
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 2638L)
    private static SubLSymbol $html_google_data_table_chart_script$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 6853L)
    private static SubLSymbol $google_chart_meta_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 8136L)
    private static SubLSymbol $google_chart_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 8267L)
    private static SubLSymbol $google_chart_h_axis_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 8437L)
    private static SubLSymbol $google_chart_v_axis_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 8607L)
    private static SubLSymbol $google_chart_legend_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 8742L)
    private static SubLSymbol $google_data_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13285L)
    private static SubLSymbol $google_property_string_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14434L)
    private static SubLSymbol $google_property_simplify_wrt_prefix_caching_state$;
    private static final SubLSymbol $sym0$PROPERTY_LIST_P;
    private static final SubLSymbol $kw1$CHART_TYPE;
    private static final SubLSymbol $kw2$SCATTER_CHART;
    private static final SubLSymbol $kw3$LINE_CHART;
    private static final SubLSymbol $kw4$PIE_CHART;
    private static final SubLString $str5$unsupported_chart_type___S;
    private static final SubLString $str6$http___www_google_com_jsapi;
    private static final SubLString $str7$text_javascript;
    private static final SubLString $str8$__google_load__visualization____1;
    private static final SubLString $str9$___function__A_elementID__chartOp;
    private static final SubLString $str10$drawScatterChart;
    private static final SubLString $str11$ScatterChart;
    private static final SubLString $str12$drawLineChart;
    private static final SubLString $str13$LineChart;
    private static final SubLString $str14$drawPieChart;
    private static final SubLString $str15$PieChart;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$ID;
    private static final SubLSymbol $kw23$WIDTH;
    private static final SubLInteger $int24$600;
    private static final SubLSymbol $kw25$HEIGHT;
    private static final SubLString $str26$chart;
    private static final SubLInteger $int27$1000000;
    private static final SubLString $str28$px;
    private static final SubLString $str29$options_;
    private static final SubLString $str30$columns_;
    private static final SubLString $str31$rows_;
    private static final SubLString $str32$width__;
    private static final SubLString $str33$__height__;
    private static final SubLString $str34$_;
    private static final SubLString $str35$____var__A____;
    private static final SubLString $str36$_______hAxis__;
    private static final SubLSymbol $kw37$H_AXIS;
    private static final SubLString $str38$_______vAxis__;
    private static final SubLSymbol $kw39$V_AXIS;
    private static final SubLString $str40$_______legend__;
    private static final SubLSymbol $kw41$LEGEND;
    private static final SubLString $str42$____;
    private static final SubLString $str43$__;
    private static final SubLSymbol $kw44$DATA_COLUMNS;
    private static final SubLSymbol $kw45$DATA_ROWS;
    private static final SubLString $str46$____var__A_______;
    private static final SubLString $str47$__;
    private static final SubLString $str48$__A_;
    private static final SubLString $str49$__;
    private static final SubLString $str50$____var__A________;
    private static final SubLString $str51$_____;
    private static final SubLString $str52$_;
    private static final SubLString $str53$_;
    private static final SubLString $str54$_____A___A____A___A___A__;
    private static final SubLString $str55$_;
    private static final SubLString $str56$_;
    private static final SubLString $str57$__;
    private static final SubLString $str58$_;
    private static final SubLSymbol $sym59$GOOGLE_PROPERTY_STRING;
    private static final SubLSymbol $sym60$SYMBOLP;
    private static final SubLList $list61;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$STRING_CAPITALIZE;
    private static final SubLSymbol $sym64$_GOOGLE_PROPERTY_STRING_CACHING_STATE_;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX;
    private static final SubLSymbol $sym67$_GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX_CACHING_STATE_;
    private static final SubLInteger $int68$450;
    private static final SubLInteger $int69$1000;
    private static final SubLString $str70$Inference_;
    private static final SubLString $str71$_;
    private static final SubLString $str72$_Answer_Timeline;
    private static final SubLString $str73$milliseconds;
    private static final SubLString $str74$seconds;
    private static final SubLString $str75$Time__;
    private static final SubLString $str76$_;
    private static final SubLString $str77$Answer__;
    private static final SubLSymbol $sym78$LIST;
    private static final SubLSymbol $sym79$_;
    private static final SubLSymbol $sym80$FIRST;
    private static final SubLSymbol $sym81$SECOND;
    private static final SubLSymbol $kw82$TITLE;
    private static final SubLSymbol $kw83$H_AXIS_TITLE;
    private static final SubLSymbol $kw84$H_AXIS_MIN_VALUE;
    private static final SubLSymbol $kw85$H_AXIS_MAX_VALUE;
    private static final SubLSymbol $kw86$V_AXIS_TITLE;
    private static final SubLSymbol $kw87$V_AXIS_MIN_VALUE;
    private static final SubLSymbol $kw88$V_AXIS_MAX_VALUE;
    private static final SubLSymbol $kw89$LEGEND_POSITION;
    private static final SubLSymbol $kw90$NONE;
    private static final SubLString $str91$Time__Answer;
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 1182L)
    public static SubLObject html_google_chart(final SubLObject chart_spec) {
        assert google_charts.NIL != list_utilities.property_list_p(chart_spec) : chart_spec;
        final SubLObject pcase_var;
        final SubLObject type = pcase_var = conses_high.getf(chart_spec, (SubLObject)google_charts.$kw1$CHART_TYPE, (SubLObject)google_charts.UNPROVIDED);
        if (pcase_var.eql((SubLObject)google_charts.$kw2$SCATTER_CHART)) {
            return html_google_scatter_chart(chart_spec);
        }
        if (pcase_var.eql((SubLObject)google_charts.$kw3$LINE_CHART)) {
            return html_google_line_chart(chart_spec);
        }
        if (pcase_var.eql((SubLObject)google_charts.$kw4$PIE_CHART)) {
            return html_google_pie_chart(chart_spec);
        }
        return Errors.error((SubLObject)google_charts.$str5$unsupported_chart_type___S, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 1947L)
    public static SubLObject html_google_chart_scripts(final SubLObject types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)google_charts.$str6$http___www_google_com_jsapi);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)google_charts.$str7$text_javascript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)google_charts.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)google_charts.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)google_charts.$str7$text_javascript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)google_charts.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)google_charts.T, thread);
            html_utilities.html_terpri((SubLObject)google_charts.UNPROVIDED);
            html_utilities.html_markup((SubLObject)google_charts.$str8$__google_load__visualization____1);
            html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        SubLObject cdolist_list_var = types;
        SubLObject type = (SubLObject)google_charts.NIL;
        type = cdolist_list_var.first();
        while (google_charts.NIL != cdolist_list_var) {
            final SubLObject pcase_var = type;
            if (pcase_var.eql((SubLObject)google_charts.$kw2$SCATTER_CHART)) {
                html_google_scatter_chart_script();
            }
            else if (pcase_var.eql((SubLObject)google_charts.$kw3$LINE_CHART)) {
                html_google_line_chart_script();
            }
            else if (pcase_var.eql((SubLObject)google_charts.$kw4$PIE_CHART)) {
                html_google_pie_chart_script();
            }
            else {
                Errors.error((SubLObject)google_charts.$str5$unsupported_chart_type___S, type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 3101L)
    public static SubLObject html_google_data_table_chart_script(final SubLObject draw_method, final SubLObject constructor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)google_charts.$str7$text_javascript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)google_charts.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)google_charts.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), google_charts.$html_google_data_table_chart_script$.getGlobalValue(), draw_method, constructor);
            html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)google_charts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 3321L)
    public static SubLObject html_google_scatter_chart(final SubLObject chart_spec) {
        return html_google_data_table_chart(chart_spec, (SubLObject)google_charts.$str10$drawScatterChart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 3737L)
    public static SubLObject html_google_scatter_chart_script() {
        return html_google_data_table_chart_script((SubLObject)google_charts.$str10$drawScatterChart, (SubLObject)google_charts.$str11$ScatterChart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 3871L)
    public static SubLObject html_google_line_chart(final SubLObject chart_spec) {
        return html_google_data_table_chart(chart_spec, (SubLObject)google_charts.$str12$drawLineChart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 4530L)
    public static SubLObject html_google_line_chart_script() {
        return html_google_data_table_chart_script((SubLObject)google_charts.$str12$drawLineChart, (SubLObject)google_charts.$str13$LineChart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 4655L)
    public static SubLObject html_google_pie_chart(final SubLObject chart_spec) {
        return html_google_data_table_chart(chart_spec, (SubLObject)google_charts.$str14$drawPieChart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 6731L)
    public static SubLObject html_google_pie_chart_script() {
        return html_google_data_table_chart_script((SubLObject)google_charts.$str14$drawPieChart, (SubLObject)google_charts.$str15$PieChart);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 8899L)
    public static SubLObject html_google_data_table_chart(final SubLObject chart_spec, final SubLObject draw_method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_properties = list_utilities.plist_restricted_to_indicators(chart_spec, google_charts.$google_chart_meta_properties$.getGlobalValue());
        final SubLObject chart_properties = list_utilities.plist_restricted_to_indicators(chart_spec, google_charts.$google_chart_properties$.getGlobalValue());
        final SubLObject h_axis_properties = list_utilities.plist_restricted_to_indicators(chart_spec, google_charts.$google_chart_h_axis_properties$.getGlobalValue());
        final SubLObject v_axis_properties = list_utilities.plist_restricted_to_indicators(chart_spec, google_charts.$google_chart_v_axis_properties$.getGlobalValue());
        final SubLObject legend_properties = list_utilities.plist_restricted_to_indicators(chart_spec, google_charts.$google_chart_legend_properties$.getGlobalValue());
        final SubLObject data_properties = list_utilities.plist_restricted_to_indicators(chart_spec, google_charts.$google_data_properties$.getGlobalValue());
        final SubLObject current;
        final SubLObject datum = current = meta_properties;
        final SubLObject id_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw22$ID, current);
        SubLObject id = (SubLObject)((google_charts.NIL != id_tail) ? conses_high.cadr(id_tail) : google_charts.NIL);
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw23$WIDTH, current);
        SubLObject width = (SubLObject)((google_charts.NIL != width_tail) ? conses_high.cadr(width_tail) : google_charts.$int24$600);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw25$HEIGHT, current);
        SubLObject height = (SubLObject)((google_charts.NIL != height_tail) ? conses_high.cadr(height_tail) : google_charts.NIL);
        if (google_charts.NIL == id) {
            id = Sequences.cconcatenate((SubLObject)google_charts.$str26$chart, format_nil.format_nil_a_no_copy(random.random((SubLObject)google_charts.$int27$1000000)));
        }
        if (google_charts.NIL == height && width.isInteger()) {
            height = Numbers.round(Numbers.divide(Numbers.multiply((SubLObject)google_charts.THREE_INTEGER, width), (SubLObject)google_charts.FOUR_INTEGER), (SubLObject)google_charts.UNPROVIDED);
        }
        if (height.isInteger()) {
            height = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(height), (SubLObject)google_charts.$str28$px);
        }
        if (width.isInteger()) {
            width = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(width), (SubLObject)google_charts.$str28$px);
        }
        final SubLObject options_var = Sequences.cconcatenate((SubLObject)google_charts.$str29$options_, format_nil.format_nil_a_no_copy(id));
        final SubLObject columns_var = Sequences.cconcatenate((SubLObject)google_charts.$str30$columns_, format_nil.format_nil_a_no_copy(id));
        final SubLObject rows_var = Sequences.cconcatenate((SubLObject)google_charts.$str31$rows_, format_nil.format_nil_a_no_copy(id));
        final SubLObject div_style = Sequences.cconcatenate((SubLObject)google_charts.$str32$width__, new SubLObject[] { format_nil.format_nil_a_no_copy(width), google_charts.$str33$__height__, format_nil.format_nil_a_no_copy(height), google_charts.$str34$_ });
        html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)google_charts.$str7$text_javascript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)google_charts.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)google_charts.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str35$____var__A____, options_var);
            html_output_google_properties(chart_properties, (SubLObject)google_charts.FOUR_INTEGER, (SubLObject)google_charts.NIL);
            if (google_charts.NIL != h_axis_properties) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str36$_______hAxis__);
                html_output_google_properties(google_plist_prefix_simplify(h_axis_properties, (SubLObject)google_charts.$kw37$H_AXIS), (SubLObject)google_charts.NIL, (SubLObject)google_charts.T);
            }
            if (google_charts.NIL != v_axis_properties) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str38$_______vAxis__);
                html_output_google_properties(google_plist_prefix_simplify(v_axis_properties, (SubLObject)google_charts.$kw39$V_AXIS), (SubLObject)google_charts.NIL, (SubLObject)google_charts.T);
            }
            if (google_charts.NIL != legend_properties) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str40$_______legend__);
                html_output_google_properties(google_plist_prefix_simplify(legend_properties, (SubLObject)google_charts.$kw41$LEGEND), (SubLObject)google_charts.NIL, (SubLObject)google_charts.T);
            }
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str42$____);
            html_utilities.html_markup((SubLObject)google_charts.$str43$__);
            final SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = data_properties;
            final SubLObject data_columns_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw44$DATA_COLUMNS, current_$2);
            final SubLObject data_columns = (SubLObject)((google_charts.NIL != data_columns_tail) ? conses_high.cadr(data_columns_tail) : google_charts.NIL);
            final SubLObject data_rows_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw45$DATA_ROWS, current_$2);
            final SubLObject data_rows = (SubLObject)((google_charts.NIL != data_rows_tail) ? conses_high.cadr(data_rows_tail) : google_charts.NIL);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str46$____var__A_______, columns_var);
            SubLObject list_var = (SubLObject)google_charts.NIL;
            SubLObject column = (SubLObject)google_charts.NIL;
            SubLObject index = (SubLObject)google_charts.NIL;
            list_var = data_columns;
            column = list_var.first();
            for (index = (SubLObject)google_charts.ZERO_INTEGER; google_charts.NIL != list_var; list_var = list_var.rest(), column = list_var.first(), index = Numbers.add((SubLObject)google_charts.ONE_INTEGER, index)) {
                if (!index.isZero()) {
                    html_utilities.html_markup((SubLObject)google_charts.$str47$__);
                }
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str48$__A_, column);
            }
            html_utilities.html_markup((SubLObject)google_charts.$str49$__);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str50$____var__A________, rows_var);
            list_var = (SubLObject)google_charts.NIL;
            SubLObject row = (SubLObject)google_charts.NIL;
            SubLObject row_index = (SubLObject)google_charts.NIL;
            list_var = data_rows;
            row = list_var.first();
            for (row_index = (SubLObject)google_charts.ZERO_INTEGER; google_charts.NIL != list_var; list_var = list_var.rest(), row = list_var.first(), row_index = Numbers.add((SubLObject)google_charts.ONE_INTEGER, row_index)) {
                if (!row_index.isZero()) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str51$_____);
                }
                html_utilities.html_markup((SubLObject)google_charts.$str52$_);
                SubLObject list_var_$3 = (SubLObject)google_charts.NIL;
                SubLObject item = (SubLObject)google_charts.NIL;
                SubLObject item_index = (SubLObject)google_charts.NIL;
                list_var_$3 = row;
                item = list_var_$3.first();
                for (item_index = (SubLObject)google_charts.ZERO_INTEGER; google_charts.NIL != list_var_$3; list_var_$3 = list_var_$3.rest(), item = list_var_$3.first(), item_index = Numbers.add((SubLObject)google_charts.ONE_INTEGER, item_index)) {
                    if (!item_index.isZero()) {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str47$__);
                    }
                    if (item.isString()) {
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str48$__A_, item);
                    }
                    else {
                        html_utilities.html_princ(item);
                    }
                }
                html_utilities.html_markup((SubLObject)google_charts.$str53$_);
            }
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str42$____);
            html_utilities.html_markup((SubLObject)google_charts.$str49$__);
            html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (google_charts.NIL != id) {
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
            html_utilities.html_markup(id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        }
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(div_style);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)google_charts.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)google_charts.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_script_type$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_markup((SubLObject)google_charts.$str7$text_javascript);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)google_charts.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)google_charts.UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)google_charts.T, thread);
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str54$_____A___A____A___A___A__, new SubLObject[] { draw_method, id, options_var, columns_var, rows_var });
            html_utilities.html_source_readability_terpri((SubLObject)google_charts.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        return (SubLObject)google_charts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 12396L)
    public static SubLObject html_output_google_properties(final SubLObject plist, SubLObject wrap_betweenP, SubLObject bracesP) {
        if (wrap_betweenP == google_charts.UNPROVIDED) {
            wrap_betweenP = (SubLObject)google_charts.NIL;
        }
        if (bracesP == google_charts.UNPROVIDED) {
            bracesP = (SubLObject)google_charts.NIL;
        }
        SubLObject index = (SubLObject)google_charts.ZERO_INTEGER;
        if (google_charts.NIL != bracesP) {
            html_utilities.html_markup((SubLObject)google_charts.$str55$_);
        }
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        SubLObject i;
        for (remainder = (SubLObject)google_charts.NIL, remainder = plist; google_charts.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            value = conses_high.cadr(remainder);
            if (!index.isZero()) {
                html_utilities.html_markup((SubLObject)google_charts.$str47$__);
            }
            if (google_charts.NIL != wrap_betweenP) {
                html_utilities.html_terpri((SubLObject)google_charts.UNPROVIDED);
                if (wrap_betweenP.isInteger()) {
                    for (i = (SubLObject)google_charts.NIL, i = (SubLObject)google_charts.ZERO_INTEGER; i.numL(wrap_betweenP); i = Numbers.add(i, (SubLObject)google_charts.ONE_INTEGER)) {
                        html_utilities.html_markup((SubLObject)google_charts.$str56$_);
                    }
                }
            }
            html_output_google_property(property);
            html_utilities.html_markup((SubLObject)google_charts.$str57$__);
            html_output_google_property_value(value);
            index = Numbers.add(index, (SubLObject)google_charts.ONE_INTEGER);
        }
        if (google_charts.NIL != bracesP) {
            html_utilities.html_markup((SubLObject)google_charts.$str58$_);
        }
        return (SubLObject)google_charts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13143L)
    public static SubLObject html_output_google_property(final SubLObject property) {
        final SubLObject string = google_property_string(property);
        return html_utilities.html_markup(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13285L)
    public static SubLObject clear_google_property_string() {
        final SubLObject cs = google_charts.$google_property_string_caching_state$.getGlobalValue();
        if (google_charts.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)google_charts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13285L)
    public static SubLObject remove_google_property_string(final SubLObject symbol) {
        return memoization_state.caching_state_remove_function_results_with_args(google_charts.$google_property_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(symbol), (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13285L)
    public static SubLObject google_property_string_internal(final SubLObject symbol) {
        assert google_charts.NIL != Types.symbolp(symbol) : symbol;
        final SubLObject basis = Symbols.symbol_name(symbol);
        final SubLObject raw_strings = string_utilities.split_string(basis, (SubLObject)google_charts.$list61);
        SubLObject current;
        final SubLObject datum = current = raw_strings;
        SubLObject first_string = (SubLObject)google_charts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)google_charts.$list62);
        first_string = current.first();
        SubLObject rest_strings;
        current = (rest_strings = current.rest());
        first_string = Strings.string_downcase(first_string, (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED);
        rest_strings = Mapping.mapcar(Symbols.symbol_function((SubLObject)google_charts.$sym63$STRING_CAPITALIZE), rest_strings);
        return string_utilities.concatenate_strings((SubLObject)ConsesLow.cons(first_string, rest_strings));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13285L)
    public static SubLObject google_property_string(final SubLObject symbol) {
        SubLObject caching_state = google_charts.$google_property_string_caching_state$.getGlobalValue();
        if (google_charts.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)google_charts.$sym59$GOOGLE_PROPERTY_STRING, (SubLObject)google_charts.$sym64$_GOOGLE_PROPERTY_STRING_CACHING_STATE_, (SubLObject)google_charts.NIL, (SubLObject)google_charts.EQL, (SubLObject)google_charts.ONE_INTEGER, (SubLObject)google_charts.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, symbol, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(google_property_string_internal(symbol)));
            memoization_state.caching_state_put(caching_state, symbol, results, (SubLObject)google_charts.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 13734L)
    public static SubLObject html_output_google_property_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (value.isString()) {
            return PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)google_charts.$str48$__A_, value);
        }
        if (value.isKeyword()) {
            final SubLObject string = google_property_string(value);
            return html_output_google_property_value(string);
        }
        return html_utilities.html_princ(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14070L)
    public static SubLObject google_plist_prefix_simplify(final SubLObject plist, final SubLObject prefix_symbol) {
        final SubLObject alist = list_utilities.plist_to_alist(plist);
        SubLObject simpler_alist = (SubLObject)google_charts.NIL;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)google_charts.NIL;
        cons = cdolist_list_var.first();
        while (google_charts.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject property = (SubLObject)google_charts.NIL;
            SubLObject value = (SubLObject)google_charts.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)google_charts.$list65);
            property = current.first();
            current = (value = current.rest());
            final SubLObject simplier_prop = google_property_simplify_wrt_prefix(property, prefix_symbol);
            simpler_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(simplier_prop, value), simpler_alist);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return list_utilities.alist_to_plist(Sequences.nreverse(simpler_alist));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14434L)
    public static SubLObject clear_google_property_simplify_wrt_prefix() {
        final SubLObject cs = google_charts.$google_property_simplify_wrt_prefix_caching_state$.getGlobalValue();
        if (google_charts.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)google_charts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14434L)
    public static SubLObject remove_google_property_simplify_wrt_prefix(final SubLObject property, final SubLObject prefix_symbol) {
        return memoization_state.caching_state_remove_function_results_with_args(google_charts.$google_property_simplify_wrt_prefix_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(property, prefix_symbol), (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14434L)
    public static SubLObject google_property_simplify_wrt_prefix_internal(final SubLObject property, final SubLObject prefix_symbol) {
        final SubLObject big_name = Symbols.symbol_name(property);
        final SubLObject prefix = Symbols.symbol_name(prefix_symbol);
        final SubLObject prefix_start = Sequences.search(prefix, big_name, (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED, (SubLObject)google_charts.UNPROVIDED);
        if (google_charts.ZERO_INTEGER.eql(prefix_start)) {
            final SubLObject suffix_start = number_utilities.f_1X(Sequences.length(prefix));
            final SubLObject simpler_name = string_utilities.substring(big_name, suffix_start, (SubLObject)google_charts.UNPROVIDED);
            return Packages.intern(simpler_name, control_vars.$keyword_package$.getGlobalValue());
        }
        return property;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14434L)
    public static SubLObject google_property_simplify_wrt_prefix(final SubLObject property, final SubLObject prefix_symbol) {
        SubLObject caching_state = google_charts.$google_property_simplify_wrt_prefix_caching_state$.getGlobalValue();
        if (google_charts.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)google_charts.$sym66$GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX, (SubLObject)google_charts.$sym67$_GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX_CACHING_STATE_, (SubLObject)google_charts.NIL, (SubLObject)google_charts.EQL, (SubLObject)google_charts.TWO_INTEGER, (SubLObject)google_charts.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(property, prefix_symbol);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)google_charts.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)google_charts.NIL;
            collision = cdolist_list_var.first();
            while (google_charts.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (property.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (google_charts.NIL != cached_args && google_charts.NIL == cached_args.rest() && prefix_symbol.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(google_property_simplify_wrt_prefix_internal(property, prefix_symbol)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(property, prefix_symbol));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/google-charts.lisp", position = 14865L)
    public static SubLObject inference_answer_timeline_google_chart(final SubLObject inference, SubLObject chart_properties) {
        if (chart_properties == google_charts.UNPROVIDED) {
            chart_properties = (SubLObject)google_charts.NIL;
        }
        final SubLObject current;
        final SubLObject datum = current = chart_properties;
        final SubLObject width_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw23$WIDTH, current);
        final SubLObject width = (SubLObject)((google_charts.NIL != width_tail) ? conses_high.cadr(width_tail) : google_charts.$int24$600);
        final SubLObject height_tail = cdestructuring_bind.property_list_member((SubLObject)google_charts.$kw25$HEIGHT, current);
        final SubLObject height = (SubLObject)((google_charts.NIL != height_tail) ? conses_high.cadr(height_tail) : google_charts.$int68$450);
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        SubLObject tuples = cb_query.inference_answer_tuples_for_chart(inference);
        final SubLObject last_tuple = list_utilities.last_one(tuples);
        final SubLObject last_raw_time = last_tuple.first();
        final SubLObject last_raw_answer = conses_high.second(last_tuple);
        final SubLObject use_millisecondsP = Numbers.numLE(last_raw_time, (SubLObject)google_charts.ONE_INTEGER);
        final SubLObject last_time = Numbers.multiply((SubLObject)((google_charts.NIL != use_millisecondsP) ? google_charts.$int69$1000 : google_charts.ONE_INTEGER), number_utilities.significant_digits(last_raw_time, (SubLObject)google_charts.THREE_INTEGER));
        final SubLObject last_answer = Numbers.max((SubLObject)google_charts.TWO_INTEGER, last_raw_answer);
        final SubLObject title = Sequences.cconcatenate((SubLObject)google_charts.$str70$Inference_, new SubLObject[] { format_nil.format_nil_a_no_copy(store_suid), google_charts.$str71$_, format_nil.format_nil_a_no_copy(inference_suid), google_charts.$str72$_Answer_Timeline });
        final SubLObject h_axis_units = (SubLObject)((google_charts.NIL != use_millisecondsP) ? google_charts.$str73$milliseconds : google_charts.$str74$seconds);
        final SubLObject h_axis_title = Sequences.cconcatenate((SubLObject)google_charts.$str75$Time__, new SubLObject[] { format_nil.format_nil_a_no_copy(h_axis_units), google_charts.$str76$_ });
        final SubLObject v_axis_title = (SubLObject)google_charts.$str77$Answer__;
        if (google_charts.NIL != use_millisecondsP) {
            tuples = Mapping.mapcar(Symbols.symbol_function((SubLObject)google_charts.$sym78$LIST), Mapping.mapcar(Symbols.symbol_function((SubLObject)google_charts.$sym79$_), Mapping.mapcar(Symbols.symbol_function((SubLObject)google_charts.$sym80$FIRST), tuples), new SubLObject[] { ConsesLow.make_list(Sequences.length(tuples), (SubLObject)google_charts.$int69$1000) }), new SubLObject[] { Mapping.mapcar(Symbols.symbol_function((SubLObject)google_charts.$sym81$SECOND), tuples) });
        }
        return (SubLObject)ConsesLow.list(new SubLObject[] { google_charts.$kw1$CHART_TYPE, google_charts.$kw2$SCATTER_CHART, google_charts.$kw82$TITLE, title, google_charts.$kw23$WIDTH, width, google_charts.$kw25$HEIGHT, height, google_charts.$kw83$H_AXIS_TITLE, h_axis_title, google_charts.$kw84$H_AXIS_MIN_VALUE, google_charts.ZERO_INTEGER, google_charts.$kw85$H_AXIS_MAX_VALUE, last_time, google_charts.$kw86$V_AXIS_TITLE, v_axis_title, google_charts.$kw87$V_AXIS_MIN_VALUE, google_charts.ZERO_INTEGER, google_charts.$kw88$V_AXIS_MAX_VALUE, last_answer, google_charts.$kw89$LEGEND_POSITION, google_charts.$kw90$NONE, google_charts.$kw44$DATA_COLUMNS, ConsesLow.list(h_axis_title, (SubLObject)google_charts.$str91$Time__Answer), google_charts.$kw45$DATA_ROWS, tuples });
    }
    
    public static SubLObject declare_google_charts_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_chart", "HTML-GOOGLE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_chart_scripts", "HTML-GOOGLE-CHART-SCRIPTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_data_table_chart_script", "HTML-GOOGLE-DATA-TABLE-CHART-SCRIPT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_scatter_chart", "HTML-GOOGLE-SCATTER-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_scatter_chart_script", "HTML-GOOGLE-SCATTER-CHART-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_line_chart", "HTML-GOOGLE-LINE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_line_chart_script", "HTML-GOOGLE-LINE-CHART-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_pie_chart", "HTML-GOOGLE-PIE-CHART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_pie_chart_script", "HTML-GOOGLE-PIE-CHART-SCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_google_data_table_chart", "HTML-GOOGLE-DATA-TABLE-CHART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_output_google_properties", "HTML-OUTPUT-GOOGLE-PROPERTIES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_output_google_property", "HTML-OUTPUT-GOOGLE-PROPERTY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "clear_google_property_string", "CLEAR-GOOGLE-PROPERTY-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "remove_google_property_string", "REMOVE-GOOGLE-PROPERTY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "google_property_string_internal", "GOOGLE-PROPERTY-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "google_property_string", "GOOGLE-PROPERTY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "html_output_google_property_value", "HTML-OUTPUT-GOOGLE-PROPERTY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "google_plist_prefix_simplify", "GOOGLE-PLIST-PREFIX-SIMPLIFY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "clear_google_property_simplify_wrt_prefix", "CLEAR-GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "remove_google_property_simplify_wrt_prefix", "REMOVE-GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "google_property_simplify_wrt_prefix_internal", "GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "google_property_simplify_wrt_prefix", "GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.google_charts", "inference_answer_timeline_google_chart", "INFERENCE-ANSWER-TIMELINE-GOOGLE-CHART", 1, 1, false);
        return (SubLObject)google_charts.NIL;
    }
    
    public static SubLObject init_google_charts_file() {
        google_charts.$html_google_data_table_chart_script$ = SubLFiles.deflexical("*HTML-GOOGLE-DATA-TABLE-CHART-SCRIPT*", (SubLObject)google_charts.$str9$___function__A_elementID__chartOp);
        google_charts.$google_chart_meta_properties$ = SubLFiles.deflexical("*GOOGLE-CHART-META-PROPERTIES*", (SubLObject)google_charts.$list16);
        google_charts.$google_chart_properties$ = SubLFiles.deflexical("*GOOGLE-CHART-PROPERTIES*", (SubLObject)google_charts.$list17);
        google_charts.$google_chart_h_axis_properties$ = SubLFiles.deflexical("*GOOGLE-CHART-H-AXIS-PROPERTIES*", (SubLObject)google_charts.$list18);
        google_charts.$google_chart_v_axis_properties$ = SubLFiles.deflexical("*GOOGLE-CHART-V-AXIS-PROPERTIES*", (SubLObject)google_charts.$list19);
        google_charts.$google_chart_legend_properties$ = SubLFiles.deflexical("*GOOGLE-CHART-LEGEND-PROPERTIES*", (SubLObject)google_charts.$list20);
        google_charts.$google_data_properties$ = SubLFiles.deflexical("*GOOGLE-DATA-PROPERTIES*", (SubLObject)google_charts.$list21);
        google_charts.$google_property_string_caching_state$ = SubLFiles.deflexical("*GOOGLE-PROPERTY-STRING-CACHING-STATE*", (SubLObject)google_charts.NIL);
        google_charts.$google_property_simplify_wrt_prefix_caching_state$ = SubLFiles.deflexical("*GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX-CACHING-STATE*", (SubLObject)google_charts.NIL);
        return (SubLObject)google_charts.NIL;
    }
    
    public static SubLObject setup_google_charts_file() {
        memoization_state.note_globally_cached_function((SubLObject)google_charts.$sym59$GOOGLE_PROPERTY_STRING);
        memoization_state.note_globally_cached_function((SubLObject)google_charts.$sym66$GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX);
        return (SubLObject)google_charts.NIL;
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
        me = (SubLFile)new google_charts();
        google_charts.$html_google_data_table_chart_script$ = null;
        google_charts.$google_chart_meta_properties$ = null;
        google_charts.$google_chart_properties$ = null;
        google_charts.$google_chart_h_axis_properties$ = null;
        google_charts.$google_chart_v_axis_properties$ = null;
        google_charts.$google_chart_legend_properties$ = null;
        google_charts.$google_data_properties$ = null;
        google_charts.$google_property_string_caching_state$ = null;
        google_charts.$google_property_simplify_wrt_prefix_caching_state$ = null;
        $sym0$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw1$CHART_TYPE = SubLObjectFactory.makeKeyword("CHART-TYPE");
        $kw2$SCATTER_CHART = SubLObjectFactory.makeKeyword("SCATTER-CHART");
        $kw3$LINE_CHART = SubLObjectFactory.makeKeyword("LINE-CHART");
        $kw4$PIE_CHART = SubLObjectFactory.makeKeyword("PIE-CHART");
        $str5$unsupported_chart_type___S = SubLObjectFactory.makeString("unsupported chart type: ~S");
        $str6$http___www_google_com_jsapi = SubLObjectFactory.makeString("http://www.google.com/jsapi");
        $str7$text_javascript = SubLObjectFactory.makeString("text/javascript");
        $str8$__google_load__visualization____1 = SubLObjectFactory.makeString("  google.load('visualization', '1', {packages: ['corechart']});");
        $str9$___function__A_elementID__chartOp = SubLObjectFactory.makeString("\n  function ~A(elementID, chartOptions, dataColumns, dataRows) {\n    var docElement   = document.getElementById(elementID);\n    var dataQuaArray = dataRows;\n    dataQuaArray.unshift(dataColumns);\n    var dataTable = google.visualization.arrayToDataTable(dataQuaArray);\n    var chartObject = new google.visualization.~A(docElement);\n    chartObject.draw(dataTable, chartOptions);\n  }");
        $str10$drawScatterChart = SubLObjectFactory.makeString("drawScatterChart");
        $str11$ScatterChart = SubLObjectFactory.makeString("ScatterChart");
        $str12$drawLineChart = SubLObjectFactory.makeString("drawLineChart");
        $str13$LineChart = SubLObjectFactory.makeString("LineChart");
        $str14$drawPieChart = SubLObjectFactory.makeString("drawPieChart");
        $str15$PieChart = SubLObjectFactory.makeString("PieChart");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("WIDTH"), (SubLObject)SubLObjectFactory.makeKeyword("HEIGHT"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("CURVE-TYPE"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("H-AXIS-TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("H-AXIS-MIN-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("H-AXIS-MAX-VALUE"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("V-AXIS-TITLE"), (SubLObject)SubLObjectFactory.makeKeyword("V-AXIS-MIN-VALUE"), (SubLObject)SubLObjectFactory.makeKeyword("V-AXIS-MAX-VALUE"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEGEND-POSITION"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DATA-COLUMNS"), (SubLObject)SubLObjectFactory.makeKeyword("DATA-ROWS"));
        $kw22$ID = SubLObjectFactory.makeKeyword("ID");
        $kw23$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $int24$600 = SubLObjectFactory.makeInteger(600);
        $kw25$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $str26$chart = SubLObjectFactory.makeString("chart");
        $int27$1000000 = SubLObjectFactory.makeInteger(1000000);
        $str28$px = SubLObjectFactory.makeString("px");
        $str29$options_ = SubLObjectFactory.makeString("options_");
        $str30$columns_ = SubLObjectFactory.makeString("columns_");
        $str31$rows_ = SubLObjectFactory.makeString("rows_");
        $str32$width__ = SubLObjectFactory.makeString("width: ");
        $str33$__height__ = SubLObjectFactory.makeString("; height: ");
        $str34$_ = SubLObjectFactory.makeString(";");
        $str35$____var__A____ = SubLObjectFactory.makeString("~%  var ~A = {");
        $str36$_______hAxis__ = SubLObjectFactory.makeString(",~%    hAxis: ");
        $kw37$H_AXIS = SubLObjectFactory.makeKeyword("H-AXIS");
        $str38$_______vAxis__ = SubLObjectFactory.makeString(",~%    vAxis: ");
        $kw39$V_AXIS = SubLObjectFactory.makeKeyword("V-AXIS");
        $str40$_______legend__ = SubLObjectFactory.makeString(",~%    legend: ");
        $kw41$LEGEND = SubLObjectFactory.makeKeyword("LEGEND");
        $str42$____ = SubLObjectFactory.makeString("~%  ");
        $str43$__ = SubLObjectFactory.makeString("};");
        $kw44$DATA_COLUMNS = SubLObjectFactory.makeKeyword("DATA-COLUMNS");
        $kw45$DATA_ROWS = SubLObjectFactory.makeKeyword("DATA-ROWS");
        $str46$____var__A_______ = SubLObjectFactory.makeString("~%  var ~A =~%  [");
        $str47$__ = SubLObjectFactory.makeString(", ");
        $str48$__A_ = SubLObjectFactory.makeString("'~A'");
        $str49$__ = SubLObjectFactory.makeString("];");
        $str50$____var__A________ = SubLObjectFactory.makeString("~%  var ~A = [~%  ");
        $str51$_____ = SubLObjectFactory.makeString(",~%  ");
        $str52$_ = SubLObjectFactory.makeString("[");
        $str53$_ = SubLObjectFactory.makeString("]");
        $str54$_____A___A____A___A___A__ = SubLObjectFactory.makeString("~%  ~A('~A', ~A, ~A, ~A);");
        $str55$_ = SubLObjectFactory.makeString("{");
        $str56$_ = SubLObjectFactory.makeString(" ");
        $str57$__ = SubLObjectFactory.makeString(": ");
        $str58$_ = SubLObjectFactory.makeString("}");
        $sym59$GOOGLE_PROPERTY_STRING = SubLObjectFactory.makeSymbol("GOOGLE-PROPERTY-STRING");
        $sym60$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $list61 = ConsesLow.list((SubLObject)Characters.CHAR_hyphen);
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST-STRINGS"));
        $sym63$STRING_CAPITALIZE = SubLObjectFactory.makeSymbol("STRING-CAPITALIZE");
        $sym64$_GOOGLE_PROPERTY_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GOOGLE-PROPERTY-STRING-CACHING-STATE*");
        $list65 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym66$GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX = SubLObjectFactory.makeSymbol("GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX");
        $sym67$_GOOGLE_PROPERTY_SIMPLIFY_WRT_PREFIX_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GOOGLE-PROPERTY-SIMPLIFY-WRT-PREFIX-CACHING-STATE*");
        $int68$450 = SubLObjectFactory.makeInteger(450);
        $int69$1000 = SubLObjectFactory.makeInteger(1000);
        $str70$Inference_ = SubLObjectFactory.makeString("Inference ");
        $str71$_ = SubLObjectFactory.makeString(".");
        $str72$_Answer_Timeline = SubLObjectFactory.makeString(" Answer Timeline");
        $str73$milliseconds = SubLObjectFactory.makeString("milliseconds");
        $str74$seconds = SubLObjectFactory.makeString("seconds");
        $str75$Time__ = SubLObjectFactory.makeString("Time (");
        $str76$_ = SubLObjectFactory.makeString(")");
        $str77$Answer__ = SubLObjectFactory.makeString("Answer #");
        $sym78$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym79$_ = SubLObjectFactory.makeSymbol("*");
        $sym80$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym81$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $kw82$TITLE = SubLObjectFactory.makeKeyword("TITLE");
        $kw83$H_AXIS_TITLE = SubLObjectFactory.makeKeyword("H-AXIS-TITLE");
        $kw84$H_AXIS_MIN_VALUE = SubLObjectFactory.makeKeyword("H-AXIS-MIN-VALUE");
        $kw85$H_AXIS_MAX_VALUE = SubLObjectFactory.makeKeyword("H-AXIS-MAX-VALUE");
        $kw86$V_AXIS_TITLE = SubLObjectFactory.makeKeyword("V-AXIS-TITLE");
        $kw87$V_AXIS_MIN_VALUE = SubLObjectFactory.makeKeyword("V-AXIS-MIN-VALUE");
        $kw88$V_AXIS_MAX_VALUE = SubLObjectFactory.makeKeyword("V-AXIS-MAX-VALUE");
        $kw89$LEGEND_POSITION = SubLObjectFactory.makeKeyword("LEGEND-POSITION");
        $kw90$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str91$Time__Answer = SubLObjectFactory.makeString("Time, Answer");
    }
}

/*

	Total time: 190 ms
	
*/