/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CB-UIAT-LEXIFICATION-WIZARD
 *  source file: /cyc/top/cycl/cb-uiat-lexification-wizard.lisp
 *  created:     2019/07/03 17:38:23
 */
public final class cb_uiat_lexification_wizard extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cb_uiat_lexification_wizard() {
    }

    public static final SubLFile me = new cb_uiat_lexification_wizard();


    // // Definitions
    /**
     * Launch the lexification wizard, optionally to lexify the fort given as the first value of ARGS
     */
    public static final SubLObject cb_uia_launch_lexification_wizard(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            uia_act_new_lexification_wizard(v_agenda, args.first(), UNPROVIDED, UNPROVIDED);
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_uiat_lexification_wizard_guts(SubLObject args) {
        {
            SubLObject v_agenda = cb_user_interaction_agenda.cb_current_uia();
            SubLObject datum = cb_user_interaction_agenda.cb_uia_html_decode_args(cb_user_interaction_agenda.cb_current_uia(), args);
            SubLObject current = datum;
            SubLObject v_term = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            v_term = current.first();
            current = current.rest();
            if (NIL == current) {
                uia_act_new_lexification_wizard(v_agenda, v_term, $REQUIRED, UNPROVIDED);
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
            return cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
        }
    }

    public static final SubLObject cb_link_uia_lexification_wizard_guts(SubLObject v_term, SubLObject linktext) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject frame_name_var = cb_utilities.cb_frame_name($UIA_INTERACTION);
                html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                cb_parameters.cyc_cgi_url_int();
                {
                    SubLObject arglist = list(v_term);
                    cb_uia_macros.macro_helper_cb_uia_html_print_encoded_args($str_alt8$cb_uiat_lexification_wizard_guts, arglist);
                }
                html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                if (NIL != frame_name_var) {
                    html_utilities.html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                    html_utilities.html_markup(frame_name_var);
                    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
                }
                html_utilities.html_char(CHAR_greater, UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_uia_display_primitives.cb_uia_princ_tool_linktext(linktext);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                }
                html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_uia_html_question_answering_agent_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_uia_html_question_answering_agent_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        return NIL;
    }

    public static final SubLObject uia_html_question_answering_agent_p(SubLObject uia_html_question_answering_agent) {
        return classes.subloop_instanceof_class(uia_html_question_answering_agent, UIA_HTML_QUESTION_ANSWERING_AGENT);
    }

    public static final SubLObject uia_html_question_answering_agent_display_question_preamble_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_uia_html_question_answering_agent_method = NIL;
                SubLObject proxy = sme_lexification_wizard.get_question_answering_agent_proxy(self);
                SubLObject title = sme_lexification_wizard.get_question_answering_agent_title(self);
                try {
                    try {
                        {
                            SubLObject interaction = methods.funcall_instance_method_with_0_args(proxy, GET_INTERACTION);
                            cb_user_interaction_agenda.cb_uia_show_interaction_preamble(interaction);
                            cb_user_interaction_agenda.cb_uia_show_title_line(user_interaction_agenda.ui_operator(interaction));
                            html_utilities.html_newline(ONE_INTEGER);
                            if (NIL != cb_sme_lexification_wizard.$sme_lexwiz_verboseP$.getDynamicValue(thread)) {
                                html_utilities.html_princ(title);
                                html_utilities.html_newline(THREE_INTEGER);
                            }
                            sublisp_throw($sym39$OUTER_CATCH_FOR_UIA_HTML_QUESTION_ANSWERING_AGENT_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                sme_lexification_wizard.set_question_answering_agent_proxy(self, proxy);
                                sme_lexification_wizard.set_question_answering_agent_title(self, title);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_uia_html_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_UIA_HTML_QUESTION_ANSWERING_AGENT_METHOD);
                }
                return catch_var_for_uia_html_question_answering_agent_method;
            }
        }
    }

    public static final SubLObject uia_html_question_answering_agent_display_question_trailer_method(SubLObject self) {
        return NIL;
    }

    /**
     * Displays lexwiz hint optionally showing term to be lexified
     */
    public static final SubLObject uiat_lexification_wizard_hint(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject sme_lexwiz = user_interaction_agenda.ui_state_lookup(interaction, $SME_LEXWIZ, UNPROVIDED);
            SubLObject v_term = sme_lexification_wizard_accessors.get_sme_lexwiz_term(sme_lexwiz);
            if (NIL != v_term) {
                return cconcatenate($str_alt46$Lexify___, uia_trampolines.uia_term_phrase(v_agenda, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            if (NIL != args) {
                {
                    SubLObject datum = args;
                    SubLObject current = datum;
                    SubLObject fort = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    fort = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return cconcatenate($str_alt46$Lexify___, uia_trampolines.uia_term_phrase(v_agenda, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    } else {
                        cdestructuring_bind_error(datum, $list_alt47);
                    }
                }
            }
            return $$$Lexify;
        }
    }

    /**
     * Initiate the dialog for the lexification of term from current interaction
     */
    public static final SubLObject cb_uiat_lexification_wizard_display(SubLObject interaction) {
        {
            SubLObject sme_lexwiz = user_interaction_agenda.ui_state_lookup(interaction, $SME_LEXWIZ, UNPROVIDED);
            if (NIL == sme_lexwiz) {
                {
                    SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
                    sme_lexwiz = uia_new_lexification_wizard(v_agenda, interaction);
                    user_interaction_agenda.ui_state_update(interaction, $SME_LEXWIZ, sme_lexwiz);
                }
            }
            return sme_lexification_wizard_accessors.start_sme_lexwiz(sme_lexwiz, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Creates a new interaction for a session with the SME lexwiz, optionally to lexify FORT
     *
     * @unknown The appropriate MT's to use are derived from the agenda interaction context.
     */
    public static final SubLObject uia_act_new_lexification_wizard(SubLObject v_agenda, SubLObject fort, SubLObject mode, SubLObject phrase) {
        if (fort == UNPROVIDED) {
            fort = NIL;
        }
        if (mode == UNPROVIDED) {
            mode = $REQUIRED;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        {
            SubLObject args = (NIL != fort) ? ((SubLObject) (list(fort, phrase))) : NIL;
            SubLObject interaction = user_interaction_agenda.uia_act_new_interaction(v_agenda, mode, $LEXIFICATION_WIZARD, args, UNPROVIDED);
            SubLObject sme_lexwiz = uia_new_lexification_wizard(v_agenda, interaction);
            user_interaction_agenda.ui_state_update(interaction, $SME_LEXWIZ, sme_lexwiz);
            return interaction;
        }
    }

    /**
     *
     *
     * @return sme-lexification-wizard : new instances of lexwiz for UIA use
     */
    public static final SubLObject uia_new_lexification_wizard(SubLObject v_agenda, SubLObject interaction) {
        sme_lexification_wizard_accessors.init_sme_lexwiz();
        {
            SubLObject sme_lexwiz = sme_lexification_wizard_accessors.create_new_uia_sme_lexwiz(interaction);
            SubLObject v_term = sme_lexification_wizard_accessors.get_sme_lexwiz_term(sme_lexwiz);
            SubLObject lexification_mt = uia_get_lexification_mt(v_agenda, v_term);
            sme_lexification_wizard_accessors.set_sme_lexwiz_mt(sme_lexwiz, lexification_mt);
            sme_lexification_wizard_accessors.set_sme_lexwiz_lexical_mt(sme_lexwiz, user_interaction_agenda.uia_lexical_interaction_mt(v_agenda));
            sme_lexification_wizard_accessors.set_sme_lexwiz_generation_mt(sme_lexwiz, user_interaction_agenda.uia_generation_language_mt(v_agenda));
            sme_lexification_wizard_accessors.set_sme_lexwiz_parsing_mt(sme_lexwiz, user_interaction_agenda.uia_parsing_interaction_mt(v_agenda));
            return sme_lexwiz;
        }
    }

    /**
     * Determines the temporary lexification MT to use for FORT in the context of AGENDA
     */
    public static final SubLObject uia_get_lexification_mt(SubLObject v_agenda, SubLObject fort) {
        return NIL != lexification_utilities.is_relationalP(fort) ? ((SubLObject) (user_interaction_agenda.uia_generation_language_mt(v_agenda))) : user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
    }

    /**
     * End the lexification session and return control to the agenda
     *
     * @unknown this is intended for use within the lexification wizard support code
     */
    public static final SubLObject cb_uiat_end_lexification_wizard(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            user_interaction_agenda.uia_act_complete(v_agenda, interaction, $DONE);
            cb_user_interaction_agenda.cb_uia_show_next_interaction(v_agenda);
            return NIL;
        }
    }

    /**
     * Return the MT to be used for term dependencies for INTERACTION
     */
    public static final SubLObject cb_uiat_get_lexification_interaction_mt(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject mt = (NIL != v_agenda) ? ((SubLObject) (user_interaction_agenda.uia_domain_interaction_mt(v_agenda))) : NIL;
            return mt;
        }
    }

    /**
     * Return the MT to be used for lexical term dependencies for INTERACTION
     */
    public static final SubLObject cb_uiat_get_lexical_interaction_mt(SubLObject interaction) {
        {
            SubLObject v_agenda = user_interaction_agenda.ui_agenda(interaction);
            SubLObject mt = (NIL != v_agenda) ? ((SubLObject) (user_interaction_agenda.uia_lexical_interaction_mt(v_agenda))) : NIL;
            return mt;
        }
    }

    public static final SubLObject declare_cb_uiat_lexification_wizard_file() {
        declareFunction("cb_uia_launch_lexification_wizard", "CB-UIA-LAUNCH-LEXIFICATION-WIZARD", 0, 1, false);
        declareFunction("cb_uiat_lexification_wizard_guts", "CB-UIAT-LEXIFICATION-WIZARD-GUTS", 1, 0, false);
        declareFunction("cb_link_uia_lexification_wizard_guts", "CB-LINK-UIA-LEXIFICATION-WIZARD-GUTS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_uia_html_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-UIA-HTML-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_uia_html_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-UIA-HTML-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction("uia_html_question_answering_agent_p", "UIA-HTML-QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction("uia_html_question_answering_agent_display_question_preamble_method", "UIA-HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD", 1, 0, false);
        declareFunction("uia_html_question_answering_agent_display_question_trailer_method", "UIA-HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD", 1, 0, false);
        declareFunction("uiat_lexification_wizard_hint", "UIAT-LEXIFICATION-WIZARD-HINT", 1, 0, false);
        declareFunction("cb_uiat_lexification_wizard_display", "CB-UIAT-LEXIFICATION-WIZARD-DISPLAY", 1, 0, false);
        declareFunction("uia_act_new_lexification_wizard", "UIA-ACT-NEW-LEXIFICATION-WIZARD", 1, 3, false);
        declareFunction("uia_new_lexification_wizard", "UIA-NEW-LEXIFICATION-WIZARD", 2, 0, false);
        declareFunction("uia_get_lexification_mt", "UIA-GET-LEXIFICATION-MT", 2, 0, false);
        declareFunction("cb_uiat_end_lexification_wizard", "CB-UIAT-END-LEXIFICATION-WIZARD", 1, 0, false);
        declareFunction("cb_uiat_get_lexification_interaction_mt", "CB-UIAT-GET-LEXIFICATION-INTERACTION-MT", 1, 0, false);
        declareFunction("cb_uiat_get_lexical_interaction_mt", "CB-UIAT-GET-LEXICAL-INTERACTION-MT", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_uiat_lexification_wizard_file() {
        return NIL;
    }

    public static final SubLObject setup_cb_uiat_lexification_wizard_file() {
                html_macros.note_html_handler_function(CB_UIA_LAUNCH_LEXIFICATION_WIZARD);
        uia_tool_declaration.declare_uia_tool($LEXIFICATION_WIZARD, $list_alt2);
        cb_uia_tool_declaration.declare_cb_uia_tool($LEXIFICATION_WIZARD, $list_alt3);
        html_macros.note_html_handler_function(CB_UIAT_LEXIFICATION_WIZARD_GUTS);
        cb_utilities.setup_cb_link_method($UIA_LEXIFICATION_WIZARD_GUTS, CB_LINK_UIA_LEXIFICATION_WIZARD_GUTS, TWO_INTEGER);
        classes.subloop_new_class(UIA_HTML_QUESTION_ANSWERING_AGENT, HTML_QUESTION_ANSWERING_AGENT, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(UIA_HTML_QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(UIA_HTML_QUESTION_ANSWERING_AGENT, $sym15$SUBLOOP_RESERVED_INITIALIZE_UIA_HTML_QUESTION_ANSWERING_AGENT_CLA);
        classes.subloop_note_instance_initialization_function(UIA_HTML_QUESTION_ANSWERING_AGENT, $sym35$SUBLOOP_RESERVED_INITIALIZE_UIA_HTML_QUESTION_ANSWERING_AGENT_INS);
        subloop_reserved_initialize_uia_html_question_answering_agent_class(UIA_HTML_QUESTION_ANSWERING_AGENT);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_PREAMBLE, UIA_HTML_QUESTION_ANSWERING_AGENT, $list_alt37, NIL, $list_alt38);
        methods.subloop_register_instance_method(UIA_HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_PREAMBLE, $sym41$UIA_HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHO);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION_TRAILER, UIA_HTML_QUESTION_ANSWERING_AGENT, $list_alt37, NIL, $list_alt43);
        methods.subloop_register_instance_method(UIA_HTML_QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION_TRAILER, UIA_HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CB_UIA_LAUNCH_LEXIFICATION_WIZARD = makeSymbol("CB-UIA-LAUNCH-LEXIFICATION-WIZARD");



    static private final SubLList $list_alt2 = list($NAME, makeString("Dictionary Assistant"), makeKeyword("HINT-METHOD"), makeSymbol("UIAT-LEXIFICATION-WIZARD-HINT"));

    static private final SubLList $list_alt3 = list(makeKeyword("DISPLAY-METHOD"), makeSymbol("CB-UIAT-LEXIFICATION-WIZARD-DISPLAY"));

    static private final SubLList $list_alt4 = list(makeSymbol("TERM"));



    private static final SubLSymbol CB_UIAT_LEXIFICATION_WIZARD_GUTS = makeSymbol("CB-UIAT-LEXIFICATION-WIZARD-GUTS");

    private static final SubLSymbol $UIA_INTERACTION = makeKeyword("UIA-INTERACTION");

    static private final SubLString $str_alt8$cb_uiat_lexification_wizard_guts = makeString("cb-uiat-lexification-wizard-guts");

    private static final SubLSymbol $UIA_LEXIFICATION_WIZARD_GUTS = makeKeyword("UIA-LEXIFICATION-WIZARD-GUTS");

    private static final SubLSymbol CB_LINK_UIA_LEXIFICATION_WIZARD_GUTS = makeSymbol("CB-LINK-UIA-LEXIFICATION-WIZARD-GUTS");

    private static final SubLSymbol UIA_HTML_QUESTION_ANSWERING_AGENT = makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT = makeSymbol("HTML-QUESTION-ANSWERING-AGENT");





    static private final SubLSymbol $sym15$SUBLOOP_RESERVED_INITIALIZE_UIA_HTML_QUESTION_ANSWERING_AGENT_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UIA-HTML-QUESTION-ANSWERING-AGENT-CLASS");





    private static final SubLSymbol QUESTION_ANSWERING_AGENT = makeSymbol("QUESTION-ANSWERING-AGENT");

































    static private final SubLSymbol $sym35$SUBLOOP_RESERVED_INITIALIZE_UIA_HTML_QUESTION_ANSWERING_AGENT_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UIA-HTML-QUESTION-ANSWERING-AGENT-INSTANCE");

    private static final SubLSymbol DISPLAY_QUESTION_PREAMBLE = makeSymbol("DISPLAY-QUESTION-PREAMBLE");

    static private final SubLList $list_alt37 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-UIA"), list(makeSymbol("CLET"), list(list(makeSymbol("INTERACTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(QUOTE, makeSymbol("GET-INTERACTION"))))), list(makeSymbol("CB-UIA-SHOW-INTERACTION-PREAMBLE"), makeSymbol("INTERACTION")), list(makeSymbol("CB-UIA-SHOW-TITLE-LINE"), list(makeSymbol("UI-OPERATOR"), makeSymbol("INTERACTION"))), list(makeSymbol("HTML-NEWLINE"), ONE_INTEGER), list(makeSymbol("PWHEN"), makeSymbol("*SME-LEXWIZ-VERBOSE?*"), list(makeSymbol("HTML-PRINC"), makeSymbol("TITLE")), list(makeSymbol("HTML-NEWLINE"), THREE_INTEGER)))), list(RET, NIL));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_UIA_HTML_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-UIA-HTML-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol GET_INTERACTION = makeSymbol("GET-INTERACTION");

    static private final SubLSymbol $sym41$UIA_HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_PREAMBLE_METHO = makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-PREAMBLE-METHOD");

    private static final SubLSymbol DISPLAY_QUESTION_TRAILER = makeSymbol("DISPLAY-QUESTION-TRAILER");

    static private final SubLList $list_alt43 = list(list(RET, NIL));

    private static final SubLSymbol UIA_HTML_QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_TRAILER_METHOD = makeSymbol("UIA-HTML-QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-TRAILER-METHOD");



    static private final SubLString $str_alt46$Lexify___ = makeString("Lexify : ");

    static private final SubLList $list_alt47 = list(makeSymbol("FORT"));

    static private final SubLString $$$Lexify = makeString("Lexify");



    // // Initializers
    public void declareFunctions() {
        declare_cb_uiat_lexification_wizard_file();
    }

    public void initializeVariables() {
        init_cb_uiat_lexification_wizard_file();
    }

    public void runTopLevelForms() {
        setup_cb_uiat_lexification_wizard_file();
    }
}

