package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_import_fact_slots extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_fact_slots";
    public static final String myFingerPrint = "871912a33e067ea8a8498cdbc835401df8458056fbf280248f87831171472729";
    private static final SubLString $str0$WordNet_Import___Actor_Fact_Slots;
    private static final SubLSymbol $sym1$WNI_REVIEW_FACT_SLOTS;
    private static final SubLSymbol $kw2$HTML_HANDLER;
    private static final SubLSymbol $sym3$LISTP;
    private static final SubLSymbol $sym4$WNI_REVIEW_FACT_SLOTS_INPUT;
    private static final SubLString $str5$Review_the_Role_and_Fact_Predicat;
    private static final SubLString $str6$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str7$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw8$UNINITIALIZED;
    private static final SubLSymbol $kw9$CB_CYC;
    private static final SubLSymbol $kw10$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw11$SHA1;
    private static final SubLString $str12$yui_skin_sam;
    private static final SubLString $str13$reloadFrameButton;
    private static final SubLString $str14$button;
    private static final SubLString $str15$reload;
    private static final SubLString $str16$Refresh_Frames;
    private static final SubLString $str17$post;
    private static final SubLString $str18$wni_review_fact_slots_input;
    private static final SubLString $str19$cb_wordnet_import_fact_slots;
    private static final SubLString $str20$Back;
    private static final SubLString $str21$back;
    private static final SubLString $str22$Submit;
    private static final SubLString $str23$submit;
    private static final SubLString $str24$Next;
    private static final SubLString $str25$next;
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-fact-slots.lisp", position = 1025L)
    public static SubLObject wni_review_fact_slots(SubLObject args) {
        if (args == cb_wordnet_import_fact_slots.UNPROVIDED) {
            args = (SubLObject)cb_wordnet_import_fact_slots.NIL;
        }
        if (cb_wordnet_import_fact_slots.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_wordnet_import_fact_slots.$str0$WordNet_Import___Actor_Fact_Slots);
        }
        else {
            wni_review_fact_slots_internal();
        }
        return (SubLObject)cb_wordnet_import_fact_slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-fact-slots.lisp", position = 1646L)
    public static SubLObject wni_review_fact_slots_input(final SubLObject args) {
        assert cb_wordnet_import_fact_slots.NIL != Types.listp(args) : args;
        return (SubLObject)cb_wordnet_import_fact_slots.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-import-fact-slots.lisp", position = 2026L)
    public static SubLObject wni_review_fact_slots_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = (SubLObject)cb_wordnet_import_fact_slots.$str5$Review_the_Role_and_Fact_Predicat;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_wordnet_import_fact_slots.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str6$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_wordnet_import_fact_slots.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str7$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_wordnet_import_fact_slots.$kw8$UNINITIALIZED) ? ConsesLow.list(cb_wordnet_import_fact_slots.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_wordnet_import_fact_slots.$kw9$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_wordnet_import_fact_slots.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_wordnet_import_fact_slots.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_wordnet_import_fact_slots.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str12$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_import_fact_slots.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str13$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_import_fact_slots.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str14$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str15$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_wordnet_import_fact_slots.$str16$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            if (cb_wordnet_import_fact_slots.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_wordnet_import_fact_slots.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_wordnet_import_fact_slots.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_wordnet_import_fact_slots.$str17$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        if (cb_wordnet_import_fact_slots.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_import_fact_slots.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_wordnet_import_fact_slots.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_wordnet_import_fact_slots.$str18$wni_review_fact_slots_input, (SubLObject)cb_wordnet_import_fact_slots.T, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_wordnet_import_fact_slots.$str19$cb_wordnet_import_fact_slots, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_wordnet_import_fact_slots.TWO_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_wordnet_import_fact_slots.$str20$Back, (SubLObject)cb_wordnet_import_fact_slots.$str21$back, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_wordnet_import_fact_slots.TWO_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_wordnet_import_fact_slots.$str22$Submit, (SubLObject)cb_wordnet_import_fact_slots.$str23$submit, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_wordnet_import_fact_slots.TWO_INTEGER);
                            html_utilities.html_submit_input((SubLObject)cb_wordnet_import_fact_slots.$str24$Next, (SubLObject)cb_wordnet_import_fact_slots.$str25$next, (SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_import_fact_slots.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_wordnet_import_fact_slots.NIL;
    }
    
    public static SubLObject declare_cb_wordnet_import_fact_slots_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_fact_slots", "wni_review_fact_slots", "WNI-REVIEW-FACT-SLOTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_fact_slots", "wni_review_fact_slots_input", "WNI-REVIEW-FACT-SLOTS-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_fact_slots", "wni_review_fact_slots_internal", "WNI-REVIEW-FACT-SLOTS-INTERNAL", 0, 0, false);
        return (SubLObject)cb_wordnet_import_fact_slots.NIL;
    }
    
    public static SubLObject init_cb_wordnet_import_fact_slots_file() {
        return (SubLObject)cb_wordnet_import_fact_slots.NIL;
    }
    
    public static SubLObject setup_cb_wordnet_import_fact_slots_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_wordnet_import_fact_slots.$sym1$WNI_REVIEW_FACT_SLOTS, (SubLObject)cb_wordnet_import_fact_slots.$kw2$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_wordnet_import_fact_slots.$sym4$WNI_REVIEW_FACT_SLOTS_INPUT, (SubLObject)cb_wordnet_import_fact_slots.$kw2$HTML_HANDLER);
        return (SubLObject)cb_wordnet_import_fact_slots.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_wordnet_import_fact_slots_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_wordnet_import_fact_slots_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_wordnet_import_fact_slots_file();
    }
    
    static {
        me = (SubLFile)new cb_wordnet_import_fact_slots();
        $str0$WordNet_Import___Actor_Fact_Slots = SubLObjectFactory.makeString("WordNet Import - Actor/Fact Slots");
        $sym1$WNI_REVIEW_FACT_SLOTS = SubLObjectFactory.makeSymbol("WNI-REVIEW-FACT-SLOTS");
        $kw2$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym3$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym4$WNI_REVIEW_FACT_SLOTS_INPUT = SubLObjectFactory.makeSymbol("WNI-REVIEW-FACT-SLOTS-INPUT");
        $str5$Review_the_Role_and_Fact_Predicat = SubLObjectFactory.makeString("Review the Role and Fact Predicates for the Term");
        $str6$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str7$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw8$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw9$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw10$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw11$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str12$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str13$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str14$button = SubLObjectFactory.makeString("button");
        $str15$reload = SubLObjectFactory.makeString("reload");
        $str16$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str17$post = SubLObjectFactory.makeString("post");
        $str18$wni_review_fact_slots_input = SubLObjectFactory.makeString("wni-review-fact-slots-input");
        $str19$cb_wordnet_import_fact_slots = SubLObjectFactory.makeString("cb-wordnet-import-fact-slots");
        $str20$Back = SubLObjectFactory.makeString("Back");
        $str21$back = SubLObjectFactory.makeString("back");
        $str22$Submit = SubLObjectFactory.makeString("Submit");
        $str23$submit = SubLObjectFactory.makeString("submit");
        $str24$Next = SubLObjectFactory.makeString("Next");
        $str25$next = SubLObjectFactory.makeString("next");
    }
}

/*

	Total time: 126 ms
	
*/