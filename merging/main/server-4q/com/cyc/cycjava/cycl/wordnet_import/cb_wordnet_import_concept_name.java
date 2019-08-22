/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-WORDNET-IMPORT-CONCEPT-NAME
 * source file: /cyc/top/cycl/wordnet-import/cb-wordnet-import-concept-name.lisp
 * created:     2019/07/03 17:38:13
 */
public final class cb_wordnet_import_concept_name extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt33$ = makeString("");

    public static final SubLFile me = new cb_wordnet_import_concept_name();

 public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name";


    // defparameter
    // The default width for text inputs intended to contain constant names.
    /**
     * The default width for text inputs intended to contain constant names.
     */
    @LispMethod(comment = "The default width for text inputs intended to contain constant names.\ndefparameter")
    public static final SubLSymbol $wni_name_input_width$ = makeSymbol("*WNI-NAME-INPUT-WIDTH*");

    static private final SubLString $str1$WordNet_Import___Name = makeString("WordNet Import - Name");

    private static final SubLSymbol WNI_CONCEPT_NAME = makeSymbol("WNI-CONCEPT-NAME");

    private static final SubLString $str4$synset_id = makeString("synset-id");

    private static final SubLString $str5$genl_terms = makeString("genl-terms");

    private static final SubLString $str6$auto_suffix = makeString("auto-suffix");

    private static final SubLString $$$name = makeString("name");

    private static final SubLString $str8$workflow_alist = makeString("workflow-alist");

    private static final SubLSymbol WNI_CONCEPT_NAME_INPUT = makeSymbol("WNI-CONCEPT-NAME-INPUT");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $$$Is_this_a_good_name_for_the_ = makeString("Is this a good name for the ");

    private static final SubLString $$$_Synonym_Set__ = makeString(" Synonym Set  ");

    private static final SubLString $str17$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str18$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");

    private static final SubLString $str23$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str29$wni_concept_name_input = makeString("wni-concept-name-input");

    private static final SubLString $str30$_S = makeString("~S");

    private static final SubLString $str33$Verify_This_Name___ = makeString("Verify This Name:  ");

    private static final SubLString $$$Auto_Suffix = makeString("Auto Suffix");

    private static final SubLString $$$Next = makeString("Next");

    private static final SubLString $$$next = makeString("next");

    private static final SubLSymbol $CB_WORDNET_IMPORT_CONCEPT_NAME = makeKeyword("CB-WORDNET-IMPORT-CONCEPT-NAME");

    private static final SubLString $str39$_ = makeString("-");

    private static final SubLString $$$Something = makeString("Something");

    private static final SubLString $$$Someone = makeString("Someone");



    private static final SubLString $str43$ = makeString("");

    private static final SubLObject $$WNVerbFrame_8 = reader_make_constant_shell("WNVerbFrame-8");

    private static final SubLString $$$_Something = makeString(" Something");

    private static final SubLObject $$WNVerbFrame_2 = reader_make_constant_shell("WNVerbFrame-2");

    private static final SubLObject $$WNVerbFrame_1 = reader_make_constant_shell("WNVerbFrame-1");

    private static final SubLObject $$WNVerbFrame_9 = reader_make_constant_shell("WNVerbFrame-9");

    private static final SubLString $$$_Someone = makeString(" Someone");

    private static final SubLObject $$WNVerbFrame_11 = reader_make_constant_shell("WNVerbFrame-11");

    private static final SubLObject $$WNVerbFrame_22 = reader_make_constant_shell("WNVerbFrame-22");

    private static final SubLObject $$WNVerbFrame_4 = reader_make_constant_shell("WNVerbFrame-4");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str55$_make_me_unique_ = makeString("<make-me-unique>");

    // Definitions
    /**
     * Retrieves data and formats the page for naming the imported WordNet synset.
     *
     * @param args;
     * 		listp, the first element is the synset and the second is the list of genl terms.
     * @return nil
     */
    @LispMethod(comment = "Retrieves data and formats the page for naming the imported WordNet synset.\r\n\r\n@param args;\r\n\t\tlistp, the first element is the synset and the second is the list of genl terms.\r\n@return nil")
    public static final SubLObject wni_concept_name_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str_alt1$WordNet_Import___Name);
        } else {
            {
                SubLObject synset = args.first();
                SubLObject genl_terms = second(args);
                SubLObject workflow_alist = third(args);
                com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_concept_name_internal(synset, genl_terms, workflow_alist, NIL);
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Retrieves data and formats the page for naming the imported WordNet synset.
     *
     * @param args;
     * 		listp, the first element is the synset and the second is the list of genl terms.
     * @return nil
     */
    @LispMethod(comment = "Retrieves data and formats the page for naming the imported WordNet synset.\r\n\r\n@param args;\r\n\t\tlistp, the first element is the synset and the second is the list of genl terms.\r\n@return nil")
    public static SubLObject wni_concept_name(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str1$WordNet_Import___Name);
        } else {
            final SubLObject synset = args.first();
            final SubLObject genl_terms = second(args);
            final SubLObject workflow_alist = third(args);
            wni_concept_name_internal(synset, genl_terms, workflow_alist, NIL);
        }
        return NIL;
    }

    /**
     * Handles user input from the web page that names an imported WordNet synset.
     * The input consists an input field with the name and button selections for Back and Next.
     *
     * @param args;
     * 		name field and the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user input from the web page that names an imported WordNet synset.\r\nThe input consists an input field with the name and button selections for Back and Next.\r\n\r\n@param args;\r\n\t\tname field and the button selected\r\n@return nil\nHandles user input from the web page that names an imported WordNet synset.\nThe input consists an input field with the name and button selections for Back and Next.")
    public static final SubLObject wni_concept_name_input_alt(SubLObject args) {
        SubLTrampolineFile.checkType(args, LISTP);
        {
            SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str_alt3$synset_id, args));
            SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str_alt4$genl_terms, args));
            SubLObject auto_suffixP = list_utilities.sublisp_boolean(html_extract_input($str_alt5$auto_suffix, args));
            SubLObject name = html_extract_input($$$name, args);
            SubLObject workflow_alist = read_from_string(html_extract_input($str_alt7$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != auto_suffixP) {
                com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_concept_name_internal(synset, genl_terms, workflow_alist, auto_suffixP);
            } else {
                cb_wordnet_import_comment.wni_concept_comment(list(synset, genl_terms, name, workflow_alist));
            }
            return NIL;
        }
    }

    /**
     * Handles user input from the web page that names an imported WordNet synset.
     * The input consists an input field with the name and button selections for Back and Next.
     *
     * @param args;
     * 		name field and the button selected
     * @return nil
     */
    @LispMethod(comment = "Handles user input from the web page that names an imported WordNet synset.\r\nThe input consists an input field with the name and button selections for Back and Next.\r\n\r\n@param args;\r\n\t\tname field and the button selected\r\n@return nil\nHandles user input from the web page that names an imported WordNet synset.\nThe input consists an input field with the name and button selections for Back and Next.")
    public static SubLObject wni_concept_name_input(final SubLObject args) {
        assert NIL != listp(args) : "! listp(args) " + ("Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) ") + args;
        final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str4$synset_id, args));
        final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str5$genl_terms, args));
        final SubLObject auto_suffixP = list_utilities.sublisp_boolean(html_extract_input($str6$auto_suffix, args));
        final SubLObject name = html_extract_input($$$name, args);
        final SubLObject workflow_alist = read_from_string(html_extract_input($str8$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != auto_suffixP) {
            wni_concept_name_internal(synset, genl_terms, workflow_alist, auto_suffixP);
        } else {
            cb_wordnet_import_comment.wni_concept_comment(list(synset, genl_terms, name, workflow_alist));
        }
        return NIL;
    }

    /**
     * Create the web page for the web page that names the imported WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, genls for the imported synset
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param auto-suffix?
     * 		; booleanp, indicator that the genls name should be automatically appended to the term name
     */
    @LispMethod(comment = "Create the web page for the web page that names the imported WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, genls for the imported synset\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param auto-suffix?\r\n\t\t; booleanp, indicator that the genls name should be automatically appended to the term name")
    public static final SubLObject wni_concept_name_internal_alt(SubLObject synset, SubLObject genl_terms, SubLObject workflow_alist, SubLObject auto_suffixP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject list_var = genl_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            SubLTrampolineFile.checkType(auto_suffixP, BOOLEANP);
            if (NIL != agenda.agenda_running()) {
                agenda.halt_agenda(UNPROVIDED);
            }
            {
                SubLObject pos_desc = assoc(wordnet_import.wni_synset_pos(synset), wordnet_import.$wni_pos_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
                SubLObject title = cconcatenate($str_alt14$Is_this_a_good_name_for_the_, new SubLObject[]{ pos_desc, $str_alt15$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) });
                SubLObject name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_suggest_name(synset, genl_terms, auto_suffixP);
                SubLObject title_var = title;
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
                                    html_markup($str_alt18$yui_skin_sam);
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
                                                    html_hidden_input($str_alt19$wni_concept_name_input, T, UNPROVIDED);
                                                    html_hidden_input($str_alt3$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                                                    html_hidden_input($str_alt4$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                                                    html_hidden_input($str_alt7$workflow_alist, format(NIL, $str_alt20$_S, workflow_alist), UNPROVIDED);
                                                    {
                                                        SubLObject cdolist_list_var = genl_terms;
                                                        SubLObject genl_term = NIL;
                                                        for (genl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_term = cdolist_list_var.first()) {
                                                            cb_wordnet_utilities.wni_html_termXcomment(genl_term, T);
                                                        }
                                                    }
                                                    cb_wordnet_utilities.wni_html_up_arrow(NIL != wordnet_import.wni_synset_collectionP(synset) ? ((SubLObject) ($GENLS)) : $ISA);
                                                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples(synset, UNPROVIDED, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                    html_princ($str_alt23$Verify_This_Name___);
                                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                                                    html_script_utilities.html_clear_input_button($$$name, UNPROVIDED);
                                                    html_indent(TWO_INTEGER);
                                                    if (NIL == string_utilities.ends_with(name, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_best_genl_name(genl_terms), UNPROVIDED)) {
                                                        html_submit_input($$$Auto_Suffix, $str_alt5$auto_suffix, UNPROVIDED);
                                                        html_indent(TWO_INTEGER);
                                                    }
                                                    html_submit_input($$$Next, $$$next, UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_text_input($$$name, name, $wni_name_input_width$.getDynamicValue(thread));
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED);
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
            agenda.ensure_agenda_running();
            return NIL;
        }
    }

    /**
     * Create the web page for the web page that names the imported WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, genls for the imported synset
     * @param workflow-alist
     * 		; alist-p, the new word characteristics association list
     * @param auto-suffix?
     * 		; booleanp, indicator that the genls name should be automatically appended to the term name
     */
    @LispMethod(comment = "Create the web page for the web page that names the imported WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, genls for the imported synset\r\n@param workflow-alist\r\n\t\t; alist-p, the new word characteristics association list\r\n@param auto-suffix?\r\n\t\t; booleanp, indicator that the genls name should be automatically appended to the term name")
    public static SubLObject wni_concept_name_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject workflow_alist, final SubLObject auto_suffixP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(auto_suffixP) : "! booleanp(auto_suffixP) " + ("Types.booleanp(auto_suffixP) " + "CommonSymbols.NIL != Types.booleanp(auto_suffixP) ") + auto_suffixP;
        if (NIL != agenda.agenda_running()) {
            agenda.halt_agenda(UNPROVIDED);
        }
        final SubLObject pos_desc = assoc(wordnet_import.wni_synset_pos(synset), wordnet_import.$wni_pos_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        final SubLObject title = cconcatenate($$$Is_this_a_good_name_for_the_, new SubLObject[]{ pos_desc, $$$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) });
        final SubLObject name = wni_suggest_name(synset, genl_terms, auto_suffixP);
        final SubLObject title_var = title;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str17$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str18$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str23$yui_skin_sam);
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
                            html_hidden_input($str29$wni_concept_name_input, T, UNPROVIDED);
                            html_hidden_input($str4$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                            html_hidden_input($str5$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                            html_hidden_input($str8$workflow_alist, format(NIL, $str30$_S, workflow_alist), UNPROVIDED);
                            SubLObject cdolist_list_var2 = genl_terms;
                            SubLObject genl_term = NIL;
                            genl_term = cdolist_list_var2.first();
                            while (NIL != cdolist_list_var2) {
                                cb_wordnet_utilities.wni_html_termXcomment(genl_term, T);
                                cdolist_list_var2 = cdolist_list_var2.rest();
                                genl_term = cdolist_list_var2.first();
                            } 
                            cb_wordnet_utilities.wni_html_up_arrow(NIL != wordnet_import.wni_synset_collectionP(synset) ? $GENLS : $ISA);
                            cb_wordnet_utilities.wni_html_synset_words_gloss_examples(synset, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str33$Verify_This_Name___);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_script_utilities.html_clear_input_button($$$name, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            if (NIL == string_utilities.ends_with(name, wni_best_genl_name(genl_terms), UNPROVIDED)) {
                                html_submit_input($$$Auto_Suffix, $str6$auto_suffix, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                            }
                            html_submit_input($$$Next, $$$next, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_text_input($$$name, name, $wni_name_input_width$.getDynamicValue(thread));
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_NAME, UNPROVIDED, UNPROVIDED);
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
        agenda.ensure_agenda_running();
        return NIL;
    }

    /**
     * Returns the suggested name for the imported WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @param auto-suffix?
     * 		; booleanp, indicator that the genls name should be automatically appended to the term name
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@param auto-suffix?\r\n\t\t; booleanp, indicator that the genls name should be automatically appended to the term name\r\n@return stringp")
    public static final SubLObject wni_suggest_name_alt(SubLObject synset, SubLObject genl_terms, SubLObject auto_suffixP) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        SubLTrampolineFile.checkType(auto_suffixP, BOOLEANP);
        {
            SubLObject name = (NIL != wordnet_import.wni_synset_collectionP(synset)) ? ((SubLObject) (com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_suggest_name_for_collection(synset, genl_terms))) : com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_suggest_name_for_individual(synset, genl_terms);
            if (NIL != auto_suffixP) {
                name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_auto_suffix(name, genl_terms);
            }
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    /**
     * Returns the suggested name for the imported WordNet synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @param auto-suffix?
     * 		; booleanp, indicator that the genls name should be automatically appended to the term name
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@param auto-suffix?\r\n\t\t; booleanp, indicator that the genls name should be automatically appended to the term name\r\n@return stringp")
    public static SubLObject wni_suggest_name(final SubLObject synset, final SubLObject genl_terms, final SubLObject auto_suffixP) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        assert NIL != booleanp(auto_suffixP) : "! booleanp(auto_suffixP) " + ("Types.booleanp(auto_suffixP) " + "CommonSymbols.NIL != Types.booleanp(auto_suffixP) ") + auto_suffixP;
        SubLObject name = (NIL != wordnet_import.wni_synset_collectionP(synset)) ? wni_suggest_name_for_collection(synset, genl_terms) : wni_suggest_name_for_individual(synset, genl_terms);
        if (NIL != auto_suffixP) {
            name = wni_auto_suffix(name, genl_terms);
        }
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Returns a name with an automatically generated suffix.
     *
     * @param name
     * 		; stringp, the given name
     * @return stringp
     */
    @LispMethod(comment = "Returns a name with an automatically generated suffix.\r\n\r\n@param name\r\n\t\t; stringp, the given name\r\n@return stringp")
    public static final SubLObject wni_auto_suffix_alt(SubLObject name, SubLObject genl_terms) {
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject suffixed_name = NIL;
            SubLObject suffix = cconcatenate($str_alt29$_, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_best_genl_name(genl_terms));
            if (NIL != string_utilities.ends_with(name, suffix, UNPROVIDED)) {
                suffixed_name = name;
            } else {
                {
                    SubLObject name_last_word = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_last_word(name);
                    SubLObject suffix_last_word = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_last_word(suffix);
                    if (NIL != Strings.stringE(name_last_word, suffix_last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        name = string_utilities.post_remove(name, name_last_word, UNPROVIDED);
                    }
                    if (NIL != string_utilities.ends_with(name, $$$Something, UNPROVIDED)) {
                        name = string_utilities.post_remove(name, $$$Something, UNPROVIDED);
                    }
                    if (NIL != string_utilities.ends_with(name, $$$Someone, UNPROVIDED)) {
                        name = string_utilities.post_remove(name, $$$Someone, UNPROVIDED);
                    }
                    suffixed_name = cconcatenate(name, suffix);
                }
            }
            SubLTrampolineFile.checkType(suffixed_name, STRINGP);
            return suffixed_name;
        }
    }

    /**
     * Returns a name with an automatically generated suffix.
     *
     * @param name
     * 		; stringp, the given name
     * @return stringp
     */
    @LispMethod(comment = "Returns a name with an automatically generated suffix.\r\n\r\n@param name\r\n\t\t; stringp, the given name\r\n@return stringp")
    public static SubLObject wni_auto_suffix(SubLObject name, final SubLObject genl_terms) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject suffixed_name = NIL;
        final SubLObject suffix = cconcatenate($str39$_, wni_best_genl_name(genl_terms));
        if (NIL != string_utilities.ends_with(name, suffix, UNPROVIDED)) {
            suffixed_name = name;
        } else {
            final SubLObject name_last_word = wni_last_word(name);
            final SubLObject suffix_last_word = wni_last_word(suffix);
            if (NIL != Strings.stringE(name_last_word, suffix_last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                name = string_utilities.post_remove(name, name_last_word, UNPROVIDED);
            }
            if (NIL != string_utilities.ends_with(name, $$$Something, UNPROVIDED)) {
                name = string_utilities.post_remove(name, $$$Something, UNPROVIDED);
            }
            if (NIL != string_utilities.ends_with(name, $$$Someone, UNPROVIDED)) {
                name = string_utilities.post_remove(name, $$$Someone, UNPROVIDED);
            }
            suffixed_name = cconcatenate(name, suffix);
        }
        assert NIL != stringp(suffixed_name) : "! stringp(suffixed_name) " + ("Types.stringp(suffixed_name) " + "CommonSymbols.NIL != Types.stringp(suffixed_name) ") + suffixed_name;
        return suffixed_name;
    }

    /**
     * Returns the last word in the given NAME.  BreakingSomething --> Something.
     *
     * @param name
     * 		; stringp, the given name
     * @return stringp, the last word in the given name
     */
    @LispMethod(comment = "Returns the last word in the given NAME.  BreakingSomething --> Something.\r\n\r\n@param name\r\n\t\t; stringp, the given name\r\n@return stringp, the last word in the given name")
    public static final SubLObject wni_last_word_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject last_word = NIL;
            SubLObject words = string_utilities.relevant_substrings(name);
            if (NIL != list_utilities.singletonP(words)) {
                last_word = name;
            } else {
                last_word = string_utilities.capitalize_first(list_utilities.last_one(words));
            }
            SubLTrampolineFile.checkType(last_word, STRINGP);
            return last_word;
        }
    }

    /**
     * Returns the last word in the given NAME.  BreakingSomething --> Something.
     *
     * @param name
     * 		; stringp, the given name
     * @return stringp, the last word in the given name
     */
    @LispMethod(comment = "Returns the last word in the given NAME.  BreakingSomething --> Something.\r\n\r\n@param name\r\n\t\t; stringp, the given name\r\n@return stringp, the last word in the given name")
    public static SubLObject wni_last_word(final SubLObject name) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        SubLObject last_word = NIL;
        final SubLObject words = string_utilities.relevant_substrings(name);
        if (NIL != list_utilities.singletonP(words)) {
            last_word = name;
        } else {
            last_word = string_utilities.capitalize_first(list_utilities.last_one(words));
        }
        assert NIL != stringp(last_word) : "! stringp(last_word) " + ("Types.stringp(last_word) " + "CommonSymbols.NIL != Types.stringp(last_word) ") + last_word;
        return last_word;
    }

    /**
     * Returns the suggested name for the imported WordNet synset collection.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet synset collection.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static final SubLObject wni_suggest_name_for_collection_alt(SubLObject synset, SubLObject genl_terms) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject pos = wordnet_import.wni_synset_pos(synset);
            SubLObject name = (pos == $$Verb) ? ((SubLObject) (com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_suggest_name_for_verb(synset, genl_terms))) : com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_suggest_name_for_noun_collection(synset, genl_terms);
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    /**
     * Returns the suggested name for the imported WordNet synset collection.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet synset collection.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static SubLObject wni_suggest_name_for_collection(final SubLObject synset, final SubLObject genl_terms) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject pos = wordnet_import.wni_synset_pos(synset);
        final SubLObject name = (pos.eql($$Verb)) ? wni_suggest_name_for_verb(synset, genl_terms) : wni_suggest_name_for_noun_collection(synset, genl_terms);
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Returns the suggested name for the imported WordNet noun (or adjective) collection synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet noun (or adjective) collection synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static final SubLObject wni_suggest_name_for_noun_collection_alt(SubLObject synset, SubLObject genl_terms) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_unique_constant_name(wordnet_import.wni_synset_words(synset).first(), synset, genl_terms);
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    /**
     * Returns the suggested name for the imported WordNet noun (or adjective) collection synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet noun (or adjective) collection synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static SubLObject wni_suggest_name_for_noun_collection(final SubLObject synset, final SubLObject genl_terms) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject name = wni_unique_constant_name(wordnet_import.wni_synset_words(synset).first(), synset, genl_terms);
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Returns the suggested name for the imported WordNet verb synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet verb synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static final SubLObject wni_suggest_name_for_verb_alt(SubLObject synset, SubLObject genl_terms) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject words = string_utilities.split_string(wordnet_import.wni_synset_words(synset).first(), UNPROVIDED);
            SubLObject first_word = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_infinitive_to_pres_participle(words.first());
            SubLObject name = string_utilities.bunge(append(list(first_word), words.rest()), UNPROVIDED);
            SubLObject verb_frame = wordnet_import.wni_most_general_synset_verb_frame(synset);
            SubLObject suffix = $str_alt33$;
            SubLObject pcase_var = verb_frame;
            if (pcase_var.eql($$WNVerbFrame_8)) {
                suffix = $str_alt35$_Something;
            } else {
                if (pcase_var.eql($$WNVerbFrame_2)) {
                    suffix = $str_alt33$;
                } else {
                    if (pcase_var.eql($$WNVerbFrame_1)) {
                        suffix = $str_alt33$;
                    } else {
                        if (pcase_var.eql($$WNVerbFrame_9)) {
                            suffix = $str_alt39$_Someone;
                        } else {
                            if (pcase_var.eql($$WNVerbFrame_11)) {
                                suffix = $str_alt35$_Something;
                            } else {
                                if (pcase_var.eql($$WNVerbFrame_22)) {
                                    suffix = $str_alt33$;
                                } else {
                                    if (pcase_var.eql($$WNVerbFrame_4)) {
                                        suffix = $str_alt33$;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_unique_constant_name(cconcatenate(name, suffix), synset, genl_terms);
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    /**
     * Returns the suggested name for the imported WordNet verb synset.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet verb synset.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static SubLObject wni_suggest_name_for_verb(final SubLObject synset, final SubLObject genl_terms) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject words = string_utilities.split_string(wordnet_import.wni_synset_words(synset).first(), UNPROVIDED);
        final SubLObject first_word = wni_infinitive_to_pres_participle(words.first());
        SubLObject name = string_utilities.bunge(append(list(first_word), words.rest()), UNPROVIDED);
        final SubLObject verb_frame = wordnet_import.wni_most_general_synset_verb_frame(synset);
        SubLObject suffix = $str43$;
        final SubLObject pcase_var = verb_frame;
        if (pcase_var.eql($$WNVerbFrame_8)) {
            suffix = $$$_Something;
        } else
            if (pcase_var.eql($$WNVerbFrame_2)) {
                suffix = $str43$;
            } else
                if (pcase_var.eql($$WNVerbFrame_1)) {
                    suffix = $str43$;
                } else
                    if (pcase_var.eql($$WNVerbFrame_9)) {
                        suffix = $$$_Someone;
                    } else
                        if (pcase_var.eql($$WNVerbFrame_11)) {
                            suffix = $$$_Something;
                        } else
                            if (pcase_var.eql($$WNVerbFrame_22)) {
                                suffix = $str43$;
                            } else
                                if (pcase_var.eql($$WNVerbFrame_4)) {
                                    suffix = $str43$;
                                }






        name = wni_unique_constant_name(cconcatenate(name, suffix), synset, genl_terms);
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Returns the present participle of the given infinitive verb form, handling errors.
     */
    @LispMethod(comment = "Returns the present participle of the given infinitive verb form, handling errors.")
    public static final SubLObject wni_infinitive_to_pres_participle_alt(SubLObject word) {
        SubLTrampolineFile.checkType(word, STRINGP);
        {
            SubLObject pres_participle = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            pres_participle = morphology.infinitive_to_pres_participle(word);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            if (NIL == pres_participle) {
                pres_participle = word;
            }
            SubLTrampolineFile.checkType(pres_participle, STRINGP);
            return pres_participle;
        }
    }

    /**
     * Returns the present participle of the given infinitive verb form, handling errors.
     */
    @LispMethod(comment = "Returns the present participle of the given infinitive verb form, handling errors.")
    public static SubLObject wni_infinitive_to_pres_participle(final SubLObject word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(word) : "! stringp(word) " + ("Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) ") + word;
        SubLObject pres_participle = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    pres_participle = morphology.infinitive_to_pres_participle(word);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL == pres_participle) {
            pres_participle = word;
        }
        assert NIL != stringp(pres_participle) : "! stringp(pres_participle) " + ("Types.stringp(pres_participle) " + "CommonSymbols.NIL != Types.stringp(pres_participle) ") + pres_participle;
        return pres_participle;
    }

    /**
     * Returns the suggested name for the imported WordNet synset individual.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet synset individual.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static final SubLObject wni_suggest_name_for_individual_alt(SubLObject synset, SubLObject genl_terms) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject name = NIL;
            SubLObject synset_words = wordnet_import.wni_synset_words(synset);
            SubLObject longest_word = $str_alt33$;
            SubLObject cdolist_list_var = synset_words;
            SubLObject synset_word = NIL;
            for (synset_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word = cdolist_list_var.first()) {
                if (length(synset_word).numG(length(longest_word))) {
                    longest_word = synset_word;
                }
            }
            name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_unique_constant_name(longest_word, synset, genl_terms);
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    /**
     * Returns the suggested name for the imported WordNet synset individual.
     *
     * @param synset
     * 		: naut-p
     * @param genl-terms
     * 		: listp, the genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet synset individual.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param genl-terms\r\n\t\t: listp, the genls for the synset\r\n@return stringp")
    public static SubLObject wni_suggest_name_for_individual(final SubLObject synset, final SubLObject genl_terms) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject name = NIL;
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject longest_word = $str43$;
        SubLObject cdolist_list_var2 = synset_words;
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (length(synset_word).numG(length(longest_word))) {
                longest_word = synset_word;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            synset_word = cdolist_list_var2.first();
        } 
        name = wni_unique_constant_name(longest_word, synset, genl_terms);
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Returns a unique name
     */
    @LispMethod(comment = "Returns a unique name")
    public static final SubLObject wni_unique_constant_name_alt(SubLObject name, SubLObject synset, SubLObject genl_terms) {
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject list_var = genl_terms;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, FORT_P);
                }
            }
        }
        {
            SubLObject best_genl_name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_best_genl_name(genl_terms);
            SubLObject unique_name = string_utilities.make_valid_constant_name(name, T);
            unique_name = string_utilities.remove_substring(unique_name, $str_alt29$_);
            unique_name = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_suggest_name_checking_word_sense_frequency(unique_name, synset, best_genl_name);
            if (!((NIL != constant_completion_high.constant_name_available(unique_name)) || (NIL != string_utilities.ends_with(name, best_genl_name, UNPROVIDED)))) {
                unique_name = cconcatenate(unique_name, new SubLObject[]{ $str_alt29$_, com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_best_genl_name(genl_terms) });
            }
            if (NIL == constant_completion_high.constant_name_available(unique_name)) {
                unique_name = cconcatenate(unique_name, new SubLObject[]{ $str_alt29$_, $str_alt45$_make_me_unique_ });
            }
            unique_name = string_utilities.capitalize_first(unique_name);
            SubLTrampolineFile.checkType(unique_name, STRINGP);
            return unique_name;
        }
    }

    /**
     * Returns a unique name
     */
    @LispMethod(comment = "Returns a unique name")
    public static SubLObject wni_unique_constant_name(final SubLObject name, final SubLObject synset, final SubLObject genl_terms) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject best_genl_name = wni_best_genl_name(genl_terms);
        SubLObject unique_name = string_utilities.make_valid_constant_name(name, T);
        unique_name = string_utilities.remove_substring(unique_name, $str39$_);
        unique_name = wni_suggest_name_checking_word_sense_frequency(unique_name, synset, best_genl_name);
        if ((NIL == constant_completion_high.constant_name_available(unique_name)) && (NIL == string_utilities.ends_with(name, best_genl_name, UNPROVIDED))) {
            unique_name = cconcatenate(unique_name, new SubLObject[]{ $str39$_, wni_best_genl_name(genl_terms) });
        }
        if (NIL == constant_completion_high.constant_name_available(unique_name)) {
            unique_name = cconcatenate(unique_name, new SubLObject[]{ $str39$_, $str55$_make_me_unique_ });
        }
        unique_name = string_utilities.capitalize_first(unique_name);
        assert NIL != stringp(unique_name) : "! stringp(unique_name) " + ("Types.stringp(unique_name) " + "CommonSymbols.NIL != Types.stringp(unique_name) ") + unique_name;
        return unique_name;
    }

    /**
     * Returns the suggested name for the imported WordNet collection synset, checking for more frequent uses
     * of the first word of the given synset.  If more frequently used other synsets exist, then the
     * name is automatically suffixed with its best genl term name.
     *
     * @param synset
     * 		: naut-p
     * @param best-genl-name
     * 		: stringp, the suffix derived from the best genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet collection synset, checking for more frequent uses\r\nof the first word of the given synset.  If more frequently used other synsets exist, then the\r\nname is automatically suffixed with its best genl term name.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param best-genl-name\r\n\t\t: stringp, the suffix derived from the best genls for the synset\r\n@return stringp\nReturns the suggested name for the imported WordNet collection synset, checking for more frequent uses\nof the first word of the given synset.  If more frequently used other synsets exist, then the\nname is automatically suffixed with its best genl term name.")
    public static final SubLObject wni_suggest_name_checking_word_sense_frequency_alt(SubLObject name, SubLObject synset, SubLObject best_genl_name) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(best_genl_name, STRINGP);
        if (NIL != string_utilities.ends_with(name, best_genl_name, UNPROVIDED)) {
            return name;
        }
        {
            SubLObject first_synset_word = wordnet_import.wni_synset_words(synset).first();
            SubLObject word_sense_synsets = wordnet_import.wni_synsets_for_english_word_stringXpos(first_synset_word, wordnet_import.wni_synset_pos(synset));
            SubLObject word_sense_synset = NIL;
            SubLObject inferior_word_senseP = NIL;
            SubLObject doneP = NIL;
            if (NIL != list_utilities.singletonP(word_sense_synsets)) {
                return name;
            }
            while (NIL == doneP) {
                if (NIL != word_sense_synsets) {
                    word_sense_synset = word_sense_synsets.first();
                    word_sense_synsets = word_sense_synsets.rest();
                    if (NIL != wordnet_import.wni_synsets_equal(synset, word_sense_synset)) {
                        doneP = T;
                    } else {
                        if (NIL != Strings.stringE(first_synset_word, wordnet_import.wni_synset_words(word_sense_synset).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            inferior_word_senseP = T;
                            doneP = T;
                        }
                    }
                } else {
                    doneP = T;
                }
            } 
            if (NIL != inferior_word_senseP) {
                name = cconcatenate(name, new SubLObject[]{ $str_alt29$_, best_genl_name });
            }
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    /**
     * Returns the suggested name for the imported WordNet collection synset, checking for more frequent uses
     * of the first word of the given synset.  If more frequently used other synsets exist, then the
     * name is automatically suffixed with its best genl term name.
     *
     * @param synset
     * 		: naut-p
     * @param best-genl-name
     * 		: stringp, the suffix derived from the best genls for the synset
     * @return stringp
     */
    @LispMethod(comment = "Returns the suggested name for the imported WordNet collection synset, checking for more frequent uses\r\nof the first word of the given synset.  If more frequently used other synsets exist, then the\r\nname is automatically suffixed with its best genl term name.\r\n\r\n@param synset\r\n\t\t: naut-p\r\n@param best-genl-name\r\n\t\t: stringp, the suffix derived from the best genls for the synset\r\n@return stringp\nReturns the suggested name for the imported WordNet collection synset, checking for more frequent uses\nof the first word of the given synset.  If more frequently used other synsets exist, then the\nname is automatically suffixed with its best genl term name.")
    public static SubLObject wni_suggest_name_checking_word_sense_frequency(SubLObject name, final SubLObject synset, final SubLObject best_genl_name) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != stringp(best_genl_name) : "! stringp(best_genl_name) " + ("Types.stringp(best_genl_name) " + "CommonSymbols.NIL != Types.stringp(best_genl_name) ") + best_genl_name;
        if (NIL != string_utilities.ends_with(name, best_genl_name, UNPROVIDED)) {
            return name;
        }
        final SubLObject first_synset_word = wordnet_import.wni_synset_words(synset).first();
        SubLObject word_sense_synsets = wordnet_import.wni_synsets_for_english_word_stringXpos(first_synset_word, wordnet_import.wni_synset_pos(synset));
        SubLObject word_sense_synset = NIL;
        SubLObject inferior_word_senseP = NIL;
        SubLObject doneP = NIL;
        if (NIL != list_utilities.singletonP(word_sense_synsets)) {
            return name;
        }
        while (NIL == doneP) {
            if (NIL != word_sense_synsets) {
                word_sense_synset = word_sense_synsets.first();
                word_sense_synsets = word_sense_synsets.rest();
                if (NIL != wordnet_import.wni_synsets_equal(synset, word_sense_synset)) {
                    doneP = T;
                } else {
                    if (NIL == Strings.stringE(first_synset_word, wordnet_import.wni_synset_words(word_sense_synset).first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        continue;
                    }
                    inferior_word_senseP = T;
                    doneP = T;
                }
            } else {
                doneP = T;
            }
        } 
        if (NIL != inferior_word_senseP) {
            name = cconcatenate(name, new SubLObject[]{ $str39$_, best_genl_name });
        }
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Return the constant name of the minimum collection in GENL-TERMS, with more genl terms
     * substituted for any non-constants.
     *
     * @param genl-terms
     * 		; listp of terms
     * @return stringp
     */
    @LispMethod(comment = "Return the constant name of the minimum collection in GENL-TERMS, with more genl terms\r\nsubstituted for any non-constants.\r\n\r\n@param genl-terms\r\n\t\t; listp of terms\r\n@return stringp\nReturn the constant name of the minimum collection in GENL-TERMS, with more genl terms\nsubstituted for any non-constants.")
    public static final SubLObject wni_best_genl_name_alt(SubLObject genl_terms) {
        SubLTrampolineFile.checkType(genl_terms, LISTP);
        {
            SubLObject name = NIL;
            name = constants_high.constant_name(genls.min_col(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_non_constants_replaced_with_genl_constants(genl_terms), UNPROVIDED, UNPROVIDED));
            SubLTrampolineFile.checkType(name, STRINGP);
            return name;
        }
    }

    @LispMethod(comment = "Return the constant name of the minimum collection in GENL-TERMS, with more genl terms\r\nsubstituted for any non-constants.\r\n\r\n@param genl-terms\r\n\t\t; listp of terms\r\n@return stringp\nReturn the constant name of the minimum collection in GENL-TERMS, with more genl terms\nsubstituted for any non-constants.")
    public static SubLObject wni_best_genl_name(final SubLObject genl_terms) {
        assert NIL != listp(genl_terms) : "! listp(genl_terms) " + ("Types.listp(genl_terms) " + "CommonSymbols.NIL != Types.listp(genl_terms) ") + genl_terms;
        SubLObject name = NIL;
        name = constants_high.constant_name(genls.min_col(wni_non_constants_replaced_with_genl_constants(genl_terms), UNPROVIDED, UNPROVIDED));
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        return name;
    }

    /**
     * Return the given list of terms with more genl constants substituted for any non-constants.
     *
     * @param terms
     * 		; listp
     * @return listp ; of constants
     */
    @LispMethod(comment = "Return the given list of terms with more genl constants substituted for any non-constants.\r\n\r\n@param terms\r\n\t\t; listp\r\n@return listp ; of constants")
    public static final SubLObject wni_non_constants_replaced_with_genl_constants_alt(SubLObject terms) {
        SubLTrampolineFile.checkType(terms, LISTP);
        {
            SubLObject constant_terms = NIL;
            {
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (NIL != constant_p(v_term)) {
                        constant_terms = cons(v_term, constant_terms);
                    } else {
                        constant_terms = append(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_name.wni_non_constants_replaced_with_genl_constants(genls.genls(v_term, UNPROVIDED, UNPROVIDED)), constant_terms);
                    }
                }
            }
            {
                SubLObject list_var = constant_terms;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, CONSTANT_P);
                    }
                }
            }
            return constant_terms;
        }
    }

    @LispMethod(comment = "Return the given list of terms with more genl constants substituted for any non-constants.\r\n\r\n@param terms\r\n\t\t; listp\r\n@return listp ; of constants")
    public static SubLObject wni_non_constants_replaced_with_genl_constants(final SubLObject terms) {
        assert NIL != listp(terms) : "! listp(terms) " + ("Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) ") + terms;
        SubLObject constant_terms = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != constant_p(v_term)) {
                constant_terms = cons(v_term, constant_terms);
            } else {
                constant_terms = append(wni_non_constants_replaced_with_genl_constants(genls.genls(v_term, UNPROVIDED, UNPROVIDED)), constant_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        final SubLObject list_var = constant_terms;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != constant_p(elem) : "! constant_handles.constant_p(elem) " + ("constant_handles.constant_p(elem) " + "CommonSymbols.NIL != constant_handles.constant_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return constant_terms;
    }

    public static SubLObject declare_cb_wordnet_import_concept_name_file() {
        declareFunction("wni_concept_name", "WNI-CONCEPT-NAME", 1, 0, false);
        declareFunction("wni_concept_name_input", "WNI-CONCEPT-NAME-INPUT", 1, 0, false);
        declareFunction("wni_concept_name_internal", "WNI-CONCEPT-NAME-INTERNAL", 4, 0, false);
        declareFunction("wni_suggest_name", "WNI-SUGGEST-NAME", 3, 0, false);
        declareFunction("wni_auto_suffix", "WNI-AUTO-SUFFIX", 2, 0, false);
        declareFunction("wni_last_word", "WNI-LAST-WORD", 1, 0, false);
        declareFunction("wni_suggest_name_for_collection", "WNI-SUGGEST-NAME-FOR-COLLECTION", 2, 0, false);
        declareFunction("wni_suggest_name_for_noun_collection", "WNI-SUGGEST-NAME-FOR-NOUN-COLLECTION", 2, 0, false);
        declareFunction("wni_suggest_name_for_verb", "WNI-SUGGEST-NAME-FOR-VERB", 2, 0, false);
        declareFunction("wni_infinitive_to_pres_participle", "WNI-INFINITIVE-TO-PRES-PARTICIPLE", 1, 0, false);
        declareFunction("wni_suggest_name_for_individual", "WNI-SUGGEST-NAME-FOR-INDIVIDUAL", 2, 0, false);
        declareFunction("wni_unique_constant_name", "WNI-UNIQUE-CONSTANT-NAME", 3, 0, false);
        declareFunction("wni_suggest_name_checking_word_sense_frequency", "WNI-SUGGEST-NAME-CHECKING-WORD-SENSE-FREQUENCY", 3, 0, false);
        declareFunction("wni_best_genl_name", "WNI-BEST-GENL-NAME", 1, 0, false);
        declareFunction("wni_non_constants_replaced_with_genl_constants", "WNI-NON-CONSTANTS-REPLACED-WITH-GENL-CONSTANTS", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt1$WordNet_Import___Name = makeString("WordNet Import - Name");

    static private final SubLString $str_alt3$synset_id = makeString("synset-id");

    static private final SubLString $str_alt4$genl_terms = makeString("genl-terms");

    static private final SubLString $str_alt5$auto_suffix = makeString("auto-suffix");

    static private final SubLString $str_alt7$workflow_alist = makeString("workflow-alist");

    static private final SubLString $str_alt14$Is_this_a_good_name_for_the_ = makeString("Is this a good name for the ");

    static private final SubLString $str_alt15$_Synonym_Set__ = makeString(" Synonym Set  ");

    static private final SubLString $str_alt17$text_javascript = makeString("text/javascript");

    static private final SubLString $str_alt18$yui_skin_sam = makeString("yui-skin-sam");

    public static SubLObject init_cb_wordnet_import_concept_name_file() {
        defparameter("*WNI-NAME-INPUT-WIDTH*", $int$80);
        return NIL;
    }

    static private final SubLString $str_alt19$wni_concept_name_input = makeString("wni-concept-name-input");

    public static final SubLObject setup_cb_wordnet_import_concept_name_file_alt() {
        html_macros.note_html_handler_function(WNI_CONCEPT_NAME);
        html_macros.note_html_handler_function(WNI_CONCEPT_NAME_INPUT);
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_concept_name_file() {
        if (SubLFiles.USE_V1) {
            html_macros.note_cgi_handler_function(WNI_CONCEPT_NAME, $HTML_HANDLER);
            html_macros.note_cgi_handler_function(WNI_CONCEPT_NAME_INPUT, $HTML_HANDLER);
        }
        if (SubLFiles.USE_V2) {
            html_macros.note_html_handler_function(WNI_CONCEPT_NAME);
            html_macros.note_html_handler_function(WNI_CONCEPT_NAME_INPUT);
        }
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_concept_name_file_Previous() {
        html_macros.note_cgi_handler_function(WNI_CONCEPT_NAME, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_CONCEPT_NAME_INPUT, $HTML_HANDLER);
        return NIL;
    }

    static private final SubLString $str_alt20$_S = makeString("~S");

    static private final SubLString $str_alt23$Verify_This_Name___ = makeString("Verify This Name:  ");

    @Override
    public void declareFunctions() {
        declare_cb_wordnet_import_concept_name_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_wordnet_import_concept_name_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_wordnet_import_concept_name_file();
    }

    static private final SubLString $str_alt29$_ = makeString("-");

    

    static private final SubLString $str_alt35$_Something = makeString(" Something");

    static private final SubLString $str_alt39$_Someone = makeString(" Someone");

    static private final SubLString $str_alt45$_make_me_unique_ = makeString("<make-me-unique>");
}

/**
 * Total time: 227 ms
 */
