package com.cyc.cycjava.cycl.wordnet_import;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.genls;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.cb_frames;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sksi.modeling_tools.interfaces.sksi_sks_manager;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_wordnet_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities";
    public static final String myFingerPrint = "c8a120ceba52b78ab069c6f4fb4e4dbdb3c7ca7c51ff83fad71e4694fd423286";
    private static final SubLSymbol $sym0$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$WN_SKS_REGISTERED;
    private static final SubLSymbol $sym3$WNI_HTML_TERM_COMMENT;
    private static final SubLSymbol $sym4$FORT_P;
    private static final SubLSymbol $sym5$BOOLEANP;
    private static final SubLSymbol $sym6$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const7$EverythingPSC;
    private static final SubLSymbol $kw8$CONSTANT;
    private static final SubLString $str9$__;
    private static final SubLSymbol $sym10$WNI_HTML_UP_ARROW;
    private static final SubLSymbol $sym11$SYMBOLP;
    private static final SubLList $list12;
    private static final SubLString $str13$_A_is_an_invalid_arrow_type;
    private static final SubLString $str14$_cycdoc_img_cyc_arrow_up_big_gif;
    private static final SubLString $str15$_Indicates_the_more_general_conce;
    private static final SubLString $str16$top;
    private static final SubLString $str17$0;
    private static final SubLSymbol $kw18$GENLS;
    private static final SubLString $str19$genls;
    private static final SubLSymbol $kw20$ISA;
    private static final SubLString $str21$isa;
    private static final SubLString $str22$hypernym;
    private static final SubLSymbol $sym23$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES;
    private static final SubLSymbol $sym24$NAUT_P;
    private static final SubLString $str25$___;
    private static final SubLString $str26$_;
    private static final SubLSymbol $sym27$WNI_SYNSET_LINKS;
    private static final SubLString $str28$_;
    private static final SubLString $str29$___;
    private static final SubLString $str30$http___www_cogsci_princeton_edu_c;
    private static final SubLString $str31$_;
    private static final SubLString $str32$_;
    private static final SubLString $str33$main;
    private static final SubLString $str34$_;
    private static final SubLSymbol $sym35$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER;
    private static final SubLString $str36$____;
    private static final SubLString $str37$hypernym_linked_to_;
    private static final SubLString $str38$Add;
    private static final SubLString $str39$not_linked_;
    private static final SubLSymbol $sym40$WNI_SYNSET_LINKS_FOR_CB_BROWSER;
    private static final SubLString $str41$_cycdoc_img_cb_wordnet_browser_gi;
    private static final SubLString $str42$_WordNet_;
    private static final SubLString $str43$__;
    private static final SubLString $str44$cg_cb_handle_specify_query_;
    private static final SubLSymbol $sym45$WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT;
    private static final SubLSymbol $sym46$NON_DOTTED_LIST_P;
    private static final SubLString $str47$;
    private static final SubLSymbol $sym48$STRINGP;
    private static final SubLSymbol $sym49$WNI_DECODE_TERMS_FROM_HIDDEN_INPUT;
    private static final SubLSymbol $sym50$NOT_TEST_CHAR;
    private static final SubLSymbol $kw51$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym52$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym53$LISTP;
    private static final SubLSymbol $sym54$WNI_IDENTIFIER_TO_FORT;
    private static final SubLSymbol $sym55$WNI_STRING_SYNSET_TERM_MATCHES;
    private static final SubLSymbol $sym56$SET_OR_COLLECTION_;
    private static final SubLSymbol $sym57$INDIVIDUAL_;
    private static final SubLSymbol $sym58$ALIST_P;
    private static final SubLString $str59$retrying_sdbc_connection_timeout_;
    private static final SubLObject $const60$WordNetSynsetImportStatus_ReadyFo;
    private static final SubLString $str61$unmapped_hypernym_chain;
    private static final SubLObject $const62$WordNetSynsetImportStatus_ReadyFo;
    private static final SubLObject $const63$ResearchCycConstant;
    private static final SubLString $str64$retrying_sdbc_connection_timeout_;
    private static final SubLString $str65$cannot_create_new_term_for_;
    private static final SubLObject $const66$ExistingObjectType;
    private static final SubLObject $const67$Individual;
    private static final SubLObject $const68$FirstOrderCollection;
    private static final SubLObject $const69$Collection;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 867L)
    public static SubLObject ensure_wn_sks_registered() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err_msg = (SubLObject)cb_wordnet_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)cb_wordnet_utilities.$sym0$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    wordnet_utilities.wn_check_sks_registered();
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)cb_wordnet_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (cb_wordnet_utilities.NIL != err_msg) {
            sksi_sks_manager.register_sksi_removal_modules_for_skses((SubLObject)cb_wordnet_utilities.$list1);
        }
        return (SubLObject)cb_wordnet_utilities.$kw2$WN_SKS_REGISTERED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 1150L)
    public static SubLObject wni_html_termXcomment(final SubLObject fort, final SubLObject bigP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != forts.fort_p(fort) : fort;
        assert cb_wordnet_utilities.NIL != Types.booleanp(bigP) : bigP;
        SubLObject comment = (SubLObject)cb_wordnet_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cb_wordnet_utilities.$sym6$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(cb_wordnet_utilities.$const7$EverythingPSC, thread);
            comment = kb_accessors.comment(fort, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (cb_wordnet_utilities.NIL != bigP) {
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            if (cb_wordnet_utilities.NIL != constant_handles.constant_p(fort)) {
                cb_utilities.cb_link((SubLObject)cb_wordnet_utilities.$kw8$CONSTANT, fort, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            }
            else {
                cb_utilities.cb_form(fort, (SubLObject)cb_wordnet_utilities.ZERO_INTEGER, (SubLObject)cb_wordnet_utilities.NIL);
            }
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        }
        else {
            html_utilities.html_markup(html_macros.$html_small_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
            if (cb_wordnet_utilities.NIL != constant_handles.constant_p(fort)) {
                cb_utilities.cb_link((SubLObject)cb_wordnet_utilities.$kw8$CONSTANT, fort, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            }
            else {
                cb_utilities.cb_form(fort, (SubLObject)cb_wordnet_utilities.ZERO_INTEGER, (SubLObject)cb_wordnet_utilities.NIL);
            }
            html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_small_tail$.getGlobalValue());
        }
        html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str9$__);
        html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_utilities.html_princ_cycl_string(comment, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_newline((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 1940L)
    public static SubLObject wni_html_up_arrow(final SubLObject arrow_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != Types.symbolp(arrow_type) : arrow_type;
        if (cb_wordnet_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && cb_wordnet_utilities.NIL == subl_promotions.memberP(arrow_type, (SubLObject)cb_wordnet_utilities.$list12, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED)) {
            Errors.error((SubLObject)cb_wordnet_utilities.$str13$_A_is_an_invalid_arrow_type, arrow_type);
        }
        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.FIVE_INTEGER);
        html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str14$_cycdoc_img_cyc_arrow_up_big_gif);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str15$_Indicates_the_more_general_conce);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_image_align$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_utilities.html_align((SubLObject)cb_wordnet_utilities.$str16$top));
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str17$0);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.TWO_INTEGER);
        html_utilities.html_markup(html_macros.$html_subscript_head$.getGlobalValue());
        if (arrow_type == cb_wordnet_utilities.$kw18$GENLS) {
            html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str19$genls);
        }
        else if (arrow_type == cb_wordnet_utilities.$kw20$ISA) {
            html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str21$isa);
        }
        else {
            html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str22$hypernym);
        }
        html_utilities.html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 2598L)
    public static SubLObject wni_html_synset_words_gloss_examples(final SubLObject synset, SubLObject highlightP, SubLObject speech_part_offsetP) {
        if (highlightP == cb_wordnet_utilities.UNPROVIDED) {
            highlightP = (SubLObject)cb_wordnet_utilities.T;
        }
        if (speech_part_offsetP == cb_wordnet_utilities.UNPROVIDED) {
            speech_part_offsetP = (SubLObject)cb_wordnet_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != Types.booleanp(highlightP) : highlightP;
        assert cb_wordnet_utilities.NIL != Types.booleanp(speech_part_offsetP) : speech_part_offsetP;
        final SubLObject html_color = (cb_wordnet_utilities.NIL != highlightP) ? html_macros.$html_color_light_cyan$.getGlobalValue() : html_macros.$html_color_white$.getGlobalValue();
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.FIVE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        if (cb_wordnet_utilities.NIL != html_color) {
            html_utilities.html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup(html_color);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$2 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                    wni_synset_links(synset, highlightP);
                    if (cb_wordnet_utilities.NIL != speech_part_offsetP) {
                        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.FOUR_INTEGER);
                        html_utilities.html_princ(wordnet_import.wni_synset_speech_part_offset(synset));
                    }
                    html_utilities.html_newline((SubLObject)cb_wordnet_utilities.UNPROVIDED);
                    html_utilities.html_princ(wordnet_import.wni_synset_gloss(synset));
                    SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases(synset);
                    SubLObject example_phrase = (SubLObject)cb_wordnet_utilities.NIL;
                    example_phrase = cdolist_list_var.first();
                    while (cb_wordnet_utilities.NIL != cdolist_list_var) {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str25$___);
                        html_utilities.html_princ(example_phrase);
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str26$_);
                        cdolist_list_var = cdolist_list_var.rest();
                        example_phrase = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$2, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$1, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 3569L)
    public static SubLObject wni_synset_links(final SubLObject synset, SubLObject strongP) {
        if (strongP == cb_wordnet_utilities.UNPROVIDED) {
            strongP = (SubLObject)cb_wordnet_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != Types.booleanp(strongP) : strongP;
        final SubLObject words = wordnet_import.wni_synset_words(synset);
        SubLObject first_wordP = (SubLObject)cb_wordnet_utilities.T;
        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str28$_);
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)cb_wordnet_utilities.NIL;
        word = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            if (cb_wordnet_utilities.NIL != first_wordP) {
                first_wordP = (SubLObject)cb_wordnet_utilities.NIL;
            }
            else {
                html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str29$___);
            }
            final SubLObject wordnet_url = Sequences.cconcatenate((SubLObject)cb_wordnet_utilities.$str30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute((SubLObject)cb_wordnet_utilities.$str31$_, (SubLObject)cb_wordnet_utilities.$str32$_, word, (SubLObject)cb_wordnet_utilities.UNPROVIDED));
            if (cb_wordnet_utilities.NIL != strongP) {
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_markup(wordnet_url);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str33$main);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                    html_utilities.html_princ(word);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            }
            else {
                html_utilities.html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_markup(wordnet_url);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str33$main);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                    html_utilities.html_princ(word);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_big_tail$.getGlobalValue());
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str34$_);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 4440L)
    public static SubLObject wni_html_synset_words_gloss_examples_for_cb_browser(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.FIVE_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup((SubLObject)cb_wordnet_utilities.ZERO_INTEGER);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
            html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                    wni_synset_links_for_cb_browser(synset);
                    html_utilities.html_indent((SubLObject)cb_wordnet_utilities.TWO_INTEGER);
                    final SubLObject v_term = wordnet_import.wni_synset_term(synset);
                    SubLObject mapped_hypernym = (SubLObject)cb_wordnet_utilities.NIL;
                    if (cb_wordnet_utilities.NIL == forts.fort_p(v_term)) {
                        mapped_hypernym = wordnet_import.wni_hypernym_terms(synset).first();
                    }
                    if (cb_wordnet_utilities.NIL != constant_handles.constant_p(v_term)) {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str36$____);
                        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.TWO_INTEGER);
                        cb_utilities.cb_link((SubLObject)cb_wordnet_utilities.$kw8$CONSTANT, v_term, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                    }
                    else if (cb_wordnet_utilities.NIL != forts.fort_p(v_term)) {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str36$____);
                        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.TWO_INTEGER);
                        cb_utilities.cb_form(v_term, (SubLObject)cb_wordnet_utilities.ZERO_INTEGER, (SubLObject)cb_wordnet_utilities.NIL);
                    }
                    else if (cb_wordnet_utilities.NIL != constant_handles.constant_p(mapped_hypernym)) {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str37$hypernym_linked_to_);
                        cb_utilities.cb_link((SubLObject)cb_wordnet_utilities.$kw8$CONSTANT, mapped_hypernym, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.ONE_INTEGER);
                        html_utilities.html_submit_input((SubLObject)cb_wordnet_utilities.$str38$Add, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                    }
                    else if (cb_wordnet_utilities.NIL != forts.fort_p(mapped_hypernym)) {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str37$hypernym_linked_to_);
                        cb_utilities.cb_form(mapped_hypernym, (SubLObject)cb_wordnet_utilities.ZERO_INTEGER, (SubLObject)cb_wordnet_utilities.NIL);
                        html_utilities.html_indent((SubLObject)cb_wordnet_utilities.ONE_INTEGER);
                        html_utilities.html_submit_input((SubLObject)cb_wordnet_utilities.$str38$Add, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                    }
                    else {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str39$not_linked_);
                        html_utilities.html_submit_input((SubLObject)cb_wordnet_utilities.$str38$Add, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
                    }
                    html_utilities.html_newline((SubLObject)cb_wordnet_utilities.UNPROVIDED);
                    html_utilities.html_princ(wordnet_import.wni_synset_gloss(synset));
                    SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases(synset);
                    SubLObject example_phrase = (SubLObject)cb_wordnet_utilities.NIL;
                    example_phrase = cdolist_list_var.first();
                    while (cb_wordnet_utilities.NIL != cdolist_list_var) {
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str25$___);
                        html_utilities.html_princ(example_phrase);
                        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str26$_);
                        cdolist_list_var = cdolist_list_var.rest();
                        example_phrase = cdolist_list_var.first();
                    }
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$4, thread);
                }
                html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$3, thread);
            }
            html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_utilities.html_source_readability_terpri((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_utilities.html_newline((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 5802L)
    public static SubLObject wni_synset_links_for_cb_browser(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        final SubLObject words = wordnet_import.wni_synset_words(synset);
        SubLObject first_wordP = (SubLObject)cb_wordnet_utilities.T;
        final SubLObject wordnet_url = Sequences.cconcatenate((SubLObject)cb_wordnet_utilities.$str30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute((SubLObject)cb_wordnet_utilities.$str31$_, (SubLObject)cb_wordnet_utilities.$str32$_, words.first(), (SubLObject)cb_wordnet_utilities.UNPROVIDED));
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_markup(wordnet_url);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
            html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str41$_cycdoc_img_cb_wordnet_browser_gi);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str42$_WordNet_);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_wordnet_utilities.ZERO_INTEGER);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
            }
            html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str43$__);
        SubLObject cdolist_list_var = words;
        SubLObject word = (SubLObject)cb_wordnet_utilities.NIL;
        word = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            if (cb_wordnet_utilities.NIL != first_wordP) {
                first_wordP = (SubLObject)cb_wordnet_utilities.NIL;
            }
            else {
                html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str29$___);
            }
            final SubLObject search_url = Sequences.cconcatenate((SubLObject)cb_wordnet_utilities.$str44$cg_cb_handle_specify_query_, string_utilities.string_substitute((SubLObject)cb_wordnet_utilities.$str31$_, (SubLObject)cb_wordnet_utilities.$str32$_, word, (SubLObject)cb_wordnet_utilities.UNPROVIDED));
            html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup(search_url);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_markup((SubLObject)cb_wordnet_utilities.$str33$main);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)cb_wordnet_utilities.T, thread);
                html_utilities.html_princ(word);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        }
        html_utilities.html_princ((SubLObject)cb_wordnet_utilities.$str34$_);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 6675L)
    public static SubLObject wni_encode_terms_for_hidden_input(final SubLObject terms) {
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(terms) : terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject string = (SubLObject)cb_wordnet_utilities.$str47$;
        SubLObject first_termP = (SubLObject)cb_wordnet_utilities.T;
        SubLObject cdolist_list_var2 = terms;
        SubLObject v_term = (SubLObject)cb_wordnet_utilities.NIL;
        v_term = cdolist_list_var2.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var2) {
            if (cb_wordnet_utilities.NIL != first_termP) {
                first_termP = (SubLObject)cb_wordnet_utilities.NIL;
            }
            else {
                string = Sequences.cconcatenate(string, (SubLObject)cb_wordnet_utilities.$str32$_);
            }
            string = Sequences.cconcatenate(string, cb_utilities.cb_fort_identifier(v_term));
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_term = cdolist_list_var2.first();
        }
        assert cb_wordnet_utilities.NIL != Types.stringp(string) : string;
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 7357L)
    public static SubLObject wni_decode_terms_from_hidden_input(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != Types.stringp(string) : string;
        SubLObject terms = (SubLObject)cb_wordnet_utilities.NIL;
        final SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
        try {
            string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
            SubLObject cdolist_list_var;
            final SubLObject word_list_var = cdolist_list_var = string_utilities.break_words(string, (SubLObject)cb_wordnet_utilities.$sym50$NOT_TEST_CHAR, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
            SubLObject id_string = (SubLObject)cb_wordnet_utilities.NIL;
            id_string = cdolist_list_var.first();
            while (cb_wordnet_utilities.NIL != cdolist_list_var) {
                SubLObject ignore_errors_tag = (SubLObject)cb_wordnet_utilities.NIL;
                try {
                    thread.throwStack.push(cb_wordnet_utilities.$kw51$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$6 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)cb_wordnet_utilities.$sym52$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            terms = (SubLObject)ConsesLow.cons(wni_identifier_to_fort(id_string), terms);
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)cb_wordnet_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$6, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)cb_wordnet_utilities.$kw51$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
                cdolist_list_var = cdolist_list_var.rest();
                id_string = cdolist_list_var.first();
            }
        }
        finally {
            string_utilities.$test_char$.rebind(_prev_bind_0, thread);
        }
        terms = Sequences.nreverse(terms);
        assert cb_wordnet_utilities.NIL != Types.listp(terms) : terms;
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 7807L)
    public static SubLObject wni_identifier_to_fort(final SubLObject id_string) {
        final SubLObject fort = (cb_wordnet_utilities.NIL != string_utilities.starts_with(id_string, cb_utilities.$cb_constant_id_prefix$.getGlobalValue())) ? constants_high.find_constant_by_internal_id(reader.read_from_string(string_utilities.pre_remove(id_string, cb_utilities.$cb_constant_id_prefix$.getGlobalValue(), (SubLObject)cb_wordnet_utilities.UNPROVIDED), (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED)) : nart_handles.find_nart_by_id(reader.read_from_string(string_utilities.pre_remove(id_string, cb_utilities.$cb_nart_id_prefix$.getGlobalValue(), (SubLObject)cb_wordnet_utilities.UNPROVIDED), (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED));
        assert cb_wordnet_utilities.NIL != forts.fort_p(fort) : fort;
        return fort;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 8374L)
    public static SubLObject wni_string_synset_term_matches(final SubLObject synset, final SubLObject collectionP) {
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != Types.booleanp(collectionP) : collectionP;
        final SubLObject synset_words = wordnet_import.wni_synset_words(synset);
        SubLObject terms = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject ans = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject cdolist_list_var = synset_words;
        SubLObject synset_word = (SubLObject)cb_wordnet_utilities.NIL;
        synset_word = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7;
            terms = (cdolist_list_var_$7 = cb_frames.terms_for_browsing(synset_word, (SubLObject)cb_wordnet_utilities.T, (SubLObject)cb_wordnet_utilities.NIL));
            SubLObject v_term = (SubLObject)cb_wordnet_utilities.NIL;
            v_term = cdolist_list_var_$7.first();
            while (cb_wordnet_utilities.NIL != cdolist_list_var_$7) {
                if (cb_wordnet_utilities.NIL != forts.fort_p(v_term)) {
                    final SubLObject item_var = v_term;
                    if (cb_wordnet_utilities.NIL == conses_high.member(item_var, ans, Symbols.symbol_function((SubLObject)cb_wordnet_utilities.EQL), Symbols.symbol_function((SubLObject)cb_wordnet_utilities.IDENTITY))) {
                        ans = (SubLObject)ConsesLow.cons(item_var, ans);
                    }
                }
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                v_term = cdolist_list_var_$7.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            synset_word = cdolist_list_var.first();
        }
        final SubLObject list_var;
        ans = (list_var = ((cb_wordnet_utilities.NIL != collectionP) ? list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_wordnet_utilities.$sym56$SET_OR_COLLECTION_), ans, (SubLObject)cb_wordnet_utilities.UNPROVIDED) : list_utilities.find_all_if(Symbols.symbol_function((SubLObject)cb_wordnet_utilities.$sym57$INDIVIDUAL_), ans, (SubLObject)cb_wordnet_utilities.UNPROVIDED)));
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var2.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var2) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 9391L)
    public static SubLObject wni_complete_after_concept_match(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term, final SubLObject workflow_alist, final SubLObject nowP) {
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != forts.fort_p(matched_term) : matched_term;
        assert cb_wordnet_utilities.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        wni_complete_after_comment_existing_term(synset, genl_terms, matched_term, workflow_alist, (SubLObject)cb_wordnet_utilities.NIL, nowP);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 10084L)
    public static SubLObject wni_complete_after_comment_existing_term(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert cb_wordnet_utilities.NIL != forts.fort_p(v_term) : v_term;
        assert cb_wordnet_utilities.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        if (cb_wordnet_utilities.NIL != comment && !cb_wordnet_utilities.assertionsDisabledInClass && cb_wordnet_utilities.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        assert cb_wordnet_utilities.NIL != Types.booleanp(nowP) : nowP;
        agenda.halt_agenda((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        SubLObject error_message = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject doneP = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject retry_count = (SubLObject)cb_wordnet_utilities.TEN_INTEGER;
        while (cb_wordnet_utilities.NIL == doneP) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cb_wordnet_utilities.$sym0$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        wni_complete_after_comment_existing_term_helper(synset, genl_terms, v_term, workflow_alist, comment, nowP);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cb_wordnet_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_wordnet_utilities.NIL != error_message && retry_count.numG((SubLObject)cb_wordnet_utilities.ZERO_INTEGER)) {
                retry_count = Numbers.subtract(retry_count, (SubLObject)cb_wordnet_utilities.ONE_INTEGER);
                PrintLow.format((SubLObject)cb_wordnet_utilities.T, (SubLObject)cb_wordnet_utilities.$str59$retrying_sdbc_connection_timeout_, error_message);
                Threads.sleep((SubLObject)cb_wordnet_utilities.ONE_INTEGER);
            }
            else {
                doneP = (SubLObject)cb_wordnet_utilities.T;
            }
        }
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 11117L)
    public static SubLObject wni_complete_after_comment_existing_term_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert cb_wordnet_utilities.NIL != forts.fort_p(v_term) : v_term;
        assert cb_wordnet_utilities.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        if (cb_wordnet_utilities.NIL != comment && !cb_wordnet_utilities.assertionsDisabledInClass && cb_wordnet_utilities.NIL == Types.stringp(comment)) {
            throw new AssertionError(comment);
        }
        assert cb_wordnet_utilities.NIL != Types.booleanp(nowP) : nowP;
        wordnet_import.wni_unassert_import_status(cb_wordnet_utilities.$const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (cb_wordnet_utilities.NIL != list_utilities.alist_lookup(workflow_alist, (SubLObject)cb_wordnet_utilities.$str61$unmapped_hypernym_chain, (SubLObject)cb_wordnet_utilities.EQUAL, (SubLObject)cb_wordnet_utilities.UNPROVIDED)) {
            if (cb_wordnet_utilities.NIL != comment) {
                wordnet_import.wni_assert_comment(v_term, comment, (SubLObject)cb_wordnet_utilities.T);
            }
            if (cb_wordnet_utilities.NIL != genl_terms) {
                if (cb_wordnet_utilities.NIL != fort_types_interface.collectionP(v_term)) {
                    wordnet_import.wni_assert_genls(v_term, genl_terms, (SubLObject)cb_wordnet_utilities.T);
                }
                else {
                    wordnet_import.wni_assert_isa(v_term, genl_terms, (SubLObject)cb_wordnet_utilities.T);
                }
            }
            wordnet_import.wni_assert_synset_mapping(v_term, synset, (SubLObject)cb_wordnet_utilities.T);
        }
        else {
            if (cb_wordnet_utilities.NIL != comment) {
                wordnet_import.wni_assert_comment(v_term, comment, nowP);
            }
            if (cb_wordnet_utilities.NIL != genl_terms) {
                if (cb_wordnet_utilities.NIL != fort_types_interface.collectionP(v_term)) {
                    wordnet_import.wni_assert_genls(v_term, genl_terms, nowP);
                }
                else {
                    wordnet_import.wni_assert_isa(v_term, genl_terms, nowP);
                }
            }
            wordnet_import.wni_assert_synset_mapping(v_term, synset, nowP);
        }
        wordnet_import.wni_update_synset_with_term(synset, v_term);
        wordnet_import.wni_assert_heuristic_lexicon(synset, workflow_alist, v_term, nowP);
        wordnet_import.wni_assert_import_status(cb_wordnet_utilities.$const62$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (cb_wordnet_utilities.NIL == isa.isaP(v_term, cb_wordnet_utilities.$const63$ResearchCycConstant, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED) && cb_wordnet_utilities.NIL == nart_handles.nart_p(v_term)) {
            wordnet_import.wni_assert_quoted_isa_workflow_constant(v_term, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        wordnet_import.wni_unlock_synset(synset, nowP);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 12767L)
    public static SubLObject wni_complete_after_comment(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert cb_wordnet_utilities.NIL != Types.stringp(name) : name;
        assert cb_wordnet_utilities.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert cb_wordnet_utilities.NIL != Types.stringp(comment) : comment;
        assert cb_wordnet_utilities.NIL != Types.booleanp(nowP) : nowP;
        agenda.halt_agenda((SubLObject)cb_wordnet_utilities.UNPROVIDED);
        SubLObject new_term = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject error_message = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject doneP = (SubLObject)cb_wordnet_utilities.NIL;
        SubLObject retry_count = (SubLObject)cb_wordnet_utilities.TEN_INTEGER;
        while (cb_wordnet_utilities.NIL == doneP) {
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)cb_wordnet_utilities.$sym0$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        new_term = wni_complete_after_comment_helper(synset, genl_terms, name, workflow_alist, comment, nowP);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)cb_wordnet_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (cb_wordnet_utilities.NIL != error_message && retry_count.numG((SubLObject)cb_wordnet_utilities.ZERO_INTEGER)) {
                retry_count = Numbers.subtract(retry_count, (SubLObject)cb_wordnet_utilities.ONE_INTEGER);
                PrintLow.format((SubLObject)cb_wordnet_utilities.T, (SubLObject)cb_wordnet_utilities.$str64$retrying_sdbc_connection_timeout_, error_message);
                Threads.sleep((SubLObject)cb_wordnet_utilities.ONE_INTEGER);
            }
            else {
                doneP = (SubLObject)cb_wordnet_utilities.T;
            }
        }
        assert cb_wordnet_utilities.NIL != forts.fort_p(new_term) : new_term;
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 13867L)
    public static SubLObject wni_complete_after_comment_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
        assert cb_wordnet_utilities.NIL != narts_high.naut_p(synset) : synset;
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert cb_wordnet_utilities.NIL != Types.stringp(name) : name;
        assert cb_wordnet_utilities.NIL != list_utilities.alist_p(workflow_alist) : workflow_alist;
        assert cb_wordnet_utilities.NIL != Types.stringp(comment) : comment;
        assert cb_wordnet_utilities.NIL != Types.booleanp(nowP) : nowP;
        final SubLObject new_term = wordnet_import.wni_create_now(name);
        final SubLObject essential_assertions_nowP = (SubLObject)SubLObjectFactory.makeBoolean(cb_wordnet_utilities.NIL != nowP || cb_wordnet_utilities.NIL != list_utilities.alist_lookup(workflow_alist, (SubLObject)cb_wordnet_utilities.$str61$unmapped_hypernym_chain, (SubLObject)cb_wordnet_utilities.EQUAL, (SubLObject)cb_wordnet_utilities.UNPROVIDED));
        if (cb_wordnet_utilities.NIL == constant_handles.valid_constantP(new_term, (SubLObject)cb_wordnet_utilities.UNPROVIDED)) {
            cb_utilities.cb_error(Sequences.cconcatenate((SubLObject)cb_wordnet_utilities.$str65$cannot_create_new_term_for_, name), (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        wordnet_import.wni_unassert_import_status(cb_wordnet_utilities.$const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (cb_wordnet_utilities.NIL != wordnet_import.wni_synset_collectionP(synset)) {
            wordnet_import.wni_assert_isa(new_term, (SubLObject)ConsesLow.list(wni_best_collection_isa(genl_terms)), essential_assertions_nowP);
            wordnet_import.wni_assert_genls(new_term, genl_terms, essential_assertions_nowP);
        }
        else {
            wordnet_import.wni_assert_isa_individual(new_term, essential_assertions_nowP);
            wordnet_import.wni_assert_isa(new_term, genl_terms, essential_assertions_nowP);
        }
        if (cb_wordnet_utilities.NIL != comment) {
            wordnet_import.wni_assert_comment(new_term, comment, essential_assertions_nowP);
        }
        wordnet_import.wni_assert_synset_mapping(new_term, synset, essential_assertions_nowP);
        wordnet_import.wni_update_synset_with_term(synset, new_term);
        wordnet_import.wni_assert_heuristic_lexicon(synset, workflow_alist, new_term, nowP);
        wordnet_import.wni_assert_import_status(cb_wordnet_utilities.$const62$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (cb_wordnet_utilities.NIL != constant_handles.constant_p(new_term)) {
            wordnet_import.wni_assert_quoted_isa_workflow_constant(new_term, (SubLObject)cb_wordnet_utilities.UNPROVIDED);
        }
        wordnet_import.wni_assert_reified_using(new_term, nowP);
        wordnet_import.wni_unlock_synset(synset, nowP);
        assert cb_wordnet_utilities.NIL != forts.fort_p(new_term) : new_term;
        return new_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wordnet-import/cb-wordnet-utilities.lisp", position = 15956L)
    public static SubLObject wni_best_collection_isa(final SubLObject genl_terms) {
        assert cb_wordnet_utilities.NIL != list_utilities.non_dotted_list_p(genl_terms) : genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = (SubLObject)cb_wordnet_utilities.NIL;
        elem = cdolist_list_var.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var) {
            assert cb_wordnet_utilities.NIL != forts.fort_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = genl_terms;
        SubLObject genl_term = (SubLObject)cb_wordnet_utilities.NIL;
        genl_term = cdolist_list_var2.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var2) {
            if (cb_wordnet_utilities.NIL != isa.isaP(genl_term, cb_wordnet_utilities.$const66$ExistingObjectType, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED)) {
                return cb_wordnet_utilities.$const66$ExistingObjectType;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        }
        cdolist_list_var2 = genl_terms;
        genl_term = (SubLObject)cb_wordnet_utilities.NIL;
        genl_term = cdolist_list_var2.first();
        while (cb_wordnet_utilities.NIL != cdolist_list_var2) {
            if (cb_wordnet_utilities.NIL != genls.genlsP(genl_term, cb_wordnet_utilities.$const67$Individual, (SubLObject)cb_wordnet_utilities.UNPROVIDED, (SubLObject)cb_wordnet_utilities.UNPROVIDED)) {
                return cb_wordnet_utilities.$const68$FirstOrderCollection;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            genl_term = cdolist_list_var2.first();
        }
        return cb_wordnet_utilities.$const69$Collection;
    }
    
    public static SubLObject declare_cb_wordnet_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "ensure_wn_sks_registered", "ENSURE-WN-SKS-REGISTERED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_html_termXcomment", "WNI-HTML-TERM&COMMENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_html_up_arrow", "WNI-HTML-UP-ARROW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_html_synset_words_gloss_examples", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_synset_links", "WNI-SYNSET-LINKS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_html_synset_words_gloss_examples_for_cb_browser", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_synset_links_for_cb_browser", "WNI-SYNSET-LINKS-FOR-CB-BROWSER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_encode_terms_for_hidden_input", "WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_decode_terms_from_hidden_input", "WNI-DECODE-TERMS-FROM-HIDDEN-INPUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_identifier_to_fort", "WNI-IDENTIFIER-TO-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_string_synset_term_matches", "WNI-STRING-SYNSET-TERM-MATCHES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_complete_after_concept_match", "WNI-COMPLETE-AFTER-CONCEPT-MATCH", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_complete_after_comment_existing_term", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_complete_after_comment_existing_term_helper", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM-HELPER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_complete_after_comment", "WNI-COMPLETE-AFTER-COMMENT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_complete_after_comment_helper", "WNI-COMPLETE-AFTER-COMMENT-HELPER", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities", "wni_best_collection_isa", "WNI-BEST-COLLECTION-ISA", 1, 0, false);
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    public static SubLObject init_cb_wordnet_utilities_file() {
        return (SubLObject)cb_wordnet_utilities.NIL;
    }
    
    public static SubLObject setup_cb_wordnet_utilities_file() {
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym3$WNI_HTML_TERM_COMMENT);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym10$WNI_HTML_UP_ARROW);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym23$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym27$WNI_SYNSET_LINKS);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym35$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym40$WNI_SYNSET_LINKS_FOR_CB_BROWSER);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym45$WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym49$WNI_DECODE_TERMS_FROM_HIDDEN_INPUT);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym54$WNI_IDENTIFIER_TO_FORT);
        access_macros.register_external_symbol((SubLObject)cb_wordnet_utilities.$sym55$WNI_STRING_SYNSET_TERM_MATCHES);
        return (SubLObject)cb_wordnet_utilities.NIL;
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
    
    static {
        me = (SubLFile)new cb_wordnet_utilities();
        $sym0$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet2_0-KS")));
        $kw2$WN_SKS_REGISTERED = SubLObjectFactory.makeKeyword("WN-SKS-REGISTERED");
        $sym3$WNI_HTML_TERM_COMMENT = SubLObjectFactory.makeSymbol("WNI-HTML-TERM&COMMENT");
        $sym4$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym5$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym6$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const7$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw8$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $str9$__ = SubLObjectFactory.makeString(": ");
        $sym10$WNI_HTML_UP_ARROW = SubLObjectFactory.makeSymbol("WNI-HTML-UP-ARROW");
        $sym11$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENLS"), (SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("HYPERNYM"));
        $str13$_A_is_an_invalid_arrow_type = SubLObjectFactory.makeString("~A is an invalid arrow-type");
        $str14$_cycdoc_img_cyc_arrow_up_big_gif = SubLObjectFactory.makeString("/cycdoc/img/cyc-arrow-up-big.gif");
        $str15$_Indicates_the_more_general_conce = SubLObjectFactory.makeString("[Indicates the more general concept]");
        $str16$top = SubLObjectFactory.makeString("top");
        $str17$0 = SubLObjectFactory.makeString("0");
        $kw18$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $str19$genls = SubLObjectFactory.makeString("genls");
        $kw20$ISA = SubLObjectFactory.makeKeyword("ISA");
        $str21$isa = SubLObjectFactory.makeString("isa");
        $str22$hypernym = SubLObjectFactory.makeString("hypernym");
        $sym23$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES = SubLObjectFactory.makeSymbol("WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES");
        $sym24$NAUT_P = SubLObjectFactory.makeSymbol("NAUT-P");
        $str25$___ = SubLObjectFactory.makeString("; \"");
        $str26$_ = SubLObjectFactory.makeString("\"");
        $sym27$WNI_SYNSET_LINKS = SubLObjectFactory.makeSymbol("WNI-SYNSET-LINKS");
        $str28$_ = SubLObjectFactory.makeString("(");
        $str29$___ = SubLObjectFactory.makeString(" | ");
        $str30$http___www_cogsci_princeton_edu_c = SubLObjectFactory.makeString("http://www.cogsci.princeton.edu/cgi-bin/webwn2.0?stage=1&amp;word=");
        $str31$_ = SubLObjectFactory.makeString("+");
        $str32$_ = SubLObjectFactory.makeString(" ");
        $str33$main = SubLObjectFactory.makeString("main");
        $str34$_ = SubLObjectFactory.makeString(")");
        $sym35$WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER = SubLObjectFactory.makeSymbol("WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER");
        $str36$____ = SubLObjectFactory.makeString("--->");
        $str37$hypernym_linked_to_ = SubLObjectFactory.makeString("hypernym linked to ");
        $str38$Add = SubLObjectFactory.makeString("Add");
        $str39$not_linked_ = SubLObjectFactory.makeString("not linked ");
        $sym40$WNI_SYNSET_LINKS_FOR_CB_BROWSER = SubLObjectFactory.makeSymbol("WNI-SYNSET-LINKS-FOR-CB-BROWSER");
        $str41$_cycdoc_img_cb_wordnet_browser_gi = SubLObjectFactory.makeString("/cycdoc/img/cb/wordnet-browser.gif");
        $str42$_WordNet_ = SubLObjectFactory.makeString("[WordNet]");
        $str43$__ = SubLObjectFactory.makeString(" (");
        $str44$cg_cb_handle_specify_query_ = SubLObjectFactory.makeString("cg?cb-handle-specify&query=");
        $sym45$WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT = SubLObjectFactory.makeSymbol("WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT");
        $sym46$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $str47$ = SubLObjectFactory.makeString("");
        $sym48$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym49$WNI_DECODE_TERMS_FROM_HIDDEN_INPUT = SubLObjectFactory.makeSymbol("WNI-DECODE-TERMS-FROM-HIDDEN-INPUT");
        $sym50$NOT_TEST_CHAR = SubLObjectFactory.makeSymbol("NOT-TEST-CHAR");
        $kw51$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym52$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym53$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym54$WNI_IDENTIFIER_TO_FORT = SubLObjectFactory.makeSymbol("WNI-IDENTIFIER-TO-FORT");
        $sym55$WNI_STRING_SYNSET_TERM_MATCHES = SubLObjectFactory.makeSymbol("WNI-STRING-SYNSET-TERM-MATCHES");
        $sym56$SET_OR_COLLECTION_ = SubLObjectFactory.makeSymbol("SET-OR-COLLECTION?");
        $sym57$INDIVIDUAL_ = SubLObjectFactory.makeSymbol("INDIVIDUAL?");
        $sym58$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $str59$retrying_sdbc_connection_timeout_ = SubLObjectFactory.makeString("retrying sdbc connection timeout: ~A~%");
        $const60$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-ReadyForPossibleMatching"));
        $str61$unmapped_hypernym_chain = SubLObjectFactory.makeString("unmapped-hypernym-chain");
        $const62$WordNetSynsetImportStatus_ReadyFo = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetSynsetImportStatus-ReadyForLexification"));
        $const63$ResearchCycConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycConstant"));
        $str64$retrying_sdbc_connection_timeout_ = SubLObjectFactory.makeString("retrying sdbc connection timeout: ~a~%");
        $str65$cannot_create_new_term_for_ = SubLObjectFactory.makeString("cannot create new term for ");
        $const66$ExistingObjectType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ExistingObjectType"));
        $const67$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $const68$FirstOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection"));
        $const69$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
    }
}

/*

	Total time: 276 ms
	 synthetic 
*/