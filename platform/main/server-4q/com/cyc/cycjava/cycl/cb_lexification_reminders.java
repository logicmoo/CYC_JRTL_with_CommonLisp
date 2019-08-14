/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_fort_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_head$;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_href$;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_tail$;
import static com.cyc.cycjava.cycl.html_macros.$html_anchor_target$;
import static com.cyc.cycjava.cycl.html_macros.$html_safe_print$;
import static com.cyc.cycjava.cycl.html_macros.$html_stream$;
import static com.cyc.cycjava.cycl.html_macros.note_html_handler_function;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CB-LEXIFICATION-REMINDERS
 * source file: /cyc/top/cycl/cb-lexification-reminders.lisp
 * created:     2019/07/03 17:38:23
 */
public final class cb_lexification_reminders extends SubLTranslatedFile implements V12 {
    /**
     * Invoke the SME lexification wizard
     *
     * @unknown This is a wrapper around @xref invoke-sme-lexification-wizard that accounts for feature dependencies
     */
    @LispMethod(comment = "Invoke the SME lexification wizard\r\n\r\n@unknown This is a wrapper around @xref invoke-sme-lexification-wizard that accounts for feature dependencies")
    public static final SubLObject cb_invoke_sme_lexification_wizard() {
        return cb_sme_lexification_wizard.invoke_sme_lexification_wizard(UNPROVIDED);
    }

    static private final SubLString $str_alt16$ = makeString("");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $use_sme_lexwiz$ = makeSymbol("*USE-SME-LEXWIZ*");

    public static final SubLFile me = new cb_lexification_reminders();

 public static final String myName = "com.cyc.cycjava.cycl.cb_lexification_reminders";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $lexify_link_text$ = makeSymbol("*LEXIFY-LINK-TEXT*");

    private static final SubLList $list0 = list(makeKeyword("SUMMARY-FN"), makeSymbol("SUMMARIZE-LEX-TODO"), makeKeyword("DISPLAY-FN"), makeSymbol("DISPLAY-LEX-TODO"), makeKeyword("HANDLER-FN"), makeSymbol("HANDLE-LEX-TODO"));

    private static final SubLString $$$Perform_lexification_for_ = makeString("Perform lexification for ");

    private static final SubLSymbol $sym3$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol DISPLAY_LEX_TODO = makeSymbol("DISPLAY-LEX-TODO");

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

    /**
     * Prepare HTML summary of user action for term lexification
     *
     * @unknown remove backward compatibility support for old user-action data format
     */
    @LispMethod(comment = "Prepare HTML summary of user action for term lexification\r\n\r\n@unknown remove backward compatibility support for old user-action data format")
    public static final SubLObject summarize_lex_todo_alt(SubLObject user_action_id_string) {
        {
            SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
            SubLObject user_data = user_actions.user_action_data(user_action);
            SubLObject cyc_term = (user_data.isList()) ? ((SubLObject) (user_data.first())) : user_data;
            html_princ($str_alt3$Perform_lexification_for_);
            cb_form(cyc_term, UNPROVIDED, UNPROVIDED);
            return T;
        }
    }

    /**
     * Prepare HTML summary of user action for term lexification
     *
     * @unknown remove backward compatibility support for old user-action data format
     */
    @LispMethod(comment = "Prepare HTML summary of user action for term lexification\r\n\r\n@unknown remove backward compatibility support for old user-action data format")
    public static SubLObject summarize_lex_todo(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject cyc_term = (user_data.isList()) ? user_data.first() : user_data;
        html_princ($$$Perform_lexification_for_);
        cb_form(cyc_term, UNPROVIDED, UNPROVIDED);
        return T;
    }

    /**
     * Handle the display of the lexification todo action by invoking the wizard on the cyc term
     *
     * @unknown remove backward compatibility support for old user-action data format
     */
    @LispMethod(comment = "Handle the display of the lexification todo action by invoking the wizard on the cyc term\r\n\r\n@unknown remove backward compatibility support for old user-action data format")
    public static final SubLObject display_lex_todo_alt(SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id_string = args.first();
                SubLObject user_action = user_actions.user_action_by_id_string(id_string);
                SubLObject user_data = user_actions.user_action_data(user_action);
                SubLObject cyc_term = (user_data.isList()) ? ((SubLObject) (user_data.first())) : user_data;
                SubLObject phrase = (user_data.isList()) ? ((SubLObject) (second(user_data))) : NIL;
                SubLObject result = NIL;
                lexification_wizard.init_lexification_wizard(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = lexification_wizard.$lexwiz_defaults$.currentBinding(thread);
                    try {
                        lexification_wizard.$lexwiz_defaults$.bind(lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)), thread);
                        lexification_wizard._csetf_lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), lexification_utilities.string_for_fort(cyc_term));
                        lexification_wizard._csetf_lexwiz_phrase(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), phrase);
                        lexification_wizard._csetf_lexwiz_user_action(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), user_action);
                        result = (NIL != lexification_wizard.$sme_lexwiz_active$.getDynamicValue(thread)) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_lexification_reminders.cb_invoke_sme_lexification_wizard())) : cb_lexification_wizard.invoke_lexification_wizard(UNPROVIDED);
                    } finally {
                        lexification_wizard.$lexwiz_defaults$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Handle the display of the lexification todo action by invoking the wizard on the cyc term
     *
     * @unknown remove backward compatibility support for old user-action data format
     */
    @LispMethod(comment = "Handle the display of the lexification todo action by invoking the wizard on the cyc term\r\n\r\n@unknown remove backward compatibility support for old user-action data format")
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

    /**
     * Handle the lexification todo processing via the underlying handler for the wizard
     */
    @LispMethod(comment = "Handle the lexification todo processing via the underlying handler for the wizard")
    public static final SubLObject handle_lex_todo_alt(SubLObject args) {
        return cb_lexification_wizard.handle_lexification_wizard(args);
    }

    /**
     * Handle the lexification todo processing via the underlying handler for the wizard
     */
    @LispMethod(comment = "Handle the lexification todo processing via the underlying handler for the wizard")
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

    /**
     * Define HTML link for lexifying TERM using the lexification assistant (lexifier) or the dictionary assistant (lexwiz)
     *
     * @unknown *use-sme-lexwiz* determines which lexification tool to use, as determined during link processing not link definition
     */
    @LispMethod(comment = "Define HTML link for lexifying TERM using the lexification assistant (lexifier) or the dictionary assistant (lexwiz)\r\n\r\n@unknown *use-sme-lexwiz* determines which lexification tool to use, as determined during link processing not link definition")
    public static final SubLObject cb_link_lexify_term_alt(SubLObject v_term, SubLObject linktext, SubLObject include_bugzilla_linkP) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (include_bugzilla_linkP == UNPROVIDED) {
            include_bugzilla_linkP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt6$_Lexify_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup($html_anchor_head$.getGlobalValue());
                html_markup($html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format($html_stream$.getDynamicValue(thread), $str_alt8$lexify_term_with_id__A, cb_fort_identifier(v_term));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup($html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $html_safe_print$.currentBinding(thread);
                    try {
                        $html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        $html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup($html_anchor_tail$.getGlobalValue());
            }
            if (NIL != include_bugzilla_linkP) {
                html_indent(ONE_INTEGER);
                cb_lexical_info.cb_bugzilla_lexicon_link(v_term);
            }
            return NIL;
        }
    }

    /**
     * Define HTML link for lexifying TERM using the lexification assistant (lexifier) or the dictionary assistant (lexwiz)
     *
     * @unknown *use-sme-lexwiz* determines which lexification tool to use, as determined during link processing not link definition
     */
    @LispMethod(comment = "Define HTML link for lexifying TERM using the lexification assistant (lexifier) or the dictionary assistant (lexwiz)\r\n\r\n@unknown *use-sme-lexwiz* determines which lexification tool to use, as determined during link processing not link definition")
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

    /**
     * Define HTML link for lexifying TERM using the dictionary assistant (lexwiz)
     */
    @LispMethod(comment = "Define HTML link for lexifying TERM using the dictionary assistant (lexwiz)")
    public static final SubLObject cb_link_sme_lexify_term_alt(SubLObject v_term, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == linktext) {
                linktext = $str_alt6$_Lexify_;
            }
            {
                SubLObject frame_name_var = cb_frame_name($MAIN);
                html_markup($html_anchor_head$.getGlobalValue());
                html_markup($html_anchor_href$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                cyc_cgi_url_int();
                format($html_stream$.getDynamicValue(thread), $str_alt11$sme_lexify_term_with_id__A, cb_fort_identifier(v_term));
                html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_markup($html_anchor_target$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(frame_name_var);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = $html_safe_print$.currentBinding(thread);
                    try {
                        $html_safe_print$.bind(T, thread);
                        html_princ(linktext);
                    } finally {
                        $html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_markup($html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     * Define HTML link for lexifying TERM using the dictionary assistant (lexwiz)
     */
    @LispMethod(comment = "Define HTML link for lexifying TERM using the dictionary assistant (lexwiz)")
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

    /**
     * Link handler for running lexwiz or lexifier w/ term in ARGS using term generation for phrase default
     *
     * @unknown the ARGS parameter should be a list with a string given the fort ID
     */
    @LispMethod(comment = "Link handler for running lexwiz or lexifier w/ term in ARGS using term generation for phrase default\r\n\r\n@unknown the ARGS parameter should be a list with a string given the fort ID")
    public static final SubLObject lexify_term_with_id_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject use_sme_lexwizP = makeBoolean((NIL != $use_sme_lexwiz$.getDynamicValue(thread)) && (NIL != lexification_wizard.$sme_lexwiz_active$.getDynamicValue(thread)));
                return com.cyc.cycjava.cycl.cb_lexification_reminders.lexify_term_with_id_int(args, use_sme_lexwizP);
            }
        }
    }

    @LispMethod(comment = "Link handler for running lexwiz or lexifier w/ term in ARGS using term generation for phrase default\r\n\r\n@unknown the ARGS parameter should be a list with a string given the fort ID")
    public static SubLObject lexify_term_with_id(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return lexify_term_with_id_int(args, UNPROVIDED);
    }/**
     * Link handler for running lexwiz or lexifier w/ term in ARGS using term generation for phrase default
     *
     * @unknown the ARGS parameter should be a list with a string given the fort ID
     */


    /**
     * Link handler for running lexwiz w/ term in ARGS using term generation for phrase default
     *
     * @unknown the ARGS parameter should be a list with a string given the fort ID
     */
    @LispMethod(comment = "Link handler for running lexwiz w/ term in ARGS using term generation for phrase default\r\n\r\n@unknown the ARGS parameter should be a list with a string given the fort ID")
    public static final SubLObject sme_lexify_term_with_id_alt(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return com.cyc.cycjava.cycl.cb_lexification_reminders.lexify_term_with_id_int(args, T);
    }

    @LispMethod(comment = "Link handler for running lexwiz w/ term in ARGS using term generation for phrase default\r\n\r\n@unknown the ARGS parameter should be a list with a string given the fort ID")
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
    }/**
     * Link handler for running lexwiz w/ term in ARGS using term generation for phrase default
     *
     * @unknown the ARGS parameter should be a list with a string given the fort ID
     */


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

    /**
     * Helper for @xref lexify-term-with-id and @xref sme-lexify-term-with-id
     *
     * @unknown the ARGS parameter should be a list with a string given the fort ID
     */
    @LispMethod(comment = "Helper for @xref lexify-term-with-id and @xref sme-lexify-term-with-id\r\n\r\n@unknown the ARGS parameter should be a list with a string given the fort ID")
    public static final SubLObject lexify_term_with_id_int_alt(SubLObject args, SubLObject use_sme_lexwizP) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (use_sme_lexwizP == UNPROVIDED) {
            use_sme_lexwizP = $use_sme_lexwiz$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = args.first();
                SubLObject v_term = cb_guess_fort(id, UNPROVIDED);
                SubLObject phrase = (NIL != v_term) ? ((SubLObject) (lexification_utilities.phrase_from_term(v_term, UNPROVIDED))) : $str_alt16$;
                SubLObject result = NIL;
                lexification_wizard.init_lexification_wizard(UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = lexification_wizard.$lexwiz_defaults$.currentBinding(thread);
                    try {
                        lexification_wizard.$lexwiz_defaults$.bind(lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)), thread);
                        lexification_wizard._csetf_lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), lexification_utilities.string_for_fort(v_term));
                        lexification_wizard._csetf_lexwiz_phrase(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), phrase);
                        result = (NIL != use_sme_lexwizP) ? ((SubLObject) (com.cyc.cycjava.cycl.cb_lexification_reminders.cb_invoke_sme_lexification_wizard())) : cb_lexification_wizard.invoke_lexification_wizard(UNPROVIDED);
                    } finally {
                        lexification_wizard.$lexwiz_defaults$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Helper for @xref lexify-term-with-id and @xref sme-lexify-term-with-id
     *
     * @unknown the ARGS parameter should be a list with a string given the fort ID
     */
    @LispMethod(comment = "Helper for @xref lexify-term-with-id and @xref sme-lexify-term-with-id\r\n\r\n@unknown the ARGS parameter should be a list with a string given the fort ID")
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

    public static final SubLObject declare_cb_lexification_reminders_file_alt() {
        declareFunction("summarize_lex_todo", "SUMMARIZE-LEX-TODO", 1, 0, false);
        declareFunction("display_lex_todo", "DISPLAY-LEX-TODO", 1, 0, false);
        declareFunction("handle_lex_todo", "HANDLE-LEX-TODO", 1, 0, false);
        declareFunction("cb_invoke_sme_lexification_wizard", "CB-INVOKE-SME-LEXIFICATION-WIZARD", 0, 0, false);
        declareFunction("cb_link_lexify_term", "CB-LINK-LEXIFY-TERM", 1, 2, false);
        declareFunction("cb_link_sme_lexify_term", "CB-LINK-SME-LEXIFY-TERM", 1, 1, false);
        declareFunction("lexify_term_with_id", "LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction("sme_lexify_term_with_id", "SME-LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction("lexify_term_with_id_int", "LEXIFY-TERM-WITH-ID-INT", 0, 2, false);
        return NIL;
    }

    public static SubLObject declare_cb_lexification_reminders_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("summarize_lex_todo", "SUMMARIZE-LEX-TODO", 1, 0, false);
            declareFunction("display_lex_todo", "DISPLAY-LEX-TODO", 1, 0, false);
            declareFunction("handle_lex_todo", "HANDLE-LEX-TODO", 1, 0, false);
            declareFunction("make_lexify_frame_link", "MAKE-LEXIFY-FRAME-LINK", 2, 1, false);
            declareFunction("cb_link_lexify_term", "CB-LINK-LEXIFY-TERM", 1, 2, false);
            declareFunction("cb_link_sme_lexify_term", "CB-LINK-SME-LEXIFY-TERM", 1, 1, false);
            declareFunction("cb_link_oe_lexify_term", "CB-LINK-OE-LEXIFY-TERM", 1, 1, false);
            declareFunction("lexify_term_with_id", "LEXIFY-TERM-WITH-ID", 0, 1, false);
            declareFunction("sme_lexify_term_with_id", "SME-LEXIFY-TERM-WITH-ID", 0, 1, false);
            declareFunction("oe_lexify_term_with_id", "OE-LEXIFY-TERM-WITH-ID", 0, 1, false);
            declareFunction("lexify_term_with_id_int", "LEXIFY-TERM-WITH-ID-INT", 0, 2, false);
            declareFunction("is_sme_lexwiz_preferredP", "IS-SME-LEXWIZ-PREFERRED?", 0, 1, false);
            declareFunction("invoke_preferred_lexification_wizard", "INVOKE-PREFERRED-LEXIFICATION-WIZARD", 0, 1, false);
            declareFunction("handle_preferred_lexification_wizard", "HANDLE-PREFERRED-LEXIFICATION-WIZARD", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("cb_invoke_sme_lexification_wizard", "CB-INVOKE-SME-LEXIFICATION-WIZARD", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_cb_lexification_reminders_file_Previous() {
        declareFunction("summarize_lex_todo", "SUMMARIZE-LEX-TODO", 1, 0, false);
        declareFunction("display_lex_todo", "DISPLAY-LEX-TODO", 1, 0, false);
        declareFunction("handle_lex_todo", "HANDLE-LEX-TODO", 1, 0, false);
        declareFunction("make_lexify_frame_link", "MAKE-LEXIFY-FRAME-LINK", 2, 1, false);
        declareFunction("cb_link_lexify_term", "CB-LINK-LEXIFY-TERM", 1, 2, false);
        declareFunction("cb_link_sme_lexify_term", "CB-LINK-SME-LEXIFY-TERM", 1, 1, false);
        declareFunction("cb_link_oe_lexify_term", "CB-LINK-OE-LEXIFY-TERM", 1, 1, false);
        declareFunction("lexify_term_with_id", "LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction("sme_lexify_term_with_id", "SME-LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction("oe_lexify_term_with_id", "OE-LEXIFY-TERM-WITH-ID", 0, 1, false);
        declareFunction("lexify_term_with_id_int", "LEXIFY-TERM-WITH-ID-INT", 0, 2, false);
        declareFunction("is_sme_lexwiz_preferredP", "IS-SME-LEXWIZ-PREFERRED?", 0, 1, false);
        declareFunction("invoke_preferred_lexification_wizard", "INVOKE-PREFERRED-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("handle_preferred_lexification_wizard", "HANDLE-PREFERRED-LEXIFICATION-WIZARD", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeKeyword("SUMMARY-FN"), makeSymbol("SUMMARIZE-LEX-TODO"), makeKeyword("DISPLAY-FN"), makeSymbol("DISPLAY-LEX-TODO"), makeKeyword("HANDLER-FN"), makeSymbol("HANDLE-LEX-TODO"));

    static private final SubLString $str_alt3$Perform_lexification_for_ = makeString("Perform lexification for ");

    public static final SubLObject init_cb_lexification_reminders_file_alt() {
        defvar("*USE-SME-LEXWIZ*", T);
        return NIL;
    }

    public static SubLObject init_cb_lexification_reminders_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*LEXIFY-LINK-TEXT*", $str7$_Lexify_);
        }
        if (SubLFiles.USE_V2) {
            defvar("*USE-SME-LEXWIZ*", T);
        }
        return NIL;
    }

    public static SubLObject init_cb_lexification_reminders_file_Previous() {
        defconstant("*LEXIFY-LINK-TEXT*", $str7$_Lexify_);
        return NIL;
    }

    static private final SubLString $str_alt6$_Lexify_ = makeString("[Lexify]");

    public static final SubLObject setup_cb_lexification_reminders_file_alt() {
        register_html_state_variable($use_sme_lexwiz$);
        register_html_interface_variable($use_sme_lexwiz$);
        {
            SubLObject new_action_type = user_actions.make_action_type($list_alt1);
            user_actions._csetf_action_type_key(new_action_type, $LEXIFICATION_NEEDED);
            sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        }
        note_html_handler_function(DISPLAY_LEX_TODO);
        note_html_handler_function(HANDLE_LEX_TODO);
        setup_cb_link_method($LEXIFY_TERM, CB_LINK_LEXIFY_TERM, THREE_INTEGER);
        setup_cb_link_method($SME_LEXIFY_TERM, CB_LINK_SME_LEXIFY_TERM, TWO_INTEGER);
        note_html_handler_function(LEXIFY_TERM_WITH_ID);
        note_html_handler_function(SME_LEXIFY_TERM_WITH_ID);
        return NIL;
    }

    public static SubLObject setup_cb_lexification_reminders_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_html_state_variable($use_sme_lexwiz$);
            register_html_interface_variable($use_sme_lexwiz$);
            {
                SubLObject new_action_type = user_actions.make_action_type($list_alt1);
                user_actions._csetf_action_type_key(new_action_type, $LEXIFICATION_NEEDED);
                sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
            }
            note_html_handler_function(DISPLAY_LEX_TODO);
            note_html_handler_function(HANDLE_LEX_TODO);
            note_html_handler_function(LEXIFY_TERM_WITH_ID);
            note_html_handler_function(SME_LEXIFY_TERM_WITH_ID);
        }
        return NIL;
    }

    public static SubLObject setup_cb_lexification_reminders_file_Previous() {
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

    static private final SubLString $str_alt8$lexify_term_with_id__A = makeString("lexify-term-with-id&~A");

    static private final SubLString $str_alt11$sme_lexify_term_with_id__A = makeString("sme-lexify-term-with-id&~A");

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

    static {
    }
}

/**
 * Total time: 154 ms
 */
