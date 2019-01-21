package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_lexification_reminders extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cb_lexification_reminders";
    public static final String myFingerPrint = "a1a9b012a81254261726eb57e3e1b0f06750d48f4412b215694bee65507f5bc3";
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 3480L)
    public static SubLSymbol $lexify_link_text$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$LEXIFICATION_NEEDED;
    private static final SubLString $str2$Perform_lexification_for_;
    private static final SubLSymbol $sym3$_EXIT;
    private static final SubLSymbol $sym4$DISPLAY_LEX_TODO;
    private static final SubLSymbol $kw5$HTML_HANDLER;
    private static final SubLSymbol $sym6$HANDLE_LEX_TODO;
    private static final SubLString $str7$_Lexify_;
    private static final SubLSymbol $kw8$MAIN;
    private static final SubLString $str9$_A__A;
    private static final SubLString $str10$lexify_term_with_id;
    private static final SubLSymbol $kw11$LEXIFY_TERM;
    private static final SubLSymbol $sym12$CB_LINK_LEXIFY_TERM;
    private static final SubLString $str13$sme_lexify_term_with_id;
    private static final SubLSymbol $kw14$SME_LEXIFY_TERM;
    private static final SubLSymbol $sym15$CB_LINK_SME_LEXIFY_TERM;
    private static final SubLString $str16$oe_lexify_term_with_id;
    private static final SubLSymbol $kw17$OE_LEXIFY_TERM;
    private static final SubLSymbol $sym18$CB_LINK_OE_LEXIFY_TERM;
    private static final SubLSymbol $sym19$LEXIFY_TERM_WITH_ID;
    private static final SubLSymbol $sym20$SME_LEXIFY_TERM_WITH_ID;
    private static final SubLSymbol $sym21$OE_LEXIFY_TERM_WITH_ID;
    private static final SubLString $str22$Warning__;
    private static final SubLString $str23$____assertion_failed___a______;
    private static final SubLSymbol $sym24$_LEXWIZ_DEFAULTS_;
    private static final SubLString $str25$;
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 1984L)
    public static SubLObject summarize_lex_todo(final SubLObject user_action_id_string) {
        final SubLObject user_action = user_actions.user_action_by_id_string(user_action_id_string);
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject cyc_term = user_data.isList() ? user_data.first() : user_data;
        html_utilities.html_princ((SubLObject)cb_lexification_reminders.$str2$Perform_lexification_for_);
        cb_utilities.cb_form(cyc_term, (SubLObject)cb_lexification_reminders.UNPROVIDED, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        return (SubLObject)cb_lexification_reminders.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 2457L)
    public static SubLObject display_lex_todo(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id_string = args.first();
        final SubLObject user_action = user_actions.user_action_by_id_string(id_string);
        final SubLObject user_data = user_actions.user_action_data(user_action);
        final SubLObject cyc_term = user_data.isList() ? user_data.first() : user_data;
        final SubLObject phrase = (SubLObject)(user_data.isList() ? conses_high.second(user_data) : cb_lexification_reminders.NIL);
        lexification_wizard.init_lexification_wizard((SubLObject)cb_lexification_reminders.UNPROVIDED);
        final SubLObject _prev_bind_0 = lexification_wizard.$lexwiz_defaults$.currentBinding(thread);
        try {
            lexification_wizard.$lexwiz_defaults$.bind(lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)), thread);
            lexification_wizard._csetf_lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), lexification_utilities.string_for_fort(cyc_term));
            lexification_wizard._csetf_lexwiz_phrase(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), phrase);
            lexification_wizard._csetf_lexwiz_user_action(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), user_action);
            return invoke_preferred_lexification_wizard((SubLObject)cb_lexification_reminders.UNPROVIDED);
        }
        finally {
            lexification_wizard.$lexwiz_defaults$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 3296L)
    public static SubLObject handle_lex_todo(final SubLObject args) {
        return handle_preferred_lexification_wizard(args, (SubLObject)cb_lexification_reminders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 3993L)
    public static SubLObject make_lexify_frame_link(final SubLObject link_label, final SubLObject v_term, SubLObject link_text) {
        if (link_text == cb_lexification_reminders.UNPROVIDED) {
            link_text = (SubLObject)cb_lexification_reminders.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort_id = cb_utilities.cb_fort_identifier(v_term);
        final SubLObject term_label = (cb_lexification_reminders.NIL != fort_id) ? fort_id : v_term;
        final SubLObject frame_name_var = cb_utilities.cb_frame_name((SubLObject)cb_lexification_reminders.$kw8$MAIN);
        html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        cb_parameters.cyc_cgi_url_int();
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)cb_lexification_reminders.$str9$_A__A, link_label, term_label);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        if (cb_lexification_reminders.NIL != frame_name_var) {
            html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_reminders.UNPROVIDED);
            html_utilities.html_markup(frame_name_var);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        }
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)cb_lexification_reminders.T, thread);
            html_utilities.html_princ((cb_lexification_reminders.NIL != link_text) ? link_text : cb_lexification_reminders.$lexify_link_text$.getGlobalValue());
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return (SubLObject)cb_lexification_reminders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 4472L)
    public static SubLObject cb_link_lexify_term(final SubLObject v_term, SubLObject link_text, SubLObject include_bugzilla_linkP) {
        if (link_text == cb_lexification_reminders.UNPROVIDED) {
            link_text = cb_lexification_reminders.$lexify_link_text$.getGlobalValue();
        }
        if (include_bugzilla_linkP == cb_lexification_reminders.UNPROVIDED) {
            include_bugzilla_linkP = (SubLObject)cb_lexification_reminders.NIL;
        }
        make_lexify_frame_link((SubLObject)cb_lexification_reminders.$str10$lexify_term_with_id, v_term, link_text);
        if (cb_lexification_reminders.NIL != include_bugzilla_linkP) {}
        return (SubLObject)cb_lexification_reminders.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 5192L)
    public static SubLObject cb_link_sme_lexify_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == cb_lexification_reminders.UNPROVIDED) {
            linktext = cb_lexification_reminders.$lexify_link_text$.getGlobalValue();
        }
        return make_lexify_frame_link((SubLObject)cb_lexification_reminders.$str13$sme_lexify_term_with_id, v_term, linktext);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 5526L)
    public static SubLObject cb_link_oe_lexify_term(final SubLObject v_term, SubLObject linktext) {
        if (linktext == cb_lexification_reminders.UNPROVIDED) {
            linktext = cb_lexification_reminders.$lexify_link_text$.getGlobalValue();
        }
        return make_lexify_frame_link((SubLObject)cb_lexification_reminders.$str16$oe_lexify_term_with_id, v_term, linktext);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 5838L)
    public static SubLObject lexify_term_with_id(SubLObject args) {
        if (args == cb_lexification_reminders.UNPROVIDED) {
            args = (SubLObject)cb_lexification_reminders.NIL;
        }
        return lexify_term_with_id_int(args, (SubLObject)cb_lexification_reminders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 6177L)
    public static SubLObject sme_lexify_term_with_id(SubLObject args) {
        if (args == cb_lexification_reminders.UNPROVIDED) {
            args = (SubLObject)cb_lexification_reminders.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_vars.$use_sme_lexwiz$.currentBinding(thread);
        try {
            lexicon_vars.$use_sme_lexwiz$.bind((SubLObject)cb_lexification_reminders.T, thread);
            return lexify_term_with_id_int(args, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        }
        finally {
            lexicon_vars.$use_sme_lexwiz$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 6534L)
    public static SubLObject oe_lexify_term_with_id(SubLObject args) {
        if (args == cb_lexification_reminders.UNPROVIDED) {
            args = (SubLObject)cb_lexification_reminders.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = lexicon_vars.$use_sme_lexwiz$.currentBinding(thread);
        try {
            lexicon_vars.$use_sme_lexwiz$.bind((SubLObject)cb_lexification_reminders.NIL, thread);
            return lexify_term_with_id_int(args, (SubLObject)cb_lexification_reminders.UNPROVIDED);
        }
        finally {
            lexicon_vars.$use_sme_lexwiz$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 6887L)
    public static SubLObject lexify_term_with_id_int(SubLObject args, SubLObject use_sme_lexwizP) {
        if (args == cb_lexification_reminders.UNPROVIDED) {
            args = (SubLObject)cb_lexification_reminders.NIL;
        }
        if (use_sme_lexwizP == cb_lexification_reminders.UNPROVIDED) {
            use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject id = args.first();
        SubLObject v_object = lexification_wizard.get_lexification_object(id);
        lexification_wizard.init_lexification_wizard((SubLObject)cb_lexification_reminders.UNPROVIDED);
        if (cb_lexification_reminders.NIL == v_object) {
            if (cb_lexification_reminders.NIL == lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)cb_lexification_reminders.$str22$Warning__, (SubLObject)cb_lexification_reminders.$str23$____assertion_failed___a______), (SubLObject)cb_lexification_reminders.$sym24$_LEXWIZ_DEFAULTS_);
                streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            final SubLObject fort = cb_utilities.cb_guess_fort(id, (SubLObject)cb_lexification_reminders.UNPROVIDED);
            v_object = lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
            lexification_wizard._csetf_lexwiz_term(v_object, lexification_utilities.string_for_fort(fort));
            lexification_wizard._csetf_lexwiz_phrase(v_object, (SubLObject)((cb_lexification_reminders.NIL != fort) ? lexification_utilities.phrase_from_term(fort, (SubLObject)cb_lexification_reminders.UNPROVIDED) : cb_lexification_reminders.$str25$));
        }
        lexification_wizard.trace_lexification_parameters(v_object, lexification_utilities.$lex_very_verbose$.getGlobalValue());
        final SubLObject _prev_bind_0 = lexification_wizard.$lexwiz_defaults$.currentBinding(thread);
        try {
            lexification_wizard.$lexwiz_defaults$.bind(lexification_wizard.copy_lexification_parameters(v_object), thread);
            return invoke_preferred_lexification_wizard(use_sme_lexwizP);
        }
        finally {
            lexification_wizard.$lexwiz_defaults$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 8032L)
    public static SubLObject is_sme_lexwiz_preferredP(SubLObject default_use_sme_lexwizP) {
        if (default_use_sme_lexwizP == cb_lexification_reminders.UNPROVIDED) {
            default_use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject use_sme_lexwizP = default_use_sme_lexwizP;
        final SubLObject fort = misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_term(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread)));
        if (cb_lexification_reminders.NIL == use_sme_lexwizP && cb_lexification_reminders.NIL != lexification_utilities.is_relationalP(fort) && cb_lexification_reminders.NIL == lexification_wizard.$allow_advanced_lexwiz_featuresP$.getDynamicValue(thread)) {
            use_sme_lexwizP = (SubLObject)cb_lexification_reminders.T;
        }
        return use_sme_lexwizP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 8916L)
    public static SubLObject invoke_preferred_lexification_wizard(SubLObject use_sme_lexwizP) {
        if (use_sme_lexwizP == cb_lexification_reminders.UNPROVIDED) {
            use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        lexification_wizard.trace_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread), lexification_utilities.$lex_very_verbose$.getGlobalValue());
        return (cb_lexification_reminders.NIL != is_sme_lexwiz_preferredP(use_sme_lexwizP)) ? cb_sme_lexification_wizard.cb_invoke_sme_lexification_wizard((SubLObject)cb_lexification_reminders.UNPROVIDED) : cb_lexification_wizard.cb_invoke_oe_lexification_wizard((SubLObject)cb_lexification_reminders.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cb-lexification-reminders.lisp", position = 9412L)
    public static SubLObject handle_preferred_lexification_wizard(final SubLObject args, SubLObject use_sme_lexwizP) {
        if (use_sme_lexwizP == cb_lexification_reminders.UNPROVIDED) {
            use_sme_lexwizP = lexicon_vars.$use_sme_lexwiz$.getDynamicValue();
        }
        return (cb_lexification_reminders.NIL != is_sme_lexwiz_preferredP(use_sme_lexwizP)) ? cb_sme_lexification_wizard.cb_handle_sme_lexification_wizard(args) : cb_lexification_wizard.cb_handle_oe_lexification_wizard(args);
    }
    
    public static SubLObject declare_cb_lexification_reminders_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "summarize_lex_todo", "SUMMARIZE-LEX-TODO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "display_lex_todo", "DISPLAY-LEX-TODO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "handle_lex_todo", "HANDLE-LEX-TODO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "make_lexify_frame_link", "MAKE-LEXIFY-FRAME-LINK", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "cb_link_lexify_term", "CB-LINK-LEXIFY-TERM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "cb_link_sme_lexify_term", "CB-LINK-SME-LEXIFY-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "cb_link_oe_lexify_term", "CB-LINK-OE-LEXIFY-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "lexify_term_with_id", "LEXIFY-TERM-WITH-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "sme_lexify_term_with_id", "SME-LEXIFY-TERM-WITH-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "oe_lexify_term_with_id", "OE-LEXIFY-TERM-WITH-ID", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "lexify_term_with_id_int", "LEXIFY-TERM-WITH-ID-INT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "is_sme_lexwiz_preferredP", "IS-SME-LEXWIZ-PREFERRED?", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "invoke_preferred_lexification_wizard", "INVOKE-PREFERRED-LEXIFICATION-WIZARD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cb_lexification_reminders", "handle_preferred_lexification_wizard", "HANDLE-PREFERRED-LEXIFICATION-WIZARD", 1, 1, false);
        return (SubLObject)cb_lexification_reminders.NIL;
    }
    
    public static SubLObject init_cb_lexification_reminders_file() {
        cb_lexification_reminders.$lexify_link_text$ = SubLFiles.defconstant("*LEXIFY-LINK-TEXT*", (SubLObject)cb_lexification_reminders.$str7$_Lexify_);
        return (SubLObject)cb_lexification_reminders.NIL;
    }
    
    public static SubLObject setup_cb_lexification_reminders_file() {
        final SubLObject new_action_type = user_actions.make_action_type((SubLObject)cb_lexification_reminders.$list0);
        user_actions._csetf_action_type_key(new_action_type, (SubLObject)cb_lexification_reminders.$kw1$LEXIFICATION_NEEDED);
        Hashtables.sethash(user_actions.action_type_key(new_action_type), user_actions.$action_types_by_key$.getDynamicValue(), new_action_type);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_reminders.$sym4$DISPLAY_LEX_TODO, (SubLObject)cb_lexification_reminders.$kw5$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_reminders.$sym6$HANDLE_LEX_TODO, (SubLObject)cb_lexification_reminders.$kw5$HTML_HANDLER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexification_reminders.$kw11$LEXIFY_TERM, (SubLObject)cb_lexification_reminders.$sym12$CB_LINK_LEXIFY_TERM, (SubLObject)cb_lexification_reminders.THREE_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexification_reminders.$kw14$SME_LEXIFY_TERM, (SubLObject)cb_lexification_reminders.$sym15$CB_LINK_SME_LEXIFY_TERM, (SubLObject)cb_lexification_reminders.TWO_INTEGER);
        cb_utilities.setup_cb_link_method((SubLObject)cb_lexification_reminders.$kw17$OE_LEXIFY_TERM, (SubLObject)cb_lexification_reminders.$sym18$CB_LINK_OE_LEXIFY_TERM, (SubLObject)cb_lexification_reminders.TWO_INTEGER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_reminders.$sym19$LEXIFY_TERM_WITH_ID, (SubLObject)cb_lexification_reminders.$kw5$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_reminders.$sym20$SME_LEXIFY_TERM_WITH_ID, (SubLObject)cb_lexification_reminders.$kw5$HTML_HANDLER);
        html_macros.note_cgi_handler_function((SubLObject)cb_lexification_reminders.$sym21$OE_LEXIFY_TERM_WITH_ID, (SubLObject)cb_lexification_reminders.$kw5$HTML_HANDLER);
        return (SubLObject)cb_lexification_reminders.NIL;
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
    
    static {
        me = (SubLFile)new cb_lexification_reminders();
        cb_lexification_reminders.$lexify_link_text$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUMMARY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SUMMARIZE-LEX-TODO"), (SubLObject)SubLObjectFactory.makeKeyword("DISPLAY-FN"), (SubLObject)SubLObjectFactory.makeSymbol("DISPLAY-LEX-TODO"), (SubLObject)SubLObjectFactory.makeKeyword("HANDLER-FN"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLE-LEX-TODO"));
        $kw1$LEXIFICATION_NEEDED = SubLObjectFactory.makeKeyword("LEXIFICATION-NEEDED");
        $str2$Perform_lexification_for_ = SubLObjectFactory.makeString("Perform lexification for ");
        $sym3$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym4$DISPLAY_LEX_TODO = SubLObjectFactory.makeSymbol("DISPLAY-LEX-TODO");
        $kw5$HTML_HANDLER = SubLObjectFactory.makeKeyword("HTML-HANDLER");
        $sym6$HANDLE_LEX_TODO = SubLObjectFactory.makeSymbol("HANDLE-LEX-TODO");
        $str7$_Lexify_ = SubLObjectFactory.makeString("[Lexify]");
        $kw8$MAIN = SubLObjectFactory.makeKeyword("MAIN");
        $str9$_A__A = SubLObjectFactory.makeString("~A&~A");
        $str10$lexify_term_with_id = SubLObjectFactory.makeString("lexify-term-with-id");
        $kw11$LEXIFY_TERM = SubLObjectFactory.makeKeyword("LEXIFY-TERM");
        $sym12$CB_LINK_LEXIFY_TERM = SubLObjectFactory.makeSymbol("CB-LINK-LEXIFY-TERM");
        $str13$sme_lexify_term_with_id = SubLObjectFactory.makeString("sme-lexify-term-with-id");
        $kw14$SME_LEXIFY_TERM = SubLObjectFactory.makeKeyword("SME-LEXIFY-TERM");
        $sym15$CB_LINK_SME_LEXIFY_TERM = SubLObjectFactory.makeSymbol("CB-LINK-SME-LEXIFY-TERM");
        $str16$oe_lexify_term_with_id = SubLObjectFactory.makeString("oe-lexify-term-with-id");
        $kw17$OE_LEXIFY_TERM = SubLObjectFactory.makeKeyword("OE-LEXIFY-TERM");
        $sym18$CB_LINK_OE_LEXIFY_TERM = SubLObjectFactory.makeSymbol("CB-LINK-OE-LEXIFY-TERM");
        $sym19$LEXIFY_TERM_WITH_ID = SubLObjectFactory.makeSymbol("LEXIFY-TERM-WITH-ID");
        $sym20$SME_LEXIFY_TERM_WITH_ID = SubLObjectFactory.makeSymbol("SME-LEXIFY-TERM-WITH-ID");
        $sym21$OE_LEXIFY_TERM_WITH_ID = SubLObjectFactory.makeSymbol("OE-LEXIFY-TERM-WITH-ID");
        $str22$Warning__ = SubLObjectFactory.makeString("Warning: ");
        $str23$____assertion_failed___a______ = SubLObjectFactory.makeString("*** assertion failed: ~a ***~%");
        $sym24$_LEXWIZ_DEFAULTS_ = SubLObjectFactory.makeSymbol("*LEXWIZ-DEFAULTS*");
        $str25$ = SubLObjectFactory.makeString("");
    }
}

/*

	Total time: 154 ms
	
*/