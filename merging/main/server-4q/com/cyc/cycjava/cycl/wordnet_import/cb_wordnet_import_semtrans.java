/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-WORDNET-IMPORT-SEMTRANS
 * source file: /cyc/top/cycl/wordnet-import/cb-wordnet-import-semtrans.lisp
 * created:     2019/07/03 17:38:13
 */
public final class cb_wordnet_import_semtrans extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_wordnet_import_semtrans();

 public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_semtrans";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$WordNet_Import___Review_Semtrans = makeString("WordNet Import - Review Semtrans");

    private static final SubLSymbol WNI_REVIEW_SEMTRANS = makeSymbol("WNI-REVIEW-SEMTRANS");

    private static final SubLSymbol WNI_REVIEW_SEMTRANS_INPUT = makeSymbol("WNI-REVIEW-SEMTRANS-INPUT");

    private static final SubLString $str5$_WordNet___Review_Semtrans_ = makeString("[WordNet - Review Semtrans]");

    private static final SubLString $str7$wni_review_semtrans = makeString("wni-review-semtrans");

    private static final SubLSymbol $WNI_REVIEW_SEMATRANS = makeKeyword("WNI-REVIEW-SEMATRANS");

    private static final SubLSymbol CB_LINK_WNI_REVIEW_SEMATRANS = makeSymbol("CB-LINK-WNI-REVIEW-SEMATRANS");

    private static final SubLString $str10$Review_the_Semantic_Translations_ = makeString("Review the Semantic Translations for the Term");

    private static final SubLString $str11$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str12$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str17$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str23$wni_review_semtrans_input = makeString("wni-review-semtrans-input");

    private static final SubLString $str24$cb_wordnet_import_semtrans = makeString("cb-wordnet-import-semtrans");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$back = makeString("back");

    private static final SubLString $$$Next = makeString("Next");

    private static final SubLString $$$next = makeString("next");

    // Definitions
    /**
     * Retrieves data and formats the page for WordNet
     * synset semantic translation assertions.  The expert user
     * navigates to the assertions for editing via ball icons.
     *
     * @param args;
     * 		ignored, but necessary for compatibility
     * @return nil
     */
    @LispMethod(comment = "Retrieves data and formats the page for WordNet\r\nsynset semantic translation assertions.  The expert user\r\nnavigates to the assertions for editing via ball icons.\r\n\r\n@param args;\r\n\t\tignored, but necessary for compatibility\r\n@return nil\nRetrieves data and formats the page for WordNet\nsynset semantic translation assertions.  The expert user\nnavigates to the assertions for editing via ball icons.")
    public static final SubLObject wni_review_semtrans_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt0$WordNet_Import___Review_Semtrans);
        } else {
            com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_semtrans.wni_review_semtrans_internal();
        }
        return NIL;
    }

    // Definitions
    /**
     * Retrieves data and formats the page for WordNet
     * synset semantic translation assertions.  The expert user
     * navigates to the assertions for editing via ball icons.
     *
     * @param args;
     * 		ignored, but necessary for compatibility
     * @return nil
     */
    @LispMethod(comment = "Retrieves data and formats the page for WordNet\r\nsynset semantic translation assertions.  The expert user\r\nnavigates to the assertions for editing via ball icons.\r\n\r\n@param args;\r\n\t\tignored, but necessary for compatibility\r\n@return nil\nRetrieves data and formats the page for WordNet\nsynset semantic translation assertions.  The expert user\nnavigates to the assertions for editing via ball icons.")
    public static SubLObject wni_review_semtrans(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str0$WordNet_Import___Review_Semtrans);
        } else {
            wni_review_semtrans_internal();
        }
        return NIL;
    }

    /**
     * Handles user that consists of button selections for Back and Next.
     *
     * @param args;
     * 		the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user that consists of button selections for Back and Next.\r\n\r\n@param args;\r\n\t\tthe button selected\r\n@return nil")
    public static final SubLObject wni_review_semtrans_input_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        return NIL;
    }

    /**
     * Handles user that consists of button selections for Back and Next.
     *
     * @param args;
     * 		the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user that consists of button selections for Back and Next.\r\n\r\n@param args;\r\n\t\tthe button selected\r\n@return nil")
    public static SubLObject wni_review_semtrans_input(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        return NIL;
    }

    /**
     *
     *
     * @param linktext;
     * 		a different link name if wanted.
     * @return nil
    Defines a CYC Browser link method called wni-review-semtrans
     */
    @LispMethod(comment = "@param linktext;\r\n\t\ta different link name if wanted.\r\n@return nil\r\nDefines a CYC Browser link method called wni-review-semtrans")
    public static final SubLObject cb_link_wni_review_sematrans_alt(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt4$_WordNet___Review_Semtrans_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                html_princ($str_alt6$wni_review_semtrans);
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param linktext;
     * 		a different link name if wanted.
     * @return nil
    Defines a CYC Browser link method called wni-review-semtrans
     */
    @LispMethod(comment = "@param linktext;\r\n\t\ta different link name if wanted.\r\n@return nil\r\nDefines a CYC Browser link method called wni-review-semtrans")
    public static SubLObject cb_link_wni_review_sematrans(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str5$_WordNet___Review_Semtrans_;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str7$wni_review_semtrans);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    /**
     * Create the web page for reviewing the semantic translation assertions for the synset.
     */
    @LispMethod(comment = "Create the web page for reviewing the semantic translation assertions for the synset.")
    public static final SubLObject wni_review_semtrans_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject title_var = $str_alt9$Review_the_Semantic_Translations_;
                {
                    SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                    try {
                        html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? ((SubLObject) (html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                            try {
                                html_macros.$html_inside_bodyP$.bind(T, thread);
                                html_markup(html_macros.$html_body_head$.getGlobalValue());
                                if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                    html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                if (true) {
                                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str_alt12$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        if (NIL != title_var) {
                                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            html_princ(title_var);
                                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                            html_markup(TWO_INTEGER);
                                            html_char(CHAR_greater, UNPROVIDED);
                                        }
                                        {
                                            SubLObject frame_name_var = cb_frame_name(NIL);
                                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
                                                html_markup(html_macros.$html_form_method$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(html_macros.$html_form_method_post$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            if (NIL != frame_name_var) {
                                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                                html_char(CHAR_quotation, UNPROVIDED);
                                                html_markup(frame_name_var);
                                                html_char(CHAR_quotation, UNPROVIDED);
                                            }
                                            html_char(CHAR_greater, UNPROVIDED);
                                            {
                                                SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_macros.$within_html_form$.bind(T, thread);
                                                    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                                    html_hidden_input($str_alt13$wni_review_semtrans_input, T, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    cb_help_preamble($str_alt14$cb_wordnet_import_semtrans, UNPROVIDED, UNPROVIDED);
                                                    html_indent(TWO_INTEGER);
                                                    html_submit_input($$$Back, $$$back, UNPROVIDED);
                                                    html_indent(TWO_INTEGER);
                                                    html_submit_input($$$Next, $$$next, UNPROVIDED);
                                                    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                                                } finally {
                                                    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
                                                    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                                                }
                                            }
                                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                                        }
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * Create the web page for reviewing the semantic translation assertions for the synset.
     */
    @LispMethod(comment = "Create the web page for reviewing the semantic translation assertions for the synset.")
    public static SubLObject wni_review_semtrans_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str10$Review_the_Semantic_Translations_;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str11$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str12$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str17$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str23$wni_review_semtrans_input, T, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_help_preamble($str24$cb_wordnet_import_semtrans, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_submit_input($$$Back, $$$back, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_submit_input($$$Next, $$$next, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$WordNet_Import___Review_Semtrans = makeString("WordNet Import - Review Semtrans");

    public static SubLObject declare_cb_wordnet_import_semtrans_file() {
        declareFunction("wni_review_semtrans", "WNI-REVIEW-SEMTRANS", 0, 1, false);
        declareFunction("wni_review_semtrans_input", "WNI-REVIEW-SEMTRANS-INPUT", 1, 0, false);
        declareFunction("cb_link_wni_review_sematrans", "CB-LINK-WNI-REVIEW-SEMATRANS", 0, 1, false);
        declareFunction("wni_review_semtrans_internal", "WNI-REVIEW-SEMTRANS-INTERNAL", 0, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt4$_WordNet___Review_Semtrans_ = makeString("[WordNet - Review Semtrans]");

    static private final SubLString $str_alt6$wni_review_semtrans = makeString("wni-review-semtrans");

    public static SubLObject init_cb_wordnet_import_semtrans_file() {
        return NIL;
    }

    static private final SubLString $str_alt9$Review_the_Semantic_Translations_ = makeString("Review the Semantic Translations for the Term");

    public static final SubLObject setup_cb_wordnet_import_semtrans_file_alt() {
        html_macros.note_html_handler_function(WNI_REVIEW_SEMTRANS);
        html_macros.note_html_handler_function(WNI_REVIEW_SEMTRANS_INPUT);
        setup_cb_link_method($WNI_REVIEW_SEMATRANS, CB_LINK_WNI_REVIEW_SEMATRANS, ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_semtrans_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(WNI_REVIEW_SEMTRANS, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(WNI_REVIEW_SEMTRANS_INPUT, $HTML_HANDLER);
            setup_cb_link_method($WNI_REVIEW_SEMATRANS, CB_LINK_WNI_REVIEW_SEMATRANS, ONE_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(WNI_REVIEW_SEMTRANS);
            html_macros.note_html_handler_function(WNI_REVIEW_SEMTRANS_INPUT);
        }
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_semtrans_file_Previous() {
        html_macros.note_cgi_handler_function(WNI_REVIEW_SEMTRANS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_REVIEW_SEMTRANS_INPUT, $HTML_HANDLER);
        setup_cb_link_method($WNI_REVIEW_SEMATRANS, CB_LINK_WNI_REVIEW_SEMATRANS, ONE_INTEGER);
        return NIL;
    }

    static private final SubLString $str_alt11$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt12$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt13$wni_review_semtrans_input = makeString("wni-review-semtrans-input");

    static private final SubLString $str_alt14$cb_wordnet_import_semtrans = makeString("cb-wordnet-import-semtrans");

    @Override
    public void declareFunctions() {
        declare_cb_wordnet_import_semtrans_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_wordnet_import_semtrans_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_wordnet_import_semtrans_file();
    }

    
}

/**
 * Total time: 139 ms
 */
