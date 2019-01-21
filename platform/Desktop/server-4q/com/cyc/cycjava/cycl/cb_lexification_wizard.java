package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
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

public final class cb_lexification_wizard extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_lexification_wizard";
    public static final String myFingerPrint = "b984ac18e9df545bd01b85a95f9491a8d67884254d33377d24dcace5b777b7a0";
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 2143L)
    private static SubLSymbol $skipped_lexwiz_terms$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 2378L)
    public static SubLSymbol $streamlined_lexwizP$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 52337L)
    private static SubLSymbol $known_lexified_terms$;
    private static final SubLSymbol $sym0$_SKIPPED_LEXWIZ_TERMS_;
    private static final SubLSymbol $sym1$_STREAMLINED_LEXWIZ__;
    private static final SubLString $str2$lexification_wizard;
    private static final SubLSymbol $kw3$MAIN;
    private static final SubLString $str4$cb_invoke_oe_lexification_wizard;
    private static final SubLSymbol $kw5$LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym6$CB_LINK_LEXIFICATION_WIZARD;
    private static final SubLSymbol $kw7$LEXWIZ;
    private static final SubLString $str8$lexwiz_html;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PIF;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$HTML_FONT_COLOR;
    private static final SubLSymbol $sym13$PROGN;
    private static final SubLString $str14$the_Lexification_Assistant;
    private static final SubLString $str15$_id;
    private static final SubLString $str16$;
    private static final SubLString $str17$color_gray;
    private static final SubLString $str18$Cycorp_Lexification_Assistant;
    private static final SubLString $str19$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str20$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw21$UNINITIALIZED;
    private static final SubLSymbol $kw22$CB_CYC;
    private static final SubLSymbol $kw23$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw24$SHA1;
    private static final SubLString $str25$yui_skin_sam;
    private static final SubLString $str26$reloadFrameButton;
    private static final SubLString $str27$button;
    private static final SubLString $str28$reload;
    private static final SubLString $str29$Refresh_Frames;
    private static final SubLString $str30$post;
    private static final SubLString $str31$cb_handle_oe_lexification_wizard;
    private static final SubLString $str32$_Specify_the_parameters_needed_fo;
    private static final SubLString $str33$Reset_All;
    private static final SubLString $str34$_reset;
    private static final SubLString $str35$lexwiz_main_params;
    private static final SubLString $str36$basic_info;
    private static final SubLString $str37$Basic_Information___;
    private static final SubLSymbol $kw38$VISIBLE;
    private static final SubLSymbol $kw39$PARAGRAPH;
    private static final SubLString $str40$formula_info;
    private static final SubLString $str41$Formula___;
    private static final SubLSymbol $kw42$DONE;
    private static final SubLString $str43$Status___OK;
    private static final SubLSymbol $kw44$RED;
    private static final SubLString $str45$Error__;
    private static final SubLString $str46$Next__;
    private static final SubLSymbol $kw47$FRESH;
    private static final SubLSymbol $kw48$NEED_APPROVAL;
    private static final SubLString $str49$Lexify;
    private static final SubLString $str50$Assert;
    private static final SubLString $str51$Assert_and_Relexify;
    private static final SubLString $str52$_relexify;
    private static final SubLInteger $int53$40;
    private static final SubLString $str54$Get_Next_Lexification;
    private static final SubLString $str55$_next_action;
    private static final SubLString $str56$Skip_Lexification;
    private static final SubLString $str57$_skip_action;
    private static final SubLString $str58$Reason__optional___;
    private static final SubLString $str59$_comment;
    private static final SubLString $str60$_Invoke_Dictionary_Assistant_;
    private static final SubLString $str61$Note__For_guided_lexification__us;
    private static final SubLSymbol $kw62$SME_LEXIFY_TERM;
    private static final SubLString $str63$edit_formula;
    private static final SubLSymbol $kw64$INVISIBLE;
    private static final SubLSymbol $sym65$CB_INVOKE_OE_LEXIFICATION_WIZARD;
    private static final SubLSymbol $kw66$HTML_HANDLER;
    private static final SubLString $str67$lexwiz_stages;
    private static final SubLString $str68$font_family__sans_serif__color__D;
    private static final SubLString $str69$_87CEFA;
    private static final SubLString $str70$_B0C4DE;
    private static final SubLString $str71$padding__5___outline_darkblue_sol;
    private static final SubLSymbol $kw72$NEED_INPUT;
    private static final SubLString $str73$color_DimGray;
    private static final SubLString $str74$Stages_;
    private static final SubLString $str75$Gathering;
    private static final SubLString $str76$__x2009___x2009_;
    private static final SubLString $str77$font_size__large;
    private static final SubLString $str78$__x21E8_;
    private static final SubLString $str79$Reviewing;
    private static final SubLString $str80$Asserting;
    private static final SubLString $str81$_cyc_term;
    private static final SubLString $str82$Complete;
    private static final SubLSymbol $kw83$BLACK;
    private static final SubLSymbol $kw84$BLUE;
    private static final SubLString $str85$Term__;
    private static final SubLString $str86$Clear_Term;
    private static final SubLString $str87$_create_term;
    private static final SubLString $str88$Create_Term_;
    private static final SubLString $str89$Phrase__;
    private static final SubLString $str90$_phrase;
    private static final SubLString $str91$Clear_Phrase;
    private static final SubLString $str92$_is_preferred;
    private static final SubLString $str93$Is_preferred_;
    private static final SubLSymbol $kw94$PRECISE;
    private static final SubLString $str95$_is_precise;
    private static final SubLString $str96$Is_precise_;
    private static final SubLString $str97$_is_proper_name;
    private static final SubLString $str98$Is_proper_name_;
    private static final SubLString $str99$_nonrelational;
    private static final SubLString $str100$Nonrelational_lexification_;
    private static final SubLString $str101$Mt__;
    private static final SubLString $str102$_lexification_mt;
    private static final SubLString $str103$Assertion_Editor___;
    private static final SubLInteger $int104$60;
    private static final SubLString $str105$Formula_for_editor___A__;
    private static final SubLSymbol $kw106$INPUT_NAME;
    private static final SubLString $str107$_user_formula;
    private static final SubLSymbol $kw108$PRETTY_NAME;
    private static final SubLSymbol $kw109$CYCLIFY_LABEL;
    private static final SubLString $str110$Cyclify;
    private static final SubLSymbol $kw111$CLEAR_LABEL;
    private static final SubLString $str112$Clear;
    private static final SubLSymbol $kw113$HEIGHT;
    private static final SubLSymbol $kw114$WIDTH;
    private static final SubLString $str115$_user_formula_copy;
    private static final SubLString $str116$Proper_name_predicate__;
    private static final SubLString $str117$_lexification_predicate;
    private static final SubLSymbol $sym118$TO_STRING;
    private static final SubLString $str119$arg_spec;
    private static final SubLString $str120$pred_arg_info;
    private static final SubLString $str121$Argument_specification__;
    private static final SubLString $str122$Arg___A__;
    private static final SubLSymbol $sym123$STRING_TO_INTEGER;
    private static final SubLString $str124$_arg_offset__A;
    private static final SubLSymbol $sym125$STRING_FOR_FORT;
    private static final SubLString $str126$_arg_speech_part__A;
    private static final SubLString $str127$Parse_Template_Specification;
    private static final SubLString $str128$_parse_template_mt;
    private static final SubLString $str129$_parse_template;
    private static final SubLInteger $int130$80;
    private static final SubLString $str131$virtual;
    private static final SubLString $str132$Headword_position__;
    private static final SubLString $str133$_headword_position;
    private static final SubLString $str134$First;
    private static final SubLString $str135$Last;
    private static final SubLString $str136$Other;
    private static final SubLString $str137$Other___a__a__;
    private static final SubLString $str138$_other_position;
    private static final SubLString $str139$Headword_part_of_speech__;
    private static final SubLString $str140$_headword_part_of_speech;
    private static final SubLString $str141$_choose_part_of_speech;
    private static final SubLString $str142$_add_syntactic_mapping;
    private static final SubLString $str143$_Add_mapping_;
    private static final SubLString $str144$Mapping_Mt__;
    private static final SubLString $str145$_syntactic_mt;
    private static final SubLString $str146$cb_handle_oe_lexification_wizard_;
    private static final SubLObject $const147$cyclistNotes;
    private static final SubLObject $const148$needsHandLexification;
    private static final SubLObject $const149$termStrings;
    private static final SubLString $str150$Missing_information__see_blue_hig;
    private static final SubLString $str151$Invalid_Cyc_term;
    private static final SubLString $str152$Invalid_Cyc_MT;
    private static final SubLList $list153;
    private static final SubLString $str154$Warning__;
    private static final SubLString $str155$____assertion_failed___a______;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$CB_HANDLE_OE_LEXIFICATION_WIZARD;
    private static final SubLString $str158$Post_lexification_error;
    private static final SubLSymbol $sym159$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str160$Lexification_successful_for__a;
    private static final SubLString $str161$Added__s_;
    private static final SubLString $str162$Other_ways_of_referring_to__a_;
    private static final SubLString $str163$_____a;
    private static final SubLString $str164$No_other_ways_of_referring_to__a;
    private static final SubLString $str165$Unable_to_confirm_lexification___;
    private static final SubLString $str166$Internal_error_during_lexificatio;
    private static final SubLSymbol $sym167$_EXIT;
    private static final SubLString $str168$_arg_offset_;
    private static final SubLSymbol $sym169$WORD_OFFSETS_TO_SPAN;
    private static final SubLString $str170$_arg_speech_part_;
    private static final SubLSymbol $sym171$FORT_FOR_STRING;
    private static final SubLString $str172$The_relation_arguments_must_be_sp;
    private static final SubLString $str173$_A_A;
    private static final SubLSymbol $sym174$EXTRACT_INTEGER;
    private static final SubLSymbol $sym175$_;
    private static final SubLString $str176$Problem_deriving_relation_templat;
    private static final SubLString $str177$1;
    private static final SubLSymbol $sym178$USER_FORMULA;
    private static final SubLList $list179;
    private static final SubLString $str180$Error_in_formula___a__;
    private static final SubLString $str181$_a_in__a;
    private static final SubLSymbol $sym182$_TERM;
    private static final SubLObject $const183$myCreationPurpose;
    private static final SubLObject $const184$BookkeepingMt;
    private static final SubLSymbol $sym185$_;
    private static final SubLSymbol $sym186$FACT_SHEET_TERM_GAF_PRIORITY;
    private static final SubLObject $const187$InferencePSC;
    private static final SubLList $list188;
    private static final SubLSymbol $sym189$_KNOWN_LEXIFIED_TERMS_;
    private static final SubLObject $const190$synonymousExternalConcept;
    private static final SubLList $list191;
    private static final SubLString $str192$Mt__;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 2512L)
    public static SubLObject cb_link_lexification_wizard(SubLObject linktext) {
        if (linktext == cb_lexification_wizard.UNPROVIDED) {
            linktext = (SubLObject)cb_lexification_wizard.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexification_wizard.NIL == linktext) {
            linktext = (SubLObject)cb_lexification_wizard.$str2$lexification_wizard;
        }
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexification_wizard.$kw3$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str4$cb_invoke_oe_lexification_wizard);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        if (cb_lexification_wizard.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
            html_utilities.html_princ(linktext);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 3358L)
    public static SubLObject cond_html_font_color(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexification_wizard.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject color = (SubLObject)cb_lexification_wizard.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexification_wizard.$list9);
        color = current.first();
        current = current.rest();
        if (cb_lexification_wizard.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)cb_lexification_wizard.$sym10$PIF, (SubLObject)cb_lexification_wizard.$list11, (SubLObject)ConsesLow.listS((SubLObject)cb_lexification_wizard.$sym12$HTML_FONT_COLOR, (SubLObject)ConsesLow.list(color), ConsesLow.append(body, (SubLObject)cb_lexification_wizard.NIL)), reader.bq_cons((SubLObject)cb_lexification_wizard.$sym13$PROGN, ConsesLow.append(body, (SubLObject)cb_lexification_wizard.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_lexification_wizard.$list9);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 3862L)
    public static SubLObject cb_invoke_oe_lexification_wizard(SubLObject args) {
        if (args == cb_lexification_wizard.UNPROVIDED) {
            args = (SubLObject)cb_lexification_wizard.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexification_wizard.init_lexification_wizard((SubLObject)cb_lexification_wizard.UNPROVIDED);
        if (cb_lexification_wizard.NIL == lexification_wizard.lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)) && cb_lexification_wizard.NIL == lexification_reminders.lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
            lex_loop((SubLObject)cb_lexification_wizard.UNPROVIDED);
            if (cb_lexification_wizard.NIL != lexification_reminders.lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                cb_invoke_oe_lexification_wizard((SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
        }
        if (cb_lexification_wizard.NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn((SubLObject)cb_lexification_wizard.$str14$the_Lexification_Assistant);
            return (SubLObject)cb_lexification_wizard.NIL;
        }
        final SubLObject old_id = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str15$_id, args);
        final SubLObject old_object = lexification_wizard.get_lexification_object(old_id);
        final SubLObject v_object = (cb_lexification_wizard.NIL != old_object) ? lexification_wizard.copy_lexification_parameters(old_object) : lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
        final SubLObject id = lexification_wizard.lexwiz_id(v_object);
        final SubLObject lex_term = misc_kb_utilities.coerce_name(lexification_wizard.lexwiz_term(v_object));
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject nonrelationalP = lexification_wizard.lexwiz_nonrelationalP(v_object);
        final SubLObject relationalP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != lexification_utilities.is_relationalP(cyc_term) && cb_lexification_wizard.NIL == nonrelationalP);
        final SubLObject lex_mt = lexification_utilities.string_for_field(lexification_wizard.lexwiz_mt(v_object));
        final SubLObject lex_phrase = lexification_utilities.string_for_field(lexification_wizard.lexwiz_phrase(v_object));
        final SubLObject comment = (SubLObject)cb_lexification_wizard.$str16$;
        final SubLObject main_disabledP;
        final SubLObject user_editedP = main_disabledP = lexification_wizard.lexwiz_user_editedP(v_object);
        final SubLObject disabled_style = (SubLObject)((cb_lexification_wizard.NIL != main_disabledP) ? cb_lexification_wizard.$str17$color_gray : cb_lexification_wizard.$str16$);
        final SubLObject title_var = (SubLObject)cb_lexification_wizard.$str18$Cycorp_Lexification_Assistant;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_lexification_wizard.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str19$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_lexification_wizard.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str20$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_lexification_wizard.$kw21$UNINITIALIZED) ? ConsesLow.list(cb_lexification_wizard.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_lexification_wizard.$kw22$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_lexification_wizard.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_lexification_wizard.$kw23$SAM_AUTOCOMPLETE_CSS);
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_lexification_wizard.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_lexification_wizard.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str25$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str26$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str27$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str28$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str29$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            if (cb_lexification_wizard.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_lexification_wizard.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexification_wizard.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str30$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        if (cb_lexification_wizard.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_lexification_wizard.$str31$cb_handle_oe_lexification_wizard, (SubLObject)cb_lexification_wizard.T, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.FOUR_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_lexification_wizard.$kw7$LEXWIZ, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str32$_Specify_the_parameters_needed_fo);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.FOUR_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            show_lexwiz_stages_diagram(v_object);
                            html_utilities.html_submit_input((SubLObject)cb_lexification_wizard.$str33$Reset_All, (SubLObject)cb_lexification_wizard.$str34$_reset, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_lexification_wizard.TWO_INTEGER);
                            html_utilities.html_hidden_input((SubLObject)cb_lexification_wizard.$str15$_id, id, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str35$lexwiz_main_params);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(disabled_style);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = html_macros.$html_input_disabledP$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_macros.$html_input_disabledP$.bind(main_disabledP, thread);
                                dhtml_macros.dhtml_switch_visibility_links_arrows((SubLObject)cb_lexification_wizard.$str36$basic_info, (SubLObject)cb_lexification_wizard.$str37$Basic_Information___);
                                dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str36$basic_info, (SubLObject)cb_lexification_wizard.$kw38$VISIBLE, (SubLObject)cb_lexification_wizard.$kw39$PARAGRAPH);
                                html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str36$basic_info);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                    init_basic_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                if (cb_lexification_wizard.NIL == user_editedP) {
                                    if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_is_properP(v_object)) {
                                        init_name_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                    }
                                    else if (cb_lexification_wizard.NIL != relationalP) {
                                        init_relation_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                    }
                                    else {
                                        init_denotation_lexification(v_object, lex_term, lex_phrase, lex_mt);
                                    }
                                }
                                if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_formula(v_object)) {
                                    dhtml_macros.dhtml_switch_visibility_links_arrows((SubLObject)cb_lexification_wizard.$str40$formula_info, (SubLObject)cb_lexification_wizard.$str41$Formula___);
                                    dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str40$formula_info, (SubLObject)cb_lexification_wizard.$kw38$VISIBLE, (SubLObject)cb_lexification_wizard.$kw39$PARAGRAPH);
                                    html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str40$formula_info);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                        cb_utilities.cb_form(lexification_wizard.lexwiz_formula(v_object), (SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.T);
                                        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                        if (lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw42$DONE) {
                                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str43$Status___OK);
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                }
                            }
                            finally {
                                html_macros.$html_input_disabledP$.rebind(_prev_bind_1_$7, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_error_message(v_object)) {
                                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                final SubLObject color_val = (SubLObject)cb_lexification_wizard.$kw44$RED;
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_lexification_wizard.NIL != color_val) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(color_val));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str45$Error__);
                                    html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
                                    html_utilities.html_princ(lexification_wizard.lexwiz_error_message(v_object));
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                            }
                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.ZERO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                    SubLObject submit_label = (SubLObject)cb_lexification_wizard.$str46$Next__;
                                    if (cb_lexification_wizard.NIL == lexification_wizard.lexwiz_error_message(v_object) && lexification_wizard.lexwiz_state(v_object) != cb_lexification_wizard.$kw47$FRESH) {
                                        if (lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw48$NEED_APPROVAL && (cb_lexification_wizard.NIL == lexification_wizard.lexwiz_formula(v_object) || cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_formula(v_object))) {
                                            submit_label = (SubLObject)cb_lexification_wizard.$str49$Lexify;
                                        }
                                        if (lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw42$DONE) {
                                            submit_label = (SubLObject)cb_lexification_wizard.$str50$Assert;
                                        }
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                        html_utilities.html_submit_input(submit_label, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    if (lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw42$DONE) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                            html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                            html_utilities.html_submit_input((SubLObject)cb_lexification_wizard.$str51$Assert_and_Relexify, (SubLObject)cb_lexification_wizard.$str52$_relexify, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    }
                                    if (lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw47$FRESH) {
                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                            html_utilities.html_indent((SubLObject)cb_lexification_wizard.$int53$40);
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        if (cb_lexification_wizard.NIL != lexification_utilities.lex_empty_stringP(lex_term) && cb_lexification_wizard.NIL != lexification_reminders.lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                                html_utilities.html_submit_input((SubLObject)cb_lexification_wizard.$str54$Get_Next_Lexification, (SubLObject)cb_lexification_wizard.$str55$_next_action, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                        if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_action(v_object)) {
                                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                                html_utilities.html_submit_input((SubLObject)cb_lexification_wizard.$str56$Skip_Lexification, (SubLObject)cb_lexification_wizard.$str57$_skip_action, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str58$Reason__optional___);
                                                html_utilities.html_text_input((SubLObject)cb_lexification_wizard.$str59$_comment, comment, (SubLObject)cb_lexification_wizard.$int53$40);
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        }
                                    }
                                    html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            init_formula_lexification(v_object);
                            final SubLObject lexwiz_link_text = (SubLObject)cb_lexification_wizard.$str60$_Invoke_Dictionary_Assistant_;
                            html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str61$Note__For_guided_lexification__us);
                            cb_utilities.cb_link((SubLObject)cb_lexification_wizard.$kw62$SME_LEXIFY_TERM, id, lexwiz_link_text, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                            if (cb_lexification_wizard.NIL != cyc_term) {
                                html_utilities.html_hr((SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                if (cb_lexification_wizard.NIL != lexification_wizard.$lexwiz_show_term_informationP$.getGlobalValue()) {
                                    cb_browser.cb_print_documentation_information(cyc_term, (SubLObject)cb_lexification_wizard.T);
                                    html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    cb_browser.cb_print_definitional_information(cyc_term);
                                    html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                    cb_print_sec_assertions(cyc_term);
                                    html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                }
                                cb_lexical_info.cb_print_lexical_information(cyc_term, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_editedP(v_object) || (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_formula(v_object) && cb_lexification_wizard.NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread))) {
                            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str63$edit_formula, (SubLObject)cb_lexification_wizard.$kw38$VISIBLE, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str36$basic_info, (SubLObject)cb_lexification_wizard.$kw64$INVISIBLE, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str40$formula_info, (SubLObject)cb_lexification_wizard.$kw64$INVISIBLE, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        }
                        html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_very_verbose$.getGlobalValue());
        return (SubLObject)cb_lexification_wizard.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 12567L)
    public static SubLObject show_lexwiz_stages_diagram(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str67$lexwiz_stages);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str68$font_family__sans_serif__color__D);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                final SubLObject highlight_color = (SubLObject)cb_lexification_wizard.$str69$_87CEFA;
                final SubLObject background_color = (SubLObject)cb_lexification_wizard.$str70$_B0C4DE;
                final SubLObject box_style = (SubLObject)cb_lexification_wizard.$str71$padding__5___outline_darkblue_sol;
                SubLObject gathering_color = background_color;
                SubLObject reviewing_color = background_color;
                SubLObject asserting_color = background_color;
                final SubLObject pcase_var = lexification_wizard.lexwiz_state(v_object);
                if (!pcase_var.eql((SubLObject)cb_lexification_wizard.$kw47$FRESH)) {
                    if (pcase_var.eql((SubLObject)cb_lexification_wizard.$kw72$NEED_INPUT)) {
                        gathering_color = highlight_color;
                    }
                    else if (pcase_var.eql((SubLObject)cb_lexification_wizard.$kw48$NEED_APPROVAL)) {
                        reviewing_color = highlight_color;
                    }
                    else if (pcase_var.eql((SubLObject)cb_lexification_wizard.$kw42$DONE)) {
                        asserting_color = highlight_color;
                    }
                }
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_attribute_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_lexification_wizard.$str73$color_DimGray));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        html_utilities.html_indent((SubLObject)cb_lexification_wizard.TEN_INTEGER);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str74$Stages_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_lexification_wizard.NIL != gathering_color) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(gathering_color);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(box_style);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str75$Gathering);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str76$__x2009___x2009_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    if (cb_lexification_wizard.NIL == cb_lexification_wizard.$streamlined_lexwizP$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str77$font_size__large);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str78$__x21E8_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (cb_lexification_wizard.NIL != reviewing_color) {
                            html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(reviewing_color);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_markup(box_style);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str79$Reviewing);
                                html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str76$__x2009___x2009_);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str77$font_size__large);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str78$__x21E8_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    if (cb_lexification_wizard.NIL != asserting_color) {
                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(asserting_color);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_div_style$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_markup(box_style);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str80$Asserting);
                            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str76$__x2009___x2009_);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 14963L)
    public static SubLObject init_basic_lexification(final SubLObject v_object, final SubLObject lex_term, final SubLObject lex_phrase, SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject nonrelationalP = lexification_wizard.lexwiz_nonrelationalP(v_object);
        final SubLObject relationalP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != lexification_utilities.is_relationalP(cyc_term) && cb_lexification_wizard.NIL == nonrelationalP);
        final SubLObject default_lex_mt = (cb_lexification_wizard.NIL != relationalP) ? lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread) : lexicon_vars.$default_lexification_mt$.getDynamicValue(thread);
        html_complete.html_complete_button((SubLObject)cb_lexification_wizard.$str81$_cyc_term, (SubLObject)cb_lexification_wizard.$str82$Complete, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        if (cb_lexification_wizard.NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            final SubLObject color_val = (SubLObject)((cb_lexification_wizard.NIL != cyc_term) ? cb_lexification_wizard.$kw83$BLACK : cb_lexification_wizard.$kw84$BLUE);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_lexification_wizard.NIL != color_val) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str85$Term__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str85$Term__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_utilities.html_text_input((SubLObject)cb_lexification_wizard.$str81$_cyc_term, lex_term, (SubLObject)cb_lexification_wizard.$int53$40);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_script_utilities.html_clear_input_button((SubLObject)cb_lexification_wizard.$str81$_cyc_term, (SubLObject)cb_lexification_wizard.$str86$Clear_Term, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        if (cb_lexification_wizard.NIL == cyc_term && string_utilities.char_at(lex_term, (SubLObject)cb_lexification_wizard.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_lparen)) {
            html_utilities.html_checkbox_input((SubLObject)cb_lexification_wizard.$str87$_create_term, (SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str88$Create_Term_);
        }
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject phrase_label = (SubLObject)cb_lexification_wizard.$str89$Phrase__;
        if (cb_lexification_wizard.NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            final SubLObject color_val2 = (SubLObject)((cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_phrase)) ? cb_lexification_wizard.$kw83$BLACK : cb_lexification_wizard.$kw84$BLUE);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_lexification_wizard.NIL != color_val2) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val2));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ(phrase_label);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ(phrase_label);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_utilities.html_text_input((SubLObject)cb_lexification_wizard.$str90$_phrase, lex_phrase, (SubLObject)cb_lexification_wizard.$int53$40);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_script_utilities.html_clear_input_button((SubLObject)cb_lexification_wizard.$str90$_phrase, (SubLObject)cb_lexification_wizard.$str91$Clear_Phrase, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject is_preferredP = Equality.eq(lexification_wizard.lexwiz_is_preferredP(v_object), (SubLObject)cb_lexification_wizard.T);
        html_utilities.html_indent(Numbers.add((SubLObject)cb_lexification_wizard.ONE_INTEGER, Sequences.length(phrase_label)));
        html_utilities.html_checkbox_input((SubLObject)cb_lexification_wizard.$str92$_is_preferred, is_preferredP, is_preferredP, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str93$Is_preferred_);
        final SubLObject is_preciseP = Equality.eq(lexification_wizard.lexwiz_is_preferredP(v_object), (SubLObject)cb_lexification_wizard.$kw94$PRECISE);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_utilities.html_checkbox_input((SubLObject)cb_lexification_wizard.$str95$_is_precise, is_preciseP, is_preciseP, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str96$Is_precise_);
        if (cb_lexification_wizard.NIL != lexification_utilities.cyc_individual_constantP(cyc_term) || cb_lexification_wizard.NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread)) {
            final SubLObject is_properP = lexification_wizard.lexwiz_is_properP(v_object);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.TWO_INTEGER);
            html_utilities.html_checkbox_input((SubLObject)cb_lexification_wizard.$str97$_is_proper_name, is_properP, is_properP, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str98$Is_proper_name_);
        }
        if (cb_lexification_wizard.NIL != lexification_utilities.is_relationalP(cyc_term) && cb_lexification_wizard.NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread)) {
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.TWO_INTEGER);
            html_utilities.html_checkbox_input((SubLObject)cb_lexification_wizard.$str99$_nonrelational, nonrelationalP, nonrelationalP, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str100$Nonrelational_lexification_);
        }
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        if (cb_lexification_wizard.NIL == string_utilities.non_empty_stringP(lex_mt)) {
            lex_mt = default_lex_mt;
        }
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str101$Mt__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.create_simple_dropdown_list((SubLObject)cb_lexification_wizard.$str102$_lexification_mt, lexification_wizard.$lexification_mts$.getGlobalValue(), misc_kb_utilities.coerce_name(lex_mt));
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 18142L)
    public static SubLObject init_formula_lexification(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_formula(v_object) || cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_formula(v_object)) {
            dhtml_macros.dhtml_switch_visibility_links_arrows((SubLObject)cb_lexification_wizard.$str63$edit_formula, (SubLObject)cb_lexification_wizard.$str103$Assertion_Editor___);
            final SubLObject formula_text = or2(lexification_wizard.lexwiz_user_formula(v_object), format_cycl_expression.format_cycl_expression_to_string(lexification_wizard.lexwiz_formula(v_object), (SubLObject)cb_lexification_wizard.UNPROVIDED));
            final SubLObject is_visibleP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_formula(v_object) || cb_lexification_wizard.NIL != lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread));
            final SubLObject edit_box_visibility = (SubLObject)((cb_lexification_wizard.NIL != is_visibleP) ? cb_lexification_wizard.$kw38$VISIBLE : cb_lexification_wizard.$kw64$INVISIBLE);
            final SubLObject formula_len = Numbers.max((SubLObject)cb_lexification_wizard.$int104$60, Sequences.length(formula_text));
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str105$Formula_for_editor___A__, formula_text);
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str63$edit_formula, (SubLObject)cb_lexification_wizard.$kw38$VISIBLE, (SubLObject)cb_lexification_wizard.$kw39$PARAGRAPH);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str63$edit_formula);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                cb_form_widgets.cb_el_sentence_input_section(formula_text, (SubLObject)ConsesLow.list(new SubLObject[] { cb_lexification_wizard.$kw106$INPUT_NAME, cb_lexification_wizard.$str107$_user_formula, cb_lexification_wizard.$kw108$PRETTY_NAME, cb_lexification_wizard.NIL, cb_lexification_wizard.$kw109$CYCLIFY_LABEL, cb_lexification_wizard.$str110$Cyclify, cb_lexification_wizard.$kw111$CLEAR_LABEL, cb_lexification_wizard.$str112$Clear, cb_lexification_wizard.$kw113$HEIGHT, cb_lexification_wizard.FIVE_INTEGER, cb_lexification_wizard.$kw114$WIDTH, formula_len }));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_hidden_input((SubLObject)cb_lexification_wizard.$str115$_user_formula_copy, formula_text, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
            return (SubLObject)cb_lexification_wizard.NIL;
        }
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 20340L)
    public static SubLObject init_name_lexification(final SubLObject v_object, final SubLObject lex_term, final SubLObject lex_phrase, final SubLObject lex_mt) {
        final SubLObject lex_pred = lexification_utilities.string_for_field(lexification_wizard.lexwiz_proper_name_pred(v_object));
        final SubLObject proper_name_pred_names = lexification_wizard.filter_proper_name_predicates(lex_term);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str116$Proper_name_predicate__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.ONE_INTEGER);
        html_utilities.create_simple_dropdown_list((SubLObject)cb_lexification_wizard.$str117$_lexification_predicate, proper_name_pred_names, lex_pred);
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 20979L)
    public static SubLObject init_relation_lexification(final SubLObject v_object, final SubLObject lex_term, final SubLObject lex_phrase, final SubLObject lex_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_args = lexification_wizard.lexwiz_template_args(v_object);
        final SubLObject lex_speech_parts = lexification_wizard.lexwiz_template_speech_parts(v_object);
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lex_term);
        final SubLObject v_arity = (SubLObject)((cb_lexification_wizard.NIL != cyc_term) ? lexification_utilities.lex_arity_in_any_mt(cyc_term) : cb_lexification_wizard.ZERO_INTEGER);
        if (lexification_wizard.lexwiz_lexical_mt(v_object).equal(misc_kb_utilities.fort_for_string(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread)))) {
            lexification_wizard._csetf_lexwiz_lexical_mt(v_object, misc_kb_utilities.fort_for_string(lexicon_vars.$default_predicate_lexification_mt$.getDynamicValue(thread)));
        }
        final SubLObject word_choices = lexification_utilities.lex_string_tokenize(lex_phrase, (SubLObject)cb_lexification_wizard.T);
        final SubLObject num_words = Sequences.length(word_choices);
        final SubLObject word_offsets = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym118$TO_STRING), list_utilities.num_list(num_words, (SubLObject)cb_lexification_wizard.UNPROVIDED));
        final SubLObject default_all_speech_parts = sme_lexification_wizard.rtp_parts_of_speech(word_choices);
        html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str119$arg_spec);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
            dhtml_macros.dhtml_switch_visibility_links_arrows((SubLObject)cb_lexification_wizard.$str120$pred_arg_info, (SubLObject)cb_lexification_wizard.$str121$Argument_specification__);
            dhtml_macros.dhtml_set_switched_visibility((SubLObject)cb_lexification_wizard.$str120$pred_arg_info, (SubLObject)cb_lexification_wizard.$kw38$VISIBLE, (SubLObject)cb_lexification_wizard.$kw39$PARAGRAPH);
            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str120$pred_arg_info);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_lexification_wizard.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_lexification_wizard.ZERO_INTEGER);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        SubLObject i;
                        SubLObject arg_num;
                        SubLObject v_arg_type;
                        SubLObject arg_type_description;
                        SubLObject _prev_bind_0_$37;
                        SubLObject _prev_bind_0_$38;
                        for (i = (SubLObject)cb_lexification_wizard.NIL, i = (SubLObject)cb_lexification_wizard.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER)) {
                            arg_num = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER);
                            v_arg_type = lexification_utilities.get_relation_argument_type(cyc_term, arg_num);
                            arg_type_description = lexification_utilities.lex_describe_term(v_arg_type, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            if (i.numG((SubLObject)cb_lexification_wizard.ZERO_INTEGER)) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                    html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str76$__x2009___x2009_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_utilities.html_princ(PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str122$Arg___A__, arg_num));
                                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                html_utilities.html_princ(arg_type_description);
                                html_utilities.html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        SubLObject i;
                        SubLObject arg_num;
                        SubLObject default_arg_offsets;
                        SubLObject field_name;
                        SubLObject _prev_bind_0_$40;
                        SubLObject _prev_bind_0_$41;
                        for (i = (SubLObject)cb_lexification_wizard.NIL, i = (SubLObject)cb_lexification_wizard.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER)) {
                            arg_num = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER);
                            default_arg_offsets = (SubLObject)((cb_lexification_wizard.NIL != lex_args) ? Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym123$STRING_TO_INTEGER), Sequences.elt(lex_args, i)) : cb_lexification_wizard.NIL);
                            field_name = PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str124$_arg_offset__A, arg_num);
                            if (i.numG((SubLObject)cb_lexification_wizard.ZERO_INTEGER)) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                    html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str76$__x2009___x2009_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_utilities.html_create_multiple_selection_listbox(field_name, word_choices, word_offsets, Numbers.min((SubLObject)cb_lexification_wizard.TEN_INTEGER, num_words), default_arg_offsets);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                        SubLObject i;
                        SubLObject arg_num;
                        SubLObject arg_offsets;
                        SubLObject span;
                        SubLObject start;
                        SubLObject end;
                        SubLObject arg_phrase;
                        SubLObject all_speech_parts;
                        SubLObject lex_all_speech_parts;
                        SubLObject lex_default_speech_part;
                        SubLObject choice_offset;
                        SubLObject field_name2;
                        SubLObject _prev_bind_0_$43;
                        SubLObject _prev_bind_0_$44;
                        for (i = (SubLObject)cb_lexification_wizard.NIL, i = (SubLObject)cb_lexification_wizard.ZERO_INTEGER; i.numL(v_arity); i = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER)) {
                            arg_num = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER);
                            arg_offsets = (SubLObject)((cb_lexification_wizard.NIL != lex_args) ? Sequences.elt(lex_args, i) : cb_lexification_wizard.NIL);
                            span = (SubLObject)((cb_lexification_wizard.NIL != arg_offsets) ? word_offsets_to_span(arg_offsets) : cb_lexification_wizard.NIL);
                            start = span.first();
                            end = conses_high.second(span);
                            arg_phrase = (SubLObject)((cb_lexification_wizard.NIL != start && cb_lexification_wizard.NIL != end) ? lexification_utilities.join_words(Sequences.subseq(word_choices, start, end)) : cb_lexification_wizard.NIL);
                            all_speech_parts = ((cb_lexification_wizard.NIL != arg_phrase) ? sme_lexification_wizard.rtp_phrase_parts_of_speech(arg_phrase) : default_all_speech_parts);
                            lex_all_speech_parts = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym125$STRING_FOR_FORT), all_speech_parts);
                            lex_default_speech_part = ((cb_lexification_wizard.NIL != lex_speech_parts) ? Sequences.elt(lex_speech_parts, i) : lex_all_speech_parts.first());
                            choice_offset = Sequences.position(lex_default_speech_part, lex_all_speech_parts, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            field_name2 = PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str126$_arg_speech_part__A, arg_num);
                            if (i.numG((SubLObject)cb_lexification_wizard.ZERO_INTEGER)) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                                _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                    html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str76$__x2009___x2009_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                                html_utilities.html_create_listbox(field_name2, lex_all_speech_parts, lex_all_speech_parts, (SubLObject)cb_lexification_wizard.ONE_INTEGER, choice_offset, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
            }
            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 24889L)
    public static SubLObject init_parsing_template_lexification(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_parse_template_mt = lexification_utilities.string_for_field(lexification_wizard.lexwiz_parse_template_mt(v_object));
        final SubLObject lex_parse_template = lexification_utilities.string_for_field(lexification_wizard.lexwiz_parse_template(v_object));
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str127$Parse_Template_Specification);
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str101$Mt__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.create_simple_dropdown_list((SubLObject)cb_lexification_wizard.$str128$_parse_template_mt, lexification_wizard.$lexification_template_mts$.getGlobalValue(), lex_parse_template_mt);
        if (cb_lexification_wizard.NIL != cb_parameters.$cb_wrap_interactor$.getDynamicValue(thread)) {
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str129$_parse_template);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$int130$80);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.FIVE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str131$virtual);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                html_utilities.html_princ(lex_parse_template);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$str129$_parse_template);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.$int130$80);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_lexification_wizard.FIVE_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                html_utilities.html_princ(lex_parse_template);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 25784L)
    public static SubLObject init_denotation_lexification(final SubLObject v_object, SubLObject lex_term, SubLObject lex_phrase, SubLObject lex_mt) {
        if (lex_term == cb_lexification_wizard.UNPROVIDED) {
            lex_term = (SubLObject)cb_lexification_wizard.NIL;
        }
        if (lex_phrase == cb_lexification_wizard.UNPROVIDED) {
            lex_phrase = (SubLObject)cb_lexification_wizard.NIL;
        }
        if (lex_mt == cb_lexification_wizard.UNPROVIDED) {
            lex_mt = (SubLObject)cb_lexification_wizard.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_words = (SubLObject)((cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_phrase)) ? lexification_utilities.lex_string_tokenize(lex_phrase, (SubLObject)cb_lexification_wizard.NIL) : cb_lexification_wizard.NIL);
        final SubLObject lex_phrase_len = Sequences.length(lex_words);
        final SubLObject lex_position = lexification_utilities.string_for_field(lexification_wizard.lexwiz_headword_position(v_object));
        final SubLObject position = lexification_wizard.convert_position(lex_position, lex_phrase_len);
        final SubLObject lex_headword = (SubLObject)(position.numG((SubLObject)cb_lexification_wizard.ZERO_INTEGER) ? Sequences.elt(lex_words, Numbers.subtract(position, (SubLObject)cb_lexification_wizard.ONE_INTEGER)) : cb_lexification_wizard.$str16$);
        final SubLObject lex_part_of_speech = lexification_utilities.string_for_field(lexification_wizard.lexwiz_headword_part_of_speech(v_object));
        final SubLObject cyc_part_of_speech = misc_kb_utilities.fort_for_string(lex_part_of_speech);
        final SubLObject lex_syntactic_mt = lexification_wizard.lexwiz_syntactic_mt(v_object);
        if (lex_phrase_len.numE((SubLObject)cb_lexification_wizard.ZERO_INTEGER)) {
            return (SubLObject)cb_lexification_wizard.NIL;
        }
        if (lex_phrase_len.numG((SubLObject)cb_lexification_wizard.ONE_INTEGER)) {
            final SubLObject is_first = Numbers.numE(position, (SubLObject)cb_lexification_wizard.ONE_INTEGER);
            final SubLObject is_last = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL == is_first && position.numE(lex_phrase_len));
            final SubLObject is_other = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_position) && cb_lexification_wizard.NIL == is_first && cb_lexification_wizard.NIL == is_last);
            if (cb_lexification_wizard.NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                final SubLObject color_val = (SubLObject)((cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_position)) ? cb_lexification_wizard.$kw83$BLACK : cb_lexification_wizard.$kw84$BLUE);
                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (cb_lexification_wizard.NIL != color_val) {
                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_color(color_val));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str132$Headword_position__);
                    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str132$Headword_position__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            html_utilities.html_radio_input((SubLObject)cb_lexification_wizard.$str133$_headword_position, (SubLObject)cb_lexification_wizard.$str134$First, is_first, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str134$First);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_radio_input((SubLObject)cb_lexification_wizard.$str133$_headword_position, (SubLObject)cb_lexification_wizard.$str135$Last, is_last, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str135$Last);
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
            if (lex_phrase_len.numG((SubLObject)cb_lexification_wizard.TWO_INTEGER)) {
                html_utilities.html_radio_input((SubLObject)cb_lexification_wizard.$str133$_headword_position, (SubLObject)cb_lexification_wizard.$str136$Other, is_other, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str137$Other___a__a__, (SubLObject)cb_lexification_wizard.ONE_INTEGER, lex_phrase_len);
                html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_text_input((SubLObject)cb_lexification_wizard.$str138$_other_position, (SubLObject)((cb_lexification_wizard.NIL != is_other) ? lex_position : cb_lexification_wizard.NIL), (SubLObject)cb_lexification_wizard.TWO_INTEGER);
            }
            html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        if (cb_lexification_wizard.NIL == html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            final SubLObject color_val2 = (SubLObject)((cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_part_of_speech)) ? cb_lexification_wizard.$kw83$BLACK : cb_lexification_wizard.$kw84$BLUE);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (cb_lexification_wizard.NIL != color_val2) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(color_val2));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_wizard.T, thread);
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str139$Headword_part_of_speech__);
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str139$Headword_part_of_speech__);
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        final SubLObject known_headP = string_utilities.non_empty_stringP(lex_headword);
        final SubLObject head_pos_list = (SubLObject)((cb_lexification_wizard.NIL != known_headP) ? lexicon_accessors.pos_of_string(lex_headword, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED) : cb_lexification_wizard.NIL);
        SubLObject cdolist_list_var;
        final SubLObject main_pos_list = cdolist_list_var = ((cb_lexification_wizard.NIL != known_headP) ? head_pos_list : lexification_wizard.$main_lexification_parts_of_speech$.getGlobalValue());
        SubLObject cyc_pos = (SubLObject)cb_lexification_wizard.NIL;
        cyc_pos = cdolist_list_var.first();
        while (cb_lexification_wizard.NIL != cdolist_list_var) {
            if (cb_lexification_wizard.NIL == known_headP || cb_lexification_wizard.NIL != conses_high.member(cyc_pos, head_pos_list, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                final SubLObject pos_name = lexification_utilities.string_for_fort(cyc_pos);
                final SubLObject selected = Equality.equal(pos_name, lex_part_of_speech);
                html_utilities.html_radio_input((SubLObject)cb_lexification_wizard.$str140$_headword_part_of_speech, pos_name, selected, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_princ(pos_name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cyc_pos = cdolist_list_var.first();
        }
        final SubLObject is_main_posP = conses_high.member(cyc_part_of_speech, main_pos_list, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject is_other_posP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != cyc_part_of_speech && cb_lexification_wizard.NIL == is_main_posP);
        html_utilities.html_radio_input((SubLObject)cb_lexification_wizard.$str140$_headword_part_of_speech, (SubLObject)cb_lexification_wizard.$str136$Other, is_other_posP, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str136$Other);
        html_utilities.html_indent((SubLObject)cb_lexification_wizard.UNPROVIDED);
        html_utilities.create_simple_dropdown_list((SubLObject)cb_lexification_wizard.$str141$_choose_part_of_speech, lexification_wizard.$all_lexification_parts_of_speech_labels$.getGlobalValue(), lex_part_of_speech);
        if (cb_lexification_wizard.NIL != cyc_part_of_speech) {
            final SubLObject is_mappedP = conses_high.member(cyc_part_of_speech, head_pos_list, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            if (cb_lexification_wizard.NIL == is_mappedP) {
                html_utilities.html_checkbox_input((SubLObject)cb_lexification_wizard.$str142$_add_syntactic_mapping, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str143$_Add_mapping_);
                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str144$Mapping_Mt__);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.create_simple_dropdown_list((SubLObject)cb_lexification_wizard.$str145$_syntactic_mt, lexification_wizard.$lexification_mts$.getGlobalValue(), misc_kb_utilities.coerce_name(lex_syntactic_mt));
            }
        }
        html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 29762L)
    public static SubLObject or2(final SubLObject v1, final SubLObject v2) {
        return (cb_lexification_wizard.NIL != v1) ? v1 : v2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 29884L)
    public static SubLObject or3(final SubLObject v1, final SubLObject v2, final SubLObject v3) {
        return (SubLObject)((cb_lexification_wizard.NIL != v1) ? v1 : ((cb_lexification_wizard.NIL != v2) ? v2 : ((cb_lexification_wizard.NIL != v3) ? v3 : cb_lexification_wizard.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 30043L)
    public static SubLObject cb_handle_oe_lexification_wizard(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str15$_id, args);
        final SubLObject v_object = lexification_wizard.get_lexification_object(id);
        final SubLObject settings_before = lexification_wizard.copy_lexification_parameters(v_object);
        final SubLObject lex_term = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str81$_cyc_term, args);
        final SubLObject create_termP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str87$_create_term, args);
        SubLObject cyc_term = or2(misc_kb_utilities.fort_for_string(lex_term), misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object)));
        final SubLObject lex_mt = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str102$_lexification_mt, args);
        final SubLObject mt = or2(misc_kb_utilities.fort_for_string(lex_mt), misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_mt(v_object)));
        final SubLObject raw_lex_phrase = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str90$_phrase, args);
        final SubLObject lex_phrase = string_utilities.trim_whitespace(or3(html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str90$_phrase, args), lexification_wizard.lexwiz_phrase(v_object), (SubLObject)cb_lexification_wizard.$str16$));
        final SubLObject lex_is_preferredP = html_utilities.html_extract_boolean((SubLObject)cb_lexification_wizard.$str92$_is_preferred, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject lex_is_preciseP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str95$_is_precise, args);
        final SubLObject lex_is_properP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str97$_is_proper_name, args);
        final SubLObject nonrelationalP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str99$_nonrelational, args);
        final SubLObject relationalP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != lexification_utilities.is_relationalP(cyc_term) && cb_lexification_wizard.NIL == nonrelationalP);
        final SubLObject user_formula = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str107$_user_formula, args);
        final SubLObject user_formula_copy = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str115$_user_formula_copy, args);
        final SubLObject new_user_formula_editP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != user_formula && cb_lexification_wizard.NIL != user_formula_copy && !string_utilities.trim_whitespace(user_formula).equal(string_utilities.trim_whitespace(user_formula_copy)));
        final SubLObject resetP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str34$_reset, args);
        final SubLObject next_actionP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str55$_next_action, args);
        final SubLObject skip_actionP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str57$_skip_action, args);
        final SubLObject skip_comment = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str59$_comment, args);
        final SubLObject relexifyP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str52$_relexify, args);
        SubLObject settings_changedP = (SubLObject)cb_lexification_wizard.NIL;
        SubLObject readyP = (SubLObject)cb_lexification_wizard.NIL;
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str146$cb_handle_oe_lexification_wizard_, args);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_very_detailed$.getGlobalValue());
        if (cb_lexification_wizard.NIL != resetP) {
            lexification_wizard.reset_lexification_parameters((SubLObject)cb_lexification_wizard.UNPROVIDED);
            return cb_invoke_oe_lexification_wizard((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        if (cb_lexification_wizard.NIL != next_actionP) {
            return oe_lexify_next_user_action();
        }
        if (cb_lexification_wizard.NIL != skip_actionP) {
            if (cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(skip_comment)) {
                ke.ke_assert((SubLObject)ConsesLow.list(cb_lexification_wizard.$const147$cyclistNotes, (SubLObject)ConsesLow.list(cb_lexification_wizard.$const148$needsHandLexification, (SubLObject)ConsesLow.list(cb_lexification_wizard.$const149$termStrings, cycl_utilities.hl_to_el(cyc_term), lex_phrase)), skip_comment), mt, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            dictionary_utilities.dictionary_push(cb_lexification_wizard.$skipped_lexwiz_terms$.getGlobalValue(), operation_communication.the_cyclist(), cyc_term);
            lexification_reminders.remove_lexification_user_action(v_object, lexification_wizard.lexwiz_user_action(v_object));
            if (cb_lexification_wizard.NIL == lexification_reminders.valid_lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                lex_loop((SubLObject)cb_lexification_wizard.TEN_INTEGER);
            }
            final SubLObject result = oe_lexify_next_user_action();
            return (cb_lexification_wizard.NIL != result) ? result : cb_invoke_oe_lexification_wizard((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        lexification_wizard._csetf_lexwiz_error_message(v_object, (SubLObject)cb_lexification_wizard.NIL);
        if (cb_lexification_wizard.NIL != lex_term) {
            lexification_wizard._csetf_lexwiz_term(v_object, lex_term);
        }
        if (cb_lexification_wizard.NIL != raw_lex_phrase) {
            lexification_wizard._csetf_lexwiz_phrase(v_object, lex_phrase);
        }
        if (cb_lexification_wizard.NIL != lex_mt) {
            lexification_wizard._csetf_lexwiz_mt(v_object, lex_mt);
        }
        if (cb_lexification_wizard.NIL != lex_is_preferredP) {
            lexification_wizard._csetf_lexwiz_is_preferredP(v_object, lex_is_preferredP);
        }
        if (cb_lexification_wizard.NIL != lex_is_preciseP) {
            lexification_wizard._csetf_lexwiz_is_preferredP(v_object, (SubLObject)cb_lexification_wizard.$kw94$PRECISE);
        }
        if (cb_lexification_wizard.NIL != lex_is_properP) {
            lexification_wizard._csetf_lexwiz_is_properP(v_object, lex_is_properP);
        }
        lexification_wizard._csetf_lexwiz_nonrelationalP(v_object, nonrelationalP);
        if (cb_lexification_wizard.NIL != create_termP) {
            cyc_term = misc_kb_utilities.find_or_create_nart_from_text(lex_term);
        }
        readyP = lexification_utilities.all_specifiedP((SubLObject)ConsesLow.list(lex_term, lex_mt, lex_phrase));
        if (cb_lexification_wizard.NIL == readyP && lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw72$NEED_INPUT) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, (SubLObject)cb_lexification_wizard.$str150$Missing_information__see_blue_hig);
        }
        else if (cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_term) && cb_lexification_wizard.NIL == cyc_term) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, (SubLObject)cb_lexification_wizard.$str151$Invalid_Cyc_term);
        }
        else if (cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_mt) && cb_lexification_wizard.NIL == mt) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, (SubLObject)cb_lexification_wizard.$str152$Invalid_Cyc_MT);
        }
        else if (cb_lexification_wizard.NIL != new_user_formula_editP || cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_editedP(v_object)) {
            readyP = handle_user_lexification(v_object, user_formula, args);
        }
        else if (cb_lexification_wizard.NIL != lex_is_properP) {
            readyP = handle_name_lexification(v_object, cyc_term, lex_phrase, args);
        }
        else if (cb_lexification_wizard.NIL != relationalP) {
            readyP = handle_relation_lexification(v_object, cyc_term, lex_phrase, args);
        }
        else {
            readyP = handle_denotation_lexification(v_object, cyc_term, lex_phrase, args);
        }
        if (cb_lexification_wizard.NIL == readyP && cb_lexification_wizard.NIL == lexification_wizard.lexwiz_error_message(v_object) && cb_lexification_wizard.NIL == conses_high.member(lexification_wizard.lexwiz_state(v_object), (SubLObject)cb_lexification_wizard.$list153, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)cb_lexification_wizard.$str154$Warning__, (SubLObject)cb_lexification_wizard.$str155$____assertion_failed___a______), (SubLObject)cb_lexification_wizard.$list156);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        lexification_wizard._csetf_lexwiz_readyP(v_object, readyP);
        if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_settings_changedP(settings_before, v_object)) {
            settings_changedP = (SubLObject)cb_lexification_wizard.T;
        }
        SubLObject doneP = (SubLObject)cb_lexification_wizard.NIL;
        final SubLObject pcase_var = lexification_wizard.lexwiz_state(v_object);
        if (pcase_var.eql((SubLObject)cb_lexification_wizard.$kw47$FRESH) || pcase_var.eql((SubLObject)cb_lexification_wizard.$kw72$NEED_INPUT)) {
            if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_readyP(v_object) && cb_lexification_wizard.NIL == lexification_wizard.lexwiz_error_message(v_object)) {
                lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw48$NEED_APPROVAL);
            }
            else {
                lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw72$NEED_INPUT);
            }
        }
        else if (pcase_var.eql((SubLObject)cb_lexification_wizard.$kw48$NEED_APPROVAL)) {
            if (cb_lexification_wizard.NIL == settings_changedP) {
                lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw42$DONE);
            }
        }
        else if (pcase_var.eql((SubLObject)cb_lexification_wizard.$kw42$DONE)) {
            if (cb_lexification_wizard.NIL != settings_changedP) {
                lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw48$NEED_APPROVAL);
            }
            else {
                doneP = lexification_wizard.perform_lexification(v_object);
            }
        }
        if (cb_lexification_wizard.NIL == lexification_wizard.lexwiz_error_message(v_object) && cb_lexification_wizard.NIL != lexification_wizard.lexwiz_formula(v_object)) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, lexification_utilities.invalid_lexificationP(lexification_wizard.lexwiz_formula(v_object), mt));
        }
        if (cb_lexification_wizard.NIL != cb_lexification_wizard.$streamlined_lexwizP$.getGlobalValue() && lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw48$NEED_APPROVAL) {
            lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw42$DONE);
        }
        if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_error_message(v_object)) {
            lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw48$NEED_APPROVAL);
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_verbose$.getGlobalValue());
        if (cb_lexification_wizard.NIL != doneP) {
            report_lexification_result(v_object, cyc_term, lex_phrase, mt, relexifyP);
            lexification_wizard.reset_lexification_parameters(v_object);
            lexification_wizard.reset_lexification_parameters((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        else {
            cb_invoke_oe_lexification_wizard(args);
        }
        return (SubLObject)cb_lexification_wizard.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 37560L)
    public static SubLObject report_lexification_result(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject lex_mt, final SubLObject relexifyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexification_wizard.NIL != constant_handles.constant_p(cyc_term)) {
            cb_tools.cb_add_to_constant_history(cyc_term);
        }
        else if (cb_lexification_wizard.NIL != nart_handles.nart_p(cyc_term)) {
            cb_tools.cb_add_to_nat_history(cyc_term);
        }
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(lex_mt, thread);
            final SubLObject lex_term = misc_kb_utilities.coerce_name(lexification_wizard.lexwiz_term(v_object));
            SubLObject display_phrase = lex_phrase;
            SubLObject title = (SubLObject)cb_lexification_wizard.$str158$Post_lexification_error;
            SubLObject messages = (SubLObject)cb_lexification_wizard.NIL;
            SubLObject error_msg = (SubLObject)cb_lexification_wizard.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$45 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cb_lexification_wizard.$sym159$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        if (cb_lexification_wizard.NIL != lexification_wizard.lexwiz_user_formula(v_object)) {
                            display_phrase = lexification_utilities.phrases_from_lexification_sentence(lexification_wizard.lexwiz_formula(v_object), (SubLObject)cb_lexification_wizard.UNPROVIDED);
                        }
                        final SubLObject confirmedP = (SubLObject)SubLObjectFactory.makeBoolean(cb_lexification_wizard.NIL != lexification_utilities.is_relationalP(cyc_term) || cb_lexification_wizard.NIL != subl_promotions.memberP(cyc_term, lexicon_accessors.denots_of_string(display_phrase, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED), (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED));
                        if (cb_lexification_wizard.NIL != confirmedP) {
                            final SubLObject other_ways = lexification_utilities.other_lexified_phrases_for_term(cyc_term, display_phrase);
                            title = PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str160$Lexification_successful_for__a, lex_term);
                            messages = (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str161$Added__s_, display_phrase), (SubLObject)cb_lexification_wizard.$str16$);
                            if (cb_lexification_wizard.NIL != other_ways) {
                                ConsesLow.nconc(messages, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str162$Other_ways_of_referring_to__a_, lex_term)));
                                SubLObject cdolist_list_var = other_ways;
                                SubLObject other_way = (SubLObject)cb_lexification_wizard.NIL;
                                other_way = cdolist_list_var.first();
                                while (cb_lexification_wizard.NIL != cdolist_list_var) {
                                    ConsesLow.nconc(messages, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str163$_____a, other_way)));
                                    cdolist_list_var = cdolist_list_var.rest();
                                    other_way = cdolist_list_var.first();
                                }
                            }
                            else {
                                ConsesLow.nconc(messages, (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str164$No_other_ways_of_referring_to__a, lex_term)));
                            }
                        }
                        else {
                            messages = (SubLObject)ConsesLow.list(PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str165$Unable_to_confirm_lexification___, display_phrase, cyc_term));
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cb_lexification_wizard.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$45, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_lexification_wizard.NIL != error_msg) {
                messages = (SubLObject)ConsesLow.list((SubLObject)cb_lexification_wizard.$str166$Internal_error_during_lexificatio, error_msg);
            }
            if (cb_lexification_wizard.NIL != relexifyP) {
                lexification_reminders.add_lexification_todo(cyc_term, api_control_vars.$the_cyclist$.getDynamicValue(thread), display_phrase, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            else {
                mark_term_lexified(cyc_term);
                if (cb_lexification_wizard.NIL == lexification_reminders.valid_lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                    lex_loop((SubLObject)cb_lexification_wizard.UNPROVIDED);
                }
            }
            if (cb_lexification_wizard.NIL != lexification_reminders.lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                oe_lexify_next_user_action();
            }
            else {
                cb_utilities.cb_titled_message_page_with_history(title, messages, (SubLObject)cb_lexification_wizard.T);
            }
            return (SubLObject)cb_lexification_wizard.NIL;
        }
        finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 40101L)
    public static SubLObject handle_name_lexification(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject args) {
        final SubLObject lex_predicate = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str117$_lexification_predicate, args, lexification_wizard.lexwiz_proper_name_pred(v_object));
        final SubLObject cyc_predicate = misc_kb_utilities.fort_for_string(lex_predicate);
        final SubLObject all_readyP = lexification_utilities.all_specifiedP((SubLObject)ConsesLow.list(cyc_term, lex_phrase, cyc_predicate));
        lexification_wizard._csetf_lexwiz_proper_name_pred(v_object, lex_predicate);
        if (cb_lexification_wizard.NIL != all_readyP) {
            lexification_wizard.derive_proper_name_formula(v_object);
        }
        return all_readyP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 40844L)
    public static SubLObject handle_relation_lexification(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = (SubLObject)((cb_lexification_wizard.NIL != cyc_term) ? lexification_utilities.lex_arity_in_any_mt(cyc_term) : cb_lexification_wizard.ZERO_INTEGER);
        final SubLObject lex_arg_offsets = extract_arg_specs(v_arity, (SubLObject)cb_lexification_wizard.$str168$_arg_offset_, args, (SubLObject)cb_lexification_wizard.T);
        final SubLObject lex_arg_spans = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym169$WORD_OFFSETS_TO_SPAN), lex_arg_offsets);
        final SubLObject lex_arg_speech_parts = extract_arg_specs(v_arity, (SubLObject)cb_lexification_wizard.$str170$_arg_speech_part_, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject arg_speech_parts = Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym171$FORT_FOR_STRING), lex_arg_speech_parts);
        final SubLObject lex_template = (SubLObject)((lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw47$FRESH) ? cb_lexification_wizard.NIL : derive_relational_template(v_object, lex_arg_spans, arg_speech_parts));
        final SubLObject all_readyP = lexification_utilities.all_specifiedP((SubLObject)ConsesLow.list(cyc_term, lex_phrase, lex_template, lex_arg_offsets, lex_arg_speech_parts));
        if (lexification_wizard.lexwiz_mt(v_object).equal(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread)) && lexification_wizard.lexwiz_state(v_object) == cb_lexification_wizard.$kw47$FRESH) {
            lexification_wizard._csetf_lexwiz_mt(v_object, lexicon_vars.$default_relational_lexification_mt$.getDynamicValue(thread));
        }
        lexification_wizard._csetf_lexwiz_template(v_object, lex_template);
        lexification_wizard._csetf_lexwiz_template_args(v_object, lex_arg_offsets);
        lexification_wizard._csetf_lexwiz_template_speech_parts(v_object, lex_arg_speech_parts);
        if (lexification_wizard.lexwiz_state(v_object) != cb_lexification_wizard.$kw47$FRESH && cb_lexification_wizard.NIL == list_utilities.flatten(lex_arg_offsets)) {
            lexification_wizard._csetf_lexwiz_error_message(v_object, (SubLObject)cb_lexification_wizard.$str172$The_relation_arguments_must_be_sp);
        }
        if (cb_lexification_wizard.NIL != all_readyP && cb_lexification_wizard.NIL == lexification_wizard.lexwiz_error_message(v_object)) {
            lexification_wizard.derive_relation_formula(v_object);
        }
        return all_readyP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 42670L)
    public static SubLObject extract_arg_specs(final SubLObject num, final SubLObject field_basename, final SubLObject args, SubLObject multipleP) {
        if (multipleP == cb_lexification_wizard.UNPROVIDED) {
            multipleP = (SubLObject)cb_lexification_wizard.NIL;
        }
        SubLObject arg_specs = (SubLObject)cb_lexification_wizard.NIL;
        SubLObject i;
        SubLObject arg_num;
        SubLObject field_name;
        SubLObject field_values;
        SubLObject field_value;
        for (i = (SubLObject)cb_lexification_wizard.NIL, i = (SubLObject)cb_lexification_wizard.ZERO_INTEGER; i.numL(num); i = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER)) {
            arg_num = Numbers.add(i, (SubLObject)cb_lexification_wizard.ONE_INTEGER);
            field_name = PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str173$_A_A, field_basename, arg_num);
            field_values = html_utilities.html_extract_input_values(field_name, args);
            field_value = ((cb_lexification_wizard.NIL != multipleP) ? field_values : field_values.first());
            arg_specs = (SubLObject)ConsesLow.cons(field_value, arg_specs);
        }
        return Sequences.nreverse(arg_specs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 43414L)
    public static SubLObject word_offsets_to_span(final SubLObject word_offsets) {
        SubLObject start = (SubLObject)cb_lexification_wizard.NIL;
        SubLObject end = (SubLObject)cb_lexification_wizard.NIL;
        if (cb_lexification_wizard.NIL != word_offsets) {
            final SubLObject offsets = Sort.sort(Mapping.mapcar(Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym174$EXTRACT_INTEGER), word_offsets), Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym175$_), (SubLObject)cb_lexification_wizard.UNPROVIDED);
            start = offsets.first();
            end = number_utilities.f_1X(list_utilities.last_one(offsets));
        }
        return (SubLObject)ConsesLow.list(start, end);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 43967L)
    public static SubLObject derive_relational_template(final SubLObject v_object, final SubLObject arg_spans, final SubLObject arg_speech_parts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cyc_term = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(v_object));
        final SubLObject sentence_words = lexification_utilities.lex_string_tokenize(lexification_wizard.lexwiz_phrase(v_object), (SubLObject)cb_lexification_wizard.T);
        SubLObject generation_template = (SubLObject)cb_lexification_wizard.NIL;
        SubLObject error_msg = (SubLObject)cb_lexification_wizard.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cb_lexification_wizard.$sym159$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    thread.resetMultipleValues();
                    final SubLObject parse_template = relation_lexifier.lexify_relation(cyc_term, arg_spans, sentence_words, arg_speech_parts, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    final SubLObject new_generation_template = thread.secondMultipleValue();
                    final SubLObject old_generation_template = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    generation_template = new_generation_template;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_lexification_wizard.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (cb_lexification_wizard.NIL != error_msg && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str176$Problem_deriving_relation_templat, error_msg);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        lexification_wizard._csetf_lexwiz_error_message(v_object, error_msg);
        return generation_template;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 44881L)
    public static SubLObject handle_parsing_template_lexification(final SubLObject v_object, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lex_parse_template_mt = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str128$_parse_template_mt, args, lexicon_vars.$default_lexification_template_mt$.getDynamicValue(thread));
        final SubLObject lex_parse_template = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str129$_parse_template, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        lexification_wizard.trace_lexification_parameters(v_object, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        lexification_wizard._csetf_lexwiz_parse_template_mt(v_object, lex_parse_template_mt);
        lexification_wizard._csetf_lexwiz_parse_template(v_object, lex_parse_template);
        lexification_wizard.trace_lexification_parameters(v_object, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        if (cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_parse_template)) {
            lexification_wizard.derive_parse_template_formula(v_object);
        }
        return (SubLObject)cb_lexification_wizard.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 45551L)
    public static SubLObject handle_denotation_lexification(final SubLObject v_object, final SubLObject cyc_term, final SubLObject lex_phrase, final SubLObject args) {
        final SubLObject lex_words = (SubLObject)((cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_phrase)) ? lexification_utilities.lex_string_tokenize(lex_phrase, (SubLObject)cb_lexification_wizard.NIL) : cb_lexification_wizard.NIL);
        final SubLObject lex_phrase_len = Sequences.length(lex_words);
        SubLObject lex_position = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str133$_headword_position, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        SubLObject lex_part_of_speech = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str140$_headword_part_of_speech, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject other_part_of_speech = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str141$_choose_part_of_speech, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject add_syntactic_mappingP = html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str142$_add_syntactic_mapping, args);
        final SubLObject syntactic_mt = misc_kb_utilities.fort_for_string(html_utilities.html_extract_input((SubLObject)cb_lexification_wizard.$str145$_syntactic_mt, args));
        SubLObject all_readyP = (SubLObject)cb_lexification_wizard.NIL;
        if (lex_position.equal((SubLObject)cb_lexification_wizard.$str136$Other) || cb_lexification_wizard.NIL != lexification_utilities.lex_empty_stringP(lex_position)) {
            lex_position = html_utilities.html_extract_string((SubLObject)cb_lexification_wizard.$str138$_other_position, args, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        if (lex_position.equal((SubLObject)cb_lexification_wizard.$str16$) && lex_phrase_len.numE((SubLObject)cb_lexification_wizard.ONE_INTEGER)) {
            lex_position = (SubLObject)cb_lexification_wizard.$str177$1;
        }
        final SubLObject position = lexification_wizard.convert_position(lex_position, lex_phrase_len);
        final SubLObject lex_headword = (SubLObject)(position.numG((SubLObject)cb_lexification_wizard.ZERO_INTEGER) ? Sequences.elt(lex_words, Numbers.subtract(position, (SubLObject)cb_lexification_wizard.ONE_INTEGER)) : cb_lexification_wizard.$str16$);
        if (lex_part_of_speech.equal((SubLObject)cb_lexification_wizard.$str136$Other) || cb_lexification_wizard.NIL != lexification_utilities.lex_empty_stringP(lex_part_of_speech)) {
            lex_part_of_speech = other_part_of_speech;
        }
        if (position.numG((SubLObject)cb_lexification_wizard.MINUS_ONE_INTEGER)) {
            lexification_wizard._csetf_lexwiz_headword_position(v_object, position);
        }
        lexification_wizard._csetf_lexwiz_headword_part_of_speech(v_object, lex_part_of_speech);
        if (cb_lexification_wizard.NIL != add_syntactic_mappingP && cb_lexification_wizard.NIL != string_utilities.non_empty_stringP(lex_headword)) {
            lexification_wizard.add_lexical_mapping(lex_headword, misc_kb_utilities.fort_for_string(lex_part_of_speech), syntactic_mt, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        all_readyP = lexification_utilities.all_specifiedP((SubLObject)ConsesLow.list(lex_position, lex_part_of_speech));
        if (cb_lexification_wizard.NIL != all_readyP) {
            lexification_wizard.derive_denotation_formula(v_object);
        }
        return all_readyP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 47563L)
    public static SubLObject handle_user_lexification(final SubLObject v_object, SubLObject user_formula, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexification_wizard.NIL == user_formula && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)cb_lexification_wizard.$str154$Warning__, (SubLObject)cb_lexification_wizard.$str155$____assertion_failed___a______), (SubLObject)cb_lexification_wizard.$sym178$USER_FORMULA);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        SubLObject readyP = (SubLObject)cb_lexification_wizard.NIL;
        if (cb_lexification_wizard.NIL != string_utilities.empty_stringP(string_utilities.trim_whitespace(user_formula))) {
            user_formula = (SubLObject)cb_lexification_wizard.NIL;
            lexification_wizard._csetf_lexwiz_user_editedP(v_object, (SubLObject)cb_lexification_wizard.NIL);
            lexification_wizard._csetf_lexwiz_user_formula(v_object, (SubLObject)cb_lexification_wizard.NIL);
            lexification_wizard._csetf_lexwiz_formula(v_object, (SubLObject)cb_lexification_wizard.NIL);
            lexification_wizard._csetf_lexwiz_state(v_object, (SubLObject)cb_lexification_wizard.$kw48$NEED_APPROVAL);
        }
        if (cb_lexification_wizard.NIL != user_formula) {
            thread.resetMultipleValues();
            final SubLObject new_formula = cb_form_widgets.cb_extract_el_formula_input(args, (SubLObject)cb_lexification_wizard.$list179);
            final SubLObject formula_error = thread.secondMultipleValue();
            final SubLObject formula_error_string = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (cb_lexification_wizard.NIL != formula_error) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                    PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.$str180$Error_in_formula___a__, formula_error);
                    streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                lexification_wizard._csetf_lexwiz_user_editedP(v_object, (SubLObject)cb_lexification_wizard.T);
                lexification_wizard._csetf_lexwiz_user_formula(v_object, user_formula);
                lexification_wizard._csetf_lexwiz_formula(v_object, (SubLObject)cb_lexification_wizard.NIL);
                lexification_wizard._csetf_lexwiz_error_message(v_object, PrintLow.format((SubLObject)cb_lexification_wizard.NIL, (SubLObject)cb_lexification_wizard.$str181$_a_in__a, formula_error, formula_error_string));
            }
            else {
                if (!lexification_wizard.lexwiz_formula(v_object).equalp(new_formula)) {
                    lexification_wizard._csetf_lexwiz_user_editedP(v_object, (SubLObject)cb_lexification_wizard.T);
                    lexification_wizard._csetf_lexwiz_user_formula(v_object, user_formula);
                    lexification_wizard._csetf_lexwiz_formula(v_object, new_formula);
                }
                readyP = (SubLObject)cb_lexification_wizard.T;
            }
        }
        return readyP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 49711L)
    public static SubLObject oe_lexify_next_user_action() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)cb_lexification_wizard.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$use_sme_lexwiz$.currentBinding(thread);
        try {
            lexicon_vars.$use_sme_lexwiz$.bind((SubLObject)cb_lexification_wizard.NIL, thread);
            if (cb_lexification_wizard.NIL == lexification_reminders.valid_lexification_user_actions((SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                lex_loop((SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            result = lexification_reminders.lexify_next_user_action((SubLObject)cb_lexification_wizard.UNPROVIDED);
        }
        finally {
            lexicon_vars.$use_sme_lexwiz$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 50032L)
    public static SubLObject lex_loop(SubLObject number_of_terms) {
        if (number_of_terms == cb_lexification_wizard.UNPROVIDED) {
            number_of_terms = (SubLObject)cb_lexification_wizard.ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_lexification_wizard.NIL == lexification_reminders.lexification_user_actions(api_control_vars.$the_cyclist$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var;
            final SubLObject list_of_terms = cdolist_list_var = query_for_terms(number_of_terms);
            SubLObject v_term = (SubLObject)cb_lexification_wizard.NIL;
            v_term = cdolist_list_var.first();
            while (cb_lexification_wizard.NIL != cdolist_list_var) {
                lexification_reminders.add_lexification_todo(v_term.first(), api_control_vars.$the_cyclist$.getDynamicValue(thread), conses_high.second(v_term), (SubLObject)cb_lexification_wizard.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 50766L)
    public static SubLObject query_for_terms(final SubLObject number_of_results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_terms = ask_utilities.query_variable((SubLObject)cb_lexification_wizard.$sym182$_TERM, (SubLObject)ConsesLow.list(cb_lexification_wizard.$const183$myCreationPurpose, (SubLObject)cb_lexification_wizard.$sym182$_TERM, fi.ke_purpose()), cb_lexification_wizard.$const184$BookkeepingMt, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return filter_lexification_terms(Sort.sort(raw_terms, Symbols.symbol_function((SubLObject)cb_lexification_wizard.$sym185$_), (SubLObject)cb_lexification_wizard.$sym186$FACT_SHEET_TERM_GAF_PRIORITY), number_of_results, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            finally {
                final SubLObject _prev_bind_0_$46 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)cb_lexification_wizard.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 51203L)
    public static SubLObject filter_lexification_terms(final SubLObject raw_terms, final SubLObject desired_count, SubLObject ignore_need_lex_flagP) {
        if (ignore_need_lex_flagP == cb_lexification_wizard.UNPROVIDED) {
            ignore_need_lex_flagP = (SubLObject)cb_lexification_wizard.NIL;
        }
        lexicon_utilities.clear_cached_lexifications_for_term();
        SubLObject unlexified_terms = (SubLObject)cb_lexification_wizard.NIL;
        SubLObject doneP = (SubLObject)cb_lexification_wizard.NIL;
        if (cb_lexification_wizard.NIL == doneP) {
            SubLObject csome_list_var = raw_terms;
            SubLObject v_term = (SubLObject)cb_lexification_wizard.NIL;
            v_term = csome_list_var.first();
            while (cb_lexification_wizard.NIL == doneP && cb_lexification_wizard.NIL != csome_list_var) {
                if (cb_lexification_wizard.NIL != lexification_utilities.unlexifiedP(v_term, (SubLObject)cb_lexification_wizard.UNPROVIDED) && cb_lexification_wizard.NIL == subl_promotions.memberP(v_term, dictionary.dictionary_lookup_without_values(cb_lexification_wizard.$skipped_lexwiz_terms$.getGlobalValue(), operation_communication.the_cyclist(), (SubLObject)cb_lexification_wizard.NIL), (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED)) {
                    final SubLObject term_string = pph_main.generate_phrase(v_term, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                    unlexified_terms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_term, term_string), unlexified_terms);
                    if (desired_count != cb_lexification_wizard.NIL && Sequences.length(unlexified_terms).numGE(desired_count)) {
                        doneP = (SubLObject)cb_lexification_wizard.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            }
        }
        return unlexified_terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 51906L)
    public static SubLObject add_terms_of_type(final SubLObject type, SubLObject ignore_need_lex_flagP) {
        if (ignore_need_lex_flagP == cb_lexification_wizard.UNPROVIDED) {
            ignore_need_lex_flagP = (SubLObject)cb_lexification_wizard.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject raw_terms = isa.all_fort_instances(type, cb_lexification_wizard.$const187$InferencePSC, (SubLObject)cb_lexification_wizard.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject filtered_terms_and_strings = cdolist_list_var = filter_lexification_terms(raw_terms, (SubLObject)cb_lexification_wizard.NIL, ignore_need_lex_flagP);
        SubLObject term_and_string = (SubLObject)cb_lexification_wizard.NIL;
        term_and_string = cdolist_list_var.first();
        while (cb_lexification_wizard.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = term_and_string;
            SubLObject cycl_term = (SubLObject)cb_lexification_wizard.NIL;
            SubLObject string = (SubLObject)cb_lexification_wizard.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexification_wizard.$list188);
            cycl_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_lexification_wizard.$list188);
            string = current.first();
            current = current.rest();
            if (cb_lexification_wizard.NIL == current) {
                lexification_reminders.add_lexification_todo(cycl_term, api_control_vars.$the_cyclist$.getDynamicValue(thread), string, (SubLObject)cb_lexification_wizard.UNPROVIDED);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_lexification_wizard.$list188);
            }
            cdolist_list_var = cdolist_list_var.rest();
            term_and_string = cdolist_list_var.first();
        }
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 52403L)
    public static SubLObject mark_term_lexified(final SubLObject v_term) {
        if (cb_lexification_wizard.NIL == set.set_p(cb_lexification_wizard.$known_lexified_terms$.getGlobalValue())) {
            cb_lexification_wizard.$known_lexified_terms$.setGlobalValue(set.new_set((SubLObject)cb_lexification_wizard.EQUAL, (SubLObject)cb_lexification_wizard.UNPROVIDED));
        }
        return set.set_add(v_term, cb_lexification_wizard.$known_lexified_terms$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 52588L)
    public static SubLObject term_known_lexifiedP(final SubLObject v_term) {
        return set.set_memberP(v_term, cb_lexification_wizard.$known_lexified_terms$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-wizard.lisp", position = 52684L)
    public static SubLObject cb_print_sec_assertions(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sec_assertions = kb_mapping.gather_gaf_arg_index(v_term, (SubLObject)cb_lexification_wizard.ONE_INTEGER, cb_lexification_wizard.$const190$synonymousExternalConcept, narts_high.nart_substitute((SubLObject)cb_lexification_wizard.$list191), (SubLObject)cb_lexification_wizard.UNPROVIDED);
        if (cb_lexification_wizard.NIL != sec_assertions) {
            SubLObject cdolist_list_var = sec_assertions;
            SubLObject assertion = (SubLObject)cb_lexification_wizard.NIL;
            assertion = cdolist_list_var.first();
            while (cb_lexification_wizard.NIL != cdolist_list_var) {
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ((SubLObject)cb_lexification_wizard.$str192$Mt__);
                cb_utilities.cb_form(assertions_high.assertion_mt(assertion), (SubLObject)cb_lexification_wizard.UNPROVIDED, (SubLObject)cb_lexification_wizard.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                cb_utilities.cb_show_assertion_readably(assertion, cb_parameters.$cb_c_wrap_assertions$.getDynamicValue(thread), (SubLObject)cb_lexification_wizard.NIL);
                html_utilities.html_newline((SubLObject)cb_lexification_wizard.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    public static SubLObject declare_cb_lexification_wizard_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "cb_link_lexification_wizard", "CB-LINK-LEXIFICATION-WIZARD", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_lexification_wizard", "cond_html_font_color", "COND-HTML-FONT-COLOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "cb_invoke_oe_lexification_wizard", "CB-INVOKE-OE-LEXIFICATION-WIZARD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "show_lexwiz_stages_diagram", "SHOW-LEXWIZ-STAGES-DIAGRAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "init_basic_lexification", "INIT-BASIC-LEXIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "init_formula_lexification", "INIT-FORMULA-LEXIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "init_name_lexification", "INIT-NAME-LEXIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "init_relation_lexification", "INIT-RELATION-LEXIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "init_parsing_template_lexification", "INIT-PARSING-TEMPLATE-LEXIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "init_denotation_lexification", "INIT-DENOTATION-LEXIFICATION", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "or2", "OR2", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "or3", "OR3", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "cb_handle_oe_lexification_wizard", "CB-HANDLE-OE-LEXIFICATION-WIZARD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "report_lexification_result", "REPORT-LEXIFICATION-RESULT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "handle_name_lexification", "HANDLE-NAME-LEXIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "handle_relation_lexification", "HANDLE-RELATION-LEXIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "extract_arg_specs", "EXTRACT-ARG-SPECS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "word_offsets_to_span", "WORD-OFFSETS-TO-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "derive_relational_template", "DERIVE-RELATIONAL-TEMPLATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "handle_parsing_template_lexification", "HANDLE-PARSING-TEMPLATE-LEXIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "handle_denotation_lexification", "HANDLE-DENOTATION-LEXIFICATION", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "handle_user_lexification", "HANDLE-USER-LEXIFICATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "oe_lexify_next_user_action", "OE-LEXIFY-NEXT-USER-ACTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "lex_loop", "LEX-LOOP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "query_for_terms", "QUERY-FOR-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "filter_lexification_terms", "FILTER-LEXIFICATION-TERMS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "add_terms_of_type", "ADD-TERMS-OF-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "mark_term_lexified", "MARK-TERM-LEXIFIED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "term_known_lexifiedP", "TERM-KNOWN-LEXIFIED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_wizard", "cb_print_sec_assertions", "CB-PRINT-SEC-ASSERTIONS", 1, 0, false);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    public static SubLObject init_cb_lexification_wizard_file() {
        cb_lexification_wizard.$skipped_lexwiz_terms$ = SubLFiles.deflexical("*SKIPPED-LEXWIZ-TERMS*", (cb_lexification_wizard.NIL != Symbols.boundp((SubLObject)cb_lexification_wizard.$sym0$_SKIPPED_LEXWIZ_TERMS_)) ? cb_lexification_wizard.$skipped_lexwiz_terms$.getGlobalValue() : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)cb_lexification_wizard.EQL), (SubLObject)cb_lexification_wizard.UNPROVIDED));
        cb_lexification_wizard.$streamlined_lexwizP$ = SubLFiles.deflexical("*STREAMLINED-LEXWIZ?*", (SubLObject)((cb_lexification_wizard.NIL != Symbols.boundp((SubLObject)cb_lexification_wizard.$sym1$_STREAMLINED_LEXWIZ__)) ? cb_lexification_wizard.$streamlined_lexwizP$.getGlobalValue() : cb_lexification_wizard.NIL));
        cb_lexification_wizard.$known_lexified_terms$ = SubLFiles.deflexical("*KNOWN-LEXIFIED-TERMS*", (cb_lexification_wizard.NIL != Symbols.boundp((SubLObject)cb_lexification_wizard.$sym189$_KNOWN_LEXIFIED_TERMS_)) ? cb_lexification_wizard.$known_lexified_terms$.getGlobalValue() : set.new_set((SubLObject)cb_lexification_wizard.EQUAL, (SubLObject)cb_lexification_wizard.UNPROVIDED));
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    public static SubLObject setup_cb_lexification_wizard_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)cb_lexification_wizard.$sym0$_SKIPPED_LEXWIZ_TERMS_);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_lexification_wizard.$sym1$_STREAMLINED_LEXWIZ__);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexification_wizard.$kw5$LEXIFICATION_WIZARD, (SubLObject)cb_lexification_wizard.$sym6$CB_LINK_LEXIFICATION_WIZARD, (SubLObject)cb_lexification_wizard.ONE_INTEGER);
        Hashtables.sethash((SubLObject)cb_lexification_wizard.$kw7$LEXWIZ, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_lexification_wizard.$str8$lexwiz_html, (SubLObject)cb_lexification_wizard.NIL));
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_wizard.$sym65$CB_INVOKE_OE_LEXIFICATION_WIZARD, (SubLObject)cb_lexification_wizard.$kw66$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_wizard.$sym157$CB_HANDLE_OE_LEXIFICATION_WIZARD, (SubLObject)cb_lexification_wizard.$kw66$HTML_HANDLER);
        subl_macro_promotions.declare_defglobal((SubLObject)cb_lexification_wizard.$sym189$_KNOWN_LEXIFIED_TERMS_);
        return (SubLObject)cb_lexification_wizard.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_lexification_wizard_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_lexification_wizard_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_lexification_wizard_file();
    }
    
    static {
        me = (SubLFile)new cb_lexification_wizard();
        cb_lexification_wizard.$skipped_lexwiz_terms$ = null;
        cb_lexification_wizard.$streamlined_lexwizP$ = null;
        cb_lexification_wizard.$known_lexified_terms$ = null;
        $sym0$_SKIPPED_LEXWIZ_TERMS_ = SubLObjectFactory.makeSymbol("*SKIPPED-LEXWIZ-TERMS*");
        $sym1$_STREAMLINED_LEXWIZ__ = SubLObjectFactory.makeSymbol("*STREAMLINED-LEXWIZ?*");
        $str2$lexification_wizard = SubLObjectFactory.makeString("lexification-wizard");
        $kw3$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str4$cb_invoke_oe_lexification_wizard = SubLObjectFactory.makeString("cb-invoke-oe-lexification-wizard");
        $kw5$LEXIFICATION_WIZARD = SubLObjectFactory.makeKeyword("LEXIFICATION-WIZARD");
        $sym6$CB_LINK_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("CB-LINK-LEXIFICATION-WIZARD");
        $kw7$LEXWIZ = SubLObjectFactory.makeKeyword("LEXWIZ");
        $str8$lexwiz_html = SubLObjectFactory.makeString("lexwiz.html");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*HTML-INPUT-DISABLED?*"));
        $sym12$HTML_FONT_COLOR = SubLObjectFactory.makeSymbol("HTML-FONT-COLOR");
        $sym13$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $str14$the_Lexification_Assistant = SubLObjectFactory.makeString("the Lexification Assistant");
        $str15$_id = SubLObjectFactory.makeString(":id");
        $str16$ = SubLObjectFactory.makeString("");
        $str17$color_gray = SubLObjectFactory.makeString("color:gray");
        $str18$Cycorp_Lexification_Assistant = SubLObjectFactory.makeString("Cycorp Lexification Assistant");
        $str19$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str20$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw21$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw22$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw23$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw24$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str25$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str26$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str27$button = SubLObjectFactory.makeString("button");
        $str28$reload = SubLObjectFactory.makeString("reload");
        $str29$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str30$post = SubLObjectFactory.makeString("post");
        $str31$cb_handle_oe_lexification_wizard = SubLObjectFactory.makeString("cb-handle-oe-lexification-wizard");
        $str32$_Specify_the_parameters_needed_fo = SubLObjectFactory.makeString(" Specify the parameters needed for lexification");
        $str33$Reset_All = SubLObjectFactory.makeString("Reset All");
        $str34$_reset = SubLObjectFactory.makeString(":reset");
        $str35$lexwiz_main_params = SubLObjectFactory.makeString("lexwiz-main-params");
        $str36$basic_info = SubLObjectFactory.makeString("basic-info");
        $str37$Basic_Information___ = SubLObjectFactory.makeString("Basic Information : ");
        $kw38$VISIBLE = SubLObjectFactory.makeKeyword("VISIBLE");
        $kw39$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $str40$formula_info = SubLObjectFactory.makeString("formula-info");
        $str41$Formula___ = SubLObjectFactory.makeString("Formula : ");
        $kw42$DONE = SubLObjectFactory.makeKeyword("DONE");
        $str43$Status___OK = SubLObjectFactory.makeString("Status : OK");
        $kw44$RED = SubLObjectFactory.makeKeyword("RED");
        $str45$Error__ = SubLObjectFactory.makeString("Error :");
        $str46$Next__ = SubLObjectFactory.makeString("Next->");
        $kw47$FRESH = SubLObjectFactory.makeKeyword("FRESH");
        $kw48$NEED_APPROVAL = SubLObjectFactory.makeKeyword("NEED-APPROVAL");
        $str49$Lexify = SubLObjectFactory.makeString("Lexify");
        $str50$Assert = SubLObjectFactory.makeString("Assert");
        $str51$Assert_and_Relexify = SubLObjectFactory.makeString("Assert and Relexify");
        $str52$_relexify = SubLObjectFactory.makeString(":relexify");
        $int53$40 = SubLObjectFactory.makeInteger(40);
        $str54$Get_Next_Lexification = SubLObjectFactory.makeString("Get Next Lexification");
        $str55$_next_action = SubLObjectFactory.makeString(":next-action");
        $str56$Skip_Lexification = SubLObjectFactory.makeString("Skip Lexification");
        $str57$_skip_action = SubLObjectFactory.makeString(":skip-action");
        $str58$Reason__optional___ = SubLObjectFactory.makeString("Reason (optional): ");
        $str59$_comment = SubLObjectFactory.makeString(":comment");
        $str60$_Invoke_Dictionary_Assistant_ = SubLObjectFactory.makeString("[Invoke Dictionary Assistant]");
        $str61$Note__For_guided_lexification__us = SubLObjectFactory.makeString("Note: For guided lexification, use the SME lexwiz instead: ");
        $kw62$SME_LEXIFY_TERM = SubLObjectFactory.makeKeyword("SME-LEXIFY-TERM");
        $str63$edit_formula = SubLObjectFactory.makeString("edit-formula");
        $kw64$INVISIBLE = SubLObjectFactory.makeKeyword("INVISIBLE");
        $sym65$CB_INVOKE_OE_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("CB-INVOKE-OE-LEXIFICATION-WIZARD");
        $kw66$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $str67$lexwiz_stages = SubLObjectFactory.makeString("lexwiz-stages");
        $str68$font_family__sans_serif__color__D = SubLObjectFactory.makeString("font-family: sans-serif; color: DimGray");
        $str69$_87CEFA = SubLObjectFactory.makeString("#87CEFA");
        $str70$_B0C4DE = SubLObjectFactory.makeString("#B0C4DE");
        $str71$padding__5___outline_darkblue_sol = SubLObjectFactory.makeString("padding: 5%; outline:darkblue solid thin;");
        $kw72$NEED_INPUT = SubLObjectFactory.makeKeyword("NEED-INPUT");
        $str73$color_DimGray = SubLObjectFactory.makeString("color:DimGray");
        $str74$Stages_ = SubLObjectFactory.makeString("Stages:");
        $str75$Gathering = SubLObjectFactory.makeString("Gathering");
        $str76$__x2009___x2009_ = SubLObjectFactory.makeString("&#x2009;&#x2009;");
        $str77$font_size__large = SubLObjectFactory.makeString("font-size: large");
        $str78$__x21E8_ = SubLObjectFactory.makeString("&#x21E8;");
        $str79$Reviewing = SubLObjectFactory.makeString("Reviewing");
        $str80$Asserting = SubLObjectFactory.makeString("Asserting");
        $str81$_cyc_term = SubLObjectFactory.makeString(":cyc-term");
        $str82$Complete = SubLObjectFactory.makeString("Complete");
        $kw83$BLACK = SubLObjectFactory.makeKeyword("BLACK");
        $kw84$BLUE = SubLObjectFactory.makeKeyword("BLUE");
        $str85$Term__ = SubLObjectFactory.makeString("Term :");
        $str86$Clear_Term = SubLObjectFactory.makeString("Clear Term");
        $str87$_create_term = SubLObjectFactory.makeString(":create-term");
        $str88$Create_Term_ = SubLObjectFactory.makeString("Create Term?");
        $str89$Phrase__ = SubLObjectFactory.makeString("Phrase :");
        $str90$_phrase = SubLObjectFactory.makeString(":phrase");
        $str91$Clear_Phrase = SubLObjectFactory.makeString("Clear Phrase");
        $str92$_is_preferred = SubLObjectFactory.makeString(":is-preferred");
        $str93$Is_preferred_ = SubLObjectFactory.makeString("Is preferred?");
        $kw94$PRECISE = SubLObjectFactory.makeKeyword("PRECISE");
        $str95$_is_precise = SubLObjectFactory.makeString(":is-precise");
        $str96$Is_precise_ = SubLObjectFactory.makeString("Is precise?");
        $str97$_is_proper_name = SubLObjectFactory.makeString(":is-proper-name");
        $str98$Is_proper_name_ = SubLObjectFactory.makeString("Is proper name?");
        $str99$_nonrelational = SubLObjectFactory.makeString(":nonrelational");
        $str100$Nonrelational_lexification_ = SubLObjectFactory.makeString("Nonrelational lexification?");
        $str101$Mt__ = SubLObjectFactory.makeString("Mt :");
        $str102$_lexification_mt = SubLObjectFactory.makeString(":lexification-mt");
        $str103$Assertion_Editor___ = SubLObjectFactory.makeString("Assertion Editor : ");
        $int104$60 = SubLObjectFactory.makeInteger(60);
        $str105$Formula_for_editor___A__ = SubLObjectFactory.makeString("Formula for editor: ~A~%");
        $kw106$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $str107$_user_formula = SubLObjectFactory.makeString(":user-formula");
        $kw108$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $kw109$CYCLIFY_LABEL = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $str110$Cyclify = SubLObjectFactory.makeString("Cyclify");
        $kw111$CLEAR_LABEL = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $str112$Clear = SubLObjectFactory.makeString("Clear");
        $kw113$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw114$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $str115$_user_formula_copy = SubLObjectFactory.makeString(":user-formula-copy");
        $str116$Proper_name_predicate__ = SubLObjectFactory.makeString("Proper name predicate :");
        $str117$_lexification_predicate = SubLObjectFactory.makeString(":lexification-predicate");
        $sym118$TO_STRING = SubLObjectFactory.makeSymbol("TO-STRING");
        $str119$arg_spec = SubLObjectFactory.makeString("arg-spec");
        $str120$pred_arg_info = SubLObjectFactory.makeString("pred-arg-info");
        $str121$Argument_specification__ = SubLObjectFactory.makeString("Argument specification :");
        $str122$Arg___A__ = SubLObjectFactory.makeString("Arg. ~A :");
        $sym123$STRING_TO_INTEGER = SubLObjectFactory.makeSymbol("STRING-TO-INTEGER");
        $str124$_arg_offset__A = SubLObjectFactory.makeString(":arg-offset-~A");
        $sym125$STRING_FOR_FORT = SubLObjectFactory.makeSymbol("STRING-FOR-FORT");
        $str126$_arg_speech_part__A = SubLObjectFactory.makeString(":arg-speech-part-~A");
        $str127$Parse_Template_Specification = SubLObjectFactory.makeString("Parse Template Specification");
        $str128$_parse_template_mt = SubLObjectFactory.makeString(":parse-template-mt");
        $str129$_parse_template = SubLObjectFactory.makeString(":parse-template");
        $int130$80 = SubLObjectFactory.makeInteger(80);
        $str131$virtual = SubLObjectFactory.makeString("virtual");
        $str132$Headword_position__ = SubLObjectFactory.makeString("Headword position :");
        $str133$_headword_position = SubLObjectFactory.makeString(":headword-position");
        $str134$First = SubLObjectFactory.makeString("First");
        $str135$Last = SubLObjectFactory.makeString("Last");
        $str136$Other = SubLObjectFactory.makeString("Other");
        $str137$Other___a__a__ = SubLObjectFactory.makeString("Other (~a-~a) ");
        $str138$_other_position = SubLObjectFactory.makeString(":other-position");
        $str139$Headword_part_of_speech__ = SubLObjectFactory.makeString("Headword part of speech :");
        $str140$_headword_part_of_speech = SubLObjectFactory.makeString(":headword-part-of-speech");
        $str141$_choose_part_of_speech = SubLObjectFactory.makeString(":choose-part-of-speech");
        $str142$_add_syntactic_mapping = SubLObjectFactory.makeString(":add-syntactic-mapping");
        $str143$_Add_mapping_ = SubLObjectFactory.makeString(" Add mapping?");
        $str144$Mapping_Mt__ = SubLObjectFactory.makeString("Mapping Mt: ");
        $str145$_syntactic_mt = SubLObjectFactory.makeString(":syntactic-mt");
        $str146$cb_handle_oe_lexification_wizard_ = SubLObjectFactory.makeString("cb-handle-oe-lexification-wizard(~A)~%");
        $const147$cyclistNotes = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("cyclistNotes"));
        $const148$needsHandLexification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("needsHandLexification"));
        $const149$termStrings = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termStrings"));
        $str150$Missing_information__see_blue_hig = SubLObjectFactory.makeString("Missing information (see blue highlights)");
        $str151$Invalid_Cyc_term = SubLObjectFactory.makeString("Invalid Cyc term");
        $str152$Invalid_Cyc_MT = SubLObjectFactory.makeString("Invalid Cyc MT");
        $list153 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FRESH"), (SubLObject)SubLObjectFactory.makeKeyword("NEED-INPUT"));
        $str154$Warning__ = SubLObjectFactory.makeString("Warning: ");
        $str155$____assertion_failed___a______ = SubLObjectFactory.makeString("*** assertion failed: ~a ***~%");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("READY?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-ERROR-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEXWIZ-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FRESH"), (SubLObject)SubLObjectFactory.makeKeyword("NEED-INPUT")))));
        $sym157$CB_HANDLE_OE_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("CB-HANDLE-OE-LEXIFICATION-WIZARD");
        $str158$Post_lexification_error = SubLObjectFactory.makeString("Post-lexification error");
        $sym159$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str160$Lexification_successful_for__a = SubLObjectFactory.makeString("Lexification successful for ~a");
        $str161$Added__s_ = SubLObjectFactory.makeString("Added ~s.");
        $str162$Other_ways_of_referring_to__a_ = SubLObjectFactory.makeString("Other ways of referring to ~a:");
        $str163$_____a = SubLObjectFactory.makeString("    ~a");
        $str164$No_other_ways_of_referring_to__a = SubLObjectFactory.makeString("No other ways of referring to ~a");
        $str165$Unable_to_confirm_lexification___ = SubLObjectFactory.makeString("Unable to confirm lexification: ~S for ~S");
        $str166$Internal_error_during_lexificatio = SubLObjectFactory.makeString("Internal error during lexification confirmation:");
        $sym167$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str168$_arg_offset_ = SubLObjectFactory.makeString(":arg-offset-");
        $sym169$WORD_OFFSETS_TO_SPAN = SubLObjectFactory.makeSymbol("WORD-OFFSETS-TO-SPAN");
        $str170$_arg_speech_part_ = SubLObjectFactory.makeString(":arg-speech-part-");
        $sym171$FORT_FOR_STRING = SubLObjectFactory.makeSymbol("FORT-FOR-STRING");
        $str172$The_relation_arguments_must_be_sp = SubLObjectFactory.makeString("The relation arguments must be specified");
        $str173$_A_A = SubLObjectFactory.makeString("~A~A");
        $sym174$EXTRACT_INTEGER = SubLObjectFactory.makeSymbol("EXTRACT-INTEGER");
        $sym175$_ = SubLObjectFactory.makeSymbol("<");
        $str176$Problem_deriving_relation_templat = SubLObjectFactory.makeString("Problem deriving relation template: ~A~%");
        $str177$1 = SubLObjectFactory.makeString("1");
        $sym178$USER_FORMULA = SubLObjectFactory.makeSymbol("USER-FORMULA");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT-NAME"), (SubLObject)SubLObjectFactory.makeString(":user-formula"));
        $str180$Error_in_formula___a__ = SubLObjectFactory.makeString("Error in formula: ~a~%");
        $str181$_a_in__a = SubLObjectFactory.makeString("~a in ~a");
        $sym182$_TERM = SubLObjectFactory.makeSymbol("?TERM");
        $const183$myCreationPurpose = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("myCreationPurpose"));
        $const184$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym185$_ = SubLObjectFactory.makeSymbol(">");
        $sym186$FACT_SHEET_TERM_GAF_PRIORITY = SubLObjectFactory.makeSymbol("FACT-SHEET-TERM-GAF-PRIORITY");
        $const187$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $sym189$_KNOWN_LEXIFIED_TERMS_ = SubLObjectFactory.makeSymbol("*KNOWN-LEXIFIED-TERMS*");
        $const190$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $list191 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextOfPCWFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SemanticDBOntology")));
        $str192$Mt__ = SubLObjectFactory.makeString("Mt: ");
    }
}

/*

	Total time: 979 ms
	
*/