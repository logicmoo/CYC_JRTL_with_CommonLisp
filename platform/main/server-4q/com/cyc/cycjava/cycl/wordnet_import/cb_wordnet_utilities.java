/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_cycl_string;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.list_utilities.alist_lookup;
import static com.cyc.cycjava.cycl.list_utilities.find_all_if;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
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

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-WORDNET-UTILITIES
 * source file: /cyc/top/cycl/wordnet-import/cb-wordnet-utilities.lisp
 * created:     2019/07/03 17:38:13
 */
public final class cb_wordnet_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt47$ = makeString("");

    public static final SubLFile me = new cb_wordnet_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities";


    static private final SubLList $list1 = list(reader_make_constant_shell("WordNet2_0-KS"));

    private static final SubLSymbol $WN_SKS_REGISTERED = makeKeyword("WN-SKS-REGISTERED");

    static private final SubLSymbol $sym3$WNI_HTML_TERM_COMMENT = makeSymbol("WNI-HTML-TERM&COMMENT");



    static private final SubLString $str9$__ = makeString(": ");

    private static final SubLSymbol WNI_HTML_UP_ARROW = makeSymbol("WNI-HTML-UP-ARROW");

    static private final SubLList $list12 = list(makeKeyword("GENLS"), makeKeyword("ISA"), makeKeyword("HYPERNYM"));

    static private final SubLString $str13$_A_is_an_invalid_arrow_type = makeString("~A is an invalid arrow-type");

    static private final SubLString $str14$_cycdoc_img_cyc_arrow_up_big_gif = makeString("/cycdoc/img/cyc-arrow-up-big.gif");

    static private final SubLString $str15$_Indicates_the_more_general_conce = makeString("[Indicates the more general concept]");

    static private final SubLString $$$top = makeString("top");

    static private final SubLString $$$0 = makeString("0");

    static private final SubLString $$$genls = makeString("genls");

    static private final SubLString $$$isa = makeString("isa");

    static private final SubLString $$$hypernym = makeString("hypernym");

    private static final SubLSymbol WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES = makeSymbol("WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES");

    static private final SubLString $str25$___ = makeString("; \"");

    static private final SubLString $str26$_ = makeString("\"");

    private static final SubLSymbol WNI_SYNSET_LINKS = makeSymbol("WNI-SYNSET-LINKS");

    static private final SubLString $str28$_ = makeString("(");

    static private final SubLString $str29$___ = makeString(" | ");

    static private final SubLString $str30$http___www_cogsci_princeton_edu_c = makeString("http://www.cogsci.princeton.edu/cgi-bin/webwn2.0?stage=1&amp;word=");

    static private final SubLString $str31$_ = makeString("+");

    static private final SubLString $$$_ = makeString(" ");

    static private final SubLString $$$main = makeString("main");

    static private final SubLString $str34$_ = makeString(")");

    private static final SubLSymbol WNI_HTML_SYNSET_WORDS_GLOSS_EXAMPLES_FOR_CB_BROWSER = makeSymbol("WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER");

    static private final SubLString $str36$____ = makeString("--->");

    static private final SubLString $$$hypernym_linked_to_ = makeString("hypernym linked to ");

    static private final SubLString $$$Add = makeString("Add");

    static private final SubLString $$$not_linked_ = makeString("not linked ");

    private static final SubLSymbol WNI_SYNSET_LINKS_FOR_CB_BROWSER = makeSymbol("WNI-SYNSET-LINKS-FOR-CB-BROWSER");

    static private final SubLString $str41$_cycdoc_img_cb_wordnet_browser_gi = makeString("/cycdoc/img/cb/wordnet-browser.gif");

    static private final SubLString $str42$_WordNet_ = makeString("[WordNet]");

    static private final SubLString $str43$__ = makeString(" (");

    static private final SubLString $str44$cg_cb_handle_specify_query_ = makeString("cg?cb-handle-specify&query=");

    private static final SubLSymbol WNI_ENCODE_TERMS_FOR_HIDDEN_INPUT = makeSymbol("WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT");

    static private final SubLString $str47$ = makeString("");

    private static final SubLSymbol WNI_DECODE_TERMS_FROM_HIDDEN_INPUT = makeSymbol("WNI-DECODE-TERMS-FROM-HIDDEN-INPUT");

    private static final SubLSymbol NOT_TEST_CHAR = makeSymbol("NOT-TEST-CHAR");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol WNI_IDENTIFIER_TO_FORT = makeSymbol("WNI-IDENTIFIER-TO-FORT");

    private static final SubLSymbol WNI_STRING_SYNSET_TERM_MATCHES = makeSymbol("WNI-STRING-SYNSET-TERM-MATCHES");

    static private final SubLSymbol $sym56$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");

    static private final SubLSymbol $sym57$INDIVIDUAL_ = makeSymbol("INDIVIDUAL?");

    static private final SubLString $str59$retrying_sdbc_connection_timeout_ = makeString("retrying sdbc connection timeout: ~A~%");

    private static final SubLObject $const60$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForPossibleMatching");

    static private final SubLString $str61$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    private static final SubLObject $const62$WordNetSynsetImportStatus_ReadyFo = reader_make_constant_shell("WordNetSynsetImportStatus-ReadyForLexification");



    static private final SubLString $str64$retrying_sdbc_connection_timeout_ = makeString("retrying sdbc connection timeout: ~a~%");

    static private final SubLString $$$cannot_create_new_term_for_ = makeString("cannot create new term for ");









    // Definitions
    public static final SubLObject ensure_wn_sks_registered_alt() {
        {
            SubLObject err_msg = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            wordnet_utilities.wn_check_sks_registered();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != err_msg) {
                sksi_sks_manager.register_sksi_removal_modules_for_skses($list_alt1);
            }
        }
        return $WN_SKS_REGISTERED;
    }

    // Definitions
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

    /**
     * Outputs the given term's hyperlink and comment.
     *
     * @param fort
     * 		: fort-p
     * @param big
     * 		: booleanp, indicates whether the term hyperlink text should be emphasized.
     */
    @LispMethod(comment = "Outputs the given term\'s hyperlink and comment.\r\n\r\n@param fort\r\n\t\t: fort-p\r\n@param big\r\n\t\t: booleanp, indicates whether the term hyperlink text should be emphasized.")
    public static final SubLObject wni_html_termXcomment_alt(SubLObject fort, SubLObject bigP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(fort, FORT_P);
            SubLTrampolineFile.checkType(bigP, BOOLEANP);
            {
                SubLObject comment = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        comment = kb_accessors.comment(fort, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
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
                html_princ($str_alt9$__);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_princ_cycl_string(comment, UNPROVIDED, UNPROVIDED);
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Outputs the given term's hyperlink and comment.
     *
     * @param fort
     * 		: fort-p
     * @param big
     * 		: booleanp, indicates whether the term hyperlink text should be emphasized.
     */
    @LispMethod(comment = "Outputs the given term\'s hyperlink and comment.\r\n\r\n@param fort\r\n\t\t: fort-p\r\n@param big\r\n\t\t: booleanp, indicates whether the term hyperlink text should be emphasized.")
    public static SubLObject wni_html_termXcomment(final SubLObject fort, final SubLObject bigP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        assert NIL != booleanp(bigP) : "! booleanp(bigP) " + ("Types.booleanp(bigP) " + "CommonSymbols.NIL != Types.booleanp(bigP) ") + bigP;
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

    /**
     * Outputs an up-arrow graphic with an isa or genls subscript
     *
     * @param symbolp
     * 		: :genls, :isa or :hypernym
     */
    @LispMethod(comment = "Outputs an up-arrow graphic with an isa or genls subscript\r\n\r\n@param symbolp\r\n\t\t: :genls, :isa or :hypernym")
    public static final SubLObject wni_html_up_arrow_alt(SubLObject arrow_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(arrow_type, SYMBOLP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subl_promotions.memberP(arrow_type, $list_alt12, UNPROVIDED, UNPROVIDED)) {
                    Errors.error($str_alt13$_A_is_an_invalid_arrow_type, arrow_type);
                }
            }
            html_indent(FIVE_INTEGER);
            html_markup(html_macros.$html_image_head$.getGlobalValue());
            html_markup(html_macros.$html_image_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str_alt14$_cycdoc_img_cyc_arrow_up_big_gif);
            html_char(CHAR_quotation, UNPROVIDED);
            if (true) {
                html_markup(html_macros.$html_image_alt$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str_alt15$_Indicates_the_more_general_conce);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_image_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($$$top));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_image_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($$$0);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_image_tail$.getGlobalValue());
            html_indent(TWO_INTEGER);
            html_markup(html_macros.$html_subscript_head$.getGlobalValue());
            if (arrow_type == $GENLS) {
                html_princ($$$genls);
            } else {
                if (arrow_type == $ISA) {
                    html_princ($$$isa);
                } else {
                    html_princ($$$hypernym);
                }
            }
            html_markup(html_macros.$html_subscript_tail$.getGlobalValue());
            return NIL;
        }
    }

    /**
     * Outputs an up-arrow graphic with an isa or genls subscript
     *
     * @param symbolp
     * 		: :genls, :isa or :hypernym
     */
    @LispMethod(comment = "Outputs an up-arrow graphic with an isa or genls subscript\r\n\r\n@param symbolp\r\n\t\t: :genls, :isa or :hypernym")
    public static SubLObject wni_html_up_arrow(final SubLObject arrow_type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != symbolp(arrow_type) : "! symbolp(arrow_type) " + ("Types.symbolp(arrow_type) " + "CommonSymbols.NIL != Types.symbolp(arrow_type) ") + arrow_type;
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

    /**
     * Outputs the synset words, gloss and examples.
     *
     * @param synset
     * 		; naut-p
     * @param highlight?
     * 		; booleanp
     * @param speech-part-offset?
     * 		; booleanp
     */
    @LispMethod(comment = "Outputs the synset words, gloss and examples.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param highlight?\r\n\t\t; booleanp\r\n@param speech-part-offset?\r\n\t\t; booleanp")
    public static final SubLObject wni_html_synset_words_gloss_examples_alt(SubLObject synset, SubLObject highlightP, SubLObject speech_part_offsetP) {
        if (highlightP == UNPROVIDED) {
            highlightP = T;
        }
        if (speech_part_offsetP == UNPROVIDED) {
            speech_part_offsetP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            SubLTrampolineFile.checkType(highlightP, BOOLEANP);
            SubLTrampolineFile.checkType(speech_part_offsetP, BOOLEANP);
            {
                SubLObject html_color = (NIL != highlightP) ? ((SubLObject) (html_macros.$html_color_light_cyan$.getDynamicValue(thread))) : html_macros.$html_color_white$.getDynamicValue(thread);
                html_markup(html_macros.$html_table_head$.getGlobalValue());
                if (true) {
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(FIVE_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (true) {
                    html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                if (NIL != html_color) {
                    html_markup(html_macros.$html_table_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_1 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_synset_links(synset, highlightP);
                                        if (NIL != speech_part_offsetP) {
                                            html_indent(FOUR_INTEGER);
                                            html_princ(wordnet_import.wni_synset_speech_part_offset(synset));
                                        }
                                        html_newline(UNPROVIDED);
                                        html_princ(wordnet_import.wni_synset_gloss(synset));
                                        {
                                            SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases(synset);
                                            SubLObject example_phrase = NIL;
                                            for (example_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example_phrase = cdolist_list_var.first()) {
                                                html_princ($str_alt25$___);
                                                html_princ(example_phrase);
                                                html_princ($str_alt26$_);
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_1, thread);
                            }
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_table_tail$.getGlobalValue());
                html_newline(UNPROVIDED);
            }
            return NIL;
        }
    }

    /**
     * Outputs the synset words, gloss and examples.
     *
     * @param synset
     * 		; naut-p
     * @param highlight?
     * 		; booleanp
     * @param speech-part-offset?
     * 		; booleanp
     */
    @LispMethod(comment = "Outputs the synset words, gloss and examples.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param highlight?\r\n\t\t; booleanp\r\n@param speech-part-offset?\r\n\t\t; booleanp")
    public static SubLObject wni_html_synset_words_gloss_examples(final SubLObject synset, SubLObject highlightP, SubLObject speech_part_offsetP) {
        if (highlightP == UNPROVIDED) {
            highlightP = T;
        }
        if (speech_part_offsetP == UNPROVIDED) {
            speech_part_offsetP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(highlightP) : "! booleanp(highlightP) " + ("Types.booleanp(highlightP) " + "CommonSymbols.NIL != Types.booleanp(highlightP) ") + highlightP;
        assert NIL != booleanp(speech_part_offsetP) : "! booleanp(speech_part_offsetP) " + ("Types.booleanp(speech_part_offsetP) " + "CommonSymbols.NIL != Types.booleanp(speech_part_offsetP) ") + speech_part_offsetP;
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

    /**
     * Emits the HTML hyperlinks for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @param strong?
     * 		; booleanp
     */
    @LispMethod(comment = "Emits the HTML hyperlinks for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param strong?\r\n\t\t; booleanp")
    public static final SubLObject wni_synset_links_alt(SubLObject synset, SubLObject strongP) {
        if (strongP == UNPROVIDED) {
            strongP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            SubLTrampolineFile.checkType(strongP, BOOLEANP);
            {
                SubLObject words = wordnet_import.wni_synset_words(synset);
                SubLObject first_wordP = T;
                html_princ($str_alt28$_);
                {
                    SubLObject cdolist_list_var = words;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        if (NIL != first_wordP) {
                            first_wordP = NIL;
                        } else {
                            html_princ($str_alt29$___);
                        }
                        {
                            SubLObject wordnet_url = cconcatenate($str_alt30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute($str_alt31$_, $str_alt32$_, word, UNPROVIDED));
                            if (NIL != strongP) {
                                html_markup(html_macros.$html_big_head$.getGlobalValue());
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(wordnet_url);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (true) {
                                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$main);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(word);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
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
                                if (true) {
                                    html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$main);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                                {
                                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(word);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                            }
                        }
                    }
                }
                html_princ($str_alt34$_);
            }
            return NIL;
        }
    }

    /**
     * Emits the HTML hyperlinks for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     * @param strong?
     * 		; booleanp
     */
    @LispMethod(comment = "Emits the HTML hyperlinks for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param strong?\r\n\t\t; booleanp")
    public static SubLObject wni_synset_links(final SubLObject synset, SubLObject strongP) {
        if (strongP == UNPROVIDED) {
            strongP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(strongP) : "! booleanp(strongP) " + ("Types.booleanp(strongP) " + "CommonSymbols.NIL != Types.booleanp(strongP) ") + strongP;
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

    /**
     * Outputs the synset words, gloss and examples and must be contained in a form.
     *
     * @param synset
     * 		: naut-p
     */
    @LispMethod(comment = "Outputs the synset words, gloss and examples and must be contained in a form.\r\n\r\n@param synset\r\n\t\t: naut-p")
    public static final SubLObject wni_html_synset_words_gloss_examples_for_cb_browser_alt(SubLObject synset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            if (true) {
                html_markup(html_macros.$html_table_border$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(FIVE_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            if (true) {
                html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(ZERO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            {
                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    {
                        SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0_4 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_synset_links_for_cb_browser(synset);
                                    html_indent(TWO_INTEGER);
                                    {
                                        SubLObject v_term = wordnet_import.wni_synset_term(synset);
                                        SubLObject mapped_hypernym = NIL;
                                        if (NIL == fort_p(v_term)) {
                                            mapped_hypernym = wordnet_import.wni_hypernym_terms(synset).first();
                                        }
                                        if (NIL != constant_p(v_term)) {
                                            html_princ($str_alt36$____);
                                            html_indent(TWO_INTEGER);
                                            cb_link($CONSTANT, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            if (NIL != fort_p(v_term)) {
                                                html_princ($str_alt36$____);
                                                html_indent(TWO_INTEGER);
                                                cb_form(v_term, ZERO_INTEGER, NIL);
                                            } else {
                                                if (NIL != constant_p(mapped_hypernym)) {
                                                    html_princ($str_alt37$hypernym_linked_to_);
                                                    cb_link($CONSTANT, mapped_hypernym, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    html_indent(ONE_INTEGER);
                                                    html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                                } else {
                                                    if (NIL != fort_p(mapped_hypernym)) {
                                                        html_princ($str_alt37$hypernym_linked_to_);
                                                        cb_form(mapped_hypernym, ZERO_INTEGER, NIL);
                                                        html_indent(ONE_INTEGER);
                                                        html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        html_princ($str_alt39$not_linked_);
                                                        html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    html_newline(UNPROVIDED);
                                    html_princ(wordnet_import.wni_synset_gloss(synset));
                                    {
                                        SubLObject cdolist_list_var = wordnet_import.wni_synset_example_phrases(synset);
                                        SubLObject example_phrase = NIL;
                                        for (example_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , example_phrase = cdolist_list_var.first()) {
                                            html_princ($str_alt25$___);
                                            html_princ(example_phrase);
                                            html_princ($str_alt26$_);
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
                        }
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            return NIL;
        }
    }

    /**
     * Outputs the synset words, gloss and examples and must be contained in a form.
     *
     * @param synset
     * 		: naut-p
     */
    @LispMethod(comment = "Outputs the synset words, gloss and examples and must be contained in a form.\r\n\r\n@param synset\r\n\t\t: naut-p")
    public static SubLObject wni_html_synset_words_gloss_examples_for_cb_browser(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
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

    /**
     * Emits the HTML hyperlinks for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Emits the HTML hyperlinks for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static final SubLObject wni_synset_links_for_cb_browser_alt(SubLObject synset) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(synset, NAUT_P);
            {
                SubLObject words = wordnet_import.wni_synset_words(synset);
                SubLObject first_wordP = T;
                SubLObject wordnet_url = cconcatenate($str_alt30$http___www_cogsci_princeton_edu_c, string_utilities.string_substitute($str_alt31$_, $str_alt32$_, words.first(), UNPROVIDED));
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(wordnet_url);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_image_head$.getGlobalValue());
                        html_markup(html_macros.$html_image_src$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str_alt41$_cycdoc_img_cb_wordnet_browser_gi);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (true) {
                            html_markup(html_macros.$html_image_alt$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str_alt42$_WordNet_);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        if (true) {
                            html_markup(html_macros.$html_image_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        {
                            SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
                            }
                        }
                        html_markup(html_macros.$html_image_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                html_princ($str_alt43$__);
                {
                    SubLObject cdolist_list_var = words;
                    SubLObject word = NIL;
                    for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                        if (NIL != first_wordP) {
                            first_wordP = NIL;
                        } else {
                            html_princ($str_alt29$___);
                        }
                        {
                            SubLObject search_url = cconcatenate($str_alt44$cg_cb_handle_specify_query_, string_utilities.string_substitute($str_alt31$_, $str_alt32$_, word, UNPROVIDED));
                            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(search_url);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (true) {
                                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$main);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            {
                                SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(word);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                                }
                            }
                            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
                        }
                    }
                }
                html_princ($str_alt34$_);
            }
            return NIL;
        }
    }

    /**
     * Emits the HTML hyperlinks for the given SYNSET.
     *
     * @param synset
     * 		; naut-p
     */
    @LispMethod(comment = "Emits the HTML hyperlinks for the given SYNSET.\r\n\r\n@param synset\r\n\t\t; naut-p")
    public static SubLObject wni_synset_links_for_cb_browser(final SubLObject synset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
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

    /**
     * Returns a string encoding the given list of terms in a form suitable for a hidden input field.
     * See also wni-decode-terms-from-hidden-input.
     *
     * @param terms
     * 		: listp
     * @return stringp
     */
    @LispMethod(comment = "Returns a string encoding the given list of terms in a form suitable for a hidden input field.\r\nSee also wni-decode-terms-from-hidden-input.\r\n\r\n@param terms\r\n\t\t: listp\r\n@return stringp\nReturns a string encoding the given list of terms in a form suitable for a hidden input field.\nSee also wni-decode-terms-from-hidden-input.")
    public static final SubLObject wni_encode_terms_for_hidden_input_alt(SubLObject terms) {
        {
            SubLObject list_var = terms;
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
            SubLObject string = $str_alt47$;
            SubLObject first_termP = T;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                if (NIL != first_termP) {
                    first_termP = NIL;
                } else {
                    string = cconcatenate(string, $str_alt32$_);
                }
                string = cconcatenate(string, cb_fort_identifier(v_term));
            }
            SubLTrampolineFile.checkType(string, STRINGP);
            return string;
        }
    }

    /**
     * Returns a string encoding the given list of terms in a form suitable for a hidden input field.
     * See also wni-decode-terms-from-hidden-input.
     *
     * @param terms
     * 		: listp
     * @return stringp
     */
    @LispMethod(comment = "Returns a string encoding the given list of terms in a form suitable for a hidden input field.\r\nSee also wni-decode-terms-from-hidden-input.\r\n\r\n@param terms\r\n\t\t: listp\r\n@return stringp\nReturns a string encoding the given list of terms in a form suitable for a hidden input field.\nSee also wni-decode-terms-from-hidden-input.")
    public static SubLObject wni_encode_terms_for_hidden_input(final SubLObject terms) {
        assert NIL != list_utilities.non_dotted_list_p(terms) : "! list_utilities.non_dotted_list_p(terms) " + ("list_utilities.non_dotted_list_p(terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(terms) ") + terms;
        SubLObject cdolist_list_var = terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
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
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return string;
    }/**
     * Returns a string encoding the given list of terms in a form suitable for a hidden input field.
     * See also wni-decode-terms-from-hidden-input.
     *
     * @param terms
     * 		: listp
     * @return stringp
     */


    /**
     * Returns a list of terms decoded from the given string.  See also wni-encode-terms-for-hidden-input.
     *
     * @param string
     * 		: stringp
     * @return listp
     */
    @LispMethod(comment = "Returns a list of terms decoded from the given string.  See also wni-encode-terms-for-hidden-input.\r\n\r\n@param string\r\n\t\t: stringp\r\n@return listp")
    public static final SubLObject wni_decode_terms_from_hidden_input_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(string, STRINGP);
            {
                SubLObject terms = NIL;
                {
                    SubLObject _prev_bind_0 = string_utilities.$test_char$.currentBinding(thread);
                    try {
                        string_utilities.$test_char$.bind(string_utilities.$space_char$.getGlobalValue(), thread);
                        {
                            SubLObject word_list_var = string_utilities.break_words(string, NOT_TEST_CHAR, UNPROVIDED);
                            SubLObject cdolist_list_var = word_list_var;
                            SubLObject id_string = NIL;
                            for (id_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , id_string = cdolist_list_var.first()) {
                                {
                                    SubLObject ignore_errors_tag = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                try {
                                                    terms = cons(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_identifier_to_fort(id_string), terms);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                    }
                                }
                            }
                        }
                    } finally {
                        string_utilities.$test_char$.rebind(_prev_bind_0, thread);
                    }
                }
                terms = nreverse(terms);
                SubLTrampolineFile.checkType(terms, LISTP);
                return terms;
            }
        }
    }

    /**
     * Returns a list of terms decoded from the given string.  See also wni-encode-terms-for-hidden-input.
     *
     * @param string
     * 		: stringp
     * @return listp
     */
    @LispMethod(comment = "Returns a list of terms decoded from the given string.  See also wni-encode-terms-for-hidden-input.\r\n\r\n@param string\r\n\t\t: stringp\r\n@return listp")
    public static SubLObject wni_decode_terms_from_hidden_input(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
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
        assert NIL != listp(terms) : "! listp(terms) " + ("Types.listp(terms) " + "CommonSymbols.NIL != Types.listp(terms) ") + terms;
        return terms;
    }/**
     * Returns a list of terms decoded from the given string.  See also wni-encode-terms-for-hidden-input.
     *
     * @param string
     * 		: stringp
     * @return listp
     */


    /**
     * Returns the fort identified by the given string.
     *
     * @param id-string
     * 		: stringp, of the form cN...N or nartN...N
     * @return fort-p
     */
    @LispMethod(comment = "Returns the fort identified by the given string.\r\n\r\n@param id-string\r\n\t\t: stringp, of the form cN...N or nartN...N\r\n@return fort-p")
    public static final SubLObject wni_identifier_to_fort_alt(SubLObject id_string) {
        {
            SubLObject fort = (NIL != string_utilities.starts_with(id_string, $cb_constant_id_prefix$.getGlobalValue())) ? ((SubLObject) (constants_high.find_constant_by_internal_id(read_from_string(string_utilities.pre_remove(id_string, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) : nart_handles.find_nart_by_id(read_from_string(string_utilities.pre_remove(id_string, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLTrampolineFile.checkType(fort, FORT_P);
            return fort;
        }
    }

    @LispMethod(comment = "Returns the fort identified by the given string.\r\n\r\n@param id-string\r\n\t\t: stringp, of the form cN...N or nartN...N\r\n@return fort-p")
    public static SubLObject wni_identifier_to_fort(final SubLObject id_string) {
        final SubLObject fort = (NIL != string_utilities.starts_with(id_string, $cb_constant_id_prefix$.getGlobalValue())) ? constants_high.find_constant_by_internal_id(read_from_string(string_utilities.pre_remove(id_string, $cb_constant_id_prefix$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) : nart_handles.find_nart_by_id(read_from_string(string_utilities.pre_remove(id_string, $cb_nart_id_prefix$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        assert NIL != forts.fort_p(fort) : "! forts.fort_p(fort) " + ("forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) ") + fort;
        return fort;
    }/**
     * Returns the fort identified by the given string.
     *
     * @param id-string
     * 		: stringp, of the form cN...N or nartN...N
     * @return fort-p
     */


    /**
     * Returns the terms that might match the given WordNet SYNSET based upon the
     * appearance of synset words in a Cyc term name or comment.
     *
     * @param synset
     * 		; WordNet synset for which to suggest corresponding Cyc terms
     * @param collection?
     * 		; T if answers are constrained to be collections, NIL if
     * 		answers are constrained to be individuals.
     * @return list ; list of forts that are candidates for matching
     */
    @LispMethod(comment = "Returns the terms that might match the given WordNet SYNSET based upon the\r\nappearance of synset words in a Cyc term name or comment.\r\n\r\n@param synset\r\n\t\t; WordNet synset for which to suggest corresponding Cyc terms\r\n@param collection?\r\n\t\t; T if answers are constrained to be collections, NIL if\r\n\t\tanswers are constrained to be individuals.\r\n@return list ; list of forts that are candidates for matching\nReturns the terms that might match the given WordNet SYNSET based upon the\nappearance of synset words in a Cyc term name or comment.")
    public static final SubLObject wni_string_synset_term_matches_alt(SubLObject synset, SubLObject collectionP) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(collectionP, BOOLEANP);
        {
            SubLObject synset_words = wordnet_import.wni_synset_words(synset);
            SubLObject terms = NIL;
            SubLObject ans = NIL;
            {
                SubLObject cdolist_list_var = synset_words;
                SubLObject synset_word = NIL;
                for (synset_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , synset_word = cdolist_list_var.first()) {
                    terms = cb_frames.terms_for_browsing(synset_word, T, NIL);
                    {
                        SubLObject cdolist_list_var_7 = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , v_term = cdolist_list_var_7.first()) {
                            if (NIL != fort_p(v_term)) {
                                {
                                    SubLObject item_var = v_term;
                                    if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        ans = cons(item_var, ans);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ans = (NIL != collectionP) ? ((SubLObject) (find_all_if(symbol_function($sym56$SET_OR_COLLECTION_), ans, UNPROVIDED))) : find_all_if(symbol_function($sym57$INDIVIDUAL_), ans, UNPROVIDED);
            {
                SubLObject list_var = ans;
                SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
                {
                    SubLObject cdolist_list_var = list_var;
                    SubLObject elem = NIL;
                    for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                        SubLTrampolineFile.checkType(elem, FORT_P);
                    }
                }
            }
            return ans;
        }
    }

    @LispMethod(comment = "Returns the terms that might match the given WordNet SYNSET based upon the\r\nappearance of synset words in a Cyc term name or comment.\r\n\r\n@param synset\r\n\t\t; WordNet synset for which to suggest corresponding Cyc terms\r\n@param collection?\r\n\t\t; T if answers are constrained to be collections, NIL if\r\n\t\tanswers are constrained to be individuals.\r\n@return list ; list of forts that are candidates for matching\nReturns the terms that might match the given WordNet SYNSET based upon the\nappearance of synset words in a Cyc term name or comment.")
    public static SubLObject wni_string_synset_term_matches(final SubLObject synset, final SubLObject collectionP) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != booleanp(collectionP) : "! booleanp(collectionP) " + ("Types.booleanp(collectionP) " + "CommonSymbols.NIL != Types.booleanp(collectionP) ") + collectionP;
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
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "! list_utilities.non_dotted_list_p(list_var) " + ("list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) ") + list_var;
        SubLObject cdolist_list_var2 = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
            cdolist_list_var2 = cdolist_list_var2.rest();
            elem = cdolist_list_var2.first();
        } 
        return ans;
    }/**
     * Returns the terms that might match the given WordNet SYNSET based upon the
     * appearance of synset words in a Cyc term name or comment.
     *
     * @param synset
     * 		; WordNet synset for which to suggest corresponding Cyc terms
     * @param collection?
     * 		; T if answers are constrained to be collections, NIL if
     * 		answers are constrained to be individuals.
     * @return list ; list of forts that are candidates for matching
     */


    /**
     * Completes the workflow processing in the case where the WordNet synset matches
     * an existing Cyc term.
     *
     * @param synset
     * 		; naut-p, the WordNet synset to be matched
     * @unknown ; fort-p, the matched term
     * @unknown ; alist-p, the new word characteristics association list
     */
    @LispMethod(comment = "Completes the workflow processing in the case where the WordNet synset matches\r\nan existing Cyc term.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet synset to be matched\r\n@unknown ; fort-p, the matched term\r\n@unknown ; alist-p, the new word characteristics association list\nCompletes the workflow processing in the case where the WordNet synset matches\nan existing Cyc term.")
    public static final SubLObject wni_complete_after_concept_match_alt(SubLObject synset, SubLObject genl_terms, SubLObject matched_term, SubLObject workflow_alist, SubLObject nowP) {
        SubLTrampolineFile.checkType(synset, NAUT_P);
        SubLTrampolineFile.checkType(matched_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_complete_after_comment_existing_term(synset, genl_terms, matched_term, workflow_alist, NIL, nowP);
        return NIL;
    }

    @LispMethod(comment = "Completes the workflow processing in the case where the WordNet synset matches\r\nan existing Cyc term.\r\n\r\n@param synset\r\n\t\t; naut-p, the WordNet synset to be matched\r\n@unknown ; fort-p, the matched term\r\n@unknown ; alist-p, the new word characteristics association list\nCompletes the workflow processing in the case where the WordNet synset matches\nan existing Cyc term.")
    public static SubLObject wni_complete_after_concept_match(final SubLObject synset, final SubLObject genl_terms, final SubLObject matched_term, final SubLObject workflow_alist, final SubLObject nowP) {
        assert NIL != narts_high.naut_p(synset) : "! narts_high.naut_p(synset) " + ("narts_high.naut_p(synset) " + "CommonSymbols.NIL != narts_high.naut_p(synset) ") + synset;
        assert NIL != forts.fort_p(matched_term) : "! forts.fort_p(matched_term) " + ("forts.fort_p(matched_term) " + "CommonSymbols.NIL != forts.fort_p(matched_term) ") + matched_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        wni_complete_after_comment_existing_term(synset, genl_terms, matched_term, workflow_alist, NIL, nowP);
        return NIL;
    }/**
     * Completes the workflow processing in the case where the WordNet synset matches
     * an existing Cyc term.
     *
     * @param synset
     * 		; naut-p, the WordNet synset to be matched
     * @unknown ; fort-p, the matched term
     * @unknown ; alist-p, the new word characteristics association list
     */


    /**
     * Completes the import processing for the given SYNSET, for an existing term and comment.
     * given term.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param term
     * 		; fort-p
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     */
    @LispMethod(comment = "Completes the import processing for the given SYNSET, for an existing term and comment.\r\ngiven term.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param term\r\n\t\t; fort-p\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\nCompletes the import processing for the given SYNSET, for an existing term and comment.\ngiven term.")
    public static final SubLObject wni_complete_after_comment_existing_term_alt(SubLObject synset, SubLObject genl_terms, SubLObject v_term, SubLObject workflow_alist, SubLObject comment, SubLObject nowP) {
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
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        if (NIL != comment) {
            SubLTrampolineFile.checkType(comment, STRINGP);
        }
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        agenda.halt_agenda(UNPROVIDED);
        {
            SubLObject error_message = NIL;
            SubLObject doneP = NIL;
            SubLObject retry_count = TEN_INTEGER;
            while (NIL == doneP) {
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_complete_after_comment_existing_term_helper(synset, genl_terms, v_term, workflow_alist, comment, nowP);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if ((NIL != error_message) && retry_count.numG(ZERO_INTEGER)) {
                    retry_count = subtract(retry_count, ONE_INTEGER);
                    format(T, $str_alt59$retrying_sdbc_connection_timeout_, error_message);
                    sleep(ONE_INTEGER);
                } else {
                    doneP = T;
                }
            } 
        }
        return NIL;
    }

    @LispMethod(comment = "Completes the import processing for the given SYNSET, for an existing term and comment.\r\ngiven term.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param term\r\n\t\t; fort-p\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\nCompletes the import processing for the given SYNSET, for an existing term and comment.\ngiven term.")
    public static SubLObject wni_complete_after_comment_existing_term(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
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
    }/**
     * Completes the import processing for the given SYNSET, for an existing term and comment.
     * given term.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param term
     * 		; fort-p
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     */


    /**
     * Completes the import processing for the given SYNSET, for an existing term and comment.
     * given term.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param term
     * 		; fort-p
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     */
    @LispMethod(comment = "Completes the import processing for the given SYNSET, for an existing term and comment.\r\ngiven term.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param term\r\n\t\t; fort-p\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\nCompletes the import processing for the given SYNSET, for an existing term and comment.\ngiven term.")
    public static final SubLObject wni_complete_after_comment_existing_term_helper_alt(SubLObject synset, SubLObject genl_terms, SubLObject v_term, SubLObject workflow_alist, SubLObject comment, SubLObject nowP) {
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
        SubLTrampolineFile.checkType(v_term, FORT_P);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        if (NIL != comment) {
            SubLTrampolineFile.checkType(comment, STRINGP);
        }
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        wordnet_import.wni_unassert_import_status($const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
        if (NIL != alist_lookup(workflow_alist, $str_alt61$unmapped_hypernym_chain, EQUAL, UNPROVIDED)) {
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
        if (!((NIL != isa.isaP(v_term, $$ResearchCycConstant, UNPROVIDED, UNPROVIDED)) || (NIL != nart_handles.nart_p(v_term)))) {
            wordnet_import.wni_assert_quoted_isa_workflow_constant(v_term, UNPROVIDED);
        }
        wordnet_import.wni_unlock_synset(synset, nowP);
        return NIL;
    }

    @LispMethod(comment = "Completes the import processing for the given SYNSET, for an existing term and comment.\r\ngiven term.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param term\r\n\t\t; fort-p\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\nCompletes the import processing for the given SYNSET, for an existing term and comment.\ngiven term.")
    public static SubLObject wni_complete_after_comment_existing_term_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject v_term, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        if (((NIL != comment) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(comment))) {
            throw new AssertionError(comment);
        }
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
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
    }/**
     * Completes the import processing for the given SYNSET, for an existing term and comment.
     * given term.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param term
     * 		; fort-p
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     */


    /**
     * Completes the import processing for the given SYNSET, for a new term and comment.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param name
     * 		; stringp
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     * @param now
     * 		; booleanp
     * @return fort-p, the new term
     */
    @LispMethod(comment = "Completes the import processing for the given SYNSET, for a new term and comment.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param name\r\n\t\t; stringp\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\r\n@param now\r\n\t\t; booleanp\r\n@return fort-p, the new term")
    public static final SubLObject wni_complete_after_comment_alt(SubLObject synset, SubLObject genl_terms, SubLObject name, SubLObject workflow_alist, SubLObject comment, SubLObject nowP) {
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
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(comment, STRINGP);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        agenda.halt_agenda(UNPROVIDED);
        {
            SubLObject new_term = NIL;
            SubLObject error_message = NIL;
            SubLObject doneP = NIL;
            SubLObject retry_count = TEN_INTEGER;
            while (NIL == doneP) {
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                new_term = com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_complete_after_comment_helper(synset, genl_terms, name, workflow_alist, comment, nowP);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if ((NIL != error_message) && retry_count.numG(ZERO_INTEGER)) {
                    retry_count = subtract(retry_count, ONE_INTEGER);
                    format(T, $str_alt64$retrying_sdbc_connection_timeout_, error_message);
                    sleep(ONE_INTEGER);
                } else {
                    doneP = T;
                }
            } 
            SubLTrampolineFile.checkType(new_term, FORT_P);
            return new_term;
        }
    }

    @LispMethod(comment = "Completes the import processing for the given SYNSET, for a new term and comment.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param name\r\n\t\t; stringp\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\r\n@param now\r\n\t\t; booleanp\r\n@return fort-p, the new term")
    public static SubLObject wni_complete_after_comment(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
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
        assert NIL != forts.fort_p(new_term) : "! forts.fort_p(new_term) " + ("forts.fort_p(new_term) " + "CommonSymbols.NIL != forts.fort_p(new_term) ") + new_term;
        return new_term;
    }/**
     * Completes the import processing for the given SYNSET, for a new term and comment.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param name
     * 		; stringp
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     * @param now
     * 		; booleanp
     * @return fort-p, the new term
     */


    /**
     * Completes the import processing for the given SYNSET, for a new term and comment.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param name
     * 		; stringp
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     * @param now
     * 		; booleanp
     * @return fort-p, the new term
     */
    @LispMethod(comment = "Completes the import processing for the given SYNSET, for a new term and comment.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param name\r\n\t\t; stringp\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\r\n@param now\r\n\t\t; booleanp\r\n@return fort-p, the new term")
    public static final SubLObject wni_complete_after_comment_helper_alt(SubLObject synset, SubLObject genl_terms, SubLObject name, SubLObject workflow_alist, SubLObject comment, SubLObject nowP) {
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
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(workflow_alist, ALIST_P);
        SubLTrampolineFile.checkType(comment, STRINGP);
        SubLTrampolineFile.checkType(nowP, BOOLEANP);
        {
            SubLObject new_term = wordnet_import.wni_create_now(name);
            SubLObject essential_assertions_nowP = makeBoolean((NIL != nowP) || (NIL != alist_lookup(workflow_alist, $str_alt61$unmapped_hypernym_chain, EQUAL, UNPROVIDED)));
            if (NIL == valid_constantP(new_term, UNPROVIDED)) {
                cb_error(cconcatenate($str_alt65$cannot_create_new_term_for_, name), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            wordnet_import.wni_unassert_import_status($const60$WordNetSynsetImportStatus_ReadyFo, synset, nowP);
            if (NIL != wordnet_import.wni_synset_collectionP(synset)) {
                wordnet_import.wni_assert_isa(new_term, list(com.cyc.cycjava.cycl.wordnet_import.cb_wordnet_utilities.wni_best_collection_isa(genl_terms)), essential_assertions_nowP);
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
            SubLTrampolineFile.checkType(new_term, FORT_P);
            return new_term;
        }
    }

    @LispMethod(comment = "Completes the import processing for the given SYNSET, for a new term and comment.\r\n\r\n@param synset\r\n\t\t; naut-p\r\n@param genl-terms\r\n\t\t; list of fort-p\r\n@param name\r\n\t\t; stringp\r\n@param workflow-alist\r\n\t\t; alist-p\r\n@param comment\r\n\t\t; stringp\r\n@param now\r\n\t\t; booleanp\r\n@return fort-p, the new term")
    public static SubLObject wni_complete_after_comment_helper(final SubLObject synset, final SubLObject genl_terms, final SubLObject name, final SubLObject workflow_alist, final SubLObject comment, final SubLObject nowP) {
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
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.alist_p(workflow_alist) : "! list_utilities.alist_p(workflow_alist) " + ("list_utilities.alist_p(workflow_alist) " + "CommonSymbols.NIL != list_utilities.alist_p(workflow_alist) ") + workflow_alist;
        assert NIL != stringp(comment) : "! stringp(comment) " + ("Types.stringp(comment) " + "CommonSymbols.NIL != Types.stringp(comment) ") + comment;
        assert NIL != booleanp(nowP) : "! booleanp(nowP) " + ("Types.booleanp(nowP) " + "CommonSymbols.NIL != Types.booleanp(nowP) ") + nowP;
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
        assert NIL != forts.fort_p(new_term) : "! forts.fort_p(new_term) " + ("forts.fort_p(new_term) " + "CommonSymbols.NIL != forts.fort_p(new_term) ") + new_term;
        return new_term;
    }/**
     * Completes the import processing for the given SYNSET, for a new term and comment.
     *
     * @param synset
     * 		; naut-p
     * @param genl-terms
     * 		; list of fort-p
     * @param name
     * 		; stringp
     * @param workflow-alist
     * 		; alist-p
     * @param comment
     * 		; stringp
     * @param now
     * 		; booleanp
     * @return fort-p, the new term
     */


    /**
     * Heuristically finds the strongest isa term for a new term given its set of GENL-TERMS.
     */
    @LispMethod(comment = "Heuristically finds the strongest isa term for a new term given its set of GENL-TERMS.")
    public static final SubLObject wni_best_collection_isa_alt(SubLObject genl_terms) {
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
            SubLObject cdolist_list_var = genl_terms;
            SubLObject genl_term = NIL;
            for (genl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_term = cdolist_list_var.first()) {
                if (NIL != isa.isaP(genl_term, $$ExistingObjectType, UNPROVIDED, UNPROVIDED)) {
                    return $$ExistingObjectType;
                }
            }
        }
        {
            SubLObject cdolist_list_var = genl_terms;
            SubLObject genl_term = NIL;
            for (genl_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl_term = cdolist_list_var.first()) {
                if (NIL != genls.genlsP(genl_term, $$Individual, UNPROVIDED, UNPROVIDED)) {
                    return $$FirstOrderCollection;
                }
            }
        }
        return $$Collection;
    }

    @LispMethod(comment = "Heuristically finds the strongest isa term for a new term given its set of GENL-TERMS.")
    public static SubLObject wni_best_collection_isa(final SubLObject genl_terms) {
        assert NIL != list_utilities.non_dotted_list_p(genl_terms) : "! list_utilities.non_dotted_list_p(genl_terms) " + ("list_utilities.non_dotted_list_p(genl_terms) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(genl_terms) ") + genl_terms;
        SubLObject cdolist_list_var = genl_terms;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != forts.fort_p(elem) : "! forts.fort_p(elem) " + ("forts.fort_p(elem) " + "CommonSymbols.NIL != forts.fort_p(elem) ") + elem;
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
    }/**
     * Heuristically finds the strongest isa term for a new term given its set of GENL-TERMS.
     */


    public static SubLObject declare_cb_wordnet_utilities_file() {
        declareFunction("ensure_wn_sks_registered", "ENSURE-WN-SKS-REGISTERED", 0, 0, false);
        declareFunction("wni_html_termXcomment", "WNI-HTML-TERM&COMMENT", 2, 0, false);
        declareFunction("wni_html_up_arrow", "WNI-HTML-UP-ARROW", 1, 0, false);
        declareFunction("wni_html_synset_words_gloss_examples", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES", 1, 2, false);
        declareFunction("wni_synset_links", "WNI-SYNSET-LINKS", 1, 1, false);
        declareFunction("wni_html_synset_words_gloss_examples_for_cb_browser", "WNI-HTML-SYNSET-WORDS-GLOSS-EXAMPLES-FOR-CB-BROWSER", 1, 0, false);
        declareFunction("wni_synset_links_for_cb_browser", "WNI-SYNSET-LINKS-FOR-CB-BROWSER", 1, 0, false);
        declareFunction("wni_encode_terms_for_hidden_input", "WNI-ENCODE-TERMS-FOR-HIDDEN-INPUT", 1, 0, false);
        declareFunction("wni_decode_terms_from_hidden_input", "WNI-DECODE-TERMS-FROM-HIDDEN-INPUT", 1, 0, false);
        declareFunction("wni_identifier_to_fort", "WNI-IDENTIFIER-TO-FORT", 1, 0, false);
        declareFunction("wni_string_synset_term_matches", "WNI-STRING-SYNSET-TERM-MATCHES", 2, 0, false);
        declareFunction("wni_complete_after_concept_match", "WNI-COMPLETE-AFTER-CONCEPT-MATCH", 5, 0, false);
        declareFunction("wni_complete_after_comment_existing_term", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM", 6, 0, false);
        declareFunction("wni_complete_after_comment_existing_term_helper", "WNI-COMPLETE-AFTER-COMMENT-EXISTING-TERM-HELPER", 6, 0, false);
        declareFunction("wni_complete_after_comment", "WNI-COMPLETE-AFTER-COMMENT", 6, 0, false);
        declareFunction("wni_complete_after_comment_helper", "WNI-COMPLETE-AFTER-COMMENT-HELPER", 6, 0, false);
        declareFunction("wni_best_collection_isa", "WNI-BEST-COLLECTION-ISA", 1, 0, false);
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

    static {
    }

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("WordNet2_0-KS"));

    static private final SubLString $str_alt9$__ = makeString(": ");

    static private final SubLList $list_alt12 = list(makeKeyword("GENLS"), makeKeyword("ISA"), makeKeyword("HYPERNYM"));

    static private final SubLString $str_alt13$_A_is_an_invalid_arrow_type = makeString("~A is an invalid arrow-type");

    static private final SubLString $str_alt14$_cycdoc_img_cyc_arrow_up_big_gif = makeString("/cycdoc/img/cyc-arrow-up-big.gif");

    static private final SubLString $str_alt15$_Indicates_the_more_general_conce = makeString("[Indicates the more general concept]");

    static private final SubLString $str_alt25$___ = makeString("; \"");

    static private final SubLString $str_alt26$_ = makeString("\"");

    static private final SubLString $str_alt28$_ = makeString("(");

    static private final SubLString $str_alt29$___ = makeString(" | ");

    static private final SubLString $str_alt30$http___www_cogsci_princeton_edu_c = makeString("http://www.cogsci.princeton.edu/cgi-bin/webwn2.0?stage=1&amp;word=");

    static private final SubLString $str_alt31$_ = makeString("+");

    static private final SubLString $str_alt32$_ = makeString(" ");

    static private final SubLString $str_alt34$_ = makeString(")");

    static private final SubLString $str_alt36$____ = makeString("--->");

    static private final SubLString $str_alt37$hypernym_linked_to_ = makeString("hypernym linked to ");

    static private final SubLString $str_alt39$not_linked_ = makeString("not linked ");

    static private final SubLString $str_alt41$_cycdoc_img_cb_wordnet_browser_gi = makeString("/cycdoc/img/cb/wordnet-browser.gif");

    static private final SubLString $str_alt42$_WordNet_ = makeString("[WordNet]");

    static private final SubLString $str_alt43$__ = makeString(" (");

    static private final SubLString $str_alt44$cg_cb_handle_specify_query_ = makeString("cg?cb-handle-specify&query=");

    static private final SubLString $str_alt59$retrying_sdbc_connection_timeout_ = makeString("retrying sdbc connection timeout: ~A~%");

    static private final SubLString $str_alt61$unmapped_hypernym_chain = makeString("unmapped-hypernym-chain");

    static private final SubLString $str_alt64$retrying_sdbc_connection_timeout_ = makeString("retrying sdbc connection timeout: ~a~%");

    static private final SubLString $str_alt65$cannot_create_new_term_for_ = makeString("cannot create new term for ");
}

/**
 * Total time: 276 ms synthetic
 */
