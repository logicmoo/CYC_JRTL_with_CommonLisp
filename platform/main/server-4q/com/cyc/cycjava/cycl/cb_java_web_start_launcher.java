/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-JAVA-WEB-START-LAUNCHER
 *  source file: /cyc/top/cycl/cb-java-web-start-launcher.lisp
 *  created:     2019/07/03 17:38:08
 */
public final class cb_java_web_start_launcher extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_java_web_start_launcher() {
    }

    public static final SubLFile me = new cb_java_web_start_launcher();


    // // Definitions
    /**
     * Displays the Java Web Start links page.
     *
     * @param args;
     * 		ignored, but necessary for compatibility
     * @return nil
     */
    public static final SubLObject display_jws_links_page(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        display_jws_links_page_internal();
        return NIL;
    }

    /**
     *
     *
     * @param linktext;
     * 		a different link name if wanted.
     * @return nil
    Defines a CYC Browser link method called App Launcher
     */
    public static final SubLObject cb_link_display_jws_links_page(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt1$_App_Launcher_;
            }
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($MAIN);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                html_utilities.html_princ($str_alt3$display_jws_links_page);
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_utilities.html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Create the web page with Java Web Start links.
     */
    public static final SubLObject display_jws_links_page_internal() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt11$Select_the_Cyc_application_to_lau;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_parameters.cb_head_shortcut_icon();
                        html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_utilities.html_source_readability_terpri(UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                    html_utilities.html_markup($str_alt14$yui_skin_sam);
                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                            html_utilities.html_princ(title_var);
                                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_utilities.html_markup(TWO_INTEGER);
                                            html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ONE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(FIVE_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup(ZERO_INTEGER);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($$$lightcyan);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt16$_Application_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt17$_Description_);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$white);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                                {
                                                                    SubLObject url = create_jws_url($str_alt19$akb_akb);
                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(url);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($str_alt20$_self);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($str_alt21$Analyst_s_Knowledge_Base);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt22$The_Cycorp_Analyst_s_Knowledge_Ba);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$lightcyan);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                                {
                                                                    SubLObject url = create_jws_url($str_alt23$ontology_exporter_ontology_export);
                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(url);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($str_alt20$_self);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($$$Ontology_Exporter);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt25$The_Cycorp_Ontology_Exporter_is_t);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                if (true) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                    html_utilities.html_markup($$$white);
                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                }
                                                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                {
                                                    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_newline(UNPROVIDED);
                                                                html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
                                                                {
                                                                    SubLObject url = create_jws_url($str_alt26$sgt_sgt);
                                                                    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                                    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    html_utilities.html_markup(url);
                                                                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    if (true) {
                                                                        html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                        html_utilities.html_markup($str_alt20$_self);
                                                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                                                    }
                                                                    html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                                    {
                                                                        SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
                                                                        try {
                                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                                            html_utilities.html_princ($$$Semantic_Graph_Transformer);
                                                                        } finally {
                                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
                                                                        }
                                                                    }
                                                                    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                                }
                                                                html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
                                                                html_utilities.html_newline(UNPROVIDED);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                                        {
                                                            SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_utilities.html_princ($str_alt28$The_Cycorp_Semantic_Graph_Transfo);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
                                                            }
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
                                                    }
                                                }
                                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        html_utilities.html_markup($str_alt29$http___java_sun_com_products_java);
                                        html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        if (true) {
                                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                            html_utilities.html_markup($str_alt30$_blank);
                                            html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                                        }
                                        html_utilities.html_char(CHAR_greater, UNPROVIDED);
                                        {
                                            SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_utilities.html_princ($$$Java_Web_Start);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
                                            }
                                        }
                                        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt32$_requires_that_downloaded_files_w);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt33$_jnlp);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt34$_be_associated_with_the_);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_utilities.html_princ($$$javaws);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt36$_executable__which_can_be_found_w);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt37$When_a_Cyc_application_is_launche);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
                                        html_utilities.html_princ($str_alt38$To_observe_the_java_console_for_C);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_utilities.html_princ($$$javaws);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt39$_without_any_command_line_paramet);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Advanced);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt41$_tab_of_the_);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Preferences);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt43$_menu_item__check_the_);
                                        html_utilities.html_markup(html_macros.$html_code_head$.getGlobalValue());
                                        html_utilities.html_princ($$$Show_Java_Console);
                                        html_utilities.html_markup(html_macros.$html_code_tail$.getGlobalValue());
                                        html_utilities.html_princ($str_alt45$_checkbox_);
                                        html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
                                        html_utilities.html_newline(UNPROVIDED);
                                        if (NIL != cb_parameters.$cb_include_help$.getDynamicValue(thread)) {
                                            cb_utilities.cb_help($CB_APP_LAUNCHER, UNPROVIDED, UNPROVIDED);
                                            html_utilities.html_indent(TWO_INTEGER);
                                        }
                                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                                        html_utilities.html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Returns the Java Web Start URL for the given APP-PATH (e.g. sgt/sgt).
     */
    public static final SubLObject create_jws_url(SubLObject app_path) {
        return cconcatenate($str_alt46$http___, new SubLObject[]{ Environment.get_machine_name(UNPROVIDED), $str_alt47$_, string_utilities.to_string(http_kernel.http_port()), $str_alt48$_java_java_web_start_, app_path, $str_alt49$_jnlp_user_, web_utilities.html_encode_fort(operation_communication.the_cyclist()), $str_alt50$_project_, web_utilities.html_encode_fort(NIL != fi.ke_purpose() ? ((SubLObject) (fi.ke_purpose())) : $$GeneralCycKE) });
    }

    public static final SubLObject declare_cb_java_web_start_launcher_file() {
        declareFunction("display_jws_links_page", "DISPLAY-JWS-LINKS-PAGE", 0, 1, false);
        declareFunction("cb_link_display_jws_links_page", "CB-LINK-DISPLAY-JWS-LINKS-PAGE", 0, 1, false);
        declareFunction("display_jws_links_page_internal", "DISPLAY-JWS-LINKS-PAGE-INTERNAL", 0, 0, false);
        declareFunction("create_jws_url", "CREATE-JWS-URL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_java_web_start_launcher_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_java_web_start_launcher_file() {
                html_macros.note_html_handler_function(DISPLAY_JWS_LINKS_PAGE);
        cb_utilities.setup_cb_link_method($DISPLAY_JWS_LINKS_PAGE, CB_LINK_DISPLAY_JWS_LINKS_PAGE, ONE_INTEGER);
        cb_utilities.declare_cb_tool($DISPLAY_JWS_LINKS_PAGE, $$$App_Launcher, $$$Launch, $$$Cyc_Application_Launcher);
        sethash($CB_APP_LAUNCHER, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str_alt10$cb_app_launcher_html, NIL));
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol DISPLAY_JWS_LINKS_PAGE = makeSymbol("DISPLAY-JWS-LINKS-PAGE");

    static private final SubLString $str_alt1$_App_Launcher_ = makeString("[App Launcher]");



    static private final SubLString $str_alt3$display_jws_links_page = makeString("display-jws-links-page");

    private static final SubLSymbol $DISPLAY_JWS_LINKS_PAGE = makeKeyword("DISPLAY-JWS-LINKS-PAGE");

    private static final SubLSymbol CB_LINK_DISPLAY_JWS_LINKS_PAGE = makeSymbol("CB-LINK-DISPLAY-JWS-LINKS-PAGE");

    static private final SubLString $$$App_Launcher = makeString("App Launcher");

    static private final SubLString $$$Launch = makeString("Launch");

    static private final SubLString $$$Cyc_Application_Launcher = makeString("Cyc Application Launcher");

    private static final SubLSymbol $CB_APP_LAUNCHER = makeKeyword("CB-APP-LAUNCHER");

    static private final SubLString $str_alt10$cb_app_launcher_html = makeString("cb-app-launcher.html");

    static private final SubLString $str_alt11$Select_the_Cyc_application_to_lau = makeString("Select the Cyc application to launch");



    static private final SubLString $str_alt13$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt14$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $$$lightcyan = makeString("lightcyan");

    static private final SubLString $str_alt16$_Application_ = makeString(" Application ");

    static private final SubLString $str_alt17$_Description_ = makeString(" Description ");

    static private final SubLString $$$white = makeString("white");

    static private final SubLString $str_alt19$akb_akb = makeString("akb/akb");

    static private final SubLString $str_alt20$_self = makeString("_self");

    static private final SubLString $str_alt21$Analyst_s_Knowledge_Base = makeString("Analyst's Knowledge Base");

    static private final SubLString $str_alt22$The_Cycorp_Analyst_s_Knowledge_Ba = makeString("The Cycorp Analyst's Knowledge Base (AKB) is the tool that enables the user to easily formulate queries and enter facts into the Cyc knowledge base.  Key AKB features include: selecting and describing analyst tasks, acquiring relevant concepts from given text, managing a library of applicable queries, new query formulation, answer justification, answer set visualization, fact sheets (concept summaries), and fact entry.");

    static private final SubLString $str_alt23$ontology_exporter_ontology_export = makeString("ontology-exporter/ontology-exporter");

    static private final SubLString $$$Ontology_Exporter = makeString("Ontology Exporter");

    static private final SubLString $str_alt25$The_Cycorp_Ontology_Exporter_is_t = makeString("The Cycorp Ontology Exporter is the tool for flexibly extracting terms and their associated assertions and converting them into Web Ontology Language (OWL) statements.  The user selects the ontological Cyc subset using the Query Library, Query Formulator and Queries Panel. The answer set is subject to user review before the OWL export process begins. ");

    static private final SubLString $str_alt26$sgt_sgt = makeString("sgt/sgt");

    static private final SubLString $$$Semantic_Graph_Transformer = makeString("Semantic Graph Transformer");

    static private final SubLString $str_alt28$The_Cycorp_Semantic_Graph_Transfo = makeString("The Cycorp Semantic Graph Transformer (SGT) is a tool that uses Cyc inference and Semantic Knowledge Source Integration (SKSI) technology, in conjunction with a UI-indicated set of user-selectable templates, to transform the data structure of external knowledge sources in ways that alter graphs generated from the data, in order to support graph-based group- and threat-detection systems such as the Terrorist Modus Operandi Detection System (TMODS) fielded by 21st Century Technologies.");

    static private final SubLString $str_alt29$http___java_sun_com_products_java = makeString("http://java.sun.com/products/javawebstart/");

    static private final SubLString $str_alt30$_blank = makeString("_blank");

    static private final SubLString $$$Java_Web_Start = makeString("Java Web Start");

    static private final SubLString $str_alt32$_requires_that_downloaded_files_w = makeString(" requires that downloaded files with the extension ");

    static private final SubLString $str_alt33$_jnlp = makeString(".jnlp");

    static private final SubLString $str_alt34$_be_associated_with_the_ = makeString(" be associated with the ");

    static private final SubLString $$$javaws = makeString("javaws");

    static private final SubLString $str_alt36$_executable__which_can_be_found_w = makeString(" executable, which can be found within your computer's Java installation file tree.");

    static private final SubLString $str_alt37$When_a_Cyc_application_is_launche = makeString("When a Cyc application is launched for the first time, you must accept the signed jar files from www.cyc.com.");

    static private final SubLString $str_alt38$To_observe_the_java_console_for_C = makeString("To observe the java console for Cyc applications launched via Java Web Start, you should execute ");

    static private final SubLString $str_alt39$_without_any_command_line_paramet = makeString(" without any command line parameters to open the Java Web Start Application Manager.  In the ");

    static private final SubLString $$$Advanced = makeString("Advanced");

    static private final SubLString $str_alt41$_tab_of_the_ = makeString(" tab of the ");

    static private final SubLString $$$Preferences = makeString("Preferences");

    static private final SubLString $str_alt43$_menu_item__check_the_ = makeString(" menu item, check the ");

    static private final SubLString $$$Show_Java_Console = makeString("Show Java Console");

    static private final SubLString $str_alt45$_checkbox_ = makeString(" checkbox.");

    static private final SubLString $str_alt46$http___ = makeString("http://");

    static private final SubLString $str_alt47$_ = makeString(":");

    static private final SubLString $str_alt48$_java_java_web_start_ = makeString("/java/java-web-start/");

    static private final SubLString $str_alt49$_jnlp_user_ = makeString(".jnlp?user=");

    static private final SubLString $str_alt50$_project_ = makeString("&project=");

    public static final SubLObject $$GeneralCycKE = constant_handles.reader_make_constant_shell(makeString("GeneralCycKE"));

    // // Initializers
    public void declareFunctions() {
        declare_cb_java_web_start_launcher_file();
    }

    public void initializeVariables() {
        init_cb_java_web_start_launcher_file();
    }

    public void runTopLevelForms() {
        setup_cb_java_web_start_launcher_file();
    }
}

