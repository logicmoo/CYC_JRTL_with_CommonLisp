package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_qua extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_qua";
    public static final String myFingerPrint = "9aa2aa8df6b6371ec92268efe8a5bb0ba55f02e01fe2d218037da4de6af49555";
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6612L)
    private static SubLSymbol $qua_supported_search_engine_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6697L)
    public static SubLSymbol $qua_supported_search_engines$;
    private static final SubLString $str0$cb_query_augmentation;
    private static final SubLSymbol $kw1$MAIN;
    private static final SubLSymbol $kw2$QUERY_AUGMENTATION;
    private static final SubLSymbol $sym3$CB_LINK_QUERY_AUGMENTATION;
    private static final SubLSymbol $kw4$QUA_INPUT;
    private static final SubLString $str5$qua_input;
    private static final SubLString $str6$cb_qua_input;
    private static final SubLSymbol $kw7$QUA_OUTPUT;
    private static final SubLString $str8$quaoutput;
    private static final SubLString $str9$cb_qua_output;
    private static final SubLSymbol $kw10$QUA_RAW_OUTPUT;
    private static final SubLString $str11$quarawoutput;
    private static final SubLString $str12$cb_qua_raw_output;
    private static final SubLString $str13$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str14$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw15$UNINITIALIZED;
    private static final SubLSymbol $sym16$CB_QUA_RAW_OUTPUT;
    private static final SubLSymbol $kw17$HTML_HANDLER;
    private static final SubLSymbol $sym18$CB_QUA_OUTPUT;
    private static final SubLSymbol $kw19$CB_CYC;
    private static final SubLString $str20$Cycorp_Query_Augmentation;
    private static final SubLString $str21$Cannot_have_a_FRAMESET_tag_inside;
    private static final SubLString $str22$90__10_;
    private static final SubLString $str23$50__50_;
    private static final SubLSymbol $sym24$CB_QUERY_AUGMENTATION;
    private static final SubLString $str25$_id;
    private static final SubLString $str26$_query_text;
    private static final SubLString $str27$_search_engine;
    private static final SubLSymbol $kw28$CYC_LOGO_LARGE_VIOLET_FULL_URL;
    private static final SubLSymbol $kw29$CENTER;
    private static final SubLString $str30$Cyc_Browser;
    private static final SubLString $str31$post;
    private static final SubLString $str32$Query_String__;
    private static final SubLString $str33$_Run_Query_;
    private static final SubLString $str34$parent_quaoutput_location_href___;
    private static final SubLString $str35$__;
    private static final SubLString $str36$parent_quarawoutput_location_href;
    private static final SubLSymbol $sym37$CB_QUA_INPUT;
    private static final SubLSymbol $kw38$TOP;
    private static final SubLString $str39$Specializations_;
    private static final SubLString $str40$Generalizations_;
    private static final SubLString $str41$Related_terms_;
    private static final SubLList $list42;
    private static final SubLList $list43;
    private static final SubLString $str44$;
    private static final SubLInteger $int45$75;
    private static final SubLString $str46$New_Query;
    private static final SubLString $str47$Search_Engine__;
    private static final SubLString $str48$onChange_javascript_this_form_sub;
    private static final SubLString $str49$Query_Terms__;
    private static final SubLString $str50$__;
    private static final SubLString $str51$_A;
    private static final SubLString $str52$setVisibility___A___inline__;
    private static final SubLString $str53$setVisibility___A___none__;
    private static final SubLList $list54;
    private static final SubLSymbol $kw55$INVISIBLE;
    private static final SubLSymbol $kw56$TEXT;
    private static final SubLString $str57$Synonyms__;
    private static final SubLString $str58$_raw_string;
    private static final SubLString $str59$_;
    private static final SubLString $str60$qua_query_term_id__A__A;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 721L)
    public static SubLObject cb_link_query_augmentation(SubLObject linktext) {
        if (linktext == cb_qua.UNPROVIDED) {
            linktext = (SubLObject)cb_qua.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_qua.NIL == linktext) {
            linktext = (SubLObject)cb_qua.$str0$cb_query_augmentation;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_qua.$kw1$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_qua.$str0$cb_query_augmentation);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
        if (cb_qua.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_qua.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 1434L)
    public static SubLObject cb_qua_raw_output(SubLObject args) {
        if (args == cb_qua.UNPROVIDED) {
            args = (SubLObject)cb_qua.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_qua.$str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_qua.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_qua.$str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_qua.$kw15$UNINITIALIZED) ? ConsesLow.list(cb_qua.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 1523L)
    public static SubLObject cb_qua_output(SubLObject args) {
        if (args == cb_qua.UNPROVIDED) {
            args = (SubLObject)cb_qua.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_qua.$str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_qua.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_qua.$str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_qua.$kw15$UNINITIALIZED) ? ConsesLow.list(cb_qua.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        return args;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 1608L)
    public static SubLObject cb_query_augmentation(SubLObject args) {
        if (args == cb_qua.UNPROVIDED) {
            args = (SubLObject)cb_qua.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_qua.$str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_qua.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_qua.$str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_qua.$kw15$UNINITIALIZED) ? ConsesLow.list(cb_qua.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_qua.$kw19$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_qua.$str20$Cycorp_Query_Augmentation);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            if (cb_qua.NIL != html_macros.html_inside_body_p()) {
                Errors.error((SubLObject)cb_qua.$str21$Cannot_have_a_FRAMESET_tag_inside);
            }
            html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_frameset_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_qua.$str22$90__10_);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                cb_utilities.cb_frame((SubLObject)cb_qua.$kw4$QUA_INPUT, args, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
                if (cb_qua.NIL != html_macros.html_inside_body_p()) {
                    Errors.error((SubLObject)cb_qua.$str21$Cannot_have_a_FRAMESET_tag_inside);
                }
                html_utilities.html_markup(html_macros.$html_frameset_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_frameset_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_qua.$str23$50__50_);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                    cb_utilities.cb_frame((SubLObject)cb_qua.$kw7$QUA_OUTPUT, args, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
                    cb_utilities.cb_frame((SubLObject)cb_qua.$kw10$QUA_RAW_OUTPUT, args, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_frameset_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        return (SubLObject)cb_qua.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 2084L)
    public static SubLObject cb_qua_input(SubLObject args) {
        if (args == cb_qua.UNPROVIDED) {
            args = (SubLObject)cb_qua.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_id_string = html_utilities.html_extract_input((SubLObject)cb_qua.$str25$_id, args);
        final SubLObject query_text = html_utilities.html_extract_input((SubLObject)cb_qua.$str26$_query_text, args);
        final SubLObject v_search_engine = Symbols.make_keyword(html_utilities.html_extract_input((SubLObject)cb_qua.$str27$_search_engine, args));
        SubLObject new_query = (SubLObject)SubLObjectFactory.makeBoolean(!query_id_string.isString());
        SubLObject query_id = (cb_qua.NIL == new_query) ? reader.read_from_string_ignoring_errors(query_id_string, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED) : qua_query.new_augmented_query(query_text, v_search_engine);
        SubLObject query = qua_query.get_augmented_query_for_id(query_id);
        if (cb_qua.NIL != qua_query.augmented_query_p(query) && query_text.equalp(qua_query.aq_original_phrase(query)) && !v_search_engine.eql(qua_query.get_aq_search_engine(query))) {
            qua_query.set_aq_search_engine(query, v_search_engine);
        }
        else if (cb_qua.NIL == qua_query.augmented_query_p(query) || !query_text.equalp(qua_query.aq_original_phrase(query))) {
            query_id = qua_query.new_augmented_query(query_text, v_search_engine);
            query = qua_query.get_augmented_query_for_id(query_id);
            new_query = (SubLObject)cb_qua.T;
        }
        if (cb_qua.NIL == new_query) {
            handle_disambiguation_info(query_id, args);
        }
        html_utilities.html_markup((SubLObject)cb_qua.$str13$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_qua.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_qua.$str14$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_qua.$kw15$UNINITIALIZED) ? ConsesLow.list(cb_qua.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_qua.$kw19$CB_CYC);
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            final SubLObject color_value = html_macros.$html_default_bgcolor$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_qua.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                if (cb_qua.NIL != color_value) {
                    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_value));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_qua.ZERO_INTEGER);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                        final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                final SubLObject image_src = Sequences.cconcatenate(system_parameters.$html_image_directory$.getDynamicValue(thread), cyc_file_dependencies.html_icon_src((SubLObject)cb_qua.$kw28$CYC_LOGO_LARGE_VIOLET_FULL_URL));
                                final SubLObject align = (SubLObject)cb_qua.$kw29$CENTER;
                                final SubLObject alt = (SubLObject)cb_qua.$str30$Cyc_Browser;
                                final SubLObject border = (SubLObject)cb_qua.ZERO_INTEGER;
                                html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                html_utilities.html_markup(image_src);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                if (cb_qua.NIL != alt) {
                                    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                    html_utilities.html_markup(alt);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                }
                                if (cb_qua.NIL != align) {
                                    html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align(align));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                }
                                if (cb_qua.NIL != border) {
                                    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                    html_utilities.html_markup(border);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_qua.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_qua.$str20$Cycorp_Query_Augmentation);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_qua.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_qua.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_qua.$str31$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    if (cb_qua.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_qua.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_qua.$str6$cb_qua_input, (SubLObject)cb_qua.T, (SubLObject)cb_qua.UNPROVIDED);
                        print_query_guts(query_text, v_search_engine);
                        print_disambiguation_info(query_id);
                        html_utilities.html_hidden_input((SubLObject)cb_qua.$str25$_id, query_id, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                        final SubLObject query_string = qua_query.get_search_string_for_query(query);
                        if (cb_qua.NIL != string_utilities.non_empty_stringP(query_string)) {
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_qua.$str32$Query_String__);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_princ(query_string);
                            html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_princ(qua_query.get_augmented_query_url(query, (SubLObject)cb_qua.UNPROVIDED));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_qua.$str8$quaoutput);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                html_utilities.html_princ((SubLObject)cb_qua.$str33$_Run_Query_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    print_addition_info(query_id);
                    html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_qua.NIL, thread);
                            html_utilities.html_princ((SubLObject)cb_qua.$str34$parent_quaoutput_location_href___);
                            html_utilities.html_princ(qua_query.get_augmented_query_url(query, (SubLObject)cb_qua.UNPROVIDED));
                            html_utilities.html_princ((SubLObject)cb_qua.$str35$__);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
                    if (cb_qua.NIL != new_query) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.NIL, thread);
                                html_utilities.html_princ((SubLObject)cb_qua.$str36$parent_quarawoutput_location_href);
                                html_utilities.html_princ(qua_query.get_raw_query_url(query, (SubLObject)cb_qua.UNPROVIDED));
                                html_utilities.html_princ((SubLObject)cb_qua.$str35$__);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                            }
                            html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
                    }
                    html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
        return (SubLObject)cb_qua.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 4538L)
    public static SubLObject print_addition_info(final SubLObject query_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = qua_query.get_augmented_query_for_id(query_id);
        final SubLObject terms = (SubLObject)((cb_qua.NIL != qua_query.augmented_query_p(query)) ? qua_query.aq_tokenizations(query).first() : cb_qua.NIL);
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_qua.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = (SubLObject)cb_qua.NIL;
            v_term = cdolist_list_var.first();
            while (cb_qua.NIL != cdolist_list_var) {
                final SubLObject specs = qua_query.aq_term_specs(v_term);
                final SubLObject v_genls = qua_query.aq_term_genls(v_term);
                final SubLObject related = qua_query.aq_term_related_terms(v_term);
                if (cb_qua.NIL != specs || cb_qua.NIL != v_genls || cb_qua.NIL != related) {
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_qua.$kw38$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                        html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_qua.THREE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                        cb_qua_show_term_in_nl(qua_query.aq_term_preferred_meaning(v_term));
                        html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_utilities.html_markup((SubLObject)cb_qua.THREE_INTEGER);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                        if (cb_qua.NIL != specs) {
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_qua.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_qua.$str39$Specializations_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                                        SubLObject cdolist_list_var_$20 = specs;
                                        SubLObject spec = (SubLObject)cb_qua.NIL;
                                        spec = cdolist_list_var_$20.first();
                                        while (cb_qua.NIL != cdolist_list_var_$20) {
                                            cb_qua_show_term_in_nl(spec);
                                            html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                                            cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                                            spec = cdolist_list_var_$20.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (cb_qua.NIL != v_genls) {
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_qua.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_qua.$str40$Generalizations_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                                        SubLObject cdolist_list_var_$21 = v_genls;
                                        SubLObject genl = (SubLObject)cb_qua.NIL;
                                        genl = cdolist_list_var_$21.first();
                                        while (cb_qua.NIL != cdolist_list_var_$21) {
                                            cb_qua_show_term_in_nl(genl);
                                            html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                                            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                            genl = cdolist_list_var_$21.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                        if (cb_qua.NIL != related) {
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_qua.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_qua.$str41$Related_terms_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                                        SubLObject cdolist_list_var_$22 = related;
                                        SubLObject related_item = (SubLObject)cb_qua.NIL;
                                        related_item = cdolist_list_var_$22.first();
                                        while (cb_qua.NIL != cdolist_list_var_$22) {
                                            cb_qua_show_term_in_nl(related_item);
                                            html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
                                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                            related_item = cdolist_list_var_$22.first();
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return (SubLObject)cb_qua.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6009L)
    public static SubLObject handle_disambiguation_info(final SubLObject query_id, final SubLObject args) {
        SubLObject cdolist_list_var;
        final SubLObject options = cdolist_list_var = qua_query.get_all_disambiguation_options(query_id);
        SubLObject option = (SubLObject)cb_qua.NIL;
        option = cdolist_list_var.first();
        while (cb_qua.NIL != cdolist_list_var) {
            final SubLObject option_id = option.first();
            final SubLObject option_id_string = print_high.princ_to_string(option_id);
            final SubLObject value = html_utilities.html_extract_input(option_id_string, args);
            final SubLObject accepted_option = cb_utilities.cb_guess_term(value, (SubLObject)cb_qua.UNPROVIDED);
            if (cb_qua.NIL != accepted_option) {
                final SubLObject changedP = qua_query.accept_disambiguation_option(query_id, option_id, accepted_option);
            }
            else {
                qua_query.reset_ambiguity(query_id, option_id);
            }
            cdolist_list_var = cdolist_list_var.rest();
            option = cdolist_list_var.first();
        }
        return query_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 6774L)
    public static SubLObject print_query_guts(SubLObject query_text, SubLObject v_search_engine) {
        if (query_text == cb_qua.UNPROVIDED) {
            query_text = (SubLObject)cb_qua.$str44$;
        }
        if (v_search_engine == cb_qua.UNPROVIDED) {
            v_search_engine = (SubLObject)cb_qua.NIL;
        }
        html_utilities.html_text_input((SubLObject)cb_qua.$str26$_query_text, query_text, (SubLObject)cb_qua.$int45$75);
        html_utilities.html_submit_input((SubLObject)cb_qua.$str46$New_Query, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_qua.$str47$Search_Engine__);
        html_utilities.html_create_dropdown_list((SubLObject)cb_qua.$str27$_search_engine, cb_qua.$qua_supported_search_engine_strings$.getGlobalValue(), cb_qua.$qua_supported_search_engines$.getGlobalValue(), (SubLObject)cb_qua.ONE_INTEGER, Sequences.position(v_search_engine, cb_qua.$qua_supported_search_engines$.getGlobalValue(), (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED), (SubLObject)cb_qua.$str48$onChange_javascript_this_form_sub);
        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
        return (SubLObject)cb_qua.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 7273L)
    public static SubLObject print_disambiguation_info(final SubLObject query_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disambig_options = qua_query.get_all_disambiguation_options(query_id);
        html_utilities.html_newline((SubLObject)cb_qua.UNPROVIDED);
        if (cb_qua.NIL != disambig_options) {
            html_utilities.html_princ((SubLObject)cb_qua.$str49$Query_Terms__);
        }
        SubLObject cdolist_list_var = disambig_options;
        SubLObject v_term = (SubLObject)cb_qua.NIL;
        v_term = cdolist_list_var.first();
        while (cb_qua.NIL != cdolist_list_var) {
            final SubLObject term_id_string = PrintLow.write_to_string(v_term.first(), cb_qua.EMPTY_SUBL_OBJECT_ARRAY);
            final SubLObject choices = v_term.rest();
            html_utilities.html_princ((SubLObject)cb_qua.$str50$__);
            if (cb_qua.NIL != list_utilities.lengthE(choices, (SubLObject)cb_qua.ONE_INTEGER, (SubLObject)cb_qua.UNPROVIDED)) {
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_qua.$str51$_A, choices.first().first());
            }
            else {
                html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_markup(term_id_string);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_select_size$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_qua.ONE_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)cb_qua.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_qua.$str48$onChange_javascript_this_form_sub);
                if (cb_qua.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                    SubLObject cdolist_list_var_$29 = choices;
                    SubLObject choice = (SubLObject)cb_qua.NIL;
                    choice = cdolist_list_var_$29.first();
                    while (cb_qua.NIL != cdolist_list_var_$29) {
                        final SubLObject choice_string = conses_high.second(choice);
                        final SubLObject choice_cycl = choice.first();
                        final SubLObject choice_identifier = cb_utilities.cb_term_identifier(choice_cycl);
                        final SubLObject dhtml_object_id = cb_make_qua_query_term_object_id(term_id_string, choice_identifier);
                        final SubLObject mouse_over = PrintLow.format((SubLObject)cb_qua.NIL, (SubLObject)cb_qua.$str52$setVisibility___A___inline__, dhtml_object_id);
                        final SubLObject mouse_out = PrintLow.format((SubLObject)cb_qua.NIL, (SubLObject)cb_qua.$str53$setVisibility___A___none__, dhtml_object_id);
                        html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                        if (cb_qua.NIL != choice_identifier) {
                            html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                            html_utilities.html_markup(choice_identifier);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(mouse_out);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(mouse_over);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                        final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                            html_utilities.html_princ(choice_string);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                        cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                        choice = cdolist_list_var_$29.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        cdolist_list_var = disambig_options;
        v_term = (SubLObject)cb_qua.NIL;
        v_term = cdolist_list_var.first();
        while (cb_qua.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$30;
            final SubLObject choice_lists = cdolist_list_var_$30 = v_term.rest();
            SubLObject choice2 = (SubLObject)cb_qua.NIL;
            choice2 = cdolist_list_var_$30.first();
            while (cb_qua.NIL != cdolist_list_var_$30) {
                SubLObject current;
                final SubLObject datum = current = choice2;
                SubLObject choice_cycl2 = (SubLObject)cb_qua.NIL;
                SubLObject choice_string2 = (SubLObject)cb_qua.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_qua.$list54);
                choice_cycl2 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_qua.$list54);
                choice_string2 = current.first();
                current = current.rest();
                if (cb_qua.NIL == current) {
                    final SubLObject dhtml_object_id2 = cb_make_qua_query_term_object_id(PrintLow.write_to_string(v_term.first(), cb_qua.EMPTY_SUBL_OBJECT_ARRAY), cb_utilities.cb_term_identifier(choice_cycl2));
                    dhtml_macros.dhtml_set_switched_visibility(dhtml_object_id2, (SubLObject)cb_qua.$kw55$INVISIBLE, (SubLObject)cb_qua.$kw56$TEXT);
                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                    if (cb_qua.NIL != dhtml_object_id2) {
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                        html_utilities.html_markup(dhtml_object_id2);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_qua.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_qua.UNPROVIDED);
                    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_qua.T, thread);
                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_qua.$str57$Synonyms__);
                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        html_utilities.html_princ(qua_query.qua_all_phrases_for_term_as_string_list(choice_cycl2));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_qua.UNPROVIDED);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_qua.$list54);
                }
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                choice2 = cdolist_list_var_$30.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)cb_qua.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 8879L)
    public static SubLObject cb_make_qua_query_term_object_id(final SubLObject query_id, final SubLObject term_id) {
        final SubLObject modified_term_id = term_id.isString() ? Sequences.cconcatenate(string_utilities.trim_sides(term_id, (SubLObject)Characters.CHAR_quotation), (SubLObject)cb_qua.$str58$_raw_string) : PrintLow.write_to_string(term_id, cb_qua.EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject usable_term_id = string_utilities.remove_substring(modified_term_id, (SubLObject)cb_qua.$str59$_);
        return PrintLow.format((SubLObject)cb_qua.NIL, (SubLObject)cb_qua.$str60$qua_query_term_id__A__A, query_id, usable_term_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-qua.lisp", position = 9238L)
    public static SubLObject cb_qua_show_term_in_nl(final SubLObject v_term) {
        return cb_utilities.cb_show_term_in_nl(v_term, (SubLObject)cb_qua.UNPROVIDED);
    }
    
    public static SubLObject declare_cb_qua_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_link_query_augmentation", "CB-LINK-QUERY-AUGMENTATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_qua_raw_output", "CB-QUA-RAW-OUTPUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_qua_output", "CB-QUA-OUTPUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_query_augmentation", "CB-QUERY-AUGMENTATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_qua_input", "CB-QUA-INPUT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "print_addition_info", "PRINT-ADDITION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "handle_disambiguation_info", "HANDLE-DISAMBIGUATION-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "print_query_guts", "PRINT-QUERY-GUTS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "print_disambiguation_info", "PRINT-DISAMBIGUATION-INFO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_make_qua_query_term_object_id", "CB-MAKE-QUA-QUERY-TERM-OBJECT-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_qua", "cb_qua_show_term_in_nl", "CB-QUA-SHOW-TERM-IN-NL", 1, 0, false);
        return (SubLObject)cb_qua.NIL;
    }
    
    public static SubLObject init_cb_qua_file() {
        cb_qua.$qua_supported_search_engine_strings$ = SubLFiles.defconstant("*QUA-SUPPORTED-SEARCH-ENGINE-STRINGS*", (SubLObject)cb_qua.$list42);
        cb_qua.$qua_supported_search_engines$ = SubLFiles.defconstant("*QUA-SUPPORTED-SEARCH-ENGINES*", (SubLObject)cb_qua.$list43);
        return (SubLObject)cb_qua.NIL;
    }
    
    public static SubLObject setup_cb_qua_file() {
        cb_utilities.setup_cb_link_method((SubLObject)cb_qua.$kw2$QUERY_AUGMENTATION, (SubLObject)cb_qua.$sym3$CB_LINK_QUERY_AUGMENTATION, (SubLObject)cb_qua.ONE_INTEGER);
        cb_utilities.register_cb_frame((SubLObject)cb_qua.$kw4$QUA_INPUT, (SubLObject)cb_qua.$str5$qua_input, (SubLObject)cb_qua.$str6$cb_qua_input, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
        cb_utilities.register_cb_frame((SubLObject)cb_qua.$kw7$QUA_OUTPUT, (SubLObject)cb_qua.$str8$quaoutput, (SubLObject)cb_qua.$str9$cb_qua_output, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
        cb_utilities.register_cb_frame((SubLObject)cb_qua.$kw10$QUA_RAW_OUTPUT, (SubLObject)cb_qua.$str11$quarawoutput, (SubLObject)cb_qua.$str12$cb_qua_raw_output, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED, (SubLObject)cb_qua.UNPROVIDED);
        html_macros.note_cgi_handler_function((SubLObject)cb_qua.$sym16$CB_QUA_RAW_OUTPUT, (SubLObject)cb_qua.$kw17$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_qua.$sym18$CB_QUA_OUTPUT, (SubLObject)cb_qua.$kw17$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_qua.$sym24$CB_QUERY_AUGMENTATION, (SubLObject)cb_qua.$kw17$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_qua.$sym37$CB_QUA_INPUT, (SubLObject)cb_qua.$kw17$HTML_HANDLER);
        return (SubLObject)cb_qua.NIL;
    }
    
    public void declareFunctions() {
        declare_cb_qua_file();
    }
    
    public void initializeVariables() {
        init_cb_qua_file();
    }
    
    public void runTopLevelForms() {
        setup_cb_qua_file();
    }
    
    static {
        me = (SubLFile)new cb_qua();
        cb_qua.$qua_supported_search_engine_strings$ = null;
        cb_qua.$qua_supported_search_engines$ = null;
        $str0$cb_query_augmentation = SubLObjectFactory.makeString("cb-query-augmentation");
        $kw1$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $kw2$QUERY_AUGMENTATION = SubLObjectFactory.makeKeyword("QUERY-AUGMENTATION");
        $sym3$CB_LINK_QUERY_AUGMENTATION = SubLObjectFactory.makeSymbol("CB-LINK-QUERY-AUGMENTATION");
        $kw4$QUA_INPUT = SubLObjectFactory.makeKeyword("QUA-INPUT");
        $str5$qua_input = SubLObjectFactory.makeString("qua-input");
        $str6$cb_qua_input = SubLObjectFactory.makeString("cb-qua-input");
        $kw7$QUA_OUTPUT = SubLObjectFactory.makeKeyword("QUA-OUTPUT");
        $str8$quaoutput = SubLObjectFactory.makeString("quaoutput");
        $str9$cb_qua_output = SubLObjectFactory.makeString("cb-qua-output");
        $kw10$QUA_RAW_OUTPUT = SubLObjectFactory.makeKeyword("QUA-RAW-OUTPUT");
        $str11$quarawoutput = SubLObjectFactory.makeString("quarawoutput");
        $str12$cb_qua_raw_output = SubLObjectFactory.makeString("cb-qua-raw-output");
        $str13$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str14$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw15$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym16$CB_QUA_RAW_OUTPUT = SubLObjectFactory.makeSymbol("CB-QUA-RAW-OUTPUT");
        $kw17$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym18$CB_QUA_OUTPUT = SubLObjectFactory.makeSymbol("CB-QUA-OUTPUT");
        $kw19$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str20$Cycorp_Query_Augmentation = SubLObjectFactory.makeString("Cycorp Query Augmentation");
        $str21$Cannot_have_a_FRAMESET_tag_inside = SubLObjectFactory.makeString("Cannot have a FRAMESET tag inside a BODY tag.");
        $str22$90__10_ = SubLObjectFactory.makeString("90%,10%");
        $str23$50__50_ = SubLObjectFactory.makeString("50%,50%");
        $sym24$CB_QUERY_AUGMENTATION = SubLObjectFactory.makeSymbol("CB-QUERY-AUGMENTATION");
        $str25$_id = SubLObjectFactory.makeString(":id");
        $str26$_query_text = SubLObjectFactory.makeString(":query-text");
        $str27$_search_engine = SubLObjectFactory.makeString(":search-engine");
        $kw28$CYC_LOGO_LARGE_VIOLET_FULL_URL = SubLObjectFactory.makeKeyword("CYC-LOGO-LARGE-VIOLET-FULL-URL");
        $kw29$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str30$Cyc_Browser = SubLObjectFactory.makeString("Cyc Browser");
        $str31$post = SubLObjectFactory.makeString("post");
        $str32$Query_String__ = SubLObjectFactory.makeString("Query String: ");
        $str33$_Run_Query_ = SubLObjectFactory.makeString("[Run Query]");
        $str34$parent_quaoutput_location_href___ = SubLObjectFactory.makeString("parent.quaoutput.location.href = '");
        $str35$__ = SubLObjectFactory.makeString("';");
        $str36$parent_quarawoutput_location_href = SubLObjectFactory.makeString("parent.quarawoutput.location.href = '");
        $sym37$CB_QUA_INPUT = SubLObjectFactory.makeSymbol("CB-QUA-INPUT");
        $kw38$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str39$Specializations_ = SubLObjectFactory.makeString("Specializations:");
        $str40$Generalizations_ = SubLObjectFactory.makeString("Generalizations:");
        $str41$Related_terms_ = SubLObjectFactory.makeString("Related terms:");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("AltaVista"), (SubLObject)SubLObjectFactory.makeString("Google"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALTAVISTA"), (SubLObject)SubLObjectFactory.makeKeyword("GOOGLE"));
        $str44$ = SubLObjectFactory.makeString("");
        $int45$75 = SubLObjectFactory.makeInteger(75);
        $str46$New_Query = SubLObjectFactory.makeString("New Query");
        $str47$Search_Engine__ = SubLObjectFactory.makeString("Search Engine: ");
        $str48$onChange_javascript_this_form_sub = SubLObjectFactory.makeString("onChange=javascript:this.form.submit();");
        $str49$Query_Terms__ = SubLObjectFactory.makeString("Query Terms: ");
        $str50$__ = SubLObjectFactory.makeString("  ");
        $str51$_A = SubLObjectFactory.makeString("~A");
        $str52$setVisibility___A___inline__ = SubLObjectFactory.makeString("setVisibility('~A','inline')");
        $str53$setVisibility___A___none__ = SubLObjectFactory.makeString("setVisibility('~A','none')");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHOICE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICE-STRING"));
        $kw55$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $kw56$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str57$Synonyms__ = SubLObjectFactory.makeString("Synonyms: ");
        $str58$_raw_string = SubLObjectFactory.makeString("-raw-string");
        $str59$_ = SubLObjectFactory.makeString(" ");
        $str60$qua_query_term_id__A__A = SubLObjectFactory.makeString("qua-query-term-id-~A-~A");
    }
}

/*

	Total time: 463 ms
	
*/