/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
 * module:      HTML-RENDERING
 * source file: /cyc/top/cycl/html-rendering.lisp
 * created:     2019/07/03 17:38:02
 */
public final class html_rendering extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new html_rendering();



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol HTML_CATEGORIZE_GRAPH_RENDER_NODE = makeSymbol("HTML-CATEGORIZE-GRAPH-RENDER-NODE");

    static private final SubLList $list6 = list(list(makeSymbol("&KEY"), makeSymbol("RENDERFN"), makeSymbol("COLORMAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list7 = list(makeKeyword("RENDERFN"), makeKeyword("COLORMAP"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym10$FUNCTION = makeUninternedSymbol("FUNCTION");

    static private final SubLSymbol $sym11$COLORS = makeUninternedSymbol("COLORS");

    static private final SubLList $list14 = list(makeSymbol("*HTML-NODE-RENDERING-FUNCTION*"));

    static private final SubLList $list15 = list(makeSymbol("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*"));

    public static final SubLSymbol $html_node_rendering_function$ = makeSymbol("*HTML-NODE-RENDERING-FUNCTION*");

    public static final SubLSymbol $html_node_rendering_background_colormap$ = makeSymbol("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*");

    static private final SubLList $list18 = list(list(makeSymbol("NODE")), makeSymbol("LINKS"));

    static private final SubLList $list19 = list(makeSymbol("NODES"), makeSymbol("LINKS"));

    static private final SubLString $$$Color_Key = makeString("Color Key");

    static private final SubLString $str22$Naked_terms_ = makeString("Naked terms.");

    static private final SubLString $str23$Isolated_terms_ = makeString("Isolated terms.");

    static private final SubLString $str24$Connected_terms_ = makeString("Connected terms.");

    static private final SubLString $str25$All_connected_ = makeString("All connected.");

    static private final SubLString $str26$_ = makeString("[");

    static private final SubLString $str27$_ = makeString("]");

    // Definitions
    /**
     * Composite wrapper for computation of node sets and rendering.
     */
    @LispMethod(comment = "Composite wrapper for computation of node sets and rendering.")
    public static final SubLObject html_categorize_nodes_via_links_alt(SubLObject nodes, SubLObject links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(nodes, links, test);
                SubLObject isolated_groups = thread.secondMultipleValue();
                SubLObject naked_groups = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                com.cyc.cycjava.cycl.html_rendering.html_render_link_categorized_nodes(connected_groups, isolated_groups, naked_groups);
                html_newline(UNPROVIDED);
                com.cyc.cycjava.cycl.html_rendering.html_display_node_rendering_colormap();
            }
            return NIL;
        }
    }

    // Definitions
    /**
     * Composite wrapper for computation of node sets and rendering.
     */
    @LispMethod(comment = "Composite wrapper for computation of node sets and rendering.")
    public static SubLObject html_categorize_nodes_via_links(final SubLObject nodes, final SubLObject links, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject connected_groups = graph_utilities.categorize_nodes_via_links(nodes, links, test);
        final SubLObject isolated_groups = thread.secondMultipleValue();
        final SubLObject naked_groups = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        html_render_link_categorized_nodes(connected_groups, isolated_groups, naked_groups);
        html_newline(UNPROVIDED);
        html_display_node_rendering_colormap();
        return NIL;
    }

    public static final SubLObject construct_html_node_rendering_colormap_helper_alt(SubLObject naked, SubLObject isolated, SubLObject connected, SubLObject all_connected, SubLObject colormap) {
        return list(list($NAKED, naked), list($ISOLATED, isolated), list($CONNECTED, connected), list($ALL_CONNECTED, all_connected), list($COLORMAP, colormap));
    }

    public static SubLObject construct_html_node_rendering_colormap_helper(final SubLObject naked, final SubLObject isolated, final SubLObject connected, final SubLObject all_connected, final SubLObject colormap) {
        return list(list($NAKED, naked), list($ISOLATED, isolated), list($CONNECTED, connected), list($ALL_CONNECTED, all_connected), list($COLORMAP, colormap));
    }

    public static final SubLObject html_render_link_categorized_nodes_my_way_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_1 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt6);
                        current_1 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt6);
                        if (NIL == member(current_1, $list_alt7, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_1 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt6);
                    }
                    {
                        SubLObject renderfn_tail = property_list_member($RENDERFN, current);
                        SubLObject renderfn = (NIL != renderfn_tail) ? ((SubLObject) (cadr(renderfn_tail))) : NIL;
                        SubLObject colormap_tail = property_list_member($COLORMAP, current);
                        SubLObject colormap = (NIL != colormap_tail) ? ((SubLObject) (cadr(colormap_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject function = $sym10$FUNCTION;
                            SubLObject colors = $sym11$COLORS;
                            return listS(CLET, list(list(function, listS(FIF, renderfn, renderfn, $list_alt14)), list(colors, listS(FIF, colormap, colormap, $list_alt15)), list($html_node_rendering_function$, function), list($html_node_rendering_background_colormap$, colors)), append(body, NIL));
                        }
                    }
                }
            }
        }
    }

    public static SubLObject html_render_link_categorized_nodes_my_way(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list6);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list6);
            if (NIL == member(current_$1, $list7, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list6);
        }
        final SubLObject renderfn_tail = property_list_member($RENDERFN, current);
        final SubLObject renderfn = (NIL != renderfn_tail) ? cadr(renderfn_tail) : NIL;
        final SubLObject colormap_tail = property_list_member($COLORMAP, current);
        final SubLObject colormap = (NIL != colormap_tail) ? cadr(colormap_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject function = $sym10$FUNCTION;
        final SubLObject colors = $sym11$COLORS;
        return listS(CLET, list(list(function, listS(FIF, renderfn, renderfn, $list14)), list(colors, listS(FIF, colormap, colormap, $list15)), list($html_node_rendering_function$, function), list($html_node_rendering_background_colormap$, colors)), append(body, NIL));
    }

    /**
     * Given the three groups identified by the CATEGORIZE-NODES-VIA-LINKS
     * algorithm, render them in a nice HTML fashion.
     */
    @LispMethod(comment = "Given the three groups identified by the CATEGORIZE-NODES-VIA-LINKS\r\nalgorithm, render them in a nice HTML fashion.\nGiven the three groups identified by the CATEGORIZE-NODES-VIA-LINKS\nalgorithm, render them in a nice HTML fashion.")
    public static final SubLObject html_render_link_categorized_nodes_alt(SubLObject connected_groups, SubLObject isolated_groups, SubLObject naked_groups) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject render_function = $html_node_rendering_function$.getDynamicValue(thread);
                SubLObject backgrounds = $html_node_rendering_background_colormap$.getDynamicValue(thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ONE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (NIL != naked_groups) {
                            {
                                SubLObject bgcolor = second(assoc($NAKED, backgrounds, UNPROVIDED, UNPROVIDED));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(bgcolor);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = naked_groups;
                                                    SubLObject island_group = NIL;
                                                    for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject datum = island_group;
                                                            SubLObject current = datum;
                                                            destructuring_bind_must_consp(current, datum, $list_alt18);
                                                            {
                                                                SubLObject temp = current.rest();
                                                                current = current.first();
                                                                {
                                                                    SubLObject node = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt18);
                                                                    node = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        current = temp;
                                                                        {
                                                                            SubLObject links = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt18);
                                                                            links = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                funcall(render_function, node);
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list_alt18);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt18);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if (NIL != isolated_groups) {
                            {
                                SubLObject bgcolor = second(assoc($ISOLATED, backgrounds, UNPROVIDED, UNPROVIDED));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(bgcolor);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                {
                                                    SubLObject cdolist_list_var = isolated_groups;
                                                    SubLObject island_group = NIL;
                                                    for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject datum = island_group;
                                                            SubLObject current = datum;
                                                            destructuring_bind_must_consp(current, datum, $list_alt18);
                                                            {
                                                                SubLObject temp = current.rest();
                                                                current = current.first();
                                                                {
                                                                    SubLObject node = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt18);
                                                                    node = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        current = temp;
                                                                        {
                                                                            SubLObject links = NIL;
                                                                            destructuring_bind_must_consp(current, datum, $list_alt18);
                                                                            links = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                funcall(render_function, node);
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list_alt18);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt18);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                        if (NIL != connected_groups) {
                            {
                                SubLObject bgcolor_type = (((NIL == naked_groups) && (NIL == isolated_groups)) && (NIL != list_utilities.singletonP(connected_groups))) ? ((SubLObject) ($ALL_CONNECTED)) : $CONNECTED;
                                SubLObject bgcolor = second(assoc(bgcolor_type, backgrounds, UNPROVIDED, UNPROVIDED));
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        if (NIL != bgcolor) {
                                            html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(bgcolor);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                                if (true) {
                                                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(ZERO_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                if (true) {
                                                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(ZERO_INTEGER);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        {
                                                            SubLObject cdolist_list_var = connected_groups;
                                                            SubLObject island_group = NIL;
                                                            for (island_group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , island_group = cdolist_list_var.first()) {
                                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                                html_char(CHAR_greater, UNPROVIDED);
                                                                {
                                                                    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                    try {
                                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                                        html_char(CHAR_greater, UNPROVIDED);
                                                                        {
                                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                            try {
                                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                                {
                                                                                    SubLObject datum = island_group;
                                                                                    SubLObject current = datum;
                                                                                    SubLObject nodes = NIL;
                                                                                    SubLObject links = NIL;
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt19);
                                                                                    nodes = current.first();
                                                                                    current = current.rest();
                                                                                    destructuring_bind_must_consp(current, datum, $list_alt19);
                                                                                    links = current.first();
                                                                                    current = current.rest();
                                                                                    if (NIL == current) {
                                                                                        {
                                                                                            SubLObject cdolist_list_var_11 = nodes;
                                                                                            SubLObject node = NIL;
                                                                                            for (node = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , node = cdolist_list_var_11.first()) {
                                                                                                funcall(render_function, node);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        cdestructuring_bind_error(datum, $list_alt19);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                                            }
                                                                        }
                                                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                                    } finally {
                                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                    }
                                                                }
                                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                                html_source_readability_terpri(UNPROVIDED);
                                                            }
                                                        }
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                            }
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Given the three groups identified by the CATEGORIZE-NODES-VIA-LINKS
     * algorithm, render them in a nice HTML fashion.
     */
    @LispMethod(comment = "Given the three groups identified by the CATEGORIZE-NODES-VIA-LINKS\r\nalgorithm, render them in a nice HTML fashion.\nGiven the three groups identified by the CATEGORIZE-NODES-VIA-LINKS\nalgorithm, render them in a nice HTML fashion.")
    public static SubLObject html_render_link_categorized_nodes(final SubLObject connected_groups, final SubLObject isolated_groups, final SubLObject naked_groups) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject render_function = $html_node_rendering_function$.getDynamicValue(thread);
        final SubLObject backgrounds = $html_node_rendering_background_colormap$.getDynamicValue(thread);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if (NIL != naked_groups) {
                final SubLObject bgcolor = second(assoc($NAKED, backgrounds, UNPROVIDED, UNPROVIDED));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var = naked_groups;
                        SubLObject island_group = NIL;
                        island_group = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = island_group;
                            destructuring_bind_must_consp(current, datum, $list18);
                            final SubLObject temp = current.rest();
                            current = current.first();
                            SubLObject node = NIL;
                            destructuring_bind_must_consp(current, datum, $list18);
                            node = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                SubLObject links = NIL;
                                destructuring_bind_must_consp(current, datum, $list18);
                                links = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    funcall(render_function, node);
                                } else {
                                    cdestructuring_bind_error(datum, $list18);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list18);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            island_group = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            if (NIL != isolated_groups) {
                final SubLObject bgcolor = second(assoc($ISOLATED, backgrounds, UNPROVIDED, UNPROVIDED));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != bgcolor) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject cdolist_list_var = isolated_groups;
                        SubLObject island_group = NIL;
                        island_group = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current;
                            final SubLObject datum = current = island_group;
                            destructuring_bind_must_consp(current, datum, $list18);
                            final SubLObject temp = current.rest();
                            current = current.first();
                            SubLObject node = NIL;
                            destructuring_bind_must_consp(current, datum, $list18);
                            node = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                SubLObject links = NIL;
                                destructuring_bind_must_consp(current, datum, $list18);
                                links = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    funcall(render_function, node);
                                } else {
                                    cdestructuring_bind_error(datum, $list18);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list18);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            island_group = cdolist_list_var.first();
                        } 
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            if (NIL != connected_groups) {
                final SubLObject bgcolor_type = (((NIL == naked_groups) && (NIL == isolated_groups)) && (NIL != list_utilities.singletonP(connected_groups))) ? $ALL_CONNECTED : $CONNECTED;
                final SubLObject bgcolor2 = second(assoc(bgcolor_type, backgrounds, UNPROVIDED, UNPROVIDED));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (NIL != bgcolor2) {
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(bgcolor2);
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject cdolist_list_var2 = connected_groups;
                            SubLObject island_group2 = NIL;
                            island_group2 = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        SubLObject current2;
                                        final SubLObject datum2 = current2 = island_group2;
                                        SubLObject nodes = NIL;
                                        SubLObject links2 = NIL;
                                        destructuring_bind_must_consp(current2, datum2, $list19);
                                        nodes = current2.first();
                                        current2 = current2.rest();
                                        destructuring_bind_must_consp(current2, datum2, $list19);
                                        links2 = current2.first();
                                        current2 = current2.rest();
                                        if (NIL == current2) {
                                            SubLObject cdolist_list_var_$11 = nodes;
                                            SubLObject node2 = NIL;
                                            node2 = cdolist_list_var_$11.first();
                                            while (NIL != cdolist_list_var_$11) {
                                                funcall(render_function, node2);
                                                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                                                node2 = cdolist_list_var_$11.first();
                                            } 
                                        } else {
                                            cdestructuring_bind_error(datum2, $list19);
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                island_group2 = cdolist_list_var2.first();
                            } 
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_display_node_rendering_colormap_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backgrounds = $html_node_rendering_background_colormap$.getDynamicValue(thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                {
                                    SubLObject bgcolor = second(assoc($COLORMAP, backgrounds, UNPROVIDED, UNPROVIDED));
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(bgcolor);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            if (true) {
                                                html_markup(html_macros.$html_table_border$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(ZERO_INTEGER);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (true) {
                                                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(html_align($CENTER));
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                                                    html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                                                    html_princ($$$Color_Key);
                                                                    html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            bgcolor = second(assoc($NAKED, backgrounds, UNPROVIDED, UNPROVIDED));
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != bgcolor) {
                                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(bgcolor);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(MINUS_ONE_INTEGER);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ($str_alt22$Naked_terms_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            bgcolor = second(assoc($ISOLATED, backgrounds, UNPROVIDED, UNPROVIDED));
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != bgcolor) {
                                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(bgcolor);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(MINUS_ONE_INTEGER);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ($str_alt23$Isolated_terms_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            bgcolor = second(assoc($CONNECTED, backgrounds, UNPROVIDED, UNPROVIDED));
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != bgcolor) {
                                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(bgcolor);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(MINUS_ONE_INTEGER);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ($str_alt24$Connected_terms_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    {
                                                        SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            bgcolor = second(assoc($ALL_CONNECTED, backgrounds, UNPROVIDED, UNPROVIDED));
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            if (NIL != bgcolor) {
                                                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                                html_markup(bgcolor);
                                                                html_char(CHAR_quotation, UNPROVIDED);
                                                            }
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            {
                                                                SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                try {
                                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                                                    if (true) {
                                                                        html_markup(html_macros.$html_font_size$.getGlobalValue());
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_markup(MINUS_ONE_INTEGER);
                                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_princ($str_alt25$All_connected_);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
                                                                        }
                                                                    }
                                                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                                                } finally {
                                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
                                                                }
                                                            }
                                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
                                                        }
                                                    }
                                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_source_readability_terpri(UNPROVIDED);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static SubLObject html_display_node_rendering_colormap() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backgrounds = $html_node_rendering_background_colormap$.getDynamicValue(thread);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject bgcolor = second(assoc($COLORMAP, backgrounds, UNPROVIDED, UNPROVIDED));
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($CENTER));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_markup(html_macros.$html_underlined_head$.getGlobalValue());
                                html_princ($$$Color_Key);
                                html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            bgcolor = second(assoc($NAKED, backgrounds, UNPROVIDED, UNPROVIDED));
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(MINUS_ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str22$Naked_terms_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            bgcolor = second(assoc($ISOLATED, backgrounds, UNPROVIDED, UNPROVIDED));
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(MINUS_ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str23$Isolated_terms_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            bgcolor = second(assoc($CONNECTED, backgrounds, UNPROVIDED, UNPROVIDED));
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(MINUS_ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str24$Connected_terms_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            bgcolor = second(assoc($ALL_CONNECTED, backgrounds, UNPROVIDED, UNPROVIDED));
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            if (NIL != bgcolor) {
                                html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(bgcolor);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(MINUS_ONE_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str25$All_connected_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject html_categorize_graph_render_node_alt(SubLObject node) {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_princ($str_alt26$_);
        html_princ(node);
        html_princ($str_alt27$_);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject html_categorize_graph_render_node(final SubLObject node) {
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_princ($str26$_);
        html_princ(node);
        html_princ($str27$_);
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_html_rendering_file() {
        declareFunction("html_categorize_nodes_via_links", "HTML-CATEGORIZE-NODES-VIA-LINKS", 2, 1, false);
        declareFunction("construct_html_node_rendering_colormap_helper", "CONSTRUCT-HTML-NODE-RENDERING-COLORMAP-HELPER", 5, 0, false);
        declareMacro("html_render_link_categorized_nodes_my_way", "HTML-RENDER-LINK-CATEGORIZED-NODES-MY-WAY");
        declareFunction("html_render_link_categorized_nodes", "HTML-RENDER-LINK-CATEGORIZED-NODES", 3, 0, false);
        declareFunction("html_display_node_rendering_colormap", "HTML-DISPLAY-NODE-RENDERING-COLORMAP", 0, 0, false);
        declareFunction("html_categorize_graph_render_node", "HTML-CATEGORIZE-GRAPH-RENDER-NODE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_html_rendering_file_alt() {
        defparameter("*HTML-NODE-RENDERING-FUNCTION*", HTML_CATEGORIZE_GRAPH_RENDER_NODE);
        defparameter("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*", list(list($NAKED, html_macros.$html_color_sat_red$.getDynamicValue()), list($ISOLATED, html_macros.$html_color_sat_yellow$.getDynamicValue()), list($CONNECTED, html_macros.$html_color_sat_green$.getDynamicValue()), list($ALL_CONNECTED, html_macros.$html_color_white$.getDynamicValue()), list($COLORMAP, html_macros.$html_color_lighter_grey$.getDynamicValue())));
        return NIL;
    }

    public static SubLObject init_html_rendering_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*HTML-NODE-RENDERING-FUNCTION*", HTML_CATEGORIZE_GRAPH_RENDER_NODE);
            defparameter("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*", list(list($NAKED, html_macros.$html_color_sat_red$.getGlobalValue()), list($ISOLATED, html_macros.$html_color_sat_yellow$.getGlobalValue()), list($CONNECTED, html_macros.$html_color_sat_green$.getGlobalValue()), list($ALL_CONNECTED, html_macros.$html_color_white$.getGlobalValue()), list($COLORMAP, html_macros.$html_color_lighter_grey$.getGlobalValue())));
        }
        if (SubLFiles.USE_V2) {
            defparameter("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*", list(list($NAKED, html_macros.$html_color_sat_red$.getDynamicValue()), list($ISOLATED, html_macros.$html_color_sat_yellow$.getDynamicValue()), list($CONNECTED, html_macros.$html_color_sat_green$.getDynamicValue()), list($ALL_CONNECTED, html_macros.$html_color_white$.getDynamicValue()), list($COLORMAP, html_macros.$html_color_lighter_grey$.getDynamicValue())));
        }
        return NIL;
    }

    public static SubLObject init_html_rendering_file_Previous() {
        defparameter("*HTML-NODE-RENDERING-FUNCTION*", HTML_CATEGORIZE_GRAPH_RENDER_NODE);
        defparameter("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*", list(list($NAKED, html_macros.$html_color_sat_red$.getGlobalValue()), list($ISOLATED, html_macros.$html_color_sat_yellow$.getGlobalValue()), list($CONNECTED, html_macros.$html_color_sat_green$.getGlobalValue()), list($ALL_CONNECTED, html_macros.$html_color_white$.getGlobalValue()), list($COLORMAP, html_macros.$html_color_lighter_grey$.getGlobalValue())));
        return NIL;
    }

    public static SubLObject setup_html_rendering_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_html_rendering_file();
    }

    @Override
    public void initializeVariables() {
        init_html_rendering_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_html_rendering_file();
    }

    static {
    }

    static private final SubLList $list_alt6 = list(list(makeSymbol("&KEY"), makeSymbol("RENDERFN"), makeSymbol("COLORMAP")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt7 = list(makeKeyword("RENDERFN"), makeKeyword("COLORMAP"));

    static private final SubLList $list_alt14 = list(makeSymbol("*HTML-NODE-RENDERING-FUNCTION*"));

    static private final SubLList $list_alt15 = list(makeSymbol("*HTML-NODE-RENDERING-BACKGROUND-COLORMAP*"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("NODE")), makeSymbol("LINKS"));

    static private final SubLList $list_alt19 = list(makeSymbol("NODES"), makeSymbol("LINKS"));

    static private final SubLString $str_alt22$Naked_terms_ = makeString("Naked terms.");

    static private final SubLString $str_alt23$Isolated_terms_ = makeString("Isolated terms.");

    static private final SubLString $str_alt24$Connected_terms_ = makeString("Connected terms.");

    static private final SubLString $str_alt25$All_connected_ = makeString("All connected.");

    static private final SubLString $str_alt26$_ = makeString("[");

    static private final SubLString $str_alt27$_ = makeString("]");
}

/**
 * Total time: 385 ms
 */
