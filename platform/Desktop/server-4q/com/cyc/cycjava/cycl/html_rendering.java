package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_rendering extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_rendering";
    public static final String myFingerPrint = "bb4b114cf67aabfdf4481bfd6b4f91b833526b4b36d465ef65b933d006315c74";
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 1852L)
    public static SubLSymbol $html_node_rendering_function$;
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 2243L)
    public static SubLSymbol $html_node_rendering_background_colormap$;
    private static final SubLSymbol $sym0$HTML_CATEGORIZE_GRAPH_RENDER_NODE;
    private static final SubLSymbol $kw1$NAKED;
    private static final SubLSymbol $kw2$ISOLATED;
    private static final SubLSymbol $kw3$CONNECTED;
    private static final SubLSymbol $kw4$ALL_CONNECTED;
    private static final SubLSymbol $kw5$COLORMAP;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw9$RENDERFN;
    private static final SubLSymbol $sym10$FUNCTION;
    private static final SubLSymbol $sym11$COLORS;
    private static final SubLSymbol $sym12$CLET;
    private static final SubLSymbol $sym13$FIF;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$_HTML_NODE_RENDERING_FUNCTION_;
    private static final SubLSymbol $sym17$_HTML_NODE_RENDERING_BACKGROUND_COLORMAP_;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$CENTER;
    private static final SubLString $str21$Color_Key;
    private static final SubLString $str22$Naked_terms_;
    private static final SubLString $str23$Isolated_terms_;
    private static final SubLString $str24$Connected_terms_;
    private static final SubLString $str25$All_connected_;
    private static final SubLString $str26$_;
    private static final SubLString $str27$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 1015L)
    public static SubLObject html_categorize_nodes_via_links(final SubLObject nodes, final SubLObject links, SubLObject test) {
        if (test == html_rendering.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)html_rendering.EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(nodes, links, test);
        final SubLObject isolated_groups = thread.secondMultipleValue();
        final SubLObject naked_groups = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        html_render_link_categorized_nodes(connected_groups, isolated_groups, naked_groups);
        html_utilities.html_newline((SubLObject)html_rendering.UNPROVIDED);
        html_display_node_rendering_colormap();
        return (SubLObject)html_rendering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 1949L)
    public static SubLObject construct_html_node_rendering_colormap_helper(final SubLObject naked, final SubLObject isolated, final SubLObject connected, final SubLObject all_connected, final SubLObject colormap) {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw1$NAKED, naked), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw2$ISOLATED, isolated), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw3$CONNECTED, connected), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw4$ALL_CONNECTED, all_connected), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw5$COLORMAP, colormap));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 2552L)
    public static SubLObject html_render_link_categorized_nodes_my_way(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)html_rendering.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_rendering.NIL;
        SubLObject current_$1 = (SubLObject)html_rendering.NIL;
        while (html_rendering.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_rendering.$list6);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_rendering.$list6);
            if (html_rendering.NIL == conses_high.member(current_$1, (SubLObject)html_rendering.$list7, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED)) {
                bad = (SubLObject)html_rendering.T;
            }
            if (current_$1 == html_rendering.$kw8$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_rendering.NIL != bad && html_rendering.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_rendering.$list6);
        }
        final SubLObject renderfn_tail = cdestructuring_bind.property_list_member((SubLObject)html_rendering.$kw9$RENDERFN, current);
        final SubLObject renderfn = (SubLObject)((html_rendering.NIL != renderfn_tail) ? conses_high.cadr(renderfn_tail) : html_rendering.NIL);
        final SubLObject colormap_tail = cdestructuring_bind.property_list_member((SubLObject)html_rendering.$kw5$COLORMAP, current);
        final SubLObject colormap = (SubLObject)((html_rendering.NIL != colormap_tail) ? conses_high.cadr(colormap_tail) : html_rendering.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject function = (SubLObject)html_rendering.$sym10$FUNCTION;
        final SubLObject colors = (SubLObject)html_rendering.$sym11$COLORS;
        return (SubLObject)ConsesLow.listS((SubLObject)html_rendering.$sym12$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(function, (SubLObject)ConsesLow.listS((SubLObject)html_rendering.$sym13$FIF, renderfn, renderfn, (SubLObject)html_rendering.$list14)), (SubLObject)ConsesLow.list(colors, (SubLObject)ConsesLow.listS((SubLObject)html_rendering.$sym13$FIF, colormap, colormap, (SubLObject)html_rendering.$list15)), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$sym16$_HTML_NODE_RENDERING_FUNCTION_, function), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$sym17$_HTML_NODE_RENDERING_BACKGROUND_COLORMAP_, colors)), ConsesLow.append(body, (SubLObject)html_rendering.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 3091L)
    public static SubLObject html_render_link_categorized_nodes(final SubLObject connected_groups, final SubLObject isolated_groups, final SubLObject naked_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject render_function = html_rendering.$html_node_rendering_function$.getDynamicValue(thread);
        final SubLObject backgrounds = html_rendering.$html_node_rendering_background_colormap$.getDynamicValue(thread);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_rendering.ONE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_rendering.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_rendering.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
            if (html_rendering.NIL != naked_groups) {
                final SubLObject bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw1$NAKED, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (html_rendering.NIL != bgcolor) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(bgcolor);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                        SubLObject cdolist_list_var = naked_groups;
                        SubLObject island_group = (SubLObject)html_rendering.NIL;
                        island_group = cdolist_list_var.first();
                        while (html_rendering.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = island_group;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list18);
                            final SubLObject temp = current.rest();
                            current = current.first();
                            SubLObject node = (SubLObject)html_rendering.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list18);
                            node = current.first();
                            current = current.rest();
                            if (html_rendering.NIL == current) {
                                current = temp;
                                SubLObject links = (SubLObject)html_rendering.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list18);
                                links = current.first();
                                current = current.rest();
                                if (html_rendering.NIL == current) {
                                    Functions.funcall(render_function, node);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_rendering.$list18);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_rendering.$list18);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            island_group = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
            }
            if (html_rendering.NIL != isolated_groups) {
                final SubLObject bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw2$ISOLATED, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (html_rendering.NIL != bgcolor) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(bgcolor);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                        SubLObject cdolist_list_var = isolated_groups;
                        SubLObject island_group = (SubLObject)html_rendering.NIL;
                        island_group = cdolist_list_var.first();
                        while (html_rendering.NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = island_group;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list18);
                            final SubLObject temp = current.rest();
                            current = current.first();
                            SubLObject node = (SubLObject)html_rendering.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list18);
                            node = current.first();
                            current = current.rest();
                            if (html_rendering.NIL == current) {
                                current = temp;
                                SubLObject links = (SubLObject)html_rendering.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_rendering.$list18);
                                links = current.first();
                                current = current.rest();
                                if (html_rendering.NIL == current) {
                                    Functions.funcall(render_function, node);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_rendering.$list18);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_rendering.$list18);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            island_group = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
            }
            if (html_rendering.NIL != connected_groups) {
                final SubLObject bgcolor_type = (SubLObject)((html_rendering.NIL == naked_groups && html_rendering.NIL == isolated_groups && html_rendering.NIL != list_utilities.singletonP(connected_groups)) ? html_rendering.$kw4$ALL_CONNECTED : html_rendering.$kw3$CONNECTED);
                final SubLObject bgcolor2 = conses_high.second(conses_high.assoc(bgcolor_type, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (html_rendering.NIL != bgcolor2) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(bgcolor2);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_rendering.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)html_rendering.ZERO_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                            SubLObject cdolist_list_var2 = connected_groups;
                            SubLObject island_group2 = (SubLObject)html_rendering.NIL;
                            island_group2 = cdolist_list_var2.first();
                            while (html_rendering.NIL != cdolist_list_var2) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                        SubLObject current2;
                                        final SubLObject datum2 = current2 = island_group2;
                                        SubLObject nodes = (SubLObject)html_rendering.NIL;
                                        SubLObject links2 = (SubLObject)html_rendering.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)html_rendering.$list19);
                                        nodes = current2.first();
                                        current2 = current2.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)html_rendering.$list19);
                                        links2 = current2.first();
                                        current2 = current2.rest();
                                        if (html_rendering.NIL == current2) {
                                            SubLObject cdolist_list_var_$11 = nodes;
                                            SubLObject node2 = (SubLObject)html_rendering.NIL;
                                            node2 = cdolist_list_var_$11.first();
                                            while (html_rendering.NIL != cdolist_list_var_$11) {
                                                Functions.funcall(render_function, node2);
                                                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                                node2 = cdolist_list_var_$11.first();
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)html_rendering.$list19);
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                island_group2 = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)html_rendering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 5139L)
    public static SubLObject html_display_node_rendering_colormap() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backgrounds = html_rendering.$html_node_rendering_background_colormap$.getDynamicValue(thread);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_rendering.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                SubLObject bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw5$COLORMAP, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (html_rendering.NIL != bgcolor) {
                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                    html_utilities.html_markup(bgcolor);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)html_rendering.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align((SubLObject)html_rendering.$kw20$CENTER));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                html_utilities.html_princ((SubLObject)html_rendering.$str21$Color_Key);
                                html_utilities.html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                            bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw1$NAKED, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (html_rendering.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_rendering.MINUS_ONE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                    html_utilities.html_princ((SubLObject)html_rendering.$str22$Naked_terms_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                            bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw2$ISOLATED, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (html_rendering.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_rendering.MINUS_ONE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                    html_utilities.html_princ((SubLObject)html_rendering.$str23$Isolated_terms_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                            bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw3$CONNECTED, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (html_rendering.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_rendering.MINUS_ONE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                    html_utilities.html_princ((SubLObject)html_rendering.$str24$Connected_terms_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                            bgcolor = conses_high.second(conses_high.assoc((SubLObject)html_rendering.$kw4$ALL_CONNECTED, backgrounds, (SubLObject)html_rendering.UNPROVIDED, (SubLObject)html_rendering.UNPROVIDED));
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (html_rendering.NIL != bgcolor) {
                                html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup(bgcolor);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)html_rendering.MINUS_ONE_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_rendering.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_rendering.UNPROVIDED);
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)html_rendering.T, thread);
                                    html_utilities.html_princ((SubLObject)html_rendering.$str25$All_connected_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)html_rendering.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)html_rendering.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-rendering.lisp", position = 6655L)
    public static SubLObject html_categorize_graph_render_node(final SubLObject node) {
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)html_rendering.$str26$_);
        html_utilities.html_princ(node);
        html_utilities.html_princ((SubLObject)html_rendering.$str27$_);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)html_rendering.NIL;
    }
    
    public static SubLObject declare_html_rendering_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_rendering", "html_categorize_nodes_via_links", "HTML-CATEGORIZE-NODES-VIA-LINKS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_rendering", "construct_html_node_rendering_colormap_helper", "CONSTRUCT-HTML-NODE-RENDERING-COLORMAP-HELPER", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_rendering", "html_render_link_categorized_nodes_my_way", "HTML-RENDER-LINK-CATEGORIZED-NODES-MY-WAY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_rendering", "html_render_link_categorized_nodes", "HTML-RENDER-LINK-CATEGORIZED-NODES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_rendering", "html_display_node_rendering_colormap", "HTML-DISPLAY-NODE-RENDERING-COLORMAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_rendering", "html_categorize_graph_render_node", "HTML-CATEGORIZE-GRAPH-RENDER-NODE", 1, 0, false);
        return (SubLObject)html_rendering.NIL;
    }
    
    public static SubLObject init_html_rendering_file() {
        html_rendering.$html_node_rendering_function$ = SubLFiles.defparameter("*HTML-NODE-RENDERING-FUNCTION*", (SubLObject)html_rendering.$sym0$HTML_CATEGORIZE_GRAPH_RENDER_NODE);
        html_rendering.$html_node_rendering_background_colormap$ = SubLFiles.defparameter("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw1$NAKED, html_macros.$html_color_sat_red$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw2$ISOLATED, html_macros.$html_color_sat_yellow$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw3$CONNECTED, html_macros.$html_color_sat_green$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw4$ALL_CONNECTED, html_macros.$html_color_white$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)html_rendering.$kw5$COLORMAP, html_macros.$html_color_lighter_grey$.getGlobalValue())));
        return (SubLObject)html_rendering.NIL;
    }
    
    public static SubLObject setup_html_rendering_file() {
        return (SubLObject)html_rendering.NIL;
    }
    
    public void declareFunctions() {
        declare_html_rendering_file();
    }
    
    public void initializeVariables() {
        init_html_rendering_file();
    }
    
    public void runTopLevelForms() {
        setup_html_rendering_file();
    }
    
    static {
        me = (SubLFile)new html_rendering();
        html_rendering.$html_node_rendering_function$ = null;
        html_rendering.$html_node_rendering_background_colormap$ = null;
        $sym0$HTML_CATEGORIZE_GRAPH_RENDER_NODE = SubLObjectFactory.makeSymbol("HTML-CATEGORIZE-GRAPH-RENDER-NODE");
        $kw1$NAKED = SubLObjectFactory.makeKeyword("NAKED");
        $kw2$ISOLATED = SubLObjectFactory.makeKeyword("ISOLATED");
        $kw3$CONNECTED = SubLObjectFactory.makeKeyword("CONNECTED");
        $kw4$ALL_CONNECTED = SubLObjectFactory.makeKeyword("ALL-CONNECTED");
        $kw5$COLORMAP = SubLObjectFactory.makeKeyword("COLORMAP");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("RENDERFN"), (SubLObject)SubLObjectFactory.makeSymbol("COLORMAP")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RENDERFN"), (SubLObject)SubLObjectFactory.makeKeyword("COLORMAP"));
        $kw8$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw9$RENDERFN = SubLObjectFactory.makeKeyword("RENDERFN");
        $sym10$FUNCTION = SubLObjectFactory.makeUninternedSymbol("FUNCTION");
        $sym11$COLORS = SubLObjectFactory.makeUninternedSymbol("COLORS");
        $sym12$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym13$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-NODE-RENDERING-FUNCTION*"));
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*"));
        $sym16$_HTML_NODE_RENDERING_FUNCTION_ = SubLObjectFactory.makeSymbol("*HTML-NODE-RENDERING-FUNCTION*");
        $sym17$_HTML_NODE_RENDERING_BACKGROUND_COLORMAP_ = SubLObjectFactory.makeSymbol("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE")), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODES"), (SubLObject)SubLObjectFactory.makeSymbol("LINKS"));
        $kw20$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str21$Color_Key = SubLObjectFactory.makeString("Color Key");
        $str22$Naked_terms_ = SubLObjectFactory.makeString("Naked terms.");
        $str23$Isolated_terms_ = SubLObjectFactory.makeString("Isolated terms.");
        $str24$Connected_terms_ = SubLObjectFactory.makeString("Connected terms.");
        $str25$All_connected_ = SubLObjectFactory.makeString("All connected.");
        $str26$_ = SubLObjectFactory.makeString("[");
        $str27$_ = SubLObjectFactory.makeString("]");
    }
}

/*

	Total time: 385 ms
	
*/