package com.cyc.cycjava.cycl.wordnet_import;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_constant_id_prefix$;
import static com.cyc.cycjava.cycl.cb_utilities.$cb_nart_id_prefix$;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_cycl_string;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_wordnet_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new cb_wordnet_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities";

    public static final String myFingerPrint = "c8a120ceba52b78ab069c6f4fb4e4dbdb3c7ca7c51ff83fad71e4694fd423286";



    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("WordNet2_0-KS")));

    private static final SubLSymbol $WN_SKS_REGISTERED = makeKeyword("WN-SKS-REGISTERED");

    public static final SubLSymbol $sym3$WNI_HTML_TERM_COMMENT = makeSymbol("WNI-HTML-TERM&COMMENT");







    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLString $str9$__ = makeString(": ");

    public static final SubLSymbol WNI_HTML_UP_ARROW = makeSymbol("WNI-HTML-UP-ARROW");



    public static final SubLList $list12 = list(makeKeyword("GENLS"), makeKeyword("ISA"), makeKeyword("HYPERNYM"));

    public static final SubLString $str13$_A_is_an_invalid_arrow_type = makeString("~A is an invalid arrow-type");

    public static final SubLString $str14$_cycdoc_img_cyc_arrow_up_big_gif = makeString("/cycdoc/img/cyc-arrow-up-big.gif");

    public static final SubLString $str15$_Indicates_the_more_general_conce = makeString("[Indicates the more general concept]");

    public static final SubLString $$$top = makeString("top");

    public static final SubLString $$$0 = makeString("0");



    public static final SubLString $$$genls = makeString("genls");



    public static final SubLString $$$isa = makeString("isa");

    public static final SubLString $$$hypernym = makeString("hypernym");

    public static final SubLSymbol WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES = makeSymbol("WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES");



    public static final SubLString $str25$___ = makeString("; \"");

    public static final SubLString $str26$_ = makeString("\"");

    public static final SubLSymbol WNI_SYNSET_LINKS = makeSymbol("WNI-SYNSET-LINKS");

    public static final SubLString $str28$_ = makeString("(");

    public static final SubLString $str29$___ = makeString(" | ");

    public static final SubLString $str30$http___www_cogsci_princeton_edu_c = makeString("http://www.cogsci.princeton.edu/cgi-bin/webwn2.0?stage=1&amp;word=");

    public static final SubLString $str31$_ = makeString("+");

    public static final SubLString $$$_ = makeString(" ");

    public static final SubLString $$$main = makeString("main");

    public static final SubLString $str34$_ = makeString(")");

    public static final SubLSymbol WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER = makeSymbol("WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER");

    public static final SubLString $str36$____ = makeString("--->");

    public static final SubLString $$$hypernym_linked_to_ = makeString("hypernym linked to ");

    public static final SubLString $$$Add = makeString("Add");

    public static final SubLString $$$not_linked_ = makeString("not linked ");

    public static final SubLSymbol WNI_SYNSET_LINKS_FOR_CB_BROWSER = makeSymbol("WNI-SYNSET-LINKS-FOR-CB-BROWSER");

    public static final SubLString $str41$_cycdoc_img_cb_wordnet_browser_gi = makeString("/cycdoc/img/cb/wordnet-browser.gif");

    public static final SubLString $str42$_WordNet_ = makeString("[WordNet]");

    public static final SubLString $str43$__ = makeString(" (");

    public static final SubLString $str44$cg_cb_handle_specify_query_ = makeString("cg?cb-handle-specify&query=");

    public static final SubLSymbol WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT = makeSymbol("WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT");



    public static final SubLString $str47$ = makeString("");



    public static final SubLSymbol WNI_DECODE_TERMS_FROM_HIDDEN_INPUT = makeSymbol("WNI-DECODE-TERMS-FROM-HIDDEN-INPUT");

    public static final SubLSymbol NOT_TEST_CHAR = makeSymbol("NOT-TEST-CHAR");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    public static final SubLSymbol WNI_IDENTIFIER_TO_FORT = makeSymbol("WNI-IDENTIFIER-TO-FORT");

    public static final SubLSymbol WNI_STRING_SYNSET_TERM_MATCHES = makeSymbol("WNI-STRING-SYNSET-TERM-MATCHES");

    public static final SubLSymbol $sym56$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");

    public static final SubLSymbol $sym57$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");



    public static final SubLString $str59$retrying_sdbc_connection_timeout_ = makeString("retrying sdbc connection timeout: ~A~%");

    private static final SubLObject $const60$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell(makeString("WordNetSynsetImportStatus-ReadyForPossibleMatching"));

    public static final SubLString $str61$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    private static final SubLObject $const62$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell(makeString("WordNetSynsetImportStatus-ReadyForLexification"));

    private static final SubLObject $$ResearchCycConstant = reader_make_constant_shell(makeString("ResearchCycConstant"));

    public static final SubLString $str64$retrying_sdbc_connection_timeout_ = makeString("retrying sdbc connection timeout: ~a~%");

    public static final SubLString $$$cannot_create_new_term_for_ = makeString("cannot create new term for ");

    private static final SubLObject $$ExistingObjectType = reader_make_constant_shell(makeString("ExistingObjectType"));

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLObject $$FirstOrderCollection = reader_make_constant_shell(makeString("FirstOrderCollection"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    public static SubLObject ensure_wn_sks_registered() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    wordnet_utilities.wn_check_sks_registered();
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err_msg) {
            sksi_sks_manager.register_sksi_removal_modules_for_skses($list1);
        }
        return $WN_SKS_REGISTERED;
    }

    public static SubLObject wni_html_termXcomment(final SubLObject fort, final SubLObject bigP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        assert NIL != booleanp(bigP) : "Types.booleanp(bigP) " + "CommonSymbols.NIL != Types.booleanp(bigP) " + bigP;
        SubLObject comment = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            comment = kb_accessors.comment(fort, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != bigP) {
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            if (NIL != constant_p(fort)) {
                cb_link($CONSTANT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_form(fort, ZERO_INTEGER, NIL);
            }
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        } else {
            html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            if (NIL != constant_p(fort)) {
                cb_link($CONSTANT, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                cb_form(fort, ZERO_INTEGER, NIL);
            }
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ($str9$__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_princ_cycl_string(comment, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject wni_html_up_arrow(final SubLObject arrow_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(arrow_type) : "Types.symbolp(arrow_type) " + "CommonSymbols.NIL != Types.symbolp(arrow_type) " + arrow_type;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(arrow_type, $list12, UNPROVIDED, UNPROVIDED))) {
            Errors.error($str13$_A_is_an_invalid_arrow_type, arrow_type);
        }
        html_indent(FIVE_INTEGER);
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str14$_cycdoc_img_cyc_arrow_up_big_gif);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_image_alt$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str15$_Indicates_the_more_general_conce);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_image_align$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_align($$$top));
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_image_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$0);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_indent(TWO_INTEGER);
        html_markup(html_macros.$html_subscript_head$.getGlobalValue());
        if (arrow_type == $GENLS) {
            html_princ($$$genls);
        } else
            if (arrow_type == $ISA) {
                html_princ($$$isa);
            } else {
                html_princ($$$hypernym);
            }

        html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject wni_html_synset_words_gloss_examples(final SubLObject synset, SubLObject highlightP, SubLObject speech_part_offsetP) {
        if (highlightP == UNPROVIDED) {
            highlightP = T;
        }
        if (speech_part_offsetP == UNPROVIDED) {
            speech_part_offsetP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(highlightP) : "Types.booleanp(highlightP) " + "CommonSymbols.NIL != Types.booleanp(highlightP) " + highlightP;
        assert NIL != booleanp(speech_part_offsetP) : "Types.booleanp(speech_part_offsetP) " + "CommonSymbols.NIL != Types.booleanp(speech_part_offsetP) " + speech_part_offsetP;
        final SubLObject html_color = (NIL != highlightP) ? html_macros.$html_color_light_cyan$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
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
        if (NIL != html_color) {
            html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    wni_synset_links(synset, highlightP);
                    if (NIL != speech_part_offsetP) {
                        html_indent(FOUR_INTEGER);
                        html_princ(wordnet_import.wni_synset_speech_part_offset(synset));
                    }
                    html_newline(UNPROVIDED);
                    html_princ(wordnet_import.wni_synset_gloss(synset));
                    SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases(synset);
                    SubLObject example_phrase = NIL;
                    example_phrase = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_princ($str25$___);
                        html_princ(example_phrase);
                        html_princ($str26$_);
                        cdolist_list_var = cdolist_list_var.rest();
                        example_phrase = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject wni_synset_links(final SubLObject synset, SubLObject strongP) {
        if (strongP == UNPROVIDED) {
            strongP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(strongP) : "Types.booleanp(strongP) " + "CommonSymbols.NIL != Types.booleanp(strongP) " + strongP;
        final SubLObject words = wordnet_import.wni_synset_words(synset);
        SubLObject first_wordP = T;
        html_princ($str28$_);
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != first_wordP) {
                first_wordP = NIL;
            } else {
                html_princ($str29$___);
            }
            final SubLObject wordnet_url = cconcatenate($str30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute($str31$_, $$$_, word, UNPROVIDED));
            if (NIL != strongP) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(wordnet_url);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$main);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(word);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
            } else {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(wordnet_url);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$main);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(word);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        html_princ($str34$_);
        return NIL;
    }

    public static SubLObject wni_html_synset_words_gloss_examples_for_cb_browser(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
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
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    wni_synset_links_for_cb_browser(synset);
                    html_indent(TWO_INTEGER);
                    final SubLObject v_term = wordnet_import.wni_synset_term(synset);
                    SubLObject mapped_hypernym = NIL;
                    if (NIL == forts.fort_p(v_term)) {
                        mapped_hypernym = wordnet_import.wni_hypernym_terms(synset).first();
                    }
                    if (NIL != constant_p(v_term)) {
                        html_princ($str36$____);
                        html_indent(TWO_INTEGER);
                        cb_link($CONSTANT, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (NIL != forts.fort_p(v_term)) {
                            html_princ($str36$____);
                            html_indent(TWO_INTEGER);
                            cb_form(v_term, ZERO_INTEGER, NIL);
                        } else
                            if (NIL != constant_p(mapped_hypernym)) {
                                html_princ($$$hypernym_linked_to_);
                                cb_link($CONSTANT, mapped_hypernym, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(ONE_INTEGER);
                                html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL != forts.fort_p(mapped_hypernym)) {
                                    html_princ($$$hypernym_linked_to_);
                                    cb_form(mapped_hypernym, ZERO_INTEGER, NIL);
                                    html_indent(ONE_INTEGER);
                                    html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                } else {
                                    html_princ($$$not_linked_);
                                    html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                }



                    html_newline(UNPROVIDED);
                    html_princ(wordnet_import.wni_synset_gloss(synset));
                    SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases(synset);
                    SubLObject example_phrase = NIL;
                    example_phrase = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_princ($str25$___);
                        html_princ(example_phrase);
                        html_princ($str26$_);
                        cdolist_list_var = cdolist_list_var.rest();
                        example_phrase = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject wni_synset_links_for_cb_browser(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        final SubLObject words = wordnet_import.wni_synset_words(synset);
        SubLObject first_wordP = T;
        final SubLObject wordnet_url = cconcatenate($str30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute($str31$_, $$$_, words.first(), UNPROVIDED));
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(wordnet_url);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str41$_cycdoc_img_cb_wordnet_browser_gi);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str42$_WordNet_);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_princ($str43$__);
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != first_wordP) {
                first_wordP = NIL;
            } else {
                html_princ($str29$___);
            }
            final SubLObject search_url = cconcatenate($str44$cg_cb_handle_specify_query_, string_utilities.string_substitute($str31$_, $$$_, word, UNPROVIDED));
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(search_url);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($$$main);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(word);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        html_princ($str34$_);
        return NIL;
    }

    public static SubLObject wni_encode_terms_for_hidden_input(final SubLObject terms) {
        assert NIL != list_utilities.non_dotted_list_p(terms) : "list_utilities.non_dotted_list_p(terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(terms) " + terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject string = $str47$;
        SubLObject first_termP = T;
        SubLObject cdolist_list_var2 = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != first_termP) {
                first_termP = NIL;
            } else {
                string = cconcatenate(string, $$$_);
            }
            string = cconcatenate(string, cb_fort_identifier(v_term));
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_term = cdolist_list_var2.first();
        } 
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        return string;
    }

    public static SubLObject wni_decode_terms_from_hidden_input(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        SubLObject terms = NIL;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words(string, NOT_TEST_CHAR, UNPROVIDED);
            SubLObject id_string = NIL;
            id_string = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$6 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            terms = cons(wni_identifier_to_fort(id_string), terms);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$6, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                cdolist_list_var = cdolist_list_var.rest();
                id_string = cdolist_list_var.first();
            } 
        } finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        terms = nreverse(terms);
        assert NIL != listp(terms) : "Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) " + terms;
        return terms;
    }

    public static SubLObject wni_identifier_to_fort(final SubLObject id_string) {
        final SubLObject fort = (NIL != string_utilities.starts_with(id_string, $cb_constant_id_prefix$.getGlobalValue())) ? constants_high.find_constant_by_internal_id(read_from_string(string_utilities.pre_remove(id_string, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : nart_handles.find_nart_by_id(read_from_string(string_utilities.pre_remove(id_string, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        return fort;
    }

    public static SubLObject wni_string_synset_term_matches(final SubLObject synset, final SubLObject collectionP) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != booleanp(collectionP) : "Types.booleanp(collectionP) " + "CommonSymbols.NIL != Types.booleanp(collectionP) " + collectionP;
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject terms = NIL;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word = NIL;
        synset_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7;
            terms = cdolist_list_var_$7 = cb_frames.terms_for_browsing(synset_word, T, NIL);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                if (NIL != forts.fort_p(v_term)) {
                    final SubLObject item_var = v_term;
                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                v_term = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        } 
        final SubLObject list_var;
        ans = list_var = (NIL != collectionP) ? list_utilities.find_all_if(symbol_function($sym56$SET_OR_COLLECTION_), ans, UNPROVIDED) : list_utilities.find_all_if(symbol_function($sym57$INDIVIDUAL_), ans, UNPROVIDED);
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return ans;
    }

    public static SubLObject wni_complete_after_concept_match(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term, final SubLObject workflow_alist, final SubLObject nowP) {
        assert NIL != narts_high.naut_p(synset) : "narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) " + synset;
        assert NIL != forts.fort_p(matched_term) : "forts.fort_p(matched_term) " + "CommonSymbols.NIL != forts.fort_p(matched_term) " + matched_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        wni_complete_after_comment_existing_term(synset, genl_terms, matched_term, workflow_alist, NIL, nowP);
        return NIL;
    }

    public static SubLObject wni_complete_after_comment_existing_term(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        agenda.halt_agenda(UNPROVIDED);
        SubLObject error_message = NIL;
        SubLObject doneP = NIL;
        SubLObject retry_count = TEN_INTEGER;
        while (NIL == doneP) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        wni_complete_after_comment_existing_term_helper(synset, genl_terms, v_term, workflow_alist, comment, nowP);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if ((NIL != error_message) && retry_count.numG(ZERO_INTEGER)) {
                retry_count = subtract(retry_count, ONE_INTEGER);
                format(T, $str59$retrying_sdbc_connection_timeout_, error_message);
                sleep(ONE_INTEGER);
            } else {
                doneP = T;
            }
        } 
        return NIL;
    }

    public static SubLObject wni_complete_after_comment_existing_term_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        wordnet_import.wni_unassert_import_status($const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (NIL != list_utilities.alist_lookup(workflow_alist, $str61$unmapped_hypernym_chain, EQUAL, UNPROVIDED)) {
            if (NIL != comment) {
                wordnet_import.wni_assert_comment(v_term, comment, T);
            }
            if (NIL != genl_terms) {
                if (NIL != fort_types_interface.collectionP(v_term)) {
                    wordnet_import.wni_assert_genls(v_term, genl_terms, T);
                } else {
                    wordnet_import.wni_assert_isa(v_term, genl_terms, T);
                }
            }
            wordnet_import.wni_assert_synset_mapping(v_term, synset, T);
        } else {
            if (NIL != comment) {
                wordnet_import.wni_assert_comment(v_term, comment, nowP);
            }
            if (NIL != genl_terms) {
                if (NIL != fort_types_interface.collectionP(v_term)) {
                    wordnet_import.wni_assert_genls(v_term, genl_terms, nowP);
                } else {
                    wordnet_import.wni_assert_isa(v_term, genl_terms, nowP);
                }
            }
            wordnet_import.wni_assert_synset_mapping(v_term, synset, nowP);
        }
        wordnet_import.wni_update_synset_with_term(synset, v_term);
        wordnet_import.wni_assert_heuristic_lexicon(synset, workflow_alist, v_term, nowP);
        wordnet_import.wni_assert_import_status($const62$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if ((NIL == isa.isaP(v_term, $$ResearchCycConstant, UNPROVIDED, UNPROVIDED)) && (NIL == nart_handles.nart_p(v_term))) {
            wordnet_import.wni_assert_quoted_isa_workflow_constant(v_term, UNPROVIDED);
        }
        wordnet_import.wni_unlock_synset(synset, nowP);
        return NIL;
    }

    public static SubLObject wni_complete_after_comment(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != stringp(comment) : "Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) " + comment;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        agenda.halt_agenda(UNPROVIDED);
        SubLObject new_term = NIL;
        SubLObject error_message = NIL;
        SubLObject doneP = NIL;
        SubLObject retry_count = TEN_INTEGER;
        while (NIL == doneP) {
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        new_term = wni_complete_after_comment_helper(synset, genl_terms, name, workflow_alist, comment, nowP);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if ((NIL != error_message) && retry_count.numG(ZERO_INTEGER)) {
                retry_count = subtract(retry_count, ONE_INTEGER);
                format(T, $str64$retrying_sdbc_connection_timeout_, error_message);
                sleep(ONE_INTEGER);
            } else {
                doneP = T;
            }
        } 
        assert NIL != forts.fort_p(new_term) : "forts.fort_p(new_term) " + "CommonSymbols.NIL != forts.fort_p(new_term) " + new_term;
        return new_term;
    }

    public static SubLObject wni_complete_after_comment_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != list_utilities.alist_p(workflow_alist) : "list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) " + workflow_alist;
        assert NIL != stringp(comment) : "Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) " + comment;
        assert NIL != booleanp(nowP) : "Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) " + nowP;
        final SubLObject new_term = wordnet_import.wni_create_now(name);
        final SubLObject essential_assertions_nowP = makeBoolean((NIL != nowP) || (NIL != list_utilities.alist_lookup(workflow_alist, $str61$unmapped_hypernym_chain, EQUAL, UNPROVIDED)));
        if (NIL == valid_constantP(new_term, UNPROVIDED)) {
            cb_error(cconcatenate($$$cannot_create_new_term_for_, name), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        wordnet_import.wni_unassert_import_status($const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (NIL != wordnet_import.wni_synset_collectionP(synset)) {
            wordnet_import.wni_assert_isa(new_term, list(wni_best_collection_isa(genl_terms)), essential_assertions_nowP);
            wordnet_import.wni_assert_genls(new_term, genl_terms, essential_assertions_nowP);
        } else {
            wordnet_import.wni_assert_isa_individual(new_term, essential_assertions_nowP);
            wordnet_import.wni_assert_isa(new_term, genl_terms, essential_assertions_nowP);
        }
        if (NIL != comment) {
            wordnet_import.wni_assert_comment(new_term, comment, essential_assertions_nowP);
        }
        wordnet_import.wni_assert_synset_mapping(new_term, synset, essential_assertions_nowP);
        wordnet_import.wni_update_synset_with_term(synset, new_term);
        wordnet_import.wni_assert_heuristic_lexicon(synset, workflow_alist, new_term, nowP);
        wordnet_import.wni_assert_import_status($const62$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (NIL != constant_p(new_term)) {
            wordnet_import.wni_assert_quoted_isa_workflow_constant(new_term, UNPROVIDED);
        }
        wordnet_import.wni_assert_reified_using(new_term, nowP);
        wordnet_import.wni_unlock_synset(synset, nowP);
        assert NIL != forts.fort_p(new_term) : "forts.fort_p(new_term) " + "CommonSymbols.NIL != forts.fort_p(new_term) " + new_term;
        return new_term;
    }

    public static SubLObject wni_best_collection_isa(final SubLObject genl_terms) {
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) " + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = NIL;
        genl_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != isa.isaP(genl_term, $$ExistingObjectType, UNPROVIDED, UNPROVIDED)) {
                return $$ExistingObjectType;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        } 
        cdolist_list_var2 = genl_terms;
        genl_term = NIL;
        genl_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL != genls.genlsP(genl_term, $$Individual, UNPROVIDED, UNPROVIDED)) {
                return $$FirstOrderCollection;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        } 
        return $$Collection;
    }

    public static SubLObject declare_cb_wordnet_utilities_file() {
        declareFunction(me, "ensure_wn_sks_registered", "ENSURE-WN-SKS-REGISTERED", 0, 0, false);
        declareFunction(me, "wni_html_termXcomment", "WNI-HTML-TERM&COMMENT", 2, 0, false);
        declareFunction(me, "wni_html_up_arrow", "WNI-HTML-UP-ARROW", 1, 0, false);
        declareFunction(me, "wni_html_synset_words_gloss_examples", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES", 1, 2, false);
        declareFunction(me, "wni_synset_links", "WNI-SYNSET-LINKS", 1, 1, false);
        declareFunction(me, "wni_html_synset_words_gloss_examples_for_cb_browser", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER", 1, 0, false);
        declareFunction(me, "wni_synset_links_for_cb_browser", "WNI-SYNSET-LINKS-FOR-CB-BROWSER", 1, 0, false);
        declareFunction(me, "wni_encode_terms_for_hidden_input", "WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT", 1, 0, false);
        declareFunction(me, "wni_decode_terms_from_hidden_input", "WNI-DECODE-TERMS-FROM-HIDDEN-INPUT", 1, 0, false);
        declareFunction(me, "wni_identifier_to_fort", "WNI-IDENTIFIER-TO-FORT", 1, 0, false);
        declareFunction(me, "wni_string_synset_term_matches", "WNI-STRING-SYNSET-TERM-MATCHES", 2, 0, false);
        declareFunction(me, "wni_complete_after_concept_match", "WNI-COMPLETE-AFTER-CONCEPT-MATCH", 5, 0, false);
        declareFunction(me, "wni_complete_after_comment_existing_term", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM", 6, 0, false);
        declareFunction(me, "wni_complete_after_comment_existing_term_helper", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM-HELPER", 6, 0, false);
        declareFunction(me, "wni_complete_after_comment", "WNI-COMPLETE-AFTER-COMMENT", 6, 0, false);
        declareFunction(me, "wni_complete_after_comment_helper", "WNI-COMPLETE-AFTER-COMMENT-HELPER", 6, 0, false);
        declareFunction(me, "wni_best_collection_isa", "WNI-BEST-COLLECTION-ISA", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_wordnet_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_cb_wordnet_utilities_file() {
        register_external_symbol($sym3$WNI_HTML_TERM_COMMENT);
        register_external_symbol(WNI_HTML_UP_ARROW);
        register_external_symbol(WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES);
        register_external_symbol(WNI_SYNSET_LINKS);
        register_external_symbol(WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER);
        register_external_symbol(WNI_SYNSET_LINKS_FOR_CB_BROWSER);
        register_external_symbol(WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT);
        register_external_symbol(WNI_DECODE_TERMS_FROM_HIDDEN_INPUT);
        register_external_symbol(WNI_IDENTIFIER_TO_FORT);
        register_external_symbol(WNI_STRING_SYNSET_TERM_MATCHES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_wordnet_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_wordnet_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_wordnet_utilities_file();
    }

    
}

/**
 * Total time: 276 ms synthetic
 */
