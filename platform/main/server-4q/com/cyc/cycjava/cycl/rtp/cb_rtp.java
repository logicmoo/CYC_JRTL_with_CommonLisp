package com.cyc.cycjava.cycl.rtp;


import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.cb_assertion_browser;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.parsing_vars;
import com.cyc.cycjava.cycl.rkf_concept_harvester;
import com.cyc.cycjava.cycl.rtp.cb_rtp;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.rtp.cb_rtp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_rtp extends SubLTranslatedFile {
    public static final SubLFile me = new cb_rtp();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.cb_rtp";

    public static final String myFingerPrint = "33b5039b95efa1c7a45334076fa002986c44c703488c3d7b25e2817bede20653";

    // Internal Constants
    public static final SubLString $$$Template_Matching_Tool = makeString("Template Matching Tool");

    private static final SubLString $str1$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str2$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str7$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str13$cb_handle_template_matching = makeString("cb-handle-template-matching");

    private static final SubLString $$$Search = makeString("Search");

    private static final SubLString $str15$Mt_ = makeString("Mt:");

    private static final SubLString $$$mt = makeString("mt");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLString $$$AnthraxTemplateMt = makeString("AnthraxTemplateMt");

    private static final SubLString $str20$Template_Category___ = makeString("Template Category : ");

    private static final SubLString $$$category = makeString("category");

    private static final SubLString $str22$ = makeString("");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $str24$Template_terminal___ = makeString("Template terminal : ");

    private static final SubLString $$$term = makeString("term");

    private static final SubLSymbol CB_TEMPLATE_MATCHING = makeSymbol("CB-TEMPLATE-MATCHING");



    private static final SubLObject $$LinguisticObjectType = reader_make_constant_shell(makeString("LinguisticObjectType"));

    private static final SubLString $$$Template_Match_Results = makeString("Template Match Results");

    private static final SubLString $str30$Sorry__no_templates_of_category_ = makeString("Sorry, no templates of category ");

    private static final SubLString $$$_contains_terminal_ = makeString(" contains terminal ");

    private static final SubLString $str32$The_following_templates_of_catego = makeString("The following templates of category ");

    private static final SubLString $$$_contain_the_terminal_ = makeString(" contain the terminal ");

    private static final SubLString $str34$Sorry__ = makeString("Sorry, ");

    private static final SubLString $str35$_is_an_unknown_template_category_ = makeString(" is an unknown template category.");

    private static final SubLString $str36$Please_enter_a_different_term___c = makeString("Please enter a different term / category combination.");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_MATCHING = makeSymbol("CB-HANDLE-TEMPLATE-MATCHING");

    private static final SubLString $$$TemplateMatch = makeString("TemplateMatch");



    private static final SubLString $str40$cb_template_matching = makeString("cb-template-matching");



    private static final SubLSymbol CB_LINK_TEMPLATE_MATCHING = makeSymbol("CB-LINK-TEMPLATE-MATCHING");

    private static final SubLString $$$Template_Match = makeString("Template Match");

    private static final SubLString $$$TmpltM = makeString("TmpltM");

    private static final SubLString $$$Template_by_Term_Matcher = makeString("Template by Term Matcher");

    private static final SubLString $$$Template_Parsing_Tool = makeString("Template Parsing Tool");

    private static final SubLString $str47$cb_handle_template_parsing = makeString("cb-handle-template-parsing");

    private static final SubLString $$$Parse = makeString("Parse");

    private static final SubLString $str49$Use_VP_Parser__ = makeString("Use VP-Parser: ");

    private static final SubLString $$$vpp = makeString("vpp");

    private static final SubLString $str51$_vpp = makeString(":vpp");

    private static final SubLString $str52$Return_Style__ = makeString("Return Style: ");

    private static final SubLString $str53$return_style = makeString("return-style");

    private static final SubLString $str54$_simple = makeString(":simple");

    private static final SubLString $$$Normal = makeString("Normal");

    private static final SubLString $str56$_assertion = makeString(":assertion");

    private static final SubLString $$$Assertion = makeString("Assertion");

    private static final SubLString $str58$Store_results_in_pipeline__ = makeString("Store results in pipeline: ");

    private static final SubLString $str59$store_in_pipeline = makeString("store-in-pipeline");

    private static final SubLString $str60$_pipeline = makeString(":pipeline");

    private static final SubLString $str61$Sentence_ = makeString("Sentence:");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$STemplate = makeString("STemplate");

    private static final SubLString $$$RKFParsingMt = makeString("RKFParsingMt");

    private static final SubLSymbol CB_TEMPLATE_PARSING = makeSymbol("CB-TEMPLATE-PARSING");

    private static final SubLString $$$Template_Parse_Results = makeString("Template Parse Results");

    private static final SubLString $str68$Sorry__no_parses_for_ = makeString("Sorry, no parses for ");

    private static final SubLString $$$_of_category_ = makeString(" of category ");

    private static final SubLString $str70$_were_found_ = makeString(" were found.");

    private static final SubLString $str71$Sentence_parsed___S = makeString("Sentence parsed: ~S");

    private static final SubLString $str72$Root_category_of_parses__ = makeString("Root category of parses: ");

    private static final SubLString $str73$__Sorry___S_is_an_unknown_templat = makeString("~%Sorry, ~S is an unknown template category.~%");

    private static final SubLString $str74$Please_enter_a_different_sentence = makeString("Please enter a different sentence / category combination.");

    private static final SubLSymbol CB_HANDLE_TEMPLATE_PARSING = makeSymbol("CB-HANDLE-TEMPLATE-PARSING");







    private static final SubLString $str79$Parses_for__s__spanning__A_ = makeString("Parses for ~s, spanning ~A ");

    private static final SubLString $$$CycL = makeString("CycL");

    private static final SubLString $$$Supports = makeString("Supports");





    private static final SubLString $$$Component_Parser_parses_for_ = makeString("Component Parser parses for ");

    private static final SubLString $$$TemplateParsing = makeString("TemplateParsing");

    private static final SubLString $str86$cb_template_parsing = makeString("cb-template-parsing");



    private static final SubLSymbol CB_LINK_TEMPLATE_PARSING = makeSymbol("CB-LINK-TEMPLATE-PARSING");

    private static final SubLString $$$Template_Parse = makeString("Template Parse");

    private static final SubLString $$$RTP = makeString("RTP");

    private static final SubLString $$$Parsing_via_template_parser = makeString("Parsing via template parser");

    public static SubLObject cb_template_matching(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Template_Matching_Tool;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
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
                    html_markup($str7$yui_skin_sam);
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
                            html_hidden_input($str13$cb_handle_template_matching, T, UNPROVIDED);
                            html_submit_input($$$Search, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str15$Mt_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$mt, UNPROVIDED, UNPROVIDED);
                            html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$mt, $$$AnthraxTemplateMt, TWENTY_INTEGER);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str20$Template_Category___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$category, UNPROVIDED, UNPROVIDED);
                            html_complete.html_complete_button($$$category, $$$Complete, template_isa_filter_col(), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$category, $str22$, $int$40);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str24$Template_terminal___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$term, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$term, $str22$, $int$40);
                            html_newline(UNPROVIDED);
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

    public static SubLObject template_isa_filter_col() {
        return $$LinguisticObjectType;
    }

    public static SubLObject cb_handle_template_matching(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_term = html_extract_input($$$term, args);
        final SubLObject category_arg = html_extract_input($$$category, args);
        SubLObject mt = html_extract_input($$$mt, args);
        SubLObject category = NIL;
        mt = constants_high.find_constant(mt);
        category = constants_high.find_constant(category_arg);
        final SubLObject title_var = $$$Template_Match_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$6 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$7 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str7$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_newline(UNPROVIDED);
                            if (NIL != forts.fort_p(category)) {
                                final SubLObject templates = rtp_datastructures.get_templates_for_terminal(mt, category, v_term);
                                if (NIL == templates) {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_newline(TWO_INTEGER);
                                    html_princ($str30$Sorry__no_templates_of_category_);
                                    cb_form(category, UNPROVIDED, UNPROVIDED);
                                    html_princ($$$_contains_terminal_);
                                    html_prin1(v_term);
                                    html_newline(TWO_INTEGER);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                } else {
                                    html_princ($str32$The_following_templates_of_catego);
                                    cb_form(category, UNPROVIDED, UNPROVIDED);
                                    html_princ($$$_contain_the_terminal_);
                                    html_prin1(v_term);
                                    html_newline(TWO_INTEGER);
                                    SubLObject cdolist_list_var = templates;
                                    SubLObject template = NIL;
                                    template = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        html_newline(UNPROVIDED);
                                        cb_assertion_browser.cb_show_support(rtp_datastructures.template_rule_assertion(template), UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        template = cdolist_list_var.first();
                                    } 
                                }
                            } else {
                                html_newline(UNPROVIDED);
                                html_princ($str34$Sorry__);
                                html_prin1(category);
                                html_princ($str35$_is_an_unknown_template_category_);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str36$Please_enter_a_different_term___c);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$7, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$6, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_template_matching(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$TemplateMatch;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str40$cb_template_matching);
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

    public static SubLObject cb_template_parsing(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Template_Parsing_Tool;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                html_complete.html_complete_script();
                cyc_file_dependencies.css($SAM_AUTOCOMPLETE_CSS);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str7$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
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
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str47$cb_handle_template_parsing, T, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Parse, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_princ($str49$Use_VP_Parser__);
                            html_checkbox_input($$$vpp, $str51$_vpp, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_princ($str52$Return_Style__);
                            html_radio_input($str53$return_style, $str54$_simple, NIL, UNPROVIDED);
                            html_princ($$$Normal);
                            html_radio_input($str53$return_style, $str56$_assertion, T, UNPROVIDED);
                            html_princ($$$Assertion);
                            html_newline(UNPROVIDED);
                            html_princ($str58$Store_results_in_pipeline__);
                            html_checkbox_input($str59$store_in_pipeline, $str60$_pipeline, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str61$Sentence_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$sentence, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$sentence, $str22$, $int$80);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str20$Template_Category___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$category, UNPROVIDED, UNPROVIDED);
                            html_complete.html_complete_button($$$category, $$$Complete, template_isa_filter_col(), NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$category, $$$STemplate, $int$40);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str15$Mt_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_script_utilities.html_clear_input_button($$$mt, UNPROVIDED, UNPROVIDED);
                            html_complete.html_complete_button($$$mt, $$$Complete, $$Microtheory, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_text_input($$$mt, $$$RKFParsingMt, TWENTY_INTEGER);
                            html_newline(UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$12, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$11, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_handle_template_parsing(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = html_extract_input($$$sentence, args);
        final SubLObject category_arg = html_extract_input($$$category, args);
        SubLObject mt = html_extract_input($$$mt, args);
        final SubLObject vpp = html_extract_input($$$vpp, args);
        final SubLObject pipelineP = html_extract_input($str59$store_in_pipeline, args);
        final SubLObject return_style = read_from_string(html_extract_input($str53$return_style, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject category = NIL;
        SubLObject parses = NIL;
        mt = constants_high.find_constant(mt);
        category = constants_high.find_constant(category_arg);
        final SubLObject title_var = $$$Template_Parse_Results;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str1$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str2$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$16 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$17 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str7$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
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
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_newline(UNPROVIDED);
                            if (NIL != forts.fort_p(category)) {
                                final SubLObject _prev_bind_0_$21 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = rtp_vars.$rtp_return_style$.currentBinding(thread);
                                try {
                                    parsing_vars.$perform_vp_parser_expansion$.bind(vpp, thread);
                                    rtp_vars.$rtp_return_style$.bind(return_style, thread);
                                    parses = iterative_template_parser.rtp_parse_exp(sentence, category, mt, UNPROVIDED);
                                    if (NIL == parses) {
                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                        html_newline(TWO_INTEGER);
                                        html_princ($str68$Sorry__no_parses_for_);
                                        cb_form(sentence, UNPROVIDED, UNPROVIDED);
                                        html_princ($$$_of_category_);
                                        cb_form(category, UNPROVIDED, UNPROVIDED);
                                        html_princ($str70$_were_found_);
                                        html_newline(TWO_INTEGER);
                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    } else {
                                        html_princ(format(NIL, $str71$Sentence_parsed___S, sentence));
                                        html_newline(UNPROVIDED);
                                        html_princ($str72$Root_category_of_parses__);
                                        cb_form(category, UNPROVIDED, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        format_parses_for_browser(parses, return_style, sentence);
                                        html_newline(TWO_INTEGER);
                                    }
                                } finally {
                                    rtp_vars.$rtp_return_style$.rebind(_prev_bind_1_$22, thread);
                                    parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0_$21, thread);
                                }
                            } else {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str73$__Sorry___S_is_an_unknown_templat, category);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str74$Please_enter_a_different_sentence);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$17, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$16, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject format_parses_for_browser(final SubLObject parses, final SubLObject return_style, SubLObject sentence) {
        if (sentence == UNPROVIDED) {
            sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (return_style != $ASSERTION) {
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            cb_form(parses, ZERO_INTEGER, T);
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
            return $DONE;
        }
        final SubLObject result_iterator = rtp_iterators.new_itp_result_iterator(parses, UNPROVIDED, UNPROVIDED);
        final SubLObject tokenized_sentence = rkf_concept_harvester.rkf_ch_string_tokenize(sentence);
        SubLObject section_iterator = NIL;
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            while (NIL == rtp_iterators.itp_result_iterator_doneP(result_iterator)) {
                section_iterator = rtp_iterators.itp_result_iterator_curr(result_iterator);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != html_macros.$html_color_yellowish_gray$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_yellowish_gray$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject span = rtp_iterators.itp_section_iterator_curr_span(section_iterator);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ(format(NIL, $str79$Parses_for__s__spanning__A_, string_utilities.bunge(subseq(tokenized_sentence, span.first(), add(ONE_INTEGER, last(span, UNPROVIDED).first())), UNPROVIDED), span));
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
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
                if (NIL != html_macros.$html_color_lighter_grey$.getGlobalValue()) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_color_lighter_grey$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$CycL);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($$$Supports);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    while (NIL == rtp_iterators.itp_section_iterator_doneP(section_iterator)) {
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_form(rtp_iterators.itp_section_iterator_curr_cycl(section_iterator), ZERO_INTEGER, T);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_simple_attribute(html_macros.$html_table_data_nowrap$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                format_assertions_from_section(section_iterator);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        rtp_iterators.itp_section_iterator_next(section_iterator);
                    } 
                    rtp_iterators.itp_result_iterator_next(result_iterator);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return $DONE;
    }

    public static SubLObject format_assertions_from_section(final SubLObject section_iterator) {
        final SubLObject asserts = rtp_iterators.itp_section_iterator_curr_assertion(section_iterator);
        if (asserts.isAtom()) {
            cb_form(asserts, ZERO_INTEGER, T);
            return $DONE;
        }
        if (asserts.isList()) {
            SubLObject cdolist_list_var = asserts;
            SubLObject v_assert = NIL;
            v_assert = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == assertion_handles.assertion_p(v_assert)) {
                    html_princ($$$Component_Parser_parses_for_);
                }
                cb_form(v_assert, ZERO_INTEGER, T);
                html_newline(ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                v_assert = cdolist_list_var.first();
            } 
            return $DONE;
        }
        return NIL;
    }

    public static SubLObject cb_link_template_parsing(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$TemplateParsing;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str86$cb_template_parsing);
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

    public static SubLObject declare_cb_rtp_file() {
        declareFunction(me, "cb_template_matching", "CB-TEMPLATE-MATCHING", 0, 1, false);
        declareFunction(me, "template_isa_filter_col", "TEMPLATE-ISA-FILTER-COL", 0, 0, false);
        declareFunction(me, "cb_handle_template_matching", "CB-HANDLE-TEMPLATE-MATCHING", 1, 0, false);
        declareFunction(me, "cb_link_template_matching", "CB-LINK-TEMPLATE-MATCHING", 0, 1, false);
        declareFunction(me, "cb_template_parsing", "CB-TEMPLATE-PARSING", 0, 1, false);
        declareFunction(me, "cb_handle_template_parsing", "CB-HANDLE-TEMPLATE-PARSING", 1, 0, false);
        declareFunction(me, "format_parses_for_browser", "FORMAT-PARSES-FOR-BROWSER", 2, 1, false);
        declareFunction(me, "format_assertions_from_section", "FORMAT-ASSERTIONS-FROM-SECTION", 1, 0, false);
        declareFunction(me, "cb_link_template_parsing", "CB-LINK-TEMPLATE-PARSING", 0, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_rtp_file() {
        return NIL;
    }

    public static SubLObject setup_cb_rtp_file() {
        html_macros.note_cgi_handler_function(CB_TEMPLATE_MATCHING, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_MATCHING, $HTML_HANDLER);
        setup_cb_link_method($TEMPLATE_MATCHING, CB_LINK_TEMPLATE_MATCHING, ONE_INTEGER);
        declare_deprecated_cb_tool($TEMPLATE_MATCHING, $$$Template_Match, $$$TmpltM, $$$Template_by_Term_Matcher);
        html_macros.note_cgi_handler_function(CB_TEMPLATE_PARSING, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TEMPLATE_PARSING, $HTML_HANDLER);
        setup_cb_link_method($TEMPLATE_PARSING, CB_LINK_TEMPLATE_PARSING, ONE_INTEGER);
        declare_deprecated_cb_tool($TEMPLATE_PARSING, $$$Template_Parse, $$$RTP, $$$Parsing_via_template_parser);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_rtp_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_rtp_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_rtp_file();
    }

    static {





























































































    }
}

/**
 * Total time: 398 ms
 */
