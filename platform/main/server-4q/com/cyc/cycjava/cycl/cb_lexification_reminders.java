package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_lexification_reminders extends SubLTranslatedFile {
    public static final SubLFile me = new cb_lexification_reminders();

    public static final String myName = "com.cyc.cycjava.cycl.cb_lexification_reminders";

    public static final String myFingerPrint = "a1a9b012a81254261726eb57e3e1b0f06750d48f4412b215694bee65507f5bc3";

    // defconstant
    public static final SubLSymbol $lexify_link_text$ = makeSymbol("*LEXIFY-LINK-TEXT*");

    private static final SubLList $list0 = list(makeKeyword("SUMMARY-FN"), makeSymbol("SUMMARIZE-LEX-TODO"), makeKeyword("DISPLAY-FN"), makeSymbol("DISPLAY-LEX-TODO"), makeKeyword("HANDLER-FN"), makeSymbol("HANDLE-LEX-TODO"));



    private static final SubLString $$$Perform_lexification_for_ = makeString("Perform lexification for ");

    private static final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");

    public static final SubLSymbol DISPLAY_LEX_TODO = makeSymbol("DISPLAY-LEX-TODO");



    private static final SubLSymbol HANDLE_LEX_TODO = makeSymbol("HANDLE-LEX-TODO");

    private static final SubLString $str7$_Lexify_ = makeString("[Lexify]");



    private static final SubLString $str9$_A__A = makeString("~A&~A");

    private static final SubLString $str10$lexify_term_with_id = makeString("lexify-term-with-id");



    private static final SubLSymbol CB_LINK_LEXIFY_TERM = makeSymbol("CB-LINK-LEXIFY-TERM");

    private static final SubLString $str13$sme_lexify_term_with_id = makeString("sme-lexify-term-with-id");

    private static final SubLSymbol $SME_LEXIFY_TERM = makeKeyword("SME-LEXIFY-TERM");

    private static final SubLSymbol CB_LINK_SME_LEXIFY_TERM = makeSymbol("CB-LINK-SME-LEXIFY-TERM");

    private static final SubLString $str16$oe_lexify_term_with_id = makeString("oe-lexify-term-with-id");

    private static final SubLSymbol $OE_LEXIFY_TERM = makeKeyword("OE-LEXIFY-TERM");

    private static final SubLSymbol CB_LINK_OE_LEXIFY_TERM = makeSymbol("CB-LINK-OE-LEXIFY-TERM");

    private static final SubLSymbol LEXIFY_TERM_WITH_ID = makeSymbol("LEXIFY-TERM-WITH-ID");

    private static final SubLSymbol SME_LEXIFY_TERM_WITH_ID = makeSymbol("SME-LEXIFY-TERM-WITH-ID");

    private static final SubLSymbol OE_LEXIFY_TERM_WITH_ID = makeSymbol("OE-LEXIFY-TERM-WITH-ID");

    private static final SubLString $str22$Warning__ = makeString("Warning: ");

    private static final SubLString $str23$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    private static final SubLSymbol $lexwiz_defaults$ = makeSymbol("*LEXWIZ-DEFAULTS*");

    private static final SubLString $str25$ = makeString("");

    public static SubLObject summarize_lex_todo(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject cyc_term = (user_data.isList()) ? user_data.first() : user_data;
        html_princ($$$Perform_lexification_for_);
        cb_form(cyc_term, UNPROVIDED, UNPROVIDED);
        return T;
    }

    public static SubLObject display_lex_todo(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_string = args.first();
        final SubLObject user_action = user_actions.user_action_by_id_string(id_string);
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject cyc_term = (user_data.isList()) ? user_data.first() : user_data;
        final SubLObject phrase = (user_data.isList()) ? second(user_data) : NIL;
        lexification_wizard.init_lexification_wizard(UNPROVIDED);
        final SubLObject _prev_bind_0 = lexification_wizard.$lexwiz_defaults$.currentBinding(thread);
        try {
            lexification_wizard.$lexwiz_defaults$.bind(lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)), thread);
            lexification_wizard._csetf_lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), lexification_utilities.string_for_fort(cyc_term));
            lexification_wizard._csetf_lexwiz_phrase(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), phrase);
            lexification_wizard._csetf_lexwiz_user_action(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), user_action);
            return invoke_preferred_lexification_wizard(UNPROVIDED);
        } finally {
            lexification_wizard.$lexwiz_defaults$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject handle_lex_todo(final SubLObject args) {
        return handle_preferred_lexification_wizard(args, UNPROVIDED);
    }

    public static SubLObject make_lexify_frame_link(final SubLObject link_label, final SubLObject v_term, SubLObject link_text) {
        if (link_text == UNPROVIDED) {
            link_text = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_id = cb_fort_identifier(v_term);
        final SubLObject term_label = (NIL != fort_id) ? fort_id : v_term;
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str9$_A__A, link_label, term_label);
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
            html_princ(NIL != link_text ? link_text : $lexify_link_text$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_link_lexify_term(final SubLObject v_term, SubLObject link_text, SubLObject include_bugzilla_linkP) {
        if (link_text == UNPROVIDED) {
            link_text = $lexify_link_text$.getGlobalValue();
        }
        if (include_bugzilla_linkP == UNPROVIDED) {
            include_bugzilla_linkP = NIL;
        }
        make_lexify_frame_link($str10$lexify_term_with_id, v_term, link_text);
        if (NIL != include_bugzilla_linkP) {
        }
        return NIL;
    }

    public static SubLObject cb_link_sme_lexify_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $lexify_link_text$.getGlobalValue();
        }
        return make_lexify_frame_link($str13$sme_lexify_term_with_id, v_term, linktext);
    }

    public static SubLObject cb_link_oe_lexify_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = $lexify_link_text$.getGlobalValue();
        }
        return make_lexify_frame_link($str16$oe_lexify_term_with_id, v_term, linktext);
    }

    public static SubLObject lexify_term_with_id(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return lexify_term_with_id_int(args, UNPROVIDED);
    }

    public static SubLObject sme_lexify_term_with_id(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_vars.$use_sme_lexwiz$.currentBinding(thread);
        try {
            lexicon_vars.$use_sme_lexwiz$.bind(T, thread);
            return lexify_term_with_id_int(args, UNPROVIDED);
        } finally {
            lexicon_vars.$use_sme_lexwiz$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject oe_lexify_term_with_id(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_vars.$use_sme_lexwiz$.currentBinding(thread);
        try {
            lexicon_vars.$use_sme_lexwiz$.bind(NIL, thread);
            return lexify_term_with_id_int(args, UNPROVIDED);
        } finally {
            lexicon_vars.$use_sme_lexwiz$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject lexify_term_with_id_int(SubLObject args, SubLObject use_sme_lexwizP) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (use_sme_lexwizP == UNPROVIDED) {
            use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = args.first();
        SubLObject v_object = lexification_wizard.get_lexification_object(id);
        lexification_wizard.init_lexification_wizard(UNPROVIDED);
        if (NIL == v_object) {
            if ((NIL == lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str22$Warning__, $str23$____assertion_failed___a______), $lexwiz_defaults$);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            final SubLObject fort = cb_guess_fort(id, UNPROVIDED);
            v_object = lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
            lexification_wizard._csetf_lexwiz_term(v_object, lexification_utilities.string_for_fort(fort));
            lexification_wizard._csetf_lexwiz_phrase(v_object, NIL != fort ? lexification_utilities.phrase_from_term(fort, UNPROVIDED) : $str25$);
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_very_verbose$.getGlobalValue());
        final SubLObject _prev_bind_0 = lexification_wizard.$lexwiz_defaults$.currentBinding(thread);
        try {
            lexification_wizard.$lexwiz_defaults$.bind(lexification_wizard.copy_lexification_parameters(v_object), thread);
            return invoke_preferred_lexification_wizard(use_sme_lexwizP);
        } finally {
            lexification_wizard.$lexwiz_defaults$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject is_sme_lexwiz_preferredP(SubLObject default_use_sme_lexwizP) {
        if (default_use_sme_lexwizP == UNPROVIDED) {
            default_use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_sme_lexwizP = default_use_sme_lexwizP;
        final SubLObject fort = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)));
        if (((NIL == use_sme_lexwizP) && (NIL != lexification_utilities.is_relationalP(fort))) && (NIL == lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread))) {
            use_sme_lexwizP = T;
        }
        return use_sme_lexwizP;
    }

    public static SubLObject invoke_preferred_lexification_wizard(SubLObject use_sme_lexwizP) {
        if (use_sme_lexwizP == UNPROVIDED) {
            use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexification_wizard.trace_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), lexification_utilities.$lex_very_verbose$.getGlobalValue());
        return NIL != is_sme_lexwiz_preferredP(use_sme_lexwizP) ? cb_sme_lexification_wizard.cb_invoke_sme_lexification_wizard(UNPROVIDED) : cb_lexification_wizard.cb_invoke_oe_lexification_wizard(UNPROVIDED);
    }

    public static SubLObject handle_preferred_lexification_wizard(final SubLObject args, SubLObject use_sme_lexwizP) {
        if (use_sme_lexwizP == UNPROVIDED) {
            use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        return NIL != is_sme_lexwiz_preferredP(use_sme_lexwizP) ? cb_sme_lexification_wizard.cb_handle_sme_lexification_wizard(args) : cb_lexification_wizard.cb_handle_oe_lexification_wizard(args);
    }

    public static SubLObject declare_cb_lexification_reminders_file() {
        declareFunction(me, "summarize_lex_todo", "SUMMARIZE-LEX-TODO", 1, 0, false);
        declareFunction(me, "display_lex_todo", "DISPLAY-LEX-TODO", 1, 0, false);
        declareFunction(me, "handle_lex_todo", "HANDLE-LEX-TODO", 1, 0, false);
        declareFunction(me, "make_lexify_frame_link", "MAKE-LEXIFY-FRAME-LINK", 2, 1, false);
        declareFunction(me, "cb_link_lexify_term", "CB-LINK-LEXIFY-TERM", 1, 2, false);
        declareFunction(me, "cb_link_sme_lexify_term", "CB-LINK-SME-LEXIFY-TERM", 1, 1, false);
        declareFunction(me, "cb_link_oe_lexify_term", "CB-LINK-OE-LEXIFY-TERM", 1, 1, false);
        declareFunction(me, "lexify_term_with_id", "LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction(me, "sme_lexify_term_with_id", "SME-LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction(me, "oe_lexify_term_with_id", "OE-LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction(me, "lexify_term_with_id_int", "LEXIFY-TERM-WITH-ID-INT", 0, 2, false);
        declareFunction(me, "is_sme_lexwiz_preferredP", "IS-SME-LEXWIZ-PREFERRED?", 0, 1, false);
        declareFunction(me, "invoke_preferred_lexification_wizard", "INVOKE-PREFERRED-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction(me, "handle_preferred_lexification_wizard", "HANDLE-PREFERRED-LEXIFICATION-WIZARD", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_cb_lexification_reminders_file() {
        defconstant("*LEXIFY-LINK-TEXT*", $str7$_Lexify_);
        return NIL;
    }

    public static SubLObject setup_cb_lexification_reminders_file() {
        final SubLObject new_action_type = user_actions.make_action_type($list0);
        user_actions._csetf_action_type_key(new_action_type, $LEXIFICATION_NEEDED);
        sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        html_macros.note_cgi_handler_function(DISPLAY_LEX_TODO, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(HANDLE_LEX_TODO, $HTML_HANDLER);
        setup_cb_link_method($LEXIFY_TERM, CB_LINK_LEXIFY_TERM, THREE_INTEGER);
        setup_cb_link_method($SME_LEXIFY_TERM, CB_LINK_SME_LEXIFY_TERM, TWO_INTEGER);
        setup_cb_link_method($OE_LEXIFY_TERM, CB_LINK_OE_LEXIFY_TERM, TWO_INTEGER);
        html_macros.note_cgi_handler_function(LEXIFY_TERM_WITH_ID, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(SME_LEXIFY_TERM_WITH_ID, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(OE_LEXIFY_TERM_WITH_ID, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_lexification_reminders_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_lexification_reminders_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_lexification_reminders_file();
    }

    
}

/**
 * Total time: 154 ms
 */
