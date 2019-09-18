package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_identifier;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_formatted_string;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_wordnet_import_new_words extends SubLTranslatedFile {
    public static final SubLFile me = new cb_wordnet_import_new_words();

    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_new_words";

    public static final String myFingerPrint = "ddab6f5e0be1c3015f22a5c2addfe2a0439453bea0a05600975d9f3c45f2f1c9";



    public static final SubLString $str1$WordNet_Import___New_Words = makeString("WordNet Import - New Words");

    public static final SubLSymbol WNI_NEW_WORDS = makeSymbol("WNI-NEW-WORDS");



    private static final SubLString $str4$synset_id = makeString("synset-id");

    private static final SubLString $str5$genl_terms = makeString("genl-terms");

    private static final SubLString $str6$matched_term_name = makeString("matched-term-name");

    private static final SubLString $$$finish = makeString("finish");

    private static final SubLString $str8$workflow_alist = makeString("workflow-alist");

    private static final SubLSymbol WNI_NEW_WORDS_INPUT = makeSymbol("WNI-NEW-WORDS-INPUT");













    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $$$Characterize_the_words_of_the_ = makeString("Characterize the words of the ");

    private static final SubLString $$$_Synonym_Set__ = makeString(" Synonym Set  ");

    private static final SubLString $str19$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    private static final SubLString $str20$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str21$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str26$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str32$wni_new_words_input = makeString("wni-new-words-input");

    private static final SubLString $str33$_S = makeString("~S");

    private static final SubLString $str34$cb_wordnet_import_new_words = makeString("cb-wordnet-import-new-words");

    private static final SubLString $$$Finish = makeString("Finish");

    private static final SubLString $$$Next = makeString("Next");

    private static final SubLString $$$next = makeString("next");

    private static final SubLSymbol SME_LI_DENOTATIONAL = makeSymbol("SME-LI-DENOTATIONAL");



    private static final SubLString $$$left = makeString("left");

    private static final SubLString $str41$1_ = makeString("1%");



    private static final SubLString $$$right = makeString("right");

    private static final SubLString $str44$99_ = makeString("99%");

    private static final SubLString $str45$_included = makeString("-included");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $$$Include_this_word_as_a_denotation = makeString("Include this word as a denotation");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLString $str49$Which_of_the_following_sounds_bes = makeString("Which of the following sounds best?");

    private static final SubLString $str50$_count_noun = makeString("-count-noun");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str52$headword_is_first = makeString("headword-is-first");

    private static final SubLString $$$nil = makeString("nil");

    private static final SubLString $str54$_formality = makeString("-formality");

    private static final SubLString $$$standard = makeString("standard");

    private static final SubLString $$$_standard__ = makeString(" standard  ");

    private static final SubLString $$$formal = makeString("formal");

    private static final SubLString $$$_formal__ = makeString(" formal  ");

    private static final SubLString $$$informal = makeString("informal");

    private static final SubLString $$$_informal__ = makeString(" informal  ");

    private static final SubLString $$$slang = makeString("slang");

    private static final SubLString $$$_slang__ = makeString(" slang  ");

    private static final SubLString $$$technical_jargon = makeString("technical jargon");

    private static final SubLString $$$_technical_jargon__ = makeString(" technical jargon  ");

    private static final SubLString $$$archaic = makeString("archaic");

    private static final SubLString $$$_archaic__ = makeString(" archaic  ");

    private static final SubLString $$$baby_talk = makeString("baby talk");

    private static final SubLString $$$_baby_talk = makeString(" baby talk");

    private static final SubLString $str69$_politeness = makeString("-politeness");

    private static final SubLString $$$polite = makeString("polite");

    private static final SubLString $$$_polite__ = makeString(" polite  ");

    private static final SubLString $$$rude = makeString("rude");

    private static final SubLString $$$_rude__ = makeString(" rude  ");

    private static final SubLString $$$vulgar = makeString("vulgar");

    private static final SubLString $$$_vulgar__ = makeString(" vulgar  ");

    private static final SubLString $str76$_rhetorical_device = makeString("-rhetorical-device");

    private static final SubLString $$$literal = makeString("literal");

    private static final SubLString $$$_literal__ = makeString(" literal  ");

    private static final SubLString $$$metaphor = makeString("metaphor");

    private static final SubLString $$$_metaphor__ = makeString(" metaphor  ");

    private static final SubLString $$$simile = makeString("simile");

    private static final SubLString $$$_simile__ = makeString(" simile  ");

    private static final SubLString $$$euphemism = makeString("euphemism");

    private static final SubLString $$$_euphemism__ = makeString(" euphemism  ");

    private static final SubLString $str85$literal___the_exact_meaning_of_th = makeString("literal - the exact meaning of the expression");

    private static final SubLString $str86$metaphor___a_figure_of_speech_in_ = makeString("metaphor - a figure of speech in which an expression is used to refer to something that it does not literally denote in order to suggest a similarity");

    private static final SubLString $str87$simile___a_figure_of_speech_that_ = makeString("simile - a figure of speech that expresses a resemblance between things of different kinds (usually formed with `like' or `as')");

    private static final SubLString $str88$euphemism___an_inoffensive_expres = makeString("euphemism - an inoffensive expression that is substituted for one that is considered offensive ");

    private static final SubLString $$$ism = makeString("ism");

    private static final SubLString $$$ief = makeString("ief");

    private static final SubLString $$$cor = makeString("cor");

    private static final SubLString $$$cour = makeString("cour");

    private static final SubLString $$$ion = makeString("ion");

    private static final SubLString $$$are = makeString("are");

    private static final SubLString $$$aid = makeString("aid");

    private static final SubLString $$$ing = makeString("ing");

    private static final SubLString $$$al = makeString("al");

    private static final SubLString $$$ence = makeString("ence");

    private static final SubLString $$$ance = makeString("ance");

    private static final SubLString $$$iny = makeString("iny");

    private static final SubLString $$$ness = makeString("ness");

    private static final SubLSymbol DERIVE_PART_OF_SPEECH_EXAMPLE = makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLE");

    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLString $str105$_ = makeString("(");

    private static final SubLString $str106$_is_a_count_noun_ = makeString(" is a count noun)");

    private static final SubLObject $$MassNoun = reader_make_constant_shell(makeString("MassNoun"));

    private static final SubLString $str108$_is_a_mass_noun_ = makeString(" is a mass noun)");





    public static SubLObject wni_new_words(final SubLObject args) {
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str1$WordNet_Import___New_Words);
        } else {
            final SubLObject synset = args.first();
            final SubLObject genl_terms = second(args);
            final SubLObject matched_term_name = third(args);
            final SubLObject workflow_alist = fourth(args);
            wni_new_words_internal(synset, genl_terms, matched_term_name, workflow_alist);
        }
        return NIL;
    }

    public static SubLObject wni_new_words_input(final SubLObject args) {
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
        final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str4$synset_id, args));
        final SubLObject genl_terms = cb_wordnet_utilities.wni_decode_terms_from_hidden_input(html_extract_input($str5$genl_terms, args));
        final SubLObject matched_term_name = html_extract_input($str6$matched_term_name, args);
        final SubLObject finishP = list_utilities.sublisp_boolean(html_extract_input($$$finish, args));
        SubLObject workflow_alist = read_from_string(html_extract_input($str8$workflow_alist, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        workflow_alist = wni_augment_workflow_alist_with_lexical_annotations(synset, args, workflow_alist);
        wni_new_words_input_internal(synset, genl_terms, matched_term_name, workflow_alist, finishP);
        return NIL;
    }

    public static SubLObject wni_new_words_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term_name, final SubLObject workflow_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) " + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (((NIL != matched_term_name) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(matched_term_name))) {
            throw new AssertionError(matched_term_name);
        }
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        if (NIL != agenda.agenda_running()) {
            agenda.halt_agenda(UNPROVIDED);
        }
        SubLObject comment = NIL;
        if ((NIL != matched_term_name) && (NIL == string_utilities.empty_string_p(matched_term_name))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                comment = kb_accessors.comment(czer_main.canonicalize_term_assert(cb_guess_term(matched_term_name, UNPROVIDED), UNPROVIDED), UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject pos_desc = assoc(wordnet_import.wni_synset_pos(synset), wordnet_import.$wni_pos_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        final SubLObject title = cconcatenate($$$Characterize_the_words_of_the_, new SubLObject[]{ pos_desc, $$$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) });
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        final SubLObject finish_buttonP = makeBoolean((NIL != list_utilities.sublisp_boolean(comment)) && (NIL == list_utilities.alist_lookup(workflow_alist, $str19$unmapped_hypernym_chain, EQUAL, UNPROVIDED)));
        final SubLObject any_hyponym_an_individualP = wordnet_import.wni_any_hyponym_an_individual(synset);
        final SubLObject title_var = title;
        final SubLObject _prev_bind_3 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str20$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str21$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str26$yui_skin_sam);
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
                        final SubLObject _prev_bind_4 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str32$wni_new_words_input, T, UNPROVIDED);
                            html_hidden_input($str4$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                            html_hidden_input($str5$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
                            html_hidden_input($str6$matched_term_name, matched_term_name, UNPROVIDED);
                            html_hidden_input($str8$workflow_alist, format(NIL, $str33$_S, workflow_alist), UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_help_preamble($str34$cb_wordnet_import_new_words, UNPROVIDED, UNPROVIDED);
                            if (NIL != finish_buttonP) {
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Finish, $$$finish, UNPROVIDED);
                            }
                            html_indent(TWO_INTEGER);
                            html_submit_input($$$Next, $$$next, UNPROVIDED);
                            final SubLObject sme_li_denotational = methods.funcall_class_method_with_0_args(SME_LI_DENOTATIONAL, NEW);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var2 = synset_words;
                                SubLObject synset_word = NIL;
                                synset_word = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(FIVE_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($$$left));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str41$1_);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                        html_glyph($NBSP, UNPROVIDED);
                                                        html_princ_formatted_string(synset_word);
                                                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_align($$$right));
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str44$99_);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_checkbox_input(cconcatenate(synset_word, $str45$_included), $$$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        html_indent(TWO_INTEGER);
                                                        html_princ($$$Include_this_word_as_a_denotation);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(FIVE_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_markup(ZERO_INTEGER);
                                            html_char(CHAR_quotation, UNPROVIDED);
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        if ((NIL != wordnet_import.wni_synset_collectionP(synset)) && $$Noun.eql(wordnet_import.wni_synset_pos(synset))) {
                                                            final SubLObject likely_count_nounP = makeBoolean((NIL != any_hyponym_an_individualP) || (NIL != wni_likely_count_noun(synset_word)));
                                                            html_newline(UNPROVIDED);
                                                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                                            html_princ($str49$Which_of_the_following_sounds_bes);
                                                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                                            html_newline(UNPROVIDED);
                                                            html_radio_input(cconcatenate(synset_word, $str50$_count_noun), $$$t, likely_count_nounP, UNPROVIDED);
                                                            html_princ($$$_);
                                                            html_princ(wni_example_count_noun_phrase(sme_li_denotational, synset_word));
                                                            html_newline(UNPROVIDED);
                                                            if (NIL != string_utilities.multi_word_string(synset_word)) {
                                                                html_radio_input(cconcatenate(synset_word, $str50$_count_noun), $str52$headword_is_first, UNPROVIDED, UNPROVIDED);
                                                                html_princ($$$_);
                                                                html_princ(wni_example_count_noun_phrase_when_headword_is_first(sme_li_denotational, synset_word));
                                                                html_newline(UNPROVIDED);
                                                            }
                                                            html_radio_input(cconcatenate(synset_word, $str50$_count_noun), $$$nil, makeBoolean(NIL == likely_count_nounP), UNPROVIDED);
                                                            html_princ($$$_);
                                                            html_princ(wni_example_mass_noun_phrase(sme_li_denotational, synset_word));
                                                            html_newline(UNPROVIDED);
                                                            html_hr(UNPROVIDED, UNPROVIDED);
                                                        }
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$standard, T, UNPROVIDED);
                                                        html_princ($$$_standard__);
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$formal, NIL, UNPROVIDED);
                                                        html_princ($$$_formal__);
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$informal, NIL, UNPROVIDED);
                                                        html_princ($$$_informal__);
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$slang, NIL, UNPROVIDED);
                                                        html_princ($$$_slang__);
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$technical_jargon, NIL, UNPROVIDED);
                                                        html_princ($$$_technical_jargon__);
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$archaic, NIL, UNPROVIDED);
                                                        html_princ($$$_archaic__);
                                                        html_radio_input(cconcatenate(synset_word, $str54$_formality), $$$baby_talk, NIL, UNPROVIDED);
                                                        html_princ($$$_baby_talk);
                                                        html_newline(UNPROVIDED);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_radio_input(cconcatenate(synset_word, $str69$_politeness), $$$standard, T, UNPROVIDED);
                                                        html_princ($$$_standard__);
                                                        html_radio_input(cconcatenate(synset_word, $str69$_politeness), $$$polite, NIL, UNPROVIDED);
                                                        html_princ($$$_polite__);
                                                        html_radio_input(cconcatenate(synset_word, $str69$_politeness), $$$rude, NIL, UNPROVIDED);
                                                        html_princ($$$_rude__);
                                                        html_radio_input(cconcatenate(synset_word, $str69$_politeness), $$$vulgar, NIL, UNPROVIDED);
                                                        html_princ($$$_vulgar__);
                                                        html_newline(UNPROVIDED);
                                                        html_hr(UNPROVIDED, UNPROVIDED);
                                                        html_radio_input(cconcatenate(synset_word, $str76$_rhetorical_device), $$$literal, T, UNPROVIDED);
                                                        html_princ($$$_literal__);
                                                        html_radio_input(cconcatenate(synset_word, $str76$_rhetorical_device), $$$metaphor, NIL, UNPROVIDED);
                                                        html_princ($$$_metaphor__);
                                                        html_radio_input(cconcatenate(synset_word, $str76$_rhetorical_device), $$$simile, NIL, UNPROVIDED);
                                                        html_princ($$$_simile__);
                                                        html_radio_input(cconcatenate(synset_word, $str76$_rhetorical_device), $$$euphemism, NIL, UNPROVIDED);
                                                        html_princ($$$_euphemism__);
                                                        html_newline(UNPROVIDED);
                                                        html_newline(UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    synset_word = cdolist_list_var2.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            if (NIL != finish_buttonP) {
                                html_submit_input($$$Finish, $$$finish, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                            }
                            html_submit_input($$$Next, $$$next, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_5, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_4, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        html_newline(UNPROVIDED);
                        html_newline(UNPROVIDED);
                        html_princ($str85$literal___the_exact_meaning_of_th);
                        html_newline(UNPROVIDED);
                        html_princ($str86$metaphor___a_figure_of_speech_in_);
                        html_newline(UNPROVIDED);
                        html_princ($str87$simile___a_figure_of_speech_that_);
                        html_newline(UNPROVIDED);
                        html_princ($str88$euphemism___an_inoffensive_expres);
                        html_newline(UNPROVIDED);
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
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_3, thread);
        }
        agenda.ensure_agenda_running();
        return NIL;
    }

    public static SubLObject wni_likely_count_noun(final SubLObject word) {
        assert NIL != stringp(word) : "Types.stringp(word) " + "CommonSymbols.NIL != Types.stringp(word) " + word;
        if (NIL != string_utilities.ends_with(word, $$$ism, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$ief, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$cor, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$cour, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$ion, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$are, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$aid, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$ing, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$al, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$ence, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$ance, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$iny, UNPROVIDED)) {
            return NIL;
        }
        if (NIL != string_utilities.ends_with(word, $$$ness, UNPROVIDED)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject wni_example_count_noun_phrase(final SubLObject sme_li_denotational, final SubLObject synset_word) {
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        SubLObject example_count_noun_phrase = methods.funcall_instance_method_with_5_args(sme_li_denotational, DERIVE_PART_OF_SPEECH_EXAMPLE, synset_word, list(synset_word), ZERO_INTEGER, $$CountNoun, $$Thing);
        if (NIL == example_count_noun_phrase) {
            example_count_noun_phrase = cconcatenate($str105$_, new SubLObject[]{ synset_word, $str106$_is_a_count_noun_ });
        }
        assert NIL != stringp(example_count_noun_phrase) : "Types.stringp(example_count_noun_phrase) " + "CommonSymbols.NIL != Types.stringp(example_count_noun_phrase) " + example_count_noun_phrase;
        return example_count_noun_phrase;
    }

    public static SubLObject wni_example_count_noun_phrase_when_headword_is_first(final SubLObject sme_li_denotational, final SubLObject synset_word) {
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        final SubLObject phrase_words = string_utilities.split_string(synset_word, UNPROVIDED);
        final SubLObject head_word = phrase_words.first();
        SubLObject example_count_noun_phrase = methods.funcall_instance_method_with_5_args(sme_li_denotational, DERIVE_PART_OF_SPEECH_EXAMPLE, head_word, phrase_words, ZERO_INTEGER, $$CountNoun, $$Thing);
        if (NIL == example_count_noun_phrase) {
            example_count_noun_phrase = cconcatenate($str105$_, new SubLObject[]{ synset_word, $str106$_is_a_count_noun_ });
        }
        assert NIL != stringp(example_count_noun_phrase) : "Types.stringp(example_count_noun_phrase) " + "CommonSymbols.NIL != Types.stringp(example_count_noun_phrase) " + example_count_noun_phrase;
        return example_count_noun_phrase;
    }

    public static SubLObject wni_example_mass_noun_phrase(final SubLObject sme_li_denotational, final SubLObject synset_word) {
        assert NIL != stringp(synset_word) : "Types.stringp(synset_word) " + "CommonSymbols.NIL != Types.stringp(synset_word) " + synset_word;
        SubLObject example_count_noun_phrase = methods.funcall_instance_method_with_5_args(sme_li_denotational, DERIVE_PART_OF_SPEECH_EXAMPLE, synset_word, list(synset_word), ZERO_INTEGER, $$MassNoun, $$Thing);
        if (NIL == example_count_noun_phrase) {
            example_count_noun_phrase = cconcatenate($str105$_, new SubLObject[]{ synset_word, $str108$_is_a_mass_noun_ });
        }
        assert NIL != stringp(example_count_noun_phrase) : "Types.stringp(example_count_noun_phrase) " + "CommonSymbols.NIL != Types.stringp(example_count_noun_phrase) " + example_count_noun_phrase;
        return example_count_noun_phrase;
    }

    public static SubLObject wni_new_words_input_internal(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term_name, final SubLObject workflow_alist, final SubLObject finishP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) " + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (((NIL != matched_term_name) && (!SubLSystemTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(matched_term_name))) {
            throw new AssertionError(matched_term_name);
        }
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != booleanp(finishP) : "Types.booleanp(finishP) " + "CommonSymbols.NIL != Types.booleanp(finishP) " + finishP;
        if (NIL == string_utilities.empty_string_p(matched_term_name)) {
            final SubLObject matched_term = czer_main.canonicalize_term_assert(cb_guess_term(matched_term_name, UNPROVIDED), UNPROVIDED);
            SubLObject comment = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                comment = kb_accessors.comment(matched_term, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            if (NIL != comment) {
                final SubLObject nowP = NIL;
                cb_wordnet_utilities.wni_complete_after_concept_match(synset, genl_terms, matched_term, workflow_alist, nowP);
                if (NIL != finishP) {
                    agenda.ensure_agenda_running();
                    cb_frames.cb_term_frame_internal(cb_term_identifier(matched_term));
                } else {
                    final SubLObject continue_this_workflow_itemP = list_utilities.alist_lookup(workflow_alist, $str19$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
                    if (NIL != continue_this_workflow_itemP) {
                        cb_wordnet_import_concept_match.wni_try_concept_match_internal(workflow_alist);
                    } else {
                        cb_wordnet_import_concept_match.wni_concept_match(UNPROVIDED);
                    }
                }
            } else {
                cb_wordnet_import_comment.wni_concept_comment_existing_term(list(synset, genl_terms, matched_term, workflow_alist));
            }
            return NIL;
        }
        cb_wordnet_import_concept_name.wni_concept_name(list(synset, genl_terms, workflow_alist));
        return NIL;
    }

    public static SubLObject wni_augment_workflow_alist_with_lexical_annotations(final SubLObject synset, final SubLObject args, SubLObject workflow_alist) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject cdolist_list_var;
        final SubLObject synset_words = cdolist_list_var = wordnet_import.wni_synset_words(synset);
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            key = cconcatenate(synset_word, $str45$_included);
            value = html_extract_input(key, args);
            if (NIL != value) {
                workflow_alist = cons(cons(key, value), workflow_alist);
            }
            key = cconcatenate(synset_word, $str50$_count_noun);
            value = html_extract_input(key, args);
            if (NIL != value) {
                workflow_alist = cons(cons(key, value), workflow_alist);
            }
            key = cconcatenate(synset_word, $str54$_formality);
            value = html_extract_input(key, args);
            workflow_alist = cons(cons(key, value), workflow_alist);
            key = cconcatenate(synset_word, $str69$_politeness);
            value = html_extract_input(key, args);
            workflow_alist = cons(cons(key, value), workflow_alist);
            key = cconcatenate(synset_word, $str76$_rhetorical_device);
            value = html_extract_input(key, args);
            workflow_alist = cons(cons(key, value), workflow_alist);
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        } 
        assert NIL != consp(workflow_alist) : "Types.consp(workflow_alist) " + "CommonSymbols.NIL != Types.consp(workflow_alist) " + workflow_alist;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        return workflow_alist;
    }

    public static SubLObject declare_cb_wordnet_import_new_words_file() {
        declareFunction(me, "wni_new_words", "WNI-NEW-WORDS", 1, 0, false);
        declareFunction(me, "wni_new_words_input", "WNI-NEW-WORDS-INPUT", 1, 0, false);
        declareFunction(me, "wni_new_words_internal", "WNI-NEW-WORDS-INTERNAL", 4, 0, false);
        declareFunction(me, "wni_likely_count_noun", "WNI-LIKELY-COUNT-NOUN", 1, 0, false);
        declareFunction(me, "wni_example_count_noun_phrase", "WNI-EXAMPLE-COUNT-NOUN-PHRASE", 2, 0, false);
        declareFunction(me, "wni_example_count_noun_phrase_when_headword_is_first", "WNI-EXAMPLE-COUNT-NOUN-PHRASE-WHEN-HEADWORD-IS-FIRST", 2, 0, false);
        declareFunction(me, "wni_example_mass_noun_phrase", "WNI-EXAMPLE-MASS-NOUN-PHRASE", 2, 0, false);
        declareFunction(me, "wni_new_words_input_internal", "WNI-NEW-WORDS-INPUT-INTERNAL", 5, 0, false);
        declareFunction(me, "wni_augment_workflow_alist_with_lexical_annotations", "WNI-AUGMENT-WORKFLOW-ALIST-WITH-LEXICAL-ANNOTATIONS", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_wordnet_import_new_words_file() {
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_new_words_file() {
        html_macros.note_cgi_handler_function(WNI_NEW_WORDS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_NEW_WORDS_INPUT, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_wordnet_import_new_words_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_wordnet_import_new_words_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_wordnet_import_new_words_file();
    }

    
}

/**
 * Total time: 556 ms synthetic
 */
