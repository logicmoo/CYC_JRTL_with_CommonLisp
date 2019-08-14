/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.owl;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_file_dependencies.$cb_help_definitions$;
import static com.cyc.cycjava.cycl.html_utilities.extract_encoded_form_field_value;
import static com.cyc.cycjava.cycl.html_utilities.get_encoded_form_field_name;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_filename_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_percent_progress_bar;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_refresh;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.list_utilities.proper_list_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.copy_seq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_owl_to_cycl extends SubLTranslatedFile implements V12 {
    // Definitions
    public static final SubLObject cb_owl_import(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ke.cyclist_is_guest()) {
                cyc_navigator_internals.guest_warn($$$OWL_Importer);
            } else {
                {
                    SubLObject title_var = $$$Import_an_OWL_ontology;
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
                            html_complete.html_complete_script();
                            html_complete.html_autocomplete_css();
                            html_complete.html_autocomplete_scripts();
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
                                        html_markup($str_alt6$yui_skin_sam);
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
                                            html_script_utilities.cb_hoverover_page_init();
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
                                                        html_hidden_input($str_alt7$handle_owl_to_cycl_input, T, UNPROVIDED);
                                                        cb_help_preamble($CB_OWL_TO_CYCL, NIL, UNPROVIDED);
                                                        cb_back_button($SELF, $$$Back);
                                                        html_newline(TWO_INTEGER);
                                                        html_reset_input($$$Clear);
                                                        html_indent(TWO_INTEGER);
                                                        html_submit_input($$$Submit, $str_alt12$import_owl_file, UNPROVIDED);
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt13$Enter_the_URI_you_wish_to_use_to_);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        html_text_input(get_encoded_form_field_name($$$uri), string_utilities.$empty_string$.getGlobalValue(), $int$60);
                                                        html_newline(TWO_INTEGER);
                                                        html_princ_strong($str_alt16$Format_for_term_names_in___synony);
                                                        {
                                                            SubLObject name = get_encoded_form_field_name($str_alt17$term_name_format);
                                                            html_newline(UNPROVIDED);
                                                            html_indent(TWO_INTEGER);
                                                            html_radio_input(name, $$$short, T);
                                                            html_indent(UNPROVIDED);
                                                            html_princ($str_alt19$Short__local_names_only_);
                                                            html_newline(UNPROVIDED);
                                                            html_indent(TWO_INTEGER);
                                                            html_radio_input(name, $$$medium, NIL);
                                                            html_indent(UNPROVIDED);
                                                            html_princ($str_alt21$Medium__prefixed_names_);
                                                            html_newline(UNPROVIDED);
                                                            html_indent(TWO_INTEGER);
                                                            html_radio_input(name, $$$long, NIL);
                                                            html_indent(UNPROVIDED);
                                                            html_princ($str_alt23$Long__full_URIs_);
                                                        }
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt24$_Optional__enter_pathname_of_a_fi);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        html_filename_input(get_encoded_form_field_name($$$pathname), $str_alt26$, $int$60);
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        cb_query.html_princ_with_explanation($str_alt27$Enter_a_prefix_for_new_constant_n, $str_alt28$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        html_text_input(get_encoded_form_field_name($$$prefix), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER);
                                                        html_newline(TWO_INTEGER);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_princ($str_alt30$_Optional__Enter_an_existing_Cyc_);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                        html_newline(UNPROVIDED);
                                                        html_indent(FIVE_INTEGER);
                                                        {
                                                            SubLObject encoded_name = get_encoded_form_field_name($$$ontology);
                                                            html_complete.html_complete_button(encoded_name, $$$Complete, $$OWLOntology, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            html_indent(UNPROVIDED);
                                                            html_text_input(encoded_name, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                                                        }
                                                        html_newline(UNPROVIDED);
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
            }
            return NIL;
        }
    }

    static private final SubLString $str_alt26$ = makeString("");

    public static final SubLFile me = new cb_owl_to_cycl();

 public static final String myName = "com.cyc.cycjava.cycl.owl.cb_owl_to_cycl";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $owl_importer_stage_descriptions$ = makeSymbol("*OWL-IMPORTER-STAGE-DESCRIPTIONS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cb_owl_import_refresh_interval$ = makeSymbol("*CB-OWL-IMPORT-REFRESH-INTERVAL*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $CB_OWL_TO_CYCL = makeKeyword("CB-OWL-TO-CYCL");

    static private final SubLString $str1$cb_owl_to_cycl_html = makeString("cb-owl-to-cycl.html");

    static private final SubLString $$$OWL_Importer = makeString("OWL Importer");

    static private final SubLString $$$Import_an_OWL_ontology = makeString("Import an OWL ontology");

    private static final SubLString $str4$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str5$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str10$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str16$handle_owl_to_cycl_input = makeString("handle-owl-to-cycl-input");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLString $str21$import_owl_file = makeString("import-owl-file");

    private static final SubLString $str22$Enter_the_URI_you_wish_to_use_to_ = makeString("Enter the URI you wish to use to identify the ontology:");

    private static final SubLString $$$uri = makeString("uri");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str25$Format_for_term_names_in___synony = makeString("Format for term names in #$synonymousExternalConcept assertions:");

    private static final SubLString $str26$term_name_format = makeString("term-name-format");

    private static final SubLString $$$short = makeString("short");

    private static final SubLString $str28$Short__local_names_only_ = makeString("Short (local names only)");

    private static final SubLString $$$medium = makeString("medium");

    private static final SubLString $str30$Medium__prefixed_names__using_pre = makeString("Medium (prefixed names) using prefix: ");

    private static final SubLString $str31$uri_prefix = makeString("uri-prefix");

    private static final SubLString $$$long = makeString("long");

    private static final SubLString $str33$Long__full_URIs_ = makeString("Long (full URIs)");

    private static final SubLString $str34$_Optional__enter_pathname_of_a_fi = makeString("(Optional) enter pathname of a file to load the ontology from (if not from the URI):");

    private static final SubLString $$$pathname = makeString("pathname");

    private static final SubLString $str36$ = makeString("");

    private static final SubLString $str37$Enter_a_prefix_for_new_constant_n = makeString("Enter a prefix for new constant names:");

    private static final SubLString $str38$Newly_created_constants_for_terms = makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");

    private static final SubLString $str39$constant_prefix = makeString("constant-prefix");

    private static final SubLString $str40$Enter_a_suffix_for_new_constant_n = makeString("Enter a suffix for new constant names:");

    private static final SubLString $str41$Newly_created_constants_for_terms = makeString("Newly created constants for terms in the imported ontology will have names that start with this suffix");

    private static final SubLString $str42$constant_suffix = makeString("constant-suffix");

    private static final SubLString $str43$_Optional__Enter_an_existing_Cyc_ = makeString("(Optional) Enter an existing Cyc term that represents the ontology:");

    private static final SubLString $$$ontology = makeString("ontology");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLObject $const46$owl_Ontology = reader_make_constant_shell("owl:Ontology");

    private static final SubLSymbol CB_OWL_IMPORT_OLD = makeSymbol("CB-OWL-IMPORT-OLD");

    private static final SubLString $str49$Bad_source__ = makeString("Bad source: ");

    private static final SubLString $str50$Can_only_import_OWL_ontologies_fr = makeString("Can only import OWL ontologies from valid files or URLs.");

    private static final SubLString $str51$_does_not_appear_to_be_a_URI_ = makeString(" does not appear to be a URI.");

    private static final SubLString $str52$Enter_a_prefix_for_Medium_format_ = makeString("Enter a prefix for Medium format names");

    private static final SubLList $list53 = list(makeKeyword("URI"), makeKeyword("SOURCE"), makeKeyword("CONSTANT-PREFIX"), makeKeyword("CONSTANT-SUFFIX"), makeKeyword("ONTOLOGY"), makeKeyword("PREFIX-EXTERNAL-NAMES?"), makeKeyword("ABBREVIATE-PREFIXES?"), makeKeyword("URI-PREFIX"));

    private static final SubLSymbol HANDLE_OWL_TO_CYCL_INPUT = makeSymbol("HANDLE-OWL-TO-CYCL-INPUT");

    private static final SubLString $$$Importing_ = makeString("Importing ");

    private static final SubLString $$$OWL_Ontology = makeString("OWL Ontology");

    private static final SubLString $str58$_Display_Importer_Progress_ = makeString("[Display Importer Progress]");

    private static final SubLList $list59 = list(makeString("Processing Class Definitions"), makeString("Processing Property Definitions"), makeString("Processing Instance Definitions"), makeString("Waiting for Enqueued Operations to be Processed"));

    private static final SubLList $list60 = list(makeSymbol("ID-STRING"), makeSymbol("REFRESH-STRING"));

    private static final SubLString $str61$Can_t_interpret__S_as_the_ID_of_a = makeString("Can't interpret ~S as the ID of an exising OWL importer.");

    private static final SubLString $$$T = makeString("T");

    private static final SubLSymbol CB_SHOW_OWL_IMPORTER = makeSymbol("CB-SHOW-OWL-IMPORTER");

    private static final SubLString $str64$Status___A_ = makeString("Status: ~A.");

    private static final SubLString $$$Done = makeString("Done");

    private static final SubLString $$$Working = makeString("Working");

    private static final SubLString $str67$_Total_time___A_ = makeString(" Total time: ~A.");





    private static final SubLString $str71$Term_count___D_ = makeString("Term count: ~D.");

    private static final SubLList $list72 = list(makeSymbol("START-TIME"), makeSymbol("PERCENT-DONE"), makeSymbol("ELAPSED-SECONDS"));

    private static final SubLString $str73$_A_ = makeString("~A:");

    private static final SubLString $str75$Started_at__A__Elapsed_time___A_ = makeString("Started at ~A. Elapsed time: ~A.");

    private static final SubLString $str76$Estimated_finish_time___A__after_ = makeString("Estimated finish time: ~A (after ~A)");

    private static final SubLString $str77$Error_Messages___D__ = makeString("Error Messages (~D):");

    private static final SubLList $list78 = list(makeSymbol("OBJECT"), makeSymbol("MESSAGE"));

    private static final SubLString $str79$_Refresh_ = makeString("[Refresh]");

    private static final SubLString $str80$_Halt_Auto_Refresh_ = makeString("[Halt Auto Refresh]");

    private static final SubLString $str81$_Start_Auto_Refresh_ = makeString("[Start Auto Refresh]");

    private static final SubLString $str82$__Last_refresh___A_ = makeString(" (Last refresh: ~A)");

    private static final SubLString $str84$_OWL_Importer_ = makeString("[OWL Importer ");

    private static final SubLString $str85$_ = makeString("]");

    private static final SubLString $str87$cb_show_owl_importer__D__A = makeString("cb-show-owl-importer&~D&~A");

    private static final SubLSymbol $SHOW_OWL_IMPORTER = makeKeyword("SHOW-OWL-IMPORTER");

    private static final SubLSymbol CB_LINK_SHOW_OWL_IMPORTER = makeSymbol("CB-LINK-SHOW-OWL-IMPORTER");

    public static SubLObject cb_owl_import_old(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($$$OWL_Importer);
        } else {
            final SubLObject title_var = $$$Import_an_OWL_ontology;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str5$_meta_http_equiv__X_UA_Compatible);
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
                        html_markup($str10$yui_skin_sam);
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
                                html_hidden_input($str16$handle_owl_to_cycl_input, T, UNPROVIDED);
                                cb_help_preamble($CB_OWL_TO_CYCL, NIL, UNPROVIDED);
                                cb_back_button($SELF, $$$Back);
                                html_newline(TWO_INTEGER);
                                html_reset_input($$$Clear);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Submit, $str21$import_owl_file, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str22$Enter_the_URI_you_wish_to_use_to_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_text_input(get_encoded_form_field_name($$$uri), string_utilities.$empty_string$.getGlobalValue(), $int$60);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($str25$Format_for_term_names_in___synony);
                                final SubLObject name = get_encoded_form_field_name($str26$term_name_format);
                                html_newline(UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_radio_input(name, $$$short, T, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str28$Short__local_names_only_);
                                html_newline(UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_radio_input(name, $$$medium, NIL, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str30$Medium__prefixed_names__using_pre);
                                html_text_input(get_encoded_form_field_name($str31$uri_prefix), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER);
                                html_newline(UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_radio_input(name, $$$long, NIL, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str33$Long__full_URIs_);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str34$_Optional__enter_pathname_of_a_fi);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_filename_input(get_encoded_form_field_name($$$pathname), $str36$, $int$60);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_query.html_princ_with_explanation($str37$Enter_a_prefix_for_new_constant_n, $str38$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_text_input(get_encoded_form_field_name($str39$constant_prefix), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                cb_query.html_princ_with_explanation($str40$Enter_a_suffix_for_new_constant_n, $str41$Newly_created_constants_for_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                html_text_input(get_encoded_form_field_name($str42$constant_suffix), string_utilities.$empty_string$.getGlobalValue(), TEN_INTEGER);
                                html_newline(TWO_INTEGER);
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str43$_Optional__Enter_an_existing_Cyc_);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_indent(FIVE_INTEGER);
                                final SubLObject encoded_name = get_encoded_form_field_name($$$ontology);
                                html_complete.html_complete_button(encoded_name, $$$Complete, $const46$owl_Ontology, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_text_input(encoded_name, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
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
        }
        return NIL;
    }

    public static final SubLObject handle_owl_to_cycl_input_alt(SubLObject args) {
        {
            SubLObject pathname_field = $$$pathname;
            SubLObject pathname = string_utilities.trim_whitespace(extract_encoded_form_field_value(pathname_field, args));
            SubLObject uri = extract_encoded_form_field_value($$$uri, args);
            SubLObject source = (NIL != string_utilities.non_empty_string_p(pathname)) ? ((SubLObject) (pathname)) : uri;
            SubLObject prefix = extract_encoded_form_field_value($$$prefix, args);
            SubLObject ontology_name = extract_encoded_form_field_value($$$ontology, args);
            SubLObject ontology = (NIL != string_utilities.non_empty_string_p(ontology_name)) ? ((SubLObject) (cb_guess_fort(ontology_name, UNPROVIDED))) : NIL;
            SubLObject contextualize_name = extract_encoded_form_field_value($str_alt17$term_name_format, args);
            SubLObject contextualizeP = makeBoolean(!contextualize_name.equal($$$short));
            SubLObject use_namespaceP = equal(contextualize_name, $$$medium);
            SubLObject error_message = NIL;
            if (!((NIL != web_utilities.url_p(source)) || ((NIL != string_utilities.non_empty_string_p(source)) && (NIL != file_utilities.file_existsP(source))))) {
                error_message = cconcatenate($str_alt35$Bad_source__, new SubLObject[]{ format_nil.format_nil_s_no_copy(source), format_nil.$format_nil_percent$.getGlobalValue(), $str_alt36$Can_only_import_OWL_ontologies_fr });
            } else {
                if (NIL == string_utilities.non_empty_string_p(uri)) {
                    error_message = cconcatenate(format_nil.format_nil_s_no_copy(uri), $str_alt37$_does_not_appear_to_be_a_URI_);
                }
            }
            if (NIL != error_message) {
                cb_error(error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.cb_start_owl_import(uri, source, prefix, ontology, contextualizeP, use_namespaceP);
            }
        }
        return NIL;
    }

    public static SubLObject handle_owl_to_cycl_input(final SubLObject args) {
        final SubLObject pathname_field = $$$pathname;
        final SubLObject pathname = string_utilities.trim_whitespace(extract_encoded_form_field_value(pathname_field, args));
        final SubLObject uri = extract_encoded_form_field_value($$$uri, args);
        final SubLObject source = (NIL != string_utilities.non_empty_string_p(pathname)) ? pathname : uri;
        final SubLObject constant_prefix = extract_encoded_form_field_value($str39$constant_prefix, args);
        final SubLObject constant_suffix = extract_encoded_form_field_value($str42$constant_suffix, args);
        final SubLObject ontology_name = extract_encoded_form_field_value($$$ontology, args);
        final SubLObject ontology = (NIL != string_utilities.non_empty_string_p(ontology_name)) ? cb_guess_fort(ontology_name, UNPROVIDED) : NIL;
        final SubLObject term_name_format = extract_encoded_form_field_value($str26$term_name_format, args);
        final SubLObject prefix_external_namesP = makeBoolean(!term_name_format.equal($$$short));
        final SubLObject abbreviate_prefixesP = equal(term_name_format, $$$medium);
        final SubLObject uri_prefix = extract_encoded_form_field_value($str31$uri_prefix, args);
        SubLObject error_message = NIL;
        if ((NIL == web_utilities.url_p(source)) && ((NIL == string_utilities.non_empty_string_p(source)) || (NIL == file_utilities.file_existsP(source)))) {
            error_message = cconcatenate($str49$Bad_source__, new SubLObject[]{ format_nil.format_nil_s_no_copy(source), format_nil.$format_nil_percent$.getGlobalValue(), $str50$Can_only_import_OWL_ontologies_fr });
        } else
            if (NIL == string_utilities.non_empty_string_p(uri)) {
                error_message = cconcatenate(format_nil.format_nil_s_no_copy(uri), $str51$_does_not_appear_to_be_a_URI_);
            } else
                if ((NIL != abbreviate_prefixesP) && (NIL != string_utilities.empty_string_p(uri_prefix))) {
                    error_message = copy_seq($str52$Enter_a_prefix_for_Medium_format_);
                }


        if (NIL != error_message) {
            cb_error(error_message, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            cb_start_owl_import(list_utilities.make_plist($list53, list(uri, source, constant_prefix, constant_suffix, ontology, prefix_external_namesP, abbreviate_prefixesP, uri_prefix)));
        }
        return NIL;
    }

    public static final SubLObject cb_start_owl_import(SubLObject uri, SubLObject source, SubLObject prefix, SubLObject ontology, SubLObject contextualizeP, SubLObject use_namespaceP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject importer_id = owl_to_cycl.import_owl_ontology_with_importer(uri, prefix, source, ontology, contextualizeP, use_namespaceP, UNPROVIDED, UNPROVIDED);
                SubLObject title_var = NIL;
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
                            SubLObject _prev_bind_0_4 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                                    html_markup($str_alt6$yui_skin_sam);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        html_princ($str_alt39$Importing_);
                                        if (NIL != ontology) {
                                            cb_form(ontology, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            html_princ($$$OWL_Ontology);
                                        }
                                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                        html_markup(TWO_INTEGER);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.cb_link_show_owl_importer(importer_id, $str_alt41$_Display_Importer_Progress_, T);
                                        html_source_readability_terpri(UNPROVIDED);
                                        html_copyright_notice();
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_4, thread);
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

    public static SubLObject cb_start_owl_import(final SubLObject import_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ontology = getf(import_info, $ONTOLOGY, UNPROVIDED);
        final SubLObject importer_id = owl_to_cycl.import_owl_ontology_with_importer_from_info(import_info);
        final SubLObject title_var = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str5$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str10$yui_skin_sam);
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
                        html_markup(html_macros.$html_heading_head$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        html_princ($$$Importing_);
                        if (NIL != ontology) {
                            cb_form(ontology, UNPROVIDED, UNPROVIDED);
                        } else {
                            html_princ($$$OWL_Ontology);
                        }
                        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                        html_markup(TWO_INTEGER);
                        html_char(CHAR_greater, UNPROVIDED);
                        cb_link_show_owl_importer(importer_id, $str58$_Display_Importer_Progress_, T);
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

    public static final SubLObject cb_show_owl_importer_alt(SubLObject args) {
        {
            SubLObject datum = args;
            SubLObject current = datum;
            SubLObject id_string = NIL;
            SubLObject refresh_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            id_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt43);
            refresh_string = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject id = string_utilities.string_to_integer(id_string);
                    if (NIL == owl_to_cycl.owl_importer_exists_p(id)) {
                        cb_error($str_alt44$Can_t_interpret__S_as_the_ID_of_a, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.cb_show_owl_importer_internal(id, equalp(refresh_string, $$$T));
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt43);
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_owl_importer(final SubLObject args) {
        SubLObject id_string = NIL;
        SubLObject refresh_string = NIL;
        destructuring_bind_must_consp(args, args, $list60);
        id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list60);
        refresh_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject id = string_utilities.string_to_integer(id_string);
            if (NIL == owl_to_cycl.owl_importer_exists_p(id)) {
                cb_error($str61$Can_t_interpret__S_as_the_ID_of_a, id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_show_owl_importer_internal(id, equalp(refresh_string, $$$T));
            }
        } else {
            cdestructuring_bind_error(args, $list60);
        }
        return NIL;
    }

    public static final SubLObject cb_show_owl_importer_internal_alt(SubLObject id, SubLObject refreshP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doneP = owl_to_cycl.owl_importer_done_p(id);
                SubLObject progress = owl_to_cycl.get_owl_importer_progress(id);
                SubLObject error_info = owl_to_cycl.get_owl_importer_error_info(id);
                SubLObject ontology = narts_high.nart_substitute(owl_to_cycl.get_owl_importer_ontology(id));
                SubLObject total_time = com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.owl_importer_time_so_far(id);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ($$$OWL_Importer);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                html_refresh((NIL != refreshP) && (NIL == doneP) ? ((SubLObject) ($cb_owl_import_refresh_interval$.getDynamicValue(thread))) : NIL);
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                if (NIL == doneP) {
                                    html_princ($str_alt39$Importing_);
                                }
                                if (NIL != ontology) {
                                    cb_form(ontology, UNPROVIDED, UNPROVIDED);
                                } else {
                                    html_princ($$$OWL_Ontology);
                                }
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt47$Status___A_, NIL != doneP ? ((SubLObject) ($$$Done)) : $$$Working);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt50$_Total_time___A_, numeric_date_utilities.readable_elapsed_time_string(total_time, ZERO_INTEGER));
                                if (NIL != indexed_term_p(ontology)) {
                                    {
                                        SubLObject _prev_bind_0_7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                            {
                                                SubLObject term_count = length(kb_mapping.gather_gaf_arg_index(ontology, TWO_INTEGER, $$synonymousExternalConcept, UNPROVIDED, UNPROVIDED));
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt54$Term_count___D_, term_count);
                                            }
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_7, thread);
                                        }
                                    }
                                }
                                html_newline(TWO_INTEGER);
                                if (NIL != number_utilities.positive_number_p(total_time)) {
                                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                                    html_markup(html_macros.$html_span_style$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            {
                                                SubLObject list_var = NIL;
                                                SubLObject item = NIL;
                                                SubLObject item_num = NIL;
                                                for (list_var = reverse(progress), item = list_var.first(), item_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , item_num = add(ONE_INTEGER, item_num)) {
                                                    if (NIL != proper_list_p(item)) {
                                                        {
                                                            SubLObject datum = item;
                                                            SubLObject current = datum;
                                                            SubLObject start_time = NIL;
                                                            SubLObject percent_done = NIL;
                                                            SubLObject elapsed_seconds = NIL;
                                                            destructuring_bind_must_consp(current, datum, $list_alt55);
                                                            start_time = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt55);
                                                            percent_done = current.first();
                                                            current = current.rest();
                                                            destructuring_bind_must_consp(current, datum, $list_alt55);
                                                            elapsed_seconds = current.first();
                                                            current = current.rest();
                                                            if (NIL == current) {
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt56$_A_, nth(item_num, $owl_importer_stage_descriptions$.getGlobalValue()));
                                                                html_newline(UNPROVIDED);
                                                                html_percent_progress_bar(truncate(multiply($int$100, percent_done), UNPROVIDED), $int$100, number_utilities.integer_percent(elapsed_seconds, total_time, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt58$Started_at__A__Elapsed_time___A_, numeric_date_utilities.timestring(start_time), numeric_date_utilities.readable_elapsed_time_string(elapsed_seconds, ZERO_INTEGER));
                                                                if (percent_done.isPositive()) {
                                                                    {
                                                                        SubLObject projected_total_time = truncate(divide(elapsed_seconds, percent_done), UNPROVIDED);
                                                                        if (!subtract(projected_total_time, elapsed_seconds).numLE($cb_owl_import_refresh_interval$.getDynamicValue(thread))) {
                                                                            html_newline(UNPROVIDED);
                                                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt59$Estimated_finish_time___A__after_, numeric_date_utilities.timestring(add(start_time, projected_total_time)), numeric_date_utilities.readable_elapsed_time_string(projected_total_time, ZERO_INTEGER));
                                                                        }
                                                                    }
                                                                }
                                                                html_newline(TWO_INTEGER);
                                                            } else {
                                                                cdestructuring_bind_error(datum, $list_alt55);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                }
                                html_newline(UNPROVIDED);
                                if (NIL != error_info) {
                                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                                    html_markup(html_macros.$html_span_style$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_style_font_size_larger$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    {
                                        SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt60$Error_Messages___D__, length(error_info));
                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
                                        }
                                    }
                                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    {
                                        SubLObject cdolist_list_var = error_info;
                                        SubLObject item = NIL;
                                        for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                            {
                                                SubLObject datum = item;
                                                SubLObject current = datum;
                                                SubLObject v_object = NIL;
                                                SubLObject message = NIL;
                                                destructuring_bind_must_consp(current, datum, $list_alt61);
                                                v_object = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list_alt61);
                                                message = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    cb_form(v_object, ZERO_INTEGER, T);
                                                    html_newline(UNPROVIDED);
                                                    html_princ(message);
                                                    html_hr(UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    cdestructuring_bind_error(datum, $list_alt61);
                                                }
                                            }
                                        }
                                    }
                                    html_newline(UNPROVIDED);
                                }
                                if (NIL != doneP) {
                                    com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.cb_link_show_owl_importer(id, $str_alt62$_Refresh_, NIL);
                                } else {
                                    if (NIL != refreshP) {
                                        com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.cb_link_show_owl_importer(id, $str_alt63$_Halt_Auto_Refresh_, NIL);
                                    } else {
                                        com.cyc.cycjava.cycl.owl.cb_owl_to_cycl.cb_link_show_owl_importer(id, $str_alt64$_Start_Auto_Refresh_, T);
                                    }
                                }
                                html_markup(html_macros.$html_span_head$.getGlobalValue());
                                html_markup(html_macros.$html_span_style$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt65$__Last_refresh___A_, numeric_date_utilities.timestring(UNPROVIDED));
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
                                    }
                                }
                                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
                            }
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject cb_show_owl_importer_internal(final SubLObject id, final SubLObject refreshP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = owl_to_cycl.owl_importer_done_p(id);
        final SubLObject progress = owl_to_cycl.get_owl_importer_progress(id);
        final SubLObject error_info = owl_to_cycl.get_owl_importer_error_info(id);
        final SubLObject ontology = narts_high.nart_substitute(owl_to_cycl.get_owl_importer_ontology(id));
        final SubLObject total_time = owl_importer_time_so_far(id);
        html_markup($str4$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str5$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            html_princ($$$OWL_Importer);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            html_refresh((NIL != refreshP) && (NIL == doneP) ? $cb_owl_import_refresh_interval$.getDynamicValue(thread) : NIL, UNPROVIDED);
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$10 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    if (NIL == doneP) {
                        html_princ($$$Importing_);
                    }
                    if (NIL != ontology) {
                        cb_form(ontology, UNPROVIDED, UNPROVIDED);
                    } else {
                        html_princ($$$OWL_Ontology);
                    }
                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_greater, UNPROVIDED);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str64$Status___A_, NIL != doneP ? $$$Done : $$$Working);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str67$_Total_time___A_, numeric_date_utilities.readable_elapsed_time_string(total_time, ZERO_INTEGER));
                    if (NIL != indexed_term_p(ontology)) {
                        final SubLObject _prev_bind_0_$12 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            final SubLObject term_count = length(kb_mapping.gather_gaf_arg_index(ontology, TWO_INTEGER, $$synonymousExternalConcept, UNPROVIDED, UNPROVIDED));
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str71$Term_count___D_, term_count);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                    html_newline(TWO_INTEGER);
                    if (NIL != number_utilities.positive_number_p(total_time)) {
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject list_var = NIL;
                            SubLObject item = NIL;
                            SubLObject item_num = NIL;
                            list_var = reverse(progress);
                            item = list_var.first();
                            for (item_num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , item_num = add(ONE_INTEGER, item_num)) {
                                if (NIL != list_utilities.proper_list_p(item)) {
                                    SubLObject current;
                                    final SubLObject datum = current = item;
                                    SubLObject start_time = NIL;
                                    SubLObject percent_done = NIL;
                                    SubLObject elapsed_seconds = NIL;
                                    destructuring_bind_must_consp(current, datum, $list72);
                                    start_time = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list72);
                                    percent_done = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list72);
                                    elapsed_seconds = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str73$_A_, nth(item_num, $owl_importer_stage_descriptions$.getGlobalValue()));
                                        html_newline(UNPROVIDED);
                                        html_percent_progress_bar(truncate(multiply($int$100, percent_done), UNPROVIDED), $int$100, number_utilities.integer_percent(elapsed_seconds, total_time, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str75$Started_at__A__Elapsed_time___A_, numeric_date_utilities.timestring(start_time), numeric_date_utilities.readable_elapsed_time_string(elapsed_seconds, ZERO_INTEGER));
                                        if (percent_done.isPositive()) {
                                            final SubLObject projected_total_time = truncate(divide(elapsed_seconds, percent_done), UNPROVIDED);
                                            if (!subtract(projected_total_time, elapsed_seconds).numLE($cb_owl_import_refresh_interval$.getDynamicValue(thread))) {
                                                html_newline(UNPROVIDED);
                                                format(html_macros.$html_stream$.getDynamicValue(thread), $str76$Estimated_finish_time___A__after_, numeric_date_utilities.timestring(add(start_time, projected_total_time)), numeric_date_utilities.readable_elapsed_time_string(projected_total_time, ZERO_INTEGER));
                                            }
                                        }
                                        html_newline(TWO_INTEGER);
                                    } else {
                                        cdestructuring_bind_error(datum, $list72);
                                    }
                                }
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    }
                    html_newline(UNPROVIDED);
                    if (NIL != error_info) {
                        html_markup(html_macros.$html_span_head$.getGlobalValue());
                        html_markup(html_macros.$html_span_style$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_style_font_size_larger$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            format(html_macros.$html_stream$.getDynamicValue(thread), $str77$Error_Messages___D__, length(error_info));
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                        }
                        html_markup(html_macros.$html_span_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        SubLObject cdolist_list_var = error_info;
                        SubLObject item2 = NIL;
                        item2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject current2;
                            final SubLObject datum2 = current2 = item2;
                            SubLObject v_object = NIL;
                            SubLObject message = NIL;
                            destructuring_bind_must_consp(current2, datum2, $list78);
                            v_object = current2.first();
                            current2 = current2.rest();
                            destructuring_bind_must_consp(current2, datum2, $list78);
                            message = current2.first();
                            current2 = current2.rest();
                            if (NIL == current2) {
                                cb_form(v_object, ZERO_INTEGER, T);
                                html_newline(UNPROVIDED);
                                html_princ(message);
                                html_hr(UNPROVIDED, UNPROVIDED);
                            } else {
                                cdestructuring_bind_error(datum2, $list78);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            item2 = cdolist_list_var.first();
                        } 
                        html_newline(UNPROVIDED);
                    }
                    if (NIL != doneP) {
                        cb_link_show_owl_importer(id, $str79$_Refresh_, NIL);
                    } else
                        if (NIL != refreshP) {
                            cb_link_show_owl_importer(id, $str80$_Halt_Auto_Refresh_, NIL);
                        } else {
                            cb_link_show_owl_importer(id, $str81$_Start_Auto_Refresh_, T);
                        }

                    html_markup(html_macros.$html_span_head$.getGlobalValue());
                    html_markup(html_macros.$html_span_style$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_style_font_size_smaller$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str82$__Last_refresh___A_, numeric_date_utilities.timestring(UNPROVIDED));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                    }
                    html_markup(html_macros.$html_span_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$10, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    static private final SubLString $str_alt1$cb_owl_to_cycl_html = makeString("cb-owl-to-cycl.html");

    public static final SubLObject owl_importer_time_so_far_alt(SubLObject id) {
        {
            SubLObject doneP = owl_to_cycl.owl_importer_done_p(id);
            SubLObject progress = owl_to_cycl.get_owl_importer_progress(id);
            SubLObject total_time = ZERO_INTEGER;
            if (NIL != progress) {
                {
                    SubLObject cdolist_list_var = (NIL != doneP) ? ((SubLObject) (progress.rest())) : progress;
                    SubLObject item = NIL;
                    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                        total_time = add(total_time, third(item));
                    }
                }
            }
            return total_time;
        }
    }

    public static SubLObject owl_importer_time_so_far(final SubLObject id) {
        final SubLObject doneP = owl_to_cycl.owl_importer_done_p(id);
        final SubLObject progress = owl_to_cycl.get_owl_importer_progress(id);
        SubLObject total_time = ZERO_INTEGER;
        if (NIL != progress) {
            SubLObject cdolist_list_var = (NIL != doneP) ? progress.rest() : progress;
            SubLObject item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                total_time = add(total_time, third(item));
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
        }
        return total_time;
    }

    static private final SubLString $str_alt5$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt6$yui_skin_sam = makeString("yui-skin-sam");

    static private final SubLString $str_alt7$handle_owl_to_cycl_input = makeString("handle-owl-to-cycl-input");

    static private final SubLString $str_alt12$import_owl_file = makeString("import-owl-file");

    static private final SubLString $str_alt13$Enter_the_URI_you_wish_to_use_to_ = makeString("Enter the URI you wish to use to identify the ontology:");

    public static final SubLObject cb_link_show_owl_importer_alt(SubLObject id, SubLObject linktext, SubLObject auto_refreshP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (auto_refreshP == UNPROVIDED) {
            auto_refreshP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(id, NON_NEGATIVE_INTEGER_P);
            if (NIL == linktext) {
                linktext = cconcatenate($str_alt67$_OWL_Importer_, new SubLObject[]{ format_nil.format_nil_d_no_copy(id), $str_alt68$_ });
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt70$cb_show_owl_importer__D__A, id, auto_refreshP);
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
            return id;
        }
    }

    public static SubLObject cb_link_show_owl_importer(final SubLObject id, SubLObject linktext, SubLObject auto_refreshP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (auto_refreshP == UNPROVIDED) {
            auto_refreshP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(id) : "! subl_promotions.non_negative_integer_p(id) " + ("subl_promotions.non_negative_integer_p(id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(id) ") + id;
        if (NIL == linktext) {
            linktext = cconcatenate($str84$_OWL_Importer_, new SubLObject[]{ format_nil.format_nil_d_no_copy(id), $str85$_ });
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str87$cb_show_owl_importer__D__A, id, auto_refreshP);
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
        return id;
    }

    static private final SubLString $str_alt16$Format_for_term_names_in___synony = makeString("Format for term names in #$synonymousExternalConcept assertions:");

    static private final SubLString $str_alt17$term_name_format = makeString("term-name-format");

    static private final SubLString $str_alt19$Short__local_names_only_ = makeString("Short (local names only)");

    static private final SubLString $str_alt21$Medium__prefixed_names_ = makeString("Medium (prefixed names)");

    static private final SubLString $str_alt23$Long__full_URIs_ = makeString("Long (full URIs)");

    static private final SubLString $str_alt24$_Optional__enter_pathname_of_a_fi = makeString("(Optional) enter pathname of a file to load the ontology from (if not from the URI):");

    static private final SubLString $str_alt27$Enter_a_prefix_for_new_constant_n = makeString("Enter a prefix for new constant names:");

    static private final SubLString $str_alt28$Newly_created_constants_for_terms = makeString("Newly created constants for terms in the imported ontology will have names that start with this prefix.");

    static private final SubLString $$$prefix = makeString("prefix");

    static private final SubLString $str_alt30$_Optional__Enter_an_existing_Cyc_ = makeString("(Optional) Enter an existing Cyc term that represents the ontology:");

    public static final SubLObject declare_cb_owl_to_cycl_file_alt() {
        declareFunction("cb_owl_import", "CB-OWL-IMPORT", 0, 1, false);
        declareFunction("handle_owl_to_cycl_input", "HANDLE-OWL-TO-CYCL-INPUT", 1, 0, false);
        declareFunction("cb_start_owl_import", "CB-START-OWL-IMPORT", 6, 0, false);
        declareFunction("cb_show_owl_importer", "CB-SHOW-OWL-IMPORTER", 1, 0, false);
        declareFunction("cb_show_owl_importer_internal", "CB-SHOW-OWL-IMPORTER-INTERNAL", 2, 0, false);
        declareFunction("owl_importer_time_so_far", "OWL-IMPORTER-TIME-SO-FAR", 1, 0, false);
        declareFunction("cb_link_show_owl_importer", "CB-LINK-SHOW-OWL-IMPORTER", 1, 2, false);
        return NIL;
    }

    public static SubLObject declare_cb_owl_to_cycl_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("cb_owl_import_old", "CB-OWL-IMPORT-OLD", 0, 1, false);
            declareFunction("handle_owl_to_cycl_input", "HANDLE-OWL-TO-CYCL-INPUT", 1, 0, false);
            declareFunction("cb_start_owl_import", "CB-START-OWL-IMPORT", 1, 0, false);
            declareFunction("cb_show_owl_importer", "CB-SHOW-OWL-IMPORTER", 1, 0, false);
            declareFunction("cb_show_owl_importer_internal", "CB-SHOW-OWL-IMPORTER-INTERNAL", 2, 0, false);
            declareFunction("owl_importer_time_so_far", "OWL-IMPORTER-TIME-SO-FAR", 1, 0, false);
            declareFunction("cb_link_show_owl_importer", "CB-LINK-SHOW-OWL-IMPORTER", 1, 2, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_owl_import", "CB-OWL-IMPORT", 0, 1, false);
            declareFunction("cb_start_owl_import", "CB-START-OWL-IMPORT", 6, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_owl_to_cycl_file_Previous() {
        declareFunction("cb_owl_import_old", "CB-OWL-IMPORT-OLD", 0, 1, false);
        declareFunction("handle_owl_to_cycl_input", "HANDLE-OWL-TO-CYCL-INPUT", 1, 0, false);
        declareFunction("cb_start_owl_import", "CB-START-OWL-IMPORT", 1, 0, false);
        declareFunction("cb_show_owl_importer", "CB-SHOW-OWL-IMPORTER", 1, 0, false);
        declareFunction("cb_show_owl_importer_internal", "CB-SHOW-OWL-IMPORTER-INTERNAL", 2, 0, false);
        declareFunction("owl_importer_time_so_far", "OWL-IMPORTER-TIME-SO-FAR", 1, 0, false);
        declareFunction("cb_link_show_owl_importer", "CB-LINK-SHOW-OWL-IMPORTER", 1, 2, false);
        return NIL;
    }



    private static final SubLSymbol CB_OWL_IMPORT = makeSymbol("CB-OWL-IMPORT");

    static private final SubLString $str_alt35$Bad_source__ = makeString("Bad source: ");

    static private final SubLString $str_alt36$Can_only_import_OWL_ontologies_fr = makeString("Can only import OWL ontologies from valid files or URLs.");

    static private final SubLString $str_alt37$_does_not_appear_to_be_a_URI_ = makeString(" does not appear to be a URI.");

    public static final SubLObject init_cb_owl_to_cycl_file_alt() {
        deflexical("*OWL-IMPORTER-STAGE-DESCRIPTIONS*", $list_alt42);
        defparameter("*CB-OWL-IMPORT-REFRESH-INTERVAL*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject init_cb_owl_to_cycl_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*OWL-IMPORTER-STAGE-DESCRIPTIONS*", $list59);
            defparameter("*CB-OWL-IMPORT-REFRESH-INTERVAL*", TWO_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*OWL-IMPORTER-STAGE-DESCRIPTIONS*", $list_alt42);
        }
        return NIL;
    }

    public static SubLObject init_cb_owl_to_cycl_file_Previous() {
        deflexical("*OWL-IMPORTER-STAGE-DESCRIPTIONS*", $list59);
        defparameter("*CB-OWL-IMPORT-REFRESH-INTERVAL*", TWO_INTEGER);
        return NIL;
    }

    static private final SubLString $str_alt39$Importing_ = makeString("Importing ");

    public static final SubLObject setup_cb_owl_to_cycl_file_alt() {
        sethash($CB_OWL_TO_CYCL, $cb_help_definitions$.getGlobalValue(), list($str_alt1$cb_owl_to_cycl_html, NIL));
        html_macros.note_html_handler_function(CB_OWL_IMPORT);
        html_macros.note_html_handler_function(HANDLE_OWL_TO_CYCL_INPUT);
        html_macros.note_html_handler_function(CB_SHOW_OWL_IMPORTER);
        setup_cb_link_method($SHOW_OWL_IMPORTER, CB_LINK_SHOW_OWL_IMPORTER, THREE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_owl_to_cycl_file() {
        if (SubLFiles.USE_V1) {
            sethash($CB_OWL_TO_CYCL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_owl_to_cycl_html, NIL));
            html_macros.note_cgi_handler_function(CB_OWL_IMPORT_OLD, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(HANDLE_OWL_TO_CYCL_INPUT, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(CB_SHOW_OWL_IMPORTER, $HTML_HANDLER);
            setup_cb_link_method($SHOW_OWL_IMPORTER, CB_LINK_SHOW_OWL_IMPORTER, THREE_INTEGER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(CB_OWL_IMPORT);
            html_macros.note_html_handler_function(HANDLE_OWL_TO_CYCL_INPUT);
            html_macros.note_html_handler_function(CB_SHOW_OWL_IMPORTER);
        }
        return NIL;
    }

    public static SubLObject setup_cb_owl_to_cycl_file_Previous() {
        sethash($CB_OWL_TO_CYCL, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str1$cb_owl_to_cycl_html, NIL));
        html_macros.note_cgi_handler_function(CB_OWL_IMPORT_OLD, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_OWL_TO_CYCL_INPUT, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_SHOW_OWL_IMPORTER, $HTML_HANDLER);
        setup_cb_link_method($SHOW_OWL_IMPORTER, CB_LINK_SHOW_OWL_IMPORTER, THREE_INTEGER);
        return NIL;
    }

    static private final SubLString $str_alt41$_Display_Importer_Progress_ = makeString("[Display Importer Progress]");

    static private final SubLList $list_alt42 = list(makeString("Processing Class Definitions"), makeString("Processing Property Definitions"), makeString("Processing Instance Definitions"), makeString("Waiting for Enqueued Operations to be Processed"));

    static private final SubLList $list_alt43 = list(makeSymbol("ID-STRING"), makeSymbol("REFRESH-STRING"));

    @Override
    public void declareFunctions() {
        declare_cb_owl_to_cycl_file();
    }

    static private final SubLString $str_alt44$Can_t_interpret__S_as_the_ID_of_a = makeString("Can't interpret ~S as the ID of an existing OWL importer.");

    @Override
    public void initializeVariables() {
        init_cb_owl_to_cycl_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_owl_to_cycl_file();
    }

    static {
    }

    static private final SubLString $str_alt47$Status___A_ = makeString("Status: ~A.");

    static private final SubLString $str_alt50$_Total_time___A_ = makeString(" Total time: ~A.");

    static private final SubLString $str_alt54$Term_count___D_ = makeString("Term count: ~D.");

    static private final SubLList $list_alt55 = list(makeSymbol("START-TIME"), makeSymbol("PERCENT-DONE"), makeSymbol("ELAPSED-SECONDS"));

    static private final SubLString $str_alt56$_A_ = makeString("~A:");

    static private final SubLString $str_alt58$Started_at__A__Elapsed_time___A_ = makeString("Started at ~A. Elapsed time: ~A.");

    static private final SubLString $str_alt59$Estimated_finish_time___A__after_ = makeString("Estimated finish time: ~A (after ~A)");

    static private final SubLString $str_alt60$Error_Messages___D__ = makeString("Error Messages (~D):");

    static private final SubLList $list_alt61 = list(makeSymbol("OBJECT"), makeSymbol("MESSAGE"));

    static private final SubLString $str_alt62$_Refresh_ = makeString("[Refresh]");

    static private final SubLString $str_alt63$_Halt_Auto_Refresh_ = makeString("[Halt Auto Refresh]");

    static private final SubLString $str_alt64$_Start_Auto_Refresh_ = makeString("[Start Auto Refresh]");

    static private final SubLString $str_alt65$__Last_refresh___A_ = makeString(" (Last refresh: ~A)");

    static private final SubLString $str_alt67$_OWL_Importer_ = makeString("[OWL Importer ");

    static private final SubLString $str_alt68$_ = makeString("]");

    static private final SubLString $str_alt70$cb_show_owl_importer__D__A = makeString("cb-show-owl-importer&~D&~A");
}

/**
 * Total time: 347 ms
 */
