package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_pph_phrase_browser extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_pph_phrase_browser";
    public static final String myFingerPrint = "8ff6f27f560c1e8d3e2d8888bd8d9877f023b7f8f0cf7b9825cdfdb67abebe6f";
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
    private static SubLSymbol $max_gen_template_phrase_id_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
    private static SubLSymbol $pph_phrase_id_demerits_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 10057L)
    private static SubLSymbol $cb_pph_category_abbreviations$;
    private static final SubLList $list0;
    private static final SubLString $str1$_A_did_not_specify_a_valid_pph_ph;
    private static final SubLSymbol $sym2$CB_PPH_PHRASE;
    private static final SubLSymbol $kw3$HTML_HANDLER;
    private static final SubLSymbol $sym4$CB_PPH_PHRASES;
    private static final SubLSymbol $sym5$CB_HANDLE_PPH_PHRASES;
    private static final SubLString $str6$max_count;
    private static final SubLInteger $int7$100;
    private static final SubLString $str8$category;
    private static final SubLSymbol $kw9$ALL;
    private static final SubLString $str10$nl_pred;
    private static final SubLString $str11$min_demerits;
    private static final SubLString $str12$max_demerits;
    private static final SubLString $str13$sort_field;
    private static final SubLSymbol $kw14$ID;
    private static final SubLString $str15$sort_order;
    private static final SubLSymbol $kw16$DESCENDING;
    private static final SubLString $str17$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str18$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw19$UNINITIALIZED;
    private static final SubLSymbol $kw20$CB_CYC;
    private static final SubLString $str21$PPH_Phrases;
    private static final SubLString $str22$post;
    private static final SubLString $str23$Max_count_;
    private static final SubLString $str24$5em;
    private static final SubLString $str25$Category_;
    private static final SubLObject $const26$Verb;
    private static final SubLObject $const27$Noun;
    private static final SubLObject $const28$Adjective;
    private static final SubLObject $const29$NounPhrase;
    private static final SubLObject $const30$PrepositionalPhrase;
    private static final SubLObject $const31$NLSentence;
    private static final SubLString $str32$Predicate_;
    private static final SubLObject $const33$tensed;
    private static final SubLObject $const34$gerund;
    private static final SubLObject $const35$nameString;
    private static final SubLObject $const36$nonPlural_Generic;
    private static final SubLObject $const37$nonSingular_Generic;
    private static final SubLString $str38$Min_demerits_;
    private static final SubLString $str39$Max_demerits_;
    private static final SubLString $str40$Sort_by_;
    private static final SubLSymbol $kw41$DEMERITS;
    private static final SubLSymbol $kw42$ASCENDING;
    private static final SubLString $str43$Refresh;
    private static final SubLString $str44$submit;
    private static final SubLSymbol $kw45$PPH_PHRASE;
    private static final SubLSymbol $sym46$MAX_GEN_TEMPLATE_PHRASE_ID;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$_MAX_GEN_TEMPLATE_PHRASE_ID_CACHING_STATE_;
    private static final SubLSymbol $sym49$PPH_PHRASE_ID_DEMERITS;
    private static final SubLSymbol $sym50$_PPH_PHRASE_ID_DEMERITS_CACHING_STATE_;
    private static final SubLInteger $int51$4096;
    private static final SubLSymbol $sym52$_;
    private static final SubLSymbol $sym53$_;
    private static final SubLSymbol $sym54$PPH_PHRASE_SUID;
    private static final SubLSymbol $sym55$PPH_PHRASE_DEMERITS;
    private static final SubLString $str56$pph_phrase_png;
    private static final SubLString $str57$;
    private static final SubLSymbol $kw58$TERSE;
    private static final SubLSymbol $kw59$SELF;
    private static final SubLString $str60$background_color_;
    private static final SubLList $list61;
    private static final SubLString $str62$cb_pph_phrase__A;
    private static final SubLString $str63$pphphraseicon;
    private static final SubLString $str64$absmiddle;
    private static final SubLSymbol $kw65$TOP;
    private static final SubLString $str66$_A;
    private static final SubLSymbol $kw67$MINIMAL;
    private static final SubLString $str68$_;
    private static final SubLString $str69$_;
    private static final SubLInteger $int70$30;
    private static final SubLString $str71$_;
    private static final SubLString $str72$_Phr_;
    private static final SubLSymbol $kw73$VERBOSE;
    private static final SubLString $str74$_PPH_Phrase_;
    private static final SubLString $str75$__;
    private static final SubLSymbol $sym76$CB_LINK_PPH_PHRASE;
    private static final SubLSymbol $sym77$CB_FORM_SIGN_METHOD;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$PPH_GENL_POS_;
    private static final SubLString $str80$PPH_Phrase;
    private static final SubLString $str81$phrase;
    private static final SubLSymbol $kw82$CENTER;
    private static final SubLString $str83$100_;
    private static final SubLString $str84$10_;
    private static final SubLString $str85$Alternative___D;
    private static final SubLString $str86$_PPH_error_level_;
    private static final SubLString $str87$__;
    private static final SubLString $str88$Done__S_alternatives_of__S;
    private static final SubLInteger $int89$255;
    private static final SubLString $str90$__2__0X_2__0X_2__0X;
    private static final SubLString $str91$head_dtr;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$HTML_FANCY_TABLE_ROW;
    private static final SubLSymbol $sym94$HTML_FANCY_TABLE_DATA;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$HTML_FORMAT;
    private static final SubLString $str97$_A_;
    private static final SubLString $str98$focal;
    private static final SubLSymbol $kw99$RIGHT;
    private static final SubLString $str100$SUID;
    private static final SubLString $str101$Special_Type;
    private static final SubLString $str102$Arg_Position;
    private static final SubLString $str103$Top_Level;
    private static final SubLString $str104$Category;
    private static final SubLString $str105$String;
    private static final SubLString $str106$Symbol;
    private static final SubLString $str107$Demerits;
    private static final SubLString $str108$___A_;
    private static final SubLString $str109$Word;
    private static final SubLString $str110$CycL;
    private static final SubLString $str111$Case;
    private static final SubLString $str112$Agreement;
    private static final SubLString $str113$Justification;
    private static final SubLSymbol $kw114$HL_SUPPORT;
    private static final SubLSymbol $kw115$NONE;
    private static final SubLString $str116$Inferences;
    private static final SubLSymbol $kw117$INFERENCE;
    private static final SubLSymbol $kw118$VERY_VERBOSE;
    private static final SubLString $str119$Output_List;
    private static final SubLString $str120$output_list;
    private static final SubLString $str121$Problems;
    private static final SubLString $str122$problems;
    private static final SubLList $list123;
    private static final SubLString $str124$__;
    private static final SubLString $str125$_;
    private static final SubLString $str126$ArgPos;
    private static final SubLString $str127$AgrPred;
    private static final SubLString $str128$__;
    private static final SubLString $str129$_;
    private static final SubLString $str130$Absolute___A;
    private static final SubLString $str131$Relative___A_to_;
    private static final SubLString $str132$___;
    private static final SubLString $str133$_No_Paraphrase_;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 872L)
    public static SubLObject cb_pph_phrase(final SubLObject args) {
        SubLObject pph_phrase_id_string = (SubLObject)cb_pph_phrase_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(args, args, (SubLObject)cb_pph_phrase_browser.$list0);
        pph_phrase_id_string = args.first();
        final SubLObject current = args.rest();
        if (cb_pph_phrase_browser.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(args, (SubLObject)cb_pph_phrase_browser.$list0);
            return (SubLObject)cb_pph_phrase_browser.NIL;
        }
        final SubLObject v_pph_phrase = cb_guess_pph_phrase(pph_phrase_id_string);
        if (cb_pph_phrase_browser.NIL == pph_data_structures.valid_pph_phrase_p(v_pph_phrase)) {
            return cb_utilities.cb_error((SubLObject)cb_pph_phrase_browser.$str1$_A_did_not_specify_a_valid_pph_ph, args, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        }
        return cb_pph_phrase_guts(v_pph_phrase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 1223L)
    public static SubLObject cb_pph_phrases(final SubLObject args) {
        return cb_pph_phrases_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 1348L)
    public static SubLObject cb_handle_pph_phrases(final SubLObject args) {
        return cb_pph_phrases_internal(args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 1480L)
    public static SubLObject cb_pph_phrases_internal(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject max_count = html_utilities.html_extract_integer((SubLObject)cb_pph_phrase_browser.$str6$max_count, args, (SubLObject)cb_pph_phrase_browser.$int7$100);
        final SubLObject category_val = html_utilities.html_extract_value((SubLObject)cb_pph_phrase_browser.$str8$category, args, (SubLObject)cb_pph_phrase_browser.$kw9$ALL);
        final SubLObject category_const = cb_utilities.cb_guess_constant(category_val);
        final SubLObject category = (SubLObject)((cb_pph_phrase_browser.NIL != category_const) ? category_const : cb_pph_phrase_browser.$kw9$ALL);
        final SubLObject nl_pred_val = html_utilities.html_extract_value((SubLObject)cb_pph_phrase_browser.$str10$nl_pred, args, (SubLObject)cb_pph_phrase_browser.$kw9$ALL);
        final SubLObject nl_pred_const = cb_utilities.cb_guess_constant(nl_pred_val);
        final SubLObject nl_pred = (SubLObject)((cb_pph_phrase_browser.NIL != nl_pred_const) ? nl_pred_const : cb_pph_phrase_browser.$kw9$ALL);
        final SubLObject min_demerits = html_utilities.html_extract_integer((SubLObject)cb_pph_phrase_browser.$str11$min_demerits, args, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER);
        final SubLObject max_demerits_val = html_utilities.html_extract_value((SubLObject)cb_pph_phrase_browser.$str12$max_demerits, args, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        final SubLObject max_demerits = (cb_pph_phrase_browser.NIL != string_utilities.non_empty_stringP(max_demerits_val) && cb_pph_phrase_browser.NIL != string_utilities.digit_stringP(max_demerits_val)) ? reader.parse_integer(max_demerits_val, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED) : number_utilities.positive_infinity();
        final SubLObject sort_field = html_utilities.html_extract_keyword((SubLObject)cb_pph_phrase_browser.$str13$sort_field, args, (SubLObject)cb_pph_phrase_browser.$kw14$ID);
        final SubLObject sort_order = html_utilities.html_extract_keyword((SubLObject)cb_pph_phrase_browser.$str15$sort_order, args, (SubLObject)cb_pph_phrase_browser.$kw16$DESCENDING);
        final SubLObject phrases_to_view = gather_pph_phrases_int(max_count, category, nl_pred, min_demerits, max_demerits, sort_field, sort_order);
        html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str17$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_pph_phrase_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str18$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_pph_phrase_browser.$kw19$UNINITIALIZED) ? ConsesLow.list(cb_pph_phrase_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_pph_phrase_browser.$kw20$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str21$PPH_Phrases);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_pph_phrase_browser.NIL);
                    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str22$post);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    if (cb_pph_phrase_browser.NIL != frame_name_var) {
                        html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup(frame_name_var);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_macros.$within_html_form$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                        html_utilities.html_hidden_input((SubLObject)cb_pph_phrase_browser.$sym5$CB_HANDLE_PPH_PHRASES, (SubLObject)cb_pph_phrase_browser.T, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str23$Max_count_);
                        html_utilities.html_text_input((SubLObject)cb_pph_phrase_browser.$str6$max_count, max_count, (SubLObject)cb_pph_phrase_browser.$str24$5em);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str25$Category_);
                        html_utilities.html_create_simple_dropdown_list((SubLObject)cb_pph_phrase_browser.$str8$category, (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$kw9$ALL, cb_pph_phrase_browser.$const26$Verb, cb_pph_phrase_browser.$const27$Noun, cb_pph_phrase_browser.$const28$Adjective, cb_pph_phrase_browser.$const29$NounPhrase, cb_pph_phrase_browser.$const30$PrepositionalPhrase, cb_pph_phrase_browser.$const31$NLSentence), category);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str32$Predicate_);
                        html_utilities.html_create_simple_dropdown_list((SubLObject)cb_pph_phrase_browser.$str10$nl_pred, (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$kw9$ALL, cb_pph_phrase_browser.$const33$tensed, cb_pph_phrase_browser.$const34$gerund, cb_pph_phrase_browser.$const35$nameString, cb_pph_phrase_browser.$const36$nonPlural_Generic, cb_pph_phrase_browser.$const37$nonSingular_Generic), nl_pred);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str38$Min_demerits_);
                        html_utilities.html_text_input((SubLObject)cb_pph_phrase_browser.$str11$min_demerits, min_demerits, (SubLObject)cb_pph_phrase_browser.$str24$5em);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str39$Max_demerits_);
                        html_utilities.html_text_input((SubLObject)cb_pph_phrase_browser.$str12$max_demerits, (SubLObject)(max_demerits.isInteger() ? max_demerits : cb_pph_phrase_browser.NIL), (SubLObject)cb_pph_phrase_browser.$str24$5em);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_newline((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str40$Sort_by_);
                        html_utilities.html_create_simple_dropdown_list((SubLObject)cb_pph_phrase_browser.$str13$sort_field, (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$kw14$ID, (SubLObject)cb_pph_phrase_browser.$kw41$DEMERITS), sort_field);
                        html_utilities.html_create_simple_dropdown_list((SubLObject)cb_pph_phrase_browser.$str15$sort_order, (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$kw42$ASCENDING, (SubLObject)cb_pph_phrase_browser.$kw16$DESCENDING), sort_order);
                        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                        html_utilities.html_indent((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_submit_input((SubLObject)cb_pph_phrase_browser.$str43$Refresh, (SubLObject)cb_pph_phrase_browser.$str44$submit, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_hr((SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        SubLObject cdolist_list_var = phrases_to_view;
                        SubLObject phrase = (SubLObject)cb_pph_phrase_browser.NIL;
                        phrase = cdolist_list_var.first();
                        while (cb_pph_phrase_browser.NIL != cdolist_list_var) {
                            cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            phrase = cdolist_list_var.first();
                        }
                        html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                    }
                    finally {
                        html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                        html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 3939L)
    public static SubLObject gather_pph_phrases_int(SubLObject max_count, SubLObject category, SubLObject nl_pred, SubLObject min_demerits, SubLObject max_demerits, SubLObject sort_field, SubLObject sort_order) {
        if (max_count == cb_pph_phrase_browser.UNPROVIDED) {
            max_count = (SubLObject)cb_pph_phrase_browser.$int7$100;
        }
        if (category == cb_pph_phrase_browser.UNPROVIDED) {
            category = (SubLObject)cb_pph_phrase_browser.$kw9$ALL;
        }
        if (nl_pred == cb_pph_phrase_browser.UNPROVIDED) {
            nl_pred = (SubLObject)cb_pph_phrase_browser.$kw9$ALL;
        }
        if (min_demerits == cb_pph_phrase_browser.UNPROVIDED) {
            min_demerits = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
        }
        if (max_demerits == cb_pph_phrase_browser.UNPROVIDED) {
            max_demerits = number_utilities.positive_infinity();
        }
        if (sort_field == cb_pph_phrase_browser.UNPROVIDED) {
            sort_field = (SubLObject)cb_pph_phrase_browser.$kw14$ID;
        }
        if (sort_order == cb_pph_phrase_browser.UNPROVIDED) {
            sort_order = (SubLObject)cb_pph_phrase_browser.$kw16$DESCENDING;
        }
        SubLObject phrases_to_view = (SubLObject)cb_pph_phrase_browser.NIL;
        final SubLObject min_id = max_gen_template_phrase_id();
        SubLObject enoughP = (SubLObject)cb_pph_phrase_browser.NIL;
        if (cb_pph_phrase_browser.NIL == enoughP) {
            SubLObject end_var;
            SubLObject i;
            SubLObject phrase;
            for (end_var = min_id, i = (SubLObject)cb_pph_phrase_browser.NIL, i = id_index.id_index_next_id(pph_data_structures.pph_phrase_id_index()); cb_pph_phrase_browser.NIL == enoughP && !i.numLE(end_var); i = Numbers.add(i, (SubLObject)cb_pph_phrase_browser.MINUS_ONE_INTEGER)) {
                phrase = pph_data_structures.find_pph_phrase_by_id(i);
                if (cb_pph_phrase_browser.NIL != pph_data_structures.valid_pph_phrase_p(phrase) && cb_pph_phrase_browser.NIL != pph_phrase_ok_for_categoryP(phrase, category) && cb_pph_phrase_browser.NIL != pph_phrase_ok_for_nl_predP(phrase, nl_pred) && cb_pph_phrase_browser.NIL != pph_phrase_ok_for_demeritsP(phrase, min_demerits, max_demerits)) {
                    phrases_to_view = (SubLObject)ConsesLow.cons(phrase, phrases_to_view);
                    enoughP = list_utilities.lengthGE(phrases_to_view, max_count, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                }
            }
        }
        return sort_pph_phrases(phrases_to_view, sort_field, sort_order);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
    public static SubLObject clear_max_gen_template_phrase_id() {
        final SubLObject cs = cb_pph_phrase_browser.$max_gen_template_phrase_id_caching_state$.getGlobalValue();
        if (cb_pph_phrase_browser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
    public static SubLObject remove_max_gen_template_phrase_id() {
        return memoization_state.caching_state_remove_function_results_with_args(cb_pph_phrase_browser.$max_gen_template_phrase_id_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cb_pph_phrase_browser.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
    public static SubLObject max_gen_template_phrase_id_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject max_id = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
        final SubLObject iterator_var = pph_data_structures.new_gen_template_store_iterator();
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)cb_pph_phrase_browser.NIL; cb_pph_phrase_browser.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_phrase_browser.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject the_entry = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (cb_pph_phrase_browser.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = the_entry;
                SubLObject the_reln = (SubLObject)cb_pph_phrase_browser.NIL;
                SubLObject all_its_templates = (SubLObject)cb_pph_phrase_browser.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_phrase_browser.$list47);
                the_reln = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_phrase_browser.$list47);
                all_its_templates = current.first();
                current = current.rest();
                if (cb_pph_phrase_browser.NIL == current) {
                    SubLObject cdolist_list_var = all_its_templates;
                    SubLObject all_of_this_kind = (SubLObject)cb_pph_phrase_browser.NIL;
                    all_of_this_kind = cdolist_list_var.first();
                    while (cb_pph_phrase_browser.NIL != cdolist_list_var) {
                        final SubLObject iterator_var_$4 = set.new_set_iterator(all_of_this_kind);
                        SubLObject valid_$6;
                        for (SubLObject done_var_$5 = (SubLObject)cb_pph_phrase_browser.NIL; cb_pph_phrase_browser.NIL == done_var_$5; done_var_$5 = (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_phrase_browser.NIL == valid_$6)) {
                            thread.resetMultipleValues();
                            final SubLObject the_template = iteration.iteration_next(iterator_var_$4);
                            valid_$6 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (cb_pph_phrase_browser.NIL != valid_$6) {
                                final SubLObject phrase = pph_data_structures.get_gen_template_phrase(the_template);
                                final SubLObject id = pph_phrase.pph_phrase_suid(phrase);
                                if (id.numG(max_id)) {
                                    max_id = id;
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        all_of_this_kind = cdolist_list_var.first();
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)cb_pph_phrase_browser.$list47);
                }
            }
        }
        return max_id_of_pph_phrase_and_dtrs(pph_data_structures.find_pph_phrase_by_id(max_id), (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 4847L)
    public static SubLObject max_gen_template_phrase_id() {
        SubLObject caching_state = cb_pph_phrase_browser.$max_gen_template_phrase_id_caching_state$.getGlobalValue();
        if (cb_pph_phrase_browser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_pph_phrase_browser.$sym46$MAX_GEN_TEMPLATE_PHRASE_ID, (SubLObject)cb_pph_phrase_browser.$sym48$_MAX_GEN_TEMPLATE_PHRASE_ID_CACHING_STATE_, (SubLObject)cb_pph_phrase_browser.NIL, (SubLObject)cb_pph_phrase_browser.EQL, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(max_gen_template_phrase_id_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 5408L)
    public static SubLObject max_id_of_pph_phrase_and_dtrs(final SubLObject phrase, SubLObject max_id) {
        if (max_id == cb_pph_phrase_browser.UNPROVIDED) {
            max_id = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
        }
        final SubLObject this_phrase_id = pph_phrase.pph_phrase_suid(phrase);
        if (this_phrase_id.numG(max_id)) {
            max_id = this_phrase_id;
        }
        SubLObject dtr_num = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)cb_pph_phrase_browser.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_pph_phrase_browser.NIL, v_iteration = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER)) {
                element_num = ((cb_pph_phrase_browser.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                max_id = max_id_of_pph_phrase_and_dtrs(dtr, max_id);
                dtr_num = Numbers.add(dtr_num, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER);
            }
        }
        return max_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 5738L)
    public static SubLObject pph_phrase_ok_for_categoryP(final SubLObject phrase, final SubLObject category) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_phrase_browser.$kw9$ALL.eql(category) || cb_pph_phrase_browser.NIL != pph_utilities.pph_genl_posP(pph_phrase.pph_phrase_category(phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED), category, (SubLObject)cb_pph_phrase_browser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 5895L)
    public static SubLObject pph_phrase_ok_for_nl_predP(final SubLObject phrase, final SubLObject nl_pred) {
        return (SubLObject)SubLObjectFactory.makeBoolean(cb_pph_phrase_browser.$kw9$ALL.eql(nl_pred) || cb_pph_phrase_browser.NIL != pph_utilities.pph_genl_pos_predP(pph_phrase.pph_phrase_agr_pred(phrase), nl_pred, (SubLObject)cb_pph_phrase_browser.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6053L)
    public static SubLObject pph_phrase_ok_for_demeritsP(final SubLObject phrase, final SubLObject min_demerits, final SubLObject max_demerits) {
        final SubLObject demerits = pph_phrase_id_demerits(pph_phrase.pph_phrase_suid(phrase));
        return (SubLObject)SubLObjectFactory.makeBoolean(demerits.numGE(min_demerits) && cb_pph_phrase_browser.NIL != number_utilities.potentially_infinite_number_LE(demerits, max_demerits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
    public static SubLObject clear_pph_phrase_id_demerits() {
        final SubLObject cs = cb_pph_phrase_browser.$pph_phrase_id_demerits_caching_state$.getGlobalValue();
        if (cb_pph_phrase_browser.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
    public static SubLObject remove_pph_phrase_id_demerits(final SubLObject id) {
        return memoization_state.caching_state_remove_function_results_with_args(cb_pph_phrase_browser.$pph_phrase_id_demerits_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(id), (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
    public static SubLObject pph_phrase_id_demerits_internal(final SubLObject id) {
        final SubLObject phrase = pph_data_structures.find_pph_phrase_by_id(id);
        return (SubLObject)((cb_pph_phrase_browser.NIL != phrase) ? pph_phrase.pph_phrase_demerits(phrase) : cb_pph_phrase_browser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6313L)
    public static SubLObject pph_phrase_id_demerits(final SubLObject id) {
        SubLObject caching_state = cb_pph_phrase_browser.$pph_phrase_id_demerits_caching_state$.getGlobalValue();
        if (cb_pph_phrase_browser.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)cb_pph_phrase_browser.$sym49$PPH_PHRASE_ID_DEMERITS, (SubLObject)cb_pph_phrase_browser.$sym50$_PPH_PHRASE_ID_DEMERITS_CACHING_STATE_, (SubLObject)cb_pph_phrase_browser.$int51$4096, (SubLObject)cb_pph_phrase_browser.EQL, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, id, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(pph_phrase_id_demerits_internal(id)));
            memoization_state.caching_state_put(caching_state, id, results, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6484L)
    public static SubLObject sort_pph_phrases(final SubLObject phrases, final SubLObject sort_field, final SubLObject sort_order) {
        if (sort_field.eql((SubLObject)cb_pph_phrase_browser.$kw14$ID)) {
            return sort_pph_phrases_by_id(phrases, sort_order);
        }
        if (sort_field.eql((SubLObject)cb_pph_phrase_browser.$kw41$DEMERITS)) {
            return sort_pph_phrases_by_demerits(phrases, sort_order);
        }
        return phrases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6749L)
    public static SubLObject sort_pph_phrases_by_id(final SubLObject phrases, final SubLObject sort_order) {
        return Sort.sort(phrases, sort_order.eql((SubLObject)cb_pph_phrase_browser.$kw42$ASCENDING) ? Symbols.symbol_function((SubLObject)cb_pph_phrase_browser.$sym52$_) : Symbols.symbol_function((SubLObject)cb_pph_phrase_browser.$sym53$_), (SubLObject)cb_pph_phrase_browser.$sym54$PPH_PHRASE_SUID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 6893L)
    public static SubLObject sort_pph_phrases_by_demerits(final SubLObject phrases, final SubLObject sort_order) {
        return Sort.sort(phrases, sort_order.eql((SubLObject)cb_pph_phrase_browser.$kw42$ASCENDING) ? Symbols.symbol_function((SubLObject)cb_pph_phrase_browser.$sym52$_) : Symbols.symbol_function((SubLObject)cb_pph_phrase_browser.$sym53$_), (SubLObject)cb_pph_phrase_browser.$sym55$PPH_PHRASE_DEMERITS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 7094L)
    public static SubLObject cb_link_pph_phrase(final SubLObject v_pph_phrase, SubLObject verbosity, SubLObject linktext) {
        if (verbosity == cb_pph_phrase_browser.UNPROVIDED) {
            verbosity = (SubLObject)cb_pph_phrase_browser.NIL;
        }
        if (linktext == cb_pph_phrase_browser.UNPROVIDED) {
            linktext = (SubLObject)cb_pph_phrase_browser.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_pph_phrase_browser.NIL == verbosity) {
            verbosity = (SubLObject)cb_pph_phrase_browser.$kw58$TERSE;
        }
        if (cb_pph_phrase_browser.NIL == pph_data_structures.valid_pph_phrase_p(v_pph_phrase)) {
            return html_utilities.html_princ(print_high.princ_to_string(v_pph_phrase));
        }
        final SubLObject pph_phrase_id = pph_phrase.pph_phrase_suid(v_pph_phrase);
        final SubLObject frame = (SubLObject)cb_pph_phrase_browser.$kw59$SELF;
        cb_adornments.handle_adornments((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, frame, v_pph_phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
            final SubLObject bgcolor = pph_bgcolor_for_phrase(v_pph_phrase);
            final SubLObject style = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str60$background_color_, format_nil.format_nil_a_no_copy(bgcolor));
            final SubLObject string = cb_pph_phrase_string(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.T, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            SubLObject tokens;
            SubLObject first_word;
            for (tokens = string_utilities.string_tokenize(string, (SubLObject)cb_pph_phrase_browser.$list61, (SubLObject)cb_pph_phrase_browser.NIL, (SubLObject)cb_pph_phrase_browser.T, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED), first_word = tokens.first(); cb_pph_phrase_browser.NIL != list_utilities.lengthG(tokens, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER, (SubLObject)cb_pph_phrase_browser.UNPROVIDED) && cb_pph_phrase_browser.NIL != Sequences.find((SubLObject)Characters.CHAR_less, first_word, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED) && cb_pph_phrase_browser.NIL == Sequences.find((SubLObject)Characters.CHAR_greater, first_word, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED); tokens = tokens.rest(), first_word = Sequences.cconcatenate(first_word, tokens.first())) {}
            html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_markup(style);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                final SubLObject frame_name_var = cb_utilities.cb_frame_name(frame);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str62$cb_pph_phrase__A, pph_phrase_id);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                if (cb_pph_phrase_browser.NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str63$pphphraseicon);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        final SubLObject image_src = cyc_file_dependencies.cb_icon_file_path((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE);
                        final SubLObject align = (SubLObject)cb_pph_phrase_browser.$str64$absmiddle;
                        final SubLObject alt = cyc_file_dependencies.cb_get_icon_alt_string((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE);
                        final SubLObject border = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
                        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup(image_src);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        if (cb_pph_phrase_browser.NIL != alt) {
                            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            html_utilities.html_markup(alt);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        }
                        if (cb_pph_phrase_browser.NIL != align) {
                            html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_align(align));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        }
                        if (cb_pph_phrase_browser.NIL != border) {
                            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            html_utilities.html_markup(border);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str66$_A, first_word);
                html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str66$_A, string_utilities.pre_remove(string, first_word, (SubLObject)cb_pph_phrase_browser.UNPROVIDED));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
        }
        else {
            final SubLObject category = pph_phrase.pph_phrase_category(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.T);
            if (cb_pph_phrase_browser.NIL == linktext) {
                final SubLObject pcase_var = verbosity;
                if (pcase_var.eql((SubLObject)cb_pph_phrase_browser.$kw67$MINIMAL)) {
                    linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str68$_, new SubLObject[] { format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                }
                else if (pcase_var.eql((SubLObject)cb_pph_phrase_browser.$kw58$TERSE)) {
                    if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str68$_, new SubLObject[] { format_nil.format_nil_s_no_copy(cb_pph_phrase_string(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.NIL, (SubLObject)cb_pph_phrase_browser.$int70$30)), cb_pph_phrase_browser.$str71$_, format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                    }
                    else if (cb_pph_phrase_browser.NIL != category) {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str68$_, new SubLObject[] { format_nil.format_nil_a_no_copy(cb_pph_phrase_category_string(v_pph_phrase)), cb_pph_phrase_browser.$str71$_, format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                    }
                    else if (cb_pph_phrase_browser.NIL != pph_phrase.pph_symbol_phrase_p(v_pph_phrase)) {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str68$_, new SubLObject[] { format_nil.format_nil_a_no_copy(pph_phrase.pph_symbol_phrase_symbol(v_pph_phrase)), cb_pph_phrase_browser.$str71$_, format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                    }
                    else if (cb_pph_phrase_browser.NIL != pph_phrase.pph_known_cycl_p(pph_phrase.pph_phrase_cycl(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED))) {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str68$_, new SubLObject[] { format_nil.format_nil_s_no_copy(pph_phrase.pph_phrase_cycl(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)), cb_pph_phrase_browser.$str71$_, format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                    }
                    else {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str72$_Phr_, new SubLObject[] { format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                    }
                }
                else if (pcase_var.eql((SubLObject)cb_pph_phrase_browser.$kw73$VERBOSE)) {
                    if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_doneP(v_pph_phrase)) {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str68$_, new SubLObject[] { format_nil.format_nil_s_no_copy(cb_pph_phrase_string(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.NIL, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)), cb_pph_phrase_browser.$str71$_, format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str69$_ });
                    }
                    else {
                        linktext = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str74$_PPH_Phrase_, new SubLObject[] { format_nil.format_nil_a_no_copy(pph_phrase_id), cb_pph_phrase_browser.$str75$__, format_nil.format_nil_a_no_copy(cb_pph_phrase_category_string(v_pph_phrase)), cb_pph_phrase_browser.$str69$_ });
                    }
                }
            }
            final SubLObject frame_name_var2 = cb_utilities.cb_frame_name(frame);
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            cb_parameters.cyc_cgi_url_int();
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str62$cb_pph_phrase__A, pph_phrase_id);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            if (cb_pph_phrase_browser.NIL != frame_name_var2) {
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(frame_name_var2);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                final SubLObject bgcolor2 = pph_bgcolor_for_phrase(v_pph_phrase);
                final SubLObject style2 = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str60$background_color_, format_nil.format_nil_a_no_copy(bgcolor2));
                html_utilities.html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(style2);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(linktext);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                }
                html_utilities.html_markup(html_macros.$html_span_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 9666L)
    public static SubLObject cb_form_sign_method(final SubLObject v_object, SubLObject depth, SubLObject wrap_axiomsP) {
        if (depth == cb_pph_phrase_browser.UNPROVIDED) {
            depth = (SubLObject)cb_pph_phrase_browser.NIL;
        }
        if (wrap_axiomsP == cb_pph_phrase_browser.UNPROVIDED) {
            wrap_axiomsP = (SubLObject)cb_pph_phrase_browser.NIL;
        }
        if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_p(v_object, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)) {
            cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, v_object, (SubLObject)cb_pph_phrase_browser.$kw73$VERBOSE, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        }
        else {
            html_utilities.html_princ(v_object);
        }
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 9880L)
    public static SubLObject cb_guess_pph_phrase(final SubLObject pph_phrase_id_string) {
        return (SubLObject)((cb_pph_phrase_browser.NIL != string_utilities.digit_stringP(pph_phrase_id_string)) ? pph_data_structures.find_pph_phrase_by_id(reader.parse_integer(pph_phrase_id_string, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)) : cb_pph_phrase_browser.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 10439L)
    public static SubLObject cb_pph_category_abbreviation(final SubLObject category) {
        return list_utilities.alist_lookup(cb_pph_phrase_browser.$cb_pph_category_abbreviations$.getGlobalValue(), cycl_utilities.hl_to_el(category), Symbols.symbol_function((SubLObject)cb_pph_phrase_browser.$sym79$PPH_GENL_POS_), print_high.princ_to_string(category));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 10623L)
    public static SubLObject cb_pph_phrase_guts(final SubLObject v_pph_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str17$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (cb_pph_phrase_browser.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str18$_meta_http_equiv__X_UA_Compatible);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_pph_phrase_browser.$kw19$UNINITIALIZED) ? ConsesLow.list(cb_pph_phrase_browser.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
            html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_parameters.cb_head_shortcut_icon();
            html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css((SubLObject)cb_pph_phrase_browser.$kw20$CB_CYC);
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str80$PPH_Phrase);
            html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$11 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_script_utilities.cb_hoverover_page_init();
                    SubLObject dtr_cols = pph_phrase.pph_phrase_dtr_count(v_pph_phrase);
                    SubLObject mother_stack = (SubLObject)cb_pph_phrase_browser.NIL;
                    SubLObject ancestor;
                    SubLObject mother;
                    for (mother = (ancestor = pph_phrase.pph_phrase_mother(v_pph_phrase)); cb_pph_phrase_browser.NIL != pph_data_structures.valid_pph_phrase_p(ancestor); ancestor = pph_phrase.pph_phrase_mother(ancestor)) {
                        mother_stack = (SubLObject)ConsesLow.cons(ancestor, mother_stack);
                    }
                    if (cb_pph_phrase_browser.ZERO_INTEGER.eql(dtr_cols)) {
                        dtr_cols = (SubLObject)cb_pph_phrase_browser.ONE_INTEGER;
                    }
                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str81$phrase);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        SubLObject cdolist_list_var = mother_stack;
                        SubLObject mother_$14 = (SubLObject)cb_pph_phrase_browser.NIL;
                        mother_$14 = cdolist_list_var.first();
                        while (cb_pph_phrase_browser.NIL != cdolist_list_var) {
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                final SubLObject bgcolor = pph_bgcolor_for_phrase(mother_$14);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (cb_pph_phrase_browser.NIL != dtr_cols) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup(dtr_cols);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw82$CENTER));
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                if (cb_pph_phrase_browser.NIL != bgcolor) {
                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup(bgcolor);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                    cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, mother_$14, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            mother_$14 = cdolist_list_var.first();
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                            if (cb_pph_phrase_browser.NIL != pph_data_structures.valid_pph_phrase_p(mother)) {
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (cb_pph_phrase_browser.NIL != dtr_cols) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup(dtr_cols);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                    html_utilities.html_markup(html_macros.$html_table_width$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str83$100_);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                        final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                            SubLObject dtr_num = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
                                            if (document.sign_constituents(mother).isVector()) {
                                                final SubLObject vector_var = document.sign_constituents(mother);
                                                final SubLObject backwardP_var = (SubLObject)cb_pph_phrase_browser.NIL;
                                                SubLObject length;
                                                SubLObject v_iteration;
                                                SubLObject element_num;
                                                SubLObject sibling;
                                                SubLObject bgcolor2;
                                                SubLObject _prev_bind_0_$20;
                                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_pph_phrase_browser.NIL, v_iteration = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER)) {
                                                    element_num = ((cb_pph_phrase_browser.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER) : v_iteration);
                                                    sibling = Vectors.aref(vector_var, element_num);
                                                    bgcolor2 = pph_bgcolor_for_phrase(sibling);
                                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw82$CENTER));
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                    if (cb_pph_phrase_browser.NIL != bgcolor2) {
                                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                        html_utilities.html_markup(bgcolor2);
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                    }
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                    _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                                        if (sibling.eql(v_pph_phrase)) {
                                                            html_show_pph_phrase_details(v_pph_phrase);
                                                        }
                                                        else {
                                                            cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, sibling, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                        }
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    dtr_num = Numbers.add(dtr_num, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER);
                                                }
                                            }
                                        }
                                        finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                        }
                                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            else {
                                final SubLObject bgcolor3 = pph_bgcolor_for_phrase(v_pph_phrase);
                                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                if (cb_pph_phrase_browser.NIL != dtr_cols) {
                                    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup(dtr_cols);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                }
                                if (cb_pph_phrase_browser.NIL != bgcolor3) {
                                    html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup(bgcolor3);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                    html_show_pph_phrase_details(v_pph_phrase);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                            SubLObject dtr_num2 = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
                            if (document.sign_constituents(v_pph_phrase).isVector()) {
                                final SubLObject vector_var2 = document.sign_constituents(v_pph_phrase);
                                final SubLObject backwardP_var2 = (SubLObject)cb_pph_phrase_browser.NIL;
                                SubLObject length2;
                                SubLObject v_iteration2;
                                SubLObject element_num2;
                                SubLObject dtr;
                                SubLObject bgcolor4;
                                SubLObject v_class;
                                SubLObject _prev_bind_0_$23;
                                for (length2 = Sequences.length(vector_var2), v_iteration2 = (SubLObject)cb_pph_phrase_browser.NIL, v_iteration2 = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER; v_iteration2.numL(length2); v_iteration2 = Numbers.add(v_iteration2, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER)) {
                                    element_num2 = ((cb_pph_phrase_browser.NIL != backwardP_var2) ? Numbers.subtract(length2, v_iteration2, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER) : v_iteration2);
                                    dtr = Vectors.aref(vector_var2, element_num2);
                                    bgcolor4 = pph_bgcolor_for_phrase(dtr);
                                    v_class = pph_class_for_phrase(dtr);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (cb_pph_phrase_browser.NIL != v_class) {
                                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                        html_utilities.html_markup(v_class);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw82$CENTER));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    if (cb_pph_phrase_browser.NIL != bgcolor4) {
                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                        html_utilities.html_markup(bgcolor4);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str84$10_);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                        cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, dtr, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    dtr_num2 = Numbers.add(dtr_num2, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER);
                                }
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        final SubLObject i = (SubLObject)cb_pph_phrase_browser.ONE_INTEGER;
                        final SubLObject queue = queues.create_queue((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        SubLObject done_count = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
                        queues.enqueue(v_pph_phrase, queue);
                        while (cb_pph_phrase_browser.NIL == queues.queue_empty_p(queue)) {
                            final SubLObject ignore_me = queues.dequeue(queue);
                            SubLObject cdolist_list_var2 = pph_phrase.pph_phrase_local_alternatives(ignore_me);
                            SubLObject alt_phrase = (SubLObject)cb_pph_phrase_browser.NIL;
                            alt_phrase = cdolist_list_var2.first();
                            while (cb_pph_phrase_browser.NIL != cdolist_list_var2) {
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    if (cb_pph_phrase_browser.NIL != dtr_cols) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                        html_utilities.html_markup(dtr_cols);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str85$Alternative___D, i);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                    final SubLObject bgcolor5 = pph_bgcolor_for_phrase(alt_phrase);
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    if (cb_pph_phrase_browser.NIL != dtr_cols) {
                                        html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                        html_utilities.html_markup(dtr_cols);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    if (cb_pph_phrase_browser.NIL != bgcolor5) {
                                        html_utilities.html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                        html_utilities.html_markup(bgcolor5);
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                        html_show_pph_phrase_details(alt_phrase);
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
                                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                done_count = Numbers.add(done_count, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER);
                                if (done_count.numGE(pph_phrase.$pph_do_alternatives_max$.getDynamicValue(thread))) {
                                    final SubLObject new_format_string = Sequences.cconcatenate((SubLObject)cb_pph_phrase_browser.$str86$_PPH_error_level_, new SubLObject[] { format_nil.format_nil_s_no_copy((SubLObject)cb_pph_phrase_browser.ONE_INTEGER), cb_pph_phrase_browser.$str87$__, format_nil.format_nil_a_no_copy((SubLObject)cb_pph_phrase_browser.$str88$Done__S_alternatives_of__S) });
                                    pph_error.pph_handle_error(new_format_string, (SubLObject)ConsesLow.list(done_count, v_pph_phrase));
                                }
                                queues.enqueue(alt_phrase, queue);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                alt_phrase = cdolist_list_var2.first();
                            }
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_copyright_notice();
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                }
                html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$11, thread);
            }
            html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
        }
        finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 12932L)
    public static SubLObject pph_bgcolor_for_phrase(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (cb_pph_phrase_browser.NIL == control_vars.$highlight_demerits_in_generated_phrasesP$.getDynamicValue(thread)) {
            return (SubLObject)cb_pph_phrase_browser.$str57$;
        }
        final SubLObject r = (SubLObject)cb_pph_phrase_browser.$int89$255;
        final SubLObject demerits = Numbers.add(pph_phrase.pph_phrase_demerits(phrase), pph_phrase_problem_count(phrase));
        final SubLObject scale_factor = (SubLObject)cb_pph_phrase_browser.TEN_INTEGER;
        final SubLObject b;
        final SubLObject g = b = Numbers.max(Numbers.subtract((SubLObject)cb_pph_phrase_browser.$int89$255, Numbers.multiply(demerits, scale_factor)), (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER);
        return (SubLObject)(demerits.isZero() ? cb_pph_phrase_browser.$str57$ : PrintLow.format((SubLObject)cb_pph_phrase_browser.NIL, (SubLObject)cb_pph_phrase_browser.$str90$__2__0X_2__0X_2__0X, new SubLObject[] { r, g, b }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 13302L)
    public static SubLObject pph_class_for_phrase(final SubLObject phrase) {
        if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_mother(phrase) && phrase.eql(pph_phrase.pph_phrase_head_dtr(pph_phrase.pph_phrase_mother(phrase)))) {
            return (SubLObject)cb_pph_phrase_browser.$str91$head_dtr;
        }
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 13497L)
    public static SubLObject pph_phrase_problem_count(final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_dict = pph_phrase.pph_phrase_top_level_problem_dictionary(phrase);
        SubLObject count = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
        if (cb_pph_phrase_browser.NIL != dictionary.dictionary_p(problem_dict)) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(problem_dict)); cb_pph_phrase_browser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject problems = thread.secondMultipleValue();
                thread.resetMultipleValues();
                count = Numbers.add(count, Sequences.length(problems));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        SubLObject dtr_num = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER;
        if (document.sign_constituents(phrase).isVector()) {
            final SubLObject vector_var = document.sign_constituents(phrase);
            final SubLObject backwardP_var = (SubLObject)cb_pph_phrase_browser.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject dtr;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)cb_pph_phrase_browser.NIL, v_iteration = (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER)) {
                element_num = ((cb_pph_phrase_browser.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER) : v_iteration);
                dtr = Vectors.aref(vector_var, element_num);
                count = Numbers.add(count, pph_phrase_problem_count(dtr));
                dtr_num = Numbers.add(dtr_num, (SubLObject)cb_pph_phrase_browser.ONE_INTEGER);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 13873L)
    public static SubLObject html_show_pph_phrase_property(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject property = (SubLObject)cb_pph_phrase_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)cb_pph_phrase_browser.$list92);
        property = current.first();
        final SubLObject value_form;
        current = (value_form = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$sym93$HTML_FANCY_TABLE_ROW, (SubLObject)cb_pph_phrase_browser.NIL, (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$sym94$HTML_FANCY_TABLE_DATA, (SubLObject)cb_pph_phrase_browser.$list95, (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$sym96$HTML_FORMAT, (SubLObject)cb_pph_phrase_browser.$str97$_A_, property)), (SubLObject)ConsesLow.listS((SubLObject)cb_pph_phrase_browser.$sym94$HTML_FANCY_TABLE_DATA, (SubLObject)cb_pph_phrase_browser.NIL, ConsesLow.append(value_form, (SubLObject)cb_pph_phrase_browser.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 14125L)
    public static SubLObject html_show_pph_phrase_details(final SubLObject v_pph_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str98$focal);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw82$CENTER));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str100$SUID);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_princ(pph_phrase.pph_phrase_suid(v_pph_phrase));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject special_type = pph_phrase.pph_phrase_special_type(v_pph_phrase);
            if (cb_pph_phrase_browser.NIL != special_type) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str101$Special_Type);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_utilities.html_princ(special_type);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            final SubLObject arg_position = pph_phrase.pph_phrase_arg_position(v_pph_phrase);
            if (cb_pph_phrase_browser.NIL != pph_utilities.pph_known_arg_position_p(arg_position)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str102$Arg_Position);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        if (cb_pph_phrase_browser.NIL == arg_position) {
                            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str103$Top_Level);
                        }
                        else {
                            html_utilities.html_princ(arg_position);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str104$Category);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_princ(cb_pph_phrase_category_string(v_pph_phrase));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str105$String);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_show_pph_string(pph_phrase.pph_phrase_string(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            if (cb_pph_phrase_browser.NIL != pph_phrase.pph_symbol_phrase_p(v_pph_phrase)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str106$Symbol);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        cb_utilities.cb_form(pph_phrase.pph_symbol_phrase_symbol(v_pph_phrase), (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            final SubLObject demerits = pph_phrase.pph_phrase_demerits(v_pph_phrase);
            final SubLObject demerits_reason = pph_phrase.pph_phrase_top_level_demerits_reason(v_pph_phrase);
            if (cb_pph_phrase_browser.NIL != subl_promotions.positive_integer_p(demerits)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str107$Demerits);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$48, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_utilities.html_princ(demerits);
                        if (cb_pph_phrase_browser.NIL != demerits_reason) {
                            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str108$___A_, demerits_reason);
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$49, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_wu(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.T)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str109$Word);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$51, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$52 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        cb_utilities.cb_form(pph_phrase.pph_phrase_wu(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.T), (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$52, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$50, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$53 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$54 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str110$CycL);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$54, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$55 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_show_pph_cycl(pph_phrase.pph_phrase_cycl(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.UNPROVIDED));
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$55, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$53, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_case(v_pph_phrase)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$56 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$57 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str111$Case);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$57, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$58 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        cb_utilities.cb_form(pph_phrase.pph_phrase_case(v_pph_phrase), (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$58, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$56, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_agr(v_pph_phrase)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$59 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$60 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str112$Agreement);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$60, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$61 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_show_pph_agr(pph_phrase.pph_phrase_agr(v_pph_phrase));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$61, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$59, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_justification(v_pph_phrase)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$62 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str113$Justification);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        SubLObject cdolist_list_var = pph_phrase.pph_phrase_justification(v_pph_phrase);
                        SubLObject just = (SubLObject)cb_pph_phrase_browser.NIL;
                        just = cdolist_list_var.first();
                        while (cb_pph_phrase_browser.NIL != cdolist_list_var) {
                            if (cb_pph_phrase_browser.NIL != arguments.hl_support_p(just)) {
                                cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw114$HL_SUPPORT, just, (SubLObject)cb_pph_phrase_browser.$kw115$NONE, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            }
                            else {
                                cb_utilities.cb_form(just, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER, (SubLObject)cb_pph_phrase_browser.T);
                            }
                            html_utilities.html_newline((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            just = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$62, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            if (cb_pph_phrase_browser.NIL != list_utilities.non_empty_list_p(pph_phrase.pph_phrase_inferences(v_pph_phrase))) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$66 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str116$Inferences);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$66, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$67 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        SubLObject cdolist_list_var = pph_phrase.pph_phrase_inferences(v_pph_phrase);
                        SubLObject inference = (SubLObject)cb_pph_phrase_browser.NIL;
                        inference = cdolist_list_var.first();
                        while (cb_pph_phrase_browser.NIL != cdolist_list_var) {
                            cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw117$INFERENCE, inference, (SubLObject)cb_pph_phrase_browser.$kw118$VERY_VERBOSE, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            inference = cdolist_list_var.first();
                        }
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$67, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            final SubLObject olist = pph_phrase.pph_phrase_output_list(v_pph_phrase);
            if (cb_pph_phrase_browser.NIL != list_utilities.non_empty_list_p(olist)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str119$Output_List);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str120$output_list);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$71 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                            html_show_pph_output_item_headers();
                            SubLObject cdolist_list_var2 = olist;
                            SubLObject item = (SubLObject)cb_pph_phrase_browser.NIL;
                            item = cdolist_list_var2.first();
                            while (cb_pph_phrase_browser.NIL != cdolist_list_var2) {
                                html_show_pph_output_item(item);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                item = cdolist_list_var2.first();
                            }
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$71, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$68, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            final SubLObject problem_dict = pph_phrase.pph_phrase_top_level_problem_dictionary(v_pph_phrase);
            if (cb_pph_phrase_browser.NIL != dictionary.dictionary_p(problem_dict)) {
                html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                final SubLObject _prev_bind_0_$72 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw99$RIGHT));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_pph_phrase_browser.$kw65$TOP));
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$73 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str97$_A_, (SubLObject)cb_pph_phrase_browser.$str121$Problems);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$73, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                    final SubLObject _prev_bind_0_$74 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_pph_phrase_browser.$str122$problems);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$76 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(problem_dict)); cb_pph_phrase_browser.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject reporter = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject value = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$77 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                        cb_utilities.cb_form(reporter, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$77, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$76, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                            final SubLObject _prev_bind_0_$78 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                SubLObject cdolist_list_var3 = dictionary.dictionary_values(problem_dict);
                                SubLObject problems = (SubLObject)cb_pph_phrase_browser.NIL;
                                problems = cdolist_list_var3.first();
                                while (cb_pph_phrase_browser.NIL != cdolist_list_var3) {
                                    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                        if (cb_pph_phrase_browser.NIL != list_utilities.singletonP(problems)) {
                                            html_output_pph_problem(list_utilities.only_one(problems));
                                        }
                                        else {
                                            html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                            final SubLObject _prev_bind_0_$80 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                                SubLObject cdolist_list_var_$81 = problems;
                                                SubLObject problem = (SubLObject)cb_pph_phrase_browser.NIL;
                                                problem = cdolist_list_var_$81.first();
                                                while (cb_pph_phrase_browser.NIL != cdolist_list_var_$81) {
                                                    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$81 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                                        html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$82 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                                                            html_output_pph_problem(problem);
                                                        }
                                                        finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$82, thread);
                                                        }
                                                        html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    }
                                                    finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$81, thread);
                                                    }
                                                    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                    html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                                                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                                    problem = cdolist_list_var_$81.first();
                                                }
                                            }
                                            finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$80, thread);
                                            }
                                            html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        }
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                    problems = cdolist_list_var3.first();
                                }
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$78, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$74, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$72, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return v_pph_phrase;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 17476L)
    public static SubLObject html_output_pph_problem(final SubLObject problem) {
        SubLObject type = (SubLObject)cb_pph_phrase_browser.NIL;
        SubLObject other_info = (SubLObject)cb_pph_phrase_browser.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(problem, problem, (SubLObject)cb_pph_phrase_browser.$list123);
        type = problem.first();
        final SubLObject current = other_info = problem.rest();
        html_utilities.html_markup(html_macros.$html_center_head$.getGlobalValue());
        html_utilities.html_princ_strong(type);
        if (cb_pph_phrase_browser.NIL != other_info) {
            html_utilities.html_newline((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            html_utilities.html_princ(other_info);
        }
        html_utilities.html_markup(html_macros.$html_center_tail$.getGlobalValue());
        return problem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 17712L)
    public static SubLObject html_show_pph_cycl(final SubLObject cycl) {
        if (cb_pph_phrase_browser.NIL != pph_phrase.pph_known_cycl_p(cycl)) {
            cb_utilities.cb_form(cycl, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str124$__);
        }
        return cycl;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 17848L)
    public static SubLObject html_show_pph_arg_position(final SubLObject arg_position) {
        if (cb_pph_phrase_browser.NIL != pph_utilities.pph_known_arg_position_p(arg_position)) {
            html_utilities.html_princ(arg_position);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str124$__);
        }
        return arg_position;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 18035L)
    public static SubLObject html_show_pph_string(final SubLObject string) {
        if (cb_pph_phrase_browser.NIL != pph_string.pph_string_p(string)) {
            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str125$_);
            html_utilities.html_markup(pph_string.pph_string_to_html_escaped(string, (SubLObject)cb_pph_phrase_browser.UNPROVIDED));
            html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str125$_);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 18228L)
    public static SubLObject html_show_pph_output_item_headers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str105$String);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$85 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str126$ArgPos);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$85, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$86 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str110$CycL);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$86, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_header_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_utilities.html_princ((SubLObject)cb_pph_phrase_browser.$str127$AgrPred);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 18578L)
    public static SubLObject html_show_pph_output_item(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_show_pph_string(pph_data_structures.pph_phrase_output_item_string(item));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_show_pph_arg_position(pph_data_structures.pph_phrase_output_item_arg_position(item));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                html_show_pph_cycl(pph_data_structures.pph_phrase_output_item_cycl(item));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            final SubLObject _prev_bind_0_$91 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_pph_phrase_browser.T, thread);
                cb_utilities.cb_form(pph_data_structures.pph_phrase_output_item_agr_pred(item), (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$91, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
        html_utilities.html_source_readability_terpri((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
        return item;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 19067L)
    public static SubLObject cb_pph_phrase_category_string(final SubLObject v_pph_phrase) {
        final SubLObject top_cat = pph_phrase.pph_phrase_category(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.NIL);
        final SubLObject deep_cat = pph_phrase.pph_phrase_category(v_pph_phrase, (SubLObject)cb_pph_phrase_browser.T);
        final SubLObject cat_abbr = cb_pph_category_abbreviation(deep_cat);
        return top_cat.equal(deep_cat) ? cat_abbr : Sequences.cconcatenate(format_nil.format_nil_s_no_copy(top_cat), new SubLObject[] { cb_pph_phrase_browser.$str128$__, format_nil.format_nil_a_no_copy(cat_abbr), cb_pph_phrase_browser.$str129$_ });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 19399L)
    public static SubLObject html_show_pph_agr(final SubLObject agr) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject abs = pph_data_structures.pph_phrase_agr_absolute_constraint(agr);
        final SubLObject rel = pph_data_structures.pph_phrase_agr_relative_constraint(agr);
        if (cb_pph_phrase_browser.NIL == pph_utilities.pph_dont_care_agr_constraint_p(abs)) {
            PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str130$Absolute___A, abs);
        }
        if (cb_pph_phrase_browser.NIL != pph_utilities.pph_relative_agr_constraint_p(rel)) {
            final SubLObject type = pph_utilities.pph_agr_constraint_type(rel);
            final SubLObject target = pph_utilities.pph_agr_constraint_target(rel);
            if (cb_pph_phrase_browser.NIL != type) {
                if (cb_pph_phrase_browser.NIL == pph_utilities.pph_dont_care_agr_constraint_p(abs)) {
                    html_utilities.html_newline((SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                }
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_pph_phrase_browser.$str131$Relative___A_to_, type);
                if (cb_pph_phrase_browser.NIL != pph_phrase.pph_phrase_p(target, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)) {
                    cb_utilities.cb_link((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, target, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                }
                else {
                    cb_utilities.cb_form(target, (SubLObject)cb_pph_phrase_browser.UNPROVIDED, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
                }
            }
        }
        return agr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-pph-phrase-browser.lisp", position = 20016L)
    public static SubLObject cb_pph_phrase_string(final SubLObject v_pph_phrase, SubLObject add_tagsP, SubLObject max_length) {
        if (add_tagsP == cb_pph_phrase_browser.UNPROVIDED) {
            add_tagsP = (SubLObject)cb_pph_phrase_browser.T;
        }
        if (max_length == cb_pph_phrase_browser.UNPROVIDED) {
            max_length = (SubLObject)cb_pph_phrase_browser.NIL;
        }
        SubLObject v_pph_string = pph_phrase.pph_phrase_string(v_pph_phrase, add_tagsP);
        if (cb_pph_phrase_browser.NIL != max_length && cb_pph_phrase_browser.NIL != list_utilities.lengthG(v_pph_string, max_length, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)) {
            v_pph_string = pph_string.pph_string_concatenate(pph_string.pph_substring(v_pph_string, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER, max_length), (SubLObject)cb_pph_phrase_browser.$str132$___);
        }
        if (cb_pph_phrase_browser.NIL != list_utilities.lengthE(v_pph_string, (SubLObject)cb_pph_phrase_browser.ZERO_INTEGER, (SubLObject)cb_pph_phrase_browser.UNPROVIDED)) {
            v_pph_string = (SubLObject)cb_pph_phrase_browser.$str133$_No_Paraphrase_;
        }
        return pph_string.pph_string_if_non_null_to_output_format(v_pph_string, (SubLObject)cb_pph_phrase_browser.UNPROVIDED);
    }
    
    public static SubLObject declare_cb_pph_phrase_browser_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_phrase", "CB-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_phrases", "CB-PPH-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_handle_pph_phrases", "CB-HANDLE-PPH-PHRASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_phrases_internal", "CB-PPH-PHRASES-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "gather_pph_phrases_int", "GATHER-PPH-PHRASES-INT", 0, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "clear_max_gen_template_phrase_id", "CLEAR-MAX-GEN-TEMPLATE-PHRASE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "remove_max_gen_template_phrase_id", "REMOVE-MAX-GEN-TEMPLATE-PHRASE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "max_gen_template_phrase_id_internal", "MAX-GEN-TEMPLATE-PHRASE-ID-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "max_gen_template_phrase_id", "MAX-GEN-TEMPLATE-PHRASE-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "max_id_of_pph_phrase_and_dtrs", "MAX-ID-OF-PPH-PHRASE-AND-DTRS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_phrase_ok_for_categoryP", "PPH-PHRASE-OK-FOR-CATEGORY?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_phrase_ok_for_nl_predP", "PPH-PHRASE-OK-FOR-NL-PRED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_phrase_ok_for_demeritsP", "PPH-PHRASE-OK-FOR-DEMERITS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "clear_pph_phrase_id_demerits", "CLEAR-PPH-PHRASE-ID-DEMERITS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "remove_pph_phrase_id_demerits", "REMOVE-PPH-PHRASE-ID-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_phrase_id_demerits_internal", "PPH-PHRASE-ID-DEMERITS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_phrase_id_demerits", "PPH-PHRASE-ID-DEMERITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "sort_pph_phrases", "SORT-PPH-PHRASES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "sort_pph_phrases_by_id", "SORT-PPH-PHRASES-BY-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "sort_pph_phrases_by_demerits", "SORT-PPH-PHRASES-BY-DEMERITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_link_pph_phrase", "CB-LINK-PPH-PHRASE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_form_sign_method", "CB-FORM-SIGN-METHOD", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_guess_pph_phrase", "CB-GUESS-PPH-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_category_abbreviation", "CB-PPH-CATEGORY-ABBREVIATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_phrase_guts", "CB-PPH-PHRASE-GUTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_bgcolor_for_phrase", "PPH-BGCOLOR-FOR-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_class_for_phrase", "PPH-CLASS-FOR-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "pph_phrase_problem_count", "PPH-PHRASE-PROBLEM-COUNT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_phrase_property", "HTML-SHOW-PPH-PHRASE-PROPERTY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_phrase_details", "HTML-SHOW-PPH-PHRASE-DETAILS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_output_pph_problem", "HTML-OUTPUT-PPH-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_cycl", "HTML-SHOW-PPH-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_arg_position", "HTML-SHOW-PPH-ARG-POSITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_string", "HTML-SHOW-PPH-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_output_item_headers", "HTML-SHOW-PPH-OUTPUT-ITEM-HEADERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_output_item", "HTML-SHOW-PPH-OUTPUT-ITEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_phrase_category_string", "CB-PPH-PHRASE-CATEGORY-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "html_show_pph_agr", "HTML-SHOW-PPH-AGR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_pph_phrase_browser", "cb_pph_phrase_string", "CB-PPH-PHRASE-STRING", 1, 2, false);
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    public static SubLObject init_cb_pph_phrase_browser_file() {
        cb_pph_phrase_browser.$max_gen_template_phrase_id_caching_state$ = SubLFiles.deflexical("*MAX-GEN-TEMPLATE-PHRASE-ID-CACHING-STATE*", (SubLObject)cb_pph_phrase_browser.NIL);
        cb_pph_phrase_browser.$pph_phrase_id_demerits_caching_state$ = SubLFiles.deflexical("*PPH-PHRASE-ID-DEMERITS-CACHING-STATE*", (SubLObject)cb_pph_phrase_browser.NIL);
        cb_pph_phrase_browser.$cb_pph_category_abbreviations$ = SubLFiles.deflexical("*CB-PPH-CATEGORY-ABBREVIATIONS*", (SubLObject)cb_pph_phrase_browser.$list78);
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    public static SubLObject setup_cb_pph_phrase_browser_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_pph_phrase_browser.$sym2$CB_PPH_PHRASE, (SubLObject)cb_pph_phrase_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_pph_phrase_browser.$sym4$CB_PPH_PHRASES, (SubLObject)cb_pph_phrase_browser.$kw3$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_pph_phrase_browser.$sym5$CB_HANDLE_PPH_PHRASES, (SubLObject)cb_pph_phrase_browser.$kw3$HTML_HANDLER);
        memoization_state.note_globally_cached_function((SubLObject)cb_pph_phrase_browser.$sym46$MAX_GEN_TEMPLATE_PHRASE_ID);
        memoization_state.note_globally_cached_function((SubLObject)cb_pph_phrase_browser.$sym49$PPH_PHRASE_ID_DEMERITS);
        Hashtables.sethash((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), (SubLObject)ConsesLow.list((SubLObject)cb_pph_phrase_browser.$str56$pph_phrase_png, (SubLObject)cb_pph_phrase_browser.$str57$));
        cb_utilities.setup_cb_link_method((SubLObject)cb_pph_phrase_browser.$kw45$PPH_PHRASE, (SubLObject)cb_pph_phrase_browser.$sym76$CB_LINK_PPH_PHRASE, (SubLObject)cb_pph_phrase_browser.THREE_INTEGER);
        Structures.register_method(cb_utilities.$cb_form_method_table$.getGlobalValue(), document.$dtp_sign$.getGlobalValue(), Symbols.symbol_function((SubLObject)cb_pph_phrase_browser.$sym77$CB_FORM_SIGN_METHOD));
        return (SubLObject)cb_pph_phrase_browser.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_pph_phrase_browser_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_pph_phrase_browser_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_pph_phrase_browser_file();
    }
    
    static {
        me = (SubLFile)new cb_pph_phrase_browser();
        cb_pph_phrase_browser.$max_gen_template_phrase_id_caching_state$ = null;
        cb_pph_phrase_browser.$pph_phrase_id_demerits_caching_state$ = null;
        cb_pph_phrase_browser.$cb_pph_category_abbreviations$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PPH-PHRASE-ID-STRING"));
        $str1$_A_did_not_specify_a_valid_pph_ph = SubLObjectFactory.makeString("~A did not specify a valid pph-phrase");
        $sym2$CB_PPH_PHRASE = SubLObjectFactory.makeSymbol("CB-PPH-PHRASE");
        $kw3$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym4$CB_PPH_PHRASES = SubLObjectFactory.makeSymbol("CB-PPH-PHRASES");
        $sym5$CB_HANDLE_PPH_PHRASES = SubLObjectFactory.makeSymbol("CB-HANDLE-PPH-PHRASES");
        $str6$max_count = SubLObjectFactory.makeString("max-count");
        $int7$100 = SubLObjectFactory.makeInteger(100);
        $str8$category = SubLObjectFactory.makeString("category");
        $kw9$ALL = SubLObjectFactory.makeKeyword("ALL");
        $str10$nl_pred = SubLObjectFactory.makeString("nl-pred");
        $str11$min_demerits = SubLObjectFactory.makeString("min-demerits");
        $str12$max_demerits = SubLObjectFactory.makeString("max-demerits");
        $str13$sort_field = SubLObjectFactory.makeString("sort-field");
        $kw14$ID = SubLObjectFactory.makeKeyword("ID");
        $str15$sort_order = SubLObjectFactory.makeString("sort-order");
        $kw16$DESCENDING = SubLObjectFactory.makeKeyword("DESCENDING");
        $str17$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str18$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw19$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw20$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $str21$PPH_Phrases = SubLObjectFactory.makeString("PPH-Phrases");
        $str22$post = SubLObjectFactory.makeString("post");
        $str23$Max_count_ = SubLObjectFactory.makeString("Max count:");
        $str24$5em = SubLObjectFactory.makeString("5em");
        $str25$Category_ = SubLObjectFactory.makeString("Category:");
        $const26$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const27$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $const28$Adjective = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Adjective"));
        $const29$NounPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase"));
        $const30$PrepositionalPhrase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase"));
        $const31$NLSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence"));
        $str32$Predicate_ = SubLObjectFactory.makeString("Predicate:");
        $const33$tensed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tensed"));
        $const34$gerund = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gerund"));
        $const35$nameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString"));
        $const36$nonPlural_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonPlural-Generic"));
        $const37$nonSingular_Generic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonSingular-Generic"));
        $str38$Min_demerits_ = SubLObjectFactory.makeString("Min demerits:");
        $str39$Max_demerits_ = SubLObjectFactory.makeString("Max demerits:");
        $str40$Sort_by_ = SubLObjectFactory.makeString("Sort by:");
        $kw41$DEMERITS = SubLObjectFactory.makeKeyword("DEMERITS");
        $kw42$ASCENDING = SubLObjectFactory.makeKeyword("ASCENDING");
        $str43$Refresh = SubLObjectFactory.makeString("Refresh");
        $str44$submit = SubLObjectFactory.makeString("submit");
        $kw45$PPH_PHRASE = SubLObjectFactory.makeKeyword("PPH-PHRASE");
        $sym46$MAX_GEN_TEMPLATE_PHRASE_ID = SubLObjectFactory.makeSymbol("MAX-GEN-TEMPLATE-PHRASE-ID");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-RELN"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-ITS-TEMPLATES"));
        $sym48$_MAX_GEN_TEMPLATE_PHRASE_ID_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*MAX-GEN-TEMPLATE-PHRASE-ID-CACHING-STATE*");
        $sym49$PPH_PHRASE_ID_DEMERITS = SubLObjectFactory.makeSymbol("PPH-PHRASE-ID-DEMERITS");
        $sym50$_PPH_PHRASE_ID_DEMERITS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PPH-PHRASE-ID-DEMERITS-CACHING-STATE*");
        $int51$4096 = SubLObjectFactory.makeInteger(4096);
        $sym52$_ = SubLObjectFactory.makeSymbol("<");
        $sym53$_ = SubLObjectFactory.makeSymbol(">");
        $sym54$PPH_PHRASE_SUID = SubLObjectFactory.makeSymbol("PPH-PHRASE-SUID");
        $sym55$PPH_PHRASE_DEMERITS = SubLObjectFactory.makeSymbol("PPH-PHRASE-DEMERITS");
        $str56$pph_phrase_png = SubLObjectFactory.makeString("pph-phrase.png");
        $str57$ = SubLObjectFactory.makeString("");
        $kw58$TERSE = SubLObjectFactory.makeKeyword("TERSE");
        $kw59$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str60$background_color_ = SubLObjectFactory.makeString("background-color:");
        $list61 = ConsesLow.list((SubLObject)Characters.CHAR_space);
        $str62$cb_pph_phrase__A = SubLObjectFactory.makeString("cb-pph-phrase&~A");
        $str63$pphphraseicon = SubLObjectFactory.makeString("pphphraseicon");
        $str64$absmiddle = SubLObjectFactory.makeString("absmiddle");
        $kw65$TOP = SubLObjectFactory.makeKeyword("TOP");
        $str66$_A = SubLObjectFactory.makeString("~A");
        $kw67$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $str68$_ = SubLObjectFactory.makeString("[");
        $str69$_ = SubLObjectFactory.makeString("]");
        $int70$30 = SubLObjectFactory.makeInteger(30);
        $str71$_ = SubLObjectFactory.makeString(" ");
        $str72$_Phr_ = SubLObjectFactory.makeString("[Phr ");
        $kw73$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $str74$_PPH_Phrase_ = SubLObjectFactory.makeString("[PPH-Phrase ");
        $str75$__ = SubLObjectFactory.makeString(": ");
        $sym76$CB_LINK_PPH_PHRASE = SubLObjectFactory.makeSymbol("CB-LINK-PPH-PHRASE");
        $sym77$CB_FORM_SIGN_METHOD = SubLObjectFactory.makeSymbol("CB-FORM-SIGN-METHOD");
        $list78 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AgentiveNoun"))), (SubLObject)SubLObjectFactory.makeString("NP-Agentive")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounPhrase")), (SubLObject)SubLObjectFactory.makeString("NP")), ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"))), (SubLObject)SubLObjectFactory.makeString("NP")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLSentence")), (SubLObject)SubLObjectFactory.makeString("S")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb")), (SubLObject)SubLObjectFactory.makeString("V")), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PrepositionalPhrase")), (SubLObject)SubLObjectFactory.makeString("PP")), ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"))), (SubLObject)SubLObjectFactory.makeString("Nbar")), ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn-Bar1")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))), (SubLObject)SubLObjectFactory.makeString("Vbar")), ConsesLow.cons((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PhraseFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Determiner"))), (SubLObject)SubLObjectFactory.makeString("DetP")) });
        $sym79$PPH_GENL_POS_ = SubLObjectFactory.makeSymbol("PPH-GENL-POS?");
        $str80$PPH_Phrase = SubLObjectFactory.makeString("PPH-Phrase");
        $str81$phrase = SubLObjectFactory.makeString("phrase");
        $kw82$CENTER = SubLObjectFactory.makeKeyword("CENTER");
        $str83$100_ = SubLObjectFactory.makeString("100%");
        $str84$10_ = SubLObjectFactory.makeString("10%");
        $str85$Alternative___D = SubLObjectFactory.makeString("Alternative #~D");
        $str86$_PPH_error_level_ = SubLObjectFactory.makeString("(PPH error level ");
        $str87$__ = SubLObjectFactory.makeString(") ");
        $str88$Done__S_alternatives_of__S = SubLObjectFactory.makeString("Done ~S alternatives of ~S");
        $int89$255 = SubLObjectFactory.makeInteger(255);
        $str90$__2__0X_2__0X_2__0X = SubLObjectFactory.makeString("#~2,'0X~2,'0X~2,'0X");
        $str91$head_dtr = SubLObjectFactory.makeString("head-dtr");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-FORM"));
        $sym93$HTML_FANCY_TABLE_ROW = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-ROW");
        $sym94$HTML_FANCY_TABLE_DATA = SubLObjectFactory.makeSymbol("HTML-FANCY-TABLE-DATA");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("RIGHT"), (SubLObject)SubLObjectFactory.makeKeyword("VALIGN"), (SubLObject)SubLObjectFactory.makeKeyword("TOP"));
        $sym96$HTML_FORMAT = SubLObjectFactory.makeSymbol("HTML-FORMAT");
        $str97$_A_ = SubLObjectFactory.makeString("~A:");
        $str98$focal = SubLObjectFactory.makeString("focal");
        $kw99$RIGHT = SubLObjectFactory.makeKeyword("RIGHT");
        $str100$SUID = SubLObjectFactory.makeString("SUID");
        $str101$Special_Type = SubLObjectFactory.makeString("Special Type");
        $str102$Arg_Position = SubLObjectFactory.makeString("Arg Position");
        $str103$Top_Level = SubLObjectFactory.makeString("Top Level");
        $str104$Category = SubLObjectFactory.makeString("Category");
        $str105$String = SubLObjectFactory.makeString("String");
        $str106$Symbol = SubLObjectFactory.makeString("Symbol");
        $str107$Demerits = SubLObjectFactory.makeString("Demerits");
        $str108$___A_ = SubLObjectFactory.makeString(" (~A)");
        $str109$Word = SubLObjectFactory.makeString("Word");
        $str110$CycL = SubLObjectFactory.makeString("CycL");
        $str111$Case = SubLObjectFactory.makeString("Case");
        $str112$Agreement = SubLObjectFactory.makeString("Agreement");
        $str113$Justification = SubLObjectFactory.makeString("Justification");
        $kw114$HL_SUPPORT = SubLObjectFactory.makeKeyword("HL-SUPPORT");
        $kw115$NONE = SubLObjectFactory.makeKeyword("NONE");
        $str116$Inferences = SubLObjectFactory.makeString("Inferences");
        $kw117$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $kw118$VERY_VERBOSE = SubLObjectFactory.makeKeyword("VERY-VERBOSE");
        $str119$Output_List = SubLObjectFactory.makeString("Output List");
        $str120$output_list = SubLObjectFactory.makeString("output-list");
        $str121$Problems = SubLObjectFactory.makeString("Problems");
        $str122$problems = SubLObjectFactory.makeString("problems");
        $list123 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-INFO"));
        $str124$__ = SubLObjectFactory.makeString("??");
        $str125$_ = SubLObjectFactory.makeString("\"");
        $str126$ArgPos = SubLObjectFactory.makeString("ArgPos");
        $str127$AgrPred = SubLObjectFactory.makeString("AgrPred");
        $str128$__ = SubLObjectFactory.makeString(" (");
        $str129$_ = SubLObjectFactory.makeString(")");
        $str130$Absolute___A = SubLObjectFactory.makeString("Absolute: ~A");
        $str131$Relative___A_to_ = SubLObjectFactory.makeString("Relative: ~A to ");
        $str132$___ = SubLObjectFactory.makeString("...");
        $str133$_No_Paraphrase_ = SubLObjectFactory.makeString("[No Paraphrase]");
    }
}

/*

	Total time: 2840 ms
	
*/