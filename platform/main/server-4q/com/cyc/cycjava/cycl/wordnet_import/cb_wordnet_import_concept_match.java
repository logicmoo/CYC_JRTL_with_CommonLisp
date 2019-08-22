package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.cb_parameters.*;
import static com.cyc.cycjava.cycl.cb_utilities.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.disjoint_with;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_wordnet_import_concept_match extends SubLTranslatedFile {
    public static final SubLFile me = new cb_wordnet_import_concept_match();

    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_import_concept_match";

    public static final String myFingerPrint = "e936ede720cd819b0f5abdcdde5fc648fa9452963f7f45df20a73ad41ae3262c";

    // defconstant
    // The default width for text inputs intended to contain CycL term genls.
    private static final SubLSymbol $wni_genls_input_width$ = makeSymbol("*WNI-GENLS-INPUT-WIDTH*");

    // defconstant
    // the synset note textarea width
    private static final SubLSymbol $wni_note_textarea_width$ = makeSymbol("*WNI-NOTE-TEXTAREA-WIDTH*");

    // defconstant
    // the synset note textarea height
    private static final SubLSymbol $wni_note_textarea_height$ = makeSymbol("*WNI-NOTE-TEXTAREA-HEIGHT*");

    private static final SubLObject $const0$WordNet2_0_KS = reader_make_constant_shell(makeString("WordNet2_0-KS"));

    public static final SubLString $str1$The_WordNet_knowledge_source_is_n = makeString("The WordNet knowledge source is not registered");

    public static final SubLString $str2$WordNet_Import___Concept_Match = makeString("WordNet Import - Concept Match");

    public static final SubLSymbol WNI_CONCEPT_MATCH = makeSymbol("WNI-CONCEPT-MATCH");



    private static final SubLString $str5$synset_id = makeString("synset-id");

    private static final SubLSymbol WNI_TRY_CONCEPT_MATCH = makeSymbol("WNI-TRY-CONCEPT-MATCH");



    private static final SubLString $str8$new_term = makeString("new-term");

    private static final SubLString $str9$new_term_genl = makeString("new-term-genl");

    private static final SubLString $str10$new_term_additional_genl = makeString("new-term-additional-genl");

    private static final SubLString $str11$genl_terms = makeString("genl-terms");

    private static final SubLString $str12$another_term_name = makeString("another-term-name");

    private static final SubLString $str13$Link_WN__Cyc = makeString("Link WN=>Cyc");

    private static final SubLString $str14$another_term = makeString("another-term");

    private static final SubLString $$$skip = makeString("skip");

    private static final SubLString $str16$synset_note = makeString("synset-note");

    private static final SubLString $str17$workflow_alist = makeString("workflow-alist");

    private static final SubLSymbol WNI_CONCEPT_MATCH_INPUT = makeSymbol("WNI-CONCEPT-MATCH-INPUT");

    private static final SubLObject $const19$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell(makeString("WordNetSynsetImportStatus-ReadyForPossibleMatching"));

    private static final SubLString $str20$The_WordNet_workflow_queue_is_emp = makeString("The WordNet workflow queue is empty.");

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$Situation = reader_make_constant_shell(makeString("Situation"));

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLString $str25$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");





    private static final SubLSymbol $CB_WORDNET_IMPORT_CONCEPT_MATCH = makeKeyword("CB-WORDNET-IMPORT-CONCEPT-MATCH");

    private static final SubLString $str29$cb_wordnet_import_concept_match_h = makeString("cb-wordnet-import-concept-match.html");



    private static final SubLString $str31$Review_the_proposed_Concept_Match = makeString("Review the proposed Concept Match for the ");

    private static final SubLString $$$_Synonym_Set__ = makeString(" Synonym Set  ");

    private static final SubLString $str33$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str34$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $str39$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str45$wni_concept_match_input = makeString("wni-concept-match-input");

    private static final SubLString $str46$_S = makeString("~S");

    private static final SubLString $$$WordNet_Mapping_Tool = makeString("WordNet Mapping Tool");

    private static final SubLString $str48$Dependent_synsets___ = makeString("Dependent synsets...");



    private static final SubLString $str50$Enter_an_additional_more_general_ = makeString("Enter an additional more general Cyc term for the ");

    private static final SubLString $$$Complete = makeString("Complete");

    private static final SubLString $str52$ = makeString("");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $str54$Choose_to_create_a_new_term_for_t = makeString("Choose to create a new term for the synset...");

    private static final SubLString $str55$1_ = makeString("1%");

    private static final SubLString $$$New_Term = makeString("New Term");

    private static final SubLString $str57$99_ = makeString("99%");

    private static final SubLString $str58$Enter_the_more_general_Cyc_term_f = makeString("Enter the more general Cyc term for the ");

    private static final SubLString $str59$or_accept_the_below_mapped_hypern = makeString("or accept the below mapped hypernum");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str62$OR_indicate_an_exact_match_to_an_ = makeString("OR indicate an exact match to an existing Cyc term...");





    private static final SubLString $str65$Enter_the_matching_Cyc_term_for_t = makeString("Enter the matching Cyc term for the ");

    private static final SubLString $str66$For_candidates__see_ = makeString("For candidates, see ");

    private static final SubLString $str67$cg_cb_lq_ = makeString("cg?cb-lq&");

    private static final SubLString $str68$_2_ = makeString("&2&");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $str70$_main = makeString("_main");

    private static final SubLString $$$more_specific_terms = makeString("more specific terms");

    private static final SubLString $$$_for_ = makeString(" for ");







    private static final SubLString $$$_or_ = makeString(" or ");

    private static final SubLString $str77$cg_cb_start = makeString("cg?cb-start");

    private static final SubLString $str78$_new = makeString("_new");

    private static final SubLString $$$browse = makeString("browse");

    private static final SubLString $str80$_the_Cyc_KB_in_a_separate_window_ = makeString(" the Cyc KB in a separate window.");

    private static final SubLString $$$Skip_this_synset = makeString("Skip this synset");

    private static final SubLString $str82$Add_a_note_to_this_synset__option = makeString("Add a note to this synset (optional)");

    private static final SubLString $$$virtual = makeString("virtual");

    private static final SubLString $str84$Review_the_proposed_Concept_Match = makeString("Review the proposed Concept Match for the Synonym Set");

    private static final SubLString $$$No_synsets_for_matching = makeString("No synsets for matching");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $$$back = makeString("back");







    private static final SubLObject $$WordNetSynsetImportStatus_Skip = reader_make_constant_shell(makeString("WordNetSynsetImportStatus-Skip"));

    public static final SubLString $str92$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and make a selection choice.");

    public static final SubLString $str93$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and enter a well-formed matching Cyc term.");

    public static final SubLString $str94$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and enter a well-formed general Cyc term.");

    public static final SubLString $str95$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and enter a well-formed additional more general Cyc term.");

    public static final SubLString $str96$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and and specify a valid existing term.");

    public static final SubLString $str97$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and correctly specify the more general Cyc term.");

    public static final SubLString $str98$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and and specify a valid more general term.");

    public static final SubLString $str99$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and correctly specify the additional more general Cyc term.");

    private static final SubLString $str100$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and correct the disjoint more general Cyc terms.");

    private static final SubLString $str101$Please_use_the_browser_back_funct = makeString("Please use the browser back function, and and specify a valid Cyc constant.");



    private static final SubLString $str103$in_workflow_ = makeString("in-workflow?");

    private static final SubLString $$$t = makeString("t");

    public static SubLObject wni_concept_match(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const0$WordNet2_0_KS, UNPROVIDED)) {
            cb_error($str1$The_WordNet_knowledge_source_is_n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        wordnet_import.wni_clear_function_caches();
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str2$WordNet_Import___Concept_Match);
        } else {
            wni_concept_match_internal();
        }
        return NIL;
    }

    public static SubLObject wni_try_concept_match(final SubLObject args) {
        if (NIL == sksi_infrastructure_utilities.sk_source_registeredP($const0$WordNet2_0_KS, UNPROVIDED)) {
            cb_error($str1$The_WordNet_knowledge_source_is_n, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != ke.cyclist_is_guest()) {
            cyc_navigator_internals.guest_warn($str2$WordNet_Import___Concept_Match);
        } else {
            final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str5$synset_id, args));
            final SubLObject unmapped_hypernym_chain = wordnet_import.wni_unmapped_hypernym_chain(synset);
            final SubLObject workflow_alist = wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(unmapped_hypernym_chain, NIL);
            wni_try_concept_match_internal(workflow_alist);
        }
        return NIL;
    }

    public static SubLObject wni_concept_match_input(final SubLObject args) {
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
        final SubLObject synset = wordnet_import.wni_reifiable_synset_from_string(html_extract_input($str5$synset_id, args));
        final SubLObject new_termP = list_utilities.sublisp_boolean(html_extract_input($str8$new_term, args));
        final SubLObject new_term_genl_name = html_extract_input($str9$new_term_genl, args);
        final SubLObject new_term_additional_genl_name = html_extract_input($str10$new_term_additional_genl, args);
        final SubLObject genl_terms_string = html_extract_input($str11$genl_terms, args);
        final SubLObject genl_terms = (NIL != genl_terms_string) ? cb_wordnet_utilities.wni_decode_terms_from_hidden_input(genl_terms_string) : NIL;
        final SubLObject another_term_name = html_extract_input($str12$another_term_name, args);
        final SubLObject matched_term_id_string = html_extract_button_value($str13$Link_WN__Cyc, args, UNPROVIDED);
        final SubLObject matched_term = ((NIL != matched_term_id_string) && (NIL == Strings.stringE(matched_term_id_string, $str14$another_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? cb_wordnet_utilities.wni_identifier_to_fort(matched_term_id_string) : NIL;
        final SubLObject skip_this_synsetP = list_utilities.sublisp_boolean(html_extract_input($$$skip, args));
        final SubLObject synset_note = html_extract_input($str16$synset_note, args);
        final SubLObject workflow_alist_string = html_extract_input($str17$workflow_alist, args);
        final SubLObject workflow_alist = (NIL != workflow_alist_string) ? read_from_string(workflow_alist_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        wni_concept_match_input_internal(synset, new_termP, new_term_genl_name, new_term_additional_genl_name, genl_terms, another_term_name, matched_term, skip_this_synsetP, synset_note, workflow_alist);
        return NIL;
    }

    public static SubLObject wni_concept_match_internal() {
        final SubLObject synset = wordnet_import.wni_next_synset_with_status($const19$WordNetSynsetImportStatus_ReadyFo);
        if (NIL == synset) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str20$The_WordNet_workflow_queue_is_emp);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            agenda.ensure_agenda_running();
            return NIL;
        }
        final SubLObject pos = wordnet_import.wni_synset_pos(synset);
        SubLObject dependent_synsets = wordnet_import.wni_unmapped_hypernym_chain(synset);
        if (pos.eql($$Verb)) {
            SubLObject derivationally_related_synsets = NIL;
            SubLObject derivationally_related_noun_synsets = NIL;
            SubLObject derivationally_related_adj_adv_synsets = NIL;
            SubLObject cdolist_list_var;
            derivationally_related_synsets = cdolist_list_var = wordnet_import.wni_derived_forms(synset);
            SubLObject derivationally_related_synset = NIL;
            derivationally_related_synset = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ($$Noun.eql(wordnet_import.wni_synset_pos(derivationally_related_synset))) {
                    if (NIL != genls.any_specP($$Situation, wordnet_import.wni_hypernym_terms(derivationally_related_synset), UNPROVIDED, UNPROVIDED)) {
                        derivationally_related_noun_synsets = cons(derivationally_related_synset, derivationally_related_noun_synsets);
                    }
                } else {
                    derivationally_related_adj_adv_synsets = cons(derivationally_related_synset, derivationally_related_adj_adv_synsets);
                }
                cdolist_list_var = cdolist_list_var.rest();
                derivationally_related_synset = cdolist_list_var.first();
            } 
            cdolist_list_var = derivationally_related_noun_synsets;
            SubLObject derivationally_related_noun_synset = NIL;
            derivationally_related_noun_synset = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dependent_synsets = append(wordnet_import.wni_unmapped_hypernym_chain(derivationally_related_noun_synset), dependent_synsets);
                cdolist_list_var = cdolist_list_var.rest();
                derivationally_related_noun_synset = cdolist_list_var.first();
            } 
            cdolist_list_var = derivationally_related_adj_adv_synsets;
            SubLObject derivationally_related_adj_adv_synset = NIL;
            derivationally_related_adj_adv_synset = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                dependent_synsets = append(wordnet_import.wni_unmapped_hypernym_chain(derivationally_related_adj_adv_synset), dependent_synsets);
                cdolist_list_var = cdolist_list_var.rest();
                derivationally_related_adj_adv_synset = cdolist_list_var.first();
            } 
            dependent_synsets = list_utilities.add_to_end(synset, dependent_synsets);
        }
        if (NIL == list_utilities.singletonP(dependent_synsets)) {
            SubLObject cdolist_list_var2 = dependent_synsets;
            SubLObject dependent_synset = NIL;
            dependent_synset = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                wordnet_import.wni_delete_concept_match_html(dependent_synset);
                cdolist_list_var2 = cdolist_list_var2.rest();
                dependent_synset = cdolist_list_var2.first();
            } 
        }
        return wni_try_concept_match_internal(wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(dependent_synsets, T));
    }

    public static SubLObject wni_try_concept_match_internal(SubLObject workflow_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject list_var;
        final SubLObject unmapped_hypernym_chain = list_var = list_utilities.alist_lookup(workflow_alist, $str25$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != narts_high.naut_p(elem) : "narts_high.naut_p(elem) " + "CommonSymbols.NIL != narts_high.naut_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject synset = unmapped_hypernym_chain.first();
        final SubLObject remaining_unmapped_hypernym_chain = unmapped_hypernym_chain.rest();
        if (NIL == synset) {
            wni_no_synsets_for_matching();
            return NIL;
        }
        if (NIL != remaining_unmapped_hypernym_chain) {
            workflow_alist = list_utilities.alist_enter(workflow_alist, $str25$unmapped_hypernym_chain, remaining_unmapped_hypernym_chain, EQUAL);
        } else {
            workflow_alist = list_utilities.alist_delete(workflow_alist, $str25$unmapped_hypernym_chain, EQUAL);
        }
        wordnet_import.wni_lock_synset(synset);
        final SubLObject html_string = wordnet_import.wni_select_concept_match_html(synset);
        if ((NIL == workflow_alist) && (NIL != html_string)) {
            princ(html_string, html_macros.$html_stream$.getDynamicValue(thread));
        } else {
            wni_concept_match_html(synset, workflow_alist);
        }
        agenda.ensure_agenda_running();
        return NIL;
    }

    public static SubLObject wni_concept_match_html(SubLObject synset, SubLObject workflow_alist) {
        if (workflow_alist == UNPROVIDED) {
            workflow_alist = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        if (((NIL != workflow_alist) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == list_utilities.alist_p(workflow_alist))) {
            throw new AssertionError(workflow_alist);
        }
        synset = wordnet_import.wni_ensure_naut(synset);
        SubLObject candidate_terms = NIL;
        if (NIL == synset) {
            wni_no_synsets_for_matching();
            return NIL;
        }
        wordnet_import.clear_wni_broader_terms();
        candidate_terms = wordnet_import.wni_gather_terms_for_matching(synset);
        final SubLObject pos_desc = assoc(wordnet_import.wni_synset_pos(synset), wordnet_import.$wni_pos_map$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest();
        final SubLObject title = cconcatenate($str31$Review_the_proposed_Concept_Match, new SubLObject[]{ pos_desc, $$$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) });
        SubLObject bgcolor = html_macros.$html_color_white$.getGlobalValue();
        SubLObject any_hypernymP = NIL;
        final SubLObject synset_note = wordnet_import.wni_synset_note(synset);
        SubLObject mapped_hypernym_term = NIL;
        SubLObject genl_terms = NIL;
        final SubLObject unmapped_hypernym_chain = list_utilities.alist_lookup(workflow_alist, $str25$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
        final SubLObject title_var = title;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str33$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str34$_meta_http_equiv__X_UA_Compatible);
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
                    html_markup($str39$yui_skin_sam);
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
                            html_hidden_input($str45$wni_concept_match_input, T, UNPROVIDED);
                            html_hidden_input($str5$synset_id, string_utilities.to_string(wordnet_import.wni_synset_id(synset)), UNPROVIDED);
                            if (NIL != workflow_alist) {
                                html_hidden_input($str17$workflow_alist, format(NIL, $str46$_S, workflow_alist), UNPROVIDED);
                            }
                            cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_MATCH, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$WordNet_Mapping_Tool);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            if (NIL != unmapped_hypernym_chain) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str48$Dependent_synsets___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject cdolist_list_var = unmapped_hypernym_chain;
                                    SubLObject unmapped_hypernym = NIL;
                                    unmapped_hypernym = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
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
                                                final SubLObject terms = wordnet_import.wni_hypernym_terms(unmapped_hypernym);
                                                if (NIL != terms) {
                                                    SubLObject cdolist_list_var_$9 = terms;
                                                    SubLObject v_term = NIL;
                                                    v_term = cdolist_list_var_$9.first();
                                                    while (NIL != cdolist_list_var_$9) {
                                                        cb_wordnet_utilities.wni_html_termXcomment(v_term, NIL);
                                                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                                        v_term = cdolist_list_var_$9.first();
                                                    } 
                                                    cb_wordnet_utilities.wni_html_up_arrow($HYPERNYM);
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
                                                            html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                html_indent(TWO_INTEGER);
                                                            } finally {
                                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$11, thread);
                                                            }
                                                            html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                            html_char(CHAR_greater, UNPROVIDED);
                                                            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
                                                            try {
                                                                html_macros.$html_safe_print$.bind(T, thread);
                                                                cb_wordnet_utilities.wni_html_synset_words_gloss_examples(unmapped_hypernym, NIL, UNPROVIDED);
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
                                                } else {
                                                    cb_wordnet_utilities.wni_html_synset_words_gloss_examples(unmapped_hypernym, NIL, UNPROVIDED);
                                                }
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$8, thread);
                                            }
                                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                                        }
                                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                        html_source_readability_terpri(UNPROVIDED);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        unmapped_hypernym = cdolist_list_var.first();
                                    } 
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                                }
                                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                html_newline(UNPROVIDED);
                            }
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                            html_princ(cconcatenate($str50$Enter_an_additional_more_general_, new SubLObject[]{ pos_desc, $$$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) }));
                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_complete.html_complete_button($str10$new_term_additional_genl, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_text_input($str10$new_term_additional_genl, $str52$, $int$60);
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str54$Choose_to_create_a_new_term_for_t);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str55$1_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_submit_input($$$New_Term, $str8$new_term, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str57$99_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                            html_princ(cconcatenate($str58$Enter_the_more_general_Cyc_term_f, new SubLObject[]{ pos_desc, $$$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) }));
                                            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                            html_newline(UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                            html_complete.html_complete_button($str9$new_term_genl, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            html_text_input($str9$new_term_genl, $str52$, $int$60);
                                            html_newline(UNPROVIDED);
                                            SubLObject cdolist_list_var2 = wordnet_import.wni_hypernyms(synset);
                                            SubLObject hypernym = NIL;
                                            hypernym = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                if (NIL == any_hypernymP) {
                                                    html_newline(UNPROVIDED);
                                                    html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                    html_princ($str59$or_accept_the_below_mapped_hypern);
                                                    html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                }
                                                any_hypernymP = T;
                                                mapped_hypernym_term = wordnet_import.wni_synset_term(hypernym);
                                                if ((NIL != mapped_hypernym_term) && (NIL == isa.isaP(mapped_hypernym_term, $$Relation, $$EverythingPSC, UNPROVIDED))) {
                                                    genl_terms = cons(mapped_hypernym_term, genl_terms);
                                                    cb_wordnet_utilities.wni_html_termXcomment(mapped_hypernym_term, T);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                hypernym = cdolist_list_var2.first();
                                            } 
                                            cb_wordnet_utilities.wni_html_up_arrow($HYPERNYM);
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
                                            final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_wordnet_utilities.wni_html_synset_words_gloss_examples(synset, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str62$OR_indicate_an_exact_match_to_an_);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ONE_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject cdolist_list_var = candidate_terms;
                                SubLObject candidate_term = NIL;
                                candidate_term = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    if (NIL != bgcolor) {
                                        html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(bgcolor);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        bgcolor = (bgcolor.eql(html_macros.$html_color_white$.getGlobalValue())) ? html_macros.$html_color_lightest_grey$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str55$1_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_submit_input($str13$Link_WN__Cyc, cb_fort_identifier(candidate_term), UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup($str57$99_);
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            SubLObject cdolist_list_var_$10 = wordnet_import.wni_broader_terms(candidate_term);
                                            SubLObject candidate_term_genl = NIL;
                                            candidate_term_genl = cdolist_list_var_$10.first();
                                            while (NIL != cdolist_list_var_$10) {
                                                cb_wordnet_utilities.wni_html_termXcomment(candidate_term_genl, NIL);
                                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                                candidate_term_genl = cdolist_list_var_$10.first();
                                            } 
                                            cb_wordnet_utilities.wni_html_up_arrow(NIL != fort_types_interface.collectionP(candidate_term) ? $GENLS : $ISA);
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
                                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_indent(TWO_INTEGER);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        cb_wordnet_utilities.wni_html_termXcomment(candidate_term, T);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                                    }
                                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                                }
                                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                                html_source_readability_terpri(UNPROVIDED);
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                            }
                                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    candidate_term = cdolist_list_var.first();
                                } 
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                if (NIL != bgcolor) {
                                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(bgcolor);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    bgcolor = (bgcolor.eql(html_macros.$html_color_white$.getGlobalValue())) ? html_macros.$html_color_lightest_grey$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str55$1_);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_submit_input($str13$Link_WN__Cyc, $str14$another_term, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($str57$99_);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding(thread);
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
                                        final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                            html_char(CHAR_greater, UNPROVIDED);
                                            final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                                            try {
                                                html_macros.$html_safe_print$.bind(T, thread);
                                                html_markup(html_macros.$html_table_header_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_indent(TWO_INTEGER);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$35, thread);
                                                }
                                                html_markup(html_macros.$html_table_header_tail$.getGlobalValue());
                                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                                html_char(CHAR_greater, UNPROVIDED);
                                                final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding(thread);
                                                try {
                                                    html_macros.$html_safe_print$.bind(T, thread);
                                                    html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                                    html_princ(cconcatenate($str65$Enter_the_matching_Cyc_term_for_t, new SubLObject[]{ pos_desc, $$$_Synonym_Set__, wordnet_import.wni_synset_wXo_links(synset) }));
                                                    html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_complete.html_complete_button($str12$another_term_name, $$$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_text_input($str12$another_term_name, $str52$, $int$60);
                                                    html_newline(UNPROVIDED);
                                                    html_newline(UNPROVIDED);
                                                    html_princ($str66$For_candidates__see_);
                                                    if (NIL != mapped_hypernym_term) {
                                                        final SubLObject url = cconcatenate($str67$cg_cb_lq_, new SubLObject[]{ cb_fort_identifier(mapped_hypernym_term), $str68$_2_, cb_fort_identifier($$genls) });
                                                        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(url);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_markup($str70$_main);
                                                        html_char(CHAR_quotation, UNPROVIDED);
                                                        html_char(CHAR_greater, UNPROVIDED);
                                                        final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
                                                        try {
                                                            html_macros.$html_safe_print$.bind(T, thread);
                                                            html_princ($$$more_specific_terms);
                                                        } finally {
                                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
                                                        }
                                                        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                        html_princ($$$_for_);
                                                        if (NIL != constant_p(mapped_hypernym_term)) {
                                                            cb_link($CONSTANT, mapped_hypernym_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        } else
                                                            if (NIL != nart_handles.nart_p(mapped_hypernym_term)) {
                                                                cb_link($NART, mapped_hypernym_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            } else
                                                                if (NIL != narts_high.naut_p(mapped_hypernym_term)) {
                                                                    cb_link($NAUT, mapped_hypernym_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }


                                                        html_princ($$$_or_);
                                                    }
                                                    html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                                    html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str77$cg_cb_start);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_markup($str78$_new);
                                                    html_char(CHAR_quotation, UNPROVIDED);
                                                    html_char(CHAR_greater, UNPROVIDED);
                                                    final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                                                    try {
                                                        html_macros.$html_safe_print$.bind(T, thread);
                                                        html_princ($$$browse);
                                                    } finally {
                                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                                                    }
                                                    html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                                    html_princ($str80$_the_Cyc_KB_in_a_separate_window_);
                                                } finally {
                                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$36, thread);
                                                }
                                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                            } finally {
                                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                                            }
                                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                            html_source_readability_terpri(UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$33, thread);
                                        }
                                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$32, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_submit_input($$$Skip_this_synset, $$$skip, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($str82$Add_a_note_to_this_synset__option);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                            html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str16$synset_note);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != $wni_note_textarea_width$.getGlobalValue()) {
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($wni_note_textarea_width$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            if (NIL != $wni_note_textarea_height$.getGlobalValue()) {
                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($wni_note_textarea_height$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$virtual);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_princ(synset_note);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                            }
                            html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_hidden_input($str11$genl_terms, cb_wordnet_utilities.wni_encode_terms_for_hidden_input(genl_terms), UNPROVIDED);
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

    public static SubLObject wni_no_synsets_for_matching() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $str84$Review_the_proposed_Concept_Match;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str33$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str34$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$42 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
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
                final SubLObject _prev_bind_0_$43 = html_macros.$html_inside_bodyP$.currentBinding(thread);
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
                    html_markup($str39$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
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
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
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
                        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str45$wni_concept_match_input, T, UNPROVIDED);
                            html_markup(html_macros.$html_big_head$.getGlobalValue());
                            html_markup(html_macros.$html_strong_head$.getGlobalValue());
                            html_princ($$$No_synsets_for_matching);
                            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_help_preamble($CB_WORDNET_IMPORT_CONCEPT_MATCH, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            html_submit_input($$$Back, $$$back, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$43, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$42, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject wni_concept_match_input_internal(final SubLObject synset, final SubLObject new_termP, final SubLObject new_term_genl_name, final SubLObject new_term_additional_genl_name, SubLObject genl_terms, final SubLObject another_term_name, SubLObject matched_term, final SubLObject skip_this_synsetP, SubLObject synset_note, final SubLObject workflow_alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(new_termP) : "Types.booleanp(new_termP) " + "CommonSymbols.NIL != Types.booleanp(new_termP) " + new_termP;
        if (((NIL != new_term_genl_name) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(new_term_genl_name))) {
            throw new AssertionError(new_term_genl_name);
        }
        if (((NIL != new_term_additional_genl_name) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(new_term_additional_genl_name))) {
            throw new AssertionError(new_term_additional_genl_name);
        }
        assert NIL != listp(genl_terms) : "Types.listp(genl_terms) " + "CommonSymbols.NIL != Types.listp(genl_terms) " + genl_terms;
        if (((NIL != another_term_name) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(another_term_name))) {
            throw new AssertionError(another_term_name);
        }
        if (((NIL != matched_term) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(matched_term))) {
            throw new AssertionError(matched_term);
        }
        assert NIL != booleanp(skip_this_synsetP) : "Types.booleanp(skip_this_synsetP) " + "CommonSymbols.NIL != Types.booleanp(skip_this_synsetP) " + skip_this_synsetP;
        if (((NIL != synset_note) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(synset_note))) {
            throw new AssertionError(synset_note);
        }
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        final SubLObject existing_synset_note = wordnet_import.wni_synset_note(synset);
        if (NIL == synset_note) {
            synset_note = $str52$;
        }
        if (((NIL == existing_synset_note) || (NIL == synset_note)) || (NIL == Strings.stringE(existing_synset_note, synset_note, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            if ((NIL == string_utilities.empty_string_p(existing_synset_note)) && (NIL == string_utilities.empty_string_p(synset_note))) {
                wordnet_import.wni_unassert_synset_note(synset, existing_synset_note);
                wordnet_import.wni_assert_synset_note(synset, synset_note);
            } else
                if ((NIL == string_utilities.empty_string_p(existing_synset_note)) && (NIL != string_utilities.empty_string_p(synset_note))) {
                    wordnet_import.wni_unassert_synset_note(synset, existing_synset_note);
                } else
                    if (NIL == string_utilities.empty_string_p(synset_note)) {
                        wordnet_import.wni_assert_synset_note(synset, synset_note);
                    }


        }
        if (NIL != skip_this_synsetP) {
            wordnet_import.wni_unassert_import_status($const19$WordNetSynsetImportStatus_ReadyFo, synset, T);
            wordnet_import.wni_assert_import_status($$WordNetSynsetImportStatus_Skip, synset, T);
            wordnet_import.wni_unlock_synset(synset, T);
            wni_concept_match_internal();
            return NIL;
        }
        if (((NIL == new_termP) && (NIL != string_utilities.empty_string_p(another_term_name))) && (NIL == matched_term)) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str92$Please_use_the_browser_back_funct);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            return NIL;
        }
        SubLObject new_term_genl = NIL;
        SubLObject new_term_additional_genl = NIL;
        if ((NIL == string_utilities.empty_string_p(another_term_name)) && (NIL == wni_valid_fort_from_name(another_term_name))) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str93$Please_use_the_browser_back_funct);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            return NIL;
        }
        if (NIL == string_utilities.empty_string_p(new_term_genl_name)) {
            new_term_genl = wni_valid_fort_from_name(new_term_genl_name);
            if (NIL == new_term_genl) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str94$Please_use_the_browser_back_funct);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return NIL;
            }
        }
        if (NIL == string_utilities.empty_string_p(new_term_additional_genl_name)) {
            new_term_additional_genl = wni_valid_fort_from_name(new_term_additional_genl_name);
            if (NIL == new_term_additional_genl) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str95$Please_use_the_browser_back_funct);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return NIL;
            }
        }
        if ((NIL == string_utilities.empty_string_p(another_term_name)) && (NIL == another_term_name)) {
            html_markup(html_macros.$html_big_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            html_princ($str96$Please_use_the_browser_back_funct);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_big_tail$.getGlobalValue());
            return NIL;
        }
        if (NIL != new_termP) {
            if (NIL == string_utilities.empty_string_p(new_term_genl_name)) {
                if (NIL == wni_valid_genl_for_synsetP(new_term_genl, synset)) {
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str97$Please_use_the_browser_back_funct);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    return NIL;
                }
                genl_terms = list(new_term_genl);
            }
            if (NIL == genl_terms) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str98$Please_use_the_browser_back_funct);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return NIL;
            }
            if (NIL == string_utilities.empty_string_p(new_term_additional_genl_name)) {
                if (NIL == wni_valid_genl_for_synsetP(new_term_additional_genl, synset)) {
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str99$Please_use_the_browser_back_funct);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    return NIL;
                }
                final SubLObject item_var = new_term_additional_genl;
                if (NIL == member(item_var, genl_terms, symbol_function(EQL), symbol_function(IDENTITY))) {
                    genl_terms = cons(item_var, genl_terms);
                }
            }
            if (NIL != disjoint_with.any_disjoint_collection_pairP(NIL != matched_term ? append(list(matched_term), genl_terms) : genl_terms, UNPROVIDED)) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str100$Please_use_the_browser_back_funct);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return NIL;
            }
            if (NIL != wordnet_import.wni_synset_collectionP(synset)) {
                cb_wordnet_import_new_words.wni_new_words(list(synset, genl_terms, NIL, workflow_alist));
            } else {
                cb_wordnet_import_concept_name.wni_concept_name(list(synset, genl_terms, workflow_alist));
            }
            return NIL;
        } else {
            SubLObject matched_term_name = NIL;
            if (NIL != matched_term) {
                matched_term_name = cb_string_for_fort(matched_term);
            } else
                if (NIL == string_utilities.empty_string_p(another_term_name)) {
                    matched_term_name = another_term_name;
                    matched_term = czer_main.canonicalize_term(cb_guess_term(matched_term_name, UNPROVIDED), UNPROVIDED);
                }

            if (NIL == matched_term_name) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str101$Please_use_the_browser_back_funct);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return NIL;
            }
            genl_terms = NIL;
            if (NIL != string_utilities.empty_string_p(new_term_additional_genl_name)) {
                if (NIL != matched_term) {
                    genl_terms = (NIL != fort_types_interface.collectionP(matched_term)) ? genls.genls(matched_term, UNPROVIDED, UNPROVIDED) : isa.isa(matched_term, UNPROVIDED, UNPROVIDED);
                }
            } else {
                if (NIL == wni_valid_genl_for_synsetP(new_term_additional_genl, synset)) {
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                    html_princ($str99$Please_use_the_browser_back_funct);
                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    return NIL;
                }
                genl_terms = list(new_term_additional_genl);
            }
            if (NIL != disjoint_with.any_disjoint_collection_pairP(NIL != matched_term ? append(list(matched_term), genl_terms) : genl_terms, UNPROVIDED)) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ($str100$Please_use_the_browser_back_funct);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                return NIL;
            }
            if (NIL != wordnet_import.wni_synset_collectionP(synset)) {
                cb_wordnet_import_new_words.wni_new_words(list(synset, genl_terms, matched_term_name, workflow_alist));
            } else {
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
                    cb_wordnet_utilities.wni_complete_after_concept_match(synset, genl_terms, matched_term, workflow_alist, NIL);
                } else {
                    cb_wordnet_import_comment.wni_concept_comment_existing_term(list(synset, genl_terms, matched_term, workflow_alist));
                }
                final SubLObject unmapped_hypernym_chain = list_utilities.alist_lookup(workflow_alist, $str25$unmapped_hypernym_chain, EQUAL, UNPROVIDED);
                final SubLObject in_workflowP = Strings.stringE(list_utilities.alist_lookup(workflow_alist, $str103$in_workflow_, EQUAL, UNPROVIDED), $$$t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != unmapped_hypernym_chain) {
                    wni_try_concept_match_internal(wordnet_import.wni_create_workflow_alist_with_unmapped_hypernym_chain(unmapped_hypernym_chain, in_workflowP));
                } else
                    if (NIL != in_workflowP) {
                        wni_concept_match(UNPROVIDED);
                    } else {
                        cb_frames.cb_term_frame_internal(cb_term_identifier(matched_term));
                    }

            }
            agenda.ensure_agenda_running();
            return NIL;
        }
    }

    public static SubLObject wni_valid_genl_for_synsetP(final SubLObject genl_term, final SubLObject synset) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        if (((NIL == genl_term) || (NIL == forts.fort_p(genl_term))) || (NIL == fort_types_interface.collectionP(genl_term))) {
            return NIL;
        }
        if (wordnet_import.wni_synset_pos(synset).eql($$Verb) && (NIL == genls.genlsP(genl_term, $$Situation, UNPROVIDED, UNPROVIDED))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject wni_valid_fort_from_name(final SubLObject term_name) {
        SubLObject v_term = czer_main.canonicalize_term(cb_guess_term(term_name, UNPROVIDED), UNPROVIDED);
        if (NIL == v_term) {
            return NIL;
        }
        if (NIL != forts.fort_p(v_term)) {
            return v_term;
        }
        if (v_term.isCons() && (NIL != wff.el_wftP(v_term, UNPROVIDED, UNPROVIDED))) {
            v_term = wordnet_import.wni_assert_term_of_unit(v_term);
        } else {
            v_term = NIL;
        }
        if (((NIL != v_term) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == forts.fort_p(v_term))) {
            throw new AssertionError(v_term);
        }
        return v_term;
    }

    public static SubLObject declare_cb_wordnet_import_concept_match_file() {
        declareFunction(me, "wni_concept_match", "WNI-CONCEPT-MATCH", 0, 1, false);
        declareFunction(me, "wni_try_concept_match", "WNI-TRY-CONCEPT-MATCH", 1, 0, false);
        declareFunction(me, "wni_concept_match_input", "WNI-CONCEPT-MATCH-INPUT", 1, 0, false);
        declareFunction(me, "wni_concept_match_internal", "WNI-CONCEPT-MATCH-INTERNAL", 0, 0, false);
        declareFunction(me, "wni_try_concept_match_internal", "WNI-TRY-CONCEPT-MATCH-INTERNAL", 1, 0, false);
        declareFunction(me, "wni_concept_match_html", "WNI-CONCEPT-MATCH-HTML", 1, 1, false);
        declareFunction(me, "wni_no_synsets_for_matching", "WNI-NO-SYNSETS-FOR-MATCHING", 0, 0, false);
        declareFunction(me, "wni_concept_match_input_internal", "WNI-CONCEPT-MATCH-INPUT-INTERNAL", 10, 0, false);
        declareFunction(me, "wni_valid_genl_for_synsetP", "WNI-VALID-GENL-FOR-SYNSET?", 2, 0, false);
        declareFunction(me, "wni_valid_fort_from_name", "WNI-VALID-FORT-FROM-NAME", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_wordnet_import_concept_match_file() {
        defconstant("*WNI-GENLS-INPUT-WIDTH*", $int$80);
        defconstant("*WNI-NOTE-TEXTAREA-WIDTH*", $int$80);
        defconstant("*WNI-NOTE-TEXTAREA-HEIGHT*", FIVE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_import_concept_match_file() {
        html_macros.note_cgi_handler_function(WNI_CONCEPT_MATCH, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_TRY_CONCEPT_MATCH, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(WNI_CONCEPT_MATCH_INPUT, $HTML_HANDLER);
        sethash($CB_WORDNET_IMPORT_CONCEPT_MATCH, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str29$cb_wordnet_import_concept_match_h, NIL));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_wordnet_import_concept_match_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_wordnet_import_concept_match_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_wordnet_import_concept_match_file();
    }

    
}

/**
 * Total time: 1858 ms synthetic
 */
