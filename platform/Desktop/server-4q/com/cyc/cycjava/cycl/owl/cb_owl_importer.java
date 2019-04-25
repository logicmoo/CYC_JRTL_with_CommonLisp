package com.cyc.cycjava.cycl.owl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.cb_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.ke;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_owl_importer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.owl.cb_owl_importer";
    public static final String myFingerPrint = "0b5699993fe7cf96a7865f643b04eaa0fc6904660e81e6a0008f43ecc4f41f18";
    private static final SubLString $str0$OWL_Importer;
    private static final SubLSymbol $sym1$CB_OWL_IMPORT;
    private static final SubLSymbol $kw2$HTML_HANDLER;
    private static final SubLSymbol $sym3$FORT_TO_STRING;
    private static final SubLSymbol $sym4$TERMS_FOR_BROWSING;
    private static final SubLSymbol $kw5$TYPE;
    private static final SubLSymbol $kw6$IMPORT_FROM_FILE;
    private static final SubLSymbol $kw7$TERM_NAME_FORMAT;
    private static final SubLSymbol $kw8$SHORT;
    private static final SubLSymbol $kw9$ONTOLOGY_TERM;
    private static final SubLObject $const10$Ontology;
    private static final SubLSymbol $kw11$IMPORT_FILENAME;
    private static final SubLSymbol $kw12$IMPORT_FROM_URI;
    private static final SubLSymbol $kw13$IMPORT_URI;
    private static final SubLString $str14$Import_an_OWL_ontology;
    private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT;
    private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible;
    private static final SubLSymbol $kw17$UNINITIALIZED;
    private static final SubLSymbol $kw18$CB_CYC;
    private static final SubLSymbol $kw19$SAM_AUTOCOMPLETE_CSS;
    private static final SubLSymbol $kw20$SHA1;
    private static final SubLString $str21$yui_skin_sam;
    private static final SubLString $str22$reloadFrameButton;
    private static final SubLString $str23$button;
    private static final SubLString $str24$reload;
    private static final SubLString $str25$Refresh_Frames;
    private static final SubLString $str26$post;
    private static final SubLString $str27$cb_owl_import;
    private static final SubLSymbol $kw28$CB_OWL_TO_CYCL;
    private static final SubLSymbol $kw29$SELF;
    private static final SubLString $str30$Back;
    private static final SubLString $str31$Clear;
    private static final SubLString $str32$Import;
    private static final SubLSymbol $kw33$IMPORT;
    private static final SubLString $str34$Choose_the_method_for_determining;
    private static final SubLString $str35$Import_an_ontology_from_a_file_;
    private static final SubLString $str36$_2;
    private static final SubLString $str37$_;
    private static final SubLInteger $int38$60;
    private static final SubLString $str39$_File_not_found_;
    private static final SubLString $str40$Import_an_ontology_from_accessibl;
    private static final SubLString $str41$_Invalid_URI;
    private static final SubLString $str42$Format_for_term_names_in___synony;
    private static final SubLString $str43$Short__local_names_only_;
    private static final SubLSymbol $kw44$MEDIUM;
    private static final SubLString $str45$Medium__prefixed_names__using_pre;
    private static final SubLSymbol $kw46$SYNONYMOUS_CONCEPT_PREFIX;
    private static final SubLSymbol $kw47$LONG;
    private static final SubLString $str48$Long__full_URIs_;
    private static final SubLString $str49$Use_an_existing_Cyc_term_to_repre;
    private static final SubLString $str50$Create_constants_for_OWL_terms_us;
    private static final SubLString $str51$Newly_created_constants_for_terms;
    private static final SubLSymbol $kw52$CONSTANT_PREFIX;
    private static final SubLString $str53$Create_constants_for_OWL_terms_us;
    private static final SubLString $str54$Newly_created_constants_for_terms;
    private static final SubLSymbol $kw55$CONSTANT_SUFFIX;
    private static final SubLSymbol $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES;
    private static final SubLString $str57$Use_namespace_prefixes_as_constan;
    private static final SubLString $str58$When_importing_OWL_that_creates_t;
    private static final SubLString $str59$Override_the_URI_;
    private static final SubLSymbol $kw60$ONTOLOGY_URI;
    private static final SubLString $str61$;
    private static final SubLString $str62$Please_fill_out_the_starred_field;
    private static final SubLSymbol $kw63$VERBOSE_;
    private static final SubLSymbol $kw64$PROGRESS_STREAM;
    private static final SubLString $str65$Importing_an_OWL_ontology;
    private static final SubLSymbol $sym66$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str67$Error_during_import_;
    private static final SubLSymbol $sym68$_EXIT;
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-importer.lisp", position = 872L)
    public static SubLObject cb_owl_import(SubLObject args) {
        if (args == cb_owl_importer.UNPROVIDED) {
            args = (SubLObject)cb_owl_importer.NIL;
        }
        if (cb_owl_importer.NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn((SubLObject)cb_owl_importer.$str0$OWL_Importer);
        }
        return cb_owl_import_internal(html_arghash.arglist_to_arghash(args));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-importer.lisp", position = 1052L)
    public static SubLObject cb_owl_import_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject debug = (SubLObject)cb_owl_importer.NIL;
        final SubLObject generation_fn = Symbols.symbol_function((SubLObject)cb_owl_importer.$sym3$FORT_TO_STRING);
        final SubLObject parse_fn = Symbols.symbol_function((SubLObject)cb_owl_importer.$sym4$TERMS_FOR_BROWSING);
        SubLObject initial_entryP = (SubLObject)cb_owl_importer.NIL;
        SubLObject errors_foundP = (SubLObject)cb_owl_importer.NIL;
        if (cb_owl_importer.NIL == html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw5$TYPE, arghash)) {
            initial_entryP = (SubLObject)cb_owl_importer.T;
            html_arghash.set_arghash_value((SubLObject)cb_owl_importer.$kw5$TYPE, arghash, (SubLObject)cb_owl_importer.$kw6$IMPORT_FROM_FILE);
            html_arghash.set_arghash_value((SubLObject)cb_owl_importer.$kw7$TERM_NAME_FORMAT, arghash, (SubLObject)cb_owl_importer.$kw8$SHORT);
        }
        html_arghash.html_arghash_nl_fort_input_validate(arghash, (SubLObject)cb_owl_importer.$kw9$ONTOLOGY_TERM, debug, generation_fn, parse_fn, cb_owl_importer.$const10$Ontology, (SubLObject)cb_owl_importer.UNPROVIDED);
        if (cb_owl_importer.NIL == initial_entryP && ((cb_owl_importer.$kw6$IMPORT_FROM_FILE == html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw5$TYPE, arghash) && cb_owl_importer.NIL != string_utilities.non_empty_stringP(html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw11$IMPORT_FILENAME, arghash)) && cb_owl_importer.NIL != file_utilities.file_existsP(html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw11$IMPORT_FILENAME, arghash))) || (cb_owl_importer.$kw12$IMPORT_FROM_URI == html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw5$TYPE, arghash) && cb_owl_importer.NIL != string_utilities.non_empty_stringP(html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw13$IMPORT_URI, arghash)) && cb_owl_importer.NIL != web_utilities.uri_p(html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw13$IMPORT_URI, arghash), (SubLObject)cb_owl_importer.UNPROVIDED)))) {
            return cb_owl_perform_import(arghash);
        }
        final SubLObject title_var = (SubLObject)cb_owl_importer.$str14$Import_an_OWL_ontology;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind((cb_owl_importer.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED), thread);
            html_utilities.html_markup((SubLObject)cb_owl_importer.$str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (cb_owl_importer.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_owl_importer.$str16$_meta_http_equiv__X_UA_Compatible);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_owl_importer.$kw17$UNINITIALIZED) ? ConsesLow.list(cb_owl_importer.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_parameters.cb_head_shortcut_icon();
                html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css((SubLObject)cb_owl_importer.$kw18$CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (cb_owl_importer.NIL != title_var) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_utilities.html_princ(title_var);
                    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_complete.html_complete_script();
                cyc_file_dependencies.css((SubLObject)cb_owl_importer.$kw19$SAM_AUTOCOMPLETE_CSS);
                html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind((SubLObject)cb_owl_importer.T, thread);
                    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (cb_owl_importer.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                    }
                    html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_owl_importer.$str21$yui_skin_sam);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                    final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                        html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_owl_importer.$str22$reloadFrameButton);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                        final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                            html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_importer.$str23$button);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_importer.$str24$reload);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str25$Refresh_Frames);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            if (cb_owl_importer.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (cb_owl_importer.NIL != title_var) {
                            html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ(title_var);
                            html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_utilities.html_markup((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                        }
                        html_script_utilities.cb_hoverover_page_init();
                        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_owl_importer.NIL);
                        html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_owl_importer.$str26$post);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        if (cb_owl_importer.NIL != frame_name_var) {
                            html_utilities.html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(frame_name_var);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        }
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                        final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                            html_macros.$within_html_form$.bind((SubLObject)cb_owl_importer.T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_utilities.html_hidden_input((SubLObject)cb_owl_importer.$str27$cb_owl_import, (SubLObject)cb_owl_importer.T, (SubLObject)cb_owl_importer.UNPROVIDED);
                            cb_utilities.cb_help_preamble((SubLObject)cb_owl_importer.$kw28$CB_OWL_TO_CYCL, (SubLObject)cb_owl_importer.NIL, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            cb_utilities.cb_back_button((SubLObject)cb_owl_importer.$kw29$SELF, (SubLObject)cb_owl_importer.$str30$Back);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_reset_input((SubLObject)cb_owl_importer.$str31$Clear);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_owl_importer.$str32$Import, (SubLObject)cb_owl_importer.$kw33$IMPORT, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str34$Choose_the_method_for_determining);
                            html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_owl_importer.$kw5$TYPE, (SubLObject)cb_owl_importer.$kw6$IMPORT_FROM_FILE);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str35$Import_an_ontology_from_a_file_);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.THREE_INTEGER);
                            SubLObject requiredP = (SubLObject)SubLObjectFactory.makeBoolean(cb_owl_importer.NIL == initial_entryP && cb_owl_importer.$kw6$IMPORT_FROM_FILE == html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw5$TYPE, arghash));
                            if (cb_owl_importer.NIL != requiredP) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_owl_importer.$str36$_2);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_owl_importer.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_owl_importer.$str37$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = (SubLObject)cb_owl_importer.T;
                            }
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_owl_importer.$kw11$IMPORT_FILENAME, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_importer.$int38$60, (SubLObject)cb_owl_importer.UNPROVIDED);
                            if (cb_owl_importer.NIL != requiredP) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_owl_importer.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_owl_importer.$str39$_File_not_found_);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_owl_importer.$kw5$TYPE, (SubLObject)cb_owl_importer.$kw12$IMPORT_FROM_URI);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str40$Import_an_ontology_from_accessibl);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.THREE_INTEGER);
                            requiredP = (SubLObject)SubLObjectFactory.makeBoolean(cb_owl_importer.NIL == initial_entryP && cb_owl_importer.$kw12$IMPORT_FROM_URI == html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw5$TYPE, arghash));
                            if (cb_owl_importer.NIL != requiredP) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_owl_importer.$str36$_2);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_owl_importer.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                        html_utilities.html_princ((SubLObject)cb_owl_importer.$str37$_);
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = (SubLObject)cb_owl_importer.T;
                            }
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_owl_importer.$kw13$IMPORT_URI, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_importer.$int38$60, (SubLObject)cb_owl_importer.UNPROVIDED);
                            if (cb_owl_importer.NIL != requiredP) {
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_owl_importer.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                    html_utilities.html_princ((SubLObject)cb_owl_importer.$str41$_Invalid_URI);
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.ONE_INTEGER);
                            html_utilities.html_hr((SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ_strong((SubLObject)cb_owl_importer.$str42$Format_for_term_names_in___synony);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_owl_importer.$kw7$TERM_NAME_FORMAT, (SubLObject)cb_owl_importer.$kw8$SHORT);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str43$Short__local_names_only_);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_owl_importer.$kw7$TERM_NAME_FORMAT, (SubLObject)cb_owl_importer.$kw44$MEDIUM);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str45$Medium__prefixed_names__using_pre);
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_owl_importer.$kw46$SYNONYMOUS_CONCEPT_PREFIX, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_importer.TEN_INTEGER, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, (SubLObject)cb_owl_importer.$kw7$TERM_NAME_FORMAT, (SubLObject)cb_owl_importer.$kw47$LONG);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str48$Long__full_URIs_);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str49$Use_an_existing_Cyc_term_to_repre);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_nl_fort_input(arghash, (SubLObject)cb_owl_importer.$kw9$ONTOLOGY_TERM, debug, generation_fn, (SubLObject)cb_owl_importer.NIL, (SubLObject)cb_owl_importer.T, cb_owl_importer.$const10$Ontology);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_query.html_princ_with_explanation((SubLObject)cb_owl_importer.$str50$Create_constants_for_OWL_terms_us, (SubLObject)cb_owl_importer.$str51$Newly_created_constants_for_terms, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.THREE_INTEGER);
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_owl_importer.$kw52$CONSTANT_PREFIX, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_importer.TEN_INTEGER, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_query.html_princ_with_explanation((SubLObject)cb_owl_importer.$str53$Create_constants_for_OWL_terms_us, (SubLObject)cb_owl_importer.$str54$Newly_created_constants_for_terms, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.THREE_INTEGER);
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_owl_importer.$kw55$CONSTANT_SUFFIX, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)cb_owl_importer.TEN_INTEGER, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, (SubLObject)cb_owl_importer.$kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, (SubLObject)cb_owl_importer.T, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_query.html_princ_with_explanation((SubLObject)cb_owl_importer.$str57$Use_namespace_prefixes_as_constan, (SubLObject)cb_owl_importer.$str58$When_importing_OWL_that_creates_t, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_utilities.html_princ((SubLObject)cb_owl_importer.$str59$Override_the_URI_);
                            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_indent((SubLObject)cb_owl_importer.THREE_INTEGER);
                            html_arghash.html_arghash_text_input(arghash, (SubLObject)cb_owl_importer.$kw60$ONTOLOGY_URI, (SubLObject)cb_owl_importer.$str61$, (SubLObject)cb_owl_importer.$int38$60, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_hr((SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED);
                            if (cb_owl_importer.NIL == initial_entryP || cb_owl_importer.NIL != errors_foundP) {
                                html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (cb_owl_importer.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                    html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_utilities.html_princ((SubLObject)cb_owl_importer.$str62$Please_fill_out_the_starred_field);
                                    html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                }
                                finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_utilities.html_newline((SubLObject)cb_owl_importer.TWO_INTEGER);
                            html_arghash.html_arghash_submit_input(arghash, (SubLObject)cb_owl_importer.$str32$Import, (SubLObject)cb_owl_importer.$kw33$IMPORT, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        }
                        finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_copyright_notice();
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                }
                finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
            }
            finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
        }
        finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)cb_owl_importer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/owl/cb-owl-importer.lisp", position = 7064L)
    public static SubLObject cb_owl_perform_import(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ontology_uri = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw13$IMPORT_URI, arghash);
        final SubLObject filename = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw11$IMPORT_FILENAME, arghash);
        final SubLObject constant_prefix = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw52$CONSTANT_PREFIX, arghash);
        final SubLObject constant_suffix = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw55$CONSTANT_SUFFIX, arghash);
        final SubLObject ontology_term = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw9$ONTOLOGY_TERM, arghash);
        final SubLObject term_name_format = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw7$TERM_NAME_FORMAT, arghash);
        final SubLObject synonymous_concept_prefix = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw46$SYNONYMOUS_CONCEPT_PREFIX, arghash);
        final SubLObject use_namespace_prefixes_as_constant_prefixes = html_arghash.get_arghash_value((SubLObject)cb_owl_importer.$kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, arghash);
        SubLObject options = (SubLObject)ConsesLow.list((SubLObject)cb_owl_importer.$kw63$VERBOSE_, (SubLObject)cb_owl_importer.T, (SubLObject)cb_owl_importer.$kw64$PROGRESS_STREAM, html_macros.$html_stream$.getDynamicValue(thread));
        SubLObject importer = (SubLObject)cb_owl_importer.NIL;
        if (cb_owl_importer.NIL != string_utilities.non_empty_stringP(ontology_uri)) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw60$ONTOLOGY_URI, ontology_uri);
        }
        if (cb_owl_importer.NIL != string_utilities.non_empty_stringP(constant_prefix)) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw52$CONSTANT_PREFIX, constant_prefix);
        }
        if (cb_owl_importer.NIL != string_utilities.non_empty_stringP(constant_suffix)) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw55$CONSTANT_SUFFIX, constant_suffix);
        }
        if (cb_owl_importer.NIL != forts.fort_p(ontology_term)) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw9$ONTOLOGY_TERM, ontology_term);
        }
        if (term_name_format == cb_owl_importer.$kw8$SHORT) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw46$SYNONYMOUS_CONCEPT_PREFIX, (SubLObject)cb_owl_importer.$str61$);
        }
        else if (term_name_format == cb_owl_importer.$kw44$MEDIUM) {
            if (cb_owl_importer.NIL != string_utilities.non_empty_stringP(synonymous_concept_prefix)) {
                options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw46$SYNONYMOUS_CONCEPT_PREFIX, synonymous_concept_prefix);
            }
        }
        else if (term_name_format == cb_owl_importer.$kw47$LONG) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw46$SYNONYMOUS_CONCEPT_PREFIX, (SubLObject)cb_owl_importer.T);
        }
        if (cb_owl_importer.NIL != use_namespace_prefixes_as_constant_prefixes) {
            options = conses_high.putf(options, (SubLObject)cb_owl_importer.$kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, (SubLObject)cb_owl_importer.T);
        }
        final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            StreamsLow.$standard_output$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            SubLObject error_string = (SubLObject)cb_owl_importer.NIL;
            final SubLObject title_var = (SubLObject)cb_owl_importer.$str65$Importing_an_OWL_ontology;
            final SubLObject _prev_bind_0_$13 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind((cb_owl_importer.NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread))) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator((SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED, (SubLObject)cb_owl_importer.UNPROVIDED), thread);
                html_utilities.html_markup((SubLObject)cb_owl_importer.$str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (cb_owl_importer.NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                    html_utilities.html_markup((SubLObject)cb_owl_importer.$str16$_meta_http_equiv__X_UA_Compatible);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind((SubLObject)((cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == cb_owl_importer.$kw17$UNINITIALIZED) ? ConsesLow.list(cb_owl_importer.EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread)), thread);
                    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_parameters.cb_head_shortcut_icon();
                    html_utilities.html_meta_robot_instructions(cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue(thread), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css((SubLObject)cb_owl_importer.$kw18$CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (cb_owl_importer.NIL != title_var) {
                        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_utilities.html_princ(title_var);
                        html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind((SubLObject)cb_owl_importer.T, thread);
                        html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (cb_owl_importer.NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup(html_utilities.html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        }
                        html_utilities.html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_markup((SubLObject)cb_owl_importer.$str21$yui_skin_sam);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                            html_utilities.html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_utilities.html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_markup((SubLObject)cb_owl_importer.$str22$reloadFrameButton);
                            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                html_utilities.html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_utilities.html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_owl_importer.$str23$button);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup((SubLObject)cb_owl_importer.$str24$reload);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_princ((SubLObject)cb_owl_importer.$str25$Refresh_Frames);
                                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                if (cb_owl_importer.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                            }
                            finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (cb_owl_importer.NIL != title_var) {
                                html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_owl_importer.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                html_utilities.html_princ(title_var);
                                html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_utilities.html_markup((SubLObject)cb_owl_importer.TWO_INTEGER);
                                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                            }
                            html_macros.verify_not_within_html_pre();
                            html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$18 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind((SubLObject)cb_owl_importer.T, thread);
                                html_utilities.html_flush();
                                try {
                                    thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$19 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind((SubLObject)cb_owl_importer.$sym66$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (cb_owl_importer.NIL != file_utilities.file_existsP(filename)) {
                                                if (cb_owl_importer.NIL != string_utilities.non_empty_stringP(ontology_uri)) {
                                                    importer = owl_importer2.owl_import_uri_from_file(ontology_uri, filename, options);
                                                }
                                                else {
                                                    importer = owl_importer2.owl_import_file(filename, options);
                                                }
                                            }
                                            else {
                                                importer = owl_importer2.owl_import_uri(ontology_uri, options);
                                            }
                                        }
                                        catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, (SubLObject)cb_owl_importer.NIL);
                                        }
                                    }
                                    finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                                catch (Throwable ccatch_env_var) {
                                    error_string = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (cb_owl_importer.NIL != error_string) {
                                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (cb_owl_importer.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    }
                                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_owl_importer.UNPROVIDED);
                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind((SubLObject)cb_owl_importer.T, thread);
                                        html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_utilities.html_princ((SubLObject)cb_owl_importer.$str67$Error_during_import_);
                                        html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    }
                                    finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_utilities.html_newline((SubLObject)cb_owl_importer.UNPROVIDED);
                                    html_utilities.html_princ(error_string);
                                }
                            }
                            finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                            html_utilities.html_copyright_notice();
                        }
                        finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
                    }
                    finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
                }
                finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$14, thread);
                }
                html_utilities.html_source_readability_terpri((SubLObject)cb_owl_importer.UNPROVIDED);
            }
            finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$13, thread);
            }
            return importer;
        }
        finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
        }
    }
    
    public static SubLObject declare_cb_owl_importer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_importer", "cb_owl_import", "CB-OWL-IMPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_importer", "cb_owl_import_internal", "CB-OWL-IMPORT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.owl.cb_owl_importer", "cb_owl_perform_import", "CB-OWL-PERFORM-IMPORT", 1, 0, false);
        return (SubLObject)cb_owl_importer.NIL;
    }
    
    public static SubLObject init_cb_owl_importer_file() {
        return (SubLObject)cb_owl_importer.NIL;
    }
    
    public static SubLObject setup_cb_owl_importer_file() {
        html_macros.note_cgi_handler_function((SubLObject)cb_owl_importer.$sym1$CB_OWL_IMPORT, (SubLObject)cb_owl_importer.$kw2$HTML_HANDLER);
        return (SubLObject)cb_owl_importer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cb_owl_importer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cb_owl_importer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cb_owl_importer_file();
    }
    
    static {
        me = (SubLFile)new cb_owl_importer();
        $str0$OWL_Importer = SubLObjectFactory.makeString("OWL Importer");
        $sym1$CB_OWL_IMPORT = SubLObjectFactory.makeSymbol("CB-OWL-IMPORT");
        $kw2$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym3$FORT_TO_STRING = SubLObjectFactory.makeSymbol("FORT-TO-STRING");
        $sym4$TERMS_FOR_BROWSING = SubLObjectFactory.makeSymbol("TERMS-FOR-BROWSING");
        $kw5$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw6$IMPORT_FROM_FILE = SubLObjectFactory.makeKeyword("IMPORT-FROM-FILE");
        $kw7$TERM_NAME_FORMAT = SubLObjectFactory.makeKeyword("TERM-NAME-FORMAT");
        $kw8$SHORT = SubLObjectFactory.makeKeyword("SHORT");
        $kw9$ONTOLOGY_TERM = SubLObjectFactory.makeKeyword("ONTOLOGY-TERM");
        $const10$Ontology = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Ontology"));
        $kw11$IMPORT_FILENAME = SubLObjectFactory.makeKeyword("IMPORT-FILENAME");
        $kw12$IMPORT_FROM_URI = SubLObjectFactory.makeKeyword("IMPORT-FROM-URI");
        $kw13$IMPORT_URI = SubLObjectFactory.makeKeyword("IMPORT-URI");
        $str14$Import_an_OWL_ontology = SubLObjectFactory.makeString("Import an OWL ontology");
        $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = SubLObjectFactory.makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");
        $str16$_meta_http_equiv__X_UA_Compatible = SubLObjectFactory.makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");
        $kw17$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $kw18$CB_CYC = SubLObjectFactory.makeKeyword("CB-CYC");
        $kw19$SAM_AUTOCOMPLETE_CSS = SubLObjectFactory.makeKeyword("SAM-AUTOCOMPLETE-CSS");
        $kw20$SHA1 = SubLObjectFactory.makeKeyword("SHA1");
        $str21$yui_skin_sam = SubLObjectFactory.makeString("yui-skin-sam");
        $str22$reloadFrameButton = SubLObjectFactory.makeString("reloadFrameButton");
        $str23$button = SubLObjectFactory.makeString("button");
        $str24$reload = SubLObjectFactory.makeString("reload");
        $str25$Refresh_Frames = SubLObjectFactory.makeString("Refresh Frames");
        $str26$post = SubLObjectFactory.makeString("post");
        $str27$cb_owl_import = SubLObjectFactory.makeString("cb-owl-import");
        $kw28$CB_OWL_TO_CYCL = SubLObjectFactory.makeKeyword("CB-OWL-TO-CYCL");
        $kw29$SELF = SubLObjectFactory.makeKeyword("SELF");
        $str30$Back = SubLObjectFactory.makeString("Back");
        $str31$Clear = SubLObjectFactory.makeString("Clear");
        $str32$Import = SubLObjectFactory.makeString("Import");
        $kw33$IMPORT = SubLObjectFactory.makeKeyword("IMPORT");
        $str34$Choose_the_method_for_determining = SubLObjectFactory.makeString("Choose the method for determining the import OWL:");
        $str35$Import_an_ontology_from_a_file_ = SubLObjectFactory.makeString("Import an ontology from a file:");
        $str36$_2 = SubLObjectFactory.makeString("+2");
        $str37$_ = SubLObjectFactory.makeString("*");
        $int38$60 = SubLObjectFactory.makeInteger(60);
        $str39$_File_not_found_ = SubLObjectFactory.makeString(" File not found.");
        $str40$Import_an_ontology_from_accessibl = SubLObjectFactory.makeString("Import an ontology from accessible URI:");
        $str41$_Invalid_URI = SubLObjectFactory.makeString(" Invalid URI");
        $str42$Format_for_term_names_in___synony = SubLObjectFactory.makeString("Format for term names in #$synonymousExternalConcept assertions:");
        $str43$Short__local_names_only_ = SubLObjectFactory.makeString("Short (local names only)");
        $kw44$MEDIUM = SubLObjectFactory.makeKeyword("MEDIUM");
        $str45$Medium__prefixed_names__using_pre = SubLObjectFactory.makeString("Medium (prefixed names) using prefix: ");
        $kw46$SYNONYMOUS_CONCEPT_PREFIX = SubLObjectFactory.makeKeyword("SYNONYMOUS-CONCEPT-PREFIX");
        $kw47$LONG = SubLObjectFactory.makeKeyword("LONG");
        $str48$Long__full_URIs_ = SubLObjectFactory.makeString("Long (full URIs)");
        $str49$Use_an_existing_Cyc_term_to_repre = SubLObjectFactory.makeString("Use an existing Cyc term to represent the ontology:");
        $str50$Create_constants_for_OWL_terms_us = SubLObjectFactory.makeString("Create constants for OWL terms using prefix:");
        $str51$Newly_created_constants_for_terms = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");
        $kw52$CONSTANT_PREFIX = SubLObjectFactory.makeKeyword("CONSTANT-PREFIX");
        $str53$Create_constants_for_OWL_terms_us = SubLObjectFactory.makeString("Create constants for OWL terms using suffix:");
        $str54$Newly_created_constants_for_terms = SubLObjectFactory.makeString("Newly created constants for terms in the imported ontology will have names that end with this suffix");
        $kw55$CONSTANT_SUFFIX = SubLObjectFactory.makeKeyword("CONSTANT-SUFFIX");
        $kw56$USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES = SubLObjectFactory.makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES");
        $str57$Use_namespace_prefixes_as_constan = SubLObjectFactory.makeString("Use namespace prefixes as constant prefixes");
        $str58$When_importing_OWL_that_creates_t = SubLObjectFactory.makeString("When importing OWL that creates terms in multiple namespaces, use the namespace prefix from the OWL to create Cyc constants.");
        $str59$Override_the_URI_ = SubLObjectFactory.makeString("Override the URI:");
        $kw60$ONTOLOGY_URI = SubLObjectFactory.makeKeyword("ONTOLOGY-URI");
        $str61$ = SubLObjectFactory.makeString("");
        $str62$Please_fill_out_the_starred_field = SubLObjectFactory.makeString("Please fill out the starred fields");
        $kw63$VERBOSE_ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $kw64$PROGRESS_STREAM = SubLObjectFactory.makeKeyword("PROGRESS-STREAM");
        $str65$Importing_an_OWL_ontology = SubLObjectFactory.makeString("Importing an OWL ontology");
        $sym66$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str67$Error_during_import_ = SubLObjectFactory.makeString("Error during import:");
        $sym68$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
    }
}

/*

	Total time: 498 ms
	
*/