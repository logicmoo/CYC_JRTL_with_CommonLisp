package com.cyc.cycjava.cycl.owl;


import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.owl.cb_owl_importer;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import static com.cyc.cycjava.cycl.owl.cb_owl_importer.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_owl_importer extends SubLTranslatedFile {
    public static final SubLFile me = new cb_owl_importer();

    public static final String myName = "com.cyc.cycjava.cycl.owl.cb_owl_importer";

    public static final String myFingerPrint = "0b5699993fe7cf96a7865f643b04eaa0fc6904660e81e6a0008f43ecc4f41f18";

    private static final SubLString $$$OWL_Importer = makeString("OWL Importer");

    private static final SubLSymbol CB_OWL_IMPORT = makeSymbol("CB-OWL-IMPORT");



    private static final SubLSymbol FORT_TO_STRING = makeSymbol("FORT-TO-STRING");

    private static final SubLSymbol TERMS_FOR_BROWSING = makeSymbol("TERMS-FOR-BROWSING");



    private static final SubLSymbol $IMPORT_FROM_FILE = makeKeyword("IMPORT-FROM-FILE");

    private static final SubLSymbol $TERM_NAME_FORMAT = makeKeyword("TERM-NAME-FORMAT");

    private static final SubLSymbol $SHORT = makeKeyword("SHORT");



    private static final SubLObject $$Ontology = reader_make_constant_shell(makeString("Ontology"));

    private static final SubLSymbol $IMPORT_FILENAME = makeKeyword("IMPORT-FILENAME");

    private static final SubLSymbol $IMPORT_FROM_URI = makeKeyword("IMPORT-FROM-URI");

    private static final SubLSymbol $IMPORT_URI = makeKeyword("IMPORT-URI");

    private static final SubLString $$$Import_an_OWL_ontology = makeString("Import an OWL ontology");

    private static final SubLString $str15$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str16$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str21$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str27$cb_owl_import = makeString("cb-owl-import");

    private static final SubLSymbol $CB_OWL_TO_CYCL = makeKeyword("CB-OWL-TO-CYCL");



    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$Import = makeString("Import");



    private static final SubLString $str34$Choose_the_method_for_determining = makeString("Choose the method for determining the import OWL:");

    private static final SubLString $str35$Import_an_ontology_from_a_file_ = makeString("Import an ontology from a file:");

    private static final SubLString $str36$_2 = makeString("+2");

    private static final SubLString $str37$_ = makeString("*");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str39$_File_not_found_ = makeString(" File not found.");

    private static final SubLString $str40$Import_an_ontology_from_accessibl = makeString("Import an ontology from accessible URI:");

    private static final SubLString $$$_Invalid_URI = makeString(" Invalid URI");

    private static final SubLString $str42$Format_for_term_names_in___synony = makeString("Format for term names in #$synonymousExternalConcept assertions:");

    private static final SubLString $str43$Short__local_names_only_ = makeString("Short (local names only)");



    private static final SubLString $str45$Medium__prefixed_names__using_pre = makeString("Medium (prefixed names) using prefix: ");

    private static final SubLSymbol $SYNONYMOUS_CONCEPT_PREFIX = makeKeyword("SYNONYMOUS-CONCEPT-PREFIX");

    private static final SubLSymbol $LONG = makeKeyword("LONG");

    private static final SubLString $str48$Long__full_URIs_ = makeString("Long (full URIs)");

    private static final SubLString $str49$Use_an_existing_Cyc_term_to_repre = makeString("Use an existing Cyc term to represent the ontology:");

    private static final SubLString $str50$Create_constants_for_OWL_terms_us = makeString("Create constants for OWL terms using prefix:");

    private static final SubLString $str51$Newly_created_constants_for_terms = makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");



    private static final SubLString $str53$Create_constants_for_OWL_terms_us = makeString("Create constants for OWL terms using suffix:");

    private static final SubLString $str54$Newly_created_constants_for_terms = makeString("Newly created constants for terms in the imported ontology will have names that end with this suffix");



    private static final SubLSymbol $USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES = makeKeyword("USE-NAMESPACE-PREFIXES-AS-CONSTANT-PREFIXES");

    private static final SubLString $str57$Use_namespace_prefixes_as_constan = makeString("Use namespace prefixes as constant prefixes");

    private static final SubLString $str58$When_importing_OWL_that_creates_t = makeString("When importing OWL that creates terms in multiple namespaces, use the namespace prefix from the OWL to create Cyc constants.");

    private static final SubLString $str59$Override_the_URI_ = makeString("Override the URI:");



    private static final SubLString $str61$ = makeString("");

    private static final SubLString $str62$Please_fill_out_the_starred_field = makeString("Please fill out the starred fields");





    private static final SubLString $$$Importing_an_OWL_ontology = makeString("Importing an OWL ontology");



    private static final SubLString $str67$Error_during_import_ = makeString("Error during import:");

    private static final SubLSymbol $sym68$_EXIT = makeSymbol("%EXIT");

    public static SubLObject cb_owl_import(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL != ke.cyclist_is_guest()) {
            return cyc_navigator_internals.guest_warn($$$OWL_Importer);
        }
        return cb_owl_import_internal(html_arghash.arglist_to_arghash(args));
    }

    public static SubLObject cb_owl_import_internal(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject debug = NIL;
        final SubLObject generation_fn = symbol_function(FORT_TO_STRING);
        final SubLObject parse_fn = symbol_function(TERMS_FOR_BROWSING);
        SubLObject initial_entryP = NIL;
        SubLObject errors_foundP = NIL;
        if (NIL == html_arghash.get_arghash_value($TYPE, arghash)) {
            initial_entryP = T;
            html_arghash.set_arghash_value($TYPE, arghash, $IMPORT_FROM_FILE);
            html_arghash.set_arghash_value($TERM_NAME_FORMAT, arghash, $SHORT);
        }
        html_arghash.html_arghash_nl_fort_input_validate(arghash, $ONTOLOGY_TERM, debug, generation_fn, parse_fn, $$Ontology, UNPROVIDED);
        if ((NIL == initial_entryP) && (((($IMPORT_FROM_FILE == html_arghash.get_arghash_value($TYPE, arghash)) && (NIL != string_utilities.non_empty_stringP(html_arghash.get_arghash_value($IMPORT_FILENAME, arghash)))) && (NIL != file_utilities.file_existsP(html_arghash.get_arghash_value($IMPORT_FILENAME, arghash)))) || ((($IMPORT_FROM_URI == html_arghash.get_arghash_value($TYPE, arghash)) && (NIL != string_utilities.non_empty_stringP(html_arghash.get_arghash_value($IMPORT_URI, arghash)))) && (NIL != web_utilities.uri_p(html_arghash.get_arghash_value($IMPORT_URI, arghash), UNPROVIDED))))) {
            return cb_owl_perform_import(arghash);
        }
        final SubLObject title_var = $$$Import_an_OWL_ontology;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str16$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str21$yui_skin_sam);
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
                        html_script_utilities.cb_hoverover_page_init();
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
                            html_hidden_input($str27$cb_owl_import, T, UNPROVIDED);
                            cb_help_preamble($CB_OWL_TO_CYCL, NIL, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_back_button($SELF, $$$Back);
                            html_indent(UNPROVIDED);
                            html_reset_input($$$Clear);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_submit_input(arghash, $$$Import, $IMPORT, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($str34$Choose_the_method_for_determining);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_arghash.html_arghash_radio_input(arghash, $TYPE, $IMPORT_FROM_FILE);
                            html_indent(UNPROVIDED);
                            html_princ($str35$Import_an_ontology_from_a_file_);
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            SubLObject requiredP = makeBoolean((NIL == initial_entryP) && ($IMPORT_FROM_FILE == html_arghash.get_arghash_value($TYPE, arghash)));
                            if (NIL != requiredP) {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str36$_2);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str37$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = T;
                            }
                            html_arghash.html_arghash_text_input(arghash, $IMPORT_FILENAME, string_utilities.$empty_string$.getGlobalValue(), $int$60, UNPROVIDED);
                            if (NIL != requiredP) {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str39$_File_not_found_);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $TYPE, $IMPORT_FROM_URI);
                            html_indent(UNPROVIDED);
                            html_princ($str40$Import_an_ontology_from_accessibl);
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            requiredP = makeBoolean((NIL == initial_entryP) && ($IMPORT_FROM_URI == html_arghash.get_arghash_value($TYPE, arghash)));
                            if (NIL != requiredP) {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                html_markup(html_macros.$html_font_size$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str36$_2);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str37$_);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                errors_foundP = T;
                            }
                            html_arghash.html_arghash_text_input(arghash, $IMPORT_URI, string_utilities.$empty_string$.getGlobalValue(), $int$60, UNPROVIDED);
                            if (NIL != requiredP) {
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($$$_Invalid_URI);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_newline(UNPROVIDED);
                            html_newline(ONE_INTEGER);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            html_princ_strong($str42$Format_for_term_names_in___synony);
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $TERM_NAME_FORMAT, $SHORT);
                            html_indent(UNPROVIDED);
                            html_princ($str43$Short__local_names_only_);
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $TERM_NAME_FORMAT, $MEDIUM);
                            html_indent(UNPROVIDED);
                            html_princ($str45$Medium__prefixed_names__using_pre);
                            html_arghash.html_arghash_text_input(arghash, $SYNONYMOUS_CONCEPT_PREFIX, string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_radio_input(arghash, $TERM_NAME_FORMAT, $LONG);
                            html_indent(UNPROVIDED);
                            html_princ($str48$Long__full_URIs_);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str49$Use_an_existing_Cyc_term_to_repre);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_arghash.html_arghash_nl_fort_input(arghash, $ONTOLOGY_TERM, debug, generation_fn, NIL, T, $$Ontology);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_query.html_princ_with_explanation($str50$Create_constants_for_OWL_terms_us, $str51$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_arghash.html_arghash_text_input(arghash, $CONSTANT_PREFIX, string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_query.html_princ_with_explanation($str53$Create_constants_for_OWL_terms_us, $str54$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_arghash.html_arghash_text_input(arghash, $CONSTANT_SUFFIX, string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_checkbox_input(arghash, $USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, T, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            cb_query.html_princ_with_explanation($str57$Use_namespace_prefixes_as_constan, $str58$When_importing_OWL_that_creates_t, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str59$Override_the_URI_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_indent(THREE_INTEGER);
                            html_arghash.html_arghash_text_input(arghash, $ONTOLOGY_URI, $str61$, $int$60, UNPROVIDED);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            if ((NIL == initial_entryP) || (NIL != errors_foundP)) {
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_font_head$.getGlobalValue());
                                if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                    html_princ($str62$Please_fill_out_the_starred_field);
                                    html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                }
                                html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            }
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_submit_input(arghash, $$$Import, $IMPORT, UNPROVIDED);
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

    public static SubLObject cb_owl_perform_import(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ontology_uri = html_arghash.get_arghash_value($IMPORT_URI, arghash);
        final SubLObject filename = html_arghash.get_arghash_value($IMPORT_FILENAME, arghash);
        final SubLObject constant_prefix = html_arghash.get_arghash_value($CONSTANT_PREFIX, arghash);
        final SubLObject constant_suffix = html_arghash.get_arghash_value($CONSTANT_SUFFIX, arghash);
        final SubLObject ontology_term = html_arghash.get_arghash_value($ONTOLOGY_TERM, arghash);
        final SubLObject term_name_format = html_arghash.get_arghash_value($TERM_NAME_FORMAT, arghash);
        final SubLObject synonymous_concept_prefix = html_arghash.get_arghash_value($SYNONYMOUS_CONCEPT_PREFIX, arghash);
        final SubLObject use_namespace_prefixes_as_constant_prefixes = html_arghash.get_arghash_value($USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, arghash);
        SubLObject options = list($VERBOSE_, T, $PROGRESS_STREAM, html_macros.$html_stream$.getDynamicValue(thread));
        SubLObject importer = NIL;
        if (NIL != string_utilities.non_empty_stringP(ontology_uri)) {
            options = putf(options, $ONTOLOGY_URI, ontology_uri);
        }
        if (NIL != string_utilities.non_empty_stringP(constant_prefix)) {
            options = putf(options, $CONSTANT_PREFIX, constant_prefix);
        }
        if (NIL != string_utilities.non_empty_stringP(constant_suffix)) {
            options = putf(options, $CONSTANT_SUFFIX, constant_suffix);
        }
        if (NIL != forts.fort_p(ontology_term)) {
            options = putf(options, $ONTOLOGY_TERM, ontology_term);
        }
        if (term_name_format == $SHORT) {
            options = putf(options, $SYNONYMOUS_CONCEPT_PREFIX, $str61$);
        } else
            if (term_name_format == $MEDIUM) {
                if (NIL != string_utilities.non_empty_stringP(synonymous_concept_prefix)) {
                    options = putf(options, $SYNONYMOUS_CONCEPT_PREFIX, synonymous_concept_prefix);
                }
            } else
                if (term_name_format == $LONG) {
                    options = putf(options, $SYNONYMOUS_CONCEPT_PREFIX, T);
                }


        if (NIL != use_namespace_prefixes_as_constant_prefixes) {
            options = putf(options, $USE_NAMESPACE_PREFIXES_AS_CONSTANT_PREFIXES, T);
        }
        final SubLObject _prev_bind_0 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            StreamsLow.$standard_output$.bind(html_macros.$html_stream$.getDynamicValue(thread), thread);
            SubLObject error_string = NIL;
            final SubLObject title_var = $$$Importing_an_OWL_ontology;
            final SubLObject _prev_bind_0_$13 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str15$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str16$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$14 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                        html_markup($str21$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
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
                            html_macros.verify_not_within_html_pre();
                            html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
                            final SubLObject _prev_bind_0_$18 = html_macros.$within_html_pre$.currentBinding(thread);
                            try {
                                html_macros.$within_html_pre$.bind(T, thread);
                                html_flush();
                                try {
                                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                    final SubLObject _prev_bind_0_$19 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            if (NIL != file_utilities.file_existsP(filename)) {
                                                if (NIL != string_utilities.non_empty_stringP(ontology_uri)) {
                                                    importer = owl_importer2.owl_import_uri_from_file(ontology_uri, filename, options);
                                                } else {
                                                    importer = owl_importer2.owl_import_file(filename, options);
                                                }
                                            } else {
                                                importer = owl_importer2.owl_import_uri(ontology_uri, options);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$19, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    error_string = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != error_string) {
                                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                                    if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                        html_princ($str67$Error_during_import_);
                                        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    html_princ(error_string);
                                }
                            } finally {
                                html_macros.$within_html_pre$.rebind(_prev_bind_0_$18, thread);
                            }
                            html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$14, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0_$13, thread);
            }
            return importer;
        } finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject declare_cb_owl_importer_file() {
        declareFunction(me, "cb_owl_import", "CB-OWL-IMPORT", 0, 1, false);
        declareFunction(me, "cb_owl_import_internal", "CB-OWL-IMPORT-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_owl_perform_import", "CB-OWL-PERFORM-IMPORT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_owl_importer_file() {
        return NIL;
    }

    public static SubLObject setup_cb_owl_importer_file() {
        html_macros.note_cgi_handler_function(CB_OWL_IMPORT, $HTML_HANDLER);
        return NIL;
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






































































    }
}

/**
 * Total time: 498 ms
 */
